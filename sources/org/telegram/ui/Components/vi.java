package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.uj1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class vi extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.y2, ne.d {
    public static final /* synthetic */ int R2 = 0;
    public final LongSparseArray A0;
    public final xh A1;
    public double[] A2;
    public ni B0;
    public final yh B1;
    public boolean B2;
    public ni C0;
    public final s4.b0 C1;
    public boolean C2;
    public final dh.d D0;
    public final si D1;
    public boolean D2;
    public final i0 E;
    public final dh.d E0;
    public boolean E1;
    public di.i E2;
    public boolean F;
    public final ig.j F0;
    public final RadialProgressView F1;
    public final bh.f F2;
    public boolean G;
    public final xh G0;
    public boolean G1;
    public final gh.d G2;
    public boolean H;
    public final ai H0;
    public final s6 H1;
    public final gh.d H2;
    public int I;
    public final ImageView I0;
    public float I1;
    public final gh.c I2;
    public Utilities.Callback2 J;
    public final int[] J0;
    public int J1;
    public final bh.b J2;
    public int K;
    public final xh K0;
    public MessageObject K1;
    public final bh.b K2;
    public int L;
    public final fi L0;
    public boolean L1;
    public final lh L2;
    public boolean M;
    public final TextPaint M0;
    public final int M1;
    public final ArrayList M2;
    public boolean N;
    public final RectF N0;
    public boolean N1;
    public final RectF N2;
    public boolean O;
    public final Paint O0;
    public boolean O1;
    public final RectF O2;
    public boolean P;
    public AnimatorSet P0;
    public boolean P1;
    public final RectF P2;
    public g50 Q;
    public long Q0;
    public boolean Q1;
    public final ArrayList Q2;
    public boolean R;
    public final ah.v R0;
    public boolean R1;
    public final re0 S;
    public final di S0;
    public boolean S1;
    public jo T;
    public int T0;
    public boolean T1;
    public i50 U;
    public du U0;
    public boolean U1;
    public boolean V;
    public boolean V0;
    public int V1;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public gk X;
    public boolean X0;
    public boolean X1;
    public ej Y;
    public final float Y0;
    public float Y1;
    public long Z;
    public long Z0;
    public float Z1;
    public boolean a0;
    public final b8 a1;
    public ValueAnimator a2;
    public final ne.b b;
    public final bh.c b0;
    public AnimatorSet b1;
    public int b2;
    public final ne.b c;
    public boolean c0;
    public AnimatorSet c1;
    public ti c2;
    public final ne.b d;
    public float d0;
    public final org.telegram.ui.ActionBar.u0 d1;
    public sn d2;
    public final ne.b e;
    public final ji e0;
    public final di.u e1;
    public final int[] e2;
    public final ne.b f;
    public final org.telegram.ui.ActionBar.m2 f0;
    public final org.telegram.ui.ActionBar.u0 f1;
    public int f2;
    public final boolean g0;
    public di.d4 g1;
    public float g2;
    public final ne.b h;
    public of h0;
    public final org.telegram.ui.ActionBar.u0 h1;
    public float h2;
    public boolean i0;
    public final ci.n i1;
    public boolean i2;
    public final ChatAttachAlertPhotoLayout j0;
    public float j1;
    public float j2;
    public zj k0;
    public float k1;
    public final boolean k2;
    public hj l0;
    public final xh l1;
    public boolean l2;
    public io m0;
    public final TextView m1;
    public final ArrayList m2;
    public final ne.l n;
    public io n0;
    public final org.telegram.ui.ActionBar.u0 n1;
    public final Rect n2;
    public tl o0;
    public final LinearLayout o1;
    public float o2;
    public pk p0;
    public final ImageView p1;
    public boolean p2;
    public en q0;
    public final LinearLayout q1;
    public int q2;
    public org.telegram.ui.co r;
    public kj r0;
    public final TextView r1;
    public final ji r2;
    public final s6 s;
    public ig.i0 s0;
    public float s1;
    public o1.k s2;
    public qk t0;
    public boolean t1;
    public AnimatorSet t2;
    public qk u0;
    public final li u1;
    public boolean u2;
    public final s6 v;
    public ji.r v0;
    public boolean v1;
    public boolean v2;
    public final ImageView w;
    public cl w0;
    public Object w1;
    public ol w2;
    public final i0 x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public final ImageView y;
    public float y0;
    public final kh.f y1;
    public boolean y2;
    public final ni[] z0;
    public final zh z1;
    public File z2;

    public vi(Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        org.telegram.ui.ActionBar.u0 u0Var;
        ci.n nVar;
        int i10;
        float f7;
        b8 b8Var;
        es esVar = es.h;
        this.b = new ne.b(0, this, esVar, 380L, false);
        this.c = new ne.b(1, this, esVar, 380L, false);
        this.d = new ne.b(2, this, esVar, 380L, false);
        this.e = new ne.b(3, this, esVar, 380L, false);
        this.f = new ne.b(4, this, esVar, 380L, true);
        this.h = new ne.b(5, this, esVar, 320L, false);
        ne.l lVar = new ne.l(new eh(this, 2), esVar, 380L);
        this.n = lVar;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.d0 = 0.0f;
        this.e0 = new ji(this, 0);
        this.i0 = false;
        ni[] niVarArr = new ni[12];
        this.z0 = niVarArr;
        this.A0 = new LongSparseArray();
        this.J0 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.M0 = textPaint;
        this.N0 = new RectF();
        this.O0 = new Paint(1);
        this.X0 = true;
        this.Y0 = 1.0f;
        this.E1 = false;
        this.G1 = false;
        int i11 = UserConfig.selectedAccount;
        this.M1 = i11;
        this.N1 = true;
        this.O1 = true;
        this.P1 = true;
        this.Q1 = true;
        this.R1 = true;
        this.S1 = true;
        this.T1 = true;
        this.V1 = -1;
        this.W1 = true;
        this.b2 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.e2 = new int[2];
        new Paint(1);
        this.l2 = false;
        ArrayList arrayList = new ArrayList();
        this.m2 = arrayList;
        Rect rect = new Rect();
        this.n2 = rect;
        this.r2 = new ji(this, 1);
        this.u2 = true;
        this.v2 = false;
        this.C2 = false;
        this.D2 = false;
        ArrayList arrayList2 = new ArrayList();
        this.M2 = arrayList2;
        RectF rectF = new RectF();
        this.N2 = rectF;
        RectF rectF2 = new RectF();
        this.O2 = rectF2;
        RectF rectF3 = new RectF();
        this.P2 = rectF3;
        arrayList2.add(rectF);
        arrayList2.add(rectF2);
        arrayList2.add(rectF3);
        this.Q2 = new ArrayList();
        this.occupyNavigationBarWithoutKeyboard = true;
        gh.c cVar = new gh.c();
        this.I2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.F2 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.H2 = dVar;
            int i12 = 12;
            dVar.k(new ji.w4(this, i12));
            gh.d dVar2 = new gh.d(null);
            this.G2 = dVar2;
            dVar2.k(new ji.h5(this, i12));
            bh.b bVar = new bh.b(dVar);
            this.J2 = bVar;
            bVar.i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.K2 = bVar2;
            bVar2.i = LiteMode.isEnabled(262144);
        } else {
            this.F2 = null;
            this.G2 = null;
            this.H2 = null;
            this.J2 = new bh.b(cVar);
            this.K2 = new bh.b(cVar);
        }
        bh.b bVar3 = new bh.b(cVar);
        this.L2 = new lh(this, 0);
        this.k2 = z10;
        this.g0 = (m2Var instanceof org.telegram.ui.fo) && m2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f0 = m2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        li liVar = new li(this, context);
        this.u1 = liVar;
        liVar.setDelegate(new mi(this));
        this.containerView = liVar;
        liVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        b8 b8Var2 = new b8(this, context, c6Var, 1);
        this.a1 = b8Var2;
        b8Var2.S0 = true;
        b8Var2.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        b8Var2.setBackButtonDrawable(new org.telegram.ui.ActionBar.f2(false));
        int i14 = org.telegram.ui.ActionBar.g6.j5;
        b8Var2.D(getThemedColor(i14), false);
        int i15 = org.telegram.ui.ActionBar.g6.I5;
        b8Var2.C(getThemedColor(i15), false);
        b8Var2.setTitleColor(getThemedColor(i14));
        b8Var2.setOccupyStatusBar(true);
        b8Var2.setAlpha(0.0f);
        b8Var2.setActionBarMenuOnItemClick(new org.telegram.ui.nb(this, 10));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i14), false, c6Var);
        this.d1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.ic_ab_other);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        final int i16 = 4;
        u0Var2.setVisibility(4);
        u0Var2.setAlpha(0.0f);
        u0Var2.setScaleX(0.6f);
        u0Var2.setScaleY(0.6f);
        u0Var2.setSubMenuOpenSide(2);
        u0Var2.setDelegate(new eh(this, 8));
        u0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        u0Var2.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i15), 6, -1));
        u0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fi.q4 q4Var;
                switch (i16) {
                    case 0:
                        vi viVar = this.b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.K1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.C1();
                        break;
                    case 4:
                        this.b.d1.M(null, null);
                        break;
                    case 5:
                        vi.w(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.d2(viVar4.B0 != viVar4.q0);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i14), false, c6Var);
        this.f1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        di.u uVar = new di.u();
        this.e1 = uVar;
        u0Var3.setIcon(uVar);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var3.setVisibility(8);
        u0Var3.setAlpha(0.0f);
        u0Var3.setScaleX(0.6f);
        u0Var3.setScaleY(0.6f);
        u0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        int themedColor = getThemedColor(i15);
        final int i17 = 6;
        u0Var3.setBackground(org.telegram.ui.ActionBar.g6.g0(themedColor, 6, -1));
        final int i18 = 5;
        u0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fi.q4 q4Var;
                switch (i18) {
                    case 0:
                        vi viVar = this.b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.K1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.C1();
                        break;
                    case 4:
                        this.b.d1.M(null, null);
                        break;
                    case 5:
                        vi.w(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.d2(viVar4.B0 != viVar4.q0);
                        break;
                }
            }
        });
        ci.n nVar2 = new ci.n(this, context);
        nVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        nVar2.setText(LocaleController.getString(R.string.Create));
        nVar2.setTypeface(AndroidUtilities.bold());
        nVar2.setTextSize(1, 14.0f);
        nVar2.setVisibility(4);
        nVar2.setAlpha(0.0f);
        nVar2.setGravity(17);
        nVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        nVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        nVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fi.q4 q4Var;
                switch (i17) {
                    case 0:
                        vi viVar = this.b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.K1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.C1();
                        break;
                    case 4:
                        this.b.d1.M(null, null);
                        break;
                    case 5:
                        vi.w(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.d2(viVar4.B0 != viVar4.q0);
                        break;
                }
            }
        });
        w7.b6.a(nVar2);
        this.i1 = nVar2;
        a2();
        if (m2Var != null) {
            nVar = nVar2;
            u0Var = u0Var3;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.u0 u0Var4 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i14), false, c6Var);
            this.h1 = u0Var4;
            u0Var4.setLongClickEnabled(false);
            u0Var4.setIcon(R.drawable.outline_header_search);
            u0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            u0Var4.setVisibility(4);
            u0Var4.setAlpha(0.0f);
            u0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            i10 = -1;
            u0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i15), 6, -1));
            u0Var4.setOnClickListener(new bi.z2(5, this, z11));
        } else {
            u0Var = u0Var3;
            nVar = nVar2;
            i10 = -1;
            f7 = 14.0f;
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i14), false, c6Var);
        this.n1 = u0Var5;
        u0Var5.setLongClickEnabled(false);
        u0Var5.setIcon(R.drawable.ic_ab_other);
        u0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var5.setVisibility(8);
        u0Var5.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i15), 3, i10));
        final int i19 = 2;
        u0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jh
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        final vi viVar = this.b;
                        ai aiVar = viVar.H0;
                        if (aiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(viVar.getContext(), c6Var);
                            e0Var.n0(aiVar.getText());
                            final int i20 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.mh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            ai aiVar2 = viVar.H0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            di diVar = viVar.S0;
                                            diVar.setText(charSequence);
                                            diVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = viVar.Z;
                            boolean z13 = viVar.K1 != null;
                            nh nhVar = new nh(viVar, 0);
                            e0Var.l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.n0 = nhVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final vi viVar2 = this.b;
                        di diVar = viVar2.S0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(viVar2.getContext(), c6Var);
                            e0Var2.n0(diVar.getText());
                            final int i21 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.mh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i21) {
                                        case 0:
                                            ai aiVar2 = viVar2.H0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            di diVar2 = viVar2.S0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = viVar2.Z;
                            boolean z14 = viVar2.K1 != null;
                            nh nhVar2 = new nh(viVar2, 1);
                            e0Var2.l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = nhVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        vi viVar3 = this.b;
                        viVar3.n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = viVar3.f0;
                        t12.K2(null, m2Var2, c6Var);
                        PhotoViewer.t1().L2(viVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i22 = viVar3.V1;
                        boolean z15 = viVar3.W1;
                        t13.h = i22;
                        t13.n = z15;
                        if (!viVar3.c2.w()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(viVar3.getContainer().findFocus());
                        }
                        File w9 = di.k8.w(viVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i23 = point.x;
                        int i24 = point.y;
                        if (i23 > 1080 || i24 > 1080) {
                            float min = Math.min(i23, i24) / 1080.0f;
                            i23 = (int) (i23 * min);
                            i24 = (int) (i24 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i23, i24, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().g2(arrayList3, 0, 11, false, new wh(viVar3, photoEntry), m2Var2 instanceof org.telegram.ui.fo ? (org.telegram.ui.fo) m2Var2 : null);
                        if (viVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, viVar3.J);
                            break;
                        }
                        break;
                }
            }
        });
        u0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        u0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        final int i20 = 7;
        u0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fi.q4 q4Var;
                switch (i20) {
                    case 0:
                        vi viVar = this.b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.K1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.C1();
                        break;
                    case 4:
                        this.b.d1.M(null, null);
                        break;
                    case 5:
                        vi.w(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.d2(viVar4.B0 != viVar4.q0);
                        break;
                }
            }
        });
        xh xhVar = new xh(this, context, 0);
        this.l1 = xhVar;
        final int i21 = 8;
        xhVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fi.q4 q4Var;
                switch (i21) {
                    case 0:
                        vi viVar = this.b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.K1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.C1();
                        break;
                    case 4:
                        this.b.d1.M(null, null);
                        break;
                    case 5:
                        vi.w(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.d2(viVar4.B0 != viVar4.q0);
                        break;
                }
            }
        });
        xhVar.setAlpha(0.0f);
        xhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.o1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.m1 = textView;
        textView.setTextColor(getThemedColor(i14));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.p1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor2 = getThemedColor(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        xhVar.addView(linearLayout, w7.z5.d(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.q1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i14), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.r1 = textView2;
        textView2.setTextColor(getThemedColor(i14));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.z5.q(-2, -2, 16));
        xhVar.addView(linearLayout2, w7.z5.d(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, c6Var);
        this.j0 = chatAttachAlertPhotoLayout;
        niVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.B0 = chatAttachAlertPhotoLayout;
        this.Z0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.z5.d(-1.0f, -1));
        kh.f fVar = new kh.f(context);
        this.y1 = fVar;
        fVar.setup(bVar3);
        fVar.setFadeTopAlpha(0);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(fVar, w7.z5.g());
        this.containerView.addView(xhVar, w7.z5.a(-2.0f, 23.0f, 0.0f, 21.0f, 0.0f, -1, 51));
        ah.v vVar = new ah.v(context, 10);
        this.R0 = vVar;
        this.containerView.addView(vVar, w7.z5.e(-1, -2, 55));
        this.containerView.addView(b8Var2, w7.z5.d(-2.0f, -1));
        this.containerView.addView(u0Var2, w7.z5.e(48, 48, 53));
        this.containerView.addView(u0Var, w7.z5.a(48.0f, 0.0f, 0.0f, 48.0f, 0.0f, 48, 53));
        org.telegram.ui.ActionBar.u0 u0Var6 = this.h1;
        if (u0Var6 != null) {
            b8Var = b8Var2;
            this.containerView.addView(u0Var6, w7.z5.e(48, 48, 53));
        } else {
            b8Var = b8Var2;
        }
        xhVar.addView(u0Var5, w7.z5.a(32.0f, 0.0f, 0.0f, 0.0f, 8.0f, 32, 21));
        this.containerView.addView(nVar, w7.z5.e(-2, 48, 53));
        xh xhVar2 = new xh(this, context, 1);
        this.A1 = xhVar2;
        yh yhVar = new yh(context, 0);
        this.B1 = yhVar;
        yhVar.setClipChildren(true);
        yhVar.setClipToPadding(false);
        si siVar = new si(this, context);
        this.D1 = siVar;
        yhVar.setAdapter(siVar);
        s4.b0 b0Var = new s4.b0(0, false);
        this.C1 = b0Var;
        yhVar.setLayoutManager(b0Var);
        yhVar.setVerticalScrollBarEnabled(false);
        yhVar.setHorizontalScrollBarEnabled(false);
        yhVar.setItemAnimator(null);
        yhVar.setLayoutAnimation(null);
        yhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        yhVar.x2 = true;
        yhVar.setOverScrollMode(2);
        bh.b bVar4 = this.J2;
        ih.j jVar = new ih.j(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        bVar4.f = jVar;
        bVar4.g = viewGroup2;
        bh.b bVar5 = this.K2;
        ih.j jVar2 = new ih.j(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        bVar5.f = jVar2;
        bVar5.g = viewGroup3;
        ih.j jVar3 = new ih.j(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        bVar3.f = jVar3;
        bVar3.g = viewGroup4;
        zh zhVar = new zh(this, context, 0);
        this.z1 = zhVar;
        bh.c cVar2 = new bh.c(bVar3.c(zhVar, null, false));
        this.b0 = cVar2;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar2.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(zhVar, w7.z5.g());
        dh.d c10 = this.J2.c(xhVar2, fh.b.f(c6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        xhVar2.setBackground(c10);
        yhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        yhVar.setClipToOutline(true);
        int dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(28.0f);
        bi.a2 a2Var = zf.j0.a;
        yhVar.setOutlineProvider(new zf.i0(dp, dp2));
        yhVar.setImportantForAccessibility(1);
        xhVar2.addView(yhVar, w7.z5.g());
        this.containerView.addView(xhVar2, w7.z5.e(-1, 70, 81));
        yhVar.setOnItemClickListener(new bi.z5(9, this, c6Var));
        yhVar.setOnItemLongClickListener(new eh(this, 3));
        final int i22 = 0;
        s6 s6Var = new s6(context, true, false, true);
        this.H1 = s6Var;
        s6Var.setVisibility(8);
        s6Var.setAlpha(0.0f);
        s6Var.setGravity(17);
        s6Var.setTypeface(AndroidUtilities.bold());
        int dp3 = AndroidUtilities.dp(16.0f);
        s6Var.setPadding(dp3, 0, dp3, 0);
        s6Var.setTextSize(AndroidUtilities.dp(f7));
        s6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fi.q4 q4Var;
                switch (i22) {
                    case 0:
                        vi viVar = this.b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.K1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.C1();
                        break;
                    case 4:
                        this.b.d1.M(null, null);
                        break;
                    case 5:
                        vi.w(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.d2(viVar4.B0 != viVar4.q0);
                        break;
                }
            }
        });
        this.containerView.addView(s6Var, w7.z5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.z5.a(28.0f, 0.0f, 0.0f, 10.0f, 10.0f, 28, 85));
        ImageView imageView3 = new ImageView(context);
        this.I0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor3, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i23 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fi.q4 q4Var;
                switch (i23) {
                    case 0:
                        vi viVar = this.b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.K1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.C1();
                        break;
                    case 4:
                        this.b.d1.M(null, null);
                        break;
                    case 5:
                        vi.w(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.d2(viVar4.B0 != viVar4.q0);
                        break;
                }
            }
        });
        xh xhVar3 = new xh(this, context, 2);
        this.G0 = xhVar3;
        ig.j jVar4 = new ig.j(this, context);
        this.F0 = jVar4;
        xhVar3.addView(jVar4, w7.z5.e(-1, -1, 119));
        dh.d c11 = this.K2.c(liVar, fh.b.n(c6Var), false);
        this.D0 = c11;
        c11.m = true;
        c11.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.u(AndroidUtilities.dp(32.0f));
        c11.j.g = 0.4f;
        c11.k();
        dh.d c12 = this.J2.c(jVar4, fh.b.n(c6Var), false);
        this.E0 = c12;
        c12.q(AndroidUtilities.dp(22.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        jVar4.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        xhVar3.setWillNotDraw(false);
        xhVar3.setVisibility(4);
        xhVar3.setAlpha(0.0f);
        this.containerView.addView(xhVar3, w7.z5.e(-1, -2, 83));
        xhVar3.setOnTouchListener(new ci.d(13));
        s6 s6Var2 = new s6(context, false, false, false);
        this.s = s6Var2;
        s6Var2.setAllowCancel(true);
        s6Var2.setScaleProperty(0.6f);
        s6Var2.setVisibility(8);
        s6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i24 = org.telegram.ui.ActionBar.g6.y6;
        s6Var2.setTextColor(getThemedColor(i24));
        s6Var2.setTypeface(AndroidUtilities.bold());
        s6Var2.setGravity(17);
        jVar4.addView(s6Var2, w7.z5.a(20.0f, 3.0f, 0.0f, 3.0f, 50.0f, 56, 85));
        ImageView imageView4 = new ImageView(context);
        this.w = imageView4;
        i0 i0Var = new i0(context);
        this.x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i25 = org.telegram.ui.ActionBar.g6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), mode));
        int i26 = org.telegram.ui.ActionBar.g6.i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i26), 1, AndroidUtilities.dp(16.0f)));
        jVar4.addView(imageView4, w7.z5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 53));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView4);
        final int i27 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jh
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i27) {
                    case 0:
                        final vi viVar = this.b;
                        ai aiVar = viVar.H0;
                        if (aiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(viVar.getContext(), c6Var);
                            e0Var.n0(aiVar.getText());
                            final int i202 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.mh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            ai aiVar2 = viVar.H0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            di diVar2 = viVar.S0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = viVar.Z;
                            boolean z13 = viVar.K1 != null;
                            nh nhVar = new nh(viVar, 0);
                            e0Var.l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.n0 = nhVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final vi viVar2 = this.b;
                        di diVar = viVar2.S0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(viVar2.getContext(), c6Var);
                            e0Var2.n0(diVar.getText());
                            final int i212 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.mh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            ai aiVar2 = viVar2.H0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            di diVar2 = viVar2.S0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = viVar2.Z;
                            boolean z14 = viVar2.K1 != null;
                            nh nhVar2 = new nh(viVar2, 1);
                            e0Var2.l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = nhVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        vi viVar3 = this.b;
                        viVar3.n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = viVar3.f0;
                        t12.K2(null, m2Var2, c6Var);
                        PhotoViewer.t1().L2(viVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i222 = viVar3.V1;
                        boolean z15 = viVar3.W1;
                        t13.h = i222;
                        t13.n = z15;
                        if (!viVar3.c2.w()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(viVar3.getContainer().findFocus());
                        }
                        File w9 = di.k8.w(viVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i232 = point.x;
                        int i242 = point.y;
                        if (i232 > 1080 || i242 > 1080) {
                            float min = Math.min(i232, i242) / 1080.0f;
                            i232 = (int) (i232 * min);
                            i242 = (int) (i242 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i232, i242, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().g2(arrayList3, 0, 11, false, new wh(viVar3, photoEntry), m2Var2 instanceof org.telegram.ui.fo ? (org.telegram.ui.fo) m2Var2 : null);
                        if (viVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, viVar3.J);
                            break;
                        }
                        break;
                }
            }
        });
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        this.K = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        ai aiVar = new ai(this, context, liVar, c6Var);
        this.H0 = aiVar;
        aiVar.J = true;
        aiVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        aiVar.s();
        aiVar.getEditText().setLayoutParams(w7.z5.a(-1.0f, 48.0f, 0.0f, 36.0f, 0.0f, -1, 19));
        aiVar.getEditText().addTextChangedListener(new ci(this, 0));
        jVar4.addView(aiVar, w7.z5.a(-2.0f, 0.0f, 0.0f, 84.0f, 0.0f, -1, 83));
        jVar4.setClipChildren(false);
        xhVar3.setClipChildren(false);
        aiVar.setClipChildren(false);
        vVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        vVar.setWillNotDraw(false);
        di diVar = new di(this, context, liVar, c6Var);
        this.S0 = diVar;
        diVar.J = true;
        diVar.getEditText().addTextChangedListener(new ei(this, m2Var));
        diVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        diVar.getEditText().setLayoutParams(w7.z5.a(-1.0f, 48.0f, 0.0f, 96.0f, 0.0f, -1, 19));
        diVar.getEditText().setTextSize(1, 17.0f);
        diVar.getEmojiButton().setLayoutParams(w7.z5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 83));
        diVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        vVar.addView(diVar, w7.z5.e(-1, -2, 119));
        vVar.setAlpha(0.0f);
        vVar.setVisibility(8);
        aiVar.addView(imageView3, w7.z5.a(40.0f, 0.0f, 0.0f, 0.0f, 4.0f, 40, 85));
        dh.d c13 = this.J2.c(vVar, fh.b.n(c6Var), false);
        c13.q(AndroidUtilities.dp(22.0f));
        c13.p(AndroidUtilities.dp(7.0f));
        vVar.setBackground(c13);
        vVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        s6 s6Var3 = new s6(context, false, false, false);
        this.v = s6Var3;
        s6Var3.setScaleProperty(0.6f);
        s6Var3.setVisibility(8);
        s6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var3.setTextColor(getThemedColor(i24));
        s6Var3.setTypeface(AndroidUtilities.bold());
        s6Var3.setGravity(17);
        s6Var3.setAllowCancel(true);
        vVar.addView(s6Var3, w7.z5.a(20.0f, 3.0f, 45.0f, 3.0f, 0.0f, 56, 53));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Xd), mode2));
        diVar.addView(imageView5, w7.z5.a(40.0f, 0.0f, 0.0f, 60.0f, 0.0f, 40, 85));
        final int i28 = 2;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fi.q4 q4Var;
                switch (i28) {
                    case 0:
                        vi viVar = this.b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.K1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.C1();
                        break;
                    case 4:
                        this.b.d1.M(null, null);
                        break;
                    case 5:
                        vi.w(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.d2(viVar4.B0 != viVar4.q0);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.y = imageView6;
        i0 i0Var2 = new i0(context);
        this.E = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i26), 1, AndroidUtilities.dp(16.0f)));
        vVar.addView(imageView6, w7.z5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 85));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView6);
        final int i29 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jh
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i29) {
                    case 0:
                        final vi viVar = this.b;
                        ai aiVar2 = viVar.H0;
                        if (aiVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(viVar.getContext(), c6Var);
                            e0Var.n0(aiVar2.getText());
                            final int i202 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.mh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            ai aiVar22 = viVar.H0;
                                            aiVar22.setText(charSequence);
                                            aiVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            di diVar2 = viVar.S0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = viVar.Z;
                            boolean z13 = viVar.K1 != null;
                            nh nhVar = new nh(viVar, 0);
                            e0Var.l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.n0 = nhVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final vi viVar2 = this.b;
                        di diVar2 = viVar2.S0;
                        if (diVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(viVar2.getContext(), c6Var);
                            e0Var2.n0(diVar2.getText());
                            final int i212 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.mh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            ai aiVar22 = viVar2.H0;
                                            aiVar22.setText(charSequence);
                                            aiVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            di diVar22 = viVar2.S0;
                                            diVar22.setText(charSequence);
                                            diVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = viVar2.Z;
                            boolean z14 = viVar2.K1 != null;
                            nh nhVar2 = new nh(viVar2, 1);
                            e0Var2.l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = nhVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        vi viVar3 = this.b;
                        viVar3.n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.m2 m2Var2 = viVar3.f0;
                        t12.K2(null, m2Var2, c6Var);
                        PhotoViewer.t1().L2(viVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i222 = viVar3.V1;
                        boolean z15 = viVar3.W1;
                        t13.h = i222;
                        t13.n = z15;
                        if (!viVar3.c2.w()) {
                            AndroidUtilities.hideKeyboard(m2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(viVar3.getContainer().findFocus());
                        }
                        File w9 = di.k8.w(viVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i232 = point.x;
                        int i242 = point.y;
                        if (i232 > 1080 || i242 > 1080) {
                            float min = Math.min(i232, i242) / 1080.0f;
                            i232 = (int) (i232 * min);
                            i242 = (int) (i242 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i232, i242, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().g2(arrayList3, 0, 11, false, new wh(viVar3, photoEntry), m2Var2 instanceof org.telegram.ui.fo ? (org.telegram.ui.fo) m2Var2 : null);
                        if (viVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, viVar3.J);
                            break;
                        }
                        break;
                }
            }
        });
        imageView6.setVisibility(8);
        imageView6.setAlpha(0.0f);
        imageView6.setScaleX(0.6f);
        imageView6.setScaleY(0.6f);
        xh xhVar4 = new xh(this, context, 3);
        this.K0 = xhVar4;
        xhVar4.setFocusable(true);
        xhVar4.setFocusableInTouchMode(true);
        xhVar4.setVisibility(4);
        xhVar4.setScaleX(0.2f);
        xhVar4.setScaleY(0.2f);
        xhVar4.setAlpha(0.0f);
        xhVar4.setClipChildren(false);
        xhVar4.setClipToPadding(false);
        this.containerView.addView(xhVar4, w7.z5.e(110, 50, 85));
        fi fiVar = new fi(R.drawable.send_plane_24, context, c6Var, this);
        this.L0 = fiVar;
        fiVar.setImportantForAccessibility(2);
        xhVar4.addView(fiVar, w7.z5.e(-1, -1, 119));
        fiVar.setTranslationX(this.backgroundPaddingLeft);
        int dp4 = AndroidUtilities.dp(52.0f);
        int dp5 = AndroidUtilities.dp(38.0f);
        fiVar.I = dp4;
        fiVar.J = dp5;
        float dp6 = AndroidUtilities.dp(7.0f);
        float dp7 = AndroidUtilities.dp(6.0f);
        fiVar.M = dp6;
        fiVar.N = dp7;
        fiVar.h0 = true;
        final int i30 = 3;
        fiVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fi.q4 q4Var;
                switch (i30) {
                    case 0:
                        vi viVar = this.b;
                        long j10 = viVar.Z0;
                        if (j10 < 0 && (q4Var = (fi.q4) viVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.K1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.C1();
                        break;
                    case 4:
                        this.b.d1.M(null, null);
                        break;
                    case 5:
                        vi.w(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.B0;
                        if (niVar != null) {
                            niVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.d2(viVar4.B0 != viVar4.q0);
                        break;
                }
            }
        });
        fiVar.setOnLongClickListener(new org.telegram.ui.mg(this, context, c6Var, m2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        zh zhVar2 = new zh(this, context, 1);
        zhVar2.setAlpha(0.0f);
        zhVar2.setScaleX(0.2f);
        zhVar2.setScaleY(0.2f);
        if (z10) {
            e1();
            this.navBarColorKey = -1;
        }
        tl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        bh.b bVar6 = this.J2;
        eh.e n10 = fh.b.n(c6Var);
        mm0 mm0Var = fastScroll.o0;
        dh.d c14 = bVar6.c(mm0Var.d1, n10, false);
        fastScroll.e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.e0.q(AndroidUtilities.dp(24.0f));
        dh.d c15 = bVar6.c(mm0Var.d1, n10, false);
        fastScroll.f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f0.q(AndroidUtilities.dp(f7));
        re0 re0Var = new re0(context);
        this.S = re0Var;
        this.containerView.addView(re0Var, w7.z5.d(-1.0f, -1));
        eh.e eVar = new eh.e(c6Var);
        eVar.e = new eh(this, 4);
        eVar.c = new eh(this, 5);
        eVar.d = new eh(this, 6);
        eVar.b = new eh(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.n = dpf2;
        eVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f = dpf23;
        eVar.h = dpf24;
        b8Var.M(this.J2, eVar, false);
        lVar.h(1L, false);
    }

    public static void O(vi viVar) {
        b8 b8Var = viVar.a1;
        kh.f fVar = viVar.y1;
        if (fVar == null || b8Var == null) {
            return;
        }
        ni niVar = viVar.C0;
        if (niVar == null) {
            niVar = viVar.B0;
        }
        int i10 = 0;
        boolean z10 = niVar != null && (niVar instanceof cl);
        org.telegram.ui.ActionBar.c6 c6Var = viVar.resourcesProvider;
        boolean a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        if (!z10 && b8Var.getVisibility() == 0) {
            i10 = (int) (b8Var.getAlpha() * (a2 ? 255 : 160));
        }
        fVar.setFadeTopAlpha(i10);
    }

    public static void S(vi viVar) {
        di.i iVar = new di.i(viVar, viVar.getContext(), viVar.Z, LaunchActivity.R(), viVar.resourcesProvider, 1);
        viVar.E2 = iVar;
        iVar.p(new m.l(viVar));
        ViewGroup viewGroup = viVar.containerView;
        viewGroup.addView(viVar.E2, viewGroup.indexOfChild(viVar.G0), w7.z5.e(-1, -1, 83));
        di.i iVar2 = viVar.E2;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
            hg.j1 adapter = iVar2.getAdapter();
            foVar.i();
            TLRPC.Chat chat = foVar.e;
            adapter.getClass();
            adapter.l0 = chat;
            iVar2.getAdapter().W(foVar.Z7);
            iVar2.getAdapter().e0 = foVar.e != null;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().e0 = false;
        }
        iVar2.getAdapter().f0 = false;
        viVar.Y1();
    }

    public static /* synthetic */ void n(vi viVar, ValueAnimator valueAnimator) {
        viVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.c3 c3Var = viVar.container;
        if (c3Var != null) {
            c3Var.invalidate();
        }
    }

    public static /* synthetic */ void q(vi viVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.y2 y2Var) {
        viVar.currentSheetAnimation = null;
        viVar.s2 = null;
        animationNotificationsLocker.unlock();
        viVar.currentSheetAnimationType = 0;
        if (y2Var != null) {
            y2Var.onOpenAnimationEnd();
        }
        if (viVar.useHardwareLayer) {
            viVar.container.setLayerType(0, null);
        }
        if (viVar.isFullscreen) {
            WindowManager.LayoutParams attributes = viVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            viVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x047d, code lost:
    
        if (r27 == null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x047f, code lost:
    
        r27.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0483, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0484, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x04a6, code lost:
    
        if (r27 == null) goto L195;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x049e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean r(vi viVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.m2 m2Var, View view) {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        org.telegram.ui.fo foVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        boolean z10;
        boolean z11;
        MessageObject messageObject3;
        long j10;
        MessageObject messageObject4;
        ArrayList<Object> arrayList;
        HashMap<Object, Object> hashMap;
        int i10;
        long j11;
        Throwable th2;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor;
        int i11;
        Throwable th3;
        String str;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        long j12;
        boolean z12;
        long j13;
        org.telegram.ui.fo foVar2;
        TLRPC.ChatFull chatFull;
        boolean z13;
        boolean z14;
        int i12;
        boolean z15;
        fi fiVar = viVar.L0;
        org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = viVar.j0;
        int i13 = viVar.M1;
        long j14 = viVar.Z;
        if ((j14 != 0 || (m2Var2 instanceof org.telegram.ui.fo)) && viVar.K - viVar.L >= 0 && !viVar.h.f) {
            if (m2Var2 instanceof org.telegram.ui.fo) {
                org.telegram.ui.fo foVar3 = (org.telegram.ui.fo) m2Var2;
                TLRPC.User i14 = foVar3.i();
                MessageObject messageObject5 = foVar3.n5;
                MessageObject messageObject6 = foVar3.k5;
                if (!foVar3.c() && foVar3.R3 != 5) {
                    messageObject2 = messageObject6;
                    messageObject = messageObject5;
                    foVar = foVar3;
                    user = i14;
                    j14 = foVar3.a();
                }
            } else {
                user = MessagesController.getInstance(i13).getUser(Long.valueOf(j14));
                messageObject = null;
                messageObject2 = null;
                foVar = null;
            }
            of ofVar = viVar.h0;
            if (ofVar != null) {
                ofVar.dismiss();
            }
            of ofVar2 = new of(viVar, context, c6Var, 1);
            viVar.h0 = ofVar2;
            ofVar2.r(fiVar, false, new bi.x(viVar, m2Var, c6Var, 16));
            ArrayList arrayList2 = new ArrayList();
            ni niVar = viVar.B0;
            String str2 = "";
            int i15 = 2;
            if (niVar == chatAttachAlertPhotoLayout3 || niVar == viVar.q0) {
                chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                if (selectedPhotos.isEmpty()) {
                    z10 = false;
                    z11 = false;
                    messageObject3 = null;
                } else {
                    int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                    MessageObject messageObject7 = null;
                    int i16 = 0;
                    int i17 = 0;
                    z10 = false;
                    z11 = false;
                    while (i16 < ceil) {
                        int i18 = i16 * 10;
                        MessageObject messageObject8 = messageObject7;
                        MessageObject messageObject9 = messageObject2;
                        String str3 = str2;
                        int min = Math.min(10, selectedPhotos.size() - i18);
                        HashMap<Object, Object> hashMap2 = selectedPhotos;
                        long nextLong = Utilities.random.nextLong();
                        int i19 = i17;
                        int i20 = ceil;
                        int i21 = 0;
                        while (i21 < min) {
                            int i22 = min;
                            int i23 = i18 + i21;
                            int i24 = i21;
                            if (i23 >= selectedPhotosOrder.size()) {
                                j11 = j14;
                                i10 = i16;
                                hashMap = hashMap2;
                                arrayList = selectedPhotosOrder;
                            } else {
                                HashMap<Object, Object> hashMap3 = hashMap2;
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) hashMap3.get(selectedPhotosOrder.get(i23));
                                arrayList = selectedPhotosOrder;
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                int i25 = i19 + 1;
                                tL_message.id = i19;
                                hashMap = hashMap3;
                                tL_message.out = true;
                                i10 = i16;
                                tL_message.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                                tL_message.peer_id = MessagesController.getInstance(i13).getPeer(j14);
                                boolean z16 = photoEntry.isVideo;
                                if (z16 || (str = photoEntry.imagePath) == null) {
                                    String str4 = photoEntry.path;
                                    if (str4 != null) {
                                        tL_message.attachPath = str4;
                                    }
                                } else {
                                    tL_message.attachPath = str;
                                }
                                if (i22 > 0) {
                                    tL_message.grouped_id = nextLong;
                                }
                                int i26 = photoEntry.width;
                                int i27 = photoEntry.height;
                                int i28 = photoEntry.orientation;
                                if (z16) {
                                    j11 = j14;
                                    if (photoEntry.videoOrientation == -1) {
                                        try {
                                            MediaMetadataRetriever mediaMetadataRetriever3 = new MediaMetadataRetriever();
                                            try {
                                                if (!photoEntry.isLivePhoto() || photoEntry.livePhotoVideoOffset <= 0) {
                                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                    try {
                                                        mediaMetadataRetriever2.setDataSource(photoEntry.path);
                                                        parcelFileDescriptor = null;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        i11 = 0;
                                                        parcelFileDescriptor = null;
                                                        photoEntry.videoOrientation = i11;
                                                        FileLog.e(e);
                                                        if (mediaMetadataRetriever2 != null) {
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        th2 = th;
                                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                                        parcelFileDescriptor = null;
                                                        if (mediaMetadataRetriever != null) {
                                                        }
                                                        if (parcelFileDescriptor == null) {
                                                        }
                                                    }
                                                } else {
                                                    File file = new File(photoEntry.path);
                                                    ParcelFileDescriptor open = ParcelFileDescriptor.open(file, TLObject.FLAG_28);
                                                    try {
                                                        parcelFileDescriptor = open;
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        parcelFileDescriptor = open;
                                                    } catch (Throwable th5) {
                                                        th3 = th5;
                                                        parcelFileDescriptor = open;
                                                    }
                                                    try {
                                                        mediaMetadataRetriever3.setDataSource(open.getFileDescriptor(), photoEntry.livePhotoVideoOffset, file.length() - photoEntry.livePhotoVideoOffset);
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        i11 = 0;
                                                        photoEntry.videoOrientation = i11;
                                                        FileLog.e(e);
                                                        if (mediaMetadataRetriever2 != null) {
                                                        }
                                                    } catch (Throwable th6) {
                                                        th3 = th6;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        th2 = th3;
                                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                                        if (mediaMetadataRetriever != null) {
                                                        }
                                                        if (parcelFileDescriptor == null) {
                                                        }
                                                    }
                                                }
                                                try {
                                                    try {
                                                        photoEntry.videoOrientation = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(24));
                                                        try {
                                                            mediaMetadataRetriever2.release();
                                                        } catch (IOException e11) {
                                                            FileLog.e(e11);
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        i11 = 0;
                                                        photoEntry.videoOrientation = i11;
                                                        FileLog.e(e);
                                                        if (mediaMetadataRetriever2 != null) {
                                                            try {
                                                                mediaMetadataRetriever2.release();
                                                            } catch (IOException e13) {
                                                                FileLog.e(e13);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th7) {
                                                    th3 = th7;
                                                    th2 = th3;
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    if (mediaMetadataRetriever != null) {
                                                        try {
                                                            mediaMetadataRetriever.release();
                                                        } catch (IOException e14) {
                                                            FileLog.e(e14);
                                                        }
                                                    }
                                                    if (parcelFileDescriptor == null) {
                                                        throw th2;
                                                    }
                                                    try {
                                                        parcelFileDescriptor.close();
                                                        throw th2;
                                                    } catch (IOException e15) {
                                                        FileLog.e(e15);
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Exception e16) {
                                                e = e16;
                                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                            }
                                        } catch (Exception e17) {
                                            e = e17;
                                            mediaMetadataRetriever2 = null;
                                        } catch (Throwable th9) {
                                            th2 = th9;
                                            mediaMetadataRetriever = null;
                                        }
                                    }
                                    i28 = photoEntry.videoOrientation;
                                } else {
                                    j11 = j14;
                                }
                                if ((i28 / 90) % 2 != 0) {
                                    i27 = i26;
                                    i26 = i27;
                                }
                                if (photoEntry.isLivePhoto()) {
                                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                                    tL_message.media = tL_messageMediaPhoto;
                                    tL_messageMediaPhoto.live_photo = true;
                                    tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
                                    TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                    tL_photoSize.w = i26;
                                    tL_photoSize.h = i27;
                                    tL_photoSize.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                    tL_message.media.photo.sizes.add(tL_photoSize);
                                    tL_message.media.document = new TLRPC.TL_document();
                                    tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                    tL_documentAttributeVideo.w = i26;
                                    tL_documentAttributeVideo.h = i27;
                                    tL_documentAttributeVideo.duration = photoEntry.duration;
                                    tL_message.media.document.attributes.add(tL_documentAttributeVideo);
                                } else if (photoEntry.isVideo) {
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                    tL_documentAttributeVideo2.w = i26;
                                    tL_documentAttributeVideo2.h = i27;
                                    tL_documentAttributeVideo2.duration = photoEntry.duration;
                                    tL_message.media.document.attributes.add(tL_documentAttributeVideo2);
                                } else {
                                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                                    tL_message.media = tL_messageMediaPhoto2;
                                    tL_messageMediaPhoto2.photo = new TLRPC.TL_photo();
                                    TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                    tL_photoSize2.w = i26;
                                    tL_photoSize2.h = i27;
                                    tL_photoSize2.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                    tL_message.media.photo.sizes.add(tL_photoSize2);
                                }
                                tL_message.media.spoiler = photoEntry.hasSpoiler;
                                CharSequence charSequence = photoEntry.caption;
                                String charSequence2 = charSequence == null ? str3 : charSequence.toString();
                                tL_message.message = charSequence2;
                                if (TextUtils.isEmpty(charSequence2) && i10 == 0 && i24 == 0) {
                                    CharSequence[] charSequenceArr = {viVar.o1().getText()};
                                    MessageObject.addLinks(true, charSequenceArr[0]);
                                    tL_message.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr, true);
                                    tL_message.message = charSequenceArr[0].toString();
                                }
                                if (i10 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                    if (messageObject9 != null) {
                                        tL_messageReplyHeader.flags |= 2;
                                        tL_messageReplyHeader.reply_to_top_id = messageObject9.getId();
                                    }
                                    tL_messageReplyHeader.flags |= 16;
                                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                    tL_message.reply_to = tL_messageReplyHeader;
                                }
                                MessageObject messageObject10 = new MessageObject(i13, tL_message, true, false);
                                if (i10 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                                    messageObject10.replyMessageObject = messageObject;
                                }
                                messageObject10.sendPreviewEntry = photoEntry;
                                messageObject10.sendPreview = true;
                                messageObject10.notime = true;
                                messageObject10.isOutOwnerCached = Boolean.TRUE;
                                arrayList2.add(messageObject10);
                                if (messageObject8 == null && !TextUtils.isEmpty(tL_message.message)) {
                                    messageObject8 = messageObject10;
                                }
                                i19 = i25;
                                z10 = true;
                                z11 = true;
                            }
                            i21 = i24 + 1;
                            selectedPhotosOrder = arrayList;
                            min = i22;
                            hashMap2 = hashMap;
                            i16 = i10;
                            j14 = j11;
                        }
                        i16++;
                        ceil = i20;
                        str2 = str3;
                        messageObject2 = messageObject9;
                        selectedPhotos = hashMap2;
                        i17 = i19;
                        messageObject7 = messageObject8;
                    }
                    messageObject3 = messageObject7;
                }
                j10 = j14;
                messageObject4 = messageObject3;
            } else {
                if (niVar == viVar.k0) {
                    if (TextUtils.isEmpty(viVar.o1().getText())) {
                        i12 = 0;
                        z15 = false;
                    } else {
                        TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                        tL_message2.id = 0;
                        tL_message2.out = true;
                        tL_message2.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                        tL_message2.peer_id = MessagesController.getInstance(i13).getPeer(j14);
                        CharSequence[] charSequenceArr2 = {viVar.o1().getText()};
                        MessageObject.addLinks(true, charSequenceArr2[0]);
                        tL_message2.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr2, true);
                        tL_message2.message = charSequenceArr2[0].toString();
                        MessageObject messageObject11 = new MessageObject(i13, tL_message2, true, false);
                        messageObject11.sendPreview = true;
                        messageObject11.notime = true;
                        messageObject11.isOutOwnerCached = Boolean.TRUE;
                        arrayList2.add(messageObject11);
                        i12 = 1;
                        z15 = true;
                    }
                    ArrayList<TLRPC.User> selected = viVar.k0.getSelected();
                    int i29 = 0;
                    while (i29 < selected.size()) {
                        TLRPC.User user2 = selected.get(i29);
                        TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                        int i30 = i12 + 1;
                        tL_message3.id = i12;
                        ArrayList<TLRPC.User> arrayList3 = selected;
                        tL_message3.out = true;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout4 = chatAttachAlertPhotoLayout3;
                        tL_message3.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                        tL_message3.peer_id = MessagesController.getInstance(i13).getPeer(j14);
                        TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                        tL_message3.media = tL_messageMediaContact;
                        tL_messageMediaContact.phone_number = user2.phone;
                        tL_messageMediaContact.first_name = user2.first_name;
                        tL_messageMediaContact.last_name = user2.last_name;
                        if (user2.restriction_reason.isEmpty() || !user2.restriction_reason.get(0).text.startsWith("BEGIN:VCARD")) {
                            tL_message3.media.vcard = "";
                        } else {
                            tL_message3.media.vcard = user2.restriction_reason.get(0).text;
                        }
                        tL_message3.media.user_id = user2.id;
                        MessageObject messageObject12 = new MessageObject(i13, tL_message3, true, false);
                        messageObject12.sendPreview = true;
                        messageObject12.notime = true;
                        messageObject12.isOutOwnerCached = Boolean.TRUE;
                        arrayList2.add(messageObject12);
                        i29++;
                        selected = arrayList3;
                        i12 = i30;
                        chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout4;
                        z15 = true;
                    }
                    chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                    j10 = j14;
                    z11 = z15;
                    messageObject4 = null;
                } else {
                    chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                    if (niVar == viVar.p0) {
                        messageObject4 = null;
                        boolean z17 = false;
                        int i31 = 0;
                        for (int i32 = 0; i32 < viVar.p0.S.size(); i32++) {
                            String str5 = (String) viVar.p0.S.get(i32);
                            if (str5 != null) {
                                int lastIndexOf = str5.lastIndexOf(File.separator);
                                String substring = lastIndexOf < 0 ? str5 : str5.substring(lastIndexOf + 1);
                                if (!TextUtils.isEmpty(substring)) {
                                    TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                                    int i33 = i31 + 1;
                                    tL_message4.id = i31;
                                    tL_message4.out = true;
                                    tL_message4.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                                    tL_message4.peer_id = MessagesController.getInstance(i13).getPeer(j14);
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                                    tL_message4.media = tL_messageMediaDocument2;
                                    tL_message4.attachPath = str5;
                                    tL_messageMediaDocument2.document = new TLRPC.TL_document();
                                    TLRPC.Document document = tL_message4.media.document;
                                    document.file_name = substring;
                                    document.size = new File(str5).length();
                                    if (TextUtils.isEmpty(tL_message4.message) && i32 == 0) {
                                        z13 = true;
                                        z14 = false;
                                        CharSequence[] charSequenceArr3 = {viVar.o1().getText()};
                                        tL_message4.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr3, true);
                                        tL_message4.message = charSequenceArr3[0].toString();
                                    } else {
                                        z13 = true;
                                        z14 = false;
                                    }
                                    MessageObject messageObject13 = new MessageObject(i13, tL_message4, z13, z14);
                                    messageObject13.attachPathExists = z13;
                                    messageObject13.sendPreview = z13;
                                    messageObject13.notime = z13;
                                    messageObject13.isOutOwnerCached = Boolean.TRUE;
                                    arrayList2.add(messageObject13);
                                    if (i32 == 0 && messageObject4 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                        messageObject4 = messageObject13;
                                    }
                                    i31 = i33;
                                    z17 = true;
                                }
                            }
                        }
                        j10 = j14;
                        z11 = z17;
                    } else {
                        hj hjVar = viVar.l0;
                        if (niVar == hjVar) {
                            arrayList2.addAll(hjVar.getSelected());
                            if (!arrayList2.isEmpty()) {
                                messageObject4 = (MessageObject) arrayList2.get(0);
                                CharSequence[] charSequenceArr4 = {viVar.o1().getText()};
                                MessageObject.addLinks(true, charSequenceArr4[0]);
                                messageObject4.messageOwner.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr4, true);
                                messageObject4.messageOwner.message = charSequenceArr4[0].toString();
                                if (!TextUtils.isEmpty(messageObject4.messageOwner.message)) {
                                    messageObject4.generateCaption();
                                    if (arrayList2.size() > 1) {
                                        for (int i34 = 0; i34 < Math.ceil(arrayList2.size() / 10.0f); i34++) {
                                            int i35 = i34 * 10;
                                            int min2 = Math.min(10, arrayList2.size() - i35);
                                            long nextLong2 = Utilities.random.nextLong();
                                            for (int i36 = 0; i36 < min2; i36++) {
                                                int i37 = i35 + i36;
                                                if (i37 < arrayList2.size()) {
                                                    ((MessageObject) arrayList2.get(i37)).messageOwner.grouped_id = nextLong2;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j14;
                                    z10 = false;
                                    z11 = true;
                                }
                            }
                            messageObject4 = null;
                            if (arrayList2.size() > 1) {
                            }
                            j10 = j14;
                            z10 = false;
                            z11 = true;
                        } else {
                            j10 = j14;
                            messageObject4 = null;
                            z10 = false;
                            z11 = false;
                        }
                    }
                }
                z10 = false;
            }
            if (arrayList2.isEmpty()) {
                return false;
            }
            l80 F = l80.F(viVar.containerView, c6Var, fiVar);
            if (messageObject4 != null) {
                ni niVar2 = viVar.B0;
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (niVar2 == chatAttachAlertPhotoLayout2 || niVar2 == viVar.q0) {
                    uc0 uc0Var = new uc0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), c6Var);
                    TLRPC.Message message = messageObject4.messageOwner;
                    boolean z18 = viVar.c0;
                    message.invert_media = z18;
                    uc0Var.a(!z18, false);
                    uc0Var.setOnClickListener(new bi.x(viVar, messageObject4, uc0Var, 17));
                    F.q(uc0Var);
                    if (viVar.K1 == null) {
                        F.k();
                    }
                }
            } else {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            }
            boolean isUserSelf = UserObject.isUserSelf(user);
            if (viVar.K1 != null || ((foVar != null && ChatObject.isMonoForum(foVar.e)) || ((foVar == null || !foVar.G6()) && !viVar.B0.c()))) {
                j12 = j10;
            } else {
                j12 = j10;
                F.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new a3.i0(viVar, j12, c6Var, 18), false);
            }
            ni niVar3 = viVar.B0;
            if (niVar3 == chatAttachAlertPhotoLayout2 || niVar3 == viVar.q0) {
                z12 = true;
                if (niVar3.getSelectedItemsCount() == 1 && foVar != null && ChatObject.isMonoForum(foVar.e)) {
                    foVar2 = foVar;
                    j13 = j12;
                    F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new bi.b8(viVar, j12, foVar2, c6Var, 8), false);
                } else {
                    j13 = j12;
                    foVar2 = foVar;
                }
            } else {
                j13 = j12;
                foVar2 = foVar;
                z12 = true;
            }
            if (viVar.K1 == null && !isUserSelf) {
                F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new hh(viVar, i15), false);
            }
            if (viVar.K1 == null && z10 && foVar2 != null && ChatObject.isChannelAndNotMegaGroup(foVar2.e) && (chatFull = foVar2.Z7) != null && chatFull.paid_media_allowed) {
                F.c(R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton), null, false);
                org.telegram.ui.ActionBar.e1 y3 = F.y();
                y3.setOnClickListener(new bi.b5(viVar, context, y3, c6Var, 12));
                long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
                if (starsPrice > 0) {
                    y3.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    y3.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
                } else {
                    y3.setText(LocaleController.getString(R.string.PaidMediaButton));
                    y3.setSubtext(null);
                }
                viVar.h0.s(starsPrice);
            }
            F.Y();
            viVar.h0.p(F);
            viVar.h0.q(arrayList2);
            if (viVar.K1 == null && j13 >= 0 && z11) {
                viVar.h0.d(m2Var);
                viVar.h0.o(viVar.Q0);
            }
            viVar.h0.show();
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            return z12;
        }
        return false;
    }

    public static void s(vi viVar) {
        o1.k kVar = viVar.s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(viVar.containerView, o1.h.n, 0.0f);
        viVar.s2 = kVar2;
        kVar2.u.a(1.5f);
        viVar.s2.u.b(1500.0f);
        viVar.s2.h();
    }

    public static /* synthetic */ void t(vi viVar, org.telegram.messenger.video.f fVar) {
        AnimatorSet animatorSet = viVar.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        fVar.run();
    }

    public static /* synthetic */ void u(vi viVar, int i10) {
        viVar.navBarColorKey = -1;
        viVar.navBarColor = i10;
        viVar.containerView.invalidate();
    }

    public static /* synthetic */ void v(vi viVar) {
        viVar.currentSheetAnimation = null;
        viVar.currentSheetAnimationType = 0;
        viVar.dismissInternal();
    }

    public static boolean v1(TLRPC.User user) {
        return (user == null || UserObject.isUserSelf(user) || UserObject.isBot(user) || UserObject.isDeleted(user) || UserObject.isService(user.id) || UserObject.isReplyUser(user) || UserObject.isAnonymous(user) || user.id == UserObject.VERIFY || MessagesController.isSupportUser(user)) ? false : true;
    }

    public static void w(vi viVar) {
        if (viVar.j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(S);
                        for (int i10 = 0; i10 < chatAttachAlertPhotoLayout.E.getChildCount(); i10++) {
                            View childAt = chatAttachAlertPhotoLayout.E.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.t5) {
                                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                                if (t5Var.getPhotoEntry() == photoEntry) {
                                    t5Var.getImageView().invalidate();
                                }
                            }
                        }
                    }
                }
            }
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
            SharedConfig.photoLiveDefault = z10;
            edit.putBoolean("photoLiveDefault", z10).apply();
            chatAttachAlertPhotoLayout.v0();
        }
        viVar.c2(true);
        org.telegram.ui.ActionBar.u0 u0Var = viVar.f1;
        di.d4 d4Var = viVar.g1;
        if (d4Var != null) {
            d4Var.e(true);
        }
        di.d4 d4Var2 = new di.d4(viVar.getContext(), 1);
        viVar.g1 = d4Var2;
        d4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(!S ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        viVar.g1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        viVar.g1.m(1.0f, -((viVar.containerView.getWidth() - ((u0Var.getWidth() / 2.0f) + u0Var.getX())) - AndroidUtilities.dp(14.0f)));
        viVar.g1.setTranslationY(viVar.d1.getTranslationY());
        di.d4 d4Var3 = viVar.g1;
        d4Var3.l0 = new org.telegram.ui.vp(14, viVar, d4Var2);
        viVar.containerView.addView(d4Var3, w7.z5.a(60.0f, 0.0f, 46.0f, 0.0f, 0.0f, -1, 48));
        viVar.g1.u();
    }

    public static /* synthetic */ void x(vi viVar, boolean z10, hh hhVar) {
        viVar.B0.v(1.0f);
        viVar.C0.v(1.0f);
        viVar.B0.l(viVar.o2);
        viVar.C0.l(viVar.o2);
        viVar.containerView.invalidate();
        viVar.a1.setTag(z10 ? 1 : null);
        hhVar.run();
    }

    public static void y(vi viVar, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        yh yhVar = viVar.B1;
        ni[] niVarArr = viVar.z0;
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
        org.telegram.ui.ActionBar.m2 R = m2Var == null ? LaunchActivity.R() : m2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (view instanceof pi) {
            Activity parentActivity = R.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!viVar.O1 && !viVar.P1 && viVar.c1()) {
                    return;
                }
                if (!viVar.O1 && !viVar.P1) {
                    jo joVar = new jo(1, viVar.getContext(), c6Var, viVar);
                    viVar.T = joVar;
                    viVar.U1(joVar);
                }
                viVar.U1(viVar.j0);
            } else if (intValue == 17) {
                if (viVar.w0 == null && (m2Var instanceof org.telegram.ui.fo)) {
                    TLRPC.User i10 = ((org.telegram.ui.fo) m2Var).i();
                    if (v1(i10)) {
                        cl clVar = new cl(viVar, viVar.getContext(), viVar.M1, i10, c6Var);
                        viVar.w0 = clVar;
                        niVarArr[11] = clVar;
                    }
                }
                ni niVar = viVar.w0;
                if (niVar != null) {
                    viVar.U1(niVar);
                }
            } else if (intValue == 3) {
                if (!viVar.Q1 && viVar.c1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(viVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                viVar.E1(true);
            } else if (intValue == 4) {
                if (!viVar.N1 && viVar.c1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(viVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                viVar.H1(true);
            } else if (intValue == 5) {
                if (!viVar.T1 && viVar.c1()) {
                    return;
                }
                if (viVar.T1 && viVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(viVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                viVar.G1();
            } else if (intValue == 6) {
                if ((!viVar.T1 && viVar.c1()) || !AndroidUtilities.isMapsInstalled(m2Var)) {
                    return;
                }
                if (viVar.T1) {
                    if (viVar.o0 == null) {
                        tl tlVar = new tl(viVar, viVar.getContext(), c6Var, (viVar.H || viVar.U1) ? false : true);
                        viVar.o0 = tlVar;
                        niVarArr[5] = tlVar;
                        ol olVar = viVar.w2;
                        if (olVar != null) {
                            tlVar.setDelegate(olVar);
                        } else {
                            tlVar.setDelegate(new eh(viVar, 9));
                        }
                    }
                    viVar.U1(viVar.o0);
                } else {
                    jo joVar2 = new jo(6, viVar.getContext(), c6Var, viVar);
                    viVar.T = joVar2;
                    viVar.U1(joVar2);
                }
            } else if (intValue == 9) {
                if (!viVar.R1 && viVar.c1()) {
                    return;
                }
                if (viVar.R1) {
                    viVar.W1(true, null);
                } else {
                    jo joVar3 = new jo(9, viVar.getContext(), c6Var, viVar);
                    viVar.T = joVar3;
                    viVar.U1(joVar3);
                }
            } else if (intValue == 11) {
                if (viVar.s0 == null) {
                    ig.i0 i0Var = new ig.i0(viVar.getContext(), viVar.resourcesProvider, viVar);
                    viVar.s0 = i0Var;
                    niVarArr[7] = i0Var;
                    i0Var.setupBlurredSearchField(viVar.J2);
                }
                viVar.U1(viVar.s0);
            } else if (intValue == 12) {
                if (!viVar.S1 && viVar.c1()) {
                    return;
                }
                if (viVar.S1) {
                    if (viVar.n0 == null) {
                        io ioVar = new io(viVar, viVar.getContext(), true, c6Var, null);
                        viVar.n0 = ioVar;
                        niVarArr[1] = ioVar;
                        ioVar.setDelegate(new eh(viVar, 10));
                    }
                    viVar.U1(viVar.n0);
                } else {
                    jo joVar4 = new jo(9, viVar.getContext(), c6Var, viVar);
                    viVar.T = joVar4;
                    viVar.U1(joVar4);
                }
            } else if (intValue == 13) {
                if (viVar.u0 == null) {
                    qk qkVar = new qk(viVar, viVar.getContext(), c6Var, true);
                    viVar.u0 = qkVar;
                    niVarArr[8] = qkVar;
                    qkVar.setDelegate(viVar.d2);
                }
                viVar.U1(viVar.u0);
            } else if (intValue == 14) {
                if (viVar.t0 == null) {
                    qk qkVar2 = new qk(viVar, viVar.getContext(), c6Var, false);
                    viVar.t0 = qkVar2;
                    niVarArr[9] = qkVar2;
                    qkVar2.setDelegate(viVar.d2);
                }
                viVar.U1(viVar.t0);
            } else if (intValue == 16) {
                if (viVar.v0 == null) {
                    ji.r rVar = new ji.r(viVar.M1, viVar.getContext(), c6Var, viVar);
                    viVar.v0 = rVar;
                    niVarArr[10] = rVar;
                }
                viVar.U1(viVar.v0);
            } else if (view.getTag() instanceof Integer) {
                viVar.c2.b0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, viVar.u1(), false, 0L);
            }
        } else if (view instanceof oi) {
            oi oiVar = (oi) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = oiVar.c;
            if (tL_attachMenuBot == null) {
                viVar.c2.U(oiVar.b);
                viVar.dismiss();
            } else if (tL_attachMenuBot.inactive) {
                uj1.a(viVar.getContext(), new org.telegram.ui.uc(16, viVar, oiVar), null);
            } else {
                viVar.R1(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int dp = AndroidUtilities.dp(70.0f);
        int i11 = left - dp;
        if (i11 < 0) {
            yhVar.v0(i11, 0, null);
            return;
        }
        int i12 = right + dp;
        if (i12 > yhVar.getMeasuredWidth()) {
            yhVar.v0(i12 - yhVar.getMeasuredWidth(), 0, null);
        }
    }

    public static /* synthetic */ void z(vi viVar) {
        ni niVar;
        en enVar;
        viVar.w1 = null;
        ni niVar2 = viVar.B0;
        if (niVar2 != viVar.j0 && (niVar = viVar.C0) != (enVar = viVar.q0) && niVar2 != niVar && niVar2 != enVar) {
            viVar.containerView.removeView(niVar2);
        }
        viVar.B0.setVisibility(8);
        viVar.B0.t();
        viVar.C0.I();
        viVar.B0 = viVar.C0;
        viVar.C0 = null;
        int[] iArr = viVar.e2;
        iArr[0] = iArr[1];
        viVar.K1(viVar.c0, false);
        viVar.a2();
    }

    public final void A1() {
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.z0;
            if (i10 >= niVarArr.length) {
                this.i2 = true;
                return;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.B();
            }
            i10++;
        }
    }

    public final void B1() {
        int i10 = 0;
        this.i2 = false;
        while (true) {
            ni[] niVarArr = this.z0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.D();
            }
            i10++;
        }
        if (isShowing()) {
            this.c2.w();
        }
        si siVar = this.D1;
        if (siVar != null) {
            siVar.l();
        }
    }

    public final void C1() {
        MessageObject messageObject = this.K1;
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        int i10 = this.M1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.K1.getDialogId()) && (m2Var instanceof org.telegram.ui.fo)) {
            org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
            MessageSuggestionParams messageSuggestionParams = foVar.g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.K1.messageOwner.suggested_post);
            }
            if (!zh.n5.U(i10, messageSuggestionParams.amount)) {
                foVar.Xb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.L0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (MessagesController.getInstance(i10).premiumFeaturesBlocked() || MessagesController.getInstance(i10).captionLengthLimitPremium <= this.L) {
                return;
            }
            S1(m2Var);
            return;
        }
        if (this.K1 == null && (m2Var instanceof org.telegram.ui.fo)) {
            org.telegram.ui.fo foVar2 = (org.telegram.ui.fo) m2Var;
            if (foVar2.c()) {
                g5.L(getContext(), foVar2.a(), new eh(this, 12), this.resourcesProvider);
                return;
            }
        }
        ni niVar = this.B0;
        if (niVar == this.j0 || niVar == this.q0) {
            J1(0, true, 0, u1(), this.Q0);
            return;
        }
        if (niVar.K(0, true, 0, u1(), this.Q0)) {
            return;
        }
        this.D2 = true;
        dismiss();
    }

    public final void D1(int i10) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (i10 == 3) {
            if (this.Q1 || !c1()) {
                Activity parentActivity = m2Var != null ? m2Var.getParentActivity() : null;
                if (parentActivity != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                E1(true);
                return;
            }
            return;
        }
        if (i10 == 6 && AndroidUtilities.isMapsInstalled(m2Var)) {
            if (this.o0 == null) {
                tl tlVar = new tl(this, getContext(), this.resourcesProvider, (this.H || this.U1) ? false : true);
                this.o0 = tlVar;
                this.z0[5] = tlVar;
                ol olVar = this.w2;
                if (olVar != null) {
                    tlVar.setDelegate(olVar);
                } else if (m2Var instanceof org.telegram.ui.fo) {
                    tlVar.setDelegate(new eh(this, 16));
                }
            }
            U1(this.o0);
        }
    }

    public final void E1(boolean z10) {
        if (!this.Q1 && z10) {
            jo joVar = new jo(3, getContext(), this.resourcesProvider, this);
            this.T = joVar;
            U1(joVar);
        }
        int i10 = 1;
        if (this.l0 == null) {
            hj hjVar = new hj(getContext(), this.resourcesProvider, this);
            this.l0 = hjVar;
            this.z0[3] = hjVar;
            hjVar.setupBlurredSearchField(this.J2);
            this.l0.setDelegate(new eh(this, 13));
            if (this.H) {
                this.l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            TLRPC.Chat chat = ((org.telegram.ui.fo) m2Var).e;
            hj hjVar2 = this.l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                i10 = -1;
            }
            hjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            U1(this.l0);
        }
    }

    public final void F1() {
        if (this.r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
            kj kjVar = new kj(context, c6Var, this);
            kjVar.r = AndroidUtilities.dp(80.0f);
            kjVar.w = 3;
            bi.o0 o0Var = new bi.o0(kjVar, context, c6Var, 11);
            kjVar.n = o0Var;
            bb bbVar = new bb(kjVar, context);
            kjVar.v = bbVar;
            o0Var.setAdapter(bbVar);
            o0Var.setClipToPadding(false);
            o0Var.setItemAnimator(null);
            o0Var.setLayoutAnimation(null);
            o0Var.setVerticalScrollBarEnabled(false);
            o0Var.setGlowColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A5, kjVar.a));
            kjVar.addView(o0Var, w7.z5.d(-1.0f, -1));
            o0Var.setOnScrollListener(new ah.d0(kjVar, 18));
            ci.k kVar = new ci.k(kjVar, kjVar.r, 1);
            kjVar.s = kVar;
            kVar.O = new di.w1(kjVar, 2);
            o0Var.setLayoutManager(kVar);
            this.r0 = kjVar;
            kjVar.setDelegate(new ib(this, 1));
        }
        U1(this.r0);
    }

    public final void G1() {
        if (!this.T1) {
            jo joVar = new jo(5, getContext(), this.resourcesProvider, this);
            this.T = joVar;
            U1(joVar);
        }
        if (this.k0 == null) {
            zj zjVar = new zj(getContext(), this.resourcesProvider, this);
            this.k0 = zjVar;
            this.z0[2] = zjVar;
            zjVar.setupBlurredSearchField(this.J2);
            this.k0.setDelegate(new hi(this));
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            TLRPC.Chat chat = ((org.telegram.ui.fo) m2Var).e;
            this.k0.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        U1(this.k0);
    }

    public final void H1(boolean z10) {
        if (!this.N1 && z10) {
            jo joVar = new jo(4, getContext(), this.resourcesProvider, this);
            this.T = joVar;
            U1(joVar);
        }
        boolean z11 = false;
        if (this.p0 == null) {
            pk pkVar = new pk(this.N ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.p0 = pkVar;
            this.z0[4] = pkVar;
            pkVar.setDelegate(new ii(this));
        }
        int i10 = 1;
        if (this.H) {
            this.p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.m2 m2Var = this.f0;
            if (m2Var instanceof org.telegram.ui.fo) {
                TLRPC.Chat chat = ((org.telegram.ui.fo) m2Var).e;
                pk pkVar2 = this.p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                    i10 = -1;
                }
                pkVar2.setMaxSelectedFiles(i10);
            } else {
                this.p0.setMaxSelectedFiles(this.V1);
                pk pkVar3 = this.p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                pkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        pk pkVar4 = this.p0;
        pkVar4.d0 = this.N;
        if (z10) {
            U1(pkVar4);
        }
    }

    public final void I1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        b8 b8Var = this.a1;
        int i10 = 1;
        if (b8Var.n0) {
            b8Var.h(true);
        }
        this.k0 = null;
        this.s0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.w0 = null;
        while (true) {
            ni[] niVarArr = this.z0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.o();
                this.containerView.removeView(niVarArr[i10]);
                niVarArr[i10] = null;
            }
            i10++;
        }
        X1(false, false);
        super.dismissInternal();
        if (this.x0) {
            this.x0 = false;
            this.y0 = 0.0f;
            org.telegram.ui.ActionBar.m2 m2Var = this.f0;
            if (m2Var == null || m2Var.getFragmentView() == null) {
                return;
            }
            View fragmentView = m2Var.getFragmentView();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(fragmentView);
        }
    }

    public final boolean J1(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        if (this.L1) {
            return false;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
            TLRPC.Chat chat = foVar.e;
            if (foVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(this.M1).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + foVar.a(), !z10).commit();
            }
        }
        if (d1(o1().getText())) {
            return true;
        }
        a1();
        if (this.h.f) {
            this.L1 = true;
            this.c2.b0(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long p12 = p1();
        ni niVar = this.B0;
        return g5.a0(this.M1, p12, l1() + (niVar != null ? niVar.getSelectedItemsCount() : 1), new Utilities.Callback() { // from class: org.telegram.ui.Components.rh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                vi viVar = vi.this;
                viVar.L1 = true;
                viVar.c2.b0(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void K1(boolean z10, boolean z11) {
        this.b.a(z10, z11);
        vu o12 = o1();
        this.c0 = z10;
        vu o13 = o1();
        final boolean z12 = this.G0.getTag() != null;
        ni niVar = this.B0;
        final boolean z13 = this.c0 && (niVar == this.j0 || niVar == this.q0);
        ah.v vVar = this.R0;
        ig.j jVar = this.F0;
        if (z11) {
            vVar.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = vVar.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            es esVar = es.h;
            final int i10 = 0;
            duration.setInterpolator(esVar).setUpdateListener(new fh(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.gh
                public final /* synthetic */ vi b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            vi viVar = this.b;
                            if (!z13 || !z12) {
                                viVar.R0.setVisibility(8);
                            }
                            viVar.f2();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.b.F0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            jVar.setVisibility(0);
            ViewPropertyAnimator interpolator = jVar.animate().translationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(esVar);
            final int i11 = 1;
            interpolator.setUpdateListener(new fh(this, i11)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.gh
                public final /* synthetic */ vi b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            vi viVar = this.b;
                            if (!z13 || !z12) {
                                viVar.R0.setVisibility(8);
                            }
                            viVar.f2();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.b.F0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
        } else {
            vVar.setVisibility((z13 && z12) ? 0 : 8);
            vVar.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            f2();
            jVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            jVar.setTranslationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f);
            jVar.setVisibility((z13 || !z12) ? 8 : 0);
        }
        if (o12 != o13) {
            o12.k(true);
            o13.setText(b6.cloneSpans(o12.getText()));
            o13.getEditText().setAllowTextEntitiesIntersection(o12.getEditText().getAllowTextEntitiesIntersection());
            if (o12.getEditText().isFocused()) {
                o13.getEditText().requestFocus();
                o13.getEditText().setSelection(o12.getEditText().getSelectionStart(), o12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new hh(this, 0));
    }

    public final void L1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.j0) != null) {
            chatAttachAlertPhotoLayout.Z();
        }
        if (this.K1 == messageObject && this.J1 == i10) {
            return;
        }
        this.K1 = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            i10 = this.K1.isMusic() ? 2 : this.K1.isDocument() ? 1 : 0;
        }
        this.J1 = i10;
        if (this.K1 != null) {
            this.V1 = 1;
            this.W1 = false;
        } else {
            this.V1 = -1;
            this.W1 = true;
        }
        this.D1.l();
        Z1(0);
    }

    public final void M1(float f7) {
        int i10;
        float translationY = this.containerView.getTranslationY() - this.y0;
        this.y0 = this.containerView.getHeight() * f7;
        this.containerView.setTranslationY(translationY);
        cl clVar = this.w0;
        if (clVar != null) {
            clVar.setSendTransitionProgress(f7);
        }
        org.telegram.ui.ActionBar.d3 d3Var = this.backDrawable;
        if (this.dimBehind) {
            i10 = Math.round((1.0f - f7) * this.dimBehindAlpha);
        } else {
            i10 = 0;
        }
        d3Var.setAlpha(i10);
        this.navigationBarAlpha = 1.0f - f7;
        getContainer().invalidate();
    }

    public final void N1(int i10, boolean z10) {
        if (this.K1 != null) {
            return;
        }
        this.V1 = i10;
        this.W1 = z10;
    }

    public final void O1(float f7) {
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.navBarColor = k10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        getContainer().invalidate();
    }

    public final void P1(String str) {
        this.T0 = 1;
        this.F = true;
        this.V0 = false;
        this.P1 = false;
        this.A1.setVisibility(8);
        this.m1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout != null) {
            vi viVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.g1 = (viVar.T0 == 0 || viVar.F) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q1(boolean z10) {
        boolean z11;
        if (z10) {
            org.telegram.ui.ActionBar.m2 m2Var = this.f0;
            if ((m2Var instanceof org.telegram.ui.fo) && !((org.telegram.ui.fo) m2Var).x()) {
                z11 = true;
                if (this.B2 != z11) {
                    return;
                }
                if (z11) {
                    MessagesController.getInstance(this.M1).getTonesController().load();
                }
                this.B2 = z11;
                ImageView imageView = this.w;
                imageView.setVisibility(0);
                ImageView imageView2 = this.y;
                imageView2.setVisibility(0);
                ViewPropertyAnimator scaleY = imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f);
                es esVar = es.h;
                scaleY.setInterpolator(esVar).setDuration(420L).withEndAction(new qh(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(esVar).setDuration(420L).withEndAction(new qh(this, z11, 2)).start();
                if (z11) {
                    i0 i0Var = this.x;
                    Objects.requireNonNull(i0Var);
                    imageView.postDelayed(new h0(i0Var, 1), 220L);
                    i0 i0Var2 = this.E;
                    Objects.requireNonNull(i0Var2);
                    imageView2.postDelayed(new h0(i0Var2, 1), 220L);
                    return;
                }
                return;
            }
        }
        z11 = false;
        if (this.B2 != z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1(long j10, String str, boolean z10, boolean z11) {
        boolean z12;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.A0;
        int i10 = 2;
        int i11 = 1;
        if (longSparseArray.get(j10) != null && Objects.equals(str, ((fi.q4) longSparseArray.get(j10)).getStartCommand())) {
            fi.q4 q4Var = (fi.q4) longSparseArray.get(j10);
            if (q4Var.H) {
                q4Var.H = false;
            }
            z12 = true;
            if (longSparseArray.get(j10) != null) {
                ((fi.q4) longSparseArray.get(j10)).J.setSwipeOffsetAnimationDisallowed(z12);
                V1((ni) longSparseArray.get(j10), -j10, z11);
                if (z10) {
                    fi.q4 q4Var2 = (fi.q4) longSparseArray.get(j10);
                    TLRPC.User user = MessagesController.getInstance(q4Var2.F).getUser(Long.valueOf(q4Var2.v));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(q4Var2.F).getAttachMenuBots().bots;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            tL_attachMenuBot = null;
                            break;
                        }
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i12);
                        i12++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                        if (tL_attachMenuBot.bot_id == q4Var2.v) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z13 = tL_attachMenuBot.show_in_side_menu;
                    AndroidUtilities.runOnUIThread(new fi.q3(i10, q4Var2, (z13 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name) : z13 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
            fi.q4 q4Var3 = new fi.q4(context, c6Var, this);
            q4Var3.U = new fi.h4(q4Var3, i10);
            org.telegram.ui.ActionBar.u0 a2 = q4Var3.b.a1.n().a(0, R.drawable.ic_ab_other);
            q4Var3.K = a2;
            a2.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
            org.telegram.ui.ActionBar.e1 e = a2.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
            q4Var3.L = e;
            e.setVisibility(8);
            a2.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
            org.telegram.ui.ActionBar.e1 e7 = a2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            q4Var3.M = e7;
            e7.setVisibility(8);
            a2.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
            a2.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
            a2.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
            fi.b3 b3Var = new fi.b3(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, q4Var3.a), 1, context, q4Var3, c6Var);
            q4Var3.n = b3Var;
            fi.a3 a3Var = new fi.a3(q4Var3, context, i11);
            q4Var3.J = a3Var;
            z12 = true;
            a3Var.addView(b3Var, w7.z5.d(-1.0f, -1));
            a3Var.setScrollListener(new fi.h4(q4Var3, 3));
            a3Var.setScrollEndListener(new fi.h4(q4Var3, 4));
            a3Var.setDelegate(new fi.j4(q4Var3));
            a3Var.setIsKeyboardVisible(new fi.j4(q4Var3));
            q4Var3.addView(a3Var, w7.z5.d(-1.0f, -1));
            fi.k4 k4Var = new fi.k4(context, c6Var);
            q4Var3.I = k4Var;
            q4Var3.addView(k4Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 84.0f, -1, 80));
            b3Var.setWebViewProgressListener(new di.c5(q4Var3, i10));
            NotificationCenter.getGlobalInstance().addObserver(q4Var3, NotificationCenter.didSetNewTheme);
            longSparseArray.put(j10, q4Var3);
            ((fi.q4) longSparseArray.get(j10)).setDelegate(new bi(this, q4Var3, str, j10));
            org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
            MessageObject replyingMessageObject = foVar.Y.getReplyingMessageObject();
            fi.q4 q4Var4 = (fi.q4) longSparseArray.get(j10);
            long a10 = foVar.a();
            int i13 = replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0;
            long S8 = foVar.S8();
            fi.b3 b3Var2 = q4Var4.n;
            int i14 = this.M1;
            q4Var4.F = i14;
            q4Var4.w = a10;
            q4Var4.v = j10;
            q4Var4.y = i13;
            q4Var4.E = S8;
            q4Var4.G = str;
            org.telegram.ui.ActionBar.e1 e1Var = q4Var4.M;
            if (e1Var != null) {
                if (MediaDataController.getInstance(i14).canCreateAttachedMenuBotShortcut(j10)) {
                    e1Var.setVisibility(0);
                } else {
                    e1Var.setVisibility(8);
                }
            }
            b3Var2.setBotUser(MessagesController.getInstance(i14).getUser(Long.valueOf(j10)));
            b3Var2.s(i14, j10);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(i14).getInputPeer(a10);
            tL_messages_requestWebView.bot = MessagesController.getInstance(i14).getInputUser(j10);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a10 < 0 && (chatFull = MessagesController.getInstance(i14).getChatFull(-a10)) != null && (peer = chatFull.default_send_as) != null) {
                tL_messages_requestWebView.send_as = MessagesController.getInstance(i14).getInputPeer(peer);
                tL_messages_requestWebView.flags |= 8192;
            }
            if (str != null) {
                tL_messages_requestWebView.start_param = str;
                tL_messages_requestWebView.flags |= 8;
            }
            if (i13 != 0) {
                TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(i14).createReplyInput(i13);
                tL_messages_requestWebView.reply_to = createReplyInput;
                if (S8 != 0) {
                    createReplyInput.monoforum_peer_id = MessagesController.getInstance(i14).getInputPeer(S8);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (S8 != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(i14).getInputPeer(S8);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject q6 = fi.k3.q(q4Var4.a, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i14).sendRequest(tL_messages_requestWebView, new bi.u7(q4Var4, i14, i10));
            NotificationCenter.getInstance(i14).addObserver(q4Var4, NotificationCenter.webViewResultSent);
            if (longSparseArray.get(j10) != null) {
            }
        }
        z12 = true;
        if (longSparseArray.get(j10) != null) {
        }
    }

    public final void S1(org.telegram.ui.ActionBar.m2 m2Var) {
        if ((m2Var instanceof org.telegram.ui.fo) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.fo) m2Var).e)) {
            new zc(this.u1, this.resourcesProvider).f(MessagesController.getInstance(this.M1).captionLengthLimitPremium, new org.telegram.ui.vp(15, this, m2Var)).j();
        }
    }

    public final boolean T1(boolean z10, boolean z11) {
        float f7;
        int i10;
        ni niVar;
        b8 b8Var;
        this.c.a(z10, true);
        xh xhVar = this.G0;
        if (z10 == (xhVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.P0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        xhVar.setTag(z10 ? 1 : null);
        ai aiVar = this.H0;
        if (aiVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(aiVar.getEditText());
        }
        aiVar.k(true);
        this.S0.k(true);
        xh xhVar2 = this.A1;
        xh xhVar3 = this.K0;
        if (z10) {
            if (!this.N) {
                xhVar.setVisibility(0);
            }
            xhVar3.setVisibility(0);
        } else if (this.V0) {
            xhVar2.setVisibility(0);
        }
        ni niVar2 = this.B0;
        boolean z12 = (niVar2 == this.j0 || niVar2 == this.q0) && this.c0;
        b8 b8Var2 = this.a1;
        ah.v vVar = this.R0;
        ig.j jVar = this.F0;
        fi fiVar = this.L0;
        if (z11) {
            this.P0 = new AnimatorSet();
            if (z12) {
                vVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(xhVar, (Property<xh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<ig.j, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                b8Var = b8Var2;
            } else {
                jVar.setVisibility(0);
                b8Var = b8Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<ig.j, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(vVar, (Property<ah.v, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(xhVar3, (Property<xh, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(xhVar3, (Property<xh, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(xhVar3, (Property<xh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(fiVar, (Property<fi, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(fiVar, (Property<fi, Float>) property3, z10 ? 1.0f : 0.2f));
            if (b8Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(xhVar, (Property<xh, Float>) View.TRANSLATION_Y, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.V0) {
                arrayList.add(ObjectAnimator.ofFloat(xhVar2, (Property<xh, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(xhVar2, (Property<xh, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new fh(this, 5));
                arrayList.add(ofFloat);
            }
            this.P0.playTogether(arrayList);
            this.P0.setInterpolator(new DecelerateInterpolator());
            this.P0.setDuration(180L);
            this.P0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.P0.start();
            i10 = 0;
        } else {
            xhVar.setAlpha(z10 ? 1.0f : 0.0f);
            jVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            if (!z10 || z12) {
                f7 = 0.0f;
                i10 = 0;
            } else {
                i10 = 0;
                jVar.setVisibility(0);
                f7 = 0.0f;
                jVar.setTranslationY(0.0f);
            }
            xhVar3.setScaleX(z10 ? 1.0f : 0.2f);
            xhVar3.setScaleY(z10 ? 1.0f : 0.2f);
            xhVar3.setAlpha(z10 ? 1.0f : f7);
            vVar.setVisibility((z10 && z12) ? i10 : 8);
            vVar.setAlpha((z10 && z12) ? 1.0f : f7);
            fiVar.setScaleX(z10 ? 1.0f : 0.2f);
            fiVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (b8Var2.getTag() != null) {
                xhVar.setTranslationY(z10 ? f7 : AndroidUtilities.dp(48.0f));
            } else if (this.V0 && ((niVar = this.B0) == null || niVar.L())) {
                xhVar2.setTranslationY(z10 ? AndroidUtilities.dp(84.0f) : f7);
            }
            if (!z10) {
                xhVar.setVisibility(4);
                xhVar3.setVisibility(4);
            }
            if (z12) {
                f2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.B0.getSelectedItemsCount());
        }
        fiVar.g(i10, z11);
        fiVar.i(l1() + this.B0.getSelectedItemsCount(), this.K1 != null ? 0L : MessagesController.getInstance(this.M1).getSendPaidMessagesStars(p1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aiVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), fiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            aiVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void U1(ni niVar) {
        long j10 = this.Z0;
        jo joVar = this.T;
        if (niVar == joVar) {
            j10 = joVar.s;
        } else if (niVar == this.j0) {
            j10 = 1;
        } else if (niVar == this.l0) {
            j10 = 3;
        } else if (niVar == this.p0) {
            j10 = 4;
        } else if (niVar == this.k0) {
            j10 = 5;
        } else if (niVar == this.o0) {
            j10 = 6;
        } else if (niVar == this.m0) {
            j10 = 9;
        } else if (niVar == this.r0) {
            j10 = 10;
        } else if (niVar == this.s0) {
            j10 = 11;
        } else if (niVar == this.n0) {
            j10 = 12;
        } else if (niVar == this.t0) {
            j10 = 14;
        } else if (niVar == this.u0) {
            j10 = 13;
        } else if (niVar == this.v0) {
            j10 = 16;
        } else if (niVar == this.w0) {
            j10 = 17;
        }
        V1(niVar, j10, true);
    }

    public final void V1(ni niVar, long j10, boolean z10) {
        int i10;
        qm qmVar;
        qm qmVar2;
        int i11;
        Float f7;
        int i12;
        Float valueOf = Float.valueOf(0.0f);
        if (this.w1 == null && this.P0 == null) {
            ni niVar2 = this.B0;
            if (niVar2 == niVar) {
                niVar2.J();
                return;
            }
            if (niVar == this.n0 && !UserConfig.getInstance(this.M1).isPremium()) {
                new sg.y0(this.f0, 39, false).show();
                return;
            }
            this.f.a(j10 == 1, z10);
            this.n.h(Long.valueOf(j10), z10);
            this.G1 = false;
            this.E1 = false;
            this.I1 = 0.0f;
            this.H1.setVisibility(8);
            RadialProgressView radialProgressView = this.F1;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            xh xhVar = this.A1;
            xhVar.setAlpha(1.0f);
            xhVar.setTranslationY(this.I1);
            int i13 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.A0;
                if (i13 >= longSparseArray.size()) {
                    break;
                }
                ((fi.q4) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                i13++;
            }
            this.Z0 = j10;
            yh yhVar = this.B1;
            int childCount = yhVar.getChildCount();
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = yhVar.getChildAt(i14);
                if (childAt instanceof pi) {
                    pi piVar = (pi) childAt;
                    i12 = childCount;
                    f7 = valueOf;
                    piVar.a.e(((long) piVar.b) == piVar.c.Z0, true);
                } else {
                    f7 = valueOf;
                    i12 = childCount;
                    if (childAt instanceof oi) {
                        ((oi) childAt).a(true);
                    }
                }
                i14++;
                childCount = i12;
                valueOf = f7;
            }
            Float f10 = valueOf;
            int firstOffset = (this.B0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.e2[0];
            this.C0 = niVar;
            boolean e = niVar.e();
            kh.f fVar = this.y1;
            if (fVar != null) {
                fVar.setFadeHeightBottom(e ? 0 : AndroidUtilities.dp(48.0f));
            }
            int i15 = 4;
            zh zhVar = this.z1;
            if (zhVar != null) {
                zhVar.setVisibility(e ? 4 : 0);
            }
            int i16 = this.C0.i() != 0 ? 0 : 4;
            b8 b8Var = this.a1;
            b8Var.setVisibility(i16);
            if (b8Var.n0) {
                b8Var.h(true);
            }
            this.B0.u();
            ni niVar3 = this.C0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if (niVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.C0.G(this.B0);
            this.C0.setVisibility(0);
            if (niVar.getParent() != null) {
                this.containerView.removeView(this.C0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.B0);
            ViewParent parent = this.C0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                ni niVar4 = this.C0;
                if (niVar4 != this.o0) {
                    indexOfChild++;
                }
                i10 = 0;
                viewGroup.addView(niVar4, indexOfChild, w7.z5.d(-1.0f, -1));
            } else {
                i10 = 0;
            }
            hh hhVar = new hh(this, i15);
            ni niVar5 = this.B0;
            boolean z11 = niVar5 instanceof en;
            ji jiVar = this.e0;
            if (z11 || (this.C0 instanceof en)) {
                int max = Math.max(this.C0.getWidth(), this.B0.getWidth());
                ni niVar6 = this.C0;
                if (niVar6 instanceof en) {
                    niVar6.setTranslationX(max);
                    ni niVar7 = this.B0;
                    if ((niVar7 instanceof ChatAttachAlertPhotoLayout) && (qmVar2 = ((ChatAttachAlertPhotoLayout) niVar7).P) != null) {
                        qmVar2.setVisibility(4);
                    }
                } else {
                    this.B0.setTranslationX(-max);
                    ni niVar8 = this.C0;
                    if (niVar8 == chatAttachAlertPhotoLayout && (qmVar = ((ChatAttachAlertPhotoLayout) niVar8).P) != null) {
                        qmVar.setVisibility(0);
                    }
                }
                this.C0.setAlpha(1.0f);
                this.B0.setAlpha(1.0f);
                if (z10) {
                    ni niVar9 = this.B0;
                    jiVar.getClass();
                    jiVar.a(niVar9, f10);
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this, niVar, hhVar, 16));
                } else {
                    boolean z12 = this.C0.getCurrentItemTop() <= niVar.getButtonsHideOffset();
                    this.B0.v(1.0f);
                    this.C0.v(1.0f);
                    this.B0.l(this.o2);
                    this.C0.l(this.o2);
                    this.containerView.invalidate();
                    ni niVar10 = this.B0;
                    Float valueOf2 = Float.valueOf(1.0f);
                    jiVar.getClass();
                    jiVar.a(niVar10, valueOf2);
                    b8Var.setTag(z12 ? 1 : null);
                    hhVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.C0.setAlpha(0.0f);
                this.C0.setTranslationY(AndroidUtilities.dp(78.0f));
                ni niVar11 = this.B0;
                Property property = View.TRANSLATION_Y;
                float[] fArr = new float[1];
                fArr[i10] = AndroidUtilities.dp(78.0f) + firstOffset;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(niVar11, (Property<ni, Float>) property, fArr);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B0, jiVar, 0.0f, 1.0f);
                Property property2 = View.ALPHA;
                float[] fArr2 = new float[2];
                fArr2[i10] = b8Var.getAlpha();
                fArr2[1] = 0.0f;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b8Var, (Property<b8, Float>) property2, fArr2);
                Animator[] animatorArr = new Animator[3];
                animatorArr[i10] = ofFloat;
                animatorArr[1] = ofFloat2;
                animatorArr[2] = ofFloat3;
                animatorSet.playTogether(animatorArr);
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(es.f);
                animatorSet.addListener(new gi(this, firstOffset, hhVar, i10));
                this.w1 = animatorSet;
                ni niVar12 = this.B0;
                jiVar.getClass();
                jiVar.a(niVar12, f10);
                animatorSet.start();
            } else {
                niVar5.setAlpha(0.0f);
                hhVar.run();
                e2(i10);
                this.containerView.invalidate();
            }
            if (!this.p2 || (niVar instanceof fi.q4)) {
                i11 = 0;
            } else {
                i11 = 0;
                this.p2 = false;
                b8Var.d();
                b8Var.invalidate();
                x1();
            }
            b8Var.setForcedMenuWidth((j10 == 1 || j10 == 6 || j10 == 17 || (niVar instanceof fi.q4)) ? AndroidUtilities.dp(46.0f) : j10 == 4 ? AndroidUtilities.dp(84.0f) : i11);
        }
    }

    public final void W1(boolean z10, Boolean bool) {
        vi viVar;
        if (this.m0 == null) {
            viVar = this;
            io ioVar = new io(viVar, getContext(), false, this.resourcesProvider, bool);
            viVar.m0 = ioVar;
            viVar.z0[1] = ioVar;
            ioVar.setDelegate(new eh(this, 15));
        } else {
            viVar = this;
        }
        V1(viVar.m0, 9L, z10);
    }

    public final void X1(boolean z10, boolean z11) {
        ni niVar;
        this.d.a(z10, z11);
        b8 b8Var = this.a1;
        if (!(z10 && b8Var.getTag() == null) && (z10 || b8Var.getTag() == null)) {
            return;
        }
        b8Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet = this.b1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.b1 = null;
        }
        boolean z12 = (this.F || this.W0 || (this.T0 == 0 && this.t1) || this.B0 != this.j0 || (!this.O1 && !this.P1)) ? false : true;
        if (this.B0 == this.T) {
            z12 = false;
        }
        xh xhVar = this.A1;
        org.telegram.ui.ActionBar.u0 u0Var = this.d1;
        if (z10) {
            if (z12) {
                u0Var.setVisibility(0);
                u0Var.setClickable(true);
            }
        } else if (this.V0 && this.G0.getTag() == null) {
            xhVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (m2Var != null) {
            if (z10) {
                AndroidUtilities.setLightStatusBar(this, i0.a.f(getThemedColor(this.k2 ? org.telegram.ui.ActionBar.g6.tg : org.telegram.ui.ActionBar.g6.h5)) > 0.699999988079071d);
            } else {
                AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
            }
        }
        int i10 = 4;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.b1 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z10 ? 1.0f : 0.0f) - b8Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b8Var, (Property<b8, Float>) property, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new fh(this, i10));
            arrayList.add(ofFloat);
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.b1.playTogether(arrayList);
            this.b1.addListener(new org.telegram.ui.vo(3, this, z10));
            this.b1.setInterpolator(es.h);
            this.b1.setDuration(380L);
            this.b1.start();
            return;
        }
        if (z10 && this.V0 && ((niVar = this.B0) == null || niVar.L())) {
            xhVar.setVisibility(4);
        }
        b8Var.setAlpha(z10 ? 1.0f : 0.0f);
        if (z12) {
            u0Var.setAlpha(z10 ? 1.0f : 0.0f);
            u0Var.setScaleX(z10 ? 1.0f : 0.6f);
            u0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = this.h1;
        if (u0Var2 != null) {
            u0Var2.setVisibility(4);
        }
        if (this.T0 == 0 && this.t1) {
            return;
        }
        u0Var.setVisibility(4);
    }

    public final void Y1() {
        float alpha;
        int[] iArr = this.J0;
        ai aiVar = this.H0;
        aiVar.getLocationOnScreen(iArr);
        if (this.E2 != null) {
            ni niVar = this.B0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if ((niVar == chatAttachAlertPhotoLayout || niVar == this.q0) && this.c0) {
                ah.v vVar = this.R0;
                alpha = (vVar.getAlpha() * vVar.getMeasuredHeight()) + (vVar.getY() - this.E2.getTop());
            } else {
                alpha = -aiVar.getHeight();
            }
            if (Math.abs(this.E2.getTranslationY() - alpha) > 0.5f) {
                this.E2.setTranslationY(alpha);
                this.E2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        i1();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z1(int i10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.w1 != null) {
            return;
        }
        int selectedItemsCount = this.B0.getSelectedItemsCount();
        fi fiVar = this.L0;
        if (selectedItemsCount == 0) {
            fiVar.g(0, i10 != 0);
            T1(false, i10 != 0);
        } else {
            if (T1(true, i10 != 0) || i10 == 0) {
                fiVar.g(selectedItemsCount, i10 != 0);
                fiVar.b();
            } else {
                fiVar.g(selectedItemsCount, true);
                fiVar.b();
            }
        }
        this.B0.E(selectedItemsCount);
        f1(i10 != 0);
        if (this.B0 == this.j0 && ((((z10 = (m2Var = this.f0) instanceof org.telegram.ui.fo)) || this.T0 != 0 || this.W0) && ((selectedItemsCount == 0 && this.t1) || ((selectedItemsCount != 0 || this.T0 != 0 || this.W0) && !this.t1)))) {
            this.t1 = (selectedItemsCount == 0 && this.T0 == 0 && !this.W0) ? false : true;
            AnimatorSet animatorSet = this.c1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.c1 = null;
            }
            int i11 = this.T0;
            b8 b8Var = this.a1;
            org.telegram.ui.ActionBar.u0 u0Var = this.h1;
            if (i11 != 0 && u0Var != null && b8Var.getTag() != null && z10) {
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
                if (!ChatObject.isChannel(foVar.e) || (tL_chatBannedRights = foVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.t1;
                    xh xhVar = this.l1;
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.d1;
                    if (!z12) {
                        if (this.T0 == 0 && !this.W0) {
                            u0Var2.setVisibility(0);
                            u0Var2.setClickable(true);
                        }
                        xhVar.setVisibility(0);
                    } else if (b8Var.getTag() != null && u0Var != null) {
                        u0Var.setVisibility(0);
                    }
                    if (i10 != 0) {
                        if (b8Var.getTag() == null && this.T0 == 0 && !this.W0) {
                            u0Var2.setAlpha(this.t1 ? 1.0f : 0.0f);
                            u0Var2.setScaleX(this.t1 ? 1.0f : 0.6f);
                            u0Var2.setScaleY(this.t1 ? 1.0f : 0.6f);
                        }
                        xhVar.setAlpha(this.t1 ? 1.0f : 0.0f);
                        if (z11) {
                            u0Var.setAlpha(this.t1 ? 0.0f : 1.0f);
                        }
                        if (this.t1 && u0Var != null) {
                            u0Var.setVisibility(4);
                        }
                    } else {
                        this.c1 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (b8Var.getTag() == null && this.T0 == 0 && !this.W0) {
                            arrayList.add(ObjectAnimator.ofFloat(u0Var2, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, this.t1 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(u0Var2, (Property<org.telegram.ui.ActionBar.u0, Float>) View.SCALE_X, this.t1 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(u0Var2, (Property<org.telegram.ui.ActionBar.u0, Float>) View.SCALE_Y, this.t1 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(xhVar, (Property<xh, Float>) property, this.t1 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) property, this.t1 ? 0.0f : 1.0f));
                        }
                        this.c1.playTogether(arrayList);
                        this.c1.addListener(new l6(this, 9));
                        this.c1.setDuration(180L);
                        this.c1.start();
                    }
                }
            }
            z11 = false;
            z12 = this.t1;
            xh xhVar2 = this.l1;
            org.telegram.ui.ActionBar.u0 u0Var22 = this.d1;
            if (!z12) {
            }
            if (i10 != 0) {
            }
        }
        c2(i10 != 0);
        MessageObject messageObject = this.K1;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.M1).getSendPaidMessagesStars(p1()) : 0L;
        ni niVar = this.B0;
        fiVar.i(l1() + (niVar != null ? niVar.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        ai aiVar = this.H0;
        if (aiVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aiVar.getLayoutParams();
            int max = Math.max(AndroidUtilities.dp(48.0f), fiVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                aiVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void a1() {
        if (o1().a.length() <= 0) {
            return;
        }
        this.B0.a(o1().getText());
    }

    public final void a2() {
        float f7;
        ni niVar = this.B0;
        boolean h = niVar == null ? false : niVar.h();
        ci.n nVar = this.i1;
        nVar.setEnabled(h);
        ni niVar2 = this.B0;
        if (niVar2 != null) {
            f7 = ((niVar2.h() ? 1.0f : 0.5f) * (this.C0 == null ? 1.0f : this.d0)) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        ni niVar3 = this.C0;
        if (niVar3 != null) {
            f7 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.d0, niVar3.h() ? 1.0f : 0.5f, f7);
        }
        this.j1 = f7;
        if (nVar != null) {
            float f10 = f7 * this.k1;
            nVar.setAlpha(f10);
            nVar.setVisibility(f10 <= 0.0f ? 4 : 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1() {
        bh.f fVar;
        boolean z10;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.F2) == null) {
            return;
        }
        xh xhVar = this.A1;
        ViewGroup viewGroup = this.containerView;
        RectF rectF = this.O2;
        ih.j.c(xhVar, viewGroup, rectF);
        float measuredWidth = this.containerView.getMeasuredWidth();
        float measuredHeight = this.a1.getMeasuredHeight();
        RectF rectF2 = this.N2;
        rectF2.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        rectF2.inset(0.0f, -AndroidUtilities.dp(48.0f));
        rectF.set(0.0f, this.containerView.getMeasuredHeight() - (AndroidUtilities.dp(180.0f) + Math.max(AndroidUtilities.navigationBarHeight, q1())), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        ni niVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (niVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null) {
            gm gmVar = chatAttachAlertPhotoLayout.E;
            if (gmVar.getFastScroll() != null) {
                tl0 fastScroll = gmVar.getFastScroll();
                dh.d dVar = fastScroll.e0;
                RectF rectF3 = this.P2;
                if (dVar != null || fastScroll.f0 != null) {
                    rectF3.set(fastScroll.f0.getBounds());
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(fastScroll.e0.getBounds());
                    rectF3.union(rectF4);
                }
                tl0 fastScroll2 = gmVar.getFastScroll();
                ViewGroup viewGroup2 = this.containerView;
                RectF rectF5 = AndroidUtilities.rectTmp;
                ih.j.c(fastScroll2, viewGroup2, rectF5);
                rectF3.offset(rectF5.left, rectF5.top);
                rectF3.inset(-AndroidUtilities.dp(48.0f), -AndroidUtilities.dp(48.0f));
                rectF3.left = Math.max(0.0f, rectF3.left);
                rectF3.right = Math.min(this.containerView.getMeasuredWidth(), rectF3.right);
                z10 = true;
                int i10 = !z10 ? 3 : 2;
                ArrayList arrayList = this.M2;
                ArrayList arrayList2 = this.Q2;
                fVar.g(zf.f0.a(arrayList, i10, arrayList2), arrayList2);
                fVar.e(this.L2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
            }
        }
        z10 = false;
        if (!z10) {
        }
        ArrayList arrayList3 = this.M2;
        ArrayList arrayList22 = this.Q2;
        fVar.g(zf.f0.a(arrayList3, i10, arrayList22), arrayList22);
        fVar.e(this.L2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void b2(ni niVar, int i10) {
        if (niVar == null) {
            return;
        }
        bh.f fVar = this.F2;
        if (fVar != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(0.0f, i10);
            b1();
        }
        int currentItemTop = niVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = niVar == this.B0 && currentItemTop <= niVar.getButtonsHideOffset();
        this.R = z11;
        if (niVar == this.B0) {
            X1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) niVar.getLayoutParams();
        int D = org.telegram.messenger.sk.D(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        ni niVar2 = this.B0;
        int i11 = niVar2 == niVar ? 0 : 1;
        if ((niVar2 instanceof en) || (this.C0 instanceof en)) {
            Object obj = this.w1;
            if ((obj instanceof o1.k) && ((o1.k) obj).f) {
                z10 = true;
            }
        }
        int[] iArr = this.e2;
        int i12 = iArr[i11];
        if (i12 == D && !z10) {
            if (i10 != 0) {
                this.f2 = i12;
            }
        } else {
            this.f2 = i12;
            iArr[i11] = D;
            e2(i11);
            this.containerView.invalidate();
        }
    }

    public final boolean c1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        return (m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).N6();
    }

    public final void c2(boolean z10) {
        di.u uVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout == null || (uVar = this.e1) == null) {
            return;
        }
        boolean z11 = this.t1 && this.i0 && this.B0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0();
        boolean z12 = !ChatAttachAlertPhotoLayout.S();
        uVar.f = z12;
        if (!z10) {
            ((g6) uVar.g).a(z12);
        }
        uVar.invalidateSelf();
        org.telegram.ui.ActionBar.u0 u0Var = this.f1;
        if (z10 && this.t1) {
            u0Var.setVisibility(0);
            u0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(es.h).withEndAction(new qh(this, z11, 0)).start();
        } else {
            u0Var.setVisibility(z11 ? 0 : 8);
            u0Var.setAlpha(z11 ? 1.0f : 0.0f);
            u0Var.setScaleX(z11 ? 1.0f : 0.6f);
            u0Var.setScaleY(z11 ? 1.0f : 0.6f);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithTouchOutside() {
        return this.B0.b();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.k kVar = this.s2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.t2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final boolean d1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (!(m2Var instanceof org.telegram.ui.fo)) {
            return false;
        }
        return ChatActivityEnterView.F(this.M1, ((org.telegram.ui.fo) m2Var).a(), m2Var, charSequence);
    }

    public final void d2(boolean z10) {
        ni niVar = this.j0;
        if (!z10) {
            U1(niVar);
            return;
        }
        if (this.M) {
            if (this.q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.r;
                if (c6Var == null) {
                    c6Var = this.resourcesProvider;
                }
                en enVar = new en(context, c6Var, this);
                enVar.y = 0.0f;
                enVar.E = 0.0f;
                enVar.F = 0.0f;
                enVar.G = 0.0f;
                enVar.H = 0.0f;
                enVar.I = 0.0f;
                enVar.J = null;
                enVar.K = false;
                enVar.M = 0.0f;
                enVar.Q = false;
                enVar.S = false;
                Point point = AndroidUtilities.displaySize;
                enVar.T = point.y > point.x;
                enVar.n = c6Var;
                enVar.f = true;
                enVar.setWillNotDraw(false);
                org.telegram.ui.ActionBar.y n10 = enVar.b.a1.n();
                TextView textView = new TextView(context);
                enVar.x = textView;
                org.telegram.ui.ActionBar.c6 c6Var2 = enVar.a;
                lm lmVar = new lm(enVar, context, n10, c6Var2, 1);
                enVar.b.a1.addView(lmVar, 0, w7.z5.a(-1.0f, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f, -2, 51));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.j5, c6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                lmVar.addView(textView, w7.z5.a(-2.0f, 16.0f, 0.0f, 0.0f, 0.0f, -2, 16));
                bi.o0 o0Var = new bi.o0(enVar, context, c6Var2, 14);
                enVar.r = o0Var;
                o0Var.setAdapter(new org.telegram.ui.a8(enVar, 3));
                s4.b0 b0Var = new s4.b0(1, false);
                enVar.s = b0Var;
                o0Var.setLayoutManager(b0Var);
                o0Var.setClipChildren(false);
                o0Var.setClipToPadding(false);
                o0Var.setOverScrollMode(2);
                o0Var.setVerticalScrollBarEnabled(false);
                dn dnVar = new dn(enVar, context);
                enVar.v = dnVar;
                dnVar.setClipToPadding(true);
                dnVar.setClipChildren(true);
                enVar.addView(o0Var, w7.z5.d(-1.0f, -1));
                enVar.P = enVar.b.j0;
                dnVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = enVar.P;
                dnVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                dnVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                dnVar.c();
                UndoView undoView = new UndoView(context, null, false, enVar.b.r);
                enVar.w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                enVar.addView(undoView, w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 52.0f, -1, 83));
                enVar.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.q0 = enVar;
                enVar.bringToFront();
            }
            ni niVar2 = this.B0;
            en enVar2 = this.q0;
            if (niVar2 != enVar2) {
                niVar = enVar2;
            }
            U1(niVar);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.reloadInlineHints && i10 != NotificationCenter.attachMenuBotsDidLoad && i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.K = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
            }
        } else {
            si siVar = this.D1;
            if (siVar != null) {
                siVar.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, org.telegram.ui.ActionBar.i2
    public final void dismiss(boolean z10) {
        if (z10) {
            this.D2 = z10;
        }
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public void dismissInternal() {
        ti tiVar = this.c2;
        if (tiVar != null) {
            tiVar.v(new hh(this, 3));
        } else {
            I1();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.B0.r(i10);
    }

    public final void e1() {
        yh yhVar = this.B1;
        if (yhVar == null) {
            return;
        }
        int childCount = yhVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            yhVar.getChildAt(i10);
        }
        boolean z10 = this.k2;
        this.m1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
        this.r1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
        this.i1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        int themedColor = getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5);
        org.telegram.ui.ActionBar.u0 u0Var = this.d1;
        u0Var.setIconColor(themedColor);
        org.telegram.ui.ActionBar.g6.x1(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.ig : org.telegram.ui.ActionBar.g6.I5), u0Var.getBackground());
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        u0Var.G(getThemedColor(i11), false);
        u0Var.G(getThemedColor(i11), true);
        u0Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f1;
        if (u0Var2 != null) {
            u0Var2.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.h1;
        if (u0Var3 != null) {
            u0Var3.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
            org.telegram.ui.ActionBar.g6.x1(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.ig : org.telegram.ui.ActionBar.g6.I5), u0Var3.getBackground());
        }
        ai aiVar = this.H0;
        org.telegram.ui.ActionBar.c6 c6Var = aiVar.M;
        qu quVar = aiVar.a;
        int i12 = aiVar.L;
        if (i12 == 0) {
            quVar.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.H6, c6Var));
            int i13 = org.telegram.ui.ActionBar.g6.G6;
            quVar.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
            quVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        } else if (i12 == 2 || i12 == 3) {
            quVar.setHintTextColor(-1929379841);
            quVar.setTextColor(-1);
            quVar.setCursorColor(-1);
            quVar.setHandlesColor(-1);
            quVar.setHighlightColor(822083583);
            quVar.quoteColor = -1;
        } else {
            quVar.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.t5, c6Var));
            quVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.j5, c6Var));
        }
        aiVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
        ru ruVar = aiVar.d;
        if (ruVar != null) {
            ruVar.S();
        }
        yhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        int themedColor2 = getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5);
        b8 b8Var = this.a1;
        b8Var.D(themedColor2, false);
        b8Var.C(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.ig : org.telegram.ui.ActionBar.g6.I5), false);
        b8Var.setTitleColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
        int s12 = s1(false);
        org.telegram.ui.ActionBar.g6.x1(s12, this.shadowDrawable);
        gh.c cVar = this.I2;
        if (cVar.a.getColor() != s12) {
            cVar.a(s12);
            kh.f fVar = this.y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            zh zhVar = this.z1;
            if (zhVar != null) {
                zhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i14 = 0;
        while (true) {
            ni[] niVarArr = this.z0;
            if (i14 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i14];
            if (niVar != null) {
                niVar.d();
            }
            i14++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
            return;
        }
        this.navBarColorKey = -1;
        this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.g6.i5);
        AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.g6.h5), false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e2(int i10) {
        int i11;
        float f7;
        org.telegram.ui.ActionBar.u0 u0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        ci.n nVar;
        float max;
        int i12;
        float f14 = this.d.e;
        ni niVar = i10 == 0 ? this.B0 : this.C0;
        if (niVar == null || niVar.getVisibility() != 0) {
            return;
        }
        int r12 = r1(i10);
        if (niVar == this.m0 || niVar == this.n0) {
            AndroidUtilities.dp(13.0f);
            AndroidUtilities.dp(11.0f);
        } else {
            AndroidUtilities.dp(39.0f);
            AndroidUtilities.dp(43.0f);
        }
        org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (AndroidUtilities.isTablet()) {
            i11 = 16;
        } else {
            Point point = AndroidUtilities.displaySize;
            i11 = point.x > point.y ? 6 : 12;
        }
        float alpha = this.a1.getAlpha();
        xh xhVar = this.l1;
        float dp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - xhVar.getAlpha()) * 26.0f);
        boolean z10 = this.t1;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.d1;
        ah.v vVar = this.R0;
        if (z10 && this.T0 == 0 && !this.W0) {
            u0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37), ((r12 - AndroidUtilities.dp((i11 * f14) + 37.0f)) + dp) - (vVar.getAlpha() * vVar.getMeasuredHeight())) + this.o2);
        } else {
            u0Var2.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37)) + this.o2);
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f1;
        if (u0Var3 != null) {
            u0Var3.setTranslationY(u0Var2.getTranslationY());
        }
        di.d4 d4Var = this.g1;
        if (d4Var != null) {
            d4Var.setTranslationY(u0Var2.getTranslationY());
        }
        if (this.F && this.v1) {
            ni niVar2 = this.C0;
            if (niVar2 != null && this.B0 != null) {
                f7 = Math.min(niVar2.getTranslationY(), this.B0.getTranslationY());
            } else if (niVar2 != null) {
                f7 = niVar2.getTranslationY();
            }
            u0Var = this.h1;
            if (u0Var != null) {
                u0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i11 + 37)) + this.o2);
            }
            float dp2 = ((((r12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.o2) + f7) - (vVar.getAlpha() * vVar.getMeasuredHeight());
            this.s1 = dp2;
            xhVar.setTranslationY(Math.max(this.o2, dp2));
            vVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.o2, (xhVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.s1 + AndroidUtilities.dp(8.0f)));
            if (this.c0) {
                Y1();
            }
            i1();
            int i13 = 59;
            if (this.m0 != null) {
                if (AndroidUtilities.isTablet()) {
                    i12 = 63;
                } else {
                    Point point2 = AndroidUtilities.displaySize;
                    i12 = point2.x > point2.y ? 53 : 59;
                }
                io ioVar = this.m0;
                if (ioVar == this.C0) {
                    f11 = (ioVar.getTranslationY() + r1(1)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.d0;
                } else if (ioVar == this.B0) {
                    f11 = (ioVar.getTranslationY() + r1(0)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.C0 == null ? 1.0f : 1.0f - this.d0;
                }
                if (this.n0 != null) {
                    if (AndroidUtilities.isTablet()) {
                        i13 = 63;
                    } else {
                        Point point3 = AndroidUtilities.displaySize;
                        if (point3.x > point3.y) {
                            i13 = 53;
                        }
                    }
                    io ioVar2 = this.n0;
                    if (ioVar2 == this.C0) {
                        f13 = (ioVar2.getTranslationY() + r1(1)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.d0;
                    } else if (ioVar2 == this.B0) {
                        f13 = (ioVar2.getTranslationY() + r1(0)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.C0 == null ? 1.0f : 1.0f - this.d0;
                    }
                    nVar = this.i1;
                    if (nVar != null) {
                        int measuredWidth = LocaleController.isRTL ? (this.containerView.getMeasuredWidth() - nVar.getMeasuredWidth()) - AndroidUtilities.dp(62.0f) : 0;
                        if (f10 <= 0.0f || f12 <= 0.0f) {
                            if (f10 <= 0.0f) {
                                f11 = 0.0f;
                            }
                            if (f12 <= 0.0f) {
                                f13 = 0.0f;
                            }
                            max = Math.max(f11, f13);
                        } else {
                            max = AndroidUtilities.lerp(f11, f13, f12);
                        }
                        nVar.setTranslationY(Math.max(0.0f, max) + this.o2);
                        nVar.setTranslationX(-((measuredWidth * (1.0f - f14)) + AndroidUtilities.dp((7.0f * r6) + 12.0f)));
                    }
                    float max2 = Math.max(f12, f10);
                    this.k1 = max2;
                    if (nVar == null) {
                        float f15 = this.j1 * max2;
                        nVar.setAlpha(f15);
                        nVar.setVisibility(f15 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f12 = 0.0f;
                f13 = 0.0f;
                nVar = this.i1;
                if (nVar != null) {
                }
                float max22 = Math.max(f12, f10);
                this.k1 = max22;
                if (nVar == null) {
                }
            }
            f10 = 0.0f;
            f11 = 0.0f;
            if (this.n0 != null) {
            }
            f12 = 0.0f;
            f13 = 0.0f;
            nVar = this.i1;
            if (nVar != null) {
            }
            float max222 = Math.max(f12, f10);
            this.k1 = max222;
            if (nVar == null) {
            }
        }
        f7 = 0.0f;
        u0Var = this.h1;
        if (u0Var != null) {
        }
        float dp22 = ((((r12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.o2) + f7) - (vVar.getAlpha() * vVar.getMeasuredHeight());
        this.s1 = dp22;
        xhVar.setTranslationY(Math.max(this.o2, dp22));
        vVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.o2, (xhVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.s1 + AndroidUtilities.dp(8.0f)));
        if (this.c0) {
        }
        i1();
        int i132 = 59;
        if (this.m0 != null) {
        }
        f10 = 0.0f;
        f11 = 0.0f;
        if (this.n0 != null) {
        }
        f12 = 0.0f;
        f13 = 0.0f;
        nVar = this.i1;
        if (nVar != null) {
        }
        float max2222 = Math.max(f12, f10);
        this.k1 = max2222;
        if (nVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r2.getSelectedItemsCount() > 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r0.isEphemeral() == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (m2Var == null || !(m2Var instanceof org.telegram.ui.fo)) {
            return;
        }
        org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
        vu vuVar = this.c0 ? this.S0 : this.H0;
        String obj = vuVar != null ? vuVar.getText().toString() : null;
        if (this.K1 == null) {
            ni niVar = this.B0;
            z11 = true;
            if (niVar != null) {
            }
            if (zf.v.g(this.M1).e(obj, foVar.d8) <= 0) {
                MessageObject messageObject = foVar.n5;
                if (messageObject != null) {
                }
            }
            this.h.a(z11, z10);
            if (z11 || !u1()) {
            }
            K1(false, z10);
            return;
        }
        z11 = false;
        this.h.a(z11, z10);
        if (z11) {
        }
    }

    public final void f2() {
        int i10 = 0;
        e2(0);
        this.u1.invalidate();
        ah.v vVar = this.R0;
        vVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout != null) {
            gm gmVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (gmVar != null && gmVar.getFastScroll() != null) {
                tl0 fastScroll = gmVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1;
                if (this.c0) {
                    i10 = (int) (vVar.getAlpha() * vVar.getMeasuredHeight());
                }
                fastScroll.h0 = currentActionBarHeight + i10;
                gmVar.getFastScroll().invalidate();
            }
        }
        Y1();
        i1();
    }

    public final void g1() {
        float f7 = this.c.e;
        this.z1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - ((1.0f - this.b.e) * f7)));
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.z0;
            if (i10 >= niVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.i5));
                return arrayList;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null && (themeDescriptions = niVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.y2
    public final boolean h() {
        return true;
    }

    public final void h1() {
        l20.d(this.I0, com.google.android.gms.internal.play_billing.k3.C(this.e.e, this.f.e, zf.f0.b(this.h.e), this.U1 ? 0.0f : 1.0f));
    }

    public final void i1() {
        fi fiVar = this.L0;
        xh xhVar = this.K0;
        ah.v vVar = this.R0;
        if (vVar == null || vVar.getVisibility() != 0 || vVar.getAlpha() == 0.0f) {
            xhVar.setTranslationY(this.j2);
            fiVar.setAlpha(1.0f);
            return;
        }
        float f7 = this.b.e;
        float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
        fiVar.setAlpha(abs * abs * abs * abs);
        xhVar.setTranslationY(AndroidUtilities.lerp(this.j2, ((vVar.getTranslationY() + vVar.getTop()) - xhVar.getTop()) + AndroidUtilities.dp(8.0f), es.j.getInterpolation(f7)));
    }

    public final void j1(int i10) {
        this.V0 = true;
        this.A1.setVisibility(0);
        this.H = true;
        this.I = i10;
        this.T0 = 0;
        this.F = false;
        this.G = false;
        this.J = null;
        org.telegram.ui.ActionBar.u0 u0Var = this.n1;
        if (u0Var != null) {
            this.m1.setTranslationY(0.0f);
            u0Var.setVisibility(8);
        }
    }

    public final void k1(ci.u uVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.m1;
        textView.setText(string);
        this.V0 = false;
        this.A1.setVisibility(8);
        this.T0 = 1;
        this.F = true;
        this.G = true;
        this.i0 = false;
        this.J = uVar;
        org.telegram.ui.ActionBar.u0 u0Var = this.n1;
        if (u0Var != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            u0Var.setVisibility(0);
            u0Var.setClickable(true);
            u0Var.setAlpha(1.0f);
            u0Var.setScaleX(1.0f);
            u0Var.setScaleY(1.0f);
        }
    }

    public final int l1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (!(m2Var instanceof org.telegram.ui.fo) || (messagePreviewParams = ((org.telegram.ui.fo) m2Var).f5) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public final TLRPC.Chat m1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        return m2Var instanceof org.telegram.ui.fo ? ((org.telegram.ui.fo) m2Var).e : MessagesController.getInstance(this.M1).getChat(Long.valueOf(-this.Z));
    }

    public final float n1() {
        return r0.getMeasuredHeight() - ((1.0f - this.G0.getAlpha()) * (r0.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final vu o1() {
        ni niVar;
        return (this.c0 && ((niVar = this.B0) == this.j0 || niVar == this.q0)) ? this.S0 : this.H0;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        if (this.S.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        b8 b8Var = this.a1;
        if (b8Var.n0) {
            b8Var.h(true);
            return;
        }
        if (this.B0.j()) {
            return;
        }
        if (o1() == null || !o1().e) {
            super.onBackPressed();
        } else {
            o1().k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.B0.n(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onCustomCloseAnimation() {
        TL_wallet.walletTransaction wallettransaction;
        final cl clVar = this.w0;
        if (clVar != null && this.B0 == clVar) {
            final hh hhVar = new hh(this, 1);
            int i10 = clVar.n;
            org.telegram.ui.Wallet.i8 i8Var = clVar.O;
            vi viVar = clVar.b;
            AnimatorSet animatorSet = null;
            if (!clVar.H && (wallettransaction = clVar.M0) != null && clVar.N0 == null && clVar.O0 == null) {
                if (clVar.P0) {
                    org.telegram.ui.Wallet.a5 a5Var = new org.telegram.ui.Wallet.a5();
                    a5Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
                    if (m2Var != null && m2Var.presentFragment(a5Var, false, true)) {
                        final int i11 = 0;
                        org.telegram.ui.Wallet.w8 w8Var = new org.telegram.ui.Wallet.w8(viVar.getContainer(), viVar.getSheetContainer(), i8Var.getDiamondView(), a5Var, clVar.M0, new Runnable() { // from class: org.telegram.ui.Components.uk
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        if (!clVar.H) {
                                            hhVar.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!clVar.H) {
                                            hhVar.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, viVar);
                        clVar.O0 = w8Var;
                        animatorSet = w8Var.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.c6 diamondView = i8Var.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f0;
                        if (m2Var2 instanceof org.telegram.ui.fo) {
                            org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var2;
                            if (foVar.getCurrentAccount() == i10 && foVar.a() == clVar.r.id && foVar.R3 == 0 && foVar.getFragmentView() != null && foVar.getFragmentView().isAttachedToWindow()) {
                                final int i12 = 1;
                                org.telegram.ui.Wallet.v5 v5Var = new org.telegram.ui.Wallet.v5(viVar.getContainer(), viVar.getSheetContainer(), i8Var.getDiamondView(), foVar, clVar.M0, new Runnable() { // from class: org.telegram.ui.Components.uk
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                if (!clVar.H) {
                                                    hhVar.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!clVar.H) {
                                                    hhVar.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, viVar);
                                clVar.N0 = v5Var;
                                animatorSet = v5Var.m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.currentSheetAnimation = animatorSet;
                this.currentSheetAnimationType = 2;
                return true;
            }
        }
        return super.onCustomCloseAnimation();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        fa1 fa1Var = chatAttachAlertPhotoLayout.l0;
        ah.x xVar = chatAttachAlertPhotoLayout.j0;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        gm gmVar = chatAttachAlertPhotoLayout.r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        boolean z10 = i14 < i15;
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == xVar) {
            if (z10) {
                if (gmVar.getVisibility() == 0) {
                    xVar.layout(0, org.telegram.messenger.g0.B(222.0f, i13, i16), i14, org.telegram.messenger.g0.B(96.0f, i13, i16));
                    return true;
                }
                xVar.layout(0, org.telegram.messenger.g0.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            }
            if (gmVar.getVisibility() == 0) {
                xVar.layout(org.telegram.messenger.g0.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            }
            xVar.layout(org.telegram.messenger.g0.B(126.0f, i12, i16), 0, i12, i15 - i16);
            return true;
        }
        if (view == fa1Var) {
            if (z10) {
                if (gmVar.getVisibility() == 0) {
                    fa1Var.layout(0, org.telegram.messenger.g0.B(310.0f, i13, i16), i14, org.telegram.messenger.g0.B(260.0f, i13, i16));
                    return true;
                }
                fa1Var.layout(0, org.telegram.messenger.g0.B(176.0f, i13, i16), i14, org.telegram.messenger.g0.B(126.0f, i13, i16));
                return true;
            }
            if (gmVar.getVisibility() == 0) {
                fa1Var.layout(org.telegram.messenger.g0.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            }
            fa1Var.layout(org.telegram.messenger.g0.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
            return true;
        }
        if (view != textView) {
            if (view != gmVar) {
                return false;
            }
            if (z10) {
                int B = org.telegram.messenger.g0.B(88.0f, i15, i16);
                view.layout(0, B, view.getMeasuredWidth(), view.getMeasuredHeight() + B);
                return true;
            }
            int dp2 = (i10 + i14) - AndroidUtilities.dp(88.0f);
            view.layout(dp2, 0, view.getMeasuredWidth() + dp2, view.getMeasuredHeight());
            return true;
        }
        if (z10) {
            dp = (i14 - textView.getMeasuredWidth()) / 2;
            int dp3 = i13 - AndroidUtilities.dp(167.0f);
            textView.setRotation(0.0f);
            if (gmVar.getVisibility() == 0) {
                dp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = dp3 - i16;
        } else {
            dp = i12 - AndroidUtilities.dp(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
            textView.setRotation(-90.0f);
            if (gmVar.getVisibility() == 0) {
                dp -= AndroidUtilities.dp(96.0f);
            }
        }
        textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        um umVar = chatAttachAlertPhotoLayout.v;
        gm gmVar = chatAttachAlertPhotoLayout.r;
        hg.a0 a0Var = chatAttachAlertPhotoLayout.s;
        boolean z10 = i10 < i11;
        qm qmVar = chatAttachAlertPhotoLayout.P;
        if (view != qmVar) {
            ah.x xVar = chatAttachAlertPhotoLayout.j0;
            if (view == xVar) {
                if (z10) {
                    xVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30));
                    return true;
                }
                xVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            fa1 fa1Var = chatAttachAlertPhotoLayout.l0;
            if (view == fa1Var) {
                if (z10) {
                    fa1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                    return true;
                }
                fa1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            if (view == gmVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    gmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
                    if (a0Var.o != 0) {
                        gmVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.j1(0);
                        umVar.l();
                    }
                } else {
                    gmVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                    if (a0Var.o != 1) {
                        gmVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        a0Var.j1(1);
                        umVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.b0 && !chatAttachAlertPhotoLayout.d0) {
            qmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onCustomOpenAnimation() {
        this.j0.setTranslationX(0.0f);
        this.q1.setAlpha(0.0f);
        this.o1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.t2 = animatorSet;
        int i10 = 2;
        ji jiVar = this.r2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, jiVar, 0.0f, 400.0f));
        this.t2.setDuration(400L);
        this.t2.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        jiVar.getClass();
        jiVar.a(this, valueOf);
        this.t2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new fh(this, i10));
        o1.k kVar = this.s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.n, 0.0f);
        this.s2 = kVar2;
        if (this.K1 != null) {
            kVar2.u.a(0.75f);
            this.s2.u.b(350.0f);
        } else {
            kVar2.u.a(0.75f);
            this.s2.u.b(350.0f);
        }
        this.s2.h();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.backDrawable, v6.d, this.dimBehind ? this.dimBehindAlpha : 0));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        org.telegram.messenger.video.f fVar = new org.telegram.messenger.video.f(this, animationNotificationsLocker, this.delegate, 17);
        this.s2.a(new fi.m4(i10, this, fVar));
        this.currentSheetAnimation.addListener(new bi.t(22, this, fVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        O1(0.0f);
        ofFloat2.addUpdateListener(new fh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(es.f);
        ofFloat2.start();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onDismissWithTouchOutside() {
        if (this.B0.s()) {
            dismiss();
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.B0.F(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onOpenAnimationEnd() {
        if (this.f0 instanceof org.telegram.ui.fo) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.B0.x();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.v1 = true;
        if (this.P1 || this.O1) {
            return;
        }
        c1();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.add(this.S);
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.remove(this.S);
        }
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        ni niVar;
        if (i10 == 0) {
            i1();
            g1();
            return;
        }
        if (i10 == 2) {
            g1();
            io ioVar = this.m0;
            if (ioVar != null && ((niVar = this.C0) == ioVar || this.B0 == ioVar)) {
                e2(niVar == ioVar ? 1 : 0);
            }
            io ioVar2 = this.n0;
            if (ioVar2 != null) {
                ni niVar2 = this.C0;
                if (niVar2 == ioVar2 || this.B0 == ioVar2) {
                    e2(niVar2 != ioVar2 ? 0 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 1) {
            g1();
            return;
        }
        if (i10 == 3) {
            h1();
            return;
        }
        if (i10 == 4) {
            h1();
            return;
        }
        if (i10 == 5) {
            h1();
            fi fiVar = this.L0;
            if (fiVar != null) {
                fiVar.setEphemeralFactor(f7);
                fiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final long p1() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        return m2Var instanceof org.telegram.ui.fo ? ((org.telegram.ui.fo) m2Var).a() : this.Z;
    }

    public final int q1() {
        ni niVar = this.B0;
        io ioVar = this.m0;
        if (niVar == ioVar && ioVar.E != null) {
            return ioVar.getEmojiPadding();
        }
        io ioVar2 = this.n0;
        return (niVar != ioVar2 || ioVar2.E == null) ? this.c0 ? this.S0.getEmojiPadding() : this.H0.getEmojiPadding() : ioVar2.getEmojiPadding();
    }

    public final int r1(int i10) {
        ni niVar = this.C0;
        int[] iArr = this.e2;
        return (niVar == null || !((this.B0 instanceof en) || (niVar instanceof en))) ? iArr[i10] : AndroidUtilities.lerp(iArr[0], iArr[1], this.d0);
    }

    public final int s1(boolean z10) {
        b8 b8Var;
        if (this.k2) {
            return getThemedColor(org.telegram.ui.ActionBar.g6.tg);
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        boolean a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        Iterator it = this.n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            long longValue = ((Long) gVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a10 = w7.r.a(f7, 0.0f, 1.0f);
        if (z10 && (b8Var = this.a1) != null && b8Var.getVisibility() == 0) {
            a10 *= 1.0f - b8Var.getAlpha();
        }
        return i0.a.d(a10, getThemedColor(org.telegram.ui.ActionBar.g6.h5), getThemedColor(a2 ? org.telegram.ui.ActionBar.g6.a7 : org.telegram.ui.ActionBar.g6.i5));
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean shouldOverlayCameraViewOverNavBar() {
        ni niVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        return niVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.i1;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        this.L1 = false;
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            this.calcMandatoryInsets = ((org.telegram.ui.fo) m2Var).C9();
        }
        a2();
        this.v1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.p2) {
            this.p2 = false;
            b8 b8Var = this.a1;
            b8Var.d();
            b8Var.invalidate();
            x1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t1() {
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        vi viVar;
        qm qmVar;
        MediaController.AlbumEntry albumEntry;
        ni niVar;
        this.Q0 = 0L;
        this.L0.setEffect(0L);
        int i10 = 0;
        this.G1 = false;
        this.E1 = false;
        this.I1 = 0.0f;
        this.H1.setVisibility(8);
        RadialProgressView radialProgressView = this.F1;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        xh xhVar = this.A1;
        xhVar.setAlpha(1.0f);
        xhVar.setTranslationY(0.0f);
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.A0;
            if (i11 >= longSparseArray.size()) {
                break;
            }
            ((fi.q4) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
            i11++;
        }
        int i12 = this.T0;
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (i12 != 2) {
            if (m2Var instanceof org.telegram.ui.fo) {
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
                chat = foVar.e;
                user = foVar.i();
            } else {
                long j10 = this.Z;
                int i13 = this.M1;
                if (j10 >= 0) {
                    user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.Z));
                    chat = null;
                } else if (j10 < 0) {
                    chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-this.Z));
                    user = null;
                }
            }
            z10 = m2Var instanceof org.telegram.ui.fo;
            if ((z10 && this.T0 != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.O1 = ChatObject.canSendPhoto(chat);
                    this.P1 = ChatObject.canSendVideo(chat);
                    this.Q1 = ChatObject.canSendMusic(chat);
                    this.R1 = ChatObject.canSendPolls(chat);
                    this.S1 = !ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.canSendPolls(chat);
                    this.T1 = ChatObject.canSendPlain(chat);
                    this.N1 = ChatObject.canSendDocument(chat);
                } else {
                    this.R1 = UserObject.isBot(user) || UserObject.isUserSelf(user);
                    this.S1 = !z10 || ((org.telegram.ui.fo) m2Var).h == null;
                }
            }
            if (this.U1) {
                this.R1 = false;
                this.S1 = false;
            }
            ai aiVar = this.H0;
            if (z10 || this.T0 == 2) {
                aiVar.setVisibility(this.W ? 0 : 4);
            }
            boolean z11 = this.P1;
            boolean z12 = this.O1;
            boolean z13 = this.N1;
            chatAttachAlertPhotoLayout = this.j0;
            viVar = chatAttachAlertPhotoLayout.b;
            yz yzVar = chatAttachAlertPhotoLayout.H;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z11;
            chatAttachAlertPhotoLayout.x0 = z12;
            chatAttachAlertPhotoLayout.z0 = z13;
            qmVar = chatAttachAlertPhotoLayout.P;
            if (qmVar != null) {
                qmVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.P.setEnabled(chatAttachAlertPhotoLayout.v0);
            }
            if (!((viVar.f0 instanceof org.telegram.ui.fo) && viVar.m1() == null) && viVar.T0 == 0) {
                chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
                if (chatAttachAlertPhotoLayout.v0) {
                    yzVar.setText(LocaleController.getString(R.string.NoPhotos));
                    yzVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat m12 = viVar.m1();
                    yzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    if (ChatObject.isActionBannedByDefault(m12, 7)) {
                        yzVar.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else if (AndroidUtilities.isBannedForever(m12.banned_rights)) {
                        yzVar.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                    } else {
                        yzVar.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(m12.banned_rights.until_date)));
                    }
                }
            } else if (chatAttachAlertPhotoLayout.q0()) {
                chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
            } else {
                chatAttachAlertPhotoLayout.U0 = MediaController.allPhotosAlbumEntry;
            }
            chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.e0();
            if (chatAttachAlertPhotoLayout.U0 != null) {
                for (int i14 = 0; i14 < Math.min(100, chatAttachAlertPhotoLayout.U0.photos.size()); i14++) {
                    chatAttachAlertPhotoLayout.U0.photos.get(i14).reset();
                }
            }
            chatAttachAlertPhotoLayout.Z();
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.F.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
            albumEntry = chatAttachAlertPhotoLayout.U0;
            chatAttachAlertPhotoLayout.T0 = albumEntry;
            if (albumEntry != null) {
                chatAttachAlertPhotoLayout.X0 = false;
                if (yzVar != null) {
                    yzVar.c();
                }
            }
            chatAttachAlertPhotoLayout.u0();
            aiVar.k(true);
            this.S0.k(true);
            this.x1 = false;
            setFocusable(false);
            if (!this.O || this.P) {
                if (this.o0 == null) {
                    tl tlVar = new tl(this, getContext(), this.resourcesProvider, (this.H || this.P || this.U1) ? false : true);
                    this.o0 = tlVar;
                    this.z0[5] = tlVar;
                    ol olVar = this.w2;
                    if (olVar != null) {
                        tlVar.setDelegate(olVar);
                    } else {
                        tlVar.setDelegate(new eh(this, i10));
                    }
                }
                this.Z0 = 5L;
                niVar = this.o0;
            } else if (this.N) {
                H1(false);
                niVar = this.p0;
                this.Z0 = 4L;
            } else {
                MessageObject messageObject = this.K1;
                if (messageObject != null) {
                    int i15 = this.J1;
                    if (i15 == -1) {
                        this.V0 = true;
                        if (messageObject.isMusic()) {
                            E1(false);
                            niVar = this.l0;
                            this.Z0 = 3L;
                        } else if (this.K1.isDocument()) {
                            H1(false);
                            niVar = this.p0;
                            this.Z0 = 4L;
                        } else {
                            this.Z0 = 1L;
                        }
                    } else {
                        if (i15 == 2) {
                            E1(false);
                            niVar = this.l0;
                            this.Z0 = 3L;
                        } else if (i15 == 1) {
                            H1(false);
                            niVar = this.p0;
                            this.Z0 = 4L;
                        } else {
                            this.Z0 = 1L;
                            niVar = chatAttachAlertPhotoLayout;
                        }
                        this.V0 = false;
                    }
                } else {
                    this.V0 = this.T0 == 0 && !this.W0;
                    this.Z0 = 1L;
                }
                niVar = chatAttachAlertPhotoLayout;
            }
            xhVar.setVisibility(this.V0 ? 0 : 8);
            if (this.B0 != niVar) {
                b8 b8Var = this.a1;
                if (b8Var.n0) {
                    b8Var.h(true);
                }
                this.containerView.removeView(this.B0);
                this.B0.u();
                this.B0.setVisibility(8);
                this.B0.t();
                this.B0 = niVar;
                this.allowNestedScroll = true;
                if (niVar.getParent() == null) {
                    this.containerView.addView(this.B0, 0, w7.z5.d(-1.0f, -1));
                }
                niVar.setAlpha(1.0f);
                niVar.setVisibility(0);
                niVar.G(null);
                niVar.I();
                b8Var.setVisibility(niVar.i() != 0 ? 0 : 4);
                K1(this.c0, false);
                a2();
            }
            if (this.B0 != chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            Z1(0);
            this.D1.l();
            o1().setText("");
            this.C1.h1(0, MediaController.VIDEO_BITRATE_480);
        }
        user = null;
        chat = null;
        z10 = m2Var instanceof org.telegram.ui.fo;
        if (z10) {
            if (chat != null) {
            }
            if (this.U1) {
            }
            ai aiVar2 = this.H0;
            if (z10) {
            }
            aiVar2.setVisibility(this.W ? 0 : 4);
            boolean z112 = this.P1;
            boolean z122 = this.O1;
            boolean z132 = this.N1;
            chatAttachAlertPhotoLayout = this.j0;
            viVar = chatAttachAlertPhotoLayout.b;
            yz yzVar2 = chatAttachAlertPhotoLayout.H;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z112;
            chatAttachAlertPhotoLayout.x0 = z122;
            chatAttachAlertPhotoLayout.z0 = z132;
            qmVar = chatAttachAlertPhotoLayout.P;
            if (qmVar != null) {
            }
            if (viVar.f0 instanceof org.telegram.ui.fo) {
            }
            chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
            if (chatAttachAlertPhotoLayout.v0) {
            }
            chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.e0();
            if (chatAttachAlertPhotoLayout.U0 != null) {
            }
            chatAttachAlertPhotoLayout.Z();
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.F.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
            albumEntry = chatAttachAlertPhotoLayout.U0;
            chatAttachAlertPhotoLayout.T0 = albumEntry;
            if (albumEntry != null) {
            }
            chatAttachAlertPhotoLayout.u0();
            aiVar2.k(true);
            this.S0.k(true);
            this.x1 = false;
            setFocusable(false);
            if (this.O) {
            }
            if (this.o0 == null) {
            }
            this.Z0 = 5L;
            niVar = this.o0;
            xhVar.setVisibility(this.V0 ? 0 : 8);
            if (this.B0 != niVar) {
            }
            if (this.B0 != chatAttachAlertPhotoLayout) {
            }
            Z1(0);
            this.D1.l();
            o1().setText("");
            this.C1.h1(0, MediaController.VIDEO_BITRATE_480);
        }
        if (chat != null) {
        }
        if (this.U1) {
        }
        ai aiVar22 = this.H0;
        if (z10) {
        }
        aiVar22.setVisibility(this.W ? 0 : 4);
        boolean z1122 = this.P1;
        boolean z1222 = this.O1;
        boolean z1322 = this.N1;
        chatAttachAlertPhotoLayout = this.j0;
        viVar = chatAttachAlertPhotoLayout.b;
        yz yzVar22 = chatAttachAlertPhotoLayout.H;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.v0 = z14;
        chatAttachAlertPhotoLayout.w0 = z1122;
        chatAttachAlertPhotoLayout.x0 = z1222;
        chatAttachAlertPhotoLayout.z0 = z1322;
        qmVar = chatAttachAlertPhotoLayout.P;
        if (qmVar != null) {
        }
        if (viVar.f0 instanceof org.telegram.ui.fo) {
        }
        chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
        if (chatAttachAlertPhotoLayout.v0) {
        }
        chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.e0();
        if (chatAttachAlertPhotoLayout.U0 != null) {
        }
        chatAttachAlertPhotoLayout.Z();
        chatAttachAlertPhotoLayout.y0(false);
        chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
        chatAttachAlertPhotoLayout.F.h1(0, MediaController.VIDEO_BITRATE_480);
        chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
        albumEntry = chatAttachAlertPhotoLayout.U0;
        chatAttachAlertPhotoLayout.T0 = albumEntry;
        if (albumEntry != null) {
        }
        chatAttachAlertPhotoLayout.u0();
        aiVar22.k(true);
        this.S0.k(true);
        this.x1 = false;
        setFocusable(false);
        if (this.O) {
        }
        if (this.o0 == null) {
        }
        this.Z0 = 5L;
        niVar = this.o0;
        xhVar.setVisibility(this.V0 ? 0 : 8);
        if (this.B0 != niVar) {
        }
        if (this.B0 != chatAttachAlertPhotoLayout) {
        }
        Z1(0);
        this.D1.l();
        o1().setText("");
        this.C1.h1(0, MediaController.VIDEO_BITRATE_480);
    }

    public final boolean u1() {
        if (!this.c0) {
            return false;
        }
        ni niVar = this.B0;
        return niVar == this.j0 || niVar == this.q0;
    }

    public final void w1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        ti tiVar = this.c2;
        if (tiVar == null || this.x1) {
            return;
        }
        boolean w9 = tiVar.w();
        this.x1 = true;
        AndroidUtilities.runOnUIThread(new di.x0(this, editTextBoldCursor, z10, 17), w9 ? 200L : 0L);
    }

    public final void x1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int s12 = s1(false);
        org.telegram.ui.ActionBar.g6.x1(s12, this.shadowDrawable);
        gh.c cVar = this.I2;
        if (cVar.a.getColor() != s12) {
            cVar.a(s12);
            kh.f fVar = this.y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            zh zhVar = this.z1;
            if (zhVar != null) {
                zhVar.invalidate();
            }
        }
        a2();
        this.containerView.invalidate();
    }

    public final void y1() {
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.z0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.o();
            }
            i10++;
        }
        int i11 = this.M1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        ai aiVar = this.H0;
        if (aiVar != null) {
            aiVar.o();
        }
        di diVar = this.S0;
        if (diVar != null) {
            diVar.o();
        }
    }

    public final void z1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String userName = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : UserObject.getUserName(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.M1).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
            i10++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        a2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 23));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        di diVar;
        ai aiVar;
        if (this.B0.q() || isDismissed()) {
            return;
        }
        ni niVar = this.B0;
        cl clVar = this.w0;
        boolean z10 = (niVar != clVar || clVar == null || clVar.H || clVar.M0 == null) ? false : true;
        this.x0 = z10;
        if (!z10 && (aiVar = this.H0) != null) {
            AndroidUtilities.hideKeyboard(aiVar.getEditText());
        }
        if (!this.x0 && (diVar = this.S0) != null) {
            AndroidUtilities.hideKeyboard(diVar.getEditText());
        }
        this.A0.clear();
        org.telegram.ui.ActionBar.m2 m2Var = this.f0;
        if (m2Var == null) {
            m2Var = LaunchActivity.R();
        }
        if (!this.D2 && m2Var != null && this.B0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.C2) {
                return;
            }
            this.C2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new eh(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new kh(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.N = b1Var;
            a2Var.show();
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.z0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar2 = niVarArr[i10];
            if (niVar2 != null && this.B0 != niVar2) {
                niVar2.q();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.a7), 0), true, (AndroidUtilities.IntColorCallback) new eh(this, 11));
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
        this.l2 = false;
        super.dismiss();
        this.D2 = false;
    }

    @Override // ne.d
    public final /* synthetic */ void A(float f7, int i10) {
    }

    public vi(Activity activity, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11) {
        this(activity, m2Var, z10, z11, true, null);
    }
}

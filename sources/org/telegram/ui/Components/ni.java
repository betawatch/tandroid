package org.telegram.ui.Components;

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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gi1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ni extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.z2, vd.b {
    public static final /* synthetic */ int K2 = 0;
    public final k0 A;
    public final th A0;
    public final o6 A1;
    public final qg.d A2;
    public boolean B;
    public final ImageView B0;
    public float B1;
    public final qg.c B2;
    public boolean C;
    public final int[] C0;
    public int C1;
    public final lg.a C2;
    public boolean D;
    public final ph D0;
    public MessageObject D1;
    public final lg.a D2;
    public int E;
    public final yh E0;
    public boolean E1;
    public final dh E2;
    public Utilities.Callback2 F;
    public final TextPaint F0;
    public final int F1;
    public final ArrayList F2;
    public int G;
    public final RectF G0;
    public boolean G1;
    public final RectF G2;
    public int H;
    public final Paint H0;
    public boolean H1;
    public final RectF H2;
    public boolean I;
    public AnimatorSet I0;
    public boolean I1;
    public final RectF I2;
    public boolean J;
    public long J0;
    public boolean J1;
    public final ArrayList J2;
    public boolean K;
    public final bg.d1 K0;
    public boolean K1;
    public boolean L;
    public final wh L0;
    public boolean L1;
    public q40 M;
    public int M0;
    public boolean M1;
    public boolean N;
    public jt N0;
    public boolean N1;
    public final nd0 O;
    public boolean O0;
    public int O1;
    public pn P;
    public boolean P0;
    public boolean P1;
    public s40 Q;
    public boolean Q0;
    public boolean Q1;
    public boolean R;
    public final float R0;
    public float R1;
    public boolean S;
    public long S0;
    public float S1;
    public zj T;
    public final cg.m1 T0;
    public ValueAnimator T1;
    public vi U;
    public AnimatorSet U0;
    public int U1;
    public long V;
    public AnimatorSet V0;
    public li V1;
    public boolean W;
    public final org.telegram.ui.ActionBar.w0 W0;
    public an W1;
    public final lg.b X;
    public final nh.u X0;
    public final int[] X1;
    public boolean Y;
    public final org.telegram.ui.ActionBar.w0 Y0;
    public int Y1;
    public float Z;
    public nh.t3 Z0;
    public float Z1;
    public final bi a0;
    public final org.telegram.ui.ActionBar.w0 a1;
    public float a2;
    public final vd.a b;
    public final org.telegram.ui.ActionBar.o2 b0;
    public final cg.s0 b1;
    public boolean b2;
    public final vd.a c;
    public final boolean c0;
    public float c1;
    public float c2;
    public final vd.a d;
    public ff d0;
    public float d1;
    public final boolean d2;
    public final vd.a e;
    public boolean e0;
    public final ph e1;
    public boolean e2;
    public final vd.a f;
    public final ChatAttachAlertPhotoLayout f0;
    public final TextView f1;
    public final ArrayList f2;
    public sj g0;
    public final org.telegram.ui.ActionBar.w0 g1;
    public final Rect g2;
    public final vd.a h;
    public yi h0;
    public final LinearLayout h1;
    public float h2;
    public on i0;
    public final ImageView i1;
    public boolean i2;
    public on j0;
    public final LinearLayout j1;
    public int j2;
    public bl k0;
    public final TextView k1;
    public final bi k2;
    public jk l0;
    public float l1;
    public o1.k l2;
    public lm m0;
    public boolean m1;
    public AnimatorSet m2;
    public final vd.k n;
    public bj n0;
    public final di n1;
    public boolean n2;
    public sf.d0 o0;
    public boolean o1;
    public boolean o2;
    public kk p0;
    public Object p1;
    public wk p2;
    public kk q0;
    public boolean q1;
    public boolean q2;
    public org.telegram.ui.rn r;
    public th.p r0;
    public final ug.f r1;
    public boolean r2;
    public final o6 s;
    public final fi[] s0;
    public final rh s1;
    public File s2;
    public final LongSparseArray t0;
    public final ph t1;
    public double[] t2;
    public fi u0;
    public final qh u1;
    public boolean u2;
    public final o6 v;
    public fi v0;
    public final f2.j0 v1;
    public boolean v2;
    public final ImageView w;
    public final ng.d w0;
    public final ki w1;
    public boolean w2;
    public final k0 x;
    public final ng.d x0;
    public boolean x1;
    public nh.i x2;
    public final ImageView y;
    public final sh y0;
    public final RadialProgressView y1;
    public final lg.e y2;
    public final ph z0;
    public boolean z1;
    public final qg.d z2;

    public ni(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        cg.s0 s0Var;
        float f9;
        cg.m1 m1Var;
        jr jrVar = jr.h;
        this.b = new vd.a(0, this, jrVar, 380L, false);
        this.c = new vd.a(1, this, jrVar, 380L, false);
        this.d = new vd.a(2, this, jrVar, 380L, false);
        this.e = new vd.a(3, this, jrVar, 380L, false);
        this.f = new vd.a(4, this, jrVar, 380L, true);
        this.h = new vd.a(5, this, jrVar, 320L, false);
        int i10 = 1;
        vd.k kVar = new vd.k(new wg(this, i10), jrVar, 380L);
        this.n = kVar;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.Z = 0.0f;
        this.a0 = new bi(this, 0);
        this.e0 = false;
        fi[] fiVarArr = new fi[11];
        this.s0 = fiVarArr;
        this.t0 = new LongSparseArray();
        this.C0 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.F0 = textPaint;
        this.G0 = new RectF();
        this.H0 = new Paint(1);
        this.Q0 = true;
        this.R0 = 1.0f;
        this.x1 = false;
        this.z1 = false;
        int i11 = UserConfig.selectedAccount;
        this.F1 = i11;
        this.G1 = true;
        this.H1 = true;
        this.I1 = true;
        this.J1 = true;
        this.K1 = true;
        this.L1 = true;
        this.M1 = true;
        this.O1 = -1;
        this.P1 = true;
        this.U1 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.X1 = new int[2];
        new Paint(1);
        this.e2 = false;
        ArrayList arrayList = new ArrayList();
        this.f2 = arrayList;
        Rect rect = new Rect();
        this.g2 = rect;
        this.k2 = new bi(this, 1);
        this.n2 = true;
        this.o2 = false;
        this.v2 = false;
        this.w2 = false;
        ArrayList arrayList2 = new ArrayList();
        this.F2 = arrayList2;
        RectF rectF = new RectF();
        this.G2 = rectF;
        RectF rectF2 = new RectF();
        this.H2 = rectF2;
        RectF rectF3 = new RectF();
        this.I2 = rectF3;
        arrayList2.add(rectF);
        arrayList2.add(rectF2);
        arrayList2.add(rectF3);
        this.J2 = new ArrayList();
        this.occupyNavigationBarWithoutKeyboard = true;
        qg.c cVar = new qg.c();
        this.B2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        int i12 = 3;
        if (Build.VERSION.SDK_INT >= 31) {
            this.y2 = new lg.e(false);
            qg.d dVar = new qg.d(null);
            this.A2 = dVar;
            dVar.i(new o4.g(this, i12));
            qg.d dVar2 = new qg.d(null);
            this.z2 = dVar2;
            dVar2.i(new n(this, i10));
            lg.a aVar = new lg.a(dVar);
            this.C2 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            lg.a aVar2 = new lg.a(dVar2);
            this.D2 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
        } else {
            this.y2 = null;
            this.z2 = null;
            this.A2 = null;
            this.C2 = new lg.a(cVar);
            this.D2 = new lg.a(cVar);
        }
        lg.a aVar3 = new lg.a(cVar);
        this.E2 = new dh(this, 0);
        this.d2 = z10;
        this.c0 = (o2Var instanceof org.telegram.ui.tn) && o2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.b0 = o2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        di diVar = new di(this, context);
        this.n1 = diVar;
        diVar.setDelegate(new ei(this));
        this.containerView = diVar;
        diVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        cg.m1 m1Var2 = new cg.m1(this, context, c6Var, 2);
        this.T0 = m1Var2;
        m1Var2.O0 = true;
        m1Var2.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        m1Var2.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        int i14 = org.telegram.ui.ActionBar.g6.j5;
        m1Var2.C(getThemedColor(i14), false);
        int i15 = org.telegram.ui.ActionBar.g6.I5;
        m1Var2.B(getThemedColor(i15), false);
        m1Var2.setTitleColor(getThemedColor(i14));
        m1Var2.setOccupyStatusBar(true);
        m1Var2.setAlpha(0.0f);
        m1Var2.setActionBarMenuOnItemClick(new cg.n1(this, 25));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i14), false, c6Var);
        this.W0 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.ic_ab_other);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        final int i16 = 4;
        w0Var2.setVisibility(4);
        w0Var2.setAlpha(0.0f);
        w0Var2.setScaleX(0.6f);
        w0Var2.setScaleY(0.6f);
        w0Var2.setSubMenuOpenSide(2);
        w0Var2.setDelegate(new wg(this, 8));
        w0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        w0Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i15), 6, -1));
        w0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ah
            public final /* synthetic */ ni b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ph.n3 n3Var;
                switch (i16) {
                    case 0:
                        ni niVar = this.b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ni niVar2 = this.b;
                        boolean z13 = niVar2.Y;
                        if (!z13) {
                            niVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ni niVar3 = this.b;
                        boolean z14 = niVar3.Y;
                        if (z14) {
                            niVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.W0.M(null, null);
                        break;
                    case 5:
                        ni.s(this.b);
                        break;
                    case 6:
                        fi fiVar = this.b.u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ni niVar4 = this.b;
                        niVar4.Z1(niVar4.u0 != niVar4.m0);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i14), false, c6Var);
        this.Y0 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        nh.u uVar = new nh.u();
        this.X0 = uVar;
        w0Var3.setIcon(uVar);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        w0Var3.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i15), 6, -1));
        final int i17 = 5;
        w0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ah
            public final /* synthetic */ ni b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ph.n3 n3Var;
                switch (i17) {
                    case 0:
                        ni niVar = this.b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ni niVar2 = this.b;
                        boolean z13 = niVar2.Y;
                        if (!z13) {
                            niVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ni niVar3 = this.b;
                        boolean z14 = niVar3.Y;
                        if (z14) {
                            niVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.W0.M(null, null);
                        break;
                    case 5:
                        ni.s(this.b);
                        break;
                    case 6:
                        fi fiVar = this.b.u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ni niVar4 = this.b;
                        niVar4.Z1(niVar4.u0 != niVar4.m0);
                        break;
                }
            }
        });
        cg.s0 s0Var2 = new cg.s0(this, context);
        s0Var2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        s0Var2.setText(LocaleController.getString(R.string.Create));
        s0Var2.setTypeface(AndroidUtilities.bold());
        s0Var2.setTextSize(1, 14.0f);
        s0Var2.setVisibility(4);
        s0Var2.setAlpha(0.0f);
        s0Var2.setGravity(17);
        s0Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        s0Var2.setTranslationX(-AndroidUtilities.dp(12.0f));
        final int i18 = 6;
        s0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ah
            public final /* synthetic */ ni b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ph.n3 n3Var;
                switch (i18) {
                    case 0:
                        ni niVar = this.b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ni niVar2 = this.b;
                        boolean z13 = niVar2.Y;
                        if (!z13) {
                            niVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ni niVar3 = this.b;
                        boolean z14 = niVar3.Y;
                        if (z14) {
                            niVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.W0.M(null, null);
                        break;
                    case 5:
                        ni.s(this.b);
                        break;
                    case 6:
                        fi fiVar = this.b.u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ni niVar4 = this.b;
                        niVar4.Z1(niVar4.u0 != niVar4.m0);
                        break;
                }
            }
        });
        i7.h6.a(s0Var2);
        this.b1 = s0Var2;
        W1();
        if (o2Var != null) {
            w0Var = w0Var3;
            s0Var = s0Var2;
            f9 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i14), false, c6Var);
            this.a1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            w0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i15), 6, -1));
            w0Var4.setOnClickListener(new lh.z1(5, this, z11));
        } else {
            w0Var = w0Var3;
            s0Var = s0Var2;
            f9 = 14.0f;
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i14), false, c6Var);
        this.g1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var5.setVisibility(8);
        w0Var5.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i15), 3, -1));
        final int i19 = 2;
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bh
            public final /* synthetic */ ni b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        final ni niVar = this.b;
                        th thVar = niVar.A0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(niVar.getContext(), c6Var);
                            g0Var.m0(thVar.getText());
                            final int i20 = 0;
                            g0Var.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.eh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            th thVar2 = niVar.A0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            wh whVar = niVar.L0;
                                            whVar.setText(charSequence);
                                            whVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = niVar.V;
                            boolean z13 = niVar.D1 != null;
                            fh fhVar = new fh(niVar, 0);
                            g0Var.h0 = j10;
                            g0Var.i0 = z13;
                            g0Var.j0 = fhVar;
                            g0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ni niVar2 = this.b;
                        wh whVar = niVar2.L0;
                        if (whVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(niVar2.getContext(), c6Var);
                            g0Var2.m0(whVar.getText());
                            final int i21 = 1;
                            g0Var2.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.eh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i21) {
                                        case 0:
                                            th thVar2 = niVar2.A0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            wh whVar2 = niVar2.L0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = niVar2.V;
                            boolean z14 = niVar2.D1 != null;
                            fh fhVar2 = new fh(niVar2, 1);
                            g0Var2.h0 = j11;
                            g0Var2.i0 = z14;
                            g0Var2.j0 = fhVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ni niVar3 = this.b;
                        niVar3.g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = niVar3.b0;
                        t12.K2(null, o2Var2, c6Var);
                        PhotoViewer.t1().L2(niVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i22 = niVar3.O1;
                        boolean z15 = niVar3.P1;
                        t13.h = i22;
                        t13.n = z15;
                        if (!niVar3.V1.a0()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(niVar3.getContainer().findFocus());
                        }
                        File w10 = nh.o7.w(niVar3.F1, "webp");
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
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new oh(niVar3, photoEntry), o2Var2 instanceof org.telegram.ui.tn ? (org.telegram.ui.tn) o2Var2 : null);
                        if (niVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, niVar3.F);
                            break;
                        }
                        break;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        final int i20 = 7;
        w0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ah
            public final /* synthetic */ ni b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ph.n3 n3Var;
                switch (i20) {
                    case 0:
                        ni niVar = this.b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ni niVar2 = this.b;
                        boolean z13 = niVar2.Y;
                        if (!z13) {
                            niVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ni niVar3 = this.b;
                        boolean z14 = niVar3.Y;
                        if (z14) {
                            niVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.W0.M(null, null);
                        break;
                    case 5:
                        ni.s(this.b);
                        break;
                    case 6:
                        fi fiVar = this.b.u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ni niVar4 = this.b;
                        niVar4.Z1(niVar4.u0 != niVar4.m0);
                        break;
                }
            }
        });
        ph phVar = new ph(this, context, 0);
        this.e1 = phVar;
        final int i21 = 8;
        phVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ah
            public final /* synthetic */ ni b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ph.n3 n3Var;
                switch (i21) {
                    case 0:
                        ni niVar = this.b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ni niVar2 = this.b;
                        boolean z13 = niVar2.Y;
                        if (!z13) {
                            niVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ni niVar3 = this.b;
                        boolean z14 = niVar3.Y;
                        if (z14) {
                            niVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.W0.M(null, null);
                        break;
                    case 5:
                        ni.s(this.b);
                        break;
                    case 6:
                        fi fiVar = this.b.u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ni niVar4 = this.b;
                        niVar4.Z1(niVar4.u0 != niVar4.m0);
                        break;
                }
            }
        });
        phVar.setAlpha(0.0f);
        phVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.h1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f1 = textView;
        textView.setTextColor(getThemedColor(i14));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, i7.f6.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.i1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, i7.f6.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        phVar.addView(linearLayout, i7.f6.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.j1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i14), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, i7.f6.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.k1 = textView2;
        textView2.setTextColor(getThemedColor(i14));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, i7.f6.q(-2, -2, 16));
        phVar.addView(linearLayout2, i7.f6.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, c6Var);
        this.f0 = chatAttachAlertPhotoLayout;
        fiVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.u0 = chatAttachAlertPhotoLayout;
        this.S0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, i7.f6.c(-1.0f, -1));
        ug.f fVar = new ug.f(context);
        this.r1 = fVar;
        fVar.setup(aVar3);
        fVar.setFadeTopAlpha(0);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(fVar, i7.f6.g());
        this.containerView.addView(phVar, i7.f6.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        bg.d1 d1Var = new bg.d1(context);
        this.K0 = d1Var;
        this.containerView.addView(d1Var, i7.f6.e(-1, -2, 55));
        this.containerView.addView(m1Var2, i7.f6.c(-2.0f, -1));
        this.containerView.addView(w0Var2, i7.f6.e(48, 48, 53));
        this.containerView.addView(w0Var, i7.f6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.a1;
        if (w0Var6 != null) {
            m1Var = m1Var2;
            this.containerView.addView(w0Var6, i7.f6.e(48, 48, 53));
        } else {
            m1Var = m1Var2;
        }
        phVar.addView(w0Var5, i7.f6.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(s0Var, i7.f6.e(-2, 48, 53));
        ph phVar2 = new ph(this, context, 1);
        this.t1 = phVar2;
        qh qhVar = new qh(context, 0);
        this.u1 = qhVar;
        qhVar.setClipChildren(true);
        qhVar.setClipToPadding(false);
        ki kiVar = new ki(this, context);
        this.w1 = kiVar;
        qhVar.setAdapter(kiVar);
        f2.j0 j0Var = new f2.j0(0, false);
        this.v1 = j0Var;
        qhVar.setLayoutManager(j0Var);
        qhVar.setVerticalScrollBarEnabled(false);
        qhVar.setHorizontalScrollBarEnabled(false);
        qhVar.setItemAnimator(null);
        qhVar.setLayoutAnimation(null);
        qhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        qhVar.v2 = true;
        qhVar.setOverScrollMode(2);
        lg.a aVar4 = this.C2;
        sg.i iVar = new sg.i(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = iVar;
        aVar4.e = viewGroup2;
        lg.a aVar5 = this.D2;
        sg.i iVar2 = new sg.i(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = iVar2;
        aVar5.e = viewGroup3;
        sg.i iVar3 = new sg.i(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        aVar3.d = iVar3;
        aVar3.e = viewGroup4;
        rh rhVar = new rh(this, context, 0);
        this.s1 = rhVar;
        lg.b bVar = new lg.b(aVar3.c(rhVar, null, false));
        this.X = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(rhVar, i7.f6.g());
        ng.d c3 = this.C2.c(phVar2, pg.a.f(c6Var), false);
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(7.0f));
        phVar2.setBackground(c3);
        qhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        qhVar.setClipToOutline(true);
        int dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(28.0f);
        eg.k1 k1Var = jf.q0.a;
        qhVar.setOutlineProvider(new jf.p0(dp, dp2));
        qhVar.setImportantForAccessibility(1);
        phVar2.addView(qhVar, i7.f6.g());
        this.containerView.addView(phVar2, i7.f6.e(-1, 70, 81));
        qhVar.setOnItemClickListener(new eg.w0(10, this, c6Var));
        qhVar.setOnItemLongClickListener(new wg(this, 3));
        final int i22 = 0;
        o6 o6Var = new o6(context, true, false, true);
        this.A1 = o6Var;
        o6Var.setVisibility(8);
        o6Var.setAlpha(0.0f);
        o6Var.setGravity(17);
        o6Var.setTypeface(AndroidUtilities.bold());
        int dp3 = AndroidUtilities.dp(16.0f);
        o6Var.setPadding(dp3, 0, dp3, 0);
        o6Var.setTextSize(AndroidUtilities.dp(f9));
        o6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ah
            public final /* synthetic */ ni b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ph.n3 n3Var;
                switch (i22) {
                    case 0:
                        ni niVar = this.b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ni niVar2 = this.b;
                        boolean z13 = niVar2.Y;
                        if (!z13) {
                            niVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ni niVar3 = this.b;
                        boolean z14 = niVar3.Y;
                        if (z14) {
                            niVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.W0.M(null, null);
                        break;
                    case 5:
                        ni.s(this.b);
                        break;
                    case 6:
                        fi fiVar = this.b.u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ni niVar4 = this.b;
                        niVar4.Z1(niVar4.u0 != niVar4.m0);
                        break;
                }
            }
        });
        this.containerView.addView(o6Var, i7.f6.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.y1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, i7.f6.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.B0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i23 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ah
            public final /* synthetic */ ni b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ph.n3 n3Var;
                switch (i23) {
                    case 0:
                        ni niVar = this.b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ni niVar2 = this.b;
                        boolean z13 = niVar2.Y;
                        if (!z13) {
                            niVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ni niVar3 = this.b;
                        boolean z14 = niVar3.Y;
                        if (z14) {
                            niVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.W0.M(null, null);
                        break;
                    case 5:
                        ni.s(this.b);
                        break;
                    case 6:
                        fi fiVar = this.b.u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ni niVar4 = this.b;
                        niVar4.Z1(niVar4.u0 != niVar4.m0);
                        break;
                }
            }
        });
        ph phVar3 = new ph(this, context, 2);
        this.z0 = phVar3;
        sh shVar = new sh(this, context);
        this.y0 = shVar;
        phVar3.addView(shVar, i7.f6.e(-1, -1, 119));
        ng.d c6 = this.D2.c(diVar, pg.a.m(c6Var), false);
        this.w0 = c6;
        c6.k = true;
        c6.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c6.t(AndroidUtilities.dp(32.0f));
        c6.h.g = 0.4f;
        c6.j();
        ng.d c10 = this.C2.c(shVar, pg.a.m(c6Var), false);
        this.x0 = c10;
        c10.p(AndroidUtilities.dp(22.0f));
        c10.o(AndroidUtilities.dp(7.0f));
        shVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        phVar3.setWillNotDraw(false);
        phVar3.setVisibility(4);
        phVar3.setAlpha(0.0f);
        this.containerView.addView(phVar3, i7.f6.e(-1, -2, 83));
        phVar3.setOnTouchListener(new mh.d(13));
        o6 o6Var2 = new o6(context, false, false, false);
        this.s = o6Var2;
        o6Var2.setAllowCancel(true);
        o6Var2.setScaleProperty(0.6f);
        o6Var2.setVisibility(8);
        o6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i24 = org.telegram.ui.ActionBar.g6.y6;
        o6Var2.setTextColor(getThemedColor(i24));
        o6Var2.setTypeface(AndroidUtilities.bold());
        o6Var2.setGravity(17);
        shVar.addView(o6Var2, i7.f6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.w = imageView4;
        k0 k0Var = new k0(context);
        this.x = k0Var;
        imageView4.setImageDrawable(k0Var);
        imageView4.setScaleType(scaleType);
        int i25 = org.telegram.ui.ActionBar.g6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), mode));
        int i26 = org.telegram.ui.ActionBar.g6.i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i26), 1, AndroidUtilities.dp(16.0f)));
        shVar.addView(imageView4, i7.f6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        i7.h6.a(imageView4);
        final int i27 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bh
            public final /* synthetic */ ni b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i27) {
                    case 0:
                        final ni niVar = this.b;
                        th thVar = niVar.A0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(niVar.getContext(), c6Var);
                            g0Var.m0(thVar.getText());
                            final int i202 = 0;
                            g0Var.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.eh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            th thVar2 = niVar.A0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            wh whVar2 = niVar.L0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = niVar.V;
                            boolean z13 = niVar.D1 != null;
                            fh fhVar = new fh(niVar, 0);
                            g0Var.h0 = j10;
                            g0Var.i0 = z13;
                            g0Var.j0 = fhVar;
                            g0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ni niVar2 = this.b;
                        wh whVar = niVar2.L0;
                        if (whVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(niVar2.getContext(), c6Var);
                            g0Var2.m0(whVar.getText());
                            final int i212 = 1;
                            g0Var2.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.eh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            th thVar2 = niVar2.A0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            wh whVar2 = niVar2.L0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = niVar2.V;
                            boolean z14 = niVar2.D1 != null;
                            fh fhVar2 = new fh(niVar2, 1);
                            g0Var2.h0 = j11;
                            g0Var2.i0 = z14;
                            g0Var2.j0 = fhVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ni niVar3 = this.b;
                        niVar3.g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = niVar3.b0;
                        t12.K2(null, o2Var2, c6Var);
                        PhotoViewer.t1().L2(niVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i222 = niVar3.O1;
                        boolean z15 = niVar3.P1;
                        t13.h = i222;
                        t13.n = z15;
                        if (!niVar3.V1.a0()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(niVar3.getContainer().findFocus());
                        }
                        File w10 = nh.o7.w(niVar3.F1, "webp");
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
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new oh(niVar3, photoEntry), o2Var2 instanceof org.telegram.ui.tn ? (org.telegram.ui.tn) o2Var2 : null);
                        if (niVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, niVar3.F);
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
        this.G = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        th thVar = new th(this, context, diVar, c6Var);
        this.A0 = thVar;
        thVar.F = true;
        thVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        thVar.s();
        thVar.getEditText().setLayoutParams(i7.f6.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        thVar.getEditText().addTextChangedListener(new vh(this));
        shVar.addView(thVar, i7.f6.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        shVar.setClipChildren(false);
        phVar3.setClipChildren(false);
        thVar.setClipChildren(false);
        d1Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        d1Var.setWillNotDraw(false);
        wh whVar = new wh(this, context, diVar, c6Var);
        this.L0 = whVar;
        whVar.F = true;
        whVar.getEditText().addTextChangedListener(new xh(this, o2Var));
        whVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        whVar.getEditText().setLayoutParams(i7.f6.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        whVar.getEditText().setTextSize(1, 17.0f);
        whVar.getEmojiButton().setLayoutParams(i7.f6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        whVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        d1Var.addView(whVar, i7.f6.e(-1, -2, 119));
        d1Var.setAlpha(0.0f);
        d1Var.setVisibility(8);
        thVar.addView(imageView3, i7.f6.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        ng.d c11 = this.C2.c(d1Var, pg.a.m(c6Var), false);
        c11.p(AndroidUtilities.dp(22.0f));
        c11.o(AndroidUtilities.dp(7.0f));
        d1Var.setBackground(c11);
        d1Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        o6 o6Var3 = new o6(context, false, false, false);
        this.v = o6Var3;
        o6Var3.setScaleProperty(0.6f);
        o6Var3.setVisibility(8);
        o6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var3.setTextColor(getThemedColor(i24));
        o6Var3.setTypeface(AndroidUtilities.bold());
        o6Var3.setGravity(17);
        o6Var3.setAllowCancel(true);
        d1Var.addView(o6Var3, i7.f6.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Xd), mode2));
        whVar.addView(imageView5, i7.f6.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i28 = 2;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ah
            public final /* synthetic */ ni b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ph.n3 n3Var;
                switch (i28) {
                    case 0:
                        ni niVar = this.b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ni niVar2 = this.b;
                        boolean z13 = niVar2.Y;
                        if (!z13) {
                            niVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ni niVar3 = this.b;
                        boolean z14 = niVar3.Y;
                        if (z14) {
                            niVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.W0.M(null, null);
                        break;
                    case 5:
                        ni.s(this.b);
                        break;
                    case 6:
                        fi fiVar = this.b.u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ni niVar4 = this.b;
                        niVar4.Z1(niVar4.u0 != niVar4.m0);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.y = imageView6;
        k0 k0Var2 = new k0(context);
        this.A = k0Var2;
        imageView6.setImageDrawable(k0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i26), 1, AndroidUtilities.dp(16.0f)));
        d1Var.addView(imageView6, i7.f6.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        i7.h6.a(imageView6);
        final int i29 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bh
            public final /* synthetic */ ni b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i29) {
                    case 0:
                        final ni niVar = this.b;
                        th thVar2 = niVar.A0;
                        if (thVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(niVar.getContext(), c6Var);
                            g0Var.m0(thVar2.getText());
                            final int i202 = 0;
                            g0Var.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.eh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            th thVar22 = niVar.A0;
                                            thVar22.setText(charSequence);
                                            thVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            wh whVar2 = niVar.L0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = niVar.V;
                            boolean z13 = niVar.D1 != null;
                            fh fhVar = new fh(niVar, 0);
                            g0Var.h0 = j10;
                            g0Var.i0 = z13;
                            g0Var.j0 = fhVar;
                            g0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ni niVar2 = this.b;
                        wh whVar2 = niVar2.L0;
                        if (whVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(niVar2.getContext(), c6Var);
                            g0Var2.m0(whVar2.getText());
                            final int i212 = 1;
                            g0Var2.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.eh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            th thVar22 = niVar2.A0;
                                            thVar22.setText(charSequence);
                                            thVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            wh whVar22 = niVar2.L0;
                                            whVar22.setText(charSequence);
                                            whVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = niVar2.V;
                            boolean z14 = niVar2.D1 != null;
                            fh fhVar2 = new fh(niVar2, 1);
                            g0Var2.h0 = j11;
                            g0Var2.i0 = z14;
                            g0Var2.j0 = fhVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ni niVar3 = this.b;
                        niVar3.g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = niVar3.b0;
                        t12.K2(null, o2Var2, c6Var);
                        PhotoViewer.t1().L2(niVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i222 = niVar3.O1;
                        boolean z15 = niVar3.P1;
                        t13.h = i222;
                        t13.n = z15;
                        if (!niVar3.V1.a0()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(niVar3.getContainer().findFocus());
                        }
                        File w10 = nh.o7.w(niVar3.F1, "webp");
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
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new oh(niVar3, photoEntry), o2Var2 instanceof org.telegram.ui.tn ? (org.telegram.ui.tn) o2Var2 : null);
                        if (niVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, niVar3.F);
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
        ph phVar4 = new ph(this, context, 3);
        this.D0 = phVar4;
        phVar4.setFocusable(true);
        phVar4.setFocusableInTouchMode(true);
        phVar4.setVisibility(4);
        phVar4.setScaleX(0.2f);
        phVar4.setScaleY(0.2f);
        phVar4.setAlpha(0.0f);
        phVar4.setClipChildren(false);
        phVar4.setClipToPadding(false);
        this.containerView.addView(phVar4, i7.f6.e(110, 50, 85));
        yh yhVar = new yh(R.drawable.send_plane_24, context, c6Var, this);
        this.E0 = yhVar;
        yhVar.setImportantForAccessibility(2);
        phVar4.addView(yhVar, i7.f6.e(-1, -1, 119));
        yhVar.setTranslationX(this.backgroundPaddingLeft);
        int dp4 = AndroidUtilities.dp(52.0f);
        int dp5 = AndroidUtilities.dp(38.0f);
        yhVar.E = dp4;
        yhVar.F = dp5;
        float dp6 = AndroidUtilities.dp(7.0f);
        float dp7 = AndroidUtilities.dp(6.0f);
        yhVar.I = dp6;
        yhVar.J = dp7;
        yhVar.d0 = true;
        final int i30 = 3;
        yhVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ah
            public final /* synthetic */ ni b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ph.n3 n3Var;
                switch (i30) {
                    case 0:
                        ni niVar = this.b;
                        long j10 = niVar.S0;
                        if (j10 < 0 && (n3Var = (ph.n3) niVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = n3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ni niVar2 = this.b;
                        boolean z13 = niVar2.Y;
                        if (!z13) {
                            niVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ni niVar3 = this.b;
                        boolean z14 = niVar3.Y;
                        if (z14) {
                            niVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.W0.M(null, null);
                        break;
                    case 5:
                        ni.s(this.b);
                        break;
                    case 6:
                        fi fiVar = this.b.u0;
                        if (fiVar != null) {
                            fiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ni niVar4 = this.b;
                        niVar4.Z1(niVar4.u0 != niVar4.m0);
                        break;
                }
            }
        });
        yhVar.setOnLongClickListener(new org.telegram.ui.tf(this, context, c6Var, o2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        rh rhVar2 = new rh(this, context, 1);
        rhVar2.setAlpha(0.0f);
        rhVar2.setScaleX(0.2f);
        rhVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        sk0 fastScroll = chatAttachAlertPhotoLayout.A.getFastScroll();
        lg.a aVar6 = this.C2;
        og.d m10 = pg.a.m(c6Var);
        jl0 jl0Var = fastScroll.k0;
        ng.d c12 = aVar6.c(jl0Var.b1, m10, false);
        fastScroll.a0 = c12;
        c12.o(AndroidUtilities.dp(4.0f));
        fastScroll.a0.p(AndroidUtilities.dp(24.0f));
        ng.d c13 = aVar6.c(jl0Var.b1, m10, false);
        fastScroll.b0 = c13;
        c13.o(AndroidUtilities.dp(6.0f));
        fastScroll.b0.t(AndroidUtilities.dp(4.0f));
        fastScroll.b0.p(AndroidUtilities.dp(f9));
        nd0 nd0Var = new nd0(context);
        this.O = nd0Var;
        this.containerView.addView(nd0Var, i7.f6.c(-1.0f, -1));
        og.d dVar3 = new og.d(c6Var);
        dVar3.e = new wg(this, 4);
        dVar3.c = new wg(this, 5);
        dVar3.d = new wg(this, 6);
        dVar3.b = new wg(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.n = dpf2;
        dVar3.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f = dpf23;
        dVar3.h = dpf24;
        m1Var.L(this.C2, dVar3, false);
        kVar.i(1L, false);
    }

    public static void L(ni niVar) {
        int i10;
        cg.m1 m1Var = niVar.T0;
        ug.f fVar = niVar.r1;
        if (fVar == null || m1Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var = niVar.resourcesProvider;
        boolean a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        if (m1Var.getVisibility() == 0) {
            i10 = (int) (m1Var.getAlpha() * (a2 ? 255 : 160));
        } else {
            i10 = 0;
        }
        fVar.setFadeTopAlpha(i10);
    }

    public static void Q(ni niVar) {
        nh.i iVar = new nh.i(niVar, niVar.getContext(), niVar.V, LaunchActivity.R(), niVar.resourcesProvider, 1);
        niVar.x2 = iVar;
        iVar.p(new o1.a(niVar, 7));
        ViewGroup viewGroup = niVar.containerView;
        viewGroup.addView(niVar.x2, viewGroup.indexOfChild(niVar.z0), i7.f6.e(-1, -1, 83));
        nh.i iVar2 = niVar.x2;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            iVar2.getAdapter().i0 = false;
            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
            rf.v0 adapter = iVar2.getAdapter();
            tnVar.i();
            TLRPC.Chat chat = tnVar.e;
            adapter.getClass();
            adapter.h0 = chat;
            iVar2.getAdapter().W(tnVar.V7);
            iVar2.getAdapter().a0 = tnVar.e != null;
        } else {
            iVar2.getAdapter().i0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().a0 = false;
        }
        iVar2.getAdapter().b0 = false;
        niVar.U1();
    }

    public static /* synthetic */ void m(ni niVar, ValueAnimator valueAnimator) {
        niVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.d3 d3Var = niVar.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
    }

    public static /* synthetic */ void n(ni niVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.z2 z2Var) {
        niVar.currentSheetAnimation = null;
        niVar.l2 = null;
        animationNotificationsLocker.unlock();
        niVar.currentSheetAnimationType = 0;
        if (z2Var != null) {
            z2Var.onOpenAnimationEnd();
        }
        if (niVar.useHardwareLayer) {
            niVar.container.setLayerType(0, null);
        }
        if (niVar.isFullscreen) {
            WindowManager.LayoutParams attributes = niVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            niVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static /* synthetic */ void o(ni niVar, int i10) {
        niVar.navBarColorKey = -1;
        niVar.navBarColor = i10;
        niVar.containerView.invalidate();
    }

    public static void p(ni niVar) {
        o1.k kVar = niVar.l2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(niVar.containerView, o1.i.n, 0.0f);
        niVar.l2 = kVar2;
        kVar2.u.a(1.5f);
        niVar.l2.u.b(1500.0f);
        niVar.l2.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x0482, code lost:
    
        if (r26 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0484, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0488, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0489, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04ab, code lost:
    
        if (r26 == null) goto L194;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean q(ni niVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.o2 o2Var, View view) {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        org.telegram.ui.tn tnVar;
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
        org.telegram.ui.tn tnVar2;
        long j13;
        TLRPC.ChatFull chatFull;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        ni niVar2 = niVar;
        yh yhVar = niVar2.E0;
        org.telegram.ui.ActionBar.o2 o2Var2 = niVar2.b0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = niVar2.f0;
        int i13 = niVar2.F1;
        long j14 = niVar2.V;
        if ((j14 == 0 && !(o2Var2 instanceof org.telegram.ui.tn)) || niVar2.G - niVar2.H < 0 || niVar2.h.f) {
            return false;
        }
        if (o2Var2 instanceof org.telegram.ui.tn) {
            org.telegram.ui.tn tnVar3 = (org.telegram.ui.tn) o2Var2;
            TLRPC.User i14 = tnVar3.i();
            MessageObject messageObject5 = tnVar3.j5;
            MessageObject messageObject6 = tnVar3.g5;
            if (tnVar3.c() || tnVar3.N3 == 5) {
                return false;
            }
            messageObject2 = messageObject6;
            messageObject = messageObject5;
            tnVar = tnVar3;
            user = i14;
            j14 = tnVar3.a();
        } else {
            user = MessagesController.getInstance(i13).getUser(Long.valueOf(j14));
            messageObject = null;
            messageObject2 = null;
            tnVar = null;
        }
        ff ffVar = niVar2.d0;
        if (ffVar != null) {
            ffVar.dismiss();
        }
        ff ffVar2 = new ff(niVar2, context, c6Var, 1);
        niVar2.d0 = ffVar2;
        ffVar2.r(yhVar, false, new bg.q(niVar2, o2Var, c6Var, 22));
        ArrayList arrayList2 = new ArrayList();
        fi fiVar = niVar2.u0;
        if (fiVar == chatAttachAlertPhotoLayout3 || fiVar == niVar2.m0) {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.isEmpty()) {
                z10 = false;
                z11 = false;
                messageObject3 = null;
            } else {
                String str2 = "";
                int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                MessageObject messageObject7 = null;
                int i15 = 0;
                int i16 = 0;
                z10 = false;
                z11 = false;
                while (i15 < ceil) {
                    int i17 = i15 * 10;
                    MessageObject messageObject8 = messageObject7;
                    MessageObject messageObject9 = messageObject2;
                    String str3 = str2;
                    int min = Math.min(10, selectedPhotos.size() - i17);
                    HashMap<Object, Object> hashMap2 = selectedPhotos;
                    long nextLong = Utilities.random.nextLong();
                    int i18 = i16;
                    int i19 = ceil;
                    int i20 = 0;
                    while (i20 < min) {
                        int i21 = min;
                        int i22 = i17 + i20;
                        int i23 = i20;
                        if (i22 >= selectedPhotosOrder.size()) {
                            j11 = j14;
                            i10 = i15;
                            hashMap = hashMap2;
                            arrayList = selectedPhotosOrder;
                        } else {
                            HashMap<Object, Object> hashMap3 = hashMap2;
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) hashMap3.get(selectedPhotosOrder.get(i22));
                            arrayList = selectedPhotosOrder;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            int i24 = i18 + 1;
                            tL_message.id = i18;
                            hashMap = hashMap3;
                            tL_message.out = true;
                            i10 = i15;
                            tL_message.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(j14);
                            boolean z15 = photoEntry.isVideo;
                            if (z15 || (str = photoEntry.imagePath) == null) {
                                String str4 = photoEntry.path;
                                if (str4 != null) {
                                    tL_message.attachPath = str4;
                                }
                            } else {
                                tL_message.attachPath = str;
                            }
                            if (i21 > 0) {
                                tL_message.grouped_id = nextLong;
                            }
                            int i25 = photoEntry.width;
                            int i26 = photoEntry.height;
                            int i27 = photoEntry.orientation;
                            if (z15) {
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
                                                } catch (Exception e10) {
                                                    e = e10;
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
                                                    try {
                                                        mediaMetadataRetriever3.setDataSource(open.getFileDescriptor(), photoEntry.livePhotoVideoOffset, file.length() - photoEntry.livePhotoVideoOffset);
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        i11 = 0;
                                                        photoEntry.videoOrientation = i11;
                                                        FileLog.e(e);
                                                        if (mediaMetadataRetriever2 != null) {
                                                        }
                                                    } catch (Throwable th5) {
                                                        th3 = th5;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        th2 = th3;
                                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                                        if (mediaMetadataRetriever != null) {
                                                        }
                                                        if (parcelFileDescriptor == null) {
                                                        }
                                                    }
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    parcelFileDescriptor = open;
                                                } catch (Throwable th6) {
                                                    th3 = th6;
                                                    parcelFileDescriptor = open;
                                                }
                                            }
                                            try {
                                                try {
                                                    photoEntry.videoOrientation = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(24));
                                                    try {
                                                        mediaMetadataRetriever2.release();
                                                    } catch (IOException e13) {
                                                        FileLog.e(e13);
                                                    }
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    i11 = 0;
                                                    photoEntry.videoOrientation = i11;
                                                    FileLog.e(e);
                                                    if (mediaMetadataRetriever2 != null) {
                                                        try {
                                                            mediaMetadataRetriever2.release();
                                                        } catch (IOException e15) {
                                                            FileLog.e(e15);
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
                                                    } catch (IOException e16) {
                                                        FileLog.e(e16);
                                                    }
                                                }
                                                if (parcelFileDescriptor == null) {
                                                    throw th2;
                                                }
                                                try {
                                                    parcelFileDescriptor.close();
                                                    throw th2;
                                                } catch (IOException e17) {
                                                    FileLog.e(e17);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Exception e18) {
                                            e = e18;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                        }
                                    } catch (Exception e19) {
                                        e = e19;
                                        mediaMetadataRetriever2 = null;
                                    } catch (Throwable th9) {
                                        th2 = th9;
                                        mediaMetadataRetriever = null;
                                    }
                                }
                                i27 = photoEntry.videoOrientation;
                            } else {
                                j11 = j14;
                            }
                            if ((i27 / 90) % 2 != 0) {
                                i26 = i25;
                                i25 = i26;
                            }
                            if (photoEntry.isLivePhoto()) {
                                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                                tL_message.media = tL_messageMediaPhoto;
                                tL_messageMediaPhoto.live_photo = true;
                                tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
                                TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                tL_photoSize.w = i25;
                                tL_photoSize.h = i26;
                                tL_photoSize.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                tL_message.media.photo.sizes.add(tL_photoSize);
                                tL_message.media.document = new TLRPC.TL_document();
                                tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                tL_documentAttributeVideo.w = i25;
                                tL_documentAttributeVideo.h = i26;
                                tL_documentAttributeVideo.duration = photoEntry.duration;
                                tL_message.media.document.attributes.add(tL_documentAttributeVideo);
                            } else if (photoEntry.isVideo) {
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                tL_documentAttributeVideo2.w = i25;
                                tL_documentAttributeVideo2.h = i26;
                                tL_documentAttributeVideo2.duration = photoEntry.duration;
                                tL_message.media.document.attributes.add(tL_documentAttributeVideo2);
                            } else {
                                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                                tL_message.media = tL_messageMediaPhoto2;
                                tL_messageMediaPhoto2.photo = new TLRPC.TL_photo();
                                TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                tL_photoSize2.w = i25;
                                tL_photoSize2.h = i26;
                                tL_photoSize2.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                tL_message.media.photo.sizes.add(tL_photoSize2);
                            }
                            tL_message.media.spoiler = photoEntry.hasSpoiler;
                            CharSequence charSequence = photoEntry.caption;
                            String charSequence2 = charSequence == null ? str3 : charSequence.toString();
                            tL_message.message = charSequence2;
                            if (TextUtils.isEmpty(charSequence2) && i10 == 0 && i23 == 0) {
                                CharSequence[] charSequenceArr = {niVar2.m1().getText()};
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
                            i18 = i24;
                            z10 = true;
                            z11 = true;
                        }
                        i20 = i23 + 1;
                        selectedPhotosOrder = arrayList;
                        min = i21;
                        hashMap2 = hashMap;
                        i15 = i10;
                        j14 = j11;
                    }
                    i15++;
                    ceil = i19;
                    str2 = str3;
                    messageObject2 = messageObject9;
                    selectedPhotos = hashMap2;
                    i16 = i18;
                    messageObject7 = messageObject8;
                }
                messageObject3 = messageObject7;
            }
            j10 = j14;
            messageObject4 = messageObject3;
        } else if (fiVar == niVar2.g0) {
            if (TextUtils.isEmpty(niVar2.m1().getText())) {
                chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                i12 = 0;
                z14 = false;
            } else {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                tL_message2.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                tL_message2.peer_id = MessagesController.getInstance(i13).getPeer(j14);
                CharSequence[] charSequenceArr2 = {niVar2.m1().getText()};
                MessageObject.addLinks(true, charSequenceArr2[0]);
                tL_message2.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr2, true);
                tL_message2.message = charSequenceArr2[0].toString();
                MessageObject messageObject11 = new MessageObject(i13, tL_message2, true, false);
                messageObject11.sendPreview = true;
                messageObject11.notime = true;
                messageObject11.isOutOwnerCached = Boolean.TRUE;
                arrayList2.add(messageObject11);
                i12 = 1;
                z14 = true;
            }
            ArrayList<TLRPC.User> selected = niVar2.g0.getSelected();
            int i28 = 0;
            while (i28 < selected.size()) {
                TLRPC.User user2 = selected.get(i28);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                int i29 = i12 + 1;
                tL_message3.id = i12;
                ArrayList<TLRPC.User> arrayList3 = selected;
                tL_message3.out = true;
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
                i28++;
                i12 = i29;
                selected = arrayList3;
                z14 = true;
            }
            messageObject4 = null;
            z10 = false;
            niVar2 = niVar;
            j10 = j14;
            z11 = z14;
        } else {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
            if (fiVar == niVar2.l0) {
                messageObject4 = null;
                boolean z16 = false;
                int i30 = 0;
                for (int i31 = 0; i31 < niVar2.l0.O.size(); i31++) {
                    String str5 = (String) niVar2.l0.O.get(i31);
                    if (str5 != null) {
                        int lastIndexOf = str5.lastIndexOf(File.separator);
                        String substring = lastIndexOf < 0 ? str5 : str5.substring(lastIndexOf + 1);
                        if (!TextUtils.isEmpty(substring)) {
                            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                            int i32 = i30 + 1;
                            tL_message4.id = i30;
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
                            if (TextUtils.isEmpty(tL_message4.message) && i31 == 0) {
                                z12 = true;
                                z13 = false;
                                CharSequence[] charSequenceArr3 = {niVar2.m1().getText()};
                                tL_message4.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr3, true);
                                tL_message4.message = charSequenceArr3[0].toString();
                            } else {
                                z12 = true;
                                z13 = false;
                            }
                            MessageObject messageObject13 = new MessageObject(i13, tL_message4, z12, z13);
                            messageObject13.attachPathExists = z12;
                            messageObject13.sendPreview = z12;
                            messageObject13.notime = z12;
                            messageObject13.isOutOwnerCached = Boolean.TRUE;
                            arrayList2.add(messageObject13);
                            if (i31 == 0 && messageObject4 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                messageObject4 = messageObject13;
                            }
                            i30 = i32;
                            z16 = true;
                        }
                    }
                }
                j10 = j14;
                z11 = z16;
                z10 = false;
            } else {
                yi yiVar = niVar2.h0;
                if (fiVar == yiVar) {
                    arrayList2.addAll(yiVar.getSelected());
                    if (!arrayList2.isEmpty()) {
                        messageObject4 = (MessageObject) arrayList2.get(0);
                        CharSequence[] charSequenceArr4 = {niVar2.m1().getText()};
                        MessageObject.addLinks(true, charSequenceArr4[0]);
                        messageObject4.messageOwner.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr4, true);
                        messageObject4.messageOwner.message = charSequenceArr4[0].toString();
                        if (!TextUtils.isEmpty(messageObject4.messageOwner.message)) {
                            messageObject4.generateCaption();
                            if (arrayList2.size() > 1) {
                                for (int i33 = 0; i33 < Math.ceil(arrayList2.size() / 10.0f); i33++) {
                                    int i34 = i33 * 10;
                                    int min2 = Math.min(10, arrayList2.size() - i34);
                                    long nextLong2 = Utilities.random.nextLong();
                                    for (int i35 = 0; i35 < min2; i35++) {
                                        int i36 = i34 + i35;
                                        if (i36 < arrayList2.size()) {
                                            ((MessageObject) arrayList2.get(i36)).messageOwner.grouped_id = nextLong2;
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
        if (arrayList2.isEmpty()) {
            return false;
        }
        j70 F = j70.F(niVar2.containerView, c6Var, yhVar);
        if (messageObject4 != null) {
            fi fiVar2 = niVar2.u0;
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (fiVar2 == chatAttachAlertPhotoLayout2 || fiVar2 == niVar2.m0) {
                qb0 qb0Var = new qb0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), c6Var);
                TLRPC.Message message = messageObject4.messageOwner;
                boolean z17 = niVar2.Y;
                message.invert_media = z17;
                qb0Var.a(!z17, false);
                qb0Var.setOnClickListener(new bg.q(niVar2, messageObject4, qb0Var, 23));
                F.q(qb0Var);
                if (niVar2.D1 == null) {
                    F.k();
                }
            }
        } else {
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        }
        boolean isUserSelf = UserObject.isUserSelf(user);
        if (niVar2.D1 != null || ((tnVar != null && ChatObject.isMonoForum(tnVar.e)) || ((tnVar == null || !tnVar.D6()) && !niVar2.u0.c()))) {
            j12 = j10;
        } else {
            j12 = j10;
            F.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new g5.v(niVar2, j12, c6Var, 21), false);
        }
        fi fiVar3 = niVar2.u0;
        if ((fiVar3 == chatAttachAlertPhotoLayout2 || fiVar3 == niVar2.m0) && fiVar3.getSelectedItemsCount() == 1 && tnVar != null && ChatObject.isMonoForum(tnVar.e)) {
            tnVar2 = tnVar;
            j13 = j12;
            F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new org.telegram.messenger.sg(niVar2, j12, tnVar2, c6Var, 4), false);
        } else {
            j13 = j12;
            tnVar2 = tnVar;
        }
        if (niVar2.D1 == null && !isUserSelf) {
            F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new zg(niVar2, 1), false);
        }
        if (niVar2.D1 == null && z10 && tnVar2 != null && ChatObject.isChannelAndNotMegaGroup(tnVar2.e) && (chatFull = tnVar2.V7) != null && chatFull.paid_media_allowed) {
            F.c(R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton), null, false);
            org.telegram.ui.ActionBar.g1 y8 = F.y();
            y8.setOnClickListener(new ih.u3(niVar2, context, y8, c6Var, 10));
            long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
            if (starsPrice > 0) {
                y8.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                y8.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                y8.setText(LocaleController.getString(R.string.PaidMediaButton));
                y8.setSubtext(null);
            }
            niVar2.d0.s(starsPrice);
        }
        F.Y();
        niVar2.d0.p(F);
        niVar2.d0.q(arrayList2);
        if (niVar2.D1 == null && j13 >= 0 && z11) {
            niVar2.d0.d(o2Var);
            niVar2.d0.o(niVar2.J0);
        }
        niVar2.d0.show();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static /* synthetic */ void r(ni niVar, g gVar) {
        AnimatorSet animatorSet = niVar.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        gVar.run();
    }

    public static void s(ni niVar) {
        if (niVar.f0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(S);
                        for (int i10 = 0; i10 < chatAttachAlertPhotoLayout.A.getChildCount(); i10++) {
                            View childAt = chatAttachAlertPhotoLayout.A.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.r5) {
                                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                                if (r5Var.getPhotoEntry() == photoEntry) {
                                    r5Var.getImageView().invalidate();
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
        niVar.Y1(true);
        org.telegram.ui.ActionBar.w0 w0Var = niVar.Y0;
        nh.t3 t3Var = niVar.Z0;
        if (t3Var != null) {
            t3Var.e(true);
        }
        nh.t3 t3Var2 = new nh.t3(niVar.getContext(), 1);
        niVar.Z0 = t3Var2;
        t3Var2.t(AndroidUtilities.replaceTags(LocaleController.getString(!S ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        niVar.Z0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        niVar.Z0.n(1.0f, -((niVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        niVar.Z0.setTranslationY(niVar.W0.getTranslationY());
        nh.t3 t3Var3 = niVar.Z0;
        t3Var3.h0 = new z2(9, niVar, t3Var2);
        niVar.containerView.addView(t3Var3, i7.f6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        niVar.Z0.v();
    }

    public static /* synthetic */ void t(ni niVar, boolean z10, zg zgVar) {
        niVar.u0.s(1.0f);
        niVar.v0.s(1.0f);
        niVar.u0.k(niVar.h2);
        niVar.v0.k(niVar.h2);
        niVar.containerView.invalidate();
        niVar.T0.setTag(z10 ? 1 : null);
        zgVar.run();
    }

    public static void v(ni niVar, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        ni niVar2 = niVar;
        qh qhVar = niVar2.u1;
        fi[] fiVarArr = niVar2.s0;
        org.telegram.ui.ActionBar.o2 o2Var = niVar2.b0;
        org.telegram.ui.ActionBar.o2 R = o2Var == null ? LaunchActivity.R() : o2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (view instanceof hi) {
            Activity parentActivity = R.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!niVar2.H1 && !niVar2.I1 && niVar2.a1()) {
                    return;
                }
                if (!niVar2.H1 && !niVar2.I1) {
                    pn pnVar = new pn(1, niVar2.getContext(), c6Var, niVar2);
                    niVar2.P = pnVar;
                    niVar2.Q1(pnVar);
                }
                niVar2.Q1(niVar2.f0);
            } else if (intValue == 3) {
                if (!niVar2.J1 && niVar2.a1()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(niVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                niVar2.B1(true);
            } else if (intValue == 4) {
                if (!niVar2.G1 && niVar2.a1()) {
                    return;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(niVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                niVar2.E1(true);
            } else if (intValue == 5) {
                if (!niVar2.M1 && niVar2.a1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && niVar2.M1 && niVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(niVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                niVar2.D1();
            } else if (intValue == 6) {
                if ((!niVar2.M1 && niVar2.a1()) || !AndroidUtilities.isMapsInstalled(o2Var)) {
                    return;
                }
                if (niVar2.M1) {
                    if (niVar2.k0 == null) {
                        bl blVar = new bl(niVar2, niVar2.getContext(), c6Var, (niVar2.D || niVar2.N1) ? false : true);
                        niVar2.k0 = blVar;
                        fiVarArr[5] = blVar;
                        wk wkVar = niVar2.p2;
                        if (wkVar != null) {
                            blVar.setDelegate(wkVar);
                        } else {
                            blVar.setDelegate(new wg(niVar2, 9));
                        }
                    }
                    niVar2.Q1(niVar2.k0);
                } else {
                    pn pnVar2 = new pn(6, niVar2.getContext(), c6Var, niVar2);
                    niVar2.P = pnVar2;
                    niVar2.Q1(pnVar2);
                }
            } else if (intValue == 9) {
                if (!niVar2.K1 && niVar2.a1()) {
                    return;
                }
                if (niVar2.K1) {
                    niVar2.S1(true, null);
                } else {
                    pn pnVar3 = new pn(9, niVar2.getContext(), c6Var, niVar2);
                    niVar2.P = pnVar3;
                    niVar2.Q1(pnVar3);
                }
            } else if (intValue == 11) {
                if (niVar2.o0 == null) {
                    sf.d0 d0Var = new sf.d0(niVar2.getContext(), niVar2.resourcesProvider, niVar2);
                    niVar2.o0 = d0Var;
                    fiVarArr[7] = d0Var;
                    d0Var.setupBlurredSearchField(niVar2.C2);
                }
                niVar2.Q1(niVar2.o0);
            } else if (intValue == 12) {
                if (!niVar2.L1 && niVar2.a1()) {
                    return;
                }
                if (niVar2.L1) {
                    if (niVar2.j0 == null) {
                        on onVar = new on(niVar, niVar.getContext(), true, c6Var, null);
                        niVar2 = niVar;
                        niVar2.j0 = onVar;
                        fiVarArr[1] = onVar;
                        onVar.setDelegate(new wg(niVar2, 10));
                    }
                    niVar2.Q1(niVar2.j0);
                } else {
                    pn pnVar4 = new pn(9, niVar2.getContext(), c6Var, niVar2);
                    niVar2.P = pnVar4;
                    niVar2.Q1(pnVar4);
                }
            } else if (intValue == 13) {
                if (niVar2.q0 == null) {
                    kk kkVar = new kk(niVar2, niVar2.getContext(), c6Var, true);
                    niVar2.q0 = kkVar;
                    fiVarArr[8] = kkVar;
                    kkVar.setDelegate(niVar2.W1);
                }
                niVar2.Q1(niVar2.q0);
            } else if (intValue == 14) {
                if (niVar2.p0 == null) {
                    kk kkVar2 = new kk(niVar2, niVar2.getContext(), c6Var, false);
                    niVar2.p0 = kkVar2;
                    fiVarArr[9] = kkVar2;
                    kkVar2.setDelegate(niVar2.W1);
                }
                niVar2.Q1(niVar2.p0);
            } else if (intValue == 16) {
                if (niVar2.r0 == null) {
                    th.p pVar = new th.p(niVar2.F1, niVar2.getContext(), c6Var, niVar2);
                    niVar2.r0 = pVar;
                    fiVarArr[10] = pVar;
                }
                niVar2.Q1(niVar2.r0);
            } else if (view.getTag() instanceof Integer) {
                niVar2.V1.B1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, niVar2.s1(), false, 0L);
            }
        } else if (view instanceof gi) {
            gi giVar = (gi) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = giVar.c;
            if (tL_attachMenuBot == null) {
                niVar2.V1.j1(giVar.b);
                niVar2.dismiss();
            } else if (tL_attachMenuBot.inactive) {
                gi1.a(niVar2.getContext(), new lh.y1(5, niVar2, giVar), null);
            } else {
                niVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int dp = AndroidUtilities.dp(70.0f);
        int i12 = left - dp;
        if (i12 < 0) {
            qhVar.v0(i12, 0, null);
            return;
        }
        int i13 = right + dp;
        if (i13 > qhVar.getMeasuredWidth()) {
            qhVar.v0(i13 - qhVar.getMeasuredWidth(), 0, null);
        }
    }

    public static /* synthetic */ void w(ni niVar) {
        fi fiVar;
        lm lmVar;
        niVar.p1 = null;
        fi fiVar2 = niVar.u0;
        if (fiVar2 != niVar.f0 && (fiVar = niVar.v0) != (lmVar = niVar.m0) && fiVar2 != fiVar && fiVar2 != lmVar) {
            niVar.containerView.removeView(fiVar2);
        }
        niVar.u0.setVisibility(8);
        niVar.u0.q();
        niVar.v0.E();
        niVar.u0 = niVar.v0;
        niVar.v0 = null;
        int[] iArr = niVar.X1;
        iArr[0] = iArr[1];
        niVar.H1(niVar.Y, false);
        niVar.W1();
    }

    public final void A1(int i10) {
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (i10 != 3) {
            if (i10 == 6 && AndroidUtilities.isMapsInstalled(o2Var)) {
                if (this.k0 == null) {
                    bl blVar = new bl(this, getContext(), this.resourcesProvider, (this.D || this.N1) ? false : true);
                    this.k0 = blVar;
                    this.s0[5] = blVar;
                    wk wkVar = this.p2;
                    if (wkVar != null) {
                        blVar.setDelegate(wkVar);
                    } else if (o2Var instanceof org.telegram.ui.tn) {
                        blVar.setDelegate(new wg(this, 16));
                    }
                }
                Q1(this.k0);
                return;
            }
            return;
        }
        if (this.J1 || !a1()) {
            Activity parentActivity = o2Var != null ? o2Var.getParentActivity() : null;
            if (parentActivity != null) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            B1(true);
        }
    }

    public final void B1(boolean z10) {
        if (!this.J1 && z10) {
            pn pnVar = new pn(3, getContext(), this.resourcesProvider, this);
            this.P = pnVar;
            Q1(pnVar);
        }
        int i10 = 1;
        if (this.h0 == null) {
            yi yiVar = new yi(getContext(), this.resourcesProvider, this);
            this.h0 = yiVar;
            this.s0[3] = yiVar;
            yiVar.setupBlurredSearchField(this.C2);
            this.h0.setDelegate(new wg(this, 13));
            if (this.D) {
                this.h0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            TLRPC.Chat chat = ((org.telegram.ui.tn) o2Var).e;
            yi yiVar2 = this.h0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.D1 == null) {
                i10 = -1;
            }
            yiVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            Q1(this.h0);
        }
    }

    public final void C1() {
        if (this.n0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
            bj bjVar = new bj(context, c6Var, this);
            bjVar.r = AndroidUtilities.dp(80.0f);
            bjVar.w = 3;
            jh.e1 e1Var = new jh.e1(bjVar, context, c6Var, 10);
            bjVar.n = e1Var;
            wa waVar = new wa(bjVar, context);
            bjVar.v = waVar;
            e1Var.setAdapter(waVar);
            e1Var.setClipToPadding(false);
            e1Var.setItemAnimator(null);
            e1Var.setLayoutAnimation(null);
            e1Var.setVerticalScrollBarEnabled(false);
            e1Var.setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, bjVar.a));
            bjVar.addView(e1Var, i7.f6.c(-1.0f, -1));
            e1Var.setOnScrollListener(new cg.g2(bjVar, 20));
            mh.k kVar = new mh.k(bjVar, bjVar.r, 1);
            bjVar.s = kVar;
            kVar.O = new ih.n5(bjVar, 4);
            e1Var.setLayoutManager(kVar);
            this.n0 = bjVar;
            bjVar.setDelegate(new cb(this, 1));
        }
        Q1(this.n0);
    }

    public final void D1() {
        if (!this.M1) {
            pn pnVar = new pn(5, getContext(), this.resourcesProvider, this);
            this.P = pnVar;
            Q1(pnVar);
        }
        if (this.g0 == null) {
            sj sjVar = new sj(getContext(), this.resourcesProvider, this);
            this.g0 = sjVar;
            this.s0[2] = sjVar;
            sjVar.setupBlurredSearchField(this.C2);
            this.g0.setDelegate(new zh(this));
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            TLRPC.Chat chat = ((org.telegram.ui.tn) o2Var).e;
            this.g0.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        Q1(this.g0);
    }

    public final void E1(boolean z10) {
        if (!this.G1 && z10) {
            pn pnVar = new pn(4, getContext(), this.resourcesProvider, this);
            this.P = pnVar;
            Q1(pnVar);
        }
        boolean z11 = false;
        if (this.l0 == null) {
            jk jkVar = new jk(this.J ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.l0 = jkVar;
            this.s0[4] = jkVar;
            jkVar.setDelegate(new ai(this));
        }
        int i10 = 1;
        if (this.D) {
            this.l0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = this.b0;
            if (o2Var instanceof org.telegram.ui.tn) {
                TLRPC.Chat chat = ((org.telegram.ui.tn) o2Var).e;
                jk jkVar2 = this.l0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.D1 == null) {
                    i10 = -1;
                }
                jkVar2.setMaxSelectedFiles(i10);
            } else {
                this.l0.setMaxSelectedFiles(this.O1);
                jk jkVar3 = this.l0;
                if (!this.J && !this.S) {
                    z11 = true;
                }
                jkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        jk jkVar4 = this.l0;
        jkVar4.W = this.J;
        if (z10) {
            Q1(jkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        cg.m1 m1Var = this.T0;
        int i10 = 1;
        if (m1Var.j0) {
            m1Var.h(true);
        }
        this.g0 = null;
        this.o0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        while (true) {
            fi[] fiVarArr = this.s0;
            if (i10 >= fiVarArr.length) {
                T1(false, false);
                super.dismissInternal();
                return;
            }
            fi fiVar = fiVarArr[i10];
            if (fiVar != null) {
                fiVar.m();
                this.containerView.removeView(fiVarArr[i10]);
                fiVarArr[i10] = null;
            }
            i10++;
        }
    }

    public final boolean G1(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        if (this.E1) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
            TLRPC.Chat chat = tnVar.e;
            if (tnVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(this.F1).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + tnVar.a(), !z10).commit();
            }
        }
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f) {
            this.E1 = true;
            this.V1.B1(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        fi fiVar = this.u0;
        return c5.b0(this.F1, n12, j1() + (fiVar != null ? fiVar.getSelectedItemsCount() : 1), new Utilities.Callback() { // from class: org.telegram.ui.Components.jh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ni niVar = ni.this;
                niVar.E1 = true;
                niVar.V1.B1(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void H1(boolean z10, boolean z11) {
        this.b.a(z10, z11);
        au m12 = m1();
        this.Y = z10;
        au m13 = m1();
        final boolean z12 = this.z0.getTag() != null;
        fi fiVar = this.u0;
        final boolean z13 = this.Y && (fiVar == this.f0 || fiVar == this.m0);
        bg.d1 d1Var = this.K0;
        sh shVar = this.y0;
        if (z11) {
            d1Var.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = d1Var.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            jr jrVar = jr.h;
            final int i10 = 0;
            duration.setInterpolator(jrVar).setUpdateListener(new xg(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.yg
                public final /* synthetic */ ni b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            ni niVar = this.b;
                            if (!z13 || !z12) {
                                niVar.K0.setVisibility(8);
                            }
                            niVar.b2();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.b.y0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            shVar.setVisibility(0);
            ViewPropertyAnimator interpolator = shVar.animate().translationY((z13 || !z12) ? shVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(jrVar);
            final int i11 = 1;
            interpolator.setUpdateListener(new xg(this, i11)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.yg
                public final /* synthetic */ ni b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            ni niVar = this.b;
                            if (!z13 || !z12) {
                                niVar.K0.setVisibility(8);
                            }
                            niVar.b2();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.b.y0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
        } else {
            d1Var.setVisibility((z13 && z12) ? 0 : 8);
            d1Var.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            b2();
            shVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            shVar.setTranslationY((z13 || !z12) ? shVar.getMeasuredHeight() : 0.0f);
            shVar.setVisibility((z13 || !z12) ? 8 : 0);
        }
        if (m12 != m13) {
            m12.k(true);
            m13.setText(y5.cloneSpans(m12.getText()));
            m13.getEditText().setAllowTextEntitiesIntersection(m12.getEditText().getAllowTextEntitiesIntersection());
            if (m12.getEditText().isFocused()) {
                m13.getEditText().requestFocus();
                m13.getEditText().setSelection(m12.getEditText().getSelectionStart(), m12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new zg(this, 0));
    }

    public final void I1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f0) != null) {
            chatAttachAlertPhotoLayout.Z();
        }
        if (this.D1 == messageObject && this.C1 == i10) {
            return;
        }
        this.D1 = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            i10 = this.D1.isMusic() ? 2 : this.D1.isDocument() ? 1 : 0;
        }
        this.C1 = i10;
        if (this.D1 != null) {
            this.O1 = 1;
            this.P1 = false;
        } else {
            this.O1 = -1;
            this.P1 = true;
        }
        this.w1.l();
        V1(0);
    }

    public final void J1(int i10, boolean z10) {
        if (this.D1 != null) {
            return;
        }
        this.O1 = i10;
        this.P1 = z10;
    }

    public final void K1(float f9) {
        int k9 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.a7), Math.min(255, Math.max(0, (int) (f9 * 255.0f))));
        this.navBarColor = k9;
        AndroidUtilities.setNavigationBarColor((Dialog) this, k9, false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        getContainer().invalidate();
    }

    public final void L1(String str) {
        this.M0 = 1;
        this.B = true;
        this.O0 = false;
        this.I1 = false;
        this.t1.setVisibility(8);
        this.f1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        if (chatAttachAlertPhotoLayout != null) {
            ni niVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.c1 = (niVar.M0 == 0 || niVar.B) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M1(boolean z10) {
        boolean z11;
        if (z10) {
            org.telegram.ui.ActionBar.o2 o2Var = this.b0;
            if ((o2Var instanceof org.telegram.ui.tn) && !((org.telegram.ui.tn) o2Var).w()) {
                z11 = true;
                if (this.u2 != z11) {
                    return;
                }
                if (z11) {
                    MessagesController.getInstance(this.F1).getTonesController().load();
                }
                this.u2 = z11;
                ImageView imageView = this.w;
                imageView.setVisibility(0);
                ImageView imageView2 = this.y;
                imageView2.setVisibility(0);
                ViewPropertyAnimator scaleY = imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f);
                jr jrVar = jr.h;
                scaleY.setInterpolator(jrVar).setDuration(420L).withEndAction(new ih(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(jrVar).setDuration(420L).withEndAction(new ih(this, z11, 2)).start();
                if (z11) {
                    k0 k0Var = this.x;
                    Objects.requireNonNull(k0Var);
                    imageView.postDelayed(new j0(k0Var, 1), 220L);
                    k0 k0Var2 = this.A;
                    Objects.requireNonNull(k0Var2);
                    imageView2.postDelayed(new j0(k0Var2, 1), 220L);
                    return;
                }
                return;
            }
        }
        z11 = false;
        if (this.u2 != z11) {
        }
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        fi fiVar;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        if (i10 == 2) {
            e1();
            on onVar = this.i0;
            if (onVar != null && ((fiVar = this.v0) == onVar || this.u0 == onVar)) {
                a2(fiVar == onVar ? 1 : 0);
            }
            on onVar2 = this.j0;
            if (onVar2 != null) {
                fi fiVar2 = this.v0;
                if (fiVar2 == onVar2 || this.u0 == onVar2) {
                    a2(fiVar2 != onVar2 ? 0 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 1) {
            e1();
            return;
        }
        if (i10 == 3) {
            f1();
            return;
        }
        if (i10 == 4) {
            f1();
            return;
        }
        if (i10 == 5) {
            f1();
            yh yhVar = this.E0;
            if (yhVar != null) {
                yhVar.setEphemeralFactor(f9);
                yhVar.setSameWidthFactor(f9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1(long j10, String str, boolean z10, boolean z11) {
        long j11;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.t0;
        int i10 = 1;
        if (longSparseArray.get(j10) != null && Objects.equals(str, ((ph.n3) longSparseArray.get(j10)).getStartCommand())) {
            ph.n3 n3Var = (ph.n3) longSparseArray.get(j10);
            if (n3Var.D) {
                n3Var.D = false;
            }
            if (longSparseArray.get(j10) != null) {
                ((ph.n3) longSparseArray.get(j10)).F.setSwipeOffsetAnimationDisallowed(true);
                R1((fi) longSparseArray.get(j10), -j10, z11);
                if (z10) {
                    ph.n3 n3Var2 = (ph.n3) longSparseArray.get(j10);
                    TLRPC.User user = MessagesController.getInstance(n3Var2.B).getUser(Long.valueOf(n3Var2.v));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(n3Var2.B).getAttachMenuBots().bots;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            tL_attachMenuBot = null;
                            break;
                        }
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                        i11++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                        if (tL_attachMenuBot.bot_id == n3Var2.v) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z12 = tL_attachMenuBot.show_in_side_menu;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(15, n3Var2, (z12 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name) : z12 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
            ph.n3 n3Var3 = new ph.n3(context, c6Var, this);
            n3Var3.Q = new ph.f3(n3Var3, 2);
            org.telegram.ui.ActionBar.w0 a2 = n3Var3.b.T0.n().a(0, R.drawable.ic_ab_other);
            n3Var3.G = a2;
            a2.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
            org.telegram.ui.ActionBar.g1 e10 = a2.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
            n3Var3.H = e10;
            e10.setVisibility(8);
            a2.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
            org.telegram.ui.ActionBar.g1 e11 = a2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            n3Var3.I = e11;
            e11.setVisibility(8);
            a2.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
            a2.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
            a2.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
            ph.i3 i3Var = new ph.i3(n3Var3, context, c6Var, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, n3Var3.a));
            n3Var3.n = i3Var;
            ph.g2 g2Var = new ph.g2(n3Var3, context, i10);
            n3Var3.F = g2Var;
            g2Var.addView(i3Var, i7.f6.c(-1.0f, -1));
            g2Var.setScrollListener(new ph.f3(n3Var3, 3));
            g2Var.setScrollEndListener(new ph.f3(n3Var3, 4));
            g2Var.setDelegate(new ph.h3(n3Var3));
            g2Var.setIsKeyboardVisible(new ph.h3(n3Var3));
            n3Var3.addView(g2Var, i7.f6.c(-1.0f, -1));
            ph.j3 j3Var = new ph.j3(context, c6Var);
            n3Var3.E = j3Var;
            n3Var3.addView(j3Var, i7.f6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            i3Var.setWebViewProgressListener(new ag.p(n3Var3, 5));
            NotificationCenter.getGlobalInstance().addObserver(n3Var3, NotificationCenter.didSetNewTheme);
            longSparseArray.put(j10, n3Var3);
            ((ph.n3) longSparseArray.get(j10)).setDelegate(new uh(this, n3Var3, str, j10));
            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
            MessageObject replyingMessageObject = tnVar.U.getReplyingMessageObject();
            ph.n3 n3Var4 = (ph.n3) longSparseArray.get(j10);
            long a10 = tnVar.a();
            int i12 = replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0;
            long N8 = tnVar.N8();
            ph.i3 i3Var2 = n3Var4.n;
            int i13 = this.F1;
            n3Var4.B = i13;
            n3Var4.w = a10;
            n3Var4.v = j10;
            n3Var4.y = i12;
            n3Var4.A = N8;
            n3Var4.C = str;
            org.telegram.ui.ActionBar.g1 g1Var = n3Var4.I;
            if (g1Var != null) {
                if (MediaDataController.getInstance(i13).canCreateAttachedMenuBotShortcut(j10)) {
                    g1Var.setVisibility(0);
                } else {
                    g1Var.setVisibility(8);
                }
            }
            i3Var2.setBotUser(MessagesController.getInstance(i13).getUser(Long.valueOf(j10)));
            i3Var2.q(i13, j10);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(i13).getInputPeer(a10);
            tL_messages_requestWebView.bot = MessagesController.getInstance(i13).getInputUser(j10);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a10 < 0) {
                j11 = 0;
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i13).getChatFull(-a10);
                if (chatFull != null && (peer = chatFull.default_send_as) != null) {
                    tL_messages_requestWebView.send_as = MessagesController.getInstance(i13).getInputPeer(peer);
                    tL_messages_requestWebView.flags |= 8192;
                }
            } else {
                j11 = 0;
            }
            if (str != null) {
                tL_messages_requestWebView.start_param = str;
                tL_messages_requestWebView.flags |= 8;
            }
            if (i12 != 0) {
                TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(i13).createReplyInput(i12);
                tL_messages_requestWebView.reply_to = createReplyInput;
                if (N8 != j11) {
                    createReplyInput.monoforum_peer_id = MessagesController.getInstance(i13).getInputPeer(N8);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (N8 != j11) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(i13).getInputPeer(N8);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject p10 = ph.p2.p(n3Var4.a, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_requestWebView, new jh.s1(n3Var4, i13, 9));
            NotificationCenter.getInstance(i13).addObserver(n3Var4, NotificationCenter.webViewResultSent);
            if (longSparseArray.get(j10) != null) {
            }
        }
        if (longSparseArray.get(j10) != null) {
        }
    }

    public final void O1(org.telegram.ui.ActionBar.o2 o2Var) {
        if ((o2Var instanceof org.telegram.ui.tn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.tn) o2Var).e)) {
            new tc(this.n1, this.resourcesProvider).f(MessagesController.getInstance(this.F1).captionLengthLimitPremium, new z2(10, this, o2Var)).j();
        }
    }

    public final boolean P1(boolean z10, boolean z11) {
        int i10;
        fi fiVar;
        cg.m1 m1Var;
        this.c.a(z10, true);
        ph phVar = this.z0;
        if (z10 == (phVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        phVar.setTag(z10 ? 1 : null);
        th thVar = this.A0;
        if (thVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(thVar.getEditText());
        }
        thVar.k(true);
        this.L0.k(true);
        ph phVar2 = this.t1;
        ph phVar3 = this.D0;
        if (z10) {
            if (!this.J) {
                phVar.setVisibility(0);
            }
            phVar3.setVisibility(0);
        } else if (this.O0) {
            phVar2.setVisibility(0);
        }
        fi fiVar2 = this.u0;
        boolean z12 = (fiVar2 == this.f0 || fiVar2 == this.m0) && this.Y;
        cg.m1 m1Var2 = this.T0;
        bg.d1 d1Var = this.K0;
        sh shVar = this.y0;
        yh yhVar = this.E0;
        if (z11) {
            this.I0 = new AnimatorSet();
            if (z12) {
                d1Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(phVar, (Property<ph, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(shVar, (Property<sh, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                m1Var = m1Var2;
            } else {
                shVar.setVisibility(0);
                m1Var = m1Var2;
                arrayList.add(ObjectAnimator.ofFloat(shVar, (Property<sh, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(d1Var, (Property<bg.d1, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(phVar3, (Property<ph, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(phVar3, (Property<ph, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(phVar3, (Property<ph, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(yhVar, (Property<yh, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(yhVar, (Property<yh, Float>) property3, z10 ? 1.0f : 0.2f));
            if (m1Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(phVar, (Property<ph, Float>) View.TRANSLATION_Y, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.O0) {
                arrayList.add(ObjectAnimator.ofFloat(phVar2, (Property<ph, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(phVar2, (Property<ph, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new xg(this, 4));
                arrayList.add(ofFloat);
            }
            this.I0.playTogether(arrayList);
            this.I0.setInterpolator(new DecelerateInterpolator());
            this.I0.setDuration(180L);
            this.I0.addListener(new org.telegram.ui.ActionBar.h(this, z10, z12, 3));
            this.I0.start();
            i10 = 0;
        } else {
            phVar.setAlpha(z10 ? 1.0f : 0.0f);
            shVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            if (!z10 || z12) {
                i10 = 0;
            } else {
                i10 = 0;
                shVar.setVisibility(0);
                shVar.setTranslationY(0.0f);
            }
            phVar3.setScaleX(z10 ? 1.0f : 0.2f);
            phVar3.setScaleY(z10 ? 1.0f : 0.2f);
            phVar3.setAlpha(z10 ? 1.0f : 0.0f);
            d1Var.setVisibility((z10 && z12) ? 0 : 8);
            d1Var.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            yhVar.setScaleX(z10 ? 1.0f : 0.2f);
            yhVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (m1Var2.getTag() != null) {
                phVar.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
            } else if (this.O0 && ((fiVar = this.u0) == null || fiVar.I())) {
                phVar2.setTranslationY(z10 ? AndroidUtilities.dp(84.0f) : 0.0f);
            }
            if (!z10) {
                phVar.setVisibility(4);
                phVar3.setVisibility(4);
            }
            if (z12) {
                b2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.u0.getSelectedItemsCount());
        }
        yhVar.g(i10, z11);
        yhVar.i(j1() + this.u0.getSelectedItemsCount(), this.D1 != null ? 0L : MessagesController.getInstance(this.F1).getSendPaidMessagesStars(n1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) thVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), yhVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            thVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(fi fiVar) {
        long j10 = this.S0;
        pn pnVar = this.P;
        if (fiVar == pnVar) {
            j10 = pnVar.s;
        } else if (fiVar == this.f0) {
            j10 = 1;
        } else if (fiVar == this.h0) {
            j10 = 3;
        } else if (fiVar == this.l0) {
            j10 = 4;
        } else if (fiVar == this.g0) {
            j10 = 5;
        } else if (fiVar == this.k0) {
            j10 = 6;
        } else if (fiVar == this.i0) {
            j10 = 9;
        } else if (fiVar == this.n0) {
            j10 = 10;
        } else if (fiVar == this.o0) {
            j10 = 11;
        } else if (fiVar == this.j0) {
            j10 = 12;
        } else if (fiVar == this.p0) {
            j10 = 14;
        } else if (fiVar == this.q0) {
            j10 = 13;
        } else if (fiVar == this.r0) {
            j10 = 16;
        }
        R1(fiVar, j10, true);
    }

    public final void R1(fi fiVar, long j10, boolean z10) {
        yl ylVar;
        yl ylVar2;
        qh qhVar;
        if (this.p1 == null && this.I0 == null) {
            fi fiVar2 = this.u0;
            if (fiVar2 == fiVar) {
                fiVar2.F();
                return;
            }
            if (fiVar == this.j0 && !UserConfig.getInstance(this.F1).isPremium()) {
                new cg.p1(this.b0, 39, false).show();
                return;
            }
            this.f.a(j10 == 1, z10);
            this.n.i(Long.valueOf(j10), z10);
            this.z1 = false;
            this.x1 = false;
            this.B1 = 0.0f;
            this.A1.setVisibility(8);
            RadialProgressView radialProgressView = this.y1;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            ph phVar = this.t1;
            phVar.setAlpha(1.0f);
            phVar.setTranslationY(this.B1);
            int i10 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.t0;
                if (i10 >= longSparseArray.size()) {
                    break;
                }
                ((ph.n3) longSparseArray.valueAt(i10)).setMeasureOffsetY(0);
                i10++;
            }
            this.S0 = j10;
            qh qhVar2 = this.u1;
            int childCount = qhVar2.getChildCount();
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = qhVar2.getChildAt(i11);
                if (childAt instanceof hi) {
                    hi hiVar = (hi) childAt;
                    qhVar = qhVar2;
                    hiVar.a.e(((long) hiVar.b) == hiVar.c.S0, true);
                } else {
                    qhVar = qhVar2;
                    if (childAt instanceof gi) {
                        ((gi) childAt).a(true);
                    }
                }
                i11++;
                qhVar2 = qhVar;
            }
            int firstOffset = (this.u0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.X1[0];
            this.v0 = fiVar;
            fiVar.getClass();
            boolean z11 = fiVar instanceof th.p;
            ug.f fVar = this.r1;
            if (fVar != null) {
                fVar.setFadeHeightBottom(z11 ? 0 : AndroidUtilities.dp(48.0f));
            }
            rh rhVar = this.s1;
            if (rhVar != null) {
                rhVar.setVisibility(z11 ? 4 : 0);
            }
            int i12 = this.v0.h() != 0 ? 0 : 4;
            cg.m1 m1Var = this.T0;
            m1Var.setVisibility(i12);
            if (m1Var.j0) {
                m1Var.h(true);
            }
            this.u0.r();
            fi fiVar3 = this.v0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
            if (fiVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.v0.D(this.u0);
            this.v0.setVisibility(0);
            if (fiVar.getParent() != null) {
                this.containerView.removeView(this.v0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.u0);
            ViewParent parent = this.v0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                fi fiVar4 = this.v0;
                if (fiVar4 != this.k0) {
                    indexOfChild++;
                }
                viewGroup.addView(fiVar4, indexOfChild, i7.f6.c(-1.0f, -1));
            }
            zg zgVar = new zg(this, 3);
            fi fiVar5 = this.u0;
            boolean z12 = fiVar5 instanceof lm;
            bi biVar = this.a0;
            if (z12 || (this.v0 instanceof lm)) {
                int max = Math.max(this.v0.getWidth(), this.u0.getWidth());
                fi fiVar6 = this.v0;
                if (fiVar6 instanceof lm) {
                    fiVar6.setTranslationX(max);
                    fi fiVar7 = this.u0;
                    if ((fiVar7 instanceof ChatAttachAlertPhotoLayout) && (ylVar2 = ((ChatAttachAlertPhotoLayout) fiVar7).L) != null) {
                        ylVar2.setVisibility(4);
                    }
                } else {
                    this.u0.setTranslationX(-max);
                    fi fiVar8 = this.v0;
                    if (fiVar8 == chatAttachAlertPhotoLayout && (ylVar = ((ChatAttachAlertPhotoLayout) fiVar8).L) != null) {
                        ylVar.setVisibility(0);
                    }
                }
                this.v0.setAlpha(1.0f);
                this.u0.setAlpha(1.0f);
                if (z10) {
                    fi fiVar9 = this.u0;
                    biVar.getClass();
                    biVar.b(fiVar9, 0.0f);
                    AndroidUtilities.runOnUIThread(new g(this, fiVar, zgVar, 6));
                } else {
                    boolean z13 = this.v0.getCurrentItemTop() <= fiVar.getButtonsHideOffset();
                    this.u0.s(1.0f);
                    this.v0.s(1.0f);
                    this.u0.k(this.h2);
                    this.v0.k(this.h2);
                    this.containerView.invalidate();
                    fi fiVar10 = this.u0;
                    biVar.getClass();
                    biVar.b(fiVar10, 1.0f);
                    m1Var.setTag(z13 ? 1 : null);
                    zgVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.v0.setAlpha(0.0f);
                this.v0.setTranslationY(AndroidUtilities.dp(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.u0, (Property<fi, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.u0, biVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(m1Var, (Property<cg.m1, Float>) View.ALPHA, m1Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(jr.f);
                animatorSet.addListener(new jh.l3(this, firstOffset, zgVar, 1));
                this.p1 = animatorSet;
                fi fiVar11 = this.u0;
                biVar.getClass();
                biVar.b(fiVar11, 0.0f);
                animatorSet.start();
            } else {
                fiVar5.setAlpha(0.0f);
                zgVar.run();
                a2(0);
                this.containerView.invalidate();
            }
            if (this.i2 && !(fiVar instanceof ph.n3)) {
                this.i2 = false;
                m1Var.e();
                m1Var.invalidate();
                u1();
            }
            m1Var.setForcedMenuWidth((j10 == 1 || j10 == 6 || (fiVar instanceof ph.n3)) ? AndroidUtilities.dp(46.0f) : j10 == 4 ? AndroidUtilities.dp(84.0f) : 0);
        }
    }

    public final void S1(boolean z10, Boolean bool) {
        ni niVar;
        if (this.i0 == null) {
            niVar = this;
            on onVar = new on(niVar, getContext(), false, this.resourcesProvider, bool);
            niVar.i0 = onVar;
            niVar.s0[1] = onVar;
            onVar.setDelegate(new wg(this, 15));
        } else {
            niVar = this;
        }
        R1(niVar.i0, 9L, z10);
    }

    public final void T1(boolean z10, boolean z11) {
        fi fiVar;
        this.d.a(z10, z11);
        cg.m1 m1Var = this.T0;
        if (!(z10 && m1Var.getTag() == null) && (z10 || m1Var.getTag() == null)) {
            return;
        }
        m1Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet = this.U0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.U0 = null;
        }
        boolean z12 = (this.B || this.P0 || (this.M0 == 0 && this.m1) || this.u0 != this.f0 || (!this.H1 && !this.I1)) ? false : true;
        if (this.u0 == this.P) {
            z12 = false;
        }
        ph phVar = this.t1;
        org.telegram.ui.ActionBar.w0 w0Var = this.W0;
        if (z10) {
            if (z12) {
                w0Var.setVisibility(0);
                w0Var.setClickable(true);
            }
        } else if (this.O0 && this.z0.getTag() == null) {
            phVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var != null) {
            if (z10) {
                AndroidUtilities.setLightStatusBar(this, i0.a.f(getThemedColor(this.d2 ? org.telegram.ui.ActionBar.g6.tg : org.telegram.ui.ActionBar.g6.h5)) > 0.699999988079071d);
            } else {
                AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
            }
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.U0 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z10 ? 1.0f : 0.0f) - m1Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(m1Var, (Property<cg.m1, Float>) property, z10 ? 1.0f : 0.0f));
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.U0.playTogether(arrayList);
            this.U0.addListener(new z9(2, this, z10));
            this.U0.setInterpolator(jr.h);
            this.U0.setDuration(380L);
            this.U0.start();
            return;
        }
        if (z10 && this.O0 && ((fiVar = this.u0) == null || fiVar.I())) {
            phVar.setVisibility(4);
        }
        m1Var.setAlpha(z10 ? 1.0f : 0.0f);
        if (z12) {
            w0Var.setAlpha(z10 ? 1.0f : 0.0f);
            w0Var.setScaleX(z10 ? 1.0f : 0.6f);
            w0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = this.a1;
        if (w0Var2 != null) {
            w0Var2.setVisibility(4);
        }
        if (this.M0 == 0 && this.m1) {
            return;
        }
        w0Var.setVisibility(4);
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.C0;
        th thVar = this.A0;
        thVar.getLocationOnScreen(iArr);
        if (this.x2 != null) {
            fi fiVar = this.u0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
            if ((fiVar == chatAttachAlertPhotoLayout || fiVar == this.m0) && this.Y) {
                bg.d1 d1Var = this.K0;
                alpha = (d1Var.getAlpha() * d1Var.getMeasuredHeight()) + (d1Var.getY() - this.x2.getTop());
            } else {
                alpha = -thVar.getHeight();
            }
            if (Math.abs(this.x2.getTranslationY() - alpha) > 0.5f) {
                this.x2.setTranslationY(alpha);
                this.x2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        g1();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V1(int i10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.p1 != null) {
            return;
        }
        int selectedItemsCount = this.u0.getSelectedItemsCount();
        yh yhVar = this.E0;
        if (selectedItemsCount == 0) {
            yhVar.g(0, i10 != 0);
            P1(false, i10 != 0);
        } else {
            if (P1(true, i10 != 0) || i10 == 0) {
                yhVar.g(selectedItemsCount, i10 != 0);
                yhVar.c();
            } else {
                yhVar.g(selectedItemsCount, true);
                yhVar.c();
            }
        }
        this.u0.B(selectedItemsCount);
        d1(i10 != 0);
        if (this.u0 == this.f0 && ((((z10 = (o2Var = this.b0) instanceof org.telegram.ui.tn)) || this.M0 != 0 || this.P0) && ((selectedItemsCount == 0 && this.m1) || ((selectedItemsCount != 0 || this.M0 != 0 || this.P0) && !this.m1)))) {
            this.m1 = (selectedItemsCount == 0 && this.M0 == 0 && !this.P0) ? false : true;
            AnimatorSet animatorSet = this.V0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
            int i11 = this.M0;
            cg.m1 m1Var = this.T0;
            org.telegram.ui.ActionBar.w0 w0Var = this.a1;
            if (i11 != 0 && w0Var != null && m1Var.getTag() != null && z10) {
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
                if (!ChatObject.isChannel(tnVar.e) || (tL_chatBannedRights = tnVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.m1;
                    ph phVar = this.e1;
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.W0;
                    if (!z12) {
                        if (this.M0 == 0 && !this.P0) {
                            w0Var2.setVisibility(0);
                            w0Var2.setClickable(true);
                        }
                        phVar.setVisibility(0);
                    } else if (m1Var.getTag() != null && w0Var != null) {
                        w0Var.setVisibility(0);
                    }
                    if (i10 != 0) {
                        if (m1Var.getTag() == null && this.M0 == 0 && !this.P0) {
                            w0Var2.setAlpha(this.m1 ? 1.0f : 0.0f);
                            w0Var2.setScaleX(this.m1 ? 1.0f : 0.6f);
                            w0Var2.setScaleY(this.m1 ? 1.0f : 0.6f);
                        }
                        phVar.setAlpha(this.m1 ? 1.0f : 0.0f);
                        if (z11) {
                            w0Var.setAlpha(this.m1 ? 0.0f : 1.0f);
                        }
                        if (this.m1 && w0Var != null) {
                            w0Var.setVisibility(4);
                        }
                    } else {
                        this.V0 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (m1Var.getTag() == null && this.M0 == 0 && !this.P0) {
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, this.m1 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_X, this.m1 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_Y, this.m1 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(phVar, (Property<ph, Float>) property, this.m1 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, this.m1 ? 0.0f : 1.0f));
                        }
                        this.V0.playTogether(arrayList);
                        this.V0.addListener(new org.telegram.ui.bm(this, 14));
                        this.V0.setDuration(180L);
                        this.V0.start();
                    }
                }
            }
            z11 = false;
            z12 = this.m1;
            ph phVar2 = this.e1;
            org.telegram.ui.ActionBar.w0 w0Var22 = this.W0;
            if (!z12) {
            }
            if (i10 != 0) {
            }
        }
        Y1(i10 != 0);
        MessageObject messageObject = this.D1;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.F1).getSendPaidMessagesStars(n1()) : 0L;
        fi fiVar = this.u0;
        yhVar.i(j1() + (fiVar != null ? fiVar.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        th thVar = this.A0;
        if (thVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) thVar.getLayoutParams();
            int max = Math.max(AndroidUtilities.dp(48.0f), yhVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                thVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void W1() {
        float f9;
        fi fiVar = this.u0;
        boolean g10 = fiVar == null ? false : fiVar.g();
        cg.s0 s0Var = this.b1;
        s0Var.setEnabled(g10);
        fi fiVar2 = this.u0;
        if (fiVar2 != null) {
            f9 = ((fiVar2.g() ? 1.0f : 0.5f) * (this.v0 == null ? 1.0f : this.Z)) + 0.0f;
        } else {
            f9 = 0.0f;
        }
        fi fiVar3 = this.v0;
        if (fiVar3 != null) {
            f9 = com.google.android.recaptcha.internal.a.z(1.0f, this.Z, fiVar3.g() ? 1.0f : 0.5f, f9);
        }
        this.c1 = f9;
        if (s0Var != null) {
            float f10 = f9 * this.d1;
            s0Var.setAlpha(f10);
            s0Var.setVisibility(f10 <= 0.0f ? 4 : 0);
        }
    }

    public final void X1(fi fiVar, int i10) {
        if (fiVar == null) {
            return;
        }
        lg.e eVar = this.y2;
        if (eVar != null && Build.VERSION.SDK_INT >= 31) {
            eVar.f(0.0f, i10);
            Z0();
        }
        int currentItemTop = fiVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = fiVar == this.u0 && currentItemTop <= fiVar.getButtonsHideOffset();
        this.N = z11;
        if (fiVar == this.u0) {
            T1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fiVar.getLayoutParams();
        int C = org.telegram.ui.b.C(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        fi fiVar2 = this.u0;
        int i11 = fiVar2 == fiVar ? 0 : 1;
        if ((fiVar2 instanceof lm) || (this.v0 instanceof lm)) {
            Object obj = this.p1;
            if ((obj instanceof o1.k) && ((o1.k) obj).f) {
                z10 = true;
            }
        }
        int[] iArr = this.X1;
        int i12 = iArr[i11];
        if (i12 == C && !z10) {
            if (i10 != 0) {
                this.Y1 = i12;
            }
        } else {
            this.Y1 = i12;
            iArr[i11] = C;
            a2(i11);
            this.containerView.invalidate();
        }
    }

    public final void Y0() {
        if (m1().a.length() <= 0) {
            return;
        }
        this.u0.a(m1().getText());
    }

    public final void Y1(boolean z10) {
        nh.u uVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        if (chatAttachAlertPhotoLayout == null || (uVar = this.X0) == null) {
            return;
        }
        boolean z11 = this.m1 && this.e0 && this.u0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0();
        boolean z12 = !ChatAttachAlertPhotoLayout.S();
        uVar.f = z12;
        if (!z10) {
            ((d6) uVar.g).a(z12);
        }
        uVar.invalidateSelf();
        org.telegram.ui.ActionBar.w0 w0Var = this.Y0;
        if (z10 && this.m1) {
            w0Var.setVisibility(0);
            w0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(jr.h).withEndAction(new ih(this, z11, 0)).start();
        } else {
            w0Var.setVisibility(z11 ? 0 : 8);
            w0Var.setAlpha(z11 ? 1.0f : 0.0f);
            w0Var.setScaleX(z11 ? 1.0f : 0.6f);
            w0Var.setScaleY(z11 ? 1.0f : 0.6f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0() {
        lg.e eVar;
        boolean z10;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.y2) == null) {
            return;
        }
        ph phVar = this.t1;
        ViewGroup viewGroup = this.containerView;
        RectF rectF = this.H2;
        sg.i.c(phVar, viewGroup, rectF);
        float measuredWidth = this.containerView.getMeasuredWidth();
        float measuredHeight = this.T0.getMeasuredHeight();
        RectF rectF2 = this.G2;
        rectF2.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        rectF2.inset(0.0f, -AndroidUtilities.dp(48.0f));
        rectF.set(0.0f, this.containerView.getMeasuredHeight() - (AndroidUtilities.dp(180.0f) + Math.max(AndroidUtilities.navigationBarHeight, o1())), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fi fiVar = this.u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        if (fiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null) {
            ol olVar = chatAttachAlertPhotoLayout.A;
            if (olVar.getFastScroll() != null) {
                sk0 fastScroll = olVar.getFastScroll();
                ng.d dVar = fastScroll.a0;
                RectF rectF3 = this.I2;
                if (dVar != null || fastScroll.b0 != null) {
                    rectF3.set(fastScroll.b0.getBounds());
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(fastScroll.a0.getBounds());
                    rectF3.union(rectF4);
                }
                sk0 fastScroll2 = olVar.getFastScroll();
                ViewGroup viewGroup2 = this.containerView;
                RectF rectF5 = AndroidUtilities.rectTmp;
                sg.i.c(fastScroll2, viewGroup2, rectF5);
                rectF3.offset(rectF5.left, rectF5.top);
                rectF3.inset(-AndroidUtilities.dp(48.0f), -AndroidUtilities.dp(48.0f));
                rectF3.left = Math.max(0.0f, rectF3.left);
                rectF3.right = Math.min(this.containerView.getMeasuredWidth(), rectF3.right);
                z10 = true;
                int i10 = !z10 ? 3 : 2;
                ArrayList arrayList = this.F2;
                ArrayList arrayList2 = this.J2;
                eVar.g(jf.l0.a(arrayList, i10, arrayList2), arrayList2);
                eVar.e(this.E2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
            }
        }
        z10 = false;
        if (!z10) {
        }
        ArrayList arrayList3 = this.F2;
        ArrayList arrayList22 = this.J2;
        eVar.g(jf.l0.a(arrayList3, i10, arrayList22), arrayList22);
        eVar.e(this.E2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void Z1(boolean z10) {
        fi fiVar = this.f0;
        if (!z10) {
            Q1(fiVar);
            return;
        }
        if (this.I) {
            if (this.m0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.r;
                if (c6Var == null) {
                    c6Var = this.resourcesProvider;
                }
                lm lmVar = new lm(context, c6Var, this);
                lmVar.y = 0.0f;
                lmVar.A = 0.0f;
                lmVar.B = 0.0f;
                lmVar.C = 0.0f;
                lmVar.D = 0.0f;
                lmVar.E = 0.0f;
                lmVar.F = null;
                lmVar.G = false;
                lmVar.I = 0.0f;
                lmVar.M = false;
                lmVar.O = false;
                Point point = AndroidUtilities.displaySize;
                lmVar.P = point.y > point.x;
                lmVar.n = c6Var;
                lmVar.f = true;
                lmVar.setWillNotDraw(false);
                org.telegram.ui.ActionBar.a0 n10 = lmVar.b.T0.n();
                TextView textView = new TextView(context);
                lmVar.x = textView;
                org.telegram.ui.ActionBar.c6 c6Var2 = lmVar.a;
                tl tlVar = new tl(lmVar, context, n10, c6Var2, 1);
                lmVar.b.T0.addView(tlVar, 0, i7.f6.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                tlVar.addView(textView, i7.f6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                jh.e1 e1Var = new jh.e1(lmVar, context, c6Var2, 13);
                lmVar.r = e1Var;
                e1Var.setAdapter(new org.telegram.ui.u7(lmVar, 3));
                f2.j0 j0Var = new f2.j0(1, false);
                lmVar.s = j0Var;
                e1Var.setLayoutManager(j0Var);
                e1Var.setClipChildren(false);
                e1Var.setClipToPadding(false);
                e1Var.setOverScrollMode(2);
                e1Var.setVerticalScrollBarEnabled(false);
                km kmVar = new km(lmVar, context);
                lmVar.v = kmVar;
                kmVar.setClipToPadding(true);
                kmVar.setClipChildren(true);
                lmVar.addView(e1Var, i7.f6.c(-1.0f, -1));
                lmVar.L = lmVar.b.f0;
                kmVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = lmVar.L;
                kmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                kmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                kmVar.c();
                UndoView undoView = new UndoView(context, null, false, lmVar.b.r);
                lmVar.w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                lmVar.addView(undoView, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                lmVar.J = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.m0 = lmVar;
                lmVar.bringToFront();
            }
            fi fiVar2 = this.u0;
            lm lmVar2 = this.m0;
            if (fiVar2 != lmVar2) {
                fiVar = lmVar2;
            }
            Q1(fiVar);
        }
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        return (o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).K6();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a2(int i10) {
        int i11;
        float f9;
        org.telegram.ui.ActionBar.w0 w0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        cg.s0 s0Var;
        float max;
        int i12;
        float f14 = this.d.e;
        fi fiVar = i10 == 0 ? this.u0 : this.v0;
        if (fiVar == null || fiVar.getVisibility() != 0) {
            return;
        }
        int p12 = p1(i10);
        if (fiVar == this.i0 || fiVar == this.j0) {
            AndroidUtilities.dp(13.0f);
            AndroidUtilities.dp(11.0f);
        } else {
            AndroidUtilities.dp(39.0f);
            AndroidUtilities.dp(43.0f);
        }
        org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (AndroidUtilities.isTablet()) {
            i11 = 16;
        } else {
            Point point = AndroidUtilities.displaySize;
            i11 = point.x > point.y ? 6 : 12;
        }
        float alpha = this.T0.getAlpha();
        ph phVar = this.e1;
        float dp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - phVar.getAlpha()) * 26.0f);
        boolean z10 = this.m1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.W0;
        bg.d1 d1Var = this.K0;
        if (z10 && this.M0 == 0 && !this.P0) {
            w0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37), ((p12 - AndroidUtilities.dp((i11 * f14) + 37.0f)) + dp) - (d1Var.getAlpha() * d1Var.getMeasuredHeight())) + this.h2);
        } else {
            w0Var2.setTranslationY(((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37)) + this.h2);
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.Y0;
        if (w0Var3 != null) {
            w0Var3.setTranslationY(w0Var2.getTranslationY());
        }
        nh.t3 t3Var = this.Z0;
        if (t3Var != null) {
            t3Var.setTranslationY(w0Var2.getTranslationY());
        }
        if (this.B && this.o1) {
            fi fiVar2 = this.v0;
            if (fiVar2 != null && this.u0 != null) {
                f9 = Math.min(fiVar2.getTranslationY(), this.u0.getTranslationY());
            } else if (fiVar2 != null) {
                f9 = fiVar2.getTranslationY();
            }
            w0Var = this.a1;
            if (w0Var != null) {
                w0Var.setTranslationY(((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i11 + 37)) + this.h2);
            }
            float dp2 = ((((p12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.h2) + f9) - (d1Var.getAlpha() * d1Var.getMeasuredHeight());
            this.l1 = dp2;
            phVar.setTranslationY(Math.max(this.h2, dp2));
            d1Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.h2, (phVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.l1 + AndroidUtilities.dp(8.0f)));
            if (this.Y) {
                U1();
            }
            g1();
            int i13 = 59;
            if (this.i0 != null) {
                if (AndroidUtilities.isTablet()) {
                    i12 = 63;
                } else {
                    Point point2 = AndroidUtilities.displaySize;
                    i12 = point2.x > point2.y ? 53 : 59;
                }
                on onVar = this.i0;
                if (onVar == this.v0) {
                    f11 = (onVar.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.Z;
                } else if (onVar == this.u0) {
                    f11 = (onVar.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.v0 == null ? 1.0f : 1.0f - this.Z;
                }
                if (this.j0 != null) {
                    if (AndroidUtilities.isTablet()) {
                        i13 = 63;
                    } else {
                        Point point3 = AndroidUtilities.displaySize;
                        if (point3.x > point3.y) {
                            i13 = 53;
                        }
                    }
                    on onVar2 = this.j0;
                    if (onVar2 == this.v0) {
                        f13 = (onVar2.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.Z;
                    } else if (onVar2 == this.u0) {
                        f13 = (onVar2.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.v0 == null ? 1.0f : 1.0f - this.Z;
                    }
                    s0Var = this.b1;
                    if (s0Var != null) {
                        int measuredWidth = LocaleController.isRTL ? (this.containerView.getMeasuredWidth() - s0Var.getMeasuredWidth()) - AndroidUtilities.dp(62.0f) : 0;
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
                        s0Var.setTranslationY(Math.max(0.0f, max) + this.h2);
                        s0Var.setTranslationX(-((measuredWidth * (1.0f - f14)) + AndroidUtilities.dp((7.0f * r5) + 12.0f)));
                    }
                    float max2 = Math.max(f12, f10);
                    this.d1 = max2;
                    if (s0Var == null) {
                        float f15 = this.c1 * max2;
                        s0Var.setAlpha(f15);
                        s0Var.setVisibility(f15 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f12 = 0.0f;
                f13 = 0.0f;
                s0Var = this.b1;
                if (s0Var != null) {
                }
                float max22 = Math.max(f12, f10);
                this.d1 = max22;
                if (s0Var == null) {
                }
            }
            f10 = 0.0f;
            f11 = 0.0f;
            if (this.j0 != null) {
            }
            f12 = 0.0f;
            f13 = 0.0f;
            s0Var = this.b1;
            if (s0Var != null) {
            }
            float max222 = Math.max(f12, f10);
            this.d1 = max222;
            if (s0Var == null) {
            }
        }
        f9 = 0.0f;
        w0Var = this.a1;
        if (w0Var != null) {
        }
        float dp22 = ((((p12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.h2) + f9) - (d1Var.getAlpha() * d1Var.getMeasuredHeight());
        this.l1 = dp22;
        phVar.setTranslationY(Math.max(this.h2, dp22));
        d1Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.h2, (phVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.l1 + AndroidUtilities.dp(8.0f)));
        if (this.Y) {
        }
        g1();
        int i132 = 59;
        if (this.i0 != null) {
        }
        f10 = 0.0f;
        f11 = 0.0f;
        if (this.j0 != null) {
        }
        f12 = 0.0f;
        f13 = 0.0f;
        s0Var = this.b1;
        if (s0Var != null) {
        }
        float max2222 = Math.max(f12, f10);
        this.d1 = max2222;
        if (s0Var == null) {
        }
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (!(o2Var instanceof org.telegram.ui.tn)) {
            return false;
        }
        return ChatActivityEnterView.H(this.F1, ((org.telegram.ui.tn) o2Var).a(), o2Var, charSequence);
    }

    public final void b2() {
        int i10 = 0;
        a2(0);
        this.n1.invalidate();
        bg.d1 d1Var = this.K0;
        d1Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        if (chatAttachAlertPhotoLayout != null) {
            ol olVar = chatAttachAlertPhotoLayout.A;
            chatAttachAlertPhotoLayout.V();
            if (olVar != null && olVar.getFastScroll() != null) {
                sk0 fastScroll = olVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.l1;
                if (this.Y) {
                    i10 = (int) (d1Var.getAlpha() * d1Var.getMeasuredHeight());
                }
                fastScroll.d0 = currentActionBarHeight + i10;
                olVar.getFastScroll().invalidate();
            }
        }
        U1();
        g1();
    }

    public final void c1() {
        qh qhVar = this.u1;
        if (qhVar == null) {
            return;
        }
        int childCount = qhVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            qhVar.getChildAt(i10);
        }
        boolean z10 = this.d2;
        this.f1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
        this.k1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
        this.b1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        int themedColor = getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5);
        org.telegram.ui.ActionBar.w0 w0Var = this.W0;
        w0Var.setIconColor(themedColor);
        org.telegram.ui.ActionBar.g6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.ig : org.telegram.ui.ActionBar.g6.I5), w0Var.getBackground());
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        w0Var.G(getThemedColor(i11), false);
        w0Var.G(getThemedColor(i11), true);
        w0Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.Y0;
        if (w0Var2 != null) {
            w0Var2.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.a1;
        if (w0Var3 != null) {
            w0Var3.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
            org.telegram.ui.ActionBar.g6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.ig : org.telegram.ui.ActionBar.g6.I5), w0Var3.getBackground());
        }
        th thVar = this.A0;
        org.telegram.ui.ActionBar.c6 c6Var = thVar.I;
        vt vtVar = thVar.a;
        int i12 = thVar.H;
        if (i12 == 0) {
            vtVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
            int i13 = org.telegram.ui.ActionBar.g6.G6;
            vtVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
            vtVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        } else if (i12 == 2 || i12 == 3) {
            vtVar.setHintTextColor(-1929379841);
            vtVar.setTextColor(-1);
            vtVar.setCursorColor(-1);
            vtVar.setHandlesColor(-1);
            vtVar.setHighlightColor(822083583);
            vtVar.quoteColor = -1;
        } else {
            vtVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t5, c6Var));
            vtVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
        }
        thVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
        wt wtVar = thVar.d;
        if (wtVar != null) {
            wtVar.U();
        }
        qhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        int themedColor2 = getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5);
        cg.m1 m1Var = this.T0;
        m1Var.C(themedColor2, false);
        m1Var.B(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.ig : org.telegram.ui.ActionBar.g6.I5), false);
        m1Var.setTitleColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.g6.w1(q12, this.shadowDrawable);
        qg.c cVar = this.B2;
        if (cVar.a.getColor() != q12) {
            cVar.a(q12);
            ug.f fVar = this.r1;
            if (fVar != null) {
                fVar.invalidate();
            }
            rh rhVar = this.s1;
            if (rhVar != null) {
                rhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i14 = 0;
        while (true) {
            fi[] fiVarArr = this.s0;
            if (i14 >= fiVarArr.length) {
                break;
            }
            fi fiVar = fiVarArr[i14];
            if (fiVar != null) {
                fiVar.d();
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

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        return this.u0.b();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.k kVar = this.l2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.m2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
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
    public final void d1(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var == null || !(o2Var instanceof org.telegram.ui.tn)) {
            return;
        }
        org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
        au auVar = this.Y ? this.L0 : this.A0;
        String obj = auVar != null ? auVar.getText().toString() : null;
        if (this.D1 == null) {
            fi fiVar = this.u0;
            z11 = true;
            if (fiVar != null) {
            }
            if (jf.w.g(this.F1).e(obj, tnVar.Z7) <= 0) {
                MessageObject messageObject = tnVar.j5;
                if (messageObject != null) {
                }
            }
            this.h.a(z11, z10);
            if (z11 || !s1()) {
            }
            H1(false, z10);
            return;
        }
        z11 = false;
        this.h.a(z11, z10);
        if (z11) {
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.reloadInlineHints && i10 != NotificationCenter.attachMenuBotsDidLoad && i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.G = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
            }
        } else {
            ki kiVar = this.w1;
            if (kiVar != null) {
                kiVar.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.k2
    public final void dismiss(boolean z10) {
        if (z10) {
            this.w2 = z10;
        }
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        li liVar = this.V1;
        if (liVar != null) {
            liVar.x0(new zg(this, 2));
        } else {
            F1();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.u0.o(i10);
    }

    public final void e1() {
        float f9 = this.c.e;
        this.s1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f9) * (1.0f - this.d.e))), 1.0f - ((1.0f - this.b.e) * f9)));
    }

    public final void f1() {
        u10.d(this.B0, com.google.android.recaptcha.internal.a.C(this.e.e, this.f.e, jf.l0.b(this.h.e), this.N1 ? 0.0f : 1.0f));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean g() {
        return true;
    }

    public final void g1() {
        yh yhVar = this.E0;
        ph phVar = this.D0;
        bg.d1 d1Var = this.K0;
        if (d1Var == null || d1Var.getVisibility() != 0 || d1Var.getAlpha() == 0.0f) {
            phVar.setTranslationY(this.c2);
            yhVar.setAlpha(1.0f);
            return;
        }
        float f9 = this.b.e;
        float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f9));
        yhVar.setAlpha(abs * abs * abs * abs);
        phVar.setTranslationY(AndroidUtilities.lerp(this.c2, ((d1Var.getTranslationY() + d1Var.getTop()) - phVar.getTop()) + AndroidUtilities.dp(8.0f), jr.j.getInterpolation(f9)));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            fi[] fiVarArr = this.s0;
            if (i10 >= fiVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.i5));
                return arrayList;
            }
            fi fiVar = fiVarArr[i10];
            if (fiVar != null && (themeDescriptions = fiVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i10++;
        }
    }

    public final void h1(int i10) {
        this.O0 = true;
        this.t1.setVisibility(0);
        this.D = true;
        this.E = i10;
        this.M0 = 0;
        this.B = false;
        this.C = false;
        this.F = null;
        org.telegram.ui.ActionBar.w0 w0Var = this.g1;
        if (w0Var != null) {
            this.f1.setTranslationY(0.0f);
            w0Var.setVisibility(8);
        }
    }

    public final void i1(nh.t4 t4Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f1;
        textView.setText(string);
        this.O0 = false;
        this.t1.setVisibility(8);
        this.M0 = 1;
        this.B = true;
        this.C = true;
        this.e0 = false;
        this.F = t4Var;
        org.telegram.ui.ActionBar.w0 w0Var = this.g1;
        if (w0Var != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            w0Var.setVisibility(0);
            w0Var.setClickable(true);
            w0Var.setAlpha(1.0f);
            w0Var.setScaleX(1.0f);
            w0Var.setScaleY(1.0f);
        }
    }

    public final int j1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (!(o2Var instanceof org.telegram.ui.tn) || (messagePreviewParams = ((org.telegram.ui.tn) o2Var).b5) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        return o2Var instanceof org.telegram.ui.tn ? ((org.telegram.ui.tn) o2Var).e : MessagesController.getInstance(this.F1).getChat(Long.valueOf(-this.V));
    }

    public final float l1() {
        return r0.getMeasuredHeight() - ((1.0f - this.z0.getAlpha()) * (r0.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final au m1() {
        fi fiVar;
        return (this.Y && ((fiVar = this.u0) == this.f0 || fiVar == this.m0)) ? this.L0 : this.A0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        return o2Var instanceof org.telegram.ui.tn ? ((org.telegram.ui.tn) o2Var).a() : this.V;
    }

    public final int o1() {
        fi fiVar = this.u0;
        on onVar = this.i0;
        if (fiVar == onVar && onVar.A != null) {
            return onVar.getEmojiPadding();
        }
        on onVar2 = this.j0;
        return (fiVar != onVar2 || onVar2.A == null) ? this.Y ? this.L0.getEmojiPadding() : this.A0.getEmojiPadding() : onVar2.getEmojiPadding();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        if (this.O.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        cg.m1 m1Var = this.T0;
        if (m1Var.j0) {
            m1Var.h(true);
            return;
        }
        if (this.u0.i()) {
            return;
        }
        if (m1() == null || !m1().e) {
            super.onBackPressed();
        } else {
            m1().k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.u0.l(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        u81 u81Var = chatAttachAlertPhotoLayout.h0;
        bg.x2 x2Var = chatAttachAlertPhotoLayout.f0;
        TextView textView = chatAttachAlertPhotoLayout.l0;
        ol olVar = chatAttachAlertPhotoLayout.r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        boolean z10 = i14 < i15;
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == x2Var) {
            if (z10) {
                if (olVar.getVisibility() == 0) {
                    x2Var.layout(0, org.telegram.messenger.x3.B(222.0f, i13, i16), i14, org.telegram.messenger.x3.B(96.0f, i13, i16));
                    return true;
                }
                x2Var.layout(0, org.telegram.messenger.x3.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            }
            if (olVar.getVisibility() == 0) {
                x2Var.layout(org.telegram.messenger.x3.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            }
            x2Var.layout(org.telegram.messenger.x3.B(126.0f, i12, i16), 0, i12, i15 - i16);
            return true;
        }
        if (view == u81Var) {
            if (z10) {
                if (olVar.getVisibility() == 0) {
                    u81Var.layout(0, org.telegram.messenger.x3.B(310.0f, i13, i16), i14, org.telegram.messenger.x3.B(260.0f, i13, i16));
                    return true;
                }
                u81Var.layout(0, org.telegram.messenger.x3.B(176.0f, i13, i16), i14, org.telegram.messenger.x3.B(126.0f, i13, i16));
                return true;
            }
            if (olVar.getVisibility() == 0) {
                u81Var.layout(org.telegram.messenger.x3.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            }
            u81Var.layout(org.telegram.messenger.x3.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
            return true;
        }
        if (view != textView) {
            if (view != olVar) {
                return false;
            }
            if (z10) {
                int B = org.telegram.messenger.x3.B(88.0f, i15, i16);
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
            if (olVar.getVisibility() == 0) {
                dp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = dp3 - i16;
        } else {
            dp = i12 - AndroidUtilities.dp(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
            textView.setRotation(-90.0f);
            if (olVar.getVisibility() == 0) {
                dp -= AndroidUtilities.dp(96.0f);
            }
        }
        textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        cm cmVar = chatAttachAlertPhotoLayout.v;
        ol olVar = chatAttachAlertPhotoLayout.r;
        org.telegram.ui.k kVar = chatAttachAlertPhotoLayout.s;
        boolean z10 = i10 < i11;
        yl ylVar = chatAttachAlertPhotoLayout.L;
        if (view != ylVar) {
            bg.x2 x2Var = chatAttachAlertPhotoLayout.f0;
            if (view == x2Var) {
                if (z10) {
                    x2Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30));
                    return true;
                }
                x2Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            u81 u81Var = chatAttachAlertPhotoLayout.h0;
            if (view == u81Var) {
                if (z10) {
                    u81Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                    return true;
                }
                u81Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            if (view == olVar) {
                chatAttachAlertPhotoLayout.F0 = true;
                if (z10) {
                    olVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
                    if (kVar.o != 0) {
                        olVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        kVar.j1(0);
                        cmVar.l();
                    }
                } else {
                    olVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                    if (kVar.o != 1) {
                        olVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        kVar.j1(1);
                        cmVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.F0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.U && !chatAttachAlertPhotoLayout.W) {
            ylVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomOpenAnimation() {
        this.f0.setTranslationX(0.0f);
        this.j1.setAlpha(0.0f);
        this.h1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.m2 = animatorSet;
        int i10 = 2;
        bi biVar = this.k2;
        int i11 = 1;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, biVar, 0.0f, 400.0f));
        this.m2.setDuration(400L);
        this.m2.setStartDelay(20L);
        biVar.set(this, Float.valueOf(0.0f));
        this.m2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new xg(this, i10));
        o1.k kVar = this.l2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.i.n, 0.0f);
        this.l2 = kVar2;
        if (this.D1 != null) {
            kVar2.u.a(0.75f);
            this.l2.u.b(350.0f);
        } else {
            kVar2.u.a(0.75f);
            this.l2.u.b(350.0f);
        }
        this.l2.f();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.backDrawable, r6.d, this.dimBehind ? this.dimBehindAlpha : 0));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        g gVar = new g(this, animationNotificationsLocker, this.delegate, 5);
        this.l2.a(new pb(i11, this, gVar));
        this.currentSheetAnimation.addListener(new bg.c3(23, this, gVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new xg(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(jr.f);
        ofFloat2.start();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onDismissWithTouchOutside() {
        if (this.u0.p()) {
            dismiss();
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.u0.C(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        if (this.b0 instanceof org.telegram.ui.tn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.u0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.o1 = true;
        if (this.I1 || this.H1) {
            return;
        }
        a1();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).x0.add(this.O);
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
            ((LaunchActivity) context).x0.remove(this.O);
        }
    }

    public final int p1(int i10) {
        fi fiVar = this.v0;
        int[] iArr = this.X1;
        return (fiVar == null || !((this.u0 instanceof lm) || (fiVar instanceof lm))) ? iArr[i10] : AndroidUtilities.lerp(iArr[0], iArr[1], this.Z);
    }

    public final int q1(boolean z10) {
        cg.m1 m1Var;
        if (this.d2) {
            return getThemedColor(org.telegram.ui.ActionBar.g6.tg);
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        boolean a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        Iterator it = this.n.iterator();
        float f9 = 0.0f;
        while (it.hasNext()) {
            vd.f fVar = (vd.f) it.next();
            long longValue = ((Long) fVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f9 += fVar.c();
            }
        }
        float a10 = i7.w.a(f9, 0.0f, 1.0f);
        if (z10 && (m1Var = this.T0) != null && m1Var.getVisibility() == 0) {
            a10 *= 1.0f - m1Var.getAlpha();
        }
        return i0.a.d(a10, getThemedColor(org.telegram.ui.ActionBar.g6.h5), getThemedColor(a2 ? org.telegram.ui.ActionBar.g6.a7 : org.telegram.ui.ActionBar.g6.i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r1() {
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        ni niVar;
        yl ylVar;
        MediaController.AlbumEntry albumEntry;
        fi fiVar;
        this.J0 = 0L;
        this.E0.setEffect(0L);
        int i10 = 0;
        this.z1 = false;
        this.x1 = false;
        this.B1 = 0.0f;
        this.A1.setVisibility(8);
        RadialProgressView radialProgressView = this.y1;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        ph phVar = this.t1;
        phVar.setAlpha(1.0f);
        phVar.setTranslationY(0.0f);
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.t0;
            if (i11 >= longSparseArray.size()) {
                break;
            }
            ((ph.n3) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
            i11++;
        }
        int i12 = this.M0;
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (i12 != 2) {
            if (o2Var instanceof org.telegram.ui.tn) {
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
                chat = tnVar.e;
                user = tnVar.i();
            } else {
                long j10 = this.V;
                int i13 = this.F1;
                if (j10 >= 0) {
                    user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.V));
                    chat = null;
                } else if (j10 < 0) {
                    chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-this.V));
                    user = null;
                }
            }
            z10 = o2Var instanceof org.telegram.ui.tn;
            if ((z10 && this.M0 != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.H1 = ChatObject.canSendPhoto(chat);
                    this.I1 = ChatObject.canSendVideo(chat);
                    this.J1 = ChatObject.canSendMusic(chat);
                    this.K1 = ChatObject.canSendPolls(chat);
                    this.L1 = !ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.canSendPolls(chat);
                    this.M1 = ChatObject.canSendPlain(chat);
                    this.G1 = ChatObject.canSendDocument(chat);
                } else {
                    this.K1 = UserObject.isBot(user) || UserObject.isUserSelf(user);
                    this.L1 = !z10 || ((org.telegram.ui.tn) o2Var).h == null;
                }
            }
            if (this.N1) {
                this.K1 = false;
                this.L1 = false;
            }
            th thVar = this.A0;
            if (z10 || this.M0 == 2) {
                thVar.setVisibility(this.S ? 0 : 4);
            }
            boolean z11 = this.I1;
            boolean z12 = this.H1;
            boolean z13 = this.G1;
            chatAttachAlertPhotoLayout = this.f0;
            niVar = chatAttachAlertPhotoLayout.b;
            hz hzVar = chatAttachAlertPhotoLayout.D;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.r0 = z14;
            chatAttachAlertPhotoLayout.s0 = z11;
            chatAttachAlertPhotoLayout.t0 = z12;
            chatAttachAlertPhotoLayout.v0 = z13;
            ylVar = chatAttachAlertPhotoLayout.L;
            if (ylVar != null) {
                ylVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.L.setEnabled(chatAttachAlertPhotoLayout.r0);
            }
            if (!((niVar.b0 instanceof org.telegram.ui.tn) && niVar.k1() == null) && niVar.M0 == 0) {
                chatAttachAlertPhotoLayout.Q0 = MediaController.allMediaAlbumEntry;
                if (chatAttachAlertPhotoLayout.r0) {
                    hzVar.setText(LocaleController.getString(R.string.NoPhotos));
                    hzVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat k12 = niVar.k1();
                    hzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    if (ChatObject.isActionBannedByDefault(k12, 7)) {
                        hzVar.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else if (AndroidUtilities.isBannedForever(k12.banned_rights)) {
                        hzVar.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                    } else {
                        hzVar.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(k12.banned_rights.until_date)));
                    }
                }
            } else if (chatAttachAlertPhotoLayout.q0()) {
                chatAttachAlertPhotoLayout.Q0 = MediaController.allMediaAlbumEntry;
            } else {
                chatAttachAlertPhotoLayout.Q0 = MediaController.allPhotosAlbumEntry;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                chatAttachAlertPhotoLayout.L0 = chatAttachAlertPhotoLayout.e0();
            }
            if (chatAttachAlertPhotoLayout.Q0 != null) {
                for (int i14 = 0; i14 < Math.min(100, chatAttachAlertPhotoLayout.Q0.photos.size()); i14++) {
                    chatAttachAlertPhotoLayout.Q0.photos.get(i14).reset();
                }
            }
            chatAttachAlertPhotoLayout.Z();
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.B.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
            albumEntry = chatAttachAlertPhotoLayout.Q0;
            chatAttachAlertPhotoLayout.P0 = albumEntry;
            if (albumEntry != null) {
                chatAttachAlertPhotoLayout.T0 = false;
                if (hzVar != null) {
                    hzVar.c();
                }
            }
            chatAttachAlertPhotoLayout.u0();
            thVar.k(true);
            this.L0.k(true);
            this.q1 = false;
            setFocusable(false);
            if (!this.K || this.L) {
                if (this.k0 == null) {
                    bl blVar = new bl(this, getContext(), this.resourcesProvider, (this.D || this.L || this.N1) ? false : true);
                    this.k0 = blVar;
                    this.s0[5] = blVar;
                    wk wkVar = this.p2;
                    if (wkVar != null) {
                        blVar.setDelegate(wkVar);
                    } else {
                        blVar.setDelegate(new wg(this, i10));
                    }
                }
                this.S0 = 5L;
                fiVar = this.k0;
            } else if (this.J) {
                E1(false);
                fiVar = this.l0;
                this.S0 = 4L;
            } else {
                MessageObject messageObject = this.D1;
                if (messageObject != null) {
                    int i15 = this.C1;
                    if (i15 == -1) {
                        this.O0 = true;
                        if (messageObject.isMusic()) {
                            B1(false);
                            fiVar = this.h0;
                            this.S0 = 3L;
                        } else if (this.D1.isDocument()) {
                            E1(false);
                            fiVar = this.l0;
                            this.S0 = 4L;
                        } else {
                            this.S0 = 1L;
                        }
                    } else {
                        if (i15 == 2) {
                            B1(false);
                            fiVar = this.h0;
                            this.S0 = 3L;
                        } else if (i15 == 1) {
                            E1(false);
                            fiVar = this.l0;
                            this.S0 = 4L;
                        } else {
                            this.S0 = 1L;
                            fiVar = chatAttachAlertPhotoLayout;
                        }
                        this.O0 = false;
                    }
                } else {
                    this.O0 = this.M0 == 0 && !this.P0;
                    this.S0 = 1L;
                }
                fiVar = chatAttachAlertPhotoLayout;
            }
            phVar.setVisibility(this.O0 ? 0 : 8);
            if (this.u0 != fiVar) {
                cg.m1 m1Var = this.T0;
                if (m1Var.j0) {
                    m1Var.h(true);
                }
                this.containerView.removeView(this.u0);
                this.u0.r();
                this.u0.setVisibility(8);
                this.u0.q();
                this.u0 = fiVar;
                this.allowNestedScroll = true;
                if (fiVar.getParent() == null) {
                    this.containerView.addView(this.u0, 0, i7.f6.c(-1.0f, -1));
                }
                fiVar.setAlpha(1.0f);
                fiVar.setVisibility(0);
                fiVar.D(null);
                fiVar.E();
                m1Var.setVisibility(fiVar.h() != 0 ? 0 : 4);
                H1(this.Y, false);
                W1();
            }
            if (this.u0 != chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            V1(0);
            this.w1.l();
            m1().setText("");
            this.v1.h1(0, MediaController.VIDEO_BITRATE_480);
        }
        user = null;
        chat = null;
        z10 = o2Var instanceof org.telegram.ui.tn;
        if (z10) {
            if (chat != null) {
            }
            if (this.N1) {
            }
            th thVar2 = this.A0;
            if (z10) {
            }
            thVar2.setVisibility(this.S ? 0 : 4);
            boolean z112 = this.I1;
            boolean z122 = this.H1;
            boolean z132 = this.G1;
            chatAttachAlertPhotoLayout = this.f0;
            niVar = chatAttachAlertPhotoLayout.b;
            hz hzVar2 = chatAttachAlertPhotoLayout.D;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.r0 = z14;
            chatAttachAlertPhotoLayout.s0 = z112;
            chatAttachAlertPhotoLayout.t0 = z122;
            chatAttachAlertPhotoLayout.v0 = z132;
            ylVar = chatAttachAlertPhotoLayout.L;
            if (ylVar != null) {
            }
            if (niVar.b0 instanceof org.telegram.ui.tn) {
            }
            chatAttachAlertPhotoLayout.Q0 = MediaController.allMediaAlbumEntry;
            if (chatAttachAlertPhotoLayout.r0) {
            }
            if (Build.VERSION.SDK_INT >= 23) {
            }
            if (chatAttachAlertPhotoLayout.Q0 != null) {
            }
            chatAttachAlertPhotoLayout.Z();
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.B.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
            albumEntry = chatAttachAlertPhotoLayout.Q0;
            chatAttachAlertPhotoLayout.P0 = albumEntry;
            if (albumEntry != null) {
            }
            chatAttachAlertPhotoLayout.u0();
            thVar2.k(true);
            this.L0.k(true);
            this.q1 = false;
            setFocusable(false);
            if (this.K) {
            }
            if (this.k0 == null) {
            }
            this.S0 = 5L;
            fiVar = this.k0;
            phVar.setVisibility(this.O0 ? 0 : 8);
            if (this.u0 != fiVar) {
            }
            if (this.u0 != chatAttachAlertPhotoLayout) {
            }
            V1(0);
            this.w1.l();
            m1().setText("");
            this.v1.h1(0, MediaController.VIDEO_BITRATE_480);
        }
        if (chat != null) {
        }
        if (this.N1) {
        }
        th thVar22 = this.A0;
        if (z10) {
        }
        thVar22.setVisibility(this.S ? 0 : 4);
        boolean z1122 = this.I1;
        boolean z1222 = this.H1;
        boolean z1322 = this.G1;
        chatAttachAlertPhotoLayout = this.f0;
        niVar = chatAttachAlertPhotoLayout.b;
        hz hzVar22 = chatAttachAlertPhotoLayout.D;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.r0 = z14;
        chatAttachAlertPhotoLayout.s0 = z1122;
        chatAttachAlertPhotoLayout.t0 = z1222;
        chatAttachAlertPhotoLayout.v0 = z1322;
        ylVar = chatAttachAlertPhotoLayout.L;
        if (ylVar != null) {
        }
        if (niVar.b0 instanceof org.telegram.ui.tn) {
        }
        chatAttachAlertPhotoLayout.Q0 = MediaController.allMediaAlbumEntry;
        if (chatAttachAlertPhotoLayout.r0) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
        }
        if (chatAttachAlertPhotoLayout.Q0 != null) {
        }
        chatAttachAlertPhotoLayout.Z();
        chatAttachAlertPhotoLayout.y0(false);
        chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
        chatAttachAlertPhotoLayout.B.h1(0, MediaController.VIDEO_BITRATE_480);
        chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
        albumEntry = chatAttachAlertPhotoLayout.Q0;
        chatAttachAlertPhotoLayout.P0 = albumEntry;
        if (albumEntry != null) {
        }
        chatAttachAlertPhotoLayout.u0();
        thVar22.k(true);
        this.L0.k(true);
        this.q1 = false;
        setFocusable(false);
        if (this.K) {
        }
        if (this.k0 == null) {
        }
        this.S0 = 5L;
        fiVar = this.k0;
        phVar.setVisibility(this.O0 ? 0 : 8);
        if (this.u0 != fiVar) {
        }
        if (this.u0 != chatAttachAlertPhotoLayout) {
        }
        V1(0);
        this.w1.l();
        m1().setText("");
        this.v1.h1(0, MediaController.VIDEO_BITRATE_480);
    }

    public final boolean s1() {
        if (!this.Y) {
            return false;
        }
        fi fiVar = this.u0;
        return fiVar == this.f0 || fiVar == this.m0;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean shouldOverlayCameraViewOverNavBar() {
        fi fiVar = this.u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        return fiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.e1;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        this.E1 = false;
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            this.calcMandatoryInsets = ((org.telegram.ui.tn) o2Var).x9();
        }
        W1();
        this.o1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k9 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.a7), 0);
            this.navBarColor = k9;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k9, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.i2) {
            this.i2 = false;
            cg.m1 m1Var = this.T0;
            m1Var.e();
            m1Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        li liVar = this.V1;
        if (liVar == null || this.q1) {
            return;
        }
        boolean a02 = liVar.a0();
        this.q1 = true;
        AndroidUtilities.runOnUIThread(new jh.r5(this, editTextBoldCursor, z10, 15), a02 ? 200L : 0L);
    }

    public final void u1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int q12 = q1(false);
        org.telegram.ui.ActionBar.g6.w1(q12, this.shadowDrawable);
        qg.c cVar = this.B2;
        if (cVar.a.getColor() != q12) {
            cVar.a(q12);
            ug.f fVar = this.r1;
            if (fVar != null) {
                fVar.invalidate();
            }
            rh rhVar = this.s1;
            if (rhVar != null) {
                rhVar.invalidate();
            }
        }
        W1();
        this.containerView.invalidate();
    }

    public final void v1() {
        int i10 = 0;
        while (true) {
            fi[] fiVarArr = this.s0;
            if (i10 >= fiVarArr.length) {
                break;
            }
            fi fiVar = fiVarArr[i10];
            if (fiVar != null) {
                fiVar.m();
            }
            i10++;
        }
        int i11 = this.F1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.R = true;
        th thVar = this.A0;
        if (thVar != null) {
            thVar.o();
        }
        wh whVar = this.L0;
        if (whVar != null) {
            whVar.o();
        }
    }

    public final void w1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String userName = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : UserObject.getUserName(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F1).getAttachMenuBots().bots;
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
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        c2Var.P = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 20));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void x1() {
        int i10 = 0;
        while (true) {
            fi[] fiVarArr = this.s0;
            if (i10 >= fiVarArr.length) {
                this.b2 = true;
                return;
            }
            fi fiVar = fiVarArr[i10];
            if (fiVar != null) {
                fiVar.x();
            }
            i10++;
        }
    }

    public final void y1() {
        int i10 = 0;
        this.b2 = false;
        while (true) {
            fi[] fiVarArr = this.s0;
            if (i10 >= fiVarArr.length) {
                break;
            }
            fi fiVar = fiVarArr[i10];
            if (fiVar != null) {
                fiVar.A();
            }
            i10++;
        }
        if (isShowing()) {
            this.V1.a0();
        }
        ki kiVar = this.w1;
        if (kiVar != null) {
            kiVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.D1;
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        int i10 = this.F1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.D1.getDialogId()) && (o2Var instanceof org.telegram.ui.tn)) {
            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
            MessageSuggestionParams messageSuggestionParams = tnVar.c5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.D1.messageOwner.suggested_post);
            }
            if (!jh.s7.U(i10, messageSuggestionParams.amount)) {
                tnVar.Tb(messageSuggestionParams);
                return;
            }
        }
        if (this.G - this.H < 0) {
            AndroidUtilities.shakeView(this.s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.E0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (MessagesController.getInstance(i10).premiumFeaturesBlocked() || MessagesController.getInstance(i10).captionLengthLimitPremium <= this.H) {
                return;
            }
            O1(o2Var);
            return;
        }
        if (this.D1 == null && (o2Var instanceof org.telegram.ui.tn)) {
            org.telegram.ui.tn tnVar2 = (org.telegram.ui.tn) o2Var;
            if (tnVar2.c()) {
                c5.M(getContext(), tnVar2.a(), new wg(this, 12), this.resourcesProvider);
                return;
            }
        }
        fi fiVar = this.u0;
        if (fiVar == this.f0 || fiVar == this.m0) {
            G1(0, true, 0, s1(), this.J0);
            return;
        }
        if (fiVar.H(0, true, 0, s1(), this.J0)) {
            return;
        }
        this.w2 = true;
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        if (this.u0.n() || isDismissed()) {
            return;
        }
        th thVar = this.A0;
        if (thVar != null) {
            AndroidUtilities.hideKeyboard(thVar.getEditText());
        }
        wh whVar = this.L0;
        if (whVar != null) {
            AndroidUtilities.hideKeyboard(whVar.getEditText());
        }
        this.t0.clear();
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var == null) {
            o2Var = LaunchActivity.R();
        }
        if (!this.w2 && o2Var != null && this.u0.getSelectedItemsCount() > 0 && !this.B) {
            if (this.v2) {
                return;
            }
            this.v2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new wg(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new ch(this, 0));
            d1 d1Var = new d1(this, 4);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.J = d1Var;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            fi[] fiVarArr = this.s0;
            if (i10 >= fiVarArr.length) {
                break;
            }
            fi fiVar = fiVarArr[i10];
            if (fiVar != null && this.u0 != fiVar) {
                fiVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.a7), 0), true, (AndroidUtilities.IntColorCallback) new wg(this, 11));
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
        this.e2 = false;
        super.dismiss();
        this.w2 = false;
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }

    public ni(Activity activity, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11) {
        this(activity, o2Var, z10, z11, true, null);
    }
}

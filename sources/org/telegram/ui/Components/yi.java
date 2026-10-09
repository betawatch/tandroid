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
import org.telegram.ui.oj1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class yi extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.z2, me.d {
    public static final /* synthetic */ int R2 = 0;
    public final LongSparseArray A0;
    public final ai A1;
    public double[] A2;
    public qi B0;
    public final bi B1;
    public boolean B2;
    public qi C0;
    public final s4.d0 C1;
    public boolean C2;
    public final ch.d D0;
    public final vi D1;
    public boolean D2;
    public final i0 E;
    public final ch.d E0;
    public boolean E1;
    public ci.i E2;
    public boolean F;
    public final hg.k F0;
    public final RadialProgressView F1;
    public final ah.h F2;
    public boolean G;
    public final ai G0;
    public boolean G1;
    public final fh.d G2;
    public boolean H;
    public final di H0;
    public final r6 H1;
    public final fh.d H2;
    public int I;
    public final ImageView I0;
    public float I1;
    public final fh.c I2;
    public Utilities.Callback2 J;
    public final int[] J0;
    public int J1;
    public final ah.c J2;
    public int K;
    public final ai K0;
    public MessageObject K1;
    public final ah.c K2;
    public int L;
    public final ii L0;
    public boolean L1;
    public final nh L2;
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
    public k50 Q;
    public long Q0;
    public boolean Q1;
    public final ArrayList Q2;
    public boolean R;
    public final ci.m6 R0;
    public boolean R1;
    public final te0 S;
    public final gi S0;
    public boolean S1;
    public mo T;
    public int T0;
    public boolean T1;
    public m50 U;
    public gu U0;
    public boolean U1;
    public boolean V;
    public boolean V0;
    public int V1;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public jk X;
    public boolean X0;
    public boolean X1;
    public hj Y;
    public final float Y0;
    public float Y1;
    public long Z;
    public long Z0;
    public float Z1;
    public boolean a0;
    public final a8 a1;
    public ValueAnimator a2;
    public final me.b b;
    public final ah.d b0;
    public AnimatorSet b1;
    public int b2;
    public final me.b c;
    public boolean c0;
    public AnimatorSet c1;
    public wi c2;
    public final me.b d;
    public float d0;
    public final org.telegram.ui.ActionBar.v0 d1;
    public vn d2;
    public final me.b e;
    public final mi e0;
    public final ci.u e1;
    public final int[] e2;
    public final me.b f;
    public final org.telegram.ui.ActionBar.n2 f0;
    public final org.telegram.ui.ActionBar.v0 f1;
    public int f2;
    public final boolean g0;
    public ci.d4 g1;
    public float g2;
    public final me.b h;
    public pf h0;
    public final org.telegram.ui.ActionBar.v0 h1;
    public float h2;
    public boolean i0;
    public final bi.o i1;
    public boolean i2;
    public final ChatAttachAlertPhotoLayout j0;
    public float j1;
    public float j2;
    public ck k0;
    public float k1;
    public final boolean k2;
    public kj l0;
    public final ai l1;
    public boolean l2;
    public lo m0;
    public final TextView m1;
    public final ArrayList m2;
    public final me.l n;
    public lo n0;
    public final org.telegram.ui.ActionBar.v0 n1;
    public final Rect n2;
    public xl o0;
    public final LinearLayout o1;
    public float o2;
    public sk p0;
    public final ImageView p1;
    public boolean p2;
    public hn q0;
    public final LinearLayout q1;
    public int q2;
    public org.telegram.ui.xn r;
    public nj r0;
    public final TextView r1;
    public final mi r2;
    public final r6 s;
    public hg.j0 s0;
    public float s1;
    public o1.k s2;
    public tk t0;
    public boolean t1;
    public AnimatorSet t2;
    public tk u0;
    public final oi u1;
    public boolean u2;
    public final r6 v;
    public ii.r v0;
    public boolean v1;
    public boolean v2;
    public final ImageView w;
    public gl w0;
    public Object w1;
    public sl w2;
    public final i0 x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public final ImageView y;
    public float y0;
    public final jh.f y1;
    public boolean y2;
    public final qi[] z0;
    public final ci z1;
    public File z2;

    public yi(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        org.telegram.ui.ActionBar.v0 v0Var;
        Object[] objArr;
        TextPaint textPaint;
        me.l lVar;
        int i10;
        int i11;
        float f7;
        int i12;
        bi.o oVar;
        hs hsVar = hs.h;
        this.b = new me.b(0, this, hsVar, 380L, false);
        this.c = new me.b(1, this, hsVar, 380L, false);
        this.d = new me.b(2, this, hsVar, 380L, false);
        this.e = new me.b(3, this, hsVar, 380L, false);
        this.f = new me.b(4, this, hsVar, 380L, true);
        this.h = new me.b(5, this, hsVar, 320L, false);
        me.l lVar2 = new me.l(new gh(this, 2), hsVar, 380L);
        this.n = lVar2;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.d0 = 0.0f;
        this.e0 = new mi(this, 0);
        this.i0 = false;
        qi[] qiVarArr = new qi[12];
        this.z0 = qiVarArr;
        this.A0 = new LongSparseArray();
        this.J0 = new int[2];
        TextPaint textPaint2 = new TextPaint(1);
        this.M0 = textPaint2;
        this.N0 = new RectF();
        this.O0 = new Paint(1);
        this.X0 = true;
        this.Y0 = 1.0f;
        this.E1 = false;
        this.G1 = false;
        int i13 = UserConfig.selectedAccount;
        this.M1 = i13;
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
        this.r2 = new mi(this, 1);
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
        fh.c cVar = new fh.c();
        this.I2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        int i14 = 6;
        if (Build.VERSION.SDK_INT >= 31) {
            this.F2 = new ah.h(false);
            fh.d dVar = new fh.d(null);
            this.H2 = dVar;
            dVar.j(new k2.g0(this, 11));
            fh.d dVar2 = new fh.d(null);
            this.G2 = dVar2;
            dVar2.j(new m.f3(this, i14));
            ah.c cVar2 = new ah.c(dVar);
            this.J2 = cVar2;
            cVar2.i = LiteMode.isEnabled(262144);
            ah.c cVar3 = new ah.c(dVar2);
            this.K2 = cVar3;
            cVar3.i = LiteMode.isEnabled(262144);
        } else {
            this.F2 = null;
            this.G2 = null;
            this.H2 = null;
            this.J2 = new ah.c(cVar);
            this.K2 = new ah.c(cVar);
        }
        ah.c cVar4 = new ah.c(cVar);
        this.L2 = new nh(this, 0);
        this.k2 = z10;
        this.g0 = (n2Var instanceof org.telegram.ui.zn) && n2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f0 = n2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        oi oiVar = new oi(this, context);
        this.u1 = oiVar;
        oiVar.setDelegate(new pi(this));
        this.containerView = oiVar;
        oiVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        a8 a8Var = new a8(this, context, e6Var, 1);
        this.a1 = a8Var;
        a8Var.S0 = true;
        a8Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        a8Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        int i16 = org.telegram.ui.ActionBar.i6.j5;
        a8Var.D(getThemedColor(i16), false);
        int i17 = org.telegram.ui.ActionBar.i6.I5;
        a8Var.C(getThemedColor(i17), false);
        a8Var.setTitleColor(getThemedColor(i16));
        a8Var.setOccupyStatusBar(true);
        a8Var.setAlpha(0.0f);
        a8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 8));
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i16), false, e6Var);
        this.d1 = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setIcon(R.drawable.ic_ab_other);
        v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        final int i18 = 4;
        v0Var2.setVisibility(4);
        v0Var2.setAlpha(0.0f);
        v0Var2.setScaleX(0.6f);
        v0Var2.setScaleY(0.6f);
        v0Var2.setSubMenuOpenSide(2);
        v0Var2.setDelegate(new gh(this, 8));
        v0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        v0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        v0Var2.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i17), 6, -1));
        v0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.p4 p4Var;
                switch (i18) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        yi yiVar2 = this.b;
                        boolean z13 = yiVar2.c0;
                        if (!z13) {
                            yiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.K1(!z14, true);
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
                        yi.w(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.d2(yiVar4.B0 != yiVar4.q0);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i16), false, e6Var);
        this.f1 = v0Var3;
        v0Var3.setLongClickEnabled(false);
        ci.u uVar = new ci.u();
        this.e1 = uVar;
        v0Var3.setIcon(uVar);
        v0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var3.setVisibility(8);
        v0Var3.setAlpha(0.0f);
        v0Var3.setScaleX(0.6f);
        v0Var3.setScaleY(0.6f);
        v0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        v0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        v0Var3.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i17), 6, -1));
        final int i19 = 5;
        v0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.p4 p4Var;
                switch (i19) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        yi yiVar2 = this.b;
                        boolean z13 = yiVar2.c0;
                        if (!z13) {
                            yiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.K1(!z14, true);
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
                        yi.w(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.d2(yiVar4.B0 != yiVar4.q0);
                        break;
                }
            }
        });
        bi.o oVar2 = new bi.o(this, context);
        oVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Sh));
        oVar2.setText(LocaleController.getString(R.string.Create));
        oVar2.setTypeface(AndroidUtilities.bold());
        oVar2.setTextSize(1, 14.0f);
        oVar2.setVisibility(4);
        oVar2.setAlpha(0.0f);
        oVar2.setGravity(17);
        oVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        oVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        final int i20 = 6;
        oVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.p4 p4Var;
                switch (i20) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        yi yiVar2 = this.b;
                        boolean z13 = yiVar2.c0;
                        if (!z13) {
                            yiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.K1(!z14, true);
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
                        yi.w(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.d2(yiVar4.B0 != yiVar4.q0);
                        break;
                }
            }
        });
        w7.z5.a(oVar2);
        this.i1 = oVar2;
        a2();
        if (n2Var != null) {
            objArr = qiVarArr;
            textPaint = textPaint2;
            lVar = lVar2;
            i12 = i17;
            i10 = i16;
            v0Var = v0Var3;
            f7 = 14.0f;
            oVar = oVar2;
            org.telegram.ui.ActionBar.v0 v0Var4 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i16), false, e6Var);
            this.h1 = v0Var4;
            v0Var4.setLongClickEnabled(false);
            v0Var4.setIcon(R.drawable.outline_header_search);
            v0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            v0Var4.setVisibility(4);
            v0Var4.setAlpha(0.0f);
            v0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            i11 = -1;
            v0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i12), 6, -1));
            v0Var4.setOnClickListener(new ai.k3(5, this, z11));
        } else {
            v0Var = v0Var3;
            objArr = qiVarArr;
            textPaint = textPaint2;
            lVar = lVar2;
            i10 = i16;
            i11 = -1;
            f7 = 14.0f;
            i12 = i17;
            oVar = oVar2;
        }
        org.telegram.ui.ActionBar.v0 v0Var5 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i10), false, e6Var);
        this.n1 = v0Var5;
        v0Var5.setLongClickEnabled(false);
        v0Var5.setIcon(R.drawable.ic_ab_other);
        v0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var5.setVisibility(8);
        v0Var5.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i12), 3, i11));
        final int i21 = 2;
        v0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        final yi yiVar = this.b;
                        di diVar = yiVar.H0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(yiVar.getContext(), e6Var);
                            e0Var.n0(diVar.getText());
                            final int i22 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.oh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i22) {
                                        case 0:
                                            di diVar2 = yiVar.H0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            gi giVar = yiVar.S0;
                                            giVar.setText(charSequence);
                                            giVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = yiVar.Z;
                            boolean z13 = yiVar.K1 != null;
                            ph phVar = new ph(yiVar, 0);
                            e0Var.l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.n0 = phVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final yi yiVar2 = this.b;
                        gi giVar = yiVar2.S0;
                        if (giVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(yiVar2.getContext(), e6Var);
                            e0Var2.n0(giVar.getText());
                            final int i23 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.oh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i23) {
                                        case 0:
                                            di diVar2 = yiVar2.H0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            gi giVar2 = yiVar2.S0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = yiVar2.Z;
                            boolean z14 = yiVar2.K1 != null;
                            ph phVar2 = new ph(yiVar2, 1);
                            e0Var2.l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = phVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        yi yiVar3 = this.b;
                        yiVar3.n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = yiVar3.f0;
                        t12.K2(null, n2Var2, e6Var);
                        PhotoViewer.t1().L2(yiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i24 = yiVar3.V1;
                        boolean z15 = yiVar3.W1;
                        t13.h = i24;
                        t13.n = z15;
                        if (!yiVar3.c2.i0()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(yiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(yiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i25 = point.x;
                        int i26 = point.y;
                        if (i25 > 1080 || i26 > 1080) {
                            float min = Math.min(i25, i26) / 1080.0f;
                            i25 = (int) (i25 * min);
                            i26 = (int) (i26 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i25, i26, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().g2(arrayList3, 0, 11, false, new zh(yiVar3, photoEntry), n2Var2 instanceof org.telegram.ui.zn ? (org.telegram.ui.zn) n2Var2 : null);
                        if (yiVar3.G) {
                            PhotoViewer.t1().Y0(null, null, true, yiVar3.J);
                            break;
                        }
                        break;
                }
            }
        });
        v0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        v0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        final int i22 = 7;
        v0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.p4 p4Var;
                switch (i22) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        yi yiVar2 = this.b;
                        boolean z13 = yiVar2.c0;
                        if (!z13) {
                            yiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.K1(!z14, true);
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
                        yi.w(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.d2(yiVar4.B0 != yiVar4.q0);
                        break;
                }
            }
        });
        ai aiVar = new ai(this, context, 0);
        this.l1 = aiVar;
        final int i23 = 8;
        aiVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.p4 p4Var;
                switch (i23) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        yi yiVar2 = this.b;
                        boolean z13 = yiVar2.c0;
                        if (!z13) {
                            yiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.K1(!z14, true);
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
                        yi.w(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.d2(yiVar4.B0 != yiVar4.q0);
                        break;
                }
            }
        });
        aiVar.setAlpha(0.0f);
        aiVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.o1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.m1 = textView;
        textView.setTextColor(getThemedColor(i10));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.x5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.p1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.x5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        aiVar.addView(linearLayout, w7.x5.d(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.q1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.x5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.r1 = textView2;
        textView2.setTextColor(getThemedColor(i10));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.x5.q(-2, -2, 16));
        aiVar.addView(linearLayout2, w7.x5.d(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, e6Var);
        this.j0 = chatAttachAlertPhotoLayout;
        objArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.B0 = chatAttachAlertPhotoLayout;
        this.Z0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.x5.d(-1.0f, -1));
        jh.f fVar = new jh.f(context);
        this.y1 = fVar;
        fVar.setup(cVar4);
        fVar.setFadeTopAlpha(0);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(fVar, w7.x5.g());
        this.containerView.addView(aiVar, w7.x5.a(-2.0f, 23.0f, 0.0f, 21.0f, 0.0f, -1, 51));
        ci.m6 m6Var = new ci.m6(context, 8);
        this.R0 = m6Var;
        this.containerView.addView(m6Var, w7.x5.e(-1, -2, 55));
        this.containerView.addView(a8Var, w7.x5.d(-2.0f, -1));
        this.containerView.addView(v0Var2, w7.x5.e(48, 48, 53));
        this.containerView.addView(v0Var, w7.x5.a(48.0f, 0.0f, 0.0f, 48.0f, 0.0f, 48, 53));
        org.telegram.ui.ActionBar.v0 v0Var6 = this.h1;
        if (v0Var6 != null) {
            this.containerView.addView(v0Var6, w7.x5.e(48, 48, 53));
        }
        aiVar.addView(v0Var5, w7.x5.a(32.0f, 0.0f, 0.0f, 0.0f, 8.0f, 32, 21));
        this.containerView.addView(oVar, w7.x5.e(-2, 48, 53));
        ai aiVar2 = new ai(this, context, 1);
        this.A1 = aiVar2;
        bi biVar = new bi(context, 0);
        this.B1 = biVar;
        biVar.setClipChildren(true);
        biVar.setClipToPadding(false);
        vi viVar = new vi(this, context);
        this.D1 = viVar;
        biVar.setAdapter(viVar);
        s4.d0 d0Var = new s4.d0(0, false);
        this.C1 = d0Var;
        biVar.setLayoutManager(d0Var);
        biVar.setVerticalScrollBarEnabled(false);
        biVar.setHorizontalScrollBarEnabled(false);
        biVar.setItemAnimator(null);
        biVar.setLayoutAnimation(null);
        biVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.i6.A5));
        biVar.x2 = true;
        biVar.setOverScrollMode(2);
        ah.c cVar5 = this.J2;
        hh.j jVar = new hh.j(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        cVar5.f = jVar;
        cVar5.g = viewGroup2;
        ah.c cVar6 = this.K2;
        hh.j jVar2 = new hh.j(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        cVar6.f = jVar2;
        cVar6.g = viewGroup3;
        hh.j jVar3 = new hh.j(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        cVar4.f = jVar3;
        cVar4.g = viewGroup4;
        ci ciVar = new ci(this, context, 0);
        this.z1 = ciVar;
        ah.d dVar3 = new ah.d(cVar4.c(ciVar, null, false));
        this.b0 = dVar3;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        dVar3.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(ciVar, w7.x5.g());
        ch.d c10 = this.J2.c(aiVar2, eh.b.f(e6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        aiVar2.setBackground(c10);
        biVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        biVar.setClipToOutline(true);
        int dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(28.0f);
        ai.l2 l2Var = yf.i0.a;
        biVar.setOutlineProvider(new yf.h0(dp, dp2));
        biVar.setImportantForAccessibility(1);
        aiVar2.addView(biVar, w7.x5.g());
        this.containerView.addView(aiVar2, w7.x5.e(-1, 70, 81));
        biVar.setOnItemClickListener(new ai.o6(9, this, e6Var));
        biVar.setOnItemLongClickListener(new gh(this, 3));
        final int i24 = 0;
        r6 r6Var = new r6(context, true, false, true);
        this.H1 = r6Var;
        r6Var.setVisibility(8);
        r6Var.setAlpha(0.0f);
        r6Var.setGravity(17);
        r6Var.setTypeface(AndroidUtilities.bold());
        int dp3 = AndroidUtilities.dp(16.0f);
        r6Var.setPadding(dp3, 0, dp3, 0);
        r6Var.setTextSize(AndroidUtilities.dp(f7));
        r6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.p4 p4Var;
                switch (i24) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        yi yiVar2 = this.b;
                        boolean z13 = yiVar2.c0;
                        if (!z13) {
                            yiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.K1(!z14, true);
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
                        yi.w(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.d2(yiVar4.B0 != yiVar4.q0);
                        break;
                }
            }
        });
        this.containerView.addView(r6Var, w7.x5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.x5.a(28.0f, 0.0f, 0.0f, 10.0f, 10.0f, 28, 85));
        ImageView imageView3 = new ImageView(context);
        this.I0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i25 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.p4 p4Var;
                switch (i25) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        yi yiVar2 = this.b;
                        boolean z13 = yiVar2.c0;
                        if (!z13) {
                            yiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.K1(!z14, true);
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
                        yi.w(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.d2(yiVar4.B0 != yiVar4.q0);
                        break;
                }
            }
        });
        ai aiVar3 = new ai(this, context, 2);
        this.G0 = aiVar3;
        hg.k kVar = new hg.k(this, context);
        this.F0 = kVar;
        aiVar3.addView(kVar, w7.x5.e(-1, -1, 119));
        ch.d c11 = this.K2.c(oiVar, eh.b.n(e6Var), false);
        this.D0 = c11;
        c11.m = true;
        c11.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.u(AndroidUtilities.dp(32.0f));
        c11.j.g = 0.4f;
        c11.k();
        ch.d c12 = this.J2.c(kVar, eh.b.n(e6Var), false);
        this.E0 = c12;
        c12.q(AndroidUtilities.dp(22.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        kVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        aiVar3.setWillNotDraw(false);
        aiVar3.setVisibility(4);
        aiVar3.setAlpha(0.0f);
        this.containerView.addView(aiVar3, w7.x5.e(-1, -2, 83));
        aiVar3.setOnTouchListener(new bi.d(13));
        r6 r6Var2 = new r6(context, false, false, false);
        this.s = r6Var2;
        r6Var2.setAllowCancel(true);
        r6Var2.setScaleProperty(0.6f);
        r6Var2.setVisibility(8);
        r6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i26 = org.telegram.ui.ActionBar.i6.y6;
        r6Var2.setTextColor(getThemedColor(i26));
        r6Var2.setTypeface(AndroidUtilities.bold());
        r6Var2.setGravity(17);
        kVar.addView(r6Var2, w7.x5.a(20.0f, 3.0f, 0.0f, 3.0f, 50.0f, 56, 85));
        ImageView imageView4 = new ImageView(context);
        this.w = imageView4;
        i0 i0Var = new i0(context);
        this.x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i27 = org.telegram.ui.ActionBar.i6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i27), mode));
        int i28 = org.telegram.ui.ActionBar.i6.i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i28), 1, AndroidUtilities.dp(16.0f)));
        kVar.addView(imageView4, w7.x5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 53));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.z5.a(imageView4);
        final int i29 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i29) {
                    case 0:
                        final yi yiVar = this.b;
                        di diVar = yiVar.H0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(yiVar.getContext(), e6Var);
                            e0Var.n0(diVar.getText());
                            final int i222 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.oh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i222) {
                                        case 0:
                                            di diVar2 = yiVar.H0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            gi giVar2 = yiVar.S0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = yiVar.Z;
                            boolean z13 = yiVar.K1 != null;
                            ph phVar = new ph(yiVar, 0);
                            e0Var.l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.n0 = phVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final yi yiVar2 = this.b;
                        gi giVar = yiVar2.S0;
                        if (giVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(yiVar2.getContext(), e6Var);
                            e0Var2.n0(giVar.getText());
                            final int i232 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.oh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i232) {
                                        case 0:
                                            di diVar2 = yiVar2.H0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            gi giVar2 = yiVar2.S0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = yiVar2.Z;
                            boolean z14 = yiVar2.K1 != null;
                            ph phVar2 = new ph(yiVar2, 1);
                            e0Var2.l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = phVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        yi yiVar3 = this.b;
                        yiVar3.n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = yiVar3.f0;
                        t12.K2(null, n2Var2, e6Var);
                        PhotoViewer.t1().L2(yiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i242 = yiVar3.V1;
                        boolean z15 = yiVar3.W1;
                        t13.h = i242;
                        t13.n = z15;
                        if (!yiVar3.c2.i0()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(yiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(yiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i252 = point.x;
                        int i262 = point.y;
                        if (i252 > 1080 || i262 > 1080) {
                            float min = Math.min(i252, i262) / 1080.0f;
                            i252 = (int) (i252 * min);
                            i262 = (int) (i262 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i252, i262, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().g2(arrayList3, 0, 11, false, new zh(yiVar3, photoEntry), n2Var2 instanceof org.telegram.ui.zn ? (org.telegram.ui.zn) n2Var2 : null);
                        if (yiVar3.G) {
                            PhotoViewer.t1().Y0(null, null, true, yiVar3.J);
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
        di diVar = new di(this, context, oiVar, e6Var);
        this.H0 = diVar;
        diVar.J = true;
        diVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        diVar.s();
        diVar.getEditText().setLayoutParams(w7.x5.a(-1.0f, 48.0f, 0.0f, 36.0f, 0.0f, -1, 19));
        diVar.getEditText().addTextChangedListener(new fi(this, 0));
        kVar.addView(diVar, w7.x5.a(-2.0f, 0.0f, 0.0f, 84.0f, 0.0f, -1, 83));
        kVar.setClipChildren(false);
        aiVar3.setClipChildren(false);
        diVar.setClipChildren(false);
        m6Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        m6Var.setWillNotDraw(false);
        gi giVar = new gi(this, context, oiVar, e6Var);
        this.S0 = giVar;
        giVar.J = true;
        giVar.getEditText().addTextChangedListener(new hi(this, n2Var));
        giVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        giVar.getEditText().setLayoutParams(w7.x5.a(-1.0f, 48.0f, 0.0f, 96.0f, 0.0f, -1, 19));
        giVar.getEditText().setTextSize(1, 17.0f);
        giVar.getEmojiButton().setLayoutParams(w7.x5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 83));
        giVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        m6Var.addView(giVar, w7.x5.e(-1, -2, 119));
        m6Var.setAlpha(0.0f);
        m6Var.setVisibility(8);
        diVar.addView(imageView3, w7.x5.a(40.0f, 0.0f, 0.0f, 0.0f, 4.0f, 40, 85));
        ch.d c13 = this.J2.c(m6Var, eh.b.n(e6Var), false);
        c13.q(AndroidUtilities.dp(22.0f));
        c13.p(AndroidUtilities.dp(7.0f));
        m6Var.setBackground(c13);
        m6Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        r6 r6Var3 = new r6(context, false, false, false);
        this.v = r6Var3;
        r6Var3.setScaleProperty(0.6f);
        r6Var3.setVisibility(8);
        r6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var3.setTextColor(getThemedColor(i26));
        r6Var3.setTypeface(AndroidUtilities.bold());
        r6Var3.setGravity(17);
        r6Var3.setAllowCancel(true);
        m6Var.addView(r6Var3, w7.x5.a(20.0f, 3.0f, 45.0f, 3.0f, 0.0f, 56, 53));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.Xd), mode2));
        giVar.addView(imageView5, w7.x5.a(40.0f, 0.0f, 0.0f, 60.0f, 0.0f, 40, 85));
        final int i30 = 2;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.p4 p4Var;
                switch (i30) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        yi yiVar2 = this.b;
                        boolean z13 = yiVar2.c0;
                        if (!z13) {
                            yiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.K1(!z14, true);
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
                        yi.w(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.d2(yiVar4.B0 != yiVar4.q0);
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
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i27), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i28), 1, AndroidUtilities.dp(16.0f)));
        m6Var.addView(imageView6, w7.x5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 85));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.z5.a(imageView6);
        final int i31 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i31) {
                    case 0:
                        final yi yiVar = this.b;
                        di diVar2 = yiVar.H0;
                        if (diVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(yiVar.getContext(), e6Var);
                            e0Var.n0(diVar2.getText());
                            final int i222 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.oh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i222) {
                                        case 0:
                                            di diVar22 = yiVar.H0;
                                            diVar22.setText(charSequence);
                                            diVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            gi giVar2 = yiVar.S0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = yiVar.Z;
                            boolean z13 = yiVar.K1 != null;
                            ph phVar = new ph(yiVar, 0);
                            e0Var.l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.n0 = phVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final yi yiVar2 = this.b;
                        gi giVar2 = yiVar2.S0;
                        if (giVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(yiVar2.getContext(), e6Var);
                            e0Var2.n0(giVar2.getText());
                            final int i232 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.oh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i232) {
                                        case 0:
                                            di diVar22 = yiVar2.H0;
                                            diVar22.setText(charSequence);
                                            diVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            gi giVar22 = yiVar2.S0;
                                            giVar22.setText(charSequence);
                                            giVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = yiVar2.Z;
                            boolean z14 = yiVar2.K1 != null;
                            ph phVar2 = new ph(yiVar2, 1);
                            e0Var2.l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = phVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        yi yiVar3 = this.b;
                        yiVar3.n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = yiVar3.f0;
                        t12.K2(null, n2Var2, e6Var);
                        PhotoViewer.t1().L2(yiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i242 = yiVar3.V1;
                        boolean z15 = yiVar3.W1;
                        t13.h = i242;
                        t13.n = z15;
                        if (!yiVar3.c2.i0()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(yiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.l8.w(yiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i252 = point.x;
                        int i262 = point.y;
                        if (i252 > 1080 || i262 > 1080) {
                            float min = Math.min(i252, i262) / 1080.0f;
                            i252 = (int) (i252 * min);
                            i262 = (int) (i262 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i252, i262, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().g2(arrayList3, 0, 11, false, new zh(yiVar3, photoEntry), n2Var2 instanceof org.telegram.ui.zn ? (org.telegram.ui.zn) n2Var2 : null);
                        if (yiVar3.G) {
                            PhotoViewer.t1().Y0(null, null, true, yiVar3.J);
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
        ai aiVar4 = new ai(this, context, 3);
        this.K0 = aiVar4;
        aiVar4.setFocusable(true);
        aiVar4.setFocusableInTouchMode(true);
        aiVar4.setVisibility(4);
        aiVar4.setScaleX(0.2f);
        aiVar4.setScaleY(0.2f);
        aiVar4.setAlpha(0.0f);
        aiVar4.setClipChildren(false);
        aiVar4.setClipToPadding(false);
        this.containerView.addView(aiVar4, w7.x5.e(110, 50, 85));
        ii iiVar = new ii(R.drawable.send_plane_24, context, e6Var, this);
        this.L0 = iiVar;
        iiVar.setImportantForAccessibility(2);
        aiVar4.addView(iiVar, w7.x5.e(-1, -1, 119));
        iiVar.setTranslationX(this.backgroundPaddingLeft);
        int dp4 = AndroidUtilities.dp(52.0f);
        int dp5 = AndroidUtilities.dp(38.0f);
        iiVar.I = dp4;
        iiVar.J = dp5;
        float dp6 = AndroidUtilities.dp(7.0f);
        float dp7 = AndroidUtilities.dp(6.0f);
        iiVar.M = dp6;
        iiVar.N = dp7;
        iiVar.h0 = true;
        final int i32 = 3;
        iiVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.p4 p4Var;
                switch (i32) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.Z0;
                        if (j3 < 0 && (p4Var = (ei.p4) yiVar.A0.get(-j3)) != null) {
                            org.telegram.ui.web.b1 webViewContainer = p4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        yi yiVar2 = this.b;
                        boolean z13 = yiVar2.c0;
                        if (!z13) {
                            yiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.K1(!z14, true);
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
                        yi.w(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.B0;
                        if (qiVar != null) {
                            qiVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.d2(yiVar4.B0 != yiVar4.q0);
                        break;
                }
            }
        });
        iiVar.setOnLongClickListener(new org.telegram.ui.hg(this, context, e6Var, n2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        ci ciVar2 = new ci(this, context, 1);
        ciVar2.setAlpha(0.0f);
        ciVar2.setScaleX(0.2f);
        ciVar2.setScaleY(0.2f);
        if (z10) {
            e1();
            this.navBarColorKey = -1;
        }
        xl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        ah.c cVar7 = this.J2;
        dh.e n10 = eh.b.n(e6Var);
        qm0 qm0Var = fastScroll.o0;
        ch.d c14 = cVar7.c(qm0Var.d1, n10, false);
        fastScroll.e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.e0.q(AndroidUtilities.dp(24.0f));
        ch.d c15 = cVar7.c(qm0Var.d1, n10, false);
        fastScroll.f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f0.q(AndroidUtilities.dp(f7));
        te0 te0Var = new te0(context);
        this.S = te0Var;
        this.containerView.addView(te0Var, w7.x5.d(-1.0f, -1));
        dh.e eVar = new dh.e(e6Var);
        eVar.e = new gh(this, 4);
        eVar.c = new gh(this, 5);
        eVar.d = new gh(this, 6);
        eVar.b = new gh(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.n = dpf2;
        eVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f = dpf23;
        eVar.h = dpf24;
        a8Var.M(this.J2, eVar, false);
        lVar.i(1L, false);
    }

    public static void O(yi yiVar) {
        a8 a8Var = yiVar.a1;
        jh.f fVar = yiVar.y1;
        if (fVar == null || a8Var == null) {
            return;
        }
        qi qiVar = yiVar.C0;
        if (qiVar == null) {
            qiVar = yiVar.B0;
        }
        int i10 = 0;
        boolean z10 = qiVar != null && (qiVar instanceof gl);
        org.telegram.ui.ActionBar.e6 e6Var = yiVar.resourcesProvider;
        boolean a2 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.i6.I.q();
        if (!z10 && a8Var.getVisibility() == 0) {
            i10 = (int) (a8Var.getAlpha() * (a2 ? 255 : 160));
        }
        fVar.setFadeTopAlpha(i10);
    }

    public static void S(yi yiVar) {
        ci.i iVar = new ci.i(yiVar, yiVar.getContext(), yiVar.Z, LaunchActivity.R(), yiVar.resourcesProvider, 1);
        yiVar.E2 = iVar;
        iVar.p(new l2.f(yiVar, 11));
        ViewGroup viewGroup = yiVar.containerView;
        viewGroup.addView(yiVar.E2, viewGroup.indexOfChild(yiVar.G0), w7.x5.e(-1, -1, 83));
        ci.i iVar2 = yiVar.E2;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
            gg.j1 adapter = iVar2.getAdapter();
            znVar.i();
            TLRPC.Chat chat = znVar.e;
            adapter.getClass();
            adapter.l0 = chat;
            iVar2.getAdapter().W(znVar.Z7);
            iVar2.getAdapter().e0 = znVar.e != null;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().e0 = false;
        }
        iVar2.getAdapter().f0 = false;
        yiVar.Y1();
    }

    public static /* synthetic */ void o(yi yiVar, ValueAnimator valueAnimator) {
        yiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.d3 d3Var = yiVar.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
    }

    public static /* synthetic */ void q(yi yiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.z2 z2Var) {
        yiVar.currentSheetAnimation = null;
        yiVar.s2 = null;
        animationNotificationsLocker.unlock();
        yiVar.currentSheetAnimationType = 0;
        if (z2Var != null) {
            z2Var.onOpenAnimationEnd();
        }
        if (yiVar.useHardwareLayer) {
            yiVar.container.setLayerType(0, null);
        }
        if (yiVar.isFullscreen) {
            WindowManager.LayoutParams attributes = yiVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            yiVar.getWindow().setAttributes(attributes);
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
    public static boolean r(yi yiVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.n2 n2Var, View view) {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        org.telegram.ui.zn znVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        boolean z10;
        boolean z11;
        MessageObject messageObject3;
        long j3;
        MessageObject messageObject4;
        ArrayList<Object> arrayList;
        HashMap<Object, Object> hashMap;
        int i10;
        long j10;
        Throwable th2;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor;
        int i11;
        Throwable th3;
        String str;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        long j11;
        boolean z12;
        long j12;
        org.telegram.ui.zn znVar2;
        TLRPC.ChatFull chatFull;
        boolean z13;
        boolean z14;
        int i12;
        boolean z15;
        ii iiVar = yiVar.L0;
        org.telegram.ui.ActionBar.n2 n2Var2 = yiVar.f0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = yiVar.j0;
        int i13 = yiVar.M1;
        long j13 = yiVar.Z;
        if ((j13 != 0 || (n2Var2 instanceof org.telegram.ui.zn)) && yiVar.K - yiVar.L >= 0 && !yiVar.h.f) {
            if (n2Var2 instanceof org.telegram.ui.zn) {
                org.telegram.ui.zn znVar3 = (org.telegram.ui.zn) n2Var2;
                TLRPC.User i14 = znVar3.i();
                MessageObject messageObject5 = znVar3.n5;
                MessageObject messageObject6 = znVar3.k5;
                if (!znVar3.c() && znVar3.R3 != 5) {
                    messageObject2 = messageObject6;
                    messageObject = messageObject5;
                    znVar = znVar3;
                    user = i14;
                    j13 = znVar3.a();
                }
            } else {
                user = MessagesController.getInstance(i13).getUser(Long.valueOf(j13));
                messageObject = null;
                messageObject2 = null;
                znVar = null;
            }
            pf pfVar = yiVar.h0;
            if (pfVar != null) {
                pfVar.dismiss();
            }
            pf pfVar2 = new pf(yiVar, context, e6Var, 1);
            yiVar.h0 = pfVar2;
            pfVar2.r(iiVar, false, new ai.d0(yiVar, n2Var, e6Var, 16));
            ArrayList arrayList2 = new ArrayList();
            qi qiVar = yiVar.B0;
            String str2 = "";
            int i15 = 2;
            if (qiVar == chatAttachAlertPhotoLayout3 || qiVar == yiVar.q0) {
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
                                j10 = j13;
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
                                tL_message.peer_id = MessagesController.getInstance(i13).getPeer(j13);
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
                                    j10 = j13;
                                    if (photoEntry.videoOrientation == -1) {
                                        try {
                                            MediaMetadataRetriever mediaMetadataRetriever3 = new MediaMetadataRetriever();
                                            try {
                                                if (!photoEntry.isLivePhoto() || photoEntry.livePhotoVideoOffset <= 0) {
                                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                    try {
                                                        mediaMetadataRetriever2.setDataSource(photoEntry.path);
                                                        parcelFileDescriptor = null;
                                                    } catch (Exception e7) {
                                                        e = e7;
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
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        parcelFileDescriptor = open;
                                                    } catch (Throwable th5) {
                                                        th3 = th5;
                                                        parcelFileDescriptor = open;
                                                    }
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
                                                        } catch (IOException e12) {
                                                            FileLog.e(e12);
                                                        }
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        i11 = 0;
                                                        photoEntry.videoOrientation = i11;
                                                        FileLog.e(e);
                                                        if (mediaMetadataRetriever2 != null) {
                                                            try {
                                                                mediaMetadataRetriever2.release();
                                                            } catch (IOException e14) {
                                                                FileLog.e(e14);
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
                                                        } catch (IOException e15) {
                                                            FileLog.e(e15);
                                                        }
                                                    }
                                                    if (parcelFileDescriptor == null) {
                                                        throw th2;
                                                    }
                                                    try {
                                                        parcelFileDescriptor.close();
                                                        throw th2;
                                                    } catch (IOException e16) {
                                                        FileLog.e(e16);
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Exception e17) {
                                                e = e17;
                                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                            }
                                        } catch (Exception e18) {
                                            e = e18;
                                            mediaMetadataRetriever2 = null;
                                        } catch (Throwable th9) {
                                            th2 = th9;
                                            mediaMetadataRetriever = null;
                                        }
                                    }
                                    i28 = photoEntry.videoOrientation;
                                } else {
                                    j10 = j13;
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
                                    CharSequence[] charSequenceArr = {yiVar.o1().getText()};
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
                            j13 = j10;
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
                j3 = j13;
                messageObject4 = messageObject3;
            } else {
                if (qiVar == yiVar.k0) {
                    if (TextUtils.isEmpty(yiVar.o1().getText())) {
                        i12 = 0;
                        z15 = false;
                    } else {
                        TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                        tL_message2.id = 0;
                        tL_message2.out = true;
                        tL_message2.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                        tL_message2.peer_id = MessagesController.getInstance(i13).getPeer(j13);
                        CharSequence[] charSequenceArr2 = {yiVar.o1().getText()};
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
                    ArrayList<TLRPC.User> selected = yiVar.k0.getSelected();
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
                        tL_message3.peer_id = MessagesController.getInstance(i13).getPeer(j13);
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
                    j3 = j13;
                    z11 = z15;
                    messageObject4 = null;
                } else {
                    chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                    if (qiVar == yiVar.p0) {
                        messageObject4 = null;
                        boolean z17 = false;
                        int i31 = 0;
                        for (int i32 = 0; i32 < yiVar.p0.S.size(); i32++) {
                            String str5 = (String) yiVar.p0.S.get(i32);
                            if (str5 != null) {
                                int lastIndexOf = str5.lastIndexOf(File.separator);
                                String substring = lastIndexOf < 0 ? str5 : str5.substring(lastIndexOf + 1);
                                if (!TextUtils.isEmpty(substring)) {
                                    TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                                    int i33 = i31 + 1;
                                    tL_message4.id = i31;
                                    tL_message4.out = true;
                                    tL_message4.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                                    tL_message4.peer_id = MessagesController.getInstance(i13).getPeer(j13);
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
                                        CharSequence[] charSequenceArr3 = {yiVar.o1().getText()};
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
                        j3 = j13;
                        z11 = z17;
                    } else {
                        kj kjVar = yiVar.l0;
                        if (qiVar == kjVar) {
                            arrayList2.addAll(kjVar.getSelected());
                            if (!arrayList2.isEmpty()) {
                                messageObject4 = (MessageObject) arrayList2.get(0);
                                CharSequence[] charSequenceArr4 = {yiVar.o1().getText()};
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
                                    j3 = j13;
                                    z10 = false;
                                    z11 = true;
                                }
                            }
                            messageObject4 = null;
                            if (arrayList2.size() > 1) {
                            }
                            j3 = j13;
                            z10 = false;
                            z11 = true;
                        } else {
                            j3 = j13;
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
            p80 F = p80.F(yiVar.containerView, e6Var, iiVar);
            if (messageObject4 != null) {
                qi qiVar2 = yiVar.B0;
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (qiVar2 == chatAttachAlertPhotoLayout2 || qiVar2 == yiVar.q0) {
                    uc0 uc0Var = new uc0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), e6Var);
                    TLRPC.Message message = messageObject4.messageOwner;
                    boolean z18 = yiVar.c0;
                    message.invert_media = z18;
                    uc0Var.a(!z18, false);
                    uc0Var.setOnClickListener(new ai.d0(yiVar, messageObject4, uc0Var, 17));
                    F.q(uc0Var);
                    if (yiVar.K1 == null) {
                        F.k();
                    }
                }
            } else {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            }
            boolean isUserSelf = UserObject.isUserSelf(user);
            if (yiVar.K1 != null || ((znVar != null && ChatObject.isMonoForum(znVar.e)) || ((znVar == null || !znVar.G6()) && !yiVar.B0.c()))) {
                j11 = j3;
            } else {
                j11 = j3;
                F.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new a3.h0(yiVar, j11, e6Var, 19), false);
            }
            qi qiVar3 = yiVar.B0;
            if (qiVar3 == chatAttachAlertPhotoLayout2 || qiVar3 == yiVar.q0) {
                z12 = true;
                if (qiVar3.getSelectedItemsCount() == 1 && znVar != null && ChatObject.isMonoForum(znVar.e)) {
                    znVar2 = znVar;
                    j12 = j11;
                    F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new ai.r8(yiVar, j11, znVar2, e6Var, 28), false);
                } else {
                    j12 = j11;
                    znVar2 = znVar;
                }
            } else {
                j12 = j11;
                znVar2 = znVar;
                z12 = true;
            }
            if (yiVar.K1 == null && !isUserSelf) {
                F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new jh(yiVar, i15), false);
            }
            if (yiVar.K1 == null && z10 && znVar2 != null && ChatObject.isChannelAndNotMegaGroup(znVar2.e) && (chatFull = znVar2.Z7) != null && chatFull.paid_media_allowed) {
                F.c(R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton), null, false);
                org.telegram.ui.ActionBar.f1 y3 = F.y();
                y3.setOnClickListener(new ai.p5(yiVar, context, y3, e6Var, 12));
                long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
                if (starsPrice > 0) {
                    y3.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    y3.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
                } else {
                    y3.setText(LocaleController.getString(R.string.PaidMediaButton));
                    y3.setSubtext(null);
                }
                yiVar.h0.s(starsPrice);
            }
            F.Y();
            yiVar.h0.p(F);
            yiVar.h0.q(arrayList2);
            if (yiVar.K1 == null && j12 >= 0 && z11) {
                yiVar.h0.d(n2Var);
                yiVar.h0.o(yiVar.Q0);
            }
            yiVar.h0.show();
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            return z12;
        }
        return false;
    }

    public static void s(yi yiVar) {
        o1.k kVar = yiVar.s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(yiVar.containerView, o1.h.n, 0.0f);
        yiVar.s2 = kVar2;
        kVar2.u.a(1.5f);
        yiVar.s2.u.b(1500.0f);
        yiVar.s2.h();
    }

    public static /* synthetic */ void t(yi yiVar, org.telegram.messenger.video.f fVar) {
        AnimatorSet animatorSet = yiVar.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        fVar.run();
    }

    public static /* synthetic */ void u(yi yiVar, int i10) {
        yiVar.navBarColorKey = -1;
        yiVar.navBarColor = i10;
        yiVar.containerView.invalidate();
    }

    public static /* synthetic */ void v(yi yiVar) {
        yiVar.currentSheetAnimation = null;
        yiVar.currentSheetAnimationType = 0;
        yiVar.dismissInternal();
    }

    public static boolean v1(TLRPC.User user) {
        return (user == null || UserObject.isUserSelf(user) || UserObject.isBot(user) || UserObject.isDeleted(user) || UserObject.isService(user.id) || UserObject.isReplyUser(user) || UserObject.isAnonymous(user) || user.id == UserObject.VERIFY || MessagesController.isSupportUser(user)) ? false : true;
    }

    public static void w(yi yiVar) {
        if (yiVar.j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.j0;
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
        yiVar.c2(true);
        org.telegram.ui.ActionBar.v0 v0Var = yiVar.f1;
        ci.d4 d4Var = yiVar.g1;
        if (d4Var != null) {
            d4Var.e(true);
        }
        ci.d4 d4Var2 = new ci.d4(yiVar.getContext(), 1);
        yiVar.g1 = d4Var2;
        d4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(!S ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        yiVar.g1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        yiVar.g1.m(1.0f, -((yiVar.containerView.getWidth() - ((v0Var.getWidth() / 2.0f) + v0Var.getX())) - AndroidUtilities.dp(14.0f)));
        yiVar.g1.setTranslationY(yiVar.d1.getTranslationY());
        ci.d4 d4Var3 = yiVar.g1;
        d4Var3.l0 = new ea(8, yiVar, d4Var2);
        yiVar.containerView.addView(d4Var3, w7.x5.a(60.0f, 0.0f, 46.0f, 0.0f, 0.0f, -1, 48));
        yiVar.g1.u();
    }

    public static /* synthetic */ void x(yi yiVar, boolean z10, jh jhVar) {
        yiVar.B0.v(1.0f);
        yiVar.C0.v(1.0f);
        yiVar.B0.l(yiVar.o2);
        yiVar.C0.l(yiVar.o2);
        yiVar.containerView.invalidate();
        yiVar.a1.setTag(z10 ? 1 : null);
        jhVar.run();
    }

    public static void y(yi yiVar, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        bi biVar = yiVar.B1;
        qi[] qiVarArr = yiVar.z0;
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
        org.telegram.ui.ActionBar.n2 R = n2Var == null ? LaunchActivity.R() : n2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (view instanceof si) {
            Activity parentActivity = R.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!yiVar.O1 && !yiVar.P1 && yiVar.c1()) {
                    return;
                }
                if (!yiVar.O1 && !yiVar.P1) {
                    mo moVar = new mo(1, yiVar.getContext(), e6Var, yiVar);
                    yiVar.T = moVar;
                    yiVar.U1(moVar);
                }
                yiVar.U1(yiVar.j0);
            } else if (intValue == 17) {
                if (yiVar.w0 == null && (n2Var instanceof org.telegram.ui.zn)) {
                    TLRPC.User i10 = ((org.telegram.ui.zn) n2Var).i();
                    if (v1(i10)) {
                        gl glVar = new gl(yiVar, yiVar.getContext(), yiVar.M1, i10, e6Var);
                        yiVar.w0 = glVar;
                        qiVarArr[11] = glVar;
                    }
                }
                qi qiVar = yiVar.w0;
                if (qiVar != null) {
                    yiVar.U1(qiVar);
                }
            } else if (intValue == 3) {
                if (!yiVar.Q1 && yiVar.c1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(yiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                yiVar.E1(true);
            } else if (intValue == 4) {
                if (!yiVar.N1 && yiVar.c1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(yiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                yiVar.H1(true);
            } else if (intValue == 5) {
                if (!yiVar.T1 && yiVar.c1()) {
                    return;
                }
                if (yiVar.T1 && yiVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(yiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                yiVar.G1();
            } else if (intValue == 6) {
                if ((!yiVar.T1 && yiVar.c1()) || !AndroidUtilities.isMapsInstalled(n2Var)) {
                    return;
                }
                if (yiVar.T1) {
                    if (yiVar.o0 == null) {
                        xl xlVar = new xl(yiVar, yiVar.getContext(), e6Var, (yiVar.H || yiVar.U1) ? false : true);
                        yiVar.o0 = xlVar;
                        qiVarArr[5] = xlVar;
                        sl slVar = yiVar.w2;
                        if (slVar != null) {
                            xlVar.setDelegate(slVar);
                        } else {
                            xlVar.setDelegate(new gh(yiVar, 9));
                        }
                    }
                    yiVar.U1(yiVar.o0);
                } else {
                    mo moVar2 = new mo(6, yiVar.getContext(), e6Var, yiVar);
                    yiVar.T = moVar2;
                    yiVar.U1(moVar2);
                }
            } else if (intValue == 9) {
                if (!yiVar.R1 && yiVar.c1()) {
                    return;
                }
                if (yiVar.R1) {
                    yiVar.W1(true, null);
                } else {
                    mo moVar3 = new mo(9, yiVar.getContext(), e6Var, yiVar);
                    yiVar.T = moVar3;
                    yiVar.U1(moVar3);
                }
            } else if (intValue == 11) {
                if (yiVar.s0 == null) {
                    hg.j0 j0Var = new hg.j0(yiVar.getContext(), yiVar.resourcesProvider, yiVar);
                    yiVar.s0 = j0Var;
                    qiVarArr[7] = j0Var;
                    j0Var.setupBlurredSearchField(yiVar.J2);
                }
                yiVar.U1(yiVar.s0);
            } else if (intValue == 12) {
                if (!yiVar.S1 && yiVar.c1()) {
                    return;
                }
                if (yiVar.S1) {
                    if (yiVar.n0 == null) {
                        lo loVar = new lo(yiVar, yiVar.getContext(), true, e6Var, null);
                        yiVar.n0 = loVar;
                        qiVarArr[1] = loVar;
                        loVar.setDelegate(new gh(yiVar, 10));
                    }
                    yiVar.U1(yiVar.n0);
                } else {
                    mo moVar4 = new mo(9, yiVar.getContext(), e6Var, yiVar);
                    yiVar.T = moVar4;
                    yiVar.U1(moVar4);
                }
            } else if (intValue == 13) {
                if (yiVar.u0 == null) {
                    tk tkVar = new tk(yiVar, yiVar.getContext(), e6Var, true);
                    yiVar.u0 = tkVar;
                    qiVarArr[8] = tkVar;
                    tkVar.setDelegate(yiVar.d2);
                }
                yiVar.U1(yiVar.u0);
            } else if (intValue == 14) {
                if (yiVar.t0 == null) {
                    tk tkVar2 = new tk(yiVar, yiVar.getContext(), e6Var, false);
                    yiVar.t0 = tkVar2;
                    qiVarArr[9] = tkVar2;
                    tkVar2.setDelegate(yiVar.d2);
                }
                yiVar.U1(yiVar.t0);
            } else if (intValue == 16) {
                if (yiVar.v0 == null) {
                    ii.r rVar = new ii.r(yiVar.M1, yiVar.getContext(), e6Var, yiVar);
                    yiVar.v0 = rVar;
                    qiVarArr[10] = rVar;
                }
                yiVar.U1(yiVar.v0);
            } else if (view.getTag() instanceof Integer) {
                yiVar.c2.I1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, yiVar.u1(), false, 0L);
            }
        } else if (view instanceof ri) {
            ri riVar = (ri) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = riVar.c;
            if (tL_attachMenuBot == null) {
                yiVar.c2.p1(riVar.b);
                yiVar.dismiss();
            } else if (tL_attachMenuBot.inactive) {
                oj1.a(yiVar.getContext(), new org.telegram.ui.pc(16, yiVar, riVar), null);
            } else {
                yiVar.R1(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int dp = AndroidUtilities.dp(70.0f);
        int i11 = left - dp;
        if (i11 < 0) {
            biVar.v0(i11, 0, null);
            return;
        }
        int i12 = right + dp;
        if (i12 > biVar.getMeasuredWidth()) {
            biVar.v0(i12 - biVar.getMeasuredWidth(), 0, null);
        }
    }

    public static /* synthetic */ void z(yi yiVar) {
        qi qiVar;
        hn hnVar;
        yiVar.w1 = null;
        qi qiVar2 = yiVar.B0;
        if (qiVar2 != yiVar.j0 && (qiVar = yiVar.C0) != (hnVar = yiVar.q0) && qiVar2 != qiVar && qiVar2 != hnVar) {
            yiVar.containerView.removeView(qiVar2);
        }
        yiVar.B0.setVisibility(8);
        yiVar.B0.t();
        yiVar.C0.I();
        yiVar.B0 = yiVar.C0;
        yiVar.C0 = null;
        int[] iArr = yiVar.e2;
        iArr[0] = iArr[1];
        yiVar.K1(yiVar.c0, false);
        yiVar.a2();
    }

    public final void A1() {
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.z0;
            if (i10 >= qiVarArr.length) {
                this.i2 = true;
                return;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.B();
            }
            i10++;
        }
    }

    public final void B1() {
        int i10 = 0;
        this.i2 = false;
        while (true) {
            qi[] qiVarArr = this.z0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.D();
            }
            i10++;
        }
        if (isShowing()) {
            this.c2.i0();
        }
        vi viVar = this.D1;
        if (viVar != null) {
            viVar.l();
        }
    }

    public final void C1() {
        MessageObject messageObject = this.K1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        int i10 = this.M1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.K1.getDialogId()) && (n2Var instanceof org.telegram.ui.zn)) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
            MessageSuggestionParams messageSuggestionParams = znVar.g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.K1.messageOwner.suggested_post);
            }
            if (!yh.m5.U(i10, messageSuggestionParams.amount)) {
                znVar.Xb(messageSuggestionParams);
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
            S1(n2Var);
            return;
        }
        if (this.K1 == null && (n2Var instanceof org.telegram.ui.zn)) {
            org.telegram.ui.zn znVar2 = (org.telegram.ui.zn) n2Var;
            if (znVar2.c()) {
                g5.L(getContext(), znVar2.a(), new gh(this, 12), this.resourcesProvider);
                return;
            }
        }
        qi qiVar = this.B0;
        if (qiVar == this.j0 || qiVar == this.q0) {
            J1(0, true, 0, u1(), this.Q0);
            return;
        }
        if (qiVar.K(0, true, 0, u1(), this.Q0)) {
            return;
        }
        this.D2 = true;
        dismiss();
    }

    public final void D1(int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (i10 == 3) {
            if (this.Q1 || !c1()) {
                Activity parentActivity = n2Var != null ? n2Var.getParentActivity() : null;
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
        if (i10 == 6 && AndroidUtilities.isMapsInstalled(n2Var)) {
            if (this.o0 == null) {
                xl xlVar = new xl(this, getContext(), this.resourcesProvider, (this.H || this.U1) ? false : true);
                this.o0 = xlVar;
                this.z0[5] = xlVar;
                sl slVar = this.w2;
                if (slVar != null) {
                    xlVar.setDelegate(slVar);
                } else if (n2Var instanceof org.telegram.ui.zn) {
                    xlVar.setDelegate(new gh(this, 16));
                }
            }
            U1(this.o0);
        }
    }

    public final void E1(boolean z10) {
        if (!this.Q1 && z10) {
            mo moVar = new mo(3, getContext(), this.resourcesProvider, this);
            this.T = moVar;
            U1(moVar);
        }
        int i10 = 1;
        if (this.l0 == null) {
            kj kjVar = new kj(getContext(), this.resourcesProvider, this);
            this.l0 = kjVar;
            this.z0[3] = kjVar;
            kjVar.setupBlurredSearchField(this.J2);
            this.l0.setDelegate(new gh(this, 13));
            if (this.H) {
                this.l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            TLRPC.Chat chat = ((org.telegram.ui.zn) n2Var).e;
            kj kjVar2 = this.l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                i10 = -1;
            }
            kjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            U1(this.l0);
        }
    }

    public final void F1() {
        if (this.r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.resourcesProvider;
            nj njVar = new nj(context, e6Var, this);
            njVar.r = AndroidUtilities.dp(80.0f);
            njVar.w = 3;
            ai.w0 w0Var = new ai.w0(njVar, context, e6Var, 11);
            njVar.n = w0Var;
            cb cbVar = new cb(njVar, context);
            njVar.v = cbVar;
            w0Var.setAdapter(cbVar);
            w0Var.setClipToPadding(false);
            w0Var.setItemAnimator(null);
            w0Var.setLayoutAnimation(null);
            w0Var.setVerticalScrollBarEnabled(false);
            w0Var.setGlowColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A5, njVar.a));
            njVar.addView(w0Var, w7.x5.d(-1.0f, -1));
            w0Var.setOnScrollListener(new ai.r(njVar, 17));
            bi.l lVar = new bi.l(njVar, njVar.r, 1);
            njVar.s = lVar;
            lVar.O = new ci.w1(njVar, 2);
            w0Var.setLayoutManager(lVar);
            this.r0 = njVar;
            njVar.setDelegate(new jb(this, 1));
        }
        U1(this.r0);
    }

    public final void G1() {
        if (!this.T1) {
            mo moVar = new mo(5, getContext(), this.resourcesProvider, this);
            this.T = moVar;
            U1(moVar);
        }
        if (this.k0 == null) {
            ck ckVar = new ck(getContext(), this.resourcesProvider, this);
            this.k0 = ckVar;
            this.z0[2] = ckVar;
            ckVar.setupBlurredSearchField(this.J2);
            this.k0.setDelegate(new ki(this));
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            TLRPC.Chat chat = ((org.telegram.ui.zn) n2Var).e;
            this.k0.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        U1(this.k0);
    }

    public final void H1(boolean z10) {
        if (!this.N1 && z10) {
            mo moVar = new mo(4, getContext(), this.resourcesProvider, this);
            this.T = moVar;
            U1(moVar);
        }
        boolean z11 = false;
        if (this.p0 == null) {
            sk skVar = new sk(this.N ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.p0 = skVar;
            this.z0[4] = skVar;
            skVar.setDelegate(new li(this));
        }
        int i10 = 1;
        if (this.H) {
            this.p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.f0;
            if (n2Var instanceof org.telegram.ui.zn) {
                TLRPC.Chat chat = ((org.telegram.ui.zn) n2Var).e;
                sk skVar2 = this.p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                    i10 = -1;
                }
                skVar2.setMaxSelectedFiles(i10);
            } else {
                this.p0.setMaxSelectedFiles(this.V1);
                sk skVar3 = this.p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                skVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        sk skVar4 = this.p0;
        skVar4.d0 = this.N;
        if (z10) {
            U1(skVar4);
        }
    }

    public final void I1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        a8 a8Var = this.a1;
        int i10 = 1;
        if (a8Var.n0) {
            a8Var.h(true);
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
            qi[] qiVarArr = this.z0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.p();
                this.containerView.removeView(qiVarArr[i10]);
                qiVarArr[i10] = null;
            }
            i10++;
        }
        X1(false, false);
        super.dismissInternal();
        if (this.x0) {
            this.x0 = false;
            this.y0 = 0.0f;
            org.telegram.ui.ActionBar.n2 n2Var = this.f0;
            if (n2Var == null || n2Var.getFragmentView() == null) {
                return;
            }
            View fragmentView = n2Var.getFragmentView();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(fragmentView);
        }
    }

    public final boolean J1(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        if (this.L1) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
            TLRPC.Chat chat = znVar.e;
            if (znVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(this.M1).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + znVar.a(), !z10).commit();
            }
        }
        if (d1(o1().getText())) {
            return true;
        }
        a1();
        if (this.h.f) {
            this.L1 = true;
            this.c2.I1(7, true, z10, i10, i11, j3, z11, false, 0L);
            return true;
        }
        long p12 = p1();
        qi qiVar = this.B0;
        return g5.a0(this.M1, p12, l1() + (qiVar != null ? qiVar.getSelectedItemsCount() : 1), new Utilities.Callback() { // from class: org.telegram.ui.Components.th
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                yi yiVar = yi.this;
                yiVar.L1 = true;
                yiVar.c2.I1(7, true, z10, i10, i11, j3, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void K1(boolean z10, boolean z11) {
        this.b.a(z10, z11);
        zu o12 = o1();
        this.c0 = z10;
        zu o13 = o1();
        final boolean z12 = this.G0.getTag() != null;
        qi qiVar = this.B0;
        final boolean z13 = this.c0 && (qiVar == this.j0 || qiVar == this.q0);
        ci.m6 m6Var = this.R0;
        hg.k kVar = this.F0;
        if (z11) {
            m6Var.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = m6Var.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            hs hsVar = hs.h;
            final int i10 = 0;
            duration.setInterpolator(hsVar).setUpdateListener(new hh(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.ih
                public final /* synthetic */ yi b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            yi yiVar = this.b;
                            if (!z13 || !z12) {
                                yiVar.R0.setVisibility(8);
                            }
                            yiVar.f2();
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
            kVar.setVisibility(0);
            ViewPropertyAnimator interpolator = kVar.animate().translationY((z13 || !z12) ? kVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(hsVar);
            final int i11 = 1;
            interpolator.setUpdateListener(new hh(this, i11)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.ih
                public final /* synthetic */ yi b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            yi yiVar = this.b;
                            if (!z13 || !z12) {
                                yiVar.R0.setVisibility(8);
                            }
                            yiVar.f2();
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
            m6Var.setVisibility((z13 && z12) ? 0 : 8);
            m6Var.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            f2();
            kVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            kVar.setTranslationY((z13 || !z12) ? kVar.getMeasuredHeight() : 0.0f);
            kVar.setVisibility((z13 || !z12) ? 8 : 0);
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
        AndroidUtilities.runOnUIThread(new jh(this, 0));
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
        gl glVar = this.w0;
        if (glVar != null) {
            glVar.setSendTransitionProgress(f7);
        }
        org.telegram.ui.ActionBar.e3 e3Var = this.backDrawable;
        if (this.dimBehind) {
            i10 = Math.round((1.0f - f7) * this.dimBehindAlpha);
        } else {
            i10 = 0;
        }
        e3Var.setAlpha(i10);
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
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
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
            yi yiVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.g1 = (yiVar.T0 == 0 || yiVar.F) ? false : true;
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
            org.telegram.ui.ActionBar.n2 n2Var = this.f0;
            if ((n2Var instanceof org.telegram.ui.zn) && !((org.telegram.ui.zn) n2Var).v()) {
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
                hs hsVar = hs.h;
                scaleY.setInterpolator(hsVar).setDuration(420L).withEndAction(new sh(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(hsVar).setDuration(420L).withEndAction(new sh(this, z11, 2)).start();
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1(long j3, String str, boolean z10, boolean z11) {
        boolean z12;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.A0;
        int i10 = 1;
        if (longSparseArray.get(j3) != null && Objects.equals(str, ((ei.p4) longSparseArray.get(j3)).getStartCommand())) {
            ei.p4 p4Var = (ei.p4) longSparseArray.get(j3);
            if (p4Var.H) {
                p4Var.H = false;
            }
            z12 = true;
            if (longSparseArray.get(j3) != null) {
                ((ei.p4) longSparseArray.get(j3)).J.setSwipeOffsetAnimationDisallowed(z12);
                V1((qi) longSparseArray.get(j3), -j3, z11);
                if (z10) {
                    ei.p4 p4Var2 = (ei.p4) longSparseArray.get(j3);
                    TLRPC.User user = MessagesController.getInstance(p4Var2.F).getUser(Long.valueOf(p4Var2.v));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(p4Var2.F).getAttachMenuBots().bots;
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
                        if (tL_attachMenuBot.bot_id == p4Var2.v) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z13 = tL_attachMenuBot.show_in_side_menu;
                    AndroidUtilities.runOnUIThread(new ci.y8(22, p4Var2, (z13 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name) : z13 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.resourcesProvider;
            ei.p4 p4Var3 = new ei.p4(context, e6Var, this);
            int i12 = 2;
            p4Var3.U = new ei.g4(p4Var3, i12);
            org.telegram.ui.ActionBar.v0 a2 = p4Var3.b.a1.o().a(0, R.drawable.ic_ab_other);
            p4Var3.K = a2;
            a2.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
            org.telegram.ui.ActionBar.f1 e7 = a2.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
            p4Var3.L = e7;
            e7.setVisibility(8);
            a2.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
            org.telegram.ui.ActionBar.f1 e10 = a2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            p4Var3.M = e10;
            e10.setVisibility(8);
            a2.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
            a2.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
            a2.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
            ei.b3 b3Var = new ei.b3(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, p4Var3.a), 1, context, p4Var3, e6Var);
            p4Var3.n = b3Var;
            ei.a3 a3Var = new ei.a3(p4Var3, context, i10);
            p4Var3.J = a3Var;
            z12 = true;
            a3Var.addView(b3Var, w7.x5.d(-1.0f, -1));
            a3Var.setScrollListener(new ei.g4(p4Var3, 3));
            a3Var.setScrollEndListener(new ei.g4(p4Var3, 4));
            a3Var.setDelegate(new ei.i4(p4Var3));
            a3Var.setIsKeyboardVisible(new ei.i4(p4Var3));
            p4Var3.addView(a3Var, w7.x5.d(-1.0f, -1));
            ei.j4 j4Var = new ei.j4(context, e6Var);
            p4Var3.I = j4Var;
            p4Var3.addView(j4Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 84.0f, -1, 80));
            b3Var.setWebViewProgressListener(new ci.c5(p4Var3, i12));
            NotificationCenter.getGlobalInstance().addObserver(p4Var3, NotificationCenter.didSetNewTheme);
            longSparseArray.put(j3, p4Var3);
            ((ei.p4) longSparseArray.get(j3)).setDelegate(new ei(this, p4Var3, str, j3));
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
            MessageObject replyingMessageObject = znVar.Y.getReplyingMessageObject();
            ei.p4 p4Var4 = (ei.p4) longSparseArray.get(j3);
            long a10 = znVar.a();
            int i13 = replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0;
            long S8 = znVar.S8();
            ei.b3 b3Var2 = p4Var4.n;
            int i14 = this.M1;
            p4Var4.F = i14;
            p4Var4.w = a10;
            p4Var4.v = j3;
            p4Var4.y = i13;
            p4Var4.E = S8;
            p4Var4.G = str;
            org.telegram.ui.ActionBar.f1 f1Var = p4Var4.M;
            if (f1Var != null) {
                if (MediaDataController.getInstance(i14).canCreateAttachedMenuBotShortcut(j3)) {
                    f1Var.setVisibility(0);
                } else {
                    f1Var.setVisibility(8);
                }
            }
            b3Var2.setBotUser(MessagesController.getInstance(i14).getUser(Long.valueOf(j3)));
            b3Var2.s(i14, j3);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(i14).getInputPeer(a10);
            tL_messages_requestWebView.bot = MessagesController.getInstance(i14).getInputUser(j3);
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
            JSONObject q6 = ei.k3.q(p4Var4.a, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i14).sendRequest(tL_messages_requestWebView, new ai.j8(p4Var4, i14, i12));
            NotificationCenter.getInstance(i14).addObserver(p4Var4, NotificationCenter.webViewResultSent);
            if (longSparseArray.get(j3) != null) {
            }
        }
        z12 = true;
        if (longSparseArray.get(j3) != null) {
        }
    }

    public final void S1(org.telegram.ui.ActionBar.n2 n2Var) {
        if ((n2Var instanceof org.telegram.ui.zn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.zn) n2Var).e)) {
            new ad(this.u1, this.resourcesProvider).f(MessagesController.getInstance(this.M1).captionLengthLimitPremium, new ea(9, this, n2Var)).j();
        }
    }

    public final boolean T1(boolean z10, boolean z11) {
        float f7;
        int i10;
        qi qiVar;
        a8 a8Var;
        this.c.a(z10, true);
        ai aiVar = this.G0;
        if (z10 == (aiVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.P0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        aiVar.setTag(z10 ? 1 : null);
        di diVar = this.H0;
        if (diVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(diVar.getEditText());
        }
        diVar.k(true);
        this.S0.k(true);
        ai aiVar2 = this.A1;
        ai aiVar3 = this.K0;
        if (z10) {
            if (!this.N) {
                aiVar.setVisibility(0);
            }
            aiVar3.setVisibility(0);
        } else if (this.V0) {
            aiVar2.setVisibility(0);
        }
        qi qiVar2 = this.B0;
        boolean z12 = (qiVar2 == this.j0 || qiVar2 == this.q0) && this.c0;
        a8 a8Var2 = this.a1;
        ci.m6 m6Var = this.R0;
        hg.k kVar = this.F0;
        ii iiVar = this.L0;
        if (z11) {
            this.P0 = new AnimatorSet();
            if (z12) {
                m6Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(aiVar, (Property<ai, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<hg.k, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                a8Var = a8Var2;
            } else {
                kVar.setVisibility(0);
                a8Var = a8Var2;
                arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<hg.k, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(m6Var, (Property<ci.m6, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(aiVar3, (Property<ai, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(aiVar3, (Property<ai, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(aiVar3, (Property<ai, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(iiVar, (Property<ii, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(iiVar, (Property<ii, Float>) property3, z10 ? 1.0f : 0.2f));
            if (a8Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(aiVar, (Property<ai, Float>) View.TRANSLATION_Y, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.V0) {
                arrayList.add(ObjectAnimator.ofFloat(aiVar2, (Property<ai, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(aiVar2, (Property<ai, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new hh(this, 5));
                arrayList.add(ofFloat);
            }
            this.P0.playTogether(arrayList);
            this.P0.setInterpolator(new DecelerateInterpolator());
            this.P0.setDuration(180L);
            this.P0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.P0.start();
            i10 = 0;
        } else {
            aiVar.setAlpha(z10 ? 1.0f : 0.0f);
            kVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            if (!z10 || z12) {
                f7 = 0.0f;
                i10 = 0;
            } else {
                i10 = 0;
                kVar.setVisibility(0);
                f7 = 0.0f;
                kVar.setTranslationY(0.0f);
            }
            aiVar3.setScaleX(z10 ? 1.0f : 0.2f);
            aiVar3.setScaleY(z10 ? 1.0f : 0.2f);
            aiVar3.setAlpha(z10 ? 1.0f : f7);
            m6Var.setVisibility((z10 && z12) ? i10 : 8);
            m6Var.setAlpha((z10 && z12) ? 1.0f : f7);
            iiVar.setScaleX(z10 ? 1.0f : 0.2f);
            iiVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (a8Var2.getTag() != null) {
                aiVar.setTranslationY(z10 ? f7 : AndroidUtilities.dp(48.0f));
            } else if (this.V0 && ((qiVar = this.B0) == null || qiVar.L())) {
                aiVar2.setTranslationY(z10 ? AndroidUtilities.dp(84.0f) : f7);
            }
            if (!z10) {
                aiVar.setVisibility(4);
                aiVar3.setVisibility(4);
            }
            if (z12) {
                f2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.B0.getSelectedItemsCount());
        }
        iiVar.g(i10, z11);
        iiVar.i(l1() + this.B0.getSelectedItemsCount(), this.K1 != null ? 0L : MessagesController.getInstance(this.M1).getSendPaidMessagesStars(p1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) diVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), iiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            diVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void U1(qi qiVar) {
        long j3 = this.Z0;
        mo moVar = this.T;
        if (qiVar == moVar) {
            j3 = moVar.s;
        } else if (qiVar == this.j0) {
            j3 = 1;
        } else if (qiVar == this.l0) {
            j3 = 3;
        } else if (qiVar == this.p0) {
            j3 = 4;
        } else if (qiVar == this.k0) {
            j3 = 5;
        } else if (qiVar == this.o0) {
            j3 = 6;
        } else if (qiVar == this.m0) {
            j3 = 9;
        } else if (qiVar == this.r0) {
            j3 = 10;
        } else if (qiVar == this.s0) {
            j3 = 11;
        } else if (qiVar == this.n0) {
            j3 = 12;
        } else if (qiVar == this.t0) {
            j3 = 14;
        } else if (qiVar == this.u0) {
            j3 = 13;
        } else if (qiVar == this.v0) {
            j3 = 16;
        } else if (qiVar == this.w0) {
            j3 = 17;
        }
        V1(qiVar, j3, true);
    }

    public final void V1(qi qiVar, long j3, boolean z10) {
        int i10;
        um umVar;
        um umVar2;
        int i11;
        Float f7;
        int i12;
        Float valueOf = Float.valueOf(0.0f);
        if (this.w1 == null && this.P0 == null) {
            qi qiVar2 = this.B0;
            if (qiVar2 == qiVar) {
                qiVar2.J();
                return;
            }
            if (qiVar == this.n0 && !UserConfig.getInstance(this.M1).isPremium()) {
                new rg.y0(this.f0, 39, false).show();
                return;
            }
            this.f.a(j3 == 1, z10);
            this.n.i(Long.valueOf(j3), z10);
            this.G1 = false;
            this.E1 = false;
            this.I1 = 0.0f;
            this.H1.setVisibility(8);
            RadialProgressView radialProgressView = this.F1;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            ai aiVar = this.A1;
            aiVar.setAlpha(1.0f);
            aiVar.setTranslationY(this.I1);
            int i13 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.A0;
                if (i13 >= longSparseArray.size()) {
                    break;
                }
                ((ei.p4) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                i13++;
            }
            this.Z0 = j3;
            bi biVar = this.B1;
            int childCount = biVar.getChildCount();
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = biVar.getChildAt(i14);
                if (childAt instanceof si) {
                    si siVar = (si) childAt;
                    i12 = childCount;
                    f7 = valueOf;
                    siVar.a.e(((long) siVar.b) == siVar.c.Z0, true);
                } else {
                    f7 = valueOf;
                    i12 = childCount;
                    if (childAt instanceof ri) {
                        ((ri) childAt).a(true);
                    }
                }
                i14++;
                childCount = i12;
                valueOf = f7;
            }
            Float f10 = valueOf;
            int firstOffset = (this.B0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.e2[0];
            this.C0 = qiVar;
            boolean e7 = qiVar.e();
            jh.f fVar = this.y1;
            if (fVar != null) {
                fVar.setFadeHeightBottom(e7 ? 0 : AndroidUtilities.dp(48.0f));
            }
            int i15 = 4;
            ci ciVar = this.z1;
            if (ciVar != null) {
                ciVar.setVisibility(e7 ? 4 : 0);
            }
            int i16 = this.C0.i() != 0 ? 0 : 4;
            a8 a8Var = this.a1;
            a8Var.setVisibility(i16);
            if (a8Var.n0) {
                a8Var.h(true);
            }
            this.B0.u();
            qi qiVar3 = this.C0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if (qiVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.C0.G(this.B0);
            this.C0.setVisibility(0);
            if (qiVar.getParent() != null) {
                this.containerView.removeView(this.C0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.B0);
            ViewParent parent = this.C0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                qi qiVar4 = this.C0;
                if (qiVar4 != this.o0) {
                    indexOfChild++;
                }
                i10 = 0;
                viewGroup.addView(qiVar4, indexOfChild, w7.x5.d(-1.0f, -1));
            } else {
                i10 = 0;
            }
            jh jhVar = new jh(this, i15);
            qi qiVar5 = this.B0;
            boolean z11 = qiVar5 instanceof hn;
            mi miVar = this.e0;
            if (z11 || (this.C0 instanceof hn)) {
                int max = Math.max(this.C0.getWidth(), this.B0.getWidth());
                qi qiVar6 = this.C0;
                if (qiVar6 instanceof hn) {
                    qiVar6.setTranslationX(max);
                    qi qiVar7 = this.B0;
                    if ((qiVar7 instanceof ChatAttachAlertPhotoLayout) && (umVar2 = ((ChatAttachAlertPhotoLayout) qiVar7).P) != null) {
                        umVar2.setVisibility(4);
                    }
                } else {
                    this.B0.setTranslationX(-max);
                    qi qiVar8 = this.C0;
                    if (qiVar8 == chatAttachAlertPhotoLayout && (umVar = ((ChatAttachAlertPhotoLayout) qiVar8).P) != null) {
                        umVar.setVisibility(0);
                    }
                }
                this.C0.setAlpha(1.0f);
                this.B0.setAlpha(1.0f);
                if (z10) {
                    qi qiVar9 = this.B0;
                    miVar.getClass();
                    miVar.a(qiVar9, f10);
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this, qiVar, jhVar, 16));
                } else {
                    boolean z12 = this.C0.getCurrentItemTop() <= qiVar.getButtonsHideOffset();
                    this.B0.v(1.0f);
                    this.C0.v(1.0f);
                    this.B0.l(this.o2);
                    this.C0.l(this.o2);
                    this.containerView.invalidate();
                    qi qiVar10 = this.B0;
                    Float valueOf2 = Float.valueOf(1.0f);
                    miVar.getClass();
                    miVar.a(qiVar10, valueOf2);
                    a8Var.setTag(z12 ? 1 : null);
                    jhVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.C0.setAlpha(0.0f);
                this.C0.setTranslationY(AndroidUtilities.dp(78.0f));
                qi qiVar11 = this.B0;
                Property property = View.TRANSLATION_Y;
                float[] fArr = new float[1];
                fArr[i10] = AndroidUtilities.dp(78.0f) + firstOffset;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qiVar11, (Property<qi, Float>) property, fArr);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B0, miVar, 0.0f, 1.0f);
                Property property2 = View.ALPHA;
                float[] fArr2 = new float[2];
                fArr2[i10] = a8Var.getAlpha();
                fArr2[1] = 0.0f;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a8Var, (Property<a8, Float>) property2, fArr2);
                Animator[] animatorArr = new Animator[3];
                animatorArr[i10] = ofFloat;
                animatorArr[1] = ofFloat2;
                animatorArr[2] = ofFloat3;
                animatorSet.playTogether(animatorArr);
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(hs.f);
                animatorSet.addListener(new ji(this, firstOffset, jhVar, i10));
                this.w1 = animatorSet;
                qi qiVar12 = this.B0;
                miVar.getClass();
                miVar.a(qiVar12, f10);
                animatorSet.start();
            } else {
                qiVar5.setAlpha(0.0f);
                jhVar.run();
                e2(i10);
                this.containerView.invalidate();
            }
            if (!this.p2 || (qiVar instanceof ei.p4)) {
                i11 = 0;
            } else {
                i11 = 0;
                this.p2 = false;
                a8Var.e();
                a8Var.invalidate();
                x1();
            }
            a8Var.setForcedMenuWidth((j3 == 1 || j3 == 6 || j3 == 17 || (qiVar instanceof ei.p4)) ? AndroidUtilities.dp(46.0f) : j3 == 4 ? AndroidUtilities.dp(84.0f) : i11);
        }
    }

    public final void W1(boolean z10, Boolean bool) {
        yi yiVar;
        if (this.m0 == null) {
            yiVar = this;
            lo loVar = new lo(yiVar, getContext(), false, this.resourcesProvider, bool);
            yiVar.m0 = loVar;
            yiVar.z0[1] = loVar;
            loVar.setDelegate(new gh(this, 15));
        } else {
            yiVar = this;
        }
        V1(yiVar.m0, 9L, z10);
    }

    public final void X1(boolean z10, boolean z11) {
        qi qiVar;
        this.d.a(z10, z11);
        a8 a8Var = this.a1;
        if (!(z10 && a8Var.getTag() == null) && (z10 || a8Var.getTag() == null)) {
            return;
        }
        a8Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet = this.b1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.b1 = null;
        }
        boolean z12 = (this.F || this.W0 || (this.T0 == 0 && this.t1) || this.B0 != this.j0 || (!this.O1 && !this.P1)) ? false : true;
        if (this.B0 == this.T) {
            z12 = false;
        }
        ai aiVar = this.A1;
        org.telegram.ui.ActionBar.v0 v0Var = this.d1;
        if (z10) {
            if (z12) {
                v0Var.setVisibility(0);
                v0Var.setClickable(true);
            }
        } else if (this.V0 && this.G0.getTag() == null) {
            aiVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var != null) {
            if (z10) {
                AndroidUtilities.setLightStatusBar(this, i0.a.f(getThemedColor(this.k2 ? org.telegram.ui.ActionBar.i6.tg : org.telegram.ui.ActionBar.i6.h5)) > 0.699999988079071d);
            } else {
                AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
            }
        }
        int i10 = 4;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.b1 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z10 ? 1.0f : 0.0f) - a8Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a8Var, (Property<a8, Float>) property, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new hh(this, i10));
            arrayList.add(ofFloat);
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.b1.playTogether(arrayList);
            this.b1.addListener(new fa(2, this, z10));
            this.b1.setInterpolator(hs.h);
            this.b1.setDuration(380L);
            this.b1.start();
            return;
        }
        if (z10 && this.V0 && ((qiVar = this.B0) == null || qiVar.L())) {
            aiVar.setVisibility(4);
        }
        a8Var.setAlpha(z10 ? 1.0f : 0.0f);
        if (z12) {
            v0Var.setAlpha(z10 ? 1.0f : 0.0f);
            v0Var.setScaleX(z10 ? 1.0f : 0.6f);
            v0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = this.h1;
        if (v0Var2 != null) {
            v0Var2.setVisibility(4);
        }
        if (this.T0 == 0 && this.t1) {
            return;
        }
        v0Var.setVisibility(4);
    }

    public final void Y1() {
        float alpha;
        int[] iArr = this.J0;
        di diVar = this.H0;
        diVar.getLocationOnScreen(iArr);
        if (this.E2 != null) {
            qi qiVar = this.B0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if ((qiVar == chatAttachAlertPhotoLayout || qiVar == this.q0) && this.c0) {
                ci.m6 m6Var = this.R0;
                alpha = (m6Var.getAlpha() * m6Var.getMeasuredHeight()) + (m6Var.getY() - this.E2.getTop());
            } else {
                alpha = -diVar.getHeight();
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
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.w1 != null) {
            return;
        }
        int selectedItemsCount = this.B0.getSelectedItemsCount();
        ii iiVar = this.L0;
        if (selectedItemsCount == 0) {
            iiVar.g(0, i10 != 0);
            T1(false, i10 != 0);
        } else {
            if (T1(true, i10 != 0) || i10 == 0) {
                iiVar.g(selectedItemsCount, i10 != 0);
                iiVar.c();
            } else {
                iiVar.g(selectedItemsCount, true);
                iiVar.c();
            }
        }
        this.B0.E(selectedItemsCount);
        f1(i10 != 0);
        if (this.B0 == this.j0 && ((((z10 = (n2Var = this.f0) instanceof org.telegram.ui.zn)) || this.T0 != 0 || this.W0) && ((selectedItemsCount == 0 && this.t1) || ((selectedItemsCount != 0 || this.T0 != 0 || this.W0) && !this.t1)))) {
            this.t1 = (selectedItemsCount == 0 && this.T0 == 0 && !this.W0) ? false : true;
            AnimatorSet animatorSet = this.c1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.c1 = null;
            }
            int i11 = this.T0;
            a8 a8Var = this.a1;
            org.telegram.ui.ActionBar.v0 v0Var = this.h1;
            if (i11 != 0 && v0Var != null && a8Var.getTag() != null && z10) {
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
                if (!ChatObject.isChannel(znVar.e) || (tL_chatBannedRights = znVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.t1;
                    ai aiVar = this.l1;
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.d1;
                    if (!z12) {
                        if (this.T0 == 0 && !this.W0) {
                            v0Var2.setVisibility(0);
                            v0Var2.setClickable(true);
                        }
                        aiVar.setVisibility(0);
                    } else if (a8Var.getTag() != null && v0Var != null) {
                        v0Var.setVisibility(0);
                    }
                    if (i10 != 0) {
                        if (a8Var.getTag() == null && this.T0 == 0 && !this.W0) {
                            v0Var2.setAlpha(this.t1 ? 1.0f : 0.0f);
                            v0Var2.setScaleX(this.t1 ? 1.0f : 0.6f);
                            v0Var2.setScaleY(this.t1 ? 1.0f : 0.6f);
                        }
                        aiVar.setAlpha(this.t1 ? 1.0f : 0.0f);
                        if (z11) {
                            v0Var.setAlpha(this.t1 ? 0.0f : 1.0f);
                        }
                        if (this.t1 && v0Var != null) {
                            v0Var.setVisibility(4);
                        }
                    } else {
                        this.c1 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (a8Var.getTag() == null && this.T0 == 0 && !this.W0) {
                            arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, this.t1 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_X, this.t1 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_Y, this.t1 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(aiVar, (Property<ai, Float>) property, this.t1 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property, this.t1 ? 0.0f : 1.0f));
                        }
                        this.c1.playTogether(arrayList);
                        this.c1.addListener(new t8(this, 6));
                        this.c1.setDuration(180L);
                        this.c1.start();
                    }
                }
            }
            z11 = false;
            z12 = this.t1;
            ai aiVar2 = this.l1;
            org.telegram.ui.ActionBar.v0 v0Var22 = this.d1;
            if (!z12) {
            }
            if (i10 != 0) {
            }
        }
        c2(i10 != 0);
        MessageObject messageObject = this.K1;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.M1).getSendPaidMessagesStars(p1()) : 0L;
        qi qiVar = this.B0;
        iiVar.i(l1() + (qiVar != null ? qiVar.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        di diVar = this.H0;
        if (diVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) diVar.getLayoutParams();
            int max = Math.max(AndroidUtilities.dp(48.0f), iiVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                diVar.setLayoutParams(marginLayoutParams);
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
        qi qiVar = this.B0;
        boolean h = qiVar == null ? false : qiVar.h();
        bi.o oVar = this.i1;
        oVar.setEnabled(h);
        qi qiVar2 = this.B0;
        if (qiVar2 != null) {
            f7 = ((qiVar2.h() ? 1.0f : 0.5f) * (this.C0 == null ? 1.0f : this.d0)) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        qi qiVar3 = this.C0;
        if (qiVar3 != null) {
            f7 = com.google.android.gms.internal.vision.e2.y(1.0f, this.d0, qiVar3.h() ? 1.0f : 0.5f, f7);
        }
        this.j1 = f7;
        if (oVar != null) {
            float f10 = f7 * this.k1;
            oVar.setAlpha(f10);
            oVar.setVisibility(f10 <= 0.0f ? 4 : 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1() {
        ah.h hVar;
        boolean z10;
        if (Build.VERSION.SDK_INT < 31 || (hVar = this.F2) == null) {
            return;
        }
        ai aiVar = this.A1;
        ViewGroup viewGroup = this.containerView;
        RectF rectF = this.O2;
        hh.j.c(aiVar, viewGroup, rectF);
        float measuredWidth = this.containerView.getMeasuredWidth();
        float measuredHeight = this.a1.getMeasuredHeight();
        RectF rectF2 = this.N2;
        rectF2.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        rectF2.inset(0.0f, -AndroidUtilities.dp(48.0f));
        rectF.set(0.0f, this.containerView.getMeasuredHeight() - (AndroidUtilities.dp(180.0f) + Math.max(AndroidUtilities.navigationBarHeight, q1())), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        qi qiVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (qiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null) {
            km kmVar = chatAttachAlertPhotoLayout.E;
            if (kmVar.getFastScroll() != null) {
                xl0 fastScroll = kmVar.getFastScroll();
                ch.d dVar = fastScroll.e0;
                RectF rectF3 = this.P2;
                if (dVar != null || fastScroll.f0 != null) {
                    rectF3.set(fastScroll.f0.getBounds());
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(fastScroll.e0.getBounds());
                    rectF3.union(rectF4);
                }
                xl0 fastScroll2 = kmVar.getFastScroll();
                ViewGroup viewGroup2 = this.containerView;
                RectF rectF5 = AndroidUtilities.rectTmp;
                hh.j.c(fastScroll2, viewGroup2, rectF5);
                rectF3.offset(rectF5.left, rectF5.top);
                rectF3.inset(-AndroidUtilities.dp(48.0f), -AndroidUtilities.dp(48.0f));
                rectF3.left = Math.max(0.0f, rectF3.left);
                rectF3.right = Math.min(this.containerView.getMeasuredWidth(), rectF3.right);
                z10 = true;
                int i10 = !z10 ? 3 : 2;
                ArrayList arrayList = this.M2;
                ArrayList arrayList2 = this.Q2;
                hVar.g(yf.e0.a(arrayList, i10, arrayList2), arrayList2);
                hVar.e(this.L2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
            }
        }
        z10 = false;
        if (!z10) {
        }
        ArrayList arrayList3 = this.M2;
        ArrayList arrayList22 = this.Q2;
        hVar.g(yf.e0.a(arrayList3, i10, arrayList22), arrayList22);
        hVar.e(this.L2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void b2(qi qiVar, int i10) {
        if (qiVar == null) {
            return;
        }
        ah.h hVar = this.F2;
        if (hVar != null && Build.VERSION.SDK_INT >= 31) {
            hVar.f(0.0f, i10);
            b1();
        }
        int currentItemTop = qiVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = qiVar == this.B0 && currentItemTop <= qiVar.getButtonsHideOffset();
        this.R = z11;
        if (qiVar == this.B0) {
            X1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qiVar.getLayoutParams();
        int D = org.telegram.messenger.bi.D(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        qi qiVar2 = this.B0;
        int i11 = qiVar2 == qiVar ? 0 : 1;
        if ((qiVar2 instanceof hn) || (this.C0 instanceof hn)) {
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        return (n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).N6();
    }

    public final void c2(boolean z10) {
        ci.u uVar;
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
        org.telegram.ui.ActionBar.v0 v0Var = this.f1;
        if (z10 && this.t1) {
            v0Var.setVisibility(0);
            v0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(hs.h).withEndAction(new sh(this, z11, 0)).start();
        } else {
            v0Var.setVisibility(z11 ? 0 : 8);
            v0Var.setAlpha(z11 ? 1.0f : 0.0f);
            v0Var.setScaleX(z11 ? 1.0f : 0.6f);
            v0Var.setScaleY(z11 ? 1.0f : 0.6f);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        return this.B0.b();
    }

    @Override // org.telegram.ui.ActionBar.f3
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (!(n2Var instanceof org.telegram.ui.zn)) {
            return false;
        }
        return ChatActivityEnterView.F(this.M1, ((org.telegram.ui.zn) n2Var).a(), n2Var, charSequence);
    }

    public final void d2(boolean z10) {
        qi qiVar = this.j0;
        if (!z10) {
            U1(qiVar);
            return;
        }
        if (this.M) {
            if (this.q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.r;
                if (e6Var == null) {
                    e6Var = this.resourcesProvider;
                }
                hn hnVar = new hn(context, e6Var, this);
                hnVar.y = 0.0f;
                hnVar.E = 0.0f;
                hnVar.F = 0.0f;
                hnVar.G = 0.0f;
                hnVar.H = 0.0f;
                hnVar.I = 0.0f;
                hnVar.J = null;
                hnVar.K = false;
                hnVar.M = 0.0f;
                hnVar.Q = false;
                hnVar.S = false;
                Point point = AndroidUtilities.displaySize;
                hnVar.T = point.y > point.x;
                hnVar.n = e6Var;
                hnVar.f = true;
                hnVar.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z o9 = hnVar.b.a1.o();
                TextView textView = new TextView(context);
                hnVar.x = textView;
                org.telegram.ui.ActionBar.e6 e6Var2 = hnVar.a;
                pm pmVar = new pm(hnVar, context, o9, e6Var2, 1);
                hnVar.b.a1.addView(pmVar, 0, w7.x5.a(-1.0f, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f, -2, 51));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, e6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                pmVar.addView(textView, w7.x5.a(-2.0f, 16.0f, 0.0f, 0.0f, 0.0f, -2, 16));
                ai.w0 w0Var = new ai.w0(hnVar, context, e6Var2, 14);
                hnVar.r = w0Var;
                w0Var.setAdapter(new org.telegram.ui.v7(hnVar, 3));
                s4.d0 d0Var = new s4.d0(1, false);
                hnVar.s = d0Var;
                w0Var.setLayoutManager(d0Var);
                w0Var.setClipChildren(false);
                w0Var.setClipToPadding(false);
                w0Var.setOverScrollMode(2);
                w0Var.setVerticalScrollBarEnabled(false);
                gn gnVar = new gn(hnVar, context);
                hnVar.v = gnVar;
                gnVar.setClipToPadding(true);
                gnVar.setClipChildren(true);
                hnVar.addView(w0Var, w7.x5.d(-1.0f, -1));
                hnVar.P = hnVar.b.j0;
                gnVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hnVar.P;
                gnVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                gnVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                gnVar.c();
                UndoView undoView = new UndoView(context, null, false, hnVar.b.r);
                hnVar.w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                hnVar.addView(undoView, w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 52.0f, -1, 83));
                hnVar.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.q0 = hnVar;
                hnVar.bringToFront();
            }
            qi qiVar2 = this.B0;
            hn hnVar2 = this.q0;
            if (qiVar2 != hnVar2) {
                qiVar = hnVar2;
            }
            U1(qiVar);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.reloadInlineHints && i10 != NotificationCenter.attachMenuBotsDidLoad && i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.K = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
            }
        } else {
            vi viVar = this.D1;
            if (viVar != null) {
                viVar.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final void dismiss(boolean z10) {
        if (z10) {
            this.D2 = z10;
        }
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        wi wiVar = this.c2;
        if (wiVar != null) {
            wiVar.f0(new jh(this, 3));
        } else {
            I1();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.B0.r(i10);
    }

    public final void e1() {
        bi biVar = this.B1;
        if (biVar == null) {
            return;
        }
        int childCount = biVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            biVar.getChildAt(i10);
        }
        boolean z10 = this.k2;
        this.m1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5));
        this.r1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5));
        this.i1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Sh));
        int themedColor = getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5);
        org.telegram.ui.ActionBar.v0 v0Var = this.d1;
        v0Var.setIconColor(themedColor);
        org.telegram.ui.ActionBar.i6.x1(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.ig : org.telegram.ui.ActionBar.i6.I5), v0Var.getBackground());
        int i11 = org.telegram.ui.ActionBar.i6.E8;
        v0Var.G(getThemedColor(i11), false);
        v0Var.G(getThemedColor(i11), true);
        v0Var.B(getThemedColor(org.telegram.ui.ActionBar.i6.G8));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f1;
        if (v0Var2 != null) {
            v0Var2.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5));
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.h1;
        if (v0Var3 != null) {
            v0Var3.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5));
            org.telegram.ui.ActionBar.i6.x1(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.ig : org.telegram.ui.ActionBar.i6.I5), v0Var3.getBackground());
        }
        di diVar = this.H0;
        org.telegram.ui.ActionBar.e6 e6Var = diVar.M;
        uu uuVar = diVar.a;
        int i12 = diVar.L;
        if (i12 == 0) {
            uuVar.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.H6, e6Var));
            int i13 = org.telegram.ui.ActionBar.i6.G6;
            uuVar.setCursorColor(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
            uuVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
        } else if (i12 == 2 || i12 == 3) {
            uuVar.setHintTextColor(-1929379841);
            uuVar.setTextColor(-1);
            uuVar.setCursorColor(-1);
            uuVar.setHandlesColor(-1);
            uuVar.setHighlightColor(822083583);
            uuVar.quoteColor = -1;
        } else {
            uuVar.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.t5, e6Var));
            uuVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, e6Var));
        }
        diVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xd, e6Var), PorterDuff.Mode.MULTIPLY));
        vu vuVar = diVar.d;
        if (vuVar != null) {
            vuVar.S();
        }
        biVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.i6.A5));
        int themedColor2 = getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5);
        a8 a8Var = this.a1;
        a8Var.D(themedColor2, false);
        a8Var.C(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.ig : org.telegram.ui.ActionBar.i6.I5), false);
        a8Var.setTitleColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5));
        int s12 = s1(false);
        org.telegram.ui.ActionBar.i6.x1(s12, this.shadowDrawable);
        fh.c cVar = this.I2;
        if (cVar.a.getColor() != s12) {
            cVar.a(s12);
            jh.f fVar = this.y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            ci ciVar = this.z1;
            if (ciVar != null) {
                ciVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i14 = 0;
        while (true) {
            qi[] qiVarArr = this.z0;
            if (i14 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i14];
            if (qiVar != null) {
                qiVar.d();
            }
            i14++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.h5));
            return;
        }
        this.navBarColorKey = -1;
        this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.i6.i5);
        AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.i6.h5), false);
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
        org.telegram.ui.ActionBar.v0 v0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        bi.o oVar;
        float max;
        int i12;
        float f14 = this.d.e;
        qi qiVar = i10 == 0 ? this.B0 : this.C0;
        if (qiVar == null || qiVar.getVisibility() != 0) {
            return;
        }
        int r12 = r1(i10);
        if (qiVar == this.m0 || qiVar == this.n0) {
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
        ai aiVar = this.l1;
        float dp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - aiVar.getAlpha()) * 26.0f);
        boolean z10 = this.t1;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.d1;
        ci.m6 m6Var = this.R0;
        if (z10 && this.T0 == 0 && !this.W0) {
            v0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37), ((r12 - AndroidUtilities.dp((i11 * f14) + 37.0f)) + dp) - (m6Var.getAlpha() * m6Var.getMeasuredHeight())) + this.o2);
        } else {
            v0Var2.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37)) + this.o2);
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f1;
        if (v0Var3 != null) {
            v0Var3.setTranslationY(v0Var2.getTranslationY());
        }
        ci.d4 d4Var = this.g1;
        if (d4Var != null) {
            d4Var.setTranslationY(v0Var2.getTranslationY());
        }
        if (this.F && this.v1) {
            qi qiVar2 = this.C0;
            if (qiVar2 != null && this.B0 != null) {
                f7 = Math.min(qiVar2.getTranslationY(), this.B0.getTranslationY());
            } else if (qiVar2 != null) {
                f7 = qiVar2.getTranslationY();
            }
            v0Var = this.h1;
            if (v0Var != null) {
                v0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i11 + 37)) + this.o2);
            }
            float dp2 = ((((r12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.o2) + f7) - (m6Var.getAlpha() * m6Var.getMeasuredHeight());
            this.s1 = dp2;
            aiVar.setTranslationY(Math.max(this.o2, dp2));
            m6Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.o2, (aiVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.s1 + AndroidUtilities.dp(8.0f)));
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
                lo loVar = this.m0;
                if (loVar == this.C0) {
                    f11 = (loVar.getTranslationY() + r1(1)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.d0;
                } else if (loVar == this.B0) {
                    f11 = (loVar.getTranslationY() + r1(0)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
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
                    lo loVar2 = this.n0;
                    if (loVar2 == this.C0) {
                        f13 = (loVar2.getTranslationY() + r1(1)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.d0;
                    } else if (loVar2 == this.B0) {
                        f13 = (loVar2.getTranslationY() + r1(0)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.C0 == null ? 1.0f : 1.0f - this.d0;
                    }
                    oVar = this.i1;
                    if (oVar != null) {
                        int measuredWidth = LocaleController.isRTL ? (this.containerView.getMeasuredWidth() - oVar.getMeasuredWidth()) - AndroidUtilities.dp(62.0f) : 0;
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
                        oVar.setTranslationY(Math.max(0.0f, max) + this.o2);
                        oVar.setTranslationX(-((measuredWidth * (1.0f - f14)) + AndroidUtilities.dp((7.0f * r6) + 12.0f)));
                    }
                    float max2 = Math.max(f12, f10);
                    this.k1 = max2;
                    if (oVar == null) {
                        float f15 = this.j1 * max2;
                        oVar.setAlpha(f15);
                        oVar.setVisibility(f15 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f12 = 0.0f;
                f13 = 0.0f;
                oVar = this.i1;
                if (oVar != null) {
                }
                float max22 = Math.max(f12, f10);
                this.k1 = max22;
                if (oVar == null) {
                }
            }
            f10 = 0.0f;
            f11 = 0.0f;
            if (this.n0 != null) {
            }
            f12 = 0.0f;
            f13 = 0.0f;
            oVar = this.i1;
            if (oVar != null) {
            }
            float max222 = Math.max(f12, f10);
            this.k1 = max222;
            if (oVar == null) {
            }
        }
        f7 = 0.0f;
        v0Var = this.h1;
        if (v0Var != null) {
        }
        float dp22 = ((((r12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.o2) + f7) - (m6Var.getAlpha() * m6Var.getMeasuredHeight());
        this.s1 = dp22;
        aiVar.setTranslationY(Math.max(this.o2, dp22));
        m6Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.o2, (aiVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.s1 + AndroidUtilities.dp(8.0f)));
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
        oVar = this.i1;
        if (oVar != null) {
        }
        float max2222 = Math.max(f12, f10);
        this.k1 = max2222;
        if (oVar == null) {
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.zn)) {
            return;
        }
        org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
        zu zuVar = this.c0 ? this.S0 : this.H0;
        String obj = zuVar != null ? zuVar.getText().toString() : null;
        if (this.K1 == null) {
            qi qiVar = this.B0;
            z11 = true;
            if (qiVar != null) {
            }
            if (yf.u.g(this.M1).e(obj, znVar.d8) <= 0) {
                MessageObject messageObject = znVar.n5;
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
        ci.m6 m6Var = this.R0;
        m6Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout != null) {
            km kmVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (kmVar != null && kmVar.getFastScroll() != null) {
                xl0 fastScroll = kmVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1;
                if (this.c0) {
                    i10 = (int) (m6Var.getAlpha() * m6Var.getMeasuredHeight());
                }
                fastScroll.h0 = currentActionBarHeight + i10;
                kmVar.getFastScroll().invalidate();
            }
        }
        Y1();
        i1();
    }

    public final void g1() {
        float f7 = this.c.e;
        this.z1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - ((1.0f - this.b.e) * f7)));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.z0;
            if (i10 >= qiVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.i5));
                return arrayList;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null && (themeDescriptions = qiVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean h() {
        return true;
    }

    public final void h1() {
        p20.d(this.I0, com.google.android.gms.internal.vision.e2.C(this.e.e, this.f.e, yf.e0.b(this.h.e), this.U1 ? 0.0f : 1.0f));
    }

    public final void i1() {
        ii iiVar = this.L0;
        ai aiVar = this.K0;
        ci.m6 m6Var = this.R0;
        if (m6Var == null || m6Var.getVisibility() != 0 || m6Var.getAlpha() == 0.0f) {
            aiVar.setTranslationY(this.j2);
            iiVar.setAlpha(1.0f);
            return;
        }
        float f7 = this.b.e;
        float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
        iiVar.setAlpha(abs * abs * abs * abs);
        aiVar.setTranslationY(AndroidUtilities.lerp(this.j2, ((m6Var.getTranslationY() + m6Var.getTop()) - aiVar.getTop()) + AndroidUtilities.dp(8.0f), hs.j.getInterpolation(f7)));
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
        org.telegram.ui.ActionBar.v0 v0Var = this.n1;
        if (v0Var != null) {
            this.m1.setTranslationY(0.0f);
            v0Var.setVisibility(8);
        }
    }

    public final void k1(bi.v vVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.m1;
        textView.setText(string);
        this.V0 = false;
        this.A1.setVisibility(8);
        this.T0 = 1;
        this.F = true;
        this.G = true;
        this.i0 = false;
        this.J = vVar;
        org.telegram.ui.ActionBar.v0 v0Var = this.n1;
        if (v0Var != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            v0Var.setVisibility(0);
            v0Var.setClickable(true);
            v0Var.setAlpha(1.0f);
            v0Var.setScaleX(1.0f);
            v0Var.setScaleY(1.0f);
        }
    }

    public final int l1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (!(n2Var instanceof org.telegram.ui.zn) || (messagePreviewParams = ((org.telegram.ui.zn) n2Var).f5) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public final TLRPC.Chat m1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        return n2Var instanceof org.telegram.ui.zn ? ((org.telegram.ui.zn) n2Var).e : MessagesController.getInstance(this.M1).getChat(Long.valueOf(-this.Z));
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
        qi qiVar;
        if (i10 == 0) {
            i1();
            g1();
            return;
        }
        if (i10 == 2) {
            g1();
            lo loVar = this.m0;
            if (loVar != null && ((qiVar = this.C0) == loVar || this.B0 == loVar)) {
                e2(qiVar == loVar ? 1 : 0);
            }
            lo loVar2 = this.n0;
            if (loVar2 != null) {
                qi qiVar2 = this.C0;
                if (qiVar2 == loVar2 || this.B0 == loVar2) {
                    e2(qiVar2 != loVar2 ? 0 : 1);
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
            ii iiVar = this.L0;
            if (iiVar != null) {
                iiVar.setEphemeralFactor(f7);
                iiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final float n1() {
        return r0.getMeasuredHeight() - ((1.0f - this.G0.getAlpha()) * (r0.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final zu o1() {
        qi qiVar;
        return (this.c0 && ((qiVar = this.B0) == this.j0 || qiVar == this.q0)) ? this.S0 : this.H0;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        if (this.S.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        a8 a8Var = this.a1;
        if (a8Var.n0) {
            a8Var.h(true);
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

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.B0.o(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomCloseAnimation() {
        TL_wallet.walletTransaction wallettransaction;
        final gl glVar = this.w0;
        if (glVar != null && this.B0 == glVar) {
            final jh jhVar = new jh(this, 1);
            int i10 = glVar.n;
            org.telegram.ui.Wallet.i8 i8Var = glVar.O;
            yi yiVar = glVar.b;
            AnimatorSet animatorSet = null;
            if (!glVar.H && (wallettransaction = glVar.M0) != null && glVar.N0 == null && glVar.O0 == null) {
                if (glVar.P0) {
                    org.telegram.ui.Wallet.a5 a5Var = new org.telegram.ui.Wallet.a5();
                    a5Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
                    if (n2Var != null && n2Var.presentFragment(a5Var, false, true)) {
                        final int i11 = 0;
                        org.telegram.ui.Wallet.w8 w8Var = new org.telegram.ui.Wallet.w8(yiVar.getContainer(), yiVar.getSheetContainer(), i8Var.getDiamondView(), a5Var, glVar.M0, new Runnable() { // from class: org.telegram.ui.Components.xk
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        if (!glVar.H) {
                                            jhVar.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!glVar.H) {
                                            jhVar.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, yiVar);
                        glVar.O0 = w8Var;
                        animatorSet = w8Var.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.c6 diamondView = i8Var.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.n2 n2Var2 = yiVar.f0;
                        if (n2Var2 instanceof org.telegram.ui.zn) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var2;
                            if (znVar.getCurrentAccount() == i10 && znVar.a() == glVar.r.id && znVar.R3 == 0 && znVar.getFragmentView() != null && znVar.getFragmentView().isAttachedToWindow()) {
                                final int i12 = 1;
                                org.telegram.ui.Wallet.v5 v5Var = new org.telegram.ui.Wallet.v5(yiVar.getContainer(), yiVar.getSheetContainer(), i8Var.getDiamondView(), znVar, glVar.M0, new Runnable() { // from class: org.telegram.ui.Components.xk
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                if (!glVar.H) {
                                                    jhVar.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!glVar.H) {
                                                    jhVar.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, yiVar);
                                glVar.N0 = v5Var;
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

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        ja1 ja1Var = chatAttachAlertPhotoLayout.l0;
        ai.f0 f0Var = chatAttachAlertPhotoLayout.j0;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        km kmVar = chatAttachAlertPhotoLayout.r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        boolean z10 = i14 < i15;
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == f0Var) {
            if (z10) {
                if (kmVar.getVisibility() == 0) {
                    f0Var.layout(0, org.telegram.messenger.q.B(222.0f, i13, i16), i14, org.telegram.messenger.q.B(96.0f, i13, i16));
                    return true;
                }
                f0Var.layout(0, org.telegram.messenger.q.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            }
            if (kmVar.getVisibility() == 0) {
                f0Var.layout(org.telegram.messenger.q.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            }
            f0Var.layout(org.telegram.messenger.q.B(126.0f, i12, i16), 0, i12, i15 - i16);
            return true;
        }
        if (view == ja1Var) {
            if (z10) {
                if (kmVar.getVisibility() == 0) {
                    ja1Var.layout(0, org.telegram.messenger.q.B(310.0f, i13, i16), i14, org.telegram.messenger.q.B(260.0f, i13, i16));
                    return true;
                }
                ja1Var.layout(0, org.telegram.messenger.q.B(176.0f, i13, i16), i14, org.telegram.messenger.q.B(126.0f, i13, i16));
                return true;
            }
            if (kmVar.getVisibility() == 0) {
                ja1Var.layout(org.telegram.messenger.q.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            }
            ja1Var.layout(org.telegram.messenger.q.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
            return true;
        }
        if (view != textView) {
            if (view != kmVar) {
                return false;
            }
            if (z10) {
                int B = org.telegram.messenger.q.B(88.0f, i15, i16);
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
            if (kmVar.getVisibility() == 0) {
                dp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = dp3 - i16;
        } else {
            dp = i12 - AndroidUtilities.dp(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
            textView.setRotation(-90.0f);
            if (kmVar.getVisibility() == 0) {
                dp -= AndroidUtilities.dp(96.0f);
            }
        }
        textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        ym ymVar = chatAttachAlertPhotoLayout.v;
        km kmVar = chatAttachAlertPhotoLayout.r;
        gg.a0 a0Var = chatAttachAlertPhotoLayout.s;
        boolean z10 = i10 < i11;
        um umVar = chatAttachAlertPhotoLayout.P;
        if (view != umVar) {
            ai.f0 f0Var = chatAttachAlertPhotoLayout.j0;
            if (view == f0Var) {
                if (z10) {
                    f0Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30));
                    return true;
                }
                f0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            ja1 ja1Var = chatAttachAlertPhotoLayout.l0;
            if (view == ja1Var) {
                if (z10) {
                    ja1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                    return true;
                }
                ja1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            if (view == kmVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    kmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
                    if (a0Var.o != 0) {
                        kmVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.j1(0);
                        ymVar.l();
                    }
                } else {
                    kmVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                    if (a0Var.o != 1) {
                        kmVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        a0Var.j1(1);
                        ymVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.b0 && !chatAttachAlertPhotoLayout.d0) {
            umVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomOpenAnimation() {
        this.j0.setTranslationX(0.0f);
        this.q1.setAlpha(0.0f);
        this.o1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.t2 = animatorSet;
        int i10 = 2;
        mi miVar = this.r2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, miVar, 0.0f, 400.0f));
        this.t2.setDuration(400L);
        this.t2.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        miVar.getClass();
        miVar.a(this, valueOf);
        this.t2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new hh(this, i10));
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
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.backDrawable, u6.d, this.dimBehind ? this.dimBehindAlpha : 0));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        org.telegram.messenger.video.f fVar = new org.telegram.messenger.video.f(this, animationNotificationsLocker, this.delegate, 17);
        this.s2.a(new ei.l4(i10, this, fVar));
        this.currentSheetAnimation.addListener(new ai.z(22, this, fVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        O1(0.0f);
        ofFloat2.addUpdateListener(new hh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(hs.f);
        ofFloat2.start();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
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

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        if (this.f0 instanceof org.telegram.ui.zn) {
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
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

    public final long p1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        return n2Var instanceof org.telegram.ui.zn ? ((org.telegram.ui.zn) n2Var).a() : this.Z;
    }

    public final int q1() {
        qi qiVar = this.B0;
        lo loVar = this.m0;
        if (qiVar == loVar && loVar.E != null) {
            return loVar.getEmojiPadding();
        }
        lo loVar2 = this.n0;
        return (qiVar != loVar2 || loVar2.E == null) ? this.c0 ? this.S0.getEmojiPadding() : this.H0.getEmojiPadding() : loVar2.getEmojiPadding();
    }

    public final int r1(int i10) {
        qi qiVar = this.C0;
        int[] iArr = this.e2;
        return (qiVar == null || !((this.B0 instanceof hn) || (qiVar instanceof hn))) ? iArr[i10] : AndroidUtilities.lerp(iArr[0], iArr[1], this.d0);
    }

    public final int s1(boolean z10) {
        a8 a8Var;
        if (this.k2) {
            return getThemedColor(org.telegram.ui.ActionBar.i6.tg);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.resourcesProvider;
        boolean a2 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.i6.I.q();
        Iterator it = this.n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            me.g gVar = (me.g) it.next();
            long longValue = ((Long) gVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a10 = w7.o.a(f7, 0.0f, 1.0f);
        if (z10 && (a8Var = this.a1) != null && a8Var.getVisibility() == 0) {
            a10 *= 1.0f - a8Var.getAlpha();
        }
        return i0.a.d(a10, getThemedColor(org.telegram.ui.ActionBar.i6.h5), getThemedColor(a2 ? org.telegram.ui.ActionBar.i6.a7 : org.telegram.ui.ActionBar.i6.i5));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean shouldOverlayCameraViewOverNavBar() {
        qi qiVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        return qiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.i1;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        this.L1 = false;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            this.calcMandatoryInsets = ((org.telegram.ui.zn) n2Var).C9();
        }
        a2();
        this.v1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.p2) {
            this.p2 = false;
            a8 a8Var = this.a1;
            a8Var.e();
            a8Var.invalidate();
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
        yi yiVar;
        um umVar;
        MediaController.AlbumEntry albumEntry;
        qi qiVar;
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
        ai aiVar = this.A1;
        aiVar.setAlpha(1.0f);
        aiVar.setTranslationY(0.0f);
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.A0;
            if (i11 >= longSparseArray.size()) {
                break;
            }
            ((ei.p4) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
            i11++;
        }
        int i12 = this.T0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (i12 != 2) {
            if (n2Var instanceof org.telegram.ui.zn) {
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
                chat = znVar.e;
                user = znVar.i();
            } else {
                long j3 = this.Z;
                int i13 = this.M1;
                if (j3 >= 0) {
                    user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.Z));
                    chat = null;
                } else if (j3 < 0) {
                    chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-this.Z));
                    user = null;
                }
            }
            z10 = n2Var instanceof org.telegram.ui.zn;
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
                    this.S1 = !z10 || ((org.telegram.ui.zn) n2Var).h == null;
                }
            }
            if (this.U1) {
                this.R1 = false;
                this.S1 = false;
            }
            di diVar = this.H0;
            if (z10 || this.T0 == 2) {
                diVar.setVisibility(this.W ? 0 : 4);
            }
            boolean z11 = this.P1;
            boolean z12 = this.O1;
            boolean z13 = this.N1;
            chatAttachAlertPhotoLayout = this.j0;
            yiVar = chatAttachAlertPhotoLayout.b;
            c00 c00Var = chatAttachAlertPhotoLayout.H;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z11;
            chatAttachAlertPhotoLayout.x0 = z12;
            chatAttachAlertPhotoLayout.z0 = z13;
            umVar = chatAttachAlertPhotoLayout.P;
            if (umVar != null) {
                umVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.P.setEnabled(chatAttachAlertPhotoLayout.v0);
            }
            if (!((yiVar.f0 instanceof org.telegram.ui.zn) && yiVar.m1() == null) && yiVar.T0 == 0) {
                chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
                if (chatAttachAlertPhotoLayout.v0) {
                    c00Var.setText(LocaleController.getString(R.string.NoPhotos));
                    c00Var.a(0, 0, 0);
                } else {
                    TLRPC.Chat m12 = yiVar.m1();
                    c00Var.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    if (ChatObject.isActionBannedByDefault(m12, 7)) {
                        c00Var.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else if (AndroidUtilities.isBannedForever(m12.banned_rights)) {
                        c00Var.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                    } else {
                        c00Var.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(m12.banned_rights.until_date)));
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
                if (c00Var != null) {
                    c00Var.c();
                }
            }
            chatAttachAlertPhotoLayout.u0();
            diVar.k(true);
            this.S0.k(true);
            this.x1 = false;
            setFocusable(false);
            if (!this.O || this.P) {
                if (this.o0 == null) {
                    xl xlVar = new xl(this, getContext(), this.resourcesProvider, (this.H || this.P || this.U1) ? false : true);
                    this.o0 = xlVar;
                    this.z0[5] = xlVar;
                    sl slVar = this.w2;
                    if (slVar != null) {
                        xlVar.setDelegate(slVar);
                    } else {
                        xlVar.setDelegate(new gh(this, i10));
                    }
                }
                this.Z0 = 5L;
                qiVar = this.o0;
            } else if (this.N) {
                H1(false);
                qiVar = this.p0;
                this.Z0 = 4L;
            } else {
                MessageObject messageObject = this.K1;
                if (messageObject != null) {
                    int i15 = this.J1;
                    if (i15 == -1) {
                        this.V0 = true;
                        if (messageObject.isMusic()) {
                            E1(false);
                            qiVar = this.l0;
                            this.Z0 = 3L;
                        } else if (this.K1.isDocument()) {
                            H1(false);
                            qiVar = this.p0;
                            this.Z0 = 4L;
                        } else {
                            this.Z0 = 1L;
                        }
                    } else {
                        if (i15 == 2) {
                            E1(false);
                            qiVar = this.l0;
                            this.Z0 = 3L;
                        } else if (i15 == 1) {
                            H1(false);
                            qiVar = this.p0;
                            this.Z0 = 4L;
                        } else {
                            this.Z0 = 1L;
                            qiVar = chatAttachAlertPhotoLayout;
                        }
                        this.V0 = false;
                    }
                } else {
                    this.V0 = this.T0 == 0 && !this.W0;
                    this.Z0 = 1L;
                }
                qiVar = chatAttachAlertPhotoLayout;
            }
            aiVar.setVisibility(this.V0 ? 0 : 8);
            if (this.B0 != qiVar) {
                a8 a8Var = this.a1;
                if (a8Var.n0) {
                    a8Var.h(true);
                }
                this.containerView.removeView(this.B0);
                this.B0.u();
                this.B0.setVisibility(8);
                this.B0.t();
                this.B0 = qiVar;
                this.allowNestedScroll = true;
                if (qiVar.getParent() == null) {
                    this.containerView.addView(this.B0, 0, w7.x5.d(-1.0f, -1));
                }
                qiVar.setAlpha(1.0f);
                qiVar.setVisibility(0);
                qiVar.G(null);
                qiVar.I();
                a8Var.setVisibility(qiVar.i() != 0 ? 0 : 4);
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
        z10 = n2Var instanceof org.telegram.ui.zn;
        if (z10) {
            if (chat != null) {
            }
            if (this.U1) {
            }
            di diVar2 = this.H0;
            if (z10) {
            }
            diVar2.setVisibility(this.W ? 0 : 4);
            boolean z112 = this.P1;
            boolean z122 = this.O1;
            boolean z132 = this.N1;
            chatAttachAlertPhotoLayout = this.j0;
            yiVar = chatAttachAlertPhotoLayout.b;
            c00 c00Var2 = chatAttachAlertPhotoLayout.H;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z112;
            chatAttachAlertPhotoLayout.x0 = z122;
            chatAttachAlertPhotoLayout.z0 = z132;
            umVar = chatAttachAlertPhotoLayout.P;
            if (umVar != null) {
            }
            if (yiVar.f0 instanceof org.telegram.ui.zn) {
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
            diVar2.k(true);
            this.S0.k(true);
            this.x1 = false;
            setFocusable(false);
            if (this.O) {
            }
            if (this.o0 == null) {
            }
            this.Z0 = 5L;
            qiVar = this.o0;
            aiVar.setVisibility(this.V0 ? 0 : 8);
            if (this.B0 != qiVar) {
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
        di diVar22 = this.H0;
        if (z10) {
        }
        diVar22.setVisibility(this.W ? 0 : 4);
        boolean z1122 = this.P1;
        boolean z1222 = this.O1;
        boolean z1322 = this.N1;
        chatAttachAlertPhotoLayout = this.j0;
        yiVar = chatAttachAlertPhotoLayout.b;
        c00 c00Var22 = chatAttachAlertPhotoLayout.H;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.v0 = z14;
        chatAttachAlertPhotoLayout.w0 = z1122;
        chatAttachAlertPhotoLayout.x0 = z1222;
        chatAttachAlertPhotoLayout.z0 = z1322;
        umVar = chatAttachAlertPhotoLayout.P;
        if (umVar != null) {
        }
        if (yiVar.f0 instanceof org.telegram.ui.zn) {
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
        diVar22.k(true);
        this.S0.k(true);
        this.x1 = false;
        setFocusable(false);
        if (this.O) {
        }
        if (this.o0 == null) {
        }
        this.Z0 = 5L;
        qiVar = this.o0;
        aiVar.setVisibility(this.V0 ? 0 : 8);
        if (this.B0 != qiVar) {
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
        qi qiVar = this.B0;
        return qiVar == this.j0 || qiVar == this.q0;
    }

    public final void w1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        wi wiVar = this.c2;
        if (wiVar == null || this.x1) {
            return;
        }
        boolean i02 = wiVar.i0();
        this.x1 = true;
        AndroidUtilities.runOnUIThread(new ci.x0(this, editTextBoldCursor, z10, 18), i02 ? 200L : 0L);
    }

    public final void x1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int s12 = s1(false);
        org.telegram.ui.ActionBar.i6.x1(s12, this.shadowDrawable);
        fh.c cVar = this.I2;
        if (cVar.a.getColor() != s12) {
            cVar.a(s12);
            jh.f fVar = this.y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            ci ciVar = this.z1;
            if (ciVar != null) {
                ciVar.invalidate();
            }
        }
        a2();
        this.containerView.invalidate();
    }

    public final void y1() {
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.z0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.p();
            }
            i10++;
        }
        int i11 = this.M1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        di diVar = this.H0;
        if (diVar != null) {
            diVar.o();
        }
        gi giVar = this.S0;
        if (giVar != null) {
            giVar.o();
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
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        b2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.r5(this, tL_attachMenuBot, user, 23));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        gi giVar;
        di diVar;
        if (this.B0.q() || isDismissed()) {
            return;
        }
        qi qiVar = this.B0;
        gl glVar = this.w0;
        boolean z10 = (qiVar != glVar || glVar == null || glVar.H || glVar.M0 == null) ? false : true;
        this.x0 = z10;
        if (!z10 && (diVar = this.H0) != null) {
            AndroidUtilities.hideKeyboard(diVar.getEditText());
        }
        if (!this.x0 && (giVar = this.S0) != null) {
            AndroidUtilities.hideKeyboard(giVar.getEditText());
        }
        this.A0.clear();
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        if (!this.D2 && n2Var != null && this.B0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.C2) {
                return;
            }
            this.C2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new gh(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new mh(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.N = b1Var;
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.z0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar2 = qiVarArr[i10];
            if (qiVar2 != null && this.B0 != qiVar2) {
                qiVar2.q();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.a7), 0), true, (AndroidUtilities.IntColorCallback) new gh(this, 11));
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
        this.l2 = false;
        super.dismiss();
        this.D2 = false;
    }

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }

    public yi(Activity activity, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        this(activity, n2Var, z10, z11, true, null);
    }
}

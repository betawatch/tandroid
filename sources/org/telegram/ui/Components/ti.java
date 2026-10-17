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
import org.telegram.ui.bi1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public class ti extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.z2, ne.d {
    public static final /* synthetic */ int R2 = 0;
    public final LongSparseArray A0;
    public final wh A1;
    public double[] A2;
    public li B0;
    public final xh B1;
    public boolean B2;
    public li C0;
    public final s4.b0 C1;
    public boolean C2;
    public final dh.d D0;
    public final qi D1;
    public boolean D2;
    public final i0 E;
    public final dh.d E0;
    public boolean E1;
    public ei.i E2;
    public boolean F;
    public final ig.j F0;
    public final RadialProgressView F1;
    public final bh.f F2;
    public boolean G;
    public final wh G0;
    public boolean G1;
    public final gh.d G2;
    public boolean H;
    public final zh H0;
    public final q6 H1;
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
    public final wh K0;
    public MessageObject K1;
    public final bh.b K2;
    public int L;
    public final ei L0;
    public boolean L1;
    public final kh L2;
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
    public c50 Q;
    public long Q0;
    public boolean Q1;
    public final ArrayList Q2;
    public boolean R;
    public final ah.v R0;
    public boolean R1;
    public final le0 S;
    public final ci S0;
    public boolean S1;
    public go T;
    public int T0;
    public boolean T1;
    public e50 U;
    public zt U0;
    public boolean U1;
    public boolean V;
    public boolean V0;
    public int V1;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public ek X;
    public boolean X0;
    public boolean X1;
    public cj Y;
    public final float Y0;
    public float Y1;
    public long Z;
    public long Z0;
    public float Z1;
    public boolean a0;
    public final z7 a1;
    public ValueAnimator a2;
    public final ne.b b;
    public final bh.c b0;
    public AnimatorSet b1;
    public int b2;
    public final ne.b c;
    public boolean c0;
    public AnimatorSet c1;
    public ri c2;
    public final ne.b d;
    public float d0;
    public final org.telegram.ui.ActionBar.u0 d1;
    public pn d2;
    public final ne.b e;
    public final hi e0;
    public final ei.u e1;
    public final int[] e2;
    public final ne.b f;
    public final org.telegram.ui.ActionBar.n2 f0;
    public final org.telegram.ui.ActionBar.u0 f1;
    public int f2;
    public final boolean g0;
    public ei.x3 g1;
    public float g2;
    public final ne.b h;
    public mf h0;
    public final org.telegram.ui.ActionBar.u0 h1;
    public float h2;
    public boolean i0;
    public final di.n i1;
    public boolean i2;
    public final ChatAttachAlertPhotoLayout j0;
    public float j1;
    public float j2;
    public xj k0;
    public float k1;
    public final boolean k2;
    public fj l0;
    public final wh l1;
    public boolean l2;
    public fo m0;
    public final TextView m1;
    public final ArrayList m2;
    public final ne.l n;
    public fo n0;
    public final org.telegram.ui.ActionBar.u0 n1;
    public final Rect n2;
    public rl o0;
    public final LinearLayout o1;
    public float o2;
    public nk p0;
    public final ImageView p1;
    public boolean p2;
    public bn q0;
    public final LinearLayout q1;
    public int q2;
    public org.telegram.ui.qn r;
    public ij r0;
    public final TextView r1;
    public final hi r2;
    public final q6 s;
    public ig.i0 s0;
    public float s1;
    public o1.k s2;
    public ok t0;
    public boolean t1;
    public AnimatorSet t2;
    public ok u0;
    public final ji u1;
    public boolean u2;
    public final q6 v;
    public ki.q v0;
    public boolean v1;
    public boolean v2;
    public final ImageView w;
    public al w0;
    public Object w1;
    public ml w2;
    public final i0 x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public final ImageView y;
    public float y0;
    public final kh.f y1;
    public boolean y2;
    public final li[] z0;
    public final yh z1;
    public File z2;

    public ti(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        org.telegram.ui.ActionBar.u0 u0Var;
        TextPaint textPaint;
        ne.l lVar;
        int i10;
        float f7;
        di.n nVar;
        bs bsVar = bs.h;
        this.b = new ne.b(0, this, bsVar, 380L, false);
        this.c = new ne.b(1, this, bsVar, 380L, false);
        this.d = new ne.b(2, this, bsVar, 380L, false);
        this.e = new ne.b(3, this, bsVar, 380L, false);
        this.f = new ne.b(4, this, bsVar, 380L, true);
        this.h = new ne.b(5, this, bsVar, 320L, false);
        ne.l lVar2 = new ne.l(new dh(this, 2), bsVar, 380L);
        this.n = lVar2;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.d0 = 0.0f;
        this.e0 = new hi(this, 0);
        this.i0 = false;
        li[] liVarArr = new li[12];
        this.z0 = liVarArr;
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
        this.r2 = new hi(this, 1);
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
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        int i12 = 13;
        int i13 = 8;
        if (Build.VERSION.SDK_INT >= 31) {
            this.F2 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.H2 = dVar;
            dVar.k(new le.b(this, i13));
            gh.d dVar2 = new gh.d(null);
            this.G2 = dVar2;
            dVar2.k(new k0.b(this, i12));
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
        this.L2 = new kh(this, 0);
        this.k2 = z10;
        this.g0 = (n2Var instanceof org.telegram.ui.sn) && n2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f0 = n2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        ji jiVar = new ji(this, context);
        this.u1 = jiVar;
        jiVar.setDelegate(new ki(this));
        this.containerView = jiVar;
        jiVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i14, 0, i14, 0);
        z7 z7Var = new z7(this, context, d6Var, 1);
        this.a1 = z7Var;
        z7Var.S0 = true;
        z7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        z7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        int i15 = org.telegram.ui.ActionBar.h6.j5;
        z7Var.C(getThemedColor(i15), false);
        int i16 = org.telegram.ui.ActionBar.h6.I5;
        z7Var.B(getThemedColor(i16), false);
        z7Var.setTitleColor(getThemedColor(i15));
        z7Var.setOccupyStatusBar(true);
        z7Var.setAlpha(0.0f);
        z7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 11));
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i15), false, d6Var);
        this.d1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.ic_ab_other);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        final int i17 = 4;
        u0Var2.setVisibility(4);
        u0Var2.setAlpha(0.0f);
        u0Var2.setScaleX(0.6f);
        u0Var2.setScaleY(0.6f);
        u0Var2.setSubMenuOpenSide(2);
        u0Var2.setDelegate(new dh(this, 8));
        u0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        u0Var2.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i16), 6, -1));
        u0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gi.f4 f4Var;
                switch (i17) {
                    case 0:
                        ti tiVar = this.b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        boolean z13 = tiVar2.c0;
                        if (!z13) {
                            tiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z14 = tiVar3.c0;
                        if (z14) {
                            tiVar3.K1(!z14, true);
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
                        ti.w(this.b);
                        break;
                    case 6:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        ti tiVar4 = this.b;
                        tiVar4.d2(tiVar4.B0 != tiVar4.q0);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i15), false, d6Var);
        this.f1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        ei.u uVar = new ei.u();
        this.e1 = uVar;
        u0Var3.setIcon(uVar);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var3.setVisibility(8);
        u0Var3.setAlpha(0.0f);
        u0Var3.setScaleX(0.6f);
        u0Var3.setScaleY(0.6f);
        u0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        u0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        final int i18 = 6;
        u0Var3.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i16), 6, -1));
        final int i19 = 5;
        u0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gi.f4 f4Var;
                switch (i19) {
                    case 0:
                        ti tiVar = this.b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        boolean z13 = tiVar2.c0;
                        if (!z13) {
                            tiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z14 = tiVar3.c0;
                        if (z14) {
                            tiVar3.K1(!z14, true);
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
                        ti.w(this.b);
                        break;
                    case 6:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        ti tiVar4 = this.b;
                        tiVar4.d2(tiVar4.B0 != tiVar4.q0);
                        break;
                }
            }
        });
        di.n nVar2 = new di.n(this, context);
        nVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        nVar2.setText(LocaleController.getString(R.string.Create));
        nVar2.setTypeface(AndroidUtilities.bold());
        nVar2.setTextSize(1, 14.0f);
        nVar2.setVisibility(4);
        nVar2.setAlpha(0.0f);
        nVar2.setGravity(17);
        nVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        nVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        nVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gi.f4 f4Var;
                switch (i18) {
                    case 0:
                        ti tiVar = this.b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        boolean z13 = tiVar2.c0;
                        if (!z13) {
                            tiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z14 = tiVar3.c0;
                        if (z14) {
                            tiVar3.K1(!z14, true);
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
                        ti.w(this.b);
                        break;
                    case 6:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        ti tiVar4 = this.b;
                        tiVar4.d2(tiVar4.B0 != tiVar4.q0);
                        break;
                }
            }
        });
        w7.b6.a(nVar2);
        this.i1 = nVar2;
        a2();
        if (n2Var != null) {
            textPaint = textPaint2;
            lVar = lVar2;
            nVar = nVar2;
            u0Var = u0Var3;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.u0 u0Var4 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i15), false, d6Var);
            this.h1 = u0Var4;
            u0Var4.setLongClickEnabled(false);
            u0Var4.setIcon(R.drawable.outline_header_search);
            u0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            u0Var4.setVisibility(4);
            u0Var4.setAlpha(0.0f);
            u0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            i10 = -1;
            u0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i16), 6, -1));
            u0Var4.setOnClickListener(new ci.h2(5, this, z11));
        } else {
            u0Var = u0Var3;
            textPaint = textPaint2;
            lVar = lVar2;
            i10 = -1;
            f7 = 14.0f;
            nVar = nVar2;
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i15), false, d6Var);
        this.n1 = u0Var5;
        u0Var5.setLongClickEnabled(false);
        u0Var5.setIcon(R.drawable.ic_ab_other);
        u0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var5.setVisibility(8);
        u0Var5.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i16), 3, i10));
        final int i20 = 2;
        u0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        final ti tiVar = this.b;
                        zh zhVar = tiVar.H0;
                        if (zhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), d6Var);
                            e0Var.n0(zhVar.getText());
                            final int i21 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i21) {
                                        case 0:
                                            zh zhVar2 = tiVar.H0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ci ciVar = tiVar.S0;
                                            ciVar.setText(charSequence);
                                            ciVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = tiVar.Z;
                            boolean z13 = tiVar.K1 != null;
                            mh mhVar = new mh(tiVar, 0);
                            e0Var.l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.n0 = mhVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ti tiVar2 = this.b;
                        ci ciVar = tiVar2.S0;
                        if (ciVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), d6Var);
                            e0Var2.n0(ciVar.getText());
                            final int i22 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i22) {
                                        case 0:
                                            zh zhVar2 = tiVar2.H0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ci ciVar2 = tiVar2.S0;
                                            ciVar2.setText(charSequence);
                                            ciVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = tiVar2.Z;
                            boolean z14 = tiVar2.K1 != null;
                            mh mhVar2 = new mh(tiVar2, 1);
                            e0Var2.l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = mhVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ti tiVar3 = this.b;
                        tiVar3.n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = tiVar3.f0;
                        t12.K2(null, n2Var2, d6Var);
                        PhotoViewer.t1().L2(tiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i23 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        t13.h = i23;
                        t13.n = z15;
                        if (!tiVar3.c2.v()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(tiVar3.getContainer().findFocus());
                        }
                        File w9 = ei.a8.w(tiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i24 = point.x;
                        int i25 = point.y;
                        if (i24 > 1080 || i25 > 1080) {
                            float min = Math.min(i24, i25) / 1080.0f;
                            i24 = (int) (i24 * min);
                            i25 = (int) (i25 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i24, i25, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().g2(arrayList3, 0, 11, false, new vh(tiVar3, photoEntry), n2Var2 instanceof org.telegram.ui.sn ? (org.telegram.ui.sn) n2Var2 : null);
                        if (tiVar3.G) {
                            PhotoViewer.t1().Y0(null, null, true, tiVar3.J);
                            break;
                        }
                        break;
                }
            }
        });
        u0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        u0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        final int i21 = 7;
        u0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gi.f4 f4Var;
                switch (i21) {
                    case 0:
                        ti tiVar = this.b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        boolean z13 = tiVar2.c0;
                        if (!z13) {
                            tiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z14 = tiVar3.c0;
                        if (z14) {
                            tiVar3.K1(!z14, true);
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
                        ti.w(this.b);
                        break;
                    case 6:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        ti tiVar4 = this.b;
                        tiVar4.d2(tiVar4.B0 != tiVar4.q0);
                        break;
                }
            }
        });
        wh whVar = new wh(this, context, 0);
        this.l1 = whVar;
        final int i22 = 8;
        whVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gi.f4 f4Var;
                switch (i22) {
                    case 0:
                        ti tiVar = this.b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        boolean z13 = tiVar2.c0;
                        if (!z13) {
                            tiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z14 = tiVar3.c0;
                        if (z14) {
                            tiVar3.K1(!z14, true);
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
                        ti.w(this.b);
                        break;
                    case 6:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        ti tiVar4 = this.b;
                        tiVar4.d2(tiVar4.B0 != tiVar4.q0);
                        break;
                }
            }
        });
        whVar.setAlpha(0.0f);
        whVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.o1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.m1 = textView;
        textView.setTextColor(getThemedColor(i15));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.p1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i15);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        whVar.addView(linearLayout, w7.z5.d(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.q1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.r1 = textView2;
        textView2.setTextColor(getThemedColor(i15));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.z5.q(-2, -2, 16));
        whVar.addView(linearLayout2, w7.z5.d(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, d6Var);
        this.j0 = chatAttachAlertPhotoLayout;
        liVarArr[0] = chatAttachAlertPhotoLayout;
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
        this.containerView.addView(whVar, w7.z5.a(-2.0f, 23.0f, 0.0f, 21.0f, 0.0f, -1, 51));
        ah.v vVar = new ah.v(context, 11);
        this.R0 = vVar;
        this.containerView.addView(vVar, w7.z5.e(-1, -2, 55));
        this.containerView.addView(z7Var, w7.z5.d(-2.0f, -1));
        this.containerView.addView(u0Var2, w7.z5.e(48, 48, 53));
        this.containerView.addView(u0Var, w7.z5.a(48.0f, 0.0f, 0.0f, 48.0f, 0.0f, 48, 53));
        org.telegram.ui.ActionBar.u0 u0Var6 = this.h1;
        if (u0Var6 != null) {
            this.containerView.addView(u0Var6, w7.z5.e(48, 48, 53));
        }
        whVar.addView(u0Var5, w7.z5.a(32.0f, 0.0f, 0.0f, 0.0f, 8.0f, 32, 21));
        this.containerView.addView(nVar, w7.z5.e(-2, 48, 53));
        wh whVar2 = new wh(this, context, 1);
        this.A1 = whVar2;
        xh xhVar = new xh(context, 0);
        this.B1 = xhVar;
        xhVar.setClipChildren(true);
        xhVar.setClipToPadding(false);
        qi qiVar = new qi(this, context);
        this.D1 = qiVar;
        xhVar.setAdapter(qiVar);
        s4.b0 b0Var = new s4.b0(0, false);
        this.C1 = b0Var;
        xhVar.setLayoutManager(b0Var);
        xhVar.setVerticalScrollBarEnabled(false);
        xhVar.setHorizontalScrollBarEnabled(false);
        xhVar.setItemAnimator(null);
        xhVar.setLayoutAnimation(null);
        xhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        xhVar.x2 = true;
        xhVar.setOverScrollMode(2);
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
        yh yhVar = new yh(this, context, 0);
        this.z1 = yhVar;
        bh.c cVar2 = new bh.c(bVar3.c(yhVar, null, false));
        this.b0 = cVar2;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar2.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(yhVar, w7.z5.g());
        dh.d c10 = this.J2.c(whVar2, fh.c.f(d6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        whVar2.setBackground(c10);
        xhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        xhVar.setClipToOutline(true);
        int dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(28.0f);
        ci.o1 o1Var = zf.i0.a;
        xhVar.setOutlineProvider(new zf.h0(dp, dp2));
        xhVar.setImportantForAccessibility(1);
        whVar2.addView(xhVar, w7.z5.g());
        this.containerView.addView(whVar2, w7.z5.e(-1, 70, 81));
        xhVar.setOnItemClickListener(new ci.y4(9, this, d6Var));
        xhVar.setOnItemLongClickListener(new dh(this, 3));
        final int i23 = 0;
        q6 q6Var = new q6(context, true, false, true);
        this.H1 = q6Var;
        q6Var.setVisibility(8);
        q6Var.setAlpha(0.0f);
        q6Var.setGravity(17);
        q6Var.setTypeface(AndroidUtilities.bold());
        int dp3 = AndroidUtilities.dp(16.0f);
        q6Var.setPadding(dp3, 0, dp3, 0);
        q6Var.setTextSize(AndroidUtilities.dp(f7));
        q6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gi.f4 f4Var;
                switch (i23) {
                    case 0:
                        ti tiVar = this.b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        boolean z13 = tiVar2.c0;
                        if (!z13) {
                            tiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z14 = tiVar3.c0;
                        if (z14) {
                            tiVar3.K1(!z14, true);
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
                        ti.w(this.b);
                        break;
                    case 6:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        ti tiVar4 = this.b;
                        tiVar4.d2(tiVar4.B0 != tiVar4.q0);
                        break;
                }
            }
        });
        this.containerView.addView(q6Var, w7.z5.e(-1, 48, 83));
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
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i24 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gi.f4 f4Var;
                switch (i24) {
                    case 0:
                        ti tiVar = this.b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        boolean z13 = tiVar2.c0;
                        if (!z13) {
                            tiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z14 = tiVar3.c0;
                        if (z14) {
                            tiVar3.K1(!z14, true);
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
                        ti.w(this.b);
                        break;
                    case 6:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        ti tiVar4 = this.b;
                        tiVar4.d2(tiVar4.B0 != tiVar4.q0);
                        break;
                }
            }
        });
        wh whVar3 = new wh(this, context, 2);
        this.G0 = whVar3;
        ig.j jVar4 = new ig.j(this, context);
        this.F0 = jVar4;
        whVar3.addView(jVar4, w7.z5.e(-1, -1, 119));
        dh.d c11 = this.K2.c(jiVar, fh.c.n(d6Var), false);
        this.D0 = c11;
        c11.m = true;
        c11.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.u(AndroidUtilities.dp(32.0f));
        c11.j.g = 0.4f;
        c11.k();
        dh.d c12 = this.J2.c(jVar4, fh.c.n(d6Var), false);
        this.E0 = c12;
        c12.q(AndroidUtilities.dp(22.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        jVar4.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        whVar3.setWillNotDraw(false);
        whVar3.setVisibility(4);
        whVar3.setAlpha(0.0f);
        this.containerView.addView(whVar3, w7.z5.e(-1, -2, 83));
        whVar3.setOnTouchListener(new di.d(13));
        q6 q6Var2 = new q6(context, false, false, false);
        this.s = q6Var2;
        q6Var2.setAllowCancel(true);
        q6Var2.setScaleProperty(0.6f);
        q6Var2.setVisibility(8);
        q6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i25 = org.telegram.ui.ActionBar.h6.y6;
        q6Var2.setTextColor(getThemedColor(i25));
        q6Var2.setTypeface(AndroidUtilities.bold());
        q6Var2.setGravity(17);
        jVar4.addView(q6Var2, w7.z5.a(20.0f, 3.0f, 0.0f, 3.0f, 50.0f, 56, 85));
        ImageView imageView4 = new ImageView(context);
        this.w = imageView4;
        i0 i0Var = new i0(context);
        this.x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i26 = org.telegram.ui.ActionBar.h6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i26), mode));
        int i27 = org.telegram.ui.ActionBar.h6.i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i27), 1, AndroidUtilities.dp(16.0f)));
        jVar4.addView(imageView4, w7.z5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 53));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView4);
        final int i28 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i28) {
                    case 0:
                        final ti tiVar = this.b;
                        zh zhVar = tiVar.H0;
                        if (zhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), d6Var);
                            e0Var.n0(zhVar.getText());
                            final int i212 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            zh zhVar2 = tiVar.H0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ci ciVar2 = tiVar.S0;
                                            ciVar2.setText(charSequence);
                                            ciVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = tiVar.Z;
                            boolean z13 = tiVar.K1 != null;
                            mh mhVar = new mh(tiVar, 0);
                            e0Var.l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.n0 = mhVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ti tiVar2 = this.b;
                        ci ciVar = tiVar2.S0;
                        if (ciVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), d6Var);
                            e0Var2.n0(ciVar.getText());
                            final int i222 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i222) {
                                        case 0:
                                            zh zhVar2 = tiVar2.H0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ci ciVar2 = tiVar2.S0;
                                            ciVar2.setText(charSequence);
                                            ciVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = tiVar2.Z;
                            boolean z14 = tiVar2.K1 != null;
                            mh mhVar2 = new mh(tiVar2, 1);
                            e0Var2.l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = mhVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ti tiVar3 = this.b;
                        tiVar3.n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = tiVar3.f0;
                        t12.K2(null, n2Var2, d6Var);
                        PhotoViewer.t1().L2(tiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i232 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        t13.h = i232;
                        t13.n = z15;
                        if (!tiVar3.c2.v()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(tiVar3.getContainer().findFocus());
                        }
                        File w9 = ei.a8.w(tiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i242 = point.x;
                        int i252 = point.y;
                        if (i242 > 1080 || i252 > 1080) {
                            float min = Math.min(i242, i252) / 1080.0f;
                            i242 = (int) (i242 * min);
                            i252 = (int) (i252 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i242, i252, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().g2(arrayList3, 0, 11, false, new vh(tiVar3, photoEntry), n2Var2 instanceof org.telegram.ui.sn ? (org.telegram.ui.sn) n2Var2 : null);
                        if (tiVar3.G) {
                            PhotoViewer.t1().Y0(null, null, true, tiVar3.J);
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
        zh zhVar = new zh(this, context, jiVar, d6Var);
        this.H0 = zhVar;
        zhVar.J = true;
        zhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        zhVar.s();
        zhVar.getEditText().setLayoutParams(w7.z5.a(-1.0f, 48.0f, 0.0f, 36.0f, 0.0f, -1, 19));
        zhVar.getEditText().addTextChangedListener(new bi(this, 0));
        jVar4.addView(zhVar, w7.z5.a(-2.0f, 0.0f, 0.0f, 84.0f, 0.0f, -1, 83));
        jVar4.setClipChildren(false);
        whVar3.setClipChildren(false);
        zhVar.setClipChildren(false);
        vVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        vVar.setWillNotDraw(false);
        ci ciVar = new ci(this, context, jiVar, d6Var);
        this.S0 = ciVar;
        ciVar.J = true;
        ciVar.getEditText().addTextChangedListener(new di(this, n2Var));
        ciVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        ciVar.getEditText().setLayoutParams(w7.z5.a(-1.0f, 48.0f, 0.0f, 96.0f, 0.0f, -1, 19));
        ciVar.getEditText().setTextSize(1, 17.0f);
        ciVar.getEmojiButton().setLayoutParams(w7.z5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40, 83));
        ciVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        vVar.addView(ciVar, w7.z5.e(-1, -2, 119));
        vVar.setAlpha(0.0f);
        vVar.setVisibility(8);
        zhVar.addView(imageView3, w7.z5.a(40.0f, 0.0f, 0.0f, 0.0f, 4.0f, 40, 85));
        dh.d c13 = this.J2.c(vVar, fh.c.n(d6Var), false);
        c13.q(AndroidUtilities.dp(22.0f));
        c13.p(AndroidUtilities.dp(7.0f));
        vVar.setBackground(c13);
        vVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        q6 q6Var3 = new q6(context, false, false, false);
        this.v = q6Var3;
        q6Var3.setScaleProperty(0.6f);
        q6Var3.setVisibility(8);
        q6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var3.setTextColor(getThemedColor(i25));
        q6Var3.setTypeface(AndroidUtilities.bold());
        q6Var3.setGravity(17);
        q6Var3.setAllowCancel(true);
        vVar.addView(q6Var3, w7.z5.a(20.0f, 3.0f, 45.0f, 3.0f, 0.0f, 56, 53));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.Xd), mode2));
        ciVar.addView(imageView5, w7.z5.a(40.0f, 0.0f, 0.0f, 60.0f, 0.0f, 40, 85));
        final int i29 = 2;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gi.f4 f4Var;
                switch (i29) {
                    case 0:
                        ti tiVar = this.b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        boolean z13 = tiVar2.c0;
                        if (!z13) {
                            tiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z14 = tiVar3.c0;
                        if (z14) {
                            tiVar3.K1(!z14, true);
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
                        ti.w(this.b);
                        break;
                    case 6:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        ti tiVar4 = this.b;
                        tiVar4.d2(tiVar4.B0 != tiVar4.q0);
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
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i26), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i27), 1, AndroidUtilities.dp(16.0f)));
        vVar.addView(imageView6, w7.z5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 85));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView6);
        final int i30 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i30) {
                    case 0:
                        final ti tiVar = this.b;
                        zh zhVar2 = tiVar.H0;
                        if (zhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), d6Var);
                            e0Var.n0(zhVar2.getText());
                            final int i212 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            zh zhVar22 = tiVar.H0;
                                            zhVar22.setText(charSequence);
                                            zhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ci ciVar2 = tiVar.S0;
                                            ciVar2.setText(charSequence);
                                            ciVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = tiVar.Z;
                            boolean z13 = tiVar.K1 != null;
                            mh mhVar = new mh(tiVar, 0);
                            e0Var.l0 = j10;
                            e0Var.m0 = z13;
                            e0Var.n0 = mhVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ti tiVar2 = this.b;
                        ci ciVar2 = tiVar2.S0;
                        if (ciVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), d6Var);
                            e0Var2.n0(ciVar2.getText());
                            final int i222 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i222) {
                                        case 0:
                                            zh zhVar22 = tiVar2.H0;
                                            zhVar22.setText(charSequence);
                                            zhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ci ciVar22 = tiVar2.S0;
                                            ciVar22.setText(charSequence);
                                            ciVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = tiVar2.Z;
                            boolean z14 = tiVar2.K1 != null;
                            mh mhVar2 = new mh(tiVar2, 1);
                            e0Var2.l0 = j11;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = mhVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ti tiVar3 = this.b;
                        tiVar3.n1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = tiVar3.f0;
                        t12.K2(null, n2Var2, d6Var);
                        PhotoViewer.t1().L2(tiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i232 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        t13.h = i232;
                        t13.n = z15;
                        if (!tiVar3.c2.v()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(tiVar3.getContainer().findFocus());
                        }
                        File w9 = ei.a8.w(tiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i242 = point.x;
                        int i252 = point.y;
                        if (i242 > 1080 || i252 > 1080) {
                            float min = Math.min(i242, i252) / 1080.0f;
                            i242 = (int) (i242 * min);
                            i252 = (int) (i252 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i242, i252, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().g2(arrayList3, 0, 11, false, new vh(tiVar3, photoEntry), n2Var2 instanceof org.telegram.ui.sn ? (org.telegram.ui.sn) n2Var2 : null);
                        if (tiVar3.G) {
                            PhotoViewer.t1().Y0(null, null, true, tiVar3.J);
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
        wh whVar4 = new wh(this, context, 3);
        this.K0 = whVar4;
        whVar4.setFocusable(true);
        whVar4.setFocusableInTouchMode(true);
        whVar4.setVisibility(4);
        whVar4.setScaleX(0.2f);
        whVar4.setScaleY(0.2f);
        whVar4.setAlpha(0.0f);
        whVar4.setClipChildren(false);
        whVar4.setClipToPadding(false);
        this.containerView.addView(whVar4, w7.z5.e(110, 50, 85));
        ei eiVar = new ei(R.drawable.send_plane_24, context, d6Var, this);
        this.L0 = eiVar;
        eiVar.setImportantForAccessibility(2);
        whVar4.addView(eiVar, w7.z5.e(-1, -1, 119));
        eiVar.setTranslationX(this.backgroundPaddingLeft);
        int dp4 = AndroidUtilities.dp(52.0f);
        int dp5 = AndroidUtilities.dp(38.0f);
        eiVar.I = dp4;
        eiVar.J = dp5;
        float dp6 = AndroidUtilities.dp(7.0f);
        float dp7 = AndroidUtilities.dp(6.0f);
        eiVar.M = dp6;
        eiVar.N = dp7;
        eiVar.h0 = true;
        final int i31 = 3;
        eiVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gi.f4 f4Var;
                switch (i31) {
                    case 0:
                        ti tiVar = this.b;
                        long j10 = tiVar.Z0;
                        if (j10 < 0 && (f4Var = (gi.f4) tiVar.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = f4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        boolean z13 = tiVar2.c0;
                        if (!z13) {
                            tiVar2.K1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z14 = tiVar3.c0;
                        if (z14) {
                            tiVar3.K1(!z14, true);
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
                        ti.w(this.b);
                        break;
                    case 6:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.w(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.n1.M(null, null);
                        break;
                    default:
                        ti tiVar4 = this.b;
                        tiVar4.d2(tiVar4.B0 != tiVar4.q0);
                        break;
                }
            }
        });
        eiVar.setOnLongClickListener(new org.telegram.ui.bg(this, context, d6Var, n2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        yh yhVar2 = new yh(this, context, 1);
        yhVar2.setAlpha(0.0f);
        yhVar2.setScaleX(0.2f);
        yhVar2.setScaleY(0.2f);
        if (z10) {
            e1();
            this.navBarColorKey = -1;
        }
        pl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        bh.b bVar6 = this.J2;
        eh.e n10 = fh.c.n(d6Var);
        im0 im0Var = fastScroll.o0;
        dh.d c14 = bVar6.c(im0Var.d1, n10, false);
        fastScroll.e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.e0.q(AndroidUtilities.dp(24.0f));
        dh.d c15 = bVar6.c(im0Var.d1, n10, false);
        fastScroll.f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f0.q(AndroidUtilities.dp(f7));
        le0 le0Var = new le0(context);
        this.S = le0Var;
        this.containerView.addView(le0Var, w7.z5.d(-1.0f, -1));
        eh.e eVar = new eh.e(d6Var);
        eVar.e = new dh(this, 4);
        eVar.c = new dh(this, 5);
        eVar.d = new dh(this, 6);
        eVar.b = new dh(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.n = dpf2;
        eVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f = dpf23;
        eVar.h = dpf24;
        z7Var.M(this.J2, eVar, false);
        lVar.h(1L, false);
    }

    public static void O(ti tiVar) {
        z7 z7Var = tiVar.a1;
        kh.f fVar = tiVar.y1;
        if (fVar == null || z7Var == null) {
            return;
        }
        li liVar = tiVar.C0;
        if (liVar == null) {
            liVar = tiVar.B0;
        }
        int i10 = 0;
        boolean z10 = liVar != null && (liVar instanceof al);
        org.telegram.ui.ActionBar.d6 d6Var = tiVar.resourcesProvider;
        boolean a2 = d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q();
        if (!z10 && z7Var.getVisibility() == 0) {
            i10 = (int) (z7Var.getAlpha() * (a2 ? 255 : 160));
        }
        fVar.setFadeTopAlpha(i10);
    }

    public static void S(ti tiVar) {
        ei.i iVar = new ei.i(tiVar, tiVar.getContext(), tiVar.Z, LaunchActivity.R(), tiVar.resourcesProvider, 1);
        tiVar.E2 = iVar;
        iVar.p(new ki.t1(tiVar, 14));
        ViewGroup viewGroup = tiVar.containerView;
        viewGroup.addView(tiVar.E2, viewGroup.indexOfChild(tiVar.G0), w7.z5.e(-1, -1, 83));
        ei.i iVar2 = tiVar.E2;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
        if (n2Var instanceof org.telegram.ui.sn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) n2Var;
            hg.j1 adapter = iVar2.getAdapter();
            snVar.i();
            TLRPC.Chat chat = snVar.e;
            adapter.getClass();
            adapter.l0 = chat;
            iVar2.getAdapter().W(snVar.Z7);
            iVar2.getAdapter().e0 = snVar.e != null;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().e0 = false;
        }
        iVar2.getAdapter().f0 = false;
        tiVar.Y1();
    }

    public static /* synthetic */ void n(ti tiVar, ValueAnimator valueAnimator) {
        tiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.d3 d3Var = tiVar.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
    }

    public static /* synthetic */ void p(ti tiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.z2 z2Var) {
        tiVar.currentSheetAnimation = null;
        tiVar.s2 = null;
        animationNotificationsLocker.unlock();
        tiVar.currentSheetAnimationType = 0;
        if (z2Var != null) {
            z2Var.onOpenAnimationEnd();
        }
        if (tiVar.useHardwareLayer) {
            tiVar.container.setLayerType(0, null);
        }
        if (tiVar.isFullscreen) {
            WindowManager.LayoutParams attributes = tiVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            tiVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x047b, code lost:
    
        if (r26 == null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x047d, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0481, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0482, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04a4, code lost:
    
        if (r26 == null) goto L195;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x049c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean q(ti tiVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.n2 n2Var, View view) {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        org.telegram.ui.sn snVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        boolean z10;
        boolean z11;
        MessageObject messageObject3;
        long j10;
        MessageObject messageObject4;
        ArrayList<Object> arrayList;
        HashMap<Object, Object> hashMap;
        String str;
        long j11;
        Throwable th2;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor;
        int i10;
        Throwable th3;
        String str2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        long j12;
        boolean z12;
        long j13;
        org.telegram.ui.sn snVar2;
        TLRPC.ChatFull chatFull;
        boolean z13;
        boolean z14;
        int i11;
        boolean z15;
        ei eiVar = tiVar.L0;
        org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = tiVar.j0;
        int i12 = tiVar.M1;
        long j14 = tiVar.Z;
        if ((j14 != 0 || (n2Var2 instanceof org.telegram.ui.sn)) && tiVar.K - tiVar.L >= 0 && !tiVar.h.f) {
            if (n2Var2 instanceof org.telegram.ui.sn) {
                org.telegram.ui.sn snVar3 = (org.telegram.ui.sn) n2Var2;
                TLRPC.User i13 = snVar3.i();
                MessageObject messageObject5 = snVar3.n5;
                MessageObject messageObject6 = snVar3.k5;
                if (!snVar3.c() && snVar3.R3 != 5) {
                    messageObject2 = messageObject6;
                    messageObject = messageObject5;
                    snVar = snVar3;
                    user = i13;
                    j14 = snVar3.a();
                }
            } else {
                user = MessagesController.getInstance(i12).getUser(Long.valueOf(j14));
                messageObject = null;
                messageObject2 = null;
                snVar = null;
            }
            mf mfVar = tiVar.h0;
            if (mfVar != null) {
                mfVar.dismiss();
            }
            mf mfVar2 = new mf(tiVar, context, d6Var, 1);
            tiVar.h0 = mfVar2;
            mfVar2.r(eiVar, false, new ai.v0(tiVar, n2Var, d6Var, 19));
            ArrayList arrayList2 = new ArrayList();
            li liVar = tiVar.B0;
            String str3 = "";
            int i14 = 2;
            if (liVar == chatAttachAlertPhotoLayout3 || liVar == tiVar.q0) {
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
                    int i15 = 0;
                    int i16 = 0;
                    z10 = false;
                    z11 = false;
                    while (i15 < ceil) {
                        int i17 = i15 * 10;
                        MessageObject messageObject8 = messageObject7;
                        MessageObject messageObject9 = messageObject2;
                        int i18 = ceil;
                        int min = Math.min(10, selectedPhotos.size() - i17);
                        HashMap<Object, Object> hashMap2 = selectedPhotos;
                        long nextLong = Utilities.random.nextLong();
                        int i19 = i16;
                        int i20 = i15;
                        int i21 = 0;
                        while (i21 < min) {
                            int i22 = min;
                            int i23 = i17 + i21;
                            int i24 = i21;
                            if (i23 >= selectedPhotosOrder.size()) {
                                j11 = j14;
                                str = str3;
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
                                str = str3;
                                tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                                tL_message.peer_id = MessagesController.getInstance(i12).getPeer(j14);
                                boolean z16 = photoEntry.isVideo;
                                if (z16 || (str2 = photoEntry.imagePath) == null) {
                                    String str4 = photoEntry.path;
                                    if (str4 != null) {
                                        tL_message.attachPath = str4;
                                    }
                                } else {
                                    tL_message.attachPath = str2;
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
                                                        i10 = 0;
                                                        parcelFileDescriptor = null;
                                                        photoEntry.videoOrientation = i10;
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
                                                        i10 = 0;
                                                        photoEntry.videoOrientation = i10;
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
                                                    } catch (Throwable th7) {
                                                        th3 = th7;
                                                        th2 = th3;
                                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                                        if (mediaMetadataRetriever != null) {
                                                            try {
                                                                mediaMetadataRetriever.release();
                                                            } catch (IOException e12) {
                                                                FileLog.e(e12);
                                                            }
                                                        }
                                                        if (parcelFileDescriptor == null) {
                                                            throw th2;
                                                        }
                                                        try {
                                                            parcelFileDescriptor.close();
                                                            throw th2;
                                                        } catch (IOException e13) {
                                                            FileLog.e(e13);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    i10 = 0;
                                                    photoEntry.videoOrientation = i10;
                                                    FileLog.e(e);
                                                    if (mediaMetadataRetriever2 != null) {
                                                        try {
                                                            mediaMetadataRetriever2.release();
                                                        } catch (IOException e15) {
                                                            FileLog.e(e15);
                                                        }
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
                                String charSequence2 = charSequence == null ? str : charSequence.toString();
                                tL_message.message = charSequence2;
                                if (TextUtils.isEmpty(charSequence2) && i20 == 0 && i24 == 0) {
                                    CharSequence[] charSequenceArr = {tiVar.o1().getText()};
                                    MessageObject.addLinks(true, charSequenceArr[0]);
                                    tL_message.entities = MediaDataController.getInstance(i12).getEntities(charSequenceArr, true);
                                    tL_message.message = charSequenceArr[0].toString();
                                }
                                if (i20 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                    if (messageObject9 != null) {
                                        tL_messageReplyHeader.flags |= 2;
                                        tL_messageReplyHeader.reply_to_top_id = messageObject9.getId();
                                    }
                                    tL_messageReplyHeader.flags |= 16;
                                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                    tL_message.reply_to = tL_messageReplyHeader;
                                }
                                MessageObject messageObject10 = new MessageObject(i12, tL_message, true, false);
                                if (i20 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
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
                            str3 = str;
                            j14 = j11;
                        }
                        i15 = i20 + 1;
                        i16 = i19;
                        ceil = i18;
                        messageObject2 = messageObject9;
                        messageObject7 = messageObject8;
                        selectedPhotos = hashMap2;
                    }
                    messageObject3 = messageObject7;
                }
                j10 = j14;
                messageObject4 = messageObject3;
            } else {
                if (liVar == tiVar.k0) {
                    if (TextUtils.isEmpty(tiVar.o1().getText())) {
                        i11 = 0;
                        z15 = false;
                    } else {
                        TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                        tL_message2.id = 0;
                        tL_message2.out = true;
                        tL_message2.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                        tL_message2.peer_id = MessagesController.getInstance(i12).getPeer(j14);
                        CharSequence[] charSequenceArr2 = {tiVar.o1().getText()};
                        MessageObject.addLinks(true, charSequenceArr2[0]);
                        tL_message2.entities = MediaDataController.getInstance(i12).getEntities(charSequenceArr2, true);
                        tL_message2.message = charSequenceArr2[0].toString();
                        MessageObject messageObject11 = new MessageObject(i12, tL_message2, true, false);
                        messageObject11.sendPreview = true;
                        messageObject11.notime = true;
                        messageObject11.isOutOwnerCached = Boolean.TRUE;
                        arrayList2.add(messageObject11);
                        i11 = 1;
                        z15 = true;
                    }
                    ArrayList<TLRPC.User> selected = tiVar.k0.getSelected();
                    int i29 = 0;
                    while (i29 < selected.size()) {
                        TLRPC.User user2 = selected.get(i29);
                        TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                        int i30 = i11 + 1;
                        tL_message3.id = i11;
                        ArrayList<TLRPC.User> arrayList3 = selected;
                        tL_message3.out = true;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout4 = chatAttachAlertPhotoLayout3;
                        tL_message3.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                        tL_message3.peer_id = MessagesController.getInstance(i12).getPeer(j14);
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
                        MessageObject messageObject12 = new MessageObject(i12, tL_message3, true, false);
                        messageObject12.sendPreview = true;
                        messageObject12.notime = true;
                        messageObject12.isOutOwnerCached = Boolean.TRUE;
                        arrayList2.add(messageObject12);
                        i29++;
                        selected = arrayList3;
                        i11 = i30;
                        chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout4;
                        z15 = true;
                    }
                    chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                    j10 = j14;
                    z11 = z15;
                    messageObject4 = null;
                } else {
                    chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                    if (liVar == tiVar.p0) {
                        messageObject4 = null;
                        boolean z17 = false;
                        int i31 = 0;
                        for (int i32 = 0; i32 < tiVar.p0.S.size(); i32++) {
                            String str5 = (String) tiVar.p0.S.get(i32);
                            if (str5 != null) {
                                int lastIndexOf = str5.lastIndexOf(File.separator);
                                String substring = lastIndexOf < 0 ? str5 : str5.substring(lastIndexOf + 1);
                                if (!TextUtils.isEmpty(substring)) {
                                    TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                                    int i33 = i31 + 1;
                                    tL_message4.id = i31;
                                    tL_message4.out = true;
                                    tL_message4.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                                    tL_message4.peer_id = MessagesController.getInstance(i12).getPeer(j14);
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
                                        CharSequence[] charSequenceArr3 = {tiVar.o1().getText()};
                                        tL_message4.entities = MediaDataController.getInstance(i12).getEntities(charSequenceArr3, true);
                                        tL_message4.message = charSequenceArr3[0].toString();
                                    } else {
                                        z13 = true;
                                        z14 = false;
                                    }
                                    MessageObject messageObject13 = new MessageObject(i12, tL_message4, z13, z14);
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
                        fj fjVar = tiVar.l0;
                        if (liVar == fjVar) {
                            arrayList2.addAll(fjVar.getSelected());
                            if (!arrayList2.isEmpty()) {
                                messageObject4 = (MessageObject) arrayList2.get(0);
                                CharSequence[] charSequenceArr4 = {tiVar.o1().getText()};
                                MessageObject.addLinks(true, charSequenceArr4[0]);
                                messageObject4.messageOwner.entities = MediaDataController.getInstance(i12).getEntities(charSequenceArr4, true);
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
            i80 F = i80.F(tiVar.containerView, d6Var, eiVar);
            if (messageObject4 != null) {
                li liVar2 = tiVar.B0;
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (liVar2 == chatAttachAlertPhotoLayout2 || liVar2 == tiVar.q0) {
                    nc0 nc0Var = new nc0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), d6Var);
                    TLRPC.Message message = messageObject4.messageOwner;
                    boolean z18 = tiVar.c0;
                    message.invert_media = z18;
                    nc0Var.a(!z18, false);
                    nc0Var.setOnClickListener(new ai.v0(tiVar, messageObject4, nc0Var, 20));
                    F.q(nc0Var);
                    if (tiVar.K1 == null) {
                        F.k();
                    }
                }
            } else {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            }
            boolean isUserSelf = UserObject.isUserSelf(user);
            if (tiVar.K1 != null || ((snVar != null && ChatObject.isMonoForum(snVar.e)) || ((snVar == null || !snVar.G6()) && !tiVar.B0.c()))) {
                j12 = j10;
            } else {
                j12 = j10;
                F.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new a3.i0(tiVar, j12, d6Var, 21), false);
            }
            li liVar3 = tiVar.B0;
            if (liVar3 == chatAttachAlertPhotoLayout2 || liVar3 == tiVar.q0) {
                z12 = true;
                if (liVar3.getSelectedItemsCount() == 1 && snVar != null && ChatObject.isMonoForum(snVar.e)) {
                    snVar2 = snVar;
                    j13 = j12;
                    F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new ai.c3(tiVar, j12, snVar2, d6Var, 16), false);
                } else {
                    j13 = j12;
                    snVar2 = snVar;
                }
            } else {
                j13 = j12;
                snVar2 = snVar;
                z12 = true;
            }
            if (tiVar.K1 == null && !isUserSelf) {
                F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new gh(tiVar, i14), false);
            }
            if (tiVar.K1 == null && z10 && snVar2 != null && ChatObject.isChannelAndNotMegaGroup(snVar2.e) && (chatFull = snVar2.Z7) != null && chatFull.paid_media_allowed) {
                F.c(R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton), null, false);
                org.telegram.ui.ActionBar.e1 y3 = F.y();
                y3.setOnClickListener(new ci.c4(tiVar, context, y3, d6Var, 12));
                long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
                if (starsPrice > 0) {
                    y3.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    y3.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
                } else {
                    y3.setText(LocaleController.getString(R.string.PaidMediaButton));
                    y3.setSubtext(null);
                }
                tiVar.h0.s(starsPrice);
            }
            F.Y();
            tiVar.h0.p(F);
            tiVar.h0.q(arrayList2);
            if (tiVar.K1 == null && j13 >= 0 && z11) {
                tiVar.h0.d(n2Var);
                tiVar.h0.o(tiVar.Q0);
            }
            tiVar.h0.show();
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            return z12;
        }
        return false;
    }

    public static void r(ti tiVar) {
        o1.k kVar = tiVar.s2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(tiVar.containerView, o1.h.n, 0.0f);
        tiVar.s2 = kVar2;
        kVar2.u.a(1.5f);
        tiVar.s2.u.b(1500.0f);
        tiVar.s2.h();
    }

    public static /* synthetic */ void s(ti tiVar, lg lgVar) {
        AnimatorSet animatorSet = tiVar.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        lgVar.run();
    }

    public static /* synthetic */ void t(ti tiVar, int i10) {
        tiVar.navBarColorKey = -1;
        tiVar.navBarColor = i10;
        tiVar.containerView.invalidate();
    }

    public static /* synthetic */ void v(ti tiVar) {
        tiVar.currentSheetAnimation = null;
        tiVar.currentSheetAnimationType = 0;
        tiVar.dismissInternal();
    }

    public static boolean v1(TLRPC.User user) {
        return (user == null || UserObject.isUserSelf(user) || UserObject.isBot(user) || UserObject.isDeleted(user) || UserObject.isService(user.id) || UserObject.isReplyUser(user) || UserObject.isAnonymous(user) || user.id == UserObject.VERIFY || MessagesController.isSupportUser(user)) ? false : true;
    }

    public static void w(ti tiVar) {
        if (tiVar.j0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.j0;
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
                            if (childAt instanceof org.telegram.ui.Cells.s5) {
                                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                                if (s5Var.getPhotoEntry() == photoEntry) {
                                    s5Var.getImageView().invalidate();
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
        tiVar.c2(true);
        org.telegram.ui.ActionBar.u0 u0Var = tiVar.f1;
        ei.x3 x3Var = tiVar.g1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        ei.x3 x3Var2 = new ei.x3(tiVar.getContext(), 1);
        tiVar.g1 = x3Var2;
        x3Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(!S ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        tiVar.g1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        tiVar.g1.m(1.0f, -((tiVar.containerView.getWidth() - ((u0Var.getWidth() / 2.0f) + u0Var.getX())) - AndroidUtilities.dp(14.0f)));
        tiVar.g1.setTranslationY(tiVar.d1.getTranslationY());
        ei.x3 x3Var3 = tiVar.g1;
        x3Var3.l0 = new ee(3, tiVar, x3Var2);
        tiVar.containerView.addView(x3Var3, w7.z5.a(60.0f, 0.0f, 46.0f, 0.0f, 0.0f, -1, 48));
        tiVar.g1.u();
    }

    public static /* synthetic */ void x(ti tiVar, boolean z10, gh ghVar) {
        tiVar.B0.v(1.0f);
        tiVar.C0.v(1.0f);
        tiVar.B0.l(tiVar.o2);
        tiVar.C0.l(tiVar.o2);
        tiVar.containerView.invalidate();
        tiVar.a1.setTag(z10 ? 1 : null);
        ghVar.run();
    }

    public static void y(ti tiVar, org.telegram.ui.ActionBar.d6 d6Var, View view) {
        xh xhVar = tiVar.B1;
        li[] liVarArr = tiVar.z0;
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
        org.telegram.ui.ActionBar.n2 R = n2Var == null ? LaunchActivity.R() : n2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (view instanceof ni) {
            Activity parentActivity = R.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!tiVar.O1 && !tiVar.P1 && tiVar.c1()) {
                    return;
                }
                if (!tiVar.O1 && !tiVar.P1) {
                    go goVar = new go(1, tiVar.getContext(), d6Var, tiVar);
                    tiVar.T = goVar;
                    tiVar.U1(goVar);
                }
                tiVar.U1(tiVar.j0);
            } else if (intValue == 17) {
                if (tiVar.w0 == null && (n2Var instanceof org.telegram.ui.sn)) {
                    TLRPC.User i10 = ((org.telegram.ui.sn) n2Var).i();
                    if (v1(i10)) {
                        al alVar = new al(tiVar, tiVar.getContext(), tiVar.M1, i10, d6Var);
                        tiVar.w0 = alVar;
                        liVarArr[11] = alVar;
                    }
                }
                li liVar = tiVar.w0;
                if (liVar != null) {
                    tiVar.U1(liVar);
                }
            } else if (intValue == 3) {
                if (!tiVar.Q1 && tiVar.c1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(tiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                tiVar.E1(true);
            } else if (intValue == 4) {
                if (!tiVar.N1 && tiVar.c1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(tiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                tiVar.H1(true);
            } else if (intValue == 5) {
                if (!tiVar.T1 && tiVar.c1()) {
                    return;
                }
                if (tiVar.T1 && tiVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(tiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                tiVar.G1();
            } else if (intValue == 6) {
                if ((!tiVar.T1 && tiVar.c1()) || !AndroidUtilities.isMapsInstalled(n2Var)) {
                    return;
                }
                if (tiVar.T1) {
                    if (tiVar.o0 == null) {
                        rl rlVar = new rl(tiVar, tiVar.getContext(), d6Var, (tiVar.H || tiVar.U1) ? false : true);
                        tiVar.o0 = rlVar;
                        liVarArr[5] = rlVar;
                        ml mlVar = tiVar.w2;
                        if (mlVar != null) {
                            rlVar.setDelegate(mlVar);
                        } else {
                            rlVar.setDelegate(new dh(tiVar, 9));
                        }
                    }
                    tiVar.U1(tiVar.o0);
                } else {
                    go goVar2 = new go(6, tiVar.getContext(), d6Var, tiVar);
                    tiVar.T = goVar2;
                    tiVar.U1(goVar2);
                }
            } else if (intValue == 9) {
                if (!tiVar.R1 && tiVar.c1()) {
                    return;
                }
                if (tiVar.R1) {
                    tiVar.W1(true, null);
                } else {
                    go goVar3 = new go(9, tiVar.getContext(), d6Var, tiVar);
                    tiVar.T = goVar3;
                    tiVar.U1(goVar3);
                }
            } else if (intValue == 11) {
                if (tiVar.s0 == null) {
                    ig.i0 i0Var = new ig.i0(tiVar.getContext(), tiVar.resourcesProvider, tiVar);
                    tiVar.s0 = i0Var;
                    liVarArr[7] = i0Var;
                    i0Var.setupBlurredSearchField(tiVar.J2);
                }
                tiVar.U1(tiVar.s0);
            } else if (intValue == 12) {
                if (!tiVar.S1 && tiVar.c1()) {
                    return;
                }
                if (tiVar.S1) {
                    if (tiVar.n0 == null) {
                        fo foVar = new fo(tiVar, tiVar.getContext(), true, d6Var, null);
                        tiVar.n0 = foVar;
                        liVarArr[1] = foVar;
                        foVar.setDelegate(new dh(tiVar, 10));
                    }
                    tiVar.U1(tiVar.n0);
                } else {
                    go goVar4 = new go(9, tiVar.getContext(), d6Var, tiVar);
                    tiVar.T = goVar4;
                    tiVar.U1(goVar4);
                }
            } else if (intValue == 13) {
                if (tiVar.u0 == null) {
                    ok okVar = new ok(tiVar, tiVar.getContext(), d6Var, true);
                    tiVar.u0 = okVar;
                    liVarArr[8] = okVar;
                    okVar.setDelegate(tiVar.d2);
                }
                tiVar.U1(tiVar.u0);
            } else if (intValue == 14) {
                if (tiVar.t0 == null) {
                    ok okVar2 = new ok(tiVar, tiVar.getContext(), d6Var, false);
                    tiVar.t0 = okVar2;
                    liVarArr[9] = okVar2;
                    okVar2.setDelegate(tiVar.d2);
                }
                tiVar.U1(tiVar.t0);
            } else if (intValue == 16) {
                if (tiVar.v0 == null) {
                    ki.q qVar = new ki.q(tiVar.M1, tiVar.getContext(), d6Var, tiVar);
                    tiVar.v0 = qVar;
                    liVarArr[10] = qVar;
                }
                tiVar.U1(tiVar.v0);
            } else if (view.getTag() instanceof Integer) {
                tiVar.c2.b0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, tiVar.u1(), false, 0L);
            }
        } else if (view instanceof mi) {
            mi miVar = (mi) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = miVar.c;
            if (tL_attachMenuBot == null) {
                tiVar.c2.X(miVar.b);
                tiVar.dismiss();
            } else if (tL_attachMenuBot.inactive) {
                bi1.a(tiVar.getContext(), new org.telegram.ui.ActionBar.j3(22, tiVar, miVar), null);
            } else {
                tiVar.R1(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int dp = AndroidUtilities.dp(70.0f);
        int i11 = left - dp;
        if (i11 < 0) {
            xhVar.v0(i11, 0, null);
            return;
        }
        int i12 = right + dp;
        if (i12 > xhVar.getMeasuredWidth()) {
            xhVar.v0(i12 - xhVar.getMeasuredWidth(), 0, null);
        }
    }

    public static /* synthetic */ void z(ti tiVar) {
        li liVar;
        bn bnVar;
        tiVar.w1 = null;
        li liVar2 = tiVar.B0;
        if (liVar2 != tiVar.j0 && (liVar = tiVar.C0) != (bnVar = tiVar.q0) && liVar2 != liVar && liVar2 != bnVar) {
            tiVar.containerView.removeView(liVar2);
        }
        tiVar.B0.setVisibility(8);
        tiVar.B0.s();
        tiVar.C0.I();
        tiVar.B0 = tiVar.C0;
        tiVar.C0 = null;
        int[] iArr = tiVar.e2;
        iArr[0] = iArr[1];
        tiVar.K1(tiVar.c0, false);
        tiVar.a2();
    }

    public final void A1() {
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.z0;
            if (i10 >= liVarArr.length) {
                this.i2 = true;
                return;
            }
            li liVar = liVarArr[i10];
            if (liVar != null) {
                liVar.A();
            }
            i10++;
        }
    }

    public final void B1() {
        int i10 = 0;
        this.i2 = false;
        while (true) {
            li[] liVarArr = this.z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar != null) {
                liVar.C();
            }
            i10++;
        }
        if (isShowing()) {
            this.c2.v();
        }
        qi qiVar = this.D1;
        if (qiVar != null) {
            qiVar.l();
        }
    }

    public final void C1() {
        MessageObject messageObject = this.K1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        int i10 = this.M1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.K1.getDialogId()) && (n2Var instanceof org.telegram.ui.sn)) {
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) n2Var;
            MessageSuggestionParams messageSuggestionParams = snVar.g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.K1.messageOwner.suggested_post);
            }
            if (!ai.fa.U(i10, messageSuggestionParams.amount)) {
                snVar.Xb(messageSuggestionParams);
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
        if (this.K1 == null && (n2Var instanceof org.telegram.ui.sn)) {
            org.telegram.ui.sn snVar2 = (org.telegram.ui.sn) n2Var;
            if (snVar2.c()) {
                f5.L(getContext(), snVar2.a(), new dh(this, 12), this.resourcesProvider);
                return;
            }
        }
        li liVar = this.B0;
        if (liVar == this.j0 || liVar == this.q0) {
            J1(0, true, 0, u1(), this.Q0);
            return;
        }
        if (liVar.K(0, true, 0, u1(), this.Q0)) {
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
                rl rlVar = new rl(this, getContext(), this.resourcesProvider, (this.H || this.U1) ? false : true);
                this.o0 = rlVar;
                this.z0[5] = rlVar;
                ml mlVar = this.w2;
                if (mlVar != null) {
                    rlVar.setDelegate(mlVar);
                } else if (n2Var instanceof org.telegram.ui.sn) {
                    rlVar.setDelegate(new dh(this, 16));
                }
            }
            U1(this.o0);
        }
    }

    public final void E1(boolean z10) {
        if (!this.Q1 && z10) {
            go goVar = new go(3, getContext(), this.resourcesProvider, this);
            this.T = goVar;
            U1(goVar);
        }
        int i10 = 1;
        if (this.l0 == null) {
            fj fjVar = new fj(getContext(), this.resourcesProvider, this);
            this.l0 = fjVar;
            this.z0[3] = fjVar;
            fjVar.setupBlurredSearchField(this.J2);
            this.l0.setDelegate(new dh(this, 13));
            if (this.H) {
                this.l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.sn) {
            TLRPC.Chat chat = ((org.telegram.ui.sn) n2Var).e;
            fj fjVar2 = this.l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                i10 = -1;
            }
            fjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            U1(this.l0);
        }
    }

    public final void F1() {
        if (this.r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
            ij ijVar = new ij(context, d6Var, this);
            ijVar.r = AndroidUtilities.dp(80.0f);
            ijVar.w = 3;
            ai.u1 u1Var = new ai.u1(ijVar, context, d6Var, 12);
            ijVar.n = u1Var;
            za zaVar = new za(ijVar, context);
            ijVar.v = zaVar;
            u1Var.setAdapter(zaVar);
            u1Var.setClipToPadding(false);
            u1Var.setItemAnimator(null);
            u1Var.setLayoutAnimation(null);
            u1Var.setVerticalScrollBarEnabled(false);
            u1Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A5, ijVar.a));
            ijVar.addView(u1Var, w7.z5.d(-1.0f, -1));
            u1Var.setOnScrollListener(new ah.d0(ijVar, 22));
            di.k kVar = new di.k(ijVar, ijVar.r, 1);
            ijVar.s = kVar;
            kVar.O = new ai.q1(ijVar, 3);
            u1Var.setLayoutManager(kVar);
            this.r0 = ijVar;
            ijVar.setDelegate(new gb(this, 1));
        }
        U1(this.r0);
    }

    public final void G1() {
        if (!this.T1) {
            go goVar = new go(5, getContext(), this.resourcesProvider, this);
            this.T = goVar;
            U1(goVar);
        }
        if (this.k0 == null) {
            xj xjVar = new xj(getContext(), this.resourcesProvider, this);
            this.k0 = xjVar;
            this.z0[2] = xjVar;
            xjVar.setupBlurredSearchField(this.J2);
            this.k0.setDelegate(new fi(this));
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.sn) {
            TLRPC.Chat chat = ((org.telegram.ui.sn) n2Var).e;
            this.k0.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        U1(this.k0);
    }

    public final void H1(boolean z10) {
        if (!this.N1 && z10) {
            go goVar = new go(4, getContext(), this.resourcesProvider, this);
            this.T = goVar;
            U1(goVar);
        }
        boolean z11 = false;
        if (this.p0 == null) {
            nk nkVar = new nk(this.N ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.p0 = nkVar;
            this.z0[4] = nkVar;
            nkVar.setDelegate(new gi(this));
        }
        int i10 = 1;
        if (this.H) {
            this.p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.f0;
            if (n2Var instanceof org.telegram.ui.sn) {
                TLRPC.Chat chat = ((org.telegram.ui.sn) n2Var).e;
                nk nkVar2 = this.p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                    i10 = -1;
                }
                nkVar2.setMaxSelectedFiles(i10);
            } else {
                this.p0.setMaxSelectedFiles(this.V1);
                nk nkVar3 = this.p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                nkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        nk nkVar4 = this.p0;
        nkVar4.d0 = this.N;
        if (z10) {
            U1(nkVar4);
        }
    }

    public final void I1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        z7 z7Var = this.a1;
        int i10 = 1;
        if (z7Var.n0) {
            z7Var.h(true);
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
            li[] liVarArr = this.z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar != null) {
                liVar.o();
                this.containerView.removeView(liVarArr[i10]);
                liVarArr[i10] = null;
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

    public final boolean J1(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        if (this.L1) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.sn) {
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) n2Var;
            TLRPC.Chat chat = snVar.e;
            if (snVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(this.M1).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + snVar.a(), !z10).commit();
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
        li liVar = this.B0;
        return f5.a0(this.M1, p12, l1() + (liVar != null ? liVar.getSelectedItemsCount() : 1), new Utilities.Callback() { // from class: org.telegram.ui.Components.qh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ti tiVar = ti.this;
                tiVar.L1 = true;
                tiVar.c2.b0(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void K1(boolean z10, boolean z11) {
        this.b.a(z10, z11);
        qu o12 = o1();
        this.c0 = z10;
        qu o13 = o1();
        final boolean z12 = this.G0.getTag() != null;
        li liVar = this.B0;
        final boolean z13 = this.c0 && (liVar == this.j0 || liVar == this.q0);
        ah.v vVar = this.R0;
        ig.j jVar = this.F0;
        if (z11) {
            vVar.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = vVar.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            bs bsVar = bs.h;
            final int i10 = 0;
            duration.setInterpolator(bsVar).setUpdateListener(new eh(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.fh
                public final /* synthetic */ ti b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            ti tiVar = this.b;
                            if (!z13 || !z12) {
                                tiVar.R0.setVisibility(8);
                            }
                            tiVar.f2();
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
            ViewPropertyAnimator interpolator = jVar.animate().translationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(bsVar);
            final int i11 = 1;
            interpolator.setUpdateListener(new eh(this, i11)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.fh
                public final /* synthetic */ ti b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            ti tiVar = this.b;
                            if (!z13 || !z12) {
                                tiVar.R0.setVisibility(8);
                            }
                            tiVar.f2();
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
            o13.setText(a6.cloneSpans(o12.getText()));
            o13.getEditText().setAllowTextEntitiesIntersection(o12.getEditText().getAllowTextEntitiesIntersection());
            if (o12.getEditText().isFocused()) {
                o13.getEditText().requestFocus();
                o13.getEditText().setSelection(o12.getEditText().getSelectionStart(), o12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new gh(this, 0));
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
        al alVar = this.w0;
        if (alVar != null) {
            alVar.setSendTransitionProgress(f7);
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
        int o10 = i0.b.o(getThemedColor(org.telegram.ui.ActionBar.h6.a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.navBarColor = o10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, o10, false);
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
            ti tiVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.g1 = (tiVar.T0 == 0 || tiVar.F) ? false : true;
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
            if ((n2Var instanceof org.telegram.ui.sn) && !((org.telegram.ui.sn) n2Var).x()) {
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
                bs bsVar = bs.h;
                scaleY.setInterpolator(bsVar).setDuration(420L).withEndAction(new ph(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(bsVar).setDuration(420L).withEndAction(new ph(this, z11, 2)).start();
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0275  */
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
        int i10 = 1;
        if (longSparseArray.get(j10) != null && Objects.equals(str, ((gi.f4) longSparseArray.get(j10)).getStartCommand())) {
            gi.f4 f4Var = (gi.f4) longSparseArray.get(j10);
            if (f4Var.H) {
                f4Var.H = false;
            }
            z12 = true;
            if (longSparseArray.get(j10) != null) {
                ((gi.f4) longSparseArray.get(j10)).J.setSwipeOffsetAnimationDisallowed(z12);
                V1((li) longSparseArray.get(j10), -j10, z11);
                if (z10) {
                    gi.f4 f4Var2 = (gi.f4) longSparseArray.get(j10);
                    TLRPC.User user = MessagesController.getInstance(f4Var2.F).getUser(Long.valueOf(f4Var2.v));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(f4Var2.F).getAttachMenuBots().bots;
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
                        if (tL_attachMenuBot.bot_id == f4Var2.v) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z13 = tL_attachMenuBot.show_in_side_menu;
                    AndroidUtilities.runOnUIThread(new ei.p6(21, f4Var2, (z13 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name) : z13 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.sn) {
            Context context = getContext();
            org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
            gi.f4 f4Var3 = new gi.f4(context, d6Var, this);
            f4Var3.U = new gi.w3(f4Var3, 2);
            org.telegram.ui.ActionBar.u0 a2 = f4Var3.b.a1.n().a(0, R.drawable.ic_ab_other);
            f4Var3.K = a2;
            a2.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
            org.telegram.ui.ActionBar.e1 e = a2.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
            f4Var3.L = e;
            e.setVisibility(8);
            a2.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
            org.telegram.ui.ActionBar.e1 e7 = a2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            f4Var3.M = e7;
            e7.setVisibility(8);
            a2.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
            a2.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
            a2.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
            gi.v2 v2Var = new gi.v2(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, f4Var3.a), 1, context, f4Var3, d6Var);
            f4Var3.n = v2Var;
            gi.u2 u2Var = new gi.u2(f4Var3, context, i10);
            f4Var3.J = u2Var;
            u2Var.addView(v2Var, w7.z5.d(-1.0f, -1));
            z12 = true;
            int i12 = 3;
            u2Var.setScrollListener(new gi.w3(f4Var3, i12));
            int i13 = 4;
            u2Var.setScrollEndListener(new gi.w3(f4Var3, i13));
            u2Var.setDelegate(new gi.y3(f4Var3));
            u2Var.setIsKeyboardVisible(new gi.y3(f4Var3));
            f4Var3.addView(u2Var, w7.z5.d(-1.0f, -1));
            gi.z3 z3Var = new gi.z3(context, d6Var);
            f4Var3.I = z3Var;
            f4Var3.addView(z3Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 84.0f, -1, 80));
            v2Var.setWebViewProgressListener(new ai.q7(f4Var3, i12));
            NotificationCenter.getGlobalInstance().addObserver(f4Var3, NotificationCenter.didSetNewTheme);
            longSparseArray.put(j10, f4Var3);
            ((gi.f4) longSparseArray.get(j10)).setDelegate(new ai(this, f4Var3, str, j10));
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) n2Var;
            MessageObject replyingMessageObject = snVar.Y.getReplyingMessageObject();
            gi.f4 f4Var4 = (gi.f4) longSparseArray.get(j10);
            long a10 = snVar.a();
            int i14 = replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0;
            long S8 = snVar.S8();
            gi.v2 v2Var2 = f4Var4.n;
            int i15 = this.M1;
            f4Var4.F = i15;
            f4Var4.w = a10;
            f4Var4.v = j10;
            f4Var4.y = i14;
            f4Var4.E = S8;
            f4Var4.G = str;
            org.telegram.ui.ActionBar.e1 e1Var = f4Var4.M;
            if (e1Var != null) {
                if (MediaDataController.getInstance(i15).canCreateAttachedMenuBotShortcut(j10)) {
                    e1Var.setVisibility(0);
                } else {
                    e1Var.setVisibility(8);
                }
            }
            v2Var2.setBotUser(MessagesController.getInstance(i15).getUser(Long.valueOf(j10)));
            v2Var2.s(i15, j10);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(i15).getInputPeer(a10);
            tL_messages_requestWebView.bot = MessagesController.getInstance(i15).getInputUser(j10);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a10 < 0 && (chatFull = MessagesController.getInstance(i15).getChatFull(-a10)) != null && (peer = chatFull.default_send_as) != null) {
                tL_messages_requestWebView.send_as = MessagesController.getInstance(i15).getInputPeer(peer);
                tL_messages_requestWebView.flags |= 8192;
            }
            if (str != null) {
                tL_messages_requestWebView.start_param = str;
                tL_messages_requestWebView.flags |= 8;
            }
            if (i14 != 0) {
                TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(i15).createReplyInput(i14);
                tL_messages_requestWebView.reply_to = createReplyInput;
                if (S8 != 0) {
                    createReplyInput.monoforum_peer_id = MessagesController.getInstance(i15).getInputPeer(S8);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (S8 != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(i15).getInputPeer(S8);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject q6 = gi.d3.q(f4Var4.a, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i15).sendRequest(tL_messages_requestWebView, new ai.m2(f4Var4, i15, i13));
            NotificationCenter.getInstance(i15).addObserver(f4Var4, NotificationCenter.webViewResultSent);
            if (longSparseArray.get(j10) != null) {
            }
        }
        z12 = true;
        if (longSparseArray.get(j10) != null) {
        }
    }

    public final void S1(org.telegram.ui.ActionBar.n2 n2Var) {
        if ((n2Var instanceof org.telegram.ui.sn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.sn) n2Var).e)) {
            new xc(this.u1, this.resourcesProvider).f(MessagesController.getInstance(this.M1).captionLengthLimitPremium, new ee(4, this, n2Var)).j();
        }
    }

    public final boolean T1(boolean z10, boolean z11) {
        float f7;
        int i10;
        li liVar;
        z7 z7Var;
        this.c.a(z10, true);
        wh whVar = this.G0;
        if (z10 == (whVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.P0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        whVar.setTag(z10 ? 1 : null);
        zh zhVar = this.H0;
        if (zhVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(zhVar.getEditText());
        }
        zhVar.k(true);
        this.S0.k(true);
        wh whVar2 = this.A1;
        wh whVar3 = this.K0;
        if (z10) {
            if (!this.N) {
                whVar.setVisibility(0);
            }
            whVar3.setVisibility(0);
        } else if (this.V0) {
            whVar2.setVisibility(0);
        }
        li liVar2 = this.B0;
        boolean z12 = (liVar2 == this.j0 || liVar2 == this.q0) && this.c0;
        z7 z7Var2 = this.a1;
        ah.v vVar = this.R0;
        ig.j jVar = this.F0;
        ei eiVar = this.L0;
        if (z11) {
            this.P0 = new AnimatorSet();
            if (z12) {
                vVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(whVar, (Property<wh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<ig.j, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                z7Var = z7Var2;
            } else {
                jVar.setVisibility(0);
                z7Var = z7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<ig.j, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(vVar, (Property<ah.v, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(whVar3, (Property<wh, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(whVar3, (Property<wh, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(whVar3, (Property<wh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(eiVar, (Property<ei, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(eiVar, (Property<ei, Float>) property3, z10 ? 1.0f : 0.2f));
            if (z7Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(whVar, (Property<wh, Float>) View.TRANSLATION_Y, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.V0) {
                arrayList.add(ObjectAnimator.ofFloat(whVar2, (Property<wh, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(whVar2, (Property<wh, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new eh(this, 5));
                arrayList.add(ofFloat);
            }
            this.P0.playTogether(arrayList);
            this.P0.setInterpolator(new DecelerateInterpolator());
            this.P0.setDuration(180L);
            this.P0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.P0.start();
            i10 = 0;
        } else {
            whVar.setAlpha(z10 ? 1.0f : 0.0f);
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
            whVar3.setScaleX(z10 ? 1.0f : 0.2f);
            whVar3.setScaleY(z10 ? 1.0f : 0.2f);
            whVar3.setAlpha(z10 ? 1.0f : f7);
            vVar.setVisibility((z10 && z12) ? i10 : 8);
            vVar.setAlpha((z10 && z12) ? 1.0f : f7);
            eiVar.setScaleX(z10 ? 1.0f : 0.2f);
            eiVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (z7Var2.getTag() != null) {
                whVar.setTranslationY(z10 ? f7 : AndroidUtilities.dp(48.0f));
            } else if (this.V0 && ((liVar = this.B0) == null || liVar.L())) {
                whVar2.setTranslationY(z10 ? AndroidUtilities.dp(84.0f) : f7);
            }
            if (!z10) {
                whVar.setVisibility(4);
                whVar3.setVisibility(4);
            }
            if (z12) {
                f2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.B0.getSelectedItemsCount());
        }
        eiVar.g(i10, z11);
        eiVar.i(l1() + this.B0.getSelectedItemsCount(), this.K1 != null ? 0L : MessagesController.getInstance(this.M1).getSendPaidMessagesStars(p1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), eiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            zhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void U1(li liVar) {
        long j10 = this.Z0;
        go goVar = this.T;
        if (liVar == goVar) {
            j10 = goVar.s;
        } else if (liVar == this.j0) {
            j10 = 1;
        } else if (liVar == this.l0) {
            j10 = 3;
        } else if (liVar == this.p0) {
            j10 = 4;
        } else if (liVar == this.k0) {
            j10 = 5;
        } else if (liVar == this.o0) {
            j10 = 6;
        } else if (liVar == this.m0) {
            j10 = 9;
        } else if (liVar == this.r0) {
            j10 = 10;
        } else if (liVar == this.s0) {
            j10 = 11;
        } else if (liVar == this.n0) {
            j10 = 12;
        } else if (liVar == this.t0) {
            j10 = 14;
        } else if (liVar == this.u0) {
            j10 = 13;
        } else if (liVar == this.v0) {
            j10 = 16;
        } else if (liVar == this.w0) {
            j10 = 17;
        }
        V1(liVar, j10, true);
    }

    public final void V1(li liVar, long j10, boolean z10) {
        int i10;
        om omVar;
        om omVar2;
        int i11;
        Float f7;
        int i12;
        Float valueOf = Float.valueOf(0.0f);
        if (this.w1 == null && this.P0 == null) {
            li liVar2 = this.B0;
            if (liVar2 == liVar) {
                liVar2.J();
                return;
            }
            if (liVar == this.n0 && !UserConfig.getInstance(this.M1).isPremium()) {
                new sg.x0(this.f0, 39, false).show();
                return;
            }
            int i13 = 1;
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
            wh whVar = this.A1;
            whVar.setAlpha(1.0f);
            whVar.setTranslationY(this.I1);
            int i14 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.A0;
                if (i14 >= longSparseArray.size()) {
                    break;
                }
                ((gi.f4) longSparseArray.valueAt(i14)).setMeasureOffsetY(0);
                i14++;
            }
            this.Z0 = j10;
            xh xhVar = this.B1;
            int childCount = xhVar.getChildCount();
            int i15 = 0;
            while (i15 < childCount) {
                View childAt = xhVar.getChildAt(i15);
                if (childAt instanceof ni) {
                    ni niVar = (ni) childAt;
                    i12 = childCount;
                    f7 = valueOf;
                    niVar.a.e(((long) niVar.b) == niVar.c.Z0, true);
                } else {
                    f7 = valueOf;
                    i12 = childCount;
                    if (childAt instanceof mi) {
                        ((mi) childAt).a(true);
                    }
                }
                i15++;
                childCount = i12;
                valueOf = f7;
            }
            Float f10 = valueOf;
            int firstOffset = (this.B0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.e2[0];
            this.C0 = liVar;
            boolean e = liVar.e();
            kh.f fVar = this.y1;
            if (fVar != null) {
                fVar.setFadeHeightBottom(e ? 0 : AndroidUtilities.dp(48.0f));
            }
            int i16 = 4;
            yh yhVar = this.z1;
            if (yhVar != null) {
                yhVar.setVisibility(e ? 4 : 0);
            }
            int i17 = this.C0.i() != 0 ? 0 : 4;
            z7 z7Var = this.a1;
            z7Var.setVisibility(i17);
            if (z7Var.n0) {
                z7Var.h(true);
            }
            this.B0.t();
            li liVar3 = this.C0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if (liVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.C0.G(this.B0);
            this.C0.setVisibility(0);
            if (liVar.getParent() != null) {
                this.containerView.removeView(this.C0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.B0);
            ViewParent parent = this.C0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                li liVar4 = this.C0;
                if (liVar4 != this.o0) {
                    indexOfChild++;
                }
                i10 = 0;
                viewGroup.addView(liVar4, indexOfChild, w7.z5.d(-1.0f, -1));
            } else {
                i10 = 0;
            }
            gh ghVar = new gh(this, i16);
            li liVar5 = this.B0;
            boolean z11 = liVar5 instanceof bn;
            hi hiVar = this.e0;
            if (z11 || (this.C0 instanceof bn)) {
                int max = Math.max(this.C0.getWidth(), this.B0.getWidth());
                li liVar6 = this.C0;
                if (liVar6 instanceof bn) {
                    liVar6.setTranslationX(max);
                    li liVar7 = this.B0;
                    if ((liVar7 instanceof ChatAttachAlertPhotoLayout) && (omVar2 = ((ChatAttachAlertPhotoLayout) liVar7).P) != null) {
                        omVar2.setVisibility(4);
                    }
                } else {
                    this.B0.setTranslationX(-max);
                    li liVar8 = this.C0;
                    if (liVar8 == chatAttachAlertPhotoLayout && (omVar = ((ChatAttachAlertPhotoLayout) liVar8).P) != null) {
                        omVar.setVisibility(0);
                    }
                }
                this.C0.setAlpha(1.0f);
                this.B0.setAlpha(1.0f);
                if (z10) {
                    hiVar.set(this.B0, f10);
                    AndroidUtilities.runOnUIThread(new lg(this, liVar, ghVar, 1));
                } else {
                    boolean z12 = this.C0.getCurrentItemTop() <= liVar.getButtonsHideOffset();
                    this.B0.v(1.0f);
                    this.C0.v(1.0f);
                    this.B0.l(this.o2);
                    this.C0.l(this.o2);
                    this.containerView.invalidate();
                    hiVar.set(this.B0, Float.valueOf(1.0f));
                    z7Var.setTag(z12 ? 1 : null);
                    ghVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.C0.setAlpha(0.0f);
                this.C0.setTranslationY(AndroidUtilities.dp(78.0f));
                li liVar9 = this.B0;
                Property property = View.TRANSLATION_Y;
                float[] fArr = new float[1];
                fArr[i10] = AndroidUtilities.dp(78.0f) + firstOffset;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(liVar9, (Property<li, Float>) property, fArr);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B0, hiVar, 0.0f, 1.0f);
                Property property2 = View.ALPHA;
                float[] fArr2 = new float[2];
                fArr2[i10] = z7Var.getAlpha();
                fArr2[1] = 0.0f;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(z7Var, (Property<z7, Float>) property2, fArr2);
                Animator[] animatorArr = new Animator[3];
                animatorArr[i10] = ofFloat;
                animatorArr[1] = ofFloat2;
                animatorArr[2] = ofFloat3;
                animatorSet.playTogether(animatorArr);
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(bs.f);
                animatorSet.addListener(new ai.b5(this, firstOffset, ghVar, i13));
                this.w1 = animatorSet;
                hiVar.set(this.B0, f10);
                animatorSet.start();
            } else {
                liVar5.setAlpha(0.0f);
                ghVar.run();
                e2(i10);
                this.containerView.invalidate();
            }
            if (!this.p2 || (liVar instanceof gi.f4)) {
                i11 = 0;
            } else {
                i11 = 0;
                this.p2 = false;
                z7Var.d();
                z7Var.invalidate();
                x1();
            }
            z7Var.setForcedMenuWidth((j10 == 1 || j10 == 6 || j10 == 17 || (liVar instanceof gi.f4)) ? AndroidUtilities.dp(46.0f) : j10 == 4 ? AndroidUtilities.dp(84.0f) : i11);
        }
    }

    public final void W1(boolean z10, Boolean bool) {
        ti tiVar;
        if (this.m0 == null) {
            tiVar = this;
            fo foVar = new fo(tiVar, getContext(), false, this.resourcesProvider, bool);
            tiVar.m0 = foVar;
            tiVar.z0[1] = foVar;
            foVar.setDelegate(new dh(this, 15));
        } else {
            tiVar = this;
        }
        V1(tiVar.m0, 9L, z10);
    }

    public final void X1(boolean z10, boolean z11) {
        li liVar;
        this.d.a(z10, z11);
        z7 z7Var = this.a1;
        if (!(z10 && z7Var.getTag() == null) && (z10 || z7Var.getTag() == null)) {
            return;
        }
        z7Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet = this.b1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.b1 = null;
        }
        boolean z12 = (this.F || this.W0 || (this.T0 == 0 && this.t1) || this.B0 != this.j0 || (!this.O1 && !this.P1)) ? false : true;
        if (this.B0 == this.T) {
            z12 = false;
        }
        wh whVar = this.A1;
        org.telegram.ui.ActionBar.u0 u0Var = this.d1;
        if (z10) {
            if (z12) {
                u0Var.setVisibility(0);
                u0Var.setClickable(true);
            }
        } else if (this.V0 && this.G0.getTag() == null) {
            whVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var != null) {
            if (z10) {
                AndroidUtilities.setLightStatusBar(this, i0.b.h(getThemedColor(this.k2 ? org.telegram.ui.ActionBar.h6.tg : org.telegram.ui.ActionBar.h6.h5)) > 0.699999988079071d);
            } else {
                AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
            }
        }
        int i10 = 4;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.b1 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z10 ? 1.0f : 0.0f) - z7Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z7Var, (Property<z7, Float>) property, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new eh(this, i10));
            arrayList.add(ofFloat);
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.b1.playTogether(arrayList);
            this.b1.addListener(new org.telegram.ui.ho(3, this, z10));
            this.b1.setInterpolator(bs.h);
            this.b1.setDuration(380L);
            this.b1.start();
            return;
        }
        if (z10 && this.V0 && ((liVar = this.B0) == null || liVar.L())) {
            whVar.setVisibility(4);
        }
        z7Var.setAlpha(z10 ? 1.0f : 0.0f);
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
        zh zhVar = this.H0;
        zhVar.getLocationOnScreen(iArr);
        if (this.E2 != null) {
            li liVar = this.B0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if ((liVar == chatAttachAlertPhotoLayout || liVar == this.q0) && this.c0) {
                ah.v vVar = this.R0;
                alpha = (vVar.getAlpha() * vVar.getMeasuredHeight()) + (vVar.getY() - this.E2.getTop());
            } else {
                alpha = -zhVar.getHeight();
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
        ei eiVar = this.L0;
        if (selectedItemsCount == 0) {
            eiVar.g(0, i10 != 0);
            T1(false, i10 != 0);
        } else {
            if (T1(true, i10 != 0) || i10 == 0) {
                eiVar.g(selectedItemsCount, i10 != 0);
                eiVar.b();
            } else {
                eiVar.g(selectedItemsCount, true);
                eiVar.b();
            }
        }
        this.B0.D(selectedItemsCount);
        f1(i10 != 0);
        if (this.B0 == this.j0 && ((((z10 = (n2Var = this.f0) instanceof org.telegram.ui.sn)) || this.T0 != 0 || this.W0) && ((selectedItemsCount == 0 && this.t1) || ((selectedItemsCount != 0 || this.T0 != 0 || this.W0) && !this.t1)))) {
            this.t1 = (selectedItemsCount == 0 && this.T0 == 0 && !this.W0) ? false : true;
            AnimatorSet animatorSet = this.c1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.c1 = null;
            }
            int i11 = this.T0;
            z7 z7Var = this.a1;
            org.telegram.ui.ActionBar.u0 u0Var = this.h1;
            if (i11 != 0 && u0Var != null && z7Var.getTag() != null && z10) {
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) n2Var;
                if (!ChatObject.isChannel(snVar.e) || (tL_chatBannedRights = snVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.t1;
                    wh whVar = this.l1;
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.d1;
                    if (!z12) {
                        if (this.T0 == 0 && !this.W0) {
                            u0Var2.setVisibility(0);
                            u0Var2.setClickable(true);
                        }
                        whVar.setVisibility(0);
                    } else if (z7Var.getTag() != null && u0Var != null) {
                        u0Var.setVisibility(0);
                    }
                    if (i10 != 0) {
                        if (z7Var.getTag() == null && this.T0 == 0 && !this.W0) {
                            u0Var2.setAlpha(this.t1 ? 1.0f : 0.0f);
                            u0Var2.setScaleX(this.t1 ? 1.0f : 0.6f);
                            u0Var2.setScaleY(this.t1 ? 1.0f : 0.6f);
                        }
                        whVar.setAlpha(this.t1 ? 1.0f : 0.0f);
                        if (z11) {
                            u0Var.setAlpha(this.t1 ? 0.0f : 1.0f);
                        }
                        if (this.t1 && u0Var != null) {
                            u0Var.setVisibility(4);
                        }
                    } else {
                        this.c1 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (z7Var.getTag() == null && this.T0 == 0 && !this.W0) {
                            arrayList.add(ObjectAnimator.ofFloat(u0Var2, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, this.t1 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(u0Var2, (Property<org.telegram.ui.ActionBar.u0, Float>) View.SCALE_X, this.t1 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(u0Var2, (Property<org.telegram.ui.ActionBar.u0, Float>) View.SCALE_Y, this.t1 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(whVar, (Property<wh, Float>) property, this.t1 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<org.telegram.ui.ActionBar.u0, Float>) property, this.t1 ? 0.0f : 1.0f));
                        }
                        this.c1.playTogether(arrayList);
                        this.c1.addListener(new org.telegram.ui.pq(this, 11));
                        this.c1.setDuration(180L);
                        this.c1.start();
                    }
                }
            }
            z11 = false;
            z12 = this.t1;
            wh whVar2 = this.l1;
            org.telegram.ui.ActionBar.u0 u0Var22 = this.d1;
            if (!z12) {
            }
            if (i10 != 0) {
            }
        }
        c2(i10 != 0);
        MessageObject messageObject = this.K1;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.M1).getSendPaidMessagesStars(p1()) : 0L;
        li liVar = this.B0;
        eiVar.i(l1() + (liVar != null ? liVar.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        zh zhVar = this.H0;
        if (zhVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zhVar.getLayoutParams();
            int max = Math.max(AndroidUtilities.dp(48.0f), eiVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                zhVar.setLayoutParams(marginLayoutParams);
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
        li liVar = this.B0;
        boolean h = liVar == null ? false : liVar.h();
        di.n nVar = this.i1;
        nVar.setEnabled(h);
        li liVar2 = this.B0;
        if (liVar2 != null) {
            f7 = ((liVar2.h() ? 1.0f : 0.5f) * (this.C0 == null ? 1.0f : this.d0)) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        li liVar3 = this.C0;
        if (liVar3 != null) {
            f7 = com.google.android.gms.internal.cast.a6.x(1.0f, this.d0, liVar3.h() ? 1.0f : 0.5f, f7);
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
        wh whVar = this.A1;
        ViewGroup viewGroup = this.containerView;
        RectF rectF = this.O2;
        ih.j.c(whVar, viewGroup, rectF);
        float measuredWidth = this.containerView.getMeasuredWidth();
        float measuredHeight = this.a1.getMeasuredHeight();
        RectF rectF2 = this.N2;
        rectF2.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        rectF2.inset(0.0f, -AndroidUtilities.dp(48.0f));
        rectF.set(0.0f, this.containerView.getMeasuredHeight() - (AndroidUtilities.dp(180.0f) + Math.max(AndroidUtilities.navigationBarHeight, q1())), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        li liVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (liVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null) {
            em emVar = chatAttachAlertPhotoLayout.E;
            if (emVar.getFastScroll() != null) {
                pl0 fastScroll = emVar.getFastScroll();
                dh.d dVar = fastScroll.e0;
                RectF rectF3 = this.P2;
                if (dVar != null || fastScroll.f0 != null) {
                    rectF3.set(fastScroll.f0.getBounds());
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(fastScroll.e0.getBounds());
                    rectF3.union(rectF4);
                }
                pl0 fastScroll2 = emVar.getFastScroll();
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
                fVar.g(zf.e0.a(arrayList, i10, arrayList2), arrayList2);
                fVar.e(this.L2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
            }
        }
        z10 = false;
        if (!z10) {
        }
        ArrayList arrayList3 = this.M2;
        ArrayList arrayList22 = this.Q2;
        fVar.g(zf.e0.a(arrayList3, i10, arrayList22), arrayList22);
        fVar.e(this.L2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void b2(li liVar, int i10) {
        if (liVar == null) {
            return;
        }
        bh.f fVar = this.F2;
        if (fVar != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(0.0f, i10);
            b1();
        }
        int currentItemTop = liVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = liVar == this.B0 && currentItemTop <= liVar.getButtonsHideOffset();
        this.R = z11;
        if (liVar == this.B0) {
            X1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) liVar.getLayoutParams();
        int e = org.telegram.ui.Cells.t0.e(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        li liVar2 = this.B0;
        int i11 = liVar2 == liVar ? 0 : 1;
        if ((liVar2 instanceof bn) || (this.C0 instanceof bn)) {
            Object obj = this.w1;
            if ((obj instanceof o1.k) && ((o1.k) obj).f) {
                z10 = true;
            }
        }
        int[] iArr = this.e2;
        int i12 = iArr[i11];
        if (i12 == e && !z10) {
            if (i10 != 0) {
                this.f2 = i12;
            }
        } else {
            this.f2 = i12;
            iArr[i11] = e;
            e2(i11);
            this.containerView.invalidate();
        }
    }

    public final boolean c1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        return (n2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) n2Var).N6();
    }

    public final void c2(boolean z10) {
        ei.u uVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout == null || (uVar = this.e1) == null) {
            return;
        }
        boolean z11 = this.t1 && this.i0 && this.B0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0();
        boolean z12 = !ChatAttachAlertPhotoLayout.S();
        uVar.f = z12;
        if (!z10) {
            ((f6) uVar.g).a(z12);
        }
        uVar.invalidateSelf();
        org.telegram.ui.ActionBar.u0 u0Var = this.f1;
        if (z10 && this.t1) {
            u0Var.setVisibility(0);
            u0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(bs.h).withEndAction(new ph(this, z11, 0)).start();
        } else {
            u0Var.setVisibility(z11 ? 0 : 8);
            u0Var.setAlpha(z11 ? 1.0f : 0.0f);
            u0Var.setScaleX(z11 ? 1.0f : 0.6f);
            u0Var.setScaleY(z11 ? 1.0f : 0.6f);
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
        if (!(n2Var instanceof org.telegram.ui.sn)) {
            return false;
        }
        return ChatActivityEnterView.F(this.M1, ((org.telegram.ui.sn) n2Var).a(), n2Var, charSequence);
    }

    public final void d2(boolean z10) {
        li liVar = this.j0;
        if (!z10) {
            U1(liVar);
            return;
        }
        if (this.M) {
            if (this.q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.r;
                if (d6Var == null) {
                    d6Var = this.resourcesProvider;
                }
                bn bnVar = new bn(context, d6Var, this);
                bnVar.y = 0.0f;
                bnVar.E = 0.0f;
                bnVar.F = 0.0f;
                bnVar.G = 0.0f;
                bnVar.H = 0.0f;
                bnVar.I = 0.0f;
                bnVar.J = null;
                bnVar.K = false;
                bnVar.M = 0.0f;
                bnVar.Q = false;
                bnVar.S = false;
                Point point = AndroidUtilities.displaySize;
                bnVar.T = point.y > point.x;
                bnVar.n = d6Var;
                bnVar.f = true;
                bnVar.setWillNotDraw(false);
                org.telegram.ui.ActionBar.y n10 = bnVar.b.a1.n();
                TextView textView = new TextView(context);
                bnVar.x = textView;
                org.telegram.ui.ActionBar.d6 d6Var2 = bnVar.a;
                jm jmVar = new jm(bnVar, context, n10, d6Var2, 1);
                bnVar.b.a1.addView(jmVar, 0, w7.z5.a(-1.0f, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f, -2, 51));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                jmVar.addView(textView, w7.z5.a(-2.0f, 16.0f, 0.0f, 0.0f, 0.0f, -2, 16));
                ai.u1 u1Var = new ai.u1(bnVar, context, d6Var2, 15);
                bnVar.r = u1Var;
                u1Var.setAdapter(new org.telegram.ui.z7(bnVar, 3));
                s4.b0 b0Var = new s4.b0(1, false);
                bnVar.s = b0Var;
                u1Var.setLayoutManager(b0Var);
                u1Var.setClipChildren(false);
                u1Var.setClipToPadding(false);
                u1Var.setOverScrollMode(2);
                u1Var.setVerticalScrollBarEnabled(false);
                an anVar = new an(bnVar, context);
                bnVar.v = anVar;
                anVar.setClipToPadding(true);
                anVar.setClipChildren(true);
                bnVar.addView(u1Var, w7.z5.d(-1.0f, -1));
                bnVar.P = bnVar.b.j0;
                anVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = bnVar.P;
                anVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                anVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                anVar.c();
                UndoView undoView = new UndoView(context, null, false, bnVar.b.r);
                bnVar.w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                bnVar.addView(undoView, w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 52.0f, -1, 83));
                bnVar.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.q0 = bnVar;
                bnVar.bringToFront();
            }
            li liVar2 = this.B0;
            bn bnVar2 = this.q0;
            if (liVar2 != bnVar2) {
                liVar = bnVar2;
            }
            U1(liVar);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.reloadInlineHints && i10 != NotificationCenter.attachMenuBotsDidLoad && i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.K = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
            }
        } else {
            qi qiVar = this.D1;
            if (qiVar != null) {
                qiVar.l();
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
        ri riVar = this.c2;
        if (riVar != null) {
            riVar.r(new gh(this, 3));
        } else {
            I1();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.B0.q(i10);
    }

    public final void e1() {
        xh xhVar = this.B1;
        if (xhVar == null) {
            return;
        }
        int childCount = xhVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            xhVar.getChildAt(i10);
        }
        boolean z10 = this.k2;
        this.m1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.h6.hg : org.telegram.ui.ActionBar.h6.j5));
        this.r1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.h6.hg : org.telegram.ui.ActionBar.h6.j5));
        this.i1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
        int themedColor = getThemedColor(z10 ? org.telegram.ui.ActionBar.h6.hg : org.telegram.ui.ActionBar.h6.j5);
        org.telegram.ui.ActionBar.u0 u0Var = this.d1;
        u0Var.setIconColor(themedColor);
        org.telegram.ui.ActionBar.h6.x1(getThemedColor(z10 ? org.telegram.ui.ActionBar.h6.ig : org.telegram.ui.ActionBar.h6.I5), u0Var.getBackground());
        int i11 = org.telegram.ui.ActionBar.h6.E8;
        u0Var.G(getThemedColor(i11), false);
        u0Var.G(getThemedColor(i11), true);
        u0Var.B(getThemedColor(org.telegram.ui.ActionBar.h6.G8));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f1;
        if (u0Var2 != null) {
            u0Var2.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.h6.hg : org.telegram.ui.ActionBar.h6.j5));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.h1;
        if (u0Var3 != null) {
            u0Var3.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.h6.hg : org.telegram.ui.ActionBar.h6.j5));
            org.telegram.ui.ActionBar.h6.x1(getThemedColor(z10 ? org.telegram.ui.ActionBar.h6.ig : org.telegram.ui.ActionBar.h6.I5), u0Var3.getBackground());
        }
        zh zhVar = this.H0;
        org.telegram.ui.ActionBar.d6 d6Var = zhVar.M;
        lu luVar = zhVar.a;
        int i12 = zhVar.L;
        if (i12 == 0) {
            luVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, d6Var));
            int i13 = org.telegram.ui.ActionBar.h6.G6;
            luVar.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
            luVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        } else if (i12 == 2 || i12 == 3) {
            luVar.setHintTextColor(-1929379841);
            luVar.setTextColor(-1);
            luVar.setCursorColor(-1);
            luVar.setHandlesColor(-1);
            luVar.setHighlightColor(822083583);
            luVar.quoteColor = -1;
        } else {
            luVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.t5, d6Var));
            luVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var));
        }
        zhVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
        mu muVar = zhVar.d;
        if (muVar != null) {
            muVar.S();
        }
        xhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        int themedColor2 = getThemedColor(z10 ? org.telegram.ui.ActionBar.h6.hg : org.telegram.ui.ActionBar.h6.j5);
        z7 z7Var = this.a1;
        z7Var.C(themedColor2, false);
        z7Var.B(getThemedColor(z10 ? org.telegram.ui.ActionBar.h6.ig : org.telegram.ui.ActionBar.h6.I5), false);
        z7Var.setTitleColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.h6.hg : org.telegram.ui.ActionBar.h6.j5));
        int s12 = s1(false);
        org.telegram.ui.ActionBar.h6.x1(s12, this.shadowDrawable);
        gh.c cVar = this.I2;
        if (cVar.a.getColor() != s12) {
            cVar.a(s12);
            kh.f fVar = this.y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            yh yhVar = this.z1;
            if (yhVar != null) {
                yhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i14 = 0;
        while (true) {
            li[] liVarArr = this.z0;
            if (i14 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i14];
            if (liVar != null) {
                liVar.d();
            }
            i14++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.h5));
            return;
        }
        this.navBarColorKey = -1;
        this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.h6.i5);
        AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.h6.h5), false);
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
        di.n nVar;
        float max;
        int i12;
        float f14 = this.d.e;
        li liVar = i10 == 0 ? this.B0 : this.C0;
        if (liVar == null || liVar.getVisibility() != 0) {
            return;
        }
        int r12 = r1(i10);
        if (liVar == this.m0 || liVar == this.n0) {
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
        wh whVar = this.l1;
        float dp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - whVar.getAlpha()) * 26.0f);
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
        ei.x3 x3Var = this.g1;
        if (x3Var != null) {
            x3Var.setTranslationY(u0Var2.getTranslationY());
        }
        if (this.F && this.v1) {
            li liVar2 = this.C0;
            if (liVar2 != null && this.B0 != null) {
                f7 = Math.min(liVar2.getTranslationY(), this.B0.getTranslationY());
            } else if (liVar2 != null) {
                f7 = liVar2.getTranslationY();
            }
            u0Var = this.h1;
            if (u0Var != null) {
                u0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i11 + 37)) + this.o2);
            }
            float dp2 = ((((r12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.o2) + f7) - (vVar.getAlpha() * vVar.getMeasuredHeight());
            this.s1 = dp2;
            whVar.setTranslationY(Math.max(this.o2, dp2));
            vVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.o2, (whVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.s1 + AndroidUtilities.dp(8.0f)));
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
                fo foVar = this.m0;
                if (foVar == this.C0) {
                    f11 = (foVar.getTranslationY() + r1(1)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.d0;
                } else if (foVar == this.B0) {
                    f11 = (foVar.getTranslationY() + r1(0)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
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
                    fo foVar2 = this.n0;
                    if (foVar2 == this.C0) {
                        f13 = (foVar2.getTranslationY() + r1(1)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.d0;
                    } else if (foVar2 == this.B0) {
                        f13 = (foVar2.getTranslationY() + r1(0)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
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
        whVar.setTranslationY(Math.max(this.o2, dp22));
        vVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.o2, (whVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.s1 + AndroidUtilities.dp(8.0f)));
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.sn)) {
            return;
        }
        org.telegram.ui.sn snVar = (org.telegram.ui.sn) n2Var;
        qu quVar = this.c0 ? this.S0 : this.H0;
        String obj = quVar != null ? quVar.getText().toString() : null;
        if (this.K1 == null) {
            li liVar = this.B0;
            z11 = true;
            if (liVar != null) {
            }
            if (zf.u.g(this.M1).e(obj, snVar.d8) <= 0) {
                MessageObject messageObject = snVar.n5;
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
            em emVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (emVar != null && emVar.getFastScroll() != null) {
                pl0 fastScroll = emVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1;
                if (this.c0) {
                    i10 = (int) (vVar.getAlpha() * vVar.getMeasuredHeight());
                }
                fastScroll.h0 = currentActionBarHeight + i10;
                emVar.getFastScroll().invalidate();
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
        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.z0;
            if (i10 >= liVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.i5));
                return arrayList;
            }
            li liVar = liVarArr[i10];
            if (liVar != null && (themeDescriptions = liVar.getThemeDescriptions()) != null) {
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
        h20.d(this.I0, com.google.android.gms.internal.cast.a6.C(this.e.e, this.f.e, zf.e0.b(this.h.e), this.U1 ? 0.0f : 1.0f));
    }

    public final void i1() {
        ei eiVar = this.L0;
        wh whVar = this.K0;
        ah.v vVar = this.R0;
        if (vVar == null || vVar.getVisibility() != 0 || vVar.getAlpha() == 0.0f) {
            whVar.setTranslationY(this.j2);
            eiVar.setAlpha(1.0f);
            return;
        }
        float f7 = this.b.e;
        float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
        eiVar.setAlpha(abs * abs * abs * abs);
        whVar.setTranslationY(AndroidUtilities.lerp(this.j2, ((vVar.getTranslationY() + vVar.getTop()) - whVar.getTop()) + AndroidUtilities.dp(8.0f), bs.j.getInterpolation(f7)));
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

    public final void k1(hg.o oVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.m1;
        textView.setText(string);
        this.V0 = false;
        this.A1.setVisibility(8);
        this.T0 = 1;
        this.F = true;
        this.G = true;
        this.i0 = false;
        this.J = oVar;
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (!(n2Var instanceof org.telegram.ui.sn) || (messagePreviewParams = ((org.telegram.ui.sn) n2Var).f5) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public final TLRPC.Chat m1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        return n2Var instanceof org.telegram.ui.sn ? ((org.telegram.ui.sn) n2Var).e : MessagesController.getInstance(this.M1).getChat(Long.valueOf(-this.Z));
    }

    public final float n1() {
        return r0.getMeasuredHeight() - ((1.0f - this.G0.getAlpha()) * (r0.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final qu o1() {
        li liVar;
        return (this.c0 && ((liVar = this.B0) == this.j0 || liVar == this.q0)) ? this.S0 : this.H0;
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
        z7 z7Var = this.a1;
        if (z7Var.n0) {
            z7Var.h(true);
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
        return this.B0.n(motionEvent);
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
        final al alVar = this.w0;
        if (alVar != null && this.B0 == alVar) {
            final gh ghVar = new gh(this, 1);
            int i10 = alVar.n;
            org.telegram.ui.Wallet.k9 k9Var = alVar.O;
            ti tiVar = alVar.b;
            AnimatorSet animatorSet = null;
            if (!alVar.H && (wallettransaction = alVar.M0) != null && alVar.N0 == null && alVar.O0 == null) {
                if (alVar.P0) {
                    org.telegram.ui.Wallet.l5 l5Var = new org.telegram.ui.Wallet.l5();
                    l5Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
                    if (n2Var != null && n2Var.presentFragment(l5Var, false, true)) {
                        final int i11 = 0;
                        org.telegram.ui.Wallet.x9 x9Var = new org.telegram.ui.Wallet.x9(tiVar.getContainer(), tiVar.getSheetContainer(), k9Var.getDiamondView(), l5Var, alVar.M0, new Runnable() { // from class: org.telegram.ui.Components.sk
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        if (!alVar.H) {
                                            ghVar.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!alVar.H) {
                                            ghVar.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, tiVar);
                        alVar.O0 = x9Var;
                        animatorSet = x9Var.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.p6 diamondView = k9Var.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f0;
                        if (n2Var2 instanceof org.telegram.ui.sn) {
                            org.telegram.ui.sn snVar = (org.telegram.ui.sn) n2Var2;
                            if (snVar.getCurrentAccount() == i10 && snVar.a() == alVar.r.id && snVar.R3 == 0 && snVar.getFragmentView() != null && snVar.getFragmentView().isAttachedToWindow()) {
                                final int i12 = 1;
                                org.telegram.ui.Wallet.h6 h6Var = new org.telegram.ui.Wallet.h6(tiVar.getContainer(), tiVar.getSheetContainer(), k9Var.getDiamondView(), snVar, alVar.M0, new Runnable() { // from class: org.telegram.ui.Components.sk
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                if (!alVar.H) {
                                                    ghVar.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!alVar.H) {
                                                    ghVar.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, tiVar);
                                alVar.N0 = h6Var;
                                animatorSet = h6Var.m;
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
        w91 w91Var = chatAttachAlertPhotoLayout.l0;
        ah.x xVar = chatAttachAlertPhotoLayout.j0;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        em emVar = chatAttachAlertPhotoLayout.r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        boolean z10 = i14 < i15;
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == xVar) {
            if (z10) {
                if (emVar.getVisibility() == 0) {
                    xVar.layout(0, org.telegram.messenger.q.B(222.0f, i13, i16), i14, org.telegram.messenger.q.B(96.0f, i13, i16));
                    return true;
                }
                xVar.layout(0, org.telegram.messenger.q.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            }
            if (emVar.getVisibility() == 0) {
                xVar.layout(org.telegram.messenger.q.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            }
            xVar.layout(org.telegram.messenger.q.B(126.0f, i12, i16), 0, i12, i15 - i16);
            return true;
        }
        if (view == w91Var) {
            if (z10) {
                if (emVar.getVisibility() == 0) {
                    w91Var.layout(0, org.telegram.messenger.q.B(310.0f, i13, i16), i14, org.telegram.messenger.q.B(260.0f, i13, i16));
                    return true;
                }
                w91Var.layout(0, org.telegram.messenger.q.B(176.0f, i13, i16), i14, org.telegram.messenger.q.B(126.0f, i13, i16));
                return true;
            }
            if (emVar.getVisibility() == 0) {
                w91Var.layout(org.telegram.messenger.q.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            }
            w91Var.layout(org.telegram.messenger.q.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
            return true;
        }
        if (view != textView) {
            if (view != emVar) {
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
            if (emVar.getVisibility() == 0) {
                dp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = dp3 - i16;
        } else {
            dp = i12 - AndroidUtilities.dp(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
            textView.setRotation(-90.0f);
            if (emVar.getVisibility() == 0) {
                dp -= AndroidUtilities.dp(96.0f);
            }
        }
        textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        sm smVar = chatAttachAlertPhotoLayout.v;
        em emVar = chatAttachAlertPhotoLayout.r;
        hg.a0 a0Var = chatAttachAlertPhotoLayout.s;
        boolean z10 = i10 < i11;
        om omVar = chatAttachAlertPhotoLayout.P;
        if (view != omVar) {
            ah.x xVar = chatAttachAlertPhotoLayout.j0;
            if (view == xVar) {
                if (z10) {
                    xVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30));
                    return true;
                }
                xVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            w91 w91Var = chatAttachAlertPhotoLayout.l0;
            if (view == w91Var) {
                if (z10) {
                    w91Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                    return true;
                }
                w91Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            if (view == emVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    emVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
                    if (a0Var.o != 0) {
                        emVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.j1(0);
                        smVar.l();
                    }
                } else {
                    emVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                    if (a0Var.o != 1) {
                        emVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        a0Var.j1(1);
                        smVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.b0 && !chatAttachAlertPhotoLayout.d0) {
            omVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
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
        hi hiVar = this.r2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, hiVar, 0.0f, 400.0f));
        this.t2.setDuration(400L);
        this.t2.setStartDelay(20L);
        hiVar.set(this, Float.valueOf(0.0f));
        this.t2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new eh(this, i10));
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
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.backDrawable, t6.d, this.dimBehind ? this.dimBehindAlpha : 0));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        lg lgVar = new lg(this, animationNotificationsLocker, this.delegate, i10);
        this.s2.a(new gi.b4(i10, this, lgVar));
        this.currentSheetAnimation.addListener(new ai.le(23, this, lgVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        O1(0.0f);
        ofFloat2.addUpdateListener(new eh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(bs.f);
        ofFloat2.start();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onDismissWithTouchOutside() {
        if (this.B0.r()) {
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
        if (this.f0 instanceof org.telegram.ui.sn) {
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
        return n2Var instanceof org.telegram.ui.sn ? ((org.telegram.ui.sn) n2Var).a() : this.Z;
    }

    public final int q1() {
        li liVar = this.B0;
        fo foVar = this.m0;
        if (liVar == foVar && foVar.E != null) {
            return foVar.getEmojiPadding();
        }
        fo foVar2 = this.n0;
        return (liVar != foVar2 || foVar2.E == null) ? this.c0 ? this.S0.getEmojiPadding() : this.H0.getEmojiPadding() : foVar2.getEmojiPadding();
    }

    public final int r1(int i10) {
        li liVar = this.C0;
        int[] iArr = this.e2;
        return (liVar == null || !((this.B0 instanceof bn) || (liVar instanceof bn))) ? iArr[i10] : AndroidUtilities.lerp(iArr[0], iArr[1], this.d0);
    }

    public final int s1(boolean z10) {
        z7 z7Var;
        if (this.k2) {
            return getThemedColor(org.telegram.ui.ActionBar.h6.tg);
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
        boolean a2 = d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q();
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
        if (z10 && (z7Var = this.a1) != null && z7Var.getVisibility() == 0) {
            a10 *= 1.0f - z7Var.getAlpha();
        }
        return i0.b.f(a10, getThemedColor(org.telegram.ui.ActionBar.h6.h5), getThemedColor(a2 ? org.telegram.ui.ActionBar.h6.a7 : org.telegram.ui.ActionBar.h6.i5));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean shouldOverlayCameraViewOverNavBar() {
        li liVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        return liVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.i1;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        this.L1 = false;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.sn) {
            this.calcMandatoryInsets = ((org.telegram.ui.sn) n2Var).C9();
        }
        a2();
        this.v1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int o10 = i0.b.o(getThemedColor(org.telegram.ui.ActionBar.h6.a7), 0);
            this.navBarColor = o10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, o10, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.p2) {
            this.p2 = false;
            z7 z7Var = this.a1;
            z7Var.d();
            z7Var.invalidate();
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
        ti tiVar;
        om omVar;
        MediaController.AlbumEntry albumEntry;
        li liVar;
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
        wh whVar = this.A1;
        whVar.setAlpha(1.0f);
        whVar.setTranslationY(0.0f);
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.A0;
            if (i11 >= longSparseArray.size()) {
                break;
            }
            ((gi.f4) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
            i11++;
        }
        int i12 = this.T0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (i12 != 2) {
            if (n2Var instanceof org.telegram.ui.sn) {
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) n2Var;
                chat = snVar.e;
                user = snVar.i();
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
            z10 = n2Var instanceof org.telegram.ui.sn;
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
                    this.S1 = !z10 || ((org.telegram.ui.sn) n2Var).h == null;
                }
            }
            if (this.U1) {
                this.R1 = false;
                this.S1 = false;
            }
            zh zhVar = this.H0;
            if (z10 || this.T0 == 2) {
                zhVar.setVisibility(this.W ? 0 : 4);
            }
            boolean z11 = this.P1;
            boolean z12 = this.O1;
            boolean z13 = this.N1;
            chatAttachAlertPhotoLayout = this.j0;
            tiVar = chatAttachAlertPhotoLayout.b;
            vz vzVar = chatAttachAlertPhotoLayout.H;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z11;
            chatAttachAlertPhotoLayout.x0 = z12;
            chatAttachAlertPhotoLayout.z0 = z13;
            omVar = chatAttachAlertPhotoLayout.P;
            if (omVar != null) {
                omVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.P.setEnabled(chatAttachAlertPhotoLayout.v0);
            }
            if (!((tiVar.f0 instanceof org.telegram.ui.sn) && tiVar.m1() == null) && tiVar.T0 == 0) {
                chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
                if (chatAttachAlertPhotoLayout.v0) {
                    vzVar.setText(LocaleController.getString(R.string.NoPhotos));
                    vzVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat m12 = tiVar.m1();
                    vzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    if (ChatObject.isActionBannedByDefault(m12, 7)) {
                        vzVar.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else if (AndroidUtilities.isBannedForever(m12.banned_rights)) {
                        vzVar.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                    } else {
                        vzVar.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(m12.banned_rights.until_date)));
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
                if (vzVar != null) {
                    vzVar.c();
                }
            }
            chatAttachAlertPhotoLayout.u0();
            zhVar.k(true);
            this.S0.k(true);
            this.x1 = false;
            setFocusable(false);
            if (!this.O || this.P) {
                if (this.o0 == null) {
                    rl rlVar = new rl(this, getContext(), this.resourcesProvider, (this.H || this.P || this.U1) ? false : true);
                    this.o0 = rlVar;
                    this.z0[5] = rlVar;
                    ml mlVar = this.w2;
                    if (mlVar != null) {
                        rlVar.setDelegate(mlVar);
                    } else {
                        rlVar.setDelegate(new dh(this, i10));
                    }
                }
                this.Z0 = 5L;
                liVar = this.o0;
            } else if (this.N) {
                H1(false);
                liVar = this.p0;
                this.Z0 = 4L;
            } else {
                MessageObject messageObject = this.K1;
                if (messageObject != null) {
                    int i15 = this.J1;
                    if (i15 == -1) {
                        this.V0 = true;
                        if (messageObject.isMusic()) {
                            E1(false);
                            liVar = this.l0;
                            this.Z0 = 3L;
                        } else if (this.K1.isDocument()) {
                            H1(false);
                            liVar = this.p0;
                            this.Z0 = 4L;
                        } else {
                            this.Z0 = 1L;
                        }
                    } else {
                        if (i15 == 2) {
                            E1(false);
                            liVar = this.l0;
                            this.Z0 = 3L;
                        } else if (i15 == 1) {
                            H1(false);
                            liVar = this.p0;
                            this.Z0 = 4L;
                        } else {
                            this.Z0 = 1L;
                            liVar = chatAttachAlertPhotoLayout;
                        }
                        this.V0 = false;
                    }
                } else {
                    this.V0 = this.T0 == 0 && !this.W0;
                    this.Z0 = 1L;
                }
                liVar = chatAttachAlertPhotoLayout;
            }
            whVar.setVisibility(this.V0 ? 0 : 8);
            if (this.B0 != liVar) {
                z7 z7Var = this.a1;
                if (z7Var.n0) {
                    z7Var.h(true);
                }
                this.containerView.removeView(this.B0);
                this.B0.t();
                this.B0.setVisibility(8);
                this.B0.s();
                this.B0 = liVar;
                this.allowNestedScroll = true;
                if (liVar.getParent() == null) {
                    this.containerView.addView(this.B0, 0, w7.z5.d(-1.0f, -1));
                }
                liVar.setAlpha(1.0f);
                liVar.setVisibility(0);
                liVar.G(null);
                liVar.I();
                z7Var.setVisibility(liVar.i() != 0 ? 0 : 4);
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
        z10 = n2Var instanceof org.telegram.ui.sn;
        if (z10) {
            if (chat != null) {
            }
            if (this.U1) {
            }
            zh zhVar2 = this.H0;
            if (z10) {
            }
            zhVar2.setVisibility(this.W ? 0 : 4);
            boolean z112 = this.P1;
            boolean z122 = this.O1;
            boolean z132 = this.N1;
            chatAttachAlertPhotoLayout = this.j0;
            tiVar = chatAttachAlertPhotoLayout.b;
            vz vzVar2 = chatAttachAlertPhotoLayout.H;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z112;
            chatAttachAlertPhotoLayout.x0 = z122;
            chatAttachAlertPhotoLayout.z0 = z132;
            omVar = chatAttachAlertPhotoLayout.P;
            if (omVar != null) {
            }
            if (tiVar.f0 instanceof org.telegram.ui.sn) {
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
            zhVar2.k(true);
            this.S0.k(true);
            this.x1 = false;
            setFocusable(false);
            if (this.O) {
            }
            if (this.o0 == null) {
            }
            this.Z0 = 5L;
            liVar = this.o0;
            whVar.setVisibility(this.V0 ? 0 : 8);
            if (this.B0 != liVar) {
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
        zh zhVar22 = this.H0;
        if (z10) {
        }
        zhVar22.setVisibility(this.W ? 0 : 4);
        boolean z1122 = this.P1;
        boolean z1222 = this.O1;
        boolean z1322 = this.N1;
        chatAttachAlertPhotoLayout = this.j0;
        tiVar = chatAttachAlertPhotoLayout.b;
        vz vzVar22 = chatAttachAlertPhotoLayout.H;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.v0 = z14;
        chatAttachAlertPhotoLayout.w0 = z1122;
        chatAttachAlertPhotoLayout.x0 = z1222;
        chatAttachAlertPhotoLayout.z0 = z1322;
        omVar = chatAttachAlertPhotoLayout.P;
        if (omVar != null) {
        }
        if (tiVar.f0 instanceof org.telegram.ui.sn) {
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
        zhVar22.k(true);
        this.S0.k(true);
        this.x1 = false;
        setFocusable(false);
        if (this.O) {
        }
        if (this.o0 == null) {
        }
        this.Z0 = 5L;
        liVar = this.o0;
        whVar.setVisibility(this.V0 ? 0 : 8);
        if (this.B0 != liVar) {
        }
        if (this.B0 != chatAttachAlertPhotoLayout) {
        }
        Z1(0);
        this.D1.l();
        o1().setText("");
        this.C1.h1(0, MediaController.VIDEO_BITRATE_480);
    }

    @Override // ne.d
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        li liVar;
        if (i10 == 0) {
            i1();
            g1();
            return;
        }
        if (i10 == 2) {
            g1();
            fo foVar = this.m0;
            if (foVar != null && ((liVar = this.C0) == foVar || this.B0 == foVar)) {
                e2(liVar == foVar ? 1 : 0);
            }
            fo foVar2 = this.n0;
            if (foVar2 != null) {
                li liVar2 = this.C0;
                if (liVar2 == foVar2 || this.B0 == foVar2) {
                    e2(liVar2 != foVar2 ? 0 : 1);
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
            ei eiVar = this.L0;
            if (eiVar != null) {
                eiVar.setEphemeralFactor(f7);
                eiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final boolean u1() {
        if (!this.c0) {
            return false;
        }
        li liVar = this.B0;
        return liVar == this.j0 || liVar == this.q0;
    }

    public final void w1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        ri riVar = this.c2;
        if (riVar == null || this.x1) {
            return;
        }
        boolean v = riVar.v();
        this.x1 = true;
        AndroidUtilities.runOnUIThread(new ai.x7(this, editTextBoldCursor, z10, 20), v ? 200L : 0L);
    }

    public final void x1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int s12 = s1(false);
        org.telegram.ui.ActionBar.h6.x1(s12, this.shadowDrawable);
        gh.c cVar = this.I2;
        if (cVar.a.getColor() != s12) {
            cVar.a(s12);
            kh.f fVar = this.y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            yh yhVar = this.z1;
            if (yhVar != null) {
                yhVar.invalidate();
            }
        }
        a2();
        this.containerView.invalidate();
    }

    public final void y1() {
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar != null) {
                liVar.o();
            }
            i10++;
        }
        int i11 = this.M1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        zh zhVar = this.H0;
        if (zhVar != null) {
            zhVar.o();
        }
        ci ciVar = this.S0;
        if (ciVar != null) {
            ciVar.o();
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
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.s2(this, tL_attachMenuBot, user, 24));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        ci ciVar;
        zh zhVar;
        if (this.B0.p() || isDismissed()) {
            return;
        }
        li liVar = this.B0;
        al alVar = this.w0;
        boolean z10 = (liVar != alVar || alVar == null || alVar.H || alVar.M0 == null) ? false : true;
        this.x0 = z10;
        if (!z10 && (zhVar = this.H0) != null) {
            AndroidUtilities.hideKeyboard(zhVar.getEditText());
        }
        if (!this.x0 && (ciVar = this.S0) != null) {
            AndroidUtilities.hideKeyboard(ciVar.getEditText());
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
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new dh(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new jh(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.N = b1Var;
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.z0;
            if (i10 >= liVarArr.length) {
                break;
            }
            li liVar2 = liVarArr[i10];
            if (liVar2 != null && this.B0 != liVar2) {
                liVar2.p();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.b.o(getThemedColor(org.telegram.ui.ActionBar.h6.a7), 0), true, (AndroidUtilities.IntColorCallback) new dh(this, 11));
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
        this.l2 = false;
        super.dismiss();
        this.D2 = false;
    }

    @Override // ne.d
    public final /* synthetic */ void E(float f7, int i10) {
    }

    public ti(Activity activity, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        this(activity, n2Var, z10, z11, true, null);
    }
}

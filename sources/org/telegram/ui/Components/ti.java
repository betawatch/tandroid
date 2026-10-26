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
import org.telegram.ui.ki1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class ti extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.d3, oe.d {
    public static final /* synthetic */ int N2 = 0;
    public final LongSparseArray A0;
    public final th A1;
    public boolean A2;
    public li B0;
    public final uh B1;
    public boolean B2;
    public li C0;
    public final s4.c0 C1;
    public File C2;
    public final eh.d D0;
    public final qi D1;
    public double[] D2;
    public final i0 E;
    public final eh.d E0;
    public boolean E1;
    public boolean E2;
    public boolean F;
    public final jg.k F0;
    public final RadialProgressView F1;
    public boolean F2;
    public boolean G;
    public final th G0;
    public boolean G1;
    public boolean G2;
    public boolean H;
    public final wh H0;
    public final s6 H1;
    public fi.i H2;
    public int I;
    public final ImageView I0;
    public float I1;
    public final ch.f I2;
    public Utilities.Callback2 J;
    public final int[] J0;
    public int J1;
    public final hh.c J2;
    public int K;
    public final th K0;
    public MessageObject K1;
    public final ch.b K2;
    public int L;
    public final bi L0;
    public boolean L1;
    public final ch.b L2;
    public boolean M;
    public final TextPaint M0;
    public final int M1;
    public final kh M2;
    public boolean N;
    public final RectF N0;
    public boolean N1;
    public boolean O;
    public final Paint O0;
    public boolean O1;
    public boolean P;
    public AnimatorSet P0;
    public boolean P1;
    public e50 Q;
    public long Q0;
    public boolean Q1;
    public boolean R;
    public final bh.p R0;
    public boolean R1;
    public final le0 S;
    public final yh S0;
    public boolean S1;
    public ho T;
    public int T0;
    public boolean T1;
    public g50 U;
    public au U0;
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
    public final b8 a1;
    public ValueAnimator a2;
    public final oe.b b;
    public final ch.c b0;
    public AnimatorSet b1;
    public int b2;
    public final oe.b c;
    public boolean c0;
    public AnimatorSet c1;
    public ri c2;
    public final oe.b d;
    public float d0;
    public final org.telegram.ui.ActionBar.w0 d1;
    public qn d2;
    public final oe.b e;
    public final ei e0;
    public final fi.u e1;
    public final int[] e2;
    public final oe.b f;
    public final org.telegram.ui.ActionBar.r2 f0;
    public final org.telegram.ui.ActionBar.w0 f1;
    public int f2;
    public final boolean g0;
    public fi.v3 g1;
    public float g2;
    public final oe.b h;
    public mf h0;
    public final org.telegram.ui.ActionBar.w0 h1;
    public float h2;
    public boolean i0;
    public final ei.n i1;
    public boolean i2;
    public final ChatAttachAlertPhotoLayout j0;
    public float j1;
    public float j2;
    public xj k0;
    public float k1;
    public final boolean k2;
    public fj l0;
    public final th l1;
    public boolean l2;
    public go m0;
    public final TextView m1;
    public final ArrayList m2;
    public final oe.l n;
    public go n0;
    public final org.telegram.ui.ActionBar.w0 n1;
    public final Rect n2;
    public sl o0;
    public final LinearLayout o1;
    public float o2;
    public nk p0;
    public final ImageView p1;
    public boolean p2;
    public cn q0;
    public final LinearLayout q1;
    public int q2;
    public org.telegram.ui.sn r;
    public ij r0;
    public final TextView r1;
    public final ei r2;
    public final s6 s;
    public jg.i0 s0;
    public float s1;
    public o1.j s2;
    public ok t0;
    public boolean t1;
    public AnimatorSet t2;
    public ok u0;
    public final gi u1;
    public int u2;
    public final s6 v;
    public li.q v0;
    public boolean v1;
    public int v2;
    public final ImageView w;
    public al w0;
    public Object w1;
    public boolean w2;
    public final i0 x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public final ImageView y;
    public float y0;
    public final lh.f y1;
    public boolean y2;
    public final li[] z0;
    public final vh z1;
    public nl z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(Context context, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        ei.n nVar;
        int i10;
        int i11;
        float f7;
        oe.l lVar;
        int i12 = 0;
        ds dsVar = ds.h;
        this.b = new oe.b(0, this, dsVar, 380L, false);
        this.c = new oe.b(1, this, dsVar, 380L, false);
        this.d = new oe.b(2, this, dsVar, 380L, false);
        this.e = new oe.b(3, this, dsVar, 380L, false);
        this.f = new oe.b(4, this, dsVar, 380L, true);
        this.h = new oe.b(5, this, dsVar, 320L, false);
        oe.l lVar2 = new oe.l(new dh(this, 2), dsVar, 380L);
        this.n = lVar2;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.d0 = 0.0f;
        this.e0 = new ei(this, 0);
        this.i0 = false;
        li[] liVarArr = new li[12];
        this.z0 = liVarArr;
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
        this.r2 = new ei(this, 1);
        this.x2 = true;
        this.y2 = false;
        this.F2 = false;
        this.G2 = false;
        this.occupyNavigationBarWithoutKeyboard = true;
        hh.c cVar = new hh.c();
        this.J2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
        this.glassEngine.A.add(new oi.o(cVar, new dh(this, 4)));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.I2 = null;
            this.K2 = new ch.b(cVar);
            this.L2 = new ch.b(cVar);
        } else {
            ch.f fVar = new ch.f();
            this.I2 = fVar;
            this.glassEngine.a(fVar);
            hh.d dVar = new hh.d(cVar);
            dVar.f = cVar;
            dVar.d = fVar;
            dVar.e = -2;
            hh.d dVar2 = new hh.d(null);
            dVar2.f = cVar;
            dVar2.d = fVar;
            dVar2.e = -3;
            ch.b bVar = new ch.b(dVar);
            this.K2 = bVar;
            bVar.i = LiteMode.isEnabled(262144);
            int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
            bVar.b = dp;
            bVar.c = dp;
            ch.b bVar2 = new ch.b(dVar2);
            this.L2 = bVar2;
            bVar2.i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(48.0f);
            bVar2.b = dp2;
            bVar2.c = dp2;
        }
        ch.b bVar3 = new ch.b(cVar);
        this.M2 = new kh(this, i12);
        this.k2 = z10;
        this.g0 = (r2Var instanceof org.telegram.ui.un) && r2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f0 = r2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        gi giVar = new gi(this, context);
        this.u1 = giVar;
        giVar.setDelegate(new hi(this));
        this.containerView = giVar;
        giVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i14, 0, i14, 0);
        b8 b8Var = new b8(this, context, u6Var, 1);
        this.a1 = b8Var;
        b8Var.U0 = true;
        b8Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        b8Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        int i15 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.m(b8Var, 1, i15, u6Var);
        int i16 = org.telegram.ui.ActionBar.y6.I5;
        org.telegram.ui.ActionBar.f7.m(b8Var, 3, i16, u6Var);
        org.telegram.ui.ActionBar.f7.m(b8Var, 5, i15, u6Var);
        b8Var.setOccupyStatusBar(true);
        b8Var.setAlpha(0.0f);
        b8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 11));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i15), false, u6Var);
        this.d1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.ic_ab_other);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var2.setVisibility(4);
        w0Var2.setAlpha(0.0f);
        w0Var2.setScaleX(0.6f);
        w0Var2.setScaleY(0.6f);
        w0Var2.setSubMenuOpenSide(2);
        w0Var2.setDelegate(new dh(this, 10));
        w0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i16), 6, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
        w0Var2.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(w0Var2, g02, null, N, u6Var);
        final int i17 = 5;
        w0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.o4 o4Var;
                switch (i17) {
                    case 0:
                        ti tiVar = this.b;
                        tiVar.g2(tiVar.B0 != tiVar.q0);
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z13 = tiVar3.c0;
                        if (!z13) {
                            tiVar3.N1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ti tiVar4 = this.b;
                        boolean z14 = tiVar4.c0;
                        if (z14) {
                            tiVar4.N1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.E1();
                        break;
                    case 5:
                        this.b.d1.U(null, null);
                        break;
                    case 6:
                        ti.p(this.b);
                        break;
                    case 7:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            break;
                        }
                        break;
                    default:
                        this.b.n1.U(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i15), false, u6Var);
        this.f1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        fi.u uVar = new fi.u();
        this.e1 = uVar;
        w0Var3.setIcon(uVar);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        final int i18 = 6;
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i16), 6, -1);
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i16);
        w0Var3.setBackground(g03);
        org.telegram.ui.ActionBar.f7.k(w0Var3, g03, null, N3, u6Var);
        w0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.o4 o4Var;
                switch (i18) {
                    case 0:
                        ti tiVar = this.b;
                        tiVar.g2(tiVar.B0 != tiVar.q0);
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z13 = tiVar3.c0;
                        if (!z13) {
                            tiVar3.N1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ti tiVar4 = this.b;
                        boolean z14 = tiVar4.c0;
                        if (z14) {
                            tiVar4.N1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.E1();
                        break;
                    case 5:
                        this.b.d1.U(null, null);
                        break;
                    case 6:
                        ti.p(this.b);
                        break;
                    case 7:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            break;
                        }
                        break;
                    default:
                        this.b.n1.U(null, null);
                        break;
                }
            }
        });
        ei.n nVar2 = new ei.n(this, context);
        org.telegram.ui.ActionBar.f7.V(nVar2, org.telegram.ui.ActionBar.y6.Sh, u6Var);
        nVar2.setText(LocaleController.getString(R.string.Create));
        nVar2.setTypeface(AndroidUtilities.bold());
        nVar2.setTextSize(1, 14.0f);
        nVar2.setVisibility(4);
        nVar2.setAlpha(0.0f);
        nVar2.setGravity(17);
        nVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        nVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        final int i19 = 7;
        nVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.o4 o4Var;
                switch (i19) {
                    case 0:
                        ti tiVar = this.b;
                        tiVar.g2(tiVar.B0 != tiVar.q0);
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z13 = tiVar3.c0;
                        if (!z13) {
                            tiVar3.N1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ti tiVar4 = this.b;
                        boolean z14 = tiVar4.c0;
                        if (z14) {
                            tiVar4.N1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.E1();
                        break;
                    case 5:
                        this.b.d1.U(null, null);
                        break;
                    case 6:
                        ti.p(this.b);
                        break;
                    case 7:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            break;
                        }
                        break;
                    default:
                        this.b.n1.U(null, null);
                        break;
                }
            }
        });
        gb1.b(nVar2);
        this.i1 = nVar2;
        d2();
        if (r2Var != null) {
            w0Var = w0Var3;
            i10 = i15;
            nVar = nVar2;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i15), false, u6Var);
            this.h1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            i11 = -1;
            org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i16), 6, -1);
            org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i16);
            w0Var4.setBackground(g04);
            org.telegram.ui.ActionBar.f7.k(w0Var4, g04, null, N4, u6Var);
            w0Var4.setOnClickListener(new di.g2(5, this, z11));
        } else {
            w0Var = w0Var3;
            nVar = nVar2;
            i10 = i15;
            i11 = -1;
            f7 = 14.0f;
        }
        int i20 = i10;
        int i21 = i11;
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i20), false, u6Var);
        this.n1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        final int i22 = 8;
        w0Var5.setVisibility(8);
        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i16), 3, i21);
        org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i16);
        w0Var5.setBackground(g05);
        org.telegram.ui.ActionBar.f7.k(w0Var5, g05, null, N5, u6Var);
        final int i23 = 2;
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i23) {
                    case 0:
                        final ti tiVar = this.b;
                        wh whVar = tiVar.H0;
                        if (whVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), u6Var);
                            e0Var.m0(whVar.getText());
                            final int i24 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i24) {
                                        case 0:
                                            wh whVar2 = tiVar.H0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            yh yhVar = tiVar.S0;
                                            yhVar.setText(charSequence);
                                            yhVar.w(charSequence.length(), charSequence.length());
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
                        yh yhVar = tiVar2.S0;
                        if (yhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), u6Var);
                            e0Var2.m0(yhVar.getText());
                            final int i25 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i25) {
                                        case 0:
                                            wh whVar2 = tiVar2.H0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            yh yhVar2 = tiVar2.S0;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
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
                        tiVar3.n1.U(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar3.f0;
                        u12.M2(null, r2Var2, u6Var);
                        PhotoViewer.u1().N2(tiVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i26 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        u13.h = i26;
                        u13.n = z15;
                        if (!tiVar3.c2.E()) {
                            AndroidUtilities.hideKeyboard(r2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(tiVar3.getContainer().findFocus());
                        }
                        File w10 = fi.w7.w(tiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i27 = point.x;
                        int i28 = point.y;
                        if (i27 > 1080 || i28 > 1080) {
                            float min = Math.min(i27, i28) / 1080.0f;
                            i27 = (int) (i27 * min);
                            i28 = (int) (i28 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i27, i28, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList2.add(photoEntry);
                        PhotoViewer.u1().i2(arrayList2, 0, 11, false, new ki(tiVar3, photoEntry), r2Var2 instanceof org.telegram.ui.un ? (org.telegram.ui.un) r2Var2 : null);
                        if (tiVar3.G) {
                            PhotoViewer.u1().Y0(null, null, true, tiVar3.J);
                            break;
                        }
                        break;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        w0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.o4 o4Var;
                switch (i22) {
                    case 0:
                        ti tiVar = this.b;
                        tiVar.g2(tiVar.B0 != tiVar.q0);
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z13 = tiVar3.c0;
                        if (!z13) {
                            tiVar3.N1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ti tiVar4 = this.b;
                        boolean z14 = tiVar4.c0;
                        if (z14) {
                            tiVar4.N1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.E1();
                        break;
                    case 5:
                        this.b.d1.U(null, null);
                        break;
                    case 6:
                        ti.p(this.b);
                        break;
                    case 7:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            break;
                        }
                        break;
                    default:
                        this.b.n1.U(null, null);
                        break;
                }
            }
        });
        final int i24 = 0;
        th thVar = new th(this, context, i24);
        this.l1 = thVar;
        thVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.o4 o4Var;
                switch (i24) {
                    case 0:
                        ti tiVar = this.b;
                        tiVar.g2(tiVar.B0 != tiVar.q0);
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z13 = tiVar3.c0;
                        if (!z13) {
                            tiVar3.N1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ti tiVar4 = this.b;
                        boolean z14 = tiVar4.c0;
                        if (z14) {
                            tiVar4.N1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.E1();
                        break;
                    case 5:
                        this.b.d1.U(null, null);
                        break;
                    case 6:
                        ti.p(this.b);
                        break;
                    case 7:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            break;
                        }
                        break;
                    default:
                        this.b.n1.U(null, null);
                        break;
                }
            }
        });
        thVar.setAlpha(0.0f);
        thVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.o1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.m1 = textView;
        org.telegram.messenger.t.r(textView, i20, u6Var, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, gb1.u(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.p1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.y(imageView, mutate, i20, u6Var, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, gb1.x(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        thVar.addView(linearLayout, gb1.g(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.q1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        org.telegram.ui.ActionBar.f7.y(imageView2, mutate2, i20, u6Var, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, gb1.x(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.r1 = textView2;
        org.telegram.messenger.t.r(textView2, i20, u6Var, 1, 16.0f);
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, gb1.u(-2, -2, 16));
        thVar.addView(linearLayout2, gb1.g(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, u6Var);
        this.j0 = chatAttachAlertPhotoLayout;
        liVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.B0 = chatAttachAlertPhotoLayout;
        this.Z0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, gb1.g(-1.0f, -1));
        lh.f fVar2 = new lh.f(context);
        this.y1 = fVar2;
        fVar2.setup(bVar3);
        fVar2.setFadeTopAlpha(0);
        fVar2.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar2.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        fVar2.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(fVar2, gb1.k());
        this.containerView.addView(thVar, gb1.h(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        bh.p pVar = new bh.p(context, 10);
        this.R0 = pVar;
        this.containerView.addView(pVar, gb1.i(-1, -2, 55));
        this.containerView.addView(b8Var, gb1.g(-2.0f, -1));
        this.containerView.addView(w0Var2, gb1.i(48, 48, 53));
        this.containerView.addView(w0Var, gb1.h(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.h1;
        if (w0Var6 != null) {
            lVar = lVar2;
            this.containerView.addView(w0Var6, gb1.i(48, 48, 53));
        } else {
            lVar = lVar2;
        }
        thVar.addView(w0Var5, gb1.h(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(nVar, gb1.i(-2, 48, 53));
        th thVar2 = new th(this, context, 1);
        this.A1 = thVar2;
        uh uhVar = new uh(context, 0);
        this.B1 = uhVar;
        uhVar.setClipChildren(true);
        uhVar.setClipToPadding(false);
        qi qiVar = new qi(this, context);
        this.D1 = qiVar;
        uhVar.setAdapter(qiVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.C1 = c0Var;
        uhVar.setLayoutManager(c0Var);
        uhVar.setVerticalScrollBarEnabled(false);
        uhVar.setHorizontalScrollBarEnabled(false);
        uhVar.setItemAnimator(null);
        uhVar.setLayoutAnimation(null);
        org.telegram.ui.ActionBar.f7.m(uhVar, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
        uhVar.y2 = true;
        uhVar.setOverScrollMode(2);
        ch.b bVar4 = this.K2;
        oi.q qVar = this.glassEngine;
        bVar4.h = qVar;
        this.L2.h = qVar;
        bVar3.h = qVar;
        vh vhVar = new vh(this, context, 0);
        this.z1 = vhVar;
        ch.c cVar2 = new ch.c(bVar3.c(vhVar, null, false));
        this.b0 = cVar2;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar2.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(vhVar, gb1.k());
        eh.d c10 = this.K2.c(thVar2, gh.c.f(u6Var), false);
        c10.x(AndroidUtilities.dp(28.0f));
        c10.w(AndroidUtilities.dp(7.0f));
        thVar2.setBackground(c10);
        uhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        uhVar.setClipToOutline(true);
        int dp3 = AndroidUtilities.dp(11.0f);
        float dp4 = AndroidUtilities.dp(28.0f);
        ag.v0 v0Var = ag.z0.a;
        uhVar.setOutlineProvider(new ag.x0(dp3, dp4));
        uhVar.setImportantForAccessibility(1);
        thVar2.addView(uhVar, gb1.k());
        this.containerView.addView(thVar2, gb1.i(-1, 70, 81));
        uhVar.setOnItemClickListener(new di.x4(9, this, u6Var));
        uhVar.setOnItemLongClickListener(new dh(this, 3));
        s6 s6Var = new s6(context, true, false, true);
        this.H1 = s6Var;
        s6Var.setVisibility(8);
        s6Var.setAlpha(0.0f);
        s6Var.setGravity(17);
        s6Var.setTypeface(AndroidUtilities.bold());
        int dp5 = AndroidUtilities.dp(16.0f);
        s6Var.setPadding(dp5, 0, dp5, 0);
        s6Var.setTextSize(AndroidUtilities.dp(f7));
        final int i25 = 1;
        s6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.o4 o4Var;
                switch (i25) {
                    case 0:
                        ti tiVar = this.b;
                        tiVar.g2(tiVar.B0 != tiVar.q0);
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z13 = tiVar3.c0;
                        if (!z13) {
                            tiVar3.N1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ti tiVar4 = this.b;
                        boolean z14 = tiVar4.c0;
                        if (z14) {
                            tiVar4.N1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.E1();
                        break;
                    case 5:
                        this.b.d1.U(null, null);
                        break;
                    case 6:
                        ti.p(this.b);
                        break;
                    case 7:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            break;
                        }
                        break;
                    default:
                        this.b.n1.U(null, null);
                        break;
                }
            }
        });
        this.containerView.addView(s6Var, gb1.i(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, gb1.h(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.I0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i26 = org.telegram.ui.ActionBar.y6.z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.f7.t(imageView3, i26, u6Var, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i27 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.o4 o4Var;
                switch (i27) {
                    case 0:
                        ti tiVar = this.b;
                        tiVar.g2(tiVar.B0 != tiVar.q0);
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z13 = tiVar3.c0;
                        if (!z13) {
                            tiVar3.N1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ti tiVar4 = this.b;
                        boolean z14 = tiVar4.c0;
                        if (z14) {
                            tiVar4.N1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.E1();
                        break;
                    case 5:
                        this.b.d1.U(null, null);
                        break;
                    case 6:
                        ti.p(this.b);
                        break;
                    case 7:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            break;
                        }
                        break;
                    default:
                        this.b.n1.U(null, null);
                        break;
                }
            }
        });
        th thVar3 = new th(this, context, i27);
        this.G0 = thVar3;
        jg.k kVar = new jg.k(this, context);
        this.F0 = kVar;
        thVar3.addView(kVar, gb1.i(-1, -1, 119));
        eh.d c11 = this.L2.c(giVar, gh.c.o(u6Var), false);
        this.D0 = c11;
        c11.E = true;
        c11.y(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.A(AndroidUtilities.dp(32.0f));
        c11.x.g = 0.4f;
        c11.t();
        eh.d c12 = this.K2.c(kVar, gh.c.o(u6Var), false);
        this.E0 = c12;
        c12.x(AndroidUtilities.dp(22.0f));
        c12.w(AndroidUtilities.dp(7.0f));
        kVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        thVar3.setWillNotDraw(false);
        thVar3.setVisibility(4);
        thVar3.setAlpha(0.0f);
        this.containerView.addView(thVar3, gb1.i(-1, -2, 83));
        thVar3.setOnTouchListener(new ei.d(13));
        s6 s6Var2 = new s6(context, false, false, false);
        this.s = s6Var2;
        s6Var2.setAllowCancel(true);
        s6Var2.setScaleProperty(0.6f);
        s6Var2.setVisibility(8);
        s6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i28 = org.telegram.ui.ActionBar.y6.y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i28, u6Var);
        s6Var2.setTypeface(AndroidUtilities.bold());
        s6Var2.setGravity(17);
        kVar.addView(s6Var2, gb1.h(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.w = imageView4;
        i0 i0Var = new i0(context);
        this.x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i29 = org.telegram.ui.ActionBar.y6.Wk;
        org.telegram.ui.ActionBar.f7.t(imageView4, i29, u6Var, mode);
        int i30 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g06 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i30), 1, AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.b7 N6 = org.telegram.ui.ActionBar.f7.N(i30);
        imageView4.setBackground(g06);
        org.telegram.ui.ActionBar.f7.k(imageView4, g06, null, N6, u6Var);
        kVar.addView(imageView4, gb1.h(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        gb1.b(imageView4);
        final int i31 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i31) {
                    case 0:
                        final ti tiVar = this.b;
                        wh whVar = tiVar.H0;
                        if (whVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), u6Var);
                            e0Var.m0(whVar.getText());
                            final int i242 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i242) {
                                        case 0:
                                            wh whVar2 = tiVar.H0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            yh yhVar2 = tiVar.S0;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
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
                        yh yhVar = tiVar2.S0;
                        if (yhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), u6Var);
                            e0Var2.m0(yhVar.getText());
                            final int i252 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i252) {
                                        case 0:
                                            wh whVar2 = tiVar2.H0;
                                            whVar2.setText(charSequence);
                                            whVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            yh yhVar2 = tiVar2.S0;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
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
                        tiVar3.n1.U(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar3.f0;
                        u12.M2(null, r2Var2, u6Var);
                        PhotoViewer.u1().N2(tiVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i262 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        u13.h = i262;
                        u13.n = z15;
                        if (!tiVar3.c2.E()) {
                            AndroidUtilities.hideKeyboard(r2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(tiVar3.getContainer().findFocus());
                        }
                        File w10 = fi.w7.w(tiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i272 = point.x;
                        int i282 = point.y;
                        if (i272 > 1080 || i282 > 1080) {
                            float min = Math.min(i272, i282) / 1080.0f;
                            i272 = (int) (i272 * min);
                            i282 = (int) (i282 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i272, i282, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList2.add(photoEntry);
                        PhotoViewer.u1().i2(arrayList2, 0, 11, false, new ki(tiVar3, photoEntry), r2Var2 instanceof org.telegram.ui.un ? (org.telegram.ui.un) r2Var2 : null);
                        if (tiVar3.G) {
                            PhotoViewer.u1().Y0(null, null, true, tiVar3.J);
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
        wh whVar = new wh(this, context, giVar, u6Var);
        this.H0 = whVar;
        whVar.J = true;
        whVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        whVar.s();
        whVar.getEditText().setLayoutParams(gb1.h(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        whVar.getEditText().addTextChangedListener(new xh(this, 0));
        kVar.addView(whVar, gb1.h(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        kVar.setClipChildren(false);
        thVar3.setClipChildren(false);
        whVar.setClipChildren(false);
        pVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        pVar.setWillNotDraw(false);
        yh yhVar = new yh(this, context, giVar, u6Var);
        this.S0 = yhVar;
        yhVar.J = true;
        yhVar.getEditText().addTextChangedListener(new ai(this, r2Var));
        yhVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        yhVar.getEditText().setLayoutParams(gb1.h(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        yhVar.getEditText().setTextSize(1, 17.0f);
        yhVar.getEmojiButton().setLayoutParams(gb1.h(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        yhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        pVar.addView(yhVar, gb1.i(-1, -2, 119));
        pVar.setAlpha(0.0f);
        pVar.setVisibility(8);
        whVar.addView(imageView3, gb1.h(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        eh.d c13 = this.K2.c(pVar, gh.c.o(u6Var), false);
        c13.x(AndroidUtilities.dp(22.0f));
        c13.w(AndroidUtilities.dp(7.0f));
        pVar.setBackground(c13);
        pVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        s6 s6Var3 = new s6(context, false, false, false);
        this.v = s6Var3;
        s6Var3.setScaleProperty(0.6f);
        s6Var3.setVisibility(8);
        s6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.f7.Z(s6Var3, i28, u6Var);
        s6Var3.setTypeface(AndroidUtilities.bold());
        s6Var3.setGravity(17);
        s6Var3.setAllowCancel(true);
        pVar.addView(s6Var3, gb1.h(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        org.telegram.ui.ActionBar.f7.t(imageView5, org.telegram.ui.ActionBar.y6.Xd, u6Var, mode2);
        yhVar.addView(imageView5, gb1.h(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i32 = 3;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.o4 o4Var;
                switch (i32) {
                    case 0:
                        ti tiVar = this.b;
                        tiVar.g2(tiVar.B0 != tiVar.q0);
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z13 = tiVar3.c0;
                        if (!z13) {
                            tiVar3.N1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ti tiVar4 = this.b;
                        boolean z14 = tiVar4.c0;
                        if (z14) {
                            tiVar4.N1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.E1();
                        break;
                    case 5:
                        this.b.d1.U(null, null);
                        break;
                    case 6:
                        ti.p(this.b);
                        break;
                    case 7:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            break;
                        }
                        break;
                    default:
                        this.b.n1.U(null, null);
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
        org.telegram.ui.ActionBar.f7.t(imageView6, i29, u6Var, mode);
        org.telegram.ui.Cells.y g07 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i30), 1, AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.b7 N7 = org.telegram.ui.ActionBar.f7.N(i30);
        imageView6.setBackground(g07);
        org.telegram.ui.ActionBar.f7.k(imageView6, g07, null, N7, u6Var);
        pVar.addView(imageView6, gb1.h(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        gb1.b(imageView6);
        final int i33 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i33) {
                    case 0:
                        final ti tiVar = this.b;
                        wh whVar2 = tiVar.H0;
                        if (whVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(tiVar.getContext(), u6Var);
                            e0Var.m0(whVar2.getText());
                            final int i242 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i242) {
                                        case 0:
                                            wh whVar22 = tiVar.H0;
                                            whVar22.setText(charSequence);
                                            whVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            yh yhVar2 = tiVar.S0;
                                            yhVar2.setText(charSequence);
                                            yhVar2.w(charSequence.length(), charSequence.length());
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
                        yh yhVar2 = tiVar2.S0;
                        if (yhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(tiVar2.getContext(), u6Var);
                            e0Var2.m0(yhVar2.getText());
                            final int i252 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i252) {
                                        case 0:
                                            wh whVar22 = tiVar2.H0;
                                            whVar22.setText(charSequence);
                                            whVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            yh yhVar22 = tiVar2.S0;
                                            yhVar22.setText(charSequence);
                                            yhVar22.w(charSequence.length(), charSequence.length());
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
                        tiVar3.n1.U(null, null);
                        PhotoViewer u12 = PhotoViewer.u1();
                        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar3.f0;
                        u12.M2(null, r2Var2, u6Var);
                        PhotoViewer.u1().N2(tiVar3);
                        PhotoViewer u13 = PhotoViewer.u1();
                        int i262 = tiVar3.V1;
                        boolean z15 = tiVar3.W1;
                        u13.h = i262;
                        u13.n = z15;
                        if (!tiVar3.c2.E()) {
                            AndroidUtilities.hideKeyboard(r2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(tiVar3.getContainer().findFocus());
                        }
                        File w10 = fi.w7.w(tiVar3.M1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i272 = point.x;
                        int i282 = point.y;
                        if (i272 > 1080 || i282 > 1080) {
                            float min = Math.min(i272, i282) / 1080.0f;
                            i272 = (int) (i272 * min);
                            i282 = (int) (i282 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i272, i282, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList2.add(photoEntry);
                        PhotoViewer.u1().i2(arrayList2, 0, 11, false, new ki(tiVar3, photoEntry), r2Var2 instanceof org.telegram.ui.un ? (org.telegram.ui.un) r2Var2 : null);
                        if (tiVar3.G) {
                            PhotoViewer.u1().Y0(null, null, true, tiVar3.J);
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
        th thVar4 = new th(this, context, 3);
        this.K0 = thVar4;
        thVar4.setFocusable(true);
        thVar4.setFocusableInTouchMode(true);
        thVar4.setVisibility(4);
        thVar4.setScaleX(0.2f);
        thVar4.setScaleY(0.2f);
        thVar4.setAlpha(0.0f);
        thVar4.setClipChildren(false);
        thVar4.setClipToPadding(false);
        this.containerView.addView(thVar4, gb1.i(110, 50, 85));
        bi biVar = new bi(R.drawable.send_plane_24, context, u6Var, this);
        this.L0 = biVar;
        biVar.setImportantForAccessibility(2);
        thVar4.addView(biVar, gb1.i(-1, -1, 119));
        biVar.setTranslationX(this.backgroundPaddingLeft);
        int dp6 = AndroidUtilities.dp(52.0f);
        int dp7 = AndroidUtilities.dp(38.0f);
        biVar.I = dp6;
        biVar.J = dp7;
        float dp8 = AndroidUtilities.dp(7.0f);
        float dp9 = AndroidUtilities.dp(6.0f);
        biVar.M = dp8;
        biVar.N = dp9;
        biVar.h0 = true;
        final int i34 = 4;
        biVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ ti b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hi.o4 o4Var;
                switch (i34) {
                    case 0:
                        ti tiVar = this.b;
                        tiVar.g2(tiVar.B0 != tiVar.q0);
                        break;
                    case 1:
                        ti tiVar2 = this.b;
                        long j10 = tiVar2.Z0;
                        if (j10 < 0 && (o4Var = (hi.o4) tiVar2.A0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.y("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        ti tiVar3 = this.b;
                        boolean z13 = tiVar3.c0;
                        if (!z13) {
                            tiVar3.N1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        ti tiVar4 = this.b;
                        boolean z14 = tiVar4.c0;
                        if (z14) {
                            tiVar4.N1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.E1();
                        break;
                    case 5:
                        this.b.d1.U(null, null);
                        break;
                    case 6:
                        ti.p(this.b);
                        break;
                    case 7:
                        li liVar = this.b.B0;
                        if (liVar != null) {
                            liVar.v(40);
                            break;
                        }
                        break;
                    default:
                        this.b.n1.U(null, null);
                        break;
                }
            }
        });
        biVar.setOnLongClickListener(new org.telegram.ui.zf(this, context, u6Var, r2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        vh vhVar2 = new vh(this, context, 1);
        vhVar2.setAlpha(0.0f);
        vhVar2.setScaleX(0.2f);
        vhVar2.setScaleY(0.2f);
        if (z10) {
            h1();
            this.navBarColorKey = -1;
        }
        sl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        ch.b bVar5 = this.K2;
        fh.e o10 = gh.c.o(u6Var);
        mm0 mm0Var = fastScroll.p0;
        eh.d c14 = bVar5.c(mm0Var.d1, o10, false);
        fastScroll.e0 = c14;
        c14.w(AndroidUtilities.dp(4.0f));
        fastScroll.e0.x(AndroidUtilities.dp(24.0f));
        eh.d c15 = bVar5.c(mm0Var.d1, o10, false);
        fastScroll.f0 = c15;
        c15.w(AndroidUtilities.dp(6.0f));
        fastScroll.f0.A(AndroidUtilities.dp(4.0f));
        fastScroll.f0.x(AndroidUtilities.dp(f7));
        le0 le0Var = new le0(context);
        this.S = le0Var;
        this.containerView.addView(le0Var, gb1.g(-1.0f, -1));
        fh.e eVar = new fh.e(u6Var);
        eVar.e = new dh(this, 5);
        eVar.c = new dh(this, 6);
        eVar.d = new dh(this, 7);
        eVar.b = new dh(this, 8);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.n = dpf2;
        eVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f = dpf23;
        eVar.h = dpf24;
        b8Var.I(this.K2, eVar, false);
        lVar.h(1L, false);
        this.glassEngine.i(this.containerView);
        oi.q qVar2 = this.glassEngine;
        qVar2.a = new dh(this, 9);
        qVar2.d = new qi.b(AndroidUtilities.dp(48.0f));
    }

    public static void I(ti tiVar) {
        b8 b8Var = tiVar.a1;
        lh.f fVar = tiVar.y1;
        if (fVar == null || b8Var == null) {
            return;
        }
        li liVar = tiVar.C0;
        if (liVar == null) {
            liVar = tiVar.B0;
        }
        int i10 = 0;
        boolean z10 = liVar != null && (liVar instanceof al);
        org.telegram.ui.ActionBar.u6 u6Var = tiVar.resourcesProvider;
        boolean a2 = u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q();
        if (!z10 && b8Var.getVisibility() == 0) {
            i10 = (int) (b8Var.getAlpha() * (a2 ? 255 : 160));
        }
        fVar.setFadeTopAlpha(i10);
    }

    public static void K1(li liVar) {
        if (liVar == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.f7.b;
        Object tag = liVar.getTag(R.id.theme_generation);
        if ((tag instanceof Integer) && ((Integer) tag).intValue() == i10) {
            return;
        }
        liVar.setTag(R.id.theme_generation, Integer.valueOf(i10));
        try {
            org.telegram.ui.ActionBar.f7.e0(liVar, true);
            liVar.d();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void M(ti tiVar) {
        fi.i iVar = new fi.i(tiVar, tiVar.getContext(), tiVar.Z, LaunchActivity.R(), tiVar.resourcesProvider, 1);
        tiVar.H2 = iVar;
        iVar.p(new jg.s0(tiVar, 18));
        ViewGroup viewGroup = tiVar.containerView;
        viewGroup.addView(tiVar.H2, viewGroup.indexOfChild(tiVar.G0), gb1.i(-1, -1, 83));
        fi.i iVar2 = tiVar.H2;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        if (r2Var instanceof org.telegram.ui.un) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var;
            ig.j1 adapter = iVar2.getAdapter();
            unVar.i();
            TLRPC.Chat chat = unVar.e;
            adapter.getClass();
            adapter.l0 = chat;
            iVar2.getAdapter().W(unVar.l8);
            iVar2.getAdapter().e0 = unVar.e != null;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().e0 = false;
        }
        iVar2.getAdapter().f0 = false;
        tiVar.b2();
    }

    public static /* synthetic */ void m(ti tiVar) {
        li liVar;
        cn cnVar;
        tiVar.w1 = null;
        li liVar2 = tiVar.B0;
        if (liVar2 != tiVar.j0 && (liVar = tiVar.C0) != (cnVar = tiVar.q0) && liVar2 != liVar && liVar2 != cnVar) {
            tiVar.containerView.removeView(liVar2);
        }
        tiVar.B0.setVisibility(8);
        tiVar.B0.s();
        tiVar.C0.H();
        tiVar.B0 = tiVar.C0;
        tiVar.C0 = null;
        int[] iArr = tiVar.e2;
        iArr[0] = iArr[1];
        tiVar.N1(tiVar.c0, false);
        tiVar.d2();
    }

    public static /* synthetic */ void n(ti tiVar) {
        tiVar.currentSheetAnimation = null;
        tiVar.currentSheetAnimationType = 0;
        tiVar.dismissInternal();
    }

    public static int n0(ti tiVar) {
        li liVar = tiVar.B0;
        go goVar = tiVar.m0;
        if (liVar == goVar && goVar.E != null) {
            return goVar.getEmojiPadding();
        }
        go goVar2 = tiVar.n0;
        return (liVar != goVar2 || goVar2.E == null) ? tiVar.c0 ? tiVar.S0.getEmojiPadding() : tiVar.H0.getEmojiPadding() : goVar2.getEmojiPadding();
    }

    public static /* synthetic */ void o(ti tiVar, boolean z10, gh ghVar) {
        tiVar.B0.u(1.0f);
        tiVar.C0.u(1.0f);
        tiVar.B0.l(tiVar.o2);
        tiVar.C0.l(tiVar.o2);
        tiVar.glassEngine.g();
        tiVar.containerView.invalidate();
        tiVar.a1.setTag(z10 ? 1 : null);
        ghVar.run();
    }

    public static void p(ti tiVar) {
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
                            if (childAt instanceof org.telegram.ui.Cells.x5) {
                                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                                if (x5Var.getPhotoEntry() == photoEntry) {
                                    x5Var.getImageView().invalidate();
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
        tiVar.f2(true);
        org.telegram.ui.ActionBar.w0 w0Var = tiVar.f1;
        fi.v3 v3Var = tiVar.g1;
        if (v3Var != null) {
            v3Var.e(true);
        }
        fi.v3 v3Var2 = new fi.v3(tiVar.getContext(), 1);
        tiVar.g1 = v3Var2;
        v3Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(!S ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        tiVar.g1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        tiVar.g1.m(1.0f, -((tiVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        tiVar.g1.setTranslationY(tiVar.d1.getTranslationY());
        fi.v3 v3Var3 = tiVar.g1;
        v3Var3.l0 = new org.telegram.ui.ip(14, tiVar, v3Var2);
        tiVar.containerView.addView(v3Var3, gb1.h(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        tiVar.g1.u();
    }

    public static /* synthetic */ void q(ti tiVar, int i10) {
        tiVar.navBarColorKey = -1;
        tiVar.navBarColor = i10;
        tiVar.containerView.invalidate();
    }

    public static /* synthetic */ void r(ti tiVar, ValueAnimator valueAnimator) {
        tiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.h3 h3Var = tiVar.container;
        if (h3Var != null) {
            h3Var.invalidate();
        }
    }

    public static void t(ti tiVar, org.telegram.ui.ActionBar.u6 u6Var, View view) {
        uh uhVar = tiVar.B1;
        li[] liVarArr = tiVar.z0;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        org.telegram.ui.ActionBar.r2 R = r2Var == null ? LaunchActivity.R() : r2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (view instanceof ni) {
            Activity parentActivity = R.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!tiVar.O1 && !tiVar.P1 && tiVar.f1()) {
                    return;
                }
                if (!tiVar.O1 && !tiVar.P1) {
                    ho hoVar = new ho(1, tiVar.getContext(), u6Var, tiVar);
                    tiVar.T = hoVar;
                    tiVar.X1(hoVar);
                }
                tiVar.X1(tiVar.j0);
            } else if (intValue == 17) {
                if (tiVar.w0 == null && (r2Var instanceof org.telegram.ui.un)) {
                    TLRPC.User i10 = ((org.telegram.ui.un) r2Var).i();
                    if (x1(i10)) {
                        al alVar = new al(tiVar, tiVar.getContext(), tiVar.M1, i10, u6Var);
                        tiVar.w0 = alVar;
                        liVarArr[11] = alVar;
                    }
                }
                li liVar = tiVar.w0;
                if (liVar != null) {
                    tiVar.X1(liVar);
                }
            } else if (intValue == 3) {
                if (!tiVar.Q1 && tiVar.f1()) {
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
                tiVar.G1(true);
            } else if (intValue == 4) {
                if (!tiVar.N1 && tiVar.f1()) {
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
                tiVar.J1(true);
            } else if (intValue == 5) {
                if (!tiVar.T1 && tiVar.f1()) {
                    return;
                }
                if (tiVar.T1 && tiVar.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(tiVar.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                tiVar.I1();
            } else if (intValue == 6) {
                if ((!tiVar.T1 && tiVar.f1()) || !AndroidUtilities.isMapsInstalled(r2Var)) {
                    return;
                }
                if (tiVar.T1) {
                    if (tiVar.o0 == null) {
                        sl slVar = new sl(tiVar, tiVar.getContext(), u6Var, (tiVar.H || tiVar.U1) ? false : true);
                        tiVar.o0 = slVar;
                        liVarArr[5] = slVar;
                        nl nlVar = tiVar.z2;
                        if (nlVar != null) {
                            slVar.setDelegate(nlVar);
                        } else {
                            slVar.setDelegate(new dh(tiVar, 12));
                        }
                    }
                    tiVar.X1(tiVar.o0);
                } else {
                    ho hoVar2 = new ho(6, tiVar.getContext(), u6Var, tiVar);
                    tiVar.T = hoVar2;
                    tiVar.X1(hoVar2);
                }
            } else if (intValue == 9) {
                if (!tiVar.R1 && tiVar.f1()) {
                    return;
                }
                if (tiVar.R1) {
                    tiVar.Z1(true, null);
                } else {
                    ho hoVar3 = new ho(9, tiVar.getContext(), u6Var, tiVar);
                    tiVar.T = hoVar3;
                    tiVar.X1(hoVar3);
                }
            } else if (intValue == 11) {
                if (tiVar.s0 == null) {
                    jg.i0 i0Var = new jg.i0(tiVar.getContext(), tiVar.resourcesProvider, tiVar);
                    tiVar.s0 = i0Var;
                    liVarArr[7] = i0Var;
                    i0Var.setupBlurredSearchField(tiVar.K2);
                }
                tiVar.X1(tiVar.s0);
            } else if (intValue == 12) {
                if (!tiVar.S1 && tiVar.f1()) {
                    return;
                }
                if (tiVar.S1) {
                    if (tiVar.n0 == null) {
                        go goVar = new go(tiVar, tiVar.getContext(), true, u6Var, null);
                        tiVar.n0 = goVar;
                        liVarArr[1] = goVar;
                        goVar.setDelegate(new dh(tiVar, 13));
                    }
                    tiVar.X1(tiVar.n0);
                } else {
                    ho hoVar4 = new ho(9, tiVar.getContext(), u6Var, tiVar);
                    tiVar.T = hoVar4;
                    tiVar.X1(hoVar4);
                }
            } else if (intValue == 13) {
                if (tiVar.u0 == null) {
                    ok okVar = new ok(tiVar, tiVar.getContext(), u6Var, true);
                    tiVar.u0 = okVar;
                    liVarArr[8] = okVar;
                    okVar.setDelegate(tiVar.d2);
                }
                tiVar.X1(tiVar.u0);
            } else if (intValue == 14) {
                if (tiVar.t0 == null) {
                    ok okVar2 = new ok(tiVar, tiVar.getContext(), u6Var, false);
                    tiVar.t0 = okVar2;
                    liVarArr[9] = okVar2;
                    okVar2.setDelegate(tiVar.d2);
                }
                tiVar.X1(tiVar.t0);
            } else if (intValue == 16) {
                if (tiVar.v0 == null) {
                    li.q qVar = new li.q(tiVar.M1, tiVar.getContext(), u6Var, tiVar);
                    tiVar.v0 = qVar;
                    liVarArr[10] = qVar;
                }
                tiVar.X1(tiVar.v0);
            } else if (view.getTag() instanceof Integer) {
                tiVar.c2.p0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, tiVar.w1(), false, 0L);
            }
        } else if (view instanceof mi) {
            mi miVar = (mi) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = miVar.c;
            if (tL_attachMenuBot == null) {
                tiVar.c2.Y(miVar.b);
                tiVar.dismiss();
            } else if (tL_attachMenuBot.inactive) {
                ki1.a(tiVar.getContext(), new li.s2(24, tiVar, miVar), null);
            } else {
                tiVar.U1(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int dp = AndroidUtilities.dp(70.0f);
        int i11 = left - dp;
        if (i11 < 0) {
            uhVar.w0(i11, 0, null);
            return;
        }
        int i12 = right + dp;
        if (i12 > uhVar.getMeasuredWidth()) {
            uhVar.w0(i12 - uhVar.getMeasuredWidth(), 0, null);
        }
    }

    public static void u(ti tiVar, int i10) {
        ch.f fVar = tiVar.I2;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (a8.pf.a(i10, 4)) {
            qi.a e = tiVar.glassEngine.e();
            e.b(tiVar.containerView.getY(), tiVar.containerView.getWidth(), tiVar.containerView.getY() + tiVar.containerView.getHeight());
            fVar.h(e);
        }
        fVar.e(tiVar.M2, tiVar.containerView.getWidth(), tiVar.containerView.getHeight());
    }

    public static void v(ti tiVar) {
        o1.j jVar = tiVar.s2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(tiVar.containerView, o1.h.n, 0.0f);
        tiVar.s2 = jVar2;
        jVar2.u.a(1.5f);
        tiVar.s2.u.b(1500.0f);
        tiVar.s2.h();
    }

    public static /* synthetic */ void w(ti tiVar, kg kgVar) {
        AnimatorSet animatorSet = tiVar.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        kgVar.run();
    }

    public static /* synthetic */ void x(ti tiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.d3 d3Var) {
        tiVar.currentSheetAnimation = null;
        tiVar.s2 = null;
        animationNotificationsLocker.unlock();
        tiVar.currentSheetAnimationType = 0;
        if (d3Var != null) {
            d3Var.onOpenAnimationEnd();
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

    public static boolean x1(TLRPC.User user) {
        return (user == null || UserObject.isUserSelf(user) || UserObject.isBot(user) || UserObject.isDeleted(user) || UserObject.isService(user.id) || UserObject.isReplyUser(user) || UserObject.isAnonymous(user) || user.id == UserObject.VERIFY || MessagesController.isSupportUser(user)) ? false : true;
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
    public static boolean y(ti tiVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ActionBar.r2 r2Var, View view) {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        org.telegram.ui.un unVar;
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
        org.telegram.ui.un unVar2;
        TLRPC.ChatFull chatFull;
        boolean z13;
        boolean z14;
        int i11;
        boolean z15;
        bi biVar = tiVar.L0;
        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = tiVar.j0;
        int i12 = tiVar.M1;
        long j14 = tiVar.Z;
        if ((j14 != 0 || (r2Var2 instanceof org.telegram.ui.un)) && tiVar.K - tiVar.L >= 0 && !tiVar.h.f) {
            if (r2Var2 instanceof org.telegram.ui.un) {
                org.telegram.ui.un unVar3 = (org.telegram.ui.un) r2Var2;
                TLRPC.User i13 = unVar3.i();
                MessageObject messageObject5 = unVar3.z5;
                MessageObject messageObject6 = unVar3.w5;
                if (!unVar3.c() && unVar3.d4 != 5) {
                    messageObject2 = messageObject6;
                    messageObject = messageObject5;
                    unVar = unVar3;
                    user = i13;
                    j14 = unVar3.a();
                }
            } else {
                user = MessagesController.getInstance(i12).getUser(Long.valueOf(j14));
                messageObject = null;
                messageObject2 = null;
                unVar = null;
            }
            mf mfVar = tiVar.h0;
            if (mfVar != null) {
                mfVar.dismiss();
            }
            mf mfVar2 = new mf(tiVar, context, u6Var, 1);
            tiVar.h0 = mfVar2;
            mfVar2.q(biVar, false, new bi.w0(tiVar, r2Var, u6Var, 19));
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
                                                        } catch (IOException e12) {
                                                            FileLog.e(e12);
                                                        }
                                                    } catch (Throwable th7) {
                                                        th3 = th7;
                                                        th2 = th3;
                                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                                        if (mediaMetadataRetriever != null) {
                                                            try {
                                                                mediaMetadataRetriever.release();
                                                            } catch (IOException e13) {
                                                                FileLog.e(e13);
                                                            }
                                                        }
                                                        if (parcelFileDescriptor == null) {
                                                            throw th2;
                                                        }
                                                        try {
                                                            parcelFileDescriptor.close();
                                                            throw th2;
                                                        } catch (IOException e14) {
                                                            FileLog.e(e14);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    i10 = 0;
                                                    photoEntry.videoOrientation = i10;
                                                    FileLog.e(e);
                                                    if (mediaMetadataRetriever2 != null) {
                                                        try {
                                                            mediaMetadataRetriever2.release();
                                                        } catch (IOException e16) {
                                                            FileLog.e(e16);
                                                        }
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
                                    CharSequence[] charSequenceArr = {tiVar.r1().getText()};
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
                    if (TextUtils.isEmpty(tiVar.r1().getText())) {
                        i11 = 0;
                        z15 = false;
                    } else {
                        TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                        tL_message2.id = 0;
                        tL_message2.out = true;
                        tL_message2.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                        tL_message2.peer_id = MessagesController.getInstance(i12).getPeer(j14);
                        CharSequence[] charSequenceArr2 = {tiVar.r1().getText()};
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
                                        CharSequence[] charSequenceArr3 = {tiVar.r1().getText()};
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
                                CharSequence[] charSequenceArr4 = {tiVar.r1().getText()};
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
            k80 F = k80.F(tiVar.containerView, u6Var, biVar);
            if (messageObject4 != null) {
                li liVar2 = tiVar.B0;
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (liVar2 == chatAttachAlertPhotoLayout2 || liVar2 == tiVar.q0) {
                    mc0 mc0Var = new mc0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), u6Var);
                    TLRPC.Message message = messageObject4.messageOwner;
                    boolean z18 = tiVar.c0;
                    message.invert_media = z18;
                    mc0Var.a(!z18, false);
                    mc0Var.setOnClickListener(new bi.w0(tiVar, messageObject4, mc0Var, 20));
                    F.q(mc0Var);
                    if (tiVar.K1 == null) {
                        F.k();
                    }
                }
            } else {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            }
            boolean isUserSelf = UserObject.isUserSelf(user);
            if (tiVar.K1 != null || ((unVar != null && ChatObject.isMonoForum(unVar.e)) || ((unVar == null || !unVar.I6()) && !tiVar.B0.c()))) {
                j12 = j10;
            } else {
                j12 = j10;
                F.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new a3.i0(tiVar, j12, u6Var, 21), false);
            }
            li liVar3 = tiVar.B0;
            if (liVar3 == chatAttachAlertPhotoLayout2 || liVar3 == tiVar.q0) {
                z12 = true;
                if (liVar3.getSelectedItemsCount() == 1 && unVar != null && ChatObject.isMonoForum(unVar.e)) {
                    unVar2 = unVar;
                    j13 = j12;
                    F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new bi.y2(tiVar, j12, unVar2, u6Var, 16), false);
                } else {
                    j13 = j12;
                    unVar2 = unVar;
                }
            } else {
                j13 = j12;
                unVar2 = unVar;
                z12 = true;
            }
            if (tiVar.K1 == null && !isUserSelf) {
                F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new gh(tiVar, i14), false);
            }
            if (tiVar.K1 == null && z10 && unVar2 != null && ChatObject.isChannelAndNotMegaGroup(unVar2.e) && (chatFull = unVar2.l8) != null && chatFull.paid_media_allowed) {
                F.c(R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton), null, false);
                org.telegram.ui.ActionBar.g1 y3 = F.y();
                y3.setOnClickListener(new di.c4(tiVar, context, y3, u6Var, 12));
                long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
                if (starsPrice > 0) {
                    y3.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    y3.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
                } else {
                    y3.setText(LocaleController.getString(R.string.PaidMediaButton));
                    y3.setSubtext(null);
                }
                tiVar.h0.r(starsPrice);
            }
            F.Y();
            tiVar.h0.o(F);
            tiVar.h0.p(arrayList2);
            if (tiVar.K1 == null && j13 >= 0 && z11) {
                tiVar.h0.c(r2Var);
                tiVar.h0.n(tiVar.Q0);
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

    public final void A1() {
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
        wh whVar = this.H0;
        if (whVar != null) {
            whVar.o();
        }
        yh yhVar = this.S0;
        if (yhVar != null) {
            yhVar.o();
        }
    }

    public final void B1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
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
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        e2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 24));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.p();
    }

    public final void C1() {
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

    public final void D1() {
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
            this.c2.E();
        }
        qi qiVar = this.D1;
        if (qiVar != null) {
            qiVar.l();
        }
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        li liVar;
        if (i10 == 0) {
            l1();
            j1();
            return;
        }
        if (i10 == 2) {
            j1();
            go goVar = this.m0;
            if (goVar != null && ((liVar = this.C0) == goVar || this.B0 == goVar)) {
                h2(liVar == goVar ? 1 : 0);
            }
            go goVar2 = this.n0;
            if (goVar2 != null) {
                li liVar2 = this.C0;
                if (liVar2 == goVar2 || this.B0 == goVar2) {
                    h2(liVar2 != goVar2 ? 0 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 1) {
            j1();
            return;
        }
        if (i10 == 3) {
            k1();
            return;
        }
        if (i10 == 4) {
            k1();
            return;
        }
        if (i10 == 5) {
            k1();
            bi biVar = this.L0;
            if (biVar != null) {
                biVar.setEphemeralFactor(f7);
                biVar.setSameWidthFactor(f7);
            }
        }
    }

    public final void E1() {
        MessageObject messageObject = this.K1;
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        int i10 = this.M1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.K1.getDialogId()) && (r2Var instanceof org.telegram.ui.un)) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var;
            MessageSuggestionParams messageSuggestionParams = unVar.s5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.K1.messageOwner.suggested_post);
            }
            if (!bi.ca.U(i10, messageSuggestionParams.amount)) {
                unVar.fc(messageSuggestionParams);
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
            V1(r2Var);
            return;
        }
        if (this.K1 == null && (r2Var instanceof org.telegram.ui.un)) {
            org.telegram.ui.un unVar2 = (org.telegram.ui.un) r2Var;
            if (unVar2.c()) {
                g5.L(getContext(), unVar2.a(), new dh(this, 14), this.resourcesProvider);
                return;
            }
        }
        li liVar = this.B0;
        if (liVar == this.j0 || liVar == this.q0) {
            M1(0, true, 0, w1(), this.Q0);
            return;
        }
        if (liVar.K(0, true, 0, w1(), this.Q0)) {
            return;
        }
        this.G2 = true;
        dismiss();
    }

    public final void F1(int i10) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (i10 == 3) {
            if (this.Q1 || !f1()) {
                Activity parentActivity = r2Var != null ? r2Var.getParentActivity() : null;
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
                G1(true);
                return;
            }
            return;
        }
        if (i10 == 6 && AndroidUtilities.isMapsInstalled(r2Var)) {
            if (this.o0 == null) {
                sl slVar = new sl(this, getContext(), this.resourcesProvider, (this.H || this.U1) ? false : true);
                this.o0 = slVar;
                this.z0[5] = slVar;
                nl nlVar = this.z2;
                if (nlVar != null) {
                    slVar.setDelegate(nlVar);
                } else if (r2Var instanceof org.telegram.ui.un) {
                    slVar.setDelegate(new dh(this, 18));
                }
            }
            X1(this.o0);
        }
    }

    public final void G1(boolean z10) {
        if (!this.Q1 && z10) {
            ho hoVar = new ho(3, getContext(), this.resourcesProvider, this);
            this.T = hoVar;
            X1(hoVar);
        }
        int i10 = 1;
        if (this.l0 == null) {
            fj fjVar = new fj(getContext(), this.resourcesProvider, this);
            this.l0 = fjVar;
            this.z0[3] = fjVar;
            fjVar.setupBlurredSearchField(this.K2);
            this.l0.setDelegate(new dh(this, 15));
            if (this.H) {
                this.l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (r2Var instanceof org.telegram.ui.un) {
            TLRPC.Chat chat = ((org.telegram.ui.un) r2Var).e;
            fj fjVar2 = this.l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.K1 == null) {
                i10 = -1;
            }
            fjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            X1(this.l0);
        }
    }

    public final void H1() {
        if (this.r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
            ij ijVar = new ij(context, u6Var, this);
            ijVar.r = AndroidUtilities.dp(80.0f);
            ijVar.w = 3;
            bi.r1 r1Var = new bi.r1(ijVar, context, u6Var, 12);
            ijVar.n = r1Var;
            za zaVar = new za(ijVar, context);
            ijVar.v = zaVar;
            r1Var.setAdapter(zaVar);
            r1Var.setClipToPadding(false);
            r1Var.setItemAnimator(null);
            r1Var.setLayoutAnimation(null);
            r1Var.setVerticalScrollBarEnabled(false);
            org.telegram.ui.ActionBar.f7.m(r1Var, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
            ijVar.addView(r1Var, gb1.g(-1.0f, -1));
            r1Var.setOnScrollListener(new ai.b(ijVar, 26));
            ei.k kVar = new ei.k(ijVar, ijVar.r, 1);
            ijVar.s = kVar;
            kVar.O = new ai.l(ijVar, 4);
            r1Var.setLayoutManager(kVar);
            this.r0 = ijVar;
            ijVar.setDelegate(new gb(this, 1));
        }
        X1(this.r0);
    }

    public final void I1() {
        if (!this.T1) {
            ho hoVar = new ho(5, getContext(), this.resourcesProvider, this);
            this.T = hoVar;
            X1(hoVar);
        }
        if (this.k0 == null) {
            xj xjVar = new xj(getContext(), this.resourcesProvider, this);
            this.k0 = xjVar;
            this.z0[2] = xjVar;
            xjVar.setupBlurredSearchField(this.K2);
            this.k0.setDelegate(new ci(this));
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (r2Var instanceof org.telegram.ui.un) {
            TLRPC.Chat chat = ((org.telegram.ui.un) r2Var).e;
            this.k0.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        X1(this.k0);
    }

    public final void J1(boolean z10) {
        if (!this.N1 && z10) {
            ho hoVar = new ho(4, getContext(), this.resourcesProvider, this);
            this.T = hoVar;
            X1(hoVar);
        }
        boolean z11 = false;
        if (this.p0 == null) {
            nk nkVar = new nk(this.N ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.p0 = nkVar;
            this.z0[4] = nkVar;
            nkVar.setDelegate(new di(this));
        }
        int i10 = 1;
        if (this.H) {
            this.p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.r2 r2Var = this.f0;
            if (r2Var instanceof org.telegram.ui.un) {
                TLRPC.Chat chat = ((org.telegram.ui.un) r2Var).e;
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
            X1(nkVar4);
        }
    }

    public final void L1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        b8 b8Var = this.a1;
        int i10 = 1;
        if (b8Var.n0) {
            b8Var.g(true);
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
        a2(false, false);
        super.dismissInternal();
        if (this.x0) {
            this.x0 = false;
            this.y0 = 0.0f;
            org.telegram.ui.ActionBar.r2 r2Var = this.f0;
            if (r2Var == null || r2Var.getFragmentView() == null) {
                return;
            }
            View fragmentView = r2Var.getFragmentView();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(fragmentView);
        }
    }

    public final boolean M1(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        if (this.L1) {
            return false;
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (r2Var instanceof org.telegram.ui.un) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var;
            TLRPC.Chat chat = unVar.e;
            if (unVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(this.M1).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + unVar.a(), !z10).commit();
            }
        }
        if (g1(r1().getText())) {
            return true;
        }
        e1();
        if (this.h.f) {
            this.L1 = true;
            this.c2.p0(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long s12 = s1();
        li liVar = this.B0;
        return g5.a0(this.M1, s12, o1() + (liVar != null ? liVar.getSelectedItemsCount() : 1), new Utilities.Callback() { // from class: org.telegram.ui.Components.qh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ti tiVar = ti.this;
                tiVar.L1 = true;
                tiVar.c2.p0(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void N1(boolean z10, boolean z11) {
        this.b.a(z10, z11);
        ru r12 = r1();
        this.c0 = z10;
        ru r13 = r1();
        final boolean z12 = this.G0.getTag() != null;
        li liVar = this.B0;
        final boolean z13 = this.c0 && (liVar == this.j0 || liVar == this.q0);
        bh.p pVar = this.R0;
        jg.k kVar = this.F0;
        if (z11) {
            pVar.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = pVar.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            ds dsVar = ds.h;
            final int i10 = 0;
            duration.setInterpolator(dsVar).setUpdateListener(new eh(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.fh
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
                            tiVar.i2();
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
            ViewPropertyAnimator interpolator = kVar.animate().translationY((z13 || !z12) ? kVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(dsVar);
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
                            tiVar.i2();
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
            pVar.setVisibility((z13 && z12) ? 0 : 8);
            pVar.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            i2();
            kVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            kVar.setTranslationY((z13 || !z12) ? kVar.getMeasuredHeight() : 0.0f);
            kVar.setVisibility((z13 || !z12) ? 8 : 0);
        }
        if (r12 != r13) {
            r12.k(true);
            r13.setText(c6.cloneSpans(r12.getText()));
            r13.getEditText().setAllowTextEntitiesIntersection(r12.getEditText().getAllowTextEntitiesIntersection());
            if (r12.getEditText().isFocused()) {
                r13.getEditText().requestFocus();
                r13.getEditText().setSelection(r12.getEditText().getSelectionStart(), r12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new gh(this, 0));
    }

    public final void O1(MessageObject messageObject, int i10) {
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
        c2(0);
    }

    public final void P1(float f7) {
        int i10;
        float translationY = this.containerView.getTranslationY() - this.y0;
        this.y0 = this.containerView.getHeight() * f7;
        this.containerView.setTranslationY(translationY);
        al alVar = this.w0;
        if (alVar != null) {
            alVar.setSendTransitionProgress(f7);
        }
        org.telegram.ui.ActionBar.j3 j3Var = this.backDrawable;
        if (this.dimBehind) {
            i10 = Math.round((1.0f - f7) * this.dimBehindAlpha);
        } else {
            i10 = 0;
        }
        j3Var.setAlpha(i10);
        this.navigationBarAlpha = 1.0f - f7;
        getContainer().invalidate();
    }

    public final void Q1(int i10, boolean z10) {
        if (this.K1 != null) {
            return;
        }
        this.V1 = i10;
        this.W1 = z10;
    }

    public final void R1(float f7) {
        int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.y6.a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.navBarColor = o10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, o10, false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        getContainer().invalidate();
    }

    public final void S1(String str) {
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
    public final void T1(boolean z10) {
        boolean z11;
        if (z10) {
            org.telegram.ui.ActionBar.r2 r2Var = this.f0;
            if ((r2Var instanceof org.telegram.ui.un) && !((org.telegram.ui.un) r2Var).w()) {
                z11 = true;
                if (this.E2 != z11) {
                    return;
                }
                if (z11) {
                    MessagesController.getInstance(this.M1).getTonesController().load();
                }
                this.E2 = z11;
                ImageView imageView = this.w;
                imageView.setVisibility(0);
                ImageView imageView2 = this.y;
                imageView2.setVisibility(0);
                ViewPropertyAnimator scaleY = imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f);
                ds dsVar = ds.h;
                scaleY.setInterpolator(dsVar).setDuration(420L).withEndAction(new nh(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(dsVar).setDuration(420L).withEndAction(new nh(this, z11, 2)).start();
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
        if (this.E2 != z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U1(long j10, String str, boolean z10, boolean z11) {
        boolean z12;
        long j11;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.A0;
        int i10 = 4;
        int i11 = 1;
        if (longSparseArray.get(j10) != null && Objects.equals(str, ((hi.o4) longSparseArray.get(j10)).getStartCommand())) {
            hi.o4 o4Var = (hi.o4) longSparseArray.get(j10);
            if (o4Var.H) {
                o4Var.H = false;
            }
            z12 = true;
            if (longSparseArray.get(j10) != null) {
                ((hi.o4) longSparseArray.get(j10)).J.setSwipeOffsetAnimationDisallowed(z12);
                Y1((li) longSparseArray.get(j10), -j10, z11);
                if (z10) {
                    hi.o4 o4Var2 = (hi.o4) longSparseArray.get(j10);
                    TLRPC.User user = MessagesController.getInstance(o4Var2.F).getUser(Long.valueOf(o4Var2.v));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(o4Var2.F).getAttachMenuBots().bots;
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
                        if (tL_attachMenuBot.bot_id == o4Var2.v) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z13 = tL_attachMenuBot.show_in_side_menu;
                    AndroidUtilities.runOnUIThread(new hi.u2(i10, o4Var2, (z13 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name) : z13 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (r2Var instanceof org.telegram.ui.un) {
            Context context = getContext();
            org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
            hi.o4 o4Var3 = new hi.o4(context, u6Var, this);
            o4Var3.U = new hi.f4(o4Var3, 2);
            org.telegram.ui.ActionBar.w0 a2 = o4Var3.b.a1.l().a(0, R.drawable.ic_ab_other);
            o4Var3.K = a2;
            a2.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
            org.telegram.ui.ActionBar.g1 e = a2.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
            o4Var3.L = e;
            e.setVisibility(8);
            a2.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
            org.telegram.ui.ActionBar.g1 e10 = a2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            o4Var3.M = e10;
            e10.setVisibility(8);
            a2.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
            a2.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
            a2.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
            hi.e3 e3Var = new hi.e3(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, o4Var3.a), 1, context, o4Var3, u6Var);
            o4Var3.n = e3Var;
            hi.d3 d3Var = new hi.d3(o4Var3, context, i11);
            o4Var3.J = d3Var;
            z12 = true;
            d3Var.addView(e3Var, gb1.g(-1.0f, -1));
            int i13 = 3;
            d3Var.setScrollListener(new hi.f4(o4Var3, i13));
            d3Var.setScrollEndListener(new hi.f4(o4Var3, i10));
            d3Var.setDelegate(new hi.h4(o4Var3));
            d3Var.setIsKeyboardVisible(new hi.h4(o4Var3));
            o4Var3.addView(d3Var, gb1.g(-1.0f, -1));
            hi.i4 i4Var = new hi.i4(context, u6Var);
            o4Var3.I = i4Var;
            o4Var3.addView(i4Var, gb1.h(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            e3Var.setWebViewProgressListener(new bi.n7(o4Var3, i13));
            NotificationCenter.getGlobalInstance().addObserver(o4Var3, NotificationCenter.didSetNewTheme);
            longSparseArray.put(j10, o4Var3);
            ((hi.o4) longSparseArray.get(j10)).setDelegate(new zh(this, o4Var3, str, j10));
            org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var;
            MessageObject replyingMessageObject = unVar.Y.getReplyingMessageObject();
            hi.o4 o4Var4 = (hi.o4) longSparseArray.get(j10);
            long a10 = unVar.a();
            int i14 = replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0;
            long X8 = unVar.X8();
            hi.e3 e3Var2 = o4Var4.n;
            int i15 = this.M1;
            o4Var4.F = i15;
            o4Var4.w = a10;
            o4Var4.v = j10;
            o4Var4.y = i14;
            o4Var4.E = X8;
            o4Var4.G = str;
            org.telegram.ui.ActionBar.g1 g1Var = o4Var4.M;
            if (g1Var != null) {
                if (MediaDataController.getInstance(i15).canCreateAttachedMenuBotShortcut(j10)) {
                    g1Var.setVisibility(0);
                } else {
                    g1Var.setVisibility(8);
                }
            }
            e3Var2.setBotUser(MessagesController.getInstance(i15).getUser(Long.valueOf(j10)));
            e3Var2.s(i15, j10);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(i15).getInputPeer(a10);
            tL_messages_requestWebView.bot = MessagesController.getInstance(i15).getInputUser(j10);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a10 < 0) {
                j11 = 0;
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i15).getChatFull(-a10);
                if (chatFull != null && (peer = chatFull.default_send_as) != null) {
                    tL_messages_requestWebView.send_as = MessagesController.getInstance(i15).getInputPeer(peer);
                    tL_messages_requestWebView.flags |= 8192;
                }
            } else {
                j11 = 0;
            }
            if (str != null) {
                tL_messages_requestWebView.start_param = str;
                tL_messages_requestWebView.flags |= 8;
            }
            if (i14 != 0) {
                TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(i15).createReplyInput(i14);
                tL_messages_requestWebView.reply_to = createReplyInput;
                if (X8 != j11) {
                    createReplyInput.monoforum_peer_id = MessagesController.getInstance(i15).getInputPeer(X8);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (X8 != j11) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(i15).getInputPeer(X8);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject q5 = hi.m3.q(o4Var4.a, false);
            if (q5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = q5.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i15).sendRequest(tL_messages_requestWebView, new bi.l2(o4Var4, i15, i10));
            NotificationCenter.getInstance(i15).addObserver(o4Var4, NotificationCenter.webViewResultSent);
            if (longSparseArray.get(j10) != null) {
            }
        }
        z12 = true;
        if (longSparseArray.get(j10) != null) {
        }
    }

    public final void V1(org.telegram.ui.ActionBar.r2 r2Var) {
        if ((r2Var instanceof org.telegram.ui.un) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.un) r2Var).e)) {
            new wc(this.u1, this.resourcesProvider).f(MessagesController.getInstance(this.M1).captionLengthLimitPremium, new org.telegram.ui.ip(15, this, r2Var)).j();
        }
    }

    public final boolean W1(boolean z10, boolean z11) {
        float f7;
        int i10;
        li liVar;
        b8 b8Var;
        this.c.a(z10, true);
        th thVar = this.G0;
        if (z10 == (thVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.P0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        thVar.setTag(z10 ? 1 : null);
        wh whVar = this.H0;
        if (whVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(whVar.getEditText());
        }
        whVar.k(true);
        this.S0.k(true);
        th thVar2 = this.A1;
        th thVar3 = this.K0;
        if (z10) {
            if (!this.N) {
                thVar.setVisibility(0);
            }
            thVar3.setVisibility(0);
        } else if (this.V0) {
            thVar2.setVisibility(0);
        }
        li liVar2 = this.B0;
        boolean z12 = (liVar2 == this.j0 || liVar2 == this.q0) && this.c0;
        b8 b8Var2 = this.a1;
        bh.p pVar = this.R0;
        jg.k kVar = this.F0;
        bi biVar = this.L0;
        if (z11) {
            this.P0 = new AnimatorSet();
            if (z12) {
                pVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(thVar, (Property<th, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<jg.k, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                b8Var = b8Var2;
            } else {
                kVar.setVisibility(0);
                b8Var = b8Var2;
                arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<jg.k, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(pVar, (Property<bh.p, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(thVar3, (Property<th, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(thVar3, (Property<th, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(thVar3, (Property<th, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(biVar, (Property<bi, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(biVar, (Property<bi, Float>) property3, z10 ? 1.0f : 0.2f));
            if (b8Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(thVar, (Property<th, Float>) View.TRANSLATION_Y, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.V0) {
                arrayList.add(ObjectAnimator.ofFloat(thVar2, (Property<th, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(thVar2, (Property<th, Float>) property, z10 ? 0.0f : 1.0f));
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
            thVar.setAlpha(z10 ? 1.0f : 0.0f);
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
            thVar3.setScaleX(z10 ? 1.0f : 0.2f);
            thVar3.setScaleY(z10 ? 1.0f : 0.2f);
            thVar3.setAlpha(z10 ? 1.0f : f7);
            pVar.setVisibility((z10 && z12) ? i10 : 8);
            pVar.setAlpha((z10 && z12) ? 1.0f : f7);
            biVar.setScaleX(z10 ? 1.0f : 0.2f);
            biVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (b8Var2.getTag() != null) {
                thVar.setTranslationY(z10 ? f7 : AndroidUtilities.dp(48.0f));
            } else if (this.V0 && ((liVar = this.B0) == null || liVar.L())) {
                thVar2.setTranslationY(z10 ? AndroidUtilities.dp(84.0f) : f7);
            }
            if (!z10) {
                thVar.setVisibility(4);
                thVar3.setVisibility(4);
            }
            if (z12) {
                i2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.B0.getSelectedItemsCount());
        }
        biVar.g(i10, z11);
        biVar.i(o1() + this.B0.getSelectedItemsCount(), this.K1 != null ? 0L : MessagesController.getInstance(this.M1).getSendPaidMessagesStars(s1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) whVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), biVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            whVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void X1(li liVar) {
        long j10 = this.Z0;
        ho hoVar = this.T;
        if (liVar == hoVar) {
            j10 = hoVar.s;
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
        Y1(liVar, j10, true);
    }

    public final void Y1(li liVar, long j10, boolean z10) {
        int i10;
        pm pmVar;
        pm pmVar2;
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
                new tg.y0(this.f0, 39, false).show();
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
            th thVar = this.A1;
            thVar.setAlpha(1.0f);
            thVar.setTranslationY(this.I1);
            int i14 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.A0;
                if (i14 >= longSparseArray.size()) {
                    break;
                }
                ((hi.o4) longSparseArray.valueAt(i14)).setMeasureOffsetY(0);
                i14++;
            }
            this.Z0 = j10;
            uh uhVar = this.B1;
            int childCount = uhVar.getChildCount();
            int i15 = 0;
            while (i15 < childCount) {
                View childAt = uhVar.getChildAt(i15);
                if (childAt instanceof ni) {
                    ni niVar = (ni) childAt;
                    i12 = childCount;
                    f7 = valueOf;
                    niVar.a.f(((long) niVar.b) == niVar.c.Z0, true);
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
            lh.f fVar = this.y1;
            if (fVar != null) {
                fVar.setFadeHeightBottom(e ? 0 : AndroidUtilities.dp(48.0f));
            }
            int i16 = 4;
            vh vhVar = this.z1;
            if (vhVar != null) {
                vhVar.setVisibility(e ? 4 : 0);
            }
            int i17 = this.C0.i() != 0 ? 0 : 4;
            b8 b8Var = this.a1;
            b8Var.setVisibility(i17);
            if (b8Var.n0) {
                b8Var.g(true);
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
            if (this.C0.getParent() != this.containerView) {
                K1(this.C0);
                ViewGroup viewGroup = this.containerView;
                li liVar4 = this.C0;
                if (liVar4 != this.o0) {
                    indexOfChild++;
                }
                i10 = 0;
                viewGroup.addView(liVar4, indexOfChild, gb1.g(-1.0f, -1));
            } else {
                i10 = 0;
            }
            gh ghVar = new gh(this, i16);
            li liVar5 = this.B0;
            boolean z11 = liVar5 instanceof cn;
            int i18 = 2;
            ei eiVar = this.e0;
            if (z11 || (this.C0 instanceof cn)) {
                int max = Math.max(this.C0.getWidth(), this.B0.getWidth());
                li liVar6 = this.C0;
                if (liVar6 instanceof cn) {
                    liVar6.setTranslationX(max);
                    li liVar7 = this.B0;
                    if ((liVar7 instanceof ChatAttachAlertPhotoLayout) && (pmVar2 = ((ChatAttachAlertPhotoLayout) liVar7).P) != null) {
                        pmVar2.setVisibility(4);
                    }
                } else {
                    this.B0.setTranslationX(-max);
                    li liVar8 = this.C0;
                    if (liVar8 == chatAttachAlertPhotoLayout && (pmVar = ((ChatAttachAlertPhotoLayout) liVar8).P) != null) {
                        pmVar.setVisibility(0);
                    }
                }
                this.C0.setAlpha(1.0f);
                this.B0.setAlpha(1.0f);
                if (z10) {
                    eiVar.set(this.B0, f10);
                    AndroidUtilities.runOnUIThread(new kg(this, liVar, ghVar, i18));
                } else {
                    boolean z12 = this.C0.getCurrentItemTop() <= liVar.getButtonsHideOffset();
                    this.B0.u(1.0f);
                    this.C0.u(1.0f);
                    this.B0.l(this.o2);
                    this.C0.l(this.o2);
                    this.containerView.invalidate();
                    this.glassEngine.g();
                    eiVar.set(this.B0, Float.valueOf(1.0f));
                    b8Var.setTag(z12 ? 1 : null);
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
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B0, eiVar, 0.0f, 1.0f);
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
                animatorSet.setInterpolator(ds.f);
                animatorSet.addListener(new bi.x4(this, firstOffset, ghVar, i13));
                this.w1 = animatorSet;
                eiVar.set(this.B0, f10);
                animatorSet.start();
            } else {
                liVar5.setAlpha(0.0f);
                ghVar.run();
                h2(i10);
                this.containerView.invalidate();
            }
            if (!this.p2 || (liVar instanceof hi.o4)) {
                i11 = 0;
            } else {
                i11 = 0;
                this.p2 = false;
                b8Var.updateColors();
                b8Var.invalidate();
                z1();
            }
            b8Var.setForcedMenuWidth((j10 == 1 || j10 == 6 || j10 == 17 || (liVar instanceof hi.o4)) ? AndroidUtilities.dp(46.0f) : j10 == 4 ? AndroidUtilities.dp(84.0f) : i11);
        }
    }

    public final void Z1(boolean z10, Boolean bool) {
        ti tiVar;
        if (this.m0 == null) {
            tiVar = this;
            go goVar = new go(tiVar, getContext(), false, this.resourcesProvider, bool);
            tiVar.m0 = goVar;
            tiVar.z0[1] = goVar;
            goVar.setDelegate(new dh(this, 17));
        } else {
            tiVar = this;
        }
        Y1(tiVar.m0, 9L, z10);
    }

    public final void a2(boolean z10, boolean z11) {
        li liVar;
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
        th thVar = this.A1;
        org.telegram.ui.ActionBar.w0 w0Var = this.d1;
        if (z10) {
            if (z12) {
                w0Var.setVisibility(0);
                w0Var.setClickable(true);
            }
        } else if (this.V0 && this.G0.getTag() == null) {
            thVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (r2Var != null) {
            if (z10) {
                AndroidUtilities.setLightStatusBar(this, i0.a.h(getThemedColor(this.k2 ? org.telegram.ui.ActionBar.y6.tg : org.telegram.ui.ActionBar.y6.h5)) > 0.699999988079071d);
            } else {
                AndroidUtilities.setLightStatusBar(this, r2Var.isLightStatusBar());
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
            ofFloat.addUpdateListener(new eh(this, i10));
            arrayList.add(ofFloat);
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.b1.playTogether(arrayList);
            this.b1.addListener(new org.telegram.ui.jo(3, this, z10));
            this.b1.setInterpolator(ds.h);
            this.b1.setDuration(380L);
            this.b1.start();
            return;
        }
        if (z10 && this.V0 && ((liVar = this.B0) == null || liVar.L())) {
            thVar.setVisibility(4);
        }
        b8Var.setAlpha(z10 ? 1.0f : 0.0f);
        if (z12) {
            w0Var.setAlpha(z10 ? 1.0f : 0.0f);
            w0Var.setScaleX(z10 ? 1.0f : 0.6f);
            w0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = this.h1;
        if (w0Var2 != null) {
            w0Var2.setVisibility(4);
        }
        if (this.T0 == 0 && this.t1) {
            return;
        }
        w0Var.setVisibility(4);
    }

    public final void b2() {
        float alpha;
        int[] iArr = this.J0;
        wh whVar = this.H0;
        whVar.getLocationOnScreen(iArr);
        if (this.H2 != null) {
            li liVar = this.B0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if ((liVar == chatAttachAlertPhotoLayout || liVar == this.q0) && this.c0) {
                bh.p pVar = this.R0;
                alpha = (pVar.getAlpha() * pVar.getMeasuredHeight()) + (pVar.getY() - this.H2.getTop());
            } else {
                alpha = -whVar.getHeight();
            }
            if (Math.abs(this.H2.getTranslationY() - alpha) > 0.5f) {
                this.H2.setTranslationY(alpha);
                this.H2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        l1();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c2(int i10) {
        org.telegram.ui.ActionBar.r2 r2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.w1 != null) {
            return;
        }
        int selectedItemsCount = this.B0.getSelectedItemsCount();
        bi biVar = this.L0;
        if (selectedItemsCount == 0) {
            biVar.g(0, i10 != 0);
            W1(false, i10 != 0);
        } else {
            if (W1(true, i10 != 0) || i10 == 0) {
                biVar.g(selectedItemsCount, i10 != 0);
                biVar.c();
            } else {
                biVar.g(selectedItemsCount, true);
                biVar.c();
            }
        }
        this.B0.D(selectedItemsCount);
        i1(i10 != 0);
        if (this.B0 == this.j0 && ((((z10 = (r2Var = this.f0) instanceof org.telegram.ui.un)) || this.T0 != 0 || this.W0) && ((selectedItemsCount == 0 && this.t1) || ((selectedItemsCount != 0 || this.T0 != 0 || this.W0) && !this.t1)))) {
            this.t1 = (selectedItemsCount == 0 && this.T0 == 0 && !this.W0) ? false : true;
            AnimatorSet animatorSet = this.c1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.c1 = null;
            }
            int i11 = this.T0;
            b8 b8Var = this.a1;
            org.telegram.ui.ActionBar.w0 w0Var = this.h1;
            if (i11 != 0 && w0Var != null && b8Var.getTag() != null && z10) {
                org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var;
                if (!ChatObject.isChannel(unVar.e) || (tL_chatBannedRights = unVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.t1;
                    th thVar = this.l1;
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.d1;
                    if (!z12) {
                        if (this.T0 == 0 && !this.W0) {
                            w0Var2.setVisibility(0);
                            w0Var2.setClickable(true);
                        }
                        thVar.setVisibility(0);
                    } else if (b8Var.getTag() != null && w0Var != null) {
                        w0Var.setVisibility(0);
                    }
                    if (i10 != 0) {
                        if (b8Var.getTag() == null && this.T0 == 0 && !this.W0) {
                            w0Var2.setAlpha(this.t1 ? 1.0f : 0.0f);
                            w0Var2.setScaleX(this.t1 ? 1.0f : 0.6f);
                            w0Var2.setScaleY(this.t1 ? 1.0f : 0.6f);
                        }
                        thVar.setAlpha(this.t1 ? 1.0f : 0.0f);
                        if (z11) {
                            w0Var.setAlpha(this.t1 ? 0.0f : 1.0f);
                        }
                        if (this.t1 && w0Var != null) {
                            w0Var.setVisibility(4);
                        }
                    } else {
                        this.c1 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (b8Var.getTag() == null && this.T0 == 0 && !this.W0) {
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, this.t1 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_X, this.t1 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_Y, this.t1 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(thVar, (Property<th, Float>) property, this.t1 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, this.t1 ? 0.0f : 1.0f));
                        }
                        this.c1.playTogether(arrayList);
                        this.c1.addListener(new org.telegram.ui.qp(this, 12));
                        this.c1.setDuration(180L);
                        this.c1.start();
                    }
                }
            }
            z11 = false;
            z12 = this.t1;
            th thVar2 = this.l1;
            org.telegram.ui.ActionBar.w0 w0Var22 = this.d1;
            if (!z12) {
            }
            if (i10 != 0) {
            }
        }
        f2(i10 != 0);
        MessageObject messageObject = this.K1;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.M1).getSendPaidMessagesStars(s1()) : 0L;
        li liVar = this.B0;
        biVar.i(o1() + (liVar != null ? liVar.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        wh whVar = this.H0;
        if (whVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) whVar.getLayoutParams();
            int max = Math.max(AndroidUtilities.dp(48.0f), biVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                whVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithTouchOutside() {
        return this.B0.b();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.j jVar = this.s2;
            if (jVar != null) {
                jVar.c();
            }
            AnimatorSet animatorSet2 = this.t2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final void d2() {
        float f7;
        li liVar = this.B0;
        boolean h = liVar == null ? false : liVar.h();
        ei.n nVar = this.i1;
        nVar.setEnabled(h);
        li liVar2 = this.B0;
        if (liVar2 != null) {
            f7 = ((liVar2.h() ? 1.0f : 0.5f) * (this.C0 == null ? 1.0f : this.d0)) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        li liVar3 = this.C0;
        if (liVar3 != null) {
            f7 = c3.h0.z(1.0f, this.d0, liVar3.h() ? 1.0f : 0.5f, f7);
        }
        this.j1 = f7;
        if (nVar != null) {
            float f10 = f7 * this.k1;
            nVar.setAlpha(f10);
            nVar.setVisibility(f10 <= 0.0f ? 4 : 0);
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

    @Override // org.telegram.ui.ActionBar.k3, org.telegram.ui.ActionBar.n2
    public final void dismiss(boolean z10) {
        if (z10) {
            this.G2 = z10;
        }
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public void dismissInternal() {
        ri riVar = this.c2;
        if (riVar != null) {
            riVar.A(new gh(this, 3));
        } else {
            L1();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.B0.q(i10);
    }

    public final void e1() {
        if (r1().a.length() <= 0) {
            return;
        }
        this.B0.a(r1().getText());
    }

    public final void e2(li liVar, int i10) {
        if (liVar == null) {
            return;
        }
        ch.f fVar = this.I2;
        if (fVar != null && Build.VERSION.SDK_INT >= 31) {
            fVar.f(0.0f, i10);
        }
        int currentItemTop = liVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = liVar == this.B0 && currentItemTop <= liVar.getButtonsHideOffset();
        this.R = z11;
        if (liVar == this.B0) {
            a2(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) liVar.getLayoutParams();
        int w10 = org.telegram.ui.d3.w(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        li liVar2 = this.B0;
        int i11 = liVar2 == liVar ? 0 : 1;
        if ((liVar2 instanceof cn) || (this.C0 instanceof cn)) {
            Object obj = this.w1;
            if ((obj instanceof o1.j) && ((o1.j) obj).f) {
                z10 = true;
            }
        }
        int[] iArr = this.e2;
        int i12 = iArr[i11];
        if (i12 == w10 && !z10) {
            if (i10 != 0) {
                this.f2 = i12;
            }
        } else {
            this.f2 = i12;
            iArr[i11] = w10;
            h2(i11);
            this.containerView.invalidate();
        }
    }

    public final boolean f1() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        return (r2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var).R6();
    }

    public final void f2(boolean z10) {
        fi.u uVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout == null || (uVar = this.e1) == null) {
            return;
        }
        boolean z11 = this.t1 && this.i0 && this.B0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0();
        boolean z12 = !ChatAttachAlertPhotoLayout.S();
        uVar.f = z12;
        if (!z10) {
            ((h6) uVar.g).a(z12);
        }
        uVar.invalidateSelf();
        org.telegram.ui.ActionBar.w0 w0Var = this.f1;
        if (z10 && this.t1) {
            w0Var.setVisibility(0);
            w0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(ds.h).withEndAction(new nh(this, z11, 0)).start();
        } else {
            w0Var.setVisibility(z11 ? 0 : 8);
            w0Var.setAlpha(z11 ? 1.0f : 0.0f);
            w0Var.setScaleX(z11 ? 1.0f : 0.6f);
            w0Var.setScaleY(z11 ? 1.0f : 0.6f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d3
    public final boolean g() {
        return true;
    }

    public final boolean g1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (!(r2Var instanceof org.telegram.ui.un)) {
            return false;
        }
        return ChatActivityEnterView.D(this.M1, ((org.telegram.ui.un) r2Var).a(), r2Var, charSequence);
    }

    public final void g2(boolean z10) {
        li liVar = this.j0;
        if (!z10) {
            X1(liVar);
            return;
        }
        if (this.M) {
            if (this.q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.u6 u6Var = this.r;
                if (u6Var == null) {
                    u6Var = this.resourcesProvider;
                }
                cn cnVar = new cn(context, u6Var, this);
                cnVar.y = 0.0f;
                cnVar.E = 0.0f;
                cnVar.F = 0.0f;
                cnVar.G = 0.0f;
                cnVar.H = 0.0f;
                cnVar.I = 0.0f;
                cnVar.J = null;
                cnVar.K = false;
                cnVar.M = 0.0f;
                cnVar.Q = false;
                cnVar.S = false;
                Point point = AndroidUtilities.displaySize;
                cnVar.T = point.y > point.x;
                cnVar.n = u6Var;
                cnVar.f = true;
                cnVar.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z l4 = cnVar.b.a1.l();
                TextView textView = new TextView(context);
                cnVar.x = textView;
                org.telegram.ui.ActionBar.u6 u6Var2 = cnVar.a;
                km kmVar = new km(cnVar, context, l4, u6Var2, 1);
                cnVar.b.a1.addView(kmVar, 0, gb1.h(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, u6Var2);
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                kmVar.addView(textView, gb1.h(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                bi.r1 r1Var = new bi.r1(cnVar, context, u6Var2, 15);
                cnVar.r = r1Var;
                r1Var.setAdapter(new org.telegram.ui.c8(cnVar, 3));
                s4.c0 c0Var = new s4.c0(1, false);
                cnVar.s = c0Var;
                r1Var.setLayoutManager(c0Var);
                r1Var.setClipChildren(false);
                r1Var.setClipToPadding(false);
                r1Var.setOverScrollMode(2);
                r1Var.setVerticalScrollBarEnabled(false);
                bn bnVar = new bn(cnVar, context);
                cnVar.v = bnVar;
                bnVar.setClipToPadding(true);
                bnVar.setClipChildren(true);
                cnVar.addView(r1Var, gb1.g(-1.0f, -1));
                cnVar.P = cnVar.b.j0;
                bnVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cnVar.P;
                bnVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                bnVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                bnVar.c();
                UndoView undoView = new UndoView(context, null, false, cnVar.b.r);
                cnVar.w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                cnVar.addView(undoView, gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                cnVar.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.q0 = cnVar;
                cnVar.bringToFront();
            }
            li liVar2 = this.B0;
            cn cnVar2 = this.q0;
            if (liVar2 != cnVar2) {
                liVar = cnVar2;
            }
            X1(liVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h7> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.z0;
            if (i10 >= liVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.container, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.i5));
                return arrayList;
            }
            li liVar = liVarArr[i10];
            if (liVar != null && (themeDescriptions = liVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i10++;
        }
    }

    public final void h1() {
        uh uhVar = this.B1;
        if (uhVar == null) {
            return;
        }
        int childCount = uhVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            uhVar.getChildAt(i10);
        }
        boolean z10 = this.k2;
        org.telegram.ui.ActionBar.f7.V(this.m1, z10 ? org.telegram.ui.ActionBar.y6.hg : org.telegram.ui.ActionBar.y6.j5, this.resourcesProvider);
        org.telegram.ui.ActionBar.f7.V(this.r1, z10 ? org.telegram.ui.ActionBar.y6.hg : org.telegram.ui.ActionBar.y6.j5, this.resourcesProvider);
        org.telegram.ui.ActionBar.f7.V(this.i1, org.telegram.ui.ActionBar.y6.Sh, this.resourcesProvider);
        int themedColor = getThemedColor(z10 ? org.telegram.ui.ActionBar.y6.hg : org.telegram.ui.ActionBar.y6.j5);
        boolean z11 = (this.w2 && themedColor == this.v2) ? false : true;
        this.w2 = true;
        this.v2 = themedColor;
        org.telegram.ui.ActionBar.w0 w0Var = this.d1;
        if (z11) {
            w0Var.setIconColor(themedColor);
        }
        org.telegram.ui.ActionBar.y6.z1(getThemedColor(z10 ? org.telegram.ui.ActionBar.y6.ig : org.telegram.ui.ActionBar.y6.I5), w0Var.getBackground());
        int i11 = org.telegram.ui.ActionBar.y6.E8;
        w0Var.O(getThemedColor(i11), false);
        w0Var.O(getThemedColor(i11), true);
        w0Var.H(getThemedColor(org.telegram.ui.ActionBar.y6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f1;
        if (w0Var2 != null && z11) {
            w0Var2.setIconColor(themedColor);
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.h1;
        if (w0Var3 != null) {
            if (z11) {
                w0Var3.setIconColor(themedColor);
            }
            org.telegram.ui.ActionBar.y6.z1(getThemedColor(z10 ? org.telegram.ui.ActionBar.y6.ig : org.telegram.ui.ActionBar.y6.I5), w0Var3.getBackground());
        }
        wh whVar = this.H0;
        org.telegram.ui.ActionBar.u6 u6Var = whVar.M;
        mu muVar = whVar.a;
        int i12 = whVar.L;
        if (i12 == 0) {
            muVar.setHintTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.H6, u6Var));
            int i13 = org.telegram.ui.ActionBar.y6.G6;
            muVar.setCursorColor(org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
            muVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
        } else if (i12 == 2 || i12 == 3) {
            muVar.setHintTextColor(-1929379841);
            muVar.setTextColor(-1);
            muVar.setCursorColor(-1);
            muVar.setHandlesColor(-1);
            muVar.setHighlightColor(822083583);
            muVar.quoteColor = -1;
        } else {
            muVar.setHintTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.t5, u6Var));
            muVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.j5, u6Var));
        }
        whVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Xd, u6Var), PorterDuff.Mode.MULTIPLY));
        nu nuVar = whVar.d;
        if (nuVar != null) {
            nuVar.updateColors();
        }
        org.telegram.ui.ActionBar.f7.m(uhVar, 21, org.telegram.ui.ActionBar.y6.A5, this.resourcesProvider);
        int i14 = z10 ? org.telegram.ui.ActionBar.y6.hg : org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.u6 u6Var2 = this.resourcesProvider;
        b8 b8Var = this.a1;
        org.telegram.ui.ActionBar.f7.m(b8Var, 1, i14, u6Var2);
        org.telegram.ui.ActionBar.f7.m(b8Var, 3, z10 ? org.telegram.ui.ActionBar.y6.ig : org.telegram.ui.ActionBar.y6.I5, this.resourcesProvider);
        org.telegram.ui.ActionBar.f7.m(b8Var, 5, z10 ? org.telegram.ui.ActionBar.y6.hg : org.telegram.ui.ActionBar.y6.j5, this.resourcesProvider);
        int u12 = u1(false);
        org.telegram.ui.ActionBar.y6.z1(u12, this.shadowDrawable);
        hh.c cVar = this.J2;
        if (cVar.b != u12) {
            cVar.a(u12);
            lh.f fVar = this.y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            vh vhVar = this.z1;
            if (vhVar != null) {
                vhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i15 = 0;
        while (true) {
            li[] liVarArr = this.z0;
            if (i15 >= liVarArr.length) {
                break;
            }
            li liVar = liVarArr[i15];
            if (liVar != null) {
                liVar.d();
            }
            i15++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            fixNavigationBarKey(org.telegram.ui.ActionBar.y6.h5);
            return;
        }
        this.navBarColorKey = -1;
        this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.y6.i5);
        AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.y6.h5), false);
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
    public final void h2(int i10) {
        int i11;
        float f7;
        org.telegram.ui.ActionBar.w0 w0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        ei.n nVar;
        float max;
        int i12;
        float f14 = this.d.e;
        li liVar = i10 == 0 ? this.B0 : this.C0;
        if (liVar == null || liVar.getVisibility() != 0) {
            return;
        }
        int t12 = t1(i10);
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
        th thVar = this.l1;
        float dp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - thVar.getAlpha()) * 26.0f);
        boolean z10 = this.t1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.d1;
        bh.p pVar = this.R0;
        if (z10 && this.T0 == 0 && !this.W0) {
            w0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37), ((t12 - AndroidUtilities.dp((i11 * f14) + 37.0f)) + dp) - (pVar.getAlpha() * pVar.getMeasuredHeight())) + this.o2);
        } else {
            w0Var2.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37)) + this.o2);
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f1;
        if (w0Var3 != null) {
            w0Var3.setTranslationY(w0Var2.getTranslationY());
        }
        fi.v3 v3Var = this.g1;
        if (v3Var != null) {
            v3Var.setTranslationY(w0Var2.getTranslationY());
        }
        if (this.F && this.v1) {
            li liVar2 = this.C0;
            if (liVar2 != null && this.B0 != null) {
                f7 = Math.min(liVar2.getTranslationY(), this.B0.getTranslationY());
            } else if (liVar2 != null) {
                f7 = liVar2.getTranslationY();
            }
            w0Var = this.h1;
            if (w0Var != null) {
                w0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i11 + 37)) + this.o2);
            }
            float dp2 = ((((t12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.o2) + f7) - (pVar.getAlpha() * pVar.getMeasuredHeight());
            this.s1 = dp2;
            thVar.setTranslationY(Math.max(this.o2, dp2));
            pVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.o2, (thVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.s1 + AndroidUtilities.dp(8.0f)));
            if (this.c0) {
                b2();
            }
            l1();
            int i13 = 59;
            if (this.m0 != null) {
                if (AndroidUtilities.isTablet()) {
                    i12 = 63;
                } else {
                    Point point2 = AndroidUtilities.displaySize;
                    i12 = point2.x > point2.y ? 53 : 59;
                }
                go goVar = this.m0;
                if (goVar == this.C0) {
                    f11 = (goVar.getTranslationY() + t1(1)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.d0;
                } else if (goVar == this.B0) {
                    f11 = (goVar.getTranslationY() + t1(0)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
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
                    go goVar2 = this.n0;
                    if (goVar2 == this.C0) {
                        f13 = (goVar2.getTranslationY() + t1(1)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.d0;
                    } else if (goVar2 == this.B0) {
                        f13 = (goVar2.getTranslationY() + t1(0)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
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
        w0Var = this.h1;
        if (w0Var != null) {
        }
        float dp22 = ((((t12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.o2) + f7) - (pVar.getAlpha() * pVar.getMeasuredHeight());
        this.s1 = dp22;
        thVar.setTranslationY(Math.max(this.o2, dp22));
        pVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.o2, (thVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.s1 + AndroidUtilities.dp(8.0f)));
        if (this.c0) {
        }
        l1();
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
    public final void i1(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (r2Var == null || !(r2Var instanceof org.telegram.ui.un)) {
            return;
        }
        org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var;
        ru ruVar = this.c0 ? this.S0 : this.H0;
        String obj = ruVar != null ? ruVar.getText().toString() : null;
        if (this.K1 == null) {
            li liVar = this.B0;
            z11 = true;
            if (liVar != null) {
            }
            if (ag.b0.g(this.M1).e(obj, unVar.p8) <= 0) {
                MessageObject messageObject = unVar.z5;
                if (messageObject != null) {
                }
            }
            this.h.a(z11, z10);
            if (z11 || !w1()) {
            }
            N1(false, z10);
            return;
        }
        z11 = false;
        this.h.a(z11, z10);
        if (z11) {
        }
    }

    public final void i2() {
        int i10 = 0;
        h2(0);
        this.u1.invalidate();
        bh.p pVar = this.R0;
        pVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout != null) {
            fm fmVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (fmVar != null && fmVar.getFastScroll() != null) {
                sl0 fastScroll = fmVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1;
                if (this.c0) {
                    i10 = (int) (pVar.getAlpha() * pVar.getMeasuredHeight());
                }
                fastScroll.h0 = currentActionBarHeight + i10;
                fmVar.getFastScroll().invalidate();
            }
        }
        b2();
        l1();
    }

    public final void j1() {
        float f7 = this.c.e;
        this.z1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - ((1.0f - this.b.e) * f7)));
    }

    public final void k1() {
        j20.d(this.I0, c3.h0.E(this.e.e, this.f.e, a8.v0.a(this.h.e), this.U1 ? 0.0f : 1.0f));
    }

    public final void l1() {
        bi biVar = this.L0;
        th thVar = this.K0;
        bh.p pVar = this.R0;
        if (pVar == null || pVar.getVisibility() != 0 || pVar.getAlpha() == 0.0f) {
            thVar.setTranslationY(this.j2);
            biVar.setAlpha(1.0f);
            return;
        }
        float f7 = this.b.e;
        float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
        biVar.setAlpha(abs * abs * abs * abs);
        thVar.setTranslationY(AndroidUtilities.lerp(this.j2, ((pVar.getTranslationY() + pVar.getTop()) - thVar.getTop()) + AndroidUtilities.dp(8.0f), ds.j.getInterpolation(f7)));
    }

    public final void m1(int i10) {
        this.V0 = true;
        this.A1.setVisibility(0);
        this.H = true;
        this.I = i10;
        this.T0 = 0;
        this.F = false;
        this.G = false;
        this.J = null;
        org.telegram.ui.ActionBar.w0 w0Var = this.n1;
        if (w0Var != null) {
            this.m1.setTranslationY(0.0f);
            w0Var.setVisibility(8);
        }
    }

    public final void n1(hi.e2 e2Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.m1;
        textView.setText(string);
        this.V0 = false;
        this.A1.setVisibility(8);
        this.T0 = 1;
        this.F = true;
        this.G = true;
        this.i0 = false;
        this.J = e2Var;
        org.telegram.ui.ActionBar.w0 w0Var = this.n1;
        if (w0Var != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            w0Var.setVisibility(0);
            w0Var.setClickable(true);
            w0Var.setAlpha(1.0f);
            w0Var.setScaleX(1.0f);
            w0Var.setScaleY(1.0f);
        }
    }

    public final int o1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (!(r2Var instanceof org.telegram.ui.un) || (messagePreviewParams = ((org.telegram.ui.un) r2Var).r5) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
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
            b8Var.g(true);
            return;
        }
        if (this.B0.j()) {
            return;
        }
        if (r1() == null || !r1().e) {
            super.onBackPressed();
        } else {
            r1().k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.B0.n(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (r2Var != null) {
            AndroidUtilities.setLightStatusBar(this, r2Var.isLightStatusBar());
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean onCustomCloseAnimation() {
        TL_wallet.walletTransaction wallettransaction;
        final al alVar = this.w0;
        if (alVar != null && this.B0 == alVar) {
            final gh ghVar = new gh(this, 1);
            int i10 = alVar.n;
            org.telegram.ui.Wallet.h9 h9Var = alVar.R;
            ti tiVar = alVar.b;
            AnimatorSet animatorSet = null;
            if (!alVar.K && (wallettransaction = alVar.P0) != null && alVar.Q0 == null && alVar.R0 == null) {
                if (alVar.S0) {
                    org.telegram.ui.Wallet.m5 m5Var = new org.telegram.ui.Wallet.m5();
                    m5Var.setCurrentAccount(i10);
                    org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
                    if (r2Var != null && r2Var.presentFragment(m5Var, false, true)) {
                        final int i11 = 0;
                        org.telegram.ui.Wallet.v9 v9Var = new org.telegram.ui.Wallet.v9(tiVar.getContainer(), tiVar.getSheetContainer(), h9Var.getDiamondView(), m5Var, alVar.P0, new Runnable() { // from class: org.telegram.ui.Components.sk
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        if (!alVar.K) {
                                            ghVar.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!alVar.K) {
                                            ghVar.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, tiVar);
                        alVar.R0 = v9Var;
                        animatorSet = v9Var.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    org.telegram.ui.Wallet.l6 diamondView = h9Var.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f0;
                        if (r2Var2 instanceof org.telegram.ui.un) {
                            org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var2;
                            if (unVar.getCurrentAccount() == i10 && unVar.a() == alVar.r.id && unVar.d4 == 0 && unVar.getFragmentView() != null && unVar.getFragmentView().isAttachedToWindow()) {
                                final int i12 = 1;
                                org.telegram.ui.Wallet.d6 d6Var = new org.telegram.ui.Wallet.d6(tiVar.getContainer(), tiVar.getSheetContainer(), h9Var.getDiamondView(), unVar, alVar.P0, new Runnable() { // from class: org.telegram.ui.Components.sk
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                if (!alVar.K) {
                                                    ghVar.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!alVar.K) {
                                                    ghVar.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, tiVar);
                                alVar.Q0 = d6Var;
                                animatorSet = d6Var.m;
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

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        fc1 fc1Var = chatAttachAlertPhotoLayout.l0;
        bh.r rVar = chatAttachAlertPhotoLayout.j0;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        fm fmVar = chatAttachAlertPhotoLayout.r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        boolean z10 = i14 < i15;
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == rVar) {
            if (z10) {
                if (fmVar.getVisibility() == 0) {
                    rVar.layout(0, org.telegram.messenger.t.C(222.0f, i13, i16), i14, org.telegram.messenger.t.C(96.0f, i13, i16));
                    return true;
                }
                rVar.layout(0, org.telegram.messenger.t.C(126.0f, i13, i16), i14, i13 - i16);
                return true;
            }
            if (fmVar.getVisibility() == 0) {
                rVar.layout(org.telegram.messenger.t.C(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            }
            rVar.layout(org.telegram.messenger.t.C(126.0f, i12, i16), 0, i12, i15 - i16);
            return true;
        }
        if (view == fc1Var) {
            if (z10) {
                if (fmVar.getVisibility() == 0) {
                    fc1Var.layout(0, org.telegram.messenger.t.C(310.0f, i13, i16), i14, org.telegram.messenger.t.C(260.0f, i13, i16));
                    return true;
                }
                fc1Var.layout(0, org.telegram.messenger.t.C(176.0f, i13, i16), i14, org.telegram.messenger.t.C(126.0f, i13, i16));
                return true;
            }
            if (fmVar.getVisibility() == 0) {
                fc1Var.layout(org.telegram.messenger.t.C(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            }
            fc1Var.layout(org.telegram.messenger.t.C(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
            return true;
        }
        if (view != textView) {
            if (view != fmVar) {
                return false;
            }
            if (z10) {
                int C = org.telegram.messenger.t.C(88.0f, i15, i16);
                view.layout(0, C, view.getMeasuredWidth(), view.getMeasuredHeight() + C);
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
            if (fmVar.getVisibility() == 0) {
                dp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = dp3 - i16;
        } else {
            dp = i12 - AndroidUtilities.dp(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
            textView.setRotation(-90.0f);
            if (fmVar.getVisibility() == 0) {
                dp -= AndroidUtilities.dp(96.0f);
            }
        }
        textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        tm tmVar = chatAttachAlertPhotoLayout.v;
        fm fmVar = chatAttachAlertPhotoLayout.r;
        ig.a0 a0Var = chatAttachAlertPhotoLayout.s;
        boolean z10 = i10 < i11;
        pm pmVar = chatAttachAlertPhotoLayout.P;
        if (view != pmVar) {
            bh.r rVar = chatAttachAlertPhotoLayout.j0;
            if (view == rVar) {
                if (z10) {
                    rVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30));
                    return true;
                }
                rVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            fc1 fc1Var = chatAttachAlertPhotoLayout.l0;
            if (view == fc1Var) {
                if (z10) {
                    fc1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                    return true;
                }
                fc1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            if (view == fmVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    fmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
                    if (a0Var.o != 0) {
                        fmVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.k1(0);
                        tmVar.l();
                    }
                } else {
                    fmVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                    if (a0Var.o != 1) {
                        fmVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        a0Var.k1(1);
                        tmVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.b0 && !chatAttachAlertPhotoLayout.d0) {
            pmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean onCustomOpenAnimation() {
        this.j0.setTranslationX(0.0f);
        this.q1.setAlpha(0.0f);
        this.o1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.t2 = animatorSet;
        int i10 = 2;
        ei eiVar = this.r2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, eiVar, 0.0f, 400.0f));
        this.t2.setDuration(400L);
        this.t2.setStartDelay(20L);
        eiVar.set(this, Float.valueOf(0.0f));
        this.t2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new eh(this, i10));
        o1.j jVar = this.s2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(this.containerView, o1.h.n, 0.0f);
        this.s2 = jVar2;
        if (this.K1 != null) {
            jVar2.u.a(0.75f);
            this.s2.u.b(350.0f);
        } else {
            jVar2.u.a(0.75f);
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
        int i11 = 3;
        kg kgVar = new kg(this, animationNotificationsLocker, this.delegate, i11);
        this.s2.a(new hi.k4(i10, this, kgVar));
        this.currentSheetAnimation.addListener(new bi.ce(23, this, kgVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        R1(0.0f);
        ofFloat2.addUpdateListener(new eh(this, i11));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(ds.f);
        ofFloat2.start();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k3
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

    @Override // org.telegram.ui.ActionBar.k3
    public final void onOpenAnimationEnd() {
        if (this.f0 instanceof org.telegram.ui.un) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.B0.w();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.v1 = true;
        if (this.P1 || this.O1) {
            return;
        }
        f1();
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
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

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            h1();
            ch.c cVar = this.b0;
            if (cVar != null) {
                cVar.updateColors();
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.j5);
            org.telegram.ui.ActionBar.w0 w0Var = this.n1;
            if (w0Var == null || themedColor == this.u2) {
                return;
            }
            this.u2 = themedColor;
            w0Var.setIconColor(themedColor);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final TLRPC.Chat p1() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        return r2Var instanceof org.telegram.ui.un ? ((org.telegram.ui.un) r2Var).e : MessagesController.getInstance(this.M1).getChat(Long.valueOf(-this.Z));
    }

    public final float q1() {
        return r0.getMeasuredHeight() - ((1.0f - this.G0.getAlpha()) * (r0.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final ru r1() {
        li liVar;
        return (this.c0 && ((liVar = this.B0) == this.j0 || liVar == this.q0)) ? this.S0 : this.H0;
    }

    public final long s1() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        return r2Var instanceof org.telegram.ui.un ? ((org.telegram.ui.un) r2Var).a() : this.Z;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean shouldOverlayCameraViewOverNavBar() {
        li liVar = this.B0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        return liVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.i1;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        this.L1 = false;
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (r2Var instanceof org.telegram.ui.un) {
            this.calcMandatoryInsets = ((org.telegram.ui.un) r2Var).F9();
        }
        d2();
        this.v1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.y6.a7), 0);
            this.navBarColor = o10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, o10, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.p2) {
            this.p2 = false;
            b8 b8Var = this.a1;
            b8Var.updateColors();
            b8Var.invalidate();
            z1();
        }
    }

    public final int t1(int i10) {
        li liVar = this.C0;
        int[] iArr = this.e2;
        return (liVar == null || !((this.B0 instanceof cn) || (liVar instanceof cn))) ? iArr[i10] : AndroidUtilities.lerp(iArr[0], iArr[1], this.d0);
    }

    public final int u1(boolean z10) {
        b8 b8Var;
        if (this.k2) {
            return getThemedColor(org.telegram.ui.ActionBar.y6.tg);
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        boolean a2 = u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q();
        Iterator it = this.n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
            long longValue = ((Long) gVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a10 = a8.ee.a(f7, 0.0f, 1.0f);
        if (z10 && (b8Var = this.a1) != null && b8Var.getVisibility() == 0) {
            a10 *= 1.0f - b8Var.getAlpha();
        }
        return i0.a.f(a10, getThemedColor(org.telegram.ui.ActionBar.y6.h5), getThemedColor(a2 ? org.telegram.ui.ActionBar.y6.a7 : org.telegram.ui.ActionBar.y6.i5));
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
    /* JADX WARN: Removed duplicated region for block: B:83:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v1() {
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        ti tiVar;
        pm pmVar;
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
        th thVar = this.A1;
        thVar.setAlpha(1.0f);
        thVar.setTranslationY(0.0f);
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.A0;
            if (i11 >= longSparseArray.size()) {
                break;
            }
            ((hi.o4) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
            i11++;
        }
        int i12 = this.T0;
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (i12 != 2) {
            if (r2Var instanceof org.telegram.ui.un) {
                org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var;
                chat = unVar.e;
                user = unVar.i();
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
            z10 = r2Var instanceof org.telegram.ui.un;
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
                    this.S1 = !z10 || ((org.telegram.ui.un) r2Var).h == null;
                }
            }
            if (this.U1) {
                this.R1 = false;
                this.S1 = false;
            }
            wh whVar = this.H0;
            if (z10 || this.T0 == 2) {
                whVar.setVisibility(this.W ? 0 : 4);
            }
            boolean z11 = this.P1;
            boolean z12 = this.O1;
            boolean z13 = this.N1;
            chatAttachAlertPhotoLayout = this.j0;
            tiVar = chatAttachAlertPhotoLayout.b;
            uz uzVar = chatAttachAlertPhotoLayout.H;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z11;
            chatAttachAlertPhotoLayout.x0 = z12;
            chatAttachAlertPhotoLayout.z0 = z13;
            pmVar = chatAttachAlertPhotoLayout.P;
            if (pmVar != null) {
                pmVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.P.setEnabled(chatAttachAlertPhotoLayout.v0);
            }
            if (!((tiVar.f0 instanceof org.telegram.ui.un) && tiVar.p1() == null) && tiVar.T0 == 0) {
                chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
                if (chatAttachAlertPhotoLayout.v0) {
                    uzVar.setText(LocaleController.getString(R.string.NoPhotos));
                    uzVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat p12 = tiVar.p1();
                    uzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    if (ChatObject.isActionBannedByDefault(p12, 7)) {
                        uzVar.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else if (AndroidUtilities.isBannedForever(p12.banned_rights)) {
                        uzVar.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                    } else {
                        uzVar.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(p12.banned_rights.until_date)));
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
                if (uzVar != null) {
                    uzVar.c();
                }
            }
            chatAttachAlertPhotoLayout.u0();
            whVar.k(true);
            this.S0.k(true);
            this.x1 = false;
            setFocusable(false);
            if (!this.O || this.P) {
                if (this.o0 == null) {
                    sl slVar = new sl(this, getContext(), this.resourcesProvider, (this.H || this.P || this.U1) ? false : true);
                    this.o0 = slVar;
                    this.z0[5] = slVar;
                    nl nlVar = this.z2;
                    if (nlVar != null) {
                        slVar.setDelegate(nlVar);
                    } else {
                        slVar.setDelegate(new dh(this, i10));
                    }
                }
                this.Z0 = 5L;
                liVar = this.o0;
            } else if (this.N) {
                J1(false);
                liVar = this.p0;
                this.Z0 = 4L;
            } else {
                MessageObject messageObject = this.K1;
                if (messageObject != null) {
                    int i15 = this.J1;
                    if (i15 == -1) {
                        this.V0 = true;
                        if (messageObject.isMusic()) {
                            G1(false);
                            liVar = this.l0;
                            this.Z0 = 3L;
                        } else if (this.K1.isDocument()) {
                            J1(false);
                            liVar = this.p0;
                            this.Z0 = 4L;
                        } else {
                            this.Z0 = 1L;
                        }
                    } else {
                        if (i15 == 2) {
                            G1(false);
                            liVar = this.l0;
                            this.Z0 = 3L;
                        } else if (i15 == 1) {
                            J1(false);
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
            thVar.setVisibility(this.V0 ? 0 : 8);
            if (this.B0 != liVar) {
                b8 b8Var = this.a1;
                if (b8Var.n0) {
                    b8Var.g(true);
                }
                this.containerView.removeView(this.B0);
                this.B0.t();
                this.B0.setVisibility(8);
                this.B0.s();
                this.B0 = liVar;
                this.allowNestedScroll = true;
                if (liVar.getParent() == null) {
                    K1(this.B0);
                    this.containerView.addView(this.B0, 0, gb1.g(-1.0f, -1));
                }
                liVar.setAlpha(1.0f);
                liVar.setVisibility(0);
                liVar.G(null);
                liVar.H();
                b8Var.setVisibility(liVar.i() != 0 ? 0 : 4);
                N1(this.c0, false);
                d2();
            }
            if (this.B0 != chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            c2(0);
            this.D1.l();
            r1().setText("");
            this.C1.h1(0, MediaController.VIDEO_BITRATE_480);
        }
        user = null;
        chat = null;
        z10 = r2Var instanceof org.telegram.ui.un;
        if (z10) {
            if (chat != null) {
            }
            if (this.U1) {
            }
            wh whVar2 = this.H0;
            if (z10) {
            }
            whVar2.setVisibility(this.W ? 0 : 4);
            boolean z112 = this.P1;
            boolean z122 = this.O1;
            boolean z132 = this.N1;
            chatAttachAlertPhotoLayout = this.j0;
            tiVar = chatAttachAlertPhotoLayout.b;
            uz uzVar2 = chatAttachAlertPhotoLayout.H;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z112;
            chatAttachAlertPhotoLayout.x0 = z122;
            chatAttachAlertPhotoLayout.z0 = z132;
            pmVar = chatAttachAlertPhotoLayout.P;
            if (pmVar != null) {
            }
            if (tiVar.f0 instanceof org.telegram.ui.un) {
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
            whVar2.k(true);
            this.S0.k(true);
            this.x1 = false;
            setFocusable(false);
            if (this.O) {
            }
            if (this.o0 == null) {
            }
            this.Z0 = 5L;
            liVar = this.o0;
            thVar.setVisibility(this.V0 ? 0 : 8);
            if (this.B0 != liVar) {
            }
            if (this.B0 != chatAttachAlertPhotoLayout) {
            }
            c2(0);
            this.D1.l();
            r1().setText("");
            this.C1.h1(0, MediaController.VIDEO_BITRATE_480);
        }
        if (chat != null) {
        }
        if (this.U1) {
        }
        wh whVar22 = this.H0;
        if (z10) {
        }
        whVar22.setVisibility(this.W ? 0 : 4);
        boolean z1122 = this.P1;
        boolean z1222 = this.O1;
        boolean z1322 = this.N1;
        chatAttachAlertPhotoLayout = this.j0;
        tiVar = chatAttachAlertPhotoLayout.b;
        uz uzVar22 = chatAttachAlertPhotoLayout.H;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.v0 = z14;
        chatAttachAlertPhotoLayout.w0 = z1122;
        chatAttachAlertPhotoLayout.x0 = z1222;
        chatAttachAlertPhotoLayout.z0 = z1322;
        pmVar = chatAttachAlertPhotoLayout.P;
        if (pmVar != null) {
        }
        if (tiVar.f0 instanceof org.telegram.ui.un) {
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
        whVar22.k(true);
        this.S0.k(true);
        this.x1 = false;
        setFocusable(false);
        if (this.O) {
        }
        if (this.o0 == null) {
        }
        this.Z0 = 5L;
        liVar = this.o0;
        thVar.setVisibility(this.V0 ? 0 : 8);
        if (this.B0 != liVar) {
        }
        if (this.B0 != chatAttachAlertPhotoLayout) {
        }
        c2(0);
        this.D1.l();
        r1().setText("");
        this.C1.h1(0, MediaController.VIDEO_BITRATE_480);
    }

    public final boolean w1() {
        if (!this.c0) {
            return false;
        }
        li liVar = this.B0;
        return liVar == this.j0 || liVar == this.q0;
    }

    public final void y1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        ri riVar = this.c2;
        if (riVar == null || this.x1) {
            return;
        }
        boolean E = riVar.E();
        this.x1 = true;
        AndroidUtilities.runOnUIThread(new bi.u7(this, editTextBoldCursor, z10, 19), E ? 200L : 0L);
    }

    public final void z1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int u12 = u1(false);
        org.telegram.ui.ActionBar.y6.z1(u12, this.shadowDrawable);
        hh.c cVar = this.J2;
        if (cVar.b != u12) {
            cVar.a(u12);
            lh.f fVar = this.y1;
            if (fVar != null) {
                fVar.invalidate();
            }
            vh vhVar = this.z1;
            if (vhVar != null) {
                vhVar.invalidate();
            }
        }
        d2();
        this.containerView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        yh yhVar;
        wh whVar;
        if (this.B0.p() || isDismissed()) {
            return;
        }
        li liVar = this.B0;
        al alVar = this.w0;
        boolean z10 = (liVar != alVar || alVar == null || alVar.K || alVar.P0 == null) ? false : true;
        this.x0 = z10;
        if (!z10 && (whVar = this.H0) != null) {
            AndroidUtilities.hideKeyboard(whVar.getEditText());
        }
        if (!this.x0 && (yhVar = this.S0) != null) {
            AndroidUtilities.hideKeyboard(yhVar.getEditText());
        }
        this.A0.clear();
        org.telegram.ui.ActionBar.r2 r2Var = this.f0;
        if (r2Var == null) {
            r2Var = LaunchActivity.R();
        }
        if (!this.G2 && r2Var != null && this.B0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.F2) {
                return;
            }
            this.F2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new dh(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new jh(this, 0));
            z0 z0Var = new z0(this, 4);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.N = z0Var;
            e2Var.show();
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, this.resourcesProvider);
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
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.o(getThemedColor(org.telegram.ui.ActionBar.y6.a7), 0), true, (AndroidUtilities.IntColorCallback) new dh(this, 11));
        if (r2Var != null) {
            AndroidUtilities.setLightStatusBar(this, r2Var.isLightStatusBar());
        }
        this.l2 = false;
        super.dismiss();
        this.G2 = false;
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }

    public ti(Activity activity, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, boolean z11) {
        this(activity, r2Var, z10, z11, true, null);
    }
}

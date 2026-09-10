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
import org.telegram.ui.qj1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class yi extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b3, le.d {
    public static final /* synthetic */ int O2 = 0;
    public final bh.d A0;
    public final vi A1;
    public boolean A2;
    public final bh.d B0;
    public boolean B1;
    public bi.k B2;
    public final gg.j C0;
    public final RadialProgressView C1;
    public final zg.e C2;
    public final ai D0;
    public boolean D1;
    public final eh.d D2;
    public final k0 E;
    public final di E0;
    public final o6 E1;
    public final eh.d E2;
    public boolean F;
    public final ImageView F0;
    public float F1;
    public final eh.c F2;
    public boolean G;
    public final int[] G0;
    public int G1;
    public final zg.a G2;
    public boolean H;
    public final ai H0;
    public MessageObject H1;
    public final zg.a H2;
    public int I;
    public final ii I0;
    public boolean I1;
    public final nh I2;
    public Utilities.Callback2 J;
    public final TextPaint J0;
    public final int J1;
    public final ArrayList J2;
    public int K;
    public final RectF K0;
    public boolean K1;
    public final RectF K2;
    public int L;
    public final Paint L0;
    public boolean L1;
    public final RectF L2;
    public boolean M;
    public AnimatorSet M0;
    public boolean M1;
    public final RectF M2;
    public boolean N;
    public long N0;
    public boolean N1;
    public final ArrayList N2;
    public boolean O;
    public final bi.n7 O0;
    public boolean O1;
    public boolean P;
    public final gi P0;
    public boolean P1;
    public c50 Q;
    public int Q0;
    public boolean Q1;
    public boolean R;
    public ut R0;
    public boolean R1;
    public final be0 S;
    public boolean S0;
    public int S1;
    public ao T;
    public boolean T0;
    public boolean T1;
    public e50 U;
    public boolean U0;
    public boolean U1;
    public boolean V;
    public final float V0;
    public float V1;
    public boolean W;
    public long W0;
    public float W1;
    public kk X;
    public final y7 X0;
    public ValueAnimator X1;
    public gj Y;
    public AnimatorSet Y0;
    public int Y1;
    public long Z;
    public AnimatorSet Z0;
    public wi Z1;
    public boolean a0;
    public final org.telegram.ui.ActionBar.w0 a1;
    public ln a2;
    public final le.b b;
    public final zg.b b0;
    public final bi.y b1;
    public final int[] b2;
    public final le.b c;
    public boolean c0;
    public final org.telegram.ui.ActionBar.w0 c1;
    public int c2;
    public final le.b d;
    public float d0;
    public bi.x4 d1;
    public float d2;
    public final le.b e;
    public final mi e0;
    public final org.telegram.ui.ActionBar.w0 e1;
    public float e2;
    public final le.b f;
    public final org.telegram.ui.ActionBar.p2 f0;
    public final ai.t f1;
    public boolean f2;
    public final boolean g0;
    public float g1;
    public float g2;
    public final le.b h;
    public of h0;
    public float h1;
    public final boolean h2;
    public boolean i0;
    public final ai i1;
    public boolean i2;
    public final ChatAttachAlertPhotoLayout j0;
    public final TextView j1;
    public final ArrayList j2;
    public bk k0;
    public final org.telegram.ui.ActionBar.w0 k1;
    public final Rect k2;
    public jj l0;
    public final LinearLayout l1;
    public float l2;
    public zn m0;
    public final ImageView m1;
    public boolean m2;
    public final le.l n;
    public zn n0;
    public final LinearLayout n1;
    public int n2;
    public ll o0;
    public final TextView o1;
    public final mi o2;
    public tk p0;
    public float p1;
    public o1.k p2;
    public xm q0;
    public boolean q1;
    public AnimatorSet q2;
    public org.telegram.ui.bo r;
    public mj r0;
    public final oi r1;
    public boolean r2;
    public final o6 s;
    public gg.n0 s0;
    public boolean s1;
    public boolean s2;
    public uk t0;
    public Object t1;
    public gl t2;
    public uk u0;
    public boolean u1;
    public boolean u2;
    public final o6 v;
    public hi.s v0;
    public final ih.f v1;
    public boolean v2;
    public final ImageView w;
    public final qi[] w0;
    public final ci w1;
    public File w2;
    public final k0 x;
    public final LongSparseArray x0;
    public final ai x1;
    public double[] x2;
    public final ImageView y;
    public qi y0;
    public final bi y1;
    public boolean y2;
    public qi z0;
    public final s4.c0 z1;
    public boolean z2;

    public yi(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        TextPaint textPaint;
        float f7;
        ai.t tVar;
        wr wrVar = wr.h;
        this.b = new le.b(0, this, wrVar, 380L, false);
        this.c = new le.b(1, this, wrVar, 380L, false);
        this.d = new le.b(2, this, wrVar, 380L, false);
        this.e = new le.b(3, this, wrVar, 380L, false);
        this.f = new le.b(4, this, wrVar, 380L, true);
        this.h = new le.b(5, this, wrVar, 320L, false);
        le.l lVar = new le.l(new gh(this, 1), wrVar, 380L);
        this.n = lVar;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.d0 = 0.0f;
        this.e0 = new mi(this, 0);
        this.i0 = false;
        qi[] qiVarArr = new qi[11];
        this.w0 = qiVarArr;
        this.x0 = new LongSparseArray();
        this.G0 = new int[2];
        TextPaint textPaint2 = new TextPaint(1);
        this.J0 = textPaint2;
        this.K0 = new RectF();
        this.L0 = new Paint(1);
        this.U0 = true;
        this.V0 = 1.0f;
        this.B1 = false;
        this.D1 = false;
        int i10 = UserConfig.selectedAccount;
        this.J1 = i10;
        this.K1 = true;
        this.L1 = true;
        this.M1 = true;
        this.N1 = true;
        this.O1 = true;
        this.P1 = true;
        this.Q1 = true;
        this.S1 = -1;
        this.T1 = true;
        this.Y1 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.b2 = new int[2];
        new Paint(1);
        this.i2 = false;
        ArrayList arrayList = new ArrayList();
        this.j2 = arrayList;
        Rect rect = new Rect();
        this.k2 = rect;
        this.o2 = new mi(this, 1);
        this.r2 = true;
        this.s2 = false;
        this.z2 = false;
        this.A2 = false;
        ArrayList arrayList2 = new ArrayList();
        this.J2 = arrayList2;
        RectF rectF = new RectF();
        this.K2 = rectF;
        RectF rectF2 = new RectF();
        this.L2 = rectF2;
        RectF rectF3 = new RectF();
        this.M2 = rectF3;
        arrayList2.add(rectF);
        arrayList2.add(rectF2);
        arrayList2.add(rectF3);
        this.N2 = new ArrayList();
        this.occupyNavigationBarWithoutKeyboard = true;
        eh.c cVar = new eh.c();
        this.F2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        int i11 = 7;
        if (Build.VERSION.SDK_INT >= 31) {
            this.C2 = new zg.e(false);
            eh.d dVar = new eh.d(null);
            this.E2 = dVar;
            dVar.j(new l2.g(this, i11));
            eh.d dVar2 = new eh.d(null);
            this.D2 = dVar2;
            dVar2.j(new l2.h(this, 9));
            zg.a aVar = new zg.a(dVar);
            this.G2 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            zg.a aVar2 = new zg.a(dVar2);
            this.H2 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
        } else {
            this.C2 = null;
            this.D2 = null;
            this.E2 = null;
            this.G2 = new zg.a(cVar);
            this.H2 = new zg.a(cVar);
        }
        zg.a aVar3 = new zg.a(cVar);
        this.I2 = new nh(this, 0);
        this.h2 = z10;
        this.g0 = (p2Var instanceof org.telegram.ui.eo) && p2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f0 = p2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        oi oiVar = new oi(this, context);
        this.r1 = oiVar;
        oiVar.setDelegate(new pi(this));
        this.containerView = oiVar;
        oiVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        y7 y7Var = new y7(this, context, f6Var, 1);
        this.X0 = y7Var;
        y7Var.S0 = true;
        y7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        y7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        int i13 = org.telegram.ui.ActionBar.j6.j5;
        y7Var.C(getThemedColor(i13), false);
        int i14 = org.telegram.ui.ActionBar.j6.I5;
        y7Var.A(getThemedColor(i14), false);
        y7Var.setTitleColor(getThemedColor(i13));
        y7Var.setOccupyStatusBar(true);
        y7Var.setAlpha(0.0f);
        y7Var.setActionBarMenuOnItemClick(new org.telegram.ui.vo(this, 8));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i13), false, f6Var);
        this.a1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.ic_ab_other);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        final int i15 = 4;
        w0Var2.setVisibility(4);
        w0Var2.setAlpha(0.0f);
        w0Var2.setScaleX(0.6f);
        w0Var2.setScaleY(0.6f);
        w0Var2.setSubMenuOpenSide(2);
        w0Var2.setDelegate(new gh(this, 8));
        w0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        w0Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i14), 6, -1));
        w0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                di.u4 u4Var;
                switch (i15) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
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
                            yiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.a1.M(null, null);
                        break;
                    case 5:
                        yi.s(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.Z1(yiVar4.y0 != yiVar4.q0);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i13), false, f6Var);
        this.c1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        bi.y yVar = new bi.y();
        this.b1 = yVar;
        w0Var3.setIcon(yVar);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        w0Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i14), 6, -1));
        final int i16 = 5;
        w0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                di.u4 u4Var;
                switch (i16) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
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
                            yiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.a1.M(null, null);
                        break;
                    case 5:
                        yi.s(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.Z1(yiVar4.y0 != yiVar4.q0);
                        break;
                }
            }
        });
        ai.t tVar2 = new ai.t(this, context);
        tVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        tVar2.setText(LocaleController.getString(R.string.Create));
        tVar2.setTypeface(AndroidUtilities.bold());
        tVar2.setTextSize(1, 14.0f);
        tVar2.setVisibility(4);
        tVar2.setAlpha(0.0f);
        tVar2.setGravity(17);
        tVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        tVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        final int i17 = 6;
        tVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                di.u4 u4Var;
                switch (i17) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
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
                            yiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.a1.M(null, null);
                        break;
                    case 5:
                        yi.s(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.Z1(yiVar4.y0 != yiVar4.q0);
                        break;
                }
            }
        });
        w7.c6.a(tVar2);
        this.f1 = tVar2;
        W1();
        if (p2Var != null) {
            textPaint = textPaint2;
            w0Var = w0Var3;
            tVar = tVar2;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i13), false, f6Var);
            this.e1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            w0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i14), 6, -1));
            w0Var4.setOnClickListener(new org.telegram.ui.ActionBar.e0(3, this, z11));
        } else {
            w0Var = w0Var3;
            textPaint = textPaint2;
            f7 = 14.0f;
            tVar = tVar2;
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i13), false, f6Var);
        this.k1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var5.setVisibility(8);
        w0Var5.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i14), 3, -1));
        final int i18 = 2;
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        final yi yiVar = this.b;
                        di diVar = yiVar.E0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(yiVar.getContext(), f6Var);
                            g0Var.m0(diVar.getText());
                            final int i19 = 0;
                            g0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.oh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i19) {
                                        case 0:
                                            di diVar2 = yiVar.E0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            gi giVar = yiVar.P0;
                                            giVar.setText(charSequence);
                                            giVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = yiVar.Z;
                            boolean z13 = yiVar.H1 != null;
                            ph phVar = new ph(yiVar, 0);
                            g0Var.l0 = j3;
                            g0Var.m0 = z13;
                            g0Var.n0 = phVar;
                            g0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final yi yiVar2 = this.b;
                        gi giVar = yiVar2.P0;
                        if (giVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(yiVar2.getContext(), f6Var);
                            g0Var2.m0(giVar.getText());
                            final int i20 = 1;
                            g0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.oh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            di diVar2 = yiVar2.E0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            gi giVar2 = yiVar2.P0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = yiVar2.Z;
                            boolean z14 = yiVar2.H1 != null;
                            ph phVar2 = new ph(yiVar2, 1);
                            g0Var2.l0 = j10;
                            g0Var2.m0 = z14;
                            g0Var2.n0 = phVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                    default:
                        yi yiVar3 = this.b;
                        yiVar3.k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = yiVar3.f0;
                        t12.K2(null, p2Var2, f6Var);
                        PhotoViewer.t1().L2(yiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i21 = yiVar3.S1;
                        boolean z15 = yiVar3.T1;
                        t13.h = i21;
                        t13.n = z15;
                        if (!yiVar3.Z1.e0()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(yiVar3.getContainer().findFocus());
                        }
                        File w10 = bi.r9.w(yiVar3.J1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i22 = point.x;
                        int i23 = point.y;
                        if (i22 > 1080 || i23 > 1080) {
                            float min = Math.min(i22, i23) / 1080.0f;
                            i22 = (int) (i22 * min);
                            i23 = (int) (i23 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i22, i23, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new zh(yiVar3, photoEntry), p2Var2 instanceof org.telegram.ui.eo ? (org.telegram.ui.eo) p2Var2 : null);
                        if (yiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, yiVar3.J);
                            break;
                        }
                        break;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        final int i19 = 7;
        w0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                di.u4 u4Var;
                switch (i19) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
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
                            yiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.a1.M(null, null);
                        break;
                    case 5:
                        yi.s(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.Z1(yiVar4.y0 != yiVar4.q0);
                        break;
                }
            }
        });
        ai aiVar = new ai(this, context, 0);
        this.i1 = aiVar;
        final int i20 = 8;
        aiVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                di.u4 u4Var;
                switch (i20) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
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
                            yiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.a1.M(null, null);
                        break;
                    case 5:
                        yi.s(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.Z1(yiVar4.y0 != yiVar4.q0);
                        break;
                }
            }
        });
        aiVar.setAlpha(0.0f);
        aiVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.l1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.j1 = textView;
        textView.setTextColor(getThemedColor(i13));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.a6.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.m1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.a6.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        aiVar.addView(linearLayout, w7.a6.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.a6.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.o1 = textView2;
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.a6.q(-2, -2, 16));
        aiVar.addView(linearLayout2, w7.a6.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, f6Var);
        this.j0 = chatAttachAlertPhotoLayout;
        qiVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.y0 = chatAttachAlertPhotoLayout;
        this.W0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.a6.c(-1.0f, -1));
        ih.f fVar = new ih.f(context);
        this.v1 = fVar;
        fVar.setup(aVar3);
        fVar.setFadeTopAlpha(0);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(fVar, w7.a6.g());
        this.containerView.addView(aiVar, w7.a6.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        bi.n7 n7Var = new bi.n7(context, 8);
        this.O0 = n7Var;
        this.containerView.addView(n7Var, w7.a6.e(-1, -2, 55));
        this.containerView.addView(y7Var, w7.a6.c(-2.0f, -1));
        this.containerView.addView(w0Var2, w7.a6.e(48, 48, 53));
        this.containerView.addView(w0Var, w7.a6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.e1;
        if (w0Var6 != null) {
            this.containerView.addView(w0Var6, w7.a6.e(48, 48, 53));
        }
        aiVar.addView(w0Var5, w7.a6.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(tVar, w7.a6.e(-2, 48, 53));
        ai aiVar2 = new ai(this, context, 1);
        this.x1 = aiVar2;
        bi biVar = new bi(context, 0);
        this.y1 = biVar;
        biVar.setClipChildren(true);
        biVar.setClipToPadding(false);
        vi viVar = new vi(this, context);
        this.A1 = viVar;
        biVar.setAdapter(viVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.z1 = c0Var;
        biVar.setLayoutManager(c0Var);
        biVar.setVerticalScrollBarEnabled(false);
        biVar.setHorizontalScrollBarEnabled(false);
        biVar.setItemAnimator(null);
        biVar.setLayoutAnimation(null);
        biVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        biVar.z2 = true;
        biVar.setOverScrollMode(2);
        zg.a aVar4 = this.G2;
        gh.k kVar = new gh.k(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = kVar;
        aVar4.e = viewGroup2;
        zg.a aVar5 = this.H2;
        gh.k kVar2 = new gh.k(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = kVar2;
        aVar5.e = viewGroup3;
        gh.k kVar3 = new gh.k(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        aVar3.d = kVar3;
        aVar3.e = viewGroup4;
        ci ciVar = new ci(this, context, 0);
        this.w1 = ciVar;
        zg.b bVar = new zg.b(aVar3.c(ciVar, null, false));
        this.b0 = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(ciVar, w7.a6.g());
        bh.d c10 = this.G2.c(aiVar2, dh.c.f(f6Var), false);
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(7.0f));
        aiVar2.setBackground(c10);
        biVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        biVar.setClipToOutline(true);
        int dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(28.0f);
        bi.g gVar = xf.k0.a;
        biVar.setOutlineProvider(new xf.j0(dp, dp2));
        biVar.setImportantForAccessibility(1);
        aiVar2.addView(biVar, w7.a6.g());
        this.containerView.addView(aiVar2, w7.a6.e(-1, 70, 81));
        biVar.setOnItemClickListener(new ai.b0(8, this, f6Var));
        biVar.setOnItemLongClickListener(new gh(this, 3));
        final int i21 = 0;
        o6 o6Var = new o6(context, true, false, true);
        this.E1 = o6Var;
        o6Var.setVisibility(8);
        o6Var.setAlpha(0.0f);
        o6Var.setGravity(17);
        o6Var.setTypeface(AndroidUtilities.bold());
        int dp3 = AndroidUtilities.dp(16.0f);
        o6Var.setPadding(dp3, 0, dp3, 0);
        o6Var.setTextSize(AndroidUtilities.dp(f7));
        o6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                di.u4 u4Var;
                switch (i21) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
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
                            yiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.a1.M(null, null);
                        break;
                    case 5:
                        yi.s(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.Z1(yiVar4.y0 != yiVar4.q0);
                        break;
                }
            }
        });
        this.containerView.addView(o6Var, w7.a6.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.a6.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.F0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i22 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                di.u4 u4Var;
                switch (i22) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
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
                            yiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.a1.M(null, null);
                        break;
                    case 5:
                        yi.s(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.Z1(yiVar4.y0 != yiVar4.q0);
                        break;
                }
            }
        });
        ai aiVar3 = new ai(this, context, 2);
        this.D0 = aiVar3;
        gg.j jVar = new gg.j(this, context);
        this.C0 = jVar;
        aiVar3.addView(jVar, w7.a6.e(-1, -1, 119));
        bh.d c11 = this.H2.c(oiVar, dh.c.n(f6Var), false);
        this.A0 = c11;
        c11.k = true;
        c11.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.t(AndroidUtilities.dp(32.0f));
        c11.h.g = 0.4f;
        c11.j();
        bh.d c12 = this.G2.c(jVar, dh.c.n(f6Var), false);
        this.B0 = c12;
        c12.p(AndroidUtilities.dp(22.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        jVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        aiVar3.setWillNotDraw(false);
        aiVar3.setVisibility(4);
        aiVar3.setAlpha(0.0f);
        this.containerView.addView(aiVar3, w7.a6.e(-1, -2, 83));
        aiVar3.setOnTouchListener(new ai.h(13));
        o6 o6Var2 = new o6(context, false, false, false);
        this.s = o6Var2;
        o6Var2.setAllowCancel(true);
        o6Var2.setScaleProperty(0.6f);
        o6Var2.setVisibility(8);
        o6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i23 = org.telegram.ui.ActionBar.j6.y6;
        o6Var2.setTextColor(getThemedColor(i23));
        o6Var2.setTypeface(AndroidUtilities.bold());
        o6Var2.setGravity(17);
        jVar.addView(o6Var2, w7.a6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.w = imageView4;
        k0 k0Var = new k0(context);
        this.x = k0Var;
        imageView4.setImageDrawable(k0Var);
        imageView4.setScaleType(scaleType);
        int i24 = org.telegram.ui.ActionBar.j6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i24), mode));
        int i25 = org.telegram.ui.ActionBar.j6.i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i25), 1, AndroidUtilities.dp(16.0f)));
        jVar.addView(imageView4, w7.a6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.c6.a(imageView4);
        final int i26 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i26) {
                    case 0:
                        final yi yiVar = this.b;
                        di diVar = yiVar.E0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(yiVar.getContext(), f6Var);
                            g0Var.m0(diVar.getText());
                            final int i192 = 0;
                            g0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.oh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            di diVar2 = yiVar.E0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            gi giVar2 = yiVar.P0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = yiVar.Z;
                            boolean z13 = yiVar.H1 != null;
                            ph phVar = new ph(yiVar, 0);
                            g0Var.l0 = j3;
                            g0Var.m0 = z13;
                            g0Var.n0 = phVar;
                            g0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final yi yiVar2 = this.b;
                        gi giVar = yiVar2.P0;
                        if (giVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(yiVar2.getContext(), f6Var);
                            g0Var2.m0(giVar.getText());
                            final int i202 = 1;
                            g0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.oh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            di diVar2 = yiVar2.E0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            gi giVar2 = yiVar2.P0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = yiVar2.Z;
                            boolean z14 = yiVar2.H1 != null;
                            ph phVar2 = new ph(yiVar2, 1);
                            g0Var2.l0 = j10;
                            g0Var2.m0 = z14;
                            g0Var2.n0 = phVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                    default:
                        yi yiVar3 = this.b;
                        yiVar3.k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = yiVar3.f0;
                        t12.K2(null, p2Var2, f6Var);
                        PhotoViewer.t1().L2(yiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i212 = yiVar3.S1;
                        boolean z15 = yiVar3.T1;
                        t13.h = i212;
                        t13.n = z15;
                        if (!yiVar3.Z1.e0()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(yiVar3.getContainer().findFocus());
                        }
                        File w10 = bi.r9.w(yiVar3.J1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i222 = point.x;
                        int i232 = point.y;
                        if (i222 > 1080 || i232 > 1080) {
                            float min = Math.min(i222, i232) / 1080.0f;
                            i222 = (int) (i222 * min);
                            i232 = (int) (i232 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i222, i232, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new zh(yiVar3, photoEntry), p2Var2 instanceof org.telegram.ui.eo ? (org.telegram.ui.eo) p2Var2 : null);
                        if (yiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, yiVar3.J);
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
        di diVar = new di(this, context, oiVar, f6Var);
        this.E0 = diVar;
        diVar.J = true;
        diVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        diVar.s();
        diVar.getEditText().setLayoutParams(w7.a6.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        diVar.getEditText().addTextChangedListener(new fi(this));
        jVar.addView(diVar, w7.a6.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar.setClipChildren(false);
        aiVar3.setClipChildren(false);
        diVar.setClipChildren(false);
        n7Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        n7Var.setWillNotDraw(false);
        gi giVar = new gi(this, context, oiVar, f6Var);
        this.P0 = giVar;
        giVar.J = true;
        giVar.getEditText().addTextChangedListener(new hi(this, p2Var));
        giVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        giVar.getEditText().setLayoutParams(w7.a6.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        giVar.getEditText().setTextSize(1, 17.0f);
        giVar.getEmojiButton().setLayoutParams(w7.a6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        giVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        n7Var.addView(giVar, w7.a6.e(-1, -2, 119));
        n7Var.setAlpha(0.0f);
        n7Var.setVisibility(8);
        diVar.addView(imageView3, w7.a6.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        bh.d c13 = this.G2.c(n7Var, dh.c.n(f6Var), false);
        c13.p(AndroidUtilities.dp(22.0f));
        c13.o(AndroidUtilities.dp(7.0f));
        n7Var.setBackground(c13);
        n7Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        o6 o6Var3 = new o6(context, false, false, false);
        this.v = o6Var3;
        o6Var3.setScaleProperty(0.6f);
        o6Var3.setVisibility(8);
        o6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var3.setTextColor(getThemedColor(i23));
        o6Var3.setTypeface(AndroidUtilities.bold());
        o6Var3.setGravity(17);
        o6Var3.setAllowCancel(true);
        n7Var.addView(o6Var3, w7.a6.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Xd), mode2));
        giVar.addView(imageView5, w7.a6.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i27 = 2;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                di.u4 u4Var;
                switch (i27) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
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
                            yiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.a1.M(null, null);
                        break;
                    case 5:
                        yi.s(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.Z1(yiVar4.y0 != yiVar4.q0);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.y = imageView6;
        k0 k0Var2 = new k0(context);
        this.E = k0Var2;
        imageView6.setImageDrawable(k0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i24), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i25), 1, AndroidUtilities.dp(16.0f)));
        n7Var.addView(imageView6, w7.a6.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.c6.a(imageView6);
        final int i28 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i28) {
                    case 0:
                        final yi yiVar = this.b;
                        di diVar2 = yiVar.E0;
                        if (diVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var = new g0(yiVar.getContext(), f6Var);
                            g0Var.m0(diVar2.getText());
                            final int i192 = 0;
                            g0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.oh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            di diVar22 = yiVar.E0;
                                            diVar22.setText(charSequence);
                                            diVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            gi giVar2 = yiVar.P0;
                                            giVar2.setText(charSequence);
                                            giVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = yiVar.Z;
                            boolean z13 = yiVar.H1 != null;
                            ph phVar = new ph(yiVar, 0);
                            g0Var.l0 = j3;
                            g0Var.m0 = z13;
                            g0Var.n0 = phVar;
                            g0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final yi yiVar2 = this.b;
                        gi giVar2 = yiVar2.P0;
                        if (giVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            g0 g0Var2 = new g0(yiVar2.getContext(), f6Var);
                            g0Var2.m0(giVar2.getText());
                            final int i202 = 1;
                            g0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.oh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            di diVar22 = yiVar2.E0;
                                            diVar22.setText(charSequence);
                                            diVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            gi giVar22 = yiVar2.P0;
                                            giVar22.setText(charSequence);
                                            giVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = yiVar2.Z;
                            boolean z14 = yiVar2.H1 != null;
                            ph phVar2 = new ph(yiVar2, 1);
                            g0Var2.l0 = j10;
                            g0Var2.m0 = z14;
                            g0Var2.n0 = phVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                    default:
                        yi yiVar3 = this.b;
                        yiVar3.k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = yiVar3.f0;
                        t12.K2(null, p2Var2, f6Var);
                        PhotoViewer.t1().L2(yiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i212 = yiVar3.S1;
                        boolean z15 = yiVar3.T1;
                        t13.h = i212;
                        t13.n = z15;
                        if (!yiVar3.Z1.e0()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(yiVar3.getContainer().findFocus());
                        }
                        File w10 = bi.r9.w(yiVar3.J1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i222 = point.x;
                        int i232 = point.y;
                        if (i222 > 1080 || i232 > 1080) {
                            float min = Math.min(i222, i232) / 1080.0f;
                            i222 = (int) (i222 * min);
                            i232 = (int) (i232 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i222, i232, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new zh(yiVar3, photoEntry), p2Var2 instanceof org.telegram.ui.eo ? (org.telegram.ui.eo) p2Var2 : null);
                        if (yiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, yiVar3.J);
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
        this.H0 = aiVar4;
        aiVar4.setFocusable(true);
        aiVar4.setFocusableInTouchMode(true);
        aiVar4.setVisibility(4);
        aiVar4.setScaleX(0.2f);
        aiVar4.setScaleY(0.2f);
        aiVar4.setAlpha(0.0f);
        aiVar4.setClipChildren(false);
        aiVar4.setClipToPadding(false);
        this.containerView.addView(aiVar4, w7.a6.e(110, 50, 85));
        ii iiVar = new ii(R.drawable.send_plane_24, context, f6Var, this);
        this.I0 = iiVar;
        iiVar.setImportantForAccessibility(2);
        aiVar4.addView(iiVar, w7.a6.e(-1, -1, 119));
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
        final int i29 = 3;
        iiVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ yi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                di.u4 u4Var;
                switch (i29) {
                    case 0:
                        yi yiVar = this.b;
                        long j3 = yiVar.W0;
                        if (j3 < 0 && (u4Var = (di.u4) yiVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = u4Var.getWebViewContainer();
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
                            yiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        yi yiVar3 = this.b;
                        boolean z14 = yiVar3.c0;
                        if (z14) {
                            yiVar3.H1(!z14, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.a1.M(null, null);
                        break;
                    case 5:
                        yi.s(this.b);
                        break;
                    case 6:
                        qi qiVar = this.b.y0;
                        if (qiVar != null) {
                            qiVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        yi yiVar4 = this.b;
                        yiVar4.Z1(yiVar4.y0 != yiVar4.q0);
                        break;
                }
            }
        });
        iiVar.setOnLongClickListener(new org.telegram.ui.hg(this, context, f6Var, p2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        ci ciVar2 = new ci(this, context, 1);
        ciVar2.setAlpha(0.0f);
        ciVar2.setScaleX(0.2f);
        ciVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        cl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        zg.a aVar6 = this.G2;
        ch.e n10 = dh.c.n(f6Var);
        vl0 vl0Var = fastScroll.o0;
        bh.d c14 = aVar6.c(vl0Var.f1, n10, false);
        fastScroll.e0 = c14;
        c14.o(AndroidUtilities.dp(4.0f));
        fastScroll.e0.p(AndroidUtilities.dp(24.0f));
        bh.d c15 = aVar6.c(vl0Var.f1, n10, false);
        fastScroll.f0 = c15;
        c15.o(AndroidUtilities.dp(6.0f));
        fastScroll.f0.t(AndroidUtilities.dp(4.0f));
        fastScroll.f0.p(AndroidUtilities.dp(f7));
        be0 be0Var = new be0(context);
        this.S = be0Var;
        this.containerView.addView(be0Var, w7.a6.c(-1.0f, -1));
        ch.e eVar = new ch.e(f6Var);
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
        y7Var.M(this.G2, eVar, false);
        lVar.i(1L, false);
    }

    public static void M(yi yiVar) {
        int i10;
        y7 y7Var = yiVar.X0;
        ih.f fVar = yiVar.v1;
        if (fVar == null || y7Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var = yiVar.resourcesProvider;
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        if (y7Var.getVisibility() == 0) {
            i10 = (int) (y7Var.getAlpha() * (a2 ? 255 : 160));
        } else {
            i10 = 0;
        }
        fVar.setFadeTopAlpha(i10);
    }

    public static void Q(yi yiVar) {
        bi.k kVar = new bi.k(yiVar, yiVar.getContext(), yiVar.Z, LaunchActivity.R(), yiVar.resourcesProvider, 1);
        yiVar.B2 = kVar;
        kVar.p(new o0.b(yiVar));
        ViewGroup viewGroup = yiVar.containerView;
        viewGroup.addView(yiVar.B2, viewGroup.indexOfChild(yiVar.D0), w7.a6.e(-1, -1, 83));
        bi.k kVar2 = yiVar.B2;
        kVar2.getAdapter().c = false;
        kVar2.getAdapter().d = false;
        kVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            kVar2.getAdapter().m0 = false;
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
            fg.l1 adapter = kVar2.getAdapter();
            eoVar.i();
            TLRPC.Chat chat = eoVar.e;
            adapter.getClass();
            adapter.l0 = chat;
            kVar2.getAdapter().W(eoVar.Z7);
            kVar2.getAdapter().e0 = eoVar.e != null;
        } else {
            kVar2.getAdapter().m0 = true;
            kVar2.getAdapter().W(null);
            kVar2.getAdapter().e0 = false;
        }
        kVar2.getAdapter().f0 = false;
        yiVar.U1();
    }

    public static /* synthetic */ void m(yi yiVar, ValueAnimator valueAnimator) {
        yiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.f3 f3Var = yiVar.container;
        if (f3Var != null) {
            f3Var.invalidate();
        }
    }

    public static /* synthetic */ void n(yi yiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.b3 b3Var) {
        yiVar.currentSheetAnimation = null;
        yiVar.p2 = null;
        animationNotificationsLocker.unlock();
        yiVar.currentSheetAnimationType = 0;
        if (b3Var != null) {
            b3Var.onOpenAnimationEnd();
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

    public static /* synthetic */ void o(yi yiVar, int i10) {
        yiVar.navBarColorKey = -1;
        yiVar.navBarColor = i10;
        yiVar.containerView.invalidate();
    }

    public static void p(yi yiVar) {
        o1.k kVar = yiVar.p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(yiVar.containerView, o1.h.n, 0.0f);
        yiVar.p2 = kVar2;
        kVar2.u.a(1.5f);
        yiVar.p2.u.b(1500.0f);
        yiVar.p2.f();
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
    public static boolean q(yi yiVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.p2 p2Var, View view) {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        org.telegram.ui.eo eoVar;
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
        org.telegram.ui.eo eoVar2;
        long j12;
        TLRPC.ChatFull chatFull;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        yi yiVar2 = yiVar;
        ii iiVar = yiVar2.I0;
        org.telegram.ui.ActionBar.p2 p2Var2 = yiVar2.f0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = yiVar2.j0;
        int i13 = yiVar2.J1;
        long j13 = yiVar2.Z;
        if ((j13 == 0 && !(p2Var2 instanceof org.telegram.ui.eo)) || yiVar2.K - yiVar2.L < 0 || yiVar2.h.f) {
            return false;
        }
        if (p2Var2 instanceof org.telegram.ui.eo) {
            org.telegram.ui.eo eoVar3 = (org.telegram.ui.eo) p2Var2;
            TLRPC.User i14 = eoVar3.i();
            MessageObject messageObject5 = eoVar3.n5;
            MessageObject messageObject6 = eoVar3.k5;
            if (eoVar3.c() || eoVar3.R3 == 5) {
                return false;
            }
            messageObject2 = messageObject6;
            messageObject = messageObject5;
            eoVar = eoVar3;
            user = i14;
            j13 = eoVar3.a();
        } else {
            user = MessagesController.getInstance(i13).getUser(Long.valueOf(j13));
            messageObject = null;
            messageObject2 = null;
            eoVar = null;
        }
        of ofVar = yiVar2.h0;
        if (ofVar != null) {
            ofVar.dismiss();
        }
        of ofVar2 = new of(yiVar2, context, f6Var, 1);
        yiVar2.h0 = ofVar2;
        ofVar2.r(iiVar, false, new bi.q(yiVar2, p2Var, f6Var, 12));
        ArrayList arrayList2 = new ArrayList();
        qi qiVar = yiVar2.y0;
        if (qiVar == chatAttachAlertPhotoLayout3 || qiVar == yiVar2.q0) {
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
                            j10 = j13;
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
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(j13);
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
                                                    try {
                                                        mediaMetadataRetriever3.setDataSource(open.getFileDescriptor(), photoEntry.livePhotoVideoOffset, file.length() - photoEntry.livePhotoVideoOffset);
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                    } catch (Exception e7) {
                                                        e = e7;
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
                                                } catch (Exception e10) {
                                                    e = e10;
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
                                i27 = photoEntry.videoOrientation;
                            } else {
                                j10 = j13;
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
                                CharSequence[] charSequenceArr = {yiVar2.m1().getText()};
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
                        j13 = j10;
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
            j3 = j13;
            messageObject4 = messageObject3;
        } else if (qiVar == yiVar2.k0) {
            if (TextUtils.isEmpty(yiVar2.m1().getText())) {
                chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                i12 = 0;
                z14 = false;
            } else {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                tL_message2.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                tL_message2.peer_id = MessagesController.getInstance(i13).getPeer(j13);
                CharSequence[] charSequenceArr2 = {yiVar2.m1().getText()};
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
            ArrayList<TLRPC.User> selected = yiVar2.k0.getSelected();
            int i28 = 0;
            while (i28 < selected.size()) {
                TLRPC.User user2 = selected.get(i28);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                int i29 = i12 + 1;
                tL_message3.id = i12;
                ArrayList<TLRPC.User> arrayList3 = selected;
                tL_message3.out = true;
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
                i28++;
                i12 = i29;
                selected = arrayList3;
                z14 = true;
            }
            messageObject4 = null;
            z10 = false;
            yiVar2 = yiVar;
            j3 = j13;
            z11 = z14;
        } else {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
            if (qiVar == yiVar2.p0) {
                messageObject4 = null;
                boolean z16 = false;
                int i30 = 0;
                for (int i31 = 0; i31 < yiVar2.p0.S.size(); i31++) {
                    String str5 = (String) yiVar2.p0.S.get(i31);
                    if (str5 != null) {
                        int lastIndexOf = str5.lastIndexOf(File.separator);
                        String substring = lastIndexOf < 0 ? str5 : str5.substring(lastIndexOf + 1);
                        if (!TextUtils.isEmpty(substring)) {
                            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                            int i32 = i30 + 1;
                            tL_message4.id = i30;
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
                            if (TextUtils.isEmpty(tL_message4.message) && i31 == 0) {
                                z12 = true;
                                z13 = false;
                                CharSequence[] charSequenceArr3 = {yiVar2.m1().getText()};
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
                j3 = j13;
                z11 = z16;
                z10 = false;
            } else {
                jj jjVar = yiVar2.l0;
                if (qiVar == jjVar) {
                    arrayList2.addAll(jjVar.getSelected());
                    if (!arrayList2.isEmpty()) {
                        messageObject4 = (MessageObject) arrayList2.get(0);
                        CharSequence[] charSequenceArr4 = {yiVar2.m1().getText()};
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
        if (arrayList2.isEmpty()) {
            return false;
        }
        w70 F = w70.F(yiVar2.containerView, f6Var, iiVar);
        if (messageObject4 != null) {
            qi qiVar2 = yiVar2.y0;
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (qiVar2 == chatAttachAlertPhotoLayout2 || qiVar2 == yiVar2.q0) {
                dc0 dc0Var = new dc0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), f6Var);
                TLRPC.Message message = messageObject4.messageOwner;
                boolean z17 = yiVar2.c0;
                message.invert_media = z17;
                dc0Var.a(!z17, false);
                dc0Var.setOnClickListener(new bi.q(yiVar2, messageObject4, dc0Var, 13));
                F.q(dc0Var);
                if (yiVar2.H1 == null) {
                    F.k();
                }
            }
        } else {
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        }
        boolean isUserSelf = UserObject.isUserSelf(user);
        if (yiVar2.H1 != null || ((eoVar != null && ChatObject.isMonoForum(eoVar.e)) || ((eoVar == null || !eoVar.D6()) && !yiVar2.y0.c()))) {
            j11 = j3;
        } else {
            j11 = j3;
            F.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new a3.h0(yiVar2, j11, f6Var, 13), false);
        }
        qi qiVar3 = yiVar2.y0;
        if ((qiVar3 == chatAttachAlertPhotoLayout2 || qiVar3 == yiVar2.q0) && qiVar3.getSelectedItemsCount() == 1 && eoVar != null && ChatObject.isMonoForum(eoVar.e)) {
            eoVar2 = eoVar;
            j12 = j11;
            F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new bi.ua(yiVar2, j11, eoVar2, f6Var, 24), false);
        } else {
            j12 = j11;
            eoVar2 = eoVar;
        }
        if (yiVar2.H1 == null && !isUserSelf) {
            F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new jh(yiVar2, 1), false);
        }
        if (yiVar2.H1 == null && z10 && eoVar2 != null && ChatObject.isChannelAndNotMegaGroup(eoVar2.e) && (chatFull = eoVar2.Z7) != null && chatFull.paid_media_allowed) {
            F.c(R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton), null, false);
            org.telegram.ui.ActionBar.g1 y3 = F.y();
            y3.setOnClickListener(new di.o(yiVar2, context, y3, f6Var, 11));
            long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
            if (starsPrice > 0) {
                y3.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                y3.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                y3.setText(LocaleController.getString(R.string.PaidMediaButton));
                y3.setSubtext(null);
            }
            yiVar2.h0.s(starsPrice);
        }
        F.Y();
        yiVar2.h0.p(F);
        yiVar2.h0.q(arrayList2);
        if (yiVar2.H1 == null && j12 >= 0 && z11) {
            yiVar2.h0.d(p2Var);
            yiVar2.h0.o(yiVar2.N0);
        }
        yiVar2.h0.show();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static /* synthetic */ void r(yi yiVar, gf gfVar) {
        AnimatorSet animatorSet = yiVar.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        gfVar.run();
    }

    public static void s(yi yiVar) {
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
        yiVar.Y1(true);
        org.telegram.ui.ActionBar.w0 w0Var = yiVar.c1;
        bi.x4 x4Var = yiVar.d1;
        if (x4Var != null) {
            x4Var.e(true);
        }
        bi.x4 x4Var2 = new bi.x4(yiVar.getContext(), 1);
        yiVar.d1 = x4Var2;
        x4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(!S ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        yiVar.d1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        yiVar.d1.m(1.0f, -((yiVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        yiVar.d1.setTranslationY(yiVar.a1.getTranslationY());
        bi.x4 x4Var3 = yiVar.d1;
        x4Var3.l0 = new ee(3, yiVar, x4Var2);
        yiVar.containerView.addView(x4Var3, w7.a6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        yiVar.d1.u();
    }

    public static /* synthetic */ void t(yi yiVar, boolean z10, jh jhVar) {
        yiVar.y0.s(1.0f);
        yiVar.z0.s(1.0f);
        yiVar.y0.k(yiVar.l2);
        yiVar.z0.k(yiVar.l2);
        yiVar.containerView.invalidate();
        yiVar.X0.setTag(z10 ? 1 : null);
        jhVar.run();
    }

    public static void v(yi yiVar, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        yi yiVar2 = yiVar;
        bi biVar = yiVar2.y1;
        qi[] qiVarArr = yiVar2.w0;
        org.telegram.ui.ActionBar.p2 p2Var = yiVar2.f0;
        org.telegram.ui.ActionBar.p2 R = p2Var == null ? LaunchActivity.R() : p2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (view instanceof si) {
            Activity parentActivity = R.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!yiVar2.L1 && !yiVar2.M1 && yiVar2.a1()) {
                    return;
                }
                if (!yiVar2.L1 && !yiVar2.M1) {
                    ao aoVar = new ao(1, yiVar2.getContext(), f6Var, yiVar2);
                    yiVar2.T = aoVar;
                    yiVar2.Q1(aoVar);
                }
                yiVar2.Q1(yiVar2.j0);
            } else if (intValue == 3) {
                if (!yiVar2.N1 && yiVar2.a1()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(yiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                yiVar2.B1(true);
            } else if (intValue == 4) {
                if (!yiVar2.K1 && yiVar2.a1()) {
                    return;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(yiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                yiVar2.E1(true);
            } else if (intValue == 5) {
                if (!yiVar2.Q1 && yiVar2.a1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && yiVar2.Q1 && yiVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(yiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                yiVar2.D1();
            } else if (intValue == 6) {
                if ((!yiVar2.Q1 && yiVar2.a1()) || !AndroidUtilities.isMapsInstalled(p2Var)) {
                    return;
                }
                if (yiVar2.Q1) {
                    if (yiVar2.o0 == null) {
                        ll llVar = new ll(yiVar2, yiVar2.getContext(), f6Var, (yiVar2.H || yiVar2.R1) ? false : true);
                        yiVar2.o0 = llVar;
                        qiVarArr[5] = llVar;
                        gl glVar = yiVar2.t2;
                        if (glVar != null) {
                            llVar.setDelegate(glVar);
                        } else {
                            llVar.setDelegate(new gh(yiVar2, 9));
                        }
                    }
                    yiVar2.Q1(yiVar2.o0);
                } else {
                    ao aoVar2 = new ao(6, yiVar2.getContext(), f6Var, yiVar2);
                    yiVar2.T = aoVar2;
                    yiVar2.Q1(aoVar2);
                }
            } else if (intValue == 9) {
                if (!yiVar2.O1 && yiVar2.a1()) {
                    return;
                }
                if (yiVar2.O1) {
                    yiVar2.S1(true, null);
                } else {
                    ao aoVar3 = new ao(9, yiVar2.getContext(), f6Var, yiVar2);
                    yiVar2.T = aoVar3;
                    yiVar2.Q1(aoVar3);
                }
            } else if (intValue == 11) {
                if (yiVar2.s0 == null) {
                    gg.n0 n0Var = new gg.n0(yiVar2.getContext(), yiVar2.resourcesProvider, yiVar2);
                    yiVar2.s0 = n0Var;
                    qiVarArr[7] = n0Var;
                    n0Var.setupBlurredSearchField(yiVar2.G2);
                }
                yiVar2.Q1(yiVar2.s0);
            } else if (intValue == 12) {
                if (!yiVar2.P1 && yiVar2.a1()) {
                    return;
                }
                if (yiVar2.P1) {
                    if (yiVar2.n0 == null) {
                        zn znVar = new zn(yiVar, yiVar.getContext(), true, f6Var, null);
                        yiVar2 = yiVar;
                        yiVar2.n0 = znVar;
                        qiVarArr[1] = znVar;
                        znVar.setDelegate(new gh(yiVar2, 10));
                    }
                    yiVar2.Q1(yiVar2.n0);
                } else {
                    ao aoVar4 = new ao(9, yiVar2.getContext(), f6Var, yiVar2);
                    yiVar2.T = aoVar4;
                    yiVar2.Q1(aoVar4);
                }
            } else if (intValue == 13) {
                if (yiVar2.u0 == null) {
                    uk ukVar = new uk(yiVar2, yiVar2.getContext(), f6Var, true);
                    yiVar2.u0 = ukVar;
                    qiVarArr[8] = ukVar;
                    ukVar.setDelegate(yiVar2.a2);
                }
                yiVar2.Q1(yiVar2.u0);
            } else if (intValue == 14) {
                if (yiVar2.t0 == null) {
                    uk ukVar2 = new uk(yiVar2, yiVar2.getContext(), f6Var, false);
                    yiVar2.t0 = ukVar2;
                    qiVarArr[9] = ukVar2;
                    ukVar2.setDelegate(yiVar2.a2);
                }
                yiVar2.Q1(yiVar2.t0);
            } else if (intValue == 16) {
                if (yiVar2.v0 == null) {
                    hi.s sVar = new hi.s(yiVar2.J1, yiVar2.getContext(), f6Var, yiVar2);
                    yiVar2.v0 = sVar;
                    qiVarArr[10] = sVar;
                }
                yiVar2.Q1(yiVar2.v0);
            } else if (view.getTag() instanceof Integer) {
                yiVar2.Z1.A1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, yiVar2.s1(), false, 0L);
            }
        } else if (view instanceof ri) {
            ri riVar = (ri) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = riVar.c;
            if (tL_attachMenuBot == null) {
                yiVar2.Z1.i1(riVar.b);
                yiVar2.dismiss();
            } else if (tL_attachMenuBot.inactive) {
                qj1.a(yiVar2.getContext(), new m4.q0(6, yiVar2, riVar), null);
            } else {
                yiVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int dp = AndroidUtilities.dp(70.0f);
        int i12 = left - dp;
        if (i12 < 0) {
            biVar.v0(i12, 0, null);
            return;
        }
        int i13 = right + dp;
        if (i13 > biVar.getMeasuredWidth()) {
            biVar.v0(i13 - biVar.getMeasuredWidth(), 0, null);
        }
    }

    public static /* synthetic */ void w(yi yiVar) {
        qi qiVar;
        xm xmVar;
        yiVar.t1 = null;
        qi qiVar2 = yiVar.y0;
        if (qiVar2 != yiVar.j0 && (qiVar = yiVar.z0) != (xmVar = yiVar.q0) && qiVar2 != qiVar && qiVar2 != xmVar) {
            yiVar.containerView.removeView(qiVar2);
        }
        yiVar.y0.setVisibility(8);
        yiVar.y0.q();
        yiVar.z0.E();
        yiVar.y0 = yiVar.z0;
        yiVar.z0 = null;
        int[] iArr = yiVar.b2;
        iArr[0] = iArr[1];
        yiVar.H1(yiVar.c0, false);
        yiVar.W1();
    }

    public final void A1(int i10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (i10 != 3) {
            if (i10 == 6 && AndroidUtilities.isMapsInstalled(p2Var)) {
                if (this.o0 == null) {
                    ll llVar = new ll(this, getContext(), this.resourcesProvider, (this.H || this.R1) ? false : true);
                    this.o0 = llVar;
                    this.w0[5] = llVar;
                    gl glVar = this.t2;
                    if (glVar != null) {
                        llVar.setDelegate(glVar);
                    } else if (p2Var instanceof org.telegram.ui.eo) {
                        llVar.setDelegate(new gh(this, 16));
                    }
                }
                Q1(this.o0);
                return;
            }
            return;
        }
        if (this.N1 || !a1()) {
            Activity parentActivity = p2Var != null ? p2Var.getParentActivity() : null;
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
        if (!this.N1 && z10) {
            ao aoVar = new ao(3, getContext(), this.resourcesProvider, this);
            this.T = aoVar;
            Q1(aoVar);
        }
        int i10 = 1;
        if (this.l0 == null) {
            jj jjVar = new jj(getContext(), this.resourcesProvider, this);
            this.l0 = jjVar;
            this.w0[3] = jjVar;
            jjVar.setupBlurredSearchField(this.G2);
            this.l0.setDelegate(new gh(this, 13));
            if (this.H) {
                this.l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            TLRPC.Chat chat = ((org.telegram.ui.eo) p2Var).e;
            jj jjVar2 = this.l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                i10 = -1;
            }
            jjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            Q1(this.l0);
        }
    }

    public final void C1() {
        if (this.r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
            mj mjVar = new mj(context, f6Var, this);
            mjVar.r = AndroidUtilities.dp(80.0f);
            mjVar.w = 3;
            bi.y1 y1Var = new bi.y1(mjVar, context, f6Var, 10);
            mjVar.n = y1Var;
            ya yaVar = new ya(mjVar, context);
            mjVar.v = yaVar;
            y1Var.setAdapter(yaVar);
            y1Var.setClipToPadding(false);
            y1Var.setItemAnimator(null);
            y1Var.setLayoutAnimation(null);
            y1Var.setVerticalScrollBarEnabled(false);
            y1Var.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, mjVar.a));
            mjVar.addView(y1Var, w7.a6.c(-1.0f, -1));
            y1Var.setOnScrollListener(new bi.a2(mjVar, 15));
            ai.q qVar = new ai.q(mjVar, mjVar.r, 1);
            mjVar.s = qVar;
            qVar.O = new bi.i2(mjVar, 2);
            y1Var.setLayoutManager(qVar);
            this.r0 = mjVar;
            mjVar.setDelegate(new fb(this, 1));
        }
        Q1(this.r0);
    }

    public final void D1() {
        if (!this.Q1) {
            ao aoVar = new ao(5, getContext(), this.resourcesProvider, this);
            this.T = aoVar;
            Q1(aoVar);
        }
        if (this.k0 == null) {
            bk bkVar = new bk(getContext(), this.resourcesProvider, this);
            this.k0 = bkVar;
            this.w0[2] = bkVar;
            bkVar.setupBlurredSearchField(this.G2);
            this.k0.setDelegate(new ki(this));
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            TLRPC.Chat chat = ((org.telegram.ui.eo) p2Var).e;
            this.k0.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        Q1(this.k0);
    }

    public final void E1(boolean z10) {
        if (!this.K1 && z10) {
            ao aoVar = new ao(4, getContext(), this.resourcesProvider, this);
            this.T = aoVar;
            Q1(aoVar);
        }
        boolean z11 = false;
        if (this.p0 == null) {
            tk tkVar = new tk(this.N ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.p0 = tkVar;
            this.w0[4] = tkVar;
            tkVar.setDelegate(new li(this));
        }
        int i10 = 1;
        if (this.H) {
            this.p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = this.f0;
            if (p2Var instanceof org.telegram.ui.eo) {
                TLRPC.Chat chat = ((org.telegram.ui.eo) p2Var).e;
                tk tkVar2 = this.p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                    i10 = -1;
                }
                tkVar2.setMaxSelectedFiles(i10);
            } else {
                this.p0.setMaxSelectedFiles(this.S1);
                tk tkVar3 = this.p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                tkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        tk tkVar4 = this.p0;
        tkVar4.d0 = this.N;
        if (z10) {
            Q1(tkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        y7 y7Var = this.X0;
        int i10 = 1;
        if (y7Var.n0) {
            y7Var.h(true);
        }
        this.k0 = null;
        this.s0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        while (true) {
            qi[] qiVarArr = this.w0;
            if (i10 >= qiVarArr.length) {
                T1(false, false);
                super.dismissInternal();
                return;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.m();
                this.containerView.removeView(qiVarArr[i10]);
                qiVarArr[i10] = null;
            }
            i10++;
        }
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
        qi qiVar;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        if (i10 == 2) {
            e1();
            zn znVar = this.m0;
            if (znVar != null && ((qiVar = this.z0) == znVar || this.y0 == znVar)) {
                a2(qiVar == znVar ? 1 : 0);
            }
            zn znVar2 = this.n0;
            if (znVar2 != null) {
                qi qiVar2 = this.z0;
                if (qiVar2 == znVar2 || this.y0 == znVar2) {
                    a2(qiVar2 != znVar2 ? 0 : 1);
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
            ii iiVar = this.I0;
            if (iiVar != null) {
                iiVar.setEphemeralFactor(f7);
                iiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final boolean G1(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        if (this.I1) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
            TLRPC.Chat chat = eoVar.e;
            if (eoVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(this.J1).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + eoVar.a(), !z10).commit();
            }
        }
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f) {
            this.I1 = true;
            this.Z1.A1(7, true, z10, i10, i11, j3, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        qi qiVar = this.y0;
        return d5.b0(this.J1, n12, j1() + (qiVar != null ? qiVar.getSelectedItemsCount() : 1), new Utilities.Callback() { // from class: org.telegram.ui.Components.uh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                yi yiVar = yi.this;
                yiVar.I1 = true;
                yiVar.Z1.A1(7, true, z10, i10, i11, j3, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void H1(boolean z10, boolean z11) {
        this.b.a(z10, z11);
        nu m12 = m1();
        this.c0 = z10;
        nu m13 = m1();
        final boolean z12 = this.D0.getTag() != null;
        qi qiVar = this.y0;
        final boolean z13 = this.c0 && (qiVar == this.j0 || qiVar == this.q0);
        bi.n7 n7Var = this.O0;
        gg.j jVar = this.C0;
        if (z11) {
            n7Var.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = n7Var.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            wr wrVar = wr.h;
            final int i10 = 0;
            duration.setInterpolator(wrVar).setUpdateListener(new hh(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.ih
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
                                yiVar.O0.setVisibility(8);
                            }
                            yiVar.b2();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.b.C0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            jVar.setVisibility(0);
            ViewPropertyAnimator interpolator = jVar.animate().translationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(wrVar);
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
                                yiVar.O0.setVisibility(8);
                            }
                            yiVar.b2();
                            break;
                        default:
                            if (z13 || !z12) {
                                this.b.C0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
        } else {
            n7Var.setVisibility((z13 && z12) ? 0 : 8);
            n7Var.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            b2();
            jVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            jVar.setTranslationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f);
            jVar.setVisibility((z13 || !z12) ? 8 : 0);
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
        AndroidUtilities.runOnUIThread(new jh(this, 0));
    }

    public final void I1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.j0) != null) {
            chatAttachAlertPhotoLayout.Z();
        }
        if (this.H1 == messageObject && this.G1 == i10) {
            return;
        }
        this.H1 = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            i10 = this.H1.isMusic() ? 2 : this.H1.isDocument() ? 1 : 0;
        }
        this.G1 = i10;
        if (this.H1 != null) {
            this.S1 = 1;
            this.T1 = false;
        } else {
            this.S1 = -1;
            this.T1 = true;
        }
        this.A1.l();
        V1(0);
    }

    public final void J1(int i10, boolean z10) {
        if (this.H1 != null) {
            return;
        }
        this.S1 = i10;
        this.T1 = z10;
    }

    public final void K1(float f7) {
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.navBarColor = k10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        getContainer().invalidate();
    }

    public final void L1(String str) {
        this.Q0 = 1;
        this.F = true;
        this.S0 = false;
        this.M1 = false;
        this.x1.setVisibility(8);
        this.j1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout != null) {
            yi yiVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.g1 = (yiVar.Q0 == 0 || yiVar.F) ? false : true;
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
            org.telegram.ui.ActionBar.p2 p2Var = this.f0;
            if ((p2Var instanceof org.telegram.ui.eo) && !((org.telegram.ui.eo) p2Var).u()) {
                z11 = true;
                if (this.y2 != z11) {
                    return;
                }
                if (z11) {
                    MessagesController.getInstance(this.J1).getTonesController().load();
                }
                this.y2 = z11;
                ImageView imageView = this.w;
                imageView.setVisibility(0);
                ImageView imageView2 = this.y;
                imageView2.setVisibility(0);
                ViewPropertyAnimator scaleY = imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f);
                wr wrVar = wr.h;
                scaleY.setInterpolator(wrVar).setDuration(420L).withEndAction(new sh(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(wrVar).setDuration(420L).withEndAction(new sh(this, z11, 2)).start();
                if (z11) {
                    k0 k0Var = this.x;
                    Objects.requireNonNull(k0Var);
                    imageView.postDelayed(new j0(k0Var, 1), 220L);
                    k0 k0Var2 = this.E;
                    Objects.requireNonNull(k0Var2);
                    imageView2.postDelayed(new j0(k0Var2, 1), 220L);
                    return;
                }
                return;
            }
        }
        z11 = false;
        if (this.y2 != z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1(long j3, String str, boolean z10, boolean z11) {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.x0;
        int i10 = 1;
        if (longSparseArray.get(j3) != null && Objects.equals(str, ((di.u4) longSparseArray.get(j3)).getStartCommand())) {
            di.u4 u4Var = (di.u4) longSparseArray.get(j3);
            if (u4Var.H) {
                u4Var.H = false;
            }
            if (longSparseArray.get(j3) != null) {
                ((di.u4) longSparseArray.get(j3)).J.setSwipeOffsetAnimationDisallowed(true);
                R1((qi) longSparseArray.get(j3), -j3, z11);
                if (z10) {
                    di.u4 u4Var2 = (di.u4) longSparseArray.get(j3);
                    TLRPC.User user = MessagesController.getInstance(u4Var2.F).getUser(Long.valueOf(u4Var2.v));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(u4Var2.F).getAttachMenuBots().bots;
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
                        if (tL_attachMenuBot.bot_id == u4Var2.v) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z12 = tL_attachMenuBot.show_in_side_menu;
                    AndroidUtilities.runOnUIThread(new bi.af(16, u4Var2, (z12 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name) : z12 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
            di.u4 u4Var3 = new di.u4(context, f6Var, this);
            int i12 = 2;
            u4Var3.U = new di.j4(u4Var3, i12);
            org.telegram.ui.ActionBar.w0 a2 = u4Var3.b.X0.n().a(0, R.drawable.ic_ab_other);
            u4Var3.K = a2;
            a2.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
            org.telegram.ui.ActionBar.g1 e = a2.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
            u4Var3.L = e;
            e.setVisibility(8);
            a2.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
            org.telegram.ui.ActionBar.g1 e7 = a2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            u4Var3.M = e7;
            e7.setVisibility(8);
            a2.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
            a2.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
            a2.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
            di.n4 n4Var = new di.n4(u4Var3, context, f6Var, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, u4Var3.a));
            u4Var3.n = n4Var;
            di.d3 d3Var = new di.d3(u4Var3, context, i10);
            u4Var3.J = d3Var;
            d3Var.addView(n4Var, w7.a6.c(-1.0f, -1));
            d3Var.setScrollListener(new di.j4(u4Var3, 3));
            d3Var.setScrollEndListener(new di.j4(u4Var3, 4));
            d3Var.setDelegate(new di.m4(u4Var3));
            d3Var.setIsKeyboardVisible(new di.m4(u4Var3));
            u4Var3.addView(d3Var, w7.a6.c(-1.0f, -1));
            di.o4 o4Var = new di.o4(context, f6Var);
            u4Var3.I = o4Var;
            u4Var3.addView(o4Var, w7.a6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            n4Var.setWebViewProgressListener(new bi.a6(u4Var3, i12));
            NotificationCenter.getGlobalInstance().addObserver(u4Var3, NotificationCenter.didSetNewTheme);
            longSparseArray.put(j3, u4Var3);
            ((di.u4) longSparseArray.get(j3)).setDelegate(new ei(this, u4Var3, str, j3));
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
            MessageObject replyingMessageObject = eoVar.Y.getReplyingMessageObject();
            di.u4 u4Var4 = (di.u4) longSparseArray.get(j3);
            long a10 = eoVar.a();
            int i13 = replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0;
            long N8 = eoVar.N8();
            di.n4 n4Var2 = u4Var4.n;
            int i14 = this.J1;
            u4Var4.F = i14;
            u4Var4.w = a10;
            u4Var4.v = j3;
            u4Var4.y = i13;
            u4Var4.E = N8;
            u4Var4.G = str;
            org.telegram.ui.ActionBar.g1 g1Var = u4Var4.M;
            if (g1Var != null) {
                if (MediaDataController.getInstance(i14).canCreateAttachedMenuBotShortcut(j3)) {
                    g1Var.setVisibility(0);
                } else {
                    g1Var.setVisibility(8);
                }
            }
            n4Var2.setBotUser(MessagesController.getInstance(i14).getUser(Long.valueOf(j3)));
            n4Var2.t(i14, j3);
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
                if (N8 != 0) {
                    createReplyInput.monoforum_peer_id = MessagesController.getInstance(i14).getInputPeer(N8);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (N8 != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(i14).getInputPeer(N8);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject p5 = di.n3.p(u4Var4.a, false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i14).sendRequest(tL_messages_requestWebView, new di.k4(u4Var4, i14, 0));
            NotificationCenter.getInstance(i14).addObserver(u4Var4, NotificationCenter.webViewResultSent);
            if (longSparseArray.get(j3) != null) {
            }
        }
        if (longSparseArray.get(j3) != null) {
        }
    }

    public final void O1(org.telegram.ui.ActionBar.p2 p2Var) {
        if ((p2Var instanceof org.telegram.ui.eo) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.eo) p2Var).e)) {
            new wc(this.r1, this.resourcesProvider).f(MessagesController.getInstance(this.J1).captionLengthLimitPremium, new ee(4, this, p2Var)).j();
        }
    }

    public final boolean P1(boolean z10, boolean z11) {
        int i10;
        qi qiVar;
        y7 y7Var;
        this.c.a(z10, true);
        ai aiVar = this.D0;
        if (z10 == (aiVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        aiVar.setTag(z10 ? 1 : null);
        di diVar = this.E0;
        if (diVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(diVar.getEditText());
        }
        diVar.k(true);
        this.P0.k(true);
        ai aiVar2 = this.x1;
        ai aiVar3 = this.H0;
        if (z10) {
            if (!this.N) {
                aiVar.setVisibility(0);
            }
            aiVar3.setVisibility(0);
        } else if (this.S0) {
            aiVar2.setVisibility(0);
        }
        qi qiVar2 = this.y0;
        boolean z12 = (qiVar2 == this.j0 || qiVar2 == this.q0) && this.c0;
        y7 y7Var2 = this.X0;
        bi.n7 n7Var = this.O0;
        gg.j jVar = this.C0;
        ii iiVar = this.I0;
        if (z11) {
            this.M0 = new AnimatorSet();
            if (z12) {
                n7Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(aiVar, (Property<ai, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<gg.j, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                y7Var = y7Var2;
            } else {
                jVar.setVisibility(0);
                y7Var = y7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<gg.j, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(n7Var, (Property<bi.n7, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(aiVar3, (Property<ai, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(aiVar3, (Property<ai, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(aiVar3, (Property<ai, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(iiVar, (Property<ii, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(iiVar, (Property<ii, Float>) property3, z10 ? 1.0f : 0.2f));
            if (y7Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(aiVar, (Property<ai, Float>) View.TRANSLATION_Y, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.S0) {
                arrayList.add(ObjectAnimator.ofFloat(aiVar2, (Property<ai, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(aiVar2, (Property<ai, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new hh(this, 4));
                arrayList.add(ofFloat);
            }
            this.M0.playTogether(arrayList);
            this.M0.setInterpolator(new DecelerateInterpolator());
            this.M0.setDuration(180L);
            this.M0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.M0.start();
            i10 = 0;
        } else {
            aiVar.setAlpha(z10 ? 1.0f : 0.0f);
            jVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            if (!z10 || z12) {
                i10 = 0;
            } else {
                i10 = 0;
                jVar.setVisibility(0);
                jVar.setTranslationY(0.0f);
            }
            aiVar3.setScaleX(z10 ? 1.0f : 0.2f);
            aiVar3.setScaleY(z10 ? 1.0f : 0.2f);
            aiVar3.setAlpha(z10 ? 1.0f : 0.0f);
            n7Var.setVisibility((z10 && z12) ? 0 : 8);
            n7Var.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            iiVar.setScaleX(z10 ? 1.0f : 0.2f);
            iiVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (y7Var2.getTag() != null) {
                aiVar.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
            } else if (this.S0 && ((qiVar = this.y0) == null || qiVar.J())) {
                aiVar2.setTranslationY(z10 ? AndroidUtilities.dp(84.0f) : 0.0f);
            }
            if (!z10) {
                aiVar.setVisibility(4);
                aiVar3.setVisibility(4);
            }
            if (z12) {
                b2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.y0.getSelectedItemsCount());
        }
        iiVar.g(i10, z11);
        iiVar.i(j1() + this.y0.getSelectedItemsCount(), this.H1 != null ? 0L : MessagesController.getInstance(this.J1).getSendPaidMessagesStars(n1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) diVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), iiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            diVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(qi qiVar) {
        long j3 = this.W0;
        ao aoVar = this.T;
        if (qiVar == aoVar) {
            j3 = aoVar.s;
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
        }
        R1(qiVar, j3, true);
    }

    public final void R1(qi qiVar, long j3, boolean z10) {
        im imVar;
        im imVar2;
        int i10;
        bi biVar;
        if (this.t1 == null && this.M0 == null) {
            qi qiVar2 = this.y0;
            if (qiVar2 == qiVar) {
                qiVar2.F();
                return;
            }
            if (qiVar == this.n0 && !UserConfig.getInstance(this.J1).isPremium()) {
                new qg.a1(this.f0, 39, false).show();
                return;
            }
            this.f.a(j3 == 1, z10);
            this.n.i(Long.valueOf(j3), z10);
            this.D1 = false;
            this.B1 = false;
            this.F1 = 0.0f;
            this.E1.setVisibility(8);
            RadialProgressView radialProgressView = this.C1;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            ai aiVar = this.x1;
            aiVar.setAlpha(1.0f);
            aiVar.setTranslationY(this.F1);
            int i11 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.x0;
                if (i11 >= longSparseArray.size()) {
                    break;
                }
                ((di.u4) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
                i11++;
            }
            this.W0 = j3;
            bi biVar2 = this.y1;
            int childCount = biVar2.getChildCount();
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = biVar2.getChildAt(i12);
                if (childAt instanceof si) {
                    si siVar = (si) childAt;
                    biVar = biVar2;
                    siVar.a.e(((long) siVar.b) == siVar.c.W0, true);
                } else {
                    biVar = biVar2;
                    if (childAt instanceof ri) {
                        ((ri) childAt).a(true);
                    }
                }
                i12++;
                biVar2 = biVar;
            }
            int firstOffset = (this.y0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.b2[0];
            this.z0 = qiVar;
            qiVar.getClass();
            boolean z11 = qiVar instanceof hi.s;
            ih.f fVar = this.v1;
            if (fVar != null) {
                fVar.setFadeHeightBottom(z11 ? 0 : AndroidUtilities.dp(48.0f));
            }
            ci ciVar = this.w1;
            if (ciVar != null) {
                ciVar.setVisibility(z11 ? 4 : 0);
            }
            int i13 = this.z0.h() != 0 ? 0 : 4;
            y7 y7Var = this.X0;
            y7Var.setVisibility(i13);
            if (y7Var.n0) {
                y7Var.h(true);
            }
            this.y0.r();
            qi qiVar3 = this.z0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if (qiVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.z0.D(this.y0);
            this.z0.setVisibility(0);
            if (qiVar.getParent() != null) {
                this.containerView.removeView(this.z0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.y0);
            ViewParent parent = this.z0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                qi qiVar4 = this.z0;
                if (qiVar4 != this.o0) {
                    indexOfChild++;
                }
                viewGroup.addView(qiVar4, indexOfChild, w7.a6.c(-1.0f, -1));
            }
            jh jhVar = new jh(this, 3);
            qi qiVar5 = this.y0;
            boolean z12 = qiVar5 instanceof xm;
            mi miVar = this.e0;
            if (z12 || (this.z0 instanceof xm)) {
                int max = Math.max(this.z0.getWidth(), this.y0.getWidth());
                qi qiVar6 = this.z0;
                if (qiVar6 instanceof xm) {
                    qiVar6.setTranslationX(max);
                    qi qiVar7 = this.y0;
                    if ((qiVar7 instanceof ChatAttachAlertPhotoLayout) && (imVar2 = ((ChatAttachAlertPhotoLayout) qiVar7).P) != null) {
                        imVar2.setVisibility(4);
                    }
                } else {
                    this.y0.setTranslationX(-max);
                    qi qiVar8 = this.z0;
                    if (qiVar8 == chatAttachAlertPhotoLayout && (imVar = ((ChatAttachAlertPhotoLayout) qiVar8).P) != null) {
                        imVar.setVisibility(0);
                    }
                }
                this.z0.setAlpha(1.0f);
                this.y0.setAlpha(1.0f);
                if (z10) {
                    qi qiVar9 = this.y0;
                    miVar.getClass();
                    miVar.b(qiVar9, 0.0f);
                    AndroidUtilities.runOnUIThread(new gf(this, qiVar, jhVar, 4));
                } else {
                    boolean z13 = this.z0.getCurrentItemTop() <= qiVar.getButtonsHideOffset();
                    this.y0.s(1.0f);
                    this.z0.s(1.0f);
                    this.y0.k(this.l2);
                    this.z0.k(this.l2);
                    this.containerView.invalidate();
                    qi qiVar10 = this.y0;
                    miVar.getClass();
                    miVar.b(qiVar10, 1.0f);
                    y7Var.setTag(z13 ? 1 : null);
                    jhVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.z0.setAlpha(0.0f);
                this.z0.setTranslationY(AndroidUtilities.dp(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.y0, (Property<qi, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.y0, miVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(y7Var, (Property<y7, Float>) View.ALPHA, y7Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(wr.f);
                animatorSet.addListener(new ji(this, firstOffset, jhVar, 0));
                this.t1 = animatorSet;
                qi qiVar11 = this.y0;
                miVar.getClass();
                miVar.b(qiVar11, 0.0f);
                animatorSet.start();
            } else {
                qiVar5.setAlpha(0.0f);
                jhVar.run();
                a2(0);
                this.containerView.invalidate();
            }
            if (!this.m2 || (qiVar instanceof di.u4)) {
                i10 = 0;
            } else {
                i10 = 0;
                this.m2 = false;
                y7Var.e();
                y7Var.invalidate();
                u1();
            }
            if (j3 == 1 || j3 == 6 || (qiVar instanceof di.u4)) {
                i10 = AndroidUtilities.dp(46.0f);
            } else if (j3 == 4) {
                i10 = AndroidUtilities.dp(84.0f);
            }
            y7Var.setForcedMenuWidth(i10);
        }
    }

    public final void S1(boolean z10, Boolean bool) {
        yi yiVar;
        if (this.m0 == null) {
            yiVar = this;
            zn znVar = new zn(yiVar, getContext(), false, this.resourcesProvider, bool);
            yiVar.m0 = znVar;
            yiVar.w0[1] = znVar;
            znVar.setDelegate(new gh(this, 15));
        } else {
            yiVar = this;
        }
        R1(yiVar.m0, 9L, z10);
    }

    public final void T1(boolean z10, boolean z11) {
        qi qiVar;
        this.d.a(z10, z11);
        y7 y7Var = this.X0;
        if (!(z10 && y7Var.getTag() == null) && (z10 || y7Var.getTag() == null)) {
            return;
        }
        y7Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet = this.Y0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Y0 = null;
        }
        boolean z12 = (this.F || this.T0 || (this.Q0 == 0 && this.q1) || this.y0 != this.j0 || (!this.L1 && !this.M1)) ? false : true;
        if (this.y0 == this.T) {
            z12 = false;
        }
        ai aiVar = this.x1;
        org.telegram.ui.ActionBar.w0 w0Var = this.a1;
        if (z10) {
            if (z12) {
                w0Var.setVisibility(0);
                w0Var.setClickable(true);
            }
        } else if (this.S0 && this.D0.getTag() == null) {
            aiVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (p2Var != null) {
            if (z10) {
                AndroidUtilities.setLightStatusBar(this, i0.a.f(getThemedColor(this.h2 ? org.telegram.ui.ActionBar.j6.tg : org.telegram.ui.ActionBar.j6.h5)) > 0.699999988079071d);
            } else {
                AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
            }
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Y0 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z10 ? 1.0f : 0.0f) - y7Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(y7Var, (Property<y7, Float>) property, z10 ? 1.0f : 0.0f));
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.Y0.playTogether(arrayList);
            this.Y0.addListener(new ai.e(28, this, z10));
            this.Y0.setInterpolator(wr.h);
            this.Y0.setDuration(380L);
            this.Y0.start();
            return;
        }
        if (z10 && this.S0 && ((qiVar = this.y0) == null || qiVar.J())) {
            aiVar.setVisibility(4);
        }
        y7Var.setAlpha(z10 ? 1.0f : 0.0f);
        if (z12) {
            w0Var.setAlpha(z10 ? 1.0f : 0.0f);
            w0Var.setScaleX(z10 ? 1.0f : 0.6f);
            w0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = this.e1;
        if (w0Var2 != null) {
            w0Var2.setVisibility(4);
        }
        if (this.Q0 == 0 && this.q1) {
            return;
        }
        w0Var.setVisibility(4);
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.G0;
        di diVar = this.E0;
        diVar.getLocationOnScreen(iArr);
        if (this.B2 != null) {
            qi qiVar = this.y0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if ((qiVar == chatAttachAlertPhotoLayout || qiVar == this.q0) && this.c0) {
                bi.n7 n7Var = this.O0;
                alpha = (n7Var.getAlpha() * n7Var.getMeasuredHeight()) + (n7Var.getY() - this.B2.getTop());
            } else {
                alpha = -diVar.getHeight();
            }
            if (Math.abs(this.B2.getTranslationY() - alpha) > 0.5f) {
                this.B2.setTranslationY(alpha);
                this.B2.invalidate();
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
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.t1 != null) {
            return;
        }
        int selectedItemsCount = this.y0.getSelectedItemsCount();
        ii iiVar = this.I0;
        if (selectedItemsCount == 0) {
            iiVar.g(0, i10 != 0);
            P1(false, i10 != 0);
        } else {
            if (P1(true, i10 != 0) || i10 == 0) {
                iiVar.g(selectedItemsCount, i10 != 0);
                iiVar.b();
            } else {
                iiVar.g(selectedItemsCount, true);
                iiVar.b();
            }
        }
        this.y0.A(selectedItemsCount);
        d1(i10 != 0);
        if (this.y0 == this.j0 && ((((z10 = (p2Var = this.f0) instanceof org.telegram.ui.eo)) || this.Q0 != 0 || this.T0) && ((selectedItemsCount == 0 && this.q1) || ((selectedItemsCount != 0 || this.Q0 != 0 || this.T0) && !this.q1)))) {
            this.q1 = (selectedItemsCount == 0 && this.Q0 == 0 && !this.T0) ? false : true;
            AnimatorSet animatorSet = this.Z0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.Z0 = null;
            }
            int i11 = this.Q0;
            y7 y7Var = this.X0;
            org.telegram.ui.ActionBar.w0 w0Var = this.e1;
            if (i11 != 0 && w0Var != null && y7Var.getTag() != null && z10) {
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
                if (!ChatObject.isChannel(eoVar.e) || (tL_chatBannedRights = eoVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.q1;
                    ai aiVar = this.i1;
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.a1;
                    if (!z12) {
                        if (this.Q0 == 0 && !this.T0) {
                            w0Var2.setVisibility(0);
                            w0Var2.setClickable(true);
                        }
                        aiVar.setVisibility(0);
                    } else if (y7Var.getTag() != null && w0Var != null) {
                        w0Var.setVisibility(0);
                    }
                    if (i10 != 0) {
                        if (y7Var.getTag() == null && this.Q0 == 0 && !this.T0) {
                            w0Var2.setAlpha(this.q1 ? 1.0f : 0.0f);
                            w0Var2.setScaleX(this.q1 ? 1.0f : 0.6f);
                            w0Var2.setScaleY(this.q1 ? 1.0f : 0.6f);
                        }
                        aiVar.setAlpha(this.q1 ? 1.0f : 0.0f);
                        if (z11) {
                            w0Var.setAlpha(this.q1 ? 0.0f : 1.0f);
                        }
                        if (this.q1 && w0Var != null) {
                            w0Var.setVisibility(4);
                        }
                    } else {
                        this.Z0 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (y7Var.getTag() == null && this.Q0 == 0 && !this.T0) {
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, this.q1 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_X, this.q1 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_Y, this.q1 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(aiVar, (Property<ai, Float>) property, this.q1 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, this.q1 ? 0.0f : 1.0f));
                        }
                        this.Z0.playTogether(arrayList);
                        this.Z0.addListener(new org.telegram.ui.Cells.v5(this, 26));
                        this.Z0.setDuration(180L);
                        this.Z0.start();
                    }
                }
            }
            z11 = false;
            z12 = this.q1;
            ai aiVar2 = this.i1;
            org.telegram.ui.ActionBar.w0 w0Var22 = this.a1;
            if (!z12) {
            }
            if (i10 != 0) {
            }
        }
        Y1(i10 != 0);
        MessageObject messageObject = this.H1;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.J1).getSendPaidMessagesStars(n1()) : 0L;
        qi qiVar = this.y0;
        iiVar.i(j1() + (qiVar != null ? qiVar.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        di diVar = this.E0;
        if (diVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) diVar.getLayoutParams();
            int max = Math.max(AndroidUtilities.dp(48.0f), iiVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                diVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void W1() {
        float f7;
        qi qiVar = this.y0;
        boolean g10 = qiVar == null ? false : qiVar.g();
        ai.t tVar = this.f1;
        tVar.setEnabled(g10);
        qi qiVar2 = this.y0;
        if (qiVar2 != null) {
            f7 = ((qiVar2.g() ? 1.0f : 0.5f) * (this.z0 == null ? 1.0f : this.d0)) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        qi qiVar3 = this.z0;
        if (qiVar3 != null) {
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, this.d0, qiVar3.g() ? 1.0f : 0.5f, f7);
        }
        this.g1 = f7;
        if (tVar != null) {
            float f10 = f7 * this.h1;
            tVar.setAlpha(f10);
            tVar.setVisibility(f10 <= 0.0f ? 4 : 0);
        }
    }

    public final void X1(qi qiVar, int i10) {
        if (qiVar == null) {
            return;
        }
        zg.e eVar = this.C2;
        if (eVar != null && Build.VERSION.SDK_INT >= 31) {
            eVar.f(0.0f, i10);
            Z0();
        }
        int currentItemTop = qiVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = qiVar == this.y0 && currentItemTop <= qiVar.getButtonsHideOffset();
        this.R = z11;
        if (qiVar == this.y0) {
            T1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qiVar.getLayoutParams();
        int D = org.telegram.messenger.em.D(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        qi qiVar2 = this.y0;
        int i11 = qiVar2 == qiVar ? 0 : 1;
        if ((qiVar2 instanceof xm) || (this.z0 instanceof xm)) {
            Object obj = this.t1;
            if ((obj instanceof o1.k) && ((o1.k) obj).f) {
                z10 = true;
            }
        }
        int[] iArr = this.b2;
        int i12 = iArr[i11];
        if (i12 == D && !z10) {
            if (i10 != 0) {
                this.c2 = i12;
            }
        } else {
            this.c2 = i12;
            iArr[i11] = D;
            a2(i11);
            this.containerView.invalidate();
        }
    }

    public final void Y0() {
        if (m1().a.length() <= 0) {
            return;
        }
        this.y0.a(m1().getText());
    }

    public final void Y1(boolean z10) {
        bi.y yVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout == null || (yVar = this.b1) == null) {
            return;
        }
        boolean z11 = this.q1 && this.i0 && this.y0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0();
        boolean z12 = !ChatAttachAlertPhotoLayout.S();
        yVar.f = z12;
        if (!z10) {
            ((d6) yVar.g).a(z12);
        }
        yVar.invalidateSelf();
        org.telegram.ui.ActionBar.w0 w0Var = this.c1;
        if (z10 && this.q1) {
            w0Var.setVisibility(0);
            w0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(wr.h).withEndAction(new sh(this, z11, 0)).start();
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
        zg.e eVar;
        boolean z10;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.C2) == null) {
            return;
        }
        ai aiVar = this.x1;
        ViewGroup viewGroup = this.containerView;
        RectF rectF = this.L2;
        gh.k.c(aiVar, viewGroup, rectF);
        float measuredWidth = this.containerView.getMeasuredWidth();
        float measuredHeight = this.X0.getMeasuredHeight();
        RectF rectF2 = this.K2;
        rectF2.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        rectF2.inset(0.0f, -AndroidUtilities.dp(48.0f));
        rectF.set(0.0f, this.containerView.getMeasuredHeight() - (AndroidUtilities.dp(180.0f) + Math.max(AndroidUtilities.navigationBarHeight, o1())), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        qi qiVar = this.y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (qiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null) {
            yl ylVar = chatAttachAlertPhotoLayout.E;
            if (ylVar.getFastScroll() != null) {
                cl0 fastScroll = ylVar.getFastScroll();
                bh.d dVar = fastScroll.e0;
                RectF rectF3 = this.M2;
                if (dVar != null || fastScroll.f0 != null) {
                    rectF3.set(fastScroll.f0.getBounds());
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(fastScroll.e0.getBounds());
                    rectF3.union(rectF4);
                }
                cl0 fastScroll2 = ylVar.getFastScroll();
                ViewGroup viewGroup2 = this.containerView;
                RectF rectF5 = AndroidUtilities.rectTmp;
                gh.k.c(fastScroll2, viewGroup2, rectF5);
                rectF3.offset(rectF5.left, rectF5.top);
                rectF3.inset(-AndroidUtilities.dp(48.0f), -AndroidUtilities.dp(48.0f));
                rectF3.left = Math.max(0.0f, rectF3.left);
                rectF3.right = Math.min(this.containerView.getMeasuredWidth(), rectF3.right);
                z10 = true;
                int i10 = !z10 ? 3 : 2;
                ArrayList arrayList = this.J2;
                ArrayList arrayList2 = this.N2;
                eVar.g(xf.f0.a(i10, arrayList, arrayList2), arrayList2);
                eVar.e(this.I2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
            }
        }
        z10 = false;
        if (!z10) {
        }
        ArrayList arrayList3 = this.J2;
        ArrayList arrayList22 = this.N2;
        eVar.g(xf.f0.a(i10, arrayList3, arrayList22), arrayList22);
        eVar.e(this.I2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void Z1(boolean z10) {
        qi qiVar = this.j0;
        if (!z10) {
            Q1(qiVar);
            return;
        }
        if (this.M) {
            if (this.q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.r;
                if (f6Var == null) {
                    f6Var = this.resourcesProvider;
                }
                xm xmVar = new xm(context, f6Var, this);
                xmVar.y = 0.0f;
                xmVar.E = 0.0f;
                xmVar.F = 0.0f;
                xmVar.G = 0.0f;
                xmVar.H = 0.0f;
                xmVar.I = 0.0f;
                xmVar.J = null;
                xmVar.K = false;
                xmVar.M = 0.0f;
                xmVar.Q = false;
                xmVar.S = false;
                Point point = AndroidUtilities.displaySize;
                xmVar.T = point.y > point.x;
                xmVar.n = f6Var;
                xmVar.f = true;
                xmVar.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z n10 = xmVar.b.X0.n();
                TextView textView = new TextView(context);
                xmVar.x = textView;
                org.telegram.ui.ActionBar.f6 f6Var2 = xmVar.a;
                dm dmVar = new dm(xmVar, context, n10, f6Var2, 1);
                xmVar.b.X0.addView(dmVar, 0, w7.a6.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                dmVar.addView(textView, w7.a6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                bi.y1 y1Var = new bi.y1(xmVar, context, f6Var2, 13);
                xmVar.r = y1Var;
                y1Var.setAdapter(new org.telegram.ui.w7(xmVar, 3));
                s4.c0 c0Var = new s4.c0(1, false);
                xmVar.s = c0Var;
                y1Var.setLayoutManager(c0Var);
                y1Var.setClipChildren(false);
                y1Var.setClipToPadding(false);
                y1Var.setOverScrollMode(2);
                y1Var.setVerticalScrollBarEnabled(false);
                wm wmVar = new wm(xmVar, context);
                xmVar.v = wmVar;
                wmVar.setClipToPadding(true);
                wmVar.setClipChildren(true);
                xmVar.addView(y1Var, w7.a6.c(-1.0f, -1));
                xmVar.P = xmVar.b.j0;
                wmVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xmVar.P;
                wmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                wmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                wmVar.c();
                UndoView undoView = new UndoView(context, null, false, xmVar.b.r);
                xmVar.w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                xmVar.addView(undoView, w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                xmVar.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.q0 = xmVar;
                xmVar.bringToFront();
            }
            qi qiVar2 = this.y0;
            xm xmVar2 = this.q0;
            if (qiVar2 != xmVar2) {
                qiVar = xmVar2;
            }
            Q1(qiVar);
        }
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        return (p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).K6();
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
        float f7;
        org.telegram.ui.ActionBar.w0 w0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        ai.t tVar;
        float max;
        int i12;
        float f14 = this.d.e;
        qi qiVar = i10 == 0 ? this.y0 : this.z0;
        if (qiVar == null || qiVar.getVisibility() != 0) {
            return;
        }
        int p12 = p1(i10);
        if (qiVar == this.m0 || qiVar == this.n0) {
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
        float alpha = this.X0.getAlpha();
        ai aiVar = this.i1;
        float dp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - aiVar.getAlpha()) * 26.0f);
        boolean z10 = this.q1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.a1;
        bi.n7 n7Var = this.O0;
        if (z10 && this.Q0 == 0 && !this.T0) {
            w0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37), ((p12 - AndroidUtilities.dp((i11 * f14) + 37.0f)) + dp) - (n7Var.getAlpha() * n7Var.getMeasuredHeight())) + this.l2);
        } else {
            w0Var2.setTranslationY(((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37)) + this.l2);
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.c1;
        if (w0Var3 != null) {
            w0Var3.setTranslationY(w0Var2.getTranslationY());
        }
        bi.x4 x4Var = this.d1;
        if (x4Var != null) {
            x4Var.setTranslationY(w0Var2.getTranslationY());
        }
        if (this.F && this.s1) {
            qi qiVar2 = this.z0;
            if (qiVar2 != null && this.y0 != null) {
                f7 = Math.min(qiVar2.getTranslationY(), this.y0.getTranslationY());
            } else if (qiVar2 != null) {
                f7 = qiVar2.getTranslationY();
            }
            w0Var = this.e1;
            if (w0Var != null) {
                w0Var.setTranslationY(((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i11 + 37)) + this.l2);
            }
            float dp2 = ((((p12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.l2) + f7) - (n7Var.getAlpha() * n7Var.getMeasuredHeight());
            this.p1 = dp2;
            aiVar.setTranslationY(Math.max(this.l2, dp2));
            n7Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.l2, (aiVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.p1 + AndroidUtilities.dp(8.0f)));
            if (this.c0) {
                U1();
            }
            g1();
            int i13 = 59;
            if (this.m0 != null) {
                if (AndroidUtilities.isTablet()) {
                    i12 = 63;
                } else {
                    Point point2 = AndroidUtilities.displaySize;
                    i12 = point2.x > point2.y ? 53 : 59;
                }
                zn znVar = this.m0;
                if (znVar == this.z0) {
                    f11 = (znVar.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.d0;
                } else if (znVar == this.y0) {
                    f11 = (znVar.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.z0 == null ? 1.0f : 1.0f - this.d0;
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
                    zn znVar2 = this.n0;
                    if (znVar2 == this.z0) {
                        f13 = (znVar2.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.d0;
                    } else if (znVar2 == this.y0) {
                        f13 = (znVar2.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.z0 == null ? 1.0f : 1.0f - this.d0;
                    }
                    tVar = this.f1;
                    if (tVar != null) {
                        int measuredWidth = LocaleController.isRTL ? (this.containerView.getMeasuredWidth() - tVar.getMeasuredWidth()) - AndroidUtilities.dp(62.0f) : 0;
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
                        tVar.setTranslationY(Math.max(0.0f, max) + this.l2);
                        tVar.setTranslationX(-((measuredWidth * (1.0f - f14)) + AndroidUtilities.dp((7.0f * r5) + 12.0f)));
                    }
                    float max2 = Math.max(f12, f10);
                    this.h1 = max2;
                    if (tVar == null) {
                        float f15 = this.g1 * max2;
                        tVar.setAlpha(f15);
                        tVar.setVisibility(f15 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f12 = 0.0f;
                f13 = 0.0f;
                tVar = this.f1;
                if (tVar != null) {
                }
                float max22 = Math.max(f12, f10);
                this.h1 = max22;
                if (tVar == null) {
                }
            }
            f10 = 0.0f;
            f11 = 0.0f;
            if (this.n0 != null) {
            }
            f12 = 0.0f;
            f13 = 0.0f;
            tVar = this.f1;
            if (tVar != null) {
            }
            float max222 = Math.max(f12, f10);
            this.h1 = max222;
            if (tVar == null) {
            }
        }
        f7 = 0.0f;
        w0Var = this.e1;
        if (w0Var != null) {
        }
        float dp22 = ((((p12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.l2) + f7) - (n7Var.getAlpha() * n7Var.getMeasuredHeight());
        this.p1 = dp22;
        aiVar.setTranslationY(Math.max(this.l2, dp22));
        n7Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.l2, (aiVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.p1 + AndroidUtilities.dp(8.0f)));
        if (this.c0) {
        }
        g1();
        int i132 = 59;
        if (this.m0 != null) {
        }
        f10 = 0.0f;
        f11 = 0.0f;
        if (this.n0 != null) {
        }
        f12 = 0.0f;
        f13 = 0.0f;
        tVar = this.f1;
        if (tVar != null) {
        }
        float max2222 = Math.max(f12, f10);
        this.h1 = max2222;
        if (tVar == null) {
        }
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (!(p2Var instanceof org.telegram.ui.eo)) {
            return false;
        }
        return ChatActivityEnterView.I(this.J1, ((org.telegram.ui.eo) p2Var).a(), p2Var, charSequence);
    }

    public final void b2() {
        int i10 = 0;
        a2(0);
        this.r1.invalidate();
        bi.n7 n7Var = this.O0;
        n7Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout != null) {
            yl ylVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (ylVar != null && ylVar.getFastScroll() != null) {
                cl0 fastScroll = ylVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1;
                if (this.c0) {
                    i10 = (int) (n7Var.getAlpha() * n7Var.getMeasuredHeight());
                }
                fastScroll.h0 = currentActionBarHeight + i10;
                ylVar.getFastScroll().invalidate();
            }
        }
        U1();
        g1();
    }

    public final void c1() {
        bi biVar = this.y1;
        if (biVar == null) {
            return;
        }
        int childCount = biVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            biVar.getChildAt(i10);
        }
        boolean z10 = this.h2;
        this.j1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
        this.o1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
        this.f1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        int themedColor = getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5);
        org.telegram.ui.ActionBar.w0 w0Var = this.a1;
        w0Var.setIconColor(themedColor);
        org.telegram.ui.ActionBar.j6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.ig : org.telegram.ui.ActionBar.j6.I5), w0Var.getBackground());
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        w0Var.G(getThemedColor(i11), false);
        w0Var.G(getThemedColor(i11), true);
        w0Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.c1;
        if (w0Var2 != null) {
            w0Var2.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.e1;
        if (w0Var3 != null) {
            w0Var3.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
            org.telegram.ui.ActionBar.j6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.ig : org.telegram.ui.ActionBar.j6.I5), w0Var3.getBackground());
        }
        di diVar = this.E0;
        org.telegram.ui.ActionBar.f6 f6Var = diVar.M;
        iu iuVar = diVar.a;
        int i12 = diVar.L;
        if (i12 == 0) {
            iuVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            iuVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
            iuVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        } else if (i12 == 2 || i12 == 3) {
            iuVar.setHintTextColor(-1929379841);
            iuVar.setTextColor(-1);
            iuVar.setCursorColor(-1);
            iuVar.setHandlesColor(-1);
            iuVar.setHighlightColor(822083583);
            iuVar.quoteColor = -1;
        } else {
            iuVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.t5, f6Var));
            iuVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        }
        diVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
        ju juVar = diVar.d;
        if (juVar != null) {
            juVar.U();
        }
        biVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        int themedColor2 = getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5);
        y7 y7Var = this.X0;
        y7Var.C(themedColor2, false);
        y7Var.A(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.ig : org.telegram.ui.ActionBar.j6.I5), false);
        y7Var.setTitleColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.j6.w1(q12, this.shadowDrawable);
        eh.c cVar = this.F2;
        if (cVar.a.getColor() != q12) {
            cVar.a(q12);
            ih.f fVar = this.v1;
            if (fVar != null) {
                fVar.invalidate();
            }
            ci ciVar = this.w1;
            if (ciVar != null) {
                ciVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i14 = 0;
        while (true) {
            qi[] qiVarArr = this.w0;
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
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
            return;
        }
        this.navBarColorKey = -1;
        this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.j6.i5);
        AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.j6.h5), false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithTouchOutside() {
        return this.y0.b();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.k kVar = this.p2;
            if (kVar != null) {
                kVar.c();
            }
            AnimatorSet animatorSet2 = this.q2;
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (p2Var == null || !(p2Var instanceof org.telegram.ui.eo)) {
            return;
        }
        org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
        nu nuVar = this.c0 ? this.P0 : this.E0;
        String obj = nuVar != null ? nuVar.getText().toString() : null;
        if (this.H1 == null) {
            qi qiVar = this.y0;
            z11 = true;
            if (qiVar != null) {
            }
            if (xf.u.g(this.J1).e(obj, eoVar.d8) <= 0) {
                MessageObject messageObject = eoVar.n5;
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
                this.K = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
            }
        } else {
            vi viVar = this.A1;
            if (viVar != null) {
                viVar.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, org.telegram.ui.ActionBar.l2
    public final void dismiss(boolean z10) {
        if (z10) {
            this.A2 = z10;
        }
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public void dismissInternal() {
        wi wiVar = this.Z1;
        if (wiVar != null) {
            wiVar.y0(new jh(this, 2));
        } else {
            F1();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.y0.o(i10);
    }

    public final void e1() {
        float f7 = this.c.e;
        this.w1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - ((1.0f - this.b.e) * f7)));
    }

    public final void f1() {
        h20.d(this.F0, com.google.android.gms.internal.vision.e2.C(this.e.e, this.f.e, xf.f0.b(this.h.e), this.R1 ? 0.0f : 1.0f));
    }

    @Override // org.telegram.ui.ActionBar.b3
    public final boolean g() {
        return true;
    }

    public final void g1() {
        ii iiVar = this.I0;
        ai aiVar = this.H0;
        bi.n7 n7Var = this.O0;
        if (n7Var == null || n7Var.getVisibility() != 0 || n7Var.getAlpha() == 0.0f) {
            aiVar.setTranslationY(this.g2);
            iiVar.setAlpha(1.0f);
            return;
        }
        float f7 = this.b.e;
        float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
        iiVar.setAlpha(abs * abs * abs * abs);
        aiVar.setTranslationY(AndroidUtilities.lerp(this.g2, ((n7Var.getTranslationY() + n7Var.getTop()) - aiVar.getTop()) + AndroidUtilities.dp(8.0f), wr.j.getInterpolation(f7)));
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.w0;
            if (i10 >= qiVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.i5));
                return arrayList;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null && (themeDescriptions = qiVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i10++;
        }
    }

    public final void h1(int i10) {
        this.S0 = true;
        this.x1.setVisibility(0);
        this.H = true;
        this.I = i10;
        this.Q0 = 0;
        this.F = false;
        this.G = false;
        this.J = null;
        org.telegram.ui.ActionBar.w0 w0Var = this.k1;
        if (w0Var != null) {
            this.j1.setTranslationY(0.0f);
            w0Var.setVisibility(8);
        }
    }

    public final void i1(ai.c0 c0Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.j1;
        textView.setText(string);
        this.S0 = false;
        this.x1.setVisibility(8);
        this.Q0 = 1;
        this.F = true;
        this.G = true;
        this.i0 = false;
        this.J = c0Var;
        org.telegram.ui.ActionBar.w0 w0Var = this.k1;
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (!(p2Var instanceof org.telegram.ui.eo) || (messagePreviewParams = ((org.telegram.ui.eo) p2Var).f5) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        return p2Var instanceof org.telegram.ui.eo ? ((org.telegram.ui.eo) p2Var).e : MessagesController.getInstance(this.J1).getChat(Long.valueOf(-this.Z));
    }

    public final float l1() {
        return r0.getMeasuredHeight() - ((1.0f - this.D0.getAlpha()) * (r0.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final nu m1() {
        qi qiVar;
        return (this.c0 && ((qiVar = this.y0) == this.j0 || qiVar == this.q0)) ? this.P0 : this.E0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        return p2Var instanceof org.telegram.ui.eo ? ((org.telegram.ui.eo) p2Var).a() : this.Z;
    }

    public final int o1() {
        qi qiVar = this.y0;
        zn znVar = this.m0;
        if (qiVar == znVar && znVar.E != null) {
            return znVar.getEmojiPadding();
        }
        zn znVar2 = this.n0;
        return (qiVar != znVar2 || znVar2.E == null) ? this.c0 ? this.P0.getEmojiPadding() : this.E0.getEmojiPadding() : znVar2.getEmojiPadding();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        if (this.S.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        y7 y7Var = this.X0;
        if (y7Var.n0) {
            y7Var.h(true);
            return;
        }
        if (this.y0.i()) {
            return;
        }
        if (m1() == null || !m1().e) {
            super.onBackPressed();
        } else {
            m1().k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.y0.l(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        q91 q91Var = chatAttachAlertPhotoLayout.l0;
        bi.ld ldVar = chatAttachAlertPhotoLayout.j0;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        yl ylVar = chatAttachAlertPhotoLayout.r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        boolean z10 = i14 < i15;
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == ldVar) {
            if (z10) {
                if (ylVar.getVisibility() == 0) {
                    ldVar.layout(0, org.telegram.messenger.a2.B(222.0f, i13, i16), i14, org.telegram.messenger.a2.B(96.0f, i13, i16));
                    return true;
                }
                ldVar.layout(0, org.telegram.messenger.a2.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            }
            if (ylVar.getVisibility() == 0) {
                ldVar.layout(org.telegram.messenger.a2.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            }
            ldVar.layout(org.telegram.messenger.a2.B(126.0f, i12, i16), 0, i12, i15 - i16);
            return true;
        }
        if (view == q91Var) {
            if (z10) {
                if (ylVar.getVisibility() == 0) {
                    q91Var.layout(0, org.telegram.messenger.a2.B(310.0f, i13, i16), i14, org.telegram.messenger.a2.B(260.0f, i13, i16));
                    return true;
                }
                q91Var.layout(0, org.telegram.messenger.a2.B(176.0f, i13, i16), i14, org.telegram.messenger.a2.B(126.0f, i13, i16));
                return true;
            }
            if (ylVar.getVisibility() == 0) {
                q91Var.layout(org.telegram.messenger.a2.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            }
            q91Var.layout(org.telegram.messenger.a2.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
            return true;
        }
        if (view != textView) {
            if (view != ylVar) {
                return false;
            }
            if (z10) {
                int B = org.telegram.messenger.a2.B(88.0f, i15, i16);
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
            if (ylVar.getVisibility() == 0) {
                dp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = dp3 - i16;
        } else {
            dp = i12 - AndroidUtilities.dp(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
            textView.setRotation(-90.0f);
            if (ylVar.getVisibility() == 0) {
                dp -= AndroidUtilities.dp(96.0f);
            }
        }
        textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        nm nmVar = chatAttachAlertPhotoLayout.v;
        yl ylVar = chatAttachAlertPhotoLayout.r;
        fg.a0 a0Var = chatAttachAlertPhotoLayout.s;
        boolean z10 = i10 < i11;
        im imVar = chatAttachAlertPhotoLayout.P;
        if (view != imVar) {
            bi.ld ldVar = chatAttachAlertPhotoLayout.j0;
            if (view == ldVar) {
                if (z10) {
                    ldVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30));
                    return true;
                }
                ldVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            q91 q91Var = chatAttachAlertPhotoLayout.l0;
            if (view == q91Var) {
                if (z10) {
                    q91Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                    return true;
                }
                q91Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            if (view == ylVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    ylVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
                    if (a0Var.o != 0) {
                        ylVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        a0Var.j1(0);
                        nmVar.l();
                    }
                } else {
                    ylVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                    if (a0Var.o != 1) {
                        ylVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        a0Var.j1(1);
                        nmVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.b0 && !chatAttachAlertPhotoLayout.d0) {
            imVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onCustomOpenAnimation() {
        this.j0.setTranslationX(0.0f);
        this.n1.setAlpha(0.0f);
        this.l1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.q2 = animatorSet;
        int i10 = 2;
        mi miVar = this.o2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, miVar, 0.0f, 400.0f));
        this.q2.setDuration(400L);
        this.q2.setStartDelay(20L);
        miVar.set(this, Float.valueOf(0.0f));
        this.q2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new hh(this, i10));
        o1.k kVar = this.p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(this.containerView, o1.h.n, 0.0f);
        this.p2 = kVar2;
        if (this.H1 != null) {
            kVar2.u.a(0.75f);
            this.p2.u.b(350.0f);
        } else {
            kVar2.u.a(0.75f);
            this.p2.u.b(350.0f);
        }
        this.p2.f();
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
        int i11 = 3;
        gf gfVar = new gf(this, animationNotificationsLocker, this.delegate, i11);
        this.p2.a(new di.q4(i10, this, gfVar));
        this.currentSheetAnimation.addListener(new bi.u3(20, this, gfVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new hh(this, i11));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(wr.f);
        ofFloat2.start();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onDismissWithTouchOutside() {
        if (this.y0.p()) {
            dismiss();
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.y0.C(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onOpenAnimationEnd() {
        if (this.f0 instanceof org.telegram.ui.eo) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.y0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.s1 = true;
        if (this.M1 || this.L1) {
            return;
        }
        a1();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
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

    public final int p1(int i10) {
        qi qiVar = this.z0;
        int[] iArr = this.b2;
        return (qiVar == null || !((this.y0 instanceof xm) || (qiVar instanceof xm))) ? iArr[i10] : AndroidUtilities.lerp(iArr[0], iArr[1], this.d0);
    }

    public final int q1(boolean z10) {
        y7 y7Var;
        if (this.h2) {
            return getThemedColor(org.telegram.ui.ActionBar.j6.tg);
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        Iterator it = this.n.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            long longValue = ((Long) gVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f7 += gVar.c();
            }
        }
        float a10 = w7.q.a(f7, 0.0f, 1.0f);
        if (z10 && (y7Var = this.X0) != null && y7Var.getVisibility() == 0) {
            a10 *= 1.0f - y7Var.getAlpha();
        }
        return i0.a.d(a10, getThemedColor(org.telegram.ui.ActionBar.j6.h5), getThemedColor(a2 ? org.telegram.ui.ActionBar.j6.a7 : org.telegram.ui.ActionBar.j6.i5));
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
        yi yiVar;
        im imVar;
        MediaController.AlbumEntry albumEntry;
        qi qiVar;
        this.N0 = 0L;
        this.I0.setEffect(0L);
        int i10 = 0;
        this.D1 = false;
        this.B1 = false;
        this.F1 = 0.0f;
        this.E1.setVisibility(8);
        RadialProgressView radialProgressView = this.C1;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        ai aiVar = this.x1;
        aiVar.setAlpha(1.0f);
        aiVar.setTranslationY(0.0f);
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.x0;
            if (i11 >= longSparseArray.size()) {
                break;
            }
            ((di.u4) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
            i11++;
        }
        int i12 = this.Q0;
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (i12 != 2) {
            if (p2Var instanceof org.telegram.ui.eo) {
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
                chat = eoVar.e;
                user = eoVar.i();
            } else {
                long j3 = this.Z;
                int i13 = this.J1;
                if (j3 >= 0) {
                    user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.Z));
                    chat = null;
                } else if (j3 < 0) {
                    chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-this.Z));
                    user = null;
                }
            }
            z10 = p2Var instanceof org.telegram.ui.eo;
            if ((z10 && this.Q0 != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.L1 = ChatObject.canSendPhoto(chat);
                    this.M1 = ChatObject.canSendVideo(chat);
                    this.N1 = ChatObject.canSendMusic(chat);
                    this.O1 = ChatObject.canSendPolls(chat);
                    this.P1 = !ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.canSendPolls(chat);
                    this.Q1 = ChatObject.canSendPlain(chat);
                    this.K1 = ChatObject.canSendDocument(chat);
                } else {
                    this.O1 = UserObject.isBot(user) || UserObject.isUserSelf(user);
                    this.P1 = !z10 || ((org.telegram.ui.eo) p2Var).h == null;
                }
            }
            if (this.R1) {
                this.O1 = false;
                this.P1 = false;
            }
            di diVar = this.E0;
            if (z10 || this.Q0 == 2) {
                diVar.setVisibility(this.W ? 0 : 4);
            }
            boolean z11 = this.M1;
            boolean z12 = this.L1;
            boolean z13 = this.K1;
            chatAttachAlertPhotoLayout = this.j0;
            yiVar = chatAttachAlertPhotoLayout.b;
            tz tzVar = chatAttachAlertPhotoLayout.H;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z11;
            chatAttachAlertPhotoLayout.x0 = z12;
            chatAttachAlertPhotoLayout.z0 = z13;
            imVar = chatAttachAlertPhotoLayout.P;
            if (imVar != null) {
                imVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.P.setEnabled(chatAttachAlertPhotoLayout.v0);
            }
            if (!((yiVar.f0 instanceof org.telegram.ui.eo) && yiVar.k1() == null) && yiVar.Q0 == 0) {
                chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
                if (chatAttachAlertPhotoLayout.v0) {
                    tzVar.setText(LocaleController.getString(R.string.NoPhotos));
                    tzVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat k12 = yiVar.k1();
                    tzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    if (ChatObject.isActionBannedByDefault(k12, 7)) {
                        tzVar.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else if (AndroidUtilities.isBannedForever(k12.banned_rights)) {
                        tzVar.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                    } else {
                        tzVar.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(k12.banned_rights.until_date)));
                    }
                }
            } else if (chatAttachAlertPhotoLayout.q0()) {
                chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
            } else {
                chatAttachAlertPhotoLayout.U0 = MediaController.allPhotosAlbumEntry;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                chatAttachAlertPhotoLayout.P0 = chatAttachAlertPhotoLayout.e0();
            }
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
                if (tzVar != null) {
                    tzVar.c();
                }
            }
            chatAttachAlertPhotoLayout.u0();
            diVar.k(true);
            this.P0.k(true);
            this.u1 = false;
            setFocusable(false);
            if (!this.O || this.P) {
                if (this.o0 == null) {
                    ll llVar = new ll(this, getContext(), this.resourcesProvider, (this.H || this.P || this.R1) ? false : true);
                    this.o0 = llVar;
                    this.w0[5] = llVar;
                    gl glVar = this.t2;
                    if (glVar != null) {
                        llVar.setDelegate(glVar);
                    } else {
                        llVar.setDelegate(new gh(this, i10));
                    }
                }
                this.W0 = 5L;
                qiVar = this.o0;
            } else if (this.N) {
                E1(false);
                qiVar = this.p0;
                this.W0 = 4L;
            } else {
                MessageObject messageObject = this.H1;
                if (messageObject != null) {
                    int i15 = this.G1;
                    if (i15 == -1) {
                        this.S0 = true;
                        if (messageObject.isMusic()) {
                            B1(false);
                            qiVar = this.l0;
                            this.W0 = 3L;
                        } else if (this.H1.isDocument()) {
                            E1(false);
                            qiVar = this.p0;
                            this.W0 = 4L;
                        } else {
                            this.W0 = 1L;
                        }
                    } else {
                        if (i15 == 2) {
                            B1(false);
                            qiVar = this.l0;
                            this.W0 = 3L;
                        } else if (i15 == 1) {
                            E1(false);
                            qiVar = this.p0;
                            this.W0 = 4L;
                        } else {
                            this.W0 = 1L;
                            qiVar = chatAttachAlertPhotoLayout;
                        }
                        this.S0 = false;
                    }
                } else {
                    this.S0 = this.Q0 == 0 && !this.T0;
                    this.W0 = 1L;
                }
                qiVar = chatAttachAlertPhotoLayout;
            }
            aiVar.setVisibility(this.S0 ? 0 : 8);
            if (this.y0 != qiVar) {
                y7 y7Var = this.X0;
                if (y7Var.n0) {
                    y7Var.h(true);
                }
                this.containerView.removeView(this.y0);
                this.y0.r();
                this.y0.setVisibility(8);
                this.y0.q();
                this.y0 = qiVar;
                this.allowNestedScroll = true;
                if (qiVar.getParent() == null) {
                    this.containerView.addView(this.y0, 0, w7.a6.c(-1.0f, -1));
                }
                qiVar.setAlpha(1.0f);
                qiVar.setVisibility(0);
                qiVar.D(null);
                qiVar.E();
                y7Var.setVisibility(qiVar.h() != 0 ? 0 : 4);
                H1(this.c0, false);
                W1();
            }
            if (this.y0 != chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            V1(0);
            this.A1.l();
            m1().setText("");
            this.z1.h1(0, MediaController.VIDEO_BITRATE_480);
        }
        user = null;
        chat = null;
        z10 = p2Var instanceof org.telegram.ui.eo;
        if (z10) {
            if (chat != null) {
            }
            if (this.R1) {
            }
            di diVar2 = this.E0;
            if (z10) {
            }
            diVar2.setVisibility(this.W ? 0 : 4);
            boolean z112 = this.M1;
            boolean z122 = this.L1;
            boolean z132 = this.K1;
            chatAttachAlertPhotoLayout = this.j0;
            yiVar = chatAttachAlertPhotoLayout.b;
            tz tzVar2 = chatAttachAlertPhotoLayout.H;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z112;
            chatAttachAlertPhotoLayout.x0 = z122;
            chatAttachAlertPhotoLayout.z0 = z132;
            imVar = chatAttachAlertPhotoLayout.P;
            if (imVar != null) {
            }
            if (yiVar.f0 instanceof org.telegram.ui.eo) {
            }
            chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
            if (chatAttachAlertPhotoLayout.v0) {
            }
            if (Build.VERSION.SDK_INT >= 23) {
            }
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
            this.P0.k(true);
            this.u1 = false;
            setFocusable(false);
            if (this.O) {
            }
            if (this.o0 == null) {
            }
            this.W0 = 5L;
            qiVar = this.o0;
            aiVar.setVisibility(this.S0 ? 0 : 8);
            if (this.y0 != qiVar) {
            }
            if (this.y0 != chatAttachAlertPhotoLayout) {
            }
            V1(0);
            this.A1.l();
            m1().setText("");
            this.z1.h1(0, MediaController.VIDEO_BITRATE_480);
        }
        if (chat != null) {
        }
        if (this.R1) {
        }
        di diVar22 = this.E0;
        if (z10) {
        }
        diVar22.setVisibility(this.W ? 0 : 4);
        boolean z1122 = this.M1;
        boolean z1222 = this.L1;
        boolean z1322 = this.K1;
        chatAttachAlertPhotoLayout = this.j0;
        yiVar = chatAttachAlertPhotoLayout.b;
        tz tzVar22 = chatAttachAlertPhotoLayout.H;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.v0 = z14;
        chatAttachAlertPhotoLayout.w0 = z1122;
        chatAttachAlertPhotoLayout.x0 = z1222;
        chatAttachAlertPhotoLayout.z0 = z1322;
        imVar = chatAttachAlertPhotoLayout.P;
        if (imVar != null) {
        }
        if (yiVar.f0 instanceof org.telegram.ui.eo) {
        }
        chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
        if (chatAttachAlertPhotoLayout.v0) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
        }
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
        this.P0.k(true);
        this.u1 = false;
        setFocusable(false);
        if (this.O) {
        }
        if (this.o0 == null) {
        }
        this.W0 = 5L;
        qiVar = this.o0;
        aiVar.setVisibility(this.S0 ? 0 : 8);
        if (this.y0 != qiVar) {
        }
        if (this.y0 != chatAttachAlertPhotoLayout) {
        }
        V1(0);
        this.A1.l();
        m1().setText("");
        this.z1.h1(0, MediaController.VIDEO_BITRATE_480);
    }

    public final boolean s1() {
        if (!this.c0) {
            return false;
        }
        qi qiVar = this.y0;
        return qiVar == this.j0 || qiVar == this.q0;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean shouldOverlayCameraViewOverNavBar() {
        qi qiVar = this.y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        return qiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.i1;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        this.I1 = false;
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            this.calcMandatoryInsets = ((org.telegram.ui.eo) p2Var).x9();
        }
        W1();
        this.s1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.m2) {
            this.m2 = false;
            y7 y7Var = this.X0;
            y7Var.e();
            y7Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        wi wiVar = this.Z1;
        if (wiVar == null || this.u1) {
            return;
        }
        boolean e02 = wiVar.e0();
        this.u1 = true;
        AndroidUtilities.runOnUIThread(new bi.c1(this, editTextBoldCursor, z10, 17), e02 ? 200L : 0L);
    }

    public final void u1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int q12 = q1(false);
        org.telegram.ui.ActionBar.j6.w1(q12, this.shadowDrawable);
        eh.c cVar = this.F2;
        if (cVar.a.getColor() != q12) {
            cVar.a(q12);
            ih.f fVar = this.v1;
            if (fVar != null) {
                fVar.invalidate();
            }
            ci ciVar = this.w1;
            if (ciVar != null) {
                ciVar.invalidate();
            }
        }
        W1();
        this.containerView.invalidate();
    }

    public final void v1() {
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.w0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.m();
            }
            i10++;
        }
        int i11 = this.J1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        di diVar = this.E0;
        if (diVar != null) {
            diVar.o();
        }
        gi giVar = this.P0;
        if (giVar != null) {
            giVar.o();
        }
    }

    public final void w1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String userName = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : UserObject.getUserName(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.J1).getAttachMenuBots().bots;
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
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        d2Var.T = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 21));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void x1() {
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.w0;
            if (i10 >= qiVarArr.length) {
                this.f2 = true;
                return;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.x();
            }
            i10++;
        }
    }

    public final void y1() {
        int i10 = 0;
        this.f2 = false;
        while (true) {
            qi[] qiVarArr = this.w0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null) {
                qiVar.z();
            }
            i10++;
        }
        if (isShowing()) {
            this.Z1.e0();
        }
        vi viVar = this.A1;
        if (viVar != null) {
            viVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.H1;
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        int i10 = this.J1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.H1.getDialogId()) && (p2Var instanceof org.telegram.ui.eo)) {
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
            MessageSuggestionParams messageSuggestionParams = eoVar.g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.H1.messageOwner.suggested_post);
            }
            if (!xh.v5.U(i10, messageSuggestionParams.amount)) {
                eoVar.Tb(messageSuggestionParams);
                return;
            }
        }
        if (this.K - this.L < 0) {
            AndroidUtilities.shakeView(this.s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.I0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (MessagesController.getInstance(i10).premiumFeaturesBlocked() || MessagesController.getInstance(i10).captionLengthLimitPremium <= this.L) {
                return;
            }
            O1(p2Var);
            return;
        }
        if (this.H1 == null && (p2Var instanceof org.telegram.ui.eo)) {
            org.telegram.ui.eo eoVar2 = (org.telegram.ui.eo) p2Var;
            if (eoVar2.c()) {
                d5.M(getContext(), eoVar2.a(), new gh(this, 12), this.resourcesProvider);
                return;
            }
        }
        qi qiVar = this.y0;
        if (qiVar == this.j0 || qiVar == this.q0) {
            G1(0, true, 0, s1(), this.N0);
            return;
        }
        if (qiVar.I(0, true, 0, s1(), this.N0)) {
            return;
        }
        this.A2 = true;
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        if (this.y0.n() || isDismissed()) {
            return;
        }
        di diVar = this.E0;
        if (diVar != null) {
            AndroidUtilities.hideKeyboard(diVar.getEditText());
        }
        gi giVar = this.P0;
        if (giVar != null) {
            AndroidUtilities.hideKeyboard(giVar.getEditText());
        }
        this.x0.clear();
        org.telegram.ui.ActionBar.p2 p2Var = this.f0;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        if (!this.A2 && p2Var != null && this.y0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.z2) {
                return;
            }
            this.z2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new gh(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new mh(this, 0));
            d1 d1Var = new d1(this, 4);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.N = d1Var;
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            qi[] qiVarArr = this.w0;
            if (i10 >= qiVarArr.length) {
                break;
            }
            qi qiVar = qiVarArr[i10];
            if (qiVar != null && this.y0 != qiVar) {
                qiVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.a7), 0), true, (AndroidUtilities.IntColorCallback) new gh(this, 11));
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
        this.i2 = false;
        super.dismiss();
        this.A2 = false;
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }

    public yi(Activity activity, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, boolean z11) {
        this(activity, p2Var, z10, z11, true, null);
    }
}

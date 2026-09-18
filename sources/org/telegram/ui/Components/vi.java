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
import org.telegram.ui.kj1;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public class vi extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.z2, le.d {
    public static final /* synthetic */ int O2 = 0;
    public final ch.d A0;
    public final si A1;
    public boolean A2;
    public final ch.d B0;
    public boolean B1;
    public ci.i B2;
    public final hg.j C0;
    public final RadialProgressView C1;
    public final ah.i C2;
    public final xh D0;
    public boolean D1;
    public final fh.d D2;
    public final i0 E;
    public final ai E0;
    public final p6 E1;
    public final fh.d E2;
    public boolean F;
    public final ImageView F0;
    public float F1;
    public final fh.c F2;
    public boolean G;
    public final int[] G0;
    public int G1;
    public final ah.c G2;
    public boolean H;
    public final xh H0;
    public MessageObject H1;
    public final ah.c H2;
    public int I;
    public final fi I0;
    public boolean I1;
    public final kh I2;
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
    public final ci.n6 O0;
    public boolean O1;
    public boolean P;
    public final di P0;
    public boolean P1;
    public s40 Q;
    public int Q0;
    public boolean Q1;
    public boolean R;
    public qt R0;
    public boolean R1;
    public final be0 S;
    public boolean S0;
    public int S1;
    public vn T;
    public boolean T0;
    public boolean T1;
    public u40 U;
    public boolean U0;
    public boolean U1;
    public boolean V;
    public final float V0;
    public float V1;
    public boolean W;
    public long W0;
    public float W1;
    public fk X;
    public final y7 X0;
    public ValueAnimator X1;
    public dj Y;
    public AnimatorSet Y0;
    public int Y1;
    public long Z;
    public AnimatorSet Z0;
    public ti Z1;
    public boolean a0;
    public final org.telegram.ui.ActionBar.v0 a1;
    public fn a2;
    public final le.b b;
    public final ah.e b0;
    public final ci.u b1;
    public final int[] b2;
    public final le.b c;
    public boolean c0;
    public final org.telegram.ui.ActionBar.v0 c1;
    public int c2;
    public final le.b d;
    public float d0;
    public ci.f4 d1;
    public float d2;
    public final le.b e;
    public final ji e0;
    public final org.telegram.ui.ActionBar.v0 e1;
    public float e2;
    public final le.b f;
    public final org.telegram.ui.ActionBar.n2 f0;
    public final bi.o f1;
    public boolean f2;
    public final boolean g0;
    public float g1;
    public float g2;
    public final le.b h;
    public mf h0;
    public float h1;
    public final boolean h2;
    public boolean i0;
    public final xh i1;
    public boolean i2;
    public final ChatAttachAlertPhotoLayout j0;
    public final TextView j1;
    public final ArrayList j2;
    public yj k0;
    public final org.telegram.ui.ActionBar.v0 k1;
    public final Rect k2;
    public gj l0;
    public final LinearLayout l1;
    public float l2;
    public un m0;
    public final ImageView m1;
    public boolean m2;
    public final le.l n;
    public un n0;
    public final LinearLayout n1;
    public int n2;
    public gl o0;
    public final TextView o1;
    public final ji o2;
    public ok p0;
    public float p1;
    public o1.k p2;
    public qm q0;
    public boolean q1;
    public AnimatorSet q2;
    public org.telegram.ui.xn r;
    public jj r0;
    public final li r1;
    public boolean r2;
    public final p6 s;
    public hg.i0 s0;
    public boolean s1;
    public boolean s2;
    public pk t0;
    public Object t1;
    public bl t2;
    public pk u0;
    public boolean u1;
    public boolean u2;
    public final p6 v;
    public ii.r v0;
    public final jh.f v1;
    public boolean v2;
    public final ImageView w;
    public final ni[] w0;
    public final zh w1;
    public File w2;
    public final i0 x;
    public final LongSparseArray x0;
    public final xh x1;
    public double[] x2;
    public final ImageView y;
    public ni y0;
    public final yh y1;
    public boolean y2;
    public ni z0;
    public final s4.c0 z1;
    public boolean z2;

    public vi(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        org.telegram.ui.ActionBar.v0 v0Var;
        TextPaint textPaint;
        float f7;
        bi.o oVar;
        qr qrVar = qr.h;
        this.b = new le.b(0, this, qrVar, 380L, false);
        this.c = new le.b(1, this, qrVar, 380L, false);
        this.d = new le.b(2, this, qrVar, 380L, false);
        this.e = new le.b(3, this, qrVar, 380L, false);
        this.f = new le.b(4, this, qrVar, 380L, true);
        this.h = new le.b(5, this, qrVar, 320L, false);
        le.l lVar = new le.l(new dh(this, 1), qrVar, 380L);
        this.n = lVar;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.d0 = 0.0f;
        this.e0 = new ji(this, 0);
        this.i0 = false;
        ni[] niVarArr = new ni[11];
        this.w0 = niVarArr;
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
        this.o2 = new ji(this, 1);
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
        fh.c cVar = new fh.c();
        this.F2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        int i11 = 9;
        if (Build.VERSION.SDK_INT >= 31) {
            this.C2 = new ah.i(false);
            fh.d dVar = new fh.d(null);
            this.E2 = dVar;
            dVar.k(new ka.c(this, i11));
            fh.d dVar2 = new fh.d(null);
            this.D2 = dVar2;
            dVar2.k(new k2.u(this, 12));
            ah.c cVar2 = new ah.c(dVar);
            this.G2 = cVar2;
            cVar2.i = LiteMode.isEnabled(262144);
            ah.c cVar3 = new ah.c(dVar2);
            this.H2 = cVar3;
            cVar3.i = LiteMode.isEnabled(262144);
        } else {
            this.C2 = null;
            this.D2 = null;
            this.E2 = null;
            this.G2 = new ah.c(cVar);
            this.H2 = new ah.c(cVar);
        }
        ah.c cVar4 = new ah.c(cVar);
        this.I2 = new kh(this, 0);
        this.h2 = z10;
        this.g0 = (n2Var instanceof org.telegram.ui.zn) && n2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f0 = n2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        li liVar = new li(this, context);
        this.r1 = liVar;
        liVar.setDelegate(new mi(this));
        this.containerView = liVar;
        liVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i12, 0, i12, 0);
        y7 y7Var = new y7(this, context, e6Var, 1);
        this.X0 = y7Var;
        y7Var.T0 = true;
        y7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        y7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        int i13 = org.telegram.ui.ActionBar.j6.j5;
        y7Var.B(getThemedColor(i13), false);
        int i14 = org.telegram.ui.ActionBar.j6.I5;
        y7Var.A(getThemedColor(i14), false);
        y7Var.setTitleColor(getThemedColor(i13));
        y7Var.setOccupyStatusBar(true);
        y7Var.setAlpha(0.0f);
        y7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 8));
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i13), false, e6Var);
        this.a1 = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setIcon(R.drawable.ic_ab_other);
        v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        final int i15 = 4;
        v0Var2.setVisibility(4);
        v0Var2.setAlpha(0.0f);
        v0Var2.setScaleX(0.6f);
        v0Var2.setScaleY(0.6f);
        v0Var2.setSubMenuOpenSide(2);
        v0Var2.setDelegate(new dh(this, 8));
        v0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        v0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        v0Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i14), 6, -1));
        v0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.q4 q4Var;
                switch (i15) {
                    case 0:
                        vi viVar = this.b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.H1(!z14, true);
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
                        vi.s(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.y0;
                        if (niVar != null) {
                            niVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.Z1(viVar4.y0 != viVar4.q0);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i13), false, e6Var);
        this.c1 = v0Var3;
        v0Var3.setLongClickEnabled(false);
        ci.u uVar = new ci.u();
        this.b1 = uVar;
        v0Var3.setIcon(uVar);
        v0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var3.setVisibility(8);
        v0Var3.setAlpha(0.0f);
        v0Var3.setScaleX(0.6f);
        v0Var3.setScaleY(0.6f);
        v0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        v0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        v0Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i14), 6, -1));
        final int i16 = 5;
        v0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.q4 q4Var;
                switch (i16) {
                    case 0:
                        vi viVar = this.b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.H1(!z14, true);
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
                        vi.s(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.y0;
                        if (niVar != null) {
                            niVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.Z1(viVar4.y0 != viVar4.q0);
                        break;
                }
            }
        });
        bi.o oVar2 = new bi.o(this, context);
        oVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        oVar2.setText(LocaleController.getString(R.string.Create));
        oVar2.setTypeface(AndroidUtilities.bold());
        oVar2.setTextSize(1, 14.0f);
        oVar2.setVisibility(4);
        oVar2.setAlpha(0.0f);
        oVar2.setGravity(17);
        oVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        oVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        final int i17 = 6;
        oVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.q4 q4Var;
                switch (i17) {
                    case 0:
                        vi viVar = this.b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.H1(!z14, true);
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
                        vi.s(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.y0;
                        if (niVar != null) {
                            niVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.Z1(viVar4.y0 != viVar4.q0);
                        break;
                }
            }
        });
        w7.a6.a(oVar2);
        this.f1 = oVar2;
        W1();
        if (n2Var != null) {
            textPaint = textPaint2;
            v0Var = v0Var3;
            oVar = oVar2;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.v0 v0Var4 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i13), false, e6Var);
            this.e1 = v0Var4;
            v0Var4.setLongClickEnabled(false);
            v0Var4.setIcon(R.drawable.outline_header_search);
            v0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            v0Var4.setVisibility(4);
            v0Var4.setAlpha(0.0f);
            v0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            v0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i14), 6, -1));
            v0Var4.setOnClickListener(new ai.j3(5, this, z11));
        } else {
            v0Var = v0Var3;
            textPaint = textPaint2;
            f7 = 14.0f;
            oVar = oVar2;
        }
        org.telegram.ui.ActionBar.v0 v0Var5 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i13), false, e6Var);
        this.k1 = v0Var5;
        v0Var5.setLongClickEnabled(false);
        v0Var5.setIcon(R.drawable.ic_ab_other);
        v0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var5.setVisibility(8);
        v0Var5.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i14), 3, -1));
        final int i18 = 2;
        v0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        final vi viVar = this.b;
                        ai aiVar = viVar.E0;
                        if (aiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(viVar.getContext(), e6Var);
                            e0Var.m0(aiVar.getText());
                            final int i19 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i19) {
                                        case 0:
                                            ai aiVar2 = viVar.E0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            di diVar = viVar.P0;
                                            diVar.setText(charSequence);
                                            diVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = viVar.Z;
                            boolean z13 = viVar.H1 != null;
                            mh mhVar = new mh(viVar, 0);
                            e0Var.l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.n0 = mhVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final vi viVar2 = this.b;
                        di diVar = viVar2.P0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(viVar2.getContext(), e6Var);
                            e0Var2.m0(diVar.getText());
                            final int i20 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            ai aiVar2 = viVar2.E0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            di diVar2 = viVar2.P0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = viVar2.Z;
                            boolean z14 = viVar2.H1 != null;
                            mh mhVar2 = new mh(viVar2, 1);
                            e0Var2.l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = mhVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        vi viVar3 = this.b;
                        viVar3.k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = viVar3.f0;
                        t12.J2(null, n2Var2, e6Var);
                        PhotoViewer.t1().K2(viVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i21 = viVar3.S1;
                        boolean z15 = viVar3.T1;
                        t13.h = i21;
                        t13.n = z15;
                        if (!viVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(viVar3.getContainer().findFocus());
                        }
                        File w10 = ci.o8.w(viVar3.J1, "webp");
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
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new wh(viVar3, photoEntry), n2Var2 instanceof org.telegram.ui.zn ? (org.telegram.ui.zn) n2Var2 : null);
                        if (viVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, viVar3.J);
                            break;
                        }
                        break;
                }
            }
        });
        v0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        v0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        final int i19 = 7;
        v0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.q4 q4Var;
                switch (i19) {
                    case 0:
                        vi viVar = this.b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.H1(!z14, true);
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
                        vi.s(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.y0;
                        if (niVar != null) {
                            niVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.Z1(viVar4.y0 != viVar4.q0);
                        break;
                }
            }
        });
        xh xhVar = new xh(this, context, 0);
        this.i1 = xhVar;
        final int i20 = 8;
        xhVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.q4 q4Var;
                switch (i20) {
                    case 0:
                        vi viVar = this.b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.H1(!z14, true);
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
                        vi.s(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.y0;
                        if (niVar != null) {
                            niVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.Z1(viVar4.y0 != viVar4.q0);
                        break;
                }
            }
        });
        xhVar.setAlpha(0.0f);
        xhVar.setVisibility(4);
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
        linearLayout.addView(textView, w7.y5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.m1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.y5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        xhVar.addView(linearLayout, w7.y5.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.y5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.o1 = textView2;
        textView2.setTextColor(getThemedColor(i13));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.y5.q(-2, -2, 16));
        xhVar.addView(linearLayout2, w7.y5.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, e6Var);
        this.j0 = chatAttachAlertPhotoLayout;
        niVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.y0 = chatAttachAlertPhotoLayout;
        this.W0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.y5.c(-1.0f, -1));
        jh.f fVar = new jh.f(context);
        this.v1 = fVar;
        fVar.setup(cVar4);
        fVar.setFadeTopAlpha(0);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(fVar, w7.y5.g());
        this.containerView.addView(xhVar, w7.y5.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ci.n6 n6Var = new ci.n6(context, 8);
        this.O0 = n6Var;
        this.containerView.addView(n6Var, w7.y5.e(-1, -2, 55));
        this.containerView.addView(y7Var, w7.y5.c(-2.0f, -1));
        this.containerView.addView(v0Var2, w7.y5.e(48, 48, 53));
        this.containerView.addView(v0Var, w7.y5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var6 = this.e1;
        if (v0Var6 != null) {
            this.containerView.addView(v0Var6, w7.y5.e(48, 48, 53));
        }
        xhVar.addView(v0Var5, w7.y5.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(oVar, w7.y5.e(-2, 48, 53));
        xh xhVar2 = new xh(this, context, 1);
        this.x1 = xhVar2;
        yh yhVar = new yh(context, 0);
        this.y1 = yhVar;
        yhVar.setClipChildren(true);
        yhVar.setClipToPadding(false);
        si siVar = new si(this, context);
        this.A1 = siVar;
        yhVar.setAdapter(siVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.z1 = c0Var;
        yhVar.setLayoutManager(c0Var);
        yhVar.setVerticalScrollBarEnabled(false);
        yhVar.setHorizontalScrollBarEnabled(false);
        yhVar.setItemAnimator(null);
        yhVar.setLayoutAnimation(null);
        yhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        yhVar.z2 = true;
        yhVar.setOverScrollMode(2);
        ah.c cVar5 = this.G2;
        hh.k kVar = new hh.k(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        cVar5.f = kVar;
        cVar5.g = viewGroup2;
        ah.c cVar6 = this.H2;
        hh.k kVar2 = new hh.k(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        cVar6.f = kVar2;
        cVar6.g = viewGroup3;
        hh.k kVar3 = new hh.k(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        cVar4.f = kVar3;
        cVar4.g = viewGroup4;
        zh zhVar = new zh(this, context, 0);
        this.w1 = zhVar;
        ah.e eVar = new ah.e(cVar4.c(zhVar, null, false));
        this.b0 = eVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        eVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(zhVar, w7.y5.g());
        ch.d c10 = this.G2.c(xhVar2, eh.b.f(e6Var), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        xhVar2.setBackground(c10);
        yhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        yhVar.setClipToOutline(true);
        int dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(28.0f);
        ai.k2 k2Var = yf.k0.a;
        yhVar.setOutlineProvider(new yf.i0(dp, dp2));
        yhVar.setImportantForAccessibility(1);
        xhVar2.addView(yhVar, w7.y5.g());
        this.containerView.addView(xhVar2, w7.y5.e(-1, 70, 81));
        yhVar.setOnItemClickListener(new ai.o6(9, this, e6Var));
        yhVar.setOnItemLongClickListener(new dh(this, 3));
        final int i21 = 0;
        p6 p6Var = new p6(context, true, false, true);
        this.E1 = p6Var;
        p6Var.setVisibility(8);
        p6Var.setAlpha(0.0f);
        p6Var.setGravity(17);
        p6Var.setTypeface(AndroidUtilities.bold());
        int dp3 = AndroidUtilities.dp(16.0f);
        p6Var.setPadding(dp3, 0, dp3, 0);
        p6Var.setTextSize(AndroidUtilities.dp(f7));
        p6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.q4 q4Var;
                switch (i21) {
                    case 0:
                        vi viVar = this.b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.H1(!z14, true);
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
                        vi.s(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.y0;
                        if (niVar != null) {
                            niVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.Z1(viVar4.y0 != viVar4.q0);
                        break;
                }
            }
        });
        this.containerView.addView(p6Var, w7.y5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.y5.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
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
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.q4 q4Var;
                switch (i22) {
                    case 0:
                        vi viVar = this.b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.H1(!z14, true);
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
                        vi.s(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.y0;
                        if (niVar != null) {
                            niVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.Z1(viVar4.y0 != viVar4.q0);
                        break;
                }
            }
        });
        xh xhVar3 = new xh(this, context, 2);
        this.D0 = xhVar3;
        hg.j jVar = new hg.j(this, context);
        this.C0 = jVar;
        xhVar3.addView(jVar, w7.y5.e(-1, -1, 119));
        ch.d c11 = this.H2.c(liVar, eh.b.o(e6Var), false);
        this.A0 = c11;
        c11.m = true;
        c11.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.u(AndroidUtilities.dp(32.0f));
        c11.j.g = 0.4f;
        c11.k();
        ch.d c12 = this.G2.c(jVar, eh.b.o(e6Var), false);
        this.B0 = c12;
        c12.q(AndroidUtilities.dp(22.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        jVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        xhVar3.setWillNotDraw(false);
        xhVar3.setVisibility(4);
        xhVar3.setAlpha(0.0f);
        this.containerView.addView(xhVar3, w7.y5.e(-1, -2, 83));
        xhVar3.setOnTouchListener(new bi.d(13));
        p6 p6Var2 = new p6(context, false, false, false);
        this.s = p6Var2;
        p6Var2.setAllowCancel(true);
        p6Var2.setScaleProperty(0.6f);
        p6Var2.setVisibility(8);
        p6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i23 = org.telegram.ui.ActionBar.j6.y6;
        p6Var2.setTextColor(getThemedColor(i23));
        p6Var2.setTypeface(AndroidUtilities.bold());
        p6Var2.setGravity(17);
        jVar.addView(p6Var2, w7.y5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.w = imageView4;
        i0 i0Var = new i0(context);
        this.x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i24 = org.telegram.ui.ActionBar.j6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i24), mode));
        int i25 = org.telegram.ui.ActionBar.j6.i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i25), 1, AndroidUtilities.dp(16.0f)));
        jVar.addView(imageView4, w7.y5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.a6.a(imageView4);
        final int i26 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i26) {
                    case 0:
                        final vi viVar = this.b;
                        ai aiVar = viVar.E0;
                        if (aiVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(viVar.getContext(), e6Var);
                            e0Var.m0(aiVar.getText());
                            final int i192 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            ai aiVar2 = viVar.E0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            di diVar2 = viVar.P0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = viVar.Z;
                            boolean z13 = viVar.H1 != null;
                            mh mhVar = new mh(viVar, 0);
                            e0Var.l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.n0 = mhVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final vi viVar2 = this.b;
                        di diVar = viVar2.P0;
                        if (diVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(viVar2.getContext(), e6Var);
                            e0Var2.m0(diVar.getText());
                            final int i202 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            ai aiVar2 = viVar2.E0;
                                            aiVar2.setText(charSequence);
                                            aiVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            di diVar2 = viVar2.P0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = viVar2.Z;
                            boolean z14 = viVar2.H1 != null;
                            mh mhVar2 = new mh(viVar2, 1);
                            e0Var2.l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = mhVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        vi viVar3 = this.b;
                        viVar3.k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = viVar3.f0;
                        t12.J2(null, n2Var2, e6Var);
                        PhotoViewer.t1().K2(viVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i212 = viVar3.S1;
                        boolean z15 = viVar3.T1;
                        t13.h = i212;
                        t13.n = z15;
                        if (!viVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(viVar3.getContainer().findFocus());
                        }
                        File w10 = ci.o8.w(viVar3.J1, "webp");
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
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new wh(viVar3, photoEntry), n2Var2 instanceof org.telegram.ui.zn ? (org.telegram.ui.zn) n2Var2 : null);
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
        ai aiVar = new ai(this, context, liVar, e6Var);
        this.E0 = aiVar;
        aiVar.J = true;
        aiVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        aiVar.s();
        aiVar.getEditText().setLayoutParams(w7.y5.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        aiVar.getEditText().addTextChangedListener(new ci(this));
        jVar.addView(aiVar, w7.y5.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        jVar.setClipChildren(false);
        xhVar3.setClipChildren(false);
        aiVar.setClipChildren(false);
        n6Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        n6Var.setWillNotDraw(false);
        di diVar = new di(this, context, liVar, e6Var);
        this.P0 = diVar;
        diVar.J = true;
        diVar.getEditText().addTextChangedListener(new ei(this, n2Var));
        diVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        diVar.getEditText().setLayoutParams(w7.y5.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        diVar.getEditText().setTextSize(1, 17.0f);
        diVar.getEmojiButton().setLayoutParams(w7.y5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        diVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        n6Var.addView(diVar, w7.y5.e(-1, -2, 119));
        n6Var.setAlpha(0.0f);
        n6Var.setVisibility(8);
        aiVar.addView(imageView3, w7.y5.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        ch.d c13 = this.G2.c(n6Var, eh.b.o(e6Var), false);
        c13.q(AndroidUtilities.dp(22.0f));
        c13.p(AndroidUtilities.dp(7.0f));
        n6Var.setBackground(c13);
        n6Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        p6 p6Var3 = new p6(context, false, false, false);
        this.v = p6Var3;
        p6Var3.setScaleProperty(0.6f);
        p6Var3.setVisibility(8);
        p6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var3.setTextColor(getThemedColor(i23));
        p6Var3.setTypeface(AndroidUtilities.bold());
        p6Var3.setGravity(17);
        p6Var3.setAllowCancel(true);
        n6Var.addView(p6Var3, w7.y5.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Xd), mode2));
        diVar.addView(imageView5, w7.y5.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i27 = 2;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.q4 q4Var;
                switch (i27) {
                    case 0:
                        vi viVar = this.b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.H1(!z14, true);
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
                        vi.s(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.y0;
                        if (niVar != null) {
                            niVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.Z1(viVar4.y0 != viVar4.q0);
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
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i24), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i25), 1, AndroidUtilities.dp(16.0f)));
        n6Var.addView(imageView6, w7.y5.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.a6.a(imageView6);
        final int i28 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ih
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i28) {
                    case 0:
                        final vi viVar = this.b;
                        ai aiVar2 = viVar.E0;
                        if (aiVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(viVar.getContext(), e6Var);
                            e0Var.m0(aiVar2.getText());
                            final int i192 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            ai aiVar22 = viVar.E0;
                                            aiVar22.setText(charSequence);
                                            aiVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            di diVar2 = viVar.P0;
                                            diVar2.setText(charSequence);
                                            diVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = viVar.Z;
                            boolean z13 = viVar.H1 != null;
                            mh mhVar = new mh(viVar, 0);
                            e0Var.l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.n0 = mhVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final vi viVar2 = this.b;
                        di diVar2 = viVar2.P0;
                        if (diVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(viVar2.getContext(), e6Var);
                            e0Var2.m0(diVar2.getText());
                            final int i202 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.lh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            ai aiVar22 = viVar2.E0;
                                            aiVar22.setText(charSequence);
                                            aiVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            di diVar22 = viVar2.P0;
                                            diVar22.setText(charSequence);
                                            diVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = viVar2.Z;
                            boolean z14 = viVar2.H1 != null;
                            mh mhVar2 = new mh(viVar2, 1);
                            e0Var2.l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = mhVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        vi viVar3 = this.b;
                        viVar3.k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = viVar3.f0;
                        t12.J2(null, n2Var2, e6Var);
                        PhotoViewer.t1().K2(viVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i212 = viVar3.S1;
                        boolean z15 = viVar3.T1;
                        t13.h = i212;
                        t13.n = z15;
                        if (!viVar3.Z1.c0()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(viVar3.getContainer().findFocus());
                        }
                        File w10 = ci.o8.w(viVar3.J1, "webp");
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
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new wh(viVar3, photoEntry), n2Var2 instanceof org.telegram.ui.zn ? (org.telegram.ui.zn) n2Var2 : null);
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
        this.H0 = xhVar4;
        xhVar4.setFocusable(true);
        xhVar4.setFocusableInTouchMode(true);
        xhVar4.setVisibility(4);
        xhVar4.setScaleX(0.2f);
        xhVar4.setScaleY(0.2f);
        xhVar4.setAlpha(0.0f);
        xhVar4.setClipChildren(false);
        xhVar4.setClipToPadding(false);
        this.containerView.addView(xhVar4, w7.y5.e(110, 50, 85));
        fi fiVar = new fi(R.drawable.send_plane_24, context, e6Var, this);
        this.I0 = fiVar;
        fiVar.setImportantForAccessibility(2);
        xhVar4.addView(fiVar, w7.y5.e(-1, -1, 119));
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
        final int i29 = 3;
        fiVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hh
            public final /* synthetic */ vi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.q4 q4Var;
                switch (i29) {
                    case 0:
                        vi viVar = this.b;
                        long j3 = viVar.W0;
                        if (j3 < 0 && (q4Var = (ei.q4) viVar.x0.get(-j3)) != null) {
                            org.telegram.ui.web.d1 webViewContainer = q4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        vi viVar2 = this.b;
                        boolean z13 = viVar2.c0;
                        if (!z13) {
                            viVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        vi viVar3 = this.b;
                        boolean z14 = viVar3.c0;
                        if (z14) {
                            viVar3.H1(!z14, true);
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
                        vi.s(this.b);
                        break;
                    case 6:
                        ni niVar = this.b.y0;
                        if (niVar != null) {
                            niVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.k1.M(null, null);
                        break;
                    default:
                        vi viVar4 = this.b;
                        viVar4.Z1(viVar4.y0 != viVar4.q0);
                        break;
                }
            }
        });
        fiVar.setOnLongClickListener(new org.telegram.ui.hg(this, context, e6Var, n2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        zh zhVar2 = new zh(this, context, 1);
        zhVar2.setAlpha(0.0f);
        zhVar2.setScaleX(0.2f);
        zhVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        dl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        ah.c cVar7 = this.G2;
        dh.e o9 = eh.b.o(e6Var);
        wl0 wl0Var = fastScroll.o0;
        ch.d c14 = cVar7.c(wl0Var.f1, o9, false);
        fastScroll.e0 = c14;
        c14.p(AndroidUtilities.dp(4.0f));
        fastScroll.e0.q(AndroidUtilities.dp(24.0f));
        ch.d c15 = cVar7.c(wl0Var.f1, o9, false);
        fastScroll.f0 = c15;
        c15.p(AndroidUtilities.dp(6.0f));
        fastScroll.f0.u(AndroidUtilities.dp(4.0f));
        fastScroll.f0.q(AndroidUtilities.dp(f7));
        be0 be0Var = new be0(context);
        this.S = be0Var;
        this.containerView.addView(be0Var, w7.y5.c(-1.0f, -1));
        dh.e eVar2 = new dh.e(e6Var);
        eVar2.e = new dh(this, 4);
        eVar2.c = new dh(this, 5);
        eVar2.d = new dh(this, 6);
        eVar2.b = new dh(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar2.n = dpf2;
        eVar2.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar2.f = dpf23;
        eVar2.h = dpf24;
        y7Var.M(this.G2, eVar2, false);
        lVar.i(1L, false);
    }

    public static void M(vi viVar) {
        int i10;
        y7 y7Var = viVar.X0;
        jh.f fVar = viVar.v1;
        if (fVar == null || y7Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = viVar.resourcesProvider;
        boolean a2 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        if (y7Var.getVisibility() == 0) {
            i10 = (int) (y7Var.getAlpha() * (a2 ? 255 : 160));
        } else {
            i10 = 0;
        }
        fVar.setFadeTopAlpha(i10);
    }

    public static void Q(vi viVar) {
        ci.i iVar = new ci.i(viVar, viVar.getContext(), viVar.Z, LaunchActivity.R(), viVar.resourcesProvider, 1);
        viVar.B2 = iVar;
        iVar.p(new n2.e(viVar, 6));
        ViewGroup viewGroup = viVar.containerView;
        viewGroup.addView(viVar.B2, viewGroup.indexOfChild(viVar.D0), w7.y5.e(-1, -1, 83));
        ci.i iVar2 = viVar.B2;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
            gg.k1 adapter = iVar2.getAdapter();
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
        viVar.U1();
    }

    public static /* synthetic */ void m(vi viVar, ValueAnimator valueAnimator) {
        viVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.d3 d3Var = viVar.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
    }

    public static /* synthetic */ void n(vi viVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.z2 z2Var) {
        viVar.currentSheetAnimation = null;
        viVar.p2 = null;
        animationNotificationsLocker.unlock();
        viVar.currentSheetAnimationType = 0;
        if (z2Var != null) {
            z2Var.onOpenAnimationEnd();
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

    public static /* synthetic */ void o(vi viVar, int i10) {
        viVar.navBarColorKey = -1;
        viVar.navBarColor = i10;
        viVar.containerView.invalidate();
    }

    public static void p(vi viVar) {
        o1.k kVar = viVar.p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(viVar.containerView, o1.h.n, 0.0f);
        viVar.p2 = kVar2;
        kVar2.u.a(1.5f);
        viVar.p2.u.b(1500.0f);
        viVar.p2.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x0484, code lost:
    
        if (r27 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0486, code lost:
    
        r27.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x048a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x048b, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04ad, code lost:
    
        if (r27 == null) goto L194;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean q(vi viVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.n2 n2Var, View view) {
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
        String str;
        long j10;
        Throwable th2;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor;
        int i10;
        Throwable th3;
        String str2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        long j11;
        org.telegram.ui.zn znVar2;
        long j12;
        TLRPC.ChatFull chatFull;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        vi viVar2 = viVar;
        fi fiVar = viVar2.I0;
        org.telegram.ui.ActionBar.n2 n2Var2 = viVar2.f0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = viVar2.j0;
        int i12 = viVar2.J1;
        long j13 = viVar2.Z;
        if ((j13 == 0 && !(n2Var2 instanceof org.telegram.ui.zn)) || viVar2.K - viVar2.L < 0 || viVar2.h.f) {
            return false;
        }
        if (n2Var2 instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn znVar3 = (org.telegram.ui.zn) n2Var2;
            TLRPC.User i13 = znVar3.i();
            MessageObject messageObject5 = znVar3.n5;
            MessageObject messageObject6 = znVar3.k5;
            if (znVar3.c() || znVar3.R3 == 5) {
                return false;
            }
            messageObject2 = messageObject6;
            messageObject = messageObject5;
            znVar = znVar3;
            user = i13;
            j13 = znVar3.a();
        } else {
            user = MessagesController.getInstance(i12).getUser(Long.valueOf(j13));
            messageObject = null;
            messageObject2 = null;
            znVar = null;
        }
        mf mfVar = viVar2.h0;
        if (mfVar != null) {
            mfVar.dismiss();
        }
        mf mfVar2 = new mf(viVar2, context, e6Var, 1);
        viVar2.h0 = mfVar2;
        mfVar2.r(fiVar, false, new ai.d0(viVar2, n2Var, e6Var, 16));
        ArrayList arrayList2 = new ArrayList();
        ni niVar = viVar2.y0;
        if (niVar == chatAttachAlertPhotoLayout3 || niVar == viVar2.q0) {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.isEmpty()) {
                z10 = false;
                z11 = false;
                messageObject3 = null;
            } else {
                String str3 = "";
                int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                MessageObject messageObject7 = null;
                int i14 = 0;
                int i15 = 0;
                z10 = false;
                z11 = false;
                while (i14 < ceil) {
                    int i16 = i14 * 10;
                    MessageObject messageObject8 = messageObject7;
                    MessageObject messageObject9 = messageObject2;
                    int i17 = ceil;
                    int min = Math.min(10, selectedPhotos.size() - i16);
                    HashMap<Object, Object> hashMap2 = selectedPhotos;
                    long nextLong = Utilities.random.nextLong();
                    int i18 = i15;
                    int i19 = i14;
                    int i20 = 0;
                    while (i20 < min) {
                        int i21 = min;
                        int i22 = i16 + i20;
                        int i23 = i20;
                        if (i22 >= selectedPhotosOrder.size()) {
                            j10 = j13;
                            str = str3;
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
                            str = str3;
                            tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                            tL_message.peer_id = MessagesController.getInstance(i12).getPeer(j13);
                            boolean z15 = photoEntry.isVideo;
                            if (z15 || (str2 = photoEntry.imagePath) == null) {
                                String str4 = photoEntry.path;
                                if (str4 != null) {
                                    tL_message.attachPath = str4;
                                }
                            } else {
                                tL_message.attachPath = str2;
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
                                                    try {
                                                        mediaMetadataRetriever3.setDataSource(open.getFileDescriptor(), photoEntry.livePhotoVideoOffset, file.length() - photoEntry.livePhotoVideoOffset);
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        i10 = 0;
                                                        photoEntry.videoOrientation = i10;
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
                                                    i10 = 0;
                                                    photoEntry.videoOrientation = i10;
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
                            String charSequence2 = charSequence == null ? str : charSequence.toString();
                            tL_message.message = charSequence2;
                            if (TextUtils.isEmpty(charSequence2) && i19 == 0 && i23 == 0) {
                                CharSequence[] charSequenceArr = {viVar2.m1().getText()};
                                MessageObject.addLinks(true, charSequenceArr[0]);
                                tL_message.entities = MediaDataController.getInstance(i12).getEntities(charSequenceArr, true);
                                tL_message.message = charSequenceArr[0].toString();
                            }
                            if (i19 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
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
                            if (i19 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
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
                        str3 = str;
                        j13 = j10;
                    }
                    i14 = i19 + 1;
                    i15 = i18;
                    ceil = i17;
                    messageObject2 = messageObject9;
                    messageObject7 = messageObject8;
                    selectedPhotos = hashMap2;
                }
                messageObject3 = messageObject7;
            }
            j3 = j13;
            messageObject4 = messageObject3;
        } else if (niVar == viVar2.k0) {
            if (TextUtils.isEmpty(viVar2.m1().getText())) {
                chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                i11 = 0;
                z14 = false;
            } else {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                tL_message2.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                tL_message2.peer_id = MessagesController.getInstance(i12).getPeer(j13);
                CharSequence[] charSequenceArr2 = {viVar2.m1().getText()};
                MessageObject.addLinks(true, charSequenceArr2[0]);
                tL_message2.entities = MediaDataController.getInstance(i12).getEntities(charSequenceArr2, true);
                tL_message2.message = charSequenceArr2[0].toString();
                MessageObject messageObject11 = new MessageObject(i12, tL_message2, true, false);
                messageObject11.sendPreview = true;
                messageObject11.notime = true;
                messageObject11.isOutOwnerCached = Boolean.TRUE;
                arrayList2.add(messageObject11);
                i11 = 1;
                z14 = true;
            }
            ArrayList<TLRPC.User> selected = viVar2.k0.getSelected();
            int i28 = 0;
            while (i28 < selected.size()) {
                TLRPC.User user2 = selected.get(i28);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                int i29 = i11 + 1;
                tL_message3.id = i11;
                ArrayList<TLRPC.User> arrayList3 = selected;
                tL_message3.out = true;
                tL_message3.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                tL_message3.peer_id = MessagesController.getInstance(i12).getPeer(j13);
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
                i28++;
                i11 = i29;
                selected = arrayList3;
                z14 = true;
            }
            messageObject4 = null;
            z10 = false;
            viVar2 = viVar;
            j3 = j13;
            z11 = z14;
        } else {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
            if (niVar == viVar2.p0) {
                messageObject4 = null;
                boolean z16 = false;
                int i30 = 0;
                for (int i31 = 0; i31 < viVar2.p0.S.size(); i31++) {
                    String str5 = (String) viVar2.p0.S.get(i31);
                    if (str5 != null) {
                        int lastIndexOf = str5.lastIndexOf(File.separator);
                        String substring = lastIndexOf < 0 ? str5 : str5.substring(lastIndexOf + 1);
                        if (!TextUtils.isEmpty(substring)) {
                            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                            int i32 = i30 + 1;
                            tL_message4.id = i30;
                            tL_message4.out = true;
                            tL_message4.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                            tL_message4.peer_id = MessagesController.getInstance(i12).getPeer(j13);
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
                                CharSequence[] charSequenceArr3 = {viVar2.m1().getText()};
                                tL_message4.entities = MediaDataController.getInstance(i12).getEntities(charSequenceArr3, true);
                                tL_message4.message = charSequenceArr3[0].toString();
                            } else {
                                z12 = true;
                                z13 = false;
                            }
                            MessageObject messageObject13 = new MessageObject(i12, tL_message4, z12, z13);
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
                gj gjVar = viVar2.l0;
                if (niVar == gjVar) {
                    arrayList2.addAll(gjVar.getSelected());
                    if (!arrayList2.isEmpty()) {
                        messageObject4 = (MessageObject) arrayList2.get(0);
                        CharSequence[] charSequenceArr4 = {viVar2.m1().getText()};
                        MessageObject.addLinks(true, charSequenceArr4[0]);
                        messageObject4.messageOwner.entities = MediaDataController.getInstance(i12).getEntities(charSequenceArr4, true);
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
        w70 F = w70.F(viVar2.containerView, e6Var, fiVar);
        if (messageObject4 != null) {
            ni niVar2 = viVar2.y0;
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (niVar2 == chatAttachAlertPhotoLayout2 || niVar2 == viVar2.q0) {
                dc0 dc0Var = new dc0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), e6Var);
                TLRPC.Message message = messageObject4.messageOwner;
                boolean z17 = viVar2.c0;
                message.invert_media = z17;
                dc0Var.a(!z17, false);
                dc0Var.setOnClickListener(new ai.d0(viVar2, messageObject4, dc0Var, 17));
                F.q(dc0Var);
                if (viVar2.H1 == null) {
                    F.k();
                }
            }
        } else {
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        }
        boolean isUserSelf = UserObject.isUserSelf(user);
        if (viVar2.H1 != null || ((znVar != null && ChatObject.isMonoForum(znVar.e)) || ((znVar == null || !znVar.D6()) && !viVar2.y0.c()))) {
            j11 = j3;
        } else {
            j11 = j3;
            F.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new a3.h0(viVar2, j11, e6Var, 19), false);
        }
        ni niVar3 = viVar2.y0;
        if ((niVar3 == chatAttachAlertPhotoLayout2 || niVar3 == viVar2.q0) && niVar3.getSelectedItemsCount() == 1 && znVar != null && ChatObject.isMonoForum(znVar.e)) {
            znVar2 = znVar;
            j12 = j11;
            F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new ai.p8(viVar2, j11, znVar2, e6Var, 28), false);
        } else {
            j12 = j11;
            znVar2 = znVar;
        }
        if (viVar2.H1 == null && !isUserSelf) {
            F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new gh(viVar2, 1), false);
        }
        if (viVar2.H1 == null && z10 && znVar2 != null && ChatObject.isChannelAndNotMegaGroup(znVar2.e) && (chatFull = znVar2.Z7) != null && chatFull.paid_media_allowed) {
            F.c(R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton), null, false);
            org.telegram.ui.ActionBar.f1 y3 = F.y();
            y3.setOnClickListener(new ai.p5(viVar2, context, y3, e6Var, 12));
            long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
            if (starsPrice > 0) {
                y3.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                y3.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                y3.setText(LocaleController.getString(R.string.PaidMediaButton));
                y3.setSubtext(null);
            }
            viVar2.h0.s(starsPrice);
        }
        F.Y();
        viVar2.h0.p(F);
        viVar2.h0.q(arrayList2);
        if (viVar2.H1 == null && j12 >= 0 && z11) {
            viVar2.h0.d(n2Var);
            viVar2.h0.o(viVar2.N0);
        }
        viVar2.h0.show();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static /* synthetic */ void r(vi viVar, org.telegram.messenger.video.o oVar) {
        AnimatorSet animatorSet = viVar.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        oVar.run();
    }

    public static void s(vi viVar) {
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
        viVar.Y1(true);
        org.telegram.ui.ActionBar.v0 v0Var = viVar.c1;
        ci.f4 f4Var = viVar.d1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        ci.f4 f4Var2 = new ci.f4(viVar.getContext(), 1);
        viVar.d1 = f4Var2;
        f4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(!S ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        viVar.d1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        viVar.d1.m(1.0f, -((viVar.containerView.getWidth() - ((v0Var.getWidth() / 2.0f) + v0Var.getX())) - AndroidUtilities.dp(14.0f)));
        viVar.d1.setTranslationY(viVar.a1.getTranslationY());
        ci.f4 f4Var3 = viVar.d1;
        f4Var3.l0 = new zd(4, viVar, f4Var2);
        viVar.containerView.addView(f4Var3, w7.y5.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        viVar.d1.u();
    }

    public static /* synthetic */ void t(vi viVar, boolean z10, gh ghVar) {
        viVar.y0.s(1.0f);
        viVar.z0.s(1.0f);
        viVar.y0.k(viVar.l2);
        viVar.z0.k(viVar.l2);
        viVar.containerView.invalidate();
        viVar.X0.setTag(z10 ? 1 : null);
        ghVar.run();
    }

    public static void v(vi viVar, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        vi viVar2 = viVar;
        yh yhVar = viVar2.y1;
        ni[] niVarArr = viVar2.w0;
        org.telegram.ui.ActionBar.n2 n2Var = viVar2.f0;
        org.telegram.ui.ActionBar.n2 R = n2Var == null ? LaunchActivity.R() : n2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (view instanceof pi) {
            Activity parentActivity = R.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!viVar2.L1 && !viVar2.M1 && viVar2.a1()) {
                    return;
                }
                if (!viVar2.L1 && !viVar2.M1) {
                    vn vnVar = new vn(1, viVar2.getContext(), e6Var, viVar2);
                    viVar2.T = vnVar;
                    viVar2.Q1(vnVar);
                }
                viVar2.Q1(viVar2.j0);
            } else if (intValue == 3) {
                if (!viVar2.N1 && viVar2.a1()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(viVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                viVar2.B1(true);
            } else if (intValue == 4) {
                if (!viVar2.K1 && viVar2.a1()) {
                    return;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(viVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                viVar2.E1(true);
            } else if (intValue == 5) {
                if (!viVar2.Q1 && viVar2.a1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && viVar2.Q1 && viVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(viVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                viVar2.D1();
            } else if (intValue == 6) {
                if ((!viVar2.Q1 && viVar2.a1()) || !AndroidUtilities.isMapsInstalled(n2Var)) {
                    return;
                }
                if (viVar2.Q1) {
                    if (viVar2.o0 == null) {
                        gl glVar = new gl(viVar2, viVar2.getContext(), e6Var, (viVar2.H || viVar2.R1) ? false : true);
                        viVar2.o0 = glVar;
                        niVarArr[5] = glVar;
                        bl blVar = viVar2.t2;
                        if (blVar != null) {
                            glVar.setDelegate(blVar);
                        } else {
                            glVar.setDelegate(new dh(viVar2, 9));
                        }
                    }
                    viVar2.Q1(viVar2.o0);
                } else {
                    vn vnVar2 = new vn(6, viVar2.getContext(), e6Var, viVar2);
                    viVar2.T = vnVar2;
                    viVar2.Q1(vnVar2);
                }
            } else if (intValue == 9) {
                if (!viVar2.O1 && viVar2.a1()) {
                    return;
                }
                if (viVar2.O1) {
                    viVar2.S1(true, null);
                } else {
                    vn vnVar3 = new vn(9, viVar2.getContext(), e6Var, viVar2);
                    viVar2.T = vnVar3;
                    viVar2.Q1(vnVar3);
                }
            } else if (intValue == 11) {
                if (viVar2.s0 == null) {
                    hg.i0 i0Var = new hg.i0(viVar2.getContext(), viVar2.resourcesProvider, viVar2);
                    viVar2.s0 = i0Var;
                    niVarArr[7] = i0Var;
                    i0Var.setupBlurredSearchField(viVar2.G2);
                }
                viVar2.Q1(viVar2.s0);
            } else if (intValue == 12) {
                if (!viVar2.P1 && viVar2.a1()) {
                    return;
                }
                if (viVar2.P1) {
                    if (viVar2.n0 == null) {
                        un unVar = new un(viVar, viVar.getContext(), true, e6Var, null);
                        viVar2 = viVar;
                        viVar2.n0 = unVar;
                        niVarArr[1] = unVar;
                        unVar.setDelegate(new dh(viVar2, 10));
                    }
                    viVar2.Q1(viVar2.n0);
                } else {
                    vn vnVar4 = new vn(9, viVar2.getContext(), e6Var, viVar2);
                    viVar2.T = vnVar4;
                    viVar2.Q1(vnVar4);
                }
            } else if (intValue == 13) {
                if (viVar2.u0 == null) {
                    pk pkVar = new pk(viVar2, viVar2.getContext(), e6Var, true);
                    viVar2.u0 = pkVar;
                    niVarArr[8] = pkVar;
                    pkVar.setDelegate(viVar2.a2);
                }
                viVar2.Q1(viVar2.u0);
            } else if (intValue == 14) {
                if (viVar2.t0 == null) {
                    pk pkVar2 = new pk(viVar2, viVar2.getContext(), e6Var, false);
                    viVar2.t0 = pkVar2;
                    niVarArr[9] = pkVar2;
                    pkVar2.setDelegate(viVar2.a2);
                }
                viVar2.Q1(viVar2.t0);
            } else if (intValue == 16) {
                if (viVar2.v0 == null) {
                    ii.r rVar = new ii.r(viVar2.J1, viVar2.getContext(), e6Var, viVar2);
                    viVar2.v0 = rVar;
                    niVarArr[10] = rVar;
                }
                viVar2.Q1(viVar2.v0);
            } else if (view.getTag() instanceof Integer) {
                viVar2.Z1.B1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, viVar2.s1(), false, 0L);
            }
        } else if (view instanceof oi) {
            oi oiVar = (oi) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = oiVar.c;
            if (tL_attachMenuBot == null) {
                viVar2.Z1.j1(oiVar.b);
                viVar2.dismiss();
            } else if (tL_attachMenuBot.inactive) {
                kj1.a(viVar2.getContext(), new ai.g3(7, viVar2, oiVar), null);
            } else {
                viVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int dp = AndroidUtilities.dp(70.0f);
        int i12 = left - dp;
        if (i12 < 0) {
            yhVar.w0(i12, 0, null);
            return;
        }
        int i13 = right + dp;
        if (i13 > yhVar.getMeasuredWidth()) {
            yhVar.w0(i13 - yhVar.getMeasuredWidth(), 0, null);
        }
    }

    public static /* synthetic */ void w(vi viVar) {
        ni niVar;
        qm qmVar;
        viVar.t1 = null;
        ni niVar2 = viVar.y0;
        if (niVar2 != viVar.j0 && (niVar = viVar.z0) != (qmVar = viVar.q0) && niVar2 != niVar && niVar2 != qmVar) {
            viVar.containerView.removeView(niVar2);
        }
        viVar.y0.setVisibility(8);
        viVar.y0.q();
        viVar.z0.F();
        viVar.y0 = viVar.z0;
        viVar.z0 = null;
        int[] iArr = viVar.b2;
        iArr[0] = iArr[1];
        viVar.H1(viVar.c0, false);
        viVar.W1();
    }

    public final void A1(int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (i10 != 3) {
            if (i10 == 6 && AndroidUtilities.isMapsInstalled(n2Var)) {
                if (this.o0 == null) {
                    gl glVar = new gl(this, getContext(), this.resourcesProvider, (this.H || this.R1) ? false : true);
                    this.o0 = glVar;
                    this.w0[5] = glVar;
                    bl blVar = this.t2;
                    if (blVar != null) {
                        glVar.setDelegate(blVar);
                    } else if (n2Var instanceof org.telegram.ui.zn) {
                        glVar.setDelegate(new dh(this, 16));
                    }
                }
                Q1(this.o0);
                return;
            }
            return;
        }
        if (this.N1 || !a1()) {
            Activity parentActivity = n2Var != null ? n2Var.getParentActivity() : null;
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
            vn vnVar = new vn(3, getContext(), this.resourcesProvider, this);
            this.T = vnVar;
            Q1(vnVar);
        }
        int i10 = 1;
        if (this.l0 == null) {
            gj gjVar = new gj(getContext(), this.resourcesProvider, this);
            this.l0 = gjVar;
            this.w0[3] = gjVar;
            gjVar.setupBlurredSearchField(this.G2);
            this.l0.setDelegate(new dh(this, 13));
            if (this.H) {
                this.l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            TLRPC.Chat chat = ((org.telegram.ui.zn) n2Var).e;
            gj gjVar2 = this.l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                i10 = -1;
            }
            gjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            Q1(this.l0);
        }
    }

    public final void C1() {
        if (this.r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.resourcesProvider;
            jj jjVar = new jj(context, e6Var, this);
            jjVar.r = AndroidUtilities.dp(80.0f);
            jjVar.w = 3;
            ai.w0 w0Var = new ai.w0(jjVar, context, e6Var, 11);
            jjVar.n = w0Var;
            za zaVar = new za(jjVar, context);
            jjVar.v = zaVar;
            w0Var.setAdapter(zaVar);
            w0Var.setClipToPadding(false);
            w0Var.setItemAnimator(null);
            w0Var.setLayoutAnimation(null);
            w0Var.setVerticalScrollBarEnabled(false);
            w0Var.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, jjVar.a));
            jjVar.addView(w0Var, w7.y5.c(-1.0f, -1));
            w0Var.setOnScrollListener(new ai.r(jjVar, 18));
            bi.l lVar = new bi.l(jjVar, jjVar.r, 1);
            jjVar.s = lVar;
            lVar.O = new ci.x1(jjVar, 2);
            w0Var.setLayoutManager(lVar);
            this.r0 = jjVar;
            jjVar.setDelegate(new gb(this, 1));
        }
        Q1(this.r0);
    }

    @Override // le.d
    public final void D(int i10, float f7, float f10, le.e eVar) {
        ni niVar;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        if (i10 == 2) {
            e1();
            un unVar = this.m0;
            if (unVar != null && ((niVar = this.z0) == unVar || this.y0 == unVar)) {
                a2(niVar == unVar ? 1 : 0);
            }
            un unVar2 = this.n0;
            if (unVar2 != null) {
                ni niVar2 = this.z0;
                if (niVar2 == unVar2 || this.y0 == unVar2) {
                    a2(niVar2 != unVar2 ? 0 : 1);
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
            fi fiVar = this.I0;
            if (fiVar != null) {
                fiVar.setEphemeralFactor(f7);
                fiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final void D1() {
        if (!this.Q1) {
            vn vnVar = new vn(5, getContext(), this.resourcesProvider, this);
            this.T = vnVar;
            Q1(vnVar);
        }
        if (this.k0 == null) {
            yj yjVar = new yj(getContext(), this.resourcesProvider, this);
            this.k0 = yjVar;
            this.w0[2] = yjVar;
            yjVar.setupBlurredSearchField(this.G2);
            this.k0.setDelegate(new hi(this));
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            TLRPC.Chat chat = ((org.telegram.ui.zn) n2Var).e;
            this.k0.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        Q1(this.k0);
    }

    public final void E1(boolean z10) {
        if (!this.K1 && z10) {
            vn vnVar = new vn(4, getContext(), this.resourcesProvider, this);
            this.T = vnVar;
            Q1(vnVar);
        }
        boolean z11 = false;
        if (this.p0 == null) {
            ok okVar = new ok(this.N ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.p0 = okVar;
            this.w0[4] = okVar;
            okVar.setDelegate(new ii(this));
        }
        int i10 = 1;
        if (this.H) {
            this.p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.f0;
            if (n2Var instanceof org.telegram.ui.zn) {
                TLRPC.Chat chat = ((org.telegram.ui.zn) n2Var).e;
                ok okVar2 = this.p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                    i10 = -1;
                }
                okVar2.setMaxSelectedFiles(i10);
            } else {
                this.p0.setMaxSelectedFiles(this.S1);
                ok okVar3 = this.p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                okVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        ok okVar4 = this.p0;
        okVar4.d0 = this.N;
        if (z10) {
            Q1(okVar4);
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
            ni[] niVarArr = this.w0;
            if (i10 >= niVarArr.length) {
                T1(false, false);
                super.dismissInternal();
                return;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.m();
                this.containerView.removeView(niVarArr[i10]);
                niVarArr[i10] = null;
            }
            i10++;
        }
    }

    public final boolean G1(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        if (this.I1) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
            TLRPC.Chat chat = znVar.e;
            if (znVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(this.J1).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + znVar.a(), !z10).commit();
            }
        }
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f) {
            this.I1 = true;
            this.Z1.B1(7, true, z10, i10, i11, j3, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        ni niVar = this.y0;
        return e5.b0(this.J1, n12, j1() + (niVar != null ? niVar.getSelectedItemsCount() : 1), new Utilities.Callback() { // from class: org.telegram.ui.Components.qh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                vi viVar = vi.this;
                viVar.I1 = true;
                viVar.Z1.B1(7, true, z10, i10, i11, j3, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void H1(boolean z10, boolean z11) {
        this.b.a(z10, z11);
        ju m12 = m1();
        this.c0 = z10;
        ju m13 = m1();
        final boolean z12 = this.D0.getTag() != null;
        ni niVar = this.y0;
        final boolean z13 = this.c0 && (niVar == this.j0 || niVar == this.q0);
        ci.n6 n6Var = this.O0;
        hg.j jVar = this.C0;
        if (z11) {
            n6Var.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = n6Var.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            qr qrVar = qr.h;
            final int i10 = 0;
            duration.setInterpolator(qrVar).setUpdateListener(new eh(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.fh
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
                                viVar.O0.setVisibility(8);
                            }
                            viVar.b2();
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
            ViewPropertyAnimator interpolator = jVar.animate().translationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(qrVar);
            final int i11 = 1;
            interpolator.setUpdateListener(new eh(this, i11)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.fh
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
                                viVar.O0.setVisibility(8);
                            }
                            viVar.b2();
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
            n6Var.setVisibility((z13 && z12) ? 0 : 8);
            n6Var.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            b2();
            jVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            jVar.setTranslationY((z13 || !z12) ? jVar.getMeasuredHeight() : 0.0f);
            jVar.setVisibility((z13 || !z12) ? 8 : 0);
        }
        if (m12 != m13) {
            m12.k(true);
            m13.setText(z5.cloneSpans(m12.getText()));
            m13.getEditText().setAllowTextEntitiesIntersection(m12.getEditText().getAllowTextEntitiesIntersection());
            if (m12.getEditText().isFocused()) {
                m13.getEditText().requestFocus();
                m13.getEditText().setSelection(m12.getEditText().getSelectionStart(), m12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new gh(this, 0));
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
            vi viVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.g1 = (viVar.Q0 == 0 || viVar.F) ? false : true;
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
            org.telegram.ui.ActionBar.n2 n2Var = this.f0;
            if ((n2Var instanceof org.telegram.ui.zn) && !((org.telegram.ui.zn) n2Var).v()) {
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
                qr qrVar = qr.h;
                scaleY.setInterpolator(qrVar).setDuration(420L).withEndAction(new ph(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(qrVar).setDuration(420L).withEndAction(new ph(this, z11, 2)).start();
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
        if (this.y2 != z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1(long j3, String str, boolean z10, boolean z11) {
        long j10;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.x0;
        int i10 = 1;
        if (longSparseArray.get(j3) != null && Objects.equals(str, ((ei.q4) longSparseArray.get(j3)).getStartCommand())) {
            ei.q4 q4Var = (ei.q4) longSparseArray.get(j3);
            if (q4Var.H) {
                q4Var.H = false;
            }
            if (longSparseArray.get(j3) != null) {
                ((ei.q4) longSparseArray.get(j3)).J.setSwipeOffsetAnimationDisallowed(true);
                R1((ni) longSparseArray.get(j3), -j3, z11);
                if (z10) {
                    ei.q4 q4Var2 = (ei.q4) longSparseArray.get(j3);
                    TLRPC.User user = MessagesController.getInstance(q4Var2.F).getUser(Long.valueOf(q4Var2.v));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(q4Var2.F).getAttachMenuBots().bots;
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
                        if (tL_attachMenuBot.bot_id == q4Var2.v) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z12 = tL_attachMenuBot.show_in_side_menu;
                    AndroidUtilities.runOnUIThread(new ci.b9(22, q4Var2, (z12 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name) : z12 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name)), 200L);
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
            ei.q4 q4Var3 = new ei.q4(context, e6Var, this);
            int i12 = 2;
            q4Var3.U = new ei.g4(q4Var3, i12);
            org.telegram.ui.ActionBar.v0 a2 = q4Var3.b.X0.n().a(0, R.drawable.ic_ab_other);
            q4Var3.K = a2;
            a2.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
            org.telegram.ui.ActionBar.f1 e = a2.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
            q4Var3.L = e;
            e.setVisibility(8);
            a2.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
            org.telegram.ui.ActionBar.f1 e7 = a2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            q4Var3.M = e7;
            e7.setVisibility(8);
            a2.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
            a2.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
            a2.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
            ei.j4 j4Var = new ei.j4(q4Var3, context, e6Var, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, q4Var3.a));
            q4Var3.n = j4Var;
            ei.a3 a3Var = new ei.a3(q4Var3, context, i10);
            q4Var3.J = a3Var;
            a3Var.addView(j4Var, w7.y5.c(-1.0f, -1));
            a3Var.setScrollListener(new ei.g4(q4Var3, 3));
            a3Var.setScrollEndListener(new ei.g4(q4Var3, 4));
            a3Var.setDelegate(new ei.i4(q4Var3));
            a3Var.setIsKeyboardVisible(new ei.i4(q4Var3));
            q4Var3.addView(a3Var, w7.y5.c(-1.0f, -1));
            ei.k4 k4Var = new ei.k4(context, e6Var);
            q4Var3.I = k4Var;
            q4Var3.addView(k4Var, w7.y5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            j4Var.setWebViewProgressListener(new ci.e5(q4Var3, i12));
            NotificationCenter.getGlobalInstance().addObserver(q4Var3, NotificationCenter.didSetNewTheme);
            longSparseArray.put(j3, q4Var3);
            ((ei.q4) longSparseArray.get(j3)).setDelegate(new bi(this, q4Var3, str, j3));
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
            MessageObject replyingMessageObject = znVar.Y.getReplyingMessageObject();
            ei.q4 q4Var4 = (ei.q4) longSparseArray.get(j3);
            long a10 = znVar.a();
            int i13 = replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0;
            long N8 = znVar.N8();
            ei.j4 j4Var2 = q4Var4.n;
            int i14 = this.J1;
            q4Var4.F = i14;
            q4Var4.w = a10;
            q4Var4.v = j3;
            q4Var4.y = i13;
            q4Var4.E = N8;
            q4Var4.G = str;
            org.telegram.ui.ActionBar.f1 f1Var = q4Var4.M;
            if (f1Var != null) {
                if (MediaDataController.getInstance(i14).canCreateAttachedMenuBotShortcut(j3)) {
                    f1Var.setVisibility(0);
                } else {
                    f1Var.setVisibility(8);
                }
            }
            j4Var2.setBotUser(MessagesController.getInstance(i14).getUser(Long.valueOf(j3)));
            j4Var2.t(i14, j3);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(i14).getInputPeer(a10);
            tL_messages_requestWebView.bot = MessagesController.getInstance(i14).getInputUser(j3);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a10 < 0) {
                j10 = 0;
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(-a10);
                if (chatFull != null && (peer = chatFull.default_send_as) != null) {
                    tL_messages_requestWebView.send_as = MessagesController.getInstance(i14).getInputPeer(peer);
                    tL_messages_requestWebView.flags |= 8192;
                }
            } else {
                j10 = 0;
            }
            if (str != null) {
                tL_messages_requestWebView.start_param = str;
                tL_messages_requestWebView.flags |= 8;
            }
            if (i13 != 0) {
                TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(i14).createReplyInput(i13);
                tL_messages_requestWebView.reply_to = createReplyInput;
                if (N8 != j10) {
                    createReplyInput.monoforum_peer_id = MessagesController.getInstance(i14).getInputPeer(N8);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (N8 != j10) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(i14).getInputPeer(N8);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject p5 = ei.k3.p(q4Var4.a, false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i14).sendRequest(tL_messages_requestWebView, new ai.g8(q4Var4, i14, i12));
            NotificationCenter.getInstance(i14).addObserver(q4Var4, NotificationCenter.webViewResultSent);
            if (longSparseArray.get(j3) != null) {
            }
        }
        if (longSparseArray.get(j3) != null) {
        }
    }

    public final void O1(org.telegram.ui.ActionBar.n2 n2Var) {
        if ((n2Var instanceof org.telegram.ui.zn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.zn) n2Var).e)) {
            new xc(this.r1, this.resourcesProvider).f(MessagesController.getInstance(this.J1).captionLengthLimitPremium, new zd(5, this, n2Var)).j();
        }
    }

    public final boolean P1(boolean z10, boolean z11) {
        int i10;
        ni niVar;
        y7 y7Var;
        this.c.a(z10, true);
        xh xhVar = this.D0;
        if (z10 == (xhVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        xhVar.setTag(z10 ? 1 : null);
        ai aiVar = this.E0;
        if (aiVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(aiVar.getEditText());
        }
        aiVar.k(true);
        this.P0.k(true);
        xh xhVar2 = this.x1;
        xh xhVar3 = this.H0;
        if (z10) {
            if (!this.N) {
                xhVar.setVisibility(0);
            }
            xhVar3.setVisibility(0);
        } else if (this.S0) {
            xhVar2.setVisibility(0);
        }
        ni niVar2 = this.y0;
        boolean z12 = (niVar2 == this.j0 || niVar2 == this.q0) && this.c0;
        y7 y7Var2 = this.X0;
        ci.n6 n6Var = this.O0;
        hg.j jVar = this.C0;
        fi fiVar = this.I0;
        if (z11) {
            this.M0 = new AnimatorSet();
            if (z12) {
                n6Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(xhVar, (Property<xh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<hg.j, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                y7Var = y7Var2;
            } else {
                jVar.setVisibility(0);
                y7Var = y7Var2;
                arrayList.add(ObjectAnimator.ofFloat(jVar, (Property<hg.j, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(n6Var, (Property<ci.n6, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(xhVar3, (Property<xh, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(xhVar3, (Property<xh, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(xhVar3, (Property<xh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(fiVar, (Property<fi, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(fiVar, (Property<fi, Float>) property3, z10 ? 1.0f : 0.2f));
            if (y7Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(xhVar, (Property<xh, Float>) View.TRANSLATION_Y, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.S0) {
                arrayList.add(ObjectAnimator.ofFloat(xhVar2, (Property<xh, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(xhVar2, (Property<xh, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new eh(this, 4));
                arrayList.add(ofFloat);
            }
            this.M0.playTogether(arrayList);
            this.M0.setInterpolator(new DecelerateInterpolator());
            this.M0.setDuration(180L);
            this.M0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.M0.start();
            i10 = 0;
        } else {
            xhVar.setAlpha(z10 ? 1.0f : 0.0f);
            jVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            if (!z10 || z12) {
                i10 = 0;
            } else {
                i10 = 0;
                jVar.setVisibility(0);
                jVar.setTranslationY(0.0f);
            }
            xhVar3.setScaleX(z10 ? 1.0f : 0.2f);
            xhVar3.setScaleY(z10 ? 1.0f : 0.2f);
            xhVar3.setAlpha(z10 ? 1.0f : 0.0f);
            n6Var.setVisibility((z10 && z12) ? 0 : 8);
            n6Var.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            fiVar.setScaleX(z10 ? 1.0f : 0.2f);
            fiVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (y7Var2.getTag() != null) {
                xhVar.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
            } else if (this.S0 && ((niVar = this.y0) == null || niVar.J())) {
                xhVar2.setTranslationY(z10 ? AndroidUtilities.dp(84.0f) : 0.0f);
            }
            if (!z10) {
                xhVar.setVisibility(4);
                xhVar3.setVisibility(4);
            }
            if (z12) {
                b2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.y0.getSelectedItemsCount());
        }
        fiVar.g(i10, z11);
        fiVar.i(j1() + this.y0.getSelectedItemsCount(), this.H1 != null ? 0L : MessagesController.getInstance(this.J1).getSendPaidMessagesStars(n1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aiVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), fiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            aiVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(ni niVar) {
        long j3 = this.W0;
        vn vnVar = this.T;
        if (niVar == vnVar) {
            j3 = vnVar.s;
        } else if (niVar == this.j0) {
            j3 = 1;
        } else if (niVar == this.l0) {
            j3 = 3;
        } else if (niVar == this.p0) {
            j3 = 4;
        } else if (niVar == this.k0) {
            j3 = 5;
        } else if (niVar == this.o0) {
            j3 = 6;
        } else if (niVar == this.m0) {
            j3 = 9;
        } else if (niVar == this.r0) {
            j3 = 10;
        } else if (niVar == this.s0) {
            j3 = 11;
        } else if (niVar == this.n0) {
            j3 = 12;
        } else if (niVar == this.t0) {
            j3 = 14;
        } else if (niVar == this.u0) {
            j3 = 13;
        } else if (niVar == this.v0) {
            j3 = 16;
        }
        R1(niVar, j3, true);
    }

    public final void R1(ni niVar, long j3, boolean z10) {
        dm dmVar;
        dm dmVar2;
        Float f7;
        int i10;
        Float valueOf = Float.valueOf(0.0f);
        if (this.t1 == null && this.M0 == null) {
            ni niVar2 = this.y0;
            if (niVar2 == niVar) {
                niVar2.G();
                return;
            }
            int i11 = 0;
            if (niVar == this.n0 && !UserConfig.getInstance(this.J1).isPremium()) {
                new rg.x0(this.f0, 39, false).show();
                return;
            }
            int i12 = (j3 > 1L ? 1 : (j3 == 1L ? 0 : -1));
            this.f.a(i12 == 0, z10);
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
            xh xhVar = this.x1;
            xhVar.setAlpha(1.0f);
            xhVar.setTranslationY(this.F1);
            int i13 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.x0;
                if (i13 >= longSparseArray.size()) {
                    break;
                }
                ((ei.q4) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                i13++;
            }
            this.W0 = j3;
            yh yhVar = this.y1;
            int childCount = yhVar.getChildCount();
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = yhVar.getChildAt(i14);
                if (childAt instanceof pi) {
                    pi piVar = (pi) childAt;
                    i10 = i12;
                    f7 = valueOf;
                    piVar.a.e(((long) piVar.b) == piVar.c.W0, true);
                } else {
                    f7 = valueOf;
                    i10 = i12;
                    if (childAt instanceof oi) {
                        ((oi) childAt).a(true);
                    }
                }
                i14++;
                i12 = i10;
                valueOf = f7;
            }
            Float f10 = valueOf;
            int i15 = i12;
            int firstOffset = (this.y0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.b2[0];
            this.z0 = niVar;
            niVar.getClass();
            boolean z11 = niVar instanceof ii.r;
            jh.f fVar = this.v1;
            if (fVar != null) {
                fVar.setFadeHeightBottom(z11 ? 0 : AndroidUtilities.dp(48.0f));
            }
            zh zhVar = this.w1;
            if (zhVar != null) {
                zhVar.setVisibility(z11 ? 4 : 0);
            }
            int i16 = this.z0.h() != 0 ? 0 : 4;
            y7 y7Var = this.X0;
            y7Var.setVisibility(i16);
            if (y7Var.n0) {
                y7Var.h(true);
            }
            this.y0.r();
            ni niVar3 = this.z0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if (niVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.z0.E(this.y0);
            this.z0.setVisibility(0);
            if (niVar.getParent() != null) {
                this.containerView.removeView(this.z0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.y0);
            ViewParent parent = this.z0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                ni niVar4 = this.z0;
                if (niVar4 != this.o0) {
                    indexOfChild++;
                }
                viewGroup.addView(niVar4, indexOfChild, w7.y5.c(-1.0f, -1));
            }
            gh ghVar = new gh(this, 3);
            ni niVar5 = this.y0;
            boolean z12 = niVar5 instanceof qm;
            ji jiVar = this.e0;
            if (z12 || (this.z0 instanceof qm)) {
                int max = Math.max(this.z0.getWidth(), this.y0.getWidth());
                ni niVar6 = this.z0;
                if (niVar6 instanceof qm) {
                    niVar6.setTranslationX(max);
                    ni niVar7 = this.y0;
                    if ((niVar7 instanceof ChatAttachAlertPhotoLayout) && (dmVar2 = ((ChatAttachAlertPhotoLayout) niVar7).P) != null) {
                        dmVar2.setVisibility(4);
                    }
                } else {
                    this.y0.setTranslationX(-max);
                    ni niVar8 = this.z0;
                    if (niVar8 == chatAttachAlertPhotoLayout && (dmVar = ((ChatAttachAlertPhotoLayout) niVar8).P) != null) {
                        dmVar.setVisibility(0);
                    }
                }
                this.z0.setAlpha(1.0f);
                this.y0.setAlpha(1.0f);
                if (z10) {
                    jiVar.set(this.y0, f10);
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, niVar, ghVar, 15));
                } else {
                    boolean z13 = this.z0.getCurrentItemTop() <= niVar.getButtonsHideOffset();
                    this.y0.s(1.0f);
                    this.z0.s(1.0f);
                    this.y0.k(this.l2);
                    this.z0.k(this.l2);
                    this.containerView.invalidate();
                    jiVar.set(this.y0, Float.valueOf(1.0f));
                    y7Var.setTag(z13 ? 1 : null);
                    ghVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.z0.setAlpha(0.0f);
                this.z0.setTranslationY(AndroidUtilities.dp(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.y0, (Property<ni, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.y0, jiVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(y7Var, (Property<y7, Float>) View.ALPHA, y7Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(qr.f);
                animatorSet.addListener(new gi(this, firstOffset, ghVar, i11));
                this.t1 = animatorSet;
                jiVar.set(this.y0, f10);
                animatorSet.start();
            } else {
                niVar5.setAlpha(0.0f);
                ghVar.run();
                a2(0);
                this.containerView.invalidate();
            }
            if (this.m2 && !(niVar instanceof ei.q4)) {
                this.m2 = false;
                y7Var.e();
                y7Var.invalidate();
                u1();
            }
            if (i15 == 0 || j3 == 6 || (niVar instanceof ei.q4)) {
                i11 = AndroidUtilities.dp(46.0f);
            } else if (j3 == 4) {
                i11 = AndroidUtilities.dp(84.0f);
            }
            y7Var.setForcedMenuWidth(i11);
        }
    }

    public final void S1(boolean z10, Boolean bool) {
        vi viVar;
        if (this.m0 == null) {
            viVar = this;
            un unVar = new un(viVar, getContext(), false, this.resourcesProvider, bool);
            viVar.m0 = unVar;
            viVar.w0[1] = unVar;
            unVar.setDelegate(new dh(this, 15));
        } else {
            viVar = this;
        }
        R1(viVar.m0, 9L, z10);
    }

    public final void T1(boolean z10, boolean z11) {
        ni niVar;
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
        xh xhVar = this.x1;
        org.telegram.ui.ActionBar.v0 v0Var = this.a1;
        if (z10) {
            if (z12) {
                v0Var.setVisibility(0);
                v0Var.setClickable(true);
            }
        } else if (this.S0 && this.D0.getTag() == null) {
            xhVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var != null) {
            if (z10) {
                AndroidUtilities.setLightStatusBar(this, i0.a.f(getThemedColor(this.h2 ? org.telegram.ui.ActionBar.j6.tg : org.telegram.ui.ActionBar.j6.h5)) > 0.699999988079071d);
            } else {
                AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
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
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.Y0.playTogether(arrayList);
            this.Y0.addListener(new ca(2, this, z10));
            this.Y0.setInterpolator(qr.h);
            this.Y0.setDuration(380L);
            this.Y0.start();
            return;
        }
        if (z10 && this.S0 && ((niVar = this.y0) == null || niVar.J())) {
            xhVar.setVisibility(4);
        }
        y7Var.setAlpha(z10 ? 1.0f : 0.0f);
        if (z12) {
            v0Var.setAlpha(z10 ? 1.0f : 0.0f);
            v0Var.setScaleX(z10 ? 1.0f : 0.6f);
            v0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = this.e1;
        if (v0Var2 != null) {
            v0Var2.setVisibility(4);
        }
        if (this.Q0 == 0 && this.q1) {
            return;
        }
        v0Var.setVisibility(4);
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.G0;
        ai aiVar = this.E0;
        aiVar.getLocationOnScreen(iArr);
        if (this.B2 != null) {
            ni niVar = this.y0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if ((niVar == chatAttachAlertPhotoLayout || niVar == this.q0) && this.c0) {
                ci.n6 n6Var = this.O0;
                alpha = (n6Var.getAlpha() * n6Var.getMeasuredHeight()) + (n6Var.getY() - this.B2.getTop());
            } else {
                alpha = -aiVar.getHeight();
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
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.t1 != null) {
            return;
        }
        int selectedItemsCount = this.y0.getSelectedItemsCount();
        fi fiVar = this.I0;
        if (selectedItemsCount == 0) {
            fiVar.g(0, i10 != 0);
            P1(false, i10 != 0);
        } else {
            if (P1(true, i10 != 0) || i10 == 0) {
                fiVar.g(selectedItemsCount, i10 != 0);
                fiVar.c();
            } else {
                fiVar.g(selectedItemsCount, true);
                fiVar.c();
            }
        }
        this.y0.A(selectedItemsCount);
        d1(i10 != 0);
        if (this.y0 == this.j0 && ((((z10 = (n2Var = this.f0) instanceof org.telegram.ui.zn)) || this.Q0 != 0 || this.T0) && ((selectedItemsCount == 0 && this.q1) || ((selectedItemsCount != 0 || this.Q0 != 0 || this.T0) && !this.q1)))) {
            this.q1 = (selectedItemsCount == 0 && this.Q0 == 0 && !this.T0) ? false : true;
            AnimatorSet animatorSet = this.Z0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.Z0 = null;
            }
            int i11 = this.Q0;
            y7 y7Var = this.X0;
            org.telegram.ui.ActionBar.v0 v0Var = this.e1;
            if (i11 != 0 && v0Var != null && y7Var.getTag() != null && z10) {
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
                if (!ChatObject.isChannel(znVar.e) || (tL_chatBannedRights = znVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.q1;
                    xh xhVar = this.i1;
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.a1;
                    if (!z12) {
                        if (this.Q0 == 0 && !this.T0) {
                            v0Var2.setVisibility(0);
                            v0Var2.setClickable(true);
                        }
                        xhVar.setVisibility(0);
                    } else if (y7Var.getTag() != null && v0Var != null) {
                        v0Var.setVisibility(0);
                    }
                    if (i10 != 0) {
                        if (y7Var.getTag() == null && this.Q0 == 0 && !this.T0) {
                            v0Var2.setAlpha(this.q1 ? 1.0f : 0.0f);
                            v0Var2.setScaleX(this.q1 ? 1.0f : 0.6f);
                            v0Var2.setScaleY(this.q1 ? 1.0f : 0.6f);
                        }
                        xhVar.setAlpha(this.q1 ? 1.0f : 0.0f);
                        if (z11) {
                            v0Var.setAlpha(this.q1 ? 0.0f : 1.0f);
                        }
                        if (this.q1 && v0Var != null) {
                            v0Var.setVisibility(4);
                        }
                    } else {
                        this.Z0 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (y7Var.getTag() == null && this.Q0 == 0 && !this.T0) {
                            arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, this.q1 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_X, this.q1 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_Y, this.q1 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(xhVar, (Property<xh, Float>) property, this.q1 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property, this.q1 ? 0.0f : 1.0f));
                        }
                        this.Z0.playTogether(arrayList);
                        this.Z0.addListener(new r8(this, 6));
                        this.Z0.setDuration(180L);
                        this.Z0.start();
                    }
                }
            }
            z11 = false;
            z12 = this.q1;
            xh xhVar2 = this.i1;
            org.telegram.ui.ActionBar.v0 v0Var22 = this.a1;
            if (!z12) {
            }
            if (i10 != 0) {
            }
        }
        Y1(i10 != 0);
        MessageObject messageObject = this.H1;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.J1).getSendPaidMessagesStars(n1()) : 0L;
        ni niVar = this.y0;
        fiVar.i(j1() + (niVar != null ? niVar.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        ai aiVar = this.E0;
        if (aiVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aiVar.getLayoutParams();
            int max = Math.max(AndroidUtilities.dp(48.0f), fiVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                aiVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void W1() {
        float f7;
        ni niVar = this.y0;
        boolean g10 = niVar == null ? false : niVar.g();
        bi.o oVar = this.f1;
        oVar.setEnabled(g10);
        ni niVar2 = this.y0;
        if (niVar2 != null) {
            f7 = ((niVar2.g() ? 1.0f : 0.5f) * (this.z0 == null ? 1.0f : this.d0)) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        ni niVar3 = this.z0;
        if (niVar3 != null) {
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, this.d0, niVar3.g() ? 1.0f : 0.5f, f7);
        }
        this.g1 = f7;
        if (oVar != null) {
            float f10 = f7 * this.h1;
            oVar.setAlpha(f10);
            oVar.setVisibility(f10 <= 0.0f ? 4 : 0);
        }
    }

    public final void X1(ni niVar, int i10) {
        if (niVar == null) {
            return;
        }
        ah.i iVar = this.C2;
        if (iVar != null && Build.VERSION.SDK_INT >= 31) {
            iVar.f(0.0f, i10);
            Z0();
        }
        int currentItemTop = niVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = niVar == this.y0 && currentItemTop <= niVar.getButtonsHideOffset();
        this.R = z11;
        if (niVar == this.y0) {
            T1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) niVar.getLayoutParams();
        int D = org.telegram.messenger.wh.D(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        ni niVar2 = this.y0;
        int i11 = niVar2 == niVar ? 0 : 1;
        if ((niVar2 instanceof qm) || (this.z0 instanceof qm)) {
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
        ci.u uVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout == null || (uVar = this.b1) == null) {
            return;
        }
        boolean z11 = this.q1 && this.i0 && this.y0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0();
        boolean z12 = !ChatAttachAlertPhotoLayout.S();
        uVar.f = z12;
        if (!z10) {
            ((e6) uVar.g).a(z12);
        }
        uVar.invalidateSelf();
        org.telegram.ui.ActionBar.v0 v0Var = this.c1;
        if (z10 && this.q1) {
            v0Var.setVisibility(0);
            v0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(qr.h).withEndAction(new ph(this, z11, 0)).start();
        } else {
            v0Var.setVisibility(z11 ? 0 : 8);
            v0Var.setAlpha(z11 ? 1.0f : 0.0f);
            v0Var.setScaleX(z11 ? 1.0f : 0.6f);
            v0Var.setScaleY(z11 ? 1.0f : 0.6f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0() {
        ah.i iVar;
        boolean z10;
        if (Build.VERSION.SDK_INT < 31 || (iVar = this.C2) == null) {
            return;
        }
        xh xhVar = this.x1;
        ViewGroup viewGroup = this.containerView;
        RectF rectF = this.L2;
        hh.k.c(xhVar, viewGroup, rectF);
        float measuredWidth = this.containerView.getMeasuredWidth();
        float measuredHeight = this.X0.getMeasuredHeight();
        RectF rectF2 = this.K2;
        rectF2.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        rectF2.inset(0.0f, -AndroidUtilities.dp(48.0f));
        rectF.set(0.0f, this.containerView.getMeasuredHeight() - (AndroidUtilities.dp(180.0f) + Math.max(AndroidUtilities.navigationBarHeight, o1())), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        ni niVar = this.y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (niVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null) {
            tl tlVar = chatAttachAlertPhotoLayout.E;
            if (tlVar.getFastScroll() != null) {
                dl0 fastScroll = tlVar.getFastScroll();
                ch.d dVar = fastScroll.e0;
                RectF rectF3 = this.M2;
                if (dVar != null || fastScroll.f0 != null) {
                    rectF3.set(fastScroll.f0.getBounds());
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(fastScroll.e0.getBounds());
                    rectF3.union(rectF4);
                }
                dl0 fastScroll2 = tlVar.getFastScroll();
                ViewGroup viewGroup2 = this.containerView;
                RectF rectF5 = AndroidUtilities.rectTmp;
                hh.k.c(fastScroll2, viewGroup2, rectF5);
                rectF3.offset(rectF5.left, rectF5.top);
                rectF3.inset(-AndroidUtilities.dp(48.0f), -AndroidUtilities.dp(48.0f));
                rectF3.left = Math.max(0.0f, rectF3.left);
                rectF3.right = Math.min(this.containerView.getMeasuredWidth(), rectF3.right);
                z10 = true;
                int i10 = !z10 ? 3 : 2;
                ArrayList arrayList = this.J2;
                ArrayList arrayList2 = this.N2;
                iVar.g(yf.f0.a(arrayList, i10, arrayList2), arrayList2);
                iVar.e(this.I2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
            }
        }
        z10 = false;
        if (!z10) {
        }
        ArrayList arrayList3 = this.J2;
        ArrayList arrayList22 = this.N2;
        iVar.g(yf.f0.a(arrayList3, i10, arrayList22), arrayList22);
        iVar.e(this.I2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void Z1(boolean z10) {
        ni niVar = this.j0;
        if (!z10) {
            Q1(niVar);
            return;
        }
        if (this.M) {
            if (this.q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.r;
                if (e6Var == null) {
                    e6Var = this.resourcesProvider;
                }
                qm qmVar = new qm(context, e6Var, this);
                qmVar.y = 0.0f;
                qmVar.E = 0.0f;
                qmVar.F = 0.0f;
                qmVar.G = 0.0f;
                qmVar.H = 0.0f;
                qmVar.I = 0.0f;
                qmVar.J = null;
                qmVar.K = false;
                qmVar.M = 0.0f;
                qmVar.Q = false;
                qmVar.S = false;
                Point point = AndroidUtilities.displaySize;
                qmVar.T = point.y > point.x;
                qmVar.n = e6Var;
                qmVar.f = true;
                qmVar.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z n10 = qmVar.b.X0.n();
                TextView textView = new TextView(context);
                qmVar.x = textView;
                org.telegram.ui.ActionBar.e6 e6Var2 = qmVar.a;
                yl ylVar = new yl(qmVar, context, n10, e6Var2, 1);
                qmVar.b.X0.addView(ylVar, 0, w7.y5.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, e6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                ylVar.addView(textView, w7.y5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ai.w0 w0Var = new ai.w0(qmVar, context, e6Var2, 14);
                qmVar.r = w0Var;
                w0Var.setAdapter(new org.telegram.ui.x7(qmVar, 3));
                s4.c0 c0Var = new s4.c0(1, false);
                qmVar.s = c0Var;
                w0Var.setLayoutManager(c0Var);
                w0Var.setClipChildren(false);
                w0Var.setClipToPadding(false);
                w0Var.setOverScrollMode(2);
                w0Var.setVerticalScrollBarEnabled(false);
                pm pmVar = new pm(qmVar, context);
                qmVar.v = pmVar;
                pmVar.setClipToPadding(true);
                pmVar.setClipChildren(true);
                qmVar.addView(w0Var, w7.y5.c(-1.0f, -1));
                qmVar.P = qmVar.b.j0;
                pmVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = qmVar.P;
                pmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                pmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                pmVar.c();
                UndoView undoView = new UndoView(context, null, false, qmVar.b.r);
                qmVar.w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                qmVar.addView(undoView, w7.y5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                qmVar.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.q0 = qmVar;
                qmVar.bringToFront();
            }
            ni niVar2 = this.y0;
            qm qmVar2 = this.q0;
            if (niVar2 != qmVar2) {
                niVar = qmVar2;
            }
            Q1(niVar);
        }
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        return (n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).K6();
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
        org.telegram.ui.ActionBar.v0 v0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        bi.o oVar;
        float max;
        int i12;
        float f14 = this.d.e;
        ni niVar = i10 == 0 ? this.y0 : this.z0;
        if (niVar == null || niVar.getVisibility() != 0) {
            return;
        }
        int p12 = p1(i10);
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
        float alpha = this.X0.getAlpha();
        xh xhVar = this.i1;
        float dp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - xhVar.getAlpha()) * 26.0f);
        boolean z10 = this.q1;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.a1;
        ci.n6 n6Var = this.O0;
        if (z10 && this.Q0 == 0 && !this.T0) {
            v0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37), ((p12 - AndroidUtilities.dp((i11 * f14) + 37.0f)) + dp) - (n6Var.getAlpha() * n6Var.getMeasuredHeight())) + this.l2);
        } else {
            v0Var2.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37)) + this.l2);
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.c1;
        if (v0Var3 != null) {
            v0Var3.setTranslationY(v0Var2.getTranslationY());
        }
        ci.f4 f4Var = this.d1;
        if (f4Var != null) {
            f4Var.setTranslationY(v0Var2.getTranslationY());
        }
        if (this.F && this.s1) {
            ni niVar2 = this.z0;
            if (niVar2 != null && this.y0 != null) {
                f7 = Math.min(niVar2.getTranslationY(), this.y0.getTranslationY());
            } else if (niVar2 != null) {
                f7 = niVar2.getTranslationY();
            }
            v0Var = this.e1;
            if (v0Var != null) {
                v0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i11 + 37)) + this.l2);
            }
            float dp2 = ((((p12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.l2) + f7) - (n6Var.getAlpha() * n6Var.getMeasuredHeight());
            this.p1 = dp2;
            xhVar.setTranslationY(Math.max(this.l2, dp2));
            n6Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.l2, (xhVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.p1 + AndroidUtilities.dp(8.0f)));
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
                un unVar = this.m0;
                if (unVar == this.z0) {
                    f11 = (unVar.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.d0;
                } else if (unVar == this.y0) {
                    f11 = (unVar.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
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
                    un unVar2 = this.n0;
                    if (unVar2 == this.z0) {
                        f13 = (unVar2.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.d0;
                    } else if (unVar2 == this.y0) {
                        f13 = (unVar2.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.z0 == null ? 1.0f : 1.0f - this.d0;
                    }
                    oVar = this.f1;
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
                        oVar.setTranslationY(Math.max(0.0f, max) + this.l2);
                        oVar.setTranslationX(-((measuredWidth * (1.0f - f14)) + AndroidUtilities.dp((7.0f * r5) + 12.0f)));
                    }
                    float max2 = Math.max(f12, f10);
                    this.h1 = max2;
                    if (oVar == null) {
                        float f15 = this.g1 * max2;
                        oVar.setAlpha(f15);
                        oVar.setVisibility(f15 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f12 = 0.0f;
                f13 = 0.0f;
                oVar = this.f1;
                if (oVar != null) {
                }
                float max22 = Math.max(f12, f10);
                this.h1 = max22;
                if (oVar == null) {
                }
            }
            f10 = 0.0f;
            f11 = 0.0f;
            if (this.n0 != null) {
            }
            f12 = 0.0f;
            f13 = 0.0f;
            oVar = this.f1;
            if (oVar != null) {
            }
            float max222 = Math.max(f12, f10);
            this.h1 = max222;
            if (oVar == null) {
            }
        }
        f7 = 0.0f;
        v0Var = this.e1;
        if (v0Var != null) {
        }
        float dp22 = ((((p12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.l2) + f7) - (n6Var.getAlpha() * n6Var.getMeasuredHeight());
        this.p1 = dp22;
        xhVar.setTranslationY(Math.max(this.l2, dp22));
        n6Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.l2, (xhVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.p1 + AndroidUtilities.dp(8.0f)));
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
        oVar = this.f1;
        if (oVar != null) {
        }
        float max2222 = Math.max(f12, f10);
        this.h1 = max2222;
        if (oVar == null) {
        }
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (!(n2Var instanceof org.telegram.ui.zn)) {
            return false;
        }
        return ChatActivityEnterView.I(this.J1, ((org.telegram.ui.zn) n2Var).a(), n2Var, charSequence);
    }

    public final void b2() {
        int i10 = 0;
        a2(0);
        this.r1.invalidate();
        ci.n6 n6Var = this.O0;
        n6Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout != null) {
            tl tlVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.V();
            if (tlVar != null && tlVar.getFastScroll() != null) {
                dl0 fastScroll = tlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1;
                if (this.c0) {
                    i10 = (int) (n6Var.getAlpha() * n6Var.getMeasuredHeight());
                }
                fastScroll.h0 = currentActionBarHeight + i10;
                tlVar.getFastScroll().invalidate();
            }
        }
        U1();
        g1();
    }

    public final void c1() {
        yh yhVar = this.y1;
        if (yhVar == null) {
            return;
        }
        int childCount = yhVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            yhVar.getChildAt(i10);
        }
        boolean z10 = this.h2;
        this.j1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
        this.o1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
        this.f1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        int themedColor = getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5);
        org.telegram.ui.ActionBar.v0 v0Var = this.a1;
        v0Var.setIconColor(themedColor);
        org.telegram.ui.ActionBar.j6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.ig : org.telegram.ui.ActionBar.j6.I5), v0Var.getBackground());
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        v0Var.G(getThemedColor(i11), false);
        v0Var.G(getThemedColor(i11), true);
        v0Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.c1;
        if (v0Var2 != null) {
            v0Var2.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.e1;
        if (v0Var3 != null) {
            v0Var3.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
            org.telegram.ui.ActionBar.j6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.ig : org.telegram.ui.ActionBar.j6.I5), v0Var3.getBackground());
        }
        ai aiVar = this.E0;
        org.telegram.ui.ActionBar.e6 e6Var = aiVar.M;
        eu euVar = aiVar.a;
        int i12 = aiVar.L;
        if (i12 == 0) {
            euVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, e6Var));
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            euVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i13, e6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, e6Var));
        } else if (i12 == 2 || i12 == 3) {
            euVar.setHintTextColor(-1929379841);
            euVar.setTextColor(-1);
            euVar.setCursorColor(-1);
            euVar.setHandlesColor(-1);
            euVar.setHighlightColor(822083583);
            euVar.quoteColor = -1;
        } else {
            euVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.t5, e6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, e6Var));
        }
        aiVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, e6Var), PorterDuff.Mode.MULTIPLY));
        fu fuVar = aiVar.d;
        if (fuVar != null) {
            fuVar.S();
        }
        yhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        int themedColor2 = getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5);
        y7 y7Var = this.X0;
        y7Var.B(themedColor2, false);
        y7Var.A(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.ig : org.telegram.ui.ActionBar.j6.I5), false);
        y7Var.setTitleColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.j6.w1(q12, this.shadowDrawable);
        fh.c cVar = this.F2;
        if (cVar.a.getColor() != q12) {
            cVar.a(q12);
            jh.f fVar = this.v1;
            if (fVar != null) {
                fVar.invalidate();
            }
            zh zhVar = this.w1;
            if (zhVar != null) {
                zhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i14 = 0;
        while (true) {
            ni[] niVarArr = this.w0;
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
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
            return;
        }
        this.navBarColorKey = -1;
        this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.j6.i5);
        AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.j6.h5), false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        return this.y0.b();
    }

    @Override // org.telegram.ui.ActionBar.f3
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.zn)) {
            return;
        }
        org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
        ju juVar = this.c0 ? this.P0 : this.E0;
        String obj = juVar != null ? juVar.getText().toString() : null;
        if (this.H1 == null) {
            ni niVar = this.y0;
            z11 = true;
            if (niVar != null) {
            }
            if (yf.v.g(this.J1).e(obj, znVar.d8) <= 0) {
                MessageObject messageObject = znVar.n5;
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
            si siVar = this.A1;
            if (siVar != null) {
                siVar.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public final void dismiss(boolean z10) {
        if (z10) {
            this.A2 = z10;
        }
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        ti tiVar = this.Z1;
        if (tiVar != null) {
            tiVar.x0(new gh(this, 2));
        } else {
            F1();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.y0.o(i10);
    }

    public final void e1() {
        float f7 = this.c.e;
        this.w1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f7) * (1.0f - this.d.e))), 1.0f - ((1.0f - this.b.e) * f7)));
    }

    public final void f1() {
        y10.d(this.F0, com.google.android.gms.internal.vision.e2.C(this.e.e, this.f.e, yf.f0.b(this.h.e), this.R1 ? 0.0f : 1.0f));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean g() {
        return true;
    }

    public final void g1() {
        fi fiVar = this.I0;
        xh xhVar = this.H0;
        ci.n6 n6Var = this.O0;
        if (n6Var == null || n6Var.getVisibility() != 0 || n6Var.getAlpha() == 0.0f) {
            xhVar.setTranslationY(this.g2);
            fiVar.setAlpha(1.0f);
            return;
        }
        float f7 = this.b.e;
        float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
        fiVar.setAlpha(abs * abs * abs * abs);
        xhVar.setTranslationY(AndroidUtilities.lerp(this.g2, ((n6Var.getTranslationY() + n6Var.getTop()) - xhVar.getTop()) + AndroidUtilities.dp(8.0f), qr.j.getInterpolation(f7)));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.w0;
            if (i10 >= niVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.i5));
                return arrayList;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null && (themeDescriptions = niVar.getThemeDescriptions()) != null) {
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
        org.telegram.ui.ActionBar.v0 v0Var = this.k1;
        if (v0Var != null) {
            this.j1.setTranslationY(0.0f);
            v0Var.setVisibility(8);
        }
    }

    public final void i1(bi.v vVar) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.j1;
        textView.setText(string);
        this.S0 = false;
        this.x1.setVisibility(8);
        this.Q0 = 1;
        this.F = true;
        this.G = true;
        this.i0 = false;
        this.J = vVar;
        org.telegram.ui.ActionBar.v0 v0Var = this.k1;
        if (v0Var != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            v0Var.setVisibility(0);
            v0Var.setClickable(true);
            v0Var.setAlpha(1.0f);
            v0Var.setScaleX(1.0f);
            v0Var.setScaleY(1.0f);
        }
    }

    public final int j1() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (!(n2Var instanceof org.telegram.ui.zn) || (messagePreviewParams = ((org.telegram.ui.zn) n2Var).f5) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        return n2Var instanceof org.telegram.ui.zn ? ((org.telegram.ui.zn) n2Var).e : MessagesController.getInstance(this.J1).getChat(Long.valueOf(-this.Z));
    }

    public final float l1() {
        return r0.getMeasuredHeight() - ((1.0f - this.D0.getAlpha()) * (r0.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final ju m1() {
        ni niVar;
        return (this.c0 && ((niVar = this.y0) == this.j0 || niVar == this.q0)) ? this.P0 : this.E0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        return n2Var instanceof org.telegram.ui.zn ? ((org.telegram.ui.zn) n2Var).a() : this.Z;
    }

    public final int o1() {
        ni niVar = this.y0;
        un unVar = this.m0;
        if (niVar == unVar && unVar.E != null) {
            return unVar.getEmojiPadding();
        }
        un unVar2 = this.n0;
        return (niVar != unVar2 || unVar2.E == null) ? this.c0 ? this.P0.getEmojiPadding() : this.E0.getEmojiPadding() : unVar2.getEmojiPadding();
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

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.y0.l(motionEvent);
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
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        s91 s91Var = chatAttachAlertPhotoLayout.l0;
        ai.f0 f0Var = chatAttachAlertPhotoLayout.j0;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        tl tlVar = chatAttachAlertPhotoLayout.r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        boolean z10 = i14 < i15;
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == f0Var) {
            if (z10) {
                if (tlVar.getVisibility() == 0) {
                    f0Var.layout(0, org.telegram.messenger.q.C(222.0f, i13, i16), i14, org.telegram.messenger.q.C(96.0f, i13, i16));
                    return true;
                }
                f0Var.layout(0, org.telegram.messenger.q.C(126.0f, i13, i16), i14, i13 - i16);
                return true;
            }
            if (tlVar.getVisibility() == 0) {
                f0Var.layout(org.telegram.messenger.q.C(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            }
            f0Var.layout(org.telegram.messenger.q.C(126.0f, i12, i16), 0, i12, i15 - i16);
            return true;
        }
        if (view == s91Var) {
            if (z10) {
                if (tlVar.getVisibility() == 0) {
                    s91Var.layout(0, org.telegram.messenger.q.C(310.0f, i13, i16), i14, org.telegram.messenger.q.C(260.0f, i13, i16));
                    return true;
                }
                s91Var.layout(0, org.telegram.messenger.q.C(176.0f, i13, i16), i14, org.telegram.messenger.q.C(126.0f, i13, i16));
                return true;
            }
            if (tlVar.getVisibility() == 0) {
                s91Var.layout(org.telegram.messenger.q.C(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            }
            s91Var.layout(org.telegram.messenger.q.C(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
            return true;
        }
        if (view != textView) {
            if (view != tlVar) {
                return false;
            }
            if (z10) {
                int C = org.telegram.messenger.q.C(88.0f, i15, i16);
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
            if (tlVar.getVisibility() == 0) {
                dp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = dp3 - i16;
        } else {
            dp = i12 - AndroidUtilities.dp(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
            textView.setRotation(-90.0f);
            if (tlVar.getVisibility() == 0) {
                dp -= AndroidUtilities.dp(96.0f);
            }
        }
        textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        hm hmVar = chatAttachAlertPhotoLayout.v;
        tl tlVar = chatAttachAlertPhotoLayout.r;
        gg.b0 b0Var = chatAttachAlertPhotoLayout.s;
        boolean z10 = i10 < i11;
        dm dmVar = chatAttachAlertPhotoLayout.P;
        if (view != dmVar) {
            ai.f0 f0Var = chatAttachAlertPhotoLayout.j0;
            if (view == f0Var) {
                if (z10) {
                    f0Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30));
                    return true;
                }
                f0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            s91 s91Var = chatAttachAlertPhotoLayout.l0;
            if (view == s91Var) {
                if (z10) {
                    s91Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                    return true;
                }
                s91Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            if (view == tlVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    tlVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
                    if (b0Var.o != 0) {
                        tlVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        b0Var.j1(0);
                        hmVar.l();
                    }
                } else {
                    tlVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                    if (b0Var.o != 1) {
                        tlVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        b0Var.j1(1);
                        hmVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.b0 && !chatAttachAlertPhotoLayout.d0) {
            dmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomOpenAnimation() {
        this.j0.setTranslationX(0.0f);
        this.n1.setAlpha(0.0f);
        this.l1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.q2 = animatorSet;
        int i10 = 2;
        ji jiVar = this.o2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, jiVar, 0.0f, 400.0f));
        this.q2.setDuration(400L);
        this.q2.setStartDelay(20L);
        jiVar.set(this, Float.valueOf(0.0f));
        this.q2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new eh(this, i10));
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
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.backDrawable, s6.d, this.dimBehind ? this.dimBehindAlpha : 0));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        org.telegram.messenger.video.o oVar = new org.telegram.messenger.video.o(this, animationNotificationsLocker, this.delegate, 14);
        this.p2.a(new ei.m4(i10, this, oVar));
        this.currentSheetAnimation.addListener(new ai.z(22, this, oVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new eh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(qr.f);
        ofFloat2.start();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onDismissWithTouchOutside() {
        if (this.y0.p()) {
            dismiss();
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.y0.B(i10)) {
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
        this.y0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.s1 = true;
        if (this.M1 || this.L1) {
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
        ni niVar = this.z0;
        int[] iArr = this.b2;
        return (niVar == null || !((this.y0 instanceof qm) || (niVar instanceof qm))) ? iArr[i10] : AndroidUtilities.lerp(iArr[0], iArr[1], this.d0);
    }

    public final int q1(boolean z10) {
        y7 y7Var;
        if (this.h2) {
            return getThemedColor(org.telegram.ui.ActionBar.j6.tg);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.resourcesProvider;
        boolean a2 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
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
        vi viVar;
        dm dmVar;
        MediaController.AlbumEntry albumEntry;
        ni niVar;
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
        xh xhVar = this.x1;
        xhVar.setAlpha(1.0f);
        xhVar.setTranslationY(0.0f);
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.x0;
            if (i11 >= longSparseArray.size()) {
                break;
            }
            ((ei.q4) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
            i11++;
        }
        int i12 = this.Q0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (i12 != 2) {
            if (n2Var instanceof org.telegram.ui.zn) {
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
                chat = znVar.e;
                user = znVar.i();
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
            z10 = n2Var instanceof org.telegram.ui.zn;
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
                    this.P1 = !z10 || ((org.telegram.ui.zn) n2Var).h == null;
                }
            }
            if (this.R1) {
                this.O1 = false;
                this.P1 = false;
            }
            ai aiVar = this.E0;
            if (z10 || this.Q0 == 2) {
                aiVar.setVisibility(this.W ? 0 : 4);
            }
            boolean z11 = this.M1;
            boolean z12 = this.L1;
            boolean z13 = this.K1;
            chatAttachAlertPhotoLayout = this.j0;
            viVar = chatAttachAlertPhotoLayout.b;
            mz mzVar = chatAttachAlertPhotoLayout.H;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z11;
            chatAttachAlertPhotoLayout.x0 = z12;
            chatAttachAlertPhotoLayout.z0 = z13;
            dmVar = chatAttachAlertPhotoLayout.P;
            if (dmVar != null) {
                dmVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.P.setEnabled(chatAttachAlertPhotoLayout.v0);
            }
            if (!((viVar.f0 instanceof org.telegram.ui.zn) && viVar.k1() == null) && viVar.Q0 == 0) {
                chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
                if (chatAttachAlertPhotoLayout.v0) {
                    mzVar.setText(LocaleController.getString(R.string.NoPhotos));
                    mzVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat k12 = viVar.k1();
                    mzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    if (ChatObject.isActionBannedByDefault(k12, 7)) {
                        mzVar.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else if (AndroidUtilities.isBannedForever(k12.banned_rights)) {
                        mzVar.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                    } else {
                        mzVar.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(k12.banned_rights.until_date)));
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
                if (mzVar != null) {
                    mzVar.c();
                }
            }
            chatAttachAlertPhotoLayout.u0();
            aiVar.k(true);
            this.P0.k(true);
            this.u1 = false;
            setFocusable(false);
            if (!this.O || this.P) {
                if (this.o0 == null) {
                    gl glVar = new gl(this, getContext(), this.resourcesProvider, (this.H || this.P || this.R1) ? false : true);
                    this.o0 = glVar;
                    this.w0[5] = glVar;
                    bl blVar = this.t2;
                    if (blVar != null) {
                        glVar.setDelegate(blVar);
                    } else {
                        glVar.setDelegate(new dh(this, i10));
                    }
                }
                this.W0 = 5L;
                niVar = this.o0;
            } else if (this.N) {
                E1(false);
                niVar = this.p0;
                this.W0 = 4L;
            } else {
                MessageObject messageObject = this.H1;
                if (messageObject != null) {
                    int i15 = this.G1;
                    if (i15 == -1) {
                        this.S0 = true;
                        if (messageObject.isMusic()) {
                            B1(false);
                            niVar = this.l0;
                            this.W0 = 3L;
                        } else if (this.H1.isDocument()) {
                            E1(false);
                            niVar = this.p0;
                            this.W0 = 4L;
                        } else {
                            this.W0 = 1L;
                        }
                    } else {
                        if (i15 == 2) {
                            B1(false);
                            niVar = this.l0;
                            this.W0 = 3L;
                        } else if (i15 == 1) {
                            E1(false);
                            niVar = this.p0;
                            this.W0 = 4L;
                        } else {
                            this.W0 = 1L;
                            niVar = chatAttachAlertPhotoLayout;
                        }
                        this.S0 = false;
                    }
                } else {
                    this.S0 = this.Q0 == 0 && !this.T0;
                    this.W0 = 1L;
                }
                niVar = chatAttachAlertPhotoLayout;
            }
            xhVar.setVisibility(this.S0 ? 0 : 8);
            if (this.y0 != niVar) {
                y7 y7Var = this.X0;
                if (y7Var.n0) {
                    y7Var.h(true);
                }
                this.containerView.removeView(this.y0);
                this.y0.r();
                this.y0.setVisibility(8);
                this.y0.q();
                this.y0 = niVar;
                this.allowNestedScroll = true;
                if (niVar.getParent() == null) {
                    this.containerView.addView(this.y0, 0, w7.y5.c(-1.0f, -1));
                }
                niVar.setAlpha(1.0f);
                niVar.setVisibility(0);
                niVar.E(null);
                niVar.F();
                y7Var.setVisibility(niVar.h() != 0 ? 0 : 4);
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
        z10 = n2Var instanceof org.telegram.ui.zn;
        if (z10) {
            if (chat != null) {
            }
            if (this.R1) {
            }
            ai aiVar2 = this.E0;
            if (z10) {
            }
            aiVar2.setVisibility(this.W ? 0 : 4);
            boolean z112 = this.M1;
            boolean z122 = this.L1;
            boolean z132 = this.K1;
            chatAttachAlertPhotoLayout = this.j0;
            viVar = chatAttachAlertPhotoLayout.b;
            mz mzVar2 = chatAttachAlertPhotoLayout.H;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z112;
            chatAttachAlertPhotoLayout.x0 = z122;
            chatAttachAlertPhotoLayout.z0 = z132;
            dmVar = chatAttachAlertPhotoLayout.P;
            if (dmVar != null) {
            }
            if (viVar.f0 instanceof org.telegram.ui.zn) {
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
            aiVar2.k(true);
            this.P0.k(true);
            this.u1 = false;
            setFocusable(false);
            if (this.O) {
            }
            if (this.o0 == null) {
            }
            this.W0 = 5L;
            niVar = this.o0;
            xhVar.setVisibility(this.S0 ? 0 : 8);
            if (this.y0 != niVar) {
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
        ai aiVar22 = this.E0;
        if (z10) {
        }
        aiVar22.setVisibility(this.W ? 0 : 4);
        boolean z1122 = this.M1;
        boolean z1222 = this.L1;
        boolean z1322 = this.K1;
        chatAttachAlertPhotoLayout = this.j0;
        viVar = chatAttachAlertPhotoLayout.b;
        mz mzVar22 = chatAttachAlertPhotoLayout.H;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.v0 = z14;
        chatAttachAlertPhotoLayout.w0 = z1122;
        chatAttachAlertPhotoLayout.x0 = z1222;
        chatAttachAlertPhotoLayout.z0 = z1322;
        dmVar = chatAttachAlertPhotoLayout.P;
        if (dmVar != null) {
        }
        if (viVar.f0 instanceof org.telegram.ui.zn) {
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
        aiVar22.k(true);
        this.P0.k(true);
        this.u1 = false;
        setFocusable(false);
        if (this.O) {
        }
        if (this.o0 == null) {
        }
        this.W0 = 5L;
        niVar = this.o0;
        xhVar.setVisibility(this.S0 ? 0 : 8);
        if (this.y0 != niVar) {
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
        ni niVar = this.y0;
        return niVar == this.j0 || niVar == this.q0;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean shouldOverlayCameraViewOverNavBar() {
        ni niVar = this.y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        return niVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.i1;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        this.I1 = false;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            this.calcMandatoryInsets = ((org.telegram.ui.zn) n2Var).x9();
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
        ti tiVar = this.Z1;
        if (tiVar == null || this.u1) {
            return;
        }
        boolean c02 = tiVar.c0();
        this.u1 = true;
        AndroidUtilities.runOnUIThread(new ci.y0(this, editTextBoldCursor, z10, 18), c02 ? 200L : 0L);
    }

    public final void u1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int q12 = q1(false);
        org.telegram.ui.ActionBar.j6.w1(q12, this.shadowDrawable);
        fh.c cVar = this.F2;
        if (cVar.a.getColor() != q12) {
            cVar.a(q12);
            jh.f fVar = this.v1;
            if (fVar != null) {
                fVar.invalidate();
            }
            zh zhVar = this.w1;
            if (zhVar != null) {
                zhVar.invalidate();
            }
        }
        W1();
        this.containerView.invalidate();
    }

    public final void v1() {
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.w0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.m();
            }
            i10++;
        }
        int i11 = this.J1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        ai aiVar = this.E0;
        if (aiVar != null) {
            aiVar.o();
        }
        di diVar = this.P0;
        if (diVar != null) {
            diVar.o();
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

    public final void x1() {
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.w0;
            if (i10 >= niVarArr.length) {
                this.f2 = true;
                return;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.x();
            }
            i10++;
        }
    }

    public final void y1() {
        int i10 = 0;
        this.f2 = false;
        while (true) {
            ni[] niVarArr = this.w0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null) {
                niVar.z();
            }
            i10++;
        }
        if (isShowing()) {
            this.Z1.c0();
        }
        si siVar = this.A1;
        if (siVar != null) {
            siVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.H1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        int i10 = this.J1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.H1.getDialogId()) && (n2Var instanceof org.telegram.ui.zn)) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
            MessageSuggestionParams messageSuggestionParams = znVar.g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.H1.messageOwner.suggested_post);
            }
            if (!yh.t5.U(i10, messageSuggestionParams.amount)) {
                znVar.Tb(messageSuggestionParams);
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
            O1(n2Var);
            return;
        }
        if (this.H1 == null && (n2Var instanceof org.telegram.ui.zn)) {
            org.telegram.ui.zn znVar2 = (org.telegram.ui.zn) n2Var;
            if (znVar2.c()) {
                e5.M(getContext(), znVar2.a(), new dh(this, 12), this.resourcesProvider);
                return;
            }
        }
        ni niVar = this.y0;
        if (niVar == this.j0 || niVar == this.q0) {
            G1(0, true, 0, s1(), this.N0);
            return;
        }
        if (niVar.I(0, true, 0, s1(), this.N0)) {
            return;
        }
        this.A2 = true;
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        if (this.y0.n() || isDismissed()) {
            return;
        }
        ai aiVar = this.E0;
        if (aiVar != null) {
            AndroidUtilities.hideKeyboard(aiVar.getEditText());
        }
        di diVar = this.P0;
        if (diVar != null) {
            AndroidUtilities.hideKeyboard(diVar.getEditText());
        }
        this.x0.clear();
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        if (!this.A2 && n2Var != null && this.y0.getSelectedItemsCount() > 0 && !this.F) {
            if (this.z2) {
                return;
            }
            this.z2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new dh(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new jh(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.N = b1Var;
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            ni[] niVarArr = this.w0;
            if (i10 >= niVarArr.length) {
                break;
            }
            ni niVar = niVarArr[i10];
            if (niVar != null && this.y0 != niVar) {
                niVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.a7), 0), true, (AndroidUtilities.IntColorCallback) new dh(this, 11));
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
        this.i2 = false;
        super.dismiss();
        this.A2 = false;
    }

    @Override // le.d
    public final /* synthetic */ void C(float f7, int i10) {
    }

    public vi(Activity activity, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        this(activity, n2Var, z10, z11, true, null);
    }
}

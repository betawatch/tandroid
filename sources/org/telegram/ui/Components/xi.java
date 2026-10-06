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
import org.telegram.ui.cj1;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public class xi extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.z2, le.d {
    public static final /* synthetic */ int H2 = 0;
    public final ch.d A0;
    public final ui A1;
    public boolean A2;
    public final ch.d B0;
    public boolean B1;
    public ci.i B2;
    public final hg.k C0;
    public final RadialProgressView C1;
    public final ah.i C2;
    public final wh D0;
    public boolean D1;
    public final fh.c D2;
    public final i0 E;
    public final zh E0;
    public final p6 E1;
    public final ah.c E2;
    public boolean F;
    public final ImageView F0;
    public float F1;
    public final ah.c F2;
    public boolean G;
    public final int[] G0;
    public int G1;
    public final mh G2;
    public boolean H;
    public final wh H0;
    public MessageObject H1;
    public int I;
    public final ei I0;
    public boolean I1;
    public Utilities.Callback2 J;
    public final TextPaint J0;
    public final int J1;
    public int K;
    public final RectF K0;
    public boolean K1;
    public int L;
    public final Paint L0;
    public boolean L1;
    public boolean M;
    public AnimatorSet M0;
    public boolean M1;
    public boolean N;
    public long N0;
    public boolean N1;
    public boolean O;
    public final ci.m6 O0;
    public boolean O1;
    public boolean P;
    public final bi P0;
    public boolean P1;
    public w40 Q;
    public int Q0;
    public boolean Q1;
    public boolean R;
    public tt R0;
    public boolean R1;
    public final ee0 S;
    public boolean S0;
    public int S1;
    public yn T;
    public boolean T0;
    public boolean T1;
    public y40 U;
    public boolean U0;
    public boolean U1;
    public boolean V;
    public final float V0;
    public float V1;
    public boolean W;
    public long W0;
    public float W1;
    public ik X;
    public final y7 X0;
    public ValueAnimator X1;
    public gj Y;
    public AnimatorSet Y0;
    public int Y1;
    public long Z;
    public AnimatorSet Z0;
    public vi Z1;
    public boolean a0;
    public final org.telegram.ui.ActionBar.v0 a1;
    public in a2;
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
    public ci.e4 d1;
    public float d2;
    public final le.b e;
    public final ii e0;
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
    public of h0;
    public float h1;
    public final boolean h2;
    public boolean i0;
    public final wh i1;
    public boolean i2;
    public final ChatAttachAlertPhotoLayout j0;
    public final TextView j1;
    public final ArrayList j2;
    public bk k0;
    public final org.telegram.ui.ActionBar.v0 k1;
    public final Rect k2;
    public jj l0;
    public final LinearLayout l1;
    public float l2;
    public xn m0;
    public final ImageView m1;
    public boolean m2;
    public final le.l n;
    public xn n0;
    public final LinearLayout n1;
    public int n2;
    public jl o0;
    public final TextView o1;
    public final ii o2;
    public rk p0;
    public float p1;
    public o1.k p2;
    public tm q0;
    public boolean q1;
    public AnimatorSet q2;
    public org.telegram.ui.wn r;
    public mj r0;
    public final ki r1;
    public boolean r2;
    public final p6 s;
    public hg.j0 s0;
    public boolean s1;
    public boolean s2;
    public sk t0;
    public Object t1;
    public el t2;
    public sk u0;
    public boolean u1;
    public boolean u2;
    public final p6 v;
    public ii.r v0;
    public final jh.f v1;
    public boolean v2;
    public final ImageView w;
    public final pi[] w0;
    public final yh w1;
    public File w2;
    public final i0 x;
    public final LongSparseArray x0;
    public final wh x1;
    public double[] x2;
    public final ImageView y;
    public pi y0;
    public final xh y1;
    public boolean y2;
    public pi z0;
    public final s4.c0 z1;
    public boolean z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        org.telegram.ui.ActionBar.v0 v0Var;
        bi.o oVar;
        ki kiVar;
        int i10;
        float f7;
        int i11 = 0;
        tr trVar = tr.h;
        this.b = new le.b(0, this, trVar, 380L, false);
        this.c = new le.b(1, this, trVar, 380L, false);
        this.d = new le.b(2, this, trVar, 380L, false);
        this.e = new le.b(3, this, trVar, 380L, false);
        this.f = new le.b(4, this, trVar, 380L, true);
        this.h = new le.b(5, this, trVar, 320L, false);
        le.l lVar = new le.l(new fh(this, 1), trVar, 380L);
        this.n = lVar;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.d0 = 0.0f;
        this.e0 = new ii(this, 0);
        this.i0 = false;
        pi[] piVarArr = new pi[11];
        this.w0 = piVarArr;
        this.x0 = new LongSparseArray();
        this.G0 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.J0 = textPaint;
        this.K0 = new RectF();
        this.L0 = new Paint(1);
        this.U0 = true;
        this.V0 = 1.0f;
        this.B1 = false;
        this.D1 = false;
        int i12 = UserConfig.selectedAccount;
        this.J1 = i12;
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
        this.o2 = new ii(this, 1);
        this.r2 = true;
        this.s2 = false;
        this.z2 = false;
        this.A2 = false;
        this.occupyNavigationBarWithoutKeyboard = true;
        fh.c cVar = new fh.c();
        this.D2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        this.glassEngine.A.add(new li.n(cVar, new fh(this, 4)));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.C2 = null;
            this.E2 = new ah.c(cVar);
            this.F2 = new ah.c(cVar);
        } else {
            ah.i iVar = new ah.i();
            this.C2 = iVar;
            this.glassEngine.a(iVar);
            fh.d dVar = new fh.d(cVar);
            dVar.f = cVar;
            dVar.d = iVar;
            dVar.e = -2;
            fh.d dVar2 = new fh.d(null);
            dVar2.f = cVar;
            dVar2.d = iVar;
            dVar2.e = -3;
            ah.c cVar2 = new ah.c(dVar);
            this.E2 = cVar2;
            cVar2.i = LiteMode.isEnabled(262144);
            int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
            cVar2.b = dp;
            cVar2.c = dp;
            ah.c cVar3 = new ah.c(dVar2);
            this.F2 = cVar3;
            cVar3.i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(48.0f);
            cVar3.b = dp2;
            cVar3.c = dp2;
        }
        ah.c cVar4 = new ah.c(cVar);
        this.G2 = new mh(this, i11);
        this.h2 = z10;
        this.g0 = (n2Var instanceof org.telegram.ui.yn) && n2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.f0 = n2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        ki kiVar2 = new ki(this, context);
        this.r1 = kiVar2;
        kiVar2.setDelegate(new li(this));
        this.containerView = kiVar2;
        kiVar2.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        y7 y7Var = new y7(this, context, d6Var, 1);
        this.X0 = y7Var;
        y7Var.U0 = true;
        y7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        y7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        int i14 = org.telegram.ui.ActionBar.i6.j5;
        y7Var.A(getThemedColor(i14), false);
        int i15 = org.telegram.ui.ActionBar.i6.I5;
        y7Var.z(getThemedColor(i15), false);
        y7Var.setTitleColor(getThemedColor(i14));
        y7Var.setOccupyStatusBar(true);
        y7Var.setAlpha(0.0f);
        y7Var.setActionBarMenuOnItemClick(new org.telegram.ui.qo(this, 8));
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i14), false, d6Var);
        this.a1 = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setIcon(R.drawable.ic_ab_other);
        v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var2.setVisibility(4);
        v0Var2.setAlpha(0.0f);
        v0Var2.setScaleX(0.6f);
        v0Var2.setScaleY(0.6f);
        v0Var2.setSubMenuOpenSide(2);
        v0Var2.setDelegate(new fh(this, 10));
        v0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        v0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        v0Var2.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i15), 6, -1));
        final int i16 = 5;
        v0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jh
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.r4 r4Var;
                switch (i16) {
                    case 0:
                        xi xiVar = this.b;
                        xiVar.Y1(xiVar.y0 != xiVar.q0);
                        break;
                    case 1:
                        xi xiVar2 = this.b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        xi xiVar3 = this.b;
                        boolean z13 = xiVar3.c0;
                        if (!z13) {
                            xiVar3.G1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        xi xiVar4 = this.b;
                        boolean z14 = xiVar4.c0;
                        if (z14) {
                            xiVar4.G1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.y1();
                        break;
                    case 5:
                        this.b.a1.M(null, null);
                        break;
                    case 6:
                        xi.p(this.b);
                        break;
                    case 7:
                        pi piVar = this.b.y0;
                        if (piVar != null) {
                            piVar.t(40);
                            break;
                        }
                        break;
                    default:
                        this.b.k1.M(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i14), false, d6Var);
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
        int themedColor = getThemedColor(i15);
        final int i17 = 6;
        v0Var3.setBackground(org.telegram.ui.ActionBar.i6.f0(themedColor, 6, -1));
        v0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jh
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.r4 r4Var;
                switch (i17) {
                    case 0:
                        xi xiVar = this.b;
                        xiVar.Y1(xiVar.y0 != xiVar.q0);
                        break;
                    case 1:
                        xi xiVar2 = this.b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        xi xiVar3 = this.b;
                        boolean z13 = xiVar3.c0;
                        if (!z13) {
                            xiVar3.G1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        xi xiVar4 = this.b;
                        boolean z14 = xiVar4.c0;
                        if (z14) {
                            xiVar4.G1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.y1();
                        break;
                    case 5:
                        this.b.a1.M(null, null);
                        break;
                    case 6:
                        xi.p(this.b);
                        break;
                    case 7:
                        pi piVar = this.b.y0;
                        if (piVar != null) {
                            piVar.t(40);
                            break;
                        }
                        break;
                    default:
                        this.b.k1.M(null, null);
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
        final int i18 = 7;
        oVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jh
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.r4 r4Var;
                switch (i18) {
                    case 0:
                        xi xiVar = this.b;
                        xiVar.Y1(xiVar.y0 != xiVar.q0);
                        break;
                    case 1:
                        xi xiVar2 = this.b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        xi xiVar3 = this.b;
                        boolean z13 = xiVar3.c0;
                        if (!z13) {
                            xiVar3.G1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        xi xiVar4 = this.b;
                        boolean z14 = xiVar4.c0;
                        if (z14) {
                            xiVar4.G1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.y1();
                        break;
                    case 5:
                        this.b.a1.M(null, null);
                        break;
                    case 6:
                        xi.p(this.b);
                        break;
                    case 7:
                        pi piVar = this.b.y0;
                        if (piVar != null) {
                            piVar.t(40);
                            break;
                        }
                        break;
                    default:
                        this.b.k1.M(null, null);
                        break;
                }
            }
        });
        w7.b6.a(oVar2);
        this.f1 = oVar2;
        V1();
        if (n2Var != null) {
            kiVar = kiVar2;
            oVar = oVar2;
            v0Var = v0Var3;
            i10 = 4;
            f7 = 14.0f;
            org.telegram.ui.ActionBar.v0 v0Var4 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i14), false, d6Var);
            this.e1 = v0Var4;
            v0Var4.setLongClickEnabled(false);
            v0Var4.setIcon(R.drawable.outline_header_search);
            v0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            v0Var4.setVisibility(4);
            v0Var4.setAlpha(0.0f);
            v0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            v0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i15), 6, -1));
            v0Var4.setOnClickListener(new ai.j3(5, this, z11));
        } else {
            v0Var = v0Var3;
            oVar = oVar2;
            kiVar = kiVar2;
            i10 = 4;
            f7 = 14.0f;
        }
        org.telegram.ui.ActionBar.v0 v0Var5 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i14), false, d6Var);
        this.k1 = v0Var5;
        v0Var5.setLongClickEnabled(false);
        v0Var5.setIcon(R.drawable.ic_ab_other);
        v0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        final int i19 = 8;
        v0Var5.setVisibility(8);
        v0Var5.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i15), 3, -1));
        final int i20 = 2;
        v0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        final xi xiVar = this.b;
                        zh zhVar = xiVar.E0;
                        if (zhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(xiVar.getContext(), d6Var);
                            e0Var.m0(zhVar.getText());
                            final int i21 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.nh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i21) {
                                        case 0:
                                            zh zhVar2 = xiVar.E0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            bi biVar = xiVar.P0;
                                            biVar.setText(charSequence);
                                            biVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = xiVar.Z;
                            boolean z13 = xiVar.H1 != null;
                            oh ohVar = new oh(xiVar, 0);
                            e0Var.l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.n0 = ohVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final xi xiVar2 = this.b;
                        bi biVar = xiVar2.P0;
                        if (biVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(xiVar2.getContext(), d6Var);
                            e0Var2.m0(biVar.getText());
                            final int i22 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.nh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i22) {
                                        case 0:
                                            zh zhVar2 = xiVar2.E0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            bi biVar2 = xiVar2.P0;
                                            biVar2.setText(charSequence);
                                            biVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = xiVar2.Z;
                            boolean z14 = xiVar2.H1 != null;
                            oh ohVar2 = new oh(xiVar2, 1);
                            e0Var2.l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = ohVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        xi xiVar3 = this.b;
                        xiVar3.k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = xiVar3.f0;
                        t12.K2(null, n2Var2, d6Var);
                        PhotoViewer.t1().L2(xiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i23 = xiVar3.S1;
                        boolean z15 = xiVar3.T1;
                        t13.h = i23;
                        t13.n = z15;
                        if (!xiVar3.Z1.a0()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(xiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.k8.w(xiVar3.J1, "webp");
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
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList2.add(photoEntry);
                        PhotoViewer.t1().g2(arrayList2, 0, 11, false, new oi(xiVar3, photoEntry), n2Var2 instanceof org.telegram.ui.yn ? (org.telegram.ui.yn) n2Var2 : null);
                        if (xiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, xiVar3.J);
                            break;
                        }
                        break;
                }
            }
        });
        v0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        v0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        v0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jh
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.r4 r4Var;
                switch (i19) {
                    case 0:
                        xi xiVar = this.b;
                        xiVar.Y1(xiVar.y0 != xiVar.q0);
                        break;
                    case 1:
                        xi xiVar2 = this.b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        xi xiVar3 = this.b;
                        boolean z13 = xiVar3.c0;
                        if (!z13) {
                            xiVar3.G1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        xi xiVar4 = this.b;
                        boolean z14 = xiVar4.c0;
                        if (z14) {
                            xiVar4.G1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.y1();
                        break;
                    case 5:
                        this.b.a1.M(null, null);
                        break;
                    case 6:
                        xi.p(this.b);
                        break;
                    case 7:
                        pi piVar = this.b.y0;
                        if (piVar != null) {
                            piVar.t(40);
                            break;
                        }
                        break;
                    default:
                        this.b.k1.M(null, null);
                        break;
                }
            }
        });
        final int i21 = 0;
        wh whVar = new wh(this, context, i21);
        this.i1 = whVar;
        whVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jh
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.r4 r4Var;
                switch (i21) {
                    case 0:
                        xi xiVar = this.b;
                        xiVar.Y1(xiVar.y0 != xiVar.q0);
                        break;
                    case 1:
                        xi xiVar2 = this.b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        xi xiVar3 = this.b;
                        boolean z13 = xiVar3.c0;
                        if (!z13) {
                            xiVar3.G1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        xi xiVar4 = this.b;
                        boolean z14 = xiVar4.c0;
                        if (z14) {
                            xiVar4.G1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.y1();
                        break;
                    case 5:
                        this.b.a1.M(null, null);
                        break;
                    case 6:
                        xi.p(this.b);
                        break;
                    case 7:
                        pi piVar = this.b.y0;
                        if (piVar != null) {
                            piVar.t(40);
                            break;
                        }
                        break;
                    default:
                        this.b.k1.M(null, null);
                        break;
                }
            }
        });
        whVar.setAlpha(0.0f);
        whVar.setVisibility(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.l1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.j1 = textView;
        textView.setTextColor(getThemedColor(i14));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.m1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor2 = getThemedColor(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        whVar.addView(linearLayout, w7.z5.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i14), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.o1 = textView2;
        textView2.setTextColor(getThemedColor(i14));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, w7.z5.q(-2, -2, 16));
        whVar.addView(linearLayout2, w7.z5.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, d6Var);
        this.j0 = chatAttachAlertPhotoLayout;
        piVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.y0 = chatAttachAlertPhotoLayout;
        this.W0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, w7.z5.c(-1.0f, -1));
        jh.f fVar = new jh.f(context);
        this.v1 = fVar;
        fVar.setup(cVar4);
        fVar.setFadeTopAlpha(0);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(fVar, w7.z5.g());
        this.containerView.addView(whVar, w7.z5.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ci.m6 m6Var = new ci.m6(context, 8);
        this.O0 = m6Var;
        this.containerView.addView(m6Var, w7.z5.e(-1, -2, 55));
        this.containerView.addView(y7Var, w7.z5.c(-2.0f, -1));
        this.containerView.addView(v0Var2, w7.z5.e(48, 48, 53));
        this.containerView.addView(v0Var, w7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var6 = this.e1;
        if (v0Var6 != null) {
            this.containerView.addView(v0Var6, w7.z5.e(48, 48, 53));
        }
        whVar.addView(v0Var5, w7.z5.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(oVar, w7.z5.e(-2, 48, 53));
        wh whVar2 = new wh(this, context, 1);
        this.x1 = whVar2;
        xh xhVar = new xh(context, 0);
        this.y1 = xhVar;
        xhVar.setClipChildren(true);
        xhVar.setClipToPadding(false);
        ui uiVar = new ui(this, context);
        this.A1 = uiVar;
        xhVar.setAdapter(uiVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.z1 = c0Var;
        xhVar.setLayoutManager(c0Var);
        xhVar.setVerticalScrollBarEnabled(false);
        xhVar.setHorizontalScrollBarEnabled(false);
        xhVar.setItemAnimator(null);
        xhVar.setLayoutAnimation(null);
        xhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.i6.A5));
        xhVar.z2 = true;
        final int i22 = 2;
        xhVar.setOverScrollMode(2);
        ah.c cVar5 = this.E2;
        li.p pVar = this.glassEngine;
        cVar5.h = pVar;
        this.F2.h = pVar;
        cVar4.h = pVar;
        yh yhVar = new yh(this, context, 0);
        this.w1 = yhVar;
        ah.e eVar = new ah.e(cVar4.c(yhVar, null, false));
        this.b0 = eVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        eVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(yhVar, w7.z5.g());
        ch.d c10 = this.E2.c(whVar2, eh.b.f(d6Var), false);
        c10.y(AndroidUtilities.dp(28.0f));
        c10.x(AndroidUtilities.dp(7.0f));
        whVar2.setBackground(c10);
        xhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        xhVar.setClipToOutline(true);
        int dp3 = AndroidUtilities.dp(11.0f);
        float dp4 = AndroidUtilities.dp(28.0f);
        ai.k2 k2Var = yf.f0.a;
        xhVar.setOutlineProvider(new yf.d0(dp3, dp4));
        xhVar.setImportantForAccessibility(1);
        whVar2.addView(xhVar, w7.z5.g());
        this.containerView.addView(whVar2, w7.z5.e(-1, 70, 81));
        xhVar.setOnItemClickListener(new ai.n6(9, this, d6Var));
        xhVar.setOnItemLongClickListener(new fh(this, 3));
        p6 p6Var = new p6(context, true, false, true);
        this.E1 = p6Var;
        p6Var.setVisibility(8);
        p6Var.setAlpha(0.0f);
        p6Var.setGravity(17);
        p6Var.setTypeface(AndroidUtilities.bold());
        int dp5 = AndroidUtilities.dp(16.0f);
        p6Var.setPadding(dp5, 0, dp5, 0);
        p6Var.setTextSize(AndroidUtilities.dp(f7));
        final int i23 = 1;
        p6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jh
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.r4 r4Var;
                switch (i23) {
                    case 0:
                        xi xiVar = this.b;
                        xiVar.Y1(xiVar.y0 != xiVar.q0);
                        break;
                    case 1:
                        xi xiVar2 = this.b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        xi xiVar3 = this.b;
                        boolean z13 = xiVar3.c0;
                        if (!z13) {
                            xiVar3.G1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        xi xiVar4 = this.b;
                        boolean z14 = xiVar4.c0;
                        if (z14) {
                            xiVar4.G1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.y1();
                        break;
                    case 5:
                        this.b.a1.M(null, null);
                        break;
                    case 6:
                        xi.p(this.b);
                        break;
                    case 7:
                        pi piVar = this.b.y0;
                        if (piVar != null) {
                            piVar.t(40);
                            break;
                        }
                        break;
                    default:
                        this.b.k1.M(null, null);
                        break;
                }
            }
        });
        this.containerView.addView(p6Var, w7.z5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, w7.z5.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.F0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.i6.z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor3, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jh
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.r4 r4Var;
                switch (i22) {
                    case 0:
                        xi xiVar = this.b;
                        xiVar.Y1(xiVar.y0 != xiVar.q0);
                        break;
                    case 1:
                        xi xiVar2 = this.b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        xi xiVar3 = this.b;
                        boolean z13 = xiVar3.c0;
                        if (!z13) {
                            xiVar3.G1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        xi xiVar4 = this.b;
                        boolean z14 = xiVar4.c0;
                        if (z14) {
                            xiVar4.G1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.y1();
                        break;
                    case 5:
                        this.b.a1.M(null, null);
                        break;
                    case 6:
                        xi.p(this.b);
                        break;
                    case 7:
                        pi piVar = this.b.y0;
                        if (piVar != null) {
                            piVar.t(40);
                            break;
                        }
                        break;
                    default:
                        this.b.k1.M(null, null);
                        break;
                }
            }
        });
        wh whVar3 = new wh(this, context, i22);
        this.D0 = whVar3;
        hg.k kVar = new hg.k(this, context);
        this.C0 = kVar;
        whVar3.addView(kVar, w7.z5.e(-1, -1, 119));
        ki kiVar3 = kiVar;
        ch.d c11 = this.F2.c(kiVar3, eh.b.o(d6Var), false);
        this.A0 = c11;
        c11.n = true;
        c11.z(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.B(AndroidUtilities.dp(32.0f));
        c11.l.g = 0.4f;
        c11.u();
        ch.d c12 = this.E2.c(kVar, eh.b.o(d6Var), false);
        this.B0 = c12;
        c12.y(AndroidUtilities.dp(22.0f));
        c12.x(AndroidUtilities.dp(7.0f));
        kVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        whVar3.setWillNotDraw(false);
        whVar3.setVisibility(4);
        whVar3.setAlpha(0.0f);
        this.containerView.addView(whVar3, w7.z5.e(-1, -2, 83));
        whVar3.setOnTouchListener(new bi.d(13));
        p6 p6Var2 = new p6(context, false, false, false);
        this.s = p6Var2;
        p6Var2.setAllowCancel(true);
        p6Var2.setScaleProperty(0.6f);
        p6Var2.setVisibility(8);
        p6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i24 = org.telegram.ui.ActionBar.i6.y6;
        p6Var2.setTextColor(getThemedColor(i24));
        p6Var2.setTypeface(AndroidUtilities.bold());
        p6Var2.setGravity(17);
        kVar.addView(p6Var2, w7.z5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.w = imageView4;
        i0 i0Var = new i0(context);
        this.x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i25 = org.telegram.ui.ActionBar.i6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), mode));
        int i26 = org.telegram.ui.ActionBar.i6.i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i26), 1, AndroidUtilities.dp(16.0f)));
        kVar.addView(imageView4, w7.z5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView4);
        final int i27 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i27) {
                    case 0:
                        final xi xiVar = this.b;
                        zh zhVar = xiVar.E0;
                        if (zhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(xiVar.getContext(), d6Var);
                            e0Var.m0(zhVar.getText());
                            final int i212 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.nh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            zh zhVar2 = xiVar.E0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            bi biVar2 = xiVar.P0;
                                            biVar2.setText(charSequence);
                                            biVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = xiVar.Z;
                            boolean z13 = xiVar.H1 != null;
                            oh ohVar = new oh(xiVar, 0);
                            e0Var.l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.n0 = ohVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final xi xiVar2 = this.b;
                        bi biVar = xiVar2.P0;
                        if (biVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(xiVar2.getContext(), d6Var);
                            e0Var2.m0(biVar.getText());
                            final int i222 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.nh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i222) {
                                        case 0:
                                            zh zhVar2 = xiVar2.E0;
                                            zhVar2.setText(charSequence);
                                            zhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            bi biVar2 = xiVar2.P0;
                                            biVar2.setText(charSequence);
                                            biVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = xiVar2.Z;
                            boolean z14 = xiVar2.H1 != null;
                            oh ohVar2 = new oh(xiVar2, 1);
                            e0Var2.l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = ohVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        xi xiVar3 = this.b;
                        xiVar3.k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = xiVar3.f0;
                        t12.K2(null, n2Var2, d6Var);
                        PhotoViewer.t1().L2(xiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i232 = xiVar3.S1;
                        boolean z15 = xiVar3.T1;
                        t13.h = i232;
                        t13.n = z15;
                        if (!xiVar3.Z1.a0()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(xiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.k8.w(xiVar3.J1, "webp");
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
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList2.add(photoEntry);
                        PhotoViewer.t1().g2(arrayList2, 0, 11, false, new oi(xiVar3, photoEntry), n2Var2 instanceof org.telegram.ui.yn ? (org.telegram.ui.yn) n2Var2 : null);
                        if (xiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, xiVar3.J);
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
        zh zhVar = new zh(this, context, kiVar3, d6Var);
        this.E0 = zhVar;
        zhVar.J = true;
        zhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        zhVar.s();
        zhVar.getEditText().setLayoutParams(w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        zhVar.getEditText().addTextChangedListener(new ai(this));
        kVar.addView(zhVar, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        kVar.setClipChildren(false);
        whVar3.setClipChildren(false);
        zhVar.setClipChildren(false);
        m6Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        m6Var.setWillNotDraw(false);
        bi biVar = new bi(this, context, kiVar3, d6Var);
        this.P0 = biVar;
        biVar.J = true;
        biVar.getEditText().addTextChangedListener(new di(this, n2Var));
        biVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        biVar.getEditText().setLayoutParams(w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        biVar.getEditText().setTextSize(1, 17.0f);
        biVar.getEmojiButton().setLayoutParams(w7.z5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        biVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        m6Var.addView(biVar, w7.z5.e(-1, -2, 119));
        m6Var.setAlpha(0.0f);
        m6Var.setVisibility(8);
        zhVar.addView(imageView3, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        ch.d c13 = this.E2.c(m6Var, eh.b.o(d6Var), false);
        c13.y(AndroidUtilities.dp(22.0f));
        c13.x(AndroidUtilities.dp(7.0f));
        m6Var.setBackground(c13);
        m6Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        p6 p6Var3 = new p6(context, false, false, false);
        this.v = p6Var3;
        p6Var3.setScaleProperty(0.6f);
        p6Var3.setVisibility(8);
        p6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var3.setTextColor(getThemedColor(i24));
        p6Var3.setTypeface(AndroidUtilities.bold());
        p6Var3.setGravity(17);
        p6Var3.setAllowCancel(true);
        m6Var.addView(p6Var3, w7.z5.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.Xd), mode2));
        biVar.addView(imageView5, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i28 = 3;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jh
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.r4 r4Var;
                switch (i28) {
                    case 0:
                        xi xiVar = this.b;
                        xiVar.Y1(xiVar.y0 != xiVar.q0);
                        break;
                    case 1:
                        xi xiVar2 = this.b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        xi xiVar3 = this.b;
                        boolean z13 = xiVar3.c0;
                        if (!z13) {
                            xiVar3.G1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        xi xiVar4 = this.b;
                        boolean z14 = xiVar4.c0;
                        if (z14) {
                            xiVar4.G1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.y1();
                        break;
                    case 5:
                        this.b.a1.M(null, null);
                        break;
                    case 6:
                        xi.p(this.b);
                        break;
                    case 7:
                        pi piVar = this.b.y0;
                        if (piVar != null) {
                            piVar.t(40);
                            break;
                        }
                        break;
                    default:
                        this.b.k1.M(null, null);
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
        imageView6.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i26), 1, AndroidUtilities.dp(16.0f)));
        m6Var.addView(imageView6, w7.z5.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView6);
        final int i29 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kh
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i29) {
                    case 0:
                        final xi xiVar = this.b;
                        zh zhVar2 = xiVar.E0;
                        if (zhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(xiVar.getContext(), d6Var);
                            e0Var.m0(zhVar2.getText());
                            final int i212 = 0;
                            e0Var.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.nh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            zh zhVar22 = xiVar.E0;
                                            zhVar22.setText(charSequence);
                                            zhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            bi biVar2 = xiVar.P0;
                                            biVar2.setText(charSequence);
                                            biVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j3 = xiVar.Z;
                            boolean z13 = xiVar.H1 != null;
                            oh ohVar = new oh(xiVar, 0);
                            e0Var.l0 = j3;
                            e0Var.m0 = z13;
                            e0Var.n0 = ohVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final xi xiVar2 = this.b;
                        bi biVar2 = xiVar2.P0;
                        if (biVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(xiVar2.getContext(), d6Var);
                            e0Var2.m0(biVar2.getText());
                            final int i222 = 1;
                            e0Var2.j0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.nh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i222) {
                                        case 0:
                                            zh zhVar22 = xiVar2.E0;
                                            zhVar22.setText(charSequence);
                                            zhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            bi biVar22 = xiVar2.P0;
                                            biVar22.setText(charSequence);
                                            biVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = xiVar2.Z;
                            boolean z14 = xiVar2.H1 != null;
                            oh ohVar2 = new oh(xiVar2, 1);
                            e0Var2.l0 = j10;
                            e0Var2.m0 = z14;
                            e0Var2.n0 = ohVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        xi xiVar3 = this.b;
                        xiVar3.k1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = xiVar3.f0;
                        t12.K2(null, n2Var2, d6Var);
                        PhotoViewer.t1().L2(xiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i232 = xiVar3.S1;
                        boolean z15 = xiVar3.T1;
                        t13.h = i232;
                        t13.n = z15;
                        if (!xiVar3.Z1.a0()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(xiVar3.getContainer().findFocus());
                        }
                        File w10 = ci.k8.w(xiVar3.J1, "webp");
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
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList2.add(photoEntry);
                        PhotoViewer.t1().g2(arrayList2, 0, 11, false, new oi(xiVar3, photoEntry), n2Var2 instanceof org.telegram.ui.yn ? (org.telegram.ui.yn) n2Var2 : null);
                        if (xiVar3.G) {
                            PhotoViewer.t1().X0(null, null, true, xiVar3.J);
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
        this.H0 = whVar4;
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
        this.I0 = eiVar;
        eiVar.setImportantForAccessibility(2);
        whVar4.addView(eiVar, w7.z5.e(-1, -1, 119));
        eiVar.setTranslationX(this.backgroundPaddingLeft);
        int dp6 = AndroidUtilities.dp(52.0f);
        int dp7 = AndroidUtilities.dp(38.0f);
        eiVar.I = dp6;
        eiVar.J = dp7;
        float dp8 = AndroidUtilities.dp(7.0f);
        float dp9 = AndroidUtilities.dp(6.0f);
        eiVar.M = dp8;
        eiVar.N = dp9;
        eiVar.h0 = true;
        final int i30 = 4;
        eiVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jh
            public final /* synthetic */ xi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ei.r4 r4Var;
                switch (i30) {
                    case 0:
                        xi xiVar = this.b;
                        xiVar.Y1(xiVar.y0 != xiVar.q0);
                        break;
                    case 1:
                        xi xiVar2 = this.b;
                        long j3 = xiVar2.W0;
                        if (j3 < 0 && (r4Var = (ei.r4) xiVar2.x0.get(-j3)) != null) {
                            org.telegram.ui.web.c1 webViewContainer = r4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.P = System.currentTimeMillis();
                            webViewContainer.z("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        xi xiVar3 = this.b;
                        boolean z13 = xiVar3.c0;
                        if (!z13) {
                            xiVar3.G1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        xi xiVar4 = this.b;
                        boolean z14 = xiVar4.c0;
                        if (z14) {
                            xiVar4.G1(!z14, true);
                            break;
                        }
                        break;
                    case 4:
                        this.b.y1();
                        break;
                    case 5:
                        this.b.a1.M(null, null);
                        break;
                    case 6:
                        xi.p(this.b);
                        break;
                    case 7:
                        pi piVar = this.b.y0;
                        if (piVar != null) {
                            piVar.t(40);
                            break;
                        }
                        break;
                    default:
                        this.b.k1.M(null, null);
                        break;
                }
            }
        });
        eiVar.setOnLongClickListener(new org.telegram.ui.fg(this, context, d6Var, n2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        yh yhVar2 = new yh(this, context, 1);
        yhVar2.setAlpha(0.0f);
        yhVar2.setScaleX(0.2f);
        yhVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        fl0 fastScroll = chatAttachAlertPhotoLayout.E.getFastScroll();
        ah.c cVar6 = this.E2;
        dh.e o9 = eh.b.o(d6Var);
        zl0 zl0Var = fastScroll.o0;
        ch.d c14 = cVar6.c(zl0Var.f1, o9, false);
        fastScroll.e0 = c14;
        c14.x(AndroidUtilities.dp(4.0f));
        fastScroll.e0.y(AndroidUtilities.dp(24.0f));
        ch.d c15 = cVar6.c(zl0Var.f1, o9, false);
        fastScroll.f0 = c15;
        c15.x(AndroidUtilities.dp(6.0f));
        fastScroll.f0.B(AndroidUtilities.dp(4.0f));
        fastScroll.f0.y(AndroidUtilities.dp(f7));
        ee0 ee0Var = new ee0(context);
        this.S = ee0Var;
        this.containerView.addView(ee0Var, w7.z5.c(-1.0f, -1));
        dh.e eVar2 = new dh.e(d6Var);
        eVar2.e = new fh(this, 5);
        eVar2.c = new fh(this, 6);
        eVar2.d = new fh(this, 7);
        eVar2.b = new fh(this, 8);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar2.n = dpf2;
        eVar2.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar2.f = dpf23;
        eVar2.h = dpf24;
        y7Var.J(this.E2, eVar2, false);
        lVar.i(1L, false);
        this.glassEngine.i(this.containerView);
        li.p pVar2 = this.glassEngine;
        pVar2.a = new fh(this, 9);
        pVar2.d = new ni.b(AndroidUtilities.dp(48.0f));
    }

    public static void D(xi xiVar) {
        int i10;
        y7 y7Var = xiVar.X0;
        jh.f fVar = xiVar.v1;
        if (fVar == null || y7Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.d6 d6Var = xiVar.resourcesProvider;
        boolean a2 = d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.i6.I.q();
        if (y7Var.getVisibility() == 0) {
            i10 = (int) (y7Var.getAlpha() * (a2 ? 255 : 160));
        } else {
            i10 = 0;
        }
        fVar.setFadeTopAlpha(i10);
    }

    public static void H(xi xiVar) {
        ci.i iVar = new ci.i(xiVar, xiVar.getContext(), xiVar.Z, LaunchActivity.R(), xiVar.resourcesProvider, 1);
        xiVar.B2 = iVar;
        iVar.p(new n2.c(xiVar, 6));
        ViewGroup viewGroup = xiVar.containerView;
        viewGroup.addView(xiVar.B2, viewGroup.indexOfChild(xiVar.D0), w7.z5.e(-1, -1, 83));
        ci.i iVar2 = xiVar.B2;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            iVar2.getAdapter().m0 = false;
            org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
            gg.k1 adapter = iVar2.getAdapter();
            ynVar.i();
            TLRPC.Chat chat = ynVar.e;
            adapter.getClass();
            adapter.l0 = chat;
            iVar2.getAdapter().W(ynVar.X7);
            iVar2.getAdapter().e0 = ynVar.e != null;
        } else {
            iVar2.getAdapter().m0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().e0 = false;
        }
        iVar2.getAdapter().f0 = false;
        xiVar.T1();
    }

    public static int g0(xi xiVar) {
        pi piVar = xiVar.y0;
        xn xnVar = xiVar.m0;
        if (piVar == xnVar && xnVar.E != null) {
            return xnVar.getEmojiPadding();
        }
        xn xnVar2 = xiVar.n0;
        return (piVar != xnVar2 || xnVar2.E == null) ? xiVar.c0 ? xiVar.P0.getEmojiPadding() : xiVar.E0.getEmojiPadding() : xnVar2.getEmojiPadding();
    }

    public static /* synthetic */ void n(xi xiVar) {
        pi piVar;
        tm tmVar;
        xiVar.t1 = null;
        pi piVar2 = xiVar.y0;
        if (piVar2 != xiVar.j0 && (piVar = xiVar.z0) != (tmVar = xiVar.q0) && piVar2 != piVar && piVar2 != tmVar) {
            xiVar.containerView.removeView(piVar2);
        }
        xiVar.y0.setVisibility(8);
        xiVar.y0.q();
        xiVar.z0.D();
        xiVar.y0 = xiVar.z0;
        xiVar.z0 = null;
        int[] iArr = xiVar.b2;
        iArr[0] = iArr[1];
        xiVar.G1(xiVar.c0, false);
        xiVar.V1();
    }

    public static /* synthetic */ void o(xi xiVar, boolean z10, ih ihVar) {
        xiVar.y0.s(1.0f);
        xiVar.z0.s(1.0f);
        xiVar.y0.k(xiVar.l2);
        xiVar.z0.k(xiVar.l2);
        xiVar.glassEngine.g();
        xiVar.containerView.invalidate();
        xiVar.X0.setTag(z10 ? 1 : null);
        ihVar.run();
    }

    public static void p(xi xiVar) {
        if (xiVar.j0 == null) {
            return;
        }
        boolean Q = ChatAttachAlertPhotoLayout.Q();
        boolean z10 = !Q;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.j0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(Q);
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
        xiVar.X1(true);
        org.telegram.ui.ActionBar.v0 v0Var = xiVar.c1;
        ci.e4 e4Var = xiVar.d1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        ci.e4 e4Var2 = new ci.e4(xiVar.getContext(), 1);
        xiVar.d1 = e4Var2;
        e4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(!Q ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        xiVar.d1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        xiVar.d1.m(1.0f, -((xiVar.containerView.getWidth() - ((v0Var.getWidth() / 2.0f) + v0Var.getX())) - AndroidUtilities.dp(14.0f)));
        xiVar.d1.setTranslationY(xiVar.a1.getTranslationY());
        ci.e4 e4Var3 = xiVar.d1;
        e4Var3.l0 = new be(4, xiVar, e4Var2);
        xiVar.containerView.addView(e4Var3, w7.z5.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        xiVar.d1.u();
    }

    public static /* synthetic */ void q(xi xiVar, ValueAnimator valueAnimator) {
        xiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.d3 d3Var = xiVar.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
    }

    public static void r(xi xiVar) {
        o1.k kVar = xiVar.p2;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(xiVar.containerView, o1.h.n, 0.0f);
        xiVar.p2 = kVar2;
        kVar2.u.a(1.5f);
        xiVar.p2.u.b(1500.0f);
        xiVar.p2.f();
    }

    public static void s(xi xiVar, org.telegram.ui.ActionBar.d6 d6Var, View view) {
        xi xiVar2 = xiVar;
        xh xhVar = xiVar2.y1;
        pi[] piVarArr = xiVar2.w0;
        org.telegram.ui.ActionBar.n2 n2Var = xiVar2.f0;
        org.telegram.ui.ActionBar.n2 R = n2Var == null ? LaunchActivity.R() : n2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (view instanceof ri) {
            Activity parentActivity = R.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!xiVar2.L1 && !xiVar2.M1 && xiVar2.a1()) {
                    return;
                }
                if (!xiVar2.L1 && !xiVar2.M1) {
                    yn ynVar = new yn(1, xiVar2.getContext(), d6Var, xiVar2);
                    xiVar2.T = ynVar;
                    xiVar2.P1(ynVar);
                }
                xiVar2.P1(xiVar2.j0);
            } else if (intValue == 3) {
                if (!xiVar2.N1 && xiVar2.a1()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(xiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                xiVar2.A1(true);
            } else if (intValue == 4) {
                if (!xiVar2.K1 && xiVar2.a1()) {
                    return;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(xiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                xiVar2.D1(true);
            } else if (intValue == 5) {
                if (!xiVar2.Q1 && xiVar2.a1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && xiVar2.Q1 && xiVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(xiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                xiVar2.C1();
            } else if (intValue == 6) {
                if ((!xiVar2.Q1 && xiVar2.a1()) || !AndroidUtilities.isMapsInstalled(n2Var)) {
                    return;
                }
                if (xiVar2.Q1) {
                    if (xiVar2.o0 == null) {
                        jl jlVar = new jl(xiVar2, xiVar2.getContext(), d6Var, (xiVar2.H || xiVar2.R1) ? false : true);
                        xiVar2.o0 = jlVar;
                        piVarArr[5] = jlVar;
                        el elVar = xiVar2.t2;
                        if (elVar != null) {
                            jlVar.setDelegate(elVar);
                        } else {
                            jlVar.setDelegate(new fh(xiVar2, 11));
                        }
                    }
                    xiVar2.P1(xiVar2.o0);
                } else {
                    yn ynVar2 = new yn(6, xiVar2.getContext(), d6Var, xiVar2);
                    xiVar2.T = ynVar2;
                    xiVar2.P1(ynVar2);
                }
            } else if (intValue == 9) {
                if (!xiVar2.O1 && xiVar2.a1()) {
                    return;
                }
                if (xiVar2.O1) {
                    xiVar2.R1(true, null);
                } else {
                    yn ynVar3 = new yn(9, xiVar2.getContext(), d6Var, xiVar2);
                    xiVar2.T = ynVar3;
                    xiVar2.P1(ynVar3);
                }
            } else if (intValue == 11) {
                if (xiVar2.s0 == null) {
                    hg.j0 j0Var = new hg.j0(xiVar2.getContext(), xiVar2.resourcesProvider, xiVar2);
                    xiVar2.s0 = j0Var;
                    piVarArr[7] = j0Var;
                    j0Var.setupBlurredSearchField(xiVar2.E2);
                }
                xiVar2.P1(xiVar2.s0);
            } else if (intValue == 12) {
                if (!xiVar2.P1 && xiVar2.a1()) {
                    return;
                }
                if (xiVar2.P1) {
                    if (xiVar2.n0 == null) {
                        xn xnVar = new xn(xiVar, xiVar.getContext(), true, d6Var, null);
                        xiVar2 = xiVar;
                        xiVar2.n0 = xnVar;
                        piVarArr[1] = xnVar;
                        xnVar.setDelegate(new fh(xiVar2, 13));
                    }
                    xiVar2.P1(xiVar2.n0);
                } else {
                    yn ynVar4 = new yn(9, xiVar2.getContext(), d6Var, xiVar2);
                    xiVar2.T = ynVar4;
                    xiVar2.P1(ynVar4);
                }
            } else if (intValue == 13) {
                if (xiVar2.u0 == null) {
                    sk skVar = new sk(xiVar2, xiVar2.getContext(), d6Var, true);
                    xiVar2.u0 = skVar;
                    piVarArr[8] = skVar;
                    skVar.setDelegate(xiVar2.a2);
                }
                xiVar2.P1(xiVar2.u0);
            } else if (intValue == 14) {
                if (xiVar2.t0 == null) {
                    sk skVar2 = new sk(xiVar2, xiVar2.getContext(), d6Var, false);
                    xiVar2.t0 = skVar2;
                    piVarArr[9] = skVar2;
                    skVar2.setDelegate(xiVar2.a2);
                }
                xiVar2.P1(xiVar2.t0);
            } else if (intValue == 16) {
                if (xiVar2.v0 == null) {
                    ii.r rVar = new ii.r(xiVar2.J1, xiVar2.getContext(), d6Var, xiVar2);
                    xiVar2.v0 = rVar;
                    piVarArr[10] = rVar;
                }
                xiVar2.P1(xiVar2.v0);
            } else if (view.getTag() instanceof Integer) {
                xiVar2.Z1.B1(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, xiVar2.r1(), false, 0L);
            }
        } else if (view instanceof qi) {
            qi qiVar = (qi) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = qiVar.c;
            if (tL_attachMenuBot == null) {
                xiVar2.Z1.j1(qiVar.b);
                xiVar2.dismiss();
            } else if (tL_attachMenuBot.inactive) {
                cj1.a(xiVar2.getContext(), new org.telegram.ui.qc(16, xiVar2, qiVar), null);
            } else {
                xiVar2.M1(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int dp = AndroidUtilities.dp(70.0f);
        int i12 = left - dp;
        if (i12 < 0) {
            xhVar.w0(i12, 0, null);
            return;
        }
        int i13 = right + dp;
        if (i13 > xhVar.getMeasuredWidth()) {
            xhVar.w0(i13 - xhVar.getMeasuredWidth(), 0, null);
        }
    }

    public static void t(xi xiVar, int i10) {
        ah.i iVar = xiVar.C2;
        if (Build.VERSION.SDK_INT < 31 || iVar == null) {
            return;
        }
        if (w7.e0.a(i10, 4)) {
            ni.a e7 = xiVar.glassEngine.e();
            e7.b(xiVar.containerView.getY(), xiVar.containerView.getWidth(), xiVar.containerView.getY() + xiVar.containerView.getHeight());
            iVar.h(e7);
        }
        iVar.e(xiVar.G2, xiVar.containerView.getWidth(), xiVar.containerView.getHeight());
    }

    public static /* synthetic */ void u(xi xiVar, org.telegram.messenger.video.o oVar) {
        AnimatorSet animatorSet = xiVar.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        oVar.run();
    }

    public static /* synthetic */ void v(xi xiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.z2 z2Var) {
        xiVar.currentSheetAnimation = null;
        xiVar.p2 = null;
        animationNotificationsLocker.unlock();
        xiVar.currentSheetAnimationType = 0;
        if (z2Var != null) {
            z2Var.onOpenAnimationEnd();
        }
        if (xiVar.useHardwareLayer) {
            xiVar.container.setLayerType(0, null);
        }
        if (xiVar.isFullscreen) {
            WindowManager.LayoutParams attributes = xiVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            xiVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
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
    public static boolean w(xi xiVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.n2 n2Var, View view) {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        org.telegram.ui.yn ynVar;
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
        org.telegram.ui.yn ynVar2;
        long j12;
        TLRPC.ChatFull chatFull;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        xi xiVar2 = xiVar;
        ei eiVar = xiVar2.I0;
        org.telegram.ui.ActionBar.n2 n2Var2 = xiVar2.f0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = xiVar2.j0;
        int i12 = xiVar2.J1;
        long j13 = xiVar2.Z;
        if ((j13 == 0 && !(n2Var2 instanceof org.telegram.ui.yn)) || xiVar2.K - xiVar2.L < 0 || xiVar2.h.f) {
            return false;
        }
        if (n2Var2 instanceof org.telegram.ui.yn) {
            org.telegram.ui.yn ynVar3 = (org.telegram.ui.yn) n2Var2;
            TLRPC.User i13 = ynVar3.i();
            MessageObject messageObject5 = ynVar3.l5;
            MessageObject messageObject6 = ynVar3.i5;
            if (ynVar3.c() || ynVar3.P3 == 5) {
                return false;
            }
            messageObject2 = messageObject6;
            messageObject = messageObject5;
            ynVar = ynVar3;
            user = i13;
            j13 = ynVar3.a();
        } else {
            user = MessagesController.getInstance(i12).getUser(Long.valueOf(j13));
            messageObject = null;
            messageObject2 = null;
            ynVar = null;
        }
        of ofVar = xiVar2.h0;
        if (ofVar != null) {
            ofVar.dismiss();
        }
        of ofVar2 = new of(xiVar2, context, d6Var, 1);
        xiVar2.h0 = ofVar2;
        ofVar2.r(eiVar, false, new ai.d0(xiVar2, n2Var, d6Var, 16));
        ArrayList arrayList2 = new ArrayList();
        pi piVar = xiVar2.y0;
        if (piVar == chatAttachAlertPhotoLayout3 || piVar == xiVar2.q0) {
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
                                                } catch (Exception e7) {
                                                    e = e7;
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
                                                    } catch (Exception e10) {
                                                        e = e10;
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
                                                } catch (Exception e11) {
                                                    e = e11;
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
                                                    } catch (IOException e12) {
                                                        FileLog.e(e12);
                                                    }
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    i10 = 0;
                                                    photoEntry.videoOrientation = i10;
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
                                CharSequence[] charSequenceArr = {xiVar2.m1().getText()};
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
        } else if (piVar == xiVar2.k0) {
            if (TextUtils.isEmpty(xiVar2.m1().getText())) {
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
                CharSequence[] charSequenceArr2 = {xiVar2.m1().getText()};
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
            ArrayList<TLRPC.User> selected = xiVar2.k0.getSelected();
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
            xiVar2 = xiVar;
            j3 = j13;
            z11 = z14;
        } else {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
            if (piVar == xiVar2.p0) {
                messageObject4 = null;
                boolean z16 = false;
                int i30 = 0;
                for (int i31 = 0; i31 < xiVar2.p0.S.size(); i31++) {
                    String str5 = (String) xiVar2.p0.S.get(i31);
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
                                CharSequence[] charSequenceArr3 = {xiVar2.m1().getText()};
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
                jj jjVar = xiVar2.l0;
                if (piVar == jjVar) {
                    arrayList2.addAll(jjVar.getSelected());
                    if (!arrayList2.isEmpty()) {
                        messageObject4 = (MessageObject) arrayList2.get(0);
                        CharSequence[] charSequenceArr4 = {xiVar2.m1().getText()};
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
        b80 F = b80.F(xiVar2.containerView, d6Var, eiVar);
        if (messageObject4 != null) {
            pi piVar2 = xiVar2.y0;
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (piVar2 == chatAttachAlertPhotoLayout2 || piVar2 == xiVar2.q0) {
                hc0 hc0Var = new hc0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), d6Var);
                TLRPC.Message message = messageObject4.messageOwner;
                boolean z17 = xiVar2.c0;
                message.invert_media = z17;
                hc0Var.a(!z17, false);
                hc0Var.setOnClickListener(new ai.d0(xiVar2, messageObject4, hc0Var, 17));
                F.q(hc0Var);
                if (xiVar2.H1 == null) {
                    F.k();
                }
            }
        } else {
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        }
        boolean isUserSelf = UserObject.isUserSelf(user);
        if (xiVar2.H1 != null || ((ynVar != null && ChatObject.isMonoForum(ynVar.e)) || ((ynVar == null || !ynVar.D6()) && !xiVar2.y0.c()))) {
            j11 = j3;
        } else {
            j11 = j3;
            F.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new a3.h0(xiVar2, j11, d6Var, 18), false);
        }
        pi piVar3 = xiVar2.y0;
        if ((piVar3 == chatAttachAlertPhotoLayout2 || piVar3 == xiVar2.q0) && piVar3.getSelectedItemsCount() == 1 && ynVar != null && ChatObject.isMonoForum(ynVar.e)) {
            ynVar2 = ynVar;
            j12 = j11;
            F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new ai.q8(xiVar2, j11, ynVar2, d6Var, 28), false);
        } else {
            j12 = j11;
            ynVar2 = ynVar;
        }
        if (xiVar2.H1 == null && !isUserSelf) {
            F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ih(xiVar2, 1), false);
        }
        if (xiVar2.H1 == null && z10 && ynVar2 != null && ChatObject.isChannelAndNotMegaGroup(ynVar2.e) && (chatFull = ynVar2.X7) != null && chatFull.paid_media_allowed) {
            F.c(R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton), null, false);
            org.telegram.ui.ActionBar.f1 y3 = F.y();
            y3.setOnClickListener(new ai.o5(xiVar2, context, y3, d6Var, 12));
            long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
            if (starsPrice > 0) {
                y3.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                y3.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                y3.setText(LocaleController.getString(R.string.PaidMediaButton));
                y3.setSubtext(null);
            }
            xiVar2.h0.s(starsPrice);
        }
        F.Y();
        xiVar2.h0.p(F);
        xiVar2.h0.q(arrayList2);
        if (xiVar2.H1 == null && j12 >= 0 && z11) {
            xiVar2.h0.d(n2Var);
            xiVar2.h0.o(xiVar2.N0);
        }
        xiVar2.h0.show();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static /* synthetic */ void x(xi xiVar, int i10) {
        xiVar.navBarColorKey = -1;
        xiVar.navBarColor = i10;
        xiVar.containerView.invalidate();
    }

    public final void A1(boolean z10) {
        if (!this.N1 && z10) {
            yn ynVar = new yn(3, getContext(), this.resourcesProvider, this);
            this.T = ynVar;
            P1(ynVar);
        }
        int i10 = 1;
        if (this.l0 == null) {
            jj jjVar = new jj(getContext(), this.resourcesProvider, this);
            this.l0 = jjVar;
            this.w0[3] = jjVar;
            jjVar.setupBlurredSearchField(this.E2);
            this.l0.setDelegate(new fh(this, 15));
            if (this.H) {
                this.l0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            TLRPC.Chat chat = ((org.telegram.ui.yn) n2Var).e;
            jj jjVar2 = this.l0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                i10 = -1;
            }
            jjVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            P1(this.l0);
        }
    }

    public final void B1() {
        if (this.r0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
            mj mjVar = new mj(context, d6Var, this);
            mjVar.r = AndroidUtilities.dp(80.0f);
            mjVar.w = 3;
            ai.w0 w0Var = new ai.w0(mjVar, context, d6Var, 11);
            mjVar.n = w0Var;
            ab abVar = new ab(mjVar, context);
            mjVar.v = abVar;
            w0Var.setAdapter(abVar);
            w0Var.setClipToPadding(false);
            w0Var.setItemAnimator(null);
            w0Var.setLayoutAnimation(null);
            w0Var.setVerticalScrollBarEnabled(false);
            w0Var.setGlowColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A5, mjVar.a));
            mjVar.addView(w0Var, w7.z5.c(-1.0f, -1));
            w0Var.setOnScrollListener(new ai.r(mjVar, 18));
            bi.l lVar = new bi.l(mjVar, mjVar.r, 1);
            mjVar.s = lVar;
            lVar.O = new ci.x1(mjVar, 2);
            w0Var.setLayoutManager(lVar);
            this.r0 = mjVar;
            mjVar.setDelegate(new hb(this, 1));
        }
        P1(this.r0);
    }

    public final void C1() {
        if (!this.Q1) {
            yn ynVar = new yn(5, getContext(), this.resourcesProvider, this);
            this.T = ynVar;
            P1(ynVar);
        }
        if (this.k0 == null) {
            bk bkVar = new bk(getContext(), this.resourcesProvider, this);
            this.k0 = bkVar;
            this.w0[2] = bkVar;
            bkVar.setupBlurredSearchField(this.E2);
            this.k0.setDelegate(new gi(this));
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            TLRPC.Chat chat = ((org.telegram.ui.yn) n2Var).e;
            this.k0.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        P1(this.k0);
    }

    public final void D1(boolean z10) {
        if (!this.K1 && z10) {
            yn ynVar = new yn(4, getContext(), this.resourcesProvider, this);
            this.T = ynVar;
            P1(ynVar);
        }
        boolean z11 = false;
        if (this.p0 == null) {
            rk rkVar = new rk(this.N ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.p0 = rkVar;
            this.w0[4] = rkVar;
            rkVar.setDelegate(new hi(this));
        }
        int i10 = 1;
        if (this.H) {
            this.p0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.f0;
            if (n2Var instanceof org.telegram.ui.yn) {
                TLRPC.Chat chat = ((org.telegram.ui.yn) n2Var).e;
                rk rkVar2 = this.p0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.H1 == null) {
                    i10 = -1;
                }
                rkVar2.setMaxSelectedFiles(i10);
            } else {
                this.p0.setMaxSelectedFiles(this.S1);
                rk rkVar3 = this.p0;
                if (!this.N && !this.W) {
                    z11 = true;
                }
                rkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        rk rkVar4 = this.p0;
        rkVar4.d0 = this.N;
        if (z10) {
            P1(rkVar4);
        }
    }

    public final void E1() {
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
            pi[] piVarArr = this.w0;
            if (i10 >= piVarArr.length) {
                S1(false, false);
                super.dismissInternal();
                return;
            }
            pi piVar = piVarArr[i10];
            if (piVar != null) {
                piVar.m();
                this.containerView.removeView(piVarArr[i10]);
                piVarArr[i10] = null;
            }
            i10++;
        }
    }

    public final boolean F1(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        if (this.I1) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
            TLRPC.Chat chat = ynVar.e;
            if (ynVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(this.J1).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + ynVar.a(), !z10).commit();
            }
        }
        if (b1(m1().getText())) {
            return true;
        }
        Z0();
        if (this.h.f) {
            this.I1 = true;
            this.Z1.B1(7, true, z10, i10, i11, j3, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        pi piVar = this.y0;
        return e5.b0(this.J1, n12, j1() + (piVar != null ? piVar.getSelectedItemsCount() : 1), new Utilities.Callback() { // from class: org.telegram.ui.Components.sh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                xi xiVar = xi.this;
                xiVar.I1 = true;
                xiVar.Z1.B1(7, true, z10, i10, i11, j3, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void G1(boolean z10, boolean z11) {
        this.b.a(z10, z11);
        mu m12 = m1();
        this.c0 = z10;
        mu m13 = m1();
        final boolean z12 = this.D0.getTag() != null;
        pi piVar = this.y0;
        final boolean z13 = this.c0 && (piVar == this.j0 || piVar == this.q0);
        ci.m6 m6Var = this.O0;
        hg.k kVar = this.C0;
        if (z11) {
            m6Var.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = m6Var.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            tr trVar = tr.h;
            final int i10 = 0;
            duration.setInterpolator(trVar).setUpdateListener(new gh(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.hh
                public final /* synthetic */ xi b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            xi xiVar = this.b;
                            if (!z13 || !z12) {
                                xiVar.O0.setVisibility(8);
                            }
                            xiVar.a2();
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
            kVar.setVisibility(0);
            ViewPropertyAnimator interpolator = kVar.animate().translationY((z13 || !z12) ? kVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(trVar);
            final int i11 = 1;
            interpolator.setUpdateListener(new gh(this, i11)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.hh
                public final /* synthetic */ xi b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            xi xiVar = this.b;
                            if (!z13 || !z12) {
                                xiVar.O0.setVisibility(8);
                            }
                            xiVar.a2();
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
            m6Var.setVisibility((z13 && z12) ? 0 : 8);
            m6Var.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            a2();
            kVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            kVar.setTranslationY((z13 || !z12) ? kVar.getMeasuredHeight() : 0.0f);
            kVar.setVisibility((z13 || !z12) ? 8 : 0);
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
        AndroidUtilities.runOnUIThread(new ih(this, 0));
    }

    public final void H1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.j0) != null) {
            chatAttachAlertPhotoLayout.Y();
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
        U1(0);
    }

    public final void I1(int i10, boolean z10) {
        if (this.H1 != null) {
            return;
        }
        this.S1 = i10;
        this.T1 = z10;
    }

    public final void J1(float f7) {
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.a7), Math.min(255, Math.max(0, (int) (f7 * 255.0f))));
        this.navBarColor = k10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        getContainer().invalidate();
    }

    public final void K1(String str) {
        this.Q0 = 1;
        this.F = true;
        this.S0 = false;
        this.M1 = false;
        this.x1.setVisibility(8);
        this.j1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout != null) {
            xi xiVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.g1 = (xiVar.Q0 == 0 || xiVar.F) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L1(boolean z10) {
        boolean z11;
        if (z10) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f0;
            if ((n2Var instanceof org.telegram.ui.yn) && !((org.telegram.ui.yn) n2Var).v()) {
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
                tr trVar = tr.h;
                scaleY.setInterpolator(trVar).setDuration(420L).withEndAction(new ph(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(trVar).setDuration(420L).withEndAction(new ph(this, z11, 2)).start();
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
    public final void M1(long j3, String str, boolean z10, boolean z11) {
        long j10;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.x0;
        int i10 = 1;
        if (longSparseArray.get(j3) != null && Objects.equals(str, ((ei.r4) longSparseArray.get(j3)).getStartCommand())) {
            ei.r4 r4Var = (ei.r4) longSparseArray.get(j3);
            if (r4Var.H) {
                r4Var.H = false;
            }
            if (longSparseArray.get(j3) != null) {
                ((ei.r4) longSparseArray.get(j3)).J.setSwipeOffsetAnimationDisallowed(true);
                Q1((pi) longSparseArray.get(j3), -j3, z11);
                if (z10) {
                    ei.r4 r4Var2 = (ei.r4) longSparseArray.get(j3);
                    TLRPC.User user = MessagesController.getInstance(r4Var2.F).getUser(Long.valueOf(r4Var2.v));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(r4Var2.F).getAttachMenuBots().bots;
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
                        if (tL_attachMenuBot.bot_id == r4Var2.v) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z12 = tL_attachMenuBot.show_in_side_menu;
                    AndroidUtilities.runOnUIThread(new ci.x8(22, r4Var2, (z12 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name) : z12 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            Context context = getContext();
            org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
            ei.r4 r4Var3 = new ei.r4(context, d6Var, this);
            int i12 = 2;
            r4Var3.U = new ei.h4(r4Var3, i12);
            org.telegram.ui.ActionBar.v0 a2 = r4Var3.b.X0.n().a(0, R.drawable.ic_ab_other);
            r4Var3.K = a2;
            a2.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
            org.telegram.ui.ActionBar.f1 e7 = a2.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
            r4Var3.L = e7;
            e7.setVisibility(8);
            a2.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
            org.telegram.ui.ActionBar.f1 e10 = a2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            r4Var3.M = e10;
            e10.setVisibility(8);
            a2.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
            a2.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
            a2.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
            ei.k4 k4Var = new ei.k4(r4Var3, context, d6Var, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, r4Var3.a));
            r4Var3.n = k4Var;
            ei.b3 b3Var = new ei.b3(r4Var3, context, i10);
            r4Var3.J = b3Var;
            b3Var.addView(k4Var, w7.z5.c(-1.0f, -1));
            b3Var.setScrollListener(new ei.h4(r4Var3, 3));
            b3Var.setScrollEndListener(new ei.h4(r4Var3, 4));
            b3Var.setDelegate(new ei.j4(r4Var3));
            b3Var.setIsKeyboardVisible(new ei.j4(r4Var3));
            r4Var3.addView(b3Var, w7.z5.c(-1.0f, -1));
            ei.l4 l4Var = new ei.l4(context, d6Var);
            r4Var3.I = l4Var;
            r4Var3.addView(l4Var, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            k4Var.setWebViewProgressListener(new ci.d5(r4Var3, i12));
            NotificationCenter.getGlobalInstance().addObserver(r4Var3, NotificationCenter.didSetNewTheme);
            longSparseArray.put(j3, r4Var3);
            ((ei.r4) longSparseArray.get(j3)).setDelegate(new ci(this, r4Var3, str, j3));
            org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
            MessageObject replyingMessageObject = ynVar.W.getReplyingMessageObject();
            ei.r4 r4Var4 = (ei.r4) longSparseArray.get(j3);
            long a10 = ynVar.a();
            int i13 = replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0;
            long O8 = ynVar.O8();
            ei.k4 k4Var2 = r4Var4.n;
            int i14 = this.J1;
            r4Var4.F = i14;
            r4Var4.w = a10;
            r4Var4.v = j3;
            r4Var4.y = i13;
            r4Var4.E = O8;
            r4Var4.G = str;
            org.telegram.ui.ActionBar.f1 f1Var = r4Var4.M;
            if (f1Var != null) {
                if (MediaDataController.getInstance(i14).canCreateAttachedMenuBotShortcut(j3)) {
                    f1Var.setVisibility(0);
                } else {
                    f1Var.setVisibility(8);
                }
            }
            k4Var2.setBotUser(MessagesController.getInstance(i14).getUser(Long.valueOf(j3)));
            k4Var2.t(i14, j3);
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
                if (O8 != j10) {
                    createReplyInput.monoforum_peer_id = MessagesController.getInstance(i14).getInputPeer(O8);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (O8 != j10) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(i14).getInputPeer(O8);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject p5 = ei.l3.p(r4Var4.a, false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i14).sendRequest(tL_messages_requestWebView, new ai.i8(r4Var4, i14, i12));
            NotificationCenter.getInstance(i14).addObserver(r4Var4, NotificationCenter.webViewResultSent);
            if (longSparseArray.get(j3) != null) {
            }
        }
        if (longSparseArray.get(j3) != null) {
        }
    }

    public final void N1(org.telegram.ui.ActionBar.n2 n2Var) {
        if ((n2Var instanceof org.telegram.ui.yn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.yn) n2Var).e)) {
            new yc(this.r1, this.resourcesProvider).f(MessagesController.getInstance(this.J1).captionLengthLimitPremium, new be(5, this, n2Var)).j();
        }
    }

    public final boolean O1(boolean z10, boolean z11) {
        int i10;
        pi piVar;
        y7 y7Var;
        this.c.a(z10, true);
        wh whVar = this.D0;
        if (z10 == (whVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.M0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        whVar.setTag(z10 ? 1 : null);
        zh zhVar = this.E0;
        if (zhVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(zhVar.getEditText());
        }
        zhVar.k(true);
        this.P0.k(true);
        wh whVar2 = this.x1;
        wh whVar3 = this.H0;
        if (z10) {
            if (!this.N) {
                whVar.setVisibility(0);
            }
            whVar3.setVisibility(0);
        } else if (this.S0) {
            whVar2.setVisibility(0);
        }
        pi piVar2 = this.y0;
        boolean z12 = (piVar2 == this.j0 || piVar2 == this.q0) && this.c0;
        y7 y7Var2 = this.X0;
        ci.m6 m6Var = this.O0;
        hg.k kVar = this.C0;
        ei eiVar = this.I0;
        if (z11) {
            this.M0 = new AnimatorSet();
            if (z12) {
                m6Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(whVar, (Property<wh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<hg.k, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                y7Var = y7Var2;
            } else {
                kVar.setVisibility(0);
                y7Var = y7Var2;
                arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<hg.k, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(m6Var, (Property<ci.m6, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(whVar3, (Property<wh, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(whVar3, (Property<wh, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(whVar3, (Property<wh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(eiVar, (Property<ei, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(eiVar, (Property<ei, Float>) property3, z10 ? 1.0f : 0.2f));
            if (y7Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(whVar, (Property<wh, Float>) View.TRANSLATION_Y, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.S0) {
                arrayList.add(ObjectAnimator.ofFloat(whVar2, (Property<wh, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(whVar2, (Property<wh, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new gh(this, 4));
                arrayList.add(ofFloat);
            }
            this.M0.playTogether(arrayList);
            this.M0.setInterpolator(new DecelerateInterpolator());
            this.M0.setDuration(180L);
            this.M0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.M0.start();
            i10 = 0;
        } else {
            whVar.setAlpha(z10 ? 1.0f : 0.0f);
            kVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            if (!z10 || z12) {
                i10 = 0;
            } else {
                i10 = 0;
                kVar.setVisibility(0);
                kVar.setTranslationY(0.0f);
            }
            whVar3.setScaleX(z10 ? 1.0f : 0.2f);
            whVar3.setScaleY(z10 ? 1.0f : 0.2f);
            whVar3.setAlpha(z10 ? 1.0f : 0.0f);
            m6Var.setVisibility((z10 && z12) ? 0 : 8);
            m6Var.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            eiVar.setScaleX(z10 ? 1.0f : 0.2f);
            eiVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (y7Var2.getTag() != null) {
                whVar.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
            } else if (this.S0 && ((piVar = this.y0) == null || piVar.H())) {
                whVar2.setTranslationY(z10 ? AndroidUtilities.dp(84.0f) : 0.0f);
            }
            if (!z10) {
                whVar.setVisibility(4);
                whVar3.setVisibility(4);
            }
            if (z12) {
                a2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.y0.getSelectedItemsCount());
        }
        eiVar.g(i10, z11);
        eiVar.i(j1() + this.y0.getSelectedItemsCount(), this.H1 != null ? 0L : MessagesController.getInstance(this.J1).getSendPaidMessagesStars(n1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), eiVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            zhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void P1(pi piVar) {
        long j3 = this.W0;
        yn ynVar = this.T;
        if (piVar == ynVar) {
            j3 = ynVar.s;
        } else if (piVar == this.j0) {
            j3 = 1;
        } else if (piVar == this.l0) {
            j3 = 3;
        } else if (piVar == this.p0) {
            j3 = 4;
        } else if (piVar == this.k0) {
            j3 = 5;
        } else if (piVar == this.o0) {
            j3 = 6;
        } else if (piVar == this.m0) {
            j3 = 9;
        } else if (piVar == this.r0) {
            j3 = 10;
        } else if (piVar == this.s0) {
            j3 = 11;
        } else if (piVar == this.n0) {
            j3 = 12;
        } else if (piVar == this.t0) {
            j3 = 14;
        } else if (piVar == this.u0) {
            j3 = 13;
        } else if (piVar == this.v0) {
            j3 = 16;
        }
        Q1(piVar, j3, true);
    }

    public final void Q1(pi piVar, long j3, boolean z10) {
        gm gmVar;
        gm gmVar2;
        Float f7;
        int i10;
        Float valueOf = Float.valueOf(0.0f);
        if (this.t1 == null && this.M0 == null) {
            pi piVar2 = this.y0;
            if (piVar2 == piVar) {
                piVar2.E();
                return;
            }
            int i11 = 0;
            if (piVar == this.n0 && !UserConfig.getInstance(this.J1).isPremium()) {
                new rg.y0(this.f0, 39, false).show();
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
            wh whVar = this.x1;
            whVar.setAlpha(1.0f);
            whVar.setTranslationY(this.F1);
            int i13 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.x0;
                if (i13 >= longSparseArray.size()) {
                    break;
                }
                ((ei.r4) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                i13++;
            }
            this.W0 = j3;
            xh xhVar = this.y1;
            int childCount = xhVar.getChildCount();
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = xhVar.getChildAt(i14);
                if (childAt instanceof ri) {
                    ri riVar = (ri) childAt;
                    i10 = i12;
                    f7 = valueOf;
                    riVar.a.e(((long) riVar.b) == riVar.c.W0, true);
                } else {
                    f7 = valueOf;
                    i10 = i12;
                    if (childAt instanceof qi) {
                        ((qi) childAt).a(true);
                    }
                }
                i14++;
                i12 = i10;
                valueOf = f7;
            }
            Float f10 = valueOf;
            int i15 = i12;
            int firstOffset = (this.y0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.b2[0];
            this.z0 = piVar;
            piVar.getClass();
            boolean z11 = piVar instanceof ii.r;
            jh.f fVar = this.v1;
            if (fVar != null) {
                fVar.setFadeHeightBottom(z11 ? 0 : AndroidUtilities.dp(48.0f));
            }
            yh yhVar = this.w1;
            if (yhVar != null) {
                yhVar.setVisibility(z11 ? 4 : 0);
            }
            int i16 = this.z0.h() != 0 ? 0 : 4;
            y7 y7Var = this.X0;
            y7Var.setVisibility(i16);
            if (y7Var.n0) {
                y7Var.h(true);
            }
            this.y0.r();
            pi piVar3 = this.z0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if (piVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.z0.C(this.y0);
            this.z0.setVisibility(0);
            if (piVar.getParent() != null) {
                this.containerView.removeView(this.z0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.y0);
            ViewParent parent = this.z0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                pi piVar4 = this.z0;
                if (piVar4 != this.o0) {
                    indexOfChild++;
                }
                viewGroup.addView(piVar4, indexOfChild, w7.z5.c(-1.0f, -1));
            }
            ih ihVar = new ih(this, 3);
            pi piVar5 = this.y0;
            boolean z12 = piVar5 instanceof tm;
            ii iiVar = this.e0;
            if (z12 || (this.z0 instanceof tm)) {
                int max = Math.max(this.z0.getWidth(), this.y0.getWidth());
                pi piVar6 = this.z0;
                if (piVar6 instanceof tm) {
                    piVar6.setTranslationX(max);
                    pi piVar7 = this.y0;
                    if ((piVar7 instanceof ChatAttachAlertPhotoLayout) && (gmVar2 = ((ChatAttachAlertPhotoLayout) piVar7).P) != null) {
                        gmVar2.setVisibility(4);
                    }
                } else {
                    this.y0.setTranslationX(-max);
                    pi piVar8 = this.z0;
                    if (piVar8 == chatAttachAlertPhotoLayout && (gmVar = ((ChatAttachAlertPhotoLayout) piVar8).P) != null) {
                        gmVar.setVisibility(0);
                    }
                }
                this.z0.setAlpha(1.0f);
                this.y0.setAlpha(1.0f);
                if (z10) {
                    iiVar.set(this.y0, f10);
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this, piVar, ihVar, 15));
                } else {
                    boolean z13 = this.z0.getCurrentItemTop() <= piVar.getButtonsHideOffset();
                    this.y0.s(1.0f);
                    this.z0.s(1.0f);
                    this.y0.k(this.l2);
                    this.z0.k(this.l2);
                    this.containerView.invalidate();
                    this.glassEngine.g();
                    iiVar.set(this.y0, Float.valueOf(1.0f));
                    y7Var.setTag(z13 ? 1 : null);
                    ihVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.z0.setAlpha(0.0f);
                this.z0.setTranslationY(AndroidUtilities.dp(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.y0, (Property<pi, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.y0, iiVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(y7Var, (Property<y7, Float>) View.ALPHA, y7Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(tr.f);
                animatorSet.addListener(new fi(this, firstOffset, ihVar, i11));
                this.t1 = animatorSet;
                iiVar.set(this.y0, f10);
                animatorSet.start();
            } else {
                piVar5.setAlpha(0.0f);
                ihVar.run();
                Z1(0);
                this.containerView.invalidate();
            }
            if (this.m2 && !(piVar instanceof ei.r4)) {
                this.m2 = false;
                y7Var.e();
                y7Var.invalidate();
                t1();
            }
            if (i15 == 0 || j3 == 6 || (piVar instanceof ei.r4)) {
                i11 = AndroidUtilities.dp(46.0f);
            } else if (j3 == 4) {
                i11 = AndroidUtilities.dp(84.0f);
            }
            y7Var.setForcedMenuWidth(i11);
        }
    }

    public final void R1(boolean z10, Boolean bool) {
        xi xiVar;
        if (this.m0 == null) {
            xiVar = this;
            xn xnVar = new xn(xiVar, getContext(), false, this.resourcesProvider, bool);
            xiVar.m0 = xnVar;
            xiVar.w0[1] = xnVar;
            xnVar.setDelegate(new fh(this, 17));
        } else {
            xiVar = this;
        }
        Q1(xiVar.m0, 9L, z10);
    }

    public final void S1(boolean z10, boolean z11) {
        pi piVar;
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
        wh whVar = this.x1;
        org.telegram.ui.ActionBar.v0 v0Var = this.a1;
        if (z10) {
            if (z12) {
                v0Var.setVisibility(0);
                v0Var.setClickable(true);
            }
        } else if (this.S0 && this.D0.getTag() == null) {
            whVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var != null) {
            if (z10) {
                AndroidUtilities.setLightStatusBar(this, i0.a.f(getThemedColor(this.h2 ? org.telegram.ui.ActionBar.i6.tg : org.telegram.ui.ActionBar.i6.h5)) > 0.699999988079071d);
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
            this.Y0.addListener(new da(2, this, z10));
            this.Y0.setInterpolator(tr.h);
            this.Y0.setDuration(380L);
            this.Y0.start();
            return;
        }
        if (z10 && this.S0 && ((piVar = this.y0) == null || piVar.H())) {
            whVar.setVisibility(4);
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

    public final void T1() {
        float alpha;
        int[] iArr = this.G0;
        zh zhVar = this.E0;
        zhVar.getLocationOnScreen(iArr);
        if (this.B2 != null) {
            pi piVar = this.y0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
            if ((piVar == chatAttachAlertPhotoLayout || piVar == this.q0) && this.c0) {
                ci.m6 m6Var = this.O0;
                alpha = (m6Var.getAlpha() * m6Var.getMeasuredHeight()) + (m6Var.getY() - this.B2.getTop());
            } else {
                alpha = -zhVar.getHeight();
            }
            if (Math.abs(this.B2.getTranslationY() - alpha) > 0.5f) {
                this.B2.setTranslationY(alpha);
                this.B2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.T();
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
    public final void U1(int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.t1 != null) {
            return;
        }
        int selectedItemsCount = this.y0.getSelectedItemsCount();
        ei eiVar = this.I0;
        if (selectedItemsCount == 0) {
            eiVar.g(0, i10 != 0);
            O1(false, i10 != 0);
        } else {
            if (O1(true, i10 != 0) || i10 == 0) {
                eiVar.g(selectedItemsCount, i10 != 0);
                eiVar.c();
            } else {
                eiVar.g(selectedItemsCount, true);
                eiVar.c();
            }
        }
        this.y0.A(selectedItemsCount);
        d1(i10 != 0);
        if (this.y0 == this.j0 && ((((z10 = (n2Var = this.f0) instanceof org.telegram.ui.yn)) || this.Q0 != 0 || this.T0) && ((selectedItemsCount == 0 && this.q1) || ((selectedItemsCount != 0 || this.Q0 != 0 || this.T0) && !this.q1)))) {
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
                org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
                if (!ChatObject.isChannel(ynVar.e) || (tL_chatBannedRights = ynVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.q1;
                    wh whVar = this.i1;
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.a1;
                    if (!z12) {
                        if (this.Q0 == 0 && !this.T0) {
                            v0Var2.setVisibility(0);
                            v0Var2.setClickable(true);
                        }
                        whVar.setVisibility(0);
                    } else if (y7Var.getTag() != null && v0Var != null) {
                        v0Var.setVisibility(0);
                    }
                    if (i10 != 0) {
                        if (y7Var.getTag() == null && this.Q0 == 0 && !this.T0) {
                            v0Var2.setAlpha(this.q1 ? 1.0f : 0.0f);
                            v0Var2.setScaleX(this.q1 ? 1.0f : 0.6f);
                            v0Var2.setScaleY(this.q1 ? 1.0f : 0.6f);
                        }
                        whVar.setAlpha(this.q1 ? 1.0f : 0.0f);
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
                        arrayList.add(ObjectAnimator.ofFloat(whVar, (Property<wh, Float>) property, this.q1 ? 1.0f : 0.0f));
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
            wh whVar2 = this.i1;
            org.telegram.ui.ActionBar.v0 v0Var22 = this.a1;
            if (!z12) {
            }
            if (i10 != 0) {
            }
        }
        X1(i10 != 0);
        MessageObject messageObject = this.H1;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.J1).getSendPaidMessagesStars(n1()) : 0L;
        pi piVar = this.y0;
        eiVar.i(j1() + (piVar != null ? piVar.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        zh zhVar = this.E0;
        if (zhVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zhVar.getLayoutParams();
            int max = Math.max(AndroidUtilities.dp(48.0f), eiVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                zhVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void V1() {
        float f7;
        pi piVar = this.y0;
        boolean g10 = piVar == null ? false : piVar.g();
        bi.o oVar = this.f1;
        oVar.setEnabled(g10);
        pi piVar2 = this.y0;
        if (piVar2 != null) {
            f7 = ((piVar2.g() ? 1.0f : 0.5f) * (this.z0 == null ? 1.0f : this.d0)) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        pi piVar3 = this.z0;
        if (piVar3 != null) {
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, this.d0, piVar3.g() ? 1.0f : 0.5f, f7);
        }
        this.g1 = f7;
        if (oVar != null) {
            float f10 = f7 * this.h1;
            oVar.setAlpha(f10);
            oVar.setVisibility(f10 <= 0.0f ? 4 : 0);
        }
    }

    public final void W1(pi piVar, int i10) {
        if (piVar == null) {
            return;
        }
        ah.i iVar = this.C2;
        if (iVar != null && Build.VERSION.SDK_INT >= 31) {
            iVar.f(0.0f, i10);
        }
        int currentItemTop = piVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = piVar == this.y0 && currentItemTop <= piVar.getButtonsHideOffset();
        this.R = z11;
        if (piVar == this.y0) {
            S1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) piVar.getLayoutParams();
        int D = org.telegram.messenger.bi.D(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        pi piVar2 = this.y0;
        int i11 = piVar2 == piVar ? 0 : 1;
        if ((piVar2 instanceof tm) || (this.z0 instanceof tm)) {
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
            Z1(i11);
            this.containerView.invalidate();
        }
    }

    public final void X1(boolean z10) {
        ci.u uVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout == null || (uVar = this.b1) == null) {
            return;
        }
        boolean z11 = this.q1 && this.i0 && this.y0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0();
        boolean z12 = !ChatAttachAlertPhotoLayout.Q();
        uVar.f = z12;
        if (!z10) {
            ((e6) uVar.g).a(z12);
        }
        uVar.invalidateSelf();
        org.telegram.ui.ActionBar.v0 v0Var = this.c1;
        if (z10 && this.q1) {
            v0Var.setVisibility(0);
            v0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(tr.h).withEndAction(new ph(this, z11, 0)).start();
        } else {
            v0Var.setVisibility(z11 ? 0 : 8);
            v0Var.setAlpha(z11 ? 1.0f : 0.0f);
            v0Var.setScaleX(z11 ? 1.0f : 0.6f);
            v0Var.setScaleY(z11 ? 1.0f : 0.6f);
        }
    }

    public final void Y1(boolean z10) {
        pi piVar = this.j0;
        if (!z10) {
            P1(piVar);
            return;
        }
        if (this.M) {
            if (this.q0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.r;
                if (d6Var == null) {
                    d6Var = this.resourcesProvider;
                }
                tm tmVar = new tm(context, d6Var, this);
                tmVar.y = 0.0f;
                tmVar.E = 0.0f;
                tmVar.F = 0.0f;
                tmVar.G = 0.0f;
                tmVar.H = 0.0f;
                tmVar.I = 0.0f;
                tmVar.J = null;
                tmVar.K = false;
                tmVar.M = 0.0f;
                tmVar.Q = false;
                tmVar.S = false;
                Point point = AndroidUtilities.displaySize;
                tmVar.T = point.y > point.x;
                tmVar.n = d6Var;
                tmVar.f = true;
                tmVar.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z n10 = tmVar.b.X0.n();
                TextView textView = new TextView(context);
                tmVar.x = textView;
                org.telegram.ui.ActionBar.d6 d6Var2 = tmVar.a;
                bm bmVar = new bm(tmVar, context, n10, d6Var2, 1);
                tmVar.b.X0.addView(bmVar, 0, w7.z5.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.j5, d6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                bmVar.addView(textView, w7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                ai.w0 w0Var = new ai.w0(tmVar, context, d6Var2, 14);
                tmVar.r = w0Var;
                w0Var.setAdapter(new org.telegram.ui.z7(tmVar, 3));
                s4.c0 c0Var = new s4.c0(1, false);
                tmVar.s = c0Var;
                w0Var.setLayoutManager(c0Var);
                w0Var.setClipChildren(false);
                w0Var.setClipToPadding(false);
                w0Var.setOverScrollMode(2);
                w0Var.setVerticalScrollBarEnabled(false);
                sm smVar = new sm(tmVar, context);
                tmVar.v = smVar;
                smVar.setClipToPadding(true);
                smVar.setClipChildren(true);
                tmVar.addView(w0Var, w7.z5.c(-1.0f, -1));
                tmVar.P = tmVar.b.j0;
                smVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tmVar.P;
                smVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                smVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                smVar.c();
                UndoView undoView = new UndoView(context, null, false, tmVar.b.r);
                tmVar.w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                tmVar.addView(undoView, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                tmVar.N = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.q0 = tmVar;
                tmVar.bringToFront();
            }
            pi piVar2 = this.y0;
            tm tmVar2 = this.q0;
            if (piVar2 != tmVar2) {
                piVar = tmVar2;
            }
            P1(piVar);
        }
    }

    public final void Z0() {
        if (m1().a.length() <= 0) {
            return;
        }
        this.y0.a(m1().getText());
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
    public final void Z1(int i10) {
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
        pi piVar = i10 == 0 ? this.y0 : this.z0;
        if (piVar == null || piVar.getVisibility() != 0) {
            return;
        }
        int o12 = o1(i10);
        if (piVar == this.m0 || piVar == this.n0) {
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
        wh whVar = this.i1;
        float dp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - whVar.getAlpha()) * 26.0f);
        boolean z10 = this.q1;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.a1;
        ci.m6 m6Var = this.O0;
        if (z10 && this.Q0 == 0 && !this.T0) {
            v0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37), ((o12 - AndroidUtilities.dp((i11 * f14) + 37.0f)) + dp) - (m6Var.getAlpha() * m6Var.getMeasuredHeight())) + this.l2);
        } else {
            v0Var2.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37)) + this.l2);
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.c1;
        if (v0Var3 != null) {
            v0Var3.setTranslationY(v0Var2.getTranslationY());
        }
        ci.e4 e4Var = this.d1;
        if (e4Var != null) {
            e4Var.setTranslationY(v0Var2.getTranslationY());
        }
        if (this.F && this.s1) {
            pi piVar2 = this.z0;
            if (piVar2 != null && this.y0 != null) {
                f7 = Math.min(piVar2.getTranslationY(), this.y0.getTranslationY());
            } else if (piVar2 != null) {
                f7 = piVar2.getTranslationY();
            }
            v0Var = this.e1;
            if (v0Var != null) {
                v0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i11 + 37)) + this.l2);
            }
            float dp2 = ((((o12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.l2) + f7) - (m6Var.getAlpha() * m6Var.getMeasuredHeight());
            this.p1 = dp2;
            whVar.setTranslationY(Math.max(this.l2, dp2));
            m6Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.l2, (whVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.p1 + AndroidUtilities.dp(8.0f)));
            if (this.c0) {
                T1();
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
                xn xnVar = this.m0;
                if (xnVar == this.z0) {
                    f11 = (xnVar.getTranslationY() + o1(1)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                    f10 = this.d0;
                } else if (xnVar == this.y0) {
                    f11 = (xnVar.getTranslationY() + o1(0)) - AndroidUtilities.dp(((i12 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
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
                    xn xnVar2 = this.n0;
                    if (xnVar2 == this.z0) {
                        f13 = (xnVar2.getTranslationY() + o1(1)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
                        f12 = this.d0;
                    } else if (xnVar2 == this.y0) {
                        f13 = (xnVar2.getTranslationY() + o1(0)) - AndroidUtilities.dp(((i13 * f14) + 7.0f) - ((1.0f - f14) * 12.0f));
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
        float dp22 = ((((o12 - AndroidUtilities.dp((i11 * f14) + 25.0f)) + dp) + this.l2) + f7) - (m6Var.getAlpha() * m6Var.getMeasuredHeight());
        this.p1 = dp22;
        whVar.setTranslationY(Math.max(this.l2, dp22));
        m6Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.l2, (whVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.p1 + AndroidUtilities.dp(8.0f)));
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

    @Override // le.d
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        pi piVar;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        if (i10 == 2) {
            e1();
            xn xnVar = this.m0;
            if (xnVar != null && ((piVar = this.z0) == xnVar || this.y0 == xnVar)) {
                Z1(piVar == xnVar ? 1 : 0);
            }
            xn xnVar2 = this.n0;
            if (xnVar2 != null) {
                pi piVar2 = this.z0;
                if (piVar2 == xnVar2 || this.y0 == xnVar2) {
                    Z1(piVar2 != xnVar2 ? 0 : 1);
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
            ei eiVar = this.I0;
            if (eiVar != null) {
                eiVar.setEphemeralFactor(f7);
                eiVar.setSameWidthFactor(f7);
            }
        }
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        return (n2Var instanceof org.telegram.ui.yn) && ((org.telegram.ui.yn) n2Var).K6();
    }

    public final void a2() {
        int i10 = 0;
        Z1(0);
        this.r1.invalidate();
        ci.m6 m6Var = this.O0;
        m6Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        if (chatAttachAlertPhotoLayout != null) {
            wl wlVar = chatAttachAlertPhotoLayout.E;
            chatAttachAlertPhotoLayout.T();
            if (wlVar != null && wlVar.getFastScroll() != null) {
                fl0 fastScroll = wlVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1;
                if (this.c0) {
                    i10 = (int) (m6Var.getAlpha() * m6Var.getMeasuredHeight());
                }
                fastScroll.h0 = currentActionBarHeight + i10;
                wlVar.getFastScroll().invalidate();
            }
        }
        T1();
        g1();
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (!(n2Var instanceof org.telegram.ui.yn)) {
            return false;
        }
        return ChatActivityEnterView.G(this.J1, ((org.telegram.ui.yn) n2Var).a(), n2Var, charSequence);
    }

    public final void c1() {
        xh xhVar = this.y1;
        if (xhVar == null) {
            return;
        }
        int childCount = xhVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            xhVar.getChildAt(i10);
        }
        boolean z10 = this.h2;
        this.j1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5));
        this.o1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5));
        this.f1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Sh));
        int themedColor = getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5);
        org.telegram.ui.ActionBar.v0 v0Var = this.a1;
        v0Var.setIconColor(themedColor);
        org.telegram.ui.ActionBar.i6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.ig : org.telegram.ui.ActionBar.i6.I5), v0Var.getBackground());
        int i11 = org.telegram.ui.ActionBar.i6.E8;
        v0Var.G(getThemedColor(i11), false);
        v0Var.G(getThemedColor(i11), true);
        v0Var.B(getThemedColor(org.telegram.ui.ActionBar.i6.G8));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.c1;
        if (v0Var2 != null) {
            v0Var2.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5));
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.e1;
        if (v0Var3 != null) {
            v0Var3.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5));
            org.telegram.ui.ActionBar.i6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.ig : org.telegram.ui.ActionBar.i6.I5), v0Var3.getBackground());
        }
        zh zhVar = this.E0;
        org.telegram.ui.ActionBar.d6 d6Var = zhVar.M;
        hu huVar = zhVar.a;
        int i12 = zhVar.L;
        if (i12 == 0) {
            huVar.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H6, d6Var));
            int i13 = org.telegram.ui.ActionBar.i6.G6;
            huVar.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
            huVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
        } else if (i12 == 2 || i12 == 3) {
            huVar.setHintTextColor(-1929379841);
            huVar.setTextColor(-1);
            huVar.setCursorColor(-1);
            huVar.setHandlesColor(-1);
            huVar.setHighlightColor(822083583);
            huVar.quoteColor = -1;
        } else {
            huVar.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.t5, d6Var));
            huVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.j5, d6Var));
        }
        zhVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
        iu iuVar = zhVar.d;
        if (iuVar != null) {
            iuVar.Q();
        }
        xhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.i6.A5));
        int themedColor2 = getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5);
        y7 y7Var = this.X0;
        y7Var.A(themedColor2, false);
        y7Var.z(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.ig : org.telegram.ui.ActionBar.i6.I5), false);
        y7Var.setTitleColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.i6.hg : org.telegram.ui.ActionBar.i6.j5));
        int p12 = p1(false);
        org.telegram.ui.ActionBar.i6.w1(p12, this.shadowDrawable);
        fh.c cVar = this.D2;
        if (cVar.b != p12) {
            cVar.a(p12);
            jh.f fVar = this.v1;
            if (fVar != null) {
                fVar.invalidate();
            }
            yh yhVar = this.w1;
            if (yhVar != null) {
                yhVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i14 = 0;
        while (true) {
            pi[] piVarArr = this.w0;
            if (i14 >= piVarArr.length) {
                break;
            }
            pi piVar = piVarArr[i14];
            if (piVar != null) {
                piVar.d();
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
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.yn)) {
            return;
        }
        org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
        mu muVar = this.c0 ? this.P0 : this.E0;
        String obj = muVar != null ? muVar.getText().toString() : null;
        if (this.H1 == null) {
            pi piVar = this.y0;
            z11 = true;
            if (piVar != null) {
            }
            if (yf.u.g(this.J1).e(obj, ynVar.b8) <= 0) {
                MessageObject messageObject = ynVar.l5;
                if (messageObject != null) {
                }
            }
            this.h.a(z11, z10);
            if (z11 || !r1()) {
            }
            G1(false, z10);
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
            ui uiVar = this.A1;
            if (uiVar != null) {
                uiVar.l();
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
        vi viVar = this.Z1;
        if (viVar != null) {
            viVar.x0(new ih(this, 2));
        } else {
            E1();
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
        c20.d(this.F0, com.google.android.gms.internal.vision.e2.C(this.e.e, this.f.e, w7.d9.a(this.h.e), this.R1 ? 0.0f : 1.0f));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean g() {
        return true;
    }

    public final void g1() {
        ei eiVar = this.I0;
        wh whVar = this.H0;
        ci.m6 m6Var = this.O0;
        if (m6Var == null || m6Var.getVisibility() != 0 || m6Var.getAlpha() == 0.0f) {
            whVar.setTranslationY(this.g2);
            eiVar.setAlpha(1.0f);
            return;
        }
        float f7 = this.b.e;
        float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f7));
        eiVar.setAlpha(abs * abs * abs * abs);
        whVar.setTranslationY(AndroidUtilities.lerp(this.g2, ((m6Var.getTranslationY() + m6Var.getTop()) - whVar.getTop()) + AndroidUtilities.dp(8.0f), tr.j.getInterpolation(f7)));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            pi[] piVarArr = this.w0;
            if (i10 >= piVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.i5));
                return arrayList;
            }
            pi piVar = piVarArr[i10];
            if (piVar != null && (themeDescriptions = piVar.getThemeDescriptions()) != null) {
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
        if (!(n2Var instanceof org.telegram.ui.yn) || (messagePreviewParams = ((org.telegram.ui.yn) n2Var).d5) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        return n2Var instanceof org.telegram.ui.yn ? ((org.telegram.ui.yn) n2Var).e : MessagesController.getInstance(this.J1).getChat(Long.valueOf(-this.Z));
    }

    public final float l1() {
        return r0.getMeasuredHeight() - ((1.0f - this.D0.getAlpha()) * (r0.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final mu m1() {
        pi piVar;
        return (this.c0 && ((piVar = this.y0) == this.j0 || piVar == this.q0)) ? this.P0 : this.E0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        return n2Var instanceof org.telegram.ui.yn ? ((org.telegram.ui.yn) n2Var).a() : this.Z;
    }

    public final int o1(int i10) {
        pi piVar = this.z0;
        int[] iArr = this.b2;
        return (piVar == null || !((this.y0 instanceof tm) || (piVar instanceof tm))) ? iArr[i10] : AndroidUtilities.lerp(iArr[0], iArr[1], this.d0);
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
        ca1 ca1Var = chatAttachAlertPhotoLayout.l0;
        ai.f0 f0Var = chatAttachAlertPhotoLayout.j0;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        wl wlVar = chatAttachAlertPhotoLayout.r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        boolean z10 = i14 < i15;
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == f0Var) {
            if (z10) {
                if (wlVar.getVisibility() == 0) {
                    f0Var.layout(0, org.telegram.messenger.q.B(222.0f, i13, i16), i14, org.telegram.messenger.q.B(96.0f, i13, i16));
                    return true;
                }
                f0Var.layout(0, org.telegram.messenger.q.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            }
            if (wlVar.getVisibility() == 0) {
                f0Var.layout(org.telegram.messenger.q.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            }
            f0Var.layout(org.telegram.messenger.q.B(126.0f, i12, i16), 0, i12, i15 - i16);
            return true;
        }
        if (view == ca1Var) {
            if (z10) {
                if (wlVar.getVisibility() == 0) {
                    ca1Var.layout(0, org.telegram.messenger.q.B(310.0f, i13, i16), i14, org.telegram.messenger.q.B(260.0f, i13, i16));
                    return true;
                }
                ca1Var.layout(0, org.telegram.messenger.q.B(176.0f, i13, i16), i14, org.telegram.messenger.q.B(126.0f, i13, i16));
                return true;
            }
            if (wlVar.getVisibility() == 0) {
                ca1Var.layout(org.telegram.messenger.q.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            }
            ca1Var.layout(org.telegram.messenger.q.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
            return true;
        }
        if (view != textView) {
            if (view != wlVar) {
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
            if (wlVar.getVisibility() == 0) {
                dp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = dp3 - i16;
        } else {
            dp = i12 - AndroidUtilities.dp(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
            textView.setRotation(-90.0f);
            if (wlVar.getVisibility() == 0) {
                dp -= AndroidUtilities.dp(96.0f);
            }
        }
        textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        km kmVar = chatAttachAlertPhotoLayout.v;
        wl wlVar = chatAttachAlertPhotoLayout.r;
        gg.b0 b0Var = chatAttachAlertPhotoLayout.s;
        boolean z10 = i10 < i11;
        gm gmVar = chatAttachAlertPhotoLayout.P;
        if (view != gmVar) {
            ai.f0 f0Var = chatAttachAlertPhotoLayout.j0;
            if (view == f0Var) {
                if (z10) {
                    f0Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30));
                    return true;
                }
                f0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            ca1 ca1Var = chatAttachAlertPhotoLayout.l0;
            if (view == ca1Var) {
                if (z10) {
                    ca1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                    return true;
                }
                ca1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            if (view == wlVar) {
                chatAttachAlertPhotoLayout.J0 = true;
                if (z10) {
                    wlVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
                    if (b0Var.o != 0) {
                        wlVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        b0Var.j1(0);
                        kmVar.l();
                    }
                } else {
                    wlVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                    if (b0Var.o != 1) {
                        wlVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        b0Var.j1(1);
                        kmVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.J0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.b0 && !chatAttachAlertPhotoLayout.d0) {
            gmVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
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
        ii iiVar = this.o2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, iiVar, 0.0f, 400.0f));
        this.q2.setDuration(400L);
        this.q2.setStartDelay(20L);
        iiVar.set(this, Float.valueOf(0.0f));
        this.q2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new gh(this, i10));
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
        this.p2.a(new ei.n4(i10, this, oVar));
        this.currentSheetAnimation.addListener(new ai.z(22, this, oVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        J1(0.0f);
        ofFloat2.addUpdateListener(new gh(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(tr.f);
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
        if (this.f0 instanceof org.telegram.ui.yn) {
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

    public final int p1(boolean z10) {
        y7 y7Var;
        if (this.h2) {
            return getThemedColor(org.telegram.ui.ActionBar.i6.tg);
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
        boolean a2 = d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.i6.I.q();
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
        return i0.a.d(a10, getThemedColor(org.telegram.ui.ActionBar.i6.h5), getThemedColor(a2 ? org.telegram.ui.ActionBar.i6.a7 : org.telegram.ui.ActionBar.i6.i5));
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
    public final void q1() {
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        xi xiVar;
        gm gmVar;
        MediaController.AlbumEntry albumEntry;
        pi piVar;
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
        wh whVar = this.x1;
        whVar.setAlpha(1.0f);
        whVar.setTranslationY(0.0f);
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.x0;
            if (i11 >= longSparseArray.size()) {
                break;
            }
            ((ei.r4) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
            i11++;
        }
        int i12 = this.Q0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (i12 != 2) {
            if (n2Var instanceof org.telegram.ui.yn) {
                org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
                chat = ynVar.e;
                user = ynVar.i();
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
            z10 = n2Var instanceof org.telegram.ui.yn;
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
                    this.P1 = !z10 || ((org.telegram.ui.yn) n2Var).h == null;
                }
            }
            if (this.R1) {
                this.O1 = false;
                this.P1 = false;
            }
            zh zhVar = this.E0;
            if (z10 || this.Q0 == 2) {
                zhVar.setVisibility(this.W ? 0 : 4);
            }
            boolean z11 = this.M1;
            boolean z12 = this.L1;
            boolean z13 = this.K1;
            chatAttachAlertPhotoLayout = this.j0;
            xiVar = chatAttachAlertPhotoLayout.b;
            pz pzVar = chatAttachAlertPhotoLayout.H;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z11;
            chatAttachAlertPhotoLayout.x0 = z12;
            chatAttachAlertPhotoLayout.z0 = z13;
            gmVar = chatAttachAlertPhotoLayout.P;
            if (gmVar != null) {
                gmVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.P.setEnabled(chatAttachAlertPhotoLayout.v0);
            }
            if (!((xiVar.f0 instanceof org.telegram.ui.yn) && xiVar.k1() == null) && xiVar.Q0 == 0) {
                chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
                if (chatAttachAlertPhotoLayout.v0) {
                    pzVar.setText(LocaleController.getString(R.string.NoPhotos));
                    pzVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat k12 = xiVar.k1();
                    pzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    if (ChatObject.isActionBannedByDefault(k12, 7)) {
                        pzVar.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else if (AndroidUtilities.isBannedForever(k12.banned_rights)) {
                        pzVar.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                    } else {
                        pzVar.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(k12.banned_rights.until_date)));
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
            chatAttachAlertPhotoLayout.Y();
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.F.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
            albumEntry = chatAttachAlertPhotoLayout.U0;
            chatAttachAlertPhotoLayout.T0 = albumEntry;
            if (albumEntry != null) {
                chatAttachAlertPhotoLayout.X0 = false;
                if (pzVar != null) {
                    pzVar.c();
                }
            }
            chatAttachAlertPhotoLayout.u0();
            zhVar.k(true);
            this.P0.k(true);
            this.u1 = false;
            setFocusable(false);
            if (!this.O || this.P) {
                if (this.o0 == null) {
                    jl jlVar = new jl(this, getContext(), this.resourcesProvider, (this.H || this.P || this.R1) ? false : true);
                    this.o0 = jlVar;
                    this.w0[5] = jlVar;
                    el elVar = this.t2;
                    if (elVar != null) {
                        jlVar.setDelegate(elVar);
                    } else {
                        jlVar.setDelegate(new fh(this, i10));
                    }
                }
                this.W0 = 5L;
                piVar = this.o0;
            } else if (this.N) {
                D1(false);
                piVar = this.p0;
                this.W0 = 4L;
            } else {
                MessageObject messageObject = this.H1;
                if (messageObject != null) {
                    int i15 = this.G1;
                    if (i15 == -1) {
                        this.S0 = true;
                        if (messageObject.isMusic()) {
                            A1(false);
                            piVar = this.l0;
                            this.W0 = 3L;
                        } else if (this.H1.isDocument()) {
                            D1(false);
                            piVar = this.p0;
                            this.W0 = 4L;
                        } else {
                            this.W0 = 1L;
                        }
                    } else {
                        if (i15 == 2) {
                            A1(false);
                            piVar = this.l0;
                            this.W0 = 3L;
                        } else if (i15 == 1) {
                            D1(false);
                            piVar = this.p0;
                            this.W0 = 4L;
                        } else {
                            this.W0 = 1L;
                            piVar = chatAttachAlertPhotoLayout;
                        }
                        this.S0 = false;
                    }
                } else {
                    this.S0 = this.Q0 == 0 && !this.T0;
                    this.W0 = 1L;
                }
                piVar = chatAttachAlertPhotoLayout;
            }
            whVar.setVisibility(this.S0 ? 0 : 8);
            if (this.y0 != piVar) {
                y7 y7Var = this.X0;
                if (y7Var.n0) {
                    y7Var.h(true);
                }
                this.containerView.removeView(this.y0);
                this.y0.r();
                this.y0.setVisibility(8);
                this.y0.q();
                this.y0 = piVar;
                this.allowNestedScroll = true;
                if (piVar.getParent() == null) {
                    this.containerView.addView(this.y0, 0, w7.z5.c(-1.0f, -1));
                }
                piVar.setAlpha(1.0f);
                piVar.setVisibility(0);
                piVar.C(null);
                piVar.D();
                y7Var.setVisibility(piVar.h() != 0 ? 0 : 4);
                G1(this.c0, false);
                V1();
            }
            if (this.y0 != chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            U1(0);
            this.A1.l();
            m1().setText("");
            this.z1.h1(0, MediaController.VIDEO_BITRATE_480);
        }
        user = null;
        chat = null;
        z10 = n2Var instanceof org.telegram.ui.yn;
        if (z10) {
            if (chat != null) {
            }
            if (this.R1) {
            }
            zh zhVar2 = this.E0;
            if (z10) {
            }
            zhVar2.setVisibility(this.W ? 0 : 4);
            boolean z112 = this.M1;
            boolean z122 = this.L1;
            boolean z132 = this.K1;
            chatAttachAlertPhotoLayout = this.j0;
            xiVar = chatAttachAlertPhotoLayout.b;
            pz pzVar2 = chatAttachAlertPhotoLayout.H;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.v0 = z14;
            chatAttachAlertPhotoLayout.w0 = z112;
            chatAttachAlertPhotoLayout.x0 = z122;
            chatAttachAlertPhotoLayout.z0 = z132;
            gmVar = chatAttachAlertPhotoLayout.P;
            if (gmVar != null) {
            }
            if (xiVar.f0 instanceof org.telegram.ui.yn) {
            }
            chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
            if (chatAttachAlertPhotoLayout.v0) {
            }
            if (Build.VERSION.SDK_INT >= 23) {
            }
            if (chatAttachAlertPhotoLayout.U0 != null) {
            }
            chatAttachAlertPhotoLayout.Y();
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
            this.P0.k(true);
            this.u1 = false;
            setFocusable(false);
            if (this.O) {
            }
            if (this.o0 == null) {
            }
            this.W0 = 5L;
            piVar = this.o0;
            whVar.setVisibility(this.S0 ? 0 : 8);
            if (this.y0 != piVar) {
            }
            if (this.y0 != chatAttachAlertPhotoLayout) {
            }
            U1(0);
            this.A1.l();
            m1().setText("");
            this.z1.h1(0, MediaController.VIDEO_BITRATE_480);
        }
        if (chat != null) {
        }
        if (this.R1) {
        }
        zh zhVar22 = this.E0;
        if (z10) {
        }
        zhVar22.setVisibility(this.W ? 0 : 4);
        boolean z1122 = this.M1;
        boolean z1222 = this.L1;
        boolean z1322 = this.K1;
        chatAttachAlertPhotoLayout = this.j0;
        xiVar = chatAttachAlertPhotoLayout.b;
        pz pzVar22 = chatAttachAlertPhotoLayout.H;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.v0 = z14;
        chatAttachAlertPhotoLayout.w0 = z1122;
        chatAttachAlertPhotoLayout.x0 = z1222;
        chatAttachAlertPhotoLayout.z0 = z1322;
        gmVar = chatAttachAlertPhotoLayout.P;
        if (gmVar != null) {
        }
        if (xiVar.f0 instanceof org.telegram.ui.yn) {
        }
        chatAttachAlertPhotoLayout.U0 = MediaController.allMediaAlbumEntry;
        if (chatAttachAlertPhotoLayout.v0) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
        }
        if (chatAttachAlertPhotoLayout.U0 != null) {
        }
        chatAttachAlertPhotoLayout.Y();
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
        this.P0.k(true);
        this.u1 = false;
        setFocusable(false);
        if (this.O) {
        }
        if (this.o0 == null) {
        }
        this.W0 = 5L;
        piVar = this.o0;
        whVar.setVisibility(this.S0 ? 0 : 8);
        if (this.y0 != piVar) {
        }
        if (this.y0 != chatAttachAlertPhotoLayout) {
        }
        U1(0);
        this.A1.l();
        m1().setText("");
        this.z1.h1(0, MediaController.VIDEO_BITRATE_480);
    }

    public final boolean r1() {
        if (!this.c0) {
            return false;
        }
        pi piVar = this.y0;
        return piVar == this.j0 || piVar == this.q0;
    }

    public final void s1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        vi viVar = this.Z1;
        if (viVar == null || this.u1) {
            return;
        }
        boolean a02 = viVar.a0();
        this.u1 = true;
        AndroidUtilities.runOnUIThread(new ci.y0(this, editTextBoldCursor, z10, 18), a02 ? 200L : 0L);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean shouldOverlayCameraViewOverNavBar() {
        pi piVar = this.y0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.j0;
        return piVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.i1;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        this.I1 = false;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            this.calcMandatoryInsets = ((org.telegram.ui.yn) n2Var).w9();
        }
        V1();
        this.s1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.m2) {
            this.m2 = false;
            y7 y7Var = this.X0;
            y7Var.e();
            y7Var.invalidate();
            t1();
        }
    }

    public final void t1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int p12 = p1(false);
        org.telegram.ui.ActionBar.i6.w1(p12, this.shadowDrawable);
        fh.c cVar = this.D2;
        if (cVar.b != p12) {
            cVar.a(p12);
            jh.f fVar = this.v1;
            if (fVar != null) {
                fVar.invalidate();
            }
            yh yhVar = this.w1;
            if (yhVar != null) {
                yhVar.invalidate();
            }
        }
        V1();
        this.containerView.invalidate();
    }

    public final void u1() {
        int i10 = 0;
        while (true) {
            pi[] piVarArr = this.w0;
            if (i10 >= piVarArr.length) {
                break;
            }
            pi piVar = piVarArr[i10];
            if (piVar != null) {
                piVar.m();
            }
            i10++;
        }
        int i11 = this.J1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.V = true;
        zh zhVar = this.E0;
        if (zhVar != null) {
            zhVar.o();
        }
        bi biVar = this.P0;
        if (biVar != null) {
            biVar.o();
        }
    }

    public final void v1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
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
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.q5(this, tL_attachMenuBot, user, 23));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void w1() {
        int i10 = 0;
        while (true) {
            pi[] piVarArr = this.w0;
            if (i10 >= piVarArr.length) {
                this.f2 = true;
                return;
            }
            pi piVar = piVarArr[i10];
            if (piVar != null) {
                piVar.x();
            }
            i10++;
        }
    }

    public final void x1() {
        int i10 = 0;
        this.f2 = false;
        while (true) {
            pi[] piVarArr = this.w0;
            if (i10 >= piVarArr.length) {
                break;
            }
            pi piVar = piVarArr[i10];
            if (piVar != null) {
                piVar.z();
            }
            i10++;
        }
        if (isShowing()) {
            this.Z1.a0();
        }
        ui uiVar = this.A1;
        if (uiVar != null) {
            uiVar.l();
        }
    }

    public final void y1() {
        MessageObject messageObject = this.H1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        int i10 = this.J1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.H1.getDialogId()) && (n2Var instanceof org.telegram.ui.yn)) {
            org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
            MessageSuggestionParams messageSuggestionParams = ynVar.e5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.H1.messageOwner.suggested_post);
            }
            if (!yh.u5.U(i10, messageSuggestionParams.amount)) {
                ynVar.Sb(messageSuggestionParams);
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
            N1(n2Var);
            return;
        }
        if (this.H1 == null && (n2Var instanceof org.telegram.ui.yn)) {
            org.telegram.ui.yn ynVar2 = (org.telegram.ui.yn) n2Var;
            if (ynVar2.c()) {
                e5.M(getContext(), ynVar2.a(), new fh(this, 14), this.resourcesProvider);
                return;
            }
        }
        pi piVar = this.y0;
        if (piVar == this.j0 || piVar == this.q0) {
            F1(0, true, 0, r1(), this.N0);
            return;
        }
        if (piVar.G(0, true, 0, r1(), this.N0)) {
            return;
        }
        this.A2 = true;
        dismiss();
    }

    public final void z1(int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f0;
        if (i10 != 3) {
            if (i10 == 6 && AndroidUtilities.isMapsInstalled(n2Var)) {
                if (this.o0 == null) {
                    jl jlVar = new jl(this, getContext(), this.resourcesProvider, (this.H || this.R1) ? false : true);
                    this.o0 = jlVar;
                    this.w0[5] = jlVar;
                    el elVar = this.t2;
                    if (elVar != null) {
                        jlVar.setDelegate(elVar);
                    } else if (n2Var instanceof org.telegram.ui.yn) {
                        jlVar.setDelegate(new fh(this, 18));
                    }
                }
                P1(this.o0);
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
            A1(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        if (this.y0.n() || isDismissed()) {
            return;
        }
        zh zhVar = this.E0;
        if (zhVar != null) {
            AndroidUtilities.hideKeyboard(zhVar.getEditText());
        }
        bi biVar = this.P0;
        if (biVar != null) {
            AndroidUtilities.hideKeyboard(biVar.getEditText());
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
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new fh(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new lh(this, 0));
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
            pi[] piVarArr = this.w0;
            if (i10 >= piVarArr.length) {
                break;
            }
            pi piVar = piVarArr[i10];
            if (piVar != null && this.y0 != piVar) {
                piVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.a7), 0), true, (AndroidUtilities.IntColorCallback) new fh(this, 12));
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
        this.i2 = false;
        super.dismiss();
        this.A2 = false;
    }

    @Override // le.d
    public final /* synthetic */ void V(float f7, int i10) {
    }

    public xi(Activity activity, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        this(activity, n2Var, z10, z11, true, null);
    }
}

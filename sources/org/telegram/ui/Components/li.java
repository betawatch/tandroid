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
import org.telegram.ui.si1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class li extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.a3, xd.b {
    public static final /* synthetic */ int L2 = 0;
    public final mh A0;
    public boolean A1;
    public final sg.d A2;
    public final j0 B;
    public final qh B0;
    public final k6 B1;
    public final sg.d B2;
    public boolean C;
    public final ImageView C0;
    public float C1;
    public final sg.c C2;
    public boolean D;
    public final int[] D0;
    public int D1;
    public final ng.a D2;
    public boolean E;
    public final mh E0;
    public MessageObject E1;
    public final ng.a E2;
    public int F;
    public final vh F0;
    public boolean F1;
    public final ah F2;
    public Utilities.Callback2 G;
    public final TextPaint G0;
    public final int G1;
    public final ArrayList G2;
    public int H;
    public final RectF H0;
    public boolean H1;
    public final RectF H2;
    public int I;
    public final Paint I0;
    public boolean I1;
    public final RectF I2;
    public boolean J;
    public AnimatorSet J0;
    public boolean J1;
    public final RectF J2;
    public boolean K;
    public long K0;
    public boolean K1;
    public final ArrayList K2;
    public boolean L;
    public final ah.d L0;
    public boolean L1;
    public boolean M;
    public final th M0;
    public boolean M1;
    public u40 N;
    public int N0;
    public boolean N1;
    public boolean O;
    public mt O0;
    public boolean O1;
    public final vd0 P;
    public boolean P0;
    public int P1;
    public rn Q;
    public boolean Q0;
    public boolean Q1;
    public w40 R;
    public boolean R0;
    public boolean R1;
    public boolean S;
    public final float S0;
    public float S1;
    public boolean T;
    public long T0;
    public float T1;
    public xj U;
    public final eg.l1 U0;
    public ValueAnimator U1;
    public ti V;
    public AnimatorSet V0;
    public int V1;
    public long W;
    public AnimatorSet W0;
    public ji W1;
    public boolean X;
    public final org.telegram.ui.ActionBar.w0 X0;
    public cn X1;
    public final ng.b Y;
    public final jc0 Y0;
    public final int[] Y1;
    public boolean Z;
    public final org.telegram.ui.ActionBar.w0 Z0;
    public int Z1;
    public float a0;
    public ph.f3 a1;
    public float a2;
    public final xd.a b;
    public final yh b0;
    public final org.telegram.ui.ActionBar.w0 b1;
    public float b2;
    public final xd.a c;
    public final org.telegram.ui.ActionBar.p2 c0;
    public final eg.s0 c1;
    public boolean c2;
    public final xd.a d;
    public final boolean d0;
    public float d1;
    public float d2;
    public final xd.a e;
    public cf e0;
    public float e1;
    public final boolean e2;
    public final xd.a f;
    public boolean f0;
    public final mh f1;
    public boolean f2;
    public final ChatAttachAlertPhotoLayout g0;
    public final TextView g1;
    public final ArrayList g2;
    public final xd.a h;
    public qj h0;
    public final org.telegram.ui.ActionBar.w0 h1;
    public final Rect h2;
    public wi i0;
    public final LinearLayout i1;
    public float i2;
    public qn j0;
    public final ImageView j1;
    public boolean j2;
    public qn k0;
    public final LinearLayout k1;
    public int k2;
    public al l0;
    public final TextView l1;
    public final yh l2;
    public hk m0;
    public float m1;
    public o1.j m2;
    public final xd.j n;
    public om n0;
    public boolean n1;
    public AnimatorSet n2;
    public zi o0;
    public final bi o1;
    public boolean o2;
    public uf.c0 p0;
    public boolean p1;
    public boolean p2;
    public ik q0;
    public Object q1;
    public uk q2;
    public org.telegram.ui.vn r;
    public ik r0;
    public boolean r1;
    public boolean r2;
    public final k6 s;
    public vh.p s0;
    public final wg.f s1;
    public boolean s2;
    public final di[] t0;
    public final oh t1;
    public File t2;
    public final LongSparseArray u0;
    public final mh u1;
    public double[] u2;
    public final k6 v;
    public di v0;
    public final nh v1;
    public boolean v2;
    public final ImageView w;
    public di w0;
    public final f2.i0 w1;
    public boolean w2;
    public final j0 x;
    public final pg.b x0;
    public final ii x1;
    public boolean x2;
    public final ImageView y;
    public final pg.b y0;
    public boolean y1;
    public zh y2;
    public final ph z0;
    public final RadialProgressView z1;
    public final ng.e z2;

    public li(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, boolean z11, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        eg.s0 s0Var;
        int i10;
        float f10;
        nr nrVar = nr.h;
        this.b = new xd.a(0, this, nrVar, 380L, false);
        this.c = new xd.a(1, this, nrVar, 380L, false);
        this.d = new xd.a(2, this, nrVar, 380L, false);
        this.e = new xd.a(3, this, nrVar, 380L, false);
        this.f = new xd.a(4, this, nrVar, 380L, true);
        this.h = new xd.a(5, this, nrVar, 320L, false);
        xd.j jVar = new xd.j(new tg(this, 1), nrVar, 380L);
        this.n = jVar;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.a0 = 0.0f;
        this.b0 = new yh(this, 0);
        this.f0 = false;
        di[] diVarArr = new di[11];
        this.t0 = diVarArr;
        this.u0 = new LongSparseArray();
        this.D0 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.G0 = textPaint;
        this.H0 = new RectF();
        this.I0 = new Paint(1);
        this.R0 = true;
        this.S0 = 1.0f;
        this.y1 = false;
        this.A1 = false;
        int i11 = UserConfig.selectedAccount;
        this.G1 = i11;
        this.H1 = true;
        this.I1 = true;
        this.J1 = true;
        this.K1 = true;
        this.L1 = true;
        this.M1 = true;
        this.N1 = true;
        this.P1 = -1;
        this.Q1 = true;
        this.V1 = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.Y1 = new int[2];
        new Paint(1);
        this.f2 = false;
        ArrayList arrayList = new ArrayList();
        this.g2 = arrayList;
        Rect rect = new Rect();
        this.h2 = rect;
        this.l2 = new yh(this, 1);
        this.o2 = true;
        this.p2 = false;
        this.w2 = false;
        this.x2 = false;
        ArrayList arrayList2 = new ArrayList();
        this.G2 = arrayList2;
        RectF rectF = new RectF();
        this.H2 = rectF;
        RectF rectF2 = new RectF();
        this.I2 = rectF2;
        RectF rectF3 = new RectF();
        this.J2 = rectF3;
        arrayList2.add(rectF);
        arrayList2.add(rectF2);
        arrayList2.add(rectF3);
        this.K2 = new ArrayList();
        this.occupyNavigationBarWithoutKeyboard = true;
        sg.c cVar = new sg.c();
        this.C2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        final int i12 = 4;
        if (Build.VERSION.SDK_INT >= 31) {
            this.z2 = new ng.e(false);
            sg.d dVar = new sg.d(null);
            this.B2 = dVar;
            dVar.j(new ja.c(this, 24));
            sg.d dVar2 = new sg.d(null);
            this.A2 = dVar2;
            dVar2.j(new o2.o(this, i12));
            ng.a aVar = new ng.a(dVar);
            this.D2 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            ng.a aVar2 = new ng.a(dVar2);
            this.E2 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
        } else {
            this.z2 = null;
            this.A2 = null;
            this.B2 = null;
            this.D2 = new ng.a(cVar);
            this.E2 = new ng.a(cVar);
        }
        ng.a aVar3 = new ng.a(cVar);
        this.F2 = new ah(this, 0);
        this.e2 = z4;
        this.d0 = (p2Var instanceof org.telegram.ui.xn) && p2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.c0 = p2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        bi biVar = new bi(this, context);
        this.o1 = biVar;
        biVar.setDelegate(new ci(this));
        this.containerView = biVar;
        biVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        eg.l1 l1Var = new eg.l1(this, context, f6Var, 2);
        this.U0 = l1Var;
        l1Var.P0 = true;
        l1Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        l1Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        int i14 = org.telegram.ui.ActionBar.j6.j5;
        l1Var.C(getThemedColor(i14), false);
        int i15 = org.telegram.ui.ActionBar.j6.I5;
        l1Var.B(getThemedColor(i15), false);
        l1Var.setTitleColor(getThemedColor(i14));
        l1Var.setOccupyStatusBar(true);
        l1Var.setAlpha(0.0f);
        l1Var.setActionBarMenuOnItemClick(new eg.m1(this, 25));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i14), false, f6Var);
        this.X0 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.ic_ab_other);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var2.setVisibility(4);
        w0Var2.setAlpha(0.0f);
        w0Var2.setScaleX(0.6f);
        w0Var2.setScaleY(0.6f);
        w0Var2.setSubMenuOpenSide(2);
        w0Var2.setDelegate(new tg(this, 8));
        w0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        w0Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 6, -1));
        w0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ li b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rh.o3 o3Var;
                switch (i12) {
                    case 0:
                        li liVar = this.b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (o3Var = (rh.o3) liVar.u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        li liVar2 = this.b;
                        boolean z12 = liVar2.Z;
                        if (!z12) {
                            liVar2.H1(!z12, true);
                            break;
                        }
                        break;
                    case 2:
                        li liVar3 = this.b;
                        boolean z13 = liVar3.Z;
                        if (z13) {
                            liVar3.H1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.X0.M(null, null);
                        break;
                    case 5:
                        li.s(this.b);
                        break;
                    case 6:
                        di diVar = this.b.v0;
                        if (diVar != null) {
                            diVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.h1.M(null, null);
                        break;
                    default:
                        li liVar4 = this.b;
                        liVar4.Z1(liVar4.v0 != liVar4.n0);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i14), false, f6Var);
        this.Z0 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        jc0 jc0Var = new jc0();
        this.Y0 = jc0Var;
        w0Var3.setIcon(jc0Var);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        w0Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 6, -1));
        final int i16 = 5;
        w0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ li b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rh.o3 o3Var;
                switch (i16) {
                    case 0:
                        li liVar = this.b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (o3Var = (rh.o3) liVar.u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        li liVar2 = this.b;
                        boolean z12 = liVar2.Z;
                        if (!z12) {
                            liVar2.H1(!z12, true);
                            break;
                        }
                        break;
                    case 2:
                        li liVar3 = this.b;
                        boolean z13 = liVar3.Z;
                        if (z13) {
                            liVar3.H1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.X0.M(null, null);
                        break;
                    case 5:
                        li.s(this.b);
                        break;
                    case 6:
                        di diVar = this.b.v0;
                        if (diVar != null) {
                            diVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.h1.M(null, null);
                        break;
                    default:
                        li liVar4 = this.b;
                        liVar4.Z1(liVar4.v0 != liVar4.n0);
                        break;
                }
            }
        });
        eg.s0 s0Var2 = new eg.s0(this, context);
        s0Var2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        s0Var2.setText(LocaleController.getString(R.string.Create));
        s0Var2.setTypeface(AndroidUtilities.bold());
        s0Var2.setTextSize(1, 14.0f);
        s0Var2.setVisibility(4);
        s0Var2.setAlpha(0.0f);
        s0Var2.setGravity(17);
        s0Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        s0Var2.setTranslationX(-AndroidUtilities.dp(12.0f));
        final int i17 = 6;
        s0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ li b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rh.o3 o3Var;
                switch (i17) {
                    case 0:
                        li liVar = this.b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (o3Var = (rh.o3) liVar.u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        li liVar2 = this.b;
                        boolean z12 = liVar2.Z;
                        if (!z12) {
                            liVar2.H1(!z12, true);
                            break;
                        }
                        break;
                    case 2:
                        li liVar3 = this.b;
                        boolean z13 = liVar3.Z;
                        if (z13) {
                            liVar3.H1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.X0.M(null, null);
                        break;
                    case 5:
                        li.s(this.b);
                        break;
                    case 6:
                        di diVar = this.b.v0;
                        if (diVar != null) {
                            diVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.h1.M(null, null);
                        break;
                    default:
                        li liVar4 = this.b;
                        liVar4.Z1(liVar4.v0 != liVar4.n0);
                        break;
                }
            }
        });
        k7.d6.a(s0Var2);
        this.c1 = s0Var2;
        W1();
        if (p2Var != null) {
            w0Var = w0Var3;
            s0Var = s0Var2;
            i10 = -1;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i14), false, f6Var);
            this.b1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            w0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 6, -1));
            w0Var4.setOnClickListener(new nh.a2(5, this, z10));
        } else {
            w0Var = w0Var3;
            s0Var = s0Var2;
            i10 = -1;
            f10 = 14.0f;
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i14), false, f6Var);
        this.h1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var5.setVisibility(8);
        w0Var5.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i15), 3, i10));
        final int i18 = 2;
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yg
            public final /* synthetic */ li b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        final li liVar = this.b;
                        qh qhVar = liVar.B0;
                        if (qhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(liVar.getContext(), f6Var);
                            f0Var.m0(qhVar.getText());
                            final int i19 = 0;
                            f0Var.g0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.bh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i19) {
                                        case 0:
                                            qh qhVar2 = liVar.B0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            th thVar = liVar.M0;
                                            thVar.setText(charSequence);
                                            thVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = liVar.W;
                            boolean z12 = liVar.E1 != null;
                            ch chVar = new ch(liVar, 0);
                            f0Var.i0 = j10;
                            f0Var.j0 = z12;
                            f0Var.k0 = chVar;
                            f0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final li liVar2 = this.b;
                        th thVar = liVar2.M0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(liVar2.getContext(), f6Var);
                            f0Var2.m0(thVar.getText());
                            final int i20 = 1;
                            f0Var2.g0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.bh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            qh qhVar2 = liVar2.B0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            th thVar2 = liVar2.M0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = liVar2.W;
                            boolean z13 = liVar2.E1 != null;
                            ch chVar2 = new ch(liVar2, 1);
                            f0Var2.i0 = j11;
                            f0Var2.j0 = z13;
                            f0Var2.k0 = chVar2;
                            f0Var2.show();
                            break;
                        }
                        break;
                    default:
                        li liVar3 = this.b;
                        liVar3.h1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = liVar3.c0;
                        t12.K2(null, p2Var2, f6Var);
                        PhotoViewer.t1().L2(liVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i21 = liVar3.P1;
                        boolean z14 = liVar3.Q1;
                        t13.h = i21;
                        t13.n = z14;
                        if (!liVar3.W1.k()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(liVar3.getContainer().findFocus());
                        }
                        File w10 = ph.u6.w(liVar3.G1, "webp");
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
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new lh(liVar3, photoEntry), p2Var2 instanceof org.telegram.ui.xn ? (org.telegram.ui.xn) p2Var2 : null);
                        if (liVar3.D) {
                            PhotoViewer.t1().X0(null, null, true, liVar3.G);
                            break;
                        }
                        break;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        final int i19 = 7;
        w0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ li b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rh.o3 o3Var;
                switch (i19) {
                    case 0:
                        li liVar = this.b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (o3Var = (rh.o3) liVar.u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        li liVar2 = this.b;
                        boolean z12 = liVar2.Z;
                        if (!z12) {
                            liVar2.H1(!z12, true);
                            break;
                        }
                        break;
                    case 2:
                        li liVar3 = this.b;
                        boolean z13 = liVar3.Z;
                        if (z13) {
                            liVar3.H1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.X0.M(null, null);
                        break;
                    case 5:
                        li.s(this.b);
                        break;
                    case 6:
                        di diVar = this.b.v0;
                        if (diVar != null) {
                            diVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.h1.M(null, null);
                        break;
                    default:
                        li liVar4 = this.b;
                        liVar4.Z1(liVar4.v0 != liVar4.n0);
                        break;
                }
            }
        });
        mh mhVar = new mh(this, context, 0);
        this.f1 = mhVar;
        final int i20 = 8;
        mhVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ li b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rh.o3 o3Var;
                switch (i20) {
                    case 0:
                        li liVar = this.b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (o3Var = (rh.o3) liVar.u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        li liVar2 = this.b;
                        boolean z12 = liVar2.Z;
                        if (!z12) {
                            liVar2.H1(!z12, true);
                            break;
                        }
                        break;
                    case 2:
                        li liVar3 = this.b;
                        boolean z13 = liVar3.Z;
                        if (z13) {
                            liVar3.H1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.X0.M(null, null);
                        break;
                    case 5:
                        li.s(this.b);
                        break;
                    case 6:
                        di diVar = this.b.v0;
                        if (diVar != null) {
                            diVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.h1.M(null, null);
                        break;
                    default:
                        li liVar4 = this.b;
                        liVar4.Z1(liVar4.v0 != liVar4.n0);
                        break;
                }
            }
        });
        mhVar.setAlpha(0.0f);
        mhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.i1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.g1 = textView;
        textView.setTextColor(getThemedColor(i14));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, k7.b6.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.j1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, k7.b6.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        mhVar.addView(linearLayout, k7.b6.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.k1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i14), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, k7.b6.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.l1 = textView2;
        textView2.setTextColor(getThemedColor(i14));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, k7.b6.q(-2, -2, 16));
        mhVar.addView(linearLayout2, k7.b6.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z4, z11, f6Var);
        this.g0 = chatAttachAlertPhotoLayout;
        diVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.v0 = chatAttachAlertPhotoLayout;
        this.T0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, k7.b6.c(-1.0f, -1));
        wg.f fVar = new wg.f(context);
        this.s1 = fVar;
        fVar.setup(aVar3);
        fVar.setFadeTopAlpha(0);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(fVar, k7.b6.g());
        this.containerView.addView(mhVar, k7.b6.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ah.d dVar3 = new ah.d(context);
        this.L0 = dVar3;
        this.containerView.addView(dVar3, k7.b6.e(-1, -2, 55));
        this.containerView.addView(l1Var, k7.b6.c(-2.0f, -1));
        this.containerView.addView(w0Var2, k7.b6.e(48, 48, 53));
        this.containerView.addView(w0Var, k7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.b1;
        if (w0Var6 != null) {
            this.containerView.addView(w0Var6, k7.b6.e(48, 48, 53));
        }
        mhVar.addView(w0Var5, k7.b6.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(s0Var, k7.b6.e(-2, 48, 53));
        mh mhVar2 = new mh(this, context, 1);
        this.u1 = mhVar2;
        nh nhVar = new nh(context, 0);
        this.v1 = nhVar;
        nhVar.setClipChildren(true);
        nhVar.setClipToPadding(false);
        ii iiVar = new ii(this, context);
        this.x1 = iiVar;
        nhVar.setAdapter(iiVar);
        f2.i0 i0Var = new f2.i0(0, false);
        this.w1 = i0Var;
        nhVar.setLayoutManager(i0Var);
        nhVar.setVerticalScrollBarEnabled(false);
        nhVar.setHorizontalScrollBarEnabled(false);
        nhVar.setItemAnimator(null);
        nhVar.setLayoutAnimation(null);
        nhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        nhVar.w2 = true;
        nhVar.setOverScrollMode(2);
        ng.a aVar4 = this.D2;
        ug.i iVar = new ug.i(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = iVar;
        aVar4.e = viewGroup2;
        ng.a aVar5 = this.E2;
        ug.i iVar2 = new ug.i(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = iVar2;
        aVar5.e = viewGroup3;
        ug.i iVar3 = new ug.i(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        aVar3.d = iVar3;
        aVar3.e = viewGroup4;
        oh ohVar = new oh(this, context, 0);
        this.t1 = ohVar;
        ng.b bVar = new ng.b(aVar3.c(ohVar, null, false));
        this.Y = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(ohVar, k7.b6.g());
        pg.b c3 = this.D2.c(mhVar2, rg.b.f(f6Var), false);
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(7.0f));
        mhVar2.setBackground(c3);
        nhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        nhVar.setClipToOutline(true);
        int dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(28.0f);
        gg.j1 j1Var = lf.q0.a;
        nhVar.setOutlineProvider(new lf.p0(dp, dp2));
        nhVar.setImportantForAccessibility(1);
        mhVar2.addView(nhVar, k7.b6.g());
        this.containerView.addView(mhVar2, k7.b6.e(-1, 70, 81));
        nhVar.setOnItemClickListener(new gg.v0(10, this, f6Var));
        nhVar.setOnItemLongClickListener(new tg(this, 3));
        final int i21 = 0;
        k6 k6Var = new k6(context, true, false, true);
        this.B1 = k6Var;
        k6Var.setVisibility(8);
        k6Var.setAlpha(0.0f);
        k6Var.setGravity(17);
        k6Var.setTypeface(AndroidUtilities.bold());
        int dp3 = AndroidUtilities.dp(16.0f);
        k6Var.setPadding(dp3, 0, dp3, 0);
        k6Var.setTextSize(AndroidUtilities.dp(f10));
        k6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ li b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rh.o3 o3Var;
                switch (i21) {
                    case 0:
                        li liVar = this.b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (o3Var = (rh.o3) liVar.u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        li liVar2 = this.b;
                        boolean z12 = liVar2.Z;
                        if (!z12) {
                            liVar2.H1(!z12, true);
                            break;
                        }
                        break;
                    case 2:
                        li liVar3 = this.b;
                        boolean z13 = liVar3.Z;
                        if (z13) {
                            liVar3.H1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.X0.M(null, null);
                        break;
                    case 5:
                        li.s(this.b);
                        break;
                    case 6:
                        di diVar = this.b.v0;
                        if (diVar != null) {
                            diVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.h1.M(null, null);
                        break;
                    default:
                        li liVar4 = this.b;
                        liVar4.Z1(liVar4.v0 != liVar4.n0);
                        break;
                }
            }
        });
        this.containerView.addView(k6Var, k7.b6.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.z1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, k7.b6.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.C0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i22 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ li b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rh.o3 o3Var;
                switch (i22) {
                    case 0:
                        li liVar = this.b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (o3Var = (rh.o3) liVar.u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        li liVar2 = this.b;
                        boolean z12 = liVar2.Z;
                        if (!z12) {
                            liVar2.H1(!z12, true);
                            break;
                        }
                        break;
                    case 2:
                        li liVar3 = this.b;
                        boolean z13 = liVar3.Z;
                        if (z13) {
                            liVar3.H1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.X0.M(null, null);
                        break;
                    case 5:
                        li.s(this.b);
                        break;
                    case 6:
                        di diVar = this.b.v0;
                        if (diVar != null) {
                            diVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.h1.M(null, null);
                        break;
                    default:
                        li liVar4 = this.b;
                        liVar4.Z1(liVar4.v0 != liVar4.n0);
                        break;
                }
            }
        });
        mh mhVar3 = new mh(this, context, 2);
        this.A0 = mhVar3;
        ph phVar = new ph(this, context);
        this.z0 = phVar;
        mhVar3.addView(phVar, k7.b6.e(-1, -1, 119));
        pg.b c10 = this.E2.c(biVar, rg.b.m(f6Var), false);
        this.x0 = c10;
        c10.k = true;
        c10.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c10.t(AndroidUtilities.dp(32.0f));
        c10.h.g = 0.4f;
        c10.j();
        pg.b c11 = this.D2.c(phVar, rg.b.m(f6Var), false);
        this.y0 = c11;
        c11.p(AndroidUtilities.dp(22.0f));
        c11.o(AndroidUtilities.dp(7.0f));
        phVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        mhVar3.setWillNotDraw(false);
        mhVar3.setVisibility(4);
        mhVar3.setAlpha(0.0f);
        this.containerView.addView(mhVar3, k7.b6.e(-1, -2, 83));
        mhVar3.setOnTouchListener(new oh.d(13));
        k6 k6Var2 = new k6(context, false, false, false);
        this.s = k6Var2;
        k6Var2.setAllowCancel(true);
        k6Var2.setScaleProperty(0.6f);
        k6Var2.setVisibility(8);
        k6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i23 = org.telegram.ui.ActionBar.j6.y6;
        k6Var2.setTextColor(getThemedColor(i23));
        k6Var2.setTypeface(AndroidUtilities.bold());
        k6Var2.setGravity(17);
        phVar.addView(k6Var2, k7.b6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.w = imageView4;
        j0 j0Var = new j0(context);
        this.x = j0Var;
        imageView4.setImageDrawable(j0Var);
        imageView4.setScaleType(scaleType);
        int i24 = org.telegram.ui.ActionBar.j6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i24), mode));
        int i25 = org.telegram.ui.ActionBar.j6.i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i25), 1, AndroidUtilities.dp(16.0f)));
        phVar.addView(imageView4, k7.b6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        k7.d6.a(imageView4);
        final int i26 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yg
            public final /* synthetic */ li b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i26) {
                    case 0:
                        final li liVar = this.b;
                        qh qhVar = liVar.B0;
                        if (qhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(liVar.getContext(), f6Var);
                            f0Var.m0(qhVar.getText());
                            final int i192 = 0;
                            f0Var.g0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.bh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            qh qhVar2 = liVar.B0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            th thVar2 = liVar.M0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = liVar.W;
                            boolean z12 = liVar.E1 != null;
                            ch chVar = new ch(liVar, 0);
                            f0Var.i0 = j10;
                            f0Var.j0 = z12;
                            f0Var.k0 = chVar;
                            f0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final li liVar2 = this.b;
                        th thVar = liVar2.M0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(liVar2.getContext(), f6Var);
                            f0Var2.m0(thVar.getText());
                            final int i202 = 1;
                            f0Var2.g0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.bh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            qh qhVar2 = liVar2.B0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            th thVar2 = liVar2.M0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = liVar2.W;
                            boolean z13 = liVar2.E1 != null;
                            ch chVar2 = new ch(liVar2, 1);
                            f0Var2.i0 = j11;
                            f0Var2.j0 = z13;
                            f0Var2.k0 = chVar2;
                            f0Var2.show();
                            break;
                        }
                        break;
                    default:
                        li liVar3 = this.b;
                        liVar3.h1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = liVar3.c0;
                        t12.K2(null, p2Var2, f6Var);
                        PhotoViewer.t1().L2(liVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i212 = liVar3.P1;
                        boolean z14 = liVar3.Q1;
                        t13.h = i212;
                        t13.n = z14;
                        if (!liVar3.W1.k()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(liVar3.getContainer().findFocus());
                        }
                        File w10 = ph.u6.w(liVar3.G1, "webp");
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
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new lh(liVar3, photoEntry), p2Var2 instanceof org.telegram.ui.xn ? (org.telegram.ui.xn) p2Var2 : null);
                        if (liVar3.D) {
                            PhotoViewer.t1().X0(null, null, true, liVar3.G);
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
        this.H = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        qh qhVar = new qh(this, context, biVar, f6Var);
        this.B0 = qhVar;
        qhVar.G = true;
        qhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        qhVar.s();
        qhVar.getEditText().setLayoutParams(k7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        qhVar.getEditText().addTextChangedListener(new sh(this));
        phVar.addView(qhVar, k7.b6.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        phVar.setClipChildren(false);
        mhVar3.setClipChildren(false);
        qhVar.setClipChildren(false);
        dVar3.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        dVar3.setWillNotDraw(false);
        th thVar = new th(this, context, biVar, f6Var);
        this.M0 = thVar;
        thVar.G = true;
        thVar.getEditText().addTextChangedListener(new uh(this, p2Var));
        thVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        thVar.getEditText().setLayoutParams(k7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        thVar.getEditText().setTextSize(1, 17.0f);
        thVar.getEmojiButton().setLayoutParams(k7.b6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        thVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        dVar3.addView(thVar, k7.b6.e(-1, -2, 119));
        dVar3.setAlpha(0.0f);
        dVar3.setVisibility(8);
        qhVar.addView(imageView3, k7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        pg.b c12 = this.D2.c(dVar3, rg.b.m(f6Var), false);
        c12.p(AndroidUtilities.dp(22.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        dVar3.setBackground(c12);
        dVar3.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        k6 k6Var3 = new k6(context, false, false, false);
        this.v = k6Var3;
        k6Var3.setScaleProperty(0.6f);
        k6Var3.setVisibility(8);
        k6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var3.setTextColor(getThemedColor(i23));
        k6Var3.setTypeface(AndroidUtilities.bold());
        k6Var3.setGravity(17);
        k6Var3.setAllowCancel(true);
        dVar3.addView(k6Var3, k7.b6.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Xd), mode2));
        thVar.addView(imageView5, k7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i27 = 2;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ li b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rh.o3 o3Var;
                switch (i27) {
                    case 0:
                        li liVar = this.b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (o3Var = (rh.o3) liVar.u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        li liVar2 = this.b;
                        boolean z12 = liVar2.Z;
                        if (!z12) {
                            liVar2.H1(!z12, true);
                            break;
                        }
                        break;
                    case 2:
                        li liVar3 = this.b;
                        boolean z13 = liVar3.Z;
                        if (z13) {
                            liVar3.H1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.X0.M(null, null);
                        break;
                    case 5:
                        li.s(this.b);
                        break;
                    case 6:
                        di diVar = this.b.v0;
                        if (diVar != null) {
                            diVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.h1.M(null, null);
                        break;
                    default:
                        li liVar4 = this.b;
                        liVar4.Z1(liVar4.v0 != liVar4.n0);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.y = imageView6;
        j0 j0Var2 = new j0(context);
        this.B = j0Var2;
        imageView6.setImageDrawable(j0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i24), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i25), 1, AndroidUtilities.dp(16.0f)));
        dVar3.addView(imageView6, k7.b6.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        k7.d6.a(imageView6);
        final int i28 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yg
            public final /* synthetic */ li b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i28) {
                    case 0:
                        final li liVar = this.b;
                        qh qhVar2 = liVar.B0;
                        if (qhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var = new f0(liVar.getContext(), f6Var);
                            f0Var.m0(qhVar2.getText());
                            final int i192 = 0;
                            f0Var.g0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.bh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            qh qhVar22 = liVar.B0;
                                            qhVar22.setText(charSequence);
                                            qhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            th thVar2 = liVar.M0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = liVar.W;
                            boolean z12 = liVar.E1 != null;
                            ch chVar = new ch(liVar, 0);
                            f0Var.i0 = j10;
                            f0Var.j0 = z12;
                            f0Var.k0 = chVar;
                            f0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final li liVar2 = this.b;
                        th thVar2 = liVar2.M0;
                        if (thVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            f0 f0Var2 = new f0(liVar2.getContext(), f6Var);
                            f0Var2.m0(thVar2.getText());
                            final int i202 = 1;
                            f0Var2.g0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.bh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            qh qhVar22 = liVar2.B0;
                                            qhVar22.setText(charSequence);
                                            qhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            th thVar22 = liVar2.M0;
                                            thVar22.setText(charSequence);
                                            thVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = liVar2.W;
                            boolean z13 = liVar2.E1 != null;
                            ch chVar2 = new ch(liVar2, 1);
                            f0Var2.i0 = j11;
                            f0Var2.j0 = z13;
                            f0Var2.k0 = chVar2;
                            f0Var2.show();
                            break;
                        }
                        break;
                    default:
                        li liVar3 = this.b;
                        liVar3.h1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.p2 p2Var2 = liVar3.c0;
                        t12.K2(null, p2Var2, f6Var);
                        PhotoViewer.t1().L2(liVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i212 = liVar3.P1;
                        boolean z14 = liVar3.Q1;
                        t13.h = i212;
                        t13.n = z14;
                        if (!liVar3.W1.k()) {
                            AndroidUtilities.hideKeyboard(p2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(liVar3.getContainer().findFocus());
                        }
                        File w10 = ph.u6.w(liVar3.G1, "webp");
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
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new lh(liVar3, photoEntry), p2Var2 instanceof org.telegram.ui.xn ? (org.telegram.ui.xn) p2Var2 : null);
                        if (liVar3.D) {
                            PhotoViewer.t1().X0(null, null, true, liVar3.G);
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
        mh mhVar4 = new mh(this, context, 3);
        this.E0 = mhVar4;
        mhVar4.setFocusable(true);
        mhVar4.setFocusableInTouchMode(true);
        mhVar4.setVisibility(4);
        mhVar4.setScaleX(0.2f);
        mhVar4.setScaleY(0.2f);
        mhVar4.setAlpha(0.0f);
        mhVar4.setClipChildren(false);
        mhVar4.setClipToPadding(false);
        this.containerView.addView(mhVar4, k7.b6.e(110, 50, 85));
        vh vhVar = new vh(R.drawable.send_plane_24, context, f6Var, this);
        this.F0 = vhVar;
        vhVar.setImportantForAccessibility(2);
        mhVar4.addView(vhVar, k7.b6.e(-1, -1, 119));
        vhVar.setTranslationX(this.backgroundPaddingLeft);
        int dp4 = AndroidUtilities.dp(52.0f);
        int dp5 = AndroidUtilities.dp(38.0f);
        vhVar.F = dp4;
        vhVar.G = dp5;
        float dp6 = AndroidUtilities.dp(7.0f);
        float dp7 = AndroidUtilities.dp(6.0f);
        vhVar.J = dp6;
        vhVar.K = dp7;
        vhVar.e0 = true;
        final int i29 = 3;
        vhVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ li b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rh.o3 o3Var;
                switch (i29) {
                    case 0:
                        li liVar = this.b;
                        long j10 = liVar.T0;
                        if (j10 < 0 && (o3Var = (rh.o3) liVar.u0.get(-j10)) != null) {
                            org.telegram.ui.web.a1 webViewContainer = o3Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.M = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        li liVar2 = this.b;
                        boolean z12 = liVar2.Z;
                        if (!z12) {
                            liVar2.H1(!z12, true);
                            break;
                        }
                        break;
                    case 2:
                        li liVar3 = this.b;
                        boolean z13 = liVar3.Z;
                        if (z13) {
                            liVar3.H1(!z13, true);
                            break;
                        }
                        break;
                    case 3:
                        this.b.z1();
                        break;
                    case 4:
                        this.b.X0.M(null, null);
                        break;
                    case 5:
                        li.s(this.b);
                        break;
                    case 6:
                        di diVar = this.b.v0;
                        if (diVar != null) {
                            diVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.h1.M(null, null);
                        break;
                    default:
                        li liVar4 = this.b;
                        liVar4.Z1(liVar4.v0 != liVar4.n0);
                        break;
                }
            }
        });
        vhVar.setOnLongClickListener(new org.telegram.ui.ag(this, context, f6Var, p2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        oh ohVar2 = new oh(this, context, 1);
        ohVar2.setAlpha(0.0f);
        ohVar2.setScaleX(0.2f);
        ohVar2.setScaleY(0.2f);
        if (z4) {
            c1();
            this.navBarColorKey = -1;
        }
        bl0 fastScroll = chatAttachAlertPhotoLayout.B.getFastScroll();
        ng.a aVar6 = this.D2;
        qg.d m9 = rg.b.m(f6Var);
        sl0 sl0Var = fastScroll.l0;
        pg.b c13 = aVar6.c(sl0Var.c1, m9, false);
        fastScroll.b0 = c13;
        c13.o(AndroidUtilities.dp(4.0f));
        fastScroll.b0.p(AndroidUtilities.dp(24.0f));
        pg.b c14 = aVar6.c(sl0Var.c1, m9, false);
        fastScroll.c0 = c14;
        c14.o(AndroidUtilities.dp(6.0f));
        fastScroll.c0.t(AndroidUtilities.dp(4.0f));
        fastScroll.c0.p(AndroidUtilities.dp(f10));
        vd0 vd0Var = new vd0(context);
        this.P = vd0Var;
        this.containerView.addView(vd0Var, k7.b6.c(-1.0f, -1));
        qg.d dVar4 = new qg.d(f6Var);
        dVar4.e = new tg(this, 4);
        dVar4.c = new tg(this, 5);
        dVar4.d = new tg(this, 6);
        dVar4.b = new tg(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar4.n = dpf2;
        dVar4.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        dVar4.f = dpf23;
        dVar4.h = dpf24;
        l1Var.M(this.D2, dVar4, false);
        jVar.i(1L, false);
    }

    public static void M(li liVar) {
        int i10;
        eg.l1 l1Var = liVar.U0;
        wg.f fVar = liVar.s1;
        if (fVar == null || l1Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var = liVar.resourcesProvider;
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        if (l1Var.getVisibility() == 0) {
            i10 = (int) (l1Var.getAlpha() * (a2 ? 255 : 160));
        } else {
            i10 = 0;
        }
        fVar.setFadeTopAlpha(i10);
    }

    public static void Q(li liVar) {
        zh zhVar = new zh(liVar, liVar.getContext(), liVar.W, LaunchActivity.R(), liVar.resourcesProvider, 0);
        liVar.y2 = zhVar;
        zhVar.p(new org.telegram.ui.Cells.f1(liVar, 3));
        ViewGroup viewGroup = liVar.containerView;
        viewGroup.addView(liVar.y2, viewGroup.indexOfChild(liVar.A0), k7.b6.e(-1, -1, 83));
        zh zhVar2 = liVar.y2;
        zhVar2.getAdapter().c = false;
        zhVar2.getAdapter().d = false;
        zhVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            zhVar2.getAdapter().j0 = false;
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
            tf.u0 adapter = zhVar2.getAdapter();
            xnVar.i();
            TLRPC.Chat chat = xnVar.e;
            adapter.getClass();
            adapter.i0 = chat;
            zhVar2.getAdapter().W(xnVar.W7);
            zhVar2.getAdapter().b0 = xnVar.e != null;
        } else {
            zhVar2.getAdapter().j0 = true;
            zhVar2.getAdapter().W(null);
            zhVar2.getAdapter().b0 = false;
        }
        zhVar2.getAdapter().c0 = false;
        liVar.U1();
    }

    public static /* synthetic */ void m(li liVar, ValueAnimator valueAnimator) {
        liVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.e3 e3Var = liVar.container;
        if (e3Var != null) {
            e3Var.invalidate();
        }
    }

    public static /* synthetic */ void n(li liVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.a3 a3Var) {
        liVar.currentSheetAnimation = null;
        liVar.m2 = null;
        animationNotificationsLocker.unlock();
        liVar.currentSheetAnimationType = 0;
        if (a3Var != null) {
            a3Var.onOpenAnimationEnd();
        }
        if (liVar.useHardwareLayer) {
            liVar.container.setLayerType(0, null);
        }
        if (liVar.isFullscreen) {
            WindowManager.LayoutParams attributes = liVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            liVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static /* synthetic */ void o(li liVar, int i10) {
        liVar.navBarColorKey = -1;
        liVar.navBarColor = i10;
        liVar.containerView.invalidate();
    }

    public static void p(li liVar) {
        o1.j jVar = liVar.m2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(liVar.containerView, o1.h.n, 0.0f);
        liVar.m2 = jVar2;
        jVar2.u.a(1.5f);
        liVar.m2.u.b(1500.0f);
        liVar.m2.f();
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
    public static boolean q(li liVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.p2 p2Var, View view) {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        org.telegram.ui.xn xnVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        boolean z4;
        boolean z10;
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
        org.telegram.ui.xn xnVar2;
        long j13;
        TLRPC.ChatFull chatFull;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        li liVar2 = liVar;
        vh vhVar = liVar2.F0;
        org.telegram.ui.ActionBar.p2 p2Var2 = liVar2.c0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = liVar2.g0;
        int i13 = liVar2.G1;
        long j14 = liVar2.W;
        if ((j14 == 0 && !(p2Var2 instanceof org.telegram.ui.xn)) || liVar2.H - liVar2.I < 0 || liVar2.h.f) {
            return false;
        }
        if (p2Var2 instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn xnVar3 = (org.telegram.ui.xn) p2Var2;
            TLRPC.User i14 = xnVar3.i();
            MessageObject messageObject5 = xnVar3.k5;
            MessageObject messageObject6 = xnVar3.h5;
            if (xnVar3.c() || xnVar3.O3 == 5) {
                return false;
            }
            messageObject2 = messageObject6;
            messageObject = messageObject5;
            xnVar = xnVar3;
            user = i14;
            j14 = xnVar3.a();
        } else {
            user = MessagesController.getInstance(i13).getUser(Long.valueOf(j14));
            messageObject = null;
            messageObject2 = null;
            xnVar = null;
        }
        cf cfVar = liVar2.e0;
        if (cfVar != null) {
            cfVar.dismiss();
        }
        cf cfVar2 = new cf(liVar2, context, f6Var, 1);
        liVar2.e0 = cfVar2;
        cfVar2.r(vhVar, false, new dg.p(liVar2, p2Var, f6Var, 19));
        ArrayList arrayList2 = new ArrayList();
        di diVar = liVar2.v0;
        if (diVar == chatAttachAlertPhotoLayout3 || diVar == liVar2.n0) {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.isEmpty()) {
                z4 = false;
                z10 = false;
                messageObject3 = null;
            } else {
                String str2 = "";
                int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                MessageObject messageObject7 = null;
                int i15 = 0;
                int i16 = 0;
                z4 = false;
                z10 = false;
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
                            boolean z14 = photoEntry.isVideo;
                            if (z14 || (str = photoEntry.imagePath) == null) {
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
                            if (z14) {
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
                                                    try {
                                                        mediaMetadataRetriever3.setDataSource(open.getFileDescriptor(), photoEntry.livePhotoVideoOffset, file.length() - photoEntry.livePhotoVideoOffset);
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                    } catch (Exception e6) {
                                                        e = e6;
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
                                CharSequence[] charSequenceArr = {liVar2.m1().getText()};
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
                            z4 = true;
                            z10 = true;
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
        } else if (diVar == liVar2.h0) {
            if (TextUtils.isEmpty(liVar2.m1().getText())) {
                chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                i12 = 0;
                z13 = false;
            } else {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                tL_message2.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                tL_message2.peer_id = MessagesController.getInstance(i13).getPeer(j14);
                CharSequence[] charSequenceArr2 = {liVar2.m1().getText()};
                MessageObject.addLinks(true, charSequenceArr2[0]);
                tL_message2.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr2, true);
                tL_message2.message = charSequenceArr2[0].toString();
                MessageObject messageObject11 = new MessageObject(i13, tL_message2, true, false);
                messageObject11.sendPreview = true;
                messageObject11.notime = true;
                messageObject11.isOutOwnerCached = Boolean.TRUE;
                arrayList2.add(messageObject11);
                i12 = 1;
                z13 = true;
            }
            ArrayList<TLRPC.User> selected = liVar2.h0.getSelected();
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
                z13 = true;
            }
            messageObject4 = null;
            z4 = false;
            liVar2 = liVar;
            j10 = j14;
            z10 = z13;
        } else {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
            if (diVar == liVar2.m0) {
                messageObject4 = null;
                boolean z15 = false;
                int i30 = 0;
                for (int i31 = 0; i31 < liVar2.m0.P.size(); i31++) {
                    String str5 = (String) liVar2.m0.P.get(i31);
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
                                z11 = true;
                                z12 = false;
                                CharSequence[] charSequenceArr3 = {liVar2.m1().getText()};
                                tL_message4.entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr3, true);
                                tL_message4.message = charSequenceArr3[0].toString();
                            } else {
                                z11 = true;
                                z12 = false;
                            }
                            MessageObject messageObject13 = new MessageObject(i13, tL_message4, z11, z12);
                            messageObject13.attachPathExists = z11;
                            messageObject13.sendPreview = z11;
                            messageObject13.notime = z11;
                            messageObject13.isOutOwnerCached = Boolean.TRUE;
                            arrayList2.add(messageObject13);
                            if (i31 == 0 && messageObject4 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                messageObject4 = messageObject13;
                            }
                            i30 = i32;
                            z15 = true;
                        }
                    }
                }
                j10 = j14;
                z10 = z15;
                z4 = false;
            } else {
                wi wiVar = liVar2.i0;
                if (diVar == wiVar) {
                    arrayList2.addAll(wiVar.getSelected());
                    if (!arrayList2.isEmpty()) {
                        messageObject4 = (MessageObject) arrayList2.get(0);
                        CharSequence[] charSequenceArr4 = {liVar2.m1().getText()};
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
                            z4 = false;
                            z10 = true;
                        }
                    }
                    messageObject4 = null;
                    if (arrayList2.size() > 1) {
                    }
                    j10 = j14;
                    z4 = false;
                    z10 = true;
                } else {
                    j10 = j14;
                    messageObject4 = null;
                    z4 = false;
                    z10 = false;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        o70 F = o70.F(liVar2.containerView, f6Var, vhVar);
        if (messageObject4 != null) {
            di diVar2 = liVar2.v0;
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (diVar2 == chatAttachAlertPhotoLayout2 || diVar2 == liVar2.n0) {
                vb0 vb0Var = new vb0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), f6Var);
                TLRPC.Message message = messageObject4.messageOwner;
                boolean z16 = liVar2.Z;
                message.invert_media = z16;
                vb0Var.a(!z16, false);
                vb0Var.setOnClickListener(new dg.p(liVar2, messageObject4, vb0Var, 20));
                F.q(vb0Var);
                if (liVar2.E1 == null) {
                    F.k();
                }
            }
        } else {
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        }
        boolean isUserSelf = UserObject.isUserSelf(user);
        if (liVar2.E1 != null || ((xnVar != null && ChatObject.isMonoForum(xnVar.e)) || ((xnVar == null || !xnVar.D6()) && !liVar2.v0.c()))) {
            j12 = j10;
        } else {
            j12 = j10;
            F.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new i5.v(liVar2, j12, f6Var, 20), false);
        }
        di diVar3 = liVar2.v0;
        if ((diVar3 == chatAttachAlertPhotoLayout2 || diVar3 == liVar2.n0) && diVar3.getSelectedItemsCount() == 1 && xnVar != null && ChatObject.isMonoForum(xnVar.e)) {
            xnVar2 = xnVar;
            j13 = j12;
            F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new org.telegram.messenger.ci(liVar2, j12, xnVar2, f6Var, 3), false);
        } else {
            j13 = j12;
            xnVar2 = xnVar;
        }
        if (liVar2.E1 == null && !isUserSelf) {
            F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new wg(liVar2, 1), false);
        }
        if (liVar2.E1 == null && z4 && xnVar2 != null && ChatObject.isChannelAndNotMegaGroup(xnVar2.e) && (chatFull = xnVar2.W7) != null && chatFull.paid_media_allowed) {
            F.c(R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton), null, false);
            org.telegram.ui.ActionBar.g1 y10 = F.y();
            y10.setOnClickListener(new kh.u3(liVar2, context, y10, f6Var, 10));
            long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
            if (starsPrice > 0) {
                y10.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                y10.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                y10.setText(LocaleController.getString(R.string.PaidMediaButton));
                y10.setSubtext(null);
            }
            liVar2.e0.s(starsPrice);
        }
        F.Y();
        liVar2.e0.p(F);
        liVar2.e0.q(arrayList2);
        if (liVar2.E1 == null && j13 >= 0 && z10) {
            liVar2.e0.d(p2Var);
            liVar2.e0.o(liVar2.K0);
        }
        liVar2.e0.show();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static /* synthetic */ void r(li liVar, lh.p6 p6Var) {
        AnimatorSet animatorSet = liVar.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        p6Var.run();
    }

    public static void s(li liVar) {
        if (liVar.g0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z4 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.g0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.p1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(S);
                        for (int i10 = 0; i10 < chatAttachAlertPhotoLayout.B.getChildCount(); i10++) {
                            View childAt = chatAttachAlertPhotoLayout.B.getChildAt(i10);
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
            SharedConfig.photoLiveDefault = z4;
            edit.putBoolean("photoLiveDefault", z4).apply();
            chatAttachAlertPhotoLayout.v0();
        }
        liVar.Y1(true);
        org.telegram.ui.ActionBar.w0 w0Var = liVar.Z0;
        ph.f3 f3Var = liVar.a1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        ph.f3 f3Var2 = new ph.f3(liVar.getContext(), 1);
        liVar.a1 = f3Var2;
        f3Var2.t(AndroidUtilities.replaceTags(LocaleController.getString(!S ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        liVar.a1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        liVar.a1.n(1.0f, -((liVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        liVar.a1.setTranslationY(liVar.X0.getTranslationY());
        ph.f3 f3Var3 = liVar.a1;
        f3Var3.i0 = new org.telegram.ui.hp(18, liVar, f3Var2);
        liVar.containerView.addView(f3Var3, k7.b6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        liVar.a1.v();
    }

    public static /* synthetic */ void t(li liVar, boolean z4, wg wgVar) {
        liVar.v0.s(1.0f);
        liVar.w0.s(1.0f);
        liVar.v0.k(liVar.i2);
        liVar.w0.k(liVar.i2);
        liVar.containerView.invalidate();
        liVar.U0.setTag(z4 ? 1 : null);
        wgVar.run();
    }

    public static void v(li liVar, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        li liVar2 = liVar;
        nh nhVar = liVar2.v1;
        di[] diVarArr = liVar2.t0;
        org.telegram.ui.ActionBar.p2 p2Var = liVar2.c0;
        org.telegram.ui.ActionBar.p2 R = p2Var == null ? LaunchActivity.R() : p2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (view instanceof fi) {
            Activity parentActivity = R.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!liVar2.I1 && !liVar2.J1 && liVar2.a1()) {
                    return;
                }
                if (!liVar2.I1 && !liVar2.J1) {
                    rn rnVar = new rn(1, liVar2.getContext(), f6Var, liVar2);
                    liVar2.Q = rnVar;
                    liVar2.Q1(rnVar);
                }
                liVar2.Q1(liVar2.g0);
            } else if (intValue == 3) {
                if (!liVar2.K1 && liVar2.a1()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(liVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                liVar2.B1(true);
            } else if (intValue == 4) {
                if (!liVar2.H1 && liVar2.a1()) {
                    return;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(liVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                liVar2.E1(true);
            } else if (intValue == 5) {
                if (!liVar2.N1 && liVar2.a1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && liVar2.N1 && liVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(liVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                liVar2.D1();
            } else if (intValue == 6) {
                if ((!liVar2.N1 && liVar2.a1()) || !AndroidUtilities.isMapsInstalled(p2Var)) {
                    return;
                }
                if (liVar2.N1) {
                    if (liVar2.l0 == null) {
                        al alVar = new al(liVar2, liVar2.getContext(), f6Var, (liVar2.E || liVar2.O1) ? false : true);
                        liVar2.l0 = alVar;
                        diVarArr[5] = alVar;
                        uk ukVar = liVar2.q2;
                        if (ukVar != null) {
                            alVar.setDelegate(ukVar);
                        } else {
                            alVar.setDelegate(new tg(liVar2, 9));
                        }
                    }
                    liVar2.Q1(liVar2.l0);
                } else {
                    rn rnVar2 = new rn(6, liVar2.getContext(), f6Var, liVar2);
                    liVar2.Q = rnVar2;
                    liVar2.Q1(rnVar2);
                }
            } else if (intValue == 9) {
                if (!liVar2.L1 && liVar2.a1()) {
                    return;
                }
                if (liVar2.L1) {
                    liVar2.S1(true, null);
                } else {
                    rn rnVar3 = new rn(9, liVar2.getContext(), f6Var, liVar2);
                    liVar2.Q = rnVar3;
                    liVar2.Q1(rnVar3);
                }
            } else if (intValue == 11) {
                if (liVar2.p0 == null) {
                    uf.c0 c0Var = new uf.c0(liVar2.getContext(), liVar2.resourcesProvider, liVar2);
                    liVar2.p0 = c0Var;
                    diVarArr[7] = c0Var;
                    c0Var.setupBlurredSearchField(liVar2.D2);
                }
                liVar2.Q1(liVar2.p0);
            } else if (intValue == 12) {
                if (!liVar2.M1 && liVar2.a1()) {
                    return;
                }
                if (liVar2.M1) {
                    if (liVar2.k0 == null) {
                        qn qnVar = new qn(liVar, liVar.getContext(), true, f6Var, null);
                        liVar2 = liVar;
                        liVar2.k0 = qnVar;
                        diVarArr[1] = qnVar;
                        qnVar.setDelegate(new tg(liVar2, 10));
                    }
                    liVar2.Q1(liVar2.k0);
                } else {
                    rn rnVar4 = new rn(9, liVar2.getContext(), f6Var, liVar2);
                    liVar2.Q = rnVar4;
                    liVar2.Q1(rnVar4);
                }
            } else if (intValue == 13) {
                if (liVar2.r0 == null) {
                    ik ikVar = new ik(liVar2, liVar2.getContext(), f6Var, true);
                    liVar2.r0 = ikVar;
                    diVarArr[8] = ikVar;
                    ikVar.setDelegate(liVar2.X1);
                }
                liVar2.Q1(liVar2.r0);
            } else if (intValue == 14) {
                if (liVar2.q0 == null) {
                    ik ikVar2 = new ik(liVar2, liVar2.getContext(), f6Var, false);
                    liVar2.q0 = ikVar2;
                    diVarArr[9] = ikVar2;
                    ikVar2.setDelegate(liVar2.X1);
                }
                liVar2.Q1(liVar2.q0);
            } else if (intValue == 16) {
                if (liVar2.s0 == null) {
                    vh.p pVar = new vh.p(liVar2.G1, liVar2.getContext(), f6Var, liVar2);
                    liVar2.s0 = pVar;
                    diVarArr[10] = pVar;
                }
                liVar2.Q1(liVar2.s0);
            } else if (view.getTag() instanceof Integer) {
                liVar2.W1.H(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, liVar2.s1(), false, 0L);
            }
        } else if (view instanceof ei) {
            ei eiVar = (ei) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = eiVar.c;
            if (tL_attachMenuBot == null) {
                liVar2.W1.G(eiVar.b);
                liVar2.dismiss();
            } else if (tL_attachMenuBot.inactive) {
                si1.a(liVar2.getContext(), new nh.z1(5, liVar2, eiVar), null);
            } else {
                liVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int dp = AndroidUtilities.dp(70.0f);
        int i12 = left - dp;
        if (i12 < 0) {
            nhVar.v0(i12, 0, null);
            return;
        }
        int i13 = right + dp;
        if (i13 > nhVar.getMeasuredWidth()) {
            nhVar.v0(i13 - nhVar.getMeasuredWidth(), 0, null);
        }
    }

    public static /* synthetic */ void w(li liVar) {
        di diVar;
        om omVar;
        liVar.q1 = null;
        di diVar2 = liVar.v0;
        if (diVar2 != liVar.g0 && (diVar = liVar.w0) != (omVar = liVar.n0) && diVar2 != diVar && diVar2 != omVar) {
            liVar.containerView.removeView(diVar2);
        }
        liVar.v0.setVisibility(8);
        liVar.v0.q();
        liVar.w0.E();
        liVar.v0 = liVar.w0;
        liVar.w0 = null;
        int[] iArr = liVar.Y1;
        iArr[0] = iArr[1];
        liVar.H1(liVar.Z, false);
        liVar.W1();
    }

    public final void A1(int i10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (i10 != 3) {
            if (i10 == 6 && AndroidUtilities.isMapsInstalled(p2Var)) {
                if (this.l0 == null) {
                    al alVar = new al(this, getContext(), this.resourcesProvider, (this.E || this.O1) ? false : true);
                    this.l0 = alVar;
                    this.t0[5] = alVar;
                    uk ukVar = this.q2;
                    if (ukVar != null) {
                        alVar.setDelegate(ukVar);
                    } else if (p2Var instanceof org.telegram.ui.xn) {
                        alVar.setDelegate(new tg(this, 16));
                    }
                }
                Q1(this.l0);
                return;
            }
            return;
        }
        if (this.K1 || !a1()) {
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

    public final void B1(boolean z4) {
        if (!this.K1 && z4) {
            rn rnVar = new rn(3, getContext(), this.resourcesProvider, this);
            this.Q = rnVar;
            Q1(rnVar);
        }
        int i10 = 1;
        if (this.i0 == null) {
            wi wiVar = new wi(getContext(), this.resourcesProvider, this);
            this.i0 = wiVar;
            this.t0[3] = wiVar;
            wiVar.setupBlurredSearchField(this.D2);
            this.i0.setDelegate(new tg(this, 13));
            if (this.E) {
                this.i0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            TLRPC.Chat chat = ((org.telegram.ui.xn) p2Var).e;
            wi wiVar2 = this.i0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.E1 == null) {
                i10 = -1;
            }
            wiVar2.setMaxSelectedFiles(i10);
        }
        if (z4) {
            Q1(this.i0);
        }
    }

    public final void C1() {
        if (this.o0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
            zi ziVar = new zi(context, f6Var, this);
            ziVar.r = AndroidUtilities.dp(80.0f);
            ziVar.w = 3;
            lh.e1 e1Var = new lh.e1(ziVar, context, f6Var, 9);
            ziVar.n = e1Var;
            ra raVar = new ra(ziVar, context);
            ziVar.v = raVar;
            e1Var.setAdapter(raVar);
            e1Var.setClipToPadding(false);
            e1Var.setItemAnimator(null);
            e1Var.setLayoutAnimation(null);
            e1Var.setVerticalScrollBarEnabled(false);
            e1Var.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, ziVar.a));
            ziVar.addView(e1Var, k7.b6.c(-1.0f, -1));
            e1Var.setOnScrollListener(new eg.f2(ziVar, 18));
            oh.k kVar = new oh.k(ziVar, ziVar.r, 1);
            ziVar.s = kVar;
            kVar.O = new kh.n5(ziVar, 2);
            e1Var.setLayoutManager(kVar);
            this.o0 = ziVar;
            ziVar.setDelegate(new xa(this, 1));
        }
        Q1(this.o0);
    }

    public final void D1() {
        if (!this.N1) {
            rn rnVar = new rn(5, getContext(), this.resourcesProvider, this);
            this.Q = rnVar;
            Q1(rnVar);
        }
        if (this.h0 == null) {
            qj qjVar = new qj(getContext(), this.resourcesProvider, this);
            this.h0 = qjVar;
            this.t0[2] = qjVar;
            qjVar.setupBlurredSearchField(this.D2);
            this.h0.setDelegate(new wh(this));
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            TLRPC.Chat chat = ((org.telegram.ui.xn) p2Var).e;
            this.h0.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        Q1(this.h0);
    }

    public final void E1(boolean z4) {
        if (!this.H1 && z4) {
            rn rnVar = new rn(4, getContext(), this.resourcesProvider, this);
            this.Q = rnVar;
            Q1(rnVar);
        }
        boolean z10 = false;
        if (this.m0 == null) {
            hk hkVar = new hk(this.K ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.m0 = hkVar;
            this.t0[4] = hkVar;
            hkVar.setDelegate(new xh(this));
        }
        int i10 = 1;
        if (this.E) {
            this.m0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = this.c0;
            if (p2Var instanceof org.telegram.ui.xn) {
                TLRPC.Chat chat = ((org.telegram.ui.xn) p2Var).e;
                hk hkVar2 = this.m0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.E1 == null) {
                    i10 = -1;
                }
                hkVar2.setMaxSelectedFiles(i10);
            } else {
                this.m0.setMaxSelectedFiles(this.P1);
                hk hkVar3 = this.m0;
                if (!this.K && !this.T) {
                    z10 = true;
                }
                hkVar3.setCanSelectOnlyImageFiles(z10);
            }
        }
        hk hkVar4 = this.m0;
        hkVar4.a0 = this.K;
        if (z4) {
            Q1(hkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        eg.l1 l1Var = this.U0;
        int i10 = 1;
        if (l1Var.k0) {
            l1Var.h(true);
        }
        this.h0 = null;
        this.p0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        while (true) {
            di[] diVarArr = this.t0;
            if (i10 >= diVarArr.length) {
                T1(false, false);
                super.dismissInternal();
                return;
            }
            di diVar = diVarArr[i10];
            if (diVar != null) {
                diVar.m();
                this.containerView.removeView(diVarArr[i10]);
                diVarArr[i10] = null;
            }
            i10++;
        }
    }

    public final boolean G1(final int i10, final boolean z4, final int i11, final boolean z10, final long j10) {
        if (this.F1) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
            TLRPC.Chat chat = xnVar.e;
            if (xnVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(this.G1).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + xnVar.a(), !z4).commit();
            }
        }
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f) {
            this.F1 = true;
            this.W1.H(7, true, z4, i10, i11, j10, z10, false, 0L);
            return true;
        }
        long n12 = n1();
        di diVar = this.v0;
        return z4.b0(this.G1, n12, j1() + (diVar != null ? diVar.getSelectedItemsCount() : 1), new Utilities.Callback() { // from class: org.telegram.ui.Components.gh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                li liVar = li.this;
                liVar.F1 = true;
                liVar.W1.H(7, true, z4, i10, i11, j10, z10, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void H1(boolean z4, boolean z10) {
        this.b.a(z4, z10);
        du m12 = m1();
        this.Z = z4;
        du m13 = m1();
        final boolean z11 = this.A0.getTag() != null;
        di diVar = this.v0;
        final boolean z12 = this.Z && (diVar == this.g0 || diVar == this.n0);
        ah.d dVar = this.L0;
        ph phVar = this.z0;
        if (z10) {
            dVar.setVisibility(z11 ? 0 : 8);
            ViewPropertyAnimator duration = dVar.animate().alpha((z12 && z11) ? 1.0f : 0.0f).setDuration(320L);
            nr nrVar = nr.h;
            final int i10 = 0;
            duration.setInterpolator(nrVar).setUpdateListener(new ug(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.vg
                public final /* synthetic */ li b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            li liVar = this.b;
                            if (!z12 || !z11) {
                                liVar.L0.setVisibility(8);
                            }
                            liVar.b2();
                            break;
                        default:
                            if (z12 || !z11) {
                                this.b.z0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            phVar.setVisibility(0);
            ViewPropertyAnimator interpolator = phVar.animate().translationY((z12 || !z11) ? phVar.getMeasuredHeight() : 0.0f).alpha((z12 || !z11) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(nrVar);
            final int i11 = 1;
            interpolator.setUpdateListener(new ug(this, i11)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.vg
                public final /* synthetic */ li b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            li liVar = this.b;
                            if (!z12 || !z11) {
                                liVar.L0.setVisibility(8);
                            }
                            liVar.b2();
                            break;
                        default:
                            if (z12 || !z11) {
                                this.b.z0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
        } else {
            dVar.setVisibility((z12 && z11) ? 0 : 8);
            dVar.setAlpha((z12 && z11) ? 1.0f : 0.0f);
            b2();
            phVar.setAlpha((z12 || !z11) ? 0.0f : 1.0f);
            phVar.setTranslationY((z12 || !z11) ? phVar.getMeasuredHeight() : 0.0f);
            phVar.setVisibility((z12 || !z11) ? 8 : 0);
        }
        if (m12 != m13) {
            m12.k(true);
            m13.setText(u5.cloneSpans(m12.getText()));
            m13.getEditText().setAllowTextEntitiesIntersection(m12.getEditText().getAllowTextEntitiesIntersection());
            if (m12.getEditText().isFocused()) {
                m13.getEditText().requestFocus();
                m13.getEditText().setSelection(m12.getEditText().getSelectionStart(), m12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new wg(this, 0));
    }

    public final void I1(MessageObject messageObject, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.g0) != null) {
            chatAttachAlertPhotoLayout.Z();
        }
        if (this.E1 == messageObject && this.D1 == i10) {
            return;
        }
        this.E1 = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            i10 = this.E1.isMusic() ? 2 : this.E1.isDocument() ? 1 : 0;
        }
        this.D1 = i10;
        if (this.E1 != null) {
            this.P1 = 1;
            this.Q1 = false;
        } else {
            this.P1 = -1;
            this.Q1 = true;
        }
        this.x1.l();
        V1(0);
    }

    public final void J1(int i10, boolean z4) {
        if (this.E1 != null) {
            return;
        }
        this.P1 = i10;
        this.Q1 = z4;
    }

    public final void K1(float f10) {
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.a7), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
        this.navBarColor = k10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        getContainer().invalidate();
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        di diVar;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        if (i10 == 2) {
            e1();
            qn qnVar = this.j0;
            if (qnVar != null && ((diVar = this.w0) == qnVar || this.v0 == qnVar)) {
                a2(diVar == qnVar ? 1 : 0);
            }
            qn qnVar2 = this.k0;
            if (qnVar2 != null) {
                di diVar2 = this.w0;
                if (diVar2 == qnVar2 || this.v0 == qnVar2) {
                    a2(diVar2 != qnVar2 ? 0 : 1);
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
            vh vhVar = this.F0;
            if (vhVar != null) {
                vhVar.setEphemeralFactor(f10);
                vhVar.setSameWidthFactor(f10);
            }
        }
    }

    public final void L1(String str) {
        this.N0 = 1;
        this.C = true;
        this.P0 = false;
        this.J1 = false;
        this.u1.setVisibility(8);
        this.g1.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.g0;
        if (chatAttachAlertPhotoLayout != null) {
            li liVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.d1 = (liVar.N0 == 0 || liVar.C) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M1(boolean z4) {
        boolean z10;
        if (z4) {
            org.telegram.ui.ActionBar.p2 p2Var = this.c0;
            if ((p2Var instanceof org.telegram.ui.xn) && !((org.telegram.ui.xn) p2Var).v()) {
                z10 = true;
                if (this.v2 != z10) {
                    return;
                }
                if (z10) {
                    MessagesController.getInstance(this.G1).getTonesController().load();
                }
                this.v2 = z10;
                ImageView imageView = this.w;
                imageView.setVisibility(0);
                ImageView imageView2 = this.y;
                imageView2.setVisibility(0);
                ViewPropertyAnimator scaleY = imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f);
                nr nrVar = nr.h;
                scaleY.setInterpolator(nrVar).setDuration(420L).withEndAction(new fh(this, z10, 1)).start();
                imageView2.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(nrVar).setDuration(420L).withEndAction(new fh(this, z10, 2)).start();
                if (z10) {
                    j0 j0Var = this.x;
                    Objects.requireNonNull(j0Var);
                    imageView.postDelayed(new i0(j0Var, 1), 220L);
                    j0 j0Var2 = this.B;
                    Objects.requireNonNull(j0Var2);
                    imageView2.postDelayed(new i0(j0Var2, 1), 220L);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.v2 != z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1(long j10, String str, boolean z4, boolean z10) {
        long j11;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.u0;
        int i10 = 1;
        if (longSparseArray.get(j10) != null && Objects.equals(str, ((rh.o3) longSparseArray.get(j10)).getStartCommand())) {
            rh.o3 o3Var = (rh.o3) longSparseArray.get(j10);
            if (o3Var.E) {
                o3Var.E = false;
            }
            if (longSparseArray.get(j10) != null) {
                ((rh.o3) longSparseArray.get(j10)).G.setSwipeOffsetAnimationDisallowed(true);
                R1((di) longSparseArray.get(j10), -j10, z10);
                if (z4) {
                    rh.o3 o3Var2 = (rh.o3) longSparseArray.get(j10);
                    TLRPC.User user = MessagesController.getInstance(o3Var2.C).getUser(Long.valueOf(o3Var2.v));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(o3Var2.C).getAttachMenuBots().bots;
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
                        if (tL_attachMenuBot.bot_id == o3Var2.v) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z11 = tL_attachMenuBot.show_in_side_menu;
                    AndroidUtilities.runOnUIThread(new ph.f6(17, o3Var2, (z11 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name) : z11 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
            rh.o3 o3Var3 = new rh.o3(context, f6Var, this);
            o3Var3.R = new rh.g3(o3Var3, 2);
            org.telegram.ui.ActionBar.w0 a2 = o3Var3.b.U0.n().a(0, R.drawable.ic_ab_other);
            o3Var3.H = a2;
            a2.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
            org.telegram.ui.ActionBar.g1 e = a2.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
            o3Var3.I = e;
            e.setVisibility(8);
            a2.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
            org.telegram.ui.ActionBar.g1 e6 = a2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            o3Var3.J = e6;
            e6.setVisibility(8);
            a2.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
            a2.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
            a2.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
            rh.j3 j3Var = new rh.j3(o3Var3, context, f6Var, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, o3Var3.a));
            o3Var3.n = j3Var;
            rh.h2 h2Var = new rh.h2(o3Var3, context, i10);
            o3Var3.G = h2Var;
            h2Var.addView(j3Var, k7.b6.c(-1.0f, -1));
            h2Var.setScrollListener(new rh.g3(o3Var3, 3));
            h2Var.setScrollEndListener(new rh.g3(o3Var3, 4));
            h2Var.setDelegate(new rh.i3(o3Var3));
            h2Var.setIsKeyboardVisible(new rh.i3(o3Var3));
            o3Var3.addView(h2Var, k7.b6.c(-1.0f, -1));
            rh.k3 k3Var = new rh.k3(context, f6Var);
            o3Var3.F = k3Var;
            o3Var3.addView(k3Var, k7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            j3Var.setWebViewProgressListener(new cg.o(o3Var3, 5));
            NotificationCenter.getGlobalInstance().addObserver(o3Var3, NotificationCenter.didSetNewTheme);
            longSparseArray.put(j10, o3Var3);
            ((rh.o3) longSparseArray.get(j10)).setDelegate(new rh(this, o3Var3, str, j10));
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
            MessageObject replyingMessageObject = xnVar.V.getReplyingMessageObject();
            rh.o3 o3Var4 = (rh.o3) longSparseArray.get(j10);
            long a10 = xnVar.a();
            int i12 = replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0;
            long N8 = xnVar.N8();
            rh.j3 j3Var2 = o3Var4.n;
            int i13 = this.G1;
            o3Var4.C = i13;
            o3Var4.w = a10;
            o3Var4.v = j10;
            o3Var4.y = i12;
            o3Var4.B = N8;
            o3Var4.D = str;
            org.telegram.ui.ActionBar.g1 g1Var = o3Var4.J;
            if (g1Var != null) {
                if (MediaDataController.getInstance(i13).canCreateAttachedMenuBotShortcut(j10)) {
                    g1Var.setVisibility(0);
                } else {
                    g1Var.setVisibility(8);
                }
            }
            j3Var2.setBotUser(MessagesController.getInstance(i13).getUser(Long.valueOf(j10)));
            j3Var2.q(i13, j10);
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
            JSONObject p10 = rh.q2.p(o3Var4.a, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_requestWebView, new lh.s1(o3Var4, i13, 9));
            NotificationCenter.getInstance(i13).addObserver(o3Var4, NotificationCenter.webViewResultSent);
            if (longSparseArray.get(j10) != null) {
            }
        }
        if (longSparseArray.get(j10) != null) {
        }
    }

    public final void O1(org.telegram.ui.ActionBar.p2 p2Var) {
        if ((p2Var instanceof org.telegram.ui.xn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.xn) p2Var).e)) {
            new qc(this.o1, this.resourcesProvider).f(MessagesController.getInstance(this.G1).captionLengthLimitPremium, new org.telegram.ui.hp(19, this, p2Var)).j();
        }
    }

    public final boolean P1(boolean z4, boolean z10) {
        int i10;
        di diVar;
        eg.l1 l1Var;
        this.c.a(z4, true);
        mh mhVar = this.A0;
        if (z4 == (mhVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.J0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        mhVar.setTag(z4 ? 1 : null);
        qh qhVar = this.B0;
        if (qhVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(qhVar.getEditText());
        }
        qhVar.k(true);
        this.M0.k(true);
        mh mhVar2 = this.u1;
        mh mhVar3 = this.E0;
        if (z4) {
            if (!this.K) {
                mhVar.setVisibility(0);
            }
            mhVar3.setVisibility(0);
        } else if (this.P0) {
            mhVar2.setVisibility(0);
        }
        di diVar2 = this.v0;
        boolean z11 = (diVar2 == this.g0 || diVar2 == this.n0) && this.Z;
        eg.l1 l1Var2 = this.U0;
        ah.d dVar = this.L0;
        ph phVar = this.z0;
        vh vhVar = this.F0;
        if (z10) {
            this.J0 = new AnimatorSet();
            if (z11) {
                dVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(mhVar, (Property<mh, Float>) property, z4 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(phVar, (Property<ph, Float>) property, (!z4 || z11) ? 0.0f : 1.0f));
            if (!z4 || z11) {
                l1Var = l1Var2;
            } else {
                phVar.setVisibility(0);
                l1Var = l1Var2;
                arrayList.add(ObjectAnimator.ofFloat(phVar, (Property<ph, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<ah.d, Float>) property, (z4 && z11) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(mhVar3, (Property<mh, Float>) property2, z4 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(mhVar3, (Property<mh, Float>) property3, z4 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(mhVar3, (Property<mh, Float>) property, z4 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(vhVar, (Property<vh, Float>) property2, z4 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(vhVar, (Property<vh, Float>) property3, z4 ? 1.0f : 0.2f));
            if (l1Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(mhVar, (Property<mh, Float>) View.TRANSLATION_Y, z4 ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.P0) {
                arrayList.add(ObjectAnimator.ofFloat(mhVar2, (Property<mh, Float>) View.TRANSLATION_Y, z4 ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(mhVar2, (Property<mh, Float>) property, z4 ? 0.0f : 1.0f));
            }
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ug(this, 4));
                arrayList.add(ofFloat);
            }
            this.J0.playTogether(arrayList);
            this.J0.setInterpolator(new DecelerateInterpolator());
            this.J0.setDuration(180L);
            this.J0.addListener(new org.telegram.ui.ActionBar.g(this, z4, z11, 3));
            this.J0.start();
            i10 = 0;
        } else {
            mhVar.setAlpha(z4 ? 1.0f : 0.0f);
            phVar.setAlpha((z4 && z11) ? 1.0f : 0.0f);
            if (!z4 || z11) {
                i10 = 0;
            } else {
                i10 = 0;
                phVar.setVisibility(0);
                phVar.setTranslationY(0.0f);
            }
            mhVar3.setScaleX(z4 ? 1.0f : 0.2f);
            mhVar3.setScaleY(z4 ? 1.0f : 0.2f);
            mhVar3.setAlpha(z4 ? 1.0f : 0.0f);
            dVar.setVisibility((z4 && z11) ? 0 : 8);
            dVar.setAlpha((z4 && z11) ? 1.0f : 0.0f);
            vhVar.setScaleX(z4 ? 1.0f : 0.2f);
            vhVar.setScaleY(z4 ? 1.0f : 0.2f);
            if (l1Var2.getTag() != null) {
                mhVar.setTranslationY(z4 ? 0.0f : AndroidUtilities.dp(48.0f));
            } else if (this.P0 && ((diVar = this.v0) == null || diVar.I())) {
                mhVar2.setTranslationY(z4 ? AndroidUtilities.dp(84.0f) : 0.0f);
            }
            if (!z4) {
                mhVar.setVisibility(4);
                mhVar3.setVisibility(4);
            }
            if (z11) {
                b2();
            }
        }
        if (z4) {
            i10 = Math.max(1, this.v0.getSelectedItemsCount());
        }
        vhVar.g(i10, z10);
        vhVar.i(j1() + this.v0.getSelectedItemsCount(), this.E1 != null ? 0L : MessagesController.getInstance(this.G1).getSendPaidMessagesStars(n1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), vhVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            qhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(di diVar) {
        long j10 = this.T0;
        rn rnVar = this.Q;
        if (diVar == rnVar) {
            j10 = rnVar.s;
        } else if (diVar == this.g0) {
            j10 = 1;
        } else if (diVar == this.i0) {
            j10 = 3;
        } else if (diVar == this.m0) {
            j10 = 4;
        } else if (diVar == this.h0) {
            j10 = 5;
        } else if (diVar == this.l0) {
            j10 = 6;
        } else if (diVar == this.j0) {
            j10 = 9;
        } else if (diVar == this.o0) {
            j10 = 10;
        } else if (diVar == this.p0) {
            j10 = 11;
        } else if (diVar == this.k0) {
            j10 = 12;
        } else if (diVar == this.q0) {
            j10 = 14;
        } else if (diVar == this.r0) {
            j10 = 13;
        } else if (diVar == this.s0) {
            j10 = 16;
        }
        R1(diVar, j10, true);
    }

    public final void R1(di diVar, long j10, boolean z4) {
        am amVar;
        am amVar2;
        nh nhVar;
        if (this.q1 == null && this.J0 == null) {
            di diVar2 = this.v0;
            if (diVar2 == diVar) {
                diVar2.F();
                return;
            }
            if (diVar == this.k0 && !UserConfig.getInstance(this.G1).isPremium()) {
                new eg.o1(this.c0, 39, false).show();
                return;
            }
            this.f.a(j10 == 1, z4);
            this.n.i(Long.valueOf(j10), z4);
            this.A1 = false;
            this.y1 = false;
            this.C1 = 0.0f;
            this.B1.setVisibility(8);
            RadialProgressView radialProgressView = this.z1;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            mh mhVar = this.u1;
            mhVar.setAlpha(1.0f);
            mhVar.setTranslationY(this.C1);
            int i10 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.u0;
                if (i10 >= longSparseArray.size()) {
                    break;
                }
                ((rh.o3) longSparseArray.valueAt(i10)).setMeasureOffsetY(0);
                i10++;
            }
            this.T0 = j10;
            nh nhVar2 = this.v1;
            int childCount = nhVar2.getChildCount();
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = nhVar2.getChildAt(i11);
                if (childAt instanceof fi) {
                    fi fiVar = (fi) childAt;
                    nhVar = nhVar2;
                    fiVar.a.e(((long) fiVar.b) == fiVar.c.T0, true);
                } else {
                    nhVar = nhVar2;
                    if (childAt instanceof ei) {
                        ((ei) childAt).a(true);
                    }
                }
                i11++;
                nhVar2 = nhVar;
            }
            int firstOffset = (this.v0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.Y1[0];
            this.w0 = diVar;
            diVar.getClass();
            boolean z10 = diVar instanceof vh.p;
            wg.f fVar = this.s1;
            if (fVar != null) {
                fVar.setFadeHeightBottom(z10 ? 0 : AndroidUtilities.dp(48.0f));
            }
            oh ohVar = this.t1;
            if (ohVar != null) {
                ohVar.setVisibility(z10 ? 4 : 0);
            }
            int i12 = this.w0.h() != 0 ? 0 : 4;
            eg.l1 l1Var = this.U0;
            l1Var.setVisibility(i12);
            if (l1Var.k0) {
                l1Var.h(true);
            }
            this.v0.r();
            di diVar3 = this.w0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.g0;
            if (diVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.w0.D(this.v0);
            this.w0.setVisibility(0);
            if (diVar.getParent() != null) {
                this.containerView.removeView(this.w0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.v0);
            ViewParent parent = this.w0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                di diVar4 = this.w0;
                if (diVar4 != this.l0) {
                    indexOfChild++;
                }
                viewGroup.addView(diVar4, indexOfChild, k7.b6.c(-1.0f, -1));
            }
            wg wgVar = new wg(this, 3);
            di diVar5 = this.v0;
            boolean z11 = diVar5 instanceof om;
            yh yhVar = this.b0;
            if (z11 || (this.w0 instanceof om)) {
                int max = Math.max(this.w0.getWidth(), this.v0.getWidth());
                di diVar6 = this.w0;
                if (diVar6 instanceof om) {
                    diVar6.setTranslationX(max);
                    di diVar7 = this.v0;
                    if ((diVar7 instanceof ChatAttachAlertPhotoLayout) && (amVar2 = ((ChatAttachAlertPhotoLayout) diVar7).M) != null) {
                        amVar2.setVisibility(4);
                    }
                } else {
                    this.v0.setTranslationX(-max);
                    di diVar8 = this.w0;
                    if (diVar8 == chatAttachAlertPhotoLayout && (amVar = ((ChatAttachAlertPhotoLayout) diVar8).M) != null) {
                        amVar.setVisibility(0);
                    }
                }
                this.w0.setAlpha(1.0f);
                this.v0.setAlpha(1.0f);
                if (z4) {
                    di diVar9 = this.v0;
                    yhVar.getClass();
                    yhVar.b(diVar9, 0.0f);
                    AndroidUtilities.runOnUIThread(new lh.p6(this, diVar, wgVar, 29));
                } else {
                    boolean z12 = this.w0.getCurrentItemTop() <= diVar.getButtonsHideOffset();
                    this.v0.s(1.0f);
                    this.w0.s(1.0f);
                    this.v0.k(this.i2);
                    this.w0.k(this.i2);
                    this.containerView.invalidate();
                    di diVar10 = this.v0;
                    yhVar.getClass();
                    yhVar.b(diVar10, 1.0f);
                    l1Var.setTag(z12 ? 1 : null);
                    wgVar.run();
                }
            } else if (z4) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.w0.setAlpha(0.0f);
                this.w0.setTranslationY(AndroidUtilities.dp(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.v0, (Property<di, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.v0, yhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(l1Var, (Property<eg.l1, Float>) View.ALPHA, l1Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(nr.f);
                animatorSet.addListener(new lh.k3(this, firstOffset, wgVar, 1));
                this.q1 = animatorSet;
                di diVar11 = this.v0;
                yhVar.getClass();
                yhVar.b(diVar11, 0.0f);
                animatorSet.start();
            } else {
                diVar5.setAlpha(0.0f);
                wgVar.run();
                a2(0);
                this.containerView.invalidate();
            }
            if (this.j2 && !(diVar instanceof rh.o3)) {
                this.j2 = false;
                l1Var.e();
                l1Var.invalidate();
                u1();
            }
            l1Var.setForcedMenuWidth((j10 == 1 || j10 == 6 || (diVar instanceof rh.o3)) ? AndroidUtilities.dp(46.0f) : j10 == 4 ? AndroidUtilities.dp(84.0f) : 0);
        }
    }

    public final void S1(boolean z4, Boolean bool) {
        li liVar;
        if (this.j0 == null) {
            liVar = this;
            qn qnVar = new qn(liVar, getContext(), false, this.resourcesProvider, bool);
            liVar.j0 = qnVar;
            liVar.t0[1] = qnVar;
            qnVar.setDelegate(new tg(this, 15));
        } else {
            liVar = this;
        }
        R1(liVar.j0, 9L, z4);
    }

    public final void T1(boolean z4, boolean z10) {
        di diVar;
        this.d.a(z4, z10);
        eg.l1 l1Var = this.U0;
        if (!(z4 && l1Var.getTag() == null) && (z4 || l1Var.getTag() == null)) {
            return;
        }
        l1Var.setTag(z4 ? 1 : null);
        AnimatorSet animatorSet = this.V0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.V0 = null;
        }
        boolean z11 = (this.C || this.Q0 || (this.N0 == 0 && this.n1) || this.v0 != this.g0 || (!this.I1 && !this.J1)) ? false : true;
        if (this.v0 == this.Q) {
            z11 = false;
        }
        mh mhVar = this.u1;
        org.telegram.ui.ActionBar.w0 w0Var = this.X0;
        if (z4) {
            if (z11) {
                w0Var.setVisibility(0);
                w0Var.setClickable(true);
            }
        } else if (this.P0 && this.A0.getTag() == null) {
            mhVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (p2Var != null) {
            if (z4) {
                AndroidUtilities.setLightStatusBar(this, i0.a.f(getThemedColor(this.e2 ? org.telegram.ui.ActionBar.j6.tg : org.telegram.ui.ActionBar.j6.h5)) > 0.699999988079071d);
            } else {
                AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
            }
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.V0 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z4 ? 1.0f : 0.0f) - l1Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(l1Var, (Property<eg.l1, Float>) property, z4 ? 1.0f : 0.0f));
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z4 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_X, z4 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_Y, z4 ? 1.0f : 0.6f));
            }
            this.V0.playTogether(arrayList);
            this.V0.addListener(new dg.w2(24, this, z4));
            this.V0.setInterpolator(nr.h);
            this.V0.setDuration(380L);
            this.V0.start();
            return;
        }
        if (z4 && this.P0 && ((diVar = this.v0) == null || diVar.I())) {
            mhVar.setVisibility(4);
        }
        l1Var.setAlpha(z4 ? 1.0f : 0.0f);
        if (z11) {
            w0Var.setAlpha(z4 ? 1.0f : 0.0f);
            w0Var.setScaleX(z4 ? 1.0f : 0.6f);
            w0Var.setScaleY(z4 ? 1.0f : 0.6f);
        }
        if (z4) {
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = this.b1;
        if (w0Var2 != null) {
            w0Var2.setVisibility(4);
        }
        if (this.N0 == 0 && this.n1) {
            return;
        }
        w0Var.setVisibility(4);
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.D0;
        qh qhVar = this.B0;
        qhVar.getLocationOnScreen(iArr);
        if (this.y2 != null) {
            di diVar = this.v0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.g0;
            if ((diVar == chatAttachAlertPhotoLayout || diVar == this.n0) && this.Z) {
                ah.d dVar = this.L0;
                alpha = (dVar.getAlpha() * dVar.getMeasuredHeight()) + (dVar.getY() - this.y2.getTop());
            } else {
                alpha = -qhVar.getHeight();
            }
            if (Math.abs(this.y2.getTranslationY() - alpha) > 0.5f) {
                this.y2.setTranslationY(alpha);
                this.y2.invalidate();
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
        boolean z4;
        boolean z10;
        boolean z11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.q1 != null) {
            return;
        }
        int selectedItemsCount = this.v0.getSelectedItemsCount();
        vh vhVar = this.F0;
        if (selectedItemsCount == 0) {
            vhVar.g(0, i10 != 0);
            P1(false, i10 != 0);
        } else {
            if (P1(true, i10 != 0) || i10 == 0) {
                vhVar.g(selectedItemsCount, i10 != 0);
                vhVar.c();
            } else {
                vhVar.g(selectedItemsCount, true);
                vhVar.c();
            }
        }
        this.v0.B(selectedItemsCount);
        d1(i10 != 0);
        if (this.v0 == this.g0 && ((((z4 = (p2Var = this.c0) instanceof org.telegram.ui.xn)) || this.N0 != 0 || this.Q0) && ((selectedItemsCount == 0 && this.n1) || ((selectedItemsCount != 0 || this.N0 != 0 || this.Q0) && !this.n1)))) {
            this.n1 = (selectedItemsCount == 0 && this.N0 == 0 && !this.Q0) ? false : true;
            AnimatorSet animatorSet = this.W0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W0 = null;
            }
            int i11 = this.N0;
            eg.l1 l1Var = this.U0;
            org.telegram.ui.ActionBar.w0 w0Var = this.b1;
            if (i11 != 0 && w0Var != null && l1Var.getTag() != null && z4) {
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
                if (!ChatObject.isChannel(xnVar.e) || (tL_chatBannedRights = xnVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z10 = true;
                    z11 = this.n1;
                    mh mhVar = this.f1;
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.X0;
                    if (!z11) {
                        if (this.N0 == 0 && !this.Q0) {
                            w0Var2.setVisibility(0);
                            w0Var2.setClickable(true);
                        }
                        mhVar.setVisibility(0);
                    } else if (l1Var.getTag() != null && w0Var != null) {
                        w0Var.setVisibility(0);
                    }
                    if (i10 != 0) {
                        if (l1Var.getTag() == null && this.N0 == 0 && !this.Q0) {
                            w0Var2.setAlpha(this.n1 ? 1.0f : 0.0f);
                            w0Var2.setScaleX(this.n1 ? 1.0f : 0.6f);
                            w0Var2.setScaleY(this.n1 ? 1.0f : 0.6f);
                        }
                        mhVar.setAlpha(this.n1 ? 1.0f : 0.0f);
                        if (z10) {
                            w0Var.setAlpha(this.n1 ? 0.0f : 1.0f);
                        }
                        if (this.n1 && w0Var != null) {
                            w0Var.setVisibility(4);
                        }
                    } else {
                        this.W0 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (l1Var.getTag() == null && this.N0 == 0 && !this.Q0) {
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, this.n1 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_X, this.n1 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_Y, this.n1 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(mhVar, (Property<mh, Float>) property, this.n1 ? 1.0f : 0.0f));
                        if (z10) {
                            arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, this.n1 ? 0.0f : 1.0f));
                        }
                        this.W0.playTogether(arrayList);
                        this.W0.addListener(new a9(this, 5));
                        this.W0.setDuration(180L);
                        this.W0.start();
                    }
                }
            }
            z10 = false;
            z11 = this.n1;
            mh mhVar2 = this.f1;
            org.telegram.ui.ActionBar.w0 w0Var22 = this.X0;
            if (!z11) {
            }
            if (i10 != 0) {
            }
        }
        Y1(i10 != 0);
        MessageObject messageObject = this.E1;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.G1).getSendPaidMessagesStars(n1()) : 0L;
        di diVar = this.v0;
        vhVar.i(j1() + (diVar != null ? diVar.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        qh qhVar = this.B0;
        if (qhVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qhVar.getLayoutParams();
            int max = Math.max(AndroidUtilities.dp(48.0f), vhVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                qhVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void W1() {
        float f10;
        di diVar = this.v0;
        boolean g10 = diVar == null ? false : diVar.g();
        eg.s0 s0Var = this.c1;
        s0Var.setEnabled(g10);
        di diVar2 = this.v0;
        if (diVar2 != null) {
            f10 = ((diVar2.g() ? 1.0f : 0.5f) * (this.w0 == null ? 1.0f : this.a0)) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        di diVar3 = this.w0;
        if (diVar3 != null) {
            f10 = e2.c.w(1.0f, this.a0, diVar3.g() ? 1.0f : 0.5f, f10);
        }
        this.d1 = f10;
        if (s0Var != null) {
            float f11 = f10 * this.e1;
            s0Var.setAlpha(f11);
            s0Var.setVisibility(f11 <= 0.0f ? 4 : 0);
        }
    }

    public final void X1(di diVar, int i10) {
        if (diVar == null) {
            return;
        }
        ng.e eVar = this.z2;
        if (eVar != null && Build.VERSION.SDK_INT >= 31) {
            eVar.f(0.0f, i10);
            Z0();
        }
        int currentItemTop = diVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z4 = false;
        boolean z10 = diVar == this.v0 && currentItemTop <= diVar.getButtonsHideOffset();
        this.O = z10;
        if (diVar == this.v0) {
            T1(z10, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) diVar.getLayoutParams();
        int C = org.telegram.ui.b.C(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        di diVar2 = this.v0;
        int i11 = diVar2 == diVar ? 0 : 1;
        if ((diVar2 instanceof om) || (this.w0 instanceof om)) {
            Object obj = this.q1;
            if ((obj instanceof o1.j) && ((o1.j) obj).f) {
                z4 = true;
            }
        }
        int[] iArr = this.Y1;
        int i12 = iArr[i11];
        if (i12 == C && !z4) {
            if (i10 != 0) {
                this.Z1 = i12;
            }
        } else {
            this.Z1 = i12;
            iArr[i11] = C;
            a2(i11);
            this.containerView.invalidate();
        }
    }

    public final void Y0() {
        if (m1().a.length() <= 0) {
            return;
        }
        this.v0.a(m1().getText());
    }

    public final void Y1(boolean z4) {
        jc0 jc0Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.g0;
        if (chatAttachAlertPhotoLayout == null || (jc0Var = this.Y0) == null) {
            return;
        }
        boolean z10 = this.n1 && this.f0 && this.v0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0();
        boolean z11 = !ChatAttachAlertPhotoLayout.S();
        jc0Var.f = z11;
        if (!z4) {
            ((z5) jc0Var.g).a(z11);
        }
        jc0Var.invalidateSelf();
        org.telegram.ui.ActionBar.w0 w0Var = this.Z0;
        if (z4 && this.n1) {
            w0Var.setVisibility(0);
            w0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(nr.h).withEndAction(new fh(this, z10, 0)).start();
        } else {
            w0Var.setVisibility(z10 ? 0 : 8);
            w0Var.setAlpha(z10 ? 1.0f : 0.0f);
            w0Var.setScaleX(z10 ? 1.0f : 0.6f);
            w0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0() {
        ng.e eVar;
        boolean z4;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.z2) == null) {
            return;
        }
        mh mhVar = this.u1;
        ViewGroup viewGroup = this.containerView;
        RectF rectF = this.I2;
        ug.i.c(mhVar, viewGroup, rectF);
        float measuredWidth = this.containerView.getMeasuredWidth();
        float measuredHeight = this.U0.getMeasuredHeight();
        RectF rectF2 = this.H2;
        rectF2.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        rectF2.inset(0.0f, -AndroidUtilities.dp(48.0f));
        rectF.set(0.0f, this.containerView.getMeasuredHeight() - (AndroidUtilities.dp(180.0f) + Math.max(AndroidUtilities.navigationBarHeight, o1())), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        di diVar = this.v0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.g0;
        if (diVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null) {
            pl plVar = chatAttachAlertPhotoLayout.B;
            if (plVar.getFastScroll() != null) {
                bl0 fastScroll = plVar.getFastScroll();
                pg.b bVar = fastScroll.b0;
                RectF rectF3 = this.J2;
                if (bVar != null || fastScroll.c0 != null) {
                    rectF3.set(fastScroll.c0.getBounds());
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(fastScroll.b0.getBounds());
                    rectF3.union(rectF4);
                }
                bl0 fastScroll2 = plVar.getFastScroll();
                ViewGroup viewGroup2 = this.containerView;
                RectF rectF5 = AndroidUtilities.rectTmp;
                ug.i.c(fastScroll2, viewGroup2, rectF5);
                rectF3.offset(rectF5.left, rectF5.top);
                rectF3.inset(-AndroidUtilities.dp(48.0f), -AndroidUtilities.dp(48.0f));
                rectF3.left = Math.max(0.0f, rectF3.left);
                rectF3.right = Math.min(this.containerView.getMeasuredWidth(), rectF3.right);
                z4 = true;
                int i10 = !z4 ? 3 : 2;
                ArrayList arrayList = this.G2;
                ArrayList arrayList2 = this.K2;
                eVar.g(lf.l0.a(arrayList, i10, arrayList2), arrayList2);
                eVar.e(this.F2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
            }
        }
        z4 = false;
        if (!z4) {
        }
        ArrayList arrayList3 = this.G2;
        ArrayList arrayList22 = this.K2;
        eVar.g(lf.l0.a(arrayList3, i10, arrayList22), arrayList22);
        eVar.e(this.F2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void Z1(boolean z4) {
        di diVar = this.g0;
        if (!z4) {
            Q1(diVar);
            return;
        }
        if (this.J) {
            if (this.n0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.r;
                if (f6Var == null) {
                    f6Var = this.resourcesProvider;
                }
                om omVar = new om(context, f6Var, this);
                omVar.y = 0.0f;
                omVar.B = 0.0f;
                omVar.C = 0.0f;
                omVar.D = 0.0f;
                omVar.E = 0.0f;
                omVar.F = 0.0f;
                omVar.G = null;
                omVar.H = false;
                omVar.J = 0.0f;
                omVar.N = false;
                omVar.P = false;
                Point point = AndroidUtilities.displaySize;
                omVar.Q = point.y > point.x;
                omVar.n = f6Var;
                omVar.f = true;
                omVar.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z n10 = omVar.b.U0.n();
                TextView textView = new TextView(context);
                omVar.x = textView;
                org.telegram.ui.ActionBar.f6 f6Var2 = omVar.a;
                vl vlVar = new vl(omVar, context, n10, f6Var2, 1);
                omVar.b.U0.addView(vlVar, 0, k7.b6.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
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
                vlVar.addView(textView, k7.b6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                lh.e1 e1Var = new lh.e1(omVar, context, f6Var2, 12);
                omVar.r = e1Var;
                e1Var.setAdapter(new org.telegram.ui.y7(omVar, 3));
                f2.i0 i0Var = new f2.i0(1, false);
                omVar.s = i0Var;
                e1Var.setLayoutManager(i0Var);
                e1Var.setClipChildren(false);
                e1Var.setClipToPadding(false);
                e1Var.setOverScrollMode(2);
                e1Var.setVerticalScrollBarEnabled(false);
                nm nmVar = new nm(omVar, context);
                omVar.v = nmVar;
                nmVar.setClipToPadding(true);
                nmVar.setClipChildren(true);
                omVar.addView(e1Var, k7.b6.c(-1.0f, -1));
                omVar.M = omVar.b.g0;
                nmVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = omVar.M;
                nmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                nmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                nmVar.c();
                UndoView undoView = new UndoView(context, null, false, omVar.b.r);
                omVar.w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                omVar.addView(undoView, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                omVar.K = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.n0 = omVar;
                omVar.bringToFront();
            }
            di diVar2 = this.v0;
            om omVar2 = this.n0;
            if (diVar2 != omVar2) {
                diVar = omVar2;
            }
            Q1(diVar);
        }
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        return (p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).K6();
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
        float f10;
        org.telegram.ui.ActionBar.w0 w0Var;
        float f11;
        float f12;
        float f13;
        float f14;
        eg.s0 s0Var;
        float max;
        int i12;
        float f15 = this.d.e;
        di diVar = i10 == 0 ? this.v0 : this.w0;
        if (diVar == null || diVar.getVisibility() != 0) {
            return;
        }
        int p12 = p1(i10);
        if (diVar == this.j0 || diVar == this.k0) {
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
        float alpha = this.U0.getAlpha();
        mh mhVar = this.f1;
        float dp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - mhVar.getAlpha()) * 26.0f);
        boolean z4 = this.n1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.X0;
        ah.d dVar = this.L0;
        if (z4 && this.N0 == 0 && !this.Q0) {
            w0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37), ((p12 - AndroidUtilities.dp((i11 * f15) + 37.0f)) + dp) - (dVar.getAlpha() * dVar.getMeasuredHeight())) + this.i2);
        } else {
            w0Var2.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37)) + this.i2);
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.Z0;
        if (w0Var3 != null) {
            w0Var3.setTranslationY(w0Var2.getTranslationY());
        }
        ph.f3 f3Var = this.a1;
        if (f3Var != null) {
            f3Var.setTranslationY(w0Var2.getTranslationY());
        }
        if (this.C && this.p1) {
            di diVar2 = this.w0;
            if (diVar2 != null && this.v0 != null) {
                f10 = Math.min(diVar2.getTranslationY(), this.v0.getTranslationY());
            } else if (diVar2 != null) {
                f10 = diVar2.getTranslationY();
            }
            w0Var = this.b1;
            if (w0Var != null) {
                w0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i11 + 37)) + this.i2);
            }
            float dp2 = ((((p12 - AndroidUtilities.dp((i11 * f15) + 25.0f)) + dp) + this.i2) + f10) - (dVar.getAlpha() * dVar.getMeasuredHeight());
            this.m1 = dp2;
            mhVar.setTranslationY(Math.max(this.i2, dp2));
            dVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.i2, (mhVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.m1 + AndroidUtilities.dp(8.0f)));
            if (this.Z) {
                U1();
            }
            g1();
            int i13 = 59;
            if (this.j0 != null) {
                if (AndroidUtilities.isTablet()) {
                    i12 = 63;
                } else {
                    Point point2 = AndroidUtilities.displaySize;
                    i12 = point2.x > point2.y ? 53 : 59;
                }
                qn qnVar = this.j0;
                if (qnVar == this.w0) {
                    f12 = (qnVar.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.a0;
                } else if (qnVar == this.v0) {
                    f12 = (qnVar.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.w0 == null ? 1.0f : 1.0f - this.a0;
                }
                if (this.k0 != null) {
                    if (AndroidUtilities.isTablet()) {
                        i13 = 63;
                    } else {
                        Point point3 = AndroidUtilities.displaySize;
                        if (point3.x > point3.y) {
                            i13 = 53;
                        }
                    }
                    qn qnVar2 = this.k0;
                    if (qnVar2 == this.w0) {
                        f14 = (qnVar2.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i13 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.a0;
                    } else if (qnVar2 == this.v0) {
                        f14 = (qnVar2.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i13 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.w0 == null ? 1.0f : 1.0f - this.a0;
                    }
                    s0Var = this.c1;
                    if (s0Var != null) {
                        int measuredWidth = LocaleController.isRTL ? (this.containerView.getMeasuredWidth() - s0Var.getMeasuredWidth()) - AndroidUtilities.dp(62.0f) : 0;
                        if (f11 <= 0.0f || f13 <= 0.0f) {
                            if (f11 <= 0.0f) {
                                f12 = 0.0f;
                            }
                            if (f13 <= 0.0f) {
                                f14 = 0.0f;
                            }
                            max = Math.max(f12, f14);
                        } else {
                            max = AndroidUtilities.lerp(f12, f14, f13);
                        }
                        s0Var.setTranslationY(Math.max(0.0f, max) + this.i2);
                        s0Var.setTranslationX(-((measuredWidth * (1.0f - f15)) + AndroidUtilities.dp((7.0f * r5) + 12.0f)));
                    }
                    float max2 = Math.max(f13, f11);
                    this.e1 = max2;
                    if (s0Var == null) {
                        float f16 = this.d1 * max2;
                        s0Var.setAlpha(f16);
                        s0Var.setVisibility(f16 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f13 = 0.0f;
                f14 = 0.0f;
                s0Var = this.c1;
                if (s0Var != null) {
                }
                float max22 = Math.max(f13, f11);
                this.e1 = max22;
                if (s0Var == null) {
                }
            }
            f11 = 0.0f;
            f12 = 0.0f;
            if (this.k0 != null) {
            }
            f13 = 0.0f;
            f14 = 0.0f;
            s0Var = this.c1;
            if (s0Var != null) {
            }
            float max222 = Math.max(f13, f11);
            this.e1 = max222;
            if (s0Var == null) {
            }
        }
        f10 = 0.0f;
        w0Var = this.b1;
        if (w0Var != null) {
        }
        float dp22 = ((((p12 - AndroidUtilities.dp((i11 * f15) + 25.0f)) + dp) + this.i2) + f10) - (dVar.getAlpha() * dVar.getMeasuredHeight());
        this.m1 = dp22;
        mhVar.setTranslationY(Math.max(this.i2, dp22));
        dVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.i2, (mhVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.m1 + AndroidUtilities.dp(8.0f)));
        if (this.Z) {
        }
        g1();
        int i132 = 59;
        if (this.j0 != null) {
        }
        f11 = 0.0f;
        f12 = 0.0f;
        if (this.k0 != null) {
        }
        f13 = 0.0f;
        f14 = 0.0f;
        s0Var = this.c1;
        if (s0Var != null) {
        }
        float max2222 = Math.max(f13, f11);
        this.e1 = max2222;
        if (s0Var == null) {
        }
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (!(p2Var instanceof org.telegram.ui.xn)) {
            return false;
        }
        return ChatActivityEnterView.H(this.G1, ((org.telegram.ui.xn) p2Var).a(), p2Var, charSequence);
    }

    public final void b2() {
        int i10 = 0;
        a2(0);
        this.o1.invalidate();
        ah.d dVar = this.L0;
        dVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.g0;
        if (chatAttachAlertPhotoLayout != null) {
            pl plVar = chatAttachAlertPhotoLayout.B;
            chatAttachAlertPhotoLayout.V();
            if (plVar != null && plVar.getFastScroll() != null) {
                bl0 fastScroll = plVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.m1;
                if (this.Z) {
                    i10 = (int) (dVar.getAlpha() * dVar.getMeasuredHeight());
                }
                fastScroll.e0 = currentActionBarHeight + i10;
                plVar.getFastScroll().invalidate();
            }
        }
        U1();
        g1();
    }

    public final void c1() {
        nh nhVar = this.v1;
        if (nhVar == null) {
            return;
        }
        int childCount = nhVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            nhVar.getChildAt(i10);
        }
        boolean z4 = this.e2;
        this.g1.setTextColor(getThemedColor(z4 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
        this.l1.setTextColor(getThemedColor(z4 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
        this.c1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        int themedColor = getThemedColor(z4 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5);
        org.telegram.ui.ActionBar.w0 w0Var = this.X0;
        w0Var.setIconColor(themedColor);
        org.telegram.ui.ActionBar.j6.w1(getThemedColor(z4 ? org.telegram.ui.ActionBar.j6.ig : org.telegram.ui.ActionBar.j6.I5), w0Var.getBackground());
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        w0Var.G(getThemedColor(i11), false);
        w0Var.G(getThemedColor(i11), true);
        w0Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.Z0;
        if (w0Var2 != null) {
            w0Var2.setIconColor(getThemedColor(z4 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.b1;
        if (w0Var3 != null) {
            w0Var3.setIconColor(getThemedColor(z4 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
            org.telegram.ui.ActionBar.j6.w1(getThemedColor(z4 ? org.telegram.ui.ActionBar.j6.ig : org.telegram.ui.ActionBar.j6.I5), w0Var3.getBackground());
        }
        qh qhVar = this.B0;
        org.telegram.ui.ActionBar.f6 f6Var = qhVar.J;
        yt ytVar = qhVar.a;
        int i12 = qhVar.I;
        if (i12 == 0) {
            ytVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            ytVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
            ytVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        } else if (i12 == 2 || i12 == 3) {
            ytVar.setHintTextColor(-1929379841);
            ytVar.setTextColor(-1);
            ytVar.setCursorColor(-1);
            ytVar.setHandlesColor(-1);
            ytVar.setHighlightColor(822083583);
            ytVar.quoteColor = -1;
        } else {
            ytVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.t5, f6Var));
            ytVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        }
        qhVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
        zt ztVar = qhVar.d;
        if (ztVar != null) {
            ztVar.U();
        }
        nhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        int themedColor2 = getThemedColor(z4 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5);
        eg.l1 l1Var = this.U0;
        l1Var.C(themedColor2, false);
        l1Var.B(getThemedColor(z4 ? org.telegram.ui.ActionBar.j6.ig : org.telegram.ui.ActionBar.j6.I5), false);
        l1Var.setTitleColor(getThemedColor(z4 ? org.telegram.ui.ActionBar.j6.hg : org.telegram.ui.ActionBar.j6.j5));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.j6.w1(q12, this.shadowDrawable);
        sg.c cVar = this.C2;
        if (cVar.a.getColor() != q12) {
            cVar.a(q12);
            wg.f fVar = this.s1;
            if (fVar != null) {
                fVar.invalidate();
            }
            oh ohVar = this.t1;
            if (ohVar != null) {
                ohVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i14 = 0;
        while (true) {
            di[] diVarArr = this.t0;
            if (i14 >= diVarArr.length) {
                break;
            }
            di diVar = diVarArr[i14];
            if (diVar != null) {
                diVar.d();
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

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithTouchOutside() {
        return this.v0.b();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            o1.j jVar = this.m2;
            if (jVar != null) {
                jVar.c();
            }
            AnimatorSet animatorSet2 = this.n2;
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
    public final void d1(boolean z4) {
        boolean z10;
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (p2Var == null || !(p2Var instanceof org.telegram.ui.xn)) {
            return;
        }
        org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
        du duVar = this.Z ? this.M0 : this.B0;
        String obj = duVar != null ? duVar.getText().toString() : null;
        if (this.E1 == null) {
            di diVar = this.v0;
            z10 = true;
            if (diVar != null) {
            }
            if (lf.w.g(this.G1).e(obj, xnVar.a8) <= 0) {
                MessageObject messageObject = xnVar.k5;
                if (messageObject != null) {
                }
            }
            this.h.a(z10, z4);
            if (z10 || !s1()) {
            }
            H1(false, z4);
            return;
        }
        z10 = false;
        this.h.a(z10, z4);
        if (z10) {
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.reloadInlineHints && i10 != NotificationCenter.attachMenuBotsDidLoad && i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.H = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
            }
        } else {
            ii iiVar = this.x1;
            if (iiVar != null) {
                iiVar.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, org.telegram.ui.ActionBar.l2
    public final void dismiss(boolean z4) {
        if (z4) {
            this.x2 = z4;
        }
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public void dismissInternal() {
        ji jiVar = this.W1;
        if (jiVar != null) {
            jiVar.x(new wg(this, 2));
        } else {
            F1();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.v0.o(i10);
    }

    public final void e1() {
        float f10 = this.c.e;
        this.t1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.d.e))), 1.0f - ((1.0f - this.b.e) * f10)));
    }

    public final void f1() {
        z10.d(this.C0, e2.c.z(this.e.e, this.f.e, lf.l0.b(this.h.e), this.O1 ? 0.0f : 1.0f));
    }

    @Override // org.telegram.ui.ActionBar.a3
    public final boolean g() {
        return true;
    }

    public final void g1() {
        vh vhVar = this.F0;
        mh mhVar = this.E0;
        ah.d dVar = this.L0;
        if (dVar == null || dVar.getVisibility() != 0 || dVar.getAlpha() == 0.0f) {
            mhVar.setTranslationY(this.d2);
            vhVar.setAlpha(1.0f);
            return;
        }
        float f10 = this.b.e;
        float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f10));
        vhVar.setAlpha(abs * abs * abs * abs);
        mhVar.setTranslationY(AndroidUtilities.lerp(this.d2, ((dVar.getTranslationY() + dVar.getTop()) - mhVar.getTop()) + AndroidUtilities.dp(8.0f), nr.j.getInterpolation(f10)));
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            di[] diVarArr = this.t0;
            if (i10 >= diVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.i5));
                return arrayList;
            }
            di diVar = diVarArr[i10];
            if (diVar != null && (themeDescriptions = diVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i10++;
        }
    }

    public final void h1(int i10) {
        this.P0 = true;
        this.u1.setVisibility(0);
        this.E = true;
        this.F = i10;
        this.N0 = 0;
        this.C = false;
        this.D = false;
        this.G = null;
        org.telegram.ui.ActionBar.w0 w0Var = this.h1;
        if (w0Var != null) {
            this.g1.setTranslationY(0.0f);
            w0Var.setVisibility(8);
        }
    }

    public final void i1(ph.d4 d4Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.g1;
        textView.setText(string);
        this.P0 = false;
        this.u1.setVisibility(8);
        this.N0 = 1;
        this.C = true;
        this.D = true;
        this.f0 = false;
        this.G = d4Var;
        org.telegram.ui.ActionBar.w0 w0Var = this.h1;
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
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (!(p2Var instanceof org.telegram.ui.xn) || (messagePreviewParams = ((org.telegram.ui.xn) p2Var).c5) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        return p2Var instanceof org.telegram.ui.xn ? ((org.telegram.ui.xn) p2Var).e : MessagesController.getInstance(this.G1).getChat(Long.valueOf(-this.W));
    }

    public final float l1() {
        return r0.getMeasuredHeight() - ((1.0f - this.A0.getAlpha()) * (r0.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final du m1() {
        di diVar;
        return (this.Z && ((diVar = this.v0) == this.g0 || diVar == this.n0)) ? this.M0 : this.B0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        return p2Var instanceof org.telegram.ui.xn ? ((org.telegram.ui.xn) p2Var).a() : this.W;
    }

    public final int o1() {
        di diVar = this.v0;
        qn qnVar = this.j0;
        if (diVar == qnVar && qnVar.B != null) {
            return qnVar.getEmojiPadding();
        }
        qn qnVar2 = this.k0;
        return (diVar != qnVar2 || qnVar2.B == null) ? this.Z ? this.M0.getEmojiPadding() : this.B0.getEmojiPadding() : qnVar2.getEmojiPadding();
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        if (this.P.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        eg.l1 l1Var = this.U0;
        if (l1Var.k0) {
            l1Var.h(true);
            return;
        }
        if (this.v0.i()) {
            return;
        }
        if (m1() == null || !m1().e) {
            super.onBackPressed();
        } else {
            m1().k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.v0.l(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.g0;
        h91 h91Var = chatAttachAlertPhotoLayout.i0;
        dg.u2 u2Var = chatAttachAlertPhotoLayout.g0;
        TextView textView = chatAttachAlertPhotoLayout.m0;
        pl plVar = chatAttachAlertPhotoLayout.r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        boolean z4 = i14 < i15;
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == u2Var) {
            if (z4) {
                if (plVar.getVisibility() == 0) {
                    u2Var.layout(0, org.telegram.messenger.y3.B(222.0f, i13, i16), i14, org.telegram.messenger.y3.B(96.0f, i13, i16));
                    return true;
                }
                u2Var.layout(0, org.telegram.messenger.y3.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            }
            if (plVar.getVisibility() == 0) {
                u2Var.layout(org.telegram.messenger.y3.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            }
            u2Var.layout(org.telegram.messenger.y3.B(126.0f, i12, i16), 0, i12, i15 - i16);
            return true;
        }
        if (view == h91Var) {
            if (z4) {
                if (plVar.getVisibility() == 0) {
                    h91Var.layout(0, org.telegram.messenger.y3.B(310.0f, i13, i16), i14, org.telegram.messenger.y3.B(260.0f, i13, i16));
                    return true;
                }
                h91Var.layout(0, org.telegram.messenger.y3.B(176.0f, i13, i16), i14, org.telegram.messenger.y3.B(126.0f, i13, i16));
                return true;
            }
            if (plVar.getVisibility() == 0) {
                h91Var.layout(org.telegram.messenger.y3.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            }
            h91Var.layout(org.telegram.messenger.y3.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
            return true;
        }
        if (view != textView) {
            if (view != plVar) {
                return false;
            }
            if (z4) {
                int B = org.telegram.messenger.y3.B(88.0f, i15, i16);
                view.layout(0, B, view.getMeasuredWidth(), view.getMeasuredHeight() + B);
                return true;
            }
            int dp2 = (i10 + i14) - AndroidUtilities.dp(88.0f);
            view.layout(dp2, 0, view.getMeasuredWidth() + dp2, view.getMeasuredHeight());
            return true;
        }
        if (z4) {
            dp = (i14 - textView.getMeasuredWidth()) / 2;
            int dp3 = i13 - AndroidUtilities.dp(167.0f);
            textView.setRotation(0.0f);
            if (plVar.getVisibility() == 0) {
                dp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = dp3 - i16;
        } else {
            dp = i12 - AndroidUtilities.dp(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
            textView.setRotation(-90.0f);
            if (plVar.getVisibility() == 0) {
                dp -= AndroidUtilities.dp(96.0f);
            }
        }
        textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.g0;
        em emVar = chatAttachAlertPhotoLayout.v;
        pl plVar = chatAttachAlertPhotoLayout.r;
        org.telegram.ui.k kVar = chatAttachAlertPhotoLayout.s;
        boolean z4 = i10 < i11;
        am amVar = chatAttachAlertPhotoLayout.M;
        if (view != amVar) {
            dg.u2 u2Var = chatAttachAlertPhotoLayout.g0;
            if (view == u2Var) {
                if (z4) {
                    u2Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30));
                    return true;
                }
                u2Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            h91 h91Var = chatAttachAlertPhotoLayout.i0;
            if (view == h91Var) {
                if (z4) {
                    h91Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                    return true;
                }
                h91Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            if (view == plVar) {
                chatAttachAlertPhotoLayout.G0 = true;
                if (z4) {
                    plVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
                    if (kVar.o != 0) {
                        plVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        kVar.j1(0);
                        emVar.l();
                    }
                } else {
                    plVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                    if (kVar.o != 1) {
                        plVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        kVar.j1(1);
                        emVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.G0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.V && !chatAttachAlertPhotoLayout.a0) {
            amVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean onCustomOpenAnimation() {
        this.g0.setTranslationX(0.0f);
        this.k1.setAlpha(0.0f);
        this.i1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.n2 = animatorSet;
        int i10 = 2;
        yh yhVar = this.l2;
        int i11 = 1;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, yhVar, 0.0f, 400.0f));
        this.n2.setDuration(400L);
        this.n2.setStartDelay(20L);
        yhVar.set(this, Float.valueOf(0.0f));
        this.n2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new ug(this, i10));
        o1.j jVar = this.m2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(this.containerView, o1.h.n, 0.0f);
        this.m2 = jVar2;
        if (this.E1 != null) {
            jVar2.u.a(0.75f);
            this.m2.u.b(350.0f);
        } else {
            jVar2.u.a(0.75f);
            this.m2.u.b(350.0f);
        }
        this.m2.f();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.backDrawable, n6.d, this.dimBehind ? this.dimBehindAlpha : 0));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        lh.p6 p6Var = new lh.p6(this, animationNotificationsLocker, this.delegate, 28);
        this.m2.a(new lb(i11, this, p6Var));
        this.currentSheetAnimation.addListener(new dg.y2(19, this, p6Var));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new ug(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(nr.f);
        ofFloat2.start();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onDismissWithTouchOutside() {
        if (this.v0.p()) {
            dismiss();
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.v0.C(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onOpenAnimationEnd() {
        if (this.c0 instanceof org.telegram.ui.xn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.v0.u();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.p1 = true;
        if (this.J1 || this.I1) {
            return;
        }
        a1();
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).y0.add(this.P);
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
            ((LaunchActivity) context).y0.remove(this.P);
        }
    }

    public final int p1(int i10) {
        di diVar = this.w0;
        int[] iArr = this.Y1;
        return (diVar == null || !((this.v0 instanceof om) || (diVar instanceof om))) ? iArr[i10] : AndroidUtilities.lerp(iArr[0], iArr[1], this.a0);
    }

    public final int q1(boolean z4) {
        eg.l1 l1Var;
        if (this.e2) {
            return getThemedColor(org.telegram.ui.ActionBar.j6.tg);
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        Iterator it = this.n.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            long longValue = ((Long) eVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a10 = k7.n.a(f10, 0.0f, 1.0f);
        if (z4 && (l1Var = this.U0) != null && l1Var.getVisibility() == 0) {
            a10 *= 1.0f - l1Var.getAlpha();
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
        boolean z4;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        li liVar;
        am amVar;
        MediaController.AlbumEntry albumEntry;
        di diVar;
        this.K0 = 0L;
        this.F0.setEffect(0L);
        int i10 = 0;
        this.A1 = false;
        this.y1 = false;
        this.C1 = 0.0f;
        this.B1.setVisibility(8);
        RadialProgressView radialProgressView = this.z1;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        mh mhVar = this.u1;
        mhVar.setAlpha(1.0f);
        mhVar.setTranslationY(0.0f);
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.u0;
            if (i11 >= longSparseArray.size()) {
                break;
            }
            ((rh.o3) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
            i11++;
        }
        int i12 = this.N0;
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (i12 != 2) {
            if (p2Var instanceof org.telegram.ui.xn) {
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
                chat = xnVar.e;
                user = xnVar.i();
            } else {
                long j10 = this.W;
                int i13 = this.G1;
                if (j10 >= 0) {
                    user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.W));
                    chat = null;
                } else if (j10 < 0) {
                    chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-this.W));
                    user = null;
                }
            }
            z4 = p2Var instanceof org.telegram.ui.xn;
            if ((z4 && this.N0 != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.I1 = ChatObject.canSendPhoto(chat);
                    this.J1 = ChatObject.canSendVideo(chat);
                    this.K1 = ChatObject.canSendMusic(chat);
                    this.L1 = ChatObject.canSendPolls(chat);
                    this.M1 = !ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.canSendPolls(chat);
                    this.N1 = ChatObject.canSendPlain(chat);
                    this.H1 = ChatObject.canSendDocument(chat);
                } else {
                    this.L1 = UserObject.isBot(user) || UserObject.isUserSelf(user);
                    this.M1 = !z4 || ((org.telegram.ui.xn) p2Var).h == null;
                }
            }
            if (this.O1) {
                this.L1 = false;
                this.M1 = false;
            }
            qh qhVar = this.B0;
            if (z4 || this.N0 == 2) {
                qhVar.setVisibility(this.T ? 0 : 4);
            }
            boolean z10 = this.J1;
            boolean z11 = this.I1;
            boolean z12 = this.H1;
            chatAttachAlertPhotoLayout = this.g0;
            liVar = chatAttachAlertPhotoLayout.b;
            mz mzVar = chatAttachAlertPhotoLayout.E;
            boolean z13 = !z10 || z11;
            chatAttachAlertPhotoLayout.s0 = z13;
            chatAttachAlertPhotoLayout.t0 = z10;
            chatAttachAlertPhotoLayout.u0 = z11;
            chatAttachAlertPhotoLayout.w0 = z12;
            amVar = chatAttachAlertPhotoLayout.M;
            if (amVar != null) {
                amVar.setAlpha(z13 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.M.setEnabled(chatAttachAlertPhotoLayout.s0);
            }
            if (!((liVar.c0 instanceof org.telegram.ui.xn) && liVar.k1() == null) && liVar.N0 == 0) {
                chatAttachAlertPhotoLayout.R0 = MediaController.allMediaAlbumEntry;
                if (chatAttachAlertPhotoLayout.s0) {
                    mzVar.setText(LocaleController.getString(R.string.NoPhotos));
                    mzVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat k12 = liVar.k1();
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
                chatAttachAlertPhotoLayout.R0 = MediaController.allMediaAlbumEntry;
            } else {
                chatAttachAlertPhotoLayout.R0 = MediaController.allPhotosAlbumEntry;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                chatAttachAlertPhotoLayout.M0 = chatAttachAlertPhotoLayout.e0();
            }
            if (chatAttachAlertPhotoLayout.R0 != null) {
                for (int i14 = 0; i14 < Math.min(100, chatAttachAlertPhotoLayout.R0.photos.size()); i14++) {
                    chatAttachAlertPhotoLayout.R0.photos.get(i14).reset();
                }
            }
            chatAttachAlertPhotoLayout.Z();
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.C.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
            albumEntry = chatAttachAlertPhotoLayout.R0;
            chatAttachAlertPhotoLayout.Q0 = albumEntry;
            if (albumEntry != null) {
                chatAttachAlertPhotoLayout.U0 = false;
                if (mzVar != null) {
                    mzVar.c();
                }
            }
            chatAttachAlertPhotoLayout.u0();
            qhVar.k(true);
            this.M0.k(true);
            this.r1 = false;
            setFocusable(false);
            if (!this.L || this.M) {
                if (this.l0 == null) {
                    al alVar = new al(this, getContext(), this.resourcesProvider, (this.E || this.M || this.O1) ? false : true);
                    this.l0 = alVar;
                    this.t0[5] = alVar;
                    uk ukVar = this.q2;
                    if (ukVar != null) {
                        alVar.setDelegate(ukVar);
                    } else {
                        alVar.setDelegate(new tg(this, i10));
                    }
                }
                this.T0 = 5L;
                diVar = this.l0;
            } else if (this.K) {
                E1(false);
                diVar = this.m0;
                this.T0 = 4L;
            } else {
                MessageObject messageObject = this.E1;
                if (messageObject != null) {
                    int i15 = this.D1;
                    if (i15 == -1) {
                        this.P0 = true;
                        if (messageObject.isMusic()) {
                            B1(false);
                            diVar = this.i0;
                            this.T0 = 3L;
                        } else if (this.E1.isDocument()) {
                            E1(false);
                            diVar = this.m0;
                            this.T0 = 4L;
                        } else {
                            this.T0 = 1L;
                        }
                    } else {
                        if (i15 == 2) {
                            B1(false);
                            diVar = this.i0;
                            this.T0 = 3L;
                        } else if (i15 == 1) {
                            E1(false);
                            diVar = this.m0;
                            this.T0 = 4L;
                        } else {
                            this.T0 = 1L;
                            diVar = chatAttachAlertPhotoLayout;
                        }
                        this.P0 = false;
                    }
                } else {
                    this.P0 = this.N0 == 0 && !this.Q0;
                    this.T0 = 1L;
                }
                diVar = chatAttachAlertPhotoLayout;
            }
            mhVar.setVisibility(this.P0 ? 0 : 8);
            if (this.v0 != diVar) {
                eg.l1 l1Var = this.U0;
                if (l1Var.k0) {
                    l1Var.h(true);
                }
                this.containerView.removeView(this.v0);
                this.v0.r();
                this.v0.setVisibility(8);
                this.v0.q();
                this.v0 = diVar;
                this.allowNestedScroll = true;
                if (diVar.getParent() == null) {
                    this.containerView.addView(this.v0, 0, k7.b6.c(-1.0f, -1));
                }
                diVar.setAlpha(1.0f);
                diVar.setVisibility(0);
                diVar.D(null);
                diVar.E();
                l1Var.setVisibility(diVar.h() != 0 ? 0 : 4);
                H1(this.Z, false);
                W1();
            }
            if (this.v0 != chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            V1(0);
            this.x1.l();
            m1().setText("");
            this.w1.h1(0, MediaController.VIDEO_BITRATE_480);
        }
        user = null;
        chat = null;
        z4 = p2Var instanceof org.telegram.ui.xn;
        if (z4) {
            if (chat != null) {
            }
            if (this.O1) {
            }
            qh qhVar2 = this.B0;
            if (z4) {
            }
            qhVar2.setVisibility(this.T ? 0 : 4);
            boolean z102 = this.J1;
            boolean z112 = this.I1;
            boolean z122 = this.H1;
            chatAttachAlertPhotoLayout = this.g0;
            liVar = chatAttachAlertPhotoLayout.b;
            mz mzVar2 = chatAttachAlertPhotoLayout.E;
            if (z102) {
            }
            chatAttachAlertPhotoLayout.s0 = z13;
            chatAttachAlertPhotoLayout.t0 = z102;
            chatAttachAlertPhotoLayout.u0 = z112;
            chatAttachAlertPhotoLayout.w0 = z122;
            amVar = chatAttachAlertPhotoLayout.M;
            if (amVar != null) {
            }
            if (liVar.c0 instanceof org.telegram.ui.xn) {
            }
            chatAttachAlertPhotoLayout.R0 = MediaController.allMediaAlbumEntry;
            if (chatAttachAlertPhotoLayout.s0) {
            }
            if (Build.VERSION.SDK_INT >= 23) {
            }
            if (chatAttachAlertPhotoLayout.R0 != null) {
            }
            chatAttachAlertPhotoLayout.Z();
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.C.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
            albumEntry = chatAttachAlertPhotoLayout.R0;
            chatAttachAlertPhotoLayout.Q0 = albumEntry;
            if (albumEntry != null) {
            }
            chatAttachAlertPhotoLayout.u0();
            qhVar2.k(true);
            this.M0.k(true);
            this.r1 = false;
            setFocusable(false);
            if (this.L) {
            }
            if (this.l0 == null) {
            }
            this.T0 = 5L;
            diVar = this.l0;
            mhVar.setVisibility(this.P0 ? 0 : 8);
            if (this.v0 != diVar) {
            }
            if (this.v0 != chatAttachAlertPhotoLayout) {
            }
            V1(0);
            this.x1.l();
            m1().setText("");
            this.w1.h1(0, MediaController.VIDEO_BITRATE_480);
        }
        if (chat != null) {
        }
        if (this.O1) {
        }
        qh qhVar22 = this.B0;
        if (z4) {
        }
        qhVar22.setVisibility(this.T ? 0 : 4);
        boolean z1022 = this.J1;
        boolean z1122 = this.I1;
        boolean z1222 = this.H1;
        chatAttachAlertPhotoLayout = this.g0;
        liVar = chatAttachAlertPhotoLayout.b;
        mz mzVar22 = chatAttachAlertPhotoLayout.E;
        if (z1022) {
        }
        chatAttachAlertPhotoLayout.s0 = z13;
        chatAttachAlertPhotoLayout.t0 = z1022;
        chatAttachAlertPhotoLayout.u0 = z1122;
        chatAttachAlertPhotoLayout.w0 = z1222;
        amVar = chatAttachAlertPhotoLayout.M;
        if (amVar != null) {
        }
        if (liVar.c0 instanceof org.telegram.ui.xn) {
        }
        chatAttachAlertPhotoLayout.R0 = MediaController.allMediaAlbumEntry;
        if (chatAttachAlertPhotoLayout.s0) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
        }
        if (chatAttachAlertPhotoLayout.R0 != null) {
        }
        chatAttachAlertPhotoLayout.Z();
        chatAttachAlertPhotoLayout.y0(false);
        chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
        chatAttachAlertPhotoLayout.C.h1(0, MediaController.VIDEO_BITRATE_480);
        chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
        albumEntry = chatAttachAlertPhotoLayout.R0;
        chatAttachAlertPhotoLayout.Q0 = albumEntry;
        if (albumEntry != null) {
        }
        chatAttachAlertPhotoLayout.u0();
        qhVar22.k(true);
        this.M0.k(true);
        this.r1 = false;
        setFocusable(false);
        if (this.L) {
        }
        if (this.l0 == null) {
        }
        this.T0 = 5L;
        diVar = this.l0;
        mhVar.setVisibility(this.P0 ? 0 : 8);
        if (this.v0 != diVar) {
        }
        if (this.v0 != chatAttachAlertPhotoLayout) {
        }
        V1(0);
        this.x1.l();
        m1().setText("");
        this.w1.h1(0, MediaController.VIDEO_BITRATE_480);
    }

    public final boolean s1() {
        if (!this.Z) {
            return false;
        }
        di diVar = this.v0;
        return diVar == this.g0 || diVar == this.n0;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void setAllowNestedScroll(boolean z4) {
        this.allowNestedScroll = z4;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean shouldOverlayCameraViewOverNavBar() {
        di diVar = this.v0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.g0;
        return diVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.f1;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        this.F1 = false;
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            this.calcMandatoryInsets = ((org.telegram.ui.xn) p2Var).x9();
        }
        W1();
        this.p1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.j2) {
            this.j2 = false;
            eg.l1 l1Var = this.U0;
            l1Var.e();
            l1Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z4) {
        ji jiVar = this.W1;
        if (jiVar == null || this.r1) {
            return;
        }
        boolean k10 = jiVar.k();
        this.r1 = true;
        AndroidUtilities.runOnUIThread(new lh.r5(this, editTextBoldCursor, z4, 13), k10 ? 200L : 0L);
    }

    public final void u1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int q12 = q1(false);
        org.telegram.ui.ActionBar.j6.w1(q12, this.shadowDrawable);
        sg.c cVar = this.C2;
        if (cVar.a.getColor() != q12) {
            cVar.a(q12);
            wg.f fVar = this.s1;
            if (fVar != null) {
                fVar.invalidate();
            }
            oh ohVar = this.t1;
            if (ohVar != null) {
                ohVar.invalidate();
            }
        }
        W1();
        this.containerView.invalidate();
    }

    public final void v1() {
        int i10 = 0;
        while (true) {
            di[] diVarArr = this.t0;
            if (i10 >= diVarArr.length) {
                break;
            }
            di diVar = diVarArr[i10];
            if (diVar != null) {
                diVar.m();
            }
            i10++;
        }
        int i11 = this.G1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.S = true;
        qh qhVar = this.B0;
        if (qhVar != null) {
            qhVar.o();
        }
        th thVar = this.M0;
        if (thVar != null) {
            thVar.o();
        }
    }

    public final void w1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String userName = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : UserObject.getUserName(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.G1).getAttachMenuBots().bots;
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
        d2Var.O = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        d2Var.Q = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 18));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void x1() {
        int i10 = 0;
        while (true) {
            di[] diVarArr = this.t0;
            if (i10 >= diVarArr.length) {
                this.c2 = true;
                return;
            }
            di diVar = diVarArr[i10];
            if (diVar != null) {
                diVar.x();
            }
            i10++;
        }
    }

    public final void y1() {
        int i10 = 0;
        this.c2 = false;
        while (true) {
            di[] diVarArr = this.t0;
            if (i10 >= diVarArr.length) {
                break;
            }
            di diVar = diVarArr[i10];
            if (diVar != null) {
                diVar.A();
            }
            i10++;
        }
        if (isShowing()) {
            this.W1.k();
        }
        ii iiVar = this.x1;
        if (iiVar != null) {
            iiVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.E1;
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        int i10 = this.G1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.E1.getDialogId()) && (p2Var instanceof org.telegram.ui.xn)) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
            MessageSuggestionParams messageSuggestionParams = xnVar.d5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.E1.messageOwner.suggested_post);
            }
            if (!lh.t7.U(i10, messageSuggestionParams.amount)) {
                xnVar.Tb(messageSuggestionParams);
                return;
            }
        }
        if (this.H - this.I < 0) {
            AndroidUtilities.shakeView(this.s);
            AndroidUtilities.shakeView(this.v);
            try {
                this.F0.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (MessagesController.getInstance(i10).premiumFeaturesBlocked() || MessagesController.getInstance(i10).captionLengthLimitPremium <= this.I) {
                return;
            }
            O1(p2Var);
            return;
        }
        if (this.E1 == null && (p2Var instanceof org.telegram.ui.xn)) {
            org.telegram.ui.xn xnVar2 = (org.telegram.ui.xn) p2Var;
            if (xnVar2.c()) {
                z4.M(getContext(), xnVar2.a(), new tg(this, 12), this.resourcesProvider);
                return;
            }
        }
        di diVar = this.v0;
        if (diVar == this.g0 || diVar == this.n0) {
            G1(0, true, 0, s1(), this.K0);
            return;
        }
        if (diVar.H(0, true, 0, s1(), this.K0)) {
            return;
        }
        this.x2 = true;
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        if (this.v0.n() || isDismissed()) {
            return;
        }
        qh qhVar = this.B0;
        if (qhVar != null) {
            AndroidUtilities.hideKeyboard(qhVar.getEditText());
        }
        th thVar = this.M0;
        if (thVar != null) {
            AndroidUtilities.hideKeyboard(thVar.getEditText());
        }
        this.u0.clear();
        org.telegram.ui.ActionBar.p2 p2Var = this.c0;
        if (p2Var == null) {
            p2Var = LaunchActivity.R();
        }
        if (!this.x2 && p2Var != null && this.v0.getSelectedItemsCount() > 0 && !this.C) {
            if (this.w2) {
                return;
            }
            this.w2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new tg(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new zg(this, 0));
            b1 b1Var = new b1(this, 4);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.K = b1Var;
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
            di[] diVarArr = this.t0;
            if (i10 >= diVarArr.length) {
                break;
            }
            di diVar = diVarArr[i10];
            if (diVar != null && this.v0 != diVar) {
                diVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.a7), 0), true, (AndroidUtilities.IntColorCallback) new tg(this, 11));
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
        this.f2 = false;
        super.dismiss();
        this.x2 = false;
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }

    public li(Activity activity, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10) {
        this(activity, p2Var, z4, z10, true, null);
    }
}

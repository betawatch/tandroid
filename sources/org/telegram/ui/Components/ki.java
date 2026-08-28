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
import org.telegram.ui.fi1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ki extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.z2, td.b {
    public static final /* synthetic */ int K2 = 0;
    public final i0 A;
    public final qh A0;
    public final j6 A1;
    public final ng.d A2;
    public boolean B;
    public final ImageView B0;
    public float B1;
    public final ng.c B2;
    public boolean C;
    public final int[] C0;
    public int C1;
    public final ig.a C2;
    public boolean D;
    public final mh D0;
    public MessageObject D1;
    public final ig.a D2;
    public int E;
    public final vh E0;
    public boolean E1;
    public final ah E2;
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
    public final fh.v K0;
    public boolean K1;
    public boolean L;
    public final th L0;
    public boolean L1;
    public c40 M;
    public int M0;
    public boolean M1;
    public boolean N;
    public ct N0;
    public boolean N1;
    public final yc0 O;
    public boolean O0;
    public int O1;
    public ln P;
    public boolean P0;
    public boolean P1;
    public e40 Q;
    public boolean Q0;
    public boolean Q1;
    public boolean R;
    public final float R0;
    public float R1;
    public boolean S;
    public long S0;
    public float S1;
    public wj T;
    public final r7 T0;
    public ValueAnimator T1;
    public si U;
    public AnimatorSet U0;
    public int U1;
    public long V;
    public AnimatorSet V0;
    public ii V1;
    public boolean W;
    public final org.telegram.ui.ActionBar.w0 W0;
    public vm W1;
    public final ig.b X;
    public final kh.v X0;
    public final int[] X1;
    public boolean Y;
    public final org.telegram.ui.ActionBar.w0 Y0;
    public int Y1;
    public float Z;
    public kh.x3 Z0;
    public float Z1;
    public final yh a0;
    public final org.telegram.ui.ActionBar.w0 a1;
    public float a2;
    public final td.a b;
    public final org.telegram.ui.ActionBar.o2 b0;
    public final bh.e b1;
    public boolean b2;
    public final td.a c;
    public final boolean c0;
    public float c1;
    public float c2;
    public final td.a d;
    public cf d0;
    public float d1;
    public final boolean d2;
    public final td.a e;
    public boolean e0;
    public final mh e1;
    public boolean e2;
    public final td.a f;
    public final ChatAttachAlertPhotoLayout f0;
    public final TextView f1;
    public final ArrayList f2;
    public pj g0;
    public final org.telegram.ui.ActionBar.w0 g1;
    public final Rect g2;
    public final td.a h;
    public vi h0;
    public final LinearLayout h1;
    public float h2;
    public jn i0;
    public final ImageView i1;
    public boolean i2;
    public jn j0;
    public final LinearLayout j1;
    public int j2;
    public xk k0;
    public final TextView k1;
    public final yh k2;
    public fk l0;
    public float l1;
    public o1.j l2;
    public hm m0;
    public boolean m1;
    public AnimatorSet m2;
    public final td.j n;
    public yi n0;
    public final ai n1;
    public boolean n2;
    public pf.e0 o0;
    public boolean o1;
    public boolean o2;
    public gk p0;
    public Object p1;
    public sk p2;
    public gk q0;
    public boolean q1;
    public boolean q2;
    public org.telegram.ui.on r;
    public qh.p r0;
    public final rg.f r1;
    public boolean r2;
    public final j6 s;
    public final ci[] s0;
    public final oh s1;
    public File s2;
    public final LongSparseArray t0;
    public final mh t1;
    public double[] t2;
    public ci u0;
    public final nh u1;
    public boolean u2;
    public final j6 v;
    public ci v0;
    public final f2.m0 v1;
    public boolean v2;
    public final ImageView w;
    public final kg.d w0;
    public final hi w1;
    public boolean w2;
    public final i0 x;
    public final kg.d x0;
    public boolean x1;
    public kh.i x2;
    public final ImageView y;
    public final ph y0;
    public final RadialProgressView y1;
    public final ig.e y2;
    public final mh z0;
    public boolean z1;
    public final ng.d z2;

    public ki(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        org.telegram.ui.ActionBar.w0 w0Var;
        TextPaint textPaint;
        float f10;
        bh.e eVar;
        gr grVar = gr.h;
        this.b = new td.a(0, this, grVar, 380L, false);
        this.c = new td.a(1, this, grVar, 380L, false);
        this.d = new td.a(2, this, grVar, 380L, false);
        this.e = new td.a(3, this, grVar, 380L, false);
        this.f = new td.a(4, this, grVar, 380L, true);
        this.h = new td.a(5, this, grVar, 320L, false);
        td.j jVar = new td.j(new tg(this, 1), grVar, 380L);
        this.n = jVar;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.Z = 0.0f;
        this.a0 = new yh(this, 0);
        this.e0 = false;
        ci[] ciVarArr = new ci[11];
        this.s0 = ciVarArr;
        this.t0 = new LongSparseArray();
        this.C0 = new int[2];
        TextPaint textPaint2 = new TextPaint(1);
        this.F0 = textPaint2;
        this.G0 = new RectF();
        this.H0 = new Paint(1);
        this.Q0 = true;
        this.R0 = 1.0f;
        this.x1 = false;
        this.z1 = false;
        int i9 = UserConfig.selectedAccount;
        this.F1 = i9;
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
        this.k2 = new yh(this, 1);
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
        ng.c cVar = new ng.c();
        this.B2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        int i10 = 8;
        if (Build.VERSION.SDK_INT >= 31) {
            this.y2 = new ig.e(false);
            ng.d dVar = new ng.d(null);
            this.A2 = dVar;
            dVar.i(new n5.e0(this, i10));
            ng.d dVar2 = new ng.d(null);
            this.z2 = dVar2;
            dVar2.i(new n2.p(this, i10));
            ig.a aVar = new ig.a(dVar);
            this.C2 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            ig.a aVar2 = new ig.a(dVar2);
            this.D2 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
        } else {
            this.y2 = null;
            this.z2 = null;
            this.A2 = null;
            this.C2 = new ig.a(cVar);
            this.D2 = new ig.a(cVar);
        }
        ig.a aVar3 = new ig.a(cVar);
        this.E2 = new ah(this, 0);
        this.d2 = z10;
        this.c0 = (o2Var instanceof org.telegram.ui.qn) && o2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.b0 = o2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        ai aiVar = new ai(this, context);
        this.n1 = aiVar;
        aiVar.setDelegate(new bi(this));
        this.containerView = aiVar;
        aiVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        r7 r7Var = new r7(this, context, b6Var, 1);
        this.T0 = r7Var;
        r7Var.O0 = true;
        r7Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        r7Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        int i12 = org.telegram.ui.ActionBar.f6.j5;
        r7Var.C(getThemedColor(i12), false);
        int i13 = org.telegram.ui.ActionBar.f6.I5;
        r7Var.A(getThemedColor(i13), false);
        r7Var.setTitleColor(getThemedColor(i12));
        r7Var.setOccupyStatusBar(true);
        r7Var.setAlpha(0.0f);
        r7Var.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, 3));
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, b6Var);
        this.W0 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.ic_ab_other);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        final int i14 = 4;
        w0Var2.setVisibility(4);
        w0Var2.setAlpha(0.0f);
        w0Var2.setScaleX(0.6f);
        w0Var2.setScaleY(0.6f);
        w0Var2.setSubMenuOpenSide(2);
        w0Var2.setDelegate(new tg(this, 8));
        w0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        w0Var2.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i13), 6, -1));
        w0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mh.g4 g4Var;
                switch (i14) {
                    case 0:
                        ki kiVar = this.b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        boolean z13 = kiVar2.Y;
                        if (!z13) {
                            kiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z14 = kiVar3.Y;
                        if (z14) {
                            kiVar3.H1(!z14, true);
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
                        ki.s(this.b);
                        break;
                    case 6:
                        ci ciVar = this.b.u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ki kiVar4 = this.b;
                        kiVar4.Z1(kiVar4.u0 != kiVar4.m0);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, b6Var);
        this.Y0 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        kh.v vVar = new kh.v();
        this.X0 = vVar;
        w0Var3.setIcon(vVar);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var3.setVisibility(8);
        w0Var3.setAlpha(0.0f);
        w0Var3.setScaleX(0.6f);
        w0Var3.setScaleY(0.6f);
        w0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        w0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        w0Var3.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i13), 6, -1));
        final int i15 = 5;
        w0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mh.g4 g4Var;
                switch (i15) {
                    case 0:
                        ki kiVar = this.b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        boolean z13 = kiVar2.Y;
                        if (!z13) {
                            kiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z14 = kiVar3.Y;
                        if (z14) {
                            kiVar3.H1(!z14, true);
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
                        ki.s(this.b);
                        break;
                    case 6:
                        ci ciVar = this.b.u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ki kiVar4 = this.b;
                        kiVar4.Z1(kiVar4.u0 != kiVar4.m0);
                        break;
                }
            }
        });
        bh.e eVar2 = new bh.e(this, context);
        eVar2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
        eVar2.setText(LocaleController.getString(R.string.Create));
        eVar2.setTypeface(AndroidUtilities.bold());
        eVar2.setTextSize(1, 14.0f);
        eVar2.setVisibility(4);
        eVar2.setAlpha(0.0f);
        eVar2.setGravity(17);
        eVar2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        eVar2.setTranslationX(-AndroidUtilities.dp(12.0f));
        final int i16 = 6;
        eVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mh.g4 g4Var;
                switch (i16) {
                    case 0:
                        ki kiVar = this.b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        boolean z13 = kiVar2.Y;
                        if (!z13) {
                            kiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z14 = kiVar3.Y;
                        if (z14) {
                            kiVar3.H1(!z14, true);
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
                        ki.s(this.b);
                        break;
                    case 6:
                        ci ciVar = this.b.u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ki kiVar4 = this.b;
                        kiVar4.Z1(kiVar4.u0 != kiVar4.m0);
                        break;
                }
            }
        });
        g7.g6.a(eVar2);
        this.b1 = eVar2;
        W1();
        if (o2Var != null) {
            textPaint = textPaint2;
            w0Var = w0Var3;
            eVar = eVar2;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, b6Var);
            this.a1 = w0Var4;
            w0Var4.setLongClickEnabled(false);
            w0Var4.setIcon(R.drawable.outline_header_search);
            w0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            w0Var4.setVisibility(4);
            w0Var4.setAlpha(0.0f);
            w0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            w0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i13), 6, -1));
            w0Var4.setOnClickListener(new ih.b2(5, this, z11));
        } else {
            w0Var = w0Var3;
            textPaint = textPaint2;
            f10 = 14.0f;
            eVar = eVar2;
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i12), false, b6Var);
        this.g1 = w0Var5;
        w0Var5.setLongClickEnabled(false);
        w0Var5.setIcon(R.drawable.ic_ab_other);
        w0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var5.setVisibility(8);
        w0Var5.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i13), 3, -1));
        final int i17 = 2;
        w0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        final ki kiVar = this.b;
                        qh qhVar = kiVar.A0;
                        if (qhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(kiVar.getContext(), b6Var);
                            e0Var.l0(qhVar.getText());
                            final int i18 = 0;
                            e0Var.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.bh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i18) {
                                        case 0:
                                            qh qhVar2 = kiVar.A0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            th thVar = kiVar.L0;
                                            thVar.setText(charSequence);
                                            thVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = kiVar.V;
                            boolean z13 = kiVar.D1 != null;
                            ch chVar = new ch(kiVar, 0);
                            e0Var.h0 = j10;
                            e0Var.i0 = z13;
                            e0Var.j0 = chVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ki kiVar2 = this.b;
                        th thVar = kiVar2.L0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(kiVar2.getContext(), b6Var);
                            e0Var2.l0(thVar.getText());
                            final int i19 = 1;
                            e0Var2.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.bh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i19) {
                                        case 0:
                                            qh qhVar2 = kiVar2.A0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            th thVar2 = kiVar2.L0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = kiVar2.V;
                            boolean z14 = kiVar2.D1 != null;
                            ch chVar2 = new ch(kiVar2, 1);
                            e0Var2.h0 = j11;
                            e0Var2.i0 = z14;
                            e0Var2.j0 = chVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ki kiVar3 = this.b;
                        kiVar3.g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar3.b0;
                        t12.K2(null, o2Var2, b6Var);
                        PhotoViewer.t1().L2(kiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i20 = kiVar3.O1;
                        boolean z15 = kiVar3.P1;
                        t13.h = i20;
                        t13.n = z15;
                        if (!kiVar3.V1.j()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(kiVar3.getContainer().findFocus());
                        }
                        File w8 = kh.a8.w(kiVar3.F1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i21 = point.x;
                        int i22 = point.y;
                        if (i21 > 1080 || i22 > 1080) {
                            float min = Math.min(i21, i22) / 1080.0f;
                            i21 = (int) (i21 * min);
                            i22 = (int) (i22 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i21, i22, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w8));
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w8.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new lh(kiVar3, photoEntry), o2Var2 instanceof org.telegram.ui.qn ? (org.telegram.ui.qn) o2Var2 : null);
                        if (kiVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, kiVar3.F);
                            break;
                        }
                        break;
                }
            }
        });
        w0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        w0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        final int i18 = 7;
        w0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mh.g4 g4Var;
                switch (i18) {
                    case 0:
                        ki kiVar = this.b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        boolean z13 = kiVar2.Y;
                        if (!z13) {
                            kiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z14 = kiVar3.Y;
                        if (z14) {
                            kiVar3.H1(!z14, true);
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
                        ki.s(this.b);
                        break;
                    case 6:
                        ci ciVar = this.b.u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ki kiVar4 = this.b;
                        kiVar4.Z1(kiVar4.u0 != kiVar4.m0);
                        break;
                }
            }
        });
        mh mhVar = new mh(this, context, 0);
        this.e1 = mhVar;
        final int i19 = 8;
        mhVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mh.g4 g4Var;
                switch (i19) {
                    case 0:
                        ki kiVar = this.b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        boolean z13 = kiVar2.Y;
                        if (!z13) {
                            kiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z14 = kiVar3.Y;
                        if (z14) {
                            kiVar3.H1(!z14, true);
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
                        ki.s(this.b);
                        break;
                    case 6:
                        ci ciVar = this.b.u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ki kiVar4 = this.b;
                        kiVar4.Z1(kiVar4.u0 != kiVar4.m0);
                        break;
                }
            }
        });
        mhVar.setAlpha(0.0f);
        mhVar.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.h1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f1 = textView;
        textView.setTextColor(getThemedColor(i12));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, g7.e6.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.i1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, g7.e6.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        mhVar.addView(linearLayout, g7.e6.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.j1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, g7.e6.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.k1 = textView2;
        textView2.setTextColor(getThemedColor(i12));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, g7.e6.q(-2, -2, 16));
        mhVar.addView(linearLayout2, g7.e6.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, b6Var);
        this.f0 = chatAttachAlertPhotoLayout;
        ciVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.u0 = chatAttachAlertPhotoLayout;
        this.S0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, g7.e6.c(-1.0f, -1));
        rg.f fVar = new rg.f(context);
        this.r1 = fVar;
        fVar.setup(aVar3);
        fVar.setFadeTopAlpha(0);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(fVar, g7.e6.g());
        this.containerView.addView(mhVar, g7.e6.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        fh.v vVar2 = new fh.v(context);
        this.K0 = vVar2;
        this.containerView.addView(vVar2, g7.e6.e(-1, -2, 55));
        this.containerView.addView(r7Var, g7.e6.c(-2.0f, -1));
        this.containerView.addView(w0Var2, g7.e6.e(48, 48, 53));
        this.containerView.addView(w0Var, g7.e6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var6 = this.a1;
        if (w0Var6 != null) {
            this.containerView.addView(w0Var6, g7.e6.e(48, 48, 53));
        }
        mhVar.addView(w0Var5, g7.e6.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(eVar, g7.e6.e(-2, 48, 53));
        mh mhVar2 = new mh(this, context, 1);
        this.t1 = mhVar2;
        nh nhVar = new nh(context, 0);
        this.u1 = nhVar;
        nhVar.setClipChildren(true);
        nhVar.setClipToPadding(false);
        hi hiVar = new hi(this, context);
        this.w1 = hiVar;
        nhVar.setAdapter(hiVar);
        f2.m0 m0Var = new f2.m0(0, false);
        this.v1 = m0Var;
        nhVar.setLayoutManager(m0Var);
        nhVar.setVerticalScrollBarEnabled(false);
        nhVar.setHorizontalScrollBarEnabled(false);
        nhVar.setItemAnimator(null);
        nhVar.setLayoutAnimation(null);
        nhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.f6.A5));
        nhVar.v2 = true;
        nhVar.setOverScrollMode(2);
        ig.a aVar4 = this.C2;
        pg.i iVar = new pg.i(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = iVar;
        aVar4.e = viewGroup2;
        ig.a aVar5 = this.D2;
        pg.i iVar2 = new pg.i(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = iVar2;
        aVar5.e = viewGroup3;
        pg.i iVar3 = new pg.i(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        aVar3.d = iVar3;
        aVar3.e = viewGroup4;
        oh ohVar = new oh(this, context, 0);
        this.s1 = ohVar;
        ig.b bVar = new ig.b(aVar3.c(ohVar, null, false));
        this.X = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(ohVar, g7.e6.g());
        kg.d c10 = this.C2.c(mhVar2, mg.c.f(b6Var), false);
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(7.0f));
        mhVar2.setBackground(c10);
        nhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        nhVar.setClipToOutline(true);
        int dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(28.0f);
        bg.q1 q1Var = ff.r0.a;
        nhVar.setOutlineProvider(new ff.q0(dp, dp2));
        nhVar.setImportantForAccessibility(1);
        mhVar2.addView(nhVar, g7.e6.g());
        this.containerView.addView(mhVar2, g7.e6.e(-1, 70, 81));
        nhVar.setOnItemClickListener(new bg.b1(11, this, b6Var));
        nhVar.setOnItemLongClickListener(new tg(this, 3));
        final int i20 = 0;
        j6 j6Var = new j6(context, true, false, true);
        this.A1 = j6Var;
        j6Var.setVisibility(8);
        j6Var.setAlpha(0.0f);
        j6Var.setGravity(17);
        j6Var.setTypeface(AndroidUtilities.bold());
        int dp3 = AndroidUtilities.dp(16.0f);
        j6Var.setPadding(dp3, 0, dp3, 0);
        j6Var.setTextSize(AndroidUtilities.dp(f10));
        j6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mh.g4 g4Var;
                switch (i20) {
                    case 0:
                        ki kiVar = this.b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        boolean z13 = kiVar2.Y;
                        if (!z13) {
                            kiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z14 = kiVar3.Y;
                        if (z14) {
                            kiVar3.H1(!z14, true);
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
                        ki.s(this.b);
                        break;
                    case 6:
                        ci ciVar = this.b.u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ki kiVar4 = this.b;
                        kiVar4.Z1(kiVar4.u0 != kiVar4.m0);
                        break;
                }
            }
        });
        this.containerView.addView(j6Var, g7.e6.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.y1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, g7.e6.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.B0 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.f6.z6);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i21 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mh.g4 g4Var;
                switch (i21) {
                    case 0:
                        ki kiVar = this.b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        boolean z13 = kiVar2.Y;
                        if (!z13) {
                            kiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z14 = kiVar3.Y;
                        if (z14) {
                            kiVar3.H1(!z14, true);
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
                        ki.s(this.b);
                        break;
                    case 6:
                        ci ciVar = this.b.u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ki kiVar4 = this.b;
                        kiVar4.Z1(kiVar4.u0 != kiVar4.m0);
                        break;
                }
            }
        });
        mh mhVar3 = new mh(this, context, 2);
        this.z0 = mhVar3;
        ph phVar = new ph(this, context);
        this.y0 = phVar;
        mhVar3.addView(phVar, g7.e6.e(-1, -1, 119));
        kg.d c11 = this.D2.c(aiVar, mg.c.m(b6Var), false);
        this.w0 = c11;
        c11.k = true;
        c11.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.t(AndroidUtilities.dp(32.0f));
        c11.h.g = 0.4f;
        c11.j();
        kg.d c12 = this.C2.c(phVar, mg.c.m(b6Var), false);
        this.x0 = c12;
        c12.p(AndroidUtilities.dp(22.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        phVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        mhVar3.setWillNotDraw(false);
        mhVar3.setVisibility(4);
        mhVar3.setAlpha(0.0f);
        this.containerView.addView(mhVar3, g7.e6.e(-1, -2, 83));
        mhVar3.setOnTouchListener(new jh.d(13));
        j6 j6Var2 = new j6(context, false, false, false);
        this.s = j6Var2;
        j6Var2.setAllowCancel(true);
        j6Var2.setScaleProperty(0.6f);
        j6Var2.setVisibility(8);
        j6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i22 = org.telegram.ui.ActionBar.f6.y6;
        j6Var2.setTextColor(getThemedColor(i22));
        j6Var2.setTypeface(AndroidUtilities.bold());
        j6Var2.setGravity(17);
        phVar.addView(j6Var2, g7.e6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.w = imageView4;
        i0 i0Var = new i0(context);
        this.x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i23 = org.telegram.ui.ActionBar.f6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i23), mode));
        int i24 = org.telegram.ui.ActionBar.f6.i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i24), 1, AndroidUtilities.dp(16.0f)));
        phVar.addView(imageView4, g7.e6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        g7.g6.a(imageView4);
        final int i25 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i25) {
                    case 0:
                        final ki kiVar = this.b;
                        qh qhVar = kiVar.A0;
                        if (qhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(kiVar.getContext(), b6Var);
                            e0Var.l0(qhVar.getText());
                            final int i182 = 0;
                            e0Var.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.bh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i182) {
                                        case 0:
                                            qh qhVar2 = kiVar.A0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            th thVar2 = kiVar.L0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = kiVar.V;
                            boolean z13 = kiVar.D1 != null;
                            ch chVar = new ch(kiVar, 0);
                            e0Var.h0 = j10;
                            e0Var.i0 = z13;
                            e0Var.j0 = chVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ki kiVar2 = this.b;
                        th thVar = kiVar2.L0;
                        if (thVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(kiVar2.getContext(), b6Var);
                            e0Var2.l0(thVar.getText());
                            final int i192 = 1;
                            e0Var2.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.bh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            qh qhVar2 = kiVar2.A0;
                                            qhVar2.setText(charSequence);
                                            qhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            th thVar2 = kiVar2.L0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = kiVar2.V;
                            boolean z14 = kiVar2.D1 != null;
                            ch chVar2 = new ch(kiVar2, 1);
                            e0Var2.h0 = j11;
                            e0Var2.i0 = z14;
                            e0Var2.j0 = chVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ki kiVar3 = this.b;
                        kiVar3.g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar3.b0;
                        t12.K2(null, o2Var2, b6Var);
                        PhotoViewer.t1().L2(kiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i202 = kiVar3.O1;
                        boolean z15 = kiVar3.P1;
                        t13.h = i202;
                        t13.n = z15;
                        if (!kiVar3.V1.j()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(kiVar3.getContainer().findFocus());
                        }
                        File w8 = kh.a8.w(kiVar3.F1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i212 = point.x;
                        int i222 = point.y;
                        if (i212 > 1080 || i222 > 1080) {
                            float min = Math.min(i212, i222) / 1080.0f;
                            i212 = (int) (i212 * min);
                            i222 = (int) (i222 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i212, i222, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w8));
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w8.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new lh(kiVar3, photoEntry), o2Var2 instanceof org.telegram.ui.qn ? (org.telegram.ui.qn) o2Var2 : null);
                        if (kiVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, kiVar3.F);
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
        qh qhVar = new qh(this, context, aiVar, b6Var);
        this.A0 = qhVar;
        qhVar.F = true;
        qhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        qhVar.s();
        qhVar.getEditText().setLayoutParams(g7.e6.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        qhVar.getEditText().addTextChangedListener(new sh(this));
        phVar.addView(qhVar, g7.e6.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        phVar.setClipChildren(false);
        mhVar3.setClipChildren(false);
        qhVar.setClipChildren(false);
        vVar2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        vVar2.setWillNotDraw(false);
        th thVar = new th(this, context, aiVar, b6Var);
        this.L0 = thVar;
        thVar.F = true;
        thVar.getEditText().addTextChangedListener(new uh(this, o2Var));
        thVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        thVar.getEditText().setLayoutParams(g7.e6.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        thVar.getEditText().setTextSize(1, 17.0f);
        thVar.getEmojiButton().setLayoutParams(g7.e6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        thVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        vVar2.addView(thVar, g7.e6.e(-1, -2, 119));
        vVar2.setAlpha(0.0f);
        vVar2.setVisibility(8);
        qhVar.addView(imageView3, g7.e6.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        kg.d c13 = this.C2.c(vVar2, mg.c.m(b6Var), false);
        c13.p(AndroidUtilities.dp(22.0f));
        c13.o(AndroidUtilities.dp(7.0f));
        vVar2.setBackground(c13);
        vVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        j6 j6Var3 = new j6(context, false, false, false);
        this.v = j6Var3;
        j6Var3.setScaleProperty(0.6f);
        j6Var3.setVisibility(8);
        j6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var3.setTextColor(getThemedColor(i22));
        j6Var3.setTypeface(AndroidUtilities.bold());
        j6Var3.setGravity(17);
        j6Var3.setAllowCancel(true);
        vVar2.addView(j6Var3, g7.e6.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.Xd), mode2));
        thVar.addView(imageView5, g7.e6.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i26 = 2;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mh.g4 g4Var;
                switch (i26) {
                    case 0:
                        ki kiVar = this.b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        boolean z13 = kiVar2.Y;
                        if (!z13) {
                            kiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z14 = kiVar3.Y;
                        if (z14) {
                            kiVar3.H1(!z14, true);
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
                        ki.s(this.b);
                        break;
                    case 6:
                        ci ciVar = this.b.u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ki kiVar4 = this.b;
                        kiVar4.Z1(kiVar4.u0 != kiVar4.m0);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.y = imageView6;
        i0 i0Var2 = new i0(context);
        this.A = i0Var2;
        imageView6.setImageDrawable(i0Var2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i23), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i24), 1, AndroidUtilities.dp(16.0f)));
        vVar2.addView(imageView6, g7.e6.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        g7.g6.a(imageView6);
        final int i27 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i27) {
                    case 0:
                        final ki kiVar = this.b;
                        qh qhVar2 = kiVar.A0;
                        if (qhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(kiVar.getContext(), b6Var);
                            e0Var.l0(qhVar2.getText());
                            final int i182 = 0;
                            e0Var.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.bh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i182) {
                                        case 0:
                                            qh qhVar22 = kiVar.A0;
                                            qhVar22.setText(charSequence);
                                            qhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            th thVar2 = kiVar.L0;
                                            thVar2.setText(charSequence);
                                            thVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = kiVar.V;
                            boolean z13 = kiVar.D1 != null;
                            ch chVar = new ch(kiVar, 0);
                            e0Var.h0 = j10;
                            e0Var.i0 = z13;
                            e0Var.j0 = chVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final ki kiVar2 = this.b;
                        th thVar2 = kiVar2.L0;
                        if (thVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(kiVar2.getContext(), b6Var);
                            e0Var2.l0(thVar2.getText());
                            final int i192 = 1;
                            e0Var2.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.bh
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i192) {
                                        case 0:
                                            qh qhVar22 = kiVar2.A0;
                                            qhVar22.setText(charSequence);
                                            qhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            th thVar22 = kiVar2.L0;
                                            thVar22.setText(charSequence);
                                            thVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = kiVar2.V;
                            boolean z14 = kiVar2.D1 != null;
                            ch chVar2 = new ch(kiVar2, 1);
                            e0Var2.h0 = j11;
                            e0Var2.i0 = z14;
                            e0Var2.j0 = chVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        ki kiVar3 = this.b;
                        kiVar3.g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar3.b0;
                        t12.K2(null, o2Var2, b6Var);
                        PhotoViewer.t1().L2(kiVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i202 = kiVar3.O1;
                        boolean z15 = kiVar3.P1;
                        t13.h = i202;
                        t13.n = z15;
                        if (!kiVar3.V1.j()) {
                            AndroidUtilities.hideKeyboard(o2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(kiVar3.getContainer().findFocus());
                        }
                        File w8 = kh.a8.w(kiVar3.F1, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i212 = point.x;
                        int i222 = point.y;
                        if (i212 > 1080 || i222 > 1080) {
                            float min = Math.min(i212, i222) / 1080.0f;
                            i212 = (int) (i212 * min);
                            i222 = (int) (i222 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i212, i222, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w8));
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w8.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new lh(kiVar3, photoEntry), o2Var2 instanceof org.telegram.ui.qn ? (org.telegram.ui.qn) o2Var2 : null);
                        if (kiVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, kiVar3.F);
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
        this.D0 = mhVar4;
        mhVar4.setFocusable(true);
        mhVar4.setFocusableInTouchMode(true);
        mhVar4.setVisibility(4);
        mhVar4.setScaleX(0.2f);
        mhVar4.setScaleY(0.2f);
        mhVar4.setAlpha(0.0f);
        mhVar4.setClipChildren(false);
        mhVar4.setClipToPadding(false);
        this.containerView.addView(mhVar4, g7.e6.e(110, 50, 85));
        vh vhVar = new vh(R.drawable.send_plane_24, context, b6Var, this);
        this.E0 = vhVar;
        vhVar.setImportantForAccessibility(2);
        mhVar4.addView(vhVar, g7.e6.e(-1, -1, 119));
        vhVar.setTranslationX(this.backgroundPaddingLeft);
        int dp4 = AndroidUtilities.dp(52.0f);
        int dp5 = AndroidUtilities.dp(38.0f);
        vhVar.E = dp4;
        vhVar.F = dp5;
        float dp6 = AndroidUtilities.dp(7.0f);
        float dp7 = AndroidUtilities.dp(6.0f);
        vhVar.I = dp6;
        vhVar.J = dp7;
        vhVar.d0 = true;
        final int i28 = 3;
        vhVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xg
            public final /* synthetic */ ki b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mh.g4 g4Var;
                switch (i28) {
                    case 0:
                        ki kiVar = this.b;
                        long j10 = kiVar.S0;
                        if (j10 < 0 && (g4Var = (mh.g4) kiVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.y0 webViewContainer = g4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ki kiVar2 = this.b;
                        boolean z13 = kiVar2.Y;
                        if (!z13) {
                            kiVar2.H1(!z13, true);
                            break;
                        }
                        break;
                    case 2:
                        ki kiVar3 = this.b;
                        boolean z14 = kiVar3.Y;
                        if (z14) {
                            kiVar3.H1(!z14, true);
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
                        ki.s(this.b);
                        break;
                    case 6:
                        ci ciVar = this.b.u0;
                        if (ciVar != null) {
                            ciVar.t(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        ki kiVar4 = this.b;
                        kiVar4.Z1(kiVar4.u0 != kiVar4.m0);
                        break;
                }
            }
        });
        vhVar.setOnLongClickListener(new org.telegram.ui.wf(this, context, b6Var, o2Var, 1));
        TextPaint textPaint3 = textPaint;
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        oh ohVar2 = new oh(this, context, 1);
        ohVar2.setAlpha(0.0f);
        ohVar2.setScaleX(0.2f);
        ohVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        fk0 fastScroll = chatAttachAlertPhotoLayout.A.getFastScroll();
        ig.a aVar6 = this.C2;
        lg.d m10 = mg.c.m(b6Var);
        wk0 wk0Var = fastScroll.k0;
        kg.d c14 = aVar6.c(wk0Var.b1, m10, false);
        fastScroll.a0 = c14;
        c14.o(AndroidUtilities.dp(4.0f));
        fastScroll.a0.p(AndroidUtilities.dp(24.0f));
        kg.d c15 = aVar6.c(wk0Var.b1, m10, false);
        fastScroll.b0 = c15;
        c15.o(AndroidUtilities.dp(6.0f));
        fastScroll.b0.t(AndroidUtilities.dp(4.0f));
        fastScroll.b0.p(AndroidUtilities.dp(f10));
        yc0 yc0Var = new yc0(context);
        this.O = yc0Var;
        this.containerView.addView(yc0Var, g7.e6.c(-1.0f, -1));
        lg.d dVar3 = new lg.d(b6Var);
        dVar3.e = new tg(this, 4);
        dVar3.c = new tg(this, 5);
        dVar3.d = new tg(this, 6);
        dVar3.b = new tg(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.n = dpf2;
        dVar3.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f = dpf23;
        dVar3.h = dpf24;
        r7Var.L(this.C2, dVar3, false);
        jVar.i(1L, false);
    }

    public static void L(ki kiVar) {
        int i9;
        r7 r7Var = kiVar.T0;
        rg.f fVar = kiVar.r1;
        if (fVar == null || r7Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.b6 b6Var = kiVar.resourcesProvider;
        boolean a2 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
        if (r7Var.getVisibility() == 0) {
            i9 = (int) (r7Var.getAlpha() * (a2 ? 255 : 160));
        } else {
            i9 = 0;
        }
        fVar.setFadeTopAlpha(i9);
    }

    public static void P(ki kiVar) {
        kh.i iVar = new kh.i(kiVar, kiVar.getContext(), kiVar.V, LaunchActivity.R(), kiVar.resourcesProvider, 1);
        kiVar.x2 = iVar;
        iVar.p(new m5.c0(kiVar, 13));
        ViewGroup viewGroup = kiVar.containerView;
        viewGroup.addView(kiVar.x2, viewGroup.indexOfChild(kiVar.z0), g7.e6.e(-1, -1, 83));
        kh.i iVar2 = kiVar.x2;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            iVar2.getAdapter().i0 = false;
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
            of.f1 adapter = iVar2.getAdapter();
            qnVar.i();
            TLRPC.Chat chat = qnVar.e;
            adapter.getClass();
            adapter.h0 = chat;
            iVar2.getAdapter().W(qnVar.V7);
            iVar2.getAdapter().a0 = qnVar.e != null;
        } else {
            iVar2.getAdapter().i0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().a0 = false;
        }
        iVar2.getAdapter().b0 = false;
        kiVar.U1();
    }

    public static /* synthetic */ void m(ki kiVar, ValueAnimator valueAnimator) {
        kiVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.d3 d3Var = kiVar.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
    }

    public static /* synthetic */ void n(ki kiVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.z2 z2Var) {
        kiVar.currentSheetAnimation = null;
        kiVar.l2 = null;
        animationNotificationsLocker.unlock();
        kiVar.currentSheetAnimationType = 0;
        if (z2Var != null) {
            z2Var.onOpenAnimationEnd();
        }
        if (kiVar.useHardwareLayer) {
            kiVar.container.setLayerType(0, null);
        }
        if (kiVar.isFullscreen) {
            WindowManager.LayoutParams attributes = kiVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            kiVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static /* synthetic */ void o(ki kiVar, int i9) {
        kiVar.navBarColorKey = -1;
        kiVar.navBarColor = i9;
        kiVar.containerView.invalidate();
    }

    public static void p(ki kiVar) {
        o1.j jVar = kiVar.l2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(kiVar.containerView, o1.h.n, 0.0f);
        kiVar.l2 = jVar2;
        jVar2.u.a(1.5f);
        kiVar.l2.u.b(1500.0f);
        kiVar.l2.f();
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
    public static boolean q(ki kiVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.ActionBar.o2 o2Var, View view) {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        org.telegram.ui.qn qnVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        boolean z10;
        boolean z11;
        MessageObject messageObject3;
        long j10;
        MessageObject messageObject4;
        ArrayList<Object> arrayList;
        HashMap<Object, Object> hashMap;
        int i9;
        long j11;
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor;
        int i10;
        Throwable th2;
        String str;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        long j12;
        org.telegram.ui.qn qnVar2;
        long j13;
        TLRPC.ChatFull chatFull;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        ki kiVar2 = kiVar;
        vh vhVar = kiVar2.E0;
        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar2.b0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = kiVar2.f0;
        int i12 = kiVar2.F1;
        long j14 = kiVar2.V;
        if ((j14 == 0 && !(o2Var2 instanceof org.telegram.ui.qn)) || kiVar2.G - kiVar2.H < 0 || kiVar2.h.f) {
            return false;
        }
        if (o2Var2 instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn qnVar3 = (org.telegram.ui.qn) o2Var2;
            TLRPC.User i13 = qnVar3.i();
            MessageObject messageObject5 = qnVar3.j5;
            MessageObject messageObject6 = qnVar3.g5;
            if (qnVar3.c() || qnVar3.N3 == 5) {
                return false;
            }
            messageObject2 = messageObject6;
            messageObject = messageObject5;
            qnVar = qnVar3;
            user = i13;
            j14 = qnVar3.a();
        } else {
            user = MessagesController.getInstance(i12).getUser(Long.valueOf(j14));
            messageObject = null;
            messageObject2 = null;
            qnVar = null;
        }
        cf cfVar = kiVar2.d0;
        if (cfVar != null) {
            cfVar.dismiss();
        }
        cf cfVar2 = new cf(kiVar2, context, b6Var, 1);
        kiVar2.d0 = cfVar2;
        cfVar2.r(vhVar, false, new fg.f(kiVar2, o2Var, b6Var, 21));
        ArrayList arrayList2 = new ArrayList();
        ci ciVar = kiVar2.u0;
        if (ciVar == chatAttachAlertPhotoLayout3 || ciVar == kiVar2.m0) {
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
                int i14 = 0;
                int i15 = 0;
                z10 = false;
                z11 = false;
                while (i14 < ceil) {
                    int i16 = i14 * 10;
                    MessageObject messageObject8 = messageObject7;
                    MessageObject messageObject9 = messageObject2;
                    String str3 = str2;
                    int min = Math.min(10, selectedPhotos.size() - i16);
                    HashMap<Object, Object> hashMap2 = selectedPhotos;
                    long nextLong = Utilities.random.nextLong();
                    int i17 = i15;
                    int i18 = ceil;
                    int i19 = 0;
                    while (i19 < min) {
                        int i20 = min;
                        int i21 = i16 + i19;
                        int i22 = i19;
                        if (i21 >= selectedPhotosOrder.size()) {
                            j11 = j14;
                            i9 = i14;
                            hashMap = hashMap2;
                            arrayList = selectedPhotosOrder;
                        } else {
                            HashMap<Object, Object> hashMap3 = hashMap2;
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) hashMap3.get(selectedPhotosOrder.get(i21));
                            arrayList = selectedPhotosOrder;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            int i23 = i17 + 1;
                            tL_message.id = i17;
                            hashMap = hashMap3;
                            tL_message.out = true;
                            i9 = i14;
                            tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                            tL_message.peer_id = MessagesController.getInstance(i12).getPeer(j14);
                            boolean z15 = photoEntry.isVideo;
                            if (z15 || (str = photoEntry.imagePath) == null) {
                                String str4 = photoEntry.path;
                                if (str4 != null) {
                                    tL_message.attachPath = str4;
                                }
                            } else {
                                tL_message.attachPath = str;
                            }
                            if (i20 > 0) {
                                tL_message.grouped_id = nextLong;
                            }
                            int i24 = photoEntry.width;
                            int i25 = photoEntry.height;
                            int i26 = photoEntry.orientation;
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
                                                    i10 = 0;
                                                    parcelFileDescriptor = null;
                                                    photoEntry.videoOrientation = i10;
                                                    FileLog.e(e);
                                                    if (mediaMetadataRetriever2 != null) {
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    th = th;
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
                                                        i10 = 0;
                                                        photoEntry.videoOrientation = i10;
                                                        FileLog.e(e);
                                                        if (mediaMetadataRetriever2 != null) {
                                                        }
                                                    } catch (Throwable th4) {
                                                        th2 = th4;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        th = th2;
                                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                                        if (mediaMetadataRetriever != null) {
                                                        }
                                                        if (parcelFileDescriptor == null) {
                                                        }
                                                    }
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    parcelFileDescriptor = open;
                                                } catch (Throwable th5) {
                                                    th2 = th5;
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
                                            } catch (Throwable th6) {
                                                th2 = th6;
                                                th = th2;
                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                if (mediaMetadataRetriever != null) {
                                                    try {
                                                        mediaMetadataRetriever.release();
                                                    } catch (IOException e16) {
                                                        FileLog.e(e16);
                                                    }
                                                }
                                                if (parcelFileDescriptor == null) {
                                                    throw th;
                                                }
                                                try {
                                                    parcelFileDescriptor.close();
                                                    throw th;
                                                } catch (IOException e17) {
                                                    FileLog.e(e17);
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e18) {
                                            e = e18;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                        }
                                    } catch (Exception e19) {
                                        e = e19;
                                        mediaMetadataRetriever2 = null;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        mediaMetadataRetriever = null;
                                    }
                                }
                                i26 = photoEntry.videoOrientation;
                            } else {
                                j11 = j14;
                            }
                            if ((i26 / 90) % 2 != 0) {
                                i25 = i24;
                                i24 = i25;
                            }
                            if (photoEntry.isLivePhoto()) {
                                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                                tL_message.media = tL_messageMediaPhoto;
                                tL_messageMediaPhoto.live_photo = true;
                                tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
                                TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                tL_photoSize.w = i24;
                                tL_photoSize.h = i25;
                                tL_photoSize.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                tL_message.media.photo.sizes.add(tL_photoSize);
                                tL_message.media.document = new TLRPC.TL_document();
                                tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                tL_documentAttributeVideo.w = i24;
                                tL_documentAttributeVideo.h = i25;
                                tL_documentAttributeVideo.duration = photoEntry.duration;
                                tL_message.media.document.attributes.add(tL_documentAttributeVideo);
                            } else if (photoEntry.isVideo) {
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                tL_documentAttributeVideo2.w = i24;
                                tL_documentAttributeVideo2.h = i25;
                                tL_documentAttributeVideo2.duration = photoEntry.duration;
                                tL_message.media.document.attributes.add(tL_documentAttributeVideo2);
                            } else {
                                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                                tL_message.media = tL_messageMediaPhoto2;
                                tL_messageMediaPhoto2.photo = new TLRPC.TL_photo();
                                TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                tL_photoSize2.w = i24;
                                tL_photoSize2.h = i25;
                                tL_photoSize2.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                tL_message.media.photo.sizes.add(tL_photoSize2);
                            }
                            tL_message.media.spoiler = photoEntry.hasSpoiler;
                            CharSequence charSequence = photoEntry.caption;
                            String charSequence2 = charSequence == null ? str3 : charSequence.toString();
                            tL_message.message = charSequence2;
                            if (TextUtils.isEmpty(charSequence2) && i9 == 0 && i22 == 0) {
                                CharSequence[] charSequenceArr = {kiVar2.m1().getText()};
                                MessageObject.addLinks(true, charSequenceArr[0]);
                                tL_message.entities = MediaDataController.getInstance(i12).getEntities(charSequenceArr, true);
                                tL_message.message = charSequenceArr[0].toString();
                            }
                            if (i9 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
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
                            if (i9 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
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
                            i17 = i23;
                            z10 = true;
                            z11 = true;
                        }
                        i19 = i22 + 1;
                        selectedPhotosOrder = arrayList;
                        min = i20;
                        hashMap2 = hashMap;
                        i14 = i9;
                        j14 = j11;
                    }
                    i14++;
                    ceil = i18;
                    str2 = str3;
                    messageObject2 = messageObject9;
                    selectedPhotos = hashMap2;
                    i15 = i17;
                    messageObject7 = messageObject8;
                }
                messageObject3 = messageObject7;
            }
            j10 = j14;
            messageObject4 = messageObject3;
        } else if (ciVar == kiVar2.g0) {
            if (TextUtils.isEmpty(kiVar2.m1().getText())) {
                chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                i11 = 0;
                z14 = false;
            } else {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                tL_message2.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                tL_message2.peer_id = MessagesController.getInstance(i12).getPeer(j14);
                CharSequence[] charSequenceArr2 = {kiVar2.m1().getText()};
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
            ArrayList<TLRPC.User> selected = kiVar2.g0.getSelected();
            int i27 = 0;
            while (i27 < selected.size()) {
                TLRPC.User user2 = selected.get(i27);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                int i28 = i11 + 1;
                tL_message3.id = i11;
                ArrayList<TLRPC.User> arrayList3 = selected;
                tL_message3.out = true;
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
                i27++;
                i11 = i28;
                selected = arrayList3;
                z14 = true;
            }
            messageObject4 = null;
            z10 = false;
            kiVar2 = kiVar;
            j10 = j14;
            z11 = z14;
        } else {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
            if (ciVar == kiVar2.l0) {
                messageObject4 = null;
                boolean z16 = false;
                int i29 = 0;
                for (int i30 = 0; i30 < kiVar2.l0.O.size(); i30++) {
                    String str5 = (String) kiVar2.l0.O.get(i30);
                    if (str5 != null) {
                        int lastIndexOf = str5.lastIndexOf(File.separator);
                        String substring = lastIndexOf < 0 ? str5 : str5.substring(lastIndexOf + 1);
                        if (!TextUtils.isEmpty(substring)) {
                            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                            int i31 = i29 + 1;
                            tL_message4.id = i29;
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
                            if (TextUtils.isEmpty(tL_message4.message) && i30 == 0) {
                                z12 = true;
                                z13 = false;
                                CharSequence[] charSequenceArr3 = {kiVar2.m1().getText()};
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
                            if (i30 == 0 && messageObject4 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                messageObject4 = messageObject13;
                            }
                            i29 = i31;
                            z16 = true;
                        }
                    }
                }
                j10 = j14;
                z11 = z16;
                z10 = false;
            } else {
                vi viVar = kiVar2.h0;
                if (ciVar == viVar) {
                    arrayList2.addAll(viVar.getSelected());
                    if (!arrayList2.isEmpty()) {
                        messageObject4 = (MessageObject) arrayList2.get(0);
                        CharSequence[] charSequenceArr4 = {kiVar2.m1().getText()};
                        MessageObject.addLinks(true, charSequenceArr4[0]);
                        messageObject4.messageOwner.entities = MediaDataController.getInstance(i12).getEntities(charSequenceArr4, true);
                        messageObject4.messageOwner.message = charSequenceArr4[0].toString();
                        if (!TextUtils.isEmpty(messageObject4.messageOwner.message)) {
                            messageObject4.generateCaption();
                            if (arrayList2.size() > 1) {
                                for (int i32 = 0; i32 < Math.ceil(arrayList2.size() / 10.0f); i32++) {
                                    int i33 = i32 * 10;
                                    int min2 = Math.min(10, arrayList2.size() - i33);
                                    long nextLong2 = Utilities.random.nextLong();
                                    for (int i34 = 0; i34 < min2; i34++) {
                                        int i35 = i33 + i34;
                                        if (i35 < arrayList2.size()) {
                                            ((MessageObject) arrayList2.get(i35)).messageOwner.grouped_id = nextLong2;
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
        x60 F = x60.F(kiVar2.containerView, b6Var, vhVar);
        if (messageObject4 != null) {
            ci ciVar2 = kiVar2.u0;
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (ciVar2 == chatAttachAlertPhotoLayout2 || ciVar2 == kiVar2.m0) {
                bb0 bb0Var = new bb0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), b6Var);
                TLRPC.Message message = messageObject4.messageOwner;
                boolean z17 = kiVar2.Y;
                message.invert_media = z17;
                bb0Var.a(!z17, false);
                bb0Var.setOnClickListener(new fg.f(kiVar2, messageObject4, bb0Var, 22));
                F.q(bb0Var);
                if (kiVar2.D1 == null) {
                    F.k();
                }
            }
        } else {
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        }
        boolean isUserSelf = UserObject.isUserSelf(user);
        if (kiVar2.D1 != null || ((qnVar != null && ChatObject.isMonoForum(qnVar.e)) || ((qnVar == null || !qnVar.D6()) && !kiVar2.u0.c()))) {
            j12 = j10;
        } else {
            j12 = j10;
            F.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new e5.w(kiVar2, j12, b6Var, 22), false);
        }
        ci ciVar3 = kiVar2.u0;
        if ((ciVar3 == chatAttachAlertPhotoLayout2 || ciVar3 == kiVar2.m0) && ciVar3.getSelectedItemsCount() == 1 && qnVar != null && ChatObject.isMonoForum(qnVar.e)) {
            qnVar2 = qnVar;
            j13 = j12;
            F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new org.telegram.messenger.lg(kiVar2, j12, qnVar2, b6Var, 4), false);
        } else {
            j13 = j12;
            qnVar2 = qnVar;
        }
        if (kiVar2.D1 == null && !isUserSelf) {
            F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new wg(kiVar2, 1), false);
        }
        if (kiVar2.D1 == null && z10 && qnVar2 != null && ChatObject.isChannelAndNotMegaGroup(qnVar2.e) && (chatFull = qnVar2.V7) != null && chatFull.paid_media_allowed) {
            F.c(R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton), null, false);
            org.telegram.ui.ActionBar.g1 y10 = F.y();
            y10.setOnClickListener(new fh.g4(kiVar2, context, y10, b6Var, 13));
            long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
            if (starsPrice > 0) {
                y10.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                y10.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                y10.setText(LocaleController.getString(R.string.PaidMediaButton));
                y10.setSubtext(null);
            }
            kiVar2.d0.s(starsPrice);
        }
        F.Y();
        kiVar2.d0.p(F);
        kiVar2.d0.q(arrayList2);
        if (kiVar2.D1 == null && j13 >= 0 && z11) {
            kiVar2.d0.d(o2Var);
            kiVar2.d0.o(kiVar2.J0);
        }
        kiVar2.d0.show();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static /* synthetic */ void r(ki kiVar, org.telegram.messenger.video.e eVar) {
        AnimatorSet animatorSet = kiVar.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        eVar.run();
    }

    public static void s(ki kiVar) {
        if (kiVar.f0 == null) {
            return;
        }
        boolean R = ChatAttachAlertPhotoLayout.R();
        boolean z10 = !R;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f0;
        chatAttachAlertPhotoLayout.getClass();
        HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(R);
                        for (int i9 = 0; i9 < chatAttachAlertPhotoLayout.A.getChildCount(); i9++) {
                            View childAt = chatAttachAlertPhotoLayout.A.getChildAt(i9);
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
            chatAttachAlertPhotoLayout.u0();
        }
        kiVar.Y1(true);
        org.telegram.ui.ActionBar.w0 w0Var = kiVar.Y0;
        kh.x3 x3Var = kiVar.Z0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        kh.x3 x3Var2 = new kh.x3(kiVar.getContext(), 1);
        kiVar.Z0 = x3Var2;
        x3Var2.t(AndroidUtilities.replaceTags(LocaleController.getString(!R ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        kiVar.Z0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        kiVar.Z0.n(1.0f, -((kiVar.containerView.getWidth() - ((w0Var.getWidth() / 2.0f) + w0Var.getX())) - AndroidUtilities.dp(14.0f)));
        kiVar.Z0.setTranslationY(kiVar.W0.getTranslationY());
        kh.x3 x3Var3 = kiVar.Z0;
        x3Var3.h0 = new org.telegram.ui.wq(12, kiVar, x3Var2);
        kiVar.containerView.addView(x3Var3, g7.e6.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        kiVar.Z0.v();
    }

    public static /* synthetic */ void t(ki kiVar, boolean z10, wg wgVar) {
        kiVar.u0.s(1.0f);
        kiVar.v0.s(1.0f);
        kiVar.u0.k(kiVar.h2);
        kiVar.v0.k(kiVar.h2);
        kiVar.containerView.invalidate();
        kiVar.T0.setTag(z10 ? 1 : null);
        wgVar.run();
    }

    public static void v(ki kiVar, org.telegram.ui.ActionBar.b6 b6Var, View view) {
        ki kiVar2 = kiVar;
        nh nhVar = kiVar2.u1;
        ci[] ciVarArr = kiVar2.s0;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar2.b0;
        org.telegram.ui.ActionBar.o2 R = o2Var == null ? LaunchActivity.R() : o2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (view instanceof ei) {
            Activity parentActivity = R.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!kiVar2.H1 && !kiVar2.I1 && kiVar2.a1()) {
                    return;
                }
                if (!kiVar2.H1 && !kiVar2.I1) {
                    ln lnVar = new ln(1, kiVar2.getContext(), b6Var, kiVar2);
                    kiVar2.P = lnVar;
                    kiVar2.Q1(lnVar);
                }
                kiVar2.Q1(kiVar2.f0);
            } else if (intValue == 3) {
                if (!kiVar2.J1 && kiVar2.a1()) {
                    return;
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i9 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(kiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                kiVar2.B1(true);
            } else if (intValue == 4) {
                if (!kiVar2.G1 && kiVar2.a1()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(kiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                kiVar2.E1(true);
            } else if (intValue == 5) {
                if (!kiVar2.M1 && kiVar2.a1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && kiVar2.M1 && kiVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(kiVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                kiVar2.D1();
            } else if (intValue == 6) {
                if ((!kiVar2.M1 && kiVar2.a1()) || !AndroidUtilities.isMapsInstalled(o2Var)) {
                    return;
                }
                if (kiVar2.M1) {
                    if (kiVar2.k0 == null) {
                        xk xkVar = new xk(kiVar2, kiVar2.getContext(), b6Var, (kiVar2.D || kiVar2.N1) ? false : true);
                        kiVar2.k0 = xkVar;
                        ciVarArr[5] = xkVar;
                        sk skVar = kiVar2.p2;
                        if (skVar != null) {
                            xkVar.setDelegate(skVar);
                        } else {
                            xkVar.setDelegate(new tg(kiVar2, 9));
                        }
                    }
                    kiVar2.Q1(kiVar2.k0);
                } else {
                    ln lnVar2 = new ln(6, kiVar2.getContext(), b6Var, kiVar2);
                    kiVar2.P = lnVar2;
                    kiVar2.Q1(lnVar2);
                }
            } else if (intValue == 9) {
                if (!kiVar2.K1 && kiVar2.a1()) {
                    return;
                }
                if (kiVar2.K1) {
                    kiVar2.S1(true, null);
                } else {
                    ln lnVar3 = new ln(9, kiVar2.getContext(), b6Var, kiVar2);
                    kiVar2.P = lnVar3;
                    kiVar2.Q1(lnVar3);
                }
            } else if (intValue == 11) {
                if (kiVar2.o0 == null) {
                    pf.e0 e0Var = new pf.e0(kiVar2.getContext(), kiVar2.resourcesProvider, kiVar2);
                    kiVar2.o0 = e0Var;
                    ciVarArr[7] = e0Var;
                    e0Var.setupBlurredSearchField(kiVar2.C2);
                }
                kiVar2.Q1(kiVar2.o0);
            } else if (intValue == 12) {
                if (!kiVar2.L1 && kiVar2.a1()) {
                    return;
                }
                if (kiVar2.L1) {
                    if (kiVar2.j0 == null) {
                        jn jnVar = new jn(kiVar, kiVar.getContext(), true, b6Var, null);
                        kiVar2 = kiVar;
                        kiVar2.j0 = jnVar;
                        ciVarArr[1] = jnVar;
                        jnVar.setDelegate(new tg(kiVar2, 10));
                    }
                    kiVar2.Q1(kiVar2.j0);
                } else {
                    ln lnVar4 = new ln(9, kiVar2.getContext(), b6Var, kiVar2);
                    kiVar2.P = lnVar4;
                    kiVar2.Q1(lnVar4);
                }
            } else if (intValue == 13) {
                if (kiVar2.q0 == null) {
                    gk gkVar = new gk(kiVar2, kiVar2.getContext(), b6Var, true);
                    kiVar2.q0 = gkVar;
                    ciVarArr[8] = gkVar;
                    gkVar.setDelegate(kiVar2.W1);
                }
                kiVar2.Q1(kiVar2.q0);
            } else if (intValue == 14) {
                if (kiVar2.p0 == null) {
                    gk gkVar2 = new gk(kiVar2, kiVar2.getContext(), b6Var, false);
                    kiVar2.p0 = gkVar2;
                    ciVarArr[9] = gkVar2;
                    gkVar2.setDelegate(kiVar2.W1);
                }
                kiVar2.Q1(kiVar2.p0);
            } else if (intValue == 16) {
                if (kiVar2.r0 == null) {
                    qh.p pVar = new qh.p(kiVar2.F1, kiVar2.getContext(), b6Var, kiVar2);
                    kiVar2.r0 = pVar;
                    ciVarArr[10] = pVar;
                }
                kiVar2.Q1(kiVar2.r0);
            } else if (view.getTag() instanceof Integer) {
                kiVar2.V1.L(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, kiVar2.s1(), false, 0L);
            }
        } else if (view instanceof di) {
            di diVar = (di) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = diVar.c;
            if (tL_attachMenuBot == null) {
                kiVar2.V1.E(diVar.b);
                kiVar2.dismiss();
            } else if (tL_attachMenuBot.inactive) {
                fi1.a(kiVar2.getContext(), new ih.a2(5, kiVar2, diVar), null);
            } else {
                kiVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int dp = AndroidUtilities.dp(70.0f);
        int i11 = left - dp;
        if (i11 < 0) {
            nhVar.v0(i11, 0, null);
            return;
        }
        int i12 = right + dp;
        if (i12 > nhVar.getMeasuredWidth()) {
            nhVar.v0(i12 - nhVar.getMeasuredWidth(), 0, null);
        }
    }

    public static /* synthetic */ void w(ki kiVar) {
        ci ciVar;
        hm hmVar;
        kiVar.p1 = null;
        ci ciVar2 = kiVar.u0;
        if (ciVar2 != kiVar.f0 && (ciVar = kiVar.v0) != (hmVar = kiVar.m0) && ciVar2 != ciVar && ciVar2 != hmVar) {
            kiVar.containerView.removeView(ciVar2);
        }
        kiVar.u0.setVisibility(8);
        kiVar.u0.q();
        kiVar.v0.E();
        kiVar.u0 = kiVar.v0;
        kiVar.v0 = null;
        int[] iArr = kiVar.X1;
        iArr[0] = iArr[1];
        kiVar.H1(kiVar.Y, false);
        kiVar.W1();
    }

    public final void A1(int i9) {
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (i9 != 3) {
            if (i9 == 6 && AndroidUtilities.isMapsInstalled(o2Var)) {
                if (this.k0 == null) {
                    xk xkVar = new xk(this, getContext(), this.resourcesProvider, (this.D || this.N1) ? false : true);
                    this.k0 = xkVar;
                    this.s0[5] = xkVar;
                    sk skVar = this.p2;
                    if (skVar != null) {
                        xkVar.setDelegate(skVar);
                    } else if (o2Var instanceof org.telegram.ui.qn) {
                        xkVar.setDelegate(new tg(this, 16));
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
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            B1(true);
        }
    }

    public final void B1(boolean z10) {
        if (!this.J1 && z10) {
            ln lnVar = new ln(3, getContext(), this.resourcesProvider, this);
            this.P = lnVar;
            Q1(lnVar);
        }
        int i9 = 1;
        if (this.h0 == null) {
            vi viVar = new vi(getContext(), this.resourcesProvider, this);
            this.h0 = viVar;
            this.s0[3] = viVar;
            viVar.setupBlurredSearchField(this.C2);
            this.h0.setDelegate(new tg(this, 13));
            if (this.D) {
                this.h0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            TLRPC.Chat chat = ((org.telegram.ui.qn) o2Var).e;
            vi viVar2 = this.h0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.D1 == null) {
                i9 = -1;
            }
            viVar2.setMaxSelectedFiles(i9);
        }
        if (z10) {
            Q1(this.h0);
        }
    }

    public final void C1() {
        if (this.n0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.b6 b6Var = this.resourcesProvider;
            yi yiVar = new yi(context, b6Var, this);
            yiVar.r = AndroidUtilities.dp(80.0f);
            yiVar.w = 3;
            gh.f1 f1Var = new gh.f1(yiVar, context, b6Var, 11);
            yiVar.n = f1Var;
            ra raVar = new ra(yiVar, context);
            yiVar.v = raVar;
            f1Var.setAdapter(raVar);
            f1Var.setClipToPadding(false);
            f1Var.setItemAnimator(null);
            f1Var.setLayoutAnimation(null);
            f1Var.setVerticalScrollBarEnabled(false);
            f1Var.setGlowColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A5, yiVar.a));
            yiVar.addView(f1Var, g7.e6.c(-1.0f, -1));
            f1Var.setOnScrollListener(new bg.o2(yiVar, 24));
            jh.k kVar = new jh.k(yiVar, yiVar.r, 1);
            yiVar.s = kVar;
            kVar.O = new fh.c6(yiVar, 4);
            f1Var.setLayoutManager(kVar);
            this.n0 = yiVar;
            yiVar.setDelegate(new xa(this, 1));
        }
        Q1(this.n0);
    }

    public final void D1() {
        if (!this.M1) {
            ln lnVar = new ln(5, getContext(), this.resourcesProvider, this);
            this.P = lnVar;
            Q1(lnVar);
        }
        if (this.g0 == null) {
            pj pjVar = new pj(getContext(), this.resourcesProvider, this);
            this.g0 = pjVar;
            this.s0[2] = pjVar;
            pjVar.setupBlurredSearchField(this.C2);
            this.g0.setDelegate(new wh(this));
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            TLRPC.Chat chat = ((org.telegram.ui.qn) o2Var).e;
            this.g0.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        Q1(this.g0);
    }

    public final void E1(boolean z10) {
        if (!this.G1 && z10) {
            ln lnVar = new ln(4, getContext(), this.resourcesProvider, this);
            this.P = lnVar;
            Q1(lnVar);
        }
        boolean z11 = false;
        if (this.l0 == null) {
            fk fkVar = new fk(this.J ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.l0 = fkVar;
            this.s0[4] = fkVar;
            fkVar.setDelegate(new xh(this));
        }
        int i9 = 1;
        if (this.D) {
            this.l0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = this.b0;
            if (o2Var instanceof org.telegram.ui.qn) {
                TLRPC.Chat chat = ((org.telegram.ui.qn) o2Var).e;
                fk fkVar2 = this.l0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.D1 == null) {
                    i9 = -1;
                }
                fkVar2.setMaxSelectedFiles(i9);
            } else {
                this.l0.setMaxSelectedFiles(this.O1);
                fk fkVar3 = this.l0;
                if (!this.J && !this.S) {
                    z11 = true;
                }
                fkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        fk fkVar4 = this.l0;
        fkVar4.W = this.J;
        if (z10) {
            Q1(fkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        r7 r7Var = this.T0;
        int i9 = 1;
        if (r7Var.j0) {
            r7Var.h(true);
        }
        this.g0 = null;
        this.o0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        while (true) {
            ci[] ciVarArr = this.s0;
            if (i9 >= ciVarArr.length) {
                T1(false, false);
                super.dismissInternal();
                return;
            }
            ci ciVar = ciVarArr[i9];
            if (ciVar != null) {
                ciVar.m();
                this.containerView.removeView(ciVarArr[i9]);
                ciVarArr[i9] = null;
            }
            i9++;
        }
    }

    public final boolean G1(final int i9, final boolean z10, final int i10, final boolean z11, final long j10) {
        if (this.E1) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
            TLRPC.Chat chat = qnVar.e;
            if (qnVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(this.F1).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + qnVar.a(), !z10).commit();
            }
        }
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f) {
            this.E1 = true;
            this.V1.L(7, true, z10, i9, i10, j10, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        ci ciVar = this.u0;
        return y4.b0(this.F1, n12, j1() + (ciVar != null ? ciVar.getSelectedItemsCount() : 1), new Utilities.Callback() { // from class: org.telegram.ui.Components.gh
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ki kiVar = ki.this;
                kiVar.E1 = true;
                kiVar.V1.L(7, true, z10, i9, i10, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void H1(boolean z10, boolean z11) {
        this.b.a(z10, z11);
        ut m12 = m1();
        this.Y = z10;
        ut m13 = m1();
        final boolean z12 = this.z0.getTag() != null;
        ci ciVar = this.u0;
        final boolean z13 = this.Y && (ciVar == this.f0 || ciVar == this.m0);
        fh.v vVar = this.K0;
        ph phVar = this.y0;
        if (z11) {
            vVar.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = vVar.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            gr grVar = gr.h;
            final int i9 = 0;
            duration.setInterpolator(grVar).setUpdateListener(new ug(this, i9)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.vg
                public final /* synthetic */ ki b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            ki kiVar = this.b;
                            if (!z13 || !z12) {
                                kiVar.K0.setVisibility(8);
                            }
                            kiVar.b2();
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
            phVar.setVisibility(0);
            ViewPropertyAnimator interpolator = phVar.animate().translationY((z13 || !z12) ? phVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(grVar);
            final int i10 = 1;
            interpolator.setUpdateListener(new ug(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.vg
                public final /* synthetic */ ki b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            ki kiVar = this.b;
                            if (!z13 || !z12) {
                                kiVar.K0.setVisibility(8);
                            }
                            kiVar.b2();
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
            vVar.setVisibility((z13 && z12) ? 0 : 8);
            vVar.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            b2();
            phVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            phVar.setTranslationY((z13 || !z12) ? phVar.getMeasuredHeight() : 0.0f);
            phVar.setVisibility((z13 || !z12) ? 8 : 0);
        }
        if (m12 != m13) {
            m12.k(true);
            m13.setText(t5.cloneSpans(m12.getText()));
            m13.getEditText().setAllowTextEntitiesIntersection(m12.getEditText().getAllowTextEntitiesIntersection());
            if (m12.getEditText().isFocused()) {
                m13.getEditText().requestFocus();
                m13.getEditText().setSelection(m12.getEditText().getSelectionStart(), m12.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new wg(this, 0));
    }

    public final void I1(MessageObject messageObject, int i9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.f0) != null) {
            chatAttachAlertPhotoLayout.Y();
        }
        if (this.D1 == messageObject && this.C1 == i9) {
            return;
        }
        this.D1 = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            i9 = this.D1.isMusic() ? 2 : this.D1.isDocument() ? 1 : 0;
        }
        this.C1 = i9;
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

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        ci ciVar;
        if (i9 == 0) {
            g1();
            e1();
            return;
        }
        if (i9 == 2) {
            e1();
            jn jnVar = this.i0;
            if (jnVar != null && ((ciVar = this.v0) == jnVar || this.u0 == jnVar)) {
                a2(ciVar == jnVar ? 1 : 0);
            }
            jn jnVar2 = this.j0;
            if (jnVar2 != null) {
                ci ciVar2 = this.v0;
                if (ciVar2 == jnVar2 || this.u0 == jnVar2) {
                    a2(ciVar2 != jnVar2 ? 0 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == 1) {
            e1();
            return;
        }
        if (i9 == 3) {
            f1();
            return;
        }
        if (i9 == 4) {
            f1();
            return;
        }
        if (i9 == 5) {
            f1();
            vh vhVar = this.E0;
            if (vhVar != null) {
                vhVar.setEphemeralFactor(f10);
                vhVar.setSameWidthFactor(f10);
            }
        }
    }

    public final void J1(int i9, boolean z10) {
        if (this.D1 != null) {
            return;
        }
        this.O1 = i9;
        this.P1 = z10;
    }

    public final void K1(float f10) {
        int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.f6.a7), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
        this.navBarColor = k10;
        AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
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
            ki kiVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.c1 = (kiVar.M0 == 0 || kiVar.B) ? false : true;
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
            if ((o2Var instanceof org.telegram.ui.qn) && !((org.telegram.ui.qn) o2Var).w()) {
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
                gr grVar = gr.h;
                scaleY.setInterpolator(grVar).setDuration(420L).withEndAction(new fh(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(grVar).setDuration(420L).withEndAction(new fh(this, z11, 2)).start();
                if (z11) {
                    i0 i0Var = this.x;
                    Objects.requireNonNull(i0Var);
                    imageView.postDelayed(new h0(i0Var, 1), 220L);
                    i0 i0Var2 = this.A;
                    Objects.requireNonNull(i0Var2);
                    imageView2.postDelayed(new h0(i0Var2, 1), 220L);
                    return;
                }
                return;
            }
        }
        z11 = false;
        if (this.u2 != z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1(long j10, String str, boolean z10, boolean z11) {
        long j11;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.t0;
        int i9 = 1;
        if (longSparseArray.get(j10) != null && Objects.equals(str, ((mh.g4) longSparseArray.get(j10)).getStartCommand())) {
            mh.g4 g4Var = (mh.g4) longSparseArray.get(j10);
            if (g4Var.D) {
                g4Var.D = false;
            }
            if (longSparseArray.get(j10) != null) {
                ((mh.g4) longSparseArray.get(j10)).F.setSwipeOffsetAnimationDisallowed(true);
                R1((ci) longSparseArray.get(j10), -j10, z11);
                if (z10) {
                    mh.g4 g4Var2 = (mh.g4) longSparseArray.get(j10);
                    TLRPC.User user = MessagesController.getInstance(g4Var2.B).getUser(Long.valueOf(g4Var2.v));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(g4Var2.B).getAttachMenuBots().bots;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            tL_attachMenuBot = null;
                            break;
                        }
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                        i10++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                        if (tL_attachMenuBot.bot_id == g4Var2.v) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z12 = tL_attachMenuBot.show_in_side_menu;
                    AndroidUtilities.runOnUIThread(new kh.o8(10, g4Var2, (z12 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name) : z12 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            Context context = getContext();
            org.telegram.ui.ActionBar.b6 b6Var = this.resourcesProvider;
            mh.g4 g4Var3 = new mh.g4(context, b6Var, this);
            g4Var3.Q = new mh.w3(g4Var3, 2);
            org.telegram.ui.ActionBar.w0 a2 = g4Var3.b.T0.n().a(0, R.drawable.ic_ab_other);
            g4Var3.G = a2;
            a2.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
            org.telegram.ui.ActionBar.g1 e10 = a2.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
            g4Var3.H = e10;
            e10.setVisibility(8);
            a2.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
            org.telegram.ui.ActionBar.g1 e11 = a2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            g4Var3.I = e11;
            e11.setVisibility(8);
            a2.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
            a2.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
            a2.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
            mh.z3 z3Var = new mh.z3(g4Var3, context, b6Var, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, g4Var3.a));
            g4Var3.n = z3Var;
            mh.t2 t2Var = new mh.t2(g4Var3, context, i9);
            g4Var3.F = t2Var;
            t2Var.addView(z3Var, g7.e6.c(-1.0f, -1));
            t2Var.setScrollListener(new mh.w3(g4Var3, 3));
            int i11 = 4;
            t2Var.setScrollEndListener(new mh.w3(g4Var3, i11));
            t2Var.setDelegate(new mh.y3(g4Var3));
            t2Var.setIsKeyboardVisible(new mh.y3(g4Var3));
            g4Var3.addView(t2Var, g7.e6.c(-1.0f, -1));
            mh.a4 a4Var = new mh.a4(context, b6Var);
            g4Var3.E = a4Var;
            g4Var3.addView(a4Var, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            z3Var.setWebViewProgressListener(new fh.k6(g4Var3, i11));
            NotificationCenter.getGlobalInstance().addObserver(g4Var3, NotificationCenter.didSetNewTheme);
            longSparseArray.put(j10, g4Var3);
            ((mh.g4) longSparseArray.get(j10)).setDelegate(new rh(this, g4Var3, str, j10));
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
            MessageObject replyingMessageObject = qnVar.U.getReplyingMessageObject();
            mh.g4 g4Var4 = (mh.g4) longSparseArray.get(j10);
            long a3 = qnVar.a();
            int i12 = replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0;
            long N8 = qnVar.N8();
            mh.z3 z3Var2 = g4Var4.n;
            int i13 = this.F1;
            g4Var4.B = i13;
            g4Var4.w = a3;
            g4Var4.v = j10;
            g4Var4.y = i12;
            g4Var4.A = N8;
            g4Var4.C = str;
            org.telegram.ui.ActionBar.g1 g1Var = g4Var4.I;
            if (g1Var != null) {
                if (MediaDataController.getInstance(i13).canCreateAttachedMenuBotShortcut(j10)) {
                    g1Var.setVisibility(0);
                } else {
                    g1Var.setVisibility(8);
                }
            }
            z3Var2.setBotUser(MessagesController.getInstance(i13).getUser(Long.valueOf(j10)));
            z3Var2.q(i13, j10);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(i13).getInputPeer(a3);
            tL_messages_requestWebView.bot = MessagesController.getInstance(i13).getInputUser(j10);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a3 < 0) {
                j11 = 0;
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i13).getChatFull(-a3);
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
            JSONObject p6 = mh.c3.p(g4Var4.a, false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_requestWebView, new gh.u1(g4Var4, i13, 4));
            NotificationCenter.getInstance(i13).addObserver(g4Var4, NotificationCenter.webViewResultSent);
            if (longSparseArray.get(j10) != null) {
            }
        }
        if (longSparseArray.get(j10) != null) {
        }
    }

    public final void O1(org.telegram.ui.ActionBar.o2 o2Var) {
        if ((o2Var instanceof org.telegram.ui.qn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.qn) o2Var).e)) {
            new oc(this.n1, this.resourcesProvider).f(MessagesController.getInstance(this.F1).captionLengthLimitPremium, new org.telegram.ui.wq(13, this, o2Var)).j();
        }
    }

    public final boolean P1(boolean z10, boolean z11) {
        int i9;
        ci ciVar;
        r7 r7Var;
        this.c.a(z10, true);
        mh mhVar = this.z0;
        if (z10 == (mhVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        mhVar.setTag(z10 ? 1 : null);
        qh qhVar = this.A0;
        if (qhVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(qhVar.getEditText());
        }
        qhVar.k(true);
        this.L0.k(true);
        mh mhVar2 = this.t1;
        mh mhVar3 = this.D0;
        if (z10) {
            if (!this.J) {
                mhVar.setVisibility(0);
            }
            mhVar3.setVisibility(0);
        } else if (this.O0) {
            mhVar2.setVisibility(0);
        }
        ci ciVar2 = this.u0;
        boolean z12 = (ciVar2 == this.f0 || ciVar2 == this.m0) && this.Y;
        r7 r7Var2 = this.T0;
        fh.v vVar = this.K0;
        ph phVar = this.y0;
        vh vhVar = this.E0;
        if (z11) {
            this.I0 = new AnimatorSet();
            if (z12) {
                vVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(mhVar, (Property<mh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(phVar, (Property<ph, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                r7Var = r7Var2;
            } else {
                phVar.setVisibility(0);
                r7Var = r7Var2;
                arrayList.add(ObjectAnimator.ofFloat(phVar, (Property<ph, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(vVar, (Property<fh.v, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(mhVar3, (Property<mh, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(mhVar3, (Property<mh, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(mhVar3, (Property<mh, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(vhVar, (Property<vh, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(vhVar, (Property<vh, Float>) property3, z10 ? 1.0f : 0.2f));
            if (r7Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(mhVar, (Property<mh, Float>) View.TRANSLATION_Y, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.O0) {
                arrayList.add(ObjectAnimator.ofFloat(mhVar2, (Property<mh, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(mhVar2, (Property<mh, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ug(this, 4));
                arrayList.add(ofFloat);
            }
            this.I0.playTogether(arrayList);
            this.I0.setInterpolator(new DecelerateInterpolator());
            this.I0.setDuration(180L);
            this.I0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.I0.start();
            i9 = 0;
        } else {
            mhVar.setAlpha(z10 ? 1.0f : 0.0f);
            phVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            if (!z10 || z12) {
                i9 = 0;
            } else {
                i9 = 0;
                phVar.setVisibility(0);
                phVar.setTranslationY(0.0f);
            }
            mhVar3.setScaleX(z10 ? 1.0f : 0.2f);
            mhVar3.setScaleY(z10 ? 1.0f : 0.2f);
            mhVar3.setAlpha(z10 ? 1.0f : 0.0f);
            vVar.setVisibility((z10 && z12) ? 0 : 8);
            vVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            vhVar.setScaleX(z10 ? 1.0f : 0.2f);
            vhVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (r7Var2.getTag() != null) {
                mhVar.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
            } else if (this.O0 && ((ciVar = this.u0) == null || ciVar.I())) {
                mhVar2.setTranslationY(z10 ? AndroidUtilities.dp(84.0f) : 0.0f);
            }
            if (!z10) {
                mhVar.setVisibility(4);
                mhVar3.setVisibility(4);
            }
            if (z12) {
                b2();
            }
        }
        if (z10) {
            i9 = Math.max(1, this.u0.getSelectedItemsCount());
        }
        vhVar.g(i9, z11);
        vhVar.i(j1() + this.u0.getSelectedItemsCount(), this.D1 != null ? 0L : MessagesController.getInstance(this.F1).getSendPaidMessagesStars(n1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), vhVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            qhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(ci ciVar) {
        long j10 = this.S0;
        ln lnVar = this.P;
        if (ciVar == lnVar) {
            j10 = lnVar.s;
        } else if (ciVar == this.f0) {
            j10 = 1;
        } else if (ciVar == this.h0) {
            j10 = 3;
        } else if (ciVar == this.l0) {
            j10 = 4;
        } else if (ciVar == this.g0) {
            j10 = 5;
        } else if (ciVar == this.k0) {
            j10 = 6;
        } else if (ciVar == this.i0) {
            j10 = 9;
        } else if (ciVar == this.n0) {
            j10 = 10;
        } else if (ciVar == this.o0) {
            j10 = 11;
        } else if (ciVar == this.j0) {
            j10 = 12;
        } else if (ciVar == this.p0) {
            j10 = 14;
        } else if (ciVar == this.q0) {
            j10 = 13;
        } else if (ciVar == this.r0) {
            j10 = 16;
        }
        R1(ciVar, j10, true);
    }

    public final void R1(ci ciVar, long j10, boolean z10) {
        ul ulVar;
        ul ulVar2;
        nh nhVar;
        if (this.p1 == null && this.I0 == null) {
            ci ciVar2 = this.u0;
            if (ciVar2 == ciVar) {
                ciVar2.F();
                return;
            }
            if (ciVar == this.j0 && !UserConfig.getInstance(this.F1).isPremium()) {
                new zf.x0(this.b0, 39, false).show();
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
            mh mhVar = this.t1;
            mhVar.setAlpha(1.0f);
            mhVar.setTranslationY(this.B1);
            int i9 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.t0;
                if (i9 >= longSparseArray.size()) {
                    break;
                }
                ((mh.g4) longSparseArray.valueAt(i9)).setMeasureOffsetY(0);
                i9++;
            }
            this.S0 = j10;
            nh nhVar2 = this.u1;
            int childCount = nhVar2.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = nhVar2.getChildAt(i10);
                if (childAt instanceof ei) {
                    ei eiVar = (ei) childAt;
                    nhVar = nhVar2;
                    eiVar.a.e(((long) eiVar.b) == eiVar.c.S0, true);
                } else {
                    nhVar = nhVar2;
                    if (childAt instanceof di) {
                        ((di) childAt).a(true);
                    }
                }
                i10++;
                nhVar2 = nhVar;
            }
            int firstOffset = (this.u0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.X1[0];
            this.v0 = ciVar;
            ciVar.getClass();
            boolean z11 = ciVar instanceof qh.p;
            rg.f fVar = this.r1;
            if (fVar != null) {
                fVar.setFadeHeightBottom(z11 ? 0 : AndroidUtilities.dp(48.0f));
            }
            oh ohVar = this.s1;
            if (ohVar != null) {
                ohVar.setVisibility(z11 ? 4 : 0);
            }
            int i11 = this.v0.h() != 0 ? 0 : 4;
            r7 r7Var = this.T0;
            r7Var.setVisibility(i11);
            if (r7Var.j0) {
                r7Var.h(true);
            }
            this.u0.r();
            ci ciVar3 = this.v0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
            if (ciVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.v0.D(this.u0);
            this.v0.setVisibility(0);
            if (ciVar.getParent() != null) {
                this.containerView.removeView(this.v0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.u0);
            ViewParent parent = this.v0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                ci ciVar4 = this.v0;
                if (ciVar4 != this.k0) {
                    indexOfChild++;
                }
                viewGroup.addView(ciVar4, indexOfChild, g7.e6.c(-1.0f, -1));
            }
            wg wgVar = new wg(this, 3);
            ci ciVar5 = this.u0;
            boolean z12 = ciVar5 instanceof hm;
            yh yhVar = this.a0;
            if (z12 || (this.v0 instanceof hm)) {
                int max = Math.max(this.v0.getWidth(), this.u0.getWidth());
                ci ciVar6 = this.v0;
                if (ciVar6 instanceof hm) {
                    ciVar6.setTranslationX(max);
                    ci ciVar7 = this.u0;
                    if ((ciVar7 instanceof ChatAttachAlertPhotoLayout) && (ulVar2 = ((ChatAttachAlertPhotoLayout) ciVar7).L) != null) {
                        ulVar2.setVisibility(4);
                    }
                } else {
                    this.u0.setTranslationX(-max);
                    ci ciVar8 = this.v0;
                    if (ciVar8 == chatAttachAlertPhotoLayout && (ulVar = ((ChatAttachAlertPhotoLayout) ciVar8).L) != null) {
                        ulVar.setVisibility(0);
                    }
                }
                this.v0.setAlpha(1.0f);
                this.u0.setAlpha(1.0f);
                if (z10) {
                    ci ciVar9 = this.u0;
                    yhVar.getClass();
                    yhVar.b(ciVar9, 0.0f);
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(this, ciVar, wgVar, 17));
                } else {
                    boolean z13 = this.v0.getCurrentItemTop() <= ciVar.getButtonsHideOffset();
                    this.u0.s(1.0f);
                    this.v0.s(1.0f);
                    this.u0.k(this.h2);
                    this.v0.k(this.h2);
                    this.containerView.invalidate();
                    ci ciVar10 = this.u0;
                    yhVar.getClass();
                    yhVar.b(ciVar10, 1.0f);
                    r7Var.setTag(z13 ? 1 : null);
                    wgVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.v0.setAlpha(0.0f);
                this.v0.setTranslationY(AndroidUtilities.dp(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.u0, (Property<ci, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.u0, yhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) View.ALPHA, r7Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(gr.f);
                animatorSet.addListener(new gh.m3(this, firstOffset, wgVar, 1));
                this.p1 = animatorSet;
                ci ciVar11 = this.u0;
                yhVar.getClass();
                yhVar.b(ciVar11, 0.0f);
                animatorSet.start();
            } else {
                ciVar5.setAlpha(0.0f);
                wgVar.run();
                a2(0);
                this.containerView.invalidate();
            }
            if (this.i2 && !(ciVar instanceof mh.g4)) {
                this.i2 = false;
                r7Var.d();
                r7Var.invalidate();
                u1();
            }
            r7Var.setForcedMenuWidth((j10 == 1 || j10 == 6 || (ciVar instanceof mh.g4)) ? AndroidUtilities.dp(46.0f) : j10 == 4 ? AndroidUtilities.dp(84.0f) : 0);
        }
    }

    public final void S1(boolean z10, Boolean bool) {
        ki kiVar;
        if (this.i0 == null) {
            kiVar = this;
            jn jnVar = new jn(kiVar, getContext(), false, this.resourcesProvider, bool);
            kiVar.i0 = jnVar;
            kiVar.s0[1] = jnVar;
            jnVar.setDelegate(new tg(this, 15));
        } else {
            kiVar = this;
        }
        R1(kiVar.i0, 9L, z10);
    }

    public final void T1(boolean z10, boolean z11) {
        ci ciVar;
        this.d.a(z10, z11);
        r7 r7Var = this.T0;
        if (!(z10 && r7Var.getTag() == null) && (z10 || r7Var.getTag() == null)) {
            return;
        }
        r7Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet = this.U0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.U0 = null;
        }
        boolean z12 = (this.B || this.P0 || (this.M0 == 0 && this.m1) || this.u0 != this.f0 || (!this.H1 && !this.I1)) ? false : true;
        if (this.u0 == this.P) {
            z12 = false;
        }
        mh mhVar = this.t1;
        org.telegram.ui.ActionBar.w0 w0Var = this.W0;
        if (z10) {
            if (z12) {
                w0Var.setVisibility(0);
                w0Var.setClickable(true);
            }
        } else if (this.O0 && this.z0.getTag() == null) {
            mhVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var != null) {
            if (z10) {
                AndroidUtilities.setLightStatusBar(this, i0.a.f(getThemedColor(this.d2 ? org.telegram.ui.ActionBar.f6.tg : org.telegram.ui.ActionBar.f6.h5)) > 0.699999988079071d);
            } else {
                AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
            }
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.U0 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z10 ? 1.0f : 0.0f) - r7Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(r7Var, (Property<r7, Float>) property, z10 ? 1.0f : 0.0f));
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.U0.playTogether(arrayList);
            this.U0.addListener(new u9(2, this, z10));
            this.U0.setInterpolator(gr.h);
            this.U0.setDuration(380L);
            this.U0.start();
            return;
        }
        if (z10 && this.O0 && ((ciVar = this.u0) == null || ciVar.I())) {
            mhVar.setVisibility(4);
        }
        r7Var.setAlpha(z10 ? 1.0f : 0.0f);
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
        qh qhVar = this.A0;
        qhVar.getLocationOnScreen(iArr);
        if (this.x2 != null) {
            ci ciVar = this.u0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
            if ((ciVar == chatAttachAlertPhotoLayout || ciVar == this.m0) && this.Y) {
                fh.v vVar = this.K0;
                alpha = (vVar.getAlpha() * vVar.getMeasuredHeight()) + (vVar.getY() - this.x2.getTop());
            } else {
                alpha = -qhVar.getHeight();
            }
            if (Math.abs(this.x2.getTranslationY() - alpha) > 0.5f) {
                this.x2.setTranslationY(alpha);
                this.x2.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.U();
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
    public final void V1(int i9) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.p1 != null) {
            return;
        }
        int selectedItemsCount = this.u0.getSelectedItemsCount();
        vh vhVar = this.E0;
        if (selectedItemsCount == 0) {
            vhVar.g(0, i9 != 0);
            P1(false, i9 != 0);
        } else {
            if (P1(true, i9 != 0) || i9 == 0) {
                vhVar.g(selectedItemsCount, i9 != 0);
                vhVar.c();
            } else {
                vhVar.g(selectedItemsCount, true);
                vhVar.c();
            }
        }
        this.u0.A(selectedItemsCount);
        d1(i9 != 0);
        if (this.u0 == this.f0 && ((((z10 = (o2Var = this.b0) instanceof org.telegram.ui.qn)) || this.M0 != 0 || this.P0) && ((selectedItemsCount == 0 && this.m1) || ((selectedItemsCount != 0 || this.M0 != 0 || this.P0) && !this.m1)))) {
            this.m1 = (selectedItemsCount == 0 && this.M0 == 0 && !this.P0) ? false : true;
            AnimatorSet animatorSet = this.V0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
            int i10 = this.M0;
            r7 r7Var = this.T0;
            org.telegram.ui.ActionBar.w0 w0Var = this.a1;
            if (i10 != 0 && w0Var != null && r7Var.getTag() != null && z10) {
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
                if (!ChatObject.isChannel(qnVar.e) || (tL_chatBannedRights = qnVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.m1;
                    mh mhVar = this.e1;
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.W0;
                    if (!z12) {
                        if (this.M0 == 0 && !this.P0) {
                            w0Var2.setVisibility(0);
                            w0Var2.setClickable(true);
                        }
                        mhVar.setVisibility(0);
                    } else if (r7Var.getTag() != null && w0Var != null) {
                        w0Var.setVisibility(0);
                    }
                    if (i9 != 0) {
                        if (r7Var.getTag() == null && this.M0 == 0 && !this.P0) {
                            w0Var2.setAlpha(this.m1 ? 1.0f : 0.0f);
                            w0Var2.setScaleX(this.m1 ? 1.0f : 0.6f);
                            w0Var2.setScaleY(this.m1 ? 1.0f : 0.6f);
                        }
                        mhVar.setAlpha(this.m1 ? 1.0f : 0.0f);
                        if (z11) {
                            w0Var.setAlpha(this.m1 ? 0.0f : 1.0f);
                        }
                        if (this.m1 && w0Var != null) {
                            w0Var.setVisibility(4);
                        }
                    } else {
                        this.V0 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (r7Var.getTag() == null && this.M0 == 0 && !this.P0) {
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, this.m1 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_X, this.m1 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(w0Var2, (Property<org.telegram.ui.ActionBar.w0, Float>) View.SCALE_Y, this.m1 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(mhVar, (Property<mh, Float>) property, this.m1 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.ActionBar.w0, Float>) property, this.m1 ? 0.0f : 1.0f));
                        }
                        this.V0.playTogether(arrayList);
                        this.V0.addListener(new org.telegram.ui.xp(this, 12));
                        this.V0.setDuration(180L);
                        this.V0.start();
                    }
                }
            }
            z11 = false;
            z12 = this.m1;
            mh mhVar2 = this.e1;
            org.telegram.ui.ActionBar.w0 w0Var22 = this.W0;
            if (!z12) {
            }
            if (i9 != 0) {
            }
        }
        Y1(i9 != 0);
        MessageObject messageObject = this.D1;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.F1).getSendPaidMessagesStars(n1()) : 0L;
        ci ciVar = this.u0;
        vhVar.i(j1() + (ciVar != null ? ciVar.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        qh qhVar = this.A0;
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
        ci ciVar = this.u0;
        boolean g10 = ciVar == null ? false : ciVar.g();
        bh.e eVar = this.b1;
        eVar.setEnabled(g10);
        ci ciVar2 = this.u0;
        if (ciVar2 != null) {
            f10 = ((ciVar2.g() ? 1.0f : 0.5f) * (this.v0 == null ? 1.0f : this.Z)) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        ci ciVar3 = this.v0;
        if (ciVar3 != null) {
            f10 = e2.c.z(1.0f, this.Z, ciVar3.g() ? 1.0f : 0.5f, f10);
        }
        this.c1 = f10;
        if (eVar != null) {
            float f11 = f10 * this.d1;
            eVar.setAlpha(f11);
            eVar.setVisibility(f11 <= 0.0f ? 4 : 0);
        }
    }

    public final void X1(ci ciVar, int i9) {
        if (ciVar == null) {
            return;
        }
        ig.e eVar = this.y2;
        if (eVar != null && Build.VERSION.SDK_INT >= 31) {
            eVar.f(0.0f, i9);
            Z0();
        }
        int currentItemTop = ciVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = ciVar == this.u0 && currentItemTop <= ciVar.getButtonsHideOffset();
        this.N = z11;
        if (ciVar == this.u0) {
            T1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ciVar.getLayoutParams();
        int D = org.telegram.messenger.ll.D(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        ci ciVar2 = this.u0;
        int i10 = ciVar2 == ciVar ? 0 : 1;
        if ((ciVar2 instanceof hm) || (this.v0 instanceof hm)) {
            Object obj = this.p1;
            if ((obj instanceof o1.j) && ((o1.j) obj).f) {
                z10 = true;
            }
        }
        int[] iArr = this.X1;
        int i11 = iArr[i10];
        if (i11 == D && !z10) {
            if (i9 != 0) {
                this.Y1 = i11;
            }
        } else {
            this.Y1 = i11;
            iArr[i10] = D;
            a2(i10);
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
        kh.v vVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        if (chatAttachAlertPhotoLayout == null || (vVar = this.X0) == null) {
            return;
        }
        boolean z11 = this.m1 && this.e0 && this.u0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.b0();
        boolean z12 = !ChatAttachAlertPhotoLayout.R();
        vVar.f = z12;
        if (!z10) {
            ((y5) vVar.g).a(z12);
        }
        vVar.invalidateSelf();
        org.telegram.ui.ActionBar.w0 w0Var = this.Y0;
        if (z10 && this.m1) {
            w0Var.setVisibility(0);
            w0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(gr.h).withEndAction(new fh(this, z11, 0)).start();
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
        ig.e eVar;
        boolean z10;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.y2) == null) {
            return;
        }
        mh mhVar = this.t1;
        ViewGroup viewGroup = this.containerView;
        RectF rectF = this.H2;
        pg.i.c(mhVar, viewGroup, rectF);
        float measuredWidth = this.containerView.getMeasuredWidth();
        float measuredHeight = this.T0.getMeasuredHeight();
        RectF rectF2 = this.G2;
        rectF2.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        rectF2.inset(0.0f, -AndroidUtilities.dp(48.0f));
        rectF.set(0.0f, this.containerView.getMeasuredHeight() - (AndroidUtilities.dp(180.0f) + Math.max(AndroidUtilities.navigationBarHeight, o1())), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        ci ciVar = this.u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        if (ciVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null) {
            kl klVar = chatAttachAlertPhotoLayout.A;
            if (klVar.getFastScroll() != null) {
                fk0 fastScroll = klVar.getFastScroll();
                kg.d dVar = fastScroll.a0;
                RectF rectF3 = this.I2;
                if (dVar != null || fastScroll.b0 != null) {
                    rectF3.set(fastScroll.b0.getBounds());
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(fastScroll.a0.getBounds());
                    rectF3.union(rectF4);
                }
                fk0 fastScroll2 = klVar.getFastScroll();
                ViewGroup viewGroup2 = this.containerView;
                RectF rectF5 = AndroidUtilities.rectTmp;
                pg.i.c(fastScroll2, viewGroup2, rectF5);
                rectF3.offset(rectF5.left, rectF5.top);
                rectF3.inset(-AndroidUtilities.dp(48.0f), -AndroidUtilities.dp(48.0f));
                rectF3.left = Math.max(0.0f, rectF3.left);
                rectF3.right = Math.min(this.containerView.getMeasuredWidth(), rectF3.right);
                z10 = true;
                int i9 = !z10 ? 3 : 2;
                ArrayList arrayList = this.F2;
                ArrayList arrayList2 = this.J2;
                eVar.g(ff.m0.a(arrayList, i9, arrayList2), arrayList2);
                eVar.e(this.E2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
            }
        }
        z10 = false;
        if (!z10) {
        }
        ArrayList arrayList3 = this.F2;
        ArrayList arrayList22 = this.J2;
        eVar.g(ff.m0.a(arrayList3, i9, arrayList22), arrayList22);
        eVar.e(this.E2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void Z1(boolean z10) {
        ci ciVar = this.f0;
        if (!z10) {
            Q1(ciVar);
            return;
        }
        if (this.I) {
            if (this.m0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.b6 b6Var = this.r;
                if (b6Var == null) {
                    b6Var = this.resourcesProvider;
                }
                hm hmVar = new hm(context, b6Var, this);
                hmVar.y = 0.0f;
                hmVar.A = 0.0f;
                hmVar.B = 0.0f;
                hmVar.C = 0.0f;
                hmVar.D = 0.0f;
                hmVar.E = 0.0f;
                hmVar.F = null;
                hmVar.G = false;
                hmVar.I = 0.0f;
                hmVar.M = false;
                hmVar.O = false;
                Point point = AndroidUtilities.displaySize;
                hmVar.P = point.y > point.x;
                hmVar.n = b6Var;
                hmVar.f = true;
                hmVar.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z n10 = hmVar.b.T0.n();
                TextView textView = new TextView(context);
                hmVar.x = textView;
                org.telegram.ui.ActionBar.b6 b6Var2 = hmVar.a;
                pl plVar = new pl(hmVar, context, n10, b6Var2, 1);
                hmVar.b.T0.addView(plVar, 0, g7.e6.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var2));
                textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                textView.setAlpha(0.0f);
                plVar.addView(textView, g7.e6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                gh.f1 f1Var = new gh.f1(hmVar, context, b6Var2, 14);
                hmVar.r = f1Var;
                f1Var.setAdapter(new org.telegram.ui.v7(hmVar, 3));
                f2.m0 m0Var = new f2.m0(1, false);
                hmVar.s = m0Var;
                f1Var.setLayoutManager(m0Var);
                f1Var.setClipChildren(false);
                f1Var.setClipToPadding(false);
                f1Var.setOverScrollMode(2);
                f1Var.setVerticalScrollBarEnabled(false);
                gm gmVar = new gm(hmVar, context);
                hmVar.v = gmVar;
                gmVar.setClipToPadding(true);
                gmVar.setClipChildren(true);
                hmVar.addView(f1Var, g7.e6.c(-1.0f, -1));
                hmVar.L = hmVar.b.f0;
                gmVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.L;
                gmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                gmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                gmVar.c();
                UndoView undoView = new UndoView(context, null, false, hmVar.b.r);
                hmVar.w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                hmVar.addView(undoView, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                hmVar.J = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.m0 = hmVar;
                hmVar.bringToFront();
            }
            ci ciVar2 = this.u0;
            hm hmVar2 = this.m0;
            if (ciVar2 != hmVar2) {
                ciVar = hmVar2;
            }
            Q1(ciVar);
        }
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        return (o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).K6();
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
    public final void a2(int i9) {
        int i10;
        float f10;
        org.telegram.ui.ActionBar.w0 w0Var;
        float f11;
        float f12;
        float f13;
        float f14;
        bh.e eVar;
        float max;
        int i11;
        float f15 = this.d.e;
        ci ciVar = i9 == 0 ? this.u0 : this.v0;
        if (ciVar == null || ciVar.getVisibility() != 0) {
            return;
        }
        int p12 = p1(i9);
        if (ciVar == this.i0 || ciVar == this.j0) {
            AndroidUtilities.dp(13.0f);
            AndroidUtilities.dp(11.0f);
        } else {
            AndroidUtilities.dp(39.0f);
            AndroidUtilities.dp(43.0f);
        }
        org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (AndroidUtilities.isTablet()) {
            i10 = 16;
        } else {
            Point point = AndroidUtilities.displaySize;
            i10 = point.x > point.y ? 6 : 12;
        }
        float alpha = this.T0.getAlpha();
        mh mhVar = this.e1;
        float dp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - mhVar.getAlpha()) * 26.0f);
        boolean z10 = this.m1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.W0;
        fh.v vVar = this.K0;
        if (z10 && this.M0 == 0 && !this.P0) {
            w0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i10 + 37), ((p12 - AndroidUtilities.dp((i10 * f15) + 37.0f)) + dp) - (vVar.getAlpha() * vVar.getMeasuredHeight())) + this.h2);
        } else {
            w0Var2.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i10 + 37)) + this.h2);
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.Y0;
        if (w0Var3 != null) {
            w0Var3.setTranslationY(w0Var2.getTranslationY());
        }
        kh.x3 x3Var = this.Z0;
        if (x3Var != null) {
            x3Var.setTranslationY(w0Var2.getTranslationY());
        }
        if (this.B && this.o1) {
            ci ciVar2 = this.v0;
            if (ciVar2 != null && this.u0 != null) {
                f10 = Math.min(ciVar2.getTranslationY(), this.u0.getTranslationY());
            } else if (ciVar2 != null) {
                f10 = ciVar2.getTranslationY();
            }
            w0Var = this.a1;
            if (w0Var != null) {
                w0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i10 + 37)) + this.h2);
            }
            float dp2 = ((((p12 - AndroidUtilities.dp((i10 * f15) + 25.0f)) + dp) + this.h2) + f10) - (vVar.getAlpha() * vVar.getMeasuredHeight());
            this.l1 = dp2;
            mhVar.setTranslationY(Math.max(this.h2, dp2));
            vVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h2, (mhVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.l1 + AndroidUtilities.dp(8.0f)));
            if (this.Y) {
                U1();
            }
            g1();
            int i12 = 59;
            if (this.i0 != null) {
                if (AndroidUtilities.isTablet()) {
                    i11 = 63;
                } else {
                    Point point2 = AndroidUtilities.displaySize;
                    i11 = point2.x > point2.y ? 53 : 59;
                }
                jn jnVar = this.i0;
                if (jnVar == this.v0) {
                    f12 = (jnVar.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.Z;
                } else if (jnVar == this.u0) {
                    f12 = (jnVar.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i11 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                    f11 = this.v0 == null ? 1.0f : 1.0f - this.Z;
                }
                if (this.j0 != null) {
                    if (AndroidUtilities.isTablet()) {
                        i12 = 63;
                    } else {
                        Point point3 = AndroidUtilities.displaySize;
                        if (point3.x > point3.y) {
                            i12 = 53;
                        }
                    }
                    jn jnVar2 = this.j0;
                    if (jnVar2 == this.v0) {
                        f14 = (jnVar2.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.Z;
                    } else if (jnVar2 == this.u0) {
                        f14 = (jnVar2.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i12 * f15) + 7.0f) - ((1.0f - f15) * 12.0f));
                        f13 = this.v0 == null ? 1.0f : 1.0f - this.Z;
                    }
                    eVar = this.b1;
                    if (eVar != null) {
                        int measuredWidth = LocaleController.isRTL ? (this.containerView.getMeasuredWidth() - eVar.getMeasuredWidth()) - AndroidUtilities.dp(62.0f) : 0;
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
                        eVar.setTranslationY(Math.max(0.0f, max) + this.h2);
                        eVar.setTranslationX(-((measuredWidth * (1.0f - f15)) + AndroidUtilities.dp((7.0f * r5) + 12.0f)));
                    }
                    float max2 = Math.max(f13, f11);
                    this.d1 = max2;
                    if (eVar == null) {
                        float f16 = this.c1 * max2;
                        eVar.setAlpha(f16);
                        eVar.setVisibility(f16 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f13 = 0.0f;
                f14 = 0.0f;
                eVar = this.b1;
                if (eVar != null) {
                }
                float max22 = Math.max(f13, f11);
                this.d1 = max22;
                if (eVar == null) {
                }
            }
            f11 = 0.0f;
            f12 = 0.0f;
            if (this.j0 != null) {
            }
            f13 = 0.0f;
            f14 = 0.0f;
            eVar = this.b1;
            if (eVar != null) {
            }
            float max222 = Math.max(f13, f11);
            this.d1 = max222;
            if (eVar == null) {
            }
        }
        f10 = 0.0f;
        w0Var = this.a1;
        if (w0Var != null) {
        }
        float dp22 = ((((p12 - AndroidUtilities.dp((i10 * f15) + 25.0f)) + dp) + this.h2) + f10) - (vVar.getAlpha() * vVar.getMeasuredHeight());
        this.l1 = dp22;
        mhVar.setTranslationY(Math.max(this.h2, dp22));
        vVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h2, (mhVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.l1 + AndroidUtilities.dp(8.0f)));
        if (this.Y) {
        }
        g1();
        int i122 = 59;
        if (this.i0 != null) {
        }
        f11 = 0.0f;
        f12 = 0.0f;
        if (this.j0 != null) {
        }
        f13 = 0.0f;
        f14 = 0.0f;
        eVar = this.b1;
        if (eVar != null) {
        }
        float max2222 = Math.max(f13, f11);
        this.d1 = max2222;
        if (eVar == null) {
        }
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (!(o2Var instanceof org.telegram.ui.qn)) {
            return false;
        }
        return ChatActivityEnterView.H(this.F1, ((org.telegram.ui.qn) o2Var).a(), o2Var, charSequence);
    }

    public final void b2() {
        int i9 = 0;
        a2(0);
        this.n1.invalidate();
        fh.v vVar = this.K0;
        vVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        if (chatAttachAlertPhotoLayout != null) {
            kl klVar = chatAttachAlertPhotoLayout.A;
            chatAttachAlertPhotoLayout.U();
            if (klVar != null && klVar.getFastScroll() != null) {
                fk0 fastScroll = klVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.l1;
                if (this.Y) {
                    i9 = (int) (vVar.getAlpha() * vVar.getMeasuredHeight());
                }
                fastScroll.d0 = currentActionBarHeight + i9;
                klVar.getFastScroll().invalidate();
            }
        }
        U1();
        g1();
    }

    public final void c1() {
        nh nhVar = this.u1;
        if (nhVar == null) {
            return;
        }
        int childCount = nhVar.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            nhVar.getChildAt(i9);
        }
        boolean z10 = this.d2;
        this.f1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.f6.hg : org.telegram.ui.ActionBar.f6.j5));
        this.k1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.f6.hg : org.telegram.ui.ActionBar.f6.j5));
        this.b1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
        int themedColor = getThemedColor(z10 ? org.telegram.ui.ActionBar.f6.hg : org.telegram.ui.ActionBar.f6.j5);
        org.telegram.ui.ActionBar.w0 w0Var = this.W0;
        w0Var.setIconColor(themedColor);
        org.telegram.ui.ActionBar.f6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.f6.ig : org.telegram.ui.ActionBar.f6.I5), w0Var.getBackground());
        int i10 = org.telegram.ui.ActionBar.f6.E8;
        w0Var.G(getThemedColor(i10), false);
        w0Var.G(getThemedColor(i10), true);
        w0Var.B(getThemedColor(org.telegram.ui.ActionBar.f6.G8));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.Y0;
        if (w0Var2 != null) {
            w0Var2.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.f6.hg : org.telegram.ui.ActionBar.f6.j5));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.a1;
        if (w0Var3 != null) {
            w0Var3.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.f6.hg : org.telegram.ui.ActionBar.f6.j5));
            org.telegram.ui.ActionBar.f6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.f6.ig : org.telegram.ui.ActionBar.f6.I5), w0Var3.getBackground());
        }
        qh qhVar = this.A0;
        org.telegram.ui.ActionBar.b6 b6Var = qhVar.I;
        pt ptVar = qhVar.a;
        int i11 = qhVar.H;
        if (i11 == 0) {
            ptVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, b6Var));
            int i12 = org.telegram.ui.ActionBar.f6.G6;
            ptVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
            ptVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        } else if (i11 == 2 || i11 == 3) {
            ptVar.setHintTextColor(-1929379841);
            ptVar.setTextColor(-1);
            ptVar.setCursorColor(-1);
            ptVar.setHandlesColor(-1);
            ptVar.setHighlightColor(822083583);
            ptVar.quoteColor = -1;
        } else {
            ptVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.t5, b6Var));
            ptVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var));
        }
        qhVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xd, b6Var), PorterDuff.Mode.MULTIPLY));
        qt qtVar = qhVar.d;
        if (qtVar != null) {
            qtVar.T();
        }
        nhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.f6.A5));
        int themedColor2 = getThemedColor(z10 ? org.telegram.ui.ActionBar.f6.hg : org.telegram.ui.ActionBar.f6.j5);
        r7 r7Var = this.T0;
        r7Var.C(themedColor2, false);
        r7Var.A(getThemedColor(z10 ? org.telegram.ui.ActionBar.f6.ig : org.telegram.ui.ActionBar.f6.I5), false);
        r7Var.setTitleColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.f6.hg : org.telegram.ui.ActionBar.f6.j5));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.f6.w1(q12, this.shadowDrawable);
        ng.c cVar = this.B2;
        if (cVar.a.getColor() != q12) {
            cVar.a(q12);
            rg.f fVar = this.r1;
            if (fVar != null) {
                fVar.invalidate();
            }
            oh ohVar = this.s1;
            if (ohVar != null) {
                ohVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i13 = 0;
        while (true) {
            ci[] ciVarArr = this.s0;
            if (i13 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i13];
            if (ciVar != null) {
                ciVar.d();
            }
            i13++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.h5));
            return;
        }
        this.navBarColorKey = -1;
        this.navBarColor = getThemedColor(org.telegram.ui.ActionBar.f6.i5);
        AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(org.telegram.ui.ActionBar.f6.h5), false);
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
            o1.j jVar = this.l2;
            if (jVar != null) {
                jVar.c();
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
        if (o2Var == null || !(o2Var instanceof org.telegram.ui.qn)) {
            return;
        }
        org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
        ut utVar = this.Y ? this.L0 : this.A0;
        String obj = utVar != null ? utVar.getText().toString() : null;
        if (this.D1 == null) {
            ci ciVar = this.u0;
            z11 = true;
            if (ciVar != null) {
            }
            if (ff.x.g(this.F1).e(obj, qnVar.Z7) <= 0) {
                MessageObject messageObject = qnVar.j5;
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 != NotificationCenter.reloadInlineHints && i9 != NotificationCenter.attachMenuBotsDidLoad && i9 != NotificationCenter.quickRepliesUpdated) {
            if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.G = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
            }
        } else {
            hi hiVar = this.w1;
            if (hiVar != null) {
                hiVar.l();
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
        ii iiVar = this.V1;
        if (iiVar != null) {
            iiVar.t(new wg(this, 2));
        } else {
            F1();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissWithButtonClick(int i9) {
        super.dismissWithButtonClick(i9);
        this.u0.o(i9);
    }

    public final void e1() {
        float f10 = this.c.e;
        this.s1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.d.e))), 1.0f - ((1.0f - this.b.e) * f10)));
    }

    public final void f1() {
        j10.d(this.B0, e2.c.C(this.e.e, this.f.e, ff.m0.b(this.h.e), this.N1 ? 0.0f : 1.0f));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean g() {
        return true;
    }

    public final void g1() {
        vh vhVar = this.E0;
        mh mhVar = this.D0;
        fh.v vVar = this.K0;
        if (vVar == null || vVar.getVisibility() != 0 || vVar.getAlpha() == 0.0f) {
            mhVar.setTranslationY(this.c2);
            vhVar.setAlpha(1.0f);
            return;
        }
        float f10 = this.b.e;
        float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f10));
        vhVar.setAlpha(abs * abs * abs * abs);
        mhVar.setTranslationY(AndroidUtilities.lerp(this.c2, ((vVar.getTranslationY() + vVar.getTop()) - mhVar.getTop()) + AndroidUtilities.dp(8.0f), gr.j.getInterpolation(f10)));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (true) {
            ci[] ciVarArr = this.s0;
            if (i9 >= ciVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.i5));
                return arrayList;
            }
            ci ciVar = ciVarArr[i9];
            if (ciVar != null && (themeDescriptions = ciVar.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i9++;
        }
    }

    public final void h1(int i9) {
        this.O0 = true;
        this.t1.setVisibility(0);
        this.D = true;
        this.E = i9;
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

    public final void i1(kh.b8 b8Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f1;
        textView.setText(string);
        this.O0 = false;
        this.t1.setVisibility(8);
        this.M0 = 1;
        this.B = true;
        this.C = true;
        this.e0 = false;
        this.F = b8Var;
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
        if (!(o2Var instanceof org.telegram.ui.qn) || (messagePreviewParams = ((org.telegram.ui.qn) o2Var).b5) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        return o2Var instanceof org.telegram.ui.qn ? ((org.telegram.ui.qn) o2Var).e : MessagesController.getInstance(this.F1).getChat(Long.valueOf(-this.V));
    }

    public final float l1() {
        return r0.getMeasuredHeight() - ((1.0f - this.z0.getAlpha()) * (r0.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final ut m1() {
        ci ciVar;
        return (this.Y && ((ciVar = this.u0) == this.f0 || ciVar == this.m0)) ? this.L0 : this.A0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        return o2Var instanceof org.telegram.ui.qn ? ((org.telegram.ui.qn) o2Var).a() : this.V;
    }

    public final int o1() {
        ci ciVar = this.u0;
        jn jnVar = this.i0;
        if (ciVar == jnVar && jnVar.A != null) {
            return jnVar.getEmojiPadding();
        }
        jn jnVar2 = this.j0;
        return (ciVar != jnVar2 || jnVar2.A == null) ? this.Y ? this.L0.getEmojiPadding() : this.A0.getEmojiPadding() : jnVar2.getEmojiPadding();
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
        r7 r7Var = this.T0;
        if (r7Var.j0) {
            r7Var.h(true);
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
    public final boolean onCustomLayout(View view, int i9, int i10, int i11, int i12) {
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        i81 i81Var = chatAttachAlertPhotoLayout.h0;
        fh.d2 d2Var = chatAttachAlertPhotoLayout.f0;
        TextView textView = chatAttachAlertPhotoLayout.l0;
        kl klVar = chatAttachAlertPhotoLayout.r;
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        boolean z10 = i13 < i14;
        int i15 = AndroidUtilities.navigationBarHeight;
        if (view == d2Var) {
            if (z10) {
                if (klVar.getVisibility() == 0) {
                    d2Var.layout(0, org.telegram.messenger.l0.B(222.0f, i12, i15), i13, org.telegram.messenger.l0.B(96.0f, i12, i15));
                    return true;
                }
                d2Var.layout(0, org.telegram.messenger.l0.B(126.0f, i12, i15), i13, i12 - i15);
                return true;
            }
            if (klVar.getVisibility() == 0) {
                d2Var.layout(org.telegram.messenger.l0.B(222.0f, i11, i15), 0, i11 - AndroidUtilities.dp(96.0f), i14 - i15);
                return true;
            }
            d2Var.layout(org.telegram.messenger.l0.B(126.0f, i11, i15), 0, i11, i14 - i15);
            return true;
        }
        if (view == i81Var) {
            if (z10) {
                if (klVar.getVisibility() == 0) {
                    i81Var.layout(0, org.telegram.messenger.l0.B(310.0f, i12, i15), i13, org.telegram.messenger.l0.B(260.0f, i12, i15));
                    return true;
                }
                i81Var.layout(0, org.telegram.messenger.l0.B(176.0f, i12, i15), i13, org.telegram.messenger.l0.B(126.0f, i12, i15));
                return true;
            }
            if (klVar.getVisibility() == 0) {
                i81Var.layout(org.telegram.messenger.l0.B(310.0f, i11, i15), 0, i11 - AndroidUtilities.dp(260.0f), i14 - i15);
                return true;
            }
            i81Var.layout(org.telegram.messenger.l0.B(176.0f, i11, i15), 0, i11 - AndroidUtilities.dp(126.0f), i14 - i15);
            return true;
        }
        if (view != textView) {
            if (view != klVar) {
                return false;
            }
            if (z10) {
                int B = org.telegram.messenger.l0.B(88.0f, i14, i15);
                view.layout(0, B, view.getMeasuredWidth(), view.getMeasuredHeight() + B);
                return true;
            }
            int dp2 = (i9 + i13) - AndroidUtilities.dp(88.0f);
            view.layout(dp2, 0, view.getMeasuredWidth() + dp2, view.getMeasuredHeight());
            return true;
        }
        if (z10) {
            dp = (i13 - textView.getMeasuredWidth()) / 2;
            int dp3 = i12 - AndroidUtilities.dp(167.0f);
            textView.setRotation(0.0f);
            if (klVar.getVisibility() == 0) {
                dp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = dp3 - i15;
        } else {
            dp = i11 - AndroidUtilities.dp(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i14 / 2);
            textView.setRotation(-90.0f);
            if (klVar.getVisibility() == 0) {
                dp -= AndroidUtilities.dp(96.0f);
            }
        }
        textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomMeasure(View view, int i9, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        yl ylVar = chatAttachAlertPhotoLayout.v;
        kl klVar = chatAttachAlertPhotoLayout.r;
        of.y yVar = chatAttachAlertPhotoLayout.s;
        boolean z10 = i9 < i10;
        ul ulVar = chatAttachAlertPhotoLayout.L;
        if (view != ulVar) {
            fh.d2 d2Var = chatAttachAlertPhotoLayout.f0;
            if (view == d2Var) {
                if (z10) {
                    d2Var.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30));
                    return true;
                }
                d2Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            i81 i81Var = chatAttachAlertPhotoLayout.h0;
            if (view == i81Var) {
                if (z10) {
                    i81Var.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                    return true;
                }
                i81Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                return true;
            }
            if (view == klVar) {
                chatAttachAlertPhotoLayout.F0 = true;
                if (z10) {
                    klVar.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
                    if (yVar.o != 0) {
                        klVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        yVar.j1(0);
                        ylVar.l();
                    }
                } else {
                    klVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                    if (yVar.o != 1) {
                        klVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        yVar.j1(1);
                        ylVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.F0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.U && !chatAttachAlertPhotoLayout.W) {
            ulVar.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
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
        int i9 = 2;
        yh yhVar = this.k2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, yhVar, 0.0f, 400.0f));
        this.m2.setDuration(400L);
        this.m2.setStartDelay(20L);
        yhVar.set(this, Float.valueOf(0.0f));
        this.m2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new ug(this, i9));
        o1.j jVar = this.l2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(this.containerView, o1.h.n, 0.0f);
        this.l2 = jVar2;
        if (this.D1 != null) {
            jVar2.u.a(0.75f);
            this.l2.u.b(350.0f);
        } else {
            jVar2.u.a(0.75f);
            this.l2.u.b(350.0f);
        }
        this.l2.f();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.backDrawable, m6.d, this.dimBehind ? this.dimBehindAlpha : 0));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        org.telegram.messenger.video.e eVar = new org.telegram.messenger.video.e(this, animationNotificationsLocker, this.delegate, 16);
        this.l2.a(new mh.c4(i9, this, eVar));
        this.currentSheetAnimation.addListener(new fg.j(20, this, eVar));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new ug(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(gr.f);
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
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (this.u0.C(i9)) {
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        if (this.b0 instanceof org.telegram.ui.qn) {
            int i9 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i10 = MediaController.VIDEO_BITRATE_1080;
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

    public final int p1(int i9) {
        ci ciVar = this.v0;
        int[] iArr = this.X1;
        return (ciVar == null || !((this.u0 instanceof hm) || (ciVar instanceof hm))) ? iArr[i9] : AndroidUtilities.lerp(iArr[0], iArr[1], this.Z);
    }

    public final int q1(boolean z10) {
        r7 r7Var;
        if (this.d2) {
            return getThemedColor(org.telegram.ui.ActionBar.f6.tg);
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.resourcesProvider;
        boolean a2 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
        Iterator it = this.n.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            td.e eVar = (td.e) it.next();
            long longValue = ((Long) eVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a3 = g7.n.a(f10, 0.0f, 1.0f);
        if (z10 && (r7Var = this.T0) != null && r7Var.getVisibility() == 0) {
            a3 *= 1.0f - r7Var.getAlpha();
        }
        return i0.a.d(a3, getThemedColor(org.telegram.ui.ActionBar.f6.h5), getThemedColor(a2 ? org.telegram.ui.ActionBar.f6.a7 : org.telegram.ui.ActionBar.f6.i5));
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
        ki kiVar;
        ul ulVar;
        MediaController.AlbumEntry albumEntry;
        ci ciVar;
        this.J0 = 0L;
        this.E0.setEffect(0L);
        int i9 = 0;
        this.z1 = false;
        this.x1 = false;
        this.B1 = 0.0f;
        this.A1.setVisibility(8);
        RadialProgressView radialProgressView = this.y1;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        mh mhVar = this.t1;
        mhVar.setAlpha(1.0f);
        mhVar.setTranslationY(0.0f);
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.t0;
            if (i10 >= longSparseArray.size()) {
                break;
            }
            ((mh.g4) longSparseArray.valueAt(i10)).setMeasureOffsetY(0);
            i10++;
        }
        int i11 = this.M0;
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (i11 != 2) {
            if (o2Var instanceof org.telegram.ui.qn) {
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
                chat = qnVar.e;
                user = qnVar.i();
            } else {
                long j10 = this.V;
                int i12 = this.F1;
                if (j10 >= 0) {
                    user = MessagesController.getInstance(i12).getUser(Long.valueOf(this.V));
                    chat = null;
                } else if (j10 < 0) {
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-this.V));
                    user = null;
                }
            }
            z10 = o2Var instanceof org.telegram.ui.qn;
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
                    this.L1 = !z10 || ((org.telegram.ui.qn) o2Var).h == null;
                }
            }
            if (this.N1) {
                this.K1 = false;
                this.L1 = false;
            }
            qh qhVar = this.A0;
            if (z10 || this.M0 == 2) {
                qhVar.setVisibility(this.S ? 0 : 4);
            }
            boolean z11 = this.I1;
            boolean z12 = this.H1;
            boolean z13 = this.G1;
            chatAttachAlertPhotoLayout = this.f0;
            kiVar = chatAttachAlertPhotoLayout.b;
            yy yyVar = chatAttachAlertPhotoLayout.D;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.r0 = z14;
            chatAttachAlertPhotoLayout.s0 = z11;
            chatAttachAlertPhotoLayout.t0 = z12;
            chatAttachAlertPhotoLayout.v0 = z13;
            ulVar = chatAttachAlertPhotoLayout.L;
            if (ulVar != null) {
                ulVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.L.setEnabled(chatAttachAlertPhotoLayout.r0);
            }
            if (!((kiVar.b0 instanceof org.telegram.ui.qn) && kiVar.k1() == null) && kiVar.M0 == 0) {
                chatAttachAlertPhotoLayout.Q0 = MediaController.allMediaAlbumEntry;
                if (chatAttachAlertPhotoLayout.r0) {
                    yyVar.setText(LocaleController.getString(R.string.NoPhotos));
                    yyVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat k12 = kiVar.k1();
                    yyVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    if (ChatObject.isActionBannedByDefault(k12, 7)) {
                        yyVar.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else if (AndroidUtilities.isBannedForever(k12.banned_rights)) {
                        yyVar.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                    } else {
                        yyVar.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(k12.banned_rights.until_date)));
                    }
                }
            } else if (chatAttachAlertPhotoLayout.p0()) {
                chatAttachAlertPhotoLayout.Q0 = MediaController.allMediaAlbumEntry;
            } else {
                chatAttachAlertPhotoLayout.Q0 = MediaController.allPhotosAlbumEntry;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                chatAttachAlertPhotoLayout.L0 = chatAttachAlertPhotoLayout.d0();
            }
            if (chatAttachAlertPhotoLayout.Q0 != null) {
                for (int i13 = 0; i13 < Math.min(100, chatAttachAlertPhotoLayout.Q0.photos.size()); i13++) {
                    chatAttachAlertPhotoLayout.Q0.photos.get(i13).reset();
                }
            }
            chatAttachAlertPhotoLayout.Y();
            chatAttachAlertPhotoLayout.x0(false);
            chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.B.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
            albumEntry = chatAttachAlertPhotoLayout.Q0;
            chatAttachAlertPhotoLayout.P0 = albumEntry;
            if (albumEntry != null) {
                chatAttachAlertPhotoLayout.T0 = false;
                if (yyVar != null) {
                    yyVar.c();
                }
            }
            chatAttachAlertPhotoLayout.t0();
            qhVar.k(true);
            this.L0.k(true);
            this.q1 = false;
            setFocusable(false);
            if (!this.K || this.L) {
                if (this.k0 == null) {
                    xk xkVar = new xk(this, getContext(), this.resourcesProvider, (this.D || this.L || this.N1) ? false : true);
                    this.k0 = xkVar;
                    this.s0[5] = xkVar;
                    sk skVar = this.p2;
                    if (skVar != null) {
                        xkVar.setDelegate(skVar);
                    } else {
                        xkVar.setDelegate(new tg(this, i9));
                    }
                }
                this.S0 = 5L;
                ciVar = this.k0;
            } else if (this.J) {
                E1(false);
                ciVar = this.l0;
                this.S0 = 4L;
            } else {
                MessageObject messageObject = this.D1;
                if (messageObject != null) {
                    int i14 = this.C1;
                    if (i14 == -1) {
                        this.O0 = true;
                        if (messageObject.isMusic()) {
                            B1(false);
                            ciVar = this.h0;
                            this.S0 = 3L;
                        } else if (this.D1.isDocument()) {
                            E1(false);
                            ciVar = this.l0;
                            this.S0 = 4L;
                        } else {
                            this.S0 = 1L;
                        }
                    } else {
                        if (i14 == 2) {
                            B1(false);
                            ciVar = this.h0;
                            this.S0 = 3L;
                        } else if (i14 == 1) {
                            E1(false);
                            ciVar = this.l0;
                            this.S0 = 4L;
                        } else {
                            this.S0 = 1L;
                            ciVar = chatAttachAlertPhotoLayout;
                        }
                        this.O0 = false;
                    }
                } else {
                    this.O0 = this.M0 == 0 && !this.P0;
                    this.S0 = 1L;
                }
                ciVar = chatAttachAlertPhotoLayout;
            }
            mhVar.setVisibility(this.O0 ? 0 : 8);
            if (this.u0 != ciVar) {
                r7 r7Var = this.T0;
                if (r7Var.j0) {
                    r7Var.h(true);
                }
                this.containerView.removeView(this.u0);
                this.u0.r();
                this.u0.setVisibility(8);
                this.u0.q();
                this.u0 = ciVar;
                this.allowNestedScroll = true;
                if (ciVar.getParent() == null) {
                    this.containerView.addView(this.u0, 0, g7.e6.c(-1.0f, -1));
                }
                ciVar.setAlpha(1.0f);
                ciVar.setVisibility(0);
                ciVar.D(null);
                ciVar.E();
                r7Var.setVisibility(ciVar.h() != 0 ? 0 : 4);
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
        z10 = o2Var instanceof org.telegram.ui.qn;
        if (z10) {
            if (chat != null) {
            }
            if (this.N1) {
            }
            qh qhVar2 = this.A0;
            if (z10) {
            }
            qhVar2.setVisibility(this.S ? 0 : 4);
            boolean z112 = this.I1;
            boolean z122 = this.H1;
            boolean z132 = this.G1;
            chatAttachAlertPhotoLayout = this.f0;
            kiVar = chatAttachAlertPhotoLayout.b;
            yy yyVar2 = chatAttachAlertPhotoLayout.D;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.r0 = z14;
            chatAttachAlertPhotoLayout.s0 = z112;
            chatAttachAlertPhotoLayout.t0 = z122;
            chatAttachAlertPhotoLayout.v0 = z132;
            ulVar = chatAttachAlertPhotoLayout.L;
            if (ulVar != null) {
            }
            if (kiVar.b0 instanceof org.telegram.ui.qn) {
            }
            chatAttachAlertPhotoLayout.Q0 = MediaController.allMediaAlbumEntry;
            if (chatAttachAlertPhotoLayout.r0) {
            }
            if (Build.VERSION.SDK_INT >= 23) {
            }
            if (chatAttachAlertPhotoLayout.Q0 != null) {
            }
            chatAttachAlertPhotoLayout.Y();
            chatAttachAlertPhotoLayout.x0(false);
            chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.B.h1(0, MediaController.VIDEO_BITRATE_480);
            chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
            albumEntry = chatAttachAlertPhotoLayout.Q0;
            chatAttachAlertPhotoLayout.P0 = albumEntry;
            if (albumEntry != null) {
            }
            chatAttachAlertPhotoLayout.t0();
            qhVar2.k(true);
            this.L0.k(true);
            this.q1 = false;
            setFocusable(false);
            if (this.K) {
            }
            if (this.k0 == null) {
            }
            this.S0 = 5L;
            ciVar = this.k0;
            mhVar.setVisibility(this.O0 ? 0 : 8);
            if (this.u0 != ciVar) {
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
        qh qhVar22 = this.A0;
        if (z10) {
        }
        qhVar22.setVisibility(this.S ? 0 : 4);
        boolean z1122 = this.I1;
        boolean z1222 = this.H1;
        boolean z1322 = this.G1;
        chatAttachAlertPhotoLayout = this.f0;
        kiVar = chatAttachAlertPhotoLayout.b;
        yy yyVar22 = chatAttachAlertPhotoLayout.D;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.r0 = z14;
        chatAttachAlertPhotoLayout.s0 = z1122;
        chatAttachAlertPhotoLayout.t0 = z1222;
        chatAttachAlertPhotoLayout.v0 = z1322;
        ulVar = chatAttachAlertPhotoLayout.L;
        if (ulVar != null) {
        }
        if (kiVar.b0 instanceof org.telegram.ui.qn) {
        }
        chatAttachAlertPhotoLayout.Q0 = MediaController.allMediaAlbumEntry;
        if (chatAttachAlertPhotoLayout.r0) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
        }
        if (chatAttachAlertPhotoLayout.Q0 != null) {
        }
        chatAttachAlertPhotoLayout.Y();
        chatAttachAlertPhotoLayout.x0(false);
        chatAttachAlertPhotoLayout.s.h1(0, MediaController.VIDEO_BITRATE_480);
        chatAttachAlertPhotoLayout.B.h1(0, MediaController.VIDEO_BITRATE_480);
        chatAttachAlertPhotoLayout.x.setText(LocaleController.getString(R.string.ChatGallery));
        albumEntry = chatAttachAlertPhotoLayout.Q0;
        chatAttachAlertPhotoLayout.P0 = albumEntry;
        if (albumEntry != null) {
        }
        chatAttachAlertPhotoLayout.t0();
        qhVar22.k(true);
        this.L0.k(true);
        this.q1 = false;
        setFocusable(false);
        if (this.K) {
        }
        if (this.k0 == null) {
        }
        this.S0 = 5L;
        ciVar = this.k0;
        mhVar.setVisibility(this.O0 ? 0 : 8);
        if (this.u0 != ciVar) {
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
        ci ciVar = this.u0;
        return ciVar == this.f0 || ciVar == this.m0;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean shouldOverlayCameraViewOverNavBar() {
        ci ciVar = this.u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        return ciVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.e1;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        this.E1 = false;
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            this.calcMandatoryInsets = ((org.telegram.ui.qn) o2Var).x9();
        }
        W1();
        this.o1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.f6.a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.i2) {
            this.i2 = false;
            r7 r7Var = this.T0;
            r7Var.d();
            r7Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        ii iiVar = this.V1;
        if (iiVar == null || this.q1) {
            return;
        }
        boolean j10 = iiVar.j();
        this.q1 = true;
        AndroidUtilities.runOnUIThread(new gh.u5(this, editTextBoldCursor, z10, 15), j10 ? 200L : 0L);
    }

    public final void u1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int q12 = q1(false);
        org.telegram.ui.ActionBar.f6.w1(q12, this.shadowDrawable);
        ng.c cVar = this.B2;
        if (cVar.a.getColor() != q12) {
            cVar.a(q12);
            rg.f fVar = this.r1;
            if (fVar != null) {
                fVar.invalidate();
            }
            oh ohVar = this.s1;
            if (ohVar != null) {
                ohVar.invalidate();
            }
        }
        W1();
        this.containerView.invalidate();
    }

    public final void v1() {
        int i9 = 0;
        while (true) {
            ci[] ciVarArr = this.s0;
            if (i9 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i9];
            if (ciVar != null) {
                ciVar.m();
            }
            i9++;
        }
        int i10 = this.F1;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.R = true;
        qh qhVar = this.A0;
        if (qhVar != null) {
            qhVar.o();
        }
        th thVar = this.L0;
        if (thVar != null) {
            thVar.o();
        }
    }

    public final void w1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String userName = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : UserObject.getUserName(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F1).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i9);
            i9++;
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
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, tL_attachMenuBot, user, 22));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void x1() {
        int i9 = 0;
        while (true) {
            ci[] ciVarArr = this.s0;
            if (i9 >= ciVarArr.length) {
                this.b2 = true;
                return;
            }
            ci ciVar = ciVarArr[i9];
            if (ciVar != null) {
                ciVar.x();
            }
            i9++;
        }
    }

    public final void y1() {
        int i9 = 0;
        this.b2 = false;
        while (true) {
            ci[] ciVarArr = this.s0;
            if (i9 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i9];
            if (ciVar != null) {
                ciVar.z();
            }
            i9++;
        }
        if (isShowing()) {
            this.V1.j();
        }
        hi hiVar = this.w1;
        if (hiVar != null) {
            hiVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.D1;
        org.telegram.ui.ActionBar.o2 o2Var = this.b0;
        int i9 = this.F1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i9, this.D1.getDialogId()) && (o2Var instanceof org.telegram.ui.qn)) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
            MessageSuggestionParams messageSuggestionParams = qnVar.c5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.D1.messageOwner.suggested_post);
            }
            if (!gh.v7.U(i9, messageSuggestionParams.amount)) {
                qnVar.Tb(messageSuggestionParams);
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
            if (MessagesController.getInstance(i9).premiumFeaturesBlocked() || MessagesController.getInstance(i9).captionLengthLimitPremium <= this.H) {
                return;
            }
            O1(o2Var);
            return;
        }
        if (this.D1 == null && (o2Var instanceof org.telegram.ui.qn)) {
            org.telegram.ui.qn qnVar2 = (org.telegram.ui.qn) o2Var;
            if (qnVar2.c()) {
                y4.M(getContext(), qnVar2.a(), new tg(this, 12), this.resourcesProvider);
                return;
            }
        }
        ci ciVar = this.u0;
        if (ciVar == this.f0 || ciVar == this.m0) {
            G1(0, true, 0, s1(), this.J0);
            return;
        }
        if (ciVar.H(0, true, 0, s1(), this.J0)) {
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
        qh qhVar = this.A0;
        if (qhVar != null) {
            AndroidUtilities.hideKeyboard(qhVar.getEditText());
        }
        th thVar = this.L0;
        if (thVar != null) {
            AndroidUtilities.hideKeyboard(thVar.getEditText());
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
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new tg(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new zg(this, 0));
            a1 a1Var = new a1(this, 4);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.J = a1Var;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.q7));
                return;
            }
            return;
        }
        int i9 = 0;
        while (true) {
            ci[] ciVarArr = this.s0;
            if (i9 >= ciVarArr.length) {
                break;
            }
            ci ciVar = ciVarArr[i9];
            if (ciVar != null && this.u0 != ciVar) {
                ciVar.n();
            }
            i9++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.a.k(getThemedColor(org.telegram.ui.ActionBar.f6.a7), 0), true, (AndroidUtilities.IntColorCallback) new tg(this, 11));
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
        this.e2 = false;
        super.dismiss();
        this.w2 = false;
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }

    public ki(Activity activity, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11) {
        this(activity, o2Var, z10, z11, true, null);
    }
}

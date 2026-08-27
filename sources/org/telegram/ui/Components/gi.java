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
import org.telegram.ui.ei1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class gi extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.y2, ud.b {
    public static final /* synthetic */ int K2 = 0;
    public final i0 A;
    public final mh A0;
    public final j6 A1;
    public final og.d A2;
    public boolean B;
    public final ImageView B0;
    public float B1;
    public final og.c B2;
    public boolean C;
    public final int[] C0;
    public int C1;
    public final jg.a C2;
    public boolean D;
    public final ih D0;
    public MessageObject D1;
    public final jg.a D2;
    public int E;
    public final rh E0;
    public boolean E1;
    public final wg E2;
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
    public final ag.y1 K0;
    public boolean K1;
    public boolean L;
    public final ph L0;
    public boolean L1;
    public h40 M;
    public int M0;
    public boolean M1;
    public boolean N;
    public bt N0;
    public boolean N1;
    public final dd0 O;
    public boolean O0;
    public int O1;
    public jn P;
    public boolean P0;
    public boolean P1;
    public j40 Q;
    public boolean Q0;
    public boolean Q1;
    public boolean R;
    public final float R0;
    public float R1;
    public boolean S;
    public long S0;
    public float S1;
    public sj T;
    public final ag.d2 T0;
    public ValueAnimator T1;
    public oi U;
    public AnimatorSet U0;
    public int U1;
    public long V;
    public AnimatorSet V0;
    public ei V1;
    public boolean W;
    public final org.telegram.ui.ActionBar.v0 W0;
    public tm W1;
    public final jg.b X;
    public final lh.v X0;
    public final int[] X1;
    public boolean Y;
    public final org.telegram.ui.ActionBar.v0 Y0;
    public int Y1;
    public float Z;
    public lh.w3 Z0;
    public float Z1;
    public final uh a0;
    public final org.telegram.ui.ActionBar.v0 a1;
    public float a2;
    public final ud.a b;
    public final org.telegram.ui.ActionBar.n2 b0;
    public final ag.e1 b1;
    public boolean b2;
    public final ud.a c;
    public final boolean c0;
    public float c1;
    public float c2;
    public final ud.a d;
    public ye d0;
    public float d1;
    public final boolean d2;
    public final ud.a e;
    public boolean e0;
    public final ih e1;
    public boolean e2;
    public final ud.a f;
    public final ChatAttachAlertPhotoLayout f0;
    public final TextView f1;
    public final ArrayList f2;
    public lj g0;
    public final org.telegram.ui.ActionBar.v0 g1;
    public final Rect g2;
    public final ud.a h;
    public ri h0;
    public final LinearLayout h1;
    public float h2;
    public in i0;
    public final ImageView i1;
    public boolean i2;
    public in j0;
    public final LinearLayout j1;
    public int j2;
    public tk k0;
    public final TextView k1;
    public final uh k2;
    public bk l0;
    public float l1;
    public o1.j l2;
    public em m0;
    public boolean m1;
    public AnimatorSet m2;
    public final ud.j n;
    public ui n0;
    public final wh n1;
    public boolean n2;
    public qf.e0 o0;
    public boolean o1;
    public boolean o2;
    public ck p0;
    public Object p1;
    public ok p2;
    public ck q0;
    public boolean q1;
    public boolean q2;
    public org.telegram.ui.pn r;
    public rh.p r0;
    public final sg.f r1;
    public boolean r2;
    public final j6 s;
    public final yh[] s0;
    public final kh s1;
    public File s2;
    public final LongSparseArray t0;
    public final ih t1;
    public double[] t2;
    public yh u0;
    public final jh u1;
    public boolean u2;
    public final j6 v;
    public yh v0;
    public final f2.k0 v1;
    public boolean v2;
    public final ImageView w;
    public final lg.d w0;
    public final di w1;
    public boolean w2;
    public final i0 x;
    public final lg.d x0;
    public boolean x1;
    public lh.i x2;
    public final ImageView y;
    public final lh y0;
    public final RadialProgressView y1;
    public final jg.e y2;
    public final ih z0;
    public boolean z1;
    public final og.d z2;

    public gi(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        org.telegram.ui.ActionBar.v0 v0Var;
        ag.e1 e1Var;
        int i10;
        float f10;
        er erVar = er.h;
        this.b = new ud.a(0, this, erVar, 380L, false);
        this.c = new ud.a(1, this, erVar, 380L, false);
        this.d = new ud.a(2, this, erVar, 380L, false);
        this.e = new ud.a(3, this, erVar, 380L, false);
        this.f = new ud.a(4, this, erVar, 380L, true);
        this.h = new ud.a(5, this, erVar, 320L, false);
        ud.j jVar = new ud.j(new pg(this, 1), erVar, 380L);
        this.n = jVar;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.Z = 0.0f;
        this.a0 = new uh(this, 0);
        this.e0 = false;
        yh[] yhVarArr = new yh[11];
        this.s0 = yhVarArr;
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
        this.k2 = new uh(this, 1);
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
        boolean z13 = n2Var instanceof org.telegram.ui.rn;
        og.c cVar = new og.c();
        this.B2 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.y2 = new jg.e(false);
            og.d dVar = new og.d(null);
            this.A2 = dVar;
            int i12 = 9;
            dVar.i(new n1.d(this, i12));
            og.d dVar2 = new og.d(null);
            this.z2 = dVar2;
            dVar2.i(new m5.o(this, i12));
            jg.a aVar = new jg.a(dVar);
            this.C2 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            jg.a aVar2 = new jg.a(dVar2);
            this.D2 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
        } else {
            this.y2 = null;
            this.z2 = null;
            this.A2 = null;
            this.C2 = new jg.a(cVar);
            this.D2 = new jg.a(cVar);
        }
        jg.a aVar3 = new jg.a(cVar);
        this.E2 = new wg(this, 0);
        this.d2 = z10;
        this.c0 = z13 && n2Var.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.b0 = n2Var;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        wh whVar = new wh(this, context);
        this.n1 = whVar;
        whVar.setDelegate(new xh(this));
        this.containerView = whVar;
        whVar.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        ag.d2 d2Var = new ag.d2(this, context, c6Var, 2);
        this.T0 = d2Var;
        d2Var.O0 = true;
        d2Var.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        d2Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(false));
        int i14 = org.telegram.ui.ActionBar.g6.j5;
        d2Var.D(getThemedColor(i14), false);
        int i15 = org.telegram.ui.ActionBar.g6.I5;
        d2Var.C(getThemedColor(i15), false);
        d2Var.setTitleColor(getThemedColor(i14));
        d2Var.setOccupyStatusBar(true);
        d2Var.setAlpha(0.0f);
        final int i16 = 4;
        d2Var.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, i16));
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i14), false, c6Var);
        this.W0 = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setIcon(R.drawable.ic_ab_other);
        v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var2.setVisibility(4);
        v0Var2.setAlpha(0.0f);
        v0Var2.setScaleX(0.6f);
        v0Var2.setScaleY(0.6f);
        v0Var2.setSubMenuOpenSide(2);
        v0Var2.setDelegate(new pg(this, 8));
        v0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        v0Var2.setTranslationX(AndroidUtilities.dp(1.0f));
        v0Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i15), 6, -1));
        v0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tg
            public final /* synthetic */ gi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i16) {
                    case 0:
                        gi giVar = this.b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                            break;
                        }
                        break;
                    case 2:
                        gi giVar3 = this.b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
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
                        gi.t(this.b);
                        break;
                    case 6:
                        yh yhVar = this.b.u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.b;
                        giVar4.Z1(giVar4.u0 != giVar4.m0);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i14), false, c6Var);
        this.Y0 = v0Var3;
        v0Var3.setLongClickEnabled(false);
        lh.v vVar = new lh.v();
        this.X0 = vVar;
        v0Var3.setIcon(vVar);
        v0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var3.setVisibility(8);
        v0Var3.setAlpha(0.0f);
        v0Var3.setScaleX(0.6f);
        v0Var3.setScaleY(0.6f);
        v0Var3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        v0Var3.setTranslationX(-AndroidUtilities.dp(3.0f));
        v0Var3.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i15), 6, -1));
        final int i17 = 5;
        v0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tg
            public final /* synthetic */ gi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i17) {
                    case 0:
                        gi giVar = this.b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                            break;
                        }
                        break;
                    case 2:
                        gi giVar3 = this.b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
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
                        gi.t(this.b);
                        break;
                    case 6:
                        yh yhVar = this.b.u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.b;
                        giVar4.Z1(giVar4.u0 != giVar4.m0);
                        break;
                }
            }
        });
        ag.e1 e1Var2 = new ag.e1(this, context);
        e1Var2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        e1Var2.setText(LocaleController.getString(R.string.Create));
        e1Var2.setTypeface(AndroidUtilities.bold());
        e1Var2.setTextSize(1, 14.0f);
        e1Var2.setVisibility(4);
        e1Var2.setAlpha(0.0f);
        e1Var2.setGravity(17);
        e1Var2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        e1Var2.setTranslationX(-AndroidUtilities.dp(12.0f));
        final int i18 = 6;
        e1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tg
            public final /* synthetic */ gi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i18) {
                    case 0:
                        gi giVar = this.b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                            break;
                        }
                        break;
                    case 2:
                        gi giVar3 = this.b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
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
                        gi.t(this.b);
                        break;
                    case 6:
                        yh yhVar = this.b.u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.b;
                        giVar4.Z1(giVar4.u0 != giVar4.m0);
                        break;
                }
            }
        });
        h7.b6.a(e1Var2);
        this.b1 = e1Var2;
        W1();
        if (n2Var != null) {
            e1Var = e1Var2;
            v0Var = v0Var3;
            i10 = -1;
            f10 = 14.0f;
            org.telegram.ui.ActionBar.v0 v0Var4 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i14), false, c6Var);
            this.a1 = v0Var4;
            v0Var4.setLongClickEnabled(false);
            v0Var4.setIcon(R.drawable.outline_header_search);
            v0Var4.setContentDescription(LocaleController.getString(R.string.Search));
            v0Var4.setVisibility(4);
            v0Var4.setAlpha(0.0f);
            v0Var4.setTranslationX(-AndroidUtilities.dp(42.0f));
            v0Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i15), 6, -1));
            v0Var4.setOnClickListener(new jh.a2(5, this, z11));
        } else {
            v0Var = v0Var3;
            e1Var = e1Var2;
            i10 = -1;
            f10 = 14.0f;
        }
        org.telegram.ui.ActionBar.v0 v0Var5 = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i14), false, c6Var);
        this.g1 = v0Var5;
        v0Var5.setLongClickEnabled(false);
        v0Var5.setIcon(R.drawable.ic_ab_other);
        v0Var5.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var5.setVisibility(8);
        v0Var5.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i15), 3, i10));
        final int i19 = 2;
        v0Var5.e(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ug
            public final /* synthetic */ gi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        final gi giVar = this.b;
                        mh mhVar = giVar.A0;
                        if (mhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(giVar.getContext(), c6Var);
                            e0Var.m0(mhVar.getText());
                            final int i20 = 0;
                            e0Var.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.xg
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i20) {
                                        case 0:
                                            mh mhVar2 = giVar.A0;
                                            mhVar2.setText(charSequence);
                                            mhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar = giVar.L0;
                                            phVar.setText(charSequence);
                                            phVar.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = giVar.V;
                            boolean z14 = giVar.D1 != null;
                            yg ygVar = new yg(giVar, 0);
                            e0Var.h0 = j10;
                            e0Var.i0 = z14;
                            e0Var.j0 = ygVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final gi giVar2 = this.b;
                        ph phVar = giVar2.L0;
                        if (phVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(giVar2.getContext(), c6Var);
                            e0Var2.m0(phVar.getText());
                            final int i21 = 1;
                            e0Var2.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.xg
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i21) {
                                        case 0:
                                            mh mhVar2 = giVar2.A0;
                                            mhVar2.setText(charSequence);
                                            mhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar2 = giVar2.L0;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = giVar2.V;
                            boolean z15 = giVar2.D1 != null;
                            yg ygVar2 = new yg(giVar2, 1);
                            e0Var2.h0 = j11;
                            e0Var2.i0 = z15;
                            e0Var2.j0 = ygVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        gi giVar3 = this.b;
                        giVar3.g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = giVar3.b0;
                        t12.K2(null, n2Var2, c6Var);
                        PhotoViewer.t1().L2(giVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i22 = giVar3.O1;
                        boolean z16 = giVar3.P1;
                        t13.h = i22;
                        t13.n = z16;
                        if (!giVar3.V1.s()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(giVar3.getContainer().findFocus());
                        }
                        File w10 = lh.z7.w(giVar3.F1, "webp");
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
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new hh(giVar3, photoEntry), n2Var2 instanceof org.telegram.ui.rn ? (org.telegram.ui.rn) n2Var2 : null);
                        if (giVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, giVar3.F);
                            break;
                        }
                        break;
                }
            }
        });
        v0Var5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        v0Var5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        final int i20 = 7;
        v0Var5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tg
            public final /* synthetic */ gi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i20) {
                    case 0:
                        gi giVar = this.b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                            break;
                        }
                        break;
                    case 2:
                        gi giVar3 = this.b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
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
                        gi.t(this.b);
                        break;
                    case 6:
                        yh yhVar = this.b.u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.b;
                        giVar4.Z1(giVar4.u0 != giVar4.m0);
                        break;
                }
            }
        });
        ih ihVar = new ih(this, context, 0);
        this.e1 = ihVar;
        final int i21 = 8;
        ihVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tg
            public final /* synthetic */ gi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i21) {
                    case 0:
                        gi giVar = this.b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                            break;
                        }
                        break;
                    case 2:
                        gi giVar3 = this.b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
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
                        gi.t(this.b);
                        break;
                    case 6:
                        yh yhVar = this.b.u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.b;
                        giVar4.Z1(giVar4.u0 != giVar4.m0);
                        break;
                }
            }
        });
        ihVar.setAlpha(0.0f);
        ihVar.setVisibility(4);
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
        linearLayout.addView(textView, h7.z5.q(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.i1 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, h7.z5.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        ihVar.addView(linearLayout, h7.z5.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.j1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i14), mode));
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, h7.z5.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.k1 = textView2;
        textView2.setTextColor(getThemedColor(i14));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, h7.z5.q(-2, -2, 16));
        ihVar.addView(linearLayout2, h7.z5.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z10, z12, c6Var);
        this.f0 = chatAttachAlertPhotoLayout;
        yhVarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.u0 = chatAttachAlertPhotoLayout;
        this.S0 = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, h7.z5.c(-1.0f, -1));
        sg.f fVar = new sg.f(context);
        this.r1 = fVar;
        fVar.setup(aVar3);
        fVar.setFadeTopAlpha(0);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(5.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(fVar, h7.z5.g());
        this.containerView.addView(ihVar, h7.z5.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        ag.y1 y1Var = new ag.y1(context);
        this.K0 = y1Var;
        this.containerView.addView(y1Var, h7.z5.e(-1, -2, 55));
        this.containerView.addView(d2Var, h7.z5.c(-2.0f, -1));
        this.containerView.addView(v0Var2, h7.z5.e(48, 48, 53));
        this.containerView.addView(v0Var, h7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var6 = this.a1;
        if (v0Var6 != null) {
            this.containerView.addView(v0Var6, h7.z5.e(48, 48, 53));
        }
        ihVar.addView(v0Var5, h7.z5.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(e1Var, h7.z5.e(-2, 48, 53));
        ih ihVar2 = new ih(this, context, 1);
        this.t1 = ihVar2;
        jh jhVar = new jh(context, 0);
        this.u1 = jhVar;
        jhVar.setClipChildren(true);
        jhVar.setClipToPadding(false);
        di diVar = new di(this, context);
        this.w1 = diVar;
        jhVar.setAdapter(diVar);
        f2.k0 k0Var = new f2.k0(0, false);
        this.v1 = k0Var;
        jhVar.setLayoutManager(k0Var);
        jhVar.setVerticalScrollBarEnabled(false);
        jhVar.setHorizontalScrollBarEnabled(false);
        jhVar.setItemAnimator(null);
        jhVar.setLayoutAnimation(null);
        jhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        jhVar.v2 = true;
        jhVar.setOverScrollMode(2);
        jg.a aVar4 = this.C2;
        qg.j jVar2 = new qg.j(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = jVar2;
        aVar4.e = viewGroup2;
        jg.a aVar5 = this.D2;
        qg.j jVar3 = new qg.j(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = jVar3;
        aVar5.e = viewGroup3;
        qg.j jVar4 = new qg.j(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        aVar3.d = jVar4;
        aVar3.e = viewGroup4;
        kh khVar = new kh(this, context, 0);
        this.s1 = khVar;
        jg.b bVar = new jg.b(aVar3.c(khVar, null, false));
        this.X = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(khVar, h7.z5.g());
        lg.d c10 = this.C2.c(ihVar2, ng.c.f(c6Var), false);
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(7.0f));
        ihVar2.setBackground(c10);
        jhVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        jhVar.setClipToOutline(true);
        int dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(28.0f);
        cg.l1 l1Var = gf.r0.a;
        jhVar.setOutlineProvider(new gf.q0(dp, dp2));
        jhVar.setImportantForAccessibility(1);
        ihVar2.addView(jhVar, h7.z5.g());
        this.containerView.addView(ihVar2, h7.z5.e(-1, 70, 81));
        jhVar.setOnItemClickListener(new cg.x0(11, this, c6Var));
        jhVar.setOnItemLongClickListener(new pg(this, 3));
        final int i22 = 0;
        j6 j6Var = new j6(context, true, false, true);
        this.A1 = j6Var;
        j6Var.setVisibility(8);
        j6Var.setAlpha(0.0f);
        j6Var.setGravity(17);
        j6Var.setTypeface(AndroidUtilities.bold());
        int dp3 = AndroidUtilities.dp(16.0f);
        j6Var.setPadding(dp3, 0, dp3, 0);
        j6Var.setTextSize(AndroidUtilities.dp(f10));
        j6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tg
            public final /* synthetic */ gi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i22) {
                    case 0:
                        gi giVar = this.b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                            break;
                        }
                        break;
                    case 2:
                        gi giVar3 = this.b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
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
                        gi.t(this.b);
                        break;
                    case 6:
                        yh yhVar = this.b.u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.b;
                        giVar4.Z1(giVar4.u0 != giVar4.m0);
                        break;
                }
            }
        });
        this.containerView.addView(j6Var, h7.z5.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.y1 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, h7.z5.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
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
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tg
            public final /* synthetic */ gi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i23) {
                    case 0:
                        gi giVar = this.b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                            break;
                        }
                        break;
                    case 2:
                        gi giVar3 = this.b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
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
                        gi.t(this.b);
                        break;
                    case 6:
                        yh yhVar = this.b.u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.b;
                        giVar4.Z1(giVar4.u0 != giVar4.m0);
                        break;
                }
            }
        });
        ih ihVar3 = new ih(this, context, 2);
        this.z0 = ihVar3;
        lh lhVar = new lh(this, context);
        this.y0 = lhVar;
        ihVar3.addView(lhVar, h7.z5.e(-1, -1, 119));
        lg.d c11 = this.D2.c(whVar, ng.c.m(c6Var), false);
        this.w0 = c11;
        c11.k = true;
        c11.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.t(AndroidUtilities.dp(32.0f));
        c11.h.g = 0.4f;
        c11.j();
        lg.d c12 = this.C2.c(lhVar, ng.c.m(c6Var), false);
        this.x0 = c12;
        c12.p(AndroidUtilities.dp(22.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        lhVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        ihVar3.setWillNotDraw(false);
        ihVar3.setVisibility(4);
        ihVar3.setAlpha(0.0f);
        this.containerView.addView(ihVar3, h7.z5.e(-1, -2, 83));
        ihVar3.setOnTouchListener(new kh.e(13));
        j6 j6Var2 = new j6(context, false, false, false);
        this.s = j6Var2;
        j6Var2.setAllowCancel(true);
        j6Var2.setScaleProperty(0.6f);
        j6Var2.setVisibility(8);
        j6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        int i24 = org.telegram.ui.ActionBar.g6.y6;
        j6Var2.setTextColor(getThemedColor(i24));
        j6Var2.setTypeface(AndroidUtilities.bold());
        j6Var2.setGravity(17);
        lhVar.addView(j6Var2, h7.z5.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.w = imageView4;
        i0 i0Var = new i0(context);
        this.x = i0Var;
        imageView4.setImageDrawable(i0Var);
        imageView4.setScaleType(scaleType);
        int i25 = org.telegram.ui.ActionBar.g6.Wk;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), mode));
        int i26 = org.telegram.ui.ActionBar.g6.i6;
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i26), 1, AndroidUtilities.dp(16.0f)));
        lhVar.addView(imageView4, h7.z5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.AIEditor));
        h7.b6.a(imageView4);
        final int i27 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ug
            public final /* synthetic */ gi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i27) {
                    case 0:
                        final gi giVar = this.b;
                        mh mhVar = giVar.A0;
                        if (mhVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(giVar.getContext(), c6Var);
                            e0Var.m0(mhVar.getText());
                            final int i202 = 0;
                            e0Var.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.xg
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            mh mhVar2 = giVar.A0;
                                            mhVar2.setText(charSequence);
                                            mhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar2 = giVar.L0;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = giVar.V;
                            boolean z14 = giVar.D1 != null;
                            yg ygVar = new yg(giVar, 0);
                            e0Var.h0 = j10;
                            e0Var.i0 = z14;
                            e0Var.j0 = ygVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final gi giVar2 = this.b;
                        ph phVar = giVar2.L0;
                        if (phVar != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(giVar2.getContext(), c6Var);
                            e0Var2.m0(phVar.getText());
                            final int i212 = 1;
                            e0Var2.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.xg
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            mh mhVar2 = giVar2.A0;
                                            mhVar2.setText(charSequence);
                                            mhVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar2 = giVar2.L0;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = giVar2.V;
                            boolean z15 = giVar2.D1 != null;
                            yg ygVar2 = new yg(giVar2, 1);
                            e0Var2.h0 = j11;
                            e0Var2.i0 = z15;
                            e0Var2.j0 = ygVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        gi giVar3 = this.b;
                        giVar3.g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = giVar3.b0;
                        t12.K2(null, n2Var2, c6Var);
                        PhotoViewer.t1().L2(giVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i222 = giVar3.O1;
                        boolean z16 = giVar3.P1;
                        t13.h = i222;
                        t13.n = z16;
                        if (!giVar3.V1.s()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(giVar3.getContainer().findFocus());
                        }
                        File w10 = lh.z7.w(giVar3.F1, "webp");
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
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new hh(giVar3, photoEntry), n2Var2 instanceof org.telegram.ui.rn ? (org.telegram.ui.rn) n2Var2 : null);
                        if (giVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, giVar3.F);
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
        mh mhVar = new mh(this, context, whVar, c6Var);
        this.A0 = mhVar;
        mhVar.F = true;
        mhVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        mhVar.s();
        mhVar.getEditText().setLayoutParams(h7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        mhVar.getEditText().addTextChangedListener(new oh(this));
        lhVar.addView(mhVar, h7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        lhVar.setClipChildren(false);
        ihVar3.setClipChildren(false);
        mhVar.setClipChildren(false);
        y1Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        y1Var.setWillNotDraw(false);
        ph phVar = new ph(this, context, whVar, c6Var);
        this.L0 = phVar;
        phVar.F = true;
        phVar.getEditText().addTextChangedListener(new qh(this, n2Var));
        phVar.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        phVar.getEditText().setLayoutParams(h7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        phVar.getEditText().setTextSize(1, 17.0f);
        phVar.getEmojiButton().setLayoutParams(h7.z5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        phVar.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        y1Var.addView(phVar, h7.z5.e(-1, -2, 119));
        y1Var.setAlpha(0.0f);
        y1Var.setVisibility(8);
        mhVar.addView(imageView3, h7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        lg.d c13 = this.C2.c(y1Var, ng.c.m(c6Var), false);
        c13.p(AndroidUtilities.dp(22.0f));
        c13.o(AndroidUtilities.dp(7.0f));
        y1Var.setBackground(c13);
        y1Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        j6 j6Var3 = new j6(context, false, false, false);
        this.v = j6Var3;
        j6Var3.setScaleProperty(0.6f);
        j6Var3.setVisibility(8);
        j6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var3.setTextColor(getThemedColor(i24));
        j6Var3.setTypeface(AndroidUtilities.bold());
        j6Var3.setGravity(17);
        j6Var3.setAllowCancel(true);
        y1Var.addView(j6Var3, h7.z5.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Xd), mode2));
        phVar.addView(imageView5, h7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i28 = 2;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tg
            public final /* synthetic */ gi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i28) {
                    case 0:
                        gi giVar = this.b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                            break;
                        }
                        break;
                    case 2:
                        gi giVar3 = this.b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
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
                        gi.t(this.b);
                        break;
                    case 6:
                        yh yhVar = this.b.u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.b;
                        giVar4.Z1(giVar4.u0 != giVar4.m0);
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
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), mode));
        imageView6.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i26), 1, AndroidUtilities.dp(16.0f)));
        y1Var.addView(imageView6, h7.z5.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        h7.b6.a(imageView6);
        final int i29 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ug
            public final /* synthetic */ gi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i29) {
                    case 0:
                        final gi giVar = this.b;
                        mh mhVar2 = giVar.A0;
                        if (mhVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var = new e0(giVar.getContext(), c6Var);
                            e0Var.m0(mhVar2.getText());
                            final int i202 = 0;
                            e0Var.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.xg
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i202) {
                                        case 0:
                                            mh mhVar22 = giVar.A0;
                                            mhVar22.setText(charSequence);
                                            mhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar2 = giVar.L0;
                                            phVar2.setText(charSequence);
                                            phVar2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j10 = giVar.V;
                            boolean z14 = giVar.D1 != null;
                            yg ygVar = new yg(giVar, 0);
                            e0Var.h0 = j10;
                            e0Var.i0 = z14;
                            e0Var.j0 = ygVar;
                            e0Var.show();
                            break;
                        }
                        break;
                    case 1:
                        final gi giVar2 = this.b;
                        ph phVar2 = giVar2.L0;
                        if (phVar2 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            e0 e0Var2 = new e0(giVar2.getContext(), c6Var);
                            e0Var2.m0(phVar2.getText());
                            final int i212 = 1;
                            e0Var2.f0 = new Utilities.Callback() { // from class: org.telegram.ui.Components.xg
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i212) {
                                        case 0:
                                            mh mhVar22 = giVar2.A0;
                                            mhVar22.setText(charSequence);
                                            mhVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ph phVar22 = giVar2.L0;
                                            phVar22.setText(charSequence);
                                            phVar22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j11 = giVar2.V;
                            boolean z15 = giVar2.D1 != null;
                            yg ygVar2 = new yg(giVar2, 1);
                            e0Var2.h0 = j11;
                            e0Var2.i0 = z15;
                            e0Var2.j0 = ygVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                    default:
                        gi giVar3 = this.b;
                        giVar3.g1.M(null, null);
                        PhotoViewer t12 = PhotoViewer.t1();
                        org.telegram.ui.ActionBar.n2 n2Var2 = giVar3.b0;
                        t12.K2(null, n2Var2, c6Var);
                        PhotoViewer.t1().L2(giVar3);
                        PhotoViewer t13 = PhotoViewer.t1();
                        int i222 = giVar3.O1;
                        boolean z16 = giVar3.P1;
                        t13.h = i222;
                        t13.n = z16;
                        if (!giVar3.V1.s()) {
                            AndroidUtilities.hideKeyboard(n2Var2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(giVar3.getContainer().findFocus());
                        }
                        File w10 = lh.z7.w(giVar3.F1, "webp");
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
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.t1().f2(arrayList3, 0, 11, false, new hh(giVar3, photoEntry), n2Var2 instanceof org.telegram.ui.rn ? (org.telegram.ui.rn) n2Var2 : null);
                        if (giVar3.C) {
                            PhotoViewer.t1().X0(null, null, true, giVar3.F);
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
        ih ihVar4 = new ih(this, context, 3);
        this.D0 = ihVar4;
        ihVar4.setFocusable(true);
        ihVar4.setFocusableInTouchMode(true);
        ihVar4.setVisibility(4);
        ihVar4.setScaleX(0.2f);
        ihVar4.setScaleY(0.2f);
        ihVar4.setAlpha(0.0f);
        ihVar4.setClipChildren(false);
        ihVar4.setClipToPadding(false);
        this.containerView.addView(ihVar4, h7.z5.e(110, 50, 85));
        rh rhVar = new rh(R.drawable.send_plane_24, context, c6Var, this);
        this.E0 = rhVar;
        rhVar.setImportantForAccessibility(2);
        ihVar4.addView(rhVar, h7.z5.e(-1, -1, 119));
        rhVar.setTranslationX(this.backgroundPaddingLeft);
        int dp4 = AndroidUtilities.dp(52.0f);
        int dp5 = AndroidUtilities.dp(38.0f);
        rhVar.E = dp4;
        rhVar.F = dp5;
        float dp6 = AndroidUtilities.dp(7.0f);
        float dp7 = AndroidUtilities.dp(6.0f);
        rhVar.I = dp6;
        rhVar.J = dp7;
        rhVar.d0 = true;
        final int i30 = 3;
        rhVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tg
            public final /* synthetic */ gi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nh.e4 e4Var;
                switch (i30) {
                    case 0:
                        gi giVar = this.b;
                        long j10 = giVar.S0;
                        if (j10 < 0 && (e4Var = (nh.e4) giVar.t0.get(-j10)) != null) {
                            org.telegram.ui.web.z0 webViewContainer = e4Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.L = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        gi giVar2 = this.b;
                        boolean z14 = giVar2.Y;
                        if (!z14) {
                            giVar2.H1(!z14, true);
                            break;
                        }
                        break;
                    case 2:
                        gi giVar3 = this.b;
                        boolean z15 = giVar3.Y;
                        if (z15) {
                            giVar3.H1(!z15, true);
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
                        gi.t(this.b);
                        break;
                    case 6:
                        yh yhVar = this.b.u0;
                        if (yhVar != null) {
                            yhVar.u(40);
                            break;
                        }
                        break;
                    case 7:
                        this.b.g1.M(null, null);
                        break;
                    default:
                        gi giVar4 = this.b;
                        giVar4.Z1(giVar4.u0 != giVar4.m0);
                        break;
                }
            }
        });
        rhVar.setOnLongClickListener(new org.telegram.ui.wf(this, context, c6Var, n2Var, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        kh khVar2 = new kh(this, context, 1);
        khVar2.setAlpha(0.0f);
        khVar2.setScaleX(0.2f);
        khVar2.setScaleY(0.2f);
        if (z10) {
            c1();
            this.navBarColorKey = -1;
        }
        ik0 fastScroll = chatAttachAlertPhotoLayout.A.getFastScroll();
        jg.a aVar6 = this.C2;
        mg.d m10 = ng.c.m(c6Var);
        zk0 zk0Var = fastScroll.k0;
        lg.d c14 = aVar6.c(zk0Var.b1, m10, false);
        fastScroll.a0 = c14;
        c14.o(AndroidUtilities.dp(4.0f));
        fastScroll.a0.p(AndroidUtilities.dp(24.0f));
        lg.d c15 = aVar6.c(zk0Var.b1, m10, false);
        fastScroll.b0 = c15;
        c15.o(AndroidUtilities.dp(6.0f));
        fastScroll.b0.t(AndroidUtilities.dp(4.0f));
        fastScroll.b0.p(AndroidUtilities.dp(f10));
        dd0 dd0Var = new dd0(context);
        this.O = dd0Var;
        this.containerView.addView(dd0Var, h7.z5.c(-1.0f, -1));
        mg.d dVar3 = new mg.d(c6Var);
        dVar3.e = new pg(this, 4);
        dVar3.c = new pg(this, 5);
        dVar3.d = new pg(this, 6);
        dVar3.b = new pg(this, 7);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.n = dpf2;
        dVar3.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        dVar3.f = dpf23;
        dVar3.h = dpf24;
        d2Var.M(this.C2, dVar3, false);
        jVar.i(1L, false);
    }

    public static void M(gi giVar) {
        int i10;
        ag.d2 d2Var = giVar.T0;
        sg.f fVar = giVar.r1;
        if (fVar == null || d2Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var = giVar.resourcesProvider;
        boolean a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        if (d2Var.getVisibility() == 0) {
            i10 = (int) (d2Var.getAlpha() * (a2 ? 255 : 160));
        } else {
            i10 = 0;
        }
        fVar.setFadeTopAlpha(i10);
    }

    public static void Q(gi giVar) {
        lh.i iVar = new lh.i(giVar, giVar.getContext(), giVar.V, LaunchActivity.R(), giVar.resourcesProvider, 1);
        giVar.x2 = iVar;
        iVar.p(new o0.b(giVar, 6));
        ViewGroup viewGroup = giVar.containerView;
        viewGroup.addView(giVar.x2, viewGroup.indexOfChild(giVar.z0), h7.z5.e(-1, -1, 83));
        lh.i iVar2 = giVar.x2;
        iVar2.getAdapter().c = false;
        iVar2.getAdapter().d = false;
        iVar2.getAdapter().e = false;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            iVar2.getAdapter().i0 = false;
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
            pf.u0 adapter = iVar2.getAdapter();
            rnVar.i();
            TLRPC.Chat chat = rnVar.e;
            adapter.getClass();
            adapter.h0 = chat;
            iVar2.getAdapter().W(rnVar.V7);
            iVar2.getAdapter().a0 = rnVar.e != null;
        } else {
            iVar2.getAdapter().i0 = true;
            iVar2.getAdapter().W(null);
            iVar2.getAdapter().a0 = false;
        }
        iVar2.getAdapter().b0 = false;
        giVar.U1();
    }

    public static /* synthetic */ void m(gi giVar, ValueAnimator valueAnimator) {
        giVar.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        org.telegram.ui.ActionBar.c3 c3Var = giVar.container;
        if (c3Var != null) {
            c3Var.invalidate();
        }
    }

    public static /* synthetic */ void n(gi giVar, AnimationNotificationsLocker animationNotificationsLocker, org.telegram.ui.ActionBar.y2 y2Var) {
        giVar.currentSheetAnimation = null;
        giVar.l2 = null;
        animationNotificationsLocker.unlock();
        giVar.currentSheetAnimationType = 0;
        if (y2Var != null) {
            y2Var.onOpenAnimationEnd();
        }
        if (giVar.useHardwareLayer) {
            giVar.container.setLayerType(0, null);
        }
        if (giVar.isFullscreen) {
            WindowManager.LayoutParams attributes = giVar.getWindow().getAttributes();
            attributes.flags &= -1025;
            giVar.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static /* synthetic */ void p(gi giVar, int i10) {
        giVar.navBarColorKey = -1;
        giVar.navBarColor = i10;
        giVar.containerView.invalidate();
    }

    public static void q(gi giVar) {
        o1.j jVar = giVar.l2;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(giVar.containerView, o1.h.n, 0.0f);
        giVar.l2 = jVar2;
        jVar2.u.a(1.5f);
        giVar.l2.u.b(1500.0f);
        giVar.l2.f();
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
    public static boolean r(gi giVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.n2 n2Var, View view) {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        org.telegram.ui.rn rnVar;
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
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor;
        int i11;
        Throwable th2;
        String str;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        long j12;
        org.telegram.ui.rn rnVar2;
        long j13;
        TLRPC.ChatFull chatFull;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        gi giVar2 = giVar;
        rh rhVar = giVar2.E0;
        org.telegram.ui.ActionBar.n2 n2Var2 = giVar2.b0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = giVar2.f0;
        int i13 = giVar2.F1;
        long j14 = giVar2.V;
        if ((j14 == 0 && !(n2Var2 instanceof org.telegram.ui.rn)) || giVar2.G - giVar2.H < 0 || giVar2.h.f) {
            return false;
        }
        if (n2Var2 instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn rnVar3 = (org.telegram.ui.rn) n2Var2;
            TLRPC.User i14 = rnVar3.i();
            MessageObject messageObject5 = rnVar3.j5;
            MessageObject messageObject6 = rnVar3.g5;
            if (rnVar3.c() || rnVar3.N3 == 5) {
                return false;
            }
            messageObject2 = messageObject6;
            messageObject = messageObject5;
            rnVar = rnVar3;
            user = i14;
            j14 = rnVar3.a();
        } else {
            user = MessagesController.getInstance(i13).getUser(Long.valueOf(j14));
            messageObject = null;
            messageObject2 = null;
            rnVar = null;
        }
        ye yeVar = giVar2.d0;
        if (yeVar != null) {
            yeVar.dismiss();
        }
        ye yeVar2 = new ye(giVar2, context, c6Var, 1);
        giVar2.d0 = yeVar2;
        yeVar2.r(rhVar, false, new gg.f(giVar2, n2Var, c6Var, 21));
        ArrayList arrayList2 = new ArrayList();
        yh yhVar = giVar2.u0;
        if (yhVar == chatAttachAlertPhotoLayout3 || yhVar == giVar2.m0) {
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
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    i11 = 0;
                                                    parcelFileDescriptor = null;
                                                    photoEntry.videoOrientation = i11;
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
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        i11 = 0;
                                                        photoEntry.videoOrientation = i11;
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
                                                } catch (Exception e11) {
                                                    e = e11;
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
                                            } catch (Throwable th6) {
                                                th2 = th6;
                                                th = th2;
                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                if (mediaMetadataRetriever != null) {
                                                    try {
                                                        mediaMetadataRetriever.release();
                                                    } catch (IOException e15) {
                                                        FileLog.e(e15);
                                                    }
                                                }
                                                if (parcelFileDescriptor == null) {
                                                    throw th;
                                                }
                                                try {
                                                    parcelFileDescriptor.close();
                                                    throw th;
                                                } catch (IOException e16) {
                                                    FileLog.e(e16);
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e17) {
                                            e = e17;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                        }
                                    } catch (Exception e18) {
                                        e = e18;
                                        mediaMetadataRetriever2 = null;
                                    } catch (Throwable th8) {
                                        th = th8;
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
                                CharSequence[] charSequenceArr = {giVar2.m1().getText()};
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
        } else if (yhVar == giVar2.g0) {
            if (TextUtils.isEmpty(giVar2.m1().getText())) {
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
                CharSequence[] charSequenceArr2 = {giVar2.m1().getText()};
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
            ArrayList<TLRPC.User> selected = giVar2.g0.getSelected();
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
            giVar2 = giVar;
            j10 = j14;
            z11 = z14;
        } else {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
            if (yhVar == giVar2.l0) {
                messageObject4 = null;
                boolean z16 = false;
                int i30 = 0;
                for (int i31 = 0; i31 < giVar2.l0.O.size(); i31++) {
                    String str5 = (String) giVar2.l0.O.get(i31);
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
                                CharSequence[] charSequenceArr3 = {giVar2.m1().getText()};
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
                ri riVar = giVar2.h0;
                if (yhVar == riVar) {
                    arrayList2.addAll(riVar.getSelected());
                    if (!arrayList2.isEmpty()) {
                        messageObject4 = (MessageObject) arrayList2.get(0);
                        CharSequence[] charSequenceArr4 = {giVar2.m1().getText()};
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
        b70 F = b70.F(giVar2.containerView, c6Var, rhVar);
        if (messageObject4 != null) {
            yh yhVar2 = giVar2.u0;
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (yhVar2 == chatAttachAlertPhotoLayout2 || yhVar2 == giVar2.m0) {
                fb0 fb0Var = new fb0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), c6Var);
                TLRPC.Message message = messageObject4.messageOwner;
                boolean z17 = giVar2.Y;
                message.invert_media = z17;
                fb0Var.a(!z17, false);
                fb0Var.setOnClickListener(new gg.f(giVar2, messageObject4, fb0Var, 22));
                F.q(fb0Var);
                if (giVar2.D1 == null) {
                    F.k();
                }
            }
        } else {
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        }
        boolean isUserSelf = UserObject.isUserSelf(user);
        if (giVar2.D1 != null || ((rnVar != null && ChatObject.isMonoForum(rnVar.e)) || ((rnVar == null || !rnVar.D6()) && !giVar2.u0.c()))) {
            j12 = j10;
        } else {
            j12 = j10;
            F.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new e5.u(giVar2, j12, c6Var, 22), false);
        }
        yh yhVar3 = giVar2.u0;
        if ((yhVar3 == chatAttachAlertPhotoLayout2 || yhVar3 == giVar2.m0) && yhVar3.getSelectedItemsCount() == 1 && rnVar != null && ChatObject.isMonoForum(rnVar.e)) {
            rnVar2 = rnVar;
            j13 = j12;
            F.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new org.telegram.messenger.pg(giVar2, j12, rnVar2, c6Var, 4), false);
        } else {
            j13 = j12;
            rnVar2 = rnVar;
        }
        if (giVar2.D1 == null && !isUserSelf) {
            F.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new sg(giVar2, 1), false);
        }
        if (giVar2.D1 == null && z10 && rnVar2 != null && ChatObject.isChannelAndNotMegaGroup(rnVar2.e) && (chatFull = rnVar2.V7) != null && chatFull.paid_media_allowed) {
            F.c(R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton), null, false);
            org.telegram.ui.ActionBar.f1 y10 = F.y();
            y10.setOnClickListener(new gh.a4(giVar2, context, y10, c6Var, 13));
            long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
            if (starsPrice > 0) {
                y10.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                y10.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                y10.setText(LocaleController.getString(R.string.PaidMediaButton));
                y10.setSubtext(null);
            }
            giVar2.d0.s(starsPrice);
        }
        F.Y();
        giVar2.d0.p(F);
        giVar2.d0.q(arrayList2);
        if (giVar2.D1 == null && j13 >= 0 && z11) {
            giVar2.d0.d(n2Var);
            giVar2.d0.o(giVar2.J0);
        }
        giVar2.d0.show();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static /* synthetic */ void s(gi giVar, org.telegram.ui.ActionBar.i3 i3Var) {
        AnimatorSet animatorSet = giVar.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        i3Var.run();
    }

    public static void t(gi giVar) {
        if (giVar.f0 == null) {
            return;
        }
        boolean S = ChatAttachAlertPhotoLayout.S();
        boolean z10 = !S;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f0;
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
                            if (childAt instanceof org.telegram.ui.Cells.q5) {
                                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                                if (q5Var.getPhotoEntry() == photoEntry) {
                                    q5Var.getImageView().invalidate();
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
        giVar.Y1(true);
        org.telegram.ui.ActionBar.v0 v0Var = giVar.Y0;
        lh.w3 w3Var = giVar.Z0;
        if (w3Var != null) {
            w3Var.e(true);
        }
        lh.w3 w3Var2 = new lh.w3(giVar.getContext(), 1);
        giVar.Z0 = w3Var2;
        w3Var2.t(AndroidUtilities.replaceTags(LocaleController.getString(!S ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        giVar.Z0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        giVar.Z0.n(1.0f, -((giVar.containerView.getWidth() - ((v0Var.getWidth() / 2.0f) + v0Var.getX())) - AndroidUtilities.dp(14.0f)));
        giVar.Z0.setTranslationY(giVar.W0.getTranslationY());
        lh.w3 w3Var3 = giVar.Z0;
        w3Var3.h0 = new org.telegram.ui.yq(12, giVar, w3Var2);
        giVar.containerView.addView(w3Var3, h7.z5.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        giVar.Z0.v();
    }

    public static /* synthetic */ void u(gi giVar, boolean z10, sg sgVar) {
        giVar.u0.t(1.0f);
        giVar.v0.t(1.0f);
        giVar.u0.k(giVar.h2);
        giVar.v0.k(giVar.h2);
        giVar.containerView.invalidate();
        giVar.T0.setTag(z10 ? 1 : null);
        sgVar.run();
    }

    public static void w(gi giVar, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        gi giVar2 = giVar;
        jh jhVar = giVar2.u1;
        yh[] yhVarArr = giVar2.s0;
        org.telegram.ui.ActionBar.n2 n2Var = giVar2.b0;
        org.telegram.ui.ActionBar.n2 R = n2Var == null ? LaunchActivity.R() : n2Var;
        if (R == null || R.getParentActivity() == null) {
            return;
        }
        if (view instanceof ai) {
            Activity parentActivity = R.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!giVar2.H1 && !giVar2.I1 && giVar2.a1()) {
                    return;
                }
                if (!giVar2.H1 && !giVar2.I1) {
                    jn jnVar = new jn(1, giVar2.getContext(), c6Var, giVar2);
                    giVar2.P = jnVar;
                    giVar2.Q1(jnVar);
                }
                giVar2.Q1(giVar2.f0);
            } else if (intValue == 3) {
                if (!giVar2.J1 && giVar2.a1()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i10 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(giVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                giVar2.B1(true);
            } else if (intValue == 4) {
                if (!giVar2.G1 && giVar2.a1()) {
                    return;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i11 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(giVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                giVar2.E1(true);
            } else if (intValue == 5) {
                if (!giVar2.M1 && giVar2.a1()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && giVar2.M1 && giVar2.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(giVar2.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                giVar2.D1();
            } else if (intValue == 6) {
                if ((!giVar2.M1 && giVar2.a1()) || !AndroidUtilities.isMapsInstalled(n2Var)) {
                    return;
                }
                if (giVar2.M1) {
                    if (giVar2.k0 == null) {
                        tk tkVar = new tk(giVar2, giVar2.getContext(), c6Var, (giVar2.D || giVar2.N1) ? false : true);
                        giVar2.k0 = tkVar;
                        yhVarArr[5] = tkVar;
                        ok okVar = giVar2.p2;
                        if (okVar != null) {
                            tkVar.setDelegate(okVar);
                        } else {
                            tkVar.setDelegate(new pg(giVar2, 9));
                        }
                    }
                    giVar2.Q1(giVar2.k0);
                } else {
                    jn jnVar2 = new jn(6, giVar2.getContext(), c6Var, giVar2);
                    giVar2.P = jnVar2;
                    giVar2.Q1(jnVar2);
                }
            } else if (intValue == 9) {
                if (!giVar2.K1 && giVar2.a1()) {
                    return;
                }
                if (giVar2.K1) {
                    giVar2.S1(true, null);
                } else {
                    jn jnVar3 = new jn(9, giVar2.getContext(), c6Var, giVar2);
                    giVar2.P = jnVar3;
                    giVar2.Q1(jnVar3);
                }
            } else if (intValue == 11) {
                if (giVar2.o0 == null) {
                    qf.e0 e0Var = new qf.e0(giVar2.getContext(), giVar2.resourcesProvider, giVar2);
                    giVar2.o0 = e0Var;
                    yhVarArr[7] = e0Var;
                    e0Var.setupBlurredSearchField(giVar2.C2);
                }
                giVar2.Q1(giVar2.o0);
            } else if (intValue == 12) {
                if (!giVar2.L1 && giVar2.a1()) {
                    return;
                }
                if (giVar2.L1) {
                    if (giVar2.j0 == null) {
                        in inVar = new in(giVar, giVar.getContext(), true, c6Var, null);
                        giVar2 = giVar;
                        giVar2.j0 = inVar;
                        yhVarArr[1] = inVar;
                        inVar.setDelegate(new pg(giVar2, 10));
                    }
                    giVar2.Q1(giVar2.j0);
                } else {
                    jn jnVar4 = new jn(9, giVar2.getContext(), c6Var, giVar2);
                    giVar2.P = jnVar4;
                    giVar2.Q1(jnVar4);
                }
            } else if (intValue == 13) {
                if (giVar2.q0 == null) {
                    ck ckVar = new ck(giVar2, giVar2.getContext(), c6Var, true);
                    giVar2.q0 = ckVar;
                    yhVarArr[8] = ckVar;
                    ckVar.setDelegate(giVar2.W1);
                }
                giVar2.Q1(giVar2.q0);
            } else if (intValue == 14) {
                if (giVar2.p0 == null) {
                    ck ckVar2 = new ck(giVar2, giVar2.getContext(), c6Var, false);
                    giVar2.p0 = ckVar2;
                    yhVarArr[9] = ckVar2;
                    ckVar2.setDelegate(giVar2.W1);
                }
                giVar2.Q1(giVar2.p0);
            } else if (intValue == 16) {
                if (giVar2.r0 == null) {
                    rh.p pVar = new rh.p(giVar2.F1, giVar2.getContext(), c6Var, giVar2);
                    giVar2.r0 = pVar;
                    yhVarArr[10] = pVar;
                }
                giVar2.Q1(giVar2.r0);
            } else if (view.getTag() instanceof Integer) {
                giVar2.V1.n0(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, giVar2.s1(), false, 0L);
            }
        } else if (view instanceof zh) {
            zh zhVar = (zh) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = zhVar.c;
            if (tL_attachMenuBot == null) {
                giVar2.V1.g0(zhVar.b);
                giVar2.dismiss();
            } else if (tL_attachMenuBot.inactive) {
                ei1.a(giVar2.getContext(), new jh.y1(5, giVar2, zhVar), null);
            } else {
                giVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int dp = AndroidUtilities.dp(70.0f);
        int i12 = left - dp;
        if (i12 < 0) {
            jhVar.v0(i12, 0, null);
            return;
        }
        int i13 = right + dp;
        if (i13 > jhVar.getMeasuredWidth()) {
            jhVar.v0(i13 - jhVar.getMeasuredWidth(), 0, null);
        }
    }

    public static /* synthetic */ void x(gi giVar) {
        yh yhVar;
        em emVar;
        giVar.p1 = null;
        yh yhVar2 = giVar.u0;
        if (yhVar2 != giVar.f0 && (yhVar = giVar.v0) != (emVar = giVar.m0) && yhVar2 != yhVar && yhVar2 != emVar) {
            giVar.containerView.removeView(yhVar2);
        }
        giVar.u0.setVisibility(8);
        giVar.u0.r();
        giVar.v0.F();
        giVar.u0 = giVar.v0;
        giVar.v0 = null;
        int[] iArr = giVar.X1;
        iArr[0] = iArr[1];
        giVar.H1(giVar.Y, false);
        giVar.W1();
    }

    public final void A1(int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (i10 != 3) {
            if (i10 == 6 && AndroidUtilities.isMapsInstalled(n2Var)) {
                if (this.k0 == null) {
                    tk tkVar = new tk(this, getContext(), this.resourcesProvider, (this.D || this.N1) ? false : true);
                    this.k0 = tkVar;
                    this.s0[5] = tkVar;
                    ok okVar = this.p2;
                    if (okVar != null) {
                        tkVar.setDelegate(okVar);
                    } else if (n2Var instanceof org.telegram.ui.rn) {
                        tkVar.setDelegate(new pg(this, 16));
                    }
                }
                Q1(this.k0);
                return;
            }
            return;
        }
        if (this.J1 || !a1()) {
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
        if (!this.J1 && z10) {
            jn jnVar = new jn(3, getContext(), this.resourcesProvider, this);
            this.P = jnVar;
            Q1(jnVar);
        }
        int i10 = 1;
        if (this.h0 == null) {
            ri riVar = new ri(getContext(), this.resourcesProvider, this);
            this.h0 = riVar;
            this.s0[3] = riVar;
            riVar.setupBlurredSearchField(this.C2);
            this.h0.setDelegate(new pg(this, 13));
            if (this.D) {
                this.h0.setMaxSelectedFiles(1);
            }
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            TLRPC.Chat chat = ((org.telegram.ui.rn) n2Var).e;
            ri riVar2 = this.h0;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.D1 == null) {
                i10 = -1;
            }
            riVar2.setMaxSelectedFiles(i10);
        }
        if (z10) {
            Q1(this.h0);
        }
    }

    public final void C1() {
        if (this.n0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
            ui uiVar = new ui(context, c6Var, this);
            uiVar.r = AndroidUtilities.dp(80.0f);
            uiVar.w = 3;
            hh.f1 f1Var = new hh.f1(uiVar, context, c6Var, 11);
            uiVar.n = f1Var;
            pa paVar = new pa(uiVar, context);
            uiVar.v = paVar;
            f1Var.setAdapter(paVar);
            f1Var.setClipToPadding(false);
            f1Var.setItemAnimator(null);
            f1Var.setLayoutAnimation(null);
            f1Var.setVerticalScrollBarEnabled(false);
            f1Var.setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, uiVar.a));
            uiVar.addView(f1Var, h7.z5.c(-1.0f, -1));
            f1Var.setOnScrollListener(new ag.z2(uiVar, 25));
            kh.l lVar = new kh.l(uiVar, uiVar.r, 1);
            uiVar.s = lVar;
            lVar.O = new gh.u5(uiVar, 4);
            f1Var.setLayoutManager(lVar);
            this.n0 = uiVar;
            uiVar.setDelegate(new va(this, 1));
        }
        Q1(this.n0);
    }

    public final void D1() {
        if (!this.M1) {
            jn jnVar = new jn(5, getContext(), this.resourcesProvider, this);
            this.P = jnVar;
            Q1(jnVar);
        }
        if (this.g0 == null) {
            lj ljVar = new lj(getContext(), this.resourcesProvider, this);
            this.g0 = ljVar;
            this.s0[2] = ljVar;
            ljVar.setupBlurredSearchField(this.C2);
            this.g0.setDelegate(new sh(this));
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            TLRPC.Chat chat = ((org.telegram.ui.rn) n2Var).e;
            this.g0.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        Q1(this.g0);
    }

    public final void E1(boolean z10) {
        if (!this.G1 && z10) {
            jn jnVar = new jn(4, getContext(), this.resourcesProvider, this);
            this.P = jnVar;
            Q1(jnVar);
        }
        boolean z11 = false;
        if (this.l0 == null) {
            bk bkVar = new bk(this.J ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.l0 = bkVar;
            this.s0[4] = bkVar;
            bkVar.setDelegate(new th(this));
        }
        int i10 = 1;
        if (this.D) {
            this.l0.setMaxSelectedFiles(1);
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = this.b0;
            if (n2Var instanceof org.telegram.ui.rn) {
                TLRPC.Chat chat = ((org.telegram.ui.rn) n2Var).e;
                bk bkVar2 = this.l0;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.D1 == null) {
                    i10 = -1;
                }
                bkVar2.setMaxSelectedFiles(i10);
            } else {
                this.l0.setMaxSelectedFiles(this.O1);
                bk bkVar3 = this.l0;
                if (!this.J && !this.S) {
                    z11 = true;
                }
                bkVar3.setCanSelectOnlyImageFiles(z11);
            }
        }
        bk bkVar4 = this.l0;
        bkVar4.W = this.J;
        if (z10) {
            Q1(bkVar4);
        }
    }

    public final void F1() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        ag.d2 d2Var = this.T0;
        int i10 = 1;
        if (d2Var.j0) {
            d2Var.h(true);
        }
        this.g0 = null;
        this.o0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        while (true) {
            yh[] yhVarArr = this.s0;
            if (i10 >= yhVarArr.length) {
                T1(false, false);
                super.dismissInternal();
                return;
            }
            yh yhVar = yhVarArr[i10];
            if (yhVar != null) {
                yhVar.m();
                this.containerView.removeView(yhVarArr[i10]);
                yhVarArr[i10] = null;
            }
            i10++;
        }
    }

    public final boolean G1(final int i10, final boolean z10, final int i11, final boolean z11, final long j10) {
        if (this.E1) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
            TLRPC.Chat chat = rnVar.e;
            if (rnVar.i() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(this.F1).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + rnVar.a(), !z10).commit();
            }
        }
        if (b1(m1().getText())) {
            return true;
        }
        Y0();
        if (this.h.f) {
            this.E1 = true;
            this.V1.n0(7, true, z10, i10, i11, j10, z11, false, 0L);
            return true;
        }
        long n12 = n1();
        yh yhVar = this.u0;
        return y4.b0(this.F1, n12, j1() + (yhVar != null ? yhVar.getSelectedItemsCount() : 1), new Utilities.Callback() { // from class: org.telegram.ui.Components.ch
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                gi giVar = gi.this;
                giVar.E1 = true;
                giVar.V1.n0(7, true, z10, i10, i11, j10, z11, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    public final void H1(boolean z10, boolean z11) {
        this.b.a(z10, z11);
        tt m12 = m1();
        this.Y = z10;
        tt m13 = m1();
        final boolean z12 = this.z0.getTag() != null;
        yh yhVar = this.u0;
        final boolean z13 = this.Y && (yhVar == this.f0 || yhVar == this.m0);
        ag.y1 y1Var = this.K0;
        lh lhVar = this.y0;
        if (z11) {
            y1Var.setVisibility(z12 ? 0 : 8);
            ViewPropertyAnimator duration = y1Var.animate().alpha((z13 && z12) ? 1.0f : 0.0f).setDuration(320L);
            er erVar = er.h;
            final int i10 = 0;
            duration.setInterpolator(erVar).setUpdateListener(new qg(this, i10)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.rg
                public final /* synthetic */ gi b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            gi giVar = this.b;
                            if (!z13 || !z12) {
                                giVar.K0.setVisibility(8);
                            }
                            giVar.b2();
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
            lhVar.setVisibility(0);
            ViewPropertyAnimator interpolator = lhVar.animate().translationY((z13 || !z12) ? lhVar.getMeasuredHeight() : 0.0f).alpha((z13 || !z12) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(erVar);
            final int i11 = 1;
            interpolator.setUpdateListener(new qg(this, i11)).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Components.rg
                public final /* synthetic */ gi b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            gi giVar = this.b;
                            if (!z13 || !z12) {
                                giVar.K0.setVisibility(8);
                            }
                            giVar.b2();
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
            y1Var.setVisibility((z13 && z12) ? 0 : 8);
            y1Var.setAlpha((z13 && z12) ? 1.0f : 0.0f);
            b2();
            lhVar.setAlpha((z13 || !z12) ? 0.0f : 1.0f);
            lhVar.setTranslationY((z13 || !z12) ? lhVar.getMeasuredHeight() : 0.0f);
            lhVar.setVisibility((z13 || !z12) ? 8 : 0);
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
        AndroidUtilities.runOnUIThread(new sg(this, 0));
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

    public final void K1(float f10) {
        int k10 = i0.b.k(getThemedColor(org.telegram.ui.ActionBar.g6.a7), Math.min(255, Math.max(0, (int) (f10 * 255.0f))));
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
            gi giVar = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.c1 = (giVar.M0 == 0 || giVar.B) ? false : true;
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
            org.telegram.ui.ActionBar.n2 n2Var = this.b0;
            if ((n2Var instanceof org.telegram.ui.rn) && !((org.telegram.ui.rn) n2Var).x()) {
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
                er erVar = er.h;
                scaleY.setInterpolator(erVar).setDuration(420L).withEndAction(new bh(this, z11, 1)).start();
                imageView2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(erVar).setDuration(420L).withEndAction(new bh(this, z11, 2)).start();
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
        int i10 = 1;
        if (longSparseArray.get(j10) != null && Objects.equals(str, ((nh.e4) longSparseArray.get(j10)).getStartCommand())) {
            nh.e4 e4Var = (nh.e4) longSparseArray.get(j10);
            if (e4Var.D) {
                e4Var.D = false;
            }
            if (longSparseArray.get(j10) != null) {
                ((nh.e4) longSparseArray.get(j10)).F.setSwipeOffsetAnimationDisallowed(true);
                R1((yh) longSparseArray.get(j10), -j10, z11);
                if (z10) {
                    nh.e4 e4Var2 = (nh.e4) longSparseArray.get(j10);
                    TLRPC.User user = MessagesController.getInstance(e4Var2.B).getUser(Long.valueOf(e4Var2.v));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(e4Var2.B).getAttachMenuBots().bots;
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
                        if (tL_attachMenuBot.bot_id == e4Var2.v) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    boolean z12 = tL_attachMenuBot.show_in_side_menu;
                    AndroidUtilities.runOnUIThread(new lh.k7(16, e4Var2, (z12 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name) : z12 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name)), 200L);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
            nh.e4 e4Var3 = new nh.e4(context, c6Var, this);
            e4Var3.Q = new nh.u3(e4Var3, 2);
            org.telegram.ui.ActionBar.v0 a2 = e4Var3.b.T0.n().a(0, R.drawable.ic_ab_other);
            e4Var3.G = a2;
            a2.e(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
            org.telegram.ui.ActionBar.f1 e9 = a2.e(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
            e4Var3.H = e9;
            e9.setVisibility(8);
            a2.e(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
            org.telegram.ui.ActionBar.f1 e10 = a2.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
            e4Var3.I = e10;
            e10.setVisibility(8);
            a2.e(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
            a2.e(R.id.menu_report_bot, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot));
            a2.e(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
            nh.x3 x3Var = new nh.x3(e4Var3, context, c6Var, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, e4Var3.a));
            e4Var3.n = x3Var;
            nh.s2 s2Var = new nh.s2(e4Var3, context, i10);
            e4Var3.F = s2Var;
            s2Var.addView(x3Var, h7.z5.c(-1.0f, -1));
            s2Var.setScrollListener(new nh.u3(e4Var3, 3));
            int i12 = 4;
            s2Var.setScrollEndListener(new nh.u3(e4Var3, i12));
            s2Var.setDelegate(new nh.w3(e4Var3));
            s2Var.setIsKeyboardVisible(new nh.w3(e4Var3));
            e4Var3.addView(s2Var, h7.z5.c(-1.0f, -1));
            nh.y3 y3Var = new nh.y3(context, c6Var);
            e4Var3.E = y3Var;
            e4Var3.addView(y3Var, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            x3Var.setWebViewProgressListener(new gh.c6(e4Var3, i12));
            NotificationCenter.getGlobalInstance().addObserver(e4Var3, NotificationCenter.didSetNewTheme);
            longSparseArray.put(j10, e4Var3);
            ((nh.e4) longSparseArray.get(j10)).setDelegate(new nh(this, e4Var3, str, j10));
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
            MessageObject replyingMessageObject = rnVar.U.getReplyingMessageObject();
            nh.e4 e4Var4 = (nh.e4) longSparseArray.get(j10);
            long a3 = rnVar.a();
            int i13 = replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0;
            long N8 = rnVar.N8();
            nh.x3 x3Var2 = e4Var4.n;
            int i14 = this.F1;
            e4Var4.B = i14;
            e4Var4.w = a3;
            e4Var4.v = j10;
            e4Var4.y = i13;
            e4Var4.A = N8;
            e4Var4.C = str;
            org.telegram.ui.ActionBar.f1 f1Var = e4Var4.I;
            if (f1Var != null) {
                if (MediaDataController.getInstance(i14).canCreateAttachedMenuBotShortcut(j10)) {
                    f1Var.setVisibility(0);
                } else {
                    f1Var.setVisibility(8);
                }
            }
            x3Var2.setBotUser(MessagesController.getInstance(i14).getUser(Long.valueOf(j10)));
            x3Var2.q(i14, j10);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(i14).getInputPeer(a3);
            tL_messages_requestWebView.bot = MessagesController.getInstance(i14).getInputUser(j10);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a3 < 0) {
                j11 = 0;
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(-a3);
                if (chatFull != null && (peer = chatFull.default_send_as) != null) {
                    tL_messages_requestWebView.send_as = MessagesController.getInstance(i14).getInputPeer(peer);
                    tL_messages_requestWebView.flags |= 8192;
                }
            } else {
                j11 = 0;
            }
            if (str != null) {
                tL_messages_requestWebView.start_param = str;
                tL_messages_requestWebView.flags |= 8;
            }
            if (i13 != 0) {
                TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(i14).createReplyInput(i13);
                tL_messages_requestWebView.reply_to = createReplyInput;
                if (N8 != j11) {
                    createReplyInput.monoforum_peer_id = MessagesController.getInstance(i14).getInputPeer(N8);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (N8 != j11) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(i14).getInputPeer(N8);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject p6 = nh.b3.p(e4Var4.a, false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i14).sendRequest(tL_messages_requestWebView, new hh.u1(e4Var4, i14, 4));
            NotificationCenter.getInstance(i14).addObserver(e4Var4, NotificationCenter.webViewResultSent);
            if (longSparseArray.get(j10) != null) {
            }
        }
        if (longSparseArray.get(j10) != null) {
        }
    }

    public final void O1(org.telegram.ui.ActionBar.n2 n2Var) {
        if ((n2Var instanceof org.telegram.ui.rn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.rn) n2Var).e)) {
            new mc(this.n1, this.resourcesProvider).f(MessagesController.getInstance(this.F1).captionLengthLimitPremium, new org.telegram.ui.yq(13, this, n2Var)).j();
        }
    }

    public final boolean P1(boolean z10, boolean z11) {
        int i10;
        yh yhVar;
        ag.d2 d2Var;
        this.c.a(z10, true);
        ih ihVar = this.z0;
        if (z10 == (ihVar.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ihVar.setTag(z10 ? 1 : null);
        mh mhVar = this.A0;
        if (mhVar.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(mhVar.getEditText());
        }
        mhVar.k(true);
        this.L0.k(true);
        ih ihVar2 = this.t1;
        ih ihVar3 = this.D0;
        if (z10) {
            if (!this.J) {
                ihVar.setVisibility(0);
            }
            ihVar3.setVisibility(0);
        } else if (this.O0) {
            ihVar2.setVisibility(0);
        }
        yh yhVar2 = this.u0;
        boolean z12 = (yhVar2 == this.f0 || yhVar2 == this.m0) && this.Y;
        ag.d2 d2Var2 = this.T0;
        ag.y1 y1Var = this.K0;
        lh lhVar = this.y0;
        rh rhVar = this.E0;
        if (z11) {
            this.I0 = new AnimatorSet();
            if (z12) {
                y1Var.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(ihVar, (Property<ih, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(lhVar, (Property<lh, Float>) property, (!z10 || z12) ? 0.0f : 1.0f));
            if (!z10 || z12) {
                d2Var = d2Var2;
            } else {
                lhVar.setVisibility(0);
                d2Var = d2Var2;
                arrayList.add(ObjectAnimator.ofFloat(lhVar, (Property<lh, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(y1Var, (Property<ag.y1, Float>) property, (z10 && z12) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(ihVar3, (Property<ih, Float>) property2, z10 ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(ihVar3, (Property<ih, Float>) property3, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(ihVar3, (Property<ih, Float>) property, z10 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(rhVar, (Property<rh, Float>) property2, z10 ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(rhVar, (Property<rh, Float>) property3, z10 ? 1.0f : 0.2f));
            if (d2Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(ihVar, (Property<ih, Float>) View.TRANSLATION_Y, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.O0) {
                arrayList.add(ObjectAnimator.ofFloat(ihVar2, (Property<ih, Float>) View.TRANSLATION_Y, z10 ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ihVar2, (Property<ih, Float>) property, z10 ? 0.0f : 1.0f));
            }
            if (z12) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new qg(this, 4));
                arrayList.add(ofFloat);
            }
            this.I0.playTogether(arrayList);
            this.I0.setInterpolator(new DecelerateInterpolator());
            this.I0.setDuration(180L);
            this.I0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z12, 3));
            this.I0.start();
            i10 = 0;
        } else {
            ihVar.setAlpha(z10 ? 1.0f : 0.0f);
            lhVar.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            if (!z10 || z12) {
                i10 = 0;
            } else {
                i10 = 0;
                lhVar.setVisibility(0);
                lhVar.setTranslationY(0.0f);
            }
            ihVar3.setScaleX(z10 ? 1.0f : 0.2f);
            ihVar3.setScaleY(z10 ? 1.0f : 0.2f);
            ihVar3.setAlpha(z10 ? 1.0f : 0.0f);
            y1Var.setVisibility((z10 && z12) ? 0 : 8);
            y1Var.setAlpha((z10 && z12) ? 1.0f : 0.0f);
            rhVar.setScaleX(z10 ? 1.0f : 0.2f);
            rhVar.setScaleY(z10 ? 1.0f : 0.2f);
            if (d2Var2.getTag() != null) {
                ihVar.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
            } else if (this.O0 && ((yhVar = this.u0) == null || yhVar.J())) {
                ihVar2.setTranslationY(z10 ? AndroidUtilities.dp(84.0f) : 0.0f);
            }
            if (!z10) {
                ihVar.setVisibility(4);
                ihVar3.setVisibility(4);
            }
            if (z12) {
                b2();
            }
        }
        if (z10) {
            i10 = Math.max(1, this.u0.getSelectedItemsCount());
        }
        rhVar.g(i10, z11);
        rhVar.i(j1() + this.u0.getSelectedItemsCount(), this.D1 != null ? 0L : MessagesController.getInstance(this.F1).getSendPaidMessagesStars(n1()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mhVar.getLayoutParams();
        int max = Math.max(AndroidUtilities.dp(48.0f), rhVar.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            mhVar.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void Q1(yh yhVar) {
        long j10 = this.S0;
        jn jnVar = this.P;
        if (yhVar == jnVar) {
            j10 = jnVar.s;
        } else if (yhVar == this.f0) {
            j10 = 1;
        } else if (yhVar == this.h0) {
            j10 = 3;
        } else if (yhVar == this.l0) {
            j10 = 4;
        } else if (yhVar == this.g0) {
            j10 = 5;
        } else if (yhVar == this.k0) {
            j10 = 6;
        } else if (yhVar == this.i0) {
            j10 = 9;
        } else if (yhVar == this.n0) {
            j10 = 10;
        } else if (yhVar == this.o0) {
            j10 = 11;
        } else if (yhVar == this.j0) {
            j10 = 12;
        } else if (yhVar == this.p0) {
            j10 = 14;
        } else if (yhVar == this.q0) {
            j10 = 13;
        } else if (yhVar == this.r0) {
            j10 = 16;
        }
        R1(yhVar, j10, true);
    }

    public final void R1(yh yhVar, long j10, boolean z10) {
        ql qlVar;
        ql qlVar2;
        Float f10;
        int i10;
        Float valueOf = Float.valueOf(0.0f);
        if (this.p1 == null && this.I0 == null) {
            yh yhVar2 = this.u0;
            if (yhVar2 == yhVar) {
                yhVar2.G();
                return;
            }
            if (yhVar == this.j0 && !UserConfig.getInstance(this.F1).isPremium()) {
                new ag.g2(this.b0, 39, false).show();
                return;
            }
            int i11 = 1;
            int i12 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
            this.f.a(i12 == 0, z10);
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
            ih ihVar = this.t1;
            ihVar.setAlpha(1.0f);
            ihVar.setTranslationY(this.B1);
            int i13 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.t0;
                if (i13 >= longSparseArray.size()) {
                    break;
                }
                ((nh.e4) longSparseArray.valueAt(i13)).setMeasureOffsetY(0);
                i13++;
            }
            this.S0 = j10;
            jh jhVar = this.u1;
            int childCount = jhVar.getChildCount();
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = jhVar.getChildAt(i14);
                if (childAt instanceof ai) {
                    ai aiVar = (ai) childAt;
                    i10 = i12;
                    f10 = valueOf;
                    aiVar.a.e(((long) aiVar.b) == aiVar.c.S0, true);
                } else {
                    f10 = valueOf;
                    i10 = i12;
                    if (childAt instanceof zh) {
                        ((zh) childAt).a(true);
                    }
                }
                i14++;
                i12 = i10;
                valueOf = f10;
            }
            Float f11 = valueOf;
            int i15 = i12;
            int firstOffset = (this.u0.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.X1[0];
            this.v0 = yhVar;
            yhVar.getClass();
            boolean z11 = yhVar instanceof rh.p;
            sg.f fVar = this.r1;
            if (fVar != null) {
                fVar.setFadeHeightBottom(z11 ? 0 : AndroidUtilities.dp(48.0f));
            }
            kh khVar = this.s1;
            if (khVar != null) {
                khVar.setVisibility(z11 ? 4 : 0);
            }
            int i16 = this.v0.h() != 0 ? 0 : 4;
            ag.d2 d2Var = this.T0;
            d2Var.setVisibility(i16);
            if (d2Var.j0) {
                d2Var.h(true);
            }
            this.u0.s();
            yh yhVar3 = this.v0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
            if (yhVar3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.v0.E(this.u0);
            this.v0.setVisibility(0);
            if (yhVar.getParent() != null) {
                this.containerView.removeView(this.v0);
            }
            int indexOfChild = this.containerView.indexOfChild(this.u0);
            ViewParent parent = this.v0.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                yh yhVar4 = this.v0;
                if (yhVar4 != this.k0) {
                    indexOfChild++;
                }
                viewGroup.addView(yhVar4, indexOfChild, h7.z5.c(-1.0f, -1));
            }
            sg sgVar = new sg(this, 3);
            yh yhVar5 = this.u0;
            boolean z12 = yhVar5 instanceof em;
            uh uhVar = this.a0;
            if (z12 || (this.v0 instanceof em)) {
                int max = Math.max(this.v0.getWidth(), this.u0.getWidth());
                yh yhVar6 = this.v0;
                if (yhVar6 instanceof em) {
                    yhVar6.setTranslationX(max);
                    yh yhVar7 = this.u0;
                    if ((yhVar7 instanceof ChatAttachAlertPhotoLayout) && (qlVar2 = ((ChatAttachAlertPhotoLayout) yhVar7).L) != null) {
                        qlVar2.setVisibility(4);
                    }
                } else {
                    this.u0.setTranslationX(-max);
                    yh yhVar8 = this.v0;
                    if (yhVar8 == chatAttachAlertPhotoLayout && (qlVar = ((ChatAttachAlertPhotoLayout) yhVar8).L) != null) {
                        qlVar.setVisibility(0);
                    }
                }
                this.v0.setAlpha(1.0f);
                this.u0.setAlpha(1.0f);
                if (z10) {
                    yh yhVar9 = this.u0;
                    uhVar.getClass();
                    uhVar.a(yhVar9, f11);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3(this, yhVar, sgVar, 11));
                } else {
                    boolean z13 = this.v0.getCurrentItemTop() <= yhVar.getButtonsHideOffset();
                    this.u0.t(1.0f);
                    this.v0.t(1.0f);
                    this.u0.k(this.h2);
                    this.v0.k(this.h2);
                    this.containerView.invalidate();
                    yh yhVar10 = this.u0;
                    Float valueOf2 = Float.valueOf(1.0f);
                    uhVar.getClass();
                    uhVar.a(yhVar10, valueOf2);
                    d2Var.setTag(z13 ? 1 : null);
                    sgVar.run();
                }
            } else if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.v0.setAlpha(0.0f);
                this.v0.setTranslationY(AndroidUtilities.dp(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.u0, (Property<yh, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.u0, uhVar, 0.0f, 1.0f), ObjectAnimator.ofFloat(d2Var, (Property<ag.d2, Float>) View.ALPHA, d2Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(er.f);
                animatorSet.addListener(new hh.l3(this, firstOffset, sgVar, i11));
                this.p1 = animatorSet;
                yh yhVar11 = this.u0;
                uhVar.getClass();
                uhVar.a(yhVar11, f11);
                animatorSet.start();
            } else {
                yhVar5.setAlpha(0.0f);
                sgVar.run();
                a2(0);
                this.containerView.invalidate();
            }
            if (this.i2 && !(yhVar instanceof nh.e4)) {
                this.i2 = false;
                d2Var.d();
                d2Var.invalidate();
                u1();
            }
            d2Var.setForcedMenuWidth((i15 == 0 || j10 == 6 || (yhVar instanceof nh.e4)) ? AndroidUtilities.dp(46.0f) : j10 == 4 ? AndroidUtilities.dp(84.0f) : 0);
        }
    }

    public final void S1(boolean z10, Boolean bool) {
        gi giVar;
        if (this.i0 == null) {
            giVar = this;
            in inVar = new in(giVar, getContext(), false, this.resourcesProvider, bool);
            giVar.i0 = inVar;
            giVar.s0[1] = inVar;
            inVar.setDelegate(new pg(this, 15));
        } else {
            giVar = this;
        }
        R1(giVar.i0, 9L, z10);
    }

    public final void T1(boolean z10, boolean z11) {
        yh yhVar;
        this.d.a(z10, z11);
        ag.d2 d2Var = this.T0;
        if (!(z10 && d2Var.getTag() == null) && (z10 || d2Var.getTag() == null)) {
            return;
        }
        d2Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet = this.U0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.U0 = null;
        }
        boolean z12 = (this.B || this.P0 || (this.M0 == 0 && this.m1) || this.u0 != this.f0 || (!this.H1 && !this.I1)) ? false : true;
        if (this.u0 == this.P) {
            z12 = false;
        }
        ih ihVar = this.t1;
        org.telegram.ui.ActionBar.v0 v0Var = this.W0;
        if (z10) {
            if (z12) {
                v0Var.setVisibility(0);
                v0Var.setClickable(true);
            }
        } else if (this.O0 && this.z0.getTag() == null) {
            ihVar.setVisibility(0);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (n2Var != null) {
            if (z10) {
                AndroidUtilities.setLightStatusBar(this, i0.b.f(getThemedColor(this.d2 ? org.telegram.ui.ActionBar.g6.tg : org.telegram.ui.ActionBar.g6.h5)) > 0.699999988079071d);
            } else {
                AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
            }
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.U0 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z10 ? 1.0f : 0.0f) - d2Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(d2Var, (Property<ag.d2, Float>) property, z10 ? 1.0f : 0.0f));
            if (z12) {
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
            }
            this.U0.playTogether(arrayList);
            this.U0.addListener(new org.telegram.ui.go(3, this, z10));
            this.U0.setInterpolator(er.h);
            this.U0.setDuration(380L);
            this.U0.start();
            return;
        }
        if (z10 && this.O0 && ((yhVar = this.u0) == null || yhVar.J())) {
            ihVar.setVisibility(4);
        }
        d2Var.setAlpha(z10 ? 1.0f : 0.0f);
        if (z12) {
            v0Var.setAlpha(z10 ? 1.0f : 0.0f);
            v0Var.setScaleX(z10 ? 1.0f : 0.6f);
            v0Var.setScaleY(z10 ? 1.0f : 0.6f);
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = this.a1;
        if (v0Var2 != null) {
            v0Var2.setVisibility(4);
        }
        if (this.M0 == 0 && this.m1) {
            return;
        }
        v0Var.setVisibility(4);
    }

    public final void U1() {
        float alpha;
        int[] iArr = this.C0;
        mh mhVar = this.A0;
        mhVar.getLocationOnScreen(iArr);
        if (this.x2 != null) {
            yh yhVar = this.u0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
            if ((yhVar == chatAttachAlertPhotoLayout || yhVar == this.m0) && this.Y) {
                ag.y1 y1Var = this.K0;
                alpha = (y1Var.getAlpha() * y1Var.getMeasuredHeight()) + (y1Var.getY() - this.x2.getTop());
            } else {
                alpha = -mhVar.getHeight();
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
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.p1 != null) {
            return;
        }
        int selectedItemsCount = this.u0.getSelectedItemsCount();
        rh rhVar = this.E0;
        if (selectedItemsCount == 0) {
            rhVar.g(0, i10 != 0);
            P1(false, i10 != 0);
        } else {
            if (P1(true, i10 != 0) || i10 == 0) {
                rhVar.g(selectedItemsCount, i10 != 0);
                rhVar.b();
            } else {
                rhVar.g(selectedItemsCount, true);
                rhVar.b();
            }
        }
        this.u0.C(selectedItemsCount);
        d1(i10 != 0);
        if (this.u0 == this.f0 && ((((z10 = (n2Var = this.b0) instanceof org.telegram.ui.rn)) || this.M0 != 0 || this.P0) && ((selectedItemsCount == 0 && this.m1) || ((selectedItemsCount != 0 || this.M0 != 0 || this.P0) && !this.m1)))) {
            this.m1 = (selectedItemsCount == 0 && this.M0 == 0 && !this.P0) ? false : true;
            AnimatorSet animatorSet = this.V0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
            int i11 = this.M0;
            ag.d2 d2Var = this.T0;
            org.telegram.ui.ActionBar.v0 v0Var = this.a1;
            if (i11 != 0 && v0Var != null && d2Var.getTag() != null && z10) {
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
                if (!ChatObject.isChannel(rnVar.e) || (tL_chatBannedRights = rnVar.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                    z11 = true;
                    z12 = this.m1;
                    ih ihVar = this.e1;
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.W0;
                    if (!z12) {
                        if (this.M0 == 0 && !this.P0) {
                            v0Var2.setVisibility(0);
                            v0Var2.setClickable(true);
                        }
                        ihVar.setVisibility(0);
                    } else if (d2Var.getTag() != null && v0Var != null) {
                        v0Var.setVisibility(0);
                    }
                    if (i10 != 0) {
                        if (d2Var.getTag() == null && this.M0 == 0 && !this.P0) {
                            v0Var2.setAlpha(this.m1 ? 1.0f : 0.0f);
                            v0Var2.setScaleX(this.m1 ? 1.0f : 0.6f);
                            v0Var2.setScaleY(this.m1 ? 1.0f : 0.6f);
                        }
                        ihVar.setAlpha(this.m1 ? 1.0f : 0.0f);
                        if (z11) {
                            v0Var.setAlpha(this.m1 ? 0.0f : 1.0f);
                        }
                        if (this.m1 && v0Var != null) {
                            v0Var.setVisibility(4);
                        }
                    } else {
                        this.V0 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (d2Var.getTag() == null && this.M0 == 0 && !this.P0) {
                            arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, this.m1 ? 1.0f : 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_X, this.m1 ? 1.0f : 0.6f));
                            arrayList.add(ObjectAnimator.ofFloat(v0Var2, (Property<org.telegram.ui.ActionBar.v0, Float>) View.SCALE_Y, this.m1 ? 1.0f : 0.6f));
                        }
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(ihVar, (Property<ih, Float>) property, this.m1 ? 1.0f : 0.0f));
                        if (z11) {
                            arrayList.add(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property, this.m1 ? 0.0f : 1.0f));
                        }
                        this.V0.playTogether(arrayList);
                        this.V0.addListener(new org.telegram.ui.am(this, 14));
                        this.V0.setDuration(180L);
                        this.V0.start();
                    }
                }
            }
            z11 = false;
            z12 = this.m1;
            ih ihVar2 = this.e1;
            org.telegram.ui.ActionBar.v0 v0Var22 = this.W0;
            if (!z12) {
            }
            if (i10 != 0) {
            }
        }
        Y1(i10 != 0);
        MessageObject messageObject = this.D1;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.F1).getSendPaidMessagesStars(n1()) : 0L;
        yh yhVar = this.u0;
        rhVar.i(j1() + (yhVar != null ? yhVar.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        mh mhVar = this.A0;
        if (mhVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mhVar.getLayoutParams();
            int max = Math.max(AndroidUtilities.dp(48.0f), rhVar.l());
            if (marginLayoutParams.rightMargin != max) {
                marginLayoutParams.rightMargin = max;
                mhVar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void W1() {
        float f10;
        yh yhVar = this.u0;
        boolean g10 = yhVar == null ? false : yhVar.g();
        ag.e1 e1Var = this.b1;
        e1Var.setEnabled(g10);
        yh yhVar2 = this.u0;
        if (yhVar2 != null) {
            f10 = ((yhVar2.g() ? 1.0f : 0.5f) * (this.v0 == null ? 1.0f : this.Z)) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        yh yhVar3 = this.v0;
        if (yhVar3 != null) {
            f10 = com.google.android.recaptcha.internal.a.z(1.0f, this.Z, yhVar3.g() ? 1.0f : 0.5f, f10);
        }
        this.c1 = f10;
        if (e1Var != null) {
            float f11 = f10 * this.d1;
            e1Var.setAlpha(f11);
            e1Var.setVisibility(f11 <= 0.0f ? 4 : 0);
        }
    }

    public final void X1(yh yhVar, int i10) {
        if (yhVar == null) {
            return;
        }
        jg.e eVar = this.y2;
        if (eVar != null && Build.VERSION.SDK_INT >= 31) {
            eVar.f(0.0f, i10);
            Z0();
        }
        int currentItemTop = yhVar.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z10 = false;
        boolean z11 = yhVar == this.u0 && currentItemTop <= yhVar.getButtonsHideOffset();
        this.N = z11;
        if (yhVar == this.u0) {
            T1(z11, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yhVar.getLayoutParams();
        int C = org.telegram.messenger.rl.C(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        yh yhVar2 = this.u0;
        int i11 = yhVar2 == yhVar ? 0 : 1;
        if ((yhVar2 instanceof em) || (this.v0 instanceof em)) {
            Object obj = this.p1;
            if ((obj instanceof o1.j) && ((o1.j) obj).f) {
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
        lh.v vVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        if (chatAttachAlertPhotoLayout == null || (vVar = this.X0) == null) {
            return;
        }
        boolean z11 = this.m1 && this.e0 && this.u0 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.c0();
        boolean z12 = !ChatAttachAlertPhotoLayout.S();
        vVar.f = z12;
        if (!z10) {
            ((y5) vVar.g).a(z12);
        }
        vVar.invalidateSelf();
        org.telegram.ui.ActionBar.v0 v0Var = this.Y0;
        if (z10 && this.m1) {
            v0Var.setVisibility(0);
            v0Var.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(er.h).withEndAction(new bh(this, z11, 0)).start();
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
        jg.e eVar;
        boolean z10;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.y2) == null) {
            return;
        }
        ih ihVar = this.t1;
        ViewGroup viewGroup = this.containerView;
        RectF rectF = this.H2;
        qg.j.c(ihVar, viewGroup, rectF);
        float measuredWidth = this.containerView.getMeasuredWidth();
        float measuredHeight = this.T0.getMeasuredHeight();
        RectF rectF2 = this.G2;
        rectF2.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        rectF2.inset(0.0f, -AndroidUtilities.dp(48.0f));
        rectF.set(0.0f, this.containerView.getMeasuredHeight() - (AndroidUtilities.dp(180.0f) + Math.max(AndroidUtilities.navigationBarHeight, o1())), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        yh yhVar = this.u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        if (yhVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null) {
            gl glVar = chatAttachAlertPhotoLayout.A;
            if (glVar.getFastScroll() != null) {
                ik0 fastScroll = glVar.getFastScroll();
                lg.d dVar = fastScroll.a0;
                RectF rectF3 = this.I2;
                if (dVar != null || fastScroll.b0 != null) {
                    rectF3.set(fastScroll.b0.getBounds());
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(fastScroll.a0.getBounds());
                    rectF3.union(rectF4);
                }
                ik0 fastScroll2 = glVar.getFastScroll();
                ViewGroup viewGroup2 = this.containerView;
                RectF rectF5 = AndroidUtilities.rectTmp;
                qg.j.c(fastScroll2, viewGroup2, rectF5);
                rectF3.offset(rectF5.left, rectF5.top);
                rectF3.inset(-AndroidUtilities.dp(48.0f), -AndroidUtilities.dp(48.0f));
                rectF3.left = Math.max(0.0f, rectF3.left);
                rectF3.right = Math.min(this.containerView.getMeasuredWidth(), rectF3.right);
                z10 = true;
                int i10 = !z10 ? 3 : 2;
                ArrayList arrayList = this.F2;
                ArrayList arrayList2 = this.J2;
                eVar.g(gf.m0.a(arrayList, i10, arrayList2), arrayList2);
                eVar.e(this.E2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
            }
        }
        z10 = false;
        if (!z10) {
        }
        ArrayList arrayList3 = this.F2;
        ArrayList arrayList22 = this.J2;
        eVar.g(gf.m0.a(arrayList3, i10, arrayList22), arrayList22);
        eVar.e(this.E2, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void Z1(boolean z10) {
        yh yhVar = this.f0;
        if (!z10) {
            Q1(yhVar);
            return;
        }
        if (this.I) {
            if (this.m0 == null) {
                Context context = getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.r;
                if (c6Var == null) {
                    c6Var = this.resourcesProvider;
                }
                em emVar = new em(context, c6Var, this);
                emVar.y = 0.0f;
                emVar.A = 0.0f;
                emVar.B = 0.0f;
                emVar.C = 0.0f;
                emVar.D = 0.0f;
                emVar.E = 0.0f;
                emVar.F = null;
                emVar.G = false;
                emVar.I = 0.0f;
                emVar.M = false;
                emVar.O = false;
                Point point = AndroidUtilities.displaySize;
                emVar.P = point.y > point.x;
                emVar.n = c6Var;
                emVar.f = true;
                emVar.setWillNotDraw(false);
                org.telegram.ui.ActionBar.z n10 = emVar.b.T0.n();
                TextView textView = new TextView(context);
                emVar.x = textView;
                org.telegram.ui.ActionBar.c6 c6Var2 = emVar.a;
                ll llVar = new ll(emVar, context, n10, c6Var2, 1);
                emVar.b.T0.addView(llVar, 0, h7.z5.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
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
                llVar.addView(textView, h7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                hh.f1 f1Var = new hh.f1(emVar, context, c6Var2, 14);
                emVar.r = f1Var;
                f1Var.setAdapter(new org.telegram.ui.w7(emVar, 3));
                f2.k0 k0Var = new f2.k0(1, false);
                emVar.s = k0Var;
                f1Var.setLayoutManager(k0Var);
                f1Var.setClipChildren(false);
                f1Var.setClipToPadding(false);
                f1Var.setOverScrollMode(2);
                f1Var.setVerticalScrollBarEnabled(false);
                dm dmVar = new dm(emVar, context);
                emVar.v = dmVar;
                dmVar.setClipToPadding(true);
                dmVar.setClipChildren(true);
                emVar.addView(f1Var, h7.z5.c(-1.0f, -1));
                emVar.L = emVar.b.f0;
                dmVar.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = emVar.L;
                dmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                dmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                dmVar.c();
                UndoView undoView = new UndoView(context, null, false, emVar.b.r);
                emVar.w = undoView;
                undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
                emVar.addView(undoView, h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                emVar.J = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.m0 = emVar;
                emVar.bringToFront();
            }
            yh yhVar2 = this.u0;
            em emVar2 = this.m0;
            if (yhVar2 != emVar2) {
                yhVar = emVar2;
            }
            Q1(yhVar);
        }
    }

    public final boolean a1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        return (n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).K6();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a2(int i10) {
        int i11;
        float f10;
        org.telegram.ui.ActionBar.v0 v0Var;
        float f11;
        float f12;
        float f13;
        float f14;
        ag.e1 e1Var;
        float max;
        int i12;
        float f15 = this.d.e;
        yh yhVar = i10 == 0 ? this.u0 : this.v0;
        if (yhVar == null || yhVar.getVisibility() != 0) {
            return;
        }
        int p12 = p1(i10);
        if (yhVar == this.i0 || yhVar == this.j0) {
            AndroidUtilities.dp(13.0f);
            AndroidUtilities.dp(11.0f);
        } else {
            AndroidUtilities.dp(39.0f);
            AndroidUtilities.dp(43.0f);
        }
        org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        float f16 = 1.0f - f15;
        if (AndroidUtilities.isTablet()) {
            i11 = 16;
        } else {
            Point point = AndroidUtilities.displaySize;
            i11 = point.x > point.y ? 6 : 12;
        }
        float alpha = this.T0.getAlpha();
        ih ihVar = this.e1;
        float dp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - ihVar.getAlpha()) * 26.0f);
        boolean z10 = this.m1;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.W0;
        ag.y1 y1Var = this.K0;
        if (z10 && this.M0 == 0 && !this.P0) {
            v0Var2.setTranslationY(Math.max((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37), ((p12 - AndroidUtilities.dp((i11 * f15) + 37.0f)) + dp) - (y1Var.getAlpha() * y1Var.getMeasuredHeight())) + this.h2);
        } else {
            v0Var2.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i11 + 37)) + this.h2);
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.Y0;
        if (v0Var3 != null) {
            v0Var3.setTranslationY(v0Var2.getTranslationY());
        }
        lh.w3 w3Var = this.Z0;
        if (w3Var != null) {
            w3Var.setTranslationY(v0Var2.getTranslationY());
        }
        if (this.B && this.o1) {
            yh yhVar2 = this.v0;
            if (yhVar2 != null && this.u0 != null) {
                f10 = Math.min(yhVar2.getTranslationY(), this.u0.getTranslationY());
            } else if (yhVar2 != null) {
                f10 = yhVar2.getTranslationY();
            }
            v0Var = this.a1;
            if (v0Var != null) {
                v0Var.setTranslationY(((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i11 + 37)) + this.h2);
            }
            float dp2 = ((((p12 - AndroidUtilities.dp((i11 * f15) + 25.0f)) + dp) + this.h2) + f10) - (y1Var.getAlpha() * y1Var.getMeasuredHeight());
            this.l1 = dp2;
            ihVar.setTranslationY(Math.max(this.h2, dp2));
            y1Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h2, (ihVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.l1 + AndroidUtilities.dp(8.0f)));
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
                in inVar = this.i0;
                if (inVar == this.v0) {
                    f12 = (inVar.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i12 * f15) + 7.0f) - (f16 * 12.0f));
                    f11 = this.Z;
                } else if (inVar == this.u0) {
                    f12 = (inVar.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i12 * f15) + 7.0f) - (f16 * 12.0f));
                    f11 = this.v0 == null ? 1.0f : 1.0f - this.Z;
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
                    in inVar2 = this.j0;
                    if (inVar2 == this.v0) {
                        f14 = (inVar2.getTranslationY() + p1(1)) - AndroidUtilities.dp(((i13 * f15) + 7.0f) - (f16 * 12.0f));
                        f13 = this.Z;
                    } else if (inVar2 == this.u0) {
                        f14 = (inVar2.getTranslationY() + p1(0)) - AndroidUtilities.dp(((i13 * f15) + 7.0f) - (f16 * 12.0f));
                        f13 = this.v0 != null ? 1.0f - this.Z : 1.0f;
                    }
                    e1Var = this.b1;
                    if (e1Var != null) {
                        int measuredWidth = LocaleController.isRTL ? (this.containerView.getMeasuredWidth() - e1Var.getMeasuredWidth()) - AndroidUtilities.dp(62.0f) : 0;
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
                        e1Var.setTranslationY(Math.max(0.0f, max) + this.h2);
                        e1Var.setTranslationX(-((measuredWidth * f16) + AndroidUtilities.dp((7.0f * f16) + 12.0f)));
                    }
                    float max2 = Math.max(f13, f11);
                    this.d1 = max2;
                    if (e1Var == null) {
                        float f17 = this.c1 * max2;
                        e1Var.setAlpha(f17);
                        e1Var.setVisibility(f17 <= 0.0f ? 4 : 0);
                        return;
                    }
                    return;
                }
                f13 = 0.0f;
                f14 = 0.0f;
                e1Var = this.b1;
                if (e1Var != null) {
                }
                float max22 = Math.max(f13, f11);
                this.d1 = max22;
                if (e1Var == null) {
                }
            }
            f11 = 0.0f;
            f12 = 0.0f;
            if (this.j0 != null) {
            }
            f13 = 0.0f;
            f14 = 0.0f;
            e1Var = this.b1;
            if (e1Var != null) {
            }
            float max222 = Math.max(f13, f11);
            this.d1 = max222;
            if (e1Var == null) {
            }
        }
        f10 = 0.0f;
        v0Var = this.a1;
        if (v0Var != null) {
        }
        float dp22 = ((((p12 - AndroidUtilities.dp((i11 * f15) + 25.0f)) + dp) + this.h2) + f10) - (y1Var.getAlpha() * y1Var.getMeasuredHeight());
        this.l1 = dp22;
        ihVar.setTranslationY(Math.max(this.h2, dp22));
        y1Var.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h2, (ihVar.getAlpha() * AndroidUtilities.dp(26.0f)) + this.l1 + AndroidUtilities.dp(8.0f)));
        if (this.Y) {
        }
        g1();
        int i132 = 59;
        if (this.i0 != null) {
        }
        f11 = 0.0f;
        f12 = 0.0f;
        if (this.j0 != null) {
        }
        f13 = 0.0f;
        f14 = 0.0f;
        e1Var = this.b1;
        if (e1Var != null) {
        }
        float max2222 = Math.max(f13, f11);
        this.d1 = max2222;
        if (e1Var == null) {
        }
    }

    public final boolean b1(CharSequence charSequence) {
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (!(n2Var instanceof org.telegram.ui.rn)) {
            return false;
        }
        return ChatActivityEnterView.I(this.F1, ((org.telegram.ui.rn) n2Var).a(), n2Var, charSequence);
    }

    public final void b2() {
        int i10 = 0;
        a2(0);
        this.n1.invalidate();
        ag.y1 y1Var = this.K0;
        y1Var.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        if (chatAttachAlertPhotoLayout != null) {
            gl glVar = chatAttachAlertPhotoLayout.A;
            chatAttachAlertPhotoLayout.V();
            if (glVar != null && glVar.getFastScroll() != null) {
                ik0 fastScroll = glVar.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.l1;
                if (this.Y) {
                    i10 = (int) (y1Var.getAlpha() * y1Var.getMeasuredHeight());
                }
                fastScroll.d0 = currentActionBarHeight + i10;
                glVar.getFastScroll().invalidate();
            }
        }
        U1();
        g1();
    }

    public final void c1() {
        jh jhVar = this.u1;
        if (jhVar == null) {
            return;
        }
        int childCount = jhVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            jhVar.getChildAt(i10);
        }
        boolean z10 = this.d2;
        this.f1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
        this.k1.setTextColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
        this.b1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        int themedColor = getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5);
        org.telegram.ui.ActionBar.v0 v0Var = this.W0;
        v0Var.setIconColor(themedColor);
        org.telegram.ui.ActionBar.g6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.ig : org.telegram.ui.ActionBar.g6.I5), v0Var.getBackground());
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        v0Var.G(getThemedColor(i11), false);
        v0Var.G(getThemedColor(i11), true);
        v0Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.Y0;
        if (v0Var2 != null) {
            v0Var2.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.a1;
        if (v0Var3 != null) {
            v0Var3.setIconColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
            org.telegram.ui.ActionBar.g6.w1(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.ig : org.telegram.ui.ActionBar.g6.I5), v0Var3.getBackground());
        }
        mh mhVar = this.A0;
        org.telegram.ui.ActionBar.c6 c6Var = mhVar.I;
        ot otVar = mhVar.a;
        int i12 = mhVar.H;
        if (i12 == 0) {
            otVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
            int i13 = org.telegram.ui.ActionBar.g6.G6;
            otVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
            otVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        } else if (i12 == 2 || i12 == 3) {
            otVar.setHintTextColor(-1929379841);
            otVar.setTextColor(-1);
            otVar.setCursorColor(-1);
            otVar.setHandlesColor(-1);
            otVar.setHighlightColor(822083583);
            otVar.quoteColor = -1;
        } else {
            otVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t5, c6Var));
            otVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
        }
        mhVar.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xd, c6Var), PorterDuff.Mode.MULTIPLY));
        pt ptVar = mhVar.d;
        if (ptVar != null) {
            ptVar.U();
        }
        jhVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        int themedColor2 = getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5);
        ag.d2 d2Var = this.T0;
        d2Var.D(themedColor2, false);
        d2Var.C(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.ig : org.telegram.ui.ActionBar.g6.I5), false);
        d2Var.setTitleColor(getThemedColor(z10 ? org.telegram.ui.ActionBar.g6.hg : org.telegram.ui.ActionBar.g6.j5));
        int q12 = q1(false);
        org.telegram.ui.ActionBar.g6.w1(q12, this.shadowDrawable);
        og.c cVar = this.B2;
        if (cVar.a.getColor() != q12) {
            cVar.a(q12);
            sg.f fVar = this.r1;
            if (fVar != null) {
                fVar.invalidate();
            }
            kh khVar = this.s1;
            if (khVar != null) {
                khVar.invalidate();
            }
        }
        this.containerView.invalidate();
        int i14 = 0;
        while (true) {
            yh[] yhVarArr = this.s0;
            if (i14 >= yhVarArr.length) {
                break;
            }
            yh yhVar = yhVarArr[i14];
            if (yhVar != null) {
                yhVar.d();
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

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithTouchOutside() {
        return this.u0.b();
    }

    @Override // org.telegram.ui.ActionBar.e3
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
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.rn)) {
            return;
        }
        org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
        tt ttVar = this.Y ? this.L0 : this.A0;
        String obj = ttVar != null ? ttVar.getText().toString() : null;
        if (this.D1 == null) {
            yh yhVar = this.u0;
            z11 = true;
            if (yhVar != null) {
            }
            if (gf.x.g(this.F1).e(obj, rnVar.Z7) <= 0) {
                MessageObject messageObject = rnVar.j5;
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
            di diVar = this.w1;
            if (diVar != null) {
                diVar.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, org.telegram.ui.ActionBar.j2
    public final void dismiss(boolean z10) {
        if (z10) {
            this.w2 = z10;
        }
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public void dismissInternal() {
        ei eiVar = this.V1;
        if (eiVar != null) {
            eiVar.y(new sg(this, 2));
        } else {
            F1();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissWithButtonClick(int i10) {
        super.dismissWithButtonClick(i10);
        this.u0.p(i10);
    }

    public final void e1() {
        float f10 = this.c.e;
        this.s1.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f10) * (1.0f - this.d.e))), 1.0f - ((1.0f - this.b.e) * f10)));
    }

    public final void f1() {
        m10.d(this.B0, com.google.android.recaptcha.internal.a.C(this.e.e, this.f.e, gf.m0.b(this.h.e), this.N1 ? 0.0f : 1.0f));
    }

    @Override // org.telegram.ui.ActionBar.y2
    public final boolean g() {
        return true;
    }

    public final void g1() {
        rh rhVar = this.E0;
        ih ihVar = this.D0;
        ag.y1 y1Var = this.K0;
        if (y1Var == null || y1Var.getVisibility() != 0 || y1Var.getAlpha() == 0.0f) {
            ihVar.setTranslationY(this.c2);
            rhVar.setAlpha(1.0f);
            return;
        }
        float f10 = this.b.e;
        float abs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f10));
        rhVar.setAlpha(abs * abs * abs * abs);
        ihVar.setTranslationY(AndroidUtilities.lerp(this.c2, ((y1Var.getTranslationY() + y1Var.getTop()) - ihVar.getTop()) + AndroidUtilities.dp(8.0f), er.j.getInterpolation(f10)));
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            yh[] yhVarArr = this.s0;
            if (i10 >= yhVarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.container, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.i5));
                return arrayList;
            }
            yh yhVar = yhVarArr[i10];
            if (yhVar != null && (themeDescriptions = yhVar.getThemeDescriptions()) != null) {
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
        org.telegram.ui.ActionBar.v0 v0Var = this.g1;
        if (v0Var != null) {
            this.f1.setTranslationY(0.0f);
            v0Var.setVisibility(8);
        }
    }

    public final void i1(lh.a8 a8Var) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.f1;
        textView.setText(string);
        this.O0 = false;
        this.t1.setVisibility(8);
        this.M0 = 1;
        this.B = true;
        this.C = true;
        this.e0 = false;
        this.F = a8Var;
        org.telegram.ui.ActionBar.v0 v0Var = this.g1;
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
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (!(n2Var instanceof org.telegram.ui.rn) || (messagePreviewParams = ((org.telegram.ui.rn) n2Var).b5) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public final TLRPC.Chat k1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        return n2Var instanceof org.telegram.ui.rn ? ((org.telegram.ui.rn) n2Var).e : MessagesController.getInstance(this.F1).getChat(Long.valueOf(-this.V));
    }

    public final float l1() {
        return r0.getMeasuredHeight() - ((1.0f - this.z0.getAlpha()) * (r0.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final tt m1() {
        yh yhVar;
        return (this.Y && ((yhVar = this.u0) == this.f0 || yhVar == this.m0)) ? this.L0 : this.A0;
    }

    public final long n1() {
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        return n2Var instanceof org.telegram.ui.rn ? ((org.telegram.ui.rn) n2Var).a() : this.V;
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        yh yhVar;
        if (i10 == 0) {
            g1();
            e1();
            return;
        }
        if (i10 == 2) {
            e1();
            in inVar = this.i0;
            if (inVar != null && ((yhVar = this.v0) == inVar || this.u0 == inVar)) {
                a2(yhVar == inVar ? 1 : 0);
            }
            in inVar2 = this.j0;
            if (inVar2 != null) {
                yh yhVar2 = this.v0;
                if (yhVar2 == inVar2 || this.u0 == inVar2) {
                    a2(yhVar2 != inVar2 ? 0 : 1);
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
            rh rhVar = this.E0;
            if (rhVar != null) {
                rhVar.setEphemeralFactor(f10);
                rhVar.setSameWidthFactor(f10);
            }
        }
    }

    public final int o1() {
        yh yhVar = this.u0;
        in inVar = this.i0;
        if (yhVar == inVar && inVar.A != null) {
            return inVar.getEmojiPadding();
        }
        in inVar2 = this.j0;
        return (yhVar != inVar2 || inVar2.A == null) ? this.Y ? this.L0.getEmojiPadding() : this.A0.getEmojiPadding() : inVar2.getEmojiPadding();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        if (this.O.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        ag.d2 d2Var = this.T0;
        if (d2Var.j0) {
            d2Var.h(true);
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

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.u0.l(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        k81 k81Var = chatAttachAlertPhotoLayout.h0;
        ag.p1 p1Var = chatAttachAlertPhotoLayout.f0;
        TextView textView = chatAttachAlertPhotoLayout.l0;
        gl glVar = chatAttachAlertPhotoLayout.r;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        boolean z10 = i14 < i15;
        int i16 = AndroidUtilities.navigationBarHeight;
        if (view == p1Var) {
            if (z10) {
                if (glVar.getVisibility() == 0) {
                    p1Var.layout(0, org.telegram.messenger.y1.B(222.0f, i13, i16), i14, org.telegram.messenger.y1.B(96.0f, i13, i16));
                    return true;
                }
                p1Var.layout(0, org.telegram.messenger.y1.B(126.0f, i13, i16), i14, i13 - i16);
                return true;
            }
            if (glVar.getVisibility() == 0) {
                p1Var.layout(org.telegram.messenger.y1.B(222.0f, i12, i16), 0, i12 - AndroidUtilities.dp(96.0f), i15 - i16);
                return true;
            }
            p1Var.layout(org.telegram.messenger.y1.B(126.0f, i12, i16), 0, i12, i15 - i16);
            return true;
        }
        if (view == k81Var) {
            if (z10) {
                if (glVar.getVisibility() == 0) {
                    k81Var.layout(0, org.telegram.messenger.y1.B(310.0f, i13, i16), i14, org.telegram.messenger.y1.B(260.0f, i13, i16));
                    return true;
                }
                k81Var.layout(0, org.telegram.messenger.y1.B(176.0f, i13, i16), i14, org.telegram.messenger.y1.B(126.0f, i13, i16));
                return true;
            }
            if (glVar.getVisibility() == 0) {
                k81Var.layout(org.telegram.messenger.y1.B(310.0f, i12, i16), 0, i12 - AndroidUtilities.dp(260.0f), i15 - i16);
                return true;
            }
            k81Var.layout(org.telegram.messenger.y1.B(176.0f, i12, i16), 0, i12 - AndroidUtilities.dp(126.0f), i15 - i16);
            return true;
        }
        if (view != textView) {
            if (view != glVar) {
                return false;
            }
            if (z10) {
                int B = org.telegram.messenger.y1.B(88.0f, i15, i16);
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
            if (glVar.getVisibility() == 0) {
                dp3 -= AndroidUtilities.dp(96.0f);
            }
            measuredWidth = dp3 - i16;
        } else {
            dp = i12 - AndroidUtilities.dp(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i15 / 2);
            textView.setRotation(-90.0f);
            if (glVar.getVisibility() == 0) {
                dp -= AndroidUtilities.dp(96.0f);
            }
        }
        textView.layout(dp, measuredWidth, textView.getMeasuredWidth() + dp, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onCustomMeasure(View view, int i10, int i11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        ul ulVar = chatAttachAlertPhotoLayout.v;
        gl glVar = chatAttachAlertPhotoLayout.r;
        org.telegram.ui.j jVar = chatAttachAlertPhotoLayout.s;
        boolean z10 = i10 < i11;
        ql qlVar = chatAttachAlertPhotoLayout.L;
        if (view != qlVar) {
            ag.p1 p1Var = chatAttachAlertPhotoLayout.f0;
            if (view == p1Var) {
                if (z10) {
                    p1Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30));
                    return true;
                }
                p1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            k81 k81Var = chatAttachAlertPhotoLayout.h0;
            if (view == k81Var) {
                if (z10) {
                    k81Var.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                    return true;
                }
                k81Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                return true;
            }
            if (view == glVar) {
                chatAttachAlertPhotoLayout.F0 = true;
                if (z10) {
                    glVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
                    if (jVar.o != 0) {
                        glVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        jVar.j1(0);
                        ulVar.l();
                    }
                } else {
                    glVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                    if (jVar.o != 1) {
                        glVar.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        jVar.j1(1);
                        ulVar.l();
                    }
                }
                chatAttachAlertPhotoLayout.F0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.U && !chatAttachAlertPhotoLayout.W) {
            qlVar.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onCustomOpenAnimation() {
        this.f0.setTranslationX(0.0f);
        this.j1.setAlpha(0.0f);
        this.h1.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.m2 = animatorSet;
        int i10 = 2;
        uh uhVar = this.k2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, uhVar, 0.0f, 400.0f));
        this.m2.setDuration(400L);
        this.m2.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        uhVar.getClass();
        uhVar.a(this, valueOf);
        this.m2.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new qg(this, i10));
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
        org.telegram.ui.ActionBar.i3 i3Var = new org.telegram.ui.ActionBar.i3(this, animationNotificationsLocker, this.delegate, 10);
        this.l2.a(new nh.a4(i10, this, i3Var));
        this.currentSheetAnimation.addListener(new ag.x1(22, this, i3Var));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        K1(0.0f);
        ofFloat2.addUpdateListener(new qg(this, 3));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(er.f);
        ofFloat2.start();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onDismissWithTouchOutside() {
        if (this.u0.q()) {
            dismiss();
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.u0.D(i10)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onOpenAnimationEnd() {
        if (this.b0 instanceof org.telegram.ui.rn) {
            int i10 = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i11 = MediaController.VIDEO_BITRATE_1080;
        }
        this.u0.v();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.o1 = true;
        if (this.I1 || this.H1) {
            return;
        }
        a1();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
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
        yh yhVar = this.v0;
        int[] iArr = this.X1;
        return (yhVar == null || !((this.u0 instanceof em) || (yhVar instanceof em))) ? iArr[i10] : AndroidUtilities.lerp(iArr[0], iArr[1], this.Z);
    }

    public final int q1(boolean z10) {
        ag.d2 d2Var;
        if (this.d2) {
            return getThemedColor(org.telegram.ui.ActionBar.g6.tg);
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        boolean a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        Iterator it = this.n.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            ud.e eVar = (ud.e) it.next();
            long longValue = ((Long) eVar.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f10 += eVar.c();
            }
        }
        float a3 = h7.n.a(f10, 0.0f, 1.0f);
        if (z10 && (d2Var = this.T0) != null && d2Var.getVisibility() == 0) {
            a3 *= 1.0f - d2Var.getAlpha();
        }
        return i0.b.d(a3, getThemedColor(org.telegram.ui.ActionBar.g6.h5), getThemedColor(a2 ? org.telegram.ui.ActionBar.g6.a7 : org.telegram.ui.ActionBar.g6.i5));
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
        gi giVar;
        ql qlVar;
        MediaController.AlbumEntry albumEntry;
        yh yhVar;
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
        ih ihVar = this.t1;
        ihVar.setAlpha(1.0f);
        ihVar.setTranslationY(0.0f);
        int i11 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.t0;
            if (i11 >= longSparseArray.size()) {
                break;
            }
            ((nh.e4) longSparseArray.valueAt(i11)).setMeasureOffsetY(0);
            i11++;
        }
        int i12 = this.M0;
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (i12 != 2) {
            if (n2Var instanceof org.telegram.ui.rn) {
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
                chat = rnVar.e;
                user = rnVar.i();
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
            z10 = n2Var instanceof org.telegram.ui.rn;
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
                    this.L1 = !z10 || ((org.telegram.ui.rn) n2Var).h == null;
                }
            }
            if (this.N1) {
                this.K1 = false;
                this.L1 = false;
            }
            mh mhVar = this.A0;
            if (z10 || this.M0 == 2) {
                mhVar.setVisibility(this.S ? 0 : 4);
            }
            boolean z11 = this.I1;
            boolean z12 = this.H1;
            boolean z13 = this.G1;
            chatAttachAlertPhotoLayout = this.f0;
            giVar = chatAttachAlertPhotoLayout.b;
            az azVar = chatAttachAlertPhotoLayout.D;
            boolean z14 = !z11 || z12;
            chatAttachAlertPhotoLayout.r0 = z14;
            chatAttachAlertPhotoLayout.s0 = z11;
            chatAttachAlertPhotoLayout.t0 = z12;
            chatAttachAlertPhotoLayout.v0 = z13;
            qlVar = chatAttachAlertPhotoLayout.L;
            if (qlVar != null) {
                qlVar.setAlpha(z14 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.L.setEnabled(chatAttachAlertPhotoLayout.r0);
            }
            if (!((giVar.b0 instanceof org.telegram.ui.rn) && giVar.k1() == null) && giVar.M0 == 0) {
                chatAttachAlertPhotoLayout.Q0 = MediaController.allMediaAlbumEntry;
                if (chatAttachAlertPhotoLayout.r0) {
                    azVar.setText(LocaleController.getString(R.string.NoPhotos));
                    azVar.a(0, 0, 0);
                } else {
                    TLRPC.Chat k12 = giVar.k1();
                    azVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    if (ChatObject.isActionBannedByDefault(k12, 7)) {
                        azVar.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else if (AndroidUtilities.isBannedForever(k12.banned_rights)) {
                        azVar.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                    } else {
                        azVar.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(k12.banned_rights.until_date)));
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
                if (azVar != null) {
                    azVar.c();
                }
            }
            chatAttachAlertPhotoLayout.u0();
            mhVar.k(true);
            this.L0.k(true);
            this.q1 = false;
            setFocusable(false);
            if (!this.K || this.L) {
                if (this.k0 == null) {
                    tk tkVar = new tk(this, getContext(), this.resourcesProvider, (this.D || this.L || this.N1) ? false : true);
                    this.k0 = tkVar;
                    this.s0[5] = tkVar;
                    ok okVar = this.p2;
                    if (okVar != null) {
                        tkVar.setDelegate(okVar);
                    } else {
                        tkVar.setDelegate(new pg(this, i10));
                    }
                }
                this.S0 = 5L;
                yhVar = this.k0;
            } else if (this.J) {
                E1(false);
                yhVar = this.l0;
                this.S0 = 4L;
            } else {
                MessageObject messageObject = this.D1;
                if (messageObject != null) {
                    int i15 = this.C1;
                    if (i15 == -1) {
                        this.O0 = true;
                        if (messageObject.isMusic()) {
                            B1(false);
                            yhVar = this.h0;
                            this.S0 = 3L;
                        } else if (this.D1.isDocument()) {
                            E1(false);
                            yhVar = this.l0;
                            this.S0 = 4L;
                        } else {
                            this.S0 = 1L;
                        }
                    } else {
                        if (i15 == 2) {
                            B1(false);
                            yhVar = this.h0;
                            this.S0 = 3L;
                        } else if (i15 == 1) {
                            E1(false);
                            yhVar = this.l0;
                            this.S0 = 4L;
                        } else {
                            this.S0 = 1L;
                            yhVar = chatAttachAlertPhotoLayout;
                        }
                        this.O0 = false;
                    }
                } else {
                    this.O0 = this.M0 == 0 && !this.P0;
                    this.S0 = 1L;
                }
                yhVar = chatAttachAlertPhotoLayout;
            }
            ihVar.setVisibility(this.O0 ? 0 : 8);
            if (this.u0 != yhVar) {
                ag.d2 d2Var = this.T0;
                if (d2Var.j0) {
                    d2Var.h(true);
                }
                this.containerView.removeView(this.u0);
                this.u0.s();
                this.u0.setVisibility(8);
                this.u0.r();
                this.u0 = yhVar;
                this.allowNestedScroll = true;
                if (yhVar.getParent() == null) {
                    this.containerView.addView(this.u0, 0, h7.z5.c(-1.0f, -1));
                }
                yhVar.setAlpha(1.0f);
                yhVar.setVisibility(0);
                yhVar.E(null);
                yhVar.F();
                d2Var.setVisibility(yhVar.h() != 0 ? 0 : 4);
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
        z10 = n2Var instanceof org.telegram.ui.rn;
        if (z10) {
            if (chat != null) {
            }
            if (this.N1) {
            }
            mh mhVar2 = this.A0;
            if (z10) {
            }
            mhVar2.setVisibility(this.S ? 0 : 4);
            boolean z112 = this.I1;
            boolean z122 = this.H1;
            boolean z132 = this.G1;
            chatAttachAlertPhotoLayout = this.f0;
            giVar = chatAttachAlertPhotoLayout.b;
            az azVar2 = chatAttachAlertPhotoLayout.D;
            if (z112) {
            }
            chatAttachAlertPhotoLayout.r0 = z14;
            chatAttachAlertPhotoLayout.s0 = z112;
            chatAttachAlertPhotoLayout.t0 = z122;
            chatAttachAlertPhotoLayout.v0 = z132;
            qlVar = chatAttachAlertPhotoLayout.L;
            if (qlVar != null) {
            }
            if (giVar.b0 instanceof org.telegram.ui.rn) {
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
            mhVar2.k(true);
            this.L0.k(true);
            this.q1 = false;
            setFocusable(false);
            if (this.K) {
            }
            if (this.k0 == null) {
            }
            this.S0 = 5L;
            yhVar = this.k0;
            ihVar.setVisibility(this.O0 ? 0 : 8);
            if (this.u0 != yhVar) {
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
        mh mhVar22 = this.A0;
        if (z10) {
        }
        mhVar22.setVisibility(this.S ? 0 : 4);
        boolean z1122 = this.I1;
        boolean z1222 = this.H1;
        boolean z1322 = this.G1;
        chatAttachAlertPhotoLayout = this.f0;
        giVar = chatAttachAlertPhotoLayout.b;
        az azVar22 = chatAttachAlertPhotoLayout.D;
        if (z1122) {
        }
        chatAttachAlertPhotoLayout.r0 = z14;
        chatAttachAlertPhotoLayout.s0 = z1122;
        chatAttachAlertPhotoLayout.t0 = z1222;
        chatAttachAlertPhotoLayout.v0 = z1322;
        qlVar = chatAttachAlertPhotoLayout.L;
        if (qlVar != null) {
        }
        if (giVar.b0 instanceof org.telegram.ui.rn) {
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
        mhVar22.k(true);
        this.L0.k(true);
        this.q1 = false;
        setFocusable(false);
        if (this.K) {
        }
        if (this.k0 == null) {
        }
        this.S0 = 5L;
        yhVar = this.k0;
        ihVar.setVisibility(this.O0 ? 0 : 8);
        if (this.u0 != yhVar) {
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
        yh yhVar = this.u0;
        return yhVar == this.f0 || yhVar == this.m0;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean shouldOverlayCameraViewOverNavBar() {
        yh yhVar = this.u0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f0;
        return yhVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.e1;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        this.E1 = false;
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            this.calcMandatoryInsets = ((org.telegram.ui.rn) n2Var).x9();
        }
        W1();
        this.o1 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int k10 = i0.b.k(getThemedColor(org.telegram.ui.ActionBar.g6.a7), 0);
            this.navBarColor = k10;
            AndroidUtilities.setNavigationBarColor((Dialog) this, k10, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.i2) {
            this.i2 = false;
            ag.d2 d2Var = this.T0;
            d2Var.d();
            d2Var.invalidate();
            u1();
        }
    }

    public final void t1(EditTextBoldCursor editTextBoldCursor, boolean z10) {
        ei eiVar = this.V1;
        if (eiVar == null || this.q1) {
            return;
        }
        boolean s10 = eiVar.s();
        this.q1 = true;
        AndroidUtilities.runOnUIThread(new hh.t5(this, editTextBoldCursor, z10, 15), s10 ? 200L : 0L);
    }

    public final void u1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int q12 = q1(false);
        org.telegram.ui.ActionBar.g6.w1(q12, this.shadowDrawable);
        og.c cVar = this.B2;
        if (cVar.a.getColor() != q12) {
            cVar.a(q12);
            sg.f fVar = this.r1;
            if (fVar != null) {
                fVar.invalidate();
            }
            kh khVar = this.s1;
            if (khVar != null) {
                khVar.invalidate();
            }
        }
        W1();
        this.containerView.invalidate();
    }

    public final void v1() {
        int i10 = 0;
        while (true) {
            yh[] yhVarArr = this.s0;
            if (i10 >= yhVarArr.length) {
                break;
            }
            yh yhVar = yhVarArr[i10];
            if (yhVar != null) {
                yhVar.m();
            }
            i10++;
        }
        int i11 = this.F1;
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.R = true;
        mh mhVar = this.A0;
        if (mhVar != null) {
            mhVar.o();
        }
        ph phVar = this.L0;
        if (phVar != null) {
            phVar.o();
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
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.N = string;
        if (tL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        b2Var.P = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ag.l0(this, tL_attachMenuBot, user, 22));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        alertDialog$Builder.o();
    }

    public final void x1() {
        int i10 = 0;
        while (true) {
            yh[] yhVarArr = this.s0;
            if (i10 >= yhVarArr.length) {
                this.b2 = true;
                return;
            }
            yh yhVar = yhVarArr[i10];
            if (yhVar != null) {
                yhVar.y();
            }
            i10++;
        }
    }

    public final void y1() {
        int i10 = 0;
        this.b2 = false;
        while (true) {
            yh[] yhVarArr = this.s0;
            if (i10 >= yhVarArr.length) {
                break;
            }
            yh yhVar = yhVarArr[i10];
            if (yhVar != null) {
                yhVar.B();
            }
            i10++;
        }
        if (isShowing()) {
            this.V1.s();
        }
        di diVar = this.w1;
        if (diVar != null) {
            diVar.l();
        }
    }

    public final void z1() {
        MessageObject messageObject = this.D1;
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        int i10 = this.F1;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i10, this.D1.getDialogId()) && (n2Var instanceof org.telegram.ui.rn)) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
            MessageSuggestionParams messageSuggestionParams = rnVar.c5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.D1.messageOwner.suggested_post);
            }
            if (!hh.u7.U(i10, messageSuggestionParams.amount)) {
                rnVar.Tb(messageSuggestionParams);
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
            O1(n2Var);
            return;
        }
        if (this.D1 == null && (n2Var instanceof org.telegram.ui.rn)) {
            org.telegram.ui.rn rnVar2 = (org.telegram.ui.rn) n2Var;
            if (rnVar2.c()) {
                y4.M(getContext(), rnVar2.a(), new pg(this, 12), this.resourcesProvider);
                return;
            }
        }
        yh yhVar = this.u0;
        if (yhVar == this.f0 || yhVar == this.m0) {
            G1(0, true, 0, s1(), this.J0);
            return;
        }
        if (yhVar.I(0, true, 0, s1(), this.J0)) {
            return;
        }
        this.w2 = true;
        dismiss();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        if (this.u0.n() || isDismissed()) {
            return;
        }
        mh mhVar = this.A0;
        if (mhVar != null) {
            AndroidUtilities.hideKeyboard(mhVar.getEditText());
        }
        ph phVar = this.L0;
        if (phVar != null) {
            AndroidUtilities.hideKeyboard(phVar.getEditText());
        }
        this.t0.clear();
        org.telegram.ui.ActionBar.n2 n2Var = this.b0;
        if (n2Var == null) {
            n2Var = LaunchActivity.R();
        }
        if (!this.w2 && n2Var != null && this.u0.getSelectedItemsCount() > 0 && !this.B) {
            if (this.v2) {
                return;
            }
            this.v2 = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, this.resourcesProvider);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new pg(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new vg(this, 0));
            a1 a1Var = new a1(this, 4);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.J = a1Var;
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            yh[] yhVarArr = this.s0;
            if (i10 >= yhVarArr.length) {
                break;
            }
            yh yhVar = yhVarArr[i10];
            if (yhVar != null && this.u0 != yhVar) {
                yhVar.n();
            }
            i10++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, i0.b.k(getThemedColor(org.telegram.ui.ActionBar.g6.a7), 0), true, (AndroidUtilities.IntColorCallback) new pg(this, 11));
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
        this.e2 = false;
        super.dismiss();
        this.w2 = false;
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }

    public gi(Activity activity, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        this(activity, n2Var, z10, z11, true, null);
    }
}

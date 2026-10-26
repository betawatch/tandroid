package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Property;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class cy extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, og.b, oe.d, og0 {
    public static float B4;
    public static boolean y4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public jw B1;
    public boolean B2;
    public boolean B3;
    public jx C0;
    public li.w1 C1;
    public ux C2;
    public Long C3;
    public org.telegram.ui.Components.sv0 D0;
    public org.telegram.ui.ActionBar.w0 D1;
    public ArrayList D2;
    public Drawable D3;
    public boolean E;
    public qw E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Components.r5 E3;
    public boolean F;
    public org.telegram.ui.Components.us F0;
    public hw F1;
    public CharSequence F2;
    public org.telegram.ui.Cells.o F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.qr0 G2;
    public tw G3;
    public long H;
    public float H0;
    public hw H1;
    public org.telegram.ui.Components.c71 H2;
    public final iw H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public final iw I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.ws J1;
    public boolean J2;
    public mg0 J3;
    public boolean K;
    public bi.cc K0;
    public org.telegram.ui.Components.vs K1;
    public int K2;
    public NotificationCenter.ObserversGroup K3;
    public boolean L;
    public org.telegram.ui.Components.k80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public vw M0;
    public org.telegram.ui.Cells.x2 M1;
    public boolean M2;
    public int M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.xa N1;
    public int N2;
    public boolean N3;
    public boolean O;
    public boolean O0;
    public Long O1;
    public int O2;
    public boolean O3;
    public int P;
    public long P0;
    public Long P1;
    public int P2;
    public AnimatorSet P3;
    public boolean Q;
    public long Q0;
    public ji.j Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public nu R3;
    public org.telegram.ui.Components.qc S;
    public int S0;
    public boolean S1;
    public int S2;
    public String S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.e2 T1;
    public int T2;
    public ArrayList T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public org.telegram.ui.Components.td0 V0;
    public boolean V1;
    public boolean V2;
    public CharSequence V3;
    public boolean W;
    public org.telegram.ui.Cells.p2 W0;
    public long W1;
    public int W2;
    public boolean W3;
    public ox X;
    public org.telegram.ui.Cells.p2 X0;
    public TLObject X1;
    public cy X2;
    public float X3;
    public ag.u0 Y;
    public boolean Y0;
    public int Y1;
    public long Y2;
    public boolean Y3;
    public n31 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.Chat Z2;
    public boolean Z3;
    public final int a;
    public org.telegram.ui.Components.t91 a0;
    public final ArrayList a1;
    public boolean a2;
    public TLRPC.ChatFull a3;
    public ValueAnimator a4;
    public final oe.b b;
    public ig.r0 b0;
    public boolean b1;
    public boolean b2;
    public org.telegram.ui.Components.y9 b3;
    public org.telegram.ui.Components.g50 b4;
    public final oe.b c;
    public float c0;
    public boolean c1;
    public boolean c2;
    public org.telegram.ui.Components.j9 c3;
    public TLRPC.FileLocation c4;
    public final oe.b d;
    public ValueAnimator d0;
    public boolean d1;
    public int d2;
    public long d3;
    public TLRPC.FileLocation d4;
    public final oe.b e;
    public ay[] e0;
    public org.telegram.ui.ActionBar.j2 e1;
    public boolean e2;
    public boolean e3;
    public org.telegram.ui.Components.qc e4;
    public final oe.b f;
    public org.telegram.ui.ActionBar.w0 f0;
    public final Paint f1;
    public String f2;
    public boolean f3;
    public int f4;
    public org.telegram.ui.ActionBar.w0 g0;
    public ImageView g1;
    public String g2;
    public AnimatorSet g3;
    public int g4;
    public final oe.b h;
    public ey h0;
    public NumberTextView h1;
    public String h2;
    public boolean h3;
    public int h4;
    public boolean i0;
    public final ArrayList i1;
    public boolean i2;
    public boolean i3;
    public int i4;
    public org.telegram.ui.ActionBar.w0 j0;
    public org.telegram.ui.ActionBar.w0 j1;
    public boolean j2;
    public float j3;
    public int j4;
    public org.telegram.ui.ActionBar.w0 k0;
    public org.telegram.ui.ActionBar.w0 k1;
    public boolean k2;
    public boolean k3;
    public final ch.f k4;
    public org.telegram.ui.ActionBar.w0 l0;
    public org.telegram.ui.ActionBar.w0 l1;
    public boolean l2;
    public int l3;
    public final hh.d l4;
    public org.telegram.ui.ActionBar.w0 m0;
    public org.telegram.ui.ActionBar.w0 m1;
    public boolean m2;
    public boolean m3;
    public final hh.d m4;
    public final oe.b n;
    public org.telegram.ui.Components.ej0 n0;
    public org.telegram.ui.ActionBar.g1 n1;
    public String n2;
    public boolean n3;
    public final hh.c n4;
    public org.telegram.ui.ActionBar.g1 o0;
    public org.telegram.ui.ActionBar.g1 o1;
    public String o2;
    public org.telegram.ui.Components.qc o3;
    public final ch.b o4;
    public fi.v3 p0;
    public org.telegram.ui.ActionBar.g1 p1;
    public final MessagesStorage.TopicKey p2;
    public final AnimationNotificationsLocker p3;
    public final ch.b p4;
    public fi.v3 q0;
    public org.telegram.ui.ActionBar.g1 q1;
    public boolean q2;
    public boolean q3;
    public final ch.b q4;
    public final oe.b r;
    public boolean r0;
    public org.telegram.ui.ActionBar.g1 r1;
    public boolean r2;
    public boolean r3;
    public final ch.b r4;
    public final oe.b s;
    public boolean s0;
    public org.telegram.ui.ActionBar.g1 s1;
    public boolean s2;
    public boolean s3;
    public tv s4;
    public org.telegram.ui.Components.j20 t0;
    public org.telegram.ui.ActionBar.g1 t1;
    public boolean t2;
    public boolean t3;
    public final ArrayList t4;
    public org.telegram.ui.Components.j20 u0;
    public float u1;
    public boolean u2;
    public float u3;
    public final RectF u4;
    public final rh.i v;
    public fi.d v0;
    public float v1;
    public boolean v2;
    public ValueAnimator v3;
    public final RectF v4;
    public boolean w;
    public lh.f w0;
    public AnimatorSet w1;
    public boolean w2;
    public float w3;
    public int w4;
    public int x;
    public int x0;
    public float x1;
    public boolean x2;
    public float x3;
    public int x4;
    public boolean y;
    public final UndoView[] y0;
    public jh.f y1;
    public boolean y2;
    public float y3;
    public qx z0;
    public FrameLayout z1;
    public boolean z2;
    public int z3;
    public static final boolean[] z4 = new boolean[4];
    public static final org.telegram.ui.Components.qs0 A4 = new org.telegram.ui.Components.qs0(3);

    public cy(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.b = new oe.b(1, this, dsVar, 350L, false);
        this.c = new oe.b(2, this, dsVar, 350L, false);
        this.d = new oe.b(3, this, dsVar, 350L, false);
        this.e = new oe.b(4, this, dsVar, 350L, false);
        this.f = new oe.b(5, this, dsVar, 350L, false);
        this.h = new oe.b(6, this, dsVar, 350L, false);
        this.n = new oe.b(7, this, dsVar, 350L, false);
        this.r = new oe.b(8, this, dsVar, 350L, false);
        this.s = new oe.b(9, this, dsVar, 350L, false);
        this.v = new rh.i(new sv(this, 2));
        this.x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.c0 = 1.0f;
        this.y0 = new UndoView[2];
        this.a1 = new ArrayList();
        this.f1 = new Paint();
        this.i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.c2 = true;
        this.i2 = true;
        this.p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.p3 = new AnimationNotificationsLocker();
        this.z3 = -1;
        this.H3 = new iw(this, 0);
        this.I3 = new iw(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.t4 = arrayList;
        RectF rectF = new RectF();
        this.u4 = rectF;
        RectF rectF2 = new RectF();
        this.v4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        hh.c d = this.glassEngine.d(new iv(this, 11));
        this.n4 = d;
        if (i10 >= 31) {
            ch.f fVar = new ch.f();
            this.k4 = fVar;
            hh.d dVar = new hh.d(d);
            this.m4 = dVar;
            dVar.f = d;
            dVar.d = fVar;
            dVar.e = -2;
            hh.d dVar2 = new hh.d(null);
            this.l4 = dVar2;
            dVar2.f = d;
            dVar2.d = fVar;
            dVar2.e = -3;
            ch.b bVar = new ch.b(dVar);
            this.q4 = bVar;
            bVar.i = LiteMode.isEnabled(262144);
            int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
            bVar.b = dp;
            bVar.c = dp;
            ch.b bVar2 = new ch.b(dVar2);
            this.o4 = bVar2;
            bVar2.i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(48.0f);
            bVar2.b = dp2;
            bVar2.c = dp2;
            this.p4 = new ch.b(dVar2);
        } else {
            this.k4 = null;
            this.l4 = null;
            this.m4 = null;
            this.o4 = new ch.b(d);
            this.q4 = new ch.b(d);
            this.p4 = new ch.b(d);
        }
        ch.b bVar3 = new ch.b(d);
        this.r4 = bVar3;
        ch.b bVar4 = this.q4;
        oi.q qVar = this.glassEngine;
        bVar4.h = qVar;
        this.o4.h = qVar;
        this.p4.h = qVar;
        bVar3.h = qVar;
    }

    public static void A0(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            ki1.a(cyVar.getParentActivity(), new y(cyVar, tL_attachMenuBot, launchActivity, 8), null);
        } else {
            LaunchActivity.H0(launchActivity, cyVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static void B0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        cyVar.c5();
        org.telegram.ui.Components.qc J = org.telegram.ui.Components.wc.b0(cyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new cv(cyVar, 1));
        J.j = 5000;
        J.j();
    }

    public static void C0(cy cyVar) {
        try {
            ((org.telegram.ui.Components.xj0) ((org.telegram.ui.Components.j9) cyVar.M1.h.getImageReceiver().getStaticThumb()).K).H(true);
        } catch (Exception unused) {
        }
        if (cyVar.b4 == null) {
            org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
            cyVar.b4 = g50Var;
            g50Var.H = true;
            g50Var.a = cyVar;
            g50Var.b = new nx(cyVar);
            cyVar.getMediaDataController().checkFeaturedStickers();
            cyVar.getMessagesController().loadSuggestedFilters();
            cyVar.getMessagesController().loadUserInfo(cyVar.getUserConfig().getCurrentUser(), true, cyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(cyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(cyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(cyVar.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.ti tiVar = cyVar.b4.c;
        if (tiVar != null) {
            tiVar.h1();
        }
        org.telegram.ui.Components.g50 g50Var2 = cyVar.b4;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        g50Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new cv(cyVar, 0), new dv(cyVar, 0), 0);
    }

    public static /* synthetic */ void D0(cy cyVar, float f7, ValueAnimator valueAnimator) {
        cyVar.e0[0].setTranslationY((1.0f - cyVar.u3) * f7);
        cyVar.u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < cyVar.actionBar.getChildCount(); i10++) {
            if (cyVar.actionBar.getChildAt(i10).getVisibility() == 0 && cyVar.actionBar.getChildAt(i10) != cyVar.actionBar.getActionMode() && cyVar.actionBar.getChildAt(i10) != cyVar.actionBar.getBackButton()) {
                cyVar.actionBar.getChildAt(i10).setAlpha(1.0f - cyVar.u3);
            }
        }
        cyVar.M3();
        cyVar.E3();
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void E0(cy cyVar) {
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(cyVar.getParentActivity(), cyVar.resourceProvider);
        ybVar.d(R.raw.email_check_inbox, new String[0]);
        ybVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.qc.g(cyVar, ybVar, 2750).j();
        try {
            cyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void F0(cy cyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() != 1) {
            vg.n1.e0(0, birthdayState);
            return;
        }
        zh.p1 p1Var = new zh.p1(cyVar.getParentActivity(), cyVar.currentAccount, birthdayState.today.get(0).id, null, null);
        p1Var.V(true);
        cyVar.showDialog(p1Var);
    }

    public static void G0(cy cyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(cyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.j = 5000;
            M.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            cyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.t.q(R.string.UnknownError, org.telegram.ui.Components.wc.b0(cyVar), R.raw.error, 36);
            return;
        }
        if (cyVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar.getParentActivity(), 0, cyVar.resourceProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            cyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static /* synthetic */ void H0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        cyVar.c5();
    }

    public static void U2(cy cyVar, float f7) {
        float f10;
        float f11;
        float clamp = Utilities.clamp(cyVar.x1 * 2.0f, 1.0f, 0.0f);
        qw qwVar = cyVar.E0;
        float f12 = (1.0f - cyVar.u3) * f7 * cyVar.H0;
        float f13 = 1.0f - clamp;
        qwVar.setAlpha(f12 * f13);
        if (cyVar.K || cyVar.M) {
            float clamp2 = Utilities.clamp((-cyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (cyVar.u3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            cyVar.E0.setClipTop(0);
            if (cyVar.K || !cyVar.M) {
                cyVar.E0.setTranslationY(((cyVar.T / 2.0f) + (Math.max(cyVar.N, -cyVar.c4()) + cyVar.w3)) - AndroidUtilities.dp(8.0f));
                cyVar.E0.l(clamp2, !cyVar.G3.c());
                if (cyVar.M) {
                    f10 = 1.0f - clamp3;
                    cyVar.actionBar.setTranslationY(0.0f);
                } else {
                    f11 = cyVar.H0;
                }
            } else {
                cyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                cyVar.E0.setProgressToCollapse(1.0f);
                f11 = cyVar.H0;
            }
            f10 = 1.0f - f11;
            cyVar.actionBar.setTranslationY(0.0f);
        } else {
            if (cyVar.L) {
                cyVar.E0.setTranslationY((Math.max(cyVar.N, -cyVar.c4()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                cyVar.E0.setProgressToCollapse(1.0f);
                qw qwVar2 = cyVar.E0;
                qwVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - qwVar2.getY()));
            }
            f10 = 1.0f - cyVar.H0;
            cyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 == 1.0f) {
            cyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            cyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f15 = 1.0f - cyVar.u3;
            cyVar.actionBar.getTitlesContainer().setAlpha(f15);
            cyVar.actionBar.getTitlesContainer().setVisibility(f15 > 0.0f ? 0 : 4);
            cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f15);
            cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f15 <= 0.0f ? 4 : 0);
            return;
        }
        cyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
        cyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
        float f16 = (0.6f * f14) + 0.4f;
        cyVar.actionBar.getTitlesContainer().setScaleY(f16);
        cyVar.actionBar.getTitlesContainer().setScaleX(f16);
        cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
        cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
        cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
        float f17 = (1.0f - cyVar.u3) * f14;
        cyVar.actionBar.getTitlesContainer().setAlpha(f17);
        cyVar.actionBar.getTitlesContainer().setVisibility(f17 > 0.0f ? 0 : 4);
        cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        cyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f17 <= 0.0f ? 4 : 0);
    }

    public static /* synthetic */ void V(cy cyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        cyVar.c5();
    }

    public static void V2(cy cyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        if (cyVar.parentLayout == null || cyVar.actionBar == null) {
            return;
        }
        float max = Math.max(cyVar.e.e, cyVar.d4());
        float f7 = 1.0f;
        float f10 = 1.0f - cyVar.x1;
        float f11 = max * f10 * f10;
        if (f11 == 0.0f) {
            return;
        }
        if (-1 >= i10) {
            f7 = 0.0f;
            i10 = -1;
        }
        if (f7 <= 0.0f || f11 <= 0.0f || i10 <= 0 || (j5Var = cyVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) j5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
    }

    public static /* synthetic */ void W(cy cyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cyVar.u3 = floatValue;
        cyVar.e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < cyVar.actionBar.getChildCount(); i10++) {
            if (cyVar.actionBar.getChildAt(i10).getVisibility() == 0 && cyVar.actionBar.getChildAt(i10) != cyVar.actionBar.getActionMode() && cyVar.actionBar.getChildAt(i10) != cyVar.actionBar.getBackButton()) {
                cyVar.actionBar.getChildAt(i10).setAlpha(1.0f - cyVar.u3);
            }
        }
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        cyVar.M3();
        cyVar.E3();
    }

    public static /* synthetic */ void X(cy cyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(cyVar.currentAccount).getClientUserId());
        cyVar.presentFragment(new un(bundle));
    }

    public static void Y(cy cyVar) {
        ArrayList arrayList = cyVar.I2;
        org.telegram.ui.ActionBar.j5 j5Var = cyVar.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).x()) {
            cyVar.finishPreviewFragment();
            return;
        }
        if (cyVar.R0 != 10) {
            if (MessagesController.getInstance(cyVar.currentAccount).isFrozen()) {
                b.b(cyVar.currentAccount);
                return;
            } else {
                cyVar.presentFragment(new ContactsActivity(a1.g.i("destroyAfterSelect", true)));
                return;
            }
        }
        if (cyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
        }
        cyVar.C2.v(cyVar, arrayList2, null, false, cyVar.J2, cyVar.K2, cyVar.L2, null);
    }

    public static org.telegram.ui.Cells.p2 Y3(ay ayVar) {
        wx wxVar = ayVar.a;
        for (int i10 = 0; i10 < wxVar.getChildCount(); i10++) {
            View childAt = wxVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                if (p2Var.O()) {
                    return p2Var;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void Z(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        cyVar.c5();
    }

    public static void a0(cy cyVar) {
        PasskeysActivity.b0(cyVar.currentAccount, cyVar.getParentActivity(), cyVar.resourceProvider, true);
    }

    public static /* synthetic */ void b0(cy cyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = cyVar.getMessagesController().getUserFull(cyVar.getUserConfig().getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        cyVar.getMessagesController().invalidateContentSettings();
        cyVar.getConnectionsManager().sendRequest(updatebirthday, new ea(cyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        cyVar.c5();
    }

    public static /* synthetic */ void c0(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(cyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(cyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ea(cyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static /* synthetic */ void d0(cy cyVar, String str) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, str);
        cyVar.c5();
    }

    public static void e0(cy cyVar, ay ayVar, View view, int i10) {
        int i11;
        if (view instanceof org.telegram.ui.Cells.z3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.p2;
        if (z10) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            if (p2Var.n2) {
                cyVar.V4(p2Var.getDialogId(), view);
                return;
            }
        }
        if (cyVar.Q3()) {
            cyVar.w4(view, i10, 0.0f, ayVar.d);
            return;
        }
        int i12 = cyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.v8)) {
            ayVar.d.L();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a1.g.i("forImport", true);
            i14.putLongArray("result", new long[]{cyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = cyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            x60 x60Var = new x60(i14);
            x60Var.Y = new dw(cyVar);
            cyVar.presentFragment(x60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.x2) && ((i11 = ayVar.s) == 7 || i11 == 8)) {
            ig.l lVar = (ig.l) ayVar.d.M.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (lVar == null || lVar.a != 17) ? null : lVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = cyVar.getMessagesController().selectedDialogFilter[ayVar.s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.id;
                    org.telegram.ui.Components.n10 n10Var = new org.telegram.ui.Components.n10(cyVar, false);
                    n10Var.Y = -1;
                    n10Var.c0 = "";
                    n10Var.d0 = new ArrayList();
                    n10Var.f0 = "";
                    n10Var.h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    n10Var.i0 = arrayList;
                    n10Var.z0 = -1;
                    n10Var.C0 = -5;
                    n10Var.Y = i15;
                    n10Var.a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    n10Var.g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = cyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            }
                            if (arrayList2.get(i13).id == i15) {
                                n10Var.c0 = arrayList2.get(i13).name;
                                break;
                            }
                            i13++;
                        }
                    }
                    n10Var.T();
                    cyVar.showDialog(n10Var);
                    return;
                }
                return;
            }
        } else if (z10 && !cyVar.actionBar.q() && !cyVar.G3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.p2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        cyVar.v4(view, i10, ayVar.d);
    }

    public static /* synthetic */ void f0(cy cyVar) {
        cyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(cyVar.parentLayout, "newChatsRow");
    }

    public static void g1(cy cyVar, boolean z10) {
        if (cyVar.e0 == null || cyVar.N3 == z10) {
            return;
        }
        cyVar.N3 = z10;
        int i10 = 0;
        while (true) {
            ay[] ayVarArr = cyVar.e0;
            if (i10 >= ayVarArr.length) {
                return;
            }
            if (z10) {
                ayVarArr[i10].a.setScrollbarFadingEnabled(false);
            }
            cyVar.e0[i10].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                cyVar.e0[i10].a.setScrollbarFadingEnabled(true);
            }
            i10++;
        }
    }

    public static /* synthetic */ void h0(cy cyVar) {
        if (cyVar.b4.g()) {
            MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            cyVar.c5();
        }
    }

    public static /* synthetic */ void j0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        cyVar.c5();
    }

    public static /* synthetic */ void k0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        cyVar.c5();
    }

    public static void l0(cy cyVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            e2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.g5.e0(cyVar.currentAccount, tL_error, cyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            cyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        cyVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        bi.r3 r3Var = new bi.r3(cyVar, j10, 27);
        Pattern pattern = org.telegram.ui.Components.g5.a;
        if (cyVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = cyVar.getCurrentAccount();
            Activity parentActivity = cyVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            TextView textView = new TextView(parentActivity);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            j9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity);
            y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.h(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(LocaleController.getString(R.string.ImportMessages));
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(textView2, org.telegram.ui.Components.gb1.h(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                j9Var.k(currentAccount, chat);
                y9Var.f(chat, j9Var);
            } else if (UserObject.isReplyUser(user)) {
                j9Var.p = 0.8f;
                j9Var.g(12);
                y9Var.h(null, null, j9Var, user);
            } else if (user.id == clientUserId) {
                j9Var.p = 0.8f;
                j9Var.g(1);
                y9Var.h(null, null, j9Var, user);
            } else {
                j9Var.p = 1.0f;
                j9Var.m(currentAccount, user);
                y9Var.f(user, j9Var);
            }
            textView.setText(AndroidUtilities.replaceTags(str));
            alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(r3Var, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            cyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void l4(un unVar, MessageObject messageObject) {
        if (messageObject == null || !messageObject.hasHighlightedWords()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(messageObject.caption) ? messageObject.caption : messageObject.messageText;
            CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.u6) null);
            if (highlightText instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                org.telegram.ui.Components.p10[] p10VarArr = (org.telegram.ui.Components.p10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.p10.class);
                if (p10VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(p10VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(p10VarArr[0]);
                    for (int i10 = 1; i10 < p10VarArr.length; i10++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(p10VarArr[i10]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(p10VarArr[i10]);
                        if (spanStart2 != spanEnd) {
                            if (spanStart2 > spanEnd) {
                                for (int i11 = spanEnd; i11 <= spanStart2; i11++) {
                                    if (!Character.isWhitespace(spannableStringBuilder.charAt(i11))) {
                                        break;
                                    }
                                }
                            }
                        }
                        spanEnd = spanStart3;
                    }
                    unVar.xb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m0(cy cyVar, int i10) {
        Object obj;
        org.telegram.ui.Components.ro0 ro0Var = cyVar.C0.q0;
        if (i10 < ro0Var.Z || i10 >= ro0Var.a0) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.t61 G = ro0Var.G(i10);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar.getParentActivity(), 0, cyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.voip.k1(7, cyVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void n0(cy cyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i10 != 102) {
            cyVar.z4(arrayList, i10, false, false, null);
            return;
        }
        cyVar.getMessagesController().setDialogsInTransaction(true);
        cyVar.z4(arrayList, i10, false, false, z10 ? hashSet : null);
        cyVar.getMessagesController().setDialogsInTransaction(false);
        cyVar.getMessagesController().checkIfFolderEmpty(cyVar.W2);
        int i11 = cyVar.W2;
        if (i11 == 0 || cyVar.Z3(cyVar.currentAccount, cyVar.e0[0].s, i11, false).size() != 0) {
            return;
        }
        cyVar.e0[0].a.setEmptyView(null);
        cyVar.e0[0].w.setVisibility(4);
        cyVar.finishFragment();
    }

    public static /* synthetic */ void q0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, cyVar.B3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        cyVar.c5();
    }

    public static void q4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = z4;
        if (zArr[currentAccount]) {
            return;
        }
        MessagesController messagesController = accountInstance.getMessagesController();
        messagesController.loadGlobalNotificationsSettings();
        messagesController.loadDialogs(0, 0, 100, true);
        messagesController.loadHintDialogs();
        messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
        accountInstance.getContactsController().checkInviteText();
        accountInstance.getMediaDataController().checkAllMedia(false);
        AndroidUtilities.runOnUIThread(new ui(accountInstance, 18), 200L);
        Iterator<String> it = messagesController.diceEmojies.iterator();
        while (it.hasNext()) {
            accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
        }
        zArr[currentAccount] = true;
    }

    public static void r0(cy cyVar) {
        b.c(cyVar.getParentActivity(), cyVar.currentAccount, cyVar.getResourceProvider());
    }

    public static void r1(cy cyVar, ay ayVar, float f7) {
        if (cyVar.T == f7) {
            return;
        }
        cyVar.T = f7;
        if (f7 == 0.0f) {
            cyVar.U = false;
        }
        cyVar.E0.setOverscroll(f7);
        ayVar.a.setViewsOffset(f7);
        ayVar.a.setOverScrollMode(f7 != 0.0f ? 2 : 0);
        cyVar.fragmentView.invalidate();
        if (f7 <= AndroidUtilities.dp(90.0f) || cyVar.U) {
            return;
        }
        qw qwVar = cyVar.E0;
        ValueAnimator valueAnimator = qwVar.H0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            qwVar.i(qwVar.p0, true);
            cyVar.U = true;
            cyVar.getOrCreateStoryViewer().s(new cv(cyVar, 18));
        }
    }

    public static void s0(cy cyVar, int i10, org.telegram.ui.Components.k80 k80Var) {
        if (cyVar.currentAccount == i10) {
            return;
        }
        k80Var.u();
        if (cyVar.getParentActivity() == null) {
            return;
        }
        ux uxVar = cyVar.C2;
        LaunchActivity launchActivity = (LaunchActivity) cyVar.getParentActivity();
        ArrayList arrayList = cyVar.D2;
        String str = cyVar.E2;
        CharSequence charSequence = cyVar.F2;
        jw jwVar = cyVar.B1;
        CharSequence fieldText = jwVar != null ? jwVar.getFieldText() : null;
        launchActivity.P0(i10);
        cy cyVar2 = new cy(cyVar.arguments);
        cyVar2.C2 = uxVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                cyVar2.M4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    cyVar2.F2 = null;
                } else {
                    cyVar2.F2 = charSequence;
                    cyVar2.E2 = null;
                    cyVar2.D2 = null;
                    if (cyVar2.B1 != null) {
                        cyVar2.s3(fieldText);
                    } else {
                        cyVar2.V3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            cyVar2.D2 = null;
        } else {
            cyVar2.D2 = arrayList;
            cyVar2.E2 = null;
            cyVar2.M2 = false;
            if (cyVar2.B1 != null) {
                cyVar2.s3(fieldText);
            } else {
                cyVar2.V3 = fieldText;
            }
        }
        launchActivity.v0(cyVar2, false, true);
    }

    public static boolean s1(cy cyVar, ay ayVar) {
        if (cyVar.G3.c()) {
            return false;
        }
        int i10 = (int) (-cyVar.N);
        int b42 = cyVar.b4();
        int c42 = cyVar.c4();
        if (i10 == 0 || i10 == b42 || i10 == c42 || !ayVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (c42 >= i10 || i10 >= b42) {
            if ((cyVar.u3 != 1.0f ? Utilities.clamp((-cyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f) : 1.0f) < cyVar.E0.B0) {
                ayVar.b.y(-i10);
                return true;
            }
            ayVar.b.y(c42 - i10);
            return true;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int i11 = i10 - c42;
        if (i11 < dp / 2) {
            ayVar.b.y(-i11);
            return true;
        }
        ayVar.b.y(dp - i11);
        return true;
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final cy cyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        cyVar.j4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                cyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i13 = cyVar.W2) != 0 && cyVar.Z3(cyVar.currentAccount, cyVar.e0[0].s, i13, false).size() == 1) {
            cyVar.e0[0].w.setVisibility(4);
        }
        cyVar.z3 = 3;
        int i14 = -1;
        if (i10 == 102) {
            cyVar.I4(true, true);
            if (cyVar.R1 != null) {
                i12 = 0;
                while (i12 < cyVar.R1.size()) {
                    if (((TLRPC.Dialog) cyVar.R1.get(i12)).id == j10) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            i12 = -1;
            cyVar.w3();
            i11 = i12;
        } else {
            i11 = -1;
        }
        UndoView g42 = cyVar.g4();
        if (g42 != null) {
            g42.j(i10 == 103 ? 0 : z11 ? 1 : 95, j10, new Runnable() { // from class: org.telegram.ui.ov
                @Override // java.lang.Runnable
                public final void run() {
                    cyVar.y4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(cyVar.Z3(cyVar.currentAccount, cyVar.e0[0].s, cyVar.W2, false));
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                break;
            }
            if (((TLRPC.Dialog) arrayList2.get(i15)).id == j10) {
                i14 = i15;
                break;
            }
            i15++;
        }
        if (i10 == 102) {
            if (i11 < 0 || i14 >= 0 || (arrayList = cyVar.R1) == null) {
                cyVar.I4(false, true);
                return;
            }
            arrayList.remove(i11);
            cyVar.e0[0].x.D();
            cyVar.e0[0].q(true);
        }
    }

    public static String t2(cy cyVar) {
        ArrayList arrayList = cyVar.I2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == cyVar.getUserConfig().getClientUserId()) {
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb2.append(arrayList.size() == 1 ? DialogObject.getName(cyVar.currentAccount, longValue) : DialogObject.getShortName(cyVar.currentAccount, longValue));
            }
        }
        return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
    }

    public static void u0(cy cyVar) {
        BirthdayController.getInstance(cyVar.currentAccount).hide();
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        cyVar.c5();
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.wc.b0(cyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void v0(cy cyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.H0(launchActivity, cyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(cyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static /* synthetic */ void w0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        cyVar.c5();
    }

    public static void x0(cy cyVar) {
        if (cyVar.O3) {
            fi.v3 v3Var = cyVar.p0;
            if (v3Var != null) {
                v3Var.e(true);
            }
            di.b7 o10 = MessagesController.getInstance(cyVar.currentAccount).getStoriesController().o();
            if (o10 != null && o10.a(cyVar.currentAccount, 1)) {
                cyVar.showDialog(new tg.j0(o10.b(), cyVar.currentAccount, cyVar.getParentActivity(), cyVar, null));
                return;
            } else {
                fi.sb D = fi.sb.D(cyVar.getParentActivity(), cyVar.currentAccount);
                D.x = new ix(cyVar);
                D.Q(null);
                return;
            }
        }
        fi.v3 v3Var2 = cyVar.q0;
        if (v3Var2 != null) {
            if (v3Var2.V) {
                return;
            } else {
                AndroidUtilities.removeFromParent(v3Var2);
            }
        }
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.y6.Gi, 0, new sv(cyVar, 9));
        fi.v3 v3Var3 = new fi.v3(cyVar.getParentActivity(), 2);
        v3Var3.q(8.0f);
        v3Var3.d = 8000L;
        v3Var3.i(true);
        v3Var3.p(true);
        v3Var3.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
        v3Var3.s(replaceSingleTag);
        v3Var3.l(1.0f, -40.0f);
        v3Var3.h(cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
        cyVar.q0 = v3Var3;
        v3Var3.setTranslationY((-cyVar.g4) - cyVar.i4);
        ((ViewGroup) cyVar.fragmentView).addView(cyVar.q0, org.telegram.ui.Components.gb1.h(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        cyVar.q0.u();
    }

    public static void y0(cy cyVar) {
        MessagesController.getInstance(cyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        cyVar.c5();
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.wc.b0(cyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void z0(cy cyVar, int i10) {
        ch.f fVar = cyVar.k4;
        RectF rectF = cyVar.v4;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (a8.pf.a(i10, 4)) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (cyVar.fragmentView.getMeasuredHeight() - cyVar.g4) - AndroidUtilities.dp(8.0f);
            int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
            int dp3 = AndroidUtilities.dp(cyVar.K ? 81.0f : 0.0f) + AndroidUtilities.dp(48.0f) + cyVar.actionBar.getMeasuredHeight();
            qx qxVar = cyVar.z0;
            boolean z10 = false;
            int measuredHeight2 = dp3 + ((qxVar == null || qxVar.getVisibility() != 0) ? 0 : cyVar.z0.getMeasuredHeight());
            org.telegram.ui.Components.ws wsVar = cyVar.J1;
            int sumHeightOfAllVisibleChild = measuredHeight2 + ((wsVar == null || wsVar.getVisibility() != 0) ? 0 : cyVar.J1.getSumHeightOfAllVisibleChild()) + ((int) cyVar.N);
            int measuredHeight3 = cyVar.actionBar.getMeasuredHeight();
            cyVar.u4.set(0.0f, -dp, cyVar.fragmentView.getMeasuredWidth(), AndroidUtilities.lerp(sumHeightOfAllVisibleChild, AndroidUtilities.dp(30.0f) + measuredHeight3 + (cyVar.Z != null ? r9.getMeasuredHeight() : 0), cyVar.b.e) + dp);
            if (cyVar.W) {
                rectF.set(0.0f, dp2, cyVar.fragmentView.getMeasuredWidth(), measuredHeight);
                rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
            } else {
                if (cyVar.B1 != null && cyVar.y1 != null) {
                    rectF.set(0.0f, cyVar.fragmentView.getMeasuredHeight() - cyVar.t3(), cyVar.fragmentView.getMeasuredWidth(), cyVar.fragmentView.getMeasuredHeight());
                    rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
                fVar.g(z10 ? 2 : 1, cyVar.t4);
            }
            z10 = true;
            fVar.g(z10 ? 2 : 1, cyVar.t4);
        }
        fVar.e(cyVar.s4, cyVar.fragmentView.getMeasuredWidth(), cyVar.fragmentView.getMeasuredHeight());
    }

    public final void A3() {
        if (this.e0 == null) {
            return;
        }
        int t32 = t3();
        int i10 = 0;
        while (true) {
            ay[] ayVarArr = this.e0;
            if (i10 >= ayVarArr.length) {
                return;
            }
            ay ayVar = ayVarArr[i10];
            if (ayVar != null) {
                wx wxVar = ayVar.a;
                wxVar.setPadding(0, wxVar.g3, 0, t32);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A4(long j10, boolean z10, MessagesController.DialogFilter dialogFilter, int i10, boolean z11) {
        boolean z12;
        int i11;
        boolean pinDialog;
        boolean z13;
        int i12 = (this.e0[0].s == 0 && h4() && this.e0[0].v == 2) ? 1 : 0;
        int L0 = this.e0[0].c.L0();
        if (dialogFilter != null) {
            int i13 = dialogFilter.pinnedDialogs.get(j10, TLObject.FLAG_31);
            if (!z10 && i13 == Integer.MIN_VALUE) {
                return;
            }
        }
        this.z3 = z10 ? 4 : 5;
        int i14 = -1;
        if (L0 > i12 || !z11) {
            z12 = true;
        } else {
            I4(true, true);
            w3();
            if (this.R1 != null) {
                for (int i15 = 0; i15 < this.R1.size(); i15++) {
                    if (((TLRPC.Dialog) this.R1.get(i15)).id == j10) {
                        i11 = i15;
                        z12 = false;
                        break;
                    }
                }
            }
            z12 = false;
        }
        i11 = -1;
        if (dialogFilter != null) {
            if (z10) {
                dialogFilter.pinnedDialogs.put(j10, i10);
            } else {
                dialogFilter.pinnedDialogs.delete(j10);
            }
            if (z11) {
                getMessagesController().onFilterUpdate(dialogFilter);
            }
            pinDialog = true;
        } else {
            pinDialog = getMessagesController().pinDialog(j10, z10, null, -1L);
        }
        if (pinDialog) {
            if (z12) {
                if (this.R0 != 10) {
                    k4(false);
                }
                F4(true, false);
            } else {
                ArrayList Z3 = Z3(this.currentAccount, this.e0[0].s, this.W2, false);
                int i16 = 0;
                while (true) {
                    if (i16 >= Z3.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) Z3.get(i16)).id == j10) {
                        i14 = i16;
                        break;
                    }
                    i16++;
                }
            }
        }
        if (z12) {
            return;
        }
        if (i11 >= 0) {
            ArrayList arrayList = this.R1;
            if (arrayList != null && i14 >= 0 && i11 != i14) {
                arrayList.add(i14, (TLRPC.Dialog) arrayList.remove(i11));
                this.e0[0].x.D();
                this.e0[0].q(true);
                ay ayVar = this.e0[0];
                ayVar.c.h1((ayVar.s == 0 && h4() && this.e0[0].v == 2) ? 1 : 0, (int) this.N);
            } else if (i14 >= 0 && i11 == i14) {
                AndroidUtilities.runOnUIThread(new cv(this, 24), 200L);
            }
            z13 = true;
            if (z13) {
                I4(false, true);
                return;
            }
            return;
        }
        z13 = false;
        if (z13) {
        }
    }

    @Override // og.b
    public final List B() {
        return Arrays.asList(new og.a(LocaleController.getString(R.string.DebugDialogsActivity)), new og.a(LocaleController.getString(R.string.ClearLocalDatabase), new cv(this, 28)), new og.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new cv(this, 29)));
    }

    public final void B3() {
        jh.f fVar = this.y1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void B4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        J3();
    }

    public final void C3() {
        ay ayVar;
        float a42 = a4(true);
        qx qxVar = this.z0;
        if (qxVar != null) {
            boolean z10 = qxVar.getAlpha() != a42;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, a42);
            this.z0.setAlpha(a42);
            this.z0.setScaleX(lerp);
            this.z0.setScaleY(lerp);
            this.z0.setVisibility(a42 > 0.0f ? 0 : 8);
            if (z10 && (ayVar = this.e0[0]) != null) {
                ayVar.a.requestLayout();
            }
        }
        a5();
    }

    public final void C4(ay ayVar) {
        int i10;
        if (ayVar.getVisibility() != 0) {
            return;
        }
        int i11 = ayVar.d.v;
        if (ayVar.s == 0 && h4() && ayVar.a.getChildCount() == 0 && ayVar.v == 2) {
            ((s4.c0) ayVar.a.getLayoutManager()).h1(1, (int) this.N);
        }
        ayVar.d.getClass();
        ayVar.d.V();
        int h = ayVar.d.h();
        if (h == 1 && i11 == 1 && ayVar.d.j(0) == 5) {
            ayVar.q(true);
        } else {
            ayVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                ayVar.y.b(i11);
            }
        }
        try {
            ayVar.a.setEmptyView((this.W2 == 0 && this.Y2 == 0) ? ayVar.w : null);
        } catch (Exception e) {
            FileLog.e(e);
        }
        z3(ayVar);
    }

    public final void D3() {
        float f7 = this.n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        li.w1 w1Var = this.C1;
        if (w1Var != null) {
            w1Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            this.C1.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        jh.f fVar = this.y1;
        if (fVar != null) {
            fVar.setAlpha(f7);
            this.y1.setVisibility(f7 > 0.0f ? 0 : 8);
            this.y1.getFadeView().setAlpha(f7);
            this.y1.getFadeView().setVisibility(f7 > 0.0f ? 0 : 8);
        }
    }

    public final void D4() {
        boolean z10;
        if (this.N == 0.0f || (z10 = this.K)) {
            return;
        }
        float f7 = z10 ? -c4() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.H3, f7));
        animatorSet.setInterpolator(org.telegram.ui.Components.ds.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 1) {
            K3();
            M3();
            P3();
            C3();
            N3();
            ox oxVar = this.X;
            oe.b bVar = this.b;
            oxVar.setBlurredBackgroundVisibility(bVar.e);
            float a2 = a8.v0.a(bVar.e);
            org.telegram.ui.Components.y9 y9Var = this.b3;
            if (y9Var != null) {
                y9Var.setScaleX(a2);
                this.b3.setScaleY(a2);
                this.b3.setAlpha(a2);
                this.b3.setVisibility(a2 > 0.0f ? 0 : 8);
            }
            if (this.v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, a2);
                this.v0.setScaleX(lerp);
                this.v0.setScaleY(lerp);
                this.v0.setAlpha(a2);
                this.v0.setVisibility(a2 > 0.0f ? 0 : 8);
                this.w0.setAlpha(a2);
                this.w0.setVisibility(a2 > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i10 == 2) {
            K3();
            M3();
            return;
        }
        if (i10 == 3) {
            I3();
            return;
        }
        if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (i10 == 5) {
            H3();
            return;
        }
        if (i10 == 6) {
            K3();
            M3();
        } else {
            if (i10 == 7) {
                D3();
                return;
            }
            if (i10 == 8) {
                C3();
                N3();
            } else if (i10 == 9) {
                N3();
            }
        }
    }

    public final void E3() {
        if (this.actionBar == null) {
            return;
        }
        float f7 = 1.0f - this.b.e;
        float d42 = 1.0f - d4();
        org.telegram.ui.Components.j20.d(this.actionBar.getBackButton(), Math.max(this.u3, f7 * d42 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E4(int i10) {
        org.telegram.ui.Components.p00 p00Var;
        if (this.z0 == null) {
            e5(true, true);
            if (this.z0 == null) {
                return;
            }
        }
        int tabsCount = this.z0.getTabsCount() - 1;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i11 = 0;
        while (true) {
            if (i11 >= dialogFilters.size()) {
                break;
            }
            if (dialogFilters.get(i11).id == i10) {
                tabsCount = i11;
                break;
            }
            i11++;
        }
        qx qxVar = this.z0;
        if (tabsCount < 0) {
            qxVar.getClass();
        } else if (tabsCount < qxVar.getTabsCount()) {
            p00Var = (org.telegram.ui.Components.p00) qxVar.h.get(tabsCount);
            if (p00Var != null) {
                qx qxVar2 = this.z0;
                ArrayList arrayList = qxVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                qxVar2.f((org.telegram.ui.Components.p00) ic.a.g(1, arrayList), arrayList.size() - 1);
                return;
            }
            ay[] ayVarArr = this.e0;
            if (ayVarArr == null || ayVarArr.length <= 0 || ayVarArr[0].h != p00Var.a) {
                this.z0.f(p00Var, tabsCount);
                return;
            }
            return;
        }
        p00Var = null;
        if (p00Var != null) {
        }
    }

    public final void F3() {
        org.telegram.ui.Components.j20.d(this.g0, c3.h0.E(this.i0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - d4(), 1.0f - this.c.e));
    }

    public final void F4(boolean z10, boolean z11) {
        tw twVar = this.G3;
        if (twVar == null || !twVar.c()) {
            int i10 = (this.e0[0].s == 0 && h4() && this.e0[0].v == 2) ? 1 : 0;
            int i11 = (!this.K || z11 || this.E0.g()) ? 0 : -AndroidUtilities.dp(81.0f);
            if (!z10) {
                this.e0[0].c.h1(i10, i11);
                D4();
            } else {
                org.telegram.ui.Components.pl0 pl0Var = this.e0[0].r;
                pl0Var.b = 1;
                pl0Var.c(i10, i11, false, false);
                D4();
            }
        }
    }

    public final void G3() {
        org.telegram.ui.Components.j20.d(this.f0, c3.h0.E(SharedConfig.passcodeHash.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - d4(), 1.0f - this.c.e));
    }

    public final void G4(String str, boolean z10) {
        W4(true, false, true, false);
        ox oxVar = this.X;
        if (oxVar != null) {
            oxVar.r.setText(str);
            this.X.r.setSelection(str.length());
        }
    }

    public final void H3() {
        org.telegram.ui.Components.j20.d(this.j0, c3.h0.E(this.R0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - d4(), 1.0f - this.c.e));
        qw qwVar = this.E0;
        if (qwVar != null) {
            qwVar.invalidate();
        }
    }

    public final void H4(float f7) {
        this.c0 = f7;
        for (ay ayVar : this.e0) {
            wx wxVar = ayVar.a;
            for (int i10 = 0; i10 < wxVar.getChildCount(); i10++) {
                View childAt = wxVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= ayVar.d.f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void I3() {
        org.telegram.ui.Components.j20.d(this.l0, c3.h0.E(this.b.e, 1.0f - d4(), 1.0f - this.c.e, this.d.e));
    }

    public final void I4(boolean z10, boolean z11) {
        if (this.e0 == null || this.S1 == z10) {
            return;
        }
        if (z10) {
            this.R1 = new ArrayList(Z3(this.currentAccount, this.e0[0].s, this.W2, false));
        } else {
            this.R1 = null;
        }
        this.S1 = z10;
        ay ayVar = this.e0[0];
        ayVar.d.G = z10;
        if (z10 || !z11) {
            return;
        }
        if (ayVar.a.c0()) {
            this.e0[0].a.post(new sv(this, 10));
        } else {
            this.e0[0].d.l();
        }
    }

    public final void J3() {
        bi.cc ccVar;
        boolean z10 = !this.j2 && ((ccVar = this.K0) == null || ccVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8);
        mg0 mg0Var = this.J3;
        if (mg0Var != null) {
            mg0Var.a.v.a(z10, true);
        }
    }

    public final void J4(boolean z10) {
        ay ayVar;
        if (SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(32768)) {
            return;
        }
        if (z10) {
            ay[] ayVarArr = this.e0;
            if (ayVarArr != null && (ayVar = ayVarArr[0]) != null) {
                ayVar.setLayerType(2, null);
                this.e0[0].setClipChildren(false);
                this.e0[0].setClipToPadding(false);
                this.e0[0].a.setClipChildren(false);
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setLayerType(2, null);
            }
            View view = this.fragmentView;
            if (view != null) {
                ((ViewGroup) view).setClipChildren(false);
                this.fragmentView.requestLayout();
                return;
            }
            return;
        }
        if (this.e0 != null) {
            int i10 = 0;
            while (true) {
                ay[] ayVarArr2 = this.e0;
                if (i10 >= ayVarArr2.length) {
                    break;
                }
                ay ayVar2 = ayVarArr2[i10];
                if (ayVar2 != null) {
                    ayVar2.setLayerType(0, null);
                    ayVar2.setClipChildren(true);
                    ayVar2.setClipToPadding(true);
                    ayVar2.a.setClipChildren(true);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            kVar2.setLayerType(0, null);
        }
        qw qwVar = this.E0;
        if (qwVar != null) {
            qwVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void K3() {
        E3();
        org.telegram.ui.Components.j20.d(this.k0, (1.0f - this.b.e) * (1.0f - d4()) * (1.0f - this.c.e));
        F3();
        I3();
        G3();
        H3();
    }

    public final void K4(float f7) {
        ay[] ayVarArr = this.e0;
        if (ayVarArr != null) {
            int paddingTop = ayVarArr[0].a.getPaddingTop() + ((int) f7);
            int i10 = 0;
            while (true) {
                ay[] ayVarArr2 = this.e0;
                if (i10 >= ayVarArr2.length) {
                    break;
                }
                ayVarArr2[i10].a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView == null || f7 == this.N) {
            return;
        }
        this.N = f7;
        org.telegram.ui.Components.qc qcVar = this.o3;
        if (qcVar != null) {
            qcVar.l();
        }
        if (this.F3 != null) {
            float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.F3;
            float f10 = (int) f7;
            float f11 = oVar.f;
            oVar.h = f10;
            oVar.setTranslationY(f11 + f10);
            this.F3.setAlpha(a8.ee.a(currentActionBarHeight, 0.0f, 1.0f));
            this.F3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        M3();
        this.fragmentView.invalidate();
    }

    public final void L3() {
        String string = LocaleController.getString(d4() > 0.5f ? R.string.SearchTopics : R.string.SearchChats);
        this.X.r.setContentDescription(string);
        this.X.r.setHint(string);
    }

    public final void L4(float f7) {
        this.x1 = f7;
        j5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        a5();
    }

    public final void M3() {
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - a8.ee.a(((-this.N) - c4()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = (this.R0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.u3, this.h.e)) * Math.max(this.b.e, (1.0f - d4()) * a2);
        this.X.setAlpha(max);
        this.X.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final void M4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.E2 = null;
            this.F2 = null;
            return;
        }
        this.E2 = str;
        this.F2 = null;
        this.D2 = null;
        if (this.B1 != null) {
            s3(charSequence);
        } else {
            this.V3 = charSequence;
        }
    }

    public final void N3() {
        if (this.Z != null) {
            float f7 = (this.a0 != null ? 1.0f : 0.0f) * this.b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f7);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f7);
            this.Z.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.t91 t91Var = this.a0;
        oe.b bVar = this.s;
        if (t91Var != null) {
            float f10 = 1.0f - bVar.e;
            t91Var.setAlpha(f10);
            this.a0.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        ig.r0 r0Var = this.b0;
        if (r0Var != null) {
            float f11 = bVar.e;
            r0Var.setAlpha(f11);
            this.b0.setVisibility(f11 > 0.0f ? 0 : 8);
        }
    }

    public final void N4(float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.X3 != f7) {
            boolean z10 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z10 = false;
            }
            this.Y3 = z10;
            this.X3 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.Y3) {
                float f10 = (1.0f - this.X3) * (-AndroidUtilities.dp(40.0f));
                qw qwVar = this.E0;
                if (qwVar != null) {
                    qwVar.setTranslationX(f10);
                }
                ox oxVar = this.X;
                if (oxVar != null) {
                    oxVar.setTranslationX(f10);
                }
                tw twVar = this.G3;
                if (twVar == null || twVar.getFragmentView() == null || this.y) {
                    return;
                }
                this.G3.getFragmentView().setTranslationX(f10);
                return;
            }
            float f11 = -AndroidUtilities.dp(4.0f);
            float f12 = 1.0f - this.X3;
            float f13 = f11 * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            qw qwVar2 = this.E0;
            if (qwVar2 != null) {
                qwVar2.setScaleX(f14);
                this.E0.setScaleY(f14);
                this.E0.setTranslationX(f13);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            ox oxVar2 = this.X;
            if (oxVar2 != null) {
                oxVar2.setTranslationX(f13);
                this.X.setScaleX(f14);
                this.X.setScaleY(f14);
            }
            tw twVar2 = this.G3;
            if (twVar2 == null || twVar2.getFragmentView() == null) {
                return;
            }
            if (!this.y) {
                this.G3.getFragmentView().setScaleX(f14);
                this.G3.getFragmentView().setScaleY(f14);
                this.G3.getFragmentView().setTranslationX(f13);
            }
            this.G3.getFragmentView().setPivotX(0.0f);
            this.G3.getFragmentView().setPivotY(0.0f);
        }
    }

    public final void O3(boolean z10) {
        if (this.C0 == null || this.actionBar == null) {
            return;
        }
        int i10 = AndroidUtilities.navigationBarHeight;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.a) + (this.a0 != null ? AndroidUtilities.dp(50.0f) : 0);
        org.telegram.ui.Components.ws wsVar = this.J1;
        int c10 = measuredHeight + (wsVar != null ? (int) wsVar.c(AndroidUtilities.dp(7.0f)) : 0);
        jx jxVar = this.C0;
        SparseArray sparseArray = jxVar.h;
        jxVar.W0 = c10;
        jxVar.X0 = i10;
        bi.r1 r1Var = jxVar.a0;
        if (z10) {
            r1Var.t1(0, c10, 0, i10);
        } else {
            r1Var.setPadding(0, c10, 0, i10);
        }
        jxVar.O0.j(jxVar.W0, jxVar.X0, z10);
        org.telegram.ui.Components.qo0 qo0Var = jxVar.b0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qo0Var.getLayoutParams();
        int i11 = marginLayoutParams.topMargin;
        int i12 = jxVar.W0;
        if (i11 != i12 || marginLayoutParams.bottomMargin != jxVar.X0) {
            marginLayoutParams.topMargin = i12;
            marginLayoutParams.bottomMargin = jxVar.X0;
            qo0Var.requestLayout();
        }
        org.telegram.ui.Components.ep0.Q(jxVar.h0, jxVar.k0, jxVar.W0, jxVar.X0, z10);
        org.telegram.ui.Components.ep0.Q(jxVar.m0, jxVar.p0, jxVar.W0, jxVar.X0, z10);
        org.telegram.ui.Components.ep0.Q(jxVar.t0, jxVar.w0, jxVar.W0, jxVar.X0, z10);
        org.telegram.ui.Components.wh0 wh0Var = jxVar.r0;
        int i13 = jxVar.W0;
        int i14 = jxVar.X0;
        wh0Var.setClipToPadding(false);
        org.telegram.ui.Components.r71 r71Var = wh0Var.c;
        wh0Var.J = z10;
        wh0Var.setPadding(0, i13, 0, i14);
        if (z10) {
            r71Var.t1(0, i13, 0, i14);
        } else {
            r71Var.setPadding(0, i13, 0, i14);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r71Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i13;
        marginLayoutParams2.bottomMargin = -i14;
        wh0Var.J = false;
        org.telegram.ui.Components.co0 co0Var = jxVar.I0;
        if (co0Var != null) {
            co0Var.b(jxVar.W0, jxVar.X0, z10);
        }
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) sparseArray.valueAt(i15);
            if (view instanceof h10) {
                ((h10) view).j(jxVar.W0, jxVar.X0, z10);
            }
        }
        for (int i16 = 0; i16 < jxVar.getChildCount(); i16++) {
            if (jxVar.getChildAt(i16) instanceof h10) {
                ((h10) jxVar.getChildAt(i16)).j(jxVar.W0, jxVar.X0, z10);
            }
        }
    }

    public final void O4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.y6 y6Var = new org.telegram.ui.Components.y6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.c71(22, this, r0), new ui(r0, 17));
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(getParentActivity(), getResourceProvider());
        e3Var.c(y6Var);
        org.telegram.ui.ActionBar.k3 k3Var = e3Var.a;
        k3Var.show();
        org.telegram.ui.ActionBar.k3[] k3VarArr = {k3Var};
        k3Var.fixNavigationBarKey(org.telegram.ui.ActionBar.y6.h5);
    }

    public final void P3() {
        if (this.J1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(lerp);
            this.J1.setScaleY(lerp);
            this.J1.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x013c, code lost:
    
        if ((r3.size() + r2.alwaysShow.size()) > 100) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P4(org.telegram.ui.Cells.p2 p2Var) {
        long j10;
        int b10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        long j11;
        int i10;
        LinearLayout linearLayout;
        cy cyVar;
        char c10;
        boolean[] zArr;
        MessagesController.DialogFilter dialogFilter;
        boolean[] zArr2;
        long j12;
        ?? r42;
        long j13;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        int i15;
        int i16;
        final long j14;
        int i17;
        org.telegram.ui.ActionBar.g1 g1Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        char c11;
        final cy cyVar2 = this;
        boolean isCommunity = ChatObject.isCommunity(p2Var.g2);
        boolean z11 = false;
        if (!p2Var.N()) {
            long dialogId = p2Var.getDialogId();
            Bundle bundle = new Bundle();
            int messageId = p2Var.getMessageId();
            if (!DialogObject.isEncryptedDialog(dialogId)) {
                if (DialogObject.isUserDialog(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else if (cyVar2.Y2 == 0 || ((b10 = ii.s0.b(cyVar2.currentAccount, dialogId)) != 4 && b10 != 3)) {
                    TLRPC.Chat chat = cyVar2.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (messageId == 0 || chat == null || chat.migrated_to == null) {
                        j10 = dialogId;
                    } else {
                        bundle.putLong("migrated_to", dialogId);
                        j10 = -chat.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -j10);
                }
                if (messageId != 0) {
                    bundle.putInt("message_id", messageId);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                boolean z12 = cyVar2.Y2 == 0 && cyVar2.getMessagesController().filtersEnabled && cyVar2.getMessagesController().dialogFiltersLoaded && cyVar2.getMessagesController().dialogFilters != null && cyVar2.getMessagesController().dialogFilters.size() > 0;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
                if (z12) {
                    LinearLayout linearLayout2 = new LinearLayout(cyVar2.getParentActivity());
                    linearLayout2.setOrientation(1);
                    bx bxVar = new bx(cyVar2.getParentActivity(), 0);
                    LinearLayout linearLayout3 = new LinearLayout(cyVar2.getParentActivity());
                    linearLayout3.setOrientation(1);
                    bxVar.addView(linearLayout3);
                    int size = cyVar2.getMessagesController().dialogFilters.size();
                    int i18 = 0;
                    org.telegram.ui.ActionBar.g1 g1Var2 = null;
                    while (i18 < size) {
                        final MessagesController.DialogFilter dialogFilter2 = cyVar2.getMessagesController().dialogFilters.get(i18);
                        if (dialogFilter2.isDefault()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            i15 = i18;
                            c11 = 'd';
                            i16 = size;
                            j14 = dialogId;
                        } else {
                            final boolean includesDialog = dialogFilter2.includesDialog(AccountInstance.getInstance(cyVar2.currentAccount), dialogId);
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            i15 = i18;
                            i16 = size;
                            j14 = dialogId;
                            final ArrayList I = org.telegram.ui.Components.v00.I(cyVar2, dialogFilter2, arrayList, true, z11);
                            if (!includesDialog) {
                                c11 = 'd';
                            }
                            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(2, cyVar2.getParentActivity(), null, false, false);
                            g1Var3.setChecked(includesDialog);
                            i17 = i16;
                            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter2.name, g1Var3.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter2.entities, g1Var3.getTextView().getPaint().getFontMetricsInt());
                            g1Var3.setEmojiCacheType(dialogFilter2.title_noanimate ? 26 : 0);
                            g1Var3.j(replaceAnimatedEmoji, 0, new org.telegram.ui.Components.o10(cyVar2.getParentActivity(), R.drawable.msg_folders, dialogFilter2.color));
                            g1Var3.getTextView().setEmojiColor(cyVar2.getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
                            g1Var3.setMinimumWidth(160);
                            g1Var = g1Var3;
                            j14 = j14;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                            g1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vv
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArrayList arrayList2;
                                    long j15;
                                    MessagesController.DialogFilter dialogFilter3;
                                    cy cyVar3 = cy.this;
                                    cyVar3.getClass();
                                    boolean z13 = includesDialog;
                                    ArrayList arrayList3 = I;
                                    MessagesController.DialogFilter dialogFilter4 = dialogFilter2;
                                    long j16 = j14;
                                    if (z13) {
                                        dialogFilter4.alwaysShow.remove(Long.valueOf(j16));
                                        dialogFilter4.neverShow.add(Long.valueOf(j16));
                                        o00.v0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, cyVar3, null);
                                        cyVar3.g4().k(j16, 21, Integer.valueOf(arrayList3.size()), dialogFilter4, null, null);
                                    } else {
                                        if (arrayList3.isEmpty()) {
                                            arrayList2 = arrayList3;
                                            j15 = j16;
                                            dialogFilter3 = dialogFilter4;
                                        } else {
                                            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                                dialogFilter4.neverShow.remove(arrayList3.get(i19));
                                            }
                                            dialogFilter4.alwaysShow.addAll(arrayList3);
                                            arrayList2 = arrayList3;
                                            dialogFilter3 = dialogFilter4;
                                            j15 = j16;
                                            o00.v0(dialogFilter3, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, cyVar3, null);
                                        }
                                        cyVar3.g4().k(j15, 20, Integer.valueOf(arrayList2.size()), dialogFilter3, null, null);
                                    }
                                    cyVar3.j4(true);
                                    cyVar3.finishPreviewFragment();
                                }
                            });
                            linearLayout3.addView(g1Var);
                            cyVar2 = this;
                            dialogId = j14;
                            size = i17;
                            i18 = i15 + 1;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                            g1Var2 = g1Var;
                            z11 = false;
                        }
                        g1Var = g1Var2;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                        i17 = i16;
                        cyVar2 = this;
                        dialogId = j14;
                        size = i17;
                        i18 = i15 + 1;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                        g1Var2 = g1Var;
                        z11 = false;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    j11 = dialogId;
                    org.telegram.ui.ActionBar.g1 g1Var4 = g1Var2;
                    i10 = 160;
                    if (g1Var4 != null) {
                        g1Var4.m(false, true);
                    }
                    if (linearLayout3.getChildCount() <= 0) {
                        z12 = false;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout2;
                    } else {
                        View l1Var = new org.telegram.ui.ActionBar.l1(getParentActivity(), org.telegram.ui.ActionBar.y6.H8, getResourceProvider());
                        l1Var.setTag(R.id.fit_width_tag, 1);
                        org.telegram.ui.ActionBar.g1 g1Var5 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
                        g1Var5.j(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                        g1Var5.setMinimumWidth(160);
                        g1Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 20));
                        linearLayout2.addView(g1Var5);
                        linearLayout2.addView(l1Var, org.telegram.ui.Components.gb1.r(-1, 8));
                        linearLayout2.addView(bxVar);
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout2;
                    }
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    j11 = dialogId;
                    i10 = 160;
                    linearLayout = null;
                }
                org.telegram.ui.ActionBar.r2[] r2VarArr = new org.telegram.ui.ActionBar.r2[1];
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z12 ? 3 : 2, getParentActivity(), getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
                if (z12) {
                    int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
                    org.telegram.ui.ActionBar.g1 g1Var6 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
                    g1Var6.j(LocaleController.getString(R.string.FilterAddTo), R.drawable.msg_addfolder, null);
                    g1Var6.setMinimumWidth(i10);
                    g1Var6.setOnClickListener(new org.telegram.ui.Components.k51(13, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var6);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new qt(r2VarArr, 5));
                }
                if (isCommunity) {
                    cyVar = this;
                    c10 = 0;
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var7 = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
                    if (p2Var.getHasUnread()) {
                        g1Var7.j(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                    } else {
                        g1Var7.j(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
                    }
                    g1Var7.setMinimumWidth(i10);
                    long j15 = j11;
                    cy cyVar3 = this;
                    j11 = j15;
                    g1Var7.setOnClickListener(new bi.p3(cyVar3, p2Var, j15, 5));
                    c10 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var7);
                    cyVar = cyVar3;
                }
                boolean[] zArr3 = new boolean[1];
                zArr3[c10] = true;
                TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(j11);
                int i19 = cyVar.e0[c10].s;
                boolean z13 = (i19 == 7 || i19 == 8) && (!cyVar.actionBar.q() || cyVar.actionBar.r(null));
                if (z13) {
                    zArr = zArr3;
                    dialogFilter = cyVar.getMessagesController().selectedDialogFilter[cyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                } else {
                    zArr = zArr3;
                    dialogFilter = null;
                }
                if (cyVar.o4(dialog)) {
                    zArr2 = zArr;
                    j12 = j11;
                    r42 = 0;
                } else {
                    ArrayList<TLRPC.Dialog> dialogs = cyVar.getMessagesController().getDialogs(cyVar.W2);
                    int size2 = dialogs.size();
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    while (true) {
                        if (i20 >= size2) {
                            z10 = z13;
                            zArr2 = zArr;
                            j12 = j11;
                            break;
                        }
                        TLRPC.Dialog dialog2 = dialogs.get(i20);
                        z10 = z13;
                        if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                            zArr2 = zArr;
                            j12 = j11;
                        } else if (cyVar.o4(dialog2)) {
                            zArr2 = zArr;
                            j12 = j11;
                            if (DialogObject.isEncryptedDialog(dialog2.id)) {
                                i22++;
                            } else {
                                i21++;
                            }
                        } else {
                            zArr2 = zArr;
                            j12 = j11;
                            if (!cyVar.getMessagesController().isPromoDialog(dialog2.id, false)) {
                                break;
                            }
                        }
                        i20++;
                        zArr = zArr2;
                        j11 = j12;
                        z13 = z10;
                    }
                    if (dialog == null || cyVar.o4(dialog)) {
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                    } else {
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j12);
                        int i23 = !isEncryptedDialog ? 1 : 0;
                        if (dialogFilter == null || !dialogFilter.alwaysShow.contains(Long.valueOf(j12))) {
                            i14 = i23;
                            i13 = isEncryptedDialog ? 1 : 0;
                            i12 = 0;
                        } else {
                            i14 = i23;
                            i13 = isEncryptedDialog ? 1 : 0;
                            i12 = 1;
                        }
                    }
                    int size3 = (!z10 || dialogFilter == null) ? (cyVar.W2 == 0 && dialogFilter == null) ? cyVar.getUserConfig().isPremium() ? cyVar.getMessagesController().maxPinnedDialogsCountPremium : cyVar.getMessagesController().maxPinnedDialogsCountDefault : cyVar.getUserConfig().isPremium() ? cyVar.getMessagesController().maxFolderPinnedDialogsCountPremium : cyVar.getMessagesController().maxFolderPinnedDialogsCountDefault : 100 - dialogFilter.alwaysShow.size();
                    boolean z14 = i13 + i22 <= size3 && (i14 + i21) - i12 <= size3;
                    r42 = 0;
                    zArr2[0] = z14;
                }
                if (zArr2[r42]) {
                    org.telegram.ui.ActionBar.g1 g1Var8 = new org.telegram.ui.ActionBar.g1(cyVar.getParentActivity(), r42, r42);
                    if (cyVar.o4(dialog)) {
                        g1Var8.j(LocaleController.getString(R.string.UnpinMessage), R.drawable.msg_unpin, null);
                    } else {
                        g1Var8.j(LocaleController.getString(R.string.PinMessage), R.drawable.msg_pin, null);
                    }
                    g1Var8.setMinimumWidth(160);
                    long j16 = j12;
                    j13 = j16;
                    g1Var8.setOnClickListener(new org.telegram.ui.Components.wr(cyVar, dialogFilter, dialog, j16, 1));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var8);
                } else {
                    j13 = j12;
                }
                if (DialogObject.isUserDialog(j13) && UserObject.isUserSelf(cyVar.getMessagesController().getUser(Long.valueOf(j13)))) {
                    i11 = 0;
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var9 = new org.telegram.ui.ActionBar.g1(cyVar.getParentActivity(), false, false);
                    if (cyVar.getMessagesController().isDialogMuted(j13, 0L)) {
                        g1Var9.j(LocaleController.getString(R.string.Unmute), R.drawable.msg_unmute, null);
                    } else {
                        g1Var9.j(LocaleController.getString(R.string.Mute), R.drawable.msg_mute, null);
                    }
                    g1Var9.setMinimumWidth(160);
                    g1Var9.setOnClickListener(new di.a2(cyVar, j13, 2));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var9);
                }
                if (!isCommunity) {
                    org.telegram.ui.ActionBar.g1 g1Var10 = new org.telegram.ui.ActionBar.g1(cyVar.getParentActivity(), i11, true);
                    g1Var10.setIconColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.p7));
                    int i24 = org.telegram.ui.ActionBar.y6.q7;
                    g1Var10.setTextColor(cyVar.getThemedColor(i24));
                    g1Var10.h(0.12f, i24);
                    g1Var10.j(LocaleController.getString(R.string.Delete), R.drawable.msg_delete, null);
                    g1Var10.setMinimumWidth(160);
                    g1Var10.setOnClickListener(new org.telegram.ui.Components.k51(14, cyVar, arrayList));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(g1Var10);
                }
                if (isCommunity) {
                    if (cyVar.n2 != null) {
                        cyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
                    }
                    cyVar.B4();
                    cyVar.parentLayout.setHighlightActionButtons(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", -j13);
                    cy cyVar4 = new cy(bundle2);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        r2VarArr[0] = cyVar4;
                        cyVar.presentFragmentAsPreview(cyVar4);
                        return false;
                    }
                    r2VarArr[0] = cyVar4;
                    cyVar.presentFragmentAsPreviewWithMenu(cyVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                    return false;
                }
                if (!cyVar.getMessagesController().checkCanOpenChat(bundle, cyVar)) {
                    return i11;
                }
                if (cyVar.n2 != null) {
                    cyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
                }
                cyVar.B4();
                cyVar.parentLayout.setHighlightActionButtons(true);
                un unVar = new un(bundle);
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    r2VarArr[0] = unVar;
                    cyVar.presentFragmentAsPreview(unVar);
                    return true;
                }
                r2VarArr[0] = unVar;
                cyVar.presentFragmentAsPreviewWithMenu(unVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                unVar.V9 = true;
                try {
                    unVar.m1.getAvatarImageView().performAccessibilityAction(64, null);
                } catch (Exception unused) {
                }
                return true;
            }
        } else if (p2Var.getCurrentDialogFolderId() == 1) {
            u4(p2Var);
            return false;
        }
        return false;
    }

    public boolean Q3() {
        return this.R0 == 10;
    }

    public final void Q4(boolean z10) {
        int i10 = 1;
        this.c.a(z10, true);
        if (this.m0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.P3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            this.m0.setVisibility(0);
        } else {
            this.m0.setSelected(false);
            Drawable background = this.m0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.m0, (Property<org.telegram.ui.ActionBar.w0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.P3.playTogether(arrayList);
        this.P3.addListener(new zw(this, z10, i10));
        this.P3.start();
    }

    public final void R3() {
        if (!AndroidUtilities.isTablet()) {
            this.V1 = true;
            return;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.g(true);
        }
        TLObject tLObject = this.X1;
        if (tLObject != null) {
            jx jxVar = this.C0;
            if (jxVar != null) {
                jxVar.d0.Q(this.W1, tLObject);
            }
            this.X1 = null;
        }
    }

    public final void R4() {
        if (this.A0 || !getMessagesController().dialogFiltersLoaded || !getMessagesController().showFiltersTooltip || this.z0 == null || !getMessagesController().getDialogFilters().isEmpty() || this.isPaused || !getUserConfig().filtersLoaded || this.inPreviewMode) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("filterhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("filterhint", true).apply();
        AndroidUtilities.runOnUIThread(new sv(this, 11), 1000L);
    }

    public final void S3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || !kVar.n0) {
            return;
        }
        kVar.g(true);
        this.q3 = false;
        e5(true, true);
    }

    public final void S4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        float f7;
        org.telegram.ui.Components.c71 c71Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        int i10;
        int i11;
        CharSequence charSequence;
        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(this, this.k0);
        int i12 = org.telegram.ui.ActionBar.y6.A8;
        H.S(getThemedColor(i12), getThemedColor(i12));
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        float f10 = 64.0f;
        int i13 = 0;
        if (this.Y2 != 0) {
            if (ChatObject.hasAdminRights(this.Z2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new cv(this, 3), false);
                H.k();
            }
            H.i(new cv(this, 6), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Z2.collapsed_in_dialogs);
            H.i(new cv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Z2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        if (m4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new cv(this, 8), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new cv(this, 9), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.u6 u6Var2 = this.resourceProvider;
        boolean a2 = u6Var2 != null ? u6Var2.a() : org.telegram.ui.ActionBar.y6.I.q();
        H.c(a2 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, LocaleController.getString(a2 ? R.string.SwitchThemeToDay : R.string.SwitchThemeToNight), new cv(this, 10), false);
        H.k();
        H.c(R.drawable.msg_contacts, LocaleController.getString(R.string.Contacts), new cv(this, 11), false);
        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.Calls), new cv(this, 12), false);
        H.k();
        H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new cv(this, 13), false);
        H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new cv(this, 14), false);
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.addItemOptions(H);
        }
        if (getMessagesController().config.walletAvailable.get()) {
            H.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletAttachMoney), new cv(this, 4), false);
        } else {
            TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
            if (launchActivity2 != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = attachMenuBots.bots;
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i14);
                    i14++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        gv gvVar = new gv(this, tL_attachMenuBot2, launchActivity2, 0);
                        org.telegram.ui.Components.c71 c71Var2 = new org.telegram.ui.Components.c71(21, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.u6 u6Var3 = H.d;
                        if (H.e != null) {
                            int i15 = org.telegram.ui.ActionBar.y6.F8;
                            int i16 = org.telegram.ui.ActionBar.y6.E8;
                            f7 = f10;
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, H.e, H.d, false, false);
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), i13, AndroidUtilities.dp(18.0f), i13);
                            CharSequence b10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.v8.b(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                            TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                            if (sideAttachMenuBotIcon != null) {
                                launchActivity = launchActivity2;
                                arrayList2 = arrayList3;
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.y6.c7, 1.0f);
                                if (svgThumb != null) {
                                    Integer num = H.k0;
                                    charSequence = b10;
                                    svgThumb.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.y6.w0(i15, u6Var3), PorterDuff.Mode.SRC_IN));
                                } else {
                                    charSequence = b10;
                                }
                                c71Var = c71Var2;
                                g1Var = g1Var2;
                                i11 = i16;
                                i10 = i15;
                                u6Var = u6Var3;
                                g1Var.k(charSequence, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                org.telegram.ui.Components.y9 y9Var = g1Var.h;
                                if (y9Var != null) {
                                    y9Var.setLayoutParams(org.telegram.ui.Components.gb1.i(24, 24, (LocaleController.isRTL ? 5 : 3) | 16));
                                }
                            } else {
                                launchActivity = launchActivity2;
                                arrayList2 = arrayList3;
                                c71Var = c71Var2;
                                u6Var = u6Var3;
                                CharSequence charSequence2 = b10;
                                g1Var = g1Var2;
                                i10 = i15;
                                i11 = i16;
                                g1Var.j(charSequence2, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.j0;
                            if (num2 == null && H.k0 == null) {
                                g1Var.c(i11, i10);
                            } else {
                                int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
                                Integer num3 = H.k0;
                                g1Var.d(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
                            }
                            Integer num4 = H.k0;
                            g1Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
                            Integer num5 = H.l0;
                            if (num5 != null) {
                                g1Var.setSelectorColor(num5.intValue());
                            } else {
                                g1Var.h(0.12f, i11);
                            }
                            g1Var.setOnClickListener(new org.telegram.ui.Components.ga(20, H, gvVar));
                            g1Var.setOnLongClickListener(new di.l2(3, H, c71Var));
                            int i17 = H.S;
                            if (i17 > 0) {
                                g1Var.setMinimumWidth(AndroidUtilities.dp(i17));
                                H.r(g1Var, org.telegram.ui.Components.gb1.r(H.S, -2));
                            } else {
                                H.r(g1Var, org.telegram.ui.Components.gb1.r(-1, -2));
                            }
                            launchActivity2 = launchActivity;
                            arrayList3 = arrayList2;
                            f10 = f7;
                            i13 = 0;
                        }
                    }
                    launchActivity = launchActivity2;
                    arrayList2 = arrayList3;
                    f7 = f10;
                    launchActivity2 = launchActivity;
                    arrayList3 = arrayList2;
                    f10 = f7;
                    i13 = 0;
                }
            }
        }
        float f11 = f10;
        if (getUserConfig().showCallsTab) {
            H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new cv(this, 5), false);
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.o0;
        if (g1Var3 != null) {
            org.telegram.ui.ActionBar.f7.V(g1Var3.b, org.telegram.ui.ActionBar.y6.ai, getResourceProvider());
            this.o0.setOnClickListener(new org.telegram.ui.Components.k51(11, this, H));
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                H.k();
                H.d(this.o0);
            }
        }
        H.Z();
        H.X(-AndroidUtilities.dp(f11));
    }

    @Override // org.telegram.ui.ActionBar.r2, org.telegram.ui.og0
    public final boolean T(MotionEvent motionEvent, boolean z10) {
        tw twVar;
        bi.cc ccVar;
        qx qxVar;
        if (!this.q3 && (((twVar = this.G3) == null || !twVar.c()) && (((ccVar = this.K0) == null || ccVar.getVisibility() != 0) && ((qxVar = this.z0) == null || !qxVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                qx qxVar2 = this.z0;
                boolean z11 = qxVar2 == null || qxVar2.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getFirstTabId();
                qx qxVar3 = this.z0;
                boolean z12 = qxVar3 == null || qxVar3.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getLastTabId();
                SharedConfig.getChatSwipeAction(this.currentAccount);
                if (!z10) {
                    return z11;
                }
                if (!z12 || z11) {
                }
            }
            return true;
        }
        return false;
    }

    public final void T3(String str) {
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.z i10 = this.actionBar.i(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.g1.setImageDrawable(new org.telegram.ui.ActionBar.j2(true));
            org.telegram.ui.ActionBar.f7.t(this.g1, org.telegram.ui.ActionBar.y6.y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.g1;
            int i11 = org.telegram.ui.ActionBar.y6.z8;
            org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i11), getResourceProvider());
            this.g1.setOnClickListener(new hv(this, 7));
            i10.addView(this.g1, org.telegram.ui.Components.gb1.u(54, 54, 16));
            arrayList.add(this.g1);
        }
        NumberTextView numberTextView = new NumberTextView(i10.getContext());
        this.h1 = numberTextView;
        numberTextView.setTextSize(18);
        this.h1.setTypeface(AndroidUtilities.bold());
        this.h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.y8));
        i10.addView(this.h1, org.telegram.ui.Components.gb1.q(1.0f, 0, -1, this.W ? 18 : 72, 0, 0));
        this.h1.setOnTouchListener(new ei.d(2));
        this.k1 = i10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = i10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.m1 = i10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.j1 = i10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = i10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        i10.addView(new View(getParentActivity()), org.telegram.ui.Components.gb1.r(5, -1));
        this.q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new nv(this, 1));
        arrayList.add(this.k1);
        arrayList.add(this.m1);
        arrayList.add(this.l1);
        arrayList.add(this.j1);
        arrayList.add(h);
        b5(false);
    }

    public final void T4() {
        if (this.S3 != null) {
            return;
        }
        for (String str : getMessagesController().pendingSuggestions) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new iv(this, 6));
                showDialog(alertDialog$Builder.a, new dv(this, 1));
                this.S3 = str;
                return;
            }
        }
    }

    public final void U3() {
        jx jxVar = this.C0;
        if ((jxVar != null && jxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        jx jxVar2 = new jx(this, getParentActivity(), this, this.n2 != null ? 2 : !this.l2 ? 1 : 0, this.R0, this.W2, this.Y2, new ix(this));
        this.C0 = jxVar2;
        this.glassEngine.c(jxVar2);
        ((tx) this.fragmentView).addView(this.C0, this.B0);
        jx jxVar3 = this.C0;
        jxVar3.d0.U = new lx(this);
        jxVar3.k0.setOnItemClickListener(new iv(this, 1));
        this.C0.p0.setOnItemClickListener(new iv(this, 2));
        this.C0.w0.setOnItemClickListener(new lv(this, 0));
        this.C0.p0.setOnItemLongClickListener(new iv(this, 3));
        this.C0.a0.setOnItemClickListener(new iv(this, 4));
        this.C0.a0.setOnItemLongClickListener(new ix(this));
        this.C0.setFilteredSearchViewDelegate(new iv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.p4);
    }

    public final void U4(long j10, View view) {
        p3(j10, view);
        boolean q5 = this.actionBar.q();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        char c10 = 1;
        int i10 = 0;
        if (!q5) {
            if (this.q3) {
                T3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.k5)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
                }
            } else {
                T3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            this.actionBar.K(null, null);
            int i11 = this.e0[0].s;
            ArrayList<TLRPC.Dialog> Z3 = ((i11 == 7 || i11 == 8) && (!this.actionBar.q() || this.actionBar.r(null))) ? Z3(this.currentAccount, this.e0[0].s, this.W2, this.S1) : getMessagesController().getDialogs(this.W2);
            int size = Z3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = Z3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!o4(dialog)) {
                        if (!getMessagesController().isPromoDialog(dialog.id, false)) {
                            break;
                        }
                    } else {
                        i12++;
                    }
                }
            }
            if (i12 > 1) {
                if (this.e0 != null) {
                    int i14 = 0;
                    while (true) {
                        ay[] ayVarArr = this.e0;
                        if (i14 >= ayVarArr.length) {
                            break;
                        }
                        ayVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                q5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.q3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.i1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.v3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.v3 = ValueAnimator.ofFloat(this.u3, 1.0f);
            int i16 = 0;
            while (true) {
                ay[] ayVarArr2 = this.e0;
                if (i16 >= ayVarArr2.length) {
                    break;
                }
                ay ayVar = ayVarArr2[i16];
                if (ayVar != null) {
                    ayVar.a.I0(true);
                }
                i16++;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp((this.K ? 81 : 0) + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.v3.addUpdateListener(new jv(this, max, i10));
            this.v3.addListener(new cx(this, max, c10 == true ? 1 : 0));
            this.v3.setInterpolator(org.telegram.ui.Components.ds.f);
            this.v3.setDuration(200L);
            this.v3.start();
            qx qxVar = this.z0;
            if (qxVar != null) {
                qxVar.b(org.telegram.ui.ActionBar.y6.Gh, org.telegram.ui.ActionBar.y6.Fh, org.telegram.ui.ActionBar.y6.Eh, org.telegram.ui.ActionBar.y6.Hh, org.telegram.ui.ActionBar.y6.w8);
            }
            org.telegram.ui.ActionBar.j2 j2Var = this.e1;
            if (j2Var != null) {
                j2Var.c(1.0f, true);
            }
            z10 = false;
        } else if (arrayList.isEmpty()) {
            j4(true);
            return;
        }
        b5(false);
        this.h1.a(arrayList.size(), z10);
    }

    public final void V3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new dx(this, parentActivity);
                FrameLayout.LayoutParams h = org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                h.bottomMargin = this.g4 + this.i4 + h.bottomMargin;
                tx txVar = (tx) this.fragmentView;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.x0 + 1;
                this.x0 = i11;
                txVar.addView(undoView, i11, h);
            }
        }
    }

    public final void V4(long j10, View view) {
        int i10 = -this.M3;
        this.M3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        (getMessagesController().premiumFeaturesBlocked() ? org.telegram.ui.Components.wc.b0(this).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.wc.b0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new cv(this, 22))).j();
    }

    public final void W3(final long j10, final long j11, boolean z10, final af1 af1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (x3(j10)) {
            int i10 = this.R0;
            int i11 = 3;
            if (i10 == 11 || i10 == 12 || i10 == 13) {
                if (DialogObject.isUserDialog(j10)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j10));
                    if (!user2.mutual_contact) {
                        UndoView g42 = g4();
                        if (g42 != null) {
                            g42.j(45, j10, null);
                            return;
                        }
                        return;
                    }
                    user = user2;
                    chat = null;
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                    if (!ChatObject.hasAdminRights(chat2) || !ChatObject.canChangeChatInfo(chat2)) {
                        UndoView g43 = g4();
                        if (g43 != null) {
                            g43.j(46, j10, null);
                            return;
                        }
                        return;
                    }
                    chat = chat2;
                    user = null;
                }
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new bi.g4(this, e2Var, user, chat, j10, tL_messages_checkHistoryImportPeer));
                try {
                    e2Var.r(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (!z10 || ((this.f2 == null || this.g2 == null) && this.h2 == null)) {
                if (i10 != 15) {
                    if (this.C2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.C2.v(this, arrayList, null, false, this.J2, this.K2, this.L2, af1Var) && this.i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                }
                Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, af1Var, 14), 26);
                if (j10 < 0) {
                    Y4(getMessagesController().getChat(Long.valueOf(-j10)), i0Var, null);
                    return;
                }
                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(this.H));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user3), UserObject.getFirstName(user4));
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.a;
                e2Var2.R = formatString;
                e2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user3), UserObject.getFirstName(user4))));
                alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new qt(i0Var, i11));
                alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.voip.c1(4));
                showDialog(e2Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (DialogObject.isEncryptedDialog(j10)) {
                TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.t.m(getMessagesController(), j10).user_id));
                if (user5 == null) {
                    return;
                }
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.f2, UserObject.getUserName(user5));
                string2 = LocaleController.getString(R.string.Send);
            } else if (!DialogObject.isUserDialog(j10)) {
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat3 == null) {
                    return;
                }
                String str3 = chat3.title;
                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat3.id, j11)) != null) {
                    str3 = ((Object) str3) + " " + findTopic.title;
                }
                if (this.h2 != null) {
                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                    formatStringSimple = LocaleController.formatStringSimple(this.h2, str3);
                    string2 = LocaleController.getString(R.string.Add);
                } else {
                    string = LocaleController.getString(R.string.SendMessageTitle);
                    formatStringSimple = LocaleController.formatStringSimple(this.g2, str3);
                    string2 = LocaleController.getString(R.string.Send);
                }
                String str4 = formatStringSimple;
                str = string;
                str2 = str4;
            } else if (j10 == getUserConfig().getClientUserId()) {
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.g2, LocaleController.getString(R.string.SavedMessages));
                string2 = LocaleController.getString(R.string.Send);
            } else {
                TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(j10));
                if (user6 == null || this.f2 == null) {
                    return;
                }
                str = LocaleController.getString(R.string.SendMessageTitle);
                str2 = LocaleController.formatStringSimple(this.f2, UserObject.getUserName(user6));
                string2 = LocaleController.getString(R.string.Send);
            }
            org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder2.a;
            e2Var3.R = str;
            e2Var3.T = AndroidUtilities.replaceTags(str2);
            alertDialog$Builder2.k(string2, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.yv
                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var4, int i12) {
                    cy.this.W3(j10, j11, false, af1Var);
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            if (showDialog(e2Var3) == null) {
                e2Var3.show();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W4(boolean z10, boolean z11, boolean z12, boolean z13) {
        jx jxVar;
        jx jxVar2;
        qw qwVar;
        jx jxVar3;
        boolean z14;
        jx jxVar4;
        boolean z15;
        org.telegram.ui.Components.t91 t91Var;
        TLRPC.Chat chat;
        tw twVar;
        boolean z16 = z12;
        this.b.a(z10, z16);
        int i10 = 0;
        if (z10) {
            U3();
        } else {
            m5(false);
        }
        int i11 = this.R0;
        if (i11 != 0 && i11 != 3) {
            z16 = false;
        }
        AnimatorSet animatorSet = this.w1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w1 = null;
        }
        this.q3 = z10;
        this.glassEngine.g();
        if (z10) {
            if (!this.t3 && !z13) {
                int totalDialogsCount = getMessagesController().getTotalDialogsCount();
                if (this.l2 || (totalDialogsCount <= 10 && !this.K)) {
                    z14 = true;
                    jxVar4 = this.C0;
                    if (jxVar4 != null) {
                        jxVar4.Q0 = z14;
                    }
                    z15 = z14 || this.K;
                    this.s3 = z15;
                    if (z15) {
                        this.t3 = true;
                    }
                    t91Var = this.a0;
                    if (t91Var != null && jxVar4 != null && !z14 && this.Y2 == 0) {
                        org.telegram.ui.Components.t91 n10 = jxVar4.n(-2, false);
                        this.a0 = n10;
                        this.Z.addView(n10, 0, org.telegram.ui.Components.gb1.i(-1, -1, 119));
                    } else if (this.Z != null && z14 && this.Y2 == 0) {
                        AndroidUtilities.removeFromParent(t91Var);
                        this.a0 = null;
                    }
                    if (this.C0 != null) {
                        O3(false);
                        this.C0.setKeyboardHeight(((tx) this.fragmentView).getKeyboardHeight());
                        jx jxVar5 = this.C0;
                        jxVar5.C0.clear();
                        jxVar5.L();
                    }
                    chat = this.Z2;
                    if (chat == null) {
                        ig.p0 p0Var = new ig.p0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
                        p0Var.f = this.Z2;
                        q3(p0Var);
                    } else if (this.W2 != 0 && ((twVar = this.G3) == null || !twVar.c())) {
                        q3(new ig.p0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
                    }
                }
            }
            z14 = false;
            jxVar4 = this.C0;
            if (jxVar4 != null) {
            }
            if (z14) {
            }
            this.s3 = z15;
            if (z15) {
            }
            t91Var = this.a0;
            if (t91Var != null) {
            }
            if (this.Z != null) {
                AndroidUtilities.removeFromParent(t91Var);
                this.a0 = null;
            }
            if (this.C0 != null) {
            }
            chat = this.Z2;
            if (chat == null) {
            }
        }
        if (z16 && (jxVar3 = this.C0) != null && jxVar3.d0.M()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z10 && (qwVar = this.E0) != null && this.G0) {
            qwVar.setVisibility(0);
        }
        Object[] objArr = SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(32768);
        if (z16) {
            if (z10) {
                jx jxVar6 = this.C0;
                if (jxVar6 != null) {
                    jxVar6.setVisibility(0);
                    jx jxVar7 = this.C0;
                    jxVar7.setPosition(0);
                    if (jxVar7.d0.h() > 0) {
                        jxVar7.e0.h1(0, 0);
                    }
                    s4.c0 c0Var = jxVar7.j0;
                    if (c0Var != null) {
                        c0Var.h1(0, 0);
                    }
                    s4.c0 c0Var2 = jxVar7.o0;
                    if (c0Var2 != null) {
                        c0Var2.h1(0, 0);
                    }
                    s4.c0 c0Var3 = jxVar7.v0;
                    if (c0Var3 != null) {
                        c0Var3.h1(0, 0);
                    }
                    jxVar7.h.clear();
                }
                f5(true, null, null, false, false);
                org.telegram.ui.Components.t91 t91Var2 = this.a0;
                if (t91Var2 != null) {
                    t91Var2.b(false, false);
                }
            } else {
                this.e0[0].a.setVisibility(0);
                this.e0[0].setVisibility(0);
            }
            I4(true, true);
            this.e0[0].a.setVerticalScrollBarEnabled(false);
            jx jxVar8 = this.C0;
            if (jxVar8 != null) {
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, jxVar8, getResourceProvider());
            }
            this.w1 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ay ayVar = this.e0[0];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(ayVar, (Property<ay, Float>) property, z10 ? 0.0f : 1.0f));
            if (objArr == true) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.e0[0], (Property<ay, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.e0[0], (Property<ay, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            tw twVar2 = this.G3;
            if (twVar2 != null) {
                twVar2.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.G3, (Property<tw, Float>) property, z10 ? 0.0f : 1.0f));
            }
            jx jxVar9 = this.C0;
            if (jxVar9 != null) {
                arrayList.add(ObjectAnimator.ofFloat(jxVar9, (Property<jx, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.K) {
                    float dp = AndroidUtilities.dp(81.0f) + this.N + AndroidUtilities.dp(48.0f);
                    jx jxVar10 = this.C0;
                    float f7 = z10 ? dp : 0.0f;
                    if (z10) {
                        dp = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(jxVar10, this.I3, f7, dp));
                }
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(this.C0, (Property<jx, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList.add(ObjectAnimator.ofFloat(this.C0, (Property<jx, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.g0 != null) {
                i5(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ev(this, 1));
            arrayList.add(ofFloat);
            this.w1.playTogether(arrayList);
            this.w1.setDuration(z10 ? 200L : 180L);
            this.w1.setInterpolator(org.telegram.ui.Components.ds.g);
            if (!z10) {
                this.w1.setStartDelay(20L);
            }
            this.w1.addListener(new zw(this, z10, i10));
            this.p3.lock();
            this.w1.start();
        } else {
            I4(false, true);
            if (z10) {
                this.e0[0].a.c1();
            } else {
                wx wxVar = this.e0[0].a;
                if (wxVar.g1) {
                    wxVar.g1 = false;
                    wxVar.K0(false);
                }
            }
            this.e0[0].setAlpha(z10 ? 0.0f : 1.0f);
            if (objArr == true) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                this.e0[0].setScaleX(z10 ? 0.95f : 1.0f);
                this.e0[0].setScaleY(z10 ? 0.95f : 1.0f);
            }
            jx jxVar11 = this.C0;
            if (jxVar11 != null) {
                jxVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    this.C0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.C0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.C0.setVisibility(z10 ? 0 : 8);
            }
            ox oxVar = this.X;
            if (oxVar != null) {
                oxVar.setTranslationY(e4() + (z10 ? -AndroidUtilities.dp(36.0f) : 0));
            }
            if (this.E0 != null) {
                if (!this.G0 || isInPreviewMode() || z10) {
                    this.E0.setVisibility(8);
                } else {
                    this.E0.setVisibility(0);
                }
            }
            L4(z10 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i12 = this.x;
        if (i12 >= 0 && (jxVar2 = this.C0) != null) {
            jxVar2.setPosition(jxVar2.N(i12));
        }
        if (!z10) {
            this.x = -1;
        }
        if (z10 && z11 && (jxVar = this.C0) != null) {
            jxVar.setPosition((jxVar.s0 ? 1 : 0) + 5);
            m5(true);
        }
        N3();
        c5();
    }

    public final void X3(long j10, boolean z10) {
        if (this.e0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            ay[] ayVarArr = this.e0;
            if (i10 >= ayVarArr.length) {
                return;
            }
            int childCount = ayVarArr[i10].a.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = this.e0[i10].a.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.p2) {
                        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                        if (p2Var.getDialogId() == j10) {
                            p2Var.U(z10, true);
                            break;
                        }
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    public final void X4() {
        int i10;
        int i11;
        if (this.M0 != null || SharedConfig.appLocked || (this.K && !this.E0.g())) {
            return;
        }
        t51[] t51VarArr = new t51[1];
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        org.telegram.ui.ActionBar.b6 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i10 = 0;
            i11 = 0;
        } else {
            this.E3.f();
            Drawable drawable = this.E3.f[0];
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
            i10 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.b(rect.centerX(), rect.centerY());
            }
            i11 = dp;
        }
        uw uwVar = new uw(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), t51VarArr);
        if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
            uwVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
        }
        Long l4 = this.C3;
        if (l4 != null) {
            uwVar.setSelected(l4);
        } else {
            Drawable drawable2 = this.E3.f[0];
            uwVar.setSelected(drawable2 instanceof org.telegram.ui.Components.t5 ? Long.valueOf(((org.telegram.ui.Components.t5) drawable2).i()) : null);
        }
        uwVar.setSaveState(1);
        uwVar.y(this.E3, titleTextView);
        vw vwVar = new vw(this, uwVar);
        this.M0 = vwVar;
        t51VarArr[0] = vwVar;
        vwVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
        t51VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0066, code lost:
    
        if (r13.G.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.r2, org.telegram.ui.cy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y4(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String formatString;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i10 = 2;
        int i11 = 1;
        String formatString2 = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, chat.title, UserObject.getFirstName(user));
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = formatString2;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, chat.title, UserObject.getFirstName(user)));
        Boolean bool = this.G.bot_participant;
        ?? r92 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().isInChatCached(chat, user)) {
            charSequence = r92;
        }
        if (this.G.bot_admin_rights == null) {
            formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotAdd, UserObject.getFirstName(user), chat.title);
        } else {
            int i12 = R.string.AreYouSureSendChatToBotAddRights;
            String firstName = UserObject.getFirstName(user);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.G.bot_admin_rights;
            int i13 = org.telegram.ui.Cells.v6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                d3.q(1, isChannelAndNotMegaGroup ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), arrayList);
            }
            if (tL_chatAdminRights.post_messages && isChannelAndNotMegaGroup) {
                d3.q(1, LocaleController.getString(R.string.EditAdminPostMessages), arrayList);
            }
            if (tL_chatAdminRights.edit_messages && isChannelAndNotMegaGroup) {
                d3.q(1, LocaleController.getString(R.string.EditAdminEditMessages), arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                d3.q(1, LocaleController.getString(isChannelAndNotMegaGroup ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), arrayList);
            }
            if (tL_chatAdminRights.ban_users && !isChannelAndNotMegaGroup) {
                d3.q(1, LocaleController.getString(R.string.EditAdminBanUsers), arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                d3.q(1, LocaleController.getString(R.string.EditAdminAddUsers), arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !isChannelAndNotMegaGroup) {
                d3.q(1, LocaleController.getString(R.string.EditAdminPinMessages), arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                d3.q(1, LocaleController.getString(R.string.EditAdminAddAdmins), arrayList);
            }
            if (tL_chatAdminRights.anonymous && !isChannelAndNotMegaGroup) {
                d3.q(1, LocaleController.getString(R.string.EditAdminSendAnonymously), arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                d3.q(1, LocaleController.getString(R.string.StartVoipChatPermission), arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !isChannelAndNotMegaGroup) {
                d3.q(1, LocaleController.getString(R.string.ManageTopicsPermission), arrayList);
            }
            if (arrayList.size() == 1) {
                r92 = ((org.telegram.ui.Cells.w6) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r92 = new SpannableStringBuilder();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    if (i14 > 0) {
                        r92.append(", ");
                    }
                    r92.append(((org.telegram.ui.Cells.w6) arrayList.get(i14)).b.toString().toLowerCase());
                }
            }
            formatString = LocaleController.formatString(i12, new Object[]{firstName, str, r92});
        }
        charSequence = TextUtils.concat("\n\n", AndroidUtilities.replaceTags(formatString));
        e2Var.T = TextUtils.concat(replaceTags, charSequence);
        alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new ff(i11, runnable));
        alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new ff(i10, runnable2));
        showDialog(e2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0232 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList Z3(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (z10 && (arrayList = this.R1) != null) {
            return arrayList;
        }
        MessagesController messagesController = AccountInstance.getInstance(i10).getMessagesController();
        if (i11 == 0) {
            return messagesController.getDialogs(i12);
        }
        if (i11 == 10 || i11 == 13) {
            return messagesController.dialogsServerOnly;
        }
        if (i11 == 2) {
            ArrayList arrayList2 = new ArrayList(messagesController.dialogsMyGroups.size() + messagesController.dialogsMyChannels.size() + messagesController.dialogsCanAddUsers.size() + 2);
            if (messagesController.dialogsMyChannels.size() > 0 && this.y2) {
                arrayList2.add(new vx(0));
                arrayList2.addAll(messagesController.dialogsMyChannels);
            }
            if (messagesController.dialogsMyGroups.size() > 0 && this.v2) {
                arrayList2.add(new vx(1));
                arrayList2.addAll(messagesController.dialogsMyGroups);
            }
            if (messagesController.dialogsCanAddUsers.size() > 0) {
                int size = messagesController.dialogsCanAddUsers.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.Dialog dialog = messagesController.dialogsCanAddUsers.get(i13);
                    if ((this.y2 && ChatObject.isChannelAndNotMegaGroup(-dialog.id, i10)) || (this.v2 && (ChatObject.isMegagroup(i10, -dialog.id) || !ChatObject.isChannel(-dialog.id, i10)))) {
                        if (r2) {
                            arrayList2.add(new vx(2));
                            r2 = false;
                        }
                        arrayList2.add(dialog);
                    }
                }
            }
            return arrayList2;
        }
        if (i11 == 3) {
            return messagesController.dialogsForward;
        }
        if (i11 == 4 || i11 == 12) {
            return messagesController.dialogsUsersOnly;
        }
        if (i11 == 5) {
            return messagesController.dialogsChannelsOnly;
        }
        if (i11 == 6 || i11 == 11) {
            return messagesController.dialogsGroupsOnly;
        }
        if (i11 == 7 || i11 == 8) {
            MessagesController.DialogFilter dialogFilter = messagesController.selectedDialogFilter[i11 != 7 ? 1 : 0];
            return dialogFilter == null ? messagesController.getDialogs(i12) : this.R0 == 3 ? dialogFilter.dialogsForward : dialogFilter.dialogs;
        }
        if (i11 == 9) {
            return messagesController.dialogsForBlock;
        }
        if (i11 != 1 && i11 != 16 && i11 != 14) {
            if (i11 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList3 = new ArrayList();
            TLRPC.User user = messagesController.getUser(Long.valueOf(this.H));
            TLRPC.RequestPeerType requestPeerType = this.G;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                ConcurrentHashMap<Long, TLRPC.User> users = messagesController.getUsers();
                ArrayList<TLRPC.Dialog> arrayList4 = messagesController.dialogsUsersOnly;
                int size2 = arrayList4.size();
                while (r1 < size2) {
                    TLRPC.Dialog dialog2 = arrayList4.get(r1);
                    r1++;
                    TLRPC.Dialog dialog3 = dialog2;
                    if (t4(getMessagesController().getUser(Long.valueOf(dialog3.id)))) {
                        arrayList3.add(dialog3);
                    }
                }
                for (TLRPC.User user2 : users.values()) {
                    if (user2 != null && !messagesController.dialogs_dict.d(user2.id) && t4(user2)) {
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_dialog.peer = tL_peerUser;
                        long j10 = user2.id;
                        tL_peerUser.user_id = j10;
                        tL_dialog.id = j10;
                        arrayList3.add(tL_dialog);
                    }
                }
            } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                ConcurrentHashMap<Long, TLRPC.Chat> chats = messagesController.getChats();
                ArrayList<TLRPC.Dialog> arrayList5 = this.G instanceof TLRPC.TL_requestPeerTypeChat ? messagesController.dialogsGroupsOnly : messagesController.dialogsChannelsOnly;
                int size3 = arrayList5.size();
                while (r1 < size3) {
                    TLRPC.Dialog dialog4 = arrayList5.get(r1);
                    r1++;
                    TLRPC.Dialog dialog5 = dialog4;
                    if (s4(getMessagesController().getChat(Long.valueOf(-dialog5.id)), user)) {
                        arrayList3.add(dialog5);
                    }
                }
                for (TLRPC.Chat chat : chats.values()) {
                    if (chat != null && !messagesController.dialogs_dict.d(-chat.id) && s4(chat, user)) {
                        TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_dialog2.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = chat.id;
                        } else {
                            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                            tL_dialog2.peer = tL_peerChat;
                            tL_peerChat.chat_id = chat.id;
                        }
                        tL_dialog2.id = -chat.id;
                        arrayList3.add(tL_dialog2);
                    }
                }
            }
            return arrayList3;
        }
        ArrayList arrayList6 = this.T3;
        if (arrayList6 != null) {
            return arrayList6;
        }
        this.T3 = new ArrayList();
        r2 = i11 == 16;
        if (this.z2 || this.A2 || r2) {
            ArrayList<TLRPC.Dialog> arrayList7 = messagesController.dialogsUsersOnly;
            int size4 = arrayList7.size();
            int i14 = 0;
            while (i14 < size4) {
                TLRPC.Dialog dialog6 = arrayList7.get(i14);
                i14++;
                TLRPC.Dialog dialog7 = dialog6;
                TLRPC.User user3 = messagesController.getUser(Long.valueOf(dialog7.id));
                if (user3 != null && !UserObject.isDeleted(user3)) {
                    if (!r2) {
                        if (user3.bot) {
                            if (this.A2) {
                                if (UserObject.isUserSelf(user3)) {
                                }
                            }
                        } else if (this.z2) {
                            if (UserObject.isUserSelf(user3)) {
                            }
                        }
                        this.T3.add(dialog7);
                    } else if (!UserObject.isService(user3.id) && !MessagesController.isSupportUser(user3)) {
                        this.T3.add(dialog7);
                    }
                }
            }
        }
        if (this.v2 || (((z11 = this.x2) && this.w2) || r2)) {
            ArrayList<TLRPC.Dialog> arrayList8 = messagesController.dialogsGroupsOnly;
            int size5 = arrayList8.size();
            int i15 = 0;
            while (i15 < size5) {
                TLRPC.Dialog dialog8 = arrayList8.get(i15);
                i15++;
                TLRPC.Dialog dialog9 = dialog8;
                TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-dialog9.id));
                if (chat2 != null && !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    if (r2) {
                        if (ChatObject.isMegagroup(chat2)) {
                            this.T3.add(dialog9);
                        }
                    } else if (messagesController.canAddToForward(dialog9)) {
                        this.T3.add(dialog9);
                    }
                }
            }
        } else if (z11 || this.w2 || r2) {
            ArrayList<TLRPC.Dialog> arrayList9 = messagesController.dialogsGroupsOnly;
            int size6 = arrayList9.size();
            int i16 = 0;
            while (i16 < size6) {
                TLRPC.Dialog dialog10 = arrayList9.get(i16);
                i16++;
                TLRPC.Dialog dialog11 = dialog10;
                TLRPC.Chat chat3 = messagesController.getChat(Long.valueOf(-dialog11.id));
                if (chat3 != null && !ChatObject.isChannelAndNotMegaGroup(chat3)) {
                    if (r2) {
                        if (ChatObject.isMegagroup(chat3)) {
                            this.T3.add(dialog11);
                        }
                    } else if (messagesController.canAddToForward(dialog11)) {
                        if (this.x2) {
                            if (!ChatObject.isMegagroup(chat3)) {
                                this.T3.add(dialog11);
                            }
                        }
                        if (this.w2 && ChatObject.isMegagroup(chat3)) {
                            this.T3.add(dialog11);
                        }
                    }
                }
            }
        }
        if (this.y2 || r2) {
            ArrayList<TLRPC.Dialog> arrayList10 = messagesController.dialogsChannelsOnly;
            int size7 = arrayList10.size();
            while (r1 < size7) {
                TLRPC.Dialog dialog12 = arrayList10.get(r1);
                r1++;
                TLRPC.Dialog dialog13 = dialog12;
                TLRPC.Chat chat4 = messagesController.getChat(Long.valueOf(-dialog13.id));
                if (r2) {
                    if (chat4 instanceof TLRPC.TL_channel) {
                        this.T3.add(dialog13);
                    }
                } else if (messagesController.canAddToForward(dialog13)) {
                    this.T3.add(dialog13);
                }
            }
        }
        getMessagesController().sortDialogsList(this.T3);
        return this.T3;
    }

    public final void Z4(boolean z10) {
        ay[] ayVarArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ayVarArr = this.e0;
            if (i11 >= ayVarArr.length) {
                break;
            }
            ayVarArr[i11].a.C0();
            i11++;
        }
        char c10 = (!z10 || ayVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i12 = ayVarArr[c10].h;
        if (i12 < 0 || i12 >= getMessagesController().getDialogFilters().size()) {
            return;
        }
        MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.e0[c10].h);
        if (dialogFilter.isDefault()) {
            ay ayVar = this.e0[c10];
            ayVar.s = this.R0;
            wx wxVar = ayVar.a;
            int i13 = wx.C3;
            wxVar.G1();
        } else {
            ay[] ayVarArr2 = this.e0;
            if (ayVarArr2[c10 ^ 1].s == 7) {
                ayVarArr2[c10].s = 8;
            } else {
                ayVarArr2[c10].s = 7;
            }
            ayVarArr2[c10].a.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.e0[c10].s == 8 ? 1 : 0);
        }
        ay[] ayVarArr3 = this.e0;
        if (ayVarArr3.length > 1) {
            ayVarArr3[1].E = dialogFilter.locked;
        }
        ay ayVar2 = ayVarArr3[c10];
        gw gwVar = ayVar2.d;
        gwVar.h = ayVar2.s;
        gwVar.l();
        ay ayVar3 = this.e0[c10];
        cw cwVar = ayVar3.c;
        if (ayVar3.s == 0 && h4() && this.e0[c10].v == 2) {
            i10 = 1;
        }
        cwVar.h1(i10, (int) this.N);
        z3(this.e0[c10]);
    }

    public final float a4(boolean z10) {
        return (z10 ? 1.0f - this.b.e : 1.0f) * (1.0f - d4()) * this.r.e;
    }

    public final void a5() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        n31 n31Var = this.Z;
        float measuredHeight = (n31Var == null || n31Var.getVisibility() == 8) ? 0.0f : this.Z.getMeasuredHeight();
        float dp = this.K ? AndroidUtilities.dp(81.0f) : 0.0f;
        if (this.K) {
            float f16 = this.N;
            float f17 = this.x1;
            f7 = (measuredHeight * f17) + c3.h0.z(1.0f, f17, dp, f16);
            f10 = this.x3;
        } else {
            f7 = (measuredHeight * this.x1) + this.N;
            f10 = this.x3;
        }
        float f18 = f7 + f10 + this.T;
        ox oxVar = this.X;
        float dp2 = AndroidUtilities.dp(4.0f) * ((oxVar == null || oxVar.getVisibility() != 0) ? 0.0f : this.X.getAlpha());
        qx qxVar = this.z0;
        if (qxVar != null) {
            qxVar.setTranslationY(f18 - dp2);
            f12 = this.z0.getAlpha();
            f13 = AndroidUtilities.dp(43.0f) * f12;
            f11 = f18 + f13;
        } else {
            f11 = f18;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        org.telegram.ui.Components.ws wsVar = this.J1;
        if (wsVar != null) {
            wsVar.setTranslationY(AndroidUtilities.lerp(f11 - dp2, (-AndroidUtilities.dp(3.0f)) - (this.a0 == null ? AndroidUtilities.dp(44.0f) : 0), this.b.e));
            f14 = this.J1.getMetadata().c.a;
            f15 = this.J1.c(0.0f);
        } else {
            f14 = 0.0f;
            f15 = 0.0f;
        }
        org.telegram.ui.Components.vs vsVar = this.K1;
        if (vsVar != null) {
            vsVar.setTranslationY(f18 - dp2);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f14, f12));
            org.telegram.ui.Components.vs vsVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f15 + f13) - lerp);
            Matrix matrix = vsVar2.b;
            if (vsVar2.e != lerp || vsVar2.f != min) {
                vsVar2.e = lerp;
                vsVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = vsVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                vsVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f12, f14));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ik));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.hk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.mk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.lk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.kk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.jk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.il));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.zj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G8));
    }

    public final int b4() {
        if (!this.K) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x03de, code lost:
    
        if (r1.isEmpty() == false) goto L220;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b5(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        qx qxVar;
        org.telegram.ui.Components.p00 d;
        long j10;
        TLRPC.User user;
        this.V2 = false;
        this.T2 = 0;
        this.Q2 = 0;
        this.P2 = 0;
        this.O2 = 0;
        this.N2 = 0;
        this.U2 = 0;
        this.R2 = 0;
        this.S2 = 0;
        if (z10) {
            return;
        }
        ArrayList arrayList = this.I2;
        int size = arrayList.size();
        long clientUserId = getUserConfig().getClientUserId();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i10 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(((Long) arrayList.get(i10)).longValue());
            if (dialog == null) {
                j10 = clientUserId;
            } else {
                long j11 = dialog.id;
                boolean o42 = o4(dialog);
                j10 = clientUserId;
                boolean z12 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().isForum(j11)) {
                    this.U2++;
                }
                int i17 = i14;
                int i18 = i15;
                if (getMessagesController().isDialogMuted(j11, 0L)) {
                    this.Q2++;
                } else {
                    this.P2++;
                }
                if (z12) {
                    this.N2++;
                }
                if (this.W2 == 1 || dialog.folder_id == 1) {
                    this.T2++;
                } else if (j11 != j10 && dialog.community_id == 0 && j11 != 777000 && !getMessagesController().isPromoDialog(j11, false)) {
                    i14 = i17 + 1;
                    if (dialog.community_id != 0) {
                        i12++;
                    }
                    if (DialogObject.isUserDialog(j11) || j11 == j10 || j11 == UserObject.VERIFY || MessagesController.isSupportUser(getMessagesController().getUser(Long.valueOf(j11)))) {
                        i16++;
                    } else if (org.telegram.messenger.t.x("dialog_bar_report", j11, notificationsSettings, true)) {
                        this.S2++;
                    }
                    if (DialogObject.isChannel(dialog)) {
                        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
                        if (isChatDialog) {
                            getMessagesController().getChat(Long.valueOf(-dialog.id));
                        }
                        if (DialogObject.isEncryptedDialog(dialog.id)) {
                            TLRPC.EncryptedChat m10 = org.telegram.messenger.t.m(getMessagesController(), dialog.id);
                            user = m10 != null ? getMessagesController().getUser(Long.valueOf(m10.user_id)) : new TLRPC.TL_userEmpty();
                        } else {
                            user = (isChatDialog || !DialogObject.isUserDialog(dialog.id)) ? null : getMessagesController().getUser(Long.valueOf(dialog.id));
                        }
                        if (user != null && user.bot) {
                            MessagesController.isSupportUser(user);
                        }
                        if (o42) {
                            i15 = i18 + 1;
                        } else {
                            this.O2++;
                            i15 = i18;
                        }
                    } else {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j11));
                        if (getMessagesController().isPromoDialog(dialog.id, true)) {
                            this.R2++;
                            if (getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                i11++;
                                this.V2 = true;
                            }
                            i15 = i18;
                        } else {
                            if (o42) {
                                i15 = i18 + 1;
                            } else {
                                this.O2++;
                                i15 = i18;
                            }
                            if (chat == null || !chat.megagroup) {
                                this.R2++;
                            } else if (ChatObject.isPublic(chat)) {
                                this.R2++;
                            }
                            i11++;
                        }
                    }
                    i13++;
                    i11++;
                }
                i14 = i17;
                if (dialog.community_id != 0) {
                }
                if (DialogObject.isUserDialog(j11)) {
                }
                i16++;
                if (DialogObject.isChannel(dialog)) {
                }
                i13++;
                i11++;
            }
            i10++;
            clientUserId = j10;
        }
        int i19 = i14;
        int i20 = i15;
        org.telegram.ui.ActionBar.w0 w0Var3 = this.j1;
        if (w0Var3 != null) {
            if (i11 != size || i12 > 0) {
                w0Var3.setVisibility(8);
            } else {
                w0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = this.r1;
        if (g1Var2 != null) {
            int i21 = this.R2;
            if ((i21 == 0 || i21 == size) && ((i13 == 0 || i13 == size) && i12 <= 0)) {
                g1Var2.setVisibility(0);
                if (this.R2 != 0) {
                    this.r1.setText(LocaleController.getString(R.string.ClearHistoryCache));
                } else {
                    this.r1.setText(LocaleController.getString(R.string.ClearHistory));
                }
            } else {
                g1Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.q1;
        if (g1Var3 != null && this.m1 != null) {
            if (this.T2 != 0 && i12 == 0 && this.Y2 == 0) {
                String string = LocaleController.getString(R.string.Unarchive);
                this.q1.j(string, R.drawable.msg_unarchive, null);
                this.m1.setIcon(R.drawable.msg_unarchive);
                this.m1.setContentDescription(string);
                qx qxVar2 = this.z0;
                if (qxVar2 == null || qxVar2.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else if (i19 != 0 && i12 == 0 && this.Y2 == 0) {
                String string2 = LocaleController.getString(R.string.Archive);
                this.q1.j(string2, R.drawable.msg_archive, null);
                this.m1.setIcon(R.drawable.msg_archive);
                this.m1.setContentDescription(string2);
                qx qxVar3 = this.z0;
                if (qxVar3 == null || qxVar3.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else {
                g1Var3.setVisibility(8);
                this.m1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var4 = this.k1;
        if (w0Var4 != null && this.n1 != null) {
            if (this.O2 + i20 == size && this.Y2 == 0) {
                qx qxVar4 = this.z0;
                if (qxVar4 == null || qxVar4.getVisibility() != 0) {
                    this.k1.setVisibility(0);
                    this.n1.setVisibility(8);
                } else {
                    this.n1.setVisibility(0);
                    this.k1.setVisibility(8);
                }
            } else {
                w0Var4.setVisibility(8);
                this.n1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.t1;
        if (g1Var4 != null) {
            if (i16 != 0) {
                g1Var4.setVisibility(8);
            } else {
                g1Var4.setVisibility(0);
            }
        }
        if (this.p1 != null) {
            qx qxVar5 = this.z0;
            boolean z13 = qxVar5 == null || qxVar5.getVisibility() != 0 || ((d = (qxVar = this.z0).d()) != null && d.a == qxVar.L);
            if (!z13) {
                try {
                    z13 = size >= Z3(this.currentAccount, this.e0[0].d.h, this.W2, this.S1).size();
                } catch (Exception unused) {
                }
            }
            if (!z13) {
                z11 = false;
                this.p1.setVisibility(0);
                if (this.o1 != null) {
                    if (this.W2 != 1) {
                        if (this.z0 != null && a4(z11) > 0.5f) {
                            qx qxVar6 = this.z0;
                            org.telegram.ui.Components.p00 d10 = qxVar6.d();
                            if (d10 != null && d10.a == qxVar6.L) {
                                int i22 = org.telegram.ui.Components.v00.x;
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList<MessagesController.DialogFilter> arrayList3 = getMessagesController().dialogFilters;
                                int size2 = arrayList3.size();
                                for (int i23 = 0; i23 < size2; i23++) {
                                    MessagesController.DialogFilter dialogFilter = arrayList3.get(i23);
                                    if (!org.telegram.ui.Components.v00.I(this, dialogFilter, arrayList, true, true).isEmpty() && !dialogFilter.isDefault()) {
                                        arrayList2.add(dialogFilter);
                                    }
                                }
                            }
                        }
                        this.o1.setVisibility(8);
                    }
                    this.o1.setVisibility(0);
                }
                w0Var = this.l1;
                if (w0Var != null) {
                    if (this.Q2 != 0) {
                        w0Var.setIcon(R.drawable.msg_unmute);
                        this.l1.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    } else {
                        w0Var.setIcon(R.drawable.msg_mute);
                        this.l1.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                    }
                }
                g1Var = this.s1;
                if (g1Var != null) {
                    if (this.N2 != 0) {
                        g1Var.j(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                        this.s1.setVisibility(0);
                    } else if (this.U2 == 0 && i12 == 0) {
                        g1Var.j(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
                        this.s1.setVisibility(0);
                    } else {
                        g1Var.setVisibility(8);
                    }
                }
                w0Var2 = this.k1;
                if (w0Var2 != null || this.n1 == null) {
                }
                if (this.O2 != 0) {
                    w0Var2.setIcon(R.drawable.msg_pin);
                    this.k1.setContentDescription(LocaleController.getString(R.string.PinToTop));
                    this.n1.setText(LocaleController.getString(R.string.DialogPin));
                    return;
                } else {
                    w0Var2.setIcon(R.drawable.msg_unpin);
                    this.k1.setContentDescription(LocaleController.getString(R.string.UnpinFromTop));
                    this.n1.setText(LocaleController.getString(R.string.DialogUnpin));
                    return;
                }
            }
            this.p1.setVisibility(8);
        }
        z11 = false;
        if (this.o1 != null) {
        }
        w0Var = this.l1;
        if (w0Var != null) {
        }
        g1Var = this.s1;
        if (g1Var != null) {
        }
        w0Var2 = this.k1;
        if (w0Var2 != null) {
        }
    }

    public final int c4() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0699  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c5() {
        long j10;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        ApplicationLoader applicationLoader;
        boolean z13;
        String next;
        StringBuilder sb2;
        final long j11;
        final long j12;
        boolean z14;
        tw twVar;
        boolean z15;
        tw twVar2;
        if (this.J1 == null || this.M1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.x2 x2Var = this.M1;
        final int i10 = 0;
        if (x2Var != null) {
            try {
                ((org.telegram.ui.Components.xj0) ((org.telegram.ui.Components.j9) x2Var.h.getImageReceiver().getStaticThumb()).K).R(null);
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.x2 x2Var2 = this.M1;
            x2Var2.setCompact(false);
            x2Var2.a(UserConfig.selectedAccount, null);
            org.telegram.ui.Components.y9 y9Var = x2Var2.h;
            y9Var.setVisibility(8);
            y9Var.b();
        }
        long j13 = 0;
        final int i11 = 1;
        if (isInPreviewMode()) {
            str = null;
            z12 = false;
        } else {
            if (getMessagesController().isFrozen()) {
                this.M1.setOnClickListener(new hv(this, 12));
                this.M1.c(LocaleController.getString(R.string.AccountFrozenAlertTitle), LocaleController.getString(R.string.AccountFrozenAlertSubtitle), false, true);
            } else {
                int i12 = 5;
                if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().pendingSuggestions.contains("SETUP_PASSKEY")) {
                    this.M1.setOnClickListener(new hv(this, 19));
                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.PasskeyPopupTitle), this.M1.c, new sv(this, i12)), LocaleController.getString(R.string.PasskeyPopupText));
                    this.M1.setOnCloseListener(new hv(this, 25));
                } else if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().pendingSuggestions.contains("PREMIUM_GRACE")) {
                    this.M1.setOnClickListener(new hv(this, 26));
                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.GraceTitle), this.M1.c, new sv(this, i12)), LocaleController.getString(R.string.GraceMessage));
                    this.M1.setOnCloseListener(new hv(this, 27));
                } else if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().customPendingSuggestion != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().customPendingSuggestion;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true);
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.M1.c.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.title.entities, this.M1.c.getPaint().getFontMetricsInt());
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true);
                    this.M1.b(replaceAnimatedEmoji, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.M1.d.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.description.entities, this.M1.d.getPaint().getFontMetricsInt()));
                    this.M1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wv
                        public final /* synthetic */ cy b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    qf.d.r(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    cy.V(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.M1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wv
                        public final /* synthetic */ cy b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    qf.d.r(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    cy.V(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.W2 == 0 && this.Y2 == 0 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        bi.ca y3 = bi.ca.y(this.currentAccount, false);
                        ArrayList arrayList = y3.z;
                        if (!arrayList.isEmpty()) {
                            long j14 = -y3.f.amount;
                            int i13 = 0;
                            while (i13 < arrayList.size()) {
                                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i13);
                                long j15 = j13;
                                long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
                                if (peerDialogId >= j15) {
                                    if (getMessagesController().getUser(Long.valueOf(peerDialogId)) == null) {
                                        i13++;
                                        j13 = j15;
                                    }
                                    j14 += starsSubscription.pricing.amount;
                                    i13++;
                                    j13 = j15;
                                } else {
                                    if (getMessagesController().getChat(Long.valueOf(-peerDialogId)) == null) {
                                        i13++;
                                        j13 = j15;
                                    }
                                    j14 += starsSubscription.pricing.amount;
                                    i13++;
                                    j13 = j15;
                                }
                            }
                            j10 = j13;
                            if (j14 > j10) {
                                bi.ca y10 = bi.ca.y(this.currentAccount, false);
                                ArrayList arrayList2 = y10.z;
                                StringBuilder sb3 = new StringBuilder();
                                if (arrayList2.isEmpty()) {
                                    sb2 = sb3;
                                    j11 = j10;
                                    j12 = j11;
                                } else {
                                    int i14 = 0;
                                    long j16 = j10;
                                    j12 = j16;
                                    while (i14 < arrayList2.size()) {
                                        TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i14);
                                        int i15 = i10;
                                        long peerDialogId2 = DialogObject.getPeerDialogId(starsSubscription2.peer);
                                        if (j12 == j10) {
                                            j12 = peerDialogId2;
                                        }
                                        if (peerDialogId2 >= j10) {
                                            TLRPC.User user = getMessagesController().getUser(Long.valueOf(peerDialogId2));
                                            if (user != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(UserObject.getUserName(user));
                                                j16 += starsSubscription2.pricing.amount;
                                                i14++;
                                                i10 = i15;
                                            } else {
                                                i14++;
                                                i10 = i15;
                                            }
                                        } else {
                                            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-peerDialogId2));
                                            if (chat != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(chat.title);
                                                j16 += starsSubscription2.pricing.amount;
                                                i14++;
                                                i10 = i15;
                                            } else {
                                                i14++;
                                                i10 = i15;
                                            }
                                        }
                                    }
                                    sb2 = sb3;
                                    j11 = j16;
                                }
                                boolean z16 = i10;
                                final String sb4 = sb2.toString();
                                this.M1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.xv
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        cy cyVar = cy.this;
                                        new bi.tc(cyVar.getParentActivity(), cyVar.getResourceProvider(), j11, 2, sb4, new cv(cyVar, 16), j12).show();
                                    }
                                });
                                org.telegram.ui.Cells.x2 x2Var3 = this.M1;
                                long j17 = j11 - y10.f.amount;
                                if (j17 > j10) {
                                    j11 = j17;
                                }
                                Object[] objArr = new Object[1];
                                objArr[z16 ? 1 : 0] = sb4;
                                x2Var3.b(bi.dd.W0(z16, LocaleController.formatPluralStringComma("StarsSubscriptionExpiredHintTitle2", (int) j11, objArr), 0.72f, null), LocaleController.getString(R.string.StarsSubscriptionExpiredHintText));
                                this.M1.setOnCloseListener(new hv(this, 13));
                                z12 = true;
                                str = null;
                            }
                            int i16 = 15;
                            if (this.W2 == 0 || this.Y2 != j10 || getMessagesController().premiumPurchaseBlocked() || !BirthdayController.getInstance(this.currentAccount).contains() || getMessagesController().dismissedSuggestions.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                int i17 = 16;
                                if (this.W2 != 0 && this.Y2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("BIRTHDAY_SETUP") && getMessagesController().getUserFull(getUserConfig().getClientUserId()) != null && getMessagesController().getUserFull(getUserConfig().getClientUserId()).birthday == null) {
                                    ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
                                    this.M1.setOnClickListener(new hv(this, i16));
                                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.BirthdaySetupTitle), this.M1.c, new sv(this, i12)), LocaleController.formatString(R.string.BirthdaySetupMessage, new Object[0]));
                                    this.M1.setOnCloseListener(new hv(this, i17));
                                } else {
                                    int i18 = 18;
                                    if ((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.W2 == 0 && this.Y2 == j10) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false) {
                                        if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.W2 == 0 && this.Y2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_RESTORE") && !getUserConfig().isPremium() && MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null) {
                                            this.M1.setOnClickListener(new hv(this, i18));
                                            this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.y6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                        } else {
                                            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.W2 != 0 || this.Y2 != j10 || ((!(MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE") && getUserConfig().isPremium()) && (!MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_ANNUAL") || getUserConfig().isPremium())) || (!UserConfig.getInstance(this.currentAccount).isPremium() ? MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null : !(BuildVars.useInvoiceBilling() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(true) == null)))) {
                                                z10 = false;
                                            } else {
                                                this.B3 = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE");
                                                z10 = true;
                                            }
                                            if (z10) {
                                                this.M1.setOnClickListener(new hv(this, 20));
                                                this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(this.B3 ? R.string.SaveOnAnnualPremiumTitle : R.string.UpgradePremiumTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.y6.I6, 2, null), LocaleController.getString(this.B3 ? R.string.UpgradePremiumMessage : R.string.SaveOnAnnualPremiumMessage));
                                            } else {
                                                if (this.O1 != null && this.P1 != null) {
                                                    if (r0.longValue() / this.P1.longValue() < 0.3f) {
                                                        MessagesController.getGlobalMainSettings().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                                    } else if (System.currentTimeMillis() > MessagesController.getGlobalMainSettings().getLong("cache_hint_showafter", j10)) {
                                                        z11 = true;
                                                        int i19 = 21;
                                                        if (!z11) {
                                                            this.M1.setOnClickListener(new hv(this, i19));
                                                            this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.O1.longValue())), org.telegram.ui.ActionBar.y6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                        } else if (this.W2 == 0 && this.Y2 == 0 && getUserConfig().getCurrentUser() != null && ((getUserConfig().getCurrentUser().photo == null || (getUserConfig().getCurrentUser().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("USERPIC_SETUP"))) {
                                                            this.M1.setOnClickListener(new hv(this, 22));
                                                            this.M1.h.setVisibility(0);
                                                            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                                                            j9Var.setBounds(0, 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
                                                            long clientUserId = getUserConfig().getClientUserId();
                                                            j9Var.A = true;
                                                            j9Var.b = true;
                                                            j9Var.c = false;
                                                            int i20 = org.telegram.ui.ActionBar.y6.p8[org.telegram.ui.Components.j9.e(clientUserId)];
                                                            org.telegram.ui.ActionBar.u6 u6Var = j9Var.z;
                                                            j9Var.d = org.telegram.ui.ActionBar.y6.w0(i20, u6Var);
                                                            j9Var.e = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.q8[org.telegram.ui.Components.j9.e(clientUserId)], u6Var);
                                                            j9Var.n = 0;
                                                            j9Var.m = false;
                                                            org.telegram.ui.Components.j9.a("", "", "", j9Var.q);
                                                            j9Var.K = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                            this.M1.h.setImageDrawable(j9Var);
                                                            this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.HintAddYourPhoto), this.M1.c, new sv(this, i12)), LocaleController.getString(R.string.HintAddYourPhotoText));
                                                            this.M1.setOnCloseListener(new hv(this, 23));
                                                        } else {
                                                            if (this.W2 == 0 && this.Y2 == 0 && (applicationLoader = ApplicationLoader.applicationLoaderInstance) != null) {
                                                                CharSequence[] charSequenceArr = new CharSequence[2];
                                                                boolean[] zArr = new boolean[1];
                                                                if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                                    z13 = true;
                                                                } else {
                                                                    Iterator<String> it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                                    while (it.hasNext()) {
                                                                        next = it.next();
                                                                        if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                            z13 = true;
                                                                            break;
                                                                        }
                                                                    }
                                                                    z13 = false;
                                                                }
                                                                next = null;
                                                                if (z13) {
                                                                    this.M1.setOnClickListener(new a(next, i19));
                                                                    org.telegram.ui.Cells.x2 x2Var4 = this.M1;
                                                                    CharSequence charSequence = charSequenceArr[0];
                                                                    if (charSequence instanceof String) {
                                                                        str = null;
                                                                        charSequence = AndroidUtilities.replaceSingleTag(((String) charSequence).toString(), org.telegram.ui.ActionBar.y6.I6, 2, null);
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    CharSequence charSequence2 = charSequenceArr[1];
                                                                    if (charSequence2 instanceof String) {
                                                                        charSequence2 = AndroidUtilities.replaceTags(((String) charSequence2).toString());
                                                                    }
                                                                    x2Var4.b(charSequence, charSequence2);
                                                                    if (zArr[0] && next != null) {
                                                                        this.M1.setOnCloseListener(new org.telegram.ui.Components.k51(i17, this, next));
                                                                    }
                                                                    z12 = true;
                                                                }
                                                            }
                                                            str = null;
                                                            z12 = false;
                                                        }
                                                    }
                                                }
                                                z11 = false;
                                                int i192 = 21;
                                                if (!z11) {
                                                }
                                            }
                                        }
                                    } else {
                                        this.M1.setOnClickListener(new bh.f(i18));
                                        this.M1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.y6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                        this.M1.setOnCloseListener(new hv(this, 17));
                                    }
                                }
                            } else {
                                BirthdayController.BirthdayState state = BirthdayController.getInstance(this.currentAccount).getState();
                                ArrayList<TLRPC.User> arrayList3 = state.today;
                                this.M1.setOnClickListener(new org.telegram.ui.Components.k51(i16, this, state));
                                this.M1.a(this.currentAccount, arrayList3);
                                this.M1.b(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceSingleTag(arrayList3.size() == 1 ? LocaleController.formatString(R.string.BirthdayTodaySingleTitle, UserObject.getForcedFirstName(arrayList3.get(0))) : LocaleController.formatPluralString("BirthdayTodayMultipleTitle", arrayList3.size(), new Object[0]), org.telegram.ui.ActionBar.y6.I6, 2, null), this.M1.c, new sv(this, i12)), LocaleController.formatString(arrayList3.size() == 1 ? R.string.BirthdayTodaySingleMessage2 : R.string.BirthdayTodayMultipleMessage2, new Object[0]));
                                this.M1.setOnCloseListener(new hv(this, 14));
                                bi.ca.y(this.currentAccount, false).V();
                            }
                            z12 = true;
                            str = null;
                        } else if (!y3.A) {
                            y3.A = true;
                            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                            tL_getStarsSubscriptions.missing_balance = true;
                            tL_getStarsSubscriptions.offset = "";
                            ConnectionsManager.getInstance(y3.a).sendRequest(tL_getStarsSubscriptions, new bi.q8(y3, i10));
                        }
                    }
                    j10 = 0;
                    int i162 = 15;
                    if (this.W2 == 0) {
                    }
                    int i172 = 16;
                    if (this.W2 != 0) {
                    }
                    int i182 = 18;
                    if ((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.W2 == 0 && this.Y2 == j10) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false) {
                    }
                    z12 = true;
                    str = null;
                }
            }
            str = null;
            z12 = true;
        }
        tw twVar3 = this.G3;
        oe.b bVar = this.b;
        if ((twVar3 != null && twVar3.c()) || bVar.f) {
            z12 = false;
        }
        this.J1.i(this.M1, z12, true);
        y3(true);
        if (this.fragmentView == null || this.J1 == null) {
            z14 = false;
        } else {
            boolean z17 = !isInPreviewMode() && this.W2 == 0 && this.Y2 == 0 && this.R0 == 0 && !getMessagesController().getUnconfirmedAuthController().auths.isEmpty() && ((twVar2 = this.G3) == null || !twVar2.c()) && !bVar.f;
            if (z17) {
                if (this.N1 == null) {
                    org.telegram.ui.Cells.xa xaVar = new org.telegram.ui.Cells.xa(getParentActivity());
                    this.N1 = xaVar;
                    this.J1.addView(xaVar);
                }
                org.telegram.ui.Cells.xa xaVar2 = this.N1;
                int i21 = this.currentAccount;
                TextView textView = xaVar2.b;
                TextView textView2 = xaVar2.c;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList4 = MessagesController.getInstance(i21).getUnconfirmedAuthController().auths;
                org.telegram.ui.Cells.wa waVar = xaVar2.d;
                waVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
                waVar.a(false, false);
                org.telegram.ui.Cells.wa waVar2 = xaVar2.e;
                waVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
                waVar2.a(false, false);
                if (arrayList4 == null || arrayList4.size() != 1) {
                    if (arrayList4 == null || arrayList4.size() <= 1) {
                        z14 = false;
                    } else {
                        textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
                        String str2 = arrayList4.get(0).location;
                        int i22 = 1;
                        while (true) {
                            if (i22 >= arrayList4.size()) {
                                break;
                            }
                            if (!TextUtils.equals(str2, arrayList4.get(i22).location)) {
                                str2 = str;
                                break;
                            }
                            i22++;
                        }
                        if (str2 == null) {
                            z14 = false;
                            textView2.setText(LocaleController.formatPluralString("UnconfirmedAuthMultiple", arrayList4.size(), new Object[0]));
                        } else {
                            z14 = false;
                            textView2.setText(LocaleController.formatPluralString("UnconfirmedAuthMultipleFrom", arrayList4.size(), str2));
                        }
                    }
                    z15 = z14;
                } else {
                    UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth = arrayList4.get(0);
                    textView.setText(LocaleController.getString(unconfirmedAuth.bot ? R.string.UnconfirmedAuthTitleBot : R.string.UnconfirmedAuthTitle));
                    String str3 = "" + unconfirmedAuth.device;
                    if (!TextUtils.isEmpty(unconfirmedAuth.location) && !str3.isEmpty()) {
                        str3 = str3.concat(", ");
                    }
                    StringBuilder u10 = a1.g.u(str3);
                    u10.append(unconfirmedAuth.location);
                    String sb5 = u10.toString();
                    if (unconfirmedAuth.bot) {
                        textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingleBot, "@" + DialogObject.getShortName(unconfirmedAuth.bot_id), sb5));
                        z15 = true;
                    } else {
                        textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingle, sb5));
                        z15 = false;
                    }
                    z14 = false;
                }
                waVar.setOnClickListener(new org.telegram.ui.Cells.va(this, z15, i21, arrayList4));
                waVar2.setOnClickListener(new bi.pa(xaVar2, i21, arrayList4, 2));
            } else {
                z14 = false;
            }
            org.telegram.ui.Cells.xa xaVar3 = this.N1;
            if (xaVar3 != null) {
                this.J1.i(xaVar3, z17, true);
            }
        }
        if (this.fragmentView == null || this.J1 == null) {
            return;
        }
        boolean z18 = (!isInPreviewMode() && this.W2 == 0 && this.Y2 == 0 && this.R0 == 0 && getGiftAuctionsController().hasActiveAuctions() && ((twVar = this.G3) == null || !twVar.c()) && !bVar.f) ? true : z14;
        if (z18 && this.L1 == null) {
            org.telegram.ui.Cells.m mVar = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
            this.L1 = mVar;
            this.J1.addView(mVar);
        }
        org.telegram.ui.Cells.m mVar2 = this.L1;
        if (mVar2 != null) {
            this.J1.i(mVar2, z18, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean canBeginSlide() {
        qx qxVar;
        if (this.G3.c()) {
            return false;
        }
        return this.R0 != 3 || (qxVar = this.z0) == null || qxVar.getVisibility() != 0 || this.z0.K <= 0;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean closeLastFragment() {
        if (!this.G3.c()) {
            return super.closeLastFragment();
        }
        this.G3.a();
        jx jxVar = this.C0;
        if (jxVar == null) {
            return true;
        }
        jxVar.S();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.b8 b8Var = new org.telegram.ui.Components.b8(this, context, this.resourceProvider, 3);
        b8Var.setAllowOverlayTitle(true);
        b8Var.G0 = true;
        if (b8Var.F0 == null) {
            di.i4 i4Var = new di.i4(b8Var.getContext(), 5);
            b8Var.F0 = i4Var;
            b8Var.addView(i4Var);
        }
        org.telegram.ui.ActionBar.f7.m(b8Var, 3, org.telegram.ui.ActionBar.y6.t8, getResourceProvider());
        org.telegram.ui.ActionBar.f7.a(b8Var, org.telegram.ui.ActionBar.y6.z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.f7.m(b8Var, 1, org.telegram.ui.ActionBar.y6.v8, getResourceProvider());
        org.telegram.ui.ActionBar.f7.b(b8Var, org.telegram.ui.ActionBar.y6.y8, getResourceProvider(), true);
        if (b8Var.p1 == null) {
            di.k kVar = new di.k(b8Var, b8Var.getContext(), b8Var.J0, b8Var.O0);
            b8Var.p1 = kVar;
            kVar.setClipChildren(false);
            b8Var.addView(b8Var.p1);
        }
        b8Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        b8Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.W2 == 0 || m4())) {
            return b8Var;
        }
        b8Var.setOccupyStatusBar(false);
        return b8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0c34  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c77  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0ce4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0cfa  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0d23  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0dda  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0e34  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e6c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0df4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0caa  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r14v6, types: [org.telegram.ui.Components.mm0, org.telegram.ui.wx] */
    /* JADX WARN: Type inference failed for: r6v20, types: [org.telegram.ui.Components.mm0, org.telegram.ui.wx] */
    /* JADX WARN: Type inference failed for: r6v21, types: [org.telegram.ui.Components.mm0, org.telegram.ui.wx] */
    /* JADX WARN: Type inference failed for: r6v22, types: [androidx.recyclerview.widget.RecyclerView, org.telegram.ui.wx] */
    /* JADX WARN: Type inference failed for: r6v26, types: [org.telegram.ui.Components.mm0, org.telegram.ui.wx] */
    /* JADX WARN: Type inference failed for: r6v27, types: [org.telegram.ui.Components.mm0, org.telegram.ui.wx] */
    /* JADX WARN: Type inference failed for: r6v29, types: [org.telegram.ui.cw, s4.c0] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v37, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        long j10;
        float f7;
        ch.b bVar;
        un unVar;
        qx qxVar;
        ox oxVar;
        ox oxVar2;
        org.telegram.ui.Components.ws wsVar;
        zx zxVar;
        s4.z zVar;
        ig.n nVar;
        ig.n nVar2;
        ig.n nVar3;
        ig.n nVar4;
        ig.n nVar5;
        ig.n nVar6;
        ux uxVar;
        int i10;
        int i11;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r92;
        Context context2 = context;
        ?? r11 = 0;
        this.j2 = false;
        this.k2 = false;
        this.V = false;
        this.V0 = null;
        this.z0 = null;
        ArrayList arrayList = this.I2;
        arrayList.clear();
        this.l3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        AndroidUtilities.runOnUIThread(new av(context2, 0));
        this.N1 = null;
        this.L1 = null;
        this.M1 = null;
        this.Q1 = null;
        this.J1 = null;
        org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
        l4.setTranslationX(-AndroidUtilities.dp(5.0f));
        org.telegram.ui.ActionBar.w0 a2 = l4.a(0, R.drawable.outline_header_search);
        a2.N();
        this.j0 = a2;
        a2.setOnClickListener(new hv(this, 1));
        if (this.R0 == 2 || (m4() && Z3(this.currentAccount, this.R0, this.W2, false).isEmpty())) {
            this.j0.setVisibility(8);
        }
        this.j0.setVisibility(8);
        float f10 = 0.0f;
        int i12 = 3;
        ?? r82 = 1;
        if (!this.l2 && this.n2 == null && this.W2 == 0 && this.Y2 == 0) {
            int i13 = org.telegram.ui.ActionBar.y6.t8;
            int themedColor = getThemedColor(i13);
            j10 = 0;
            int i14 = org.telegram.ui.ActionBar.y6.v8;
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context2, themedColor, getThemedColor(i14));
            this.m0 = w0Var;
            w0Var.setText(LocaleController.getString(R.string.Done).toUpperCase());
            if (this.m0.getTextView() != null) {
                org.telegram.ui.ActionBar.f7.V(this.m0.getTextView(), i14, getResourceProvider());
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.m0;
            org.telegram.ui.ActionBar.f7.R(w0Var2, w0Var2.getBackground(), null, org.telegram.ui.ActionBar.f7.N(i13), getResourceProvider());
            this.actionBar.addView(this.m0, org.telegram.ui.Components.gb1.h(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.m0.setOnClickListener(new hv(this, 8));
            this.m0.setAlpha(0.0f);
            this.m0.setVisibility(8);
            this.n0 = new org.telegram.ui.Components.ej0(context2);
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(context2, this.resourceProvider, false, true);
            this.o0 = g1Var;
            g1Var.setItemHeight(56);
            this.o0.j(LocaleController.getString(R.string.MenuProxyTitle), 0, this.n0);
            this.o0.setContentDescription(LocaleController.getString(R.string.ProxySettings));
            org.telegram.ui.ActionBar.w0 a10 = l4.a(1, R.drawable.outline_header_lock_24);
            this.f0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrPasscodeLock));
            org.telegram.ui.ActionBar.w0 d = l4.d(3, new ColorDrawable(0));
            this.g0 = d;
            ey eyVar = new ey(context2, this.currentAccount);
            this.h0 = eyVar;
            d.addView(eyVar);
            this.g0.setContentDescription(LocaleController.getString(R.string.DownloadsTabs));
            this.g0.setVisibility(8);
            i5(false, false);
        } else {
            j10 = 0;
        }
        ox oxVar3 = new ox(context2, this.resourceProvider);
        this.X = oxVar3;
        oxVar3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.w0 a11 = l4.a(-47, R.drawable.avd_speed);
            this.l0 = a11;
            AndroidUtilities.removeFromParent(a11);
            this.l0.setOnClickListener(new hv(this, 9));
            this.X.a(this.l0);
            this.X.updateColors();
        }
        this.X.setCloseButtonOnClickListener(new sv(this, 0));
        this.X.r.setOnFocusChangeListener(new rd(this, 1));
        fi.c2 c2Var = this.X.r;
        ag.u0 u0Var = new ag.u0(c2Var, new px(this));
        this.Y = u0Var;
        c2Var.addTextChangedListener(u0Var);
        this.X.setSearchFiltersListener(new ix(this));
        this.Y.a();
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.w0 a12 = l4.a(4, R.drawable.ic_ab_other);
            this.k0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.k0.setOnClickListener(new hv(this, 10));
            this.k0.setOnLongClickListener(new nv(this, 3));
        }
        this.j0.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.j0.setContentDescription(LocaleController.getString(R.string.Search));
        if (this.l2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i15 = this.R0;
            if (i15 == 16) {
                this.actionBar.setTitle(LocaleController.getString(R.string.BotChooseChatToVerify));
            } else if (this.N0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.O0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (i15 == 3 && this.f2 == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else if (i15 == 10) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectChats));
            } else if (i15 == 14) {
                boolean z10 = this.A2;
                if (!z10 || this.z2 || this.v2 || this.y2) {
                    boolean z11 = this.z2;
                    if (!z11 || z10 || this.v2 || this.y2) {
                        boolean z12 = this.v2;
                        if (z12 && !z11 && !z10 && !this.y2) {
                            this.actionBar.setTitle(LocaleController.getString(R.string.ChooseGroup));
                        } else if (!this.y2 || z11 || z10 || z12) {
                            this.actionBar.setTitle(LocaleController.getString(R.string.SelectChat));
                        } else {
                            this.actionBar.setTitle(LocaleController.getString(R.string.ChooseChannel));
                        }
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseUser));
                    }
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChooseBot));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.G;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool == null) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseUser));
                    } else if (bool.booleanValue()) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseBot));
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseUser));
                    }
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChooseChannel));
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChooseGroup));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.SelectChat));
                }
            }
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, this.actionBar, getResourceProvider());
        } else {
            if (this.n2 != null || this.W2 != 0 || this.Y2 != j10) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
                this.e1 = j2Var;
                kVar.setBackButtonDrawable(j2Var);
            }
            if (this.W2 != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedChats));
            } else if (this.Y2 != j10) {
                this.actionBar.setTitle(DialogObject.getName(this.Z2));
                this.actionBar.setAdditionalTextLeft(AndroidUtilities.dp(28.0f));
                this.c3 = new org.telegram.ui.Components.j9(this.Z2);
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getContext());
                this.b3 = y9Var;
                y9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
                this.b3.f(this.Z2, this.c3);
                this.actionBar.addView(this.b3, org.telegram.ui.Components.gb1.h(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(AndroidUtilities.dp(26.0f), null);
                this.E3 = r5Var;
                r5Var.a = true;
                Drawable mutate = context2.getResources().getDrawable(R.drawable.telegram_logo_2).mutate();
                this.D3 = mutate;
                mutate.setBounds(0, AndroidUtilities.dp(2.0f), this.D3.getIntrinsicWidth(), this.D3.getIntrinsicHeight() + AndroidUtilities.dp(2.0f));
                Drawable drawable = this.D3;
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.gl);
                this.w4 = themedColor2;
                drawable.setColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.D3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.F(spannableStringBuilder, this.E3);
                n5(UserConfig.getInstance(this.currentAccount).getCurrentUser(), false);
            }
            if (this.W2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setTitleActionRunnable(new sv(this, 1));
        int i16 = this.R0;
        if (((i16 == 0 && !this.l2) || i16 == 3) && this.W2 == 0 && this.Y2 == j10 && TextUtils.isEmpty(this.n2)) {
            qx qxVar2 = new qx(this, context2, this.resourceProvider);
            this.z0 = qxVar2;
            qxVar2.setVisibility(8);
            this.w = false;
            this.r.a(false, false);
            this.z0.setDelegate(new rx(context2, this));
        }
        int i17 = 17;
        if (this.r2 && UserConfig.getActivatedAccountsCount() > 1) {
            this.D1 = l4.g(11, 0, AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9();
            j9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context2);
            y9Var2.setRoundRadius(AndroidUtilities.dp(18.0f));
            this.D1.addView(y9Var2, org.telegram.ui.Components.gb1.i(36, 36, 17));
            this.D1.setOnClickListener(new hv(this, 11));
            this.D1.setOnLongClickListener(new nv(this, 2));
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            j9Var.m(this.currentAccount, currentUser);
            y9Var2.getImageReceiver().setCurrentAccount(this.currentAccount);
            y9Var2.l(ImageLocation.getForUserOrChat(this.currentAccount, currentUser, 1), "50_50", ImageLocation.getForUserOrChat(currentUser, 2), "50_50", (currentUser == null || (userProfilePhoto = currentUser.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? j9Var : r92, currentUser);
        }
        this.actionBar.setActionBarMenuOnItemClick(new zv(this));
        tx txVar = new tx(context2, this);
        this.fragmentView = txVar;
        this.s4 = new tv(this, txVar, new PointF(), 0);
        int i18 = (this.W2 == 0 && this.Y2 == j10 && (((i11 = this.R0) == 0 && !this.l2) || i11 == 3)) ? 2 : 1;
        this.e0 = new ay[i18];
        int i19 = 0;
        while (i19 < i18) {
            ay ayVar = new ay(context2, this);
            txVar.addView(ayVar, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            ayVar.s = this.R0;
            this.e0[i19] = ayVar;
            ayVar.w = new org.telegram.ui.Components.c10(context2);
            ayVar.w.setViewType(7);
            ayVar.w.setVisibility(8);
            ayVar.addView(ayVar.w, org.telegram.ui.Components.gb1.i(-2, -2, i17));
            wx wxVar = new wx(this, context2, ayVar);
            ayVar.a = wxVar;
            this.glassEngine.b(wxVar);
            ?? r14 = ayVar.a;
            ayVar.b = new a8.ng((org.telegram.ui.Components.mm0) r14);
            r14.setAllowStopHeaveOperations(r82);
            ayVar.a.setAccessibilityEnabled(r11);
            ayVar.a.r1(r11, r82);
            ayVar.a.setClipToPadding(r11);
            ayVar.a.setPivotY(f10);
            if (this.R0 == 15) {
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, ayVar.a, getResourceProvider());
            }
            ayVar.x = new aw(ayVar.a, ayVar);
            ayVar.a.setVerticalScrollBarEnabled(r82);
            ayVar.a.setInstantClick(r82);
            ayVar.c = new cw(this, ayVar);
            ayVar.c.k1(r82);
            ayVar.a.setLayoutManager(ayVar.c);
            ayVar.a.setVerticalScrollbarPosition(LocaleController.isRTL ? r82 : 2);
            ayVar.addView(ayVar.a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            ayVar.a.setOnItemClickListener(new org.telegram.ui.Components.voip.k1(8, this, ayVar));
            ayVar.a.setOnItemLongClickListener(new m4.c(this, ayVar, false, 11));
            ayVar.f = new zx(this, ayVar);
            ayVar.y = new org.telegram.ui.Components.ql0(ayVar.a, r11);
            zxVar = ayVar.f;
            ayVar.e = new s4.z(zxVar);
            zVar = ayVar.e;
            zVar.h(ayVar.a);
            ayVar.a.setOnScrollListener(new ew(this, ayVar, txVar));
            ayVar.v = SharedConfig.archiveHidden ? 2 : r11;
            if (ayVar.n == null && this.W2 == 0 && this.Y2 == j10) {
                ayVar.n = new fw(LocaleController.getString(R.string.AccSwipeForArchive), LocaleController.getString(R.string.AccReleaseForArchive), ayVar);
                if (h4()) {
                    ayVar.n.h();
                } else {
                    ayVar.n.b();
                }
                fw fwVar = ayVar.n;
                i10 = ayVar.v;
                fwVar.g(i10 != 0 ? r82 : r11);
            }
            tx txVar2 = txVar;
            int i20 = i19;
            boolean z13 = r82;
            long j11 = j10;
            int i21 = i18;
            context2 = context;
            ayVar.d = new gw(this, this, context, ayVar.s, this.W2, this.l2, arrayList, this.currentAccount, this.G, ayVar);
            nVar = ayVar.d;
            nVar.S(ayVar.a);
            nVar2 = ayVar.d;
            nVar2.Q(this.t2);
            if (ayVar.s == 3) {
                nVar6 = ayVar.d;
                nVar6.N((getMessagesController().storiesEnabled() && (uxVar = this.C2) != null && uxVar.C()) ? z13 : false);
            }
            if (AndroidUtilities.isTablet()) {
                MessagesStorage.TopicKey topicKey = this.p2;
                if (topicKey.dialogId != j11) {
                    nVar5 = ayVar.d;
                    nVar5.R(topicKey.dialogId);
                }
            }
            nVar3 = ayVar.d;
            nVar3.O(ayVar.n);
            wx wxVar2 = ayVar.a;
            nVar4 = ayVar.d;
            wxVar2.setAdapter(nVar4);
            ayVar.a.setEmptyView((this.W2 == 0 && this.Y2 == j11) ? ayVar.w : null);
            ayVar.r = new org.telegram.ui.Components.pl0(ayVar.a, ayVar.c);
            org.telegram.ui.Components.pl0 pl0Var = ayVar.r;
            pl0Var.c = z13;
            pl0Var.d = z13;
            pl0Var.h = new iv(this, 12);
            if (i20 != 0) {
                this.e0[i20].setVisibility(8);
            }
            i19 = i20 + 1;
            r82 = z13;
            i12 = 3;
            i18 = i21;
            txVar = txVar2;
            f10 = 0.0f;
            j10 = j11;
            r11 = 0;
            i17 = 17;
        }
        tx txVar3 = txVar;
        int i22 = i12;
        int i23 = r82;
        long j12 = j10;
        org.telegram.ui.Components.vs vsVar = new org.telegram.ui.Components.vs(context2);
        this.K1 = vsVar;
        int i24 = org.telegram.ui.ActionBar.y6.d6;
        vsVar.setColor(org.telegram.ui.ActionBar.y6.v0(i24));
        txVar3.addView(this.K1, org.telegram.ui.Components.gb1.i(-1, 100, 48));
        this.B0 = txVar3.getChildCount();
        n31 n31Var = new n31((Activity) getContext());
        this.Z = n31Var;
        txVar3.addView(n31Var, org.telegram.ui.Components.gb1.h(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        n31 n31Var2 = this.Z;
        fh.e o10 = gh.c.o(this.resourceProvider);
        ch.b bVar2 = this.q4;
        eh.d b10 = bVar2.b(n31Var2, o10);
        org.telegram.messenger.vh.s(b10, AndroidUtilities.dp(18.0f), 6.666f);
        this.Z.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        this.Z.setBlurredBackground(b10);
        ig.r0 r0Var = new ig.r0(getParentActivity(), null);
        this.b0 = r0Var;
        r0Var.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        ig.r0 r0Var2 = this.b0;
        r0Var2.i3 = false;
        r0Var2.setOnItemClickListener(new lv(this, 1));
        this.Z.addView(this.b0, org.telegram.ui.Components.gb1.i(-1, -1, 48));
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(context2, this.resourceProvider, i23);
        this.u0 = j20Var;
        j20Var.setContentDescription(LocaleController.getString(R.string.StoryPrivacyButtonPost));
        this.u0.setImageResource(R.drawable.outline_fab_story_24);
        this.u0.setOnClickListener(new hv(this, 24));
        txVar3.addView(this.u0, org.telegram.ui.Components.j20.c());
        org.telegram.ui.Components.j20 j20Var2 = new org.telegram.ui.Components.j20(context2, this.resourceProvider);
        this.t0 = j20Var2;
        txVar3.addView(j20Var2, org.telegram.ui.Components.j20.b());
        this.t0.setOnClickListener(new hv(this, 28));
        if (!m4() && this.R0 == 0 && MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("storyhint", i23)) {
            fi.v3 v3Var = new fi.v3(context2, 2);
            v3Var.q(8.0f);
            v3Var.d = 8000L;
            v3Var.i(i23);
            v3Var.n();
            v3Var.p(i23);
            v3Var.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryCameraHint), fi.sb.m(context2)));
            v3Var.l(1.0f, -40.0f);
            v3Var.h(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
            v3Var.l0 = new sv(this, 7);
            this.p0 = v3Var;
            txVar3.addView(v3Var, org.telegram.ui.Components.gb1.h(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        }
        o5();
        this.a0 = null;
        if (this.l2 || this.R0 != 0) {
            f7 = 72.0f;
            if (this.R0 == i22 || Q3()) {
                jh.f fVar = new jh.f(context2);
                this.y1 = fVar;
                fVar.setClipChildren(false);
                jh.f fVar2 = this.y1;
                rh.i iVar = this.v;
                fVar2.setWindowInsetsProvider(iVar);
                jh.f fVar3 = this.y1;
                fVar3.setInputIslandBubbleDrawable(bVar2.b(fVar3, gh.c.o(this.resourceProvider)));
                jh.f fVar4 = this.y1;
                fVar4.setUnderKeyboardBackgroundDrawable(this.o4.b(fVar4, gh.c.o(this.resourceProvider)));
                ch.c cVar = new ch.c(this.r4.b(this.y1, null));
                if (!SharedConfig.chatBlurEnabled() || LiteMode.isEnabled(262144)) {
                    cVar.b(AndroidUtilities.dp(72.0f), i23);
                }
                this.y1.setBackgroundWithFadeDrawable(cVar);
                FrameLayout inputIslandBubbleContainer = this.y1.getInputIslandBubbleContainer();
                this.z1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.A1 = this.y1.getInAppKeyboardBubbleContainer();
                jw jwVar = this.B1;
                if (jwVar != null) {
                    jwVar.z0();
                }
                jw jwVar2 = new jw(this, getParentActivity(), txVar3);
                this.B1 = jwVar2;
                jwVar2.setInAppInsetsController(iVar);
                this.B1.y4 = false;
                txVar3.setClipChildren(false);
                txVar3.setClipToPadding(false);
                jw jwVar3 = this.B1;
                jwVar3.x4 = false;
                jwVar3.i2 = (AndroidUtilities.isInMultiwindow || ((unVar = jwVar3.P2) != null && unVar.isInBubbleMode())) ? false : i23;
                this.B1.S0(false, false, false);
                this.B1.d1(i23, false);
                this.B1.z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
                this.B1.getSendButton().setAlpha(0.0f);
                this.B1.setViewParentForEmoji(this.A1);
                this.z1.addView(this.B1, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                txVar3.addView(this.y1.getFadeView(), org.telegram.ui.Components.gb1.g(-1.0f, -1));
                txVar3.addView(this.y1, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                if (i4() || this.E2 != null || this.F2 != null) {
                    s3(this.V3);
                    this.V3 = null;
                }
                this.B1.setDelegate(new kw(this));
                bVar = bVar2;
                li.w1 w1Var = new li.w1(this, context2, R.drawable.send_plane_24, this.resourceProvider, 3);
                this.C1 = w1Var;
                int dp = AndroidUtilities.dp(52.0f);
                int dp2 = AndroidUtilities.dp(38.0f);
                w1Var.I = dp;
                w1Var.J = dp2;
                li.w1 w1Var2 = this.C1;
                float dp3 = AndroidUtilities.dp(7.0f);
                float dp4 = AndroidUtilities.dp(8.0f);
                w1Var2.M = dp3;
                w1Var2.N = dp4;
                li.w1 w1Var3 = this.C1;
                w1Var3.h0 = i23;
                txVar3.addView(w1Var3, org.telegram.ui.Components.gb1.i(110, 50, 85));
                this.C1.setScrimViewBackgroundColor(getThemedColor(i24));
                this.C1.setOnClickListener(new hv(this, 5));
                this.C1.setOnLongClickListener(new nv(this, 0));
                this.C1.setVisibility(8);
                this.C1.setScaleX(0.2f);
                this.C1.setScaleY(0.2f);
                this.C1.setAlpha(0.0f);
                float dp5 = AndroidUtilities.dp(12.0f);
                TextPaint textPaint = this.E1;
                textPaint.setTextSize(dp5);
                textPaint.setTypeface(AndroidUtilities.bold());
                qxVar = this.z0;
                if (qxVar != null) {
                    eh.d b11 = bVar.b(qxVar, gh.c.o(this.resourceProvider));
                    org.telegram.messenger.vh.s(b11, AndroidUtilities.dp(18.0f), 6.666f);
                    this.z0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                    this.z0.setBlurredBackground(b11);
                    txVar3.addView(this.z0, org.telegram.ui.Components.gb1.h(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                oxVar = this.X;
                if (oxVar != null) {
                    oxVar.setupBlurredBackground(bVar.b(oxVar, gh.c.o(this.resourceProvider)));
                }
                qw qwVar = new qw(this, context, this, this.currentAccount, m4() ? 1 : 0);
                this.E0 = qwVar;
                qwVar.setActionBar(this.actionBar);
                this.E0.setMenuItemsOffset(!m4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
                qw qwVar2 = this.E0;
                qwVar2.l0 = false;
                qwVar2.setVisibility(8);
                this.M = false;
                this.L = false;
                this.K = false;
                if (this.l2 && this.R0 == i22) {
                    MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
                }
                txVar3.addView(this.actionBar, org.telegram.ui.Components.gb1.g(-2.0f, -1));
                if (!this.l2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
                    this.F3 = oVar;
                    txVar3.addView(oVar, org.telegram.ui.Components.gb1.i(20, 20, 51));
                }
                oxVar2 = this.X;
                if (oxVar2 != null) {
                    txVar3.addView(oxVar2, org.telegram.ui.Components.gb1.h(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.x0 = txVar3.getChildCount();
                UndoView[] undoViewArr = this.y0;
                undoViewArr[0] = null;
                undoViewArr[i23] = null;
                if (this.W) {
                    this.actionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
                    org.telegram.ui.ActionBar.f7.d(this.actionBar, org.telegram.ui.ActionBar.y6.gl, getResourceProvider());
                }
                if (this.W2 == 0 || this.Y2 != 0) {
                    this.e0[0].a.setGlowColor(getThemedColor(i24));
                    org.telegram.ui.ActionBar.f7.b(this.actionBar, org.telegram.ui.ActionBar.y6.O8, getResourceProvider(), false);
                    org.telegram.ui.ActionBar.f7.a(this.actionBar, org.telegram.ui.ActionBar.y6.N8, getResourceProvider(), false);
                    this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.y6.Q8), false);
                    this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.y6.R8), i23);
                }
                if (!this.l2 && this.R0 == 0) {
                    bi.cc ccVar = new bi.cc(this, context, 29);
                    this.K0 = ccVar;
                    ccVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i24), 100)));
                    this.K0.setFocusable(false);
                    this.K0.setImportantForAccessibility(2);
                    this.K0.setOnClickListener(new hv(this, 6));
                    this.K0.setVisibility(8);
                    txVar3.addView(this.K0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                }
                this.f1.setColor(getThemedColor(i24));
                this.q3 = false;
                if (this.n2 == null) {
                    W4(i23, false, false, false);
                    this.X.r.setText(this.n2);
                    this.X.r.setSelection(this.n2.length());
                } else if (this.o2 != null) {
                    W4(i23, false, false, i23);
                    this.X.r.setText(this.o2);
                    this.X.r.setSelection(this.o2.length());
                    this.o2 = null;
                    ox oxVar4 = this.X;
                    if (oxVar4 != null) {
                        oxVar4.setTranslationY(e4() + (-AndroidUtilities.dp(36.0f)));
                    }
                } else {
                    W4(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.checkBottomSheet(this);
                }
                this.actionBar.setDrawBlurBackground(txVar3);
                this.G3 = new tw(this, context, txVar3, context);
                e5(i23, false);
                this.G3.setOpenProgress(0.0f);
                txVar3.addView(this.E0, org.telegram.ui.Components.gb1.g(81.0f, -1));
                txVar3.addView(this.G3, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                this.F0 = new org.telegram.ui.Components.us(context);
                wsVar = this.J1;
                if (wsVar != null) {
                    txVar3.addView(wsVar, org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.Y2 != 0 && this.R0 != i22 && ChatObject.canAddChatToCommunity(this.Z2)) {
                    org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                    spannableStringBuilder2.setSpan(zqVar, 0, i23, 33);
                    fi.d dVar = new fi.d(context, this.resourceProvider);
                    this.v0 = dVar;
                    dVar.f();
                    this.v0.setText(spannableStringBuilder2);
                    this.v0.setOnClickListener(new org.telegram.ui.Components.k51(12, this, new org.telegram.ui.ActionBar.e2[i23]));
                    lh.f fVar5 = new lh.f(getContext());
                    this.w0 = fVar5;
                    fVar5.setupColorKey(org.telegram.ui.ActionBar.y6.a7);
                    this.w0.setFadeZoneBottom(AndroidUtilities.dp(f7) + AndroidUtilities.navigationBarHeight);
                    this.w0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
                    txVar3.addView(this.w0, org.telegram.ui.Components.gb1.k());
                    txVar3.addView(this.v0, org.telegram.ui.Components.gb1.j(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
                }
                p5(false);
                h5(false);
                N3();
                K3();
                M3();
                L3();
                J3();
                D3();
                this.X.setBlurredBackgroundVisibility(this.b.e);
                oi.q qVar = this.glassEngine;
                qVar.a = new iv(this, 7);
                qVar.d = new qi.b(AndroidUtilities.dp(48.0f));
                r0.i0.m(this.fragmentView, new iv(this, 8));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.ws wsVar2 = new org.telegram.ui.Components.ws(context2);
            this.J1 = wsVar2;
            wsVar2.setOnAnimatedHeightChangedListener(new sv(this, 13));
            eh.d a13 = bVar2.a(this.J1);
            a13.v(gh.c.o(this.resourceProvider));
            a13.w(AndroidUtilities.dp(7.0f));
            f7 = 72.0f;
            this.J1.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
            this.J1.setBlurredBackground(a13);
            this.J1.setDefaultRadiusDp(this.Y2 != j12 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.G1 = frameLayout;
            this.J1.addView(frameLayout);
            this.J1.h(5, this.G1);
            this.J1.g(this.G1);
            this.J1.i(this.G1, i23, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.I1 = frameLayout2;
            this.J1.addView(frameLayout2);
            this.J1.h(4, this.I1);
            this.J1.g(this.I1);
            this.J1.i(this.I1, i23, false);
            hw hwVar = new hw(this, context2, this, 0);
            this.F1 = hwVar;
            this.G1.addView(hwVar);
            hw hwVar2 = new hw(this, context2, this, 1);
            this.H1 = hwVar2;
            this.I1.addView(hwVar2);
            this.J1.setCallFragmentContextView(this.H1);
            org.telegram.ui.Cells.x2 x2Var = new org.telegram.ui.Cells.x2(context2);
            this.M1 = x2Var;
            x2Var.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
            c5();
            c7.i0(new fv(this, 0));
            c7.n0(new e5(this, 11));
            this.J1.addView(this.M1);
            if (this.Y2 != j12) {
                ji.j jVar = new ji.j(context2, this.resourceProvider, i23);
                this.Q1 = jVar;
                jVar.a(-14899731, -15497247, R.drawable.filled_requests_24, LocaleController.getString(R.string.CommunityPendingRequests), null, false);
                this.Q1.setUnreadMode(i23);
                this.Q1.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
                this.Q1.setOnClickListener(new hv(this, 4));
                this.J1.addView(this.Q1);
                y3(false);
            }
        }
        bVar = bVar2;
        qxVar = this.z0;
        if (qxVar != null) {
        }
        oxVar = this.X;
        if (oxVar != null) {
        }
        qw qwVar3 = new qw(this, context, this, this.currentAccount, m4() ? 1 : 0);
        this.E0 = qwVar3;
        qwVar3.setActionBar(this.actionBar);
        this.E0.setMenuItemsOffset(!m4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
        qw qwVar22 = this.E0;
        qwVar22.l0 = false;
        qwVar22.setVisibility(8);
        this.M = false;
        this.L = false;
        this.K = false;
        if (this.l2) {
            MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
        }
        txVar3.addView(this.actionBar, org.telegram.ui.Components.gb1.g(-2.0f, -1));
        if (!this.l2) {
        }
        oxVar2 = this.X;
        if (oxVar2 != null) {
        }
        this.x0 = txVar3.getChildCount();
        UndoView[] undoViewArr2 = this.y0;
        undoViewArr2[0] = null;
        undoViewArr2[i23] = null;
        if (this.W) {
        }
        if (this.W2 == 0) {
        }
        this.e0[0].a.setGlowColor(getThemedColor(i24));
        org.telegram.ui.ActionBar.f7.b(this.actionBar, org.telegram.ui.ActionBar.y6.O8, getResourceProvider(), false);
        org.telegram.ui.ActionBar.f7.a(this.actionBar, org.telegram.ui.ActionBar.y6.N8, getResourceProvider(), false);
        this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.y6.Q8), false);
        this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.y6.R8), i23);
        if (!this.l2) {
            bi.cc ccVar2 = new bi.cc(this, context, 29);
            this.K0 = ccVar2;
            ccVar2.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i24), 100)));
            this.K0.setFocusable(false);
            this.K0.setImportantForAccessibility(2);
            this.K0.setOnClickListener(new hv(this, 6));
            this.K0.setVisibility(8);
            txVar3.addView(this.K0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        }
        this.f1.setColor(getThemedColor(i24));
        this.q3 = false;
        if (this.n2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(txVar3);
        this.G3 = new tw(this, context, txVar3, context);
        e5(i23, false);
        this.G3.setOpenProgress(0.0f);
        txVar3.addView(this.E0, org.telegram.ui.Components.gb1.g(81.0f, -1));
        txVar3.addView(this.G3, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.F0 = new org.telegram.ui.Components.us(context);
        wsVar = this.J1;
        if (wsVar != null) {
        }
        if (this.Y2 != 0) {
            org.telegram.ui.Components.zq zqVar2 = new org.telegram.ui.Components.zq(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder22.setSpan(zqVar2, 0, i23, 33);
            fi.d dVar2 = new fi.d(context, this.resourceProvider);
            this.v0 = dVar2;
            dVar2.f();
            this.v0.setText(spannableStringBuilder22);
            this.v0.setOnClickListener(new org.telegram.ui.Components.k51(12, this, new org.telegram.ui.ActionBar.e2[i23]));
            lh.f fVar52 = new lh.f(getContext());
            this.w0 = fVar52;
            fVar52.setupColorKey(org.telegram.ui.ActionBar.y6.a7);
            this.w0.setFadeZoneBottom(AndroidUtilities.dp(f7) + AndroidUtilities.navigationBarHeight);
            this.w0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            txVar3.addView(this.w0, org.telegram.ui.Components.gb1.k());
            txVar3.addView(this.v0, org.telegram.ui.Components.gb1.j(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        }
        p5(false);
        h5(false);
        N3();
        K3();
        M3();
        L3();
        J3();
        D3();
        this.X.setBlurredBackgroundVisibility(this.b.e);
        oi.q qVar2 = this.glassEngine;
        qVar2.a = new iv(this, 7);
        qVar2.d = new qi.b(AndroidUtilities.dp(48.0f));
        r0.i0.m(this.fragmentView, new iv(this, 8));
        return this.fragmentView;
    }

    public final float d4() {
        tw twVar = this.G3;
        if (twVar == null || !twVar.c()) {
            return 0.0f;
        }
        return this.G3.e;
    }

    public final void d5() {
        bi.r1 r1Var;
        wx wxVar;
        try {
            jw jwVar = this.B1;
            if (jwVar != null && jwVar.getEditField() != null) {
                this.B1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.y6.Wd));
            }
            NumberTextView numberTextView = this.h1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.y8));
            }
            qx qxVar = this.z0;
            int i10 = 0;
            if (qxVar != null && (qxVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                ((GradientDrawable) this.z0.getSelectorDrawable()).setColor(getThemedColor(kVar != null && kVar.q() ? org.telegram.ui.ActionBar.y6.Gh : org.telegram.ui.ActionBar.y6.K8));
                this.z0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.W2 != 0 || this.Y2 != 0) {
                    kVar2.D(getThemedColor(org.telegram.ui.ActionBar.y6.Q8), false);
                    this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.y6.R8), true);
                }
                if (this.actionBar.q()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                }
                j5();
            }
            if (this.e0 != null) {
                while (true) {
                    ay[] ayVarArr = this.e0;
                    if (i10 >= ayVarArr.length) {
                        break;
                    }
                    ay ayVar = ayVarArr[i10];
                    if (ayVar != null && (wxVar = ayVar.a) != null) {
                        wxVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
                    }
                    i10++;
                }
            }
            jx jxVar = this.C0;
            if (jxVar != null && (r1Var = jxVar.a0) != null) {
                r1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            }
            li.w1 w1Var = this.C1;
            if (w1Var != null) {
                w1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            }
            fi.v3 v3Var = this.p0;
            if (v3Var != null) {
                v3Var.h(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
            }
            fi.v3 v3Var2 = this.q0;
            if (v3Var2 != null) {
                v3Var2.h(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:414:0x0568, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r14, r4.J0) != false) goto L367;
     */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        MessagesController.DialogFilter dialogFilter;
        int i13;
        ArrayList arrayList;
        int i14;
        boolean booleanValue;
        boolean z10;
        org.telegram.ui.Components.wo0 wo0Var;
        org.telegram.ui.Components.wo0 wo0Var2;
        int i15;
        boolean z11;
        int i16 = 2;
        ArrayList arrayList2 = null;
        int i17 = 0;
        int i18 = 0;
        if (i10 == NotificationCenter.dialogsNeedReload) {
            if (this.e0 == null || this.S1) {
                return;
            }
            int i19 = 0;
            while (true) {
                ay[] ayVarArr = this.e0;
                if (i19 >= ayVarArr.length) {
                    break;
                }
                ay ayVar = ayVarArr[i19];
                int i20 = ayVarArr[0].s;
                MessagesController.DialogFilter dialogFilter2 = (i20 == 7 || i20 == 8) ? getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
                boolean z12 = (dialogFilter2 == null || (dialogFilter2.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.A3 && z12) {
                    AndroidUtilities.runOnUIThread(new nq(this, ayVar, objArr, i16), 160L);
                } else {
                    int length = objArr.length;
                    C4(ayVar);
                }
                i19++;
            }
            qx qxVar = this.z0;
            if (qxVar != null && qxVar.getVisibility() == 0) {
                this.z0.c();
            }
            this.A3 = false;
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            q5(0, true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.Y2 != chatFull.id) {
                return;
            }
            this.a3 = chatFull;
            y3(false);
            if (this.e0 == null || this.S1) {
                return;
            }
            while (true) {
                ay[] ayVarArr2 = this.e0;
                if (i18 >= ayVarArr2.length) {
                    return;
                }
                C4(ayVarArr2[i18]);
                i18++;
            }
        } else {
            if (i10 == NotificationCenter.dialogsUnreadCounterChanged) {
                qx qxVar2 = this.z0;
                if (qxVar2 == null || qxVar2.getVisibility() != 0) {
                    return;
                }
                qx qxVar3 = this.z0;
                int defaultTabId = qxVar3.getDefaultTabId();
                bi.r1 r1Var = qxVar3.F;
                ArrayList arrayList3 = qxVar3.h;
                int i21 = qxVar3.l0.get(defaultTabId, -1);
                if (i21 < 0 || i21 >= arrayList3.size()) {
                    return;
                }
                org.telegram.ui.Components.p00 p00Var = (org.telegram.ui.Components.p00) arrayList3.get(i21);
                if (p00Var.d == ((rx) qxVar3.J).a(p00Var.a) || ((rx) qxVar3.J).a(p00Var.a) < 0) {
                    return;
                }
                r1Var.g1();
                if (qxVar3.m0.get(i21) != p00Var.a(true) || qxVar3.h0) {
                    qxVar3.h0 = true;
                    qxVar3.requestLayout();
                    r1Var.setItemAnimator(qxVar3.s0);
                    org.telegram.ui.Components.o00 o00Var = qxVar3.I;
                    if (o00Var != null) {
                        o00Var.l();
                    }
                    qxVar3.M = 0;
                    org.telegram.ui.Components.p00 d = qxVar3.d();
                    if (d != null) {
                        d.b(LocaleController.getString(R.string.FilterAllChats));
                    }
                    int size = arrayList3.size();
                    for (int i22 = 0; i22 < size; i22++) {
                        qxVar3.M = org.telegram.messenger.t.D(24.0f, ((org.telegram.ui.Components.p00) arrayList3.get(i22)).a(true), qxVar3.M);
                    }
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadPollVotesCounterChanged) {
                q5(0, true);
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadReactionsCounterChanged) {
                q5(0, true);
                return;
            }
            if (i10 == NotificationCenter.emojiLoaded) {
                if (this.e0 != null) {
                    int i23 = 0;
                    while (true) {
                        ay[] ayVarArr3 = this.e0;
                        if (i23 >= ayVarArr3.length) {
                            break;
                        }
                        wx wxVar = ayVarArr3[i23].a;
                        if (wxVar != null) {
                            for (int i24 = 0; i24 < wxVar.getChildCount(); i24++) {
                                View childAt = wxVar.getChildAt(i24);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i23++;
                    }
                }
                qx qxVar4 = this.z0;
                if (qxVar4 != null) {
                    qxVar4.getTabsContainer().g1();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.closeSearchByActiveAction) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.g(true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.proxySettingsChanged) {
                i5(false, false);
                return;
            }
            if (i10 == NotificationCenter.updateInterfaces) {
                Integer num = (Integer) objArr[0];
                q5(num.intValue(), true);
                qx qxVar5 = this.z0;
                if (qxVar5 != null && qxVar5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
                    this.z0.c();
                }
                if (this.Y2 != 0 && ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0)) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.Y2));
                    this.Z2 = chat;
                    this.actionBar.setTitle(DialogObject.getName(chat));
                    this.b3.f(this.Z2, this.c3);
                }
                if (this.e0 != null) {
                    for (int i25 = 0; i25 < this.e0.length; i25++) {
                        if ((num.intValue() & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.e0[i25].d.U(true);
                        }
                    }
                }
                n5(UserConfig.getInstance(i11).getCurrentUser(), true);
                return;
            }
            int i26 = NotificationCenter.appDidLogout;
            boolean[] zArr = z4;
            if (i10 == i26) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i10 == NotificationCenter.encryptedChatUpdated) {
                q5(0, true);
                return;
            }
            if (i10 == NotificationCenter.contactsDidLoad) {
                if (this.e0 == null || this.S1) {
                    return;
                }
                org.telegram.ui.Components.j20 j20Var = this.t0;
                if (j20Var != null) {
                    z11 = j20Var.getProgressVisible();
                    this.t0.f(false, true);
                } else {
                    z11 = false;
                }
                for (ay ayVar2 : this.e0) {
                    ayVar2.d.e = false;
                }
                if (z11) {
                    H4(0.0f);
                    ValueAnimator valueAnimator = this.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.c0, 1.0f).setDuration(250L);
                    this.d0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.ds.f);
                    this.d0.addUpdateListener(new ev(this, 0));
                    this.d0.start();
                }
                int i27 = 0;
                boolean z13 = false;
                while (true) {
                    ay[] ayVarArr4 = this.e0;
                    if (i27 >= ayVarArr4.length) {
                        break;
                    }
                    if (!ayVarArr4[i27].p() || getMessagesController().getAllFoldersDialogsCount() > 10) {
                        z13 = true;
                    } else {
                        this.e0[i27].d.l();
                    }
                    i27++;
                    z13 = z13;
                }
                if (z13) {
                    q5(0, true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.openedChatChanged) {
                if (this.e0 == null) {
                    return;
                }
                int i28 = 0;
                while (true) {
                    ay[] ayVarArr5 = this.e0;
                    if (i28 >= ayVarArr5.length) {
                        q5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                        return;
                    }
                    if (ayVarArr5[i28].p() && AndroidUtilities.isTablet()) {
                        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
                        long longValue = ((Long) objArr[0]).longValue();
                        long longValue2 = ((Long) objArr[1]).longValue();
                        MessagesStorage.TopicKey topicKey = this.p2;
                        if (!booleanValue2) {
                            topicKey.dialogId = longValue;
                            topicKey.topicId = longValue2;
                        } else if (longValue == topicKey.dialogId && longValue2 == topicKey.topicId) {
                            topicKey.dialogId = 0L;
                            topicKey.topicId = 0L;
                        }
                        this.e0[i28].d.s = topicKey.dialogId;
                    }
                    i28++;
                }
            } else {
                if (i10 == NotificationCenter.notificationsSettingsUpdated) {
                    q5(0, true);
                    return;
                }
                if (i10 == NotificationCenter.messageReceivedByAck || i10 == NotificationCenter.messageReceivedByServer || i10 == NotificationCenter.messageSendError) {
                    q5(MessagesController.UPDATE_MASK_SEND_STATE, true);
                    return;
                }
                if (i10 == NotificationCenter.didSetPasscode) {
                    G3();
                    return;
                }
                if (i10 == NotificationCenter.needReloadRecentDialogsSearch) {
                    jx jxVar = this.C0;
                    if (jxVar == null || (wo0Var2 = jxVar.d0) == null || (i15 = wo0Var2.h0) == 15) {
                        return;
                    }
                    int i29 = wo0Var2.s0;
                    MessagesStorage.getInstance(i29).getStorageQueue().postRunnable(new i2.v(i29, i15, new ig.w(wo0Var2), i16));
                    return;
                }
                if (i10 == NotificationCenter.replyMessagesDidLoad) {
                    q5(MessagesController.UPDATE_MASK_MESSAGE_TEXT, true);
                    return;
                }
                if (i10 == NotificationCenter.reloadHints) {
                    jx jxVar2 = this.C0;
                    if (jxVar2 == null || (wo0Var = jxVar2.d0) == null) {
                        return;
                    }
                    wo0Var.l();
                    return;
                }
                if (i10 == NotificationCenter.didUpdateConnectionState) {
                    int connectionState = AccountInstance.getInstance(i11).getConnectionsManager().getConnectionState();
                    if (this.d2 != connectionState) {
                        this.d2 = connectionState;
                        i5(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDownloadingFilesChanged) {
                    i5(true, false);
                    jx jxVar3 = this.C0;
                    if (jxVar3 != null) {
                        int currentPosition = jxVar3.getCurrentPosition();
                        org.telegram.ui.Components.dp0 dp0Var = jxVar3.V;
                        m5(dp0Var != null && dp0Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.needDeleteDialog) {
                    if (this.fragmentView == null) {
                        return;
                    }
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.User user = (TLRPC.User) objArr[1];
                    TLRPC.Chat chat2 = (TLRPC.Chat) objArr[2];
                    if (user == null || !user.bot) {
                        booleanValue = ((Boolean) objArr[3]).booleanValue();
                        z10 = false;
                    } else {
                        z10 = ((Boolean) objArr[3]).booleanValue();
                        booleanValue = false;
                    }
                    boolean z14 = booleanValue;
                    Runnable caVar = new fi.ca(this, chat2, longValue3, z14, user, z10);
                    V3();
                    if (this.y0[0] == null) {
                        caVar.run();
                        return;
                    }
                    if (ChatObject.isForum(chat2)) {
                        caVar.run();
                        return;
                    }
                    UndoView g42 = g4();
                    if (g42 != null) {
                        g42.j(z14 ? 1 : 95, longValue3, caVar);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.folderBecomeEmpty) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int i30 = this.W2;
                    if (i30 != intValue || i30 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i10 == NotificationCenter.dialogFiltersUpdated) {
                    e5(true, true);
                    return;
                }
                if (i10 == NotificationCenter.filterSettingsUpdated) {
                    R4();
                    return;
                }
                if (i10 == NotificationCenter.newSuggestionsAvailable) {
                    T4();
                    c5();
                    int checkEmailSuggestion = getMessagesController().checkEmailSuggestion();
                    if (checkEmailSuggestion != 0) {
                        gg0 gg0Var = new gg0();
                        sv svVar = new sv(this, 6);
                        sv svVar2 = new sv(this, r6);
                        boolean z15 = checkEmailSuggestion == 2;
                        gg0Var.F = 3;
                        gg0Var.a = 12;
                        gg0Var.d0 = svVar;
                        gg0Var.e0 = svVar2;
                        gg0Var.g0 = z15;
                        gg0Var.h0 = true;
                        presentFragment(gg0Var);
                        getMessagesController().markEmailSuggestionAsShown();
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.forceImportContactsStart) {
                    org.telegram.ui.Components.j20 j20Var2 = this.t0;
                    if (j20Var2 != null) {
                        j20Var2.f(true, true);
                    }
                    ay[] ayVarArr6 = this.e0;
                    if (ayVarArr6 != null) {
                        for (ay ayVar3 : ayVarArr6) {
                            gw gwVar = ayVar3.d;
                            gwVar.Q = false;
                            gwVar.e = true;
                            gwVar.l();
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.messagesDeleted) {
                    if (!this.q3 || this.C0 == null) {
                        return;
                    }
                    ArrayList arrayList4 = (ArrayList) objArr[0];
                    long longValue4 = ((Long) objArr[1]).longValue();
                    jx jxVar4 = this.C0;
                    HashMap hashMap = jxVar4.B0;
                    SparseArray sparseArray = jxVar4.h;
                    int size2 = sparseArray.size();
                    for (int i31 = 0; i31 < size2; i31++) {
                        View view = (View) sparseArray.valueAt(i31);
                        if (view instanceof h10) {
                            ((h10) view).e(longValue4, arrayList4);
                        }
                    }
                    for (int i32 = 0; i32 < jxVar4.getChildCount(); i32++) {
                        if (jxVar4.getChildAt(i32) instanceof h10) {
                            ((h10) jxVar4.getChildAt(i32)).e(longValue4, arrayList4);
                        }
                    }
                    jxVar4.O0.e(longValue4, arrayList4);
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList5 = new ArrayList(hashMap.keySet());
                    int i33 = 0;
                    while (i33 < arrayList5.size()) {
                        z00 z00Var = (z00) arrayList5.get(i33);
                        MessageObject messageObject = (MessageObject) hashMap.get(z00Var);
                        if (messageObject != null) {
                            long dialogId = messageObject.getDialogId();
                            if (dialogId < 0) {
                                i14 = (int) (-dialogId);
                                i13 = i17;
                                arrayList = arrayList5;
                            } else {
                                i13 = i17;
                                arrayList = arrayList5;
                            }
                            i14 = i13;
                            if (i14 == longValue4) {
                                for (int i34 = i13; i34 < arrayList4.size(); i34++) {
                                    if (messageObject.getId() == ((Integer) arrayList4.get(i34)).intValue()) {
                                        arrayList2 = new ArrayList();
                                        arrayList2.add(z00Var);
                                    }
                                }
                            }
                        } else {
                            i13 = i17;
                            arrayList = arrayList5;
                        }
                        i33++;
                        arrayList5 = arrayList;
                        i17 = i13;
                    }
                    int i35 = i17;
                    if (arrayList2 != null) {
                        int size3 = arrayList2.size();
                        for (int i36 = i35; i36 < size3; i36++) {
                            hashMap.remove(arrayList2.get(i36));
                        }
                        jxVar4.z0.a(hashMap.size(), true);
                        org.telegram.ui.ActionBar.w0 w0Var = jxVar4.E0;
                        if (w0Var != null) {
                            w0Var.setVisibility(hashMap.size() == 1 ? i35 : 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.didClearDatabase) {
                    if (this.e0 != null) {
                        int i37 = 0;
                        while (true) {
                            ay[] ayVarArr7 = this.e0;
                            if (i37 >= ayVarArr7.length) {
                                break;
                            }
                            ig.k kVar2 = ayVarArr7[i37].d.P;
                            if (kVar2 != null) {
                                kVar2.a.clear();
                                kVar2.b.clear();
                                kVar2.c.clear();
                                kVar2.d.clear();
                                AndroidUtilities.cancelRunOnUIThread(kVar2.e);
                            }
                            i37++;
                        }
                    }
                    ea1 ea1Var = ea1.b;
                    if (ea1Var != null) {
                        ea1Var.dismiss();
                        ea1.b = null;
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.communitySwitchedCollapsed) {
                    long longValue5 = ((Long) objArr[0]).longValue();
                    boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                    if (this.Y2 != longValue5 || booleanValue3) {
                        return;
                    }
                    org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
                    if (j5Var == null || j5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                if (i10 == NotificationCenter.communityPendingRequestsUpdate) {
                    if (this.Y2 == ((Long) objArr[0]).longValue()) {
                        y3(true);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseMigration) {
                    boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                    if (this.fragmentView != null) {
                        if (!booleanValue4) {
                            nu nuVar = this.R3;
                            if (nuVar == null || nuVar.getTag() == null) {
                                return;
                            }
                            nu nuVar2 = this.R3;
                            nuVar2.animate().setListener(null).cancel();
                            nuVar2.animate().setListener(new org.telegram.ui.Components.ll0(7, this, nuVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                            this.R3.setTag(null);
                            return;
                        }
                        if (this.R3 == null) {
                            Context context = this.fragmentView.getContext();
                            nu nuVar3 = new nu(context);
                            LinearLayout d10 = org.telegram.messenger.vh.d(context, 1);
                            org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context);
                            ak0Var.f(R.raw.db_migration_placeholder, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                            ak0Var.getAnimatedDrawable().K(1);
                            ak0Var.d();
                            d10.addView(ak0Var, org.telegram.ui.Components.gb1.u(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1));
                            TextView textView = new TextView(context);
                            textView.setTextSize(1, 24.0f);
                            textView.setText(LocaleController.getString(R.string.OptimizingTelegram));
                            int i38 = org.telegram.ui.ActionBar.y6.G6;
                            org.telegram.ui.ActionBar.f7.V(textView, i38, null);
                            textView.setGravity(1);
                            TextView e = org.telegram.messenger.vh.e(d10, textView, org.telegram.ui.Components.gb1.t(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                            e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                            e.setTextSize(1, 14.0f);
                            e.setText(LocaleController.getString(R.string.OptimizingTelegramDescription1));
                            org.telegram.ui.ActionBar.f7.V(e, i38, null);
                            e.setGravity(1);
                            TextView e10 = org.telegram.messenger.vh.e(d10, e, org.telegram.ui.Components.gb1.t(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                            e10.setTextSize(1, 14.0f);
                            e10.setText(LocaleController.getString(R.string.OptimizingTelegramDescription2));
                            org.telegram.ui.ActionBar.f7.V(e10, i38, null);
                            e10.setGravity(1);
                            d10.addView(e10, org.telegram.ui.Components.gb1.t(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                            nuVar3.addView(d10, org.telegram.ui.Components.gb1.i(-1, -2, 16));
                            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, nuVar3, null);
                            nuVar3.setOnTouchListener(new mu());
                            this.R3 = nuVar3;
                            nuVar3.setAlpha(0.0f);
                            ((tx) this.fragmentView).addView(this.R3);
                            this.R3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                        }
                        this.R3.setTag(1);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseOpened) {
                    if (getMessagesStorage().showClearDatabaseAlert) {
                        getMessagesStorage().showClearDatabaseAlert = false;
                        ea1.n(this);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.userEmojiStatusUpdated) {
                    n5((TLRPC.User) objArr[0], true);
                    return;
                }
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    n5(UserConfig.getInstance(i11).getCurrentUser(), true);
                    o5();
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseReset) {
                    zArr[this.currentAccount] = false;
                    q4(getAccountInstance());
                    getMessagesController().loadPinnedDialogs(this.W2, 0L, null);
                    return;
                }
                if (i10 == NotificationCenter.chatlistFolderUpdate) {
                    int intValue2 = ((Integer) objArr[0]).intValue();
                    int i39 = 0;
                    while (true) {
                        ay[] ayVarArr8 = this.e0;
                        if (i39 >= ayVarArr8.length) {
                            return;
                        }
                        ay ayVar4 = ayVarArr8[i39];
                        if (ayVar4 != null && (((i12 = ayVar4.s) == 7 || i12 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[ayVar4.s - 7]) != null && intValue2 == dialogFilter.id)) {
                            ayVar4.q(true);
                            return;
                        }
                        i39++;
                    }
                } else {
                    if (i10 != NotificationCenter.dialogTranslate) {
                        if (i10 == NotificationCenter.storiesUpdated) {
                            p5(this.V);
                            q5(0, true);
                            return;
                        }
                        if (i10 == NotificationCenter.storiesEnabledUpdate) {
                            o5();
                            return;
                        }
                        if (i10 == NotificationCenter.unconfirmedAuthUpdate) {
                            c5();
                            return;
                        }
                        if (i10 == NotificationCenter.premiumPromoUpdated) {
                            c5();
                            return;
                        }
                        if (i10 == NotificationCenter.starBalanceUpdated || i10 == NotificationCenter.starSubscriptionsLoaded) {
                            c5();
                            return;
                        } else if (i10 == NotificationCenter.appConfigUpdated) {
                            c5();
                            return;
                        } else {
                            if (i10 == NotificationCenter.activeAuctionsUpdated) {
                                c5();
                                return;
                            }
                            return;
                        }
                    }
                    long longValue6 = ((Long) objArr[0]).longValue();
                    int i40 = 0;
                    while (true) {
                        ay[] ayVarArr9 = this.e0;
                        if (i40 >= ayVarArr9.length) {
                            return;
                        }
                        ay ayVar5 = ayVarArr9[i40];
                        if (ayVar5.a != null) {
                            int i41 = 0;
                            while (true) {
                                if (i41 < ayVar5.a.getChildCount()) {
                                    View childAt2 = ayVar5.a.getChildAt(i41);
                                    if (childAt2 instanceof org.telegram.ui.Cells.p2) {
                                        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt2;
                                        if (longValue6 == p2Var.getDialogId()) {
                                            p2Var.s();
                                            break;
                                        }
                                    }
                                    i41++;
                                }
                            }
                        }
                        i40++;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof hi.m3) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final float e4() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.b.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    public final void e5(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        MessagesController.DialogFilter dialogFilter;
        Object[] objArr;
        boolean z12;
        boolean z13;
        if (this.z0 == null || this.inPreviewMode || this.q3) {
            return;
        }
        tw twVar = this.G3;
        if (twVar == null || !twVar.c()) {
            org.telegram.ui.Components.k80 k80Var = this.L0;
            if (k80Var != null) {
                k80Var.u();
                this.L0 = null;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            oe.b bVar = this.r;
            boolean z14 = true;
            boolean z15 = false;
            if (size <= 1) {
                r52 = 0;
                if (this.z0.getVisibility() != 8) {
                    this.z0.setIsEditing(false);
                    Q4(false);
                    this.n3 = false;
                    if (this.m3) {
                        this.m3 = false;
                        this.e0[0].setTranslationX(0.0f);
                        this.e0[1].setTranslationX(r2[0].getMeasuredWidth());
                    }
                    if (this.e0[0].h != this.z0.getDefaultTabId()) {
                        this.e0[0].h = this.z0.getDefaultTabId();
                        gw gwVar = this.e0[0].d;
                        gwVar.h = 0;
                        gwVar.l();
                        ay ayVar = this.e0[0];
                        ayVar.s = this.R0;
                        ayVar.d.l();
                    }
                    this.e0[1].setVisibility(8);
                    ay ayVar2 = this.e0[1];
                    ayVar2.h = 0;
                    gw gwVar2 = ayVar2.d;
                    gwVar2.h = 0;
                    gwVar2.l();
                    ay ayVar3 = this.e0[1];
                    ayVar3.s = this.R0;
                    ayVar3.d.l();
                    this.w = false;
                    if (this.fragmentView != null) {
                        boolean z16 = (this.isPaused || this.R3 != null) ? false : z11;
                        if (!this.q3) {
                            bVar.a(false, z16);
                        }
                    }
                    int i10 = 0;
                    while (true) {
                        ay[] ayVarArr = this.e0;
                        if (i10 >= ayVarArr.length) {
                            break;
                        }
                        ay ayVar4 = ayVarArr[i10];
                        if (ayVar4.s == 0 && ayVar4.v == 2 && h4() && ((L0 = this.e0[i10].c.L0()) == 0 || L0 == 1)) {
                            this.e0[i10].c.h1(1, (int) this.N);
                        }
                        this.e0[i10].a.setScrollingTouchSlop(0);
                        this.e0[i10].a.requestLayout();
                        this.e0[i10].requestLayout();
                        i10++;
                    }
                    this.z0.L = -1;
                    r52 = 0;
                }
            } else if (z10 || this.z0.getVisibility() != 0) {
                boolean z17 = this.z0.getVisibility() != 0 ? false : z11;
                this.w = true;
                boolean isEmpty = this.z0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z18 = (this.isPaused || this.R3 != null) ? false : z11;
                    if (!this.q3) {
                        bVar.a(this.w, z18);
                    }
                }
                int currentTabId = this.z0.getCurrentTabId();
                int currentTabStableId = this.z0.getCurrentTabStableId();
                if (currentTabId == this.z0.getDefaultTabId() || currentTabId < dialogFilters.size()) {
                    objArr = false;
                } else {
                    this.z0.L = -1;
                    objArr = true;
                }
                qx qxVar = this.z0;
                qxVar.h.clear();
                qxVar.j0.clear();
                qxVar.l0.clear();
                qxVar.m0.clear();
                qxVar.n0.clear();
                qxVar.o0.clear();
                qxVar.M = 0;
                int size2 = dialogFilters.size();
                int i11 = 0;
                while (i11 < size2) {
                    if (dialogFilters.get(i11).isDefault()) {
                        this.z0.a(i11, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i11).locked);
                        z13 = z15;
                    } else {
                        MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i11);
                        z13 = z15;
                        this.z0.a(i11, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i11).locked);
                    }
                    i11++;
                    z15 = z13;
                }
                boolean z19 = z15;
                if (currentTabStableId >= 0) {
                    if (objArr != false && !this.z0.h(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            qx qxVar2 = this.z0;
                            if (qxVar2.h(qxVar2.k0.get(currentTabId, -1))) {
                                break;
                            } else {
                                currentTabId--;
                            }
                        }
                        if (currentTabId < 0) {
                            currentTabId = z19 ? 1 : 0;
                        }
                    }
                    if (this.z0.k0.get(this.e0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                        this.e0[z19 ? 1 : 0].h = currentTabId;
                        isEmpty = true;
                    }
                }
                int i12 = z19 ? 1 : 0;
                while (true) {
                    ay[] ayVarArr2 = this.e0;
                    if (i12 >= ayVarArr2.length) {
                        break;
                    }
                    if (ayVarArr2[i12].h >= dialogFilters.size()) {
                        this.e0[i12].h = dialogFilters.size() - 1;
                    }
                    this.e0[i12].a.setScrollingTouchSlop(1);
                    i12++;
                }
                qx qxVar3 = this.z0;
                qxVar3.F.setItemAnimator(z17 ? qxVar3.s0 : null);
                qxVar3.I.l();
                if (isEmpty) {
                    Z4(z19);
                }
                qx qxVar4 = this.z0;
                int currentTabId2 = qxVar4.getCurrentTabId();
                ArrayList arrayList = qxVar4.h;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.p00) arrayList.get(i13)).a == currentTabId2) {
                            z12 = ((org.telegram.ui.Components.p00) arrayList.get(i13)).f;
                            break;
                        }
                        i13++;
                    }
                }
                if (z12) {
                    qx qxVar5 = this.z0;
                    ArrayList arrayList2 = qxVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        qxVar5.f((org.telegram.ui.Components.p00) arrayList2.get(0), 0);
                    }
                }
                r52 = 0;
            } else {
                r52 = 0;
            }
            b5(r52);
            int i14 = this.e0[r52].s;
            if ((i14 == 7 || i14 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i14 - 7]) != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= dialogFilters.size()) {
                        z14 = false;
                        break;
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i15);
                    if (dialogFilter3 != null && dialogFilter3.id == dialogFilter.id) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (z14) {
                    return;
                }
                Z4(false);
            }
        }
    }

    public final di.h7 f4() {
        return getMessagesController().getStoriesController();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f5(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        jx jxVar;
        boolean z13;
        org.telegram.ui.Components.t91 t91Var;
        if (!this.q3 || this.l2 || (jxVar = this.C0) == null) {
            return;
        }
        ArrayList<ig.p0> currentSearchFilters = jxVar.getCurrentSearchFilters();
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (int i10 = 0; i10 < currentSearchFilters.size(); i10++) {
            if (currentSearchFilters.get(i10).a()) {
                z15 = true;
            } else if (currentSearchFilters.get(i10).d == 4) {
                z16 = true;
            } else if (currentSearchFilters.get(i10).d == 6) {
                z17 = true;
            } else if (currentSearchFilters.get(i10).d == 7) {
                z14 = true;
            }
        }
        if (z14) {
            z11 = false;
        }
        boolean z18 = !(arrayList == null || arrayList.isEmpty()) || !(arrayList2 == null || arrayList2.isEmpty()) || z11;
        if ((z15 || z18 || !z10) && z18) {
            if (arrayList == null || arrayList.isEmpty() || z16) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z17) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null || z11) {
                this.b0.G1(arrayList, arrayList2, z11);
                z13 = true;
                if (!z13) {
                    this.b0.G1(null, null, false);
                }
                if (!z12) {
                    this.b0.getAdapter().l();
                }
                t91Var = this.a0;
                if (t91Var != null) {
                    t91Var.b(z13, true);
                }
                this.b0.setEnabled(z13);
                this.s.a(z13, true);
            }
        }
        z13 = false;
        if (!z13) {
        }
        if (!z12) {
        }
        t91Var = this.a0;
        if (t91Var != null) {
        }
        this.b0.setEnabled(z13);
        this.s.a(z13, true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.k80 k80Var = this.L0;
        if (k80Var != null) {
            k80Var.u();
        }
    }

    public final UndoView g4() {
        V3();
        UndoView[] undoViewArr = this.y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            tx txVar = (tx) this.fragmentView;
            txVar.removeView(undoViewArr[0]);
            txVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void g5() {
        float f7 = (((-this.g4) - this.j4) - this.u1) - this.v1;
        org.telegram.ui.Components.j20 j20Var = this.t0;
        if (j20Var != null) {
            j20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.j20 j20Var2 = this.u0;
        if (j20Var2 != null) {
            j20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            fi.v3 v3Var = this.p0;
            if (v3Var != null) {
                v3Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.e5 getBackButtonState() {
        return (m4() || this.G3.f) ? org.telegram.ui.ActionBar.e5.a : org.telegram.ui.ActionBar.e5.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.a4 = ofFloat;
            return ofFloat;
        }
        int clamp = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.a4 = ofFloat2;
        ofFloat2.addUpdateListener(new ev(this, 2));
        this.a4.setInterpolator(org.telegram.ui.Components.ds.g);
        this.a4.setDuration(clamp);
        this.a4.start();
        return this.a4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0230 A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        if (w0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.t8));
        }
        if (this.W2 == 0) {
            jx jxVar = this.C0;
            if (jxVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.h7(jxVar.a0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.y6.s1}, (org.telegram.ui.ActionBar.g7) null, !this.W ? org.telegram.ui.ActionBar.y6.A8 : org.telegram.ui.ActionBar.y6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D8));
        } else {
            jx jxVar2 = this.C0;
            if (jxVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.h7(jxVar2.a0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.y6.s1}, (org.telegram.ui.ActionBar.g7) null, !this.W ? org.telegram.ui.ActionBar.y6.P8 : org.telegram.ui.ActionBar.y6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.R8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, TLObject.FLAG_21, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.x8));
        NumberTextView numberTextView = this.h1;
        int i10 = org.telegram.ui.ActionBar.y6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        if (this.z0 != null) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar == null || !kVar.q()) {
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.z0, 0, new Class[]{org.telegram.ui.Components.s00.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.q00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.q00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.z0.getTabsContainer(), 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.z0, 0, new Class[]{org.telegram.ui.Components.s00.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Gh));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.q00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fh));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.q00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Eh));
            }
        }
        arrayList.addAll(org.telegram.ui.Components.gb1.C(new j6(7, this), org.telegram.ui.ActionBar.y6.w8, i10));
        int i11 = 0;
        while (i11 < 3) {
            if (i11 == 2) {
                jx jxVar3 = this.C0;
                if (jxVar3 == null) {
                    i11++;
                } else {
                    view = jxVar3.a0;
                    view2 = view;
                    if (view2 == null) {
                        arrayList.add(new org.telegram.ui.ActionBar.h7(view2, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.i6));
                        arrayList.add(new org.telegram.ui.ActionBar.h7(view2, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
                        int i12 = org.telegram.ui.Cells.z3.h;
                        arrayList.add(new org.telegram.ui.ActionBar.h7(view2, 4, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.o6));
                    }
                    i11++;
                }
            } else {
                ay[] ayVarArr = this.e0;
                if (ayVarArr == null) {
                    i11++;
                } else {
                    view = i11 < ayVarArr.length ? ayVarArr[i11].a : null;
                    view2 = view;
                    if (view2 == null) {
                    }
                    i11++;
                }
            }
        }
        if (this.e0 != null) {
            int i13 = 0;
            while (true) {
                ay[] ayVarArr2 = this.e0;
                if (i13 >= ayVarArr2.length) {
                    break;
                }
                if (this.W2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.h7(ayVarArr2[i13].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.h7(ayVarArr2[i13].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
                }
                int i14 = SharedConfig.PASSCODE_TYPE_PIN;
                int i15 = org.telegram.ui.ActionBar.y6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.e0[i13].a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.e0[i13].a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.e0[i13].w, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
                this.e0[i13].d.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
                i13++;
            }
        }
        int i16 = 0;
        while (true) {
            UndoView[] undoViewArr = this.y0;
            if (i16 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h7(undoViewArr[i16], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fi));
            i16++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.o5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.q7));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Si));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vi));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wi));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Xi));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ah));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.bh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ch));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.dh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.eh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.fh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ih));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.jh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.kh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.gh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.hh));
        ig.r0 r0Var = this.b0;
        if (r0Var != null) {
            arrayList.addAll(r0Var.getThemeDescriptions());
            this.b0.updateColors();
        }
        ey eyVar = this.h0;
        if (eyVar != null) {
            eyVar.updateColors();
            this.h0.invalidate();
        }
        jx jxVar4 = this.C0;
        if (jxVar4 != null) {
            org.telegram.ui.Components.qo0 qo0Var = jxVar4.b0;
            SparseArray sparseArray = jxVar4.h;
            bi.r1 r1Var = jxVar4.a0;
            for (int i17 = 0; i17 < r1Var.getChildCount(); i17++) {
                View childAt = r1Var.getChildAt(i17);
                if ((childAt instanceof org.telegram.ui.Cells.m6) || (childAt instanceof org.telegram.ui.Cells.p2) || (childAt instanceof org.telegram.ui.Cells.p4)) {
                    arrayList.add(new org.telegram.ui.ActionBar.h7(childAt, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
                }
            }
            for (int i18 = 0; i18 < jxVar4.getChildCount(); i18++) {
                if (jxVar4.getChildAt(i18) instanceof h10) {
                    arrayList.addAll(((h10) jxVar4.getChildAt(i18)).getThemeDescriptions());
                }
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view3 = (View) sparseArray.valueAt(i19);
                if (view3 instanceof h10) {
                    arrayList.addAll(((h10) view3).getThemeDescriptions());
                }
            }
            h10 h10Var = jxVar4.O0;
            if (h10Var != null) {
                arrayList.addAll(h10Var.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.h7(qo0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h7(qo0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.y6));
            arrayList.addAll(org.telegram.ui.Components.gb1.C(new org.telegram.ui.Components.b7(jxVar4, 4), org.telegram.ui.ActionBar.y6.y8));
        }
        org.telegram.ui.Cells.x2 x2Var = this.M1;
        int i20 = 5;
        if (x2Var != null) {
            arrayList.addAll(org.telegram.ui.Components.gb1.C(new org.telegram.ui.Components.b7(new ui(x2Var, 19), i20), org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.y6));
        }
        org.telegram.ui.Cells.xa xaVar = this.N1;
        if (xaVar != null) {
            arrayList.addAll(org.telegram.ui.Components.gb1.C(new org.telegram.ui.Components.b7(new ui(xaVar, 20), i20), org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.y6, org.telegram.ui.ActionBar.y6.I6, org.telegram.ui.ActionBar.y6.q7));
        }
        org.telegram.ui.Cells.m mVar = this.L1;
        if (mVar != null) {
            arrayList.addAll(org.telegram.ui.Components.gb1.C(new org.telegram.ui.Components.b7(new ui(mVar, 21), i20), org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.y6, org.telegram.ui.ActionBar.y6.I6, org.telegram.ui.ActionBar.y6.q7));
        }
        return arrayList;
    }

    public final boolean h4() {
        return !this.l2 && this.R0 == 0 && this.Y2 == 0 && this.W2 == 0 && getMessagesController().hasHiddenArchive();
    }

    public final void h5(boolean z10) {
        boolean z11 = this.l2;
        boolean z12 = (!z11 || this.R0 == 10) && this.W2 == 0 && this.Y2 == 0 && !this.inPreviewMode && (!this.j2 || z11) && !this.U3;
        org.telegram.ui.Components.j20 j20Var = this.t0;
        if (j20Var != null) {
            j20Var.e(z12, z10);
        }
        org.telegram.ui.Components.j20 j20Var2 = this.u0;
        if (j20Var2 != null) {
            j20Var2.e(z12, z10);
        }
    }

    public final boolean i4() {
        ArrayList arrayList = this.D2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void i5(boolean z10, boolean z11) {
        boolean z12;
        if (this.n0 != null) {
            org.telegram.ui.ActionBar.w0 w0Var = this.m0;
            if (w0Var == null || w0Var.getVisibility() != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= getDownloadController().downloadingFiles.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i10).getFileName())) {
                            z12 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (getDownloadController().hasUnviewedDownloads() || z12 || (this.g0.getVisibility() == 0 && this.g0.getAlpha() == 1.0f && !z11)) {
                    this.i0 = true;
                } else {
                    this.i0 = false;
                }
                F3();
                boolean z13 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.d2;
                boolean z14 = i11 == 3 || i11 == 5;
                this.o0.setSubtext(LocaleController.getString(z13 ? z14 ? R.string.MenuProxyConnected : R.string.MenuProxyConnecting : R.string.MenuProxyDisabled));
                this.n0.b(z13, z14, z10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        tw twVar;
        return (this.j2 || (twVar = this.G3) == null || twVar.getFragment() == null) ? i0.a.h(getThemedColor(org.telegram.ui.ActionBar.y6.d6)) > 0.699999988079071d : this.G3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j4(boolean z10) {
        boolean z11;
        this.actionBar.p();
        this.I2.clear();
        org.telegram.ui.ActionBar.j2 j2Var = this.e1;
        int i10 = 1;
        if (j2Var != null) {
            j2Var.c(0.0f, true);
        }
        qx qxVar = this.z0;
        if (qxVar != null) {
            qxVar.b(org.telegram.ui.ActionBar.y6.K8, org.telegram.ui.ActionBar.y6.I8, org.telegram.ui.ActionBar.y6.J8, org.telegram.ui.ActionBar.y6.L8, org.telegram.ui.ActionBar.y6.d6);
        }
        ValueAnimator valueAnimator = this.v3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.v3 = null;
        }
        if (this.u3 == 0.0f) {
            return;
        }
        K4(-b4());
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ay[] ayVarArr = this.e0;
            if (i12 >= ayVarArr.length) {
                break;
            }
            ay ayVar = ayVarArr[i12];
            if (ayVar != null) {
                ayVar.a.I0(true);
            }
            i12++;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp((this.K ? 81 : 0) + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u3, 0.0f);
        this.v3 = ofFloat;
        ofFloat.addUpdateListener(new jv(this, max, i10));
        this.v3.addListener(new cx(this, max, i11));
        this.v3.setInterpolator(org.telegram.ui.Components.ds.f);
        this.v3.setDuration(200L);
        this.v3.start();
        this.Y0 = false;
        ArrayList arrayList = this.a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i13);
                o00.v0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i13++;
                arrayList = arrayList;
                size = size;
                i11 = 0;
                i10 = 1;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.Z0) {
            getMessagesController().reorderPinnedDialogs(this.W2, null, 0L);
            z11 = 0;
            this.Z0 = false;
        } else {
            z11 = 0;
        }
        b5(true);
        if (this.e0 != null) {
            int i14 = z11;
            while (true) {
                ay[] ayVarArr2 = this.e0;
                if (i14 >= ayVarArr2.length) {
                    break;
                }
                ayVarArr2[i14].d.H = z11;
                i14++;
            }
        }
        int i15 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i16 = z11;
        if (z10) {
            i16 = MessagesController.UPDATE_MASK_CHAT;
        }
        q5(i16 | i15, true);
    }

    public final void j5() {
        if (!this.s3 || this.actionBar == null) {
            return;
        }
        int themedColor = getThemedColor((this.W2 == 0 && this.Y2 == 0) ? org.telegram.ui.ActionBar.y6.v8 : org.telegram.ui.ActionBar.y6.O8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.y6.y8;
        kVar.y(i0.a.f(this.x1, themedColor, getThemedColor(i10)), false);
        this.actionBar.y(i0.a.f(this.x1, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.x(i0.a.f(this.x1, getThemedColor((this.W2 == 0 && this.Y2 == 0) ? org.telegram.ui.ActionBar.y6.t8 : org.telegram.ui.ActionBar.y6.N8), getThemedColor(org.telegram.ui.ActionBar.y6.z8)), false);
    }

    public final void k4(boolean z10) {
        if (this.G3.c()) {
            z10 = true;
        }
        if (z10 && this.b2) {
            return;
        }
        this.U3 = z10;
        h5(true);
        if (z10) {
            fi.v3 v3Var = this.p0;
            if (v3Var != null) {
                v3Var.e(true);
            }
            fi.v3 v3Var2 = this.q0;
            if (v3Var2 != null) {
                v3Var2.e(true);
            }
        }
    }

    public final void k5() {
        org.telegram.ui.Components.qr0 qr0Var;
        jw jwVar = this.B1;
        ArrayList arrayList = this.I2;
        if (jwVar == null) {
            if (this.R0 == 10) {
                k4(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        l5();
        if (arrayList.isEmpty()) {
            String string = LocaleController.getString((this.R0 == 3 && this.f2 == null) ? R.string.ForwardTo : R.string.SelectChat);
            if (this.Q3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(string);
            } else {
                this.actionBar.G(string, true, 350L, org.telegram.ui.Components.ds.h);
            }
            if (this.B1.getTag() != null) {
                this.B1.k0(false, false, false);
                this.B1.M();
                this.B1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.B1.getTag() == null) {
                if (!i4() && this.E2 == null) {
                    this.B1.setFieldText("");
                }
                this.B1.setTag(1);
                if (!this.W3 && (qr0Var = this.G2) != null) {
                    this.W3 = true;
                    String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                    qr0Var.j();
                    qr0Var.F = string2;
                    org.telegram.ui.Components.or0 or0Var = qr0Var.a[0];
                    if (string2 != null) {
                        or0Var.e.l(string2, false);
                    }
                    org.telegram.ui.Components.mp0 mp0Var = new org.telegram.ui.Components.mp0(qr0Var, 3);
                    qr0Var.G = mp0Var;
                    AndroidUtilities.runOnUIThread(mp0Var, 1000L);
                }
            }
            this.C1.g(Math.max(1, arrayList.size()), true);
            int i10 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            int i11 = 0;
            long j10 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                long longValue = ((Long) obj).longValue();
                long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(longValue);
                if (sendPaidMessagesStars <= 0 && longValue > 0) {
                    sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(longValue));
                }
                j10 += sendPaidMessagesStars;
            }
            this.C1.i(i10, j10, true);
            this.B1.O1();
            if (this.Q3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
            } else {
                this.actionBar.G(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.ds.h);
            }
        }
        this.Q3 = arrayList.isEmpty();
    }

    public final void l5() {
        org.telegram.ui.Components.qr0 qr0Var = this.G2;
        if (qr0Var == null) {
            return;
        }
        int i10 = this.currentAccount;
        qr0Var.h(i10);
        qr0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        ArrayList arrayList = qr0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.I2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        org.telegram.ui.Components.or0 or0Var = qr0Var.a[0];
        if (qr0Var.b == 1) {
            or0Var.d.l(qr0Var.c(or0Var), false);
        }
    }

    public final boolean m4() {
        return this.W2 == 1;
    }

    public final void m5(boolean z10) {
        boolean z11;
        if (this.l0 == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = getDownloadController().downloadingFiles;
        int size = arrayList.size();
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z11 = false;
                break;
            }
            MessageObject messageObject = arrayList.get(i10);
            i10++;
            MessageObject messageObject2 = messageObject;
            if (messageObject2.getDocument() != null && messageObject2.getDocument().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        ArrayList<MessageObject> arrayList2 = getDownloadController().recentDownloadingFiles;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            MessageObject messageObject3 = arrayList2.get(i11);
            i11++;
            MessageObject messageObject4 = messageObject3;
            if (messageObject4.getDocument() != null && messageObject4.getDocument().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().isPremium() && !getMessagesController().premiumFeaturesBlocked() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    public final boolean n4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id);
        return (topics == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id);
    }

    public final void n5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.r5 r5Var;
        qw qwVar = this.E0;
        org.telegram.ui.Components.r5 r5Var2 = null;
        if (qwVar != null && (r5Var = qwVar.a0) != null && qwVar.q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                r5Var.j(emojiStatusDocumentId.longValue(), z10);
                r5Var.m(z11, z10);
            } else if (user == null || !MessagesController.getInstance(qwVar.f).isPremiumUser(user)) {
                r5Var.g(null, z10);
                r5Var.m(false, z10);
            } else {
                if (qwVar.N0 == null) {
                    qwVar.N0 = qwVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    qwVar.N0 = new di.i(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), qwVar.N0);
                }
                Drawable drawable = qwVar.N0;
                int i10 = org.telegram.ui.ActionBar.y6.zh;
                cy cyVar = qwVar.e0;
                org.telegram.ui.ActionBar.f7.y(qwVar, drawable, i10, cyVar != null ? cyVar.getResourceProvider() : null, PorterDuff.Mode.MULTIPLY);
                r5Var.g(qwVar.N0, z10);
                r5Var.m(false, z10);
            }
            r5Var.k(Integer.valueOf(qwVar.f(org.telegram.ui.ActionBar.y6.zh)));
            qwVar.W.invalidate();
        }
        if (this.E3 == null || this.actionBar == null) {
            return;
        }
        Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
        this.C3 = null;
        if (emojiStatusDocumentId2 != null) {
            boolean z12 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.E3.j(emojiStatusDocumentId2.longValue(), z10);
            this.E3.m(z12, z10);
            if (z12) {
                this.C3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new hv(this, 2));
            c61.t(this.currentAccount);
        } else if (user == null || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            this.E3.g(null, z10);
            this.E3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        } else {
            if (this.L3 == null) {
                this.L3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.L3 = new gx(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.L3);
            }
            Drawable drawable2 = this.L3;
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.zh);
            this.x4 = themedColor;
            drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            this.E3.g(this.L3, z10);
            this.E3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(new hv(this, 3));
            c61.t(this.currentAccount);
        }
        org.telegram.ui.Components.r5 r5Var3 = this.E3;
        int i11 = org.telegram.ui.ActionBar.y6.zh;
        r5Var3.k(Integer.valueOf(getThemedColor(i11)));
        org.telegram.ui.Cells.o oVar = this.F3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i11));
        }
        vw vwVar = this.M0;
        if (vwVar == null || !(vwVar.getContentView() instanceof c61)) {
            return;
        }
        org.telegram.ui.ActionBar.b6 titleTextView = this.actionBar.getTitleTextView();
        c61 c61Var = (c61) this.M0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.r5 r5Var4 = this.E3;
            if (rightDrawable == r5Var4) {
                r5Var2 = r5Var4;
            }
        }
        c61Var.y(r5Var2, titleTextView);
    }

    public final boolean o4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i10 = this.e0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.q() || this.actionBar.r(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        return dialogFilter != null ? dialogFilter.pinnedDialogs.indexOfKey(dialog.id) >= 0 : dialog.pinned;
    }

    public final void o5() {
        fi.v3 v3Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.O3 != storiesEnabled) {
            g5();
            if (!this.O3 && storiesEnabled && (v3Var = this.p0) != null) {
                v3Var.u();
            }
            this.O3 = storiesEnabled;
        }
        org.telegram.ui.Components.j20 j20Var = this.t0;
        if (j20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            j20Var.setImageResource(R.drawable.floating_check);
            this.t0.setContentDescription(LocaleController.getString(R.string.Done));
        } else {
            j20Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.G3.c() || !this.G3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.k80 k80Var = this.L0;
            if (k80Var == null) {
                qx qxVar = this.z0;
                if (qxVar == null || !qxVar.n) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar == null || !kVar.q()) {
                        if (!this.b.f) {
                            qx qxVar2 = this.z0;
                            if (qxVar2 != null && qxVar2.getVisibility() == 0 && !this.h3) {
                                qx qxVar3 = this.z0;
                                if (!qxVar3.O && !this.m3) {
                                    ArrayList arrayList = qxVar3.h;
                                    if (!arrayList.isEmpty() && qxVar3.L != ((org.telegram.ui.Components.p00) arrayList.get(0)).a) {
                                        if (z10) {
                                            qx qxVar4 = this.z0;
                                            ArrayList arrayList2 = qxVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                qxVar4.f((org.telegram.ui.Components.p00) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            jw jwVar = this.B1;
                            if (jwVar == null || !jwVar.q0()) {
                                qw qwVar = this.E0;
                                if (qwVar.O != 0 || qwVar.S.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                qwVar.h.y0(0);
                                return false;
                            }
                            if (z10) {
                                this.B1.j0(true);
                            }
                        } else if (z10) {
                            this.X.r.getText().clear();
                            this.Y.b(false);
                            this.X.r.clearFocus();
                            return false;
                        }
                    } else if (z10) {
                        jx jxVar = this.C0;
                        if (jxVar != null && jxVar.getVisibility() == 0) {
                            this.C0.R(false);
                        }
                        j4(true);
                        return false;
                    }
                } else if (z10) {
                    qxVar.setIsEditing(false);
                    Q4(false);
                    return false;
                }
            } else if (z10) {
                k80Var.u();
                this.L0 = null;
                return false;
            }
        } else if (z10) {
            this.G3.a();
            jx jxVar2 = this.C0;
            if (jxVar2 != null) {
                jxVar2.S();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyHidden() {
        bi.cc ccVar;
        qx qxVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.g(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                jx jxVar = this.C0;
                if (jxVar != null) {
                    jxVar.d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (qxVar = this.z0) != null && qxVar.getVisibility() == 0 && this.r.f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.e0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (ccVar = this.K0) != null && ccVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        J3();
        this.r0 = true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        fi.v3 v3Var;
        super.onBecomeFullyVisible();
        if (m4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = Z3(this.currentAccount, this.R0, this.W2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                O4();
            }
        }
        if (this.r0 && !this.s0 && (v3Var = this.p0) != null && this.O3) {
            this.s0 = true;
            this.r0 = false;
            v3Var.u();
        }
        AndroidUtilities.runOnUIThread(new sv(this, 4), 200L);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.k80 k80Var = this.L0;
        if (k80Var != null) {
            k80Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.e2 e2Var;
        super.onDialogDismiss(dialog);
        if (this.W2 == 0 && this.Y2 == 0 && (e2Var = this.T1) != null && dialog == e2Var && getParentActivity() != null) {
            r3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.l2 = bundle.getBoolean("onlySelect", false);
            this.m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f2 = this.arguments.getString("selectAlertString");
            this.g2 = this.arguments.getString("selectAlertStringGroup");
            this.h2 = this.arguments.getString("addToGroupAlertString");
            this.r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.t2 = this.arguments.getBoolean("afterSignup", false);
            this.W2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.Y2 = j10;
            if (j10 != 0) {
                this.Z2 = getMessagesController().getChat(Long.valueOf(this.Y2));
                this.a3 = getMessagesController().getChatFull(this.Y2);
            }
            this.i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.u2);
            this.arguments.getInt("otherwiseRelogin");
            this.v2 = this.arguments.getBoolean("allowGroups", true);
            this.w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.y2 = this.arguments.getBoolean("allowChannels", true);
            this.z2 = this.arguments.getBoolean("allowUsers", true);
            this.A2 = this.arguments.getBoolean("allowBots", true);
            this.B2 = this.arguments.getBoolean("closeFragment", true);
            this.F = this.arguments.getBoolean("allowGlobalSearch", true);
            this.W = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.G = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.H = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.R0 == 0) {
            this.U1 = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        this.K3 = getNotificationCenter().createObserversGroup(this);
        if (this.n2 == null) {
            this.d2 = getConnectionsManager().getConnectionState();
            this.K3.addGlobal(NotificationCenter.emojiLoaded);
            if (!this.l2) {
                this.K3.addGlobal(NotificationCenter.closeSearchByActiveAction);
                this.K3.addGlobal(NotificationCenter.proxySettingsChanged);
                this.K3.add(NotificationCenter.filterSettingsUpdated);
                this.K3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.K3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.K3.addGlobal(NotificationCenter.didSetPasscode);
        }
        this.K3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.R0 == 0) {
            this.K3.add(NotificationCenter.chatlistFolderUpdate);
            this.K3.add(NotificationCenter.dialogTranslate);
        }
        q4(getAccountInstance());
        di.h7 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.s) {
                ConnectionsManager.getInstance(storiesController.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new di.g6(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.W2, 0L, null);
        if (this.R3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            nu nuVar = this.R3;
            if (nuVar.getParent() != null) {
                ((ViewGroup) nuVar.getParent()).removeView(nuVar);
            }
            this.R3 = null;
        }
        if (m4()) {
            di.h7 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.z) {
                storiesController2.Q(true);
            }
        } else {
            getMessagesController().getStoriesController().T();
        }
        getContactsController().loadGlobalPrivacySetting();
        if (getMessagesController().savedViewAsChats) {
            getMessagesController().getSavedMessagesController().preloadDialogs(true);
        }
        if (this.Y2 != 0) {
            getMessagesController().loadFullChat(this.Y2, 0, true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        this.i4 = this.W ? AndroidUtilities.dp(72.0f) : 0;
        this.j4 = this.W ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.K3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.K3 = null;
        }
        jw jwVar = this.B1;
        if (jwVar != null) {
            jwVar.z0();
        }
        org.telegram.ui.Components.qr0 qr0Var = this.G2;
        if (qr0Var != null) {
            qr0Var.j();
        }
        org.telegram.ui.Components.c71 c71Var = this.H2;
        if (c71Var != null) {
            AndroidUtilities.cancelRunOnUIThread(c71Var);
            this.H2 = null;
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.p3.unlock();
        this.C2 = null;
        ea1 ea1Var = ea1.b;
        if (ea1Var != null) {
            ea1Var.dismiss();
            ea1.b = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPanTranslationUpdate(float f7) {
        if (this.e0 == null) {
            return;
        }
        this.J0 = f7;
        jw jwVar = this.B1;
        int i10 = 0;
        if (jwVar == null || !jwVar.q0()) {
            while (true) {
                ay[] ayVarArr = this.e0;
                if (i10 >= ayVarArr.length) {
                    break;
                }
                ayVarArr[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.qc qcVar = this.o3;
                if (qcVar != null) {
                    qcVar.l();
                }
            }
            jx jxVar = this.C0;
            if (jxVar != null) {
                jxVar.setTranslationY(this.J0 + this.I0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f7);
        while (true) {
            ay[] ayVarArr2 = this.e0;
            if (i10 >= ayVarArr2.length) {
                break;
            }
            ayVarArr2[i10].setTranslationY(0.0f);
            i10++;
        }
        if (!this.l2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.qc qcVar2 = this.o3;
            if (qcVar2 != null) {
                qcVar2.l();
            }
        }
        jx jxVar2 = this.C0;
        if (jxVar2 != null) {
            jxVar2.setTranslationY(this.I0);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.qc qcVar = this.S;
        if (qcVar != null) {
            qcVar.b();
            this.S = null;
        }
        tw twVar = this.G3;
        if (twVar != null) {
            twVar.r = true;
            ax axVar = twVar.a;
            if (axVar != null) {
                axVar.onPause();
            }
        }
        org.telegram.ui.Components.k80 k80Var = this.L0;
        if (k80Var != null) {
            k80Var.u();
        }
        jw jwVar = this.B1;
        if (jwVar != null) {
            jwVar.B0();
        }
        int i10 = 0;
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.e0 == null) {
            return;
        }
        while (true) {
            ay[] ayVarArr = this.e0;
            if (i10 >= ayVarArr.length) {
                return;
            }
            ayVarArr[i10].d.getClass();
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i10 != 1) {
            if (i10 == 4) {
                for (int i11 : iArr) {
                    if (i11 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) == null) {
                    return;
                }
                filesMigrationBottomSheet.migrateOldFolder();
                return;
            }
            return;
        }
        for (int i12 = 0; i12 < strArr.length; i12++) {
            if (iArr.length > i12) {
                String str = strArr[i12];
                str.getClass();
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        if (iArr[i12] == 0) {
                            NotificationsController.getInstance(this.currentAccount).showNotifications();
                            break;
                        } else {
                            ak0.m();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i12] == 0) {
                            ImageLoader.getInstance().checkMediaPaths();
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i12] == 0) {
                            AndroidUtilities.runOnUIThread(new sv(this, 3));
                            getContactsController().forceImportContacts();
                            break;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                            this.U1 = false;
                            edit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                }
            }
        }
        if (this.A0) {
            this.A0 = false;
            R4();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        cy cyVar;
        ay ayVar;
        gw gwVar;
        org.telegram.ui.Components.wo0 wo0Var;
        bi.cc ccVar;
        super.onResume();
        qw qwVar = this.E0;
        if (qwVar != null) {
            ArrayList arrayList = qwVar.x;
            di.h7 h7Var = qwVar.s;
            h7Var.l(h7Var.g);
            h7Var.l(h7Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = h7Var.y(((di.o) arrayList.get(i10)).c);
                if (y3 != null) {
                    h7Var.X(y3);
                }
            }
        }
        tw twVar = this.G3;
        if (twVar != null) {
            twVar.r = false;
            ax axVar = twVar.a;
            if (axVar != null) {
                axVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (ccVar = this.K0) != null && ccVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.e0 != null) {
            int i11 = 0;
            while (true) {
                ay[] ayVarArr = this.e0;
                if (i11 >= ayVarArr.length) {
                    break;
                }
                ayVarArr[i11].d.l();
                i11++;
            }
        }
        jw jwVar = this.B1;
        if (jwVar != null) {
            jwVar.C0();
        }
        long j10 = 0;
        if (!this.l2 && this.W2 == 0 && this.Y2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        jx jxVar = this.C0;
        if (jxVar != null && (wo0Var = jxVar.d0) != null) {
            wo0Var.l();
        }
        boolean z10 = this.t2 || getUserConfig().unacceptedTermsOfService == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.W2 == 0 && this.Y2 == 0 && this.c2 && !this.l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.c2 = false;
                boolean z11 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z12 = (i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z13 = i12 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                cyVar = this;
                org.telegram.messenger.s1 s1Var = new org.telegram.messenger.s1(cyVar, z13, z11, z12, parentActivity);
                if (cyVar.t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(s1Var, j10);
            } else {
                cyVar = this;
            }
        } else {
            cyVar = this;
            if (!cyVar.l2 && cyVar.W2 == 0 && cyVar.Y2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(XiaomiUtilities.OP_SHOW_WHEN_LOCKED)) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i13 = R.raw.permission_request_apk;
                    int i14 = org.telegram.ui.ActionBar.y6.L5;
                    alertDialog$Builder.m(i13, 72, getThemedColor(i14), null);
                    alertDialog$Builder.n(i14, getResourceProvider());
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                    alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new iv(this, 9));
                    alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.voip.c1(5));
                    showDialog(alertDialog$Builder.a);
                }
            } else if (cyVar.W2 == 0 && cyVar.Y2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    int i15 = R.raw.permission_request_apk;
                    int i16 = org.telegram.ui.ActionBar.y6.L5;
                    alertDialog$Builder2.m(i15, 72, getThemedColor(i16), null);
                    alertDialog$Builder2.n(i16, getResourceProvider());
                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new iv(this, 10));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.voip.c1(6));
                    showDialog(alertDialog$Builder2.a);
                }
            }
        }
        R4();
        if (cyVar.e0 != null) {
            int i17 = 0;
            while (true) {
                ay[] ayVarArr2 = cyVar.e0;
                if (i17 >= ayVarArr2.length) {
                    break;
                }
                ay ayVar2 = ayVarArr2[i17];
                if (ayVar2.s == 0 && ayVar2.v == 2 && ayVar2.c.L0() == 0 && h4()) {
                    cyVar.e0[i17].c.h1(1, (int) cyVar.N);
                }
                if (i17 == 0) {
                    cyVar.e0[i17].d.getClass();
                } else {
                    cyVar.e0[i17].d.getClass();
                }
                i17++;
            }
        }
        T4();
        setBulletinDelegate(new d9(this, 4));
        if (cyVar.q3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), cyVar.classGuid);
        }
        q5(0, false);
        i5(false, true);
        p5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            ea1.n(this);
        }
        J3();
        if (cyVar.z0 == null || (ayVar = cyVar.e0[0]) == null || (gwVar = ayVar.d) == null) {
            return;
        }
        int i18 = gwVar.h;
        if (i18 == 7 || i18 == 8) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i18 != 7 ? (char) 1 : (char) 0];
            if (dialogFilter != null) {
                cyVar.z0.h(dialogFilter.localId);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Z3 && this.a4 == null) {
            N4(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f1.setColor(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            v3();
            d5();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.cc ccVar;
        cy cyVar;
        tw twVar = this.G3;
        if (twVar == null || !twVar.c()) {
            if (z10 && (ccVar = this.K0) != null && ccVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).x0.c(false);
                }
            }
        } else {
            this.G3.getFragment().onTransitionAnimationEnd(z10, z11);
        }
        if (!z10 && (cyVar = this.X2) != null) {
            cyVar.removeSelfFromStack();
        }
        J3();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        tw twVar = this.G3;
        if (twVar == null || !twVar.c()) {
            bi.cc ccVar = this.K0;
            if (ccVar != null && ccVar.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        } else {
            this.G3.getFragment().onTransitionAnimationProgress(z10, f7);
        }
        J3();
    }

    public final boolean p3(long j10, View view) {
        if (this.l2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).U(false, true);
            } else if (view instanceof org.telegram.ui.Cells.m6) {
                ((org.telegram.ui.Cells.m6) view).r(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view).U(true, true);
        } else if (view instanceof org.telegram.ui.Cells.m6) {
            ((org.telegram.ui.Cells.m6) view).r(true, true);
        }
        return true;
    }

    public final boolean p4() {
        return this.C2 == null && this.n2 == null;
    }

    public final void p5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        di.h7 f42;
        ArrayList arrayList;
        if (this.E0 == null || this.I != null) {
            return;
        }
        tw twVar = this.G3;
        if ((twVar != null && twVar.c()) || this.q3 || (kVar = this.actionBar) == null || kVar.q() || this.l2) {
            return;
        }
        fi.sb sbVar = fi.sb.F2;
        int i10 = 0;
        if ((sbVar != null && sbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
            z10 = false;
        }
        int i11 = 1;
        boolean z12 = !m4() && f4().G();
        if (this.Y2 != 0) {
            z11 = false;
        } else if (m4()) {
            z11 = !f4().h.isEmpty();
        } else {
            z11 = !z12 && (((arrayList = (f42 = f4()).g) != null && arrayList.size() > 0) || f42.H());
            z12 = f4().G();
        }
        this.L = z12;
        boolean z13 = this.G0;
        boolean z14 = z12 || z11;
        this.G0 = z14;
        if (z11 || z14) {
            this.E0.p(z10, z14 != z13);
        }
        boolean z15 = this.G0;
        int i12 = 2;
        int i13 = 8;
        if (z15 != z13) {
            if (z10) {
                ValueAnimator valueAnimator = this.J;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.G0 && !isInPreviewMode()) {
                    this.E0.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H0, this.G0 ? 1.0f : 0.0f);
                this.J = ofFloat;
                ofFloat.addUpdateListener(new vi(i11, this));
                this.J.addListener(new org.telegram.ui.Components.h31(this, 25));
                this.J.setDuration(200L);
                this.J.setInterpolator(org.telegram.ui.Components.ds.f);
                this.J.start();
            } else {
                this.E0.setVisibility((!z15 || isInPreviewMode()) ? 8 : 0);
                this.H0 = this.G0 ? 1.0f : 0.0f;
                View view = this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (z11 == this.M) {
            return;
        }
        this.M = z11;
        if (z11) {
            this.E0.l(1.0f, false);
        }
        if (z10 && !isInPreviewMode()) {
            this.E0.setVisibility(0);
            float f7 = -this.N;
            float b42 = z11 ? 0.0f : b4();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I = ofFloat2;
            ofFloat2.addUpdateListener(new hx(this, f7, z11, b42));
            this.I.addListener(new zw(this, z11, i12));
            this.I.setDuration(200L);
            this.I.setInterpolator(org.telegram.ui.Components.ds.f);
            this.I.start();
            return;
        }
        this.K = z11;
        qw qwVar = this.E0;
        if ((z11 || this.L) && !isInPreviewMode()) {
            i13 = 0;
        }
        qwVar.setVisibility(i13);
        if (z11) {
            this.y3 = -AndroidUtilities.dp(81.0f);
            K4(-b4());
        } else {
            K4(0.0f);
        }
        while (true) {
            ay[] ayVarArr = this.e0;
            if (i10 >= ayVarArr.length) {
                break;
            }
            ay ayVar = ayVarArr[i10];
            if (ayVar != null) {
                ayVar.a.requestLayout();
            }
            i10++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Z3 = true;
            J4(true);
        } else {
            this.a4 = null;
            this.Z3 = false;
            J4(false);
            N4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean presentFragment(org.telegram.ui.ActionBar.r2 r2Var) {
        boolean presentFragment = super.presentFragment(r2Var);
        if (presentFragment && this.e0 != null) {
            int i10 = 0;
            while (true) {
                ay[] ayVarArr = this.e0;
                if (i10 >= ayVarArr.length) {
                    break;
                }
                ayVarArr[i10].d.getClass();
                i10++;
            }
        }
        fi.v3 v3Var = this.p0;
        if (v3Var != null) {
            v3Var.e(true);
        }
        fi.v3 v3Var2 = this.q0;
        if (v3Var2 != null) {
            v3Var2.e(true);
        }
        org.telegram.ui.Components.qc.e();
        return presentFragment;
    }

    public final void q3(ig.p0 p0Var) {
        jx jxVar;
        if (!this.q3 || (jxVar = this.C0) == null) {
            return;
        }
        ArrayList arrayList = jxVar.C0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (p0Var.b((ig.p0) arrayList.get(i10))) {
                    return;
                }
            }
        }
        arrayList.add(p0Var);
        ox oxVar = this.X;
        oxVar.F.add(p0Var);
        oxVar.I = r1.size() - 1;
        oxVar.e();
        this.X.r.getText().clear();
        f5(true, null, null, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q5(int i10, boolean z10) {
        RecyclerView recyclerView;
        int i11;
        int childCount;
        int i12;
        if ((this.S1 && (MessagesController.UPDATE_MASK_REORDER & i10) == 0) || this.isPaused) {
            return;
        }
        int i13 = 0;
        while (i13 < 3) {
            if (i13 == 2) {
                jx jxVar = this.C0;
                recyclerView = jxVar != null ? jxVar.a0 : null;
            } else {
                ay[] ayVarArr = this.e0;
                if (ayVarArr != null) {
                    wx wxVar = i13 < ayVarArr.length ? ayVarArr[i13].a : null;
                    if (wxVar == null || ayVarArr[i13].getVisibility() == 0) {
                        r5 = wxVar != null ? this.e0[i13] : null;
                        recyclerView = wxVar;
                    }
                }
                i13++;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                if (((MessagesController.UPDATE_MASK_NEW_MESSAGE & i10) != 0 || i10 == 0) && r5 != null) {
                    r5.q(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    for (0; i11 < childCount2; i11 + 1) {
                        View childAt = recyclerView.getChildAt(i11);
                        boolean z11 = childAt instanceof org.telegram.ui.Cells.p2;
                        ArrayList arrayList = this.I2;
                        if (z11 && (this.C0 == null || recyclerView.getAdapter() != this.C0.d0)) {
                            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                            if ((MessagesController.UPDATE_MASK_REORDER & i10) != 0) {
                                p2Var.S(this.actionBar.q(), true);
                                i11 = this.S1 ? i11 + 1 : 0;
                            }
                            if ((MessagesController.UPDATE_MASK_CHECK & i10) != 0) {
                                p2Var.U(false, (MessagesController.UPDATE_MASK_CHAT & i10) != 0);
                            } else {
                                if ((MessagesController.UPDATE_MASK_SELECT_DIALOG & i10) == 0) {
                                    if (p2Var.a0(i10, z10)) {
                                        r5.q(false);
                                        break;
                                    }
                                } else if (this.e0[i13].p() && AndroidUtilities.isTablet()) {
                                    p2Var.setDialogSelected(p2Var.getDialogId() == this.p2.dialogId);
                                }
                                if (arrayList != null) {
                                    p2Var.U(arrayList.contains(Long.valueOf(p2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.ab)) {
                                    ((org.telegram.ui.Cells.ab) childAt).i(i10);
                                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                                    m6Var.t(i10);
                                    if (arrayList != null) {
                                        m6Var.r(arrayList.contains(Long.valueOf(m6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.S1 && (childAt instanceof org.telegram.ui.Components.mm0)) {
                                    org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) childAt;
                                    childCount = mm0Var.getChildCount();
                                    for (i12 = 0; i12 < childCount; i12++) {
                                        View childAt2 = mm0Var.getChildAt(i12);
                                        if (childAt2 instanceof org.telegram.ui.Cells.r4) {
                                            ((org.telegram.ui.Cells.r4) childAt2).b(i10);
                                        }
                                    }
                                }
                            }
                        }
                        if (!(childAt instanceof org.telegram.ui.Cells.ab)) {
                        }
                        if (!this.S1) {
                            org.telegram.ui.Components.mm0 mm0Var2 = (org.telegram.ui.Components.mm0) childAt;
                            childCount = mm0Var2.getChildCount();
                            while (i12 < childCount) {
                            }
                        }
                    }
                }
            }
            i13++;
        }
    }

    public final void r3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 33 && ak0.n(parentActivity)) {
            if (z10) {
                showDialog(new ak0(parentActivity, !org.telegram.ui.Components.xe0.a(), new qv(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.v(parentActivity, new kv(this, 1)).a;
                this.T1 = e2Var;
                showDialog(e2Var);
                return;
            } else {
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
            }
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
            }
            if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } else if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (!arrayList.isEmpty()) {
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception unused) {
            }
        } else if (this.A0) {
            this.A0 = false;
            R4();
        }
    }

    public final void r4(long j10) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
        int i10 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList<TLRPC.Dialog> dialogsByCommunity = getMessagesController().getDialogsByCommunity(dialog.community_id);
            if (dialogsByCommunity != null) {
                int size = dialogsByCommunity.size();
                while (i10 < size) {
                    TLRPC.Dialog dialog2 = dialogsByCommunity.get(i10);
                    i10++;
                    r4(dialog2.id);
                }
                return;
            }
            return;
        }
        int i11 = this.e0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.q() || this.actionBar.r(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        this.z3 = 2;
        int i12 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            I4(true, true);
            w3();
            if (this.R1 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= this.R1.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) this.R1.get(i13)).id == j10) {
                        i12 = i13;
                        break;
                    }
                    i13++;
                }
                if (i12 < 0) {
                    I4(false, false);
                }
            }
        }
        int i14 = i12;
        if (getMessagesController().isForum(j10) || getMessagesController().isMonoForumWithManageRights(j10)) {
            getMessagesController().markAllTopicsAsRead(j10);
        }
        getMessagesController().markMentionsAsRead(j10, 0L);
        MessagesController messagesController = getMessagesController();
        int i15 = dialog.top_message;
        messagesController.markDialogAsRead(j10, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i14 >= 0) {
            this.R1.remove(i14);
            this.e0[0].x.D();
            this.e0[0].q(true);
        }
    }

    public final boolean r5(long j10) {
        TLRPC.Chat chat;
        jw jwVar;
        if ((this.S0 <= 1 && ((jwVar = this.B1) == null || jwVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    @Override // org.telegram.ui.og0
    public final void s() {
        F4(true, true);
    }

    public final void s3(CharSequence charSequence) {
        if (this.B1 == null) {
            return;
        }
        if (this.D2 == null && this.E2 == null && this.F2 == null) {
            return;
        }
        if (this.G2 == null) {
            org.telegram.ui.Components.qr0 qr0Var = new org.telegram.ui.Components.qr0(getParentActivity(), getResourceProvider());
            this.G2 = qr0Var;
            int i10 = 0;
            qr0Var.setLayoutClickListener(new hv(this, i10));
            this.G2.setOnModeChangeListener(new iv(this, i10));
            jw jwVar = this.B1;
            org.telegram.ui.Components.qr0 qr0Var2 = this.G2;
            if (qr0Var2 == null) {
                jwVar.getClass();
            } else {
                jwVar.G1 = qr0Var2;
                jwVar.addView(qr0Var2, 0, org.telegram.ui.Components.gb1.i(-1, 48, 51));
                jwVar.g3 = false;
                jwVar.K();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
            layoutParams.rightMargin = -this.B1.getPaddingRight();
            this.G2.setLayoutParams(layoutParams);
        }
        if (i4()) {
            this.G2.i(this.currentAccount, this.D2);
        } else {
            String str = this.E2;
            if (str != null) {
                org.telegram.ui.Components.qr0 qr0Var3 = this.G2;
                qr0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    qr0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.F2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.qr0 qr0Var4 = this.G2;
                    qr0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        qr0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.B1.setFieldText(charSequence);
        }
        this.B1.setOverrideHint(LocaleController.getString(i4() ? R.string.AddCaption : R.string.ShareComment));
        D3();
        if (this.G2.getMode() != 0) {
            this.B1.u1(false, false);
        }
        l5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (org.telegram.messenger.ChatObject.getPublicUsername(r6) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s4(TLRPC.Chat chat, TLRPC.User user) {
        Boolean bool;
        Boolean bool2;
        if (chat != null) {
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            TLRPC.RequestPeerType requestPeerType = this.G;
            if (isChannelAndNotMegaGroup == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.G.bot_participant) == null || !bool2.booleanValue() || getMessagesController().isInChatCached(chat, user) || ChatObject.canAddBotsToChat(chat)))) {
                Boolean bool3 = this.G.has_username;
                if (bool3 != null) {
                }
                Boolean bool4 = this.G.forum;
                if ((bool4 == null || bool4.booleanValue() == ChatObject.isForum(chat)) && ((this.G.user_admin_rights == null || getMessagesController().matchesAdminRights(chat, getUserConfig().getCurrentUser(), this.G.user_admin_rights)) && (this.G.bot_admin_rights == null || getMessagesController().matchesAdminRights(chat, user, this.G.bot_admin_rights) || ChatObject.canAddAdmins(chat)))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        qw qwVar = this.E0;
        if (qwVar != null) {
            if (!this.G0 || z10) {
                qwVar.setVisibility(8);
            } else {
                qwVar.setVisibility(0);
            }
        }
        h5(true);
        c5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        vw vwVar;
        org.telegram.ui.Components.r5 r5Var;
        super.setTitleOverlayText(str, i10, runnable);
        if (this.actionBar != null && (vwVar = this.M0) != null && (vwVar.getContentView() instanceof c61)) {
            org.telegram.ui.ActionBar.b6 titleTextView = this.actionBar.getTitleTextView();
            c61 c61Var = (c61) this.M0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                r5Var = this.E3;
            }
            r5Var = null;
            c61Var.y(r5Var, titleTextView);
        }
        qw qwVar = this.E0;
        if (qwVar != null) {
            org.telegram.ui.Components.s6 s6Var = qwVar.T;
            qwVar.U.c(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null, true);
            if (str != null) {
                qwVar.g0 = true;
                if (qwVar.h0 != i10) {
                    qwVar.h0 = i10;
                    s6Var.c(LocaleController.getString(str, i10), !LocaleController.isRTL, true);
                }
            } else {
                qwVar.g0 = false;
                qwVar.h0 = 0;
                s6Var.c(qwVar.f0, !LocaleController.isRTL, true);
            }
            qwVar.a.a(qwVar.g0, true);
            qwVar.L0.v(s6Var);
        }
    }

    public final int t3() {
        if (this.B1 != null) {
            return (int) (this.y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        }
        if (this.Y2 == 0) {
            return this.g4 + this.i4;
        }
        return AndroidUtilities.dp(72.0f) + this.g4;
    }

    public final boolean t4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.G;
        if (user == null || UserObject.isReplyUser(user) || UserObject.isDeleted(user)) {
            return false;
        }
        Boolean bool = tL_requestPeerTypeUser.bot;
        if (bool != null && bool.booleanValue() != user.bot) {
            return false;
        }
        Boolean bool2 = tL_requestPeerTypeUser.premium;
        return bool2 == null || bool2.booleanValue() == user.premium;
    }

    public final boolean u3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I2;
            if (i10 >= arrayList.size()) {
                return true;
            }
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-((Long) arrayList.get(i10)).longValue()));
            if (chat != null && !ChatObject.canSendDocument(chat)) {
                return false;
            }
            i10++;
        }
    }

    public final void u4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        int i10 = 1;
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.u6) null, false);
        k3Var.fixNavigationBar();
        boolean z10 = getMessagesStorage().getArchiveUnreadCount() != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, SharedConfig.archiveHidden ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? LocaleController.getString(R.string.MarkAllAsRead) : null, LocaleController.getString(SharedConfig.archiveHidden ? R.string.PinInTheList : R.string.HideAboveTheList)};
        n4 n4Var = new n4(this, i10);
        k3Var.items = charSequenceArr;
        k3Var.itemIcons = iArr;
        k3Var.onClickListener = n4Var;
        showDialog(k3Var);
    }

    public final void v3() {
        int themedColor;
        org.telegram.ui.Components.wh0 wh0Var;
        fw fwVar;
        org.telegram.ui.Components.wo0 wo0Var;
        za1 za1Var;
        jx jxVar = this.C0;
        if (jxVar != null && (wo0Var = jxVar.d0) != null && (za1Var = wo0Var.k0) != null) {
            int childCount = za1Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = za1Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r4) {
                    org.telegram.ui.Cells.r4 r4Var = (org.telegram.ui.Cells.r4) childAt;
                    org.telegram.ui.Components.j9 j9Var = r4Var.c;
                    int i11 = r4Var.h;
                    if (DialogObject.isUserDialog(r4Var.f)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(r4Var.f));
                        r4Var.e = user;
                        j9Var.m(i11, user);
                    } else {
                        j9Var.k(i11, MessagesController.getInstance(i11).getChat(Long.valueOf(-r4Var.f)));
                        r4Var.e = null;
                    }
                    r4Var.c(true);
                }
            }
        }
        if (this.e0 != null) {
            int i12 = 0;
            while (true) {
                ay[] ayVarArr = this.e0;
                if (i12 >= ayVarArr.length) {
                    break;
                }
                ay ayVar = ayVarArr[i12];
                if (ayVar != null && (fwVar = ayVar.n) != null) {
                    fwVar.i();
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.A(getThemedColor(org.telegram.ui.ActionBar.y6.G8), true);
            this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.y6.E8), false, true);
            this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.y6.F8), true, true);
            this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.y6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.E3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.zh);
            Drawable drawable = this.L3;
            if (drawable != null && themedColor2 != this.x4) {
                this.x4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.r5 r5Var = this.E3;
            if (r5Var != null) {
                r5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.x2 x2Var = this.M1;
        if (x2Var != null) {
            org.telegram.ui.ActionBar.y6.E1(x2Var.getBackground(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i6, false), true);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        if (w0Var != null) {
            w0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.y6.v8));
        }
        jw jwVar = this.B1;
        if (jwVar != null) {
            jwVar.updateColors();
        }
        qx qxVar = this.z0;
        if (qxVar != null) {
            eh.d dVar = qxVar.y0;
            if (dVar != null) {
                dVar.updateColors();
            }
            qxVar.invalidate();
        }
        ig.r0 r0Var = this.b0;
        if (r0Var != null) {
            r0Var.updateColors();
        }
        jx jxVar2 = this.C0;
        if (jxVar2 != null && (wh0Var = jxVar2.r0) != null) {
            wh0Var.c();
        }
        org.telegram.ui.Components.t91 t91Var = this.a0;
        if (t91Var != null) {
            t91Var.updateColors();
        }
        n31 n31Var = this.Z;
        if (n31Var != null) {
            n31Var.updateColors();
        }
        if (this.K0 != null) {
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.y6.d6), 100);
            if (!(this.K0.getForeground() instanceof ColorDrawable)) {
                this.K0.setForeground(new ColorDrawable(o10));
            } else if (((ColorDrawable) this.K0.getForeground()).getColor() != o10) {
                ((ColorDrawable) this.K0.getForeground()).setColor(o10);
            }
        }
        org.telegram.ui.Components.j20 j20Var = this.t0;
        if (j20Var != null) {
            j20Var.updateColors();
        }
        org.telegram.ui.Components.j20 j20Var2 = this.u0;
        if (j20Var2 != null) {
            j20Var2.updateColors();
        }
        int i13 = org.telegram.ui.ActionBar.y6.d6;
        this.n4.a(getThemedColor(i13));
        org.telegram.ui.Components.ws wsVar = this.J1;
        if (wsVar != null) {
            wsVar.updateColors();
        }
        org.telegram.ui.Components.vs vsVar = this.K1;
        if (vsVar != null) {
            vsVar.setColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
        }
        hw hwVar = this.H1;
        if (hwVar != null) {
            hwVar.updateColors();
        }
        hw hwVar2 = this.F1;
        if (hwVar2 != null) {
            hwVar2.updateColors();
        }
        j5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        qw qwVar = this.E0;
        if (qwVar != null) {
            qwVar.o();
        }
        if (this.D3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.gl)) != this.w4) {
            this.w4 = themedColor;
            this.D3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        ox oxVar = this.X;
        if (oxVar != null) {
            oxVar.updateColors();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0416  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v4(View view, int i10, s4.h0 h0Var) {
        s4.h0 h0Var2;
        long j10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        MessageObject messageObject;
        long j11;
        long j12;
        org.telegram.ui.Components.wo0 wo0Var;
        tw twVar;
        long j13;
        long j14;
        int i14;
        MessageObject messageObject2;
        long makeEncryptedDialogId;
        long j15;
        long j16;
        jx jxVar;
        TLRPC.Document greetingsSticker;
        boolean z11;
        jx jxVar2;
        int i15;
        Object J;
        long j17;
        long j18;
        int i16;
        if (getParentActivity() == null) {
            return;
        }
        boolean z12 = h0Var instanceof ig.n;
        if (z12) {
            ig.n nVar = (ig.n) h0Var;
            int i17 = nVar.h;
            if (i17 == 7 || i17 == 8) {
                MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i17 == 7 ? (char) 0 : (char) 1];
                if (dialogFilter != null) {
                    i15 = dialogFilter.id;
                    J = nVar.J(i10);
                    if (this.C2 == null && nVar.n && h0Var.j(i10) == 21) {
                        this.C2.K(this);
                        return;
                    }
                    if (J instanceof TLRPC.User) {
                        if (J instanceof TLRPC.Chat) {
                            j18 = ((TLRPC.Chat) J).id;
                        } else if (J instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                            i16 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.r(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new cy(bundle));
                                return;
                            }
                            j17 = dialog.id;
                            if (this.actionBar.r(null)) {
                                U4(j17, view);
                                return;
                            }
                            h0Var2 = h0Var;
                            i11 = i16;
                            z10 = false;
                            i12 = 0;
                            messageObject = null;
                            i13 = i15;
                            j12 = j17;
                            j11 = 0;
                            j10 = 0;
                        } else if (J instanceof TLRPC.TL_recentMeUrlChat) {
                            j18 = ((TLRPC.TL_recentMeUrlChat) J).chat_id;
                        } else if (J instanceof TLRPC.TL_recentMeUrlUser) {
                            j17 = ((TLRPC.TL_recentMeUrlUser) J).user_id;
                        } else {
                            if (!(J instanceof TLRPC.TL_recentMeUrlChatInvite)) {
                                if (J instanceof TLRPC.TL_recentMeUrlStickerSet) {
                                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_recentMeUrlStickerSet) J).set.set;
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.id = stickerSet.id;
                                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                                    showDialog(new org.telegram.ui.Components.cz0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) J;
                            h0Var2 = h0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!ChatObject.isChannel(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.c90(getParentActivity(), chatInvite, str, this, null));
                                return;
                            }
                            TLRPC.Chat chat2 = chatInvite.chat;
                            if (chat2 == null) {
                                return;
                            }
                            j17 = -chat2.id;
                            i16 = 0;
                            i11 = i16;
                            z10 = false;
                            i12 = 0;
                            messageObject = null;
                            i13 = i15;
                            j12 = j17;
                            j11 = 0;
                            j10 = 0;
                        }
                        j17 = -j18;
                    } else {
                        j17 = ((TLRPC.User) J).id;
                    }
                    h0Var2 = h0Var;
                    i16 = 0;
                    i11 = i16;
                    z10 = false;
                    i12 = 0;
                    messageObject = null;
                    i13 = i15;
                    j12 = j17;
                    j11 = 0;
                    j10 = 0;
                }
            }
            i15 = 0;
            J = nVar.J(i10);
            if (this.C2 == null) {
            }
            if (J instanceof TLRPC.User) {
            }
            h0Var2 = h0Var;
            i16 = 0;
            i11 = i16;
            z10 = false;
            i12 = 0;
            messageObject = null;
            i13 = i15;
            j12 = j17;
            j11 = 0;
            j10 = 0;
        } else {
            h0Var2 = h0Var;
            jx jxVar3 = this.C0;
            if (jxVar3 == null || h0Var2 != (wo0Var = jxVar3.d0)) {
                j10 = 0;
                z10 = false;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                messageObject = null;
                j11 = 0;
                j12 = 0;
            } else {
                Object I = wo0Var.I(i10);
                z10 = this.C0.d0.N(i10);
                if (I instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) I;
                    makeEncryptedDialogId = user.id;
                    if (!this.l2) {
                        this.W1 = makeEncryptedDialogId;
                        this.X1 = user;
                    }
                } else if (I instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) I;
                    makeEncryptedDialogId = -chat3.id;
                    if (!this.l2) {
                        this.W1 = makeEncryptedDialogId;
                        this.X1 = chat3;
                    }
                } else if (I instanceof TLRPC.EncryptedChat) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) I;
                    makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.id);
                    if (!this.l2) {
                        this.W1 = makeEncryptedDialogId;
                        this.X1 = encryptedChat;
                    }
                } else {
                    if (I instanceof MessageObject) {
                        messageObject2 = (MessageObject) I;
                        long dialogId = messageObject2.getDialogId();
                        int id2 = messageObject2.getId();
                        j10 = 0;
                        j14 = ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-dialogId))) ? MessageObject.getTopicId(messageObject2.currentAccount, messageObject2.messageOwner, true) : 0L;
                        jx jxVar4 = this.C0;
                        if (jxVar4 != null) {
                            org.telegram.ui.Components.wo0 wo0Var2 = jxVar4.d0;
                            wo0Var2.j0.a(wo0Var2.Z);
                        }
                        i14 = id2;
                        j13 = dialogId;
                    } else {
                        j10 = 0;
                        if (I instanceof String) {
                            String str2 = (String) I;
                            jx jxVar5 = this.C0;
                            if (jxVar5 != null && !jxVar5.d0.J.isEmpty()) {
                                this.X.r.setText(str2);
                                this.X.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                oj0 oj0Var = new oj0(getParentActivity(), this);
                                oj0Var.w(str2, true);
                                oj0Var.show();
                            }
                        } else if (I instanceof ContactsController.Contact) {
                            ContactsController.Contact contact = (ContactsController.Contact) I;
                            org.telegram.ui.Components.g5.u(this, contact.first_name, contact.last_name, contact.phones.get(0));
                        } else if ((I instanceof TLRPC.TL_forumTopic) && (twVar = this.G3) != null && (twVar.getFragment() instanceof af1)) {
                            j13 = -((af1) this.G3.getFragment()).a;
                            j14 = ((TLRPC.TL_forumTopic) I).id;
                            i14 = 0;
                            messageObject2 = null;
                        }
                        i14 = 0;
                        messageObject2 = null;
                        j14 = 0;
                        j13 = 0;
                    }
                    if (j13 == j10 && this.actionBar.q()) {
                        if (this.actionBar.r("search_dialogs_action_mode") && i14 == 0 && !z10) {
                            U4(j13, view);
                            return;
                        }
                        return;
                    }
                    j12 = j13;
                    j11 = j14;
                    i13 = 0;
                    i12 = i14;
                    messageObject = messageObject2;
                    i11 = 0;
                }
                i14 = 0;
                messageObject2 = null;
                j13 = makeEncryptedDialogId;
                j14 = 0;
                j10 = 0;
                if (j13 == j10) {
                }
                j12 = j13;
                j11 = j14;
                i13 = 0;
                i12 = i14;
                messageObject = messageObject2;
                i11 = 0;
            }
        }
        if (j12 == j10) {
            return;
        }
        if (this.l2) {
            if (r5(j12)) {
                if ((!getMessagesController().isForum(j12) && !getMessagesController().isCommunity(j12)) || n4(j12)) {
                    ArrayList arrayList = this.I2;
                    if (!arrayList.isEmpty() || (this.R0 == 3 && this.f2 != null)) {
                        if (arrayList.contains(Long.valueOf(j12)) || x3(j12)) {
                            boolean p32 = p3(j12, view);
                            jx jxVar6 = this.C0;
                            if (jxVar6 != null && h0Var2 == jxVar6.d0) {
                                this.actionBar.g(true);
                                X3(j12, p32);
                            }
                            k5();
                            return;
                        }
                        return;
                    }
                }
                if (this.m2 && getMessagesController().isCommunity(j12)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j12);
                    cy cyVar = new cy(bundle2);
                    cyVar.X2 = this;
                    cyVar.C2 = this.C2;
                    presentFragment(cyVar);
                    return;
                }
                if (!this.m2 || ((!getMessagesController().isForum(j12) || n4(j12)) && !getMessagesController().isMonoForumWithManageRights(j12))) {
                    W3(j12, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j12);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.R0 == 1);
                bundle3.putBoolean("quote", this.O0);
                bundle3.putBoolean("reply_to", this.N0);
                af1 af1Var = new af1(bundle3);
                af1Var.L0 = this;
                presentFragment(af1Var);
                return;
            }
            return;
        }
        Bundle bundle4 = new Bundle();
        if (DialogObject.isEncryptedDialog(j12)) {
            bundle4.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
        } else if (DialogObject.isUserDialog(j12)) {
            bundle4.putLong("user_id", j12);
        } else {
            if (i12 != 0) {
                j15 = j11;
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(-j12));
                if (chat4 != null && chat4.migrated_to != null) {
                    bundle4.putLong("migrated_to", j12);
                    j16 = -chat4.migrated_to.channel_id;
                    bundle4.putLong("chat_id", -j16);
                    if (i12 != 0) {
                        bundle4.putInt("message_id", i12);
                    } else if (z10) {
                        TLObject tLObject = this.X1;
                        if (tLObject != null) {
                            jx jxVar7 = this.C0;
                            if (jxVar7 != null) {
                                jxVar7.d0.Q(this.W1, tLObject);
                            }
                            this.X1 = null;
                        }
                    } else {
                        R3();
                    }
                    boolean z13 = LocaleController.isRTL && !this.j2 && (!AndroidUtilities.isTablet() || i11 == 0) && LiteMode.isEnabled(64) && this.Y2 == j10;
                    bundle4.putInt("dialog_folder_id", i11);
                    bundle4.putInt("dialog_filter_id", i13);
                    if (!AndroidUtilities.isTablet() && ((!getMessagesController().isForum(j12) || !z13) && this.p2.dialogId == j12 && ((jxVar2 = this.C0) == null || h0Var2 != jxVar2.d0))) {
                        if (getParentActivity() instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                            List fragmentStack = launchActivity.s0.getFragmentStack();
                            if (fragmentStack.isEmpty()) {
                                return;
                            }
                            if (fragmentStack.size() == 1 && (org.telegram.ui.Components.b10.h(1, fragmentStack) instanceof un)) {
                                ((un) org.telegram.ui.Components.b10.h(1, fragmentStack)).ea();
                                return;
                            }
                            if (fragmentStack.size() == 2) {
                                launchActivity.s0.l(true, false);
                                return;
                            } else {
                                if (getParentActivity() instanceof LaunchActivity) {
                                    org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(0);
                                    fragmentStack.clear();
                                    fragmentStack.add(r2Var);
                                    launchActivity.s0.W(true, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    jxVar = this.C0;
                    if (jxVar != null && jxVar.A0) {
                        jxVar.R(false);
                    }
                    if (j12 != getUserConfig().getClientUserId() && getMessagesController().savedViewAsChats) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                        bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        bundle5.putInt("start_from", 11);
                        if (this.D0 == null) {
                            this.D0 = new org.telegram.ui.Components.sv0(this);
                        }
                        presentFragment(new org.telegram.ui.Components.ta0(bundle5, this.D0));
                        return;
                    }
                    if (this.n2 != null) {
                        if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            un unVar = new un(bundle4);
                            l4(unVar, messageObject);
                            presentFragment(unVar);
                            return;
                        }
                        return;
                    }
                    this.A3 = true;
                    if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(-j12));
                        TLRPC.Dialog dialog2 = getMessagesController().getDialog(j12);
                        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat5);
                        boolean z14 = dialog2 != null && dialog2.view_forum_as_messages;
                        int b10 = (this.Y2 == j10 || chat5 == null) ? 0 : ii.s0.b(this.currentAccount, -chat5.id);
                        if (b10 == 3) {
                            showDialog(new org.telegram.ui.Components.c90(getParentActivity(), chat5, null, this, this.resourceProvider));
                            return;
                        }
                        int i18 = 4;
                        if (b10 == 4) {
                            org.telegram.messenger.t.q(isChannelAndNotMegaGroup ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, org.telegram.ui.Components.wc.b0(this), R.raw.e_hand_2, 36);
                            return;
                        }
                        if (chat5 == null || !(((z11 = chat5.monoforum) || chat5.forum) && j15 == j10)) {
                            if (ChatObject.isCommunity(chat5)) {
                                Bundle bundle6 = new Bundle();
                                bundle6.putLong("community_id", chat5.id);
                                presentFragment(new cy(bundle6));
                                return;
                            }
                            un unVar2 = new un(bundle4);
                            if (j15 != j10) {
                                pg.d.a(unVar2, MessagesStorage.TopicKey.of(j12, j15));
                            }
                            if (z12 && DialogObject.isUserDialog(j12) && getMessagesController().dialogs_dict.f(j12) == null && (greetingsSticker = getMediaDataController().getGreetingsSticker()) != null) {
                                unVar2.N9 = greetingsSticker;
                                unVar2.O9 = true;
                            }
                            if (AndroidUtilities.isTablet()) {
                                tw twVar2 = this.G3;
                                if (twVar2.a != null) {
                                    twVar2.a();
                                }
                            }
                            l4(unVar2, messageObject);
                            presentFragment(unVar2);
                            return;
                        }
                        if (z11) {
                            bundle4.putInt("chatMode", 8);
                            bundle4.putBoolean("isSubscriberSuggestions", !ChatObject.canManageMonoForum(this.currentAccount, chat5));
                            un unVar3 = new un(bundle4);
                            l4(unVar3, messageObject);
                            presentFragment(unVar3);
                            return;
                        }
                        if (ChatObject.areTabsEnabled(chat5)) {
                            un unVar4 = new un(bundle4);
                            pg.d.a(unVar4, MessagesStorage.TopicKey.of(-chat5.id, getMessagesController().getForumLastTopicId(chat5.id)));
                            presentFragment(unVar4);
                            return;
                        }
                        if (!LiteMode.isEnabled(64) || this.Y2 != j10) {
                            if (!z14) {
                                presentFragment(new af1(bundle4));
                                return;
                            }
                            un unVar5 = new un(bundle4);
                            l4(unVar5, messageObject);
                            presentFragment(unVar5);
                            return;
                        }
                        if (!z13) {
                            if (!z14) {
                                presentFragment(new af1(bundle4));
                                return;
                            }
                            un unVar6 = new un(bundle4);
                            l4(unVar6, messageObject);
                            presentFragment(unVar6);
                            return;
                        }
                        if (this.j2) {
                            return;
                        }
                        if (z14) {
                            un unVar7 = new un(bundle4);
                            l4(unVar7, messageObject);
                            presentFragment(unVar7);
                            return;
                        }
                        tw twVar3 = this.G3;
                        ax axVar = twVar3.a;
                        if (axVar == null || (-axVar.a) != j12) {
                            wx wxVar = this.e0[0].a;
                            wxVar.w3 = 0.0f;
                            wxVar.x3 = wxVar.v3;
                            wxVar.y3 = wxVar.p3 != 0.0f;
                            ax axVar2 = new ax(bundle4);
                            axVar2.M0 = this;
                            final tw twVar4 = this.G3;
                            org.telegram.ui.ActionBar.j5 parentLayout = getParentLayout();
                            AnimationNotificationsLocker animationNotificationsLocker = twVar4.n;
                            if (!twVar4.r) {
                                twVar4.w = parentLayout;
                                axVar2.onFragmentCreate();
                                axVar2.setInPreviewMode(true);
                                axVar2.setParentLayout(parentLayout);
                                View performCreateView = axVar2.performCreateView(twVar4.getContext());
                                axVar2.onResume();
                                twVar4.b = performCreateView;
                                twVar4.addView(performCreateView);
                                final ax axVar3 = twVar4.a;
                                k0 k0Var = axVar2.e;
                                twVar4.c = k0Var;
                                twVar4.addView(k0Var);
                                twVar4.a = axVar2;
                                e31.Q = j10;
                                e31.Q = -axVar2.a;
                                if (axVar2.getActionBar() != null) {
                                    org.telegram.ui.ActionBar.k actionBar = axVar2.getActionBar();
                                    twVar4.d = actionBar;
                                    twVar4.addView(actionBar);
                                    twVar4.d.W0 = new my0(twVar4, 11);
                                }
                                if (axVar3 != null) {
                                    final ax axVar4 = twVar4.a;
                                    if (SharedConfig.animationsEnabled()) {
                                        o1.j jVar = twVar4.x;
                                        if (jVar != null) {
                                            jVar.c();
                                        }
                                        axVar4.onTransitionAnimationStart(true, false);
                                        twVar4.E = axVar3;
                                        twVar4.v = true;
                                        animationNotificationsLocker.lock();
                                        o1.j jVar2 = new o1.j(new ac.a(0.0f));
                                        twVar4.x = jVar2;
                                        jVar2.u = d3.l(1000.0f, 400.0f, 1.0f);
                                        e31.f(axVar3, axVar4, 0.0f);
                                        twVar4.x.b(new ad0(twVar4, i18));
                                        twVar4.x.a(new o1.f() { // from class: org.telegram.ui.c31
                                            @Override // o1.f
                                            public final void a(o1.h hVar, boolean z15, float f7, float f10) {
                                                e31 e31Var = twVar4;
                                                if (e31Var.x == null) {
                                                    return;
                                                }
                                                e31Var.x = null;
                                                org.telegram.ui.ActionBar.r2 r2Var2 = axVar4;
                                                r2Var2.onTransitionAnimationEnd(true, false);
                                                org.telegram.ui.ActionBar.r2 r2Var3 = axVar3;
                                                e31.f(r2Var3, r2Var2, 1.0f);
                                                e31Var.v = false;
                                                e31Var.E = null;
                                                r2Var3.onPause();
                                                r2Var3.onFragmentDestroy();
                                                e31Var.removeView(r2Var3.getFragmentView());
                                                e31Var.removeView(r2Var3.getActionBar());
                                                e31Var.n.unlock();
                                            }
                                        });
                                        twVar4.x.h();
                                    } else {
                                        axVar4.onTransitionAnimationStart(true, false);
                                        axVar4.onTransitionAnimationEnd(true, false);
                                        e31.f(axVar3, axVar4, 1.0f);
                                        twVar4.v = false;
                                        twVar4.E = null;
                                        axVar3.onPause();
                                        axVar3.onFragmentDestroy();
                                        twVar4.removeView(axVar3.getFragmentView());
                                        twVar4.removeView(axVar3.getActionBar());
                                        animationNotificationsLocker.unlock();
                                    }
                                } else if (!twVar4.f) {
                                    twVar4.f = true;
                                    if (SharedConfig.animationsEnabled()) {
                                        animationNotificationsLocker.lock();
                                        twVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        twVar4.e = 0.0f;
                                        twVar4.e(true);
                                        twVar4.g();
                                        axVar2.onTransitionAnimationStart(true, false);
                                        twVar4.h.addUpdateListener(new b31(twVar4, 1));
                                        twVar4.h.addListener(new org.telegram.ui.Components.ll0(12, twVar4, axVar2));
                                        twVar4.h.setDuration(250L);
                                        twVar4.h.setInterpolator(org.telegram.ui.Components.ds.f);
                                        twVar4.h.setStartDelay(SharedConfig.getDevicePerformanceClass() >= 2 ? 50L : 150L);
                                        twVar4.h.start();
                                    } else {
                                        twVar4.e(true);
                                        axVar2.onTransitionAnimationStart(true, false);
                                        axVar2.onTransitionAnimationEnd(true, false);
                                        twVar4.e = 1.0f;
                                        twVar4.g();
                                        twVar4.d(false);
                                    }
                                }
                                axVar2.setPreviewDelegate(new hl0(twVar4, 17));
                                WeakHashMap weakHashMap = r0.i0.a;
                                r0.y.c(twVar4);
                            }
                        } else {
                            twVar3.a();
                        }
                        jx jxVar8 = this.C0;
                        if (jxVar8 != null) {
                            jxVar8.S();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                j15 = j11;
            }
            j16 = j12;
            bundle4.putLong("chat_id", -j16);
            if (i12 != 0) {
            }
            if (LocaleController.isRTL) {
            }
            bundle4.putInt("dialog_folder_id", i11);
            bundle4.putInt("dialog_filter_id", i13);
            if (!AndroidUtilities.isTablet()) {
            }
            jxVar = this.C0;
            if (jxVar != null) {
                jxVar.R(false);
            }
            if (j12 != getUserConfig().getClientUserId()) {
            }
            if (this.n2 != null) {
            }
        }
        j15 = j11;
        if (i12 != 0) {
        }
        if (LocaleController.isRTL) {
        }
        bundle4.putInt("dialog_folder_id", i11);
        bundle4.putInt("dialog_filter_id", i13);
        if (!AndroidUtilities.isTablet()) {
        }
        jxVar = this.C0;
        if (jxVar != null) {
        }
        if (j12 != getUserConfig().getClientUserId()) {
        }
        if (this.n2 != null) {
        }
    }

    public final void w3() {
        AndroidUtilities.runOnUIThread(new cv(this, 2), 300L);
    }

    public final boolean w4(View view, int i10, float f7, org.telegram.ui.Components.lm0 lm0Var) {
        org.telegram.ui.Components.wo0 wo0Var;
        org.telegram.ui.Components.wo0 wo0Var2;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.x2) && lm0Var.j(i10) != 21) {
            if (!this.actionBar.q() && !AndroidUtilities.isTablet() && !this.l2 && (view instanceof org.telegram.ui.Cells.p2)) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                if (!getMessagesController().isForum(p2Var.getDialogId()) && !this.G3.c() && p2Var.R(f7)) {
                    return P4(p2Var);
                }
            }
            tw twVar = this.G3;
            if (twVar == null || !twVar.c()) {
                jx jxVar = this.C0;
                if (jxVar != null && lm0Var == (wo0Var2 = jxVar.d0)) {
                    Object I = wo0Var2.I(i10);
                    if (!this.C0.d0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                e2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, pg.d.i(chat, this.currentAccount, false));
                            } else {
                                e2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().clientUserId) {
                                e2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                e2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            e2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(r11.id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new di.d1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(e2Var);
                        TextView textView = (TextView) e2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                jx jxVar2 = this.C0;
                if (jxVar2 == null || lm0Var != (wo0Var = jxVar2.d0)) {
                    Object J = ((ig.n) lm0Var).J(i10);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.l2) {
                            if ((this.R0 == 3 || Q3()) && r5(dialog.id)) {
                                if (this.R0 != 1 || !Q3() || !this.m2 || !getMessagesController().isForum(dialog.id)) {
                                    p3(dialog.id, view);
                                    k5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.R0 == 1);
                                bundle.putBoolean("quote", this.O0);
                                bundle.putBoolean("reply_to", this.N0);
                                af1 af1Var = new af1(bundle);
                                af1Var.L0 = this;
                                presentFragment(af1Var);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                u4(view);
                                return false;
                            }
                            if (!this.actionBar.q() || !o4(dialog)) {
                                U4(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.l2) {
                        v4(view, i10, lm0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.m6) || wo0Var.N(i10)) ? 0L : ((org.telegram.ui.Cells.m6) view).getDialogId();
                    if (dialogId != 0) {
                        U4(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean x3(long j10) {
        int i10;
        int i11 = this.R0;
        if (i11 == 15 || i11 == 16 || this.h2 != null || !this.s2) {
            return true;
        }
        if (!DialogObject.isChatDialog(j10)) {
            if (!DialogObject.isEncryptedDialog(j10)) {
                return true;
            }
            if (this.T0 == 0 && !this.U0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.SendMessageTitle);
            int i12 = this.T0;
            if (i12 == 3) {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i12 != 0) {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                alertDialog$Builder.a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            showDialog(alertDialog$Builder.a);
            return false;
        }
        long j11 = -j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            return true;
        }
        if (!this.q2 && ChatObject.isCanWriteToChannel(j11, this.currentAccount) && (i10 = this.T0) != 2 && i10 != 3) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder2.a.R = LocaleController.getString(R.string.SendMessageTitle);
        int i13 = this.T0;
        if (i13 == 3) {
            alertDialog$Builder2.a.T = LocaleController.getString(R.string.TodoCantForward);
        } else if (i13 == 2) {
            alertDialog$Builder2.a.T = LocaleController.getString(R.string.PublicPollCantForward);
        } else {
            alertDialog$Builder2.a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
        }
        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog$Builder2.a);
        return false;
    }

    public final void x4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new bv(0));
        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(this, view);
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                boolean z10 = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i12 = org.telegram.ui.ActionBar.y6.i6;
                Drawable Z = org.telegram.ui.ActionBar.y6.Z(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
                org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(Z);
                org.telegram.ui.ActionBar.f7.k(linearLayout, Z, null, N, resourceProvider);
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                j9Var.r(currentUser);
                org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(this, getParentActivity(), z10);
                linearLayout.addView(gh0Var, org.telegram.ui.Components.gb1.x(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getParentActivity());
                if (z10) {
                    y9Var.setScaleX(0.833f);
                    y9Var.setScaleY(0.833f);
                }
                y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                y9Var.getImageReceiver().setCurrentAccount(intValue);
                y9Var.f(currentUser, j9Var);
                gh0Var.addView(y9Var, org.telegram.ui.Components.gb1.x(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, getResourceProvider());
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, org.telegram.ui.Components.gb1.t(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.pa(this, intValue, H, 14));
                H.r(linearLayout, org.telegram.ui.Components.gb1.r(230, 48));
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.y6.d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.y6.o1(0.15f, -16777216));
        H.z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(c02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override // org.telegram.ui.og0
    public final hh.d y() {
        return this.m4;
    }

    public final void y3(boolean z10) {
        ji.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.ws wsVar = this.J1;
        if (wsVar == null || (jVar = this.Q1) == null || (chatFull = this.a3) == null) {
            return;
        }
        wsVar.i(jVar, (this.Y2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.a3.requests_pending, new Object[0]));
    }

    public final void y4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().deleteDialog(j10, 1, z11);
            return;
        }
        if (chat == null) {
            getMessagesController().deleteDialog(j10, 0, z11);
            if (z10 && z11) {
                getMessagesController().blockPeer(j10);
            }
        } else if (ChatObject.isNotInChat(chat)) {
            getMessagesController().deleteDialog(j10, 0, z11);
        } else {
            getMessagesController().deleteParticipantFromChat(-j10, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, false);
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j10));
        }
        getMessagesController().checkIfFolderEmpty(this.W2);
    }

    @Override // oe.d
    public final void z(float f7, int i10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 != 3 || (w0Var = this.l0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) w0Var.getIconView().getDrawable();
        if (!this.d.f) {
            animatedVectorDrawable.reset();
            return;
        }
        animatedVectorDrawable.start();
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(this.currentAccount).getPremiumPromo();
            String m0 = PremiumPreviewFragment.m0(2);
            if (premiumPromo != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= premiumPromo.video_sections.size()) {
                        i11 = -1;
                        break;
                    } else if (premiumPromo.video_sections.get(i11).equals(m0)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    FileLoader.getInstance(this.currentAccount).loadFile(premiumPromo.videos.get(i11), premiumPromo, 3, 0);
                }
            }
        }
    }

    public final void z3(ay ayVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        int L0 = ayVar.c.L0();
        int N0 = ayVar.c.N0();
        if (this.h3 || this.m3) {
            return;
        }
        qx qxVar = this.z0;
        if (qxVar != null && qxVar.getVisibility() == 0 && this.z0.O) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            s4.e1 K = ayVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.b2 = z14;
            if (z14) {
                k4(false);
            }
        } else {
            this.b2 = false;
        }
        int i11 = ayVar.s;
        if (i11 == 7 || i11 == 8) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int i12 = ayVar.h;
            if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(ayVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= Z3(this.currentAccount, ayVar.s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                boolean z15 = !isDialogsEndReached;
                z10 = (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) ? false : true;
                z11 = z15;
                if ((abs > 0 || N0 < Z3(this.currentAccount, ayVar.s, this.W2, this.S1).size() - 10) && (abs != 0 || (!((i10 = ayVar.s) == 7 || i10 == 8) || getMessagesController().isDialogsEndReached(this.W2)))) {
                    z12 = false;
                    z13 = false;
                } else {
                    boolean isDialogsEndReached2 = getMessagesController().isDialogsEndReached(this.W2);
                    boolean z16 = !isDialogsEndReached2;
                    if (isDialogsEndReached2 && getMessagesController().isServerDialogsEndReached(this.W2)) {
                        z13 = z16;
                        z12 = false;
                    } else {
                        z13 = z16;
                        z12 = true;
                    }
                }
                if (!z12 || z10) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.uv
                        @Override // java.lang.Runnable
                        public final void run() {
                            cy cyVar = cy.this;
                            if (z12) {
                                cyVar.getMessagesController().loadDialogs(cyVar.W2, -1, 100, z13);
                            }
                            if (z10) {
                                cyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                            } else {
                                cyVar.getClass();
                            }
                        }
                    });
                }
                return;
            }
        }
        z10 = false;
        z11 = false;
        if (abs > 0) {
        }
        z12 = false;
        z13 = false;
        if (z12) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.uv
            @Override // java.lang.Runnable
            public final void run() {
                cy cyVar = cy.this;
                if (z12) {
                    cyVar.getMessagesController().loadDialogs(cyVar.W2, -1, 100, z13);
                }
                if (z10) {
                    cyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                } else {
                    cyVar.getClass();
                }
            }
        });
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void z4(java.util.ArrayList r43, int r44, boolean r45, boolean r46, java.util.HashSet r47) {
        /*
            Method dump skipped, instructions count: 2845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.z4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override // org.telegram.ui.og0
    public final /* synthetic */ void D() {
    }
}

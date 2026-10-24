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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class ey extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, ng.b, ne.d, qg0 {
    public static final boolean[] A4 = new boolean[4];
    public static final org.telegram.ui.Components.js0 B4 = new org.telegram.ui.Components.js0(3);
    public static float C4;
    public static boolean z4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public ow B1;
    public boolean B2;
    public boolean B3;
    public nx C0;
    public ki.y1 C1;
    public xx C2;
    public Long C3;
    public org.telegram.ui.Components.pv0 D0;
    public org.telegram.ui.ActionBar.u0 D1;
    public ArrayList D2;
    public Drawable D3;
    public boolean E;
    public vw E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Components.p5 E3;
    public boolean F;
    public org.telegram.ui.Components.ss F0;
    public nw F1;
    public CharSequence F2;
    public org.telegram.ui.Cells.o F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.nr0 G2;
    public yw G3;
    public long H;
    public float H0;
    public nw H1;
    public ot H2;
    public final mw H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public final mw I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.us J1;
    public boolean J2;
    public og0 J3;
    public boolean K;
    public ai.jc K0;
    public org.telegram.ui.Components.ts K1;
    public int K2;
    public NotificationCenter.ObserversGroup K3;
    public boolean L;
    public org.telegram.ui.Components.j80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public ax M0;
    public org.telegram.ui.Cells.y2 M1;
    public boolean M2;
    public int M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.ta N1;
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
    public ii.j Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public qu R3;
    public org.telegram.ui.Components.qc S;
    public int S0;
    public boolean S1;
    public int S2;
    public String S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.c2 T1;
    public int T2;
    public ArrayList T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public org.telegram.ui.Components.xd0 V0;
    public boolean V1;
    public boolean V2;
    public CharSequence V3;
    public boolean W;
    public org.telegram.ui.Cells.q2 W0;
    public long W1;
    public int W2;
    public boolean W3;
    public tx X;
    public org.telegram.ui.Cells.q2 X0;
    public TLObject X1;
    public ey X2;
    public float X3;
    public zf.h0 Y;
    public boolean Y0;
    public int Y1;
    public long Y2;
    public boolean Y3;
    public m31 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.Chat Z2;
    public boolean Z3;
    public final int a;
    public org.telegram.ui.Components.k91 a0;
    public final ArrayList a1;
    public boolean a2;
    public TLRPC.ChatFull a3;
    public ValueAnimator a4;
    public final ne.b b;
    public hg.q0 b0;
    public boolean b1;
    public boolean b2;
    public org.telegram.ui.Components.w9 b3;
    public org.telegram.ui.Components.e50 b4;
    public final ne.b c;
    public float c0;
    public boolean c1;
    public boolean c2;
    public org.telegram.ui.Components.h9 c3;
    public TLRPC.FileLocation c4;
    public final ne.b d;
    public ValueAnimator d0;
    public boolean d1;
    public int d2;
    public long d3;
    public TLRPC.FileLocation d4;
    public final ne.b e;
    public dy[] e0;
    public org.telegram.ui.ActionBar.h2 e1;
    public boolean e2;
    public boolean e3;
    public org.telegram.ui.Components.qc e4;
    public final ne.b f;
    public org.telegram.ui.ActionBar.u0 f0;
    public final Paint f1;
    public String f2;
    public boolean f3;
    public int f4;
    public org.telegram.ui.ActionBar.u0 g0;
    public ImageView g1;
    public String g2;
    public AnimatorSet g3;
    public int g4;
    public final ne.b h;
    public gy h0;
    public NumberTextView h1;
    public String h2;
    public boolean h3;
    public int h4;
    public boolean i0;
    public final ArrayList i1;
    public boolean i2;
    public boolean i3;
    public int i4;
    public org.telegram.ui.ActionBar.u0 j0;
    public org.telegram.ui.ActionBar.u0 j1;
    public boolean j2;
    public float j3;
    public int j4;
    public org.telegram.ui.ActionBar.u0 k0;
    public org.telegram.ui.ActionBar.u0 k1;
    public boolean k2;
    public boolean k3;
    public ih.k k4;
    public org.telegram.ui.ActionBar.u0 l0;
    public org.telegram.ui.ActionBar.u0 l1;
    public boolean l2;
    public int l3;
    public final bh.f l4;
    public org.telegram.ui.ActionBar.u0 m0;
    public org.telegram.ui.ActionBar.u0 m1;
    public boolean m2;
    public boolean m3;
    public final gh.d m4;
    public final ne.b n;
    public org.telegram.ui.Components.fj0 n0;
    public org.telegram.ui.ActionBar.e1 n1;
    public String n2;
    public boolean n3;
    public final gh.d n4;
    public org.telegram.ui.ActionBar.e1 o0;
    public org.telegram.ui.ActionBar.e1 o1;
    public String o2;
    public org.telegram.ui.Components.qc o3;
    public final gh.c o4;
    public ei.x3 p0;
    public org.telegram.ui.ActionBar.e1 p1;
    public final MessagesStorage.TopicKey p2;
    public final AnimationNotificationsLocker p3;
    public final bh.b p4;
    public ei.x3 q0;
    public org.telegram.ui.ActionBar.e1 q1;
    public boolean q2;
    public boolean q3;
    public final bh.b q4;
    public final ne.b r;
    public boolean r0;
    public org.telegram.ui.ActionBar.e1 r1;
    public boolean r2;
    public boolean r3;
    public final bh.b r4;
    public final ne.b s;
    public boolean s0;
    public org.telegram.ui.ActionBar.e1 s1;
    public boolean s2;
    public boolean s3;
    public final bh.b s4;
    public org.telegram.ui.Components.h20 t0;
    public org.telegram.ui.ActionBar.e1 t1;
    public boolean t2;
    public boolean t3;
    public vv t4;
    public org.telegram.ui.Components.h20 u0;
    public float u1;
    public boolean u2;
    public float u3;
    public final ArrayList u4;
    public final qh.i v;
    public ei.d v0;
    public float v1;
    public boolean v2;
    public ValueAnimator v3;
    public final RectF v4;
    public boolean w;
    public kh.f w0;
    public AnimatorSet w1;
    public boolean w2;
    public float w3;
    public final RectF w4;
    public int x;
    public int x0;
    public float x1;
    public boolean x2;
    public float x3;
    public int x4;
    public boolean y;
    public final UndoView[] y0;
    public ih.f y1;
    public boolean y2;
    public float y3;
    public int y4;
    public cw z0;
    public FrameLayout z1;
    public boolean z2;
    public int z3;

    public ey(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.b = new ne.b(1, this, bsVar, 350L, false);
        this.c = new ne.b(2, this, bsVar, 350L, false);
        this.d = new ne.b(3, this, bsVar, 350L, false);
        this.e = new ne.b(4, this, bsVar, 350L, false);
        this.f = new ne.b(5, this, bsVar, 350L, false);
        this.h = new ne.b(6, this, bsVar, 350L, false);
        this.n = new ne.b(7, this, bsVar, 350L, false);
        this.r = new ne.b(8, this, bsVar, 350L, false);
        this.s = new ne.b(9, this, bsVar, 350L, false);
        this.v = new qh.i(new uv(this, 2));
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
        this.H3 = new mw(this, 0);
        this.I3 = new mw(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.u4 = arrayList;
        RectF rectF = new RectF();
        this.v4 = rectF;
        RectF rectF2 = new RectF();
        this.w4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        gh.c cVar = new gh.c();
        this.o4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        if (i10 >= 31) {
            this.l4 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.m4 = dVar;
            dVar.k(new jx(this, 0));
            gh.d dVar2 = new gh.d(null);
            this.n4 = dVar2;
            dVar2.k(new jx(this, 3));
            bh.b bVar = new bh.b(dVar);
            this.p4 = bVar;
            bVar.i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.r4 = bVar2;
            bVar2.i = LiteMode.isEnabled(262144);
            this.q4 = new bh.b(dVar);
        } else {
            this.l4 = null;
            this.m4 = null;
            this.n4 = null;
            this.p4 = new bh.b(cVar);
            this.r4 = new bh.b(cVar);
            this.q4 = new bh.b(cVar);
        }
        this.s4 = new bh.b(cVar);
    }

    public static /* synthetic */ void B0(ey eyVar, float f7, ValueAnimator valueAnimator) {
        eyVar.e0[0].setTranslationY((1.0f - eyVar.u3) * f7);
        eyVar.u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < eyVar.actionBar.getChildCount(); i10++) {
            if (eyVar.actionBar.getChildAt(i10).getVisibility() == 0 && eyVar.actionBar.getChildAt(i10) != eyVar.actionBar.getActionMode() && eyVar.actionBar.getChildAt(i10) != eyVar.actionBar.getBackButton()) {
                eyVar.actionBar.getChildAt(i10).setAlpha(1.0f - eyVar.u3);
            }
        }
        eyVar.C3();
        eyVar.u3();
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void C0(ey eyVar) {
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(eyVar.getParentActivity(), eyVar.resourceProvider);
        ybVar.d(R.raw.email_check_inbox, new String[0]);
        ybVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.qc.g(eyVar, ybVar, 2750).j();
        try {
            eyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void D0(ey eyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() != 1) {
            ug.l1.e0(0, birthdayState);
            return;
        }
        yh.o1 o1Var = new yh.o1(eyVar.getParentActivity(), eyVar.currentAccount, birthdayState.today.get(0).id, null, null);
        o1Var.V(true);
        eyVar.showDialog(o1Var);
    }

    public static void E0(ey eyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(eyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
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
            eyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.v0.p(R.string.UnknownError, org.telegram.ui.Components.xc.a0(eyVar), R.raw.error, 36);
            return;
        }
        if (eyVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity(), 0, eyVar.resourceProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            eyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static /* synthetic */ void F0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        eyVar.S4();
    }

    public static void J2(ey eyVar, float f7) {
        float f10;
        float f11;
        float clamp = Utilities.clamp(eyVar.x1 * 2.0f, 1.0f, 0.0f);
        vw vwVar = eyVar.E0;
        float f12 = (1.0f - eyVar.u3) * f7 * eyVar.H0;
        float f13 = 1.0f - clamp;
        vwVar.setAlpha(f12 * f13);
        if (eyVar.K || eyVar.M) {
            float clamp2 = Utilities.clamp((-eyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (eyVar.u3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            eyVar.E0.setClipTop(0);
            if (eyVar.K || !eyVar.M) {
                eyVar.E0.setTranslationY(((eyVar.T / 2.0f) + (Math.max(eyVar.N, -eyVar.S3()) + eyVar.w3)) - AndroidUtilities.dp(8.0f));
                eyVar.E0.l(clamp2, !eyVar.G3.c());
                if (eyVar.M) {
                    f10 = 1.0f - clamp3;
                    eyVar.actionBar.setTranslationY(0.0f);
                } else {
                    f11 = eyVar.H0;
                }
            } else {
                eyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                eyVar.E0.setProgressToCollapse(1.0f);
                f11 = eyVar.H0;
            }
            f10 = 1.0f - f11;
            eyVar.actionBar.setTranslationY(0.0f);
        } else {
            if (eyVar.L) {
                eyVar.E0.setTranslationY((Math.max(eyVar.N, -eyVar.S3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                eyVar.E0.setProgressToCollapse(1.0f);
                vw vwVar2 = eyVar.E0;
                vwVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - vwVar2.getY()));
            }
            f10 = 1.0f - eyVar.H0;
            eyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 == 1.0f) {
            eyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            eyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f15 = 1.0f - eyVar.u3;
            eyVar.actionBar.getTitlesContainer().setAlpha(f15);
            eyVar.actionBar.getTitlesContainer().setVisibility(f15 > 0.0f ? 0 : 4);
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f15);
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f15 <= 0.0f ? 4 : 0);
            return;
        }
        eyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
        eyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
        float f16 = (0.6f * f14) + 0.4f;
        eyVar.actionBar.getTitlesContainer().setScaleY(f16);
        eyVar.actionBar.getTitlesContainer().setScaleX(f16);
        eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
        eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
        eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
        float f17 = (1.0f - eyVar.u3) * f14;
        eyVar.actionBar.getTitlesContainer().setAlpha(f17);
        eyVar.actionBar.getTitlesContainer().setVisibility(f17 > 0.0f ? 0 : 4);
        eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f17 <= 0.0f ? 4 : 0);
    }

    public static void K2(ey eyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        if (eyVar.parentLayout == null || eyVar.actionBar == null) {
            return;
        }
        float max = Math.max(eyVar.e.e, eyVar.T3());
        float f7 = 1.0f;
        float f10 = 1.0f - eyVar.x1;
        float f11 = max * f10 * f10;
        if (f11 == 0.0f) {
            return;
        }
        if (-1 >= i10) {
            f7 = 0.0f;
            i10 = -1;
        }
        if (f7 <= 0.0f || f11 <= 0.0f || i10 <= 0 || (h5Var = eyVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) h5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
    }

    public static org.telegram.ui.Cells.q2 O3(dy dyVar) {
        zx zxVar = dyVar.a;
        for (int i10 = 0; i10 < zxVar.getChildCount(); i10++) {
            View childAt = zxVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q2) {
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) childAt;
                if (q2Var.O()) {
                    return q2Var;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void U(ey eyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        eyVar.S4();
    }

    public static /* synthetic */ void V(ey eyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        eyVar.u3 = floatValue;
        eyVar.e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < eyVar.actionBar.getChildCount(); i10++) {
            if (eyVar.actionBar.getChildAt(i10).getVisibility() == 0 && eyVar.actionBar.getChildAt(i10) != eyVar.actionBar.getActionMode() && eyVar.actionBar.getChildAt(i10) != eyVar.actionBar.getBackButton()) {
                eyVar.actionBar.getChildAt(i10).setAlpha(1.0f - eyVar.u3);
            }
        }
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        eyVar.C3();
        eyVar.u3();
    }

    public static void W(ey eyVar) {
        ArrayList arrayList = eyVar.I2;
        org.telegram.ui.ActionBar.h5 h5Var = eyVar.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).x()) {
            eyVar.finishPreviewFragment();
            return;
        }
        if (eyVar.R0 != 10) {
            if (MessagesController.getInstance(eyVar.currentAccount).isFrozen()) {
                b.b(eyVar.currentAccount);
                return;
            } else {
                eyVar.presentFragment(new ContactsActivity(a1.g.h("destroyAfterSelect", true)));
                return;
            }
        }
        if (eyVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
        }
        eyVar.C2.w(eyVar, arrayList2, null, false, eyVar.J2, eyVar.K2, eyVar.L2, null);
    }

    public static /* synthetic */ void X(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        eyVar.S4();
    }

    public static void Y(ey eyVar) {
        PasskeysActivity.a0(eyVar.currentAccount, eyVar.getParentActivity(), eyVar.resourceProvider, true);
    }

    public static /* synthetic */ void Z(ey eyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(eyVar.currentAccount).getClientUserId());
        eyVar.presentFragment(new sn(bundle));
    }

    public static /* synthetic */ void a0(ey eyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = eyVar.getMessagesController().getUserFull(eyVar.getUserConfig().getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        eyVar.getMessagesController().invalidateContentSettings();
        eyVar.getConnectionsManager().sendRequest(updatebirthday, new ca(eyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        eyVar.S4();
    }

    public static /* synthetic */ void b0(ey eyVar, String str) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, str);
        eyVar.S4();
    }

    public static void b1(ey eyVar, boolean z10) {
        if (eyVar.e0 == null || eyVar.N3 == z10) {
            return;
        }
        eyVar.N3 = z10;
        int i10 = 0;
        while (true) {
            dy[] dyVarArr = eyVar.e0;
            if (i10 >= dyVarArr.length) {
                return;
            }
            if (z10) {
                dyVarArr[i10].a.setScrollbarFadingEnabled(false);
            }
            eyVar.e0[i10].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                eyVar.e0[i10].a.setScrollbarFadingEnabled(true);
            }
            i10++;
        }
    }

    public static void b4(sn snVar, MessageObject messageObject) {
        if (messageObject == null || !messageObject.hasHighlightedWords()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(messageObject.caption) ? messageObject.caption : messageObject.messageText;
            CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.g6) null);
            if (highlightText instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                org.telegram.ui.Components.m10[] m10VarArr = (org.telegram.ui.Components.m10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.m10.class);
                if (m10VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(m10VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(m10VarArr[0]);
                    for (int i10 = 1; i10 < m10VarArr.length; i10++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(m10VarArr[i10]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(m10VarArr[i10]);
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
                    snVar.sb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void c0(ey eyVar, dy dyVar, View view, int i10) {
        int i11;
        if (view instanceof org.telegram.ui.Cells.u3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.q2;
        if (z10) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            if (q2Var.n2) {
                eyVar.L4(q2Var.getDialogId(), view);
                return;
            }
        }
        if (eyVar.G3()) {
            eyVar.m4(view, i10, 0.0f, dyVar.d);
            return;
        }
        int i12 = eyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.r8)) {
            dyVar.d.L();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle h = a1.g.h("forImport", true);
            h.putLongArray("result", new long[]{eyVar.getUserConfig().getClientUserId()});
            h.putInt("chatType", 4);
            String string = eyVar.arguments.getString("importTitle");
            if (string != null) {
                h.putString("title", string);
            }
            w60 w60Var = new w60(h);
            w60Var.Y = new iw(eyVar);
            eyVar.presentFragment(w60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.y2) && ((i11 = dyVar.s) == 7 || i11 == 8)) {
            hg.k kVar = (hg.k) dyVar.d.M.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (kVar == null || kVar.a != 17) ? null : kVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = eyVar.getMessagesController().selectedDialogFilter[dyVar.s - 7];
                if (dialogFilter != null) {
                    int i14 = dialogFilter.id;
                    org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(eyVar, false);
                    k10Var.Y = -1;
                    k10Var.c0 = "";
                    k10Var.d0 = new ArrayList();
                    k10Var.f0 = "";
                    k10Var.h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    k10Var.i0 = arrayList;
                    k10Var.z0 = -1;
                    k10Var.C0 = -5;
                    k10Var.Y = i14;
                    k10Var.a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    k10Var.g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = eyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            }
                            if (arrayList2.get(i13).id == i14) {
                                k10Var.c0 = arrayList2.get(i13).name;
                                break;
                            }
                            i13++;
                        }
                    }
                    k10Var.T();
                    eyVar.showDialog(k10Var);
                    return;
                }
                return;
            }
        } else if (z10 && !eyVar.actionBar.s() && !eyVar.G3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.q2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        eyVar.l4(view, i10, dyVar.d);
    }

    public static /* synthetic */ void d0(ey eyVar) {
        eyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(eyVar.parentLayout, "newChatsRow");
    }

    public static /* synthetic */ void e0(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(eyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(eyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ca(eyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static /* synthetic */ void f0(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.H0(launchActivity, eyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(eyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void g4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = A4;
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
        AndroidUtilities.runOnUIThread(new ti(accountInstance, 19), 200L);
        Iterator<String> it = messagesController.diceEmojies.iterator();
        while (it.hasNext()) {
            accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
        }
        zArr[currentAccount] = true;
    }

    public static /* synthetic */ void h0(ey eyVar) {
        if (eyVar.b4.g()) {
            MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            eyVar.S4();
        }
    }

    public static /* synthetic */ void j0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        eyVar.S4();
    }

    public static /* synthetic */ void k0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        eyVar.S4();
    }

    public static void l0(ey eyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            c2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.f5.f0(eyVar.currentAccount, tL_error, eyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            eyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        eyVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        ai.v3 v3Var = new ai.v3(eyVar, j10, 27);
        Pattern pattern = org.telegram.ui.Components.f5.a;
        if (eyVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = eyVar.getCurrentAccount();
            Activity parentActivity = eyVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            TextView textView = new TextView(parentActivity);
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
            h9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(w9Var, w7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.v0.q(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(LocaleController.getString(R.string.ImportMessages));
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                h9Var.k(currentAccount, chat);
                w9Var.e(chat, h9Var);
            } else if (UserObject.isReplyUser(user)) {
                h9Var.p = 0.8f;
                h9Var.g(12);
                w9Var.h(null, null, h9Var, user);
            } else if (user.id == clientUserId) {
                h9Var.p = 0.8f;
                h9Var.g(1);
                w9Var.h(null, null, h9Var, user);
            } else {
                h9Var.p = 1.0f;
                h9Var.m(currentAccount, user);
                w9Var.e(user, h9Var);
            }
            textView.setText(AndroidUtilities.replaceTags(str));
            alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(v3Var, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            eyVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void m0(ey eyVar, int i10) {
        Object obj;
        org.telegram.ui.Components.no0 no0Var = eyVar.C0.o0;
        if (i10 < no0Var.Z || i10 >= no0Var.a0) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.m61 G = no0Var.G(i10);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity(), 0, eyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.R = string;
            c2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ks(3, eyVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void m1(ey eyVar, dy dyVar, float f7) {
        if (eyVar.T == f7) {
            return;
        }
        eyVar.T = f7;
        if (f7 == 0.0f) {
            eyVar.U = false;
        }
        eyVar.E0.setOverscroll(f7);
        dyVar.a.setViewsOffset(f7);
        dyVar.a.setOverScrollMode(f7 != 0.0f ? 2 : 0);
        eyVar.fragmentView.invalidate();
        if (f7 <= AndroidUtilities.dp(90.0f) || eyVar.U) {
            return;
        }
        vw vwVar = eyVar.E0;
        ValueAnimator valueAnimator = vwVar.H0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            vwVar.i(vwVar.p0, true);
            eyVar.U = true;
            eyVar.getOrCreateStoryViewer().s(new ev(eyVar, 19));
        }
    }

    public static void n0(ey eyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i10 != 102) {
            eyVar.p4(arrayList, i10, false, false, null);
            return;
        }
        eyVar.getMessagesController().setDialogsInTransaction(true);
        eyVar.p4(arrayList, i10, false, false, z10 ? hashSet : null);
        eyVar.getMessagesController().setDialogsInTransaction(false);
        eyVar.getMessagesController().checkIfFolderEmpty(eyVar.W2);
        int i11 = eyVar.W2;
        if (i11 == 0 || eyVar.P3(eyVar.currentAccount, eyVar.e0[0].s, i11, false).size() != 0) {
            return;
        }
        eyVar.e0[0].a.setEmptyView(null);
        eyVar.e0[0].w.setVisibility(4);
        eyVar.finishFragment();
    }

    public static boolean n1(ey eyVar, dy dyVar) {
        if (eyVar.G3.c()) {
            return false;
        }
        int i10 = (int) (-eyVar.N);
        int R3 = eyVar.R3();
        int S3 = eyVar.S3();
        if (i10 == 0 || i10 == R3 || i10 == S3 || !dyVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (S3 >= i10 || i10 >= R3) {
            if ((eyVar.u3 != 1.0f ? Utilities.clamp((-eyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f) : 1.0f) < eyVar.E0.B0) {
                dyVar.b.z(-i10);
                return true;
            }
            dyVar.b.z(S3 - i10);
            return true;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int i11 = i10 - S3;
        if (i11 < dp / 2) {
            dyVar.b.z(-i11);
            return true;
        }
        dyVar.b.z(dp - i11);
        return true;
    }

    public static String o2(ey eyVar) {
        ArrayList arrayList = eyVar.I2;
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
            if (longValue == eyVar.getUserConfig().getClientUserId()) {
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb2.append(arrayList.size() == 1 ? DialogObject.getName(eyVar.currentAccount, longValue) : DialogObject.getShortName(eyVar.currentAccount, longValue));
            }
        }
        return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
    }

    public static void p0(ey eyVar, int i10, org.telegram.ui.Components.j80 j80Var) {
        if (eyVar.currentAccount == i10) {
            return;
        }
        j80Var.u();
        if (eyVar.getParentActivity() == null) {
            return;
        }
        xx xxVar = eyVar.C2;
        LaunchActivity launchActivity = (LaunchActivity) eyVar.getParentActivity();
        ArrayList arrayList = eyVar.D2;
        String str = eyVar.E2;
        CharSequence charSequence = eyVar.F2;
        ow owVar = eyVar.B1;
        CharSequence fieldText = owVar != null ? owVar.getFieldText() : null;
        launchActivity.P0(i10);
        ey eyVar2 = new ey(eyVar.arguments);
        eyVar2.C2 = xxVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                eyVar2.C4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    eyVar2.F2 = null;
                } else {
                    eyVar2.F2 = charSequence;
                    eyVar2.E2 = null;
                    eyVar2.D2 = null;
                    if (eyVar2.B1 != null) {
                        eyVar2.h3(fieldText);
                    } else {
                        eyVar2.V3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            eyVar2.D2 = null;
        } else {
            eyVar2.D2 = arrayList;
            eyVar2.E2 = null;
            eyVar2.M2 = false;
            if (eyVar2.B1 != null) {
                eyVar2.h3(fieldText);
            } else {
                eyVar2.V3 = fieldText;
            }
        }
        launchActivity.v0(eyVar2, false, true);
    }

    public static /* synthetic */ void q0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, eyVar.B3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        eyVar.S4();
    }

    public static void r0(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            hi1.a(eyVar.getParentActivity(), new y(eyVar, tL_attachMenuBot, launchActivity, 7), null);
        } else {
            LaunchActivity.H0(launchActivity, eyVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static void s0(ey eyVar) {
        b.c(eyVar.getParentActivity(), eyVar.currentAccount, eyVar.getResourceProvider());
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final ey eyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        eyVar.Z3(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                eyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i13 = eyVar.W2) != 0 && eyVar.P3(eyVar.currentAccount, eyVar.e0[0].s, i13, false).size() == 1) {
            eyVar.e0[0].w.setVisibility(4);
        }
        eyVar.z3 = 3;
        int i14 = -1;
        if (i10 == 102) {
            eyVar.y4(true, true);
            if (eyVar.R1 != null) {
                i12 = 0;
                while (i12 < eyVar.R1.size()) {
                    if (((TLRPC.Dialog) eyVar.R1.get(i12)).id == j10) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            i12 = -1;
            eyVar.m3();
            i11 = i12;
        } else {
            i11 = -1;
        }
        UndoView W3 = eyVar.W3();
        if (W3 != null) {
            W3.j(i10 == 103 ? 0 : z11 ? 1 : 95, j10, new Runnable() { // from class: org.telegram.ui.pv
                @Override // java.lang.Runnable
                public final void run() {
                    eyVar.o4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(eyVar.P3(eyVar.currentAccount, eyVar.e0[0].s, eyVar.W2, false));
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
            if (i11 < 0 || i14 >= 0 || (arrayList = eyVar.R1) == null) {
                eyVar.y4(false, true);
                return;
            }
            arrayList.remove(i11);
            eyVar.e0[0].x.D();
            eyVar.e0[0].q(true);
        }
    }

    public static void u0(ey eyVar) {
        BirthdayController.getInstance(eyVar.currentAccount).hide();
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        eyVar.S4();
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.xc.a0(eyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void v0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        eyVar.S4();
    }

    public static void w0(ey eyVar) {
        if (eyVar.O3) {
            ei.x3 x3Var = eyVar.p0;
            if (x3Var != null) {
                x3Var.e(true);
            }
            ci.b7 o10 = MessagesController.getInstance(eyVar.currentAccount).getStoriesController().o();
            if (o10 != null && o10.a(eyVar.currentAccount, 1)) {
                eyVar.showDialog(new sg.j0(o10.b(), eyVar.currentAccount, eyVar.getParentActivity(), eyVar, null));
                return;
            } else {
                ei.vb D = ei.vb.D(eyVar.getParentActivity(), eyVar.currentAccount);
                D.x = new jx(eyVar, 4);
                D.Q(null);
                return;
            }
        }
        ei.x3 x3Var2 = eyVar.q0;
        if (x3Var2 != null) {
            if (x3Var2.V) {
                return;
            } else {
                AndroidUtilities.removeFromParent(x3Var2);
            }
        }
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.k6.Gi, 0, new uv(eyVar, 8));
        ei.x3 x3Var3 = new ei.x3(eyVar.getParentActivity(), 2);
        x3Var3.q(8.0f);
        x3Var3.d = 8000L;
        x3Var3.i(true);
        x3Var3.p(true);
        x3Var3.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
        x3Var3.s(replaceSingleTag);
        x3Var3.l(1.0f, -40.0f);
        x3Var3.h(eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        eyVar.q0 = x3Var3;
        x3Var3.setTranslationY((-eyVar.g4) - eyVar.i4);
        ((ViewGroup) eyVar.fragmentView).addView(eyVar.q0, w7.z5.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        eyVar.q0.u();
    }

    public static void x0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        eyVar.S4();
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.xc.a0(eyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.j = 5000;
        G.j();
    }

    public static void y0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        eyVar.S4();
        org.telegram.ui.Components.qc J = org.telegram.ui.Components.xc.a0(eyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new ev(eyVar, 1));
        J.j = 5000;
        J.j();
    }

    public static void z0(ey eyVar) {
        try {
            ((org.telegram.ui.Components.yj0) ((org.telegram.ui.Components.h9) eyVar.M1.h.getImageReceiver().getStaticThumb()).K).H(true);
        } catch (Exception unused) {
        }
        if (eyVar.b4 == null) {
            org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
            eyVar.b4 = e50Var;
            e50Var.H = true;
            e50Var.a = eyVar;
            e50Var.b = new rx(eyVar);
            eyVar.getMediaDataController().checkFeaturedStickers();
            eyVar.getMessagesController().loadSuggestedFilters();
            eyVar.getMessagesController().loadUserInfo(eyVar.getUserConfig().getCurrentUser(), true, eyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(eyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(eyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(eyVar.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.ti tiVar = eyVar.b4.c;
        if (tiVar != null) {
            tiVar.h1();
        }
        org.telegram.ui.Components.e50 e50Var2 = eyVar.b4;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        e50Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new ev(eyVar, 0), new fv(eyVar, 0), 0);
    }

    public final void A3() {
        u3();
        org.telegram.ui.Components.h20.d(this.k0, (1.0f - this.b.e) * (1.0f - T3()) * (1.0f - this.c.e));
        v3();
        y3();
        w3();
        x3();
    }

    public final void A4(float f7) {
        dy[] dyVarArr = this.e0;
        if (dyVarArr != null) {
            int paddingTop = dyVarArr[0].a.getPaddingTop() + ((int) f7);
            int i10 = 0;
            while (true) {
                dy[] dyVarArr2 = this.e0;
                if (i10 >= dyVarArr2.length) {
                    break;
                }
                dyVarArr2[i10].a.setTopGlowOffset(paddingTop);
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
            this.F3.setAlpha(w7.r.a(currentActionBarHeight, 0.0f, 1.0f));
            this.F3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        C3();
        this.fragmentView.invalidate();
    }

    @Override // ng.b
    public final List B() {
        return Arrays.asList(new ng.a(LocaleController.getString(R.string.DebugDialogsActivity)), new ng.a(LocaleController.getString(R.string.ClearLocalDatabase), new ev(this, 28)), new ng.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new ev(this, 29)));
    }

    public final void B3() {
        String string = LocaleController.getString(T3() > 0.5f ? R.string.SearchTopics : R.string.SearchChats);
        this.X.r.setContentDescription(string);
        this.X.r.setHint(string);
    }

    public final void B4(float f7) {
        this.x1 = f7;
        Z4();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        Q4();
    }

    public final void C3() {
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.r.a(((-this.N) - S3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = (this.R0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.u3, this.h.e)) * Math.max(this.b.e, (1.0f - T3()) * a2);
        this.X.setAlpha(max);
        this.X.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final void C4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.E2 = null;
            this.F2 = null;
            return;
        }
        this.E2 = str;
        this.F2 = null;
        this.D2 = null;
        if (this.B1 != null) {
            h3(charSequence);
        } else {
            this.V3 = charSequence;
        }
    }

    public final void D3() {
        if (this.Z != null) {
            float f7 = (this.a0 != null ? 1.0f : 0.0f) * this.b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f7);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f7);
            this.Z.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.k91 k91Var = this.a0;
        ne.b bVar = this.s;
        if (k91Var != null) {
            float f10 = 1.0f - bVar.e;
            k91Var.setAlpha(f10);
            this.a0.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        hg.q0 q0Var = this.b0;
        if (q0Var != null) {
            float f11 = bVar.e;
            q0Var.setAlpha(f11);
            this.b0.setVisibility(f11 > 0.0f ? 0 : 8);
        }
    }

    public final void D4(float f7) {
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
                vw vwVar = this.E0;
                if (vwVar != null) {
                    vwVar.setTranslationX(f10);
                }
                tx txVar = this.X;
                if (txVar != null) {
                    txVar.setTranslationX(f10);
                }
                yw ywVar = this.G3;
                if (ywVar == null || ywVar.getFragmentView() == null || this.y) {
                    return;
                }
                this.G3.getFragmentView().setTranslationX(f10);
                return;
            }
            float f11 = -AndroidUtilities.dp(4.0f);
            float f12 = 1.0f - this.X3;
            float f13 = f11 * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            vw vwVar2 = this.E0;
            if (vwVar2 != null) {
                vwVar2.setScaleX(f14);
                this.E0.setScaleY(f14);
                this.E0.setTranslationX(f13);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            tx txVar2 = this.X;
            if (txVar2 != null) {
                txVar2.setTranslationX(f13);
                this.X.setScaleX(f14);
                this.X.setScaleY(f14);
            }
            yw ywVar2 = this.G3;
            if (ywVar2 == null || ywVar2.getFragmentView() == null) {
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

    public final void E3(boolean z10) {
        if (this.C0 == null || this.actionBar == null) {
            return;
        }
        int i10 = AndroidUtilities.navigationBarHeight;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.a) + (this.a0 != null ? AndroidUtilities.dp(50.0f) : 0);
        org.telegram.ui.Components.us usVar = this.J1;
        int c10 = measuredHeight + (usVar != null ? (int) usVar.c(AndroidUtilities.dp(7.0f)) : 0);
        nx nxVar = this.C0;
        SparseArray sparseArray = nxVar.h;
        nxVar.U0 = c10;
        nxVar.V0 = i10;
        ai.u1 u1Var = nxVar.V;
        if (z10) {
            u1Var.s1(0, c10, 0, i10);
        } else {
            u1Var.setPadding(0, c10, 0, i10);
        }
        nxVar.M0.j(nxVar.U0, nxVar.V0, z10);
        org.telegram.ui.Components.mo0 mo0Var = nxVar.W;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mo0Var.getLayoutParams();
        int i11 = marginLayoutParams.topMargin;
        int i12 = nxVar.U0;
        if (i11 != i12 || marginLayoutParams.bottomMargin != nxVar.V0) {
            marginLayoutParams.topMargin = i12;
            marginLayoutParams.bottomMargin = nxVar.V0;
            mo0Var.requestLayout();
        }
        org.telegram.ui.Components.ap0.O(nxVar.f0, nxVar.i0, nxVar.U0, nxVar.V0, z10);
        org.telegram.ui.Components.ap0.O(nxVar.k0, nxVar.n0, nxVar.U0, nxVar.V0, z10);
        org.telegram.ui.Components.ap0.O(nxVar.r0, nxVar.u0, nxVar.U0, nxVar.V0, z10);
        org.telegram.ui.Components.xh0 xh0Var = nxVar.p0;
        int i13 = nxVar.U0;
        int i14 = nxVar.V0;
        xh0Var.setClipToPadding(false);
        org.telegram.ui.Components.j71 j71Var = xh0Var.c;
        xh0Var.J = z10;
        xh0Var.setPadding(0, i13, 0, i14);
        if (z10) {
            j71Var.s1(0, i13, 0, i14);
        } else {
            j71Var.setPadding(0, i13, 0, i14);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) j71Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i13;
        marginLayoutParams2.bottomMargin = -i14;
        xh0Var.J = false;
        org.telegram.ui.Components.xn0 xn0Var = nxVar.G0;
        if (xn0Var != null) {
            xn0Var.b(nxVar.U0, nxVar.V0, z10);
        }
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) sparseArray.valueAt(i15);
            if (view instanceof i10) {
                ((i10) view).j(nxVar.U0, nxVar.V0, z10);
            }
        }
        for (int i16 = 0; i16 < nxVar.getChildCount(); i16++) {
            if (nxVar.getChildAt(i16) instanceof i10) {
                ((i10) nxVar.getChildAt(i16)).j(nxVar.U0, nxVar.V0, z10);
            }
        }
    }

    public final void E4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.w6 w6Var = new org.telegram.ui.Components.w6(getParentActivity(), this.currentAccount, getResourceProvider(), new ot(4, this, r0), new ti(r0, 18));
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(getParentActivity(), getResourceProvider());
        b3Var.c(w6Var);
        org.telegram.ui.ActionBar.h3 h3Var = b3Var.a;
        h3Var.show();
        org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
        h3Var.fixNavigationBarKey(org.telegram.ui.ActionBar.k6.h5);
    }

    public final void F3() {
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
    public final boolean F4(org.telegram.ui.Cells.q2 q2Var) {
        long j10;
        int b10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        long j11;
        int i10;
        LinearLayout linearLayout;
        ey eyVar;
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
        org.telegram.ui.ActionBar.e1 e1Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        char c11;
        final ey eyVar2 = this;
        boolean isCommunity = ChatObject.isCommunity(q2Var.g2);
        boolean z11 = false;
        if (!q2Var.N()) {
            long dialogId = q2Var.getDialogId();
            Bundle bundle = new Bundle();
            int messageId = q2Var.getMessageId();
            if (!DialogObject.isEncryptedDialog(dialogId)) {
                if (DialogObject.isUserDialog(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else if (eyVar2.Y2 == 0 || ((b10 = hi.t0.b(eyVar2.currentAccount, dialogId)) != 4 && b10 != 3)) {
                    TLRPC.Chat chat = eyVar2.getMessagesController().getChat(Long.valueOf(-dialogId));
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
                boolean z12 = eyVar2.Y2 == 0 && eyVar2.getMessagesController().filtersEnabled && eyVar2.getMessagesController().dialogFiltersLoaded && eyVar2.getMessagesController().dialogFilters != null && eyVar2.getMessagesController().dialogFilters.size() > 0;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
                if (z12) {
                    LinearLayout linearLayout2 = new LinearLayout(eyVar2.getParentActivity());
                    linearLayout2.setOrientation(1);
                    gx gxVar = new gx(eyVar2.getParentActivity(), 0);
                    LinearLayout linearLayout3 = new LinearLayout(eyVar2.getParentActivity());
                    linearLayout3.setOrientation(1);
                    gxVar.addView(linearLayout3);
                    int size = eyVar2.getMessagesController().dialogFilters.size();
                    int i18 = 0;
                    org.telegram.ui.ActionBar.e1 e1Var2 = null;
                    while (i18 < size) {
                        final MessagesController.DialogFilter dialogFilter2 = eyVar2.getMessagesController().dialogFilters.get(i18);
                        if (dialogFilter2.isDefault()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            i15 = i18;
                            c11 = 'd';
                            i16 = size;
                            j14 = dialogId;
                        } else {
                            final boolean includesDialog = dialogFilter2.includesDialog(AccountInstance.getInstance(eyVar2.currentAccount), dialogId);
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            i15 = i18;
                            i16 = size;
                            j14 = dialogId;
                            final ArrayList I = org.telegram.ui.Components.v00.I(eyVar2, dialogFilter2, arrayList, true, z11);
                            if (!includesDialog) {
                                c11 = 'd';
                            }
                            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(2, eyVar2.getParentActivity(), null, false, false);
                            e1Var3.setChecked(includesDialog);
                            i17 = i16;
                            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter2.name, e1Var3.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter2.entities, e1Var3.getTextView().getPaint().getFontMetricsInt());
                            e1Var3.setEmojiCacheType(dialogFilter2.title_noanimate ? 26 : 0);
                            e1Var3.j(replaceAnimatedEmoji, 0, new org.telegram.ui.Components.l10(eyVar2.getParentActivity(), R.drawable.msg_folders, dialogFilter2.color));
                            e1Var3.getTextView().setEmojiColor(eyVar2.getThemedColor(org.telegram.ui.ActionBar.k6.Oh));
                            e1Var3.setMinimumWidth(160);
                            e1Var = e1Var3;
                            j14 = j14;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                            e1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yv
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArrayList arrayList2;
                                    long j15;
                                    MessagesController.DialogFilter dialogFilter3;
                                    ey eyVar3 = ey.this;
                                    eyVar3.getClass();
                                    boolean z13 = includesDialog;
                                    ArrayList arrayList3 = I;
                                    MessagesController.DialogFilter dialogFilter4 = dialogFilter2;
                                    long j16 = j14;
                                    if (z13) {
                                        dialogFilter4.alwaysShow.remove(Long.valueOf(j16));
                                        dialogFilter4.neverShow.add(Long.valueOf(j16));
                                        q00.t0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, eyVar3, null);
                                        eyVar3.W3().k(j16, 21, Integer.valueOf(arrayList3.size()), dialogFilter4, null, null);
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
                                            q00.t0(dialogFilter3, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, eyVar3, null);
                                        }
                                        eyVar3.W3().k(j15, 20, Integer.valueOf(arrayList2.size()), dialogFilter3, null, null);
                                    }
                                    eyVar3.Z3(true);
                                    eyVar3.finishPreviewFragment();
                                }
                            });
                            linearLayout3.addView(e1Var);
                            eyVar2 = this;
                            dialogId = j14;
                            size = i17;
                            i18 = i15 + 1;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                            e1Var2 = e1Var;
                            z11 = false;
                        }
                        e1Var = e1Var2;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                        i17 = i16;
                        eyVar2 = this;
                        dialogId = j14;
                        size = i17;
                        i18 = i15 + 1;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                        e1Var2 = e1Var;
                        z11 = false;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    j11 = dialogId;
                    org.telegram.ui.ActionBar.e1 e1Var4 = e1Var2;
                    i10 = 160;
                    if (e1Var4 != null) {
                        e1Var4.m(false, true);
                    }
                    if (linearLayout3.getChildCount() <= 0) {
                        z12 = false;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout2;
                    } else {
                        View j1Var = new org.telegram.ui.ActionBar.j1(getParentActivity(), org.telegram.ui.ActionBar.k6.H8, getResourceProvider());
                        j1Var.setTag(R.id.fit_width_tag, 1);
                        org.telegram.ui.ActionBar.e1 e1Var5 = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
                        e1Var5.j(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                        e1Var5.setMinimumWidth(160);
                        e1Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 20));
                        linearLayout2.addView(e1Var5);
                        linearLayout2.addView(j1Var, w7.z5.n(-1, 8));
                        linearLayout2.addView(gxVar);
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout2;
                    }
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    j11 = dialogId;
                    i10 = 160;
                    linearLayout = null;
                }
                org.telegram.ui.ActionBar.o2[] o2VarArr = new org.telegram.ui.ActionBar.o2[1];
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z12 ? 3 : 2, getParentActivity(), getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
                if (z12) {
                    int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
                    org.telegram.ui.ActionBar.e1 e1Var6 = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
                    e1Var6.j(LocaleController.getString(R.string.FilterAddTo), R.drawable.msg_addfolder, null);
                    e1Var6.setMinimumWidth(i10);
                    e1Var6.setOnClickListener(new org.telegram.ui.Components.d51(13, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(e1Var6);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new xt(o2VarArr, 3));
                }
                if (isCommunity) {
                    eyVar = this;
                    c10 = 0;
                } else {
                    org.telegram.ui.ActionBar.e1 e1Var7 = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
                    if (q2Var.getHasUnread()) {
                        e1Var7.j(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                    } else {
                        e1Var7.j(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
                    }
                    e1Var7.setMinimumWidth(i10);
                    long j15 = j11;
                    ey eyVar3 = this;
                    j11 = j15;
                    e1Var7.setOnClickListener(new ai.t3(eyVar3, q2Var, j15, 5));
                    c10 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(e1Var7);
                    eyVar = eyVar3;
                }
                boolean[] zArr3 = new boolean[1];
                zArr3[c10] = true;
                TLRPC.Dialog dialog = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(j11);
                int i19 = eyVar.e0[c10].s;
                boolean z13 = (i19 == 7 || i19 == 8) && (!eyVar.actionBar.s() || eyVar.actionBar.t(null));
                if (z13) {
                    zArr = zArr3;
                    dialogFilter = eyVar.getMessagesController().selectedDialogFilter[eyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                } else {
                    zArr = zArr3;
                    dialogFilter = null;
                }
                if (eyVar.e4(dialog)) {
                    zArr2 = zArr;
                    j12 = j11;
                    r42 = 0;
                } else {
                    ArrayList<TLRPC.Dialog> dialogs = eyVar.getMessagesController().getDialogs(eyVar.W2);
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
                        } else if (eyVar.e4(dialog2)) {
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
                            if (!eyVar.getMessagesController().isPromoDialog(dialog2.id, false)) {
                                break;
                            }
                        }
                        i20++;
                        zArr = zArr2;
                        j11 = j12;
                        z13 = z10;
                    }
                    if (dialog == null || eyVar.e4(dialog)) {
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
                    int size3 = (!z10 || dialogFilter == null) ? (eyVar.W2 == 0 && dialogFilter == null) ? eyVar.getUserConfig().isPremium() ? eyVar.getMessagesController().maxPinnedDialogsCountPremium : eyVar.getMessagesController().maxPinnedDialogsCountDefault : eyVar.getUserConfig().isPremium() ? eyVar.getMessagesController().maxFolderPinnedDialogsCountPremium : eyVar.getMessagesController().maxFolderPinnedDialogsCountDefault : 100 - dialogFilter.alwaysShow.size();
                    boolean z14 = i13 + i22 <= size3 && (i14 + i21) - i12 <= size3;
                    r42 = 0;
                    zArr2[0] = z14;
                }
                if (zArr2[r42]) {
                    org.telegram.ui.ActionBar.e1 e1Var8 = new org.telegram.ui.ActionBar.e1(eyVar.getParentActivity(), r42, r42);
                    if (eyVar.e4(dialog)) {
                        e1Var8.j(LocaleController.getString(R.string.UnpinMessage), R.drawable.msg_unpin, null);
                    } else {
                        e1Var8.j(LocaleController.getString(R.string.PinMessage), R.drawable.msg_pin, null);
                    }
                    e1Var8.setMinimumWidth(160);
                    long j16 = j12;
                    j13 = j16;
                    e1Var8.setOnClickListener(new org.telegram.ui.Components.ur(eyVar, dialogFilter, dialog, j16, 1));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(e1Var8);
                } else {
                    j13 = j12;
                }
                if (DialogObject.isUserDialog(j13) && UserObject.isUserSelf(eyVar.getMessagesController().getUser(Long.valueOf(j13)))) {
                    i11 = 0;
                } else {
                    org.telegram.ui.ActionBar.e1 e1Var9 = new org.telegram.ui.ActionBar.e1(eyVar.getParentActivity(), false, false);
                    if (eyVar.getMessagesController().isDialogMuted(j13, 0L)) {
                        e1Var9.j(LocaleController.getString(R.string.Unmute), R.drawable.msg_unmute, null);
                    } else {
                        e1Var9.j(LocaleController.getString(R.string.Mute), R.drawable.msg_mute, null);
                    }
                    e1Var9.setMinimumWidth(160);
                    e1Var9.setOnClickListener(new ci.a2(eyVar, j13, 2));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(e1Var9);
                }
                if (!isCommunity) {
                    org.telegram.ui.ActionBar.e1 e1Var10 = new org.telegram.ui.ActionBar.e1(eyVar.getParentActivity(), i11, true);
                    e1Var10.setIconColor(eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.p7));
                    int i24 = org.telegram.ui.ActionBar.k6.q7;
                    e1Var10.setTextColor(eyVar.getThemedColor(i24));
                    e1Var10.h(0.12f, i24);
                    e1Var10.j(LocaleController.getString(R.string.Delete), R.drawable.msg_delete, null);
                    e1Var10.setMinimumWidth(160);
                    e1Var10.setOnClickListener(new org.telegram.ui.Components.d51(14, eyVar, arrayList));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(e1Var10);
                }
                if (isCommunity) {
                    if (eyVar.n2 != null) {
                        eyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
                    }
                    eyVar.r4();
                    eyVar.parentLayout.setHighlightActionButtons(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", -j13);
                    ey eyVar4 = new ey(bundle2);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        o2VarArr[0] = eyVar4;
                        eyVar.presentFragmentAsPreview(eyVar4);
                        return false;
                    }
                    o2VarArr[0] = eyVar4;
                    eyVar.presentFragmentAsPreviewWithMenu(eyVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                    return false;
                }
                if (!eyVar.getMessagesController().checkCanOpenChat(bundle, eyVar)) {
                    return i11;
                }
                if (eyVar.n2 != null) {
                    eyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i11]);
                }
                eyVar.r4();
                eyVar.parentLayout.setHighlightActionButtons(true);
                sn snVar = new sn(bundle);
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    o2VarArr[0] = snVar;
                    eyVar.presentFragmentAsPreview(snVar);
                    return true;
                }
                o2VarArr[0] = snVar;
                eyVar.presentFragmentAsPreviewWithMenu(snVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                snVar.V9 = true;
                try {
                    snVar.m1.getAvatarImageView().performAccessibilityAction(64, null);
                } catch (Exception unused) {
                }
                return true;
            }
        } else if (q2Var.getCurrentDialogFolderId() == 1) {
            k4(q2Var);
            return false;
        }
        return false;
    }

    public boolean G3() {
        return this.R0 == 10;
    }

    public final void G4(boolean z10) {
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
        arrayList.add(ObjectAnimator.ofFloat(this.m0, (Property<org.telegram.ui.ActionBar.u0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.P3.playTogether(arrayList);
        this.P3.addListener(new ex(this, z10, i10));
        this.P3.start();
    }

    @Override // ne.d
    public final void H(float f7, int i10) {
        org.telegram.ui.ActionBar.u0 u0Var;
        if (i10 != 3 || (u0Var = this.l0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) u0Var.getIconView().getDrawable();
        if (!this.d.f) {
            animatedVectorDrawable.reset();
            return;
        }
        animatedVectorDrawable.start();
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(this.currentAccount).getPremiumPromo();
            String l02 = PremiumPreviewFragment.l0(2);
            if (premiumPromo != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= premiumPromo.video_sections.size()) {
                        i11 = -1;
                        break;
                    } else if (premiumPromo.video_sections.get(i11).equals(l02)) {
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

    public final void H3() {
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
            nx nxVar = this.C0;
            if (nxVar != null) {
                nxVar.b0.Q(this.W1, tLObject);
            }
            this.X1 = null;
        }
    }

    public final void H4() {
        if (this.A0 || !getMessagesController().dialogFiltersLoaded || !getMessagesController().showFiltersTooltip || this.z0 == null || !getMessagesController().getDialogFilters().isEmpty() || this.isPaused || !getUserConfig().filtersLoaded || this.inPreviewMode) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("filterhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("filterhint", true).apply();
        AndroidUtilities.runOnUIThread(new uv(this, 10), 1000L);
    }

    public final void I3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || !kVar.n0) {
            return;
        }
        kVar.g(true);
        this.q3 = false;
        U4(true, true);
    }

    public final void I4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        float f7;
        ot otVar;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.e1 e1Var;
        int i10;
        int i11;
        CharSequence charSequence;
        org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(this, this.k0);
        int i12 = org.telegram.ui.ActionBar.k6.A8;
        H.S(getThemedColor(i12), getThemedColor(i12));
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        float f10 = 64.0f;
        int i13 = 0;
        if (this.Y2 != 0) {
            if (ChatObject.hasAdminRights(this.Z2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new ev(this, 4), false);
                H.k();
            }
            H.i(new ev(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Z2.collapsed_in_dialogs);
            H.i(new ev(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Z2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        if (c4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new ev(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new ev(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.g6 g6Var2 = this.resourceProvider;
        boolean a2 = g6Var2 != null ? g6Var2.a() : org.telegram.ui.ActionBar.k6.I.q();
        H.c(a2 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, LocaleController.getString(a2 ? R.string.SwitchThemeToDay : R.string.SwitchThemeToNight), new ev(this, 11), false);
        H.k();
        H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new ev(this, 12), false);
        H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new ev(this, 13), false);
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.addItemOptions(H);
        }
        if (getMessagesController().config.walletAvailable.get()) {
            H.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletAttachMoney), new ev(this, 14), false);
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
                        hv hvVar = new hv(this, tL_attachMenuBot2, launchActivity2, 0);
                        ot otVar2 = new ot(3, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.g6 g6Var3 = H.d;
                        if (H.e != null) {
                            int i15 = org.telegram.ui.ActionBar.k6.F8;
                            int i16 = org.telegram.ui.ActionBar.k6.E8;
                            f7 = f10;
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(0, H.e, H.d, false, false);
                            e1Var2.setPadding(AndroidUtilities.dp(18.0f), i13, AndroidUtilities.dp(18.0f), i13);
                            CharSequence b10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.r8.b(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                            TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                            if (sideAttachMenuBotIcon != null) {
                                launchActivity = launchActivity2;
                                arrayList2 = arrayList3;
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.k6.c7, 1.0f);
                                if (svgThumb != null) {
                                    Integer num = H.k0;
                                    charSequence = b10;
                                    svgThumb.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i15, g6Var3), PorterDuff.Mode.SRC_IN));
                                } else {
                                    charSequence = b10;
                                }
                                otVar = otVar2;
                                e1Var = e1Var2;
                                i11 = i16;
                                i10 = i15;
                                g6Var = g6Var3;
                                e1Var.k(charSequence, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                org.telegram.ui.Components.w9 w9Var = e1Var.h;
                                if (w9Var != null) {
                                    w9Var.setLayoutParams(w7.z5.e(24, 24, (LocaleController.isRTL ? 5 : 3) | 16));
                                }
                            } else {
                                launchActivity = launchActivity2;
                                arrayList2 = arrayList3;
                                otVar = otVar2;
                                g6Var = g6Var3;
                                CharSequence charSequence2 = b10;
                                e1Var = e1Var2;
                                i10 = i15;
                                i11 = i16;
                                e1Var.j(charSequence2, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.j0;
                            if (num2 == null && H.k0 == null) {
                                e1Var.c(i11, i10);
                            } else {
                                int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
                                Integer num3 = H.k0;
                                e1Var.d(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
                            }
                            Integer num4 = H.k0;
                            e1Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
                            Integer num5 = H.l0;
                            if (num5 != null) {
                                e1Var.setSelectorColor(num5.intValue());
                            } else {
                                e1Var.h(0.12f, i11);
                            }
                            e1Var.setOnClickListener(new org.telegram.ui.Components.ca(19, H, hvVar));
                            e1Var.setOnLongClickListener(new ci.l2(3, H, otVar));
                            int i17 = H.S;
                            if (i17 > 0) {
                                e1Var.setMinimumWidth(AndroidUtilities.dp(i17));
                                H.r(e1Var, w7.z5.n(H.S, -2));
                            } else {
                                H.r(e1Var, w7.z5.n(-1, -2));
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
            H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new ev(this, 6), false);
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = this.o0;
        if (e1Var3 != null) {
            org.telegram.ui.ActionBar.r6.W(e1Var3.b, org.telegram.ui.ActionBar.k6.ai, getResourceProvider());
            this.o0.setOnClickListener(new org.telegram.ui.Components.d51(11, this, H));
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

    public final void J3(String str) {
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y i10 = this.actionBar.i(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.g1.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            org.telegram.ui.ActionBar.r6.t(this.g1, org.telegram.ui.ActionBar.k6.y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.g1;
            int i11 = org.telegram.ui.ActionBar.k6.z8;
            org.telegram.ui.ActionBar.r6.S(imageView2, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i11), getResourceProvider());
            this.g1.setOnClickListener(new iv(this, 6));
            i10.addView(this.g1, w7.z5.q(54, 54, 16));
            arrayList.add(this.g1);
        }
        NumberTextView numberTextView = new NumberTextView(i10.getContext());
        this.h1 = numberTextView;
        numberTextView.setTextSize(18);
        this.h1.setTypeface(AndroidUtilities.bold());
        this.h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
        i10.addView(this.h1, w7.z5.m(1.0f, 0, -1, this.W ? 18 : 72, 0, 0));
        this.h1.setOnTouchListener(new di.d(2));
        this.k1 = i10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = i10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.m1 = i10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.j1 = i10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.u0 h = i10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        i10.addView(new View(getParentActivity()), w7.z5.n(5, -1));
        this.q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new qv(this, 1));
        arrayList.add(this.k1);
        arrayList.add(this.m1);
        arrayList.add(this.l1);
        arrayList.add(this.j1);
        arrayList.add(h);
        R4(false);
    }

    public final void J4() {
        if (this.S3 != null) {
            return;
        }
        for (String str : getMessagesController().pendingSuggestions) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new jv(this, 6));
                showDialog(alertDialog$Builder.a, new fv(this, 1));
                this.S3 = str;
                return;
            }
        }
    }

    public final void K3() {
        nx nxVar = this.C0;
        if ((nxVar != null && nxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        nx nxVar2 = new nx(this, getParentActivity(), this, this.n2 != null ? 2 : !this.l2 ? 1 : 0, this.R0, this.W2, this.Y2, new jx(this, 1));
        this.C0 = nxVar2;
        ((wx) this.fragmentView).addView(nxVar2, this.B0);
        nx nxVar3 = this.C0;
        nxVar3.b0.U = new px(this);
        nxVar3.i0.setOnItemClickListener(new jv(this, 1));
        this.C0.n0.setOnItemClickListener(new jv(this, 2));
        this.C0.u0.setOnItemClickListener(new nv(this, 0));
        this.C0.n0.setOnItemLongClickListener(new jv(this, 3));
        this.C0.V.setOnItemClickListener(new jv(this, 4));
        this.C0.V.setOnItemLongClickListener(new jx(this, 2));
        this.C0.setFilteredSearchViewDelegate(new jv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.q4);
    }

    public final void K4(long j10, View view) {
        e3(j10, view);
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        char c10 = 1;
        int i10 = 0;
        if (!s10) {
            if (this.q3) {
                J3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.i5)) {
                    i2.o1.y(false, this.actionBar);
                }
            } else {
                J3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            this.actionBar.N(null, null);
            int i11 = this.e0[0].s;
            ArrayList<TLRPC.Dialog> P3 = ((i11 == 7 || i11 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) ? P3(this.currentAccount, this.e0[0].s, this.W2, this.S1) : getMessagesController().getDialogs(this.W2);
            int size = P3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = P3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!e4(dialog)) {
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
                        dy[] dyVarArr = this.e0;
                        if (i14 >= dyVarArr.length) {
                            break;
                        }
                        dyVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
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
                dy[] dyVarArr2 = this.e0;
                if (i16 >= dyVarArr2.length) {
                    break;
                }
                dy dyVar = dyVarArr2[i16];
                if (dyVar != null) {
                    dyVar.a.I0(true);
                }
                i16++;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp((this.K ? 81 : 0) + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.v3.addUpdateListener(new kv(this, max, i10));
            this.v3.addListener(new hx(this, max, c10 == true ? 1 : 0));
            this.v3.setInterpolator(org.telegram.ui.Components.bs.f);
            this.v3.setDuration(200L);
            this.v3.start();
            cw cwVar = this.z0;
            if (cwVar != null) {
                cwVar.b(org.telegram.ui.ActionBar.k6.Gh, org.telegram.ui.ActionBar.k6.Fh, org.telegram.ui.ActionBar.k6.Eh, org.telegram.ui.ActionBar.k6.Hh, org.telegram.ui.ActionBar.k6.w8);
            }
            org.telegram.ui.ActionBar.h2 h2Var = this.e1;
            if (h2Var != null) {
                h2Var.c(1.0f, true);
            }
            z10 = false;
        } else if (arrayList.isEmpty()) {
            Z3(true);
            return;
        }
        R4(false);
        this.h1.a(arrayList.size(), z10);
    }

    public final void L3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new ix(this, parentActivity);
                FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.g4 + this.i4 + d.bottomMargin;
                wx wxVar = (wx) this.fragmentView;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.x0 + 1;
                this.x0 = i11;
                wxVar.addView(undoView, i11, d);
            }
        }
    }

    public final void L4(long j10, View view) {
        int i10 = -this.M3;
        this.M3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        (getMessagesController().premiumFeaturesBlocked() ? org.telegram.ui.Components.xc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.xc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new ev(this, 23))).j();
    }

    public final void M3(final long j10, final long j11, boolean z10, final ye1 ye1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (n3(j10)) {
            int i10 = this.R0;
            if (i10 == 11 || i10 == 12 || i10 == 13) {
                if (DialogObject.isUserDialog(j10)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j10));
                    if (!user2.mutual_contact) {
                        UndoView W3 = W3();
                        if (W3 != null) {
                            W3.j(45, j10, null);
                            return;
                        }
                        return;
                    }
                    user = user2;
                    chat = null;
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                    if (!ChatObject.hasAdminRights(chat2) || !ChatObject.canChangeChatInfo(chat2)) {
                        UndoView W32 = W3();
                        if (W32 != null) {
                            W32.j(46, j10, null);
                            return;
                        }
                        return;
                    }
                    chat = chat2;
                    user = null;
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new ai.l4(this, c2Var, user, chat, j10, tL_messages_checkHistoryImportPeer));
                try {
                    c2Var.r(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            int i11 = 1;
            if (!z10 || ((this.f2 == null || this.g2 == null) && this.h2 == null)) {
                if (i10 != 15) {
                    if (this.C2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.C2.w(this, arrayList, null, false, this.J2, this.K2, this.L2, ye1Var) && this.i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                }
                Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, ye1Var, 14), 26);
                if (j10 < 0) {
                    O4(getMessagesController().getChat(Long.valueOf(-j10)), i0Var, null);
                    return;
                }
                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(this.H));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user3), UserObject.getFirstName(user4));
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
                c2Var2.R = formatString;
                c2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user3), UserObject.getFirstName(user4))));
                alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new xt(i0Var, i11));
                alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.ud0(29));
                showDialog(c2Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (DialogObject.isEncryptedDialog(j10)) {
                TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.v0.l(getMessagesController(), j10).user_id));
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
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.a;
            c2Var3.R = str;
            c2Var3.T = AndroidUtilities.replaceTags(str2);
            alertDialog$Builder2.k(string2, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.bw
                @Override // org.telegram.ui.ActionBar.z1
                public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i12) {
                    ey.this.M3(j10, j11, false, ye1Var);
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            if (showDialog(c2Var3) == null) {
                c2Var3.show();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M4(boolean z10, boolean z11, boolean z12, boolean z13) {
        nx nxVar;
        nx nxVar2;
        vw vwVar;
        nx nxVar3;
        boolean z14;
        nx nxVar4;
        boolean z15;
        org.telegram.ui.Components.k91 k91Var;
        TLRPC.Chat chat;
        yw ywVar;
        boolean z16 = z12;
        this.b.a(z10, z16);
        int i10 = 0;
        if (z10) {
            K3();
        } else {
            c5(false);
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
        i3();
        if (z10) {
            if (!this.t3 && !z13) {
                int totalDialogsCount = getMessagesController().getTotalDialogsCount();
                if (this.l2 || (totalDialogsCount <= 10 && !this.K)) {
                    z14 = true;
                    nxVar4 = this.C0;
                    if (nxVar4 != null) {
                        nxVar4.O0 = z14;
                    }
                    z15 = z14 || this.K;
                    this.s3 = z15;
                    if (z15) {
                        this.t3 = true;
                    }
                    k91Var = this.a0;
                    if (k91Var != null && nxVar4 != null && !z14 && this.Y2 == 0) {
                        org.telegram.ui.Components.k91 n10 = nxVar4.n(-2, false);
                        this.a0 = n10;
                        this.Z.addView(n10, 0, w7.z5.e(-1, -1, 119));
                    } else if (this.Z != null && z14 && this.Y2 == 0) {
                        AndroidUtilities.removeFromParent(k91Var);
                        this.a0 = null;
                    }
                    if (this.C0 != null) {
                        E3(false);
                        this.C0.setKeyboardHeight(((wx) this.fragmentView).getKeyboardHeight());
                        nx nxVar5 = this.C0;
                        nxVar5.A0.clear();
                        nxVar5.J();
                    }
                    chat = this.Z2;
                    if (chat == null) {
                        hg.o0 o0Var = new hg.o0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
                        o0Var.f = this.Z2;
                        f3(o0Var);
                    } else if (this.W2 != 0 && ((ywVar = this.G3) == null || !ywVar.c())) {
                        f3(new hg.o0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
                    }
                }
            }
            z14 = false;
            nxVar4 = this.C0;
            if (nxVar4 != null) {
            }
            if (z14) {
            }
            this.s3 = z15;
            if (z15) {
            }
            k91Var = this.a0;
            if (k91Var != null) {
            }
            if (this.Z != null) {
                AndroidUtilities.removeFromParent(k91Var);
                this.a0 = null;
            }
            if (this.C0 != null) {
            }
            chat = this.Z2;
            if (chat == null) {
            }
        }
        if (z16 && (nxVar3 = this.C0) != null && nxVar3.b0.M()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z10 && (vwVar = this.E0) != null && this.G0) {
            vwVar.setVisibility(0);
        }
        Object[] objArr = SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(32768);
        if (z16) {
            if (z10) {
                nx nxVar6 = this.C0;
                if (nxVar6 != null) {
                    nxVar6.setVisibility(0);
                    nx nxVar7 = this.C0;
                    nxVar7.setPosition(0);
                    if (nxVar7.b0.h() > 0) {
                        nxVar7.c0.h1(0, 0);
                    }
                    s4.b0 b0Var = nxVar7.h0;
                    if (b0Var != null) {
                        b0Var.h1(0, 0);
                    }
                    s4.b0 b0Var2 = nxVar7.m0;
                    if (b0Var2 != null) {
                        b0Var2.h1(0, 0);
                    }
                    s4.b0 b0Var3 = nxVar7.t0;
                    if (b0Var3 != null) {
                        b0Var3.h1(0, 0);
                    }
                    nxVar7.h.clear();
                }
                V4(true, null, null, false, false);
                org.telegram.ui.Components.k91 k91Var2 = this.a0;
                if (k91Var2 != null) {
                    k91Var2.b(false, false);
                }
            } else {
                this.e0[0].a.setVisibility(0);
                this.e0[0].setVisibility(0);
            }
            y4(true, true);
            this.e0[0].a.setVerticalScrollBarEnabled(false);
            nx nxVar8 = this.C0;
            if (nxVar8 != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, nxVar8, getResourceProvider());
            }
            this.w1 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            dy dyVar = this.e0[0];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(dyVar, (Property<dy, Float>) property, z10 ? 0.0f : 1.0f));
            if (objArr == true) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.e0[0], (Property<dy, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.e0[0], (Property<dy, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            yw ywVar2 = this.G3;
            if (ywVar2 != null) {
                ywVar2.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.G3, (Property<yw, Float>) property, z10 ? 0.0f : 1.0f));
            }
            nx nxVar9 = this.C0;
            if (nxVar9 != null) {
                arrayList.add(ObjectAnimator.ofFloat(nxVar9, (Property<nx, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.K) {
                    float dp = AndroidUtilities.dp(81.0f) + this.N + AndroidUtilities.dp(48.0f);
                    nx nxVar10 = this.C0;
                    float f7 = z10 ? dp : 0.0f;
                    if (z10) {
                        dp = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(nxVar10, this.I3, f7, dp));
                }
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(this.C0, (Property<nx, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList.add(ObjectAnimator.ofFloat(this.C0, (Property<nx, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.g0 != null) {
                Y4(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new gv(this, 1));
            arrayList.add(ofFloat);
            this.w1.playTogether(arrayList);
            this.w1.setDuration(z10 ? 200L : 180L);
            this.w1.setInterpolator(org.telegram.ui.Components.bs.g);
            if (!z10) {
                this.w1.setStartDelay(20L);
            }
            this.w1.addListener(new ex(this, z10, i10));
            this.p3.lock();
            this.w1.start();
        } else {
            y4(false, true);
            if (z10) {
                this.e0[0].a.d1();
            } else {
                zx zxVar = this.e0[0].a;
                if (zxVar.g1) {
                    zxVar.g1 = false;
                    zxVar.K0(false);
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
            nx nxVar11 = this.C0;
            if (nxVar11 != null) {
                nxVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    this.C0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.C0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.C0.setVisibility(z10 ? 0 : 8);
            }
            tx txVar = this.X;
            if (txVar != null) {
                txVar.setTranslationY(U3() + (z10 ? -AndroidUtilities.dp(36.0f) : 0));
            }
            if (this.E0 != null) {
                if (!this.G0 || isInPreviewMode() || z10) {
                    this.E0.setVisibility(8);
                } else {
                    this.E0.setVisibility(0);
                }
            }
            B4(z10 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i12 = this.x;
        if (i12 >= 0 && (nxVar2 = this.C0) != null) {
            nxVar2.setPosition(nxVar2.L(i12));
        }
        if (!z10) {
            this.x = -1;
        }
        if (z10 && z11 && (nxVar = this.C0) != null) {
            nxVar.setPosition((nxVar.q0 ? 1 : 0) + 5);
            c5(true);
        }
        D3();
        S4();
    }

    public final void N3(long j10, boolean z10) {
        if (this.e0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            dy[] dyVarArr = this.e0;
            if (i10 >= dyVarArr.length) {
                return;
            }
            int childCount = dyVarArr[i10].a.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = this.e0[i10].a.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q2) {
                        org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) childAt;
                        if (q2Var.getDialogId() == j10) {
                            q2Var.U(z10, true);
                            break;
                        }
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    public final void N4() {
        int i10;
        int i11;
        if (this.M0 != null || SharedConfig.appLocked || (this.K && !this.E0.g())) {
            return;
        }
        s51[] s51VarArr = new s51[1];
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
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
        zw zwVar = new zw(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), s51VarArr);
        if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
            zwVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
        }
        Long l4 = this.C3;
        if (l4 != null) {
            zwVar.setSelected(l4);
        } else {
            Drawable drawable2 = this.E3.f[0];
            zwVar.setSelected(drawable2 instanceof org.telegram.ui.Components.r5 ? Long.valueOf(((org.telegram.ui.Components.r5) drawable2).i()) : null);
        }
        zwVar.setSaveState(1);
        zwVar.y(this.E3, titleTextView);
        ax axVar = new ax(this, zwVar);
        this.M0 = axVar;
        s51VarArr[0] = axVar;
        axVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
        s51VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0066, code lost:
    
        if (r13.G.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.o2, org.telegram.ui.ey] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O4(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String formatString;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i10 = 2;
        int i11 = 1;
        String formatString2 = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, chat.title, UserObject.getFirstName(user));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = formatString2;
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
            int i13 = org.telegram.ui.Cells.r6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                org.telegram.ui.Cells.b1.p(1, isChannelAndNotMegaGroup ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), arrayList);
            }
            if (tL_chatAdminRights.post_messages && isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.b1.p(1, LocaleController.getString(R.string.EditAdminPostMessages), arrayList);
            }
            if (tL_chatAdminRights.edit_messages && isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.b1.p(1, LocaleController.getString(R.string.EditAdminEditMessages), arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.b1.p(1, LocaleController.getString(isChannelAndNotMegaGroup ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), arrayList);
            }
            if (tL_chatAdminRights.ban_users && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.b1.p(1, LocaleController.getString(R.string.EditAdminBanUsers), arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.b1.p(1, LocaleController.getString(R.string.EditAdminAddUsers), arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.b1.p(1, LocaleController.getString(R.string.EditAdminPinMessages), arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.b1.p(1, LocaleController.getString(R.string.EditAdminAddAdmins), arrayList);
            }
            if (tL_chatAdminRights.anonymous && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.b1.p(1, LocaleController.getString(R.string.EditAdminSendAnonymously), arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.b1.p(1, LocaleController.getString(R.string.StartVoipChatPermission), arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !isChannelAndNotMegaGroup) {
                org.telegram.ui.Cells.b1.p(1, LocaleController.getString(R.string.ManageTopicsPermission), arrayList);
            }
            if (arrayList.size() == 1) {
                r92 = ((org.telegram.ui.Cells.s6) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r92 = new SpannableStringBuilder();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    if (i14 > 0) {
                        r92.append(", ");
                    }
                    r92.append(((org.telegram.ui.Cells.s6) arrayList.get(i14)).b.toString().toLowerCase());
                }
            }
            formatString = LocaleController.formatString(i12, new Object[]{firstName, str, r92});
        }
        charSequence = TextUtils.concat("\n\n", AndroidUtilities.replaceTags(formatString));
        c2Var.T = TextUtils.concat(replaceTags, charSequence);
        alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new gf(i11, runnable));
        alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new gf(i10, runnable2));
        showDialog(c2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0232 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList P3(int i10, int i11, int i12, boolean z10) {
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
                arrayList2.add(new yx(0));
                arrayList2.addAll(messagesController.dialogsMyChannels);
            }
            if (messagesController.dialogsMyGroups.size() > 0 && this.v2) {
                arrayList2.add(new yx(1));
                arrayList2.addAll(messagesController.dialogsMyGroups);
            }
            if (messagesController.dialogsCanAddUsers.size() > 0) {
                int size = messagesController.dialogsCanAddUsers.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.Dialog dialog = messagesController.dialogsCanAddUsers.get(i13);
                    if ((this.y2 && ChatObject.isChannelAndNotMegaGroup(-dialog.id, i10)) || (this.v2 && (ChatObject.isMegagroup(i10, -dialog.id) || !ChatObject.isChannel(-dialog.id, i10)))) {
                        if (r2) {
                            arrayList2.add(new yx(2));
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
                    if (j4(getMessagesController().getUser(Long.valueOf(dialog3.id)))) {
                        arrayList3.add(dialog3);
                    }
                }
                for (TLRPC.User user2 : users.values()) {
                    if (user2 != null && !messagesController.dialogs_dict.d(user2.id) && j4(user2)) {
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
                    if (i4(getMessagesController().getChat(Long.valueOf(-dialog5.id)), user)) {
                        arrayList3.add(dialog5);
                    }
                }
                for (TLRPC.Chat chat : chats.values()) {
                    if (chat != null && !messagesController.dialogs_dict.d(-chat.id) && i4(chat, user)) {
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

    public final void P4(boolean z10) {
        dy[] dyVarArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            dyVarArr = this.e0;
            if (i11 >= dyVarArr.length) {
                break;
            }
            dyVarArr[i11].a.B0();
            i11++;
        }
        char c10 = (!z10 || dyVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i12 = dyVarArr[c10].h;
        if (i12 < 0 || i12 >= getMessagesController().getDialogFilters().size()) {
            return;
        }
        MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.e0[c10].h);
        if (dialogFilter.isDefault()) {
            dy dyVar = this.e0[c10];
            dyVar.s = this.R0;
            zx zxVar = dyVar.a;
            int i13 = zx.w3;
            zxVar.G1();
        } else {
            dy[] dyVarArr2 = this.e0;
            if (dyVarArr2[c10 ^ 1].s == 7) {
                dyVarArr2[c10].s = 8;
            } else {
                dyVarArr2[c10].s = 7;
            }
            dyVarArr2[c10].a.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.e0[c10].s == 8 ? 1 : 0);
        }
        dy[] dyVarArr3 = this.e0;
        if (dyVarArr3.length > 1) {
            dyVarArr3[1].E = dialogFilter.locked;
        }
        dy dyVar2 = dyVarArr3[c10];
        lw lwVar = dyVar2.d;
        lwVar.h = dyVar2.s;
        lwVar.l();
        dy dyVar3 = this.e0[c10];
        hw hwVar = dyVar3.c;
        if (dyVar3.s == 0 && X3() && this.e0[c10].v == 2) {
            i10 = 1;
        }
        hwVar.h1(i10, (int) this.N);
        p3(this.e0[c10]);
    }

    public final float Q3(boolean z10) {
        return (z10 ? 1.0f - this.b.e : 1.0f) * (1.0f - T3()) * this.r.e;
    }

    public final void Q4() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        m31 m31Var = this.Z;
        float measuredHeight = (m31Var == null || m31Var.getVisibility() == 8) ? 0.0f : this.Z.getMeasuredHeight();
        float dp = this.K ? AndroidUtilities.dp(81.0f) : 0.0f;
        if (this.K) {
            float f16 = this.N;
            float f17 = this.x1;
            f7 = (measuredHeight * f17) + com.google.android.gms.internal.play_billing.k3.y(1.0f, f17, dp, f16);
            f10 = this.x3;
        } else {
            f7 = (measuredHeight * this.x1) + this.N;
            f10 = this.x3;
        }
        float f18 = f7 + f10 + this.T;
        tx txVar = this.X;
        float dp2 = AndroidUtilities.dp(4.0f) * ((txVar == null || txVar.getVisibility() != 0) ? 0.0f : this.X.getAlpha());
        cw cwVar = this.z0;
        if (cwVar != null) {
            cwVar.setTranslationY(f18 - dp2);
            f12 = this.z0.getAlpha();
            f13 = AndroidUtilities.dp(43.0f) * f12;
            f11 = f18 + f13;
        } else {
            f11 = f18;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        org.telegram.ui.Components.us usVar = this.J1;
        if (usVar != null) {
            usVar.setTranslationY(AndroidUtilities.lerp(f11 - dp2, (-AndroidUtilities.dp(3.0f)) - (this.a0 == null ? AndroidUtilities.dp(44.0f) : 0), this.b.e));
            f14 = this.J1.getMetadata().c.a;
            f15 = this.J1.c(0.0f);
        } else {
            f14 = 0.0f;
            f15 = 0.0f;
        }
        org.telegram.ui.Components.ts tsVar = this.K1;
        if (tsVar != null) {
            tsVar.setTranslationY(f18 - dp2);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f14, f12));
            org.telegram.ui.Components.ts tsVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f15 + f13) - lerp);
            Matrix matrix = tsVar2.b;
            if (tsVar2.e != lerp || tsVar2.f != min) {
                tsVar2.e = lerp;
                tsVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = tsVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                tsVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f12, f14));
        }
    }

    public final int R3() {
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
    public final void R4(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.ActionBar.e1 e1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        cw cwVar;
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
                boolean e42 = e4(dialog);
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
                    } else if (org.telegram.messenger.v0.v("dialog_bar_report", j11, notificationsSettings, true)) {
                        this.S2++;
                    }
                    if (DialogObject.isChannel(dialog)) {
                        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
                        if (isChatDialog) {
                            getMessagesController().getChat(Long.valueOf(-dialog.id));
                        }
                        if (DialogObject.isEncryptedDialog(dialog.id)) {
                            TLRPC.EncryptedChat l4 = org.telegram.messenger.v0.l(getMessagesController(), dialog.id);
                            user = l4 != null ? getMessagesController().getUser(Long.valueOf(l4.user_id)) : new TLRPC.TL_userEmpty();
                        } else {
                            user = (isChatDialog || !DialogObject.isUserDialog(dialog.id)) ? null : getMessagesController().getUser(Long.valueOf(dialog.id));
                        }
                        if (user != null && user.bot) {
                            MessagesController.isSupportUser(user);
                        }
                        if (e42) {
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
                            if (e42) {
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
        org.telegram.ui.ActionBar.u0 u0Var3 = this.j1;
        if (u0Var3 != null) {
            if (i11 != size || i12 > 0) {
                u0Var3.setVisibility(8);
            } else {
                u0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.e1 e1Var2 = this.r1;
        if (e1Var2 != null) {
            int i21 = this.R2;
            if ((i21 == 0 || i21 == size) && ((i13 == 0 || i13 == size) && i12 <= 0)) {
                e1Var2.setVisibility(0);
                if (this.R2 != 0) {
                    this.r1.setText(LocaleController.getString(R.string.ClearHistoryCache));
                } else {
                    this.r1.setText(LocaleController.getString(R.string.ClearHistory));
                }
            } else {
                e1Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = this.q1;
        if (e1Var3 != null && this.m1 != null) {
            if (this.T2 != 0 && i12 == 0 && this.Y2 == 0) {
                String string = LocaleController.getString(R.string.Unarchive);
                this.q1.j(string, R.drawable.msg_unarchive, null);
                this.m1.setIcon(R.drawable.msg_unarchive);
                this.m1.setContentDescription(string);
                cw cwVar2 = this.z0;
                if (cwVar2 == null || cwVar2.getVisibility() != 0) {
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
                cw cwVar3 = this.z0;
                if (cwVar3 == null || cwVar3.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else {
                e1Var3.setVisibility(8);
                this.m1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var4 = this.k1;
        if (u0Var4 != null && this.n1 != null) {
            if (this.O2 + i20 == size && this.Y2 == 0) {
                cw cwVar4 = this.z0;
                if (cwVar4 == null || cwVar4.getVisibility() != 0) {
                    this.k1.setVisibility(0);
                    this.n1.setVisibility(8);
                } else {
                    this.n1.setVisibility(0);
                    this.k1.setVisibility(8);
                }
            } else {
                u0Var4.setVisibility(8);
                this.n1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.e1 e1Var4 = this.t1;
        if (e1Var4 != null) {
            if (i16 != 0) {
                e1Var4.setVisibility(8);
            } else {
                e1Var4.setVisibility(0);
            }
        }
        if (this.p1 != null) {
            cw cwVar5 = this.z0;
            boolean z13 = cwVar5 == null || cwVar5.getVisibility() != 0 || ((d = (cwVar = this.z0).d()) != null && d.a == cwVar.L);
            if (!z13) {
                try {
                    z13 = size >= P3(this.currentAccount, this.e0[0].d.h, this.W2, this.S1).size();
                } catch (Exception unused) {
                }
            }
            if (!z13) {
                z11 = false;
                this.p1.setVisibility(0);
                if (this.o1 != null) {
                    if (this.W2 != 1) {
                        if (this.z0 != null && Q3(z11) > 0.5f) {
                            cw cwVar6 = this.z0;
                            org.telegram.ui.Components.p00 d10 = cwVar6.d();
                            if (d10 != null && d10.a == cwVar6.L) {
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
                u0Var = this.l1;
                if (u0Var != null) {
                    if (this.Q2 != 0) {
                        u0Var.setIcon(R.drawable.msg_unmute);
                        this.l1.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    } else {
                        u0Var.setIcon(R.drawable.msg_mute);
                        this.l1.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                    }
                }
                e1Var = this.s1;
                if (e1Var != null) {
                    if (this.N2 != 0) {
                        e1Var.j(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                        this.s1.setVisibility(0);
                    } else if (this.U2 == 0 && i12 == 0) {
                        e1Var.j(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
                        this.s1.setVisibility(0);
                    } else {
                        e1Var.setVisibility(8);
                    }
                }
                u0Var2 = this.k1;
                if (u0Var2 != null || this.n1 == null) {
                }
                if (this.O2 != 0) {
                    u0Var2.setIcon(R.drawable.msg_pin);
                    this.k1.setContentDescription(LocaleController.getString(R.string.PinToTop));
                    this.n1.setText(LocaleController.getString(R.string.DialogPin));
                    return;
                } else {
                    u0Var2.setIcon(R.drawable.msg_unpin);
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
        u0Var = this.l1;
        if (u0Var != null) {
        }
        e1Var = this.s1;
        if (e1Var != null) {
        }
        u0Var2 = this.k1;
        if (u0Var2 != null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.qg0
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        yw ywVar;
        ai.jc jcVar;
        cw cwVar;
        if (!this.q3 && (((ywVar = this.G3) == null || !ywVar.c()) && (((jcVar = this.K0) == null || jcVar.getVisibility() != 0) && ((cwVar = this.z0) == null || !cwVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                cw cwVar2 = this.z0;
                boolean z11 = cwVar2 == null || cwVar2.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getFirstTabId();
                cw cwVar3 = this.z0;
                boolean z12 = cwVar3 == null || cwVar3.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getLastTabId();
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

    public final int S3() {
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
    public final void S4() {
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
        yw ywVar;
        boolean z15;
        yw ywVar2;
        if (this.J1 == null || this.M1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.y2 y2Var = this.M1;
        final int i10 = 0;
        if (y2Var != null) {
            try {
                ((org.telegram.ui.Components.yj0) ((org.telegram.ui.Components.h9) y2Var.h.getImageReceiver().getStaticThumb()).K).R(null);
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.y2 y2Var2 = this.M1;
            y2Var2.setCompact(false);
            y2Var2.a(UserConfig.selectedAccount, null);
            org.telegram.ui.Components.w9 w9Var = y2Var2.h;
            w9Var.setVisibility(8);
            w9Var.b();
        }
        long j13 = 0;
        final int i11 = 1;
        if (isInPreviewMode()) {
            str = null;
            z12 = false;
        } else {
            if (getMessagesController().isFrozen()) {
                this.M1.setOnClickListener(new iv(this, 12));
                this.M1.c(LocaleController.getString(R.string.AccountFrozenAlertTitle), LocaleController.getString(R.string.AccountFrozenAlertSubtitle), false, true);
            } else {
                int i12 = 5;
                if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().pendingSuggestions.contains("SETUP_PASSKEY")) {
                    this.M1.setOnClickListener(new iv(this, 19));
                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.PasskeyPopupTitle), this.M1.c, new uv(this, i12)), LocaleController.getString(R.string.PasskeyPopupText));
                    this.M1.setOnCloseListener(new iv(this, 24));
                } else if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().pendingSuggestions.contains("PREMIUM_GRACE")) {
                    this.M1.setOnClickListener(new iv(this, 25));
                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.GraceTitle), this.M1.c, new uv(this, i12)), LocaleController.getString(R.string.GraceMessage));
                    this.M1.setOnCloseListener(new iv(this, 26));
                } else if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().customPendingSuggestion != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().customPendingSuggestion;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true);
                    Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.M1.c.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.title.entities, this.M1.c.getPaint().getFontMetricsInt());
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true);
                    this.M1.b(replaceAnimatedEmoji, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.M1.d.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.description.entities, this.M1.d.getPaint().getFontMetricsInt()));
                    this.M1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zv
                        public final /* synthetic */ ey b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    pf.d.r(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    ey.U(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.M1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zv
                        public final /* synthetic */ ey b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    pf.d.r(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    ey.U(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.W2 == 0 && this.Y2 == 0 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        ai.ha y3 = ai.ha.y(this.currentAccount, false);
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
                                ai.ha y10 = ai.ha.y(this.currentAccount, false);
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
                                this.M1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.aw
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ey eyVar = ey.this;
                                        new ai.dd(eyVar.getParentActivity(), eyVar.getResourceProvider(), j11, 2, sb4, new ev(eyVar, 17), j12).show();
                                    }
                                });
                                org.telegram.ui.Cells.y2 y2Var3 = this.M1;
                                long j17 = j11 - y10.f.amount;
                                if (j17 > j10) {
                                    j11 = j17;
                                }
                                Object[] objArr = new Object[1];
                                objArr[z16 ? 1 : 0] = sb4;
                                y2Var3.b(ai.nd.Y0(z16, LocaleController.formatPluralStringComma("StarsSubscriptionExpiredHintTitle2", (int) j11, objArr), 0.72f, null), LocaleController.getString(R.string.StarsSubscriptionExpiredHintText));
                                this.M1.setOnCloseListener(new iv(this, 13));
                                z12 = true;
                                str = null;
                            }
                            int i16 = 15;
                            if (this.W2 == 0 || this.Y2 != j10 || getMessagesController().premiumPurchaseBlocked() || !BirthdayController.getInstance(this.currentAccount).contains() || getMessagesController().dismissedSuggestions.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                int i17 = 16;
                                if (this.W2 != 0 && this.Y2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("BIRTHDAY_SETUP") && getMessagesController().getUserFull(getUserConfig().getClientUserId()) != null && getMessagesController().getUserFull(getUserConfig().getClientUserId()).birthday == null) {
                                    ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
                                    this.M1.setOnClickListener(new iv(this, i16));
                                    this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.BirthdaySetupTitle), this.M1.c, new uv(this, i12)), LocaleController.formatString(R.string.BirthdaySetupMessage, new Object[0]));
                                    this.M1.setOnCloseListener(new iv(this, i17));
                                } else {
                                    int i18 = 18;
                                    if ((MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.W2 == 0 && this.Y2 == j10) ? MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS") : false) {
                                        if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.W2 == 0 && this.Y2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_RESTORE") && !getUserConfig().isPremium() && MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null) {
                                            this.M1.setOnClickListener(new iv(this, i18));
                                            this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.k6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                        } else {
                                            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.W2 != 0 || this.Y2 != j10 || ((!(MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE") && getUserConfig().isPremium()) && (!MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_ANNUAL") || getUserConfig().isPremium())) || (!UserConfig.getInstance(this.currentAccount).isPremium() ? MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null : !(BuildVars.useInvoiceBilling() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(true) == null)))) {
                                                z10 = false;
                                            } else {
                                                this.B3 = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE");
                                                z10 = true;
                                            }
                                            if (z10) {
                                                this.M1.setOnClickListener(new iv(this, 20));
                                                this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(this.B3 ? R.string.SaveOnAnnualPremiumTitle : R.string.UpgradePremiumTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.k6.I6, 2, null), LocaleController.getString(this.B3 ? R.string.UpgradePremiumMessage : R.string.SaveOnAnnualPremiumMessage));
                                            } else {
                                                if (this.O1 != null && this.P1 != null) {
                                                    if (r0.longValue() / this.P1.longValue() < 0.3f) {
                                                        MessagesController.getGlobalMainSettings().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                                    } else if (System.currentTimeMillis() > MessagesController.getGlobalMainSettings().getLong("cache_hint_showafter", j10)) {
                                                        z11 = true;
                                                        int i19 = 21;
                                                        if (!z11) {
                                                            this.M1.setOnClickListener(new iv(this, i19));
                                                            this.M1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.O1.longValue())), org.telegram.ui.ActionBar.k6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                        } else if (this.W2 == 0 && this.Y2 == 0 && getUserConfig().getCurrentUser() != null && ((getUserConfig().getCurrentUser().photo == null || (getUserConfig().getCurrentUser().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("USERPIC_SETUP"))) {
                                                            this.M1.setOnClickListener(new iv(this, 22));
                                                            this.M1.h.setVisibility(0);
                                                            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
                                                            h9Var.setBounds(0, 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
                                                            long clientUserId = getUserConfig().getClientUserId();
                                                            h9Var.A = true;
                                                            h9Var.b = true;
                                                            h9Var.c = false;
                                                            int i20 = org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.h9.e(clientUserId)];
                                                            org.telegram.ui.ActionBar.g6 g6Var = h9Var.z;
                                                            h9Var.d = org.telegram.ui.ActionBar.k6.w0(i20, g6Var);
                                                            h9Var.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[org.telegram.ui.Components.h9.e(clientUserId)], g6Var);
                                                            h9Var.n = 0;
                                                            h9Var.m = false;
                                                            org.telegram.ui.Components.h9.a("", "", "", h9Var.q);
                                                            h9Var.K = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                            this.M1.h.setImageDrawable(h9Var);
                                                            this.M1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.HintAddYourPhoto), this.M1.c, new uv(this, i12)), LocaleController.getString(R.string.HintAddYourPhotoText));
                                                            this.M1.setOnCloseListener(new iv(this, 23));
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
                                                                    org.telegram.ui.Cells.y2 y2Var4 = this.M1;
                                                                    CharSequence charSequence = charSequenceArr[0];
                                                                    if (charSequence instanceof String) {
                                                                        str = null;
                                                                        charSequence = AndroidUtilities.replaceSingleTag(((String) charSequence).toString(), org.telegram.ui.ActionBar.k6.I6, 2, null);
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    CharSequence charSequence2 = charSequenceArr[1];
                                                                    if (charSequence2 instanceof String) {
                                                                        charSequence2 = AndroidUtilities.replaceTags(((String) charSequence2).toString());
                                                                    }
                                                                    y2Var4.b(charSequence, charSequence2);
                                                                    if (zArr[0] && next != null) {
                                                                        this.M1.setOnCloseListener(new org.telegram.ui.Components.d51(i17, this, next));
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
                                        this.M1.setOnClickListener(new ah.f(i18));
                                        this.M1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.k6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                        this.M1.setOnCloseListener(new iv(this, 17));
                                    }
                                }
                            } else {
                                BirthdayController.BirthdayState state = BirthdayController.getInstance(this.currentAccount).getState();
                                ArrayList<TLRPC.User> arrayList3 = state.today;
                                this.M1.setOnClickListener(new org.telegram.ui.Components.d51(i16, this, state));
                                this.M1.a(this.currentAccount, arrayList3);
                                this.M1.b(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceSingleTag(arrayList3.size() == 1 ? LocaleController.formatString(R.string.BirthdayTodaySingleTitle, UserObject.getForcedFirstName(arrayList3.get(0))) : LocaleController.formatPluralString("BirthdayTodayMultipleTitle", arrayList3.size(), new Object[0]), org.telegram.ui.ActionBar.k6.I6, 2, null), this.M1.c, new uv(this, i12)), LocaleController.formatString(arrayList3.size() == 1 ? R.string.BirthdayTodaySingleMessage2 : R.string.BirthdayTodayMultipleMessage2, new Object[0]));
                                this.M1.setOnCloseListener(new iv(this, 14));
                                ai.ha.y(this.currentAccount, false).V();
                            }
                            z12 = true;
                            str = null;
                        } else if (!y3.A) {
                            y3.A = true;
                            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                            tL_getStarsSubscriptions.missing_balance = true;
                            tL_getStarsSubscriptions.offset = "";
                            ConnectionsManager.getInstance(y3.a).sendRequest(tL_getStarsSubscriptions, new ai.u8(y3, i10));
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
        yw ywVar3 = this.G3;
        ne.b bVar = this.b;
        if ((ywVar3 != null && ywVar3.c()) || bVar.f) {
            z12 = false;
        }
        this.J1.i(this.M1, z12, true);
        o3(true);
        if (this.fragmentView == null || this.J1 == null) {
            z14 = false;
        } else {
            boolean z17 = !isInPreviewMode() && this.W2 == 0 && this.Y2 == 0 && this.R0 == 0 && !getMessagesController().getUnconfirmedAuthController().auths.isEmpty() && ((ywVar2 = this.G3) == null || !ywVar2.c()) && !bVar.f;
            if (z17) {
                if (this.N1 == null) {
                    org.telegram.ui.Cells.ta taVar = new org.telegram.ui.Cells.ta(getParentActivity());
                    this.N1 = taVar;
                    this.J1.addView(taVar);
                }
                org.telegram.ui.Cells.ta taVar2 = this.N1;
                int i21 = this.currentAccount;
                TextView textView = taVar2.b;
                TextView textView2 = taVar2.c;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList4 = MessagesController.getInstance(i21).getUnconfirmedAuthController().auths;
                org.telegram.ui.Cells.sa saVar = taVar2.d;
                saVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
                saVar.a(false, false);
                org.telegram.ui.Cells.sa saVar2 = taVar2.e;
                saVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
                saVar2.a(false, false);
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
                saVar.setOnClickListener(new org.telegram.ui.Cells.ra(this, z15, i21, arrayList4));
                saVar2.setOnClickListener(new ai.ia(taVar2, i21, arrayList4, i11));
            } else {
                z14 = false;
            }
            org.telegram.ui.Cells.ta taVar3 = this.N1;
            if (taVar3 != null) {
                this.J1.i(taVar3, z17, true);
            }
        }
        if (this.fragmentView == null || this.J1 == null) {
            return;
        }
        boolean z18 = (!isInPreviewMode() && this.W2 == 0 && this.Y2 == 0 && this.R0 == 0 && getGiftAuctionsController().hasActiveAuctions() && ((ywVar = this.G3) == null || !ywVar.c()) && !bVar.f) ? true : z14;
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

    public final float T3() {
        yw ywVar = this.G3;
        if (ywVar == null || !ywVar.c()) {
            return 0.0f;
        }
        return this.G3.e;
    }

    public final void T4() {
        ai.u1 u1Var;
        zx zxVar;
        try {
            ow owVar = this.B1;
            if (owVar != null && owVar.getEditField() != null) {
                this.B1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.Wd));
            }
            NumberTextView numberTextView = this.h1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
            }
            cw cwVar = this.z0;
            int i10 = 0;
            if (cwVar != null && (cwVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                ((GradientDrawable) this.z0.getSelectorDrawable()).setColor(getThemedColor(kVar != null && kVar.s() ? org.telegram.ui.ActionBar.k6.Gh : org.telegram.ui.ActionBar.k6.K8));
                this.z0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.W2 != 0 || this.Y2 != 0) {
                    kVar2.F(getThemedColor(org.telegram.ui.ActionBar.k6.Q8), false);
                    this.actionBar.F(getThemedColor(org.telegram.ui.ActionBar.k6.R8), true);
                }
                if (this.actionBar.s()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                }
                Z4();
            }
            if (this.e0 != null) {
                while (true) {
                    dy[] dyVarArr = this.e0;
                    if (i10 >= dyVarArr.length) {
                        break;
                    }
                    dy dyVar = dyVarArr[i10];
                    if (dyVar != null && (zxVar = dyVar.a) != null) {
                        zxVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    }
                    i10++;
                }
            }
            nx nxVar = this.C0;
            if (nxVar != null && (u1Var = nxVar.V) != null) {
                u1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            }
            ki.y1 y1Var = this.C1;
            if (y1Var != null) {
                y1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            }
            ei.x3 x3Var = this.p0;
            if (x3Var != null) {
                x3Var.h(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
            }
            ei.x3 x3Var2 = this.q0;
            if (x3Var2 != null) {
                x3Var2.h(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final float U3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.b.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    public final void U4(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        MessagesController.DialogFilter dialogFilter;
        Object[] objArr;
        boolean z12;
        boolean z13;
        if (this.z0 == null || this.inPreviewMode || this.q3) {
            return;
        }
        yw ywVar = this.G3;
        if (ywVar == null || !ywVar.c()) {
            org.telegram.ui.Components.j80 j80Var = this.L0;
            if (j80Var != null) {
                j80Var.u();
                this.L0 = null;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            ne.b bVar = this.r;
            boolean z14 = true;
            boolean z15 = false;
            if (size <= 1) {
                r52 = 0;
                if (this.z0.getVisibility() != 8) {
                    this.z0.setIsEditing(false);
                    G4(false);
                    this.n3 = false;
                    if (this.m3) {
                        this.m3 = false;
                        this.e0[0].setTranslationX(0.0f);
                        this.e0[1].setTranslationX(r2[0].getMeasuredWidth());
                    }
                    if (this.e0[0].h != this.z0.getDefaultTabId()) {
                        this.e0[0].h = this.z0.getDefaultTabId();
                        lw lwVar = this.e0[0].d;
                        lwVar.h = 0;
                        lwVar.l();
                        dy dyVar = this.e0[0];
                        dyVar.s = this.R0;
                        dyVar.d.l();
                    }
                    this.e0[1].setVisibility(8);
                    dy dyVar2 = this.e0[1];
                    dyVar2.h = 0;
                    lw lwVar2 = dyVar2.d;
                    lwVar2.h = 0;
                    lwVar2.l();
                    dy dyVar3 = this.e0[1];
                    dyVar3.s = this.R0;
                    dyVar3.d.l();
                    this.w = false;
                    if (this.fragmentView != null) {
                        boolean z16 = (this.isPaused || this.R3 != null) ? false : z11;
                        if (!this.q3) {
                            bVar.a(false, z16);
                        }
                    }
                    int i10 = 0;
                    while (true) {
                        dy[] dyVarArr = this.e0;
                        if (i10 >= dyVarArr.length) {
                            break;
                        }
                        dy dyVar4 = dyVarArr[i10];
                        if (dyVar4.s == 0 && dyVar4.v == 2 && X3() && ((L0 = this.e0[i10].c.L0()) == 0 || L0 == 1)) {
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
                cw cwVar = this.z0;
                cwVar.h.clear();
                cwVar.j0.clear();
                cwVar.l0.clear();
                cwVar.m0.clear();
                cwVar.n0.clear();
                cwVar.o0.clear();
                cwVar.M = 0;
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
                            cw cwVar2 = this.z0;
                            if (cwVar2.h(cwVar2.k0.get(currentTabId, -1))) {
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
                    dy[] dyVarArr2 = this.e0;
                    if (i12 >= dyVarArr2.length) {
                        break;
                    }
                    if (dyVarArr2[i12].h >= dialogFilters.size()) {
                        this.e0[i12].h = dialogFilters.size() - 1;
                    }
                    this.e0[i12].a.setScrollingTouchSlop(1);
                    i12++;
                }
                cw cwVar3 = this.z0;
                cwVar3.F.setItemAnimator(z17 ? cwVar3.s0 : null);
                cwVar3.I.l();
                if (isEmpty) {
                    P4(z19);
                }
                cw cwVar4 = this.z0;
                int currentTabId2 = cwVar4.getCurrentTabId();
                ArrayList arrayList = cwVar4.h;
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
                    cw cwVar5 = this.z0;
                    ArrayList arrayList2 = cwVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        cwVar5.f((org.telegram.ui.Components.p00) arrayList2.get(0), 0);
                    }
                }
                r52 = 0;
            } else {
                r52 = 0;
            }
            R4(r52);
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
                P4(false);
            }
        }
    }

    public final ci.h7 V3() {
        return getMessagesController().getStoriesController();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V4(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        nx nxVar;
        boolean z13;
        org.telegram.ui.Components.k91 k91Var;
        if (!this.q3 || this.l2 || (nxVar = this.C0) == null) {
            return;
        }
        ArrayList<hg.o0> currentSearchFilters = nxVar.getCurrentSearchFilters();
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
                k91Var = this.a0;
                if (k91Var != null) {
                    k91Var.b(z13, true);
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
        k91Var = this.a0;
        if (k91Var != null) {
        }
        this.b0.setEnabled(z13);
        this.s.a(z13, true);
    }

    public final UndoView W3() {
        L3();
        UndoView[] undoViewArr = this.y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            wx wxVar = (wx) this.fragmentView;
            wxVar.removeView(undoViewArr[0]);
            wxVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void W4() {
        float f7 = (((-this.g4) - this.j4) - this.u1) - this.v1;
        org.telegram.ui.Components.h20 h20Var = this.t0;
        if (h20Var != null) {
            h20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.h20 h20Var2 = this.u0;
        if (h20Var2 != null) {
            h20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            ei.x3 x3Var = this.p0;
            if (x3Var != null) {
                x3Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final boolean X3() {
        return !this.l2 && this.R0 == 0 && this.Y2 == 0 && this.W2 == 0 && getMessagesController().hasHiddenArchive();
    }

    public final void X4(boolean z10) {
        boolean z11 = this.l2;
        boolean z12 = (!z11 || this.R0 == 10) && this.W2 == 0 && this.Y2 == 0 && !this.inPreviewMode && (!this.j2 || z11) && !this.U3;
        org.telegram.ui.Components.h20 h20Var = this.t0;
        if (h20Var != null) {
            h20Var.e(z12, z10);
        }
        org.telegram.ui.Components.h20 h20Var2 = this.u0;
        if (h20Var2 != null) {
            h20Var2.e(z12, z10);
        }
    }

    public final boolean Y3() {
        ArrayList arrayList = this.D2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void Y4(boolean z10, boolean z11) {
        boolean z12;
        if (this.n0 != null) {
            org.telegram.ui.ActionBar.u0 u0Var = this.m0;
            if (u0Var == null || u0Var.getVisibility() != 0) {
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
                v3();
                boolean z13 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.d2;
                boolean z14 = i11 == 3 || i11 == 5;
                this.o0.setSubtext(LocaleController.getString(z13 ? z14 ? R.string.MenuProxyConnected : R.string.MenuProxyConnecting : R.string.MenuProxyDisabled));
                this.n0.b(z13, z14, z10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z3(boolean z10) {
        boolean z11;
        this.actionBar.r();
        this.I2.clear();
        org.telegram.ui.ActionBar.h2 h2Var = this.e1;
        int i10 = 1;
        if (h2Var != null) {
            h2Var.c(0.0f, true);
        }
        cw cwVar = this.z0;
        if (cwVar != null) {
            cwVar.b(org.telegram.ui.ActionBar.k6.K8, org.telegram.ui.ActionBar.k6.I8, org.telegram.ui.ActionBar.k6.J8, org.telegram.ui.ActionBar.k6.L8, org.telegram.ui.ActionBar.k6.d6);
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
        A4(-R3());
        int i11 = 0;
        int i12 = 0;
        while (true) {
            dy[] dyVarArr = this.e0;
            if (i12 >= dyVarArr.length) {
                break;
            }
            dy dyVar = dyVarArr[i12];
            if (dyVar != null) {
                dyVar.a.I0(true);
            }
            i12++;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp((this.K ? 81 : 0) + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u3, 0.0f);
        this.v3 = ofFloat;
        ofFloat.addUpdateListener(new kv(this, max, i10));
        this.v3.addListener(new hx(this, max, i11));
        this.v3.setInterpolator(org.telegram.ui.Components.bs.f);
        this.v3.setDuration(200L);
        this.v3.start();
        this.Y0 = false;
        ArrayList arrayList = this.a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i13);
                q00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
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
        R4(true);
        if (this.e0 != null) {
            int i14 = z11;
            while (true) {
                dy[] dyVarArr2 = this.e0;
                if (i14 >= dyVarArr2.length) {
                    break;
                }
                dyVarArr2[i14].d.H = z11;
                i14++;
            }
        }
        int i15 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i16 = z11;
        if (z10) {
            i16 = MessagesController.UPDATE_MASK_CHAT;
        }
        g5(i16 | i15, true);
    }

    public final void Z4() {
        if (!this.s3 || this.actionBar == null) {
            return;
        }
        int themedColor = getThemedColor((this.W2 == 0 && this.Y2 == 0) ? org.telegram.ui.ActionBar.k6.v8 : org.telegram.ui.ActionBar.k6.O8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.y8;
        kVar.B(i0.a.f(this.x1, themedColor, getThemedColor(i10)), false);
        this.actionBar.B(i0.a.f(this.x1, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.A(i0.a.f(this.x1, getThemedColor((this.W2 == 0 && this.Y2 == 0) ? org.telegram.ui.ActionBar.k6.t8 : org.telegram.ui.ActionBar.k6.N8), getThemedColor(org.telegram.ui.ActionBar.k6.z8)), false);
    }

    public final void a4(boolean z10) {
        if (this.G3.c()) {
            z10 = true;
        }
        if (z10 && this.b2) {
            return;
        }
        this.U3 = z10;
        X4(true);
        if (z10) {
            ei.x3 x3Var = this.p0;
            if (x3Var != null) {
                x3Var.e(true);
            }
            ei.x3 x3Var2 = this.q0;
            if (x3Var2 != null) {
                x3Var2.e(true);
            }
        }
    }

    public final void a5() {
        org.telegram.ui.Components.nr0 nr0Var;
        ow owVar = this.B1;
        ArrayList arrayList = this.I2;
        if (owVar == null) {
            if (this.R0 == 10) {
                a4(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        b5();
        if (arrayList.isEmpty()) {
            String string = LocaleController.getString((this.R0 == 3 && this.f2 == null) ? R.string.ForwardTo : R.string.SelectChat);
            if (this.Q3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(string);
            } else {
                this.actionBar.I(string, true, 350L, org.telegram.ui.Components.bs.h);
            }
            if (this.B1.getTag() != null) {
                this.B1.k0(false, false, false);
                this.B1.M();
                this.B1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.B1.getTag() == null) {
                if (!Y3() && this.E2 == null) {
                    this.B1.setFieldText("");
                }
                this.B1.setTag(1);
                if (!this.W3 && (nr0Var = this.G2) != null) {
                    this.W3 = true;
                    String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                    nr0Var.j();
                    nr0Var.F = string2;
                    org.telegram.ui.Components.lr0 lr0Var = nr0Var.a[0];
                    if (string2 != null) {
                        lr0Var.e.l(string2, false);
                    }
                    org.telegram.ui.Components.kr0 kr0Var = new org.telegram.ui.Components.kr0(nr0Var, 0);
                    nr0Var.G = kr0Var;
                    AndroidUtilities.runOnUIThread(kr0Var, 1000L);
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
                this.actionBar.I(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.bs.h);
            }
        }
        this.Q3 = arrayList.isEmpty();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ik));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.hk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.mk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.lk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.kk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.jk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.il));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
    }

    public final void b5() {
        org.telegram.ui.Components.nr0 nr0Var = this.G2;
        if (nr0Var == null) {
            return;
        }
        int i10 = this.currentAccount;
        nr0Var.h(i10);
        nr0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        ArrayList arrayList = nr0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.I2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        org.telegram.ui.Components.lr0 lr0Var = nr0Var.a[0];
        if (nr0Var.b == 1) {
            lr0Var.d.l(nr0Var.c(lr0Var), false);
        }
    }

    public final boolean c4() {
        return this.W2 == 1;
    }

    public final void c5(boolean z10) {
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        cw cwVar;
        if (this.G3.c()) {
            return false;
        }
        return this.R0 != 3 || (cwVar = this.z0) == null || cwVar.getVisibility() != 0 || this.z0.K <= 0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean closeLastFragment() {
        if (!this.G3.c()) {
            return super.closeLastFragment();
        }
        this.G3.a();
        nx nxVar = this.C0;
        if (nxVar == null) {
            return true;
        }
        nxVar.Q();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.z7 z7Var = new org.telegram.ui.Components.z7(this, context, this.resourceProvider, 3);
        z7Var.setAllowOverlayTitle(true);
        z7Var.K();
        org.telegram.ui.ActionBar.r6.m(z7Var, 3, org.telegram.ui.ActionBar.k6.t8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.a(z7Var, org.telegram.ui.ActionBar.k6.z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.r6.m(z7Var, 1, org.telegram.ui.ActionBar.k6.v8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.b(z7Var, org.telegram.ui.ActionBar.k6.y8, getResourceProvider(), true);
        z7Var.j();
        z7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        z7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.W2 == 0 || c4())) {
            return z7Var;
        }
        z7Var.setOccupyStatusBar(false);
        return z7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0c85  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0ccc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0cf7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0d4f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0d78  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0e2f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0e89  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0ec1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0e49  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0cff  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r3v202, types: [org.telegram.ui.Components.mm0, org.telegram.ui.zx] */
    /* JADX WARN: Type inference failed for: r3v203, types: [org.telegram.ui.Components.mm0, org.telegram.ui.zx] */
    /* JADX WARN: Type inference failed for: r3v204, types: [androidx.recyclerview.widget.RecyclerView, org.telegram.ui.zx] */
    /* JADX WARN: Type inference failed for: r3v208, types: [org.telegram.ui.Components.mm0, org.telegram.ui.zx] */
    /* JADX WARN: Type inference failed for: r3v209, types: [org.telegram.ui.Components.mm0, org.telegram.ui.zx] */
    /* JADX WARN: Type inference failed for: r3v211, types: [org.telegram.ui.hw, s4.b0] */
    /* JADX WARN: Type inference failed for: r4v72, types: [org.telegram.ui.Components.mm0, org.telegram.ui.zx] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.telegram.ui.vv] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v22, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        long j10;
        float f7;
        int i10;
        sn snVar;
        cw cwVar;
        tx txVar;
        tx txVar2;
        org.telegram.ui.Components.us usVar;
        cy cyVar;
        s4.y yVar;
        hg.m mVar;
        hg.m mVar2;
        long j11;
        hg.m mVar3;
        hg.m mVar4;
        hg.m mVar5;
        hg.m mVar6;
        xx xxVar;
        int i11;
        int i12;
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
        AndroidUtilities.runOnUIThread(new dv(context2, 0));
        this.N1 = null;
        this.L1 = null;
        this.M1 = null;
        this.Q1 = null;
        this.J1 = null;
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        m10.setTranslationX(-AndroidUtilities.dp(5.0f));
        org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.outline_header_search);
        a2.F();
        this.j0 = a2;
        a2.setOnClickListener(new iv(this, 1));
        int i13 = 8;
        if (this.R0 == 2 || (c4() && P3(this.currentAccount, this.R0, this.W2, false).isEmpty())) {
            this.j0.setVisibility(8);
        }
        this.j0.setVisibility(8);
        int i14 = 3;
        ?? r82 = 1;
        if (!this.l2 && this.n2 == null && this.W2 == 0 && this.Y2 == 0) {
            int i15 = org.telegram.ui.ActionBar.k6.t8;
            int themedColor = getThemedColor(i15);
            j10 = 0;
            int i16 = org.telegram.ui.ActionBar.k6.v8;
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context2, themedColor, getThemedColor(i16), true);
            this.m0 = u0Var;
            u0Var.setText(LocaleController.getString(R.string.Done).toUpperCase());
            if (this.m0.getTextView() != null) {
                org.telegram.ui.ActionBar.r6.W(this.m0.getTextView(), i16, getResourceProvider());
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = this.m0;
            org.telegram.ui.ActionBar.r6.S(u0Var2, u0Var2.getBackground(), null, org.telegram.ui.ActionBar.r6.O(i15), getResourceProvider());
            this.actionBar.addView(this.m0, w7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.m0.setOnClickListener(new iv(this, 8));
            this.m0.setAlpha(0.0f);
            this.m0.setVisibility(8);
            this.n0 = new org.telegram.ui.Components.fj0(context2);
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(context2, this.resourceProvider, false, true);
            this.o0 = e1Var;
            e1Var.setItemHeight(56);
            this.o0.j(LocaleController.getString(R.string.MenuProxyTitle), 0, this.n0);
            this.o0.setContentDescription(LocaleController.getString(R.string.ProxySettings));
            org.telegram.ui.ActionBar.u0 a10 = m10.a(1, R.drawable.outline_header_lock_24);
            this.f0 = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrPasscodeLock));
            org.telegram.ui.ActionBar.u0 d = m10.d(3, new ColorDrawable(0));
            this.g0 = d;
            gy gyVar = new gy(context2, this.currentAccount);
            this.h0 = gyVar;
            d.addView(gyVar);
            this.g0.setContentDescription(LocaleController.getString(R.string.DownloadsTabs));
            this.g0.setVisibility(8);
            Y4(false, false);
        } else {
            j10 = 0;
        }
        tx txVar3 = new tx(context2, this.resourceProvider);
        this.X = txVar3;
        txVar3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.u0 a11 = m10.a(-47, R.drawable.avd_speed);
            this.l0 = a11;
            AndroidUtilities.removeFromParent(a11);
            this.l0.setOnClickListener(new iv(this, 9));
            this.X.a(this.l0);
            this.X.updateColors();
        }
        this.X.setCloseButtonOnClickListener(new uv(this, 0));
        this.X.r.setOnFocusChangeListener(new pd(this, 1));
        ei.e2 e2Var = this.X.r;
        zf.h0 h0Var = new zf.h0(e2Var, new ux(this));
        this.Y = h0Var;
        e2Var.addTextChangedListener(h0Var);
        this.X.setSearchFiltersListener(new jx(this, 5));
        this.Y.a();
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.u0 a12 = m10.a(4, R.drawable.ic_ab_other);
            this.k0 = a12;
            a12.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.k0.setOnClickListener(new iv(this, 10));
            this.k0.setOnLongClickListener(new qv(this, 3));
        }
        this.j0.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.j0.setContentDescription(LocaleController.getString(R.string.Search));
        if (this.l2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i17 = this.R0;
            if (i17 == 16) {
                this.actionBar.setTitle(LocaleController.getString(R.string.BotChooseChatToVerify));
            } else if (this.N0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.O0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (i17 == 3 && this.f2 == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else if (i17 == 10) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectChats));
            } else if (i17 == 14) {
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
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.actionBar, getResourceProvider());
        } else {
            if (this.n2 != null || this.W2 != 0 || this.Y2 != j10) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
                this.e1 = h2Var;
                kVar.setBackButtonDrawable(h2Var);
            }
            if (this.W2 != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedChats));
            } else if (this.Y2 != j10) {
                this.actionBar.setTitle(DialogObject.getName(this.Z2));
                this.actionBar.setAdditionalTextLeft(AndroidUtilities.dp(28.0f));
                this.c3 = new org.telegram.ui.Components.h9(this.Z2);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
                this.b3 = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
                this.b3.e(this.Z2, this.c3);
                this.actionBar.addView(this.b3, w7.z5.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(26.0f), null);
                this.E3 = p5Var;
                p5Var.a = true;
                Drawable mutate = context2.getResources().getDrawable(R.drawable.telegram_logo_2).mutate();
                this.D3 = mutate;
                mutate.setBounds(0, AndroidUtilities.dp(2.0f), this.D3.getIntrinsicWidth(), this.D3.getIntrinsicHeight() + AndroidUtilities.dp(2.0f));
                this.D3.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.gl), PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.D3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.G(spannableStringBuilder, this.E3);
                d5(UserConfig.getInstance(this.currentAccount).getCurrentUser(), false);
            }
            if (this.W2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setTitleActionRunnable(new uv(this, 1));
        int i18 = this.R0;
        if (((i18 == 0 && !this.l2) || i18 == 3) && this.W2 == 0 && this.Y2 == j10 && TextUtils.isEmpty(this.n2)) {
            cw cwVar2 = new cw(this, context2, this.resourceProvider);
            this.z0 = cwVar2;
            cwVar2.setVisibility(8);
            this.w = false;
            this.r.a(false, false);
            this.z0.setDelegate(new dw(context2, this));
        }
        int i19 = 17;
        if (this.r2 && UserConfig.getActivatedAccountsCount() > 1) {
            this.D1 = m10.g(11, 0, AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9();
            h9Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context2);
            w9Var2.setRoundRadius(AndroidUtilities.dp(18.0f));
            this.D1.addView(w9Var2, w7.z5.e(36, 36, 17));
            this.D1.setOnClickListener(new iv(this, 11));
            this.D1.setOnLongClickListener(new qv(this, 2));
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            h9Var.m(this.currentAccount, currentUser);
            w9Var2.getImageReceiver().setCurrentAccount(this.currentAccount);
            w9Var2.l(ImageLocation.getForUserOrChat(this.currentAccount, currentUser, 1), "50_50", ImageLocation.getForUserOrChat(currentUser, 2), "50_50", (currentUser == null || (userProfilePhoto = currentUser.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? h9Var : r92, currentUser);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ew(this));
        final wx wxVar = new wx(context2, this);
        this.fragmentView = wxVar;
        ih.k kVar2 = new ih.k(wxVar);
        this.k4 = kVar2;
        bh.b bVar = this.p4;
        bVar.f(kVar2, wxVar);
        ih.k kVar3 = this.k4;
        bh.b bVar2 = this.r4;
        bVar2.f(kVar3, wxVar);
        ih.k kVar4 = this.k4;
        bh.b bVar3 = this.s4;
        bVar3.f(kVar4, wxVar);
        this.q4.f(this.k4, wxVar);
        final PointF pointF = new PointF();
        this.t4 = new ch.a() { // from class: org.telegram.ui.vv
            @Override // ch.a
            public final void e(bh.a aVar, RectF rectF) {
                aVar.a = true;
            }

            @Override // ch.a
            public final void f(Canvas canvas, RectF rectF) {
                ey eyVar = ey.this;
                nx nxVar = eyVar.C0;
                int alpha = nxVar != null ? (int) (nxVar.getAlpha() * 255.0f) : 0;
                dy[] dyVarArr = eyVar.e0;
                int length = dyVarArr.length;
                int i20 = 0;
                while (true) {
                    wx wxVar2 = wxVar;
                    if (i20 >= length) {
                        nx nxVar2 = eyVar.C0;
                        if (nxVar2 == null || nxVar2.getVisibility() != 0 || eyVar.C0.getAlpha() <= 0.0f) {
                            return;
                        }
                        nx nxVar3 = eyVar.C0;
                        hh.d.b(nxVar3, canvas, rectF, nxVar3, wxVar2, alpha);
                        return;
                    }
                    dy dyVar = dyVarArr[i20];
                    if (dyVar != null && dyVar.getVisibility() == 0 && dyVar.getAlpha() > 0.0f) {
                        float T3 = eyVar.T3();
                        if (dyVar.F == null || T3 <= 0.0f) {
                            zx zxVar = dyVar.a;
                            hh.d.b(zxVar, canvas, rectF, zxVar, wxVar2, 255 - alpha);
                        } else {
                            zx zxVar2 = dyVar.a;
                            PointF pointF2 = pointF;
                            if (!ih.k.b(zxVar2, wxVar2, pointF2)) {
                                return;
                            }
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF2.x, pointF2.y);
                            dyVar.a.dispatchDraw(canvas);
                            canvas.restore();
                        }
                    }
                    i20++;
                }
            }
        };
        int i20 = (this.W2 == 0 && this.Y2 == j10 && (((i12 = this.R0) == 0 && !this.l2) || i12 == 3)) ? 2 : 1;
        this.e0 = new dy[i20];
        int i21 = 0;
        while (i21 < i20) {
            bh.b bVar4 = bVar3;
            dy dyVar = new dy(context2, this);
            wxVar.addView(dyVar, w7.z5.c(-1.0f, -1));
            dyVar.s = this.R0;
            this.e0[i21] = dyVar;
            dyVar.w = new org.telegram.ui.Components.b10(context2);
            dyVar.w.setViewType(7);
            dyVar.w.setVisibility(i13);
            dyVar.addView(dyVar.w, w7.z5.e(-2, -2, i19));
            zx zxVar = new zx(this, context2, dyVar);
            dyVar.a = zxVar;
            zxVar.C0(new ot(5, this, dyVar));
            ?? r42 = dyVar.a;
            dyVar.b = new a5.a((org.telegram.ui.Components.mm0) r42);
            r42.setAllowStopHeaveOperations(r82);
            dyVar.a.setAccessibilityEnabled(r11);
            dyVar.a.q1(r11, r82);
            dyVar.a.setClipToPadding(r11);
            dyVar.a.setPivotY(0.0f);
            if (this.R0 == 15) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, dyVar.a, getResourceProvider());
            }
            dyVar.x = new fw(dyVar.a, dyVar);
            dyVar.a.setVerticalScrollBarEnabled(r82);
            dyVar.a.setInstantClick(r82);
            dyVar.c = new hw(this, dyVar);
            dyVar.c.j1(r82);
            dyVar.a.setLayoutManager(dyVar.c);
            dyVar.a.setVerticalScrollbarPosition(LocaleController.isRTL ? r82 : 2);
            dyVar.addView(dyVar.a, w7.z5.c(-1.0f, -1));
            dyVar.a.setOnItemClickListener(new ks(4, this, dyVar));
            dyVar.a.setOnItemLongClickListener(new mi.q(this, dyVar, false, 11));
            dyVar.f = new cy(this, dyVar);
            dyVar.y = new org.telegram.ui.Components.rl0(dyVar.a, r11);
            cyVar = dyVar.f;
            dyVar.e = new s4.y(cyVar);
            yVar = dyVar.e;
            yVar.d(dyVar.a);
            dyVar.a.setOnScrollListener(new jw(this, dyVar, wxVar));
            dyVar.v = SharedConfig.archiveHidden ? 2 : r11;
            if (dyVar.n == null && this.W2 == 0 && this.Y2 == j10) {
                dyVar.n = new kw(LocaleController.getString(R.string.AccSwipeForArchive), LocaleController.getString(R.string.AccReleaseForArchive), dyVar);
                if (X3()) {
                    dyVar.n.h();
                } else {
                    dyVar.n.b();
                }
                kw kwVar = dyVar.n;
                i11 = dyVar.v;
                kwVar.g(i11 != 0 ? r82 : r11);
            }
            wx wxVar2 = wxVar;
            bh.b bVar5 = bVar;
            boolean z13 = r82;
            bh.b bVar6 = bVar2;
            context2 = context;
            dyVar.d = new lw(this, this, context, dyVar.s, this.W2, this.l2, arrayList, this.currentAccount, this.G, dyVar);
            mVar = dyVar.d;
            mVar.S(dyVar.a);
            mVar2 = dyVar.d;
            mVar2.Q(this.t2);
            if (dyVar.s == 3) {
                mVar6 = dyVar.d;
                mVar6.N((getMessagesController().storiesEnabled() && (xxVar = this.C2) != null && xxVar.D()) ? z13 : false);
            }
            if (AndroidUtilities.isTablet()) {
                MessagesStorage.TopicKey topicKey = this.p2;
                j11 = 0;
                if (topicKey.dialogId != 0) {
                    mVar5 = dyVar.d;
                    mVar5.R(topicKey.dialogId);
                }
            } else {
                j11 = 0;
            }
            mVar3 = dyVar.d;
            mVar3.O(dyVar.n);
            zx zxVar2 = dyVar.a;
            mVar4 = dyVar.d;
            zxVar2.setAdapter(mVar4);
            dyVar.a.setEmptyView((this.W2 == 0 && this.Y2 == j11) ? dyVar.w : null);
            dyVar.r = new org.telegram.ui.Components.pl0(dyVar.a, dyVar.c);
            org.telegram.ui.Components.pl0 pl0Var = dyVar.r;
            pl0Var.c = z13;
            pl0Var.d = z13;
            pl0Var.h = new jv(this, 10);
            if (i21 != 0) {
                this.e0[i21].setVisibility(8);
            }
            i21++;
            j10 = j11;
            wxVar = wxVar2;
            r82 = z13;
            i14 = 3;
            bVar3 = bVar4;
            bVar = bVar5;
            bVar2 = bVar6;
            r11 = 0;
            i19 = 17;
            i13 = 8;
        }
        wx wxVar3 = wxVar;
        int i22 = i14;
        bh.b bVar7 = bVar;
        int i23 = r82;
        bh.b bVar8 = bVar2;
        bh.b bVar9 = bVar3;
        long j12 = j10;
        org.telegram.ui.Components.ts tsVar = new org.telegram.ui.Components.ts(context2);
        this.K1 = tsVar;
        int i24 = org.telegram.ui.ActionBar.k6.d6;
        tsVar.setColor(org.telegram.ui.ActionBar.k6.v0(i24));
        wxVar3.addView(this.K1, w7.z5.e(-1, 100, 48));
        this.B0 = wxVar3.getChildCount();
        m31 m31Var = new m31((Activity) getContext());
        this.Z = m31Var;
        m31Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        wxVar3.addView(this.Z, w7.z5.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d b10 = bVar8.b(this.Z, fh.c.n(this.resourceProvider));
        b10.q(AndroidUtilities.dp(18.0f));
        b10.p(AndroidUtilities.dp(6.666f));
        this.Z.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        this.Z.setBlurredBackground(b10);
        hg.q0 q0Var = new hg.q0(getParentActivity(), null);
        this.b0 = q0Var;
        q0Var.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        hg.q0 q0Var2 = this.b0;
        q0Var2.b3 = false;
        q0Var2.setOnItemClickListener(new nv(this, 1));
        this.Z.addView(this.b0, w7.z5.e(-1, -1, 48));
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context2, this.resourceProvider, i23);
        this.u0 = h20Var;
        h20Var.setContentDescription(LocaleController.getString(R.string.StoryPrivacyButtonPost));
        this.u0.setImageResource(R.drawable.outline_fab_story_24);
        this.u0.setOnClickListener(new iv(this, 27));
        wxVar3.addView(this.u0, org.telegram.ui.Components.h20.c());
        org.telegram.ui.Components.h20 h20Var2 = new org.telegram.ui.Components.h20(context2, this.resourceProvider);
        this.t0 = h20Var2;
        wxVar3.addView(h20Var2, org.telegram.ui.Components.h20.b());
        this.t0.setOnClickListener(new iv(this, 28));
        if (!c4() && this.R0 == 0 && MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("storyhint", i23)) {
            ei.x3 x3Var = new ei.x3(context2, 2);
            x3Var.q(8.0f);
            x3Var.d = 8000L;
            x3Var.i(i23);
            x3Var.n();
            x3Var.p(i23);
            x3Var.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryCameraHint), ei.vb.m(context2)));
            x3Var.l(1.0f, -40.0f);
            x3Var.h(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
            x3Var.l0 = new uv(this, 12);
            this.p0 = x3Var;
            wxVar3.addView(x3Var, w7.z5.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        }
        e5();
        this.a0 = null;
        if (this.l2 || this.R0 != 0) {
            f7 = 72.0f;
            if (this.R0 == i22 || G3()) {
                ih.f fVar = new ih.f(context2);
                this.y1 = fVar;
                fVar.setClipChildren(false);
                ih.f fVar2 = this.y1;
                qh.i iVar = this.v;
                fVar2.setWindowInsetsProvider(iVar);
                ih.f fVar3 = this.y1;
                fVar3.setInputIslandBubbleDrawable(bVar8.b(fVar3, fh.c.n(this.resourceProvider)));
                ih.f fVar4 = this.y1;
                fVar4.setUnderKeyboardBackgroundDrawable(bVar7.b(fVar4, fh.c.n(this.resourceProvider)));
                bh.c cVar = new bh.c(bVar9.b(this.y1, null));
                if (!SharedConfig.chatBlurEnabled() || LiteMode.isEnabled(262144)) {
                    cVar.b(AndroidUtilities.dp(72.0f), i23);
                }
                this.y1.setBackgroundWithFadeDrawable(cVar);
                FrameLayout inputIslandBubbleContainer = this.y1.getInputIslandBubbleContainer();
                this.z1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.A1 = this.y1.getInAppKeyboardBubbleContainer();
                ow owVar = this.B1;
                if (owVar != null) {
                    owVar.z0();
                }
                ow owVar2 = new ow(this, getParentActivity(), wxVar3);
                this.B1 = owVar2;
                owVar2.setInAppInsetsController(iVar);
                this.B1.y4 = false;
                wxVar3.setClipChildren(false);
                wxVar3.setClipToPadding(false);
                ow owVar3 = this.B1;
                owVar3.x4 = false;
                owVar3.i2 = (AndroidUtilities.isInMultiwindow || ((snVar = owVar3.P2) != null && snVar.isInBubbleMode())) ? false : i23;
                this.B1.S0(false, false, false);
                this.B1.d1(i23, false);
                this.B1.z1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
                this.B1.getSendButton().setAlpha(0.0f);
                this.B1.setViewParentForEmoji(this.A1);
                this.z1.addView(this.B1, w7.z5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                wxVar3.addView(this.y1.getFadeView(), w7.z5.c(-1.0f, -1));
                wxVar3.addView(this.y1, w7.z5.c(-1.0f, -1));
                if (Y3() || this.E2 != null || this.F2 != null) {
                    h3(this.V3);
                    this.V3 = null;
                }
                this.B1.setDelegate(new pw(this));
                i10 = -1;
                ki.y1 y1Var = new ki.y1(this, context2, R.drawable.send_plane_24, this.resourceProvider, 3);
                this.C1 = y1Var;
                int dp = AndroidUtilities.dp(52.0f);
                int dp2 = AndroidUtilities.dp(38.0f);
                y1Var.I = dp;
                y1Var.J = dp2;
                ki.y1 y1Var2 = this.C1;
                float dp3 = AndroidUtilities.dp(7.0f);
                float dp4 = AndroidUtilities.dp(8.0f);
                y1Var2.M = dp3;
                y1Var2.N = dp4;
                ki.y1 y1Var3 = this.C1;
                y1Var3.h0 = i23;
                wxVar3.addView(y1Var3, w7.z5.e(110, 50, 85));
                this.C1.setScrimViewBackgroundColor(getThemedColor(i24));
                this.C1.setOnClickListener(new iv(this, 5));
                this.C1.setOnLongClickListener(new qv(this, 0));
                this.C1.setVisibility(8);
                this.C1.setScaleX(0.2f);
                this.C1.setScaleY(0.2f);
                this.C1.setAlpha(0.0f);
                float dp5 = AndroidUtilities.dp(12.0f);
                TextPaint textPaint = this.E1;
                textPaint.setTextSize(dp5);
                textPaint.setTypeface(AndroidUtilities.bold());
                cwVar = this.z0;
                if (cwVar != null) {
                    dh.d b11 = bVar8.b(cwVar, fh.c.n(this.resourceProvider));
                    b11.q(AndroidUtilities.dp(18.0f));
                    b11.p(AndroidUtilities.dp(6.666f));
                    this.z0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                    this.z0.setBlurredBackground(b11);
                    wxVar3.addView(this.z0, w7.z5.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                txVar = this.X;
                if (txVar != null) {
                    txVar.setupBlurredBackground(bVar8.b(txVar, fh.c.n(this.resourceProvider)));
                }
                vw vwVar = new vw(this, context, this, this.currentAccount, c4() ? 1 : 0);
                this.E0 = vwVar;
                vwVar.setActionBar(this.actionBar);
                this.E0.setMenuItemsOffset(!c4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
                vw vwVar2 = this.E0;
                vwVar2.l0 = false;
                vwVar2.setVisibility(8);
                this.M = false;
                this.L = false;
                this.K = false;
                if (this.l2 && this.R0 == i22) {
                    MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
                }
                wxVar3.addView(this.actionBar, w7.z5.c(-2.0f, i10));
                if (!this.l2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
                    this.F3 = oVar;
                    wxVar3.addView(oVar, w7.z5.e(20, 20, 51));
                }
                txVar2 = this.X;
                if (txVar2 != null) {
                    wxVar3.addView(txVar2, w7.z5.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.x0 = wxVar3.getChildCount();
                UndoView[] undoViewArr = this.y0;
                undoViewArr[0] = null;
                undoViewArr[i23] = null;
                if (this.W) {
                    this.actionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
                    org.telegram.ui.ActionBar.r6.d(this.actionBar, org.telegram.ui.ActionBar.k6.gl, getResourceProvider());
                }
                if (this.W2 == 0 || this.Y2 != j12) {
                    this.e0[0].a.setGlowColor(getThemedColor(i24));
                    org.telegram.ui.ActionBar.r6.b(this.actionBar, org.telegram.ui.ActionBar.k6.O8, getResourceProvider(), false);
                    org.telegram.ui.ActionBar.r6.a(this.actionBar, org.telegram.ui.ActionBar.k6.N8, getResourceProvider(), false);
                    this.actionBar.F(getThemedColor(org.telegram.ui.ActionBar.k6.Q8), false);
                    this.actionBar.F(getThemedColor(org.telegram.ui.ActionBar.k6.R8), i23);
                }
                if (!this.l2 && this.R0 == 0) {
                    ai.jc jcVar = new ai.jc(this, context, 28);
                    this.K0 = jcVar;
                    jcVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i24), 100)));
                    this.K0.setFocusable(false);
                    this.K0.setImportantForAccessibility(2);
                    this.K0.setOnClickListener(new iv(this, 7));
                    this.K0.setVisibility(8);
                    wxVar3.addView(this.K0, w7.z5.c(-1.0f, i10));
                }
                this.f1.setColor(getThemedColor(i24));
                this.q3 = false;
                if (this.n2 == null) {
                    M4(i23, false, false, false);
                    this.X.r.setText(this.n2);
                    this.X.r.setSelection(this.n2.length());
                } else if (this.o2 != null) {
                    M4(i23, false, false, i23);
                    this.X.r.setText(this.o2);
                    this.X.r.setSelection(this.o2.length());
                    this.o2 = null;
                    tx txVar4 = this.X;
                    if (txVar4 != null) {
                        txVar4.setTranslationY(U3() + (-AndroidUtilities.dp(36.0f)));
                    }
                } else {
                    M4(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.checkBottomSheet(this);
                }
                this.actionBar.setDrawBlurBackground(wxVar3);
                this.G3 = new yw(this, context, wxVar3, context);
                U4(i23, false);
                this.G3.setOpenProgress(0.0f);
                wxVar3.addView(this.E0, w7.z5.c(81.0f, i10));
                wxVar3.addView(this.G3, w7.z5.c(-1.0f, i10));
                this.F0 = new org.telegram.ui.Components.ss(context);
                usVar = this.J1;
                if (usVar != null) {
                    wxVar3.addView(usVar, w7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.Y2 != j12 && this.R0 != i22 && ChatObject.canAddChatToCommunity(this.Z2)) {
                    org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                    spannableStringBuilder2.setSpan(xqVar, 0, i23, 33);
                    ei.d dVar = new ei.d(context, this.resourceProvider);
                    this.v0 = dVar;
                    dVar.f();
                    this.v0.setText(spannableStringBuilder2);
                    this.v0.setOnClickListener(new org.telegram.ui.Components.d51(12, this, new org.telegram.ui.ActionBar.c2[i23]));
                    kh.f fVar5 = new kh.f(getContext());
                    this.w0 = fVar5;
                    fVar5.setupColorKey(org.telegram.ui.ActionBar.k6.a7);
                    this.w0.setFadeZoneBottom(AndroidUtilities.dp(f7) + AndroidUtilities.navigationBarHeight);
                    this.w0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
                    wxVar3.addView(this.w0, w7.z5.g());
                    wxVar3.addView(this.v0, w7.z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
                }
                f5(false);
                X4(false);
                D3();
                A3();
                C3();
                B3();
                z3();
                t3();
                this.X.setBlurredBackgroundVisibility(this.b.e);
                r0.i0.l(this.fragmentView, new jv(this, 7));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.us usVar2 = new org.telegram.ui.Components.us(context2);
            this.J1 = usVar2;
            usVar2.setOnAnimatedHeightChangedListener(new ev(this, 5));
            dh.d a13 = bVar8.a(this.J1);
            a13.o(fh.c.n(this.resourceProvider));
            a13.p(AndroidUtilities.dp(7.0f));
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
            nw nwVar = new nw(this, context2, this, 0);
            this.F1 = nwVar;
            this.G1.addView(nwVar);
            nw nwVar2 = new nw(this, context2, this, 1);
            this.H1 = nwVar2;
            this.I1.addView(nwVar2);
            this.J1.setCallFragmentContextView(this.H1);
            org.telegram.ui.Cells.y2 y2Var = new org.telegram.ui.Cells.y2(context2);
            this.M1 = y2Var;
            y2Var.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
            S4();
            c7.k0(new lv(this, 0));
            c7.q0(new f5(this, 11));
            this.J1.addView(this.M1);
            if (this.Y2 != j12) {
                ii.j jVar = new ii.j(context2, this.resourceProvider, i23);
                this.Q1 = jVar;
                jVar.a(-14899731, -15497247, R.drawable.filled_requests_24, LocaleController.getString(R.string.CommunityPendingRequests), null, false);
                this.Q1.setUnreadMode(i23);
                this.Q1.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
                this.Q1.setOnClickListener(new iv(this, 4));
                this.J1.addView(this.Q1);
                o3(false);
            }
        }
        i10 = -1;
        cwVar = this.z0;
        if (cwVar != null) {
        }
        txVar = this.X;
        if (txVar != null) {
        }
        vw vwVar3 = new vw(this, context, this, this.currentAccount, c4() ? 1 : 0);
        this.E0 = vwVar3;
        vwVar3.setActionBar(this.actionBar);
        this.E0.setMenuItemsOffset(!c4() ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dpf2(16.66f));
        vw vwVar22 = this.E0;
        vwVar22.l0 = false;
        vwVar22.setVisibility(8);
        this.M = false;
        this.L = false;
        this.K = false;
        if (this.l2) {
            MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
        }
        wxVar3.addView(this.actionBar, w7.z5.c(-2.0f, i10));
        if (!this.l2) {
        }
        txVar2 = this.X;
        if (txVar2 != null) {
        }
        this.x0 = wxVar3.getChildCount();
        UndoView[] undoViewArr2 = this.y0;
        undoViewArr2[0] = null;
        undoViewArr2[i23] = null;
        if (this.W) {
        }
        if (this.W2 == 0) {
        }
        this.e0[0].a.setGlowColor(getThemedColor(i24));
        org.telegram.ui.ActionBar.r6.b(this.actionBar, org.telegram.ui.ActionBar.k6.O8, getResourceProvider(), false);
        org.telegram.ui.ActionBar.r6.a(this.actionBar, org.telegram.ui.ActionBar.k6.N8, getResourceProvider(), false);
        this.actionBar.F(getThemedColor(org.telegram.ui.ActionBar.k6.Q8), false);
        this.actionBar.F(getThemedColor(org.telegram.ui.ActionBar.k6.R8), i23);
        if (!this.l2) {
            ai.jc jcVar2 = new ai.jc(this, context, 28);
            this.K0 = jcVar2;
            jcVar2.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i24), 100)));
            this.K0.setFocusable(false);
            this.K0.setImportantForAccessibility(2);
            this.K0.setOnClickListener(new iv(this, 7));
            this.K0.setVisibility(8);
            wxVar3.addView(this.K0, w7.z5.c(-1.0f, i10));
        }
        this.f1.setColor(getThemedColor(i24));
        this.q3 = false;
        if (this.n2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(wxVar3);
        this.G3 = new yw(this, context, wxVar3, context);
        U4(i23, false);
        this.G3.setOpenProgress(0.0f);
        wxVar3.addView(this.E0, w7.z5.c(81.0f, i10));
        wxVar3.addView(this.G3, w7.z5.c(-1.0f, i10));
        this.F0 = new org.telegram.ui.Components.ss(context);
        usVar = this.J1;
        if (usVar != null) {
        }
        if (this.Y2 != j12) {
            org.telegram.ui.Components.xq xqVar2 = new org.telegram.ui.Components.xq(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder22.setSpan(xqVar2, 0, i23, 33);
            ei.d dVar2 = new ei.d(context, this.resourceProvider);
            this.v0 = dVar2;
            dVar2.f();
            this.v0.setText(spannableStringBuilder22);
            this.v0.setOnClickListener(new org.telegram.ui.Components.d51(12, this, new org.telegram.ui.ActionBar.c2[i23]));
            kh.f fVar52 = new kh.f(getContext());
            this.w0 = fVar52;
            fVar52.setupColorKey(org.telegram.ui.ActionBar.k6.a7);
            this.w0.setFadeZoneBottom(AndroidUtilities.dp(f7) + AndroidUtilities.navigationBarHeight);
            this.w0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            wxVar3.addView(this.w0, w7.z5.g());
            wxVar3.addView(this.v0, w7.z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        }
        f5(false);
        X4(false);
        D3();
        A3();
        C3();
        B3();
        z3();
        t3();
        this.X.setBlurredBackgroundVisibility(this.b.e);
        r0.i0.l(this.fragmentView, new jv(this, 7));
        return this.fragmentView;
    }

    public final boolean d4(long j10) {
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

    public final void d5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.p5 p5Var;
        vw vwVar = this.E0;
        org.telegram.ui.Components.p5 p5Var2 = null;
        if (vwVar != null && (p5Var = vwVar.a0) != null && vwVar.q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                p5Var.j(emojiStatusDocumentId.longValue(), z10);
                p5Var.m(z11, z10);
            } else if (user == null || !MessagesController.getInstance(vwVar.f).isPremiumUser(user)) {
                p5Var.g(null, z10);
                p5Var.m(false, z10);
            } else {
                if (vwVar.N0 == null) {
                    vwVar.N0 = vwVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    vwVar.N0 = new ci.i(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), vwVar.N0);
                }
                Drawable drawable = vwVar.N0;
                int i10 = org.telegram.ui.ActionBar.k6.zh;
                ey eyVar = vwVar.e0;
                org.telegram.ui.ActionBar.r6.z(vwVar, drawable, i10, eyVar != null ? eyVar.getResourceProvider() : null, PorterDuff.Mode.MULTIPLY);
                p5Var.g(vwVar.N0, z10);
                p5Var.m(false, z10);
            }
            p5Var.k(Integer.valueOf(vwVar.f(org.telegram.ui.ActionBar.k6.zh)));
            vwVar.W.invalidate();
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
            this.actionBar.setRightDrawableOnClick(new iv(this, 2));
            b61.t(this.currentAccount);
        } else if (user == null || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            this.E3.g(null, z10);
            this.E3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        } else {
            if (this.L3 == null) {
                this.L3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.L3 = new sx(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.L3);
            }
            this.L3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.zh), PorterDuff.Mode.MULTIPLY));
            this.E3.g(this.L3, z10);
            this.E3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(new iv(this, 3));
            b61.t(this.currentAccount);
        }
        org.telegram.ui.Components.p5 p5Var3 = this.E3;
        int i11 = org.telegram.ui.ActionBar.k6.zh;
        p5Var3.k(Integer.valueOf(getThemedColor(i11)));
        org.telegram.ui.Cells.o oVar = this.F3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i11));
        }
        ax axVar = this.M0;
        if (axVar == null || !(axVar.getContentView() instanceof b61)) {
            return;
        }
        org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
        b61 b61Var = (b61) this.M0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.p5 p5Var4 = this.E3;
            if (rightDrawable == p5Var4) {
                p5Var2 = p5Var4;
            }
        }
        b61Var.y(p5Var2, titleTextView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:414:0x0566, code lost:
    
        if (org.telegram.messenger.ChatObject.isChannel(r13, r4.H0) != false) goto L367;
     */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        MessagesController.DialogFilter dialogFilter;
        int i13;
        int i14;
        boolean booleanValue;
        boolean z10;
        org.telegram.ui.Components.so0 so0Var;
        org.telegram.ui.Components.so0 so0Var2;
        int i15;
        boolean z11;
        int i16 = 2;
        int i17 = 7;
        ArrayList arrayList = null;
        int i18 = 0;
        int i19 = 0;
        if (i10 == NotificationCenter.dialogsNeedReload) {
            if (this.e0 == null || this.S1) {
                return;
            }
            int i20 = 0;
            while (true) {
                dy[] dyVarArr = this.e0;
                if (i20 >= dyVarArr.length) {
                    break;
                }
                dy dyVar = dyVarArr[i20];
                int i21 = dyVarArr[0].s;
                MessagesController.DialogFilter dialogFilter2 = (i21 == 7 || i21 == 8) ? getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
                boolean z12 = (dialogFilter2 == null || (dialogFilter2.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.A3 && z12) {
                    AndroidUtilities.runOnUIThread(new lq(this, dyVar, objArr, i16), 160L);
                } else {
                    int length = objArr.length;
                    s4(dyVar);
                }
                i20++;
            }
            cw cwVar = this.z0;
            if (cwVar != null && cwVar.getVisibility() == 0) {
                this.z0.c();
            }
            this.A3 = false;
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            g5(0, true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.Y2 != chatFull.id) {
                return;
            }
            this.a3 = chatFull;
            o3(false);
            if (this.e0 == null || this.S1) {
                return;
            }
            while (true) {
                dy[] dyVarArr2 = this.e0;
                if (i19 >= dyVarArr2.length) {
                    return;
                }
                s4(dyVarArr2[i19]);
                i19++;
            }
        } else {
            if (i10 == NotificationCenter.dialogsUnreadCounterChanged) {
                cw cwVar2 = this.z0;
                if (cwVar2 == null || cwVar2.getVisibility() != 0) {
                    return;
                }
                cw cwVar3 = this.z0;
                int defaultTabId = cwVar3.getDefaultTabId();
                ai.u1 u1Var = cwVar3.F;
                ArrayList arrayList2 = cwVar3.h;
                int i22 = cwVar3.l0.get(defaultTabId, -1);
                if (i22 < 0 || i22 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.p00 p00Var = (org.telegram.ui.Components.p00) arrayList2.get(i22);
                if (p00Var.d == ((dw) cwVar3.J).a(p00Var.a) || ((dw) cwVar3.J).a(p00Var.a) < 0) {
                    return;
                }
                u1Var.g1();
                if (cwVar3.m0.get(i22) != p00Var.a(true) || cwVar3.h0) {
                    cwVar3.h0 = true;
                    cwVar3.requestLayout();
                    u1Var.setItemAnimator(cwVar3.s0);
                    org.telegram.ui.Components.o00 o00Var = cwVar3.I;
                    if (o00Var != null) {
                        o00Var.l();
                    }
                    cwVar3.M = 0;
                    org.telegram.ui.Components.p00 d = cwVar3.d();
                    if (d != null) {
                        d.b(LocaleController.getString(R.string.FilterAllChats));
                    }
                    int size = arrayList2.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        cwVar3.M = org.telegram.messenger.v0.C(24.0f, ((org.telegram.ui.Components.p00) arrayList2.get(i23)).a(true), cwVar3.M);
                    }
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadPollVotesCounterChanged) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadReactionsCounterChanged) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.emojiLoaded) {
                if (this.e0 != null) {
                    int i24 = 0;
                    while (true) {
                        dy[] dyVarArr3 = this.e0;
                        if (i24 >= dyVarArr3.length) {
                            break;
                        }
                        zx zxVar = dyVarArr3[i24].a;
                        if (zxVar != null) {
                            for (int i25 = 0; i25 < zxVar.getChildCount(); i25++) {
                                View childAt = zxVar.getChildAt(i25);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i24++;
                    }
                }
                cw cwVar4 = this.z0;
                if (cwVar4 != null) {
                    cwVar4.getTabsContainer().g1();
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
                Y4(false, false);
                return;
            }
            if (i10 == NotificationCenter.updateInterfaces) {
                Integer num = (Integer) objArr[0];
                g5(num.intValue(), true);
                cw cwVar5 = this.z0;
                if (cwVar5 != null && cwVar5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
                    this.z0.c();
                }
                if (this.Y2 != 0 && ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0)) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.Y2));
                    this.Z2 = chat;
                    this.actionBar.setTitle(DialogObject.getName(chat));
                    this.b3.e(this.Z2, this.c3);
                }
                if (this.e0 != null) {
                    for (int i26 = 0; i26 < this.e0.length; i26++) {
                        if ((num.intValue() & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.e0[i26].d.U(true);
                        }
                    }
                }
                d5(UserConfig.getInstance(i11).getCurrentUser(), true);
                return;
            }
            int i27 = NotificationCenter.appDidLogout;
            boolean[] zArr = A4;
            if (i10 == i27) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i10 == NotificationCenter.encryptedChatUpdated) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.contactsDidLoad) {
                if (this.e0 == null || this.S1) {
                    return;
                }
                org.telegram.ui.Components.h20 h20Var = this.t0;
                if (h20Var != null) {
                    z11 = h20Var.getProgressVisible();
                    this.t0.f(false, true);
                } else {
                    z11 = false;
                }
                for (dy dyVar2 : this.e0) {
                    dyVar2.d.e = false;
                }
                if (z11) {
                    x4(0.0f);
                    ValueAnimator valueAnimator = this.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.c0, 1.0f).setDuration(250L);
                    this.d0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.bs.f);
                    this.d0.addUpdateListener(new gv(this, 0));
                    this.d0.start();
                }
                int i28 = 0;
                boolean z13 = false;
                while (true) {
                    dy[] dyVarArr4 = this.e0;
                    if (i28 >= dyVarArr4.length) {
                        break;
                    }
                    if (!dyVarArr4[i28].p() || getMessagesController().getAllFoldersDialogsCount() > 10) {
                        z13 = true;
                    } else {
                        this.e0[i28].d.l();
                    }
                    i28++;
                    z13 = z13;
                }
                if (z13) {
                    g5(0, true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.openedChatChanged) {
                if (this.e0 == null) {
                    return;
                }
                int i29 = 0;
                while (true) {
                    dy[] dyVarArr5 = this.e0;
                    if (i29 >= dyVarArr5.length) {
                        g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                        return;
                    }
                    if (dyVarArr5[i29].p() && AndroidUtilities.isTablet()) {
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
                        this.e0[i29].d.s = topicKey.dialogId;
                    }
                    i29++;
                }
            } else {
                if (i10 == NotificationCenter.notificationsSettingsUpdated) {
                    g5(0, true);
                    return;
                }
                if (i10 == NotificationCenter.messageReceivedByAck || i10 == NotificationCenter.messageReceivedByServer || i10 == NotificationCenter.messageSendError) {
                    g5(MessagesController.UPDATE_MASK_SEND_STATE, true);
                    return;
                }
                if (i10 == NotificationCenter.didSetPasscode) {
                    w3();
                    return;
                }
                if (i10 == NotificationCenter.needReloadRecentDialogsSearch) {
                    nx nxVar = this.C0;
                    if (nxVar == null || (so0Var2 = nxVar.b0) == null || (i15 = so0Var2.h0) == 15) {
                        return;
                    }
                    int i30 = so0Var2.s0;
                    MessagesStorage.getInstance(i30).getStorageQueue().postRunnable(new hg.n(i30, i15, new hg.w(so0Var2), i18));
                    return;
                }
                if (i10 == NotificationCenter.replyMessagesDidLoad) {
                    g5(MessagesController.UPDATE_MASK_MESSAGE_TEXT, true);
                    return;
                }
                if (i10 == NotificationCenter.reloadHints) {
                    nx nxVar2 = this.C0;
                    if (nxVar2 == null || (so0Var = nxVar2.b0) == null) {
                        return;
                    }
                    so0Var.l();
                    return;
                }
                if (i10 == NotificationCenter.didUpdateConnectionState) {
                    int connectionState = AccountInstance.getInstance(i11).getConnectionsManager().getConnectionState();
                    if (this.d2 != connectionState) {
                        this.d2 = connectionState;
                        Y4(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDownloadingFilesChanged) {
                    Y4(true, false);
                    nx nxVar3 = this.C0;
                    if (nxVar3 != null) {
                        int currentPosition = nxVar3.getCurrentPosition();
                        org.telegram.ui.Components.zo0 zo0Var = nxVar3.T;
                        c5(zo0Var != null && zo0Var.h(currentPosition) == 2);
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
                    Runnable gaVar = new ei.ga(this, chat2, longValue3, z14, user, z10);
                    L3();
                    if (this.y0[0] == null) {
                        gaVar.run();
                        return;
                    }
                    if (ChatObject.isForum(chat2)) {
                        gaVar.run();
                        return;
                    }
                    UndoView W3 = W3();
                    if (W3 != null) {
                        W3.j(z14 ? 1 : 95, longValue3, gaVar);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.folderBecomeEmpty) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int i31 = this.W2;
                    if (i31 != intValue || i31 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i10 == NotificationCenter.dialogFiltersUpdated) {
                    U4(true, true);
                    return;
                }
                if (i10 == NotificationCenter.filterSettingsUpdated) {
                    H4();
                    return;
                }
                if (i10 == NotificationCenter.newSuggestionsAvailable) {
                    J4();
                    S4();
                    int checkEmailSuggestion = getMessagesController().checkEmailSuggestion();
                    if (checkEmailSuggestion != 0) {
                        ig0 ig0Var = new ig0();
                        uv uvVar = new uv(this, 6);
                        uv uvVar2 = new uv(this, i17);
                        boolean z15 = checkEmailSuggestion == 2;
                        ig0Var.F = 3;
                        ig0Var.a = 12;
                        ig0Var.d0 = uvVar;
                        ig0Var.e0 = uvVar2;
                        ig0Var.g0 = z15;
                        ig0Var.h0 = true;
                        presentFragment(ig0Var);
                        getMessagesController().markEmailSuggestionAsShown();
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.forceImportContactsStart) {
                    org.telegram.ui.Components.h20 h20Var2 = this.t0;
                    if (h20Var2 != null) {
                        h20Var2.f(true, true);
                    }
                    dy[] dyVarArr6 = this.e0;
                    if (dyVarArr6 != null) {
                        for (dy dyVar3 : dyVarArr6) {
                            lw lwVar = dyVar3.d;
                            lwVar.Q = false;
                            lwVar.e = true;
                            lwVar.l();
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.messagesDeleted) {
                    if (!this.q3 || this.C0 == null) {
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    long longValue4 = ((Long) objArr[1]).longValue();
                    nx nxVar4 = this.C0;
                    HashMap hashMap = nxVar4.z0;
                    SparseArray sparseArray = nxVar4.h;
                    int size2 = sparseArray.size();
                    for (int i32 = 0; i32 < size2; i32++) {
                        View view = (View) sparseArray.valueAt(i32);
                        if (view instanceof i10) {
                            ((i10) view).e(longValue4, arrayList3);
                        }
                    }
                    for (int i33 = 0; i33 < nxVar4.getChildCount(); i33++) {
                        if (nxVar4.getChildAt(i33) instanceof i10) {
                            ((i10) nxVar4.getChildAt(i33)).e(longValue4, arrayList3);
                        }
                    }
                    nxVar4.M0.e(longValue4, arrayList3);
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                    int i34 = 0;
                    while (i34 < arrayList4.size()) {
                        a10 a10Var = (a10) arrayList4.get(i34);
                        MessageObject messageObject = (MessageObject) hashMap.get(a10Var);
                        if (messageObject != null) {
                            long dialogId = messageObject.getDialogId();
                            if (dialogId < 0) {
                                i14 = (int) (-dialogId);
                                i13 = i18;
                            } else {
                                i13 = i18;
                            }
                            i14 = i13;
                            if (i14 == longValue4) {
                                for (int i35 = i13; i35 < arrayList3.size(); i35++) {
                                    if (messageObject.getId() == ((Integer) arrayList3.get(i35)).intValue()) {
                                        arrayList = new ArrayList();
                                        arrayList.add(a10Var);
                                    }
                                }
                            }
                        } else {
                            i13 = i18;
                        }
                        i34++;
                        i18 = i13;
                    }
                    int i36 = i18;
                    if (arrayList != null) {
                        int size3 = arrayList.size();
                        for (int i37 = i36; i37 < size3; i37++) {
                            hashMap.remove(arrayList.get(i37));
                        }
                        nxVar4.x0.a(hashMap.size(), true);
                        org.telegram.ui.ActionBar.u0 u0Var = nxVar4.C0;
                        if (u0Var != null) {
                            u0Var.setVisibility(hashMap.size() == 1 ? i36 : 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.didClearDatabase) {
                    if (this.e0 != null) {
                        int i38 = 0;
                        while (true) {
                            dy[] dyVarArr7 = this.e0;
                            if (i38 >= dyVarArr7.length) {
                                break;
                            }
                            hg.j jVar = dyVarArr7[i38].d.P;
                            if (jVar != null) {
                                jVar.a.clear();
                                jVar.b.clear();
                                jVar.c.clear();
                                jVar.d.clear();
                                AndroidUtilities.cancelRunOnUIThread(jVar.e);
                            }
                            i38++;
                        }
                    }
                    ca1 ca1Var = ca1.b;
                    if (ca1Var != null) {
                        ca1Var.dismiss();
                        ca1.b = null;
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
                    org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
                    if (h5Var == null || h5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                if (i10 == NotificationCenter.communityPendingRequestsUpdate) {
                    if (this.Y2 == ((Long) objArr[0]).longValue()) {
                        o3(true);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseMigration) {
                    boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                    if (this.fragmentView != null) {
                        if (!booleanValue4) {
                            qu quVar = this.R3;
                            if (quVar == null || quVar.getTag() == null) {
                                return;
                            }
                            qu quVar2 = this.R3;
                            quVar2.animate().setListener(null).cancel();
                            quVar2.animate().setListener(new org.telegram.ui.Components.ql0(i17, this, quVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                            this.R3.setTag(null);
                            return;
                        }
                        if (this.R3 == null) {
                            Context context = this.fragmentView.getContext();
                            qu quVar3 = new qu(context);
                            LinearLayout e = org.telegram.messenger.sl.e(context, 1);
                            org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
                            bk0Var.f(R.raw.db_migration_placeholder, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                            bk0Var.getAnimatedDrawable().K(1);
                            bk0Var.d();
                            e.addView(bk0Var, w7.z5.q(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1));
                            TextView textView = new TextView(context);
                            textView.setTextSize(1, 24.0f);
                            textView.setText(LocaleController.getString(R.string.OptimizingTelegram));
                            int i39 = org.telegram.ui.ActionBar.k6.G6;
                            org.telegram.ui.ActionBar.r6.W(textView, i39, null);
                            textView.setGravity(1);
                            TextView f7 = org.telegram.messenger.sl.f(e, textView, w7.z5.p(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                            f7.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                            f7.setTextSize(1, 14.0f);
                            f7.setText(LocaleController.getString(R.string.OptimizingTelegramDescription1));
                            org.telegram.ui.ActionBar.r6.W(f7, i39, null);
                            f7.setGravity(1);
                            TextView f10 = org.telegram.messenger.sl.f(e, f7, w7.z5.p(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                            f10.setTextSize(1, 14.0f);
                            f10.setText(LocaleController.getString(R.string.OptimizingTelegramDescription2));
                            org.telegram.ui.ActionBar.r6.W(f10, i39, null);
                            f10.setGravity(1);
                            e.addView(f10, w7.z5.p(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                            quVar3.addView(e, w7.z5.e(-1, -2, 16));
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, quVar3, null);
                            quVar3.setOnTouchListener(new pu());
                            this.R3 = quVar3;
                            quVar3.setAlpha(0.0f);
                            ((wx) this.fragmentView).addView(this.R3);
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
                        ca1.n(this);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.userEmojiStatusUpdated) {
                    d5((TLRPC.User) objArr[0], true);
                    return;
                }
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    d5(UserConfig.getInstance(i11).getCurrentUser(), true);
                    e5();
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseReset) {
                    zArr[this.currentAccount] = false;
                    g4(getAccountInstance());
                    getMessagesController().loadPinnedDialogs(this.W2, 0L, null);
                    return;
                }
                if (i10 == NotificationCenter.chatlistFolderUpdate) {
                    int intValue2 = ((Integer) objArr[0]).intValue();
                    int i40 = 0;
                    while (true) {
                        dy[] dyVarArr8 = this.e0;
                        if (i40 >= dyVarArr8.length) {
                            return;
                        }
                        dy dyVar4 = dyVarArr8[i40];
                        if (dyVar4 != null && (((i12 = dyVar4.s) == 7 || i12 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[dyVar4.s - 7]) != null && intValue2 == dialogFilter.id)) {
                            dyVar4.q(true);
                            return;
                        }
                        i40++;
                    }
                } else {
                    if (i10 != NotificationCenter.dialogTranslate) {
                        if (i10 == NotificationCenter.storiesUpdated) {
                            f5(this.V);
                            g5(0, true);
                            return;
                        }
                        if (i10 == NotificationCenter.storiesEnabledUpdate) {
                            e5();
                            return;
                        }
                        if (i10 == NotificationCenter.unconfirmedAuthUpdate) {
                            S4();
                            return;
                        }
                        if (i10 == NotificationCenter.premiumPromoUpdated) {
                            S4();
                            return;
                        }
                        if (i10 == NotificationCenter.starBalanceUpdated || i10 == NotificationCenter.starSubscriptionsLoaded) {
                            S4();
                            return;
                        } else if (i10 == NotificationCenter.appConfigUpdated) {
                            S4();
                            return;
                        } else {
                            if (i10 == NotificationCenter.activeAuctionsUpdated) {
                                S4();
                                return;
                            }
                            return;
                        }
                    }
                    long longValue6 = ((Long) objArr[0]).longValue();
                    int i41 = 0;
                    while (true) {
                        dy[] dyVarArr9 = this.e0;
                        if (i41 >= dyVarArr9.length) {
                            return;
                        }
                        dy dyVar5 = dyVarArr9[i41];
                        if (dyVar5.a != null) {
                            int i42 = 0;
                            while (true) {
                                if (i42 < dyVar5.a.getChildCount()) {
                                    View childAt2 = dyVar5.a.getChildAt(i42);
                                    if (childAt2 instanceof org.telegram.ui.Cells.q2) {
                                        org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) childAt2;
                                        if (longValue6 == q2Var.getDialogId()) {
                                            q2Var.t();
                                            break;
                                        }
                                    }
                                    i42++;
                                }
                            }
                        }
                        i41++;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof gi.d3) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e3(long j10, View view) {
        if (this.l2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.q2) {
                ((org.telegram.ui.Cells.q2) view).U(false, true);
            } else if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.q2) {
            ((org.telegram.ui.Cells.q2) view).U(true, true);
        } else if (view instanceof org.telegram.ui.Cells.i6) {
            ((org.telegram.ui.Cells.i6) view).s(true, true);
        }
        return true;
    }

    public final boolean e4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i10 = this.e0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        return dialogFilter != null ? dialogFilter.pinnedDialogs.indexOfKey(dialog.id) >= 0 : dialog.pinned;
    }

    public final void e5() {
        ei.x3 x3Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.O3 != storiesEnabled) {
            W4();
            if (!this.O3 && storiesEnabled && (x3Var = this.p0) != null) {
                x3Var.u();
            }
            this.O3 = storiesEnabled;
        }
        org.telegram.ui.Components.h20 h20Var = this.t0;
        if (h20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            h20Var.setImageResource(R.drawable.floating_check);
            this.t0.setContentDescription(LocaleController.getString(R.string.Done));
        } else {
            h20Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
        }
    }

    public final void f3(hg.o0 o0Var) {
        nx nxVar;
        if (!this.q3 || (nxVar = this.C0) == null) {
            return;
        }
        ArrayList arrayList = nxVar.A0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (o0Var.b((hg.o0) arrayList.get(i10))) {
                    return;
                }
            }
        }
        arrayList.add(o0Var);
        tx txVar = this.X;
        txVar.F.add(o0Var);
        txVar.I = r1.size() - 1;
        txVar.e();
        this.X.r.getText().clear();
        V4(true, null, null, false, true);
    }

    public final boolean f4() {
        return this.C2 == null && this.n2 == null;
    }

    public final void f5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        ci.h7 V3;
        ArrayList arrayList;
        if (this.E0 == null || this.I != null) {
            return;
        }
        yw ywVar = this.G3;
        if ((ywVar != null && ywVar.c()) || this.q3 || (kVar = this.actionBar) == null || kVar.s() || this.l2) {
            return;
        }
        ei.vb vbVar = ei.vb.F2;
        int i10 = 0;
        if ((vbVar != null && vbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
            z10 = false;
        }
        int i11 = 1;
        boolean z12 = !c4() && V3().G();
        if (this.Y2 != 0) {
            z11 = false;
        } else if (c4()) {
            z11 = !V3().h.isEmpty();
        } else {
            z11 = !z12 && (((arrayList = (V3 = V3()).g) != null && arrayList.size() > 0) || V3.H());
            z12 = V3().G();
        }
        this.L = z12;
        boolean z13 = this.G0;
        boolean z14 = z12 || z11;
        this.G0 = z14;
        if (z11 || z14) {
            this.E0.q(z10, z14 != z13);
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
                ofFloat.addUpdateListener(new ui(i11, this));
                this.J.addListener(new org.telegram.ui.Components.p31(this, 24));
                this.J.setDuration(200L);
                this.J.setInterpolator(org.telegram.ui.Components.bs.f);
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
            float R3 = z11 ? 0.0f : R3();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I = ofFloat2;
            ofFloat2.addUpdateListener(new mx(this, f7, z11, R3));
            this.I.addListener(new ex(this, z11, i12));
            this.I.setDuration(200L);
            this.I.setInterpolator(org.telegram.ui.Components.bs.f);
            this.I.start();
            return;
        }
        this.K = z11;
        vw vwVar = this.E0;
        if ((z11 || this.L) && !isInPreviewMode()) {
            i13 = 0;
        }
        vwVar.setVisibility(i13);
        if (z11) {
            this.y3 = -AndroidUtilities.dp(81.0f);
            A4(-R3());
        } else {
            A4(0.0f);
        }
        while (true) {
            dy[] dyVarArr = this.e0;
            if (i10 >= dyVarArr.length) {
                break;
            }
            dy dyVar = dyVarArr[i10];
            if (dyVar != null) {
                dyVar.a.requestLayout();
            }
            i10++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.j80 j80Var = this.L0;
        if (j80Var != null) {
            j80Var.u();
        }
    }

    public final void g3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 33 && uj0.n(parentActivity)) {
            if (z10) {
                showDialog(new uj0(parentActivity, !org.telegram.ui.Components.af0.a(), new sv(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.f5.w(parentActivity, new mv(this, 1)).a;
                this.T1 = c2Var;
                showDialog(c2Var);
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
            H4();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g5(int i10, boolean z10) {
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
                nx nxVar = this.C0;
                recyclerView = nxVar != null ? nxVar.V : null;
            } else {
                dy[] dyVarArr = this.e0;
                if (dyVarArr != null) {
                    zx zxVar = i13 < dyVarArr.length ? dyVarArr[i13].a : null;
                    if (zxVar == null || dyVarArr[i13].getVisibility() == 0) {
                        r5 = zxVar != null ? this.e0[i13] : null;
                        recyclerView = zxVar;
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
                        boolean z11 = childAt instanceof org.telegram.ui.Cells.q2;
                        ArrayList arrayList = this.I2;
                        if (z11 && (this.C0 == null || recyclerView.getAdapter() != this.C0.b0)) {
                            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) childAt;
                            if ((MessagesController.UPDATE_MASK_REORDER & i10) != 0) {
                                q2Var.S(this.actionBar.s(), true);
                                i11 = this.S1 ? i11 + 1 : 0;
                            }
                            if ((MessagesController.UPDATE_MASK_CHECK & i10) != 0) {
                                q2Var.U(false, (MessagesController.UPDATE_MASK_CHAT & i10) != 0);
                            } else {
                                if ((MessagesController.UPDATE_MASK_SELECT_DIALOG & i10) == 0) {
                                    if (q2Var.a0(i10, z10)) {
                                        r5.q(false);
                                        break;
                                    }
                                } else if (this.e0[i13].p() && AndroidUtilities.isTablet()) {
                                    q2Var.setDialogSelected(q2Var.getDialogId() == this.p2.dialogId);
                                }
                                if (arrayList != null) {
                                    q2Var.U(arrayList.contains(Long.valueOf(q2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.wa)) {
                                    ((org.telegram.ui.Cells.wa) childAt).i(i10);
                                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                                    i6Var.u(i10);
                                    if (arrayList != null) {
                                        i6Var.s(arrayList.contains(Long.valueOf(i6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.S1 && (childAt instanceof org.telegram.ui.Components.mm0)) {
                                    org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) childAt;
                                    childCount = mm0Var.getChildCount();
                                    for (i12 = 0; i12 < childCount; i12++) {
                                        View childAt2 = mm0Var.getChildAt(i12);
                                        if (childAt2 instanceof org.telegram.ui.Cells.m4) {
                                            ((org.telegram.ui.Cells.m4) childAt2).b(i10);
                                        }
                                    }
                                }
                            }
                        }
                        if (!(childAt instanceof org.telegram.ui.Cells.wa)) {
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

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.c5 getBackButtonState() {
        return (c4() || this.G3.f) ? org.telegram.ui.ActionBar.c5.a : org.telegram.ui.ActionBar.c5.b;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.a4 = ofFloat;
            return ofFloat;
        }
        int clamp = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.a4 = ofFloat2;
        ofFloat2.addUpdateListener(new gv(this, 2));
        this.a4.setInterpolator(org.telegram.ui.Components.bs.g);
        this.a4.setDuration(clamp);
        this.a4.start();
        return this.a4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0230 A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.t8));
        }
        if (this.W2 == 0) {
            nx nxVar = this.C0;
            if (nxVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(nxVar.V, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.k6.s1}, (org.telegram.ui.ActionBar.s6) null, !this.W ? org.telegram.ui.ActionBar.k6.A8 : org.telegram.ui.ActionBar.k6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        } else {
            nx nxVar2 = this.C0;
            if (nxVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(nxVar2.V, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.k6.s1}, (org.telegram.ui.ActionBar.s6) null, !this.W ? org.telegram.ui.ActionBar.k6.P8 : org.telegram.ui.ActionBar.k6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.R8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_21, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.x8));
        NumberTextView numberTextView = this.h1;
        int i10 = org.telegram.ui.ActionBar.k6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        if (this.z0 != null) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar == null || !kVar.s()) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0, 0, new Class[]{org.telegram.ui.Components.s00.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.q00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.q00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0.getTabsContainer(), 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0, 0, new Class[]{org.telegram.ui.Components.s00.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Gh));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.q00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fh));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.q00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Eh));
            }
        }
        arrayList.addAll(w7.c6.a(new i6(7, this), org.telegram.ui.ActionBar.k6.w8, i10));
        int i11 = 0;
        while (i11 < 3) {
            if (i11 == 2) {
                nx nxVar3 = this.C0;
                if (nxVar3 == null) {
                    i11++;
                } else {
                    view = nxVar3.V;
                    view2 = view;
                    if (view2 == null) {
                        arrayList.add(new org.telegram.ui.ActionBar.t6(view2, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i6));
                        arrayList.add(new org.telegram.ui.ActionBar.t6(view2, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
                        int i12 = org.telegram.ui.Cells.u3.h;
                        arrayList.add(new org.telegram.ui.ActionBar.t6(view2, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.o6));
                    }
                    i11++;
                }
            } else {
                dy[] dyVarArr = this.e0;
                if (dyVarArr == null) {
                    i11++;
                } else {
                    view = i11 < dyVarArr.length ? dyVarArr[i11].a : null;
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
                dy[] dyVarArr2 = this.e0;
                if (i13 >= dyVarArr2.length) {
                    break;
                }
                if (this.W2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.t6(dyVarArr2[i13].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.t6(dyVarArr2[i13].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                }
                int i14 = SharedConfig.PASSCODE_TYPE_PIN;
                int i15 = org.telegram.ui.ActionBar.k6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.e0[i13].a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.e0[i13].a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.e0[i13].w, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
                this.e0[i13].d.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                i13++;
            }
        }
        int i16 = 0;
        while (true) {
            UndoView[] undoViewArr = this.y0;
            if (i16 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(undoViewArr[i16], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fi));
            i16++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.o5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.q7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Si));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ah));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ch));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.dh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.eh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.fh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ih));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.jh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.kh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.hh));
        hg.q0 q0Var = this.b0;
        if (q0Var != null) {
            arrayList.addAll(q0Var.getThemeDescriptions());
            this.b0.updateColors();
        }
        gy gyVar = this.h0;
        if (gyVar != null) {
            gyVar.updateColors();
            this.h0.invalidate();
        }
        nx nxVar4 = this.C0;
        if (nxVar4 != null) {
            org.telegram.ui.Components.mo0 mo0Var = nxVar4.W;
            SparseArray sparseArray = nxVar4.h;
            ai.u1 u1Var = nxVar4.V;
            for (int i17 = 0; i17 < u1Var.getChildCount(); i17++) {
                View childAt = u1Var.getChildAt(i17);
                if ((childAt instanceof org.telegram.ui.Cells.i6) || (childAt instanceof org.telegram.ui.Cells.q2) || (childAt instanceof org.telegram.ui.Cells.k4)) {
                    arrayList.add(new org.telegram.ui.ActionBar.t6(childAt, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                }
            }
            for (int i18 = 0; i18 < nxVar4.getChildCount(); i18++) {
                if (nxVar4.getChildAt(i18) instanceof i10) {
                    arrayList.addAll(((i10) nxVar4.getChildAt(i18)).getThemeDescriptions());
                }
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view3 = (View) sparseArray.valueAt(i19);
                if (view3 instanceof i10) {
                    arrayList.addAll(((i10) view3).getThemeDescriptions());
                }
            }
            i10 i10Var = nxVar4.M0;
            if (i10Var != null) {
                arrayList.addAll(i10Var.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(mo0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6(mo0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y6));
            arrayList.addAll(w7.c6.a(new org.telegram.ui.Components.z6(nxVar4, 4), org.telegram.ui.ActionBar.k6.y8));
        }
        org.telegram.ui.Cells.y2 y2Var = this.M1;
        int i20 = 5;
        if (y2Var != null) {
            arrayList.addAll(w7.c6.a(new org.telegram.ui.Components.z6(new ti(y2Var, 20), i20), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.y6));
        }
        org.telegram.ui.Cells.ta taVar = this.N1;
        if (taVar != null) {
            arrayList.addAll(w7.c6.a(new org.telegram.ui.Components.z6(new ti(taVar, 21), i20), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.y6, org.telegram.ui.ActionBar.k6.I6, org.telegram.ui.ActionBar.k6.q7));
        }
        org.telegram.ui.Cells.m mVar = this.L1;
        if (mVar != null) {
            arrayList.addAll(w7.c6.a(new org.telegram.ui.Components.z6(new ti(mVar, 22), i20), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.y6, org.telegram.ui.ActionBar.k6.I6, org.telegram.ui.ActionBar.k6.q7));
        }
        return arrayList;
    }

    public final void h3(CharSequence charSequence) {
        if (this.B1 == null) {
            return;
        }
        if (this.D2 == null && this.E2 == null && this.F2 == null) {
            return;
        }
        if (this.G2 == null) {
            org.telegram.ui.Components.nr0 nr0Var = new org.telegram.ui.Components.nr0(getParentActivity(), getResourceProvider());
            this.G2 = nr0Var;
            int i10 = 0;
            nr0Var.setLayoutClickListener(new iv(this, i10));
            this.G2.setOnModeChangeListener(new jv(this, i10));
            ow owVar = this.B1;
            org.telegram.ui.Components.nr0 nr0Var2 = this.G2;
            if (nr0Var2 == null) {
                owVar.getClass();
            } else {
                owVar.G1 = nr0Var2;
                owVar.addView(nr0Var2, 0, w7.z5.e(-1, 48, 51));
                owVar.g3 = false;
                owVar.K();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
            layoutParams.rightMargin = -this.B1.getPaddingRight();
            this.G2.setLayoutParams(layoutParams);
        }
        if (Y3()) {
            this.G2.i(this.currentAccount, this.D2);
        } else {
            String str = this.E2;
            if (str != null) {
                org.telegram.ui.Components.nr0 nr0Var3 = this.G2;
                nr0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    nr0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.F2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.nr0 nr0Var4 = this.G2;
                    nr0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        nr0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.B1.setFieldText(charSequence);
        }
        this.B1.setOverrideHint(LocaleController.getString(Y3() ? R.string.AddCaption : R.string.ShareComment));
        t3();
        if (this.G2.getMode() != 0) {
            this.B1.u1(false, false);
        }
        b5();
    }

    public final void h4(long j10) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
        int i10 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList<TLRPC.Dialog> dialogsByCommunity = getMessagesController().getDialogsByCommunity(dialog.community_id);
            if (dialogsByCommunity != null) {
                int size = dialogsByCommunity.size();
                while (i10 < size) {
                    TLRPC.Dialog dialog2 = dialogsByCommunity.get(i10);
                    i10++;
                    h4(dialog2.id);
                }
                return;
            }
            return;
        }
        int i11 = this.e0[0].s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        this.z3 = 2;
        int i12 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            y4(true, true);
            m3();
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
                    y4(false, false);
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

    public final boolean h5(long j10) {
        TLRPC.Chat chat;
        ow owVar;
        if ((this.S0 <= 1 && ((owVar = this.B1) == null || owVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.f5.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i3() {
        bh.f fVar;
        gh.d dVar;
        gh.d dVar2;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.l4) == null || this.fragmentView == null || this.actionBar == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.g4) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        int dp3 = AndroidUtilities.dp(this.K ? 81.0f : 0.0f) + AndroidUtilities.dp(48.0f) + this.actionBar.getMeasuredHeight();
        cw cwVar = this.z0;
        boolean z10 = false;
        int measuredHeight2 = dp3 + ((cwVar == null || cwVar.getVisibility() != 0) ? 0 : this.z0.getMeasuredHeight());
        org.telegram.ui.Components.us usVar = this.J1;
        int sumHeightOfAllVisibleChild = measuredHeight2 + ((usVar == null || usVar.getVisibility() != 0) ? 0 : this.J1.getSumHeightOfAllVisibleChild()) + ((int) this.N);
        int measuredHeight3 = this.actionBar.getMeasuredHeight();
        this.v4.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), AndroidUtilities.lerp(sumHeightOfAllVisibleChild, AndroidUtilities.dp(30.0f) + measuredHeight3 + (this.Z != null ? r9.getMeasuredHeight() : 0), this.b.e) + dp);
        boolean z11 = this.W;
        RectF rectF = this.w4;
        if (!z11) {
            if (this.B1 != null && this.y1 != null) {
                rectF.set(0.0f, this.fragmentView.getMeasuredHeight() - j3(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
            }
            fVar.g(z10 ? 2 : 1, this.u4);
            fVar.e(this.t4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar = this.m4;
            if (dVar != null) {
                dVar.j(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar.l();
            }
            dVar2 = this.n4;
            if (dVar2 == null) {
                dVar2.j(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar2.l();
                return;
            }
            return;
        }
        rectF.set(0.0f, dp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        z10 = true;
        fVar.g(z10 ? 2 : 1, this.u4);
        fVar.e(this.t4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        dVar = this.m4;
        if (dVar != null) {
        }
        dVar2 = this.n4;
        if (dVar2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (org.telegram.messenger.ChatObject.getPublicUsername(r6) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i4(TLRPC.Chat chat, TLRPC.User user) {
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        yw ywVar;
        return (this.j2 || (ywVar = this.G3) == null || ywVar.getFragment() == null) ? i0.a.h(getThemedColor(org.telegram.ui.ActionBar.k6.d6)) > 0.699999988079071d : this.G3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int j3() {
        if (this.B1 != null) {
            return (int) (this.y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        }
        if (this.Y2 == 0) {
            return this.g4 + this.i4;
        }
        return AndroidUtilities.dp(72.0f) + this.g4;
    }

    public final boolean j4(TLRPC.User user) {
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

    public final boolean k3() {
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

    public final void k4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        int i10 = 1;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.g6) null, false);
        h3Var.fixNavigationBar();
        boolean z10 = getMessagesStorage().getArchiveUnreadCount() != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, SharedConfig.archiveHidden ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? LocaleController.getString(R.string.MarkAllAsRead) : null, LocaleController.getString(SharedConfig.archiveHidden ? R.string.PinInTheList : R.string.HideAboveTheList)};
        o4 o4Var = new o4(this, i10);
        h3Var.items = charSequenceArr;
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = o4Var;
        showDialog(h3Var);
    }

    public final void l3() {
        int themedColor;
        org.telegram.ui.Components.xh0 xh0Var;
        kw kwVar;
        org.telegram.ui.Components.so0 so0Var;
        xa1 xa1Var;
        nx nxVar = this.C0;
        if (nxVar != null && (so0Var = nxVar.b0) != null && (xa1Var = so0Var.k0) != null) {
            int childCount = xa1Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = xa1Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.m4) {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) childAt;
                    org.telegram.ui.Components.h9 h9Var = m4Var.c;
                    int i11 = m4Var.h;
                    if (DialogObject.isUserDialog(m4Var.f)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(m4Var.f));
                        m4Var.e = user;
                        h9Var.m(i11, user);
                    } else {
                        h9Var.k(i11, MessagesController.getInstance(i11).getChat(Long.valueOf(-m4Var.f)));
                        m4Var.e = null;
                    }
                    m4Var.c(true);
                }
            }
        }
        if (this.e0 != null) {
            int i12 = 0;
            while (true) {
                dy[] dyVarArr = this.e0;
                if (i12 >= dyVarArr.length) {
                    break;
                }
                dy dyVar = dyVarArr[i12];
                if (dyVar != null && (kwVar = dyVar.n) != null) {
                    kwVar.i();
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.C(getThemedColor(org.telegram.ui.ActionBar.k6.G8), true);
            this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false, true);
            this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true, true);
            this.actionBar.E(getThemedColor(org.telegram.ui.ActionBar.k6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.E3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.zh);
            Drawable drawable = this.L3;
            if (drawable != null && themedColor2 != this.y4) {
                this.y4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.p5 p5Var = this.E3;
            if (p5Var != null) {
                p5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.y2 y2Var = this.M1;
        if (y2Var != null) {
            org.telegram.ui.ActionBar.k6.E1(y2Var.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false), true);
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var != null) {
            u0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.k6.v8));
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.updateColors();
        }
        cw cwVar = this.z0;
        if (cwVar != null) {
            dh.d dVar = cwVar.y0;
            if (dVar != null) {
                dVar.updateColors();
            }
            cwVar.invalidate();
        }
        hg.q0 q0Var = this.b0;
        if (q0Var != null) {
            q0Var.updateColors();
        }
        nx nxVar2 = this.C0;
        if (nxVar2 != null && (xh0Var = nxVar2.p0) != null) {
            xh0Var.c();
        }
        org.telegram.ui.Components.k91 k91Var = this.a0;
        if (k91Var != null) {
            k91Var.updateColors();
        }
        m31 m31Var = this.Z;
        if (m31Var != null) {
            m31Var.updateColors();
        }
        if (this.K0 != null) {
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.d6), 100);
            if (!(this.K0.getForeground() instanceof ColorDrawable)) {
                this.K0.setForeground(new ColorDrawable(o10));
            } else if (((ColorDrawable) this.K0.getForeground()).getColor() != o10) {
                ((ColorDrawable) this.K0.getForeground()).setColor(o10);
            }
        }
        org.telegram.ui.Components.h20 h20Var = this.t0;
        if (h20Var != null) {
            h20Var.updateColors();
        }
        org.telegram.ui.Components.h20 h20Var2 = this.u0;
        if (h20Var2 != null) {
            h20Var2.updateColors();
        }
        int i13 = org.telegram.ui.ActionBar.k6.d6;
        this.o4.a(getThemedColor(i13));
        org.telegram.ui.Components.us usVar = this.J1;
        if (usVar != null) {
            usVar.updateColors();
        }
        org.telegram.ui.Components.ts tsVar = this.K1;
        if (tsVar != null) {
            tsVar.setColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        }
        nw nwVar = this.H1;
        if (nwVar != null) {
            nwVar.updateColors();
        }
        nw nwVar2 = this.F1;
        if (nwVar2 != null) {
            nwVar2.updateColors();
        }
        Z4();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        vw vwVar = this.E0;
        if (vwVar != null) {
            vwVar.p();
        }
        if (this.D3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.gl)) != this.x4) {
            this.x4 = themedColor;
            this.D3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        tx txVar = this.X;
        if (txVar != null) {
            txVar.updateColors();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04a5  */
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
    public final void l4(View view, int i10, s4.g0 g0Var) {
        s4.g0 g0Var2;
        long j10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        MessageObject messageObject;
        long j11;
        long j12;
        org.telegram.ui.Components.so0 so0Var;
        yw ywVar;
        long j13;
        long j14;
        int i14;
        MessageObject messageObject2;
        long makeEncryptedDialogId;
        long j15;
        long j16;
        nx nxVar;
        TLRPC.Document greetingsSticker;
        boolean z11;
        nx nxVar2;
        int i15;
        Object J;
        long j17;
        long j18;
        int i16;
        if (getParentActivity() == null) {
            return;
        }
        boolean z12 = g0Var instanceof hg.m;
        if (z12) {
            hg.m mVar = (hg.m) g0Var;
            int i17 = mVar.h;
            if (i17 == 7 || i17 == 8) {
                MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i17 == 7 ? (char) 0 : (char) 1];
                if (dialogFilter != null) {
                    i15 = dialogFilter.id;
                    J = mVar.J(i10);
                    if (this.C2 == null && mVar.n && g0Var.j(i10) == 21) {
                        this.C2.J(this);
                        return;
                    }
                    if (J instanceof TLRPC.User) {
                        if (J instanceof TLRPC.Chat) {
                            j18 = ((TLRPC.Chat) J).id;
                        } else if (J instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                            i16 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.t(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new ey(bundle));
                                return;
                            }
                            j17 = dialog.id;
                            if (this.actionBar.t(null)) {
                                K4(j17, view);
                                return;
                            }
                            g0Var2 = g0Var;
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
                                    showDialog(new org.telegram.ui.Components.ty0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) J;
                            g0Var2 = g0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!ChatObject.isChannel(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.b90(getParentActivity(), chatInvite, str, this, null));
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
                    g0Var2 = g0Var;
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
            J = mVar.J(i10);
            if (this.C2 == null) {
            }
            if (J instanceof TLRPC.User) {
            }
            g0Var2 = g0Var;
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
            g0Var2 = g0Var;
            nx nxVar3 = this.C0;
            if (nxVar3 == null || g0Var2 != (so0Var = nxVar3.b0)) {
                j10 = 0;
                z10 = false;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                messageObject = null;
                j11 = 0;
                j12 = 0;
            } else {
                Object I = so0Var.I(i10);
                z10 = this.C0.b0.N(i10);
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
                        nx nxVar4 = this.C0;
                        if (nxVar4 != null) {
                            org.telegram.ui.Components.so0 so0Var2 = nxVar4.b0;
                            so0Var2.j0.a(so0Var2.Z);
                        }
                        i14 = id2;
                        j13 = dialogId;
                    } else {
                        j10 = 0;
                        if (I instanceof String) {
                            String str2 = (String) I;
                            nx nxVar5 = this.C0;
                            if (nxVar5 != null && !nxVar5.b0.J.isEmpty()) {
                                this.X.r.setText(str2);
                                this.X.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                rj0 rj0Var = new rj0(getParentActivity(), this);
                                rj0Var.x(str2, true);
                                rj0Var.show();
                            }
                        } else if (I instanceof ContactsController.Contact) {
                            ContactsController.Contact contact = (ContactsController.Contact) I;
                            org.telegram.ui.Components.f5.v(this, contact.first_name, contact.last_name, contact.phones.get(0));
                        } else if ((I instanceof TLRPC.TL_forumTopic) && (ywVar = this.G3) != null && (ywVar.getFragment() instanceof ye1)) {
                            j13 = -((ye1) this.G3.getFragment()).a;
                            j14 = ((TLRPC.TL_forumTopic) I).id;
                            i14 = 0;
                            messageObject2 = null;
                        }
                        i14 = 0;
                        messageObject2 = null;
                        j14 = 0;
                        j13 = 0;
                    }
                    if (j13 == j10 && this.actionBar.s()) {
                        if (this.actionBar.t("search_dialogs_action_mode") && i14 == 0 && !z10) {
                            K4(j13, view);
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
            if (h5(j12)) {
                if ((!getMessagesController().isForum(j12) && !getMessagesController().isCommunity(j12)) || d4(j12)) {
                    ArrayList arrayList = this.I2;
                    if (!arrayList.isEmpty() || (this.R0 == 3 && this.f2 != null)) {
                        if (arrayList.contains(Long.valueOf(j12)) || n3(j12)) {
                            boolean e32 = e3(j12, view);
                            nx nxVar6 = this.C0;
                            if (nxVar6 != null && g0Var2 == nxVar6.b0) {
                                this.actionBar.g(true);
                                N3(j12, e32);
                            }
                            a5();
                            return;
                        }
                        return;
                    }
                }
                if (this.m2 && getMessagesController().isCommunity(j12)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j12);
                    ey eyVar = new ey(bundle2);
                    eyVar.X2 = this;
                    eyVar.C2 = this.C2;
                    presentFragment(eyVar);
                    return;
                }
                if (!this.m2 || ((!getMessagesController().isForum(j12) || d4(j12)) && !getMessagesController().isMonoForumWithManageRights(j12))) {
                    M3(j12, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j12);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.R0 == 1);
                bundle3.putBoolean("quote", this.O0);
                bundle3.putBoolean("reply_to", this.N0);
                ye1 ye1Var = new ye1(bundle3);
                ye1Var.L0 = this;
                presentFragment(ye1Var);
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
                            nx nxVar7 = this.C0;
                            if (nxVar7 != null) {
                                nxVar7.b0.Q(this.W1, tLObject);
                            }
                            this.X1 = null;
                        }
                    } else {
                        H3();
                    }
                    boolean z13 = LocaleController.isRTL && !this.j2 && (!AndroidUtilities.isTablet() || i11 == 0) && LiteMode.isEnabled(64) && this.Y2 == j10;
                    bundle4.putInt("dialog_folder_id", i11);
                    bundle4.putInt("dialog_filter_id", i13);
                    if (!AndroidUtilities.isTablet() && ((!getMessagesController().isForum(j12) || !z13) && this.p2.dialogId == j12 && ((nxVar2 = this.C0) == null || g0Var2 != nxVar2.b0))) {
                        if (getParentActivity() instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                            List fragmentStack = launchActivity.s0.getFragmentStack();
                            if (fragmentStack.isEmpty()) {
                                return;
                            }
                            if (fragmentStack.size() == 1 && (si.o0.g(1, fragmentStack) instanceof sn)) {
                                ((sn) si.o0.g(1, fragmentStack)).Z9();
                                return;
                            }
                            if (fragmentStack.size() == 2) {
                                launchActivity.s0.l(true, false);
                                return;
                            } else {
                                if (getParentActivity() instanceof LaunchActivity) {
                                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(0);
                                    fragmentStack.clear();
                                    fragmentStack.add(o2Var);
                                    launchActivity.s0.V(true, true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    nxVar = this.C0;
                    if (nxVar != null && nxVar.y0) {
                        nxVar.P(false);
                    }
                    if (j12 != getUserConfig().getClientUserId() && getMessagesController().savedViewAsChats) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                        bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                        bundle5.putInt("start_from", 11);
                        if (this.D0 == null) {
                            this.D0 = new org.telegram.ui.Components.pv0(this);
                        }
                        presentFragment(new org.telegram.ui.Components.xa0(bundle5, this.D0));
                        return;
                    }
                    if (this.n2 != null) {
                        if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            sn snVar = new sn(bundle4);
                            b4(snVar, messageObject);
                            presentFragment(snVar);
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
                        int b10 = (this.Y2 == j10 || chat5 == null) ? 0 : hi.t0.b(this.currentAccount, -chat5.id);
                        if (b10 == 3) {
                            showDialog(new org.telegram.ui.Components.b90(getParentActivity(), chat5, null, this, this.resourceProvider));
                            return;
                        }
                        int i18 = 4;
                        if (b10 == 4) {
                            org.telegram.messenger.v0.p(isChannelAndNotMegaGroup ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, org.telegram.ui.Components.xc.a0(this), R.raw.e_hand_2, 36);
                            return;
                        }
                        if (chat5 == null || !(((z11 = chat5.monoforum) || chat5.forum) && j15 == j10)) {
                            if (ChatObject.isCommunity(chat5)) {
                                Bundle bundle6 = new Bundle();
                                bundle6.putLong("community_id", chat5.id);
                                presentFragment(new ey(bundle6));
                                return;
                            }
                            sn snVar2 = new sn(bundle4);
                            if (j15 != j10) {
                                og.d.a(snVar2, MessagesStorage.TopicKey.of(j12, j15));
                            }
                            if (z12 && DialogObject.isUserDialog(j12) && getMessagesController().dialogs_dict.f(j12) == null && (greetingsSticker = getMediaDataController().getGreetingsSticker()) != null) {
                                snVar2.N9 = greetingsSticker;
                                snVar2.O9 = true;
                            }
                            if (AndroidUtilities.isTablet()) {
                                yw ywVar2 = this.G3;
                                if (ywVar2.a != null) {
                                    ywVar2.a();
                                }
                            }
                            b4(snVar2, messageObject);
                            presentFragment(snVar2);
                            return;
                        }
                        if (z11) {
                            bundle4.putInt("chatMode", 8);
                            bundle4.putBoolean("isSubscriberSuggestions", !ChatObject.canManageMonoForum(this.currentAccount, chat5));
                            sn snVar3 = new sn(bundle4);
                            b4(snVar3, messageObject);
                            presentFragment(snVar3);
                            return;
                        }
                        if (ChatObject.areTabsEnabled(chat5)) {
                            sn snVar4 = new sn(bundle4);
                            og.d.a(snVar4, MessagesStorage.TopicKey.of(-chat5.id, getMessagesController().getForumLastTopicId(chat5.id)));
                            presentFragment(snVar4);
                            return;
                        }
                        if (!LiteMode.isEnabled(64) || this.Y2 != j10) {
                            if (!z14) {
                                presentFragment(new ye1(bundle4));
                                return;
                            }
                            sn snVar5 = new sn(bundle4);
                            b4(snVar5, messageObject);
                            presentFragment(snVar5);
                            return;
                        }
                        if (!z13) {
                            if (!z14) {
                                presentFragment(new ye1(bundle4));
                                return;
                            }
                            sn snVar6 = new sn(bundle4);
                            b4(snVar6, messageObject);
                            presentFragment(snVar6);
                            return;
                        }
                        if (this.j2) {
                            return;
                        }
                        if (z14) {
                            sn snVar7 = new sn(bundle4);
                            b4(snVar7, messageObject);
                            presentFragment(snVar7);
                            return;
                        }
                        yw ywVar3 = this.G3;
                        fx fxVar = ywVar3.a;
                        if (fxVar == null || (-fxVar.a) != j12) {
                            zx zxVar = this.e0[0].a;
                            zxVar.q3 = 0.0f;
                            zxVar.r3 = zxVar.p3;
                            zxVar.s3 = zxVar.j3 != 0.0f;
                            fx fxVar2 = new fx(bundle4);
                            fxVar2.M0 = this;
                            final yw ywVar4 = this.G3;
                            org.telegram.ui.ActionBar.h5 parentLayout = getParentLayout();
                            AnimationNotificationsLocker animationNotificationsLocker = ywVar4.n;
                            if (!ywVar4.r) {
                                ywVar4.w = parentLayout;
                                fxVar2.onFragmentCreate();
                                fxVar2.setInPreviewMode(true);
                                fxVar2.setParentLayout(parentLayout);
                                View performCreateView = fxVar2.performCreateView(ywVar4.getContext());
                                fxVar2.onResume();
                                ywVar4.b = performCreateView;
                                ywVar4.addView(performCreateView);
                                final fx fxVar3 = ywVar4.a;
                                l0 l0Var = fxVar2.e;
                                ywVar4.c = l0Var;
                                ywVar4.addView(l0Var);
                                ywVar4.a = fxVar2;
                                b31.Q = j10;
                                b31.Q = -fxVar2.a;
                                if (fxVar2.getActionBar() != null) {
                                    org.telegram.ui.ActionBar.k actionBar = fxVar2.getActionBar();
                                    ywVar4.d = actionBar;
                                    ywVar4.addView(actionBar);
                                    ywVar4.d.U0 = new my0(ywVar4, 10);
                                }
                                if (fxVar3 != null) {
                                    final fx fxVar4 = ywVar4.a;
                                    if (SharedConfig.animationsEnabled()) {
                                        o1.k kVar = ywVar4.x;
                                        if (kVar != null) {
                                            kVar.c();
                                        }
                                        fxVar4.onTransitionAnimationStart(true, false);
                                        ywVar4.E = fxVar3;
                                        ywVar4.v = true;
                                        animationNotificationsLocker.lock();
                                        o1.k kVar2 = new o1.k(new o1.j(0.0f));
                                        ywVar4.x = kVar2;
                                        kVar2.u = org.telegram.ui.Cells.b1.m(1000.0f, 400.0f, 1.0f);
                                        b31.f(fxVar3, fxVar4, 0.0f);
                                        ywVar4.x.b(new dd0(ywVar4, i18));
                                        ywVar4.x.a(new o1.f() { // from class: org.telegram.ui.z21
                                            @Override // o1.f
                                            public final void a(o1.h hVar, boolean z15, float f7, float f10) {
                                                b31 b31Var = ywVar4;
                                                if (b31Var.x == null) {
                                                    return;
                                                }
                                                b31Var.x = null;
                                                org.telegram.ui.ActionBar.o2 o2Var2 = fxVar4;
                                                o2Var2.onTransitionAnimationEnd(true, false);
                                                org.telegram.ui.ActionBar.o2 o2Var3 = fxVar3;
                                                b31.f(o2Var3, o2Var2, 1.0f);
                                                b31Var.v = false;
                                                b31Var.E = null;
                                                o2Var3.onPause();
                                                o2Var3.onFragmentDestroy();
                                                b31Var.removeView(o2Var3.getFragmentView());
                                                b31Var.removeView(o2Var3.getActionBar());
                                                b31Var.n.unlock();
                                            }
                                        });
                                        ywVar4.x.h();
                                    } else {
                                        fxVar4.onTransitionAnimationStart(true, false);
                                        fxVar4.onTransitionAnimationEnd(true, false);
                                        b31.f(fxVar3, fxVar4, 1.0f);
                                        ywVar4.v = false;
                                        ywVar4.E = null;
                                        fxVar3.onPause();
                                        fxVar3.onFragmentDestroy();
                                        ywVar4.removeView(fxVar3.getFragmentView());
                                        ywVar4.removeView(fxVar3.getActionBar());
                                        animationNotificationsLocker.unlock();
                                    }
                                } else if (!ywVar4.f) {
                                    int i19 = 1;
                                    ywVar4.f = true;
                                    if (SharedConfig.animationsEnabled()) {
                                        animationNotificationsLocker.lock();
                                        ywVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        ywVar4.e = 0.0f;
                                        ywVar4.e(true);
                                        ywVar4.g();
                                        fxVar2.onTransitionAnimationStart(true, false);
                                        ywVar4.h.addUpdateListener(new y21(ywVar4, i19));
                                        ywVar4.h.addListener(new org.telegram.ui.Components.ql0(13, ywVar4, fxVar2));
                                        ywVar4.h.setDuration(250L);
                                        ywVar4.h.setInterpolator(org.telegram.ui.Components.bs.f);
                                        ywVar4.h.setStartDelay(SharedConfig.getDevicePerformanceClass() >= 2 ? 50L : 150L);
                                        ywVar4.h.start();
                                    } else {
                                        ywVar4.e(true);
                                        fxVar2.onTransitionAnimationStart(true, false);
                                        fxVar2.onTransitionAnimationEnd(true, false);
                                        ywVar4.e = 1.0f;
                                        ywVar4.g();
                                        ywVar4.d(false);
                                    }
                                }
                                fxVar2.setPreviewDelegate(new sp0(ywVar4, 15));
                                WeakHashMap weakHashMap = r0.i0.a;
                                r0.y.c(ywVar4);
                            }
                        } else {
                            ywVar3.a();
                        }
                        nx nxVar8 = this.C0;
                        if (nxVar8 != null) {
                            nxVar8.Q();
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
            nxVar = this.C0;
            if (nxVar != null) {
                nxVar.P(false);
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
        nxVar = this.C0;
        if (nxVar != null) {
        }
        if (j12 != getUserConfig().getClientUserId()) {
        }
        if (this.n2 != null) {
        }
    }

    public final void m3() {
        AndroidUtilities.runOnUIThread(new ev(this, 2), 300L);
    }

    public final boolean m4(View view, int i10, float f7, org.telegram.ui.Components.lm0 lm0Var) {
        org.telegram.ui.Components.so0 so0Var;
        org.telegram.ui.Components.so0 so0Var2;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.y2) && lm0Var.j(i10) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.l2 && (view instanceof org.telegram.ui.Cells.q2)) {
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                if (!getMessagesController().isForum(q2Var.getDialogId()) && !this.G3.c() && q2Var.R(f7)) {
                    return F4(q2Var);
                }
            }
            yw ywVar = this.G3;
            if (ywVar == null || !ywVar.c()) {
                nx nxVar = this.C0;
                if (nxVar != null && lm0Var == (so0Var2 = nxVar.b0)) {
                    Object I = so0Var2.I(i10);
                    if (!this.C0.b0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.R = string;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                c2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, og.d.i(chat, this.currentAccount, false));
                            } else {
                                c2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().clientUserId) {
                                c2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                c2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            c2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(r11.id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new ci.d1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                nx nxVar2 = this.C0;
                if (nxVar2 == null || lm0Var != (so0Var = nxVar2.b0)) {
                    Object J = ((hg.m) lm0Var).J(i10);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.l2) {
                            if ((this.R0 == 3 || G3()) && h5(dialog.id)) {
                                if (this.R0 != 1 || !G3() || !this.m2 || !getMessagesController().isForum(dialog.id)) {
                                    e3(dialog.id, view);
                                    a5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.R0 == 1);
                                bundle.putBoolean("quote", this.O0);
                                bundle.putBoolean("reply_to", this.N0);
                                ye1 ye1Var = new ye1(bundle);
                                ye1Var.L0 = this;
                                presentFragment(ye1Var);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                k4(view);
                                return false;
                            }
                            if (!this.actionBar.s() || !e4(dialog)) {
                                K4(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.l2) {
                        l4(view, i10, lm0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.i6) || so0Var.N(i10)) ? 0L : ((org.telegram.ui.Cells.i6) view).getDialogId();
                    if (dialogId != 0) {
                        K4(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean n3(long j10) {
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

    public final void n4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.l4(29));
        org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(this, view);
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
                int i12 = org.telegram.ui.ActionBar.k6.i6;
                Drawable Z = org.telegram.ui.ActionBar.k6.Z(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
                org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(Z);
                org.telegram.ui.ActionBar.r6.k(linearLayout, Z, null, O, resourceProvider);
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
                h9Var.r(currentUser);
                org.telegram.ui.Components.hh0 hh0Var = new org.telegram.ui.Components.hh0(this, getParentActivity(), z10);
                linearLayout.addView(hh0Var, w7.z5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getParentActivity());
                if (z10) {
                    w9Var.setScaleX(0.833f);
                    w9Var.setScaleY(0.833f);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setCurrentAccount(intValue);
                w9Var.e(currentUser, h9Var);
                hh0Var.addView(w9Var, w7.z5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, getResourceProvider());
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.z5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new ai.ia(this, intValue, H, 13));
                H.r(linearLayout, w7.z5.n(230, 48));
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.o1(0.15f, -16777216));
        H.z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(c02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 1) {
            A3();
            C3();
            F3();
            s3();
            D3();
            tx txVar = this.X;
            ne.b bVar = this.b;
            txVar.setBlurredBackgroundVisibility(bVar.e);
            float b10 = zf.f0.b(bVar.e);
            org.telegram.ui.Components.w9 w9Var = this.b3;
            if (w9Var != null) {
                w9Var.setScaleX(b10);
                this.b3.setScaleY(b10);
                this.b3.setAlpha(b10);
                this.b3.setVisibility(b10 > 0.0f ? 0 : 8);
            }
            if (this.v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.v0.setScaleX(lerp);
                this.v0.setScaleY(lerp);
                this.v0.setAlpha(b10);
                this.v0.setVisibility(b10 > 0.0f ? 0 : 8);
                this.w0.setAlpha(b10);
                this.w0.setVisibility(b10 > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i10 == 2) {
            A3();
            C3();
            return;
        }
        if (i10 == 3) {
            y3();
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
            x3();
            return;
        }
        if (i10 == 6) {
            A3();
            C3();
        } else {
            if (i10 == 7) {
                t3();
                return;
            }
            if (i10 == 8) {
                s3();
                D3();
            } else if (i10 == 9) {
                D3();
            }
        }
    }

    public final void o3(boolean z10) {
        ii.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.us usVar = this.J1;
        if (usVar == null || (jVar = this.Q1) == null || (chatFull = this.a3) == null) {
            return;
        }
        usVar.i(jVar, (this.Y2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.a3.requests_pending, new Object[0]));
    }

    public final void o4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.G3.c() || !this.G3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.j80 j80Var = this.L0;
            if (j80Var == null) {
                cw cwVar = this.z0;
                if (cwVar == null || !cwVar.n) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar == null || !kVar.s()) {
                        if (!this.b.f) {
                            cw cwVar2 = this.z0;
                            if (cwVar2 != null && cwVar2.getVisibility() == 0 && !this.h3) {
                                cw cwVar3 = this.z0;
                                if (!cwVar3.O && !this.m3) {
                                    ArrayList arrayList = cwVar3.h;
                                    if (!arrayList.isEmpty() && cwVar3.L != ((org.telegram.ui.Components.p00) arrayList.get(0)).a) {
                                        if (z10) {
                                            cw cwVar4 = this.z0;
                                            ArrayList arrayList2 = cwVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                cwVar4.f((org.telegram.ui.Components.p00) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            ow owVar = this.B1;
                            if (owVar == null || !owVar.q0()) {
                                vw vwVar = this.E0;
                                if (vwVar.O != 0 || vwVar.S.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                vwVar.h.x0(0);
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
                        nx nxVar = this.C0;
                        if (nxVar != null && nxVar.getVisibility() == 0) {
                            this.C0.P(false);
                        }
                        Z3(true);
                        return false;
                    }
                } else if (z10) {
                    cwVar.setIsEditing(false);
                    G4(false);
                    return false;
                }
            } else if (z10) {
                j80Var.u();
                this.L0 = null;
                return false;
            }
        } else if (z10) {
            this.G3.a();
            nx nxVar2 = this.C0;
            if (nxVar2 != null) {
                nxVar2.Q();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        ai.jc jcVar;
        cw cwVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.g(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                nx nxVar = this.C0;
                if (nxVar != null) {
                    nxVar.b0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (cwVar = this.z0) != null && cwVar.getVisibility() == 0 && this.r.f) {
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
        if (!isInPreviewMode() && (jcVar = this.K0) != null && jcVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        z3();
        this.r0 = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        ei.x3 x3Var;
        super.onBecomeFullyVisible();
        if (c4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = P3(this.currentAccount, this.R0, this.W2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                E4();
            }
        }
        if (this.r0 && !this.s0 && (x3Var = this.p0) != null && this.O3) {
            this.s0 = true;
            this.r0 = false;
            x3Var.u();
        }
        AndroidUtilities.runOnUIThread(new uv(this, 4), 200L);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.j80 j80Var = this.L0;
        if (j80Var != null) {
            j80Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.c2 c2Var;
        super.onDialogDismiss(dialog);
        if (this.W2 == 0 && this.Y2 == 0 && (c2Var = this.T1) != null && dialog == c2Var && getParentActivity() != null) {
            g3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
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
        g4(getAccountInstance());
        ci.h7 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.s) {
                ConnectionsManager.getInstance(storiesController.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new ci.g6(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.W2, 0L, null);
        if (this.R3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            qu quVar = this.R3;
            if (quVar.getParent() != null) {
                ((ViewGroup) quVar.getParent()).removeView(quVar);
            }
            this.R3 = null;
        }
        if (c4()) {
            ci.h7 storiesController2 = getMessagesController().getStoriesController();
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

    @Override // org.telegram.ui.ActionBar.o2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.K3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.K3 = null;
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.z0();
        }
        org.telegram.ui.Components.nr0 nr0Var = this.G2;
        if (nr0Var != null) {
            nr0Var.j();
        }
        ot otVar = this.H2;
        if (otVar != null) {
            AndroidUtilities.cancelRunOnUIThread(otVar);
            this.H2 = null;
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.p3.unlock();
        this.C2 = null;
        ca1 ca1Var = ca1.b;
        if (ca1Var != null) {
            ca1Var.dismiss();
            ca1.b = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPanTranslationUpdate(float f7) {
        if (this.e0 == null) {
            return;
        }
        this.J0 = f7;
        ow owVar = this.B1;
        int i10 = 0;
        if (owVar == null || !owVar.q0()) {
            while (true) {
                dy[] dyVarArr = this.e0;
                if (i10 >= dyVarArr.length) {
                    break;
                }
                dyVarArr[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.qc qcVar = this.o3;
                if (qcVar != null) {
                    qcVar.l();
                }
            }
            nx nxVar = this.C0;
            if (nxVar != null) {
                nxVar.setTranslationY(this.J0 + this.I0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f7);
        while (true) {
            dy[] dyVarArr2 = this.e0;
            if (i10 >= dyVarArr2.length) {
                break;
            }
            dyVarArr2[i10].setTranslationY(0.0f);
            i10++;
        }
        if (!this.l2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.qc qcVar2 = this.o3;
            if (qcVar2 != null) {
                qcVar2.l();
            }
        }
        nx nxVar2 = this.C0;
        if (nxVar2 != null) {
            nxVar2.setTranslationY(this.I0);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.qc qcVar = this.S;
        if (qcVar != null) {
            qcVar.b();
            this.S = null;
        }
        yw ywVar = this.G3;
        if (ywVar != null) {
            ywVar.r = true;
            fx fxVar = ywVar.a;
            if (fxVar != null) {
                fxVar.onPause();
            }
        }
        org.telegram.ui.Components.j80 j80Var = this.L0;
        if (j80Var != null) {
            j80Var.u();
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.B0();
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
            dy[] dyVarArr = this.e0;
            if (i10 >= dyVarArr.length) {
                return;
            }
            dyVarArr[i10].d.getClass();
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
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
                            uj0.m();
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
                            AndroidUtilities.runOnUIThread(new uv(this, 3));
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
            H4();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        ey eyVar;
        dy dyVar;
        lw lwVar;
        org.telegram.ui.Components.so0 so0Var;
        ai.jc jcVar;
        super.onResume();
        vw vwVar = this.E0;
        if (vwVar != null) {
            ArrayList arrayList = vwVar.x;
            ci.h7 h7Var = vwVar.s;
            h7Var.l(h7Var.g);
            h7Var.l(h7Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = h7Var.y(((ci.o) arrayList.get(i10)).c);
                if (y3 != null) {
                    h7Var.X(y3);
                }
            }
        }
        yw ywVar = this.G3;
        if (ywVar != null) {
            ywVar.r = false;
            fx fxVar = ywVar.a;
            if (fxVar != null) {
                fxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (jcVar = this.K0) != null && jcVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.e0 != null) {
            int i11 = 0;
            while (true) {
                dy[] dyVarArr = this.e0;
                if (i11 >= dyVarArr.length) {
                    break;
                }
                dyVarArr[i11].d.l();
                i11++;
            }
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.C0();
        }
        long j10 = 0;
        if (!this.l2 && this.W2 == 0 && this.Y2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        nx nxVar = this.C0;
        if (nxVar != null && (so0Var = nxVar.b0) != null) {
            so0Var.l();
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
                eyVar = this;
                org.telegram.messenger.r1 r1Var = new org.telegram.messenger.r1(eyVar, z13, z11, z12, parentActivity);
                if (eyVar.t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(r1Var, j10);
            } else {
                eyVar = this;
            }
        } else {
            eyVar = this;
            if (!eyVar.l2 && eyVar.W2 == 0 && eyVar.Y2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(XiaomiUtilities.OP_SHOW_WHEN_LOCKED)) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i13 = R.raw.permission_request_apk;
                    int i14 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(i13, 72, getThemedColor(i14), null);
                    alertDialog$Builder.n(i14, getResourceProvider());
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                    alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new jv(this, 8));
                    alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new wv(0));
                    showDialog(alertDialog$Builder.a);
                }
            } else if (eyVar.W2 == 0 && eyVar.Y2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    int i15 = R.raw.permission_request_apk;
                    int i16 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder2.m(i15, 72, getThemedColor(i16), null);
                    alertDialog$Builder2.n(i16, getResourceProvider());
                    alertDialog$Builder2.a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new jv(this, 9));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new wv(1));
                    showDialog(alertDialog$Builder2.a);
                }
            }
        }
        H4();
        if (eyVar.e0 != null) {
            int i17 = 0;
            while (true) {
                dy[] dyVarArr2 = eyVar.e0;
                if (i17 >= dyVarArr2.length) {
                    break;
                }
                dy dyVar2 = dyVarArr2[i17];
                if (dyVar2.s == 0 && dyVar2.v == 2 && dyVar2.c.L0() == 0 && X3()) {
                    eyVar.e0[i17].c.h1(1, (int) eyVar.N);
                }
                if (i17 == 0) {
                    eyVar.e0[i17].d.getClass();
                } else {
                    eyVar.e0[i17].d.getClass();
                }
                i17++;
            }
        }
        J4();
        setBulletinDelegate(new b9(this, 4));
        if (eyVar.q3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), eyVar.classGuid);
        }
        g5(0, false);
        Y4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            ca1.n(this);
        }
        z3();
        if (eyVar.z0 == null || (dyVar = eyVar.e0[0]) == null || (lwVar = dyVar.d) == null) {
            return;
        }
        int i18 = lwVar.h;
        if (i18 == 7 || i18 == 8) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i18 != 7 ? (char) 1 : (char) 0];
            if (dialogFilter != null) {
                eyVar.z0.h(dialogFilter.localId);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Z3 && this.a4 == null) {
            D4(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f1.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            l3();
            T4();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ai.jc jcVar;
        ey eyVar;
        yw ywVar = this.G3;
        if (ywVar == null || !ywVar.c()) {
            if (z10 && (jcVar = this.K0) != null && jcVar.getVisibility() == 0) {
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
        if (!z10 && (eyVar = this.X2) != null) {
            eyVar.removeSelfFromStack();
        }
        z3();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        yw ywVar = this.G3;
        if (ywVar == null || !ywVar.c()) {
            ai.jc jcVar = this.K0;
            if (jcVar != null && jcVar.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        } else {
            this.G3.getFragment().onTransitionAnimationProgress(z10, f7);
        }
        z3();
    }

    public final void p3(dy dyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        int L0 = dyVar.c.L0();
        int N0 = dyVar.c.N0();
        if (this.h3 || this.m3) {
            return;
        }
        cw cwVar = this.z0;
        if (cwVar != null && cwVar.getVisibility() == 0 && this.z0.O) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            s4.b1 K = dyVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.b2 = z14;
            if (z14) {
                a4(false);
            }
        } else {
            this.b2 = false;
        }
        int i11 = dyVar.s;
        if (i11 == 7 || i11 == 8) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int i12 = dyVar.h;
            if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(dyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= P3(this.currentAccount, dyVar.s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                boolean z15 = !isDialogsEndReached;
                z10 = (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) ? false : true;
                z11 = z15;
                if ((abs > 0 || N0 < P3(this.currentAccount, dyVar.s, this.W2, this.S1).size() - 10) && (abs != 0 || (!((i10 = dyVar.s) == 7 || i10 == 8) || getMessagesController().isDialogsEndReached(this.W2)))) {
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
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xv
                        @Override // java.lang.Runnable
                        public final void run() {
                            ey eyVar = ey.this;
                            if (z12) {
                                eyVar.getMessagesController().loadDialogs(eyVar.W2, -1, 100, z13);
                            }
                            if (z10) {
                                eyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                            } else {
                                eyVar.getClass();
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
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xv
            @Override // java.lang.Runnable
            public final void run() {
                ey eyVar = ey.this;
                if (z12) {
                    eyVar.getMessagesController().loadDialogs(eyVar.W2, -1, 100, z13);
                }
                if (z10) {
                    eyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                } else {
                    eyVar.getClass();
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
    public final void p4(java.util.ArrayList r42, int r43, boolean r44, boolean r45, java.util.HashSet r46) {
        /*
            Method dump skipped, instructions count: 2803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.p4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Z3 = true;
            z4(true);
        } else {
            this.a4 = null;
            this.Z3 = false;
            z4(false);
            D4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        boolean presentFragment = super.presentFragment(o2Var);
        if (presentFragment && this.e0 != null) {
            int i10 = 0;
            while (true) {
                dy[] dyVarArr = this.e0;
                if (i10 >= dyVarArr.length) {
                    break;
                }
                dyVarArr[i10].d.getClass();
                i10++;
            }
        }
        ei.x3 x3Var = this.p0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        ei.x3 x3Var2 = this.q0;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        org.telegram.ui.Components.qc.e();
        return presentFragment;
    }

    public final void q3() {
        if (this.e0 == null) {
            return;
        }
        int j32 = j3();
        int i10 = 0;
        while (true) {
            dy[] dyVarArr = this.e0;
            if (i10 >= dyVarArr.length) {
                return;
            }
            dy dyVar = dyVarArr[i10];
            if (dyVar != null) {
                zx zxVar = dyVar.a;
                zxVar.setPadding(0, zxVar.Z2, 0, j32);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q4(long j10, boolean z10, MessagesController.DialogFilter dialogFilter, int i10, boolean z11) {
        boolean z12;
        int i11;
        boolean pinDialog;
        boolean z13;
        int i12 = (this.e0[0].s == 0 && X3() && this.e0[0].v == 2) ? 1 : 0;
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
            y4(true, true);
            m3();
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
                    a4(false);
                }
                v4(true, false);
            } else {
                ArrayList P3 = P3(this.currentAccount, this.e0[0].s, this.W2, false);
                int i16 = 0;
                while (true) {
                    if (i16 >= P3.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) P3.get(i16)).id == j10) {
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
                dy dyVar = this.e0[0];
                dyVar.c.h1((dyVar.s == 0 && X3() && this.e0[0].v == 2) ? 1 : 0, (int) this.N);
            } else if (i14 >= 0 && i11 == i14) {
                AndroidUtilities.runOnUIThread(new ev(this, 24), 200L);
            }
            z13 = true;
            if (z13) {
                y4(false, true);
                return;
            }
            return;
        }
        z13 = false;
        if (z13) {
        }
    }

    public final void r3() {
        ih.f fVar = this.y1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void r4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        z3();
    }

    public final void s3() {
        dy dyVar;
        float Q3 = Q3(true);
        cw cwVar = this.z0;
        if (cwVar != null) {
            boolean z10 = cwVar.getAlpha() != Q3;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, Q3);
            this.z0.setAlpha(Q3);
            this.z0.setScaleX(lerp);
            this.z0.setScaleY(lerp);
            this.z0.setVisibility(Q3 > 0.0f ? 0 : 8);
            if (z10 && (dyVar = this.e0[0]) != null) {
                dyVar.a.requestLayout();
            }
        }
        Q4();
    }

    public final void s4(dy dyVar) {
        int i10;
        if (dyVar.getVisibility() != 0) {
            return;
        }
        int i11 = dyVar.d.v;
        if (dyVar.s == 0 && X3() && dyVar.a.getChildCount() == 0 && dyVar.v == 2) {
            ((s4.b0) dyVar.a.getLayoutManager()).h1(1, (int) this.N);
        }
        dyVar.d.getClass();
        dyVar.d.V();
        int h = dyVar.d.h();
        if (h == 1 && i11 == 1 && dyVar.d.j(0) == 5) {
            dyVar.q(true);
        } else {
            dyVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                dyVar.y.b(i11);
            }
        }
        try {
            dyVar.a.setEmptyView((this.W2 == 0 && this.Y2 == 0) ? dyVar.w : null);
        } catch (Exception e) {
            FileLog.e(e);
        }
        p3(dyVar);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        vw vwVar = this.E0;
        if (vwVar != null) {
            if (!this.G0 || z10) {
                vwVar.setVisibility(8);
            } else {
                vwVar.setVisibility(0);
            }
        }
        X4(true);
        S4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        ax axVar;
        org.telegram.ui.Components.p5 p5Var;
        super.setTitleOverlayText(str, i10, runnable);
        if (this.actionBar != null && (axVar = this.M0) != null && (axVar.getContentView() instanceof b61)) {
            org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
            b61 b61Var = (b61) this.M0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                p5Var = this.E3;
            }
            p5Var = null;
            b61Var.y(p5Var, titleTextView);
        }
        vw vwVar = this.E0;
        if (vwVar != null) {
            org.telegram.ui.Components.q6 q6Var = vwVar.T;
            vwVar.U.b(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null, true);
            if (str != null) {
                vwVar.g0 = true;
                if (vwVar.h0 != i10) {
                    vwVar.h0 = i10;
                    q6Var.c(LocaleController.getString(str, i10), !LocaleController.isRTL, true);
                }
            } else {
                vwVar.g0 = false;
                vwVar.h0 = 0;
                q6Var.c(vwVar.f0, !LocaleController.isRTL, true);
            }
            vwVar.a.a(vwVar.g0, true);
            vwVar.L0.v(q6Var);
        }
    }

    @Override // org.telegram.ui.qg0
    public final void t() {
        v4(true, true);
    }

    public final void t3() {
        float f7 = this.n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        ki.y1 y1Var = this.C1;
        if (y1Var != null) {
            y1Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            this.C1.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        ih.f fVar = this.y1;
        if (fVar != null) {
            fVar.setAlpha(f7);
            this.y1.setVisibility(f7 > 0.0f ? 0 : 8);
            this.y1.getFadeView().setAlpha(f7);
            this.y1.getFadeView().setVisibility(f7 > 0.0f ? 0 : 8);
        }
    }

    public final void t4() {
        boolean z10;
        if (this.N == 0.0f || (z10 = this.K)) {
            return;
        }
        float f7 = z10 ? -S3() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.H3, f7));
        animatorSet.setInterpolator(org.telegram.ui.Components.bs.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void u3() {
        if (this.actionBar == null) {
            return;
        }
        float f7 = 1.0f - this.b.e;
        float T3 = 1.0f - T3();
        org.telegram.ui.Components.h20.d(this.actionBar.getBackButton(), Math.max(this.u3, f7 * T3 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u4(int i10) {
        org.telegram.ui.Components.p00 p00Var;
        if (this.z0 == null) {
            U4(true, true);
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
        cw cwVar = this.z0;
        if (tabsCount < 0) {
            cwVar.getClass();
        } else if (tabsCount < cwVar.getTabsCount()) {
            p00Var = (org.telegram.ui.Components.p00) cwVar.h.get(tabsCount);
            if (p00Var != null) {
                cw cwVar2 = this.z0;
                ArrayList arrayList = cwVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                cwVar2.f((org.telegram.ui.Components.p00) i2.o1.i(1, arrayList), arrayList.size() - 1);
                return;
            }
            dy[] dyVarArr = this.e0;
            if (dyVarArr == null || dyVarArr.length <= 0 || dyVarArr[0].h != p00Var.a) {
                this.z0.f(p00Var, tabsCount);
                return;
            }
            return;
        }
        p00Var = null;
        if (p00Var != null) {
        }
    }

    public final void v3() {
        org.telegram.ui.Components.h20.d(this.g0, com.google.android.gms.internal.play_billing.k3.C(this.i0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - T3(), 1.0f - this.c.e));
    }

    public final void v4(boolean z10, boolean z11) {
        yw ywVar = this.G3;
        if (ywVar == null || !ywVar.c()) {
            int i10 = (this.e0[0].s == 0 && X3() && this.e0[0].v == 2) ? 1 : 0;
            int i11 = (!this.K || z11 || this.E0.g()) ? 0 : -AndroidUtilities.dp(81.0f);
            if (!z10) {
                this.e0[0].c.h1(i10, i11);
                t4();
            } else {
                org.telegram.ui.Components.pl0 pl0Var = this.e0[0].r;
                pl0Var.b = 1;
                pl0Var.c(i10, i11, false, false);
                t4();
            }
        }
    }

    public final void w3() {
        org.telegram.ui.Components.h20.d(this.f0, com.google.android.gms.internal.play_billing.k3.C(SharedConfig.passcodeHash.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - T3(), 1.0f - this.c.e));
    }

    public final void w4(String str, boolean z10) {
        M4(true, false, true, false);
        tx txVar = this.X;
        if (txVar != null) {
            txVar.r.setText(str);
            this.X.r.setSelection(str.length());
        }
    }

    public final void x3() {
        org.telegram.ui.Components.h20.d(this.j0, com.google.android.gms.internal.play_billing.k3.C(this.R0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - T3(), 1.0f - this.c.e));
        vw vwVar = this.E0;
        if (vwVar != null) {
            vwVar.invalidate();
        }
    }

    public final void x4(float f7) {
        this.c0 = f7;
        for (dy dyVar : this.e0) {
            zx zxVar = dyVar.a;
            for (int i10 = 0; i10 < zxVar.getChildCount(); i10++) {
                View childAt = zxVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= dyVar.d.f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void y3() {
        org.telegram.ui.Components.h20.d(this.l0, com.google.android.gms.internal.play_billing.k3.C(this.b.e, 1.0f - T3(), 1.0f - this.c.e, this.d.e));
    }

    public final void y4(boolean z10, boolean z11) {
        if (this.e0 == null || this.S1 == z10) {
            return;
        }
        if (z10) {
            this.R1 = new ArrayList(P3(this.currentAccount, this.e0[0].s, this.W2, false));
        } else {
            this.R1 = null;
        }
        this.S1 = z10;
        dy dyVar = this.e0[0];
        dyVar.d.G = z10;
        if (z10 || !z11) {
            return;
        }
        if (dyVar.a.b0()) {
            this.e0[0].a.post(new uv(this, 9));
        } else {
            this.e0[0].d.l();
        }
    }

    @Override // org.telegram.ui.qg0
    public final gh.d z() {
        return this.n4;
    }

    public final void z3() {
        ai.jc jcVar;
        boolean z10 = !this.j2 && ((jcVar = this.K0) == null || jcVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8);
        og0 og0Var = this.J3;
        if (og0Var != null) {
            og0Var.a.v.a(z10, true);
        }
    }

    public final void z4(boolean z10) {
        dy dyVar;
        if (SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(32768)) {
            return;
        }
        if (z10) {
            dy[] dyVarArr = this.e0;
            if (dyVarArr != null && (dyVar = dyVarArr[0]) != null) {
                dyVar.setLayerType(2, null);
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
                dy[] dyVarArr2 = this.e0;
                if (i10 >= dyVarArr2.length) {
                    break;
                }
                dy dyVar2 = dyVarArr2[i10];
                if (dyVar2 != null) {
                    dyVar2.setLayerType(0, null);
                    dyVar2.setClipChildren(true);
                    dyVar2.setClipToPadding(true);
                    dyVar2.a.setClipChildren(true);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            kVar2.setLayerType(0, null);
        }
        vw vwVar = this.E0;
        if (vwVar != null) {
            vwVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }
}

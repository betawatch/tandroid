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
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ay extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, fg.b, fe.e, of0 {
    public static float A4;
    public static boolean x4;
    public static final boolean[] y4 = new boolean[4];
    public static final org.telegram.ui.Components.qq0 z4 = new org.telegram.ui.Components.qq0(3);
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public ow B1;
    public boolean B2;
    public Long B3;
    public kx C0;
    public bi.f2 C1;
    public ux C2;
    public Drawable C3;
    public boolean D;
    public org.telegram.ui.Components.rt0 D0;
    public org.telegram.ui.ActionBar.t0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.d5 D3;
    public boolean E;
    public uw E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.n E3;
    public boolean F;
    public org.telegram.ui.Components.xr F0;
    public mw F1;
    public CharSequence F2;
    public xw F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.sp0 G2;
    public final nw G3;
    public long H;
    public float H0;
    public mw H1;
    public xs H2;
    public final nw H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public mf0 I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.zr J1;
    public boolean J2;
    public xa.n J3;
    public boolean K;
    public bi.t0 K0;
    public org.telegram.ui.Components.yr K1;
    public int K2;
    public Drawable K3;
    public boolean L;
    public org.telegram.ui.Components.z60 L0;
    public org.telegram.ui.Cells.l L1;
    public int L2;
    public int L3;
    public boolean M;
    public zw M0;
    public org.telegram.ui.Cells.d3 M1;
    public boolean M2;
    public boolean M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.ma N1;
    public int N2;
    public boolean N3;
    public boolean O;
    public boolean O0;
    public Long O1;
    public int O2;
    public AnimatorSet O3;
    public int P;
    public long P0;
    public Long P1;
    public int P2;
    public boolean P3;
    public boolean Q;
    public long Q0;
    public zh.j Q1;
    public int Q2;
    public ou Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public String R3;
    public org.telegram.ui.Components.wb S;
    public int S0;
    public boolean S1;
    public int S2;
    public ArrayList S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.x1 T1;
    public int T2;
    public boolean T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public int U2;
    public CharSequence U3;
    public boolean V;
    public org.telegram.ui.Components.gc0 V0;
    public boolean V1;
    public boolean V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.v2 W0;
    public long W1;
    public int W2;
    public float W3;
    public px X;
    public org.telegram.ui.Cells.v2 X0;
    public TLObject X1;
    public ay X2;
    public boolean X3;
    public rf.a0 Y;
    public boolean Y0;
    public int Y1;
    public long Y2;
    public boolean Y3;
    public q01 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.Chat Z2;
    public ValueAnimator Z3;
    public final int a;
    public org.telegram.ui.Components.v71 a0;
    public final ArrayList a1;
    public boolean a2;
    public TLRPC.ChatFull a3;
    public org.telegram.ui.Components.b40 a4;
    public final fe.b b;
    public zf.g0 b0;
    public boolean b1;
    public boolean b2;
    public org.telegram.ui.Components.g9 b3;
    public TLRPC.FileLocation b4;
    public final fe.b c;
    public float c0;
    public boolean c1;
    public boolean c2;
    public org.telegram.ui.Components.r8 c3;
    public TLRPC.FileLocation c4;
    public final fe.b d;
    public ValueAnimator d0;
    public boolean d1;
    public int d2;
    public long d3;
    public org.telegram.ui.Components.wb d4;
    public final fe.b e;
    public zx[] e0;
    public org.telegram.ui.ActionBar.c2 e1;
    public boolean e2;
    public boolean e3;
    public int e4;
    public final fe.b f;
    public org.telegram.ui.ActionBar.t0 f0;
    public final Paint f1;
    public String f2;
    public boolean f3;
    public int f4;
    public org.telegram.ui.ActionBar.t0 g0;
    public ImageView g1;
    public String g2;
    public AnimatorSet g3;
    public int g4;
    public final fe.b h;
    public dy h0;
    public NumberTextView h1;
    public String h2;
    public boolean h3;
    public int h4;
    public boolean i0;
    public final ArrayList i1;
    public boolean i2;
    public boolean i3;
    public int i4;
    public org.telegram.ui.ActionBar.t0 j0;
    public org.telegram.ui.ActionBar.t0 j1;
    public boolean j2;
    public float j3;
    public final tg.f j4;
    public org.telegram.ui.ActionBar.t0 k0;
    public org.telegram.ui.ActionBar.t0 k1;
    public boolean k2;
    public boolean k3;
    public final hi.f k4;
    public org.telegram.ui.ActionBar.t0 l0;
    public org.telegram.ui.ActionBar.t0 l1;
    public boolean l2;
    public int l3;
    public final hi.f l4;
    public org.telegram.ui.ActionBar.t0 m0;
    public org.telegram.ui.ActionBar.t0 m1;
    public boolean m2;
    public boolean m3;
    public final hi.c m4;
    public final fe.b n;
    public org.telegram.ui.Components.kh0 n0;
    public org.telegram.ui.ActionBar.b1 n1;
    public String n2;
    public boolean n3;
    public final tg.b n4;
    public org.telegram.ui.ActionBar.b1 o0;
    public org.telegram.ui.ActionBar.b1 o1;
    public String o2;
    public org.telegram.ui.Components.wb o3;
    public final tg.b o4;
    public vh.p2 p0;
    public org.telegram.ui.ActionBar.b1 p1;
    public final org.telegram.messenger.gs p2;
    public final e2.f p3;
    public final tg.b p4;
    public vh.p2 q0;
    public org.telegram.ui.ActionBar.b1 q1;
    public boolean q2;
    public boolean q3;
    public final tg.b q4;
    public final fe.b r;
    public boolean r0;
    public org.telegram.ui.ActionBar.b1 r1;
    public boolean r2;
    public boolean r3;
    public yv r4;
    public final fe.b s;
    public boolean s0;
    public org.telegram.ui.ActionBar.b1 s1;
    public boolean s2;
    public boolean s3;
    public final ArrayList s4;
    public org.telegram.ui.Components.f10 t0;
    public org.telegram.ui.ActionBar.b1 t1;
    public boolean t2;
    public boolean t3;
    public final RectF t4;
    public org.telegram.ui.Components.f10 u0;
    public float u1;
    public boolean u2;
    public float u3;
    public final RectF u4;
    public vh.d v0;
    public float v1;
    public boolean v2;
    public ValueAnimator v3;
    public int v4;
    public final hh.i w;
    public bh.i w0;
    public AnimatorSet w1;
    public boolean w2;
    public float w3;
    public int w4;
    public boolean x;
    public int x0;
    public float x1;
    public boolean x2;
    public float x3;
    public int y;
    public final UndoView[] y0;
    public zg.e y1;
    public boolean y2;
    public float y3;
    public qx z0;
    public FrameLayout z1;
    public boolean z2;
    public boolean z3;

    public ay(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.b = new fe.b(1, this, grVar, 350L, false);
        this.c = new fe.b(2, this, grVar, 350L, false);
        this.d = new fe.b(3, this, grVar, 350L, false);
        this.e = new fe.b(4, this, grVar, 350L, false);
        this.f = new fe.b(5, this, grVar, 350L, false);
        this.h = new fe.b(6, this, grVar, 350L, false);
        this.n = new fe.b(7, this, grVar, 350L, false);
        this.r = new fe.b(8, this, grVar, 350L, false);
        this.s = new fe.b(9, this, grVar, 350L, false);
        this.w = new hh.i(new fv(this, 18));
        this.y = -1;
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
        this.p2 = new org.telegram.messenger.gs();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.p3 = new e2.f(null);
        this.G3 = new nw(this, 0);
        this.H3 = new nw(this, 1);
        this.L3 = -4;
        this.M3 = true;
        this.N3 = true;
        this.W3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.s4 = arrayList;
        RectF rectF = new RectF();
        this.t4 = rectF;
        RectF rectF2 = new RectF();
        this.u4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        hi.c d = this.glassEngine.d(new iv(this, 12));
        this.m4 = d;
        if (i10 >= 31) {
            tg.f fVar = new tg.f(false);
            this.j4 = fVar;
            hi.f fVar2 = new hi.f(d);
            this.l4 = fVar2;
            fVar2.f = d;
            fVar2.d = fVar;
            fVar2.e = -2;
            hi.f fVar3 = new hi.f(null);
            this.k4 = fVar3;
            fVar3.f = d;
            fVar3.d = fVar;
            fVar3.e = -3;
            tg.b bVar = new tg.b(fVar2);
            this.p4 = bVar;
            bVar.i = true;
            int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(48.0f);
            bVar.b = L;
            bVar.c = L;
            tg.b bVar2 = new tg.b(fVar3);
            this.n4 = bVar2;
            bVar2.i = true;
            int L2 = org.telegram.messenger.i0.L(48.0f);
            bVar2.b = L2;
            bVar2.c = L2;
            this.o4 = new tg.b(fVar3);
        } else {
            this.j4 = null;
            this.k4 = null;
            this.l4 = null;
            this.n4 = new tg.b(d);
            this.p4 = new tg.b(d);
            this.o4 = new tg.b(d);
        }
        tg.b bVar3 = new tg.b(d);
        this.q4 = bVar3;
        tg.b bVar4 = this.p4;
        ei.r rVar = this.glassEngine;
        bVar4.h = rVar;
        this.n4.h = rVar;
        this.o4.h = rVar;
        bVar3.h = rVar;
    }

    public static void A0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "PREMIUM_CHRISTMAS");
        ayVar.f5();
        org.telegram.ui.Components.wb G = org.telegram.ui.Components.cc.a0(ayVar).G(R.raw.gift, 4, org.telegram.messenger.cd.L0(2131753330, null));
        G.j = 5000;
        G.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void B0(ay ayVar, int i10) {
        tg.f fVar = ayVar.j4;
        RectF rectF = ayVar.u4;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (v7.u7.a(i10, 4)) {
            int L = org.telegram.messenger.i0.L(48.0f);
            int measuredHeight = (ayVar.fragmentView.getMeasuredHeight() - ayVar.f4) - org.telegram.messenger.i0.L(8.0f);
            int L2 = measuredHeight - org.telegram.messenger.i0.L(56.0f);
            int L3 = org.telegram.messenger.i0.L(ayVar.K ? 81.0f : 0.0f) + org.telegram.messenger.i0.L(48.0f) + ayVar.actionBar.getMeasuredHeight();
            qx qxVar = ayVar.z0;
            boolean z10 = false;
            int measuredHeight2 = L3 + ((qxVar == null || qxVar.getVisibility() != 0) ? 0 : ayVar.z0.getMeasuredHeight());
            org.telegram.ui.Components.zr zrVar = ayVar.J1;
            int sumHeightOfAllVisibleChild = measuredHeight2 + ((zrVar == null || zrVar.getVisibility() != 0) ? 0 : ayVar.J1.getSumHeightOfAllVisibleChild()) + ((int) ayVar.N);
            int measuredHeight3 = ayVar.actionBar.getMeasuredHeight();
            ayVar.t4.set(0.0f, -L, ayVar.fragmentView.getMeasuredWidth(), org.telegram.messenger.i0.W1(ayVar.b.e, sumHeightOfAllVisibleChild, org.telegram.messenger.i0.L(30.0f) + measuredHeight3 + (ayVar.Z != null ? r9.getMeasuredHeight() : 0)) + L);
            if (ayVar.W) {
                rectF.set(0.0f, L2, ayVar.fragmentView.getMeasuredWidth(), measuredHeight);
                rectF.inset(0.0f, org.telegram.messenger.sc.e(262144) ? 0.0f : -org.telegram.messenger.i0.L(48.0f));
            } else {
                if (ayVar.B1 != null && ayVar.y1 != null) {
                    rectF.set(0.0f, ayVar.fragmentView.getMeasuredHeight() - ayVar.v3(), ayVar.fragmentView.getMeasuredWidth(), ayVar.fragmentView.getMeasuredHeight());
                    rectF.inset(0.0f, org.telegram.messenger.sc.e(262144) ? 0.0f : -org.telegram.messenger.i0.L(48.0f));
                }
                fVar.g(z10 ? 2 : 1, ayVar.s4);
            }
            z10 = true;
            fVar.g(z10 ? 2 : 1, ayVar.s4);
        }
        fVar.e(ayVar.r4, ayVar.fragmentView.getMeasuredWidth(), ayVar.fragmentView.getMeasuredHeight());
    }

    public static void C0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "BIRTHDAY_SETUP");
        ayVar.f5();
        org.telegram.ui.Components.wb K = org.telegram.ui.Components.cc.a0(ayVar).K(R.raw.chats_infotip, org.telegram.messenger.cd.L0(2131753714, null), org.telegram.messenger.cd.L0(2131745512, null), new fv(ayVar, 29));
        K.j = 5000;
        K.j();
    }

    public static void D0(ay ayVar) {
        try {
            ((org.telegram.ui.Components.bi0) ((org.telegram.ui.Components.r8) ayVar.M1.h.getImageReceiver().m0).K).H(true);
        } catch (Exception unused) {
        }
        if (ayVar.a4 == null) {
            org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
            ayVar.a4 = b40Var;
            b40Var.H = true;
            b40Var.a = ayVar;
            b40Var.b = new ox(ayVar);
            ayVar.getMediaDataController().x();
            ayVar.getMessagesController().b3();
            ayVar.getMessagesController().e3(ayVar.getUserConfig().f(), true, ayVar.classGuid);
        }
        TLRPC.User Z1 = org.telegram.messenger.vp.r1(ayVar.currentAccount).Z1(Long.valueOf(org.telegram.messenger.d20.i(ayVar.currentAccount).e()));
        if (Z1 == null) {
            Z1 = org.telegram.messenger.d20.i(ayVar.currentAccount).f();
        }
        if (Z1 == null) {
            return;
        }
        org.telegram.ui.Components.bi biVar = ayVar.a4.c;
        if (biVar != null) {
            biVar.P0();
        }
        org.telegram.ui.Components.b40 b40Var2 = ayVar.a4;
        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
        b40Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new fv(ayVar, 28), new ov(ayVar, 3), 0);
    }

    public static /* synthetic */ void F0(ay ayVar, float f7, ValueAnimator valueAnimator) {
        ayVar.e0[0].setTranslationY((1.0f - ayVar.u3) * f7);
        ayVar.u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < ayVar.actionBar.getChildCount(); i10++) {
            if (ayVar.actionBar.getChildAt(i10).getVisibility() == 0 && ayVar.actionBar.getChildAt(i10) != ayVar.actionBar.getActionMode() && ayVar.actionBar.getChildAt(i10) != ayVar.actionBar.getBackButton()) {
                ayVar.actionBar.getChildAt(i10).setAlpha(1.0f - ayVar.u3);
            }
        }
        ayVar.P3();
        ayVar.H3();
        View view = ayVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void G0(ay ayVar) {
        org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(ayVar.getParentActivity(), ayVar.resourceProvider);
        ebVar.d(R.raw.email_check_inbox, new String[0]);
        ebVar.b.setText(org.telegram.messenger.cd.L0(2131742836, null));
        org.telegram.ui.Components.wb.g(ayVar, ebVar, 2750).j();
        try {
            ayVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void H0(ay ayVar, org.telegram.messenger.w1 w1Var) {
        ArrayList arrayList = w1Var.c;
        if (arrayList.size() != 1) {
            mg.i2.l1(0, w1Var);
            return;
        }
        ph.l1 l1Var = new ph.l1(ayVar.getParentActivity(), ayVar.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
        l1Var.e1(true);
        ayVar.showDialog(l1Var);
    }

    public static void I0(ay ayVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.wb I = org.telegram.ui.Components.cc.a0(ayVar).I(R.raw.gift, org.telegram.messenger.cd.L0(2131746871, null), org.telegram.messenger.cd.L0(2131746870, null));
            I.j = 5000;
            I.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            ayVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(ayVar), R.raw.error, 36);
            return;
        }
        if (ayVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ayVar.getParentActivity(), ayVar.resourceProvider);
            String L0 = org.telegram.messenger.cd.L0(2131746867, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131746868, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
            ayVar.showDialog(x1Var);
        }
    }

    public static /* synthetic */ void J0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        ayVar.f5();
    }

    public static void W2(ay ayVar, float f7) {
        float f10;
        float f11;
        float i10 = Utilities.i(ayVar.x1 * 2.0f, 1.0f, 0.0f);
        uw uwVar = ayVar.E0;
        float f12 = (1.0f - ayVar.u3) * f7 * ayVar.H0;
        float f13 = 1.0f - i10;
        uwVar.setAlpha(f12 * f13);
        if (ayVar.K || ayVar.M) {
            float i11 = Utilities.i((-ayVar.N) / org.telegram.messenger.i0.L(81.0f), 1.0f, 0.0f);
            if (ayVar.u3 == 1.0f) {
                i11 = 1.0f;
            }
            float i12 = Utilities.i(i11 / 0.5f, 1.0f, 0.0f);
            ayVar.E0.setClipTop(0);
            if (ayVar.K || !ayVar.M) {
                ayVar.E0.setTranslationY(((ayVar.T / 2.0f) + (Math.max(ayVar.N, -ayVar.f4()) + ayVar.w3)) - org.telegram.messenger.i0.L(8.0f));
                ayVar.E0.l(!ayVar.F3.c(), i11);
                if (ayVar.M) {
                    f10 = 1.0f - i12;
                    ayVar.actionBar.setTranslationY(0.0f);
                } else {
                    f11 = ayVar.H0;
                }
            } else {
                ayVar.E0.setTranslationY((-org.telegram.messenger.i0.L(81.0f)) - org.telegram.messenger.i0.L(8.0f));
                ayVar.E0.setProgressToCollapse(1.0f);
                f11 = ayVar.H0;
            }
            f10 = 1.0f - f11;
            ayVar.actionBar.setTranslationY(0.0f);
        } else {
            if (ayVar.L) {
                ayVar.E0.setTranslationY((Math.max(ayVar.N, -ayVar.f4()) + (-org.telegram.messenger.i0.L(81.0f))) - org.telegram.messenger.i0.L(8.0f));
                ayVar.E0.setProgressToCollapse(1.0f);
                uw uwVar2 = ayVar.E0;
                uwVar2.setClipTop((int) (org.telegram.messenger.i0.m - uwVar2.getY()));
            }
            f10 = 1.0f - ayVar.H0;
            ayVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 == 1.0f) {
            ayVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            ayVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f15 = 1.0f - ayVar.u3;
            ayVar.actionBar.getTitlesContainer().setAlpha(f15);
            ayVar.actionBar.getTitlesContainer().setVisibility(f15 > 0.0f ? 0 : 4);
            ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f15);
            ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f15 <= 0.0f ? 4 : 0);
            return;
        }
        ayVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.i0.m);
        ayVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.i0.L(20.0f));
        float f16 = (0.6f * f14) + 0.4f;
        ayVar.actionBar.getTitlesContainer().setScaleY(f16);
        ayVar.actionBar.getTitlesContainer().setScaleX(f16);
        ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.i0.L(30.0f));
        ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
        ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
        float f17 = (1.0f - ayVar.u3) * f14;
        ayVar.actionBar.getTitlesContainer().setAlpha(f17);
        ayVar.actionBar.getTitlesContainer().setVisibility(f17 > 0.0f ? 0 : 4);
        ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        ayVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f17 <= 0.0f ? 4 : 0);
    }

    public static void X2(ay ayVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (ayVar.parentLayout == null || ayVar.actionBar == null) {
            return;
        }
        float max = Math.max(ayVar.e.e, ayVar.g4());
        float f7 = 1.0f;
        float f10 = 1.0f - ayVar.x1;
        float f11 = max * f10 * f10;
        if (f11 == 0.0f) {
            return;
        }
        if (-1 >= i10) {
            f7 = 0.0f;
            i10 = -1;
        }
        if (f7 <= 0.0f || f11 <= 0.0f || i10 <= 0 || (z4Var = ayVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) z4Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
    }

    public static /* synthetic */ void Y(ay ayVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, tL_pendingSuggestion.suggestion);
        ayVar.f5();
    }

    public static /* synthetic */ void Z(ay ayVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ayVar.u3 = floatValue;
        ayVar.e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < ayVar.actionBar.getChildCount(); i10++) {
            if (ayVar.actionBar.getChildAt(i10).getVisibility() == 0 && ayVar.actionBar.getChildAt(i10) != ayVar.actionBar.getActionMode() && ayVar.actionBar.getChildAt(i10) != ayVar.actionBar.getBackButton()) {
                ayVar.actionBar.getChildAt(i10).setAlpha(1.0f - ayVar.u3);
            }
        }
        View view = ayVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        ayVar.P3();
        ayVar.H3();
    }

    public static void a0(ay ayVar) {
        ArrayList arrayList = ayVar.I2;
        org.telegram.ui.ActionBar.z4 z4Var = ayVar.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).x()) {
            ayVar.finishPreviewFragment();
            return;
        }
        if (ayVar.R0 != 10) {
            if (org.telegram.messenger.vp.r1(ayVar.currentAccount).u2()) {
                b.b(ayVar.currentAccount);
                return;
            } else {
                ayVar.presentFragment(new ContactsActivity(a1.g.g("destroyAfterSelect", true)));
                return;
            }
        }
        if (ayVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(org.telegram.messenger.gs.a(((Long) arrayList.get(i10)).longValue(), 0L));
        }
        ayVar.C2.y(ayVar, arrayList2, null, false, ayVar.J2, ayVar.K2, ayVar.L2, null);
    }

    public static /* synthetic */ void b0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "USERPIC_SETUP");
        ayVar.f5();
    }

    public static org.telegram.ui.Cells.v2 b4(zx zxVar) {
        wx wxVar = zxVar.a;
        for (int i10 = 0; i10 < wxVar.getChildCount(); i10++) {
            View childAt = wxVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v2) {
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt;
                if (v2Var.W()) {
                    return v2Var;
                }
            }
        }
        return null;
    }

    public static void c0(ay ayVar) {
        PasskeysActivity.e0(ayVar.currentAccount, ayVar.getParentActivity(), ayVar.resourceProvider, true);
    }

    public static /* synthetic */ void d0(ay ayVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.d20.i(ayVar.currentAccount).e());
        ayVar.presentFragment(new un(bundle));
    }

    public static /* synthetic */ void e0(ay ayVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull a2 = ayVar.getMessagesController().a2(ayVar.getUserConfig().e());
        TL_account.TL_birthday tL_birthday2 = a2 != null ? a2.birthday : null;
        if (a2 != null) {
            a2.flags2 |= 32;
            a2.birthday = tL_birthday;
        }
        ayVar.getMessagesController().l2();
        ayVar.getConnectionsManager().sendRequest(updatebirthday, new aa(ayVar, a2, tL_birthday2, 8), 1024);
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "BIRTHDAY_SETUP");
        ayVar.f5();
    }

    public static void f0(ay ayVar, zx zxVar, View view, int i10) {
        int i11;
        if (view instanceof org.telegram.ui.Cells.z3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.v2;
        if (z10) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            if (v2Var.n2) {
                ayVar.Y4(v2Var.getDialogId(), view);
                return;
            }
        }
        if (ayVar.T3()) {
            ayVar.z4(view, i10, 0.0f, zxVar.d);
            return;
        }
        int i12 = ayVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.p8)) {
            zxVar.d.L();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle g10 = a1.g.g("forImport", true);
            g10.putLongArray("result", new long[]{ayVar.getUserConfig().e()});
            g10.putInt("chatType", 4);
            String string = ayVar.arguments.getString("importTitle");
            if (string != null) {
                g10.putString("title", string);
            }
            c60 c60Var = new c60(g10);
            c60Var.Y = new iw(ayVar);
            ayVar.presentFragment(c60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.d3) && ((i11 = zxVar.s) == 7 || i11 == 8)) {
            zf.k kVar = (zf.k) zxVar.d.M.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (kVar == null || kVar.a != 17) ? null : kVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.ap apVar = ayVar.getMessagesController().M[zxVar.s - 7];
                if (apVar != null) {
                    int i14 = apVar.a;
                    org.telegram.ui.Components.j00 j00Var = new org.telegram.ui.Components.j00(ayVar, false);
                    j00Var.Q1 = -1;
                    j00Var.U1 = "";
                    j00Var.V1 = new ArrayList();
                    j00Var.X1 = "";
                    j00Var.Z1 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    j00Var.a2 = arrayList;
                    j00Var.r2 = -1;
                    j00Var.u2 = -5;
                    j00Var.Q1 = i14;
                    j00Var.S1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    j00Var.Y1 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = ayVar.getMessagesController().P0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            }
                            if (((org.telegram.messenger.ap) arrayList2.get(i13)).a == i14) {
                                j00Var.U1 = ((org.telegram.messenger.ap) arrayList2.get(i13)).b;
                                break;
                            }
                            i13++;
                        }
                    }
                    j00Var.f1();
                    ayVar.showDialog(j00Var);
                    return;
                }
                return;
            }
        } else if (z10 && !ayVar.actionBar.u() && !ayVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.v2) view).Y1;
            org.telegram.messenger.i0.P.set(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        }
        ayVar.y4(view, i10, zxVar.d);
    }

    public static /* synthetic */ void g0(ay ayVar) {
        ayVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.i0.j3(ayVar.parentLayout, "newChatsRow");
    }

    public static /* synthetic */ void h0(ay ayVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.vp.r1(ayVar.currentAccount).n1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(ayVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new aa(ayVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void i0(ay ayVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, ayVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(ayVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
        if (tL_attachMenuBots != null) {
            long j10 = b02.a;
            b02.getMessagesStorage().a.c(new org.telegram.messenger.rk(b02.e, 2, j10, b02, tL_attachMenuBots));
        }
    }

    public static void i1(ay ayVar, boolean z10) {
        if (ayVar.e0 == null || ayVar.M3 == z10) {
            return;
        }
        ayVar.M3 = z10;
        int i10 = 0;
        while (true) {
            zx[] zxVarArr = ayVar.e0;
            if (i10 >= zxVarArr.length) {
                return;
            }
            if (z10) {
                zxVarArr[i10].a.setScrollbarFadingEnabled(false);
            }
            ayVar.e0[i10].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                ayVar.e0[i10].a.setScrollbarFadingEnabled(true);
            }
            i10++;
        }
    }

    public static void j0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).f7.edit().putBoolean("storyhint", false).commit();
    }

    public static /* synthetic */ void k0(ay ayVar) {
        if (ayVar.a4.g()) {
            org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "USERPIC_SETUP");
            ayVar.f5();
        }
    }

    public static /* synthetic */ void m0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "PREMIUM_GRACE");
        ayVar.f5();
    }

    public static /* synthetic */ void n0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "SETUP_PASSKEY");
        ayVar.f5();
    }

    public static void o0(ay ayVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.s4.e0(ayVar.currentAccount, tL_error, ayVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            ayVar.getNotificationCenter().k(org.telegram.messenger.zs.v1, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        ayVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        bi.e eVar = new bi.e(ayVar, j10, 14);
        Pattern pattern = org.telegram.ui.Components.s4.a;
        if (ayVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = ayVar.getCurrentAccount();
            Activity parentActivity = ayVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long e7 = org.telegram.messenger.d20.i(currentAccount).e();
            TextView textView = new TextView(parentActivity);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var.u(org.telegram.messenger.i0.L(12.0f));
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(parentActivity);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
            frameLayout.addView(g9Var, w7.b6.d(40, 40.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(org.telegram.messenger.cd.L0(2131749254, null));
            boolean z10 = org.telegram.messenger.cd.X;
            frameLayout.addView(textView2, w7.b6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                r8Var.q(chat);
                g9Var.e(chat, r8Var);
            } else if (org.telegram.messenger.h20.z(user)) {
                r8Var.p = 0.8f;
                r8Var.g(12);
                g9Var.j(null, null, r8Var, user);
            } else if (user.id == e7) {
                r8Var.p = 0.8f;
                r8Var.g(1);
                g9Var.j(null, null, r8Var, user);
            } else {
                r8Var.p = 1.0f;
                r8Var.r(user);
                g9Var.e(user, r8Var);
            }
            textView.setText(org.telegram.messenger.i0.W2(str));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131749274, null), new org.telegram.ui.Components.t(eVar, 3));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            ayVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void o4(un unVar, org.telegram.messenger.jj jjVar) {
        if (jjVar == null || !jjVar.s2()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(jjVar.z) ? jjVar.z : jjVar.v;
            CharSequence x12 = org.telegram.messenger.i0.x1(charSequence, jjVar.Y1, null);
            if (x12 instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                org.telegram.ui.Components.l00[] l00VarArr = (org.telegram.ui.Components.l00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.l00.class);
                if (l00VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(l00VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(l00VarArr[0]);
                    for (int i10 = 1; i10 < l00VarArr.length; i10++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(l00VarArr[i10]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(l00VarArr[i10]);
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
                    unVar.Eb(jjVar.M1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public static void p0(ay ayVar, int i10) {
        Object obj;
        org.telegram.ui.Components.um0 um0Var = ayVar.C0.q0;
        if (i10 < um0Var.Z || i10 >= um0Var.a0) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.a51 G = um0Var.G(i10);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ayVar.getParentActivity(), ayVar.resourceProvider);
            String L0 = org.telegram.messenger.cd.L0(2131754180, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131754179, "\"" + org.telegram.messenger.h20.p(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new rv(1, ayVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void q0(ay ayVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i10 != 102) {
            ayVar.C4(arrayList, i10, false, false, null);
            return;
        }
        ayVar.getMessagesController().s0 = true;
        ayVar.C4(arrayList, i10, false, false, z10 ? hashSet : null);
        org.telegram.messenger.vp messagesController = ayVar.getMessagesController();
        messagesController.s0 = false;
        messagesController.getNotificationCenter().k(org.telegram.messenger.zs.s, Boolean.TRUE);
        ayVar.getMessagesController().J(ayVar.W2);
        int i11 = ayVar.W2;
        if (i11 == 0 || ayVar.c4(ayVar.currentAccount, ayVar.e0[0].s, i11, false).size() != 0) {
            return;
        }
        ayVar.e0[0].a.setEmptyView(null);
        ayVar.e0[0].x.setVisibility(4);
        ayVar.finishFragment();
    }

    public static void s0(ay ayVar, int i10, org.telegram.ui.Components.z60 z60Var) {
        if (ayVar.currentAccount == i10) {
            return;
        }
        z60Var.u();
        if (ayVar.getParentActivity() == null) {
            return;
        }
        ux uxVar = ayVar.C2;
        LaunchActivity launchActivity = (LaunchActivity) ayVar.getParentActivity();
        ArrayList arrayList = ayVar.D2;
        String str = ayVar.E2;
        CharSequence charSequence = ayVar.F2;
        ow owVar = ayVar.B1;
        CharSequence fieldText = owVar != null ? owVar.getFieldText() : null;
        launchActivity.O0(i10);
        ay ayVar2 = new ay(ayVar.arguments);
        ayVar2.C2 = uxVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                ayVar2.P4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    ayVar2.F2 = null;
                } else {
                    ayVar2.F2 = charSequence;
                    ayVar2.E2 = null;
                    ayVar2.D2 = null;
                    if (ayVar2.B1 != null) {
                        ayVar2.u3(fieldText);
                    } else {
                        ayVar2.U3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            ayVar2.D2 = null;
        } else {
            ayVar2.D2 = arrayList;
            ayVar2.E2 = null;
            ayVar2.M2 = false;
            if (ayVar2.B1 != null) {
                ayVar2.u3(fieldText);
            } else {
                ayVar2.U3 = fieldText;
            }
        }
        launchActivity.u0(ayVar2, false, true);
    }

    public static /* synthetic */ void t0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, ayVar.A3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        ayVar.f5();
    }

    public static void t1(ay ayVar, zx zxVar, float f7) {
        if (ayVar.T == f7) {
            return;
        }
        ayVar.T = f7;
        if (f7 == 0.0f) {
            ayVar.U = false;
        }
        ayVar.E0.setOverscroll(f7);
        zxVar.a.setViewsOffset(f7);
        zxVar.a.setOverScrollMode(f7 != 0.0f ? 2 : 0);
        ayVar.fragmentView.invalidate();
        if (f7 <= org.telegram.messenger.i0.L(90.0f) || ayVar.U) {
            return;
        }
        uw uwVar = ayVar.E0;
        ValueAnimator valueAnimator = uwVar.H0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            uwVar.i(uwVar.p0, true);
            ayVar.U = true;
            ayVar.getOrCreateStoryViewer().G(new fv(ayVar, 4));
        }
    }

    public static void t4(org.telegram.messenger.c cVar) {
        int i10 = cVar.a;
        boolean[] zArr = y4;
        if (zArr[i10]) {
            return;
        }
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        r12.V2();
        r12.S2(0, 0, 100, true, null);
        if (r12.s.isEmpty() && !TextUtils.isEmpty(r12.T3)) {
            TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
            tL_help_getRecentMeUrls.referer = r12.T3;
            r12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.tj(r12, 4));
        }
        r12.e3(org.telegram.messenger.d20.i(i10).f(), false, 0);
        org.telegram.messenger.i5.r(i10).f();
        org.telegram.messenger.ui.b0(i10).u(false);
        org.telegram.messenger.i0.h3(new rh(cVar, 19), 200L);
        Iterator it = r12.e4.iterator();
        while (it.hasNext()) {
            org.telegram.messenger.ui.b0(i10).c1((String) it.next(), true, true);
        }
        zArr[i10] = true;
    }

    public static void u0(ay ayVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            te1.a(ayVar.getParentActivity(), new w(ayVar, tL_attachMenuBot, launchActivity, 7), null);
        } else {
            LaunchActivity.G0(launchActivity, ayVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static boolean u1(ay ayVar, zx zxVar) {
        if (ayVar.F3.c()) {
            return false;
        }
        int i10 = (int) (-ayVar.N);
        int e42 = ayVar.e4();
        int f42 = ayVar.f4();
        if (i10 == 0 || i10 == e42 || i10 == f42 || !zxVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (f42 >= i10 || i10 >= e42) {
            if ((ayVar.u3 != 1.0f ? Utilities.i((-ayVar.N) / org.telegram.messenger.i0.L(81.0f), 1.0f, 0.0f) : 1.0f) < ayVar.E0.B0) {
                zxVar.b.y(-i10);
                return true;
            }
            zxVar.b.y(f42 - i10);
            return true;
        }
        int L = org.telegram.messenger.i0.L(48.0f);
        int i11 = i10 - f42;
        if (i11 < L / 2) {
            zxVar.b.y(-i11);
            return true;
        }
        zxVar.b.y(L - i11);
        return true;
    }

    public static void v0(ay ayVar) {
        b.c(ayVar.currentAccount, ayVar.getParentActivity(), ayVar.getResourceProvider());
    }

    public static String v2(ay ayVar) {
        ArrayList arrayList = ayVar.I2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return org.telegram.messenger.cd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
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
            if (longValue == ayVar.getUserConfig().e()) {
                sb2.append(org.telegram.messenger.cd.L0(2131745918, null));
            } else {
                sb2.append(arrayList.size() == 1 ? org.telegram.messenger.o5.l(ayVar.currentAccount, longValue) : org.telegram.messenger.o5.s(ayVar.currentAccount, longValue));
            }
        }
        return org.telegram.messenger.cd.a0(null, null, 2131745457, sb2.toString());
    }

    public static void w0(final int i10, final long j10, TLRPC.Chat chat, final ay ayVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        ayVar.m4(false);
        if (i10 == 103 && org.telegram.messenger.w3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.w3.t0(chat2)) {
                ayVar.getMessagesController().X(2, j10, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i13 = ayVar.W2) != 0 && ayVar.c4(ayVar.currentAccount, ayVar.e0[0].s, i13, false).size() == 1) {
            ayVar.e0[0].x.setVisibility(4);
        }
        int i14 = -1;
        if (i10 == 102) {
            ayVar.L4(true, true);
            if (ayVar.R1 != null) {
                i12 = 0;
                while (i12 < ayVar.R1.size()) {
                    if (((TLRPC.Dialog) ayVar.R1.get(i12)).id == j10) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            i12 = -1;
            ayVar.y3();
            i11 = i12;
        } else {
            i11 = -1;
        }
        UndoView j42 = ayVar.j4();
        if (j42 != null) {
            j42.j(i10 == 103 ? 0 : z11 ? 1 : 95, j10, new Runnable() { // from class: org.telegram.ui.xv
                @Override // java.lang.Runnable
                public final void run() {
                    ayVar.B4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(ayVar.c4(ayVar.currentAccount, ayVar.e0[0].s, ayVar.W2, false));
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
            if (i11 < 0 || i14 >= 0 || (arrayList = ayVar.R1) == null) {
                ayVar.L4(false, true);
                return;
            }
            arrayList.remove(i11);
            ayVar.e0[0].y.D();
            ayVar.e0[0].q(true);
        }
    }

    public static void x0(ay ayVar) {
        org.telegram.messenger.y1 a2 = org.telegram.messenger.y1.a(ayVar.currentAccount);
        int i10 = a2.a;
        Set<String> set = a2.d;
        org.telegram.messenger.w1 w1Var = a2.c;
        if (w1Var != null && !set.contains(w1Var.a)) {
            set.add(a2.c.a);
            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(i10).f7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.zs.f(i10).k(org.telegram.messenger.zs.g5, new Object[0]);
        }
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "BIRTHDAY_CONTACTS_TODAY");
        ayVar.f5();
        org.telegram.ui.Components.wb G = org.telegram.ui.Components.cc.a0(ayVar).G(R.raw.gift, 4, org.telegram.messenger.cd.L0(2131753330, null));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void y0(ay ayVar) {
        org.telegram.messenger.vp.r1(ayVar.currentAccount).h4(0L, "PREMIUM_RESTORE");
        ayVar.f5();
    }

    public static void z0(ay ayVar) {
        if (ayVar.N3) {
            vh.p2 p2Var = ayVar.p0;
            if (p2Var != null) {
                p2Var.e(true);
            }
            j4.w o10 = org.telegram.messenger.vp.r1(ayVar.currentAccount).O1().o();
            if (o10 != null && o10.a(ayVar.currentAccount, 1)) {
                ayVar.showDialog(new kg.q0(o10.b(), ayVar.currentAccount, ayVar.getParentActivity(), ayVar, null));
                return;
            } else {
                vh.o8 D = vh.o8.D(ayVar.getParentActivity(), ayVar.currentAccount);
                D.y = new iw(ayVar);
                D.Q(null);
                return;
            }
        }
        vh.p2 p2Var2 = ayVar.q0;
        if (p2Var2 != null) {
            if (p2Var2.V) {
                return;
            } else {
                org.telegram.messenger.i0.E2(p2Var2);
            }
        }
        SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(org.telegram.messenger.cd.M0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.t6.uj, 0, new fv(ayVar, 24), null);
        vh.p2 p2Var3 = new vh.p2(ayVar.getParentActivity(), 2);
        p2Var3.q(8.0f);
        p2Var3.d = 8000L;
        p2Var3.i(true);
        p2Var3.p(true);
        p2Var3.h = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(148.0f);
        p2Var3.s(R2);
        p2Var3.l(1.0f, -40.0f);
        p2Var3.h(ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.tj));
        ayVar.q0 = p2Var3;
        p2Var3.setTranslationY((-ayVar.f4) - ayVar.h4);
        ((ViewGroup) ayVar.fragmentView).addView(ayVar.q0, w7.b6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        ayVar.q0.u();
    }

    public final void A3(boolean z10) {
        zh.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.zr zrVar = this.J1;
        if (zrVar == null || (jVar = this.Q1) == null || (chatFull = this.a3) == null) {
            return;
        }
        zrVar.i(jVar, (this.Y2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.Q1.setTitle(org.telegram.messenger.cd.G(this.a3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
    }

    public final void A4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (org.telegram.messenger.d20.i(i10).p()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new f6(24));
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
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
                int i12 = org.telegram.ui.ActionBar.t6.i6;
                Drawable a02 = org.telegram.ui.ActionBar.t6.a0(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.a7.k(linearLayout, a02, null, N, resourceProvider);
                TLRPC.User f7 = org.telegram.messenger.d20.i(intValue).f();
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                r8Var.r(f7);
                kg.x xVar = new kg.x(this, getParentActivity(), z10);
                linearLayout.addView(xVar, w7.b6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getParentActivity());
                if (z10) {
                    g9Var.setScaleX(0.833f);
                    g9Var.setScaleY(0.833f);
                }
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(16.0f));
                g9Var.getImageReceiver().d = intValue;
                g9Var.e(f7, r8Var);
                xVar.addView(g9Var, w7.b6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, getResourceProvider());
                textView.setText(org.telegram.messenger.h20.p(f7));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.b6.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new jg.w1(this, intValue, H, 14));
                H.r(linearLayout, w7.b6.o(org.telegram.messenger.zs.G3, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.t6.d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
        H.z.set(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
        H.W(d02);
        H.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
        H.V(5);
        H.Z();
    }

    @Override // org.telegram.ui.of0
    public final hi.f B() {
        return this.l4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (getMessagesController().b2.get(r14.W2) != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B3(zx zxVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        int L0 = zxVar.c.L0();
        int N0 = zxVar.c.N0();
        if (this.h3 || this.m3) {
            return;
        }
        qx qxVar = this.z0;
        if (qxVar != null && qxVar.getVisibility() == 0 && this.z0.O) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            s4.c1 K = zxVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.b2 = z14;
            if (z14) {
                n4(false);
            }
        } else {
            this.b2 = false;
        }
        int i11 = zxVar.s;
        if (i11 == 7 || i11 == 8) {
            ArrayList S0 = getMessagesController().S0();
            int i12 = zxVar.h;
            if (i12 >= 0 && i12 < S0.size()) {
                int i13 = ((org.telegram.messenger.ap) S0.get(zxVar.h)).g;
                int i14 = org.telegram.messenger.vp.D8;
                if ((i13 & 128) == 0 && ((abs > 0 && N0 >= c4(this.currentAccount, zxVar.s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().b2.get(1)))) {
                    boolean z15 = getMessagesController().b2.get(1);
                    boolean z16 = !z15;
                    z10 = (z15 && getMessagesController().c2.get(1)) ? false : true;
                    z11 = z16;
                    if (abs > 0 || N0 < c4(this.currentAccount, zxVar.s, this.W2, this.S1).size() - 10) {
                        if (abs == 0 && ((i10 = zxVar.s) == 7 || i10 == 8)) {
                        }
                        z12 = false;
                        z13 = false;
                        if (!z12 || z10) {
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.zv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ay ayVar = ay.this;
                                    if (z12) {
                                        ayVar.getMessagesController().S2(ayVar.W2, -1, 100, z13, null);
                                    }
                                    if (z10) {
                                        ayVar.getMessagesController().S2(1, -1, 100, z11, null);
                                    }
                                }
                            });
                        }
                        return;
                    }
                    boolean z17 = getMessagesController().b2.get(this.W2);
                    boolean z18 = !z17;
                    if (z17) {
                        if (getMessagesController().c2.get(this.W2)) {
                            z13 = z18;
                            z12 = false;
                            if (z12) {
                            }
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.zv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ay ayVar = ay.this;
                                    if (z12) {
                                        ayVar.getMessagesController().S2(ayVar.W2, -1, 100, z13, null);
                                    }
                                    if (z10) {
                                        ayVar.getMessagesController().S2(1, -1, 100, z11, null);
                                    }
                                }
                            });
                        }
                    }
                    z13 = z18;
                    z12 = true;
                    if (z12) {
                    }
                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.zv
                        @Override // java.lang.Runnable
                        public final void run() {
                            ay ayVar = ay.this;
                            if (z12) {
                                ayVar.getMessagesController().S2(ayVar.W2, -1, 100, z13, null);
                            }
                            if (z10) {
                                ayVar.getMessagesController().S2(1, -1, 100, z11, null);
                            }
                        }
                    });
                }
            }
        }
        z10 = false;
        z11 = false;
        if (abs > 0) {
        }
        if (abs == 0) {
        }
        z12 = false;
        z13 = false;
        if (z12) {
        }
        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.zv
            @Override // java.lang.Runnable
            public final void run() {
                ay ayVar = ay.this;
                if (z12) {
                    ayVar.getMessagesController().S2(ayVar.W2, -1, 100, z13, null);
                }
                if (z10) {
                    ayVar.getMessagesController().S2(1, -1, 100, z11, null);
                }
            }
        });
    }

    public final void B4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().X(1, j10, z11);
            return;
        }
        if (chat == null) {
            getMessagesController().X(0, j10, z11);
            if (z10 && z11) {
                getMessagesController().w(j10);
            }
        } else if (org.telegram.messenger.w3.r0(chat)) {
            getMessagesController().X(0, j10, z11);
        } else {
            getMessagesController().g0(-j10, getMessagesController().Z1(Long.valueOf(getUserConfig().e())), null, z11, false);
        }
        if (org.telegram.messenger.i0.Q1()) {
            getNotificationCenter().k(org.telegram.messenger.zs.t, Long.valueOf(j10));
        }
        getMessagesController().J(this.W2);
    }

    public final void C3() {
        getMessagesStorage().getClass();
    }

    public final void C4(ArrayList arrayList, int i10, boolean z10, boolean z11, HashSet hashSet) {
        boolean z12;
        int i11;
        int i12;
        HashSet hashSet2;
        ArrayList arrayList2;
        int i13;
        long j10;
        int i14;
        int i15;
        int i16;
        TLRPC.Chat L0;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.User user;
        org.telegram.messenger.ap apVar;
        int i17;
        int i18;
        int i19;
        long j11;
        boolean z13;
        int i20;
        org.telegram.ui.ActionBar.z2 z2Var;
        boolean z14;
        int i21;
        TLRPC.User Z1;
        TLRPC.User user2;
        String L02;
        int i22;
        ay ayVar = this;
        int i23 = i10;
        if (ayVar.getParentActivity() == null) {
            return;
        }
        int i24 = ayVar.e0[0].s;
        boolean z15 = (i24 == 7 || i24 == 8) && (!ayVar.actionBar.u() || ayVar.actionBar.w(null));
        org.telegram.messenger.ap apVar2 = z15 ? ayVar.getMessagesController().M[ayVar.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
        int size = arrayList.size();
        if (i23 == 105 || i23 == 107) {
            ArrayList arrayList3 = new ArrayList(arrayList);
            ayVar.getMessagesController().e(arrayList3, ayVar.T2 == 0 ? 1 : 0, -1, null, 0L);
            if (ayVar.T2 == 0) {
                SharedPreferences d12 = org.telegram.messenger.vp.d1();
                z12 = false;
                boolean z16 = d12.getBoolean("archivehint_l", false) || org.telegram.messenger.tz.q1;
                if (z16) {
                    i11 = 1;
                } else {
                    i11 = 1;
                    d12.edit().putBoolean("archivehint_l", true).commit();
                }
                int i25 = z16 ? arrayList3.size() > i11 ? 4 : 2 : arrayList3.size() > i11 ? 5 : 3;
                UndoView j42 = ayVar.j4();
                if (j42 != null) {
                    j42.l(0L, i25, null, new xs(6, ayVar, arrayList3));
                }
            } else {
                z12 = false;
                ArrayList V0 = ayVar.getMessagesController().V0(ayVar.W2);
                if (ayVar.e0 != null && V0.isEmpty() && !ayVar.K) {
                    ayVar.e0[0].a.setEmptyView(null);
                    ayVar.e0[0].x.setVisibility(4);
                    ayVar.finishFragment();
                }
            }
            ayVar.m4(z12);
            return;
        }
        if ((i23 == 100 || i23 == 108) && ayVar.O2 != 0) {
            ArrayList V02 = ayVar.getMessagesController().V0(ayVar.W2);
            int size2 = V02.size();
            int i26 = 0;
            int i27 = 0;
            i12 = 100;
            int i28 = 0;
            while (i28 < size2) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) V02.get(i28);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!ayVar.r4(dialog)) {
                        i13 = i28;
                        if (!ayVar.getMessagesController().B2(dialog.id, false)) {
                            break;
                        }
                    } else {
                        i13 = i28;
                        if (org.telegram.messenger.o5.C(dialog.id)) {
                            i27++;
                        } else {
                            i26++;
                        }
                    }
                } else {
                    i13 = i28;
                }
                i28 = i13 + 1;
            }
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            for (int i32 = 0; i32 < size; i32++) {
                Long l4 = (Long) arrayList.get(i32);
                int i33 = i31;
                long longValue = l4.longValue();
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) ayVar.getMessagesController().Q.f(longValue);
                if (dialog2 != null && !ayVar.r4(dialog2)) {
                    if (org.telegram.messenger.o5.C(longValue)) {
                        i30++;
                    } else {
                        i29++;
                    }
                    if (apVar2 != null && apVar2.h.contains(l4)) {
                        i31 = i33 + 1;
                    }
                }
                i31 = i33;
            }
            int i34 = i31;
            int size3 = z15 ? 100 - apVar2.h.size() : (ayVar.W2 == 0 && apVar2 == null) ? ayVar.getUserConfig().q() ? ayVar.getMessagesController().R4 : ayVar.getMessagesController().Q4 : org.telegram.messenger.d20.i(ayVar.currentAccount).q() ? ayVar.getMessagesController().l3 : ayVar.getMessagesController().k3;
            if (i30 + i27 > size3 || (i29 + i26) - i34 > size3) {
                if (ayVar.W2 == 0 && apVar2 == null) {
                    showDialog(new kg.q0(0, ayVar.currentAccount, ayVar.getParentActivity(), this, null));
                    return;
                } else {
                    org.telegram.ui.Components.s4.t0(ayVar, null, org.telegram.messenger.cd.a0("PinFolderLimitReached", null, 2131747263, org.telegram.messenger.cd.G(size3, "Chats", new Object[0])), null);
                    return;
                }
            }
            hashSet2 = hashSet;
            arrayList2 = arrayList;
        } else {
            i12 = 100;
            if (i23 != 111) {
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                if ((i23 == 102 || i23 == 103) && size > 1 && z10) {
                    HashSet hashSet3 = new HashSet();
                    boolean z17 = org.telegram.messenger.vp.r1(ayVar.currentAccount).c3;
                    long j12 = org.telegram.messenger.vp.r1(ayVar.currentAccount).b3;
                    if (i23 == 102 && z17 && j12 == 2147483647L) {
                        int size4 = arrayList2.size();
                        z14 = false;
                        int i35 = 0;
                        while (i35 < size4) {
                            int i36 = i35 + 1;
                            Long l10 = (Long) arrayList2.get(i35);
                            if (org.telegram.messenger.o5.E(l10.longValue()) || org.telegram.messenger.o5.C(l10.longValue())) {
                                if (org.telegram.messenger.o5.C(l10.longValue())) {
                                    TLRPC.EncryptedChat Z0 = ayVar.getMessagesController().Z0(Integer.valueOf((int) (l10.longValue() & 4294967295L)));
                                    Z1 = Z0 != null ? ayVar.getMessagesController().Z1(Long.valueOf(Z0.user_id)) : null;
                                } else {
                                    Z1 = ayVar.getMessagesController().Z1(l10);
                                }
                                if (Z1 != null) {
                                    ArrayList arrayList4 = (ArrayList) org.telegram.messenger.vp.r1(ayVar.currentAccount).R.f(Z1.id);
                                    boolean z18 = (arrayList4 == null || arrayList4.size() != 1 || arrayList4.get(0) == null || ((org.telegram.messenger.jj) arrayList4.get(0)).k == null || (!(((org.telegram.messenger.jj) arrayList4.get(0)).k.action instanceof TLRPC.TL_messageActionUserJoined) && !(((org.telegram.messenger.jj) arrayList4.get(0)).k.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                    if (!Z1.bot && !org.telegram.messenger.h20.x(Z1) && Z1.id != ayVar.getUserConfig().e() && !z18) {
                                        hashSet3.add(l10);
                                        z14 = true;
                                    }
                                }
                            }
                            i35 = i36;
                        }
                    } else {
                        z14 = false;
                    }
                    boolean z19 = i23 == 102;
                    int i37 = ayVar.R2;
                    mg.i0 i0Var = new mg.i0(ayVar, arrayList2, i23, hashSet3);
                    org.telegram.ui.ActionBar.p6 p6Var = ayVar.resourceProvider;
                    Pattern pattern = org.telegram.ui.Components.s4.a;
                    int currentAccount = ayVar.getCurrentAccount();
                    Activity parentActivity = ayVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, p6Var);
                    org.telegram.messenger.d20.i(currentAccount).e();
                    org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                    boolean[] zArr = new boolean[1];
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                    org.telegram.ui.Components.g3 g3Var = new org.telegram.ui.Components.g3(parentActivity, c2VarArr, 0);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.G = 6;
                    alertDialog$Builder.o(g3Var);
                    TextView textView2 = new TextView(parentActivity);
                    boolean z20 = z19;
                    boolean z21 = z14;
                    org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    if (z20) {
                        if (z21) {
                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, p6Var);
                            c2VarArr[0] = c2Var;
                            c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                            c2VarArr[0].e(org.telegram.messenger.cd.L0(2131751528, null), "", false, false, false);
                            i21 = 0;
                            c2VarArr[0].setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                            g3Var.addView(c2VarArr[0], w7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            c2VarArr[0].setOnClickListener(new org.telegram.ui.Components.x0(i21, zArr));
                        } else {
                            i21 = 0;
                        }
                        Object[] objArr = new Object[1];
                        objArr[i21] = org.telegram.messenger.cd.G(size, "ChatsSelected", new Object[i21]);
                        textView2.setText(org.telegram.messenger.cd.a0("DeleteFewChatsTitle", null, 2131751542, objArr));
                        textView.setText(org.telegram.messenger.cd.L0(2131754102, "AreYouSureDeleteFewChats"));
                    } else if (i37 != 0) {
                        textView2.setText(org.telegram.messenger.cd.a0("ClearCacheFewChatsTitle", null, 2131752097, org.telegram.messenger.cd.G(size, "ChatsSelectedClearCache", new Object[0])));
                        textView.setText(org.telegram.messenger.cd.L0(2131754115, "AreYouSureClearHistoryCacheFewChats"));
                    } else {
                        textView2.setText(org.telegram.messenger.cd.a0("ClearFewChatsTitle", null, 2131752092, org.telegram.messenger.cd.G(size, "ChatsSelectedClear", new Object[0])));
                        textView.setText(org.telegram.messenger.cd.L0(2131754113, "AreYouSureClearHistoryFewChats"));
                    }
                    g3Var.addView(textView2, w7.b6.d(-1, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                    g3Var.addView(textView, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                    alertDialog$Builder.k(z20 ? org.telegram.messenger.cd.L0(2131751599, "Delete") : i37 != 0 ? org.telegram.messenger.cd.L0(2131752088, "ClearHistoryCache") : org.telegram.messenger.cd.L0(2131752089, "ClearHistory"), new ng.d(23, i0Var, zArr));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                    ayVar.showDialog(x1Var);
                    TextView textView3 = (TextView) x1Var.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.q7, null);
                        return;
                    }
                    return;
                }
                int i38 = 48;
                if (i23 == 106 && z10) {
                    if (size == 1) {
                        Long l11 = (Long) arrayList2.get(0);
                        l11.getClass();
                        user2 = ayVar.getMessagesController().Z1(l11);
                    } else {
                        user2 = null;
                    }
                    boolean z22 = ayVar.S2 != 0;
                    rv rvVar = new rv(0, ayVar, arrayList2);
                    Pattern pattern2 = org.telegram.ui.Components.s4.a;
                    if (ayVar.getParentActivity() != null) {
                        if (size == 1 && user2 == null) {
                            return;
                        }
                        Activity parentActivity2 = ayVar.getParentActivity();
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity2);
                        org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[2];
                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder2.o(linearLayout);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                        if (size == 1) {
                            String m10 = org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name);
                            x1Var2.R = org.telegram.messenger.cd.a0("BlockUserTitle", null, 2131753685, m10);
                            L02 = org.telegram.messenger.cd.L0(2131753692, null);
                            x1Var2.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("BlockUserMessage", null, 2131753688, m10));
                        } else {
                            x1Var2.R = org.telegram.messenger.cd.a0("BlockUserTitle", null, 2131753685, org.telegram.messenger.cd.G(size, "UsersCountTitle", new Object[0]));
                            L02 = org.telegram.messenger.cd.L0(2131753684, null);
                            x1Var2.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("BlockUsersMessage", null, 2131753683, org.telegram.messenger.cd.G(size, "UsersCount", new Object[0])));
                        }
                        boolean[] zArr2 = {true, true};
                        int i39 = 0;
                        for (int i40 = 2; i39 < i40; i40 = 2) {
                            if (i39 != 0 || z22) {
                                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(parentActivity2, 1);
                                c2VarArr2[i39] = c2Var2;
                                c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                                if (i39 == 0) {
                                    c2VarArr2[i39].e(org.telegram.messenger.cd.L0(2131746217, null), "", true, false, false);
                                } else {
                                    c2VarArr2[i39].e(org.telegram.messenger.cd.L0(size == 1 ? 2131751482 : 2131751484, null), "", true, false, false);
                                }
                                c2VarArr2[i39].setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                                i22 = i38;
                                linearLayout.addView(c2VarArr2[i39], w7.b6.o(-1, i22));
                                c2VarArr2[i39].setOnClickListener(new bh.f(zArr2, i39, 5));
                            } else {
                                i22 = i38;
                            }
                            i39++;
                            i38 = i22;
                        }
                        alertDialog$Builder2.k(L02, new ng.d(25, rvVar, zArr2));
                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        ayVar.showDialog(x1Var2);
                        TextView textView4 = (TextView) x1Var2.d(-1);
                        if (textView4 != null) {
                            org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.q7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (z10) {
                    org.telegram.ui.Components.s4.u0(this, org.telegram.messenger.cd.L0(2131751846, null), org.telegram.messenger.cd.L0(2131751844, null), org.telegram.messenger.cd.L0(2131751845, null), true, new qv(ayVar, arrayList, i23, z11, hashSet));
                    return;
                }
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                int size5 = arrayList2.size();
                int i41 = 0;
                while (i41 < size5) {
                    Object obj = arrayList2.get(i41);
                    i41++;
                    ayVar.getMessagesController().b5(-((Long) obj).longValue(), false);
                }
            }
        }
        int i42 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (apVar2 != null) {
            LongSparseIntArray longSparseIntArray = apVar2.j;
            if ((i23 == i12 || i23 == 108) && ayVar.O2 != 0) {
                int size6 = longSparseIntArray.size();
                for (int i43 = 0; i43 < size6; i43++) {
                    i42 = Math.min(i42, longSparseIntArray.valueAt(i43));
                }
                i42 -= ayVar.O2;
            }
        }
        int i44 = i42;
        int i45 = 0;
        int i46 = 0;
        while (i45 < size) {
            Long l12 = (Long) arrayList2.get(i45);
            long longValue2 = l12.longValue();
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) ayVar.getMessagesController().Q.f(longValue2);
            if (dialog3 == null) {
                i17 = i44;
                apVar = apVar2;
            } else {
                if (org.telegram.messenger.o5.C(longValue2)) {
                    i16 = i44;
                    encryptedChat = ayVar.getMessagesController().Z0(Integer.valueOf((int) (longValue2 & 4294967295L)));
                    if (encryptedChat != null) {
                        user = ayVar.getMessagesController().Z1(Long.valueOf(encryptedChat.user_id));
                        l12 = l12;
                    } else {
                        user = new TLRPC.TL_userEmpty();
                    }
                    L0 = null;
                } else {
                    i16 = i44;
                    if (org.telegram.messenger.o5.E(longValue2)) {
                        l12 = l12;
                        user = ayVar.getMessagesController().Z1(l12);
                        L0 = null;
                        encryptedChat = null;
                    } else {
                        l12 = l12;
                        L0 = ayVar.getMessagesController().L0(Long.valueOf(-longValue2));
                        encryptedChat = null;
                        user = null;
                    }
                }
                if (L0 != null || user != null) {
                    boolean z23 = (user == null || !user.bot || org.telegram.messenger.vp.E2(user)) ? false : true;
                    if (i23 == 100 || i23 == 108) {
                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                        if (ayVar.O2 != 0) {
                            if (!ayVar.r4(dialog3)) {
                                i46++;
                                apVar = apVar2;
                                i17 = i16;
                                i18 = i10;
                                ayVar.D4(longValue2, true, apVar, i17, size == 1);
                                if (apVar != null) {
                                    int i47 = i17 + 1;
                                    if (encryptedChat2 != null) {
                                        if (!apVar.h.contains(Long.valueOf(encryptedChat2.user_id))) {
                                            apVar.h.add(Long.valueOf(encryptedChat2.user_id));
                                        }
                                    } else if (!apVar.h.contains(Long.valueOf(dialog3.id))) {
                                        apVar.h.add(Long.valueOf(dialog3.id));
                                    }
                                    i17 = i47;
                                }
                            }
                            apVar = apVar2;
                            i17 = i16;
                            i18 = i10;
                        } else {
                            apVar = apVar2;
                            i17 = i16;
                            i18 = i10;
                            if (ayVar.r4(dialog3)) {
                                i46++;
                                ayVar.D4(longValue2, false, apVar, i17, size == 1);
                                i45++;
                                i44 = i17;
                                i23 = i18;
                                apVar2 = apVar;
                            }
                        }
                        i45++;
                        i44 = i17;
                        i23 = i18;
                        apVar2 = apVar;
                    } else if (i23 == 101) {
                        if (ayVar.N2 != 0) {
                            ayVar.u4(longValue2);
                        } else {
                            ayVar.getMessagesController().i3(longValue2, null, 0L);
                        }
                    } else if (i23 == 102 || i23 == 103) {
                        ay ayVar2 = ayVar;
                        if (size == 1) {
                            if (i23 != 102 || !ayVar2.V2) {
                                TLRPC.Chat chat = L0;
                                org.telegram.ui.Components.s4.r(this, i23 == 103, chat, user, org.telegram.messenger.o5.C(dialog3.id), i23 == 102, false, false, new sv(ayVar2, i23, chat, longValue2, z23));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ayVar2.getParentActivity());
                            String L03 = org.telegram.messenger.cd.L0(2131746612, null);
                            org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
                            x1Var3.R = L03;
                            x1Var3.T = org.telegram.messenger.cd.L0(2131746613, null);
                            alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131746614, null), new iv(ayVar2, 7));
                            alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            ayVar2.showDialog(x1Var3);
                            return;
                        }
                        ayVar = ayVar2;
                        boolean z24 = z23;
                        TLRPC.Chat chat2 = L0;
                        int i48 = i23;
                        if (ayVar.getMessagesController().B2(longValue2, true)) {
                            ayVar.getMessagesController().i2();
                            apVar = apVar2;
                            i17 = i16;
                        } else if (i48 != 103 || ayVar.R2 == 0) {
                            if (hashSet2 == null || !hashSet2.contains(l12)) {
                                i19 = i48;
                                j11 = longValue2;
                                z13 = false;
                            } else {
                                i19 = i48;
                                j11 = longValue2;
                                z13 = true;
                            }
                            ayVar.B4(i19, j11, chat2, z24, z13);
                            apVar = apVar2;
                            i17 = i16;
                            i18 = i10;
                            i45++;
                            i44 = i17;
                            i23 = i18;
                            apVar2 = apVar;
                        } else {
                            ayVar.getMessagesController().X(2, longValue2, false);
                            apVar = apVar2;
                            i17 = i16;
                        }
                        i18 = i48;
                        i45++;
                        i44 = i17;
                        i23 = i18;
                        apVar2 = apVar;
                    } else if (i23 == 104) {
                        int i49 = 1;
                        if (size == 1 && ayVar.P2 == 1) {
                            ay ayVar3 = ayVar;
                            ayVar3.showDialog(org.telegram.ui.Components.s4.E(longValue2, 0L, ayVar3, null), new ov(ayVar3, i49));
                            return;
                        }
                        ay ayVar4 = ayVar;
                        if (ayVar4.Q2 != 0) {
                            if (ayVar4.getMessagesController().q2(longValue2, 0L, null)) {
                                ayVar4.getNotificationsController().T(longValue2, 4, 0L);
                            }
                            ayVar = ayVar4;
                        } else {
                            if (z11) {
                                Pattern pattern3 = org.telegram.ui.Components.s4.a;
                                if (ayVar4.getParentActivity() == null) {
                                    z2Var = null;
                                    i20 = 2;
                                } else {
                                    org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(ayVar4.getParentActivity(), false, 1, null);
                                    h.O = org.telegram.messenger.cd.L0(2131747940, null);
                                    h.P = true;
                                    i20 = 2;
                                    CharSequence[] charSequenceArr = {org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(1, "Hours", new Object[0])), org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(8, "Hours", new Object[0])), org.telegram.messenger.cd.a0("MuteFor", null, 2131748327, org.telegram.messenger.cd.G(2, "Days", new Object[0])), org.telegram.messenger.cd.L0(2131748328, null)};
                                    eg.j jVar = new eg.j(5, arrayList2, ayVar4);
                                    h.L = charSequenceArr;
                                    h.K = jVar;
                                    z2Var = h;
                                }
                                ayVar4.showDialog(z2Var, new ov(ayVar4, i20));
                                return;
                            }
                            if (!ayVar4.getMessagesController().q2(longValue2, 0L, null)) {
                                ayVar4.getNotificationsController().T(longValue2, 3, 0L);
                            }
                            ayVar = ayVar4;
                            apVar = apVar2;
                            i17 = i16;
                            i18 = i23;
                            i45++;
                            i44 = i17;
                            i23 = i18;
                            apVar2 = apVar;
                        }
                    } else {
                        apVar = apVar2;
                        i17 = i16;
                        i18 = i23;
                        i45++;
                        i44 = i17;
                        i23 = i18;
                        apVar2 = apVar;
                    }
                }
                apVar = apVar2;
                i17 = i16;
            }
            i18 = i23;
            i45++;
            i44 = i17;
            i23 = i18;
            apVar2 = apVar;
        }
        org.telegram.messenger.ap apVar3 = apVar2;
        int i50 = i23;
        if (i50 == 104 && (size != 1 || ayVar.P2 != 1)) {
            org.telegram.ui.Components.cc.A(ayVar, ayVar.Q2 == 0, null).j();
        }
        if (i50 == 100 || i50 == 108) {
            if (apVar3 != null) {
                i00.y0(apVar3, apVar3.g, apVar3.b, apVar3.c, apVar3.n, apVar3.m, apVar3.h, apVar3.i, apVar3.j, false, false, true, true, false, this, null);
                ayVar = this;
                j10 = 0;
            } else {
                j10 = 0;
                ayVar.getMessagesController().j4(ayVar.W2, 0L, null);
            }
            UndoView j43 = ayVar.j4();
            if (ayVar.q3 && j43 != null) {
                j43.m(j10, Integer.valueOf(i46), ayVar.O2 != 0 ? 78 : 79);
            }
            i14 = i10;
            i15 = org.telegram.messenger.zs.t1;
        } else {
            i15 = 108;
            i14 = i50;
        }
        ayVar.m4((i14 == i15 || i14 == 100 || i14 == 102) ? false : true);
    }

    public final void D3() {
        if (this.e0 == null) {
            return;
        }
        int v32 = v3();
        int i10 = 0;
        while (true) {
            zx[] zxVarArr = this.e0;
            if (i10 >= zxVarArr.length) {
                return;
            }
            zx zxVar = zxVarArr[i10];
            if (zxVar != null) {
                wx wxVar = zxVar.a;
                wxVar.setPadding(0, wxVar.f3, 0, v32);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D4(long j10, boolean z10, org.telegram.messenger.ap apVar, int i10, boolean z11) {
        boolean z12;
        int i11;
        boolean y3;
        boolean z13;
        int i12 = (this.e0[0].s == 0 && k4() && this.e0[0].w == 2) ? 1 : 0;
        int L0 = this.e0[0].c.L0();
        if (apVar != null) {
            int i13 = apVar.j.get(j10, TLObject.FLAG_31);
            if (!z10 && i13 == Integer.MIN_VALUE) {
                return;
            }
        }
        int i14 = -1;
        if (L0 > i12 || !z11) {
            z12 = true;
        } else {
            L4(true, true);
            y3();
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
        if (apVar != null) {
            LongSparseIntArray longSparseIntArray = apVar.j;
            if (z10) {
                longSparseIntArray.put(j10, i10);
            } else {
                longSparseIntArray.delete(j10);
            }
            if (z11) {
                getMessagesController().t3(apVar);
            }
            y3 = true;
        } else {
            y3 = getMessagesController().y3(j10, z10, null, -1L);
        }
        if (y3) {
            if (z12) {
                if (this.R0 != 10) {
                    n4(false);
                }
                I4(true, false);
            } else {
                ArrayList c42 = c4(this.currentAccount, this.e0[0].s, this.W2, false);
                int i16 = 0;
                while (true) {
                    if (i16 >= c42.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) c42.get(i16)).id == j10) {
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
                this.e0[0].y.D();
                this.e0[0].q(true);
                zx zxVar = this.e0[0];
                zxVar.c.h1((zxVar.s == 0 && k4() && this.e0[0].w == 2) ? 1 : 0, (int) this.N);
            } else if (i14 >= 0 && i11 == i14) {
                org.telegram.messenger.i0.h3(new fv(this, 13), 200L);
            }
            z13 = true;
            if (z13) {
                L4(false, true);
                return;
            }
            return;
        }
        z13 = false;
        if (z13) {
        }
    }

    @Override // fe.e
    public final void E(float f7, int i10) {
        org.telegram.ui.ActionBar.t0 t0Var;
        if (i10 != 3 || (t0Var = this.l0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) t0Var.getIconView().getDrawable();
        if (!this.d.f) {
            animatedVectorDrawable.reset();
            return;
        }
        animatedVectorDrawable.start();
        if (org.telegram.messenger.tz.o() != 0) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.ui.b0(this.currentAccount).D;
            String p02 = PremiumPreviewFragment.p0(2);
            if (tL_help_premiumPromo != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= tL_help_premiumPromo.video_sections.size()) {
                        i11 = -1;
                        break;
                    } else if (tL_help_premiumPromo.video_sections.get(i11).equals(p02)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    org.telegram.messenger.b8.G(this.currentAccount).X(tL_help_premiumPromo.videos.get(i11), tL_help_premiumPromo, 3, 0);
                }
            }
        }
    }

    public final void E3() {
        zg.e eVar = this.y1;
        if (eVar != null) {
            eVar.setBlurredBottomHeight(this.y1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(7.0f));
        }
    }

    public final void E4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.zs.K2));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        M3();
    }

    @Override // fg.b
    public final List F() {
        return Arrays.asList(new fg.a(org.telegram.messenger.cd.L0(2131751649, null)), new fg.a(org.telegram.messenger.cd.L0(2131752076, null), new fv(this, 14)), new fg.a(org.telegram.messenger.cd.L0(2131751650, null), new fv(this, 15)));
    }

    public final void F3() {
        zx zxVar;
        float d42 = d4(true);
        qx qxVar = this.z0;
        if (qxVar != null) {
            boolean z10 = qxVar.getAlpha() != d42;
            float T1 = org.telegram.messenger.i0.T1(0.98f, 1.0f, d42);
            this.z0.setAlpha(d42);
            this.z0.setScaleX(T1);
            this.z0.setScaleY(T1);
            this.z0.setVisibility(d42 > 0.0f ? 0 : 8);
            if (z10 && (zxVar = this.e0[0]) != null) {
                zxVar.a.requestLayout();
            }
        }
        d5();
    }

    public final void F4(zx zxVar) {
        int i10;
        if (zxVar.getVisibility() != 0) {
            return;
        }
        int i11 = zxVar.d.w;
        if (zxVar.s == 0 && k4() && zxVar.a.getChildCount() == 0 && zxVar.w == 2) {
            ((s4.a0) zxVar.a.getLayoutManager()).h1(1, (int) this.N);
        }
        zxVar.d.getClass();
        zxVar.d.V();
        int b10 = zxVar.d.b();
        if (b10 == 1 && i11 == 1 && zxVar.d.d(0) == 5) {
            zxVar.q(true);
        } else {
            zxVar.q(false);
            if (b10 > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                zxVar.D.b(i11);
            }
        }
        try {
            zxVar.a.setEmptyView((this.W2 == 0 && this.Y2 == 0) ? zxVar.x : null);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        B3(zxVar);
    }

    public final void G3() {
        float f7 = this.n.e;
        float T1 = org.telegram.messenger.i0.T1(0.2f, 1.0f, f7);
        bi.f2 f2Var = this.C1;
        if (f2Var != null) {
            f2Var.setScaleX(T1);
            this.C1.setScaleY(T1);
            this.C1.setAlpha(f7);
            this.C1.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        zg.e eVar = this.y1;
        if (eVar != null) {
            eVar.setAlpha(f7);
            this.y1.setVisibility(f7 > 0.0f ? 0 : 8);
            this.y1.getFadeView().setAlpha(f7);
            this.y1.getFadeView().setVisibility(f7 > 0.0f ? 0 : 8);
        }
    }

    public final void G4() {
        boolean z10;
        if (this.N == 0.0f || (z10 = this.K)) {
            return;
        }
        float f7 = z10 ? -f4() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.G3, f7));
        animatorSet.setInterpolator(org.telegram.ui.Components.gr.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void H3() {
        if (this.actionBar == null) {
            return;
        }
        float f7 = 1.0f - this.b.e;
        float g42 = 1.0f - g4();
        org.telegram.ui.Components.f10.d(this.actionBar.getBackButton(), Math.max(this.u3, f7 * g42 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H4(int i10) {
        org.telegram.ui.Components.pz pzVar;
        if (this.z0 == null) {
            h5(true, true);
            if (this.z0 == null) {
                return;
            }
        }
        int tabsCount = this.z0.getTabsCount() - 1;
        ArrayList S0 = getMessagesController().S0();
        int i11 = 0;
        while (true) {
            if (i11 >= S0.size()) {
                break;
            }
            if (((org.telegram.messenger.ap) S0.get(i11)).a == i10) {
                tabsCount = i11;
                break;
            }
            i11++;
        }
        qx qxVar = this.z0;
        if (tabsCount < 0) {
            qxVar.getClass();
        } else if (tabsCount < qxVar.getTabsCount()) {
            pzVar = (org.telegram.ui.Components.pz) qxVar.h.get(tabsCount);
            if (pzVar != null) {
                qx qxVar2 = this.z0;
                ArrayList arrayList = qxVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                qxVar2.f((org.telegram.ui.Components.pz) i0.a.g(1, arrayList), arrayList.size() - 1);
                return;
            }
            zx[] zxVarArr = this.e0;
            if (zxVarArr == null || zxVarArr.length <= 0 || zxVarArr[0].h != pzVar.a) {
                this.z0.f(pzVar, tabsCount);
                return;
            }
            return;
        }
        pzVar = null;
        if (pzVar != null) {
        }
    }

    public final void I3() {
        org.telegram.ui.Components.f10.d(this.g0, c3.i0.E(this.i0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - g4(), 1.0f - this.c.e));
    }

    public final void I4(boolean z10, boolean z11) {
        xw xwVar = this.F3;
        if (xwVar == null || !xwVar.c()) {
            int i10 = (this.e0[0].s == 0 && k4() && this.e0[0].w == 2) ? 1 : 0;
            int i11 = (!this.K || z11 || this.E0.g()) ? 0 : -org.telegram.messenger.i0.L(81.0f);
            if (!z10) {
                this.e0[0].c.h1(i10, i11);
                G4();
            } else {
                org.telegram.ui.Components.vj0 vj0Var = this.e0[0].r;
                vj0Var.b = 1;
                vj0Var.d(i10, i11, false, false);
                G4();
            }
        }
    }

    public final void J3() {
        org.telegram.ui.Components.f10.d(this.f0, c3.i0.E(org.telegram.messenger.tz.s.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - g4(), 1.0f - this.c.e));
    }

    public final void J4(String str, boolean z10) {
        Z4(true, false, true, false);
        px pxVar = this.X;
        if (pxVar != null) {
            pxVar.r.setText(str);
            this.X.r.setSelection(str.length());
        }
    }

    public final void K3() {
        org.telegram.ui.Components.f10.d(this.j0, c3.i0.E(this.R0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - g4(), 1.0f - this.c.e));
        uw uwVar = this.E0;
        if (uwVar != null) {
            uwVar.invalidate();
        }
    }

    public final void K4(float f7) {
        this.c0 = f7;
        for (zx zxVar : this.e0) {
            wx wxVar = zxVar.a;
            for (int i10 = 0; i10 < wxVar.getChildCount(); i10++) {
                View childAt = wxVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= zxVar.d.f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void L3() {
        org.telegram.ui.Components.f10.d(this.l0, c3.i0.E(this.b.e, 1.0f - g4(), 1.0f - this.c.e, this.d.e));
    }

    public final void L4(boolean z10, boolean z11) {
        if (this.e0 == null || this.S1 == z10) {
            return;
        }
        if (z10) {
            this.R1 = new ArrayList(c4(this.currentAccount, this.e0[0].s, this.W2, false));
        } else {
            this.R1 = null;
        }
        this.S1 = z10;
        zx zxVar = this.e0[0];
        zxVar.d.G = z10;
        if (z10 || !z11) {
            return;
        }
        if (zxVar.a.c0()) {
            this.e0[0].a.post(new fv(this, 25));
        } else {
            this.e0[0].d.f();
        }
    }

    public final void M3() {
        bi.t0 t0Var;
        boolean z10 = !this.j2 && ((t0Var = this.K0) == null || t0Var.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8);
        mf0 mf0Var = this.I3;
        if (mf0Var != null) {
            mf0Var.a.w.a(z10, true);
        }
    }

    public final void M4(boolean z10) {
        zx zxVar;
        if (org.telegram.messenger.tz.o() <= 1 || !org.telegram.messenger.sc.e(32768)) {
            return;
        }
        if (z10) {
            zx[] zxVarArr = this.e0;
            if (zxVarArr != null && (zxVar = zxVarArr[0]) != null) {
                zxVar.setLayerType(2, null);
                this.e0[0].setClipChildren(false);
                this.e0[0].setClipToPadding(false);
                this.e0[0].a.setClipChildren(false);
            }
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.setLayerType(2, null);
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
                zx[] zxVarArr2 = this.e0;
                if (i10 >= zxVarArr2.length) {
                    break;
                }
                zx zxVar2 = zxVarArr2[i10];
                if (zxVar2 != null) {
                    zxVar2.setLayerType(0, null);
                    zxVar2.setClipChildren(true);
                    zxVar2.setClipToPadding(true);
                    zxVar2.a.setClipChildren(true);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (lVar2 != null) {
            lVar2.setLayerType(0, null);
        }
        uw uwVar = this.E0;
        if (uwVar != null) {
            uwVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void N3() {
        H3();
        org.telegram.ui.Components.f10.d(this.k0, (1.0f - this.b.e) * (1.0f - g4()) * (1.0f - this.c.e));
        I3();
        L3();
        J3();
        K3();
    }

    public final void N4(float f7) {
        zx[] zxVarArr = this.e0;
        if (zxVarArr != null) {
            int paddingTop = zxVarArr[0].a.getPaddingTop() + ((int) f7);
            int i10 = 0;
            while (true) {
                zx[] zxVarArr2 = this.e0;
                if (i10 >= zxVarArr2.length) {
                    break;
                }
                zxVarArr2[i10].a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView == null || f7 == this.N) {
            return;
        }
        this.N = f7;
        org.telegram.ui.Components.wb wbVar = this.o3;
        if (wbVar != null) {
            wbVar.l();
        }
        if (this.E3 != null) {
            float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
            org.telegram.ui.Cells.n nVar = this.E3;
            float f10 = (int) f7;
            float f11 = nVar.f;
            nVar.h = f10;
            nVar.setTranslationY(f11 + f10);
            this.E3.setAlpha(w7.u.a(currentActionBarHeight, 0.0f, 1.0f));
            this.E3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        P3();
        this.fragmentView.invalidate();
    }

    public final void O3() {
        String L0 = org.telegram.messenger.cd.L0(g4() > 0.5f ? 2131745723 : 2131745830, null);
        this.X.r.setContentDescription(L0);
        this.X.r.setHint(L0);
    }

    public final void O4(float f7) {
        this.x1 = f7;
        m5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (org.telegram.messenger.tz.o() != 0) {
            org.telegram.messenger.sc.e(32768);
        }
        d5();
    }

    public final void P3() {
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.u.a(((-this.N) - f4()) / org.telegram.messenger.i0.L(48.0f), 0.0f, 1.0f);
        float max = (this.R0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.u3, this.h.e)) * Math.max(this.b.e, (1.0f - g4()) * a2);
        this.X.setAlpha(max);
        this.X.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final void P4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.E2 = null;
            this.F2 = null;
            return;
        }
        this.E2 = str;
        this.F2 = null;
        this.D2 = null;
        if (this.B1 != null) {
            u3(charSequence);
        } else {
            this.U3 = charSequence;
        }
    }

    public final void Q3() {
        if (this.Z != null) {
            float f7 = (this.a0 != null ? 1.0f : 0.0f) * this.b.e;
            float T1 = org.telegram.messenger.i0.T1(0.98f, 1.0f, f7);
            this.Z.setScaleX(T1);
            this.Z.setScaleY(T1);
            this.Z.setAlpha(f7);
            this.Z.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.v71 v71Var = this.a0;
        fe.b bVar = this.s;
        if (v71Var != null) {
            float f10 = 1.0f - bVar.e;
            v71Var.setAlpha(f10);
            this.a0.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        zf.g0 g0Var = this.b0;
        if (g0Var != null) {
            float f11 = bVar.e;
            g0Var.setAlpha(f11);
            this.b0.setVisibility(f11 > 0.0f ? 0 : 8);
        }
    }

    public final void Q4(float f7) {
        if (org.telegram.messenger.tz.o() <= 0) {
            boolean z10 = org.telegram.messenger.v2.a;
            return;
        }
        if (this.W3 == f7) {
            return;
        }
        boolean z11 = true;
        if (org.telegram.messenger.tz.o() > 1 && org.telegram.messenger.sc.e(32768)) {
            z11 = false;
        }
        this.X3 = z11;
        this.W3 = f7;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (this.X3) {
            float f10 = (1.0f - this.W3) * (-org.telegram.messenger.i0.L(40.0f));
            uw uwVar = this.E0;
            if (uwVar != null) {
                uwVar.setTranslationX(f10);
            }
            px pxVar = this.X;
            if (pxVar != null) {
                pxVar.setTranslationX(f10);
            }
            xw xwVar = this.F3;
            if (xwVar == null || xwVar.getFragmentView() == null || this.D) {
                return;
            }
            this.F3.getFragmentView().setTranslationX(f10);
            return;
        }
        float f11 = -org.telegram.messenger.i0.L(4.0f);
        float f12 = 1.0f - this.W3;
        float f13 = f11 * f12;
        float f14 = 1.0f - (f12 * 0.05f);
        uw uwVar2 = this.E0;
        if (uwVar2 != null) {
            uwVar2.setScaleX(f14);
            this.E0.setScaleY(f14);
            this.E0.setTranslationX(f13);
            this.E0.setPivotX(0.0f);
            this.E0.setPivotY(0.0f);
        }
        px pxVar2 = this.X;
        if (pxVar2 != null) {
            pxVar2.setTranslationX(f13);
            this.X.setScaleX(f14);
            this.X.setScaleY(f14);
        }
        xw xwVar2 = this.F3;
        if (xwVar2 == null || xwVar2.getFragmentView() == null) {
            return;
        }
        if (!this.D) {
            this.F3.getFragmentView().setScaleX(f14);
            this.F3.getFragmentView().setScaleY(f14);
            this.F3.getFragmentView().setTranslationX(f13);
        }
        this.F3.getFragmentView().setPivotX(0.0f);
        this.F3.getFragmentView().setPivotY(0.0f);
    }

    public final void R3(boolean z10) {
        if (this.C0 == null || this.actionBar == null) {
            return;
        }
        int i10 = org.telegram.messenger.i0.n;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(this.a) + (this.a0 != null ? org.telegram.messenger.i0.L(50.0f) : 0);
        org.telegram.ui.Components.zr zrVar = this.J1;
        int c10 = measuredHeight + (zrVar != null ? (int) zrVar.c(org.telegram.messenger.i0.L(7.0f)) : 0);
        kx kxVar = this.C0;
        SparseArray sparseArray = kxVar.h;
        kxVar.W0 = c10;
        kxVar.X0 = i10;
        ag.b1 b1Var = kxVar.a0;
        if (z10) {
            b1Var.q1(0, c10, 0, i10);
        } else {
            b1Var.setPadding(0, c10, 0, i10);
        }
        kxVar.O0.j(kxVar.W0, kxVar.X0, z10);
        org.telegram.ui.Components.tm0 tm0Var = kxVar.b0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tm0Var.getLayoutParams();
        int i11 = marginLayoutParams.topMargin;
        int i12 = kxVar.W0;
        if (i11 != i12 || marginLayoutParams.bottomMargin != kxVar.X0) {
            marginLayoutParams.topMargin = i12;
            marginLayoutParams.bottomMargin = kxVar.X0;
            tm0Var.requestLayout();
        }
        org.telegram.ui.Components.gn0.Q(kxVar.h0, kxVar.k0, kxVar.W0, kxVar.X0, z10);
        org.telegram.ui.Components.gn0.Q(kxVar.m0, kxVar.p0, kxVar.W0, kxVar.X0, z10);
        org.telegram.ui.Components.gn0.Q(kxVar.t0, kxVar.w0, kxVar.W0, kxVar.X0, z10);
        org.telegram.ui.Components.cg0 cg0Var = kxVar.r0;
        int i13 = kxVar.W0;
        int i14 = kxVar.X0;
        cg0Var.setClipToPadding(false);
        org.telegram.ui.Components.u51 u51Var = cg0Var.c;
        cg0Var.J = z10;
        cg0Var.setPadding(0, i13, 0, i14);
        if (z10) {
            u51Var.q1(0, i13, 0, i14);
        } else {
            u51Var.setPadding(0, i13, 0, i14);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) u51Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i13;
        marginLayoutParams2.bottomMargin = -i14;
        cg0Var.J = false;
        org.telegram.ui.Components.gm0 gm0Var = kxVar.I0;
        if (gm0Var != null) {
            gm0Var.b(kxVar.W0, kxVar.X0, z10);
        }
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) sparseArray.valueAt(i15);
            if (view instanceof z00) {
                ((z00) view).j(kxVar.W0, kxVar.X0, z10);
            }
        }
        for (int i16 = 0; i16 < kxVar.getChildCount(); i16++) {
            if (kxVar.getChildAt(i16) instanceof z00) {
                ((z00) kxVar.getChildAt(i16)).j(kxVar.W0, kxVar.X0, z10);
            }
        }
    }

    public final void R4() {
        getContactsController().B();
        org.telegram.ui.Components.l6 l6Var = new org.telegram.ui.Components.l6(getParentActivity(), this.currentAccount, getResourceProvider(), new xs(5, this, r1), new rh(r1, 18));
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(getParentActivity(), false, 1, getResourceProvider());
        h.N = l6Var;
        h.U0 = 49;
        h.show();
        org.telegram.ui.ActionBar.z2[] z2VarArr = {h};
        h.Q(org.telegram.ui.ActionBar.t6.h5);
    }

    public final void S3() {
        if (this.J1 != null) {
            float T1 = org.telegram.messenger.i0.T1(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(T1);
            this.J1.setScaleY(T1);
            this.J1.setVisibility(0);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type int to boolean for r5v19 ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:116)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:138)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:213)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:143)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:68)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:39)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, org.telegram.ui.ActionBar.k2, org.telegram.ui.ay] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v6, types: [org.telegram.messenger.vp] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19, types: [int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, org.telegram.ui.ActionBar.k2[]] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final boolean S4(org.telegram.ui.Cells.v2 r33) {
        /*
            Method dump skipped, instructions count: 1463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.S4(org.telegram.ui.Cells.v2):boolean");
    }

    public boolean T3() {
        return this.R0 == 10;
    }

    public final void T4(boolean z10) {
        int i10 = 1;
        this.c.a(z10, true);
        if (this.m0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.O3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O3 = animatorSet2;
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
        arrayList.add(ObjectAnimator.ofFloat(this.m0, (Property<org.telegram.ui.ActionBar.t0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.O3.playTogether(arrayList);
        this.O3.addListener(new dx(this, z10, i10));
        this.O3.start();
    }

    public final void U3() {
        if (!org.telegram.messenger.i0.Q1()) {
            this.V1 = true;
            return;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.k(true);
        }
        TLObject tLObject = this.X1;
        if (tLObject != null) {
            kx kxVar = this.C0;
            if (kxVar != null) {
                kxVar.d0.Q(this.W1, tLObject);
            }
            this.X1 = null;
        }
    }

    public final void U4() {
        if (this.A0 || !getMessagesController().U0 || !getMessagesController().J3 || this.z0 == null || !getMessagesController().S0().isEmpty() || this.isPaused || !getUserConfig().P || this.inPreviewMode) {
            return;
        }
        SharedPreferences d12 = org.telegram.messenger.vp.d1();
        if (d12.getBoolean("filterhint", false)) {
            return;
        }
        d12.edit().putBoolean("filterhint", true).apply();
        org.telegram.messenger.i0.h3(new fv(this, 26), 1000L);
    }

    public final void V3() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar == null || !lVar.n0) {
            return;
        }
        lVar.k(true);
        this.q3 = false;
        h5(true, true);
    }

    public final void V4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity;
        int i10;
        float f7;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        gv gvVar;
        xs xsVar;
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, this.k0);
        int i11 = org.telegram.ui.ActionBar.t6.A8;
        H.S(getThemedColor(i11), getThemedColor(i11));
        int i12 = 8;
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        int i13 = 5;
        float f10 = 64.0f;
        int i14 = 0;
        if (this.Y2 != 0) {
            int i15 = 1;
            if (org.telegram.messenger.w3.N(this.Z2)) {
                H.c(R.drawable.msg_customize, org.telegram.messenger.cd.L0(2131751913, null), new ew(this, i15), false);
                H.k();
            }
            H.i(new ew(this, 4), org.telegram.messenger.cd.L0(2131751912, null), this.Z2.collapsed_in_dialogs);
            H.i(new ew(this, i13), org.telegram.messenger.cd.L0(2131751911, null), !this.Z2.collapsed_in_dialogs);
            H.Z();
            H.X(-org.telegram.messenger.i0.L(64.0f));
            return;
        }
        int i16 = 7;
        if (p4()) {
            H.c(R.drawable.msg_customize, org.telegram.messenger.cd.L0(2131754143, null), new ew(this, 6), false);
            H.c(R.drawable.msg_help, org.telegram.messenger.cd.L0(2131749285, null), new ew(this, i16), false);
            H.Z();
            H.X(-org.telegram.messenger.i0.L(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.resourceProvider;
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        H.c(a2 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, org.telegram.messenger.cd.L0(a2 ? 2131744326 : 2131744325, null), new ew(this, i12), false);
        H.k();
        int i17 = 9;
        H.c(R.drawable.outline_groups_24, org.telegram.messenger.cd.L0(2131748290, null), new ew(this, i17), false);
        H.c(R.drawable.outline_saved_24, org.telegram.messenger.cd.L0(2131745918, null), new ew(this, 10), false);
        org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.a;
        if (((org.telegram.messenger.j0) getMessagesController().y7.j0.b).c) {
            H.c(R.drawable.ic_gram, org.telegram.messenger.cd.L0(2131743220, null), new fv(this, i14), false);
        } else {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).b;
            if (launchActivity2 != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                int size = arrayList3.size();
                int i18 = 0;
                while (i18 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i18);
                    i18++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        gv gvVar2 = new gv(this, tL_attachMenuBot2, launchActivity2, i14);
                        xs xsVar2 = new xs(i16, this, tL_attachMenuBot2);
                        f7 = f10;
                        org.telegram.ui.ActionBar.p6 p6Var2 = H.d;
                        if (H.e == null) {
                            arrayList2 = arrayList3;
                            launchActivity = launchActivity2;
                            i10 = i17;
                        } else {
                            int i19 = org.telegram.ui.ActionBar.t6.F8;
                            int i20 = org.telegram.ui.ActionBar.t6.E8;
                            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, H.e, H.d, false, false);
                            b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), i14, org.telegram.messenger.i0.L(18.0f), i14);
                            CharSequence b10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.p8.b(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                            Pattern pattern = org.telegram.messenger.ui.R1;
                            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                            int size2 = arrayList4.size();
                            arrayList2 = arrayList3;
                            int i21 = 0;
                            while (true) {
                                if (i21 >= size2) {
                                    launchActivity = launchActivity2;
                                    tL_attachMenuBotIcon = null;
                                    break;
                                }
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i21);
                                int i22 = i21 + 1;
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                launchActivity = launchActivity2;
                                if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                    tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                    break;
                                } else {
                                    i21 = i22;
                                    launchActivity2 = launchActivity;
                                }
                            }
                            if (tL_attachMenuBotIcon != null) {
                                org.telegram.messenger.c00 f11 = org.telegram.messenger.v5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.t6.c7, 1.0f, null);
                                if (f11 != null) {
                                    Integer num = H.k0;
                                    new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.t6.w0(i19, p6Var2), PorterDuff.Mode.SRC_IN);
                                }
                                org.telegram.messenger.ic b11 = org.telegram.messenger.ic.b(tL_attachMenuBotIcon.icon);
                                gvVar = gvVar2;
                                xsVar = xsVar2;
                                b1Var.k(b10, b11, "24_24", f11, tL_attachMenuBot2);
                                b1Var = b1Var;
                                org.telegram.ui.Components.g9 g9Var = b1Var.h;
                                if (g9Var != null) {
                                    g9Var.setLayoutParams(w7.b6.e(24, 24, (org.telegram.messenger.cd.X ? 5 : 3) | 16));
                                }
                            } else {
                                gvVar = gvVar2;
                                xsVar = xsVar2;
                                b1Var.j(b10, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.j0;
                            if (num2 == null && H.k0 == null) {
                                b1Var.c(i20, i19);
                            } else {
                                int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.t6.w0(i20, p6Var2);
                                Integer num3 = H.k0;
                                b1Var.d(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.t6.w0(i19, p6Var2));
                            }
                            Integer num4 = H.k0;
                            b1Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.t6.w0(i19, p6Var2));
                            Integer num5 = H.l0;
                            if (num5 != null) {
                                b1Var.setSelectorColor(num5.intValue());
                            } else {
                                b1Var.h(0.12f, i20);
                            }
                            i10 = 9;
                            b1Var.setOnClickListener(new org.telegram.ui.Components.sr(i10, H, gvVar));
                            b1Var.setOnLongClickListener(new org.telegram.ui.Components.b0(2, H, xsVar));
                            int i23 = H.S;
                            if (i23 > 0) {
                                b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i23));
                                H.r(b1Var, w7.b6.o(H.S, -2));
                            } else {
                                H.r(b1Var, w7.b6.o(-1, -2));
                            }
                        }
                    } else {
                        arrayList2 = arrayList3;
                        launchActivity = launchActivity2;
                        i10 = i17;
                        f7 = f10;
                    }
                    i17 = i10;
                    f10 = f7;
                    arrayList3 = arrayList2;
                    launchActivity2 = launchActivity;
                    i14 = 0;
                    i16 = 7;
                }
            }
        }
        float f12 = f10;
        if (getUserConfig().W) {
            H.c(R.drawable.msg_settings_old, org.telegram.messenger.cd.L0(2131745512, null), new ew(this, 3), false);
        }
        org.telegram.ui.ActionBar.b1 b1Var2 = this.o0;
        if (b1Var2 != null) {
            org.telegram.ui.ActionBar.a7.V(b1Var2.b, org.telegram.ui.ActionBar.t6.Oi, getResourceProvider());
            this.o0.setOnClickListener(new wu(5, this, H));
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().y3 && !org.telegram.messenger.tz.z1.isEmpty())) {
                H.k();
                H.d(this.o0);
            }
        }
        H.Z();
        H.X(-org.telegram.messenger.i0.L(f12));
    }

    @Override // org.telegram.ui.ActionBar.k2, org.telegram.ui.of0
    public final boolean W(MotionEvent motionEvent, boolean z10) {
        xw xwVar;
        bi.t0 t0Var;
        qx qxVar;
        if (!this.q3 && (((xwVar = this.F3) == null || !xwVar.c()) && (((t0Var = this.K0) == null || t0Var.getVisibility() != 0) && ((qxVar = this.z0) == null || !qxVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                qx qxVar2 = this.z0;
                boolean z11 = qxVar2 == null || qxVar2.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getFirstTabId();
                qx qxVar3 = this.z0;
                boolean z12 = qxVar3 == null || qxVar3.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getLastTabId();
                org.telegram.messenger.tz.m(this.currentAccount);
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

    public final void W3(String str) {
        if (this.actionBar.e(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m(str);
        boolean z10 = this.W;
        int i10 = 1;
        ArrayList arrayList = this.i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.g1.setImageDrawable(new org.telegram.ui.ActionBar.c2(true));
            org.telegram.ui.ActionBar.a7.t(this.g1, org.telegram.ui.ActionBar.t6.y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.g1;
            int i11 = org.telegram.ui.ActionBar.t6.z8;
            org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i11), getResourceProvider());
            this.g1.setOnClickListener(new hv(this, 6));
            m10.addView(this.g1, w7.b6.r(54, 54, 16));
            arrayList.add(this.g1);
        }
        NumberTextView numberTextView = new NumberTextView(m10.getContext());
        this.h1 = numberTextView;
        numberTextView.setTextSize(18);
        this.h1.setTypeface(org.telegram.messenger.i0.o());
        this.h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.y8));
        m10.addView(this.h1, w7.b6.m(1.0f, 0, -1, this.W ? 18 : 72, 0, 0));
        this.h1.setOnTouchListener(new org.telegram.ui.ActionBar.n2(i10));
        this.k1 = m10.g(100, R.drawable.msg_pin, org.telegram.messenger.i0.L(48.0f));
        this.l1 = m10.g(org.telegram.messenger.zs.p1, R.drawable.msg_mute, org.telegram.messenger.i0.L(48.0f));
        this.m1 = m10.g(org.telegram.messenger.zs.s1, R.drawable.msg_archive, org.telegram.messenger.i0.L(48.0f));
        this.j1 = m10.h(org.telegram.messenger.zs.n1, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null), org.telegram.messenger.i0.L(48.0f));
        org.telegram.ui.ActionBar.t0 h = m10.h(0, R.drawable.ic_ab_other, org.telegram.messenger.cd.L0(2131754839, null), org.telegram.messenger.i0.L(48.0f));
        m10.addView(new View(getParentActivity()), w7.b6.o(5, -1));
        this.q1 = h.e(org.telegram.messenger.zs.q1, R.drawable.msg_archive, org.telegram.messenger.cd.L0(2131754172, null));
        this.n1 = h.e(org.telegram.messenger.zs.t1, R.drawable.msg_pin, org.telegram.messenger.cd.L0(2131751454, null));
        this.o1 = h.e(org.telegram.messenger.zs.u1, R.drawable.msg_addfolder, org.telegram.messenger.cd.L0(2131750813, null));
        this.p1 = h.e(org.telegram.messenger.zs.v1, R.drawable.msg_removefolder, org.telegram.messenger.cd.L0(2131750713, null));
        this.s1 = h.e(101, R.drawable.msg_markread, org.telegram.messenger.cd.L0(2131748696, null));
        this.r1 = h.e(org.telegram.messenger.zs.o1, R.drawable.msg_clear, org.telegram.messenger.cd.L0(2131752089, null));
        this.t1 = h.e(org.telegram.messenger.zs.r1, R.drawable.msg_block, org.telegram.messenger.cd.L0(2131753692, null));
        this.l1.setOnLongClickListener(new uv(this, i10));
        arrayList.add(this.k1);
        arrayList.add(this.m1);
        arrayList.add(this.l1);
        arrayList.add(this.j1);
        arrayList.add(h);
        e5(false);
    }

    public final void W4() {
        if (this.R3 != null) {
            return;
        }
        for (String str : getMessagesController().U3) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131749328, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131749329, null));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131749542, null), new iv(this, 6));
                showDialog(x1Var, new ov(this, 0));
                this.R3 = str;
                return;
            }
        }
    }

    public final void X3() {
        kx kxVar = this.C0;
        if ((kxVar != null && kxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        kx kxVar2 = new kx(this, getParentActivity(), this, this.n2 != null ? 2 : !this.l2 ? 1 : 0, this.R0, this.W2, this.Y2, new iw(this));
        this.C0 = kxVar2;
        this.glassEngine.c(kxVar2);
        ((tx) this.fragmentView).addView(this.C0, this.B0);
        kx kxVar3 = this.C0;
        kxVar3.d0.U = new mx(this);
        kxVar3.k0.setOnItemClickListener(new iv(this, 1));
        this.C0.p0.setOnItemClickListener(new iv(this, 2));
        this.C0.w0.setOnItemClickListener(new nv(this, 0));
        this.C0.p0.setOnItemLongClickListener(new iv(this, 3));
        this.C0.a0.setOnItemClickListener(new iv(this, 4));
        this.C0.a0.setOnItemLongClickListener(new iw(this));
        this.C0.setFilteredSearchViewDelegate(new iv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.o4);
    }

    public final void X4(long j10, View view) {
        r3(j10, view);
        boolean u10 = this.actionBar.u();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        char c10 = 1;
        int i10 = 0;
        if (!u10) {
            if (this.q3) {
                W3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.a5)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
                }
            } else {
                W3(null);
            }
            org.telegram.messenger.i0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            this.actionBar.O(null, null);
            int i11 = this.e0[0].s;
            ArrayList c42 = ((i11 == 7 || i11 == 8) && (!this.actionBar.u() || this.actionBar.w(null))) ? c4(this.currentAccount, this.e0[0].s, this.W2, this.S1) : getMessagesController().V0(this.W2);
            int size = c42.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) c42.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!r4(dialog)) {
                        if (!getMessagesController().B2(dialog.id, false)) {
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
                        zx[] zxVarArr = this.e0;
                        if (i14 >= zxVarArr.length) {
                            break;
                        }
                        zxVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                int i15 = org.telegram.messenger.vp.D8;
                t5(131072, true);
            }
            if (!this.q3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = this.i1;
                    if (i16 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i16);
                    view2.setPivotY(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2);
                    org.telegram.messenger.i0.y(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                    i16++;
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
            int i17 = 0;
            while (true) {
                zx[] zxVarArr2 = this.e0;
                if (i17 >= zxVarArr2.length) {
                    break;
                }
                zx zxVar = zxVarArr2[i17];
                if (zxVar != null) {
                    zxVar.a.I0(true);
                }
                i17++;
            }
            float max = Math.max(0.0f, org.telegram.messenger.i0.L((this.K ? 81 : 0) + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.v3.addUpdateListener(new jv(this, max, i10));
            this.v3.addListener(new fx(this, max, c10 == true ? 1 : 0));
            this.v3.setInterpolator(org.telegram.ui.Components.gr.f);
            this.v3.setDuration(200L);
            this.v3.start();
            qx qxVar = this.z0;
            if (qxVar != null) {
                qxVar.b(org.telegram.ui.ActionBar.t6.ui, org.telegram.ui.ActionBar.t6.ti, org.telegram.ui.ActionBar.t6.si, org.telegram.ui.ActionBar.t6.vi, org.telegram.ui.ActionBar.t6.w8);
            }
            org.telegram.ui.ActionBar.c2 c2Var = this.e1;
            if (c2Var != null) {
                c2Var.c(true, 1.0f);
            }
            z10 = false;
        } else if (arrayList.isEmpty()) {
            m4(true);
            return;
        }
        e5(false);
        this.h1.a(arrayList.size(), z10);
    }

    public final void Y3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new gx(this, parentActivity);
                FrameLayout.LayoutParams d = w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f4 + this.h4 + d.bottomMargin;
                tx txVar = (tx) this.fragmentView;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.x0 + 1;
                this.x0 = i11;
                txVar.addView(undoView, i11, d);
            }
        }
    }

    public final void Y4(long j10, View view) {
        int i10 = -this.L3;
        this.L3 = i10;
        org.telegram.messenger.i0.F3(i10, view, null);
        org.telegram.messenger.t2.D.a();
        String p5 = j10 >= 0 ? org.telegram.messenger.h20.p(org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(j10))) : "";
        (getMessagesController().A3() ? org.telegram.ui.Components.cc.a0(this).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131743786, p5))) : org.telegram.ui.Components.cc.a0(this).K(R.raw.star_premium_2, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131743786, p5)), org.telegram.messenger.cd.L0(2131743785, null), new fv(this, 8))).j();
    }

    public final void Z3(final long j10, final long j11, boolean z10, final pb1 pb1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String L0;
        String b02;
        String L02;
        TLRPC.TL_forumTopic f7;
        if (z3(j10)) {
            int i10 = this.R0;
            if (i10 == 11 || i10 == 12 || i10 == 13) {
                if (org.telegram.messenger.o5.E(j10)) {
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
                    if (!Z1.mutual_contact) {
                        UndoView j42 = j4();
                        if (j42 != null) {
                            j42.j(45, j10, null);
                            return;
                        }
                        return;
                    }
                    user = Z1;
                    chat = null;
                } else {
                    TLRPC.Chat L03 = getMessagesController().L0(Long.valueOf(-j10));
                    if (!org.telegram.messenger.w3.N(L03) || !org.telegram.messenger.w3.w(1, L03)) {
                        UndoView j43 = j4();
                        if (j43 != null) {
                            j43.j(46, j10, null);
                            return;
                        }
                        return;
                    }
                    chat = L03;
                    user = null;
                }
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().i1(j10);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new org.telegram.messenger.vm(this, x1Var, user, chat, j10, tL_messages_checkHistoryImportPeer, 1));
                try {
                    x1Var.r(300L);
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
                    arrayList.add(org.telegram.messenger.gs.a(j10, j11));
                    if (this.C2.y(this, arrayList, null, false, this.J2, this.K2, this.L2, pb1Var) && this.i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                }
                Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, pb1Var, 5), 17);
                if (j10 < 0) {
                    b5(getMessagesController().L0(Long.valueOf(-j10)), i0Var, null);
                    return;
                }
                TLRPC.User Z12 = getMessagesController().Z1(Long.valueOf(j10));
                TLRPC.User Z13 = getMessagesController().Z1(Long.valueOf(this.H));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String a02 = org.telegram.messenger.cd.a0(null, null, 2131754074, org.telegram.messenger.h20.j(Z12, true), org.telegram.messenger.h20.j(Z13, true));
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                x1Var2.R = a02;
                x1Var2.T = TextUtils.concat(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754075, org.telegram.messenger.h20.j(Z12, true), org.telegram.messenger.h20.j(Z13, true))));
                alertDialog$Builder.k(org.telegram.messenger.cd.a0("Send", null, 2131745657, new Object[0]), new tt(i0Var, 4));
                alertDialog$Builder.h(org.telegram.messenger.cd.a0("Cancel", null, 2131752589, new Object[0]), new org.telegram.ui.Components.z11(7));
                showDialog(x1Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (org.telegram.messenger.o5.C(j10)) {
                TLRPC.User Z14 = getMessagesController().Z1(Long.valueOf(getMessagesController().Z0(Integer.valueOf((int) (4294967295L & j10))).user_id));
                if (Z14 == null) {
                    return;
                }
                L0 = org.telegram.messenger.cd.L0(2131745613, null);
                b02 = org.telegram.messenger.cd.b0(this.f2, org.telegram.messenger.h20.p(Z14));
                L02 = org.telegram.messenger.cd.L0(2131745657, null);
            } else if (!org.telegram.messenger.o5.E(j10)) {
                TLRPC.Chat L04 = getMessagesController().L0(Long.valueOf(-j10));
                if (L04 == null) {
                    return;
                }
                String str = L04.title;
                if (j11 != 0 && (f7 = getMessagesController().r7.f(L04.id, j11)) != null) {
                    str = ((Object) str) + " " + f7.title;
                }
                if (this.h2 != null) {
                    L0 = org.telegram.messenger.cd.L0(2131754366, null);
                    b02 = org.telegram.messenger.cd.b0(this.h2, str);
                    L02 = org.telegram.messenger.cd.L0(2131754486, null);
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131745613, null);
                    b02 = org.telegram.messenger.cd.b0(this.g2, str);
                    L02 = org.telegram.messenger.cd.L0(2131745657, null);
                }
            } else if (j10 == getUserConfig().e()) {
                L0 = org.telegram.messenger.cd.L0(2131745613, null);
                b02 = org.telegram.messenger.cd.b0(this.g2, org.telegram.messenger.cd.L0(2131745918, null));
                L02 = org.telegram.messenger.cd.L0(2131745657, null);
            } else {
                TLRPC.User Z15 = getMessagesController().Z1(Long.valueOf(j10));
                if (Z15 == null || this.f2 == null) {
                    return;
                }
                L0 = org.telegram.messenger.cd.L0(2131745613, null);
                b02 = org.telegram.messenger.cd.b0(this.f2, org.telegram.messenger.h20.p(Z15));
                L02 = org.telegram.messenger.cd.L0(2131745657, null);
            }
            org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder2.a;
            x1Var3.R = L0;
            x1Var3.T = org.telegram.messenger.i0.W2(b02);
            alertDialog$Builder2.k(L02, new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.dw
                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i11) {
                    ay.this.Z3(j10, j11, false, pb1Var);
                }
            });
            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            if (showDialog(x1Var3) == null) {
                x1Var3.show();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z4(boolean z10, boolean z11, boolean z12, boolean z13) {
        kx kxVar;
        kx kxVar2;
        uw uwVar;
        kx kxVar3;
        boolean z14;
        kx kxVar4;
        boolean z15;
        org.telegram.ui.Components.v71 v71Var;
        TLRPC.Chat chat;
        xw xwVar;
        boolean z16 = z12;
        this.b.a(z10, z16);
        int i10 = 0;
        if (z10) {
            X3();
        } else {
            p5(false);
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
                ArrayList arrayList = (ArrayList) getMessagesController().w.get(0);
                int size = arrayList != null ? arrayList.size() : 0;
                if (this.l2 || (size <= 10 && !this.K)) {
                    z14 = true;
                    kxVar4 = this.C0;
                    if (kxVar4 != null) {
                        kxVar4.Q0 = z14;
                    }
                    z15 = z14 || this.K;
                    this.s3 = z15;
                    if (z15) {
                        this.t3 = true;
                    }
                    v71Var = this.a0;
                    if (v71Var != null && kxVar4 != null && !z14 && this.Y2 == 0) {
                        org.telegram.ui.Components.v71 n10 = kxVar4.n(-2, false);
                        this.a0 = n10;
                        this.Z.addView(n10, 0, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
                    } else if (this.Z != null && z14 && this.Y2 == 0) {
                        org.telegram.messenger.i0.E2(v71Var);
                        this.a0 = null;
                    }
                    if (this.C0 != null) {
                        R3(false);
                        this.C0.setKeyboardHeight(((tx) this.fragmentView).getKeyboardHeight());
                        kx kxVar5 = this.C0;
                        kxVar5.C0.clear();
                        kxVar5.L();
                    }
                    chat = this.Z2;
                    if (chat == null) {
                        zf.e0 e0Var = new zf.e0(R.drawable.search_users_filled, 4, org.telegram.messenger.o5.u(chat));
                        e0Var.f = this.Z2;
                        s3(e0Var);
                    } else if (this.W2 != 0 && ((xwVar = this.F3) == null || !xwVar.c())) {
                        s3(new zf.e0(R.drawable.chats_archive, 2131754150, null, 7));
                    }
                }
            }
            z14 = false;
            kxVar4 = this.C0;
            if (kxVar4 != null) {
            }
            if (z14) {
            }
            this.s3 = z15;
            if (z15) {
            }
            v71Var = this.a0;
            if (v71Var != null) {
            }
            if (this.Z != null) {
                org.telegram.messenger.i0.E2(v71Var);
                this.a0 = null;
            }
            if (this.C0 != null) {
            }
            chat = this.Z2;
            if (chat == null) {
            }
        }
        if (z16 && (kxVar3 = this.C0) != null && kxVar3.d0.M()) {
            org.telegram.messenger.i0.k3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        }
        if (!z10 && (uwVar = this.E0) != null && this.G0) {
            uwVar.setVisibility(0);
        }
        Object[] objArr = org.telegram.messenger.tz.o() == 0 || !org.telegram.messenger.sc.e(32768);
        if (z16) {
            if (z10) {
                kx kxVar6 = this.C0;
                if (kxVar6 != null) {
                    kxVar6.setVisibility(0);
                    kx kxVar7 = this.C0;
                    kxVar7.setPosition(0);
                    if (kxVar7.d0.b() > 0) {
                        kxVar7.e0.h1(0, 0);
                    }
                    s4.a0 a0Var = kxVar7.j0;
                    if (a0Var != null) {
                        a0Var.h1(0, 0);
                    }
                    s4.a0 a0Var2 = kxVar7.o0;
                    if (a0Var2 != null) {
                        a0Var2.h1(0, 0);
                    }
                    s4.a0 a0Var3 = kxVar7.v0;
                    if (a0Var3 != null) {
                        a0Var3.h1(0, 0);
                    }
                    kxVar7.h.clear();
                }
                i5(true, null, null, false, false);
                org.telegram.ui.Components.v71 v71Var2 = this.a0;
                if (v71Var2 != null) {
                    v71Var2.b(false, false);
                }
            } else {
                this.e0[0].a.setVisibility(0);
                this.e0[0].setVisibility(0);
            }
            L4(true, true);
            this.e0[0].a.setVerticalScrollBarEnabled(false);
            kx kxVar8 = this.C0;
            if (kxVar8 != null) {
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, kxVar8, getResourceProvider());
            }
            this.w1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            zx zxVar = this.e0[0];
            Property property = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(zxVar, (Property<zx, Float>) property, z10 ? 0.0f : 1.0f));
            if (objArr == true) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                arrayList2.add(ObjectAnimator.ofFloat(this.e0[0], (Property<zx, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.e0[0], (Property<zx, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            xw xwVar2 = this.F3;
            if (xwVar2 != null) {
                xwVar2.setVisibility(0);
                arrayList2.add(ObjectAnimator.ofFloat(this.F3, (Property<xw, Float>) property, z10 ? 0.0f : 1.0f));
            }
            kx kxVar9 = this.C0;
            if (kxVar9 != null) {
                arrayList2.add(ObjectAnimator.ofFloat(kxVar9, (Property<kx, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.K) {
                    float L = org.telegram.messenger.i0.L(81.0f) + this.N + org.telegram.messenger.i0.L(48.0f);
                    kx kxVar10 = this.C0;
                    float f7 = z10 ? L : 0.0f;
                    if (z10) {
                        L = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(kxVar10, this.H3, f7, L));
                }
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(this.C0, (Property<kx, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.C0, (Property<kx, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.g0 != null) {
                l5(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new mv(this, i10));
            arrayList2.add(ofFloat);
            this.w1.playTogether(arrayList2);
            this.w1.setDuration(z10 ? 200L : 180L);
            this.w1.setInterpolator(org.telegram.ui.Components.gr.g);
            if (!z10) {
                this.w1.setStartDelay(20L);
            }
            this.w1.addListener(new dx(this, z10, i10));
            this.p3.d();
            this.w1.start();
        } else {
            L4(false, true);
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
            kx kxVar11 = this.C0;
            if (kxVar11 != null) {
                kxVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    this.C0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.C0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.C0.setVisibility(z10 ? 0 : 8);
            }
            px pxVar = this.X;
            if (pxVar != null) {
                pxVar.setTranslationY(h4() + (z10 ? -org.telegram.messenger.i0.L(36.0f) : 0));
            }
            if (this.E0 != null) {
                if (!this.G0 || isInPreviewMode() || z10) {
                    this.E0.setVisibility(8);
                } else {
                    this.E0.setVisibility(0);
                }
            }
            O4(z10 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i12 = this.y;
        if (i12 >= 0 && (kxVar2 = this.C0) != null) {
            kxVar2.setPosition(kxVar2.N(i12));
        }
        if (!z10) {
            this.y = -1;
        }
        if (z10 && z11 && (kxVar = this.C0) != null) {
            kxVar.setPosition((kxVar.s0 ? 1 : 0) + 5);
            p5(true);
        }
        Q3();
        f5();
    }

    public final void a4(long j10, boolean z10) {
        if (this.e0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            zx[] zxVarArr = this.e0;
            if (i10 >= zxVarArr.length) {
                return;
            }
            int childCount = zxVarArr[i10].a.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = this.e0[i10].a.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.v2) {
                        org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt;
                        if (v2Var.getDialogId() == j10) {
                            v2Var.c0(z10, true);
                            break;
                        }
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    public final void a5() {
        int i10;
        int i11;
        if (this.M0 != null || org.telegram.messenger.tz.x || (this.K && !this.E0.g())) {
            return;
        }
        z21[] z21VarArr = new z21[1];
        TLRPC.User f7 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).f();
        org.telegram.ui.ActionBar.u5 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i10 = 0;
            i11 = 0;
        } else {
            this.D3.f();
            Drawable drawable = this.D3.f[0];
            Rect rect = org.telegram.messenger.i0.Q;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
            i10 = org.telegram.messenger.i0.L(4.0f) + (rect.centerX() - org.telegram.messenger.i0.L(16.0f));
            org.telegram.ui.Cells.n nVar = this.E3;
            if (nVar != null) {
                nVar.b(rect.centerX(), rect.centerY());
            }
            i11 = L;
        }
        yw ywVar = new yw(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), z21VarArr);
        if (f7 != null && org.telegram.messenger.o5.g(f7.emoji_status) > 0) {
            ywVar.setExpireDateHint(org.telegram.messenger.o5.g(f7.emoji_status));
        }
        Long l4 = this.B3;
        if (l4 != null) {
            ywVar.setSelected(l4);
        } else {
            Drawable drawable2 = this.D3.f[0];
            ywVar.setSelected(drawable2 instanceof org.telegram.ui.Components.f5 ? Long.valueOf(((org.telegram.ui.Components.f5) drawable2).h()) : null);
        }
        ywVar.setSaveState(1);
        ywVar.y(this.D3, titleTextView);
        zw zwVar = new zw(this, ywVar);
        this.M0 = zwVar;
        z21VarArr[0] = zwVar;
        zwVar.showAsDropDown(this.actionBar, org.telegram.messenger.i0.L(16.0f), i11, 48);
        z21VarArr[0].b();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0069, code lost:
    
        if (r13.G.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.k2, org.telegram.ui.ay] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b5(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String a02;
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.H));
        boolean V = org.telegram.messenger.w3.V(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i10 = 1;
        int i11 = 2;
        String a03 = org.telegram.messenger.cd.a0(null, null, 2131754074, chat.title, org.telegram.messenger.h20.j(Z1, true));
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = a03;
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131754075, chat.title, org.telegram.messenger.h20.j(Z1, true)));
        Boolean bool = this.G.bot_participant;
        ?? r10 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().w2(chat, Z1)) {
            charSequence = r10;
        }
        if (this.G.bot_admin_rights == null) {
            a02 = org.telegram.messenger.cd.a0(null, null, 2131754077, org.telegram.messenger.h20.j(Z1, true), chat.title);
        } else {
            String j10 = org.telegram.messenger.h20.j(Z1, true);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.G.bot_admin_rights;
            int i12 = org.telegram.ui.Cells.s6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                org.telegram.ui.Cells.f1.q(1, V ? org.telegram.messenger.cd.L0(2131751325, null) : org.telegram.messenger.cd.L0(2131751324, null), arrayList);
            }
            if (tL_chatAdminRights.post_messages && V) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.cd.L0(2131751313, null), arrayList);
            }
            if (tL_chatAdminRights.edit_messages && V) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.cd.L0(2131751320, null), arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.cd.L0(V ? 2131751322 : 2131751317, null), arrayList);
            }
            if (tL_chatAdminRights.ban_users && !V) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.cd.L0(2131751329, null), arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.cd.L0(2131751331, null), arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !V) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.cd.L0(2131751314, null), arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.cd.L0(2131751332, null), arrayList);
            }
            if (tL_chatAdminRights.anonymous && !V) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.cd.L0(2131751304, null), arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.cd.L0(2131744919, null), arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !V) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.cd.L0(2131748707, null), arrayList);
            }
            if (arrayList.size() == 1) {
                r10 = ((org.telegram.ui.Cells.t6) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r10 = new SpannableStringBuilder();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 > 0) {
                        r10.append(", ");
                    }
                    r10.append(((org.telegram.ui.Cells.t6) arrayList.get(i13)).b.toString().toLowerCase());
                }
            }
            a02 = org.telegram.messenger.cd.a0(null, null, 2131754076, new Object[]{j10, str, r10});
        }
        charSequence = TextUtils.concat("\n\n", org.telegram.messenger.i0.W2(a02));
        x1Var.T = TextUtils.concat(W2, charSequence);
        alertDialog$Builder.k(org.telegram.messenger.cd.a0("Send", null, 2131745657, new Object[0]), new jf(i10, runnable));
        alertDialog$Builder.h(org.telegram.messenger.cd.a0("Cancel", null, 2131752589, new Object[0]), new jf(i11, runnable2));
        showDialog(x1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0218 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList c4(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (z10 && (arrayList = this.R1) != null) {
            return arrayList;
        }
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(org.telegram.messenger.c.a(i10).a);
        a0.h hVar = r12.Q;
        ArrayList arrayList2 = r12.J;
        ArrayList arrayList3 = r12.I;
        ArrayList arrayList4 = r12.H;
        ArrayList arrayList5 = r12.G;
        ArrayList arrayList6 = r12.L;
        ArrayList arrayList7 = r12.F;
        if (i11 == 0) {
            return r12.V0(i12);
        }
        if (i11 == 10 || i11 == 13) {
            return r12.E;
        }
        if (i11 == 2) {
            ArrayList arrayList8 = new ArrayList(arrayList4.size() + arrayList5.size() + arrayList7.size() + 2);
            if (arrayList5.size() > 0 && this.y2) {
                arrayList8.add(new vx(0));
                arrayList8.addAll(arrayList5);
            }
            if (arrayList4.size() > 0 && this.v2) {
                arrayList8.add(new vx(1));
                arrayList8.addAll(arrayList4);
            }
            if (arrayList7.size() > 0) {
                int size = arrayList7.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList7.get(i13);
                    if ((this.y2 && org.telegram.messenger.w3.U(i10, -dialog.id)) || (this.v2 && (org.telegram.messenger.w3.m0(i10, -dialog.id) || !org.telegram.messenger.w3.S(i10, -dialog.id)))) {
                        if (r9) {
                            arrayList8.add(new vx(2));
                            r9 = false;
                        }
                        arrayList8.add(dialog);
                    }
                }
            }
            return arrayList8;
        }
        if (i11 == 3) {
            return r12.D;
        }
        if (i11 == 4 || i11 == 12) {
            return arrayList2;
        }
        if (i11 == 5) {
            return arrayList3;
        }
        if (i11 == 6 || i11 == 11) {
            return arrayList6;
        }
        if (i11 == 7 || i11 == 8) {
            org.telegram.messenger.ap apVar = r12.M[i11 != 7 ? 1 : 0];
            return apVar == null ? r12.V0(i12) : this.R0 == 3 ? apVar.l : apVar.k;
        }
        if (i11 == 9) {
            return r12.K;
        }
        if (i11 != 1 && i11 != 16 && i11 != 14) {
            if (i11 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList9 = new ArrayList();
            TLRPC.User Z1 = r12.Z1(Long.valueOf(this.H));
            TLRPC.RequestPeerType requestPeerType = this.G;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                ConcurrentHashMap concurrentHashMap = r12.d;
                int size2 = arrayList2.size();
                while (r8 < size2) {
                    Object obj = arrayList2.get(r8);
                    r8++;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) obj;
                    if (w4(getMessagesController().Z1(Long.valueOf(dialog2.id)))) {
                        arrayList9.add(dialog2);
                    }
                }
                for (TLRPC.User user : concurrentHashMap.values()) {
                    if (user != null && !hVar.d(user.id) && w4(user)) {
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_dialog.peer = tL_peerUser;
                        long j10 = user.id;
                        tL_peerUser.user_id = j10;
                        tL_dialog.id = j10;
                        arrayList9.add(tL_dialog);
                    }
                }
            } else {
                boolean z12 = requestPeerType instanceof TLRPC.TL_requestPeerTypeChat;
                if (z12 || (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                    ConcurrentHashMap concurrentHashMap2 = r12.b;
                    if (z12) {
                        arrayList3 = arrayList6;
                    }
                    int size3 = arrayList3.size();
                    while (r8 < size3) {
                        Object obj2 = arrayList3.get(r8);
                        r8++;
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) obj2;
                        if (v4(getMessagesController().L0(Long.valueOf(-dialog3.id)), Z1)) {
                            arrayList9.add(dialog3);
                        }
                    }
                    for (TLRPC.Chat chat : concurrentHashMap2.values()) {
                        if (chat != null && !hVar.d(-chat.id) && v4(chat, Z1)) {
                            TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                            if (org.telegram.messenger.w3.T(chat)) {
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_dialog2.peer = tL_peerChannel;
                                tL_peerChannel.channel_id = chat.id;
                            } else {
                                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                tL_dialog2.peer = tL_peerChat;
                                tL_peerChat.chat_id = chat.id;
                            }
                            tL_dialog2.id = -chat.id;
                            arrayList9.add(tL_dialog2);
                        }
                    }
                }
            }
            return arrayList9;
        }
        ArrayList arrayList10 = this.S3;
        if (arrayList10 != null) {
            return arrayList10;
        }
        this.S3 = new ArrayList();
        r9 = i11 == 16;
        if (this.z2 || this.A2 || r9) {
            int size4 = arrayList2.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj3 = arrayList2.get(i14);
                i14++;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) obj3;
                TLRPC.User Z12 = r12.Z1(Long.valueOf(dialog4.id));
                if (Z12 != null && !org.telegram.messenger.h20.x(Z12)) {
                    if (!r9) {
                        if (Z12.bot) {
                            if (this.A2) {
                                if (org.telegram.messenger.h20.B(Z12)) {
                                }
                            }
                        } else if (this.z2) {
                            if (org.telegram.messenger.h20.B(Z12)) {
                            }
                        }
                        this.S3.add(dialog4);
                    } else if (!org.telegram.messenger.h20.A(Z12.id) && !org.telegram.messenger.vp.E2(Z12)) {
                        this.S3.add(dialog4);
                    }
                }
            }
        }
        if (this.v2 || (((z11 = this.x2) && this.w2) || r9)) {
            int size5 = arrayList6.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj4 = arrayList6.get(i15);
                i15++;
                TLRPC.Dialog dialog5 = (TLRPC.Dialog) obj4;
                TLRPC.Chat L0 = r12.L0(Long.valueOf(-dialog5.id));
                if (L0 != null && !org.telegram.messenger.w3.V(L0)) {
                    if (r9) {
                        if (org.telegram.messenger.w3.n0(L0)) {
                            this.S3.add(dialog5);
                        }
                    } else if (r12.y(dialog5)) {
                        this.S3.add(dialog5);
                    }
                }
            }
        } else if (z11 || this.w2 || r9) {
            int size6 = arrayList6.size();
            int i16 = 0;
            while (i16 < size6) {
                Object obj5 = arrayList6.get(i16);
                i16++;
                TLRPC.Dialog dialog6 = (TLRPC.Dialog) obj5;
                TLRPC.Chat L02 = r12.L0(Long.valueOf(-dialog6.id));
                if (L02 != null && !org.telegram.messenger.w3.V(L02)) {
                    if (r9) {
                        if (org.telegram.messenger.w3.n0(L02)) {
                            this.S3.add(dialog6);
                        }
                    } else if (r12.y(dialog6)) {
                        if (this.x2) {
                            if (!org.telegram.messenger.w3.n0(L02)) {
                                this.S3.add(dialog6);
                            }
                        }
                        if (this.w2 && org.telegram.messenger.w3.n0(L02)) {
                            this.S3.add(dialog6);
                        }
                    }
                }
            }
        }
        if (this.y2 || r9) {
            int size7 = arrayList3.size();
            while (r8 < size7) {
                Object obj6 = arrayList3.get(r8);
                r8++;
                TLRPC.Dialog dialog7 = (TLRPC.Dialog) obj6;
                TLRPC.Chat L03 = r12.L0(Long.valueOf(-dialog7.id));
                if (r9) {
                    if (L03 instanceof TLRPC.TL_channel) {
                        this.S3.add(dialog7);
                    }
                } else if (r12.y(dialog7)) {
                    this.S3.add(dialog7);
                }
            }
        }
        org.telegram.messenger.vp messagesController = getMessagesController();
        ArrayList arrayList11 = this.S3;
        if (arrayList11 == null) {
            messagesController.getClass();
        } else {
            Collections.sort(arrayList11, messagesController.F7);
        }
        return this.S3;
    }

    public final void c5(boolean z10) {
        zx[] zxVarArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            zxVarArr = this.e0;
            if (i11 >= zxVarArr.length) {
                break;
            }
            zxVarArr[i11].a.C0();
            i11++;
        }
        char c10 = (!z10 || zxVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i12 = zxVarArr[c10].h;
        if (i12 < 0 || i12 >= getMessagesController().S0().size()) {
            return;
        }
        org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) getMessagesController().S0().get(this.e0[c10].h);
        if (apVar.e()) {
            zx zxVar = this.e0[c10];
            zxVar.s = this.R0;
            wx wxVar = zxVar.a;
            int i13 = wx.B3;
            wxVar.D1();
        } else {
            zx[] zxVarArr2 = this.e0;
            if (zxVarArr2[c10 ^ 1].s == 7) {
                zxVarArr2[c10].s = 8;
            } else {
                zxVarArr2[c10].s = 7;
            }
            zxVarArr2[c10].a.setScrollEnabled(true);
            org.telegram.messenger.vp messagesController = getMessagesController();
            char c11 = this.e0[c10].s == 8 ? (char) 1 : (char) 0;
            org.telegram.messenger.ap[] apVarArr = messagesController.M;
            org.telegram.messenger.ap apVar2 = apVarArr[c11];
            if (apVar2 != apVar) {
                apVarArr[c11] = apVar;
                int i14 = c11 ^ 1;
                if (apVarArr[i14] == apVar) {
                    apVarArr[i14] = null;
                }
                if (apVarArr[c11] != null) {
                    messagesController.Q4(null);
                } else if (apVar2 != null) {
                    apVar2.k.clear();
                    apVar2.l.clear();
                }
            }
        }
        zx[] zxVarArr3 = this.e0;
        if (zxVarArr3.length > 1) {
            zxVarArr3[1].E = apVar.p;
        }
        zx zxVar2 = zxVarArr3[c10];
        lw lwVar = zxVar2.d;
        lwVar.h = zxVar2.s;
        lwVar.f();
        zx zxVar3 = this.e0[c10];
        hw hwVar = zxVar3.c;
        if (zxVar3.s == 0 && k4() && this.e0[c10].w == 2) {
            i10 = 1;
        }
        hwVar.h1(i10, (int) this.N);
        B3(this.e0[c10]);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean canBeginSlide() {
        qx qxVar;
        if (this.F3.c()) {
            return false;
        }
        return this.R0 != 3 || (qxVar = this.z0) == null || qxVar.getVisibility() != 0 || this.z0.K <= 0;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean closeLastFragment() {
        if (!this.F3.c()) {
            return super.closeLastFragment();
        }
        this.F3.a();
        kx kxVar = this.C0;
        if (kxVar == null) {
            return true;
        }
        kxVar.S();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        kg.g1 g1Var = new kg.g1(this, context, this.resourceProvider, 4);
        g1Var.setAllowOverlayTitle(true);
        g1Var.G0 = true;
        if (g1Var.F0 == null) {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(g1Var.getContext(), 9);
            g1Var.F0 = a5Var;
            g1Var.addView(a5Var);
        }
        org.telegram.ui.ActionBar.a7.m(g1Var, 3, org.telegram.ui.ActionBar.t6.t8, getResourceProvider());
        org.telegram.ui.ActionBar.a7.a(g1Var, org.telegram.ui.ActionBar.t6.z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.a7.m(g1Var, 1, org.telegram.ui.ActionBar.t6.v8, getResourceProvider());
        org.telegram.ui.ActionBar.a7.b(g1Var, org.telegram.ui.ActionBar.t6.y8, getResourceProvider(), true);
        if (g1Var.w1 == null) {
            org.telegram.ui.ActionBar.j jVar = new org.telegram.ui.ActionBar.j(g1Var, g1Var.getContext(), g1Var.J0, g1Var.O0);
            g1Var.w1 = jVar;
            jVar.setClipChildren(false);
            g1Var.addView(g1Var.w1);
        }
        g1Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.i0.L(4.0f));
        g1Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.i0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.i0.Q1() || this.W2 == 0 || p4())) {
            return g1Var;
        }
        g1Var.setOccupyStatusBar(false);
        return g1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c56  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c7f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0cc1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0db4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0e0c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e44  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c87  */
    /* JADX WARN: Type inference failed for: r10v18, types: [org.telegram.ui.Components.tk0, org.telegram.ui.wx] */
    /* JADX WARN: Type inference failed for: r10v23, types: [org.telegram.ui.Components.tk0, org.telegram.ui.wx] */
    /* JADX WARN: Type inference failed for: r10v24, types: [org.telegram.ui.Components.tk0, org.telegram.ui.wx] */
    /* JADX WARN: Type inference failed for: r10v26, types: [org.telegram.ui.hw, s4.a0] */
    /* JADX WARN: Type inference failed for: r13v10, types: [org.telegram.ui.Components.tk0, org.telegram.ui.wx] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r9v61, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f7;
        float f10;
        float f11;
        un unVar;
        qx qxVar;
        px pxVar;
        px pxVar2;
        org.telegram.ui.Components.zr zrVar;
        yx yxVar;
        s4.x xVar;
        zf.m mVar;
        zf.m mVar2;
        zf.m mVar3;
        zf.m mVar4;
        zf.m mVar5;
        zf.m mVar6;
        ux uxVar;
        int i10;
        int i11;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r92;
        int i12;
        int i13;
        Context context2 = context;
        int i14 = 0;
        this.j2 = false;
        this.k2 = false;
        this.V = false;
        this.V0 = null;
        this.z0 = null;
        ArrayList arrayList = this.I2;
        arrayList.clear();
        this.l3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        org.telegram.messenger.i0.g3(new ev(context2, i14));
        this.N1 = null;
        this.L1 = null;
        this.M1 = null;
        this.Q1 = null;
        this.J1 = null;
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        p5.setTranslationX(-org.telegram.messenger.i0.L(5.0f));
        org.telegram.ui.ActionBar.t0 a2 = p5.a(0, R.drawable.outline_header_search);
        a2.N();
        this.j0 = a2;
        int i15 = 3;
        a2.setOnClickListener(new hv(this, i15));
        int i16 = 8;
        int i17 = 2;
        if (this.R0 == 2 || (p4() && c4(this.currentAccount, this.R0, this.W2, false).isEmpty())) {
            this.j0.setVisibility(8);
        }
        this.j0.setVisibility(8);
        ?? r52 = 1;
        ?? r53 = 1;
        if (!this.l2 && this.n2 == null && this.W2 == 0 && this.Y2 == 0) {
            int i18 = org.telegram.ui.ActionBar.t6.t8;
            int themedColor = getThemedColor(i18);
            int i19 = org.telegram.ui.ActionBar.t6.v8;
            org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context2, themedColor, getThemedColor(i19));
            this.m0 = t0Var;
            t0Var.setText(org.telegram.messenger.cd.K0(2131751355).toUpperCase());
            if (this.m0.getTextView() != null) {
                org.telegram.ui.ActionBar.a7.V(this.m0.getTextView(), i19, getResourceProvider());
            }
            org.telegram.ui.ActionBar.t0 t0Var2 = this.m0;
            org.telegram.ui.ActionBar.a7.R(t0Var2, t0Var2.getBackground(), null, org.telegram.ui.ActionBar.a7.N(i18), getResourceProvider());
            this.actionBar.addView(this.m0, w7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.m0.setOnClickListener(new hv(this, i16));
            this.m0.setAlpha(0.0f);
            this.m0.setVisibility(8);
            this.n0 = new org.telegram.ui.Components.kh0(context2);
            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(context2, this.resourceProvider, false, true);
            this.o0 = b1Var;
            b1Var.setItemHeight(56);
            this.o0.j(org.telegram.messenger.cd.K0(2131748620), 0, this.n0);
            this.o0.setContentDescription(org.telegram.messenger.cd.K0(2131746616));
            org.telegram.ui.ActionBar.t0 a10 = p5.a(1, R.drawable.outline_header_lock_24);
            this.f0 = a10;
            a10.setContentDescription(org.telegram.messenger.cd.K0(2131754813));
            org.telegram.ui.ActionBar.t0 d = p5.d(3, new ColorDrawable(0));
            this.g0 = d;
            dy dyVar = new dy(context2, this.currentAccount);
            this.h0 = dyVar;
            d.addView(dyVar);
            this.g0.setContentDescription(org.telegram.messenger.cd.K0(2131751344));
            this.g0.setVisibility(8);
            l5(false, false);
        }
        px pxVar3 = new px(context2, this.resourceProvider);
        this.X = pxVar3;
        pxVar3.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        int i20 = 9;
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.t0 a11 = p5.a(-47, R.drawable.avd_speed);
            this.l0 = a11;
            org.telegram.messenger.i0.E2(a11);
            this.l0.setOnClickListener(new hv(this, i20));
            this.X.a(this.l0);
            this.X.updateColors();
        }
        this.X.setCloseButtonOnClickListener(new fv(this, 16));
        this.X.r.setOnFocusChangeListener(new od(this, r53 == true ? 1 : 0));
        org.telegram.ui.ActionBar.n0 n0Var = this.X.r;
        int i21 = 11;
        rf.a0 a0Var = new rf.a0(n0Var, new ag.l3(this, i21));
        this.Y = a0Var;
        n0Var.addTextChangedListener(a0Var);
        this.X.setSearchFiltersListener(new iw(this));
        this.Y.a();
        int i22 = 10;
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.t0 a12 = p5.a(4, R.drawable.ic_ab_other);
            this.k0 = a12;
            a12.setContentDescription(org.telegram.messenger.cd.K0(2131754839));
            this.k0.setOnClickListener(new hv(this, i22));
            this.k0.setOnLongClickListener(new uv(this, i15));
        }
        this.j0.setSearchFieldHint(org.telegram.messenger.cd.K0(2131745853));
        this.j0.setContentDescription(org.telegram.messenger.cd.K0(2131745853));
        if (this.l2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i23 = this.R0;
            if (i23 == 16) {
                this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131753100));
            } else if (this.N0) {
                this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131746269));
            } else if (this.O0) {
                this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131746444));
            } else if (i23 == 3 && this.f2 == null) {
                this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131750577));
            } else if (i23 == 10) {
                this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131745685));
            } else if (i23 == 14) {
                boolean z10 = this.A2;
                if (!z10 || this.z2 || this.v2 || this.y2) {
                    boolean z11 = this.z2;
                    if (!z11 || z10) {
                        i12 = 2131745686;
                    } else {
                        i12 = 2131745686;
                        if (!this.v2 && !this.y2) {
                            this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131752110));
                        }
                    }
                    boolean z12 = this.v2;
                    if (!z12 || z11 || z10) {
                        i13 = 2131752135;
                    } else {
                        i13 = 2131752135;
                        if (!this.y2) {
                            this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131752125));
                        }
                    }
                    if (!this.y2 || z11 || z10 || z12) {
                        this.actionBar.setTitle(org.telegram.messenger.cd.K0(i12));
                    } else {
                        this.actionBar.setTitle(org.telegram.messenger.cd.K0(i13));
                    }
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131752137));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.G;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool == null) {
                        this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131752110));
                    } else if (bool.booleanValue()) {
                        this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131752137));
                    } else {
                        this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131752110));
                    }
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131752135));
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                    this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131752125));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131745686));
                }
            }
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.actionBar, getResourceProvider());
        } else {
            if (this.n2 != null || this.W2 != 0 || this.Y2 != 0) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
                this.e1 = c2Var;
                lVar.setBackButtonDrawable(c2Var);
            }
            if (this.W2 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131754136));
            } else if (this.Y2 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.o5.m(this.Z2));
                this.actionBar.setAdditionalTextLeft(org.telegram.messenger.i0.L(28.0f));
                this.c3 = new org.telegram.ui.Components.r8(this.Z2);
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getContext());
                this.b3 = g9Var;
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(11.0f));
                this.b3.e(this.Z2, this.c3);
                this.actionBar.addView(this.b3, w7.b6.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(26.0f), null);
                this.D3 = d5Var;
                d5Var.a = true;
                Drawable f12 = i0.a.f(context2, R.drawable.telegram_logo_2);
                this.C3 = f12;
                f12.setBounds(0, org.telegram.messenger.i0.L(2.0f), this.C3.getIntrinsicWidth(), this.C3.getIntrinsicHeight() + org.telegram.messenger.i0.L(2.0f));
                Drawable drawable = this.C3;
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.Ul);
                this.v4 = themedColor2;
                drawable.setColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.K0(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.C3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.J(spannableStringBuilder, this.D3);
                q5(org.telegram.messenger.d20.i(this.currentAccount).f(), false);
            }
            if (this.W2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        int i24 = 17;
        this.actionBar.setTitleActionRunnable(new fv(this, i24));
        int i25 = this.R0;
        if (((i25 == 0 && !this.l2) || i25 == 3) && this.W2 == 0 && this.Y2 == 0 && TextUtils.isEmpty(this.n2)) {
            qx qxVar2 = new qx(this, context2, this.resourceProvider);
            this.z0 = qxVar2;
            qxVar2.setVisibility(8);
            this.x = false;
            this.r.a(false, false);
            this.z0.setDelegate(new rx(context2, this));
        }
        if (this.r2 && org.telegram.messenger.d20.c() > 1) {
            this.D1 = p5.g(11, 0, org.telegram.messenger.i0.L(56.0f));
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8();
            r8Var.u(org.telegram.messenger.i0.L(12.0f));
            org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context2);
            g9Var2.setRoundRadius(org.telegram.messenger.i0.L(18.0f));
            this.D1.addView(g9Var2, w7.b6.e(36, 36, 17));
            this.D1.setOnClickListener(new hv(this, i21));
            this.D1.setOnLongClickListener(new uv(this, i17));
            TLRPC.User f13 = getUserConfig().f();
            r8Var.r(f13);
            ImageReceiver imageReceiver = g9Var2.getImageReceiver();
            int i26 = this.currentAccount;
            imageReceiver.d = i26;
            g9Var2.m(org.telegram.messenger.ic.m(i26, 1, f13), "50_50", org.telegram.messenger.ic.n(f13), "50_50", (f13 == null || (userProfilePhoto = f13.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? r8Var : r92, f13);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 18));
        tx txVar = new tx(context2, this);
        this.fragmentView = txVar;
        this.r4 = new yv(this, txVar, new PointF(), i14);
        int i27 = (this.W2 == 0 && this.Y2 == 0 && (((i11 = this.R0) == 0 && !this.l2) || i11 == 3)) ? 2 : 1;
        this.e0 = new zx[i27];
        int i28 = 0;
        while (i28 < i27) {
            zx zxVar = new zx(context2, this);
            txVar.addView(zxVar, w7.b6.c(-1.0f, -1));
            zxVar.s = this.R0;
            this.e0[i28] = zxVar;
            zxVar.x = new org.telegram.ui.Components.zz(context2);
            zxVar.x.setViewType(7);
            zxVar.x.setVisibility(i16);
            zxVar.addView(zxVar.x, w7.b6.e(-2, -2, i24));
            wx wxVar = new wx(this, context2, zxVar);
            zxVar.a = wxVar;
            this.glassEngine.b(wxVar);
            ?? r13 = zxVar.a;
            zxVar.b = new a5.a((org.telegram.ui.Components.tk0) r13);
            r13.setAllowStopHeaveOperations(r52);
            zxVar.a.setAccessibilityEnabled(false);
            zxVar.a.o1(0, r52);
            zxVar.a.setClipToPadding(false);
            zxVar.a.setPivotY(0.0f);
            if (this.R0 == 15) {
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, zxVar.a, getResourceProvider());
            }
            zxVar.y = new fw(zxVar.a, zxVar);
            zxVar.a.setVerticalScrollBarEnabled(r52);
            zxVar.a.setInstantClick(r52);
            zxVar.c = new hw(this, zxVar);
            zxVar.c.j1(r52);
            zxVar.a.setLayoutManager(zxVar.c);
            zxVar.a.setVerticalScrollbarPosition(org.telegram.messenger.cd.X ? r52 : 2);
            zxVar.addView(zxVar.a, w7.b6.c(-1.0f, -1));
            zxVar.a.setOnItemClickListener(new rv(i17, this, zxVar));
            zxVar.a.setOnItemLongClickListener(new m4.c(i24, this, zxVar));
            zxVar.f = new yx(this, zxVar);
            zxVar.D = new org.telegram.ui.Components.wj0(zxVar.a, false);
            yxVar = zxVar.f;
            zxVar.e = new s4.x(yxVar);
            xVar = zxVar.e;
            xVar.h(zxVar.a);
            zxVar.a.setOnScrollListener(new jw(this, zxVar, txVar));
            zxVar.w = org.telegram.messenger.tz.q1 ? 2 : 0;
            if (zxVar.n == null && this.W2 == 0 && this.Y2 == 0) {
                zxVar.n = new kw(org.telegram.messenger.cd.K0(2131754720), org.telegram.messenger.cd.K0(2131754722), zxVar);
                if (k4()) {
                    zxVar.n.h();
                } else {
                    zxVar.n.b();
                }
                kw kwVar = zxVar.n;
                i10 = zxVar.w;
                kwVar.g(i10 != 0 ? r52 : false);
            }
            tx txVar2 = txVar;
            boolean z13 = r52;
            int i29 = i28;
            int i30 = i27;
            context2 = context;
            zxVar.d = new lw(this, this, context, zxVar.s, this.W2, this.l2, arrayList, this.currentAccount, this.G, zxVar);
            mVar = zxVar.d;
            mVar.S(zxVar.a);
            mVar2 = zxVar.d;
            mVar2.Q(this.t2);
            if (zxVar.s == 3) {
                mVar6 = zxVar.d;
                mVar6.N((getMessagesController().T4() && (uxVar = this.C2) != null && uxVar.G()) ? z13 : false);
            }
            if (org.telegram.messenger.i0.Q1()) {
                org.telegram.messenger.gs gsVar = this.p2;
                if (gsVar.a != 0) {
                    mVar5 = zxVar.d;
                    mVar5.R(gsVar.a);
                }
            }
            mVar3 = zxVar.d;
            mVar3.O(zxVar.n);
            wx wxVar2 = zxVar.a;
            mVar4 = zxVar.d;
            wxVar2.setAdapter(mVar4);
            zxVar.a.setEmptyView((this.W2 == 0 && this.Y2 == 0) ? zxVar.x : null);
            zxVar.r = new org.telegram.ui.Components.vj0(zxVar.a, zxVar.c);
            org.telegram.ui.Components.vj0 vj0Var = zxVar.r;
            vj0Var.c = z13;
            vj0Var.d = z13;
            vj0Var.h = new iv(this, 13);
            if (i29 != 0) {
                this.e0[i29].setVisibility(8);
            }
            i28 = i29 + 1;
            i21 = 11;
            txVar = txVar2;
            r52 = z13;
            i27 = i30;
            i24 = 17;
            i16 = 8;
        }
        tx txVar3 = txVar;
        int i31 = i21;
        int i32 = r52;
        org.telegram.ui.Components.yr yrVar = new org.telegram.ui.Components.yr(context2);
        this.K1 = yrVar;
        int i33 = org.telegram.ui.ActionBar.t6.d6;
        yrVar.setColor(org.telegram.ui.ActionBar.t6.v0(i33));
        txVar3.addView(this.K1, w7.b6.e(-1, 100, 48));
        this.B0 = txVar3.getChildCount();
        q01 q01Var = new q01((Activity) getContext());
        this.Z = q01Var;
        txVar3.addView(q01Var, w7.b6.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        q01 q01Var2 = this.Z;
        wg.d o10 = w7.b9.o(this.resourceProvider);
        tg.b bVar = this.p4;
        vg.f b10 = bVar.b(q01Var2, o10);
        org.telegram.messenger.z20.u(b10, org.telegram.messenger.i0.L(18.0f), 6.666f);
        this.Z.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f));
        this.Z.setBlurredBackground(b10);
        zf.g0 g0Var = new zf.g0(getParentActivity(), null);
        this.b0 = g0Var;
        g0Var.setPadding(0, org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f));
        zf.g0 g0Var2 = this.b0;
        g0Var2.h3 = false;
        g0Var2.setOnItemClickListener(new nv(this, i32));
        this.Z.addView(this.b0, w7.b6.e(-1, -1, 48));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context2, this.resourceProvider, i32);
        this.u0 = f10Var;
        f10Var.setContentDescription(org.telegram.messenger.cd.K0(2131744577));
        this.u0.setImageResource(R.drawable.outline_fab_story_24);
        this.u0.setOnClickListener(new hv(this, 27));
        txVar3.addView(this.u0, org.telegram.ui.Components.f10.c());
        org.telegram.ui.Components.f10 f10Var2 = new org.telegram.ui.Components.f10(context2, this.resourceProvider);
        this.t0 = f10Var2;
        txVar3.addView(f10Var2, org.telegram.ui.Components.f10.b());
        this.t0.setOnClickListener(new hv(this, 28));
        if (!p4() && this.R0 == 0 && org.telegram.messenger.vp.r1(this.currentAccount).s1().getBoolean("storyhint", i32)) {
            vh.p2 p2Var = new vh.p2(context2, 2);
            p2Var.q(8.0f);
            p2Var.d = 8000L;
            p2Var.i(i32);
            p2Var.n();
            p2Var.p(i32);
            f7 = 8.0f;
            p2Var.s(org.telegram.messenger.i0.J2(org.telegram.messenger.cd.K0(2131744730), vh.o8.m(context2), "%s"));
            p2Var.l(1.0f, -40.0f);
            p2Var.h(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
            p2Var.l0 = new ew(this, i17);
            this.p0 = p2Var;
            txVar3.addView(p2Var, w7.b6.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        } else {
            f7 = 8.0f;
        }
        r5();
        this.a0 = null;
        int i34 = 5;
        if (this.l2 || this.R0 != 0) {
            f10 = 72.0f;
            if (this.R0 == 3 || T3()) {
                zg.e eVar = new zg.e(context2);
                this.y1 = eVar;
                eVar.setClipChildren(false);
                zg.e eVar2 = this.y1;
                hh.i iVar = this.w;
                eVar2.setWindowInsetsProvider(iVar);
                zg.e eVar3 = this.y1;
                eVar3.setInputIslandBubbleDrawable(bVar.b(eVar3, w7.b9.o(this.resourceProvider)));
                zg.e eVar4 = this.y1;
                eVar4.setUnderKeyboardBackgroundDrawable(this.n4.b(eVar4, w7.b9.o(this.resourceProvider)));
                tg.c cVar = new tg.c(this.q4.b(this.y1, null));
                if (!org.telegram.messenger.tz.f() || org.telegram.messenger.sc.e(262144)) {
                    cVar.b(org.telegram.messenger.i0.L(72.0f), i32);
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
                ow owVar2 = new ow(this, getParentActivity(), txVar3);
                this.B1 = owVar2;
                owVar2.setInAppInsetsController(iVar);
                this.B1.y4 = false;
                txVar3.setClipChildren(false);
                txVar3.setClipToPadding(false);
                ow owVar3 = this.B1;
                owVar3.x4 = false;
                owVar3.i2 = (org.telegram.messenger.i0.E || ((unVar = owVar3.P2) != null && unVar.isInBubbleMode())) ? false : i32;
                this.B1.S0(false, false);
                this.B1.e1(i32, false);
                this.B1.z1.setPadding(0, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(20.0f), 0);
                f11 = 0.0f;
                this.B1.getSendButton().setAlpha(0.0f);
                this.B1.setViewParentForEmoji(this.A1);
                this.z1.addView(this.B1, w7.b6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                txVar3.addView(this.y1.getFadeView(), w7.b6.c(-1.0f, -1));
                txVar3.addView(this.y1, w7.b6.c(-1.0f, -1));
                if (l4() || this.E2 != null || this.F2 != null) {
                    u3(this.U3);
                    this.U3 = null;
                }
                this.B1.setDelegate(new iw(this));
                bi.f2 f2Var = new bi.f2(this, context2, this.resourceProvider);
                this.C1 = f2Var;
                int L = org.telegram.messenger.i0.L(52.0f);
                int L2 = org.telegram.messenger.i0.L(38.0f);
                f2Var.I = L;
                f2Var.J = L2;
                bi.f2 f2Var2 = this.C1;
                float L3 = org.telegram.messenger.i0.L(7.0f);
                float L4 = org.telegram.messenger.i0.L(f7);
                f2Var2.M = L3;
                f2Var2.N = L4;
                bi.f2 f2Var3 = this.C1;
                f2Var3.h0 = i32;
                txVar3.addView(f2Var3, w7.b6.e(org.telegram.messenger.zs.v1, 50, 85));
                this.C1.setScrimViewBackgroundColor(getThemedColor(i33));
                this.C1.setOnClickListener(new hv(this, i34));
                this.C1.setOnLongClickListener(new uv(this, i14));
                this.C1.setVisibility(8);
                this.C1.setScaleX(0.2f);
                this.C1.setScaleY(0.2f);
                this.C1.setAlpha(0.0f);
                float L5 = org.telegram.messenger.i0.L(12.0f);
                TextPaint textPaint = this.E1;
                textPaint.setTextSize(L5);
                textPaint.setTypeface(org.telegram.messenger.i0.o());
                qxVar = this.z0;
                if (qxVar != null) {
                    vg.f b11 = bVar.b(qxVar, w7.b9.o(this.resourceProvider));
                    org.telegram.messenger.z20.u(b11, org.telegram.messenger.i0.L(18.0f), 6.666f);
                    this.z0.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f));
                    this.z0.setBlurredBackground(b11);
                    txVar3.addView(this.z0, w7.b6.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                pxVar = this.X;
                if (pxVar != null) {
                    pxVar.setupBlurredBackground(bVar.b(pxVar, w7.b9.o(this.resourceProvider)));
                }
                uw uwVar = new uw(this, context2, this, this.currentAccount, p4() ? 1 : 0);
                this.E0 = uwVar;
                uwVar.setActionBar(this.actionBar);
                this.E0.setMenuItemsOffset(!p4() ? org.telegram.messenger.i0.L(68.0f) : org.telegram.messenger.i0.N(16.66f));
                uw uwVar2 = this.E0;
                uwVar2.l0 = false;
                uwVar2.setVisibility(8);
                this.M = false;
                this.L = false;
                this.K = false;
                if (this.l2 && this.R0 == 3) {
                    org.telegram.messenger.vp.r1(this.currentAccount).I1();
                }
                txVar3.addView(this.actionBar, w7.b6.c(-2.0f, -1));
                if (!this.l2) {
                    org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(context2);
                    this.E3 = nVar;
                    txVar3.addView(nVar, w7.b6.e(20, 20, 51));
                }
                pxVar2 = this.X;
                if (pxVar2 != null) {
                    txVar3.addView(pxVar2, w7.b6.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.x0 = txVar3.getChildCount();
                UndoView[] undoViewArr = this.y0;
                undoViewArr[0] = null;
                undoViewArr[i32] = null;
                if (this.W) {
                    this.actionBar.getTitlesContainer().setTranslationX(org.telegram.messenger.i0.L(4.0f));
                    org.telegram.ui.ActionBar.a7.d(this.actionBar, org.telegram.ui.ActionBar.t6.Ul, getResourceProvider());
                }
                if (this.W2 == 0 || this.Y2 != 0) {
                    this.e0[0].a.setGlowColor(getThemedColor(i33));
                    org.telegram.ui.ActionBar.a7.b(this.actionBar, org.telegram.ui.ActionBar.t6.O8, getResourceProvider(), false);
                    org.telegram.ui.ActionBar.a7.a(this.actionBar, org.telegram.ui.ActionBar.t6.N8, getResourceProvider(), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.t6.Q8), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.t6.R8), i32);
                }
                if (!this.l2 && this.R0 == 0) {
                    bi.t0 t0Var3 = new bi.t0(this, context2, 25);
                    this.K0 = t0Var3;
                    t0Var3.setForeground(new ColorDrawable(i0.b.o(getThemedColor(i33), 100)));
                    this.K0.setFocusable(false);
                    this.K0.setImportantForAccessibility(2);
                    this.K0.setOnClickListener(new hv(this, 7));
                    this.K0.setVisibility(8);
                    txVar3.addView(this.K0, w7.b6.c(-1.0f, -1));
                }
                this.f1.setColor(getThemedColor(i33));
                this.q3 = false;
                if (this.n2 == null) {
                    Z4(i32, false, false, false);
                    this.X.r.setText(this.n2);
                    this.X.r.setSelection(this.n2.length());
                } else if (this.o2 != null) {
                    Z4(i32, false, false, i32);
                    this.X.r.setText(this.o2);
                    this.X.r.setSelection(this.o2.length());
                    this.o2 = null;
                    px pxVar4 = this.X;
                    if (pxVar4 != null) {
                        pxVar4.setTranslationY(h4() + (-org.telegram.messenger.i0.L(36.0f)));
                    }
                } else {
                    Z4(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.a(this);
                }
                this.actionBar.setDrawBlurBackground(txVar3);
                this.F3 = new xw(this, context2, txVar3, context2);
                h5(i32, false);
                this.F3.setOpenProgress(f11);
                txVar3.addView(this.E0, w7.b6.c(81.0f, -1));
                txVar3.addView(this.F3, w7.b6.c(-1.0f, -1));
                this.F0 = new org.telegram.ui.Components.xr(context2);
                zrVar = this.J1;
                if (zrVar != null) {
                    txVar3.addView(zrVar, w7.b6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.Y2 != 0 && this.R0 != 3 && org.telegram.messenger.w3.c(this.Z2)) {
                    org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.K0(2131751989));
                    spannableStringBuilder2.setSpan(dqVar, 0, i32, 33);
                    vh.d dVar = new vh.d(context2, this.resourceProvider);
                    this.v0 = dVar;
                    dVar.f();
                    this.v0.setText(spannableStringBuilder2);
                    this.v0.setOnClickListener(new wu(3, this, new org.telegram.ui.ActionBar.x1[i32]));
                    bh.i iVar2 = new bh.i(getContext());
                    this.w0 = iVar2;
                    iVar2.setupColorKey(org.telegram.ui.ActionBar.t6.a7);
                    this.w0.setFadeZoneBottom(org.telegram.messenger.i0.L(f10) + org.telegram.messenger.i0.n);
                    this.w0.setFadeHeightBottom(org.telegram.messenger.i0.L(24.0f));
                    txVar3.addView(this.w0, w7.b6.g());
                    txVar3.addView(this.v0, w7.b6.f(48.0f, -1, 80, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.n));
                }
                s5(false);
                k5(false);
                Q3();
                N3();
                P3();
                O3();
                M3();
                G3();
                this.X.setBlurredBackgroundVisibility(this.b.e);
                ei.r rVar = this.glassEngine;
                rVar.a = new iv(this, 8);
                rVar.d = new gi.b(org.telegram.messenger.i0.L(48.0f));
                r0.h0.l(this.fragmentView, new iv(this, 9));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.zr zrVar2 = new org.telegram.ui.Components.zr(context2);
            this.J1 = zrVar2;
            zrVar2.setOnAnimatedHeightChangedListener(new ew(this, i31));
            vg.f a13 = bVar.a(this.J1);
            a13.o(w7.b9.o(this.resourceProvider));
            a13.p(org.telegram.messenger.i0.L(7.0f));
            f10 = 72.0f;
            this.J1.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f));
            this.J1.setBlurredBackground(a13);
            this.J1.setDefaultRadiusDp(this.Y2 != 0 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.G1 = frameLayout;
            this.J1.addView(frameLayout);
            this.J1.h(5, this.G1);
            this.J1.g(this.G1);
            this.J1.i(this.G1, i32, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.I1 = frameLayout2;
            this.J1.addView(frameLayout2);
            int i35 = 4;
            this.J1.h(4, this.I1);
            this.J1.g(this.I1);
            this.J1.i(this.I1, i32, false);
            mw mwVar = new mw(this, context2, this, 0);
            this.F1 = mwVar;
            this.G1.addView(mwVar);
            mw mwVar2 = new mw(this, context2, this, i32);
            this.H1 = mwVar2;
            this.I1.addView(mwVar2);
            this.J1.setCallFragmentContextView(this.H1);
            org.telegram.ui.Cells.d3 d3Var = new org.telegram.ui.Cells.d3(context2);
            this.M1 = d3Var;
            d3Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
            f5();
            y6.l0(new kv(this, i14));
            y6.q0(new z4(this, i31));
            this.J1.addView(this.M1);
            if (this.Y2 != 0) {
                zh.j jVar = new zh.j(context2, this.resourceProvider, i32);
                this.Q1 = jVar;
                jVar.a(-14899731, -15497247, R.drawable.filled_requests_24, org.telegram.messenger.cd.K0(2131751895), null, false);
                this.Q1.setUnreadMode(i32);
                this.Q1.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                this.Q1.setOnClickListener(new hv(this, i35));
                this.J1.addView(this.Q1);
                A3(false);
            }
        }
        f11 = 0.0f;
        qxVar = this.z0;
        if (qxVar != null) {
        }
        pxVar = this.X;
        if (pxVar != null) {
        }
        uw uwVar3 = new uw(this, context2, this, this.currentAccount, p4() ? 1 : 0);
        this.E0 = uwVar3;
        uwVar3.setActionBar(this.actionBar);
        this.E0.setMenuItemsOffset(!p4() ? org.telegram.messenger.i0.L(68.0f) : org.telegram.messenger.i0.N(16.66f));
        uw uwVar22 = this.E0;
        uwVar22.l0 = false;
        uwVar22.setVisibility(8);
        this.M = false;
        this.L = false;
        this.K = false;
        if (this.l2) {
            org.telegram.messenger.vp.r1(this.currentAccount).I1();
        }
        txVar3.addView(this.actionBar, w7.b6.c(-2.0f, -1));
        if (!this.l2) {
        }
        pxVar2 = this.X;
        if (pxVar2 != null) {
        }
        this.x0 = txVar3.getChildCount();
        UndoView[] undoViewArr2 = this.y0;
        undoViewArr2[0] = null;
        undoViewArr2[i32] = null;
        if (this.W) {
        }
        if (this.W2 == 0) {
        }
        this.e0[0].a.setGlowColor(getThemedColor(i33));
        org.telegram.ui.ActionBar.a7.b(this.actionBar, org.telegram.ui.ActionBar.t6.O8, getResourceProvider(), false);
        org.telegram.ui.ActionBar.a7.a(this.actionBar, org.telegram.ui.ActionBar.t6.N8, getResourceProvider(), false);
        this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.t6.Q8), false);
        this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.t6.R8), i32);
        if (!this.l2) {
            bi.t0 t0Var32 = new bi.t0(this, context2, 25);
            this.K0 = t0Var32;
            t0Var32.setForeground(new ColorDrawable(i0.b.o(getThemedColor(i33), 100)));
            this.K0.setFocusable(false);
            this.K0.setImportantForAccessibility(2);
            this.K0.setOnClickListener(new hv(this, 7));
            this.K0.setVisibility(8);
            txVar3.addView(this.K0, w7.b6.c(-1.0f, -1));
        }
        this.f1.setColor(getThemedColor(i33));
        this.q3 = false;
        if (this.n2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(txVar3);
        this.F3 = new xw(this, context2, txVar3, context2);
        h5(i32, false);
        this.F3.setOpenProgress(f11);
        txVar3.addView(this.E0, w7.b6.c(81.0f, -1));
        txVar3.addView(this.F3, w7.b6.c(-1.0f, -1));
        this.F0 = new org.telegram.ui.Components.xr(context2);
        zrVar = this.J1;
        if (zrVar != null) {
        }
        if (this.Y2 != 0) {
            org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) org.telegram.messenger.cd.K0(2131751989));
            spannableStringBuilder22.setSpan(dqVar2, 0, i32, 33);
            vh.d dVar2 = new vh.d(context2, this.resourceProvider);
            this.v0 = dVar2;
            dVar2.f();
            this.v0.setText(spannableStringBuilder22);
            this.v0.setOnClickListener(new wu(3, this, new org.telegram.ui.ActionBar.x1[i32]));
            bh.i iVar22 = new bh.i(getContext());
            this.w0 = iVar22;
            iVar22.setupColorKey(org.telegram.ui.ActionBar.t6.a7);
            this.w0.setFadeZoneBottom(org.telegram.messenger.i0.L(f10) + org.telegram.messenger.i0.n);
            this.w0.setFadeHeightBottom(org.telegram.messenger.i0.L(24.0f));
            txVar3.addView(this.w0, w7.b6.g());
            txVar3.addView(this.v0, w7.b6.f(48.0f, -1, 80, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.n));
        }
        s5(false);
        k5(false);
        Q3();
        N3();
        P3();
        O3();
        M3();
        G3();
        this.X.setBlurredBackgroundVisibility(this.b.e);
        ei.r rVar2 = this.glassEngine;
        rVar2.a = new iv(this, 8);
        rVar2.d = new gi.b(org.telegram.messenger.i0.L(48.0f));
        r0.h0.l(this.fragmentView, new iv(this, 9));
        return this.fragmentView;
    }

    public final float d4(boolean z10) {
        return (z10 ? 1.0f - this.b.e : 1.0f) * (1.0f - g4()) * this.r.e;
    }

    public final void d5() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        q01 q01Var = this.Z;
        float measuredHeight = (q01Var == null || q01Var.getVisibility() == 8) ? 0.0f : this.Z.getMeasuredHeight();
        float L = this.K ? org.telegram.messenger.i0.L(81.0f) : 0.0f;
        if (this.K) {
            float f16 = this.N;
            float f17 = this.x1;
            f7 = (measuredHeight * f17) + c3.i0.z(1.0f, f17, L, f16);
            f10 = this.x3;
        } else {
            f7 = (measuredHeight * this.x1) + this.N;
            f10 = this.x3;
        }
        float f18 = f7 + f10 + this.T;
        px pxVar = this.X;
        float L2 = org.telegram.messenger.i0.L(4.0f) * ((pxVar == null || pxVar.getVisibility() != 0) ? 0.0f : this.X.getAlpha());
        qx qxVar = this.z0;
        if (qxVar != null) {
            qxVar.setTranslationY(f18 - L2);
            f12 = this.z0.getAlpha();
            f13 = org.telegram.messenger.i0.L(43.0f) * f12;
            f11 = f18 + f13;
        } else {
            f11 = f18;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        org.telegram.ui.Components.zr zrVar = this.J1;
        if (zrVar != null) {
            zrVar.setTranslationY(org.telegram.messenger.i0.T1(f11 - L2, (-org.telegram.messenger.i0.L(3.0f)) - (this.a0 == null ? org.telegram.messenger.i0.L(44.0f) : 0), this.b.e));
            f14 = this.J1.getMetadata().c.a;
            f15 = this.J1.c(0.0f);
        } else {
            f14 = 0.0f;
            f15 = 0.0f;
        }
        org.telegram.ui.Components.yr yrVar = this.K1;
        if (yrVar != null) {
            yrVar.setTranslationY(f18 - L2);
            float W1 = org.telegram.messenger.i0.W1(Math.min(f14, f12), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(50.0f));
            org.telegram.ui.Components.yr yrVar2 = this.K1;
            float min = Math.min(org.telegram.messenger.i0.L(40.0f), (f15 + f13) - W1);
            Matrix matrix = yrVar2.b;
            if (yrVar2.e != W1 || yrVar2.f != min) {
                yrVar2.e = W1;
                yrVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = yrVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                yrVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f12, f14));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:426:0x05b0, code lost:
    
        if (org.telegram.messenger.w3.S(r4.J0, r11) != false) goto L377;
     */
    /* JADX WARN: Removed duplicated region for block: B:364:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        org.telegram.messenger.ap apVar;
        int i13;
        char c10;
        boolean booleanValue;
        boolean z10;
        org.telegram.ui.Components.zm0 zm0Var;
        org.telegram.ui.Components.zm0 zm0Var2;
        int i14;
        boolean z11;
        boolean z12;
        int i15 = 2;
        ArrayList arrayList = null;
        char c11 = 1;
        int i16 = 0;
        if (i10 == org.telegram.messenger.zs.s) {
            if (this.e0 == null || this.S1) {
                return;
            }
            int i17 = 0;
            while (true) {
                zx[] zxVarArr = this.e0;
                if (i17 >= zxVarArr.length) {
                    break;
                }
                zx zxVar = zxVarArr[i17];
                int i18 = zxVarArr[0].s;
                org.telegram.messenger.ap apVar2 = (i18 == 7 || i18 == 8) ? getMessagesController().M[this.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
                if (apVar2 != null) {
                    int i19 = apVar2.g;
                    int i20 = org.telegram.messenger.vp.D8;
                    if ((i19 & 64) != 0) {
                        z12 = true;
                        if (this.z3 || !z12) {
                            F4(zxVar);
                        } else {
                            org.telegram.messenger.i0.h3(new qq(this, zxVar, objArr, i15), 160L);
                        }
                        i17++;
                    }
                }
                z12 = false;
                if (this.z3) {
                }
                F4(zxVar);
                i17++;
            }
            qx qxVar = this.z0;
            if (qxVar != null && qxVar.getVisibility() == 0) {
                this.z0.c();
            }
            this.z3 = false;
            return;
        }
        if (i10 == org.telegram.messenger.zs.q5) {
            t5(0, true);
            return;
        }
        if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.Y2 != chatFull.id) {
                return;
            }
            this.a3 = chatFull;
            A3(false);
            if (this.e0 == null || this.S1) {
                return;
            }
            while (true) {
                zx[] zxVarArr2 = this.e0;
                if (i16 >= zxVarArr2.length) {
                    return;
                }
                F4(zxVarArr2[i16]);
                i16++;
            }
        } else {
            if (i10 == org.telegram.messenger.zs.d2) {
                qx qxVar2 = this.z0;
                if (qxVar2 == null || qxVar2.getVisibility() != 0) {
                    return;
                }
                qx qxVar3 = this.z0;
                int defaultTabId = qxVar3.getDefaultTabId();
                ag.b1 b1Var = qxVar3.F;
                ArrayList arrayList2 = qxVar3.h;
                int i21 = qxVar3.l0.get(defaultTabId, -1);
                if (i21 < 0 || i21 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) arrayList2.get(i21);
                if (pzVar.d == ((rx) qxVar3.J).a(pzVar.a) || ((rx) qxVar3.J).a(pzVar.a) < 0) {
                    return;
                }
                b1Var.g1();
                if (qxVar3.m0.get(i21) != pzVar.a(true) || qxVar3.h0) {
                    qxVar3.h0 = true;
                    qxVar3.requestLayout();
                    b1Var.setItemAnimator(qxVar3.s0);
                    fg.j jVar = qxVar3.I;
                    if (jVar != null) {
                        jVar.f();
                    }
                    qxVar3.M = 0;
                    org.telegram.ui.Components.pz d = qxVar3.d();
                    if (d != null) {
                        d.b(org.telegram.messenger.cd.L0(2131750808, null));
                    }
                    int size = arrayList2.size();
                    while (i16 < size) {
                        qxVar3.M = org.telegram.messenger.m5.C(24.0f, ((org.telegram.ui.Components.pz) arrayList2.get(i16)).a(true), qxVar3.M);
                        i16++;
                    }
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.Z4) {
                t5(0, true);
                return;
            }
            if (i10 == org.telegram.messenger.zs.Y4) {
                t5(0, true);
                return;
            }
            if (i10 == org.telegram.messenger.zs.i4) {
                if (this.e0 != null) {
                    int i22 = 0;
                    while (true) {
                        zx[] zxVarArr3 = this.e0;
                        if (i22 >= zxVarArr3.length) {
                            break;
                        }
                        wx wxVar = zxVarArr3[i22].a;
                        if (wxVar != null) {
                            for (int i23 = 0; i23 < wxVar.getChildCount(); i23++) {
                                View childAt = wxVar.getChildAt(i23);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i22++;
                    }
                }
                qx qxVar4 = this.z0;
                if (qxVar4 != null) {
                    qxVar4.getTabsContainer().g1();
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.I4) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.k(true);
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.A4) {
                l5(false, false);
                return;
            }
            long j10 = 0;
            if (i10 == org.telegram.messenger.zs.r) {
                Integer num = (Integer) objArr[0];
                t5(num.intValue(), true);
                qx qxVar5 = this.z0;
                if (qxVar5 != null && qxVar5.getVisibility() == 0) {
                    int intValue = num.intValue();
                    int i24 = org.telegram.messenger.vp.D8;
                    if ((intValue & 256) != 0) {
                        this.z0.c();
                    }
                }
                if (this.Y2 != 0) {
                    int intValue2 = num.intValue();
                    int i25 = org.telegram.messenger.vp.D8;
                    if ((intValue2 & TLObject.FLAG_13) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.Y2));
                        this.Z2 = L0;
                        this.actionBar.setTitle(org.telegram.messenger.o5.m(L0));
                        this.b3.e(this.Z2, this.c3);
                    }
                }
                if (this.e0 != null) {
                    while (i16 < this.e0.length) {
                        int intValue3 = num.intValue();
                        int i26 = org.telegram.messenger.vp.D8;
                        if ((intValue3 & 4) != 0) {
                            this.e0[i16].d.U(true);
                        }
                        i16++;
                    }
                }
                q5(org.telegram.messenger.d20.i(i11).f(), true);
                return;
            }
            int i27 = org.telegram.messenger.zs.I2;
            boolean[] zArr = y4;
            if (i10 == i27) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i10 == org.telegram.messenger.zs.Y) {
                t5(0, true);
                return;
            }
            if (i10 == org.telegram.messenger.zs.O) {
                if (this.e0 == null || this.S1) {
                    return;
                }
                org.telegram.ui.Components.f10 f10Var = this.t0;
                if (f10Var != null) {
                    z11 = f10Var.getProgressVisible();
                    this.t0.f(false, true);
                } else {
                    z11 = false;
                }
                for (zx zxVar2 : this.e0) {
                    zxVar2.d.e = false;
                }
                if (z11) {
                    K4(0.0f);
                    ValueAnimator valueAnimator = this.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.c0, 1.0f).setDuration(250L);
                    this.d0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.gr.f);
                    this.d0.addUpdateListener(new mv(this, i15));
                    this.d0.start();
                }
                int i28 = 0;
                boolean z13 = false;
                while (true) {
                    zx[] zxVarArr4 = this.e0;
                    if (i28 >= zxVarArr4.length) {
                        break;
                    }
                    if (!zxVarArr4[i28].p() || getMessagesController().D0() > 10) {
                        z13 = true;
                    } else {
                        this.e0[i28].d.f();
                    }
                    i28++;
                }
                if (z13) {
                    t5(0, true);
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.h0) {
                if (this.e0 == null) {
                    return;
                }
                int i29 = 0;
                while (true) {
                    zx[] zxVarArr5 = this.e0;
                    if (i29 >= zxVarArr5.length) {
                        int i30 = org.telegram.messenger.vp.D8;
                        t5(512, true);
                        return;
                    }
                    if (zxVarArr5[i29].p() && org.telegram.messenger.i0.Q1()) {
                        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
                        long longValue = ((Long) objArr[i16]).longValue();
                        long longValue2 = ((Long) objArr[c11]).longValue();
                        org.telegram.messenger.gs gsVar = this.p2;
                        if (!booleanValue2) {
                            gsVar.a = longValue;
                            gsVar.b = longValue2;
                        } else if (longValue == gsVar.a && longValue2 == gsVar.b) {
                            gsVar.a = 0L;
                            gsVar.b = 0L;
                        }
                        this.e0[i29].d.s = gsVar.a;
                    }
                    i29++;
                    c11 = 1;
                    i16 = 0;
                }
            } else {
                if (i10 == org.telegram.messenger.zs.f0) {
                    t5(0, true);
                    return;
                }
                if (i10 == org.telegram.messenger.zs.J || i10 == org.telegram.messenger.zs.K || i10 == org.telegram.messenger.zs.M) {
                    int i31 = org.telegram.messenger.vp.D8;
                    t5(TLObject.FLAG_12, true);
                    return;
                }
                if (i10 == org.telegram.messenger.zs.n0) {
                    J3();
                    return;
                }
                if (i10 == org.telegram.messenger.zs.P0) {
                    kx kxVar = this.C0;
                    if (kxVar == null || (zm0Var2 = kxVar.d0) == null || (i14 = zm0Var2.h0) == 15) {
                        return;
                    }
                    int i32 = zm0Var2.s0;
                    org.telegram.messenger.hs.a0(i32).a.c(new i2.u(i32, i14, new zf.q(zm0Var2), 17));
                    return;
                }
                if (i10 == org.telegram.messenger.zs.s0) {
                    int i33 = org.telegram.messenger.vp.D8;
                    t5(32768, true);
                    return;
                }
                if (i10 == org.telegram.messenger.zs.S0) {
                    kx kxVar2 = this.C0;
                    if (kxVar2 == null || (zm0Var = kxVar2.d0) == null) {
                        return;
                    }
                    zm0Var.f();
                    return;
                }
                if (i10 == org.telegram.messenger.zs.T1) {
                    int connectionState = ConnectionsManager.getInstance(org.telegram.messenger.c.a(i11).a).getConnectionState();
                    if (this.d2 != connectionState) {
                        this.d2 = connectionState;
                        l5(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == org.telegram.messenger.zs.b5) {
                    l5(true, false);
                    kx kxVar3 = this.C0;
                    if (kxVar3 != null) {
                        int currentPosition = kxVar3.getCurrentPosition();
                        mg.s sVar = kxVar3.V;
                        p5(sVar != null && sVar.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                int i34 = 3;
                if (i10 == org.telegram.messenger.zs.K2) {
                    if (this.fragmentView == null) {
                        return;
                    }
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.User user = (TLRPC.User) objArr[1];
                    TLRPC.Chat chat = (TLRPC.Chat) objArr[2];
                    if (user == null || !user.bot) {
                        booleanValue = ((Boolean) objArr[3]).booleanValue();
                        z10 = false;
                    } else {
                        z10 = ((Boolean) objArr[3]).booleanValue();
                        booleanValue = false;
                    }
                    Runnable awVar = new aw(this, chat, longValue3, booleanValue, user, z10);
                    Y3();
                    if (this.y0[0] == null) {
                        awVar.run();
                        return;
                    }
                    if (org.telegram.messenger.w3.c0(chat)) {
                        awVar.run();
                        return;
                    }
                    UndoView j42 = j4();
                    if (j42 != null) {
                        j42.j(booleanValue ? 1 : 95, longValue3, awVar);
                        return;
                    }
                    return;
                }
                if (i10 == org.telegram.messenger.zs.d0) {
                    int intValue4 = ((Integer) objArr[0]).intValue();
                    int i35 = this.W2;
                    if (i35 != intValue4 || i35 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i10 == org.telegram.messenger.zs.O2) {
                    h5(true, true);
                    return;
                }
                if (i10 == org.telegram.messenger.zs.P2) {
                    U4();
                    return;
                }
                if (i10 == org.telegram.messenger.zs.s1) {
                    W4();
                    f5();
                    org.telegram.messenger.vp messagesController = getMessagesController();
                    if (!messagesController.v8 && messagesController.N7 + 10 >= messagesController.getConnectionsManager().getCurrentTime()) {
                        boolean contains = messagesController.U3.contains("SETUP_LOGIN_EMAIL");
                        if (messagesController.U3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                            c10 = 2;
                        } else if (contains) {
                            c10 = 1;
                        }
                        if (c10 == 0) {
                            hf0 hf0Var = new hf0();
                            fv fvVar = new fv(this, 22);
                            fv fvVar2 = new fv(this, 23);
                            boolean z14 = c10 == 2;
                            hf0Var.F = 3;
                            hf0Var.a = 12;
                            hf0Var.d0 = fvVar;
                            hf0Var.e0 = fvVar2;
                            hf0Var.g0 = z14;
                            hf0Var.h0 = true;
                            presentFragment(hf0Var);
                            getMessagesController().v8 = true;
                            return;
                        }
                        return;
                    }
                    c10 = 0;
                    if (c10 == 0) {
                    }
                } else {
                    boolean z15 = true;
                    if (i10 == org.telegram.messenger.zs.N) {
                        org.telegram.ui.Components.f10 f10Var2 = this.t0;
                        if (f10Var2 != null) {
                            f10Var2.f(true, true);
                        }
                        zx[] zxVarArr6 = this.e0;
                        if (zxVarArr6 != null) {
                            int length = zxVarArr6.length;
                            int i36 = 0;
                            while (i36 < length) {
                                lw lwVar = zxVarArr6[i36].d;
                                lwVar.Q = false;
                                lwVar.e = z15;
                                lwVar.f();
                                i36++;
                                z15 = true;
                            }
                            return;
                        }
                        return;
                    }
                    if (i10 == org.telegram.messenger.zs.w) {
                        if (!this.q3 || this.C0 == null) {
                            return;
                        }
                        ArrayList arrayList3 = (ArrayList) objArr[0];
                        long longValue4 = ((Long) objArr[1]).longValue();
                        kx kxVar4 = this.C0;
                        HashMap hashMap = kxVar4.B0;
                        SparseArray sparseArray = kxVar4.h;
                        int size2 = sparseArray.size();
                        for (int i37 = 0; i37 < size2; i37++) {
                            View view = (View) sparseArray.valueAt(i37);
                            if (view instanceof z00) {
                                ((z00) view).e(arrayList3, longValue4);
                            }
                        }
                        for (int i38 = 0; i38 < kxVar4.getChildCount(); i38++) {
                            if (kxVar4.getChildAt(i38) instanceof z00) {
                                ((z00) kxVar4.getChildAt(i38)).e(arrayList3, longValue4);
                            }
                        }
                        kxVar4.O0.e(arrayList3, longValue4);
                        if (hashMap.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                        int i39 = 0;
                        while (i39 < arrayList4.size()) {
                            s00 s00Var = (s00) arrayList4.get(i39);
                            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) hashMap.get(s00Var);
                            if (jjVar != null) {
                                long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                                if (B0 < j10) {
                                    i13 = (int) (-B0);
                                }
                                i13 = 0;
                                if (i13 == longValue4) {
                                    for (int i40 = 0; i40 < arrayList3.size(); i40++) {
                                        if (jjVar.f1() == ((Integer) arrayList3.get(i40)).intValue()) {
                                            arrayList = new ArrayList();
                                            arrayList.add(s00Var);
                                        }
                                    }
                                }
                            }
                            i39++;
                            j10 = 0;
                        }
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i41 = 0; i41 < size3; i41++) {
                                hashMap.remove(arrayList.get(i41));
                            }
                            kxVar4.z0.a(hashMap.size(), true);
                            org.telegram.ui.ActionBar.t0 t0Var = kxVar4.E0;
                            if (t0Var != null) {
                                t0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i10 == org.telegram.messenger.zs.L4) {
                        if (this.e0 != null) {
                            int i42 = 0;
                            while (true) {
                                zx[] zxVarArr7 = this.e0;
                                if (i42 >= zxVarArr7.length) {
                                    break;
                                }
                                zf.j jVar2 = zxVarArr7[i42].d.P;
                                if (jVar2 != null) {
                                    jVar2.a.clear();
                                    jVar2.b.clear();
                                    jVar2.c.clear();
                                    jVar2.d.clear();
                                    org.telegram.messenger.i0.r(jVar2.e);
                                }
                                i42++;
                            }
                        }
                        int i43 = org.telegram.ui.Components.t10.i1;
                        return;
                    }
                    if (i10 == org.telegram.messenger.zs.T5) {
                        long longValue5 = ((Long) objArr[0]).longValue();
                        boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                        if (this.Y2 != longValue5 || booleanValue3) {
                            return;
                        }
                        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
                        if (z4Var == null || z4Var.getLastFragment() != this) {
                            removeSelfFromStack();
                            return;
                        } else {
                            finishFragment();
                            return;
                        }
                    }
                    if (i10 == org.telegram.messenger.zs.S5) {
                        if (this.Y2 == ((Long) objArr[0]).longValue()) {
                            A3(true);
                            return;
                        }
                        return;
                    }
                    if (i10 == org.telegram.messenger.zs.S4) {
                        boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                        if (this.fragmentView != null) {
                            if (!booleanValue4) {
                                ou ouVar = this.Q3;
                                if (ouVar == null || ouVar.getTag() == null) {
                                    return;
                                }
                                ou ouVar2 = this.Q3;
                                ouVar2.animate().setListener(null).cancel();
                                ouVar2.animate().setListener(new org.telegram.ui.Components.iw0(i34, this, ouVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                                this.Q3.setTag(null);
                                return;
                            }
                            if (this.Q3 == null) {
                                Context context = this.fragmentView.getContext();
                                ou ouVar3 = new ou(context);
                                LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
                                org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
                                ei0Var.f(R.raw.db_migration_placeholder, org.telegram.messenger.zs.g2, org.telegram.messenger.zs.g2, null);
                                ei0Var.getAnimatedDrawable().K(1);
                                ei0Var.d();
                                f7.addView(ei0Var, w7.b6.r(org.telegram.messenger.zs.g2, org.telegram.messenger.zs.g2, 1));
                                TextView textView = new TextView(context);
                                sc.e.u(textView, 1, 24.0f, null, 2131747794);
                                int i44 = org.telegram.ui.ActionBar.t6.G6;
                                org.telegram.ui.ActionBar.a7.V(textView, i44, null);
                                textView.setGravity(1);
                                TextView f10 = org.telegram.messenger.z20.f(f7, textView, w7.b6.q(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                                f10.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                                sc.e.u(f10, 1, 14.0f, null, 2131747793);
                                org.telegram.ui.ActionBar.a7.V(f10, i44, null);
                                f10.setGravity(1);
                                TextView f11 = org.telegram.messenger.z20.f(f7, f10, w7.b6.q(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                                sc.e.u(f11, 1, 14.0f, null, 2131747792);
                                org.telegram.ui.ActionBar.a7.V(f11, i44, null);
                                f11.setGravity(1);
                                f7.addView(f11, w7.b6.q(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                                ouVar3.addView(f7, w7.b6.e(-1, -2, 16));
                                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, ouVar3, null);
                                ouVar3.setOnTouchListener(new nu());
                                this.Q3 = ouVar3;
                                ouVar3.setAlpha(0.0f);
                                ((tx) this.fragmentView).addView(this.Q3);
                                this.Q3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                            }
                            this.Q3.setTag(1);
                            return;
                        }
                        return;
                    }
                    if (i10 == org.telegram.messenger.zs.a5) {
                        C3();
                        return;
                    }
                    if (i10 == org.telegram.messenger.zs.m5) {
                        q5((TLRPC.User) objArr[0], true);
                        return;
                    }
                    if (i10 == org.telegram.messenger.zs.f5) {
                        q5(org.telegram.messenger.d20.i(i11).f(), true);
                        r5();
                        return;
                    }
                    if (i10 == org.telegram.messenger.zs.t5) {
                        zArr[this.currentAccount] = false;
                        t4(getAccountInstance());
                        getMessagesController().Z2(this.W2);
                        return;
                    }
                    if (i10 == org.telegram.messenger.zs.z5) {
                        int intValue5 = ((Integer) objArr[0]).intValue();
                        int i45 = 0;
                        while (true) {
                            zx[] zxVarArr8 = this.e0;
                            if (i45 >= zxVarArr8.length) {
                                return;
                            }
                            zx zxVar3 = zxVarArr8[i45];
                            if (zxVar3 != null && (((i12 = zxVar3.s) == 7 || i12 == 8) && (apVar = getMessagesController().M[zxVar3.s - 7]) != null && intValue5 == apVar.a)) {
                                zxVar3.q(true);
                                return;
                            }
                            i45++;
                        }
                    } else {
                        if (i10 != org.telegram.messenger.zs.P1) {
                            if (i10 == org.telegram.messenger.zs.v5) {
                                s5(this.V);
                                t5(0, true);
                                return;
                            }
                            if (i10 == org.telegram.messenger.zs.Z2) {
                                r5();
                                return;
                            }
                            if (i10 == org.telegram.messenger.zs.d3) {
                                f5();
                                return;
                            }
                            if (i10 == org.telegram.messenger.zs.g5) {
                                f5();
                                return;
                            }
                            if (i10 == org.telegram.messenger.zs.y3 || i10 == org.telegram.messenger.zs.A3) {
                                f5();
                                return;
                            } else if (i10 == org.telegram.messenger.zs.P3) {
                                f5();
                                return;
                            } else {
                                if (i10 == org.telegram.messenger.zs.Q3) {
                                    f5();
                                    return;
                                }
                                return;
                            }
                        }
                        long longValue6 = ((Long) objArr[0]).longValue();
                        int i46 = 0;
                        while (true) {
                            zx[] zxVarArr9 = this.e0;
                            if (i46 >= zxVarArr9.length) {
                                return;
                            }
                            zx zxVar4 = zxVarArr9[i46];
                            if (zxVar4.a != null) {
                                int i47 = 0;
                                while (true) {
                                    if (i47 < zxVar4.a.getChildCount()) {
                                        View childAt2 = zxVar4.a.getChildAt(i47);
                                        if (childAt2 instanceof org.telegram.ui.Cells.v2) {
                                            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt2;
                                            if (longValue6 == v2Var.getDialogId()) {
                                                v2Var.z();
                                                break;
                                            }
                                        }
                                        i47++;
                                    }
                                }
                            }
                            i46++;
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof xh.m2) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final int e4() {
        if (!this.K) {
            return org.telegram.messenger.i0.L(48.0f);
        }
        return org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(81.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x03e6, code lost:
    
        if (r1.isEmpty() == false) goto L220;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0425  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e5(boolean z10) {
        boolean z11;
        org.telegram.ui.ActionBar.t0 t0Var;
        ?? r52;
        org.telegram.ui.ActionBar.b1 b1Var;
        org.telegram.ui.ActionBar.t0 t0Var2;
        qx qxVar;
        org.telegram.ui.Components.pz d;
        long j10;
        TLRPC.User Z1;
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
        long e = getUserConfig().e();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i10 < size) {
            ArrayList arrayList2 = arrayList;
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(((Long) arrayList.get(i10)).longValue());
            if (dialog == null) {
                j10 = e;
            } else {
                j10 = e;
                long j11 = dialog.id;
                boolean r42 = r4(dialog);
                boolean z12 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().s2(j11)) {
                    this.U2++;
                }
                if (getMessagesController().q2(j11, 0L, null)) {
                    this.Q2++;
                } else {
                    this.P2++;
                }
                if (z12) {
                    this.N2++;
                }
                if (this.W2 == 1 || dialog.folder_id == 1) {
                    this.T2++;
                } else if (j11 != j10 && dialog.community_id == 0 && j11 != 777000 && !getMessagesController().B2(j11, false)) {
                    i14++;
                }
                if (dialog.community_id != 0) {
                    i12++;
                }
                if (!org.telegram.messenger.o5.E(j11) || j11 == j10 || j11 == 489000 || org.telegram.messenger.vp.E2(getMessagesController().Z1(Long.valueOf(j11)))) {
                    i16++;
                } else if (org.telegram.messenger.m5.w("dialog_bar_report", j11, notificationsSettings, true)) {
                    this.S2++;
                }
                if (org.telegram.messenger.o5.y(dialog)) {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j11));
                    if (getMessagesController().B2(dialog.id, true)) {
                        this.R2++;
                        int i17 = getMessagesController().A2;
                        int i18 = org.telegram.messenger.vp.D8;
                        if (i17 == 1) {
                            i11++;
                            this.V2 = true;
                        }
                    } else {
                        if (r42) {
                            i15++;
                        } else {
                            this.O2++;
                        }
                        if (L0 == null || !L0.megagroup) {
                            this.R2++;
                        } else if (org.telegram.messenger.w3.t0(L0)) {
                            this.R2++;
                        }
                        i11++;
                    }
                } else {
                    boolean z13 = org.telegram.messenger.o5.z(dialog.id);
                    if (z13) {
                        getMessagesController().L0(Long.valueOf(-dialog.id));
                    }
                    if (org.telegram.messenger.o5.C(dialog.id)) {
                        TLRPC.EncryptedChat Z0 = getMessagesController().Z0(Integer.valueOf((int) (dialog.id & 4294967295L)));
                        Z1 = Z0 != null ? getMessagesController().Z1(Long.valueOf(Z0.user_id)) : new TLRPC.TL_userEmpty();
                    } else {
                        Z1 = (z13 || !org.telegram.messenger.o5.E(dialog.id)) ? null : getMessagesController().Z1(Long.valueOf(dialog.id));
                    }
                    if (Z1 != null && Z1.bot) {
                        org.telegram.messenger.vp.E2(Z1);
                    }
                    if (r42) {
                        i15++;
                    } else {
                        this.O2++;
                    }
                }
                i13++;
                i11++;
            }
            i10++;
            arrayList = arrayList2;
            e = j10;
        }
        ArrayList arrayList3 = arrayList;
        org.telegram.ui.ActionBar.t0 t0Var3 = this.j1;
        if (t0Var3 != null) {
            if (i11 != size || i12 > 0) {
                t0Var3.setVisibility(8);
            } else {
                t0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.b1 b1Var2 = this.r1;
        if (b1Var2 != null) {
            int i19 = this.R2;
            if ((i19 == 0 || i19 == size) && ((i13 == 0 || i13 == size) && i12 <= 0)) {
                b1Var2.setVisibility(0);
                if (this.R2 != 0) {
                    this.r1.setText(org.telegram.messenger.cd.L0(2131752088, null));
                } else {
                    this.r1.setText(org.telegram.messenger.cd.L0(2131752089, null));
                }
            } else {
                b1Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.b1 b1Var3 = this.q1;
        if (b1Var3 != null && this.m1 != null) {
            if (this.T2 != 0 && i12 == 0 && this.Y2 == 0) {
                String L02 = org.telegram.messenger.cd.L0(2131743940, null);
                this.q1.j(L02, R.drawable.msg_unarchive, null);
                this.m1.setIcon(R.drawable.msg_unarchive);
                this.m1.setContentDescription(L02);
                qx qxVar2 = this.z0;
                if (qxVar2 == null || qxVar2.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else if (i14 != 0 && i12 == 0 && this.Y2 == 0) {
                String L03 = org.telegram.messenger.cd.L0(2131754172, null);
                this.q1.j(L03, R.drawable.msg_archive, null);
                this.m1.setIcon(R.drawable.msg_archive);
                this.m1.setContentDescription(L03);
                qx qxVar3 = this.z0;
                if (qxVar3 == null || qxVar3.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else {
                b1Var3.setVisibility(8);
                this.m1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var4 = this.k1;
        if (t0Var4 != null && this.n1 != null) {
            if (this.O2 + i15 == size && this.Y2 == 0) {
                qx qxVar4 = this.z0;
                if (qxVar4 == null || qxVar4.getVisibility() != 0) {
                    this.k1.setVisibility(0);
                    this.n1.setVisibility(8);
                } else {
                    this.n1.setVisibility(0);
                    this.k1.setVisibility(8);
                }
            } else {
                t0Var4.setVisibility(8);
                this.n1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.b1 b1Var4 = this.t1;
        if (b1Var4 != null) {
            if (i16 != 0) {
                b1Var4.setVisibility(8);
            } else {
                b1Var4.setVisibility(0);
            }
        }
        if (this.p1 != null) {
            qx qxVar5 = this.z0;
            boolean z14 = qxVar5 == null || qxVar5.getVisibility() != 0 || ((d = (qxVar = this.z0).d()) != null && d.a == qxVar.L);
            if (!z14) {
                try {
                    z14 = size >= c4(this.currentAccount, this.e0[0].d.h, this.W2, this.S1).size();
                } catch (Exception unused) {
                }
            }
            if (!z14) {
                z11 = false;
                this.p1.setVisibility(0);
                if (this.o1 != null) {
                    if (this.W2 != 1) {
                        if (this.z0 != null && d4(z11) > 0.5f) {
                            qx qxVar6 = this.z0;
                            org.telegram.ui.Components.pz d10 = qxVar6.d();
                            if (d10 != null && d10.a == qxVar6.L) {
                                int i20 = org.telegram.ui.Components.uz.t1;
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = getMessagesController().P0;
                                int size2 = arrayList5.size();
                                int i21 = 0;
                                while (i21 < size2) {
                                    org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) arrayList5.get(i21);
                                    ArrayList arrayList6 = arrayList3;
                                    if (!org.telegram.ui.Components.uz.J0(this, apVar, arrayList6, true, true).isEmpty() && !apVar.e()) {
                                        arrayList4.add(apVar);
                                    }
                                    i21++;
                                    arrayList3 = arrayList6;
                                }
                            }
                        }
                        this.o1.setVisibility(8);
                    }
                    this.o1.setVisibility(0);
                }
                t0Var = this.l1;
                if (t0Var != null) {
                    r52 = 0;
                } else if (this.Q2 != 0) {
                    t0Var.setIcon(R.drawable.msg_unmute);
                    r52 = 0;
                    this.l1.setContentDescription(org.telegram.messenger.cd.L0(2131752165, null));
                } else {
                    r52 = 0;
                    t0Var.setIcon(R.drawable.msg_mute);
                    this.l1.setContentDescription(org.telegram.messenger.cd.L0(2131752175, null));
                }
                b1Var = this.s1;
                if (b1Var != 0) {
                    if (this.N2 != 0) {
                        b1Var.j(org.telegram.messenger.cd.L0(2131748696, r52), R.drawable.msg_markread, r52);
                        this.s1.setVisibility(0);
                    } else if (this.U2 == 0 && i12 == 0) {
                        b1Var.j(org.telegram.messenger.cd.L0(2131748695, r52), R.drawable.msg_markunread, r52);
                        this.s1.setVisibility(0);
                    } else {
                        b1Var.setVisibility(8);
                    }
                }
                t0Var2 = this.k1;
                if (t0Var2 != null || this.n1 == null) {
                }
                if (this.O2 != 0) {
                    t0Var2.setIcon(R.drawable.msg_pin);
                    this.k1.setContentDescription(org.telegram.messenger.cd.L0(2131747253, null));
                    this.n1.setText(org.telegram.messenger.cd.L0(2131751454, null));
                    return;
                } else {
                    t0Var2.setIcon(R.drawable.msg_unpin);
                    this.k1.setContentDescription(org.telegram.messenger.cd.L0(2131743870, null));
                    this.n1.setText(org.telegram.messenger.cd.L0(2131751453, null));
                    return;
                }
            }
            this.p1.setVisibility(8);
        }
        z11 = false;
        if (this.o1 != null) {
        }
        t0Var = this.l1;
        if (t0Var != null) {
        }
        b1Var = this.s1;
        if (b1Var != 0) {
        }
        t0Var2 = this.k1;
        if (t0Var2 != null) {
        }
    }

    public final int f4() {
        if (this.K) {
            return org.telegram.messenger.i0.L(81.0f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:346:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Runnable, org.telegram.ui.ActionBar.p6] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.util.LongSparseArray] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f5() {
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.l lVar;
        xw xwVar;
        org.telegram.messenger.t9 t9Var;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i10;
        boolean z12;
        xw xwVar2;
        long j10;
        boolean z13;
        boolean z14;
        org.telegram.messenger.w1 b10;
        ?? r62;
        String G;
        StringBuilder sb2;
        final long j11;
        final long j12;
        if (this.J1 == null || this.M1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.d3 d3Var = this.M1;
        boolean z15 = false;
        r7 = false;
        boolean z16 = false;
        if (d3Var != null) {
            try {
                ((org.telegram.ui.Components.bi0) ((org.telegram.ui.Components.r8) d3Var.h.getImageReceiver().m0).K).R(null);
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.d3 d3Var2 = this.M1;
            d3Var2.setCompact(false);
            d3Var2.a(org.telegram.messenger.d20.s0, null);
            org.telegram.ui.Components.g9 g9Var = d3Var2.h;
            g9Var.setVisibility(8);
            g9Var.b();
        }
        long j13 = 0;
        final int i11 = 1;
        if (!isInPreviewMode()) {
            if (getMessagesController().u2()) {
                this.M1.setOnClickListener(new hv(this, 12));
                this.M1.c(org.telegram.messenger.cd.L0(2131754701, null), org.telegram.messenger.cd.L0(2131754702, null), false, true);
            } else {
                int i12 = 21;
                if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().U3.contains("SETUP_PASSKEY")) {
                    this.M1.setOnClickListener(new hv(this, 19));
                    this.M1.b(org.telegram.messenger.k6.p(org.telegram.messenger.cd.L0(2131747646, null), this.M1.c, new fv(this, i12)), org.telegram.messenger.cd.L0(2131747647, null));
                    this.M1.setOnCloseListener(new hv(this, 24));
                } else if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().U3.contains("PREMIUM_GRACE")) {
                    this.M1.setOnClickListener(new hv(this, 25));
                    this.M1.b(org.telegram.messenger.k6.p(org.telegram.messenger.cd.L0(2131749534, null), this.M1.c, new fv(this, i12)), org.telegram.messenger.cd.L0(2131749538, null));
                    this.M1.setOnCloseListener(new hv(this, 26));
                } else if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().W3 != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().W3;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    org.telegram.messenger.jj.b(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true, 0);
                    Spannable A5 = org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, this.M1.c.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.title.entities, this.M1.c.getPaint().getFontMetricsInt(), false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    org.telegram.messenger.jj.b(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true, 0);
                    this.M1.b(A5, org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder2, this.M1.d.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.description.entities, this.M1.d.getPaint().getFontMetricsInt(), false));
                    org.telegram.ui.Cells.d3 d3Var3 = this.M1;
                    final int i13 = z15 ? 1 : 0;
                    d3Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bw
                        public final /* synthetic */ ay b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    gf.f.r(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    ay.Y(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.M1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bw
                        public final /* synthetic */ ay b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    gf.f.r(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    ay.Y(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.W2 == 0 && this.Y2 == 0 && org.telegram.messenger.vp.r1(this.currentAccount).U3.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        rh.e6 y3 = rh.e6.y(this.currentAccount, false);
                        ArrayList arrayList = y3.z;
                        if (!arrayList.isEmpty()) {
                            long j14 = -y3.f.amount;
                            int i14 = 0;
                            while (i14 < arrayList.size()) {
                                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i14);
                                long j15 = j13;
                                long o10 = org.telegram.messenger.o5.o(starsSubscription.peer);
                                if (o10 >= j15) {
                                    if (getMessagesController().Z1(Long.valueOf(o10)) == null) {
                                        i14++;
                                        j13 = j15;
                                    }
                                    j14 += starsSubscription.pricing.amount;
                                    i14++;
                                    j13 = j15;
                                } else {
                                    if (getMessagesController().L0(Long.valueOf(-o10)) == null) {
                                        i14++;
                                        j13 = j15;
                                    }
                                    j14 += starsSubscription.pricing.amount;
                                    i14++;
                                    j13 = j15;
                                }
                            }
                            j10 = j13;
                            if (j14 > j10) {
                                rh.e6 y10 = rh.e6.y(this.currentAccount, false);
                                ArrayList arrayList2 = y10.z;
                                StringBuilder sb3 = new StringBuilder();
                                if (arrayList2.isEmpty()) {
                                    sb2 = sb3;
                                    j11 = j10;
                                    j12 = j11;
                                } else {
                                    int i15 = 0;
                                    long j16 = j10;
                                    j12 = j16;
                                    while (i15 < arrayList2.size()) {
                                        TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i15);
                                        TLRPC.Peer peer = starsSubscription2.peer;
                                        boolean z17 = z16 ? 1 : 0;
                                        long o11 = org.telegram.messenger.o5.o(peer);
                                        if (j12 == j10) {
                                            j12 = o11;
                                        }
                                        if (o11 >= j10) {
                                            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(o11));
                                            if (Z1 != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(org.telegram.messenger.h20.p(Z1));
                                                j16 += starsSubscription2.pricing.amount;
                                                i15++;
                                                z16 = z17 ? 1 : 0;
                                            } else {
                                                i15++;
                                                z16 = z17 ? 1 : 0;
                                            }
                                        } else {
                                            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-o11));
                                            if (L0 != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(L0.title);
                                                j16 += starsSubscription2.pricing.amount;
                                                i15++;
                                                z16 = z17 ? 1 : 0;
                                            } else {
                                                i15++;
                                                z16 = z17 ? 1 : 0;
                                            }
                                        }
                                    }
                                    sb2 = sb3;
                                    j11 = j16;
                                }
                                boolean z18 = z16;
                                final String sb4 = sb2.toString();
                                this.M1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.cw
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ay ayVar = ay.this;
                                        new rh.x7(ayVar.getParentActivity(), ayVar.getResourceProvider(), j11, 2, sb4, new fv(ayVar, 2), j12).show();
                                    }
                                });
                                org.telegram.ui.Cells.d3 d3Var4 = this.M1;
                                long j17 = j11 - y10.f.amount;
                                if (j17 > j10) {
                                    j11 = j17;
                                }
                                Object[] objArr = new Object[1];
                                objArr[z18 ? 1 : 0] = sb4;
                                d3Var4.b(rh.h8.Z0(z18, org.telegram.messenger.cd.K("StarsSubscriptionExpiredHintTitle2", (int) j11, ',', objArr), 0.72f, null), org.telegram.messenger.cd.L0(2131745007, null));
                                this.M1.setOnCloseListener(new hv(this, 13));
                            }
                            if (this.W2 != 0 && this.Y2 == j10 && !getMessagesController().i7 && (b10 = org.telegram.messenger.y1.a(this.currentAccount).b()) != null && !b10.c.isEmpty() && !getMessagesController().V3.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                org.telegram.messenger.w1 b11 = org.telegram.messenger.y1.a(this.currentAccount).b();
                                ArrayList arrayList3 = b11.c;
                                this.M1.setOnClickListener(new wu(4, this, b11));
                                this.M1.a(this.currentAccount, arrayList3);
                                org.telegram.ui.Cells.d3 d3Var5 = this.M1;
                                if (arrayList3.size() == 1) {
                                    r62 = 0;
                                    G = org.telegram.messenger.cd.a0(null, null, 2131753706, org.telegram.messenger.h20.k((TLRPC.User) arrayList3.get(0)));
                                } else {
                                    r62 = 0;
                                    G = org.telegram.messenger.cd.G(arrayList3.size(), "BirthdayTodayMultipleTitle", new Object[0]);
                                }
                                d3Var5.b(org.telegram.messenger.k6.p(org.telegram.messenger.i0.R2(G, org.telegram.ui.ActionBar.t6.I6, 2, r62, r62), this.M1.c, new fv(this, 21)), org.telegram.messenger.cd.a0(null, null, arrayList3.size() == 1 ? 2131753707 : 2131753710, new Object[0]));
                                this.M1.setOnCloseListener(new hv(this, 14));
                                rh.e6.y(this.currentAccount, false).U();
                            } else if (this.W2 != 0 && this.Y2 == j10 && org.telegram.messenger.vp.r1(this.currentAccount).U3.contains("BIRTHDAY_SETUP") && getMessagesController().a2(getUserConfig().e()) != null && getMessagesController().a2(getUserConfig().e()).birthday == null) {
                                org.telegram.messenger.i5.r(this.currentAccount).D(false);
                                this.M1.setOnClickListener(new hv(this, 15));
                                this.M1.b(org.telegram.messenger.k6.p(org.telegram.messenger.cd.L0(2131753712, null), this.M1.c, new fv(this, 21)), org.telegram.messenger.cd.a0(null, null, 2131753713, new Object[0]));
                                this.M1.setOnCloseListener(new hv(this, 16));
                            } else if (!((org.telegram.messenger.vp.r1(this.currentAccount).A3() && this.W2 == 0 && this.Y2 == j10) ? org.telegram.messenger.vp.r1(this.currentAccount).U3.contains("PREMIUM_CHRISTMAS") : false)) {
                                this.M1.setOnClickListener(new bh.c(13));
                                this.M1.b(org.telegram.messenger.k6.m(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131749682, null), org.telegram.ui.ActionBar.t6.I6, 2, null, null), null, false, null, 0), org.telegram.messenger.cd.a0(null, null, 2131753331, new Object[0]));
                                this.M1.setOnCloseListener(new hv(this, 17));
                            } else if (!org.telegram.messenger.vp.r1(this.currentAccount).A3() && this.W2 == 0 && this.Y2 == j10 && org.telegram.messenger.vp.r1(this.currentAccount).U3.contains("PREMIUM_RESTORE") && !getUserConfig().q() && org.telegram.messenger.ui.b0(this.currentAccount).g0(false) != null) {
                                this.M1.setOnClickListener(new hv(this, 18));
                                this.M1.b(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.a0(null, null, 2131746081, org.telegram.messenger.ui.b0(this.currentAccount).g0(false)), org.telegram.ui.ActionBar.t6.I6, 2, null, null), org.telegram.messenger.cd.L0(2131746082, null));
                            } else {
                                if (org.telegram.messenger.vp.r1(this.currentAccount).A3() || this.W2 != 0 || this.Y2 != j10 || ((!(org.telegram.messenger.vp.r1(this.currentAccount).U3.contains("PREMIUM_UPGRADE") && getUserConfig().q()) && (!org.telegram.messenger.vp.r1(this.currentAccount).U3.contains("PREMIUM_ANNUAL") || getUserConfig().q())) || (!org.telegram.messenger.d20.i(this.currentAccount).q() ? org.telegram.messenger.ui.b0(this.currentAccount).g0(false) == null : org.telegram.messenger.v2.b() || org.telegram.messenger.ui.b0(this.currentAccount).g0(true) == null))) {
                                    z13 = false;
                                } else {
                                    this.A3 = org.telegram.messenger.vp.r1(this.currentAccount).U3.contains("PREMIUM_UPGRADE");
                                    z13 = true;
                                }
                                if (z13) {
                                    this.M1.setOnClickListener(new hv(this, 20));
                                    this.M1.b(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.a0(null, null, this.A3 ? 2131745951 : 2131743832, org.telegram.messenger.ui.b0(this.currentAccount).g0(false)), org.telegram.ui.ActionBar.t6.I6, 2, null, null), org.telegram.messenger.cd.L0(this.A3 ? 2131743835 : 2131745952, null));
                                } else {
                                    if (this.O1 != null && this.P1 != null) {
                                        if (r0.longValue() / this.P1.longValue() < 0.3f) {
                                            org.telegram.messenger.vp.d1().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                        } else if (System.currentTimeMillis() > org.telegram.messenger.vp.d1().getLong("cache_hint_showafter", j10)) {
                                            z14 = true;
                                            if (!z14) {
                                                this.M1.setOnClickListener(new hv(this, 21));
                                                this.M1.b(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.a0(null, null, 2131752048, org.telegram.messenger.i0.i0(this.O1.longValue(), false, false)), org.telegram.ui.ActionBar.t6.I6, 2, null, null), org.telegram.messenger.cd.L0(2131752049, null));
                                            } else if (this.W2 == 0 && this.Y2 == 0 && getUserConfig().f() != null && ((getUserConfig().f().photo == null || (getUserConfig().f().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && org.telegram.messenger.vp.r1(this.currentAccount).U3.contains("USERPIC_SETUP"))) {
                                                this.M1.setOnClickListener(new hv(this, 22));
                                                this.M1.h.setVisibility(0);
                                                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                                                r8Var.setBounds(0, 0, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f));
                                                long e = getUserConfig().e();
                                                r8Var.A = true;
                                                r8Var.b = true;
                                                r8Var.c = false;
                                                int i16 = org.telegram.ui.ActionBar.t6.p8[org.telegram.ui.Components.r8.e(e)];
                                                org.telegram.ui.ActionBar.p6 p6Var = r8Var.z;
                                                r8Var.d = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
                                                r8Var.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q8[org.telegram.ui.Components.r8.e(e)], p6Var);
                                                r8Var.n = 0;
                                                r8Var.m = false;
                                                org.telegram.ui.Components.r8.a("", "", "", r8Var.q);
                                                r8Var.K = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                this.M1.h.setImageDrawable(r8Var);
                                                this.M1.b(org.telegram.messenger.k6.p(org.telegram.messenger.cd.L0(2131749310, null), this.M1.c, new fv(this, 21)), org.telegram.messenger.cd.L0(2131749309, null));
                                                this.M1.setOnCloseListener(new hv(this, 23));
                                            } else {
                                                if (this.W2 == 0 && this.Y2 == 0 && org.telegram.messenger.w0.a != null) {
                                                    for (String str : org.telegram.messenger.vp.r1(this.currentAccount).U3) {
                                                        org.telegram.messenger.w0.a.getClass();
                                                    }
                                                }
                                                z15 = false;
                                            }
                                        }
                                    }
                                    z14 = false;
                                    if (!z14) {
                                    }
                                }
                            }
                        } else if (!y3.A) {
                            y3.A = true;
                            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                            tL_getStarsSubscriptions.missing_balance = true;
                            tL_getStarsSubscriptions.offset = "";
                            ConnectionsManager.getInstance(y3.a).sendRequest(tL_getStarsSubscriptions, new rh.g5(y3, z15 ? 1 : 0));
                        }
                    }
                    j10 = 0;
                    if (this.W2 != 0) {
                    }
                    if (this.W2 != 0) {
                    }
                    if (!((org.telegram.messenger.vp.r1(this.currentAccount).A3() && this.W2 == 0 && this.Y2 == j10) ? org.telegram.messenger.vp.r1(this.currentAccount).U3.contains("PREMIUM_CHRISTMAS") : false)) {
                    }
                }
            }
            z15 = true;
        }
        xw xwVar3 = this.F3;
        fe.b bVar = this.b;
        if ((xwVar3 != null && xwVar3.c()) || bVar.f) {
            z15 = false;
        }
        this.J1.i(this.M1, z15, true);
        A3(true);
        if (this.fragmentView == null || this.J1 == null) {
            z10 = false;
        } else {
            boolean z19 = !isInPreviewMode() && this.W2 == 0 && this.Y2 == 0 && this.R0 == 0 && !getMessagesController().T1().b.isEmpty() && ((xwVar2 = this.F3) == null || !xwVar2.c()) && !bVar.f;
            if (z19) {
                if (this.N1 == null) {
                    org.telegram.ui.Cells.ma maVar = new org.telegram.ui.Cells.ma(getParentActivity());
                    this.N1 = maVar;
                    this.J1.addView(maVar);
                }
                org.telegram.ui.Cells.ma maVar2 = this.N1;
                int i17 = this.currentAccount;
                TextView textView = maVar2.b;
                TextView textView2 = maVar2.c;
                ArrayList arrayList4 = org.telegram.messenger.vp.r1(i17).T1().b;
                org.telegram.ui.Cells.la laVar = maVar2.d;
                laVar.setText(org.telegram.messenger.cd.L0(2131743935, null));
                laVar.a(false, false);
                org.telegram.ui.Cells.la laVar2 = maVar2.e;
                laVar2.setText(org.telegram.messenger.cd.L0(2131743925, null));
                laVar2.a(false, false);
                if (arrayList4 == null || arrayList4.size() != 1) {
                    if (arrayList4 == null || arrayList4.size() <= 1) {
                        z10 = false;
                    } else {
                        textView.setText(org.telegram.messenger.cd.L0(2131743916, null));
                        String str2 = ((org.telegram.messenger.z10) arrayList4.get(0)).f;
                        int i18 = 1;
                        while (true) {
                            if (i18 >= arrayList4.size()) {
                                break;
                            }
                            if (!TextUtils.equals(str2, ((org.telegram.messenger.z10) arrayList4.get(i18)).f)) {
                                str2 = null;
                                break;
                            }
                            i18++;
                        }
                        if (str2 == null) {
                            z10 = false;
                            textView2.setText(org.telegram.messenger.cd.G(arrayList4.size(), "UnconfirmedAuthMultiple", new Object[0]));
                        } else {
                            z10 = false;
                            textView2.setText(org.telegram.messenger.cd.G(arrayList4.size(), "UnconfirmedAuthMultipleFrom", str2));
                        }
                    }
                    z12 = z10;
                } else {
                    org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) arrayList4.get(0);
                    boolean z20 = z10Var.a;
                    String str3 = z10Var.f;
                    boolean z21 = true;
                    textView.setText(org.telegram.messenger.cd.L0(z20 ? 2131743915 : 2131743916, null));
                    String str4 = "" + z10Var.e;
                    if (!TextUtils.isEmpty(str3) && !str4.isEmpty()) {
                        str4 = str4.concat(", ");
                    }
                    String A = sc.e.A(str4, str3);
                    if (z10Var.a) {
                        textView2.setText(org.telegram.messenger.cd.a0(null, null, 2131743917, "@" + org.telegram.messenger.o5.t(z10Var.c), A));
                    } else {
                        textView2.setText(org.telegram.messenger.cd.a0(null, null, 2131743918, A));
                        z21 = false;
                    }
                    z12 = z21;
                    z10 = false;
                }
                laVar.setOnClickListener(new org.telegram.ui.Cells.ka(this, z12, i17, arrayList4));
                laVar2.setOnClickListener(new jg.w1(maVar2, i17, arrayList4, 2));
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.ma maVar3 = this.N1;
            if (maVar3 != null) {
                this.J1.i(maVar3, z19, true);
            }
        }
        if (this.fragmentView == null || this.J1 == null) {
            return;
        }
        if (!isInPreviewMode() && this.W2 == 0 && this.Y2 == 0 && this.R0 == 0) {
            org.telegram.messenger.x9 giftAuctionsController = getGiftAuctionsController();
            if (!giftAuctionsController.d) {
                SharedPreferences sharedPreferences = giftAuctionsController.getMessagesController().f7;
                if (System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("lastGiftAuctionTimeUpdate", 0L) : 0L) < 86400000) {
                    giftAuctionsController.d = true;
                    TL_payments.TL_getStarGiftActiveAuctions tL_getStarGiftActiveAuctions = new TL_payments.TL_getStarGiftActiveAuctions();
                    ?? arrayList5 = new ArrayList();
                    ?? r72 = giftAuctionsController.b;
                    int size = r72.size();
                    for (?? r92 = z10; r92 < size; r92++) {
                        org.telegram.messenger.u9 u9Var = (org.telegram.messenger.u9) r72.valueAt(r92);
                        org.telegram.messenger.t9 t9Var2 = u9Var.b;
                        if (t9Var2 != null && !t9Var2.f() && (tL_starGiftAuctionState = (t9Var = u9Var.b).f) != null && (i10 = t9Var.e.bid_date) > 0) {
                            arrayList5.add(Long.valueOf(tL_starGiftAuctionState.version | (i10 << 32)));
                        }
                    }
                    Collections.sort(arrayList5);
                    int size2 = arrayList5.size();
                    long j18 = 0;
                    for (?? r52 = z10; r52 < size2; r52++) {
                        Long l4 = (Long) arrayList5.get(r52);
                        j18 = org.telegram.messenger.ui.p(org.telegram.messenger.ui.p(j18, l4.longValue() & 4294967295L), l4.longValue() >> 32);
                    }
                    tL_getStarGiftActiveAuctions.hash = j18;
                    giftAuctionsController.getConnectionsManager().sendRequestTyped(tL_getStarGiftActiveAuctions, new a3.b(1), new org.telegram.messenger.d(giftAuctionsController, 2));
                }
            }
            if (!giftAuctionsController.c.isEmpty() && (((xwVar = this.F3) == null || !xwVar.c()) && !bVar.f)) {
                z11 = true;
                if (z11 && this.L1 == null) {
                    org.telegram.ui.Cells.l lVar2 = new org.telegram.ui.Cells.l(getParentActivity(), this.currentAccount);
                    this.L1 = lVar2;
                    this.J1.addView(lVar2);
                }
                lVar = this.L1;
                if (lVar == null) {
                    this.J1.i(lVar, z11, true);
                    return;
                }
                return;
            }
        }
        z11 = z10;
        if (z11) {
            org.telegram.ui.Cells.l lVar22 = new org.telegram.ui.Cells.l(getParentActivity(), this.currentAccount);
            this.L1 = lVar22;
            this.J1.addView(lVar22);
        }
        lVar = this.L1;
        if (lVar == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.z60 z60Var = this.L0;
        if (z60Var != null) {
            z60Var.u();
        }
    }

    public final float g4() {
        xw xwVar = this.F3;
        if (xwVar == null || !xwVar.c()) {
            return 0.0f;
        }
        return this.F3.e;
    }

    public final void g5() {
        ag.b1 b1Var;
        wx wxVar;
        try {
            ow owVar = this.B1;
            if (owVar != null && owVar.getEditField() != null) {
                this.B1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.Ke));
            }
            NumberTextView numberTextView = this.h1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.y8));
            }
            qx qxVar = this.z0;
            int i10 = 0;
            if (qxVar != null && (qxVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                ((GradientDrawable) this.z0.getSelectorDrawable()).setColor(getThemedColor(lVar != null && lVar.u() ? org.telegram.ui.ActionBar.t6.ui : org.telegram.ui.ActionBar.t6.K8));
                this.z0.invalidate();
            }
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                if (this.W2 != 0 || this.Y2 != 0) {
                    lVar2.I(getThemedColor(org.telegram.ui.ActionBar.t6.Q8), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.t6.R8), true);
                }
                if (this.actionBar.u()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                }
                m5();
            }
            if (this.e0 != null) {
                while (true) {
                    zx[] zxVarArr = this.e0;
                    if (i10 >= zxVarArr.length) {
                        break;
                    }
                    zx zxVar = zxVarArr[i10];
                    if (zxVar != null && (wxVar = zxVar.a) != null) {
                        wxVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                    }
                    i10++;
                }
            }
            kx kxVar = this.C0;
            if (kxVar != null && (b1Var = kxVar.a0) != null) {
                b1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            }
            bi.f2 f2Var = this.C1;
            if (f2Var != null) {
                f2Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            }
            vh.p2 p2Var = this.p0;
            if (p2Var != null) {
                p2Var.h(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
            }
            vh.p2 p2Var2 = this.q0;
            if (p2Var2 != null) {
                p2Var2.h(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.u4 getBackButtonState() {
        return (p4() || this.F3.f) ? org.telegram.ui.ActionBar.u4.a : org.telegram.ui.ActionBar.u4.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        int i10 = 1;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W3, 1.0f);
            this.Z3 = ofFloat;
            return ofFloat;
        }
        int i11 = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? org.telegram.messenger.zs.g2 : (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.W3, 1.0f);
        this.Z3 = ofFloat2;
        ofFloat2.addUpdateListener(new mv(this, i10));
        this.Z3.setInterpolator(org.telegram.ui.Components.gr.g);
        this.Z3.setDuration(i11);
        this.Z3.start();
        return this.Z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0230 A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.t0 t0Var = this.m0;
        if (t0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.t8));
        }
        if (this.W2 == 0) {
            kx kxVar = this.C0;
            if (kxVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.c7(kxVar.a0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.t6.s1}, (org.telegram.ui.ActionBar.b7) null, !this.W ? org.telegram.ui.ActionBar.t6.A8 : org.telegram.ui.ActionBar.t6.Ul));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        } else {
            kx kxVar2 = this.C0;
            if (kxVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.c7(kxVar2.a0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.t6.s1}, (org.telegram.ui.ActionBar.b7) null, !this.W ? org.telegram.ui.ActionBar.t6.P8 : org.telegram.ui.ActionBar.t6.Ul));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.R8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_21, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.x8));
        NumberTextView numberTextView = this.h1;
        int i10 = org.telegram.ui.ActionBar.t6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.c7(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        if (this.z0 != null) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar == null || !lVar.u()) {
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0, 0, new Class[]{org.telegram.ui.Components.tz.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.rz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.rz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0.getTabsContainer(), TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0, 0, new Class[]{org.telegram.ui.Components.tz.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ui));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.rz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ti));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.rz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.si));
            }
        }
        arrayList.addAll(w7.f6.a(new g6(7, this), org.telegram.ui.ActionBar.t6.w8, i10));
        int i11 = 0;
        while (i11 < 3) {
            if (i11 == 2) {
                kx kxVar3 = this.C0;
                if (kxVar3 == null) {
                    i11++;
                } else {
                    view = kxVar3.a0;
                    view2 = view;
                    if (view2 == null) {
                        arrayList.add(new org.telegram.ui.ActionBar.c7(view2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i6));
                        arrayList.add(new org.telegram.ui.ActionBar.c7(view2, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
                        int i12 = org.telegram.ui.Cells.z3.h;
                        arrayList.add(new org.telegram.ui.ActionBar.c7(view2, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.o6));
                    }
                    i11++;
                }
            } else {
                zx[] zxVarArr = this.e0;
                if (zxVarArr == null) {
                    i11++;
                } else {
                    view = i11 < zxVarArr.length ? zxVarArr[i11].a : null;
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
                zx[] zxVarArr2 = this.e0;
                if (i13 >= zxVarArr2.length) {
                    break;
                }
                if (this.W2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.c7(zxVarArr2[i13].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.c7(zxVarArr2[i13].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
                }
                int i14 = org.telegram.messenger.tz.a;
                int i15 = org.telegram.ui.ActionBar.t6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.e0[i13].a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.e0[i13].a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.e0[i13].x, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
                this.e0[i13].d.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
                i13++;
            }
        }
        int i16 = 0;
        while (true) {
            UndoView[] undoViewArr = this.y0;
            if (i16 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(undoViewArr[i16], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.tj));
            i16++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.o5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.q7));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.wj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.xj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Bj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Dj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Fj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Gj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Hj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ij));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Jj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Lj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Hh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ih));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Lh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ph));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Vh));
        zf.g0 g0Var = this.b0;
        if (g0Var != null) {
            arrayList.addAll(g0Var.getThemeDescriptions());
            this.b0.updateColors();
        }
        dy dyVar = this.h0;
        if (dyVar != null) {
            dyVar.updateColors();
            this.h0.invalidate();
        }
        kx kxVar4 = this.C0;
        if (kxVar4 != null) {
            org.telegram.ui.Components.tm0 tm0Var = kxVar4.b0;
            SparseArray sparseArray = kxVar4.h;
            ag.b1 b1Var = kxVar4.a0;
            for (int i17 = 0; i17 < b1Var.getChildCount(); i17++) {
                View childAt = b1Var.getChildAt(i17);
                if ((childAt instanceof org.telegram.ui.Cells.k6) || (childAt instanceof org.telegram.ui.Cells.v2) || (childAt instanceof org.telegram.ui.Cells.o4)) {
                    arrayList.add(new org.telegram.ui.ActionBar.c7(childAt, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
                }
            }
            for (int i18 = 0; i18 < kxVar4.getChildCount(); i18++) {
                if (kxVar4.getChildAt(i18) instanceof z00) {
                    arrayList.addAll(((z00) kxVar4.getChildAt(i18)).getThemeDescriptions());
                }
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view3 = (View) sparseArray.valueAt(i19);
                if (view3 instanceof z00) {
                    arrayList.addAll(((z00) view3).getThemeDescriptions());
                }
            }
            z00 z00Var = kxVar4.O0;
            if (z00Var != null) {
                arrayList.addAll(z00Var.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(tm0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.c7(tm0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.y6));
            arrayList.addAll(w7.f6.a(new org.telegram.ui.Components.o6(kxVar4, 4), org.telegram.ui.ActionBar.t6.y8));
        }
        org.telegram.ui.Cells.d3 d3Var = this.M1;
        int i20 = 5;
        if (d3Var != null) {
            arrayList.addAll(w7.f6.a(new org.telegram.ui.Components.o6(new rh(d3Var, 20), i20), org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.y6));
        }
        org.telegram.ui.Cells.ma maVar = this.N1;
        if (maVar != null) {
            arrayList.addAll(w7.f6.a(new org.telegram.ui.Components.o6(new rh(maVar, 21), i20), org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.y6, org.telegram.ui.ActionBar.t6.I6, org.telegram.ui.ActionBar.t6.q7));
        }
        org.telegram.ui.Cells.l lVar2 = this.L1;
        if (lVar2 != null) {
            arrayList.addAll(w7.f6.a(new org.telegram.ui.Components.o6(new rh(lVar2, 22), i20), org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.y6, org.telegram.ui.ActionBar.t6.I6, org.telegram.ui.ActionBar.t6.q7));
        }
        return arrayList;
    }

    public final float h4() {
        return -org.telegram.messenger.i0.W1(this.b.e, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(48.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    public final void h5(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        org.telegram.messenger.ap apVar;
        Object[] objArr;
        boolean z12;
        boolean z13;
        if (this.z0 == null || this.inPreviewMode || this.q3) {
            return;
        }
        xw xwVar = this.F3;
        if (xwVar == null || !xwVar.c()) {
            org.telegram.ui.Components.z60 z60Var = this.L0;
            String str = null;
            if (z60Var != null) {
                z60Var.u();
                this.L0 = null;
            }
            ArrayList S0 = getMessagesController().S0();
            int size = S0.size();
            fe.b bVar = this.r;
            boolean z14 = true;
            boolean z15 = false;
            if (size <= 1) {
                r52 = 0;
                if (this.z0.getVisibility() != 8) {
                    this.z0.setIsEditing(false);
                    T4(false);
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
                        lwVar.f();
                        zx zxVar = this.e0[0];
                        zxVar.s = this.R0;
                        zxVar.d.f();
                    }
                    this.e0[1].setVisibility(8);
                    zx zxVar2 = this.e0[1];
                    zxVar2.h = 0;
                    lw lwVar2 = zxVar2.d;
                    lwVar2.h = 0;
                    lwVar2.f();
                    zx zxVar3 = this.e0[1];
                    zxVar3.s = this.R0;
                    zxVar3.d.f();
                    this.x = false;
                    if (this.fragmentView != null) {
                        boolean z16 = (this.isPaused || this.Q3 != null) ? false : z11;
                        if (!this.q3) {
                            bVar.a(false, z16);
                        }
                    }
                    int i10 = 0;
                    while (true) {
                        zx[] zxVarArr = this.e0;
                        if (i10 >= zxVarArr.length) {
                            break;
                        }
                        zx zxVar4 = zxVarArr[i10];
                        if (zxVar4.s == 0 && zxVar4.w == 2 && k4() && ((L0 = this.e0[i10].c.L0()) == 0 || L0 == 1)) {
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
                this.x = true;
                boolean isEmpty = this.z0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z18 = (this.isPaused || this.Q3 != null) ? false : z11;
                    if (!this.q3) {
                        bVar.a(this.x, z18);
                    }
                }
                int currentTabId = this.z0.getCurrentTabId();
                int currentTabStableId = this.z0.getCurrentTabStableId();
                if (currentTabId == this.z0.getDefaultTabId() || currentTabId < S0.size()) {
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
                int size2 = S0.size();
                int i11 = 0;
                while (i11 < size2) {
                    if (((org.telegram.messenger.ap) S0.get(i11)).e()) {
                        this.z0.a(i11, 0, org.telegram.messenger.cd.L0(2131750808, str), null, false, true, ((org.telegram.messenger.ap) S0.get(i11)).p);
                        z13 = z15;
                    } else {
                        org.telegram.messenger.ap apVar2 = (org.telegram.messenger.ap) S0.get(i11);
                        z13 = z15;
                        this.z0.a(i11, apVar2.o, apVar2.b, apVar2.c, apVar2.n, false, ((org.telegram.messenger.ap) S0.get(i11)).p);
                    }
                    i11++;
                    z15 = z13;
                    str = null;
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
                    zx[] zxVarArr2 = this.e0;
                    if (i12 >= zxVarArr2.length) {
                        break;
                    }
                    if (zxVarArr2[i12].h >= S0.size()) {
                        this.e0[i12].h = S0.size() - 1;
                    }
                    this.e0[i12].a.setScrollingTouchSlop(1);
                    i12++;
                }
                qx qxVar3 = this.z0;
                qxVar3.F.setItemAnimator(z17 ? qxVar3.s0 : null);
                qxVar3.I.f();
                if (isEmpty) {
                    c5(z19);
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
                        if (((org.telegram.ui.Components.pz) arrayList.get(i13)).a == currentTabId2) {
                            z12 = ((org.telegram.ui.Components.pz) arrayList.get(i13)).f;
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
                        qxVar5.f((org.telegram.ui.Components.pz) arrayList2.get(0), 0);
                    }
                }
                r52 = 0;
            } else {
                r52 = 0;
            }
            e5(r52);
            int i14 = this.e0[r52].s;
            if ((i14 == 7 || i14 == 8) && (apVar = getMessagesController().M[i14 - 7]) != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= S0.size()) {
                        z14 = false;
                        break;
                    }
                    org.telegram.messenger.ap apVar3 = (org.telegram.messenger.ap) S0.get(i15);
                    if (apVar3 != null && apVar3.a == apVar.a) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (z14) {
                    return;
                }
                c5(false);
            }
        }
    }

    public final th.e5 i4() {
        return getMessagesController().O1();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i5(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        kx kxVar;
        boolean z13;
        org.telegram.ui.Components.v71 v71Var;
        if (!this.q3 || this.l2 || (kxVar = this.C0) == null) {
            return;
        }
        ArrayList<zf.e0> currentSearchFilters = kxVar.getCurrentSearchFilters();
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
                this.b0.D1(arrayList, arrayList2, z11);
                z13 = true;
                if (!z13) {
                    this.b0.D1(null, null, false);
                }
                if (!z12) {
                    this.b0.getAdapter().f();
                }
                v71Var = this.a0;
                if (v71Var != null) {
                    v71Var.b(z13, true);
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
        v71Var = this.a0;
        if (v71Var != null) {
        }
        this.b0.setEnabled(z13);
        this.s.a(z13, true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        xw xwVar;
        return (this.j2 || (xwVar = this.F3) == null || xwVar.getFragment() == null) ? i0.b.h(getThemedColor(org.telegram.ui.ActionBar.t6.d6)) > 0.699999988079071d : this.F3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final UndoView j4() {
        Y3();
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

    public final void j5() {
        float f7 = (((-this.f4) - this.i4) - this.u1) - this.v1;
        org.telegram.ui.Components.f10 f10Var = this.t0;
        if (f10Var != null) {
            f10Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.f10 f10Var2 = this.u0;
        if (f10Var2 != null) {
            f10Var2.setTranslationY(f7 - org.telegram.messenger.i0.L(52.0f));
            vh.p2 p2Var = this.p0;
            if (p2Var != null) {
                p2Var.setTranslationY(f7 - org.telegram.messenger.i0.L(52.0f));
            }
        }
    }

    public final boolean k4() {
        if (this.l2 || this.R0 != 0 || this.Y2 != 0 || this.W2 != 0) {
            return false;
        }
        org.telegram.messenger.vp messagesController = getMessagesController();
        messagesController.getClass();
        return org.telegram.messenger.tz.q1 && messagesController.Q.f(2305843009213693952L | ((long) 1)) != null;
    }

    public final void k5(boolean z10) {
        boolean z11 = this.l2;
        boolean z12 = (!z11 || this.R0 == 10) && this.W2 == 0 && this.Y2 == 0 && !this.inPreviewMode && (!this.j2 || z11) && !this.T3;
        org.telegram.ui.Components.f10 f10Var = this.t0;
        if (f10Var != null) {
            f10Var.e(z12, z10);
        }
        org.telegram.ui.Components.f10 f10Var2 = this.u0;
        if (f10Var2 != null) {
            f10Var2.e(z12, z10);
        }
    }

    public final boolean l4() {
        ArrayList arrayList = this.D2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void l5(boolean z10, boolean z11) {
        boolean z12;
        if (this.n0 != null) {
            org.telegram.ui.ActionBar.t0 t0Var = this.m0;
            if (t0Var == null || t0Var.getVisibility() != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= getDownloadController().G.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (getFileLoader().T(((org.telegram.messenger.jj) getDownloadController().G.get(i10)).S0())) {
                            z12 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (getDownloadController().I.size() > 0 || z12 || (this.g0.getVisibility() == 0 && this.g0.getAlpha() == 1.0f && !z11)) {
                    this.i0 = true;
                } else {
                    this.i0 = false;
                }
                I3();
                boolean z13 = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.d2;
                boolean z14 = i11 == 3 || i11 == 5;
                this.o0.setSubtext(org.telegram.messenger.cd.L0(z13 ? z14 ? 2131748623 : 2131748622 : 2131748621, null));
                this.n0.b(z13, z14, z10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m4(boolean z10) {
        boolean z11;
        this.actionBar.t();
        this.I2.clear();
        org.telegram.ui.ActionBar.c2 c2Var = this.e1;
        int i10 = 1;
        if (c2Var != null) {
            c2Var.c(true, 0.0f);
        }
        qx qxVar = this.z0;
        if (qxVar != null) {
            qxVar.b(org.telegram.ui.ActionBar.t6.K8, org.telegram.ui.ActionBar.t6.I8, org.telegram.ui.ActionBar.t6.J8, org.telegram.ui.ActionBar.t6.L8, org.telegram.ui.ActionBar.t6.d6);
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
        N4(-e4());
        int i11 = 0;
        int i12 = 0;
        while (true) {
            zx[] zxVarArr = this.e0;
            if (i12 >= zxVarArr.length) {
                break;
            }
            zx zxVar = zxVarArr[i12];
            if (zxVar != null) {
                zxVar.a.I0(true);
            }
            i12++;
        }
        float max = Math.max(0.0f, org.telegram.messenger.i0.L((this.K ? 81 : 0) + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u3, 0.0f);
        this.v3 = ofFloat;
        ofFloat.addUpdateListener(new jv(this, max, i10));
        this.v3.addListener(new fx(this, max, i11));
        this.v3.setInterpolator(org.telegram.ui.Components.gr.f);
        this.v3.setDuration(200L);
        this.v3.start();
        this.Y0 = false;
        ArrayList arrayList = this.a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) arrayList.get(i13);
                i00.y0(apVar, apVar.g, apVar.b, apVar.c, apVar.n, apVar.m, apVar.h, apVar.i, apVar.j, false, false, true, true, false, this, null);
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
            getMessagesController().j4(this.W2, 0L, null);
            z11 = 0;
            this.Z0 = false;
        } else {
            z11 = 0;
        }
        e5(true);
        if (this.e0 != null) {
            int i14 = z11;
            while (true) {
                zx[] zxVarArr2 = this.e0;
                if (i14 >= zxVarArr2.length) {
                    break;
                }
                zxVarArr2[i14].d.H = z11;
                i14++;
            }
        }
        int i15 = org.telegram.messenger.vp.D8;
        int i16 = z11;
        if (z10) {
            i16 = TLObject.FLAG_13;
        }
        t5(i16 | 196608, true);
    }

    public final void m5() {
        if (!this.s3 || this.actionBar == null) {
            return;
        }
        int themedColor = getThemedColor((this.W2 == 0 && this.Y2 == 0) ? org.telegram.ui.ActionBar.t6.v8 : org.telegram.ui.ActionBar.t6.O8);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.y8;
        lVar.D(i0.b.f(this.x1, themedColor, getThemedColor(i10)), false);
        this.actionBar.D(i0.b.f(this.x1, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.C(i0.b.f(this.x1, getThemedColor((this.W2 == 0 && this.Y2 == 0) ? org.telegram.ui.ActionBar.t6.t8 : org.telegram.ui.ActionBar.t6.N8), getThemedColor(org.telegram.ui.ActionBar.t6.z8)), false);
    }

    public final void n4(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (z10 && this.b2) {
            return;
        }
        this.T3 = z10;
        k5(true);
        if (z10) {
            vh.p2 p2Var = this.p0;
            if (p2Var != null) {
                p2Var.e(true);
            }
            vh.p2 p2Var2 = this.q0;
            if (p2Var2 != null) {
                p2Var2.e(true);
            }
        }
    }

    public final void n5() {
        org.telegram.ui.Components.sp0 sp0Var;
        ow owVar = this.B1;
        ArrayList arrayList = this.I2;
        if (owVar == null) {
            if (this.R0 == 10) {
                n4(arrayList.isEmpty());
                return;
            }
            return;
        }
        int i10 = 1;
        this.n.a(!arrayList.isEmpty(), true);
        o5();
        if (arrayList.isEmpty()) {
            String L0 = org.telegram.messenger.cd.L0((this.R0 == 3 && this.f2 == null) ? 2131750577 : 2131745686, null);
            if (this.P3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(L0);
            } else {
                this.actionBar.K(L0, true, 350L, org.telegram.ui.Components.gr.h);
            }
            if (this.B1.getTag() != null) {
                this.B1.j0(false, false, false);
                this.B1.L();
                this.B1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.B1.getTag() == null) {
                if (!l4() && this.E2 == null) {
                    this.B1.setFieldText("");
                }
                this.B1.setTag(1);
                if (!this.V3 && (sp0Var = this.G2) != null) {
                    this.V3 = true;
                    String L02 = org.telegram.messenger.cd.L0(2131745447, null);
                    sp0Var.j();
                    sp0Var.F = L02;
                    org.telegram.ui.Components.qp0 qp0Var = sp0Var.a[0];
                    if (L02 != null) {
                        ((org.telegram.ui.ActionBar.u5) qp0Var.h).l(L02, false);
                    }
                    org.telegram.ui.Components.uo0 uo0Var = new org.telegram.ui.Components.uo0(sp0Var, i10);
                    sp0Var.G = uo0Var;
                    org.telegram.messenger.i0.h3(uo0Var, 1000L);
                }
            }
            this.C1.g(Math.max(1, arrayList.size()), true);
            int i11 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            int i12 = 0;
            long j10 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                long longValue = ((Long) obj).longValue();
                long M1 = getMessagesController().M1(longValue);
                if (M1 <= 0 && longValue > 0) {
                    M1 = org.telegram.messenger.o5.k(getMessagesController().H2(longValue));
                }
                j10 += M1;
            }
            this.C1.i(i11, j10, true);
            this.B1.Q1();
            if (this.P3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(org.telegram.messenger.cd.G(arrayList.size(), "Recipient", new Object[0]));
            } else {
                this.actionBar.K(org.telegram.messenger.cd.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.gr.h);
            }
        }
        this.P3 = arrayList.isEmpty();
    }

    public final void o5() {
        org.telegram.ui.Components.sp0 sp0Var = this.G2;
        if (sp0Var == null) {
            return;
        }
        int i10 = this.currentAccount;
        sp0Var.h(i10);
        sp0Var.d = org.telegram.messenger.d20.i(org.telegram.messenger.c.a(i10).a).e();
        ArrayList arrayList = sp0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.I2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        org.telegram.ui.Components.qp0 qp0Var = sp0Var.a[0];
        if (sp0Var.b == 1) {
            ((org.telegram.ui.ActionBar.u5) qp0Var.f).l(sp0Var.c(qp0Var), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.F3.c() || !this.F3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.z60 z60Var = this.L0;
            if (z60Var == null) {
                qx qxVar = this.z0;
                if (qxVar == null || !qxVar.n) {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar == null || !lVar.u()) {
                        if (!this.b.f) {
                            qx qxVar2 = this.z0;
                            if (qxVar2 != null && qxVar2.getVisibility() == 0 && !this.h3) {
                                qx qxVar3 = this.z0;
                                if (!qxVar3.O && !this.m3) {
                                    ArrayList arrayList = qxVar3.h;
                                    if (!arrayList.isEmpty() && qxVar3.L != ((org.telegram.ui.Components.pz) arrayList.get(0)).a) {
                                        if (z10) {
                                            qx qxVar4 = this.z0;
                                            ArrayList arrayList2 = qxVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                qxVar4.f((org.telegram.ui.Components.pz) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            ow owVar = this.B1;
                            if (owVar == null || !owVar.q0()) {
                                uw uwVar = this.E0;
                                if (uwVar.O != 0 || uwVar.S.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                uwVar.h.y0(0);
                                return false;
                            }
                            if (z10) {
                                this.B1.i0(true);
                            }
                        } else if (z10) {
                            this.X.r.getText().clear();
                            this.Y.b(false);
                            this.X.r.clearFocus();
                            return false;
                        }
                    } else if (z10) {
                        kx kxVar = this.C0;
                        if (kxVar != null && kxVar.getVisibility() == 0) {
                            this.C0.R(false);
                        }
                        m4(true);
                        return false;
                    }
                } else if (z10) {
                    qxVar.setIsEditing(false);
                    T4(false);
                    return false;
                }
            } else if (z10) {
                z60Var.u();
                this.L0 = null;
                return false;
            }
        } else if (z10) {
            this.F3.a();
            kx kxVar2 = this.C0;
            if (kxVar2 != null) {
                kxVar2.S();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyHidden() {
        bi.t0 t0Var;
        qx qxVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.k(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                kx kxVar = this.C0;
                if (kxVar != null) {
                    kxVar.d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (qxVar = this.z0) != null && qxVar.getVisibility() == 0 && this.r.f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.e0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (t0Var = this.K0) != null && t0Var.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        M3();
        this.r0 = true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        vh.p2 p2Var;
        super.onBecomeFullyVisible();
        if (p4()) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            boolean z10 = d12.getBoolean("archivehint", true);
            boolean isEmpty = c4(this.currentAccount, this.R0, this.W2, false).isEmpty();
            if (z10 && isEmpty) {
                org.telegram.messenger.vp.d1().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                d12.edit().putBoolean("archivehint", false).commit();
                R4();
            }
        }
        if (this.r0 && !this.s0 && (p2Var = this.p0) != null && this.N3) {
            this.s0 = true;
            this.r0 = false;
            p2Var.u();
        }
        org.telegram.messenger.i0.h3(new fv(this, 20), 200L);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.z60 z60Var = this.L0;
        if (z60Var != null) {
            z60Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.x1 x1Var;
        super.onDialogDismiss(dialog);
        if (this.W2 == 0 && this.Y2 == 0 && (x1Var = this.T1) != null && dialog == x1Var && getParentActivity() != null) {
            t3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
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
                this.Z2 = getMessagesController().L0(Long.valueOf(this.Y2));
                this.a3 = getMessagesController().M0(this.Y2);
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
            this.U1 = org.telegram.messenger.vp.e1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.tz.u();
        }
        org.telegram.messenger.zs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.J3 = new xa.n(notificationCenter, this);
        if (this.n2 == null) {
            this.d2 = getConnectionsManager().getConnectionState();
            this.J3.h(org.telegram.messenger.zs.i4);
            if (!this.l2) {
                this.J3.h(org.telegram.messenger.zs.I4);
                this.J3.h(org.telegram.messenger.zs.A4);
                this.J3.e(org.telegram.messenger.zs.P2);
                this.J3.e(org.telegram.messenger.zs.d2);
            }
            xa.n nVar = this.J3;
            nVar.e(org.telegram.messenger.zs.s);
            nVar.e(org.telegram.messenger.zs.O2);
            nVar.e(org.telegram.messenger.zs.r);
            nVar.e(org.telegram.messenger.zs.Y);
            nVar.e(org.telegram.messenger.zs.O);
            nVar.e(org.telegram.messenger.zs.I2);
            nVar.e(org.telegram.messenger.zs.h0);
            nVar.e(org.telegram.messenger.zs.f0);
            nVar.e(org.telegram.messenger.zs.J);
            nVar.e(org.telegram.messenger.zs.K);
            nVar.e(org.telegram.messenger.zs.M);
            nVar.e(org.telegram.messenger.zs.P0);
            nVar.e(org.telegram.messenger.zs.s0);
            nVar.e(org.telegram.messenger.zs.q5);
            nVar.e(org.telegram.messenger.zs.S0);
            nVar.e(org.telegram.messenger.zs.T1);
            nVar.e(org.telegram.messenger.zs.b5);
            nVar.e(org.telegram.messenger.zs.K2);
            nVar.e(org.telegram.messenger.zs.d0);
            nVar.e(org.telegram.messenger.zs.s1);
            nVar.e(org.telegram.messenger.zs.Y4);
            nVar.e(org.telegram.messenger.zs.Z4);
            nVar.e(org.telegram.messenger.zs.N);
            nVar.e(org.telegram.messenger.zs.m5);
            nVar.e(org.telegram.messenger.zs.f5);
            this.J3.h(org.telegram.messenger.zs.n0);
        }
        xa.n nVar2 = this.J3;
        nVar2.e(org.telegram.messenger.zs.w);
        nVar2.e(org.telegram.messenger.zs.S4);
        nVar2.e(org.telegram.messenger.zs.a5);
        nVar2.e(org.telegram.messenger.zs.T);
        nVar2.e(org.telegram.messenger.zs.L4);
        nVar2.e(org.telegram.messenger.zs.t5);
        nVar2.e(org.telegram.messenger.zs.v5);
        nVar2.e(org.telegram.messenger.zs.Z2);
        nVar2.e(org.telegram.messenger.zs.d3);
        nVar2.e(org.telegram.messenger.zs.g5);
        nVar2.e(org.telegram.messenger.zs.y3);
        nVar2.e(org.telegram.messenger.zs.A3);
        nVar2.e(org.telegram.messenger.zs.S5);
        nVar2.e(org.telegram.messenger.zs.T5);
        nVar2.e(org.telegram.messenger.zs.P3);
        nVar2.e(org.telegram.messenger.zs.Q3);
        if (this.R0 == 0) {
            this.J3.e(org.telegram.messenger.zs.z5);
            this.J3.e(org.telegram.messenger.zs.P1);
        }
        t4(getAccountInstance());
        th.e5 O1 = getMessagesController().O1();
        if (!O1.A) {
            O1.W();
            if (!O1.s) {
                ConnectionsManager.getInstance(O1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new th.i4(O1, r3));
            }
        }
        getMessagesController().Z2(this.W2);
        if (this.Q3 != null && !getMessagesStorage().Q) {
            ou ouVar = this.Q3;
            if (ouVar.getParent() != null) {
                ((ViewGroup) ouVar.getParent()).removeView(ouVar);
            }
            this.Q3 = null;
        }
        if (p4()) {
            th.e5 O12 = getMessagesController().O1();
            if (O12.z) {
                O12.T(true);
            }
        } else {
            getMessagesController().O1().W();
        }
        getContactsController().B();
        if (getMessagesController().p6) {
            org.telegram.messenger.gw F1 = getMessagesController().F1();
            if (!F1.e) {
                F1.g(true);
            }
        }
        if (this.Y2 != 0) {
            getMessagesController().T2(0, this.Y2, true);
        }
        org.telegram.messenger.y1 a2 = org.telegram.messenger.y1.a(this.currentAccount);
        if (!a2.e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = a2.b;
            boolean z10 = j11 == 0;
            if (!z10) {
                long j12 = currentTimeMillis - j11;
                boolean z11 = org.telegram.messenger.v2.a;
                z10 = j12 > ((long) 43200000);
            }
            if (!z10) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a2.b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                z10 = (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? false : true;
            }
            if (z10) {
                a2.e = true;
                ConnectionsManager.getInstance(a2.a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.v1(a2, r3));
            }
        }
        this.h4 = this.W ? org.telegram.messenger.i0.L(72.0f) : 0;
        this.i4 = this.W ? org.telegram.messenger.i0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        xa.n nVar = this.J3;
        if (nVar != null) {
            nVar.a();
            this.J3 = null;
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.z0();
        }
        org.telegram.ui.Components.sp0 sp0Var = this.G2;
        if (sp0Var != null) {
            sp0Var.j();
        }
        xs xsVar = this.H2;
        if (xsVar != null) {
            org.telegram.messenger.i0.r(xsVar);
            this.H2 = null;
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.p3.e();
        this.C2 = null;
        int i10 = org.telegram.ui.Components.t10.i1;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPanTranslationUpdate(float f7) {
        if (this.e0 == null) {
            return;
        }
        this.J0 = f7;
        ow owVar = this.B1;
        int i10 = 0;
        if (owVar == null || !owVar.q0()) {
            while (true) {
                zx[] zxVarArr = this.e0;
                if (i10 >= zxVarArr.length) {
                    break;
                }
                zxVarArr[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.wb wbVar = this.o3;
                if (wbVar != null) {
                    wbVar.l();
                }
            }
            kx kxVar = this.C0;
            if (kxVar != null) {
                kxVar.setTranslationY(this.J0 + this.I0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f7);
        while (true) {
            zx[] zxVarArr2 = this.e0;
            if (i10 >= zxVarArr2.length) {
                break;
            }
            zxVarArr2[i10].setTranslationY(0.0f);
            i10++;
        }
        if (!this.l2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.wb wbVar2 = this.o3;
            if (wbVar2 != null) {
                wbVar2.l();
            }
        }
        kx kxVar2 = this.C0;
        if (kxVar2 != null) {
            kxVar2.setTranslationY(this.I0);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.wb wbVar = this.S;
        if (wbVar != null) {
            wbVar.b();
            this.S = null;
        }
        xw xwVar = this.F3;
        if (xwVar != null) {
            xwVar.r = true;
            ex exVar = xwVar.a;
            if (exVar != null) {
                exVar.onPause();
            }
        }
        org.telegram.ui.Components.z60 z60Var = this.L0;
        if (z60Var != null) {
            z60Var.u();
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
            zx[] zxVarArr = this.e0;
            if (i10 >= zxVarArr.length) {
                return;
            }
            zxVarArr[i10].d.getClass();
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.messenger.h9 h9Var;
        if (i10 != 1) {
            if (i10 == 4) {
                for (int i11 : iArr) {
                    if (i11 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (h9Var = FilesMigrationService.e) == null) {
                    return;
                }
                h9Var.I0();
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
                            org.telegram.messenger.ot.t(this.currentAccount).Y();
                            break;
                        } else {
                            ji0.I0();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i12] == 0) {
                            org.telegram.messenger.hc.D().i(null);
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i12] == 0) {
                            org.telegram.messenger.i0.g3(new fv(this, 19));
                            getContactsController().l();
                            break;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.vp.e1().edit();
                            this.U1 = false;
                            edit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                }
            }
        }
        if (this.A0) {
            this.A0 = false;
            U4();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        zx zxVar;
        lw lwVar;
        org.telegram.ui.Components.zm0 zm0Var;
        bi.t0 t0Var;
        super.onResume();
        uw uwVar = this.E0;
        if (uwVar != null) {
            ArrayList arrayList = uwVar.y;
            th.e5 e5Var = uwVar.s;
            e5Var.l(e5Var.g);
            e5Var.l(e5Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = e5Var.y(((th.j) arrayList.get(i10)).c);
                if (y3 != null) {
                    e5Var.a0(y3);
                }
            }
        }
        xw xwVar = this.F3;
        if (xwVar != null) {
            xwVar.r = false;
            ex exVar = xwVar.a;
            if (exVar != null) {
                exVar.onResume();
            }
        }
        int i11 = 8;
        if (!((ActionBarLayout) this.parentLayout).x() && (t0Var = this.K0) != null && t0Var.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.e0 != null) {
            int i12 = 0;
            while (true) {
                zx[] zxVarArr = this.e0;
                if (i12 >= zxVarArr.length) {
                    break;
                }
                zxVarArr[i12].d.f();
                i12++;
            }
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.C0();
        }
        int i13 = 4;
        long j10 = 0;
        if (!this.l2 && this.W2 == 0 && this.Y2 == 0) {
            getMediaDataController().B(4);
        }
        kx kxVar = this.C0;
        if (kxVar != null && (zm0Var = kxVar.d0) != null) {
            zm0Var.f();
        }
        boolean z10 = this.t2 || getUserConfig().Z == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.W2 == 0 && this.Y2 == 0 && this.c2 && !this.l2) {
            int i14 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.c2 = false;
                boolean z11 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z12 = (i14 <= 28 || org.telegram.messenger.v2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z13 = i14 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                org.telegram.messenger.m4 m4Var = new org.telegram.messenger.m4(this, z13, z11, z12, parentActivity);
                if (this.t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                org.telegram.messenger.i0.h3(m4Var, j10);
            }
        } else if (!this.l2 && this.W2 == 0 && this.Y2 == 0 && org.telegram.messenger.d6.i() && !org.telegram.messenger.d6.f()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.vp.e1().getBoolean("askedAboutMiuiLockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                int i15 = org.telegram.ui.ActionBar.t6.L5;
                alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(i15), null);
                alertDialog$Builder.n(i15, getResourceProvider());
                String L0 = org.telegram.messenger.cd.L0(2131747314, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.T = L0;
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747316, null), new iv(this, 10));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), new org.telegram.ui.Components.z11(i11));
                showDialog(x1Var);
            }
        } else if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.vp.e1().getBoolean("askedAboutFSILockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                int i16 = org.telegram.ui.ActionBar.t6.L5;
                alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(i16), null);
                alertDialog$Builder2.n(i16, getResourceProvider());
                String L02 = org.telegram.messenger.cd.L0(2131747330, null);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                x1Var2.T = L02;
                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747316, null), new iv(this, 11));
                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131751772, null), new org.telegram.ui.Components.z11(9));
                showDialog(x1Var2);
            }
        }
        U4();
        if (this.e0 != null) {
            int i17 = 0;
            while (true) {
                zx[] zxVarArr2 = this.e0;
                if (i17 >= zxVarArr2.length) {
                    break;
                }
                zx zxVar2 = zxVarArr2[i17];
                if (zxVar2.s == 0 && zxVar2.w == 2 && zxVar2.c.L0() == 0 && k4()) {
                    this.e0[i17].c.h1(1, (int) this.N);
                }
                if (i17 == 0) {
                    this.e0[i17].d.getClass();
                } else {
                    this.e0[i17].d.getClass();
                }
                i17++;
            }
        }
        W4();
        setBulletinDelegate(new z8(this, i13));
        if (this.q3) {
            org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        }
        t5(0, false);
        l5(false, true);
        s5(false);
        C3();
        M3();
        if (this.z0 == null || (zxVar = this.e0[0]) == null || (lwVar = zxVar.d) == null) {
            return;
        }
        int i18 = lwVar.h;
        if (i18 == 7 || i18 == 8) {
            org.telegram.messenger.ap apVar = getMessagesController().M[i18 != 7 ? (char) 1 : (char) 0];
            if (apVar != null) {
                this.z0.h(apVar.o);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onSlideProgress(boolean z10, float f7) {
        if (org.telegram.messenger.tz.o() <= 0) {
            boolean z11 = org.telegram.messenger.v2.a;
        } else if (this.Y3 && this.Z3 == null) {
            Q4(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f1.setColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            x3();
            g5();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.t0 t0Var;
        ay ayVar;
        xw xwVar = this.F3;
        if (xwVar == null || !xwVar.c()) {
            if (z10 && (t0Var = this.K0) != null && t0Var.getVisibility() == 0) {
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
            this.F3.getFragment().onTransitionAnimationEnd(z10, z11);
        }
        if (!z10 && (ayVar = this.X2) != null) {
            ayVar.removeSelfFromStack();
        }
        M3();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        xw xwVar = this.F3;
        if (xwVar == null || !xwVar.c()) {
            bi.t0 t0Var = this.K0;
            if (t0Var != null && t0Var.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        } else {
            this.F3.getFragment().onTransitionAnimationProgress(z10, f7);
        }
        M3();
    }

    public final boolean p4() {
        return this.W2 == 1;
    }

    public final void p5(boolean z10) {
        boolean z11;
        if (this.l0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().G;
        int size = arrayList.size();
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z11 = false;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
            if (jjVar.F0() != null && jjVar.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().H;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i11);
            i11++;
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) obj2;
            if (jjVar2.F0() != null && jjVar2.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().q() && !getMessagesController().A3() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Y3 = true;
            M4(true);
        } else {
            this.Z3 = null;
            this.Y3 = false;
            M4(false);
            Q4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean presentFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        boolean presentFragment = super.presentFragment(k2Var);
        if (presentFragment && this.e0 != null) {
            int i10 = 0;
            while (true) {
                zx[] zxVarArr = this.e0;
                if (i10 >= zxVarArr.length) {
                    break;
                }
                zxVarArr[i10].d.getClass();
                i10++;
            }
        }
        vh.p2 p2Var = this.p0;
        if (p2Var != null) {
            p2Var.e(true);
        }
        vh.p2 p2Var2 = this.q0;
        if (p2Var2 != null) {
            p2Var2.e(true);
        }
        org.telegram.ui.Components.wb.e();
        return presentFragment;
    }

    public final boolean q4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
        if (!org.telegram.messenger.h20.u(Z1)) {
            return false;
        }
        ArrayList l4 = org.telegram.messenger.vp.r1(this.currentAccount).r7.l(-Z1.id);
        return (l4 == null || l4.isEmpty()) && org.telegram.messenger.vp.r1(this.currentAccount).r7.e(-Z1.id);
    }

    public final void q5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.d5 d5Var;
        uw uwVar = this.E0;
        org.telegram.ui.Components.d5 d5Var2 = null;
        if (uwVar != null && (d5Var = uwVar.a0) != null && uwVar.q0 != null) {
            Long h = org.telegram.messenger.h20.h(user);
            if (h != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                d5Var.j(h.longValue(), z10);
                d5Var.m(z11, z10);
            } else {
                if (user != null) {
                    org.telegram.messenger.vp.r1(uwVar.f);
                    if (org.telegram.messenger.vp.A2(user)) {
                        if (uwVar.N0 == null) {
                            uwVar.N0 = uwVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                            uwVar.N0 = new th.f(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), uwVar.N0);
                        }
                        Drawable drawable = uwVar.N0;
                        int i10 = org.telegram.ui.ActionBar.t6.ni;
                        ay ayVar = uwVar.e0;
                        org.telegram.ui.ActionBar.a7.y(uwVar, drawable, i10, ayVar != null ? ayVar.getResourceProvider() : null, PorterDuff.Mode.MULTIPLY);
                        d5Var.g(uwVar.N0, z10);
                        d5Var.m(false, z10);
                    }
                }
                d5Var.g(null, z10);
                d5Var.m(false, z10);
            }
            d5Var.k(Integer.valueOf(uwVar.f(org.telegram.ui.ActionBar.t6.ni)));
            uwVar.W.invalidate();
        }
        if (this.D3 == null || this.actionBar == null) {
            return;
        }
        Long h10 = org.telegram.messenger.h20.h(user);
        this.B3 = null;
        if (h10 != null) {
            boolean z12 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.D3.j(h10.longValue(), z10);
            this.D3.m(z12, z10);
            if (z12) {
                this.B3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new hv(this, 1));
            i31.t(this.currentAccount);
        } else {
            if (user != null) {
                org.telegram.messenger.vp.r1(this.currentAccount);
                if (org.telegram.messenger.vp.A2(user)) {
                    if (this.K3 == null) {
                        this.K3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.K3 = new ix(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), this.K3);
                    }
                    Drawable drawable2 = this.K3;
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.ni);
                    this.w4 = themedColor;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    this.D3.g(this.K3, z10);
                    this.D3.m(false, z10);
                    this.actionBar.setRightDrawableOnClick(new hv(this, 2));
                    i31.t(this.currentAccount);
                }
            }
            this.D3.g(null, z10);
            this.D3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        }
        org.telegram.ui.Components.d5 d5Var3 = this.D3;
        int i11 = org.telegram.ui.ActionBar.t6.ni;
        d5Var3.k(Integer.valueOf(getThemedColor(i11)));
        org.telegram.ui.Cells.n nVar = this.E3;
        if (nVar != null) {
            nVar.setColor(getThemedColor(i11));
        }
        zw zwVar = this.M0;
        if (zwVar == null || !(zwVar.getContentView() instanceof i31)) {
            return;
        }
        org.telegram.ui.ActionBar.u5 titleTextView = this.actionBar.getTitleTextView();
        i31 i31Var = (i31) this.M0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.d5 d5Var4 = this.D3;
            if (rightDrawable == d5Var4) {
                d5Var2 = d5Var4;
            }
        }
        i31Var.y(d5Var2, titleTextView);
    }

    public final boolean r3(long j10, View view) {
        if (this.l2 && getMessagesController().s2(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) view).c0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.k6) {
                ((org.telegram.ui.Cells.k6) view).y(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.v2) {
            ((org.telegram.ui.Cells.v2) view).c0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.k6) {
            ((org.telegram.ui.Cells.k6) view).y(true, true);
        }
        return true;
    }

    public final boolean r4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i10 = this.e0[0].s;
        org.telegram.messenger.ap apVar = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.u() || this.actionBar.w(null))) {
            apVar = getMessagesController().M[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        return apVar != null ? apVar.j.indexOfKey(dialog.id) >= 0 : dialog.pinned;
    }

    public final void r5() {
        vh.p2 p2Var;
        boolean T4 = getMessagesController().T4();
        if (this.N3 != T4) {
            j5();
            if (!this.N3 && T4 && (p2Var = this.p0) != null) {
                p2Var.u();
            }
            this.N3 = T4;
        }
        org.telegram.ui.Components.f10 f10Var = this.t0;
        if (f10Var == null) {
            return;
        }
        if (this.R0 == 10) {
            f10Var.setImageResource(R.drawable.floating_check);
            this.t0.setContentDescription(org.telegram.messenger.cd.L0(2131751355, null));
        } else {
            f10Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.t0.setContentDescription(org.telegram.messenger.cd.L0(2131748287, null));
        }
    }

    public final void s3(zf.e0 e0Var) {
        kx kxVar;
        if (!this.q3 || (kxVar = this.C0) == null) {
            return;
        }
        ArrayList arrayList = kxVar.C0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (e0Var.b((zf.e0) arrayList.get(i10))) {
                    return;
                }
            }
        }
        arrayList.add(e0Var);
        px pxVar = this.X;
        pxVar.F.add(e0Var);
        pxVar.I = r1.size() - 1;
        pxVar.e();
        this.X.r.getText().clear();
        i5(true, null, null, false, true);
    }

    public final boolean s4() {
        return this.C2 == null && this.n2 == null;
    }

    public final void s5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z11;
        th.e5 i42;
        ArrayList arrayList;
        if (this.E0 == null || this.I != null) {
            return;
        }
        xw xwVar = this.F3;
        if ((xwVar != null && xwVar.c()) || this.q3 || (lVar = this.actionBar) == null || lVar.u() || this.l2) {
            return;
        }
        vh.o8 o8Var = vh.o8.F2;
        int i10 = 0;
        if ((o8Var != null && o8Var.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
            z10 = false;
        }
        int i11 = 1;
        boolean z12 = !p4() && i4().I();
        if (this.Y2 != 0) {
            z11 = false;
        } else if (p4()) {
            z11 = !i4().h.isEmpty();
        } else {
            z11 = !z12 && (((arrayList = (i42 = i4()).g) != null && arrayList.size() > 0) || i42.J());
            z12 = i4().I();
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
                ofFloat.addUpdateListener(new cj(i11, this));
                this.J.addListener(new org.telegram.ui.Components.voip.h2(this, 6));
                this.J.setDuration(200L);
                this.J.setInterpolator(org.telegram.ui.Components.gr.f);
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
            this.E0.l(false, 1.0f);
        }
        if (z10 && !isInPreviewMode()) {
            this.E0.setVisibility(0);
            float f7 = -this.N;
            float e42 = z11 ? 0.0f : e4();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I = ofFloat2;
            ofFloat2.addUpdateListener(new jx(this, f7, z11, e42));
            this.I.addListener(new dx(this, z11, i12));
            this.I.setDuration(200L);
            this.I.setInterpolator(org.telegram.ui.Components.gr.f);
            this.I.start();
            return;
        }
        this.K = z11;
        uw uwVar = this.E0;
        if ((z11 || this.L) && !isInPreviewMode()) {
            i13 = 0;
        }
        uwVar.setVisibility(i13);
        if (z11) {
            this.y3 = -org.telegram.messenger.i0.L(81.0f);
            N4(-e4());
        } else {
            N4(0.0f);
        }
        while (true) {
            zx[] zxVarArr = this.e0;
            if (i10 >= zxVarArr.length) {
                break;
            }
            zx zxVar = zxVarArr[i10];
            if (zxVar != null) {
                zxVar.a.requestLayout();
            }
            i10++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        uw uwVar = this.E0;
        if (uwVar != null) {
            if (!this.G0 || z10) {
                uwVar.setVisibility(8);
            } else {
                uwVar.setVisibility(0);
            }
        }
        k5(true);
        f5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        zw zwVar;
        org.telegram.ui.Components.d5 d5Var;
        super.setTitleOverlayText(str, i10, runnable);
        if (this.actionBar != null && (zwVar = this.M0) != null && (zwVar.getContentView() instanceof i31)) {
            org.telegram.ui.ActionBar.u5 titleTextView = this.actionBar.getTitleTextView();
            i31 i31Var = (i31) this.M0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                d5Var = this.D3;
            }
            d5Var = null;
            i31Var.y(d5Var, titleTextView);
        }
        uw uwVar = this.E0;
        if (uwVar != null) {
            org.telegram.ui.Components.f6 f6Var = uwVar.T;
            uwVar.U.c(i10 == 2131751805 ? org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131744138, null), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(2.0f)) : null, true);
            if (str != null) {
                uwVar.g0 = true;
                if (uwVar.h0 != i10) {
                    uwVar.h0 = i10;
                    f6Var.c(org.telegram.messenger.cd.L0(i10, str), !org.telegram.messenger.cd.X, true);
                }
            } else {
                uwVar.g0 = false;
                uwVar.h0 = 0;
                f6Var.c(uwVar.f0, !org.telegram.messenger.cd.X, true);
            }
            uwVar.a.a(uwVar.g0, true);
            uwVar.L0.w(f6Var);
        }
    }

    public final void t3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 33 && ji0.J0(parentActivity)) {
            if (z10) {
                showDialog(new ji0(parentActivity, !w7.c6.a(), new vv(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().U && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.v(parentActivity, new lv(this, 1)).a;
                this.T1 = x1Var;
                showDialog(x1Var);
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
        } else if ((i10 <= 28 || org.telegram.messenger.v2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
            U4();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t5(int i10, boolean z10) {
        RecyclerView recyclerView;
        int i11;
        int childCount;
        int i12;
        int i13 = 131072;
        if (this.S1) {
            int i14 = org.telegram.messenger.vp.D8;
            if ((i10 & 131072) == 0) {
                return;
            }
        }
        if (this.isPaused) {
            return;
        }
        int i15 = 0;
        while (i15 < 3) {
            if (i15 == 2) {
                kx kxVar = this.C0;
                recyclerView = kxVar != null ? kxVar.a0 : null;
            } else {
                zx[] zxVarArr = this.e0;
                if (zxVarArr != null) {
                    wx wxVar = i15 < zxVarArr.length ? zxVarArr[i15].a : null;
                    if (wxVar == null || zxVarArr[i15].getVisibility() == 0) {
                        r6 = wxVar != null ? this.e0[i15] : null;
                        recyclerView = wxVar;
                    }
                }
                i11 = i15;
                i15 = i11 + 1;
                i13 = 131072;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                int i16 = org.telegram.messenger.vp.D8;
                if (((i10 & 2048) != 0 || i10 == 0) && r6 != null) {
                    r6.q(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    int i17 = 0;
                    while (i17 < childCount2) {
                        View childAt = recyclerView.getChildAt(i17);
                        boolean z11 = childAt instanceof org.telegram.ui.Cells.v2;
                        ArrayList arrayList = this.I2;
                        if (z11 && (this.C0 == null || recyclerView.getAdapter() != this.C0.d0)) {
                            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt;
                            int i18 = org.telegram.messenger.vp.D8;
                            if ((i10 & i13) != 0) {
                                v2Var.a0(this.actionBar.u(), true);
                                if (this.S1) {
                                    i11 = i15;
                                    i17++;
                                    i15 = i11;
                                    i13 = 131072;
                                }
                            }
                            if ((65536 & i10) != 0) {
                                v2Var.c0(false, (i10 & TLObject.FLAG_13) != 0);
                            } else {
                                if ((i10 & 512) == 0) {
                                    i11 = i15;
                                    if (v2Var.i0(i10, z10)) {
                                        r6.q(false);
                                        break;
                                    }
                                } else if (this.e0[i15].p() && org.telegram.messenger.i0.Q1()) {
                                    i11 = i15;
                                    v2Var.setDialogSelected(v2Var.getDialogId() == this.p2.a);
                                } else {
                                    i11 = i15;
                                }
                                if (arrayList != null) {
                                    v2Var.c0(arrayList.contains(Long.valueOf(v2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.pa)) {
                                    ((org.telegram.ui.Cells.pa) childAt).i(i10);
                                } else if (childAt instanceof org.telegram.ui.Cells.k6) {
                                    org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) childAt;
                                    k6Var.A(i10);
                                    if (arrayList != null) {
                                        k6Var.y(arrayList.contains(Long.valueOf(k6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.S1 && (childAt instanceof org.telegram.ui.Components.tk0)) {
                                    org.telegram.ui.Components.tk0 tk0Var = (org.telegram.ui.Components.tk0) childAt;
                                    childCount = tk0Var.getChildCount();
                                    for (i12 = 0; i12 < childCount; i12++) {
                                        View childAt2 = tk0Var.getChildAt(i12);
                                        if (childAt2 instanceof org.telegram.ui.Cells.q4) {
                                            ((org.telegram.ui.Cells.q4) childAt2).b(i10);
                                        }
                                    }
                                }
                                i17++;
                                i15 = i11;
                                i13 = 131072;
                            }
                        }
                        i11 = i15;
                        if (!(childAt instanceof org.telegram.ui.Cells.pa)) {
                        }
                        if (!this.S1) {
                            org.telegram.ui.Components.tk0 tk0Var2 = (org.telegram.ui.Components.tk0) childAt;
                            childCount = tk0Var2.getChildCount();
                            while (i12 < childCount) {
                            }
                        }
                        i17++;
                        i15 = i11;
                        i13 = 131072;
                    }
                }
            }
            i11 = i15;
            i15 = i11 + 1;
            i13 = 131072;
        }
    }

    @Override // org.telegram.ui.of0
    public final void u() {
        I4(true, true);
    }

    public final void u3(CharSequence charSequence) {
        if (this.B1 == null) {
            return;
        }
        if (this.D2 == null && this.E2 == null && this.F2 == null) {
            return;
        }
        int i10 = 0;
        if (this.G2 == null) {
            org.telegram.ui.Components.sp0 sp0Var = new org.telegram.ui.Components.sp0(getParentActivity(), getResourceProvider());
            this.G2 = sp0Var;
            sp0Var.setLayoutClickListener(new hv(this, i10));
            this.G2.setOnModeChangeListener(new iv(this, i10));
            ow owVar = this.B1;
            org.telegram.ui.Components.sp0 sp0Var2 = this.G2;
            if (sp0Var2 == null) {
                owVar.getClass();
            } else {
                owVar.G1 = sp0Var2;
                owVar.addView(sp0Var2, 0, w7.b6.e(-1, 48, 51));
                owVar.g3 = false;
                owVar.I();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
            layoutParams.rightMargin = -this.B1.getPaddingRight();
            this.G2.setLayoutParams(layoutParams);
        }
        if (l4()) {
            this.G2.i(this.currentAccount, this.D2);
        } else {
            String str = this.E2;
            if (str != null) {
                org.telegram.ui.Components.sp0 sp0Var3 = this.G2;
                sp0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    sp0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.F2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.sp0 sp0Var4 = this.G2;
                    sp0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        sp0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.B1.setFieldText(charSequence);
        }
        this.B1.setOverrideHint(org.telegram.messenger.cd.L0(l4() ? 2131754454 : 2131745480, null));
        G3();
        if (this.G2.getMode() != 0) {
            this.B1.v1(false, false);
        }
        o5();
    }

    public final void u4(long j10) {
        long j11 = j10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j11);
        int i10 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                u4(((TLRPC.Dialog) obj).id);
            }
            return;
        }
        int i11 = this.e0[0].s;
        org.telegram.messenger.ap apVar = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.u() || this.actionBar.w(null))) {
            apVar = getMessagesController().M[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        int i12 = -1;
        if (apVar != null) {
            int i13 = apVar.g;
            int i14 = org.telegram.messenger.vp.D8;
            if ((i13 & 64) != 0 && !apVar.a(this.currentAccount, dialog)) {
                L4(true, true);
                y3();
                if (this.R1 != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= this.R1.size()) {
                            break;
                        }
                        if (((TLRPC.Dialog) this.R1.get(i15)).id == j11) {
                            i12 = i15;
                            break;
                        }
                        i15++;
                    }
                    if (i12 < 0) {
                        L4(false, false);
                    }
                }
            }
        }
        int i16 = i12;
        if (getMessagesController().s2(j11) || getMessagesController().y2(j11)) {
            org.telegram.messenger.vp messagesController = getMessagesController();
            org.telegram.messenger.hs messagesStorage = messagesController.getMessagesStorage();
            org.telegram.messenger.vl vlVar = new org.telegram.messenger.vl(messagesController, j11);
            org.telegram.messenger.r5 r5Var = messagesStorage.a;
            org.telegram.messenger.d4 d4Var = new org.telegram.messenger.d4(messagesStorage, j11, vlVar, 5);
            j11 = j11;
            r5Var.c(d4Var);
        }
        getMessagesController().l3(j11, 0L);
        org.telegram.messenger.vp messagesController2 = getMessagesController();
        int i17 = dialog.top_message;
        messagesController2.h3(j11, i17, i17, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i16 >= 0) {
            this.R1.remove(i16);
            this.e0[0].y.D();
            this.e0[0].q(true);
        }
    }

    public final boolean u5(long j10) {
        TLRPC.Chat L0;
        ow owVar;
        if ((this.S0 <= 1 && ((owVar = this.B1) == null || owVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !org.telegram.messenger.o5.z(j10) || (L0 = getMessagesController().L0(Long.valueOf(-j10))) == null || org.telegram.messenger.w3.N(L0) || !L0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.cd.L0(2131745328, null), org.telegram.messenger.cd.L0(2131745320, null), null);
        return false;
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 1) {
            N3();
            P3();
            S3();
            F3();
            Q3();
            px pxVar = this.X;
            fe.b bVar = this.b;
            pxVar.setBlurredBackgroundVisibility(bVar.e);
            float a2 = w7.n7.a(bVar.e);
            org.telegram.ui.Components.g9 g9Var = this.b3;
            if (g9Var != null) {
                g9Var.setScaleX(a2);
                this.b3.setScaleY(a2);
                this.b3.setAlpha(a2);
                this.b3.setVisibility(a2 > 0.0f ? 0 : 8);
            }
            if (this.v0 != null) {
                float T1 = org.telegram.messenger.i0.T1(0.9f, 1.0f, a2);
                this.v0.setScaleX(T1);
                this.v0.setScaleY(T1);
                this.v0.setAlpha(a2);
                this.v0.setVisibility(a2 > 0.0f ? 0 : 8);
                this.w0.setAlpha(a2);
                this.w0.setVisibility(a2 > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i10 == 2) {
            N3();
            P3();
            return;
        }
        if (i10 == 3) {
            L3();
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
            K3();
            return;
        }
        if (i10 == 6) {
            N3();
            P3();
        } else {
            if (i10 == 7) {
                G3();
                return;
            }
            if (i10 == 8) {
                F3();
                Q3();
            } else if (i10 == 9) {
                Q3();
            }
        }
    }

    public final int v3() {
        if (this.B1 != null) {
            return (int) (this.y1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(2.0f));
        }
        if (this.Y2 == 0) {
            return this.f4 + this.h4;
        }
        return org.telegram.messenger.i0.L(72.0f) + this.f4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (org.telegram.messenger.w3.K(r6, false) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v4(TLRPC.Chat chat, TLRPC.User user) {
        Boolean bool;
        Boolean bool2;
        if (chat != null) {
            boolean V = org.telegram.messenger.w3.V(chat);
            TLRPC.RequestPeerType requestPeerType = this.G;
            if (V == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.G.bot_participant) == null || !bool2.booleanValue() || getMessagesController().w2(chat, user) || org.telegram.messenger.w3.b(chat)))) {
                Boolean bool3 = this.G.has_username;
                if (bool3 != null) {
                }
                Boolean bool4 = this.G.forum;
                if ((bool4 == null || bool4.booleanValue() == org.telegram.messenger.w3.c0(chat)) && ((this.G.user_admin_rights == null || getMessagesController().r3(chat, getUserConfig().f(), this.G.user_admin_rights)) && (this.G.bot_admin_rights == null || getMessagesController().r3(chat, user, this.G.bot_admin_rights) || org.telegram.messenger.w3.w(4, chat)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I2;
            if (i10 >= arrayList.size()) {
                return true;
            }
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-((Long) arrayList.get(i10)).longValue()));
            if (L0 != null && !org.telegram.messenger.w3.l(L0)) {
                return false;
            }
            i10++;
        }
    }

    public final boolean w4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.G;
        if (user == null || org.telegram.messenger.h20.z(user) || org.telegram.messenger.h20.x(user)) {
            return false;
        }
        Boolean bool = tL_requestPeerTypeUser.bot;
        if (bool != null && bool.booleanValue() != user.bot) {
            return false;
        }
        Boolean bool2 = tL_requestPeerTypeUser.premium;
        return bool2 == null || bool2.booleanValue() == user.premium;
    }

    public final void x3() {
        int themedColor;
        org.telegram.ui.Components.cg0 cg0Var;
        kw kwVar;
        org.telegram.ui.Components.zm0 zm0Var;
        w71 w71Var;
        kx kxVar = this.C0;
        if (kxVar != null && (zm0Var = kxVar.d0) != null && (w71Var = zm0Var.k0) != null) {
            int childCount = w71Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = w71Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q4) {
                    org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) childAt;
                    org.telegram.ui.Components.r8 r8Var = q4Var.c;
                    int i11 = q4Var.h;
                    if (org.telegram.messenger.o5.E(q4Var.f)) {
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(q4Var.f));
                        q4Var.e = Z1;
                        r8Var.r(Z1);
                    } else {
                        r8Var.q(org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-q4Var.f)));
                        q4Var.e = null;
                    }
                    q4Var.c(true);
                }
            }
        }
        if (this.e0 != null) {
            int i12 = 0;
            while (true) {
                zx[] zxVarArr = this.e0;
                if (i12 >= zxVarArr.length) {
                    break;
                }
                zx zxVar = zxVarArr[i12];
                if (zxVar != null && (kwVar = zxVar.n) != null) {
                    kwVar.i();
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.F(getThemedColor(org.telegram.ui.ActionBar.t6.G8), true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.t6.E8), false, true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.t6.F8), true, true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.t6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.D3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.ni);
            Drawable drawable = this.K3;
            if (drawable != null && themedColor2 != this.w4) {
                this.w4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.d5 d5Var = this.D3;
            if (d5Var != null) {
                d5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.n nVar = this.E3;
            if (nVar != null) {
                nVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.d3 d3Var = this.M1;
        if (d3Var != null) {
            org.telegram.ui.ActionBar.t6.H1(d3Var.getBackground(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false), true);
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.m0;
        if (t0Var != null) {
            t0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.t6.v8));
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.updateColors();
        }
        qx qxVar = this.z0;
        if (qxVar != null) {
            vg.f fVar = qxVar.y0;
            if (fVar != null) {
                fVar.updateColors();
            }
            qxVar.invalidate();
        }
        zf.g0 g0Var = this.b0;
        if (g0Var != null) {
            g0Var.updateColors();
        }
        kx kxVar2 = this.C0;
        if (kxVar2 != null && (cg0Var = kxVar2.r0) != null) {
            cg0Var.c();
        }
        org.telegram.ui.Components.v71 v71Var = this.a0;
        if (v71Var != null) {
            v71Var.updateColors();
        }
        q01 q01Var = this.Z;
        if (q01Var != null) {
            q01Var.updateColors();
        }
        if (this.K0 != null) {
            int o10 = i0.b.o(getThemedColor(org.telegram.ui.ActionBar.t6.d6), 100);
            if (!(this.K0.getForeground() instanceof ColorDrawable)) {
                this.K0.setForeground(new ColorDrawable(o10));
            } else if (((ColorDrawable) this.K0.getForeground()).getColor() != o10) {
                ((ColorDrawable) this.K0.getForeground()).setColor(o10);
            }
        }
        org.telegram.ui.Components.f10 f10Var = this.t0;
        if (f10Var != null) {
            f10Var.updateColors();
        }
        org.telegram.ui.Components.f10 f10Var2 = this.u0;
        if (f10Var2 != null) {
            f10Var2.updateColors();
        }
        int i13 = org.telegram.ui.ActionBar.t6.d6;
        this.m4.a(getThemedColor(i13));
        org.telegram.ui.Components.zr zrVar = this.J1;
        if (zrVar != null) {
            zrVar.updateColors();
        }
        org.telegram.ui.Components.yr yrVar = this.K1;
        if (yrVar != null) {
            yrVar.setColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        }
        mw mwVar = this.H1;
        if (mwVar != null) {
            mwVar.updateColors();
        }
        mw mwVar2 = this.F1;
        if (mwVar2 != null) {
            mwVar2.updateColors();
        }
        m5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        uw uwVar = this.E0;
        if (uwVar != null) {
            uwVar.o();
        }
        if (this.C3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Ul)) != this.v4) {
            this.v4 = themedColor;
            this.C3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        px pxVar = this.X;
        if (pxVar != null) {
            pxVar.updateColors();
        }
    }

    public final void x4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        int i10 = 1;
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(getParentActivity(), false, 1, null);
        boolean z10 = getMessagesStorage().L != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, org.telegram.messenger.tz.q1 ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? org.telegram.messenger.cd.L0(2131748697, null) : null, org.telegram.messenger.cd.L0(org.telegram.messenger.tz.q1 ? 2131747262 : 2131749333, null)};
        l4 l4Var = new l4(this, i10);
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = l4Var;
        showDialog(h);
    }

    public final void y3() {
        org.telegram.messenger.i0.h3(new ew(this, 0), 300L);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y4(View view, int i10, s4.g0 g0Var) {
        s4.g0 g0Var2;
        long j10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        org.telegram.messenger.jj jjVar;
        long j11;
        long j12;
        org.telegram.ui.Components.zm0 zm0Var;
        xw xwVar;
        long j13;
        long j14;
        int i14;
        org.telegram.messenger.jj jjVar2;
        long F;
        long j15;
        long j16;
        TLRPC.Chat L0;
        boolean z11;
        kx kxVar;
        int i15;
        Object J;
        long j17;
        long j18;
        int i16;
        if (getParentActivity() == null) {
            return;
        }
        boolean z12 = g0Var instanceof zf.m;
        if (z12) {
            zf.m mVar = (zf.m) g0Var;
            int i17 = mVar.h;
            if (i17 == 7 || i17 == 8) {
                org.telegram.messenger.ap apVar = getMessagesController().M[i17 == 7 ? (char) 0 : (char) 1];
                if (apVar != null) {
                    i15 = apVar.a;
                    J = mVar.J(i10);
                    if (this.C2 == null && mVar.n && g0Var.d(i10) == 21) {
                        this.C2.N(this);
                        return;
                    }
                    if (J instanceof TLRPC.User) {
                        if (J instanceof TLRPC.Chat) {
                            j18 = ((TLRPC.Chat) J).id;
                        } else if (J instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                            i16 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.w(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new ay(bundle));
                                return;
                            }
                            j17 = dialog.id;
                            if (this.actionBar.w(null)) {
                                X4(j17, view);
                                return;
                            }
                            g0Var2 = g0Var;
                            i11 = i16;
                            z10 = false;
                            i12 = 0;
                            jjVar = null;
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
                                    showDialog(new org.telegram.ui.Components.cx0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) J;
                            g0Var2 = g0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!org.telegram.messenger.w3.T(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.u70(getParentActivity(), chatInvite, str, this, null));
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
                            jjVar = null;
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
                    jjVar = null;
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
            jjVar = null;
            i13 = i15;
            j12 = j17;
            j11 = 0;
            j10 = 0;
        } else {
            g0Var2 = g0Var;
            kx kxVar2 = this.C0;
            if (kxVar2 == null || g0Var2 != (zm0Var = kxVar2.d0)) {
                j10 = 0;
                z10 = false;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                jjVar = null;
                j11 = 0;
                j12 = 0;
            } else {
                Object I = zm0Var.I(i10);
                z10 = this.C0.d0.N(i10);
                if (I instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) I;
                    F = user.id;
                    if (!this.l2) {
                        this.W1 = F;
                        this.X1 = user;
                    }
                } else if (I instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) I;
                    F = -chat3.id;
                    if (!this.l2) {
                        this.W1 = F;
                        this.X1 = chat3;
                    }
                } else if (I instanceof TLRPC.EncryptedChat) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) I;
                    F = org.telegram.messenger.o5.F(encryptedChat.id);
                    if (!this.l2) {
                        this.W1 = F;
                        this.X1 = encryptedChat;
                    }
                } else {
                    if (I instanceof org.telegram.messenger.jj) {
                        jjVar2 = (org.telegram.messenger.jj) I;
                        long B0 = org.telegram.messenger.jj.B0(jjVar2.k);
                        int f12 = jjVar2.f1();
                        j10 = 0;
                        j14 = org.telegram.messenger.w3.c0(getMessagesController().L0(Long.valueOf(-B0))) ? org.telegram.messenger.jj.c2(jjVar2.I1, jjVar2.k, true, false) : 0L;
                        kx kxVar3 = this.C0;
                        if (kxVar3 != null) {
                            org.telegram.ui.Components.zm0 zm0Var2 = kxVar3.d0;
                            zm0Var2.j0.a(zm0Var2.Z);
                        }
                        i14 = f12;
                        j13 = B0;
                    } else {
                        j10 = 0;
                        if (I instanceof String) {
                            String str2 = (String) I;
                            kx kxVar4 = this.C0;
                            if (kxVar4 != null && !kxVar4.d0.J.isEmpty()) {
                                this.X.r.setText(str2);
                                this.X.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                gi0 gi0Var = new gi0(getParentActivity(), this);
                                gi0Var.N0(str2, true);
                                gi0Var.show();
                            }
                        } else if (I instanceof org.telegram.messenger.f5) {
                            org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) I;
                            org.telegram.ui.Components.s4.u(this, f5Var.i, f5Var.j, (String) f5Var.e.get(0));
                        } else if ((I instanceof TLRPC.TL_forumTopic) && (xwVar = this.F3) != null && (xwVar.getFragment() instanceof pb1)) {
                            j13 = -((pb1) this.F3.getFragment()).a;
                            j14 = ((TLRPC.TL_forumTopic) I).id;
                            i14 = 0;
                            jjVar2 = null;
                        }
                        i14 = 0;
                        jjVar2 = null;
                        j14 = 0;
                        j13 = 0;
                    }
                    if (j13 == j10 && this.actionBar.u()) {
                        if (this.actionBar.w("search_dialogs_action_mode") && i14 == 0 && !z10) {
                            X4(j13, view);
                            return;
                        }
                        return;
                    }
                    j12 = j13;
                    j11 = j14;
                    i13 = 0;
                    i12 = i14;
                    jjVar = jjVar2;
                    i11 = 0;
                }
                i14 = 0;
                jjVar2 = null;
                j13 = F;
                j14 = 0;
                j10 = 0;
                if (j13 == j10) {
                }
                j12 = j13;
                j11 = j14;
                i13 = 0;
                i12 = i14;
                jjVar = jjVar2;
                i11 = 0;
            }
        }
        if (j12 == j10) {
            return;
        }
        if (this.l2) {
            if (u5(j12)) {
                if ((!getMessagesController().s2(j12) && !getMessagesController().o2(j12)) || q4(j12)) {
                    ArrayList arrayList = this.I2;
                    if (!arrayList.isEmpty() || (this.R0 == 3 && this.f2 != null)) {
                        if (arrayList.contains(Long.valueOf(j12)) || z3(j12)) {
                            boolean r32 = r3(j12, view);
                            kx kxVar5 = this.C0;
                            if (kxVar5 != null && g0Var2 == kxVar5.d0) {
                                this.actionBar.k(true);
                                a4(j12, r32);
                            }
                            n5();
                            return;
                        }
                        return;
                    }
                }
                if (this.m2 && getMessagesController().o2(j12)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j12);
                    ay ayVar = new ay(bundle2);
                    ayVar.X2 = this;
                    ayVar.C2 = this.C2;
                    presentFragment(ayVar);
                    return;
                }
                if (!this.m2 || ((!getMessagesController().s2(j12) || q4(j12)) && !getMessagesController().y2(j12))) {
                    Z3(j12, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j12);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.R0 == 1);
                bundle3.putBoolean("quote", this.O0);
                bundle3.putBoolean("reply_to", this.N0);
                pb1 pb1Var = new pb1(bundle3);
                pb1Var.L0 = this;
                presentFragment(pb1Var);
                return;
            }
            return;
        }
        Bundle bundle4 = new Bundle();
        if (org.telegram.messenger.o5.C(j12)) {
            j15 = j11;
            bundle4.putInt("enc_id", (int) (j12 & 4294967295L));
        } else {
            j15 = j11;
            if (org.telegram.messenger.o5.E(j12)) {
                bundle4.putLong("user_id", j12);
            } else {
                if (i12 == 0 || (L0 = getMessagesController().L0(Long.valueOf(-j12))) == null || L0.migrated_to == null) {
                    j16 = j12;
                } else {
                    bundle4.putLong("migrated_to", j12);
                    j16 = -L0.migrated_to.channel_id;
                }
                bundle4.putLong("chat_id", -j16);
            }
        }
        if (i12 != 0) {
            bundle4.putInt("message_id", i12);
        } else if (z10) {
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                kx kxVar6 = this.C0;
                if (kxVar6 != null) {
                    kxVar6.d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
        } else {
            U3();
        }
        boolean z13 = (org.telegram.messenger.cd.X || this.j2 || (org.telegram.messenger.i0.Q1() && i11 != 0) || !org.telegram.messenger.sc.e(64) || this.Y2 != j10) ? false : true;
        bundle4.putInt("dialog_folder_id", i11);
        bundle4.putInt("dialog_filter_id", i13);
        if (org.telegram.messenger.i0.Q1() && ((!getMessagesController().s2(j12) || !z13) && this.p2.a == j12 && ((kxVar = this.C0) == null || g0Var2 != kxVar.d0))) {
            if (getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                List fragmentStack = launchActivity.s0.getFragmentStack();
                if (fragmentStack.isEmpty()) {
                    return;
                }
                if (fragmentStack.size() == 1 && (sc.e.g(1, fragmentStack) instanceof un)) {
                    ((un) sc.e.g(1, fragmentStack)).ka();
                    return;
                }
                if (fragmentStack.size() == 2) {
                    launchActivity.s0.l(true, false);
                    return;
                } else {
                    if (getParentActivity() instanceof LaunchActivity) {
                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(0);
                        fragmentStack.clear();
                        fragmentStack.add(k2Var);
                        launchActivity.s0.W(true, true);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        kx kxVar7 = this.C0;
        if (kxVar7 != null && kxVar7.A0) {
            kxVar7.R(false);
        }
        if (j12 == getUserConfig().e() && getMessagesController().p6) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("dialog_id", org.telegram.messenger.d20.i(this.currentAccount).e());
            bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            bundle5.putInt("start_from", 11);
            if (this.D0 == null) {
                this.D0 = new org.telegram.ui.Components.rt0(this);
            }
            presentFragment(new org.telegram.ui.Components.n90(bundle5, this.D0));
            return;
        }
        if (this.n2 != null) {
            if (getMessagesController().E(bundle4, this, null, null)) {
                getNotificationCenter().k(org.telegram.messenger.zs.t, new Object[0]);
                un unVar = new un(bundle4);
                o4(unVar, jjVar);
                presentFragment(unVar);
                return;
            }
            return;
        }
        this.z3 = true;
        if (getMessagesController().E(bundle4, this, null, null)) {
            TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(-j12));
            TLRPC.Dialog R0 = getMessagesController().R0(j12);
            boolean V = org.telegram.messenger.w3.V(L02);
            boolean z14 = R0 != null && R0.view_forum_as_messages;
            int b10 = (this.Y2 == j10 || L02 == null) ? 0 : yh.f0.b(this.currentAccount, -L02.id);
            if (b10 == 3) {
                showDialog(new org.telegram.ui.Components.u70(getParentActivity(), L02, null, this, this.resourceProvider));
                return;
            }
            int i18 = 4;
            if (b10 == 4) {
                org.telegram.messenger.m5.n(null, V ? 2131751930 : 2131751927, org.telegram.ui.Components.cc.a0(this), R.raw.e_hand_2, 36);
                return;
            }
            if (L02 == null || !(((z11 = L02.monoforum) || L02.forum) && j15 == j10)) {
                if (org.telegram.messenger.w3.Y(L02)) {
                    Bundle bundle6 = new Bundle();
                    bundle6.putLong("community_id", L02.id);
                    presentFragment(new ay(bundle6));
                    return;
                }
                un unVar2 = new un(bundle4);
                if (j15 != j10) {
                    gg.e.a(unVar2, org.telegram.messenger.gs.a(j12, j15));
                }
                if (z12 && org.telegram.messenger.o5.E(j12) && getMessagesController().Q.f(j12) == null) {
                    org.telegram.messenger.ui mediaDataController = getMediaDataController();
                    TLRPC.Document document = mediaDataController.y0;
                    mediaDataController.n1();
                    if (document != null) {
                        unVar2.U9 = document;
                        unVar2.V9 = true;
                    }
                }
                if (org.telegram.messenger.i0.Q1()) {
                    xw xwVar2 = this.F3;
                    if (xwVar2.a != null) {
                        xwVar2.a();
                    }
                }
                o4(unVar2, jjVar);
                presentFragment(unVar2);
                return;
            }
            if (z11) {
                bundle4.putInt("chatMode", 8);
                bundle4.putBoolean("isSubscriberSuggestions", !org.telegram.messenger.w3.A(this.currentAccount, L02, 24));
                un unVar3 = new un(bundle4);
                o4(unVar3, jjVar);
                presentFragment(unVar3);
                return;
            }
            if (org.telegram.messenger.w3.a(L02)) {
                un unVar4 = new un(bundle4);
                gg.e.a(unVar4, org.telegram.messenger.gs.a(-L02.id, getMessagesController().f7.getLong(a1.g.l(L02.id, "forumlasttopic"), 1L)));
                presentFragment(unVar4);
                return;
            }
            if (!org.telegram.messenger.sc.e(64) || this.Y2 != j10) {
                if (!z14) {
                    presentFragment(new pb1(bundle4));
                    return;
                }
                un unVar5 = new un(bundle4);
                o4(unVar5, jjVar);
                presentFragment(unVar5);
                return;
            }
            if (!z13) {
                if (!z14) {
                    presentFragment(new pb1(bundle4));
                    return;
                }
                un unVar6 = new un(bundle4);
                o4(unVar6, jjVar);
                presentFragment(unVar6);
                return;
            }
            if (this.j2) {
                return;
            }
            if (z14) {
                un unVar7 = new un(bundle4);
                o4(unVar7, jjVar);
                presentFragment(unVar7);
                return;
            }
            xw xwVar3 = this.F3;
            ex exVar = xwVar3.a;
            if (exVar == null || (-exVar.a) != j12) {
                wx wxVar = this.e0[0].a;
                wxVar.v3 = 0.0f;
                wxVar.w3 = wxVar.u3;
                wxVar.x3 = wxVar.o3 != 0.0f;
                ex exVar2 = new ex(bundle4);
                exVar2.M0 = this;
                final xw xwVar4 = this.F3;
                org.telegram.ui.ActionBar.z4 parentLayout = getParentLayout();
                e2.f fVar = xwVar4.n;
                if (!xwVar4.r) {
                    xwVar4.x = parentLayout;
                    exVar2.onFragmentCreate();
                    exVar2.setInPreviewMode(true);
                    exVar2.setParentLayout(parentLayout);
                    View performCreateView = exVar2.performCreateView(xwVar4.getContext());
                    exVar2.onResume();
                    xwVar4.b = performCreateView;
                    xwVar4.addView(performCreateView);
                    final ex exVar3 = xwVar4.a;
                    l0 l0Var = exVar2.e;
                    xwVar4.c = l0Var;
                    xwVar4.addView(l0Var);
                    xwVar4.a = exVar2;
                    k01.Q = j10;
                    k01.Q = -exVar2.a;
                    if (exVar2.getActionBar() != null) {
                        org.telegram.ui.ActionBar.l actionBar = exVar2.getActionBar();
                        xwVar4.d = actionBar;
                        xwVar4.addView(actionBar);
                        xwVar4.d.d1 = new wv0(xwVar4, 12);
                    }
                    if (exVar3 != null) {
                        final ex exVar4 = xwVar4.a;
                        if (org.telegram.messenger.tz.c()) {
                            o1.j jVar = xwVar4.y;
                            if (jVar != null) {
                                jVar.d();
                            }
                            exVar4.onTransitionAnimationStart(true, false);
                            xwVar4.E = exVar3;
                            xwVar4.w = true;
                            fVar.d();
                            o1.j jVar2 = new o1.j(new o1.i(0.0f));
                            xwVar4.y = jVar2;
                            jVar2.m = org.telegram.ui.Cells.f1.p(1000.0f, 400.0f, 1.0f);
                            k01.f(exVar3, exVar4, 0.0f);
                            xwVar4.y.b(new jc0(xwVar4, i18));
                            xwVar4.y.a(new o1.f() { // from class: org.telegram.ui.i01
                                @Override // o1.f
                                public final void a(o1.j jVar3, boolean z15, float f7, float f10) {
                                    k01 k01Var = xwVar4;
                                    if (k01Var.y == null) {
                                        return;
                                    }
                                    k01Var.y = null;
                                    org.telegram.ui.ActionBar.k2 k2Var2 = exVar4;
                                    k2Var2.onTransitionAnimationEnd(true, false);
                                    org.telegram.ui.ActionBar.k2 k2Var3 = exVar3;
                                    k01.f(k2Var3, k2Var2, 1.0f);
                                    k01Var.w = false;
                                    k01Var.E = null;
                                    k2Var3.onPause();
                                    k2Var3.onFragmentDestroy();
                                    k01Var.removeView(k2Var3.getFragmentView());
                                    k01Var.removeView(k2Var3.getActionBar());
                                    k01Var.n.e();
                                }
                            });
                            xwVar4.y.h();
                        } else {
                            exVar4.onTransitionAnimationStart(true, false);
                            exVar4.onTransitionAnimationEnd(true, false);
                            k01.f(exVar3, exVar4, 1.0f);
                            xwVar4.w = false;
                            xwVar4.E = null;
                            exVar3.onPause();
                            exVar3.onFragmentDestroy();
                            xwVar4.removeView(exVar3.getFragmentView());
                            xwVar4.removeView(exVar3.getActionBar());
                            fVar.e();
                        }
                    } else if (!xwVar4.f) {
                        xwVar4.f = true;
                        if (org.telegram.messenger.tz.c()) {
                            fVar.d();
                            xwVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                            xwVar4.e = 0.0f;
                            xwVar4.e(true);
                            xwVar4.g();
                            exVar2.onTransitionAnimationStart(true, false);
                            xwVar4.h.addUpdateListener(new h01(xwVar4, 1));
                            xwVar4.h.addListener(new org.telegram.ui.Components.iw0(8, (Object) xwVar4, (Object) exVar2));
                            xwVar4.h.setDuration(250L);
                            xwVar4.h.setInterpolator(org.telegram.ui.Components.gr.f);
                            xwVar4.h.setStartDelay(org.telegram.messenger.tz.o() >= 2 ? 50L : 150L);
                            xwVar4.h.start();
                        } else {
                            xwVar4.e(true);
                            exVar2.onTransitionAnimationStart(true, false);
                            exVar2.onTransitionAnimationEnd(true, false);
                            xwVar4.e = 1.0f;
                            xwVar4.g();
                            xwVar4.d(false);
                        }
                    }
                    exVar2.setPreviewDelegate(new tj0(xwVar4, 16));
                    WeakHashMap weakHashMap = r0.h0.a;
                    r0.x.c(xwVar4);
                }
            } else {
                xwVar3.a();
            }
            kx kxVar8 = this.C0;
            if (kxVar8 != null) {
                kxVar8.S();
            }
        }
    }

    public final boolean z3(long j10) {
        int i10;
        int i11 = this.R0;
        if (i11 == 15 || i11 == 16 || this.h2 != null || !this.s2) {
            return true;
        }
        if (!org.telegram.messenger.o5.z(j10)) {
            if (!org.telegram.messenger.o5.C(j10)) {
                return true;
            }
            if (this.T0 == 0 && !this.U0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131745613, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            int i12 = this.T0;
            if (i12 == 3) {
                x1Var.T = org.telegram.messenger.cd.L0(2131744115, null);
            } else if (i12 != 0) {
                x1Var.T = org.telegram.messenger.cd.L0(2131747191, null);
            } else {
                x1Var.T = org.telegram.messenger.cd.L0(2131749114, null);
            }
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747847, null), null);
            showDialog(x1Var);
            return false;
        }
        long j11 = -j10;
        TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(j11));
        if (!org.telegram.messenger.w3.T(L02) || L02.megagroup) {
            return true;
        }
        if (!this.q2) {
            TLRPC.Chat L03 = org.telegram.messenger.vp.r1(this.currentAccount).L0(Long.valueOf(j11));
            if ((org.telegram.messenger.w3.n(L03) || L03.megagroup) && (i10 = this.T0) != 2 && i10 != 3) {
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String L04 = org.telegram.messenger.cd.L0(2131745613, null);
        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
        x1Var2.R = L04;
        int i13 = this.T0;
        if (i13 == 3) {
            x1Var2.T = org.telegram.messenger.cd.L0(2131744116, null);
        } else if (i13 == 2) {
            x1Var2.T = org.telegram.messenger.cd.L0(2131746602, null);
        } else {
            x1Var2.T = org.telegram.messenger.cd.L0(2131752440, null);
        }
        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131747847, null), null);
        showDialog(x1Var2);
        return false;
    }

    public final boolean z4(View view, int i10, float f7, org.telegram.ui.Components.sk0 sk0Var) {
        org.telegram.ui.Components.zm0 zm0Var;
        org.telegram.ui.Components.zm0 zm0Var2;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.d3) && sk0Var.d(i10) != 21) {
            if (!this.actionBar.u() && !org.telegram.messenger.i0.Q1() && !this.l2 && (view instanceof org.telegram.ui.Cells.v2)) {
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                if (!getMessagesController().s2(v2Var.getDialogId()) && !this.F3.c() && v2Var.Z(f7)) {
                    return S4(v2Var);
                }
            }
            xw xwVar = this.F3;
            if (xwVar == null || !xwVar.c()) {
                kx kxVar = this.C0;
                if (kxVar != null && sk0Var == (zm0Var2 = kxVar.d0)) {
                    Object I = zm0Var2.I(i10);
                    if (!this.C0.d0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String L0 = org.telegram.messenger.cd.L0(2131752054, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                x1Var.T = org.telegram.messenger.cd.a0("ClearSearchSingleChatAlertText", null, 2131752053, gg.e.i(this.currentAccount, chat, false));
                            } else {
                                x1Var.T = org.telegram.messenger.cd.a0("ClearSearchSingleChatAlertText", null, 2131752053, chat.title);
                            }
                            F = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().n) {
                                x1Var.T = org.telegram.messenger.cd.a0("ClearSearchSingleChatAlertText", null, 2131752053, org.telegram.messenger.cd.L0(2131745918, null));
                            } else {
                                x1Var.T = org.telegram.messenger.cd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                            }
                            F = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            x1Var.T = org.telegram.messenger.cd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                            F = org.telegram.messenger.o5.F(r14.id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752055, null), new m4.x0(this, F, 6));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        showDialog(x1Var);
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                kx kxVar2 = this.C0;
                if (kxVar2 == null || sk0Var != (zm0Var = kxVar2.d0)) {
                    Object J = ((zf.m) sk0Var).J(i10);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.l2) {
                            if ((this.R0 == 3 || T3()) && u5(dialog.id)) {
                                if (this.R0 != 1 || !T3() || !this.m2 || !getMessagesController().s2(dialog.id)) {
                                    r3(dialog.id, view);
                                    n5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.R0 == 1);
                                bundle.putBoolean("quote", this.O0);
                                bundle.putBoolean("reply_to", this.N0);
                                pb1 pb1Var = new pb1(bundle);
                                pb1Var.L0 = this;
                                presentFragment(pb1Var);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                x4(view);
                                return false;
                            }
                            if (!this.actionBar.u() || !r4(dialog)) {
                                X4(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.l2) {
                        y4(view, i10, sk0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.k6) || zm0Var.N(i10)) ? 0L : ((org.telegram.ui.Cells.k6) view).getDialogId();
                    if (dialogId != 0) {
                        X4(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

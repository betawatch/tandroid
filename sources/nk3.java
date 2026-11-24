// default package

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
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.LongSparseArray;
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
import java.util.LinkedHashMap;
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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class nk3 extends d implements jm7, el4, g94, aj6 {
    public static boolean E4;
    public static final boolean[] F4 = new boolean[4];
    public static final rg3 G4 = new rg3((byte) 1);
    public static float H4;
    public ak3 A0;
    public va2 A1;
    public boolean A2;
    public float A3;
    public final RectF A4;
    public boolean B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public final RectF B4;
    public int C0;
    public FrameLayout C1;
    public boolean C2;
    public boolean C3;
    public int C4;
    public sj3 D0;
    public ti3 D1;
    public boolean D2;
    public Long D3;
    public int D4;
    public boolean E;
    public fha E0;
    public vi3 E1;
    public hk3 E2;
    public Drawable E3;
    public boolean F;
    public aj3 F0;
    public r7 F1;
    public ArrayList F2;
    public tm F3;
    public boolean G;
    public ok3 G0;
    public final TextPaint G1;
    public String G2;
    public yn G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public ri3 H1;
    public CharSequence H2;
    public dj3 H3;
    public long I;
    public float I0;
    public FrameLayout I1;
    public bda I2;
    public final si3 I3;
    public ValueAnimator J;
    public float J0;
    public ri3 J1;
    public rd3 J2;
    public final si3 J3;
    public ValueAnimator K;
    public float K0;
    public FrameLayout K1;
    public final ArrayList K2;
    public fk3 K3;
    public boolean L;
    public sb L0;
    public qk3 L1;
    public boolean L2;
    public e7a L3;
    public boolean M;
    public bu5 M0;
    public pk3 M1;
    public int M2;
    public Drawable M3;
    public boolean N;
    public fj3 N0;
    public l9 N1;
    public int N2;
    public int N3;
    public float O;
    public boolean O0;
    public nl3 O1;
    public boolean O2;
    public boolean O3;
    public boolean P;
    public boolean P0;
    public x6c P1;
    public int P2;
    public final e7a P3;
    public int Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public final kh3 Q3;
    public boolean R;
    public long R0;
    public Long R1;
    public int R2;
    public boolean R3;
    public boolean S;
    public long S0;
    public cp2 S1;
    public int S2;
    public boolean S3;
    public u31 T;
    public int T0;
    public ArrayList T1;
    public int T2;
    public final kh3 T3;
    public float U;
    public int U0;
    public boolean U1;
    public int U2;
    public int U3;
    public boolean V;
    public int V0;
    public he V1;
    public int V2;
    public AnimatorSet V3;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public int W2;
    public boolean W3;
    public boolean X;
    public nt7 X0;
    public boolean X1;
    public boolean X2;
    public w93 X3;
    public zj3 Y;
    public hg3 Y0;
    public long Y1;
    public int Y2;
    public String Y3;
    public av9 Z;
    public hg3 Z0;
    public TLObject Z1;
    public nk3 Z2;
    public ArrayList Z3;
    public final byte a;
    public nu9 a0;
    public boolean a1;
    public int a2;
    public long a3;
    public boolean a4;
    public final fn0 b;
    public vgc b0;
    public boolean b1;
    public int b2;
    public TLRPC.Chat b3;
    public CharSequence b4;
    public final fn0 c;
    public uh4 c0;
    public final ArrayList c1;
    public boolean c2;
    public TLRPC.ChatFull c3;
    public boolean c4;
    public final fn0 d;
    public float d0;
    public boolean d1;
    public boolean d2;
    public bf0 d3;
    public float d4;
    public final fn0 e;
    public ValueAnimator e0;
    public boolean e1;
    public boolean e2;
    public pc0 e3;
    public boolean e4;
    public final fn0 f;
    public mk3[] f0;
    public boolean f1;
    public int f2;
    public long f3;
    public boolean f4;
    public r7 g0;
    public ee0 g1;
    public boolean g2;
    public boolean g3;
    public ValueAnimator g4;
    public final fn0 h;
    public r7 h0;
    public final Paint h1;
    public String h2;
    public boolean h3;
    public wn5 h4;
    public hr3 i0;
    public ImageView i1;
    public String i2;
    public AnimatorSet i3;
    public TLRPC.FileLocation i4;
    public boolean j0;
    public NumberTextView j1;
    public String j2;
    public boolean j3;
    public TLRPC.FileLocation j4;
    public r7 k0;
    public final ArrayList k1;
    public boolean k2;
    public boolean k3;
    public u31 k4;
    public r7 l0;
    public r7 l1;
    public boolean l2;
    public float l3;
    public int l4;
    public r7 m0;
    public r7 m1;
    public boolean m2;
    public boolean m3;
    public int m4;
    public final fn0 n;
    public r7 n0;
    public r7 n1;
    public boolean n2;
    public int n3;
    public int n4;
    public uv8 o0;
    public r7 o1;
    public boolean o2;
    public boolean o3;
    public int o4;
    public a8 p0;
    public a8 p1;
    public String p2;
    public boolean p3;
    public int p4;
    public hg5 q0;
    public a8 q1;
    public String q2;
    public u31 q3;
    public final mr3 q4;
    public final fn0 r;
    public hg5 r0;
    public a8 r1;
    public final bf7 r2;
    public final po r3;
    public final nz4 r4;
    public final fn0 s;
    public boolean s0;
    public a8 s1;
    public boolean s2;
    public boolean s3;
    public final nz4 s4;
    public boolean t0;
    public a8 t1;
    public boolean t2;
    public boolean t3;
    public final kz4 t4;
    public wp4 u0;
    public a8 u1;
    public boolean u2;
    public boolean u3;
    public final km0 u4;
    public wp4 v0;
    public a8 v1;
    public boolean v2;
    public boolean v3;
    public final km0 v4;
    public final g0d w;
    public b61 w0;
    public float w1;
    public boolean w2;
    public float w3;
    public final km0 w4;
    public boolean x;
    public e02 x0;
    public float x1;
    public boolean x2;
    public ValueAnimator x3;
    public final km0 x4;
    public int y;
    public int y0;
    public AnimatorSet y1;
    public boolean y2;
    public float y3;
    public ai3 y4;
    public final UndoView[] z0;
    public float z1;
    public boolean z2;
    public float z3;
    public final ArrayList z4;

    public nk3(Bundle bundle) {
        super(bundle);
        km0 km0Var;
        km0 km0Var2;
        km0 km0Var3;
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 31 ? (byte) 48 : (byte) 0;
        d53 d53Var = d53.h;
        this.b = new fn0(1, this, d53Var, 350L, false);
        this.c = new fn0(2, this, d53Var, 350L, false);
        this.d = new fn0(3, this, d53Var, 350L, false);
        this.e = new fn0(4, this, d53Var, 350L, false);
        this.f = new fn0(5, this, d53Var, 350L, false);
        this.h = new fn0(6, this, d53Var, 350L, false);
        this.n = new fn0(7, this, d53Var, 350L, false);
        this.r = new fn0(8, this, d53Var, 350L, false);
        this.s = new fn0(9, this, d53Var, 350L, false);
        this.w = new g0d(new kh3(this, (byte) 27));
        this.y = -1;
        this.G = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.R = true;
        this.d0 = 1.0f;
        this.z0 = new UndoView[2];
        this.c1 = new ArrayList();
        this.h1 = new Paint();
        this.k1 = new ArrayList();
        new Paint(1);
        this.G1 = new TextPaint(1);
        this.W1 = true;
        this.e2 = true;
        this.k2 = true;
        this.r2 = new bf7();
        this.K2 = new ArrayList();
        this.L2 = true;
        this.r3 = new po(null);
        this.I3 = new si3(this, (byte) 0);
        this.J3 = new si3(this, (byte) 1);
        this.N3 = -4;
        this.O3 = true;
        int i2 = this.currentAccount;
        HashMap hashMap = ia4.c;
        if (!hashMap.containsKey(Integer.valueOf(i2))) {
            hashMap.put(Integer.valueOf(i2), new HashSet());
        }
        h64 h64Var = new h64((byte) 11);
        HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(i2));
        pg pgVar = new pg(i2, (byte) 5);
        e7a e7aVar = new e7a();
        e7aVar.d = new LinkedHashMap();
        e7aVar.a = h64Var;
        e7aVar.b = hashSet;
        e7aVar.c = pgVar;
        this.P3 = e7aVar;
        this.Q3 = new kh3(this, (byte) 28);
        this.R3 = true;
        this.T3 = new kh3(this, (byte) 29);
        this.U3 = -1;
        this.d4 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.z4 = arrayList;
        RectF rectF = new RectF();
        this.A4 = rectF;
        RectF rectF2 = new RectF();
        this.B4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        kz4 d = this.glassEngine.d(new nh3(this, (byte) 12));
        this.t4 = d;
        if (i >= 31) {
            mr3 mr3Var = new mr3(false);
            this.q4 = mr3Var;
            nz4 nz4Var = new nz4(d);
            this.s4 = nz4Var;
            nz4Var.f = d;
            nz4Var.d = mr3Var;
            nz4Var.e = -2;
            nz4 nz4Var2 = new nz4(null);
            this.r4 = nz4Var2;
            nz4Var2.f = d;
            nz4Var2.d = mr3Var;
            nz4Var2.e = -3;
            km0Var2 = new km0(nz4Var, nz4Var, nz4Var);
            this.w4 = km0Var2;
            km0Var2.k = true;
            int L = e86.e(262144) ? gm.L(8.0f) : gm.L(48.0f);
            km0Var2.d = L;
            km0Var2.e = L;
            km0Var = new km0(nz4Var2, nz4Var2, nz4Var2);
            this.u4 = km0Var;
            km0Var.k = true;
            int L2 = gm.L(48.0f);
            km0Var.d = L2;
            km0Var.e = L2;
            km0Var3 = new km0(nz4Var2, nz4Var2, nz4Var2);
            this.v4 = km0Var3;
        } else {
            this.q4 = null;
            this.r4 = null;
            this.s4 = null;
            km0Var = new km0(d, d, d);
            this.u4 = km0Var;
            km0Var2 = new km0(d, d, d);
            this.w4 = km0Var2;
            km0Var3 = new km0(d, d, d);
            this.v4 = km0Var3;
        }
        km0 km0Var4 = new km0(d, d, d);
        this.x4 = km0Var4;
        sy4 sy4Var = this.glassEngine;
        km0Var2.j = sy4Var;
        km0Var.j = sy4Var;
        km0Var3.j = sy4Var;
        km0Var4.j = sy4Var;
    }

    public static void C3(yv1 yv1Var, k47 k47Var) {
        if (k47Var == null || !k47Var.r2()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(k47Var.z) ? k47Var.z : k47Var.v;
            CharSequence v1 = gm.v1(charSequence, k47Var.a2, null);
            if (v1 instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) v1;
                do4[] do4VarArr = (do4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), do4.class);
                if (do4VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(do4VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(do4VarArr[0]);
                    for (int i = 1; i < do4VarArr.length; i++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(do4VarArr[i]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(do4VarArr[i]);
                        if (spanStart2 != spanEnd) {
                            if (spanStart2 > spanEnd) {
                                for (int i2 = spanEnd; i2 <= spanStart2; i2++) {
                                    if (Character.isWhitespace(spannableStringBuilder.charAt(i2))) {
                                    }
                                }
                            }
                        }
                        spanEnd = spanStart3;
                    }
                    yv1Var.Kb(k47Var.L1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public static hg3 n3(mk3 mk3Var) {
        jk3 jk3Var = mk3Var.a;
        for (int i = 0; i < jk3Var.getChildCount(); i++) {
            View childAt = jk3Var.getChildAt(i);
            if (childAt instanceof hg3) {
                hg3 hg3Var = (hg3) childAt;
                if (hg3Var.W()) {
                    return hg3Var;
                }
            }
        }
        return null;
    }

    public static void x4(j5 j5Var) {
        SharedPreferences.Editor editor;
        int i = j5Var.a;
        boolean[] zArr = F4;
        if (zArr[i]) {
            return;
        }
        oc7 r1 = oc7.r1(i);
        byte b = 4;
        byte b2 = 1;
        byte b3 = 0;
        if (r1.k2 == 0 && !r1.getUserConfig().T) {
            SharedPreferences sharedPreferences = oc7.r1(r1.currentAccount).W3;
            if (sharedPreferences.contains("EnableGroup")) {
                boolean z = sharedPreferences.getBoolean("EnableGroup", true);
                editor = sharedPreferences.edit();
                if (!z) {
                    editor.putInt("EnableGroup2", ConnectionsManager.DEFAULT_DATACENTER_ID);
                    editor.putInt("EnableChannel2", ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                editor.remove("EnableGroup").commit();
            } else {
                editor = null;
            }
            if (sharedPreferences.contains("EnableAll")) {
                boolean z2 = sharedPreferences.getBoolean("EnableAll", true);
                if (editor == null) {
                    editor = sharedPreferences.edit();
                }
                if (!z2) {
                    editor.putInt("EnableAll2", ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                editor.remove("EnableAll").commit();
            }
            if (editor != null) {
                editor.commit();
            }
            r1.k2 = 4;
            for (int i2 = 0; i2 < 3; i2++) {
                TL_account.getNotifySettings getnotifysettings = new TL_account.getNotifySettings();
                if (i2 == 0) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                } else if (i2 == 1) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                } else {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                }
                r1.getConnectionsManager().sendRequest(getnotifysettings, new fb7(r1, i2, b2));
            }
            r1.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new y67(r1, (byte) 6));
        }
        if (!r1.getUserConfig().U && !r1.l2) {
            r1.l2 = true;
            r1.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new y67(r1, (byte) 14));
        }
        r1.Z2(0, 0, 100, true, null);
        if (r1.s.isEmpty() && !TextUtils.isEmpty(r1.t3)) {
            TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
            tL_help_getRecentMeUrls.referer = r1.t3;
            r1.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new y67(r1, b));
        }
        r1.k3(0, z8c.h(i).f(), false);
        bw2.r(i).f();
        hs6.d0(i).w(false);
        gm.d3(new bi3(j5Var, b3), 200L);
        Iterator it = r1.y3.iterator();
        while (it.hasNext()) {
            hs6.d0(i).d1((String) it.next(), true, true);
        }
        zArr[i] = true;
    }

    public final boolean A2(long j, View view) {
        if (this.n2 && getMessagesController().s2(j)) {
            return false;
        }
        Long valueOf = Long.valueOf(j);
        ArrayList arrayList = this.K2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j));
            if (view instanceof hg3) {
                ((hg3) view).d0(false, true);
            } else if (view instanceof ut8) {
                ((ut8) view).w(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j));
        if (view instanceof hg3) {
            ((hg3) view).d0(true, true);
        } else if (view instanceof ut8) {
            ((ut8) view).w(true, true);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A3(boolean z) {
        boolean z2;
        this.actionBar.x();
        this.K2.clear();
        ee0 ee0Var = this.g1;
        if (ee0Var != null) {
            ee0Var.c(true, 0.0f);
        }
        ak3 ak3Var = this.A0;
        if (ak3Var != null) {
            ak3Var.b(cmb.J8, cmb.H8, cmb.I8, cmb.K8, cmb.c6);
        }
        ValueAnimator valueAnimator = this.x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x3 = null;
        }
        if (this.w3 == 0.0f) {
            return;
        }
        W4(-q3());
        byte b = 0;
        int i = 0;
        while (true) {
            mk3[] mk3VarArr = this.f0;
            if (i >= mk3VarArr.length) {
                break;
            }
            mk3 mk3Var = mk3VarArr[i];
            if (mk3Var != null) {
                mk3Var.a.J0(true);
            }
            i++;
        }
        float max = Math.max(0.0f, gm.L((this.L ? 81 : 0) + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w3, 0.0f);
        this.x3 = ofFloat;
        ofFloat.addUpdateListener(new oh3(this, max, (byte) 1));
        this.x3.addListener(new mj3(this, max, b));
        this.x3.setInterpolator(d53.f);
        this.x3.setDuration(200L);
        this.x3.start();
        this.a1 = false;
        ArrayList arrayList = this.c1;
        if (!arrayList.isEmpty()) {
            int i2 = 0;
            for (int size = arrayList.size(); i2 < size; size = size) {
                ub7 ub7Var = (ub7) arrayList.get(i2);
                qf4.z0(ub7Var, ub7Var.g, ub7Var.b, ub7Var.c, ub7Var.n, ub7Var.m, ub7Var.h, ub7Var.i, ub7Var.j, false, false, true, true, false, this, null);
                i2++;
                arrayList = arrayList;
            }
            arrayList.clear();
        }
        if (this.b1) {
            getMessagesController().r4(this.Y2, 0L, null);
            z2 = 0;
            this.b1 = false;
        } else {
            z2 = 0;
        }
        p5(true);
        if (this.f0 != null) {
            int i3 = z2;
            while (true) {
                mk3[] mk3VarArr2 = this.f0;
                if (i3 >= mk3VarArr2.length) {
                    break;
                }
                mk3VarArr2[i3].d.I = z2;
                i3++;
            }
        }
        int i4 = oc7.s5;
        int i5 = z2;
        if (z) {
            i5 = TLObject.FLAG_13;
        }
        G5(196608 | i5, true);
    }

    public final boolean A4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user == null || m9c.B(user) || m9c.z(user)) {
            return false;
        }
        Boolean bool = tL_requestPeerTypeUser.bot;
        if (bool != null && bool.booleanValue() != user.bot) {
            return false;
        }
        Boolean bool2 = tL_requestPeerTypeUser.premium;
        return bool2 == null || bool2.booleanValue() == user.premium;
    }

    public final void A5(boolean z) {
        boolean z2;
        if (this.m0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().H;
        int size = arrayList.size();
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z2 = false;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            k47 k47Var = (k47) obj;
            if (k47Var.F0() != null && k47Var.F0().size >= 157286400) {
                z2 = true;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().I;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i2);
            i2++;
            k47 k47Var2 = (k47) obj2;
            if (k47Var2.F0() != null && k47Var2.F0().size >= 157286400) {
                z2 = true;
                break;
            }
        }
        if (!getUserConfig().p() && !getMessagesController().H3() && z2 && z) {
            z3 = true;
        }
        this.d.a(z3, true);
    }

    public final void B2(sh4 sh4Var) {
        sj3 sj3Var;
        if (!this.s3 || (sj3Var = this.D0) == null) {
            return;
        }
        ArrayList arrayList = sj3Var.D0;
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (sh4Var.b((sh4) arrayList.get(i))) {
                    return;
                }
            }
        }
        arrayList.add(sh4Var);
        zj3 zj3Var = this.Y;
        zj3Var.G.add(sh4Var);
        zj3Var.J = r1.size() - 1;
        zj3Var.e();
        this.Y.r.getText().clear();
        t5(true, null, null, false, true);
    }

    public final void B3(boolean z) {
        if (this.H3.c()) {
            z = true;
        }
        if (z && this.d2) {
            return;
        }
        this.a4 = z;
        v5(true);
        if (z) {
            hg5 hg5Var = this.q0;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
            hg5 hg5Var2 = this.r0;
            if (hg5Var2 != null) {
                hg5Var2.f(true);
            }
        }
    }

    public final void B4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        byte b = 1;
        my0 i = wi8.i(getParentActivity(), false, 1, null);
        boolean z = getMessagesStorage().M != 0;
        int[] iArr = {z ? R.drawable.msg_markread : 0, gda.m1 ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z ? jb6.M0(2131748439, null) : null, jb6.M0(gda.m1 ? 2131746979 : 2131749081, null)};
        r30 r30Var = new r30(this, b);
        i.M = charSequenceArr;
        i.N = iArr;
        i.L = r30Var;
        showDialog(i);
    }

    public final void B5(TLRPC.User user, boolean z) {
        tm tmVar;
        aj3 aj3Var = this.F0;
        tm tmVar2 = null;
        if (aj3Var != null && (tmVar = aj3Var.b0) != null && aj3Var.r0 != null) {
            Long i = m9c.i(user);
            if (i != null) {
                boolean z2 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                tmVar.j(i.longValue(), z);
                tmVar.m(z2, z);
            } else {
                if (user != null) {
                    oc7.r1(aj3Var.f);
                    if (oc7.C2(user)) {
                        if (aj3Var.O0 == null) {
                            aj3Var.O0 = aj3Var.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                            aj3Var.O0 = new bh3(gm.L(18.0f), gm.L(18.0f), aj3Var.O0);
                        }
                        Drawable drawable = aj3Var.O0;
                        int i2 = cmb.pi;
                        nk3 nk3Var = aj3Var.f0;
                        anb.x(aj3Var, drawable, i2, nk3Var != null ? nk3Var.getResourceProvider() : null, PorterDuff.Mode.MULTIPLY);
                        tmVar.g(aj3Var.O0, z);
                        tmVar.m(false, z);
                    }
                }
                tmVar.g(null, z);
                tmVar.m(false, z);
            }
            tmVar.k(Integer.valueOf(aj3Var.f(cmb.pi)));
            aj3Var.a0.invalidate();
        }
        if (this.F3 == null || this.actionBar == null) {
            return;
        }
        Long i3 = m9c.i(user);
        this.D3 = null;
        if (i3 != null) {
            boolean z3 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.F3.j(i3.longValue(), z);
            this.F3.m(z3, z);
            if (z3) {
                this.D3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new mh3(this, (byte) 1));
            vz9.s(this.currentAccount);
        } else {
            if (user != null) {
                oc7.r1(this.currentAccount);
                if (oc7.C2(user)) {
                    if (this.M3 == null) {
                        this.M3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.M3 = new qj3(gm.L(18.0f), gm.L(18.0f), this.M3);
                    }
                    Drawable drawable2 = this.M3;
                    int themedColor = getThemedColor(cmb.pi);
                    this.D4 = themedColor;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    this.F3.g(this.M3, z);
                    this.F3.m(false, z);
                    this.actionBar.setRightDrawableOnClick(new mh3(this, (byte) 2));
                    vz9.s(this.currentAccount);
                }
            }
            this.F3.g(null, z);
            this.F3.m(false, z);
            this.actionBar.setRightDrawableOnClick(null);
        }
        tm tmVar3 = this.F3;
        int i4 = cmb.pi;
        tmVar3.k(Integer.valueOf(getThemedColor(i4)));
        yn ynVar = this.G3;
        if (ynVar != null) {
            ynVar.setColor(getThemedColor(i4));
        }
        fj3 fj3Var = this.N0;
        if (fj3Var == null || !(fj3Var.getContentView() instanceof vz9)) {
            return;
        }
        lka titleTextView = this.actionBar.getTitleTextView();
        vz9 vz9Var = (vz9) this.N0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            tm tmVar4 = this.F3;
            if (rightDrawable == tmVar4) {
                tmVar2 = tmVar4;
            }
        }
        vz9Var.y(tmVar2, titleTextView);
    }

    @Override // el4
    public final List C() {
        return Arrays.asList(new dl4(jb6.M0(2131751585, null)), new dl4(jb6.M0(2131752013, null), new kh3(this, (byte) 23)), new dl4(jb6.M0(2131751586, null), new kh3(this, (byte) 24)));
    }

    public final void C2(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            byte b = 1;
            if (this.Y2 == 0 && this.a3 == 0 && Build.VERSION.SDK_INT >= 33 && wn7.E0(parentActivity)) {
                if (z) {
                    showDialog(new wn7(parentActivity, !use.a(), new wh3(parentActivity, b)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            byte b2 = 0;
            if (getUserConfig().V && this.W1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z) {
                    he heVar = ik.v(parentActivity, new ci3(this, b2)).a;
                    this.V1 = heVar;
                    showDialog(heVar);
                    return;
                } else {
                    arrayList.add("android.permission.READ_CONTACTS");
                    arrayList.add("android.permission.WRITE_CONTACTS");
                    arrayList.add("android.permission.GET_ACCOUNTS");
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            } else if ((i <= 28 || e21.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (!arrayList.isEmpty()) {
                try {
                    parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
                } catch (Exception unused) {
                }
            } else if (this.B0) {
                this.B0 = false;
                e5();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x00c6, code lost:
    
        if (r2.megagroup == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00d5, code lost:
    
        if (r1 == null) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00d7, code lost:
    
        r14 = -r1.id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x00d3, code lost:
    
        if (r1.megagroup == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C4(View view, int i, q59 q59Var) {
        q59 q59Var2;
        long j;
        boolean z;
        int i2;
        int i3;
        int i4;
        k47 k47Var;
        long j2;
        long j3;
        ov9 ov9Var;
        dj3 dj3Var;
        k47 k47Var2;
        long j4;
        int i5;
        long E;
        long j5;
        long j6;
        TLRPC.Chat L0;
        boolean z2;
        int i6;
        boolean z3;
        sj3 sj3Var;
        Object J;
        int indexOf;
        long j7;
        int i7;
        if (getParentActivity() != null) {
            boolean z4 = q59Var instanceof zk3;
            if (z4) {
                zk3 zk3Var = (zk3) q59Var;
                int i8 = zk3Var.h;
                if (i8 == 7 || i8 == 8) {
                    ub7 ub7Var = getMessagesController().N[i8 == 7 ? (char) 0 : (char) 1];
                    if (ub7Var != null) {
                        i4 = ub7Var.a;
                        J = zk3Var.J(i);
                        if (this.E2 == null && zk3Var.n && q59Var.d(i) == 21) {
                            this.E2.s(this);
                            return;
                        }
                        if (J instanceof TLRPC.User) {
                            if (J instanceof TLRPC.Chat) {
                                j7 = ((TLRPC.Chat) J).id;
                            } else if (J instanceof TLRPC.Dialog) {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                                i7 = dialog.folder_id;
                                if (dialog instanceof TLRPC.TL_dialogFolder) {
                                    if (this.actionBar.z(null)) {
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                    presentFragment(new nk3(bundle));
                                    return;
                                }
                                j3 = dialog.id;
                                if (this.actionBar.z(null)) {
                                    h5(j3, view);
                                    return;
                                }
                                q59Var2 = q59Var;
                                i2 = i7;
                                z = false;
                                i3 = 0;
                                k47Var = null;
                                j2 = 0;
                                j = 0;
                            } else if (J instanceof TLRPC.TL_recentMeUrlChat) {
                                j7 = ((TLRPC.TL_recentMeUrlChat) J).chat_id;
                            } else if (J instanceof TLRPC.TL_recentMeUrlUser) {
                                j3 = ((TLRPC.TL_recentMeUrlUser) J).user_id;
                            } else {
                                if (!(J instanceof TLRPC.TL_recentMeUrlChatInvite)) {
                                    if (J instanceof TLRPC.TL_recentMeUrlStickerSet) {
                                        TLRPC.StickerSet stickerSet = ((TLRPC.TL_recentMeUrlStickerSet) J).set.set;
                                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                        tL_inputStickerSetID.id = stickerSet.id;
                                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                                        showDialog(new x2b(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                        return;
                                    }
                                    return;
                                }
                                TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) J;
                                q59Var2 = q59Var;
                                TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                                TLRPC.Chat chat = chatInvite.chat;
                                if (chat == null) {
                                    if (chatInvite.channel) {
                                    }
                                    String str = tL_recentMeUrlChatInvite.url;
                                    indexOf = str.indexOf(47);
                                    if (indexOf > 0) {
                                        str = str.substring(indexOf + 1);
                                    }
                                    showDialog(new ew5(getParentActivity(), chatInvite, str, this, null));
                                    return;
                                }
                                if (sd2.T(chat)) {
                                    chat = chatInvite.chat;
                                }
                                String str2 = tL_recentMeUrlChatInvite.url;
                                indexOf = str2.indexOf(47);
                                if (indexOf > 0) {
                                }
                                showDialog(new ew5(getParentActivity(), chatInvite, str2, this, null));
                                return;
                                i7 = 0;
                                i2 = i7;
                                z = false;
                                i3 = 0;
                                k47Var = null;
                                j2 = 0;
                                j = 0;
                            }
                            j3 = -j7;
                        } else {
                            j3 = ((TLRPC.User) J).id;
                        }
                        q59Var2 = q59Var;
                        i7 = 0;
                        i2 = i7;
                        z = false;
                        i3 = 0;
                        k47Var = null;
                        j2 = 0;
                        j = 0;
                    }
                }
                i4 = 0;
                J = zk3Var.J(i);
                if (this.E2 == null) {
                }
                if (J instanceof TLRPC.User) {
                }
                q59Var2 = q59Var;
                i7 = 0;
                i2 = i7;
                z = false;
                i3 = 0;
                k47Var = null;
                j2 = 0;
                j = 0;
            } else {
                q59Var2 = q59Var;
                sj3 sj3Var2 = this.D0;
                if (sj3Var2 == null || q59Var2 != (ov9Var = sj3Var2.e0)) {
                    j = 0;
                    z = false;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    k47Var = null;
                    j2 = 0;
                    j3 = 0;
                } else {
                    Object I = ov9Var.I(i);
                    z = this.D0.e0.N(i);
                    if (I instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) I;
                        E = user.id;
                        if (!this.n2) {
                            this.Y1 = E;
                            this.Z1 = user;
                        }
                    } else if (I instanceof TLRPC.Chat) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) I;
                        E = -chat2.id;
                        if (!this.n2) {
                            this.Y1 = E;
                            this.Z1 = chat2;
                        }
                    } else if (I instanceof TLRPC.EncryptedChat) {
                        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) I;
                        E = pg3.E(encryptedChat.id);
                        if (!this.n2) {
                            this.Y1 = E;
                            this.Z1 = encryptedChat;
                        }
                    } else {
                        if (I instanceof k47) {
                            k47Var2 = (k47) I;
                            long B0 = k47.B0(k47Var2.k);
                            int e1 = k47Var2.e1();
                            j = 0;
                            j4 = sd2.c0(getMessagesController().L0(Long.valueOf(-B0))) ? k47.b2(k47Var2.K1, k47Var2.k, true, false) : 0L;
                            sj3 sj3Var3 = this.D0;
                            if (sj3Var3 != null) {
                                ov9 ov9Var2 = sj3Var3.e0;
                                ov9Var2.k0.a(ov9Var2.a0);
                            }
                            i5 = e1;
                            j3 = B0;
                        } else {
                            j = 0;
                            if (I instanceof String) {
                                String str3 = (String) I;
                                sj3 sj3Var4 = this.D0;
                                if (sj3Var4 != null && !sj3Var4.e0.K.isEmpty()) {
                                    this.Y.r.setText(str3);
                                    this.Y.r.setSelection(str3.length());
                                } else if (!str3.equals("section")) {
                                    ml7 ml7Var = new ml7(this, getParentActivity());
                                    ml7Var.H0(str3, true);
                                    ml7Var.show();
                                }
                            } else if (I instanceof yv2) {
                                yv2 yv2Var = (yv2) I;
                                ik.u(this, yv2Var.i, yv2Var.j, (String) yv2Var.e.get(0));
                            } else if ((I instanceof TLRPC.TL_forumTopic) && (dj3Var = this.H3) != null && (dj3Var.getFragment() instanceof sxb)) {
                                long j8 = -((sxb) this.H3.getFragment()).a;
                                long j9 = ((TLRPC.TL_forumTopic) I).id;
                                j3 = j8;
                                k47Var2 = null;
                                j4 = j9;
                                i5 = 0;
                            }
                            i5 = 0;
                            k47Var2 = null;
                            j4 = 0;
                            j3 = 0;
                        }
                        if (j3 == j && this.actionBar.y()) {
                            if (this.actionBar.z("search_dialogs_action_mode") && i5 == 0 && !z) {
                                h5(j3, view);
                                return;
                            }
                            return;
                        }
                        i3 = i5;
                        j2 = j4;
                        k47Var = k47Var2;
                        i2 = 0;
                        i4 = 0;
                    }
                    i5 = 0;
                    k47Var2 = null;
                    j3 = E;
                    j4 = 0;
                    j = 0;
                    if (j3 == j) {
                    }
                    i3 = i5;
                    j2 = j4;
                    k47Var = k47Var2;
                    i2 = 0;
                    i4 = 0;
                }
            }
            if (j3 != j) {
                if (this.n2) {
                    if (H5(j3)) {
                        if ((!getMessagesController().s2(j3) && !getMessagesController().m2(j3)) || G3(j3)) {
                            ArrayList arrayList = this.K2;
                            if (!arrayList.isEmpty() || (this.T0 == 3 && this.h2 != null)) {
                                if (arrayList.contains(Long.valueOf(j3)) || K2(j3)) {
                                    boolean A2 = A2(j3, view);
                                    sj3 sj3Var5 = this.D0;
                                    if (sj3Var5 != null && q59Var2 == sj3Var5.e0) {
                                        this.actionBar.o(true);
                                        m3(j3, A2);
                                    }
                                    y5();
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.o2 && getMessagesController().m2(j3)) {
                            Bundle bundle2 = new Bundle(this.arguments);
                            bundle2.putLong("community_id", -j3);
                            nk3 nk3Var = new nk3(bundle2);
                            nk3Var.Z2 = this;
                            nk3Var.E2 = this.E2;
                            presentFragment(nk3Var);
                            return;
                        }
                        if (!this.o2 || ((!getMessagesController().s2(j3) || G3(j3)) && !getMessagesController().z2(j3))) {
                            k3(j3, 0L, true, null);
                            return;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", -j3);
                        bundle3.putBoolean("for_select", true);
                        bundle3.putBoolean("forward_to", true);
                        bundle3.putBoolean("bot_share_to", this.T0 == 1);
                        bundle3.putBoolean("quote", this.P0);
                        bundle3.putBoolean("reply_to", this.O0);
                        sxb sxbVar = new sxb(bundle3);
                        sxbVar.M0 = this;
                        presentFragment(sxbVar);
                        return;
                    }
                    return;
                }
                Bundle bundle4 = new Bundle();
                if (pg3.B(j3)) {
                    j5 = j2;
                    bundle4.putInt("enc_id", (int) (j3 & 4294967295L));
                } else {
                    j5 = j2;
                    if (pg3.D(j3)) {
                        bundle4.putLong("user_id", j3);
                    } else {
                        if (i3 == 0 || (L0 = getMessagesController().L0(Long.valueOf(-j3))) == null || L0.migrated_to == null) {
                            j6 = j3;
                        } else {
                            bundle4.putLong("migrated_to", j3);
                            j6 = -L0.migrated_to.channel_id;
                        }
                        bundle4.putLong("chat_id", -j6);
                    }
                }
                if (i3 != 0) {
                    bundle4.putInt("message_id", i3);
                } else if (z) {
                    TLObject tLObject = this.Z1;
                    if (tLObject != null) {
                        sj3 sj3Var6 = this.D0;
                        if (sj3Var6 != null) {
                            sj3Var6.e0.Q(this.Y1, tLObject);
                        }
                        this.Z1 = null;
                    }
                } else {
                    f3();
                }
                boolean z5 = (jb6.a0 || this.l2 || (gm.O1() && i2 != 0) || !e86.e(64) || this.a3 != j) ? false : true;
                bundle4.putInt("dialog_folder_id", i2);
                bundle4.putInt("dialog_filter_id", i4);
                if (gm.O1() && ((!getMessagesController().s2(j3) || !z5) && this.r2.a == j3 && ((sj3Var = this.D0) == null || q59Var2 != sj3Var.e0))) {
                    if (getParentActivity() instanceof LaunchActivity) {
                        LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                        List fragmentStack = launchActivity.r0.getFragmentStack();
                        if (fragmentStack.isEmpty()) {
                            return;
                        }
                        if (fragmentStack.size() == 1 && (aq1.m(1, fragmentStack) instanceof yv1)) {
                            ((yv1) aq1.m(1, fragmentStack)).ja();
                            return;
                        }
                        if (fragmentStack.size() == 2) {
                            launchActivity.r0.j(true, false);
                            return;
                        } else {
                            if (getParentActivity() instanceof LaunchActivity) {
                                d dVar = (d) fragmentStack.get(0);
                                fragmentStack.clear();
                                fragmentStack.add(dVar);
                                launchActivity.r0.W(true, true);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                sj3 sj3Var7 = this.D0;
                if (sj3Var7 != null && sj3Var7.B0) {
                    sj3Var7.R(false);
                }
                if (j3 == getUserConfig().e() && getMessagesController().P3) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putLong("dialog_id", z8c.h(this.currentAccount).e());
                    bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                    bundle5.putInt("start_from", 11);
                    fha fhaVar = this.E0;
                    if (fhaVar == null) {
                        fhaVar = new fha(this);
                        this.E0 = fhaVar;
                    }
                    presentFragment(new cm6(bundle5, fhaVar));
                    return;
                }
                if (this.p2 != null) {
                    if (getMessagesController().A(bundle4, this, null, null)) {
                        getNotificationCenter().k(nm7.s, new Object[0]);
                        yv1 yv1Var = new yv1(bundle4);
                        C3(yv1Var, k47Var);
                        presentFragment(yv1Var);
                        return;
                    }
                    return;
                }
                this.B3 = true;
                if (getMessagesController().A(bundle4, this, null, null)) {
                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(-j3));
                    TLRPC.Dialog R0 = getMessagesController().R0(j3);
                    boolean V = sd2.V(L02);
                    boolean z6 = R0 != null && R0.view_forum_as_messages;
                    if (this.a3 == j || L02 == null) {
                        z2 = z6;
                        i6 = 0;
                    } else {
                        z2 = z6;
                        i6 = yp2.b(this.currentAccount, -L02.id);
                    }
                    if (i6 == 3) {
                        showDialog(new ew5(getParentActivity(), L02, null, this, this.resourceProvider));
                        return;
                    }
                    if (i6 == 4) {
                        ts2.u(null, V ? 2131751867 : 2131751864, c41.b0(this), R.raw.e_hand_2, 36);
                        return;
                    }
                    if (L02 == null || !(((z3 = L02.monoforum) || L02.forum) && j5 == j)) {
                        if (sd2.Y(L02)) {
                            Bundle bundle6 = new Bundle();
                            bundle6.putLong("community_id", L02.id);
                            presentFragment(new nk3(bundle6));
                            return;
                        }
                        yv1 yv1Var2 = new yv1(bundle4);
                        if (j5 != j) {
                            no4.a(yv1Var2, bf7.a(j3, j5));
                        }
                        if (z4 && pg3.D(j3) && getMessagesController().R.f(j3) == null) {
                            hs6 mediaDataController = getMediaDataController();
                            TLRPC.Document document = mediaDataController.z0;
                            mediaDataController.o1();
                            if (document != null) {
                                yv1Var2.Y9 = document;
                                yv1Var2.Z9 = true;
                            }
                        }
                        if (gm.O1()) {
                            dj3 dj3Var2 = this.H3;
                            if (dj3Var2.a != null) {
                                dj3Var2.a();
                            }
                        }
                        C3(yv1Var2, k47Var);
                        presentFragment(yv1Var2);
                        return;
                    }
                    if (z3) {
                        bundle4.putInt("chatMode", 8);
                        bundle4.putBoolean("isSubscriberSuggestions", !sd2.A(this.currentAccount, L02, 24));
                        yv1 yv1Var3 = new yv1(bundle4);
                        C3(yv1Var3, k47Var);
                        presentFragment(yv1Var3);
                        return;
                    }
                    if (sd2.a(L02)) {
                        yv1 yv1Var4 = new yv1(bundle4);
                        no4.a(yv1Var4, bf7.a(-L02.id, getMessagesController().X3.getLong(kt6.n(L02.id, "forumlasttopic"), 1L)));
                        presentFragment(yv1Var4);
                        return;
                    }
                    if (!e86.e(64) || this.a3 != j) {
                        if (!z2) {
                            presentFragment(new sxb(bundle4));
                            return;
                        }
                        yv1 yv1Var5 = new yv1(bundle4);
                        C3(yv1Var5, k47Var);
                        presentFragment(yv1Var5);
                        return;
                    }
                    if (!z5) {
                        if (!z2) {
                            presentFragment(new sxb(bundle4));
                            return;
                        }
                        yv1 yv1Var6 = new yv1(bundle4);
                        C3(yv1Var6, k47Var);
                        presentFragment(yv1Var6);
                        return;
                    }
                    if (this.l2) {
                        return;
                    }
                    if (z2) {
                        yv1 yv1Var7 = new yv1(bundle4);
                        C3(yv1Var7, k47Var);
                        presentFragment(yv1Var7);
                        return;
                    }
                    dj3 dj3Var3 = this.H3;
                    kj3 kj3Var = dj3Var3.a;
                    if (kj3Var == null || (-kj3Var.a) != j3) {
                        jk3 jk3Var = this.f0[0].a;
                        jk3Var.w3 = 0.0f;
                        jk3Var.x3 = jk3Var.v3;
                        jk3Var.y3 = jk3Var.p3 != 0.0f;
                        kj3 kj3Var2 = new kj3(bundle4);
                        kj3Var2.N0 = this;
                        final dj3 dj3Var4 = this.H3;
                        tk5 parentLayout = getParentLayout();
                        po poVar = dj3Var4.n;
                        if (!dj3Var4.r) {
                            dj3Var4.x = parentLayout;
                            kj3Var2.onFragmentCreate();
                            kj3Var2.setInPreviewMode(true);
                            kj3Var2.setParentLayout(parentLayout);
                            View performCreateView = kj3Var2.performCreateView(dj3Var4.getContext());
                            kj3Var2.onResume();
                            dj3Var4.b = performCreateView;
                            dj3Var4.addView(performCreateView);
                            final kj3 kj3Var3 = dj3Var4.a;
                            bdb bdbVar = kj3Var2.e;
                            dj3Var4.c = bdbVar;
                            dj3Var4.addView(bdbVar);
                            dj3Var4.a = kj3Var2;
                            el9.R = j;
                            el9.R = -kj3Var2.a;
                            if (kj3Var2.getActionBar() != null) {
                                a actionBar = kj3Var2.getActionBar();
                                dj3Var4.d = actionBar;
                                dj3Var4.addView(actionBar);
                                dj3Var4.d.f1 = new kf9(dj3Var4, (byte) 7);
                            }
                            if (kj3Var3 != null) {
                                final kj3 kj3Var4 = dj3Var4.a;
                                if (gda.c()) {
                                    zna znaVar = dj3Var4.y;
                                    if (znaVar != null) {
                                        znaVar.d();
                                    }
                                    kj3Var4.onTransitionAnimationStart(true, false);
                                    dj3Var4.F = kj3Var3;
                                    dj3Var4.w = true;
                                    poVar.d();
                                    zna znaVar2 = new zna(new xk4(0.0f));
                                    dj3Var4.y = znaVar2;
                                    znaVar2.m = aq1.j(1000.0f, 400.0f, 1.0f);
                                    el9.f(kj3Var3, kj3Var4, 0.0f);
                                    dj3Var4.y.b(new h20(dj3Var4, (byte) 13));
                                    dj3Var4.y.a(new ht3() { // from class: cl9
                                        @Override // ht3
                                        public final void a(zna znaVar3, boolean z7, float f, float f2) {
                                            dj3 dj3Var5 = dj3.this;
                                            if (dj3Var5.y == null) {
                                                return;
                                            }
                                            dj3Var5.y = null;
                                            kj3 kj3Var5 = kj3Var4;
                                            kj3Var5.onTransitionAnimationEnd(true, false);
                                            kj3 kj3Var6 = kj3Var3;
                                            el9.f(kj3Var6, kj3Var5, 1.0f);
                                            dj3Var5.w = false;
                                            dj3Var5.F = null;
                                            kj3Var6.onPause();
                                            kj3Var6.onFragmentDestroy();
                                            dj3Var5.removeView(kj3Var6.getFragmentView());
                                            dj3Var5.removeView(kj3Var6.getActionBar());
                                            dj3Var5.n.e();
                                        }
                                    });
                                    dj3Var4.y.h();
                                } else {
                                    kj3Var4.onTransitionAnimationStart(true, false);
                                    kj3Var4.onTransitionAnimationEnd(true, false);
                                    el9.f(kj3Var3, kj3Var4, 1.0f);
                                    dj3Var4.w = false;
                                    dj3Var4.F = null;
                                    kj3Var3.onPause();
                                    kj3Var3.onFragmentDestroy();
                                    dj3Var4.removeView(kj3Var3.getFragmentView());
                                    dj3Var4.removeView(kj3Var3.getActionBar());
                                    poVar.e();
                                }
                            } else if (!dj3Var4.f) {
                                dj3Var4.f = true;
                                if (gda.c()) {
                                    poVar.d();
                                    dj3Var4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    dj3Var4.e = 0.0f;
                                    dj3Var4.e(true);
                                    dj3Var4.g();
                                    kj3Var2.onTransitionAnimationStart(true, false);
                                    dj3Var4.h.addUpdateListener(new p29(dj3Var4, (byte) 6));
                                    dj3Var4.h.addListener(new ic8((Object) dj3Var4, (Object) kj3Var2, (byte) 11));
                                    dj3Var4.h.setDuration(250L);
                                    dj3Var4.h.setInterpolator(d53.f);
                                    dj3Var4.h.setStartDelay(gda.o() >= 2 ? 50L : 150L);
                                    dj3Var4.h.start();
                                } else {
                                    dj3Var4.e(true);
                                    kj3Var2.onTransitionAnimationStart(true, false);
                                    kj3Var2.onTransitionAnimationEnd(true, false);
                                    dj3Var4.e = 1.0f;
                                    dj3Var4.g();
                                    dj3Var4.d(false);
                                }
                            }
                            kj3Var2.setPreviewDelegate(new yf9(dj3Var4, (byte) 7));
                            WeakHashMap weakHashMap = kfc.a;
                            afc.c(dj3Var4);
                        }
                    } else {
                        dj3Var3.a();
                    }
                    sj3 sj3Var8 = this.D0;
                    if (sj3Var8 != null) {
                        sj3Var8.S();
                    }
                }
            }
        }
    }

    public final void C5() {
        hg5 hg5Var;
        boolean e5 = getMessagesController().e5();
        if (this.R3 != e5) {
            u5();
            if (!this.R3 && e5 && (hg5Var = this.q0) != null) {
                hg5Var.v();
            }
            this.R3 = e5;
        }
        wp4 wp4Var = this.u0;
        if (wp4Var == null) {
            return;
        }
        if (this.T0 == 10) {
            wp4Var.setImageResource(R.drawable.floating_check);
            this.u0.setContentDescription(jb6.M0(2131751291, null));
        } else {
            wp4Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.u0.setContentDescription(jb6.M0(2131748027, null));
        }
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 1) {
            Y2();
            a3();
            d3();
            Q2();
            b3();
            zj3 zj3Var = this.Y;
            fn0 fn0Var = this.b;
            zj3Var.setBlurredBackgroundVisibility(fn0Var.e);
            float a = aie.a(fn0Var.e);
            bf0 bf0Var = this.d3;
            if (bf0Var != null) {
                bf0Var.setScaleX(a);
                this.d3.setScaleY(a);
                this.d3.setAlpha(a);
                this.d3.setVisibility(a > 0.0f ? 0 : 8);
            }
            if (this.w0 != null) {
                float R1 = gm.R1(0.9f, 1.0f, a);
                this.w0.setScaleX(R1);
                this.w0.setScaleY(R1);
                this.w0.setAlpha(a);
                this.w0.setVisibility(a > 0.0f ? 0 : 8);
                this.x0.setAlpha(a);
                this.x0.setVisibility(a > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i == 2) {
            Y2();
            a3();
            return;
        }
        if (i == 3) {
            W2();
            return;
        }
        if (i == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (i == 5) {
            V2();
            return;
        }
        if (i == 6) {
            Y2();
            a3();
        } else {
            if (i == 7) {
                R2();
                return;
            }
            if (i == 8) {
                Q2();
                b3();
            } else if (i == 9) {
                b3();
            }
        }
    }

    public final void D2(CharSequence charSequence) {
        if (this.D1 != null) {
            if (this.F2 == null && this.G2 == null && this.H2 == null) {
                return;
            }
            byte b = 0;
            if (this.I2 == null) {
                bda bdaVar = new bda(getParentActivity(), getResourceProvider());
                this.I2 = bdaVar;
                bdaVar.setLayoutClickListener(new mh3(this, b));
                this.I2.setOnModeChangeListener(new nh3(this, b));
                ti3 ti3Var = this.D1;
                bda bdaVar2 = this.I2;
                if (bdaVar2 == null) {
                    ti3Var.getClass();
                } else {
                    ti3Var.w2 = bdaVar2;
                    ti3Var.addView(bdaVar2, 0, qoe.e(-1, 48, 51));
                    ti3Var.W3 = false;
                    ti3Var.P();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.I2.getLayoutParams();
                layoutParams.rightMargin = -this.D1.getPaddingRight();
                this.I2.setLayoutParams(layoutParams);
            }
            if (z3()) {
                this.I2.i(this.currentAccount, this.F2);
            } else {
                String str = this.G2;
                if (str != null) {
                    bda bdaVar3 = this.I2;
                    bdaVar3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        bdaVar3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.H2;
                    if (charSequence2 != null) {
                        bda bdaVar4 = this.I2;
                        bdaVar4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            bdaVar4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.D1.setFieldText(charSequence);
            }
            this.D1.setOverrideHint(jb6.M0(z3() ? 2131754451 : 2131745196, null));
            R2();
            if (this.I2.getMode() != 0) {
                this.D1.e2(false, false);
            }
            z5();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D3(int i) {
        mr3 mr3Var;
        if (Build.VERSION.SDK_INT < 31 || (mr3Var = this.q4) == null) {
            return;
        }
        if (iqd.a(i, 4)) {
            int L = gm.L(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.m4) - gm.L(8.0f);
            int L2 = measuredHeight - gm.L(56.0f);
            int L3 = gm.L(this.L ? 81.0f : 0.0f) + gm.L(48.0f) + this.actionBar.getMeasuredHeight();
            ak3 ak3Var = this.A0;
            boolean z = false;
            int measuredHeight2 = L3 + ((ak3Var == null || ak3Var.getVisibility() != 0) ? 0 : this.A0.getMeasuredHeight());
            qk3 qk3Var = this.L1;
            int sumHeightOfAllVisibleChild = measuredHeight2 + ((qk3Var == null || qk3Var.getVisibility() != 0) ? 0 : this.L1.getSumHeightOfAllVisibleChild()) + ((int) this.O);
            int measuredHeight3 = this.actionBar.getMeasuredHeight();
            this.A4.set(0.0f, -L, this.fragmentView.getMeasuredWidth(), gm.U1(this.b.e, sumHeightOfAllVisibleChild, gm.L(30.0f) + measuredHeight3 + (this.a0 != null ? r8.getMeasuredHeight() : 0)) + L);
            boolean z2 = this.X;
            RectF rectF = this.B4;
            if (z2) {
                rectF.set(0.0f, L2, this.fragmentView.getMeasuredWidth(), measuredHeight);
                rectF.inset(0.0f, e86.e(262144) ? 0.0f : -gm.L(48.0f));
            } else {
                if (this.D1 != null && this.A1 != null) {
                    rectF.set(0.0f, this.fragmentView.getMeasuredHeight() - F2(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                    rectF.inset(0.0f, e86.e(262144) ? 0.0f : -gm.L(48.0f));
                }
                mr3Var.g(z ? 2 : 1, this.z4);
            }
            z = true;
            mr3Var.g(z ? 2 : 1, this.z4);
        }
        mr3Var.e(this.y4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final boolean D4(View view, int i, float f, q59 q59Var) {
        ov9 ov9Var;
        ov9 ov9Var2;
        long E;
        if (getParentActivity() != null && !(view instanceof nl3) && q59Var.d(i) != 21) {
            if (!this.actionBar.y() && !gm.O1() && !this.n2 && (view instanceof hg3)) {
                hg3 hg3Var = (hg3) view;
                if (!getMessagesController().s2(hg3Var.getDialogId()) && !this.H3.c() && hg3Var.Z(f)) {
                    return c5(hg3Var);
                }
            }
            dj3 dj3Var = this.H3;
            if (dj3Var == null || !dj3Var.c()) {
                sj3 sj3Var = this.D0;
                char c = 1;
                if (sj3Var != null && q59Var == (ov9Var2 = sj3Var.e0)) {
                    Object I = ov9Var2.I(i);
                    sj3 sj3Var2 = this.D0;
                    if (!sj3Var2.e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = jb6.M0(2131751991, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                heVar.U = jb6.a0("ClearSearchSingleChatAlertText", null, 2131751990, no4.j(this.currentAccount, chat, false));
                            } else {
                                heVar.U = jb6.a0("ClearSearchSingleChatAlertText", null, 2131751990, chat.title);
                            }
                            E = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().n) {
                                heVar.U = jb6.a0("ClearSearchSingleChatAlertText", null, 2131751990, jb6.M0(2131745635, null));
                            } else {
                                heVar.U = jb6.a0("ClearSearchSingleUserAlertText", null, 2131751988, bw2.m(0, user.first_name, user.last_name));
                            }
                            E = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            heVar.U = jb6.a0("ClearSearchSingleUserAlertText", null, 2131751988, bw2.m(0, W1.first_name, W1.last_name));
                            E = pg3.E(r14.id);
                        }
                        alertDialog$Builder.j(jb6.M0(2131751992, null), new d12((Object) this, E, (byte) (c == true ? 1 : 0)));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        showDialog(heVar);
                        TextView textView = (TextView) heVar.c(-1);
                        if (textView != null) {
                            anb.X(textView, cmb.p7, getResourceProvider());
                        }
                        return true;
                    }
                    sj3Var = sj3Var2;
                }
                if (sj3Var == null || q59Var != (ov9Var = sj3Var.e0)) {
                    Object J = ((zk3) q59Var).J(i);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.n2) {
                            if ((this.T0 == 3 || e3()) && H5(dialog.id)) {
                                if (this.T0 != 1 || !e3() || !this.o2 || !getMessagesController().s2(dialog.id)) {
                                    A2(dialog.id, view);
                                    y5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.T0 == 1);
                                bundle.putBoolean("quote", this.P0);
                                bundle.putBoolean("reply_to", this.O0);
                                sxb sxbVar = new sxb(bundle);
                                sxbVar.M0 = this;
                                presentFragment(sxbVar);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                B4(view);
                                return false;
                            }
                            if (!this.actionBar.y() || !H3(dialog)) {
                                h5(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.n2) {
                        C4(view, i, q59Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof ut8) || ov9Var.N(i)) ? 0L : ((ut8) view).getDialogId();
                    if (dialogId != 0) {
                        h5(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void D5(float f) {
        float f2;
        float f3;
        float i = Utilities.i(this.z1 * 2.0f, 1.0f, 0.0f);
        aj3 aj3Var = this.F0;
        float f4 = (1.0f - this.w3) * f * this.I0;
        float f5 = 1.0f - i;
        aj3Var.setAlpha(f4 * f5);
        if (this.L || this.N) {
            float i2 = Utilities.i((-this.O) / gm.L(81.0f), 1.0f, 0.0f);
            if (this.w3 == 1.0f) {
                i2 = 1.0f;
            }
            float i3 = Utilities.i(i2 / 0.5f, 1.0f, 0.0f);
            this.F0.setClipTop(0);
            if (this.L || !this.N) {
                this.F0.setTranslationY(((this.U / 2.0f) + (Math.max(this.O, -r3()) + this.y3)) - gm.L(8.0f));
                this.F0.l(!this.H3.c(), i2);
                if (this.N) {
                    f2 = 1.0f - i3;
                    this.actionBar.setTranslationY(0.0f);
                } else {
                    f3 = this.I0;
                }
            } else {
                this.F0.setTranslationY((-gm.L(81.0f)) - gm.L(8.0f));
                this.F0.setProgressToCollapse(1.0f);
                f3 = this.I0;
            }
            f2 = 1.0f - f3;
            this.actionBar.setTranslationY(0.0f);
        } else {
            if (this.M) {
                this.F0.setTranslationY((Math.max(this.O, -r3()) + (-gm.L(81.0f))) - gm.L(8.0f));
                this.F0.setProgressToCollapse(1.0f);
                aj3 aj3Var2 = this.F0;
                aj3Var2.setClipTop((int) (gm.m - aj3Var2.getY()));
            }
            f2 = 1.0f - this.I0;
            this.actionBar.setTranslationY(0.0f);
        }
        float f6 = f2 * f5;
        a aVar = this.actionBar;
        if (f6 == 1.0f) {
            aVar.getTitlesContainer().setScaleY(1.0f);
            this.actionBar.getTitlesContainer().setScaleX(1.0f);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f7 = 1.0f - this.w3;
            this.actionBar.getTitlesContainer().setAlpha(f7);
            this.actionBar.getTitlesContainer().setVisibility(f7 > 0.0f ? 0 : 4);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f7);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f7 <= 0.0f ? 4 : 0);
            return;
        }
        aVar.getTitlesContainer().setPivotY(gm.m);
        this.actionBar.getTitlesContainer().setPivotX(gm.L(20.0f));
        float f8 = (0.6f * f6) + 0.4f;
        this.actionBar.getTitlesContainer().setScaleY(f8);
        this.actionBar.getTitlesContainer().setScaleX(f8);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-gm.L(30.0f));
        this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f8);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f8);
        float f9 = (1.0f - this.w3) * f6;
        this.actionBar.getTitlesContainer().setAlpha(f9);
        this.actionBar.getTitlesContainer().setVisibility(f9 > 0.0f ? 0 : 4);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f9);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f9 <= 0.0f ? 4 : 0);
    }

    public final String E2() {
        ArrayList arrayList = this.K2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return jb6.G(arrayList.size(), "ShareSendToMany", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long longValue = ((Long) obj).longValue();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            if (longValue == getUserConfig().e()) {
                sb.append(jb6.M0(2131745635, null));
            } else {
                int size2 = arrayList.size();
                int i2 = this.currentAccount;
                sb.append(size2 == 1 ? pg3.k(i2, longValue) : pg3.r(i2, longValue));
            }
        }
        return jb6.a0(null, null, 2131745173, sb.toString());
    }

    public final boolean E3() {
        return this.A0 != null && this.T0 == 0 && !this.n2 && this.Y2 == 0 && this.a3 == 0 && getMessagesController().k2();
    }

    public final void E4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (z8c.h(i).o()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new x03((byte) 12));
        bu5 I = bu5.I(this, view);
        if (arrayList.size() > 0) {
            if (I.y() > 0) {
                I.j();
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                int intValue = ((Integer) obj).intValue();
                boolean z = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i3 = cmb.h6;
                Drawable Y = cmb.Y(getThemedColor(i3), 0, 0);
                wmb M = anb.M(i3);
                ylb resourceProvider = getResourceProvider();
                linearLayout.setBackground(Y);
                anb.j(linearLayout, Y, null, M, resourceProvider);
                TLRPC.User f = z8c.h(intValue).f();
                pc0 pc0Var = new pc0((ylb) null);
                pc0Var.q(f);
                yj3 yj3Var = new yj3(this, getParentActivity(), z);
                linearLayout.addView(yj3Var, qoe.t(34, 34, 16, 12, 0, 0, 0));
                bf0 bf0Var = new bf0(getParentActivity());
                if (z) {
                    bf0Var.setScaleX(0.833f);
                    bf0Var.setScaleY(0.833f);
                }
                bf0Var.setRoundRadius(gm.L(16.0f));
                bf0Var.getImageReceiver().d = intValue;
                bf0Var.f(f, pc0Var);
                yj3Var.addView(bf0Var, qoe.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                anb.X(textView, cmb.i5, getResourceProvider());
                textView.setText(m9c.r(f));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, qoe.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new wh((Object) this, intValue, (Object) I, (byte) 7));
                I.q(linearLayout, qoe.o(230, 48));
            }
        }
        ShapeDrawable b0 = cmb.b0(gm.L(24.0f), getThemedColor(cmb.c6));
        b0.getPaint().setShadowLayer(gm.L(6.0f), 0.0f, gm.L(1.0f), cmb.p1(0.15f, -16777216));
        I.z.set(-gm.L(4.0f), -gm.L(4.0f), -gm.L(4.0f), -gm.L(4.0f));
        I.X(b0);
        I.b0(0.0f, -gm.L(4.0f));
        I.W(5);
        I.a0();
    }

    public final void E5(boolean z) {
        a aVar;
        boolean z2;
        h4b v3;
        ArrayList arrayList;
        if (this.F0 == null || this.J != null) {
            return;
        }
        dj3 dj3Var = this.H3;
        if ((dj3Var != null && dj3Var.c()) || this.s3 || (aVar = this.actionBar) == null || aVar.y() || this.n2) {
            return;
        }
        v9b v9bVar = v9b.G2;
        int i = 0;
        if ((v9bVar != null && v9bVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
            z = false;
        }
        boolean z3 = !F3() && v3().H();
        if (this.a3 != 0) {
            z2 = false;
        } else if (F3()) {
            z2 = !v3().h.isEmpty();
        } else {
            z2 = !z3 && (((arrayList = (v3 = v3()).g) != null && arrayList.size() > 0) || v3.I());
            z3 = v3().H();
        }
        this.M = z3;
        boolean z4 = this.H0;
        boolean z5 = z3 || z2;
        this.H0 = z5;
        if (z2 || z5) {
            this.F0.p(z, z5 != z4);
        }
        boolean z6 = this.H0;
        byte b = 2;
        int i2 = 8;
        if (z6 != z4) {
            if (z) {
                ValueAnimator valueAnimator = this.K;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.H0 && !isInPreviewMode()) {
                    this.F0.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I0, this.H0 ? 1.0f : 0.0f);
                this.K = ofFloat;
                ofFloat.addUpdateListener(new af0(this, (byte) 4));
                this.K.addListener(new kh2(this, (byte) 10));
                this.K.setDuration(200L);
                this.K.setInterpolator(d53.f);
                this.K.start();
            } else {
                this.F0.setVisibility((!z6 || isInPreviewMode()) ? 8 : 0);
                this.I0 = this.H0 ? 1.0f : 0.0f;
                View view = this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (z2 != this.N) {
            this.N = z2;
            if (z2) {
                this.F0.l(false, 1.0f);
            }
            if (z && !isInPreviewMode()) {
                this.F0.setVisibility(0);
                float f = -this.O;
                float q3 = z2 ? 0.0f : q3();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.J = ofFloat2;
                ofFloat2.addUpdateListener(new rj3(this, f, z2, q3));
                this.J.addListener(new jj3(this, z2, b));
                this.J.setDuration(200L);
                this.J.setInterpolator(d53.f);
                this.J.start();
                return;
            }
            this.L = z2;
            aj3 aj3Var = this.F0;
            if ((z2 || this.M) && !isInPreviewMode()) {
                i2 = 0;
            }
            aj3Var.setVisibility(i2);
            if (z2) {
                this.A3 = -gm.L(81.0f);
                W4(-q3());
            } else {
                W4(0.0f);
            }
            while (true) {
                mk3[] mk3VarArr = this.f0;
                if (i >= mk3VarArr.length) {
                    break;
                }
                mk3 mk3Var = mk3VarArr[i];
                if (mk3Var != null) {
                    mk3Var.a.requestLayout();
                }
                i++;
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                view2.requestLayout();
                this.fragmentView.invalidate();
            }
        }
    }

    public final int F2() {
        if (this.D1 != null) {
            return (int) (this.A1.getInputBubbleHeight() + this.w.d() + gm.L(9.0f) + gm.L(7.0f) + gm.L(2.0f));
        }
        long j = this.a3;
        int i = this.m4;
        return j != 0 ? gm.L(72.0f) + i : i + this.o4;
    }

    public final boolean F3() {
        return this.Y2 == 1;
    }

    public final void F4() {
        try {
            ((p09) ((pc0) this.O1.h.getImageReceiver().n0).K).C(true);
        } catch (Exception unused) {
        }
        if (this.h4 == null) {
            wn5 wn5Var = new wn5(0, true, true);
            this.h4 = wn5Var;
            wn5Var.I = true;
            wn5Var.a = this;
            wn5Var.b = new wj3(this);
            getMediaDataController().z();
            getMessagesController().h3();
            getMessagesController().k3(this.classGuid, getUserConfig().f(), true);
        }
        TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(z8c.h(this.currentAccount).e()));
        if (W1 == null) {
            W1 = z8c.h(this.currentAccount).f();
        }
        if (W1 == null) {
            return;
        }
        i22 i22Var = this.h4.c;
        if (i22Var != null) {
            i22Var.H0();
        }
        wn5 wn5Var2 = this.h4;
        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
        wn5Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new di3(this, (byte) 12), new rh3(this, (byte) 3), 0);
    }

    public final void F5(int i, boolean z) {
        if (this.A0 == null || this.T0 != 0 || this.n2) {
            return;
        }
        this.U3 = i;
        ub7 x3 = x3();
        this.U3 = -1;
        boolean z2 = false;
        boolean z3 = x3 != null && getMessagesController().S0().size() > 1 && getMessagesController().r2(x3);
        ak3 ak3Var = this.A0;
        if (z && ak3Var.getVisibility() == 0) {
            z2 = true;
        }
        ak3Var.k(z3, z2);
    }

    public final boolean G2() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.K2;
            if (i >= arrayList.size()) {
                return true;
            }
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-((Long) arrayList.get(i)).longValue()));
            if (L0 != null && !sd2.l(L0)) {
                return false;
            }
            i++;
        }
    }

    public final boolean G3(long j) {
        if (j < 0) {
            return false;
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j));
        if (!m9c.w(W1)) {
            return false;
        }
        ArrayList l = oc7.r1(this.currentAccount).g4.l(-W1.id);
        return (l == null || l.isEmpty()) && oc7.r1(this.currentAccount).g4.e(-W1.id);
    }

    public final void G4() {
        if (this.R3) {
            hg5 hg5Var = this.q0;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
            xy n = oc7.r1(this.currentAccount).N1().n();
            if (n != null && n.a(this.currentAccount, 1)) {
                showDialog(new i46(n.b(), this.currentAccount, null, getParentActivity(), this));
                return;
            } else {
                v9b C = v9b.C(getParentActivity(), this.currentAccount);
                C.y = new ui3(this);
                C.Q(null);
                return;
            }
        }
        hg5 hg5Var2 = this.r0;
        if (hg5Var2 != null) {
            if (hg5Var2.W) {
                return;
            } else {
                gm.B2(hg5Var2);
            }
        }
        SpannableStringBuilder N2 = gm.N2(jb6.N0("StoriesPremiumHint2").replace('\n', ' '), cmb.wj, 0, new di3(this, (byte) 5), null);
        hg5 hg5Var3 = new hg5(getParentActivity(), 2);
        hg5Var3.q(8.0f);
        hg5Var3.d = 8000L;
        hg5Var3.j(true);
        hg5Var3.p(true);
        hg5Var3.h = gm.q.x - gm.L(148.0f);
        hg5Var3.t(N2);
        hg5Var3.n(1.0f, -40.0f);
        hg5Var3.i(getThemedColor(cmb.vj));
        this.r0 = hg5Var3;
        hg5Var3.setTranslationY((-this.m4) - this.o4);
        ((ViewGroup) this.fragmentView).addView(this.r0, qoe.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        this.r0.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G5(int i, boolean z) {
        RecyclerView recyclerView;
        int i2;
        int childCount;
        int i3;
        int i4 = 131072;
        if (this.U1) {
            int i5 = oc7.s5;
            if ((i & 131072) == 0) {
                return;
            }
        }
        if (this.isPaused) {
            return;
        }
        int i6 = 0;
        while (i6 < 3) {
            if (i6 == 2) {
                sj3 sj3Var = this.D0;
                recyclerView = sj3Var != null ? sj3Var.b0 : null;
            } else {
                mk3[] mk3VarArr = this.f0;
                if (mk3VarArr != null) {
                    jk3 jk3Var = i6 < mk3VarArr.length ? mk3VarArr[i6].a : null;
                    if (jk3Var != null) {
                        r6 = mk3VarArr[i6].getVisibility() == 0 ? this.f0[i6] : null;
                    }
                    recyclerView = jk3Var;
                }
                i2 = i6;
                i6 = i2 + 1;
                i4 = 131072;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                int i7 = oc7.s5;
                if (((i & 2048) != 0 || i == 0) && r6 != null) {
                    r6.b(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    int i8 = 0;
                    while (i8 < childCount2) {
                        View childAt = recyclerView.getChildAt(i8);
                        boolean z2 = childAt instanceof hg3;
                        ArrayList arrayList = this.K2;
                        if (z2 && (this.D0 == null || recyclerView.getAdapter() != this.D0.e0)) {
                            hg3 hg3Var = (hg3) childAt;
                            int i9 = oc7.s5;
                            if ((i & i4) != 0) {
                                hg3Var.a0(this.actionBar.y(), true);
                                if (this.U1) {
                                    i2 = i6;
                                    i8++;
                                    i6 = i2;
                                    i4 = 131072;
                                }
                            }
                            if ((65536 & i) != 0) {
                                hg3Var.d0(false, (i & TLObject.FLAG_13) != 0);
                            } else {
                                if ((i & 512) == 0) {
                                    i2 = i6;
                                    if (hg3Var.j0(i, z)) {
                                        r6.b(false);
                                        break;
                                    }
                                } else if (this.f0[i6].a() && gm.O1()) {
                                    i2 = i6;
                                    hg3Var.setDialogSelected(hg3Var.getDialogId() == this.r2.a);
                                } else {
                                    i2 = i6;
                                }
                                if (arrayList != null) {
                                    hg3Var.d0(arrayList.contains(Long.valueOf(hg3Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof w8c)) {
                                    ((w8c) childAt).i(i);
                                } else if (childAt instanceof ut8) {
                                    ut8 ut8Var = (ut8) childAt;
                                    ut8Var.y(i);
                                    if (arrayList != null) {
                                        ut8Var.w(arrayList.contains(Long.valueOf(ut8Var.getDialogId())), false);
                                    }
                                }
                                if (!this.U1 && (childAt instanceof r59)) {
                                    r59 r59Var = (r59) childAt;
                                    childCount = r59Var.getChildCount();
                                    for (i3 = 0; i3 < childCount; i3++) {
                                        View childAt2 = r59Var.getChildAt(i3);
                                        if (childAt2 instanceof cg5) {
                                            ((cg5) childAt2).b(i);
                                        }
                                    }
                                }
                                i8++;
                                i6 = i2;
                                i4 = 131072;
                            }
                        }
                        i2 = i6;
                        if (!(childAt instanceof w8c)) {
                        }
                        if (!this.U1) {
                            r59 r59Var2 = (r59) childAt;
                            childCount = r59Var2.getChildCount();
                            while (i3 < childCount) {
                            }
                        }
                        i8++;
                        i6 = i2;
                        i4 = 131072;
                    }
                }
            }
            i2 = i6;
            i6 = i2 + 1;
            i4 = 131072;
        }
    }

    public final void H2() {
        int themedColor;
        ai8 ai8Var;
        pi3 pi3Var;
        ov9 ov9Var;
        smb smbVar;
        sj3 sj3Var = this.D0;
        if (sj3Var != null && (ov9Var = sj3Var.e0) != null && (smbVar = ov9Var.l0) != null) {
            int childCount = smbVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = smbVar.getChildAt(i);
                if (childAt instanceof cg5) {
                    cg5 cg5Var = (cg5) childAt;
                    pc0 pc0Var = cg5Var.c;
                    boolean D = pg3.D(cg5Var.f);
                    int i2 = cg5Var.h;
                    if (D) {
                        TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(cg5Var.f));
                        cg5Var.e = W1;
                        pc0Var.q(W1);
                    } else {
                        pc0Var.p(oc7.r1(i2).L0(Long.valueOf(-cg5Var.f)));
                        cg5Var.e = null;
                    }
                    cg5Var.c(true);
                }
            }
        }
        if (this.f0 != null) {
            int i3 = 0;
            while (true) {
                mk3[] mk3VarArr = this.f0;
                if (i3 >= mk3VarArr.length) {
                    break;
                }
                mk3 mk3Var = mk3VarArr[i3];
                if (mk3Var != null && (pi3Var = mk3Var.n) != null) {
                    pi3Var.h();
                }
                i3++;
            }
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.I(getThemedColor(cmb.F8), true);
            this.actionBar.J(getThemedColor(cmb.D8), false, true);
            this.actionBar.J(getThemedColor(cmb.E8), true, true);
            this.actionBar.K(getThemedColor(cmb.H5), true);
            this.actionBar.updateColors();
        }
        if (this.F3 != null) {
            int themedColor2 = getThemedColor(cmb.pi);
            Drawable drawable = this.M3;
            if (drawable != null && themedColor2 != this.D4) {
                this.D4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            tm tmVar = this.F3;
            if (tmVar != null) {
                tmVar.k(Integer.valueOf(themedColor2));
            }
            yn ynVar = this.G3;
            if (ynVar != null) {
                ynVar.setColor(themedColor2);
            }
        }
        nl3 nl3Var = this.O1;
        if (nl3Var != null) {
            cmb.F1(nl3Var.getBackground(), cmb.w0(null, cmb.h6, false), true);
        }
        r7 r7Var = this.n0;
        if (r7Var != null) {
            r7Var.setIconColor(getThemedColor(cmb.u8));
        }
        ti3 ti3Var = this.D1;
        if (ti3Var != null) {
            ti3Var.updateColors();
        }
        ak3 ak3Var = this.A0;
        if (ak3Var != null) {
            im0 im0Var = ak3Var.F0;
            if (im0Var != null) {
                im0Var.updateColors();
            }
            jp0 jp0Var = ak3Var.z0;
            if (jp0Var != null) {
                jp0Var.g();
            }
            ak3Var.invalidate();
        }
        uh4 uh4Var = this.c0;
        if (uh4Var != null) {
            uh4Var.updateColors();
        }
        sj3 sj3Var2 = this.D0;
        if (sj3Var2 != null && (ai8Var = sj3Var2.s0) != null) {
            ai8Var.c();
        }
        vgc vgcVar = this.b0;
        if (vgcVar != null) {
            vgcVar.updateColors();
        }
        nu9 nu9Var = this.a0;
        if (nu9Var != null) {
            nu9Var.updateColors();
        }
        if (this.L0 != null) {
            int p = on2.p(getThemedColor(cmb.c6), 100);
            boolean z = this.L0.getForeground() instanceof ColorDrawable;
            sb sbVar = this.L0;
            if (!z) {
                sbVar.setForeground(new ColorDrawable(p));
            } else if (((ColorDrawable) sbVar.getForeground()).getColor() != p) {
                ((ColorDrawable) this.L0.getForeground()).setColor(p);
            }
        }
        wp4 wp4Var = this.u0;
        if (wp4Var != null) {
            wp4Var.updateColors();
        }
        wp4 wp4Var2 = this.v0;
        if (wp4Var2 != null) {
            wp4Var2.updateColors();
        }
        int i4 = cmb.c6;
        this.t4.a(getThemedColor(i4));
        qk3 qk3Var = this.L1;
        if (qk3Var != null) {
            qk3Var.updateColors();
        }
        pk3 pk3Var = this.M1;
        if (pk3Var != null) {
            pk3Var.setColor(cmb.w0(null, i4, false));
        }
        ri3 ri3Var = this.J1;
        if (ri3Var != null) {
            ri3Var.updateColors();
        }
        ri3 ri3Var2 = this.H1;
        if (ri3Var2 != null) {
            ri3Var2.updateColors();
        }
        x5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        aj3 aj3Var = this.F0;
        if (aj3Var != null) {
            aj3Var.o();
        }
        if (this.E3 != null && (themedColor = getThemedColor(cmb.Wl)) != this.C4) {
            this.C4 = themedColor;
            this.E3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        zj3 zj3Var = this.Y;
        if (zj3Var != null) {
            zj3Var.updateColors();
        }
    }

    public final boolean H3(TLRPC.Dialog dialog) {
        if (dialog != null) {
            int i = this.f0[0].s;
            ub7 ub7Var = null;
            if ((i == 7 || i == 8) && (!this.actionBar.y() || this.actionBar.z(null))) {
                ub7Var = getMessagesController().N[this.f0[0].s == 8 ? (char) 1 : (char) 0];
            }
            if (ub7Var == null) {
                return dialog.pinned;
            }
            if (ub7Var.j.indexOfKey(dialog.id) >= 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean H4(mk3 mk3Var, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat Z0;
        if (mk3Var != null && dialog != null) {
            if (!getMessagesController().p4.containsKey(Long.valueOf(dialog.id))) {
                if (K3(mk3Var)) {
                    return true;
                }
                ub7 s3 = s3(mk3Var);
                if (s3 != null) {
                    int i = s3.g;
                    int i2 = oc7.s5;
                    if ((i & 64) != 0) {
                        int i3 = this.currentAccount;
                        long j = dialog.id;
                        if (pg3.B(j) && (Z0 = oc7.r1(i3).Z0(Integer.valueOf((int) (4294967295L & j)))) != null) {
                            j = Z0.user_id;
                        }
                        if (!s3.h.contains(Long.valueOf(j))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean H5(long j) {
        TLRPC.Chat L0;
        ti3 ti3Var;
        if ((this.U0 <= 1 && ((ti3Var = this.D1) == null || ti3Var.getVisibility() != 0 || TextUtils.isEmpty(this.D1.getFieldText()))) || !pg3.y(j) || (L0 = getMessagesController().L0(Long.valueOf(-j))) == null || sd2.N(L0) || !L0.slowmode_enabled) {
            return true;
        }
        ik.r0(this, jb6.M0(2131745044, null), jb6.M0(2131745036, null), null);
        return false;
    }

    public final void I2() {
        gm.d3(new di3(this, (byte) 14), 300L);
    }

    public final boolean I3(int i) {
        if (i == 0) {
            return E3();
        }
        if ((i == 7 || i == 8) && this.T0 == 0) {
            if (getMessagesController().r2(getMessagesController().N[i == 8 ? (char) 1 : (char) 0])) {
                return true;
            }
        }
        return false;
    }

    public final boolean I4(mk3 mk3Var) {
        if (mk3Var == null) {
            return false;
        }
        if (K3(mk3Var)) {
            return true;
        }
        ub7 s3 = s3(mk3Var);
        if (s3 != null) {
            int i = s3.g;
            int i2 = oc7.s5;
            if ((i & 64) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean J2(mk3 mk3Var) {
        if (this.H3.c()) {
            return false;
        }
        int i = (int) (-this.O);
        int q3 = q3();
        int r3 = r3();
        if (i == 0 || i == q3 || i == r3 || !mk3Var.a.canScrollVertically(-1)) {
            return false;
        }
        if (r3 >= i || i >= q3) {
            float i2 = this.w3 != 1.0f ? Utilities.i((-this.O) / gm.L(81.0f), 1.0f, 0.0f) : 1.0f;
            float f = this.F0.C0;
            kq kqVar = mk3Var.b;
            if (i2 < f) {
                kqVar.y(-i);
                return true;
            }
            kqVar.y(r3 - i);
            return true;
        }
        int L = gm.L(48.0f);
        int i3 = i - r3;
        int i4 = L / 2;
        kq kqVar2 = mk3Var.b;
        if (i3 < i4) {
            kqVar2.y(-i3);
            return true;
        }
        kqVar2.y(L - i3);
        return true;
    }

    public final boolean J3() {
        return this.E2 == null && this.p2 == null;
    }

    public final void J4(int i, long j, TLRPC.Chat chat, boolean z, boolean z2) {
        if (i == 103) {
            getMessagesController().T(1, j, z2);
            return;
        }
        if (chat == null) {
            getMessagesController().T(0, j, z2);
            if (z && z2) {
                getMessagesController().t(j);
            }
        } else if (sd2.r0(chat)) {
            getMessagesController().T(0, j, z2);
        } else {
            getMessagesController().c0(-j, getMessagesController().W1(Long.valueOf(getUserConfig().e())), null, z2, false);
        }
        if (gm.O1()) {
            getNotificationCenter().k(nm7.s, Long.valueOf(j));
        }
        getMessagesController().F(this.Y2);
    }

    public final boolean K2(long j) {
        int i;
        int i2 = this.T0;
        if (i2 == 15 || i2 == 16 || this.j2 != null || !this.u2) {
            return true;
        }
        if (!pg3.y(j)) {
            if (!pg3.B(j)) {
                return true;
            }
            if (this.V0 == 0 && !this.W0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131745330, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            int i3 = this.V0;
            if (i3 == 3) {
                heVar.U = jb6.M0(2131743775, null);
            } else if (i3 != 0) {
                heVar.U = jb6.M0(2131746909, null);
            } else {
                heVar.U = jb6.M0(2131748861, null);
            }
            alertDialog$Builder.g(jb6.M0(2131747564, null), null);
            showDialog(heVar);
            return false;
        }
        long j2 = -j;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j2));
        if (!sd2.T(L0) || L0.megagroup) {
            return true;
        }
        if (!this.s2) {
            TLRPC.Chat L02 = oc7.r1(this.currentAccount).L0(Long.valueOf(j2));
            if ((sd2.n(L02) || L02.megagroup) && (i = this.V0) != 2 && i != 3) {
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String M02 = jb6.M0(2131745330, null);
        he heVar2 = alertDialog$Builder2.a;
        heVar2.S = M02;
        int i4 = this.V0;
        if (i4 == 3) {
            heVar2.U = jb6.M0(2131743776, null);
        } else if (i4 == 2) {
            heVar2.U = jb6.M0(2131746320, null);
        } else {
            heVar2.U = jb6.M0(2131752386, null);
        }
        alertDialog$Builder2.g(jb6.M0(2131747564, null), null);
        showDialog(heVar2);
        return false;
    }

    public final boolean K3(mk3 mk3Var) {
        return mk3Var != null && I3(mk3Var.s);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void K4(java.util.ArrayList r43, int r44, boolean r45, boolean r46, java.util.HashSet r47) {
        /*
            Method dump skipped, instructions count: 2697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nk3.K4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final void L2(boolean z) {
        cp2 cp2Var;
        TLRPC.ChatFull chatFull;
        qk3 qk3Var = this.L1;
        if (qk3Var == null || (cp2Var = this.S1) == null || (chatFull = this.c3) == null) {
            return;
        }
        qk3Var.j(cp2Var, (this.a3 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z);
        this.S1.setTitle(jb6.G(this.c3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
    }

    public final void L3() {
        b31 b31Var = new b31(getParentActivity(), this.resourceProvider);
        b31Var.d(R.raw.email_check_inbox, new String[0]);
        b31Var.b.setText(jb6.M0(2131742474, null));
        u31.g(this, b31Var, 2750).j();
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void L4(long j, boolean z, ub7 ub7Var, int i, boolean z2) {
        boolean z3;
        int i2;
        boolean F3;
        int i3 = 0;
        int i4 = (this.f0[0].s == 0 && y3() && this.f0[0].w == 2) ? 1 : 0;
        int K0 = this.f0[0].c.K0();
        if (ub7Var != null) {
            int i5 = ub7Var.j.get(j, TLObject.FLAG_31);
            if (!z && i5 == Integer.MIN_VALUE) {
                return;
            }
        }
        int i6 = -1;
        if (K0 > i4 || !z2) {
            z3 = true;
        } else {
            U4(true, true);
            I2();
            if (this.T1 != null) {
                for (int i7 = 0; i7 < this.T1.size(); i7++) {
                    if (((TLRPC.Dialog) this.T1.get(i7)).id == j) {
                        i2 = i7;
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = false;
        }
        i2 = -1;
        if (ub7Var != null) {
            LongSparseIntArray longSparseIntArray = ub7Var.j;
            if (z) {
                longSparseIntArray.put(j, i);
            } else {
                longSparseIntArray.delete(j);
            }
            if (z2) {
                getMessagesController().A3(ub7Var);
            }
            F3 = true;
        } else {
            F3 = getMessagesController().F3(j, z, null, -1L);
        }
        if (F3) {
            if (z3) {
                if (this.T0 != 10) {
                    B3(false);
                }
                R4(true, false);
            } else {
                ArrayList o3 = o3(this.currentAccount, this.f0[0].s, this.Y2, false);
                int i8 = 0;
                while (true) {
                    if (i8 >= o3.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) o3.get(i8)).id == j) {
                        i6 = i8;
                        break;
                    }
                    i8++;
                }
            }
        }
        if (z3) {
            return;
        }
        if (i2 >= 0) {
            ArrayList arrayList = this.T1;
            if (arrayList != null && i6 >= 0 && i2 != i6) {
                arrayList.add(i6, (TLRPC.Dialog) arrayList.remove(i2));
                this.f0[0].y.D();
                this.f0[0].b(true);
                mk3 mk3Var = this.f0[0];
                mi3 mi3Var = mk3Var.c;
                if (mk3Var.s == 0 && y3() && this.f0[0].w == 2) {
                    i3 = 1;
                }
                mi3Var.g1(i3, (int) this.O);
                return;
            }
            if (i6 >= 0 && i2 == i6) {
                gm.d3(new kh3(this, (byte) 21), 200L);
                return;
            }
        }
        U4(false, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
    
        if (getMessagesController().U1.get(r14.Y2) != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M2(mk3 mk3Var) {
        final boolean z;
        final boolean z2;
        final boolean z3;
        final boolean z4;
        int i;
        int K0 = mk3Var.c.K0();
        int M0 = mk3Var.c.M0();
        if (this.j3 || this.o3) {
            return;
        }
        ak3 ak3Var = this.A0;
        if (ak3Var != null && ak3Var.getVisibility() == 0 && this.A0.P) {
            return;
        }
        int abs = Math.abs(M0 - K0) + 1;
        if (M0 != -1) {
            u69 K = mk3Var.a.K(M0);
            boolean z5 = K != null && K.f == 11;
            this.d2 = z5;
            if (z5) {
                B3(false);
            }
        } else {
            this.d2 = false;
        }
        int i2 = mk3Var.s;
        if (i2 == 7 || i2 == 8) {
            ArrayList S0 = getMessagesController().S0();
            int i3 = mk3Var.h;
            if (i3 >= 0 && i3 < S0.size()) {
                int i4 = ((ub7) S0.get(mk3Var.h)).g;
                int i5 = oc7.s5;
                if ((i4 & 128) == 0 && ((abs > 0 && M0 >= o3(this.currentAccount, mk3Var.s, 1, this.U1).size() - 10) || (abs == 0 && !getMessagesController().U1.get(1)))) {
                    boolean z6 = getMessagesController().U1.get(1);
                    boolean z7 = !z6;
                    z = (z6 && getMessagesController().V1.get(1)) ? false : true;
                    z2 = z7;
                    if (abs > 0 || M0 < o3(this.currentAccount, mk3Var.s, this.Y2, this.U1).size() - 10) {
                        if (abs == 0 && ((i = mk3Var.s) == 7 || i == 8 || K3(mk3Var))) {
                        }
                        z3 = false;
                        z4 = false;
                        if (!z3 || z) {
                            gm.c3(new Runnable() { // from class: ei3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    nk3 nk3Var = nk3.this;
                                    if (z3) {
                                        nk3Var.getMessagesController().Z2(nk3Var.Y2, -1, 100, z4, null);
                                    }
                                    if (z) {
                                        nk3Var.getMessagesController().Z2(1, -1, 100, z2, null);
                                    }
                                }
                            });
                        }
                        return;
                    }
                    boolean z8 = getMessagesController().U1.get(this.Y2);
                    boolean z9 = !z8;
                    if (z8) {
                        if (getMessagesController().V1.get(this.Y2)) {
                            z4 = z9;
                            z3 = false;
                            if (z3) {
                            }
                            gm.c3(new Runnable() { // from class: ei3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    nk3 nk3Var = nk3.this;
                                    if (z3) {
                                        nk3Var.getMessagesController().Z2(nk3Var.Y2, -1, 100, z4, null);
                                    }
                                    if (z) {
                                        nk3Var.getMessagesController().Z2(1, -1, 100, z2, null);
                                    }
                                }
                            });
                        }
                    }
                    z4 = z9;
                    z3 = true;
                    if (z3) {
                    }
                    gm.c3(new Runnable() { // from class: ei3
                        @Override // java.lang.Runnable
                        public final void run() {
                            nk3 nk3Var = nk3.this;
                            if (z3) {
                                nk3Var.getMessagesController().Z2(nk3Var.Y2, -1, 100, z4, null);
                            }
                            if (z) {
                                nk3Var.getMessagesController().Z2(1, -1, 100, z2, null);
                            }
                        }
                    });
                }
            }
        }
        z = false;
        z2 = false;
        if (abs > 0) {
        }
        if (abs == 0) {
        }
        z3 = false;
        z4 = false;
        if (z3) {
        }
        gm.c3(new Runnable() { // from class: ei3
            @Override // java.lang.Runnable
            public final void run() {
                nk3 nk3Var = nk3.this;
                if (z3) {
                    nk3Var.getMessagesController().Z2(nk3Var.Y2, -1, 100, z4, null);
                }
                if (z) {
                    nk3Var.getMessagesController().Z2(1, -1, 100, z2, null);
                }
            }
        });
    }

    public final void M3(int i) {
        c6c G = this.D0.r0.G(i);
        Object obj = G != null ? G.H : null;
        if (obj instanceof TLRPC.User) {
            int i2 = this.currentAccount;
            long j = ((TLRPC.User) obj).id;
            d f0 = rs0.f0(i2, j);
            if (f0 == null) {
                f0 = ProfileActivity.S2(j);
            }
            presentFragment(f0);
            return;
        }
        if (obj instanceof k47) {
            k47 k47Var = (k47) obj;
            Bundle bundle = new Bundle();
            long B0 = k47.B0(k47Var.k);
            TLRPC.Message message = k47Var.k;
            if (B0 >= 0) {
                bundle.putLong("user_id", k47.B0(message));
            } else {
                bundle.putLong("chat_id", -k47.B0(message));
            }
            bundle.putInt("message_id", k47Var.e1());
            yv1 yv1Var = new yv1(bundle);
            C3(yv1Var, k47Var);
            presentFragment(yv1Var);
        }
    }

    public final void M4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(cmb.c6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / nm7.J2));
        this.L0.setBackground(new BitmapDrawable(createBitmap));
        this.L0.setAlpha(0.0f);
        this.L0.setVisibility(0);
        X2();
    }

    public final void N2() {
        getMessagesStorage().getClass();
    }

    public final void N3(int i) {
        Object obj;
        jv9 jv9Var = this.D0.r0;
        if (i < jv9Var.a0 || i >= jv9Var.b0) {
            obj = Boolean.FALSE;
        } else {
            c6c G = jv9Var.G(i);
            obj = G != null ? G.H : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
            String M0 = jb6.M0(2131754145, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.a0(null, null, 2131754144, "\"" + m9c.r(user) + "\"");
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            alertDialog$Builder.j(jb6.M0(2131746054, null), new x92((Object) this, (Object) user, (byte) 22));
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
        }
    }

    public final void N4(boolean z) {
        mk3[] mk3VarArr = this.f0;
        if (mk3VarArr != null && !this.U1) {
            for (mk3 mk3Var : mk3VarArr) {
                if (mk3Var.getVisibility() == 0) {
                    if (z) {
                        ki3 ki3Var = mk3Var.y;
                        ki3Var.D();
                        ki3Var.A = true;
                    }
                    mk3Var.b(z);
                    M2(mk3Var);
                }
            }
        }
        ak3 ak3Var = this.A0;
        if (ak3Var == null || ak3Var.getVisibility() != 0) {
            return;
        }
        this.A0.c();
    }

    public final void O2() {
        if (this.f0 == null) {
            return;
        }
        int F2 = F2();
        int i = 0;
        while (true) {
            mk3[] mk3VarArr = this.f0;
            if (i >= mk3VarArr.length) {
                return;
            }
            mk3 mk3Var = mk3VarArr[i];
            if (mk3Var != null) {
                jk3 jk3Var = mk3Var.a;
                jk3Var.setPadding(0, jk3Var.g3, 0, F2);
            }
            i++;
        }
    }

    public final void O3(mk3 mk3Var, View view, int i) {
        int i2;
        if (view instanceof l55) {
            return;
        }
        boolean z = view instanceof hg3;
        if (z) {
            hg3 hg3Var = (hg3) view;
            if (hg3Var.o2) {
                i5(hg3Var.getDialogId(), view);
                return;
            }
        }
        if (e3()) {
            D4(view, i, 0.0f, mk3Var.d);
            return;
        }
        int i3 = this.T0;
        if (i3 == 15 && (view instanceof xib)) {
            mk3Var.d.L();
            return;
        }
        int i4 = 0;
        if ((i3 == 11 || i3 == 13) && i == 1) {
            Bundle l = ts2.l("forImport", true);
            l.putLongArray("result", new long[]{getUserConfig().e()});
            l.putInt("chatType", 4);
            String string = this.arguments.getString("importTitle");
            if (string != null) {
                l.putString("title", string);
            }
            uc5 uc5Var = new uc5(l);
            uc5Var.Z = new ni3(this);
            presentFragment(uc5Var);
            return;
        }
        if ((view instanceof nl3) && ((i2 = mk3Var.s) == 7 || i2 == 8)) {
            xk3 xk3Var = (xk3) mk3Var.d.N.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (xk3Var == null || xk3Var.a != 17) ? null : xk3Var.i;
            if (tL_chatlists_chatlistUpdates != null) {
                ub7 ub7Var = getMessagesController().N[mk3Var.s - 7];
                if (ub7Var != null) {
                    int i5 = ub7Var.a;
                    ln4 ln4Var = new ln4(this, false);
                    ln4Var.T1 = -1;
                    ln4Var.X1 = "";
                    ln4Var.Y1 = new ArrayList();
                    ln4Var.a2 = "";
                    ln4Var.c2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    ln4Var.d2 = arrayList;
                    ln4Var.u2 = -1;
                    ln4Var.x2 = -5;
                    ln4Var.T1 = i5;
                    ln4Var.V1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    ln4Var.b2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = getMessagesController().G0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                break;
                            }
                            if (((ub7) arrayList2.get(i4)).a == i5) {
                                ln4Var.X1 = ((ub7) arrayList2.get(i4)).b;
                                break;
                            }
                            i4++;
                        }
                    }
                    ln4Var.a1();
                    showDialog(ln4Var);
                    return;
                }
                return;
            }
        } else if (z && !this.actionBar.y() && !this.H3.c()) {
            ImageReceiver imageReceiver = ((hg3) view).Z1;
            gm.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        }
        C4(view, i, mk3Var.d);
    }

    public final void O4(mk3 mk3Var) {
        int i;
        if (mk3Var.getVisibility() != 0) {
            return;
        }
        int i2 = mk3Var.d.w;
        if (mk3Var.s == 0 && y3() && mk3Var.a.getChildCount() == 0 && mk3Var.w == 2) {
            ((u46) mk3Var.a.getLayoutManager()).g1(1, (int) this.O);
        }
        mk3Var.d.getClass();
        mk3Var.d.Q();
        int b = mk3Var.d.b();
        if (b == 1 && i2 == 1 && mk3Var.d.d(0) == 5) {
            mk3Var.b(true);
        } else {
            mk3Var.b(false);
            if (b > i2 && (i = this.T0) != 11 && i != 12 && i != 13) {
                mk3Var.E.b(i2);
            }
        }
        try {
            mk3Var.a.setEmptyView((this.Y2 == 0 && this.a3 == 0) ? mk3Var.x : null);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        M2(mk3Var);
    }

    public final void P2() {
        va2 va2Var = this.A1;
        if (va2Var != null) {
            va2Var.setBlurredBottomHeight(this.A1.getInputBubbleHeight() + this.w.d() + gm.L(9.0f) + gm.L(7.0f));
        }
    }

    public final void P3() {
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).w()) {
            finishPreviewFragment();
            return;
        }
        if (this.T0 != 10) {
            if (oc7.r1(this.currentAccount).u2()) {
                h5.b(this.currentAccount);
                return;
            } else {
                presentFragment(new ContactsActivity(ts2.l("destroyAfterSelect", true)));
                return;
            }
        }
        if (this.E2 != null) {
            ArrayList arrayList = this.K2;
            if (arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList2.add(bf7.a(((Long) arrayList.get(i)).longValue(), 0L));
            }
            this.E2.q(this, arrayList2, null, false, this.L2, this.M2, this.N2, null);
        }
    }

    public final void P4() {
        boolean z;
        if (this.O == 0.0f || (z = this.L)) {
            return;
        }
        float f = z ? -r3() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.I3, f));
        animatorSet.setInterpolator(d53.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void Q2() {
        mk3 mk3Var;
        float p3 = p3(true);
        ak3 ak3Var = this.A0;
        if (ak3Var != null) {
            boolean z = ak3Var.getAlpha() != p3;
            float R1 = gm.R1(0.98f, 1.0f, p3);
            this.A0.setAlpha(p3);
            this.A0.setScaleX(R1);
            this.A0.setScaleY(R1);
            this.A0.setVisibility(p3 > 0.0f ? 0 : 8);
            if (z && (mk3Var = this.f0[0]) != null) {
                mk3Var.a.requestLayout();
            }
        }
        o5();
    }

    public final void Q3() {
        oc7.r1(this.currentAccount).X3.edit().putBoolean("storyhint", false).commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q4(int i) {
        eg4 eg4Var;
        ak3 ak3Var = this.A0;
        if (ak3Var == null) {
            s5(true, true);
            ak3Var = this.A0;
            if (ak3Var == null) {
                return;
            }
        }
        int tabsCount = ak3Var.getTabsCount() - 1;
        ArrayList S0 = getMessagesController().S0();
        int i2 = 0;
        while (true) {
            if (i2 >= S0.size()) {
                break;
            }
            if (((ub7) S0.get(i2)).a == i) {
                tabsCount = i2;
                break;
            }
            i2++;
        }
        ak3 ak3Var2 = this.A0;
        if (tabsCount < 0) {
            ak3Var2.getClass();
        } else if (tabsCount < ak3Var2.getTabsCount()) {
            eg4Var = (eg4) ak3Var2.h.get(tabsCount);
            if (eg4Var != null) {
                ak3 ak3Var3 = this.A0;
                ArrayList arrayList = ak3Var3.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                ak3Var3.g((eg4) b10.f(1, arrayList), arrayList.size() - 1);
                return;
            }
            mk3[] mk3VarArr = this.f0;
            if (mk3VarArr == null || mk3VarArr.length <= 0 || mk3VarArr[0].h != eg4Var.a) {
                this.A0.g(eg4Var, tabsCount);
                return;
            }
            return;
        }
        eg4Var = null;
        if (eg4Var != null) {
        }
    }

    public final void R2() {
        float f = this.n.e;
        float R1 = gm.R1(0.2f, 1.0f, f);
        vi3 vi3Var = this.E1;
        if (vi3Var != null) {
            vi3Var.setScaleX(R1);
            this.E1.setScaleY(R1);
            this.E1.setAlpha(f);
            this.E1.setVisibility(f > 0.0f ? 0 : 8);
        }
        va2 va2Var = this.A1;
        if (va2Var != null) {
            va2Var.setAlpha(f);
            this.A1.setVisibility(f > 0.0f ? 0 : 8);
            this.A1.getFadeView().setAlpha(f);
            this.A1.getFadeView().setVisibility(f > 0.0f ? 0 : 8);
        }
    }

    public final /* synthetic */ void R3(he[] heVarArr) {
        yp2.e(heVarArr, this, this.currentAccount, this.b3);
    }

    public final void R4(boolean z, boolean z2) {
        dj3 dj3Var = this.H3;
        if (dj3Var == null || !dj3Var.c()) {
            int i = (this.f0[0].s == 0 && y3() && this.f0[0].w == 2) ? 1 : 0;
            int i2 = (!this.L || z2 || this.F0.g()) ? 0 : -gm.L(81.0f);
            mk3[] mk3VarArr = this.f0;
            if (!z) {
                mk3VarArr[0].c.g1(i, i2);
                P4();
            } else {
                cw6 cw6Var = mk3VarArr[0].r;
                cw6Var.b = 1;
                cw6Var.l(i, i2, false, false);
                P4();
            }
        }
    }

    public final void S2() {
        if (this.actionBar == null) {
            return;
        }
        float f = 1.0f - this.b.e;
        float t3 = 1.0f - t3();
        wp4.d(this.actionBar.getBackButton(), Math.max(this.w3, f * t3 * (1.0f - this.c.e)));
    }

    public final void S3(he heVar, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (tLObject == null) {
            ik.c0(this.currentAccount, tL_error, this, tL_messages_checkHistoryImportPeer, new Object[0]);
            getNotificationCenter().k(nm7.v1, Long.valueOf(j), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        this.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        fu fuVar = new fu((Object) this, j, (byte) 14);
        Pattern pattern = ik.a;
        if (getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = getCurrentAccount();
            Activity parentActivity = getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long e2 = z8c.h(currentAccount).e();
            TextView textView = new TextView(parentActivity);
            anb.X(textView, cmb.i5, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((jb6.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.n(frameLayout);
            pc0 pc0Var = new pc0((ylb) null);
            pc0Var.s(gm.L(12.0f));
            bf0 bf0Var = new bf0(parentActivity);
            bf0Var.setRoundRadius(gm.L(20.0f));
            frameLayout.addView(bf0Var, qoe.d(40, 40.0f, (jb6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            td4.x(textView2, cmb.D8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((jb6.a0 ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(jb6.M0(2131749002, null));
            boolean z = jb6.a0;
            frameLayout.addView(textView2, qoe.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 76, 11.0f, z ? 76 : 21, 0.0f));
            frameLayout.addView(textView, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                pc0Var.p(chat);
                bf0Var.f(chat, pc0Var);
            } else if (m9c.B(user)) {
                pc0Var.p = 0.8f;
                pc0Var.f(12);
                bf0Var.m(null, null, pc0Var, user);
            } else if (user.id == e2) {
                pc0Var.p = 0.8f;
                pc0Var.f(1);
                bf0Var.m(null, null, pc0Var, user);
            } else {
                pc0Var.p = 1.0f;
                pc0Var.q(user);
                bf0Var.f(user, pc0Var);
            }
            textView.setText(gm.S2(str));
            alertDialog$Builder.j(jb6.M0(2131749022, null), new l0(fuVar, (byte) 12));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            showDialog(alertDialog$Builder.a);
        }
    }

    public final void S4(String str, boolean z) {
        k5(true, false, true, false);
        av9 av9Var = this.Z;
        if (av9Var != null) {
            av9Var.b(true);
        }
        zj3 zj3Var = this.Y;
        if (zj3Var != null) {
            zj3Var.r.setText(str);
            this.Y.r.setSelection(str.length());
        }
    }

    public final void T2() {
        wp4.d(this.h0, mlb.C(this.j0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - t3(), 1.0f - this.c.e));
    }

    public final /* synthetic */ void T3(float f, ValueAnimator valueAnimator) {
        this.f0[0].setTranslationY((1.0f - this.w3) * f);
        this.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.w3);
            }
        }
        a3();
        S2();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void T4(float f) {
        this.d0 = f;
        for (mk3 mk3Var : this.f0) {
            jk3 jk3Var = mk3Var.a;
            for (int i = 0; i < jk3Var.getChildCount(); i++) {
                View childAt = jk3Var.getChildAt(i);
                if (childAt != null && RecyclerView.R(childAt) >= mk3Var.d.f + 1) {
                    childAt.setAlpha(f);
                }
            }
        }
    }

    public final void U2() {
        wp4.d(this.g0, mlb.C(gda.r.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - t3(), 1.0f - this.c.e));
    }

    public final /* synthetic */ void U3() {
        if (this.f0 == null) {
            return;
        }
        if (this.U1 || this.isPaused) {
            this.S3 = true;
            return;
        }
        this.S3 = false;
        getMessagesController().b5(null);
        N4(false);
    }

    public final void U4(boolean z, boolean z2) {
        if (this.f0 == null || this.U1 == z) {
            return;
        }
        if (z) {
            this.T1 = new ArrayList(o3(this.currentAccount, this.f0[0].s, this.Y2, false));
        } else {
            this.T1 = null;
        }
        this.U1 = z;
        mk3 mk3Var = this.f0[0];
        mk3Var.d.H = z;
        if (z || !z2) {
            return;
        }
        boolean d0 = mk3Var.a.d0();
        mk3[] mk3VarArr = this.f0;
        if (d0) {
            mk3VarArr[0].a.post(new di3(this, (byte) 6));
        } else {
            mk3VarArr[0].d.f();
        }
    }

    @Override // g94
    public final void V(float f, int i) {
        r7 r7Var;
        if (i != 3 || (r7Var = this.m0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) r7Var.getIconView().getDrawable();
        if (!this.d.f) {
            animatedVectorDrawable.reset();
            return;
        }
        animatedVectorDrawable.start();
        if (gda.o() != 0) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = hs6.d0(this.currentAccount).E;
            String p0 = PremiumPreviewFragment.p0(2);
            if (tL_help_premiumPromo != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= tL_help_premiumPromo.video_sections.size()) {
                        i2 = -1;
                        break;
                    } else if (tL_help_premiumPromo.video_sections.get(i2).equals(p0)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    bc4.G(this.currentAccount).X(tL_help_premiumPromo.videos.get(i2), tL_help_premiumPromo, 3, 0);
                }
            }
        }
    }

    public final void V2() {
        wp4.d(this.k0, mlb.C(this.T0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - t3(), 1.0f - this.c.e));
        aj3 aj3Var = this.F0;
        if (aj3Var != null) {
            aj3Var.invalidate();
        }
    }

    public final void V3(int i, bu5 bu5Var) {
        if (this.currentAccount != i) {
            bu5Var.u();
            if (getParentActivity() == null) {
                return;
            }
            hk3 hk3Var = this.E2;
            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
            ArrayList arrayList = this.F2;
            String str = this.G2;
            CharSequence charSequence = this.H2;
            ti3 ti3Var = this.D1;
            CharSequence fieldText = ti3Var != null ? ti3Var.getFieldText() : null;
            launchActivity.N0(i);
            nk3 nk3Var = new nk3(this.arguments);
            nk3Var.E2 = hk3Var;
            if (arrayList == null || arrayList.isEmpty()) {
                if (str != null) {
                    nk3Var.Y4(fieldText, str);
                } else if (charSequence != null) {
                    if (charSequence.length() == 0) {
                        nk3Var.H2 = null;
                    } else {
                        nk3Var.H2 = charSequence;
                        nk3Var.G2 = null;
                        nk3Var.F2 = null;
                        if (nk3Var.D1 != null) {
                            nk3Var.D2(fieldText);
                        } else {
                            nk3Var.b4 = fieldText;
                        }
                    }
                }
            } else if (arrayList.isEmpty()) {
                nk3Var.F2 = null;
            } else {
                nk3Var.F2 = arrayList;
                nk3Var.G2 = null;
                nk3Var.O2 = false;
                if (nk3Var.D1 != null) {
                    nk3Var.D2(fieldText);
                } else {
                    nk3Var.b4 = fieldText;
                }
            }
            launchActivity.u0(nk3Var, false, true);
        }
    }

    public final void V4(boolean z) {
        mk3 mk3Var;
        if (gda.o() <= 1 || !e86.e(32768)) {
            return;
        }
        mk3[] mk3VarArr = this.f0;
        if (z) {
            if (mk3VarArr != null && (mk3Var = mk3VarArr[0]) != null) {
                mk3Var.setLayerType(2, null);
                this.f0[0].setClipChildren(false);
                this.f0[0].setClipToPadding(false);
                this.f0[0].a.setClipChildren(false);
            }
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.setLayerType(2, null);
            }
            View view = this.fragmentView;
            if (view != null) {
                ((ViewGroup) view).setClipChildren(false);
                this.fragmentView.requestLayout();
                return;
            }
            return;
        }
        if (mk3VarArr != null) {
            int i = 0;
            while (true) {
                mk3[] mk3VarArr2 = this.f0;
                if (i >= mk3VarArr2.length) {
                    break;
                }
                mk3 mk3Var2 = mk3VarArr2[i];
                if (mk3Var2 != null) {
                    mk3Var2.setLayerType(0, null);
                    mk3Var2.setClipChildren(true);
                    mk3Var2.setClipToPadding(true);
                    mk3Var2.a.setClipChildren(true);
                }
                i++;
            }
        }
        a aVar2 = this.actionBar;
        if (aVar2 != null) {
            aVar2.setLayerType(0, null);
        }
        aj3 aj3Var = this.F0;
        if (aj3Var != null) {
            aj3Var.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void W2() {
        wp4.d(this.m0, mlb.C(this.b.e, 1.0f - t3(), 1.0f - this.c.e, this.d.e));
    }

    public final /* synthetic */ void W3() {
        oc7.r1(this.currentAccount).h0(null);
    }

    public final void W4(float f) {
        mk3[] mk3VarArr = this.f0;
        if (mk3VarArr != null) {
            int paddingTop = mk3VarArr[0].a.getPaddingTop() + ((int) f);
            int i = 0;
            while (true) {
                mk3[] mk3VarArr2 = this.f0;
                if (i >= mk3VarArr2.length) {
                    break;
                }
                mk3VarArr2[i].a.setTopGlowOffset(paddingTop);
                i++;
            }
        }
        if (this.fragmentView == null || f == this.O) {
            return;
        }
        this.O = f;
        u31 u31Var = this.q3;
        if (u31Var != null) {
            u31Var.l();
        }
        if (this.G3 != null) {
            float currentActionBarHeight = 1.0f - ((-f) / a.getCurrentActionBarHeight());
            yn ynVar = this.G3;
            float f2 = (int) f;
            float f3 = ynVar.f;
            ynVar.h = f2;
            ynVar.setTranslationY(f3 + f2);
            this.G3.setAlpha(pqe.a(currentActionBarHeight, 0.0f, 1.0f));
            this.G3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        a3();
        this.fragmentView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.d, aj6
    public final boolean X(MotionEvent motionEvent, boolean z) {
        dj3 dj3Var;
        sb sbVar;
        ak3 ak3Var;
        if (!this.s3 && (((dj3Var = this.H3) == null || !dj3Var.c()) && (((sbVar = this.L0) == null || sbVar.getVisibility() != 0) && ((ak3Var = this.A0) == null || !ak3Var.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ak3 ak3Var2 = this.A0;
                boolean z2 = ak3Var2 == null || ak3Var2.getTabsCount() < 2 || this.A0.getCurrentTabId() == this.A0.getFirstTabId();
                ak3 ak3Var3 = this.A0;
                boolean z3 = ak3Var3 == null || ak3Var3.getTabsCount() < 2 || this.A0.getCurrentTabId() == this.A0.getLastTabId();
                gda.m(this.currentAccount);
                if (!z) {
                    return z2;
                }
                if (!z3 || z2) {
                }
            }
            return true;
        }
        return false;
    }

    public final void X2() {
        sb sbVar;
        boolean z = !this.l2 && ((sbVar = this.L0) == null || sbVar.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8);
        fk3 fk3Var = this.K3;
        if (fk3Var != null) {
            ((bj6) fk3Var.a).w.a(z, true);
        }
    }

    public final /* synthetic */ void X3() {
        if (this.h4.g()) {
            oc7.r1(this.currentAccount).p4(0L, "USERPIC_SETUP");
            q5();
        }
    }

    public final void X4(float f) {
        this.z1 = f;
        x5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (gda.o() != 0) {
            e86.e(32768);
        }
        o5();
    }

    public final void Y2() {
        S2();
        wp4.d(this.l0, (1.0f - this.b.e) * (1.0f - t3()) * (1.0f - this.c.e));
        T2();
        W2();
        U2();
        V2();
    }

    public final void Y3(int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        if (i != 102) {
            K4(arrayList, i, false, false, null);
            return;
        }
        getMessagesController().j0 = true;
        K4(arrayList, i, false, false, z ? hashSet : null);
        oc7 messagesController = getMessagesController();
        messagesController.j0 = false;
        messagesController.getNotificationCenter().k(nm7.r, Boolean.TRUE);
        getMessagesController().F(this.Y2);
        int i2 = this.Y2;
        if (i2 == 0 || o3(this.currentAccount, this.f0[0].s, i2, false).size() != 0) {
            return;
        }
        this.f0[0].a.setEmptyView(null);
        this.f0[0].x.setVisibility(4);
        finishFragment();
    }

    public final void Y4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.G2 = null;
            this.H2 = null;
            return;
        }
        this.G2 = str;
        this.H2 = null;
        this.F2 = null;
        if (this.D1 != null) {
            D2(charSequence);
        } else {
            this.b4 = charSequence;
        }
    }

    public final void Z2() {
        String M0 = jb6.M0(t3() > 0.5f ? 2131745440 : 2131745547, null);
        this.Y.r.setContentDescription(M0);
        this.Y.r.setHint(M0);
    }

    public final void Z3(final int i, final long j, TLRPC.Chat chat, final boolean z, final boolean z2) {
        final TLRPC.Chat chat2;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        A3(false);
        if (i == 103 && sd2.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || sd2.t0(chat2)) {
                getMessagesController().T(2, j, z2);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i == 102 && (i4 = this.Y2) != 0 && o3(this.currentAccount, this.f0[0].s, i4, false).size() == 1) {
            this.f0[0].x.setVisibility(4);
        }
        int i5 = -1;
        if (i == 102) {
            U4(true, true);
            if (this.T1 != null) {
                i3 = 0;
                while (i3 < this.T1.size()) {
                    if (((TLRPC.Dialog) this.T1.get(i3)).id == j) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i3 = -1;
            I2();
            i2 = i3;
        } else {
            i2 = -1;
        }
        UndoView w3 = w3();
        if (w3 != null) {
            w3.j(i == 103 ? 0 : z2 ? 1 : 95, j, new Runnable() { // from class: zh3
                @Override // java.lang.Runnable
                public final void run() {
                    nk3.this.J4(i, j, chat2, z, z2);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(o3(this.currentAccount, this.f0[0].s, this.Y2, false));
        int i6 = 0;
        while (true) {
            if (i6 >= arrayList2.size()) {
                break;
            }
            if (((TLRPC.Dialog) arrayList2.get(i6)).id == j) {
                i5 = i6;
                break;
            }
            i6++;
        }
        if (i == 102) {
            if (i2 < 0 || i5 >= 0 || (arrayList = this.T1) == null) {
                U4(false, true);
                return;
            }
            arrayList.remove(i2);
            this.f0[0].y.D();
            this.f0[0].b(true);
        }
    }

    public final void Z4(float f) {
        if (gda.o() <= 0) {
            boolean z = e21.a;
            return;
        }
        if (this.d4 != f) {
            boolean z2 = true;
            if (gda.o() > 1 && e86.e(32768)) {
                z2 = false;
            }
            this.e4 = z2;
            this.d4 = f;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.e4) {
                float f2 = (1.0f - this.d4) * (-gm.L(40.0f));
                aj3 aj3Var = this.F0;
                if (aj3Var != null) {
                    aj3Var.setTranslationX(f2);
                }
                zj3 zj3Var = this.Y;
                if (zj3Var != null) {
                    zj3Var.setTranslationX(f2);
                }
                dj3 dj3Var = this.H3;
                if (dj3Var == null || dj3Var.getFragmentView() == null || this.E) {
                    return;
                }
                this.H3.getFragmentView().setTranslationX(f2);
                return;
            }
            float f3 = -gm.L(4.0f);
            float f4 = 1.0f - this.d4;
            float f5 = f3 * f4;
            float f6 = 1.0f - (f4 * 0.05f);
            aj3 aj3Var2 = this.F0;
            if (aj3Var2 != null) {
                aj3Var2.setScaleX(f6);
                this.F0.setScaleY(f6);
                this.F0.setTranslationX(f5);
                this.F0.setPivotX(0.0f);
                this.F0.setPivotY(0.0f);
            }
            zj3 zj3Var2 = this.Y;
            if (zj3Var2 != null) {
                zj3Var2.setTranslationX(f5);
                this.Y.setScaleX(f6);
                this.Y.setScaleY(f6);
            }
            dj3 dj3Var2 = this.H3;
            if (dj3Var2 == null || dj3Var2.getFragmentView() == null) {
                return;
            }
            if (!this.E) {
                this.H3.getFragmentView().setScaleX(f6);
                this.H3.getFragmentView().setScaleY(f6);
                this.H3.getFragmentView().setTranslationX(f5);
            }
            this.H3.getFragmentView().setPivotX(0.0f);
            this.H3.getFragmentView().setPivotY(0.0f);
        }
    }

    public final void a3() {
        if (this.Y == null) {
            return;
        }
        float a = 1.0f - pqe.a(((-this.O) - r3()) / gm.L(48.0f), 0.0f, 1.0f);
        float max = (this.T0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.w3, this.h.e)) * Math.max(this.b.e, (1.0f - t3()) * a);
        this.Y.setAlpha(max);
        this.Y.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final /* synthetic */ void a4() {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", z8c.h(this.currentAccount).e());
        presentFragment(new yv1(bundle));
    }

    public final void a5(mk3 mk3Var, float f) {
        if (this.U != f) {
            this.U = f;
            if (f == 0.0f) {
                this.V = false;
            }
            this.F0.setOverscroll(f);
            mk3Var.a.setViewsOffset(f);
            mk3Var.a.setOverScrollMode(f != 0.0f ? 2 : 0);
            this.fragmentView.invalidate();
            if (f <= gm.L(90.0f) || this.V) {
                return;
            }
            aj3 aj3Var = this.F0;
            ValueAnimator valueAnimator = aj3Var.I0;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                aj3Var.i(aj3Var.q0, true);
                this.V = true;
                getOrCreateStoryViewer().u(new kh3(this, (byte) 12));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.Yk));
        hashSet.add(Integer.valueOf(cmb.Xk));
        hashSet.add(Integer.valueOf(cmb.cl));
        hashSet.add(Integer.valueOf(cmb.bl));
        hashSet.add(Integer.valueOf(cmb.al));
        hashSet.add(Integer.valueOf(cmb.Zk));
        hashSet.add(Integer.valueOf(cmb.Si));
        hashSet.add(Integer.valueOf(cmb.f8));
        hashSet.add(Integer.valueOf(cmb.Me));
        hashSet.add(Integer.valueOf(cmb.Ij));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.Le));
        hashSet.add(Integer.valueOf(cmb.Ke));
        hashSet.add(Integer.valueOf(cmb.Je));
        hashSet.add(Integer.valueOf(cmb.Ie));
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.vj));
        hashSet.add(Integer.valueOf(cmb.wj));
        hashSet.add(Integer.valueOf(cmb.S8));
        hashSet.add(Integer.valueOf(cmb.e9));
        hashSet.add(Integer.valueOf(cmb.V8));
        hashSet.add(Integer.valueOf(cmb.U8));
        hashSet.add(Integer.valueOf(cmb.T8));
        hashSet.add(Integer.valueOf(cmb.R9));
        hashSet.add(Integer.valueOf(cmb.Q9));
        hashSet.add(Integer.valueOf(cmb.f9));
        hashSet.add(Integer.valueOf(cmb.l9));
        hashSet.add(Integer.valueOf(cmb.Yl));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.d9));
        hashSet.add(Integer.valueOf(cmb.c9));
        hashSet.add(Integer.valueOf(cmb.b9));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.L7));
        hashSet.add(Integer.valueOf(cmb.M7));
        hashSet.add(Integer.valueOf(cmb.g9));
        hashSet.add(Integer.valueOf(cmb.m9));
        hashSet.add(Integer.valueOf(cmb.k9));
        hashSet.add(Integer.valueOf(cmb.X8));
        hashSet.add(Integer.valueOf(cmb.n9));
        hashSet.add(Integer.valueOf(cmb.i9));
        hashSet.add(Integer.valueOf(cmb.j9));
        hashSet.add(Integer.valueOf(cmb.K7));
        hashSet.add(Integer.valueOf(cmb.a8));
        hashSet.add(Integer.valueOf(cmb.Z7));
        hashSet.add(Integer.valueOf(cmb.Y7));
        hashSet.add(Integer.valueOf(cmb.X7));
        hashSet.add(Integer.valueOf(cmb.W7));
        hashSet.add(Integer.valueOf(cmb.V7));
        hashSet.add(Integer.valueOf(cmb.U7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.J7));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.o6));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.j7));
        hashSet.add(Integer.valueOf(cmb.pk));
        hashSet.add(Integer.valueOf(cmb.Y5));
        hashSet.add(Integer.valueOf(cmb.A9));
        hashSet.add(Integer.valueOf(cmb.y9));
        hashSet.add(Integer.valueOf(cmb.z9));
        hashSet.add(Integer.valueOf(cmb.x9));
        hashSet.add(Integer.valueOf(cmb.w9));
        hashSet.add(Integer.valueOf(cmb.v9));
        hashSet.add(Integer.valueOf(cmb.u9));
        hashSet.add(Integer.valueOf(cmb.t9));
        hashSet.add(Integer.valueOf(cmb.s9));
        hashSet.add(Integer.valueOf(cmb.r9));
        hashSet.add(Integer.valueOf(cmb.q9));
        hashSet.add(Integer.valueOf(cmb.p9));
        hashSet.add(Integer.valueOf(cmb.o9));
        hashSet.add(Integer.valueOf(cmb.h9));
        hashSet.add(Integer.valueOf(cmb.Y8));
        hashSet.add(Integer.valueOf(cmb.W8));
        hashSet.add(Integer.valueOf(cmb.a9));
        hashSet.add(Integer.valueOf(cmb.Z8));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.T9));
        hashSet.add(Integer.valueOf(cmb.S9));
        hashSet.add(Integer.valueOf(cmb.xi));
        hashSet.add(Integer.valueOf(cmb.H5));
        hashSet.add(Integer.valueOf(cmb.D8));
        hashSet.add(Integer.valueOf(cmb.F8));
    }

    public final void b3() {
        if (this.a0 != null) {
            float f = (this.b0 != null ? 1.0f : 0.0f) * this.b.e;
            float R1 = gm.R1(0.98f, 1.0f, f);
            this.a0.setScaleX(R1);
            this.a0.setScaleY(R1);
            this.a0.setAlpha(f);
            this.a0.setVisibility(f > 0.0f ? 0 : 8);
        }
        vgc vgcVar = this.b0;
        fn0 fn0Var = this.s;
        if (vgcVar != null) {
            float f2 = 1.0f - fn0Var.e;
            vgcVar.setAlpha(f2);
            this.b0.setVisibility(f2 > 0.0f ? 0 : 8);
        }
        uh4 uh4Var = this.c0;
        if (uh4Var != null) {
            float f3 = fn0Var.e;
            uh4Var.setAlpha(f3);
            this.c0.setVisibility(f3 > 0.0f ? 0 : 8);
        }
    }

    public final void b4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        hs6 d0 = hs6.d0(this.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
        if (tL_attachMenuBots != null) {
            d0.getMessagesStorage().a.c(new o77((Object) d0, (Object) tL_attachMenuBots, d0.a, d0.e, (byte) 7));
        }
    }

    public final void b5() {
        getContactsController().B();
        ys ysVar = new ys(getParentActivity(), this.currentAccount, getResourceProvider(), new rd3(this, r1, (byte) 4), new xf2(r1, (byte) 29));
        my0 i = wi8.i(getParentActivity(), false, 1, getResourceProvider());
        i.O = ysVar;
        i.U0 = (byte) 49;
        i.show();
        my0[] my0VarArr = {i};
        i.L(cmb.g5);
    }

    public final void c3(boolean z) {
        if (this.D0 == null || this.actionBar == null) {
            return;
        }
        int i = gm.n;
        int measuredHeight = this.actionBar.getMeasuredHeight() + gm.L(this.a) + (this.b0 != null ? gm.L(50.0f) : 0);
        qk3 qk3Var = this.L1;
        int c = measuredHeight + (qk3Var != null ? (int) qk3Var.c(gm.L(7.0f)) : 0);
        sj3 sj3Var = this.D0;
        SparseArray sparseArray = sj3Var.h;
        sj3Var.X0 = c;
        sj3Var.Y0 = i;
        pu9 pu9Var = sj3Var.b0;
        if (z) {
            pu9Var.q1(0, c, 0, i);
        } else {
            pu9Var.setPadding(0, c, 0, i);
        }
        sj3Var.P0.j(sj3Var.X0, sj3Var.Y0, z);
        iv9 iv9Var = sj3Var.c0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iv9Var.getLayoutParams();
        int i2 = marginLayoutParams.topMargin;
        int i3 = sj3Var.X0;
        if (i2 != i3 || marginLayoutParams.bottomMargin != sj3Var.Y0) {
            marginLayoutParams.topMargin = i3;
            marginLayoutParams.bottomMargin = sj3Var.Y0;
            iv9Var.requestLayout();
        }
        vv9.Q(sj3Var.i0, sj3Var.l0, sj3Var.X0, sj3Var.Y0, z);
        vv9.Q(sj3Var.n0, sj3Var.q0, sj3Var.X0, sj3Var.Y0, z);
        vv9.Q(sj3Var.u0, sj3Var.x0, sj3Var.X0, sj3Var.Y0, z);
        ai8 ai8Var = sj3Var.s0;
        int i4 = sj3Var.X0;
        int i5 = sj3Var.Y0;
        ai8Var.setClipToPadding(false);
        q7c q7cVar = ai8Var.c;
        ai8Var.K = z;
        ai8Var.setPadding(0, i4, 0, i5);
        if (z) {
            q7cVar.q1(0, i4, 0, i5);
        } else {
            q7cVar.setPadding(0, i4, 0, i5);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) q7cVar.getLayoutParams();
        marginLayoutParams2.topMargin = -i4;
        marginLayoutParams2.bottomMargin = -i5;
        ai8Var.K = false;
        ju9 ju9Var = sj3Var.J0;
        if (ju9Var != null) {
            ju9Var.b(sj3Var.X0, sj3Var.Y0, z);
        }
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) sparseArray.valueAt(i6);
            if (view instanceof ch4) {
                ((ch4) view).j(sj3Var.X0, sj3Var.Y0, z);
            }
        }
        for (int i7 = 0; i7 < sj3Var.getChildCount(); i7++) {
            if (sj3Var.getChildAt(i7) instanceof ch4) {
                ((ch4) sj3Var.getChildAt(i7)).j(sj3Var.X0, sj3Var.Y0, z);
            }
        }
    }

    public final /* synthetic */ void c4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = oc7.r1(this.currentAccount).n1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new eo0((Object) this, (Object) tL_attachMenuBot, (Object) launchActivity, (byte) 22), 66);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        if ((r25.size() + r11.h.size()) > 100) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c5(hg3 hg3Var) {
        long j;
        int b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        boolean z;
        boolean z2;
        int i;
        ViewGroup viewGroup;
        nk3 nk3Var;
        char c;
        long j2;
        ub7 ub7Var;
        boolean[] zArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        Object[] objArr;
        ?? r5;
        nk3 nk3Var2;
        long j3;
        boolean z3;
        int i2;
        boolean z4;
        Object[] objArr2;
        int i3;
        int i4;
        int i5;
        int i6;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        final long j4;
        int i7;
        int i8;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
        LinearLayout linearLayout;
        a8 a8Var;
        boolean z5;
        boolean z6;
        lj3 lj3Var;
        final nk3 nk3Var3 = this;
        int i9 = nm7.s;
        boolean Y = sd2.Y(hg3Var.h2);
        byte b2 = 0;
        if (!hg3Var.U()) {
            long dialogId = hg3Var.getDialogId();
            Bundle bundle = new Bundle();
            int messageId = hg3Var.getMessageId();
            if (!pg3.B(dialogId)) {
                if (pg3.D(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else if (nk3Var3.a3 == 0 || ((b = yp2.b(nk3Var3.currentAccount, dialogId)) != 4 && b != 3)) {
                    TLRPC.Chat L0 = nk3Var3.getMessagesController().L0(Long.valueOf(-dialogId));
                    if (messageId == 0 || L0 == null || L0.migrated_to == null) {
                        j = dialogId;
                    } else {
                        bundle.putLong("migrated_to", dialogId);
                        j = -L0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -j);
                }
                if (messageId != 0) {
                    bundle.putInt("message_id", messageId);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                boolean z7 = nk3Var3.a3 == 0 && nk3Var3.getMessagesController().l4.H0.f && nk3Var3.getMessagesController().L0 && nk3Var3.getMessagesController().G0 != null && nk3Var3.getMessagesController().G0.size() > 0;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
                if (z7) {
                    LinearLayout linearLayout2 = new LinearLayout(nk3Var3.getParentActivity());
                    linearLayout2.setOrientation(1);
                    lj3 lj3Var2 = new lj3(nk3Var3.getParentActivity(), b2);
                    LinearLayout linearLayout3 = new LinearLayout(nk3Var3.getParentActivity());
                    linearLayout3.setOrientation(1);
                    lj3Var2.addView(linearLayout3);
                    int size = nk3Var3.getMessagesController().G0.size();
                    int i10 = 0;
                    a8 a8Var2 = null;
                    while (i10 < size) {
                        final ub7 ub7Var2 = (ub7) nk3Var3.getMessagesController().G0.get(i10);
                        if (ub7Var2.d()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                            j4 = dialogId;
                        } else {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                            final boolean a = ub7Var2.a(j5.a(nk3Var3.currentAccount), dialogId);
                            j4 = dialogId;
                            final ArrayList D0 = dh4.D0(nk3Var3, ub7Var2, arrayList, true, false);
                            if (!a) {
                            }
                            a8 a8Var3 = new a8(2, null, nk3Var3.getParentActivity(), false, false);
                            a8Var3.setChecked(a);
                            i7 = size;
                            lj3 lj3Var3 = lj3Var2;
                            Spannable A5 = k47.A5(gw3.m(ub7Var2.b, a8Var3.getTextView().getPaint().getFontMetricsInt(), false, null, 0), ub7Var2.c, a8Var3.getTextView().getPaint().getFontMetricsInt(), false);
                            a8Var3.setEmojiCacheType(ub7Var2.n ? 26 : 0);
                            a8Var3.j(A5, 0, new kc2(nk3Var3.getParentActivity(), R.drawable.msg_folders, ub7Var2.m));
                            a8Var3.getTextView().setEmojiColor(nk3Var3.getThemedColor(cmb.Ei));
                            a8Var3.setMinimumWidth(nm7.p2);
                            i8 = i10;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                            linearLayout = linearLayout2;
                            a8Var = a8Var3;
                            z5 = z7;
                            z6 = Y;
                            lj3Var = lj3Var3;
                            dialogId = j4;
                            a8Var.setOnClickListener(new View.OnClickListener() { // from class: sh3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArrayList arrayList2;
                                    long j5;
                                    ub7 ub7Var3 = ub7Var2;
                                    LongSparseIntArray longSparseIntArray = ub7Var3.j;
                                    nk3 nk3Var4 = nk3.this;
                                    boolean z8 = a;
                                    ArrayList arrayList3 = D0;
                                    long j6 = j4;
                                    if (z8) {
                                        ub7Var3.h.remove(Long.valueOf(j6));
                                        ub7Var3.i.add(Long.valueOf(j6));
                                        qf4.z0(ub7Var3, ub7Var3.g, ub7Var3.b, ub7Var3.c, ub7Var3.n, ub7Var3.m, ub7Var3.h, ub7Var3.i, longSparseIntArray, false, false, true, true, false, nk3Var4, null);
                                        nk3Var4.w3().k(j6, 21, Integer.valueOf(arrayList3.size()), ub7Var3, null, null);
                                    } else {
                                        if (arrayList3.isEmpty()) {
                                            arrayList2 = arrayList3;
                                            j5 = j6;
                                        } else {
                                            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                                                ub7Var3.i.remove(arrayList3.get(i11));
                                            }
                                            ub7Var3.h.addAll(arrayList3);
                                            j5 = j6;
                                            arrayList2 = arrayList3;
                                            qf4.z0(ub7Var3, ub7Var3.g, ub7Var3.b, ub7Var3.c, ub7Var3.n, ub7Var3.m, ub7Var3.h, ub7Var3.i, longSparseIntArray, false, false, true, true, false, nk3Var4, null);
                                            ub7Var3 = ub7Var3;
                                        }
                                        nk3Var4.w3().k(j5, 20, Integer.valueOf(arrayList2.size()), ub7Var3, null, null);
                                    }
                                    nk3Var4.A3(true);
                                    nk3Var4.finishPreviewFragment();
                                }
                            });
                            linearLayout3.addView(a8Var);
                            nk3Var3 = this;
                            lj3Var2 = lj3Var;
                            linearLayout2 = linearLayout;
                            Y = z6;
                            size = i7;
                            z7 = z5;
                            a8Var2 = a8Var;
                            i10 = i8 + 1;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                        }
                        linearLayout = linearLayout2;
                        z6 = Y;
                        i8 = i10;
                        a8Var = a8Var2;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                        dialogId = j4;
                        i7 = size;
                        lj3Var = lj3Var2;
                        z5 = z7;
                        nk3Var3 = this;
                        lj3Var2 = lj3Var;
                        linearLayout2 = linearLayout;
                        Y = z6;
                        size = i7;
                        z7 = z5;
                        a8Var2 = a8Var;
                        i10 = i8 + 1;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                    ViewGroup viewGroup2 = linearLayout2;
                    z = Y;
                    z2 = z7;
                    a8 a8Var4 = a8Var2;
                    i = nm7.p2;
                    lj3 lj3Var4 = lj3Var2;
                    if (a8Var4 != null) {
                        a8Var4.m(false, true);
                    }
                    if (linearLayout3.getChildCount() <= 0) {
                        viewGroup = viewGroup2;
                        z2 = false;
                    } else {
                        j8 j8Var = new j8(cmb.G8, getResourceProvider(), getParentActivity());
                        j8Var.setTag(R.id.fit_width_tag, 1);
                        a8 a8Var5 = new a8(getParentActivity(), true, false);
                        a8Var5.j(jb6.M0(2131753721, null), R.drawable.ic_ab_back, null);
                        a8Var5.setMinimumWidth(nm7.p2);
                        a8Var5.setOnClickListener(new sf3(actionBarPopupWindow$ActionBarPopupWindowLayoutArr, (byte) 1));
                        viewGroup2.addView(a8Var5);
                        viewGroup2.addView(j8Var, qoe.o(-1, 8));
                        viewGroup2.addView(lj3Var4);
                        viewGroup = viewGroup2;
                    }
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                    z = Y;
                    z2 = z7;
                    i = nm7.p2;
                    viewGroup = null;
                }
                byte b3 = 2;
                Object[] objArr3 = new d[1];
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z2 ? 3 : 2, getResourceProvider(), getParentActivity());
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
                if (z2) {
                    int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(viewGroup)};
                    a8 a8Var6 = new a8(getParentActivity(), true, false);
                    a8Var6.j(jb6.M0(2131750749, null), R.drawable.msg_addfolder, null);
                    a8Var6.setMinimumWidth(i);
                    a8Var6.setOnClickListener(new tf3(actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr, b3));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(a8Var6);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new wm2(objArr3, (byte) 24));
                }
                if (z) {
                    nk3Var = this;
                    c = 0;
                } else {
                    a8 a8Var7 = new a8(getParentActivity(), !z2, false);
                    if (hg3Var.getHasUnread()) {
                        a8Var7.j(jb6.M0(2131748438, null), R.drawable.msg_markread, null);
                    } else {
                        a8Var7.j(jb6.M0(2131748437, null), R.drawable.msg_markunread, null);
                    }
                    a8Var7.setMinimumWidth(i);
                    nk3Var = this;
                    long j5 = dialogId;
                    dialogId = j5;
                    a8Var7.setOnClickListener(new fh(nk3Var, hg3Var, j5, (byte) 3));
                    c = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(a8Var7);
                }
                boolean[] zArr2 = new boolean[1];
                zArr2[c] = true;
                TLRPC.Dialog dialog = (TLRPC.Dialog) nk3Var.getMessagesController().R.f(dialogId);
                int i11 = nk3Var.f0[c].s;
                boolean z8 = (i11 == 7 || i11 == 8) && (!nk3Var.actionBar.y() || nk3Var.actionBar.z(null));
                if (z8) {
                    j2 = dialogId;
                    ub7Var = nk3Var.getMessagesController().N[nk3Var.f0[0].s == 8 ? (char) 1 : (char) 0];
                } else {
                    j2 = dialogId;
                    ub7Var = null;
                }
                if (nk3Var.H3(dialog)) {
                    zArr = zArr2;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
                    objArr = objArr3;
                    r5 = 0;
                } else {
                    ArrayList V0 = nk3Var.getMessagesController().V0(nk3Var.Y2);
                    int size2 = V0.size();
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            zArr = zArr2;
                            z4 = z8;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
                            objArr2 = objArr3;
                            break;
                        }
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) V0.get(i12);
                        zArr = zArr2;
                        if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                            z4 = z8;
                            if (!nk3Var.H3(dialog2)) {
                                i6 = size2;
                                actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
                                objArr2 = objArr3;
                                if (!nk3Var.getMessagesController().D2(dialog2.id, false)) {
                                    break;
                                }
                                i12++;
                                z8 = z4;
                                size2 = i6;
                                zArr2 = zArr;
                                actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                                objArr3 = objArr2;
                            } else {
                                i6 = size2;
                                if (pg3.B(dialog2.id)) {
                                    i14++;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            z4 = z8;
                            i6 = size2;
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
                        objArr2 = objArr3;
                        i12++;
                        z8 = z4;
                        size2 = i6;
                        zArr2 = zArr;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                        objArr3 = objArr2;
                    }
                    if (dialog == null || nk3Var.H3(dialog)) {
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                    } else {
                        boolean B = pg3.B(j2);
                        int i15 = !B ? 1 : 0;
                        if (ub7Var == null || !ub7Var.h.contains(Long.valueOf(j2))) {
                            i5 = i15;
                            i4 = B ? 1 : 0;
                            i3 = 0;
                        } else {
                            i5 = i15;
                            i4 = B ? 1 : 0;
                            i3 = 1;
                        }
                    }
                    int f = (!z4 || ub7Var == null) ? (nk3Var.Y2 == 0 && ub7Var == null) ? nk3Var.getUserConfig().p() ? nk3Var.getMessagesController().l4.Y0.f() : nk3Var.getMessagesController().l4.X0.f() : nk3Var.getUserConfig().p() ? nk3Var.getMessagesController().e3 : nk3Var.getMessagesController().d3 : 100 - ub7Var.h.size();
                    boolean z9 = i4 + i14 <= f && (i5 + i13) - i3 <= f;
                    r5 = 0;
                    zArr[0] = z9;
                    objArr = objArr2;
                }
                if (zArr[r5]) {
                    a8 a8Var8 = new a8(nk3Var.getParentActivity(), (z2 || !z) ? r5 : true, r5);
                    if (nk3Var.H3(dialog)) {
                        a8Var8.j(jb6.M0(2131743531, null), R.drawable.msg_unpin, null);
                    } else {
                        a8Var8.j(jb6.M0(2131746978, null), R.drawable.msg_pin, null);
                    }
                    a8Var8.setMinimumWidth(nm7.p2);
                    long j6 = j2;
                    yo0 yo0Var = new yo0(nk3Var, ub7Var, dialog, j6, (byte) 2);
                    nk3Var2 = nk3Var;
                    j3 = j6;
                    a8Var8.setOnClickListener(yo0Var);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2[0].addView(a8Var8);
                } else {
                    nk3Var2 = nk3Var;
                    j3 = j2;
                }
                if (pg3.D(j3) && m9c.D(nk3Var2.getMessagesController().W1(Long.valueOf(j3)))) {
                    z3 = true;
                    i2 = 0;
                } else {
                    a8 a8Var9 = new a8(nk3Var2.getParentActivity(), false, false);
                    if (nk3Var2.getMessagesController().o2(j3, 0L, null)) {
                        a8Var9.j(jb6.M0(2131743536, null), R.drawable.msg_unmute, null);
                    } else {
                        a8Var9.j(jb6.M0(2131748071, null), R.drawable.msg_mute, null);
                    }
                    a8Var9.setMinimumWidth(nm7.p2);
                    z3 = true;
                    a8Var9.setOnClickListener(new lz(nk3Var2, j3, true ? 1 : 0));
                    i2 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2[0].addView(a8Var9);
                }
                if (z) {
                    if (nk3Var2.p2 != null) {
                        nk3Var2.getNotificationCenter().k(i9, new Object[i2]);
                    }
                    nk3Var2.M4();
                    nk3Var2.parentLayout.setHighlightActionButtons(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", -j3);
                    nk3 nk3Var4 = new nk3(bundle2);
                    Point point = gm.q;
                    if (point.x > point.y) {
                        objArr[0] = nk3Var4;
                        nk3Var2.presentFragmentAsPreview(nk3Var4);
                        return false;
                    }
                    objArr[0] = nk3Var4;
                    nk3Var2.presentFragmentAsPreviewWithMenu(nk3Var4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr2[0]);
                    return false;
                }
                a8 a8Var10 = new a8(nk3Var2.getParentActivity(), i2, z3);
                a8Var10.setIconColor(nk3Var2.getThemedColor(cmb.o7));
                int i16 = cmb.p7;
                a8Var10.setTextColor(nk3Var2.getThemedColor(i16));
                a8Var10.h(0.12f, i16);
                a8Var10.j(jb6.M0(2131751535, null), R.drawable.msg_delete, null);
                a8Var10.setMinimumWidth(nm7.p2);
                a8Var10.setOnClickListener(new tf3(nk3Var2, arrayList, (byte) 3));
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr2[0].addView(a8Var10);
                if (!nk3Var2.getMessagesController().A(bundle, nk3Var2, null, null)) {
                    return false;
                }
                if (nk3Var2.p2 != null) {
                    nk3Var2.getNotificationCenter().k(i9, new Object[0]);
                }
                nk3Var2.M4();
                nk3Var2.parentLayout.setHighlightActionButtons(true);
                yv1 yv1Var = new yv1(bundle);
                Point point2 = gm.q;
                if (point2.x > point2.y) {
                    objArr[0] = yv1Var;
                    nk3Var2.presentFragmentAsPreview(yv1Var);
                    return true;
                }
                objArr[0] = yv1Var;
                nk3Var2.presentFragmentAsPreviewWithMenu(yv1Var, actionBarPopupWindow$ActionBarPopupWindowLayoutArr2[0]);
                yv1Var.ga = true;
                try {
                    yv1Var.p1.getAvatarImageView().performAccessibilityAction(64, null);
                } catch (Exception unused) {
                }
                return true;
            }
        } else if (hg3Var.getCurrentDialogFolderId() == 1) {
            B4(hg3Var);
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        ak3 ak3Var;
        if (this.H3.c()) {
            return false;
        }
        return this.T0 != 3 || (ak3Var = this.A0) == null || ak3Var.getVisibility() != 0 || this.A0.L <= 0;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean closeLastFragment() {
        if (!this.H3.c()) {
            return super.closeLastFragment();
        }
        this.H3.a();
        sj3 sj3Var = this.D0;
        if (sj3Var == null) {
            return true;
        }
        sj3Var.S();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final a createActionBar(Context context) {
        x20 x20Var = new x20(this, context, this.resourceProvider, (byte) 2);
        x20Var.setAllowOverlayTitle(true);
        x20Var.H0 = true;
        if (x20Var.G0 == null) {
            a6 a6Var = new a6(x20Var.getContext(), (byte) 0);
            x20Var.G0 = a6Var;
            x20Var.addView(a6Var);
        }
        anb.l(x20Var, 3, cmb.s8, getResourceProvider());
        anb.a(x20Var, cmb.y8, getResourceProvider(), true);
        anb.l(x20Var, 1, cmb.u8, getResourceProvider());
        anb.b(x20Var, cmb.x8, getResourceProvider(), true);
        if (x20Var.y1 == null) {
            b6 b6Var = new b6(x20Var, x20Var.getContext(), x20Var.K0, x20Var.P0);
            x20Var.y1 = b6Var;
            b6Var.setClipChildren(false);
            x20Var.addView(x20Var.y1);
        }
        x20Var.getAdditionalSubTitleOverlayContainer().setTranslationX(gm.L(4.0f));
        x20Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-gm.L(3.0f));
        if (!this.inPreviewMode && (!gm.O1() || this.Y2 == 0 || F3())) {
            return x20Var;
        }
        x20Var.setOccupyStatusBar(false);
        return x20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0c26  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0c4f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0c8f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0ca5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0ccc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0d80  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0ddd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0e15  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0d9a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0c57  */
    /* JADX WARN: Type inference failed for: r0v100, types: [org.telegram.ui.ActionBar.a] */
    /* JADX WARN: Type inference failed for: r0v178, types: [jk3, r59] */
    /* JADX WARN: Type inference failed for: r0v27, types: [va2] */
    /* JADX WARN: Type inference failed for: r10v40, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r3v18, types: [l7, org.telegram.ui.Components.EditTextBoldCursor] */
    /* JADX WARN: Type inference failed for: r3v26, types: [org.telegram.ui.ActionBar.a] */
    /* JADX WARN: Type inference failed for: r3v288, types: [android.view.ViewGroup, r7] */
    /* JADX WARN: Type inference failed for: r5v2, types: [km0] */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f;
        byte b;
        float f2;
        float f3;
        yv1 yv1Var;
        ak3 ak3Var;
        zj3 zj3Var;
        zj3 zj3Var2;
        qk3 qk3Var;
        ArrayList arrayList;
        hk3 hk3Var;
        int i;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r10;
        int i2;
        Context context2 = context;
        byte b2 = 0;
        ?? r11 = 0;
        ?? r112 = 0;
        ?? r113 = 0;
        this.l2 = false;
        this.m2 = false;
        this.W = false;
        this.X0 = null;
        this.A0 = null;
        ArrayList arrayList2 = this.K2;
        arrayList2.clear();
        this.n3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        byte b3 = 1;
        gm.c3(new dh1(context2, b3));
        this.P1 = null;
        this.N1 = null;
        this.O1 = null;
        this.S1 = null;
        this.L1 = null;
        r6 t = this.actionBar.t();
        t.setTranslationX(-gm.L(5.0f));
        r7 a = t.a(0, R.drawable.outline_header_search);
        a.N();
        this.k0 = a;
        byte b4 = 3;
        a.setOnClickListener(new mh3(this, b4));
        byte b5 = 8;
        byte b6 = 2;
        if (this.T0 == 2 || (F3() && o3(this.currentAccount, this.T0, this.Y2, false).isEmpty())) {
            this.k0.setVisibility(8);
        }
        this.k0.setVisibility(8);
        float f4 = 0.0f;
        if (!this.n2 && this.p2 == null && this.Y2 == 0 && this.a3 == 0) {
            int i3 = cmb.s8;
            int themedColor = getThemedColor(i3);
            int i4 = cmb.u8;
            r7 r7Var = new r7(context2, themedColor, getThemedColor(i4));
            this.n0 = r7Var;
            r7Var.setText(jb6.L0(2131751291).toUpperCase());
            if (this.n0.getTextView() != null) {
                anb.X(this.n0.getTextView(), i4, getResourceProvider());
            }
            r7 r7Var2 = this.n0;
            anb.R(r7Var2, r7Var2.getBackground(), null, anb.M(i3), getResourceProvider());
            this.actionBar.addView(this.n0, qoe.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.n0.setOnClickListener(new mh3(this, b5));
            this.n0.setAlpha(0.0f);
            this.n0.setVisibility(8);
            this.o0 = new uv8(context2);
            a8 a8Var = new a8(this.resourceProvider, context2, false, true);
            this.p0 = a8Var;
            a8Var.setItemHeight(56);
            this.p0.j(jb6.L0(2131748362), 0, this.o0);
            this.p0.setContentDescription(jb6.L0(2131746334));
            r7 a2 = t.a(1, R.drawable.outline_header_lock_24);
            this.g0 = a2;
            a2.setContentDescription(jb6.L0(2131754812));
            ?? d = t.d(3, new ColorDrawable(0));
            this.h0 = d;
            hr3 hr3Var = new hr3(context2, this.currentAccount);
            this.i0 = hr3Var;
            d.addView(hr3Var);
            this.h0.setContentDescription(jb6.L0(2131751280));
            this.h0.setVisibility(8);
            w5(false, false);
        }
        zj3 zj3Var3 = new zj3(context2, this.resourceProvider);
        this.Y = zj3Var3;
        zj3Var3.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        byte b7 = 9;
        if (this.T0 == 0) {
            r7 a3 = t.a(-47, R.drawable.avd_speed);
            this.m0 = a3;
            gm.B2(a3);
            this.m0.setOnClickListener(new mh3(this, b7));
            this.Y.a(this.m0);
            this.Y.updateColors();
        }
        this.Y.setCloseButtonOnClickListener(new kh3(this, (byte) 25));
        this.Y.r.setOnFocusChangeListener(new tt0(this, (byte) 5));
        ?? r3 = this.Y.r;
        byte b8 = 10;
        av9 av9Var = new av9(r3, new q20(this, b8));
        this.Z = av9Var;
        r3.addTextChangedListener(av9Var);
        this.Y.setSearchFiltersListener(new pj3(this));
        this.Z.a();
        if (this.T0 == 0) {
            r7 a4 = t.a(4, R.drawable.ic_ab_other);
            this.l0 = a4;
            a4.setContentDescription(jb6.L0(2131754838));
            this.l0.setOnClickListener(new mh3(this, b8));
            this.l0.setOnLongClickListener(new uh3(this, b4));
        }
        this.k0.setSearchFieldHint(jb6.L0(2131745570));
        this.k0.setContentDescription(jb6.L0(2131745570));
        if (this.n2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i5 = this.T0;
            if (i5 == 16) {
                this.actionBar.setTitle(jb6.L0(2131753065));
            } else if (this.O0) {
                this.actionBar.setTitle(jb6.L0(2131745985));
            } else if (this.P0) {
                this.actionBar.setTitle(jb6.L0(2131746162));
            } else if (i5 == 3 && this.h2 == null) {
                this.actionBar.setTitle(jb6.L0(2131750507));
            } else if (i5 == 10) {
                this.actionBar.setTitle(jb6.L0(2131745402));
            } else if (i5 == 14) {
                boolean z = this.C2;
                if (!z || this.B2 || this.x2 || this.A2) {
                    boolean z2 = this.B2;
                    if (!z2 || z || this.x2 || this.A2) {
                        boolean z3 = this.x2;
                        if (!z3 || z2 || z) {
                            i2 = 2131745403;
                        } else {
                            i2 = 2131745403;
                            if (!this.A2) {
                                this.actionBar.setTitle(jb6.L0(2131752062));
                            }
                        }
                        if (!this.A2 || z2 || z || z3) {
                            this.actionBar.setTitle(jb6.L0(i2));
                        } else {
                            this.actionBar.setTitle(jb6.L0(2131752072));
                        }
                    } else {
                        this.actionBar.setTitle(jb6.L0(2131752047));
                    }
                } else {
                    this.actionBar.setTitle(jb6.L0(2131752074));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.H;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        a aVar = this.actionBar;
                        if (booleanValue) {
                            aVar.setTitle(jb6.L0(2131752074));
                        } else {
                            aVar.setTitle(jb6.L0(2131752047));
                        }
                    } else {
                        this.actionBar.setTitle(jb6.L0(2131752047));
                    }
                } else {
                    boolean z4 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                    a aVar2 = this.actionBar;
                    if (z4) {
                        aVar2.setTitle(jb6.L0(2131752072));
                    } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                        aVar2.setTitle(jb6.L0(2131752062));
                    } else {
                        aVar2.setTitle(jb6.L0(2131745403));
                    }
                }
            }
            anb.h(cmb.c6, getResourceProvider(), this.actionBar);
        } else {
            if (this.p2 != null || this.Y2 != 0 || this.a3 != 0) {
                ?? r32 = this.actionBar;
                ee0 ee0Var = new ee0(false);
                this.g1 = ee0Var;
                r32.setBackButtonDrawable(ee0Var);
            }
            if (this.Y2 != 0) {
                this.actionBar.setTitle(jb6.L0(2131754101));
            } else if (this.a3 != 0) {
                this.actionBar.setTitle(pg3.l(this.b3));
                this.actionBar.setAdditionalTextLeft(gm.L(28.0f));
                this.e3 = new pc0(this.b3);
                bf0 bf0Var = new bf0(getContext());
                this.d3 = bf0Var;
                bf0Var.setRoundRadius(gm.L(11.0f));
                this.d3.f(this.b3, this.e3);
                this.actionBar.addView(this.d3, qoe.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                tm tmVar = new tm(gm.L(26.0f), null);
                this.F3 = tmVar;
                tmVar.a = true;
                Drawable d2 = b10.d(context2, R.drawable.telegram_logo_2);
                this.E3 = d2;
                d2.setBounds(0, gm.L(2.0f), this.E3.getIntrinsicWidth(), this.E3.getIntrinsicHeight() + gm.L(2.0f));
                Drawable drawable = this.E3;
                int themedColor2 = getThemedColor(cmb.Wl);
                this.C4 = themedColor2;
                drawable.setColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.L0(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.E3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.M(spannableStringBuilder, this.F3);
                B5(z8c.h(this.currentAccount).f(), false);
            }
            if (this.Y2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setTitleActionRunnable(new kh3(this, (byte) 26));
        int i6 = this.T0;
        if (((i6 == 0 && !this.n2) || i6 == 3) && this.Y2 == 0 && this.a3 == 0 && TextUtils.isEmpty(this.p2)) {
            ak3 ak3Var2 = new ak3(this, context2, this.resourceProvider);
            this.A0 = ak3Var2;
            ak3Var2.setVisibility(8);
            this.x = false;
            this.r.a(false, false);
            this.A0.setDelegate(new dk3(this, context2));
        }
        byte b9 = 11;
        int i7 = 17;
        if (this.t2 && z8c.c() > 1) {
            this.F1 = t.g(11, 0, gm.L(56.0f));
            pc0 pc0Var = new pc0();
            pc0Var.s(gm.L(12.0f));
            bf0 bf0Var2 = new bf0(context2);
            bf0Var2.setRoundRadius(gm.L(18.0f));
            this.F1.addView(bf0Var2, qoe.e(36, 36, 17));
            this.F1.setOnClickListener(new mh3(this, b9));
            this.F1.setOnLongClickListener(new uh3(this, b6));
            TLRPC.User f5 = getUserConfig().f();
            pc0Var.q(f5);
            ImageReceiver imageReceiver = bf0Var2.getImageReceiver();
            int i8 = this.currentAccount;
            imageReceiver.d = i8;
            bf0Var2.j(gn5.m(i8, 1, f5), "50_50", gn5.n(f5), "50_50", (f5 == null || (userProfilePhoto = f5.photo) == null || (r10 = userProfilePhoto.strippedBitmap) == null) ? pc0Var : r10, f5);
        }
        this.actionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 13));
        gk3 gk3Var = new gk3(this, context2);
        this.fragmentView = gk3Var;
        this.y4 = new ai3(this, gk3Var, new PointF(), b2);
        int i9 = (this.Y2 == 0 && this.a3 == 0 && (((i = this.T0) == 0 && !this.n2) || i == 3)) ? 2 : 1;
        this.f0 = new mk3[i9];
        int i10 = 0;
        while (i10 < i9) {
            mk3 mk3Var = new mk3(this, context2);
            gk3Var.addView(mk3Var, qoe.c(-1.0f, -1));
            mk3Var.s = this.T0;
            this.f0[i10] = mk3Var;
            tk4 tk4Var = new tk4(context2);
            mk3Var.x = tk4Var;
            tk4Var.setViewType(7);
            mk3Var.x.setVisibility(8);
            mk3Var.addView(mk3Var.x, qoe.e(-2, -2, i7));
            jk3 jk3Var = new jk3(this, context2, mk3Var);
            mk3Var.a = jk3Var;
            this.glassEngine.b(jk3Var);
            jk3 jk3Var2 = mk3Var.a;
            mk3Var.b = new kq(jk3Var2);
            jk3Var2.setAllowStopHeaveOperations(true);
            mk3Var.a.setAccessibilityEnabled(false);
            mk3Var.a.p1(0, true);
            mk3Var.a.setClipToPadding(false);
            mk3Var.a.setPivotY(f4);
            if (this.T0 == 15) {
                anb.h(cmb.Z6, getResourceProvider(), mk3Var.a);
            }
            mk3Var.y = new ki3(mk3Var.a, mk3Var);
            mk3Var.a.setVerticalScrollBarEnabled(true);
            mk3Var.a.setInstantClick(true);
            mi3 mi3Var = new mi3(this, mk3Var);
            mk3Var.c = mi3Var;
            mi3Var.i1(1);
            mk3Var.a.setLayoutManager(mk3Var.c);
            mk3Var.a.setVerticalScrollbarPosition(jb6.a0 ? 1 : 2);
            mk3Var.addView(mk3Var.a, qoe.c(-1.0f, -1));
            mk3Var.a.setOnItemClickListener(new x92((Object) this, (Object) mk3Var, (byte) 23));
            mk3Var.a.setOnItemLongClickListener(new hi2(this, mk3Var, r113 == true ? 1 : 0, (byte) 24));
            mk3Var.f = new lk3(this, mk3Var);
            mk3Var.E = new w49(mk3Var.a, false);
            hu5 hu5Var = new hu5(mk3Var.f);
            mk3Var.e = hu5Var;
            hu5Var.h(mk3Var.a);
            mk3Var.a.setOnScrollListener(new oi3(this, mk3Var, gk3Var));
            mk3Var.w = gda.m1 ? (byte) 2 : (byte) 0;
            if (mk3Var.n == null && this.Y2 == 0) {
                arrayList = arrayList2;
                if (this.a3 == 0) {
                    mk3Var.n = new pi3(jb6.L0(2131754719), jb6.L0(2131754721), mk3Var);
                    boolean y3 = y3();
                    pi3 pi3Var = mk3Var.n;
                    if (y3) {
                        pi3Var.g();
                    } else {
                        pi3Var.b();
                    }
                    mk3Var.n.X = mk3Var.w != 0;
                }
            } else {
                arrayList = arrayList2;
            }
            gk3 gk3Var2 = gk3Var;
            arrayList2 = arrayList;
            int i11 = i10;
            int i12 = i9;
            byte b10 = 13;
            qi3 qi3Var = new qi3(this, this, context, mk3Var.s, this.Y2, this.n2, arrayList2, this.currentAccount, this.H, mk3Var);
            context2 = context;
            mk3Var.d = qi3Var;
            qi3Var.L = mk3Var.a;
            qi3Var.R = this.v2;
            if (mk3Var.s == 3) {
                qi3Var.n = getMessagesController().e5() && (hk3Var = this.E2) != null && hk3Var.E();
            }
            if (gm.O1()) {
                long j = this.r2.a;
                if (j != 0) {
                    mk3Var.d.s = j;
                }
            }
            qi3 qi3Var2 = mk3Var.d;
            qi3Var2.M = mk3Var.n;
            mk3Var.a.setAdapter(qi3Var2);
            mk3Var.a.setEmptyView((this.Y2 == 0 && this.a3 == 0) ? mk3Var.x : null);
            cw6 cw6Var = new cw6(mk3Var.a, mk3Var.c);
            mk3Var.r = cw6Var;
            cw6Var.c = true;
            cw6Var.d = true;
            cw6Var.n = new nh3(this, b10);
            if (i11 != 0) {
                this.f0[i11].setVisibility(8);
            }
            i10 = i11 + 1;
            gk3Var = gk3Var2;
            i9 = i12;
            f4 = 0.0f;
            i7 = 17;
        }
        gk3 gk3Var3 = gk3Var;
        pk3 pk3Var = new pk3(context2);
        this.M1 = pk3Var;
        int i13 = cmb.c6;
        pk3Var.setColor(cmb.u0(i13));
        gk3Var3.addView(this.M1, qoe.e(-1, 100, 48));
        this.C0 = gk3Var3.getChildCount();
        nu9 nu9Var = new nu9((Activity) getContext());
        this.a0 = nu9Var;
        gk3Var3.addView(nu9Var, qoe.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        nu9 nu9Var2 = this.a0;
        nm0 n = qqd.n(this.resourceProvider);
        ?? r5 = this.w4;
        im0 b11 = r5.b(nu9Var2, n);
        wi8.r(b11, gm.L(18.0f), 6.666f);
        this.a0.setPadding(0, gm.L(7.0f), 0, gm.L(7.0f));
        this.a0.setBlurredBackground(b11);
        uh4 uh4Var = new uh4(getParentActivity(), null);
        this.c0 = uh4Var;
        uh4Var.setPadding(0, gm.L(3.0f), 0, gm.L(3.0f));
        uh4 uh4Var2 = this.c0;
        uh4Var2.i3 = false;
        uh4Var2.setOnItemClickListener(new qh3(this, b3));
        this.a0.addView(this.c0, qoe.e(-1, -1, 48));
        wp4 wp4Var = new wp4(this.resourceProvider, context2, true);
        this.v0 = wp4Var;
        wp4Var.setContentDescription(jb6.L0(2131744244));
        this.v0.setImageResource(R.drawable.outline_fab_story_24);
        this.v0.setOnClickListener(new mh3(this, (byte) 27));
        gk3Var3.addView(this.v0, wp4.c());
        wp4 wp4Var2 = new wp4(context2, this.resourceProvider);
        this.u0 = wp4Var2;
        gk3Var3.addView(wp4Var2, wp4.b());
        this.u0.setOnClickListener(new mh3(this, (byte) 28));
        if (!F3() && this.T0 == 0 && oc7.r1(this.currentAccount).X3.getBoolean("storyhint", true)) {
            hg5 hg5Var = new hg5(context2, 2);
            hg5Var.q(8.0f);
            hg5Var.d = 8000L;
            hg5Var.j(true);
            hg5Var.h = gm.L(165.0f);
            hg5Var.p(true);
            f = 8.0f;
            hg5Var.t(gm.G2(jb6.L0(2131744401), v9b.k(context2), "%s"));
            hg5Var.n(1.0f, -40.0f);
            hg5Var.i(getThemedColor(cmb.vj));
            hg5Var.r0 = new di3(this, (byte) 11);
            this.q0 = hg5Var;
            gk3Var3.addView(hg5Var, qoe.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        } else {
            f = 8.0f;
        }
        C5();
        this.b0 = null;
        if (this.n2 || this.T0 != 0) {
            byte b12 = 5;
            b = 4;
            f2 = 72.0f;
            if (this.T0 == 3 || e3()) {
                va2 va2Var = new va2(context2);
                this.A1 = va2Var;
                va2Var.setClipChildren(false);
                ?? r0 = this.A1;
                g0d g0dVar = this.w;
                r0.setWindowInsetsProvider(g0dVar);
                va2 va2Var2 = this.A1;
                va2Var2.setInputIslandBubbleDrawable(r5.b(va2Var2, qqd.n(this.resourceProvider)));
                va2 va2Var3 = this.A1;
                va2Var3.setUnderKeyboardBackgroundDrawable(this.u4.b(va2Var3, qqd.n(this.resourceProvider)));
                qm0 qm0Var = new qm0(this.x4.b(this.A1, null));
                if (!gda.f() || e86.e(262144)) {
                    qm0Var.b(gm.L(72.0f), true);
                }
                this.A1.setBackgroundWithFadeDrawable(qm0Var);
                FrameLayout inputIslandBubbleContainer = this.A1.getInputIslandBubbleContainer();
                this.B1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.C1 = this.A1.getInAppKeyboardBubbleContainer();
                ti3 ti3Var = this.D1;
                if (ti3Var != null) {
                    ti3Var.d1();
                }
                ti3 ti3Var2 = new ti3(this, getParentActivity(), gk3Var3);
                this.D1 = ti3Var2;
                ti3Var2.setInAppInsetsController(g0dVar);
                this.D1.X5 = false;
                gk3Var3.setClipChildren(false);
                gk3Var3.setClipToPadding(false);
                ti3 ti3Var3 = this.D1;
                ti3Var3.W5 = false;
                ti3Var3.Y2 = !gm.E && ((yv1Var = ti3Var3.F3) == null || !yv1Var.isInBubbleMode());
                this.D1.y1(false, false);
                this.D1.K1(true, false);
                this.D1.p2.setPadding(0, gm.L(1.0f), gm.L(20.0f), 0);
                f3 = 0.0f;
                this.D1.getSendButton().setAlpha(0.0f);
                this.D1.setViewParentForEmoji(this.C1);
                this.B1.addView(this.D1, qoe.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                gk3Var3.addView(this.A1.getFadeView(), qoe.c(-1.0f, -1));
                gk3Var3.addView(this.A1, qoe.c(-1.0f, -1));
                if (z3() || this.G2 != null || this.H2 != null) {
                    D2(this.b4);
                    this.b4 = null;
                }
                this.D1.setDelegate(new ui3(this));
                vi3 vi3Var = new vi3(this, context2, this.resourceProvider);
                this.E1 = vi3Var;
                int L = gm.L(52.0f);
                int L2 = gm.L(38.0f);
                vi3Var.L = L;
                vi3Var.M = L2;
                vi3 vi3Var2 = this.E1;
                float L3 = gm.L(7.0f);
                float L4 = gm.L(f);
                vi3Var2.P = L3;
                vi3Var2.Q = L4;
                vi3 vi3Var3 = this.E1;
                vi3Var3.s0 = true;
                gk3Var3.addView(vi3Var3, qoe.e(nm7.u1, 50, 85));
                this.E1.setScrimViewBackgroundColor(getThemedColor(i13));
                this.E1.setOnClickListener(new mh3(this, b12));
                this.E1.setOnLongClickListener(new uh3(this, r11 == true ? 1 : 0));
                this.E1.setVisibility(8);
                this.E1.setScaleX(0.2f);
                this.E1.setScaleY(0.2f);
                this.E1.setAlpha(0.0f);
                hg9.o(this.G1, gm.L(12.0f));
                ak3Var = this.A0;
                if (ak3Var != null) {
                    im0 b13 = r5.b(ak3Var, qqd.n(this.resourceProvider));
                    wi8.r(b13, gm.L(18.0f), 6.666f);
                    this.A0.setPadding(0, gm.L(7.0f), 0, gm.L(7.0f));
                    this.A0.setBlurredBackground(b13);
                    this.A0.j(new kh3(this, (byte) 19), new kh3(this, (byte) 22));
                    gk3Var3.addView(this.A0, qoe.d(-1, -2.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                zj3Var = this.Y;
                if (zj3Var != null) {
                    zj3Var.setupBlurredBackground(r5.b(zj3Var, qqd.n(this.resourceProvider)));
                }
                aj3 aj3Var = new aj3(this, context2, this, this.currentAccount, F3() ? 1 : 0);
                this.F0 = aj3Var;
                aj3Var.setActionBar(this.actionBar);
                this.F0.setMenuItemsOffset(!F3() ? gm.L(68.0f) : gm.N(16.66f));
                aj3 aj3Var2 = this.F0;
                aj3Var2.m0 = false;
                aj3Var2.setVisibility(8);
                this.N = false;
                this.M = false;
                this.L = false;
                if (this.n2 && this.T0 == 3) {
                    oc7.r1(this.currentAccount).H1();
                }
                gk3Var3.addView(this.actionBar, qoe.c(-2.0f, -1));
                if (!this.n2) {
                    yn ynVar = new yn(context2);
                    this.G3 = ynVar;
                    gk3Var3.addView(ynVar, qoe.e(20, 20, 51));
                }
                zj3Var2 = this.Y;
                if (zj3Var2 != null) {
                    gk3Var3.addView(zj3Var2, qoe.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.y0 = gk3Var3.getChildCount();
                UndoView[] undoViewArr = this.z0;
                undoViewArr[0] = null;
                undoViewArr[1] = null;
                if (this.X) {
                    this.actionBar.getTitlesContainer().setTranslationX(gm.L(4.0f));
                    anb.d(this.actionBar, cmb.Wl, getResourceProvider());
                }
                if (this.Y2 == 0 || this.a3 != 0) {
                    this.f0[0].a.setGlowColor(getThemedColor(i13));
                    anb.b(this.actionBar, cmb.N8, getResourceProvider(), false);
                    anb.a(this.actionBar, cmb.M8, getResourceProvider(), false);
                    this.actionBar.L(getThemedColor(cmb.P8), false);
                    this.actionBar.L(getThemedColor(cmb.Q8), true);
                }
                if (!this.n2 && this.T0 == 0) {
                    sb sbVar = new sb((byte) 12, context2, this);
                    this.L0 = sbVar;
                    sbVar.setForeground(new ColorDrawable(on2.p(getThemedColor(i13), 100)));
                    this.L0.setFocusable(false);
                    this.L0.setImportantForAccessibility(2);
                    this.L0.setOnClickListener(new mh3(this, (byte) 7));
                    this.L0.setVisibility(8);
                    gk3Var3.addView(this.L0, qoe.c(-1.0f, -1));
                }
                this.h1.setColor(getThemedColor(i13));
                this.s3 = false;
                if (this.p2 == null) {
                    k5(true, false, false, false);
                    this.Y.r.setText(this.p2);
                    this.Y.r.setSelection(this.p2.length());
                } else if (this.q2 != null) {
                    k5(true, false, false, true);
                    this.Z.b(true);
                    this.Y.r.setText(this.q2);
                    this.Y.r.setSelection(this.q2.length());
                    this.q2 = null;
                    zj3 zj3Var4 = this.Y;
                    if (zj3Var4 != null) {
                        zj3Var4.setTranslationY(u3() + (-gm.L(36.0f)));
                    }
                } else {
                    k5(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.a(this);
                }
                this.actionBar.setDrawBlurBackground(gk3Var3);
                this.H3 = new dj3(this, context2, gk3Var3, context2);
                s5(true, false);
                this.H3.setOpenProgress(f3);
                gk3Var3.addView(this.F0, qoe.c(81.0f, -1));
                gk3Var3.addView(this.H3, qoe.c(-1.0f, -1));
                this.G0 = new ok3(context2);
                qk3Var = this.L1;
                if (qk3Var != null) {
                    gk3Var3.addView(qk3Var, qoe.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.a3 != 0 && this.T0 != 3 && sd2.c(this.b3)) {
                    pn2 pn2Var = new pn2(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) jb6.L0(2131751926));
                    spannableStringBuilder2.setSpan(pn2Var, 0, 1, 33);
                    b61 b61Var = new b61(context2, this.resourceProvider);
                    this.w0 = b61Var;
                    b61Var.f();
                    this.w0.setText(spannableStringBuilder2);
                    this.w0.setOnClickListener(new tf3(this, new he[1], b));
                    e02 e02Var = new e02(getContext());
                    this.x0 = e02Var;
                    e02Var.setupColorKey(cmb.Z6);
                    this.x0.setFadeZoneBottom(gm.L(f2) + gm.n);
                    this.x0.setFadeHeightBottom(gm.L(24.0f));
                    gk3Var3.addView(this.x0, qoe.g());
                    gk3Var3.addView(this.w0, qoe.f(48.0f, -1, 80, gm.L(12.0f), 0, gm.L(12.0f), gm.L(12.0f) + gm.n));
                }
                E5(false);
                v5(false);
                b3();
                Y2();
                a3();
                Z2();
                X2();
                R2();
                this.Y.setBlurredBackgroundVisibility(this.b.e);
                sy4 sy4Var = this.glassEngine;
                sy4Var.a = new nh3(this, b5);
                sy4Var.d = new cz4(gm.L(48.0f));
                View view = this.fragmentView;
                nh3 nh3Var = new nh3(this, (byte) 9);
                WeakHashMap weakHashMap = kfc.a;
                cfc.i(view, nh3Var);
                return this.fragmentView;
            }
        } else {
            qk3 qk3Var2 = new qk3(context2);
            this.L1 = qk3Var2;
            byte b14 = 17;
            qk3Var2.setOnAnimatedHeightChangedListener(new di3(this, b14));
            im0 a5 = r5.a(this.L1);
            a5.p(qqd.n(this.resourceProvider));
            a5.q(gm.L(7.0f));
            f2 = 72.0f;
            this.L1.setPadding(gm.L(11.0f), gm.L(21.0f), gm.L(11.0f), gm.L(21.0f));
            this.L1.setBlurredBackground(a5);
            this.L1.setDefaultRadiusDp(this.a3 != 0 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.I1 = frameLayout;
            this.L1.addView(frameLayout);
            this.L1.i(5, this.I1);
            this.L1.h(this.I1);
            this.L1.j(this.I1, true, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.K1 = frameLayout2;
            this.L1.addView(frameLayout2);
            b = 4;
            this.L1.i(4, this.K1);
            this.L1.h(this.K1);
            this.L1.j(this.K1, true, false);
            ri3 ri3Var = new ri3(this, context2, this, (byte) 0);
            this.H1 = ri3Var;
            this.I1.addView(ri3Var);
            ri3 ri3Var2 = new ri3(this, context2, this, (byte) 1);
            this.J1 = ri3Var2;
            this.K1.addView(ri3Var2);
            this.L1.setCallFragmentContextView(this.J1);
            nl3 nl3Var = new nl3(context2);
            this.O1 = nl3Var;
            nl3Var.setBackground(cmb.L0(false));
            q5();
            y71.d0(new lh3(this, r112 == true ? 1 : 0));
            y71.m0(new h92(this, b14));
            this.L1.addView(this.O1);
            if (this.a3 != 0) {
                cp2 cp2Var = new cp2(this.resourceProvider, context2, true);
                this.S1 = cp2Var;
                cp2Var.a(-14899731, -15497247, R.drawable.filled_requests_24, jb6.L0(2131751832), null, false);
                this.S1.setUnreadMode(true);
                this.S1.setBackground(cmb.L0(false));
                this.S1.setOnClickListener(new mh3(this, b));
                this.L1.addView(this.S1);
                L2(false);
            }
        }
        f3 = 0.0f;
        ak3Var = this.A0;
        if (ak3Var != null) {
        }
        zj3Var = this.Y;
        if (zj3Var != null) {
        }
        aj3 aj3Var3 = new aj3(this, context2, this, this.currentAccount, F3() ? 1 : 0);
        this.F0 = aj3Var3;
        aj3Var3.setActionBar(this.actionBar);
        this.F0.setMenuItemsOffset(!F3() ? gm.L(68.0f) : gm.N(16.66f));
        aj3 aj3Var22 = this.F0;
        aj3Var22.m0 = false;
        aj3Var22.setVisibility(8);
        this.N = false;
        this.M = false;
        this.L = false;
        if (this.n2) {
            oc7.r1(this.currentAccount).H1();
        }
        gk3Var3.addView(this.actionBar, qoe.c(-2.0f, -1));
        if (!this.n2) {
        }
        zj3Var2 = this.Y;
        if (zj3Var2 != null) {
        }
        this.y0 = gk3Var3.getChildCount();
        UndoView[] undoViewArr2 = this.z0;
        undoViewArr2[0] = null;
        undoViewArr2[1] = null;
        if (this.X) {
        }
        if (this.Y2 == 0) {
        }
        this.f0[0].a.setGlowColor(getThemedColor(i13));
        anb.b(this.actionBar, cmb.N8, getResourceProvider(), false);
        anb.a(this.actionBar, cmb.M8, getResourceProvider(), false);
        this.actionBar.L(getThemedColor(cmb.P8), false);
        this.actionBar.L(getThemedColor(cmb.Q8), true);
        if (!this.n2) {
            sb sbVar2 = new sb((byte) 12, context2, this);
            this.L0 = sbVar2;
            sbVar2.setForeground(new ColorDrawable(on2.p(getThemedColor(i13), 100)));
            this.L0.setFocusable(false);
            this.L0.setImportantForAccessibility(2);
            this.L0.setOnClickListener(new mh3(this, (byte) 7));
            this.L0.setVisibility(8);
            gk3Var3.addView(this.L0, qoe.c(-1.0f, -1));
        }
        this.h1.setColor(getThemedColor(i13));
        this.s3 = false;
        if (this.p2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(gk3Var3);
        this.H3 = new dj3(this, context2, gk3Var3, context2);
        s5(true, false);
        this.H3.setOpenProgress(f3);
        gk3Var3.addView(this.F0, qoe.c(81.0f, -1));
        gk3Var3.addView(this.H3, qoe.c(-1.0f, -1));
        this.G0 = new ok3(context2);
        qk3Var = this.L1;
        if (qk3Var != null) {
        }
        if (this.a3 != 0) {
            pn2 pn2Var2 = new pn2(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) jb6.L0(2131751926));
            spannableStringBuilder22.setSpan(pn2Var2, 0, 1, 33);
            b61 b61Var2 = new b61(context2, this.resourceProvider);
            this.w0 = b61Var2;
            b61Var2.f();
            this.w0.setText(spannableStringBuilder22);
            this.w0.setOnClickListener(new tf3(this, new he[1], b));
            e02 e02Var2 = new e02(getContext());
            this.x0 = e02Var2;
            e02Var2.setupColorKey(cmb.Z6);
            this.x0.setFadeZoneBottom(gm.L(f2) + gm.n);
            this.x0.setFadeHeightBottom(gm.L(24.0f));
            gk3Var3.addView(this.x0, qoe.g());
            gk3Var3.addView(this.w0, qoe.f(48.0f, -1, 80, gm.L(12.0f), 0, gm.L(12.0f), gm.L(12.0f) + gm.n));
        }
        E5(false);
        v5(false);
        b3();
        Y2();
        a3();
        Z2();
        X2();
        R2();
        this.Y.setBlurredBackgroundVisibility(this.b.e);
        sy4 sy4Var2 = this.glassEngine;
        sy4Var2.a = new nh3(this, b5);
        sy4Var2.d = new cz4(gm.L(48.0f));
        View view2 = this.fragmentView;
        nh3 nh3Var2 = new nh3(this, (byte) 9);
        WeakHashMap weakHashMap2 = kfc.a;
        cfc.i(view2, nh3Var2);
        return this.fragmentView;
    }

    public final void d3() {
        if (this.L1 != null) {
            float R1 = gm.R1(0.98f, 1.0f, 1.0f);
            this.L1.setAlpha(1.0f);
            this.L1.setScaleX(R1);
            this.L1.setScaleY(R1);
            this.L1.setVisibility(0);
        }
    }

    public final void d4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            quc.a(getParentActivity(), new iu(this, tL_attachMenuBot, launchActivity, (byte) 13), null);
        } else {
            LaunchActivity.G0(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public final void d5(boolean z) {
        byte b = 1;
        this.c.a(z, true);
        if (this.n0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.V3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.V3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.V3 = animatorSet2;
        animatorSet2.setDuration(180L);
        r7 r7Var = this.n0;
        if (z) {
            r7Var.setVisibility(0);
        } else {
            r7Var.setSelected(false);
            Drawable background = this.n0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.n0, (Property<r7, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.V3.playTogether(arrayList);
        this.V3.addListener(new jj3(this, z, b));
        this.V3.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:377:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:383:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x05d4 A[SYNTHETIC] */
    @Override // jm7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        int i3;
        ub7 ub7Var;
        int i4;
        char c;
        boolean booleanValue;
        boolean z2;
        ov9 ov9Var;
        ov9 ov9Var2;
        int i5;
        boolean z3;
        byte b = 3;
        char c2 = 1;
        int i6 = 0;
        if (i == nm7.r) {
            if (this.f0 == null || this.U1) {
                return;
            }
            int i7 = 0;
            while (true) {
                mk3[] mk3VarArr = this.f0;
                if (i7 >= mk3VarArr.length) {
                    break;
                }
                mk3 mk3Var = mk3VarArr[i7];
                boolean I4 = I4(mk3Var);
                if (this.B3 && I4) {
                    gm.d3(new pz2(this, mk3Var, objArr, b), 160L);
                } else {
                    int length = objArr.length;
                    O4(mk3Var);
                }
                i7++;
            }
            ak3 ak3Var = this.A0;
            if (ak3Var != null && ak3Var.getVisibility() == 0) {
                this.A0.c();
            }
            F5(-1, true);
            this.B3 = false;
            return;
        }
        if (i == nm7.u5) {
            G5(0, true);
            mk3[] mk3VarArr2 = this.f0;
            if (mk3VarArr2 != null) {
                int length2 = mk3VarArr2.length;
                while (i6 < length2) {
                    mk3 mk3Var2 = mk3VarArr2[i6];
                    if (mk3Var2.getVisibility() == 0 && I4(mk3Var2)) {
                        kh3 kh3Var = this.T3;
                        gm.r(kh3Var);
                        gm.d3(kh3Var, 100L);
                        return;
                    }
                    i6++;
                }
                return;
            }
            return;
        }
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.a3 != chatFull.id) {
                return;
            }
            this.c3 = chatFull;
            L2(false);
            if (this.f0 == null || this.U1) {
                return;
            }
            while (true) {
                mk3[] mk3VarArr3 = this.f0;
                if (i6 >= mk3VarArr3.length) {
                    return;
                }
                O4(mk3VarArr3[i6]);
                i6++;
            }
        } else {
            ArrayList arrayList = null;
            if (i == nm7.d2) {
                ak3 ak3Var2 = this.A0;
                if (ak3Var2 == null || ak3Var2.getVisibility() != 0) {
                    return;
                }
                ak3 ak3Var3 = this.A0;
                int defaultTabId = ak3Var3.getDefaultTabId();
                fv fvVar = ak3Var3.G;
                ArrayList arrayList2 = ak3Var3.h;
                int i8 = ak3Var3.m0.get(defaultTabId, -1);
                if (i8 < 0 || i8 >= arrayList2.size()) {
                    return;
                }
                eg4 eg4Var = (eg4) arrayList2.get(i8);
                if (eg4Var.d == ((dk3) ak3Var3.K).a(eg4Var.a) || ((dk3) ak3Var3.K).a(eg4Var.a) < 0) {
                    return;
                }
                fvVar.h1();
                if (ak3Var3.n0.get(i8) != eg4Var.a(true) || ak3Var3.i0) {
                    ak3Var3.i0 = true;
                    ak3Var3.requestLayout();
                    fvVar.setItemAnimator(ak3Var3.t0);
                    s30 s30Var = ak3Var3.J;
                    if (s30Var != null) {
                        s30Var.f();
                    }
                    ak3Var3.N = 0;
                    eg4 d = ak3Var3.d();
                    if (d != null) {
                        d.b(jb6.M0(2131750744, null));
                    }
                    int size = arrayList2.size();
                    while (i6 < size) {
                        ak3Var3.N = hg9.v(24.0f, ((eg4) arrayList2.get(i6)).a(true), ak3Var3.N);
                        i6++;
                    }
                    return;
                }
                return;
            }
            if (i == nm7.d5) {
                G5(0, true);
                return;
            }
            if (i == nm7.c5) {
                G5(0, true);
                return;
            }
            if (i == nm7.m4) {
                if (this.f0 != null) {
                    int i9 = 0;
                    while (true) {
                        mk3[] mk3VarArr4 = this.f0;
                        if (i9 >= mk3VarArr4.length) {
                            break;
                        }
                        jk3 jk3Var = mk3VarArr4[i9].a;
                        if (jk3Var != null) {
                            for (int i10 = 0; i10 < jk3Var.getChildCount(); i10++) {
                                View childAt = jk3Var.getChildAt(i10);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i9++;
                    }
                }
                ak3 ak3Var4 = this.A0;
                if (ak3Var4 != null) {
                    ak3Var4.getTabsContainer().h1();
                    return;
                }
                return;
            }
            if (i == nm7.M4) {
                a aVar = this.actionBar;
                if (aVar != null) {
                    aVar.o(true);
                    return;
                }
                return;
            }
            if (i == nm7.E4) {
                w5(false, false);
                return;
            }
            byte b2 = 4;
            if (i == 2) {
                Integer num = (Integer) objArr[0];
                G5(num.intValue(), true);
                ak3 ak3Var5 = this.A0;
                if (ak3Var5 != null && ak3Var5.getVisibility() == 0) {
                    int intValue = num.intValue();
                    int i11 = oc7.s5;
                    if ((intValue & 256) != 0) {
                        this.A0.c();
                    }
                }
                if (this.a3 != 0) {
                    int intValue2 = num.intValue();
                    int i12 = oc7.s5;
                    if ((intValue2 & TLObject.FLAG_13) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.a3));
                        this.b3 = L0;
                        this.actionBar.setTitle(pg3.l(L0));
                        this.d3.f(this.b3, this.e3);
                    }
                }
                if (this.f0 != null) {
                    while (i6 < this.f0.length) {
                        int intValue3 = num.intValue();
                        int i13 = oc7.s5;
                        if ((intValue3 & 4) != 0) {
                            this.f0[i6].d.P(true);
                        }
                        i6++;
                    }
                }
                B5(z8c.h(i2).f(), true);
                return;
            }
            int i14 = nm7.I2;
            boolean[] zArr = F4;
            if (i == i14) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i == nm7.Y) {
                G5(0, true);
                return;
            }
            if (i == nm7.N) {
                if (this.f0 == null || this.U1) {
                    return;
                }
                wp4 wp4Var = this.u0;
                if (wp4Var != null) {
                    z3 = wp4Var.getProgressVisible();
                    this.u0.f(false, true);
                } else {
                    z3 = false;
                }
                for (mk3 mk3Var3 : this.f0) {
                    mk3Var3.d.e = false;
                }
                if (z3) {
                    T4(0.0f);
                    ValueAnimator valueAnimator = this.e0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.d0, 1.0f).setDuration(250L);
                    this.e0 = duration;
                    duration.setInterpolator(d53.f);
                    this.e0.addUpdateListener(new ph3(this, (byte) 2));
                    this.e0.start();
                }
                int i15 = 0;
                boolean z4 = false;
                while (true) {
                    mk3[] mk3VarArr5 = this.f0;
                    if (i15 >= mk3VarArr5.length) {
                        break;
                    }
                    if (!mk3VarArr5[i15].a() || getMessagesController().C0() > 10) {
                        z4 = true;
                    } else {
                        this.f0[i15].d.f();
                    }
                    i15++;
                }
                if (z4) {
                    G5(0, true);
                    return;
                }
                return;
            }
            if (i != nm7.h0) {
                if (i == nm7.f0) {
                    G5(0, true);
                    return;
                }
                if (i == nm7.I || i == nm7.J || i == nm7.L) {
                    int i16 = oc7.s5;
                    G5(TLObject.FLAG_12, true);
                    return;
                }
                if (i == nm7.n0) {
                    U2();
                    return;
                }
                if (i == nm7.P0) {
                    sj3 sj3Var = this.D0;
                    if (sj3Var == null || (ov9Var2 = sj3Var.e0) == null || (i5 = ov9Var2.i0) == 15) {
                        return;
                    }
                    int i17 = ov9Var2.t0;
                    cf7.Y(i17).a.c(new cu(i17, i5, (Object) new cm3(ov9Var2), (byte) 6));
                    return;
                }
                if (i == nm7.s0) {
                    int i18 = oc7.s5;
                    G5(32768, true);
                    return;
                }
                if (i == nm7.S0) {
                    sj3 sj3Var2 = this.D0;
                    if (sj3Var2 == null || (ov9Var = sj3Var2.e0) == null) {
                        return;
                    }
                    ov9Var.f();
                    return;
                }
                if (i == nm7.T1) {
                    int connectionState = ConnectionsManager.getInstance(j5.a(i2).a).getConnectionState();
                    if (this.f2 != connectionState) {
                        this.f2 = connectionState;
                        w5(true, false);
                        return;
                    }
                    return;
                }
                if (i == nm7.f5) {
                    w5(true, false);
                    sj3 sj3Var3 = this.D0;
                    if (sj3Var3 != null) {
                        int currentPosition = sj3Var3.getCurrentPosition();
                        bo0 bo0Var = sj3Var3.W;
                        A5(bo0Var != null && bo0Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                if (i == nm7.K2) {
                    if (this.fragmentView != null) {
                        long longValue = ((Long) objArr[0]).longValue();
                        TLRPC.User user = (TLRPC.User) objArr[1];
                        TLRPC.Chat chat = (TLRPC.Chat) objArr[2];
                        if (user == null || !user.bot) {
                            booleanValue = ((Boolean) objArr[3]).booleanValue();
                            z2 = false;
                        } else {
                            z2 = ((Boolean) objArr[3]).booleanValue();
                            booleanValue = false;
                        }
                        boolean z5 = booleanValue;
                        Runnable fi3Var = new fi3(this, chat, longValue, z5, user, z2);
                        j3();
                        if (this.z0[0] == null) {
                            fi3Var.run();
                            return;
                        }
                        if (sd2.c0(chat)) {
                            fi3Var.run();
                            return;
                        }
                        UndoView w3 = w3();
                        if (w3 != null) {
                            w3.j(z5 ? 1 : 95, longValue, fi3Var);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == nm7.d0) {
                    int intValue4 = ((Integer) objArr[0]).intValue();
                    int i19 = this.Y2;
                    if (i19 != intValue4 || i19 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i == nm7.O2) {
                    s5(true, true);
                    F5(-1, true);
                    return;
                }
                if (i == nm7.P2) {
                    z = true;
                } else if (i == nm7.Q2) {
                    z = false;
                } else {
                    if (i == nm7.R2) {
                        e5();
                        return;
                    }
                    if (i == nm7.s1) {
                        g5();
                        q5();
                        oc7 messagesController = getMessagesController();
                        if (!messagesController.k5 && messagesController.B4 + 10 >= messagesController.getConnectionsManager().getCurrentTime()) {
                            boolean contains = messagesController.u3.contains("SETUP_LOGIN_EMAIL");
                            if (messagesController.u3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                                c = 2;
                            } else if (contains) {
                                c = 1;
                            }
                            if (c == 0) {
                                mh6 mh6Var = new mh6();
                                di3 di3Var = new di3(this, b);
                                di3 di3Var2 = new di3(this, b2);
                                boolean z6 = c == 2;
                                mh6Var.G = (byte) 3;
                                mh6Var.a = 12;
                                mh6Var.e0 = di3Var;
                                mh6Var.f0 = di3Var2;
                                mh6Var.h0 = z6;
                                mh6Var.i0 = true;
                                presentFragment(mh6Var);
                                getMessagesController().k5 = true;
                                return;
                            }
                            return;
                        }
                        c = 0;
                        if (c == 0) {
                        }
                    } else {
                        boolean z7 = true;
                        if (i == nm7.M) {
                            wp4 wp4Var2 = this.u0;
                            if (wp4Var2 != null) {
                                wp4Var2.f(true, true);
                            }
                            mk3[] mk3VarArr6 = this.f0;
                            if (mk3VarArr6 != null) {
                                int length3 = mk3VarArr6.length;
                                int i20 = 0;
                                while (i20 < length3) {
                                    qi3 qi3Var = mk3VarArr6[i20].d;
                                    qi3Var.R = false;
                                    qi3Var.e = z7;
                                    qi3Var.f();
                                    i20++;
                                    z7 = true;
                                }
                                return;
                            }
                            return;
                        }
                        if (i == nm7.v) {
                            if (!this.s3 || this.D0 == null) {
                                return;
                            }
                            ArrayList arrayList3 = (ArrayList) objArr[0];
                            long longValue2 = ((Long) objArr[1]).longValue();
                            sj3 sj3Var4 = this.D0;
                            HashMap hashMap = sj3Var4.C0;
                            SparseArray sparseArray = sj3Var4.h;
                            int size2 = sparseArray.size();
                            for (int i21 = 0; i21 < size2; i21++) {
                                View view = (View) sparseArray.valueAt(i21);
                                if (view instanceof ch4) {
                                    ((ch4) view).d(arrayList3, longValue2);
                                }
                            }
                            for (int i22 = 0; i22 < sj3Var4.getChildCount(); i22++) {
                                if (sj3Var4.getChildAt(i22) instanceof ch4) {
                                    ((ch4) sj3Var4.getChildAt(i22)).d(arrayList3, longValue2);
                                }
                            }
                            sj3Var4.P0.d(arrayList3, longValue2);
                            if (hashMap.isEmpty()) {
                                return;
                            }
                            ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                ug4 ug4Var = (ug4) arrayList4.get(i23);
                                k47 k47Var = (k47) hashMap.get(ug4Var);
                                if (k47Var != null) {
                                    long B0 = k47.B0(k47Var.k);
                                    if (B0 < 0) {
                                        int i24 = (int) (-B0);
                                        if (sd2.S(sj3Var4.K0, i24)) {
                                            i4 = i24;
                                            if (i4 != longValue2) {
                                                for (int i25 = 0; i25 < arrayList3.size(); i25++) {
                                                    if (k47Var.e1() == ((Integer) arrayList3.get(i25)).intValue()) {
                                                        arrayList = new ArrayList();
                                                        arrayList.add(ug4Var);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i4 = 0;
                                    if (i4 != longValue2) {
                                    }
                                }
                            }
                            if (arrayList != null) {
                                int size3 = arrayList.size();
                                for (int i26 = 0; i26 < size3; i26++) {
                                    hashMap.remove(arrayList.get(i26));
                                }
                                sj3Var4.A0.a(hashMap.size(), true);
                                r7 r7Var = sj3Var4.F0;
                                if (r7Var != null) {
                                    r7Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (i == nm7.P4) {
                            if (this.f0 != null) {
                                int i27 = 0;
                                while (true) {
                                    mk3[] mk3VarArr7 = this.f0;
                                    if (i27 >= mk3VarArr7.length) {
                                        break;
                                    }
                                    wk3 wk3Var = mk3VarArr7[i27].d.Q;
                                    if (wk3Var != null) {
                                        wk3Var.a.clear();
                                        wk3Var.b.clear();
                                        wk3Var.c.clear();
                                        wk3Var.d.clear();
                                        gm.r(wk3Var.e);
                                    }
                                    i27++;
                                }
                            }
                            int i28 = yx4.l1;
                            return;
                        }
                        if (i == nm7.X5) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                            if (this.a3 != longValue3 || booleanValue2) {
                                return;
                            }
                            tk5 tk5Var = this.parentLayout;
                            if (tk5Var == null || tk5Var.getLastFragment() != this) {
                                removeSelfFromStack();
                                return;
                            } else {
                                finishFragment();
                                return;
                            }
                        }
                        if (i == nm7.W5) {
                            if (this.a3 == ((Long) objArr[0]).longValue()) {
                                L2(true);
                                return;
                            }
                            return;
                        }
                        if (i == nm7.W4) {
                            boolean booleanValue3 = ((Boolean) objArr[0]).booleanValue();
                            if (this.fragmentView != null) {
                                w93 w93Var = this.X3;
                                if (!booleanValue3) {
                                    if (w93Var == null || w93Var.getTag() == null) {
                                        return;
                                    }
                                    w93 w93Var2 = this.X3;
                                    w93Var2.animate().setListener(null).cancel();
                                    w93Var2.animate().setListener(new u5(this, w93Var2, (byte) 18)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                                    this.X3.setTag(null);
                                    return;
                                }
                                if (w93Var == null) {
                                    Context context = this.fragmentView.getContext();
                                    w93 w93Var3 = new w93(context);
                                    LinearLayout i29 = hg9.i(context, 1);
                                    s09 s09Var = new s09(context);
                                    s09Var.f(R.raw.db_migration_placeholder, nm7.f2, nm7.f2, null);
                                    s09Var.getAnimatedDrawable().F(1);
                                    s09Var.d();
                                    i29.addView(s09Var, qoe.r(nm7.f2, nm7.f2, 1));
                                    TextView textView = new TextView(context);
                                    ts2.q(24.0f, 1, 2131747511, textView, null);
                                    int i30 = cmb.F6;
                                    anb.X(textView, i30, null);
                                    textView.setGravity(1);
                                    TextView m = wi8.m(i29, textView, qoe.q(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                                    m.setLineSpacing(gm.L(2.0f), 1.0f);
                                    ts2.q(14.0f, 1, 2131747510, m, null);
                                    anb.X(m, i30, null);
                                    m.setGravity(1);
                                    TextView m2 = wi8.m(i29, m, qoe.q(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                                    ts2.q(14.0f, 1, 2131747509, m2, null);
                                    anb.X(m2, i30, null);
                                    m2.setGravity(1);
                                    i29.addView(m2, qoe.q(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                                    w93Var3.addView(i29, qoe.e(-1, -2, 16));
                                    anb.h(cmb.c6, null, w93Var3);
                                    w93Var3.setOnTouchListener(new v93());
                                    this.X3 = w93Var3;
                                    w93Var3.setAlpha(0.0f);
                                    ((gk3) this.fragmentView).addView(this.X3);
                                    this.X3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                                }
                                this.X3.setTag(1);
                                return;
                            }
                            return;
                        }
                        if (i == nm7.e5) {
                            N2();
                            return;
                        }
                        if (i == nm7.q5) {
                            B5((TLRPC.User) objArr[0], true);
                            return;
                        }
                        if (i == nm7.j5) {
                            B5(z8c.h(i2).f(), true);
                            C5();
                            return;
                        }
                        if (i == nm7.x5) {
                            zArr[this.currentAccount] = false;
                            x4(getAccountInstance());
                            getMessagesController().f3(this.Y2);
                            return;
                        }
                        if (i == nm7.D5) {
                            int intValue5 = ((Integer) objArr[0]).intValue();
                            int i31 = 0;
                            while (true) {
                                mk3[] mk3VarArr8 = this.f0;
                                if (i31 >= mk3VarArr8.length) {
                                    return;
                                }
                                mk3 mk3Var4 = mk3VarArr8[i31];
                                if (mk3Var4 != null && (((i3 = mk3Var4.s) == 7 || i3 == 8) && (ub7Var = getMessagesController().N[mk3Var4.s - 7]) != null && intValue5 == ub7Var.a)) {
                                    mk3Var4.b(true);
                                    return;
                                }
                                i31++;
                            }
                        } else {
                            if (i != nm7.P1) {
                                if (i == nm7.z5) {
                                    E5(this.W);
                                    G5(0, true);
                                    return;
                                }
                                if (i == nm7.b3) {
                                    C5();
                                    return;
                                }
                                if (i == nm7.f3) {
                                    q5();
                                    return;
                                }
                                if (i == nm7.k5) {
                                    q5();
                                    return;
                                }
                                if (i == nm7.A3 || i == nm7.C3) {
                                    q5();
                                    return;
                                } else if (i == nm7.S3) {
                                    q5();
                                    return;
                                } else {
                                    if (i == nm7.T3) {
                                        q5();
                                        return;
                                    }
                                    return;
                                }
                            }
                            long longValue4 = ((Long) objArr[0]).longValue();
                            int i32 = 0;
                            while (true) {
                                mk3[] mk3VarArr9 = this.f0;
                                if (i32 >= mk3VarArr9.length) {
                                    return;
                                }
                                mk3 mk3Var5 = mk3VarArr9[i32];
                                if (mk3Var5.a != null) {
                                    int i33 = 0;
                                    while (true) {
                                        if (i33 < mk3Var5.a.getChildCount()) {
                                            View childAt2 = mk3Var5.a.getChildAt(i33);
                                            if (childAt2 instanceof hg3) {
                                                hg3 hg3Var = (hg3) childAt2;
                                                if (longValue4 == hg3Var.getDialogId()) {
                                                    hg3Var.x();
                                                    break;
                                                }
                                            }
                                            i33++;
                                        }
                                    }
                                }
                                i32++;
                            }
                        }
                    }
                }
                N4(z);
                F5(-1, true);
                return;
            }
            if (this.f0 == null) {
                return;
            }
            int i34 = 0;
            while (true) {
                mk3[] mk3VarArr10 = this.f0;
                if (i34 >= mk3VarArr10.length) {
                    int i35 = oc7.s5;
                    G5(512, true);
                    return;
                }
                if (mk3VarArr10[i34].a() && gm.O1()) {
                    boolean booleanValue4 = ((Boolean) objArr[2]).booleanValue();
                    long longValue5 = ((Long) objArr[i6]).longValue();
                    long longValue6 = ((Long) objArr[c2]).longValue();
                    bf7 bf7Var = this.r2;
                    if (booleanValue4) {
                        long j = bf7Var.a;
                        if (longValue5 == j && longValue6 == bf7Var.b) {
                            bf7Var.a = 0L;
                            bf7Var.b = 0L;
                            longValue5 = 0;
                        } else {
                            longValue5 = j;
                        }
                    } else {
                        bf7Var.a = longValue5;
                        bf7Var.b = longValue6;
                    }
                    this.f0[i34].d.s = longValue5;
                }
                i34++;
                c2 = 1;
                i6 = 0;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof wx0) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public boolean e3() {
        return this.T0 == 10;
    }

    public final /* synthetic */ void e4(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        wx0.l(this.currentAccount, tL_attachMenuBot.bot_id, null);
    }

    public final void e5() {
        if (this.B0 || !getMessagesController().L0 || !getMessagesController().n3 || this.A0 == null || !getMessagesController().S0().isEmpty() || this.isPaused || !getUserConfig().Q || this.inPreviewMode) {
            return;
        }
        SharedPreferences d1 = oc7.d1();
        if (d1.getBoolean("filterhint", false)) {
            return;
        }
        d1.edit().putBoolean("filterhint", true).apply();
        gm.d3(new di3(this, (byte) 8), 1000L);
    }

    public final void f3() {
        if (!gm.O1()) {
            this.X1 = true;
            return;
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.o(true);
        }
        TLObject tLObject = this.Z1;
        if (tLObject != null) {
            sj3 sj3Var = this.D0;
            if (sj3Var != null) {
                sj3Var.e0.Q(this.Y1, tLObject);
            }
            this.Z1 = null;
        }
    }

    public final /* synthetic */ void f4(float f, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.w3 = floatValue;
        this.f0[0].setTranslationY((-f) * floatValue);
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.w3);
            }
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        a3();
        S2();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f5() {
        int i;
        int i2;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity;
        byte b;
        float f;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        jh3 jh3Var;
        a8 a8Var;
        int intValue;
        Integer num;
        int i3;
        bu5 I = bu5.I(this, this.l0);
        int i4 = cmb.z8;
        I.T(getThemedColor(i4), getThemedColor(i4));
        byte b2 = 8;
        I.s = (short) 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        byte b3 = 2;
        float f2 = 64.0f;
        byte b4 = 1;
        byte b5 = 0;
        if (this.a3 != 0) {
            if (sd2.N(this.b3)) {
                I.b(R.drawable.msg_customize, jb6.M0(2131751850, null), new di3(this, (byte) 15), false);
                I.j();
            }
            I.h(new kh3(this, b4), jb6.M0(2131751849, null), this.b3.collapsed_in_dialogs);
            I.h(new kh3(this, b3), jb6.M0(2131751848, null), !this.b3.collapsed_in_dialogs);
            I.a0();
            I.Y(-gm.L(64.0f));
            return;
        }
        byte b6 = 3;
        if (F3()) {
            I.b(R.drawable.msg_customize, jb6.M0(2131754108, null), new kh3(this, b6), false);
            I.b(R.drawable.msg_help, jb6.M0(2131749033, null), new kh3(this, (byte) 4), false);
            I.a0();
            I.Y(-gm.L(64.0f));
            return;
        }
        ylb ylbVar = this.resourceProvider;
        if (ylbVar != null ? ylbVar.a() : cmb.I.o()) {
            i = R.drawable.menu_day_mode_24;
            i2 = 2131743985;
        } else {
            i = R.drawable.menu_night_mode_24;
            i2 = 2131743984;
        }
        I.b(i, jb6.M0(i2, null), new kh3(this, (byte) 5), false);
        I.j();
        I.b(R.drawable.msg_contacts, jb6.M0(2131751717, null), new kh3(this, (byte) 6), false);
        I.b(R.drawable.msg_calls, jb6.M0(2131752549, null), new kh3(this, (byte) 7), false);
        I.j();
        I.b(R.drawable.outline_groups_24, jb6.M0(2131748030, null), new kh3(this, b2), false);
        I.b(R.drawable.outline_saved_24, jb6.M0(2131745635, null), new kh3(this, (byte) 9), false);
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        byte b7 = 16;
        if (getMessagesController().l4.n0.f) {
            I.b(R.drawable.ic_gram, jb6.M0(2131742877, null), new di3(this, b7), false);
        } else {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = hs6.d0(z8c.t0).b;
            if (launchActivity2 != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                int size = arrayList3.size();
                int i5 = 0;
                while (i5 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i5);
                    i5++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        jh3 jh3Var2 = new jh3(this, tL_attachMenuBot2, launchActivity2, b5);
                        b = b7;
                        rd3 rd3Var = new rd3(this, tL_attachMenuBot2, b6);
                        f = f2;
                        ylb ylbVar2 = I.d;
                        if (I.e == null) {
                            arrayList2 = arrayList3;
                            launchActivity = launchActivity2;
                        } else {
                            int i6 = cmb.E8;
                            int i7 = cmb.D8;
                            a8 a8Var2 = new a8(0, I.d, I.e, false, false);
                            a8Var2.setPadding(gm.L(18.0f), b5, gm.L(18.0f), b5);
                            boolean z = tL_attachMenuBot2.side_menu_disclaimer_needed;
                            String str = tL_attachMenuBot2.short_name;
                            CharSequence charSequence = str;
                            if (z) {
                                charSequence = xib.b(str);
                            }
                            CharSequence charSequence2 = charSequence;
                            Pattern pattern = hs6.U1;
                            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                            int size2 = arrayList4.size();
                            int i8 = b5;
                            while (true) {
                                if (i8 >= size2) {
                                    arrayList2 = arrayList3;
                                    launchActivity = launchActivity2;
                                    tL_attachMenuBotIcon = null;
                                    break;
                                }
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i8);
                                int i9 = i8 + 1;
                                arrayList2 = arrayList3;
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                launchActivity = launchActivity2;
                                if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                    tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                    break;
                                } else {
                                    arrayList3 = arrayList2;
                                    launchActivity2 = launchActivity;
                                    i8 = i9;
                                }
                            }
                            if (tL_attachMenuBotIcon != null) {
                                meb f3 = eq3.f(tL_attachMenuBotIcon.icon, cmb.b7, 1.0f, null);
                                if (f3 != null) {
                                    Integer num2 = I.n0;
                                    new PorterDuffColorFilter(num2 != null ? num2.intValue() : cmb.v0(i6, ylbVar2), PorterDuff.Mode.SRC_IN);
                                }
                                gn5 b8 = gn5.b(tL_attachMenuBotIcon.icon);
                                jh3Var = jh3Var2;
                                a8Var = a8Var2;
                                a8Var.k(charSequence2, b8, "24_24", f3, tL_attachMenuBot2);
                                bf0 bf0Var = a8Var.h;
                                if (bf0Var != null) {
                                    bf0Var.setLayoutParams(qoe.e(24, 24, (jb6.a0 ? 5 : 3) | 16));
                                }
                            } else {
                                jh3Var = jh3Var2;
                                a8Var = a8Var2;
                                a8Var.j(charSequence2, R.drawable.msg_bot, null);
                            }
                            Integer num3 = I.m0;
                            if (num3 != null) {
                                intValue = num3.intValue();
                            } else if (I.n0 == null) {
                                a8Var.c(i7, i6);
                                Integer num4 = I.n0;
                                a8Var.setIconColorImage(num4 == null ? num4.intValue() : cmb.v0(i6, ylbVar2));
                                num = I.o0;
                                if (num == null) {
                                    a8Var.setSelectorColor(num.intValue());
                                } else {
                                    a8Var.h(0.12f, i7);
                                }
                                a8Var.setOnClickListener(new tf3(I, jh3Var, (byte) 27));
                                a8Var.setOnLongClickListener(new u0(I, rd3Var, (byte) 2));
                                i3 = I.V;
                                if (i3 <= 0) {
                                    a8Var.setMinimumWidth(gm.L(i3));
                                    I.q(a8Var, qoe.o(I.V, -2));
                                } else {
                                    I.q(a8Var, qoe.o(-1, -2));
                                }
                            } else {
                                intValue = cmb.v0(i7, ylbVar2);
                            }
                            Integer num5 = I.n0;
                            a8Var.d(intValue, num5 != null ? num5.intValue() : cmb.v0(i6, ylbVar2));
                            Integer num42 = I.n0;
                            a8Var.setIconColorImage(num42 == null ? num42.intValue() : cmb.v0(i6, ylbVar2));
                            num = I.o0;
                            if (num == null) {
                            }
                            a8Var.setOnClickListener(new tf3(I, jh3Var, (byte) 27));
                            a8Var.setOnLongClickListener(new u0(I, rd3Var, (byte) 2));
                            i3 = I.V;
                            if (i3 <= 0) {
                            }
                        }
                    } else {
                        arrayList2 = arrayList3;
                        launchActivity = launchActivity2;
                        b = b7;
                        f = f2;
                    }
                    b7 = b;
                    f2 = f;
                    arrayList3 = arrayList2;
                    launchActivity2 = launchActivity;
                    b5 = 0;
                    b6 = 3;
                }
            }
        }
        float f4 = f2;
        if (getUserConfig().X) {
            I.b(R.drawable.msg_settings_old, jb6.M0(2131745229, null), new kh3(this, (byte) 0), false);
        }
        a8 a8Var3 = this.p0;
        if (a8Var3 != null) {
            anb.X(a8Var3.b, cmb.Qi, getResourceProvider());
            this.p0.setOnClickListener(new tf3(this, I, (byte) 1));
            SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().l3 && !gda.v1.isEmpty())) {
                I.j();
                I.c(this.p0);
            }
        }
        I.a0();
        I.Y(-gm.L(f4));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void finishFragment() {
        super.finishFragment();
        bu5 bu5Var = this.M0;
        if (bu5Var != null) {
            bu5Var.u();
        }
    }

    public final void g3() {
        a aVar = this.actionBar;
        if (aVar == null || !aVar.o0) {
            return;
        }
        aVar.o(true);
        this.s3 = false;
        s5(true, true);
    }

    public final /* synthetic */ void g4() {
        presentFragment(new PrivacySettingsActivity());
        gm.f3(this.parentLayout, "newChatsRow");
    }

    public final void g5() {
        if (this.Y3 == null) {
            for (String str : getMessagesController().u3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = jb6.M0(2131749076, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = gm.S2(jb6.M0(2131749077, null));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    alertDialog$Builder.j(jb6.M0(2131749307, null), new nh3(this, (byte) 6));
                    showDialog(heVar, new rh3(this, (byte) 0));
                    this.Y3 = str;
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ok5 getBackButtonState() {
        return (F3() || this.H3.f) ? ok5.a : ok5.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d4, 1.0f);
            this.g4 = ofFloat;
            return ofFloat;
        }
        int i = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? nm7.f2 : (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.d4, 1.0f);
        this.g4 = ofFloat2;
        ofFloat2.addUpdateListener(new ph3(this, (byte) 1));
        this.g4.setInterpolator(d53.g);
        this.g4.setDuration(i);
        this.g4.start();
        return this.g4;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0246 A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        byte b;
        byte b2;
        int i;
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        r7 r7Var = this.n0;
        if (r7Var != null) {
            arrayList.add(new cnb(r7Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.s8));
        }
        int i2 = this.Y2;
        sj3 sj3Var = this.D0;
        byte b3 = 1;
        if (i2 == 0) {
            if (sj3Var != null) {
                arrayList.add(new cnb(sj3Var.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
            }
            arrayList.add(new cnb(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{cmb.r1}, (bnb) null, !this.X ? cmb.z8 : cmb.Wl));
            arrayList.add(new cnb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.B8));
            arrayList.add(new cnb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C8));
        } else {
            if (sj3Var != null) {
                arrayList.add(new cnb(sj3Var.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
            }
            arrayList.add(new cnb(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{cmb.r1}, (bnb) null, !this.X ? cmb.O8 : cmb.Wl));
            arrayList.add(new cnb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.P8));
            arrayList.add(new cnb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Q8));
        }
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_21, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.w8));
        NumberTextView numberTextView = this.j1;
        int i3 = cmb.x8;
        arrayList.add(new cnb(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        if (this.A0 != null) {
            a aVar = this.actionBar;
            if (aVar == null || !aVar.y()) {
                arrayList.add(new cnb(this.A0, 0, new Class[]{ig4.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (bnb) null, cmb.J8));
                arrayList.add(new cnb(this.A0.getTabsContainer(), 262148, new Class[]{gg4.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.H8));
                arrayList.add(new cnb(this.A0.getTabsContainer(), 262148, new Class[]{gg4.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.I8));
                arrayList.add(new cnb(this.A0.getTabsContainer(), TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.K8));
            } else {
                arrayList.add(new cnb(this.A0, 0, new Class[]{ig4.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (bnb) null, cmb.wi));
                arrayList.add(new cnb(this.A0.getTabsContainer(), 262148, new Class[]{gg4.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.vi));
                arrayList.add(new cnb(this.A0.getTabsContainer(), 262148, new Class[]{gg4.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ui));
            }
        }
        arrayList.addAll(kwe.a(new t10(this, (byte) 6), cmb.v8, i3));
        int i4 = 0;
        while (true) {
            b = 2;
            b2 = 3;
            if (i4 >= 3) {
                break;
            }
            if (i4 == 2) {
                sj3 sj3Var2 = this.D0;
                if (sj3Var2 != null) {
                    view = sj3Var2.b0;
                    view2 = view;
                    if (view2 == null) {
                        arrayList.add(new cnb(view2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.h6));
                        arrayList.add(new cnb(view2, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, cmb.g6));
                        int i5 = l55.h;
                        arrayList.add(new cnb(view2, 4, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.n6));
                    }
                    i4++;
                } else {
                    i4++;
                }
            } else {
                mk3[] mk3VarArr = this.f0;
                if (mk3VarArr == null) {
                    i4++;
                } else {
                    view = i4 < mk3VarArr.length ? mk3VarArr[i4].a : null;
                    view2 = view;
                    if (view2 == null) {
                    }
                    i4++;
                }
            }
        }
        if (this.f0 != null) {
            int i6 = 0;
            while (true) {
                mk3[] mk3VarArr2 = this.f0;
                if (i6 >= mk3VarArr2.length) {
                    break;
                }
                if (this.Y2 == 0) {
                    jk3 jk3Var = mk3VarArr2[i6].a;
                    int i7 = cmb.c6;
                    arrayList.add(new cnb(jk3Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i7));
                    i = i7;
                } else {
                    jk3 jk3Var2 = mk3VarArr2[i6].a;
                    int i8 = cmb.c6;
                    arrayList.add(new cnb(jk3Var2, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i8));
                    i = i8;
                }
                boolean z = gda.a;
                int i9 = cmb.p6;
                arrayList.add(new cnb(this.f0[i6].a, 0, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, i9));
                arrayList.add(new cnb(this.f0[i6].a, 0, new Class[]{xib.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, i9));
                arrayList.add(new cnb(this.f0[i6].x, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
                this.f0[i6].d.getClass();
                arrayList.add(new cnb((View) null, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
                i6++;
            }
        }
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.z0;
            if (i10 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new cnb(undoViewArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.vj));
            i10++;
        }
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.h5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.i5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.l5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.m5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.n5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.p7));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.o5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.p5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.q5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.I5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.s5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.t5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.u5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.v5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.w5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.x5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.y5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.D5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.G5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.H5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.z5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.A5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.B5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.E5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.J5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.L5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.M5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.N5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.O5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.P5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Q5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.R5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.T5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.U5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.yj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.zj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Dj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ej));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Fj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Gj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Hj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ij));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Jj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Kj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Lj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Mj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Nj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Jh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Kh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Lh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Mh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Nh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Oh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ph));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Qh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Rh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Sh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Th));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Uh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Vh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Yh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Zh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ai));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Wh));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Xh));
        uh4 uh4Var = this.c0;
        if (uh4Var != null) {
            arrayList.addAll(uh4Var.getThemeDescriptions());
            this.c0.updateColors();
        }
        hr3 hr3Var = this.i0;
        if (hr3Var != null) {
            hr3Var.updateColors();
            this.i0.invalidate();
        }
        sj3 sj3Var3 = this.D0;
        if (sj3Var3 != null) {
            iv9 iv9Var = sj3Var3.c0;
            SparseArray sparseArray = sj3Var3.h;
            pu9 pu9Var = sj3Var3.b0;
            for (int i11 = 0; i11 < pu9Var.getChildCount(); i11++) {
                View childAt = pu9Var.getChildAt(i11);
                if ((childAt instanceof ut8) || (childAt instanceof hg3) || (childAt instanceof ue5)) {
                    arrayList.add(new cnb(childAt, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
                }
            }
            for (int i12 = 0; i12 < sj3Var3.getChildCount(); i12++) {
                if (sj3Var3.getChildAt(i12) instanceof ch4) {
                    arrayList.addAll(((ch4) sj3Var3.getChildAt(i12)).getThemeDescriptions());
                }
            }
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view3 = (View) sparseArray.valueAt(i13);
                if (view3 instanceof ch4) {
                    arrayList.addAll(((ch4) view3).getThemeDescriptions());
                }
            }
            ch4 ch4Var = sj3Var3.P0;
            if (ch4Var != null) {
                arrayList.addAll(ch4Var.getThemeDescriptions());
            }
            arrayList.add(new cnb(iv9Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
            arrayList.add(new cnb(iv9Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.x6));
            arrayList.addAll(kwe.a(new t10(sj3Var3, (byte) 17), cmb.x8));
        }
        nl3 nl3Var = this.O1;
        byte b4 = 18;
        if (nl3Var != null) {
            arrayList.addAll(kwe.a(new t10(new bi3(nl3Var, b3), b4), cmb.c6, cmb.F6, cmb.x6));
        }
        x6c x6cVar = this.P1;
        if (x6cVar != null) {
            arrayList.addAll(kwe.a(new t10(new bi3(x6cVar, b), b4), cmb.c6, cmb.F6, cmb.x6, cmb.H6, cmb.p7));
        }
        l9 l9Var = this.N1;
        if (l9Var != null) {
            arrayList.addAll(kwe.a(new t10(new bi3(l9Var, b2), b4), cmb.c6, cmb.F6, cmb.x6, cmb.H6, cmb.p7));
        }
        return arrayList;
    }

    public final void h3(String str) {
        if (this.actionBar.e(str)) {
            return;
        }
        r6 q = this.actionBar.q(str);
        boolean z = this.X;
        byte b = 1;
        ArrayList arrayList = this.k1;
        if (z) {
            ImageView imageView = new ImageView(getParentActivity());
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setImageDrawable(new ee0(true));
            anb.s(this.i1, cmb.x8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.i1;
            int i = cmb.y8;
            anb.R(imageView2, cmb.f0(getThemedColor(i), 1, -1), null, anb.M(i), getResourceProvider());
            this.i1.setOnClickListener(new mh3(this, (byte) 6));
            q.addView(this.i1, qoe.r(54, 54, 16));
            arrayList.add(this.i1);
        }
        NumberTextView numberTextView = new NumberTextView(q.getContext());
        this.j1 = numberTextView;
        numberTextView.setTextSize(18);
        this.j1.setTypeface(gm.o());
        this.j1.setTextColor(getThemedColor(cmb.x8));
        q.addView(this.j1, qoe.m(1.0f, 0, -1, this.X ? 18 : 72, 0, 0));
        this.j1.setOnTouchListener(new w02((byte) 5));
        this.m1 = q.g(100, R.drawable.msg_pin, gm.L(48.0f));
        this.n1 = q.g(nm7.o1, R.drawable.msg_mute, gm.L(48.0f));
        this.o1 = q.g(nm7.r1, R.drawable.msg_archive, gm.L(48.0f));
        this.l1 = q.h(nm7.m1, R.drawable.msg_delete, gm.L(48.0f), jb6.M0(2131751535, null));
        r7 h = q.h(0, R.drawable.ic_ab_other, gm.L(48.0f), jb6.M0(2131754838, null));
        q.addView(new View(getParentActivity()), qoe.o(5, -1));
        this.s1 = h.e(nm7.p1, R.drawable.msg_archive, jb6.M0(2131754137, null));
        this.p1 = h.e(nm7.s1, R.drawable.msg_pin, jb6.M0(2131751390, null));
        this.q1 = h.e(nm7.t1, R.drawable.msg_addfolder, jb6.M0(2131750749, null));
        this.r1 = h.e(nm7.u1, R.drawable.msg_removefolder, jb6.M0(2131750647, null));
        this.u1 = h.e(101, R.drawable.msg_markread, jb6.M0(2131748438, null));
        this.t1 = h.e(nm7.n1, R.drawable.msg_clear, jb6.M0(2131752026, null));
        this.v1 = h.e(nm7.q1, R.drawable.msg_block, jb6.M0(2131753657, null));
        this.n1.setOnLongClickListener(new uh3(this, b));
        arrayList.add(this.m1);
        arrayList.add(this.o1);
        arrayList.add(this.n1);
        arrayList.add(this.l1);
        arrayList.add(h);
        p5(false);
    }

    public final void h4() {
        h5.c(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b5 A[EDGE_INSN: B:63:0x01b5->B:64:0x01b5 BREAK  A[LOOP:3: B:55:0x01a4->B:61:0x01b2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h5(long j, View view) {
        ArrayList o3;
        int i;
        TLRPC.EncryptedChat Z0;
        ValueAnimator valueAnimator;
        int i2;
        mk3[] mk3VarArr;
        float max;
        ak3 ak3Var;
        ee0 ee0Var;
        A2(j, view);
        boolean y = this.actionBar.y();
        ArrayList arrayList = this.K2;
        boolean z = true;
        char c = 1;
        if (!y) {
            if (this.s3) {
                h3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof a27)) {
                    this.actionBar.setBackButtonDrawable(new ee0(false));
                }
            } else {
                h3(null);
            }
            gm.t1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(cmb.c6));
            this.actionBar.R(null, null);
            int i3 = this.f0[0].s;
            if (!(i3 == 7 || i3 == 8) || (this.actionBar.y() && !this.actionBar.z(null))) {
                o3 = getMessagesController().V0(this.Y2);
            } else if (K3(this.f0[0])) {
                ub7 s3 = s3(this.f0[0]);
                ArrayList arrayList2 = getMessagesController().y;
                int size = arrayList2.size();
                i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i4);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && s3.j.get(dialog.id, TLObject.FLAG_31) != Integer.MIN_VALUE) {
                        long j2 = dialog.id;
                        if (pg3.B(j2) && (Z0 = getMessagesController().Z0(Integer.valueOf((int) (4294967295L & j2)))) != null) {
                            j2 = Z0.user_id;
                        }
                        if (s3.b(getAccountInstance(), j2, dialog, false)) {
                            i++;
                        }
                    }
                }
                if (i > 1) {
                    if (this.f0 != null) {
                        int i5 = 0;
                        while (true) {
                            mk3[] mk3VarArr2 = this.f0;
                            if (i5 >= mk3VarArr2.length) {
                                break;
                            }
                            mk3VarArr2[i5].d.I = true;
                            i5++;
                        }
                    }
                    int i6 = oc7.s5;
                    G5(131072, true);
                }
                if (!this.s3) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList3 = new ArrayList();
                    int i7 = 0;
                    while (true) {
                        ArrayList arrayList4 = this.k1;
                        if (i7 >= arrayList4.size()) {
                            break;
                        }
                        View view2 = (View) arrayList4.get(i7);
                        view2.setPivotY(a.getCurrentActionBarHeight() / 2);
                        gm.y(view2);
                        arrayList3.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        i7++;
                    }
                    animatorSet.playTogether(arrayList3);
                    animatorSet.setDuration(200L);
                    animatorSet.start();
                }
                valueAnimator = this.x3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.x3 = ValueAnimator.ofFloat(this.w3, 1.0f);
                i2 = 0;
                while (true) {
                    mk3VarArr = this.f0;
                    if (i2 < mk3VarArr.length) {
                        break;
                    }
                    mk3 mk3Var = mk3VarArr[i2];
                    if (mk3Var != null) {
                        mk3Var.a.J0(true);
                    }
                    i2++;
                }
                max = Math.max(0.0f, gm.L((!this.L ? 81 : 0) + 48) + this.O);
                if (max != 0.0f) {
                    this.Q = (int) max;
                    this.fragmentView.requestLayout();
                }
                this.x3.addUpdateListener(new oh3(this, max, (byte) 0));
                this.x3.addListener(new mj3(this, max, c == true ? 1 : 0));
                this.x3.setInterpolator(d53.f);
                this.x3.setDuration(200L);
                this.x3.start();
                ak3Var = this.A0;
                if (ak3Var != null) {
                    ak3Var.b(cmb.wi, cmb.vi, cmb.ui, cmb.xi, cmb.v8);
                }
                ee0Var = this.g1;
                if (ee0Var != null) {
                    ee0Var.c(true, 1.0f);
                }
                z = false;
            } else {
                o3 = o3(this.currentAccount, this.f0[0].s, this.Y2, this.U1);
            }
            int size2 = o3.size();
            i = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) o3.get(i8);
                if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                    if (!H3(dialog2)) {
                        if (!getMessagesController().D2(dialog2.id, false)) {
                            break;
                        }
                    } else {
                        i++;
                    }
                }
            }
            if (i > 1) {
            }
            if (!this.s3) {
            }
            valueAnimator = this.x3;
            if (valueAnimator != null) {
            }
            this.x3 = ValueAnimator.ofFloat(this.w3, 1.0f);
            i2 = 0;
            while (true) {
                mk3VarArr = this.f0;
                if (i2 < mk3VarArr.length) {
                }
                i2++;
            }
            max = Math.max(0.0f, gm.L((!this.L ? 81 : 0) + 48) + this.O);
            if (max != 0.0f) {
            }
            this.x3.addUpdateListener(new oh3(this, max, (byte) 0));
            this.x3.addListener(new mj3(this, max, c == true ? 1 : 0));
            this.x3.setInterpolator(d53.f);
            this.x3.setDuration(200L);
            this.x3.start();
            ak3Var = this.A0;
            if (ak3Var != null) {
            }
            ee0Var = this.g1;
            if (ee0Var != null) {
            }
            z = false;
        } else if (arrayList.isEmpty()) {
            A3(true);
            return;
        }
        p5(false);
        this.j1.a(arrayList.size(), z);
    }

    public final void i3() {
        sj3 sj3Var = this.D0;
        if ((sj3Var != null && sj3Var.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        byte b = 1;
        byte b2 = 2;
        byte b3 = 0;
        sj3 sj3Var2 = new sj3(this, getParentActivity(), this, this.p2 != null ? 2 : !this.n2 ? 1 : 0, this.T0, this.Y2, this.a3, new k6d((Object) this, (byte) 29));
        this.D0 = sj3Var2;
        this.glassEngine.c(sj3Var2);
        ((gk3) this.fragmentView).addView(this.D0, this.C0);
        sj3 sj3Var3 = this.D0;
        sj3Var3.e0.V = new uj3(this);
        sj3Var3.l0.setOnItemClickListener(new nh3(this, b));
        this.D0.q0.setOnItemClickListener(new nh3(this, b2));
        this.D0.x0.setOnItemClickListener(new qh3(this, b3));
        this.D0.q0.setOnItemLongClickListener(new nh3(this, (byte) 3));
        this.D0.b0.setOnItemClickListener(new nh3(this, (byte) 4));
        this.D0.b0.setOnItemLongClickListener(new ni3(this));
        this.D0.setFilteredSearchViewDelegate(new nh3(this, (byte) 5));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.v4);
    }

    public final void i4() {
        PasskeysActivity.f0(this.currentAccount, this.resourceProvider, getParentActivity(), true);
    }

    public final void i5(long j, View view) {
        int i = -this.N3;
        this.N3 = i;
        gm.A3(i, view, null);
        xx0.E.a();
        String r = j >= 0 ? m9c.r(oc7.r1(this.currentAccount).W1(Long.valueOf(j))) : "";
        (getMessagesController().H3() ? c41.b0(this).Q(R.raw.star_premium_2, 36, gm.S2(jb6.a0(null, null, 2131743447, r))) : c41.b0(this).K(R.raw.star_premium_2, gm.S2(jb6.a0(null, null, 2131743447, r)), jb6.M0(2131743446, null), new kh3(this, (byte) 15))).j();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        dj3 dj3Var;
        return (this.l2 || (dj3Var = this.H3) == null || dj3Var.getFragment() == null) ? on2.h(getThemedColor(cmb.c6)) > 0.699999988079071d : this.H3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // aj6
    public final nz4 j() {
        return this.r4;
    }

    public final void j3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.z0;
        if (undoViewArr[0] != null || (parentActivity = getParentActivity()) == null) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            undoViewArr[i] = new nj3(this, parentActivity);
            FrameLayout.LayoutParams d = qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
            d.bottomMargin = this.m4 + this.o4 + d.bottomMargin;
            gk3 gk3Var = (gk3) this.fragmentView;
            UndoView undoView = undoViewArr[i];
            int i2 = this.y0 + 1;
            this.y0 = i2;
            gk3Var.addView(undoView, i2, d);
        }
    }

    public final /* synthetic */ void j4() {
        oc7.r1(this.currentAccount).p4(0L, "SETUP_PASSKEY");
        q5();
    }

    public final void j5(boolean z) {
        if (this.f0 == null || this.O3 == z) {
            return;
        }
        this.O3 = z;
        int i = 0;
        while (true) {
            mk3[] mk3VarArr = this.f0;
            if (i >= mk3VarArr.length) {
                return;
            }
            if (z) {
                mk3VarArr[i].a.setScrollbarFadingEnabled(false);
            }
            this.f0[i].a.setVerticalScrollBarEnabled(z);
            if (z) {
                this.f0[i].a.setScrollbarFadingEnabled(true);
            }
            i++;
        }
    }

    public final void k3(final long j, final long j2, boolean z, final sxb sxbVar) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String M0;
        String b0;
        String M02;
        TLRPC.TL_forumTopic f;
        if (K2(j)) {
            int i = this.T0;
            if (i == 11 || i == 12 || i == 13) {
                if (pg3.D(j)) {
                    TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j));
                    if (!W1.mutual_contact) {
                        UndoView w3 = w3();
                        if (w3 != null) {
                            w3.j(45, j, null);
                            return;
                        }
                        return;
                    }
                    user = W1;
                    chat = null;
                } else {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j));
                    if (!sd2.N(L0) || !sd2.w(1, L0)) {
                        UndoView w32 = w3();
                        if (w32 != null) {
                            w32.j(46, j, null);
                            return;
                        }
                        return;
                    }
                    chat = L0;
                    user = null;
                }
                he heVar = new he(3, null, getParentActivity());
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().i1(j);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new ii3(this, heVar, user, chat, j, tL_messages_checkHistoryImportPeer));
                try {
                    heVar.q(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (!z || ((this.h2 == null || this.i2 == null) && this.j2 == null)) {
                if (i != 15) {
                    if (this.E2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bf7.a(j, j2));
                    if (this.E2.q(this, arrayList, null, false, this.L2, this.M2, this.N2, sxbVar) && this.k2) {
                        this.E2 = null;
                        return;
                    }
                    return;
                }
                Runnable of2Var = new of2((Object) this, j, (Object) new n40((Object) this, j, j2, (Object) sxbVar, (byte) 2), (byte) 21);
                if (j < 0) {
                    m5(getMessagesController().L0(Long.valueOf(-j)), of2Var, null);
                    return;
                }
                TLRPC.User W12 = getMessagesController().W1(Long.valueOf(j));
                TLRPC.User W13 = getMessagesController().W1(Long.valueOf(this.I));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String a0 = jb6.a0(null, null, 2131754039, m9c.k(W12, true), m9c.k(W13, true));
                he heVar2 = alertDialog$Builder.a;
                heVar2.S = a0;
                heVar2.U = TextUtils.concat(gm.S2(jb6.a0(null, null, 2131754040, m9c.k(W12, true), m9c.k(W13, true))));
                alertDialog$Builder.j(jb6.a0("Send", null, 2131745374, new Object[0]), new wm2(of2Var, (byte) 25));
                alertDialog$Builder.g(jb6.a0("Cancel", null, 2131752542, new Object[0]), new dq9((byte) 14));
                showDialog(heVar2);
                return;
            }
            if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                if (pg3.B(j)) {
                    TLRPC.User W14 = getMessagesController().W1(Long.valueOf(getMessagesController().Z0(Integer.valueOf((int) (4294967295L & j))).user_id));
                    if (W14 == null) {
                        return;
                    }
                    M0 = jb6.M0(2131745330, null);
                    b0 = jb6.b0(this.h2, m9c.r(W14));
                    M02 = jb6.M0(2131745374, null);
                } else if (!pg3.D(j)) {
                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(-j));
                    if (L02 == null) {
                        return;
                    }
                    String str = L02.title;
                    if (j2 != 0 && (f = getMessagesController().g4.f(L02.id, j2)) != null) {
                        str = ((Object) str) + " " + f.title;
                    }
                    if (this.j2 != null) {
                        M0 = jb6.M0(2131754363, null);
                        b0 = jb6.b0(this.j2, str);
                        M02 = jb6.M0(2131754483, null);
                    } else {
                        M0 = jb6.M0(2131745330, null);
                        b0 = jb6.b0(this.i2, str);
                        M02 = jb6.M0(2131745374, null);
                    }
                } else if (j == getUserConfig().e()) {
                    M0 = jb6.M0(2131745330, null);
                    b0 = jb6.b0(this.i2, jb6.M0(2131745635, null));
                    M02 = jb6.M0(2131745374, null);
                } else {
                    TLRPC.User W15 = getMessagesController().W1(Long.valueOf(j));
                    if (W15 == null || this.h2 == null) {
                        return;
                    }
                    M0 = jb6.M0(2131745330, null);
                    b0 = jb6.b0(this.h2, m9c.r(W15));
                    M02 = jb6.M0(2131745374, null);
                }
                he heVar3 = alertDialog$Builder2.a;
                heVar3.S = M0;
                heVar3.U = gm.S2(b0);
                alertDialog$Builder2.j(M02, new ee() { // from class: ji3
                    @Override // ee
                    public final void r(he heVar4, int i2) {
                        nk3.this.k3(j, j2, false, sxbVar);
                    }
                });
                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                if (showDialog(heVar3) == null) {
                    heVar3.show();
                }
            }
        }
    }

    public final /* synthetic */ void k4() {
        oc7.r1(this.currentAccount).p4(0L, "PREMIUM_GRACE");
        q5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k5(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        sj3 sj3Var;
        boolean z6;
        vgc vgcVar;
        TLRPC.Chat chat;
        dj3 dj3Var;
        sj3 sj3Var2;
        sj3 sj3Var3;
        float f;
        aj3 aj3Var;
        sj3 sj3Var4;
        boolean z7 = z3;
        this.b.a(z, z7);
        byte b = 0;
        if (z) {
            i3();
        } else {
            A5(false);
        }
        int i = this.T0;
        if (i != 0 && i != 3) {
            z7 = false;
        }
        AnimatorSet animatorSet = this.y1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.y1 = null;
        }
        this.s3 = z;
        this.glassEngine.g();
        if (z) {
            if (!this.v3 && !z4) {
                ArrayList arrayList = (ArrayList) getMessagesController().w.get(0);
                int size = arrayList != null ? arrayList.size() : 0;
                if (this.n2 || (size <= 10 && !this.L)) {
                    z5 = true;
                    sj3Var = this.D0;
                    if (sj3Var != null) {
                        sj3Var.R0 = z5;
                    }
                    z6 = z5 || this.L;
                    this.u3 = z6;
                    if (z6) {
                        this.v3 = true;
                    }
                    vgcVar = this.b0;
                    if (vgcVar != null && sj3Var != null && !z5 && this.a3 == 0) {
                        vgc l = sj3Var.l(-2, false);
                        this.b0 = l;
                        this.a0.addView(l, 0, qoe.e(-1, -1, nm7.D1));
                    } else if (this.a0 != null && z5 && this.a3 == 0) {
                        gm.B2(vgcVar);
                        this.b0 = null;
                    }
                    if (this.D0 != null) {
                        c3(false);
                        this.D0.setKeyboardHeight(((gk3) this.fragmentView).getKeyboardHeight());
                        sj3 sj3Var5 = this.D0;
                        sj3Var5.D0.clear();
                        sj3Var5.L();
                    }
                    chat = this.b3;
                    if (chat == null) {
                        sh4 sh4Var = new sh4(R.drawable.search_users_filled, 4, pg3.t(chat));
                        sh4Var.f = this.b3;
                        B2(sh4Var);
                    } else if (this.Y2 != 0 && ((dj3Var = this.H3) == null || !dj3Var.c())) {
                        B2(new sh4(R.drawable.chats_archive, 2131754115, null, 7));
                    }
                }
            }
            z5 = false;
            sj3Var = this.D0;
            if (sj3Var != null) {
            }
            if (z5) {
            }
            this.u3 = z6;
            if (z6) {
            }
            vgcVar = this.b0;
            if (vgcVar != null) {
            }
            if (this.a0 != null) {
                gm.B2(vgcVar);
                this.b0 = null;
            }
            if (this.D0 != null) {
            }
            chat = this.b3;
            if (chat == null) {
            }
        } else {
            s5(false, z7);
        }
        if (z7 && (sj3Var4 = this.D0) != null && sj3Var4.e0.M()) {
            gm.g3(getParentActivity(), this.classGuid);
        } else {
            gm.V2(getParentActivity(), this.classGuid);
        }
        if (!z && (aj3Var = this.F0) != null && this.H0) {
            aj3Var.setVisibility(0);
        }
        Object[] objArr = gda.o() == 0 || !e86.e(32768);
        if (z7) {
            if (z) {
                sj3 sj3Var6 = this.D0;
                if (sj3Var6 != null) {
                    sj3Var6.setVisibility(0);
                    sj3 sj3Var7 = this.D0;
                    sj3Var7.setPosition(0);
                    if (sj3Var7.e0.b() > 0) {
                        sj3Var7.f0.g1(0, 0);
                    }
                    u46 u46Var = sj3Var7.k0;
                    if (u46Var != null) {
                        u46Var.g1(0, 0);
                    }
                    u46 u46Var2 = sj3Var7.p0;
                    if (u46Var2 != null) {
                        u46Var2.g1(0, 0);
                    }
                    u46 u46Var3 = sj3Var7.w0;
                    if (u46Var3 != null) {
                        u46Var3.g1(0, 0);
                    }
                    sj3Var7.h.clear();
                }
                t5(true, null, null, false, false);
                vgc vgcVar2 = this.b0;
                if (vgcVar2 != null) {
                    vgcVar2.b(false, false);
                }
            } else {
                this.f0[0].a.setVisibility(0);
                this.f0[0].setVisibility(0);
            }
            U4(true, true);
            this.f0[0].a.setVerticalScrollBarEnabled(false);
            sj3 sj3Var8 = this.D0;
            if (sj3Var8 != null) {
                anb.h(cmb.c6, getResourceProvider(), sj3Var8);
            }
            this.y1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            mk3 mk3Var = this.f0[0];
            Property property = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(mk3Var, (Property<mk3, Float>) property, z ? 0.0f : 1.0f));
            mk3[] mk3VarArr = this.f0;
            if (objArr == true) {
                mk3VarArr[0].setScaleX(1.0f);
                this.f0[0].setScaleY(1.0f);
            } else {
                arrayList2.add(ObjectAnimator.ofFloat(mk3VarArr[0], (Property<mk3, Float>) View.SCALE_X, z ? 0.95f : 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f0[0], (Property<mk3, Float>) View.SCALE_Y, z ? 0.95f : 1.0f));
            }
            dj3 dj3Var2 = this.H3;
            if (dj3Var2 != null) {
                dj3Var2.setVisibility(0);
                arrayList2.add(ObjectAnimator.ofFloat(this.H3, (Property<dj3, Float>) property, z ? 0.0f : 1.0f));
            }
            sj3 sj3Var9 = this.D0;
            if (sj3Var9 != null) {
                arrayList2.add(ObjectAnimator.ofFloat(sj3Var9, (Property<sj3, Float>) property, z ? 1.0f : 0.0f));
                if (this.L) {
                    float L = gm.L(81.0f) + this.O + gm.L(48.0f);
                    sj3 sj3Var10 = this.D0;
                    if (z) {
                        f = L;
                        L = 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(sj3Var10, this.J3, f, L));
                }
                sj3 sj3Var11 = this.D0;
                if (objArr == true) {
                    sj3Var11.setScaleX(1.0f);
                    this.D0.setScaleY(1.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(sj3Var11, (Property<sj3, Float>) View.SCALE_X, z ? 1.0f : 1.05f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.D0, (Property<sj3, Float>) View.SCALE_Y, z ? 1.0f : 1.05f));
                }
            }
            if (this.h0 != null) {
                w5(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z1, z ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ph3(this, (byte) 0));
            arrayList2.add(ofFloat);
            this.y1.playTogether(arrayList2);
            this.y1.setDuration(z ? 200L : 180L);
            this.y1.setInterpolator(d53.g);
            if (!z) {
                this.y1.setStartDelay(20L);
            }
            this.y1.addListener(new jj3(this, z, b));
            this.r3.d();
            this.y1.start();
        } else {
            U4(false, true);
            mk3[] mk3VarArr2 = this.f0;
            if (z) {
                mk3VarArr2[0].a.d1();
            } else {
                jk3 jk3Var = mk3VarArr2[0].a;
                if (jk3Var.h1) {
                    jk3Var.h1 = false;
                    jk3Var.L0(false);
                }
            }
            this.f0[0].setAlpha(z ? 0.0f : 1.0f);
            mk3[] mk3VarArr3 = this.f0;
            if (objArr == true) {
                mk3VarArr3[0].setScaleX(1.0f);
                this.f0[0].setScaleY(1.0f);
            } else {
                mk3VarArr3[0].setScaleX(z ? 0.95f : 1.0f);
                this.f0[0].setScaleY(z ? 0.95f : 1.0f);
            }
            sj3 sj3Var12 = this.D0;
            if (sj3Var12 != null) {
                sj3Var12.setAlpha(z ? 1.0f : 0.0f);
                sj3 sj3Var13 = this.D0;
                if (objArr == true) {
                    sj3Var13.setScaleX(1.0f);
                    this.D0.setScaleY(1.0f);
                } else {
                    sj3Var13.setScaleX(z ? 1.0f : 1.1f);
                    this.D0.setScaleY(z ? 1.0f : 1.1f);
                }
                this.D0.setVisibility(z ? 0 : 8);
            }
            zj3 zj3Var = this.Y;
            if (zj3Var != null) {
                zj3Var.setTranslationY(u3() + (z ? -gm.L(36.0f) : 0));
            }
            if (this.F0 != null) {
                if (!this.H0 || isInPreviewMode() || z) {
                    this.F0.setVisibility(8);
                } else {
                    this.F0.setVisibility(0);
                }
            }
            X4(z ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i2 = this.y;
        if (i2 >= 0 && (sj3Var3 = this.D0) != null) {
            sj3Var3.setPosition(sj3Var3.N(i2));
        }
        if (!z) {
            this.y = -1;
        } else if (z2 && (sj3Var2 = this.D0) != null) {
            sj3Var2.setPosition((sj3Var2.t0 ? 1 : 0) + 5);
            A5(true);
        }
        b3();
        q5();
    }

    public final void l3(Canvas canvas, int i) {
        tk5 tk5Var;
        if (this.parentLayout == null || this.actionBar == null) {
            return;
        }
        float max = Math.max(this.e.e, t3());
        float f = 1.0f;
        float f2 = 1.0f - this.z1;
        float f3 = max * f2 * f2;
        if (f3 != 0.0f) {
            if (-1 >= i) {
                f = 0.0f;
                i = -1;
            }
            if (f <= 0.0f || f3 <= 0.0f || i <= 0 || (tk5Var = this.parentLayout) == null) {
                return;
            }
            ((ActionBarLayout) tk5Var).n(canvas, (int) (f * 255.0f * f3), i);
        }
    }

    public final /* synthetic */ void l4(TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        oc7.r1(this.currentAccount).p4(0L, tL_pendingSuggestion.suggestion);
        q5();
    }

    public final void l5() {
        int i;
        int i2;
        if (this.N0 != null || gda.w) {
            return;
        }
        if (!this.L || this.F0.g()) {
            mz9[] mz9VarArr = new mz9[1];
            TLRPC.User f = z8c.h(z8c.t0).f();
            lka titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView == null || titleTextView.getRightDrawable() == null) {
                i = 0;
                i2 = 0;
            } else {
                this.F3.f();
                Drawable drawable = this.F3.f[0];
                Rect rect = gm.Q;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int L = (-(this.actionBar.getHeight() - rect.centerY())) - gm.L(16.0f);
                i = gm.L(4.0f) + (rect.centerX() - gm.L(16.0f));
                yn ynVar = this.G3;
                if (ynVar != null) {
                    ynVar.b(rect.centerX(), rect.centerY());
                }
                i2 = L;
            }
            ej3 ej3Var = new ej3(this, this, getParentActivity(), Integer.valueOf(i), getResourceProvider(), mz9VarArr);
            if (f != null && pg3.g(f.emoji_status) > 0) {
                ej3Var.setExpireDateHint(pg3.g(f.emoji_status));
            }
            Long l = this.D3;
            if (l != null) {
                ej3Var.setSelected(l);
            } else {
                Drawable drawable2 = this.F3.f[0];
                ej3Var.setSelected(drawable2 instanceof vm ? Long.valueOf(((vm) drawable2).h()) : null);
            }
            ej3Var.setSaveState(1);
            ej3Var.y(this.F3, titleTextView);
            fj3 fj3Var = new fj3(this, ej3Var);
            this.N0 = fj3Var;
            mz9VarArr[0] = fj3Var;
            fj3Var.showAsDropDown(this.actionBar, gm.L(16.0f), i2, 48);
            mz9VarArr[0].a();
        }
    }

    public final void m3(long j, boolean z) {
        if (this.f0 == null) {
            return;
        }
        int i = 0;
        while (true) {
            mk3[] mk3VarArr = this.f0;
            if (i >= mk3VarArr.length) {
                return;
            }
            int childCount = mk3VarArr[i].a.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = this.f0[i].a.getChildAt(i2);
                    if (childAt instanceof hg3) {
                        hg3 hg3Var = (hg3) childAt;
                        if (hg3Var.getDialogId() == j) {
                            hg3Var.d0(z, true);
                            break;
                        }
                    }
                    i2++;
                }
            }
            i++;
        }
    }

    public final /* synthetic */ void m4() {
        oc7.r1(this.currentAccount).p4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        q5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0069, code lost:
    
        if (r13.H.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [nk3, org.telegram.ui.ActionBar.d] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String a0;
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
        boolean V = sd2.V(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String a02 = jb6.a0(null, null, 2131754039, chat.title, m9c.k(W1, true));
        he heVar = alertDialog$Builder.a;
        heVar.S = a02;
        SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, 2131754040, chat.title, m9c.k(W1, true)));
        Boolean bool = this.H.bot_participant;
        ?? r10 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().w2(chat, W1)) {
            charSequence = r10;
        }
        if (this.H.bot_admin_rights == null) {
            a0 = jb6.a0(null, null, 2131754042, m9c.k(W1, true), chat.title);
        } else {
            String k = m9c.k(W1, true);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.H.bot_admin_rights;
            int i = na9.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                kt6.r(1, V ? jb6.M0(2131751261, null) : jb6.M0(2131751260, null), arrayList);
            }
            if (tL_chatAdminRights.post_messages && V) {
                kt6.r(1, jb6.M0(2131751249, null), arrayList);
            }
            if (tL_chatAdminRights.edit_messages && V) {
                kt6.r(1, jb6.M0(2131751256, null), arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                kt6.r(1, jb6.M0(V ? 2131751258 : 2131751253, null), arrayList);
            }
            if (tL_chatAdminRights.ban_users && !V) {
                kt6.r(1, jb6.M0(2131751265, null), arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                kt6.r(1, jb6.M0(2131751267, null), arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !V) {
                kt6.r(1, jb6.M0(2131751250, null), arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                kt6.r(1, jb6.M0(2131751268, null), arrayList);
            }
            if (tL_chatAdminRights.anonymous && !V) {
                kt6.r(1, jb6.M0(2131751240, null), arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                kt6.r(1, jb6.M0(2131744590, null), arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !V) {
                kt6.r(1, jb6.M0(2131748449, null), arrayList);
            }
            if (arrayList.size() == 1) {
                r10 = ((oa9) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r10 = new SpannableStringBuilder();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        r10.append(", ");
                    }
                    r10.append(((oa9) arrayList.get(i2)).b.toString().toLowerCase());
                }
            }
            a0 = jb6.a0(null, null, 2131754041, new Object[]{k, str, r10});
        }
        charSequence = TextUtils.concat("\n\n", gm.S2(a0));
        heVar.U = TextUtils.concat(S2, charSequence);
        alertDialog$Builder.j(jb6.a0("Send", null, 2131745374, new Object[0]), new cf(runnable, (byte) 7));
        alertDialog$Builder.g(jb6.a0("Cancel", null, 2131752542, new Object[0]), new cf(runnable2, (byte) 8));
        showDialog(heVar);
    }

    public final void n4(mk0 mk0Var) {
        ArrayList arrayList = mk0Var.c;
        if (arrayList.size() != 1) {
            yw4.f1(false, mk0Var);
            return;
        }
        ux4 ux4Var = new ux4(getParentActivity(), this.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
        ux4Var.a1(true);
        showDialog(ux4Var);
    }

    public final void n5(boolean z) {
        mk3[] mk3VarArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            mk3VarArr = this.f0;
            if (i2 >= mk3VarArr.length) {
                break;
            }
            mk3VarArr[i2].a.D0();
            i2++;
        }
        char c = (!z || mk3VarArr.length <= 1) ? (char) 0 : (char) 1;
        int i3 = mk3VarArr[c].h;
        if (i3 < 0 || i3 >= getMessagesController().S0().size()) {
            return;
        }
        ub7 ub7Var = (ub7) getMessagesController().S0().get(this.f0[c].h);
        boolean d = ub7Var.d();
        mk3[] mk3VarArr2 = this.f0;
        if (d) {
            mk3 mk3Var = mk3VarArr2[c];
            mk3Var.s = this.T0;
            jk3 jk3Var = mk3Var.a;
            int i4 = jk3.C3;
            jk3Var.D1();
        } else {
            if (mk3VarArr2[c ^ 1].s == 7) {
                mk3VarArr2[c].s = 8;
            } else {
                mk3VarArr2[c].s = 7;
            }
            mk3VarArr2[c].a.setScrollEnabled(true);
            oc7 messagesController = getMessagesController();
            char c2 = this.f0[c].s == 8 ? (char) 1 : (char) 0;
            ub7[] ub7VarArr = messagesController.N;
            ub7 ub7Var2 = ub7VarArr[c2];
            if (ub7Var2 != ub7Var) {
                ub7VarArr[c2] = ub7Var;
                int i5 = c2 ^ 1;
                if (ub7VarArr[i5] == ub7Var) {
                    ub7VarArr[i5] = null;
                }
                if (ub7VarArr[c2] != null) {
                    messagesController.b5(null);
                } else if (ub7Var2 != null) {
                    ub7Var2.k.clear();
                    ub7Var2.l.clear();
                }
            }
        }
        mk3[] mk3VarArr3 = this.f0;
        if (mk3VarArr3.length > 1) {
            mk3VarArr3[1].F = ub7Var.p;
        }
        mk3 mk3Var2 = mk3VarArr3[c];
        qi3 qi3Var = mk3Var2.d;
        qi3Var.h = mk3Var2.s;
        qi3Var.f();
        mk3 mk3Var3 = this.f0[c];
        mi3 mi3Var = mk3Var3.c;
        if (mk3Var3.s == 0 && y3() && this.f0[c].w == 2) {
            i = 1;
        }
        mi3Var.g1(i, (int) this.O);
        M2(this.f0[c]);
    }

    /* JADX WARN: Removed duplicated region for block: B:288:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0216 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList o3(int i, int i2, int i3, boolean z) {
        boolean z2;
        long j;
        ArrayList arrayList;
        if (z && (arrayList = this.T1) != null) {
            return arrayList;
        }
        oc7 r1 = oc7.r1(j5.a(i).a);
        vh6 vh6Var = r1.R;
        ArrayList arrayList2 = r1.K;
        ArrayList arrayList3 = r1.J;
        ArrayList arrayList4 = r1.I;
        ArrayList arrayList5 = r1.H;
        ArrayList arrayList6 = r1.M;
        ArrayList arrayList7 = r1.G;
        if (i2 == 0) {
            return (i3 == 0 && E3()) ? r1.q4 : r1.V0(i3);
        }
        if (i2 == 10 || i2 == 13) {
            return r1.F;
        }
        if (i2 == 2) {
            ArrayList arrayList8 = new ArrayList(arrayList4.size() + arrayList5.size() + arrayList7.size() + 2);
            if (arrayList5.size() > 0 && this.A2) {
                arrayList8.add(new ik3(0));
                arrayList8.addAll(arrayList5);
            }
            if (arrayList4.size() > 0 && this.x2) {
                arrayList8.add(new ik3(1));
                arrayList8.addAll(arrayList4);
            }
            if (arrayList7.size() > 0) {
                int size = arrayList7.size();
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList7.get(i4);
                    if ((this.A2 && sd2.U(i, -dialog.id)) || (this.x2 && (sd2.m0(i, -dialog.id) || !sd2.S(i, -dialog.id)))) {
                        if (r9) {
                            arrayList8.add(new ik3(2));
                            r9 = false;
                        }
                        arrayList8.add(dialog);
                    }
                }
            }
            return arrayList8;
        }
        if (i2 == 3) {
            return r1.E;
        }
        if (i2 == 4 || i2 == 12) {
            return arrayList2;
        }
        if (i2 == 5) {
            return arrayList3;
        }
        if (i2 == 6 || i2 == 11) {
            return arrayList6;
        }
        if (i2 == 7 || i2 == 8) {
            ub7 ub7Var = r1.N[i2 != 7 ? 1 : 0];
            return ub7Var == null ? r1.V0(i3) : this.T0 == 3 ? ub7Var.l : ub7Var.k;
        }
        if (i2 == 9) {
            return r1.L;
        }
        if (i2 != 1 && i2 != 16 && i2 != 14) {
            if (i2 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList9 = new ArrayList();
            TLRPC.User W1 = r1.W1(Long.valueOf(this.I));
            TLRPC.RequestPeerType requestPeerType = this.H;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                ConcurrentHashMap concurrentHashMap = r1.d;
                int size2 = arrayList2.size();
                while (r8 < size2) {
                    Object obj = arrayList2.get(r8);
                    r8++;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) obj;
                    if (A4(getMessagesController().W1(Long.valueOf(dialog2.id)))) {
                        arrayList9.add(dialog2);
                    }
                }
                for (TLRPC.User user : concurrentHashMap.values()) {
                    if (user != null && !vh6Var.d(user.id) && A4(user)) {
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_dialog.peer = tL_peerUser;
                        long j2 = user.id;
                        tL_peerUser.user_id = j2;
                        tL_dialog.id = j2;
                        arrayList9.add(tL_dialog);
                    }
                }
            } else {
                boolean z3 = requestPeerType instanceof TLRPC.TL_requestPeerTypeChat;
                if (z3 || (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                    ConcurrentHashMap concurrentHashMap2 = r1.b;
                    if (z3) {
                        arrayList3 = arrayList6;
                    }
                    int size3 = arrayList3.size();
                    while (r8 < size3) {
                        Object obj2 = arrayList3.get(r8);
                        r8++;
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) obj2;
                        if (z4(getMessagesController().L0(Long.valueOf(-dialog3.id)), W1)) {
                            arrayList9.add(dialog3);
                        }
                    }
                    for (TLRPC.Chat chat : concurrentHashMap2.values()) {
                        if (chat != null && !vh6Var.d(-chat.id) && z4(chat, W1)) {
                            TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                            if (sd2.T(chat)) {
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_dialog2.peer = tL_peerChannel;
                                j = chat.id;
                                tL_peerChannel.channel_id = j;
                            } else {
                                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                tL_dialog2.peer = tL_peerChat;
                                j = chat.id;
                                tL_peerChat.chat_id = j;
                            }
                            tL_dialog2.id = -j;
                            arrayList9.add(tL_dialog2);
                        }
                    }
                }
            }
            return arrayList9;
        }
        ArrayList arrayList10 = this.Z3;
        if (arrayList10 != null) {
            return arrayList10;
        }
        this.Z3 = new ArrayList();
        r9 = i2 == 16;
        if (this.B2 || this.C2 || r9) {
            int size4 = arrayList2.size();
            int i5 = 0;
            while (i5 < size4) {
                Object obj3 = arrayList2.get(i5);
                i5++;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) obj3;
                TLRPC.User W12 = r1.W1(Long.valueOf(dialog4.id));
                if (W12 != null && !m9c.z(W12)) {
                    if (!r9) {
                        if (W12.bot) {
                            if (this.C2) {
                                if (m9c.D(W12)) {
                                }
                            }
                        } else if (this.B2) {
                            if (m9c.D(W12)) {
                            }
                        }
                        this.Z3.add(dialog4);
                    } else if (!m9c.C(W12.id) && !oc7.G2(W12)) {
                        this.Z3.add(dialog4);
                    }
                }
            }
        }
        if (this.x2 || (((z2 = this.z2) && this.y2) || r9)) {
            int size5 = arrayList6.size();
            int i6 = 0;
            while (i6 < size5) {
                Object obj4 = arrayList6.get(i6);
                i6++;
                TLRPC.Dialog dialog5 = (TLRPC.Dialog) obj4;
                TLRPC.Chat L0 = r1.L0(Long.valueOf(-dialog5.id));
                if (L0 != null && !sd2.V(L0)) {
                    if (r9) {
                        if (sd2.n0(L0)) {
                            this.Z3.add(dialog5);
                        }
                    } else if (r1.v(dialog5)) {
                        this.Z3.add(dialog5);
                    }
                }
            }
        } else if (z2 || this.y2 || r9) {
            int size6 = arrayList6.size();
            int i7 = 0;
            while (i7 < size6) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                TLRPC.Dialog dialog6 = (TLRPC.Dialog) obj5;
                TLRPC.Chat L02 = r1.L0(Long.valueOf(-dialog6.id));
                if (L02 != null && !sd2.V(L02)) {
                    if (r9) {
                        if (sd2.n0(L02)) {
                            this.Z3.add(dialog6);
                        }
                    } else if (r1.v(dialog6)) {
                        if (this.z2) {
                            if (!sd2.n0(L02)) {
                                this.Z3.add(dialog6);
                            }
                        }
                        if (this.y2 && sd2.n0(L02)) {
                            this.Z3.add(dialog6);
                        }
                    }
                }
            }
        }
        if (this.A2 || r9) {
            int size7 = arrayList3.size();
            while (r8 < size7) {
                Object obj6 = arrayList3.get(r8);
                r8++;
                TLRPC.Dialog dialog7 = (TLRPC.Dialog) obj6;
                TLRPC.Chat L03 = r1.L0(Long.valueOf(-dialog7.id));
                if (r9) {
                    if (L03 instanceof TLRPC.TL_channel) {
                        this.Z3.add(dialog7);
                    }
                } else if (r1.v(dialog7)) {
                    this.Z3.add(dialog7);
                }
            }
        }
        oc7 messagesController = getMessagesController();
        ArrayList arrayList11 = this.Z3;
        if (arrayList11 == null) {
            messagesController.getClass();
        } else {
            Collections.sort(arrayList11, messagesController.t4);
        }
        return this.Z3;
    }

    public final void o4() {
        ok0 a = ok0.a(this.currentAccount);
        int i = a.a;
        Set<String> set = a.d;
        mk0 mk0Var = a.c;
        if (mk0Var != null && !set.contains(mk0Var.a)) {
            set.add(a.c.a);
            SharedPreferences.Editor edit = oc7.r1(i).X3.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            nm7.f(i).k(nm7.k5, new Object[0]);
        }
        oc7.r1(this.currentAccount).p4(0L, "BIRTHDAY_CONTACTS_TODAY");
        q5();
        u31 G = c41.b0(this).G(R.raw.gift, 4, jb6.M0(2131753295, null));
        G.j = 5000;
        G.j();
    }

    public final void o5() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        nu9 nu9Var = this.a0;
        float measuredHeight = (nu9Var == null || nu9Var.getVisibility() == 8) ? 0.0f : this.a0.getMeasuredHeight();
        float L = this.L ? gm.L(81.0f) : 0.0f;
        boolean z = this.L;
        float f8 = this.O;
        float f9 = this.z1;
        if (z) {
            f = (measuredHeight * f9) + td4.A(1.0f, f9, L, f8);
            f2 = this.z3;
        } else {
            f = (measuredHeight * f9) + f8;
            f2 = this.z3;
        }
        float f10 = f + f2 + this.U;
        zj3 zj3Var = this.Y;
        float L2 = gm.L(4.0f) * ((zj3Var == null || zj3Var.getVisibility() != 0) ? 0.0f : this.Y.getAlpha());
        ak3 ak3Var = this.A0;
        if (ak3Var != null) {
            ak3Var.setTranslationY(f10 - L2);
            f4 = this.A0.getAlpha();
            f5 = (this.A0.getUnreadOnlyBannerHeight() + gm.L(43.0f)) * f4;
            f3 = f10 + f5;
        } else {
            f3 = f10;
            f4 = 0.0f;
            f5 = 0.0f;
        }
        qk3 qk3Var = this.L1;
        if (qk3Var != null) {
            qk3Var.setTranslationY(gm.R1(f3 - L2, (-gm.L(3.0f)) - (this.b0 == null ? gm.L(44.0f) : 0), this.b.e));
            f6 = this.L1.getMetadata().c.a;
            f7 = this.L1.c(0.0f);
        } else {
            f6 = 0.0f;
            f7 = 0.0f;
        }
        pk3 pk3Var = this.M1;
        if (pk3Var != null) {
            pk3Var.setTranslationY(f10 - L2);
            float U1 = gm.U1(Math.min(f6, f4), gm.L(7.0f), gm.L(50.0f));
            pk3 pk3Var2 = this.M1;
            float min = Math.min(gm.L(40.0f), (f7 + f5) - U1);
            Matrix matrix = pk3Var2.b;
            if (pk3Var2.e != U1 || pk3Var2.f != min) {
                pk3Var2.e = U1;
                pk3Var2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, U1);
                LinearGradient linearGradient = pk3Var2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                pk3Var2.invalidate();
            }
            this.M1.setAlpha(Math.max(f4, f6));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (hasShownSheet()) {
            if (z) {
                closeSheet();
                return false;
            }
        } else if (!this.H3.c() || !this.H3.getFragment().onBackPressed(z)) {
            bu5 bu5Var = this.M0;
            if (bu5Var == null) {
                ak3 ak3Var = this.A0;
                if (ak3Var == null || !ak3Var.n) {
                    a aVar = this.actionBar;
                    if (aVar == null || !aVar.y()) {
                        if (!this.b.f) {
                            ak3 ak3Var2 = this.A0;
                            if (ak3Var2 != null && ak3Var2.getVisibility() == 0 && !this.j3) {
                                ak3 ak3Var3 = this.A0;
                                if (!ak3Var3.P && !this.o3) {
                                    ArrayList arrayList = ak3Var3.h;
                                    if (!arrayList.isEmpty() && ak3Var3.M != ((eg4) arrayList.get(0)).a) {
                                        if (z) {
                                            ak3 ak3Var4 = this.A0;
                                            ArrayList arrayList2 = ak3Var4.h;
                                            if (!arrayList2.isEmpty()) {
                                                ak3Var4.g((eg4) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            ti3 ti3Var = this.D1;
                            if (ti3Var == null || !ti3Var.R0()) {
                                aj3 aj3Var = this.F0;
                                if (aj3Var.P != 0 || aj3Var.T.K0() == 0) {
                                    return super.onBackPressed(z);
                                }
                                aj3Var.h.z0(0);
                                return false;
                            }
                            if (z) {
                                this.D1.J0(true);
                            }
                        } else if (z) {
                            this.Y.r.getText().clear();
                            this.Z.b(false);
                            this.Y.r.clearFocus();
                            return false;
                        }
                    } else if (z) {
                        sj3 sj3Var = this.D0;
                        if (sj3Var != null && sj3Var.getVisibility() == 0) {
                            this.D0.R(false);
                        }
                        A3(true);
                        return false;
                    }
                } else if (z) {
                    ak3Var.setIsEditing(false);
                    d5(false);
                    return false;
                }
            } else if (z) {
                bu5Var.u();
                this.M0 = null;
                return false;
            }
        } else if (z) {
            this.H3.a();
            sj3 sj3Var2 = this.D0;
            if (sj3Var2 != null) {
                sj3Var2.S();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyHidden() {
        sb sbVar;
        ak3 ak3Var;
        if (this.X1) {
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.o(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                sj3 sj3Var = this.D0;
                if (sj3Var != null) {
                    sj3Var.e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
            this.X1 = false;
        }
        if (!this.L && (ak3Var = this.A0) != null && ak3Var.getVisibility() == 0 && this.r.f) {
            int i = (int) (-this.O);
            int currentActionBarHeight = a.getCurrentActionBarHeight();
            if (i != 0 && i != currentActionBarHeight && i >= currentActionBarHeight / 2) {
                this.f0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (sbVar = this.L0) != null && sbVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        X2();
        this.s0 = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        hg5 hg5Var;
        super.onBecomeFullyVisible();
        byte b = 1;
        if (F3()) {
            SharedPreferences d1 = oc7.d1();
            boolean z = d1.getBoolean("archivehint", true);
            boolean isEmpty = o3(this.currentAccount, this.T0, this.Y2, false).isEmpty();
            if (z && isEmpty) {
                oc7.d1().edit().putBoolean("archivehint", false).commit();
                z = false;
            }
            if (z) {
                d1.edit().putBoolean("archivehint", false).commit();
                b5();
            }
        }
        if (this.s0 && !this.t0 && (hg5Var = this.q0) != null && this.R3) {
            this.t0 = true;
            this.s0 = false;
            hg5Var.v();
        }
        gm.d3(new di3(this, b), 200L);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bu5 bu5Var = this.M0;
        if (bu5Var != null) {
            bu5Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onDialogDismiss(Dialog dialog) {
        he heVar;
        super.onDialogDismiss(dialog);
        if (this.Y2 == 0 && this.a3 == 0 && (heVar = this.V1) != null && dialog == heVar && getParentActivity() != null) {
            C2(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        Object[] objArr = 0;
        if (bundle != null) {
            this.n2 = bundle.getBoolean("onlySelect", false);
            this.o2 = this.arguments.getBoolean("canSelectTopics", false);
            this.s2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.T0 = this.arguments.getInt("dialogsType", 0);
            this.P0 = this.arguments.getBoolean("quote", false);
            this.O0 = this.arguments.getBoolean("reply_to", false);
            this.Q0 = this.arguments.getLong("reply_to_author", 0L);
            this.R0 = this.arguments.getLong("reply_to_channel_direct", 0L);
            this.S0 = this.arguments.getLong("forward_into_channel", 0L);
            this.h2 = this.arguments.getString("selectAlertString");
            this.i2 = this.arguments.getString("selectAlertStringGroup");
            this.j2 = this.arguments.getString("addToGroupAlertString");
            this.t2 = this.arguments.getBoolean("allowSwitchAccount");
            this.u2 = this.arguments.getBoolean("checkCanWrite", true);
            this.v2 = this.arguments.getBoolean("afterSignup", false);
            this.Y2 = this.arguments.getInt("folderId", 0);
            long j = this.arguments.getLong("community_id", 0L);
            this.a3 = j;
            if (j != 0) {
                this.b3 = getMessagesController().L0(Long.valueOf(this.a3));
                this.c3 = getMessagesController().M0(this.a3);
            }
            this.k2 = this.arguments.getBoolean("resetDelegate", true);
            this.U0 = this.arguments.getInt("messagesCount", 0);
            this.V0 = this.arguments.getInt("hasPoll", 0);
            this.W0 = this.arguments.getBoolean("hasInvoice", false);
            this.w2 = this.arguments.getBoolean("showSetPasswordConfirm", this.w2);
            this.arguments.getInt("otherwiseRelogin");
            this.x2 = this.arguments.getBoolean("allowGroups", true);
            this.y2 = this.arguments.getBoolean("allowMegagroups", true);
            this.z2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.A2 = this.arguments.getBoolean("allowChannels", true);
            this.B2 = this.arguments.getBoolean("allowUsers", true);
            this.C2 = this.arguments.getBoolean("allowBots", true);
            this.D2 = this.arguments.getBoolean("closeFragment", true);
            this.G = this.arguments.getBoolean("allowGlobalSearch", true);
            this.X = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.H = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.I = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.T0 == 0) {
            this.W1 = oc7.e1().getBoolean("askAboutContacts", true);
            gda.t();
        }
        nm7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.L3 = new e7a(notificationCenter, this);
        if (this.p2 == null) {
            this.f2 = getConnectionsManager().getConnectionState();
            this.L3.e(nm7.m4);
            if (!this.n2) {
                this.L3.e(nm7.M4);
                this.L3.e(nm7.E4);
                this.L3.b(nm7.R2);
                this.L3.b(nm7.d2);
            }
            e7a e7aVar = this.L3;
            e7aVar.b(nm7.r);
            e7aVar.b(nm7.O2);
            e7aVar.b(nm7.P2);
            e7aVar.b(nm7.Q2);
            e7aVar.b(2);
            e7aVar.b(nm7.Y);
            e7aVar.b(nm7.N);
            e7aVar.b(nm7.I2);
            e7aVar.b(nm7.h0);
            e7aVar.b(nm7.f0);
            e7aVar.b(nm7.I);
            e7aVar.b(nm7.J);
            e7aVar.b(nm7.L);
            e7aVar.b(nm7.P0);
            e7aVar.b(nm7.s0);
            e7aVar.b(nm7.u5);
            e7aVar.b(nm7.S0);
            e7aVar.b(nm7.T1);
            e7aVar.b(nm7.f5);
            e7aVar.b(nm7.K2);
            e7aVar.b(nm7.d0);
            e7aVar.b(nm7.s1);
            e7aVar.b(nm7.c5);
            e7aVar.b(nm7.d5);
            e7aVar.b(nm7.M);
            e7aVar.b(nm7.q5);
            e7aVar.b(nm7.j5);
            this.L3.e(nm7.n0);
        }
        e7a e7aVar2 = this.L3;
        e7aVar2.b(nm7.v);
        e7aVar2.b(nm7.W4);
        e7aVar2.b(nm7.e5);
        e7aVar2.b(nm7.T);
        e7aVar2.b(nm7.P4);
        e7aVar2.b(nm7.x5);
        e7aVar2.b(nm7.z5);
        e7aVar2.b(nm7.b3);
        e7aVar2.b(nm7.f3);
        e7aVar2.b(nm7.k5);
        e7aVar2.b(nm7.A3);
        e7aVar2.b(nm7.C3);
        e7aVar2.b(nm7.W5);
        e7aVar2.b(nm7.X5);
        e7aVar2.b(nm7.S3);
        e7aVar2.b(nm7.T3);
        if (this.T0 == 0) {
            this.L3.b(nm7.D5);
            this.L3.b(nm7.P1);
        }
        x4(getAccountInstance());
        h4b N1 = getMessagesController().N1();
        if (!N1.A) {
            N1.V();
            if (!N1.s) {
                ConnectionsManager.getInstance(N1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new k3b(N1, objArr == true ? 1 : 0));
            }
        }
        getMessagesController().f3(this.Y2);
        if (this.X3 != null && !getMessagesStorage().R) {
            w93 w93Var = this.X3;
            if (w93Var.getParent() != null) {
                ((ViewGroup) w93Var.getParent()).removeView(w93Var);
            }
            this.X3 = null;
        }
        if (F3()) {
            h4b N12 = getMessagesController().N1();
            if (N12.z) {
                N12.S(true);
            }
        } else {
            getMessagesController().N1().V();
        }
        getContactsController().B();
        if (getMessagesController().P3) {
            wr9 E1 = getMessagesController().E1();
            if (!E1.e) {
                E1.g(true);
            }
        }
        if (this.a3 != 0) {
            getMessagesController().a3(0, this.a3, true);
        }
        ok0 a = ok0.a(this.currentAccount);
        if (!a.e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = a.b;
            Object[] objArr2 = j2 == 0;
            if (objArr2 == false) {
                long j3 = currentTimeMillis - j2;
                boolean z = e21.a;
                objArr2 = j3 > 43200000;
            }
            if (objArr2 == false) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a.b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                objArr2 = (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? false : true;
            }
            if (objArr2 != false) {
                a.e = true;
                ConnectionsManager.getInstance(a.a).sendRequest(new TL_account.getBirthdays(), new tg(a, (byte) 3));
            }
        }
        this.o4 = this.X ? gm.L(72.0f) : 0;
        this.p4 = this.X ? gm.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onFragmentDestroy() {
        gm.r(this.T3);
        gm.r(this.Q3);
        this.P3.A();
        super.onFragmentDestroy();
        e7a e7aVar = this.L3;
        if (e7aVar != null) {
            e7aVar.a();
            this.L3 = null;
        }
        ti3 ti3Var = this.D1;
        if (ti3Var != null) {
            ti3Var.d1();
        }
        bda bdaVar = this.I2;
        if (bdaVar != null) {
            bdaVar.j();
        }
        rd3 rd3Var = this.J2;
        if (rd3Var != null) {
            gm.r(rd3Var);
            this.J2 = null;
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.r3.e();
        this.E2 = null;
        int i = yx4.l1;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPanTranslationUpdate(float f) {
        if (this.f0 != null) {
            this.K0 = f;
            ti3 ti3Var = this.D1;
            int i = 0;
            if (ti3Var == null || !ti3Var.R0()) {
                while (true) {
                    mk3[] mk3VarArr = this.f0;
                    if (i >= mk3VarArr.length) {
                        break;
                    }
                    mk3VarArr[i].setTranslationY(f);
                    i++;
                }
                if (!this.n2) {
                    this.actionBar.setTranslationY(f);
                    u31 u31Var = this.q3;
                    if (u31Var != null) {
                        u31Var.l();
                    }
                }
                sj3 sj3Var = this.D0;
                if (sj3Var != null) {
                    sj3Var.setTranslationY(this.K0 + this.J0);
                    return;
                }
                return;
            }
            this.fragmentView.setTranslationY(f);
            while (true) {
                mk3[] mk3VarArr2 = this.f0;
                if (i >= mk3VarArr2.length) {
                    break;
                }
                mk3VarArr2[i].setTranslationY(0.0f);
                i++;
            }
            if (!this.n2) {
                this.actionBar.setTranslationY(0.0f);
                u31 u31Var2 = this.q3;
                if (u31Var2 != null) {
                    u31Var2.l();
                }
            }
            sj3 sj3Var2 = this.D0;
            if (sj3Var2 != null) {
                sj3Var2.setTranslationY(this.J0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        gm.r(this.Q3);
        this.P3.A();
        u31 u31Var = this.T;
        if (u31Var != null) {
            u31Var.b();
            this.T = null;
        }
        dj3 dj3Var = this.H3;
        if (dj3Var != null) {
            dj3Var.r = true;
            kj3 kj3Var = dj3Var.a;
            if (kj3Var != null) {
                kj3Var.onPause();
            }
        }
        bu5 bu5Var = this.M0;
        if (bu5Var != null) {
            bu5Var.u();
        }
        ti3 ti3Var = this.D1;
        if (ti3Var != null) {
            ti3Var.f1();
        }
        int i = 0;
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f0 == null) {
            return;
        }
        while (true) {
            mk3[] mk3VarArr = this.f0;
            if (i >= mk3VarArr.length) {
                return;
            }
            mk3VarArr[i].d.getClass();
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        yb0 yb0Var;
        Object[] objArr = 0;
        if (i != 1) {
            if (i == 4) {
                for (int i2 : iArr) {
                    if (i2 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (yb0Var = FilesMigrationService.e) == null) {
                    return;
                }
                yb0Var.D0();
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (iArr.length > i3) {
                String str = strArr[i3];
                str.getClass();
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        if (iArr[i3] == 0) {
                            lo7.n(this.currentAccount).Y();
                            break;
                        } else {
                            wn7.D0();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i3] == 0) {
                            fn5.z().e(null);
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i3] == 0) {
                            gm.c3(new di3(this, objArr == true ? 1 : 0));
                            getContactsController().l();
                            break;
                        } else {
                            SharedPreferences.Editor edit = oc7.e1().edit();
                            this.W1 = false;
                            edit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                }
            }
        }
        if (this.B0) {
            this.B0 = false;
            e5();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        nk3 nk3Var;
        mk3 mk3Var;
        qi3 qi3Var;
        ov9 ov9Var;
        sb sbVar;
        super.onResume();
        w4();
        aj3 aj3Var = this.F0;
        if (aj3Var != null) {
            ArrayList arrayList = aj3Var.y;
            h4b h4bVar = aj3Var.s;
            h4bVar.k(h4bVar.g);
            h4bVar.k(h4bVar.h);
            for (int i = 0; i < arrayList.size(); i++) {
                TL_stories.PeerStories x = h4bVar.x(((fh3) arrayList.get(i)).c);
                if (x != null) {
                    h4bVar.Z(x);
                }
            }
        }
        dj3 dj3Var = this.H3;
        if (dj3Var != null) {
            dj3Var.r = false;
            kj3 kj3Var = dj3Var.a;
            if (kj3Var != null) {
                kj3Var.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).w() && (sbVar = this.L0) != null && sbVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f0 != null) {
            int i2 = 0;
            while (true) {
                mk3[] mk3VarArr = this.f0;
                if (i2 >= mk3VarArr.length) {
                    break;
                }
                mk3VarArr[i2].d.f();
                i2++;
            }
        }
        if (this.S3) {
            this.S3 = false;
            getMessagesController().b5(null);
            if (this.f0 != null) {
                int i3 = 0;
                while (true) {
                    mk3[] mk3VarArr2 = this.f0;
                    if (i3 >= mk3VarArr2.length) {
                        break;
                    }
                    mk3VarArr2[i3].d.f();
                    i3++;
                }
            }
        }
        F5(-1, false);
        ti3 ti3Var = this.D1;
        if (ti3Var != null) {
            ti3Var.g1();
        }
        long j = 0;
        if (!this.n2 && this.Y2 == 0 && this.a3 == 0) {
            getMediaDataController().D(4);
        }
        sj3 sj3Var = this.D0;
        if (sj3Var != null && (ov9Var = sj3Var.e0) != null) {
            ov9Var.f();
        }
        boolean z = this.v2 || getUserConfig().a0 == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z && this.Y2 == 0 && this.a3 == 0 && this.e2 && !this.n2) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.e2 = false;
                boolean z2 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                int i4 = Build.VERSION.SDK_INT;
                boolean z3 = (i4 <= 28 || e21.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z4 = i4 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                nk3Var = this;
                fv2 fv2Var = new fv2(nk3Var, z4, z2, z3, parentActivity);
                if (nk3Var.v2 && (z2 || z4)) {
                    j = 4000;
                }
                gm.d3(fv2Var, j);
            } else {
                nk3Var = this;
            }
        } else {
            nk3Var = this;
            if (!nk3Var.n2 && nk3Var.Y2 == 0 && nk3Var.a3 == 0 && p0f.b() && !p0f.a()) {
                if (nk3Var.getParentActivity() == null) {
                    return;
                }
                if (!oc7.e1().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nk3Var.getParentActivity());
                    int i5 = cmb.K5;
                    alertDialog$Builder.l(R.raw.permission_request_apk, 72, nk3Var.getThemedColor(i5), null);
                    alertDialog$Builder.m(i5, nk3Var.getResourceProvider());
                    String M0 = jb6.M0(2131747031, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.U = M0;
                    byte b = 10;
                    alertDialog$Builder.j(jb6.M0(2131747033, null), new nh3(nk3Var, b));
                    alertDialog$Builder.g(jb6.M0(2131751709, null), new wa3(b));
                    nk3Var.showDialog(heVar);
                }
            } else if (nk3Var.Y2 == 0 && nk3Var.a3 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (nk3Var.getParentActivity() == null) {
                    return;
                }
                if (!oc7.e1().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(nk3Var.getParentActivity());
                    int i6 = cmb.K5;
                    alertDialog$Builder2.l(R.raw.permission_request_apk, 72, nk3Var.getThemedColor(i6), null);
                    alertDialog$Builder2.m(i6, nk3Var.getResourceProvider());
                    String M02 = jb6.M0(2131747047, null);
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.U = M02;
                    byte b2 = 11;
                    alertDialog$Builder2.j(jb6.M0(2131747033, null), new nh3(nk3Var, b2));
                    alertDialog$Builder2.g(jb6.M0(2131751709, null), new wa3(b2));
                    nk3Var.showDialog(heVar2);
                }
            }
        }
        nk3Var.e5();
        if (nk3Var.f0 != null) {
            int i7 = 0;
            while (true) {
                mk3[] mk3VarArr3 = nk3Var.f0;
                if (i7 >= mk3VarArr3.length) {
                    break;
                }
                mk3 mk3Var2 = mk3VarArr3[i7];
                if (mk3Var2.s == 0 && mk3Var2.w == 2 && mk3Var2.c.K0() == 0 && nk3Var.y3()) {
                    nk3Var.f0[i7].c.g1(1, (int) nk3Var.O);
                }
                mk3[] mk3VarArr4 = nk3Var.f0;
                if (i7 == 0) {
                    mk3VarArr4[i7].d.getClass();
                } else {
                    mk3VarArr4[i7].d.getClass();
                }
                i7++;
            }
        }
        nk3Var.g5();
        nk3Var.setBulletinDelegate(new s20(nk3Var, (byte) 9));
        if (nk3Var.s3) {
            gm.V2(nk3Var.getParentActivity(), nk3Var.classGuid);
        }
        nk3Var.G5(0, false);
        nk3Var.w5(false, true);
        nk3Var.E5(false);
        nk3Var.N2();
        nk3Var.X2();
        if (nk3Var.A0 == null || (mk3Var = nk3Var.f0[0]) == null || (qi3Var = mk3Var.d) == null) {
            return;
        }
        int i8 = qi3Var.h;
        if (i8 == 7 || i8 == 8) {
            ub7 ub7Var = nk3Var.getMessagesController().N[i8 != 7 ? (char) 1 : (char) 0];
            if (ub7Var != null) {
                nk3Var.A0.i(ub7Var.o);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onSlideProgress(boolean z, float f) {
        if (gda.o() <= 0) {
            boolean z2 = e21.a;
        } else if (this.f4 && this.g4 == null) {
            Z4(f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.h1.setColor(getThemedColor(cmb.c6));
            H2();
            r5();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        sb sbVar;
        nk3 nk3Var;
        dj3 dj3Var = this.H3;
        if (dj3Var == null || !dj3Var.c()) {
            if (z && (sbVar = this.L0) != null && sbVar.getVisibility() == 0) {
                this.L0.setVisibility(8);
                this.L0.setBackground(null);
            }
            if (z && this.v2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).w0.c(false);
                }
            }
        } else {
            this.H3.getFragment().onTransitionAnimationEnd(z, z2);
        }
        if (!z && (nk3Var = this.Z2) != null) {
            nk3Var.removeSelfFromStack();
        }
        X2();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationProgress(boolean z, float f) {
        dj3 dj3Var = this.H3;
        if (dj3Var == null || !dj3Var.c()) {
            sb sbVar = this.L0;
            if (sbVar != null && sbVar.getVisibility() == 0) {
                sb sbVar2 = this.L0;
                if (z) {
                    sbVar2.setAlpha(1.0f - f);
                } else {
                    sbVar2.setAlpha(f);
                }
            }
        } else {
            this.H3.getFragment().onTransitionAnimationProgress(z, f);
        }
        X2();
    }

    public final float p3(boolean z) {
        return (z ? 1.0f - this.b.e : 1.0f) * (1.0f - t3()) * this.r.e;
    }

    public final void p4(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            u31 I = c41.b0(this).I(R.raw.gift, jb6.M0(2131746591, null), jb6.M0(2131746590, null));
            I.j = 5000;
            I.j();
            return;
        }
        if (userFull != null) {
            int i = userFull.flags2;
            if (tL_birthday == null) {
                userFull.flags2 = i & (-33);
            } else {
                userFull.flags2 = i | 32;
            }
            userFull.birthday = tL_birthday;
            getMessagesStorage().g2(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            ts2.u(null, 2131743566, c41.b0(this), R.raw.error, 36);
            return;
        }
        if (getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
            String M0 = jb6.M0(2131746587, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131746588, null);
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            showDialog(heVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x03ca, code lost:
    
        if (r1.isEmpty() != false) goto L205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0408  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p5(boolean z) {
        boolean z2;
        r7 r7Var;
        ?? r5;
        a8 a8Var;
        r7 r7Var2;
        ak3 ak3Var;
        eg4 d;
        ak3 ak3Var2;
        eg4 d2;
        TLRPC.User W1;
        this.X2 = false;
        this.V2 = 0;
        this.S2 = 0;
        this.R2 = 0;
        this.Q2 = 0;
        this.P2 = 0;
        this.W2 = 0;
        this.T2 = 0;
        this.U2 = 0;
        if (z) {
            return;
        }
        ArrayList arrayList = this.K2;
        int size = arrayList.size();
        long e = getUserConfig().e();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i < size) {
            ArrayList arrayList2 = arrayList;
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(((Long) arrayList.get(i)).longValue());
            long j = e;
            if (dialog != null) {
                long j2 = dialog.id;
                boolean H3 = H3(dialog);
                boolean z3 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().s2(j2)) {
                    this.W2++;
                }
                if (getMessagesController().o2(j2, 0L, null)) {
                    this.S2++;
                } else {
                    this.R2++;
                }
                if (z3) {
                    this.P2++;
                }
                if (this.Y2 == 1 || dialog.folder_id == 1) {
                    this.V2++;
                } else if (j2 != j && dialog.community_id == 0 && j2 != 777000 && !getMessagesController().D2(j2, false)) {
                    i5++;
                }
                if (dialog.community_id != 0) {
                    i3++;
                }
                if (!pg3.D(j2) || j2 == j || j2 == 489000 || oc7.G2(getMessagesController().W1(Long.valueOf(j2)))) {
                    i7++;
                } else if (kt6.w("dialog_bar_report", j2, notificationsSettings, true)) {
                    this.U2++;
                }
                if (pg3.x(dialog)) {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j2));
                    if (getMessagesController().D2(dialog.id, true)) {
                        this.T2++;
                        int i8 = getMessagesController().t2;
                        int i9 = oc7.s5;
                        if (i8 == 1) {
                            i2++;
                            this.X2 = true;
                        }
                    } else {
                        if (H3) {
                            i6++;
                        } else {
                            this.Q2++;
                        }
                        if (L0 == null || !L0.megagroup) {
                            this.T2++;
                        } else if (sd2.t0(L0)) {
                            this.T2++;
                        }
                        i2++;
                    }
                } else {
                    boolean y = pg3.y(dialog.id);
                    if (y) {
                        getMessagesController().L0(Long.valueOf(-dialog.id));
                    }
                    if (pg3.B(dialog.id)) {
                        TLRPC.EncryptedChat Z0 = getMessagesController().Z0(Integer.valueOf((int) (dialog.id & 4294967295L)));
                        W1 = Z0 != null ? getMessagesController().W1(Long.valueOf(Z0.user_id)) : new TLRPC.TL_userEmpty();
                    } else {
                        W1 = (y || !pg3.D(dialog.id)) ? null : getMessagesController().W1(Long.valueOf(dialog.id));
                    }
                    if (W1 != null && W1.bot) {
                        int i10 = oc7.s5;
                    }
                    if (H3) {
                        i6++;
                    } else {
                        this.Q2++;
                    }
                }
                i4++;
                i2++;
            }
            i++;
            arrayList = arrayList2;
            e = j;
        }
        ArrayList arrayList3 = arrayList;
        r7 r7Var3 = this.l1;
        if (r7Var3 != null) {
            if (i2 != size || i3 > 0) {
                r7Var3.setVisibility(8);
            } else {
                r7Var3.setVisibility(0);
            }
        }
        a8 a8Var2 = this.t1;
        if (a8Var2 != null) {
            int i11 = this.T2;
            if ((i11 == 0 || i11 == size) && ((i4 == 0 || i4 == size) && i3 <= 0)) {
                a8Var2.setVisibility(0);
                int i12 = this.T2;
                a8 a8Var3 = this.t1;
                if (i12 != 0) {
                    a8Var3.setText(jb6.M0(2131752025, null));
                } else {
                    a8Var3.setText(jb6.M0(2131752026, null));
                }
            } else {
                a8Var2.setVisibility(8);
            }
        }
        a8 a8Var4 = this.s1;
        if (a8Var4 != null && this.o1 != null) {
            if (this.V2 != 0 && i3 == 0 && this.a3 == 0) {
                String M0 = jb6.M0(2131743602, null);
                this.s1.j(M0, R.drawable.msg_unarchive, null);
                this.o1.setIcon(R.drawable.msg_unarchive);
                this.o1.setContentDescription(M0);
                ak3 ak3Var3 = this.A0;
                if (ak3Var3 == null || ak3Var3.getVisibility() != 0) {
                    this.s1.setVisibility(0);
                    this.o1.setVisibility(8);
                } else {
                    this.o1.setVisibility(0);
                    this.s1.setVisibility(8);
                }
            } else if (i5 != 0 && i3 == 0 && this.a3 == 0) {
                String M02 = jb6.M0(2131754137, null);
                this.s1.j(M02, R.drawable.msg_archive, null);
                this.o1.setIcon(R.drawable.msg_archive);
                this.o1.setContentDescription(M02);
                ak3 ak3Var4 = this.A0;
                if (ak3Var4 == null || ak3Var4.getVisibility() != 0) {
                    this.s1.setVisibility(0);
                    this.o1.setVisibility(8);
                } else {
                    this.o1.setVisibility(0);
                    this.s1.setVisibility(8);
                }
            } else {
                a8Var4.setVisibility(8);
                this.o1.setVisibility(8);
            }
        }
        r7 r7Var4 = this.m1;
        if (r7Var4 != null && this.p1 != null) {
            if (this.Q2 + i6 == size && this.a3 == 0) {
                ak3 ak3Var5 = this.A0;
                if (ak3Var5 == null || ak3Var5.getVisibility() != 0) {
                    this.m1.setVisibility(0);
                    this.p1.setVisibility(8);
                } else {
                    this.p1.setVisibility(0);
                    this.m1.setVisibility(8);
                }
            } else {
                r7Var4.setVisibility(8);
                this.p1.setVisibility(8);
            }
        }
        a8 a8Var5 = this.v1;
        if (a8Var5 != null) {
            if (i7 != 0) {
                a8Var5.setVisibility(8);
            } else {
                a8Var5.setVisibility(0);
            }
        }
        if (this.r1 != null) {
            ak3 ak3Var6 = this.A0;
            boolean z4 = ak3Var6 == null || ak3Var6.getVisibility() != 0 || ((d2 = (ak3Var2 = this.A0).d()) != null && d2.a == ak3Var2.M);
            if (!z4) {
                try {
                    z4 = size >= o3(this.currentAccount, this.f0[0].d.h, this.Y2, this.U1).size();
                } catch (Exception unused) {
                }
            }
            a8 a8Var6 = this.r1;
            if (!z4) {
                z2 = false;
                a8Var6.setVisibility(0);
                if (this.q1 != null) {
                    if (this.Y2 != 1) {
                        if (this.A0 != null && p3(z2) > 0.5f && (d = (ak3Var = this.A0).d()) != null && d.a == ak3Var.M) {
                            int i13 = dh4.w1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = getMessagesController().G0;
                            int size2 = arrayList5.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                ub7 ub7Var = (ub7) arrayList5.get(i14);
                                ArrayList arrayList6 = arrayList3;
                                if (!dh4.D0(this, ub7Var, arrayList6, true, true).isEmpty() && !ub7Var.d()) {
                                    arrayList4.add(ub7Var);
                                }
                                i14++;
                                arrayList3 = arrayList6;
                            }
                        }
                        this.q1.setVisibility(8);
                    }
                    this.q1.setVisibility(0);
                }
                r7Var = this.n1;
                if (r7Var != null) {
                    r5 = 0;
                } else if (this.S2 != 0) {
                    r7Var.setIcon(R.drawable.msg_unmute);
                    r5 = 0;
                    this.n1.setContentDescription(jb6.M0(2131752102, null));
                } else {
                    r5 = 0;
                    r7Var.setIcon(R.drawable.msg_mute);
                    this.n1.setContentDescription(jb6.M0(2131752112, null));
                }
                a8Var = this.u1;
                if (a8Var != 0) {
                    if (this.P2 != 0) {
                        a8Var.j(jb6.M0(2131748438, r5), R.drawable.msg_markread, r5);
                        this.u1.setVisibility(0);
                    } else if (this.W2 == 0 && i3 == 0) {
                        a8Var.j(jb6.M0(2131748437, r5), R.drawable.msg_markunread, r5);
                        this.u1.setVisibility(0);
                    } else {
                        a8Var.setVisibility(8);
                    }
                }
                r7Var2 = this.m1;
                if (r7Var2 != null || this.p1 == null) {
                }
                if (this.Q2 != 0) {
                    r7Var2.setIcon(R.drawable.msg_pin);
                    this.m1.setContentDescription(jb6.M0(2131746970, null));
                    this.p1.setText(jb6.M0(2131751390, null));
                    return;
                } else {
                    r7Var2.setIcon(R.drawable.msg_unpin);
                    this.m1.setContentDescription(jb6.M0(2131743532, null));
                    this.p1.setText(jb6.M0(2131751389, null));
                    return;
                }
            }
            a8Var6.setVisibility(8);
        }
        z2 = false;
        if (this.q1 != null) {
        }
        r7Var = this.n1;
        if (r7Var != null) {
        }
        a8Var = this.u1;
        if (a8Var != 0) {
        }
        r7Var2 = this.m1;
        if (r7Var2 != null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        if (!z && z2) {
            this.f4 = true;
            V4(true);
        } else {
            this.g4 = null;
            this.f4 = false;
            V4(false);
            Z4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean presentFragment(d dVar) {
        boolean presentFragment = super.presentFragment(dVar);
        if (presentFragment && this.f0 != null) {
            int i = 0;
            while (true) {
                mk3[] mk3VarArr = this.f0;
                if (i >= mk3VarArr.length) {
                    break;
                }
                mk3VarArr[i].d.getClass();
                i++;
            }
        }
        hg5 hg5Var = this.q0;
        if (hg5Var != null) {
            hg5Var.f(true);
        }
        hg5 hg5Var2 = this.r0;
        if (hg5Var2 != null) {
            hg5Var2.f(true);
        }
        u31.e();
        return presentFragment;
    }

    public final int q3() {
        if (!this.L) {
            return gm.L(48.0f);
        }
        return gm.L(48.0f) + gm.L(81.0f);
    }

    public final /* synthetic */ void q4(TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
        if (X1 != null) {
            tL_birthday2 = X1.birthday;
            X1.flags2 |= 32;
            X1.birthday = tL_birthday;
        } else {
            tL_birthday2 = null;
        }
        getMessagesController().i2();
        getConnectionsManager().sendRequest(updatebirthday, new eo0((Object) this, (Object) X1, (Object) tL_birthday2, (byte) 21), 1024);
        oc7.r1(this.currentAccount).p4(0L, "BIRTHDAY_SETUP");
        q5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Runnable, ylb] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q5() {
        boolean z;
        boolean z2;
        l9 l9Var;
        dj3 dj3Var;
        hv4 hv4Var;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i;
        boolean z3;
        boolean z4;
        dj3 dj3Var2;
        long j;
        mk0 b;
        ?? r6;
        String G;
        StringBuilder sb;
        final long j2;
        final long j3;
        if (this.L1 == null || this.O1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        nl3 nl3Var = this.O1;
        boolean z5 = false;
        r7 = false;
        boolean z6 = false;
        if (nl3Var != null) {
            try {
                ((p09) ((pc0) nl3Var.h.getImageReceiver().n0).K).M(null);
            } catch (Exception unused) {
            }
            nl3 nl3Var2 = this.O1;
            nl3Var2.setCompact(false);
            nl3Var2.a(z8c.t0, null);
            bf0 bf0Var = nl3Var2.h;
            bf0Var.setVisibility(8);
            bf0Var.b();
        }
        byte b2 = 19;
        byte b3 = 2;
        long j4 = 0;
        final byte b4 = 1;
        if (!isInPreviewMode()) {
            if (getMessagesController().u2()) {
                this.O1.setOnClickListener(new mh3(this, (byte) 12));
                this.O1.c(jb6.M0(2131754700, null), jb6.M0(2131754701, null), false, true);
            } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().u3.contains("SETUP_PASSKEY")) {
                this.O1.setOnClickListener(new mh3(this, b2));
                this.O1.b(gw3.p(jb6.M0(2131747363, null), this.O1.c, new di3(this, b3)), jb6.M0(2131747364, null));
                this.O1.setOnCloseListener(new mh3(this, (byte) 24));
            } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().u3.contains("PREMIUM_GRACE")) {
                this.O1.setOnClickListener(new mh3(this, (byte) 25));
                this.O1.b(gw3.p(jb6.M0(2131749299, null), this.O1.c, new di3(this, b3)), jb6.M0(2131749303, null));
                this.O1.setOnCloseListener(new mh3(this, (byte) 26));
            } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().w3 != null) {
                final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().w3;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                k47.b(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true, 0);
                Spannable A5 = k47.A5(gw3.m(spannableStringBuilder, this.O1.c.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.title.entities, this.O1.c.getPaint().getFontMetricsInt(), false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                k47.b(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true, 0);
                this.O1.b(A5, k47.A5(gw3.m(spannableStringBuilder2, this.O1.d.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.description.entities, this.O1.d.getPaint().getFontMetricsInt(), false));
                nl3 nl3Var3 = this.O1;
                final byte b5 = z5 ? (byte) 1 : (byte) 0;
                nl3Var3.setOnClickListener(new View.OnClickListener(this) { // from class: gi3
                    public final /* synthetic */ nk3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b6 = b5;
                        TLRPC.TL_pendingSuggestion tL_pendingSuggestion2 = tL_pendingSuggestion;
                        nk3 nk3Var = this.b;
                        switch (b6) {
                            case 0:
                                l11.u(nk3Var.getParentActivity(), tL_pendingSuggestion2.url);
                                break;
                            default:
                                nk3Var.l4(tL_pendingSuggestion2);
                                break;
                        }
                    }
                });
                this.O1.setOnCloseListener(new View.OnClickListener(this) { // from class: gi3
                    public final /* synthetic */ nk3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b6 = b4;
                        TLRPC.TL_pendingSuggestion tL_pendingSuggestion2 = tL_pendingSuggestion;
                        nk3 nk3Var = this.b;
                        switch (b6) {
                            case 0:
                                l11.u(nk3Var.getParentActivity(), tL_pendingSuggestion2.url);
                                break;
                            default:
                                nk3Var.l4(tL_pendingSuggestion2);
                                break;
                        }
                    }
                });
            } else {
                if (this.Y2 == 0 && this.a3 == 0 && oc7.r1(this.currentAccount).u3.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                    jva v = jva.v(this.currentAccount, false);
                    ArrayList arrayList = v.z;
                    if (!arrayList.isEmpty()) {
                        long j5 = -v.f.amount;
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i2);
                            long j6 = j4;
                            long n = pg3.n(starsSubscription.peer);
                            if (n >= j6) {
                                if (getMessagesController().W1(Long.valueOf(n)) == null) {
                                    i2++;
                                    j4 = j6;
                                }
                                j5 += starsSubscription.pricing.amount;
                                i2++;
                                j4 = j6;
                            } else {
                                if (getMessagesController().L0(Long.valueOf(-n)) == null) {
                                    i2++;
                                    j4 = j6;
                                }
                                j5 += starsSubscription.pricing.amount;
                                i2++;
                                j4 = j6;
                            }
                        }
                        j = j4;
                        if (j5 > j) {
                            jva v2 = jva.v(this.currentAccount, false);
                            ArrayList arrayList2 = v2.z;
                            StringBuilder sb2 = new StringBuilder();
                            if (arrayList2.isEmpty()) {
                                sb = sb2;
                                j2 = j;
                                j3 = j2;
                            } else {
                                int i3 = 0;
                                long j7 = j;
                                j3 = j7;
                                while (i3 < arrayList2.size()) {
                                    TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i3);
                                    TLRPC.Peer peer = starsSubscription2.peer;
                                    Object[] objArr = z6 ? 1 : 0;
                                    long n2 = pg3.n(peer);
                                    if (j3 == j) {
                                        j3 = n2;
                                    }
                                    if (n2 >= j) {
                                        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(n2));
                                        if (W1 == null) {
                                            i3++;
                                            z6 = objArr == true ? 1 : 0;
                                        } else {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(m9c.r(W1));
                                            j7 += starsSubscription2.pricing.amount;
                                            i3++;
                                            z6 = objArr == true ? 1 : 0;
                                        }
                                    } else {
                                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-n2));
                                        if (L0 == null) {
                                            i3++;
                                            z6 = objArr == true ? 1 : 0;
                                        } else {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(L0.title);
                                            j7 += starsSubscription2.pricing.amount;
                                            i3++;
                                            z6 = objArr == true ? 1 : 0;
                                        }
                                    }
                                }
                                sb = sb2;
                                j2 = j7;
                            }
                            boolean z7 = z6;
                            final String sb3 = sb.toString();
                            this.O1.setOnClickListener(new View.OnClickListener() { // from class: hi3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    nk3 nk3Var = nk3.this;
                                    new dxa(nk3Var.getParentActivity(), nk3Var.getResourceProvider(), j2, 2, sb3, new kh3(nk3Var, (byte) 11), j3).show();
                                }
                            });
                            nl3 nl3Var4 = this.O1;
                            long j8 = j2 - v2.f.amount;
                            if (j8 > j) {
                                j2 = j8;
                            }
                            Object[] objArr2 = new Object[1];
                            objArr2[z7 ? 1 : 0] = sb3;
                            nl3Var4.b(nxa.b1(z7, jb6.K("StarsSubscriptionExpiredHintTitle2", (int) j2, ',', objArr2), 0.72f, null), jb6.M0(2131744678, null));
                            this.O1.setOnCloseListener(new mh3(this, (byte) 13));
                        }
                        if (this.Y2 != 0 && this.a3 == j && !getMessagesController().I3() && (b = ok0.a(this.currentAccount).b()) != null && !b.c.isEmpty() && !getMessagesController().v3.contains("BIRTHDAY_CONTACTS_TODAY")) {
                            mk0 b6 = ok0.a(this.currentAccount).b();
                            ArrayList arrayList3 = b6.c;
                            this.O1.setOnClickListener(new tf3(this, b6, (byte) 5));
                            this.O1.a(this.currentAccount, arrayList3);
                            nl3 nl3Var5 = this.O1;
                            if (arrayList3.size() == 1) {
                                r6 = 0;
                                G = jb6.a0(null, null, 2131753671, m9c.l((TLRPC.User) arrayList3.get(0)));
                            } else {
                                r6 = 0;
                                G = jb6.G(arrayList3.size(), "BirthdayTodayMultipleTitle", new Object[0]);
                            }
                            nl3Var5.b(gw3.p(gm.N2(G, cmb.H6, 2, r6, r6), this.O1.c, new di3(this, b3)), jb6.a0(null, null, arrayList3.size() == 1 ? 2131753672 : 2131753675, new Object[0]));
                            this.O1.setOnCloseListener(new mh3(this, (byte) 14));
                            jva.v(this.currentAccount, false).T();
                        } else if (this.Y2 != 0 && this.a3 == j && oc7.r1(this.currentAccount).u3.contains("BIRTHDAY_SETUP") && getMessagesController().X1(getUserConfig().e()) != null && getMessagesController().X1(getUserConfig().e()).birthday == null) {
                            bw2.r(this.currentAccount).D(false);
                            this.O1.setOnClickListener(new mh3(this, (byte) 15));
                            this.O1.b(gw3.p(jb6.M0(2131753677, null), this.O1.c, new di3(this, b3)), jb6.a0(null, null, 2131753678, new Object[0]));
                            this.O1.setOnCloseListener(new mh3(this, (byte) 16));
                        } else if (!((oc7.r1(this.currentAccount).H3() && this.Y2 == 0 && this.a3 == j) ? oc7.r1(this.currentAccount).u3.contains("PREMIUM_CHRISTMAS") : false)) {
                            this.O1.setOnClickListener(new x10((byte) 3));
                            this.O1.b(gw3.m(gm.N2(jb6.M0(2131749450, null), cmb.H6, 2, null, null), null, false, null, 0), jb6.a0(null, null, 2131753296, new Object[0]));
                            this.O1.setOnCloseListener(new mh3(this, (byte) 17));
                        } else if (!oc7.r1(this.currentAccount).H3() && this.Y2 == 0 && this.a3 == j && oc7.r1(this.currentAccount).u3.contains("PREMIUM_RESTORE") && !getUserConfig().p() && hs6.d0(this.currentAccount).i0(false) != null) {
                            this.O1.setOnClickListener(new mh3(this, (byte) 18));
                            this.O1.b(gm.N2(jb6.a0(null, null, 2131745797, hs6.d0(this.currentAccount).i0(false)), cmb.H6, 2, null, null), jb6.M0(2131745798, null));
                        } else if (oc7.r1(this.currentAccount).H3() || this.Y2 != 0 || this.a3 != j || ((!(oc7.r1(this.currentAccount).u3.contains("PREMIUM_UPGRADE") && getUserConfig().p()) && (!oc7.r1(this.currentAccount).u3.contains("PREMIUM_ANNUAL") || getUserConfig().p())) || (!z8c.h(this.currentAccount).p() ? hs6.d0(this.currentAccount).i0(false) == null : e21.b() || hs6.d0(this.currentAccount).i0(true) == null))) {
                            if (this.Q1 != null && this.R1 != null) {
                                if (r0.longValue() / this.R1.longValue() < 0.3f) {
                                    oc7.d1().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                } else if (System.currentTimeMillis() > oc7.d1().getLong("cache_hint_showafter", j)) {
                                    this.O1.setOnClickListener(new mh3(this, (byte) 21));
                                    this.O1.b(gm.N2(jb6.a0(null, null, 2131751985, gm.i0(this.Q1.longValue(), false, false)), cmb.H6, 2, null, null), jb6.M0(2131751986, null));
                                }
                            }
                            if (this.Y2 == 0 && this.a3 == 0 && getUserConfig().f() != null && ((getUserConfig().f().photo == null || (getUserConfig().f().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && oc7.r1(this.currentAccount).u3.contains("USERPIC_SETUP"))) {
                                this.O1.setOnClickListener(new mh3(this, (byte) 22));
                                this.O1.h.setVisibility(0);
                                pc0 pc0Var = new pc0((ylb) null);
                                pc0Var.setBounds(0, 0, gm.L(36.0f), gm.L(36.0f));
                                long e = getUserConfig().e();
                                pc0Var.A = true;
                                pc0Var.b = true;
                                pc0Var.c = false;
                                int i4 = cmb.o8[pc0.d(e)];
                                ylb ylbVar = pc0Var.z;
                                pc0Var.d = cmb.v0(i4, ylbVar);
                                pc0Var.e = cmb.v0(cmb.p8[pc0.d(e)], ylbVar);
                                pc0Var.n = (byte) 0;
                                pc0Var.m = false;
                                pc0.a("", "", "", pc0Var.q);
                                pc0Var.K = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                this.O1.h.setImageDrawable(pc0Var);
                                this.O1.b(gw3.p(jb6.M0(2131749058, null), this.O1.c, new di3(this, b3)), jb6.M0(2131749057, null));
                                this.O1.setOnCloseListener(new mh3(this, (byte) 23));
                            } else {
                                if (this.Y2 == 0 && this.a3 == 0 && org.telegram.messenger.a.a != null) {
                                    for (String str : oc7.r1(this.currentAccount).u3) {
                                        org.telegram.messenger.a.a.getClass();
                                    }
                                }
                                z5 = false;
                            }
                        } else {
                            this.C3 = oc7.r1(this.currentAccount).u3.contains("PREMIUM_UPGRADE");
                            this.O1.setOnClickListener(new mh3(this, (byte) 20));
                            this.O1.b(gm.N2(jb6.a0(null, null, this.C3 ? 2131745668 : 2131743493, hs6.d0(this.currentAccount).i0(false)), cmb.H6, 2, null, null), jb6.M0(this.C3 ? 2131743496 : 2131745669, null));
                        }
                    } else if (!v.A) {
                        v.A = true;
                        TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                        tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                        tL_getStarsSubscriptions.missing_balance = true;
                        tL_getStarsSubscriptions.offset = "";
                        ConnectionsManager.getInstance(v.a).sendRequest(tL_getStarsSubscriptions, new jua(v, z5 ? (byte) 1 : (byte) 0));
                    }
                }
                j = 0;
                if (this.Y2 != 0) {
                }
                if (this.Y2 != 0) {
                }
                if (!((oc7.r1(this.currentAccount).H3() && this.Y2 == 0 && this.a3 == j) ? oc7.r1(this.currentAccount).u3.contains("PREMIUM_CHRISTMAS") : false)) {
                }
            }
            z5 = true;
        }
        dj3 dj3Var3 = this.H3;
        fn0 fn0Var = this.b;
        if ((dj3Var3 != null && dj3Var3.c()) || fn0Var.f) {
            z5 = false;
        }
        this.L1.j(this.O1, z5, true);
        L2(true);
        if (this.fragmentView != null && this.L1 != null) {
            boolean z8 = !isInPreviewMode() && this.Y2 == 0 && this.a3 == 0 && this.T0 == 0 && !getMessagesController().Q1().b.isEmpty() && ((dj3Var2 = this.H3) == null || !dj3Var2.c()) && !fn0Var.f;
            if (z8) {
                if (this.P1 == null) {
                    x6c x6cVar = new x6c(getParentActivity());
                    this.P1 = x6cVar;
                    this.L1.addView(x6cVar);
                }
                x6c x6cVar2 = this.P1;
                int i5 = this.currentAccount;
                TextView textView = x6cVar2.c;
                TextView textView2 = x6cVar2.b;
                ArrayList arrayList4 = oc7.r1(i5).Q1().b;
                w6c w6cVar = x6cVar2.d;
                w6cVar.setText(jb6.M0(2131743597, null));
                w6cVar.a(false, false);
                w6c w6cVar2 = x6cVar2.e;
                w6cVar2.setText(jb6.M0(2131743587, null));
                w6cVar2.a(false, false);
                if (arrayList4 != null) {
                    if (arrayList4.size() == 1) {
                        u6c u6cVar = (u6c) arrayList4.get(0);
                        boolean z9 = u6cVar.a;
                        String str2 = u6cVar.f;
                        textView2.setText(jb6.M0(z9 ? 2131743577 : 2131743578, null));
                        String valueOf = String.valueOf(u6cVar.e);
                        if (!TextUtils.isEmpty(str2) && !valueOf.isEmpty()) {
                            valueOf = valueOf.concat(", ");
                        }
                        String h = b10.h(valueOf, str2);
                        if (u6cVar.a) {
                            textView.setText(jb6.a0(null, null, 2131743579, "@" + pg3.s(u6cVar.c), h));
                            z4 = true;
                        } else {
                            textView.setText(jb6.a0(null, null, 2131743580, h));
                            z4 = false;
                        }
                        z3 = z4;
                        w6cVar.setOnClickListener(new pn1(this, z3, i5, arrayList4));
                        w6cVar2.setOnClickListener(new wh((Object) x6cVar2, i5, (Object) arrayList4, (byte) 19));
                    } else if (arrayList4.size() > 1) {
                        textView2.setText(jb6.M0(2131743578, null));
                        String str3 = ((u6c) arrayList4.get(0)).f;
                        int i6 = 1;
                        while (true) {
                            if (i6 >= arrayList4.size()) {
                                break;
                            }
                            if (!TextUtils.equals(str3, ((u6c) arrayList4.get(i6)).f)) {
                                str3 = null;
                                break;
                            }
                            i6++;
                        }
                        if (str3 == null) {
                            textView.setText(jb6.G(arrayList4.size(), "UnconfirmedAuthMultiple", new Object[0]));
                        } else {
                            textView.setText(jb6.G(arrayList4.size(), "UnconfirmedAuthMultipleFrom", str3));
                        }
                    }
                }
                z3 = false;
                w6cVar.setOnClickListener(new pn1(this, z3, i5, arrayList4));
                w6cVar2.setOnClickListener(new wh((Object) x6cVar2, i5, (Object) arrayList4, (byte) 19));
            }
            x6c x6cVar3 = this.P1;
            if (x6cVar3 != null) {
                this.L1.j(x6cVar3, z8, true);
            }
        }
        if (this.fragmentView == null || this.L1 == null) {
            return;
        }
        if (!isInPreviewMode() && this.Y2 == 0 && this.a3 == 0 && this.T0 == 0) {
            lv4 giftAuctionsController = getGiftAuctionsController();
            if (!giftAuctionsController.d) {
                SharedPreferences sharedPreferences = giftAuctionsController.getMessagesController().X3;
                if (System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("lastGiftAuctionTimeUpdate", 0L) : 0L) < 86400000) {
                    giftAuctionsController.d = true;
                    TL_payments.TL_getStarGiftActiveAuctions tL_getStarGiftActiveAuctions = new TL_payments.TL_getStarGiftActiveAuctions();
                    ArrayList arrayList5 = new ArrayList();
                    LongSparseArray longSparseArray = giftAuctionsController.b;
                    int size = longSparseArray.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        iv4 iv4Var = (iv4) longSparseArray.valueAt(i7);
                        hv4 hv4Var2 = iv4Var.b;
                        if (hv4Var2 != null && !hv4Var2.f() && (tL_starGiftAuctionState = (hv4Var = iv4Var.b).f) != null && (i = hv4Var.e.bid_date) > 0) {
                            arrayList5.add(Long.valueOf((i << 32) | tL_starGiftAuctionState.version));
                        }
                    }
                    Collections.sort(arrayList5);
                    int size2 = arrayList5.size();
                    long j9 = 0;
                    int i8 = 0;
                    while (i8 < size2) {
                        Object obj = arrayList5.get(i8);
                        i8++;
                        Long l = (Long) obj;
                        j9 = hs6.r(hs6.r(j9, l.longValue() & 4294967295L), l.longValue() >> 32);
                    }
                    tL_getStarGiftActiveAuctions.hash = j9;
                    z = false;
                    giftAuctionsController.getConnectionsManager().sendRequestTyped(tL_getStarGiftActiveAuctions, new kc(0 == true ? 1 : 0), new vt4((Object) giftAuctionsController, (byte) 1));
                    if (!giftAuctionsController.c.isEmpty() && (((dj3Var = this.H3) == null || !dj3Var.c()) && !fn0Var.f)) {
                        z2 = true;
                        if (z2 && this.N1 == null) {
                            l9 l9Var2 = new l9(getParentActivity(), this.currentAccount);
                            this.N1 = l9Var2;
                            this.L1.addView(l9Var2);
                        }
                        l9Var = this.N1;
                        if (l9Var != null) {
                            this.L1.j(l9Var, z2, true);
                            return;
                        }
                        return;
                    }
                }
            }
            z = false;
            if (!giftAuctionsController.c.isEmpty()) {
                z2 = true;
                if (z2) {
                    l9 l9Var22 = new l9(getParentActivity(), this.currentAccount);
                    this.N1 = l9Var22;
                    this.L1.addView(l9Var22);
                }
                l9Var = this.N1;
                if (l9Var != null) {
                }
            }
        } else {
            z = false;
        }
        z2 = z;
        if (z2) {
        }
        l9Var = this.N1;
        if (l9Var != null) {
        }
    }

    public final int r3() {
        if (this.L) {
            return gm.L(81.0f);
        }
        return 0;
    }

    public final void r4() {
        oc7.r1(this.currentAccount).p4(0L, "BIRTHDAY_SETUP");
        q5();
        u31 K = c41.b0(this).K(R.raw.chats_infotip, jb6.M0(2131753679, null), jb6.M0(2131745229, null), new di3(this, (byte) 10));
        K.j = 5000;
        K.j();
    }

    public final void r5() {
        pu9 pu9Var;
        jk3 jk3Var;
        try {
            ti3 ti3Var = this.D1;
            if (ti3Var != null && ti3Var.getEditField() != null) {
                this.D1.getEditField().setCursorColor(getThemedColor(cmb.Me));
            }
            NumberTextView numberTextView = this.j1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(cmb.x8));
            }
            ak3 ak3Var = this.A0;
            int i = 0;
            if (ak3Var != null && (ak3Var.getSelectorDrawable() instanceof GradientDrawable)) {
                a aVar = this.actionBar;
                ((GradientDrawable) this.A0.getSelectorDrawable()).setColor(getThemedColor(aVar != null && aVar.y() ? cmb.wi : cmb.J8));
                this.A0.invalidate();
            }
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                if (this.Y2 != 0 || this.a3 != 0) {
                    aVar2.L(getThemedColor(cmb.P8), false);
                    this.actionBar.L(getThemedColor(cmb.Q8), true);
                }
                if (this.actionBar.y()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(cmb.c6));
                }
                x5();
            }
            if (this.f0 != null) {
                while (true) {
                    mk3[] mk3VarArr = this.f0;
                    if (i >= mk3VarArr.length) {
                        break;
                    }
                    mk3 mk3Var = mk3VarArr[i];
                    if (mk3Var != null && (jk3Var = mk3Var.a) != null) {
                        jk3Var.setGlowColor(getThemedColor(cmb.c6));
                    }
                    i++;
                }
            }
            sj3 sj3Var = this.D0;
            if (sj3Var != null && (pu9Var = sj3Var.b0) != null) {
                pu9Var.setGlowColor(getThemedColor(cmb.c6));
            }
            vi3 vi3Var = this.E1;
            if (vi3Var != null) {
                vi3Var.setScrimViewBackgroundColor(getThemedColor(cmb.c6));
            }
            hg5 hg5Var = this.q0;
            if (hg5Var != null) {
                hg5Var.i(getThemedColor(cmb.vj));
            }
            hg5 hg5Var2 = this.r0;
            if (hg5Var2 != null) {
                hg5Var2.i(getThemedColor(cmb.vj));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final ub7 s3(mk3 mk3Var) {
        if (mk3Var == null) {
            return null;
        }
        int i = mk3Var.s;
        if (i == 7 || i == 8) {
            return getMessagesController().N[mk3Var.s == 8 ? (char) 1 : (char) 0];
        }
        return null;
    }

    public final void s4() {
        oc7.r1(this.currentAccount).p4(0L, "PREMIUM_CHRISTMAS");
        q5();
        u31 G = c41.b0(this).G(R.raw.gift, 4, jb6.M0(2131753295, null));
        G.j = 5000;
        G.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0308  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s5(boolean z, boolean z2) {
        ?? r5;
        int K0;
        ub7 ub7Var;
        boolean z3;
        Object[] objArr;
        boolean z4;
        boolean z5;
        if (this.A0 == null || this.inPreviewMode || this.s3) {
            return;
        }
        dj3 dj3Var = this.H3;
        if (dj3Var == null || !dj3Var.c()) {
            bu5 bu5Var = this.M0;
            String str = null;
            if (bu5Var != null) {
                bu5Var.u();
                this.M0 = null;
            }
            ArrayList S0 = getMessagesController().S0();
            int size = S0.size();
            fn0 fn0Var = this.r;
            boolean z6 = false;
            if (size <= 1) {
                r5 = 0;
                if (this.A0.getVisibility() != 8) {
                    this.A0.setIsEditing(false);
                    d5(false);
                    this.p3 = false;
                    if (this.o3) {
                        this.o3 = false;
                        this.f0[0].setTranslationX(0.0f);
                        this.f0[1].setTranslationX(r2[0].getMeasuredWidth());
                    }
                    if (this.f0[0].h != this.A0.getDefaultTabId()) {
                        this.f0[0].h = this.A0.getDefaultTabId();
                        qi3 qi3Var = this.f0[0].d;
                        qi3Var.h = 0;
                        qi3Var.f();
                        mk3 mk3Var = this.f0[0];
                        mk3Var.s = this.T0;
                        mk3Var.d.f();
                    }
                    this.f0[1].setVisibility(8);
                    mk3 mk3Var2 = this.f0[1];
                    mk3Var2.h = 0;
                    qi3 qi3Var2 = mk3Var2.d;
                    qi3Var2.h = 0;
                    qi3Var2.f();
                    mk3 mk3Var3 = this.f0[1];
                    mk3Var3.s = this.T0;
                    mk3Var3.d.f();
                    this.x = false;
                    if (this.fragmentView != null) {
                        boolean z7 = (this.isPaused || this.X3 != null) ? false : z2;
                        if (!this.s3) {
                            fn0Var.a(false, z7);
                        }
                    }
                    int i = 0;
                    while (true) {
                        mk3[] mk3VarArr = this.f0;
                        if (i >= mk3VarArr.length) {
                            break;
                        }
                        mk3 mk3Var4 = mk3VarArr[i];
                        if (mk3Var4.s == 0 && mk3Var4.w == 2 && y3() && ((K0 = this.f0[i].c.K0()) == 0 || K0 == 1)) {
                            this.f0[i].c.g1(1, (int) this.O);
                        }
                        this.f0[i].a.setScrollingTouchSlop(0);
                        this.f0[i].a.requestLayout();
                        this.f0[i].requestLayout();
                        i++;
                    }
                    this.A0.M = -1;
                    r5 = 0;
                }
            } else if (z || this.A0.getVisibility() != 0) {
                boolean z8 = this.A0.getVisibility() != 0 ? false : z2;
                this.x = true;
                boolean isEmpty = this.A0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z9 = (this.isPaused || this.X3 != null) ? false : z2;
                    if (!this.s3) {
                        fn0Var.a(this.x, z9);
                    }
                }
                int currentTabId = this.A0.getCurrentTabId();
                int currentTabStableId = this.A0.getCurrentTabStableId();
                if (currentTabId == this.A0.getDefaultTabId() || currentTabId < S0.size()) {
                    objArr = false;
                } else {
                    this.A0.M = -1;
                    objArr = true;
                }
                ak3 ak3Var = this.A0;
                ak3Var.h.clear();
                ak3Var.k0.clear();
                ak3Var.m0.clear();
                ak3Var.n0.clear();
                ak3Var.o0.clear();
                ak3Var.p0.clear();
                ak3Var.N = 0;
                int size2 = S0.size();
                int i2 = 0;
                while (i2 < size2) {
                    if (((ub7) S0.get(i2)).d()) {
                        this.A0.a(i2, 0, jb6.M0(2131750744, str), null, false, true, ((ub7) S0.get(i2)).p);
                        z5 = z6;
                    } else {
                        ub7 ub7Var2 = (ub7) S0.get(i2);
                        z5 = z6;
                        this.A0.a(i2, ub7Var2.o, ub7Var2.b, ub7Var2.c, ub7Var2.n, false, ((ub7) S0.get(i2)).p);
                    }
                    i2++;
                    z6 = z5;
                    str = null;
                }
                boolean z10 = z6;
                if (currentTabStableId >= 0) {
                    if (objArr != false && !this.A0.i(currentTabStableId)) {
                        while (true) {
                            if (currentTabId < 0) {
                                currentTabId = z10 ? 1 : 0;
                                break;
                            }
                            ak3 ak3Var2 = this.A0;
                            if (ak3Var2.i(ak3Var2.l0.get(currentTabId, -1))) {
                                break;
                            } else {
                                currentTabId--;
                            }
                        }
                    }
                    if (this.A0.l0.get(this.f0[z10 ? 1 : 0].h, -1) != currentTabStableId) {
                        this.f0[z10 ? 1 : 0].h = currentTabId;
                        isEmpty = true;
                    }
                }
                int i3 = z10 ? 1 : 0;
                while (true) {
                    mk3[] mk3VarArr2 = this.f0;
                    if (i3 >= mk3VarArr2.length) {
                        break;
                    }
                    if (mk3VarArr2[i3].h >= S0.size()) {
                        this.f0[i3].h = S0.size() - 1;
                    }
                    this.f0[i3].a.setScrollingTouchSlop(1);
                    i3++;
                }
                ak3 ak3Var3 = this.A0;
                ak3Var3.G.setItemAnimator(z8 ? ak3Var3.t0 : null);
                ak3Var3.J.f();
                if (isEmpty) {
                    n5(z10);
                }
                ak3 ak3Var4 = this.A0;
                int currentTabId2 = ak3Var4.getCurrentTabId();
                ArrayList arrayList = ak3Var4.h;
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        z4 = false;
                        break;
                    } else {
                        if (((eg4) arrayList.get(i4)).a == currentTabId2) {
                            z4 = ((eg4) arrayList.get(i4)).f;
                            break;
                        }
                        i4++;
                    }
                }
                if (z4) {
                    ak3 ak3Var5 = this.A0;
                    ArrayList arrayList2 = ak3Var5.h;
                    if (!arrayList2.isEmpty()) {
                        r5 = 0;
                        ak3Var5.g((eg4) arrayList2.get(0), 0);
                    }
                }
                r5 = 0;
            } else {
                r5 = 0;
            }
            p5(r5);
            int i5 = this.f0[r5].s;
            if ((i5 == 7 || i5 == 8) && (ub7Var = getMessagesController().N[i5 - 7]) != null) {
                for (int i6 = 0; i6 < S0.size(); i6++) {
                    ub7 ub7Var3 = (ub7) S0.get(i6);
                    if (ub7Var3 == null || ub7Var3.a != ub7Var.a) {
                    }
                }
                z3 = false;
                n5(false);
                F5(-1, this.A0.getVisibility() != 0 ? z3 : true);
            }
            z3 = false;
            F5(-1, this.A0.getVisibility() != 0 ? z3 : true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setInPreviewMode(boolean z) {
        super.setInPreviewMode(z);
        aj3 aj3Var = this.F0;
        if (aj3Var != null) {
            if (!this.H0 || z) {
                aj3Var.setVisibility(8);
            } else {
                aj3Var.setVisibility(0);
            }
        }
        v5(true);
        q5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 != r3) goto L12;
     */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i, Runnable runnable) {
        fj3 fj3Var;
        tm tmVar;
        super.setTitleOverlayText(str, i, runnable);
        if (this.actionBar != null && (fj3Var = this.N0) != null && (fj3Var.getContentView() instanceof vz9)) {
            lka titleTextView = this.actionBar.getTitleTextView();
            vz9 vz9Var = (vz9) this.N0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                tmVar = this.F3;
            }
            tmVar = null;
            vz9Var.y(tmVar, titleTextView);
        }
        aj3 aj3Var = this.F0;
        if (aj3Var != null) {
            io ioVar = aj3Var.U;
            aj3Var.V.a(i == 2131751742 ? gm.E2(jb6.M0(2131743798, null), true, gm.L(2.6666667f), gm.L(2.0f)) : null, true);
            if (str != null) {
                aj3Var.h0 = true;
                if (aj3Var.i0 != i) {
                    aj3Var.i0 = i;
                    ioVar.c(jb6.M0(i, str), !jb6.a0, true);
                }
            } else {
                aj3Var.h0 = false;
                aj3Var.i0 = 0;
                ioVar.c(aj3Var.g0, !jb6.a0, true);
            }
            aj3Var.a.a(aj3Var.h0, true);
            aj3Var.M0.F(ioVar);
        }
    }

    public final float t3() {
        dj3 dj3Var = this.H3;
        if (dj3Var == null || !dj3Var.c()) {
            return 0.0f;
        }
        return this.H3.e;
    }

    public final /* synthetic */ void t4() {
        oc7.r1(this.currentAccount).p4(0L, "PREMIUM_RESTORE");
        q5();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t5(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2, boolean z3) {
        sj3 sj3Var;
        boolean z4;
        vgc vgcVar;
        if (!this.s3 || this.n2 || (sj3Var = this.D0) == null) {
            return;
        }
        ArrayList<sh4> currentSearchFilters = sj3Var.getCurrentSearchFilters();
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        for (int i = 0; i < currentSearchFilters.size(); i++) {
            if (currentSearchFilters.get(i).a()) {
                z6 = true;
            } else if (currentSearchFilters.get(i).d == 4) {
                z7 = true;
            } else if (currentSearchFilters.get(i).d == 6) {
                z8 = true;
            } else if (currentSearchFilters.get(i).d == 7) {
                z5 = true;
            }
        }
        if (z5) {
            z2 = false;
        }
        boolean z9 = !(arrayList == null || arrayList.isEmpty()) || !(arrayList2 == null || arrayList2.isEmpty()) || z2;
        if ((z6 || z9 || !z) && z9) {
            if (arrayList == null || arrayList.isEmpty() || z7) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z8) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null || z2) {
                this.c0.D1(arrayList, arrayList2, z2);
                z4 = true;
                if (!z4) {
                    this.c0.D1(null, null, false);
                }
                if (!z3) {
                    this.c0.getAdapter().f();
                }
                vgcVar = this.b0;
                if (vgcVar != null) {
                    vgcVar.b(z4, true);
                }
                this.c0.setEnabled(z4);
                this.s.a(z4, true);
            }
        }
        z4 = false;
        if (!z4) {
        }
        if (!z3) {
        }
        vgcVar = this.b0;
        if (vgcVar != null) {
        }
        this.c0.setEnabled(z4);
        this.s.a(z4, true);
    }

    @Override // aj6
    public final void u() {
        R4(true, true);
    }

    public final float u3() {
        return -gm.U1(this.b.e, gm.L(4.0f), gm.L(48.0f));
    }

    public final /* synthetic */ void u4() {
        oc7.r1(this.currentAccount).p4(0L, this.C3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        q5();
    }

    public final void u5() {
        float f = (((-this.m4) - this.p4) - this.w1) - this.x1;
        wp4 wp4Var = this.u0;
        if (wp4Var != null) {
            wp4Var.setTranslationY(f);
        }
        wp4 wp4Var2 = this.v0;
        if (wp4Var2 != null) {
            wp4Var2.setTranslationY(f - gm.L(52.0f));
            hg5 hg5Var = this.q0;
            if (hg5Var != null) {
                hg5Var.setTranslationY(f - gm.L(52.0f));
            }
        }
    }

    public final h4b v3() {
        return getMessagesController().N1();
    }

    public final /* synthetic */ void v4() {
        oc7.r1(this.currentAccount).p4(0L, "USERPIC_SETUP");
        q5();
    }

    public final void v5(boolean z) {
        boolean z2 = this.n2;
        boolean z3 = (!z2 || this.T0 == 10) && this.Y2 == 0 && this.a3 == 0 && !this.inPreviewMode && (!this.l2 || z2) && !this.a4;
        wp4 wp4Var = this.u0;
        if (wp4Var != null) {
            wp4Var.e(z3, z);
        }
        wp4 wp4Var2 = this.v0;
        if (wp4Var2 != null) {
            wp4Var2.e(z3, z);
        }
    }

    public final UndoView w3() {
        j3();
        UndoView[] undoViewArr = this.z0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            gk3 gk3Var = (gk3) this.fragmentView;
            gk3Var.removeView(undoViewArr[0]);
            gk3Var.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w4() {
        boolean b;
        int i;
        int size;
        int i2;
        int i3;
        float f;
        int i4;
        mk3 mk3Var;
        if (this.T0 != 0) {
            return;
        }
        kh3 kh3Var = this.Q3;
        gm.r(kh3Var);
        gm.d3(kh3Var, 500L);
        mk3[] mk3VarArr = this.f0;
        ActionBarLayout actionBarLayout = null;
        int i5 = 0;
        jk3 jk3Var = (mk3VarArr == null || (mk3Var = mk3VarArr[0]) == null) ? null : mk3Var.a;
        if (gm.O1() && (getParentActivity() instanceof LaunchActivity)) {
            actionBarLayout = ((LaunchActivity) getParentActivity()).r0;
        }
        e7a e7aVar = this.P3;
        if (jk3Var != null && !this.s3 && jk3Var.getScrollState() == 0) {
            qa4 qa4Var = ia4.a;
            if (getParentLayout() != null) {
                for (d dVar : getParentLayout().getFragmentStack()) {
                    if ((dVar instanceof bj6) && ((bj6) dVar).b0() == this) {
                        b = ia4.b(dVar) && (getVisibleDialog() == null || !getVisibleDialog().isShowing());
                        if (b && (actionBarLayout == null || actionBarLayout.getLastFragment() == null)) {
                            ArrayList arrayList = new ArrayList();
                            float paddingTop = jk3Var.getPaddingTop() + this.O;
                            float height = jk3Var.getHeight() - jk3Var.getPaddingBottom();
                            i = 0;
                            while (i < jk3Var.getChildCount()) {
                                View childAt = jk3Var.getChildAt(i);
                                if ((childAt instanceof hg3) && childAt.getY() >= paddingTop && childAt.getY() + childAt.getHeight() <= height) {
                                    long dialogId = ((hg3) childAt).getDialogId();
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(dialogId);
                                    if (dialog != null && dialog.unread_count > 0) {
                                        f = height;
                                        if (sd2.V(getMessagesController().L0(Long.valueOf(-dialogId)))) {
                                            int i6 = dialog.top_message;
                                            ArrayList arrayList2 = (ArrayList) getMessagesController().S.f(dialogId);
                                            if (arrayList2 != null) {
                                                int size2 = arrayList2.size();
                                                int i7 = i5;
                                                while (i7 < size2) {
                                                    Object obj = arrayList2.get(i7);
                                                    i7++;
                                                    k47 k47Var = (k47) obj;
                                                    if (k47Var.e1() > 0) {
                                                        i4 = i5;
                                                        i6 = Math.min(i6, k47Var.e1());
                                                    } else {
                                                        i4 = i5;
                                                    }
                                                    i5 = i4;
                                                }
                                            }
                                            i3 = i5;
                                            long y = (long) childAt.getY();
                                            long[] jArr = new long[3];
                                            jArr[i3] = dialogId;
                                            jArr[1] = i6;
                                            jArr[2] = y;
                                            arrayList.add(jArr);
                                        } else {
                                            i3 = i5;
                                        }
                                        i++;
                                        height = f;
                                        i5 = i3;
                                    }
                                }
                                i3 = i5;
                                f = height;
                                i++;
                                height = f;
                                i5 = i3;
                            }
                            int i8 = i5;
                            Object obj2 = e7aVar.a;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            size = arrayList.size();
                            i2 = i8;
                            while (i2 < size) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                long[] jArr2 = (long[]) obj3;
                                long[] jArr3 = (long[]) ((LinkedHashMap) e7aVar.d).remove(jArr2[i8] + ":" + jArr2[1]);
                                if (jArr3 != null && jArr3[2] != jArr2[2]) {
                                    e7aVar.m(jArr3, uptimeMillis);
                                }
                                String str = jArr2[i8] + ":" + jArr2[1];
                                if (jArr3 == null || jArr3[2] != jArr2[2]) {
                                    jArr3 = new long[4];
                                    jArr3[i8] = jArr2[i8];
                                    jArr3[1] = jArr2[1];
                                    jArr3[2] = jArr2[2];
                                    jArr3[3] = uptimeMillis;
                                }
                                linkedHashMap.put(str, jArr3);
                            }
                            e7aVar.A();
                            e7aVar.d = linkedHashMap;
                            return;
                        }
                    }
                }
            }
            b = ia4.b(this);
            if (b) {
                ArrayList arrayList3 = new ArrayList();
                float paddingTop2 = jk3Var.getPaddingTop() + this.O;
                float height2 = jk3Var.getHeight() - jk3Var.getPaddingBottom();
                i = 0;
                while (i < jk3Var.getChildCount()) {
                }
                int i82 = i5;
                Object obj22 = e7aVar.a;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                size = arrayList3.size();
                i2 = i82;
                while (i2 < size) {
                }
                e7aVar.A();
                e7aVar.d = linkedHashMap2;
                return;
            }
        }
        e7aVar.A();
    }

    public final void w5(boolean z, boolean z2) {
        boolean z3;
        if (this.o0 != null) {
            r7 r7Var = this.n0;
            if (r7Var == null || r7Var.getVisibility() != 0) {
                int i = 0;
                while (true) {
                    if (i >= getDownloadController().H.size()) {
                        z3 = false;
                        break;
                    } else {
                        if (getFileLoader().S(((k47) getDownloadController().H.get(i)).S0())) {
                            z3 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (getDownloadController().J.size() > 0 || z3 || (this.h0.getVisibility() == 0 && this.h0.getAlpha() == 1.0f && !z2)) {
                    this.j0 = true;
                } else {
                    this.j0 = false;
                }
                T2();
                boolean z4 = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i2 = this.f2;
                boolean z5 = i2 == 3 || i2 == 5;
                this.p0.setSubtext(jb6.M0(z4 ? z5 ? 2131748365 : 2131748364 : 2131748363, null));
                this.o0.b(z4, z5, z);
            }
        }
    }

    public final ub7 x3() {
        mk3[] mk3VarArr = this.f0;
        if (mk3VarArr != null && mk3VarArr[0] != null) {
            ArrayList S0 = getMessagesController().S0();
            int i = this.U3;
            if (i < 0) {
                i = this.f0[0].h;
            }
            if (i >= 0 && i < S0.size()) {
                return (ub7) S0.get(i);
            }
        }
        return null;
    }

    public final void x5() {
        if (!this.u3 || this.actionBar == null) {
            return;
        }
        int themedColor = getThemedColor((this.Y2 == 0 && this.a3 == 0) ? cmb.u8 : cmb.N8);
        a aVar = this.actionBar;
        int i = cmb.x8;
        aVar.H(on2.f(this.z1, themedColor, getThemedColor(i)), false);
        this.actionBar.H(on2.f(this.z1, getThemedColor(i), getThemedColor(i)), true);
        this.actionBar.G(on2.f(this.z1, getThemedColor((this.Y2 == 0 && this.a3 == 0) ? cmb.s8 : cmb.M8), getThemedColor(cmb.y8)), false);
    }

    public final boolean y3() {
        if (this.n2 || this.T0 != 0 || this.a3 != 0 || this.Y2 != 0) {
            return false;
        }
        oc7 messagesController = getMessagesController();
        messagesController.getClass();
        return gda.m1 && messagesController.R.f(2305843009213693953L) != null;
    }

    public final void y4(long j) {
        long j2 = j;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j2);
        int i = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                y4(((TLRPC.Dialog) obj).id);
            }
            return;
        }
        int i2 = -1;
        if ((!this.actionBar.y() || this.actionBar.z(null)) && H4(this.f0[0], dialog)) {
            U4(true, true);
            I2();
            if (this.T1 != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.T1.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) this.T1.get(i3)).id == j2) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (i2 < 0) {
                    U4(false, false);
                }
            }
        }
        int i4 = i2;
        if (getMessagesController().s2(j2) || getMessagesController().z2(j2)) {
            oc7 messagesController = getMessagesController();
            cf7 messagesStorage = messagesController.getMessagesStorage();
            v87 v87Var = new v87(messagesController, j2);
            mp3 mp3Var = messagesStorage.a;
            of2 of2Var = new of2((Object) messagesStorage, j2, (Object) v87Var, (byte) 5);
            j2 = j2;
            mp3Var.c(of2Var);
        }
        getMessagesController().s3(j2, 0L);
        oc7 messagesController2 = getMessagesController();
        int i5 = dialog.top_message;
        messagesController2.n3(j2, i5, i5, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i4 >= 0) {
            this.T1.remove(i4);
            this.f0[0].y.D();
            this.f0[0].b(true);
        }
    }

    public final void y5() {
        bda bdaVar;
        ti3 ti3Var = this.D1;
        byte b = 10;
        ArrayList arrayList = this.K2;
        if (ti3Var == null) {
            if (this.T0 == 10) {
                B3(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        z5();
        if (arrayList.isEmpty()) {
            String M0 = jb6.M0((this.T0 == 3 && this.h2 == null) ? 2131750507 : 2131745403, null);
            boolean z = this.W3;
            boolean isEmpty = arrayList.isEmpty();
            a aVar = this.actionBar;
            if (z == isEmpty) {
                aVar.setTitle(M0);
            } else {
                aVar.N(M0, true, 350L, d53.h);
            }
            if (this.D1.getTag() != null) {
                this.D1.K0(false, false, false);
                this.D1.R();
                this.D1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.D1.getTag() == null) {
                if (!z3() && this.G2 == null) {
                    this.D1.setFieldText("");
                }
                this.D1.setTag(1);
                if (!this.c4 && (bdaVar = this.I2) != null) {
                    this.c4 = true;
                    String M02 = jb6.M0(2131745163, null);
                    bdaVar.j();
                    bdaVar.G = M02;
                    ((lka) bdaVar.a[0].f).l(M02, false);
                    c0a c0aVar = new c0a(bdaVar, b);
                    bdaVar.H = c0aVar;
                    gm.d3(c0aVar, 1000L);
                }
            }
            this.E1.f(Math.max(1, arrayList.size()), true);
            int i = this.U0 + (!TextUtils.isEmpty(this.D1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            int i2 = 0;
            long j = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                long longValue = ((Long) obj).longValue();
                long L1 = getMessagesController().L1(longValue);
                if (L1 <= 0 && longValue > 0) {
                    L1 = pg3.j(getMessagesController().L2(longValue));
                }
                j += L1;
            }
            this.E1.i(i, j, true);
            this.D1.C2();
            boolean z2 = this.W3;
            boolean isEmpty2 = arrayList.isEmpty();
            a aVar2 = this.actionBar;
            if (z2 == isEmpty2) {
                aVar2.setTitle(jb6.G(arrayList.size(), "Recipient", new Object[0]));
            } else {
                aVar2.N(jb6.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, d53.h);
            }
        }
        this.W3 = arrayList.isEmpty();
    }

    @Override // aj6
    public final nz4 z() {
        return this.s4;
    }

    public final boolean z3() {
        ArrayList arrayList = this.F2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (sd2.K(r6, false) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z4(TLRPC.Chat chat, TLRPC.User user) {
        Boolean bool;
        Boolean bool2;
        if (chat != null) {
            boolean V = sd2.V(chat);
            TLRPC.RequestPeerType requestPeerType = this.H;
            if (V == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.H.bot_participant) == null || !bool2.booleanValue() || getMessagesController().w2(chat, user) || sd2.b(chat)))) {
                Boolean bool3 = this.H.has_username;
                if (bool3 != null) {
                }
                Boolean bool4 = this.H.forum;
                if ((bool4 == null || bool4.booleanValue() == sd2.c0(chat)) && ((this.H.user_admin_rights == null || getMessagesController().y3(chat, getUserConfig().f(), this.H.user_admin_rights)) && (this.H.bot_admin_rights == null || getMessagesController().y3(chat, user, this.H.bot_admin_rights) || sd2.w(4, chat)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void z5() {
        bda bdaVar = this.I2;
        if (bdaVar != null) {
            int i = this.currentAccount;
            bdaVar.h(i);
            bdaVar.d = z8c.h(j5.a(i).a).e();
            ArrayList arrayList = bdaVar.f;
            arrayList.clear();
            ArrayList arrayList2 = this.K2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            pw3 pw3Var = bdaVar.a[0];
            if (bdaVar.b == 1) {
                ((lka) pw3Var.e).l(bdaVar.c(pw3Var), false);
            }
        }
    }

    @Override // aj6
    public final void F() {
    }
}

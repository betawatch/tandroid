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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class cj3 extends d implements gk7, aj4, x74, zg6 {
    public static boolean C4;
    public static final boolean[] D4 = new boolean[4];
    public static final ef3 E4 = new ef3((byte) 1);
    public static float F4;
    public qi3 A0;
    public j92 A1;
    public boolean A2;
    public float A3;
    public int A4;
    public boolean B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public int B4;
    public int C0;
    public FrameLayout C1;
    public boolean C2;
    public boolean C3;
    public hi3 D0;
    public hh3 D1;
    public boolean D2;
    public Long D3;
    public boolean E;
    public ffa E0;
    public jh3 E1;
    public wi3 E2;
    public Drawable E3;
    public boolean F;
    public oh3 F0;
    public r7 F1;
    public ArrayList F2;
    public tl F3;
    public boolean G;
    public dj3 G0;
    public final TextPaint G1;
    public String G2;
    public ym G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public fh3 H1;
    public CharSequence H2;
    public rh3 H3;
    public long I;
    public float I0;
    public FrameLayout I1;
    public bba I2;
    public final gh3 I3;
    public ValueAnimator J;
    public float J0;
    public fh3 J1;
    public wc3 J2;
    public final gh3 J3;
    public ValueAnimator K;
    public float K0;
    public FrameLayout K1;
    public final ArrayList K2;
    public s34 K3;
    public boolean L;
    public sb L0;
    public fj3 L1;
    public boolean L2;
    public wtc L3;
    public boolean M;
    public cs5 M0;
    public ej3 M1;
    public int M2;
    public Drawable M3;
    public boolean N;
    public th3 N0;
    public l9 N1;
    public int N2;
    public int N3;
    public float O;
    public boolean O0;
    public dk3 O1;
    public boolean O2;
    public boolean O3;
    public boolean P;
    public boolean P0;
    public x4c P1;
    public int P2;
    public boolean P3;
    public int Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public long R0;
    public Long R1;
    public int R2;
    public final wf3 R3;
    public boolean S;
    public long S0;
    public rn2 S1;
    public int S2;
    public int S3;
    public m21 T;
    public int T0;
    public ArrayList T1;
    public int T2;
    public AnimatorSet T3;
    public float U;
    public int U0;
    public boolean U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public int V0;
    public hd V1;
    public int V2;
    public k83 V3;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public int W2;
    public String W3;
    public boolean X;
    public mr7 X0;
    public boolean X1;
    public boolean X2;
    public ArrayList X3;
    public pi3 Y;
    public ue3 Y0;
    public long Y1;
    public int Y2;
    public boolean Y3;
    public ys9 Z;
    public ue3 Z0;
    public TLObject Z1;
    public cj3 Z2;
    public CharSequence Z3;
    public final byte a;
    public ls9 a0;
    public boolean a1;
    public int a2;
    public long a3;
    public boolean a4;
    public final fm0 b;
    public vec b0;
    public boolean b1;
    public int b2;
    public TLRPC.Chat b3;
    public float b4;
    public final fm0 c;
    public tf4 c0;
    public final ArrayList c1;
    public boolean c2;
    public TLRPC.ChatFull c3;
    public boolean c4;
    public final fm0 d;
    public float d0;
    public boolean d1;
    public boolean d2;
    public be0 d3;
    public boolean d4;
    public final fm0 e;
    public ValueAnimator e0;
    public boolean e1;
    public boolean e2;
    public pb0 e3;
    public ValueAnimator e4;
    public final fm0 f;
    public bj3[] f0;
    public boolean f1;
    public int f2;
    public long f3;
    public wl5 f4;
    public r7 g0;
    public ed0 g1;
    public boolean g2;
    public boolean g3;
    public TLRPC.FileLocation g4;
    public final fm0 h;
    public r7 h0;
    public final Paint h1;
    public String h2;
    public boolean h3;
    public TLRPC.FileLocation h4;
    public xp3 i0;
    public ImageView i1;
    public String i2;
    public AnimatorSet i3;
    public m21 i4;
    public boolean j0;
    public NumberTextView j1;
    public String j2;
    public boolean j3;
    public int j4;
    public r7 k0;
    public final ArrayList k1;
    public boolean k2;
    public boolean k3;
    public int k4;
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
    public final fm0 n;
    public r7 n0;
    public r7 n1;
    public boolean n2;
    public int n3;
    public int n4;
    public tt8 o0;
    public r7 o1;
    public boolean o2;
    public boolean o3;
    public final cq3 o4;
    public a8 p0;
    public a8 p1;
    public String p2;
    public boolean p3;
    public final lx4 p4;
    public je5 q0;
    public a8 q1;
    public String q2;
    public m21 q3;
    public final lx4 q4;
    public final fm0 r;
    public je5 r0;
    public a8 r1;
    public final zc7 r2;
    public final on r3;
    public final ix4 r4;
    public final fm0 s;
    public boolean s0;
    public a8 s1;
    public boolean s2;
    public boolean s3;
    public final kl0 s4;
    public boolean t0;
    public a8 t1;
    public boolean t2;
    public boolean t3;
    public final kl0 t4;
    public un4 u0;
    public a8 u1;
    public boolean u2;
    public boolean u3;
    public final kl0 u4;
    public un4 v0;
    public a8 v1;
    public boolean v2;
    public boolean v3;
    public final kl0 v4;
    public final fyc w;
    public u41 w0;
    public float w1;
    public boolean w2;
    public float w3;
    public pg3 w4;
    public boolean x;
    public ry1 x0;
    public float x1;
    public boolean x2;
    public ValueAnimator x3;
    public final ArrayList x4;
    public int y;
    public int y0;
    public AnimatorSet y1;
    public boolean y2;
    public float y3;
    public final RectF y4;
    public final UndoView[] z0;
    public float z1;
    public boolean z2;
    public float z3;
    public final RectF z4;

    public cj3(Bundle bundle) {
        super(bundle);
        kl0 kl0Var;
        kl0 kl0Var2;
        kl0 kl0Var3;
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 31 ? (byte) 48 : (byte) 0;
        s33 s33Var = s33.h;
        this.b = new fm0(1, this, s33Var, 350L, false);
        this.c = new fm0(2, this, s33Var, 350L, false);
        this.d = new fm0(3, this, s33Var, 350L, false);
        this.e = new fm0(4, this, s33Var, 350L, false);
        this.f = new fm0(5, this, s33Var, 350L, false);
        this.h = new fm0(6, this, s33Var, 350L, false);
        this.n = new fm0(7, this, s33Var, 350L, false);
        this.r = new fm0(8, this, s33Var, 350L, false);
        this.s = new fm0(9, this, s33Var, 350L, false);
        this.w = new fyc(new wf3(this, (byte) 27));
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
        this.r2 = new zc7();
        this.K2 = new ArrayList();
        this.L2 = true;
        this.r3 = new on(null);
        this.I3 = new gh3(this, (byte) 0);
        this.J3 = new gh3(this, (byte) 1);
        this.N3 = -4;
        this.O3 = true;
        this.P3 = true;
        this.R3 = new wf3(this, (byte) 28);
        this.S3 = -1;
        this.b4 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.x4 = arrayList;
        RectF rectF = new RectF();
        this.y4 = rectF;
        RectF rectF2 = new RectF();
        this.z4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        ix4 d = this.glassEngine.d(new ag3(this, (byte) 12));
        this.r4 = d;
        if (i >= 31) {
            cq3 cq3Var = new cq3(false);
            this.o4 = cq3Var;
            lx4 lx4Var = new lx4(d);
            this.q4 = lx4Var;
            lx4Var.f = d;
            lx4Var.d = cq3Var;
            lx4Var.e = -2;
            lx4 lx4Var2 = new lx4(null);
            this.p4 = lx4Var2;
            lx4Var2.f = d;
            lx4Var2.d = cq3Var;
            lx4Var2.e = -3;
            kl0Var2 = new kl0(lx4Var, lx4Var, lx4Var);
            this.u4 = kl0Var2;
            kl0Var2.k = true;
            int L = e66.e(262144) ? gl.L(8.0f) : gl.L(48.0f);
            kl0Var2.d = L;
            kl0Var2.e = L;
            kl0Var = new kl0(lx4Var2, lx4Var2, lx4Var2);
            this.s4 = kl0Var;
            kl0Var.k = true;
            int L2 = gl.L(48.0f);
            kl0Var.d = L2;
            kl0Var.e = L2;
            kl0Var3 = new kl0(lx4Var2, lx4Var2, lx4Var2);
            this.t4 = kl0Var3;
        } else {
            this.o4 = null;
            this.p4 = null;
            this.q4 = null;
            kl0Var = new kl0(d, d, d);
            this.s4 = kl0Var;
            kl0Var2 = new kl0(d, d, d);
            this.u4 = kl0Var2;
            kl0Var3 = new kl0(d, d, d);
            this.t4 = kl0Var3;
        }
        kl0 kl0Var4 = new kl0(d, d, d);
        this.v4 = kl0Var4;
        qw4 qw4Var = this.glassEngine;
        kl0Var2.j = qw4Var;
        kl0Var.j = qw4Var;
        kl0Var3.j = qw4Var;
        kl0Var4.j = qw4Var;
    }

    public static void A3(mu1 mu1Var, k27 k27Var) {
        if (k27Var == null || !k27Var.r2()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(k27Var.z) ? k27Var.z : k27Var.v;
            CharSequence v1 = gl.v1(charSequence, k27Var.a2, null);
            if (v1 instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) v1;
                cm4[] cm4VarArr = (cm4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cm4.class);
                if (cm4VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(cm4VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(cm4VarArr[0]);
                    for (int i = 1; i < cm4VarArr.length; i++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(cm4VarArr[i]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(cm4VarArr[i]);
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
                    mu1Var.yb(k27Var.L1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public static ue3 l3(bj3 bj3Var) {
        yi3 yi3Var = bj3Var.a;
        for (int i = 0; i < yi3Var.getChildCount(); i++) {
            View childAt = yi3Var.getChildAt(i);
            if (childAt instanceof ue3) {
                ue3 ue3Var = (ue3) childAt;
                if (ue3Var.Y()) {
                    return ue3Var;
                }
            }
        }
        return null;
    }

    public static void t4(j5 j5Var) {
        SharedPreferences.Editor editor;
        int i = j5Var.a;
        boolean[] zArr = D4;
        if (zArr[i]) {
            return;
        }
        na7 q1 = na7.q1(i);
        byte b = 4;
        byte b2 = 1;
        if (q1.k2 == 0 && !q1.getUserConfig().T) {
            SharedPreferences sharedPreferences = na7.q1(q1.currentAccount).W3;
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
            q1.k2 = 4;
            for (int i2 = 0; i2 < 3; i2++) {
                TL_account.getNotifySettings getnotifysettings = new TL_account.getNotifySettings();
                if (i2 == 0) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                } else if (i2 == 1) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                } else {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                }
                q1.getConnectionsManager().sendRequest(getnotifysettings, new e97(q1, i2, b2));
            }
            q1.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new y47(q1, (byte) 6));
        }
        if (!q1.getUserConfig().U && !q1.l2) {
            q1.l2 = true;
            q1.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new y47(q1, (byte) 14));
        }
        q1.W2(0, 0, 100, true, null);
        if (q1.s.isEmpty() && !TextUtils.isEmpty(q1.t3)) {
            TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
            tL_help_getRecentMeUrls.referer = q1.t3;
            q1.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new y47(q1, b));
        }
        q1.h3(0, y6c.h(i).f(), false);
        qu2.r(i).f();
        hq6.d0(i).w(false);
        gl.e3(new mk2(j5Var, (byte) 25), 200L);
        Iterator it = q1.y3.iterator();
        while (it.hasNext()) {
            hq6.d0(i).d1((String) it.next(), true, true);
        }
        zArr[i] = true;
    }

    @Override // zg6
    public final lx4 A() {
        return this.q4;
    }

    public final void A2(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            byte b = 1;
            if (this.Y2 == 0 && this.a3 == 0 && Build.VERSION.SDK_INT >= 33 && tl7.E0(parentActivity)) {
                if (z) {
                    showDialog(new tl7(parentActivity, !rqe.a(), new jg3(parentActivity, b)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            byte b2 = 0;
            if (getUserConfig().V && this.W1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z) {
                    hd hdVar = ij.v(parentActivity, new qg3(this, b2)).a;
                    this.V1 = hdVar;
                    showDialog(hdVar);
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
            } else if ((i <= 28 || w01.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
                a5();
            }
        }
    }

    public final void A4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (y6c.h(i).o()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new mz2((byte) 12));
        cs5 I = cs5.I(this, view);
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
                int i3 = bkb.h6;
                Drawable Y = bkb.Y(getThemedColor(i3), 0, 0);
                vkb M = zkb.M(i3);
                wjb resourceProvider = getResourceProvider();
                linearLayout.setBackground(Y);
                zkb.j(linearLayout, Y, null, M, resourceProvider);
                TLRPC.User f = y6c.h(intValue).f();
                pb0 pb0Var = new pb0((wjb) null);
                pb0Var.q(f);
                oi3 oi3Var = new oi3(this, getParentActivity(), z);
                linearLayout.addView(oi3Var, nme.t(34, 34, 16, 12, 0, 0, 0));
                be0 be0Var = new be0(getParentActivity());
                if (z) {
                    be0Var.setScaleX(0.833f);
                    be0Var.setScaleY(0.833f);
                }
                be0Var.setRoundRadius(gl.L(16.0f));
                be0Var.getImageReceiver().d = intValue;
                be0Var.f(f, pb0Var);
                oi3Var.addView(be0Var, nme.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                zkb.X(textView, bkb.i5, getResourceProvider());
                textView.setText(l7c.q(f));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, nme.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new wg((Object) this, intValue, (Object) I, (byte) 7));
                I.q(linearLayout, nme.o(kk7.F3, 48));
            }
        }
        ShapeDrawable b0 = bkb.b0(gl.L(24.0f), getThemedColor(bkb.c6));
        b0.getPaint().setShadowLayer(gl.L(6.0f), 0.0f, gl.L(1.0f), bkb.p1(0.15f, -16777216));
        I.z.set(-gl.L(4.0f), -gl.L(4.0f), -gl.L(4.0f), -gl.L(4.0f));
        I.X(b0);
        I.b0(0.0f, -gl.L(4.0f));
        I.W(5);
        I.a0();
    }

    public final void A5(boolean z) {
        a aVar;
        boolean z2;
        g2b t3;
        ArrayList arrayList;
        if (this.F0 == null || this.J != null) {
            return;
        }
        rh3 rh3Var = this.H3;
        if ((rh3Var != null && rh3Var.c()) || this.s3 || (aVar = this.actionBar) == null || aVar.y() || this.n2) {
            return;
        }
        t7b t7bVar = t7b.G2;
        int i = 0;
        if ((t7bVar != null && t7bVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
            z = false;
        }
        boolean z3 = !D3() && t3().H();
        if (this.a3 != 0) {
            z2 = false;
        } else if (D3()) {
            z2 = !t3().h.isEmpty();
        } else {
            z2 = !z3 && (((arrayList = (t3 = t3()).g) != null && arrayList.size() > 0) || t3.I());
            z3 = t3().H();
        }
        this.M = z3;
        boolean z4 = this.H0;
        boolean z5 = z3 || z2;
        this.H0 = z5;
        if (z2 || z5) {
            this.F0.q(z, z5 != z4);
        }
        boolean z6 = this.H0;
        byte b = 2;
        byte b2 = 8;
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
                ofFloat.addUpdateListener(new ae0(this, (byte) 4));
                this.K.addListener(new im2(this, b2));
                this.K.setDuration(200L);
                this.K.setInterpolator(s33.f);
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
                float o3 = z2 ? 0.0f : o3();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.J = ofFloat2;
                ofFloat2.addUpdateListener(new fi3(this, f, z2, o3));
                this.J.addListener(new xh3(this, z2, b));
                this.J.setDuration(200L);
                this.J.setInterpolator(s33.f);
                this.J.start();
                return;
            }
            this.L = z2;
            oh3 oh3Var = this.F0;
            if ((z2 || this.M) && !isInPreviewMode()) {
                b2 = 0;
            }
            oh3Var.setVisibility(b2);
            if (z2) {
                this.A3 = -gl.L(81.0f);
                S4(-o3());
            } else {
                S4(0.0f);
            }
            while (true) {
                bj3[] bj3VarArr = this.f0;
                if (i >= bj3VarArr.length) {
                    break;
                }
                bj3 bj3Var = bj3VarArr[i];
                if (bj3Var != null) {
                    bj3Var.a.requestLayout();
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

    public final void B2(CharSequence charSequence) {
        if (this.D1 != null) {
            if (this.F2 == null && this.G2 == null && this.H2 == null) {
                return;
            }
            byte b = 0;
            if (this.I2 == null) {
                bba bbaVar = new bba(getParentActivity(), getResourceProvider());
                this.I2 = bbaVar;
                bbaVar.setLayoutClickListener(new zf3(this, b));
                this.I2.setOnModeChangeListener(new ag3(this, b));
                hh3 hh3Var = this.D1;
                bba bbaVar2 = this.I2;
                if (bbaVar2 == null) {
                    hh3Var.getClass();
                } else {
                    hh3Var.w2 = bbaVar2;
                    hh3Var.addView(bbaVar2, 0, nme.e(-1, 48, 51));
                    hh3Var.W3 = false;
                    hh3Var.Q();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.I2.getLayoutParams();
                layoutParams.rightMargin = -this.D1.getPaddingRight();
                this.I2.setLayoutParams(layoutParams);
            }
            if (x3()) {
                this.I2.i(this.currentAccount, this.F2);
            } else {
                String str = this.G2;
                if (str != null) {
                    bba bbaVar3 = this.I2;
                    bbaVar3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        bbaVar3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.H2;
                    if (charSequence2 != null) {
                        bba bbaVar4 = this.I2;
                        bbaVar4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            bbaVar4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.D1.setFieldText(charSequence);
            }
            this.D1.setOverrideHint(k96.M0(x3() ? 2131754451 : 2131745270, null));
            P2();
            if (this.I2.getMode() != 0) {
                this.D1.b2(false, false);
            }
            v5();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B3(int i) {
        cq3 cq3Var;
        if (Build.VERSION.SDK_INT < 31 || (cq3Var = this.o4) == null) {
            return;
        }
        if (fod.a(i, 4)) {
            int L = gl.L(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.k4) - gl.L(8.0f);
            int L2 = measuredHeight - gl.L(56.0f);
            int L3 = gl.L(this.L ? 81.0f : 0.0f) + gl.L(48.0f) + this.actionBar.getMeasuredHeight();
            qi3 qi3Var = this.A0;
            boolean z = false;
            int measuredHeight2 = L3 + ((qi3Var == null || qi3Var.getVisibility() != 0) ? 0 : this.A0.getMeasuredHeight());
            fj3 fj3Var = this.L1;
            int sumHeightOfAllVisibleChild = measuredHeight2 + ((fj3Var == null || fj3Var.getVisibility() != 0) ? 0 : this.L1.getSumHeightOfAllVisibleChild()) + ((int) this.O);
            int measuredHeight3 = this.actionBar.getMeasuredHeight();
            this.y4.set(0.0f, -L, this.fragmentView.getMeasuredWidth(), gl.U1(this.b.e, sumHeightOfAllVisibleChild, gl.L(30.0f) + measuredHeight3 + (this.a0 != null ? r8.getMeasuredHeight() : 0)) + L);
            boolean z2 = this.X;
            RectF rectF = this.z4;
            if (z2) {
                rectF.set(0.0f, L2, this.fragmentView.getMeasuredWidth(), measuredHeight);
                rectF.inset(0.0f, e66.e(262144) ? 0.0f : -gl.L(48.0f));
            } else {
                if (this.D1 != null && this.A1 != null) {
                    rectF.set(0.0f, this.fragmentView.getMeasuredHeight() - D2(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                    rectF.inset(0.0f, e66.e(262144) ? 0.0f : -gl.L(48.0f));
                }
                cq3Var.g(z ? 2 : 1, this.x4);
            }
            z = true;
            cq3Var.g(z ? 2 : 1, this.x4);
        }
        cq3Var.e(this.w4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void B4() {
        try {
            ((oy8) ((pb0) this.O1.h.getImageReceiver().n0).K).C(true);
        } catch (Exception unused) {
        }
        if (this.f4 == null) {
            wl5 wl5Var = new wl5(0, true, true);
            this.f4 = wl5Var;
            wl5Var.I = true;
            wl5Var.a = this;
            wl5Var.b = new mi3(this);
            getMediaDataController().z();
            getMessagesController().e3();
            getMessagesController().h3(this.classGuid, getUserConfig().f(), true);
        }
        TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(y6c.h(this.currentAccount).e()));
        if (V1 == null) {
            V1 = y6c.h(this.currentAccount).f();
        }
        if (V1 == null) {
            return;
        }
        x02 x02Var = this.f4.c;
        if (x02Var != null) {
            x02Var.H0();
        }
        wl5 wl5Var2 = this.f4;
        TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
        wl5Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new sg3(this, (byte) 11), new eg3(this, (byte) 3), 0);
    }

    public final void B5(int i, boolean z) {
        if (this.A0 == null || this.T0 != 0 || this.n2) {
            return;
        }
        this.S3 = i;
        t97 v3 = v3();
        this.S3 = -1;
        boolean z2 = false;
        boolean z3 = v3 != null && getMessagesController().R0().size() > 1 && getMessagesController().q2(v3);
        qi3 qi3Var = this.A0;
        if (z && qi3Var.getVisibility() == 0) {
            z2 = true;
        }
        qi3Var.k(z3, z2);
    }

    public final String C2() {
        ArrayList arrayList = this.K2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return k96.G(arrayList.size(), "ShareSendToMany", new Object[0]);
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
                sb.append(k96.M0(2131745709, null));
            } else {
                int size2 = arrayList.size();
                int i2 = this.currentAccount;
                sb.append(size2 == 1 ? cf3.k(i2, longValue) : cf3.r(i2, longValue));
            }
        }
        return k96.a0(null, null, 2131745247, sb.toString());
    }

    public final boolean C3() {
        return this.A0 != null && this.T0 == 0 && !this.n2 && this.Y2 == 0 && this.a3 == 0 && getMessagesController().j2();
    }

    public final void C4() {
        if (this.P3) {
            je5 je5Var = this.q0;
            if (je5Var != null) {
                je5Var.f(true);
            }
            wx n = na7.q1(this.currentAccount).M1().n();
            if (n != null && n.a(this.currentAccount, 1)) {
                showDialog(new h26(n.b(), this.currentAccount, null, getParentActivity(), this));
                return;
            } else {
                t7b C = t7b.C(getParentActivity(), this.currentAccount);
                C.y = new ih3(this);
                C.Q(null);
                return;
            }
        }
        je5 je5Var2 = this.r0;
        if (je5Var2 != null) {
            if (je5Var2.W) {
                return;
            } else {
                gl.B2(je5Var2);
            }
        }
        SpannableStringBuilder O2 = gl.O2(k96.N0("StoriesPremiumHint2").replace('\n', ' '), bkb.wj, 0, new sg3(this, (byte) 4), null);
        je5 je5Var3 = new je5(getParentActivity(), 2);
        je5Var3.q(8.0f);
        je5Var3.d = 8000L;
        je5Var3.j(true);
        je5Var3.p(true);
        je5Var3.h = gl.q.x - gl.L(148.0f);
        je5Var3.t(O2);
        je5Var3.n(1.0f, -40.0f);
        je5Var3.i(getThemedColor(bkb.vj));
        this.r0 = je5Var3;
        je5Var3.setTranslationY((-this.k4) - this.m4);
        ((ViewGroup) this.fragmentView).addView(this.r0, nme.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        this.r0.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C5(int i, boolean z) {
        RecyclerView recyclerView;
        int i2;
        int childCount;
        int i3;
        int i4 = 131072;
        if (this.U1) {
            int i5 = na7.q5;
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
                hi3 hi3Var = this.D0;
                recyclerView = hi3Var != null ? hi3Var.b0 : null;
            } else {
                bj3[] bj3VarArr = this.f0;
                if (bj3VarArr != null) {
                    yi3 yi3Var = i6 < bj3VarArr.length ? bj3VarArr[i6].a : null;
                    if (yi3Var != null) {
                        r6 = bj3VarArr[i6].getVisibility() == 0 ? this.f0[i6] : null;
                    }
                    recyclerView = yi3Var;
                }
                i2 = i6;
                i6 = i2 + 1;
                i4 = 131072;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                int i7 = na7.q5;
                if (((i & 2048) != 0 || i == 0) && r6 != null) {
                    r6.b(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    int i8 = 0;
                    while (i8 < childCount2) {
                        View childAt = recyclerView.getChildAt(i8);
                        boolean z2 = childAt instanceof ue3;
                        ArrayList arrayList = this.K2;
                        if (z2 && (this.D0 == null || recyclerView.getAdapter() != this.D0.e0)) {
                            ue3 ue3Var = (ue3) childAt;
                            int i9 = na7.q5;
                            if ((i & i4) != 0) {
                                ue3Var.c0(this.actionBar.y(), true);
                                if (this.U1) {
                                    i2 = i6;
                                    i8++;
                                    i6 = i2;
                                    i4 = 131072;
                                }
                            }
                            if ((65536 & i) != 0) {
                                ue3Var.e0(false, (i & TLObject.FLAG_13) != 0);
                            } else {
                                if ((i & 512) == 0) {
                                    i2 = i6;
                                    if (ue3Var.k0(i, z)) {
                                        r6.b(false);
                                        break;
                                    }
                                } else if (this.f0[i6].a() && gl.O1()) {
                                    i2 = i6;
                                    ue3Var.setDialogSelected(ue3Var.getDialogId() == this.r2.a);
                                } else {
                                    i2 = i6;
                                }
                                if (arrayList != null) {
                                    ue3Var.e0(arrayList.contains(Long.valueOf(ue3Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof v6c)) {
                                    ((v6c) childAt).i(i);
                                } else if (childAt instanceof rr8) {
                                    rr8 rr8Var = (rr8) childAt;
                                    rr8Var.A(i);
                                    if (arrayList != null) {
                                        rr8Var.y(arrayList.contains(Long.valueOf(rr8Var.getDialogId())), false);
                                    }
                                }
                                if (!this.U1 && (childAt instanceof o39)) {
                                    o39 o39Var = (o39) childAt;
                                    childCount = o39Var.getChildCount();
                                    for (i3 = 0; i3 < childCount; i3++) {
                                        View childAt2 = o39Var.getChildAt(i3);
                                        if (childAt2 instanceof ee5) {
                                            ((ee5) childAt2).b(i);
                                        }
                                    }
                                }
                                i8++;
                                i6 = i2;
                                i4 = 131072;
                            }
                        }
                        i2 = i6;
                        if (!(childAt instanceof v6c)) {
                        }
                        if (!this.U1) {
                            o39 o39Var2 = (o39) childAt;
                            childCount = o39Var2.getChildCount();
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

    @Override // x74
    public final void D(float f, int i) {
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
        if (gba.o() != 0) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = hq6.d0(this.currentAccount).E;
            String o0 = PremiumPreviewFragment.o0(2);
            if (tL_help_premiumPromo != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= tL_help_premiumPromo.video_sections.size()) {
                        i2 = -1;
                        break;
                    } else if (tL_help_premiumPromo.video_sections.get(i2).equals(o0)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    ba4.G(this.currentAccount).X(tL_help_premiumPromo.videos.get(i2), tL_help_premiumPromo, 3, 0);
                }
            }
        }
    }

    public final int D2() {
        if (this.D1 != null) {
            return (int) (this.A1.getInputBubbleHeight() + this.w.d() + gl.L(9.0f) + gl.L(7.0f) + gl.L(2.0f));
        }
        long j = this.a3;
        int i = this.k4;
        return j != 0 ? gl.L(72.0f) + i : i + this.m4;
    }

    public final boolean D3() {
        return this.Y2 == 1;
    }

    public final boolean D4(bj3 bj3Var, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat Y0;
        if (bj3Var != null && dialog != null) {
            if (!getMessagesController().o4.containsKey(Long.valueOf(dialog.id))) {
                if (I3(bj3Var)) {
                    return true;
                }
                t97 q3 = q3(bj3Var);
                if (q3 != null) {
                    int i = q3.g;
                    int i2 = na7.q5;
                    if ((i & 64) != 0) {
                        int i3 = this.currentAccount;
                        long j = dialog.id;
                        if (cf3.B(j) && (Y0 = na7.q1(i3).Y0(Integer.valueOf((int) (4294967295L & j)))) != null) {
                            j = Y0.user_id;
                        }
                        if (!q3.h.contains(Long.valueOf(j))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean D5(long j) {
        TLRPC.Chat K0;
        hh3 hh3Var;
        if ((this.U0 <= 1 && ((hh3Var = this.D1) == null || hh3Var.getVisibility() != 0 || TextUtils.isEmpty(this.D1.getFieldText()))) || !cf3.y(j) || (K0 = getMessagesController().K0(Long.valueOf(-j))) == null || hc2.N(K0) || !K0.slowmode_enabled) {
            return true;
        }
        ij.r0(this, k96.M0(2131745118, null), k96.M0(2131745110, null), null);
        return false;
    }

    @Override // aj4
    public final List E() {
        return Arrays.asList(new zi4(k96.M0(2131751636, null)), new zi4(k96.M0(2131752064, null), new wf3(this, (byte) 23)), new zi4(k96.M0(2131751637, null), new wf3(this, (byte) 24)));
    }

    public final boolean E2() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.K2;
            if (i >= arrayList.size()) {
                return true;
            }
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-((Long) arrayList.get(i)).longValue()));
            if (K0 != null && !hc2.l(K0)) {
                return false;
            }
            i++;
        }
    }

    public final boolean E3(long j) {
        if (j < 0) {
            return false;
        }
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j));
        if (!l7c.v(V1)) {
            return false;
        }
        ArrayList l = na7.q1(this.currentAccount).g4.l(-V1.id);
        return (l == null || l.isEmpty()) && na7.q1(this.currentAccount).g4.e(-V1.id);
    }

    public final boolean E4(bj3 bj3Var) {
        if (bj3Var == null) {
            return false;
        }
        if (I3(bj3Var)) {
            return true;
        }
        t97 q3 = q3(bj3Var);
        if (q3 != null) {
            int i = q3.g;
            int i2 = na7.q5;
            if ((i & 64) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void F2() {
        int themedColor;
        yf8 yf8Var;
        dh3 dh3Var;
        mt9 mt9Var;
        rkb rkbVar;
        hi3 hi3Var = this.D0;
        if (hi3Var != null && (mt9Var = hi3Var.e0) != null && (rkbVar = mt9Var.l0) != null) {
            int childCount = rkbVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = rkbVar.getChildAt(i);
                if (childAt instanceof ee5) {
                    ee5 ee5Var = (ee5) childAt;
                    pb0 pb0Var = ee5Var.c;
                    boolean D = cf3.D(ee5Var.f);
                    int i2 = ee5Var.h;
                    if (D) {
                        TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(ee5Var.f));
                        ee5Var.e = V1;
                        pb0Var.q(V1);
                    } else {
                        pb0Var.p(na7.q1(i2).K0(Long.valueOf(-ee5Var.f)));
                        ee5Var.e = null;
                    }
                    ee5Var.c(true);
                }
            }
        }
        if (this.f0 != null) {
            int i3 = 0;
            while (true) {
                bj3[] bj3VarArr = this.f0;
                if (i3 >= bj3VarArr.length) {
                    break;
                }
                bj3 bj3Var = bj3VarArr[i3];
                if (bj3Var != null && (dh3Var = bj3Var.n) != null) {
                    dh3Var.h();
                }
                i3++;
            }
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.I(getThemedColor(bkb.F8), true);
            this.actionBar.J(getThemedColor(bkb.D8), false, true);
            this.actionBar.J(getThemedColor(bkb.E8), true, true);
            this.actionBar.K(getThemedColor(bkb.H5), true);
            this.actionBar.updateColors();
        }
        if (this.F3 != null) {
            int themedColor2 = getThemedColor(bkb.pi);
            Drawable drawable = this.M3;
            if (drawable != null && themedColor2 != this.B4) {
                this.B4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            tl tlVar = this.F3;
            if (tlVar != null) {
                tlVar.k(Integer.valueOf(themedColor2));
            }
            ym ymVar = this.G3;
            if (ymVar != null) {
                ymVar.setColor(themedColor2);
            }
        }
        dk3 dk3Var = this.O1;
        if (dk3Var != null) {
            bkb.F1(dk3Var.getBackground(), bkb.w0(null, bkb.h6, false), true);
        }
        r7 r7Var = this.n0;
        if (r7Var != null) {
            r7Var.setIconColor(getThemedColor(bkb.u8));
        }
        hh3 hh3Var = this.D1;
        if (hh3Var != null) {
            hh3Var.updateColors();
        }
        qi3 qi3Var = this.A0;
        if (qi3Var != null) {
            il0 il0Var = qi3Var.F0;
            if (il0Var != null) {
                il0Var.updateColors();
            }
            jo0 jo0Var = qi3Var.z0;
            if (jo0Var != null) {
                jo0Var.g();
            }
            qi3Var.invalidate();
        }
        tf4 tf4Var = this.c0;
        if (tf4Var != null) {
            tf4Var.updateColors();
        }
        hi3 hi3Var2 = this.D0;
        if (hi3Var2 != null && (yf8Var = hi3Var2.s0) != null) {
            yf8Var.c();
        }
        vec vecVar = this.b0;
        if (vecVar != null) {
            vecVar.updateColors();
        }
        ls9 ls9Var = this.a0;
        if (ls9Var != null) {
            ls9Var.updateColors();
        }
        if (this.L0 != null) {
            int o = bm2.o(getThemedColor(bkb.c6), 100);
            boolean z = this.L0.getForeground() instanceof ColorDrawable;
            sb sbVar = this.L0;
            if (!z) {
                sbVar.setForeground(new ColorDrawable(o));
            } else if (((ColorDrawable) sbVar.getForeground()).getColor() != o) {
                ((ColorDrawable) this.L0.getForeground()).setColor(o);
            }
        }
        un4 un4Var = this.u0;
        if (un4Var != null) {
            un4Var.updateColors();
        }
        un4 un4Var2 = this.v0;
        if (un4Var2 != null) {
            un4Var2.updateColors();
        }
        int i4 = bkb.c6;
        this.r4.a(getThemedColor(i4));
        fj3 fj3Var = this.L1;
        if (fj3Var != null) {
            fj3Var.updateColors();
        }
        ej3 ej3Var = this.M1;
        if (ej3Var != null) {
            ej3Var.setColor(bkb.w0(null, i4, false));
        }
        fh3 fh3Var = this.J1;
        if (fh3Var != null) {
            fh3Var.updateColors();
        }
        fh3 fh3Var2 = this.H1;
        if (fh3Var2 != null) {
            fh3Var2.updateColors();
        }
        t5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        oh3 oh3Var = this.F0;
        if (oh3Var != null) {
            oh3Var.o();
        }
        if (this.E3 != null && (themedColor = getThemedColor(bkb.Wl)) != this.A4) {
            this.A4 = themedColor;
            this.E3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        pi3 pi3Var = this.Y;
        if (pi3Var != null) {
            pi3Var.updateColors();
        }
    }

    public final boolean F3(TLRPC.Dialog dialog) {
        if (dialog != null) {
            int i = this.f0[0].s;
            t97 t97Var = null;
            if ((i == 7 || i == 8) && (!this.actionBar.y() || this.actionBar.z(null))) {
                t97Var = getMessagesController().N[this.f0[0].s == 8 ? (char) 1 : (char) 0];
            }
            if (t97Var == null) {
                return dialog.pinned;
            }
            if (t97Var.j.indexOfKey(dialog.id) >= 0) {
                return true;
            }
        }
        return false;
    }

    public final void F4(int i, long j, TLRPC.Chat chat, boolean z, boolean z2) {
        if (i == 103) {
            getMessagesController().T(1, j, z2);
            return;
        }
        if (chat == null) {
            getMessagesController().T(0, j, z2);
            if (z && z2) {
                getMessagesController().t(j);
            }
        } else if (hc2.r0(chat)) {
            getMessagesController().T(0, j, z2);
        } else {
            getMessagesController().c0(-j, getMessagesController().V1(Long.valueOf(getUserConfig().e())), null, z2, false);
        }
        if (gl.O1()) {
            getNotificationCenter().k(kk7.s, Long.valueOf(j));
        }
        getMessagesController().F(this.Y2);
    }

    public final void G2() {
        gl.e3(new sg3(this, (byte) 13), 300L);
    }

    public final boolean G3(int i) {
        if (i == 0) {
            return C3();
        }
        if ((i == 7 || i == 8) && this.T0 == 0) {
            if (getMessagesController().q2(getMessagesController().N[i == 8 ? (char) 1 : (char) 0])) {
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void G4(java.util.ArrayList r43, int r44, boolean r45, boolean r46, java.util.HashSet r47) {
        /*
            Method dump skipped, instructions count: 2699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj3.G4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final boolean H2(bj3 bj3Var) {
        if (this.H3.c()) {
            return false;
        }
        int i = (int) (-this.O);
        int o3 = o3();
        int p3 = p3();
        if (i == 0 || i == o3 || i == p3 || !bj3Var.a.canScrollVertically(-1)) {
            return false;
        }
        if (p3 >= i || i >= o3) {
            float i2 = this.w3 != 1.0f ? Utilities.i((-this.O) / gl.L(81.0f), 1.0f, 0.0f) : 1.0f;
            float f = this.F0.C0;
            kp kpVar = bj3Var.b;
            if (i2 < f) {
                kpVar.y(-i);
                return true;
            }
            kpVar.y(p3 - i);
            return true;
        }
        int L = gl.L(48.0f);
        int i3 = i - p3;
        int i4 = L / 2;
        kp kpVar2 = bj3Var.b;
        if (i3 < i4) {
            kpVar2.y(-i3);
            return true;
        }
        kpVar2.y(L - i3);
        return true;
    }

    public final boolean H3() {
        return this.E2 == null && this.p2 == null;
    }

    public final void H4(long j, boolean z, t97 t97Var, int i, boolean z2) {
        boolean z3;
        int i2;
        boolean C3;
        int i3 = 0;
        int i4 = (this.f0[0].s == 0 && w3() && this.f0[0].w == 2) ? 1 : 0;
        int K0 = this.f0[0].c.K0();
        if (t97Var != null) {
            int i5 = t97Var.j.get(j, TLObject.FLAG_31);
            if (!z && i5 == Integer.MIN_VALUE) {
                return;
            }
        }
        int i6 = -1;
        if (K0 > i4 || !z2) {
            z3 = true;
        } else {
            Q4(true, true);
            G2();
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
        if (t97Var != null) {
            LongSparseIntArray longSparseIntArray = t97Var.j;
            if (z) {
                longSparseIntArray.put(j, i);
            } else {
                longSparseIntArray.delete(j);
            }
            if (z2) {
                getMessagesController().x3(t97Var);
            }
            C3 = true;
        } else {
            C3 = getMessagesController().C3(j, z, null, -1L);
        }
        if (C3) {
            if (z3) {
                if (this.T0 != 10) {
                    z3(false);
                }
                N4(true, false);
            } else {
                ArrayList m3 = m3(this.currentAccount, this.f0[0].s, this.Y2, false);
                int i8 = 0;
                while (true) {
                    if (i8 >= m3.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) m3.get(i8)).id == j) {
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
                bj3 bj3Var = this.f0[0];
                ah3 ah3Var = bj3Var.c;
                if (bj3Var.s == 0 && w3() && this.f0[0].w == 2) {
                    i3 = 1;
                }
                ah3Var.g1(i3, (int) this.O);
                return;
            }
            if (i6 >= 0 && i2 == i6) {
                gl.e3(new wf3(this, (byte) 21), 200L);
                return;
            }
        }
        Q4(false, true);
    }

    public final boolean I2(long j) {
        int i;
        int i2 = this.T0;
        if (i2 == 15 || i2 == 16 || this.j2 != null || !this.u2) {
            return true;
        }
        if (!cf3.y(j)) {
            if (!cf3.B(j)) {
                return true;
            }
            if (this.V0 == 0 && !this.W0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131745404, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            int i3 = this.V0;
            if (i3 == 3) {
                hdVar.U = k96.M0(2131743849, null);
            } else if (i3 != 0) {
                hdVar.U = k96.M0(2131746983, null);
            } else {
                hdVar.U = k96.M0(2131748912, null);
            }
            alertDialog$Builder.g(k96.M0(2131747638, null), null);
            showDialog(hdVar);
            return false;
        }
        long j2 = -j;
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(j2));
        if (!hc2.T(K0) || K0.megagroup) {
            return true;
        }
        if (!this.s2) {
            TLRPC.Chat K02 = na7.q1(this.currentAccount).K0(Long.valueOf(j2));
            if ((hc2.n(K02) || K02.megagroup) && (i = this.V0) != 2 && i != 3) {
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String M02 = k96.M0(2131745404, null);
        hd hdVar2 = alertDialog$Builder2.a;
        hdVar2.S = M02;
        int i4 = this.V0;
        if (i4 == 3) {
            hdVar2.U = k96.M0(2131743850, null);
        } else if (i4 == 2) {
            hdVar2.U = k96.M0(2131746394, null);
        } else {
            hdVar2.U = k96.M0(2131752428, null);
        }
        alertDialog$Builder2.g(k96.M0(2131747638, null), null);
        showDialog(hdVar2);
        return false;
    }

    public final boolean I3(bj3 bj3Var) {
        return bj3Var != null && G3(bj3Var.s);
    }

    public final void I4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(bkb.c6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / kk7.J2));
        this.L0.setBackground(new BitmapDrawable(createBitmap));
        this.L0.setAlpha(0.0f);
        this.L0.setVisibility(0);
        V2();
    }

    public final void J2(boolean z) {
        rn2 rn2Var;
        TLRPC.ChatFull chatFull;
        fj3 fj3Var = this.L1;
        if (fj3Var == null || (rn2Var = this.S1) == null || (chatFull = this.c3) == null) {
            return;
        }
        fj3Var.j(rn2Var, (this.a3 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z);
        this.S1.setTitle(k96.G(this.c3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
    }

    public final void J3() {
        t11 t11Var = new t11(getParentActivity(), this.resourceProvider);
        t11Var.d(R.raw.email_check_inbox, new String[0]);
        t11Var.b.setText(k96.M0(2131742548, null));
        m21.g(this, t11Var, 2750).j();
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void J4(boolean z) {
        bj3[] bj3VarArr = this.f0;
        if (bj3VarArr != null && !this.U1) {
            for (bj3 bj3Var : bj3VarArr) {
                if (bj3Var.getVisibility() == 0) {
                    if (z) {
                        yg3 yg3Var = bj3Var.y;
                        yg3Var.D();
                        yg3Var.A = true;
                    }
                    bj3Var.b(z);
                    K2(bj3Var);
                }
            }
        }
        qi3 qi3Var = this.A0;
        if (qi3Var == null || qi3Var.getVisibility() != 0) {
            return;
        }
        this.A0.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
    
        if (getMessagesController().U1.get(r14.Y2) != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K2(bj3 bj3Var) {
        final boolean z;
        final boolean z2;
        final boolean z3;
        final boolean z4;
        int i;
        int K0 = bj3Var.c.K0();
        int M0 = bj3Var.c.M0();
        if (this.j3 || this.o3) {
            return;
        }
        qi3 qi3Var = this.A0;
        if (qi3Var != null && qi3Var.getVisibility() == 0 && this.A0.P) {
            return;
        }
        int abs = Math.abs(M0 - K0) + 1;
        if (M0 != -1) {
            s49 K = bj3Var.a.K(M0);
            boolean z5 = K != null && K.f == 11;
            this.d2 = z5;
            if (z5) {
                z3(false);
            }
        } else {
            this.d2 = false;
        }
        int i2 = bj3Var.s;
        if (i2 == 7 || i2 == 8) {
            ArrayList R0 = getMessagesController().R0();
            int i3 = bj3Var.h;
            if (i3 >= 0 && i3 < R0.size()) {
                int i4 = ((t97) R0.get(bj3Var.h)).g;
                int i5 = na7.q5;
                if ((i4 & 128) == 0 && ((abs > 0 && M0 >= m3(this.currentAccount, bj3Var.s, 1, this.U1).size() - 10) || (abs == 0 && !getMessagesController().U1.get(1)))) {
                    boolean z6 = getMessagesController().U1.get(1);
                    boolean z7 = !z6;
                    z = (z6 && getMessagesController().V1.get(1)) ? false : true;
                    z2 = z7;
                    if (abs > 0 || M0 < m3(this.currentAccount, bj3Var.s, this.Y2, this.U1).size() - 10) {
                        if (abs == 0 && ((i = bj3Var.s) == 7 || i == 8 || I3(bj3Var))) {
                        }
                        z3 = false;
                        z4 = false;
                        if (!z3 || z) {
                            gl.d3(new Runnable() { // from class: rg3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cj3 cj3Var = cj3.this;
                                    if (z3) {
                                        cj3Var.getMessagesController().W2(cj3Var.Y2, -1, 100, z4, null);
                                    }
                                    if (z) {
                                        cj3Var.getMessagesController().W2(1, -1, 100, z2, null);
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
                            gl.d3(new Runnable() { // from class: rg3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cj3 cj3Var = cj3.this;
                                    if (z3) {
                                        cj3Var.getMessagesController().W2(cj3Var.Y2, -1, 100, z4, null);
                                    }
                                    if (z) {
                                        cj3Var.getMessagesController().W2(1, -1, 100, z2, null);
                                    }
                                }
                            });
                        }
                    }
                    z4 = z9;
                    z3 = true;
                    if (z3) {
                    }
                    gl.d3(new Runnable() { // from class: rg3
                        @Override // java.lang.Runnable
                        public final void run() {
                            cj3 cj3Var = cj3.this;
                            if (z3) {
                                cj3Var.getMessagesController().W2(cj3Var.Y2, -1, 100, z4, null);
                            }
                            if (z) {
                                cj3Var.getMessagesController().W2(1, -1, 100, z2, null);
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
        gl.d3(new Runnable() { // from class: rg3
            @Override // java.lang.Runnable
            public final void run() {
                cj3 cj3Var = cj3.this;
                if (z3) {
                    cj3Var.getMessagesController().W2(cj3Var.Y2, -1, 100, z4, null);
                }
                if (z) {
                    cj3Var.getMessagesController().W2(1, -1, 100, z2, null);
                }
            }
        });
    }

    public final void K3(int i) {
        Object obj;
        ht9 ht9Var = this.D0.r0;
        if (i < ht9Var.a0 || i >= ht9Var.b0) {
            obj = Boolean.FALSE;
        } else {
            c4c G = ht9Var.G(i);
            obj = G != null ? G.H : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
            String M0 = k96.M0(2131754177, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.a0(null, null, 2131754176, "\"" + l7c.q(user) + "\"");
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            alertDialog$Builder.j(k96.M0(2131746128, null), new v82((Object) this, (Object) user, (byte) 21));
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
        }
    }

    public final void K4(bj3 bj3Var) {
        int i;
        if (bj3Var.getVisibility() != 0) {
            return;
        }
        int i2 = bj3Var.d.w;
        if (bj3Var.s == 0 && w3() && bj3Var.a.getChildCount() == 0 && bj3Var.w == 2) {
            ((t26) bj3Var.a.getLayoutManager()).g1(1, (int) this.O);
        }
        bj3Var.d.getClass();
        bj3Var.d.Q();
        int b = bj3Var.d.b();
        if (b == 1 && i2 == 1 && bj3Var.d.d(0) == 5) {
            bj3Var.b(true);
        } else {
            bj3Var.b(false);
            if (b > i2 && (i = this.T0) != 11 && i != 12 && i != 13) {
                bj3Var.E.b(i2);
            }
        }
        try {
            bj3Var.a.setEmptyView((this.Y2 == 0 && this.a3 == 0) ? bj3Var.x : null);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        K2(bj3Var);
    }

    public final void L2() {
        getMessagesStorage().getClass();
    }

    public final void L3(bj3 bj3Var, View view, int i) {
        int i2;
        if (view instanceof l35) {
            return;
        }
        boolean z = view instanceof ue3;
        if (z) {
            ue3 ue3Var = (ue3) view;
            if (ue3Var.o2) {
                e5(ue3Var.getDialogId(), view);
                return;
            }
        }
        if (c3()) {
            z4(view, i, 0.0f, bj3Var.d);
            return;
        }
        int i3 = this.T0;
        if (i3 == 15 && (view instanceof wgb)) {
            bj3Var.d.L();
            return;
        }
        int i4 = 0;
        if ((i3 == 11 || i3 == 13) && i == 1) {
            Bundle l = ir2.l("forImport", true);
            l.putLongArray("result", new long[]{getUserConfig().e()});
            l.putInt("chatType", 4);
            String string = this.arguments.getString("importTitle");
            if (string != null) {
                l.putString("title", string);
            }
            wa5 wa5Var = new wa5(l);
            wa5Var.Z = new bh3(this);
            presentFragment(wa5Var);
            return;
        }
        if ((view instanceof dk3) && ((i2 = bj3Var.s) == 7 || i2 == 8)) {
            mj3 mj3Var = (mj3) bj3Var.d.N.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (mj3Var == null || mj3Var.a != 17) ? null : mj3Var.i;
            if (tL_chatlists_chatlistUpdates != null) {
                t97 t97Var = getMessagesController().N[bj3Var.s - 7];
                if (t97Var != null) {
                    int i5 = t97Var.a;
                    ll4 ll4Var = new ll4(this, false);
                    ll4Var.T1 = -1;
                    ll4Var.X1 = "";
                    ll4Var.Y1 = new ArrayList();
                    ll4Var.a2 = "";
                    ll4Var.c2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    ll4Var.d2 = arrayList;
                    ll4Var.u2 = -1;
                    ll4Var.x2 = -5;
                    ll4Var.T1 = i5;
                    ll4Var.V1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    ll4Var.b2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = getMessagesController().G0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                break;
                            }
                            if (((t97) arrayList2.get(i4)).a == i5) {
                                ll4Var.X1 = ((t97) arrayList2.get(i4)).b;
                                break;
                            }
                            i4++;
                        }
                    }
                    ll4Var.a1();
                    showDialog(ll4Var);
                    return;
                }
                return;
            }
        } else if (z && !this.actionBar.y() && !this.H3.c()) {
            ImageReceiver imageReceiver = ((ue3) view).Z1;
            gl.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        }
        y4(view, i, bj3Var.d);
    }

    public final void L4() {
        boolean z;
        if (this.O == 0.0f || (z = this.L)) {
            return;
        }
        float f = z ? -p3() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.I3, f));
        animatorSet.setInterpolator(s33.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void M2() {
        if (this.f0 == null) {
            return;
        }
        int D2 = D2();
        int i = 0;
        while (true) {
            bj3[] bj3VarArr = this.f0;
            if (i >= bj3VarArr.length) {
                return;
            }
            bj3 bj3Var = bj3VarArr[i];
            if (bj3Var != null) {
                yi3 yi3Var = bj3Var.a;
                yi3Var.setPadding(0, yi3Var.g3, 0, D2);
            }
            i++;
        }
    }

    public final void M3() {
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).w()) {
            finishPreviewFragment();
            return;
        }
        if (this.T0 != 10) {
            if (na7.q1(this.currentAccount).t2()) {
                h5.b(this.currentAccount);
                return;
            } else {
                presentFragment(new ContactsActivity(ir2.l("destroyAfterSelect", true)));
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
                arrayList2.add(zc7.a(((Long) arrayList.get(i)).longValue(), 0L));
            }
            this.E2.r(this, arrayList2, null, false, this.L2, this.M2, this.N2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M4(int i) {
        de4 de4Var;
        qi3 qi3Var = this.A0;
        if (qi3Var == null) {
            o5(true, true);
            qi3Var = this.A0;
            if (qi3Var == null) {
                return;
            }
        }
        int tabsCount = qi3Var.getTabsCount() - 1;
        ArrayList R0 = getMessagesController().R0();
        int i2 = 0;
        while (true) {
            if (i2 >= R0.size()) {
                break;
            }
            if (((t97) R0.get(i2)).a == i) {
                tabsCount = i2;
                break;
            }
            i2++;
        }
        qi3 qi3Var2 = this.A0;
        if (tabsCount < 0) {
            qi3Var2.getClass();
        } else if (tabsCount < qi3Var2.getTabsCount()) {
            de4Var = (de4) qi3Var2.h.get(tabsCount);
            if (de4Var != null) {
                qi3 qi3Var3 = this.A0;
                ArrayList arrayList = qi3Var3.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                qi3Var3.g((de4) b00.f(1, arrayList), arrayList.size() - 1);
                return;
            }
            bj3[] bj3VarArr = this.f0;
            if (bj3VarArr == null || bj3VarArr.length <= 0 || bj3VarArr[0].h != de4Var.a) {
                this.A0.g(de4Var, tabsCount);
                return;
            }
            return;
        }
        de4Var = null;
        if (de4Var != null) {
        }
    }

    public final void N2() {
        j92 j92Var = this.A1;
        if (j92Var != null) {
            j92Var.setBlurredBottomHeight(this.A1.getInputBubbleHeight() + this.w.d() + gl.L(9.0f) + gl.L(7.0f));
        }
    }

    public final void N3() {
        na7.q1(this.currentAccount).X3.edit().putBoolean("storyhint", false).commit();
    }

    public final void N4(boolean z, boolean z2) {
        rh3 rh3Var = this.H3;
        if (rh3Var == null || !rh3Var.c()) {
            int i = (this.f0[0].s == 0 && w3() && this.f0[0].w == 2) ? 1 : 0;
            int i2 = (!this.L || z2 || this.F0.g()) ? 0 : -gl.L(81.0f);
            bj3[] bj3VarArr = this.f0;
            if (!z) {
                bj3VarArr[0].c.g1(i, i2);
                L4();
            } else {
                cu6 cu6Var = bj3VarArr[0].r;
                cu6Var.b = 1;
                cu6Var.k(i, i2, false, false);
                L4();
            }
        }
    }

    public final void O2() {
        bj3 bj3Var;
        float n3 = n3(true);
        qi3 qi3Var = this.A0;
        if (qi3Var != null) {
            boolean z = qi3Var.getAlpha() != n3;
            float R1 = gl.R1(0.98f, 1.0f, n3);
            this.A0.setAlpha(n3);
            this.A0.setScaleX(R1);
            this.A0.setScaleY(R1);
            this.A0.setVisibility(n3 > 0.0f ? 0 : 8);
            if (z && (bj3Var = this.f0[0]) != null) {
                bj3Var.a.requestLayout();
            }
        }
        k5();
    }

    public final /* synthetic */ void O3(hd[] hdVarArr) {
        no2.e(hdVarArr, this, this.currentAccount, this.b3);
    }

    public final void O4(String str, boolean z) {
        g5(true, false, true, false);
        ys9 ys9Var = this.Z;
        if (ys9Var != null) {
            ys9Var.b(true);
        }
        pi3 pi3Var = this.Y;
        if (pi3Var != null) {
            pi3Var.r.setText(str);
            this.Y.r.setSelection(str.length());
        }
    }

    public final void P2() {
        float f = this.n.e;
        float R1 = gl.R1(0.2f, 1.0f, f);
        jh3 jh3Var = this.E1;
        if (jh3Var != null) {
            jh3Var.setScaleX(R1);
            this.E1.setScaleY(R1);
            this.E1.setAlpha(f);
            this.E1.setVisibility(f > 0.0f ? 0 : 8);
        }
        j92 j92Var = this.A1;
        if (j92Var != null) {
            j92Var.setAlpha(f);
            this.A1.setVisibility(f > 0.0f ? 0 : 8);
            this.A1.getFadeView().setAlpha(f);
            this.A1.getFadeView().setVisibility(f > 0.0f ? 0 : 8);
        }
    }

    public final void P3(hd hdVar, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (tLObject == null) {
            ij.c0(this.currentAccount, tL_error, this, tL_messages_checkHistoryImportPeer, new Object[0]);
            getNotificationCenter().k(kk7.u1, Long.valueOf(j), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        this.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        et etVar = new et((Object) this, j, (byte) 14);
        Pattern pattern = ij.a;
        if (getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = getCurrentAccount();
            Activity parentActivity = getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long e2 = y6c.h(currentAccount).e();
            TextView textView = new TextView(parentActivity);
            zkb.X(textView, bkb.i5, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((k96.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.n(frameLayout);
            pb0 pb0Var = new pb0((wjb) null);
            pb0Var.s(gl.L(12.0f));
            be0 be0Var = new be0(parentActivity);
            be0Var.setRoundRadius(gl.L(20.0f));
            frameLayout.addView(be0Var, nme.d(40, 40.0f, (k96.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            tb4.w(textView2, bkb.D8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((k96.a0 ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(k96.M0(2131749053, null));
            boolean z = k96.a0;
            frameLayout.addView(textView2, nme.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 76, 11.0f, z ? 76 : 21, 0.0f));
            frameLayout.addView(textView, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                pb0Var.p(chat);
                be0Var.f(chat, pb0Var);
            } else if (l7c.A(user)) {
                pb0Var.p = 0.8f;
                pb0Var.f(12);
                be0Var.m(null, null, pb0Var, user);
            } else if (user.id == e2) {
                pb0Var.p = 0.8f;
                pb0Var.f(1);
                be0Var.m(null, null, pb0Var, user);
            } else {
                pb0Var.p = 1.0f;
                pb0Var.q(user);
                be0Var.f(user, pb0Var);
            }
            textView.setText(gl.T2(str));
            alertDialog$Builder.j(k96.M0(2131749073, null), new l0(etVar, (byte) 10));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            showDialog(alertDialog$Builder.a);
        }
    }

    public final void P4(float f) {
        this.d0 = f;
        for (bj3 bj3Var : this.f0) {
            yi3 yi3Var = bj3Var.a;
            for (int i = 0; i < yi3Var.getChildCount(); i++) {
                View childAt = yi3Var.getChildAt(i);
                if (childAt != null && RecyclerView.R(childAt) >= bj3Var.d.f + 1) {
                    childAt.setAlpha(f);
                }
            }
        }
    }

    public final void Q2() {
        if (this.actionBar == null) {
            return;
        }
        float f = 1.0f - this.b.e;
        float r3 = 1.0f - r3();
        un4.d(this.actionBar.getBackButton(), Math.max(this.w3, f * r3 * (1.0f - this.c.e)));
    }

    public final /* synthetic */ void Q3(float f, ValueAnimator valueAnimator) {
        this.f0[0].setTranslationY((1.0f - this.w3) * f);
        this.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.w3);
            }
        }
        Y2();
        Q2();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void Q4(boolean z, boolean z2) {
        if (this.f0 == null || this.U1 == z) {
            return;
        }
        if (z) {
            this.T1 = new ArrayList(m3(this.currentAccount, this.f0[0].s, this.Y2, false));
        } else {
            this.T1 = null;
        }
        this.U1 = z;
        bj3 bj3Var = this.f0[0];
        bj3Var.d.H = z;
        if (z || !z2) {
            return;
        }
        boolean d0 = bj3Var.a.d0();
        bj3[] bj3VarArr = this.f0;
        if (d0) {
            bj3VarArr[0].a.post(new sg3(this, (byte) 5));
        } else {
            bj3VarArr[0].d.f();
        }
    }

    public final void R2() {
        un4.d(this.h0, yjb.C(this.j0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - r3(), 1.0f - this.c.e));
    }

    public final /* synthetic */ void R3() {
        if (this.f0 == null) {
            return;
        }
        if (this.U1 || this.isPaused) {
            this.Q3 = true;
            return;
        }
        this.Q3 = false;
        getMessagesController().Y4(null);
        J4(false);
    }

    public final void R4(boolean z) {
        bj3 bj3Var;
        if (gba.o() <= 1 || !e66.e(32768)) {
            return;
        }
        bj3[] bj3VarArr = this.f0;
        if (z) {
            if (bj3VarArr != null && (bj3Var = bj3VarArr[0]) != null) {
                bj3Var.setLayerType(2, null);
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
        if (bj3VarArr != null) {
            int i = 0;
            while (true) {
                bj3[] bj3VarArr2 = this.f0;
                if (i >= bj3VarArr2.length) {
                    break;
                }
                bj3 bj3Var2 = bj3VarArr2[i];
                if (bj3Var2 != null) {
                    bj3Var2.setLayerType(0, null);
                    bj3Var2.setClipChildren(true);
                    bj3Var2.setClipToPadding(true);
                    bj3Var2.a.setClipChildren(true);
                }
                i++;
            }
        }
        a aVar2 = this.actionBar;
        if (aVar2 != null) {
            aVar2.setLayerType(0, null);
        }
        oh3 oh3Var = this.F0;
        if (oh3Var != null) {
            oh3Var.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void S2() {
        un4.d(this.g0, yjb.C(gba.r.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - r3(), 1.0f - this.c.e));
    }

    public final void S3(int i, cs5 cs5Var) {
        if (this.currentAccount != i) {
            cs5Var.u();
            if (getParentActivity() == null) {
                return;
            }
            wi3 wi3Var = this.E2;
            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
            ArrayList arrayList = this.F2;
            String str = this.G2;
            CharSequence charSequence = this.H2;
            hh3 hh3Var = this.D1;
            CharSequence fieldText = hh3Var != null ? hh3Var.getFieldText() : null;
            launchActivity.N0(i);
            cj3 cj3Var = new cj3(this.arguments);
            cj3Var.E2 = wi3Var;
            if (arrayList == null || arrayList.isEmpty()) {
                if (str != null) {
                    cj3Var.U4(fieldText, str);
                } else if (charSequence != null) {
                    if (charSequence.length() == 0) {
                        cj3Var.H2 = null;
                    } else {
                        cj3Var.H2 = charSequence;
                        cj3Var.G2 = null;
                        cj3Var.F2 = null;
                        if (cj3Var.D1 != null) {
                            cj3Var.B2(fieldText);
                        } else {
                            cj3Var.Z3 = fieldText;
                        }
                    }
                }
            } else if (arrayList.isEmpty()) {
                cj3Var.F2 = null;
            } else {
                cj3Var.F2 = arrayList;
                cj3Var.G2 = null;
                cj3Var.O2 = false;
                if (cj3Var.D1 != null) {
                    cj3Var.B2(fieldText);
                } else {
                    cj3Var.Z3 = fieldText;
                }
            }
            launchActivity.u0(cj3Var, false, true);
        }
    }

    public final void S4(float f) {
        bj3[] bj3VarArr = this.f0;
        if (bj3VarArr != null) {
            int paddingTop = bj3VarArr[0].a.getPaddingTop() + ((int) f);
            int i = 0;
            while (true) {
                bj3[] bj3VarArr2 = this.f0;
                if (i >= bj3VarArr2.length) {
                    break;
                }
                bj3VarArr2[i].a.setTopGlowOffset(paddingTop);
                i++;
            }
        }
        if (this.fragmentView == null || f == this.O) {
            return;
        }
        this.O = f;
        m21 m21Var = this.q3;
        if (m21Var != null) {
            m21Var.l();
        }
        if (this.G3 != null) {
            float currentActionBarHeight = 1.0f - ((-f) / a.getCurrentActionBarHeight());
            ym ymVar = this.G3;
            float f2 = (int) f;
            float f3 = ymVar.f;
            ymVar.h = f2;
            ymVar.setTranslationY(f3 + f2);
            this.G3.setAlpha(moe.a(currentActionBarHeight, 0.0f, 1.0f));
            this.G3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        Y2();
        this.fragmentView.invalidate();
    }

    public final void T2() {
        un4.d(this.k0, yjb.C(this.T0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - r3(), 1.0f - this.c.e));
        oh3 oh3Var = this.F0;
        if (oh3Var != null) {
            oh3Var.invalidate();
        }
    }

    public final /* synthetic */ void T3() {
        na7.q1(this.currentAccount).h0(null);
    }

    public final void T4(float f) {
        this.z1 = f;
        t5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (gba.o() != 0) {
            e66.e(32768);
        }
        k5();
    }

    public final void U2() {
        un4.d(this.m0, yjb.C(this.b.e, 1.0f - r3(), 1.0f - this.c.e, this.d.e));
    }

    public final /* synthetic */ void U3() {
        if (this.f4.g()) {
            na7.q1(this.currentAccount).m4(0L, "USERPIC_SETUP");
            m5();
        }
    }

    public final void U4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.G2 = null;
            this.H2 = null;
            return;
        }
        this.G2 = str;
        this.H2 = null;
        this.F2 = null;
        if (this.D1 != null) {
            B2(charSequence);
        } else {
            this.Z3 = charSequence;
        }
    }

    public final void V2() {
        sb sbVar;
        boolean z = !this.l2 && ((sbVar = this.L0) == null || sbVar.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8);
        s34 s34Var = this.K3;
        if (s34Var != null) {
            ((ah6) s34Var.b).w.a(z, true);
        }
    }

    public final void V3(int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        if (i != 102) {
            G4(arrayList, i, false, false, null);
            return;
        }
        getMessagesController().j0 = true;
        G4(arrayList, i, false, false, z ? hashSet : null);
        na7 messagesController = getMessagesController();
        messagesController.j0 = false;
        messagesController.getNotificationCenter().k(kk7.r, Boolean.TRUE);
        getMessagesController().F(this.Y2);
        int i2 = this.Y2;
        if (i2 == 0 || m3(this.currentAccount, this.f0[0].s, i2, false).size() != 0) {
            return;
        }
        this.f0[0].a.setEmptyView(null);
        this.f0[0].x.setVisibility(4);
        finishFragment();
    }

    public final void V4(float f) {
        if (gba.o() <= 0) {
            boolean z = w01.a;
            return;
        }
        if (this.b4 != f) {
            boolean z2 = true;
            if (gba.o() > 1 && e66.e(32768)) {
                z2 = false;
            }
            this.c4 = z2;
            this.b4 = f;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.c4) {
                float f2 = (1.0f - this.b4) * (-gl.L(40.0f));
                oh3 oh3Var = this.F0;
                if (oh3Var != null) {
                    oh3Var.setTranslationX(f2);
                }
                pi3 pi3Var = this.Y;
                if (pi3Var != null) {
                    pi3Var.setTranslationX(f2);
                }
                rh3 rh3Var = this.H3;
                if (rh3Var == null || rh3Var.getFragmentView() == null || this.E) {
                    return;
                }
                this.H3.getFragmentView().setTranslationX(f2);
                return;
            }
            float f3 = -gl.L(4.0f);
            float f4 = 1.0f - this.b4;
            float f5 = f3 * f4;
            float f6 = 1.0f - (f4 * 0.05f);
            oh3 oh3Var2 = this.F0;
            if (oh3Var2 != null) {
                oh3Var2.setScaleX(f6);
                this.F0.setScaleY(f6);
                this.F0.setTranslationX(f5);
                this.F0.setPivotX(0.0f);
                this.F0.setPivotY(0.0f);
            }
            pi3 pi3Var2 = this.Y;
            if (pi3Var2 != null) {
                pi3Var2.setTranslationX(f5);
                this.Y.setScaleX(f6);
                this.Y.setScaleY(f6);
            }
            rh3 rh3Var2 = this.H3;
            if (rh3Var2 == null || rh3Var2.getFragmentView() == null) {
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

    @Override // org.telegram.ui.ActionBar.d, zg6
    public final boolean W(MotionEvent motionEvent, boolean z) {
        rh3 rh3Var;
        sb sbVar;
        qi3 qi3Var;
        if (!this.s3 && (((rh3Var = this.H3) == null || !rh3Var.c()) && (((sbVar = this.L0) == null || sbVar.getVisibility() != 0) && ((qi3Var = this.A0) == null || !qi3Var.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                qi3 qi3Var2 = this.A0;
                boolean z2 = qi3Var2 == null || qi3Var2.getTabsCount() < 2 || this.A0.getCurrentTabId() == this.A0.getFirstTabId();
                qi3 qi3Var3 = this.A0;
                boolean z3 = qi3Var3 == null || qi3Var3.getTabsCount() < 2 || this.A0.getCurrentTabId() == this.A0.getLastTabId();
                gba.m(this.currentAccount);
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

    public final void W2() {
        Q2();
        un4.d(this.l0, (1.0f - this.b.e) * (1.0f - r3()) * (1.0f - this.c.e));
        R2();
        U2();
        S2();
        T2();
    }

    public final void W3(final int i, final long j, TLRPC.Chat chat, final boolean z, final boolean z2) {
        final TLRPC.Chat chat2;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        y3(false);
        if (i == 103 && hc2.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || hc2.t0(chat2)) {
                getMessagesController().T(2, j, z2);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i == 102 && (i4 = this.Y2) != 0 && m3(this.currentAccount, this.f0[0].s, i4, false).size() == 1) {
            this.f0[0].x.setVisibility(4);
        }
        int i5 = -1;
        if (i == 102) {
            Q4(true, true);
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
            G2();
            i2 = i3;
        } else {
            i2 = -1;
        }
        UndoView u3 = u3();
        if (u3 != null) {
            u3.j(i == 103 ? 0 : z2 ? 1 : 95, j, new Runnable() { // from class: ng3
                @Override // java.lang.Runnable
                public final void run() {
                    cj3.this.F4(i, j, chat2, z, z2);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(m3(this.currentAccount, this.f0[0].s, this.Y2, false));
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
                Q4(false, true);
                return;
            }
            arrayList.remove(i2);
            this.f0[0].y.D();
            this.f0[0].b(true);
        }
    }

    public final void W4(bj3 bj3Var, float f) {
        if (this.U != f) {
            this.U = f;
            if (f == 0.0f) {
                this.V = false;
            }
            this.F0.setOverscroll(f);
            bj3Var.a.setViewsOffset(f);
            bj3Var.a.setOverScrollMode(f != 0.0f ? 2 : 0);
            this.fragmentView.invalidate();
            if (f <= gl.L(90.0f) || this.V) {
                return;
            }
            oh3 oh3Var = this.F0;
            ValueAnimator valueAnimator = oh3Var.I0;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                oh3Var.i(oh3Var.q0, true);
                this.V = true;
                getOrCreateStoryViewer().s(new wf3(this, (byte) 12));
            }
        }
    }

    public final void X2() {
        String M0 = k96.M0(r3() > 0.5f ? 2131745514 : 2131745621, null);
        this.Y.r.setContentDescription(M0);
        this.Y.r.setHint(M0);
    }

    public final /* synthetic */ void X3() {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", y6c.h(this.currentAccount).e());
        presentFragment(new mu1(bundle));
    }

    public final void X4() {
        getContactsController().B();
        yr yrVar = new yr(getParentActivity(), this.currentAccount, getResourceProvider(), new wc3(this, r1, (byte) 3), new mk2(r1, (byte) 24));
        fx0 i = ug8.i(getParentActivity(), false, 1, getResourceProvider());
        i.O = yrVar;
        i.U0 = (byte) 49;
        i.show();
        fx0[] fx0VarArr = {i};
        i.M(bkb.g5);
    }

    public final void Y2() {
        if (this.Y == null) {
            return;
        }
        float a = 1.0f - moe.a(((-this.O) - p3()) / gl.L(48.0f), 0.0f, 1.0f);
        float max = (this.T0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.w3, this.h.e)) * Math.max(this.b.e, (1.0f - r3()) * a);
        this.Y.setAlpha(max);
        this.Y.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final void Y3(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        hq6 d0 = hq6.d0(this.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
        if (tL_attachMenuBots != null) {
            d0.getMessagesStorage().a.c(new o57((Object) d0, (Object) tL_attachMenuBots, d0.a, d0.e, (byte) 7));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        if ((r25.size() + r11.h.size()) > 100) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y4(ue3 ue3Var) {
        long j;
        int b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        boolean z;
        boolean z2;
        int i;
        ViewGroup viewGroup;
        cj3 cj3Var;
        char c;
        long j2;
        t97 t97Var;
        boolean[] zArr;
        ?? r5;
        cj3 cj3Var2;
        long j3;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        final long j4;
        int i6;
        int i7;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        LinearLayout linearLayout;
        a8 a8Var;
        boolean z5;
        boolean z6;
        zh3 zh3Var;
        final cj3 cj3Var3 = this;
        int i8 = kk7.s;
        boolean Y = hc2.Y(ue3Var.h2);
        byte b2 = 0;
        if (!ue3Var.X()) {
            long dialogId = ue3Var.getDialogId();
            Bundle bundle = new Bundle();
            int messageId = ue3Var.getMessageId();
            if (!cf3.B(dialogId)) {
                if (cf3.D(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else if (cj3Var3.a3 == 0 || ((b = no2.b(cj3Var3.currentAccount, dialogId)) != 4 && b != 3)) {
                    TLRPC.Chat K0 = cj3Var3.getMessagesController().K0(Long.valueOf(-dialogId));
                    if (messageId == 0 || K0 == null || K0.migrated_to == null) {
                        j = dialogId;
                    } else {
                        bundle.putLong("migrated_to", dialogId);
                        j = -K0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -j);
                }
                if (messageId != 0) {
                    bundle.putInt("message_id", messageId);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                boolean z7 = cj3Var3.a3 == 0 && cj3Var3.getMessagesController().k4.H0.f && cj3Var3.getMessagesController().L0 && cj3Var3.getMessagesController().G0 != null && cj3Var3.getMessagesController().G0.size() > 0;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
                if (z7) {
                    LinearLayout linearLayout2 = new LinearLayout(cj3Var3.getParentActivity());
                    linearLayout2.setOrientation(1);
                    zh3 zh3Var2 = new zh3(cj3Var3.getParentActivity(), b2);
                    LinearLayout linearLayout3 = new LinearLayout(cj3Var3.getParentActivity());
                    linearLayout3.setOrientation(1);
                    zh3Var2.addView(linearLayout3);
                    int size = cj3Var3.getMessagesController().G0.size();
                    int i9 = 0;
                    a8 a8Var2 = null;
                    while (i9 < size) {
                        final t97 t97Var2 = (t97) cj3Var3.getMessagesController().G0.get(i9);
                        if (t97Var2.d()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            j4 = dialogId;
                        } else {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            final boolean a = t97Var2.a(j5.a(cj3Var3.currentAccount), dialogId);
                            j4 = dialogId;
                            final ArrayList D0 = cf4.D0(cj3Var3, t97Var2, arrayList2, true, false);
                            if (!a) {
                            }
                            a8 a8Var3 = new a8(2, null, cj3Var3.getParentActivity(), false, false);
                            a8Var3.setChecked(a);
                            i6 = size;
                            zh3 zh3Var3 = zh3Var2;
                            Spannable A5 = k27.A5(vu3.m(t97Var2.b, a8Var3.getTextView().getPaint().getFontMetricsInt(), false, null, 0), t97Var2.c, a8Var3.getTextView().getPaint().getFontMetricsInt(), false);
                            a8Var3.setEmojiCacheType(t97Var2.n ? 26 : 0);
                            a8Var3.j(A5, 0, new za2(cj3Var3.getParentActivity(), R.drawable.msg_folders, t97Var2.m));
                            a8Var3.getTextView().setEmojiColor(cj3Var3.getThemedColor(bkb.Ei));
                            a8Var3.setMinimumWidth(kk7.p2);
                            i7 = i9;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                            linearLayout = linearLayout2;
                            a8Var = a8Var3;
                            z5 = z7;
                            z6 = Y;
                            zh3Var = zh3Var3;
                            dialogId = j4;
                            a8Var.setOnClickListener(new View.OnClickListener() { // from class: fg3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArrayList arrayList3;
                                    long j5;
                                    t97 t97Var3 = t97Var2;
                                    LongSparseIntArray longSparseIntArray = t97Var3.j;
                                    cj3 cj3Var4 = cj3.this;
                                    boolean z8 = a;
                                    ArrayList arrayList4 = D0;
                                    long j6 = j4;
                                    if (z8) {
                                        t97Var3.h.remove(Long.valueOf(j6));
                                        t97Var3.i.add(Long.valueOf(j6));
                                        pd4.y0(t97Var3, t97Var3.g, t97Var3.b, t97Var3.c, t97Var3.n, t97Var3.m, t97Var3.h, t97Var3.i, longSparseIntArray, false, false, true, true, false, cj3Var4, null);
                                        cj3Var4.u3().k(j6, 21, Integer.valueOf(arrayList4.size()), t97Var3, null, null);
                                    } else {
                                        if (arrayList4.isEmpty()) {
                                            arrayList3 = arrayList4;
                                            j5 = j6;
                                        } else {
                                            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                                                t97Var3.i.remove(arrayList4.get(i10));
                                            }
                                            t97Var3.h.addAll(arrayList4);
                                            j5 = j6;
                                            arrayList3 = arrayList4;
                                            pd4.y0(t97Var3, t97Var3.g, t97Var3.b, t97Var3.c, t97Var3.n, t97Var3.m, t97Var3.h, t97Var3.i, longSparseIntArray, false, false, true, true, false, cj3Var4, null);
                                            t97Var3 = t97Var3;
                                        }
                                        cj3Var4.u3().k(j5, 20, Integer.valueOf(arrayList3.size()), t97Var3, null, null);
                                    }
                                    cj3Var4.y3(true);
                                    cj3Var4.finishPreviewFragment();
                                }
                            });
                            linearLayout3.addView(a8Var);
                            cj3Var3 = this;
                            zh3Var2 = zh3Var;
                            linearLayout2 = linearLayout;
                            Y = z6;
                            size = i6;
                            z7 = z5;
                            a8Var2 = a8Var;
                            i9 = i7 + 1;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                        }
                        linearLayout = linearLayout2;
                        z6 = Y;
                        i7 = i9;
                        a8Var = a8Var2;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                        dialogId = j4;
                        i6 = size;
                        zh3Var = zh3Var2;
                        z5 = z7;
                        cj3Var3 = this;
                        zh3Var2 = zh3Var;
                        linearLayout2 = linearLayout;
                        Y = z6;
                        size = i6;
                        z7 = z5;
                        a8Var2 = a8Var;
                        i9 = i7 + 1;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    ViewGroup viewGroup2 = linearLayout2;
                    z = Y;
                    z2 = z7;
                    a8 a8Var4 = a8Var2;
                    i = kk7.p2;
                    View view = zh3Var2;
                    if (a8Var4 != null) {
                        a8Var4.m(false, true);
                    }
                    if (linearLayout3.getChildCount() <= 0) {
                        viewGroup = viewGroup2;
                        z2 = false;
                    } else {
                        View j8Var = new j8(bkb.G8, getResourceProvider(), getParentActivity());
                        j8Var.setTag(R.id.fit_width_tag, 1);
                        a8 a8Var5 = new a8(getParentActivity(), true, false);
                        a8Var5.j(k96.M0(2131753753, null), R.drawable.ic_ab_back, null);
                        a8Var5.setMinimumWidth(kk7.p2);
                        a8Var5.setOnClickListener(new x91(actionBarPopupWindow$ActionBarPopupWindowLayoutArr, (byte) 28));
                        viewGroup2.addView(a8Var5);
                        viewGroup2.addView(j8Var, nme.o(-1, 8));
                        viewGroup2.addView(view);
                        viewGroup = viewGroup2;
                    }
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    z = Y;
                    z2 = z7;
                    i = kk7.p2;
                    viewGroup = null;
                }
                d[] dVarArr = new d[1];
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z2 ? 3 : 2, getResourceProvider(), getParentActivity());
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
                if (z2) {
                    int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(viewGroup)};
                    a8 a8Var6 = new a8(getParentActivity(), true, false);
                    a8Var6.j(k96.M0(2131750800, null), R.drawable.msg_addfolder, null);
                    a8Var6.setMinimumWidth(i);
                    a8Var6.setOnClickListener(new xf3((Object) actionBarPopupWindow$ActionBarPopupWindowLayoutArr, (Object) iArr, (byte) 1));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(a8Var6);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new vu2(dVarArr, (byte) 21));
                }
                if (z) {
                    cj3Var = this;
                    c = 0;
                } else {
                    a8 a8Var7 = new a8(getParentActivity(), !z2, false);
                    if (ue3Var.getHasUnread()) {
                        a8Var7.j(k96.M0(2131748489, null), R.drawable.msg_markread, null);
                    } else {
                        a8Var7.j(k96.M0(2131748488, null), R.drawable.msg_markunread, null);
                    }
                    a8Var7.setMinimumWidth(i);
                    cj3Var = this;
                    long j5 = dialogId;
                    dialogId = j5;
                    a8Var7.setOnClickListener(new fg(cj3Var, ue3Var, j5, (byte) 3));
                    c = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(a8Var7);
                }
                boolean[] zArr2 = new boolean[1];
                zArr2[c] = true;
                TLRPC.Dialog dialog = (TLRPC.Dialog) cj3Var.getMessagesController().R.f(dialogId);
                int i10 = cj3Var.f0[c].s;
                boolean z8 = (i10 == 7 || i10 == 8) && (!cj3Var.actionBar.y() || cj3Var.actionBar.z(null));
                if (z8) {
                    j2 = dialogId;
                    t97Var = cj3Var.getMessagesController().N[cj3Var.f0[0].s == 8 ? (char) 1 : (char) 0];
                } else {
                    j2 = dialogId;
                    t97Var = null;
                }
                if (cj3Var.F3(dialog)) {
                    zArr = zArr2;
                    r5 = 0;
                } else {
                    ArrayList U0 = cj3Var.getMessagesController().U0(cj3Var.Y2);
                    int size2 = U0.size();
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            zArr = zArr2;
                            z4 = z8;
                            break;
                        }
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) U0.get(i11);
                        if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                            arrayList = U0;
                            if (!cj3Var.F3(dialog2)) {
                                zArr = zArr2;
                                z4 = z8;
                                if (!cj3Var.getMessagesController().B2(dialog2.id, false)) {
                                    break;
                                }
                                i11++;
                                U0 = arrayList;
                                zArr2 = zArr;
                                z8 = z4;
                            } else {
                                zArr = zArr2;
                                if (cf3.B(dialog2.id)) {
                                    i13++;
                                } else {
                                    i12++;
                                }
                            }
                        } else {
                            arrayList = U0;
                            zArr = zArr2;
                        }
                        z4 = z8;
                        i11++;
                        U0 = arrayList;
                        zArr2 = zArr;
                        z8 = z4;
                    }
                    if (dialog == null || cj3Var.F3(dialog)) {
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                    } else {
                        boolean B = cf3.B(j2);
                        int i14 = !B ? 1 : 0;
                        if (t97Var == null || !t97Var.h.contains(Long.valueOf(j2))) {
                            i5 = i14;
                            i4 = B ? 1 : 0;
                            i3 = 0;
                        } else {
                            i5 = i14;
                            i4 = B ? 1 : 0;
                            i3 = 1;
                        }
                    }
                    int f = (!z4 || t97Var == null) ? (cj3Var.Y2 == 0 && t97Var == null) ? cj3Var.getUserConfig().p() ? cj3Var.getMessagesController().k4.Y0.f() : cj3Var.getMessagesController().k4.X0.f() : cj3Var.getUserConfig().p() ? cj3Var.getMessagesController().e3 : cj3Var.getMessagesController().d3 : 100 - t97Var.h.size();
                    boolean z9 = i4 + i13 <= f && (i5 + i12) - i3 <= f;
                    r5 = 0;
                    zArr[0] = z9;
                }
                if (zArr[r5]) {
                    a8 a8Var8 = new a8(cj3Var.getParentActivity(), (z2 || !z) ? r5 : true, r5);
                    if (cj3Var.F3(dialog)) {
                        a8Var8.j(k96.M0(2131743605, null), R.drawable.msg_unpin, null);
                    } else {
                        a8Var8.j(k96.M0(2131747052, null), R.drawable.msg_pin, null);
                    }
                    a8Var8.setMinimumWidth(kk7.p2);
                    long j6 = j2;
                    yn0 yn0Var = new yn0(cj3Var, t97Var, dialog, j6, (byte) 2);
                    cj3Var2 = cj3Var;
                    j3 = j6;
                    a8Var8.setOnClickListener(yn0Var);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(a8Var8);
                } else {
                    cj3Var2 = cj3Var;
                    j3 = j2;
                }
                if (cf3.D(j3) && l7c.C(cj3Var2.getMessagesController().V1(Long.valueOf(j3)))) {
                    z3 = true;
                    i2 = 0;
                } else {
                    a8 a8Var9 = new a8(cj3Var2.getParentActivity(), false, false);
                    if (cj3Var2.getMessagesController().n2(j3, 0L, null)) {
                        a8Var9.j(k96.M0(2131743610, null), R.drawable.msg_unmute, null);
                    } else {
                        a8Var9.j(k96.M0(2131748122, null), R.drawable.msg_mute, null);
                    }
                    a8Var9.setMinimumWidth(kk7.p2);
                    z3 = true;
                    a8Var9.setOnClickListener(new ly(cj3Var2, j3, 1 == true ? 1 : 0));
                    i2 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(a8Var9);
                }
                if (z) {
                    if (cj3Var2.p2 != null) {
                        cj3Var2.getNotificationCenter().k(i8, new Object[i2]);
                    }
                    cj3Var2.I4();
                    cj3Var2.parentLayout.setHighlightActionButtons(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", -j3);
                    d cj3Var4 = new cj3(bundle2);
                    Point point = gl.q;
                    if (point.x > point.y) {
                        dVarArr[0] = cj3Var4;
                        cj3Var2.presentFragmentAsPreview(cj3Var4);
                        return false;
                    }
                    dVarArr[0] = cj3Var4;
                    cj3Var2.presentFragmentAsPreviewWithMenu(cj3Var4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                    return false;
                }
                a8 a8Var10 = new a8(cj3Var2.getParentActivity(), i2, z3);
                a8Var10.setIconColor(cj3Var2.getThemedColor(bkb.o7));
                int i15 = bkb.p7;
                a8Var10.setTextColor(cj3Var2.getThemedColor(i15));
                a8Var10.h(0.12f, i15);
                a8Var10.j(k96.M0(2131751586, null), R.drawable.msg_delete, null);
                a8Var10.setMinimumWidth(kk7.p2);
                a8Var10.setOnClickListener(new xf3((Object) cj3Var2, (Object) arrayList2, (byte) 2));
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(a8Var10);
                if (!cj3Var2.getMessagesController().A(bundle, cj3Var2, null, null)) {
                    return false;
                }
                if (cj3Var2.p2 != null) {
                    cj3Var2.getNotificationCenter().k(i8, new Object[0]);
                }
                cj3Var2.I4();
                cj3Var2.parentLayout.setHighlightActionButtons(true);
                mu1 mu1Var = new mu1(bundle);
                Point point2 = gl.q;
                if (point2.x > point2.y) {
                    dVarArr[0] = mu1Var;
                    cj3Var2.presentFragmentAsPreview(mu1Var);
                    return true;
                }
                dVarArr[0] = mu1Var;
                cj3Var2.presentFragmentAsPreviewWithMenu(mu1Var, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                mu1Var.ga = true;
                try {
                    mu1Var.p1.getAvatarImageView().performAccessibilityAction(64, null);
                } catch (Exception unused) {
                }
                return true;
            }
        } else if (ue3Var.getCurrentDialogFolderId() == 1) {
            x4(ue3Var);
            return false;
        }
        return false;
    }

    public final void Z2() {
        if (this.a0 != null) {
            float f = (this.b0 != null ? 1.0f : 0.0f) * this.b.e;
            float R1 = gl.R1(0.98f, 1.0f, f);
            this.a0.setScaleX(R1);
            this.a0.setScaleY(R1);
            this.a0.setAlpha(f);
            this.a0.setVisibility(f > 0.0f ? 0 : 8);
        }
        vec vecVar = this.b0;
        fm0 fm0Var = this.s;
        if (vecVar != null) {
            float f2 = 1.0f - fm0Var.e;
            vecVar.setAlpha(f2);
            this.b0.setVisibility(f2 > 0.0f ? 0 : 8);
        }
        tf4 tf4Var = this.c0;
        if (tf4Var != null) {
            float f3 = fm0Var.e;
            tf4Var.setAlpha(f3);
            this.c0.setVisibility(f3 > 0.0f ? 0 : 8);
        }
    }

    public final /* synthetic */ void Z3(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = na7.q1(this.currentAccount).m1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new en0((Object) this, (Object) tL_attachMenuBot, (Object) launchActivity, (byte) 22), 66);
    }

    public final void Z4(boolean z) {
        byte b = 1;
        this.c.a(z, true);
        if (this.n0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.T3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.T3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.T3 = animatorSet2;
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
        this.T3.playTogether(arrayList);
        this.T3.addListener(new xh3(this, z, b));
        this.T3.start();
    }

    public final void a3(boolean z) {
        if (this.D0 == null || this.actionBar == null) {
            return;
        }
        int i = gl.n;
        int measuredHeight = this.actionBar.getMeasuredHeight() + gl.L(this.a) + (this.b0 != null ? gl.L(50.0f) : 0);
        fj3 fj3Var = this.L1;
        int c = measuredHeight + (fj3Var != null ? (int) fj3Var.c(gl.L(7.0f)) : 0);
        hi3 hi3Var = this.D0;
        SparseArray sparseArray = hi3Var.h;
        hi3Var.X0 = c;
        hi3Var.Y0 = i;
        ns9 ns9Var = hi3Var.b0;
        if (z) {
            ns9Var.q1(0, c, 0, i);
        } else {
            ns9Var.setPadding(0, c, 0, i);
        }
        hi3Var.P0.j(hi3Var.X0, hi3Var.Y0, z);
        gt9 gt9Var = hi3Var.c0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gt9Var.getLayoutParams();
        int i2 = marginLayoutParams.topMargin;
        int i3 = hi3Var.X0;
        if (i2 != i3 || marginLayoutParams.bottomMargin != hi3Var.Y0) {
            marginLayoutParams.topMargin = i3;
            marginLayoutParams.bottomMargin = hi3Var.Y0;
            gt9Var.requestLayout();
        }
        tt9.Q(hi3Var.i0, hi3Var.l0, hi3Var.X0, hi3Var.Y0, z);
        tt9.Q(hi3Var.n0, hi3Var.q0, hi3Var.X0, hi3Var.Y0, z);
        tt9.Q(hi3Var.u0, hi3Var.x0, hi3Var.X0, hi3Var.Y0, z);
        yf8 yf8Var = hi3Var.s0;
        int i4 = hi3Var.X0;
        int i5 = hi3Var.Y0;
        yf8Var.setClipToPadding(false);
        q5c q5cVar = yf8Var.c;
        yf8Var.K = z;
        yf8Var.setPadding(0, i4, 0, i5);
        if (z) {
            q5cVar.q1(0, i4, 0, i5);
        } else {
            q5cVar.setPadding(0, i4, 0, i5);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) q5cVar.getLayoutParams();
        marginLayoutParams2.topMargin = -i4;
        marginLayoutParams2.bottomMargin = -i5;
        yf8Var.K = false;
        hs9 hs9Var = hi3Var.J0;
        if (hs9Var != null) {
            hs9Var.b(hi3Var.X0, hi3Var.Y0, z);
        }
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) sparseArray.valueAt(i6);
            if (view instanceof af4) {
                ((af4) view).j(hi3Var.X0, hi3Var.Y0, z);
            }
        }
        for (int i7 = 0; i7 < hi3Var.getChildCount(); i7++) {
            if (hi3Var.getChildAt(i7) instanceof af4) {
                ((af4) hi3Var.getChildAt(i7)).j(hi3Var.X0, hi3Var.Y0, z);
            }
        }
    }

    public final void a4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            psc.a(getParentActivity(), new ht(this, tL_attachMenuBot, launchActivity, (byte) 13), null);
        } else {
            LaunchActivity.G0(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public final void a5() {
        if (this.B0 || !getMessagesController().L0 || !getMessagesController().n3 || this.A0 == null || !getMessagesController().R0().isEmpty() || this.isPaused || !getUserConfig().Q || this.inPreviewMode) {
            return;
        }
        SharedPreferences c1 = na7.c1();
        if (c1.getBoolean("filterhint", false)) {
            return;
        }
        c1.edit().putBoolean("filterhint", true).apply();
        gl.e3(new sg3(this, (byte) 7), 1000L);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.Yk));
        hashSet.add(Integer.valueOf(bkb.Xk));
        hashSet.add(Integer.valueOf(bkb.cl));
        hashSet.add(Integer.valueOf(bkb.bl));
        hashSet.add(Integer.valueOf(bkb.al));
        hashSet.add(Integer.valueOf(bkb.Zk));
        hashSet.add(Integer.valueOf(bkb.Si));
        hashSet.add(Integer.valueOf(bkb.f8));
        hashSet.add(Integer.valueOf(bkb.Me));
        hashSet.add(Integer.valueOf(bkb.Ij));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.Le));
        hashSet.add(Integer.valueOf(bkb.Ke));
        hashSet.add(Integer.valueOf(bkb.Je));
        hashSet.add(Integer.valueOf(bkb.Ie));
        hashSet.add(Integer.valueOf(bkb.xj));
        hashSet.add(Integer.valueOf(bkb.vj));
        hashSet.add(Integer.valueOf(bkb.wj));
        hashSet.add(Integer.valueOf(bkb.S8));
        hashSet.add(Integer.valueOf(bkb.e9));
        hashSet.add(Integer.valueOf(bkb.V8));
        hashSet.add(Integer.valueOf(bkb.U8));
        hashSet.add(Integer.valueOf(bkb.T8));
        hashSet.add(Integer.valueOf(bkb.R9));
        hashSet.add(Integer.valueOf(bkb.Q9));
        hashSet.add(Integer.valueOf(bkb.f9));
        hashSet.add(Integer.valueOf(bkb.l9));
        hashSet.add(Integer.valueOf(bkb.Yl));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.d9));
        hashSet.add(Integer.valueOf(bkb.c9));
        hashSet.add(Integer.valueOf(bkb.b9));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.L7));
        hashSet.add(Integer.valueOf(bkb.M7));
        hashSet.add(Integer.valueOf(bkb.g9));
        hashSet.add(Integer.valueOf(bkb.m9));
        hashSet.add(Integer.valueOf(bkb.k9));
        hashSet.add(Integer.valueOf(bkb.X8));
        hashSet.add(Integer.valueOf(bkb.n9));
        hashSet.add(Integer.valueOf(bkb.i9));
        hashSet.add(Integer.valueOf(bkb.j9));
        hashSet.add(Integer.valueOf(bkb.K7));
        hashSet.add(Integer.valueOf(bkb.a8));
        hashSet.add(Integer.valueOf(bkb.Z7));
        hashSet.add(Integer.valueOf(bkb.Y7));
        hashSet.add(Integer.valueOf(bkb.X7));
        hashSet.add(Integer.valueOf(bkb.W7));
        hashSet.add(Integer.valueOf(bkb.V7));
        hashSet.add(Integer.valueOf(bkb.U7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.J7));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.o6));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.j7));
        hashSet.add(Integer.valueOf(bkb.pk));
        hashSet.add(Integer.valueOf(bkb.Y5));
        hashSet.add(Integer.valueOf(bkb.A9));
        hashSet.add(Integer.valueOf(bkb.y9));
        hashSet.add(Integer.valueOf(bkb.z9));
        hashSet.add(Integer.valueOf(bkb.x9));
        hashSet.add(Integer.valueOf(bkb.w9));
        hashSet.add(Integer.valueOf(bkb.v9));
        hashSet.add(Integer.valueOf(bkb.u9));
        hashSet.add(Integer.valueOf(bkb.t9));
        hashSet.add(Integer.valueOf(bkb.s9));
        hashSet.add(Integer.valueOf(bkb.r9));
        hashSet.add(Integer.valueOf(bkb.q9));
        hashSet.add(Integer.valueOf(bkb.p9));
        hashSet.add(Integer.valueOf(bkb.o9));
        hashSet.add(Integer.valueOf(bkb.h9));
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.a9));
        hashSet.add(Integer.valueOf(bkb.Z8));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.T9));
        hashSet.add(Integer.valueOf(bkb.S9));
        hashSet.add(Integer.valueOf(bkb.xi));
        hashSet.add(Integer.valueOf(bkb.H5));
        hashSet.add(Integer.valueOf(bkb.D8));
        hashSet.add(Integer.valueOf(bkb.F8));
    }

    public final void b3() {
        if (this.L1 != null) {
            float R1 = gl.R1(0.98f, 1.0f, 1.0f);
            this.L1.setAlpha(1.0f);
            this.L1.setScaleX(R1);
            this.L1.setScaleY(R1);
            this.L1.setVisibility(0);
        }
    }

    public final /* synthetic */ void b4(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ow0.l(this.currentAccount, tL_attachMenuBot.bot_id, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d1  */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b5() {
        int i;
        int i2;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity;
        int i3;
        byte b;
        float f;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        og3 og3Var;
        wc3 wc3Var;
        int intValue;
        Integer num;
        int i4;
        ?? r4;
        cs5 I = cs5.I(this, this.l0);
        int i5 = bkb.z8;
        I.T(getThemedColor(i5), getThemedColor(i5));
        byte b2 = 8;
        I.s = (short) 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        byte b3 = 2;
        float f2 = 64.0f;
        byte b4 = 1;
        int i6 = 0;
        if (this.a3 != 0) {
            if (hc2.N(this.b3)) {
                I.b(R.drawable.msg_customize, k96.M0(2131751901, null), new sg3(this, (byte) 14), false);
                I.j();
            }
            I.h(new wf3(this, b4), k96.M0(2131751900, null), this.b3.collapsed_in_dialogs);
            I.h(new wf3(this, b3), k96.M0(2131751899, null), !this.b3.collapsed_in_dialogs);
            I.a0();
            I.Y(-gl.L(64.0f));
            return;
        }
        byte b5 = 3;
        if (D3()) {
            I.b(R.drawable.msg_customize, k96.M0(2131754140, null), new wf3(this, b5), false);
            I.b(R.drawable.msg_help, k96.M0(2131749084, null), new wf3(this, (byte) 4), false);
            I.a0();
            I.Y(-gl.L(64.0f));
            return;
        }
        wjb wjbVar = this.resourceProvider;
        if (wjbVar != null ? wjbVar.a() : bkb.I.o()) {
            i = R.drawable.menu_day_mode_24;
            i2 = 2131744059;
        } else {
            i = R.drawable.menu_night_mode_24;
            i2 = 2131744058;
        }
        I.b(i, k96.M0(i2, null), new wf3(this, (byte) 5), false);
        I.j();
        I.b(R.drawable.msg_contacts, k96.M0(2131751768, null), new wf3(this, (byte) 6), false);
        I.b(R.drawable.msg_calls, k96.M0(2131752584, null), new wf3(this, (byte) 7), false);
        I.j();
        I.b(R.drawable.outline_groups_24, k96.M0(2131748081, null), new wf3(this, b2), false);
        I.b(R.drawable.outline_saved_24, k96.M0(2131745709, null), new wf3(this, (byte) 9), false);
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        if (getMessagesController().k4.n0.f) {
            I.b(R.drawable.ic_gram, k96.M0(2131742951, null), new sg3(this, (byte) 15), false);
        } else {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = hq6.d0(y6c.t0).b;
            if (launchActivity2 != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                int size = arrayList3.size();
                int i7 = 0;
                while (i7 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i7);
                    i7++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        og3 og3Var2 = new og3(this, tL_attachMenuBot2, launchActivity2, b4);
                        wc3 wc3Var2 = new wc3(this, tL_attachMenuBot2, b3);
                        f = f2;
                        wjb wjbVar2 = I.d;
                        if (I.e == null) {
                            arrayList2 = arrayList3;
                            launchActivity = launchActivity2;
                            i3 = size;
                            b = b3;
                        } else {
                            int i8 = bkb.E8;
                            int i9 = bkb.D8;
                            a8 a8Var = new a8(0, I.d, I.e, false, false);
                            a8Var.setPadding(gl.L(18.0f), i6, gl.L(18.0f), i6);
                            boolean z = tL_attachMenuBot2.side_menu_disclaimer_needed;
                            String str = tL_attachMenuBot2.short_name;
                            CharSequence charSequence = str;
                            if (z) {
                                charSequence = wgb.b(str);
                            }
                            Pattern pattern = hq6.U1;
                            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                            int size2 = arrayList4.size();
                            arrayList2 = arrayList3;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size2) {
                                    launchActivity = launchActivity2;
                                    tL_attachMenuBotIcon = null;
                                    break;
                                }
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i10);
                                int i11 = i10 + 1;
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                launchActivity = launchActivity2;
                                if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                    tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                    break;
                                } else {
                                    i10 = i11;
                                    launchActivity2 = launchActivity;
                                }
                            }
                            if (tL_attachMenuBotIcon != null) {
                                i3 = size;
                                kcb f3 = uo3.f(tL_attachMenuBotIcon.icon, bkb.b7, 1.0f, null);
                                if (f3 != null) {
                                    Integer num2 = I.n0;
                                    new PorterDuffColorFilter(num2 != null ? num2.intValue() : bkb.v0(i8, wjbVar2), PorterDuff.Mode.SRC_IN);
                                }
                                gl5 b6 = gl5.b(tL_attachMenuBotIcon.icon);
                                og3Var = og3Var2;
                                wc3Var = wc3Var2;
                                a8Var.k(charSequence, b6, "24_24", f3, tL_attachMenuBot2);
                                be0 be0Var = a8Var.h;
                                if (be0Var != null) {
                                    be0Var.setLayoutParams(nme.e(24, 24, (k96.a0 ? 5 : 3) | 16));
                                }
                            } else {
                                i3 = size;
                                og3Var = og3Var2;
                                wc3Var = wc3Var2;
                                a8Var.j(charSequence, R.drawable.msg_bot, null);
                            }
                            Integer num3 = I.m0;
                            if (num3 != null) {
                                intValue = num3.intValue();
                            } else if (I.n0 == null) {
                                a8Var.c(i9, i8);
                                Integer num4 = I.n0;
                                a8Var.setIconColorImage(num4 == null ? num4.intValue() : bkb.v0(i8, wjbVar2));
                                num = I.o0;
                                if (num == null) {
                                    a8Var.setSelectorColor(num.intValue());
                                } else {
                                    a8Var.h(0.12f, i9);
                                }
                                a8Var.setOnClickListener(new xf3(I, (Runnable) og3Var, (byte) 26));
                                b = 2;
                                a8Var.setOnLongClickListener(new u0(I, wc3Var, b));
                                i4 = I.V;
                                if (i4 <= 0) {
                                    a8Var.setMinimumWidth(gl.L(i4));
                                    I.q(a8Var, nme.o(I.V, -2));
                                } else {
                                    I.q(a8Var, nme.o(-1, -2));
                                }
                            } else {
                                intValue = bkb.v0(i9, wjbVar2);
                            }
                            Integer num5 = I.n0;
                            a8Var.d(intValue, num5 != null ? num5.intValue() : bkb.v0(i8, wjbVar2));
                            Integer num42 = I.n0;
                            a8Var.setIconColorImage(num42 == null ? num42.intValue() : bkb.v0(i8, wjbVar2));
                            num = I.o0;
                            if (num == null) {
                            }
                            a8Var.setOnClickListener(new xf3(I, (Runnable) og3Var, (byte) 26));
                            b = 2;
                            a8Var.setOnLongClickListener(new u0(I, wc3Var, b));
                            i4 = I.V;
                            if (i4 <= 0) {
                            }
                        }
                    } else {
                        arrayList2 = arrayList3;
                        launchActivity = launchActivity2;
                        i3 = size;
                        b = b3;
                        f = f2;
                    }
                    b3 = b;
                    f2 = f;
                    arrayList3 = arrayList2;
                    launchActivity2 = launchActivity;
                    size = i3;
                    b4 = 1;
                    i6 = 0;
                }
            }
        }
        float f4 = f2;
        if (getUserConfig().X) {
            r4 = 0;
            I.b(R.drawable.msg_settings_old, k96.M0(2131745303, null), new wf3(this, false ? 1 : 0), false);
        } else {
            r4 = 0;
        }
        a8 a8Var2 = this.p0;
        if (a8Var2 != null) {
            zkb.X(a8Var2.b, bkb.Qi, getResourceProvider());
            this.p0.setOnClickListener(new xf3(this, I, (byte) r4));
            SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", r4);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", r4) && !TextUtils.isEmpty(string)) || (getMessagesController().l3 && !gba.w1.isEmpty())) {
                I.j();
                I.c(this.p0);
            }
        }
        I.a0();
        I.Y(-gl.L(f4));
    }

    public boolean c3() {
        return this.T0 == 10;
    }

    public final /* synthetic */ void c4(float f, ValueAnimator valueAnimator) {
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
        Y2();
        Q2();
    }

    public final void c5() {
        if (this.W3 == null) {
            for (String str : getMessagesController().u3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = k96.M0(2131749127, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = gl.T2(k96.M0(2131749128, null));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    alertDialog$Builder.j(k96.M0(2131749358, null), new ag3(this, (byte) 6));
                    showDialog(hdVar, new eg3(this, (byte) 0));
                    this.W3 = str;
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        qi3 qi3Var;
        if (this.H3.c()) {
            return false;
        }
        return this.T0 != 3 || (qi3Var = this.A0) == null || qi3Var.getVisibility() != 0 || this.A0.L <= 0;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean closeLastFragment() {
        if (!this.H3.c()) {
            return super.closeLastFragment();
        }
        this.H3.a();
        hi3 hi3Var = this.D0;
        if (hi3Var == null) {
            return true;
        }
        hi3Var.S();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final a createActionBar(Context context) {
        x10 x10Var = new x10(this, context, this.resourceProvider, (byte) 2);
        x10Var.setAllowOverlayTitle(true);
        x10Var.H0 = true;
        if (x10Var.G0 == null) {
            a6 a6Var = new a6(x10Var.getContext(), (byte) 0);
            x10Var.G0 = a6Var;
            x10Var.addView(a6Var);
        }
        zkb.l(x10Var, 3, bkb.s8, getResourceProvider());
        zkb.a(x10Var, bkb.y8, getResourceProvider(), true);
        zkb.l(x10Var, 1, bkb.u8, getResourceProvider());
        zkb.b(x10Var, bkb.x8, getResourceProvider(), true);
        if (x10Var.y1 == null) {
            b6 b6Var = new b6(x10Var, x10Var.getContext(), x10Var.K0, x10Var.P0);
            x10Var.y1 = b6Var;
            b6Var.setClipChildren(false);
            x10Var.addView(x10Var.y1);
        }
        x10Var.getAdditionalSubTitleOverlayContainer().setTranslationX(gl.L(4.0f));
        x10Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-gl.L(3.0f));
        if (!this.inPreviewMode && (!gl.O1() || this.Y2 == 0 || D3())) {
            return x10Var;
        }
        x10Var.setOccupyStatusBar(false);
        return x10Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0bc3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c18  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c41  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0c81  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0c97  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0d70  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0dcd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e03  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0d8a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c49  */
    /* JADX WARN: Type inference failed for: r0v100, types: [org.telegram.ui.ActionBar.a] */
    /* JADX WARN: Type inference failed for: r0v178, types: [o39, yi3] */
    /* JADX WARN: Type inference failed for: r0v27, types: [j92] */
    /* JADX WARN: Type inference failed for: r3v18, types: [l7, org.telegram.ui.Components.EditTextBoldCursor] */
    /* JADX WARN: Type inference failed for: r3v26, types: [org.telegram.ui.ActionBar.a] */
    /* JADX WARN: Type inference failed for: r3v296, types: [android.view.ViewGroup, r7] */
    /* JADX WARN: Type inference failed for: r5v28, types: [kl0] */
    /* JADX WARN: Type inference failed for: r9v24, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f;
        float f2;
        float f3;
        mu1 mu1Var;
        qi3 qi3Var;
        pi3 pi3Var;
        pi3 pi3Var2;
        fj3 fj3Var;
        wi3 wi3Var;
        int i;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r9;
        Context context2 = context;
        byte b = 0;
        this.l2 = false;
        this.m2 = false;
        this.W = false;
        this.X0 = null;
        this.A0 = null;
        ArrayList arrayList = this.K2;
        arrayList.clear();
        this.n3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        byte b2 = 1;
        gl.d3(new vf1(context2, b2));
        this.P1 = null;
        this.N1 = null;
        this.O1 = null;
        this.S1 = null;
        this.L1 = null;
        r6 t = this.actionBar.t();
        t.setTranslationX(-gl.L(5.0f));
        r7 a = t.a(0, R.drawable.outline_header_search);
        a.N();
        this.k0 = a;
        byte b3 = 3;
        a.setOnClickListener(new zf3(this, b3));
        byte b4 = 8;
        byte b5 = 2;
        if (this.T0 == 2 || (D3() && m3(this.currentAccount, this.T0, this.Y2, false).isEmpty())) {
            this.k0.setVisibility(8);
        }
        this.k0.setVisibility(8);
        if (!this.n2 && this.p2 == null && this.Y2 == 0 && this.a3 == 0) {
            int i2 = bkb.s8;
            int themedColor = getThemedColor(i2);
            int i3 = bkb.u8;
            r7 r7Var = new r7(context2, themedColor, getThemedColor(i3));
            this.n0 = r7Var;
            r7Var.setText(k96.L0(2131751342).toUpperCase());
            if (this.n0.getTextView() != null) {
                zkb.X(this.n0.getTextView(), i3, getResourceProvider());
            }
            r7 r7Var2 = this.n0;
            zkb.R(r7Var2, r7Var2.getBackground(), null, zkb.M(i2), getResourceProvider());
            this.actionBar.addView(this.n0, nme.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.n0.setOnClickListener(new zf3(this, b4));
            this.n0.setAlpha(0.0f);
            this.n0.setVisibility(8);
            this.o0 = new tt8(context2);
            a8 a8Var = new a8(this.resourceProvider, context2, false, true);
            this.p0 = a8Var;
            a8Var.setItemHeight(56);
            this.p0.j(k96.L0(2131748413), 0, this.o0);
            this.p0.setContentDescription(k96.L0(2131746408));
            r7 a2 = t.a(1, R.drawable.outline_header_lock_24);
            this.g0 = a2;
            a2.setContentDescription(k96.L0(2131754812));
            ?? d = t.d(3, new ColorDrawable(0));
            this.h0 = d;
            xp3 xp3Var = new xp3(context2, this.currentAccount);
            this.i0 = xp3Var;
            d.addView(xp3Var);
            this.h0.setContentDescription(k96.L0(2131751331));
            this.h0.setVisibility(8);
            s5(false, false);
        }
        pi3 pi3Var3 = new pi3(context2, this.resourceProvider);
        this.Y = pi3Var3;
        pi3Var3.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        byte b6 = 9;
        if (this.T0 == 0) {
            r7 a3 = t.a(-47, R.drawable.avd_speed);
            this.m0 = a3;
            gl.B2(a3);
            this.m0.setOnClickListener(new zf3(this, b6));
            this.Y.a(this.m0);
            this.Y.updateColors();
        }
        this.Y.setCloseButtonOnClickListener(new wf3(this, (byte) 25));
        this.Y.r.setOnFocusChangeListener(new ls0(this, (byte) 5));
        ?? r3 = this.Y.r;
        byte b7 = 10;
        ys9 ys9Var = new ys9(r3, new q10(this, b7));
        this.Z = ys9Var;
        r3.addTextChangedListener(ys9Var);
        this.Y.setSearchFiltersListener(new di3(this));
        this.Z.a();
        if (this.T0 == 0) {
            r7 a4 = t.a(4, R.drawable.ic_ab_other);
            this.l0 = a4;
            a4.setContentDescription(k96.L0(2131754838));
            this.l0.setOnClickListener(new zf3(this, b7));
            this.l0.setOnLongClickListener(new hg3(this, b3));
        }
        this.k0.setSearchFieldHint(k96.L0(2131745644));
        this.k0.setContentDescription(k96.L0(2131745644));
        if (this.n2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i4 = this.T0;
            if (i4 == 16) {
                this.actionBar.setTitle(k96.L0(2131753097));
            } else if (this.O0) {
                this.actionBar.setTitle(k96.L0(2131746059));
            } else if (this.P0) {
                this.actionBar.setTitle(k96.L0(2131746236));
            } else if (i4 == 3 && this.h2 == null) {
                this.actionBar.setTitle(k96.L0(2131750558));
            } else if (i4 == 10) {
                this.actionBar.setTitle(k96.L0(2131745476));
            } else if (i4 == 14) {
                boolean z = this.C2;
                if (!z || this.B2 || this.x2 || this.A2) {
                    boolean z2 = this.B2;
                    if (!z2 || z || this.x2 || this.A2) {
                        boolean z3 = this.x2;
                        if (z3 && !z2 && !z && !this.A2) {
                            this.actionBar.setTitle(k96.L0(2131752113));
                        } else if (!this.A2 || z2 || z || z3) {
                            this.actionBar.setTitle(k96.L0(2131745477));
                        } else {
                            this.actionBar.setTitle(k96.L0(2131752123));
                        }
                    } else {
                        this.actionBar.setTitle(k96.L0(2131752098));
                    }
                } else {
                    this.actionBar.setTitle(k96.L0(2131752125));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.H;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        a aVar = this.actionBar;
                        if (booleanValue) {
                            aVar.setTitle(k96.L0(2131752125));
                        } else {
                            aVar.setTitle(k96.L0(2131752098));
                        }
                    } else {
                        this.actionBar.setTitle(k96.L0(2131752098));
                    }
                } else {
                    boolean z4 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                    a aVar2 = this.actionBar;
                    if (z4) {
                        aVar2.setTitle(k96.L0(2131752123));
                    } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                        aVar2.setTitle(k96.L0(2131752113));
                    } else {
                        aVar2.setTitle(k96.L0(2131745477));
                    }
                }
            }
            zkb.h(bkb.c6, getResourceProvider(), this.actionBar);
        } else {
            if (this.p2 != null || this.Y2 != 0 || this.a3 != 0) {
                ?? r32 = this.actionBar;
                ed0 ed0Var = new ed0(false);
                this.g1 = ed0Var;
                r32.setBackButtonDrawable(ed0Var);
            }
            if (this.Y2 != 0) {
                this.actionBar.setTitle(k96.L0(2131754133));
            } else if (this.a3 != 0) {
                this.actionBar.setTitle(cf3.l(this.b3));
                this.actionBar.setAdditionalTextLeft(gl.L(28.0f));
                this.e3 = new pb0(this.b3);
                be0 be0Var = new be0(getContext());
                this.d3 = be0Var;
                be0Var.setRoundRadius(gl.L(11.0f));
                this.d3.f(this.b3, this.e3);
                this.actionBar.addView(this.d3, nme.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                tl tlVar = new tl(gl.L(26.0f), null);
                this.F3 = tlVar;
                tlVar.a = true;
                Drawable d2 = b00.d(context2, R.drawable.telegram_logo_2);
                this.E3 = d2;
                d2.setBounds(0, gl.L(2.0f), this.E3.getIntrinsicWidth(), this.E3.getIntrinsicHeight() + gl.L(2.0f));
                Drawable drawable = this.E3;
                int themedColor2 = getThemedColor(bkb.Wl);
                this.A4 = themedColor2;
                drawable.setColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.L0(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.E3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.M(spannableStringBuilder, this.F3);
                x5(y6c.h(this.currentAccount).f(), false);
            }
            if (this.Y2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setTitleActionRunnable(new wf3(this, (byte) 26));
        int i5 = this.T0;
        if (((i5 == 0 && !this.n2) || i5 == 3) && this.Y2 == 0 && this.a3 == 0 && TextUtils.isEmpty(this.p2)) {
            qi3 qi3Var2 = new qi3(this, context2, this.resourceProvider);
            this.A0 = qi3Var2;
            qi3Var2.setVisibility(8);
            this.x = false;
            this.r.a(false, false);
            this.A0.setDelegate(new ti3(this, context2));
        }
        byte b8 = 11;
        int i6 = 17;
        if (this.t2 && y6c.c() > 1) {
            this.F1 = t.g(11, 0, gl.L(56.0f));
            pb0 pb0Var = new pb0();
            pb0Var.s(gl.L(12.0f));
            be0 be0Var2 = new be0(context2);
            be0Var2.setRoundRadius(gl.L(18.0f));
            this.F1.addView(be0Var2, nme.e(36, 36, 17));
            this.F1.setOnClickListener(new zf3(this, b8));
            this.F1.setOnLongClickListener(new hg3(this, b5));
            TLRPC.User f4 = getUserConfig().f();
            pb0Var.q(f4);
            ImageReceiver imageReceiver = be0Var2.getImageReceiver();
            int i7 = this.currentAccount;
            imageReceiver.d = i7;
            be0Var2.j(gl5.m(i7, 1, f4), "50_50", gl5.n(f4), "50_50", (f4 == null || (userProfilePhoto = f4.photo) == null || (r9 = userProfilePhoto.strippedBitmap) == null) ? pb0Var : r9, f4);
        }
        this.actionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 12));
        vi3 vi3Var = new vi3(this, context2);
        this.fragmentView = vi3Var;
        this.w4 = new pg3(this, vi3Var, new PointF(), b);
        int i8 = (this.Y2 == 0 && this.a3 == 0 && (((i = this.T0) == 0 && !this.n2) || i == 3)) ? 2 : 1;
        this.f0 = new bj3[i8];
        int i9 = 0;
        while (true) {
            byte b9 = 22;
            if (i9 >= i8) {
                break;
            }
            bj3 bj3Var = new bj3(this, context2);
            vi3Var.addView(bj3Var, nme.c(-1.0f, -1));
            bj3Var.s = this.T0;
            this.f0[i9] = bj3Var;
            pi4 pi4Var = new pi4(context2);
            bj3Var.x = pi4Var;
            pi4Var.setViewType(7);
            bj3Var.x.setVisibility(8);
            bj3Var.addView(bj3Var.x, nme.e(-2, -2, i6));
            yi3 yi3Var = new yi3(this, context2, bj3Var);
            bj3Var.a = yi3Var;
            this.glassEngine.b(yi3Var);
            yi3 yi3Var2 = bj3Var.a;
            bj3Var.b = new kp(yi3Var2);
            yi3Var2.setAllowStopHeaveOperations(true);
            bj3Var.a.setAccessibilityEnabled(false);
            bj3Var.a.p1(0, true);
            bj3Var.a.setClipToPadding(false);
            bj3Var.a.setPivotY(0.0f);
            if (this.T0 == 15) {
                zkb.h(bkb.Z6, getResourceProvider(), bj3Var.a);
            }
            bj3Var.y = new yg3(bj3Var.a, bj3Var);
            bj3Var.a.setVerticalScrollBarEnabled(true);
            bj3Var.a.setInstantClick(true);
            ah3 ah3Var = new ah3(this, bj3Var);
            bj3Var.c = ah3Var;
            ah3Var.i1(1);
            bj3Var.a.setLayoutManager(bj3Var.c);
            bj3Var.a.setVerticalScrollbarPosition(k96.a0 ? 1 : 2);
            bj3Var.addView(bj3Var.a, nme.c(-1.0f, -1));
            bj3Var.a.setOnItemClickListener(new v82(this, bj3Var, b9));
            bj3Var.a.setOnItemLongClickListener(new lv6(this, bj3Var, b9));
            bj3Var.f = new aj3(this, bj3Var);
            bj3Var.E = new t29(bj3Var.a, false);
            is5 is5Var = new is5(bj3Var.f);
            bj3Var.e = is5Var;
            is5Var.h(bj3Var.a);
            bj3Var.a.setOnScrollListener(new ch3(this, bj3Var, vi3Var));
            bj3Var.w = gba.n1 ? (byte) 2 : (byte) 0;
            if (bj3Var.n == null && this.Y2 == 0 && this.a3 == 0) {
                bj3Var.n = new dh3(k96.L0(2131754719), k96.L0(2131754721), bj3Var);
                boolean w3 = w3();
                dh3 dh3Var = bj3Var.n;
                if (w3) {
                    dh3Var.g();
                } else {
                    dh3Var.b();
                }
                bj3Var.n.X = bj3Var.w != 0;
            }
            vi3 vi3Var2 = vi3Var;
            int i10 = i9;
            int i11 = i8;
            eh3 eh3Var = new eh3(this, this, context, bj3Var.s, this.Y2, this.n2, arrayList, this.currentAccount, this.H, bj3Var);
            context2 = context;
            bj3Var.d = eh3Var;
            eh3Var.L = bj3Var.a;
            eh3Var.R = this.v2;
            if (bj3Var.s == 3) {
                eh3Var.n = getMessagesController().b5() && (wi3Var = this.E2) != null && wi3Var.F();
            }
            if (gl.O1()) {
                long j = this.r2.a;
                if (j != 0) {
                    bj3Var.d.s = j;
                }
            }
            eh3 eh3Var2 = bj3Var.d;
            eh3Var2.M = bj3Var.n;
            bj3Var.a.setAdapter(eh3Var2);
            bj3Var.a.setEmptyView((this.Y2 == 0 && this.a3 == 0) ? bj3Var.x : null);
            cu6 cu6Var = new cu6(bj3Var.a, bj3Var.c);
            bj3Var.r = cu6Var;
            cu6Var.c = true;
            cu6Var.d = true;
            cu6Var.n = new ag3(this, (byte) 13);
            if (i10 != 0) {
                this.f0[i10].setVisibility(8);
            }
            i9 = i10 + 1;
            vi3Var = vi3Var2;
            i8 = i11;
            i6 = 17;
        }
        vi3 vi3Var3 = vi3Var;
        ej3 ej3Var = new ej3(context2);
        this.M1 = ej3Var;
        int i12 = bkb.c6;
        ej3Var.setColor(bkb.u0(i12));
        vi3Var3.addView(this.M1, nme.e(-1, 100, 48));
        this.C0 = vi3Var3.getChildCount();
        ls9 ls9Var = new ls9((Activity) getContext());
        this.a0 = ls9Var;
        vi3Var3.addView(ls9Var, nme.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        ls9 ls9Var2 = this.a0;
        nl0 n = nod.n(this.resourceProvider);
        ?? r5 = this.u4;
        il0 b10 = r5.b(ls9Var2, n);
        ug8.r(b10, gl.L(18.0f), 6.666f);
        this.a0.setPadding(0, gl.L(7.0f), 0, gl.L(7.0f));
        this.a0.setBlurredBackground(b10);
        tf4 tf4Var = new tf4(getParentActivity(), null);
        this.c0 = tf4Var;
        tf4Var.setPadding(0, gl.L(3.0f), 0, gl.L(3.0f));
        tf4 tf4Var2 = this.c0;
        tf4Var2.i3 = false;
        tf4Var2.setOnItemClickListener(new dg3(this, b2));
        this.a0.addView(this.c0, nme.e(-1, -1, 48));
        un4 un4Var = new un4(this.resourceProvider, context2, true);
        this.v0 = un4Var;
        un4Var.setContentDescription(k96.L0(2131744318));
        this.v0.setImageResource(R.drawable.outline_fab_story_24);
        this.v0.setOnClickListener(new zf3(this, (byte) 27));
        vi3Var3.addView(this.v0, un4.c());
        un4 un4Var2 = new un4(context2, this.resourceProvider);
        this.u0 = un4Var2;
        vi3Var3.addView(un4Var2, un4.b());
        this.u0.setOnClickListener(new zf3(this, (byte) 28));
        if (!D3() && this.T0 == 0 && na7.q1(this.currentAccount).X3.getBoolean("storyhint", true)) {
            je5 je5Var = new je5(context2, 2);
            je5Var.q(8.0f);
            je5Var.d = 8000L;
            je5Var.j(true);
            je5Var.h = gl.L(165.0f);
            je5Var.p(true);
            f = 8.0f;
            je5Var.t(gl.H2(k96.L0(2131744475), t7b.k(context2), "%s"));
            je5Var.n(1.0f, -40.0f);
            je5Var.i(getThemedColor(bkb.vj));
            je5Var.r0 = new sg3(this, (byte) 10);
            this.q0 = je5Var;
            vi3Var3.addView(je5Var, nme.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        } else {
            f = 8.0f;
        }
        y5();
        this.b0 = null;
        if (this.n2 || this.T0 != 0) {
            byte b11 = 5;
            f2 = 72.0f;
            if (this.T0 == 3 || c3()) {
                j92 j92Var = new j92(context2);
                this.A1 = j92Var;
                j92Var.setClipChildren(false);
                ?? r0 = this.A1;
                fyc fycVar = this.w;
                r0.setWindowInsetsProvider(fycVar);
                j92 j92Var2 = this.A1;
                j92Var2.setInputIslandBubbleDrawable(r5.b(j92Var2, nod.n(this.resourceProvider)));
                j92 j92Var3 = this.A1;
                j92Var3.setUnderKeyboardBackgroundDrawable(this.s4.b(j92Var3, nod.n(this.resourceProvider)));
                ql0 ql0Var = new ql0(this.v4.b(this.A1, null));
                if (!gba.f() || e66.e(262144)) {
                    ql0Var.b(gl.L(72.0f), true);
                }
                this.A1.setBackgroundWithFadeDrawable(ql0Var);
                FrameLayout inputIslandBubbleContainer = this.A1.getInputIslandBubbleContainer();
                this.B1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.C1 = this.A1.getInAppKeyboardBubbleContainer();
                hh3 hh3Var = this.D1;
                if (hh3Var != null) {
                    hh3Var.b1();
                }
                hh3 hh3Var2 = new hh3(this, getParentActivity(), vi3Var3);
                this.D1 = hh3Var2;
                hh3Var2.setInAppInsetsController(fycVar);
                this.D1.X5 = false;
                vi3Var3.setClipChildren(false);
                vi3Var3.setClipToPadding(false);
                hh3 hh3Var3 = this.D1;
                hh3Var3.W5 = false;
                hh3Var3.Y2 = !gl.E && ((mu1Var = hh3Var3.F3) == null || !mu1Var.isInBubbleMode());
                this.D1.w1(false, false, false);
                this.D1.H1(true, false);
                this.D1.p2.setPadding(0, gl.L(1.0f), gl.L(20.0f), 0);
                f3 = 0.0f;
                this.D1.getSendButton().setAlpha(0.0f);
                this.D1.setViewParentForEmoji(this.C1);
                this.B1.addView(this.D1, nme.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                vi3Var3.addView(this.A1.getFadeView(), nme.c(-1.0f, -1));
                vi3Var3.addView(this.A1, nme.c(-1.0f, -1));
                if (x3() || this.G2 != null || this.H2 != null) {
                    B2(this.Z3);
                    this.Z3 = null;
                }
                this.D1.setDelegate(new ih3(this));
                jh3 jh3Var = new jh3(this, context2, this.resourceProvider);
                this.E1 = jh3Var;
                int L = gl.L(52.0f);
                int L2 = gl.L(38.0f);
                jh3Var.L = L;
                jh3Var.M = L2;
                jh3 jh3Var2 = this.E1;
                float L3 = gl.L(7.0f);
                float L4 = gl.L(f);
                jh3Var2.P = L3;
                jh3Var2.Q = L4;
                jh3 jh3Var3 = this.E1;
                jh3Var3.s0 = true;
                vi3Var3.addView(jh3Var3, nme.e(kk7.u1, 50, 85));
                this.E1.setScrimViewBackgroundColor(getThemedColor(i12));
                this.E1.setOnClickListener(new zf3(this, b11));
                this.E1.setOnLongClickListener(new hg3(this, b));
                this.E1.setVisibility(8);
                this.E1.setScaleX(0.2f);
                this.E1.setScaleY(0.2f);
                this.E1.setAlpha(0.0f);
                de9.p(this.G1, gl.L(12.0f));
                qi3Var = this.A0;
                if (qi3Var != null) {
                    il0 b12 = r5.b(qi3Var, nod.n(this.resourceProvider));
                    ug8.r(b12, gl.L(18.0f), 6.666f);
                    this.A0.setPadding(0, gl.L(7.0f), 0, gl.L(7.0f));
                    this.A0.setBlurredBackground(b12);
                    this.A0.j(new wf3(this, (byte) 19), new wf3(this, (byte) 22));
                    vi3Var3.addView(this.A0, nme.d(-1, -2.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                pi3Var = this.Y;
                if (pi3Var != null) {
                    pi3Var.setupBlurredBackground(r5.b(pi3Var, nod.n(this.resourceProvider)));
                }
                oh3 oh3Var = new oh3(this, context2, this, this.currentAccount, D3() ? 1 : 0);
                this.F0 = oh3Var;
                oh3Var.setActionBar(this.actionBar);
                this.F0.setMenuItemsOffset(!D3() ? gl.L(68.0f) : gl.N(16.66f));
                oh3 oh3Var2 = this.F0;
                oh3Var2.m0 = false;
                oh3Var2.setVisibility(8);
                this.N = false;
                this.M = false;
                this.L = false;
                if (this.n2 && this.T0 == 3) {
                    na7.q1(this.currentAccount).G1();
                }
                vi3Var3.addView(this.actionBar, nme.c(-2.0f, -1));
                if (!this.n2) {
                    ym ymVar = new ym(context2);
                    this.G3 = ymVar;
                    vi3Var3.addView(ymVar, nme.e(20, 20, 51));
                }
                pi3Var2 = this.Y;
                if (pi3Var2 != null) {
                    vi3Var3.addView(pi3Var2, nme.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.y0 = vi3Var3.getChildCount();
                UndoView[] undoViewArr = this.z0;
                undoViewArr[0] = null;
                undoViewArr[1] = null;
                if (this.X) {
                    this.actionBar.getTitlesContainer().setTranslationX(gl.L(4.0f));
                    zkb.d(this.actionBar, bkb.Wl, getResourceProvider());
                }
                if (this.Y2 == 0 || this.a3 != 0) {
                    this.f0[0].a.setGlowColor(getThemedColor(i12));
                    zkb.b(this.actionBar, bkb.N8, getResourceProvider(), false);
                    zkb.a(this.actionBar, bkb.M8, getResourceProvider(), false);
                    this.actionBar.L(getThemedColor(bkb.P8), false);
                    this.actionBar.L(getThemedColor(bkb.Q8), true);
                }
                if (!this.n2 && this.T0 == 0) {
                    sb sbVar = new sb((byte) 11, context2, this);
                    this.L0 = sbVar;
                    sbVar.setForeground(new ColorDrawable(bm2.o(getThemedColor(i12), 100)));
                    this.L0.setFocusable(false);
                    this.L0.setImportantForAccessibility(2);
                    this.L0.setOnClickListener(new zf3(this, (byte) 7));
                    this.L0.setVisibility(8);
                    vi3Var3.addView(this.L0, nme.c(-1.0f, -1));
                }
                this.h1.setColor(getThemedColor(i12));
                this.s3 = false;
                if (this.p2 == null) {
                    g5(true, false, false, false);
                    this.Y.r.setText(this.p2);
                    this.Y.r.setSelection(this.p2.length());
                } else if (this.q2 != null) {
                    g5(true, false, false, true);
                    this.Z.b(true);
                    this.Y.r.setText(this.q2);
                    this.Y.r.setSelection(this.q2.length());
                    this.q2 = null;
                    pi3 pi3Var4 = this.Y;
                    if (pi3Var4 != null) {
                        pi3Var4.setTranslationY(s3() + (-gl.L(36.0f)));
                    }
                } else {
                    g5(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.a(this);
                }
                this.actionBar.setDrawBlurBackground(vi3Var3);
                this.H3 = new rh3(this, context2, vi3Var3, context2);
                o5(true, false);
                this.H3.setOpenProgress(f3);
                vi3Var3.addView(this.F0, nme.c(81.0f, -1));
                vi3Var3.addView(this.H3, nme.c(-1.0f, -1));
                this.G0 = new dj3(context2);
                fj3Var = this.L1;
                if (fj3Var != null) {
                    vi3Var3.addView(fj3Var, nme.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.a3 != 0 && this.T0 != 3 && hc2.c(this.b3)) {
                    cm2 cm2Var = new cm2(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) k96.L0(2131751977));
                    spannableStringBuilder2.setSpan(cm2Var, 0, 1, 33);
                    u41 u41Var = new u41(context2, this.resourceProvider);
                    this.w0 = u41Var;
                    u41Var.f();
                    this.w0.setText(spannableStringBuilder2);
                    this.w0.setOnClickListener(new xf3((Object) this, (Object) new hd[1], (byte) 3));
                    ry1 ry1Var = new ry1(getContext());
                    this.x0 = ry1Var;
                    ry1Var.setupColorKey(bkb.Z6);
                    this.x0.setFadeZoneBottom(gl.L(f2) + gl.n);
                    this.x0.setFadeHeightBottom(gl.L(24.0f));
                    vi3Var3.addView(this.x0, nme.g());
                    vi3Var3.addView(this.w0, nme.f(48.0f, -1, 80, gl.L(12.0f), 0, gl.L(12.0f), gl.L(12.0f) + gl.n));
                }
                A5(false);
                r5(false);
                Z2();
                W2();
                Y2();
                X2();
                V2();
                P2();
                this.Y.setBlurredBackgroundVisibility(this.b.e);
                qw4 qw4Var = this.glassEngine;
                qw4Var.a = new ag3(this, b4);
                qw4Var.d = new ax4(gl.L(48.0f));
                View view = this.fragmentView;
                ag3 ag3Var = new ag3(this, (byte) 9);
                WeakHashMap weakHashMap = jdc.a;
                bdc.i(view, ag3Var);
                return this.fragmentView;
            }
        } else {
            fj3 fj3Var2 = new fj3(context2);
            this.L1 = fj3Var2;
            fj3Var2.setOnAnimatedHeightChangedListener(new sg3(this, (byte) 16));
            il0 a5 = r5.a(this.L1);
            a5.p(nod.n(this.resourceProvider));
            a5.q(gl.L(7.0f));
            f2 = 72.0f;
            this.L1.setPadding(gl.L(11.0f), gl.L(21.0f), gl.L(11.0f), gl.L(21.0f));
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
            byte b13 = 4;
            this.L1.i(4, this.K1);
            this.L1.h(this.K1);
            this.L1.j(this.K1, true, false);
            fh3 fh3Var = new fh3(this, context2, this, (byte) 0);
            this.H1 = fh3Var;
            this.I1.addView(fh3Var);
            fh3 fh3Var2 = new fh3(this, context2, this, (byte) 1);
            this.J1 = fh3Var2;
            this.K1.addView(fh3Var2);
            this.L1.setCallFragmentContextView(this.J1);
            dk3 dk3Var = new dk3(context2);
            this.O1 = dk3Var;
            dk3Var.setBackground(bkb.L0(false));
            m5();
            r61.c0(new yf3(this, b));
            r61.l0(new w72(this, (byte) 17));
            this.L1.addView(this.O1);
            if (this.a3 != 0) {
                rn2 rn2Var = new rn2(this.resourceProvider, context2, true);
                this.S1 = rn2Var;
                rn2Var.a(-14899731, -15497247, R.drawable.filled_requests_24, k96.L0(2131751883), null, false);
                this.S1.setUnreadMode(true);
                this.S1.setBackground(bkb.L0(false));
                this.S1.setOnClickListener(new zf3(this, b13));
                this.L1.addView(this.S1);
                J2(false);
            }
        }
        f3 = 0.0f;
        qi3Var = this.A0;
        if (qi3Var != null) {
        }
        pi3Var = this.Y;
        if (pi3Var != null) {
        }
        oh3 oh3Var3 = new oh3(this, context2, this, this.currentAccount, D3() ? 1 : 0);
        this.F0 = oh3Var3;
        oh3Var3.setActionBar(this.actionBar);
        this.F0.setMenuItemsOffset(!D3() ? gl.L(68.0f) : gl.N(16.66f));
        oh3 oh3Var22 = this.F0;
        oh3Var22.m0 = false;
        oh3Var22.setVisibility(8);
        this.N = false;
        this.M = false;
        this.L = false;
        if (this.n2) {
            na7.q1(this.currentAccount).G1();
        }
        vi3Var3.addView(this.actionBar, nme.c(-2.0f, -1));
        if (!this.n2) {
        }
        pi3Var2 = this.Y;
        if (pi3Var2 != null) {
        }
        this.y0 = vi3Var3.getChildCount();
        UndoView[] undoViewArr2 = this.z0;
        undoViewArr2[0] = null;
        undoViewArr2[1] = null;
        if (this.X) {
        }
        if (this.Y2 == 0) {
        }
        this.f0[0].a.setGlowColor(getThemedColor(i12));
        zkb.b(this.actionBar, bkb.N8, getResourceProvider(), false);
        zkb.a(this.actionBar, bkb.M8, getResourceProvider(), false);
        this.actionBar.L(getThemedColor(bkb.P8), false);
        this.actionBar.L(getThemedColor(bkb.Q8), true);
        if (!this.n2) {
            sb sbVar2 = new sb((byte) 11, context2, this);
            this.L0 = sbVar2;
            sbVar2.setForeground(new ColorDrawable(bm2.o(getThemedColor(i12), 100)));
            this.L0.setFocusable(false);
            this.L0.setImportantForAccessibility(2);
            this.L0.setOnClickListener(new zf3(this, (byte) 7));
            this.L0.setVisibility(8);
            vi3Var3.addView(this.L0, nme.c(-1.0f, -1));
        }
        this.h1.setColor(getThemedColor(i12));
        this.s3 = false;
        if (this.p2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(vi3Var3);
        this.H3 = new rh3(this, context2, vi3Var3, context2);
        o5(true, false);
        this.H3.setOpenProgress(f3);
        vi3Var3.addView(this.F0, nme.c(81.0f, -1));
        vi3Var3.addView(this.H3, nme.c(-1.0f, -1));
        this.G0 = new dj3(context2);
        fj3Var = this.L1;
        if (fj3Var != null) {
        }
        if (this.a3 != 0) {
            cm2 cm2Var2 = new cm2(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) k96.L0(2131751977));
            spannableStringBuilder22.setSpan(cm2Var2, 0, 1, 33);
            u41 u41Var2 = new u41(context2, this.resourceProvider);
            this.w0 = u41Var2;
            u41Var2.f();
            this.w0.setText(spannableStringBuilder22);
            this.w0.setOnClickListener(new xf3((Object) this, (Object) new hd[1], (byte) 3));
            ry1 ry1Var2 = new ry1(getContext());
            this.x0 = ry1Var2;
            ry1Var2.setupColorKey(bkb.Z6);
            this.x0.setFadeZoneBottom(gl.L(f2) + gl.n);
            this.x0.setFadeHeightBottom(gl.L(24.0f));
            vi3Var3.addView(this.x0, nme.g());
            vi3Var3.addView(this.w0, nme.f(48.0f, -1, 80, gl.L(12.0f), 0, gl.L(12.0f), gl.L(12.0f) + gl.n));
        }
        A5(false);
        r5(false);
        Z2();
        W2();
        Y2();
        X2();
        V2();
        P2();
        this.Y.setBlurredBackgroundVisibility(this.b.e);
        qw4 qw4Var2 = this.glassEngine;
        qw4Var2.a = new ag3(this, b4);
        qw4Var2.d = new ax4(gl.L(48.0f));
        View view2 = this.fragmentView;
        ag3 ag3Var2 = new ag3(this, (byte) 9);
        WeakHashMap weakHashMap2 = jdc.a;
        bdc.i(view2, ag3Var2);
        return this.fragmentView;
    }

    public final void d3() {
        if (!gl.O1()) {
            this.X1 = true;
            return;
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.n(true);
        }
        TLObject tLObject = this.Z1;
        if (tLObject != null) {
            hi3 hi3Var = this.D0;
            if (hi3Var != null) {
                hi3Var.e0.Q(this.Y1, tLObject);
            }
            this.Z1 = null;
        }
    }

    public final /* synthetic */ void d4() {
        presentFragment(new PrivacySettingsActivity());
        gl.g3(this.parentLayout, "newChatsRow");
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
    public final void d5(long j, View view) {
        ArrayList m3;
        int i;
        TLRPC.EncryptedChat Y0;
        ValueAnimator valueAnimator;
        int i2;
        bj3[] bj3VarArr;
        float max;
        qi3 qi3Var;
        ed0 ed0Var;
        y2(j, view);
        boolean y = this.actionBar.y();
        ArrayList arrayList = this.K2;
        boolean z = true;
        char c = 1;
        if (!y) {
            if (this.s3) {
                f3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof a07)) {
                    this.actionBar.setBackButtonDrawable(new ed0(false));
                }
            } else {
                f3(null);
            }
            gl.t1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(bkb.c6));
            this.actionBar.R(null, null);
            int i3 = this.f0[0].s;
            if (!(i3 == 7 || i3 == 8) || (this.actionBar.y() && !this.actionBar.z(null))) {
                m3 = getMessagesController().U0(this.Y2);
            } else if (I3(this.f0[0])) {
                t97 q3 = q3(this.f0[0]);
                ArrayList arrayList2 = getMessagesController().y;
                int size = arrayList2.size();
                i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i4);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && q3.j.get(dialog.id, TLObject.FLAG_31) != Integer.MIN_VALUE) {
                        long j2 = dialog.id;
                        if (cf3.B(j2) && (Y0 = getMessagesController().Y0(Integer.valueOf((int) (4294967295L & j2)))) != null) {
                            j2 = Y0.user_id;
                        }
                        if (q3.b(getAccountInstance(), j2, dialog, false)) {
                            i++;
                        }
                    }
                }
                if (i > 1) {
                    if (this.f0 != null) {
                        int i5 = 0;
                        while (true) {
                            bj3[] bj3VarArr2 = this.f0;
                            if (i5 >= bj3VarArr2.length) {
                                break;
                            }
                            bj3VarArr2[i5].d.I = true;
                            i5++;
                        }
                    }
                    int i6 = na7.q5;
                    C5(131072, true);
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
                        gl.y(view2);
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
                    bj3VarArr = this.f0;
                    if (i2 < bj3VarArr.length) {
                        break;
                    }
                    bj3 bj3Var = bj3VarArr[i2];
                    if (bj3Var != null) {
                        bj3Var.a.J0(true);
                    }
                    i2++;
                }
                max = Math.max(0.0f, gl.L((!this.L ? 81 : 0) + 48) + this.O);
                if (max != 0.0f) {
                    this.Q = (int) max;
                    this.fragmentView.requestLayout();
                }
                this.x3.addUpdateListener(new bg3(this, max, (byte) 0));
                this.x3.addListener(new ai3(this, max, c == true ? 1 : 0));
                this.x3.setInterpolator(s33.f);
                this.x3.setDuration(200L);
                this.x3.start();
                qi3Var = this.A0;
                if (qi3Var != null) {
                    qi3Var.b(bkb.wi, bkb.vi, bkb.ui, bkb.xi, bkb.v8);
                }
                ed0Var = this.g1;
                if (ed0Var != null) {
                    ed0Var.c(true, 1.0f);
                }
                z = false;
            } else {
                m3 = m3(this.currentAccount, this.f0[0].s, this.Y2, this.U1);
            }
            int size2 = m3.size();
            i = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) m3.get(i8);
                if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                    if (!F3(dialog2)) {
                        if (!getMessagesController().B2(dialog2.id, false)) {
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
                bj3VarArr = this.f0;
                if (i2 < bj3VarArr.length) {
                }
                i2++;
            }
            max = Math.max(0.0f, gl.L((!this.L ? 81 : 0) + 48) + this.O);
            if (max != 0.0f) {
            }
            this.x3.addUpdateListener(new bg3(this, max, (byte) 0));
            this.x3.addListener(new ai3(this, max, c == true ? 1 : 0));
            this.x3.setInterpolator(s33.f);
            this.x3.setDuration(200L);
            this.x3.start();
            qi3Var = this.A0;
            if (qi3Var != null) {
            }
            ed0Var = this.g1;
            if (ed0Var != null) {
            }
            z = false;
        } else if (arrayList.isEmpty()) {
            y3(true);
            return;
        }
        l5(false);
        this.j1.a(arrayList.size(), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:429:0x0583, code lost:
    
        if (hc2.S(r1.K0, r12) == false) goto L362;
     */
    /* JADX WARN: Removed duplicated region for block: B:372:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:377:? A[RETURN, SYNTHETIC] */
    @Override // gk7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        t97 t97Var;
        int i4;
        char c;
        boolean booleanValue;
        boolean z;
        mt9 mt9Var;
        mt9 mt9Var2;
        int i5;
        boolean z2;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        if (i == kk7.r) {
            if (this.f0 == null || this.U1) {
                return;
            }
            int i9 = 0;
            while (true) {
                bj3[] bj3VarArr = this.f0;
                if (i9 >= bj3VarArr.length) {
                    break;
                }
                bj3 bj3Var = bj3VarArr[i9];
                boolean E42 = E4(bj3Var);
                if (this.B3 && E42) {
                    gl.e3(new mg3(this, bj3Var, objArr, r8), 160L);
                } else {
                    int length = objArr.length;
                    K4(bj3Var);
                }
                i9++;
            }
            qi3 qi3Var = this.A0;
            if (qi3Var != null && qi3Var.getVisibility() == 0) {
                this.A0.c();
            }
            B5(-1, true);
            this.B3 = false;
            return;
        }
        if (i == kk7.s5) {
            C5(0, true);
            bj3[] bj3VarArr2 = this.f0;
            if (bj3VarArr2 != null) {
                for (bj3 bj3Var2 : bj3VarArr2) {
                    if (bj3Var2.getVisibility() == 0 && E4(bj3Var2)) {
                        wf3 wf3Var = this.R3;
                        gl.r(wf3Var);
                        gl.e3(wf3Var, 100L);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == kk7.S) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.a3 != chatFull.id) {
                return;
            }
            this.c3 = chatFull;
            J2(false);
            if (this.f0 == null || this.U1) {
                return;
            }
            while (true) {
                bj3[] bj3VarArr3 = this.f0;
                if (i6 >= bj3VarArr3.length) {
                    return;
                }
                K4(bj3VarArr3[i6]);
                i6++;
            }
        } else {
            ArrayList arrayList = null;
            if (i == kk7.c2) {
                qi3 qi3Var2 = this.A0;
                if (qi3Var2 == null || qi3Var2.getVisibility() != 0) {
                    return;
                }
                qi3 qi3Var3 = this.A0;
                int defaultTabId = qi3Var3.getDefaultTabId();
                fu fuVar = qi3Var3.G;
                ArrayList arrayList2 = qi3Var3.h;
                int i10 = qi3Var3.m0.get(defaultTabId, -1);
                if (i10 < 0 || i10 >= arrayList2.size()) {
                    return;
                }
                de4 de4Var = (de4) arrayList2.get(i10);
                if (de4Var.d == ((ti3) qi3Var3.K).a(de4Var.a) || ((ti3) qi3Var3.K).a(de4Var.a) < 0) {
                    return;
                }
                fuVar.h1();
                if (qi3Var3.n0.get(i10) != de4Var.a(true) || qi3Var3.i0) {
                    qi3Var3.i0 = true;
                    qi3Var3.requestLayout();
                    fuVar.setItemAnimator(qi3Var3.t0);
                    s20 s20Var = qi3Var3.J;
                    if (s20Var != null) {
                        s20Var.f();
                    }
                    qi3Var3.N = 0;
                    de4 d = qi3Var3.d();
                    if (d != null) {
                        d.b(k96.M0(2131750795, null));
                    }
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        qi3Var3.N = de9.w(24.0f, ((de4) arrayList2.get(i11)).a(true), qi3Var3.N);
                    }
                    return;
                }
                return;
            }
            if (i == kk7.b5) {
                C5(0, true);
                return;
            }
            if (i == kk7.a5) {
                C5(0, true);
                return;
            }
            if (i == kk7.k4) {
                if (this.f0 != null) {
                    int i12 = 0;
                    while (true) {
                        bj3[] bj3VarArr4 = this.f0;
                        if (i12 >= bj3VarArr4.length) {
                            break;
                        }
                        yi3 yi3Var = bj3VarArr4[i12].a;
                        if (yi3Var != null) {
                            for (int i13 = 0; i13 < yi3Var.getChildCount(); i13++) {
                                View childAt = yi3Var.getChildAt(i13);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i12++;
                    }
                }
                qi3 qi3Var4 = this.A0;
                if (qi3Var4 != null) {
                    qi3Var4.getTabsContainer().h1();
                    return;
                }
                return;
            }
            if (i == kk7.K4) {
                a aVar = this.actionBar;
                if (aVar != null) {
                    aVar.n(true);
                    return;
                }
                return;
            }
            if (i == kk7.C4) {
                s5(false, false);
                return;
            }
            byte b = 2;
            if (i == 2) {
                Integer num = (Integer) objArr[0];
                C5(num.intValue(), true);
                qi3 qi3Var5 = this.A0;
                if (qi3Var5 != null && qi3Var5.getVisibility() == 0) {
                    int intValue = num.intValue();
                    int i14 = na7.q5;
                    if ((intValue & 256) != 0) {
                        this.A0.c();
                    }
                }
                if (this.a3 != 0) {
                    int intValue2 = num.intValue();
                    int i15 = na7.q5;
                    if ((intValue2 & TLObject.FLAG_13) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.a3));
                        this.b3 = K0;
                        this.actionBar.setTitle(cf3.l(K0));
                        this.d3.f(this.b3, this.e3);
                    }
                }
                if (this.f0 != null) {
                    for (int i16 = 0; i16 < this.f0.length; i16++) {
                        int intValue3 = num.intValue();
                        int i17 = na7.q5;
                        if ((intValue3 & 4) != 0) {
                            this.f0[i16].d.P(true);
                        }
                    }
                }
                x5(y6c.h(i2).f(), true);
                return;
            }
            int i18 = kk7.H2;
            boolean[] zArr = D4;
            if (i == i18) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i == kk7.X) {
                C5(0, true);
                return;
            }
            if (i == kk7.N) {
                if (this.f0 == null || this.U1) {
                    return;
                }
                un4 un4Var = this.u0;
                if (un4Var != null) {
                    z2 = un4Var.getProgressVisible();
                    this.u0.f(false, true);
                } else {
                    z2 = false;
                }
                for (bj3 bj3Var3 : this.f0) {
                    bj3Var3.d.e = false;
                }
                if (z2) {
                    P4(0.0f);
                    ValueAnimator valueAnimator = this.e0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.d0, 1.0f).setDuration(250L);
                    this.e0 = duration;
                    duration.setInterpolator(s33.f);
                    this.e0.addUpdateListener(new cg3(this, (byte) 2));
                    this.e0.start();
                }
                int i19 = 0;
                boolean z4 = false;
                while (true) {
                    bj3[] bj3VarArr5 = this.f0;
                    if (i19 >= bj3VarArr5.length) {
                        break;
                    }
                    if (!bj3VarArr5[i19].a() || getMessagesController().B0() > 10) {
                        z4 = true;
                    } else {
                        this.f0[i19].d.f();
                    }
                    i19++;
                    z4 = z4;
                }
                if (z4) {
                    C5(0, true);
                    return;
                }
                return;
            }
            if (i != kk7.g0) {
                if (i == kk7.e0) {
                    C5(0, true);
                    return;
                }
                if (i == kk7.I || i == kk7.J || i == kk7.L) {
                    int i20 = na7.q5;
                    C5(TLObject.FLAG_12, true);
                    return;
                }
                if (i == kk7.m0) {
                    S2();
                    return;
                }
                if (i == kk7.O0) {
                    hi3 hi3Var = this.D0;
                    if (hi3Var == null || (mt9Var2 = hi3Var.e0) == null || (i5 = mt9Var2.i0) == 15) {
                        return;
                    }
                    int i21 = mt9Var2.t0;
                    ad7.Y(i21).a.c(new bt(i21, i5, (Object) new rk3(mt9Var2), (byte) 6));
                    return;
                }
                if (i == kk7.r0) {
                    int i22 = na7.q5;
                    C5(32768, true);
                    return;
                }
                if (i == kk7.R0) {
                    hi3 hi3Var2 = this.D0;
                    if (hi3Var2 == null || (mt9Var = hi3Var2.e0) == null) {
                        return;
                    }
                    mt9Var.f();
                    return;
                }
                if (i == kk7.S1) {
                    int connectionState = ConnectionsManager.getInstance(j5.a(i2).a).getConnectionState();
                    if (this.f2 != connectionState) {
                        this.f2 = connectionState;
                        s5(true, false);
                        return;
                    }
                    return;
                }
                if (i == kk7.d5) {
                    s5(true, false);
                    hi3 hi3Var3 = this.D0;
                    if (hi3Var3 != null) {
                        int currentPosition = hi3Var3.getCurrentPosition();
                        bn0 bn0Var = hi3Var3.W;
                        w5(bn0Var != null && bn0Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                byte b2 = 3;
                if (i == kk7.J2) {
                    if (this.fragmentView != null) {
                        long longValue = ((Long) objArr[0]).longValue();
                        TLRPC.User user = (TLRPC.User) objArr[1];
                        TLRPC.Chat chat = (TLRPC.Chat) objArr[2];
                        if (user == null || !user.bot) {
                            booleanValue = ((Boolean) objArr[3]).booleanValue();
                            z = false;
                        } else {
                            z = ((Boolean) objArr[3]).booleanValue();
                            booleanValue = false;
                        }
                        Runnable tg3Var = new tg3(this, chat, longValue, booleanValue, user, z);
                        h3();
                        if (this.z0[0] == null) {
                            tg3Var.run();
                            return;
                        }
                        if (hc2.c0(chat)) {
                            tg3Var.run();
                            return;
                        }
                        UndoView u3 = u3();
                        if (u3 != null) {
                            u3.j(booleanValue ? (byte) 1 : (byte) 95, longValue, tg3Var);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == kk7.c0) {
                    int intValue4 = ((Integer) objArr[0]).intValue();
                    int i23 = this.Y2;
                    if (i23 != intValue4 || i23 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i == kk7.N2) {
                    o5(true, true);
                    B5(-1, true);
                    return;
                }
                if (i == kk7.O2) {
                    z3 = true;
                } else if (i != kk7.P2) {
                    if (i == kk7.Q2) {
                        a5();
                        return;
                    }
                    if (i == kk7.r1) {
                        c5();
                        m5();
                        na7 messagesController = getMessagesController();
                        if (!messagesController.i5 && messagesController.A4 + 10 >= messagesController.getConnectionsManager().getCurrentTime()) {
                            boolean contains = messagesController.u3.contains("SETUP_LOGIN_EMAIL");
                            if (messagesController.u3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                                c = 2;
                            } else if (contains) {
                                c = 1;
                            }
                            if (c == 0) {
                                mf6 mf6Var = new mf6();
                                sg3 sg3Var = new sg3(this, b);
                                sg3 sg3Var2 = new sg3(this, b2);
                                boolean z5 = c == 2;
                                mf6Var.G = (byte) 3;
                                mf6Var.a = 12;
                                mf6Var.e0 = sg3Var;
                                mf6Var.f0 = sg3Var2;
                                mf6Var.h0 = z5;
                                mf6Var.i0 = true;
                                presentFragment(mf6Var);
                                getMessagesController().i5 = true;
                                return;
                            }
                            return;
                        }
                        c = 0;
                        if (c == 0) {
                        }
                    } else {
                        if (i == kk7.M) {
                            un4 un4Var2 = this.u0;
                            if (un4Var2 != null) {
                                un4Var2.f(true, true);
                            }
                            bj3[] bj3VarArr6 = this.f0;
                            if (bj3VarArr6 != null) {
                                for (bj3 bj3Var4 : bj3VarArr6) {
                                    eh3 eh3Var = bj3Var4.d;
                                    eh3Var.R = false;
                                    eh3Var.e = true;
                                    eh3Var.f();
                                }
                                return;
                            }
                            return;
                        }
                        if (i == kk7.v) {
                            if (!this.s3 || this.D0 == null) {
                                return;
                            }
                            ArrayList arrayList3 = (ArrayList) objArr[0];
                            long longValue2 = ((Long) objArr[1]).longValue();
                            hi3 hi3Var4 = this.D0;
                            HashMap hashMap = hi3Var4.C0;
                            SparseArray sparseArray = hi3Var4.h;
                            int size2 = sparseArray.size();
                            for (int i24 = 0; i24 < size2; i24++) {
                                View view = (View) sparseArray.valueAt(i24);
                                if (view instanceof af4) {
                                    ((af4) view).d(arrayList3, longValue2);
                                }
                            }
                            for (int i25 = 0; i25 < hi3Var4.getChildCount(); i25++) {
                                if (hi3Var4.getChildAt(i25) instanceof af4) {
                                    ((af4) hi3Var4.getChildAt(i25)).d(arrayList3, longValue2);
                                }
                            }
                            hi3Var4.P0.d(arrayList3, longValue2);
                            if (hashMap.isEmpty()) {
                                return;
                            }
                            ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                            for (int i26 = 0; i26 < arrayList4.size(); i26++) {
                                se4 se4Var = (se4) arrayList4.get(i26);
                                k27 k27Var = (k27) hashMap.get(se4Var);
                                if (k27Var != null) {
                                    long B0 = k27.B0(k27Var.k);
                                    if (B0 < 0) {
                                        i4 = (int) (-B0);
                                    }
                                    i4 = 0;
                                    if (i4 == longValue2) {
                                        for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                                            if (k27Var.e1() == ((Integer) arrayList3.get(i27)).intValue()) {
                                                arrayList = new ArrayList();
                                                arrayList.add(se4Var);
                                            }
                                        }
                                    }
                                }
                            }
                            if (arrayList != null) {
                                int size3 = arrayList.size();
                                for (int i28 = 0; i28 < size3; i28++) {
                                    hashMap.remove(arrayList.get(i28));
                                }
                                hi3Var4.A0.a(hashMap.size(), true);
                                r7 r7Var = hi3Var4.F0;
                                if (r7Var != null) {
                                    r7Var.setVisibility(hashMap.size() != 1 ? 8 : 0);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (i == kk7.N4) {
                            if (this.f0 != null) {
                                while (true) {
                                    bj3[] bj3VarArr7 = this.f0;
                                    if (i7 >= bj3VarArr7.length) {
                                        break;
                                    }
                                    lj3 lj3Var = bj3VarArr7[i7].d.Q;
                                    if (lj3Var != null) {
                                        lj3Var.a.clear();
                                        lj3Var.b.clear();
                                        lj3Var.c.clear();
                                        lj3Var.d.clear();
                                        gl.r(lj3Var.e);
                                    }
                                    i7++;
                                }
                            }
                            int i29 = wv4.l1;
                            return;
                        }
                        if (i == kk7.V5) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                            if (this.a3 != longValue3 || booleanValue2) {
                                return;
                            }
                            ui5 ui5Var = this.parentLayout;
                            if (ui5Var == null || ui5Var.getLastFragment() != this) {
                                removeSelfFromStack();
                                return;
                            } else {
                                finishFragment();
                                return;
                            }
                        }
                        if (i == kk7.U5) {
                            if (this.a3 == ((Long) objArr[0]).longValue()) {
                                J2(true);
                                return;
                            }
                            return;
                        }
                        if (i == kk7.U4) {
                            boolean booleanValue3 = ((Boolean) objArr[0]).booleanValue();
                            if (this.fragmentView != null) {
                                k83 k83Var = this.V3;
                                if (!booleanValue3) {
                                    if (k83Var == null || k83Var.getTag() == null) {
                                        return;
                                    }
                                    k83 k83Var2 = this.V3;
                                    k83Var2.animate().setListener(null).cancel();
                                    k83Var2.animate().setListener(new u5(this, k83Var2, (byte) 18)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                                    this.V3.setTag(null);
                                    return;
                                }
                                if (k83Var == null) {
                                    Context context = this.fragmentView.getContext();
                                    k83 k83Var3 = new k83(context);
                                    LinearLayout j = de9.j(context, 1);
                                    ry8 ry8Var = new ry8(context);
                                    ry8Var.f(R.raw.db_migration_placeholder, kk7.f2, kk7.f2, null);
                                    ry8Var.getAnimatedDrawable().F(1);
                                    ry8Var.d();
                                    j.addView(ry8Var, nme.r(kk7.f2, kk7.f2, 1));
                                    TextView textView = new TextView(context);
                                    ir2.r(24.0f, 1, 2131747585, textView, null);
                                    int i30 = bkb.F6;
                                    zkb.X(textView, i30, null);
                                    textView.setGravity(1);
                                    TextView m = ug8.m(j, textView, nme.q(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                                    m.setLineSpacing(gl.L(2.0f), 1.0f);
                                    ir2.r(14.0f, 1, 2131747584, m, null);
                                    zkb.X(m, i30, null);
                                    m.setGravity(1);
                                    TextView m2 = ug8.m(j, m, nme.q(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                                    ir2.r(14.0f, 1, 2131747583, m2, null);
                                    zkb.X(m2, i30, null);
                                    m2.setGravity(1);
                                    j.addView(m2, nme.q(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                                    k83Var3.addView(j, nme.e(-1, -2, 16));
                                    zkb.h(bkb.c6, null, k83Var3);
                                    k83Var3.setOnTouchListener(new j83());
                                    this.V3 = k83Var3;
                                    k83Var3.setAlpha(0.0f);
                                    ((vi3) this.fragmentView).addView(this.V3);
                                    this.V3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                                }
                                this.V3.setTag(1);
                                return;
                            }
                            return;
                        }
                        if (i == kk7.c5) {
                            L2();
                            return;
                        }
                        if (i == kk7.o5) {
                            x5((TLRPC.User) objArr[0], true);
                            return;
                        }
                        if (i == kk7.h5) {
                            x5(y6c.h(i2).f(), true);
                            y5();
                            return;
                        }
                        if (i == kk7.v5) {
                            zArr[this.currentAccount] = false;
                            t4(getAccountInstance());
                            getMessagesController().c3(this.Y2);
                            return;
                        }
                        if (i == kk7.B5) {
                            int intValue5 = ((Integer) objArr[0]).intValue();
                            while (true) {
                                bj3[] bj3VarArr8 = this.f0;
                                if (i8 >= bj3VarArr8.length) {
                                    return;
                                }
                                bj3 bj3Var5 = bj3VarArr8[i8];
                                if (bj3Var5 != null && (((i3 = bj3Var5.s) == 7 || i3 == 8) && (t97Var = getMessagesController().N[bj3Var5.s - 7]) != null && intValue5 == t97Var.a)) {
                                    bj3Var5.b(true);
                                    return;
                                }
                                i8++;
                            }
                        } else {
                            if (i != kk7.O1) {
                                if (i == kk7.x5) {
                                    A5(this.W);
                                    C5(0, true);
                                    return;
                                }
                                if (i == kk7.a3) {
                                    y5();
                                    return;
                                }
                                if (i == kk7.e3) {
                                    m5();
                                    return;
                                }
                                if (i == kk7.i5) {
                                    m5();
                                    return;
                                }
                                if (i == kk7.z3 || i == kk7.B3) {
                                    m5();
                                    return;
                                } else if (i == kk7.R3) {
                                    m5();
                                    return;
                                } else {
                                    if (i == kk7.S3) {
                                        m5();
                                        return;
                                    }
                                    return;
                                }
                            }
                            long longValue4 = ((Long) objArr[0]).longValue();
                            int i31 = 0;
                            while (true) {
                                bj3[] bj3VarArr9 = this.f0;
                                if (i31 >= bj3VarArr9.length) {
                                    return;
                                }
                                bj3 bj3Var6 = bj3VarArr9[i31];
                                if (bj3Var6.a != null) {
                                    int i32 = 0;
                                    while (true) {
                                        if (i32 < bj3Var6.a.getChildCount()) {
                                            View childAt2 = bj3Var6.a.getChildAt(i32);
                                            if (childAt2 instanceof ue3) {
                                                ue3 ue3Var = (ue3) childAt2;
                                                if (longValue4 == ue3Var.getDialogId()) {
                                                    ue3Var.z();
                                                    break;
                                                }
                                            }
                                            i32++;
                                        }
                                    }
                                }
                                i31++;
                            }
                        }
                    }
                }
                J4(z3);
                B5(-1, true);
                return;
            }
            if (this.f0 == null) {
                return;
            }
            int i33 = 0;
            while (true) {
                bj3[] bj3VarArr10 = this.f0;
                if (i33 >= bj3VarArr10.length) {
                    int i34 = na7.q5;
                    C5(512, true);
                    return;
                }
                if (bj3VarArr10[i33].a() && gl.O1()) {
                    boolean booleanValue4 = ((Boolean) objArr[2]).booleanValue();
                    long longValue5 = ((Long) objArr[0]).longValue();
                    long longValue6 = ((Long) objArr[1]).longValue();
                    zc7 zc7Var = this.r2;
                    if (booleanValue4) {
                        long j2 = zc7Var.a;
                        if (longValue5 == j2 && longValue6 == zc7Var.b) {
                            zc7Var.a = 0L;
                            zc7Var.b = 0L;
                            longValue5 = 0;
                        } else {
                            longValue5 = j2;
                        }
                    } else {
                        zc7Var.a = longValue5;
                        zc7Var.b = longValue6;
                    }
                    this.f0[i33].d.s = longValue5;
                }
                i33++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof ow0) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e3() {
        a aVar = this.actionBar;
        if (aVar == null || !aVar.o0) {
            return;
        }
        aVar.n(true);
        this.s3 = false;
        o5(true, true);
    }

    public final void e4() {
        h5.c(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    public final void e5(long j, View view) {
        int i = -this.N3;
        this.N3 = i;
        gl.B3(i, view, null);
        pw0.E.a();
        String q = j >= 0 ? l7c.q(na7.q1(this.currentAccount).V1(Long.valueOf(j))) : "";
        (getMessagesController().E3() ? u21.b0(this).Q(R.raw.star_premium_2, 36, gl.T2(k96.a0(null, null, 2131743521, q))) : u21.b0(this).K(R.raw.star_premium_2, gl.T2(k96.a0(null, null, 2131743521, q)), k96.M0(2131743520, null), new wf3(this, (byte) 15))).j();
    }

    public final void f3(String str) {
        if (this.actionBar.d(str)) {
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
            this.i1.setImageDrawable(new ed0(true));
            zkb.s(this.i1, bkb.x8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.i1;
            int i = bkb.y8;
            zkb.R(imageView2, bkb.f0(getThemedColor(i), 1, -1), null, zkb.M(i), getResourceProvider());
            this.i1.setOnClickListener(new zf3(this, (byte) 6));
            q.addView(this.i1, nme.r(54, 54, 16));
            arrayList.add(this.i1);
        }
        NumberTextView numberTextView = new NumberTextView(q.getContext());
        this.j1 = numberTextView;
        numberTextView.setTextSize(18);
        this.j1.setTypeface(gl.o());
        this.j1.setTextColor(getThemedColor(bkb.x8));
        q.addView(this.j1, nme.m(1.0f, 0, -1, this.X ? 18 : 72, 0, 0));
        this.j1.setOnTouchListener(new jz1((byte) 5));
        this.m1 = q.g(100, R.drawable.msg_pin, gl.L(48.0f));
        this.n1 = q.g(kk7.o1, R.drawable.msg_mute, gl.L(48.0f));
        this.o1 = q.g(kk7.r1, R.drawable.msg_archive, gl.L(48.0f));
        this.l1 = q.h(kk7.m1, R.drawable.msg_delete, gl.L(48.0f), k96.M0(2131751586, null));
        r7 h = q.h(0, R.drawable.ic_ab_other, gl.L(48.0f), k96.M0(2131754838, null));
        q.addView(new View(getParentActivity()), nme.o(5, -1));
        this.s1 = h.e(kk7.p1, R.drawable.msg_archive, k96.M0(2131754169, null));
        this.p1 = h.e(kk7.s1, R.drawable.msg_pin, k96.M0(2131751441, null));
        this.q1 = h.e(kk7.t1, R.drawable.msg_addfolder, k96.M0(2131750800, null));
        this.r1 = h.e(kk7.u1, R.drawable.msg_removefolder, k96.M0(2131750698, null));
        this.u1 = h.e(101, R.drawable.msg_markread, k96.M0(2131748489, null));
        this.t1 = h.e(kk7.n1, R.drawable.msg_clear, k96.M0(2131752077, null));
        this.v1 = h.e(kk7.q1, R.drawable.msg_block, k96.M0(2131753689, null));
        this.n1.setOnLongClickListener(new hg3(this, b));
        arrayList.add(this.m1);
        arrayList.add(this.o1);
        arrayList.add(this.n1);
        arrayList.add(this.l1);
        arrayList.add(h);
        l5(false);
    }

    public final void f4() {
        PasskeysActivity.e0(this.currentAccount, this.resourceProvider, getParentActivity(), true);
    }

    public final void f5(boolean z) {
        if (this.f0 == null || this.O3 == z) {
            return;
        }
        this.O3 = z;
        int i = 0;
        while (true) {
            bj3[] bj3VarArr = this.f0;
            if (i >= bj3VarArr.length) {
                return;
            }
            if (z) {
                bj3VarArr[i].a.setScrollbarFadingEnabled(false);
            }
            this.f0[i].a.setVerticalScrollBarEnabled(z);
            if (z) {
                this.f0[i].a.setScrollbarFadingEnabled(true);
            }
            i++;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void finishFragment() {
        super.finishFragment();
        cs5 cs5Var = this.M0;
        if (cs5Var != null) {
            cs5Var.u();
        }
    }

    public final void g3() {
        hi3 hi3Var = this.D0;
        if ((hi3Var != null && hi3Var.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        byte b = 1;
        byte b2 = 2;
        byte b3 = 0;
        hi3 hi3Var2 = new hi3(this, getParentActivity(), this, this.p2 != null ? 2 : !this.n2 ? 1 : 0, this.T0, this.Y2, this.a3, new gi3(this));
        this.D0 = hi3Var2;
        this.glassEngine.c(hi3Var2);
        ((vi3) this.fragmentView).addView(this.D0, this.C0);
        hi3 hi3Var3 = this.D0;
        hi3Var3.e0.V = new ji3(this);
        hi3Var3.l0.setOnItemClickListener(new ag3(this, b));
        this.D0.q0.setOnItemClickListener(new ag3(this, b2));
        this.D0.x0.setOnItemClickListener(new dg3(this, b3));
        this.D0.q0.setOnItemLongClickListener(new ag3(this, (byte) 3));
        this.D0.b0.setOnItemClickListener(new ag3(this, (byte) 4));
        this.D0.b0.setOnItemLongClickListener(new bh3(this));
        this.D0.setFilteredSearchViewDelegate(new ag3(this, (byte) 5));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.t4);
    }

    public final /* synthetic */ void g4() {
        na7.q1(this.currentAccount).m4(0L, "SETUP_PASSKEY");
        m5();
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
    public final void g5(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        hi3 hi3Var;
        boolean z6;
        vec vecVar;
        TLRPC.Chat chat;
        rh3 rh3Var;
        hi3 hi3Var2;
        hi3 hi3Var3;
        float f;
        oh3 oh3Var;
        hi3 hi3Var4;
        boolean z7 = z3;
        this.b.a(z, z7);
        byte b = 0;
        if (z) {
            g3();
        } else {
            w5(false);
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
                    hi3Var = this.D0;
                    if (hi3Var != null) {
                        hi3Var.R0 = z5;
                    }
                    z6 = z5 || this.L;
                    this.u3 = z6;
                    if (z6) {
                        this.v3 = true;
                    }
                    vecVar = this.b0;
                    if (vecVar != null && hi3Var != null && !z5 && this.a3 == 0) {
                        vec l = hi3Var.l(-2, false);
                        this.b0 = l;
                        this.a0.addView(l, 0, nme.e(-1, -1, kk7.D1));
                    } else if (this.a0 != null && z5 && this.a3 == 0) {
                        gl.B2(vecVar);
                        this.b0 = null;
                    }
                    if (this.D0 != null) {
                        a3(false);
                        this.D0.setKeyboardHeight(((vi3) this.fragmentView).getKeyboardHeight());
                        hi3 hi3Var5 = this.D0;
                        hi3Var5.D0.clear();
                        hi3Var5.L();
                    }
                    chat = this.b3;
                    if (chat == null) {
                        rf4 rf4Var = new rf4(R.drawable.search_users_filled, 4, cf3.t(chat));
                        rf4Var.f = this.b3;
                        z2(rf4Var);
                    } else if (this.Y2 != 0 && ((rh3Var = this.H3) == null || !rh3Var.c())) {
                        z2(new rf4(R.drawable.chats_archive, 2131754147, null, 7));
                    }
                }
            }
            z5 = false;
            hi3Var = this.D0;
            if (hi3Var != null) {
            }
            if (z5) {
            }
            this.u3 = z6;
            if (z6) {
            }
            vecVar = this.b0;
            if (vecVar != null) {
            }
            if (this.a0 != null) {
                gl.B2(vecVar);
                this.b0 = null;
            }
            if (this.D0 != null) {
            }
            chat = this.b3;
            if (chat == null) {
            }
        } else {
            o5(false, z7);
        }
        if (z7 && (hi3Var4 = this.D0) != null && hi3Var4.e0.M()) {
            gl.h3(getParentActivity(), this.classGuid);
        } else {
            gl.W2(getParentActivity(), this.classGuid);
        }
        if (!z && (oh3Var = this.F0) != null && this.H0) {
            oh3Var.setVisibility(0);
        }
        Object[] objArr = gba.o() == 0 || !e66.e(32768);
        if (z7) {
            if (z) {
                hi3 hi3Var6 = this.D0;
                if (hi3Var6 != null) {
                    hi3Var6.setVisibility(0);
                    hi3 hi3Var7 = this.D0;
                    hi3Var7.setPosition(0);
                    if (hi3Var7.e0.b() > 0) {
                        hi3Var7.f0.g1(0, 0);
                    }
                    t26 t26Var = hi3Var7.k0;
                    if (t26Var != null) {
                        t26Var.g1(0, 0);
                    }
                    t26 t26Var2 = hi3Var7.p0;
                    if (t26Var2 != null) {
                        t26Var2.g1(0, 0);
                    }
                    t26 t26Var3 = hi3Var7.w0;
                    if (t26Var3 != null) {
                        t26Var3.g1(0, 0);
                    }
                    hi3Var7.h.clear();
                }
                p5(true, null, null, false, false);
                vec vecVar2 = this.b0;
                if (vecVar2 != null) {
                    vecVar2.b(false, false);
                }
            } else {
                this.f0[0].a.setVisibility(0);
                this.f0[0].setVisibility(0);
            }
            Q4(true, true);
            this.f0[0].a.setVerticalScrollBarEnabled(false);
            hi3 hi3Var8 = this.D0;
            if (hi3Var8 != null) {
                zkb.h(bkb.c6, getResourceProvider(), hi3Var8);
            }
            this.y1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            bj3 bj3Var = this.f0[0];
            Property property = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(bj3Var, (Property<bj3, Float>) property, z ? 0.0f : 1.0f));
            bj3[] bj3VarArr = this.f0;
            if (objArr == true) {
                bj3VarArr[0].setScaleX(1.0f);
                this.f0[0].setScaleY(1.0f);
            } else {
                arrayList2.add(ObjectAnimator.ofFloat(bj3VarArr[0], (Property<bj3, Float>) View.SCALE_X, z ? 0.95f : 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f0[0], (Property<bj3, Float>) View.SCALE_Y, z ? 0.95f : 1.0f));
            }
            rh3 rh3Var2 = this.H3;
            if (rh3Var2 != null) {
                rh3Var2.setVisibility(0);
                arrayList2.add(ObjectAnimator.ofFloat(this.H3, (Property<rh3, Float>) property, z ? 0.0f : 1.0f));
            }
            hi3 hi3Var9 = this.D0;
            if (hi3Var9 != null) {
                arrayList2.add(ObjectAnimator.ofFloat(hi3Var9, (Property<hi3, Float>) property, z ? 1.0f : 0.0f));
                if (this.L) {
                    float L = gl.L(81.0f) + this.O + gl.L(48.0f);
                    hi3 hi3Var10 = this.D0;
                    if (z) {
                        f = L;
                        L = 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(hi3Var10, this.J3, f, L));
                }
                hi3 hi3Var11 = this.D0;
                if (objArr == true) {
                    hi3Var11.setScaleX(1.0f);
                    this.D0.setScaleY(1.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(hi3Var11, (Property<hi3, Float>) View.SCALE_X, z ? 1.0f : 1.05f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.D0, (Property<hi3, Float>) View.SCALE_Y, z ? 1.0f : 1.05f));
                }
            }
            if (this.h0 != null) {
                s5(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z1, z ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new cg3(this, (byte) 0));
            arrayList2.add(ofFloat);
            this.y1.playTogether(arrayList2);
            this.y1.setDuration(z ? 200L : 180L);
            this.y1.setInterpolator(s33.g);
            if (!z) {
                this.y1.setStartDelay(20L);
            }
            this.y1.addListener(new xh3(this, z, b));
            this.r3.d();
            this.y1.start();
        } else {
            Q4(false, true);
            bj3[] bj3VarArr2 = this.f0;
            if (z) {
                bj3VarArr2[0].a.d1();
            } else {
                yi3 yi3Var = bj3VarArr2[0].a;
                if (yi3Var.h1) {
                    yi3Var.h1 = false;
                    yi3Var.L0(false);
                }
            }
            this.f0[0].setAlpha(z ? 0.0f : 1.0f);
            bj3[] bj3VarArr3 = this.f0;
            if (objArr == true) {
                bj3VarArr3[0].setScaleX(1.0f);
                this.f0[0].setScaleY(1.0f);
            } else {
                bj3VarArr3[0].setScaleX(z ? 0.95f : 1.0f);
                this.f0[0].setScaleY(z ? 0.95f : 1.0f);
            }
            hi3 hi3Var12 = this.D0;
            if (hi3Var12 != null) {
                hi3Var12.setAlpha(z ? 1.0f : 0.0f);
                hi3 hi3Var13 = this.D0;
                if (objArr == true) {
                    hi3Var13.setScaleX(1.0f);
                    this.D0.setScaleY(1.0f);
                } else {
                    hi3Var13.setScaleX(z ? 1.0f : 1.1f);
                    this.D0.setScaleY(z ? 1.0f : 1.1f);
                }
                this.D0.setVisibility(z ? 0 : 8);
            }
            pi3 pi3Var = this.Y;
            if (pi3Var != null) {
                pi3Var.setTranslationY(s3() + (z ? -gl.L(36.0f) : 0));
            }
            if (this.F0 != null) {
                if (!this.H0 || isInPreviewMode() || z) {
                    this.F0.setVisibility(8);
                } else {
                    this.F0.setVisibility(0);
                }
            }
            T4(z ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i2 = this.y;
        if (i2 >= 0 && (hi3Var3 = this.D0) != null) {
            hi3Var3.setPosition(hi3Var3.N(i2));
        }
        if (!z) {
            this.y = -1;
        } else if (z2 && (hi3Var2 = this.D0) != null) {
            hi3Var2.setPosition((hi3Var2.t0 ? 1 : 0) + 5);
            w5(true);
        }
        Z2();
        m5();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final pi5 getBackButtonState() {
        return (D3() || this.H3.f) ? pi5.a : pi5.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b4, 1.0f);
            this.e4 = ofFloat;
            return ofFloat;
        }
        int i = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? kk7.f2 : (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b4, 1.0f);
        this.e4 = ofFloat2;
        ofFloat2.addUpdateListener(new cg3(this, (byte) 1));
        this.e4.setInterpolator(s33.g);
        this.e4.setDuration(i);
        this.e4.start();
        return this.e4;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0246 A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        int i;
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        r7 r7Var = this.n0;
        if (r7Var != null) {
            arrayList.add(new blb(r7Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.s8));
        }
        int i2 = this.Y2;
        hi3 hi3Var = this.D0;
        if (i2 == 0) {
            if (hi3Var != null) {
                arrayList.add(new blb(hi3Var.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
            }
            arrayList.add(new blb(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{bkb.r1}, (alb) null, !this.X ? bkb.z8 : bkb.Wl));
            arrayList.add(new blb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.B8));
            arrayList.add(new blb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C8));
        } else {
            if (hi3Var != null) {
                arrayList.add(new blb(hi3Var.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
            }
            arrayList.add(new blb(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{bkb.r1}, (alb) null, !this.X ? bkb.O8 : bkb.Wl));
            arrayList.add(new blb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.P8));
            arrayList.add(new blb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Q8));
        }
        arrayList.add(new blb(this.actionBar, TLObject.FLAG_21, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.w8));
        NumberTextView numberTextView = this.j1;
        int i3 = bkb.x8;
        arrayList.add(new blb(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i3));
        if (this.A0 != null) {
            a aVar = this.actionBar;
            if (aVar == null || !aVar.y()) {
                arrayList.add(new blb(this.A0, 0, new Class[]{he4.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (alb) null, bkb.J8));
                arrayList.add(new blb(this.A0.getTabsContainer(), 262148, new Class[]{fe4.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.H8));
                arrayList.add(new blb(this.A0.getTabsContainer(), 262148, new Class[]{fe4.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.I8));
                arrayList.add(new blb(this.A0.getTabsContainer(), TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.K8));
            } else {
                arrayList.add(new blb(this.A0, 0, new Class[]{he4.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (alb) null, bkb.wi));
                arrayList.add(new blb(this.A0.getTabsContainer(), 262148, new Class[]{fe4.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.vi));
                arrayList.add(new blb(this.A0.getTabsContainer(), 262148, new Class[]{fe4.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.ui));
            }
        }
        arrayList.addAll(hue.a(new t00(this, (byte) 6), bkb.v8, i3));
        int i4 = 0;
        while (i4 < 3) {
            if (i4 == 2) {
                hi3 hi3Var2 = this.D0;
                if (hi3Var2 != null) {
                    view = hi3Var2.b0;
                    view2 = view;
                    if (view2 == null) {
                        arrayList.add(new blb(view2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.h6));
                        arrayList.add(new blb(view2, 0, new Class[]{q86.class}, new String[]{"progressBar"}, (Drawable[]) null, (alb) null, bkb.g6));
                        int i5 = l35.h;
                        arrayList.add(new blb(view2, 4, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.n6));
                    }
                    i4++;
                } else {
                    i4++;
                }
            } else {
                bj3[] bj3VarArr = this.f0;
                if (bj3VarArr == null) {
                    i4++;
                } else {
                    view = i4 < bj3VarArr.length ? bj3VarArr[i4].a : null;
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
                bj3[] bj3VarArr2 = this.f0;
                if (i6 >= bj3VarArr2.length) {
                    break;
                }
                if (this.Y2 == 0) {
                    yi3 yi3Var = bj3VarArr2[i6].a;
                    int i7 = bkb.c6;
                    arrayList.add(new blb(yi3Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i7));
                    i = i7;
                } else {
                    yi3 yi3Var2 = bj3VarArr2[i6].a;
                    int i8 = bkb.c6;
                    arrayList.add(new blb(yi3Var2, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i8));
                    i = i8;
                }
                boolean z = gba.a;
                int i9 = bkb.p6;
                arrayList.add(new blb(this.f0[i6].a, 0, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, i9));
                arrayList.add(new blb(this.f0[i6].a, 0, new Class[]{wgb.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, i9));
                arrayList.add(new blb(this.f0[i6].x, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
                this.f0[i6].d.getClass();
                arrayList.add(new blb((View) null, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
                i6++;
            }
        }
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.z0;
            if (i10 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new blb(undoViewArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.vj));
            i10++;
        }
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.h5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.i5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.l5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.m5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.n5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.p7));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.o5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.p5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.q5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.I5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.o7));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.s5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.t5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.u5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.v5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.w5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.x5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.y5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.D5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.G5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.H5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.z5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.A5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.B5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.E5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.J5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.L5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.M5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.N5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.O5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.P5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Q5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.R5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.T5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.U5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.yj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.zj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Dj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ej));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Fj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Gj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Hj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ij));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Jj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Kj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Lj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Mj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Nj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Jh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Kh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Lh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Mh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Nh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Oh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ph));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Qh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Rh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Sh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Th));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Uh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Vh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Yh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Zh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ai));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Wh));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Xh));
        tf4 tf4Var = this.c0;
        if (tf4Var != null) {
            arrayList.addAll(tf4Var.getThemeDescriptions());
            this.c0.updateColors();
        }
        xp3 xp3Var = this.i0;
        if (xp3Var != null) {
            xp3Var.updateColors();
            this.i0.invalidate();
        }
        hi3 hi3Var3 = this.D0;
        if (hi3Var3 != null) {
            gt9 gt9Var = hi3Var3.c0;
            SparseArray sparseArray = hi3Var3.h;
            ns9 ns9Var = hi3Var3.b0;
            for (int i11 = 0; i11 < ns9Var.getChildCount(); i11++) {
                View childAt = ns9Var.getChildAt(i11);
                if ((childAt instanceof rr8) || (childAt instanceof ue3) || (childAt instanceof wc5)) {
                    arrayList.add(new blb(childAt, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
                }
            }
            for (int i12 = 0; i12 < hi3Var3.getChildCount(); i12++) {
                if (hi3Var3.getChildAt(i12) instanceof af4) {
                    arrayList.addAll(((af4) hi3Var3.getChildAt(i12)).getThemeDescriptions());
                }
            }
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view3 = (View) sparseArray.valueAt(i13);
                if (view3 instanceof af4) {
                    arrayList.addAll(((af4) view3).getThemeDescriptions());
                }
            }
            af4 af4Var = hi3Var3.P0;
            if (af4Var != null) {
                arrayList.addAll(af4Var.getThemeDescriptions());
            }
            arrayList.add(new blb(gt9Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F6));
            arrayList.add(new blb(gt9Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.x6));
            arrayList.addAll(hue.a(new t00(hi3Var3, (byte) 17), bkb.x8));
        }
        dk3 dk3Var = this.O1;
        byte b = 18;
        if (dk3Var != null) {
            arrayList.addAll(hue.a(new t00(new mk2(dk3Var, (byte) 26), b), bkb.c6, bkb.F6, bkb.x6));
        }
        x4c x4cVar = this.P1;
        if (x4cVar != null) {
            arrayList.addAll(hue.a(new t00(new mk2(x4cVar, (byte) 27), b), bkb.c6, bkb.F6, bkb.x6, bkb.H6, bkb.p7));
        }
        l9 l9Var = this.N1;
        if (l9Var != null) {
            arrayList.addAll(hue.a(new t00(new mk2(l9Var, (byte) 28), b), bkb.c6, bkb.F6, bkb.x6, bkb.H6, bkb.p7));
        }
        return arrayList;
    }

    public final void h3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.z0;
        if (undoViewArr[0] != null || (parentActivity = getParentActivity()) == null) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            undoViewArr[i] = new bi3(this, parentActivity);
            FrameLayout.LayoutParams d = nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
            d.bottomMargin = this.k4 + this.m4 + d.bottomMargin;
            vi3 vi3Var = (vi3) this.fragmentView;
            UndoView undoView = undoViewArr[i];
            int i2 = this.y0 + 1;
            this.y0 = i2;
            vi3Var.addView(undoView, i2, d);
        }
    }

    public final /* synthetic */ void h4() {
        na7.q1(this.currentAccount).m4(0L, "PREMIUM_GRACE");
        m5();
    }

    public final void h5() {
        int i;
        int i2;
        if (this.N0 != null || gba.w) {
            return;
        }
        if (!this.L || this.F0.g()) {
            kx9[] kx9VarArr = new kx9[1];
            TLRPC.User f = y6c.h(y6c.t0).f();
            jia titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView == null || titleTextView.getRightDrawable() == null) {
                i = 0;
                i2 = 0;
            } else {
                this.F3.f();
                Drawable drawable = this.F3.f[0];
                Rect rect = gl.Q;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int L = (-(this.actionBar.getHeight() - rect.centerY())) - gl.L(16.0f);
                i = gl.L(4.0f) + (rect.centerX() - gl.L(16.0f));
                ym ymVar = this.G3;
                if (ymVar != null) {
                    ymVar.b(rect.centerX(), rect.centerY());
                }
                i2 = L;
            }
            sh3 sh3Var = new sh3(this, this, getParentActivity(), Integer.valueOf(i), getResourceProvider(), kx9VarArr);
            if (f != null && cf3.g(f.emoji_status) > 0) {
                sh3Var.setExpireDateHint(cf3.g(f.emoji_status));
            }
            Long l = this.D3;
            if (l != null) {
                sh3Var.setSelected(l);
            } else {
                Drawable drawable2 = this.F3.f[0];
                sh3Var.setSelected(drawable2 instanceof vl ? Long.valueOf(((vl) drawable2).h()) : null);
            }
            sh3Var.setSaveState(1);
            sh3Var.y(this.F3, titleTextView);
            th3 th3Var = new th3(this, sh3Var);
            this.N0 = th3Var;
            kx9VarArr[0] = th3Var;
            th3Var.showAsDropDown(this.actionBar, gl.L(16.0f), i2, 48);
            kx9VarArr[0].a();
        }
    }

    public final void i3(final long j, final long j2, boolean z, final qvb qvbVar) {
        TLRPC.Chat chat;
        TLRPC.User user;
        char c;
        String M0;
        String b0;
        String M02;
        if (I2(j)) {
            int i = this.T0;
            if (i != 11 && i != 12) {
                byte b = 13;
                if (i != 13) {
                    if (!z || ((this.h2 == null || this.i2 == null) && this.j2 == null)) {
                        if (i != 15) {
                            if (this.E2 == null) {
                                finishFragment();
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(zc7.a(j, j2));
                            if (this.E2.r(this, arrayList, null, false, this.L2, this.M2, this.N2, qvbVar) && this.k2) {
                                this.E2 = null;
                                return;
                            }
                            return;
                        }
                        Runnable de2Var = new de2((Object) this, j, (Object) new n30((Object) this, j, j2, (Object) qvbVar, (byte) 2), (byte) 21);
                        if (j < 0) {
                            i5(getMessagesController().K0(Long.valueOf(-j)), de2Var, null);
                            return;
                        }
                        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j));
                        TLRPC.User V12 = getMessagesController().V1(Long.valueOf(this.I));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String a0 = k96.a0(null, null, 2131754071, l7c.k(V1, true), l7c.k(V12, true));
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = a0;
                        hdVar.U = TextUtils.concat(gl.T2(k96.a0(null, null, 2131754072, l7c.k(V1, true), l7c.k(V12, true))));
                        alertDialog$Builder.j(k96.a0("Send", null, 2131745448, new Object[0]), new vu2(de2Var, (byte) 22));
                        alertDialog$Builder.g(k96.a0("Cancel", null, 2131752577, new Object[0]), new ho9(b));
                        showDialog(hdVar);
                        return;
                    }
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        if (cf3.B(j)) {
                            TLRPC.User V13 = getMessagesController().V1(Long.valueOf(getMessagesController().Y0(Integer.valueOf((int) (4294967295L & j))).user_id));
                            if (V13 == null) {
                                return;
                            }
                            M0 = k96.M0(2131745404, null);
                            b0 = k96.b0(this.h2, l7c.q(V13));
                            M02 = k96.M0(2131745448, null);
                        } else if (!cf3.D(j)) {
                            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
                            if (K0 == null) {
                                return;
                            }
                            String str = K0.title;
                            if (j2 != 0) {
                                c = 0;
                                TLRPC.TL_forumTopic f = getMessagesController().g4.f(K0.id, j2);
                                if (f != null) {
                                    str = ((Object) str) + " " + f.title;
                                }
                            } else {
                                c = 0;
                            }
                            if (this.j2 != null) {
                                M0 = k96.M0(2131754363, null);
                                String str2 = this.j2;
                                Object[] objArr = new Object[1];
                                objArr[c] = str;
                                b0 = k96.b0(str2, objArr);
                                M02 = k96.M0(2131754483, null);
                            } else {
                                M0 = k96.M0(2131745404, null);
                                String str3 = this.i2;
                                Object[] objArr2 = new Object[1];
                                objArr2[c] = str;
                                b0 = k96.b0(str3, objArr2);
                                M02 = k96.M0(2131745448, null);
                            }
                        } else if (j == getUserConfig().e()) {
                            M0 = k96.M0(2131745404, null);
                            b0 = k96.b0(this.i2, k96.M0(2131745709, null));
                            M02 = k96.M0(2131745448, null);
                        } else {
                            TLRPC.User V14 = getMessagesController().V1(Long.valueOf(j));
                            if (V14 == null || this.h2 == null) {
                                return;
                            }
                            M0 = k96.M0(2131745404, null);
                            b0 = k96.b0(this.h2, l7c.q(V14));
                            M02 = k96.M0(2131745448, null);
                        }
                        hd hdVar2 = alertDialog$Builder2.a;
                        hdVar2.S = M0;
                        hdVar2.U = gl.T2(b0);
                        alertDialog$Builder2.j(M02, new ed() { // from class: xg3
                            @Override // ed
                            public final void u(hd hdVar3, int i2) {
                                cj3.this.i3(j, j2, false, qvbVar);
                            }
                        });
                        alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                        if (showDialog(hdVar2) == null) {
                            hdVar2.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            if (cf3.D(j)) {
                TLRPC.User V15 = getMessagesController().V1(Long.valueOf(j));
                if (!V15.mutual_contact) {
                    UndoView u3 = u3();
                    if (u3 != null) {
                        u3.j(45, j, null);
                        return;
                    }
                    return;
                }
                user = V15;
                chat = null;
            } else {
                TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(-j));
                if (!hc2.N(K02) || !hc2.w(1, K02)) {
                    UndoView u32 = u3();
                    if (u32 != null) {
                        u32.j(46, j, null);
                        return;
                    }
                    return;
                }
                chat = K02;
                user = null;
            }
            hd hdVar3 = new hd(3, null, getParentActivity());
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().h1(j);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new wg3(this, hdVar3, user, chat, j, tL_messages_checkHistoryImportPeer));
            try {
                hdVar3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final /* synthetic */ void i4(TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        na7.q1(this.currentAccount).m4(0L, tL_pendingSuggestion.suggestion);
        m5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0069, code lost:
    
        if (r13.H.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [cj3, org.telegram.ui.ActionBar.d] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i5(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String a0;
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.I));
        boolean V = hc2.V(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String a02 = k96.a0(null, null, 2131754071, chat.title, l7c.k(V1, true));
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = a02;
        SpannableStringBuilder T2 = gl.T2(k96.a0(null, null, 2131754072, chat.title, l7c.k(V1, true)));
        Boolean bool = this.H.bot_participant;
        ?? r10 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().v2(chat, V1)) {
            charSequence = r10;
        }
        if (this.H.bot_admin_rights == null) {
            a0 = k96.a0(null, null, 2131754074, l7c.k(V1, true), chat.title);
        } else {
            String k = l7c.k(V1, true);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.H.bot_admin_rights;
            int i = l89.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                ls6.q(1, V ? k96.M0(2131751312, null) : k96.M0(2131751311, null), arrayList);
            }
            if (tL_chatAdminRights.post_messages && V) {
                ls6.q(1, k96.M0(2131751300, null), arrayList);
            }
            if (tL_chatAdminRights.edit_messages && V) {
                ls6.q(1, k96.M0(2131751307, null), arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                ls6.q(1, k96.M0(V ? 2131751309 : 2131751304, null), arrayList);
            }
            if (tL_chatAdminRights.ban_users && !V) {
                ls6.q(1, k96.M0(2131751316, null), arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                ls6.q(1, k96.M0(2131751318, null), arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !V) {
                ls6.q(1, k96.M0(2131751301, null), arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                ls6.q(1, k96.M0(2131751319, null), arrayList);
            }
            if (tL_chatAdminRights.anonymous && !V) {
                ls6.q(1, k96.M0(2131751291, null), arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                ls6.q(1, k96.M0(2131744664, null), arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !V) {
                ls6.q(1, k96.M0(2131748500, null), arrayList);
            }
            if (arrayList.size() == 1) {
                r10 = ((m89) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r10 = new SpannableStringBuilder();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        r10.append(", ");
                    }
                    r10.append(((m89) arrayList.get(i2)).b.toString().toLowerCase());
                }
            }
            a0 = k96.a0(null, null, 2131754073, new Object[]{k, str, r10});
        }
        charSequence = TextUtils.concat("\n\n", gl.T2(a0));
        hdVar.U = TextUtils.concat(T2, charSequence);
        alertDialog$Builder.j(k96.a0("Send", null, 2131745448, new Object[0]), new ce(runnable, (byte) 7));
        alertDialog$Builder.g(k96.a0("Cancel", null, 2131752577, new Object[0]), new ce(runnable2, (byte) 8));
        showDialog(hdVar);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        rh3 rh3Var;
        return (this.l2 || (rh3Var = this.H3) == null || rh3Var.getFragment() == null) ? bm2.h(getThemedColor(bkb.c6)) > 0.699999988079071d : this.H3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // zg6
    public final lx4 j() {
        return this.p4;
    }

    public final void j3(Canvas canvas, int i) {
        ui5 ui5Var;
        if (this.parentLayout == null || this.actionBar == null) {
            return;
        }
        float max = Math.max(this.e.e, r3());
        float f = 1.0f;
        float f2 = 1.0f - this.z1;
        float f3 = max * f2 * f2;
        if (f3 != 0.0f) {
            if (-1 >= i) {
                f = 0.0f;
                i = -1;
            }
            if (f <= 0.0f || f3 <= 0.0f || i <= 0 || (ui5Var = this.parentLayout) == null) {
                return;
            }
            ((ActionBarLayout) ui5Var).n(canvas, (int) (f * 255.0f * f3), i);
        }
    }

    public final /* synthetic */ void j4() {
        na7.q1(this.currentAccount).m4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        m5();
    }

    public final void j5(boolean z) {
        bj3[] bj3VarArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            bj3VarArr = this.f0;
            if (i2 >= bj3VarArr.length) {
                break;
            }
            bj3VarArr[i2].a.D0();
            i2++;
        }
        char c = (!z || bj3VarArr.length <= 1) ? (char) 0 : (char) 1;
        int i3 = bj3VarArr[c].h;
        if (i3 < 0 || i3 >= getMessagesController().R0().size()) {
            return;
        }
        t97 t97Var = (t97) getMessagesController().R0().get(this.f0[c].h);
        boolean d = t97Var.d();
        bj3[] bj3VarArr2 = this.f0;
        if (d) {
            bj3 bj3Var = bj3VarArr2[c];
            bj3Var.s = this.T0;
            yi3 yi3Var = bj3Var.a;
            int i4 = yi3.C3;
            yi3Var.D1();
        } else {
            if (bj3VarArr2[c ^ 1].s == 7) {
                bj3VarArr2[c].s = 8;
            } else {
                bj3VarArr2[c].s = 7;
            }
            bj3VarArr2[c].a.setScrollEnabled(true);
            na7 messagesController = getMessagesController();
            char c2 = this.f0[c].s == 8 ? (char) 1 : (char) 0;
            t97[] t97VarArr = messagesController.N;
            t97 t97Var2 = t97VarArr[c2];
            if (t97Var2 != t97Var) {
                t97VarArr[c2] = t97Var;
                int i5 = c2 ^ 1;
                if (t97VarArr[i5] == t97Var) {
                    t97VarArr[i5] = null;
                }
                if (t97VarArr[c2] != null) {
                    messagesController.Y4(null);
                } else if (t97Var2 != null) {
                    t97Var2.k.clear();
                    t97Var2.l.clear();
                }
            }
        }
        bj3[] bj3VarArr3 = this.f0;
        if (bj3VarArr3.length > 1) {
            bj3VarArr3[1].F = t97Var.p;
        }
        bj3 bj3Var2 = bj3VarArr3[c];
        eh3 eh3Var = bj3Var2.d;
        eh3Var.h = bj3Var2.s;
        eh3Var.f();
        bj3 bj3Var3 = this.f0[c];
        ah3 ah3Var = bj3Var3.c;
        if (bj3Var3.s == 0 && w3() && this.f0[c].w == 2) {
            i = 1;
        }
        ah3Var.g1(i, (int) this.O);
        K2(this.f0[c]);
    }

    public final void k3(long j, boolean z) {
        if (this.f0 == null) {
            return;
        }
        int i = 0;
        while (true) {
            bj3[] bj3VarArr = this.f0;
            if (i >= bj3VarArr.length) {
                return;
            }
            int childCount = bj3VarArr[i].a.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = this.f0[i].a.getChildAt(i2);
                    if (childAt instanceof ue3) {
                        ue3 ue3Var = (ue3) childAt;
                        if (ue3Var.getDialogId() == j) {
                            ue3Var.e0(z, true);
                            break;
                        }
                    }
                    i2++;
                }
            }
            i++;
        }
    }

    public final void k4(mj0 mj0Var) {
        ArrayList arrayList = mj0Var.c;
        if (arrayList.size() != 1) {
            xu4.f1(false, mj0Var);
            return;
        }
        tv4 tv4Var = new tv4(getParentActivity(), this.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
        tv4Var.a1(true);
        showDialog(tv4Var);
    }

    public final void k5() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        ls9 ls9Var = this.a0;
        float measuredHeight = (ls9Var == null || ls9Var.getVisibility() == 8) ? 0.0f : this.a0.getMeasuredHeight();
        float L = this.L ? gl.L(81.0f) : 0.0f;
        boolean z = this.L;
        float f8 = this.O;
        float f9 = this.z1;
        if (z) {
            f = (measuredHeight * f9) + tb4.A(1.0f, f9, L, f8);
            f2 = this.z3;
        } else {
            f = (measuredHeight * f9) + f8;
            f2 = this.z3;
        }
        float f10 = f + f2 + this.U;
        pi3 pi3Var = this.Y;
        float L2 = gl.L(4.0f) * ((pi3Var == null || pi3Var.getVisibility() != 0) ? 0.0f : this.Y.getAlpha());
        qi3 qi3Var = this.A0;
        if (qi3Var != null) {
            qi3Var.setTranslationY(f10 - L2);
            f4 = this.A0.getAlpha();
            f5 = (this.A0.getUnreadOnlyBannerHeight() + gl.L(43.0f)) * f4;
            f3 = f10 + f5;
        } else {
            f3 = f10;
            f4 = 0.0f;
            f5 = 0.0f;
        }
        fj3 fj3Var = this.L1;
        if (fj3Var != null) {
            fj3Var.setTranslationY(gl.R1(f3 - L2, (-gl.L(3.0f)) - (this.b0 == null ? gl.L(44.0f) : 0), this.b.e));
            f6 = this.L1.getMetadata().c.a;
            f7 = this.L1.c(0.0f);
        } else {
            f6 = 0.0f;
            f7 = 0.0f;
        }
        ej3 ej3Var = this.M1;
        if (ej3Var != null) {
            ej3Var.setTranslationY(f10 - L2);
            float U1 = gl.U1(Math.min(f6, f4), gl.L(7.0f), gl.L(50.0f));
            ej3 ej3Var2 = this.M1;
            float min = Math.min(gl.L(40.0f), (f7 + f5) - U1);
            Matrix matrix = ej3Var2.b;
            if (ej3Var2.e != U1 || ej3Var2.f != min) {
                ej3Var2.e = U1;
                ej3Var2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, U1);
                LinearGradient linearGradient = ej3Var2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                ej3Var2.invalidate();
            }
            this.M1.setAlpha(Math.max(f4, f6));
        }
    }

    public final void l4() {
        oj0 a = oj0.a(this.currentAccount);
        int i = a.a;
        Set<String> set = a.d;
        mj0 mj0Var = a.c;
        if (mj0Var != null && !set.contains(mj0Var.a)) {
            set.add(a.c.a);
            SharedPreferences.Editor edit = na7.q1(i).X3.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            kk7.f(i).k(kk7.i5, new Object[0]);
        }
        na7.q1(this.currentAccount).m4(0L, "BIRTHDAY_CONTACTS_TODAY");
        m5();
        m21 G = u21.b0(this).G(R.raw.gift, 4, k96.M0(2131753327, null));
        G.j = 5000;
        G.j();
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
    public final void l5(boolean z) {
        boolean z2;
        r7 r7Var;
        ?? r5;
        a8 a8Var;
        r7 r7Var2;
        qi3 qi3Var;
        de4 d;
        qi3 qi3Var2;
        de4 d2;
        TLRPC.User V1;
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
                boolean F3 = F3(dialog);
                boolean z3 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().r2(j2)) {
                    this.W2++;
                }
                if (getMessagesController().n2(j2, 0L, null)) {
                    this.S2++;
                } else {
                    this.R2++;
                }
                if (z3) {
                    this.P2++;
                }
                if (this.Y2 == 1 || dialog.folder_id == 1) {
                    this.V2++;
                } else if (j2 != j && dialog.community_id == 0 && j2 != 777000 && !getMessagesController().B2(j2, false)) {
                    i5++;
                }
                if (dialog.community_id != 0) {
                    i3++;
                }
                if (!cf3.D(j2) || j2 == j || j2 == 489000 || na7.E2(getMessagesController().V1(Long.valueOf(j2)))) {
                    i7++;
                } else if (ls6.v("dialog_bar_report", j2, notificationsSettings, true)) {
                    this.U2++;
                }
                if (cf3.x(dialog)) {
                    TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j2));
                    if (getMessagesController().B2(dialog.id, true)) {
                        this.T2++;
                        int i8 = getMessagesController().t2;
                        int i9 = na7.q5;
                        if (i8 == 1) {
                            i2++;
                            this.X2 = true;
                        }
                    } else {
                        if (F3) {
                            i6++;
                        } else {
                            this.Q2++;
                        }
                        if (K0 == null || !K0.megagroup) {
                            this.T2++;
                        } else if (hc2.t0(K0)) {
                            this.T2++;
                        }
                        i2++;
                    }
                } else {
                    boolean y = cf3.y(dialog.id);
                    if (y) {
                        getMessagesController().K0(Long.valueOf(-dialog.id));
                    }
                    if (cf3.B(dialog.id)) {
                        TLRPC.EncryptedChat Y0 = getMessagesController().Y0(Integer.valueOf((int) (dialog.id & 4294967295L)));
                        V1 = Y0 != null ? getMessagesController().V1(Long.valueOf(Y0.user_id)) : new TLRPC.TL_userEmpty();
                    } else {
                        V1 = (y || !cf3.D(dialog.id)) ? null : getMessagesController().V1(Long.valueOf(dialog.id));
                    }
                    if (V1 != null && V1.bot) {
                        int i10 = na7.q5;
                    }
                    if (F3) {
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
                    a8Var3.setText(k96.M0(2131752076, null));
                } else {
                    a8Var3.setText(k96.M0(2131752077, null));
                }
            } else {
                a8Var2.setVisibility(8);
            }
        }
        a8 a8Var4 = this.s1;
        if (a8Var4 != null && this.o1 != null) {
            if (this.V2 != 0 && i3 == 0 && this.a3 == 0) {
                String M0 = k96.M0(2131743676, null);
                this.s1.j(M0, R.drawable.msg_unarchive, null);
                this.o1.setIcon(R.drawable.msg_unarchive);
                this.o1.setContentDescription(M0);
                qi3 qi3Var3 = this.A0;
                if (qi3Var3 == null || qi3Var3.getVisibility() != 0) {
                    this.s1.setVisibility(0);
                    this.o1.setVisibility(8);
                } else {
                    this.o1.setVisibility(0);
                    this.s1.setVisibility(8);
                }
            } else if (i5 != 0 && i3 == 0 && this.a3 == 0) {
                String M02 = k96.M0(2131754169, null);
                this.s1.j(M02, R.drawable.msg_archive, null);
                this.o1.setIcon(R.drawable.msg_archive);
                this.o1.setContentDescription(M02);
                qi3 qi3Var4 = this.A0;
                if (qi3Var4 == null || qi3Var4.getVisibility() != 0) {
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
                qi3 qi3Var5 = this.A0;
                if (qi3Var5 == null || qi3Var5.getVisibility() != 0) {
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
            qi3 qi3Var6 = this.A0;
            boolean z4 = qi3Var6 == null || qi3Var6.getVisibility() != 0 || ((d2 = (qi3Var2 = this.A0).d()) != null && d2.a == qi3Var2.M);
            if (!z4) {
                try {
                    z4 = size >= m3(this.currentAccount, this.f0[0].d.h, this.Y2, this.U1).size();
                } catch (Exception unused) {
                }
            }
            a8 a8Var6 = this.r1;
            if (!z4) {
                z2 = false;
                a8Var6.setVisibility(0);
                if (this.q1 != null) {
                    if (this.Y2 != 1) {
                        if (this.A0 != null && n3(z2) > 0.5f && (d = (qi3Var = this.A0).d()) != null && d.a == qi3Var.M) {
                            int i13 = cf4.w1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = getMessagesController().G0;
                            int size2 = arrayList5.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                t97 t97Var = (t97) arrayList5.get(i14);
                                ArrayList arrayList6 = arrayList3;
                                if (!cf4.D0(this, t97Var, arrayList6, true, true).isEmpty() && !t97Var.d()) {
                                    arrayList4.add(t97Var);
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
                    this.n1.setContentDescription(k96.M0(2131752153, null));
                } else {
                    r5 = 0;
                    r7Var.setIcon(R.drawable.msg_mute);
                    this.n1.setContentDescription(k96.M0(2131752163, null));
                }
                a8Var = this.u1;
                if (a8Var != 0) {
                    if (this.P2 != 0) {
                        a8Var.j(k96.M0(2131748489, r5), R.drawable.msg_markread, r5);
                        this.u1.setVisibility(0);
                    } else if (this.W2 == 0 && i3 == 0) {
                        a8Var.j(k96.M0(2131748488, r5), R.drawable.msg_markunread, r5);
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
                    this.m1.setContentDescription(k96.M0(2131747044, null));
                    this.p1.setText(k96.M0(2131751441, null));
                    return;
                } else {
                    r7Var2.setIcon(R.drawable.msg_unpin);
                    this.m1.setContentDescription(k96.M0(2131743606, null));
                    this.p1.setText(k96.M0(2131751440, null));
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

    /* JADX WARN: Removed duplicated region for block: B:288:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0216 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m3(int i, int i2, int i3, boolean z) {
        boolean z2;
        long j;
        ArrayList arrayList;
        if (z && (arrayList = this.T1) != null) {
            return arrayList;
        }
        na7 q1 = na7.q1(j5.a(i).a);
        vf6 vf6Var = q1.R;
        ArrayList arrayList2 = q1.K;
        ArrayList arrayList3 = q1.J;
        ArrayList arrayList4 = q1.I;
        ArrayList arrayList5 = q1.H;
        ArrayList arrayList6 = q1.M;
        ArrayList arrayList7 = q1.G;
        if (i2 == 0) {
            return (i3 == 0 && C3()) ? q1.p4 : q1.U0(i3);
        }
        if (i2 == 10 || i2 == 13) {
            return q1.F;
        }
        if (i2 == 2) {
            ArrayList arrayList8 = new ArrayList(arrayList4.size() + arrayList5.size() + arrayList7.size() + 2);
            if (arrayList5.size() > 0 && this.A2) {
                arrayList8.add(new xi3(0));
                arrayList8.addAll(arrayList5);
            }
            if (arrayList4.size() > 0 && this.x2) {
                arrayList8.add(new xi3(1));
                arrayList8.addAll(arrayList4);
            }
            if (arrayList7.size() > 0) {
                int size = arrayList7.size();
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList7.get(i4);
                    if ((this.A2 && hc2.U(i, -dialog.id)) || (this.x2 && (hc2.m0(i, -dialog.id) || !hc2.S(i, -dialog.id)))) {
                        if (r9) {
                            arrayList8.add(new xi3(2));
                            r9 = false;
                        }
                        arrayList8.add(dialog);
                    }
                }
            }
            return arrayList8;
        }
        if (i2 == 3) {
            return q1.E;
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
            t97 t97Var = q1.N[i2 != 7 ? 1 : 0];
            return t97Var == null ? q1.U0(i3) : this.T0 == 3 ? t97Var.l : t97Var.k;
        }
        if (i2 == 9) {
            return q1.L;
        }
        if (i2 != 1 && i2 != 16 && i2 != 14) {
            if (i2 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList9 = new ArrayList();
            TLRPC.User V1 = q1.V1(Long.valueOf(this.I));
            TLRPC.RequestPeerType requestPeerType = this.H;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                ConcurrentHashMap concurrentHashMap = q1.d;
                int size2 = arrayList2.size();
                while (r8 < size2) {
                    Object obj = arrayList2.get(r8);
                    r8++;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) obj;
                    if (w4(getMessagesController().V1(Long.valueOf(dialog2.id)))) {
                        arrayList9.add(dialog2);
                    }
                }
                for (TLRPC.User user : concurrentHashMap.values()) {
                    if (user != null && !vf6Var.d(user.id) && w4(user)) {
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
                    ConcurrentHashMap concurrentHashMap2 = q1.b;
                    if (z3) {
                        arrayList3 = arrayList6;
                    }
                    int size3 = arrayList3.size();
                    while (r8 < size3) {
                        Object obj2 = arrayList3.get(r8);
                        r8++;
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) obj2;
                        if (v4(getMessagesController().K0(Long.valueOf(-dialog3.id)), V1)) {
                            arrayList9.add(dialog3);
                        }
                    }
                    for (TLRPC.Chat chat : concurrentHashMap2.values()) {
                        if (chat != null && !vf6Var.d(-chat.id) && v4(chat, V1)) {
                            TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                            if (hc2.T(chat)) {
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
        ArrayList arrayList10 = this.X3;
        if (arrayList10 != null) {
            return arrayList10;
        }
        this.X3 = new ArrayList();
        r9 = i2 == 16;
        if (this.B2 || this.C2 || r9) {
            int size4 = arrayList2.size();
            int i5 = 0;
            while (i5 < size4) {
                Object obj3 = arrayList2.get(i5);
                i5++;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) obj3;
                TLRPC.User V12 = q1.V1(Long.valueOf(dialog4.id));
                if (V12 != null && !l7c.y(V12)) {
                    if (!r9) {
                        if (V12.bot) {
                            if (this.C2) {
                                if (l7c.C(V12)) {
                                }
                            }
                        } else if (this.B2) {
                            if (l7c.C(V12)) {
                            }
                        }
                        this.X3.add(dialog4);
                    } else if (!l7c.B(V12.id) && !na7.E2(V12)) {
                        this.X3.add(dialog4);
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
                TLRPC.Chat K0 = q1.K0(Long.valueOf(-dialog5.id));
                if (K0 != null && !hc2.V(K0)) {
                    if (r9) {
                        if (hc2.n0(K0)) {
                            this.X3.add(dialog5);
                        }
                    } else if (q1.v(dialog5)) {
                        this.X3.add(dialog5);
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
                TLRPC.Chat K02 = q1.K0(Long.valueOf(-dialog6.id));
                if (K02 != null && !hc2.V(K02)) {
                    if (r9) {
                        if (hc2.n0(K02)) {
                            this.X3.add(dialog6);
                        }
                    } else if (q1.v(dialog6)) {
                        if (this.z2) {
                            if (!hc2.n0(K02)) {
                                this.X3.add(dialog6);
                            }
                        }
                        if (this.y2 && hc2.n0(K02)) {
                            this.X3.add(dialog6);
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
                TLRPC.Chat K03 = q1.K0(Long.valueOf(-dialog7.id));
                if (r9) {
                    if (K03 instanceof TLRPC.TL_channel) {
                        this.X3.add(dialog7);
                    }
                } else if (q1.v(dialog7)) {
                    this.X3.add(dialog7);
                }
            }
        }
        na7 messagesController = getMessagesController();
        ArrayList arrayList11 = this.X3;
        if (arrayList11 == null) {
            messagesController.getClass();
        } else {
            Collections.sort(arrayList11, messagesController.s4);
        }
        return this.X3;
    }

    public final void m4(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            m21 I = u21.b0(this).I(R.raw.gift, k96.M0(2131746665, null), k96.M0(2131746664, null));
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
            ir2.v(null, 2131743640, u21.b0(this), R.raw.error, 36);
            return;
        }
        if (getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
            String M0 = k96.M0(2131746661, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131746662, null);
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
            showDialog(hdVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Runnable, wjb] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5() {
        boolean z;
        boolean z2;
        l9 l9Var;
        rh3 rh3Var;
        gt4 gt4Var;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i;
        boolean z3;
        boolean z4;
        rh3 rh3Var2;
        long j;
        mj0 b;
        ?? r6;
        String G;
        StringBuilder sb;
        final long j2;
        final long j3;
        if (this.L1 == null || this.O1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        dk3 dk3Var = this.O1;
        boolean z5 = false;
        r7 = false;
        boolean z6 = false;
        if (dk3Var != null) {
            try {
                ((oy8) ((pb0) dk3Var.h.getImageReceiver().n0).K).M(null);
            } catch (Exception unused) {
            }
            dk3 dk3Var2 = this.O1;
            dk3Var2.setCompact(false);
            dk3Var2.a(y6c.t0, null);
            be0 be0Var = dk3Var2.h;
            be0Var.setVisibility(8);
            be0Var.b();
        }
        byte b2 = 19;
        long j4 = 0;
        final byte b3 = 1;
        if (!isInPreviewMode()) {
            if (getMessagesController().t2()) {
                this.O1.setOnClickListener(new zf3(this, (byte) 12));
                this.O1.c(k96.M0(2131754700, null), k96.M0(2131754701, null), false, true);
            } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().u3.contains("SETUP_PASSKEY")) {
                this.O1.setOnClickListener(new zf3(this, b2));
                this.O1.b(vu3.p(k96.M0(2131747437, null), this.O1.c, new sg3(this, b3)), k96.M0(2131747438, null));
                this.O1.setOnCloseListener(new zf3(this, (byte) 24));
            } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().u3.contains("PREMIUM_GRACE")) {
                this.O1.setOnClickListener(new zf3(this, (byte) 25));
                this.O1.b(vu3.p(k96.M0(2131749350, null), this.O1.c, new sg3(this, b3)), k96.M0(2131749354, null));
                this.O1.setOnCloseListener(new zf3(this, (byte) 26));
            } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().w3 != null) {
                final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().w3;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                k27.b(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true, 0);
                Spannable A5 = k27.A5(vu3.m(spannableStringBuilder, this.O1.c.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.title.entities, this.O1.c.getPaint().getFontMetricsInt(), false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                k27.b(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true, 0);
                this.O1.b(A5, k27.A5(vu3.m(spannableStringBuilder2, this.O1.d.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.description.entities, this.O1.d.getPaint().getFontMetricsInt(), false));
                dk3 dk3Var3 = this.O1;
                final byte b4 = z5 ? (byte) 1 : (byte) 0;
                dk3Var3.setOnClickListener(new View.OnClickListener(this) { // from class: ug3
                    public final /* synthetic */ cj3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b5 = b4;
                        TLRPC.TL_pendingSuggestion tL_pendingSuggestion2 = tL_pendingSuggestion;
                        cj3 cj3Var = this.b;
                        switch (b5) {
                            case 0:
                                d01.t(cj3Var.getParentActivity(), tL_pendingSuggestion2.url);
                                break;
                            default:
                                cj3Var.i4(tL_pendingSuggestion2);
                                break;
                        }
                    }
                });
                this.O1.setOnCloseListener(new View.OnClickListener(this) { // from class: ug3
                    public final /* synthetic */ cj3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b5 = b3;
                        TLRPC.TL_pendingSuggestion tL_pendingSuggestion2 = tL_pendingSuggestion;
                        cj3 cj3Var = this.b;
                        switch (b5) {
                            case 0:
                                d01.t(cj3Var.getParentActivity(), tL_pendingSuggestion2.url);
                                break;
                            default:
                                cj3Var.i4(tL_pendingSuggestion2);
                                break;
                        }
                    }
                });
            } else {
                if (this.Y2 == 0 && this.a3 == 0 && na7.q1(this.currentAccount).u3.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                    gta v = gta.v(this.currentAccount, false);
                    ArrayList arrayList = v.z;
                    if (!arrayList.isEmpty()) {
                        long j5 = -v.f.amount;
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i2);
                            long j6 = j4;
                            long n = cf3.n(starsSubscription.peer);
                            if (n >= j6) {
                                if (getMessagesController().V1(Long.valueOf(n)) == null) {
                                    i2++;
                                    j4 = j6;
                                }
                                j5 += starsSubscription.pricing.amount;
                                i2++;
                                j4 = j6;
                            } else {
                                if (getMessagesController().K0(Long.valueOf(-n)) == null) {
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
                            gta v2 = gta.v(this.currentAccount, false);
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
                                    long n2 = cf3.n(peer);
                                    if (j3 == j) {
                                        j3 = n2;
                                    }
                                    if (n2 >= j) {
                                        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(n2));
                                        if (V1 == null) {
                                            i3++;
                                            z6 = objArr == true ? 1 : 0;
                                        } else {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(l7c.q(V1));
                                            j7 += starsSubscription2.pricing.amount;
                                            i3++;
                                            z6 = objArr == true ? 1 : 0;
                                        }
                                    } else {
                                        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-n2));
                                        if (K0 == null) {
                                            i3++;
                                            z6 = objArr == true ? 1 : 0;
                                        } else {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(K0.title);
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
                            this.O1.setOnClickListener(new View.OnClickListener() { // from class: vg3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    cj3 cj3Var = cj3.this;
                                    new zua(cj3Var.getParentActivity(), cj3Var.getResourceProvider(), j2, 2, sb3, new wf3(cj3Var, (byte) 11), j3).show();
                                }
                            });
                            dk3 dk3Var4 = this.O1;
                            long j8 = j2 - v2.f.amount;
                            if (j8 > j) {
                                j2 = j8;
                            }
                            Object[] objArr2 = new Object[1];
                            objArr2[z7 ? 1 : 0] = sb3;
                            dk3Var4.b(jva.a1(z7, k96.K("StarsSubscriptionExpiredHintTitle2", (int) j2, ',', objArr2), 0.72f, null), k96.M0(2131744752, null));
                            this.O1.setOnCloseListener(new zf3(this, (byte) 13));
                        }
                        if (this.Y2 != 0 && this.a3 == j && !getMessagesController().F3() && (b = oj0.a(this.currentAccount).b()) != null && !b.c.isEmpty() && !getMessagesController().v3.contains("BIRTHDAY_CONTACTS_TODAY")) {
                            mj0 b5 = oj0.a(this.currentAccount).b();
                            ArrayList arrayList3 = b5.c;
                            this.O1.setOnClickListener(new xf3((Object) this, (Object) b5, (byte) 4));
                            this.O1.a(this.currentAccount, arrayList3);
                            dk3 dk3Var5 = this.O1;
                            if (arrayList3.size() == 1) {
                                r6 = 0;
                                G = k96.a0(null, null, 2131753703, l7c.l((TLRPC.User) arrayList3.get(0)));
                            } else {
                                r6 = 0;
                                G = k96.G(arrayList3.size(), "BirthdayTodayMultipleTitle", new Object[0]);
                            }
                            dk3Var5.b(vu3.p(gl.O2(G, bkb.H6, 2, r6, r6), this.O1.c, new sg3(this, b3)), k96.a0(null, null, arrayList3.size() == 1 ? 2131753704 : 2131753707, new Object[0]));
                            this.O1.setOnCloseListener(new zf3(this, (byte) 14));
                            gta.v(this.currentAccount, false).T();
                        } else if (this.Y2 != 0 && this.a3 == j && na7.q1(this.currentAccount).u3.contains("BIRTHDAY_SETUP") && getMessagesController().W1(getUserConfig().e()) != null && getMessagesController().W1(getUserConfig().e()).birthday == null) {
                            qu2.r(this.currentAccount).D(false);
                            this.O1.setOnClickListener(new zf3(this, (byte) 15));
                            this.O1.b(vu3.p(k96.M0(2131753709, null), this.O1.c, new sg3(this, b3)), k96.a0(null, null, 2131753710, new Object[0]));
                            this.O1.setOnCloseListener(new zf3(this, (byte) 16));
                        } else if (!((na7.q1(this.currentAccount).E3() && this.Y2 == 0 && this.a3 == j) ? na7.q1(this.currentAccount).u3.contains("PREMIUM_CHRISTMAS") : false)) {
                            this.O1.setOnClickListener(new x00((byte) 3));
                            this.O1.b(vu3.m(gl.O2(k96.M0(2131749501, null), bkb.H6, 2, null, null), null, false, null, 0), k96.a0(null, null, 2131753328, new Object[0]));
                            this.O1.setOnCloseListener(new zf3(this, (byte) 17));
                        } else if (!na7.q1(this.currentAccount).E3() && this.Y2 == 0 && this.a3 == j && na7.q1(this.currentAccount).u3.contains("PREMIUM_RESTORE") && !getUserConfig().p() && hq6.d0(this.currentAccount).i0(false) != null) {
                            this.O1.setOnClickListener(new zf3(this, (byte) 18));
                            this.O1.b(gl.O2(k96.a0(null, null, 2131745871, hq6.d0(this.currentAccount).i0(false)), bkb.H6, 2, null, null), k96.M0(2131745872, null));
                        } else if (na7.q1(this.currentAccount).E3() || this.Y2 != 0 || this.a3 != j || ((!(na7.q1(this.currentAccount).u3.contains("PREMIUM_UPGRADE") && getUserConfig().p()) && (!na7.q1(this.currentAccount).u3.contains("PREMIUM_ANNUAL") || getUserConfig().p())) || (!y6c.h(this.currentAccount).p() ? hq6.d0(this.currentAccount).i0(false) == null : w01.b() || hq6.d0(this.currentAccount).i0(true) == null))) {
                            if (this.Q1 != null && this.R1 != null) {
                                if (r0.longValue() / this.R1.longValue() < 0.3f) {
                                    na7.c1().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                } else if (System.currentTimeMillis() > na7.c1().getLong("cache_hint_showafter", j)) {
                                    this.O1.setOnClickListener(new zf3(this, (byte) 21));
                                    this.O1.b(gl.O2(k96.a0(null, null, 2131752036, gl.i0(this.Q1.longValue(), false, false)), bkb.H6, 2, null, null), k96.M0(2131752037, null));
                                }
                            }
                            if (this.Y2 == 0 && this.a3 == 0 && getUserConfig().f() != null && ((getUserConfig().f().photo == null || (getUserConfig().f().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && na7.q1(this.currentAccount).u3.contains("USERPIC_SETUP"))) {
                                this.O1.setOnClickListener(new zf3(this, (byte) 22));
                                this.O1.h.setVisibility(0);
                                pb0 pb0Var = new pb0((wjb) null);
                                pb0Var.setBounds(0, 0, gl.L(36.0f), gl.L(36.0f));
                                long e = getUserConfig().e();
                                pb0Var.A = true;
                                pb0Var.b = true;
                                pb0Var.c = false;
                                int i4 = bkb.o8[pb0.d(e)];
                                wjb wjbVar = pb0Var.z;
                                pb0Var.d = bkb.v0(i4, wjbVar);
                                pb0Var.e = bkb.v0(bkb.p8[pb0.d(e)], wjbVar);
                                pb0Var.n = (byte) 0;
                                pb0Var.m = false;
                                pb0.a("", "", "", pb0Var.q);
                                pb0Var.K = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                this.O1.h.setImageDrawable(pb0Var);
                                this.O1.b(vu3.p(k96.M0(2131749109, null), this.O1.c, new sg3(this, b3)), k96.M0(2131749108, null));
                                this.O1.setOnCloseListener(new zf3(this, (byte) 23));
                            } else {
                                if (this.Y2 == 0 && this.a3 == 0 && org.telegram.messenger.a.a != null) {
                                    for (String str : na7.q1(this.currentAccount).u3) {
                                        org.telegram.messenger.a.a.getClass();
                                    }
                                }
                                z5 = false;
                            }
                        } else {
                            this.C3 = na7.q1(this.currentAccount).u3.contains("PREMIUM_UPGRADE");
                            this.O1.setOnClickListener(new zf3(this, (byte) 20));
                            this.O1.b(gl.O2(k96.a0(null, null, this.C3 ? 2131745742 : 2131743567, hq6.d0(this.currentAccount).i0(false)), bkb.H6, 2, null, null), k96.M0(this.C3 ? 2131743570 : 2131745743, null));
                        }
                    } else if (!v.A) {
                        v.A = true;
                        TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                        tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                        tL_getStarsSubscriptions.missing_balance = true;
                        tL_getStarsSubscriptions.offset = "";
                        ConnectionsManager.getInstance(v.a).sendRequest(tL_getStarsSubscriptions, new hsa(v, z5 ? (byte) 1 : (byte) 0));
                    }
                }
                j = 0;
                if (this.Y2 != 0) {
                }
                if (this.Y2 != 0) {
                }
                if (!((na7.q1(this.currentAccount).E3() && this.Y2 == 0 && this.a3 == j) ? na7.q1(this.currentAccount).u3.contains("PREMIUM_CHRISTMAS") : false)) {
                }
            }
            z5 = true;
        }
        rh3 rh3Var3 = this.H3;
        fm0 fm0Var = this.b;
        if ((rh3Var3 != null && rh3Var3.c()) || fm0Var.f) {
            z5 = false;
        }
        this.L1.j(this.O1, z5, true);
        J2(true);
        if (this.fragmentView != null && this.L1 != null) {
            boolean z8 = !isInPreviewMode() && this.Y2 == 0 && this.a3 == 0 && this.T0 == 0 && !getMessagesController().P1().b.isEmpty() && ((rh3Var2 = this.H3) == null || !rh3Var2.c()) && !fm0Var.f;
            if (z8) {
                if (this.P1 == null) {
                    x4c x4cVar = new x4c(getParentActivity());
                    this.P1 = x4cVar;
                    this.L1.addView(x4cVar);
                }
                x4c x4cVar2 = this.P1;
                int i5 = this.currentAccount;
                TextView textView = x4cVar2.c;
                TextView textView2 = x4cVar2.b;
                ArrayList arrayList4 = na7.q1(i5).P1().b;
                w4c w4cVar = x4cVar2.d;
                w4cVar.setText(k96.M0(2131743671, null));
                w4cVar.a(false, false);
                w4c w4cVar2 = x4cVar2.e;
                w4cVar2.setText(k96.M0(2131743661, null));
                w4cVar2.a(false, false);
                if (arrayList4 != null) {
                    if (arrayList4.size() == 1) {
                        u4c u4cVar = (u4c) arrayList4.get(0);
                        boolean z9 = u4cVar.a;
                        String str2 = u4cVar.f;
                        textView2.setText(k96.M0(z9 ? 2131743651 : 2131743652, null));
                        String valueOf = String.valueOf(u4cVar.e);
                        if (!TextUtils.isEmpty(str2) && !valueOf.isEmpty()) {
                            valueOf = valueOf.concat(", ");
                        }
                        String h = b00.h(valueOf, str2);
                        if (u4cVar.a) {
                            textView.setText(k96.a0(null, null, 2131743653, "@" + cf3.s(u4cVar.c), h));
                            z4 = true;
                        } else {
                            textView.setText(k96.a0(null, null, 2131743654, h));
                            z4 = false;
                        }
                        z3 = z4;
                        w4cVar.setOnClickListener(new hm1(this, z3, i5, arrayList4));
                        w4cVar2.setOnClickListener(new wg((Object) x4cVar2, i5, (Object) arrayList4, (byte) 19));
                    } else if (arrayList4.size() > 1) {
                        textView2.setText(k96.M0(2131743652, null));
                        String str3 = ((u4c) arrayList4.get(0)).f;
                        int i6 = 1;
                        while (true) {
                            if (i6 >= arrayList4.size()) {
                                break;
                            }
                            if (!TextUtils.equals(str3, ((u4c) arrayList4.get(i6)).f)) {
                                str3 = null;
                                break;
                            }
                            i6++;
                        }
                        if (str3 == null) {
                            textView.setText(k96.G(arrayList4.size(), "UnconfirmedAuthMultiple", new Object[0]));
                        } else {
                            textView.setText(k96.G(arrayList4.size(), "UnconfirmedAuthMultipleFrom", str3));
                        }
                    }
                }
                z3 = false;
                w4cVar.setOnClickListener(new hm1(this, z3, i5, arrayList4));
                w4cVar2.setOnClickListener(new wg((Object) x4cVar2, i5, (Object) arrayList4, (byte) 19));
            }
            x4c x4cVar3 = this.P1;
            if (x4cVar3 != null) {
                this.L1.j(x4cVar3, z8, true);
            }
        }
        if (this.fragmentView == null || this.L1 == null) {
            return;
        }
        if (!isInPreviewMode() && this.Y2 == 0 && this.a3 == 0 && this.T0 == 0) {
            kt4 giftAuctionsController = getGiftAuctionsController();
            if (!giftAuctionsController.d) {
                SharedPreferences sharedPreferences = giftAuctionsController.getMessagesController().X3;
                if (System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("lastGiftAuctionTimeUpdate", 0L) : 0L) < 86400000) {
                    giftAuctionsController.d = true;
                    TL_payments.TL_getStarGiftActiveAuctions tL_getStarGiftActiveAuctions = new TL_payments.TL_getStarGiftActiveAuctions();
                    ArrayList arrayList5 = new ArrayList();
                    LongSparseArray longSparseArray = giftAuctionsController.b;
                    int size = longSparseArray.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ht4 ht4Var = (ht4) longSparseArray.valueAt(i7);
                        gt4 gt4Var2 = ht4Var.b;
                        if (gt4Var2 != null && !gt4Var2.f() && (tL_starGiftAuctionState = (gt4Var = ht4Var.b).f) != null && (i = gt4Var.e.bid_date) > 0) {
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
                        j9 = hq6.r(hq6.r(j9, l.longValue() & 4294967295L), l.longValue() >> 32);
                    }
                    tL_getStarGiftActiveAuctions.hash = j9;
                    z = false;
                    giftAuctionsController.getConnectionsManager().sendRequestTyped(tL_getStarGiftActiveAuctions, new hc(0 == true ? 1 : 0), new ur4((Object) giftAuctionsController, (byte) 1));
                    if (!giftAuctionsController.c.isEmpty() && (((rh3Var = this.H3) == null || !rh3Var.c()) && !fm0Var.f)) {
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

    public final float n3(boolean z) {
        return (z ? 1.0f - this.b.e : 1.0f) * (1.0f - r3()) * this.r.e;
    }

    public final /* synthetic */ void n4(TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
        if (W1 != null) {
            tL_birthday2 = W1.birthday;
            W1.flags2 |= 32;
            W1.birthday = tL_birthday;
        } else {
            tL_birthday2 = null;
        }
        getMessagesController().h2();
        getConnectionsManager().sendRequest(updatebirthday, new en0((Object) this, (Object) W1, (Object) tL_birthday2, (byte) 21), 1024);
        na7.q1(this.currentAccount).m4(0L, "BIRTHDAY_SETUP");
        m5();
    }

    public final void n5() {
        ns9 ns9Var;
        yi3 yi3Var;
        try {
            hh3 hh3Var = this.D1;
            if (hh3Var != null && hh3Var.getEditField() != null) {
                this.D1.getEditField().setCursorColor(getThemedColor(bkb.Me));
            }
            NumberTextView numberTextView = this.j1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(bkb.x8));
            }
            qi3 qi3Var = this.A0;
            int i = 0;
            if (qi3Var != null && (qi3Var.getSelectorDrawable() instanceof GradientDrawable)) {
                a aVar = this.actionBar;
                ((GradientDrawable) this.A0.getSelectorDrawable()).setColor(getThemedColor(aVar != null && aVar.y() ? bkb.wi : bkb.J8));
                this.A0.invalidate();
            }
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                if (this.Y2 != 0 || this.a3 != 0) {
                    aVar2.L(getThemedColor(bkb.P8), false);
                    this.actionBar.L(getThemedColor(bkb.Q8), true);
                }
                if (this.actionBar.y()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(bkb.c6));
                }
                t5();
            }
            if (this.f0 != null) {
                while (true) {
                    bj3[] bj3VarArr = this.f0;
                    if (i >= bj3VarArr.length) {
                        break;
                    }
                    bj3 bj3Var = bj3VarArr[i];
                    if (bj3Var != null && (yi3Var = bj3Var.a) != null) {
                        yi3Var.setGlowColor(getThemedColor(bkb.c6));
                    }
                    i++;
                }
            }
            hi3 hi3Var = this.D0;
            if (hi3Var != null && (ns9Var = hi3Var.b0) != null) {
                ns9Var.setGlowColor(getThemedColor(bkb.c6));
            }
            jh3 jh3Var = this.E1;
            if (jh3Var != null) {
                jh3Var.setScrimViewBackgroundColor(getThemedColor(bkb.c6));
            }
            je5 je5Var = this.q0;
            if (je5Var != null) {
                je5Var.i(getThemedColor(bkb.vj));
            }
            je5 je5Var2 = this.r0;
            if (je5Var2 != null) {
                je5Var2.i(getThemedColor(bkb.vj));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final int o3() {
        if (!this.L) {
            return gl.L(48.0f);
        }
        return gl.L(48.0f) + gl.L(81.0f);
    }

    public final void o4() {
        na7.q1(this.currentAccount).m4(0L, "BIRTHDAY_SETUP");
        m5();
        m21 K = u21.b0(this).K(R.raw.chats_infotip, k96.M0(2131753711, null), k96.M0(2131745303, null), new sg3(this, (byte) 9));
        K.j = 5000;
        K.j();
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
    public final void o5(boolean z, boolean z2) {
        ?? r5;
        int K0;
        t97 t97Var;
        boolean z3;
        Object[] objArr;
        boolean z4;
        boolean z5;
        if (this.A0 == null || this.inPreviewMode || this.s3) {
            return;
        }
        rh3 rh3Var = this.H3;
        if (rh3Var == null || !rh3Var.c()) {
            cs5 cs5Var = this.M0;
            String str = null;
            if (cs5Var != null) {
                cs5Var.u();
                this.M0 = null;
            }
            ArrayList R0 = getMessagesController().R0();
            int size = R0.size();
            fm0 fm0Var = this.r;
            boolean z6 = false;
            if (size <= 1) {
                r5 = 0;
                if (this.A0.getVisibility() != 8) {
                    this.A0.setIsEditing(false);
                    Z4(false);
                    this.p3 = false;
                    if (this.o3) {
                        this.o3 = false;
                        this.f0[0].setTranslationX(0.0f);
                        this.f0[1].setTranslationX(r2[0].getMeasuredWidth());
                    }
                    if (this.f0[0].h != this.A0.getDefaultTabId()) {
                        this.f0[0].h = this.A0.getDefaultTabId();
                        eh3 eh3Var = this.f0[0].d;
                        eh3Var.h = 0;
                        eh3Var.f();
                        bj3 bj3Var = this.f0[0];
                        bj3Var.s = this.T0;
                        bj3Var.d.f();
                    }
                    this.f0[1].setVisibility(8);
                    bj3 bj3Var2 = this.f0[1];
                    bj3Var2.h = 0;
                    eh3 eh3Var2 = bj3Var2.d;
                    eh3Var2.h = 0;
                    eh3Var2.f();
                    bj3 bj3Var3 = this.f0[1];
                    bj3Var3.s = this.T0;
                    bj3Var3.d.f();
                    this.x = false;
                    if (this.fragmentView != null) {
                        boolean z7 = (this.isPaused || this.V3 != null) ? false : z2;
                        if (!this.s3) {
                            fm0Var.a(false, z7);
                        }
                    }
                    int i = 0;
                    while (true) {
                        bj3[] bj3VarArr = this.f0;
                        if (i >= bj3VarArr.length) {
                            break;
                        }
                        bj3 bj3Var4 = bj3VarArr[i];
                        if (bj3Var4.s == 0 && bj3Var4.w == 2 && w3() && ((K0 = this.f0[i].c.K0()) == 0 || K0 == 1)) {
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
                    boolean z9 = (this.isPaused || this.V3 != null) ? false : z2;
                    if (!this.s3) {
                        fm0Var.a(this.x, z9);
                    }
                }
                int currentTabId = this.A0.getCurrentTabId();
                int currentTabStableId = this.A0.getCurrentTabStableId();
                if (currentTabId == this.A0.getDefaultTabId() || currentTabId < R0.size()) {
                    objArr = false;
                } else {
                    this.A0.M = -1;
                    objArr = true;
                }
                qi3 qi3Var = this.A0;
                qi3Var.h.clear();
                qi3Var.k0.clear();
                qi3Var.m0.clear();
                qi3Var.n0.clear();
                qi3Var.o0.clear();
                qi3Var.p0.clear();
                qi3Var.N = 0;
                int size2 = R0.size();
                int i2 = 0;
                while (i2 < size2) {
                    if (((t97) R0.get(i2)).d()) {
                        this.A0.a(i2, 0, k96.M0(2131750795, str), null, false, true, ((t97) R0.get(i2)).p);
                        z5 = z6;
                    } else {
                        t97 t97Var2 = (t97) R0.get(i2);
                        z5 = z6;
                        this.A0.a(i2, t97Var2.o, t97Var2.b, t97Var2.c, t97Var2.n, false, ((t97) R0.get(i2)).p);
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
                            qi3 qi3Var2 = this.A0;
                            if (qi3Var2.i(qi3Var2.l0.get(currentTabId, -1))) {
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
                    bj3[] bj3VarArr2 = this.f0;
                    if (i3 >= bj3VarArr2.length) {
                        break;
                    }
                    if (bj3VarArr2[i3].h >= R0.size()) {
                        this.f0[i3].h = R0.size() - 1;
                    }
                    this.f0[i3].a.setScrollingTouchSlop(1);
                    i3++;
                }
                qi3 qi3Var3 = this.A0;
                qi3Var3.G.setItemAnimator(z8 ? qi3Var3.t0 : null);
                qi3Var3.J.f();
                if (isEmpty) {
                    j5(z10);
                }
                qi3 qi3Var4 = this.A0;
                int currentTabId2 = qi3Var4.getCurrentTabId();
                ArrayList arrayList = qi3Var4.h;
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        z4 = false;
                        break;
                    } else {
                        if (((de4) arrayList.get(i4)).a == currentTabId2) {
                            z4 = ((de4) arrayList.get(i4)).f;
                            break;
                        }
                        i4++;
                    }
                }
                if (z4) {
                    qi3 qi3Var5 = this.A0;
                    ArrayList arrayList2 = qi3Var5.h;
                    if (!arrayList2.isEmpty()) {
                        r5 = 0;
                        qi3Var5.g((de4) arrayList2.get(0), 0);
                    }
                }
                r5 = 0;
            } else {
                r5 = 0;
            }
            l5(r5);
            int i5 = this.f0[r5].s;
            if ((i5 == 7 || i5 == 8) && (t97Var = getMessagesController().N[i5 - 7]) != null) {
                for (int i6 = 0; i6 < R0.size(); i6++) {
                    t97 t97Var3 = (t97) R0.get(i6);
                    if (t97Var3 == null || t97Var3.a != t97Var.a) {
                    }
                }
                z3 = false;
                j5(false);
                B5(-1, this.A0.getVisibility() != 0 ? z3 : true);
            }
            z3 = false;
            B5(-1, this.A0.getVisibility() != 0 ? z3 : true);
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
            cs5 cs5Var = this.M0;
            if (cs5Var == null) {
                qi3 qi3Var = this.A0;
                if (qi3Var == null || !qi3Var.n) {
                    a aVar = this.actionBar;
                    if (aVar == null || !aVar.y()) {
                        if (!this.b.f) {
                            qi3 qi3Var2 = this.A0;
                            if (qi3Var2 != null && qi3Var2.getVisibility() == 0 && !this.j3) {
                                qi3 qi3Var3 = this.A0;
                                if (!qi3Var3.P && !this.o3) {
                                    ArrayList arrayList = qi3Var3.h;
                                    if (!arrayList.isEmpty() && qi3Var3.M != ((de4) arrayList.get(0)).a) {
                                        if (z) {
                                            qi3 qi3Var4 = this.A0;
                                            ArrayList arrayList2 = qi3Var4.h;
                                            if (!arrayList2.isEmpty()) {
                                                qi3Var4.g((de4) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            hh3 hh3Var = this.D1;
                            if (hh3Var == null || !hh3Var.Q0()) {
                                oh3 oh3Var = this.F0;
                                if (oh3Var.P != 0 || oh3Var.T.K0() == 0) {
                                    return super.onBackPressed(z);
                                }
                                oh3Var.h.z0(0);
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
                        hi3 hi3Var = this.D0;
                        if (hi3Var != null && hi3Var.getVisibility() == 0) {
                            this.D0.R(false);
                        }
                        y3(true);
                        return false;
                    }
                } else if (z) {
                    qi3Var.setIsEditing(false);
                    Z4(false);
                    return false;
                }
            } else if (z) {
                cs5Var.u();
                this.M0 = null;
                return false;
            }
        } else if (z) {
            this.H3.a();
            hi3 hi3Var2 = this.D0;
            if (hi3Var2 != null) {
                hi3Var2.S();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyHidden() {
        sb sbVar;
        qi3 qi3Var;
        if (this.X1) {
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.n(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                hi3 hi3Var = this.D0;
                if (hi3Var != null) {
                    hi3Var.e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
            this.X1 = false;
        }
        if (!this.L && (qi3Var = this.A0) != null && qi3Var.getVisibility() == 0 && this.r.f) {
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
        V2();
        this.s0 = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        je5 je5Var;
        super.onBecomeFullyVisible();
        byte b = 0;
        if (D3()) {
            SharedPreferences c1 = na7.c1();
            boolean z = c1.getBoolean("archivehint", true);
            boolean isEmpty = m3(this.currentAccount, this.T0, this.Y2, false).isEmpty();
            if (z && isEmpty) {
                na7.c1().edit().putBoolean("archivehint", false).commit();
                z = false;
            }
            if (z) {
                c1.edit().putBoolean("archivehint", false).commit();
                X4();
            }
        }
        if (this.s0 && !this.t0 && (je5Var = this.q0) != null && this.P3) {
            this.t0 = true;
            this.s0 = false;
            je5Var.v();
        }
        gl.e3(new sg3(this, b), 200L);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cs5 cs5Var = this.M0;
        if (cs5Var != null) {
            cs5Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onDialogDismiss(Dialog dialog) {
        hd hdVar;
        super.onDialogDismiss(dialog);
        if (this.Y2 == 0 && this.a3 == 0 && (hdVar = this.V1) != null && dialog == hdVar && getParentActivity() != null) {
            A2(false);
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
                this.b3 = getMessagesController().K0(Long.valueOf(this.a3));
                this.c3 = getMessagesController().L0(this.a3);
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
            this.W1 = na7.d1().getBoolean("askAboutContacts", true);
            gba.t();
        }
        kk7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.L3 = new wtc(notificationCenter, this);
        if (this.p2 == null) {
            this.f2 = getConnectionsManager().getConnectionState();
            this.L3.e(kk7.k4);
            if (!this.n2) {
                this.L3.e(kk7.K4);
                this.L3.e(kk7.C4);
                this.L3.b(kk7.Q2);
                this.L3.b(kk7.c2);
            }
            wtc wtcVar = this.L3;
            wtcVar.b(kk7.r);
            wtcVar.b(kk7.N2);
            wtcVar.b(kk7.O2);
            wtcVar.b(kk7.P2);
            wtcVar.b(2);
            wtcVar.b(kk7.X);
            wtcVar.b(kk7.N);
            wtcVar.b(kk7.H2);
            wtcVar.b(kk7.g0);
            wtcVar.b(kk7.e0);
            wtcVar.b(kk7.I);
            wtcVar.b(kk7.J);
            wtcVar.b(kk7.L);
            wtcVar.b(kk7.O0);
            wtcVar.b(kk7.r0);
            wtcVar.b(kk7.s5);
            wtcVar.b(kk7.R0);
            wtcVar.b(kk7.S1);
            wtcVar.b(kk7.d5);
            wtcVar.b(kk7.J2);
            wtcVar.b(kk7.c0);
            wtcVar.b(kk7.r1);
            wtcVar.b(kk7.a5);
            wtcVar.b(kk7.b5);
            wtcVar.b(kk7.M);
            wtcVar.b(kk7.o5);
            wtcVar.b(kk7.h5);
            this.L3.e(kk7.m0);
        }
        wtc wtcVar2 = this.L3;
        wtcVar2.b(kk7.v);
        wtcVar2.b(kk7.U4);
        wtcVar2.b(kk7.c5);
        wtcVar2.b(kk7.S);
        wtcVar2.b(kk7.N4);
        wtcVar2.b(kk7.v5);
        wtcVar2.b(kk7.x5);
        wtcVar2.b(kk7.a3);
        wtcVar2.b(kk7.e3);
        wtcVar2.b(kk7.i5);
        wtcVar2.b(kk7.z3);
        wtcVar2.b(kk7.B3);
        wtcVar2.b(kk7.U5);
        wtcVar2.b(kk7.V5);
        wtcVar2.b(kk7.R3);
        wtcVar2.b(kk7.S3);
        if (this.T0 == 0) {
            this.L3.b(kk7.B5);
            this.L3.b(kk7.O1);
        }
        t4(getAccountInstance());
        g2b M1 = getMessagesController().M1();
        if (!M1.A) {
            M1.V();
            if (!M1.s) {
                ConnectionsManager.getInstance(M1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new i1b(M1, objArr == true ? 1 : 0));
            }
        }
        getMessagesController().c3(this.Y2);
        if (this.V3 != null && !getMessagesStorage().R) {
            k83 k83Var = this.V3;
            if (k83Var.getParent() != null) {
                ((ViewGroup) k83Var.getParent()).removeView(k83Var);
            }
            this.V3 = null;
        }
        if (D3()) {
            g2b M12 = getMessagesController().M1();
            if (M12.z) {
                M12.S(true);
            }
        } else {
            getMessagesController().M1().V();
        }
        getContactsController().B();
        if (getMessagesController().P3) {
            vp9 D1 = getMessagesController().D1();
            if (!D1.e) {
                D1.g(true);
            }
        }
        if (this.a3 != 0) {
            getMessagesController().X2(0, this.a3, true);
        }
        oj0 a = oj0.a(this.currentAccount);
        if (!a.e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = a.b;
            Object[] objArr2 = j2 == 0;
            if (objArr2 == false) {
                long j3 = currentTimeMillis - j2;
                boolean z = w01.a;
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
                ConnectionsManager.getInstance(a.a).sendRequest(new TL_account.getBirthdays(), new uf(a, (byte) 3));
            }
        }
        this.m4 = this.X ? gl.L(72.0f) : 0;
        this.n4 = this.X ? gl.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public void onFragmentDestroy() {
        gl.r(this.R3);
        super.onFragmentDestroy();
        wtc wtcVar = this.L3;
        if (wtcVar != null) {
            wtcVar.a();
            this.L3 = null;
        }
        hh3 hh3Var = this.D1;
        if (hh3Var != null) {
            hh3Var.b1();
        }
        bba bbaVar = this.I2;
        if (bbaVar != null) {
            bbaVar.j();
        }
        wc3 wc3Var = this.J2;
        if (wc3Var != null) {
            gl.r(wc3Var);
            this.J2 = null;
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.r3.e();
        this.E2 = null;
        int i = wv4.l1;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPanTranslationUpdate(float f) {
        if (this.f0 != null) {
            this.K0 = f;
            hh3 hh3Var = this.D1;
            int i = 0;
            if (hh3Var == null || !hh3Var.Q0()) {
                while (true) {
                    bj3[] bj3VarArr = this.f0;
                    if (i >= bj3VarArr.length) {
                        break;
                    }
                    bj3VarArr[i].setTranslationY(f);
                    i++;
                }
                if (!this.n2) {
                    this.actionBar.setTranslationY(f);
                    m21 m21Var = this.q3;
                    if (m21Var != null) {
                        m21Var.l();
                    }
                }
                hi3 hi3Var = this.D0;
                if (hi3Var != null) {
                    hi3Var.setTranslationY(this.K0 + this.J0);
                    return;
                }
                return;
            }
            this.fragmentView.setTranslationY(f);
            while (true) {
                bj3[] bj3VarArr2 = this.f0;
                if (i >= bj3VarArr2.length) {
                    break;
                }
                bj3VarArr2[i].setTranslationY(0.0f);
                i++;
            }
            if (!this.n2) {
                this.actionBar.setTranslationY(0.0f);
                m21 m21Var2 = this.q3;
                if (m21Var2 != null) {
                    m21Var2.l();
                }
            }
            hi3 hi3Var2 = this.D0;
            if (hi3Var2 != null) {
                hi3Var2.setTranslationY(this.J0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        m21 m21Var = this.T;
        if (m21Var != null) {
            m21Var.b();
            this.T = null;
        }
        rh3 rh3Var = this.H3;
        if (rh3Var != null) {
            rh3Var.r = true;
            yh3 yh3Var = rh3Var.a;
            if (yh3Var != null) {
                yh3Var.onPause();
            }
        }
        cs5 cs5Var = this.M0;
        if (cs5Var != null) {
            cs5Var.u();
        }
        hh3 hh3Var = this.D1;
        if (hh3Var != null) {
            hh3Var.d1();
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
            bj3[] bj3VarArr = this.f0;
            if (i >= bj3VarArr.length) {
                return;
            }
            bj3VarArr[i].d.getClass();
            i++;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ya0 ya0Var;
        if (i != 1) {
            if (i == 4) {
                for (int i2 : iArr) {
                    if (i2 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (ya0Var = FilesMigrationService.e) == null) {
                    return;
                }
                ya0Var.D0();
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
                            im7.n(this.currentAccount).Y();
                            break;
                        } else {
                            tl7.D0();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i3] == 0) {
                            fl5.z().e(null);
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i3] == 0) {
                            gl.d3(new wf3(this, (byte) 29));
                            getContactsController().l();
                            break;
                        } else {
                            SharedPreferences.Editor edit = na7.d1().edit();
                            this.W1 = false;
                            edit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                }
            }
        }
        if (this.B0) {
            this.B0 = false;
            a5();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        long j;
        bj3 bj3Var;
        eh3 eh3Var;
        mt9 mt9Var;
        sb sbVar;
        super.onResume();
        oh3 oh3Var = this.F0;
        if (oh3Var != null) {
            ArrayList arrayList = oh3Var.y;
            g2b g2bVar = oh3Var.s;
            g2bVar.k(g2bVar.g);
            g2bVar.k(g2bVar.h);
            for (int i = 0; i < arrayList.size(); i++) {
                TL_stories.PeerStories x = g2bVar.x(((sf3) arrayList.get(i)).c);
                if (x != null) {
                    g2bVar.Z(x);
                }
            }
        }
        rh3 rh3Var = this.H3;
        if (rh3Var != null) {
            rh3Var.r = false;
            yh3 yh3Var = rh3Var.a;
            if (yh3Var != null) {
                yh3Var.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).w() && (sbVar = this.L0) != null && sbVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f0 != null) {
            int i2 = 0;
            while (true) {
                bj3[] bj3VarArr = this.f0;
                if (i2 >= bj3VarArr.length) {
                    break;
                }
                bj3VarArr[i2].d.f();
                i2++;
            }
        }
        if (this.Q3) {
            this.Q3 = false;
            getMessagesController().Y4(null);
            if (this.f0 != null) {
                int i3 = 0;
                while (true) {
                    bj3[] bj3VarArr2 = this.f0;
                    if (i3 >= bj3VarArr2.length) {
                        break;
                    }
                    bj3VarArr2[i3].d.f();
                    i3++;
                }
            }
        }
        B5(-1, false);
        hh3 hh3Var = this.D1;
        if (hh3Var != null) {
            hh3Var.e1();
        }
        long j2 = 0;
        if (!this.n2 && this.Y2 == 0 && this.a3 == 0) {
            getMediaDataController().D(4);
        }
        hi3 hi3Var = this.D0;
        if (hi3Var != null && (mt9Var = hi3Var.e0) != null) {
            mt9Var.f();
        }
        boolean z = this.v2 || getUserConfig().a0 == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        byte b = 9;
        if (z && this.Y2 == 0 && this.a3 == 0 && this.e2 && !this.n2) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.e2 = false;
                boolean z2 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                int i4 = Build.VERSION.SDK_INT;
                boolean z3 = (i4 <= 28 || w01.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z4 = i4 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                ut2 ut2Var = new ut2(this, z4, z2, z3, parentActivity);
                if (this.v2 && (z2 || z4)) {
                    j2 = 4000;
                }
                gl.e3(ut2Var, j2);
            }
        } else {
            byte b2 = 10;
            if (this.n2 || this.Y2 != 0) {
                j = 0;
            } else {
                j = 0;
                if (this.a3 == 0 && nye.b() && !nye.a()) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    if (!na7.d1().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i5 = bkb.K5;
                        alertDialog$Builder.l(R.raw.permission_request_apk, 72, getThemedColor(i5), null);
                        alertDialog$Builder.m(i5, getResourceProvider());
                        String M0 = k96.M0(2131747105, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.U = M0;
                        alertDialog$Builder.j(k96.M0(2131747107, null), new ag3(this, b2));
                        alertDialog$Builder.g(k96.M0(2131751760, null), new k93(b));
                        showDialog(hdVar);
                    }
                }
            }
            if (this.Y2 == 0 && this.a3 == j && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!na7.d1().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    int i6 = bkb.K5;
                    alertDialog$Builder2.l(R.raw.permission_request_apk, 72, getThemedColor(i6), null);
                    alertDialog$Builder2.m(i6, getResourceProvider());
                    String M02 = k96.M0(2131747121, null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.U = M02;
                    alertDialog$Builder2.j(k96.M0(2131747107, null), new ag3(this, (byte) 11));
                    alertDialog$Builder2.g(k96.M0(2131751760, null), new k93(b2));
                    showDialog(hdVar2);
                }
            }
        }
        a5();
        if (this.f0 != null) {
            int i7 = 0;
            while (true) {
                bj3[] bj3VarArr3 = this.f0;
                if (i7 >= bj3VarArr3.length) {
                    break;
                }
                bj3 bj3Var2 = bj3VarArr3[i7];
                if (bj3Var2.s == 0 && bj3Var2.w == 2 && bj3Var2.c.K0() == 0 && w3()) {
                    this.f0[i7].c.g1(1, (int) this.O);
                }
                bj3[] bj3VarArr4 = this.f0;
                if (i7 == 0) {
                    bj3VarArr4[i7].d.getClass();
                } else {
                    bj3VarArr4[i7].d.getClass();
                }
                i7++;
            }
        }
        c5();
        setBulletinDelegate(new s10(this, b));
        if (this.s3) {
            gl.W2(getParentActivity(), this.classGuid);
        }
        C5(0, false);
        s5(false, true);
        A5(false);
        L2();
        V2();
        if (this.A0 == null || (bj3Var = this.f0[0]) == null || (eh3Var = bj3Var.d) == null) {
            return;
        }
        int i8 = eh3Var.h;
        if (i8 == 7 || i8 == 8) {
            t97 t97Var = getMessagesController().N[i8 != 7 ? (char) 1 : (char) 0];
            if (t97Var != null) {
                this.A0.i(t97Var.o);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onSlideProgress(boolean z, float f) {
        if (gba.o() <= 0) {
            boolean z2 = w01.a;
        } else if (this.d4 && this.e4 == null) {
            V4(f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.h1.setColor(getThemedColor(bkb.c6));
            F2();
            n5();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        sb sbVar;
        cj3 cj3Var;
        rh3 rh3Var = this.H3;
        if (rh3Var == null || !rh3Var.c()) {
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
        if (!z && (cj3Var = this.Z2) != null) {
            cj3Var.removeSelfFromStack();
        }
        V2();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationProgress(boolean z, float f) {
        rh3 rh3Var = this.H3;
        if (rh3Var == null || !rh3Var.c()) {
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
        V2();
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 1) {
            W2();
            Y2();
            b3();
            O2();
            Z2();
            pi3 pi3Var = this.Y;
            fm0 fm0Var = this.b;
            pi3Var.setBlurredBackgroundVisibility(fm0Var.e);
            float a = zfe.a(fm0Var.e);
            be0 be0Var = this.d3;
            if (be0Var != null) {
                be0Var.setScaleX(a);
                this.d3.setScaleY(a);
                this.d3.setAlpha(a);
                this.d3.setVisibility(a > 0.0f ? 0 : 8);
            }
            if (this.w0 != null) {
                float R1 = gl.R1(0.9f, 1.0f, a);
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
            W2();
            Y2();
            return;
        }
        if (i == 3) {
            U2();
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
            T2();
            return;
        }
        if (i == 6) {
            W2();
            Y2();
        } else {
            if (i == 7) {
                P2();
                return;
            }
            if (i == 8) {
                O2();
                Z2();
            } else if (i == 9) {
                Z2();
            }
        }
    }

    public final int p3() {
        if (this.L) {
            return gl.L(81.0f);
        }
        return 0;
    }

    public final void p4() {
        na7.q1(this.currentAccount).m4(0L, "PREMIUM_CHRISTMAS");
        m5();
        m21 G = u21.b0(this).G(R.raw.gift, 4, k96.M0(2131753327, null));
        G.j = 5000;
        G.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p5(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2, boolean z3) {
        hi3 hi3Var;
        boolean z4;
        vec vecVar;
        if (!this.s3 || this.n2 || (hi3Var = this.D0) == null) {
            return;
        }
        ArrayList<rf4> currentSearchFilters = hi3Var.getCurrentSearchFilters();
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
                vecVar = this.b0;
                if (vecVar != null) {
                    vecVar.b(z4, true);
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
        vecVar = this.b0;
        if (vecVar != null) {
        }
        this.c0.setEnabled(z4);
        this.s.a(z4, true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        if (!z && z2) {
            this.d4 = true;
            R4(true);
        } else {
            this.e4 = null;
            this.d4 = false;
            R4(false);
            V4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean presentFragment(d dVar) {
        boolean presentFragment = super.presentFragment(dVar);
        if (presentFragment && this.f0 != null) {
            int i = 0;
            while (true) {
                bj3[] bj3VarArr = this.f0;
                if (i >= bj3VarArr.length) {
                    break;
                }
                bj3VarArr[i].d.getClass();
                i++;
            }
        }
        je5 je5Var = this.q0;
        if (je5Var != null) {
            je5Var.f(true);
        }
        je5 je5Var2 = this.r0;
        if (je5Var2 != null) {
            je5Var2.f(true);
        }
        m21.e();
        return presentFragment;
    }

    public final t97 q3(bj3 bj3Var) {
        if (bj3Var == null) {
            return null;
        }
        int i = bj3Var.s;
        if (i == 7 || i == 8) {
            return getMessagesController().N[bj3Var.s == 8 ? (char) 1 : (char) 0];
        }
        return null;
    }

    public final /* synthetic */ void q4() {
        na7.q1(this.currentAccount).m4(0L, "PREMIUM_RESTORE");
        m5();
    }

    public final void q5() {
        float f = (((-this.k4) - this.n4) - this.w1) - this.x1;
        un4 un4Var = this.u0;
        if (un4Var != null) {
            un4Var.setTranslationY(f);
        }
        un4 un4Var2 = this.v0;
        if (un4Var2 != null) {
            un4Var2.setTranslationY(f - gl.L(52.0f));
            je5 je5Var = this.q0;
            if (je5Var != null) {
                je5Var.setTranslationY(f - gl.L(52.0f));
            }
        }
    }

    public final float r3() {
        rh3 rh3Var = this.H3;
        if (rh3Var == null || !rh3Var.c()) {
            return 0.0f;
        }
        return this.H3.e;
    }

    public final /* synthetic */ void r4() {
        na7.q1(this.currentAccount).m4(0L, this.C3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        m5();
    }

    public final void r5(boolean z) {
        boolean z2 = this.n2;
        boolean z3 = (!z2 || this.T0 == 10) && this.Y2 == 0 && this.a3 == 0 && !this.inPreviewMode && (!this.l2 || z2) && !this.Y3;
        un4 un4Var = this.u0;
        if (un4Var != null) {
            un4Var.e(z3, z);
        }
        un4 un4Var2 = this.v0;
        if (un4Var2 != null) {
            un4Var2.e(z3, z);
        }
    }

    public final float s3() {
        return -gl.U1(this.b.e, gl.L(4.0f), gl.L(48.0f));
    }

    public final /* synthetic */ void s4() {
        na7.q1(this.currentAccount).m4(0L, "USERPIC_SETUP");
        m5();
    }

    public final void s5(boolean z, boolean z2) {
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
                        if (getFileLoader().S(((k27) getDownloadController().H.get(i)).S0())) {
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
                R2();
                boolean z4 = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i2 = this.f2;
                boolean z5 = i2 == 3 || i2 == 5;
                this.p0.setSubtext(k96.M0(z4 ? z5 ? 2131748416 : 2131748415 : 2131748414, null));
                this.o0.b(z4, z5, z);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setInPreviewMode(boolean z) {
        super.setInPreviewMode(z);
        oh3 oh3Var = this.F0;
        if (oh3Var != null) {
            if (!this.H0 || z) {
                oh3Var.setVisibility(8);
            } else {
                oh3Var.setVisibility(0);
            }
        }
        r5(true);
        m5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 != r3) goto L12;
     */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i, Runnable runnable) {
        th3 th3Var;
        tl tlVar;
        super.setTitleOverlayText(str, i, runnable);
        if (this.actionBar != null && (th3Var = this.N0) != null && (th3Var.getContentView() instanceof tx9)) {
            jia titleTextView = this.actionBar.getTitleTextView();
            tx9 tx9Var = (tx9) this.N0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                tlVar = this.F3;
            }
            tlVar = null;
            tx9Var.y(tlVar, titleTextView);
        }
        oh3 oh3Var = this.F0;
        if (oh3Var != null) {
            hn hnVar = oh3Var.U;
            oh3Var.V.a(i == 2131751793 ? gl.F2(k96.M0(2131743872, null), true, gl.L(2.6666667f), gl.L(2.0f)) : null, true);
            if (str != null) {
                oh3Var.h0 = true;
                if (oh3Var.i0 != i) {
                    oh3Var.i0 = i;
                    hnVar.c(k96.M0(i, str), !k96.a0, true);
                }
            } else {
                oh3Var.h0 = false;
                oh3Var.i0 = 0;
                hnVar.c(oh3Var.g0, !k96.a0, true);
            }
            oh3Var.a.a(oh3Var.h0, true);
            oh3Var.M0.F(hnVar);
        }
    }

    public final g2b t3() {
        return getMessagesController().M1();
    }

    public final void t5() {
        if (!this.u3 || this.actionBar == null) {
            return;
        }
        int themedColor = getThemedColor((this.Y2 == 0 && this.a3 == 0) ? bkb.u8 : bkb.N8);
        a aVar = this.actionBar;
        int i = bkb.x8;
        aVar.H(bm2.f(this.z1, themedColor, getThemedColor(i)), false);
        this.actionBar.H(bm2.f(this.z1, getThemedColor(i), getThemedColor(i)), true);
        this.actionBar.G(bm2.f(this.z1, getThemedColor((this.Y2 == 0 && this.a3 == 0) ? bkb.s8 : bkb.M8), getThemedColor(bkb.y8)), false);
    }

    public final UndoView u3() {
        h3();
        UndoView[] undoViewArr = this.z0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            vi3 vi3Var = (vi3) this.fragmentView;
            vi3Var.removeView(undoViewArr[0]);
            vi3Var.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void u4(long j) {
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
                u4(((TLRPC.Dialog) obj).id);
            }
            return;
        }
        int i2 = -1;
        if ((!this.actionBar.y() || this.actionBar.z(null)) && D4(this.f0[0], dialog)) {
            Q4(true, true);
            G2();
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
                    Q4(false, false);
                }
            }
        }
        int i4 = i2;
        if (getMessagesController().r2(j2) || getMessagesController().y2(j2)) {
            na7 messagesController = getMessagesController();
            ad7 messagesStorage = messagesController.getMessagesStorage();
            x67 x67Var = new x67(messagesController, j2);
            co3 co3Var = messagesStorage.a;
            de2 de2Var = new de2((Object) messagesStorage, j2, (Object) x67Var, (byte) 5);
            j2 = j2;
            co3Var.c(de2Var);
        }
        getMessagesController().p3(j2, 0L);
        na7 messagesController2 = getMessagesController();
        int i5 = dialog.top_message;
        messagesController2.k3(j2, i5, i5, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i4 >= 0) {
            this.T1.remove(i4);
            this.f0[0].y.D();
            this.f0[0].b(true);
        }
    }

    public final void u5() {
        bba bbaVar;
        hh3 hh3Var = this.D1;
        ArrayList arrayList = this.K2;
        if (hh3Var == null) {
            if (this.T0 == 10) {
                z3(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        v5();
        if (arrayList.isEmpty()) {
            String M0 = k96.M0((this.T0 == 3 && this.h2 == null) ? 2131750558 : 2131745477, null);
            boolean z = this.U3;
            boolean isEmpty = arrayList.isEmpty();
            a aVar = this.actionBar;
            if (z == isEmpty) {
                aVar.setTitle(M0);
            } else {
                aVar.N(M0, true, 350L, s33.h);
            }
            if (this.D1.getTag() != null) {
                this.D1.K0(false, false, false);
                this.D1.S();
                this.D1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.D1.getTag() == null) {
                if (!x3() && this.G2 == null) {
                    this.D1.setFieldText("");
                }
                this.D1.setTag(1);
                if (!this.a4 && (bbaVar = this.I2) != null) {
                    this.a4 = true;
                    String M02 = k96.M0(2131745237, null);
                    bbaVar.j();
                    bbaVar.G = M02;
                    ((jia) bbaVar.a[0].f).l(M02, false);
                    z6a z6aVar = new z6a(bbaVar, (byte) 2);
                    bbaVar.H = z6aVar;
                    gl.e3(z6aVar, 1000L);
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
                long K1 = getMessagesController().K1(longValue);
                if (K1 <= 0 && longValue > 0) {
                    K1 = cf3.j(getMessagesController().I2(longValue));
                }
                j += K1;
            }
            this.E1.i(i, j, true);
            this.D1.x2();
            boolean z2 = this.U3;
            boolean isEmpty2 = arrayList.isEmpty();
            a aVar2 = this.actionBar;
            if (z2 == isEmpty2) {
                aVar2.setTitle(k96.G(arrayList.size(), "Recipient", new Object[0]));
            } else {
                aVar2.N(k96.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, s33.h);
            }
        }
        this.U3 = arrayList.isEmpty();
    }

    @Override // zg6
    public final void v() {
        N4(true, true);
    }

    public final t97 v3() {
        bj3[] bj3VarArr = this.f0;
        if (bj3VarArr != null && bj3VarArr[0] != null) {
            ArrayList R0 = getMessagesController().R0();
            int i = this.S3;
            if (i < 0) {
                i = this.f0[0].h;
            }
            if (i >= 0 && i < R0.size()) {
                return (t97) R0.get(i);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (hc2.K(r6, false) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v4(TLRPC.Chat chat, TLRPC.User user) {
        Boolean bool;
        Boolean bool2;
        if (chat != null) {
            boolean V = hc2.V(chat);
            TLRPC.RequestPeerType requestPeerType = this.H;
            if (V == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.H.bot_participant) == null || !bool2.booleanValue() || getMessagesController().v2(chat, user) || hc2.b(chat)))) {
                Boolean bool3 = this.H.has_username;
                if (bool3 != null) {
                }
                Boolean bool4 = this.H.forum;
                if ((bool4 == null || bool4.booleanValue() == hc2.c0(chat)) && ((this.H.user_admin_rights == null || getMessagesController().v3(chat, getUserConfig().f(), this.H.user_admin_rights)) && (this.H.bot_admin_rights == null || getMessagesController().v3(chat, user, this.H.bot_admin_rights) || hc2.w(4, chat)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void v5() {
        bba bbaVar = this.I2;
        if (bbaVar != null) {
            int i = this.currentAccount;
            bbaVar.h(i);
            bbaVar.d = y6c.h(j5.a(i).a).e();
            ArrayList arrayList = bbaVar.f;
            arrayList.clear();
            ArrayList arrayList2 = this.K2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            ev3 ev3Var = bbaVar.a[0];
            if (bbaVar.b == 1) {
                ((jia) ev3Var.e).l(bbaVar.c(ev3Var), false);
            }
        }
    }

    public final boolean w3() {
        if (this.n2 || this.T0 != 0 || this.a3 != 0 || this.Y2 != 0) {
            return false;
        }
        na7 messagesController = getMessagesController();
        messagesController.getClass();
        return gba.n1 && messagesController.R.f(2305843009213693953L) != null;
    }

    public final boolean w4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user == null || l7c.A(user) || l7c.y(user)) {
            return false;
        }
        Boolean bool = tL_requestPeerTypeUser.bot;
        if (bool != null && bool.booleanValue() != user.bot) {
            return false;
        }
        Boolean bool2 = tL_requestPeerTypeUser.premium;
        return bool2 == null || bool2.booleanValue() == user.premium;
    }

    public final void w5(boolean z) {
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
            k27 k27Var = (k27) obj;
            if (k27Var.F0() != null && k27Var.F0().size >= 157286400) {
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
            k27 k27Var2 = (k27) obj2;
            if (k27Var2.F0() != null && k27Var2.F0().size >= 157286400) {
                z2 = true;
                break;
            }
        }
        if (!getUserConfig().p() && !getMessagesController().E3() && z2 && z) {
            z3 = true;
        }
        this.d.a(z3, true);
    }

    public final boolean x3() {
        ArrayList arrayList = this.F2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void x4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        byte b = 1;
        fx0 i = ug8.i(getParentActivity(), false, 1, null);
        boolean z = getMessagesStorage().M != 0;
        int[] iArr = {z ? R.drawable.msg_markread : 0, gba.n1 ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z ? k96.M0(2131748490, null) : null, k96.M0(gba.n1 ? 2131747053 : 2131749132, null)};
        r20 r20Var = new r20(this, b);
        i.M = charSequenceArr;
        i.N = iArr;
        i.L = r20Var;
        showDialog(i);
    }

    public final void x5(TLRPC.User user, boolean z) {
        tl tlVar;
        oh3 oh3Var = this.F0;
        tl tlVar2 = null;
        if (oh3Var != null && (tlVar = oh3Var.b0) != null && oh3Var.r0 != null) {
            Long i = l7c.i(user);
            if (i != null) {
                boolean z2 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                tlVar.j(i.longValue(), z);
                tlVar.m(z2, z);
            } else {
                if (user != null) {
                    na7.q1(oh3Var.f);
                    if (na7.A2(user)) {
                        if (oh3Var.O0 == null) {
                            oh3Var.O0 = oh3Var.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                            oh3Var.O0 = new of3(gl.L(18.0f), gl.L(18.0f), oh3Var.O0);
                        }
                        Drawable drawable = oh3Var.O0;
                        int i2 = bkb.pi;
                        cj3 cj3Var = oh3Var.f0;
                        zkb.x(oh3Var, drawable, i2, cj3Var != null ? cj3Var.getResourceProvider() : null, PorterDuff.Mode.MULTIPLY);
                        tlVar.g(oh3Var.O0, z);
                        tlVar.m(false, z);
                    }
                }
                tlVar.g(null, z);
                tlVar.m(false, z);
            }
            tlVar.k(Integer.valueOf(oh3Var.f(bkb.pi)));
            oh3Var.a0.invalidate();
        }
        if (this.F3 == null || this.actionBar == null) {
            return;
        }
        Long i3 = l7c.i(user);
        this.D3 = null;
        if (i3 != null) {
            boolean z3 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.F3.j(i3.longValue(), z);
            this.F3.m(z3, z);
            if (z3) {
                this.D3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new zf3(this, (byte) 1));
            tx9.s(this.currentAccount);
        } else {
            if (user != null) {
                na7.q1(this.currentAccount);
                if (na7.A2(user)) {
                    if (this.M3 == null) {
                        this.M3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.M3 = new ei3(gl.L(18.0f), gl.L(18.0f), this.M3);
                    }
                    Drawable drawable2 = this.M3;
                    int themedColor = getThemedColor(bkb.pi);
                    this.B4 = themedColor;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    this.F3.g(this.M3, z);
                    this.F3.m(false, z);
                    this.actionBar.setRightDrawableOnClick(new zf3(this, (byte) 2));
                    tx9.s(this.currentAccount);
                }
            }
            this.F3.g(null, z);
            this.F3.m(false, z);
            this.actionBar.setRightDrawableOnClick(null);
        }
        tl tlVar3 = this.F3;
        int i4 = bkb.pi;
        tlVar3.k(Integer.valueOf(getThemedColor(i4)));
        ym ymVar = this.G3;
        if (ymVar != null) {
            ymVar.setColor(getThemedColor(i4));
        }
        th3 th3Var = this.N0;
        if (th3Var == null || !(th3Var.getContentView() instanceof tx9)) {
            return;
        }
        jia titleTextView = this.actionBar.getTitleTextView();
        tx9 tx9Var = (tx9) this.N0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            tl tlVar4 = this.F3;
            if (rightDrawable == tlVar4) {
                tlVar2 = tlVar4;
            }
        }
        tx9Var.y(tlVar2, titleTextView);
    }

    public final boolean y2(long j, View view) {
        if (this.n2 && getMessagesController().r2(j)) {
            return false;
        }
        Long valueOf = Long.valueOf(j);
        ArrayList arrayList = this.K2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j));
            if (view instanceof ue3) {
                ((ue3) view).e0(false, true);
            } else if (view instanceof rr8) {
                ((rr8) view).y(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j));
        if (view instanceof ue3) {
            ((ue3) view).e0(true, true);
        } else if (view instanceof rr8) {
            ((rr8) view).y(true, true);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y3(boolean z) {
        boolean z2;
        this.actionBar.x();
        this.K2.clear();
        ed0 ed0Var = this.g1;
        if (ed0Var != null) {
            ed0Var.c(true, 0.0f);
        }
        qi3 qi3Var = this.A0;
        if (qi3Var != null) {
            qi3Var.b(bkb.J8, bkb.H8, bkb.I8, bkb.K8, bkb.c6);
        }
        ValueAnimator valueAnimator = this.x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x3 = null;
        }
        if (this.w3 == 0.0f) {
            return;
        }
        S4(-o3());
        byte b = 0;
        int i = 0;
        while (true) {
            bj3[] bj3VarArr = this.f0;
            if (i >= bj3VarArr.length) {
                break;
            }
            bj3 bj3Var = bj3VarArr[i];
            if (bj3Var != null) {
                bj3Var.a.J0(true);
            }
            i++;
        }
        float max = Math.max(0.0f, gl.L((this.L ? 81 : 0) + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w3, 0.0f);
        this.x3 = ofFloat;
        ofFloat.addUpdateListener(new bg3(this, max, (byte) 1));
        this.x3.addListener(new ai3(this, max, b));
        this.x3.setInterpolator(s33.f);
        this.x3.setDuration(200L);
        this.x3.start();
        this.a1 = false;
        ArrayList arrayList = this.c1;
        if (!arrayList.isEmpty()) {
            int i2 = 0;
            for (int size = arrayList.size(); i2 < size; size = size) {
                t97 t97Var = (t97) arrayList.get(i2);
                pd4.y0(t97Var, t97Var.g, t97Var.b, t97Var.c, t97Var.n, t97Var.m, t97Var.h, t97Var.i, t97Var.j, false, false, true, true, false, this, null);
                i2++;
                arrayList = arrayList;
            }
            arrayList.clear();
        }
        if (this.b1) {
            getMessagesController().o4(this.Y2, 0L, null);
            z2 = 0;
            this.b1 = false;
        } else {
            z2 = 0;
        }
        l5(true);
        if (this.f0 != null) {
            int i3 = z2;
            while (true) {
                bj3[] bj3VarArr2 = this.f0;
                if (i3 >= bj3VarArr2.length) {
                    break;
                }
                bj3VarArr2[i3].d.I = z2;
                i3++;
            }
        }
        int i4 = na7.q5;
        int i5 = z2;
        if (z) {
            i5 = TLObject.FLAG_13;
        }
        C5(196608 | i5, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x00c6, code lost:
    
        if (r2.megagroup == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00d5, code lost:
    
        if (r1 == null) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00d7, code lost:
    
        r13 = -r1.id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x00d3, code lost:
    
        if (r1.megagroup == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y4(View view, int i, n39 n39Var) {
        n39 n39Var2;
        long j;
        boolean z;
        int i2;
        int i3;
        int i4;
        k27 k27Var;
        long j2;
        long j3;
        mt9 mt9Var;
        rh3 rh3Var;
        long j4;
        long j5;
        int i5;
        k27 k27Var2;
        long E;
        long j6;
        long j7;
        TLRPC.Chat K0;
        boolean z2;
        hi3 hi3Var;
        int i6;
        Object J;
        int indexOf;
        long j8;
        long j9;
        int i7;
        if (getParentActivity() != null) {
            boolean z3 = n39Var instanceof oj3;
            if (z3) {
                oj3 oj3Var = (oj3) n39Var;
                int i8 = oj3Var.h;
                if (i8 == 7 || i8 == 8) {
                    t97 t97Var = getMessagesController().N[i8 == 7 ? (char) 0 : (char) 1];
                    if (t97Var != null) {
                        i6 = t97Var.a;
                        J = oj3Var.J(i);
                        if (this.E2 == null && oj3Var.n && n39Var.d(i) == 21) {
                            this.E2.t(this);
                            return;
                        }
                        if (J instanceof TLRPC.User) {
                            if (J instanceof TLRPC.Chat) {
                                j9 = ((TLRPC.Chat) J).id;
                            } else if (J instanceof TLRPC.Dialog) {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                                i7 = dialog.folder_id;
                                if (dialog instanceof TLRPC.TL_dialogFolder) {
                                    if (this.actionBar.z(null)) {
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                    presentFragment(new cj3(bundle));
                                    return;
                                }
                                j8 = dialog.id;
                                if (this.actionBar.z(null)) {
                                    d5(j8, view);
                                    return;
                                }
                                n39Var2 = n39Var;
                                i2 = i7;
                                z = false;
                                i3 = 0;
                                k27Var = null;
                                i4 = i6;
                                j3 = j8;
                                j2 = 0;
                                j = 0;
                            } else if (J instanceof TLRPC.TL_recentMeUrlChat) {
                                j9 = ((TLRPC.TL_recentMeUrlChat) J).chat_id;
                            } else if (J instanceof TLRPC.TL_recentMeUrlUser) {
                                j8 = ((TLRPC.TL_recentMeUrlUser) J).user_id;
                            } else {
                                if (!(J instanceof TLRPC.TL_recentMeUrlChatInvite)) {
                                    if (J instanceof TLRPC.TL_recentMeUrlStickerSet) {
                                        TLRPC.StickerSet stickerSet = ((TLRPC.TL_recentMeUrlStickerSet) J).set.set;
                                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                        tL_inputStickerSetID.id = stickerSet.id;
                                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                                        showDialog(new u0b(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                        return;
                                    }
                                    return;
                                }
                                TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) J;
                                n39Var2 = n39Var;
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
                                    showDialog(new fu5(getParentActivity(), chatInvite, str, this, null));
                                    return;
                                }
                                if (hc2.T(chat)) {
                                    chat = chatInvite.chat;
                                }
                                String str2 = tL_recentMeUrlChatInvite.url;
                                indexOf = str2.indexOf(47);
                                if (indexOf > 0) {
                                }
                                showDialog(new fu5(getParentActivity(), chatInvite, str2, this, null));
                                return;
                                i7 = 0;
                                i2 = i7;
                                z = false;
                                i3 = 0;
                                k27Var = null;
                                i4 = i6;
                                j3 = j8;
                                j2 = 0;
                                j = 0;
                            }
                            j8 = -j9;
                        } else {
                            j8 = ((TLRPC.User) J).id;
                        }
                        n39Var2 = n39Var;
                        i7 = 0;
                        i2 = i7;
                        z = false;
                        i3 = 0;
                        k27Var = null;
                        i4 = i6;
                        j3 = j8;
                        j2 = 0;
                        j = 0;
                    }
                }
                i6 = 0;
                J = oj3Var.J(i);
                if (this.E2 == null) {
                }
                if (J instanceof TLRPC.User) {
                }
                n39Var2 = n39Var;
                i7 = 0;
                i2 = i7;
                z = false;
                i3 = 0;
                k27Var = null;
                i4 = i6;
                j3 = j8;
                j2 = 0;
                j = 0;
            } else {
                n39Var2 = n39Var;
                hi3 hi3Var2 = this.D0;
                if (hi3Var2 == null || n39Var2 != (mt9Var = hi3Var2.e0)) {
                    j = 0;
                    z = false;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    k27Var = null;
                    j2 = 0;
                    j3 = 0;
                } else {
                    Object I = mt9Var.I(i);
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
                        E = cf3.E(encryptedChat.id);
                        if (!this.n2) {
                            this.Y1 = E;
                            this.Z1 = encryptedChat;
                        }
                    } else {
                        if (I instanceof k27) {
                            k27Var2 = (k27) I;
                            long B0 = k27.B0(k27Var2.k);
                            int e1 = k27Var2.e1();
                            j = 0;
                            j5 = hc2.c0(getMessagesController().K0(Long.valueOf(-B0))) ? k27.b2(k27Var2.K1, k27Var2.k, true, false) : 0L;
                            hi3 hi3Var3 = this.D0;
                            if (hi3Var3 != null) {
                                mt9 mt9Var2 = hi3Var3.e0;
                                mt9Var2.k0.a(mt9Var2.a0);
                            }
                            i5 = e1;
                            j4 = B0;
                        } else {
                            j = 0;
                            if (I instanceof String) {
                                String str3 = (String) I;
                                hi3 hi3Var4 = this.D0;
                                if (hi3Var4 != null && !hi3Var4.e0.K.isEmpty()) {
                                    this.Y.r.setText(str3);
                                    this.Y.r.setSelection(str3.length());
                                } else if (!str3.equals("section")) {
                                    jj7 jj7Var = new jj7(this, getParentActivity());
                                    jj7Var.H0(str3, true);
                                    jj7Var.show();
                                }
                            } else if (I instanceof nu2) {
                                nu2 nu2Var = (nu2) I;
                                ij.u(this, nu2Var.i, nu2Var.j, (String) nu2Var.e.get(0));
                            } else if ((I instanceof TLRPC.TL_forumTopic) && (rh3Var = this.H3) != null && (rh3Var.getFragment() instanceof qvb)) {
                                j4 = -((qvb) this.H3.getFragment()).a;
                                j5 = ((TLRPC.TL_forumTopic) I).id;
                                i5 = 0;
                                k27Var2 = null;
                            }
                            i5 = 0;
                            k27Var2 = null;
                            j5 = 0;
                            j4 = 0;
                        }
                        if (j4 == j && this.actionBar.y()) {
                            if (this.actionBar.z("search_dialogs_action_mode") && i5 == 0 && !z) {
                                d5(j4, view);
                                return;
                            }
                            return;
                        }
                        j3 = j4;
                        j2 = j5;
                        i4 = 0;
                        i3 = i5;
                        k27Var = k27Var2;
                        i2 = 0;
                    }
                    i5 = 0;
                    k27Var2 = null;
                    j4 = E;
                    j5 = 0;
                    j = 0;
                    if (j4 == j) {
                    }
                    j3 = j4;
                    j2 = j5;
                    i4 = 0;
                    i3 = i5;
                    k27Var = k27Var2;
                    i2 = 0;
                }
            }
            if (j3 != j) {
                if (this.n2) {
                    if (D5(j3)) {
                        if ((!getMessagesController().r2(j3) && !getMessagesController().l2(j3)) || E3(j3)) {
                            ArrayList arrayList = this.K2;
                            if (!arrayList.isEmpty() || (this.T0 == 3 && this.h2 != null)) {
                                if (arrayList.contains(Long.valueOf(j3)) || I2(j3)) {
                                    boolean y2 = y2(j3, view);
                                    hi3 hi3Var5 = this.D0;
                                    if (hi3Var5 != null && n39Var2 == hi3Var5.e0) {
                                        this.actionBar.n(true);
                                        k3(j3, y2);
                                    }
                                    u5();
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.o2 && getMessagesController().l2(j3)) {
                            Bundle bundle2 = new Bundle(this.arguments);
                            bundle2.putLong("community_id", -j3);
                            cj3 cj3Var = new cj3(bundle2);
                            cj3Var.Z2 = this;
                            cj3Var.E2 = this.E2;
                            presentFragment(cj3Var);
                            return;
                        }
                        if (!this.o2 || ((!getMessagesController().r2(j3) || E3(j3)) && !getMessagesController().y2(j3))) {
                            i3(j3, 0L, true, null);
                            return;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", -j3);
                        bundle3.putBoolean("for_select", true);
                        bundle3.putBoolean("forward_to", true);
                        bundle3.putBoolean("bot_share_to", this.T0 == 1);
                        bundle3.putBoolean("quote", this.P0);
                        bundle3.putBoolean("reply_to", this.O0);
                        qvb qvbVar = new qvb(bundle3);
                        qvbVar.M0 = this;
                        presentFragment(qvbVar);
                        return;
                    }
                    return;
                }
                Bundle bundle4 = new Bundle();
                if (cf3.B(j3)) {
                    j6 = j2;
                    bundle4.putInt("enc_id", (int) (j3 & 4294967295L));
                } else {
                    j6 = j2;
                    if (cf3.D(j3)) {
                        bundle4.putLong("user_id", j3);
                    } else {
                        if (i3 == 0 || (K0 = getMessagesController().K0(Long.valueOf(-j3))) == null || K0.migrated_to == null) {
                            j7 = j3;
                        } else {
                            bundle4.putLong("migrated_to", j3);
                            j7 = -K0.migrated_to.channel_id;
                        }
                        bundle4.putLong("chat_id", -j7);
                    }
                }
                if (i3 != 0) {
                    bundle4.putInt("message_id", i3);
                } else if (z) {
                    TLObject tLObject = this.Z1;
                    if (tLObject != null) {
                        hi3 hi3Var6 = this.D0;
                        if (hi3Var6 != null) {
                            hi3Var6.e0.Q(this.Y1, tLObject);
                        }
                        this.Z1 = null;
                    }
                } else {
                    d3();
                }
                boolean z4 = (k96.a0 || this.l2 || (gl.O1() && i2 != 0) || !e66.e(64) || this.a3 != j) ? false : true;
                bundle4.putInt("dialog_folder_id", i2);
                bundle4.putInt("dialog_filter_id", i4);
                if (gl.O1() && ((!getMessagesController().r2(j3) || !z4) && this.r2.a == j3 && ((hi3Var = this.D0) == null || n39Var2 != hi3Var.e0))) {
                    if (getParentActivity() instanceof LaunchActivity) {
                        LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                        List fragmentStack = launchActivity.r0.getFragmentStack();
                        if (fragmentStack.isEmpty()) {
                            return;
                        }
                        if (fragmentStack.size() == 1 && (oo1.m(1, fragmentStack) instanceof mu1)) {
                            ((mu1) oo1.m(1, fragmentStack)).X9();
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
                hi3 hi3Var7 = this.D0;
                if (hi3Var7 != null && hi3Var7.B0) {
                    hi3Var7.R(false);
                }
                if (j3 == getUserConfig().e() && getMessagesController().P3) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putLong("dialog_id", y6c.h(this.currentAccount).e());
                    bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                    bundle5.putInt("start_from", 11);
                    ffa ffaVar = this.E0;
                    if (ffaVar == null) {
                        ffaVar = new ffa(this);
                        this.E0 = ffaVar;
                    }
                    presentFragment(new zj6(bundle5, ffaVar));
                    return;
                }
                if (this.p2 != null) {
                    if (getMessagesController().A(bundle4, this, null, null)) {
                        getNotificationCenter().k(kk7.s, new Object[0]);
                        mu1 mu1Var = new mu1(bundle4);
                        A3(mu1Var, k27Var);
                        presentFragment(mu1Var);
                        return;
                    }
                    return;
                }
                this.B3 = true;
                if (getMessagesController().A(bundle4, this, null, null)) {
                    TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(-j3));
                    TLRPC.Dialog Q0 = getMessagesController().Q0(j3);
                    boolean V = hc2.V(K02);
                    boolean z5 = Q0 != null && Q0.view_forum_as_messages;
                    int b = (this.a3 == j || K02 == null) ? 0 : no2.b(this.currentAccount, -K02.id);
                    if (b == 3) {
                        showDialog(new fu5(getParentActivity(), K02, null, this, this.resourceProvider));
                        return;
                    }
                    byte b2 = 4;
                    if (b == 4) {
                        ir2.v(null, V ? 2131751918 : 2131751915, u21.b0(this), R.raw.e_hand_2, 36);
                        return;
                    }
                    if (K02 == null || !(((z2 = K02.monoforum) || K02.forum) && j6 == j)) {
                        if (hc2.Y(K02)) {
                            Bundle bundle6 = new Bundle();
                            bundle6.putLong("community_id", K02.id);
                            presentFragment(new cj3(bundle6));
                            return;
                        }
                        mu1 mu1Var2 = new mu1(bundle4);
                        if (j6 != j) {
                            mm4.a(mu1Var2, zc7.a(j3, j6));
                        }
                        if (z3 && cf3.D(j3) && getMessagesController().R.f(j3) == null) {
                            hq6 mediaDataController = getMediaDataController();
                            TLRPC.Document document = mediaDataController.z0;
                            mediaDataController.o1();
                            if (document != null) {
                                mu1Var2.Y9 = document;
                                mu1Var2.Z9 = true;
                            }
                        }
                        if (gl.O1()) {
                            rh3 rh3Var2 = this.H3;
                            if (rh3Var2.a != null) {
                                rh3Var2.a();
                            }
                        }
                        A3(mu1Var2, k27Var);
                        presentFragment(mu1Var2);
                        return;
                    }
                    if (z2) {
                        bundle4.putInt("chatMode", 8);
                        bundle4.putBoolean("isSubscriberSuggestions", !hc2.A(this.currentAccount, K02, 24));
                        mu1 mu1Var3 = new mu1(bundle4);
                        A3(mu1Var3, k27Var);
                        presentFragment(mu1Var3);
                        return;
                    }
                    if (hc2.a(K02)) {
                        mu1 mu1Var4 = new mu1(bundle4);
                        mm4.a(mu1Var4, zc7.a(-K02.id, getMessagesController().X3.getLong(ls6.n(K02.id, "forumlasttopic"), 1L)));
                        presentFragment(mu1Var4);
                        return;
                    }
                    if (!e66.e(64) || this.a3 != j) {
                        if (!z5) {
                            presentFragment(new qvb(bundle4));
                            return;
                        }
                        mu1 mu1Var5 = new mu1(bundle4);
                        A3(mu1Var5, k27Var);
                        presentFragment(mu1Var5);
                        return;
                    }
                    if (!z4) {
                        if (!z5) {
                            presentFragment(new qvb(bundle4));
                            return;
                        }
                        mu1 mu1Var6 = new mu1(bundle4);
                        A3(mu1Var6, k27Var);
                        presentFragment(mu1Var6);
                        return;
                    }
                    if (this.l2) {
                        return;
                    }
                    if (z5) {
                        mu1 mu1Var7 = new mu1(bundle4);
                        A3(mu1Var7, k27Var);
                        presentFragment(mu1Var7);
                        return;
                    }
                    rh3 rh3Var3 = this.H3;
                    yh3 yh3Var = rh3Var3.a;
                    if (yh3Var == null || (-yh3Var.a) != j3) {
                        yi3 yi3Var = this.f0[0].a;
                        yi3Var.w3 = 0.0f;
                        yi3Var.x3 = yi3Var.v3;
                        yi3Var.y3 = yi3Var.p3 != 0.0f;
                        yh3 yh3Var2 = new yh3(bundle4);
                        yh3Var2.N0 = this;
                        final rh3 rh3Var4 = this.H3;
                        ui5 parentLayout = getParentLayout();
                        on onVar = rh3Var4.n;
                        if (!rh3Var4.r) {
                            rh3Var4.x = parentLayout;
                            yh3Var2.onFragmentCreate();
                            yh3Var2.setInPreviewMode(true);
                            yh3Var2.setParentLayout(parentLayout);
                            View performCreateView = yh3Var2.performCreateView(rh3Var4.getContext());
                            yh3Var2.onResume();
                            rh3Var4.b = performCreateView;
                            rh3Var4.addView(performCreateView);
                            final yh3 yh3Var3 = rh3Var4.a;
                            zab zabVar = yh3Var2.e;
                            rh3Var4.c = zabVar;
                            rh3Var4.addView(zabVar);
                            rh3Var4.a = yh3Var2;
                            dj9.R = j;
                            dj9.R = -yh3Var2.a;
                            if (yh3Var2.getActionBar() != null) {
                                a actionBar = yh3Var2.getActionBar();
                                rh3Var4.d = actionBar;
                                rh3Var4.addView(actionBar);
                                rh3Var4.d.f1 = new sr8(rh3Var4, (byte) 29);
                            }
                            if (yh3Var3 != null) {
                                final yh3 yh3Var4 = rh3Var4.a;
                                if (gba.c()) {
                                    yla ylaVar = rh3Var4.y;
                                    if (ylaVar != null) {
                                        ylaVar.d();
                                    }
                                    yh3Var4.onTransitionAnimationStart(true, false);
                                    rh3Var4.F = yh3Var3;
                                    rh3Var4.w = true;
                                    onVar.d();
                                    yla ylaVar2 = new yla(new ti4(0.0f));
                                    rh3Var4.y = ylaVar2;
                                    ylaVar2.m = oo1.j(1000.0f, 400.0f, 1.0f);
                                    dj9.f(yh3Var3, yh3Var4, 0.0f);
                                    rh3Var4.y.b(new h10(rh3Var4, (byte) 13));
                                    rh3Var4.y.a(new xr3() { // from class: bj9
                                        @Override // xr3
                                        public final void a(yla ylaVar3, boolean z6, float f, float f2) {
                                            rh3 rh3Var5 = rh3.this;
                                            if (rh3Var5.y == null) {
                                                return;
                                            }
                                            rh3Var5.y = null;
                                            yh3 yh3Var5 = yh3Var4;
                                            yh3Var5.onTransitionAnimationEnd(true, false);
                                            yh3 yh3Var6 = yh3Var3;
                                            dj9.f(yh3Var6, yh3Var5, 1.0f);
                                            rh3Var5.w = false;
                                            rh3Var5.F = null;
                                            yh3Var6.onPause();
                                            yh3Var6.onFragmentDestroy();
                                            rh3Var5.removeView(yh3Var6.getFragmentView());
                                            rh3Var5.removeView(yh3Var6.getActionBar());
                                            rh3Var5.n.e();
                                        }
                                    });
                                    rh3Var4.y.h();
                                } else {
                                    yh3Var4.onTransitionAnimationStart(true, false);
                                    yh3Var4.onTransitionAnimationEnd(true, false);
                                    dj9.f(yh3Var3, yh3Var4, 1.0f);
                                    rh3Var4.w = false;
                                    rh3Var4.F = null;
                                    yh3Var3.onPause();
                                    yh3Var3.onFragmentDestroy();
                                    rh3Var4.removeView(yh3Var3.getFragmentView());
                                    rh3Var4.removeView(yh3Var3.getActionBar());
                                    onVar.e();
                                }
                            } else if (!rh3Var4.f) {
                                rh3Var4.f = true;
                                if (gba.c()) {
                                    onVar.d();
                                    rh3Var4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    rh3Var4.e = 0.0f;
                                    rh3Var4.e(true);
                                    rh3Var4.g();
                                    yh3Var2.onTransitionAnimationStart(true, false);
                                    rh3Var4.h.addUpdateListener(new x89(rh3Var4, b2));
                                    rh3Var4.h.addListener(new eh8((Object) rh3Var4, (Object) yh3Var2, (byte) 10));
                                    rh3Var4.h.setDuration(250L);
                                    rh3Var4.h.setInterpolator(s33.f);
                                    rh3Var4.h.setStartDelay(gba.o() >= 2 ? 50L : 150L);
                                    rh3Var4.h.start();
                                } else {
                                    rh3Var4.e(true);
                                    yh3Var2.onTransitionAnimationStart(true, false);
                                    yh3Var2.onTransitionAnimationEnd(true, false);
                                    rh3Var4.e = 1.0f;
                                    rh3Var4.g();
                                    rh3Var4.d(false);
                                }
                            }
                            yh3Var2.setPreviewDelegate(new wh9(rh3Var4, (byte) 3));
                            WeakHashMap weakHashMap = jdc.a;
                            zcc.c(rh3Var4);
                        }
                    } else {
                        rh3Var3.a();
                    }
                    hi3 hi3Var8 = this.D0;
                    if (hi3Var8 != null) {
                        hi3Var8.S();
                    }
                }
            }
        }
    }

    public final void y5() {
        je5 je5Var;
        boolean b5 = getMessagesController().b5();
        if (this.P3 != b5) {
            q5();
            if (!this.P3 && b5 && (je5Var = this.q0) != null) {
                je5Var.v();
            }
            this.P3 = b5;
        }
        un4 un4Var = this.u0;
        if (un4Var == null) {
            return;
        }
        if (this.T0 == 10) {
            un4Var.setImageResource(R.drawable.floating_check);
            this.u0.setContentDescription(k96.M0(2131751342, null));
        } else {
            un4Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.u0.setContentDescription(k96.M0(2131748078, null));
        }
    }

    public final void z2(rf4 rf4Var) {
        hi3 hi3Var;
        if (!this.s3 || (hi3Var = this.D0) == null) {
            return;
        }
        ArrayList arrayList = hi3Var.D0;
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (rf4Var.b((rf4) arrayList.get(i))) {
                    return;
                }
            }
        }
        arrayList.add(rf4Var);
        pi3 pi3Var = this.Y;
        pi3Var.G.add(rf4Var);
        pi3Var.J = r1.size() - 1;
        pi3Var.e();
        this.Y.r.getText().clear();
        p5(true, null, null, false, true);
    }

    public final void z3(boolean z) {
        if (this.H3.c()) {
            z = true;
        }
        if (z && this.d2) {
            return;
        }
        this.Y3 = z;
        r5(true);
        if (z) {
            je5 je5Var = this.q0;
            if (je5Var != null) {
                je5Var.f(true);
            }
            je5 je5Var2 = this.r0;
            if (je5Var2 != null) {
                je5Var2.f(true);
            }
        }
    }

    public final boolean z4(View view, int i, float f, n39 n39Var) {
        mt9 mt9Var;
        mt9 mt9Var2;
        long E;
        if (getParentActivity() != null && !(view instanceof dk3) && n39Var.d(i) != 21) {
            if (!this.actionBar.y() && !gl.O1() && !this.n2 && (view instanceof ue3)) {
                ue3 ue3Var = (ue3) view;
                if (!getMessagesController().r2(ue3Var.getDialogId()) && !this.H3.c() && ue3Var.b0(f)) {
                    return Y4(ue3Var);
                }
            }
            rh3 rh3Var = this.H3;
            if (rh3Var == null || !rh3Var.c()) {
                hi3 hi3Var = this.D0;
                char c = 1;
                if (hi3Var != null && n39Var == (mt9Var2 = hi3Var.e0)) {
                    Object I = mt9Var2.I(i);
                    hi3 hi3Var2 = this.D0;
                    if (!hi3Var2.e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = k96.M0(2131752042, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                hdVar.U = k96.a0("ClearSearchSingleChatAlertText", null, 2131752041, mm4.j(this.currentAccount, chat, false));
                            } else {
                                hdVar.U = k96.a0("ClearSearchSingleChatAlertText", null, 2131752041, chat.title);
                            }
                            E = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().n) {
                                hdVar.U = k96.a0("ClearSearchSingleChatAlertText", null, 2131752041, k96.M0(2131745709, null));
                            } else {
                                hdVar.U = k96.a0("ClearSearchSingleUserAlertText", null, 2131752039, qu2.m(0, user.first_name, user.last_name));
                            }
                            E = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            hdVar.U = k96.a0("ClearSearchSingleUserAlertText", null, 2131752039, qu2.m(0, V1.first_name, V1.last_name));
                            E = cf3.E(r14.id);
                        }
                        alertDialog$Builder.j(k96.M0(2131752043, null), new rz1((Object) this, E, (byte) (c == true ? 1 : 0)));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        showDialog(hdVar);
                        TextView textView = (TextView) hdVar.c(-1);
                        if (textView != null) {
                            zkb.X(textView, bkb.p7, getResourceProvider());
                        }
                        return true;
                    }
                    hi3Var = hi3Var2;
                }
                if (hi3Var == null || n39Var != (mt9Var = hi3Var.e0)) {
                    Object J = ((oj3) n39Var).J(i);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.n2) {
                            if ((this.T0 == 3 || c3()) && D5(dialog.id)) {
                                if (this.T0 != 1 || !c3() || !this.o2 || !getMessagesController().r2(dialog.id)) {
                                    y2(dialog.id, view);
                                    u5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.T0 == 1);
                                bundle.putBoolean("quote", this.P0);
                                bundle.putBoolean("reply_to", this.O0);
                                qvb qvbVar = new qvb(bundle);
                                qvbVar.M0 = this;
                                presentFragment(qvbVar);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                x4(view);
                                return false;
                            }
                            if (!this.actionBar.y() || !F3(dialog)) {
                                d5(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.n2) {
                        y4(view, i, n39Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof rr8) || mt9Var.N(i)) ? 0L : ((rr8) view).getDialogId();
                    if (dialogId != 0) {
                        d5(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void z5(float f) {
        float f2;
        float f3;
        float i = Utilities.i(this.z1 * 2.0f, 1.0f, 0.0f);
        oh3 oh3Var = this.F0;
        float f4 = (1.0f - this.w3) * f * this.I0;
        float f5 = 1.0f - i;
        oh3Var.setAlpha(f4 * f5);
        if (this.L || this.N) {
            float i2 = Utilities.i((-this.O) / gl.L(81.0f), 1.0f, 0.0f);
            if (this.w3 == 1.0f) {
                i2 = 1.0f;
            }
            float i3 = Utilities.i(i2 / 0.5f, 1.0f, 0.0f);
            this.F0.setClipTop(0);
            if (this.L || !this.N) {
                this.F0.setTranslationY(((this.U / 2.0f) + (Math.max(this.O, -p3()) + this.y3)) - gl.L(8.0f));
                this.F0.l(!this.H3.c(), i2);
                if (this.N) {
                    f2 = 1.0f - i3;
                    this.actionBar.setTranslationY(0.0f);
                } else {
                    f3 = this.I0;
                }
            } else {
                this.F0.setTranslationY((-gl.L(81.0f)) - gl.L(8.0f));
                this.F0.setProgressToCollapse(1.0f);
                f3 = this.I0;
            }
            f2 = 1.0f - f3;
            this.actionBar.setTranslationY(0.0f);
        } else {
            if (this.M) {
                this.F0.setTranslationY((Math.max(this.O, -p3()) + (-gl.L(81.0f))) - gl.L(8.0f));
                this.F0.setProgressToCollapse(1.0f);
                oh3 oh3Var2 = this.F0;
                oh3Var2.setClipTop((int) (gl.m - oh3Var2.getY()));
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
        aVar.getTitlesContainer().setPivotY(gl.m);
        this.actionBar.getTitlesContainer().setPivotX(gl.L(20.0f));
        float f8 = (0.6f * f6) + 0.4f;
        this.actionBar.getTitlesContainer().setScaleY(f8);
        this.actionBar.getTitlesContainer().setScaleX(f8);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-gl.L(30.0f));
        this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f8);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f8);
        float f9 = (1.0f - this.w3) * f6;
        this.actionBar.getTitlesContainer().setAlpha(f9);
        this.actionBar.getTitlesContainer().setVisibility(f9 > 0.0f ? 0 : 4);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f9);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f9 <= 0.0f ? 4 : 0);
    }
}

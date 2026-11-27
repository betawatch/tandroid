// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
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
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class n12 extends nx0 implements fn7, ix0, s84 {
    public static final /* synthetic */ int G4 = 0;
    public boolean A1;
    public final m02 A2;
    public boolean A3;
    public boolean A4;
    public boolean B1;
    public final p02 B2;
    public final in B3;
    public mb1 B4;
    public int C1;
    public final ImageView C2;
    public float C3;
    public final tq3 C4;
    public c D1;
    public final int[] D2;
    public int D3;
    public final oz4 D4;
    public int E1;
    public final m02 E2;
    public r47 E3;
    public final ll0 E4;
    public int F1;
    public final u02 F2;
    public boolean F3;
    public final mr0 F4;
    public boolean G1;
    public final TextPaint G2;
    public final int G3;
    public boolean H1;
    public final RectF H2;
    public boolean H3;
    public boolean I1;
    public final Paint I2;
    public boolean I3;
    public boolean J1;
    public AnimatorSet J2;
    public boolean J3;
    public xn5 K1;
    public long K2;
    public boolean K3;
    public boolean L1;
    public final tt L2;
    public boolean L3;
    public final fz7 M1;
    public final r02 M2;
    public boolean M3;
    public w72 N1;
    public byte N2;
    public boolean N3;
    public zn5 O1;
    public yf0 O2;
    public boolean O3;
    public boolean P1;
    public boolean P2;
    public int P3;
    public boolean Q1;
    public boolean Q2;
    public boolean Q3;
    public k32 R1;
    public boolean R2;
    public boolean R3;
    public u12 S1;
    public final float S2;
    public float S3;
    public long T1;
    public long T2;
    public float T3;
    public boolean U1;
    public final y10 U2;
    public ValueAnimator U3;
    public final rl0 V1;
    public AnimatorSet V2;
    public int V3;
    public boolean W1;
    public AnimatorSet W2;
    public l12 W3;
    public float X1;
    public final s7 X2;
    public o62 X3;
    public final y02 Y1;
    public final bl2 Y2;
    public final int[] Y3;
    public final e Z1;
    public final s7 Z2;
    public int Z3;
    public final boolean a2;
    public kg5 a3;
    public float a4;
    public ox1 b2;
    public final s7 b3;
    public float b4;
    public boolean c2;
    public final u8 c3;
    public boolean c4;
    public final ChatAttachAlertPhotoLayout d2;
    public float d3;
    public float d4;
    public b32 e2;
    public float e3;
    public final boolean e4;
    public x12 f2;
    public final m02 f3;
    public boolean f4;
    public a72 g2;
    public final TextView g3;
    public final ArrayList g4;
    public a72 h2;
    public final s7 h3;
    public final Rect h4;
    public s42 i2;
    public final LinearLayout i3;
    public float i4;
    public u32 j2;
    public final ImageView j3;
    public boolean j4;
    public c62 k2;
    public final LinearLayout k3;
    public int k4;
    public final fm0 l1;
    public m22 l2;
    public final TextView l3;
    public final y02 l4;
    public final fm0 m1;
    public f72 m2;
    public float m3;
    public vpa m4;
    public final fm0 n1;
    public v32 n2;
    public boolean n3;
    public AnimatorSet n4;
    public final fm0 o1;
    public v32 o2;
    public final a12 o3;
    public int o4;
    public final fm0 p1;
    public v72 p2;
    public boolean p3;
    public int p4;
    public final fm0 q1;
    public h42 q2;
    public Object q3;
    public boolean q4;
    public final xa9 r1;
    public boolean r2;
    public boolean r3;
    public boolean r4;
    public xu1 s1;
    public float s2;
    public final jz1 s3;
    public boolean s4;
    public final in t1;
    public final f12[] t2;
    public final o02 t3;
    public r42 t4;
    public final in u1;
    public final LongSparseArray u2;
    public final m02 u3;
    public boolean u4;
    public final ImageView v1;
    public f12 v2;
    public final n02 v3;
    public boolean v4;
    public final hc w1;
    public f12 w2;
    public final x46 w3;
    public File w4;
    public final ImageView x1;
    public final jl0 x2;
    public final k12 x3;
    public double[] x4;
    public final hc y1;
    public final jl0 y2;
    public boolean y3;
    public boolean y4;
    public boolean z1;
    public final c41 z2;
    public final RadialProgressView z3;
    public boolean z4;

    public n12(Context context, e eVar, boolean z, boolean z2, boolean z3, final vnb vnbVar) {
        super(1, vnbVar, context, false);
        ll0 ll0Var;
        ll0 ll0Var2;
        s7 s7Var;
        u8 u8Var;
        float f;
        int i;
        k43 k43Var = k43.h;
        this.l1 = new fm0(0, this, k43Var, 380L, false);
        this.m1 = new fm0(1, this, k43Var, 380L, false);
        this.n1 = new fm0(2, this, k43Var, 380L, false);
        this.o1 = new fm0(3, this, k43Var, 380L, false);
        this.p1 = new fm0(4, this, k43Var, 380L, true);
        this.q1 = new fm0(5, this, k43Var, 320L, false);
        xa9 xa9Var = new xa9(new xz1(this, (byte) 1), k43Var, 380L);
        this.r1 = xa9Var;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.X1 = 0.0f;
        this.Y1 = new y02(this, (byte) 0);
        this.c2 = false;
        f12[] f12VarArr = new f12[12];
        this.t2 = f12VarArr;
        this.u2 = new LongSparseArray();
        this.D2 = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.G2 = textPaint;
        this.H2 = new RectF();
        this.I2 = new Paint(1);
        this.R2 = true;
        this.S2 = 1.0f;
        this.y3 = false;
        this.A3 = false;
        int i2 = yac.t0;
        this.G3 = i2;
        this.H3 = true;
        this.I3 = true;
        this.J3 = true;
        this.K3 = true;
        this.L3 = true;
        this.M3 = true;
        this.N3 = true;
        this.P3 = -1;
        this.Q3 = true;
        this.V3 = hl.L(85.0f);
        this.Y3 = new int[2];
        new Paint(1);
        this.f4 = false;
        ArrayList arrayList = new ArrayList();
        this.g4 = arrayList;
        Rect rect = new Rect();
        this.h4 = rect;
        this.l4 = new y02(this, (byte) 1);
        this.r4 = true;
        this.s4 = false;
        this.z4 = false;
        this.A4 = false;
        this.y = true;
        oz4 oz4Var = new oz4();
        this.D4 = oz4Var;
        oz4Var.a(aob.v0(aob.d6, this.J0));
        this.X0.E.add(new ty4(oz4Var, new xz1(this, (byte) 3)));
        if (Build.VERSION.SDK_INT < 31 || !xea.f()) {
            this.C4 = null;
            ll0Var = new ll0(oz4Var, oz4Var, oz4Var);
            this.E4 = ll0Var;
            ll0Var2 = new ll0(oz4Var, oz4Var, oz4Var);
        } else {
            tq3 tq3Var = new tq3(false);
            this.C4 = tq3Var;
            this.X0.a(tq3Var);
            rz4 rz4Var = new rz4(oz4Var);
            rz4Var.f = oz4Var;
            rz4Var.d = tq3Var;
            rz4Var.e = -2;
            rz4 rz4Var2 = new rz4(null);
            rz4Var2.f = oz4Var;
            rz4Var2.d = tq3Var;
            rz4Var2.e = -3;
            ll0Var = new ll0(rz4Var, rz4Var, rz4Var);
            this.E4 = ll0Var;
            ll0Var.k = true;
            int L = i86.e(262144) ? hl.L(8.0f) : hl.L(48.0f);
            ll0Var.d = L;
            ll0Var.e = L;
            ll0Var2 = new ll0(rz4Var2, rz4Var2, rz4Var2);
            ll0Var2.k = true;
            int L2 = hl.L(48.0f);
            ll0Var2.d = L2;
            ll0Var2.e = L2;
        }
        ll0 ll0Var3 = ll0Var;
        ll0 ll0Var4 = new ll0(oz4Var, oz4Var, oz4Var);
        this.F4 = new mr0(this, (byte) 3);
        this.e4 = z;
        this.a2 = (eVar instanceof zu1) && eVar.isInBubbleMode();
        this.l0 = new OvershootInterpolator(0.7f);
        this.Z1 = eVar;
        this.G = true;
        this.z0 = this;
        jn7.f(i2).b(this, jn7.T0);
        jn7.f(i2).b(this, jn7.Z4);
        jn7.f(i2).b(this, jn7.i5);
        jn7.f(i2).b(this, jn7.F1);
        arrayList.add(rect);
        a12 a12Var = new a12(this, context);
        this.o3 = a12Var;
        a12Var.setDelegate(new b12(this));
        this.b = a12Var;
        a12Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.setPadding(i3, 0, i3, 0);
        y10 y10Var = new y10(this, context, vnbVar, (byte) 1);
        this.U2 = y10Var;
        y10Var.d1 = true;
        y10Var.setForcedMenuWidth(hl.L(46.0f));
        y10Var.setBackButtonDrawable(new gd0(false));
        int i4 = aob.j5;
        yob.l(y10Var, 1, i4, vnbVar);
        int i5 = aob.I5;
        yob.l(y10Var, 3, i5, vnbVar);
        yob.l(y10Var, 5, i4, vnbVar);
        y10Var.setOccupyStatusBar(true);
        y10Var.setAlpha(0.0f);
        y10Var.setActionBarMenuOnItemClick(new s8(this, (byte) 23));
        ll0 ll0Var5 = ll0Var2;
        s7 s7Var2 = new s7(context, null, 0, aob.v0(i4, this.J0), false, vnbVar);
        this.X2 = s7Var2;
        s7Var2.setLongClickEnabled(false);
        s7Var2.setIcon(R.drawable.ic_ab_other);
        s7Var2.setContentDescription(ob6.M0(2131754834, null));
        s7Var2.setVisibility(4);
        s7Var2.setAlpha(0.0f);
        s7Var2.setScaleX(0.6f);
        s7Var2.setScaleY(0.6f);
        s7Var2.setSubMenuOpenSide(2);
        s7Var2.setDelegate(new xz1(this, (byte) 9));
        s7Var2.setAdditionalYOffset(hl.L(72.0f));
        s7Var2.setTranslationX(hl.L(1.0f));
        hf0 f0 = aob.f0(aob.v0(i5, this.J0), 6, -1);
        uob M = yob.M(i5);
        s7Var2.setBackground(f0);
        yob.j(s7Var2, f0, null, M, vnbVar);
        final byte b = 5;
        s7Var2.setOnClickListener(new View.OnClickListener(this) { // from class: a02
            public final /* synthetic */ n12 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j22 j22Var;
                byte b2 = b;
                n12 n12Var = this.b;
                switch (b2) {
                    case 0:
                        n12Var.K1(n12Var.v2 != n12Var.k2);
                        break;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = n12Var.W1;
                        if (!z4) {
                            n12Var.r1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = n12Var.W1;
                        if (z5) {
                            n12Var.r1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        n12Var.j1();
                        break;
                    case 5:
                        n12Var.X2.U(null, null);
                        break;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z6 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i6 = 0; i6 < chatAttachAlertPhotoLayout.F.getChildCount(); i6++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i6);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var3 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            kg5Var2.t(hl.S2(ob6.M0(!S ? 2131748586 : 2131748587, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var3.getWidth() / 2.0f) + s7Var3.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            break;
                        }
                        break;
                    default:
                        n12Var.h3.U(null, null);
                        break;
                }
            }
        });
        s7 s7Var3 = new s7(context, null, 0, aob.v0(i4, this.J0), false, vnbVar);
        this.Z2 = s7Var3;
        s7Var3.setLongClickEnabled(false);
        bl2 bl2Var = new bl2();
        this.Y2 = bl2Var;
        s7Var3.setIcon(bl2Var);
        s7Var3.setContentDescription(ob6.M0(2131754834, null));
        s7Var3.setVisibility(8);
        s7Var3.setAlpha(0.0f);
        s7Var3.setScaleX(0.6f);
        s7Var3.setScaleY(0.6f);
        s7Var3.setAdditionalYOffset(hl.L(72.0f));
        s7Var3.setTranslationX(-hl.L(3.0f));
        final byte b2 = 6;
        hf0 f02 = aob.f0(aob.v0(i5, this.J0), 6, -1);
        uob M2 = yob.M(i5);
        s7Var3.setBackground(f02);
        yob.j(s7Var3, f02, null, M2, vnbVar);
        s7Var3.setOnClickListener(new View.OnClickListener(this) { // from class: a02
            public final /* synthetic */ n12 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j22 j22Var;
                byte b22 = b2;
                n12 n12Var = this.b;
                switch (b22) {
                    case 0:
                        n12Var.K1(n12Var.v2 != n12Var.k2);
                        break;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = n12Var.W1;
                        if (!z4) {
                            n12Var.r1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = n12Var.W1;
                        if (z5) {
                            n12Var.r1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        n12Var.j1();
                        break;
                    case 5:
                        n12Var.X2.U(null, null);
                        break;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z6 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i6 = 0; i6 < chatAttachAlertPhotoLayout.F.getChildCount(); i6++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i6);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            kg5Var2.t(hl.S2(ob6.M0(!S ? 2131748586 : 2131748587, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            break;
                        }
                        break;
                    default:
                        n12Var.h3.U(null, null);
                        break;
                }
            }
        });
        u8 u8Var2 = new u8(this, context);
        yob.X(u8Var2, aob.Ji, vnbVar);
        u8Var2.setText(ob6.M0(2131751718, null));
        u8Var2.setTypeface(hl.o());
        u8Var2.setTextSize(1, 14.0f);
        u8Var2.setVisibility(4);
        u8Var2.setAlpha(0.0f);
        u8Var2.setGravity(17);
        u8Var2.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        u8Var2.setTranslationX(-hl.L(12.0f));
        final byte b3 = 7;
        u8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: a02
            public final /* synthetic */ n12 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j22 j22Var;
                byte b22 = b3;
                n12 n12Var = this.b;
                switch (b22) {
                    case 0:
                        n12Var.K1(n12Var.v2 != n12Var.k2);
                        break;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = n12Var.W1;
                        if (!z4) {
                            n12Var.r1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = n12Var.W1;
                        if (z5) {
                            n12Var.r1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        n12Var.j1();
                        break;
                    case 5:
                        n12Var.X2.U(null, null);
                        break;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z6 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i6 = 0; i6 < chatAttachAlertPhotoLayout.F.getChildCount(); i6++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i6);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            kg5Var2.t(hl.S2(ob6.M0(!S ? 2131748586 : 2131748587, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            break;
                        }
                        break;
                    default:
                        n12Var.h3.U(null, null);
                        break;
                }
            }
        });
        iye.a(u8Var2);
        this.c3 = u8Var2;
        H1();
        if (eVar != null) {
            s7Var = s7Var3;
            u8Var = u8Var2;
            f = 14.0f;
            s7 s7Var4 = new s7(context, null, 0, aob.v0(i4, this.J0), false, vnbVar);
            this.b3 = s7Var4;
            s7Var4.setLongClickEnabled(false);
            s7Var4.setIcon(R.drawable.outline_header_search);
            s7Var4.setContentDescription(ob6.M0(2131745564, null));
            s7Var4.setVisibility(4);
            s7Var4.setAlpha(0.0f);
            s7Var4.setTranslationX(-hl.L(42.0f));
            hf0 f03 = aob.f0(aob.v0(i5, this.J0), 6, -1);
            uob M3 = yob.M(i5);
            s7Var4.setBackground(f03);
            yob.j(s7Var4, f03, null, M3, vnbVar);
            s7Var4.setOnClickListener(new w6((byte) 2, this, z2));
        } else {
            s7Var = s7Var3;
            u8Var = u8Var2;
            f = 14.0f;
        }
        s7 s7Var5 = new s7(context, null, 0, aob.v0(i4, this.J0), false, vnbVar);
        this.h3 = s7Var5;
        s7Var5.setLongClickEnabled(false);
        s7Var5.setIcon(R.drawable.ic_ab_other);
        s7Var5.setContentDescription(ob6.M0(2131754834, null));
        final byte b4 = 8;
        s7Var5.setVisibility(8);
        hf0 f04 = aob.f0(aob.v0(i5, this.J0), 3, -1);
        uob M4 = yob.M(i5);
        s7Var5.setBackground(f04);
        yob.j(s7Var5, f04, null, M4, vnbVar);
        final byte b5 = 2;
        s7Var5.e(1, R.drawable.msg_addbot, ob6.M0(2131744534, null)).setOnClickListener(new View.OnClickListener(this) { // from class: c02
            public final /* synthetic */ n12 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b6 = b5;
                vnb vnbVar2 = vnbVar;
                final n12 n12Var = this.b;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                char c = 1;
                char c2 = 1;
                switch (b6) {
                    case 0:
                        p02 p02Var = n12Var.B2;
                        if (p02Var != null) {
                            uc7.e1().edit().putInt("aihintshown", 3).apply();
                            b1 b1Var = new b1(n12Var.getContext(), vnbVar2);
                            b1Var.q1(p02Var.getText());
                            final Object[] objArr3 = objArr2 == true ? 1 : 0;
                            b1Var.e2 = new pcc() { // from class: d02
                                @Override // pcc
                                public final void a(Object obj) {
                                    byte b7 = objArr3;
                                    n12 n12Var2 = n12Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b7) {
                                        case 0:
                                            p02 p02Var2 = n12Var2.B2;
                                            p02Var2.setText(charSequence);
                                            p02Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            r02 r02Var = n12Var2.M2;
                                            r02Var.setText(charSequence);
                                            r02Var.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            b1Var.o1(n12Var.T1, n12Var.E3 != null, new e02(n12Var, objArr == true ? 1 : 0));
                            b1Var.show();
                            break;
                        }
                        break;
                    case 1:
                        r02 r02Var = n12Var.M2;
                        if (r02Var != null) {
                            uc7.e1().edit().putInt("aihintshown", 3).apply();
                            b1 b1Var2 = new b1(n12Var.getContext(), vnbVar2);
                            b1Var2.q1(r02Var.getText());
                            final char c3 = c2 == true ? 1 : 0;
                            b1Var2.e2 = new pcc() { // from class: d02
                                @Override // pcc
                                public final void a(Object obj) {
                                    byte b7 = c3;
                                    n12 n12Var2 = n12Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b7) {
                                        case 0:
                                            p02 p02Var2 = n12Var2.B2;
                                            p02Var2.setText(charSequence);
                                            p02Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            r02 r02Var2 = n12Var2.M2;
                                            r02Var2.setText(charSequence);
                                            r02Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            b1Var2.o1(n12Var.T1, n12Var.E3 != null, new e02(n12Var, c == true ? 1 : 0));
                            b1Var2.show();
                            break;
                        }
                        break;
                    default:
                        n12Var.h3.U(null, null);
                        PhotoViewer q0 = PhotoViewer.q0();
                        e eVar2 = n12Var.Z1;
                        q0.T1(null, eVar2, vnbVar2);
                        PhotoViewer.q0().U1(n12Var);
                        PhotoViewer q02 = PhotoViewer.q0();
                        int i6 = n12Var.P3;
                        boolean z4 = n12Var.Q3;
                        q02.h = i6;
                        q02.n = z4;
                        if (!n12Var.W3.o()) {
                            hl.t1(eVar2.getFragmentView().findFocus());
                            hl.t1(n12Var.c.findFocus());
                        }
                        File w = c8b.w(n12Var.G3, "webp");
                        Point point = hl.q;
                        int i7 = point.x;
                        int i8 = point.y;
                        if (i7 > 1080 || i8 > 1080) {
                            float min = Math.min(i7, i8) / 1080.0f;
                            i7 = (int) (i7 * min);
                            i8 = (int) (i8 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
                        } catch (Throwable th) {
                            cc4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        no6 no6Var = new no6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(no6Var);
                        PhotoViewer.q0().o1(arrayList2, 0, 11, false, new e12(n12Var, no6Var), eVar2 instanceof zu1 ? (zu1) eVar2 : null);
                        if (n12Var.A1) {
                            PhotoViewer.q0().U(null, null, true, n12Var.D1);
                            break;
                        }
                        break;
                }
            }
        });
        s7Var5.setMenuYOffset(hl.L(-12.0f));
        s7Var5.setAdditionalXOffset(hl.L(12.0f));
        s7Var5.setOnClickListener(new View.OnClickListener(this) { // from class: a02
            public final /* synthetic */ n12 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j22 j22Var;
                byte b22 = b4;
                n12 n12Var = this.b;
                switch (b22) {
                    case 0:
                        n12Var.K1(n12Var.v2 != n12Var.k2);
                        break;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = n12Var.W1;
                        if (!z4) {
                            n12Var.r1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = n12Var.W1;
                        if (z5) {
                            n12Var.r1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        n12Var.j1();
                        break;
                    case 5:
                        n12Var.X2.U(null, null);
                        break;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z6 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i6 = 0; i6 < chatAttachAlertPhotoLayout.F.getChildCount(); i6++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i6);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            kg5Var2.t(hl.S2(ob6.M0(!S ? 2131748586 : 2131748587, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            break;
                        }
                        break;
                    default:
                        n12Var.h3.U(null, null);
                        break;
                }
            }
        });
        final byte b6 = 0;
        m02 m02Var = new m02(this, context, b6);
        this.f3 = m02Var;
        m02Var.setOnClickListener(new View.OnClickListener(this) { // from class: a02
            public final /* synthetic */ n12 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j22 j22Var;
                byte b22 = b6;
                n12 n12Var = this.b;
                switch (b22) {
                    case 0:
                        n12Var.K1(n12Var.v2 != n12Var.k2);
                        break;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = n12Var.W1;
                        if (!z4) {
                            n12Var.r1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = n12Var.W1;
                        if (z5) {
                            n12Var.r1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        n12Var.j1();
                        break;
                    case 5:
                        n12Var.X2.U(null, null);
                        break;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z6 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                            chatAttachAlertPhotoLayout.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i6 = 0; i6 < chatAttachAlertPhotoLayout.F.getChildCount(); i6++) {
                                                View childAt = chatAttachAlertPhotoLayout.F.getChildAt(i6);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            kg5Var2.t(hl.S2(ob6.M0(!S ? 2131748586 : 2131748587, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            break;
                        }
                        break;
                    default:
                        n12Var.h3.U(null, null);
                        break;
                }
            }
        });
        m02Var.setAlpha(0.0f);
        m02Var.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.i3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.g3 = textView;
        qd4.w(textView, i4, vnbVar, 1, 16.0f);
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, tre.r(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.j3 = imageView;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.x(imageView, mutate, i4, vnbVar, mode);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, tre.t(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        m02Var.addView(linearLayout, tre.c(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.k3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        yob.x(imageView2, mutate2, i4, vnbVar, mode);
        imageView2.setImageDrawable(mutate2);
        linearLayout2.addView(imageView2, tre.t(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.l3 = textView2;
        qd4.w(textView2, i4, vnbVar, 1, 16.0f);
        uh9.q(textView2, 19, "AttachMediaPreview", 2131753951);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, tre.r(-2, -2, 16));
        m02Var.addView(linearLayout2, tre.c(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z, z3, vnbVar);
        this.d2 = chatAttachAlertPhotoLayout;
        f12VarArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.v2 = chatAttachAlertPhotoLayout;
        this.T2 = 1L;
        this.b.addView(chatAttachAlertPhotoLayout, tre.c(-1.0f, -1));
        jz1 jz1Var = new jz1(context);
        this.s3 = jz1Var;
        jz1Var.setup(ll0Var4);
        jz1Var.setFadeTopAlpha(0);
        jz1Var.setFadeHeightTop(hl.L(48.0f));
        jz1Var.setFadeHeightBottom(hl.L(48.0f));
        jz1Var.setFadeZoneTop(hl.L(5.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + hl.m);
        this.b.addView(jz1Var, tre.g());
        this.b.addView(m02Var, tre.d(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        tt ttVar = new tt(context, (byte) 6);
        this.L2 = ttVar;
        this.b.addView(ttVar, tre.e(-1, -2, 55));
        this.b.addView(y10Var, tre.c(-2.0f, -1));
        this.b.addView(s7Var2, tre.e(48, 48, 53));
        this.b.addView(s7Var, tre.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        s7 s7Var6 = this.b3;
        if (s7Var6 != null) {
            this.b.addView(s7Var6, tre.e(48, 48, 53));
        }
        m02Var.addView(s7Var5, tre.d(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.b.addView(u8Var, tre.e(-2, 48, 53));
        m02 m02Var2 = new m02(this, context, (byte) 1);
        this.u3 = m02Var2;
        n02 n02Var = new n02(context, (byte) 0);
        this.v3 = n02Var;
        n02Var.setClipChildren(true);
        n02Var.setClipToPadding(false);
        k12 k12Var = new k12(this, context);
        this.x3 = k12Var;
        n02Var.setAdapter(k12Var);
        x46 x46Var = new x46(0, false);
        this.w3 = x46Var;
        n02Var.setLayoutManager(x46Var);
        n02Var.setVerticalScrollBarEnabled(false);
        n02Var.setHorizontalScrollBarEnabled(false);
        n02Var.setItemAnimator(null);
        n02Var.setLayoutAnimation(null);
        yob.l(n02Var, 21, aob.A5, vnbVar);
        n02Var.z2 = true;
        n02Var.setOverScrollMode(2);
        vy4 vy4Var = this.X0;
        ll0Var3.j = vy4Var;
        ll0Var5.j = vy4Var;
        ll0Var4.j = vy4Var;
        o02 o02Var = new o02(this, context, (byte) 0);
        this.t3 = o02Var;
        rl0 rl0Var = new rl0(ll0Var4.c(o02Var, null, false));
        this.V1 = rl0Var;
        if (xea.f()) {
            i86.e(262144);
        }
        rl0Var.b(hl.L(72.0f), true);
        this.b.addView(o02Var, tre.g());
        jl0 c = ll0Var3.c(m02Var2, dtd.g(vnbVar), false);
        c.r(hl.L(28.0f));
        c.q(hl.L(7.0f));
        m02Var2.setBackground(c);
        n02Var.setPadding(hl.L(11.0f), hl.L(11.0f), hl.L(11.0f), hl.L(11.0f));
        n02Var.setClipToOutline(true);
        int L3 = hl.L(11.0f);
        float L4 = hl.L(28.0f);
        yi yiVar = yhc.a;
        n02Var.setOutlineProvider(new whc(L3, L4));
        n02Var.setImportantForAccessibility(1);
        m02Var2.addView(n02Var, tre.g());
        this.b.addView(m02Var2, tre.e(-1, 70, 81));
        n02Var.setOnItemClickListener(new l0(this, vnbVar, (byte) 8));
        n02Var.setOnItemLongClickListener(new xz1(this, (byte) 2));
        in inVar = new in(context, true, false, true);
        this.B3 = inVar;
        inVar.setVisibility(8);
        inVar.setAlpha(0.0f);
        inVar.setGravity(17);
        inVar.setTypeface(hl.o());
        int L5 = hl.L(16.0f);
        inVar.setPadding(L5, 0, L5, 0);
        inVar.setTextSize(hl.L(f));
        final byte b7 = 1;
        inVar.setOnClickListener(new View.OnClickListener(this) { // from class: a02
            public final /* synthetic */ n12 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j22 j22Var;
                byte b22 = b7;
                n12 n12Var = this.b;
                switch (b22) {
                    case 0:
                        n12Var.K1(n12Var.v2 != n12Var.k2);
                        break;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = n12Var.W1;
                        if (!z4) {
                            n12Var.r1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = n12Var.W1;
                        if (z5) {
                            n12Var.r1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        n12Var.j1();
                        break;
                    case 5:
                        n12Var.X2.U(null, null);
                        break;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z6 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = n12Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i6 = 0; i6 < chatAttachAlertPhotoLayout2.F.getChildCount(); i6++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i6);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            kg5Var2.t(hl.S2(ob6.M0(!S ? 2131748586 : 2131748587, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            break;
                        }
                        break;
                    default:
                        n12Var.h3.U(null, null);
                        break;
                }
            }
        });
        this.b.addView(inVar, tre.e(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.z3 = radialProgressView;
        radialProgressView.setSize(hl.L(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.b.addView(radialProgressView, tre.d(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.C2 = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int i6 = aob.z6;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        yob.s(imageView3, i6, vnbVar, mode2);
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final byte b8 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: a02
            public final /* synthetic */ n12 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j22 j22Var;
                byte b22 = b8;
                n12 n12Var = this.b;
                switch (b22) {
                    case 0:
                        n12Var.K1(n12Var.v2 != n12Var.k2);
                        break;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = n12Var.W1;
                        if (!z4) {
                            n12Var.r1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = n12Var.W1;
                        if (z5) {
                            n12Var.r1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        n12Var.j1();
                        break;
                    case 5:
                        n12Var.X2.U(null, null);
                        break;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z6 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = n12Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i62 = 0; i62 < chatAttachAlertPhotoLayout2.F.getChildCount(); i62++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i62);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            kg5Var2.t(hl.S2(ob6.M0(!S ? 2131748586 : 2131748587, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            break;
                        }
                        break;
                    default:
                        n12Var.h3.U(null, null);
                        break;
                }
            }
        });
        m02 m02Var3 = new m02(this, context, b8);
        this.A2 = m02Var3;
        c41 c41Var = new c41(this, context);
        this.z2 = c41Var;
        m02Var3.addView(c41Var, tre.e(-1, -1, jn7.D1));
        jl0 c2 = ll0Var5.c(a12Var, dtd.n(vnbVar), false);
        this.x2 = c2;
        c2.U = true;
        c2.s(hl.L(29.0f), hl.L(29.0f), 0.0f, 0.0f);
        c2.u(hl.L(32.0f));
        c2.S.g = 0.4f;
        c2.n();
        jl0 c3 = ll0Var3.c(c41Var, dtd.n(vnbVar), false);
        this.y2 = c3;
        c3.r(hl.L(22.0f));
        c3.q(hl.L(7.0f));
        c41Var.setPadding(hl.L(7.0f), hl.L(5.0f), hl.L(7.0f), hl.L(5.0f));
        m02Var3.setWillNotDraw(false);
        m02Var3.setVisibility(4);
        m02Var3.setAlpha(0.0f);
        this.b.addView(m02Var3, tre.e(-1, -2, 83));
        m02Var3.setOnTouchListener(new b02((byte) 0));
        in inVar2 = new in(context, false, false, false);
        this.t1 = inVar2;
        inVar2.setAllowCancel(true);
        inVar2.setScaleProperty(0.6f);
        inVar2.setVisibility(8);
        inVar2.setTextSize(hl.L(15.0f));
        int i7 = aob.y6;
        yob.U(inVar2, i7, vnbVar);
        inVar2.setTypeface(hl.o());
        inVar2.setGravity(17);
        c41Var.addView(inVar2, tre.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.v1 = imageView4;
        hc hcVar = new hc(context);
        this.w1 = hcVar;
        imageView4.setImageDrawable(hcVar);
        imageView4.setScaleType(scaleType);
        int i8 = aob.Nl;
        yob.s(imageView4, i8, vnbVar, mode);
        int i9 = aob.i6;
        hf0 f05 = aob.f0(aob.v0(i9, this.J0), 1, hl.L(16.0f));
        uob M5 = yob.M(i9);
        imageView4.setBackground(f05);
        yob.j(imageView4, f05, null, M5, vnbVar);
        c41Var.addView(imageView4, tre.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(ob6.M0(2131755003, null));
        iye.a(imageView4);
        final byte b9 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: c02
            public final /* synthetic */ n12 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b62 = b9;
                vnb vnbVar2 = vnbVar;
                final n12 n12Var = this.b;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                char c4 = 1;
                char c22 = 1;
                switch (b62) {
                    case 0:
                        p02 p02Var = n12Var.B2;
                        if (p02Var != null) {
                            uc7.e1().edit().putInt("aihintshown", 3).apply();
                            b1 b1Var = new b1(n12Var.getContext(), vnbVar2);
                            b1Var.q1(p02Var.getText());
                            final byte objArr3 = objArr2 == true ? 1 : 0;
                            b1Var.e2 = new pcc() { // from class: d02
                                @Override // pcc
                                public final void a(Object obj) {
                                    byte b72 = objArr3;
                                    n12 n12Var2 = n12Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b72) {
                                        case 0:
                                            p02 p02Var2 = n12Var2.B2;
                                            p02Var2.setText(charSequence);
                                            p02Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            r02 r02Var2 = n12Var2.M2;
                                            r02Var2.setText(charSequence);
                                            r02Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            b1Var.o1(n12Var.T1, n12Var.E3 != null, new e02(n12Var, objArr == true ? 1 : 0));
                            b1Var.show();
                            break;
                        }
                        break;
                    case 1:
                        r02 r02Var = n12Var.M2;
                        if (r02Var != null) {
                            uc7.e1().edit().putInt("aihintshown", 3).apply();
                            b1 b1Var2 = new b1(n12Var.getContext(), vnbVar2);
                            b1Var2.q1(r02Var.getText());
                            final byte c32 = c22 == true ? 1 : 0;
                            b1Var2.e2 = new pcc() { // from class: d02
                                @Override // pcc
                                public final void a(Object obj) {
                                    byte b72 = c32;
                                    n12 n12Var2 = n12Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b72) {
                                        case 0:
                                            p02 p02Var2 = n12Var2.B2;
                                            p02Var2.setText(charSequence);
                                            p02Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            r02 r02Var2 = n12Var2.M2;
                                            r02Var2.setText(charSequence);
                                            r02Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            b1Var2.o1(n12Var.T1, n12Var.E3 != null, new e02(n12Var, c4 == true ? 1 : 0));
                            b1Var2.show();
                            break;
                        }
                        break;
                    default:
                        n12Var.h3.U(null, null);
                        PhotoViewer q0 = PhotoViewer.q0();
                        e eVar2 = n12Var.Z1;
                        q0.T1(null, eVar2, vnbVar2);
                        PhotoViewer.q0().U1(n12Var);
                        PhotoViewer q02 = PhotoViewer.q0();
                        int i62 = n12Var.P3;
                        boolean z4 = n12Var.Q3;
                        q02.h = i62;
                        q02.n = z4;
                        if (!n12Var.W3.o()) {
                            hl.t1(eVar2.getFragmentView().findFocus());
                            hl.t1(n12Var.c.findFocus());
                        }
                        File w = c8b.w(n12Var.G3, "webp");
                        Point point = hl.q;
                        int i72 = point.x;
                        int i82 = point.y;
                        if (i72 > 1080 || i82 > 1080) {
                            float min = Math.min(i72, i82) / 1080.0f;
                            i72 = (int) (i72 * min);
                            i82 = (int) (i82 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i72, i82, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
                        } catch (Throwable th) {
                            cc4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        no6 no6Var = new no6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(no6Var);
                        PhotoViewer.q0().o1(arrayList2, 0, 11, false, new e12(n12Var, no6Var), eVar2 instanceof zu1 ? (zu1) eVar2 : null);
                        if (n12Var.A1) {
                            PhotoViewer.q0().U(null, null, true, n12Var.D1);
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
        this.E1 = uc7.s1(yac.t0).H0();
        p02 p02Var = new p02(this, context, a12Var, vnbVar);
        this.B2 = p02Var;
        p02Var.K = true;
        p02Var.setHint(ob6.M0(2131754447, "AddCaption"));
        p02Var.s();
        p02Var.getEditText().setLayoutParams(tre.d(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        p02Var.getEditText().addTextChangedListener(new q02(this, (byte) 0));
        c41Var.addView(p02Var, tre.d(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        c41Var.setClipChildren(false);
        m02Var3.setClipChildren(false);
        p02Var.setClipChildren(false);
        ttVar.setPadding(hl.L(10.0f), hl.L(2.0f), hl.L(10.0f), hl.L(10.0f));
        ttVar.setWillNotDraw(false);
        r02 r02Var = new r02(this, context, a12Var, vnbVar);
        this.M2 = r02Var;
        r02Var.K = true;
        r02Var.getEditText().addTextChangedListener(new t02(this, eVar));
        r02Var.getEditText().setPadding(0, hl.L(9.0f), 0, hl.L(9.0f));
        r02Var.getEditText().setLayoutParams(tre.d(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        r02Var.getEditText().setTextSize(1, 17.0f);
        r02Var.getEmojiButton().setLayoutParams(tre.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        r02Var.setHint(ob6.M0(2131754447, "AddCaption"));
        ttVar.addView(r02Var, tre.e(-1, -2, jn7.D1));
        ttVar.setAlpha(0.0f);
        ttVar.setVisibility(8);
        p02Var.addView(imageView3, tre.d(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        jl0 c4 = ll0Var3.c(ttVar, dtd.n(vnbVar), false);
        c4.r(hl.L(22.0f));
        c4.q(hl.L(7.0f));
        ttVar.setBackground(c4);
        ttVar.setPadding(hl.L(11.0f), hl.L(9.0f), hl.L(11.0f), hl.L(9.0f));
        in inVar3 = new in(context, false, false, false);
        this.u1 = inVar3;
        inVar3.setScaleProperty(0.6f);
        inVar3.setVisibility(8);
        inVar3.setTextSize(hl.L(15.0f));
        yob.U(inVar3, i7, vnbVar);
        inVar3.setTypeface(hl.o());
        inVar3.setGravity(17);
        inVar3.setAllowCancel(true);
        ttVar.addView(inVar3, tre.d(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        yob.s(imageView5, aob.Oe, vnbVar, mode2);
        r02Var.addView(imageView5, tre.d(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final byte b10 = 3;
        imageView5.setOnClickListener(new View.OnClickListener(this) { // from class: a02
            public final /* synthetic */ n12 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j22 j22Var;
                byte b22 = b10;
                n12 n12Var = this.b;
                switch (b22) {
                    case 0:
                        n12Var.K1(n12Var.v2 != n12Var.k2);
                        break;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = n12Var.W1;
                        if (!z4) {
                            n12Var.r1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = n12Var.W1;
                        if (z5) {
                            n12Var.r1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        n12Var.j1();
                        break;
                    case 5:
                        n12Var.X2.U(null, null);
                        break;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z6 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = n12Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i62 = 0; i62 < chatAttachAlertPhotoLayout2.F.getChildCount(); i62++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i62);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            kg5Var2.t(hl.S2(ob6.M0(!S ? 2131748586 : 2131748587, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            break;
                        }
                        break;
                    default:
                        n12Var.h3.U(null, null);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.x1 = imageView6;
        hc hcVar2 = new hc(context);
        this.y1 = hcVar2;
        imageView6.setImageDrawable(hcVar2);
        imageView6.setScaleType(scaleType);
        yob.s(imageView6, i8, vnbVar, mode);
        hf0 f06 = aob.f0(aob.v0(i9, this.J0), 1, hl.L(16.0f));
        uob M6 = yob.M(i9);
        imageView6.setBackground(f06);
        yob.j(imageView6, f06, null, M6, vnbVar);
        ttVar.addView(imageView6, tre.d(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(ob6.M0(2131755003, null));
        iye.a(imageView6);
        final byte b11 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: c02
            public final /* synthetic */ n12 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b62 = b11;
                vnb vnbVar2 = vnbVar;
                final n12 n12Var = this.b;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                char c42 = 1;
                char c22 = 1;
                switch (b62) {
                    case 0:
                        p02 p02Var2 = n12Var.B2;
                        if (p02Var2 != null) {
                            uc7.e1().edit().putInt("aihintshown", 3).apply();
                            b1 b1Var = new b1(n12Var.getContext(), vnbVar2);
                            b1Var.q1(p02Var2.getText());
                            final byte objArr3 = objArr2 == true ? 1 : 0;
                            b1Var.e2 = new pcc() { // from class: d02
                                @Override // pcc
                                public final void a(Object obj) {
                                    byte b72 = objArr3;
                                    n12 n12Var2 = n12Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b72) {
                                        case 0:
                                            p02 p02Var22 = n12Var2.B2;
                                            p02Var22.setText(charSequence);
                                            p02Var22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            r02 r02Var2 = n12Var2.M2;
                                            r02Var2.setText(charSequence);
                                            r02Var2.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            b1Var.o1(n12Var.T1, n12Var.E3 != null, new e02(n12Var, objArr == true ? 1 : 0));
                            b1Var.show();
                            break;
                        }
                        break;
                    case 1:
                        r02 r02Var2 = n12Var.M2;
                        if (r02Var2 != null) {
                            uc7.e1().edit().putInt("aihintshown", 3).apply();
                            b1 b1Var2 = new b1(n12Var.getContext(), vnbVar2);
                            b1Var2.q1(r02Var2.getText());
                            final byte c32 = c22 == true ? 1 : 0;
                            b1Var2.e2 = new pcc() { // from class: d02
                                @Override // pcc
                                public final void a(Object obj) {
                                    byte b72 = c32;
                                    n12 n12Var2 = n12Var;
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (b72) {
                                        case 0:
                                            p02 p02Var22 = n12Var2.B2;
                                            p02Var22.setText(charSequence);
                                            p02Var22.w(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            r02 r02Var22 = n12Var2.M2;
                                            r02Var22.setText(charSequence);
                                            r02Var22.w(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            b1Var2.o1(n12Var.T1, n12Var.E3 != null, new e02(n12Var, c42 == true ? 1 : 0));
                            b1Var2.show();
                            break;
                        }
                        break;
                    default:
                        n12Var.h3.U(null, null);
                        PhotoViewer q0 = PhotoViewer.q0();
                        e eVar2 = n12Var.Z1;
                        q0.T1(null, eVar2, vnbVar2);
                        PhotoViewer.q0().U1(n12Var);
                        PhotoViewer q02 = PhotoViewer.q0();
                        int i62 = n12Var.P3;
                        boolean z4 = n12Var.Q3;
                        q02.h = i62;
                        q02.n = z4;
                        if (!n12Var.W3.o()) {
                            hl.t1(eVar2.getFragmentView().findFocus());
                            hl.t1(n12Var.c.findFocus());
                        }
                        File w = c8b.w(n12Var.G3, "webp");
                        Point point = hl.q;
                        int i72 = point.x;
                        int i82 = point.y;
                        if (i72 > 1080 || i82 > 1080) {
                            float min = Math.min(i72, i82) / 1080.0f;
                            i72 = (int) (i72 * min);
                            i82 = (int) (i82 * min);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i72, i82, Bitmap.Config.ARGB_8888);
                        try {
                            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
                        } catch (Throwable th) {
                            cc4.g(th, true);
                        }
                        createBitmap.recycle();
                        ArrayList arrayList2 = new ArrayList();
                        no6 no6Var = new no6(0, w.getAbsolutePath(), 0, false, 0, 0);
                        arrayList2.add(no6Var);
                        PhotoViewer.q0().o1(arrayList2, 0, 11, false, new e12(n12Var, no6Var), eVar2 instanceof zu1 ? (zu1) eVar2 : null);
                        if (n12Var.A1) {
                            PhotoViewer.q0().U(null, null, true, n12Var.D1);
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
        m02 m02Var4 = new m02(this, context, (byte) 3);
        this.E2 = m02Var4;
        m02Var4.setFocusable(true);
        m02Var4.setFocusableInTouchMode(true);
        m02Var4.setVisibility(4);
        m02Var4.setScaleX(0.2f);
        m02Var4.setScaleY(0.2f);
        m02Var4.setAlpha(0.0f);
        m02Var4.setClipChildren(false);
        m02Var4.setClipToPadding(false);
        this.b.addView(m02Var4, tre.e(jn7.u1, 50, 85));
        u02 u02Var = new u02(this, vnbVar, context);
        this.F2 = u02Var;
        u02Var.setImportantForAccessibility(2);
        m02Var4.addView(u02Var, tre.e(-1, -1, jn7.D1));
        u02Var.setTranslationX(this.u0);
        int L6 = hl.L(52.0f);
        int L7 = hl.L(38.0f);
        u02Var.L = L6;
        u02Var.M = L7;
        float L8 = hl.L(7.0f);
        float L9 = hl.L(6.0f);
        u02Var.P = L8;
        u02Var.Q = L9;
        u02Var.t0 = true;
        final byte b12 = 4;
        u02Var.setOnClickListener(new View.OnClickListener(this) { // from class: a02
            public final /* synthetic */ n12 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j22 j22Var;
                byte b22 = b12;
                n12 n12Var = this.b;
                switch (b22) {
                    case 0:
                        n12Var.K1(n12Var.v2 != n12Var.k2);
                        break;
                    case 1:
                        long j = n12Var.T2;
                        if (j < 0 && (j22Var = (j22) n12Var.u2.get(-j)) != null) {
                            rv0 webViewContainer = j22Var.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.Q = System.currentTimeMillis();
                            webViewContainer.v("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 2:
                        boolean z4 = n12Var.W1;
                        if (!z4) {
                            n12Var.r1(!z4, true);
                            break;
                        }
                        break;
                    case 3:
                        boolean z5 = n12Var.W1;
                        if (z5) {
                            n12Var.r1(!z5, true);
                            break;
                        }
                        break;
                    case 4:
                        n12Var.j1();
                        break;
                    case 5:
                        n12Var.X2.U(null, null);
                        break;
                    case 6:
                        if (n12Var.d2 != null) {
                            boolean S = ChatAttachAlertPhotoLayout.S();
                            boolean z6 = !S;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = n12Var.d2;
                            chatAttachAlertPhotoLayout2.getClass();
                            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                            if (!hashMap.isEmpty()) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (entry.getValue() instanceof no6) {
                                        no6 no6Var = (no6) entry.getValue();
                                        if (no6Var.d()) {
                                            no6Var.O = Boolean.valueOf(S);
                                            for (int i62 = 0; i62 < chatAttachAlertPhotoLayout2.F.getChildCount(); i62++) {
                                                View childAt = chatAttachAlertPhotoLayout2.F.getChildAt(i62);
                                                if (childAt instanceof d88) {
                                                    d88 d88Var = (d88) childAt;
                                                    if (d88Var.getPhotoEntry() == no6Var) {
                                                        d88Var.getImageView().invalidate();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                                xea.e1 = z6;
                                edit.putBoolean("photoLiveDefault", z6).apply();
                                chatAttachAlertPhotoLayout2.y0();
                            }
                            n12Var.J1(true);
                            s7 s7Var32 = n12Var.Z2;
                            kg5 kg5Var = n12Var.a3;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            kg5 kg5Var2 = new kg5(n12Var.getContext(), 1);
                            n12Var.a3 = kg5Var2;
                            kg5Var2.t(hl.S2(ob6.M0(!S ? 2131748586 : 2131748587, null)));
                            n12Var.a3.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            n12Var.a3.o(1.0f, -((n12Var.b.getWidth() - ((s7Var32.getWidth() / 2.0f) + s7Var32.getX())) - hl.L(14.0f)));
                            n12Var.a3.setTranslationY(n12Var.X2.getTranslationY());
                            kg5 kg5Var3 = n12Var.a3;
                            kg5Var3.r0 = new dy1(n12Var, kg5Var2, (byte) 4);
                            n12Var.b.addView(kg5Var3, tre.d(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
                            n12Var.a3.v();
                            break;
                        }
                        break;
                    case 7:
                        f12 f12Var = n12Var.v2;
                        if (f12Var != null) {
                            f12Var.x(40);
                            break;
                        }
                        break;
                    default:
                        n12Var.h3.U(null, null);
                        break;
                }
            }
        });
        u02Var.setOnLongClickListener(new am1(this, context, vnbVar, eVar, (byte) 1));
        textPaint.setTextSize(hl.L(12.0f));
        textPaint.setTypeface(hl.o());
        o02 o02Var2 = new o02(this, context, (byte) 1);
        o02Var2.setAlpha(0.0f);
        o02Var2.setScaleX(0.2f);
        o02Var2.setScaleY(0.2f);
        if (z) {
            I0();
            i = -1;
            this.G0 = -1;
        } else {
            i = -1;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().a(ll0Var3, dtd.n(vnbVar));
        fz7 fz7Var = new fz7(context);
        this.M1 = fz7Var;
        this.b.addView(fz7Var, tre.c(-1.0f, i));
        ol0 ol0Var = new ol0(vnbVar);
        ol0Var.e = new xz1(this, (byte) 4);
        ol0Var.c = new xz1(this, (byte) 5);
        ol0Var.d = new xz1(this, (byte) 6);
        ol0Var.b = new xz1(this, (byte) 7);
        float N = hl.N(3.3333333f);
        float N2 = hl.N(0.6666667f);
        ol0Var.n = N;
        ol0Var.r = N2;
        float N3 = hl.N(1.0f);
        float N4 = hl.N(0.6666667f);
        ol0Var.f = N3;
        ol0Var.h = N4;
        y10Var.P(ll0Var3, ol0Var, false);
        xa9Var.h(1L, false);
        this.X0.i(this.b);
        vy4 vy4Var2 = this.X0;
        vy4Var2.a = new xz1(this, (byte) 8);
        vy4Var2.d = new gz4(hl.L(48.0f));
    }

    public static boolean c1(TLRPC.User user) {
        return (user == null || lbc.D(user) || lbc.v(user) || lbc.z(user) || lbc.C(user.id) || lbc.B(user) || lbc.u(user) || user.id == 489000 || uc7.K2(user)) ? false : true;
    }

    public static void o1(f12 f12Var) {
        if (f12Var != null) {
            int i = yob.b;
            Object tag = f12Var.getTag(R.id.theme_generation);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return;
            }
            f12Var.setTag(R.id.theme_generation, Integer.valueOf(i));
            try {
                yob.c0(f12Var, true);
                f12Var.d();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final boolean A1(boolean z, boolean z2) {
        float f;
        int i;
        f12 f12Var;
        y10 y10Var;
        this.m1.a(z, true);
        m02 m02Var = this.A2;
        if (z == (m02Var.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.J2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        m02Var.setTag(z ? 1 : null);
        p02 p02Var = this.B2;
        if (p02Var.getEditText().isFocused()) {
            hl.t1(p02Var.getEditText());
        }
        p02Var.k(true);
        this.M2.k(true);
        m02 m02Var2 = this.u3;
        m02 m02Var3 = this.E2;
        if (z) {
            if (!this.H1) {
                m02Var.setVisibility(0);
            }
            m02Var3.setVisibility(0);
        } else if (this.P2) {
            m02Var2.setVisibility(0);
        }
        f12 f12Var2 = this.v2;
        boolean z3 = (f12Var2 == this.d2 || f12Var2 == this.k2) && this.W1;
        y10 y10Var2 = this.U2;
        tt ttVar = this.L2;
        c41 c41Var = this.z2;
        u02 u02Var = this.F2;
        if (z2) {
            this.J2 = new AnimatorSet();
            if (z3) {
                ttVar.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(m02Var, (Property<m02, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(c41Var, (Property<c41, Float>) property, (!z || z3) ? 0.0f : 1.0f));
            if (!z || z3) {
                y10Var = y10Var2;
            } else {
                c41Var.setVisibility(0);
                y10Var = y10Var2;
                arrayList.add(ObjectAnimator.ofFloat(c41Var, (Property<c41, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(ttVar, (Property<tt, Float>) property, (z && z3) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(m02Var3, (Property<m02, Float>) property2, z ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(m02Var3, (Property<m02, Float>) property3, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(m02Var3, (Property<m02, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(u02Var, (Property<u02, Float>) property2, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(u02Var, (Property<u02, Float>) property3, z ? 1.0f : 0.2f));
            if (y10Var.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(m02Var, (Property<m02, Float>) View.TRANSLATION_Y, z ? 0.0f : hl.L(48.0f)));
            } else if (this.P2) {
                arrayList.add(ObjectAnimator.ofFloat(m02Var2, (Property<m02, Float>) View.TRANSLATION_Y, z ? hl.L(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(m02Var2, (Property<m02, Float>) property, z ? 0.0f : 1.0f));
            }
            if (z3) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new yz1(this, (byte) 5));
                arrayList.add(ofFloat);
            }
            this.J2.playTogether(arrayList);
            this.J2.setInterpolator(new DecelerateInterpolator());
            this.J2.setDuration(180L);
            this.J2.addListener(new y5(this, z, z3, (byte) 3));
            this.J2.start();
            i = 0;
        } else {
            m02Var.setAlpha(z ? 1.0f : 0.0f);
            c41Var.setAlpha((z && z3) ? 1.0f : 0.0f);
            if (!z || z3) {
                f = 0.0f;
                i = 0;
            } else {
                i = 0;
                c41Var.setVisibility(0);
                f = 0.0f;
                c41Var.setTranslationY(0.0f);
            }
            m02Var3.setScaleX(z ? 1.0f : 0.2f);
            m02Var3.setScaleY(z ? 1.0f : 0.2f);
            m02Var3.setAlpha(z ? 1.0f : f);
            ttVar.setVisibility((z && z3) ? i : 8);
            ttVar.setAlpha((z && z3) ? 1.0f : f);
            u02Var.setScaleX(z ? 1.0f : 0.2f);
            u02Var.setScaleY(z ? 1.0f : 0.2f);
            if (y10Var2.getTag() != null) {
                m02Var.setTranslationY(z ? f : hl.L(48.0f));
            } else if (this.P2 && ((f12Var = this.v2) == null || f12Var.M())) {
                m02Var2.setTranslationY(z ? hl.L(84.0f) : f);
            }
            if (!z) {
                m02Var.setVisibility(4);
                m02Var3.setVisibility(4);
            }
            if (z3) {
                M1();
            }
        }
        if (z) {
            i = Math.max(1, this.v2.getSelectedItemsCount());
        }
        u02Var.g(i, z2);
        u02Var.i(S0() + this.v2.getSelectedItemsCount(), this.E3 != null ? 0L : uc7.s1(this.G3).M1(W0()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p02Var.getLayoutParams();
        int max = Math.max(hl.L(48.0f), u02Var.l());
        if (marginLayoutParams.rightMargin != max) {
            marginLayoutParams.rightMargin = max;
            p02Var.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    @Override // nx0
    public final boolean B0() {
        f12 f12Var = this.v2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        return f12Var == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.j1;
    }

    public final void B1(f12 f12Var) {
        long j = this.T2;
        w72 w72Var = this.N1;
        if (f12Var == w72Var) {
            j = w72Var.s;
        } else if (f12Var == this.d2) {
            j = 1;
        } else if (f12Var == this.f2) {
            j = 3;
        } else if (f12Var == this.j2) {
            j = 4;
        } else if (f12Var == this.e2) {
            j = 5;
        } else if (f12Var == this.i2) {
            j = 6;
        } else if (f12Var == this.g2) {
            j = 9;
        } else if (f12Var == this.l2) {
            j = 10;
        } else if (f12Var == this.m2) {
            j = 11;
        } else if (f12Var == this.h2) {
            j = 12;
        } else if (f12Var == this.n2) {
            j = 14;
        } else if (f12Var == this.o2) {
            j = 13;
        } else if (f12Var == this.p2) {
            j = 16;
        } else if (f12Var == this.q2) {
            j = 17;
        }
        C1(f12Var, j, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C1(f12 f12Var, long j, boolean z) {
        r52 r52Var;
        r52 r52Var2;
        Float f;
        int i;
        Float valueOf = Float.valueOf(0.0f);
        if (this.q3 == null && this.J2 == null) {
            f12 f12Var2 = this.v2;
            if (f12Var2 == f12Var) {
                f12Var2.J();
                return;
            }
            int i2 = 0;
            if (f12Var == this.h2 && !yac.h(this.G3).p()) {
                new xk8(this.Z1, 39, false).show();
                return;
            }
            this.p1.a(j == 1, z);
            this.r1.h(Long.valueOf(j), z);
            this.A3 = false;
            this.y3 = false;
            this.C3 = 0.0f;
            this.B3.setVisibility(8);
            RadialProgressView radialProgressView = this.z3;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            m02 m02Var = this.u3;
            m02Var.setAlpha(1.0f);
            m02Var.setTranslationY(this.C3);
            int i3 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.u2;
                if (i3 >= longSparseArray.size()) {
                    break;
                }
                ((j22) longSparseArray.valueAt(i3)).setMeasureOffsetY(0);
                i3++;
            }
            this.T2 = j;
            n02 n02Var = this.v3;
            int childCount = n02Var.getChildCount();
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = n02Var.getChildAt(i4);
                if (childAt instanceof h12) {
                    h12 h12Var = (h12) childAt;
                    i = childCount;
                    f = valueOf;
                    h12Var.a.f(((long) h12Var.b) == h12Var.c.T2, true);
                } else {
                    f = valueOf;
                    i = childCount;
                    if (childAt instanceof g12) {
                        ((g12) childAt).a(true);
                    }
                }
                i4++;
                childCount = i;
                valueOf = f;
            }
            Float f2 = valueOf;
            int firstOffset = (this.v2.getFirstOffset() - hl.L(11.0f)) - this.Y3[0];
            this.w2 = f12Var;
            L0(f12Var);
            int i5 = this.w2.j() != 0 ? 0 : 4;
            y10 y10Var = this.U2;
            y10Var.setVisibility(i5);
            if (y10Var.o0) {
                y10Var.o(true);
            }
            this.v2.v();
            f12 f12Var3 = this.w2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if (f12Var3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.w2.H(this.v2);
            this.w2.setVisibility(0);
            if (f12Var.getParent() != null) {
                this.b.removeView(this.w2);
            }
            int indexOfChild = this.b.indexOfChild(this.v2);
            if (this.w2.getParent() != this.b) {
                o1(this.w2);
                ViewGroup viewGroup = this.b;
                f12 f12Var4 = this.w2;
                if (f12Var4 != this.i2) {
                    indexOfChild++;
                }
                viewGroup.addView(f12Var4, indexOfChild, tre.c(-1.0f, -1));
            }
            vq0 vq0Var = new vq0(this, (byte) 6);
            f12 f12Var5 = this.v2;
            boolean z2 = f12Var5 instanceof c62;
            y02 y02Var = this.Y1;
            if (z2 || (this.w2 instanceof c62)) {
                int max = Math.max(this.w2.getWidth(), this.v2.getWidth());
                f12 f12Var6 = this.w2;
                if (f12Var6 instanceof c62) {
                    f12Var6.setTranslationX(max);
                    f12 f12Var7 = this.v2;
                    if ((f12Var7 instanceof ChatAttachAlertPhotoLayout) && (r52Var2 = ((ChatAttachAlertPhotoLayout) f12Var7).Q) != null) {
                        r52Var2.setVisibility(4);
                    }
                } else {
                    this.v2.setTranslationX(-max);
                    f12 f12Var8 = this.w2;
                    if (f12Var8 == chatAttachAlertPhotoLayout && (r52Var = ((ChatAttachAlertPhotoLayout) f12Var8).Q) != null) {
                        r52Var.setVisibility(0);
                    }
                }
                this.w2.setAlpha(1.0f);
                this.v2.setAlpha(1.0f);
                if (z) {
                    f12 f12Var9 = this.v2;
                    y02Var.getClass();
                    y02Var.a(f12Var9, f2);
                    hl.c3(new on1(this, f12Var, vq0Var, (byte) 15));
                } else {
                    Object[] objArr = this.w2.getCurrentItemTop() <= f12Var.getButtonsHideOffset();
                    this.v2.w(1.0f);
                    this.w2.w(1.0f);
                    this.v2.m(this.i4);
                    this.w2.m(this.i4);
                    this.b.invalidate();
                    this.X0.g();
                    f12 f12Var10 = this.v2;
                    Float valueOf2 = Float.valueOf(1.0f);
                    y02Var.getClass();
                    y02Var.a(f12Var10, valueOf2);
                    y10Var.setTag(objArr != false ? 1 : null);
                    vq0Var.run();
                }
            } else if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.w2.setAlpha(0.0f);
                this.w2.setTranslationY(hl.L(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.v2, (Property<f12, Float>) View.TRANSLATION_Y, hl.L(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.v2, y02Var, 0.0f, 1.0f), ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) View.ALPHA, y10Var.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(k43.f);
                animatorSet.addListener(new v02(this, firstOffset, vq0Var, null == true ? 1 : 0));
                this.q3 = animatorSet;
                f12 f12Var11 = this.v2;
                y02Var.getClass();
                y02Var.a(f12Var11, f2);
                animatorSet.start();
            } else {
                f12Var5.setAlpha(0.0f);
                vq0Var.run();
                L1(0);
                this.b.invalidate();
            }
            if (this.j4 && !(f12Var instanceof j22)) {
                this.j4 = false;
                y10Var.updateColors();
                y10Var.invalidate();
                e1();
            }
            if (j == 1 || j == 6 || j == 17 || (f12Var instanceof j22)) {
                i2 = hl.L(46.0f);
            } else if (j == 4) {
                i2 = hl.L(84.0f);
            }
            y10Var.setForcedMenuWidth(i2);
        }
    }

    @Override // nx0
    public final boolean D() {
        return false;
    }

    public final void D1(boolean z, Boolean bool) {
        n12 n12Var;
        if (this.g2 == null) {
            n12Var = this;
            a72 a72Var = new a72(n12Var, getContext(), false, this.J0, bool);
            n12Var.g2 = a72Var;
            n12Var.t2[1] = a72Var;
            a72Var.setDelegate(new xz1(n12Var, (byte) 16));
        } else {
            n12Var = this;
        }
        n12Var.C1(n12Var.g2, 9L, z);
    }

    @Override // nx0
    public final boolean E() {
        return this.v2.b();
    }

    public final void E1(boolean z, boolean z2) {
        Integer num;
        f12 f12Var;
        this.n1.a(z, z2);
        y10 y10Var = this.U2;
        Object tag = y10Var.getTag();
        if (z) {
            if (tag != null) {
                return;
            } else {
                num = 1;
            }
        } else if (tag == null) {
            return;
        } else {
            num = null;
        }
        y10Var.setTag(num);
        AnimatorSet animatorSet = this.V2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.V2 = null;
        }
        boolean z3 = (this.z1 || this.Q2 || (this.N2 == 0 && this.n3) || this.v2 != this.d2 || (!this.I3 && !this.J3)) ? false : true;
        if (this.v2 == this.N1) {
            z3 = false;
        }
        m02 m02Var = this.u3;
        s7 s7Var = this.X2;
        if (z) {
            if (z3) {
                s7Var.setVisibility(0);
                s7Var.setClickable(true);
            }
        } else if (this.P2 && this.A2.getTag() == null) {
            m02Var.setVisibility(0);
        }
        e eVar = this.Z1;
        if (eVar != null) {
            if (z) {
                hl.l3(this, vm2.h(aob.v0(this.e4 ? aob.kh : aob.h5, this.J0)) > 0.699999988079071d);
            } else {
                hl.l3(this, eVar.isLightStatusBar());
            }
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.V2 = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z ? 1.0f : 0.0f) - y10Var.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) property, z ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new yz1(this, (byte) 2));
            arrayList.add(ofFloat);
            if (z3) {
                arrayList.add(ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property, z ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) View.SCALE_X, z ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) View.SCALE_Y, z ? 1.0f : 0.6f));
            }
            this.V2.playTogether(arrayList);
            this.V2.addListener(new z7((byte) 15, (Object) this, z));
            this.V2.setInterpolator(k43.h);
            this.V2.setDuration(380L);
            this.V2.start();
            return;
        }
        if (z && this.P2 && ((f12Var = this.v2) == null || f12Var.M())) {
            m02Var.setVisibility(4);
        }
        y10Var.setAlpha(z ? 1.0f : 0.0f);
        if (z3) {
            s7Var.setAlpha(z ? 1.0f : 0.0f);
            s7Var.setScaleX(z ? 1.0f : 0.6f);
            s7Var.setScaleY(z ? 1.0f : 0.6f);
        }
        if (z) {
            return;
        }
        s7 s7Var2 = this.b3;
        if (s7Var2 != null) {
            s7Var2.setVisibility(4);
        }
        if (this.N2 == 0 && this.n3) {
            return;
        }
        s7Var.setVisibility(4);
    }

    public final void F0() {
        if (V0().a.length() <= 0) {
            return;
        }
        this.v2.a(V0().getText());
    }

    public final void F1() {
        float alpha;
        int[] iArr = this.D2;
        p02 p02Var = this.B2;
        p02Var.getLocationOnScreen(iArr);
        if (this.B4 != null) {
            f12 f12Var = this.v2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
            if ((f12Var == chatAttachAlertPhotoLayout || f12Var == this.k2) && this.W1) {
                tt ttVar = this.L2;
                alpha = (ttVar.getAlpha() * ttVar.getMeasuredHeight()) + (ttVar.getY() - this.B4.getTop());
            } else {
                alpha = -p02Var.getHeight();
            }
            if (Math.abs(this.B4.getTranslationY() - alpha) > 0.5f) {
                this.B4.setTranslationY(alpha);
                this.B4.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                }
            }
        }
        O0();
    }

    @Override // nx0
    public final void G() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            vpa vpaVar = this.m4;
            if (vpaVar != null) {
                vpaVar.d();
            }
            AnimatorSet animatorSet2 = this.n4;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.A0 = null;
            this.B0 = (byte) 0;
        }
    }

    public final boolean G0() {
        e eVar = this.Z1;
        return (eVar instanceof zu1) && ((zu1) eVar).V4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0071, code lost:
    
        if (r14.n3 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r14.Q2 == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G1(int i) {
        e eVar;
        boolean z;
        boolean z2;
        boolean z3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.q3 == null) {
            int selectedItemsCount = this.v2.getSelectedItemsCount();
            u02 u02Var = this.F2;
            if (selectedItemsCount == 0) {
                u02Var.g(0, i != 0);
                A1(false, i != 0);
            } else {
                if (A1(true, i != 0) || i == 0) {
                    u02Var.g(selectedItemsCount, i != 0);
                    u02Var.a();
                } else {
                    u02Var.g(selectedItemsCount, true);
                    u02Var.a();
                }
            }
            this.v2.E(selectedItemsCount);
            J0(i != 0);
            if (this.v2 == this.d2 && (((z = (eVar = this.Z1) instanceof zu1)) || this.N2 != 0 || this.Q2)) {
                if (selectedItemsCount == 0) {
                    if (!this.n3) {
                        if (this.N2 == 0) {
                        }
                    }
                    this.n3 = (selectedItemsCount == 0 && this.N2 == 0 && !this.Q2) ? false : true;
                    AnimatorSet animatorSet = this.W2;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.W2 = null;
                    }
                    byte b = this.N2;
                    y10 y10Var = this.U2;
                    s7 s7Var = this.b3;
                    if (b != 0 && s7Var != null && y10Var.getTag() != null && z) {
                        zu1 zu1Var = (zu1) eVar;
                        if (!xc2.T(zu1Var.e) || (tL_chatBannedRights = zu1Var.e.banned_rights) == null || !tL_chatBannedRights.send_gifs) {
                            z2 = true;
                            z3 = this.n3;
                            m02 m02Var = this.f3;
                            s7 s7Var2 = this.X2;
                            if (!z3) {
                                if (this.N2 == 0 && !this.Q2) {
                                    s7Var2.setVisibility(0);
                                    s7Var2.setClickable(true);
                                }
                                m02Var.setVisibility(0);
                            } else if (y10Var.getTag() != null && s7Var != null) {
                                s7Var.setVisibility(0);
                            }
                            if (i != 0) {
                                if (y10Var.getTag() == null && this.N2 == 0 && !this.Q2) {
                                    s7Var2.setAlpha(this.n3 ? 1.0f : 0.0f);
                                    s7Var2.setScaleX(this.n3 ? 1.0f : 0.6f);
                                    s7Var2.setScaleY(this.n3 ? 1.0f : 0.6f);
                                }
                                m02Var.setAlpha(this.n3 ? 1.0f : 0.0f);
                                if (z2) {
                                    s7Var.setAlpha(this.n3 ? 0.0f : 1.0f);
                                }
                                if (this.n3 && s7Var != null) {
                                    s7Var.setVisibility(4);
                                }
                            } else {
                                this.W2 = new AnimatorSet();
                                ArrayList arrayList = new ArrayList();
                                if (y10Var.getTag() == null && this.N2 == 0 && !this.Q2) {
                                    arrayList.add(ObjectAnimator.ofFloat(s7Var2, (Property<s7, Float>) View.ALPHA, this.n3 ? 1.0f : 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(s7Var2, (Property<s7, Float>) View.SCALE_X, this.n3 ? 1.0f : 0.6f));
                                    arrayList.add(ObjectAnimator.ofFloat(s7Var2, (Property<s7, Float>) View.SCALE_Y, this.n3 ? 1.0f : 0.6f));
                                }
                                Property property = View.ALPHA;
                                arrayList.add(ObjectAnimator.ofFloat(m02Var, (Property<m02, Float>) property, this.n3 ? 1.0f : 0.0f));
                                if (z2) {
                                    arrayList.add(ObjectAnimator.ofFloat(s7Var, (Property<s7, Float>) property, this.n3 ? 0.0f : 1.0f));
                                }
                                this.W2.playTogether(arrayList);
                                this.W2.addListener(new jb1((Object) this, (byte) 13));
                                this.W2.setDuration(180L);
                                this.W2.start();
                            }
                        }
                    }
                    z2 = false;
                    z3 = this.n3;
                    m02 m02Var2 = this.f3;
                    s7 s7Var22 = this.X2;
                    if (!z3) {
                    }
                    if (i != 0) {
                    }
                }
            }
            J1(i != 0);
            r47 r47Var = this.E3;
            long M1 = (r47Var == null || r47Var.o5()) ? uc7.s1(this.G3).M1(W0()) : 0L;
            f12 f12Var = this.v2;
            u02Var.i(S0() + (f12Var != null ? f12Var.getSelectedItemsCount() : 0), M1, true);
            p02 p02Var = this.B2;
            if (p02Var != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p02Var.getLayoutParams();
                int max = Math.max(hl.L(48.0f), u02Var.l());
                if (marginLayoutParams.rightMargin != max) {
                    marginLayoutParams.rightMargin = max;
                    p02Var.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    @Override // nx0
    public void H() {
        l12 l12Var = this.W3;
        if (l12Var != null) {
            l12Var.O0(new vq0(this, (byte) 4));
        } else {
            p1();
        }
    }

    public final boolean H0(CharSequence charSequence) {
        e eVar = this.Z1;
        if (!(eVar instanceof zu1)) {
            return false;
        }
        return ChatActivityEnterView.N(this.G3, ((zu1) eVar).a(), eVar, charSequence);
    }

    public final void H1() {
        float f;
        f12 f12Var = this.v2;
        boolean i = f12Var == null ? false : f12Var.i();
        u8 u8Var = this.c3;
        u8Var.setEnabled(i);
        f12 f12Var2 = this.v2;
        if (f12Var2 != null) {
            f = ((f12Var2.i() ? 1.0f : 0.5f) * (this.w2 == null ? 1.0f : this.X1)) + 0.0f;
        } else {
            f = 0.0f;
        }
        f12 f12Var3 = this.w2;
        if (f12Var3 != null) {
            f = qd4.A(1.0f, this.X1, f12Var3.i() ? 1.0f : 0.5f, f);
        }
        this.d3 = f;
        if (u8Var != null) {
            float f2 = f * this.e3;
            u8Var.setAlpha(f2);
            u8Var.setVisibility(f2 <= 0.0f ? 4 : 0);
        }
    }

    @Override // nx0
    public final void I(int i) {
        super.I(i);
        this.v2.r(i);
    }

    public final void I0() {
        n02 n02Var = this.v3;
        if (n02Var == null) {
            return;
        }
        int childCount = n02Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            n02Var.getChildAt(i);
        }
        boolean z = this.e4;
        yob.X(this.g3, z ? aob.Yg : aob.j5, this.J0);
        yob.X(this.l3, z ? aob.Yg : aob.j5, this.J0);
        yob.X(this.c3, aob.Ji, this.J0);
        int v0 = aob.v0(z ? aob.Yg : aob.j5, this.J0);
        boolean z2 = (this.q4 && v0 == this.p4) ? false : true;
        this.q4 = true;
        this.p4 = v0;
        s7 s7Var = this.X2;
        if (z2) {
            s7Var.setIconColor(v0);
        }
        aob.A1(aob.v0(z ? aob.Zg : aob.I5, this.J0), s7Var.getBackground());
        int i2 = aob.E8;
        s7Var.O(aob.v0(i2, this.J0), false);
        s7Var.O(aob.v0(i2, this.J0), true);
        s7Var.I(aob.v0(aob.G8, this.J0));
        s7 s7Var2 = this.Z2;
        if (s7Var2 != null && z2) {
            s7Var2.setIconColor(v0);
        }
        s7 s7Var3 = this.b3;
        if (s7Var3 != null) {
            if (z2) {
                s7Var3.setIconColor(v0);
            }
            aob.A1(aob.v0(z ? aob.Zg : aob.I5, this.J0), s7Var3.getBackground());
        }
        p02 p02Var = this.B2;
        vnb vnbVar = p02Var.N;
        du3 du3Var = p02Var.a;
        int i3 = p02Var.M;
        if (i3 == 0) {
            du3Var.setHintTextColor(aob.v0(aob.H6, vnbVar));
            int i4 = aob.G6;
            du3Var.setCursorColor(aob.v0(i4, vnbVar));
            du3Var.setTextColor(aob.v0(i4, vnbVar));
        } else if (i3 == 2 || i3 == 3) {
            du3Var.setHintTextColor(-1929379841);
            du3Var.setTextColor(-1);
            du3Var.setCursorColor(-1);
            du3Var.setHandlesColor(-1);
            du3Var.setHighlightColor(822083583);
            du3Var.E = -1;
        } else {
            du3Var.setHintTextColor(aob.v0(aob.t5, vnbVar));
            du3Var.setTextColor(aob.v0(aob.j5, vnbVar));
        }
        p02Var.c.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.Oe, vnbVar), PorterDuff.Mode.MULTIPLY));
        eu3 eu3Var = p02Var.d;
        if (eu3Var != null) {
            eu3Var.updateColors();
        }
        yob.l(n02Var, 21, aob.A5, this.J0);
        int i5 = z ? aob.Yg : aob.j5;
        vnb vnbVar2 = this.J0;
        y10 y10Var = this.U2;
        yob.l(y10Var, 1, i5, vnbVar2);
        yob.l(y10Var, 3, z ? aob.Zg : aob.I5, this.J0);
        yob.l(y10Var, 5, z ? aob.Yg : aob.j5, this.J0);
        int Z0 = Z0(false);
        aob.A1(Z0, this.s0);
        oz4 oz4Var = this.D4;
        if (oz4Var.b != Z0) {
            oz4Var.a(Z0);
            jz1 jz1Var = this.s3;
            if (jz1Var != null) {
                jz1Var.invalidate();
            }
            o02 o02Var = this.t3;
            if (o02Var != null) {
                o02Var.invalidate();
            }
        }
        this.b.invalidate();
        int i6 = 0;
        while (true) {
            f12[] f12VarArr = this.t2;
            if (i6 >= f12VarArr.length) {
                break;
            }
            f12 f12Var = f12VarArr[i6];
            if (f12Var != null) {
                f12Var.d();
            }
            i6++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            L(aob.h5);
            return;
        }
        this.G0 = -1;
        this.H0 = aob.v0(aob.i5, this.J0);
        hl.o3(this, aob.v0(aob.h5, this.J0), false, null);
        hl.i3(this, ((double) hl.B(this.H0)) > 0.721d);
    }

    public final void I1(f12 f12Var, int i) {
        if (f12Var != null) {
            tq3 tq3Var = this.C4;
            if (tq3Var != null && Build.VERSION.SDK_INT >= 31) {
                tq3Var.f(0.0f, i);
            }
            int currentItemTop = f12Var.getCurrentItemTop();
            if (currentItemTop != Integer.MAX_VALUE) {
                boolean z = false;
                boolean z2 = f12Var == this.v2 && currentItemTop <= f12Var.getButtonsHideOffset();
                this.L1 = z2;
                if (f12Var == this.v2) {
                    E1(z2, true);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f12Var.getLayoutParams();
                int A = c00.A(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
                f12 f12Var2 = this.v2;
                int i2 = f12Var2 == f12Var ? 0 : 1;
                if ((f12Var2 instanceof c62) || (this.w2 instanceof c62)) {
                    Object obj = this.q3;
                    if ((obj instanceof vpa) && ((vpa) obj).f) {
                        z = true;
                    }
                }
                int[] iArr = this.Y3;
                int i3 = iArr[i2];
                if (i3 == A && !z) {
                    if (i != 0) {
                        this.Z3 = i3;
                    }
                } else {
                    this.Z3 = i3;
                    iArr[i2] = A;
                    L1(i2);
                    this.b.invalidate();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2.getSelectedItemsCount() > 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r47.c3(r0.k) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(boolean z) {
        boolean z2;
        e eVar = this.Z1;
        if (eVar == null || !(eVar instanceof zu1)) {
            return;
        }
        zu1 zu1Var = (zu1) eVar;
        iu3 iu3Var = this.W1 ? this.M2 : this.B2;
        String obj = iu3Var != null ? iu3Var.getText().toString() : null;
        if (this.E3 == null) {
            f12 f12Var = this.v2;
            z2 = true;
            if (f12Var != null) {
            }
            if (o44.g(this.G3).e(obj, zu1Var.v8) <= 0) {
                r47 r47Var = zu1Var.F5;
                if (r47Var != null) {
                }
            }
            this.q1.a(z2, z);
            if (z2 || !b1()) {
            }
            r1(false, z);
            return;
        }
        z2 = false;
        this.q1.a(z2, z);
        if (z2) {
        }
    }

    public final void J1(boolean z) {
        bl2 bl2Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout == null || (bl2Var = this.Y2) == null) {
            return;
        }
        boolean z2 = this.n3 && this.c2 && this.v2 == chatAttachAlertPhotoLayout && ChatAttachAlertPhotoLayout.d0();
        boolean z3 = !ChatAttachAlertPhotoLayout.S();
        bl2Var.f = z3;
        if (!z) {
            ((mm) bl2Var.g).a(z3);
        }
        bl2Var.invalidateSelf();
        s7 s7Var = this.Z2;
        if (z && this.n3) {
            s7Var.setVisibility(0);
            s7Var.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(k43.h).withEndAction(new h02(this, z2, r4)).start();
        } else {
            s7Var.setVisibility(z2 ? (byte) 0 : (byte) 8);
            s7Var.setAlpha(z2 ? 1.0f : 0.0f);
            s7Var.setScaleX(z2 ? 1.0f : 0.6f);
            s7Var.setScaleY(z2 ? 1.0f : 0.6f);
        }
    }

    public final void K0() {
        float f = this.m1.e;
        this.t3.setTranslationY(hl.L(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f) * (1.0f - this.n1.e))), 1.0f - ((1.0f - this.l1.e) * f)));
    }

    public final void K1(boolean z) {
        f12 f12Var = this.d2;
        if (!z) {
            B1(f12Var);
            return;
        }
        if (this.G1) {
            if (this.k2 == null) {
                Context context = getContext();
                vnb vnbVar = this.s1;
                if (vnbVar == null) {
                    vnbVar = this.J0;
                }
                c62 c62Var = new c62(this, vnbVar, context);
                c62Var.E = 0.0f;
                c62Var.F = 0.0f;
                c62Var.G = 0.0f;
                c62Var.H = 0.0f;
                c62Var.I = 0.0f;
                c62Var.J = 0.0f;
                c62Var.K = null;
                c62Var.L = false;
                c62Var.N = 0.0f;
                c62Var.R = false;
                c62Var.T = false;
                Point point = hl.q;
                c62Var.U = point.y > point.x;
                c62Var.n = vnbVar;
                c62Var.f = true;
                c62Var.setWillNotDraw(false);
                n12 n12Var = c62Var.b;
                s6 u = n12Var.U2.u();
                TextView textView = new TextView(context);
                c62Var.y = textView;
                vnb vnbVar2 = c62Var.a;
                m52 m52Var = new m52(c62Var, context, u, vnbVar2, (byte) 1);
                n12Var.U2.addView(m52Var, 0, tre.d(-2, -1.0f, 51, hl.O1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                textView.setImportantForAccessibility(2);
                textView.setGravity(3);
                textView.setSingleLine(true);
                textView.setLines(1);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                yob.X(textView, aob.j5, vnbVar2);
                textView.setText(ob6.M0(2131753951, null));
                textView.setTypeface(hl.o());
                textView.setCompoundDrawablePadding(hl.L(4.0f));
                textView.setPadding(0, 0, hl.L(10.0f), 0);
                textView.setAlpha(0.0f);
                m52Var.addView(textView, tre.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
                gu guVar = new gu(c62Var, context, vnbVar2, (byte) 10);
                c62Var.r = guVar;
                guVar.setAdapter(new kr(c62Var, (byte) 3));
                x46 x46Var = new x46(1, false);
                c62Var.s = x46Var;
                guVar.setLayoutManager(x46Var);
                guVar.setClipChildren(false);
                guVar.setClipToPadding(false);
                guVar.setOverScrollMode(2);
                guVar.setVerticalScrollBarEnabled(false);
                b62 b62Var = new b62(c62Var, context);
                c62Var.w = b62Var;
                b62Var.setClipToPadding(true);
                b62Var.setClipChildren(true);
                c62Var.addView(guVar, tre.c(-1.0f, -1));
                c62Var.Q = n12Var.d2;
                b62Var.c.clear();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = c62Var.Q;
                b62Var.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                b62Var.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
                b62Var.c();
                UndoView undoView = new UndoView(context, null, false, n12Var.s1);
                c62Var.x = undoView;
                undoView.setEnterOffsetMargin(hl.L(32.0f));
                c62Var.addView(undoView, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
                c62Var.O = context.getResources().getDrawable(R.drawable.play_mini_video);
                this.k2 = c62Var;
                c62Var.bringToFront();
            }
            f12 f12Var2 = this.v2;
            c62 c62Var2 = this.k2;
            if (f12Var2 != c62Var2) {
                f12Var = c62Var2;
            }
            B1(f12Var);
        }
    }

    public final void L0(f12 f12Var) {
        boolean e = f12Var.e();
        jz1 jz1Var = this.s3;
        if (jz1Var != null) {
            jz1Var.setFadeHeightBottom(e ? 0 : hl.L(48.0f));
        }
        o02 o02Var = this.t3;
        if (o02Var != null) {
            o02Var.setVisibility(e ? 4 : 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L1(int i) {
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        u8 u8Var;
        float max;
        int i3;
        f12 f12Var;
        float f5 = this.n1.e;
        f12 f12Var2 = i == 0 ? this.v2 : this.w2;
        if (f12Var2 == null || f12Var2.getVisibility() != 0) {
            return;
        }
        int Y0 = Y0(i);
        if (f12Var2 == this.g2 || f12Var2 == this.h2) {
            Typeface typeface = hl.a;
        } else {
            Typeface typeface2 = hl.a;
        }
        org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        if (hl.O1()) {
            i2 = 16;
        } else {
            Point point = hl.q;
            i2 = point.x > point.y ? 6 : 12;
        }
        float alpha = this.U2.getAlpha();
        m02 m02Var = this.f3;
        float L = alpha != 0.0f ? 0.0f : hl.L((1.0f - m02Var.getAlpha()) * 26.0f);
        boolean z = this.n3;
        s7 s7Var = this.X2;
        tt ttVar = this.L2;
        if (z && this.N2 == 0 && !this.Q2) {
            s7Var.setTranslationY(Math.max((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - hl.L(3.0f)) - hl.L(i2 + 37), ((Y0 - hl.L((i2 * f5) + 37.0f)) + L) - (ttVar.getAlpha() * ttVar.getMeasuredHeight())) + this.i4);
        } else {
            s7Var.setTranslationY(((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - hl.L(3.0f)) - hl.L(i2 + 37)) + this.i4);
        }
        s7 s7Var2 = this.Z2;
        if (s7Var2 != null) {
            s7Var2.setTranslationY(s7Var.getTranslationY());
        }
        kg5 kg5Var = this.a3;
        if (kg5Var != null) {
            kg5Var.setTranslationY(s7Var.getTranslationY());
        }
        float min = (this.z1 && this.p3 && (f12Var = this.w2) != null) ? this.v2 != null ? Math.min(f12Var.getTranslationY(), this.v2.getTranslationY()) : f12Var.getTranslationY() : 0.0f;
        s7 s7Var3 = this.b3;
        if (s7Var3 != null) {
            s7Var3.setTranslationY(((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - hl.L(4.0f)) - hl.L(i2 + 37)) + this.i4);
        }
        float L2 = ((((Y0 - hl.L((i2 * f5) + 25.0f)) + L) + this.i4) + min) - (ttVar.getAlpha() * ttVar.getMeasuredHeight());
        this.m3 = L2;
        m02Var.setTranslationY(Math.max(this.i4, L2));
        ttVar.setTranslationY(Math.max(org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.i4, (m02Var.getAlpha() * hl.L(26.0f)) + this.m3 + hl.L(8.0f)));
        if (this.W1) {
            F1();
        }
        O0();
        int i4 = 59;
        if (this.g2 != null) {
            if (hl.O1()) {
                i3 = 63;
            } else {
                Point point2 = hl.q;
                i3 = point2.x > point2.y ? 53 : 59;
            }
            a72 a72Var = this.g2;
            if (a72Var == this.w2) {
                f2 = (a72Var.getTranslationY() + Y0(1)) - hl.L(((i3 * f5) + 7.0f) - ((1.0f - f5) * 12.0f));
                f = this.X1;
            } else if (a72Var == this.v2) {
                f2 = (a72Var.getTranslationY() + Y0(0)) - hl.L(((i3 * f5) + 7.0f) - ((1.0f - f5) * 12.0f));
                f = this.w2 == null ? 1.0f : 1.0f - this.X1;
            }
            if (this.h2 != null) {
                if (hl.O1()) {
                    i4 = 63;
                } else {
                    Point point3 = hl.q;
                    if (point3.x > point3.y) {
                        i4 = 53;
                    }
                }
                a72 a72Var2 = this.h2;
                if (a72Var2 == this.w2) {
                    f4 = (a72Var2.getTranslationY() + Y0(1)) - hl.L(((i4 * f5) + 7.0f) - ((1.0f - f5) * 12.0f));
                    f3 = this.X1;
                } else if (a72Var2 == this.v2) {
                    f4 = (a72Var2.getTranslationY() + Y0(0)) - hl.L(((i4 * f5) + 7.0f) - ((1.0f - f5) * 12.0f));
                    f3 = this.w2 == null ? 1.0f : 1.0f - this.X1;
                }
                u8Var = this.c3;
                if (u8Var != null) {
                    int measuredWidth = ob6.a0 ? (this.b.getMeasuredWidth() - u8Var.getMeasuredWidth()) - hl.L(62.0f) : 0;
                    if (f <= 0.0f) {
                        f2 = 0.0f;
                    } else if (f3 > 0.0f) {
                        max = hl.R1(f2, f4, f3);
                        u8Var.setTranslationY(Math.max(0.0f, max) + this.i4);
                        u8Var.setTranslationX(-((measuredWidth * (1.0f - f5)) + hl.L((7.0f * r6) + 12.0f)));
                    }
                    if (f3 <= 0.0f) {
                        f4 = 0.0f;
                    }
                    max = Math.max(f2, f4);
                    u8Var.setTranslationY(Math.max(0.0f, max) + this.i4);
                    u8Var.setTranslationX(-((measuredWidth * (1.0f - f5)) + hl.L((7.0f * r6) + 12.0f)));
                }
                float max2 = Math.max(f3, f);
                this.e3 = max2;
                if (u8Var != null) {
                    float f6 = this.d3 * max2;
                    u8Var.setAlpha(f6);
                    u8Var.setVisibility(f6 <= 0.0f ? 4 : 0);
                    return;
                }
                return;
            }
            f3 = 0.0f;
            f4 = 0.0f;
            u8Var = this.c3;
            if (u8Var != null) {
            }
            float max22 = Math.max(f3, f);
            this.e3 = max22;
            if (u8Var != null) {
            }
        }
        f = 0.0f;
        f2 = 0.0f;
        if (this.h2 != null) {
        }
        f3 = 0.0f;
        f4 = 0.0f;
        u8Var = this.c3;
        if (u8Var != null) {
        }
        float max222 = Math.max(f3, f);
        this.e3 = max222;
        if (u8Var != null) {
        }
    }

    public final void M0() {
        y10 y10Var;
        jz1 jz1Var = this.s3;
        if (jz1Var == null || (y10Var = this.U2) == null) {
            return;
        }
        f12 f12Var = this.w2;
        if (f12Var == null) {
            f12Var = this.v2;
        }
        int i = 0;
        boolean z = f12Var != null && f12Var.f();
        vnb vnbVar = this.J0;
        boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
        if (!z && y10Var.getVisibility() == 0) {
            i = (int) (y10Var.getAlpha() * (a ? jn7.d4 : jn7.p2));
        }
        jz1Var.setFadeTopAlpha(i);
    }

    public final void M1() {
        int i = 0;
        L1(0);
        this.o3.invalidate();
        tt ttVar = this.L2;
        ttVar.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            i52 i52Var = chatAttachAlertPhotoLayout.F;
            chatAttachAlertPhotoLayout.V();
            if (i52Var != null && i52Var.getFastScroll() != null) {
                k69 fastScroll = i52Var.getFastScroll();
                int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1;
                if (this.W1) {
                    i = (int) (ttVar.getAlpha() * ttVar.getMeasuredHeight());
                }
                fastScroll.i0 = currentActionBarHeight + i;
                i52Var.getFastScroll().invalidate();
            }
        }
        F1();
        O0();
    }

    public final void N0() {
        zp4.d(this.C2, xnb.C(this.o1.e, this.p1.e, qke.a(this.q1.e), this.O3 ? 0.0f : 1.0f));
    }

    public final void O0() {
        u02 u02Var = this.F2;
        m02 m02Var = this.E2;
        tt ttVar = this.L2;
        if (ttVar == null || ttVar.getVisibility() != 0 || ttVar.getAlpha() == 0.0f) {
            m02Var.setTranslationY(this.d4);
            u02Var.setAlpha(1.0f);
            return;
        }
        float f = this.l1.e;
        float abs = Math.abs(hl.R1(-1.0f, 1.0f, f));
        u02Var.setAlpha(abs * abs * abs * abs);
        m02Var.setTranslationY(hl.R1(this.d4, ((ttVar.getTranslationY() + ttVar.getTop()) - m02Var.getTop()) + hl.L(8.0f), k43.j.getInterpolation(f)));
    }

    public final void P0() {
        mb1 mb1Var = new mb1(this, getContext(), this.T1, LaunchActivity.Q(), this.J0, (byte) 1);
        this.B4 = mb1Var;
        mb1Var.p(new z8d((Object) this, (byte) 19));
        ViewGroup viewGroup = this.b;
        viewGroup.addView(this.B4, viewGroup.indexOfChild(this.A2), tre.e(-1, -1, 83));
        mb1 mb1Var2 = this.B4;
        mb1Var2.getAdapter().c = false;
        mb1Var2.getAdapter().d = false;
        mb1Var2.getAdapter().e = false;
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            mb1Var2.getAdapter().n0 = false;
            zu1 zu1Var = (zu1) eVar;
            r17 adapter = mb1Var2.getAdapter();
            zu1Var.h();
            TLRPC.Chat chat = zu1Var.e;
            adapter.getClass();
            adapter.m0 = chat;
            mb1Var2.getAdapter().V(zu1Var.r8);
            mb1Var2.getAdapter().f0 = zu1Var.e != null;
        } else {
            mb1Var2.getAdapter().n0 = true;
            mb1Var2.getAdapter().V(null);
            mb1Var2.getAdapter().f0 = false;
        }
        mb1Var2.getAdapter().g0 = false;
        F1();
    }

    public final void Q0(int i) {
        this.P2 = true;
        this.u3.setVisibility(0);
        this.B1 = true;
        this.C1 = i;
        this.N2 = (byte) 0;
        this.z1 = false;
        this.A1 = false;
        this.D1 = null;
        s7 s7Var = this.h3;
        if (s7Var != null) {
            this.g3.setTranslationY(0.0f);
            s7Var.setVisibility(8);
        }
    }

    public final void R0(c cVar) {
        String M0 = ob6.M0(2131752087, null);
        TextView textView = this.g3;
        textView.setText(M0);
        this.P2 = false;
        this.u3.setVisibility(8);
        this.N2 = (byte) 1;
        this.z1 = true;
        this.A1 = true;
        this.c2 = false;
        this.D1 = cVar;
        s7 s7Var = this.h3;
        if (s7Var != null) {
            textView.setTranslationY(-hl.L(8.0f));
            s7Var.setVisibility(0);
            s7Var.setClickable(true);
            s7Var.setAlpha(1.0f);
            s7Var.setScaleX(1.0f);
            s7Var.setScaleY(1.0f);
        }
    }

    @Override // nx0
    public final ArrayList S() {
        ArrayList<apb> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            f12[] f12VarArr = this.t2;
            if (i >= f12VarArr.length) {
                arrayList.add(new apb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.i5));
                return arrayList;
            }
            f12 f12Var = f12VarArr[i];
            if (f12Var != null && (themeDescriptions = f12Var.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i++;
        }
    }

    public final int S0() {
        v47 v47Var;
        t47 t47Var;
        e eVar = this.Z1;
        if (!(eVar instanceof zu1) || (v47Var = ((zu1) eVar).x5) == null || (t47Var = v47Var.b) == null) {
            return 0;
        }
        return t47Var.g.size();
    }

    public final TLRPC.Chat T0() {
        e eVar = this.Z1;
        return eVar instanceof zu1 ? ((zu1) eVar).e : uc7.s1(this.G3).M0(Long.valueOf(-this.T1));
    }

    public final float U0() {
        return r3.getMeasuredHeight() - ((1.0f - this.A2.getAlpha()) * (r3.getMeasuredHeight() - hl.L(84.0f)));
    }

    public final iu3 V0() {
        f12 f12Var;
        return (this.W1 && ((f12Var = this.v2) == this.d2 || f12Var == this.k2)) ? this.M2 : this.B2;
    }

    public final long W0() {
        e eVar = this.Z1;
        return eVar instanceof zu1 ? ((zu1) eVar).a() : this.T1;
    }

    public final int X0() {
        f12 f12Var = this.v2;
        a72 a72Var = this.g2;
        if (f12Var == a72Var && a72Var.F != null) {
            return a72Var.getEmojiPadding();
        }
        a72 a72Var2 = this.h2;
        return (f12Var != a72Var2 || a72Var2.F == null) ? this.W1 ? this.M2.getEmojiPadding() : this.B2.getEmojiPadding() : a72Var2.getEmojiPadding();
    }

    public final int Y0(int i) {
        f12 f12Var = this.w2;
        int[] iArr = this.Y3;
        if (f12Var == null || !((this.v2 instanceof c62) || (f12Var instanceof c62))) {
            return iArr[i];
        }
        return hl.U1(this.X1, iArr[0], iArr[1]);
    }

    public final int Z0(boolean z) {
        y10 y10Var;
        if (this.e4) {
            return aob.v0(aob.kh, this.J0);
        }
        vnb vnbVar = this.J0;
        boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
        Iterator it = this.r1.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            y66 y66Var = (y66) it.next();
            long longValue = ((Long) y66Var.a).longValue();
            if (longValue == 1 || longValue == 3 || longValue == 4 || longValue == 5 || longValue == 6 || longValue == 9 || longValue == 11 || longValue == 12) {
                f += y66Var.c();
            }
        }
        float a2 = ete.a(f, 0.0f, 1.0f);
        if (z && (y10Var = this.U2) != null && y10Var.getVisibility() == 0) {
            a2 *= 1.0f - y10Var.getAlpha();
        }
        return vm2.f(a2, aob.v0(aob.h5, this.J0), aob.v0(a ? aob.a7 : aob.i5, this.J0));
    }

    @Override // nx0, ag0
    public final void a(boolean z) {
        if (z) {
            this.A4 = z;
        }
        dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a1() {
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        n12 n12Var;
        r52 r52Var;
        do6 do6Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        f12 f12Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3;
        this.K2 = 0L;
        this.F2.setEffect(0L);
        this.A3 = false;
        this.y3 = false;
        this.C3 = 0.0f;
        this.B3.setVisibility(8);
        RadialProgressView radialProgressView = this.z3;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        m02 m02Var = this.u3;
        m02Var.setAlpha(1.0f);
        m02Var.setTranslationY(0.0f);
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.u2;
            if (i >= longSparseArray.size()) {
                break;
            }
            ((j22) longSparseArray.valueAt(i)).setMeasureOffsetY(0);
            i++;
        }
        byte b = this.N2;
        e eVar = this.Z1;
        if (b != 2) {
            if (eVar instanceof zu1) {
                zu1 zu1Var = (zu1) eVar;
                chat = zu1Var.e;
                user = zu1Var.h();
            } else {
                long j = this.T1;
                int i2 = this.G3;
                if (j >= 0) {
                    user = uc7.s1(i2).X1(Long.valueOf(this.T1));
                    chat = null;
                } else if (j < 0) {
                    chat = uc7.s1(i2).M0(Long.valueOf(-this.T1));
                    user = null;
                }
            }
            z = eVar instanceof zu1;
            if ((z && this.N2 != 2) || chat != null || user != null) {
                if (chat != null) {
                    this.I3 = xc2.p(chat);
                    this.J3 = xc2.u(chat);
                    this.K3 = xc2.o(chat);
                    this.L3 = xc2.r(chat);
                    this.M3 = !xc2.V(chat) && xc2.r(chat);
                    this.N3 = xc2.q(chat);
                    this.H3 = xc2.l(chat);
                } else {
                    this.L3 = lbc.v(user) || lbc.D(user);
                    this.M3 = !z || ((zu1) eVar).h == null;
                }
            }
            if (this.A1) {
                this.I3 = true;
                this.J3 = true;
            }
            if (this.O3) {
                this.L3 = false;
                this.M3 = false;
            }
            p02 p02Var = this.B2;
            if (z || this.N2 == 2) {
                p02Var.setVisibility(this.Q1 ? 0 : 4);
            }
            boolean z2 = this.J3;
            boolean z3 = this.I3;
            boolean z4 = this.H3;
            chatAttachAlertPhotoLayout = this.d2;
            n12Var = chatAttachAlertPhotoLayout.b;
            b34 b34Var = chatAttachAlertPhotoLayout.I;
            boolean z5 = !z2 || z3;
            chatAttachAlertPhotoLayout.w0 = z5;
            chatAttachAlertPhotoLayout.x0 = z2;
            chatAttachAlertPhotoLayout.y0 = z3;
            chatAttachAlertPhotoLayout.A0 = z4;
            r52Var = chatAttachAlertPhotoLayout.Q;
            if (r52Var != null) {
                r52Var.setAlpha(z5 ? 1.0f : 0.2f);
                chatAttachAlertPhotoLayout.Q.setEnabled(chatAttachAlertPhotoLayout.w0);
            }
            if (!((n12Var.Z1 instanceof zu1) && n12Var.T0() == null) && n12Var.N2 == 0) {
                chatAttachAlertPhotoLayout.V0 = MediaController.a2;
                if (chatAttachAlertPhotoLayout.w0) {
                    b34Var.setText(ob6.M0(2131747911, null));
                    b34Var.a(0, 0, 0);
                } else {
                    TLRPC.Chat T0 = n12Var.T0();
                    b34Var.a(R.raw.media_forbidden, jn7.f2, jn7.f2);
                    if (xc2.P(7, T0)) {
                        b34Var.setText(ob6.M0(2131749314, null));
                    } else if (hl.B1(T0.banned_rights)) {
                        b34Var.setText(ob6.a0("AttachMediaRestrictedForever", null, 2131753948, new Object[0]));
                    } else {
                        b34Var.setText(ob6.a0("AttachMediaRestricted", null, 2131753949, ob6.v(T0.banned_rights.until_date)));
                    }
                }
            } else if (chatAttachAlertPhotoLayout.s0()) {
                chatAttachAlertPhotoLayout.V0 = MediaController.a2;
            } else {
                chatAttachAlertPhotoLayout.V0 = MediaController.b2;
            }
            chatAttachAlertPhotoLayout.Q0 = chatAttachAlertPhotoLayout.f0();
            if (chatAttachAlertPhotoLayout.V0 != null) {
                for (int i3 = 0; i3 < Math.min(100, chatAttachAlertPhotoLayout.V0.e.size()); i3++) {
                    ((no6) chatAttachAlertPhotoLayout.V0.e.get(i3)).e();
                }
            }
            chatAttachAlertPhotoLayout.Z();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.g1(0, 1000000);
            chatAttachAlertPhotoLayout.G.g1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(ob6.M0(2131752203, null));
            do6Var = chatAttachAlertPhotoLayout.V0;
            chatAttachAlertPhotoLayout.U0 = do6Var;
            if (do6Var != null) {
                chatAttachAlertPhotoLayout.Y0 = false;
                if (b34Var != null) {
                    b34Var.c();
                }
            }
            chatAttachAlertPhotoLayout.x0();
            p02Var.k(true);
            this.M2.k(true);
            this.r3 = false;
            w0(false);
            if (!this.I1 || this.J1) {
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                if (this.i2 == null) {
                    s42 s42Var = new s42(this, getContext(), this.J0, (this.B1 || this.J1 || this.O3) ? false : true);
                    this.i2 = s42Var;
                    this.t2[5] = s42Var;
                    r42 r42Var = this.t4;
                    if (r42Var != null) {
                        s42Var.setDelegate(r42Var);
                    } else {
                        s42Var.setDelegate(new xz1(this, (byte) 11));
                    }
                }
                this.T2 = 5L;
                f12Var = this.i2;
            } else if (this.H1) {
                n1(false);
                f12Var = this.j2;
                this.T2 = 4L;
                chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            } else {
                r47 r47Var = this.E3;
                if (r47Var != null) {
                    int i4 = this.D3;
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    if (i4 == -1) {
                        this.P2 = true;
                        if (r47Var.I3()) {
                            l1(false);
                            f12Var = this.f2;
                            this.T2 = 3L;
                        } else if (this.E3.U2()) {
                            n1(false);
                            f12Var = this.j2;
                            this.T2 = 4L;
                        } else {
                            this.T2 = 1L;
                        }
                    } else {
                        if (i4 == 2) {
                            l1(false);
                            f12Var = this.f2;
                            this.T2 = 3L;
                        } else if (i4 == 1) {
                            n1(false);
                            f12Var = this.j2;
                            this.T2 = 4L;
                        } else {
                            this.T2 = 1L;
                            f12Var = chatAttachAlertPhotoLayout2;
                        }
                        this.P2 = false;
                    }
                } else {
                    chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
                    this.P2 = this.N2 == 0 && !this.Q2;
                    this.T2 = 1L;
                }
                f12Var = chatAttachAlertPhotoLayout2;
            }
            m02Var.setVisibility(this.P2 ? 0 : 8);
            if (this.v2 != f12Var) {
                y10 y10Var = this.U2;
                if (y10Var.o0) {
                    y10Var.o(true);
                }
                this.b.removeView(this.v2);
                this.v2.v();
                this.v2.setVisibility(8);
                this.v2.u();
                this.v2 = f12Var;
                this.r0 = true;
                if (f12Var.getParent() == null) {
                    o1(this.v2);
                    this.b.addView(this.v2, 0, tre.c(-1.0f, -1));
                }
                f12Var.setAlpha(1.0f);
                f12Var.setVisibility(0);
                f12Var.H(null);
                f12Var.I();
                L0(f12Var);
                y10Var.setVisibility(f12Var.j() != 0 ? 0 : 4);
                r1(this.W1, false);
                H1();
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.v2 != chatAttachAlertPhotoLayout3) {
                chatAttachAlertPhotoLayout3.setCheckCameraWhenShown(true);
            }
            G1(0);
            this.x3.f();
            V0().setText("");
            this.w3.g1(0, 1000000);
        }
        user = null;
        chat = null;
        z = eVar instanceof zu1;
        if (z) {
            if (chat != null) {
            }
            if (this.A1) {
            }
            if (this.O3) {
            }
            p02 p02Var2 = this.B2;
            if (z) {
            }
            p02Var2.setVisibility(this.Q1 ? 0 : 4);
            boolean z22 = this.J3;
            boolean z32 = this.I3;
            boolean z42 = this.H3;
            chatAttachAlertPhotoLayout = this.d2;
            n12Var = chatAttachAlertPhotoLayout.b;
            b34 b34Var2 = chatAttachAlertPhotoLayout.I;
            if (z22) {
            }
            chatAttachAlertPhotoLayout.w0 = z5;
            chatAttachAlertPhotoLayout.x0 = z22;
            chatAttachAlertPhotoLayout.y0 = z32;
            chatAttachAlertPhotoLayout.A0 = z42;
            r52Var = chatAttachAlertPhotoLayout.Q;
            if (r52Var != null) {
            }
            if (n12Var.Z1 instanceof zu1) {
            }
            chatAttachAlertPhotoLayout.V0 = MediaController.a2;
            if (chatAttachAlertPhotoLayout.w0) {
            }
            chatAttachAlertPhotoLayout.Q0 = chatAttachAlertPhotoLayout.f0();
            if (chatAttachAlertPhotoLayout.V0 != null) {
            }
            chatAttachAlertPhotoLayout.Z();
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.s.g1(0, 1000000);
            chatAttachAlertPhotoLayout.G.g1(0, 1000000);
            chatAttachAlertPhotoLayout.y.setText(ob6.M0(2131752203, null));
            do6Var = chatAttachAlertPhotoLayout.V0;
            chatAttachAlertPhotoLayout.U0 = do6Var;
            if (do6Var != null) {
            }
            chatAttachAlertPhotoLayout.x0();
            p02Var2.k(true);
            this.M2.k(true);
            this.r3 = false;
            w0(false);
            if (this.I1) {
            }
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (this.i2 == null) {
            }
            this.T2 = 5L;
            f12Var = this.i2;
            m02Var.setVisibility(this.P2 ? 0 : 8);
            if (this.v2 != f12Var) {
            }
            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
            if (this.v2 != chatAttachAlertPhotoLayout3) {
            }
            G1(0);
            this.x3.f();
            V0().setText("");
            this.w3.g1(0, 1000000);
        }
        if (chat != null) {
        }
        if (this.A1) {
        }
        if (this.O3) {
        }
        p02 p02Var22 = this.B2;
        if (z) {
        }
        p02Var22.setVisibility(this.Q1 ? 0 : 4);
        boolean z222 = this.J3;
        boolean z322 = this.I3;
        boolean z422 = this.H3;
        chatAttachAlertPhotoLayout = this.d2;
        n12Var = chatAttachAlertPhotoLayout.b;
        b34 b34Var22 = chatAttachAlertPhotoLayout.I;
        if (z222) {
        }
        chatAttachAlertPhotoLayout.w0 = z5;
        chatAttachAlertPhotoLayout.x0 = z222;
        chatAttachAlertPhotoLayout.y0 = z322;
        chatAttachAlertPhotoLayout.A0 = z422;
        r52Var = chatAttachAlertPhotoLayout.Q;
        if (r52Var != null) {
        }
        if (n12Var.Z1 instanceof zu1) {
        }
        chatAttachAlertPhotoLayout.V0 = MediaController.a2;
        if (chatAttachAlertPhotoLayout.w0) {
        }
        chatAttachAlertPhotoLayout.Q0 = chatAttachAlertPhotoLayout.f0();
        if (chatAttachAlertPhotoLayout.V0 != null) {
        }
        chatAttachAlertPhotoLayout.Z();
        chatAttachAlertPhotoLayout.B0(false);
        chatAttachAlertPhotoLayout.s.g1(0, 1000000);
        chatAttachAlertPhotoLayout.G.g1(0, 1000000);
        chatAttachAlertPhotoLayout.y.setText(ob6.M0(2131752203, null));
        do6Var = chatAttachAlertPhotoLayout.V0;
        chatAttachAlertPhotoLayout.U0 = do6Var;
        if (do6Var != null) {
        }
        chatAttachAlertPhotoLayout.x0();
        p02Var22.k(true);
        this.M2.k(true);
        this.r3 = false;
        w0(false);
        if (this.I1) {
        }
        chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        if (this.i2 == null) {
        }
        this.T2 = 5L;
        f12Var = this.i2;
        m02Var.setVisibility(this.P2 ? 0 : 8);
        if (this.v2 != f12Var) {
        }
        chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout2;
        if (this.v2 != chatAttachAlertPhotoLayout3) {
        }
        G1(0);
        this.x3.f();
        V0().setText("");
        this.w3.g1(0, 1000000);
    }

    public final boolean b1() {
        if (!this.W1) {
            return false;
        }
        f12 f12Var = this.v2;
        return f12Var == this.d2 || f12Var == this.k2;
    }

    @Override // nx0
    public final boolean c0(MotionEvent motionEvent) {
        return this.v2.o(motionEvent);
    }

    public final void d1(EditTextBoldCursor editTextBoldCursor, boolean z) {
        l12 l12Var = this.W3;
        if (l12Var == null || this.r3) {
            return;
        }
        boolean o = l12Var.o();
        this.r3 = true;
        hl.d3(new ds6((Object) this, (Object) editTextBoldCursor, z, (byte) 12), o ? 200L : 0L);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != jn7.T0 && i != jn7.Z4 && i != jn7.F1) {
            if (i == jn7.i5) {
                this.E1 = uc7.s1(yac.t0).H0();
            }
        } else {
            k12 k12Var = this.x3;
            if (k12Var != null) {
                k12Var.f();
            }
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        r02 r02Var;
        p02 p02Var;
        if (this.v2.q() || this.J) {
            return;
        }
        f12 f12Var = this.v2;
        h42 h42Var = this.q2;
        byte b = 0;
        boolean z = (f12Var != h42Var || h42Var == null || h42Var.L || h42Var.Q0 == null) ? false : true;
        this.r2 = z;
        if (!z && (p02Var = this.B2) != null) {
            hl.t1(p02Var.getEditText());
        }
        if (!this.r2 && (r02Var = this.M2) != null) {
            hl.t1(r02Var.getEditText());
        }
        this.u2.clear();
        e eVar = this.Z1;
        if (eVar == null) {
            eVar = LaunchActivity.Q();
        }
        if (this.A4 || eVar == null || this.v2.getSelectedItemsCount() <= 0 || this.z1) {
            int i = 0;
            while (true) {
                f12[] f12VarArr = this.t2;
                if (i >= f12VarArr.length) {
                    break;
                }
                f12 f12Var2 = f12VarArr[i];
                if (f12Var2 != null && this.v2 != f12Var2) {
                    f12Var2.q();
                }
                i++;
            }
            hl.o3(this, vm2.o(aob.v0(aob.a7, this.J0), 0), true, new xz1(this, (byte) 10));
            if (eVar != null) {
                hl.l3(this, eVar.isLightStatusBar());
            }
            this.f4 = false;
            super.dismiss();
            this.A4 = false;
            return;
        }
        if (this.z4) {
            return;
        }
        this.z4 = true;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, eVar.getParentActivity());
        String M0 = ob6.M0(2131751364, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131751365, null);
        alertDialog$Builder.j(ob6.M0(2131751371, null), new xz1(this, b));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        idVar.setOnCancelListener(new cs0(this, (byte) 3));
        idVar.O = new o1(this, (byte) 14);
        idVar.show();
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, this.J0);
        }
    }

    public final void e1() {
        if (this.s0 == null || this.b == null) {
            return;
        }
        int Z0 = Z0(false);
        aob.A1(Z0, this.s0);
        oz4 oz4Var = this.D4;
        if (oz4Var.b != Z0) {
            oz4Var.a(Z0);
            jz1 jz1Var = this.s3;
            if (jz1Var != null) {
                jz1Var.invalidate();
            }
            o02 o02Var = this.t3;
            if (o02Var != null) {
                o02Var.invalidate();
            }
        }
        H1();
        this.b.invalidate();
    }

    public final void f1() {
        int i = 0;
        while (true) {
            f12[] f12VarArr = this.t2;
            if (i >= f12VarArr.length) {
                break;
            }
            f12 f12Var = f12VarArr[i];
            if (f12Var != null) {
                f12Var.p();
            }
            i++;
        }
        int i2 = this.G3;
        jn7.f(i2).n(this, jn7.T0);
        jn7.f(i2).n(this, jn7.Z4);
        jn7.f(i2).n(this, jn7.i5);
        jn7.f(i2).n(this, jn7.F1);
        this.P1 = true;
        p02 p02Var = this.B2;
        if (p02Var != null) {
            p02Var.o();
        }
        r02 r02Var = this.M2;
        if (r02Var != null) {
            r02Var.o();
        }
    }

    @Override // nx0
    public final boolean g0() {
        TL_wallet.walletTransaction wallettransaction;
        final h42 h42Var = this.q2;
        final byte b = 0;
        if (h42Var != null && this.v2 == h42Var) {
            final vq0 vq0Var = new vq0(this, (byte) 2);
            int i = h42Var.n;
            duc ducVar = h42Var.S;
            n12 n12Var = h42Var.b;
            final byte b2 = 1;
            AnimatorSet animatorSet = null;
            if (!h42Var.L && (wallettransaction = h42Var.Q0) != null && h42Var.R0 == null && h42Var.S0 == null) {
                if (h42Var.T0) {
                    uqc uqcVar = new uqc();
                    uqcVar.setCurrentAccount(i);
                    e eVar = n12Var.Z1;
                    if (eVar != null && eVar.presentFragment(uqcVar, false, true)) {
                        quc qucVar = new quc(n12Var.c, n12Var.b, ducVar.getDiamondView(), uqcVar, h42Var.Q0, new Runnable() { // from class: y32
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b;
                                vq0 vq0Var2 = vq0Var;
                                h42 h42Var2 = h42Var;
                                switch (b3) {
                                    case 0:
                                        if (!h42Var2.L) {
                                            vq0Var2.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (!h42Var2.L) {
                                            vq0Var2.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, n12Var);
                        h42Var.S0 = qucVar;
                        animatorSet = qucVar.m;
                    }
                } else if (wallettransaction.localMessageId != 0) {
                    yrc diamondView = ducVar.getDiamondView();
                    if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f) {
                        e eVar2 = n12Var.Z1;
                        if (eVar2 instanceof zu1) {
                            zu1 zu1Var = (zu1) eVar2;
                            if (zu1Var.getCurrentAccount() == i && zu1Var.a() == h42Var.r.id && zu1Var.g4 == 0 && zu1Var.getFragmentView() != null && zu1Var.getFragmentView().isAttachedToWindow()) {
                                nrc nrcVar = new nrc(n12Var.c, n12Var.b, ducVar.getDiamondView(), zu1Var, h42Var.Q0, new Runnable() { // from class: y32
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b2;
                                        vq0 vq0Var2 = vq0Var;
                                        h42 h42Var2 = h42Var;
                                        switch (b3) {
                                            case 0:
                                                if (!h42Var2.L) {
                                                    vq0Var2.run();
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (!h42Var2.L) {
                                                    vq0Var2.run();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, n12Var);
                                h42Var.R0 = nrcVar;
                                animatorSet = nrcVar.m;
                            }
                        }
                    }
                }
            }
            if (animatorSet != null) {
                this.A0 = animatorSet;
                this.B0 = (byte) 2;
                return true;
            }
        }
        return false;
    }

    public final void g1(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String r = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : lbc.r(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ls6.d0(this.G3).b.bots;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
            i++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String a0 = ob6.a0("BotRemoveFromMenu", null, 2131752983, r);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = ob6.M0(2131752982, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        if (tL_attachMenuBot == null) {
            a0 = ob6.a0("BotRemoveInlineFromMenu", null, 2131752981, r);
        }
        idVar.U = hl.S2(a0);
        alertDialog$Builder.j(ob6.M0(2131747558, "OK"), new ie((Object) this, (Object) tL_attachMenuBot, (Object) user, (byte) 20));
        ik8.y("Cancel", 2131752570, alertDialog$Builder, null);
    }

    @Override // nx0
    public final boolean h0(View view, int i, int i2, int i3, int i4) {
        int L;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        r3d r3dVar = chatAttachAlertPhotoLayout.m0;
        zc zcVar = chatAttachAlertPhotoLayout.k0;
        i52 i52Var = chatAttachAlertPhotoLayout.r;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        boolean z = i5 < i6;
        int i7 = hl.n;
        if (view == zcVar) {
            if (z) {
                if (i52Var.getVisibility() == 0) {
                    zcVar.layout(0, qu6.x(222.0f, i4, i7), i5, qu6.x(96.0f, i4, i7));
                    return true;
                }
                zcVar.layout(0, qu6.x(126.0f, i4, i7), i5, i4 - i7);
                return true;
            }
            if (i52Var.getVisibility() == 0) {
                zcVar.layout(qu6.x(222.0f, i3, i7), 0, i3 - hl.L(96.0f), i6 - i7);
                return true;
            }
            zcVar.layout(qu6.x(126.0f, i3, i7), 0, i3, i6 - i7);
            return true;
        }
        if (view == r3dVar) {
            if (z) {
                if (i52Var.getVisibility() == 0) {
                    r3dVar.layout(0, qu6.x(310.0f, i4, i7), i5, qu6.x(260.0f, i4, i7));
                    return true;
                }
                r3dVar.layout(0, qu6.x(176.0f, i4, i7), i5, qu6.x(126.0f, i4, i7));
                return true;
            }
            if (i52Var.getVisibility() == 0) {
                r3dVar.layout(qu6.x(310.0f, i3, i7), 0, i3 - hl.L(260.0f), i6 - i7);
                return true;
            }
            r3dVar.layout(qu6.x(176.0f, i3, i7), 0, i3 - hl.L(126.0f), i6 - i7);
            return true;
        }
        if (view != textView) {
            if (view != i52Var) {
                return false;
            }
            if (z) {
                int x = qu6.x(88.0f, i6, i7);
                view.layout(0, x, view.getMeasuredWidth(), view.getMeasuredHeight() + x);
                return true;
            }
            int L2 = (i + i5) - hl.L(88.0f);
            view.layout(L2, 0, view.getMeasuredWidth() + L2, view.getMeasuredHeight());
            return true;
        }
        if (z) {
            L = (i5 - textView.getMeasuredWidth()) / 2;
            int L3 = i4 - hl.L(167.0f);
            textView.setRotation(0.0f);
            if (i52Var.getVisibility() == 0) {
                L3 -= hl.L(96.0f);
            }
            measuredWidth = L3 - i7;
        } else {
            L = i3 - hl.L(167.0f);
            measuredWidth = (textView.getMeasuredWidth() / 2) + (i6 / 2);
            textView.setRotation(-90.0f);
            if (i52Var.getVisibility() == 0) {
                L -= hl.L(96.0f);
            }
        }
        textView.layout(L, measuredWidth, textView.getMeasuredWidth() + L, textView.getMeasuredHeight() + measuredWidth);
        return true;
    }

    public final void h1() {
        int i = 0;
        while (true) {
            f12[] f12VarArr = this.t2;
            if (i >= f12VarArr.length) {
                this.c4 = true;
                return;
            }
            f12 f12Var = f12VarArr[i];
            if (f12Var != null) {
                f12Var.B();
            }
            i++;
        }
    }

    @Override // nx0
    public final boolean i0(View view, int i, int i2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        u52 u52Var = chatAttachAlertPhotoLayout.w;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        i52 i52Var = chatAttachAlertPhotoLayout.r;
        as asVar = chatAttachAlertPhotoLayout.s;
        boolean z = i < i2;
        if (view != chatAttachAlertPhotoLayout.Q) {
            zc zcVar = chatAttachAlertPhotoLayout.k0;
            if (view == zcVar) {
                if (z) {
                    zcVar.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(126.0f), TLObject.FLAG_30));
                    return true;
                }
                zcVar.measure(View.MeasureSpec.makeMeasureSpec(hl.L(126.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_30));
                return true;
            }
            r3d r3dVar = chatAttachAlertPhotoLayout.m0;
            if (view == r3dVar) {
                if (z) {
                    r3dVar.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
                    return true;
                }
                r3dVar.measure(View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_30));
                return true;
            }
            if (view == i52Var) {
                chatAttachAlertPhotoLayout.K0 = true;
                if (z) {
                    i52Var.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(80.0f), TLObject.FLAG_30));
                    if (asVar.o) {
                        i52Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                        asVar.i1(0);
                        u52Var.f();
                    }
                } else {
                    i52Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_30));
                    if (!asVar.o) {
                        i52Var.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
                        asVar.i1(1);
                        u52Var.f();
                    }
                }
                chatAttachAlertPhotoLayout.K0 = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.c0 && !chatAttachAlertPhotoLayout.e0) {
            chatAttachAlertPhotoLayout.Q.measure(View.MeasureSpec.makeMeasureSpec((n12Var.h != null ? (int) (r11.getSystemWindowInsetRight() * 1.0f) : 0) + n12Var.Q() + i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_30));
            return true;
        }
        return false;
    }

    public final void i1() {
        int i = 0;
        this.c4 = false;
        while (true) {
            f12[] f12VarArr = this.t2;
            if (i >= f12VarArr.length) {
                break;
            }
            f12 f12Var = f12VarArr[i];
            if (f12Var != null) {
                f12Var.D();
            }
            i++;
        }
        if (isShowing()) {
            this.W3.o();
        }
        k12 k12Var = this.x3;
        if (k12Var != null) {
            k12Var.f();
        }
    }

    @Override // nx0
    public final boolean j0() {
        this.d2.setTranslationX(0.0f);
        this.k3.setAlpha(0.0f);
        this.i3.setAlpha(1.0f);
        this.b.setTranslationY(this.b.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.n4 = animatorSet;
        y02 y02Var = this.l4;
        byte b = 1;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, y02Var, 0.0f, 400.0f));
        this.n4.setDuration(400L);
        this.n4.setStartDelay(20L);
        Float valueOf = Float.valueOf(0.0f);
        y02Var.getClass();
        y02Var.a(this, valueOf);
        this.n4.start();
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D0, 1.0f);
        this.C0 = ofFloat;
        ofFloat.addUpdateListener(new yz1(this, (byte) 3));
        vpa vpaVar = this.m4;
        if (vpaVar != null) {
            vpaVar.d();
        }
        vpa vpaVar2 = new vpa((Object) this.b, (vk4) vpa.p, 0.0f);
        this.m4 = vpaVar2;
        r47 r47Var = this.E3;
        wpa wpaVar = vpaVar2.m;
        if (r47Var != null) {
            wpaVar.a(0.75f);
            this.m4.m.b(350.0f);
        } else {
            wpaVar.a(0.75f);
            this.m4.m.b(350.0f);
        }
        this.m4.h();
        if (this.K) {
            this.c.setLayerType(2, null);
        }
        this.B0 = (byte) 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.Z, sn.d, this.p0 ? this.q0 : 0));
        this.A0.setDuration(400L);
        this.A0.setStartDelay(20L);
        this.A0.setInterpolator(this.l0);
        pn pnVar = new pn(null);
        byte b2 = 14;
        on1 on1Var = new on1(this, pnVar, this.z0, b2);
        this.m4.a(new x11(this, on1Var, b));
        this.A0.addListener(new v5(this, on1Var, b2));
        pnVar.d();
        jn7.e().k(jn7.j1, 512);
        this.A0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        v1(0.0f);
        ofFloat2.addUpdateListener(new yz1(this, (byte) 4));
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(k43.f);
        ofFloat2.start();
        return true;
    }

    public final void j1() {
        r47 r47Var = this.E3;
        e eVar = this.Z1;
        int i = this.G3;
        if (r47Var != null && r47Var.o5() && !xc2.z(i, 24, r47.B0(this.E3.k)) && (eVar instanceof zu1)) {
            zu1 zu1Var = (zu1) eVar;
            b77 b77Var = zu1Var.y5;
            if (b77Var == null) {
                b77Var = b77.b(this.E3.k.suggested_post);
            }
            if (!jxa.R(i, b77Var.a)) {
                zu1Var.wc(b77Var);
                return;
            }
        }
        if (this.E1 - this.F1 < 0) {
            hl.z3(this.t1);
            hl.z3(this.u1);
            try {
                this.F2.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (uc7.s1(i).M3() || uc7.s1(i).k4.p1.f() <= this.F1) {
                return;
            }
            z1(eVar);
            return;
        }
        if (this.E3 == null && (eVar instanceof zu1)) {
            zu1 zu1Var2 = (zu1) eVar;
            if (zu1Var2.X7()) {
                jj.J(getContext(), zu1Var2.a(), new xz1(this, (byte) 14), this.J0);
                return;
            }
        }
        f12 f12Var = this.v2;
        if (f12Var == this.d2 || f12Var == this.k2) {
            q1(true, 0, 0, this.K2, b1());
        } else {
            if (f12Var.K(true, 0, 0, this.K2, b1())) {
                return;
            }
            this.A4 = true;
            dismiss();
        }
    }

    public final void k1(int i) {
        e eVar = this.Z1;
        if (i == 3) {
            if (this.K3 || !G0()) {
                Activity parentActivity = eVar != null ? eVar.getParentActivity() : null;
                if (parentActivity != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                l1(true);
                return;
            }
            return;
        }
        if (i == 6 && hl.H1(eVar)) {
            if (this.i2 == null) {
                s42 s42Var = new s42(this, getContext(), this.J0, (this.B1 || this.O3) ? false : true);
                this.i2 = s42Var;
                this.t2[5] = s42Var;
                r42 r42Var = this.t4;
                if (r42Var != null) {
                    s42Var.setDelegate(r42Var);
                } else if (eVar instanceof zu1) {
                    s42Var.setDelegate(new xz1(this, (byte) 18));
                }
            }
            B1(this.i2);
        }
    }

    @Override // nx0
    public final void l0() {
        if (this.v2.s()) {
            dismiss();
        }
    }

    public final void l1(boolean z) {
        if (!this.K3 && z) {
            w72 w72Var = new w72(3, this, this.J0, getContext());
            this.N1 = w72Var;
            B1(w72Var);
        }
        int i = 1;
        if (this.f2 == null) {
            x12 x12Var = new x12(this, this.J0, getContext());
            this.f2 = x12Var;
            this.t2[3] = x12Var;
            x12Var.setupBlurredSearchField(this.E4);
            this.f2.setDelegate(new xz1(this, (byte) 17));
            if (this.B1) {
                this.f2.setMaxSelectedFiles(1);
            }
        }
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            TLRPC.Chat chat = ((zu1) eVar).e;
            x12 x12Var2 = this.f2;
            if ((chat == null || xc2.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                i = -1;
            }
            x12Var2.setMaxSelectedFiles(i);
        }
        if (z) {
            B1(this.f2);
        }
    }

    public final void m1() {
        if (!this.N3) {
            w72 w72Var = new w72(5, this, this.J0, getContext());
            this.N1 = w72Var;
            B1(w72Var);
        }
        if (this.e2 == null) {
            b32 b32Var = new b32(this, this.J0, getContext());
            this.e2 = b32Var;
            this.t2[2] = b32Var;
            b32Var.setupBlurredSearchField(this.E4);
            this.e2.setDelegate(new w02(this));
        }
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            TLRPC.Chat chat = ((zu1) eVar).e;
            this.e2.setMultipleSelectionAllowed(chat == null || xc2.N(chat) || !chat.slowmode_enabled);
        }
        B1(this.e2);
    }

    public final void n1(boolean z) {
        if (!this.H3 && z) {
            w72 w72Var = new w72(4, this, this.J0, getContext());
            this.N1 = w72Var;
            B1(w72Var);
        }
        boolean z2 = false;
        if (this.j2 == null) {
            u32 u32Var = new u32(this.H1 ? 2 : 0, this, this.J0, getContext());
            this.j2 = u32Var;
            this.t2[4] = u32Var;
            u32Var.setDelegate(new x02(this));
        }
        int i = 1;
        if (this.B1) {
            this.j2.setMaxSelectedFiles(1);
        } else {
            e eVar = this.Z1;
            if (eVar instanceof zu1) {
                TLRPC.Chat chat = ((zu1) eVar).e;
                u32 u32Var2 = this.j2;
                if ((chat == null || xc2.N(chat) || !chat.slowmode_enabled) && this.E3 == null) {
                    i = -1;
                }
                u32Var2.setMaxSelectedFiles(i);
            } else {
                this.j2.setMaxSelectedFiles(this.P3);
                u32 u32Var3 = this.j2;
                if (!this.H1 && !this.Q1) {
                    z2 = true;
                }
                u32Var3.setCanSelectOnlyImageFiles(z2);
            }
        }
        u32 u32Var4 = this.j2;
        u32Var4.e0 = this.H1;
        if (z) {
            B1(u32Var4);
        }
    }

    @Override // nx0, android.app.Dialog
    public final void onBackPressed() {
        if (this.M1.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        y10 y10Var = this.U2;
        if (y10Var.o0) {
            y10Var.o(true);
            return;
        }
        if (this.v2.k()) {
            return;
        }
        if (V0() == null || !V0().e) {
            super.onBackPressed();
        } else {
            V0().k(true);
        }
    }

    @Override // nx0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVar = this.Z1;
        if (eVar != null) {
            hl.l3(this, eVar.isLightStatusBar());
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.v2.G(i)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // nx0, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).A0.add(this.M1);
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
            ((LaunchActivity) context).A0.remove(this.M1);
        }
    }

    @Override // nx0
    public final void p0() {
        super.p0();
        try {
            I0();
            rl0 rl0Var = this.V1;
            if (rl0Var != null) {
                rl0Var.updateColors();
            }
            int v0 = aob.v0(aob.j5, this.J0);
            s7 s7Var = this.h3;
            if (s7Var == null || v0 == this.o4) {
                return;
            }
            this.o4 = v0;
            s7Var.setIconColor(v0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p1() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        y10 y10Var = this.U2;
        int i = 1;
        if (y10Var.o0) {
            y10Var.o(true);
        }
        this.e2 = null;
        this.m2 = null;
        this.f2 = null;
        this.g2 = null;
        this.h2 = null;
        this.i2 = null;
        this.j2 = null;
        this.q2 = null;
        while (true) {
            f12[] f12VarArr = this.t2;
            if (i >= f12VarArr.length) {
                break;
            }
            f12 f12Var = f12VarArr[i];
            if (f12Var != null) {
                f12Var.p();
                this.b.removeView(f12VarArr[i]);
                f12VarArr[i] = null;
            }
            i++;
        }
        E1(false, false);
        super.H();
        if (this.r2) {
            this.r2 = false;
            this.s2 = 0.0f;
            e eVar = this.Z1;
            if (eVar == null || eVar.getFragmentView() == null) {
                return;
            }
            View fragmentView = eVar.getFragmentView();
            WeakHashMap weakHashMap = ihc.a;
            ygc.c(fragmentView);
        }
    }

    public final boolean q1(final boolean z, final int i, final int i2, final long j, final boolean z2) {
        if (this.F3) {
            return false;
        }
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            zu1 zu1Var = (zu1) eVar;
            TLRPC.Chat chat = zu1Var.e;
            if (zu1Var.h() != null || ((xc2.T(chat) && chat.megagroup) || !xc2.T(chat))) {
                uc7.s1(this.G3).W3.edit().putBoolean("silent_" + zu1Var.a(), !z).commit();
            }
        }
        if (H0(V0().getText())) {
            return true;
        }
        F0();
        if (this.q1.f) {
            this.F3 = true;
            this.W3.z0(7, true, z, i, i2, j, z2, false, 0L);
            return true;
        }
        long W0 = W0();
        f12 f12Var = this.v2;
        return jj.Y(this.G3, W0, S0() + (f12Var != null ? f12Var.getSelectedItemsCount() : 1), new pcc() { // from class: j02
            @Override // pcc
            public final void a(Object obj) {
                n12 n12Var = n12.this;
                n12Var.F3 = true;
                n12Var.W3.z0(7, true, z, i, i2, j, z2, false, ((Long) obj).longValue());
            }
        }, 0L);
    }

    @Override // nx0
    public final void r0(boolean z) {
        this.r0 = true;
    }

    public final void r1(boolean z, boolean z2) {
        this.l1.a(z, z2);
        iu3 V0 = V0();
        this.W1 = z;
        iu3 V02 = V0();
        final byte b = 1;
        final boolean z3 = this.A2.getTag() != null;
        f12 f12Var = this.v2;
        final boolean z4 = this.W1 && (f12Var == this.d2 || f12Var == this.k2);
        tt ttVar = this.L2;
        c41 c41Var = this.z2;
        if (z2) {
            ttVar.setVisibility(z3 ? 0 : 8);
            ViewPropertyAnimator duration = ttVar.animate().alpha((z4 && z3) ? 1.0f : 0.0f).setDuration(320L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).setUpdateListener(new yz1(this, r3)).withEndAction(new Runnable(this) { // from class: zz1
                public final /* synthetic */ n12 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = r4;
                    boolean z5 = z3;
                    boolean z6 = z4;
                    n12 n12Var = this.b;
                    switch (b2) {
                        case 0:
                            if (!z6 || !z5) {
                                n12Var.L2.setVisibility(8);
                            }
                            n12Var.M1();
                            break;
                        default:
                            if (z6 || !z5) {
                                n12Var.z2.setVisibility(8);
                                break;
                            }
                    }
                }
            }).start();
            c41Var.setVisibility(0);
            c41Var.animate().translationY((z4 || !z3) ? c41Var.getMeasuredHeight() : 0.0f).alpha((z4 || !z3) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(k43Var).setUpdateListener(new yz1(this, b)).withEndAction(new Runnable(this) { // from class: zz1
                public final /* synthetic */ n12 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    boolean z5 = z3;
                    boolean z6 = z4;
                    n12 n12Var = this.b;
                    switch (b2) {
                        case 0:
                            if (!z6 || !z5) {
                                n12Var.L2.setVisibility(8);
                            }
                            n12Var.M1();
                            break;
                        default:
                            if (z6 || !z5) {
                                n12Var.z2.setVisibility(8);
                                break;
                            }
                    }
                }
            }).start();
        } else {
            ttVar.setVisibility((z4 && z3) ? 0 : 8);
            ttVar.setAlpha((z4 && z3) ? 1.0f : 0.0f);
            M1();
            c41Var.setAlpha((z4 || !z3) ? 0.0f : 1.0f);
            c41Var.setTranslationY((z4 || !z3) ? c41Var.getMeasuredHeight() : 0.0f);
            c41Var.setVisibility((z4 || !z3) ? (byte) 8 : (byte) 0);
        }
        if (V0 != V02) {
            V0.k(true);
            V02.setText(hm.cloneSpans(V0.getText()));
            V02.getEditText().setAllowTextEntitiesIntersection(V0.getEditText().getAllowTextEntitiesIntersection());
            if (V0.getEditText().isFocused()) {
                V02.getEditText().requestFocus();
                V02.getEditText().setSelection(V0.getEditText().getSelectionStart(), V0.getEditText().getSelectionEnd());
            }
        }
        hl.c3(new vq0(this, b));
    }

    public final void s1(int i, r47 r47Var) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (r47Var != null && (chatAttachAlertPhotoLayout = this.d2) != null) {
            chatAttachAlertPhotoLayout.Z();
        }
        if (this.E3 == r47Var && this.D3 == i) {
            return;
        }
        this.E3 = r47Var;
        if (r47Var != null && r47Var.z2()) {
            i = this.E3.I3() ? 2 : this.E3.U2() ? 1 : 0;
        }
        this.D3 = i;
        if (this.E3 != null) {
            this.P3 = 1;
            this.Q3 = false;
        } else {
            this.P3 = -1;
            this.Q3 = true;
        }
        this.x3.f();
        G1(0);
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        this.F3 = false;
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            this.i0 = ((zu1) eVar).Y7();
        }
        H1();
        this.p3 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int o = vm2.o(aob.v0(aob.a7, this.J0), 0);
            this.H0 = o;
            hl.o3(this, o, false, null);
            hl.i3(this, ((double) hl.B(this.H0)) > 0.721d);
        }
        if (this.j4) {
            this.j4 = false;
            y10 y10Var = this.U2;
            y10Var.updateColors();
            y10Var.invalidate();
            e1();
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        int i2;
        if (i == 0) {
            O0();
            K0();
            return;
        }
        int i3 = 1;
        if (i == 2) {
            K0();
            a72 a72Var = this.g2;
            if (a72Var != null) {
                if (this.w2 == a72Var) {
                    i2 = 1;
                } else if (this.v2 == a72Var) {
                    i2 = 0;
                }
                L1(i2);
            }
            a72 a72Var2 = this.h2;
            if (a72Var2 != null) {
                if (this.w2 != a72Var2) {
                    if (this.v2 != a72Var2) {
                        return;
                    } else {
                        i3 = 0;
                    }
                }
                L1(i3);
                return;
            }
            return;
        }
        if (i == 1) {
            K0();
            return;
        }
        if (i == 3) {
            N0();
            return;
        }
        if (i == 4) {
            N0();
            return;
        }
        if (i == 5) {
            N0();
            u02 u02Var = this.F2;
            if (u02Var != null) {
                u02Var.setEphemeralFactor(f);
                u02Var.setSameWidthFactor(f);
            }
        }
    }

    public final void t1(float f) {
        int i;
        float translationY = this.b.getTranslationY() - this.s2;
        this.s2 = this.b.getHeight() * f;
        this.b.setTranslationY(translationY);
        h42 h42Var = this.q2;
        if (h42Var != null) {
            h42Var.setSendTransitionProgress(f);
        }
        if (this.p0) {
            i = Math.round((1.0f - f) * this.q0);
        } else {
            i = 0;
        }
        this.Z.setAlpha(i);
        this.D0 = 1.0f - f;
        this.c.invalidate();
    }

    public final void u1(int i, boolean z) {
        if (this.E3 != null) {
            return;
        }
        this.P3 = i;
        this.Q3 = z;
    }

    public final void v1(float f) {
        int o = vm2.o(aob.v0(aob.a7, this.J0), Math.min(jn7.d4, Math.max(0, (int) (f * 255.0f))));
        this.H0 = o;
        hl.o3(this, o, false, null);
        hl.i3(this, ((double) hl.B(this.H0)) > 0.721d);
        this.c.invalidate();
    }

    public final void w1(String str) {
        this.N2 = (byte) 1;
        this.z1 = true;
        this.P2 = false;
        this.J3 = false;
        this.u3.setVisibility(8);
        this.g3.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.d2;
        if (chatAttachAlertPhotoLayout != null) {
            n12 n12Var = chatAttachAlertPhotoLayout.b;
            chatAttachAlertPhotoLayout.h1 = (n12Var.N2 == 0 || n12Var.z1) ? false : true;
        }
    }

    @Override // nx0
    public final void x() {
        if (this.Z1 instanceof zu1) {
            String[] strArr = MediaController.W1;
        } else {
            String[] strArr2 = MediaController.W1;
        }
        this.v2.y();
        hl.g2(ob6.M0(2131754917, "AccDescrAttachButton"));
        this.p3 = true;
        if (this.J3 || this.I3) {
            return;
        }
        G0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x1(boolean z) {
        boolean z2;
        byte b = 1;
        if (z) {
            e eVar = this.Z1;
            if ((eVar instanceof zu1) && !((zu1) eVar).y()) {
                z2 = true;
                if (this.y4 == z2) {
                    if (z2) {
                        uc7.s1(this.G3).Q1().b();
                    }
                    this.y4 = z2;
                    ImageView imageView = this.v1;
                    imageView.setVisibility(0);
                    ImageView imageView2 = this.x1;
                    imageView2.setVisibility(0);
                    ViewPropertyAnimator scaleY = imageView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f);
                    k43 k43Var = k43.h;
                    scaleY.setInterpolator(k43Var).setDuration(420L).withEndAction(new h02(this, z2, b)).start();
                    imageView2.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(k43Var).setDuration(420L).withEndAction(new h02(this, z2, (byte) 2)).start();
                    if (z2) {
                        hc hcVar = this.w1;
                        Objects.requireNonNull(hcVar);
                        imageView.postDelayed(new gc(hcVar, (byte) 1), 220L);
                        hc hcVar2 = this.y1;
                        Objects.requireNonNull(hcVar2);
                        imageView2.postDelayed(new gc(hcVar2, (byte) 1), 220L);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z2 = false;
        if (this.y4 == z2) {
        }
    }

    @Override // ix0
    public final boolean y() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(long j, String str, boolean z, boolean z2) {
        TLRPC.ChatFull N0;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        LongSparseArray longSparseArray = this.u2;
        byte b = 1;
        if (longSparseArray.get(j) != null && Objects.equals(str, ((j22) longSparseArray.get(j)).getStartCommand())) {
            j22 j22Var = (j22) longSparseArray.get(j);
            if (j22Var.I) {
                j22Var.I = false;
            }
            if (longSparseArray.get(j) == null) {
                ((j22) longSparseArray.get(j)).K.setSwipeOffsetAnimationDisallowed(true);
                C1((f12) longSparseArray.get(j), -j, z2);
                if (z) {
                    j22 j22Var2 = (j22) longSparseArray.get(j);
                    TLRPC.User X1 = uc7.s1(j22Var2.G).X1(Long.valueOf(j22Var2.w));
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList = ls6.d0(j22Var2.G).b.bots;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            tL_attachMenuBot = null;
                            break;
                        }
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
                        i++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                        if (tL_attachMenuBot.bot_id == j22Var2.w) {
                            break;
                        }
                    }
                    if (tL_attachMenuBot != null) {
                        hl.d3(new dy1(j22Var2, tL_attachMenuBot.show_in_side_menu ? tL_attachMenuBot.show_in_attach_menu ? ob6.a0("BotAttachMenuShortcatAddedAttachAndSide", null, 2131753131, X1.first_name) : ob6.a0("BotAttachMenuShortcatAddedSide", null, 2131753130, X1.first_name) : ob6.a0("BotAttachMenuShortcatAddedAttach", null, 2131753132, X1.first_name), (byte) 11), 200L);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        e eVar = this.Z1;
        if (eVar instanceof zu1) {
            Context context = getContext();
            vnb vnbVar = this.J0;
            j22 j22Var3 = new j22(this, vnbVar, context);
            j22Var3.V = new y12(j22Var3, (byte) 2);
            s7 a = j22Var3.b.U2.u().a(0, R.drawable.ic_ab_other);
            j22Var3.L = a;
            a.e(R.id.menu_open_bot, R.drawable.msg_bot, ob6.M0(2131752893, null));
            b8 e = a.e(R.id.menu_settings, R.drawable.msg_settings, ob6.M0(2131752878, null));
            j22Var3.M = e;
            e.setVisibility(8);
            a.e(R.id.menu_reload_page, R.drawable.msg_retry, ob6.M0(2131752892, null));
            b8 e2 = a.e(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, ob6.M0(2131754383, null));
            j22Var3.N = e2;
            e2.setVisibility(8);
            a.e(R.id.menu_tos_bot, R.drawable.menu_intro, ob6.M0(2131752875, null));
            a.e(R.id.menu_report_bot, R.drawable.msg_report, ob6.M0(2131752891, null));
            a.e(R.id.menu_delete_bot, R.drawable.msg_delete, ob6.M0(2131752896, null));
            pw0 pw0Var = new pw0(j22Var3, context, vnbVar, aob.v0(aob.h5, j22Var3.a), (byte) 1);
            j22Var3.n = pw0Var;
            ow0 ow0Var = new ow0(b, context, j22Var3);
            j22Var3.K = ow0Var;
            ow0Var.addView(pw0Var, tre.c(-1.0f, -1));
            ow0Var.setScrollListener(new y12(j22Var3, (byte) 3));
            ow0Var.setScrollEndListener(new y12(j22Var3, (byte) 4));
            ow0Var.setDelegate(new a22(j22Var3));
            ow0Var.setIsKeyboardVisible(new a22(j22Var3));
            j22Var3.addView(ow0Var, tre.c(-1.0f, -1));
            d22 d22Var = new d22(context, vnbVar);
            j22Var3.J = d22Var;
            j22Var3.addView(d22Var, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 84.0f));
            pw0Var.setWebViewProgressListener(new hw(j22Var3, (byte) 5));
            jn7.e().b(j22Var3, jn7.q4);
            longSparseArray.put(j, j22Var3);
            ((j22) longSparseArray.get(j)).setDelegate(new s02(this, j22Var3, str, j));
            zu1 zu1Var = (zu1) eVar;
            r47 replyingMessageObject = zu1Var.a0.getReplyingMessageObject();
            j22 j22Var4 = (j22) longSparseArray.get(j);
            long a2 = zu1Var.a();
            int i2 = replyingMessageObject != null ? replyingMessageObject.k.id : 0;
            long k7 = zu1Var.k7();
            pw0 pw0Var2 = j22Var4.n;
            int i3 = this.G3;
            j22Var4.G = i3;
            j22Var4.x = a2;
            j22Var4.w = j;
            j22Var4.E = i2;
            j22Var4.F = k7;
            j22Var4.H = str;
            b8 b8Var = j22Var4.N;
            if (b8Var != null) {
                ls6.d0(i3);
                b8Var.setVisibility(0);
            }
            pw0Var2.setBotUser(uc7.s1(i3).X1(Long.valueOf(j)));
            pw0Var2.p(i3, j);
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = uc7.s1(i3).j1(a2);
            tL_messages_requestWebView.bot = uc7.s1(i3).o1(j);
            tL_messages_requestWebView.silent = false;
            tL_messages_requestWebView.platform = "android";
            if (a2 < 0 && (N0 = uc7.s1(i3).N0(-a2)) != null && (peer = N0.default_send_as) != null) {
                tL_messages_requestWebView.send_as = uc7.s1(i3).m1(peer);
                tL_messages_requestWebView.flags |= TLObject.FLAG_13;
            }
            if (str != null) {
                tL_messages_requestWebView.start_param = str;
                tL_messages_requestWebView.flags |= 8;
            }
            if (i2 != 0) {
                r7a.B(i3);
                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                tL_inputReplyToMessage.reply_to_msg_id = i2;
                tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                if (k7 != 0) {
                    tL_inputReplyToMessage.monoforum_peer_id = uc7.s1(i3).j1(k7);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (k7 != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = uc7.s1(i3).j1(k7);
                tL_messages_requestWebView.flags |= 1;
            }
            JSONObject u = xw0.u(j22Var4.a, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(i3).sendRequest(tL_messages_requestWebView, new b22(j22Var4, i3, (byte) 0));
            jn7.f(i3).b(j22Var4, jn7.z1);
        }
        if (longSparseArray.get(j) == null) {
        }
    }

    public final void z1(e eVar) {
        if ((eVar instanceof zu1) && xc2.V(((zu1) eVar).e)) {
            new d31(this.o3, this.J0).f(uc7.s1(this.G3).k4.p1.f(), new dy1(this, eVar, (byte) 5)).j();
        }
    }

    @Override // s84
    public final void v0(float f, int i) {
    }

    public n12(Activity activity, e eVar, boolean z, boolean z2) {
        this(activity, eVar, z, z2, true, null);
    }
}

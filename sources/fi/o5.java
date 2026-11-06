package fi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ec;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.as;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g20;
import org.telegram.messenger.gc;
import org.telegram.messenger.h20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.v10;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class o5 extends st0 implements tg.g1, tg.h, tg.c1, qt0, ra {
    public final j5 A0;
    public int A1;
    public final FrameLayout B0;
    public int B1;
    public final k5 C0;
    public sg.q C1;
    public final v4 D0;
    public final boolean D1;
    public final FrameLayout E0;
    public final File E1;
    public a5 F0;
    public final boolean F1;
    public final View G0;
    public final boolean G1;
    public int H0;
    public boolean H1;
    public int I0;
    public ii0 I1;
    public float J0;
    public tg.q1 J1;
    public ValueAnimator K0;
    public float K1;
    public boolean L0;
    public boolean L1;
    public final tg.m1 M0;
    public boolean M1;
    public final cb.c N0;
    public org.telegram.ui.Components.y9 N1;
    public final int O0;
    public final x5 O1;
    public BigInteger P0;
    public final y5 P1;
    public TextView Q0;
    public boolean Q1;
    public TextView R0;
    public ObjectAnimator R1;
    public TextView S0;
    public final float[] S1;
    public final tg.h1 T0;
    public c5 T1;
    public final tg.e1 U0;
    public boolean U1;
    public final tg.j1 V0;
    public boolean V1;
    public final ImageView W0;
    public boolean W1;
    public final TextView X0;
    public final int[] X1;
    public final TextView Y0;
    public gy Y1;
    public final TextView Z0;
    public boolean Z1;
    public final Paint a1;
    public boolean a2;
    public final Paint b1;
    public boolean b2;
    public float c1;
    public int c2;
    public boolean d1;
    public boolean d2;
    public r1.g e1;
    public int e2;
    public final w4 f1;
    public int f2;
    public final Paint g1;
    public int g2;
    public final Paint h1;
    public boolean h2;
    public final Paint i1;
    public final tg.v0 j0;
    public final sg.j1 j1;
    public final tg.z0 k0;
    public boolean k1;
    public final Bitmap l0;
    public r1.g l1;
    public final sg.m1 m0;
    public float m1;
    public final org.telegram.messenger.q5 n0;
    public final Paint n1;
    public final ye o0;
    public final int o1;
    public boolean p0;
    public final g5 p1;
    public mt0 q0;
    public org.telegram.ui.ActionBar.g1 q1;
    public boolean r0;
    public m5 r1;
    public tg.j s0;
    public Rect s1;
    public boolean t0;
    public Runnable t1;
    public int u0;
    public Runnable u1;
    public boolean v0;
    public final ua v1;
    public final boolean w0;
    public AnimatorSet w1;
    public final i5 x0;
    public final x4 x1;
    public final ec y0;
    public e7 y1;
    public final v4 z0;
    public ArrayList z1;

    public o5(Context context, boolean z9, File file, boolean z10, boolean z11, ua uaVar, Activity activity, final int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, e7 e7Var, int i11, int i12, ye yeVar, org.telegram.ui.Components.y9 y9Var, org.telegram.ui.ActionBar.f6 f6Var, x5 x5Var, y5 y5Var) {
        super(context, activity);
        Paint paint;
        org.telegram.ui.Components.y9 y9Var2;
        this.H0 = 0;
        this.I0 = -1;
        final x9 x9Var = (x9) this;
        cb.c cVar = new cb.c(x9Var, 25);
        this.N0 = cVar;
        Paint paint2 = new Paint(1);
        this.a1 = paint2;
        Paint paint3 = new Paint(1);
        this.b1 = paint3;
        this.g1 = new Paint(1);
        this.h1 = new Paint(1);
        Paint paint4 = new Paint(1);
        this.i1 = paint4;
        sg.j1 j1Var = new sg.j1(1.0f, 0.016773745f, -1);
        this.j1 = j1Var;
        this.n1 = new Paint(1);
        this.S1 = new float[2];
        this.V1 = false;
        this.X1 = new int[2];
        new a8.ra(x9Var, 24);
        setDelegate(this);
        this.N1 = y9Var;
        this.O1 = x5Var;
        this.D1 = z9;
        this.E1 = file;
        this.F1 = z10;
        this.G1 = z11;
        this.v1 = uaVar;
        this.A1 = i11;
        this.B1 = i12;
        this.P1 = y5Var;
        this.o1 = i7;
        g5 g5Var = new g5(0, f6Var);
        this.p1 = g5Var;
        this.o0 = yeVar;
        this.w0 = context instanceof BubbleActivity;
        sg.l0 e10 = sg.l0.e(i7);
        e10.i(0, true);
        j1Var.a = e10.c();
        j1Var.c = e10.i;
        org.telegram.messenger.q5 q5Var = new org.telegram.messenger.q5("Paint", true);
        this.n0 = q5Var;
        this.l0 = bitmap;
        this.O0 = i10;
        sg.m1 m1Var = new sg.m1();
        this.m0 = m1Var;
        m1Var.a = new di.q4(x9Var, 13);
        View view = new View(context);
        this.G0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        sg.j0 j0Var = new sg.j0(getPaintingSize(), null, i10, y9Var);
        if (e7Var == null || !e7Var.u) {
            paint = paint4;
            y9Var2 = y9Var;
        } else {
            paint = paint4;
            y9Var2 = null;
        }
        int i13 = 1;
        i5 i5Var = new i5(x9Var, context, j0Var, bitmap, bitmap2, y9Var2);
        this.x0 = i5Var;
        i5Var.setDelegate(new d6.i(x9Var, 25));
        i5Var.setUndoStore(m1Var);
        i5Var.setQueue(q5Var);
        i5Var.setVisibility(4);
        ec ecVar = new ec(i13, context, x9Var);
        this.y0 = ecVar;
        ecVar.setVisibility(4);
        j5 j5Var = new j5(x9Var, context, new aa.n(x9Var, 22));
        this.A0 = j5Var;
        this.y1 = e7Var;
        this.z1 = arrayList;
        if (this.A1 > 0 && this.B1 > 0) {
            E0();
        }
        j5Var.setVisibility(4);
        this.z0 = new v4(x9Var, context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.B0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{TLObject.FLAG_30, 0}));
        addView(frameLayout, c8.ha.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        final int i14 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: fi.j4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        i5 i5Var2 = x9Var2.x0;
                        if (i5Var2 != null && (i5Var2.getCurrentBrush() instanceof sg.g)) {
                            i5Var2.b();
                            x9Var2.T0.setSelectedIndex(1);
                            x9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            x9Var2.m0.c();
                            break;
                        }
                        break;
                    case 1:
                        x9 x9Var3 = x9Var;
                        i5 i5Var3 = x9Var3.x0;
                        sg.m1 m1Var2 = x9Var3.m0;
                        if (m1Var2.a()) {
                            if (i5Var3 != null && (i5Var3.getCurrentBrush() instanceof sg.g)) {
                                i5Var3.b();
                                x9Var3.T0.setSelectedIndex(1);
                                x9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (i5Var3 != null) {
                                i5Var3.a();
                            }
                            m1Var2.c.clear();
                            m1Var2.b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            x9Var3.A0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        x9 x9Var4 = x9Var;
                        tg.j jVar = x9Var4.s0;
                        if (jVar instanceof tg.k2) {
                            org.telegram.messenger.g0.v1(((tg.k2) jVar).getFocusedView());
                        }
                        if (x9Var4.Z1) {
                            x9Var4.s0(false);
                        }
                        x9Var4.z0(x9Var4.s0);
                        x9Var4.A0(null, true);
                        break;
                    case 3:
                        x9Var.A0(null, true);
                        break;
                    default:
                        x9 x9Var5 = x9Var;
                        if (!x9Var5.k1) {
                            if (!x9Var5.Z1) {
                                if (!x9Var5.t0) {
                                    Runnable runnable = x9Var5.u1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    x9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                x9Var5.s0(true);
                                break;
                            }
                        } else {
                            x9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, c8.ha.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.M0(2131747266, null));
        linearLayout.addView(org.telegram.messenger.camera.q.e(context, R.drawable.photo_zoomout), c8.ha.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, c8.ha.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.l1(3));
        frameLayout.addView(linearLayout, c8.ha.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.X0 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(hd.M0(2131747278, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        final int i15 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: fi.j4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        i5 i5Var2 = x9Var2.x0;
                        if (i5Var2 != null && (i5Var2.getCurrentBrush() instanceof sg.g)) {
                            i5Var2.b();
                            x9Var2.T0.setSelectedIndex(1);
                            x9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            x9Var2.m0.c();
                            break;
                        }
                        break;
                    case 1:
                        x9 x9Var3 = x9Var;
                        i5 i5Var3 = x9Var3.x0;
                        sg.m1 m1Var2 = x9Var3.m0;
                        if (m1Var2.a()) {
                            if (i5Var3 != null && (i5Var3.getCurrentBrush() instanceof sg.g)) {
                                i5Var3.b();
                                x9Var3.T0.setSelectedIndex(1);
                                x9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (i5Var3 != null) {
                                i5Var3.a();
                            }
                            m1Var2.c.clear();
                            m1Var2.b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            x9Var3.A0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        x9 x9Var4 = x9Var;
                        tg.j jVar = x9Var4.s0;
                        if (jVar instanceof tg.k2) {
                            org.telegram.messenger.g0.v1(((tg.k2) jVar).getFocusedView());
                        }
                        if (x9Var4.Z1) {
                            x9Var4.s0(false);
                        }
                        x9Var4.z0(x9Var4.s0);
                        x9Var4.A0(null, true);
                        break;
                    case 3:
                        x9Var.A0(null, true);
                        break;
                    default:
                        x9 x9Var5 = x9Var;
                        if (!x9Var5.k1) {
                            if (!x9Var5.Z1) {
                                if (!x9Var5.t0) {
                                    Runnable runnable = x9Var5.u1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    x9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                x9Var5.s0(true);
                                break;
                            }
                        } else {
                            x9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView i16 = org.telegram.ui.Cells.f1.i(frameLayout, textView2, c8.ha.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.Y0 = i16;
        i16.setBackground(org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
        i16.setText(hd.M0(2131752101, null));
        i16.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        i16.setGravity(16);
        i16.setTextColor(-1);
        i16.setTypeface(org.telegram.messenger.g0.o());
        i16.setTextSize(1, 16.0f);
        final int i17 = 2;
        i16.setOnClickListener(new View.OnClickListener() { // from class: fi.j4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        i5 i5Var2 = x9Var2.x0;
                        if (i5Var2 != null && (i5Var2.getCurrentBrush() instanceof sg.g)) {
                            i5Var2.b();
                            x9Var2.T0.setSelectedIndex(1);
                            x9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            x9Var2.m0.c();
                            break;
                        }
                        break;
                    case 1:
                        x9 x9Var3 = x9Var;
                        i5 i5Var3 = x9Var3.x0;
                        sg.m1 m1Var2 = x9Var3.m0;
                        if (m1Var2.a()) {
                            if (i5Var3 != null && (i5Var3.getCurrentBrush() instanceof sg.g)) {
                                i5Var3.b();
                                x9Var3.T0.setSelectedIndex(1);
                                x9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (i5Var3 != null) {
                                i5Var3.a();
                            }
                            m1Var2.c.clear();
                            m1Var2.b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            x9Var3.A0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        x9 x9Var4 = x9Var;
                        tg.j jVar = x9Var4.s0;
                        if (jVar instanceof tg.k2) {
                            org.telegram.messenger.g0.v1(((tg.k2) jVar).getFocusedView());
                        }
                        if (x9Var4.Z1) {
                            x9Var4.s0(false);
                        }
                        x9Var4.z0(x9Var4.s0);
                        x9Var4.A0(null, true);
                        break;
                    case 3:
                        x9Var.A0(null, true);
                        break;
                    default:
                        x9 x9Var5 = x9Var;
                        if (!x9Var5.k1) {
                            if (!x9Var5.Z1) {
                                if (!x9Var5.t0) {
                                    Runnable runnable = x9Var5.u1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    x9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                x9Var5.s0(true);
                                break;
                            }
                        } else {
                            x9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        i16.setAlpha(0.0f);
        i16.setVisibility(8);
        TextView i18 = org.telegram.ui.Cells.f1.i(frameLayout, i16, c8.ha.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.Z0 = i18;
        i18.setBackground(org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
        i18.setText(hd.M0(2131751355, null));
        i18.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        i18.setGravity(16);
        i18.setTextColor(-1);
        i18.setTypeface(org.telegram.messenger.g0.o());
        i18.setTextSize(1, 16.0f);
        final int i19 = 3;
        i18.setOnClickListener(new View.OnClickListener() { // from class: fi.j4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i19) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        i5 i5Var2 = x9Var2.x0;
                        if (i5Var2 != null && (i5Var2.getCurrentBrush() instanceof sg.g)) {
                            i5Var2.b();
                            x9Var2.T0.setSelectedIndex(1);
                            x9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            x9Var2.m0.c();
                            break;
                        }
                        break;
                    case 1:
                        x9 x9Var3 = x9Var;
                        i5 i5Var3 = x9Var3.x0;
                        sg.m1 m1Var2 = x9Var3.m0;
                        if (m1Var2.a()) {
                            if (i5Var3 != null && (i5Var3.getCurrentBrush() instanceof sg.g)) {
                                i5Var3.b();
                                x9Var3.T0.setSelectedIndex(1);
                                x9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (i5Var3 != null) {
                                i5Var3.a();
                            }
                            m1Var2.c.clear();
                            m1Var2.b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            x9Var3.A0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        x9 x9Var4 = x9Var;
                        tg.j jVar = x9Var4.s0;
                        if (jVar instanceof tg.k2) {
                            org.telegram.messenger.g0.v1(((tg.k2) jVar).getFocusedView());
                        }
                        if (x9Var4.Z1) {
                            x9Var4.s0(false);
                        }
                        x9Var4.z0(x9Var4.s0);
                        x9Var4.A0(null, true);
                        break;
                    case 3:
                        x9Var.A0(null, true);
                        break;
                    default:
                        x9 x9Var5 = x9Var;
                        if (!x9Var5.k1) {
                            if (!x9Var5.Z1) {
                                if (!x9Var5.t0) {
                                    Runnable runnable = x9Var5.u1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    x9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                x9Var5.s0(true);
                                break;
                            }
                        } else {
                            x9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        i18.setAlpha(0.0f);
        i18.setVisibility(8);
        frameLayout.addView(i18, c8.ha.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        k5 k5Var = new k5(x9Var, context, e10);
        this.C0 = k5Var;
        k5Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        k5Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(k5Var, c8.ha.e(-1, qs.p1, 80));
        tg.h1 h1Var = new tg.h1(context, (e7Var == null || e7Var.v() || e7Var.u || y9Var == null) ? false : true);
        this.T0 = h1Var;
        h1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        h1Var.setDelegate(this);
        h1Var.setSelectedIndex(1);
        k5Var.addView(h1Var, c8.ha.c(48.0f, -1));
        tg.e1 e1Var = new tg.e1(context);
        this.U0 = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        e1Var.setVisibility(8);
        e1Var.setDelegate(this);
        final int i20 = 1;
        post(new Runnable() { // from class: fi.i4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        sg.j1 j1Var2 = x9Var2.j1;
                        x9Var2.C0(j1Var2);
                        sg.l0.e(i7).j(j1Var2.c);
                        break;
                    default:
                        x9Var.U0.setTypeface(sg.l0.e(i7).j);
                        break;
                }
            }
        });
        e1Var.setAlignment(sg.l0.e(i7).g);
        k5Var.addView(e1Var, c8.ha.c(48.0f, -1));
        v4 v4Var = new v4(x9Var, context, 0);
        this.D0 = v4Var;
        addView(v4Var, c8.ha.c(-1.0f, -1));
        tg.j1 j1Var2 = new tg.j1(context);
        this.V0 = j1Var2;
        j1Var2.setVisibility(8);
        int i21 = 10;
        j1Var2.setOnItemClickListener(new ai.k(x9Var, i21));
        e1Var.setTypefaceListView(j1Var2);
        v4Var.addView(j1Var2, c8.ha.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(352321535);
        paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, g5Var));
        w4 w4Var = new w4(x9Var, context);
        this.f1 = w4Var;
        w4Var.setVisibility(8);
        w4Var.setColorPalette(sg.l0.e(i7));
        w4Var.setColorListener(new bi.q9(x9Var, 1));
        k5Var.addView(w4Var, c8.ha.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        tg.v0 v0Var = new tg.v0(context);
        this.j0 = v0Var;
        v0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        v0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        k5Var.addView(v0Var, c8.ha.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        final int i22 = 4;
        v0Var.setOnClickListener(new View.OnClickListener() { // from class: fi.j4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i22) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        i5 i5Var2 = x9Var2.x0;
                        if (i5Var2 != null && (i5Var2.getCurrentBrush() instanceof sg.g)) {
                            i5Var2.b();
                            x9Var2.T0.setSelectedIndex(1);
                            x9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            x9Var2.m0.c();
                            break;
                        }
                        break;
                    case 1:
                        x9 x9Var3 = x9Var;
                        i5 i5Var3 = x9Var3.x0;
                        sg.m1 m1Var2 = x9Var3.m0;
                        if (m1Var2.a()) {
                            if (i5Var3 != null && (i5Var3.getCurrentBrush() instanceof sg.g)) {
                                i5Var3.b();
                                x9Var3.T0.setSelectedIndex(1);
                                x9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (i5Var3 != null) {
                                i5Var3.a();
                            }
                            m1Var2.c.clear();
                            m1Var2.b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            x9Var3.A0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        x9 x9Var4 = x9Var;
                        tg.j jVar = x9Var4.s0;
                        if (jVar instanceof tg.k2) {
                            org.telegram.messenger.g0.v1(((tg.k2) jVar).getFocusedView());
                        }
                        if (x9Var4.Z1) {
                            x9Var4.s0(false);
                        }
                        x9Var4.z0(x9Var4.s0);
                        x9Var4.A0(null, true);
                        break;
                    case 3:
                        x9Var.A0(null, true);
                        break;
                    default:
                        x9 x9Var5 = x9Var;
                        if (!x9Var5.k1) {
                            if (!x9Var5.Z1) {
                                if (!x9Var5.t0) {
                                    Runnable runnable = x9Var5.u1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    x9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                x9Var5.s0(true);
                                break;
                            }
                        } else {
                            x9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        tg.z0 z0Var = new tg.z0(context);
        this.k0 = z0Var;
        z0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        z0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        z0Var.setOnClickListener(new ah.g(x9Var, context, e10, i21));
        k5Var.addView(z0Var, c8.ha.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        tg.m1 m1Var2 = new tg.m1(context);
        this.M0 = m1Var2;
        m1Var2.setColorSwatch(j1Var);
        m1Var2.setRenderView(i5Var);
        m1Var2.setValueOverride(cVar);
        j1Var.c = cVar.get();
        final int i23 = 0;
        m1Var2.setOnUpdate(new Runnable() { // from class: fi.i4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i23) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        sg.j1 j1Var22 = x9Var2.j1;
                        x9Var2.C0(j1Var22);
                        sg.l0.e(i7).j(j1Var22.c);
                        break;
                    default:
                        x9Var.U0.setTypeface(sg.l0.e(i7).j);
                        break;
                }
            }
        });
        addView(m1Var2, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.E0 = frameLayout2;
        addView(frameLayout2, c8.ha.c(-1.0f, -1));
        Paint paint5 = paint;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        B0(j1Var, null, false);
        w((sg.h) sg.h.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        }
        this.x1 = new x4(x9Var, uaVar, new ai.f1(9, x9Var, uaVar));
        k2.y1 = 1;
    }

    public static void D0(tg.k2 k2Var, int i7) {
        k2Var.setAlign(i7);
        int i10 = 2;
        k2Var.getEditText().setGravity(i7 != 1 ? i7 != 2 ? 19 : 21 : 17);
        if (i7 == 1) {
            i10 = 4;
        } else if (i7 == 2 ? !hd.a0 : hd.a0) {
            i10 = 3;
        }
        k2Var.getEditText().setTextAlignment(i10);
    }

    public static void X(x9 x9Var, sg.l0 l0Var, Integer num) {
        l0Var.h(num.intValue(), true);
        l0Var.g();
        x9Var.setNewColor(num.intValue());
        x9Var.f1.setSelectedColorIndex(l0Var.d());
        x9Var.C1 = null;
    }

    public static /* synthetic */ void Y(x9 x9Var, Integer num) {
        x9Var.setNewColor(num.intValue());
        x9Var.F0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.H0 == 2 ? this.U0 : this.T0;
    }

    private int getFrameRotation() {
        int i7 = this.O0;
        if (i7 == 90) {
            return 1;
        }
        if (i7 != 180) {
            return i7 != 270 ? 0 : 3;
        }
        return 2;
    }

    private mt0 getPaintingSize() {
        mt0 mt0Var = this.q0;
        if (mt0Var != null) {
            return mt0Var;
        }
        mt0 mt0Var2 = new mt0(1080.0f, 1920.0f);
        this.q0 = mt0Var2;
        return mt0Var2;
    }

    private void setCoverPause(boolean z9) {
        int i7 = 0;
        while (true) {
            j5 j5Var = this.A0;
            if (i7 >= j5Var.getChildCount()) {
                return;
            }
            View childAt = j5Var.getChildAt(i7);
            if (childAt instanceof tg.d2) {
                ImageReceiver imageReceiver = ((tg.d2) childAt).x0;
                zg0 B = imageReceiver.B();
                org.telegram.ui.Components.v5 m10 = imageReceiver.m();
                boolean z10 = !z9;
                imageReceiver.u0 = z10;
                imageReceiver.t0 = z10;
                if (B != null) {
                    if (z9) {
                        B.stop();
                    } else {
                        B.start();
                    }
                } else if (m10 != null) {
                    m10.D = z9;
                    if (z9) {
                        m10.x(false);
                    }
                    if (z9) {
                        m10.stop();
                    } else {
                        m10.start();
                    }
                }
            }
            i7++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i7) {
        sg.j1 j1Var = this.j1;
        int i10 = j1Var.a;
        j1Var.a = i7;
        B0(j1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new k4(this, i10, i7, 0));
        duration.start();
    }

    private void setTextType(int i7) {
        this.u0 = i7;
        tg.j jVar = this.s0;
        if (jVar instanceof tg.k2) {
            ((tg.k2) jVar).setType(i7);
        }
        sg.l0 e10 = sg.l0.e(this.o1);
        e10.h = i7;
        e10.a.edit().putInt("text_type", i7).apply();
        this.U0.e(i7, true);
    }

    private void setupTabsLayout(Context context) {
        a5 a5Var = new a5(this, context);
        this.F0 = a5Var;
        final int i7 = 0;
        a5Var.setClipToPadding(false);
        this.F0.setOrientation(0);
        this.C0.addView(this.F0, c8.ha.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.Q0 = textView;
        textView.setText(hd.M0(2131747276, null).toUpperCase());
        TextView textView2 = this.Q0;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        g5 g5Var = this.p1;
        org.telegram.ui.ActionBar.r6.R(textView2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, g5Var), 7, -1), null, org.telegram.ui.ActionBar.r6.N(i10), g5Var);
        this.Q0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.Q0.setTextColor(-1);
        final int i11 = 1;
        this.Q0.setTextSize(1, 14.0f);
        this.Q0.setGravity(1);
        this.Q0.setTypeface(org.telegram.messenger.g0.o());
        this.Q0.setSingleLine();
        this.Q0.setOnClickListener(new View.OnClickListener(this) { // from class: fi.d4
            public final /* synthetic */ o5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        o5 o5Var = this.b;
                        if (!o5Var.t0) {
                            o5Var.O0(0);
                            break;
                        } else {
                            o5Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        o5 o5Var2 = this.b;
                        o5Var2.O0(2);
                        if (!(o5Var2.s0 instanceof tg.k2)) {
                            o5Var2.U1 = true;
                            o5Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.F0.addView(this.Q0, c8.ha.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.R0 = textView3;
        textView3.setText(hd.M0(2131747275, null).toUpperCase());
        org.telegram.ui.ActionBar.r6.R(this.R0, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, g5Var), 7, -1), null, org.telegram.ui.ActionBar.r6.N(i10), g5Var);
        this.R0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.R0.setOnClickListener(new View.OnClickListener(this) { // from class: fi.d4
            public final /* synthetic */ o5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        o5 o5Var = this.b;
                        if (!o5Var.t0) {
                            o5Var.O0(0);
                            break;
                        } else {
                            o5Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        o5 o5Var2 = this.b;
                        o5Var2.O0(2);
                        if (!(o5Var2.s0 instanceof tg.k2)) {
                            o5Var2.U1 = true;
                            o5Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.R0.setTextColor(-1);
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(org.telegram.messenger.g0.o());
        this.R0.setAlpha(0.6f);
        this.R0.setSingleLine();
        this.F0.addView(this.R0, c8.ha.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.S0 = textView4;
        textView4.setText(hd.M0(2131747274, null).toUpperCase());
        org.telegram.ui.ActionBar.r6.R(this.S0, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, g5Var), 7, -1), null, org.telegram.ui.ActionBar.r6.N(i10), g5Var);
        this.S0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.S0.setTextColor(-1);
        this.S0.setTextSize(1, 14.0f);
        this.S0.setGravity(1);
        this.S0.setTypeface(org.telegram.messenger.g0.o());
        this.S0.setAlpha(0.6f);
        this.S0.setSingleLine();
        final int i12 = 2;
        this.S0.setOnClickListener(new View.OnClickListener(this) { // from class: fi.d4
            public final /* synthetic */ o5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        o5 o5Var = this.b;
                        if (!o5Var.t0) {
                            o5Var.O0(0);
                            break;
                        } else {
                            o5Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        o5 o5Var2 = this.b;
                        o5Var2.O0(2);
                        if (!(o5Var2.s0 instanceof tg.k2)) {
                            o5Var2.U1 = true;
                            o5Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.F0.addView(this.S0, c8.ha.l(1.0f, 0, -2));
    }

    public static boolean u0(TLRPC.Document document) {
        if (document != null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    @Override // tg.g1
    public final void A() {
        K0(new m4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final boolean A0(tg.j jVar, boolean z9) {
        boolean z10;
        fb fbVar;
        fb fbVar2;
        ii0 ii0Var;
        int i7;
        boolean z11 = jVar instanceof tg.k2;
        int i10 = 2;
        if (z11 && (((i7 = this.I0) == -1 && this.H0 != 2) || (i7 != -1 && i7 != 2))) {
            ValueAnimator valueAnimator = this.K0;
            if (valueAnimator != null && i7 != 2) {
                valueAnimator.cancel();
            }
            if (this.k1) {
                F0(false);
            }
            O0(2);
        }
        boolean z12 = true;
        if (z11 && z9) {
            tg.k2 k2Var = (tg.k2) jVar;
            int gravity = k2Var.getEditText().getGravity();
            if (gravity == 17) {
                i10 = 1;
            } else if (gravity != 21) {
                i10 = 0;
            }
            tg.e1 e1Var = this.U0;
            e1Var.setAlignment(i10);
            sg.b0 typeface = k2Var.getTypeface();
            if (typeface != null) {
                e1Var.setTypeface(typeface.a);
            }
            e1Var.e(k2Var.getType(), true);
            this.D0.invalidate();
        }
        tg.j jVar2 = this.s0;
        if (jVar2 == null) {
            z10 = false;
        } else {
            if (jVar2 == jVar) {
                if (!jVar.d0) {
                    if (jVar instanceof tg.n0) {
                        tg.n0 n0Var = (tg.n0) jVar;
                        n0Var.setType((n0Var.getType() + 1) % n0Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof tg.l2) {
                        tg.l2 l2Var = (tg.l2) jVar;
                        l2Var.setType((l2Var.getType() + 1) % l2Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof tg.k0) {
                        tg.k0 k0Var = (tg.k0) jVar;
                        tg.i0 i0Var = k0Var.q0;
                        if (i0Var.e()) {
                            i0Var.setPreviewType(i0Var.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        k0Var.setType(k0Var.getNextType());
                        return true;
                    }
                    if (!this.t0) {
                        if (jVar instanceof tg.k2) {
                            this.v0 = true;
                            o0();
                            return true;
                        }
                        if (!(jVar instanceof tg.q1)) {
                            J0(jVar2);
                            return true;
                        }
                        tg.q1 q1Var = (tg.q1) jVar;
                        if (this.L1 && this.J1 == jVar) {
                            q1Var.q(true);
                            return true;
                        }
                        tg.q1 q1Var2 = this.J1;
                        if (q1Var2 != null && q1Var2 != q1Var && (ii0Var = this.I1) != null) {
                            ii0Var.animate().alpha(0.0f).setListener(new bi.t5(ii0Var, 20));
                            this.I1 = null;
                            this.L1 = false;
                            this.K1 = 0.0f;
                        }
                        if (this.I1 == null) {
                            ii0 ii0Var2 = new ii0(2, this.o1, getContext(), LaunchActivity.Q(), new di.m2(6, new di.b()));
                            this.I1 = ii0Var2;
                            org.telegram.ui.Components.ca caVar = new org.telegram.ui.Components.ca(this.N1, ii0Var2, 0, false);
                            this.I1.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                            this.v1.addView(this.I1, c8.ha.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.a.o(-16777216, 120));
                            this.I1.setDelegate(new a8.r7(this, caVar, paint));
                            this.I1.p(null, null, true);
                        }
                        this.I1.setFragment(LaunchActivity.Q());
                        this.J1 = q1Var;
                        L0(true);
                        return true;
                    }
                    if (jVar2 instanceof tg.k2) {
                        org.telegram.messenger.g0.K3(((tg.k2) jVar2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            tg.j jVar3 = this.s0;
            if (jVar3 instanceof tg.k2) {
                tg.k2 k2Var2 = (tg.k2) jVar3;
                tg.j2 j2Var = k2Var2.q0;
                j2Var.clearFocus();
                j2Var.setEnabled(false);
                j2Var.setClickable(false);
                k2Var2.m();
                if (!z11) {
                    this.t0 = false;
                    org.telegram.messenger.g0.v1(((tg.k2) this.s0).getFocusedView());
                    s0(false);
                }
            } else if ((jVar3 instanceof tg.r1) && (fbVar2 = ((x9) this).j2.Z0) != null) {
                fbVar2.l(false);
            }
            z10 = true;
        }
        tg.j jVar4 = this.s0;
        this.s0 = jVar;
        if ((jVar4 instanceof tg.k2) && TextUtils.isEmpty(((tg.k2) jVar4).getText())) {
            z0(jVar4);
        }
        tg.j jVar5 = this.s0;
        if (jVar4 != jVar5 && (jVar5 instanceof tg.r1) && (fbVar = ((x9) this).j2.Z0) != null) {
            fbVar.l(true);
        }
        tg.j jVar6 = this.s0;
        cb.c cVar = this.N0;
        sg.j1 j1Var = this.j1;
        tg.m1 m1Var = this.M0;
        if (jVar6 != null) {
            v4 v4Var = this.z0;
            jVar6.m0 = v4Var;
            jVar6.l(v4Var, true);
            tg.j jVar7 = this.s0;
            if (jVar7 instanceof tg.k2) {
                tg.k2 k2Var3 = (tg.k2) jVar7;
                k2Var3.getSwatch().c = j1Var.c;
                k2Var3.z0 = false;
                C0(k2Var3.getSwatch());
                m1Var.setValueOverride(new y4(k2Var3, (int) (this.q0.a / 9.0f), 0));
                m1Var.setShowPreview(false);
            } else {
                m1Var.setValueOverride(cVar);
                m1Var.setShowPreview(true);
                j1Var.c = cVar.get();
                B0(j1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.K0;
            if (valueAnimator2 != null && this.I0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.k1) {
                F0(false);
            }
            O0(0);
            m1Var.setValueOverride(cVar);
            m1Var.setShowPreview(true);
            j1Var.c = cVar.get();
            B0(j1Var, null, false);
            z12 = z10;
        }
        R0();
        return z12;
    }

    public final void B0(sg.j1 j1Var, Integer num, boolean z9) {
        sg.j1 j1Var2 = this.j1;
        if (j1Var2 != j1Var) {
            j1Var2.a = j1Var.a;
            j1Var2.b = j1Var.b;
            j1Var2.c = j1Var.c;
            int i7 = this.o1;
            sg.l0.e(i7).h(j1Var.a, true);
            sg.l0.e(i7).j(j1Var.c);
        }
        int i10 = j1Var.a;
        i5 i5Var = this.x0;
        i5Var.setColor(i10);
        i5Var.setBrushSize(j1Var.c);
        int i11 = j1Var2.a;
        int i12 = 0;
        if (num == null || num.intValue() == i11) {
            k5 k5Var = this.C0;
            if (k5Var != null) {
                k5Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new e4(this, num, i11, i12));
            duration.start();
        }
        tg.j jVar = this.s0;
        if (jVar instanceof tg.k2) {
            ((tg.k2) jVar).setSwatch(new sg.j1(j1Var.b, j1Var.c, j1Var.a));
            return;
        }
        if (z9 && (jVar instanceof tg.n0)) {
            ((tg.n0) jVar).setColor(j1Var.a);
            ((tg.n0) this.s0).setType(3);
        } else if (z9 && (jVar instanceof tg.l2)) {
            ((tg.l2) jVar).setColor(j1Var.a);
            ((tg.l2) this.s0).setType(3);
        } else if (z9 && (jVar instanceof tg.k0)) {
            ((tg.k0) jVar).setColor(j1Var.a);
            ((tg.k0) this.s0).setType(0);
        }
    }

    public final void C0(sg.j1 j1Var) {
        B0(j1Var, null, false);
    }

    @Override // tg.c1
    public final void D() {
        M0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, android.view.ViewGroup, fi.j5] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void E0() {
        int i7;
        float f10;
        org.telegram.messenger.f6[] f6VarArr;
        tg.j jVar;
        tg.j jVar2;
        ArrayList arrayList = this.z1;
        if (arrayList == null) {
            return;
        }
        e7 e7Var = this.y1;
        this.y1 = null;
        this.z1 = null;
        int size = arrayList.size();
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            ?? r14 = this.A0;
            if (i10 >= size) {
                r14.setVisibility(z9 ? 1 : 0);
                return;
            }
            h20 h20Var = (h20) arrayList.get(i10);
            byte b10 = h20Var.a;
            if (b10 == 0) {
                f5 k02 = k0(h20Var.C, h20Var.B);
                if ((2 & h20Var.b) != 0) {
                    k02.r(z9);
                }
                ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                layoutParams.width = h20Var.q;
                layoutParams.height = h20Var.r;
                i7 = size;
                jVar2 = k02;
            } else if (b10 == 1) {
                tg.k2 l02 = l0(z9);
                l02.setType(h20Var.b);
                l02.setTypeface(h20Var.n);
                l02.setBaseFontSize(h20Var.m);
                SpannableString spannableString = new SpannableString(h20Var.j);
                ?? r42 = h20Var.k;
                int size2 = r42.size();
                for (?? r62 = z9; r62 < size2; r62++) {
                    g20 g20Var = (g20) r42.get(r62);
                    org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(g20Var.document_id, 1.0f, l02.getFontMetricsInt());
                    int i11 = g20Var.offset;
                    spannableString.setSpan(r5Var, i11, g20Var.length + i11, 33);
                    size = size;
                }
                i7 = size;
                CharSequence m10 = org.telegram.messenger.i6.m(spannableString, l02.getFontMetricsInt(), false, null, 0);
                if ((m10 instanceof Spanned) && (f6VarArr = (org.telegram.messenger.f6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.f6.class)) != null) {
                    for (org.telegram.messenger.f6 f6Var : f6VarArr) {
                        f6Var.b = 0.85f;
                    }
                }
                l02.setText(m10);
                D0(l02, h20Var.p);
                sg.j1 swatch = l02.getSwatch();
                swatch.a = h20Var.l;
                l02.setSwatch(swatch);
                jVar2 = l02;
            } else {
                i7 = size;
                if (b10 == 2) {
                    tg.n1 h02 = h0(h20Var.j, false);
                    h02.G0 = h20Var.u;
                    h02.B0 = false;
                    if ((2 & h20Var.b) != 0) {
                        h02.r(false);
                    }
                    if ((h20Var.b & 16) != 0) {
                        h02.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                    layoutParams2.width = h20Var.q;
                    layoutParams2.height = h20Var.r;
                    jVar2 = h02;
                } else {
                    if (b10 == 6) {
                        ArrayList arrayList2 = e7Var.v;
                        boolean z10 = e7Var.K;
                        this.U1 = true;
                        f10 = 1.0f;
                        tg.j e5Var = new e5(this, getContext(), c0(), arrayList2, this.N1, z10, this.O1);
                        e5Var.setDelegate(this);
                        r14.addView(e5Var);
                        d0();
                        jVar = e5Var;
                        if (h20Var.q > 0) {
                            jVar = e5Var;
                            if (h20Var.r > 0) {
                                ViewGroup.LayoutParams layoutParams3 = e5Var.getLayoutParams();
                                layoutParams3.width = h20Var.q;
                                layoutParams3.height = h20Var.r;
                                jVar = e5Var;
                            }
                        }
                    } else {
                        f10 = 1.0f;
                        if (b10 == 3) {
                            tg.n0 g02 = g0(h20Var.N, h20Var.M);
                            int i12 = h20Var.l;
                            if (i12 != 0) {
                                g02.setColor(i12);
                            }
                            g02.setType(h20Var.b);
                            jVar = g02;
                        } else if (b10 == 8) {
                            sb sbVar = h20Var.O;
                            if (sbVar == null) {
                                i10++;
                                size = i7;
                                z9 = false;
                            } else {
                                tg.l2 m0 = m0(sbVar);
                                int i13 = h20Var.l;
                                if (i13 != 0) {
                                    m0.setColor(i13);
                                }
                                m0.setType(h20Var.b);
                                jVar = m0;
                            }
                        } else if (b10 == 7) {
                            tg.k0 f02 = f0(h20Var.W);
                            tg.i0 i0Var = f02.q0;
                            int i14 = h20Var.l;
                            if (i14 != 0) {
                                f02.setColor(i14);
                            }
                            boolean e10 = i0Var.e();
                            int i15 = i0Var.h;
                            int i16 = i0Var.f;
                            if (e10) {
                                i0Var.setPreviewType(h20Var.b);
                            }
                            byte b11 = h20Var.b;
                            if (b11 == -1) {
                                f02.setType(3);
                                i0Var.d();
                                h20Var.q = ((int) Math.ceil(i0Var.a0)) + i16 + i16;
                                h20Var.r = ((int) Math.ceil(i0Var.b0)) + i15 + i15;
                                PointF position = f02.getPosition();
                                position.y = (this.B1 * 0.3f) + position.y;
                                f02.setPosition(position);
                                i10++;
                                size = i7;
                                z9 = false;
                            } else {
                                f02.setType(b11);
                                jVar = f02;
                            }
                        } else if (b10 == 4) {
                            tg.q1 i02 = i0(false);
                            i02.s(ch.o0.d(h20Var.M.reaction), false);
                            if (h20Var.M.flipped) {
                                i02.r(false);
                            }
                            jVar = i02;
                            if (h20Var.M.dark) {
                                i02.q(false);
                                jVar = i02;
                            }
                        } else {
                            if (b10 == 5 && e7Var.o0 != null) {
                                tg.r1 j02 = j0(e7Var.p0, false);
                                va vaVar = ((x9) this).j2;
                                ja jaVar = vaVar.X0;
                                if (jaVar != null) {
                                    jaVar.x = j02;
                                    t51 t51Var = jaVar.y;
                                    if (t51Var != null) {
                                        t51Var.A0(j02.u0);
                                    }
                                }
                                la laVar = vaVar.c1;
                                if (laVar != null) {
                                    laVar.setHasRoundVideo(true);
                                }
                                jVar = j02;
                                if ((h20Var.b & 2) != 0) {
                                    boolean z11 = !j02.r0;
                                    j02.r0 = z11;
                                    j02.s0.f(z11, true);
                                    j02.invalidate();
                                    jVar = j02;
                                }
                            }
                            i10++;
                            size = i7;
                            z9 = false;
                        }
                    }
                    jVar.setX((h20Var.c * this.A1) - (((f10 - h20Var.v) * h20Var.q) / 2.0f));
                    jVar.setY((h20Var.d * this.B1) - (((f10 - h20Var.v) * h20Var.r) / 2.0f));
                    jVar.setPosition(new PointF((h20Var.q / 2.0f) + jVar.getX(), (h20Var.r / 2.0f) + jVar.getY()));
                    jVar.setScale(h20Var.v);
                    jVar.setRotation((float) (((-h20Var.e) / 3.141592653589793d) * 180.0d));
                    i10++;
                    size = i7;
                    z9 = false;
                }
            }
            f10 = 1.0f;
            jVar = jVar2;
            jVar.setX((h20Var.c * this.A1) - (((f10 - h20Var.v) * h20Var.q) / 2.0f));
            jVar.setY((h20Var.d * this.B1) - (((f10 - h20Var.v) * h20Var.r) / 2.0f));
            jVar.setPosition(new PointF((h20Var.q / 2.0f) + jVar.getX(), (h20Var.r / 2.0f) + jVar.getY()));
            jVar.setScale(h20Var.v);
            jVar.setRotation((float) (((-h20Var.e) / 3.141592653589793d) * 180.0d));
            i10++;
            size = i7;
            z9 = false;
        }
    }

    public final void F0(final boolean z9) {
        if (this.k1 != z9) {
            this.k1 = z9;
            r1.g gVar = this.l1;
            if (gVar != null) {
                gVar.d();
            }
            r1.g gVar2 = new r1.g(new r1.f(z9 ? 0.0f : 1000.0f));
            this.l1 = gVar2;
            r1.h hVar = new r1.h();
            hVar.i = z9 ? 1000.0f : 0.0f;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.m = hVar;
            int i7 = 0;
            final boolean[] zArr = {this.x1.c() || this.c2 > 0};
            final float translationY = this.C0.getTranslationY();
            final float alpha = this.k0.getAlpha();
            final ViewGroup barView = getBarView();
            this.l1.b(new r1.d() { // from class: fi.f4
                @Override // r1.d
                public final void a(r1.g gVar3, float f10, float f11) {
                    o5 o5Var = o5.this;
                    k5 k5Var = o5Var.C0;
                    float f12 = f10 / 1000.0f;
                    o5Var.m1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(o5Var.m1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(o5Var.m1, 0.25f) / 0.25f));
                    w4 w4Var = o5Var.f1;
                    float f14 = o5Var.m1;
                    boolean z10 = z9;
                    w4Var.B1(z10, f14);
                    tg.z0 z0Var = o5Var.k0;
                    z0Var.setProgress(o5Var.m1);
                    tg.v0 v0Var = o5Var.j0;
                    v0Var.setProgress(o5Var.m1);
                    o5Var.F0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * o5Var.m1);
                    AnimatorSet animatorSet = o5Var.w1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f15 = o5Var.m1;
                        if (!z10) {
                            f15 = 1.0f - f15;
                        }
                        float f16 = z10 ? 1.0f : 0.0f;
                        float f17 = alpha;
                        z0Var.setAlpha(org.telegram.messenger.g0.T1(f17, f16, f15));
                        v0Var.setAlpha(org.telegram.messenger.g0.T1(f17, z10 ? 1.0f : 0.0f, f15));
                        k5Var.setTranslationY(translationY - ((org.telegram.messenger.g0.L(39.0f) * f15) * (z10 ? 1 : -1)));
                    }
                    k5Var.invalidate();
                    if (view == o5Var.U0) {
                        o5Var.D0.invalidate();
                    }
                }
            });
            this.l1.a(new g4(this, z9, i7));
            this.l1.h();
            if (z9) {
                w4 w4Var = this.f1;
                w4Var.setVisibility(0);
                w4Var.setSelectedColorIndex(sg.l0.e(this.o1).d());
            }
        }
    }

    public final void G0(int i7) {
        tg.e1 e1Var = this.U0;
        x4 x4Var = this.x1;
        int i10 = 1;
        if (i7 == 1) {
            gy gyVar = this.Y1;
            boolean z9 = gyVar != null && gyVar.getVisibility() == 0;
            gy gyVar2 = this.Y1;
            ua uaVar = this.v1;
            if (gyVar2 != null && gyVar2.c1 != p10.s0) {
                uaVar.removeView(gyVar2);
                this.Y1 = null;
            }
            if (this.Y1 == null) {
                gy gyVar3 = new gy(null, true, false, false, getContext(), false, null, null, true, this.p1, false, false);
                this.Y1 = gyVar3;
                gyVar3.x2 = false;
                gyVar3.U0 = true;
                gyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.Y1.setForseMultiwindowLayout(true);
                }
                this.Y1.setDelegate(new h5(this));
                uaVar.addView(this.Y1);
            }
            this.Y1.setVisibility(0);
            this.Z1 = true;
            gy gyVar4 = this.Y1;
            if (this.e2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.e2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.e2 = qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f2 = qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.q;
            int paddingUnderContainer = uaVar.getPaddingUnderContainer() + (point.x > point.y ? this.f2 : this.e2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            gyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                tg.j jVar = this.s0;
                if (jVar instanceof tg.k2) {
                    org.telegram.messenger.g0.v1(((tg.k2) jVar).getEditText());
                }
            }
            this.c2 = paddingUnderContainer;
            x4Var.a();
            requestLayout();
            jg emojiButton = e1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(hg.d, true);
            }
            if (!z9) {
                if (this.a2) {
                    this.d2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c2, 0.0f);
                    ofFloat.addUpdateListener(new h4(this, i10));
                    ofFloat.addListener(new z4(this, i10));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                    ofFloat.start();
                }
            }
        } else {
            jg emojiButton2 = e1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(hg.e, true);
            }
            gy gyVar5 = this.Y1;
            if (gyVar5 != null) {
                this.Z1 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    gyVar5.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.c2 = 0;
                x4Var.a();
            }
            requestLayout();
        }
        P0();
    }

    public final void H0(tg.k0 k0Var) {
        m7 m7Var = new m7(getContext(), this.p1, this.P1, new ai.f1(11, this, k0Var));
        if (k0Var != null) {
            tg.h0 h0Var = k0Var.u0;
            m7Var.U1 = true;
            org.telegram.ui.Cells.k3 k3Var = m7Var.R1;
            org.telegram.ui.Cells.k3 k3Var2 = m7Var.Q1;
            if (h0Var != null) {
                m7Var.Y1 = h0Var.d;
                m7Var.Z1 = false;
                k3Var2.setText(h0Var.c);
                k3Var.setText(h0Var.b);
                m7Var.e2 = !TextUtils.isEmpty(h0Var.b);
                m7Var.f2 = h0Var.f;
                m7Var.g2 = h0Var.e;
            } else {
                k3Var2.setText("");
                k3Var.setText("");
                m7Var.f2 = true;
                m7Var.g2 = false;
            }
            String M0 = hd.M0(2131744642, null);
            d dVar = m7Var.T1;
            dVar.i(M0, false, true);
            bi.o0 o0Var = m7Var.P1;
            if (o0Var != null) {
                o0Var.O(false);
            }
            dVar.setEnabled(m7Var.f1(k3Var2.getText().toString()));
            m7Var.U1 = false;
        }
        m7Var.setOnDismissListener(new r4(this, 1));
        m7Var.show();
        w0(true);
    }

    public final void I0(tg.n0 n0Var, v10 v10Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        di diVar = new di(getContext(), new d5(this, v10Var), false, true, false, this.p1);
        diVar.T3 = new pb.b(10);
        dh dhVar = diVar.r3;
        if (n0Var != null && (messageMedia = n0Var.u0) != null && (geoPoint = messageMedia.geo) != null) {
            diVar.u4 = new double[]{geoPoint.lat, geoPoint._long};
            diVar.F1 = true;
            dhVar.setVisibility(8);
        } else if (this.D1) {
            diVar.s4 = this.F1;
            diVar.t4 = this.E1;
            diVar.F1 = true;
            dhVar.setVisibility(8);
        } else {
            diVar.F1 = true;
            dhVar.setVisibility(8);
        }
        diVar.setOnDismissListener(new r4(this, 0));
        diVar.e1();
        diVar.show();
    }

    public final void J0(tg.j jVar) {
        if (jVar instanceof tg.u0) {
            org.telegram.ui.ActionBar.g1 g1Var = this.q1;
            if (g1Var == null || !g1Var.isShowing()) {
                return;
            }
            this.q1.d(true);
            return;
        }
        int[] iArr = this.X1;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        j5 j5Var = this.A0;
        float scaleX2 = j5Var.getScaleX() * scaleX;
        float scaleY = j5Var.getScaleY() * jVar.getScaleY() * jVar.getHeight();
        int i7 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i7;
        int i10 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i10;
        K0(new l4(this, jVar, 1), this, 51, i7, i10 - org.telegram.messenger.g0.L(32.0f), true);
    }

    @Override // org.telegram.ui.Components.qt0
    public final void K(int i7, boolean z9) {
        boolean z10;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.a2 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z9) {
                this.f2 = i7;
                qp.d1().edit().putInt("kbd_height_land3", this.f2).commit();
            } else {
                this.e2 = i7;
                qp.d1().edit().putInt("kbd_height", this.e2).commit();
            }
        }
        boolean z11 = this.Z1;
        x4 x4Var = this.x1;
        if (z11) {
            int paddingUnderContainer = this.v1.getPaddingUnderContainer() + (z9 ? this.f2 : this.e2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y1.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = org.telegram.messenger.g0.q.x;
            if (i10 != i11 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i11;
                layoutParams.height = paddingUnderContainer;
                this.Y1.setLayoutParams(layoutParams);
                this.c2 = layoutParams.height;
                x4Var.a();
                requestLayout();
            }
        }
        if (this.g2 == i7 && this.h2 == z9) {
            return;
        }
        this.g2 = i7;
        this.h2 = z9;
        boolean z12 = this.a2;
        tg.j jVar = this.s0;
        if (jVar instanceof tg.k2) {
            this.a2 = ((tg.k2) jVar).getEditText().isFocused() && x4Var.c();
        } else {
            this.a2 = false;
        }
        if (this.a2 && this.Z1) {
            G0(0);
        }
        if (this.c2 != 0 && !(z10 = this.a2) && z10 != z12 && !this.Z1) {
            this.c2 = 0;
            x4Var.a();
            requestLayout();
        }
        R0();
        if (z12 && !this.a2 && this.c2 > 0 && this.d2) {
            this.d2 = false;
        }
        P0();
    }

    public final void K0(Runnable runnable, o5 o5Var, int i7, int i10, int i11, boolean z9) {
        org.telegram.ui.ActionBar.g1 g1Var = this.q1;
        if (g1Var != null && g1Var.isShowing()) {
            this.q1.d(true);
            return;
        }
        int i12 = 0;
        if (this.r1 == null) {
            this.s1 = new Rect();
            m5 m5Var = new m5(this, getContext());
            this.r1 = m5Var;
            m5Var.setAnimationEnabled(true);
            this.r1.setOnTouchListener(new n4(0, this));
            this.r1.setDispatchKeyEventListener(new o4(this));
            this.r1.setShownFromBottom(true);
        }
        m5 m5Var2 = this.r1;
        m5Var2.W = z9;
        m5Var2.d();
        runnable.run();
        if (this.q1 == null) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(this.r1, -2, -2);
            this.q1 = g1Var2;
            g1Var2.b = true;
            g1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.q1.setOutsideTouchable(true);
            this.q1.setClippingEnabled(true);
            this.q1.setInputMethodMode(2);
            this.q1.setSoftInputMode(0);
            this.q1.getContentView().setFocusableInTouchMode(true);
            this.q1.setOnDismissListener(new p4(i12, this));
        }
        this.r1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), TLObject.FLAG_31));
        this.q1.setFocusable(true);
        int measuredWidth = i10 - (this.r1.getMeasuredWidth() / 2);
        int measuredHeight = i11 - this.r1.getMeasuredHeight();
        this.q1.showAtLocation(o5Var, i7, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.g1.i(this.r1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z9) {
            m5 m5Var3 = this.r1;
            m5Var3.setBackgroundDrawable(new org.telegram.ui.Components.ba(new org.telegram.ui.Components.ca(this.N1, m5Var3, 5, false), measuredWidth, measuredHeight, mutate, org.telegram.messenger.g0.N(8.3f)));
        } else {
            this.r1.setBackgroundDrawable(mutate);
            this.r1.setBackgroundColor(-14145495);
        }
    }

    public final void L0(boolean z9) {
        if (this.L1 != z9) {
            if (z9 || this.I1 != null) {
                this.L1 = z9;
                int i7 = 0;
                if (z9) {
                    this.I1.n();
                    this.I1.setVisibility(0);
                    this.I1.setSelectedReaction(this.J1.getCurrentReaction());
                    this.I1.getParent().bringChildToFront(this.I1);
                } else {
                    this.J1 = null;
                }
                if (!z9) {
                    if (this.I1.getReactionsWindow() != null) {
                        this.I1.getReactionsWindow().e();
                    }
                    this.I1.animate().alpha(0.0f).setDuration(150L).setListener(new z4(this, i7)).start();
                    return;
                }
                this.M1 = true;
                this.v1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K1, z9 ? 1.0f : 0.0f);
                this.I1.setTransitionProgress(this.K1);
                ofFloat.addUpdateListener(new h4(this, 2));
                ofFloat.addListener(new ch.y(11, this, z9));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(xq.g);
                ofFloat.start();
            }
        }
    }

    public final void M0(boolean z9) {
        if (this.d1 != z9) {
            this.d1 = z9;
            r1.g gVar = this.e1;
            if (gVar != null) {
                gVar.d();
            }
            r1.g gVar2 = new r1.g(new r1.f(z9 ? 0.0f : 1000.0f));
            this.e1 = gVar2;
            r1.h hVar = new r1.h();
            hVar.i = z9 ? 1000.0f : 0.0f;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.m = hVar;
            if (z9) {
                tg.j1 j1Var = this.V0;
                j1Var.setAlpha(0.0f);
                j1Var.setVisibility(0);
            }
            int i7 = 1;
            this.e1.b(new di.a8(i7, this));
            this.e1.a(new g4(this, z9, i7));
            this.e1.h();
        }
    }

    public final PointF N0(tg.j jVar) {
        float f10;
        float f11;
        ye yeVar = this.o0;
        float f12 = yeVar != null ? 200.0f / yeVar.c : 200.0f;
        float f13 = 0.2f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f14 = yeVar != null ? 100.0f / yeVar.c : 100.0f;
        PointF c02 = c0();
        int i7 = 0;
        while (i7 < 10) {
            int i10 = 0;
            boolean z9 = false;
            while (true) {
                j5 j5Var = this.A0;
                if (i10 >= j5Var.getChildCount()) {
                    break;
                }
                View childAt = j5Var.getChildAt(i10);
                if (!(childAt instanceof tg.j) || (childAt instanceof tg.u0)) {
                    f10 = f13;
                    f11 = f14;
                } else {
                    PointF position2 = ((tg.j) childAt).getPosition();
                    f10 = f13;
                    f11 = f14;
                    if (((float) Math.sqrt(Math.pow(position2.y - c02.y, 2.0d) + Math.pow(position2.x - c02.x, 2.0d))) < f11) {
                        f12 = Math.min(childAt.getHeight(), childAt.getWidth()) * f10;
                        z9 = true;
                    }
                }
                i10++;
                f14 = f11;
                f13 = f10;
            }
            float f15 = f13;
            float f16 = f14;
            if (!z9) {
                break;
            }
            i7++;
            c02 = new PointF(c02.x + f12, c02.y + f12);
            f13 = f15;
            f14 = f16;
        }
        return c02;
    }

    public final void O0(int i7) {
        if (this.H0 == i7 || this.I0 == i7) {
            return;
        }
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = this.H0;
        ViewGroup viewGroup = this.U0;
        ViewGroup viewGroup2 = this.T0;
        ViewGroup viewGroup3 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        this.I0 = i7;
        ViewGroup viewGroup4 = i7 == 0 ? viewGroup2 : i7 == 2 ? viewGroup : null;
        int i11 = this.o1;
        sg.l0 e10 = sg.l0.e(i11);
        int i12 = 1;
        boolean z9 = i7 == 2;
        if (e10.l != z9) {
            e10.l = z9;
            if (z9) {
                e10.i(-1, false);
            } else {
                e10.i(e10.a.getInt("brush", 0), false);
            }
        }
        int c10 = sg.l0.e(i11).c();
        sg.j1 j1Var = this.j1;
        j1Var.a = c10;
        B0(j1Var, null, false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.K0 = duration;
        duration.setInterpolator(xq.f);
        this.K0.addUpdateListener(new di.g3(this, viewGroup3, viewGroup4, i12));
        this.K0.addListener(new b5(this, viewGroup3, viewGroup4, i7, 0));
        this.K0.start();
    }

    public final void P0() {
        x4 x4Var = this.x1;
        tg.e1 e1Var = this.U0;
        if (e1Var != null) {
            if (x4Var.c()) {
                e1Var.a(R.drawable.input_smile);
            } else if (this.Z1) {
                e1Var.a(R.drawable.input_keyboard);
            } else {
                e1Var.a(R.drawable.msg_add);
            }
        }
        boolean z9 = x4Var.c() || this.Z1;
        boolean z10 = !z9;
        org.telegram.messenger.g0.U3(1.0f, this.X0, z10, false);
        org.telegram.messenger.g0.U3(1.0f, this.W0, z10, false);
        org.telegram.messenger.g0.U3(1.0f, this.Z0, z9, false);
        org.telegram.messenger.g0.U3(1.0f, this.Y0, z9, false);
    }

    @Override // org.telegram.ui.Components.st0, org.telegram.ui.Components.rt0
    public final int Q() {
        return this.x1.l - this.v1.getBottomPadding2();
    }

    public final void Q0() {
        tg.j jVar;
        ObjectAnimator objectAnimator = this.R1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.x0.getParent();
        if (view == null) {
            return;
        }
        x4 x4Var = this.x1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!x4Var.c() || x4Var.d) && this.c2 <= 0) || (jVar = this.s0) == null) ? 0.0f : view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.R1 = ofFloat;
        ofFloat.setDuration(350L);
        this.R1.setInterpolator(xq.h);
        this.R1.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0() {
        boolean z9;
        if (this.s0 instanceof tg.k2) {
            x4 x4Var = this.x1;
            if ((x4Var.c() || this.c2 > 0) && !x4Var.d) {
                z9 = true;
                View view = this.G0;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(!z9 ? 1.0f : 0.0f).withEndAction(new bi.k1(7, this, z9)).start();
            }
        }
        z9 = false;
        View view2 = this.G0;
        view2.animate().cancel();
        view2.setVisibility(0);
        view2.animate().alpha(!z9 ? 1.0f : 0.0f).withEndAction(new bi.k1(7, this, z9)).start();
    }

    @Override // tg.g1, tg.c1
    public final void a() {
        F0(true);
    }

    @Override // org.telegram.ui.Components.rt0, org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ui));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a7));
    }

    @Override // tg.c1
    public final void b() {
        setTextType((this.u0 + 1) % 4);
    }

    public final void b0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new f2.h(5, this, view)).start();
    }

    @Override // tg.c1
    public final void c(int i7) {
        tg.j jVar = this.s0;
        if (jVar instanceof tg.k2) {
            D0((tg.k2) jVar, i7);
            sg.l0 e10 = sg.l0.e(this.o1);
            e10.g = i7;
            e10.a.edit().putInt("text_alignment", i7).apply();
        }
    }

    public final PointF c0() {
        j5 j5Var = this.A0;
        int measuredWidth = j5Var.getMeasuredWidth();
        int measuredHeight = j5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.A1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.B1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    public final void d0() {
        boolean z9 = this.F1;
        j5 j5Var = this.A0;
        boolean z10 = true;
        if (!z9 && !this.H1) {
            int i7 = 0;
            loop0: while (true) {
                if (i7 >= j5Var.getChildCount()) {
                    z10 = false;
                    break;
                }
                View childAt = j5Var.getChildAt(i7);
                boolean z11 = childAt instanceof tg.k2;
                int i10 = this.o1;
                if (z11) {
                    CharSequence text = ((tg.k2) childAt).getText();
                    if (text instanceof Spanned) {
                        for (org.telegram.ui.Components.r5 r5Var : (org.telegram.ui.Components.r5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.r5.class)) {
                            TLRPC.Document document = r5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.i5.e(i10, r5Var.getDocumentId());
                            }
                            if (document != null) {
                                org.telegram.ui.Components.i5.g(i10).e(document);
                            }
                            org.telegram.messenger.w7.G(i10);
                            if (e7.u(document, org.telegram.messenger.w7.J(document, null, true, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i7++;
                } else if (childAt instanceof tg.d2) {
                    TLRPC.Document sticker = ((tg.d2) childAt).getSticker();
                    org.telegram.messenger.w7.G(i10);
                    if (e7.u(sticker, org.telegram.messenger.w7.J(sticker, null, true, true).getAbsolutePath())) {
                        break;
                    } else {
                        i7++;
                    }
                } else if (childAt instanceof tg.r1) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        for (int i11 = 0; i11 < j5Var.getChildCount(); i11++) {
            View childAt2 = j5Var.getChildAt(i11);
            if (childAt2 instanceof tg.j) {
                ((tg.j) childAt2).setIsVideo(z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.V1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ye yeVar;
        if ((view == this.x0 || view == this.y0 || view == this.A0 || view == this.z0) && (yeVar = this.o0) != null) {
            canvas.save();
            r1 = this.w0 ? 0 : org.telegram.messenger.g0.m;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i7 = yeVar.k;
            if (i7 != 90 && i7 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * yeVar.e)) / yeVar.c);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * yeVar.f)) / yeVar.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + r1 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            r1 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (r1 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final TextView e0(int i7, String str) {
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, this.p1);
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i7));
        textView.setText(str);
        return textView;
    }

    @Override // tg.h
    public final void f(tg.j jVar) {
        L0(false);
        J0(jVar);
    }

    public final tg.k0 f0(tg.h0 h0Var) {
        int i7;
        this.U1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        j5 j5Var = this.A0;
        float measuredWidth = j5Var.getMeasuredWidth() <= 0 ? this.A1 : j5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.k0 k0Var = new tg.k0(getContext(), N0, this.o1, h0Var, measuredWidth / 360.0f, L);
        if (N0.x == j5Var.getMeasuredWidth() / 2.0f) {
            k0Var.setStickyX(2);
        }
        if (N0.y == j5Var.getMeasuredHeight() / 2.0f) {
            k0Var.setStickyY(2);
        }
        sg.j1 j1Var = this.j1;
        if (j1Var != null && (i7 = j1Var.a) != -47814) {
            k0Var.setColor(i7);
        }
        k0Var.setDelegate(this);
        k0Var.setMaxWidth(L);
        j5Var.addView(k0Var, c8.ha.c(-2.0f, -2));
        d0();
        ye yeVar = this.o0;
        if (yeVar != null) {
            k0Var.j(1.0f / yeVar.c);
            k0Var.f(-(yeVar.k + yeVar.d));
        }
        return k0Var;
    }

    public final tg.n0 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i7;
        this.U1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        j5 j5Var = this.A0;
        float measuredWidth = j5Var.getMeasuredWidth() <= 0 ? this.A1 : j5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.n0 n0Var = new tg.n0(getContext(), N0, this.o1, messageMedia, mediaArea, measuredWidth / 240.0f, L);
        if (N0.x == j5Var.getMeasuredWidth() / 2.0f) {
            n0Var.setStickyX(2);
        }
        if (N0.y == j5Var.getMeasuredHeight() / 2.0f) {
            n0Var.setStickyY(2);
        }
        sg.j1 j1Var = this.j1;
        if (j1Var != null && (i7 = j1Var.a) != -47814) {
            n0Var.setColor(i7);
        }
        n0Var.setDelegate(this);
        n0Var.setMaxWidth(L);
        j5Var.addView(n0Var, c8.ha.c(-2.0f, -2));
        d0();
        ye yeVar = this.o0;
        if (yeVar != null) {
            n0Var.j(1.0f / yeVar.c);
            n0Var.f(-(yeVar.k + yeVar.d));
        }
        return n0Var;
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.x0.c(true, false);
    }

    public View getBottomLayout() {
        return this.C0;
    }

    public View getCancelView() {
        return this.j0;
    }

    public float getCropRotation() {
        ye yeVar = this.o0;
        if (yeVar != null) {
            return yeVar.d + yeVar.k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.k0;
    }

    public View getEntitiesView() {
        return this.A0;
    }

    public long getLcm() {
        return this.P0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.r5[] r5VarArr;
        j5 j5Var = this.A0;
        int childCount = j5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = j5Var.getChildAt(i7);
            if (childAt instanceof tg.d2) {
                TLRPC.Document sticker = ((tg.d2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof tg.k2) {
                CharSequence text = ((tg.k2) childAt).getText();
                if ((text instanceof Spanned) && (r5VarArr = (org.telegram.ui.Components.r5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.r5.class)) != null) {
                    for (org.telegram.ui.Components.r5 r5Var : r5VarArr) {
                        if (r5Var != null) {
                            TLRPC.Document document = r5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.i5.e(this.o1, r5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = document.id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return 0.0f;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.x0, this.y0, this.A0, this.z0);
    }

    public View getRenderInputView() {
        return this.y0;
    }

    public sg.w0 getRenderView() {
        return this.x0;
    }

    public tg.j getSelectedEntity() {
        return this.s0;
    }

    public View getSelectionEntitiesView() {
        return this.z0;
    }

    public View getTextDimView() {
        return this.G0;
    }

    public View getTopLayout() {
        return this.B0;
    }

    public View getWeightChooserView() {
        return this.M0;
    }

    public final tg.n1 h0(String str, boolean z9) {
        float f10;
        mt0 mt0Var;
        this.U1 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            f10 = 1.0f;
        }
        j5 j5Var = this.A0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.A1, j5Var.getMeasuredWidth()) * 0.5d);
            mt0Var = new mt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.B1, j5Var.getMeasuredHeight()) * 0.5d);
            mt0Var = new mt0(f10 * floor2, floor2);
        }
        mt0 mt0Var2 = mt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = mt0Var2.a;
            mt0Var2.a = mt0Var2.b;
            mt0Var2.b = f11;
        }
        Context context = getContext();
        PointF c02 = c0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        tg.n1 n1Var = new tg.n1(context, c02, mt0Var2, str, intValue);
        n1Var.setDelegate(this);
        j5Var.addView(n1Var);
        d0();
        return n1Var;
    }

    @Override // fi.ra
    public final boolean i(MotionEvent motionEvent) {
        if (this.V1) {
            return false;
        }
        if (this.s0 != null) {
            A0(null, true);
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y10);
        this.x0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final tg.q1 i0(boolean z9) {
        String str;
        mt0 mt0Var = new mt0(org.telegram.messenger.g0.L(106.0f), org.telegram.messenger.g0.L(106.0f));
        PointF c02 = c0();
        j5 j5Var = this.A0;
        if (j5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i7 = 0; i7 < j5Var.getChildCount(); i7++) {
                    View childAt = j5Var.getChildAt(i7);
                    if (a8.r9.a(c02.x, c02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < org.telegram.messenger.g0.L(6.0f)) {
                        break;
                    }
                }
                c02.x = (j5Var.getMeasuredWidth() * 0.05f) + c02.x;
                c02.y = (j5Var.getMeasuredHeight() * 0.05f) + c02.y;
                c02.x = Utilities.i(c02.x, j5Var.getMeasuredWidth(), 0.0f);
                c02.y = Utilities.i(c02.y, j5Var.getMeasuredHeight(), 0.0f);
            }
        }
        tg.q1 q1Var = new tg.q1(getContext(), c02);
        q1Var.r0 = new di.v8(q1Var);
        q1Var.s0 = new di.v8(q1Var);
        q1Var.t0 = new ch.f0(q1Var);
        q1Var.u0 = new ch.f0(q1Var);
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(q1Var);
        q1Var.w0 = w5Var;
        org.telegram.ui.Components.w5 w5Var2 = new org.telegram.ui.Components.w5(q1Var);
        q1Var.x0 = w5Var2;
        q1Var.z0 = 1.0f;
        q1Var.q0 = mt0Var;
        w5Var2.e(true, 1.0f);
        w5Var.e(true, 1.0f);
        ArrayList arrayList = ui.b0(p10.s0).h;
        ch.f0 f0Var = q1Var.t0;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                str = ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
                break;
            }
            if (((TLRPC.TL_availableReaction) arrayList.get(i10)).title.equals("Red Heart")) {
                str = ((TLRPC.TL_availableReaction) arrayList.get(i10)).reaction;
                break;
            }
            i10++;
        }
        ch.o0 b10 = ch.o0.b(str);
        q1Var.v0 = b10;
        f0Var.e(b10);
        q1Var.k();
        q1Var.setDelegate(this);
        j5Var.addView(q1Var);
        d0();
        if (z9) {
            y0(q1Var);
            A0(q1Var, true);
        }
        return q1Var;
    }

    public final tg.r1 j0(String str, boolean z9) {
        this.U1 = true;
        this.W1 = true;
        n0();
        j5 j5Var = this.A0;
        int measuredWidth = j5Var.getMeasuredWidth();
        j5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.A1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        mt0 mt0Var = new mt0(floor, floor);
        tg.r1 r1Var = new tg.r1(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - org.telegram.messenger.g0.L(16.0f), (mt0Var.b / 2.0f) + org.telegram.messenger.g0.L(72.0f)), mt0Var, str);
        r1Var.setDelegate(this);
        j5Var.addView(r1Var);
        d0();
        if (z9) {
            y0(r1Var);
            post(new c4(this, r1Var, 0));
        }
        this.W1 = false;
        return r1Var;
    }

    public final f5 k0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i7 = 0; i7 < document.attributes.size() && !(document.attributes.get(i7) instanceof TLRPC.TL_documentAttributeSticker); i7++) {
        }
        float f11 = 0.75f;
        ye yeVar = this.o0;
        if (yeVar != null) {
            f10 = -(yeVar.k + yeVar.d);
            f11 = 0.75f / yeVar.c;
        } else {
            f10 = 0.0f;
        }
        n5 n5Var = new n5(c0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        f5 f5Var = new f5(this, context, n5Var.a, n5Var.c, n5Var.b, new mt0(floor, floor), document, obj);
        boolean D4 = ij.D4(document);
        ImageReceiver imageReceiver = f5Var.x0;
        if (D4) {
            imageReceiver.o1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.E0(12);
        f5Var.setDelegate(this);
        this.A0.addView(f5Var);
        d0();
        return f5Var;
    }

    public final tg.k2 l0(boolean z9) {
        mt0 paintingSize = getPaintingSize();
        PointF N0 = N0(null);
        tg.k2 k2Var = new tg.k2(getContext(), N0, (int) (paintingSize.a / 9.0f), "", this.j1, this.u0);
        float f10 = paintingSize.a / 9.0f;
        m4 m4Var = new m4(this, 0);
        k2Var.w0 = (int) (0.5f * f10);
        k2Var.x0 = (int) (f10 * 2.0f);
        k2Var.y0 = m4Var;
        float f11 = N0.x;
        j5 j5Var = this.A0;
        if (f11 == j5Var.getMeasuredWidth() / 2.0f) {
            k2Var.setStickyX(2);
        }
        if (N0.y == j5Var.getMeasuredHeight() / 2.0f) {
            k2Var.setStickyY(2);
        }
        k2Var.setDelegate(this);
        k2Var.setMaxWidth(this.A1 - org.telegram.messenger.g0.L(32.0f));
        int i7 = this.o1;
        k2Var.setTypeface(sg.l0.e(i7).j);
        k2Var.setType(sg.l0.e(i7).h);
        j5Var.addView(k2Var, c8.ha.c(-2.0f, -2));
        d0();
        ye yeVar = this.o0;
        if (yeVar != null) {
            k2Var.j(1.0f / yeVar.c);
            k2Var.f(-(yeVar.k + yeVar.d));
        }
        if (z9) {
            y0(k2Var);
            k2Var.q();
            A0(k2Var, false);
            k2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.K3(k2Var.getFocusedView());
            this.t0 = true;
            int i10 = sg.l0.e(i7).g;
            tg.e1 e1Var = this.U0;
            e1Var.d(i10, true);
            e1Var.setOutlineType(sg.l0.e(i7).h);
        }
        return k2Var;
    }

    public final tg.l2 m0(sb sbVar) {
        int i7;
        this.U1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        j5 j5Var = this.A0;
        float measuredWidth = j5Var.getMeasuredWidth() <= 0 ? this.A1 : j5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.l2 l2Var = new tg.l2(getContext(), N0, this.o1, sbVar, measuredWidth / 240.0f, L);
        if (N0.x == j5Var.getMeasuredWidth() / 2.0f) {
            l2Var.setStickyX(2);
        }
        if (N0.y == j5Var.getMeasuredHeight() / 2.0f) {
            l2Var.setStickyY(2);
        }
        sg.j1 j1Var = this.j1;
        if (j1Var != null && (i7 = j1Var.a) != -47814) {
            l2Var.setColor(i7);
        }
        l2Var.setDelegate(this);
        l2Var.setMaxWidth(L);
        j5Var.addView(l2Var, c8.ha.c(-2.0f, -2));
        d0();
        ye yeVar = this.o0;
        if (yeVar != null) {
            l2Var.j(1.0f / yeVar.c);
            l2Var.f(-(yeVar.k + yeVar.d));
        }
        return l2Var;
    }

    @Override // tg.h
    public final int[] n(tg.j jVar) {
        int i7 = (int) jVar.getPosition().x;
        int[] iArr = this.X1;
        iArr[0] = i7;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final void n0() {
        int i7 = 0;
        while (true) {
            j5 j5Var = this.A0;
            if (i7 >= j5Var.getChildCount()) {
                return;
            }
            View childAt = j5Var.getChildAt(i7);
            if (childAt instanceof tg.r1) {
                if (this.s0 == childAt) {
                    A0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(xq.h).withEndAction(new c4(this, (tg.r1) childAt, 1)).start();
            }
            i7++;
        }
    }

    public abstract void o0();

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ii0 ii0Var = this.I1;
        if (ii0Var != null) {
            org.telegram.messenger.g0.E2(ii0Var);
            this.I1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float currentActionBarHeight;
        float f10;
        this.p0 = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
        Bitmap bitmap = this.l0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(48.0f);
            f10 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f10)) > currentActionBarHeight2) {
            Math.floor((r3 * f10) / currentActionBarHeight);
        }
        float f11 = this.q0.a;
        tg.j jVar = this.s0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.C0, i7, i10);
        measureChild(this.M0, i7, i10);
        measureChild(this.E0, i7, i10);
        measureChild(this.D0, i7, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.c2 - this.v1.getPaddingUnderContainer(), Q()), TLObject.FLAG_30));
        FrameLayout frameLayout = this.B0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.p0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.Z1 && !this.b2) {
            this.p0 = true;
            t0();
            this.p0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            return;
        }
        t0();
    }

    @Override // tg.h
    public final boolean p() {
        return !(this.s0 instanceof tg.u0);
    }

    public final tg.u0 p0() {
        int i7 = 0;
        while (true) {
            j5 j5Var = this.A0;
            if (i7 >= j5Var.getChildCount()) {
                return null;
            }
            View childAt = j5Var.getChildAt(i7);
            if (childAt instanceof tg.u0) {
                return (tg.u0) childAt;
            }
            i7++;
        }
    }

    @Override // tg.h
    public final boolean q() {
        return !this.t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap q0(ArrayList arrayList, boolean z9, boolean z10, boolean z11, boolean z12, e7 e7Var) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i7;
        int i10;
        j5 j5Var;
        int i11;
        int i12;
        View view;
        boolean z13;
        boolean z14;
        ImageReceiver imageReceiver;
        byte b10;
        int i13;
        Canvas canvas;
        View view2;
        tg.u0 u0Var;
        bi.m5 m5Var;
        boolean z15;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z16;
        TLRPC.Message message;
        org.telegram.ui.Cells.t0 t0Var;
        bi.m7 m7Var;
        ImageReceiver imageReceiver3;
        ImageReceiver imageReceiver4;
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        float scaleX;
        boolean z17;
        boolean z18;
        float radius;
        double d;
        float width;
        float height;
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        Spanned spanned;
        boolean z19;
        o5 o5Var = this;
        i5 i5Var = o5Var.x0;
        int i14 = 0;
        byte b11 = 1;
        j5 j5Var2 = o5Var.A0;
        if (z9) {
            createBitmap = i5Var.c(false, z12);
        } else if (z11) {
            createBitmap = Bitmap.createBitmap(Math.max(1, j5Var2.getMeasuredWidth()), Math.max(1, j5Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z10) {
                bitmap = null;
                o5Var.P0 = BigInteger.ONE;
                i10 = 0;
                for (i7 = 0; i7 < j5Var2.getChildCount(); i7++) {
                    if (j5Var2.getChildAt(i7) instanceof tg.j) {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    int childCount = j5Var2.getChildCount();
                    int i15 = 0;
                    while (i15 < childCount) {
                        View childAt = j5Var2.getChildAt(i15);
                        if (childAt instanceof tg.j) {
                            tg.j jVar = (tg.j) childAt;
                            jVar.getPosition();
                            h20 h20Var = new h20();
                            if (arrayList != null) {
                                boolean z20 = jVar instanceof tg.k2;
                                int i16 = o5Var.o1;
                                if (z20) {
                                    h20Var.a = b11;
                                    tg.k2 k2Var = (tg.k2) jVar;
                                    CharSequence text = k2Var.getText();
                                    if (text instanceof Spanned) {
                                        Spanned spanned2 = (Spanned) text;
                                        j5Var = j5Var2;
                                        org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spanned2.getSpans(i14, text.length(), org.telegram.ui.Components.r5.class);
                                        if (r5VarArr != null) {
                                            int i17 = i14;
                                            while (i17 < r5VarArr.length) {
                                                org.telegram.ui.Components.r5 r5Var = r5VarArr[i17];
                                                org.telegram.ui.Components.r5[] r5VarArr2 = r5VarArr;
                                                TLRPC.Document document = r5Var.document;
                                                int i18 = i17;
                                                if (document == null) {
                                                    document = org.telegram.ui.Components.i5.e(i16, r5Var.getDocumentId());
                                                }
                                                if (document != null) {
                                                    org.telegram.ui.Components.i5.g(i16).e(document);
                                                }
                                                g20 g20Var = new g20();
                                                int i19 = childCount;
                                                int i20 = i15;
                                                g20Var.document_id = r5Var.getDocumentId();
                                                g20Var.document = document;
                                                g20Var.offset = spanned2.getSpanStart(r5Var);
                                                g20Var.length = spanned2.getSpanEnd(r5Var) - g20Var.offset;
                                                org.telegram.messenger.w7.G(i16);
                                                g20Var.a = org.telegram.messenger.w7.J(document, null, true, true).getAbsolutePath();
                                                int i21 = 0;
                                                while (document != null) {
                                                    ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                    if (arrayList2 == null || arrayList2.isEmpty() || new File(g20Var.a).exists()) {
                                                        break;
                                                    }
                                                    org.telegram.messenger.w7.G(i16);
                                                    spanned = spanned2;
                                                    z19 = true;
                                                    g20Var.a = org.telegram.messenger.w7.J(document.thumbs.get(i21), null, true, true).getAbsolutePath();
                                                    i21++;
                                                    if (i21 >= document.thumbs.size()) {
                                                        break;
                                                    }
                                                    spanned2 = spanned;
                                                }
                                                spanned = spanned2;
                                                z19 = true;
                                                boolean L2 = ij.L2(g20Var.document, z19);
                                                if (L2 || u0(g20Var.document)) {
                                                    g20Var.c = (byte) (g20Var.c | (L2 ? (byte) 1 : (byte) 4));
                                                }
                                                if (ij.D4(g20Var.document)) {
                                                    g20Var.c = (byte) (g20Var.c | 8);
                                                }
                                                h20Var.k.add(g20Var);
                                                if (document != null) {
                                                    BigInteger valueOf = BigInteger.valueOf(5000L);
                                                    o5Var.P0 = o5Var.P0.multiply(valueOf).divide(o5Var.P0.gcd(valueOf));
                                                }
                                                i17 = i18 + 1;
                                                r5VarArr = r5VarArr2;
                                                childCount = i19;
                                                i15 = i20;
                                                spanned2 = spanned;
                                            }
                                        }
                                    } else {
                                        j5Var = j5Var2;
                                    }
                                    i11 = childCount;
                                    i12 = i15;
                                    h20Var.j = text.toString();
                                    h20Var.b = (byte) k2Var.getType();
                                    h20Var.l = k2Var.getSwatch().a;
                                    h20Var.m = k2Var.getTextSize();
                                    h20Var.n = k2Var.getTypeface();
                                    h20Var.p = k2Var.getAlign();
                                } else {
                                    j5Var = j5Var2;
                                    i11 = childCount;
                                    i12 = i15;
                                    if (jVar instanceof tg.d2) {
                                        h20Var.a = (byte) 0;
                                        tg.d2 d2Var = (tg.d2) jVar;
                                        mt0 baseSize = d2Var.getBaseSize();
                                        h20Var.f = baseSize.a;
                                        h20Var.g = baseSize.b;
                                        h20Var.B = d2Var.getSticker();
                                        h20Var.C = d2Var.getParentObject();
                                        TLRPC.Document sticker = d2Var.getSticker();
                                        org.telegram.messenger.w7.G(p10.s0);
                                        h20Var.j = org.telegram.messenger.w7.J(sticker, null, true, true).getAbsolutePath();
                                        if (ij.L2(sticker, true) || u0(sticker)) {
                                            boolean L22 = ij.L2(sticker, true);
                                            h20Var.b = (byte) (h20Var.b | (L22 ? (byte) 1 : (byte) 4));
                                            r21 = (L22 || u0(sticker)) ? d2Var.getDuration() : 5000L;
                                            if (r21 != 0) {
                                                BigInteger valueOf2 = BigInteger.valueOf(r21);
                                                o5Var.P0 = o5Var.P0.multiply(valueOf2).divide(o5Var.P0.gcd(valueOf2));
                                            }
                                        }
                                        if (ij.D4(sticker)) {
                                            h20Var.l = -1;
                                            h20Var.b = (byte) (h20Var.b | 8);
                                        }
                                        if (d2Var.t0) {
                                            h20Var.b = (byte) (h20Var.b | 2);
                                        }
                                    } else if (jVar instanceof tg.n1) {
                                        tg.n1 n1Var = (tg.n1) jVar;
                                        h20Var.a = (byte) 2;
                                        mt0 baseSize2 = n1Var.getBaseSize();
                                        h20Var.f = baseSize2.a;
                                        h20Var.g = baseSize2.b;
                                        h20Var.j = n1Var.q(i16);
                                        h20Var.u = n1Var.G0;
                                        if (n1Var.t0) {
                                            h20Var.b = (byte) (h20Var.b | 2);
                                        }
                                    } else if (jVar instanceof tg.n0) {
                                        tg.n0 n0Var = (tg.n0) jVar;
                                        tg.m0 m0Var = n0Var.q0;
                                        h20Var.a = (byte) 3;
                                        h20Var.b = (byte) n0Var.getType();
                                        h20Var.f = m0Var.getWidth();
                                        h20Var.g = m0Var.getHeight();
                                        h20Var.j = m0Var.getText();
                                        h20Var.l = n0Var.r0 ? n0Var.getColor() : 0;
                                        h20Var.P = m0Var.D;
                                        h20Var.N = n0Var.u0;
                                        TL_stories.MediaArea mediaArea2 = n0Var.v0;
                                        h20Var.M = mediaArea2;
                                        mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument = m0Var.getCodeEmojiDocument();
                                        if (codeEmojiDocument != null) {
                                            g20 g20Var2 = new g20();
                                            g20Var2.document_id = codeEmojiDocument.id;
                                            g20Var2.document = codeEmojiDocument;
                                            org.telegram.messenger.w7.G(i16);
                                            g20Var2.a = org.telegram.messenger.w7.J(codeEmojiDocument, null, true, true).getAbsolutePath();
                                            boolean L23 = ij.L2(g20Var2.document, true);
                                            if (L23 || u0(g20Var2.document)) {
                                                g20Var2.c = (byte) (g20Var2.c | (L23 ? (byte) 1 : (byte) 4));
                                            }
                                            h20Var.k.add(g20Var2);
                                        }
                                    } else if (jVar instanceof tg.l2) {
                                        tg.l2 l2Var = (tg.l2) jVar;
                                        tg.m0 m0Var2 = l2Var.q0;
                                        h20Var.a = (byte) 8;
                                        h20Var.b = (byte) l2Var.getType();
                                        h20Var.f = m0Var2.getWidth();
                                        h20Var.g = m0Var2.getHeight();
                                        h20Var.j = m0Var2.getText();
                                        h20Var.l = l2Var.r0 ? l2Var.getColor() : 0;
                                        h20Var.P = m0Var2.D;
                                        h20Var.O = l2Var.u0;
                                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                        tL_mediaAreaWeather.emoji = l2Var.u0.c;
                                        tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                        tL_mediaAreaWeather.color = m0Var2.f.getColor();
                                        h20Var.M = tL_mediaAreaWeather;
                                        tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument2 = m0Var2.getCodeEmojiDocument();
                                        if (codeEmojiDocument2 != null) {
                                            g20 g20Var3 = new g20();
                                            g20Var3.document_id = codeEmojiDocument2.id;
                                            g20Var3.document = codeEmojiDocument2;
                                            org.telegram.messenger.w7.G(i16);
                                            g20Var3.a = org.telegram.messenger.w7.J(codeEmojiDocument2, null, true, true).getAbsolutePath();
                                            boolean L24 = ij.L2(g20Var3.document, true);
                                            if (L24 || u0(g20Var3.document)) {
                                                g20Var3.c = (byte) (g20Var3.c | (L24 ? (byte) 1 : (byte) 4));
                                            }
                                            h20Var.k.add(g20Var3);
                                        }
                                        view = childAt;
                                        z15 = false;
                                        z16 = false;
                                        imageReceiver = null;
                                        arrayList.add(h20Var);
                                        scaleX = view.getScaleX();
                                        float scaleY = view.getScaleY();
                                        float x10 = view.getX();
                                        float y10 = view.getY();
                                        h20Var.q = view.getWidth();
                                        h20Var.r = view.getHeight();
                                        h20Var.f = (view.getWidth() * scaleX) / j5Var.getMeasuredWidth();
                                        h20Var.g = (view.getHeight() * scaleY) / j5Var.getMeasuredHeight();
                                        h20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10) / j5Var.getMeasuredWidth();
                                        h20Var.d = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y10) / j5Var.getMeasuredHeight();
                                        h20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                        h20Var.y = ((view.getWidth() / 2.0f) + x10) / j5Var.getMeasuredWidth();
                                        h20Var.z = ((view.getHeight() / 2.0f) + y10) / j5Var.getMeasuredHeight();
                                        h20Var.w = h20Var.q / j5Var.getMeasuredWidth();
                                        h20Var.x = h20Var.r / j5Var.getMeasuredHeight();
                                        h20Var.v = scaleX;
                                        if (jVar instanceof tg.u0) {
                                            z17 = z15;
                                            if (jVar instanceof tg.d2) {
                                                ImageReceiver imageReceiver5 = ((tg.d2) jVar).x0;
                                                RectF rectF = imageReceiver5.P0;
                                                if (imageReceiver5.U % qs.K2 != 0) {
                                                    width = rectF.height();
                                                    height = rectF.width();
                                                } else {
                                                    width = rectF.width();
                                                    height = rectF.height();
                                                }
                                                float f10 = width / height;
                                                float f11 = (h20Var.f / 2.0f) + h20Var.c;
                                                float f12 = (h20Var.g / 2.0f) + h20Var.d;
                                                float measuredWidth = j5Var.getMeasuredWidth() / j5Var.getMeasuredHeight();
                                                if (f10 > 1.0f) {
                                                    float f13 = (h20Var.f * measuredWidth) / f10;
                                                    h20Var.g = f13;
                                                    h20Var.r = (int) (h20Var.q / f10);
                                                    h20Var.d = f12 - (f13 / 2.0f);
                                                } else if (f10 < 1.0f) {
                                                    float f14 = (h20Var.g / measuredWidth) * f10;
                                                    h20Var.f = f14;
                                                    h20Var.q = (int) (h20Var.r * f10);
                                                    h20Var.c = f11 - (f14 / 2.0f);
                                                }
                                            } else {
                                                TL_stories.MediaArea mediaArea3 = h20Var.M;
                                                if (mediaArea3 != null && (((z18 = jVar instanceof tg.n0)) || (jVar instanceof tg.l2) || (jVar instanceof tg.k0) || (jVar instanceof tg.q1))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                    float f15 = h20Var.c;
                                                    float f16 = h20Var.f;
                                                    mediaAreaCoordinates2.x = ((f16 / 2.0f) + f15) * 100.0f;
                                                    mediaAreaCoordinates2.y = ((h20Var.g / 2.0f) + h20Var.d) * 100.0f;
                                                    if (z18) {
                                                        tg.m0 m0Var3 = ((tg.n0) jVar).q0;
                                                        mediaAreaCoordinates2.w = org.telegram.messenger.camera.q.x(m0Var3.I * 2 * scaleX, j5Var.getMeasuredWidth(), f16, 100.0f);
                                                        h20Var.M.coordinates.h = org.telegram.messenger.camera.q.x(m0Var3.J * 2 * scaleY, j5Var.getMeasuredHeight(), h20Var.g, 100.0f);
                                                    } else if (jVar instanceof tg.l2) {
                                                        tg.m0 m0Var4 = ((tg.l2) jVar).q0;
                                                        mediaAreaCoordinates2.w = org.telegram.messenger.camera.q.x(m0Var4.I * 2 * scaleX, j5Var.getMeasuredWidth(), f16, 100.0f);
                                                        h20Var.M.coordinates.h = org.telegram.messenger.camera.q.x(m0Var4.J * 2 * scaleY, j5Var.getMeasuredHeight(), h20Var.g, 100.0f);
                                                    } else if (jVar instanceof tg.k0) {
                                                        tg.i0 i0Var = ((tg.k0) jVar).q0;
                                                        mediaAreaCoordinates2.w = org.telegram.messenger.camera.q.x(i0Var.f * 2 * scaleX, j5Var.getMeasuredWidth(), f16, 100.0f);
                                                        h20Var.M.coordinates.h = org.telegram.messenger.camera.q.x(i0Var.h * 2 * scaleY, j5Var.getMeasuredHeight(), h20Var.g, 100.0f);
                                                    } else if (jVar instanceof tg.q1) {
                                                        tg.q1 q1Var = (tg.q1) jVar;
                                                        float padding = ((q1Var.getPadding() * 2) * scaleX) / j5Var.getMeasuredWidth();
                                                        float padding2 = ((q1Var.getPadding() * 2) * scaleX) / j5Var.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = h20Var.M.coordinates;
                                                        mediaAreaCoordinates3.w = (h20Var.f - padding) * 100.0f;
                                                        mediaAreaCoordinates3.h = (h20Var.g - padding2) * 100.0f;
                                                    }
                                                    h20Var.M.coordinates.rotation = ((-h20Var.e) / 3.141592653589793d) * 180.0d;
                                                    if (z18) {
                                                        radius = ((tg.n0) jVar).q0.getRadius();
                                                    } else if (jVar instanceof tg.l2) {
                                                        radius = ((tg.l2) jVar).q0.getRadius();
                                                    } else if (jVar instanceof tg.k0) {
                                                        radius = ((tg.k0) jVar).q0.getRadius();
                                                    }
                                                    d = radius;
                                                }
                                            }
                                            d = -1.0d;
                                        } else {
                                            tg.u0 u0Var2 = (tg.u0) jVar;
                                            tg.p0 p0Var = u0Var2.r0;
                                            bi.m5 m5Var2 = u0Var2.q0;
                                            RectF rectF2 = org.telegram.messenger.g0.P;
                                            z17 = z15;
                                            double r10 = u0Var2.r(rectF2);
                                            rectF2.offset(m5Var2.getX(), m5Var2.getY());
                                            rectF2.offset(p0Var.getX(), p0Var.getY());
                                            h20Var.M.coordinates.x = (((rectF2.centerX() * scaleX) + org.telegram.messenger.camera.q.v(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x10)) / j5Var.getMeasuredWidth()) * 100.0f;
                                            h20Var.M.coordinates.y = (((rectF2.centerY() * scaleY) + org.telegram.messenger.camera.q.v(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y10)) / j5Var.getMeasuredHeight()) * 100.0f;
                                            h20Var.M.coordinates.w = ((rectF2.width() * scaleX) / j5Var.getMeasuredWidth()) * 100.0f;
                                            h20Var.M.coordinates.h = ((rectF2.height() * scaleY) / j5Var.getMeasuredHeight()) * 100.0f;
                                            h20Var.M.coordinates.rotation = ((-h20Var.e) / 3.141592653589793d) * 180.0d;
                                            d = r10;
                                        }
                                        mediaArea = h20Var.M;
                                        if (mediaArea != null && (mediaAreaCoordinates = mediaArea.coordinates) != null && d > 0.0d) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                        }
                                        z13 = z16;
                                        z14 = z17;
                                    } else {
                                        if (jVar instanceof tg.k0) {
                                            tg.k0 k0Var = (tg.k0) jVar;
                                            tg.i0 i0Var2 = k0Var.q0;
                                            h20Var.a = (byte) 7;
                                            if (i0Var2.e()) {
                                                h20Var.b = (byte) i0Var2.getPreviewType();
                                            } else {
                                                h20Var.b = (byte) k0Var.getType();
                                            }
                                            h20Var.f = i0Var2.getWidth();
                                            h20Var.g = i0Var2.getHeight();
                                            h20Var.l = k0Var.t0 ? k0Var.getColor() : 0;
                                            h20Var.P = i0Var2.e;
                                            h20Var.W = k0Var.u0;
                                            if (i0Var2.R) {
                                                ImageReceiver imageReceiver6 = i0Var2.T;
                                                if (i0Var2.R && imageReceiver6.J() && imageReceiver6.n() != null) {
                                                    gc.D().O(new BitmapDrawable(imageReceiver6.n()), imageReceiver6.Q, false);
                                                }
                                                tg.h0 h0Var = h20Var.W;
                                                h0Var.a |= 4;
                                                h0Var.i = i0Var2.getPhotoSide();
                                            }
                                            TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                            h20Var.M = tL_mediaAreaUrl;
                                            tg.h0 h0Var2 = k0Var.u0;
                                            if (h0Var2 != null) {
                                                TLRPC.WebPage webPage = h0Var2.d;
                                                tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? k0Var.u0.c : k0Var.u0.d.url;
                                                h20Var.M.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                        } else {
                                            if (jVar instanceof tg.q1) {
                                                tg.q1 q1Var2 = (tg.q1) jVar;
                                                h20Var.a = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                h20Var.M = tL_mediaAreaSuggestedReaction;
                                                ch.o0 currentReaction = q1Var2.getCurrentReaction();
                                                if (currentReaction.f != null) {
                                                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                                                    tL_reactionEmoji.emoticon = currentReaction.f;
                                                    tL_reactionCustomEmoji = tL_reactionEmoji;
                                                } else {
                                                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                                                    tL_reactionCustomEmoji2.document_id = currentReaction.g;
                                                    tL_reactionCustomEmoji = tL_reactionCustomEmoji2;
                                                }
                                                tL_mediaAreaSuggestedReaction.reaction = tL_reactionCustomEmoji;
                                                TL_stories.MediaArea mediaArea4 = h20Var.M;
                                                mediaArea4.dark = q1Var2.r0.a == 1;
                                                mediaArea4.flipped = q1Var2.y0;
                                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            } else if (jVar instanceof tg.r1) {
                                                tg.r1 r1Var = (tg.r1) jVar;
                                                mt0 baseSize3 = r1Var.getBaseSize();
                                                h20Var.f = baseSize3.a;
                                                h20Var.g = baseSize3.b;
                                                h20Var.a = (byte) 5;
                                                if (e7Var != null) {
                                                    h20Var.j = e7Var.o0.getAbsolutePath();
                                                    h20Var.Q = e7Var.r0;
                                                    long j3 = e7Var.q0;
                                                    h20Var.T = j3;
                                                    float f17 = j3;
                                                    h20Var.R = (long) (e7Var.s0 * f17);
                                                    h20Var.S = (long) (e7Var.t0 * f17);
                                                }
                                                h20Var.b = (byte) 4;
                                                if (r1Var.r0) {
                                                    h20Var.b = (byte) (h20Var.b | 2);
                                                }
                                            } else if (jVar instanceof tg.u0) {
                                                tg.u0 u0Var3 = (tg.u0) jVar;
                                                bi.m5 m5Var3 = u0Var3.q0;
                                                ArrayList arrayList3 = u0Var3.s0;
                                                tg.p0 p0Var2 = u0Var3.r0;
                                                h20Var.a = (byte) 6;
                                                int width2 = u0Var3.getWidth();
                                                h20Var.q = width2;
                                                h20Var.f = width2;
                                                int height2 = u0Var3.getHeight();
                                                h20Var.r = height2;
                                                h20Var.g = height2;
                                                ij ijVar = arrayList3.size() > 0 ? (ij) arrayList3.get(0) : null;
                                                if (ijVar != null && (message = ijVar.k) != null) {
                                                    TLRPC.MessageAction messageAction = message.action;
                                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                        TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                        h20Var.M = tL_mediaAreaStarGift;
                                                        tL_mediaAreaStarGift.slug = starGift.slug;
                                                        tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        int i22 = 0;
                                                        while (true) {
                                                            if (i22 >= p0Var2.getChildCount()) {
                                                                t0Var = null;
                                                                break;
                                                            }
                                                            View childAt2 = p0Var2.getChildAt(i22);
                                                            if (childAt2 instanceof org.telegram.ui.Cells.t0) {
                                                                t0Var = (org.telegram.ui.Cells.t0) childAt2;
                                                                break;
                                                            }
                                                            i22++;
                                                        }
                                                        if (t0Var == null || (m7Var = t0Var.H0) == null || (imageReceiver3 = m7Var.d) == null) {
                                                            u0Var = u0Var3;
                                                            m5Var = m5Var3;
                                                            view = childAt;
                                                            imageReceiver = null;
                                                            if (z11) {
                                                                if (e7Var != null) {
                                                                    Matrix matrix = e7Var.n0;
                                                                    if (e7Var.K) {
                                                                        matrix.reset();
                                                                        if (p0Var2.getChildCount() == 1) {
                                                                            view3 = p0Var2.getChildAt(0);
                                                                            if (view3 instanceof org.telegram.ui.Cells.q1) {
                                                                                imageReceiver2 = ((org.telegram.ui.Cells.q1) view3).getPhotoImage();
                                                                                if (imageReceiver2 != null) {
                                                                                    float max = Math.max(imageReceiver2.w() / Math.max(1, e7Var.k0), imageReceiver2.v() / Math.max(1, e7Var.l0));
                                                                                    matrix.postScale(max, max);
                                                                                    matrix.postTranslate(imageReceiver2.r() - ((e7Var.k0 * max) / 2.0f), imageReceiver2.s() - ((e7Var.l0 * max) / 2.0f));
                                                                                    matrix.postTranslate(m5Var.getX(), m5Var.getY());
                                                                                    matrix.postTranslate(p0Var2.getX(), p0Var2.getY());
                                                                                    matrix.postTranslate(view3.getX(), view3.getY());
                                                                                    matrix.postScale(u0Var.getScaleX(), u0Var.getScaleY(), u0Var.getPivotX(), u0Var.getPivotY());
                                                                                    matrix.postRotate(u0Var.getRotation(), u0Var.getPivotX(), u0Var.getPivotY());
                                                                                    matrix.postTranslate(u0Var.getX(), u0Var.getY());
                                                                                    matrix.postScale(1.0f / j5Var.getWidth(), 1.0f / j5Var.getHeight());
                                                                                    matrix.postScale(e7Var.i0, e7Var.j0);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            view3 = null;
                                                                        }
                                                                        imageReceiver2 = null;
                                                                        if (imageReceiver2 != null) {
                                                                        }
                                                                    }
                                                                }
                                                                z15 = false;
                                                            } else {
                                                                z15 = true;
                                                            }
                                                            z16 = true;
                                                            arrayList.add(h20Var);
                                                            scaleX = view.getScaleX();
                                                            float scaleY2 = view.getScaleY();
                                                            float x102 = view.getX();
                                                            float y102 = view.getY();
                                                            h20Var.q = view.getWidth();
                                                            h20Var.r = view.getHeight();
                                                            h20Var.f = (view.getWidth() * scaleX) / j5Var.getMeasuredWidth();
                                                            h20Var.g = (view.getHeight() * scaleY2) / j5Var.getMeasuredHeight();
                                                            h20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102) / j5Var.getMeasuredWidth();
                                                            h20Var.d = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y102) / j5Var.getMeasuredHeight();
                                                            h20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            h20Var.y = ((view.getWidth() / 2.0f) + x102) / j5Var.getMeasuredWidth();
                                                            h20Var.z = ((view.getHeight() / 2.0f) + y102) / j5Var.getMeasuredHeight();
                                                            h20Var.w = h20Var.q / j5Var.getMeasuredWidth();
                                                            h20Var.x = h20Var.r / j5Var.getMeasuredHeight();
                                                            h20Var.v = scaleX;
                                                            if (jVar instanceof tg.u0) {
                                                            }
                                                            mediaArea = h20Var.M;
                                                            if (mediaArea != null) {
                                                                mediaAreaCoordinates.flags |= 1;
                                                                mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                                            }
                                                            z13 = z16;
                                                            z14 = z17;
                                                        } else {
                                                            imageReceiver3.O0(false, false);
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) bi.ea.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                            if (stargiftattributemodel != null) {
                                                                float L = org.telegram.messenger.g0.L(110.0f);
                                                                float r11 = imageReceiver3.r() + t0Var.getX() + p0Var2.getX() + t0Var.F0;
                                                                float s5 = imageReceiver3.s() + t0Var.getY() + p0Var2.getY() + t0Var.G0;
                                                                u0Var = u0Var3;
                                                                h20 h20Var2 = new h20();
                                                                h20Var2.a = (byte) 0;
                                                                h20Var2.f = L;
                                                                h20Var2.g = L;
                                                                TLRPC.Document document2 = stargiftattributemodel.document;
                                                                h20Var2.B = document2;
                                                                h20Var2.C = starGift;
                                                                org.telegram.messenger.w7.G(p10.s0);
                                                                h20Var2.j = org.telegram.messenger.w7.K(document2, true).getAbsolutePath();
                                                                if (ij.L2(document2, true) || u0(document2)) {
                                                                    boolean L25 = ij.L2(document2, true);
                                                                    h20Var2.b = (byte) (h20Var2.b | (L25 ? (byte) 1 : (byte) 4));
                                                                    zg0 B = imageReceiver3.B();
                                                                    if (B != null && (L25 || u0(document2))) {
                                                                        r21 = B.r();
                                                                    }
                                                                    if (r21 != 0) {
                                                                        BigInteger valueOf3 = BigInteger.valueOf(r21);
                                                                        o5Var.P0 = o5Var.P0.multiply(valueOf3).divide(o5Var.P0.gcd(valueOf3));
                                                                    }
                                                                }
                                                                float scaleX2 = childAt.getScaleX();
                                                                float scaleY3 = childAt.getScaleY();
                                                                float x11 = childAt.getX();
                                                                float y11 = childAt.getY();
                                                                int i23 = (int) L;
                                                                h20Var2.q = i23;
                                                                h20Var2.r = i23;
                                                                h20Var2.f = (L * scaleX2) / j5Var.getMeasuredWidth();
                                                                h20Var2.g = (L * scaleY3) / j5Var.getMeasuredHeight();
                                                                h20Var2.c = (childAt.getWidth() / 2.0f) + x11;
                                                                h20Var2.d = (childAt.getHeight() / 2.0f) + y11;
                                                                float v = org.telegram.messenger.camera.q.v(childAt.getWidth(), 2.0f, scaleX2, r11 * scaleX2);
                                                                m5Var = m5Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                view = childAt;
                                                                double d2 = v;
                                                                double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                double v10 = org.telegram.messenger.camera.q.v(childAt.getHeight(), 2.0f, scaleY3, s5 * scaleY3);
                                                                h20Var2.c = (float) (((Math.cos(rotation) * d2) - (Math.sin(rotation) * v10)) + h20Var2.c);
                                                                float cos = (float) ((Math.cos(rotation) * v10) + (Math.sin(rotation) * d2) + h20Var2.d);
                                                                float f18 = (-L) / 2.0f;
                                                                float f19 = (f18 * scaleX2) + h20Var2.c;
                                                                h20Var2.c = f19;
                                                                h20Var2.d = (f18 * scaleY3) + cos;
                                                                h20Var2.c = f19 / j5Var.getMeasuredWidth();
                                                                h20Var2.d /= j5Var.getMeasuredHeight();
                                                                h20Var2.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                h20Var2.v = scaleX2;
                                                                arrayList.add(h20Var2);
                                                            } else {
                                                                u0Var = u0Var3;
                                                                m5Var = m5Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                view = childAt;
                                                            }
                                                            imageReceiver = imageReceiver4;
                                                            if (z11) {
                                                            }
                                                            z16 = true;
                                                            arrayList.add(h20Var);
                                                            scaleX = view.getScaleX();
                                                            float scaleY22 = view.getScaleY();
                                                            float x1022 = view.getX();
                                                            float y1022 = view.getY();
                                                            h20Var.q = view.getWidth();
                                                            h20Var.r = view.getHeight();
                                                            h20Var.f = (view.getWidth() * scaleX) / j5Var.getMeasuredWidth();
                                                            h20Var.g = (view.getHeight() * scaleY22) / j5Var.getMeasuredHeight();
                                                            h20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022) / j5Var.getMeasuredWidth();
                                                            h20Var.d = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y1022) / j5Var.getMeasuredHeight();
                                                            h20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            h20Var.y = ((view.getWidth() / 2.0f) + x1022) / j5Var.getMeasuredWidth();
                                                            h20Var.z = ((view.getHeight() / 2.0f) + y1022) / j5Var.getMeasuredHeight();
                                                            h20Var.w = h20Var.q / j5Var.getMeasuredWidth();
                                                            h20Var.x = h20Var.r / j5Var.getMeasuredHeight();
                                                            h20Var.v = scaleX;
                                                            if (jVar instanceof tg.u0) {
                                                            }
                                                            mediaArea = h20Var.M;
                                                            if (mediaArea != null) {
                                                            }
                                                            z13 = z16;
                                                            z14 = z17;
                                                        }
                                                    }
                                                }
                                                u0Var = u0Var3;
                                                m5Var = m5Var3;
                                                view = childAt;
                                                if (ijVar != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    h20Var.M = tL_inputMediaAreaChannelPost;
                                                    tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) h20Var.M).channel = qp.s1(i16).h1(-e7.p(ijVar));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) h20Var.M;
                                                    Boolean D = e7.D(ijVar);
                                                    tL_inputMediaAreaChannelPost2.msg_id = D == null ? 0 : D.booleanValue() ? ijVar.k.fwd_from.channel_post : ijVar.f1();
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    h20Var.M = tL_inputMediaAreaChannelPost3;
                                                    tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                                if (z11) {
                                                }
                                                z16 = true;
                                                arrayList.add(h20Var);
                                                scaleX = view.getScaleX();
                                                float scaleY222 = view.getScaleY();
                                                float x10222 = view.getX();
                                                float y10222 = view.getY();
                                                h20Var.q = view.getWidth();
                                                h20Var.r = view.getHeight();
                                                h20Var.f = (view.getWidth() * scaleX) / j5Var.getMeasuredWidth();
                                                h20Var.g = (view.getHeight() * scaleY222) / j5Var.getMeasuredHeight();
                                                h20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10222) / j5Var.getMeasuredWidth();
                                                h20Var.d = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y10222) / j5Var.getMeasuredHeight();
                                                h20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                h20Var.y = ((view.getWidth() / 2.0f) + x10222) / j5Var.getMeasuredWidth();
                                                h20Var.z = ((view.getHeight() / 2.0f) + y10222) / j5Var.getMeasuredHeight();
                                                h20Var.w = h20Var.q / j5Var.getMeasuredWidth();
                                                h20Var.x = h20Var.r / j5Var.getMeasuredHeight();
                                                h20Var.v = scaleX;
                                                if (jVar instanceof tg.u0) {
                                                }
                                                mediaArea = h20Var.M;
                                                if (mediaArea != null) {
                                                }
                                                z13 = z16;
                                                z14 = z17;
                                            }
                                            view = childAt;
                                            z15 = true;
                                            z16 = true;
                                            imageReceiver = null;
                                            arrayList.add(h20Var);
                                            scaleX = view.getScaleX();
                                            float scaleY2222 = view.getScaleY();
                                            float x102222 = view.getX();
                                            float y102222 = view.getY();
                                            h20Var.q = view.getWidth();
                                            h20Var.r = view.getHeight();
                                            h20Var.f = (view.getWidth() * scaleX) / j5Var.getMeasuredWidth();
                                            h20Var.g = (view.getHeight() * scaleY2222) / j5Var.getMeasuredHeight();
                                            h20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102222) / j5Var.getMeasuredWidth();
                                            h20Var.d = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y102222) / j5Var.getMeasuredHeight();
                                            h20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            h20Var.y = ((view.getWidth() / 2.0f) + x102222) / j5Var.getMeasuredWidth();
                                            h20Var.z = ((view.getHeight() / 2.0f) + y102222) / j5Var.getMeasuredHeight();
                                            h20Var.w = h20Var.q / j5Var.getMeasuredWidth();
                                            h20Var.x = h20Var.r / j5Var.getMeasuredHeight();
                                            h20Var.v = scaleX;
                                            if (jVar instanceof tg.u0) {
                                            }
                                            mediaArea = h20Var.M;
                                            if (mediaArea != null) {
                                            }
                                            z13 = z16;
                                            z14 = z17;
                                        }
                                        b10 = 1;
                                        i13 = 0;
                                    }
                                }
                                view = childAt;
                                z15 = false;
                                z16 = true;
                                imageReceiver = null;
                                arrayList.add(h20Var);
                                scaleX = view.getScaleX();
                                float scaleY22222 = view.getScaleY();
                                float x1022222 = view.getX();
                                float y1022222 = view.getY();
                                h20Var.q = view.getWidth();
                                h20Var.r = view.getHeight();
                                h20Var.f = (view.getWidth() * scaleX) / j5Var.getMeasuredWidth();
                                h20Var.g = (view.getHeight() * scaleY22222) / j5Var.getMeasuredHeight();
                                h20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022222) / j5Var.getMeasuredWidth();
                                h20Var.d = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y1022222) / j5Var.getMeasuredHeight();
                                h20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                h20Var.y = ((view.getWidth() / 2.0f) + x1022222) / j5Var.getMeasuredWidth();
                                h20Var.z = ((view.getHeight() / 2.0f) + y1022222) / j5Var.getMeasuredHeight();
                                h20Var.w = h20Var.q / j5Var.getMeasuredWidth();
                                h20Var.x = h20Var.r / j5Var.getMeasuredHeight();
                                h20Var.v = scaleX;
                                if (jVar instanceof tg.u0) {
                                }
                                mediaArea = h20Var.M;
                                if (mediaArea != null) {
                                }
                                z13 = z16;
                                z14 = z17;
                            } else {
                                j5Var = j5Var2;
                                i11 = childCount;
                                i12 = i15;
                                view = childAt;
                                z13 = true;
                                z14 = false;
                                imageReceiver = null;
                            }
                            if (z13 && ((z10 || (z11 && h20Var.a == 6)) && bitmap != null)) {
                                Canvas canvas2 = new Canvas(bitmap);
                                float width3 = bitmap.getWidth() / j5Var.getMeasuredWidth();
                                int i24 = 0;
                                while (i24 < 2) {
                                    Canvas canvas3 = i24 == 0 ? canvas2 : null;
                                    if (canvas3 == null || (i24 == 0 && z14)) {
                                        canvas = canvas2;
                                        view2 = view;
                                    } else {
                                        canvas3.save();
                                        canvas3.scale(width3, width3);
                                        canvas3.translate(h20Var.c * j5Var.getMeasuredWidth(), h20Var.d * j5Var.getMeasuredHeight());
                                        canvas3.scale(view.getScaleX(), view.getScaleY());
                                        canvas3.rotate(view.getRotation(), ((h20Var.f / 2.0f) / view.getScaleX()) * j5Var.getMeasuredWidth(), ((h20Var.g / 2.0f) / view.getScaleY()) * j5Var.getMeasuredHeight());
                                        view2 = view;
                                        if (!(view2 instanceof tg.k2) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                            canvas = canvas2;
                                            if (view2 instanceof tg.u0) {
                                                tg.u0 u0Var4 = (tg.u0) view2;
                                                tg.p0 p0Var3 = u0Var4.r0;
                                                boolean z21 = true;
                                                u0Var4.u0 = true;
                                                int i25 = 0;
                                                while (i25 < p0Var3.getChildCount()) {
                                                    View childAt3 = p0Var3.getChildAt(i25);
                                                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                                                        ((org.telegram.ui.Cells.q1) childAt3).Fc = z21;
                                                    }
                                                    i25++;
                                                    z21 = true;
                                                }
                                                view2.draw(canvas3);
                                                boolean z22 = false;
                                                u0Var4.u0 = false;
                                                int i26 = 0;
                                                while (i26 < p0Var3.getChildCount()) {
                                                    View childAt4 = p0Var3.getChildAt(i26);
                                                    if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                                        ((org.telegram.ui.Cells.q1) childAt4).Fc = z22;
                                                    }
                                                    i26++;
                                                    z22 = false;
                                                }
                                            } else {
                                                view2.draw(canvas3);
                                            }
                                        } else {
                                            int scaleX3 = (int) (view2.getScaleX() * view2.getWidth());
                                            int scaleY4 = (int) (view2.getScaleY() * view2.getHeight());
                                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                            Bitmap c10 = as.c(scaleX3, scaleY4);
                                            Canvas canvas4 = new Canvas(c10);
                                            canvas = canvas2;
                                            canvas4.scale(view2.getScaleX(), view2.getScaleY());
                                            view2.draw(canvas4);
                                            canvas3.scale(1.0f / view2.getScaleX(), 1.0f / view2.getScaleY());
                                            canvas3.drawBitmap(c10, (Rect) null, new Rect(0, 0, scaleX3, scaleY4), new Paint(3));
                                            try {
                                                canvas4.setBitmap(null);
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.f(e10);
                                            }
                                            c10.recycle();
                                        }
                                        canvas3.restore();
                                    }
                                    i24++;
                                    canvas2 = canvas;
                                    view = view2;
                                }
                                if (imageReceiver != null) {
                                    b10 = 1;
                                    i13 = 0;
                                    imageReceiver.O0(true, false);
                                }
                            }
                            b10 = 1;
                            i13 = 0;
                        } else {
                            i13 = i14;
                            j5Var = j5Var2;
                            i11 = childCount;
                            i12 = i15;
                            b10 = b11;
                        }
                        i15 = i12 + 1;
                        o5Var = this;
                        b11 = b10;
                        i14 = i13;
                        j5Var2 = j5Var;
                        childCount = i11;
                    }
                }
                return bitmap;
            }
            Bitmap c11 = i5Var.c(false, false);
            createBitmap = c11 != null ? Bitmap.createBitmap(c11.getWidth(), c11.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        o5Var.P0 = BigInteger.ONE;
        i10 = 0;
        while (i7 < j5Var2.getChildCount()) {
        }
        if (i10 > 0) {
        }
        return bitmap;
    }

    public final boolean r0() {
        return this.m0.a() || this.U1;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.p0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(boolean z9) {
        int i7 = 0;
        if (this.Z1) {
            G0(0);
        }
        if (z9) {
            gy gyVar = this.Y1;
            if (gyVar == null || gyVar.getVisibility() != 0) {
                t0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Y1.getMeasuredHeight());
            ofFloat.addUpdateListener(new h4(this, i7));
            this.b2 = true;
            ofFloat.addListener(new z4(this, 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
            ofFloat.start();
        }
    }

    public void setBlurManager(org.telegram.ui.Components.y9 y9Var) {
        this.N1 = y9Var;
    }

    public void setCoverPreview(boolean z9) {
        if (this.V1 != z9) {
            this.V1 = z9;
            if (z9) {
                A0(null, true);
            }
            setCoverPause(z9);
        }
    }

    public void setCoverTime(long j3) {
        int i7 = 0;
        while (true) {
            j5 j5Var = this.A0;
            if (i7 >= j5Var.getChildCount()) {
                return;
            }
            View childAt = j5Var.getChildAt(i7);
            if (childAt instanceof tg.d2) {
                ImageReceiver imageReceiver = ((tg.d2) childAt).x0;
                zg0 B = imageReceiver.B();
                imageReceiver.m();
                if (B != null) {
                    B.N(Math.round(((j3 % B.r()) / B.r()) * B.e[0]), true, false);
                }
            }
            i7++;
        }
    }

    public void setHasAudio(boolean z9) {
        if (z9 != this.H1) {
            this.H1 = z9;
            d0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.u1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.t1 = runnable;
    }

    @Override // tg.c1
    public final void t() {
        if (!this.a2 && !this.Z1) {
            this.U1 = true;
            l0(true);
            return;
        }
        if (this.Z1) {
            tg.j jVar = this.s0;
            if (jVar instanceof tg.k2) {
                this.x1.e = true;
                org.telegram.messenger.g0.K3(((tg.k2) jVar).getEditText());
            }
        }
        G0(!this.Z1 ? 1 : 0);
    }

    public final void t0() {
        gy gyVar;
        if (!this.Z1 && (gyVar = this.Y1) != null && gyVar.getVisibility() != 8) {
            this.Y1.setVisibility(8);
        }
        int i7 = this.c2;
        this.c2 = 0;
        if (i7 != 0) {
            this.x1.a();
        }
    }

    @Override // tg.h
    public final boolean u(tg.j jVar) {
        return A0(jVar, true);
    }

    @Override // org.telegram.ui.Components.rt0, org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        this.n1.setColor(-15132391);
    }

    @Override // tg.h
    public final void v(float f10, float f11, float[] fArr) {
        View view;
        View view2 = (View) this.x0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x10 = (f10 - view2.getX()) - view.getLeft();
        float y10 = (f11 - view2.getY()) - view.getTop();
        float pivotX = ((x10 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = ((y10 - view2.getPivotY()) / view2.getScaleY()) + view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = pivotY;
    }

    public final boolean v0() {
        if (this.L1) {
            if (this.I1.getReactionsWindow() == null || this.I1.getReactionsWindow().q) {
                L0(false);
                return true;
            }
            this.I1.e();
            return true;
        }
        if (this.k1) {
            F0(false);
            return true;
        }
        if (this.Z1) {
            s0(true);
            return true;
        }
        if (!this.t0) {
            return false;
        }
        if (!this.v0) {
            A0(null, true);
            return true;
        }
        this.v0 = false;
        this.x1.b(true);
        return false;
    }

    @Override // tg.g1
    public final void w(sg.h hVar) {
        boolean z9 = hVar instanceof sg.b;
        tg.m1 m1Var = this.M0;
        if (z9 || (hVar instanceof sg.d)) {
            m1Var.b(0.4f, 1.75f);
        } else {
            m1Var.b(0.05f, 1.0f);
        }
        m1Var.setDrawCenter(!(hVar instanceof sg.g));
        i5 i5Var = this.x0;
        if (i5Var.getCurrentBrush() instanceof sg.g) {
            this.L0 = true;
        }
        i5Var.setBrush(hVar);
        sg.j1 j1Var = this.j1;
        int i7 = j1Var.a;
        j1Var.a = sg.l0.e(this.o1).c();
        j1Var.c = this.N0.get();
        B0(j1Var, Integer.valueOf(i7), false);
        this.y0.invalidate();
    }

    public abstract void w0(boolean z9);

    @Override // tg.g1
    public final sg.l0 x() {
        return sg.l0.e(this.o1);
    }

    public final void x0() {
        final int i7 = this.H0;
        O0(1);
        postDelayed(new ai.m0(this, 12), 350L);
        c5 c5Var = new c5(this, getContext(), this.p1, i7);
        this.T1 = c5Var;
        ua uaVar = this.v1;
        Objects.requireNonNull(uaVar);
        c5Var.t1 = new ai.e(uaVar, 20);
        final boolean[] zArr = {true};
        c5Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: fi.t4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o5 o5Var = o5.this;
                o5Var.T1 = null;
                if (zArr[0]) {
                    o5Var.w0(false);
                }
                o5Var.O0(i7);
            }
        });
        c5Var.v1 = new o4(this);
        c5Var.N0(new u4(this, zArr, c5Var, 0));
        c5Var.show();
        w0(true);
    }

    public final void y0(tg.j jVar) {
        this.m0.b(jVar.getUUID(), new l4(this, jVar, 0));
    }

    public final void z0(tg.j jVar) {
        tg.j jVar2 = this.s0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            A0(null, true);
            if (jVar instanceof tg.k2) {
                ValueAnimator valueAnimator = this.K0;
                if (valueAnimator != null && this.I0 != 0) {
                    valueAnimator.cancel();
                }
                O0(0);
            }
        }
        this.A0.removeView(jVar);
        d0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            sg.m1 m1Var = this.m0;
            m1Var.b.remove(uuid);
            m1Var.c.remove(uuid);
            org.telegram.messenger.g0.h3(new sg.t0(m1Var, 1));
        }
        tg.m1 m1Var2 = this.M0;
        cb.c cVar = this.N0;
        m1Var2.setValueOverride(cVar);
        m1Var2.setShowPreview(true);
        float f10 = cVar.get();
        sg.j1 j1Var = this.j1;
        j1Var.c = f10;
        B0(j1Var, null, false);
        if (this.W1 || !(jVar instanceof tg.r1)) {
            return;
        }
        va vaVar = ((x9) this).j2;
        ja jaVar = vaVar.X0;
        if (jaVar != null) {
            jaVar.s(null, null, true);
        }
        x9 x9Var = vaVar.v1;
        if (x9Var != null) {
            x9Var.n0();
        }
        la laVar = vaVar.c1;
        if (laVar != null) {
            laVar.setHasRoundVideo(false);
        }
        e7 e7Var = vaVar.K1;
        if (e7Var != null) {
            File file = e7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vaVar.K1.o0 = null;
            }
            if (vaVar.K1.p0 != null) {
                try {
                    new File(vaVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                vaVar.K1.p0 = null;
            }
        }
    }

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f10) {
    }

    public View getView() {
        return this;
    }
}

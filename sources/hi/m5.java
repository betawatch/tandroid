package hi;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.e20;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.si;
import org.telegram.messenger.xe;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.kh;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class m5 extends tt0 implements tg.g1, tg.h, tg.c1, rt0, oa {
    public final t4 A0;
    public ArrayList A1;
    public final h5 B0;
    public int B1;
    public final FrameLayout C0;
    public int C1;
    public final i5 D0;
    public sg.q D1;
    public final t4 E0;
    public final boolean E1;
    public final FrameLayout F0;
    public final File F1;
    public y4 G0;
    public final boolean G1;
    public final View H0;
    public final boolean H1;
    public int I0;
    public boolean I1;
    public int J0;
    public mi0 J1;
    public float K0;
    public tg.q1 K1;
    public ValueAnimator L0;
    public float L1;
    public boolean M0;
    public boolean M1;
    public final tg.m1 N0;
    public boolean N1;
    public final gc.b O0;
    public org.telegram.ui.Components.u9 O1;
    public final int P0;
    public final w5 P1;
    public BigInteger Q0;
    public final x5 Q1;
    public TextView R0;
    public boolean R1;
    public TextView S0;
    public ObjectAnimator S1;
    public TextView T0;
    public final float[] T1;
    public final tg.h1 U0;
    public a5 U1;
    public final tg.e1 V0;
    public boolean V1;
    public final tg.j1 W0;
    public boolean W1;
    public final ImageView X0;
    public boolean X1;
    public final TextView Y0;
    public final int[] Y1;
    public final TextView Z0;
    public ly Z1;
    public final TextView a1;
    public boolean a2;
    public final Paint b1;
    public boolean b2;
    public final Paint c1;
    public boolean c2;
    public float d1;
    public int d2;
    public boolean e1;
    public boolean e2;
    public r1.g f1;
    public int f2;
    public final u4 g1;
    public int g2;
    public final Paint h1;
    public int h2;
    public final Paint i1;
    public boolean i2;
    public final Paint j1;
    public final tg.v0 k0;
    public final sg.h1 k1;
    public final tg.z0 l0;
    public boolean l1;
    public final Bitmap m0;
    public r1.g m1;
    public final sg.k1 n0;
    public float n1;
    public final org.telegram.messenger.q5 o0;
    public final Paint o1;
    public final xe p0;
    public final int p1;
    public boolean q0;
    public final e5 q1;
    public nt0 r0;
    public org.telegram.ui.ActionBar.g1 r1;
    public boolean s0;
    public k5 s1;
    public tg.j t0;
    public Rect t1;
    public boolean u0;
    public Runnable u1;
    public int v0;
    public Runnable v1;
    public boolean w0;
    public final ra w1;
    public final boolean x0;
    public AnimatorSet x1;
    public final g5 y0;
    public final v4 y1;
    public final bi.o2 z0;
    public d7 z1;

    public m5(Context context, boolean z10, File file, boolean z11, boolean z12, ra raVar, Activity activity, final int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, d7 d7Var, int i11, int i12, xe xeVar, org.telegram.ui.Components.u9 u9Var, org.telegram.ui.ActionBar.e6 e6Var, w5 w5Var, x5 x5Var) {
        super(context, activity);
        Paint paint;
        org.telegram.ui.Components.u9 u9Var2;
        this.I0 = 0;
        this.J0 = -1;
        final u9 u9Var3 = (u9) this;
        gc.b bVar = new gc.b(u9Var3, 4);
        this.O0 = bVar;
        Paint paint2 = new Paint(1);
        this.b1 = paint2;
        Paint paint3 = new Paint(1);
        this.c1 = paint3;
        this.h1 = new Paint(1);
        this.i1 = new Paint(1);
        Paint paint4 = new Paint(1);
        this.j1 = paint4;
        sg.h1 h1Var = new sg.h1(1.0f, 0.016773745f, -1);
        this.k1 = h1Var;
        this.o1 = new Paint(1);
        this.T1 = new float[2];
        this.W1 = false;
        this.Y1 = new int[2];
        new a8.sa(u9Var3, 27);
        setDelegate(this);
        this.O1 = u9Var;
        this.P1 = w5Var;
        this.E1 = z10;
        this.F1 = file;
        this.G1 = z11;
        this.H1 = z12;
        this.w1 = raVar;
        this.B1 = i11;
        this.C1 = i12;
        this.Q1 = x5Var;
        this.p1 = i7;
        e5 e5Var = new e5(0, e6Var);
        this.q1 = e5Var;
        this.p0 = xeVar;
        this.x0 = context instanceof BubbleActivity;
        sg.k0 e10 = sg.k0.e(i7);
        e10.i(0, true);
        h1Var.a = e10.c();
        h1Var.c = e10.i;
        org.telegram.messenger.q5 q5Var = new org.telegram.messenger.q5("Paint", true);
        this.o0 = q5Var;
        this.m0 = bitmap;
        this.P0 = i10;
        sg.k1 k1Var = new sg.k1();
        this.n0 = k1Var;
        k1Var.a = new di.z6(u9Var3, 20);
        View view = new View(context);
        this.H0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        sg.i0 i0Var = new sg.i0(getPaintingSize(), null, i10, u9Var);
        if (d7Var == null || !d7Var.u) {
            paint = paint4;
            u9Var2 = u9Var;
        } else {
            paint = paint4;
            u9Var2 = null;
        }
        int i13 = 1;
        g5 g5Var = new g5(u9Var3, context, i0Var, bitmap, bitmap2, u9Var2);
        this.y0 = g5Var;
        g5Var.setDelegate(new d6.i(u9Var3, 26));
        g5Var.setUndoStore(k1Var);
        g5Var.setQueue(q5Var);
        g5Var.setVisibility(4);
        bi.o2 o2Var = new bi.o2(2, context, u9Var3);
        this.z0 = o2Var;
        o2Var.setVisibility(4);
        h5 h5Var = new h5(u9Var3, context, new l0(u9Var3, i13));
        this.B0 = h5Var;
        this.z1 = d7Var;
        this.A1 = arrayList;
        if (this.B1 > 0 && this.C1 > 0) {
            E0();
        }
        h5Var.setVisibility(4);
        this.A0 = new t4(u9Var3, context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.C0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{TLObject.FLAG_30, 0}));
        addView(frameLayout, c8.ja.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        final int i14 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: hi.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        g5 g5Var2 = u9Var4.y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof sg.g)) {
                            g5Var2.b();
                            u9Var4.U0.setSelectedIndex(1);
                            u9Var4.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            u9Var4.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        u9 u9Var5 = u9Var3;
                        g5 g5Var3 = u9Var5.y0;
                        sg.k1 k1Var2 = u9Var5.n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof sg.g)) {
                                g5Var3.b();
                                u9Var5.U0.setSelectedIndex(1);
                                u9Var5.w((sg.h) sg.h.a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            u9Var5.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        u9 u9Var6 = u9Var3;
                        tg.j jVar = u9Var6.t0;
                        if (jVar instanceof tg.n2) {
                            org.telegram.messenger.g0.v1(((tg.n2) jVar).getFocusedView());
                        }
                        if (u9Var6.a2) {
                            u9Var6.s0(false);
                        }
                        u9Var6.z0(u9Var6.t0);
                        u9Var6.A0(null, true);
                        break;
                    case 3:
                        u9Var3.A0(null, true);
                        break;
                    default:
                        u9 u9Var7 = u9Var3;
                        if (!u9Var7.l1) {
                            if (!u9Var7.a2) {
                                if (!u9Var7.u0) {
                                    Runnable runnable = u9Var7.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    u9Var7.A0(null, true);
                                    break;
                                }
                            } else {
                                u9Var7.s0(true);
                                break;
                            }
                        } else {
                            u9Var7.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, c8.ja.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.M0(2131747267, null));
        linearLayout.addView(i20.e(context, R.drawable.photo_zoomout), c8.ja.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, c8.ja.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.o(6));
        frameLayout.addView(linearLayout, c8.ja.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.Y0 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(hd.M0(2131747279, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        final int i15 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: hi.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        g5 g5Var2 = u9Var4.y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof sg.g)) {
                            g5Var2.b();
                            u9Var4.U0.setSelectedIndex(1);
                            u9Var4.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            u9Var4.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        u9 u9Var5 = u9Var3;
                        g5 g5Var3 = u9Var5.y0;
                        sg.k1 k1Var2 = u9Var5.n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof sg.g)) {
                                g5Var3.b();
                                u9Var5.U0.setSelectedIndex(1);
                                u9Var5.w((sg.h) sg.h.a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            u9Var5.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        u9 u9Var6 = u9Var3;
                        tg.j jVar = u9Var6.t0;
                        if (jVar instanceof tg.n2) {
                            org.telegram.messenger.g0.v1(((tg.n2) jVar).getFocusedView());
                        }
                        if (u9Var6.a2) {
                            u9Var6.s0(false);
                        }
                        u9Var6.z0(u9Var6.t0);
                        u9Var6.A0(null, true);
                        break;
                    case 3:
                        u9Var3.A0(null, true);
                        break;
                    default:
                        u9 u9Var7 = u9Var3;
                        if (!u9Var7.l1) {
                            if (!u9Var7.a2) {
                                if (!u9Var7.u0) {
                                    Runnable runnable = u9Var7.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    u9Var7.A0(null, true);
                                    break;
                                }
                            } else {
                                u9Var7.s0(true);
                                break;
                            }
                        } else {
                            u9Var7.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView2, c8.ja.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.Z0 = k10;
        k10.setBackground(org.telegram.ui.ActionBar.j6.h0(822083583, 7, -1));
        k10.setText(hd.M0(2131752101, null));
        k10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        k10.setGravity(16);
        k10.setTextColor(-1);
        k10.setTypeface(org.telegram.messenger.g0.o());
        k10.setTextSize(1, 16.0f);
        final int i16 = 2;
        k10.setOnClickListener(new View.OnClickListener() { // from class: hi.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        g5 g5Var2 = u9Var4.y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof sg.g)) {
                            g5Var2.b();
                            u9Var4.U0.setSelectedIndex(1);
                            u9Var4.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            u9Var4.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        u9 u9Var5 = u9Var3;
                        g5 g5Var3 = u9Var5.y0;
                        sg.k1 k1Var2 = u9Var5.n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof sg.g)) {
                                g5Var3.b();
                                u9Var5.U0.setSelectedIndex(1);
                                u9Var5.w((sg.h) sg.h.a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            u9Var5.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        u9 u9Var6 = u9Var3;
                        tg.j jVar = u9Var6.t0;
                        if (jVar instanceof tg.n2) {
                            org.telegram.messenger.g0.v1(((tg.n2) jVar).getFocusedView());
                        }
                        if (u9Var6.a2) {
                            u9Var6.s0(false);
                        }
                        u9Var6.z0(u9Var6.t0);
                        u9Var6.A0(null, true);
                        break;
                    case 3:
                        u9Var3.A0(null, true);
                        break;
                    default:
                        u9 u9Var7 = u9Var3;
                        if (!u9Var7.l1) {
                            if (!u9Var7.a2) {
                                if (!u9Var7.u0) {
                                    Runnable runnable = u9Var7.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    u9Var7.A0(null, true);
                                    break;
                                }
                            } else {
                                u9Var7.s0(true);
                                break;
                            }
                        } else {
                            u9Var7.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        k10.setAlpha(0.0f);
        k10.setVisibility(8);
        TextView k11 = org.telegram.ui.Cells.y0.k(frameLayout, k10, c8.ja.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.a1 = k11;
        k11.setBackground(org.telegram.ui.ActionBar.j6.h0(822083583, 7, -1));
        k11.setText(hd.M0(2131751354, null));
        k11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        k11.setGravity(16);
        k11.setTextColor(-1);
        k11.setTypeface(org.telegram.messenger.g0.o());
        k11.setTextSize(1, 16.0f);
        final int i17 = 3;
        k11.setOnClickListener(new View.OnClickListener() { // from class: hi.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        g5 g5Var2 = u9Var4.y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof sg.g)) {
                            g5Var2.b();
                            u9Var4.U0.setSelectedIndex(1);
                            u9Var4.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            u9Var4.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        u9 u9Var5 = u9Var3;
                        g5 g5Var3 = u9Var5.y0;
                        sg.k1 k1Var2 = u9Var5.n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof sg.g)) {
                                g5Var3.b();
                                u9Var5.U0.setSelectedIndex(1);
                                u9Var5.w((sg.h) sg.h.a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            u9Var5.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        u9 u9Var6 = u9Var3;
                        tg.j jVar = u9Var6.t0;
                        if (jVar instanceof tg.n2) {
                            org.telegram.messenger.g0.v1(((tg.n2) jVar).getFocusedView());
                        }
                        if (u9Var6.a2) {
                            u9Var6.s0(false);
                        }
                        u9Var6.z0(u9Var6.t0);
                        u9Var6.A0(null, true);
                        break;
                    case 3:
                        u9Var3.A0(null, true);
                        break;
                    default:
                        u9 u9Var7 = u9Var3;
                        if (!u9Var7.l1) {
                            if (!u9Var7.a2) {
                                if (!u9Var7.u0) {
                                    Runnable runnable = u9Var7.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    u9Var7.A0(null, true);
                                    break;
                                }
                            } else {
                                u9Var7.s0(true);
                                break;
                            }
                        } else {
                            u9Var7.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        k11.setAlpha(0.0f);
        k11.setVisibility(8);
        frameLayout.addView(k11, c8.ja.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        i5 i5Var = new i5(u9Var3, context, e10);
        this.D0 = i5Var;
        i5Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        i5Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(i5Var, c8.ja.e(-1, ns.p1, 80));
        tg.h1 h1Var2 = new tg.h1(context, (d7Var == null || d7Var.v() || d7Var.u || u9Var == null) ? false : true);
        this.U0 = h1Var2;
        h1Var2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        h1Var2.setDelegate(this);
        h1Var2.setSelectedIndex(1);
        i5Var.addView(h1Var2, c8.ja.c(48.0f, -1));
        tg.e1 e1Var = new tg.e1(context);
        this.V0 = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        e1Var.setVisibility(8);
        e1Var.setDelegate(this);
        final int i18 = 1;
        post(new Runnable() { // from class: hi.e4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        sg.h1 h1Var3 = u9Var4.k1;
                        u9Var4.C0(h1Var3);
                        sg.k0.e(i7).j(h1Var3.c);
                        break;
                    default:
                        u9Var3.V0.setTypeface(sg.k0.e(i7).j);
                        break;
                }
            }
        });
        e1Var.setAlignment(sg.k0.e(i7).g);
        i5Var.addView(e1Var, c8.ja.c(48.0f, -1));
        t4 t4Var = new t4(u9Var3, context, 0);
        this.E0 = t4Var;
        addView(t4Var, c8.ja.c(-1.0f, -1));
        tg.j1 j1Var = new tg.j1(context);
        this.W0 = j1Var;
        j1Var.setVisibility(8);
        j1Var.setOnItemClickListener(new bi.b6(u9Var3, 11));
        e1Var.setTypefaceListView(j1Var);
        t4Var.addView(j1Var, c8.ja.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(352321535);
        paint3.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, e5Var));
        u4 u4Var = new u4(u9Var3, context);
        this.g1 = u4Var;
        u4Var.setVisibility(8);
        u4Var.setColorPalette(sg.k0.e(i7));
        u4Var.setColorListener(new bi.i6(u9Var3, 2));
        i5Var.addView(u4Var, c8.ja.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        tg.v0 v0Var = new tg.v0(context);
        this.k0 = v0Var;
        v0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        v0Var.setBackground(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        i5Var.addView(v0Var, c8.ja.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        final int i19 = 4;
        v0Var.setOnClickListener(new View.OnClickListener() { // from class: hi.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i19) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        g5 g5Var2 = u9Var4.y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof sg.g)) {
                            g5Var2.b();
                            u9Var4.U0.setSelectedIndex(1);
                            u9Var4.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            u9Var4.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        u9 u9Var5 = u9Var3;
                        g5 g5Var3 = u9Var5.y0;
                        sg.k1 k1Var2 = u9Var5.n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof sg.g)) {
                                g5Var3.b();
                                u9Var5.U0.setSelectedIndex(1);
                                u9Var5.w((sg.h) sg.h.a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            u9Var5.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        u9 u9Var6 = u9Var3;
                        tg.j jVar = u9Var6.t0;
                        if (jVar instanceof tg.n2) {
                            org.telegram.messenger.g0.v1(((tg.n2) jVar).getFocusedView());
                        }
                        if (u9Var6.a2) {
                            u9Var6.s0(false);
                        }
                        u9Var6.z0(u9Var6.t0);
                        u9Var6.A0(null, true);
                        break;
                    case 3:
                        u9Var3.A0(null, true);
                        break;
                    default:
                        u9 u9Var7 = u9Var3;
                        if (!u9Var7.l1) {
                            if (!u9Var7.a2) {
                                if (!u9Var7.u0) {
                                    Runnable runnable = u9Var7.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    u9Var7.A0(null, true);
                                    break;
                                }
                            } else {
                                u9Var7.s0(true);
                                break;
                            }
                        } else {
                            u9Var7.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        tg.z0 z0Var = new tg.z0(context);
        this.l0 = z0Var;
        z0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        z0Var.setBackground(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        z0Var.setOnClickListener(new ah.g(u9Var3, context, e10, 15));
        i5Var.addView(z0Var, c8.ja.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        tg.m1 m1Var = new tg.m1(context);
        this.N0 = m1Var;
        m1Var.setColorSwatch(h1Var);
        m1Var.setRenderView(g5Var);
        m1Var.setValueOverride(bVar);
        h1Var.c = bVar.get();
        final int i20 = 0;
        m1Var.setOnUpdate(new Runnable() { // from class: hi.e4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        sg.h1 h1Var3 = u9Var4.k1;
                        u9Var4.C0(h1Var3);
                        sg.k0.e(i7).j(h1Var3.c);
                        break;
                    default:
                        u9Var3.V0.setTypeface(sg.k0.e(i7).j);
                        break;
                }
            }
        });
        addView(m1Var, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.F0 = frameLayout2;
        addView(frameLayout2, c8.ja.c(-1.0f, -1));
        Paint paint5 = paint;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        B0(h1Var, null, false);
        w((sg.h) sg.h.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        }
        this.y1 = new v4(u9Var3, raVar, new ai.v1(14, u9Var3, raVar));
        i2.C1 = 1;
    }

    public static void D0(tg.n2 n2Var, int i7) {
        n2Var.setAlign(i7);
        int i10 = 2;
        n2Var.getEditText().setGravity(i7 != 1 ? i7 != 2 ? 19 : 21 : 17);
        if (i7 == 1) {
            i10 = 4;
        } else if (i7 == 2 ? !hd.a0 : hd.a0) {
            i10 = 3;
        }
        n2Var.getEditText().setTextAlignment(i10);
    }

    public static void X(u9 u9Var, sg.k0 k0Var, Integer num) {
        k0Var.h(num.intValue(), true);
        k0Var.g();
        u9Var.setNewColor(num.intValue());
        u9Var.g1.setSelectedColorIndex(k0Var.d());
        u9Var.D1 = null;
    }

    public static /* synthetic */ void Y(u9 u9Var, Integer num) {
        u9Var.setNewColor(num.intValue());
        u9Var.F0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.I0 == 2 ? this.V0 : this.U0;
    }

    private int getFrameRotation() {
        int i7 = this.P0;
        if (i7 == 90) {
            return 1;
        }
        if (i7 != 180) {
            return i7 != 270 ? 0 : 3;
        }
        return 2;
    }

    private nt0 getPaintingSize() {
        nt0 nt0Var = this.r0;
        if (nt0Var != null) {
            return nt0Var;
        }
        nt0 nt0Var2 = new nt0(1080.0f, 1920.0f);
        this.r0 = nt0Var2;
        return nt0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i7 = 0;
        while (true) {
            h5 h5Var = this.B0;
            if (i7 >= h5Var.getChildCount()) {
                return;
            }
            View childAt = h5Var.getChildAt(i7);
            if (childAt instanceof tg.f2) {
                ImageReceiver imageReceiver = ((tg.f2) childAt).y0;
                ch0 B = imageReceiver.B();
                org.telegram.ui.Components.t5 m10 = imageReceiver.m();
                boolean z11 = !z10;
                imageReceiver.v0 = z11;
                imageReceiver.u0 = z11;
                if (B != null) {
                    if (z10) {
                        B.stop();
                    } else {
                        B.start();
                    }
                } else if (m10 != null) {
                    m10.E = z10;
                    if (z10) {
                        m10.x(false);
                    }
                    if (z10) {
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
        sg.h1 h1Var = this.k1;
        int i10 = h1Var.a;
        h1Var.a = i7;
        B0(h1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new g4(this, i10, i7, 0));
        duration.start();
    }

    private void setTextType(int i7) {
        this.v0 = i7;
        tg.j jVar = this.t0;
        if (jVar instanceof tg.n2) {
            ((tg.n2) jVar).setType(i7);
        }
        sg.k0 e10 = sg.k0.e(this.p1);
        e10.h = i7;
        e10.a.edit().putInt("text_type", i7).apply();
        this.V0.e(i7, true);
    }

    private void setupTabsLayout(Context context) {
        y4 y4Var = new y4(this, context);
        this.G0 = y4Var;
        final int i7 = 0;
        y4Var.setClipToPadding(false);
        this.G0.setOrientation(0);
        this.D0.addView(this.G0, c8.ja.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.R0 = textView;
        textView.setText(hd.M0(2131747277, null).toUpperCase());
        TextView textView2 = this.R0;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        e5 e5Var = this.q1;
        org.telegram.ui.ActionBar.q6.Q(textView2, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i10, e5Var), 7, -1), null, org.telegram.ui.ActionBar.q6.M(i10), e5Var);
        this.R0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.R0.setTextColor(-1);
        final int i11 = 1;
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(org.telegram.messenger.g0.o());
        this.R0.setSingleLine();
        this.R0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.z3
            public final /* synthetic */ m5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        m5 m5Var = this.b;
                        if (!m5Var.u0) {
                            m5Var.O0(0);
                            break;
                        } else {
                            m5Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        m5 m5Var2 = this.b;
                        m5Var2.O0(2);
                        if (!(m5Var2.t0 instanceof tg.n2)) {
                            m5Var2.V1 = true;
                            m5Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.G0.addView(this.R0, c8.ja.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.S0 = textView3;
        textView3.setText(hd.M0(2131747276, null).toUpperCase());
        org.telegram.ui.ActionBar.q6.Q(this.S0, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i10, e5Var), 7, -1), null, org.telegram.ui.ActionBar.q6.M(i10), e5Var);
        this.S0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.z3
            public final /* synthetic */ m5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        m5 m5Var = this.b;
                        if (!m5Var.u0) {
                            m5Var.O0(0);
                            break;
                        } else {
                            m5Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        m5 m5Var2 = this.b;
                        m5Var2.O0(2);
                        if (!(m5Var2.t0 instanceof tg.n2)) {
                            m5Var2.V1 = true;
                            m5Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.S0.setTextColor(-1);
        this.S0.setTextSize(1, 14.0f);
        this.S0.setGravity(1);
        this.S0.setTypeface(org.telegram.messenger.g0.o());
        this.S0.setAlpha(0.6f);
        this.S0.setSingleLine();
        this.G0.addView(this.S0, c8.ja.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.T0 = textView4;
        textView4.setText(hd.M0(2131747275, null).toUpperCase());
        org.telegram.ui.ActionBar.q6.Q(this.T0, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i10, e5Var), 7, -1), null, org.telegram.ui.ActionBar.q6.M(i10), e5Var);
        this.T0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.T0.setTextColor(-1);
        this.T0.setTextSize(1, 14.0f);
        this.T0.setGravity(1);
        this.T0.setTypeface(org.telegram.messenger.g0.o());
        this.T0.setAlpha(0.6f);
        this.T0.setSingleLine();
        final int i12 = 2;
        this.T0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.z3
            public final /* synthetic */ m5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        m5 m5Var = this.b;
                        if (!m5Var.u0) {
                            m5Var.O0(0);
                            break;
                        } else {
                            m5Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        m5 m5Var2 = this.b;
                        m5Var2.O0(2);
                        if (!(m5Var2.t0 instanceof tg.n2)) {
                            m5Var2.V1 = true;
                            m5Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.G0.addView(this.T0, c8.ja.l(1.0f, 0, -2));
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
        K0(new j4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final boolean A0(tg.j jVar, boolean z10) {
        boolean z11;
        cb cbVar;
        cb cbVar2;
        mi0 mi0Var;
        int i7;
        boolean z12 = jVar instanceof tg.n2;
        int i10 = 2;
        if (z12 && (((i7 = this.J0) == -1 && this.I0 != 2) || (i7 != -1 && i7 != 2))) {
            ValueAnimator valueAnimator = this.L0;
            if (valueAnimator != null && i7 != 2) {
                valueAnimator.cancel();
            }
            if (this.l1) {
                F0(false);
            }
            O0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            tg.n2 n2Var = (tg.n2) jVar;
            int gravity = n2Var.getEditText().getGravity();
            if (gravity == 17) {
                i10 = 1;
            } else if (gravity != 21) {
                i10 = 0;
            }
            tg.e1 e1Var = this.V0;
            e1Var.setAlignment(i10);
            sg.a0 typeface = n2Var.getTypeface();
            if (typeface != null) {
                e1Var.setTypeface(typeface.a);
            }
            e1Var.e(n2Var.getType(), true);
            this.E0.invalidate();
        }
        tg.j jVar2 = this.t0;
        if (jVar2 == null) {
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!jVar.e0) {
                    if (jVar instanceof tg.n0) {
                        tg.n0 n0Var = (tg.n0) jVar;
                        n0Var.setType((n0Var.getType() + 1) % n0Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof tg.o2) {
                        tg.o2 o2Var = (tg.o2) jVar;
                        o2Var.setType((o2Var.getType() + 1) % o2Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof tg.k0) {
                        tg.k0 k0Var = (tg.k0) jVar;
                        tg.i0 i0Var = k0Var.r0;
                        if (i0Var.e()) {
                            i0Var.setPreviewType(i0Var.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        k0Var.setType(k0Var.getNextType());
                        return true;
                    }
                    if (!this.u0) {
                        if (jVar instanceof tg.n2) {
                            this.w0 = true;
                            o0();
                            return true;
                        }
                        if (!(jVar instanceof tg.q1)) {
                            J0(jVar2);
                            return true;
                        }
                        tg.q1 q1Var = (tg.q1) jVar;
                        if (this.M1 && this.K1 == jVar) {
                            q1Var.q(true);
                            return true;
                        }
                        tg.q1 q1Var2 = this.K1;
                        if (q1Var2 != null && q1Var2 != q1Var && (mi0Var = this.J1) != null) {
                            mi0Var.animate().alpha(0.0f).setListener(new ai.j0(mi0Var, 22));
                            this.J1 = null;
                            this.M1 = false;
                            this.L1 = 0.0f;
                        }
                        if (this.J1 == null) {
                            mi0 mi0Var2 = new mi0(2, this.p1, getContext(), LaunchActivity.Q(), new fi.i2(6, new fi.b()));
                            this.J1 = mi0Var2;
                            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(this.O1, mi0Var2, 0, false);
                            this.J1.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                            this.w1.addView(this.J1, c8.ja.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.a.o(-16777216, 120));
                            this.J1.setDelegate(new a8.r7(this, y9Var, paint));
                            this.J1.p(null, null, true);
                        }
                        this.J1.setFragment(LaunchActivity.Q());
                        this.K1 = q1Var;
                        L0(true);
                        return true;
                    }
                    if (jVar2 instanceof tg.n2) {
                        org.telegram.messenger.g0.J3(((tg.n2) jVar2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.n0, false);
            tg.j jVar3 = this.t0;
            if (jVar3 instanceof tg.n2) {
                tg.n2 n2Var2 = (tg.n2) jVar3;
                tg.m2 m2Var = n2Var2.r0;
                m2Var.clearFocus();
                m2Var.setEnabled(false);
                m2Var.setClickable(false);
                n2Var2.m();
                if (!z12) {
                    this.u0 = false;
                    org.telegram.messenger.g0.v1(((tg.n2) this.t0).getFocusedView());
                    s0(false);
                }
            } else if ((jVar3 instanceof tg.r1) && (cbVar2 = ((u9) this).k2.a1) != null) {
                cbVar2.l(false);
            }
            z11 = true;
        }
        tg.j jVar4 = this.t0;
        this.t0 = jVar;
        if ((jVar4 instanceof tg.n2) && TextUtils.isEmpty(((tg.n2) jVar4).getText())) {
            z0(jVar4);
        }
        tg.j jVar5 = this.t0;
        if (jVar4 != jVar5 && (jVar5 instanceof tg.r1) && (cbVar = ((u9) this).k2.a1) != null) {
            cbVar.l(true);
        }
        tg.j jVar6 = this.t0;
        gc.b bVar = this.O0;
        sg.h1 h1Var = this.k1;
        tg.m1 m1Var = this.N0;
        if (jVar6 != null) {
            t4 t4Var = this.A0;
            jVar6.n0 = t4Var;
            jVar6.l(t4Var, true);
            tg.j jVar7 = this.t0;
            if (jVar7 instanceof tg.n2) {
                tg.n2 n2Var3 = (tg.n2) jVar7;
                n2Var3.getSwatch().c = h1Var.c;
                n2Var3.A0 = false;
                C0(n2Var3.getSwatch());
                m1Var.setValueOverride(new w4(n2Var3, (int) (this.r0.a / 9.0f), 0));
                m1Var.setShowPreview(false);
            } else {
                m1Var.setValueOverride(bVar);
                m1Var.setShowPreview(true);
                h1Var.c = bVar.get();
                B0(h1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.L0;
            if (valueAnimator2 != null && this.J0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.l1) {
                F0(false);
            }
            O0(0);
            m1Var.setValueOverride(bVar);
            m1Var.setShowPreview(true);
            h1Var.c = bVar.get();
            B0(h1Var, null, false);
            z13 = z11;
        }
        R0();
        return z13;
    }

    public final void B0(sg.h1 h1Var, Integer num, boolean z10) {
        sg.h1 h1Var2 = this.k1;
        if (h1Var2 != h1Var) {
            h1Var2.a = h1Var.a;
            h1Var2.b = h1Var.b;
            h1Var2.c = h1Var.c;
            int i7 = this.p1;
            sg.k0.e(i7).h(h1Var.a, true);
            sg.k0.e(i7).j(h1Var.c);
        }
        int i10 = h1Var.a;
        g5 g5Var = this.y0;
        g5Var.setColor(i10);
        g5Var.setBrushSize(h1Var.c);
        int i11 = h1Var2.a;
        int i12 = 0;
        if (num == null || num.intValue() == i11) {
            i5 i5Var = this.D0;
            if (i5Var != null) {
                i5Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new a4(this, num, i11, i12));
            duration.start();
        }
        tg.j jVar = this.t0;
        if (jVar instanceof tg.n2) {
            ((tg.n2) jVar).setSwatch(new sg.h1(h1Var.b, h1Var.c, h1Var.a));
            return;
        }
        if (z10 && (jVar instanceof tg.n0)) {
            ((tg.n0) jVar).setColor(h1Var.a);
            ((tg.n0) this.t0).setType(3);
        } else if (z10 && (jVar instanceof tg.o2)) {
            ((tg.o2) jVar).setColor(h1Var.a);
            ((tg.o2) this.t0).setType(3);
        } else if (z10 && (jVar instanceof tg.k0)) {
            ((tg.k0) jVar).setColor(h1Var.a);
            ((tg.k0) this.t0).setType(0);
        }
    }

    public final void C0(sg.h1 h1Var) {
        B0(h1Var, null, false);
    }

    @Override // tg.c1
    public final void D() {
        M0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, android.view.ViewGroup, hi.h5] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void E0() {
        int i7;
        float f10;
        org.telegram.messenger.g6[] g6VarArr;
        tg.j jVar;
        tg.j jVar2;
        ArrayList arrayList = this.A1;
        if (arrayList == null) {
            return;
        }
        d7 d7Var = this.z1;
        this.z1 = null;
        this.A1 = null;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? r14 = this.B0;
            if (i10 >= size) {
                r14.setVisibility(z10 ? 1 : 0);
                return;
            }
            e20 e20Var = (e20) arrayList.get(i10);
            byte b10 = e20Var.a;
            if (b10 == 0) {
                d5 k02 = k0(e20Var.C, e20Var.B);
                if ((2 & e20Var.b) != 0) {
                    k02.r(z10);
                }
                ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                layoutParams.width = e20Var.q;
                layoutParams.height = e20Var.r;
                i7 = size;
                jVar2 = k02;
            } else if (b10 == 1) {
                tg.n2 l02 = l0(z10);
                l02.setType(e20Var.b);
                l02.setTypeface(e20Var.n);
                l02.setBaseFontSize(e20Var.m);
                SpannableString spannableString = new SpannableString(e20Var.j);
                ?? r42 = e20Var.k;
                int size2 = r42.size();
                for (?? r62 = z10; r62 < size2; r62++) {
                    d20 d20Var = (d20) r42.get(r62);
                    org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(d20Var.document_id, 1.0f, l02.getFontMetricsInt());
                    int i11 = d20Var.offset;
                    spannableString.setSpan(p5Var, i11, d20Var.length + i11, 33);
                    size = size;
                }
                i7 = size;
                CharSequence m10 = org.telegram.messenger.j6.m(spannableString, l02.getFontMetricsInt(), false, null, 0);
                if ((m10 instanceof Spanned) && (g6VarArr = (org.telegram.messenger.g6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.g6.class)) != null) {
                    for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                        g6Var.b = 0.85f;
                    }
                }
                l02.setText(m10);
                D0(l02, e20Var.p);
                sg.h1 swatch = l02.getSwatch();
                swatch.a = e20Var.l;
                l02.setSwatch(swatch);
                jVar2 = l02;
            } else {
                i7 = size;
                if (b10 == 2) {
                    tg.n1 h02 = h0(e20Var.j, false);
                    h02.H0 = e20Var.u;
                    h02.C0 = false;
                    if ((2 & e20Var.b) != 0) {
                        h02.r(false);
                    }
                    if ((e20Var.b & 16) != 0) {
                        h02.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                    layoutParams2.width = e20Var.q;
                    layoutParams2.height = e20Var.r;
                    jVar2 = h02;
                } else {
                    if (b10 == 6) {
                        ArrayList arrayList2 = d7Var.v;
                        boolean z11 = d7Var.K;
                        this.V1 = true;
                        f10 = 1.0f;
                        tg.j c5Var = new c5(this, getContext(), c0(), arrayList2, this.O1, z11, this.P1);
                        c5Var.setDelegate(this);
                        r14.addView(c5Var);
                        d0();
                        jVar = c5Var;
                        if (e20Var.q > 0) {
                            jVar = c5Var;
                            if (e20Var.r > 0) {
                                ViewGroup.LayoutParams layoutParams3 = c5Var.getLayoutParams();
                                layoutParams3.width = e20Var.q;
                                layoutParams3.height = e20Var.r;
                                jVar = c5Var;
                            }
                        }
                    } else {
                        f10 = 1.0f;
                        if (b10 == 3) {
                            tg.n0 g02 = g0(e20Var.N, e20Var.M);
                            int i12 = e20Var.l;
                            if (i12 != 0) {
                                g02.setColor(i12);
                            }
                            g02.setType(e20Var.b);
                            jVar = g02;
                        } else if (b10 == 8) {
                            pb pbVar = e20Var.O;
                            if (pbVar == null) {
                                i10++;
                                size = i7;
                                z10 = false;
                            } else {
                                tg.o2 m0 = m0(pbVar);
                                int i13 = e20Var.l;
                                if (i13 != 0) {
                                    m0.setColor(i13);
                                }
                                m0.setType(e20Var.b);
                                jVar = m0;
                            }
                        } else if (b10 == 7) {
                            tg.k0 f02 = f0(e20Var.W);
                            tg.i0 i0Var = f02.r0;
                            int i14 = e20Var.l;
                            if (i14 != 0) {
                                f02.setColor(i14);
                            }
                            boolean e10 = i0Var.e();
                            int i15 = i0Var.h;
                            int i16 = i0Var.f;
                            if (e10) {
                                i0Var.setPreviewType(e20Var.b);
                            }
                            byte b11 = e20Var.b;
                            if (b11 == -1) {
                                f02.setType(3);
                                i0Var.d();
                                e20Var.q = ((int) Math.ceil(i0Var.b0)) + i16 + i16;
                                e20Var.r = ((int) Math.ceil(i0Var.c0)) + i15 + i15;
                                PointF position = f02.getPosition();
                                position.y = (this.C1 * 0.3f) + position.y;
                                f02.setPosition(position);
                                i10++;
                                size = i7;
                                z10 = false;
                            } else {
                                f02.setType(b11);
                                jVar = f02;
                            }
                        } else if (b10 == 4) {
                            tg.q1 i02 = i0(false);
                            i02.s(ch.p0.d(e20Var.M.reaction), false);
                            if (e20Var.M.flipped) {
                                i02.r(false);
                            }
                            jVar = i02;
                            if (e20Var.M.dark) {
                                i02.q(false);
                                jVar = i02;
                            }
                        } else {
                            if (b10 == 5 && d7Var.o0 != null) {
                                tg.r1 j02 = j0(d7Var.p0, false);
                                sa saVar = ((u9) this).k2;
                                ga gaVar = saVar.Y0;
                                if (gaVar != null) {
                                    gaVar.x = j02;
                                    u51 u51Var = gaVar.y;
                                    if (u51Var != null) {
                                        u51Var.A0(j02.v0);
                                    }
                                }
                                ia iaVar = saVar.d1;
                                if (iaVar != null) {
                                    iaVar.setHasRoundVideo(true);
                                }
                                jVar = j02;
                                if ((e20Var.b & 2) != 0) {
                                    boolean z12 = !j02.s0;
                                    j02.s0 = z12;
                                    j02.t0.f(z12, true);
                                    j02.invalidate();
                                    jVar = j02;
                                }
                            }
                            i10++;
                            size = i7;
                            z10 = false;
                        }
                    }
                    jVar.setX((e20Var.c * this.B1) - (((f10 - e20Var.v) * e20Var.q) / 2.0f));
                    jVar.setY((e20Var.d * this.C1) - (((f10 - e20Var.v) * e20Var.r) / 2.0f));
                    jVar.setPosition(new PointF((e20Var.q / 2.0f) + jVar.getX(), (e20Var.r / 2.0f) + jVar.getY()));
                    jVar.setScale(e20Var.v);
                    jVar.setRotation((float) (((-e20Var.e) / 3.141592653589793d) * 180.0d));
                    i10++;
                    size = i7;
                    z10 = false;
                }
            }
            f10 = 1.0f;
            jVar = jVar2;
            jVar.setX((e20Var.c * this.B1) - (((f10 - e20Var.v) * e20Var.q) / 2.0f));
            jVar.setY((e20Var.d * this.C1) - (((f10 - e20Var.v) * e20Var.r) / 2.0f));
            jVar.setPosition(new PointF((e20Var.q / 2.0f) + jVar.getX(), (e20Var.r / 2.0f) + jVar.getY()));
            jVar.setScale(e20Var.v);
            jVar.setRotation((float) (((-e20Var.e) / 3.141592653589793d) * 180.0d));
            i10++;
            size = i7;
            z10 = false;
        }
    }

    public final void F0(final boolean z10) {
        if (this.l1 != z10) {
            this.l1 = z10;
            r1.g gVar = this.m1;
            if (gVar != null) {
                gVar.d();
            }
            r1.g gVar2 = new r1.g(new r1.f(z10 ? 0.0f : 1000.0f));
            this.m1 = gVar2;
            r1.h hVar = new r1.h();
            hVar.i = z10 ? 1000.0f : 0.0f;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.m = hVar;
            int i7 = 0;
            final boolean[] zArr = {this.y1.c() || this.d2 > 0};
            final float translationY = this.D0.getTranslationY();
            final float alpha = this.l0.getAlpha();
            final ViewGroup barView = getBarView();
            this.m1.b(new r1.d() { // from class: hi.b4
                @Override // r1.d
                public final void a(r1.g gVar3, float f10, float f11) {
                    m5 m5Var = m5.this;
                    i5 i5Var = m5Var.D0;
                    float f12 = f10 / 1000.0f;
                    m5Var.n1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(m5Var.n1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(m5Var.n1, 0.25f) / 0.25f));
                    u4 u4Var = m5Var.g1;
                    float f14 = m5Var.n1;
                    boolean z11 = z10;
                    u4Var.B1(z11, f14);
                    tg.z0 z0Var = m5Var.l0;
                    z0Var.setProgress(m5Var.n1);
                    tg.v0 v0Var = m5Var.k0;
                    v0Var.setProgress(m5Var.n1);
                    m5Var.G0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * m5Var.n1);
                    AnimatorSet animatorSet = m5Var.x1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f15 = m5Var.n1;
                        if (!z11) {
                            f15 = 1.0f - f15;
                        }
                        float f16 = z11 ? 1.0f : 0.0f;
                        float f17 = alpha;
                        z0Var.setAlpha(org.telegram.messenger.g0.T1(f17, f16, f15));
                        v0Var.setAlpha(org.telegram.messenger.g0.T1(f17, z11 ? 1.0f : 0.0f, f15));
                        i5Var.setTranslationY(translationY - ((org.telegram.messenger.g0.L(39.0f) * f15) * (z11 ? 1 : -1)));
                    }
                    i5Var.invalidate();
                    if (view == m5Var.V0) {
                        m5Var.E0.invalidate();
                    }
                }
            });
            this.m1.a(new c4(this, z10, i7));
            this.m1.h();
            if (z10) {
                u4 u4Var = this.g1;
                u4Var.setVisibility(0);
                u4Var.setSelectedColorIndex(sg.k0.e(this.p1).d());
            }
        }
    }

    public final void G0(int i7) {
        tg.e1 e1Var = this.V0;
        v4 v4Var = this.y1;
        int i10 = 1;
        if (i7 == 1) {
            ly lyVar = this.Z1;
            boolean z10 = lyVar != null && lyVar.getVisibility() == 0;
            ly lyVar2 = this.Z1;
            ra raVar = this.w1;
            if (lyVar2 != null && lyVar2.d1 != m10.t0) {
                raVar.removeView(lyVar2);
                this.Z1 = null;
            }
            if (this.Z1 == null) {
                ly lyVar3 = new ly(null, true, false, false, getContext(), false, null, null, true, this.q1, false, false);
                this.Z1 = lyVar3;
                lyVar3.y2 = false;
                lyVar3.V0 = true;
                lyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.Z1.setForseMultiwindowLayout(true);
                }
                this.Z1.setDelegate(new f5(this));
                raVar.addView(this.Z1);
            }
            this.Z1.setVisibility(0);
            this.a2 = true;
            ly lyVar4 = this.Z1;
            if (this.f2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f2 = np.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.g2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.g2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.g2 = np.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.q;
            int paddingUnderContainer = raVar.getPaddingUnderContainer() + (point.x > point.y ? this.g2 : this.f2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            lyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                tg.j jVar = this.t0;
                if (jVar instanceof tg.n2) {
                    org.telegram.messenger.g0.v1(((tg.n2) jVar).getEditText());
                }
            }
            this.d2 = paddingUnderContainer;
            v4Var.a();
            requestLayout();
            pg emojiButton = e1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(ng.d, true);
            }
            if (!z10) {
                if (this.b2) {
                    this.e2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d2, 0.0f);
                    ofFloat.addUpdateListener(new d4(this, i10));
                    ofFloat.addListener(new x4(this, i10));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                    ofFloat.start();
                }
            }
        } else {
            pg emojiButton2 = e1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(ng.e, true);
            }
            ly lyVar5 = this.Z1;
            if (lyVar5 != null) {
                this.a2 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    lyVar5.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.d2 = 0;
                v4Var.a();
            }
            requestLayout();
        }
        P0();
    }

    public final void H0(tg.k0 k0Var) {
        l7 l7Var = new l7(getContext(), this.q1, this.Q1, new ai.v1(16, this, k0Var));
        if (k0Var != null) {
            tg.h0 h0Var = k0Var.v0;
            l7Var.Y1 = true;
            org.telegram.ui.Cells.k3 k3Var = l7Var.V1;
            org.telegram.ui.Cells.k3 k3Var2 = l7Var.U1;
            if (h0Var != null) {
                l7Var.c2 = h0Var.d;
                l7Var.d2 = false;
                k3Var2.setText(h0Var.c);
                k3Var.setText(h0Var.b);
                l7Var.i2 = !TextUtils.isEmpty(h0Var.b);
                l7Var.j2 = h0Var.f;
                l7Var.k2 = h0Var.e;
            } else {
                k3Var2.setText("");
                k3Var.setText("");
                l7Var.j2 = true;
                l7Var.k2 = false;
            }
            String M0 = hd.M0(2131744641, null);
            d dVar = l7Var.X1;
            dVar.i(M0, false, true);
            di.f0 f0Var = l7Var.T1;
            if (f0Var != null) {
                f0Var.O(false);
            }
            dVar.setEnabled(l7Var.f1(k3Var2.getText().toString()));
            l7Var.Y1 = false;
        }
        l7Var.setOnDismissListener(new o4(this, 1));
        l7Var.show();
        w0(true);
    }

    public final void I0(tg.n0 n0Var, s10 s10Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ki kiVar = new ki(getContext(), new b5(this, s10Var), false, true, false, this.q1);
        kiVar.X3 = new w7.s(10);
        kh khVar = kiVar.v3;
        if (n0Var != null && (messageMedia = n0Var.v0) != null && (geoPoint = messageMedia.geo) != null) {
            kiVar.y4 = new double[]{geoPoint.lat, geoPoint._long};
            kiVar.J1 = true;
            khVar.setVisibility(8);
        } else if (this.E1) {
            kiVar.w4 = this.G1;
            kiVar.x4 = this.F1;
            kiVar.J1 = true;
            khVar.setVisibility(8);
        } else {
            kiVar.J1 = true;
            khVar.setVisibility(8);
        }
        kiVar.setOnDismissListener(new o4(this, 0));
        kiVar.e1();
        kiVar.show();
    }

    public final void J0(tg.j jVar) {
        if (jVar instanceof tg.u0) {
            org.telegram.ui.ActionBar.g1 g1Var = this.r1;
            if (g1Var == null || !g1Var.isShowing()) {
                return;
            }
            this.r1.d(true);
            return;
        }
        int[] iArr = this.Y1;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        h5 h5Var = this.B0;
        float scaleX2 = h5Var.getScaleX() * scaleX;
        float scaleY = h5Var.getScaleY() * jVar.getScaleY() * jVar.getHeight();
        int i7 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i7;
        int i10 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i10;
        K0(new i4(this, jVar, 1), this, 51, i7, i10 - org.telegram.messenger.g0.L(32.0f), true);
    }

    public final void K0(Runnable runnable, m5 m5Var, int i7, int i10, int i11, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = this.r1;
        if (g1Var != null && g1Var.isShowing()) {
            this.r1.d(true);
            return;
        }
        int i12 = 0;
        if (this.s1 == null) {
            this.t1 = new Rect();
            k5 k5Var = new k5(this, getContext());
            this.s1 = k5Var;
            k5Var.setAnimationEnabled(true);
            this.s1.setOnTouchListener(new k4(0, this));
            this.s1.setDispatchKeyEventListener(new l4(this));
            this.s1.setShownFromBottom(true);
        }
        k5 k5Var2 = this.s1;
        k5Var2.a0 = z10;
        k5Var2.d();
        runnable.run();
        if (this.r1 == null) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(this.s1, -2, -2);
            this.r1 = g1Var2;
            g1Var2.b = true;
            g1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.r1.setOutsideTouchable(true);
            this.r1.setClippingEnabled(true);
            this.r1.setInputMethodMode(2);
            this.r1.setSoftInputMode(0);
            this.r1.getContentView().setFocusableInTouchMode(true);
            this.r1.setOnDismissListener(new m4(i12, this));
        }
        this.s1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), TLObject.FLAG_31));
        this.r1.setFocusable(true);
        int measuredWidth = i10 - (this.s1.getMeasuredWidth() / 2);
        int measuredHeight = i11 - this.s1.getMeasuredHeight();
        this.r1.showAtLocation(m5Var, i7, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.g1.i(this.s1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            k5 k5Var3 = this.s1;
            k5Var3.setBackgroundDrawable(new org.telegram.ui.Components.x9(new org.telegram.ui.Components.y9(this.O1, k5Var3, 5, false), measuredWidth, measuredHeight, mutate, org.telegram.messenger.g0.N(8.3f)));
        } else {
            this.s1.setBackgroundDrawable(mutate);
            this.s1.setBackgroundColor(-14145495);
        }
    }

    @Override // org.telegram.ui.Components.rt0
    public final void L(int i7, boolean z10) {
        boolean z11;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.b2 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.g2 = i7;
                np.d1().edit().putInt("kbd_height_land3", this.g2).commit();
            } else {
                this.f2 = i7;
                np.d1().edit().putInt("kbd_height", this.f2).commit();
            }
        }
        boolean z12 = this.a2;
        v4 v4Var = this.y1;
        if (z12) {
            int paddingUnderContainer = this.w1.getPaddingUnderContainer() + (z10 ? this.g2 : this.f2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = org.telegram.messenger.g0.q.x;
            if (i10 != i11 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i11;
                layoutParams.height = paddingUnderContainer;
                this.Z1.setLayoutParams(layoutParams);
                this.d2 = layoutParams.height;
                v4Var.a();
                requestLayout();
            }
        }
        if (this.h2 == i7 && this.i2 == z10) {
            return;
        }
        this.h2 = i7;
        this.i2 = z10;
        boolean z13 = this.b2;
        tg.j jVar = this.t0;
        if (jVar instanceof tg.n2) {
            this.b2 = ((tg.n2) jVar).getEditText().isFocused() && v4Var.c();
        } else {
            this.b2 = false;
        }
        if (this.b2 && this.a2) {
            G0(0);
        }
        if (this.d2 != 0 && !(z11 = this.b2) && z11 != z13 && !this.a2) {
            this.d2 = 0;
            v4Var.a();
            requestLayout();
        }
        R0();
        if (z13 && !this.b2 && this.d2 > 0 && this.e2) {
            this.e2 = false;
        }
        P0();
    }

    public final void L0(boolean z10) {
        if (this.M1 != z10) {
            if (z10 || this.J1 != null) {
                this.M1 = z10;
                int i7 = 0;
                if (z10) {
                    this.J1.n();
                    this.J1.setVisibility(0);
                    this.J1.setSelectedReaction(this.K1.getCurrentReaction());
                    this.J1.getParent().bringChildToFront(this.J1);
                } else {
                    this.K1 = null;
                }
                if (!z10) {
                    if (this.J1.getReactionsWindow() != null) {
                        this.J1.getReactionsWindow().e();
                    }
                    this.J1.animate().alpha(0.0f).setDuration(150L).setListener(new x4(this, i7)).start();
                    return;
                }
                this.N1 = true;
                this.w1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L1, z10 ? 1.0f : 0.0f);
                this.J1.setTransitionProgress(this.L1);
                ofFloat.addUpdateListener(new d4(this, 2));
                ofFloat.addListener(new bi.v4(12, this, z10));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(er.g);
                ofFloat.start();
            }
        }
    }

    public final void M0(boolean z10) {
        if (this.e1 != z10) {
            this.e1 = z10;
            r1.g gVar = this.f1;
            if (gVar != null) {
                gVar.d();
            }
            r1.g gVar2 = new r1.g(new r1.f(z10 ? 0.0f : 1000.0f));
            this.f1 = gVar2;
            r1.h hVar = new r1.h();
            hVar.i = z10 ? 1000.0f : 0.0f;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.m = hVar;
            if (z10) {
                tg.j1 j1Var = this.W0;
                j1Var.setAlpha(0.0f);
                j1Var.setVisibility(0);
            }
            int i7 = 1;
            this.f1.b(new fi.t7(i7, this));
            this.f1.a(new c4(this, z10, i7));
            this.f1.h();
        }
    }

    public final PointF N0(tg.j jVar) {
        float f10;
        float f11;
        xe xeVar = this.p0;
        float f12 = xeVar != null ? 200.0f / xeVar.c : 200.0f;
        float f13 = 0.2f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f14 = xeVar != null ? 100.0f / xeVar.c : 100.0f;
        PointF c02 = c0();
        int i7 = 0;
        while (i7 < 10) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                h5 h5Var = this.B0;
                if (i10 >= h5Var.getChildCount()) {
                    break;
                }
                View childAt = h5Var.getChildAt(i10);
                if (!(childAt instanceof tg.j) || (childAt instanceof tg.u0)) {
                    f10 = f13;
                    f11 = f14;
                } else {
                    PointF position2 = ((tg.j) childAt).getPosition();
                    f10 = f13;
                    f11 = f14;
                    if (((float) Math.sqrt(Math.pow(position2.y - c02.y, 2.0d) + Math.pow(position2.x - c02.x, 2.0d))) < f11) {
                        f12 = Math.min(childAt.getHeight(), childAt.getWidth()) * f10;
                        z10 = true;
                    }
                }
                i10++;
                f14 = f11;
                f13 = f10;
            }
            float f15 = f13;
            float f16 = f14;
            if (!z10) {
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
        if (this.I0 == i7 || this.J0 == i7) {
            return;
        }
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = this.I0;
        ViewGroup viewGroup = this.V0;
        ViewGroup viewGroup2 = this.U0;
        ViewGroup viewGroup3 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        this.J0 = i7;
        ViewGroup viewGroup4 = i7 == 0 ? viewGroup2 : i7 == 2 ? viewGroup : null;
        int i11 = this.p1;
        sg.k0 e10 = sg.k0.e(i11);
        int i12 = 1;
        boolean z10 = i7 == 2;
        if (e10.l != z10) {
            e10.l = z10;
            if (z10) {
                e10.i(-1, false);
            } else {
                e10.i(e10.a.getInt("brush", 0), false);
            }
        }
        int c10 = sg.k0.e(i11).c();
        sg.h1 h1Var = this.k1;
        h1Var.a = c10;
        B0(h1Var, null, false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.L0 = duration;
        duration.setInterpolator(er.f);
        this.L0.addUpdateListener(new fi.b3(this, viewGroup3, viewGroup4, i12));
        this.L0.addListener(new z4(this, viewGroup3, viewGroup4, i7, 0));
        this.L0.start();
    }

    public final void P0() {
        v4 v4Var = this.y1;
        tg.e1 e1Var = this.V0;
        if (e1Var != null) {
            if (v4Var.c()) {
                e1Var.a(R.drawable.input_smile);
            } else if (this.a2) {
                e1Var.a(R.drawable.input_keyboard);
            } else {
                e1Var.a(R.drawable.msg_add);
            }
        }
        boolean z10 = v4Var.c() || this.a2;
        boolean z11 = !z10;
        org.telegram.messenger.g0.T3(1.0f, this.Y0, z11, false);
        org.telegram.messenger.g0.T3(1.0f, this.X0, z11, false);
        org.telegram.messenger.g0.T3(1.0f, this.a1, z10, false);
        org.telegram.messenger.g0.T3(1.0f, this.Z0, z10, false);
    }

    @Override // org.telegram.ui.Components.tt0, org.telegram.ui.Components.st0
    public final int Q() {
        return this.y1.l - this.w1.getBottomPadding2();
    }

    public final void Q0() {
        tg.j jVar;
        ObjectAnimator objectAnimator = this.S1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.y0.getParent();
        if (view == null) {
            return;
        }
        v4 v4Var = this.y1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!v4Var.c() || v4Var.d) && this.d2 <= 0) || (jVar = this.t0) == null) ? 0.0f : view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.S1 = ofFloat;
        ofFloat.setDuration(350L);
        this.S1.setInterpolator(er.h);
        this.S1.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0() {
        boolean z10;
        if (this.t0 instanceof tg.n2) {
            v4 v4Var = this.y1;
            if ((v4Var.c() || this.d2 > 0) && !v4Var.d) {
                z10 = true;
                View view = this.H0;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new ai.q(8, this, z10)).start();
            }
        }
        z10 = false;
        View view2 = this.H0;
        view2.animate().cancel();
        view2.setVisibility(0);
        view2.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new ai.q(8, this, z10)).start();
    }

    @Override // tg.g1, tg.c1
    public final void a() {
        F0(true);
    }

    @Override // org.telegram.ui.Components.st0, org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Di));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.a7));
    }

    @Override // tg.c1
    public final void b() {
        setTextType((this.v0 + 1) % 4);
    }

    public final void b0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new h4(0, this, view)).start();
    }

    @Override // tg.c1
    public final void c(int i7) {
        tg.j jVar = this.t0;
        if (jVar instanceof tg.n2) {
            D0((tg.n2) jVar, i7);
            sg.k0 e10 = sg.k0.e(this.p1);
            e10.g = i7;
            e10.a.edit().putInt("text_alignment", i7).apply();
        }
    }

    public final PointF c0() {
        h5 h5Var = this.B0;
        int measuredWidth = h5Var.getMeasuredWidth();
        int measuredHeight = h5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.C1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    public final void d0() {
        boolean z10 = this.G1;
        h5 h5Var = this.B0;
        boolean z11 = true;
        if (!z10 && !this.I1) {
            int i7 = 0;
            loop0: while (true) {
                if (i7 >= h5Var.getChildCount()) {
                    z11 = false;
                    break;
                }
                View childAt = h5Var.getChildAt(i7);
                boolean z12 = childAt instanceof tg.n2;
                int i10 = this.p1;
                if (z12) {
                    CharSequence text = ((tg.n2) childAt).getText();
                    if (text instanceof Spanned) {
                        for (org.telegram.ui.Components.p5 p5Var : (org.telegram.ui.Components.p5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.p5.class)) {
                            TLRPC.Document document = p5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.g5.e(i10, p5Var.getDocumentId());
                            }
                            if (document != null) {
                                org.telegram.ui.Components.g5.g(i10).e(document);
                            }
                            org.telegram.messenger.w7.G(i10);
                            if (d7.u(document, org.telegram.messenger.w7.J(document, null, true, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i7++;
                } else if (childAt instanceof tg.f2) {
                    TLRPC.Document sticker = ((tg.f2) childAt).getSticker();
                    org.telegram.messenger.w7.G(i10);
                    if (d7.u(sticker, org.telegram.messenger.w7.J(sticker, null, true, true).getAbsolutePath())) {
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
        for (int i11 = 0; i11 < h5Var.getChildCount(); i11++) {
            View childAt2 = h5Var.getChildAt(i11);
            if (childAt2 instanceof tg.j) {
                ((tg.j) childAt2).setIsVideo(z11);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.W1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        xe xeVar;
        if ((view == this.y0 || view == this.z0 || view == this.B0 || view == this.A0) && (xeVar = this.p0) != null) {
            canvas.save();
            r1 = this.x0 ? 0 : org.telegram.messenger.g0.m;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i7 = xeVar.k;
            if (i7 != 90 && i7 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * xeVar.e)) / xeVar.c);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * xeVar.f)) / xeVar.c);
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
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.E8, this.q1);
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
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        h5 h5Var = this.B0;
        float measuredWidth = h5Var.getMeasuredWidth() <= 0 ? this.B1 : h5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.k0 k0Var = new tg.k0(getContext(), N0, this.p1, h0Var, measuredWidth / 360.0f, L);
        if (N0.x == h5Var.getMeasuredWidth() / 2.0f) {
            k0Var.setStickyX(2);
        }
        if (N0.y == h5Var.getMeasuredHeight() / 2.0f) {
            k0Var.setStickyY(2);
        }
        sg.h1 h1Var = this.k1;
        if (h1Var != null && (i7 = h1Var.a) != -47814) {
            k0Var.setColor(i7);
        }
        k0Var.setDelegate(this);
        k0Var.setMaxWidth(L);
        h5Var.addView(k0Var, c8.ja.c(-2.0f, -2));
        d0();
        xe xeVar = this.p0;
        if (xeVar != null) {
            k0Var.j(1.0f / xeVar.c);
            k0Var.f(-(xeVar.k + xeVar.d));
        }
        return k0Var;
    }

    public final tg.n0 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i7;
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        h5 h5Var = this.B0;
        float measuredWidth = h5Var.getMeasuredWidth() <= 0 ? this.B1 : h5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.n0 n0Var = new tg.n0(getContext(), N0, this.p1, messageMedia, mediaArea, measuredWidth / 240.0f, L);
        if (N0.x == h5Var.getMeasuredWidth() / 2.0f) {
            n0Var.setStickyX(2);
        }
        if (N0.y == h5Var.getMeasuredHeight() / 2.0f) {
            n0Var.setStickyY(2);
        }
        sg.h1 h1Var = this.k1;
        if (h1Var != null && (i7 = h1Var.a) != -47814) {
            n0Var.setColor(i7);
        }
        n0Var.setDelegate(this);
        n0Var.setMaxWidth(L);
        h5Var.addView(n0Var, c8.ja.c(-2.0f, -2));
        d0();
        xe xeVar = this.p0;
        if (xeVar != null) {
            n0Var.j(1.0f / xeVar.c);
            n0Var.f(-(xeVar.k + xeVar.d));
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
        return this.y0.c(true, false);
    }

    public View getBottomLayout() {
        return this.D0;
    }

    public View getCancelView() {
        return this.k0;
    }

    public float getCropRotation() {
        xe xeVar = this.p0;
        if (xeVar != null) {
            return xeVar.d + xeVar.k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.l0;
    }

    public View getEntitiesView() {
        return this.B0;
    }

    public long getLcm() {
        return this.Q0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.p5[] p5VarArr;
        h5 h5Var = this.B0;
        int childCount = h5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = h5Var.getChildAt(i7);
            if (childAt instanceof tg.f2) {
                TLRPC.Document sticker = ((tg.f2) childAt).getSticker();
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
            } else if (childAt instanceof tg.n2) {
                CharSequence text = ((tg.n2) childAt).getText();
                if ((text instanceof Spanned) && (p5VarArr = (org.telegram.ui.Components.p5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.p5.class)) != null) {
                    for (org.telegram.ui.Components.p5 p5Var : p5VarArr) {
                        if (p5Var != null) {
                            TLRPC.Document document = p5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.g5.e(this.p1, p5Var.getDocumentId());
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
        return Arrays.asList(this.y0, this.z0, this.B0, this.A0);
    }

    public View getRenderInputView() {
        return this.z0;
    }

    public sg.u0 getRenderView() {
        return this.y0;
    }

    public tg.j getSelectedEntity() {
        return this.t0;
    }

    public View getSelectionEntitiesView() {
        return this.A0;
    }

    public View getTextDimView() {
        return this.H0;
    }

    public View getTopLayout() {
        return this.C0;
    }

    public View getWeightChooserView() {
        return this.N0;
    }

    public final tg.n1 h0(String str, boolean z10) {
        float f10;
        nt0 nt0Var;
        this.V1 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            f10 = 1.0f;
        }
        h5 h5Var = this.B0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.B1, h5Var.getMeasuredWidth()) * 0.5d);
            nt0Var = new nt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.C1, h5Var.getMeasuredHeight()) * 0.5d);
            nt0Var = new nt0(f10 * floor2, floor2);
        }
        nt0 nt0Var2 = nt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = nt0Var2.a;
            nt0Var2.a = nt0Var2.b;
            nt0Var2.b = f11;
        }
        Context context = getContext();
        PointF c02 = c0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        tg.n1 n1Var = new tg.n1(context, c02, nt0Var2, str, intValue);
        n1Var.setDelegate(this);
        h5Var.addView(n1Var);
        d0();
        return n1Var;
    }

    @Override // hi.oa
    public final boolean i(MotionEvent motionEvent) {
        if (this.W1) {
            return false;
        }
        if (this.t0 != null) {
            A0(null, true);
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y10);
        this.y0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final tg.q1 i0(boolean z10) {
        String str;
        nt0 nt0Var = new nt0(org.telegram.messenger.g0.L(106.0f), org.telegram.messenger.g0.L(106.0f));
        PointF c02 = c0();
        h5 h5Var = this.B0;
        if (h5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i7 = 0; i7 < h5Var.getChildCount(); i7++) {
                    View childAt = h5Var.getChildAt(i7);
                    if (a8.t9.a(c02.x, c02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < org.telegram.messenger.g0.L(6.0f)) {
                        break;
                    }
                }
                c02.x = (h5Var.getMeasuredWidth() * 0.05f) + c02.x;
                c02.y = (h5Var.getMeasuredHeight() * 0.05f) + c02.y;
                c02.x = Utilities.i(c02.x, h5Var.getMeasuredWidth(), 0.0f);
                c02.y = Utilities.i(c02.y, h5Var.getMeasuredHeight(), 0.0f);
            }
        }
        tg.q1 q1Var = new tg.q1(getContext(), c02);
        q1Var.s0 = new fi.o8(q1Var);
        q1Var.t0 = new fi.o8(q1Var);
        q1Var.u0 = new ch.g0(q1Var);
        q1Var.v0 = new ch.g0(q1Var);
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(q1Var);
        q1Var.x0 = u5Var;
        org.telegram.ui.Components.u5 u5Var2 = new org.telegram.ui.Components.u5(q1Var);
        q1Var.y0 = u5Var2;
        q1Var.A0 = 1.0f;
        q1Var.r0 = nt0Var;
        u5Var2.e(true, 1.0f);
        u5Var.e(true, 1.0f);
        ArrayList arrayList = si.b0(m10.t0).h;
        ch.g0 g0Var = q1Var.u0;
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
        ch.p0 b10 = ch.p0.b(str);
        q1Var.w0 = b10;
        g0Var.e(b10);
        q1Var.k();
        q1Var.setDelegate(this);
        h5Var.addView(q1Var);
        d0();
        if (z10) {
            y0(q1Var);
            A0(q1Var, true);
        }
        return q1Var;
    }

    public final tg.r1 j0(String str, boolean z10) {
        this.V1 = true;
        this.X1 = true;
        n0();
        h5 h5Var = this.B0;
        int measuredWidth = h5Var.getMeasuredWidth();
        h5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        nt0 nt0Var = new nt0(floor, floor);
        tg.r1 r1Var = new tg.r1(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - org.telegram.messenger.g0.L(16.0f), (nt0Var.b / 2.0f) + org.telegram.messenger.g0.L(72.0f)), nt0Var, str);
        r1Var.setDelegate(this);
        h5Var.addView(r1Var);
        d0();
        if (z10) {
            y0(r1Var);
            post(new y3(this, r1Var, 0));
        }
        this.X1 = false;
        return r1Var;
    }

    public final d5 k0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i7 = 0; i7 < document.attributes.size() && !(document.attributes.get(i7) instanceof TLRPC.TL_documentAttributeSticker); i7++) {
        }
        float f11 = 0.75f;
        xe xeVar = this.p0;
        if (xeVar != null) {
            f10 = -(xeVar.k + xeVar.d);
            f11 = 0.75f / xeVar.c;
        } else {
            f10 = 0.0f;
        }
        l5 l5Var = new l5(c0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        d5 d5Var = new d5(this, context, l5Var.a, l5Var.c, l5Var.b, new nt0(floor, floor), document, obj);
        boolean C4 = gj.C4(document);
        ImageReceiver imageReceiver = d5Var.y0;
        if (C4) {
            imageReceiver.p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.E0(12);
        d5Var.setDelegate(this);
        this.B0.addView(d5Var);
        d0();
        return d5Var;
    }

    public final tg.n2 l0(boolean z10) {
        nt0 paintingSize = getPaintingSize();
        PointF N0 = N0(null);
        tg.n2 n2Var = new tg.n2(getContext(), N0, (int) (paintingSize.a / 9.0f), "", this.k1, this.v0);
        float f10 = paintingSize.a / 9.0f;
        j4 j4Var = new j4(this, 0);
        n2Var.x0 = (int) (0.5f * f10);
        n2Var.y0 = (int) (f10 * 2.0f);
        n2Var.z0 = j4Var;
        float f11 = N0.x;
        h5 h5Var = this.B0;
        if (f11 == h5Var.getMeasuredWidth() / 2.0f) {
            n2Var.setStickyX(2);
        }
        if (N0.y == h5Var.getMeasuredHeight() / 2.0f) {
            n2Var.setStickyY(2);
        }
        n2Var.setDelegate(this);
        n2Var.setMaxWidth(this.B1 - org.telegram.messenger.g0.L(32.0f));
        int i7 = this.p1;
        n2Var.setTypeface(sg.k0.e(i7).j);
        n2Var.setType(sg.k0.e(i7).h);
        h5Var.addView(n2Var, c8.ja.c(-2.0f, -2));
        d0();
        xe xeVar = this.p0;
        if (xeVar != null) {
            n2Var.j(1.0f / xeVar.c);
            n2Var.f(-(xeVar.k + xeVar.d));
        }
        if (z10) {
            y0(n2Var);
            n2Var.q();
            A0(n2Var, false);
            n2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.J3(n2Var.getFocusedView());
            this.u0 = true;
            int i10 = sg.k0.e(i7).g;
            tg.e1 e1Var = this.V0;
            e1Var.d(i10, true);
            e1Var.setOutlineType(sg.k0.e(i7).h);
        }
        return n2Var;
    }

    public final tg.o2 m0(pb pbVar) {
        int i7;
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        h5 h5Var = this.B0;
        float measuredWidth = h5Var.getMeasuredWidth() <= 0 ? this.B1 : h5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.o2 o2Var = new tg.o2(getContext(), N0, this.p1, pbVar, measuredWidth / 240.0f, L);
        if (N0.x == h5Var.getMeasuredWidth() / 2.0f) {
            o2Var.setStickyX(2);
        }
        if (N0.y == h5Var.getMeasuredHeight() / 2.0f) {
            o2Var.setStickyY(2);
        }
        sg.h1 h1Var = this.k1;
        if (h1Var != null && (i7 = h1Var.a) != -47814) {
            o2Var.setColor(i7);
        }
        o2Var.setDelegate(this);
        o2Var.setMaxWidth(L);
        h5Var.addView(o2Var, c8.ja.c(-2.0f, -2));
        d0();
        xe xeVar = this.p0;
        if (xeVar != null) {
            o2Var.j(1.0f / xeVar.c);
            o2Var.f(-(xeVar.k + xeVar.d));
        }
        return o2Var;
    }

    @Override // tg.h
    public final int[] n(tg.j jVar) {
        int i7 = (int) jVar.getPosition().x;
        int[] iArr = this.Y1;
        iArr[0] = i7;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final void n0() {
        int i7 = 0;
        while (true) {
            h5 h5Var = this.B0;
            if (i7 >= h5Var.getChildCount()) {
                return;
            }
            View childAt = h5Var.getChildAt(i7);
            if (childAt instanceof tg.r1) {
                if (this.t0 == childAt) {
                    A0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(er.h).withEndAction(new y3(this, (tg.r1) childAt, 1)).start();
            }
            i7++;
        }
    }

    public abstract void o0();

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        mi0 mi0Var = this.J1;
        if (mi0Var != null) {
            org.telegram.messenger.g0.E2(mi0Var);
            this.J1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float currentActionBarHeight;
        float f10;
        this.q0 = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
        Bitmap bitmap = this.m0;
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
        float f11 = this.r0.a;
        tg.j jVar = this.t0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.D0, i7, i10);
        measureChild(this.N0, i7, i10);
        measureChild(this.F0, i7, i10);
        measureChild(this.E0, i7, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.d2 - this.w1.getPaddingUnderContainer(), Q()), TLObject.FLAG_30));
        FrameLayout frameLayout = this.C0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.q0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.a2 && !this.c2) {
            this.q0 = true;
            t0();
            this.q0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            return;
        }
        t0();
    }

    @Override // tg.h
    public final boolean p() {
        return !(this.t0 instanceof tg.u0);
    }

    public final tg.u0 p0() {
        int i7 = 0;
        while (true) {
            h5 h5Var = this.B0;
            if (i7 >= h5Var.getChildCount()) {
                return null;
            }
            View childAt = h5Var.getChildAt(i7);
            if (childAt instanceof tg.u0) {
                return (tg.u0) childAt;
            }
            i7++;
        }
    }

    @Override // tg.h
    public final boolean q() {
        return !this.u0;
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
    public final Bitmap q0(ArrayList arrayList, boolean z10, boolean z11, boolean z12, boolean z13, d7 d7Var) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i7;
        int i10;
        h5 h5Var;
        int i11;
        int i12;
        View view;
        boolean z14;
        boolean z15;
        ImageReceiver imageReceiver;
        byte b10;
        int i13;
        Canvas canvas;
        View view2;
        tg.u0 u0Var;
        di.k4 k4Var;
        boolean z16;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z17;
        TLRPC.Message message;
        org.telegram.ui.Cells.t0 t0Var;
        di.e6 e6Var;
        ImageReceiver imageReceiver3;
        ImageReceiver imageReceiver4;
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        float scaleX;
        boolean z18;
        boolean z19;
        float radius;
        double d;
        float width;
        float height;
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        Spanned spanned;
        boolean z20;
        m5 m5Var = this;
        g5 g5Var = m5Var.y0;
        int i14 = 0;
        byte b11 = 1;
        h5 h5Var2 = m5Var.B0;
        if (z10) {
            createBitmap = g5Var.c(false, z13);
        } else if (z12) {
            createBitmap = Bitmap.createBitmap(Math.max(1, h5Var2.getMeasuredWidth()), Math.max(1, h5Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z11) {
                bitmap = null;
                m5Var.Q0 = BigInteger.ONE;
                i10 = 0;
                for (i7 = 0; i7 < h5Var2.getChildCount(); i7++) {
                    if (h5Var2.getChildAt(i7) instanceof tg.j) {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    int childCount = h5Var2.getChildCount();
                    int i15 = 0;
                    while (i15 < childCount) {
                        View childAt = h5Var2.getChildAt(i15);
                        if (childAt instanceof tg.j) {
                            tg.j jVar = (tg.j) childAt;
                            jVar.getPosition();
                            e20 e20Var = new e20();
                            if (arrayList != null) {
                                boolean z21 = jVar instanceof tg.n2;
                                int i16 = m5Var.p1;
                                if (z21) {
                                    e20Var.a = b11;
                                    tg.n2 n2Var = (tg.n2) jVar;
                                    CharSequence text = n2Var.getText();
                                    if (text instanceof Spanned) {
                                        Spanned spanned2 = (Spanned) text;
                                        h5Var = h5Var2;
                                        org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spanned2.getSpans(i14, text.length(), org.telegram.ui.Components.p5.class);
                                        if (p5VarArr != null) {
                                            int i17 = i14;
                                            while (i17 < p5VarArr.length) {
                                                org.telegram.ui.Components.p5 p5Var = p5VarArr[i17];
                                                org.telegram.ui.Components.p5[] p5VarArr2 = p5VarArr;
                                                TLRPC.Document document = p5Var.document;
                                                int i18 = i17;
                                                if (document == null) {
                                                    document = org.telegram.ui.Components.g5.e(i16, p5Var.getDocumentId());
                                                }
                                                if (document != null) {
                                                    org.telegram.ui.Components.g5.g(i16).e(document);
                                                }
                                                d20 d20Var = new d20();
                                                int i19 = childCount;
                                                int i20 = i15;
                                                d20Var.document_id = p5Var.getDocumentId();
                                                d20Var.document = document;
                                                d20Var.offset = spanned2.getSpanStart(p5Var);
                                                d20Var.length = spanned2.getSpanEnd(p5Var) - d20Var.offset;
                                                org.telegram.messenger.w7.G(i16);
                                                d20Var.a = org.telegram.messenger.w7.J(document, null, true, true).getAbsolutePath();
                                                int i21 = 0;
                                                while (document != null) {
                                                    ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                    if (arrayList2 == null || arrayList2.isEmpty() || new File(d20Var.a).exists()) {
                                                        break;
                                                    }
                                                    org.telegram.messenger.w7.G(i16);
                                                    spanned = spanned2;
                                                    z20 = true;
                                                    d20Var.a = org.telegram.messenger.w7.J(document.thumbs.get(i21), null, true, true).getAbsolutePath();
                                                    i21++;
                                                    if (i21 >= document.thumbs.size()) {
                                                        break;
                                                    }
                                                    spanned2 = spanned;
                                                }
                                                spanned = spanned2;
                                                z20 = true;
                                                boolean K2 = gj.K2(d20Var.document, z20);
                                                if (K2 || u0(d20Var.document)) {
                                                    d20Var.c = (byte) (d20Var.c | (K2 ? (byte) 1 : (byte) 4));
                                                }
                                                if (gj.C4(d20Var.document)) {
                                                    d20Var.c = (byte) (d20Var.c | 8);
                                                }
                                                e20Var.k.add(d20Var);
                                                if (document != null) {
                                                    BigInteger valueOf = BigInteger.valueOf(5000L);
                                                    m5Var.Q0 = m5Var.Q0.multiply(valueOf).divide(m5Var.Q0.gcd(valueOf));
                                                }
                                                i17 = i18 + 1;
                                                p5VarArr = p5VarArr2;
                                                childCount = i19;
                                                i15 = i20;
                                                spanned2 = spanned;
                                            }
                                        }
                                    } else {
                                        h5Var = h5Var2;
                                    }
                                    i11 = childCount;
                                    i12 = i15;
                                    e20Var.j = text.toString();
                                    e20Var.b = (byte) n2Var.getType();
                                    e20Var.l = n2Var.getSwatch().a;
                                    e20Var.m = n2Var.getTextSize();
                                    e20Var.n = n2Var.getTypeface();
                                    e20Var.p = n2Var.getAlign();
                                } else {
                                    h5Var = h5Var2;
                                    i11 = childCount;
                                    i12 = i15;
                                    if (jVar instanceof tg.f2) {
                                        e20Var.a = (byte) 0;
                                        tg.f2 f2Var = (tg.f2) jVar;
                                        nt0 baseSize = f2Var.getBaseSize();
                                        e20Var.f = baseSize.a;
                                        e20Var.g = baseSize.b;
                                        e20Var.B = f2Var.getSticker();
                                        e20Var.C = f2Var.getParentObject();
                                        TLRPC.Document sticker = f2Var.getSticker();
                                        org.telegram.messenger.w7.G(m10.t0);
                                        e20Var.j = org.telegram.messenger.w7.J(sticker, null, true, true).getAbsolutePath();
                                        if (gj.K2(sticker, true) || u0(sticker)) {
                                            boolean K22 = gj.K2(sticker, true);
                                            e20Var.b = (byte) (e20Var.b | (K22 ? (byte) 1 : (byte) 4));
                                            r21 = (K22 || u0(sticker)) ? f2Var.getDuration() : 5000L;
                                            if (r21 != 0) {
                                                BigInteger valueOf2 = BigInteger.valueOf(r21);
                                                m5Var.Q0 = m5Var.Q0.multiply(valueOf2).divide(m5Var.Q0.gcd(valueOf2));
                                            }
                                        }
                                        if (gj.C4(sticker)) {
                                            e20Var.l = -1;
                                            e20Var.b = (byte) (e20Var.b | 8);
                                        }
                                        if (f2Var.u0) {
                                            e20Var.b = (byte) (e20Var.b | 2);
                                        }
                                    } else if (jVar instanceof tg.n1) {
                                        tg.n1 n1Var = (tg.n1) jVar;
                                        e20Var.a = (byte) 2;
                                        nt0 baseSize2 = n1Var.getBaseSize();
                                        e20Var.f = baseSize2.a;
                                        e20Var.g = baseSize2.b;
                                        e20Var.j = n1Var.q(i16);
                                        e20Var.u = n1Var.H0;
                                        if (n1Var.u0) {
                                            e20Var.b = (byte) (e20Var.b | 2);
                                        }
                                    } else if (jVar instanceof tg.n0) {
                                        tg.n0 n0Var = (tg.n0) jVar;
                                        tg.m0 m0Var = n0Var.r0;
                                        e20Var.a = (byte) 3;
                                        e20Var.b = (byte) n0Var.getType();
                                        e20Var.f = m0Var.getWidth();
                                        e20Var.g = m0Var.getHeight();
                                        e20Var.j = m0Var.getText();
                                        e20Var.l = n0Var.s0 ? n0Var.getColor() : 0;
                                        e20Var.P = m0Var.E;
                                        e20Var.N = n0Var.v0;
                                        TL_stories.MediaArea mediaArea2 = n0Var.w0;
                                        e20Var.M = mediaArea2;
                                        mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument = m0Var.getCodeEmojiDocument();
                                        if (codeEmojiDocument != null) {
                                            d20 d20Var2 = new d20();
                                            d20Var2.document_id = codeEmojiDocument.id;
                                            d20Var2.document = codeEmojiDocument;
                                            org.telegram.messenger.w7.G(i16);
                                            d20Var2.a = org.telegram.messenger.w7.J(codeEmojiDocument, null, true, true).getAbsolutePath();
                                            boolean K23 = gj.K2(d20Var2.document, true);
                                            if (K23 || u0(d20Var2.document)) {
                                                d20Var2.c = (byte) (d20Var2.c | (K23 ? (byte) 1 : (byte) 4));
                                            }
                                            e20Var.k.add(d20Var2);
                                        }
                                    } else if (jVar instanceof tg.o2) {
                                        tg.o2 o2Var = (tg.o2) jVar;
                                        tg.m0 m0Var2 = o2Var.r0;
                                        e20Var.a = (byte) 8;
                                        e20Var.b = (byte) o2Var.getType();
                                        e20Var.f = m0Var2.getWidth();
                                        e20Var.g = m0Var2.getHeight();
                                        e20Var.j = m0Var2.getText();
                                        e20Var.l = o2Var.s0 ? o2Var.getColor() : 0;
                                        e20Var.P = m0Var2.E;
                                        e20Var.O = o2Var.v0;
                                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                        tL_mediaAreaWeather.emoji = o2Var.v0.c;
                                        tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                        tL_mediaAreaWeather.color = m0Var2.f.getColor();
                                        e20Var.M = tL_mediaAreaWeather;
                                        tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument2 = m0Var2.getCodeEmojiDocument();
                                        if (codeEmojiDocument2 != null) {
                                            d20 d20Var3 = new d20();
                                            d20Var3.document_id = codeEmojiDocument2.id;
                                            d20Var3.document = codeEmojiDocument2;
                                            org.telegram.messenger.w7.G(i16);
                                            d20Var3.a = org.telegram.messenger.w7.J(codeEmojiDocument2, null, true, true).getAbsolutePath();
                                            boolean K24 = gj.K2(d20Var3.document, true);
                                            if (K24 || u0(d20Var3.document)) {
                                                d20Var3.c = (byte) (d20Var3.c | (K24 ? (byte) 1 : (byte) 4));
                                            }
                                            e20Var.k.add(d20Var3);
                                        }
                                        view = childAt;
                                        z16 = false;
                                        z17 = false;
                                        imageReceiver = null;
                                        arrayList.add(e20Var);
                                        scaleX = view.getScaleX();
                                        float scaleY = view.getScaleY();
                                        float x10 = view.getX();
                                        float y10 = view.getY();
                                        e20Var.q = view.getWidth();
                                        e20Var.r = view.getHeight();
                                        e20Var.f = (view.getWidth() * scaleX) / h5Var.getMeasuredWidth();
                                        e20Var.g = (view.getHeight() * scaleY) / h5Var.getMeasuredHeight();
                                        e20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10) / h5Var.getMeasuredWidth();
                                        e20Var.d = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y10) / h5Var.getMeasuredHeight();
                                        e20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                        e20Var.y = ((view.getWidth() / 2.0f) + x10) / h5Var.getMeasuredWidth();
                                        e20Var.z = ((view.getHeight() / 2.0f) + y10) / h5Var.getMeasuredHeight();
                                        e20Var.w = e20Var.q / h5Var.getMeasuredWidth();
                                        e20Var.x = e20Var.r / h5Var.getMeasuredHeight();
                                        e20Var.v = scaleX;
                                        if (jVar instanceof tg.u0) {
                                            z18 = z16;
                                            if (jVar instanceof tg.f2) {
                                                ImageReceiver imageReceiver5 = ((tg.f2) jVar).y0;
                                                RectF rectF = imageReceiver5.Q0;
                                                if (imageReceiver5.V % ns.K2 != 0) {
                                                    width = rectF.height();
                                                    height = rectF.width();
                                                } else {
                                                    width = rectF.width();
                                                    height = rectF.height();
                                                }
                                                float f10 = width / height;
                                                float f11 = (e20Var.f / 2.0f) + e20Var.c;
                                                float f12 = (e20Var.g / 2.0f) + e20Var.d;
                                                float measuredWidth = h5Var.getMeasuredWidth() / h5Var.getMeasuredHeight();
                                                if (f10 > 1.0f) {
                                                    float f13 = (e20Var.f * measuredWidth) / f10;
                                                    e20Var.g = f13;
                                                    e20Var.r = (int) (e20Var.q / f10);
                                                    e20Var.d = f12 - (f13 / 2.0f);
                                                } else if (f10 < 1.0f) {
                                                    float f14 = (e20Var.g / measuredWidth) * f10;
                                                    e20Var.f = f14;
                                                    e20Var.q = (int) (e20Var.r * f10);
                                                    e20Var.c = f11 - (f14 / 2.0f);
                                                }
                                            } else {
                                                TL_stories.MediaArea mediaArea3 = e20Var.M;
                                                if (mediaArea3 != null && (((z19 = jVar instanceof tg.n0)) || (jVar instanceof tg.o2) || (jVar instanceof tg.k0) || (jVar instanceof tg.q1))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                    float f15 = e20Var.c;
                                                    float f16 = e20Var.f;
                                                    mediaAreaCoordinates2.x = ((f16 / 2.0f) + f15) * 100.0f;
                                                    mediaAreaCoordinates2.y = ((e20Var.g / 2.0f) + e20Var.d) * 100.0f;
                                                    if (z19) {
                                                        tg.m0 m0Var3 = ((tg.n0) jVar).r0;
                                                        mediaAreaCoordinates2.w = i20.x(m0Var3.J * 2 * scaleX, h5Var.getMeasuredWidth(), f16, 100.0f);
                                                        e20Var.M.coordinates.h = i20.x(m0Var3.K * 2 * scaleY, h5Var.getMeasuredHeight(), e20Var.g, 100.0f);
                                                    } else if (jVar instanceof tg.o2) {
                                                        tg.m0 m0Var4 = ((tg.o2) jVar).r0;
                                                        mediaAreaCoordinates2.w = i20.x(m0Var4.J * 2 * scaleX, h5Var.getMeasuredWidth(), f16, 100.0f);
                                                        e20Var.M.coordinates.h = i20.x(m0Var4.K * 2 * scaleY, h5Var.getMeasuredHeight(), e20Var.g, 100.0f);
                                                    } else if (jVar instanceof tg.k0) {
                                                        tg.i0 i0Var = ((tg.k0) jVar).r0;
                                                        mediaAreaCoordinates2.w = i20.x(i0Var.f * 2 * scaleX, h5Var.getMeasuredWidth(), f16, 100.0f);
                                                        e20Var.M.coordinates.h = i20.x(i0Var.h * 2 * scaleY, h5Var.getMeasuredHeight(), e20Var.g, 100.0f);
                                                    } else if (jVar instanceof tg.q1) {
                                                        tg.q1 q1Var = (tg.q1) jVar;
                                                        float padding = ((q1Var.getPadding() * 2) * scaleX) / h5Var.getMeasuredWidth();
                                                        float padding2 = ((q1Var.getPadding() * 2) * scaleX) / h5Var.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = e20Var.M.coordinates;
                                                        mediaAreaCoordinates3.w = (e20Var.f - padding) * 100.0f;
                                                        mediaAreaCoordinates3.h = (e20Var.g - padding2) * 100.0f;
                                                    }
                                                    e20Var.M.coordinates.rotation = ((-e20Var.e) / 3.141592653589793d) * 180.0d;
                                                    if (z19) {
                                                        radius = ((tg.n0) jVar).r0.getRadius();
                                                    } else if (jVar instanceof tg.o2) {
                                                        radius = ((tg.o2) jVar).r0.getRadius();
                                                    } else if (jVar instanceof tg.k0) {
                                                        radius = ((tg.k0) jVar).r0.getRadius();
                                                    }
                                                    d = radius;
                                                }
                                            }
                                            d = -1.0d;
                                        } else {
                                            tg.u0 u0Var2 = (tg.u0) jVar;
                                            tg.p0 p0Var = u0Var2.s0;
                                            di.k4 k4Var2 = u0Var2.r0;
                                            RectF rectF2 = org.telegram.messenger.g0.P;
                                            z18 = z16;
                                            double r10 = u0Var2.r(rectF2);
                                            rectF2.offset(k4Var2.getX(), k4Var2.getY());
                                            rectF2.offset(p0Var.getX(), p0Var.getY());
                                            e20Var.M.coordinates.x = (((rectF2.centerX() * scaleX) + i20.v(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x10)) / h5Var.getMeasuredWidth()) * 100.0f;
                                            e20Var.M.coordinates.y = (((rectF2.centerY() * scaleY) + i20.v(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y10)) / h5Var.getMeasuredHeight()) * 100.0f;
                                            e20Var.M.coordinates.w = ((rectF2.width() * scaleX) / h5Var.getMeasuredWidth()) * 100.0f;
                                            e20Var.M.coordinates.h = ((rectF2.height() * scaleY) / h5Var.getMeasuredHeight()) * 100.0f;
                                            e20Var.M.coordinates.rotation = ((-e20Var.e) / 3.141592653589793d) * 180.0d;
                                            d = r10;
                                        }
                                        mediaArea = e20Var.M;
                                        if (mediaArea != null && (mediaAreaCoordinates = mediaArea.coordinates) != null && d > 0.0d) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                        }
                                        z14 = z17;
                                        z15 = z18;
                                    } else {
                                        if (jVar instanceof tg.k0) {
                                            tg.k0 k0Var = (tg.k0) jVar;
                                            tg.i0 i0Var2 = k0Var.r0;
                                            e20Var.a = (byte) 7;
                                            if (i0Var2.e()) {
                                                e20Var.b = (byte) i0Var2.getPreviewType();
                                            } else {
                                                e20Var.b = (byte) k0Var.getType();
                                            }
                                            e20Var.f = i0Var2.getWidth();
                                            e20Var.g = i0Var2.getHeight();
                                            e20Var.l = k0Var.u0 ? k0Var.getColor() : 0;
                                            e20Var.P = i0Var2.e;
                                            e20Var.W = k0Var.v0;
                                            if (i0Var2.S) {
                                                ImageReceiver imageReceiver6 = i0Var2.U;
                                                if (i0Var2.S && imageReceiver6.J() && imageReceiver6.n() != null) {
                                                    fc.D().O(new BitmapDrawable(imageReceiver6.n()), imageReceiver6.R, false);
                                                }
                                                tg.h0 h0Var = e20Var.W;
                                                h0Var.a |= 4;
                                                h0Var.i = i0Var2.getPhotoSide();
                                            }
                                            TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                            e20Var.M = tL_mediaAreaUrl;
                                            tg.h0 h0Var2 = k0Var.v0;
                                            if (h0Var2 != null) {
                                                TLRPC.WebPage webPage = h0Var2.d;
                                                tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? k0Var.v0.c : k0Var.v0.d.url;
                                                e20Var.M.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                        } else {
                                            if (jVar instanceof tg.q1) {
                                                tg.q1 q1Var2 = (tg.q1) jVar;
                                                e20Var.a = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                e20Var.M = tL_mediaAreaSuggestedReaction;
                                                ch.p0 currentReaction = q1Var2.getCurrentReaction();
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
                                                TL_stories.MediaArea mediaArea4 = e20Var.M;
                                                mediaArea4.dark = q1Var2.s0.a == 1;
                                                mediaArea4.flipped = q1Var2.z0;
                                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            } else if (jVar instanceof tg.r1) {
                                                tg.r1 r1Var = (tg.r1) jVar;
                                                nt0 baseSize3 = r1Var.getBaseSize();
                                                e20Var.f = baseSize3.a;
                                                e20Var.g = baseSize3.b;
                                                e20Var.a = (byte) 5;
                                                if (d7Var != null) {
                                                    e20Var.j = d7Var.o0.getAbsolutePath();
                                                    e20Var.Q = d7Var.r0;
                                                    long j3 = d7Var.q0;
                                                    e20Var.T = j3;
                                                    float f17 = j3;
                                                    e20Var.R = (long) (d7Var.s0 * f17);
                                                    e20Var.S = (long) (d7Var.t0 * f17);
                                                }
                                                e20Var.b = (byte) 4;
                                                if (r1Var.s0) {
                                                    e20Var.b = (byte) (e20Var.b | 2);
                                                }
                                            } else if (jVar instanceof tg.u0) {
                                                tg.u0 u0Var3 = (tg.u0) jVar;
                                                di.k4 k4Var3 = u0Var3.r0;
                                                ArrayList arrayList3 = u0Var3.t0;
                                                tg.p0 p0Var2 = u0Var3.s0;
                                                e20Var.a = (byte) 6;
                                                int width2 = u0Var3.getWidth();
                                                e20Var.q = width2;
                                                e20Var.f = width2;
                                                int height2 = u0Var3.getHeight();
                                                e20Var.r = height2;
                                                e20Var.g = height2;
                                                gj gjVar = arrayList3.size() > 0 ? (gj) arrayList3.get(0) : null;
                                                if (gjVar != null && (message = gjVar.k) != null) {
                                                    TLRPC.MessageAction messageAction = message.action;
                                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                        TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                        e20Var.M = tL_mediaAreaStarGift;
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
                                                        if (t0Var == null || (e6Var = t0Var.I0) == null || (imageReceiver3 = e6Var.d) == null) {
                                                            u0Var = u0Var3;
                                                            k4Var = k4Var3;
                                                            view = childAt;
                                                            imageReceiver = null;
                                                            if (z12) {
                                                                if (d7Var != null) {
                                                                    Matrix matrix = d7Var.n0;
                                                                    if (d7Var.K) {
                                                                        matrix.reset();
                                                                        if (p0Var2.getChildCount() == 1) {
                                                                            view3 = p0Var2.getChildAt(0);
                                                                            if (view3 instanceof org.telegram.ui.Cells.q1) {
                                                                                imageReceiver2 = ((org.telegram.ui.Cells.q1) view3).getPhotoImage();
                                                                                if (imageReceiver2 != null) {
                                                                                    float max = Math.max(imageReceiver2.w() / Math.max(1, d7Var.k0), imageReceiver2.v() / Math.max(1, d7Var.l0));
                                                                                    matrix.postScale(max, max);
                                                                                    matrix.postTranslate(imageReceiver2.r() - ((d7Var.k0 * max) / 2.0f), imageReceiver2.s() - ((d7Var.l0 * max) / 2.0f));
                                                                                    matrix.postTranslate(k4Var.getX(), k4Var.getY());
                                                                                    matrix.postTranslate(p0Var2.getX(), p0Var2.getY());
                                                                                    matrix.postTranslate(view3.getX(), view3.getY());
                                                                                    matrix.postScale(u0Var.getScaleX(), u0Var.getScaleY(), u0Var.getPivotX(), u0Var.getPivotY());
                                                                                    matrix.postRotate(u0Var.getRotation(), u0Var.getPivotX(), u0Var.getPivotY());
                                                                                    matrix.postTranslate(u0Var.getX(), u0Var.getY());
                                                                                    matrix.postScale(1.0f / h5Var.getWidth(), 1.0f / h5Var.getHeight());
                                                                                    matrix.postScale(d7Var.i0, d7Var.j0);
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
                                                                z16 = false;
                                                            } else {
                                                                z16 = true;
                                                            }
                                                            z17 = true;
                                                            arrayList.add(e20Var);
                                                            scaleX = view.getScaleX();
                                                            float scaleY2 = view.getScaleY();
                                                            float x102 = view.getX();
                                                            float y102 = view.getY();
                                                            e20Var.q = view.getWidth();
                                                            e20Var.r = view.getHeight();
                                                            e20Var.f = (view.getWidth() * scaleX) / h5Var.getMeasuredWidth();
                                                            e20Var.g = (view.getHeight() * scaleY2) / h5Var.getMeasuredHeight();
                                                            e20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102) / h5Var.getMeasuredWidth();
                                                            e20Var.d = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y102) / h5Var.getMeasuredHeight();
                                                            e20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            e20Var.y = ((view.getWidth() / 2.0f) + x102) / h5Var.getMeasuredWidth();
                                                            e20Var.z = ((view.getHeight() / 2.0f) + y102) / h5Var.getMeasuredHeight();
                                                            e20Var.w = e20Var.q / h5Var.getMeasuredWidth();
                                                            e20Var.x = e20Var.r / h5Var.getMeasuredHeight();
                                                            e20Var.v = scaleX;
                                                            if (jVar instanceof tg.u0) {
                                                            }
                                                            mediaArea = e20Var.M;
                                                            if (mediaArea != null) {
                                                                mediaAreaCoordinates.flags |= 1;
                                                                mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        } else {
                                                            imageReceiver3.O0(false, false);
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) di.u8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                            if (stargiftattributemodel != null) {
                                                                float L = org.telegram.messenger.g0.L(110.0f);
                                                                float r11 = imageReceiver3.r() + t0Var.getX() + p0Var2.getX() + t0Var.G0;
                                                                float s5 = imageReceiver3.s() + t0Var.getY() + p0Var2.getY() + t0Var.H0;
                                                                u0Var = u0Var3;
                                                                e20 e20Var2 = new e20();
                                                                e20Var2.a = (byte) 0;
                                                                e20Var2.f = L;
                                                                e20Var2.g = L;
                                                                TLRPC.Document document2 = stargiftattributemodel.document;
                                                                e20Var2.B = document2;
                                                                e20Var2.C = starGift;
                                                                org.telegram.messenger.w7.G(m10.t0);
                                                                e20Var2.j = org.telegram.messenger.w7.K(document2, true).getAbsolutePath();
                                                                if (gj.K2(document2, true) || u0(document2)) {
                                                                    boolean K25 = gj.K2(document2, true);
                                                                    e20Var2.b = (byte) (e20Var2.b | (K25 ? (byte) 1 : (byte) 4));
                                                                    ch0 B = imageReceiver3.B();
                                                                    if (B != null && (K25 || u0(document2))) {
                                                                        r21 = B.r();
                                                                    }
                                                                    if (r21 != 0) {
                                                                        BigInteger valueOf3 = BigInteger.valueOf(r21);
                                                                        m5Var.Q0 = m5Var.Q0.multiply(valueOf3).divide(m5Var.Q0.gcd(valueOf3));
                                                                    }
                                                                }
                                                                float scaleX2 = childAt.getScaleX();
                                                                float scaleY3 = childAt.getScaleY();
                                                                float x11 = childAt.getX();
                                                                float y11 = childAt.getY();
                                                                int i23 = (int) L;
                                                                e20Var2.q = i23;
                                                                e20Var2.r = i23;
                                                                e20Var2.f = (L * scaleX2) / h5Var.getMeasuredWidth();
                                                                e20Var2.g = (L * scaleY3) / h5Var.getMeasuredHeight();
                                                                e20Var2.c = (childAt.getWidth() / 2.0f) + x11;
                                                                e20Var2.d = (childAt.getHeight() / 2.0f) + y11;
                                                                float v = i20.v(childAt.getWidth(), 2.0f, scaleX2, r11 * scaleX2);
                                                                k4Var = k4Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                view = childAt;
                                                                double d2 = v;
                                                                double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                double v10 = i20.v(childAt.getHeight(), 2.0f, scaleY3, s5 * scaleY3);
                                                                e20Var2.c = (float) (((Math.cos(rotation) * d2) - (Math.sin(rotation) * v10)) + e20Var2.c);
                                                                float cos = (float) ((Math.cos(rotation) * v10) + (Math.sin(rotation) * d2) + e20Var2.d);
                                                                float f18 = (-L) / 2.0f;
                                                                float f19 = (f18 * scaleX2) + e20Var2.c;
                                                                e20Var2.c = f19;
                                                                e20Var2.d = (f18 * scaleY3) + cos;
                                                                e20Var2.c = f19 / h5Var.getMeasuredWidth();
                                                                e20Var2.d /= h5Var.getMeasuredHeight();
                                                                e20Var2.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                e20Var2.v = scaleX2;
                                                                arrayList.add(e20Var2);
                                                            } else {
                                                                u0Var = u0Var3;
                                                                k4Var = k4Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                view = childAt;
                                                            }
                                                            imageReceiver = imageReceiver4;
                                                            if (z12) {
                                                            }
                                                            z17 = true;
                                                            arrayList.add(e20Var);
                                                            scaleX = view.getScaleX();
                                                            float scaleY22 = view.getScaleY();
                                                            float x1022 = view.getX();
                                                            float y1022 = view.getY();
                                                            e20Var.q = view.getWidth();
                                                            e20Var.r = view.getHeight();
                                                            e20Var.f = (view.getWidth() * scaleX) / h5Var.getMeasuredWidth();
                                                            e20Var.g = (view.getHeight() * scaleY22) / h5Var.getMeasuredHeight();
                                                            e20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022) / h5Var.getMeasuredWidth();
                                                            e20Var.d = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y1022) / h5Var.getMeasuredHeight();
                                                            e20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            e20Var.y = ((view.getWidth() / 2.0f) + x1022) / h5Var.getMeasuredWidth();
                                                            e20Var.z = ((view.getHeight() / 2.0f) + y1022) / h5Var.getMeasuredHeight();
                                                            e20Var.w = e20Var.q / h5Var.getMeasuredWidth();
                                                            e20Var.x = e20Var.r / h5Var.getMeasuredHeight();
                                                            e20Var.v = scaleX;
                                                            if (jVar instanceof tg.u0) {
                                                            }
                                                            mediaArea = e20Var.M;
                                                            if (mediaArea != null) {
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        }
                                                    }
                                                }
                                                u0Var = u0Var3;
                                                k4Var = k4Var3;
                                                view = childAt;
                                                if (gjVar != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    e20Var.M = tL_inputMediaAreaChannelPost;
                                                    tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) e20Var.M).channel = np.s1(i16).h1(-d7.p(gjVar));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) e20Var.M;
                                                    Boolean D = d7.D(gjVar);
                                                    tL_inputMediaAreaChannelPost2.msg_id = D == null ? 0 : D.booleanValue() ? gjVar.k.fwd_from.channel_post : gjVar.e1();
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    e20Var.M = tL_inputMediaAreaChannelPost3;
                                                    tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                                if (z12) {
                                                }
                                                z17 = true;
                                                arrayList.add(e20Var);
                                                scaleX = view.getScaleX();
                                                float scaleY222 = view.getScaleY();
                                                float x10222 = view.getX();
                                                float y10222 = view.getY();
                                                e20Var.q = view.getWidth();
                                                e20Var.r = view.getHeight();
                                                e20Var.f = (view.getWidth() * scaleX) / h5Var.getMeasuredWidth();
                                                e20Var.g = (view.getHeight() * scaleY222) / h5Var.getMeasuredHeight();
                                                e20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10222) / h5Var.getMeasuredWidth();
                                                e20Var.d = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y10222) / h5Var.getMeasuredHeight();
                                                e20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                e20Var.y = ((view.getWidth() / 2.0f) + x10222) / h5Var.getMeasuredWidth();
                                                e20Var.z = ((view.getHeight() / 2.0f) + y10222) / h5Var.getMeasuredHeight();
                                                e20Var.w = e20Var.q / h5Var.getMeasuredWidth();
                                                e20Var.x = e20Var.r / h5Var.getMeasuredHeight();
                                                e20Var.v = scaleX;
                                                if (jVar instanceof tg.u0) {
                                                }
                                                mediaArea = e20Var.M;
                                                if (mediaArea != null) {
                                                }
                                                z14 = z17;
                                                z15 = z18;
                                            }
                                            view = childAt;
                                            z16 = true;
                                            z17 = true;
                                            imageReceiver = null;
                                            arrayList.add(e20Var);
                                            scaleX = view.getScaleX();
                                            float scaleY2222 = view.getScaleY();
                                            float x102222 = view.getX();
                                            float y102222 = view.getY();
                                            e20Var.q = view.getWidth();
                                            e20Var.r = view.getHeight();
                                            e20Var.f = (view.getWidth() * scaleX) / h5Var.getMeasuredWidth();
                                            e20Var.g = (view.getHeight() * scaleY2222) / h5Var.getMeasuredHeight();
                                            e20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102222) / h5Var.getMeasuredWidth();
                                            e20Var.d = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y102222) / h5Var.getMeasuredHeight();
                                            e20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            e20Var.y = ((view.getWidth() / 2.0f) + x102222) / h5Var.getMeasuredWidth();
                                            e20Var.z = ((view.getHeight() / 2.0f) + y102222) / h5Var.getMeasuredHeight();
                                            e20Var.w = e20Var.q / h5Var.getMeasuredWidth();
                                            e20Var.x = e20Var.r / h5Var.getMeasuredHeight();
                                            e20Var.v = scaleX;
                                            if (jVar instanceof tg.u0) {
                                            }
                                            mediaArea = e20Var.M;
                                            if (mediaArea != null) {
                                            }
                                            z14 = z17;
                                            z15 = z18;
                                        }
                                        b10 = 1;
                                        i13 = 0;
                                    }
                                }
                                view = childAt;
                                z16 = false;
                                z17 = true;
                                imageReceiver = null;
                                arrayList.add(e20Var);
                                scaleX = view.getScaleX();
                                float scaleY22222 = view.getScaleY();
                                float x1022222 = view.getX();
                                float y1022222 = view.getY();
                                e20Var.q = view.getWidth();
                                e20Var.r = view.getHeight();
                                e20Var.f = (view.getWidth() * scaleX) / h5Var.getMeasuredWidth();
                                e20Var.g = (view.getHeight() * scaleY22222) / h5Var.getMeasuredHeight();
                                e20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022222) / h5Var.getMeasuredWidth();
                                e20Var.d = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y1022222) / h5Var.getMeasuredHeight();
                                e20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                e20Var.y = ((view.getWidth() / 2.0f) + x1022222) / h5Var.getMeasuredWidth();
                                e20Var.z = ((view.getHeight() / 2.0f) + y1022222) / h5Var.getMeasuredHeight();
                                e20Var.w = e20Var.q / h5Var.getMeasuredWidth();
                                e20Var.x = e20Var.r / h5Var.getMeasuredHeight();
                                e20Var.v = scaleX;
                                if (jVar instanceof tg.u0) {
                                }
                                mediaArea = e20Var.M;
                                if (mediaArea != null) {
                                }
                                z14 = z17;
                                z15 = z18;
                            } else {
                                h5Var = h5Var2;
                                i11 = childCount;
                                i12 = i15;
                                view = childAt;
                                z14 = true;
                                z15 = false;
                                imageReceiver = null;
                            }
                            if (z14 && ((z11 || (z12 && e20Var.a == 6)) && bitmap != null)) {
                                Canvas canvas2 = new Canvas(bitmap);
                                float width3 = bitmap.getWidth() / h5Var.getMeasuredWidth();
                                int i24 = 0;
                                while (i24 < 2) {
                                    Canvas canvas3 = i24 == 0 ? canvas2 : null;
                                    if (canvas3 == null || (i24 == 0 && z15)) {
                                        canvas = canvas2;
                                        view2 = view;
                                    } else {
                                        canvas3.save();
                                        canvas3.scale(width3, width3);
                                        canvas3.translate(e20Var.c * h5Var.getMeasuredWidth(), e20Var.d * h5Var.getMeasuredHeight());
                                        canvas3.scale(view.getScaleX(), view.getScaleY());
                                        canvas3.rotate(view.getRotation(), ((e20Var.f / 2.0f) / view.getScaleX()) * h5Var.getMeasuredWidth(), ((e20Var.g / 2.0f) / view.getScaleY()) * h5Var.getMeasuredHeight());
                                        view2 = view;
                                        if (!(view2 instanceof tg.n2) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                            canvas = canvas2;
                                            if (view2 instanceof tg.u0) {
                                                tg.u0 u0Var4 = (tg.u0) view2;
                                                tg.p0 p0Var3 = u0Var4.s0;
                                                boolean z22 = true;
                                                u0Var4.v0 = true;
                                                int i25 = 0;
                                                while (i25 < p0Var3.getChildCount()) {
                                                    View childAt3 = p0Var3.getChildAt(i25);
                                                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                                                        ((org.telegram.ui.Cells.q1) childAt3).Hc = z22;
                                                    }
                                                    i25++;
                                                    z22 = true;
                                                }
                                                view2.draw(canvas3);
                                                boolean z23 = false;
                                                u0Var4.v0 = false;
                                                int i26 = 0;
                                                while (i26 < p0Var3.getChildCount()) {
                                                    View childAt4 = p0Var3.getChildAt(i26);
                                                    if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                                        ((org.telegram.ui.Cells.q1) childAt4).Hc = z23;
                                                    }
                                                    i26++;
                                                    z23 = false;
                                                }
                                            } else {
                                                view2.draw(canvas3);
                                            }
                                        } else {
                                            int scaleX3 = (int) (view2.getScaleX() * view2.getWidth());
                                            int scaleY4 = (int) (view2.getScaleY() * view2.getHeight());
                                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                            Bitmap c10 = xr.c(scaleX3, scaleY4);
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
                            h5Var = h5Var2;
                            i11 = childCount;
                            i12 = i15;
                            b10 = b11;
                        }
                        i15 = i12 + 1;
                        m5Var = this;
                        b11 = b10;
                        i14 = i13;
                        h5Var2 = h5Var;
                        childCount = i11;
                    }
                }
                return bitmap;
            }
            Bitmap c11 = g5Var.c(false, false);
            createBitmap = c11 != null ? Bitmap.createBitmap(c11.getWidth(), c11.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        m5Var.Q0 = BigInteger.ONE;
        i10 = 0;
        while (i7 < h5Var2.getChildCount()) {
        }
        if (i10 > 0) {
        }
        return bitmap;
    }

    public final boolean r0() {
        return this.n0.a() || this.V1;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.q0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(boolean z10) {
        int i7 = 0;
        if (this.a2) {
            G0(0);
        }
        if (z10) {
            ly lyVar = this.Z1;
            if (lyVar == null || lyVar.getVisibility() != 0) {
                t0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Z1.getMeasuredHeight());
            ofFloat.addUpdateListener(new d4(this, i7));
            this.c2 = true;
            ofFloat.addListener(new x4(this, 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
            ofFloat.start();
        }
    }

    public void setBlurManager(org.telegram.ui.Components.u9 u9Var) {
        this.O1 = u9Var;
    }

    public void setCoverPreview(boolean z10) {
        if (this.W1 != z10) {
            this.W1 = z10;
            if (z10) {
                A0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j3) {
        int i7 = 0;
        while (true) {
            h5 h5Var = this.B0;
            if (i7 >= h5Var.getChildCount()) {
                return;
            }
            View childAt = h5Var.getChildAt(i7);
            if (childAt instanceof tg.f2) {
                ImageReceiver imageReceiver = ((tg.f2) childAt).y0;
                ch0 B = imageReceiver.B();
                imageReceiver.m();
                if (B != null) {
                    B.N(Math.round(((j3 % B.r()) / B.r()) * B.e[0]), true, false);
                }
            }
            i7++;
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.I1) {
            this.I1 = z10;
            d0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.v1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.u1 = runnable;
    }

    @Override // tg.c1
    public final void t() {
        if (!this.b2 && !this.a2) {
            this.V1 = true;
            l0(true);
            return;
        }
        if (this.a2) {
            tg.j jVar = this.t0;
            if (jVar instanceof tg.n2) {
                this.y1.e = true;
                org.telegram.messenger.g0.J3(((tg.n2) jVar).getEditText());
            }
        }
        G0(!this.a2 ? 1 : 0);
    }

    public final void t0() {
        ly lyVar;
        if (!this.a2 && (lyVar = this.Z1) != null && lyVar.getVisibility() != 8) {
            this.Z1.setVisibility(8);
        }
        int i7 = this.d2;
        this.d2 = 0;
        if (i7 != 0) {
            this.y1.a();
        }
    }

    @Override // tg.h
    public final boolean u(tg.j jVar) {
        return A0(jVar, true);
    }

    @Override // org.telegram.ui.Components.st0, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        this.o1.setColor(-15132391);
    }

    @Override // tg.h
    public final void v(float f10, float f11, float[] fArr) {
        View view;
        View view2 = (View) this.y0.getParent();
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
        if (this.M1) {
            if (this.J1.getReactionsWindow() == null || this.J1.getReactionsWindow().q) {
                L0(false);
                return true;
            }
            this.J1.e();
            return true;
        }
        if (this.l1) {
            F0(false);
            return true;
        }
        if (this.a2) {
            s0(true);
            return true;
        }
        if (!this.u0) {
            return false;
        }
        if (!this.w0) {
            A0(null, true);
            return true;
        }
        this.w0 = false;
        this.y1.b(true);
        return false;
    }

    @Override // tg.g1
    public final void w(sg.h hVar) {
        boolean z10 = hVar instanceof sg.b;
        tg.m1 m1Var = this.N0;
        if (z10 || (hVar instanceof sg.d)) {
            m1Var.b(0.4f, 1.75f);
        } else {
            m1Var.b(0.05f, 1.0f);
        }
        m1Var.setDrawCenter(!(hVar instanceof sg.g));
        g5 g5Var = this.y0;
        if (g5Var.getCurrentBrush() instanceof sg.g) {
            this.M0 = true;
        }
        g5Var.setBrush(hVar);
        sg.h1 h1Var = this.k1;
        int i7 = h1Var.a;
        h1Var.a = sg.k0.e(this.p1).c();
        h1Var.c = this.O0.get();
        B0(h1Var, Integer.valueOf(i7), false);
        this.z0.invalidate();
    }

    public abstract void w0(boolean z10);

    @Override // tg.g1
    public final sg.k0 x() {
        return sg.k0.e(this.p1);
    }

    public final void x0() {
        final int i7 = this.I0;
        O0(1);
        postDelayed(new ai.o(this, 16), 350L);
        a5 a5Var = new a5(this, getContext(), this.q1, i7);
        this.U1 = a5Var;
        ra raVar = this.w1;
        Objects.requireNonNull(raVar);
        int i10 = 0;
        a5Var.x1 = new q4(raVar, i10);
        final boolean[] zArr = {true};
        a5Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hi.r4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                m5 m5Var = m5.this;
                m5Var.U1 = null;
                if (zArr[0]) {
                    m5Var.w0(false);
                }
                m5Var.O0(i7);
            }
        });
        a5Var.z1 = new l4(this);
        a5Var.N0(new s4(this, zArr, a5Var, i10));
        a5Var.show();
        w0(true);
    }

    public final void y0(tg.j jVar) {
        this.n0.b(jVar.getUUID(), new i4(this, jVar, 0));
    }

    public final void z0(tg.j jVar) {
        tg.j jVar2 = this.t0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.n0, false);
            A0(null, true);
            if (jVar instanceof tg.n2) {
                ValueAnimator valueAnimator = this.L0;
                if (valueAnimator != null && this.J0 != 0) {
                    valueAnimator.cancel();
                }
                O0(0);
            }
        }
        this.B0.removeView(jVar);
        d0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            sg.k1 k1Var = this.n0;
            k1Var.b.remove(uuid);
            k1Var.c.remove(uuid);
            org.telegram.messenger.g0.h3(new q2.d(k1Var, 11));
        }
        tg.m1 m1Var = this.N0;
        gc.b bVar = this.O0;
        m1Var.setValueOverride(bVar);
        m1Var.setShowPreview(true);
        float f10 = bVar.get();
        sg.h1 h1Var = this.k1;
        h1Var.c = f10;
        B0(h1Var, null, false);
        if (this.X1 || !(jVar instanceof tg.r1)) {
            return;
        }
        sa saVar = ((u9) this).k2;
        ga gaVar = saVar.Y0;
        if (gaVar != null) {
            gaVar.s(null, null, true);
        }
        u9 u9Var = saVar.w1;
        if (u9Var != null) {
            u9Var.n0();
        }
        ia iaVar = saVar.d1;
        if (iaVar != null) {
            iaVar.setHasRoundVideo(false);
        }
        d7 d7Var = saVar.L1;
        if (d7Var != null) {
            File file = d7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                saVar.L1.o0 = null;
            }
            if (saVar.L1.p0 != null) {
                try {
                    new File(saVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                saVar.L1.p0 = null;
            }
        }
    }

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f10) {
    }

    public View getView() {
        return this;
    }
}

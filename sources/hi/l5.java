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
import org.telegram.messenger.b20;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.ec;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.q10;
import org.telegram.messenger.ri;
import org.telegram.messenger.vr;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public abstract class l5 extends bu0 implements tg.g1, tg.h, tg.c1, zt0, pa {
    public final r4 A0;
    public ArrayList A1;
    public final g5 B0;
    public int B1;
    public final FrameLayout C0;
    public int C1;
    public final h5 D0;
    public sg.q D1;
    public final r4 E0;
    public final boolean E1;
    public final FrameLayout F0;
    public final File F1;
    public x4 G0;
    public final boolean G1;
    public final View H0;
    public final boolean H1;
    public int I0;
    public boolean I1;
    public int J0;
    public vi0 J1;
    public float K0;
    public tg.q1 K1;
    public ValueAnimator L0;
    public float L1;
    public boolean M0;
    public boolean M1;
    public final tg.m1 N0;
    public boolean N1;
    public final w4 O0;
    public org.telegram.ui.Components.ca O1;
    public final int P0;
    public final v5 P1;
    public BigInteger Q0;
    public final w5 Q1;
    public TextView R0;
    public boolean R1;
    public TextView S0;
    public ObjectAnimator S1;
    public TextView T0;
    public final float[] T1;
    public final tg.h1 U0;
    public z4 U1;
    public final tg.e1 V0;
    public boolean V1;
    public final tg.j1 W0;
    public boolean W1;
    public final ImageView X0;
    public boolean X1;
    public final TextView Y0;
    public final int[] Y1;
    public final TextView Z0;
    public ry Z1;
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
    public final s4 g1;
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
    public final org.telegram.messenger.r5 o0;
    public final Paint o1;
    public final we p0;
    public final int p1;
    public boolean q0;
    public final d5 q1;
    public vt0 r0;
    public org.telegram.ui.ActionBar.h1 r1;
    public boolean s0;
    public j5 s1;
    public tg.j t0;
    public Rect t1;
    public boolean u0;
    public Runnable u1;
    public int v0;
    public Runnable v1;
    public boolean w0;
    public final sa w1;
    public final boolean x0;
    public AnimatorSet x1;
    public final f5 y0;
    public final t4 y1;
    public final bi.i3 z0;
    public d7 z1;

    public l5(Context context, boolean z10, File file, boolean z11, boolean z12, sa saVar, Activity activity, final int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, d7 d7Var, int i11, int i12, we weVar, org.telegram.ui.Components.ca caVar, org.telegram.ui.ActionBar.i6 i6Var, v5 v5Var, w5 w5Var) {
        super(context, activity);
        sg.h1 h1Var;
        org.telegram.ui.Components.ca caVar2;
        int i13;
        this.I0 = 0;
        this.J0 = -1;
        final v9 v9Var = (v9) this;
        w4 w4Var = new w4(v9Var, 0);
        this.O0 = w4Var;
        Paint paint = new Paint(1);
        this.b1 = paint;
        Paint paint2 = new Paint(1);
        this.c1 = paint2;
        this.h1 = new Paint(1);
        this.i1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.j1 = paint3;
        sg.h1 h1Var2 = new sg.h1(1.0f, 0.016773745f, -1);
        this.k1 = h1Var2;
        this.o1 = new Paint(1);
        this.T1 = new float[2];
        this.W1 = false;
        this.Y1 = new int[2];
        new a8.sa(v9Var, 27);
        setDelegate(this);
        this.O1 = caVar;
        this.P1 = v5Var;
        this.E1 = z10;
        this.F1 = file;
        this.G1 = z11;
        this.H1 = z12;
        this.w1 = saVar;
        this.B1 = i11;
        this.C1 = i12;
        this.Q1 = w5Var;
        this.p1 = i7;
        d5 d5Var = new d5(0, i6Var);
        this.q1 = d5Var;
        this.p0 = weVar;
        this.x0 = context instanceof BubbleActivity;
        sg.k0 e10 = sg.k0.e(i7);
        e10.i(0, true);
        h1Var2.a = e10.c();
        h1Var2.c = e10.i;
        org.telegram.messenger.r5 r5Var = new org.telegram.messenger.r5("Paint", true);
        this.o0 = r5Var;
        this.m0 = bitmap;
        this.P0 = i10;
        sg.k1 k1Var = new sg.k1();
        this.n0 = k1Var;
        k1Var.a = new di.c7(v9Var, 20);
        View view = new View(context);
        this.H0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        sg.i0 i0Var = new sg.i0(getPaintingSize(), null, i10, caVar);
        if (d7Var == null || !d7Var.u) {
            h1Var = h1Var2;
            caVar2 = caVar;
        } else {
            h1Var = h1Var2;
            caVar2 = null;
        }
        f5 f5Var = new f5(v9Var, context, i0Var, bitmap, bitmap2, caVar2);
        this.y0 = f5Var;
        f5Var.setDelegate(new ob.c(v9Var, 29));
        f5Var.setUndoStore(k1Var);
        f5Var.setQueue(r5Var);
        f5Var.setVisibility(4);
        int i14 = 2;
        bi.i3 i3Var = new bi.i3(i14, context, v9Var);
        this.z0 = i3Var;
        i3Var.setVisibility(4);
        g5 g5Var = new g5(v9Var, context, new h9.g1(v9Var, i14));
        this.B0 = g5Var;
        this.z1 = d7Var;
        this.A1 = arrayList;
        if (this.B1 > 0 && this.C1 > 0) {
            E0();
        }
        g5Var.setVisibility(4);
        this.A0 = new r4(v9Var, context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.C0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{TLObject.FLAG_30, 0}));
        addView(frameLayout, c8.ma.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        final int i15 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: hi.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        v9 v9Var2 = v9Var;
                        f5 f5Var2 = v9Var2.y0;
                        if (f5Var2 != null && (f5Var2.getCurrentBrush() instanceof sg.g)) {
                            f5Var2.b();
                            v9Var2.U0.setSelectedIndex(1);
                            v9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            v9Var2.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        v9 v9Var3 = v9Var;
                        f5 f5Var3 = v9Var3.y0;
                        sg.k1 k1Var2 = v9Var3.n0;
                        if (k1Var2.a()) {
                            if (f5Var3 != null && (f5Var3.getCurrentBrush() instanceof sg.g)) {
                                f5Var3.b();
                                v9Var3.U0.setSelectedIndex(1);
                                v9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (f5Var3 != null) {
                                f5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            v9Var3.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        v9 v9Var4 = v9Var;
                        tg.j jVar = v9Var4.t0;
                        if (jVar instanceof tg.m2) {
                            org.telegram.messenger.g0.v1(((tg.m2) jVar).getFocusedView());
                        }
                        if (v9Var4.a2) {
                            v9Var4.s0(false);
                        }
                        v9Var4.z0(v9Var4.t0);
                        v9Var4.A0(null, true);
                        break;
                    case 3:
                        v9Var.A0(null, true);
                        break;
                    default:
                        v9 v9Var5 = v9Var;
                        if (!v9Var5.l1) {
                            if (!v9Var5.a2) {
                                if (!v9Var5.u0) {
                                    Runnable runnable = v9Var5.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    v9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                v9Var5.s0(true);
                                break;
                            }
                        } else {
                            v9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, c8.ma.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(gd.M0(2131747074, null));
        linearLayout.addView(n10.e(context, R.drawable.photo_zoomout), c8.ma.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, c8.ma.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.o(8));
        frameLayout.addView(linearLayout, c8.ma.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.Y0 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(gd.M0(2131747086, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        final int i16 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: hi.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        v9 v9Var2 = v9Var;
                        f5 f5Var2 = v9Var2.y0;
                        if (f5Var2 != null && (f5Var2.getCurrentBrush() instanceof sg.g)) {
                            f5Var2.b();
                            v9Var2.U0.setSelectedIndex(1);
                            v9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            v9Var2.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        v9 v9Var3 = v9Var;
                        f5 f5Var3 = v9Var3.y0;
                        sg.k1 k1Var2 = v9Var3.n0;
                        if (k1Var2.a()) {
                            if (f5Var3 != null && (f5Var3.getCurrentBrush() instanceof sg.g)) {
                                f5Var3.b();
                                v9Var3.U0.setSelectedIndex(1);
                                v9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (f5Var3 != null) {
                                f5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            v9Var3.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        v9 v9Var4 = v9Var;
                        tg.j jVar = v9Var4.t0;
                        if (jVar instanceof tg.m2) {
                            org.telegram.messenger.g0.v1(((tg.m2) jVar).getFocusedView());
                        }
                        if (v9Var4.a2) {
                            v9Var4.s0(false);
                        }
                        v9Var4.z0(v9Var4.t0);
                        v9Var4.A0(null, true);
                        break;
                    case 3:
                        v9Var.A0(null, true);
                        break;
                    default:
                        v9 v9Var5 = v9Var;
                        if (!v9Var5.l1) {
                            if (!v9Var5.a2) {
                                if (!v9Var5.u0) {
                                    Runnable runnable = v9Var5.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    v9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                v9Var5.s0(true);
                                break;
                            }
                        } else {
                            v9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView2, c8.ma.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.Z0 = m10;
        m10.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
        m10.setText(gd.M0(2131752090, null));
        m10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m10.setGravity(16);
        m10.setTextColor(-1);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setTextSize(1, 16.0f);
        final int i17 = 2;
        m10.setOnClickListener(new View.OnClickListener() { // from class: hi.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        v9 v9Var2 = v9Var;
                        f5 f5Var2 = v9Var2.y0;
                        if (f5Var2 != null && (f5Var2.getCurrentBrush() instanceof sg.g)) {
                            f5Var2.b();
                            v9Var2.U0.setSelectedIndex(1);
                            v9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            v9Var2.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        v9 v9Var3 = v9Var;
                        f5 f5Var3 = v9Var3.y0;
                        sg.k1 k1Var2 = v9Var3.n0;
                        if (k1Var2.a()) {
                            if (f5Var3 != null && (f5Var3.getCurrentBrush() instanceof sg.g)) {
                                f5Var3.b();
                                v9Var3.U0.setSelectedIndex(1);
                                v9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (f5Var3 != null) {
                                f5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            v9Var3.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        v9 v9Var4 = v9Var;
                        tg.j jVar = v9Var4.t0;
                        if (jVar instanceof tg.m2) {
                            org.telegram.messenger.g0.v1(((tg.m2) jVar).getFocusedView());
                        }
                        if (v9Var4.a2) {
                            v9Var4.s0(false);
                        }
                        v9Var4.z0(v9Var4.t0);
                        v9Var4.A0(null, true);
                        break;
                    case 3:
                        v9Var.A0(null, true);
                        break;
                    default:
                        v9 v9Var5 = v9Var;
                        if (!v9Var5.l1) {
                            if (!v9Var5.a2) {
                                if (!v9Var5.u0) {
                                    Runnable runnable = v9Var5.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    v9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                v9Var5.s0(true);
                                break;
                            }
                        } else {
                            v9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        m10.setAlpha(0.0f);
        m10.setVisibility(8);
        TextView m11 = org.telegram.ui.Cells.c0.m(frameLayout, m10, c8.ma.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.a1 = m11;
        m11.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
        m11.setText(gd.M0(2131751343, null));
        m11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m11.setGravity(16);
        m11.setTextColor(-1);
        m11.setTypeface(org.telegram.messenger.g0.o());
        m11.setTextSize(1, 16.0f);
        final int i18 = 3;
        m11.setOnClickListener(new View.OnClickListener() { // from class: hi.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        v9 v9Var2 = v9Var;
                        f5 f5Var2 = v9Var2.y0;
                        if (f5Var2 != null && (f5Var2.getCurrentBrush() instanceof sg.g)) {
                            f5Var2.b();
                            v9Var2.U0.setSelectedIndex(1);
                            v9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            v9Var2.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        v9 v9Var3 = v9Var;
                        f5 f5Var3 = v9Var3.y0;
                        sg.k1 k1Var2 = v9Var3.n0;
                        if (k1Var2.a()) {
                            if (f5Var3 != null && (f5Var3.getCurrentBrush() instanceof sg.g)) {
                                f5Var3.b();
                                v9Var3.U0.setSelectedIndex(1);
                                v9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (f5Var3 != null) {
                                f5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            v9Var3.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        v9 v9Var4 = v9Var;
                        tg.j jVar = v9Var4.t0;
                        if (jVar instanceof tg.m2) {
                            org.telegram.messenger.g0.v1(((tg.m2) jVar).getFocusedView());
                        }
                        if (v9Var4.a2) {
                            v9Var4.s0(false);
                        }
                        v9Var4.z0(v9Var4.t0);
                        v9Var4.A0(null, true);
                        break;
                    case 3:
                        v9Var.A0(null, true);
                        break;
                    default:
                        v9 v9Var5 = v9Var;
                        if (!v9Var5.l1) {
                            if (!v9Var5.a2) {
                                if (!v9Var5.u0) {
                                    Runnable runnable = v9Var5.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    v9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                v9Var5.s0(true);
                                break;
                            }
                        } else {
                            v9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        m11.setAlpha(0.0f);
        m11.setVisibility(8);
        frameLayout.addView(m11, c8.ma.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        h5 h5Var = new h5(v9Var, context, e10);
        this.D0 = h5Var;
        h5Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        h5Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(h5Var, c8.ma.e(-1, ks.p1, 80));
        tg.h1 h1Var3 = new tg.h1(context, (d7Var == null || d7Var.v() || d7Var.u || caVar == null) ? false : true);
        this.U0 = h1Var3;
        h1Var3.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        h1Var3.setDelegate(this);
        h1Var3.setSelectedIndex(1);
        h5Var.addView(h1Var3, c8.ma.c(48.0f, -1));
        tg.e1 e1Var = new tg.e1(context);
        this.V0 = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        e1Var.setVisibility(8);
        e1Var.setDelegate(this);
        final int i19 = 1;
        post(new Runnable() { // from class: hi.e4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        v9 v9Var2 = v9Var;
                        sg.h1 h1Var4 = v9Var2.k1;
                        v9Var2.C0(h1Var4);
                        sg.k0.e(i7).j(h1Var4.c);
                        break;
                    default:
                        v9Var.V0.setTypeface(sg.k0.e(i7).j);
                        break;
                }
            }
        });
        e1Var.setAlignment(sg.k0.e(i7).g);
        h5Var.addView(e1Var, c8.ma.c(48.0f, -1));
        r4 r4Var = new r4(v9Var, context, 0);
        this.E0 = r4Var;
        addView(r4Var, c8.ma.c(-1.0f, -1));
        tg.j1 j1Var = new tg.j1(context);
        this.W0 = j1Var;
        j1Var.setVisibility(8);
        j1Var.setOnItemClickListener(new bi.i8(v9Var, 11));
        e1Var.setTypefaceListView(j1Var);
        r4Var.addView(j1Var, c8.ma.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, d5Var));
        s4 s4Var = new s4(v9Var, context);
        this.g1 = s4Var;
        s4Var.setVisibility(8);
        s4Var.setColorPalette(sg.k0.e(i7));
        s4Var.setColorListener(new bi.p8(v9Var, 2));
        h5Var.addView(s4Var, c8.ma.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        tg.v0 v0Var = new tg.v0(context);
        this.k0 = v0Var;
        v0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        v0Var.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        h5Var.addView(v0Var, c8.ma.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        final int i20 = 4;
        v0Var.setOnClickListener(new View.OnClickListener() { // from class: hi.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i20) {
                    case 0:
                        v9 v9Var2 = v9Var;
                        f5 f5Var2 = v9Var2.y0;
                        if (f5Var2 != null && (f5Var2.getCurrentBrush() instanceof sg.g)) {
                            f5Var2.b();
                            v9Var2.U0.setSelectedIndex(1);
                            v9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            v9Var2.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        v9 v9Var3 = v9Var;
                        f5 f5Var3 = v9Var3.y0;
                        sg.k1 k1Var2 = v9Var3.n0;
                        if (k1Var2.a()) {
                            if (f5Var3 != null && (f5Var3.getCurrentBrush() instanceof sg.g)) {
                                f5Var3.b();
                                v9Var3.U0.setSelectedIndex(1);
                                v9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (f5Var3 != null) {
                                f5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            v9Var3.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        v9 v9Var4 = v9Var;
                        tg.j jVar = v9Var4.t0;
                        if (jVar instanceof tg.m2) {
                            org.telegram.messenger.g0.v1(((tg.m2) jVar).getFocusedView());
                        }
                        if (v9Var4.a2) {
                            v9Var4.s0(false);
                        }
                        v9Var4.z0(v9Var4.t0);
                        v9Var4.A0(null, true);
                        break;
                    case 3:
                        v9Var.A0(null, true);
                        break;
                    default:
                        v9 v9Var5 = v9Var;
                        if (!v9Var5.l1) {
                            if (!v9Var5.a2) {
                                if (!v9Var5.u0) {
                                    Runnable runnable = v9Var5.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    v9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                v9Var5.s0(true);
                                break;
                            }
                        } else {
                            v9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        tg.z0 z0Var = new tg.z0(context);
        this.l0 = z0Var;
        z0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        z0Var.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        z0Var.setOnClickListener(new ah.h(v9Var, context, e10, 15));
        h5Var.addView(z0Var, c8.ma.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        tg.m1 m1Var = new tg.m1(context);
        this.N0 = m1Var;
        sg.h1 h1Var4 = h1Var;
        m1Var.setColorSwatch(h1Var4);
        m1Var.setRenderView(f5Var);
        m1Var.setValueOverride(w4Var);
        h1Var4.c = w4Var.get();
        final int i21 = 0;
        m1Var.setOnUpdate(new Runnable() { // from class: hi.e4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        v9 v9Var2 = v9Var;
                        sg.h1 h1Var42 = v9Var2.k1;
                        v9Var2.C0(h1Var42);
                        sg.k0.e(i7).j(h1Var42.c);
                        break;
                    default:
                        v9Var.V0.setTypeface(sg.k0.e(i7).j);
                        break;
                }
            }
        });
        addView(m1Var, c8.ma.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.F0 = frameLayout2;
        addView(frameLayout2, c8.ma.c(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        B0(h1Var4, null, false);
        w((sg.h) sg.h.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.q;
            i13 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        } else {
            i13 = 1;
        }
        this.y1 = new t4(v9Var, saVar, new ai.v1(16, v9Var, saVar));
        j2.C1 = i13;
    }

    public static void D0(tg.m2 m2Var, int i7) {
        m2Var.setAlign(i7);
        int i10 = 2;
        m2Var.getEditText().setGravity(i7 != 1 ? i7 != 2 ? 19 : 21 : 17);
        if (i7 == 1) {
            i10 = 4;
        } else if (i7 == 2 ? !gd.a0 : gd.a0) {
            i10 = 3;
        }
        m2Var.getEditText().setTextAlignment(i10);
    }

    public static void X(v9 v9Var, sg.k0 k0Var, Integer num) {
        k0Var.h(num.intValue(), true);
        k0Var.g();
        v9Var.setNewColor(num.intValue());
        v9Var.g1.setSelectedColorIndex(k0Var.d());
        v9Var.D1 = null;
    }

    public static /* synthetic */ void Y(v9 v9Var, Integer num) {
        v9Var.setNewColor(num.intValue());
        v9Var.F0(false);
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

    private vt0 getPaintingSize() {
        vt0 vt0Var = this.r0;
        if (vt0Var != null) {
            return vt0Var;
        }
        vt0 vt0Var2 = new vt0(1080.0f, 1920.0f);
        this.r0 = vt0Var2;
        return vt0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i7 = 0;
        while (true) {
            g5 g5Var = this.B0;
            if (i7 >= g5Var.getChildCount()) {
                return;
            }
            View childAt = g5Var.getChildAt(i7);
            if (childAt instanceof tg.f2) {
                ImageReceiver imageReceiver = ((tg.f2) childAt).y0;
                mh0 B = imageReceiver.B();
                org.telegram.ui.Components.b6 m10 = imageReceiver.m();
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
        if (jVar instanceof tg.m2) {
            ((tg.m2) jVar).setType(i7);
        }
        sg.k0 e10 = sg.k0.e(this.p1);
        e10.h = i7;
        e10.a.edit().putInt("text_type", i7).apply();
        this.V0.e(i7, true);
    }

    private void setupTabsLayout(Context context) {
        x4 x4Var = new x4(this, context);
        this.G0 = x4Var;
        final int i7 = 0;
        x4Var.setClipToPadding(false);
        this.G0.setOrientation(0);
        this.D0.addView(this.G0, c8.ma.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.R0 = textView;
        textView.setText(gd.M0(2131747084, null).toUpperCase());
        TextView textView2 = this.R0;
        int i10 = org.telegram.ui.ActionBar.n6.i6;
        d5 d5Var = this.q1;
        org.telegram.ui.ActionBar.u6.Q(textView2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, d5Var), 7, -1), null, org.telegram.ui.ActionBar.u6.M(i10), d5Var);
        this.R0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.R0.setTextColor(-1);
        final int i11 = 1;
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(org.telegram.messenger.g0.o());
        this.R0.setSingleLine();
        this.R0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.z3
            public final /* synthetic */ l5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        l5 l5Var = this.b;
                        if (!l5Var.u0) {
                            l5Var.O0(0);
                            break;
                        } else {
                            l5Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        l5 l5Var2 = this.b;
                        l5Var2.O0(2);
                        if (!(l5Var2.t0 instanceof tg.m2)) {
                            l5Var2.V1 = true;
                            l5Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.G0.addView(this.R0, c8.ma.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.S0 = textView3;
        textView3.setText(gd.M0(2131747083, null).toUpperCase());
        org.telegram.ui.ActionBar.u6.Q(this.S0, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, d5Var), 7, -1), null, org.telegram.ui.ActionBar.u6.M(i10), d5Var);
        this.S0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.z3
            public final /* synthetic */ l5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        l5 l5Var = this.b;
                        if (!l5Var.u0) {
                            l5Var.O0(0);
                            break;
                        } else {
                            l5Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        l5 l5Var2 = this.b;
                        l5Var2.O0(2);
                        if (!(l5Var2.t0 instanceof tg.m2)) {
                            l5Var2.V1 = true;
                            l5Var2.l0(true);
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
        this.G0.addView(this.S0, c8.ma.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.T0 = textView4;
        textView4.setText(gd.M0(2131747082, null).toUpperCase());
        org.telegram.ui.ActionBar.u6.Q(this.T0, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, d5Var), 7, -1), null, org.telegram.ui.ActionBar.u6.M(i10), d5Var);
        this.T0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.T0.setTextColor(-1);
        this.T0.setTextSize(1, 14.0f);
        this.T0.setGravity(1);
        this.T0.setTypeface(org.telegram.messenger.g0.o());
        this.T0.setAlpha(0.6f);
        this.T0.setSingleLine();
        final int i12 = 2;
        this.T0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.z3
            public final /* synthetic */ l5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        l5 l5Var = this.b;
                        if (!l5Var.u0) {
                            l5Var.O0(0);
                            break;
                        } else {
                            l5Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        l5 l5Var2 = this.b;
                        l5Var2.O0(2);
                        if (!(l5Var2.t0 instanceof tg.m2)) {
                            l5Var2.V1 = true;
                            l5Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.G0.addView(this.T0, c8.ma.l(1.0f, 0, -2));
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
        K0(new i4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final boolean A0(tg.j jVar, boolean z10) {
        boolean z11;
        db dbVar;
        db dbVar2;
        vi0 vi0Var;
        int i7;
        boolean z12 = jVar instanceof tg.m2;
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
            tg.m2 m2Var = (tg.m2) jVar;
            int gravity = m2Var.getEditText().getGravity();
            if (gravity == 17) {
                i10 = 1;
            } else if (gravity != 21) {
                i10 = 0;
            }
            tg.e1 e1Var = this.V0;
            e1Var.setAlignment(i10);
            sg.a0 typeface = m2Var.getTypeface();
            if (typeface != null) {
                e1Var.setTypeface(typeface.a);
            }
            e1Var.e(m2Var.getType(), true);
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
                    if (jVar instanceof tg.n2) {
                        tg.n2 n2Var = (tg.n2) jVar;
                        n2Var.setType((n2Var.getType() + 1) % n2Var.getTypesCount());
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
                        if (jVar instanceof tg.m2) {
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
                        if (q1Var2 != null && q1Var2 != q1Var && (vi0Var = this.J1) != null) {
                            vi0Var.animate().alpha(0.0f).setListener(new ai.j0(vi0Var, 22));
                            this.J1 = null;
                            this.M1 = false;
                            this.L1 = 0.0f;
                        }
                        if (this.J1 == null) {
                            vi0 vi0Var2 = new vi0(2, this.p1, getContext(), LaunchActivity.Q(), new fi.g2(6, new fi.b()));
                            this.J1 = vi0Var2;
                            org.telegram.ui.Components.ga gaVar = new org.telegram.ui.Components.ga(this.O1, vi0Var2, 0, false);
                            this.J1.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                            this.w1.addView(this.J1, c8.ma.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.a.o(-16777216, 120));
                            this.J1.setDelegate(new a8.r7(this, gaVar, paint));
                            this.J1.p(null, null, true);
                        }
                        this.J1.setFragment(LaunchActivity.Q());
                        this.K1 = q1Var;
                        L0(true);
                        return true;
                    }
                    if (jVar2 instanceof tg.m2) {
                        org.telegram.messenger.g0.I3(((tg.m2) jVar2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.n0, false);
            tg.j jVar3 = this.t0;
            if (jVar3 instanceof tg.m2) {
                tg.m2 m2Var2 = (tg.m2) jVar3;
                tg.l2 l2Var = m2Var2.r0;
                l2Var.clearFocus();
                l2Var.setEnabled(false);
                l2Var.setClickable(false);
                m2Var2.m();
                if (!z12) {
                    this.u0 = false;
                    org.telegram.messenger.g0.v1(((tg.m2) this.t0).getFocusedView());
                    s0(false);
                }
            } else if ((jVar3 instanceof tg.r1) && (dbVar2 = ((v9) this).k2.a1) != null) {
                dbVar2.l(false);
            }
            z11 = true;
        }
        tg.j jVar4 = this.t0;
        this.t0 = jVar;
        if ((jVar4 instanceof tg.m2) && TextUtils.isEmpty(((tg.m2) jVar4).getText())) {
            z0(jVar4);
        }
        tg.j jVar5 = this.t0;
        if (jVar4 != jVar5 && (jVar5 instanceof tg.r1) && (dbVar = ((v9) this).k2.a1) != null) {
            dbVar.l(true);
        }
        tg.j jVar6 = this.t0;
        w4 w4Var = this.O0;
        sg.h1 h1Var = this.k1;
        tg.m1 m1Var = this.N0;
        if (jVar6 != null) {
            r4 r4Var = this.A0;
            jVar6.n0 = r4Var;
            jVar6.l(r4Var, true);
            tg.j jVar7 = this.t0;
            if (jVar7 instanceof tg.m2) {
                tg.m2 m2Var3 = (tg.m2) jVar7;
                m2Var3.getSwatch().c = h1Var.c;
                m2Var3.A0 = false;
                C0(m2Var3.getSwatch());
                m1Var.setValueOverride(new u4(m2Var3, (int) (this.r0.a / 9.0f), 0));
                m1Var.setShowPreview(false);
            } else {
                m1Var.setValueOverride(w4Var);
                m1Var.setShowPreview(true);
                h1Var.c = w4Var.get();
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
            m1Var.setValueOverride(w4Var);
            m1Var.setShowPreview(true);
            h1Var.c = w4Var.get();
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
        f5 f5Var = this.y0;
        f5Var.setColor(i10);
        f5Var.setBrushSize(h1Var.c);
        int i11 = h1Var2.a;
        int i12 = 0;
        if (num == null || num.intValue() == i11) {
            h5 h5Var = this.D0;
            if (h5Var != null) {
                h5Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new a4(this, num, i11, i12));
            duration.start();
        }
        tg.j jVar = this.t0;
        if (jVar instanceof tg.m2) {
            ((tg.m2) jVar).setSwatch(new sg.h1(h1Var.b, h1Var.c, h1Var.a));
            return;
        }
        if (z10 && (jVar instanceof tg.n0)) {
            ((tg.n0) jVar).setColor(h1Var.a);
            ((tg.n0) this.t0).setType(3);
        } else if (z10 && (jVar instanceof tg.n2)) {
            ((tg.n2) jVar).setColor(h1Var.a);
            ((tg.n2) this.t0).setType(3);
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
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, android.view.ViewGroup, hi.g5] */
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
            c20 c20Var = (c20) arrayList.get(i10);
            byte b10 = c20Var.a;
            if (b10 == 0) {
                c5 k02 = k0(c20Var.C, c20Var.B);
                if ((2 & c20Var.b) != 0) {
                    k02.r(z10);
                }
                ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                layoutParams.width = c20Var.q;
                layoutParams.height = c20Var.r;
                i7 = size;
                jVar2 = k02;
            } else if (b10 == 1) {
                tg.m2 l02 = l0(z10);
                l02.setType(c20Var.b);
                l02.setTypeface(c20Var.n);
                l02.setBaseFontSize(c20Var.m);
                SpannableString spannableString = new SpannableString(c20Var.j);
                ?? r42 = c20Var.k;
                int size2 = r42.size();
                for (?? r62 = z10; r62 < size2; r62++) {
                    b20 b20Var = (b20) r42.get(r62);
                    org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(b20Var.document_id, 1.0f, l02.getFontMetricsInt());
                    int i11 = b20Var.offset;
                    spannableString.setSpan(x5Var, i11, b20Var.length + i11, 33);
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
                D0(l02, c20Var.p);
                sg.h1 swatch = l02.getSwatch();
                swatch.a = c20Var.l;
                l02.setSwatch(swatch);
                jVar2 = l02;
            } else {
                i7 = size;
                if (b10 == 2) {
                    tg.n1 h02 = h0(c20Var.j, false);
                    h02.H0 = c20Var.u;
                    h02.C0 = false;
                    if ((2 & c20Var.b) != 0) {
                        h02.r(false);
                    }
                    if ((c20Var.b & 16) != 0) {
                        h02.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                    layoutParams2.width = c20Var.q;
                    layoutParams2.height = c20Var.r;
                    jVar2 = h02;
                } else {
                    if (b10 == 6) {
                        ArrayList arrayList2 = d7Var.v;
                        boolean z11 = d7Var.K;
                        this.V1 = true;
                        f10 = 1.0f;
                        tg.j b5Var = new b5(this, getContext(), c0(), arrayList2, this.O1, z11, this.P1);
                        b5Var.setDelegate(this);
                        r14.addView(b5Var);
                        d0();
                        jVar = b5Var;
                        if (c20Var.q > 0) {
                            jVar = b5Var;
                            if (c20Var.r > 0) {
                                ViewGroup.LayoutParams layoutParams3 = b5Var.getLayoutParams();
                                layoutParams3.width = c20Var.q;
                                layoutParams3.height = c20Var.r;
                                jVar = b5Var;
                            }
                        }
                    } else {
                        f10 = 1.0f;
                        if (b10 == 3) {
                            tg.n0 g02 = g0(c20Var.N, c20Var.M);
                            int i12 = c20Var.l;
                            if (i12 != 0) {
                                g02.setColor(i12);
                            }
                            g02.setType(c20Var.b);
                            jVar = g02;
                        } else if (b10 == 8) {
                            qb qbVar = c20Var.O;
                            if (qbVar == null) {
                                i10++;
                                size = i7;
                                z10 = false;
                            } else {
                                tg.n2 m0 = m0(qbVar);
                                int i13 = c20Var.l;
                                if (i13 != 0) {
                                    m0.setColor(i13);
                                }
                                m0.setType(c20Var.b);
                                jVar = m0;
                            }
                        } else if (b10 == 7) {
                            tg.k0 f02 = f0(c20Var.W);
                            tg.i0 i0Var = f02.r0;
                            int i14 = c20Var.l;
                            if (i14 != 0) {
                                f02.setColor(i14);
                            }
                            boolean e10 = i0Var.e();
                            int i15 = i0Var.h;
                            int i16 = i0Var.f;
                            if (e10) {
                                i0Var.setPreviewType(c20Var.b);
                            }
                            byte b11 = c20Var.b;
                            if (b11 == -1) {
                                f02.setType(3);
                                i0Var.d();
                                c20Var.q = ((int) Math.ceil(i0Var.b0)) + i16 + i16;
                                c20Var.r = ((int) Math.ceil(i0Var.c0)) + i15 + i15;
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
                            i02.s(ch.p0.d(c20Var.M.reaction), false);
                            if (c20Var.M.flipped) {
                                i02.r(false);
                            }
                            jVar = i02;
                            if (c20Var.M.dark) {
                                i02.q(false);
                                jVar = i02;
                            }
                        } else {
                            if (b10 == 5 && d7Var.o0 != null) {
                                tg.r1 j02 = j0(d7Var.p0, false);
                                ta taVar = ((v9) this).k2;
                                ha haVar = taVar.Y0;
                                if (haVar != null) {
                                    haVar.x = j02;
                                    f61 f61Var = haVar.y;
                                    if (f61Var != null) {
                                        f61Var.A0(j02.v0);
                                    }
                                }
                                ja jaVar = taVar.d1;
                                if (jaVar != null) {
                                    jaVar.setHasRoundVideo(true);
                                }
                                jVar = j02;
                                if ((c20Var.b & 2) != 0) {
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
                    jVar.setX((c20Var.c * this.B1) - (((f10 - c20Var.v) * c20Var.q) / 2.0f));
                    jVar.setY((c20Var.d * this.C1) - (((f10 - c20Var.v) * c20Var.r) / 2.0f));
                    jVar.setPosition(new PointF((c20Var.q / 2.0f) + jVar.getX(), (c20Var.r / 2.0f) + jVar.getY()));
                    jVar.setScale(c20Var.v);
                    jVar.setRotation((float) (((-c20Var.e) / 3.141592653589793d) * 180.0d));
                    i10++;
                    size = i7;
                    z10 = false;
                }
            }
            f10 = 1.0f;
            jVar = jVar2;
            jVar.setX((c20Var.c * this.B1) - (((f10 - c20Var.v) * c20Var.q) / 2.0f));
            jVar.setY((c20Var.d * this.C1) - (((f10 - c20Var.v) * c20Var.r) / 2.0f));
            jVar.setPosition(new PointF((c20Var.q / 2.0f) + jVar.getX(), (c20Var.r / 2.0f) + jVar.getY()));
            jVar.setScale(c20Var.v);
            jVar.setRotation((float) (((-c20Var.e) / 3.141592653589793d) * 180.0d));
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
                    l5 l5Var = l5.this;
                    h5 h5Var = l5Var.D0;
                    float f12 = f10 / 1000.0f;
                    l5Var.n1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(l5Var.n1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(l5Var.n1, 0.25f) / 0.25f));
                    s4 s4Var = l5Var.g1;
                    float f14 = l5Var.n1;
                    boolean z11 = z10;
                    s4Var.B1(z11, f14);
                    tg.z0 z0Var = l5Var.l0;
                    z0Var.setProgress(l5Var.n1);
                    tg.v0 v0Var = l5Var.k0;
                    v0Var.setProgress(l5Var.n1);
                    l5Var.G0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * l5Var.n1);
                    AnimatorSet animatorSet = l5Var.x1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f15 = l5Var.n1;
                        if (!z11) {
                            f15 = 1.0f - f15;
                        }
                        float f16 = z11 ? 1.0f : 0.0f;
                        float f17 = alpha;
                        z0Var.setAlpha(org.telegram.messenger.g0.T1(f17, f16, f15));
                        v0Var.setAlpha(org.telegram.messenger.g0.T1(f17, z11 ? 1.0f : 0.0f, f15));
                        h5Var.setTranslationY(translationY - ((org.telegram.messenger.g0.L(39.0f) * f15) * (z11 ? 1 : -1)));
                    }
                    h5Var.invalidate();
                    if (view == l5Var.V0) {
                        l5Var.E0.invalidate();
                    }
                }
            });
            this.m1.a(new c4(this, z10, i7));
            this.m1.h();
            if (z10) {
                s4 s4Var = this.g1;
                s4Var.setVisibility(0);
                s4Var.setSelectedColorIndex(sg.k0.e(this.p1).d());
            }
        }
    }

    public final void G0(int i7) {
        tg.e1 e1Var = this.V0;
        t4 t4Var = this.y1;
        int i10 = 1;
        if (i7 == 1) {
            ry ryVar = this.Z1;
            boolean z10 = ryVar != null && ryVar.getVisibility() == 0;
            ry ryVar2 = this.Z1;
            sa saVar = this.w1;
            if (ryVar2 != null && ryVar2.d1 != j10.t0) {
                saVar.removeView(ryVar2);
                this.Z1 = null;
            }
            if (this.Z1 == null) {
                ry ryVar3 = new ry(null, true, false, false, getContext(), false, null, null, true, this.q1, false, false);
                this.Z1 = ryVar3;
                ryVar3.y2 = false;
                ryVar3.V0 = true;
                ryVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.Z1.setForseMultiwindowLayout(true);
                }
                this.Z1.setDelegate(new e5(this));
                saVar.addView(this.Z1);
            }
            this.Z1.setVisibility(0);
            this.a2 = true;
            ry ryVar4 = this.Z1;
            if (this.f2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f2 = mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.g2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.g2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.g2 = mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.q;
            int paddingUnderContainer = saVar.getPaddingUnderContainer() + (point.x > point.y ? this.g2 : this.f2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ryVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            ryVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                tg.j jVar = this.t0;
                if (jVar instanceof tg.m2) {
                    org.telegram.messenger.g0.v1(((tg.m2) jVar).getEditText());
                }
            }
            this.d2 = paddingUnderContainer;
            t4Var.a();
            requestLayout();
            yg emojiButton = e1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(wg.d, true);
            }
            if (!z10) {
                if (this.b2) {
                    this.e2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d2, 0.0f);
                    ofFloat.addUpdateListener(new d4(this, i10));
                    ofFloat.addListener(new v4(this, i10));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.w);
                    ofFloat.start();
                }
            }
        } else {
            yg emojiButton2 = e1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(wg.e, true);
            }
            ry ryVar5 = this.Z1;
            if (ryVar5 != null) {
                this.a2 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    ryVar5.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.d2 = 0;
                t4Var.a();
            }
            requestLayout();
        }
        P0();
    }

    public final void H0(tg.k0 k0Var) {
        l7 l7Var = new l7(getContext(), this.q1, this.Q1, new ai.v1(18, this, k0Var));
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
            String M0 = gd.M0(2131744406, null);
            d dVar = l7Var.X1;
            dVar.i(M0, false, true);
            di.f0 f0Var = l7Var.T1;
            if (f0Var != null) {
                f0Var.O(false);
            }
            dVar.setEnabled(l7Var.g1(k3Var2.getText().toString()));
            l7Var.Y1 = false;
        }
        l7Var.setOnDismissListener(new n4(this, 1));
        l7Var.show();
        w0(true);
    }

    public final void I0(tg.n0 n0Var, q10 q10Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        si siVar = new si(getContext(), new a5(this, q10Var), false, true, false, this.q1);
        siVar.X3 = new w7.s(10);
        sh shVar = siVar.v3;
        if (n0Var != null && (messageMedia = n0Var.v0) != null && (geoPoint = messageMedia.geo) != null) {
            siVar.y4 = new double[]{geoPoint.lat, geoPoint._long};
            siVar.J1 = true;
            shVar.setVisibility(8);
        } else if (this.E1) {
            siVar.w4 = this.G1;
            siVar.x4 = this.F1;
            siVar.J1 = true;
            shVar.setVisibility(8);
        } else {
            siVar.J1 = true;
            shVar.setVisibility(8);
        }
        siVar.setOnDismissListener(new n4(this, 0));
        siVar.f1();
        siVar.show();
    }

    public final void J0(tg.j jVar) {
        if (jVar instanceof tg.u0) {
            org.telegram.ui.ActionBar.h1 h1Var = this.r1;
            if (h1Var == null || !h1Var.isShowing()) {
                return;
            }
            this.r1.d(true);
            return;
        }
        int[] iArr = this.Y1;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        g5 g5Var = this.B0;
        float scaleX2 = g5Var.getScaleX() * scaleX;
        float scaleY = g5Var.getScaleY() * jVar.getScaleY() * jVar.getHeight();
        int i7 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i7;
        int i10 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i10;
        K0(new h4(this, jVar, 1), this, 51, i7, i10 - org.telegram.messenger.g0.L(32.0f), true);
    }

    public final void K0(Runnable runnable, l5 l5Var, int i7, int i10, int i11, boolean z10) {
        org.telegram.ui.ActionBar.h1 h1Var = this.r1;
        if (h1Var != null && h1Var.isShowing()) {
            this.r1.d(true);
            return;
        }
        int i12 = 0;
        if (this.s1 == null) {
            this.t1 = new Rect();
            j5 j5Var = new j5(this, getContext());
            this.s1 = j5Var;
            j5Var.setAnimationEnabled(true);
            this.s1.setOnTouchListener(new j4(0, this));
            this.s1.setDispatchKeyEventListener(new k4(this));
            this.s1.setShownFromBottom(true);
        }
        j5 j5Var2 = this.s1;
        j5Var2.a0 = z10;
        j5Var2.d();
        runnable.run();
        if (this.r1 == null) {
            org.telegram.ui.ActionBar.h1 h1Var2 = new org.telegram.ui.ActionBar.h1(this.s1, -2, -2);
            this.r1 = h1Var2;
            h1Var2.b = true;
            h1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.r1.setOutsideTouchable(true);
            this.r1.setClippingEnabled(true);
            this.r1.setInputMethodMode(2);
            this.r1.setSoftInputMode(0);
            this.r1.getContentView().setFocusableInTouchMode(true);
            this.r1.setOnDismissListener(new l4(i12, this));
        }
        this.s1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), TLObject.FLAG_31));
        this.r1.setFocusable(true);
        int measuredWidth = i10 - (this.s1.getMeasuredWidth() / 2);
        int measuredHeight = i11 - this.s1.getMeasuredHeight();
        this.r1.showAtLocation(l5Var, i7, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.h1.i(this.s1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            j5 j5Var3 = this.s1;
            j5Var3.setBackgroundDrawable(new org.telegram.ui.Components.fa(new org.telegram.ui.Components.ga(this.O1, j5Var3, 5, false), measuredWidth, measuredHeight, mutate, org.telegram.messenger.g0.N(8.3f)));
        } else {
            this.s1.setBackgroundDrawable(mutate);
            this.s1.setBackgroundColor(-14145495);
        }
    }

    @Override // org.telegram.ui.Components.zt0
    public final void L(int i7, boolean z10) {
        boolean z11;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.b2 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.g2 = i7;
                mp.f1().edit().putInt("kbd_height_land3", this.g2).commit();
            } else {
                this.f2 = i7;
                mp.f1().edit().putInt("kbd_height", this.f2).commit();
            }
        }
        boolean z12 = this.a2;
        t4 t4Var = this.y1;
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
                t4Var.a();
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
        if (jVar instanceof tg.m2) {
            this.b2 = ((tg.m2) jVar).getEditText().isFocused() && t4Var.c();
        } else {
            this.b2 = false;
        }
        if (this.b2 && this.a2) {
            G0(0);
        }
        if (this.d2 != 0 && !(z11 = this.b2) && z11 != z13 && !this.a2) {
            this.d2 = 0;
            t4Var.a();
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
                    this.J1.animate().alpha(0.0f).setDuration(150L).setListener(new v4(this, i7)).start();
                    return;
                }
                this.N1 = true;
                this.w1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L1, z10 ? 1.0f : 0.0f);
                this.J1.setTransitionProgress(this.L1);
                ofFloat.addUpdateListener(new d4(this, 2));
                ofFloat.addListener(new bi.e7(12, this, z10));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(lr.g);
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
            this.f1.b(new fi.q7(i7, this));
            this.f1.a(new c4(this, z10, i7));
            this.f1.h();
        }
    }

    public final PointF N0(tg.j jVar) {
        float f10;
        float f11;
        we weVar = this.p0;
        float f12 = weVar != null ? 200.0f / weVar.c : 200.0f;
        float f13 = 0.2f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f14 = weVar != null ? 100.0f / weVar.c : 100.0f;
        PointF c02 = c0();
        int i7 = 0;
        while (i7 < 10) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                g5 g5Var = this.B0;
                if (i10 >= g5Var.getChildCount()) {
                    break;
                }
                View childAt = g5Var.getChildAt(i10);
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
        duration.setInterpolator(lr.f);
        this.L0.addUpdateListener(new fi.z2(this, viewGroup3, viewGroup4, i12));
        this.L0.addListener(new y4(this, viewGroup3, viewGroup4, i7, 0));
        this.L0.start();
    }

    public final void P0() {
        t4 t4Var = this.y1;
        tg.e1 e1Var = this.V0;
        if (e1Var != null) {
            if (t4Var.c()) {
                e1Var.a(R.drawable.input_smile);
            } else if (this.a2) {
                e1Var.a(R.drawable.input_keyboard);
            } else {
                e1Var.a(R.drawable.msg_add);
            }
        }
        boolean z10 = t4Var.c() || this.a2;
        boolean z11 = !z10;
        org.telegram.messenger.g0.S3(1.0f, this.Y0, z11, false);
        org.telegram.messenger.g0.S3(1.0f, this.X0, z11, false);
        org.telegram.messenger.g0.S3(1.0f, this.a1, z10, false);
        org.telegram.messenger.g0.S3(1.0f, this.Z0, z10, false);
    }

    @Override // org.telegram.ui.Components.bu0, org.telegram.ui.Components.au0
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
        t4 t4Var = this.y1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!t4Var.c() || t4Var.d) && this.d2 <= 0) || (jVar = this.t0) == null) ? 0.0f : view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.S1 = ofFloat;
        ofFloat.setDuration(350L);
        this.S1.setInterpolator(lr.h);
        this.S1.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0() {
        boolean z10;
        if (this.t0 instanceof tg.m2) {
            t4 t4Var = this.y1;
            if ((t4Var.c() || this.d2 > 0) && !t4Var.d) {
                z10 = true;
                View view = this.H0;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new ch.k(7, this, z10)).start();
            }
        }
        z10 = false;
        View view2 = this.H0;
        view2.animate().cancel();
        view2.setVisibility(0);
        view2.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new ch.k(7, this, z10)).start();
    }

    @Override // tg.g1, tg.c1
    public final void a() {
        F0(true);
    }

    @Override // org.telegram.ui.Components.au0, org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Di));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.a7));
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
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new r1(2, this, view)).start();
    }

    @Override // tg.c1
    public final void c(int i7) {
        tg.j jVar = this.t0;
        if (jVar instanceof tg.m2) {
            D0((tg.m2) jVar, i7);
            sg.k0 e10 = sg.k0.e(this.p1);
            e10.g = i7;
            e10.a.edit().putInt("text_alignment", i7).apply();
        }
    }

    public final PointF c0() {
        g5 g5Var = this.B0;
        int measuredWidth = g5Var.getMeasuredWidth();
        int measuredHeight = g5Var.getMeasuredHeight();
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
        g5 g5Var = this.B0;
        boolean z11 = true;
        if (!z10 && !this.I1) {
            int i7 = 0;
            loop0: while (true) {
                if (i7 >= g5Var.getChildCount()) {
                    z11 = false;
                    break;
                }
                View childAt = g5Var.getChildAt(i7);
                boolean z12 = childAt instanceof tg.m2;
                int i10 = this.p1;
                if (z12) {
                    CharSequence text = ((tg.m2) childAt).getText();
                    if (text instanceof Spanned) {
                        for (org.telegram.ui.Components.x5 x5Var : (org.telegram.ui.Components.x5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.x5.class)) {
                            TLRPC.Document document = x5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.o5.e(i10, x5Var.getDocumentId());
                            }
                            if (document != null) {
                                org.telegram.ui.Components.o5.g(i10).e(document);
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
        for (int i11 = 0; i11 < g5Var.getChildCount(); i11++) {
            View childAt2 = g5Var.getChildAt(i11);
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
        we weVar;
        if ((view == this.y0 || view == this.z0 || view == this.B0 || view == this.A0) && (weVar = this.p0) != null) {
            canvas.save();
            r1 = this.x0 ? 0 : org.telegram.messenger.g0.m;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i7 = weVar.k;
            if (i7 != 90 && i7 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * weVar.e)) / weVar.c);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * weVar.f)) / weVar.c);
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
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.E8, this.q1);
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
        g5 g5Var = this.B0;
        float measuredWidth = g5Var.getMeasuredWidth() <= 0 ? this.B1 : g5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.k0 k0Var = new tg.k0(getContext(), N0, this.p1, h0Var, measuredWidth / 360.0f, L);
        if (N0.x == g5Var.getMeasuredWidth() / 2.0f) {
            k0Var.setStickyX(2);
        }
        if (N0.y == g5Var.getMeasuredHeight() / 2.0f) {
            k0Var.setStickyY(2);
        }
        sg.h1 h1Var = this.k1;
        if (h1Var != null && (i7 = h1Var.a) != -47814) {
            k0Var.setColor(i7);
        }
        k0Var.setDelegate(this);
        k0Var.setMaxWidth(L);
        g5Var.addView(k0Var, c8.ma.c(-2.0f, -2));
        d0();
        we weVar = this.p0;
        if (weVar != null) {
            k0Var.j(1.0f / weVar.c);
            k0Var.f(-(weVar.k + weVar.d));
        }
        return k0Var;
    }

    public final tg.n0 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i7;
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        g5 g5Var = this.B0;
        float measuredWidth = g5Var.getMeasuredWidth() <= 0 ? this.B1 : g5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.n0 n0Var = new tg.n0(getContext(), N0, this.p1, messageMedia, mediaArea, measuredWidth / 240.0f, L);
        if (N0.x == g5Var.getMeasuredWidth() / 2.0f) {
            n0Var.setStickyX(2);
        }
        if (N0.y == g5Var.getMeasuredHeight() / 2.0f) {
            n0Var.setStickyY(2);
        }
        sg.h1 h1Var = this.k1;
        if (h1Var != null && (i7 = h1Var.a) != -47814) {
            n0Var.setColor(i7);
        }
        n0Var.setDelegate(this);
        n0Var.setMaxWidth(L);
        g5Var.addView(n0Var, c8.ma.c(-2.0f, -2));
        d0();
        we weVar = this.p0;
        if (weVar != null) {
            n0Var.j(1.0f / weVar.c);
            n0Var.f(-(weVar.k + weVar.d));
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
        we weVar = this.p0;
        if (weVar != null) {
            return weVar.d + weVar.k;
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
        org.telegram.ui.Components.x5[] x5VarArr;
        g5 g5Var = this.B0;
        int childCount = g5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = g5Var.getChildAt(i7);
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
            } else if (childAt instanceof tg.m2) {
                CharSequence text = ((tg.m2) childAt).getText();
                if ((text instanceof Spanned) && (x5VarArr = (org.telegram.ui.Components.x5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.x5.class)) != null) {
                    for (org.telegram.ui.Components.x5 x5Var : x5VarArr) {
                        if (x5Var != null) {
                            TLRPC.Document document = x5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.o5.e(this.p1, x5Var.getDocumentId());
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
        vt0 vt0Var;
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
        g5 g5Var = this.B0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.B1, g5Var.getMeasuredWidth()) * 0.5d);
            vt0Var = new vt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.C1, g5Var.getMeasuredHeight()) * 0.5d);
            vt0Var = new vt0(f10 * floor2, floor2);
        }
        vt0 vt0Var2 = vt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = vt0Var2.a;
            vt0Var2.a = vt0Var2.b;
            vt0Var2.b = f11;
        }
        Context context = getContext();
        PointF c02 = c0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        tg.n1 n1Var = new tg.n1(context, c02, vt0Var2, str, intValue);
        n1Var.setDelegate(this);
        g5Var.addView(n1Var);
        d0();
        return n1Var;
    }

    @Override // hi.pa
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
        vt0 vt0Var = new vt0(org.telegram.messenger.g0.L(106.0f), org.telegram.messenger.g0.L(106.0f));
        PointF c02 = c0();
        g5 g5Var = this.B0;
        if (g5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i7 = 0; i7 < g5Var.getChildCount(); i7++) {
                    View childAt = g5Var.getChildAt(i7);
                    if (a8.w9.a(c02.x, c02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < org.telegram.messenger.g0.L(6.0f)) {
                        break;
                    }
                }
                c02.x = (g5Var.getMeasuredWidth() * 0.05f) + c02.x;
                c02.y = (g5Var.getMeasuredHeight() * 0.05f) + c02.y;
                c02.x = Utilities.i(c02.x, g5Var.getMeasuredWidth(), 0.0f);
                c02.y = Utilities.i(c02.y, g5Var.getMeasuredHeight(), 0.0f);
            }
        }
        tg.q1 q1Var = new tg.q1(getContext(), c02);
        q1Var.s0 = new fi.l8(q1Var);
        q1Var.t0 = new fi.l8(q1Var);
        q1Var.u0 = new ch.g0(q1Var);
        q1Var.v0 = new ch.g0(q1Var);
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(q1Var);
        q1Var.x0 = c6Var;
        org.telegram.ui.Components.c6 c6Var2 = new org.telegram.ui.Components.c6(q1Var);
        q1Var.y0 = c6Var2;
        q1Var.A0 = 1.0f;
        q1Var.r0 = vt0Var;
        c6Var2.e(true, 1.0f);
        c6Var.e(true, 1.0f);
        ArrayList arrayList = ri.d0(j10.t0).h;
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
        g5Var.addView(q1Var);
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
        g5 g5Var = this.B0;
        int measuredWidth = g5Var.getMeasuredWidth();
        g5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        vt0 vt0Var = new vt0(floor, floor);
        tg.r1 r1Var = new tg.r1(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - org.telegram.messenger.g0.L(16.0f), (vt0Var.b / 2.0f) + org.telegram.messenger.g0.L(72.0f)), vt0Var, str);
        r1Var.setDelegate(this);
        g5Var.addView(r1Var);
        d0();
        if (z10) {
            y0(r1Var);
            post(new y3(this, r1Var, 0));
        }
        this.X1 = false;
        return r1Var;
    }

    public final c5 k0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i7 = 0; i7 < document.attributes.size() && !(document.attributes.get(i7) instanceof TLRPC.TL_documentAttributeSticker); i7++) {
        }
        float f11 = 0.75f;
        we weVar = this.p0;
        if (weVar != null) {
            f10 = -(weVar.k + weVar.d);
            f11 = 0.75f / weVar.c;
        } else {
            f10 = 0.0f;
        }
        k5 k5Var = new k5(c0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        c5 c5Var = new c5(this, context, k5Var.a, k5Var.c, k5Var.b, new vt0(floor, floor), document, obj);
        boolean C4 = fj.C4(document);
        ImageReceiver imageReceiver = c5Var.y0;
        if (C4) {
            imageReceiver.p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.E0(12);
        c5Var.setDelegate(this);
        this.B0.addView(c5Var);
        d0();
        return c5Var;
    }

    public final tg.m2 l0(boolean z10) {
        vt0 paintingSize = getPaintingSize();
        PointF N0 = N0(null);
        tg.m2 m2Var = new tg.m2(getContext(), N0, (int) (paintingSize.a / 9.0f), "", this.k1, this.v0);
        float f10 = paintingSize.a / 9.0f;
        i4 i4Var = new i4(this, 0);
        m2Var.x0 = (int) (0.5f * f10);
        m2Var.y0 = (int) (f10 * 2.0f);
        m2Var.z0 = i4Var;
        float f11 = N0.x;
        g5 g5Var = this.B0;
        if (f11 == g5Var.getMeasuredWidth() / 2.0f) {
            m2Var.setStickyX(2);
        }
        if (N0.y == g5Var.getMeasuredHeight() / 2.0f) {
            m2Var.setStickyY(2);
        }
        m2Var.setDelegate(this);
        m2Var.setMaxWidth(this.B1 - org.telegram.messenger.g0.L(32.0f));
        int i7 = this.p1;
        m2Var.setTypeface(sg.k0.e(i7).j);
        m2Var.setType(sg.k0.e(i7).h);
        g5Var.addView(m2Var, c8.ma.c(-2.0f, -2));
        d0();
        we weVar = this.p0;
        if (weVar != null) {
            m2Var.j(1.0f / weVar.c);
            m2Var.f(-(weVar.k + weVar.d));
        }
        if (z10) {
            y0(m2Var);
            m2Var.q();
            A0(m2Var, false);
            m2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.I3(m2Var.getFocusedView());
            this.u0 = true;
            int i10 = sg.k0.e(i7).g;
            tg.e1 e1Var = this.V0;
            e1Var.d(i10, true);
            e1Var.setOutlineType(sg.k0.e(i7).h);
        }
        return m2Var;
    }

    public final tg.n2 m0(qb qbVar) {
        int i7;
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        g5 g5Var = this.B0;
        float measuredWidth = g5Var.getMeasuredWidth() <= 0 ? this.B1 : g5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.n2 n2Var = new tg.n2(getContext(), N0, this.p1, qbVar, measuredWidth / 240.0f, L);
        if (N0.x == g5Var.getMeasuredWidth() / 2.0f) {
            n2Var.setStickyX(2);
        }
        if (N0.y == g5Var.getMeasuredHeight() / 2.0f) {
            n2Var.setStickyY(2);
        }
        sg.h1 h1Var = this.k1;
        if (h1Var != null && (i7 = h1Var.a) != -47814) {
            n2Var.setColor(i7);
        }
        n2Var.setDelegate(this);
        n2Var.setMaxWidth(L);
        g5Var.addView(n2Var, c8.ma.c(-2.0f, -2));
        d0();
        we weVar = this.p0;
        if (weVar != null) {
            n2Var.j(1.0f / weVar.c);
            n2Var.f(-(weVar.k + weVar.d));
        }
        return n2Var;
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
            g5 g5Var = this.B0;
            if (i7 >= g5Var.getChildCount()) {
                return;
            }
            View childAt = g5Var.getChildAt(i7);
            if (childAt instanceof tg.r1) {
                if (this.t0 == childAt) {
                    A0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(lr.h).withEndAction(new y3(this, (tg.r1) childAt, 1)).start();
            }
            i7++;
        }
    }

    public abstract void o0();

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        vi0 vi0Var = this.J1;
        if (vi0Var != null) {
            org.telegram.messenger.g0.E2(vi0Var);
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
            g5 g5Var = this.B0;
            if (i7 >= g5Var.getChildCount()) {
                return null;
            }
            View childAt = g5Var.getChildAt(i7);
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
        g5 g5Var;
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
        di.n4 n4Var;
        boolean z16;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z17;
        TLRPC.Message message;
        org.telegram.ui.Cells.u0 u0Var2;
        di.h6 h6Var;
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
        l5 l5Var = this;
        f5 f5Var = l5Var.y0;
        int i14 = 0;
        byte b11 = 1;
        g5 g5Var2 = l5Var.B0;
        if (z10) {
            createBitmap = f5Var.c(false, z13);
        } else if (z12) {
            createBitmap = Bitmap.createBitmap(Math.max(1, g5Var2.getMeasuredWidth()), Math.max(1, g5Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z11) {
                bitmap = null;
                l5Var.Q0 = BigInteger.ONE;
                i10 = 0;
                for (i7 = 0; i7 < g5Var2.getChildCount(); i7++) {
                    if (g5Var2.getChildAt(i7) instanceof tg.j) {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    int childCount = g5Var2.getChildCount();
                    int i15 = 0;
                    while (i15 < childCount) {
                        View childAt = g5Var2.getChildAt(i15);
                        if (childAt instanceof tg.j) {
                            tg.j jVar = (tg.j) childAt;
                            jVar.getPosition();
                            c20 c20Var = new c20();
                            if (arrayList != null) {
                                boolean z21 = jVar instanceof tg.m2;
                                int i16 = l5Var.p1;
                                if (z21) {
                                    c20Var.a = b11;
                                    tg.m2 m2Var = (tg.m2) jVar;
                                    CharSequence text = m2Var.getText();
                                    if (text instanceof Spanned) {
                                        Spanned spanned2 = (Spanned) text;
                                        g5Var = g5Var2;
                                        org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spanned2.getSpans(i14, text.length(), org.telegram.ui.Components.x5.class);
                                        if (x5VarArr != null) {
                                            int i17 = i14;
                                            while (i17 < x5VarArr.length) {
                                                org.telegram.ui.Components.x5 x5Var = x5VarArr[i17];
                                                org.telegram.ui.Components.x5[] x5VarArr2 = x5VarArr;
                                                TLRPC.Document document = x5Var.document;
                                                int i18 = i17;
                                                if (document == null) {
                                                    document = org.telegram.ui.Components.o5.e(i16, x5Var.getDocumentId());
                                                }
                                                if (document != null) {
                                                    org.telegram.ui.Components.o5.g(i16).e(document);
                                                }
                                                b20 b20Var = new b20();
                                                int i19 = childCount;
                                                int i20 = i15;
                                                b20Var.document_id = x5Var.getDocumentId();
                                                b20Var.document = document;
                                                b20Var.offset = spanned2.getSpanStart(x5Var);
                                                b20Var.length = spanned2.getSpanEnd(x5Var) - b20Var.offset;
                                                org.telegram.messenger.w7.G(i16);
                                                b20Var.a = org.telegram.messenger.w7.J(document, null, true, true).getAbsolutePath();
                                                int i21 = 0;
                                                while (document != null) {
                                                    ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                    if (arrayList2 == null || arrayList2.isEmpty() || new File(b20Var.a).exists()) {
                                                        break;
                                                    }
                                                    org.telegram.messenger.w7.G(i16);
                                                    spanned = spanned2;
                                                    z20 = true;
                                                    b20Var.a = org.telegram.messenger.w7.J(document.thumbs.get(i21), null, true, true).getAbsolutePath();
                                                    i21++;
                                                    if (i21 >= document.thumbs.size()) {
                                                        break;
                                                    }
                                                    spanned2 = spanned;
                                                }
                                                spanned = spanned2;
                                                z20 = true;
                                                boolean K2 = fj.K2(b20Var.document, z20);
                                                if (K2 || u0(b20Var.document)) {
                                                    b20Var.c = (byte) (b20Var.c | (K2 ? (byte) 1 : (byte) 4));
                                                }
                                                if (fj.C4(b20Var.document)) {
                                                    b20Var.c = (byte) (b20Var.c | 8);
                                                }
                                                c20Var.k.add(b20Var);
                                                if (document != null) {
                                                    BigInteger valueOf = BigInteger.valueOf(5000L);
                                                    l5Var.Q0 = l5Var.Q0.multiply(valueOf).divide(l5Var.Q0.gcd(valueOf));
                                                }
                                                i17 = i18 + 1;
                                                x5VarArr = x5VarArr2;
                                                childCount = i19;
                                                i15 = i20;
                                                spanned2 = spanned;
                                            }
                                        }
                                    } else {
                                        g5Var = g5Var2;
                                    }
                                    i11 = childCount;
                                    i12 = i15;
                                    c20Var.j = text.toString();
                                    c20Var.b = (byte) m2Var.getType();
                                    c20Var.l = m2Var.getSwatch().a;
                                    c20Var.m = m2Var.getTextSize();
                                    c20Var.n = m2Var.getTypeface();
                                    c20Var.p = m2Var.getAlign();
                                } else {
                                    g5Var = g5Var2;
                                    i11 = childCount;
                                    i12 = i15;
                                    if (jVar instanceof tg.f2) {
                                        c20Var.a = (byte) 0;
                                        tg.f2 f2Var = (tg.f2) jVar;
                                        vt0 baseSize = f2Var.getBaseSize();
                                        c20Var.f = baseSize.a;
                                        c20Var.g = baseSize.b;
                                        c20Var.B = f2Var.getSticker();
                                        c20Var.C = f2Var.getParentObject();
                                        TLRPC.Document sticker = f2Var.getSticker();
                                        org.telegram.messenger.w7.G(j10.t0);
                                        c20Var.j = org.telegram.messenger.w7.J(sticker, null, true, true).getAbsolutePath();
                                        if (fj.K2(sticker, true) || u0(sticker)) {
                                            boolean K22 = fj.K2(sticker, true);
                                            c20Var.b = (byte) (c20Var.b | (K22 ? (byte) 1 : (byte) 4));
                                            r21 = (K22 || u0(sticker)) ? f2Var.getDuration() : 5000L;
                                            if (r21 != 0) {
                                                BigInteger valueOf2 = BigInteger.valueOf(r21);
                                                l5Var.Q0 = l5Var.Q0.multiply(valueOf2).divide(l5Var.Q0.gcd(valueOf2));
                                            }
                                        }
                                        if (fj.C4(sticker)) {
                                            c20Var.l = -1;
                                            c20Var.b = (byte) (c20Var.b | 8);
                                        }
                                        if (f2Var.u0) {
                                            c20Var.b = (byte) (c20Var.b | 2);
                                        }
                                    } else if (jVar instanceof tg.n1) {
                                        tg.n1 n1Var = (tg.n1) jVar;
                                        c20Var.a = (byte) 2;
                                        vt0 baseSize2 = n1Var.getBaseSize();
                                        c20Var.f = baseSize2.a;
                                        c20Var.g = baseSize2.b;
                                        c20Var.j = n1Var.q(i16);
                                        c20Var.u = n1Var.H0;
                                        if (n1Var.u0) {
                                            c20Var.b = (byte) (c20Var.b | 2);
                                        }
                                    } else if (jVar instanceof tg.n0) {
                                        tg.n0 n0Var = (tg.n0) jVar;
                                        tg.m0 m0Var = n0Var.r0;
                                        c20Var.a = (byte) 3;
                                        c20Var.b = (byte) n0Var.getType();
                                        c20Var.f = m0Var.getWidth();
                                        c20Var.g = m0Var.getHeight();
                                        c20Var.j = m0Var.getText();
                                        c20Var.l = n0Var.s0 ? n0Var.getColor() : 0;
                                        c20Var.P = m0Var.E;
                                        c20Var.N = n0Var.v0;
                                        TL_stories.MediaArea mediaArea2 = n0Var.w0;
                                        c20Var.M = mediaArea2;
                                        mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument = m0Var.getCodeEmojiDocument();
                                        if (codeEmojiDocument != null) {
                                            b20 b20Var2 = new b20();
                                            b20Var2.document_id = codeEmojiDocument.id;
                                            b20Var2.document = codeEmojiDocument;
                                            org.telegram.messenger.w7.G(i16);
                                            b20Var2.a = org.telegram.messenger.w7.J(codeEmojiDocument, null, true, true).getAbsolutePath();
                                            boolean K23 = fj.K2(b20Var2.document, true);
                                            if (K23 || u0(b20Var2.document)) {
                                                b20Var2.c = (byte) (b20Var2.c | (K23 ? (byte) 1 : (byte) 4));
                                            }
                                            c20Var.k.add(b20Var2);
                                        }
                                    } else if (jVar instanceof tg.n2) {
                                        tg.n2 n2Var = (tg.n2) jVar;
                                        tg.m0 m0Var2 = n2Var.r0;
                                        c20Var.a = (byte) 8;
                                        c20Var.b = (byte) n2Var.getType();
                                        c20Var.f = m0Var2.getWidth();
                                        c20Var.g = m0Var2.getHeight();
                                        c20Var.j = m0Var2.getText();
                                        c20Var.l = n2Var.s0 ? n2Var.getColor() : 0;
                                        c20Var.P = m0Var2.E;
                                        c20Var.O = n2Var.v0;
                                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                        tL_mediaAreaWeather.emoji = n2Var.v0.c;
                                        tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                        tL_mediaAreaWeather.color = m0Var2.f.getColor();
                                        c20Var.M = tL_mediaAreaWeather;
                                        tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument2 = m0Var2.getCodeEmojiDocument();
                                        if (codeEmojiDocument2 != null) {
                                            b20 b20Var3 = new b20();
                                            b20Var3.document_id = codeEmojiDocument2.id;
                                            b20Var3.document = codeEmojiDocument2;
                                            org.telegram.messenger.w7.G(i16);
                                            b20Var3.a = org.telegram.messenger.w7.J(codeEmojiDocument2, null, true, true).getAbsolutePath();
                                            boolean K24 = fj.K2(b20Var3.document, true);
                                            if (K24 || u0(b20Var3.document)) {
                                                b20Var3.c = (byte) (b20Var3.c | (K24 ? (byte) 1 : (byte) 4));
                                            }
                                            c20Var.k.add(b20Var3);
                                        }
                                        view = childAt;
                                        z16 = false;
                                        z17 = false;
                                        imageReceiver = null;
                                        arrayList.add(c20Var);
                                        scaleX = view.getScaleX();
                                        float scaleY = view.getScaleY();
                                        float x10 = view.getX();
                                        float y10 = view.getY();
                                        c20Var.q = view.getWidth();
                                        c20Var.r = view.getHeight();
                                        c20Var.f = (view.getWidth() * scaleX) / g5Var.getMeasuredWidth();
                                        c20Var.g = (view.getHeight() * scaleY) / g5Var.getMeasuredHeight();
                                        c20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10) / g5Var.getMeasuredWidth();
                                        c20Var.d = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y10) / g5Var.getMeasuredHeight();
                                        c20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                        c20Var.y = ((view.getWidth() / 2.0f) + x10) / g5Var.getMeasuredWidth();
                                        c20Var.z = ((view.getHeight() / 2.0f) + y10) / g5Var.getMeasuredHeight();
                                        c20Var.w = c20Var.q / g5Var.getMeasuredWidth();
                                        c20Var.x = c20Var.r / g5Var.getMeasuredHeight();
                                        c20Var.v = scaleX;
                                        if (jVar instanceof tg.u0) {
                                            z18 = z16;
                                            if (jVar instanceof tg.f2) {
                                                ImageReceiver imageReceiver5 = ((tg.f2) jVar).y0;
                                                RectF rectF = imageReceiver5.Q0;
                                                if (imageReceiver5.V % ks.K2 != 0) {
                                                    width = rectF.height();
                                                    height = rectF.width();
                                                } else {
                                                    width = rectF.width();
                                                    height = rectF.height();
                                                }
                                                float f10 = width / height;
                                                float f11 = (c20Var.f / 2.0f) + c20Var.c;
                                                float f12 = (c20Var.g / 2.0f) + c20Var.d;
                                                float measuredWidth = g5Var.getMeasuredWidth() / g5Var.getMeasuredHeight();
                                                if (f10 > 1.0f) {
                                                    float f13 = (c20Var.f * measuredWidth) / f10;
                                                    c20Var.g = f13;
                                                    c20Var.r = (int) (c20Var.q / f10);
                                                    c20Var.d = f12 - (f13 / 2.0f);
                                                } else if (f10 < 1.0f) {
                                                    float f14 = (c20Var.g / measuredWidth) * f10;
                                                    c20Var.f = f14;
                                                    c20Var.q = (int) (c20Var.r * f10);
                                                    c20Var.c = f11 - (f14 / 2.0f);
                                                }
                                            } else {
                                                TL_stories.MediaArea mediaArea3 = c20Var.M;
                                                if (mediaArea3 != null && (((z19 = jVar instanceof tg.n0)) || (jVar instanceof tg.n2) || (jVar instanceof tg.k0) || (jVar instanceof tg.q1))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                    float f15 = c20Var.c;
                                                    float f16 = c20Var.f;
                                                    mediaAreaCoordinates2.x = ((f16 / 2.0f) + f15) * 100.0f;
                                                    mediaAreaCoordinates2.y = ((c20Var.g / 2.0f) + c20Var.d) * 100.0f;
                                                    if (z19) {
                                                        tg.m0 m0Var3 = ((tg.n0) jVar).r0;
                                                        mediaAreaCoordinates2.w = n10.y(m0Var3.J * 2 * scaleX, g5Var.getMeasuredWidth(), f16, 100.0f);
                                                        c20Var.M.coordinates.h = n10.y(m0Var3.K * 2 * scaleY, g5Var.getMeasuredHeight(), c20Var.g, 100.0f);
                                                    } else if (jVar instanceof tg.n2) {
                                                        tg.m0 m0Var4 = ((tg.n2) jVar).r0;
                                                        mediaAreaCoordinates2.w = n10.y(m0Var4.J * 2 * scaleX, g5Var.getMeasuredWidth(), f16, 100.0f);
                                                        c20Var.M.coordinates.h = n10.y(m0Var4.K * 2 * scaleY, g5Var.getMeasuredHeight(), c20Var.g, 100.0f);
                                                    } else if (jVar instanceof tg.k0) {
                                                        tg.i0 i0Var = ((tg.k0) jVar).r0;
                                                        mediaAreaCoordinates2.w = n10.y(i0Var.f * 2 * scaleX, g5Var.getMeasuredWidth(), f16, 100.0f);
                                                        c20Var.M.coordinates.h = n10.y(i0Var.h * 2 * scaleY, g5Var.getMeasuredHeight(), c20Var.g, 100.0f);
                                                    } else if (jVar instanceof tg.q1) {
                                                        tg.q1 q1Var = (tg.q1) jVar;
                                                        float padding = ((q1Var.getPadding() * 2) * scaleX) / g5Var.getMeasuredWidth();
                                                        float padding2 = ((q1Var.getPadding() * 2) * scaleX) / g5Var.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = c20Var.M.coordinates;
                                                        mediaAreaCoordinates3.w = (c20Var.f - padding) * 100.0f;
                                                        mediaAreaCoordinates3.h = (c20Var.g - padding2) * 100.0f;
                                                    }
                                                    c20Var.M.coordinates.rotation = ((-c20Var.e) / 3.141592653589793d) * 180.0d;
                                                    if (z19) {
                                                        radius = ((tg.n0) jVar).r0.getRadius();
                                                    } else if (jVar instanceof tg.n2) {
                                                        radius = ((tg.n2) jVar).r0.getRadius();
                                                    } else if (jVar instanceof tg.k0) {
                                                        radius = ((tg.k0) jVar).r0.getRadius();
                                                    }
                                                    d = radius;
                                                }
                                            }
                                            d = -1.0d;
                                        } else {
                                            tg.u0 u0Var3 = (tg.u0) jVar;
                                            tg.p0 p0Var = u0Var3.s0;
                                            di.n4 n4Var2 = u0Var3.r0;
                                            RectF rectF2 = org.telegram.messenger.g0.P;
                                            z18 = z16;
                                            double r10 = u0Var3.r(rectF2);
                                            rectF2.offset(n4Var2.getX(), n4Var2.getY());
                                            rectF2.offset(p0Var.getX(), p0Var.getY());
                                            c20Var.M.coordinates.x = (((rectF2.centerX() * scaleX) + n10.w(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x10)) / g5Var.getMeasuredWidth()) * 100.0f;
                                            c20Var.M.coordinates.y = (((rectF2.centerY() * scaleY) + n10.w(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y10)) / g5Var.getMeasuredHeight()) * 100.0f;
                                            c20Var.M.coordinates.w = ((rectF2.width() * scaleX) / g5Var.getMeasuredWidth()) * 100.0f;
                                            c20Var.M.coordinates.h = ((rectF2.height() * scaleY) / g5Var.getMeasuredHeight()) * 100.0f;
                                            c20Var.M.coordinates.rotation = ((-c20Var.e) / 3.141592653589793d) * 180.0d;
                                            d = r10;
                                        }
                                        mediaArea = c20Var.M;
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
                                            c20Var.a = (byte) 7;
                                            if (i0Var2.e()) {
                                                c20Var.b = (byte) i0Var2.getPreviewType();
                                            } else {
                                                c20Var.b = (byte) k0Var.getType();
                                            }
                                            c20Var.f = i0Var2.getWidth();
                                            c20Var.g = i0Var2.getHeight();
                                            c20Var.l = k0Var.u0 ? k0Var.getColor() : 0;
                                            c20Var.P = i0Var2.e;
                                            c20Var.W = k0Var.v0;
                                            if (i0Var2.S) {
                                                ImageReceiver imageReceiver6 = i0Var2.U;
                                                if (i0Var2.S && imageReceiver6.J() && imageReceiver6.n() != null) {
                                                    ec.D().O(new BitmapDrawable(imageReceiver6.n()), imageReceiver6.R, false);
                                                }
                                                tg.h0 h0Var = c20Var.W;
                                                h0Var.a |= 4;
                                                h0Var.i = i0Var2.getPhotoSide();
                                            }
                                            TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                            c20Var.M = tL_mediaAreaUrl;
                                            tg.h0 h0Var2 = k0Var.v0;
                                            if (h0Var2 != null) {
                                                TLRPC.WebPage webPage = h0Var2.d;
                                                tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? k0Var.v0.c : k0Var.v0.d.url;
                                                c20Var.M.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                        } else {
                                            if (jVar instanceof tg.q1) {
                                                tg.q1 q1Var2 = (tg.q1) jVar;
                                                c20Var.a = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                c20Var.M = tL_mediaAreaSuggestedReaction;
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
                                                TL_stories.MediaArea mediaArea4 = c20Var.M;
                                                mediaArea4.dark = q1Var2.s0.a == 1;
                                                mediaArea4.flipped = q1Var2.z0;
                                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            } else if (jVar instanceof tg.r1) {
                                                tg.r1 r1Var = (tg.r1) jVar;
                                                vt0 baseSize3 = r1Var.getBaseSize();
                                                c20Var.f = baseSize3.a;
                                                c20Var.g = baseSize3.b;
                                                c20Var.a = (byte) 5;
                                                if (d7Var != null) {
                                                    c20Var.j = d7Var.o0.getAbsolutePath();
                                                    c20Var.Q = d7Var.r0;
                                                    long j3 = d7Var.q0;
                                                    c20Var.T = j3;
                                                    float f17 = j3;
                                                    c20Var.R = (long) (d7Var.s0 * f17);
                                                    c20Var.S = (long) (d7Var.t0 * f17);
                                                }
                                                c20Var.b = (byte) 4;
                                                if (r1Var.s0) {
                                                    c20Var.b = (byte) (c20Var.b | 2);
                                                }
                                            } else if (jVar instanceof tg.u0) {
                                                tg.u0 u0Var4 = (tg.u0) jVar;
                                                di.n4 n4Var3 = u0Var4.r0;
                                                ArrayList arrayList3 = u0Var4.t0;
                                                tg.p0 p0Var2 = u0Var4.s0;
                                                c20Var.a = (byte) 6;
                                                int width2 = u0Var4.getWidth();
                                                c20Var.q = width2;
                                                c20Var.f = width2;
                                                int height2 = u0Var4.getHeight();
                                                c20Var.r = height2;
                                                c20Var.g = height2;
                                                fj fjVar = arrayList3.size() > 0 ? (fj) arrayList3.get(0) : null;
                                                if (fjVar != null && (message = fjVar.k) != null) {
                                                    TLRPC.MessageAction messageAction = message.action;
                                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                        TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                        c20Var.M = tL_mediaAreaStarGift;
                                                        tL_mediaAreaStarGift.slug = starGift.slug;
                                                        tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        int i22 = 0;
                                                        while (true) {
                                                            if (i22 >= p0Var2.getChildCount()) {
                                                                u0Var2 = null;
                                                                break;
                                                            }
                                                            View childAt2 = p0Var2.getChildAt(i22);
                                                            if (childAt2 instanceof org.telegram.ui.Cells.u0) {
                                                                u0Var2 = (org.telegram.ui.Cells.u0) childAt2;
                                                                break;
                                                            }
                                                            i22++;
                                                        }
                                                        if (u0Var2 == null || (h6Var = u0Var2.I0) == null || (imageReceiver3 = h6Var.d) == null) {
                                                            u0Var = u0Var4;
                                                            n4Var = n4Var3;
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
                                                                                    matrix.postTranslate(n4Var.getX(), n4Var.getY());
                                                                                    matrix.postTranslate(p0Var2.getX(), p0Var2.getY());
                                                                                    matrix.postTranslate(view3.getX(), view3.getY());
                                                                                    matrix.postScale(u0Var.getScaleX(), u0Var.getScaleY(), u0Var.getPivotX(), u0Var.getPivotY());
                                                                                    matrix.postRotate(u0Var.getRotation(), u0Var.getPivotX(), u0Var.getPivotY());
                                                                                    matrix.postTranslate(u0Var.getX(), u0Var.getY());
                                                                                    matrix.postScale(1.0f / g5Var.getWidth(), 1.0f / g5Var.getHeight());
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
                                                            arrayList.add(c20Var);
                                                            scaleX = view.getScaleX();
                                                            float scaleY2 = view.getScaleY();
                                                            float x102 = view.getX();
                                                            float y102 = view.getY();
                                                            c20Var.q = view.getWidth();
                                                            c20Var.r = view.getHeight();
                                                            c20Var.f = (view.getWidth() * scaleX) / g5Var.getMeasuredWidth();
                                                            c20Var.g = (view.getHeight() * scaleY2) / g5Var.getMeasuredHeight();
                                                            c20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102) / g5Var.getMeasuredWidth();
                                                            c20Var.d = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y102) / g5Var.getMeasuredHeight();
                                                            c20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            c20Var.y = ((view.getWidth() / 2.0f) + x102) / g5Var.getMeasuredWidth();
                                                            c20Var.z = ((view.getHeight() / 2.0f) + y102) / g5Var.getMeasuredHeight();
                                                            c20Var.w = c20Var.q / g5Var.getMeasuredWidth();
                                                            c20Var.x = c20Var.r / g5Var.getMeasuredHeight();
                                                            c20Var.v = scaleX;
                                                            if (jVar instanceof tg.u0) {
                                                            }
                                                            mediaArea = c20Var.M;
                                                            if (mediaArea != null) {
                                                                mediaAreaCoordinates.flags |= 1;
                                                                mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        } else {
                                                            imageReceiver3.O0(false, false);
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) di.x8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                            if (stargiftattributemodel != null) {
                                                                float L = org.telegram.messenger.g0.L(110.0f);
                                                                float r11 = imageReceiver3.r() + u0Var2.getX() + p0Var2.getX() + u0Var2.G0;
                                                                float s5 = imageReceiver3.s() + u0Var2.getY() + p0Var2.getY() + u0Var2.H0;
                                                                u0Var = u0Var4;
                                                                c20 c20Var2 = new c20();
                                                                c20Var2.a = (byte) 0;
                                                                c20Var2.f = L;
                                                                c20Var2.g = L;
                                                                TLRPC.Document document2 = stargiftattributemodel.document;
                                                                c20Var2.B = document2;
                                                                c20Var2.C = starGift;
                                                                org.telegram.messenger.w7.G(j10.t0);
                                                                c20Var2.j = org.telegram.messenger.w7.K(document2, true).getAbsolutePath();
                                                                if (fj.K2(document2, true) || u0(document2)) {
                                                                    boolean K25 = fj.K2(document2, true);
                                                                    c20Var2.b = (byte) (c20Var2.b | (K25 ? (byte) 1 : (byte) 4));
                                                                    mh0 B = imageReceiver3.B();
                                                                    if (B != null && (K25 || u0(document2))) {
                                                                        r21 = B.r();
                                                                    }
                                                                    if (r21 != 0) {
                                                                        BigInteger valueOf3 = BigInteger.valueOf(r21);
                                                                        l5Var.Q0 = l5Var.Q0.multiply(valueOf3).divide(l5Var.Q0.gcd(valueOf3));
                                                                    }
                                                                }
                                                                float scaleX2 = childAt.getScaleX();
                                                                float scaleY3 = childAt.getScaleY();
                                                                float x11 = childAt.getX();
                                                                float y11 = childAt.getY();
                                                                int i23 = (int) L;
                                                                c20Var2.q = i23;
                                                                c20Var2.r = i23;
                                                                c20Var2.f = (L * scaleX2) / g5Var.getMeasuredWidth();
                                                                c20Var2.g = (L * scaleY3) / g5Var.getMeasuredHeight();
                                                                c20Var2.c = (childAt.getWidth() / 2.0f) + x11;
                                                                c20Var2.d = (childAt.getHeight() / 2.0f) + y11;
                                                                float w10 = n10.w(childAt.getWidth(), 2.0f, scaleX2, r11 * scaleX2);
                                                                n4Var = n4Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                view = childAt;
                                                                double d2 = w10;
                                                                double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                double w11 = n10.w(childAt.getHeight(), 2.0f, scaleY3, s5 * scaleY3);
                                                                c20Var2.c = (float) (((Math.cos(rotation) * d2) - (Math.sin(rotation) * w11)) + c20Var2.c);
                                                                float cos = (float) ((Math.cos(rotation) * w11) + (Math.sin(rotation) * d2) + c20Var2.d);
                                                                float f18 = (-L) / 2.0f;
                                                                float f19 = (f18 * scaleX2) + c20Var2.c;
                                                                c20Var2.c = f19;
                                                                c20Var2.d = (f18 * scaleY3) + cos;
                                                                c20Var2.c = f19 / g5Var.getMeasuredWidth();
                                                                c20Var2.d /= g5Var.getMeasuredHeight();
                                                                c20Var2.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                c20Var2.v = scaleX2;
                                                                arrayList.add(c20Var2);
                                                            } else {
                                                                u0Var = u0Var4;
                                                                n4Var = n4Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                view = childAt;
                                                            }
                                                            imageReceiver = imageReceiver4;
                                                            if (z12) {
                                                            }
                                                            z17 = true;
                                                            arrayList.add(c20Var);
                                                            scaleX = view.getScaleX();
                                                            float scaleY22 = view.getScaleY();
                                                            float x1022 = view.getX();
                                                            float y1022 = view.getY();
                                                            c20Var.q = view.getWidth();
                                                            c20Var.r = view.getHeight();
                                                            c20Var.f = (view.getWidth() * scaleX) / g5Var.getMeasuredWidth();
                                                            c20Var.g = (view.getHeight() * scaleY22) / g5Var.getMeasuredHeight();
                                                            c20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022) / g5Var.getMeasuredWidth();
                                                            c20Var.d = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y1022) / g5Var.getMeasuredHeight();
                                                            c20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            c20Var.y = ((view.getWidth() / 2.0f) + x1022) / g5Var.getMeasuredWidth();
                                                            c20Var.z = ((view.getHeight() / 2.0f) + y1022) / g5Var.getMeasuredHeight();
                                                            c20Var.w = c20Var.q / g5Var.getMeasuredWidth();
                                                            c20Var.x = c20Var.r / g5Var.getMeasuredHeight();
                                                            c20Var.v = scaleX;
                                                            if (jVar instanceof tg.u0) {
                                                            }
                                                            mediaArea = c20Var.M;
                                                            if (mediaArea != null) {
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        }
                                                    }
                                                }
                                                u0Var = u0Var4;
                                                n4Var = n4Var3;
                                                view = childAt;
                                                if (fjVar != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    c20Var.M = tL_inputMediaAreaChannelPost;
                                                    tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) c20Var.M).channel = mp.u1(i16).j1(-d7.p(fjVar));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) c20Var.M;
                                                    Boolean D = d7.D(fjVar);
                                                    tL_inputMediaAreaChannelPost2.msg_id = D == null ? 0 : D.booleanValue() ? fjVar.k.fwd_from.channel_post : fjVar.e1();
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    c20Var.M = tL_inputMediaAreaChannelPost3;
                                                    tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                                if (z12) {
                                                }
                                                z17 = true;
                                                arrayList.add(c20Var);
                                                scaleX = view.getScaleX();
                                                float scaleY222 = view.getScaleY();
                                                float x10222 = view.getX();
                                                float y10222 = view.getY();
                                                c20Var.q = view.getWidth();
                                                c20Var.r = view.getHeight();
                                                c20Var.f = (view.getWidth() * scaleX) / g5Var.getMeasuredWidth();
                                                c20Var.g = (view.getHeight() * scaleY222) / g5Var.getMeasuredHeight();
                                                c20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10222) / g5Var.getMeasuredWidth();
                                                c20Var.d = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y10222) / g5Var.getMeasuredHeight();
                                                c20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                c20Var.y = ((view.getWidth() / 2.0f) + x10222) / g5Var.getMeasuredWidth();
                                                c20Var.z = ((view.getHeight() / 2.0f) + y10222) / g5Var.getMeasuredHeight();
                                                c20Var.w = c20Var.q / g5Var.getMeasuredWidth();
                                                c20Var.x = c20Var.r / g5Var.getMeasuredHeight();
                                                c20Var.v = scaleX;
                                                if (jVar instanceof tg.u0) {
                                                }
                                                mediaArea = c20Var.M;
                                                if (mediaArea != null) {
                                                }
                                                z14 = z17;
                                                z15 = z18;
                                            }
                                            view = childAt;
                                            z16 = true;
                                            z17 = true;
                                            imageReceiver = null;
                                            arrayList.add(c20Var);
                                            scaleX = view.getScaleX();
                                            float scaleY2222 = view.getScaleY();
                                            float x102222 = view.getX();
                                            float y102222 = view.getY();
                                            c20Var.q = view.getWidth();
                                            c20Var.r = view.getHeight();
                                            c20Var.f = (view.getWidth() * scaleX) / g5Var.getMeasuredWidth();
                                            c20Var.g = (view.getHeight() * scaleY2222) / g5Var.getMeasuredHeight();
                                            c20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102222) / g5Var.getMeasuredWidth();
                                            c20Var.d = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y102222) / g5Var.getMeasuredHeight();
                                            c20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            c20Var.y = ((view.getWidth() / 2.0f) + x102222) / g5Var.getMeasuredWidth();
                                            c20Var.z = ((view.getHeight() / 2.0f) + y102222) / g5Var.getMeasuredHeight();
                                            c20Var.w = c20Var.q / g5Var.getMeasuredWidth();
                                            c20Var.x = c20Var.r / g5Var.getMeasuredHeight();
                                            c20Var.v = scaleX;
                                            if (jVar instanceof tg.u0) {
                                            }
                                            mediaArea = c20Var.M;
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
                                arrayList.add(c20Var);
                                scaleX = view.getScaleX();
                                float scaleY22222 = view.getScaleY();
                                float x1022222 = view.getX();
                                float y1022222 = view.getY();
                                c20Var.q = view.getWidth();
                                c20Var.r = view.getHeight();
                                c20Var.f = (view.getWidth() * scaleX) / g5Var.getMeasuredWidth();
                                c20Var.g = (view.getHeight() * scaleY22222) / g5Var.getMeasuredHeight();
                                c20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022222) / g5Var.getMeasuredWidth();
                                c20Var.d = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y1022222) / g5Var.getMeasuredHeight();
                                c20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                c20Var.y = ((view.getWidth() / 2.0f) + x1022222) / g5Var.getMeasuredWidth();
                                c20Var.z = ((view.getHeight() / 2.0f) + y1022222) / g5Var.getMeasuredHeight();
                                c20Var.w = c20Var.q / g5Var.getMeasuredWidth();
                                c20Var.x = c20Var.r / g5Var.getMeasuredHeight();
                                c20Var.v = scaleX;
                                if (jVar instanceof tg.u0) {
                                }
                                mediaArea = c20Var.M;
                                if (mediaArea != null) {
                                }
                                z14 = z17;
                                z15 = z18;
                            } else {
                                g5Var = g5Var2;
                                i11 = childCount;
                                i12 = i15;
                                view = childAt;
                                z14 = true;
                                z15 = false;
                                imageReceiver = null;
                            }
                            if (z14 && ((z11 || (z12 && c20Var.a == 6)) && bitmap != null)) {
                                Canvas canvas2 = new Canvas(bitmap);
                                float width3 = bitmap.getWidth() / g5Var.getMeasuredWidth();
                                int i24 = 0;
                                while (i24 < 2) {
                                    Canvas canvas3 = i24 == 0 ? canvas2 : null;
                                    if (canvas3 == null || (i24 == 0 && z15)) {
                                        canvas = canvas2;
                                        view2 = view;
                                    } else {
                                        canvas3.save();
                                        canvas3.scale(width3, width3);
                                        canvas3.translate(c20Var.c * g5Var.getMeasuredWidth(), c20Var.d * g5Var.getMeasuredHeight());
                                        canvas3.scale(view.getScaleX(), view.getScaleY());
                                        canvas3.rotate(view.getRotation(), ((c20Var.f / 2.0f) / view.getScaleX()) * g5Var.getMeasuredWidth(), ((c20Var.g / 2.0f) / view.getScaleY()) * g5Var.getMeasuredHeight());
                                        view2 = view;
                                        if (!(view2 instanceof tg.m2) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                            canvas = canvas2;
                                            if (view2 instanceof tg.u0) {
                                                tg.u0 u0Var5 = (tg.u0) view2;
                                                tg.p0 p0Var3 = u0Var5.s0;
                                                boolean z22 = true;
                                                u0Var5.v0 = true;
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
                                                u0Var5.v0 = false;
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
                                            Bitmap c10 = vr.c(scaleX3, scaleY4);
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
                            g5Var = g5Var2;
                            i11 = childCount;
                            i12 = i15;
                            b10 = b11;
                        }
                        i15 = i12 + 1;
                        l5Var = this;
                        b11 = b10;
                        i14 = i13;
                        g5Var2 = g5Var;
                        childCount = i11;
                    }
                }
                return bitmap;
            }
            Bitmap c11 = f5Var.c(false, false);
            createBitmap = c11 != null ? Bitmap.createBitmap(c11.getWidth(), c11.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        l5Var.Q0 = BigInteger.ONE;
        i10 = 0;
        while (i7 < g5Var2.getChildCount()) {
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
            ry ryVar = this.Z1;
            if (ryVar == null || ryVar.getVisibility() != 0) {
                t0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Z1.getMeasuredHeight());
            ofFloat.addUpdateListener(new d4(this, i7));
            this.c2 = true;
            ofFloat.addListener(new v4(this, 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.w);
            ofFloat.start();
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ca caVar) {
        this.O1 = caVar;
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
            g5 g5Var = this.B0;
            if (i7 >= g5Var.getChildCount()) {
                return;
            }
            View childAt = g5Var.getChildAt(i7);
            if (childAt instanceof tg.f2) {
                ImageReceiver imageReceiver = ((tg.f2) childAt).y0;
                mh0 B = imageReceiver.B();
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
            if (jVar instanceof tg.m2) {
                this.y1.e = true;
                org.telegram.messenger.g0.I3(((tg.m2) jVar).getEditText());
            }
        }
        G0(!this.a2 ? 1 : 0);
    }

    public final void t0() {
        ry ryVar;
        if (!this.a2 && (ryVar = this.Z1) != null && ryVar.getVisibility() != 8) {
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

    @Override // org.telegram.ui.Components.au0, org.telegram.ui.ActionBar.c6
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
        f5 f5Var = this.y0;
        if (f5Var.getCurrentBrush() instanceof sg.g) {
            this.M0 = true;
        }
        f5Var.setBrush(hVar);
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
        postDelayed(new ai.o(this, 18), 350L);
        z4 z4Var = new z4(this, getContext(), this.q1, i7);
        this.U1 = z4Var;
        sa saVar = this.w1;
        Objects.requireNonNull(saVar);
        z4Var.x1 = new bi.b(saVar, 29);
        final boolean[] zArr = {true};
        z4Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hi.p4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                l5 l5Var = l5.this;
                l5Var.U1 = null;
                if (zArr[0]) {
                    l5Var.w0(false);
                }
                l5Var.O0(i7);
            }
        });
        z4Var.z1 = new k4(this);
        z4Var.O0(new q4(this, zArr, z4Var, 0));
        z4Var.show();
        w0(true);
    }

    public final void y0(tg.j jVar) {
        this.n0.b(jVar.getUUID(), new h4(this, jVar, 0));
    }

    public final void z0(tg.j jVar) {
        tg.j jVar2 = this.t0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.n0, false);
            A0(null, true);
            if (jVar instanceof tg.m2) {
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
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var, 14));
        }
        tg.m1 m1Var = this.N0;
        w4 w4Var = this.O0;
        m1Var.setValueOverride(w4Var);
        m1Var.setShowPreview(true);
        float f10 = w4Var.get();
        sg.h1 h1Var = this.k1;
        h1Var.c = f10;
        B0(h1Var, null, false);
        if (this.X1 || !(jVar instanceof tg.r1)) {
            return;
        }
        ta taVar = ((v9) this).k2;
        ha haVar = taVar.Y0;
        if (haVar != null) {
            haVar.s(null, null, true);
        }
        v9 v9Var = taVar.w1;
        if (v9Var != null) {
            v9Var.n0();
        }
        ja jaVar = taVar.d1;
        if (jaVar != null) {
            jaVar.setHasRoundVideo(false);
        }
        d7 d7Var = taVar.L1;
        if (d7Var != null) {
            File file = d7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                taVar.L1.o0 = null;
            }
            if (taVar.L1.p0 != null) {
                try {
                    new File(taVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                taVar.L1.p0 = null;
            }
        }
    }

    public View getView() {
        return this;
    }

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f10) {
    }
}

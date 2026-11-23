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
import org.telegram.messenger.c20;
import org.telegram.messenger.d20;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.r10;
import org.telegram.messenger.si;
import org.telegram.messenger.wr;
import org.telegram.messenger.xe;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public abstract class k5 extends eu0 implements tg.h1, tg.h, tg.d1, cu0, oa {
    public final r4 A0;
    public ArrayList A1;
    public final f5 B0;
    public int B1;
    public final FrameLayout C0;
    public int C1;
    public final g5 D0;
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
    public xi0 J1;
    public float K0;
    public tg.s1 K1;
    public ValueAnimator L0;
    public float L1;
    public boolean M0;
    public boolean M1;
    public final tg.n1 N0;
    public boolean N1;
    public final w4 O0;
    public org.telegram.ui.Components.ca O1;
    public final int P0;
    public final u5 P1;
    public BigInteger Q0;
    public final v5 Q1;
    public TextView R0;
    public boolean R1;
    public TextView S0;
    public ObjectAnimator S1;
    public TextView T0;
    public final float[] T1;
    public final tg.i1 U0;
    public y4 U1;
    public final tg.f1 V0;
    public boolean V1;
    public final tg.k1 W0;
    public boolean W1;
    public final ImageView X0;
    public boolean X1;
    public final TextView Y0;
    public final int[] Y1;
    public final TextView Z0;
    public ty Z1;
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
    public final tg.w0 k0;
    public final sg.h1 k1;
    public final tg.a1 l0;
    public boolean l1;
    public final Bitmap m0;
    public r1.g m1;
    public final sg.k1 n0;
    public float n1;
    public final org.telegram.messenger.r5 o0;
    public final Paint o1;
    public final xe p0;
    public final int p1;
    public boolean q0;
    public final c5 q1;
    public yt0 r0;
    public org.telegram.ui.ActionBar.g1 r1;
    public boolean s0;
    public i5 s1;
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
    public final e5 y0;
    public final t4 y1;
    public final bi.m3 z0;
    public c7 z1;

    public k5(Context context, boolean z10, File file, boolean z11, boolean z12, ra raVar, Activity activity, final int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, c7 c7Var, int i11, int i12, xe xeVar, org.telegram.ui.Components.ca caVar, org.telegram.ui.ActionBar.h6 h6Var, u5 u5Var, v5 v5Var) {
        super(context, activity);
        sg.h1 h1Var;
        org.telegram.ui.Components.ca caVar2;
        int i13;
        this.I0 = 0;
        this.J0 = -1;
        final u9 u9Var = (u9) this;
        w4 w4Var = new w4(u9Var, 0);
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
        new a8.sa(u9Var, 27);
        setDelegate(this);
        this.O1 = caVar;
        this.P1 = u5Var;
        this.E1 = z10;
        this.F1 = file;
        this.G1 = z11;
        this.H1 = z12;
        this.w1 = raVar;
        this.B1 = i11;
        this.C1 = i12;
        this.Q1 = v5Var;
        this.p1 = i7;
        c5 c5Var = new c5(0, h6Var);
        this.q1 = c5Var;
        this.p0 = xeVar;
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
        k1Var.a = new di.v6(u9Var, 21);
        View view = new View(context);
        this.H0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        sg.i0 i0Var = new sg.i0(getPaintingSize(), null, i10, caVar);
        if (c7Var == null || !c7Var.u) {
            h1Var = h1Var2;
            caVar2 = caVar;
        } else {
            h1Var = h1Var2;
            caVar2 = null;
        }
        e5 e5Var = new e5(u9Var, context, i0Var, bitmap, bitmap2, caVar2);
        this.y0 = e5Var;
        e5Var.setDelegate(new ob.c(u9Var, 29));
        e5Var.setUndoStore(k1Var);
        e5Var.setQueue(r5Var);
        e5Var.setVisibility(4);
        int i14 = 2;
        bi.m3 m3Var = new bi.m3(i14, context, u9Var);
        this.z0 = m3Var;
        m3Var.setVisibility(4);
        f5 f5Var = new f5(u9Var, context, new h9.g1(u9Var, i14));
        this.B0 = f5Var;
        this.z1 = c7Var;
        this.A1 = arrayList;
        if (this.B1 > 0 && this.C1 > 0) {
            E0();
        }
        f5Var.setVisibility(4);
        this.A0 = new r4(u9Var, context, 1);
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
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, -1));
        final int i15 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: hi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        u9 u9Var2 = u9Var;
                        e5 e5Var2 = u9Var2.y0;
                        if (e5Var2 != null && (e5Var2.getCurrentBrush() instanceof sg.g)) {
                            e5Var2.b();
                            u9Var2.U0.setSelectedIndex(1);
                            u9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            u9Var2.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        u9 u9Var3 = u9Var;
                        e5 e5Var3 = u9Var3.y0;
                        sg.k1 k1Var2 = u9Var3.n0;
                        if (k1Var2.a()) {
                            if (e5Var3 != null && (e5Var3.getCurrentBrush() instanceof sg.g)) {
                                e5Var3.b();
                                u9Var3.U0.setSelectedIndex(1);
                                u9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (e5Var3 != null) {
                                e5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            u9Var3.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        u9 u9Var4 = u9Var;
                        tg.j jVar = u9Var4.t0;
                        if (jVar instanceof tg.n2) {
                            org.telegram.messenger.g0.v1(((tg.n2) jVar).getFocusedView());
                        }
                        if (u9Var4.a2) {
                            u9Var4.s0(false);
                        }
                        u9Var4.z0(u9Var4.t0);
                        u9Var4.A0(null, true);
                        break;
                    case 3:
                        u9Var.A0(null, true);
                        break;
                    default:
                        u9 u9Var5 = u9Var;
                        if (!u9Var5.l1) {
                            if (!u9Var5.a2) {
                                if (!u9Var5.u0) {
                                    Runnable runnable = u9Var5.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    u9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                u9Var5.s0(true);
                                break;
                            }
                        } else {
                            u9Var5.F0(false);
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
        linearLayout.setBackground(org.telegram.ui.ActionBar.m6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.N0(2131747073, null));
        linearLayout.addView(o10.e(context, R.drawable.photo_zoomout), c8.ma.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, c8.ma.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.o(8));
        frameLayout.addView(linearLayout, c8.ma.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.Y0 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.m6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(hd.N0(2131747085, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        final int i16 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: hi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        u9 u9Var2 = u9Var;
                        e5 e5Var2 = u9Var2.y0;
                        if (e5Var2 != null && (e5Var2.getCurrentBrush() instanceof sg.g)) {
                            e5Var2.b();
                            u9Var2.U0.setSelectedIndex(1);
                            u9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            u9Var2.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        u9 u9Var3 = u9Var;
                        e5 e5Var3 = u9Var3.y0;
                        sg.k1 k1Var2 = u9Var3.n0;
                        if (k1Var2.a()) {
                            if (e5Var3 != null && (e5Var3.getCurrentBrush() instanceof sg.g)) {
                                e5Var3.b();
                                u9Var3.U0.setSelectedIndex(1);
                                u9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (e5Var3 != null) {
                                e5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            u9Var3.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        u9 u9Var4 = u9Var;
                        tg.j jVar = u9Var4.t0;
                        if (jVar instanceof tg.n2) {
                            org.telegram.messenger.g0.v1(((tg.n2) jVar).getFocusedView());
                        }
                        if (u9Var4.a2) {
                            u9Var4.s0(false);
                        }
                        u9Var4.z0(u9Var4.t0);
                        u9Var4.A0(null, true);
                        break;
                    case 3:
                        u9Var.A0(null, true);
                        break;
                    default:
                        u9 u9Var5 = u9Var;
                        if (!u9Var5.l1) {
                            if (!u9Var5.a2) {
                                if (!u9Var5.u0) {
                                    Runnable runnable = u9Var5.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    u9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                u9Var5.s0(true);
                                break;
                            }
                        } else {
                            u9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView2, c8.ma.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.Z0 = m10;
        m10.setBackground(org.telegram.ui.ActionBar.m6.h0(822083583, 7, -1));
        m10.setText(hd.N0(2131752089, null));
        m10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m10.setGravity(16);
        m10.setTextColor(-1);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setTextSize(1, 16.0f);
        final int i17 = 2;
        m10.setOnClickListener(new View.OnClickListener() { // from class: hi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        u9 u9Var2 = u9Var;
                        e5 e5Var2 = u9Var2.y0;
                        if (e5Var2 != null && (e5Var2.getCurrentBrush() instanceof sg.g)) {
                            e5Var2.b();
                            u9Var2.U0.setSelectedIndex(1);
                            u9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            u9Var2.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        u9 u9Var3 = u9Var;
                        e5 e5Var3 = u9Var3.y0;
                        sg.k1 k1Var2 = u9Var3.n0;
                        if (k1Var2.a()) {
                            if (e5Var3 != null && (e5Var3.getCurrentBrush() instanceof sg.g)) {
                                e5Var3.b();
                                u9Var3.U0.setSelectedIndex(1);
                                u9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (e5Var3 != null) {
                                e5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            u9Var3.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        u9 u9Var4 = u9Var;
                        tg.j jVar = u9Var4.t0;
                        if (jVar instanceof tg.n2) {
                            org.telegram.messenger.g0.v1(((tg.n2) jVar).getFocusedView());
                        }
                        if (u9Var4.a2) {
                            u9Var4.s0(false);
                        }
                        u9Var4.z0(u9Var4.t0);
                        u9Var4.A0(null, true);
                        break;
                    case 3:
                        u9Var.A0(null, true);
                        break;
                    default:
                        u9 u9Var5 = u9Var;
                        if (!u9Var5.l1) {
                            if (!u9Var5.a2) {
                                if (!u9Var5.u0) {
                                    Runnable runnable = u9Var5.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    u9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                u9Var5.s0(true);
                                break;
                            }
                        } else {
                            u9Var5.F0(false);
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
        m11.setBackground(org.telegram.ui.ActionBar.m6.h0(822083583, 7, -1));
        m11.setText(hd.N0(2131751342, null));
        m11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m11.setGravity(16);
        m11.setTextColor(-1);
        m11.setTypeface(org.telegram.messenger.g0.o());
        m11.setTextSize(1, 16.0f);
        final int i18 = 3;
        m11.setOnClickListener(new View.OnClickListener() { // from class: hi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        u9 u9Var2 = u9Var;
                        e5 e5Var2 = u9Var2.y0;
                        if (e5Var2 != null && (e5Var2.getCurrentBrush() instanceof sg.g)) {
                            e5Var2.b();
                            u9Var2.U0.setSelectedIndex(1);
                            u9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            u9Var2.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        u9 u9Var3 = u9Var;
                        e5 e5Var3 = u9Var3.y0;
                        sg.k1 k1Var2 = u9Var3.n0;
                        if (k1Var2.a()) {
                            if (e5Var3 != null && (e5Var3.getCurrentBrush() instanceof sg.g)) {
                                e5Var3.b();
                                u9Var3.U0.setSelectedIndex(1);
                                u9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (e5Var3 != null) {
                                e5Var3.a();
                            }
                            k1Var2.c.clear();
                            k1Var2.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            u9Var3.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        u9 u9Var4 = u9Var;
                        tg.j jVar = u9Var4.t0;
                        if (jVar instanceof tg.n2) {
                            org.telegram.messenger.g0.v1(((tg.n2) jVar).getFocusedView());
                        }
                        if (u9Var4.a2) {
                            u9Var4.s0(false);
                        }
                        u9Var4.z0(u9Var4.t0);
                        u9Var4.A0(null, true);
                        break;
                    case 3:
                        u9Var.A0(null, true);
                        break;
                    default:
                        u9 u9Var5 = u9Var;
                        if (!u9Var5.l1) {
                            if (!u9Var5.a2) {
                                if (!u9Var5.u0) {
                                    Runnable runnable = u9Var5.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    u9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                u9Var5.s0(true);
                                break;
                            }
                        } else {
                            u9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        m11.setAlpha(0.0f);
        m11.setVisibility(8);
        frameLayout.addView(m11, c8.ma.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        g5 g5Var = new g5(u9Var, context, e10);
        this.D0 = g5Var;
        g5Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        g5Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(g5Var, c8.ma.e(-1, ls.p1, 80));
        tg.i1 i1Var = new tg.i1(context, (c7Var == null || c7Var.v() || c7Var.u || caVar == null) ? false : true);
        this.U0 = i1Var;
        i1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        i1Var.setDelegate(this);
        i1Var.setSelectedIndex(1);
        g5Var.addView(i1Var, c8.ma.c(48.0f, -1));
        tg.f1 f1Var = new tg.f1(context);
        this.V0 = f1Var;
        f1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f1Var.setVisibility(8);
        f1Var.setDelegate(this);
        final int i19 = 1;
        post(new Runnable() { // from class: hi.d4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        u9 u9Var2 = u9Var;
                        sg.h1 h1Var3 = u9Var2.k1;
                        u9Var2.C0(h1Var3);
                        sg.k0.e(i7).j(h1Var3.c);
                        break;
                    default:
                        u9Var.V0.setTypeface(sg.k0.e(i7).j);
                        break;
                }
            }
        });
        f1Var.setAlignment(sg.k0.e(i7).g);
        g5Var.addView(f1Var, c8.ma.c(48.0f, -1));
        r4 r4Var = new r4(u9Var, context, 0);
        this.E0 = r4Var;
        addView(r4Var, c8.ma.c(-1.0f, -1));
        tg.k1 k1Var2 = new tg.k1(context);
        this.W0 = k1Var2;
        k1Var2.setVisibility(8);
        k1Var2.setOnItemClickListener(new bi.k8(u9Var, 11));
        f1Var.setTypefaceListView(k1Var2);
        r4Var.addView(k1Var2, c8.ma.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, c5Var));
        s4 s4Var = new s4(u9Var, context);
        this.g1 = s4Var;
        s4Var.setVisibility(8);
        s4Var.setColorPalette(sg.k0.e(i7));
        s4Var.setColorListener(new bi.r8(u9Var, 2));
        g5Var.addView(s4Var, c8.ma.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        tg.w0 w0Var = new tg.w0(context);
        this.k0 = w0Var;
        w0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        w0Var.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, -1));
        g5Var.addView(w0Var, c8.ma.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        final int i20 = 4;
        w0Var.setOnClickListener(new View.OnClickListener() { // from class: hi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i20) {
                    case 0:
                        u9 u9Var2 = u9Var;
                        e5 e5Var2 = u9Var2.y0;
                        if (e5Var2 != null && (e5Var2.getCurrentBrush() instanceof sg.g)) {
                            e5Var2.b();
                            u9Var2.U0.setSelectedIndex(1);
                            u9Var2.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            u9Var2.n0.c();
                            break;
                        }
                        break;
                    case 1:
                        u9 u9Var3 = u9Var;
                        e5 e5Var3 = u9Var3.y0;
                        sg.k1 k1Var22 = u9Var3.n0;
                        if (k1Var22.a()) {
                            if (e5Var3 != null && (e5Var3.getCurrentBrush() instanceof sg.g)) {
                                e5Var3.b();
                                u9Var3.U0.setSelectedIndex(1);
                                u9Var3.w((sg.h) sg.h.a.get(0));
                            }
                            if (e5Var3 != null) {
                                e5Var3.a();
                            }
                            k1Var22.c.clear();
                            k1Var22.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var22, 14));
                            u9Var3.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        u9 u9Var4 = u9Var;
                        tg.j jVar = u9Var4.t0;
                        if (jVar instanceof tg.n2) {
                            org.telegram.messenger.g0.v1(((tg.n2) jVar).getFocusedView());
                        }
                        if (u9Var4.a2) {
                            u9Var4.s0(false);
                        }
                        u9Var4.z0(u9Var4.t0);
                        u9Var4.A0(null, true);
                        break;
                    case 3:
                        u9Var.A0(null, true);
                        break;
                    default:
                        u9 u9Var5 = u9Var;
                        if (!u9Var5.l1) {
                            if (!u9Var5.a2) {
                                if (!u9Var5.u0) {
                                    Runnable runnable = u9Var5.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    u9Var5.A0(null, true);
                                    break;
                                }
                            } else {
                                u9Var5.s0(true);
                                break;
                            }
                        } else {
                            u9Var5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        tg.a1 a1Var = new tg.a1(context);
        this.l0 = a1Var;
        a1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        a1Var.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, -1));
        a1Var.setOnClickListener(new ah.h(u9Var, context, e10, 15));
        g5Var.addView(a1Var, c8.ma.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        tg.n1 n1Var = new tg.n1(context);
        this.N0 = n1Var;
        sg.h1 h1Var3 = h1Var;
        n1Var.setColorSwatch(h1Var3);
        n1Var.setRenderView(e5Var);
        n1Var.setValueOverride(w4Var);
        h1Var3.c = w4Var.get();
        final int i21 = 0;
        n1Var.setOnUpdate(new Runnable() { // from class: hi.d4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        u9 u9Var2 = u9Var;
                        sg.h1 h1Var32 = u9Var2.k1;
                        u9Var2.C0(h1Var32);
                        sg.k0.e(i7).j(h1Var32.c);
                        break;
                    default:
                        u9Var.V0.setTypeface(sg.k0.e(i7).j);
                        break;
                }
            }
        });
        addView(n1Var, c8.ma.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.F0 = frameLayout2;
        addView(frameLayout2, c8.ma.c(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        B0(h1Var3, null, false);
        w((sg.h) sg.h.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.q;
            i13 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        } else {
            i13 = 1;
        }
        this.y1 = new t4(u9Var, raVar, new ai.y1(16, u9Var, raVar));
        i2.C1 = i13;
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

    private yt0 getPaintingSize() {
        yt0 yt0Var = this.r0;
        if (yt0Var != null) {
            return yt0Var;
        }
        yt0 yt0Var2 = new yt0(1080.0f, 1920.0f);
        this.r0 = yt0Var2;
        return yt0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i7 = 0;
        while (true) {
            f5 f5Var = this.B0;
            if (i7 >= f5Var.getChildCount()) {
                return;
            }
            View childAt = f5Var.getChildAt(i7);
            if (childAt instanceof tg.g2) {
                ImageReceiver imageReceiver = ((tg.g2) childAt).y0;
                oh0 B = imageReceiver.B();
                org.telegram.ui.Components.c6 m10 = imageReceiver.m();
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
        duration.addUpdateListener(new f4(this, i10, i7, 0));
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
        x4 x4Var = new x4(this, context);
        this.G0 = x4Var;
        final int i7 = 0;
        x4Var.setClipToPadding(false);
        this.G0.setOrientation(0);
        this.D0.addView(this.G0, c8.ma.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.R0 = textView;
        textView.setText(hd.N0(2131747083, null).toUpperCase());
        TextView textView2 = this.R0;
        int i10 = org.telegram.ui.ActionBar.m6.i6;
        c5 c5Var = this.q1;
        org.telegram.ui.ActionBar.t6.Q(textView2, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i10, c5Var), 7, -1), null, org.telegram.ui.ActionBar.t6.M(i10), c5Var);
        this.R0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.R0.setTextColor(-1);
        final int i11 = 1;
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(org.telegram.messenger.g0.o());
        this.R0.setSingleLine();
        this.R0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.y3
            public final /* synthetic */ k5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        k5 k5Var = this.b;
                        if (!k5Var.u0) {
                            k5Var.O0(0);
                            break;
                        } else {
                            k5Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        k5 k5Var2 = this.b;
                        k5Var2.O0(2);
                        if (!(k5Var2.t0 instanceof tg.n2)) {
                            k5Var2.V1 = true;
                            k5Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.G0.addView(this.R0, c8.ma.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.S0 = textView3;
        textView3.setText(hd.N0(2131747082, null).toUpperCase());
        org.telegram.ui.ActionBar.t6.Q(this.S0, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i10, c5Var), 7, -1), null, org.telegram.ui.ActionBar.t6.M(i10), c5Var);
        this.S0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.y3
            public final /* synthetic */ k5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        k5 k5Var = this.b;
                        if (!k5Var.u0) {
                            k5Var.O0(0);
                            break;
                        } else {
                            k5Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        k5 k5Var2 = this.b;
                        k5Var2.O0(2);
                        if (!(k5Var2.t0 instanceof tg.n2)) {
                            k5Var2.V1 = true;
                            k5Var2.l0(true);
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
        textView4.setText(hd.N0(2131747081, null).toUpperCase());
        org.telegram.ui.ActionBar.t6.Q(this.T0, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i10, c5Var), 7, -1), null, org.telegram.ui.ActionBar.t6.M(i10), c5Var);
        this.T0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.T0.setTextColor(-1);
        this.T0.setTextSize(1, 14.0f);
        this.T0.setGravity(1);
        this.T0.setTypeface(org.telegram.messenger.g0.o());
        this.T0.setAlpha(0.6f);
        this.T0.setSingleLine();
        final int i12 = 2;
        this.T0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.y3
            public final /* synthetic */ k5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        k5 k5Var = this.b;
                        if (!k5Var.u0) {
                            k5Var.O0(0);
                            break;
                        } else {
                            k5Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        k5 k5Var2 = this.b;
                        k5Var2.O0(2);
                        if (!(k5Var2.t0 instanceof tg.n2)) {
                            k5Var2.V1 = true;
                            k5Var2.l0(true);
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

    @Override // tg.h1
    public final void A() {
        K0(new h4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final boolean A0(tg.j jVar, boolean z10) {
        boolean z11;
        cb cbVar;
        cb cbVar2;
        xi0 xi0Var;
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
            tg.f1 f1Var = this.V0;
            f1Var.setAlignment(i10);
            sg.a0 typeface = n2Var.getTypeface();
            if (typeface != null) {
                f1Var.setTypeface(typeface.a);
            }
            f1Var.e(n2Var.getType(), true);
            this.E0.invalidate();
        }
        tg.j jVar2 = this.t0;
        if (jVar2 == null) {
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!jVar.e0) {
                    if (jVar instanceof tg.o0) {
                        tg.o0 o0Var = (tg.o0) jVar;
                        o0Var.setType((o0Var.getType() + 1) % o0Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof tg.o2) {
                        tg.o2 o2Var = (tg.o2) jVar;
                        o2Var.setType((o2Var.getType() + 1) % o2Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof tg.l0) {
                        tg.l0 l0Var = (tg.l0) jVar;
                        tg.j0 j0Var = l0Var.r0;
                        if (j0Var.e()) {
                            j0Var.setPreviewType(j0Var.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        l0Var.setType(l0Var.getNextType());
                        return true;
                    }
                    if (!this.u0) {
                        if (jVar instanceof tg.n2) {
                            this.w0 = true;
                            o0();
                            return true;
                        }
                        if (!(jVar instanceof tg.s1)) {
                            J0(jVar2);
                            return true;
                        }
                        tg.s1 s1Var = (tg.s1) jVar;
                        if (this.M1 && this.K1 == jVar) {
                            s1Var.q(true);
                            return true;
                        }
                        tg.s1 s1Var2 = this.K1;
                        if (s1Var2 != null && s1Var2 != s1Var && (xi0Var = this.J1) != null) {
                            xi0Var.animate().alpha(0.0f).setListener(new ai.k0(xi0Var, 22));
                            this.J1 = null;
                            this.M1 = false;
                            this.L1 = 0.0f;
                        }
                        if (this.J1 == null) {
                            xi0 xi0Var2 = new xi0(2, this.p1, getContext(), LaunchActivity.Q(), new fi.g2(6, new fi.b()));
                            this.J1 = xi0Var2;
                            org.telegram.ui.Components.ga gaVar = new org.telegram.ui.Components.ga(this.O1, xi0Var2, 0, false);
                            this.J1.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                            this.w1.addView(this.J1, c8.ma.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.a.o(-16777216, 120));
                            this.J1.setDelegate(new a8.r7(this, gaVar, paint));
                            this.J1.p(null, null, true);
                        }
                        this.J1.setFragment(LaunchActivity.Q());
                        this.K1 = s1Var;
                        L0(true);
                        return true;
                    }
                    if (jVar2 instanceof tg.n2) {
                        org.telegram.messenger.g0.I3(((tg.n2) jVar2).getFocusedView());
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
            } else if ((jVar3 instanceof tg.t1) && (cbVar2 = ((u9) this).k2.a1) != null) {
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
        if (jVar4 != jVar5 && (jVar5 instanceof tg.t1) && (cbVar = ((u9) this).k2.a1) != null) {
            cbVar.l(true);
        }
        tg.j jVar6 = this.t0;
        w4 w4Var = this.O0;
        sg.h1 h1Var = this.k1;
        tg.n1 n1Var = this.N0;
        if (jVar6 != null) {
            r4 r4Var = this.A0;
            jVar6.n0 = r4Var;
            jVar6.l(r4Var, true);
            tg.j jVar7 = this.t0;
            if (jVar7 instanceof tg.n2) {
                tg.n2 n2Var3 = (tg.n2) jVar7;
                n2Var3.getSwatch().c = h1Var.c;
                n2Var3.A0 = false;
                C0(n2Var3.getSwatch());
                n1Var.setValueOverride(new u4(n2Var3, (int) (this.r0.a / 9.0f), 0));
                n1Var.setShowPreview(false);
            } else {
                n1Var.setValueOverride(w4Var);
                n1Var.setShowPreview(true);
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
            n1Var.setValueOverride(w4Var);
            n1Var.setShowPreview(true);
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
        e5 e5Var = this.y0;
        e5Var.setColor(i10);
        e5Var.setBrushSize(h1Var.c);
        int i11 = h1Var2.a;
        int i12 = 0;
        if (num == null || num.intValue() == i11) {
            g5 g5Var = this.D0;
            if (g5Var != null) {
                g5Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new z3(this, num, i11, i12));
            duration.start();
        }
        tg.j jVar = this.t0;
        if (jVar instanceof tg.n2) {
            ((tg.n2) jVar).setSwatch(new sg.h1(h1Var.b, h1Var.c, h1Var.a));
            return;
        }
        if (z10 && (jVar instanceof tg.o0)) {
            ((tg.o0) jVar).setColor(h1Var.a);
            ((tg.o0) this.t0).setType(3);
        } else if (z10 && (jVar instanceof tg.o2)) {
            ((tg.o2) jVar).setColor(h1Var.a);
            ((tg.o2) this.t0).setType(3);
        } else if (z10 && (jVar instanceof tg.l0)) {
            ((tg.l0) jVar).setColor(h1Var.a);
            ((tg.l0) this.t0).setType(0);
        }
    }

    public final void C0(sg.h1 h1Var) {
        B0(h1Var, null, false);
    }

    @Override // tg.d1
    public final void D() {
        M0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, android.view.ViewGroup, hi.f5] */
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
        c7 c7Var = this.z1;
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
            d20 d20Var = (d20) arrayList.get(i10);
            byte b10 = d20Var.a;
            if (b10 == 0) {
                b5 k02 = k0(d20Var.C, d20Var.B);
                if ((2 & d20Var.b) != 0) {
                    k02.r(z10);
                }
                ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                layoutParams.width = d20Var.q;
                layoutParams.height = d20Var.r;
                i7 = size;
                jVar2 = k02;
            } else if (b10 == 1) {
                tg.n2 l02 = l0(z10);
                l02.setType(d20Var.b);
                l02.setTypeface(d20Var.n);
                l02.setBaseFontSize(d20Var.m);
                SpannableString spannableString = new SpannableString(d20Var.j);
                ?? r42 = d20Var.k;
                int size2 = r42.size();
                for (?? r62 = z10; r62 < size2; r62++) {
                    c20 c20Var = (c20) r42.get(r62);
                    org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(c20Var.document_id, 1.0f, l02.getFontMetricsInt());
                    int i11 = c20Var.offset;
                    spannableString.setSpan(y5Var, i11, c20Var.length + i11, 33);
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
                D0(l02, d20Var.p);
                sg.h1 swatch = l02.getSwatch();
                swatch.a = d20Var.l;
                l02.setSwatch(swatch);
                jVar2 = l02;
            } else {
                i7 = size;
                if (b10 == 2) {
                    tg.p1 h02 = h0(d20Var.j, false);
                    h02.H0 = d20Var.u;
                    h02.C0 = false;
                    if ((2 & d20Var.b) != 0) {
                        h02.r(false);
                    }
                    if ((d20Var.b & 16) != 0) {
                        h02.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                    layoutParams2.width = d20Var.q;
                    layoutParams2.height = d20Var.r;
                    jVar2 = h02;
                } else {
                    if (b10 == 6) {
                        ArrayList arrayList2 = c7Var.v;
                        boolean z11 = c7Var.K;
                        this.V1 = true;
                        f10 = 1.0f;
                        tg.j a5Var = new a5(this, getContext(), c0(), arrayList2, this.O1, z11, this.P1);
                        a5Var.setDelegate(this);
                        r14.addView(a5Var);
                        d0();
                        jVar = a5Var;
                        if (d20Var.q > 0) {
                            jVar = a5Var;
                            if (d20Var.r > 0) {
                                ViewGroup.LayoutParams layoutParams3 = a5Var.getLayoutParams();
                                layoutParams3.width = d20Var.q;
                                layoutParams3.height = d20Var.r;
                                jVar = a5Var;
                            }
                        }
                    } else {
                        f10 = 1.0f;
                        if (b10 == 3) {
                            tg.o0 g02 = g0(d20Var.N, d20Var.M);
                            int i12 = d20Var.l;
                            if (i12 != 0) {
                                g02.setColor(i12);
                            }
                            g02.setType(d20Var.b);
                            jVar = g02;
                        } else if (b10 == 8) {
                            pb pbVar = d20Var.O;
                            if (pbVar == null) {
                                i10++;
                                size = i7;
                                z10 = false;
                            } else {
                                tg.o2 m0 = m0(pbVar);
                                int i13 = d20Var.l;
                                if (i13 != 0) {
                                    m0.setColor(i13);
                                }
                                m0.setType(d20Var.b);
                                jVar = m0;
                            }
                        } else if (b10 == 7) {
                            tg.l0 f02 = f0(d20Var.W);
                            tg.j0 j0Var = f02.r0;
                            int i14 = d20Var.l;
                            if (i14 != 0) {
                                f02.setColor(i14);
                            }
                            boolean e10 = j0Var.e();
                            int i15 = j0Var.h;
                            int i16 = j0Var.f;
                            if (e10) {
                                j0Var.setPreviewType(d20Var.b);
                            }
                            byte b11 = d20Var.b;
                            if (b11 == -1) {
                                f02.setType(3);
                                j0Var.d();
                                d20Var.q = ((int) Math.ceil(j0Var.b0)) + i16 + i16;
                                d20Var.r = ((int) Math.ceil(j0Var.c0)) + i15 + i15;
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
                            tg.s1 i02 = i0(false);
                            i02.s(ch.p0.d(d20Var.M.reaction), false);
                            if (d20Var.M.flipped) {
                                i02.r(false);
                            }
                            jVar = i02;
                            if (d20Var.M.dark) {
                                i02.q(false);
                                jVar = i02;
                            }
                        } else {
                            if (b10 == 5 && c7Var.o0 != null) {
                                tg.t1 j02 = j0(c7Var.p0, false);
                                sa saVar = ((u9) this).k2;
                                ga gaVar = saVar.Y0;
                                if (gaVar != null) {
                                    gaVar.x = j02;
                                    i61 i61Var = gaVar.y;
                                    if (i61Var != null) {
                                        i61Var.A0(j02.v0);
                                    }
                                }
                                ia iaVar = saVar.d1;
                                if (iaVar != null) {
                                    iaVar.setHasRoundVideo(true);
                                }
                                jVar = j02;
                                if ((d20Var.b & 2) != 0) {
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
                    jVar.setX((d20Var.c * this.B1) - (((f10 - d20Var.v) * d20Var.q) / 2.0f));
                    jVar.setY((d20Var.d * this.C1) - (((f10 - d20Var.v) * d20Var.r) / 2.0f));
                    jVar.setPosition(new PointF((d20Var.q / 2.0f) + jVar.getX(), (d20Var.r / 2.0f) + jVar.getY()));
                    jVar.setScale(d20Var.v);
                    jVar.setRotation((float) (((-d20Var.e) / 3.141592653589793d) * 180.0d));
                    i10++;
                    size = i7;
                    z10 = false;
                }
            }
            f10 = 1.0f;
            jVar = jVar2;
            jVar.setX((d20Var.c * this.B1) - (((f10 - d20Var.v) * d20Var.q) / 2.0f));
            jVar.setY((d20Var.d * this.C1) - (((f10 - d20Var.v) * d20Var.r) / 2.0f));
            jVar.setPosition(new PointF((d20Var.q / 2.0f) + jVar.getX(), (d20Var.r / 2.0f) + jVar.getY()));
            jVar.setScale(d20Var.v);
            jVar.setRotation((float) (((-d20Var.e) / 3.141592653589793d) * 180.0d));
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
            this.m1.b(new r1.d() { // from class: hi.a4
                @Override // r1.d
                public final void a(r1.g gVar3, float f10, float f11) {
                    k5 k5Var = k5.this;
                    g5 g5Var = k5Var.D0;
                    float f12 = f10 / 1000.0f;
                    k5Var.n1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(k5Var.n1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(k5Var.n1, 0.25f) / 0.25f));
                    s4 s4Var = k5Var.g1;
                    float f14 = k5Var.n1;
                    boolean z11 = z10;
                    s4Var.B1(z11, f14);
                    tg.a1 a1Var = k5Var.l0;
                    a1Var.setProgress(k5Var.n1);
                    tg.w0 w0Var = k5Var.k0;
                    w0Var.setProgress(k5Var.n1);
                    k5Var.G0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * k5Var.n1);
                    AnimatorSet animatorSet = k5Var.x1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f15 = k5Var.n1;
                        if (!z11) {
                            f15 = 1.0f - f15;
                        }
                        float f16 = z11 ? 1.0f : 0.0f;
                        float f17 = alpha;
                        a1Var.setAlpha(org.telegram.messenger.g0.T1(f17, f16, f15));
                        w0Var.setAlpha(org.telegram.messenger.g0.T1(f17, z11 ? 1.0f : 0.0f, f15));
                        g5Var.setTranslationY(translationY - ((org.telegram.messenger.g0.L(39.0f) * f15) * (z11 ? 1 : -1)));
                    }
                    g5Var.invalidate();
                    if (view == k5Var.V0) {
                        k5Var.E0.invalidate();
                    }
                }
            });
            this.m1.a(new b4(this, z10, i7));
            this.m1.h();
            if (z10) {
                s4 s4Var = this.g1;
                s4Var.setVisibility(0);
                s4Var.setSelectedColorIndex(sg.k0.e(this.p1).d());
            }
        }
    }

    public final void G0(int i7) {
        tg.f1 f1Var = this.V0;
        t4 t4Var = this.y1;
        int i10 = 1;
        if (i7 == 1) {
            ty tyVar = this.Z1;
            boolean z10 = tyVar != null && tyVar.getVisibility() == 0;
            ty tyVar2 = this.Z1;
            ra raVar = this.w1;
            if (tyVar2 != null && tyVar2.d1 != k10.t0) {
                raVar.removeView(tyVar2);
                this.Z1 = null;
            }
            if (this.Z1 == null) {
                ty tyVar3 = new ty(null, true, false, false, getContext(), false, null, null, true, this.q1, false, false);
                this.Z1 = tyVar3;
                tyVar3.y2 = false;
                tyVar3.V0 = true;
                tyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.Z1.setForseMultiwindowLayout(true);
                }
                this.Z1.setDelegate(new d5(this));
                raVar.addView(this.Z1);
            }
            this.Z1.setVisibility(0);
            this.a2 = true;
            ty tyVar4 = this.Z1;
            if (this.f2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f2 = np.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.g2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.g2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.g2 = np.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.q;
            int paddingUnderContainer = raVar.getPaddingUnderContainer() + (point.x > point.y ? this.g2 : this.f2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            tyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                tg.j jVar = this.t0;
                if (jVar instanceof tg.n2) {
                    org.telegram.messenger.g0.v1(((tg.n2) jVar).getEditText());
                }
            }
            this.d2 = paddingUnderContainer;
            t4Var.a();
            requestLayout();
            ah emojiButton = f1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            if (!z10) {
                if (this.b2) {
                    this.e2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d2, 0.0f);
                    ofFloat.addUpdateListener(new c4(this, i10));
                    ofFloat.addListener(new v4(this, i10));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                    ofFloat.start();
                }
            }
        } else {
            ah emojiButton2 = f1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(yg.e, true);
            }
            ty tyVar5 = this.Z1;
            if (tyVar5 != null) {
                this.a2 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    tyVar5.setVisibility(8);
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

    public final void H0(tg.l0 l0Var) {
        k7 k7Var = new k7(getContext(), this.q1, this.Q1, new ai.y1(18, this, l0Var));
        if (l0Var != null) {
            tg.i0 i0Var = l0Var.v0;
            k7Var.Y1 = true;
            org.telegram.ui.Cells.l3 l3Var = k7Var.V1;
            org.telegram.ui.Cells.l3 l3Var2 = k7Var.U1;
            if (i0Var != null) {
                k7Var.c2 = i0Var.d;
                k7Var.d2 = false;
                l3Var2.setText(i0Var.c);
                l3Var.setText(i0Var.b);
                k7Var.i2 = !TextUtils.isEmpty(i0Var.b);
                k7Var.j2 = i0Var.f;
                k7Var.k2 = i0Var.e;
            } else {
                l3Var2.setText("");
                l3Var.setText("");
                k7Var.j2 = true;
                k7Var.k2 = false;
            }
            String N0 = hd.N0(2131744398, null);
            e eVar = k7Var.X1;
            eVar.i(N0, false, true);
            di.f0 f0Var = k7Var.T1;
            if (f0Var != null) {
                f0Var.O(false);
            }
            eVar.setEnabled(k7Var.g1(l3Var2.getText().toString()));
            k7Var.Y1 = false;
        }
        k7Var.setOnDismissListener(new m4(this, 1));
        k7Var.show();
        w0(true);
    }

    public final void I0(tg.o0 o0Var, r10 r10Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ui uiVar = new ui(getContext(), new z4(this, r10Var), false, true, false, this.q1);
        uiVar.X3 = new w7.s(10);
        uh uhVar = uiVar.v3;
        if (o0Var != null && (messageMedia = o0Var.v0) != null && (geoPoint = messageMedia.geo) != null) {
            uiVar.y4 = new double[]{geoPoint.lat, geoPoint._long};
            uiVar.J1 = true;
            uhVar.setVisibility(8);
        } else if (this.E1) {
            uiVar.w4 = this.G1;
            uiVar.x4 = this.F1;
            uiVar.J1 = true;
            uhVar.setVisibility(8);
        } else {
            uiVar.J1 = true;
            uhVar.setVisibility(8);
        }
        uiVar.setOnDismissListener(new m4(this, 0));
        uiVar.f1();
        uiVar.show();
    }

    public final void J0(tg.j jVar) {
        if (jVar instanceof tg.v0) {
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
        f5 f5Var = this.B0;
        float scaleX2 = f5Var.getScaleX() * scaleX;
        float scaleY = f5Var.getScaleY() * jVar.getScaleY() * jVar.getHeight();
        int i7 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i7;
        int i10 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i10;
        K0(new g4(this, jVar, 1), this, 51, i7, i10 - org.telegram.messenger.g0.L(32.0f), true);
    }

    public final void K0(Runnable runnable, k5 k5Var, int i7, int i10, int i11, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = this.r1;
        if (g1Var != null && g1Var.isShowing()) {
            this.r1.d(true);
            return;
        }
        int i12 = 0;
        if (this.s1 == null) {
            this.t1 = new Rect();
            i5 i5Var = new i5(this, getContext());
            this.s1 = i5Var;
            i5Var.setAnimationEnabled(true);
            this.s1.setOnTouchListener(new i4(0, this));
            this.s1.setDispatchKeyEventListener(new j4(this));
            this.s1.setShownFromBottom(true);
        }
        i5 i5Var2 = this.s1;
        i5Var2.a0 = z10;
        i5Var2.d();
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
            this.r1.setOnDismissListener(new k4(i12, this));
        }
        this.s1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), TLObject.FLAG_31));
        this.r1.setFocusable(true);
        int measuredWidth = i10 - (this.s1.getMeasuredWidth() / 2);
        int measuredHeight = i11 - this.s1.getMeasuredHeight();
        this.r1.showAtLocation(k5Var, i7, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.g1.i(this.s1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            i5 i5Var3 = this.s1;
            i5Var3.setBackgroundDrawable(new org.telegram.ui.Components.fa(new org.telegram.ui.Components.ga(this.O1, i5Var3, 5, false), measuredWidth, measuredHeight, mutate, org.telegram.messenger.g0.N(8.3f)));
        } else {
            this.s1.setBackgroundDrawable(mutate);
            this.s1.setBackgroundColor(-14145495);
        }
    }

    @Override // org.telegram.ui.Components.cu0
    public final void L(int i7, boolean z10) {
        boolean z11;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.b2 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.g2 = i7;
                np.f1().edit().putInt("kbd_height_land3", this.g2).commit();
            } else {
                this.f2 = i7;
                np.f1().edit().putInt("kbd_height", this.f2).commit();
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
        if (jVar instanceof tg.n2) {
            this.b2 = ((tg.n2) jVar).getEditText().isFocused() && t4Var.c();
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
                ofFloat.addUpdateListener(new c4(this, 2));
                ofFloat.addListener(new bi.g7(12, this, z10));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(nr.g);
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
                tg.k1 k1Var = this.W0;
                k1Var.setAlpha(0.0f);
                k1Var.setVisibility(0);
            }
            int i7 = 1;
            this.f1.b(new fi.q7(i7, this));
            this.f1.a(new b4(this, z10, i7));
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
                f5 f5Var = this.B0;
                if (i10 >= f5Var.getChildCount()) {
                    break;
                }
                View childAt = f5Var.getChildAt(i10);
                if (!(childAt instanceof tg.j) || (childAt instanceof tg.v0)) {
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
        duration.setInterpolator(nr.f);
        this.L0.addUpdateListener(new fi.z2(this, viewGroup3, viewGroup4, i12));
        this.L0.addListener(new bi.z0(this, viewGroup3, viewGroup4, i7, 1));
        this.L0.start();
    }

    public final void P0() {
        t4 t4Var = this.y1;
        tg.f1 f1Var = this.V0;
        if (f1Var != null) {
            if (t4Var.c()) {
                f1Var.a(R.drawable.input_smile);
            } else if (this.a2) {
                f1Var.a(R.drawable.input_keyboard);
            } else {
                f1Var.a(R.drawable.msg_add);
            }
        }
        boolean z10 = t4Var.c() || this.a2;
        boolean z11 = !z10;
        org.telegram.messenger.g0.S3(1.0f, this.Y0, z11, false);
        org.telegram.messenger.g0.S3(1.0f, this.X0, z11, false);
        org.telegram.messenger.g0.S3(1.0f, this.a1, z10, false);
        org.telegram.messenger.g0.S3(1.0f, this.Z0, z10, false);
    }

    @Override // org.telegram.ui.Components.eu0, org.telegram.ui.Components.du0
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
        this.S1.setInterpolator(nr.h);
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

    @Override // tg.h1, tg.d1
    public final void a() {
        F0(true);
    }

    @Override // org.telegram.ui.Components.du0, org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Cf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Di));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.a7));
    }

    @Override // tg.d1
    public final void b() {
        setTextType((this.v0 + 1) % 4);
    }

    public final void b0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new c(4, this, view)).start();
    }

    @Override // tg.d1
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
        f5 f5Var = this.B0;
        int measuredWidth = f5Var.getMeasuredWidth();
        int measuredHeight = f5Var.getMeasuredHeight();
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
        f5 f5Var = this.B0;
        boolean z11 = true;
        if (!z10 && !this.I1) {
            int i7 = 0;
            loop0: while (true) {
                if (i7 >= f5Var.getChildCount()) {
                    z11 = false;
                    break;
                }
                View childAt = f5Var.getChildAt(i7);
                boolean z12 = childAt instanceof tg.n2;
                int i10 = this.p1;
                if (z12) {
                    CharSequence text = ((tg.n2) childAt).getText();
                    if (text instanceof Spanned) {
                        for (org.telegram.ui.Components.y5 y5Var : (org.telegram.ui.Components.y5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.y5.class)) {
                            TLRPC.Document document = y5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.p5.e(i10, y5Var.getDocumentId());
                            }
                            if (document != null) {
                                org.telegram.ui.Components.p5.g(i10).e(document);
                            }
                            org.telegram.messenger.w7.G(i10);
                            if (c7.u(document, org.telegram.messenger.w7.J(document, null, true, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i7++;
                } else if (childAt instanceof tg.g2) {
                    TLRPC.Document sticker = ((tg.g2) childAt).getSticker();
                    org.telegram.messenger.w7.G(i10);
                    if (c7.u(sticker, org.telegram.messenger.w7.J(sticker, null, true, true).getAbsolutePath())) {
                        break;
                    } else {
                        i7++;
                    }
                } else if (childAt instanceof tg.t1) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        for (int i11 = 0; i11 < f5Var.getChildCount(); i11++) {
            View childAt2 = f5Var.getChildAt(i11);
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
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.E8, this.q1);
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

    public final tg.l0 f0(tg.i0 i0Var) {
        int i7;
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        f5 f5Var = this.B0;
        float measuredWidth = f5Var.getMeasuredWidth() <= 0 ? this.B1 : f5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.l0 l0Var = new tg.l0(getContext(), N0, this.p1, i0Var, measuredWidth / 360.0f, L);
        if (N0.x == f5Var.getMeasuredWidth() / 2.0f) {
            l0Var.setStickyX(2);
        }
        if (N0.y == f5Var.getMeasuredHeight() / 2.0f) {
            l0Var.setStickyY(2);
        }
        sg.h1 h1Var = this.k1;
        if (h1Var != null && (i7 = h1Var.a) != -47814) {
            l0Var.setColor(i7);
        }
        l0Var.setDelegate(this);
        l0Var.setMaxWidth(L);
        f5Var.addView(l0Var, c8.ma.c(-2.0f, -2));
        d0();
        xe xeVar = this.p0;
        if (xeVar != null) {
            l0Var.j(1.0f / xeVar.c);
            l0Var.f(-(xeVar.k + xeVar.d));
        }
        return l0Var;
    }

    public final tg.o0 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i7;
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        f5 f5Var = this.B0;
        float measuredWidth = f5Var.getMeasuredWidth() <= 0 ? this.B1 : f5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.o0 o0Var = new tg.o0(getContext(), N0, this.p1, messageMedia, mediaArea, measuredWidth / 240.0f, L);
        if (N0.x == f5Var.getMeasuredWidth() / 2.0f) {
            o0Var.setStickyX(2);
        }
        if (N0.y == f5Var.getMeasuredHeight() / 2.0f) {
            o0Var.setStickyY(2);
        }
        sg.h1 h1Var = this.k1;
        if (h1Var != null && (i7 = h1Var.a) != -47814) {
            o0Var.setColor(i7);
        }
        o0Var.setDelegate(this);
        o0Var.setMaxWidth(L);
        f5Var.addView(o0Var, c8.ma.c(-2.0f, -2));
        d0();
        xe xeVar = this.p0;
        if (xeVar != null) {
            o0Var.j(1.0f / xeVar.c);
            o0Var.f(-(xeVar.k + xeVar.d));
        }
        return o0Var;
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
        org.telegram.ui.Components.y5[] y5VarArr;
        f5 f5Var = this.B0;
        int childCount = f5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = f5Var.getChildAt(i7);
            if (childAt instanceof tg.g2) {
                TLRPC.Document sticker = ((tg.g2) childAt).getSticker();
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
                if ((text instanceof Spanned) && (y5VarArr = (org.telegram.ui.Components.y5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.y5.class)) != null) {
                    for (org.telegram.ui.Components.y5 y5Var : y5VarArr) {
                        if (y5Var != null) {
                            TLRPC.Document document = y5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.p5.e(this.p1, y5Var.getDocumentId());
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

    public final tg.p1 h0(String str, boolean z10) {
        float f10;
        yt0 yt0Var;
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
        f5 f5Var = this.B0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.B1, f5Var.getMeasuredWidth()) * 0.5d);
            yt0Var = new yt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.C1, f5Var.getMeasuredHeight()) * 0.5d);
            yt0Var = new yt0(f10 * floor2, floor2);
        }
        yt0 yt0Var2 = yt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = yt0Var2.a;
            yt0Var2.a = yt0Var2.b;
            yt0Var2.b = f11;
        }
        Context context = getContext();
        PointF c02 = c0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        tg.p1 p1Var = new tg.p1(context, c02, yt0Var2, str, intValue);
        p1Var.setDelegate(this);
        f5Var.addView(p1Var);
        d0();
        return p1Var;
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

    public final tg.s1 i0(boolean z10) {
        String str;
        yt0 yt0Var = new yt0(org.telegram.messenger.g0.L(106.0f), org.telegram.messenger.g0.L(106.0f));
        PointF c02 = c0();
        f5 f5Var = this.B0;
        if (f5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i7 = 0; i7 < f5Var.getChildCount(); i7++) {
                    View childAt = f5Var.getChildAt(i7);
                    if (a8.w9.a(c02.x, c02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < org.telegram.messenger.g0.L(6.0f)) {
                        break;
                    }
                }
                c02.x = (f5Var.getMeasuredWidth() * 0.05f) + c02.x;
                c02.y = (f5Var.getMeasuredHeight() * 0.05f) + c02.y;
                c02.x = Utilities.i(c02.x, f5Var.getMeasuredWidth(), 0.0f);
                c02.y = Utilities.i(c02.y, f5Var.getMeasuredHeight(), 0.0f);
            }
        }
        tg.s1 s1Var = new tg.s1(getContext(), c02);
        s1Var.s0 = new fi.l8(s1Var);
        s1Var.t0 = new fi.l8(s1Var);
        s1Var.u0 = new ch.g0(s1Var);
        s1Var.v0 = new ch.g0(s1Var);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(s1Var);
        s1Var.x0 = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6(s1Var);
        s1Var.y0 = d6Var2;
        s1Var.A0 = 1.0f;
        s1Var.r0 = yt0Var;
        d6Var2.e(true, 1.0f);
        d6Var.e(true, 1.0f);
        ArrayList arrayList = si.d0(k10.t0).h;
        ch.g0 g0Var = s1Var.u0;
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
        s1Var.w0 = b10;
        g0Var.e(b10);
        s1Var.k();
        s1Var.setDelegate(this);
        f5Var.addView(s1Var);
        d0();
        if (z10) {
            y0(s1Var);
            A0(s1Var, true);
        }
        return s1Var;
    }

    public final tg.t1 j0(String str, boolean z10) {
        this.V1 = true;
        this.X1 = true;
        n0();
        f5 f5Var = this.B0;
        int measuredWidth = f5Var.getMeasuredWidth();
        f5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        yt0 yt0Var = new yt0(floor, floor);
        tg.t1 t1Var = new tg.t1(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - org.telegram.messenger.g0.L(16.0f), (yt0Var.b / 2.0f) + org.telegram.messenger.g0.L(72.0f)), yt0Var, str);
        t1Var.setDelegate(this);
        f5Var.addView(t1Var);
        d0();
        if (z10) {
            y0(t1Var);
            post(new x3(this, t1Var, 0));
        }
        this.X1 = false;
        return t1Var;
    }

    public final b5 k0(Object obj, TLRPC.Document document) {
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
        j5 j5Var = new j5(c0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        b5 b5Var = new b5(this, context, j5Var.a, j5Var.c, j5Var.b, new yt0(floor, floor), document, obj);
        boolean C4 = gj.C4(document);
        ImageReceiver imageReceiver = b5Var.y0;
        if (C4) {
            imageReceiver.p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.E0(12);
        b5Var.setDelegate(this);
        this.B0.addView(b5Var);
        d0();
        return b5Var;
    }

    public final tg.n2 l0(boolean z10) {
        yt0 paintingSize = getPaintingSize();
        PointF N0 = N0(null);
        tg.n2 n2Var = new tg.n2(getContext(), N0, (int) (paintingSize.a / 9.0f), "", this.k1, this.v0);
        float f10 = paintingSize.a / 9.0f;
        h4 h4Var = new h4(this, 0);
        n2Var.x0 = (int) (0.5f * f10);
        n2Var.y0 = (int) (f10 * 2.0f);
        n2Var.z0 = h4Var;
        float f11 = N0.x;
        f5 f5Var = this.B0;
        if (f11 == f5Var.getMeasuredWidth() / 2.0f) {
            n2Var.setStickyX(2);
        }
        if (N0.y == f5Var.getMeasuredHeight() / 2.0f) {
            n2Var.setStickyY(2);
        }
        n2Var.setDelegate(this);
        n2Var.setMaxWidth(this.B1 - org.telegram.messenger.g0.L(32.0f));
        int i7 = this.p1;
        n2Var.setTypeface(sg.k0.e(i7).j);
        n2Var.setType(sg.k0.e(i7).h);
        f5Var.addView(n2Var, c8.ma.c(-2.0f, -2));
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
            org.telegram.messenger.g0.I3(n2Var.getFocusedView());
            this.u0 = true;
            int i10 = sg.k0.e(i7).g;
            tg.f1 f1Var = this.V0;
            f1Var.d(i10, true);
            f1Var.setOutlineType(sg.k0.e(i7).h);
        }
        return n2Var;
    }

    public final tg.o2 m0(pb pbVar) {
        int i7;
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        f5 f5Var = this.B0;
        float measuredWidth = f5Var.getMeasuredWidth() <= 0 ? this.B1 : f5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.o2 o2Var = new tg.o2(getContext(), N0, this.p1, pbVar, measuredWidth / 240.0f, L);
        if (N0.x == f5Var.getMeasuredWidth() / 2.0f) {
            o2Var.setStickyX(2);
        }
        if (N0.y == f5Var.getMeasuredHeight() / 2.0f) {
            o2Var.setStickyY(2);
        }
        sg.h1 h1Var = this.k1;
        if (h1Var != null && (i7 = h1Var.a) != -47814) {
            o2Var.setColor(i7);
        }
        o2Var.setDelegate(this);
        o2Var.setMaxWidth(L);
        f5Var.addView(o2Var, c8.ma.c(-2.0f, -2));
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
            f5 f5Var = this.B0;
            if (i7 >= f5Var.getChildCount()) {
                return;
            }
            View childAt = f5Var.getChildAt(i7);
            if (childAt instanceof tg.t1) {
                if (this.t0 == childAt) {
                    A0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(nr.h).withEndAction(new x3(this, (tg.t1) childAt, 1)).start();
            }
            i7++;
        }
    }

    public abstract void o0();

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        xi0 xi0Var = this.J1;
        if (xi0Var != null) {
            org.telegram.messenger.g0.E2(xi0Var);
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
        return !(this.t0 instanceof tg.v0);
    }

    public final tg.v0 p0() {
        int i7 = 0;
        while (true) {
            f5 f5Var = this.B0;
            if (i7 >= f5Var.getChildCount()) {
                return null;
            }
            View childAt = f5Var.getChildAt(i7);
            if (childAt instanceof tg.v0) {
                return (tg.v0) childAt;
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
    public final Bitmap q0(ArrayList arrayList, boolean z10, boolean z11, boolean z12, boolean z13, c7 c7Var) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i7;
        int i10;
        f5 f5Var;
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
        tg.v0 v0Var;
        di.n4 n4Var;
        boolean z16;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z17;
        TLRPC.Message message;
        org.telegram.ui.Cells.v0 v0Var2;
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
        k5 k5Var = this;
        e5 e5Var = k5Var.y0;
        int i14 = 0;
        byte b11 = 1;
        f5 f5Var2 = k5Var.B0;
        if (z10) {
            createBitmap = e5Var.c(false, z13);
        } else if (z12) {
            createBitmap = Bitmap.createBitmap(Math.max(1, f5Var2.getMeasuredWidth()), Math.max(1, f5Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z11) {
                bitmap = null;
                k5Var.Q0 = BigInteger.ONE;
                i10 = 0;
                for (i7 = 0; i7 < f5Var2.getChildCount(); i7++) {
                    if (f5Var2.getChildAt(i7) instanceof tg.j) {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    int childCount = f5Var2.getChildCount();
                    int i15 = 0;
                    while (i15 < childCount) {
                        View childAt = f5Var2.getChildAt(i15);
                        if (childAt instanceof tg.j) {
                            tg.j jVar = (tg.j) childAt;
                            jVar.getPosition();
                            d20 d20Var = new d20();
                            if (arrayList != null) {
                                boolean z21 = jVar instanceof tg.n2;
                                int i16 = k5Var.p1;
                                if (z21) {
                                    d20Var.a = b11;
                                    tg.n2 n2Var = (tg.n2) jVar;
                                    CharSequence text = n2Var.getText();
                                    if (text instanceof Spanned) {
                                        Spanned spanned2 = (Spanned) text;
                                        f5Var = f5Var2;
                                        org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spanned2.getSpans(i14, text.length(), org.telegram.ui.Components.y5.class);
                                        if (y5VarArr != null) {
                                            int i17 = i14;
                                            while (i17 < y5VarArr.length) {
                                                org.telegram.ui.Components.y5 y5Var = y5VarArr[i17];
                                                org.telegram.ui.Components.y5[] y5VarArr2 = y5VarArr;
                                                TLRPC.Document document = y5Var.document;
                                                int i18 = i17;
                                                if (document == null) {
                                                    document = org.telegram.ui.Components.p5.e(i16, y5Var.getDocumentId());
                                                }
                                                if (document != null) {
                                                    org.telegram.ui.Components.p5.g(i16).e(document);
                                                }
                                                c20 c20Var = new c20();
                                                int i19 = childCount;
                                                int i20 = i15;
                                                c20Var.document_id = y5Var.getDocumentId();
                                                c20Var.document = document;
                                                c20Var.offset = spanned2.getSpanStart(y5Var);
                                                c20Var.length = spanned2.getSpanEnd(y5Var) - c20Var.offset;
                                                org.telegram.messenger.w7.G(i16);
                                                c20Var.a = org.telegram.messenger.w7.J(document, null, true, true).getAbsolutePath();
                                                int i21 = 0;
                                                while (document != null) {
                                                    ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                    if (arrayList2 == null || arrayList2.isEmpty() || new File(c20Var.a).exists()) {
                                                        break;
                                                    }
                                                    org.telegram.messenger.w7.G(i16);
                                                    spanned = spanned2;
                                                    z20 = true;
                                                    c20Var.a = org.telegram.messenger.w7.J(document.thumbs.get(i21), null, true, true).getAbsolutePath();
                                                    i21++;
                                                    if (i21 >= document.thumbs.size()) {
                                                        break;
                                                    }
                                                    spanned2 = spanned;
                                                }
                                                spanned = spanned2;
                                                z20 = true;
                                                boolean K2 = gj.K2(c20Var.document, z20);
                                                if (K2 || u0(c20Var.document)) {
                                                    c20Var.c = (byte) (c20Var.c | (K2 ? (byte) 1 : (byte) 4));
                                                }
                                                if (gj.C4(c20Var.document)) {
                                                    c20Var.c = (byte) (c20Var.c | 8);
                                                }
                                                d20Var.k.add(c20Var);
                                                if (document != null) {
                                                    BigInteger valueOf = BigInteger.valueOf(5000L);
                                                    k5Var.Q0 = k5Var.Q0.multiply(valueOf).divide(k5Var.Q0.gcd(valueOf));
                                                }
                                                i17 = i18 + 1;
                                                y5VarArr = y5VarArr2;
                                                childCount = i19;
                                                i15 = i20;
                                                spanned2 = spanned;
                                            }
                                        }
                                    } else {
                                        f5Var = f5Var2;
                                    }
                                    i11 = childCount;
                                    i12 = i15;
                                    d20Var.j = text.toString();
                                    d20Var.b = (byte) n2Var.getType();
                                    d20Var.l = n2Var.getSwatch().a;
                                    d20Var.m = n2Var.getTextSize();
                                    d20Var.n = n2Var.getTypeface();
                                    d20Var.p = n2Var.getAlign();
                                } else {
                                    f5Var = f5Var2;
                                    i11 = childCount;
                                    i12 = i15;
                                    if (jVar instanceof tg.g2) {
                                        d20Var.a = (byte) 0;
                                        tg.g2 g2Var = (tg.g2) jVar;
                                        yt0 baseSize = g2Var.getBaseSize();
                                        d20Var.f = baseSize.a;
                                        d20Var.g = baseSize.b;
                                        d20Var.B = g2Var.getSticker();
                                        d20Var.C = g2Var.getParentObject();
                                        TLRPC.Document sticker = g2Var.getSticker();
                                        org.telegram.messenger.w7.G(k10.t0);
                                        d20Var.j = org.telegram.messenger.w7.J(sticker, null, true, true).getAbsolutePath();
                                        if (gj.K2(sticker, true) || u0(sticker)) {
                                            boolean K22 = gj.K2(sticker, true);
                                            d20Var.b = (byte) (d20Var.b | (K22 ? (byte) 1 : (byte) 4));
                                            r21 = (K22 || u0(sticker)) ? g2Var.getDuration() : 5000L;
                                            if (r21 != 0) {
                                                BigInteger valueOf2 = BigInteger.valueOf(r21);
                                                k5Var.Q0 = k5Var.Q0.multiply(valueOf2).divide(k5Var.Q0.gcd(valueOf2));
                                            }
                                        }
                                        if (gj.C4(sticker)) {
                                            d20Var.l = -1;
                                            d20Var.b = (byte) (d20Var.b | 8);
                                        }
                                        if (g2Var.u0) {
                                            d20Var.b = (byte) (d20Var.b | 2);
                                        }
                                    } else if (jVar instanceof tg.p1) {
                                        tg.p1 p1Var = (tg.p1) jVar;
                                        d20Var.a = (byte) 2;
                                        yt0 baseSize2 = p1Var.getBaseSize();
                                        d20Var.f = baseSize2.a;
                                        d20Var.g = baseSize2.b;
                                        d20Var.j = p1Var.q(i16);
                                        d20Var.u = p1Var.H0;
                                        if (p1Var.u0) {
                                            d20Var.b = (byte) (d20Var.b | 2);
                                        }
                                    } else if (jVar instanceof tg.o0) {
                                        tg.o0 o0Var = (tg.o0) jVar;
                                        tg.n0 n0Var = o0Var.r0;
                                        d20Var.a = (byte) 3;
                                        d20Var.b = (byte) o0Var.getType();
                                        d20Var.f = n0Var.getWidth();
                                        d20Var.g = n0Var.getHeight();
                                        d20Var.j = n0Var.getText();
                                        d20Var.l = o0Var.s0 ? o0Var.getColor() : 0;
                                        d20Var.P = n0Var.E;
                                        d20Var.N = o0Var.v0;
                                        TL_stories.MediaArea mediaArea2 = o0Var.w0;
                                        d20Var.M = mediaArea2;
                                        mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument = n0Var.getCodeEmojiDocument();
                                        if (codeEmojiDocument != null) {
                                            c20 c20Var2 = new c20();
                                            c20Var2.document_id = codeEmojiDocument.id;
                                            c20Var2.document = codeEmojiDocument;
                                            org.telegram.messenger.w7.G(i16);
                                            c20Var2.a = org.telegram.messenger.w7.J(codeEmojiDocument, null, true, true).getAbsolutePath();
                                            boolean K23 = gj.K2(c20Var2.document, true);
                                            if (K23 || u0(c20Var2.document)) {
                                                c20Var2.c = (byte) (c20Var2.c | (K23 ? (byte) 1 : (byte) 4));
                                            }
                                            d20Var.k.add(c20Var2);
                                        }
                                    } else if (jVar instanceof tg.o2) {
                                        tg.o2 o2Var = (tg.o2) jVar;
                                        tg.n0 n0Var2 = o2Var.r0;
                                        d20Var.a = (byte) 8;
                                        d20Var.b = (byte) o2Var.getType();
                                        d20Var.f = n0Var2.getWidth();
                                        d20Var.g = n0Var2.getHeight();
                                        d20Var.j = n0Var2.getText();
                                        d20Var.l = o2Var.s0 ? o2Var.getColor() : 0;
                                        d20Var.P = n0Var2.E;
                                        d20Var.O = o2Var.v0;
                                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                        tL_mediaAreaWeather.emoji = o2Var.v0.c;
                                        tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                        tL_mediaAreaWeather.color = n0Var2.f.getColor();
                                        d20Var.M = tL_mediaAreaWeather;
                                        tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument2 = n0Var2.getCodeEmojiDocument();
                                        if (codeEmojiDocument2 != null) {
                                            c20 c20Var3 = new c20();
                                            c20Var3.document_id = codeEmojiDocument2.id;
                                            c20Var3.document = codeEmojiDocument2;
                                            org.telegram.messenger.w7.G(i16);
                                            c20Var3.a = org.telegram.messenger.w7.J(codeEmojiDocument2, null, true, true).getAbsolutePath();
                                            boolean K24 = gj.K2(c20Var3.document, true);
                                            if (K24 || u0(c20Var3.document)) {
                                                c20Var3.c = (byte) (c20Var3.c | (K24 ? (byte) 1 : (byte) 4));
                                            }
                                            d20Var.k.add(c20Var3);
                                        }
                                        view = childAt;
                                        z16 = false;
                                        z17 = false;
                                        imageReceiver = null;
                                        arrayList.add(d20Var);
                                        scaleX = view.getScaleX();
                                        float scaleY = view.getScaleY();
                                        float x10 = view.getX();
                                        float y10 = view.getY();
                                        d20Var.q = view.getWidth();
                                        d20Var.r = view.getHeight();
                                        d20Var.f = (view.getWidth() * scaleX) / f5Var.getMeasuredWidth();
                                        d20Var.g = (view.getHeight() * scaleY) / f5Var.getMeasuredHeight();
                                        d20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10) / f5Var.getMeasuredWidth();
                                        d20Var.d = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y10) / f5Var.getMeasuredHeight();
                                        d20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                        d20Var.y = ((view.getWidth() / 2.0f) + x10) / f5Var.getMeasuredWidth();
                                        d20Var.z = ((view.getHeight() / 2.0f) + y10) / f5Var.getMeasuredHeight();
                                        d20Var.w = d20Var.q / f5Var.getMeasuredWidth();
                                        d20Var.x = d20Var.r / f5Var.getMeasuredHeight();
                                        d20Var.v = scaleX;
                                        if (jVar instanceof tg.v0) {
                                            z18 = z16;
                                            if (jVar instanceof tg.g2) {
                                                ImageReceiver imageReceiver5 = ((tg.g2) jVar).y0;
                                                RectF rectF = imageReceiver5.Q0;
                                                if (imageReceiver5.V % ls.K2 != 0) {
                                                    width = rectF.height();
                                                    height = rectF.width();
                                                } else {
                                                    width = rectF.width();
                                                    height = rectF.height();
                                                }
                                                float f10 = width / height;
                                                float f11 = (d20Var.f / 2.0f) + d20Var.c;
                                                float f12 = (d20Var.g / 2.0f) + d20Var.d;
                                                float measuredWidth = f5Var.getMeasuredWidth() / f5Var.getMeasuredHeight();
                                                if (f10 > 1.0f) {
                                                    float f13 = (d20Var.f * measuredWidth) / f10;
                                                    d20Var.g = f13;
                                                    d20Var.r = (int) (d20Var.q / f10);
                                                    d20Var.d = f12 - (f13 / 2.0f);
                                                } else if (f10 < 1.0f) {
                                                    float f14 = (d20Var.g / measuredWidth) * f10;
                                                    d20Var.f = f14;
                                                    d20Var.q = (int) (d20Var.r * f10);
                                                    d20Var.c = f11 - (f14 / 2.0f);
                                                }
                                            } else {
                                                TL_stories.MediaArea mediaArea3 = d20Var.M;
                                                if (mediaArea3 != null && (((z19 = jVar instanceof tg.o0)) || (jVar instanceof tg.o2) || (jVar instanceof tg.l0) || (jVar instanceof tg.s1))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                    float f15 = d20Var.c;
                                                    float f16 = d20Var.f;
                                                    mediaAreaCoordinates2.x = ((f16 / 2.0f) + f15) * 100.0f;
                                                    mediaAreaCoordinates2.y = ((d20Var.g / 2.0f) + d20Var.d) * 100.0f;
                                                    if (z19) {
                                                        tg.n0 n0Var3 = ((tg.o0) jVar).r0;
                                                        mediaAreaCoordinates2.w = o10.y(n0Var3.J * 2 * scaleX, f5Var.getMeasuredWidth(), f16, 100.0f);
                                                        d20Var.M.coordinates.h = o10.y(n0Var3.K * 2 * scaleY, f5Var.getMeasuredHeight(), d20Var.g, 100.0f);
                                                    } else if (jVar instanceof tg.o2) {
                                                        tg.n0 n0Var4 = ((tg.o2) jVar).r0;
                                                        mediaAreaCoordinates2.w = o10.y(n0Var4.J * 2 * scaleX, f5Var.getMeasuredWidth(), f16, 100.0f);
                                                        d20Var.M.coordinates.h = o10.y(n0Var4.K * 2 * scaleY, f5Var.getMeasuredHeight(), d20Var.g, 100.0f);
                                                    } else if (jVar instanceof tg.l0) {
                                                        tg.j0 j0Var = ((tg.l0) jVar).r0;
                                                        mediaAreaCoordinates2.w = o10.y(j0Var.f * 2 * scaleX, f5Var.getMeasuredWidth(), f16, 100.0f);
                                                        d20Var.M.coordinates.h = o10.y(j0Var.h * 2 * scaleY, f5Var.getMeasuredHeight(), d20Var.g, 100.0f);
                                                    } else if (jVar instanceof tg.s1) {
                                                        tg.s1 s1Var = (tg.s1) jVar;
                                                        float padding = ((s1Var.getPadding() * 2) * scaleX) / f5Var.getMeasuredWidth();
                                                        float padding2 = ((s1Var.getPadding() * 2) * scaleX) / f5Var.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = d20Var.M.coordinates;
                                                        mediaAreaCoordinates3.w = (d20Var.f - padding) * 100.0f;
                                                        mediaAreaCoordinates3.h = (d20Var.g - padding2) * 100.0f;
                                                    }
                                                    d20Var.M.coordinates.rotation = ((-d20Var.e) / 3.141592653589793d) * 180.0d;
                                                    if (z19) {
                                                        radius = ((tg.o0) jVar).r0.getRadius();
                                                    } else if (jVar instanceof tg.o2) {
                                                        radius = ((tg.o2) jVar).r0.getRadius();
                                                    } else if (jVar instanceof tg.l0) {
                                                        radius = ((tg.l0) jVar).r0.getRadius();
                                                    }
                                                    d = radius;
                                                }
                                            }
                                            d = -1.0d;
                                        } else {
                                            tg.v0 v0Var3 = (tg.v0) jVar;
                                            tg.q0 q0Var = v0Var3.s0;
                                            di.n4 n4Var2 = v0Var3.r0;
                                            RectF rectF2 = org.telegram.messenger.g0.P;
                                            z18 = z16;
                                            double r10 = v0Var3.r(rectF2);
                                            rectF2.offset(n4Var2.getX(), n4Var2.getY());
                                            rectF2.offset(q0Var.getX(), q0Var.getY());
                                            d20Var.M.coordinates.x = (((rectF2.centerX() * scaleX) + o10.w(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x10)) / f5Var.getMeasuredWidth()) * 100.0f;
                                            d20Var.M.coordinates.y = (((rectF2.centerY() * scaleY) + o10.w(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y10)) / f5Var.getMeasuredHeight()) * 100.0f;
                                            d20Var.M.coordinates.w = ((rectF2.width() * scaleX) / f5Var.getMeasuredWidth()) * 100.0f;
                                            d20Var.M.coordinates.h = ((rectF2.height() * scaleY) / f5Var.getMeasuredHeight()) * 100.0f;
                                            d20Var.M.coordinates.rotation = ((-d20Var.e) / 3.141592653589793d) * 180.0d;
                                            d = r10;
                                        }
                                        mediaArea = d20Var.M;
                                        if (mediaArea != null && (mediaAreaCoordinates = mediaArea.coordinates) != null && d > 0.0d) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                        }
                                        z14 = z17;
                                        z15 = z18;
                                    } else {
                                        if (jVar instanceof tg.l0) {
                                            tg.l0 l0Var = (tg.l0) jVar;
                                            tg.j0 j0Var2 = l0Var.r0;
                                            d20Var.a = (byte) 7;
                                            if (j0Var2.e()) {
                                                d20Var.b = (byte) j0Var2.getPreviewType();
                                            } else {
                                                d20Var.b = (byte) l0Var.getType();
                                            }
                                            d20Var.f = j0Var2.getWidth();
                                            d20Var.g = j0Var2.getHeight();
                                            d20Var.l = l0Var.u0 ? l0Var.getColor() : 0;
                                            d20Var.P = j0Var2.e;
                                            d20Var.W = l0Var.v0;
                                            if (j0Var2.S) {
                                                ImageReceiver imageReceiver6 = j0Var2.U;
                                                if (j0Var2.S && imageReceiver6.J() && imageReceiver6.n() != null) {
                                                    fc.D().O(new BitmapDrawable(imageReceiver6.n()), imageReceiver6.R, false);
                                                }
                                                tg.i0 i0Var = d20Var.W;
                                                i0Var.a |= 4;
                                                i0Var.i = j0Var2.getPhotoSide();
                                            }
                                            TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                            d20Var.M = tL_mediaAreaUrl;
                                            tg.i0 i0Var2 = l0Var.v0;
                                            if (i0Var2 != null) {
                                                TLRPC.WebPage webPage = i0Var2.d;
                                                tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? l0Var.v0.c : l0Var.v0.d.url;
                                                d20Var.M.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                        } else {
                                            if (jVar instanceof tg.s1) {
                                                tg.s1 s1Var2 = (tg.s1) jVar;
                                                d20Var.a = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                d20Var.M = tL_mediaAreaSuggestedReaction;
                                                ch.p0 currentReaction = s1Var2.getCurrentReaction();
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
                                                TL_stories.MediaArea mediaArea4 = d20Var.M;
                                                mediaArea4.dark = s1Var2.s0.a == 1;
                                                mediaArea4.flipped = s1Var2.z0;
                                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            } else if (jVar instanceof tg.t1) {
                                                tg.t1 t1Var = (tg.t1) jVar;
                                                yt0 baseSize3 = t1Var.getBaseSize();
                                                d20Var.f = baseSize3.a;
                                                d20Var.g = baseSize3.b;
                                                d20Var.a = (byte) 5;
                                                if (c7Var != null) {
                                                    d20Var.j = c7Var.o0.getAbsolutePath();
                                                    d20Var.Q = c7Var.r0;
                                                    long j3 = c7Var.q0;
                                                    d20Var.T = j3;
                                                    float f17 = j3;
                                                    d20Var.R = (long) (c7Var.s0 * f17);
                                                    d20Var.S = (long) (c7Var.t0 * f17);
                                                }
                                                d20Var.b = (byte) 4;
                                                if (t1Var.s0) {
                                                    d20Var.b = (byte) (d20Var.b | 2);
                                                }
                                            } else if (jVar instanceof tg.v0) {
                                                tg.v0 v0Var4 = (tg.v0) jVar;
                                                di.n4 n4Var3 = v0Var4.r0;
                                                ArrayList arrayList3 = v0Var4.t0;
                                                tg.q0 q0Var2 = v0Var4.s0;
                                                d20Var.a = (byte) 6;
                                                int width2 = v0Var4.getWidth();
                                                d20Var.q = width2;
                                                d20Var.f = width2;
                                                int height2 = v0Var4.getHeight();
                                                d20Var.r = height2;
                                                d20Var.g = height2;
                                                gj gjVar = arrayList3.size() > 0 ? (gj) arrayList3.get(0) : null;
                                                if (gjVar != null && (message = gjVar.k) != null) {
                                                    TLRPC.MessageAction messageAction = message.action;
                                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                        TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                        d20Var.M = tL_mediaAreaStarGift;
                                                        tL_mediaAreaStarGift.slug = starGift.slug;
                                                        tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        int i22 = 0;
                                                        while (true) {
                                                            if (i22 >= q0Var2.getChildCount()) {
                                                                v0Var2 = null;
                                                                break;
                                                            }
                                                            View childAt2 = q0Var2.getChildAt(i22);
                                                            if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                                                                v0Var2 = (org.telegram.ui.Cells.v0) childAt2;
                                                                break;
                                                            }
                                                            i22++;
                                                        }
                                                        if (v0Var2 == null || (h6Var = v0Var2.I0) == null || (imageReceiver3 = h6Var.d) == null) {
                                                            v0Var = v0Var4;
                                                            n4Var = n4Var3;
                                                            view = childAt;
                                                            imageReceiver = null;
                                                            if (z12) {
                                                                if (c7Var != null) {
                                                                    Matrix matrix = c7Var.n0;
                                                                    if (c7Var.K) {
                                                                        matrix.reset();
                                                                        if (q0Var2.getChildCount() == 1) {
                                                                            view3 = q0Var2.getChildAt(0);
                                                                            if (view3 instanceof org.telegram.ui.Cells.r1) {
                                                                                imageReceiver2 = ((org.telegram.ui.Cells.r1) view3).getPhotoImage();
                                                                                if (imageReceiver2 != null) {
                                                                                    float max = Math.max(imageReceiver2.w() / Math.max(1, c7Var.k0), imageReceiver2.v() / Math.max(1, c7Var.l0));
                                                                                    matrix.postScale(max, max);
                                                                                    matrix.postTranslate(imageReceiver2.r() - ((c7Var.k0 * max) / 2.0f), imageReceiver2.s() - ((c7Var.l0 * max) / 2.0f));
                                                                                    matrix.postTranslate(n4Var.getX(), n4Var.getY());
                                                                                    matrix.postTranslate(q0Var2.getX(), q0Var2.getY());
                                                                                    matrix.postTranslate(view3.getX(), view3.getY());
                                                                                    matrix.postScale(v0Var.getScaleX(), v0Var.getScaleY(), v0Var.getPivotX(), v0Var.getPivotY());
                                                                                    matrix.postRotate(v0Var.getRotation(), v0Var.getPivotX(), v0Var.getPivotY());
                                                                                    matrix.postTranslate(v0Var.getX(), v0Var.getY());
                                                                                    matrix.postScale(1.0f / f5Var.getWidth(), 1.0f / f5Var.getHeight());
                                                                                    matrix.postScale(c7Var.i0, c7Var.j0);
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
                                                            arrayList.add(d20Var);
                                                            scaleX = view.getScaleX();
                                                            float scaleY2 = view.getScaleY();
                                                            float x102 = view.getX();
                                                            float y102 = view.getY();
                                                            d20Var.q = view.getWidth();
                                                            d20Var.r = view.getHeight();
                                                            d20Var.f = (view.getWidth() * scaleX) / f5Var.getMeasuredWidth();
                                                            d20Var.g = (view.getHeight() * scaleY2) / f5Var.getMeasuredHeight();
                                                            d20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102) / f5Var.getMeasuredWidth();
                                                            d20Var.d = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y102) / f5Var.getMeasuredHeight();
                                                            d20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            d20Var.y = ((view.getWidth() / 2.0f) + x102) / f5Var.getMeasuredWidth();
                                                            d20Var.z = ((view.getHeight() / 2.0f) + y102) / f5Var.getMeasuredHeight();
                                                            d20Var.w = d20Var.q / f5Var.getMeasuredWidth();
                                                            d20Var.x = d20Var.r / f5Var.getMeasuredHeight();
                                                            d20Var.v = scaleX;
                                                            if (jVar instanceof tg.v0) {
                                                            }
                                                            mediaArea = d20Var.M;
                                                            if (mediaArea != null) {
                                                                mediaAreaCoordinates.flags |= 1;
                                                                mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        } else {
                                                            imageReceiver3.O0(false, false);
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) di.y8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                            if (stargiftattributemodel != null) {
                                                                float L = org.telegram.messenger.g0.L(110.0f);
                                                                float r11 = imageReceiver3.r() + v0Var2.getX() + q0Var2.getX() + v0Var2.G0;
                                                                float s5 = imageReceiver3.s() + v0Var2.getY() + q0Var2.getY() + v0Var2.H0;
                                                                v0Var = v0Var4;
                                                                d20 d20Var2 = new d20();
                                                                d20Var2.a = (byte) 0;
                                                                d20Var2.f = L;
                                                                d20Var2.g = L;
                                                                TLRPC.Document document2 = stargiftattributemodel.document;
                                                                d20Var2.B = document2;
                                                                d20Var2.C = starGift;
                                                                org.telegram.messenger.w7.G(k10.t0);
                                                                d20Var2.j = org.telegram.messenger.w7.K(document2, true).getAbsolutePath();
                                                                if (gj.K2(document2, true) || u0(document2)) {
                                                                    boolean K25 = gj.K2(document2, true);
                                                                    d20Var2.b = (byte) (d20Var2.b | (K25 ? (byte) 1 : (byte) 4));
                                                                    oh0 B = imageReceiver3.B();
                                                                    if (B != null && (K25 || u0(document2))) {
                                                                        r21 = B.r();
                                                                    }
                                                                    if (r21 != 0) {
                                                                        BigInteger valueOf3 = BigInteger.valueOf(r21);
                                                                        k5Var.Q0 = k5Var.Q0.multiply(valueOf3).divide(k5Var.Q0.gcd(valueOf3));
                                                                    }
                                                                }
                                                                float scaleX2 = childAt.getScaleX();
                                                                float scaleY3 = childAt.getScaleY();
                                                                float x11 = childAt.getX();
                                                                float y11 = childAt.getY();
                                                                int i23 = (int) L;
                                                                d20Var2.q = i23;
                                                                d20Var2.r = i23;
                                                                d20Var2.f = (L * scaleX2) / f5Var.getMeasuredWidth();
                                                                d20Var2.g = (L * scaleY3) / f5Var.getMeasuredHeight();
                                                                d20Var2.c = (childAt.getWidth() / 2.0f) + x11;
                                                                d20Var2.d = (childAt.getHeight() / 2.0f) + y11;
                                                                float w10 = o10.w(childAt.getWidth(), 2.0f, scaleX2, r11 * scaleX2);
                                                                n4Var = n4Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                view = childAt;
                                                                double d2 = w10;
                                                                double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                double w11 = o10.w(childAt.getHeight(), 2.0f, scaleY3, s5 * scaleY3);
                                                                d20Var2.c = (float) (((Math.cos(rotation) * d2) - (Math.sin(rotation) * w11)) + d20Var2.c);
                                                                float cos = (float) ((Math.cos(rotation) * w11) + (Math.sin(rotation) * d2) + d20Var2.d);
                                                                float f18 = (-L) / 2.0f;
                                                                float f19 = (f18 * scaleX2) + d20Var2.c;
                                                                d20Var2.c = f19;
                                                                d20Var2.d = (f18 * scaleY3) + cos;
                                                                d20Var2.c = f19 / f5Var.getMeasuredWidth();
                                                                d20Var2.d /= f5Var.getMeasuredHeight();
                                                                d20Var2.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                d20Var2.v = scaleX2;
                                                                arrayList.add(d20Var2);
                                                            } else {
                                                                v0Var = v0Var4;
                                                                n4Var = n4Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                view = childAt;
                                                            }
                                                            imageReceiver = imageReceiver4;
                                                            if (z12) {
                                                            }
                                                            z17 = true;
                                                            arrayList.add(d20Var);
                                                            scaleX = view.getScaleX();
                                                            float scaleY22 = view.getScaleY();
                                                            float x1022 = view.getX();
                                                            float y1022 = view.getY();
                                                            d20Var.q = view.getWidth();
                                                            d20Var.r = view.getHeight();
                                                            d20Var.f = (view.getWidth() * scaleX) / f5Var.getMeasuredWidth();
                                                            d20Var.g = (view.getHeight() * scaleY22) / f5Var.getMeasuredHeight();
                                                            d20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022) / f5Var.getMeasuredWidth();
                                                            d20Var.d = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y1022) / f5Var.getMeasuredHeight();
                                                            d20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            d20Var.y = ((view.getWidth() / 2.0f) + x1022) / f5Var.getMeasuredWidth();
                                                            d20Var.z = ((view.getHeight() / 2.0f) + y1022) / f5Var.getMeasuredHeight();
                                                            d20Var.w = d20Var.q / f5Var.getMeasuredWidth();
                                                            d20Var.x = d20Var.r / f5Var.getMeasuredHeight();
                                                            d20Var.v = scaleX;
                                                            if (jVar instanceof tg.v0) {
                                                            }
                                                            mediaArea = d20Var.M;
                                                            if (mediaArea != null) {
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        }
                                                    }
                                                }
                                                v0Var = v0Var4;
                                                n4Var = n4Var3;
                                                view = childAt;
                                                if (gjVar != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    d20Var.M = tL_inputMediaAreaChannelPost;
                                                    tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) d20Var.M).channel = np.u1(i16).j1(-c7.p(gjVar));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) d20Var.M;
                                                    Boolean D = c7.D(gjVar);
                                                    tL_inputMediaAreaChannelPost2.msg_id = D == null ? 0 : D.booleanValue() ? gjVar.k.fwd_from.channel_post : gjVar.e1();
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    d20Var.M = tL_inputMediaAreaChannelPost3;
                                                    tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                                if (z12) {
                                                }
                                                z17 = true;
                                                arrayList.add(d20Var);
                                                scaleX = view.getScaleX();
                                                float scaleY222 = view.getScaleY();
                                                float x10222 = view.getX();
                                                float y10222 = view.getY();
                                                d20Var.q = view.getWidth();
                                                d20Var.r = view.getHeight();
                                                d20Var.f = (view.getWidth() * scaleX) / f5Var.getMeasuredWidth();
                                                d20Var.g = (view.getHeight() * scaleY222) / f5Var.getMeasuredHeight();
                                                d20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10222) / f5Var.getMeasuredWidth();
                                                d20Var.d = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y10222) / f5Var.getMeasuredHeight();
                                                d20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                d20Var.y = ((view.getWidth() / 2.0f) + x10222) / f5Var.getMeasuredWidth();
                                                d20Var.z = ((view.getHeight() / 2.0f) + y10222) / f5Var.getMeasuredHeight();
                                                d20Var.w = d20Var.q / f5Var.getMeasuredWidth();
                                                d20Var.x = d20Var.r / f5Var.getMeasuredHeight();
                                                d20Var.v = scaleX;
                                                if (jVar instanceof tg.v0) {
                                                }
                                                mediaArea = d20Var.M;
                                                if (mediaArea != null) {
                                                }
                                                z14 = z17;
                                                z15 = z18;
                                            }
                                            view = childAt;
                                            z16 = true;
                                            z17 = true;
                                            imageReceiver = null;
                                            arrayList.add(d20Var);
                                            scaleX = view.getScaleX();
                                            float scaleY2222 = view.getScaleY();
                                            float x102222 = view.getX();
                                            float y102222 = view.getY();
                                            d20Var.q = view.getWidth();
                                            d20Var.r = view.getHeight();
                                            d20Var.f = (view.getWidth() * scaleX) / f5Var.getMeasuredWidth();
                                            d20Var.g = (view.getHeight() * scaleY2222) / f5Var.getMeasuredHeight();
                                            d20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102222) / f5Var.getMeasuredWidth();
                                            d20Var.d = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y102222) / f5Var.getMeasuredHeight();
                                            d20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            d20Var.y = ((view.getWidth() / 2.0f) + x102222) / f5Var.getMeasuredWidth();
                                            d20Var.z = ((view.getHeight() / 2.0f) + y102222) / f5Var.getMeasuredHeight();
                                            d20Var.w = d20Var.q / f5Var.getMeasuredWidth();
                                            d20Var.x = d20Var.r / f5Var.getMeasuredHeight();
                                            d20Var.v = scaleX;
                                            if (jVar instanceof tg.v0) {
                                            }
                                            mediaArea = d20Var.M;
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
                                arrayList.add(d20Var);
                                scaleX = view.getScaleX();
                                float scaleY22222 = view.getScaleY();
                                float x1022222 = view.getX();
                                float y1022222 = view.getY();
                                d20Var.q = view.getWidth();
                                d20Var.r = view.getHeight();
                                d20Var.f = (view.getWidth() * scaleX) / f5Var.getMeasuredWidth();
                                d20Var.g = (view.getHeight() * scaleY22222) / f5Var.getMeasuredHeight();
                                d20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022222) / f5Var.getMeasuredWidth();
                                d20Var.d = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y1022222) / f5Var.getMeasuredHeight();
                                d20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                d20Var.y = ((view.getWidth() / 2.0f) + x1022222) / f5Var.getMeasuredWidth();
                                d20Var.z = ((view.getHeight() / 2.0f) + y1022222) / f5Var.getMeasuredHeight();
                                d20Var.w = d20Var.q / f5Var.getMeasuredWidth();
                                d20Var.x = d20Var.r / f5Var.getMeasuredHeight();
                                d20Var.v = scaleX;
                                if (jVar instanceof tg.v0) {
                                }
                                mediaArea = d20Var.M;
                                if (mediaArea != null) {
                                }
                                z14 = z17;
                                z15 = z18;
                            } else {
                                f5Var = f5Var2;
                                i11 = childCount;
                                i12 = i15;
                                view = childAt;
                                z14 = true;
                                z15 = false;
                                imageReceiver = null;
                            }
                            if (z14 && ((z11 || (z12 && d20Var.a == 6)) && bitmap != null)) {
                                Canvas canvas2 = new Canvas(bitmap);
                                float width3 = bitmap.getWidth() / f5Var.getMeasuredWidth();
                                int i24 = 0;
                                while (i24 < 2) {
                                    Canvas canvas3 = i24 == 0 ? canvas2 : null;
                                    if (canvas3 == null || (i24 == 0 && z15)) {
                                        canvas = canvas2;
                                        view2 = view;
                                    } else {
                                        canvas3.save();
                                        canvas3.scale(width3, width3);
                                        canvas3.translate(d20Var.c * f5Var.getMeasuredWidth(), d20Var.d * f5Var.getMeasuredHeight());
                                        canvas3.scale(view.getScaleX(), view.getScaleY());
                                        canvas3.rotate(view.getRotation(), ((d20Var.f / 2.0f) / view.getScaleX()) * f5Var.getMeasuredWidth(), ((d20Var.g / 2.0f) / view.getScaleY()) * f5Var.getMeasuredHeight());
                                        view2 = view;
                                        if (!(view2 instanceof tg.n2) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                            canvas = canvas2;
                                            if (view2 instanceof tg.v0) {
                                                tg.v0 v0Var5 = (tg.v0) view2;
                                                tg.q0 q0Var3 = v0Var5.s0;
                                                boolean z22 = true;
                                                v0Var5.v0 = true;
                                                int i25 = 0;
                                                while (i25 < q0Var3.getChildCount()) {
                                                    View childAt3 = q0Var3.getChildAt(i25);
                                                    if (childAt3 instanceof org.telegram.ui.Cells.r1) {
                                                        ((org.telegram.ui.Cells.r1) childAt3).Hc = z22;
                                                    }
                                                    i25++;
                                                    z22 = true;
                                                }
                                                view2.draw(canvas3);
                                                boolean z23 = false;
                                                v0Var5.v0 = false;
                                                int i26 = 0;
                                                while (i26 < q0Var3.getChildCount()) {
                                                    View childAt4 = q0Var3.getChildAt(i26);
                                                    if (childAt4 instanceof org.telegram.ui.Cells.r1) {
                                                        ((org.telegram.ui.Cells.r1) childAt4).Hc = z23;
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
                                            Bitmap c10 = wr.c(scaleX3, scaleY4);
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
                            f5Var = f5Var2;
                            i11 = childCount;
                            i12 = i15;
                            b10 = b11;
                        }
                        i15 = i12 + 1;
                        k5Var = this;
                        b11 = b10;
                        i14 = i13;
                        f5Var2 = f5Var;
                        childCount = i11;
                    }
                }
                return bitmap;
            }
            Bitmap c11 = e5Var.c(false, false);
            createBitmap = c11 != null ? Bitmap.createBitmap(c11.getWidth(), c11.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        k5Var.Q0 = BigInteger.ONE;
        i10 = 0;
        while (i7 < f5Var2.getChildCount()) {
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
            ty tyVar = this.Z1;
            if (tyVar == null || tyVar.getVisibility() != 0) {
                t0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Z1.getMeasuredHeight());
            ofFloat.addUpdateListener(new c4(this, i7));
            this.c2 = true;
            ofFloat.addListener(new v4(this, 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
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
            f5 f5Var = this.B0;
            if (i7 >= f5Var.getChildCount()) {
                return;
            }
            View childAt = f5Var.getChildAt(i7);
            if (childAt instanceof tg.g2) {
                ImageReceiver imageReceiver = ((tg.g2) childAt).y0;
                oh0 B = imageReceiver.B();
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

    @Override // tg.d1
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
                org.telegram.messenger.g0.I3(((tg.n2) jVar).getEditText());
            }
        }
        G0(!this.a2 ? 1 : 0);
    }

    public final void t0() {
        ty tyVar;
        if (!this.a2 && (tyVar = this.Z1) != null && tyVar.getVisibility() != 8) {
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

    @Override // org.telegram.ui.Components.du0, org.telegram.ui.ActionBar.b6
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

    @Override // tg.h1
    public final void w(sg.h hVar) {
        boolean z10 = hVar instanceof sg.b;
        tg.n1 n1Var = this.N0;
        if (z10 || (hVar instanceof sg.d)) {
            n1Var.b(0.4f, 1.75f);
        } else {
            n1Var.b(0.05f, 1.0f);
        }
        n1Var.setDrawCenter(!(hVar instanceof sg.g));
        e5 e5Var = this.y0;
        if (e5Var.getCurrentBrush() instanceof sg.g) {
            this.M0 = true;
        }
        e5Var.setBrush(hVar);
        sg.h1 h1Var = this.k1;
        int i7 = h1Var.a;
        h1Var.a = sg.k0.e(this.p1).c();
        h1Var.c = this.O0.get();
        B0(h1Var, Integer.valueOf(i7), false);
        this.z0.invalidate();
    }

    public abstract void w0(boolean z10);

    @Override // tg.h1
    public final sg.k0 x() {
        return sg.k0.e(this.p1);
    }

    public final void x0() {
        final int i7 = this.I0;
        O0(1);
        postDelayed(new ai.n(this, 18), 350L);
        y4 y4Var = new y4(this, getContext(), this.q1, i7);
        this.U1 = y4Var;
        ra raVar = this.w1;
        Objects.requireNonNull(raVar);
        y4Var.x1 = new bi.b(raVar, 29);
        final boolean[] zArr = {true};
        y4Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hi.p4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                k5 k5Var = k5.this;
                k5Var.U1 = null;
                if (zArr[0]) {
                    k5Var.w0(false);
                }
                k5Var.O0(i7);
            }
        });
        y4Var.z1 = new j4(this);
        y4Var.O0(new q4(this, zArr, y4Var, 0));
        y4Var.show();
        w0(true);
    }

    public final void y0(tg.j jVar) {
        this.n0.b(jVar.getUUID(), new g4(this, jVar, 0));
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
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var, 14));
        }
        tg.n1 n1Var = this.N0;
        w4 w4Var = this.O0;
        n1Var.setValueOverride(w4Var);
        n1Var.setShowPreview(true);
        float f10 = w4Var.get();
        sg.h1 h1Var = this.k1;
        h1Var.c = f10;
        B0(h1Var, null, false);
        if (this.X1 || !(jVar instanceof tg.t1)) {
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
        c7 c7Var = saVar.L1;
        if (c7Var != null) {
            File file = c7Var.o0;
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

    public View getView() {
        return this;
    }

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f10) {
    }
}

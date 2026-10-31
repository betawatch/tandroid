package jg;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h6;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.m5;
import org.telegram.messenger.s5;
import org.telegram.messenger.tz;
import org.telegram.messenger.u20;
import org.telegram.messenger.us;
import org.telegram.messenger.v20;
import org.telegram.messenger.vp;
import org.telegram.messenger.ye;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.er0;
import org.telegram.ui.qo0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class r0 extends vu0 implements x1, h, r1, tu0, us {
    public pu0 A0;
    public org.telegram.ui.ActionBar.k1 A1;
    public j B0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout B1;
    public boolean C0;
    public Rect C1;
    public int D0;
    public Runnable D1;
    public final boolean E0;
    public final ig.s0 E1;
    public final j0 F0;
    public boolean F1;
    public final bi.t0 G0;
    public float G1;
    public final a5 H0;
    public boolean H1;
    public final k0 I0;
    public final t5 I1;
    public h01 J0;
    public final Paint J1;
    public final FrameLayout K0;
    public final Paint K1;
    public final n0 L0;
    public vg.f L1;
    public final l0 M0;
    public final float[] M1;
    public final FrameLayout N0;
    public final int[] N1;
    public d0 O0;
    public vy O1;
    public int P0;
    public boolean P1;
    public int Q0;
    public boolean Q1;
    public float R0;
    public boolean R1;
    public ValueAnimator S0;
    public int S1;
    public boolean T0;
    public int T1;
    public final d2 U0;
    public int U1;
    public final za.c V0;
    public int V1;
    public ArrayList W0;
    public boolean W1;
    public final int X0;
    public BigInteger Y0;
    public TextView Z0;
    public TextView a1;
    public TextView b1;
    public final y1 c1;
    public final t1 d1;
    public final a2 e1;
    public final ImageView f1;
    public final LinearLayout g1;
    public final TextView h1;
    public final TextView i1;
    public final k1 j0;
    public final TextView j1;
    public final o1 k0;
    public final Paint k1;
    public float l0;
    public final Paint l1;
    public final Bitmap m0;
    public float m1;
    public final Bitmap n0;
    public boolean n1;
    public final ig.t1 o0;
    public o1.j o1;
    public final s5 p0;
    public final m0 p1;
    public final ye q0;
    public final Paint q1;
    public float r0;
    public final Paint r1;
    public float s0;
    public final Paint s1;
    public float t0;
    public final ig.q1 t1;
    public float u0;
    public boolean u1;
    public float v0;
    public o1.j v1;
    public float w0;
    public float w1;
    public float x0;
    public final Paint x1;
    public boolean y0;
    public final int y1;
    public float z0;
    public final b0 z1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [int] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, jg.r0, jg.r1, jg.x1, org.telegram.ui.Components.tu0, org.telegram.ui.Components.uu0] */
    /* JADX WARN: Type inference failed for: r4v43, types: [jg.g3] */
    /* JADX WARN: Type inference failed for: r4v46, types: [android.view.View, jg.g0, jg.w2] */
    /* JADX WARN: Type inference failed for: r5v10, types: [jg.b0] */
    public r0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, ye yeVar, qo0 qo0Var, final p6 p6Var) {
        super(context, activity);
        float f7;
        int i12;
        h6[] h6VarArr;
        e2 e2Var;
        boolean z10 = false;
        this.P0 = 0;
        this.Q0 = -1;
        final er0 er0Var = (er0) this;
        this.V0 = new za.c(er0Var, 25);
        this.k1 = new Paint(1);
        this.l1 = new Paint(1);
        this.q1 = new Paint(1);
        this.r1 = new Paint(1);
        this.s1 = new Paint(1);
        ig.q1 q1Var = new ig.q1(1.0f, 0.016773745f, -1);
        this.t1 = q1Var;
        this.x1 = new Paint(1);
        this.H1 = false;
        this.I1 = new t5((View) this, 350L, gr.h);
        this.J1 = new Paint(1);
        Paint paint = new Paint(1);
        this.K1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.M1 = new float[2];
        this.N1 = new int[2];
        new androidx.activity.i(er0Var, 23);
        setDelegate(this);
        this.y1 = i10;
        this.z1 = new p6() { // from class: jg.b0
            @Override // org.telegram.ui.ActionBar.p6
            public final boolean a() {
                return t6.I.q();
            }

            @Override // org.telegram.ui.ActionBar.p6
            public final void b(float f10, float f11, int i13, int i14) {
                t6.r(f10, f11, i13, i14);
            }

            @Override // org.telegram.ui.ActionBar.p6
            public final ColorFilter c() {
                return t6.v3;
            }

            @Override // org.telegram.ui.ActionBar.p6
            public final Paint d(String str) {
                return t6.V0(str);
            }

            @Override // org.telegram.ui.ActionBar.p6
            public final boolean e() {
                return tz.H0;
            }

            @Override // org.telegram.ui.ActionBar.p6
            public final int f(int i13) {
                return h(i13);
            }

            @Override // org.telegram.ui.ActionBar.p6
            public final /* synthetic */ boolean g() {
                return false;
            }

            @Override // org.telegram.ui.ActionBar.p6
            public final /* synthetic */ Drawable getDrawable(String str) {
                return null;
            }

            @Override // org.telegram.ui.ActionBar.p6
            public final int h(int i13) {
                if (i13 == t6.G8) {
                    return -14145495;
                }
                if (i13 == t6.E8) {
                    return -1;
                }
                if (i13 == t6.h5) {
                    return -14737633;
                }
                if (i13 == t6.j5) {
                    return -592138;
                }
                if (i13 == t6.r5) {
                    return -8553091;
                }
                if (i13 == t6.wf) {
                    return -16777216;
                }
                if (i13 == t6.zf) {
                    return -1610612736;
                }
                if (i13 == t6.Cf || i13 == t6.Gf || i13 == t6.Bf) {
                    return -9539985;
                }
                if (i13 == t6.G6) {
                    return -1;
                }
                int i14 = t6.Ai;
                if (i13 == i14) {
                    return -11754001;
                }
                if (i13 == t6.i6) {
                    return 536870911;
                }
                if (i13 == t6.ti || i13 == t6.si || i13 == t6.ui) {
                    return -1;
                }
                if (i13 == t6.vi) {
                    return 352321535;
                }
                if (i13 == t6.yf || i13 == i14) {
                    return -7895161;
                }
                if (i13 == t6.xf) {
                    return 780633991;
                }
                if (i13 == t6.a7) {
                    return -15921907;
                }
                if (i13 == t6.m7) {
                    return -12500671;
                }
                if (i13 == t6.l7) {
                    return -13133079;
                }
                if (i13 == t6.n7) {
                    return -1;
                }
                if (i13 == t6.d6) {
                    return -15198183;
                }
                if (i13 == t6.d7) {
                    return -16777216;
                }
                p6 p6Var2 = p6.this;
                return p6Var2 != null ? p6Var2.h(i13) : t6.v0(i13);
            }

            @Override // org.telegram.ui.ActionBar.p6
            public final int j(int i13) {
                return h(i13);
            }

            @Override // org.telegram.ui.ActionBar.p6
            public final /* synthetic */ void i(int i13, int i14) {
            }
        };
        this.q0 = yeVar;
        this.E0 = context instanceof BubbleActivity;
        ig.s0 e = ig.s0.e(i10);
        this.E1 = e;
        e.i(0, true);
        q1Var.a = e.c();
        q1Var.c = e.i;
        s5 s5Var = new s5("Paint", true);
        this.p0 = s5Var;
        this.m0 = bitmap;
        this.n0 = bitmap2;
        this.X0 = i11;
        ig.t1 t1Var = new ig.t1();
        this.o0 = t1Var;
        t1Var.a = new ig.c0(er0Var, 9);
        j0 j0Var = new j0(er0Var, context, new ig.q0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.F0 = j0Var;
        j0Var.setDelegate(new n4.q(er0Var, qo0Var, z10));
        j0Var.setUndoStore(t1Var);
        j0Var.setQueue(s5Var);
        j0Var.setVisibility(4);
        addView(j0Var, b6.e(-1, -1, 51));
        bi.t0 t0Var = new bi.t0(er0Var, context, 2);
        this.G0 = t0Var;
        t0Var.setVisibility(4);
        addView(t0Var, b6.e(-1, -1, 51));
        k0 k0Var = new k0(er0Var, context, new a6.i(er0Var, 28));
        this.I0 = k0Var;
        addView(k0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                v20 v20Var = (v20) arrayList.get(i13);
                byte b10 = v20Var.a;
                if (b10 == 0) {
                    f7 = 2.0f;
                    ?? g02 = g0(v20Var.C, v20Var.B, z10);
                    if ((v20Var.b & 2) != 0) {
                        g02.r(z10);
                    }
                    ViewGroup.LayoutParams layoutParams = g02.getLayoutParams();
                    layoutParams.width = v20Var.q;
                    layoutParams.height = v20Var.r;
                    i12 = size;
                    e2Var = g02;
                } else {
                    f7 = 2.0f;
                    if (b10 == 1) {
                        ?? h02 = h0(z10);
                        h02.setType(v20Var.b);
                        h02.setTypeface(v20Var.n);
                        h02.setBaseFontSize(v20Var.m);
                        SpannableString spannableString = new SpannableString(v20Var.j);
                        ?? r15 = v20Var.k;
                        int size2 = r15.size();
                        ?? r12 = z10;
                        while (r12 < size2) {
                            Object obj = r15.get(r12);
                            int i14 = r12 + 1;
                            u20 u20Var = (u20) obj;
                            o5 o5Var = new o5(u20Var.document_id, h02.getFontMetricsInt());
                            int i15 = u20Var.offset;
                            spannableString.setSpan(o5Var, i15, u20Var.length + i15, 33);
                            size = size;
                            size2 = size2;
                            r12 = i14;
                        }
                        i12 = size;
                        CharSequence m10 = k6.m(spannableString, h02.getFontMetricsInt(), false, null, 0);
                        if ((m10 instanceof Spanned) && (h6VarArr = (h6[]) ((Spanned) m10).getSpans(0, m10.length(), h6.class)) != null) {
                            for (h6 h6Var : h6VarArr) {
                                h6Var.b = 0.85f;
                            }
                        }
                        h02.setText(m10);
                        t0(h02, v20Var.p);
                        ig.q1 swatch = h02.getSwatch();
                        swatch.a = v20Var.l;
                        h02.setSwatch(swatch);
                        e2Var = h02;
                    } else {
                        i12 = size;
                        if (b10 == 2) {
                            e2 f02 = f0(v20Var.j, false);
                            f02.B0 = false;
                            if ((v20Var.b & 2) != 0) {
                                f02.r(false);
                            }
                            if ((v20Var.b & 16) != 0) {
                                f02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = f02.getLayoutParams();
                            layoutParams2.width = v20Var.q;
                            layoutParams2.height = v20Var.r;
                            e2Var = f02;
                        } else {
                            i13++;
                            size = i12;
                            z10 = false;
                        }
                    }
                }
                e2Var.setX((v20Var.c * this.A0.a) - (((1.0f - v20Var.v) * v20Var.q) / f7));
                e2Var.setY((v20Var.d * this.A0.b) - (((1.0f - v20Var.v) * v20Var.r) / f7));
                e2Var.setPosition(new PointF((v20Var.q / f7) + e2Var.getX(), (v20Var.r / f7) + e2Var.getY()));
                e2Var.setScale(v20Var.v);
                e2Var.setRotation((float) (((-v20Var.e) / 3.141592653589793d) * 180.0d));
                i13++;
                size = i12;
                z10 = false;
            }
        }
        this.I0.setVisibility(4);
        a5 a5Var = new a5(context, 5);
        this.H0 = a5Var;
        addView(a5Var);
        ?? frameLayout = new FrameLayout(context);
        this.K0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, b6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        imageView.setBackground(t6.h0(1090519039, 1, -1));
        final int i16 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: jg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        er0 er0Var2 = er0Var;
                        j0 j0Var2 = er0Var2.F0;
                        if (j0Var2 != null && (j0Var2.getCurrentBrush() instanceof ig.g)) {
                            j0Var2.b();
                            er0Var2.c1.setSelectedIndex(1);
                            er0Var2.z((ig.h) ig.h.a.get(0));
                            break;
                        } else {
                            er0Var2.o0.c();
                            break;
                        }
                        break;
                    case 1:
                        er0 er0Var3 = er0Var;
                        j0 j0Var3 = er0Var3.F0;
                        ig.t1 t1Var2 = er0Var3.o0;
                        if (t1Var2.a()) {
                            if (j0Var3 != null && (j0Var3.getCurrentBrush() instanceof ig.g)) {
                                j0Var3.b();
                                er0Var3.c1.setSelectedIndex(1);
                                er0Var3.z((ig.h) ig.h.a.get(0));
                            }
                            j0Var3.a();
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var2, 9));
                            er0Var3.I0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        er0 er0Var4 = er0Var;
                        j jVar = er0Var4.B0;
                        if (jVar instanceof g3) {
                            org.telegram.messenger.i0.v1(((g3) jVar).getFocusedView());
                        }
                        if (er0Var4.P1) {
                            er0Var4.k0(false);
                        }
                        er0Var4.p0(er0Var4.B0);
                        er0Var4.q0(null, true);
                        break;
                    default:
                        er0Var.q0(null, true);
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, b6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.g1 = linearLayout;
        linearLayout.setOrientation(0);
        int i17 = 7;
        linearLayout.setBackground(t6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(cd.L0(2131747283, null));
        linearLayout.addView(z20.e(context, R.drawable.photo_zoomout), b6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, b6.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bh.c(2));
        frameLayout.addView(linearLayout, b6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.h1 = textView2;
        textView2.setBackground(t6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        textView2.setText(cd.L0(2131747295, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        final int i18 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: jg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        er0 er0Var2 = er0Var;
                        j0 j0Var2 = er0Var2.F0;
                        if (j0Var2 != null && (j0Var2.getCurrentBrush() instanceof ig.g)) {
                            j0Var2.b();
                            er0Var2.c1.setSelectedIndex(1);
                            er0Var2.z((ig.h) ig.h.a.get(0));
                            break;
                        } else {
                            er0Var2.o0.c();
                            break;
                        }
                        break;
                    case 1:
                        er0 er0Var3 = er0Var;
                        j0 j0Var3 = er0Var3.F0;
                        ig.t1 t1Var2 = er0Var3.o0;
                        if (t1Var2.a()) {
                            if (j0Var3 != null && (j0Var3.getCurrentBrush() instanceof ig.g)) {
                                j0Var3.b();
                                er0Var3.c1.setSelectedIndex(1);
                                er0Var3.z((ig.h) ig.h.a.get(0));
                            }
                            j0Var3.a();
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var2, 9));
                            er0Var3.I0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        er0 er0Var4 = er0Var;
                        j jVar = er0Var4.B0;
                        if (jVar instanceof g3) {
                            org.telegram.messenger.i0.v1(((g3) jVar).getFocusedView());
                        }
                        if (er0Var4.P1) {
                            er0Var4.k0(false);
                        }
                        er0Var4.p0(er0Var4.B0);
                        er0Var4.q0(null, true);
                        break;
                    default:
                        er0Var.q0(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView2, b6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.i1 = l4;
        l4.setBackground(t6.h0(822083583, 7, -1));
        l4.setText(cd.L0(2131752101, null));
        l4.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        l4.setGravity(16);
        l4.setTextColor(-1);
        l4.setTypeface(org.telegram.messenger.i0.o());
        l4.setTextSize(1, 16.0f);
        final int i19 = 2;
        l4.setOnClickListener(new View.OnClickListener() { // from class: jg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        er0 er0Var2 = er0Var;
                        j0 j0Var2 = er0Var2.F0;
                        if (j0Var2 != null && (j0Var2.getCurrentBrush() instanceof ig.g)) {
                            j0Var2.b();
                            er0Var2.c1.setSelectedIndex(1);
                            er0Var2.z((ig.h) ig.h.a.get(0));
                            break;
                        } else {
                            er0Var2.o0.c();
                            break;
                        }
                        break;
                    case 1:
                        er0 er0Var3 = er0Var;
                        j0 j0Var3 = er0Var3.F0;
                        ig.t1 t1Var2 = er0Var3.o0;
                        if (t1Var2.a()) {
                            if (j0Var3 != null && (j0Var3.getCurrentBrush() instanceof ig.g)) {
                                j0Var3.b();
                                er0Var3.c1.setSelectedIndex(1);
                                er0Var3.z((ig.h) ig.h.a.get(0));
                            }
                            j0Var3.a();
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var2, 9));
                            er0Var3.I0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        er0 er0Var4 = er0Var;
                        j jVar = er0Var4.B0;
                        if (jVar instanceof g3) {
                            org.telegram.messenger.i0.v1(((g3) jVar).getFocusedView());
                        }
                        if (er0Var4.P1) {
                            er0Var4.k0(false);
                        }
                        er0Var4.p0(er0Var4.B0);
                        er0Var4.q0(null, true);
                        break;
                    default:
                        er0Var.q0(null, true);
                        break;
                }
            }
        });
        l4.setAlpha(0.0f);
        l4.setVisibility(8);
        TextView l10 = org.telegram.ui.Cells.f1.l(frameLayout, l4, b6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.j1 = l10;
        l10.setBackground(t6.h0(822083583, 7, -1));
        l10.setText(cd.L0(2131751355, null));
        l10.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        l10.setGravity(16);
        l10.setTextColor(-1);
        l10.setTypeface(org.telegram.messenger.i0.o());
        l10.setTextSize(1, 16.0f);
        final int i20 = 3;
        l10.setOnClickListener(new View.OnClickListener() { // from class: jg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        er0 er0Var2 = er0Var;
                        j0 j0Var2 = er0Var2.F0;
                        if (j0Var2 != null && (j0Var2.getCurrentBrush() instanceof ig.g)) {
                            j0Var2.b();
                            er0Var2.c1.setSelectedIndex(1);
                            er0Var2.z((ig.h) ig.h.a.get(0));
                            break;
                        } else {
                            er0Var2.o0.c();
                            break;
                        }
                        break;
                    case 1:
                        er0 er0Var3 = er0Var;
                        j0 j0Var3 = er0Var3.F0;
                        ig.t1 t1Var2 = er0Var3.o0;
                        if (t1Var2.a()) {
                            if (j0Var3 != null && (j0Var3.getCurrentBrush() instanceof ig.g)) {
                                j0Var3.b();
                                er0Var3.c1.setSelectedIndex(1);
                                er0Var3.z((ig.h) ig.h.a.get(0));
                            }
                            j0Var3.a();
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var2, 9));
                            er0Var3.I0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        er0 er0Var4 = er0Var;
                        j jVar = er0Var4.B0;
                        if (jVar instanceof g3) {
                            org.telegram.messenger.i0.v1(((g3) jVar).getFocusedView());
                        }
                        if (er0Var4.P1) {
                            er0Var4.k0(false);
                        }
                        er0Var4.p0(er0Var4.B0);
                        er0Var4.q0(null, true);
                        break;
                    default:
                        er0Var.q0(null, true);
                        break;
                }
            }
        });
        l10.setAlpha(0.0f);
        l10.setVisibility(8);
        frameLayout.addView(l10, b6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        n0 n0Var = new n0(er0Var, context);
        this.L0 = n0Var;
        n0Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), 0);
        n0Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(n0Var, b6.e(-1, zs.p1, 80));
        y1 y1Var = new y1(context, bitmap2 != null);
        this.c1 = y1Var;
        y1Var.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        y1Var.setDelegate(this);
        y1Var.setSelectedIndex(1);
        n0Var.addView(y1Var, b6.c(48.0f, -1));
        t1 t1Var2 = new t1(context);
        this.d1 = t1Var2;
        t1Var2.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        t1Var2.setVisibility(8);
        t1Var2.setDelegate(this);
        t1Var2.setAlignment(ig.s0.e(i10).g);
        n0Var.addView(t1Var2, b6.c(48.0f, -1));
        l0 l0Var = new l0(er0Var, context);
        this.M0 = l0Var;
        addView(l0Var, b6.c(-1.0f, -1));
        a2 a2Var = new a2(context);
        this.e1 = a2Var;
        a2Var.setVisibility(8);
        a2Var.setOnItemClickListener(new ag.y0(er0Var, 4));
        t1Var2.setTypefaceListView(a2Var);
        l0Var.addView(a2Var, b6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.k1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.k1.setColor(1728053247);
        this.k1.setStrokeWidth(Math.max(2, org.telegram.messenger.i0.L(1.0f)));
        this.l1.setColor(t6.w0(t6.G8, this.z1));
        m0 m0Var = new m0(er0Var, context);
        this.p1 = m0Var;
        m0Var.setVisibility(8);
        m0Var.setColorPalette(ig.s0.e(i10));
        m0Var.setColorListener(new m(er0Var, 0));
        n0Var.addView(m0Var, b6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        k1 k1Var = new k1(context);
        this.j0 = k1Var;
        k1Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        k1Var.setBackground(t6.h0(1090519039, 1, -1));
        n0Var.addView(k1Var, b6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        o1 o1Var = new o1(context);
        this.k0 = o1Var;
        o1Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        o1Var.setBackground(t6.h0(1090519039, 1, -1));
        o1Var.setOnClickListener(new ag.i(er0Var, context, bitmap2, 4));
        n0Var.addView(o1Var, b6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        d2 d2Var = new d2(context);
        this.U0 = d2Var;
        d2Var.setColorSwatch(this.t1);
        d2Var.setRenderView(this.F0);
        d2Var.setValueOverride(this.V0);
        this.t1.c = this.V0.get();
        d2Var.setOnUpdate(new ag.d3(er0Var, i10, i17));
        addView(d2Var, b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.N0 = frameLayout2;
        addView(frameLayout2, b6.c(-1.0f, -1));
        this.s1.setStyle(style);
        this.s1.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        r0(this.t1, null);
        z((ig.h) ig.h.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.i0.q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.i0.L(100.0f), (int) (point.y * 0.65d))));
        }
    }

    public static /* synthetic */ void X(er0 er0Var, Integer num) {
        er0Var.setNewColor(num.intValue());
        er0Var.v0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: all -> 0x002c, Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:4:0x0004, B:6:0x0022, B:8:0x0026, B:12:0x0036, B:14:0x005a, B:17:0x0061, B:18:0x0068, B:21:0x006d, B:22:0x0077, B:24:0x007d, B:26:0x0091, B:30:0x009b, B:34:0x00a7, B:36:0x00aa, B:41:0x00ad, B:46:0x00b4), top: B:3:0x0004, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y(r0 r0Var) {
        ig.t0 t0Var;
        boolean z10;
        Bitmap bitmap = r0Var.n0;
        t8.b bVar = null;
        try {
            try {
                nh.n nVar = new nh.n(r0Var.getContext());
                nVar.c(1);
                nVar.b(1);
                nVar.c = false;
                bVar = nVar.a();
                if (!bVar.c.k()) {
                    if (org.telegram.messenger.v2.a) {
                        f8.d("face detection is not operational");
                    }
                    bVar.X0();
                    return;
                }
                q5.d dVar = new q5.d(1);
                a3.l lVar = (a3.l) dVar.b;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                dVar.d = bitmap;
                lVar.a = width;
                lVar.b = height;
                lVar.c = r0Var.getFrameRotation();
                if (((ByteBuffer) dVar.c) == null && ((Bitmap) dVar.d) == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                try {
                    SparseArray e12 = bVar.e1(dVar);
                    ArrayList arrayList = new ArrayList();
                    pu0 paintingSize = r0Var.getPaintingSize();
                    for (int i10 = 0; i10 < e12.size(); i10++) {
                        t8.a aVar = (t8.a) e12.get(e12.keyAt(i10));
                        int i11 = r0Var.X0;
                        if (i11 % 360 != 90 && i11 % 360 != 270) {
                            z10 = false;
                            t0Var = new ig.t0(aVar, bitmap, paintingSize, z10);
                            if (!(t0Var.d == null)) {
                                arrayList.add(t0Var);
                            }
                        }
                        z10 = true;
                        t0Var = new ig.t0(aVar, bitmap, paintingSize, z10);
                        if (!(t0Var.d == null)) {
                        }
                    }
                    r0Var.W0 = arrayList;
                    bVar.X0();
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    bVar.X0();
                }
            } catch (Exception e) {
                f8.g(e, true);
                if (0 == 0) {
                }
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                bVar.X0();
            }
            throw th3;
        }
    }

    public static void Z(r0 r0Var) {
        j jVar;
        k0 k0Var = r0Var.I0;
        j jVar2 = r0Var.B0;
        if (jVar2 != null) {
            PointF z02 = r0Var.z0(jVar2);
            j jVar3 = r0Var.B0;
            if (jVar3 instanceof w2) {
                w2 w2Var = new w2(r0Var.getContext(), (w2) r0Var.B0, z02);
                w2Var.setDelegate(r0Var);
                k0Var.addView(w2Var);
                jVar = w2Var;
            } else if (jVar3 instanceof g3) {
                g3 g3Var = new g3(r0Var.getContext(), (g3) r0Var.B0, z02);
                g3Var.setDelegate(r0Var);
                g3Var.setMaxWidth((int) (r0Var.getPaintingSize().a - 20.0f));
                k0Var.addView(g3Var, b6.c(-2.0f, -2));
                jVar = g3Var;
            } else {
                jVar = null;
            }
            r0Var.o0(jVar);
            r0Var.q0(jVar, true);
        }
        org.telegram.ui.ActionBar.k1 k1Var = r0Var.A1;
        if (k1Var == null || !k1Var.isShowing()) {
            return;
        }
        r0Var.A1.d(true);
    }

    public static void a0(er0 er0Var, Integer num) {
        ig.s0 s0Var = er0Var.E1;
        s0Var.h(num.intValue(), true);
        s0Var.g();
        er0Var.setNewColor(num.intValue());
        m0 m0Var = er0Var.p1;
        m0Var.setSelectedColorIndex(s0Var.d());
        m0Var.getAdapter().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.P0 == 2 ? this.d1 : this.c1;
    }

    private int getFrameRotation() {
        int i10 = this.X0;
        if (i10 == 90) {
            return 1;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 3;
        }
        return 2;
    }

    private pu0 getPaintingSize() {
        pu0 pu0Var = this.A0;
        if (pu0Var != null) {
            return pu0Var;
        }
        Bitmap bitmap = this.m0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int o10 = tz.o();
        int i10 = o10 != 0 ? o10 != 2 ? 2560 : 3840 : 1280;
        pu0 pu0Var2 = new pu0(width, height);
        float f7 = i10;
        pu0Var2.a = f7;
        float floor = (float) Math.floor((f7 * height) / width);
        pu0Var2.b = floor;
        if (floor > f7) {
            pu0Var2.b = f7;
            pu0Var2.a = (float) Math.floor((f7 * width) / height);
        }
        this.A0 = pu0Var2;
        return pu0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i10) {
        ig.q1 q1Var = this.t1;
        int i11 = q1Var.a;
        q1Var.a = i10;
        r0(q1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new a0(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.D0 = i10;
        j jVar = this.B0;
        if (jVar instanceof g3) {
            ((g3) jVar).setType(i10);
        }
        ig.s0 e = ig.s0.e(this.y1);
        e.h = i10;
        e.a.edit().putInt("text_type", i10).apply();
        this.d1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        d0 d0Var = new d0(this, context);
        this.O0 = d0Var;
        d0Var.setClipToPadding(false);
        this.O0.setOrientation(0);
        this.L0.addView(this.O0, b6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.Z0 = textView;
        textView.setText(cd.L0(2131747293, null).toUpperCase());
        TextView textView2 = this.Z0;
        int i10 = t6.i6;
        b0 b0Var = this.z1;
        a7.R(textView2, t6.h0(t6.w0(i10, b0Var), 7, -1), null, a7.N(i10), b0Var);
        this.Z0.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        this.Z0.setTextColor(-1);
        this.Z0.setTextSize(1, 14.0f);
        this.Z0.setGravity(1);
        this.Z0.setTypeface(org.telegram.messenger.i0.o());
        this.Z0.setSingleLine();
        this.Z0.setOnClickListener(new k(this, 0));
        this.O0.addView(this.Z0, b6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.a1 = textView3;
        textView3.setText(cd.L0(2131747292, null).toUpperCase());
        a7.R(this.a1, t6.h0(t6.w0(i10, b0Var), 7, -1), null, a7.N(i10), b0Var);
        this.a1.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        this.a1.setOnClickListener(new k(this, 1));
        this.a1.setTextColor(-1);
        this.a1.setTextSize(1, 14.0f);
        this.a1.setGravity(1);
        this.a1.setTypeface(org.telegram.messenger.i0.o());
        this.a1.setAlpha(0.6f);
        this.a1.setSingleLine();
        this.O0.addView(this.a1, b6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.b1 = textView4;
        textView4.setText(cd.L0(2131747291, null).toUpperCase());
        a7.R(this.b1, t6.h0(t6.w0(i10, b0Var), 7, -1), null, a7.N(i10), b0Var);
        this.b1.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        this.b1.setTextColor(-1);
        this.b1.setTextSize(1, 14.0f);
        this.b1.setGravity(1);
        this.b1.setTypeface(org.telegram.messenger.i0.o());
        this.b1.setAlpha(0.6f);
        this.b1.setSingleLine();
        this.b1.setOnClickListener(new k(this, 4));
        this.O0.addView(this.b1, b6.l(1.0f, 0, -2));
    }

    public static void t0(g3 g3Var, int i10) {
        g3Var.setAlign(i10);
        int i11 = 2;
        g3Var.getEditText().setGravity(i10 != 1 ? i10 != 2 ? 19 : 21 : 17);
        if (i10 == 1) {
            i11 = 4;
        } else if (i10 == 2 ? !cd.X : cd.X) {
            i11 = 3;
        }
        g3Var.getEditText().setTextAlignment(i11);
    }

    @Override // jg.x1
    public final void A() {
        x0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final void A0(int i10) {
        if (this.P0 == i10 || this.Q0 == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.S0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = this.P0;
        ViewGroup viewGroup = this.d1;
        ViewGroup viewGroup2 = this.c1;
        ViewGroup viewGroup3 = i11 == 0 ? viewGroup2 : i11 == 2 ? viewGroup : null;
        this.Q0 = i10;
        ViewGroup viewGroup4 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        int i12 = this.y1;
        ig.s0 e = ig.s0.e(i12);
        int i13 = 1;
        boolean z10 = i10 == 2;
        if (e.l != z10) {
            e.l = z10;
            if (z10) {
                e.i(-1, false);
            } else {
                e.i(e.a.getInt("brush", 0), false);
            }
        }
        int c10 = ig.s0.e(i12).c();
        ig.q1 q1Var = this.t1;
        q1Var.a = c10;
        r0(q1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.S0 = duration;
        duration.setInterpolator(gr.f);
        this.S0.addUpdateListener(new ci.b(this, viewGroup3, viewGroup4, i13));
        this.S0.addListener(new ci.k(this, viewGroup3, viewGroup4, i10, 1));
        this.S0.start();
    }

    public final void B0() {
        int i10 = 0;
        while (true) {
            k0 k0Var = this.I0;
            if (i10 >= k0Var.getChildCount()) {
                return;
            }
            View childAt = k0Var.getChildAt(i10);
            if (childAt != this.B0) {
                if (childAt instanceof j) {
                    j jVar = (j) childAt;
                    if (!jVar.l0 && jVar.j0 <= 0.0f) {
                    }
                }
                i10++;
            }
            ((j) childAt).m();
            i10++;
        }
    }

    @Override // jg.r1
    public final void D() {
        y0(true);
    }

    @Override // org.telegram.ui.Components.tu0
    public final void K(int i10, boolean z10) {
        boolean z11;
        if (i10 > org.telegram.messenger.i0.L(50.0f) && this.Q1 && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            if (z10) {
                this.U1 = i10;
                vp.c1().edit().putInt("kbd_height_land3", this.U1).commit();
            } else {
                this.T1 = i10;
                vp.c1().edit().putInt("kbd_height", this.T1).commit();
            }
        }
        if (this.P1) {
            int i11 = z10 ? this.U1 : this.T1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O1.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = org.telegram.messenger.i0.q.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.O1.setLayoutParams(layoutParams);
                this.S1 = layoutParams.height;
                requestLayout();
                vh.r2 r2Var = ((er0) this).X1.K1;
                if (r2Var != null) {
                    r2Var.a();
                }
                getHeight();
            }
        }
        if (this.V1 == i10 && this.W1 == z10) {
            getHeight();
            return;
        }
        this.V1 = i10;
        this.W1 = z10;
        boolean z12 = this.Q1;
        j jVar = this.B0;
        if (jVar instanceof g3) {
            this.Q1 = ((g3) jVar).getEditText().isFocused() && i10 > 0;
        } else {
            this.Q1 = false;
        }
        if (this.Q1 && this.P1) {
            w0(0);
        }
        if (this.S1 != 0 && !(z11 = this.Q1) && z11 != z12 && !this.P1) {
            this.S1 = 0;
            requestLayout();
            vh.r2 r2Var2 = ((er0) this).X1.K1;
            if (r2Var2 != null) {
                r2Var2.a();
            }
        }
        getHeight();
    }

    @Override // jg.x1, jg.r1
    public final void a() {
        v0(true);
    }

    @Override // org.telegram.ui.Components.uu0, org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.G8));
        hashSet.add(Integer.valueOf(t6.h5));
        hashSet.add(Integer.valueOf(t6.j5));
        hashSet.add(Integer.valueOf(t6.r5));
        hashSet.add(Integer.valueOf(t6.wf));
        hashSet.add(Integer.valueOf(t6.zf));
        hashSet.add(Integer.valueOf(t6.Cf));
        hashSet.add(Integer.valueOf(t6.Gf));
        hashSet.add(Integer.valueOf(t6.Bf));
        hashSet.add(Integer.valueOf(t6.G6));
        hashSet.add(Integer.valueOf(t6.Ai));
        hashSet.add(Integer.valueOf(t6.ti));
        hashSet.add(Integer.valueOf(t6.si));
        hashSet.add(Integer.valueOf(t6.ui));
        hashSet.add(Integer.valueOf(t6.vi));
        hashSet.add(Integer.valueOf(t6.yf));
        hashSet.add(Integer.valueOf(t6.xf));
        hashSet.add(Integer.valueOf(t6.a7));
        hashSet.add(Integer.valueOf(t6.m7));
        hashSet.add(Integer.valueOf(t6.l7));
        hashSet.add(Integer.valueOf(t6.n7));
        hashSet.add(Integer.valueOf(t6.d6));
        hashSet.add(Integer.valueOf(t6.d7));
    }

    @Override // jg.h
    public final void b(j jVar) {
        int[] i02 = i0(jVar);
        x0(new x(this, jVar, 1), this, 51, i02[0], i02[1] - org.telegram.messenger.i0.L(32.0f));
    }

    @Override // jg.r1
    public final void c() {
        setTextType((this.D0 + 1) % 4);
    }

    @Override // jg.r1
    public final void d(int i10) {
        j jVar = this.B0;
        if (jVar instanceof g3) {
            t0((g3) jVar, i10);
            ig.s0 e = ig.s0.e(this.y1);
            e.g = i10;
            e.a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new d1.e(24, this, (e2) view)).start();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k0 k0Var;
        g3 g3Var;
        String str;
        if (i10 != zs.C5 || (k0Var = this.I0) == null) {
            return;
        }
        for (int i12 = 0; i12 < k0Var.getChildCount(); i12++) {
            View childAt = k0Var.getChildAt(i12);
            if ((childAt instanceof g3) && (str = (g3Var = (g3) childAt).A0) != null) {
                g3Var.setTypeface(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ye yeVar;
        int i10;
        a5 a5Var;
        k0 k0Var = this.I0;
        if (view == k0Var) {
            float d = this.I1.d(this.F1);
            if (d > 0.0f) {
                float L = org.telegram.messenger.i0.L(24.0f * d);
                int r12 = t6.r1(d, 1090519039);
                Paint paint = this.J1;
                paint.setShadowLayer(L, 0.0f, 0.0f, r12);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), zs.e4, 31);
                canvas.translate(k0Var.getX(), k0Var.getY());
                canvas.scale(k0Var.getScaleX(), k0Var.getScaleY(), k0Var.getWidth() / 2.0f, k0Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, k0Var.getWidth(), k0Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, k0Var.getWidth(), k0Var.getHeight(), this.K1);
                canvas.restore();
                if ((view != this.F0 || view == this.G0 || ((view == k0Var && k0Var.getClipChildren()) || (view == (a5Var = this.H0) && a5Var.getClipChildren()))) && (yeVar = this.q0) != null) {
                    canvas.save();
                    r10 = this.E0 ? 0 : org.telegram.messenger.i0.m;
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + r10;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    i10 = yeVar.k;
                    if (i10 != 90 || i10 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    int scaleX = (int) ((view.getScaleX() * (measuredWidth * yeVar.e)) / yeVar.c);
                    int scaleY = (int) ((view.getScaleY() * (measuredHeight * yeVar.f)) / yeVar.c);
                    float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.u0;
                    float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.S1) - currentActionBarHeight) - org.telegram.messenger.i0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.i0.L(8.0f) + r10 + this.v0;
                    canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
                    r10 = 1;
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (r10 != 0) {
                    canvas.restore();
                }
                return drawChild;
            }
        }
        if (view != this.F0) {
        }
        canvas.save();
        if (this.E0) {
        }
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + r10;
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        i10 = yeVar.k;
        if (i10 != 90) {
        }
        measuredHeight2 = measuredWidth2;
        measuredWidth2 = measuredHeight2;
        int scaleX2 = (int) ((view.getScaleX() * (measuredWidth2 * yeVar.e)) / yeVar.c);
        int scaleY2 = (int) ((view.getScaleY() * (measuredHeight2 * yeVar.f)) / yeVar.c);
        float ceil2 = ((float) Math.ceil((getMeasuredWidth() - scaleX2) / 2.0f)) + this.u0;
        float additionalBottom2 = (((getAdditionalBottom() + (((getMeasuredHeight() - this.S1) - currentActionBarHeight2) - org.telegram.messenger.i0.L(48.0f))) - scaleY2) / 2.0f) + org.telegram.messenger.i0.L(8.0f) + r10 + this.v0;
        canvas.clipRect(Math.max(0.0f, ceil2), Math.max(0.0f, additionalBottom2), Math.min(ceil2 + scaleX2, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom2 + scaleY2));
        r10 = 1;
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        if (r10 != 0) {
        }
        return drawChild2;
    }

    public final PointF e0() {
        pu0 paintingSize = getPaintingSize();
        float f7 = paintingSize.a / 2.0f;
        float f10 = paintingSize.b / 2.0f;
        if (this.q0 != null) {
            double radians = (float) Math.toRadians(-(r2.k + r2.d));
            float cos = (float) ((Math.cos(radians) * r2.a) - (Math.sin(radians) * r2.b));
            float c10 = (float) i0.a.c(radians, r2.b, Math.sin(radians) * r2.a);
            f7 -= cos * paintingSize.a;
            f10 -= c10 * paintingSize.b;
        }
        return new PointF(f7, f10);
    }

    public final e2 f0(String str, boolean z10) {
        float f7;
        pu0 pu0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            f8.g(e, true);
            f7 = 1.0f;
        }
        k0 k0Var = this.I0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(k0Var.getMeasuredWidth() * 0.5d);
            pu0Var = new pu0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(k0Var.getMeasuredHeight() * 0.5d);
            pu0Var = new pu0(f7 * floor2, floor2);
        }
        pu0 pu0Var2 = pu0Var;
        Pair N0 = org.telegram.messenger.i0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f10 = pu0Var2.a;
            pu0Var2.a = pu0Var2.b;
            pu0Var2.b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        e2 e2Var = new e2(context, e02, pu0Var2, str, intValue);
        e2Var.setDelegate(this);
        k0Var.addView(e2Var);
        if (z10) {
            o0(e2Var);
            q0(e2Var, true);
        }
        return e2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g0 g0(Object obj, TLRPC.Document document, boolean z10) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f7;
        q0 q0Var;
        double d;
        q0 q0Var2;
        PointF pointF;
        boolean C4;
        ArrayList arrayList;
        ig.t0 t0Var;
        q0 q0Var3;
        int i10;
        float f10;
        int i11 = 0;
        while (true) {
            if (i11 >= document.attributes.size()) {
                tL_maskCoords = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                tL_maskCoords = documentAttribute.mask_coords;
                break;
            }
            i11++;
        }
        float f11 = 0.75f;
        ye yeVar = this.q0;
        if (yeVar != null) {
            f7 = -(yeVar.k + yeVar.d);
            f11 = 0.75f / yeVar.c;
        } else {
            f7 = 0.0f;
        }
        q0 q0Var4 = new q0(e0(), f11, f7);
        k0 k0Var = this.I0;
        if (tL_maskCoords == null || (arrayList = this.W0) == null || arrayList.size() == 0) {
            q0Var = q0Var4;
            d = 0.5d;
        } else {
            int i12 = tL_maskCoords.n;
            long j10 = document.id;
            if (i12 >= 0 && i12 <= 3 && !this.W0.isEmpty()) {
                int size = this.W0.size();
                int nextInt = Utilities.b.nextInt(size);
                int i13 = size;
                loop1: while (i13 > 0) {
                    ig.t0 t0Var2 = (ig.t0) this.W0.get(nextInt);
                    if (t0Var2.a(i12) != null) {
                        d = 0.5d;
                        float f12 = t0Var2.a * 1.1f;
                        int i14 = 0;
                        while (i14 < k0Var.getChildCount()) {
                            View childAt = k0Var.getChildAt(i14);
                            ig.t0 t0Var3 = t0Var2;
                            if (childAt instanceof w2) {
                                w2 w2Var = (w2) childAt;
                                if (w2Var.getAnchor() == i12) {
                                    PointF position = w2Var.getPosition();
                                    q0Var3 = q0Var4;
                                    i10 = size;
                                    f10 = f12;
                                    float hypot = (float) Math.hypot(position.x - r4.x, position.y - r4.y);
                                    if ((j10 == w2Var.getSticker().id || this.W0.size() > 1) && hypot < f10) {
                                        break;
                                    }
                                    i14++;
                                    t0Var2 = t0Var3;
                                    q0Var4 = q0Var3;
                                    size = i10;
                                    f12 = f10;
                                }
                            }
                            q0Var3 = q0Var4;
                            i10 = size;
                            f10 = f12;
                            i14++;
                            t0Var2 = t0Var3;
                            q0Var4 = q0Var3;
                            size = i10;
                            f12 = f10;
                        }
                        q0Var = q0Var4;
                        t0Var = t0Var2;
                        break loop1;
                    }
                    q0Var3 = q0Var4;
                    i10 = size;
                    nextInt = (nextInt + 1) % i10;
                    i13--;
                    q0Var4 = q0Var3;
                    size = i10;
                }
            }
            q0Var = q0Var4;
            d = 0.5d;
            t0Var = null;
            if (t0Var != null) {
                PointF a2 = t0Var.a(i12);
                float f13 = i12 == 1 ? t0Var.e : t0Var.a;
                float f14 = t0Var.b;
                float floor = (float) ((f13 / ((float) Math.floor(getPaintingSize().a * d))) * tL_maskCoords.zoom);
                double radians = (float) Math.toRadians(f14);
                double d10 = 1.5707963267948966d - radians;
                double d11 = f13;
                float sin = (float) (Math.sin(d10) * d11 * tL_maskCoords.x);
                float cos = (float) (Math.cos(d10) * d11 * tL_maskCoords.x);
                double d12 = radians + 1.5707963267948966d;
                q0Var2 = new q0(new PointF(a2.x + sin + ((float) (Math.cos(d12) * d11 * tL_maskCoords.y)), a2.y + cos + ((float) (Math.sin(d12) * d11 * tL_maskCoords.y))), floor, f14);
                Context context = getContext();
                float floor2 = (float) Math.floor(getPaintingSize().a * d);
                pu0 pu0Var = new pu0(floor2, floor2);
                pointF = q0Var2.a;
                g0 g0Var = new g0(this, context, pointF, q0Var2.c, q0Var2.b, pu0Var, document, obj);
                C4 = jj.C4(document);
                ImageReceiver imageReceiver = g0Var.x0;
                if (C4) {
                    imageReceiver.o1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                imageReceiver.E0(12);
                if (pointF.x == k0Var.getMeasuredWidth() / 2.0f) {
                    g0Var.setStickyX(2);
                }
                if (pointF.y == k0Var.getMeasuredHeight() / 2.0f) {
                    g0Var.setStickyY(2);
                }
                g0Var.setDelegate(this);
                k0Var.addView(g0Var);
                if (z10) {
                    o0(g0Var);
                    q0(g0Var, true);
                }
                return g0Var;
            }
        }
        q0Var2 = q0Var;
        Context context2 = getContext();
        float floor22 = (float) Math.floor(getPaintingSize().a * d);
        pu0 pu0Var2 = new pu0(floor22, floor22);
        pointF = q0Var2.a;
        g0 g0Var2 = new g0(this, context2, pointF, q0Var2.c, q0Var2.b, pu0Var2, document, obj);
        C4 = jj.C4(document);
        ImageReceiver imageReceiver2 = g0Var2.x0;
        if (C4) {
        }
        imageReceiver2.E0(12);
        if (pointF.x == k0Var.getMeasuredWidth() / 2.0f) {
        }
        if (pointF.y == k0Var.getMeasuredHeight() / 2.0f) {
        }
        g0Var2.setDelegate(this);
        k0Var.addView(g0Var2);
        if (z10) {
        }
        return g0Var2;
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    public View getCancelView() {
        return this.j0;
    }

    public float getCropRotation() {
        ye yeVar = this.q0;
        if (yeVar != null) {
            return yeVar.d + yeVar.k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.k0;
    }

    public long getLcm() {
        return this.Y0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        o5[] o5VarArr;
        k0 k0Var = this.I0;
        int childCount = k0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = k0Var.getChildAt(i10);
            if (childAt instanceof w2) {
                TLRPC.Document sticker = ((w2) childAt).getSticker();
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
            } else if (childAt instanceof g3) {
                CharSequence text = ((g3) childAt).getText();
                if ((text instanceof Spanned) && (o5VarArr = (o5[]) ((Spanned) text).getSpans(0, text.length(), o5.class)) != null) {
                    for (o5 o5Var : o5VarArr) {
                        if (o5Var != null) {
                            TLRPC.Document document = o5Var.document;
                            if (document == null) {
                                document = f5.e(this.y1, o5Var.getDocumentId());
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
        return this.l0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public ig.c1 getRenderView() {
        return this.F0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.B0;
        k0 k0Var = this.I0;
        if (jVar == null) {
            return getY() + k0Var.getMeasuredHeight();
        }
        jVar.getLocationInWindow(new int[2]);
        return (k0Var.getScaleY() * this.B0.getHeight()) + r2[1];
    }

    public h01 getThanosEffect() {
        if (!h01.c()) {
            return null;
        }
        if (this.J0 == null) {
            h01 h01Var = new h01(getContext(), new n(this, 0));
            this.J0 = h01Var;
            addView(h01Var);
        }
        return this.J0;
    }

    public final g3 h0(boolean z10) {
        ((er0) this).X1.g0.isFocusable();
        pu0 paintingSize = getPaintingSize();
        PointF z02 = z0(null);
        g3 g3Var = new g3(getContext(), z02, (int) (paintingSize.a / 9.0f), "", this.t1, this.D0);
        float f7 = paintingSize.a / 9.0f;
        n nVar = new n(this, 2);
        g3Var.w0 = (int) (0.5f * f7);
        g3Var.x0 = (int) (f7 * 2.0f);
        g3Var.y0 = nVar;
        float f10 = z02.x;
        k0 k0Var = this.I0;
        if (f10 == k0Var.getMeasuredWidth() / 2.0f) {
            g3Var.setStickyX(2);
        }
        if (z02.y == k0Var.getMeasuredHeight() / 2.0f) {
            g3Var.setStickyY(2);
        }
        g3Var.setDelegate(this);
        g3Var.setMaxWidth((int) (paintingSize.a - 20.0f));
        int i10 = this.y1;
        g3Var.setTypeface(ig.s0.e(i10).j);
        g3Var.setType(ig.s0.e(i10).h);
        k0Var.addView(g3Var, b6.c(-2.0f, -2));
        ye yeVar = this.q0;
        if (yeVar != null) {
            g3Var.j(1.0f / yeVar.c);
            g3Var.f(-(yeVar.k + yeVar.d));
        }
        if (z10) {
            o0(g3Var);
            g3Var.q();
            q0(g3Var, false);
            g3Var.getFocusedView().requestFocus();
            org.telegram.messenger.i0.J3(g3Var.getFocusedView());
            this.C0 = true;
            int i11 = ig.s0.e(i10).g;
            t1 t1Var = this.d1;
            t1Var.d(i11, true);
            t1Var.setOutlineType(ig.s0.e(i10).h);
        }
        return g3Var;
    }

    public final boolean i(MotionEvent motionEvent) {
        if (this.B0 != null) {
            q0(null, true);
        }
        float x10 = motionEvent.getX();
        j0 j0Var = this.F0;
        float translationX = ((x10 - j0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / j0Var.getScaleX();
        float y3 = ((((motionEvent.getY() - j0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + org.telegram.messenger.i0.L(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / j0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-j0Var.getRotation());
        double d10 = y3;
        float measuredWidth = (j0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (j0Var.getMeasuredHeight() / 2.0f) + ((float) i0.a.c(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        j0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int[] i0(j jVar) {
        float[] fArr = this.M1;
        fArr[0] = jVar.getWidth() / 2.0f;
        fArr[1] = jVar.getHeight() / 2.0f;
        jVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + jVar.getLeft();
        fArr[1] = fArr[1] + jVar.getTop();
        Object parent = jVar.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            parent = view.getParent();
        }
        int round = Math.round(fArr[0]);
        int[] iArr = this.N1;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        float f7 = iArr[0];
        Point point = org.telegram.messenger.i0.q;
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.I0.getRotation());
        double d10 = round2 - (point.y / 2.0f);
        iArr[0] = (point.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (point.y / 2) + ((int) i0.a.c(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final int j0(boolean z10) {
        return this.S1;
    }

    public final void k0(boolean z10) {
        int i10 = 0;
        if (this.P1) {
            w0(0);
        }
        if (z10) {
            vy vyVar = this.O1;
            if (vyVar == null || vyVar.getVisibility() != 0) {
                l0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.O1.getMeasuredHeight());
            ofFloat.addUpdateListener(new o(this, i10));
            this.R1 = true;
            ofFloat.addListener(new h0(this, 1));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.w);
            ofFloat.start();
        }
    }

    public final void l0() {
        vy vyVar;
        vh.r2 r2Var;
        if (this.S1 > 0 && (r2Var = ((er0) this).X1.K1) != null) {
            r2Var.a();
        }
        if (!this.P1 && (vyVar = this.O1) != null && vyVar.getVisibility() != 8) {
            this.O1.setVisibility(8);
        }
        this.S1 = 0;
    }

    public final void m0(boolean z10) {
        if (this.P0 == 0) {
            this.U0.setLayerType(z10 ? 2 : 0, null);
            this.L0.setLayerType(z10 ? 2 : 0, null);
            this.K0.setLayerType(z10 ? 2 : 0, null);
        }
    }

    public final boolean n0() {
        if (this.u1) {
            v0(false);
            return true;
        }
        if (this.P1) {
            k0(true);
            return true;
        }
        if (!this.C0) {
            return false;
        }
        q0(null, true);
        return true;
    }

    @Override // jg.h
    public final /* synthetic */ boolean o() {
        return true;
    }

    public final void o0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.o0.b(jVar.getUUID(), new x(this, jVar, 0));
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.e().c(this, zs.C5);
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.e().n(this, zs.C5);
    }

    @Override // org.telegram.ui.Components.vu0, org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (this.O1 != null) {
            int measuredHeight = org.telegram.messenger.i0.Q1() ? i15 - this.O1.getMeasuredHeight() : (Q() + i15) - this.O1.getMeasuredHeight();
            vy vyVar = this.O1;
            vyVar.layout(0, measuredHeight, vyVar.getMeasuredWidth(), this.O1.getMeasuredHeight() + measuredHeight);
        }
        int i16 = this.E0 ? 0 : org.telegram.messenger.i0.m;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i16;
        j0 j0Var = this.F0;
        int ceil = (int) Math.ceil((i14 - j0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + m5.C(8.0f, (((i15 - currentActionBarHeight) - org.telegram.messenger.i0.L(48.0f)) - j0Var.getMeasuredHeight()) / 2, i16);
        j0Var.layout(ceil, additionalTop, j0Var.getMeasuredWidth() + ceil, j0Var.getMeasuredHeight() + additionalTop);
        bi.t0 t0Var = this.G0;
        t0Var.layout(ceil, additionalTop, t0Var.getMeasuredWidth() + ceil, t0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = j0Var.getMeasuredWidth();
        k0 k0Var = this.I0;
        int measuredWidth2 = ((measuredWidth - k0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight2 = ((j0Var.getMeasuredHeight() - k0Var.getMeasuredHeight()) / 2) + additionalTop;
        k0Var.layout(measuredWidth2, measuredHeight2, k0Var.getMeasuredWidth() + measuredWidth2, k0Var.getMeasuredHeight() + measuredHeight2);
        h01 h01Var = this.J0;
        if (h01Var != null) {
            h01Var.layout(measuredWidth2, measuredHeight2, k0Var.getMeasuredWidth() + measuredWidth2, k0Var.getMeasuredHeight() + measuredHeight2);
        }
        a5 a5Var = this.H0;
        a5Var.layout(ceil, additionalTop, a5Var.getMeasuredWidth() + ceil, a5Var.getMeasuredHeight() + additionalTop);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        this.y0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.i0.L(48.0f);
        Bitmap bitmap = this.m0;
        if (bitmap != null) {
            f7 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(48.0f);
            f7 = size;
        }
        float f10 = size;
        float floor = (float) Math.floor((f10 * currentActionBarHeight) / f7);
        float f11 = currentActionBarHeight2;
        if (floor > f11) {
            f10 = (float) Math.floor((f7 * f11) / currentActionBarHeight);
            floor = f11;
        }
        int i12 = (int) f10;
        int i13 = (int) floor;
        this.F0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        this.G0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        float f12 = f10 / this.A0.a;
        this.z0 = f12;
        k0 k0Var = this.I0;
        k0Var.setScaleX(f12);
        k0Var.setScaleY(this.z0);
        k0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.A0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.A0.b, TLObject.FLAG_30));
        h01 h01Var = this.J0;
        if (h01Var != null) {
            h01Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.A0.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) this.A0.b, TLObject.FLAG_30));
            this.J0.setScaleX(this.z0);
            this.J0.setScaleY(this.z0);
        }
        B0();
        this.H0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
        measureChild(this.L0, i10, i11);
        measureChild(this.U0, i10, i11);
        measureChild(this.N0, i10, i11);
        measureChild(this.M0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.S1), TLObject.FLAG_30));
        FrameLayout frameLayout = this.K0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.m, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.y0 = false;
        if (org.telegram.messenger.i0.L(20.0f) >= 0 && !this.P1 && !this.R1) {
            this.y0 = true;
            l0();
            this.y0 = false;
        }
        if (org.telegram.messenger.i0.L(20.0f) < 0) {
            l0();
        }
        vy vyVar = this.O1;
        if (vyVar != null) {
            measureChild(vyVar, i10, i11);
        }
    }

    @Override // jg.h
    public final boolean p() {
        return !this.C0;
    }

    public final void p0(j jVar) {
        j jVar2 = this.B0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            this.B0 = null;
            if (jVar instanceof g3) {
                ValueAnimator valueAnimator = this.S0;
                if (valueAnimator != null && this.Q0 != 0) {
                    valueAnimator.cancel();
                }
                A0(0);
            }
        }
        this.I0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            ig.t1 t1Var = this.o0;
            t1Var.b.remove(uuid);
            t1Var.c.remove(uuid);
            org.telegram.messenger.i0.g3(new gg.c(t1Var, 9));
        }
        d2 d2Var = this.U0;
        za.c cVar = this.V0;
        d2Var.setValueOverride(cVar);
        d2Var.setShowPreview(true);
        float f7 = cVar.get();
        ig.q1 q1Var = this.t1;
        q1Var.c = f7;
        r0(q1Var, null);
    }

    public final boolean q0(j jVar, boolean z10) {
        r0 r0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof g3;
        int i11 = 2;
        if (z12 && (((i10 = this.Q0) == -1 && this.P0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.S0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.u1) {
                v0(false);
            }
            A0(2);
        }
        if (z12 && z10) {
            g3 g3Var = (g3) jVar;
            int gravity = g3Var.getEditText().getGravity();
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            t1 t1Var = this.d1;
            t1Var.setAlignment(i11);
            t1Var.setTypeface(g3Var.getTypeface().a);
            t1Var.e(g3Var.getType(), true);
            this.M0.invalidate();
        }
        j jVar2 = this.B0;
        if (jVar2 == null) {
            r0Var = this;
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!this.C0) {
                    int[] i02 = i0(jVar2);
                    x0(new x(this, jVar2, 1), this, 51, i02[0], i02[1] - org.telegram.messenger.i0.L(32.0f));
                    return true;
                }
                if (jVar2 instanceof g3) {
                    org.telegram.messenger.i0.J3(((g3) jVar2).getFocusedView());
                    k0(false);
                }
                return true;
            }
            r0Var = this;
            jVar2.l(jVar2.m0, false);
            j jVar3 = r0Var.B0;
            if (jVar3 instanceof g3) {
                g3 g3Var2 = (g3) jVar3;
                e3 e3Var = g3Var2.q0;
                e3Var.clearFocus();
                e3Var.setEnabled(false);
                e3Var.setClickable(false);
                g3Var2.m();
                if (!z12) {
                    r0Var.C0 = false;
                    org.telegram.messenger.i0.v1(((g3) r0Var.B0).getFocusedView());
                    k0(false);
                }
            }
            z11 = true;
        }
        j jVar4 = r0Var.B0;
        r0Var.B0 = jVar;
        if ((jVar4 instanceof g3) && TextUtils.isEmpty(((g3) jVar4).getText())) {
            p0(jVar4);
        }
        j jVar5 = r0Var.B0;
        za.c cVar = r0Var.V0;
        ig.q1 q1Var = r0Var.t1;
        d2 d2Var = r0Var.U0;
        if (jVar5 == null) {
            ValueAnimator valueAnimator2 = r0Var.S0;
            if (valueAnimator2 != null && r0Var.Q0 != 0) {
                valueAnimator2.cancel();
            }
            if (r0Var.u1) {
                v0(false);
            }
            A0(0);
            d2Var.setValueOverride(cVar);
            d2Var.setShowPreview(true);
            q1Var.c = cVar.get();
            r0(q1Var, null);
            return z11;
        }
        a5 a5Var = r0Var.H0;
        jVar5.m0 = a5Var;
        jVar5.l(a5Var, true);
        r0Var.I0.bringChildToFront(r0Var.B0);
        j jVar6 = r0Var.B0;
        if (!(jVar6 instanceof g3)) {
            d2Var.setValueOverride(cVar);
            d2Var.setShowPreview(true);
            q1Var.c = cVar.get();
            r0(q1Var, null);
            return true;
        }
        g3 g3Var3 = (g3) jVar6;
        g3Var3.z0 = false;
        g3Var3.getSwatch().c = q1Var.c;
        r0(g3Var3.getSwatch(), null);
        d2Var.setValueOverride(new c0(g3Var3, (int) (r0Var.A0.a / 9.0f), 0));
        d2Var.setShowPreview(false);
        return true;
    }

    @Override // jg.h
    public final int[] r(j jVar) {
        return i0(jVar);
    }

    public final void r0(ig.q1 q1Var, Integer num) {
        ig.q1 q1Var2 = this.t1;
        if (q1Var2 != q1Var) {
            q1Var2.a = q1Var.a;
            q1Var2.b = q1Var.b;
            q1Var2.c = q1Var.c;
            int i10 = this.y1;
            ig.s0.e(i10).h(q1Var.a, true);
            ig.s0.e(i10).j(q1Var.c);
        }
        int i11 = q1Var.a;
        j0 j0Var = this.F0;
        j0Var.setColor(i11);
        j0Var.setBrushSize(q1Var.c);
        int i12 = q1Var2.a;
        if (num == null || num.intValue() == i12) {
            n0 n0Var = this.L0;
            if (n0Var != null) {
                n0Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new p(this, num, i12, 0));
            duration.start();
        }
        j jVar = this.B0;
        if (jVar instanceof g3) {
            ((g3) jVar).setSwatch(new ig.q1(q1Var.b, q1Var.c, q1Var.a));
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.y0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(float f7) {
        this.l0 = f7;
        this.K0.setTranslationY(-f7);
        this.L0.setTranslationY(f7);
    }

    public void setBlurredBackgroundDrawableForTools(vg.f fVar) {
        fVar.p(org.telegram.messenger.i0.L(4.0f));
        this.L1 = fVar;
    }

    public void setDrawShadow(boolean z10) {
        this.F1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f7) {
        if (this.P0 == 0) {
            this.U0.setTranslationX(f7);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.D1 = runnable;
    }

    @Override // jg.r1
    public final void t() {
        vh.r2 r2Var;
        if (!this.Q1 && !this.P1) {
            h0(true);
            return;
        }
        boolean z10 = this.P1;
        if (z10 && (r2Var = ((er0) this).X1.K1) != null) {
            r2Var.e = true;
        }
        w0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.B0;
            if (jVar instanceof g3) {
                org.telegram.messenger.i0.J3(((g3) jVar).getEditText());
            }
        }
    }

    @Override // jg.h
    public final void u(float f7, float f10, float[] fArr) {
        Point point = org.telegram.messenger.i0.q;
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.I0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (point.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (point.y / 2.0f) + ((float) i0.a.c(radians, d10, Math.sin(radians) * d));
    }

    public final void u0(float f7, float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        this.r0 = f7;
        this.w0 = f12;
        this.x0 = f13;
        this.s0 = f10;
        this.t0 = f11;
        this.u0 = f10;
        float f19 = f11 + 0.0f;
        this.v0 = f19;
        int i10 = 0;
        while (i10 < 4) {
            View view = i10 == 0 ? this.I0 : i10 == 1 ? this.H0 : i10 == 2 ? this.F0 : this.G0;
            ye yeVar = this.q0;
            if (yeVar != null) {
                float f20 = yeVar.c * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth == 0 || measuredHeight == 0) {
                    return;
                }
                int i11 = yeVar.k;
                if (i11 == 90 || i11 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f12 / ((int) (yeVar.e * r12)), f13 / ((int) (yeVar.f * r13)));
                f15 = f20 * max;
                float E = c3.i0.E(yeVar.a, measuredWidth, f7, max);
                float f21 = yeVar.c;
                f16 = (E * f21) + f10;
                f14 = 1.0f;
                f17 = (yeVar.b * measuredHeight * f7 * max * f21) + f19;
                f18 = yeVar.d + i11;
            } else {
                f14 = 1.0f;
                f15 = i10 == 0 ? this.z0 * 1.0f : 1.0f;
                f16 = f10;
                f17 = f19;
                f18 = 0.0f;
            }
            float f22 = ((-this.S1) / 2.0f) + f17;
            float f23 = f7 * f15;
            if (Float.isNaN(f23)) {
                f23 = f14;
            }
            view.setScaleX(f23);
            view.setScaleY(f23);
            view.setTranslationX(f16);
            view.setTranslationY(f22);
            view.setRotation(f18);
            view.invalidate();
            i10++;
        }
        B0();
        invalidate();
    }

    @Override // org.telegram.ui.Components.uu0, org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        this.x1.setColor(-15132391);
    }

    @Override // jg.x1
    public final ig.s0 v() {
        return ig.s0.e(this.y1);
    }

    public final void v0(final boolean z10) {
        if (this.u1 != z10) {
            this.u1 = z10;
            o1.j jVar = this.v1;
            if (jVar != null) {
                jVar.d();
            }
            o1.j jVar2 = new o1.j(new o1.i(z10 ? 0.0f : 1000.0f));
            this.v1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.m = kVar;
            int i10 = 1;
            final boolean[] zArr = {this.Q1 || this.P1};
            final float translationY = this.L0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.v1.b(new o1.g() { // from class: jg.y
                @Override // o1.g
                public final void a(o1.j jVar3, float f7, float f10) {
                    r0 r0Var = r0.this;
                    n0 n0Var = r0Var.L0;
                    float f11 = f7 / 1000.0f;
                    r0Var.w1 = f11;
                    float f12 = ((1.0f - f11) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f12);
                    view.setScaleY(f12);
                    view.setTranslationY((Math.min(r0Var.w1, 0.25f) * org.telegram.messenger.i0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(r0Var.w1, 0.25f) / 0.25f));
                    m0 m0Var = r0Var.p1;
                    float f13 = r0Var.w1;
                    boolean z11 = z10;
                    m0Var.B1(z11, f13);
                    r0Var.k0.setProgress(r0Var.w1);
                    r0Var.j0.setProgress(r0Var.w1);
                    r0Var.O0.setTranslationY(org.telegram.messenger.i0.L(32.0f) * r0Var.w1);
                    if (zArr[0]) {
                        float f14 = r0Var.w1;
                        if (!z11) {
                            f14 = 1.0f - f14;
                        }
                        n0Var.setTranslationY(translationY - ((org.telegram.messenger.i0.L(40.0f) * f14) * (z11 ? 1 : -1)));
                    }
                    n0Var.invalidate();
                    if (view == r0Var.d1) {
                        r0Var.M0.invalidate();
                    }
                }
            });
            this.v1.a(new u(this, z10, i10));
            this.v1.h();
            if (z10) {
                m0 m0Var = this.p1;
                m0Var.setVisibility(0);
                m0Var.setSelectedColorIndex(ig.s0.e(this.y1).d());
            }
        }
    }

    public final void w0(int i10) {
        t1 t1Var = this.d1;
        int i11 = 0;
        int i12 = 1;
        if (i10 != 1) {
            fg emojiButton = t1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(dg.e, true);
            }
            vy vyVar = this.O1;
            if (vyVar != null) {
                this.P1 = false;
                if (org.telegram.messenger.i0.D || org.telegram.messenger.i0.E) {
                    vyVar.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.S1 = 0;
            }
            vh.r2 r2Var = ((er0) this).X1.K1;
            if (r2Var != null) {
                r2Var.a();
            }
            requestLayout();
            getHeight();
            return;
        }
        vy vyVar2 = this.O1;
        boolean z10 = vyVar2 != null && vyVar2.getVisibility() == 0;
        vy vyVar3 = this.O1;
        if (vyVar3 != null && vyVar3.c1 != d20.s0) {
            removeView(vyVar3);
            this.O1 = null;
        }
        if (this.O1 == null) {
            vy vyVar4 = new vy(null, true, false, false, getContext(), false, null, null, true, this.z1, false, false);
            this.O1 = vyVar4;
            vyVar4.U0 = true;
            vyVar4.setVisibility(8);
            if (org.telegram.messenger.i0.Q1()) {
                this.O1.setForseMultiwindowLayout(true);
            }
            this.O1.setDelegate(new i0(this));
            addView(this.O1);
        }
        this.O1.setVisibility(0);
        this.P1 = true;
        vy vyVar5 = this.O1;
        if (this.T1 <= 0) {
            if (org.telegram.messenger.i0.Q1()) {
                this.T1 = org.telegram.messenger.i0.L(150.0f);
            } else {
                this.T1 = vp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
            }
        }
        if (this.U1 <= 0) {
            if (org.telegram.messenger.i0.Q1()) {
                this.U1 = org.telegram.messenger.i0.L(150.0f);
            } else {
                this.U1 = vp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
            }
        }
        Point point = org.telegram.messenger.i0.q;
        int i13 = point.x > point.y ? this.U1 : this.T1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vyVar5.getLayoutParams();
        layoutParams.height = i13;
        vyVar5.setLayoutParams(layoutParams);
        if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            j jVar = this.B0;
            if (jVar instanceof g3) {
                org.telegram.messenger.i0.v1(((g3) jVar).getEditText());
            }
        }
        this.S1 = i13;
        requestLayout();
        vh.r2 r2Var2 = ((er0) this).X1.K1;
        if (r2Var2 != null) {
            r2Var2.a();
        }
        fg emojiButton2 = t1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(dg.d, true);
        }
        getHeight();
        if (z10 || this.Q1) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S1, 0.0f);
        ofFloat.addUpdateListener(new o(this, i12));
        ofFloat.addListener(new h0(this, i11));
        ofFloat.start();
    }

    public final void x0(Runnable runnable, r0 r0Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k1 k1Var = this.A1;
        if (k1Var != null && k1Var.isShowing()) {
            this.A1.d(true);
            return;
        }
        int i13 = 0;
        if (this.B1 == null) {
            this.C1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.z1);
            this.B1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.B1.setBackgroundColor(-14145495);
            this.B1.setOnTouchListener(new r(i13, this));
            this.B1.setDispatchKeyEventListener(new s(this));
            this.B1.setShownFromBottom(true);
        }
        this.B1.d();
        runnable.run();
        if (this.A1 == null) {
            org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(this.B1, -2, -2);
            this.A1 = k1Var2;
            k1Var2.b = true;
            k1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.A1.setOutsideTouchable(true);
            this.A1.setClippingEnabled(true);
            this.A1.setInputMethodMode(2);
            this.A1.setSoftInputMode(0);
            this.A1.getContentView().setFocusableInTouchMode(true);
            this.A1.setOnDismissListener(new t(i13, this));
        }
        this.B1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
        this.A1.setFocusable(true);
        this.A1.showAtLocation(r0Var, i10, i11 - (this.B1.getMeasuredWidth() / 2), i12 - this.B1.getMeasuredHeight());
        org.telegram.ui.ActionBar.k1.i(this.B1);
    }

    @Override // jg.h
    public final boolean y(j jVar) {
        return q0(jVar, true);
    }

    public final void y0(boolean z10) {
        if (this.n1 != z10) {
            this.n1 = z10;
            o1.j jVar = this.o1;
            if (jVar != null) {
                jVar.d();
            }
            o1.j jVar2 = new o1.j(new o1.i(z10 ? 0.0f : 1000.0f));
            this.o1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.m = kVar;
            if (z10) {
                a2 a2Var = this.e1;
                a2Var.setAlpha(0.0f);
                a2Var.setVisibility(0);
            }
            this.o1.b(new fg.c(1, this));
            this.o1.a(new u(this, z10, 0));
            this.o1.h();
        }
    }

    @Override // jg.x1
    public final void z(ig.h hVar) {
        boolean z10 = hVar instanceof ig.b;
        d2 d2Var = this.U0;
        if (z10 || (hVar instanceof ig.d)) {
            d2Var.b(0.4f, 1.75f);
        } else {
            d2Var.b(0.05f, 1.0f);
        }
        d2Var.setDrawCenter(!(hVar instanceof ig.g));
        j0 j0Var = this.F0;
        if (j0Var.getCurrentBrush() instanceof ig.g) {
            this.T0 = true;
        }
        j0Var.setBrush(hVar);
        ig.q1 q1Var = this.t1;
        int i10 = q1Var.a;
        q1Var.a = ig.s0.e(this.y1).c();
        q1Var.c = this.V0.get();
        r0(q1Var, Integer.valueOf(i10));
        this.G0.invalidate();
    }

    public final PointF z0(j jVar) {
        ye yeVar = this.q0;
        float f7 = yeVar != null ? 200.0f / yeVar.c : 200.0f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f7, position.y + f7);
        }
        float f10 = yeVar != null ? 100.0f / yeVar.c : 100.0f;
        PointF e02 = e0();
        while (true) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                k0 k0Var = this.I0;
                if (i10 >= k0Var.getChildCount()) {
                    break;
                }
                View childAt = k0Var.getChildAt(i10);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f10) {
                        z10 = true;
                    }
                }
                i10++;
            }
            if (!z10) {
                return e02;
            }
            e02 = new PointF(e02.x + f7, e02.y + f7);
        }
    }

    @Override // jg.h
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // jg.h
    public final /* synthetic */ void e(boolean z10) {
    }

    @Override // jg.h
    public final /* synthetic */ void f(boolean z10) {
    }

    @Override // jg.h
    public final /* synthetic */ void j(boolean z10) {
    }

    @Override // jg.h
    public final /* synthetic */ void C() {
    }

    @Override // jg.h
    public final /* synthetic */ void g() {
    }

    public View getView() {
        return this;
    }

    @Override // jg.h
    public final /* synthetic */ void h() {
    }

    @Override // jg.h
    public final /* synthetic */ void w() {
    }
}

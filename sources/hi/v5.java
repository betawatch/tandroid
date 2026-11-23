package hi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
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
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.ri;
import org.telegram.messenger.vr;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class v5 extends du0 implements tg.l1, tg.l, tg.h1, bu0, jb {
    public final c5 A0;
    public ArrayList A1;
    public final q5 B0;
    public int B1;
    public final FrameLayout C0;
    public int C1;
    public final r5 D0;
    public sg.q D1;
    public final c5 E0;
    public final boolean E1;
    public final FrameLayout F0;
    public final File F1;
    public i5 G0;
    public final boolean G1;
    public final View H0;
    public final boolean H1;
    public int I0;
    public boolean I1;
    public int J0;
    public xi0 J1;
    public float K0;
    public tg.v1 K1;
    public ValueAnimator L0;
    public float L1;
    public boolean M0;
    public boolean M1;
    public final tg.r1 N0;
    public boolean N1;
    public final h6.o O0;
    public org.telegram.ui.Components.ba O1;
    public final int P0;
    public final e6 P1;
    public BigInteger Q0;
    public final f6 Q1;
    public TextView R0;
    public boolean R1;
    public TextView S0;
    public ObjectAnimator S1;
    public TextView T0;
    public boolean T1;
    public final tg.m1 U0;
    public final a0 U1;
    public final tg.j1 V0;
    public final x7 V1;
    public final tg.o1 W0;
    public final f5 W1;
    public final ImageView X0;
    public final float[] X1;
    public final TextView Y0;
    public j5 Y1;
    public final TextView Z0;
    public boolean Z1;
    public final TextView a1;
    public boolean a2;
    public final Paint b1;
    public boolean b2;
    public final Paint c1;
    public final int[] c2;
    public float d1;
    public qy d2;
    public boolean e1;
    public boolean e2;
    public r1.g f1;
    public boolean f2;
    public final d5 g1;
    public boolean g2;
    public final Paint h1;
    public int h2;
    public final Paint i1;
    public boolean i2;
    public final Paint j1;
    public int j2;
    public final tg.a1 k0;
    public final sg.g1 k1;
    public int k2;
    public final tg.e1 l0;
    public boolean l1;
    public int l2;
    public final Bitmap m0;
    public r1.g m1;
    public boolean m2;
    public final sg.j1 n0;
    public float n1;
    public final org.telegram.messenger.r5 o0;
    public final Paint o1;
    public final we p0;
    public final int p1;
    public boolean q0;
    public final n5 q1;
    public xt0 r0;
    public org.telegram.ui.ActionBar.g1 r1;
    public boolean s0;
    public t5 s1;
    public tg.n t0;
    public Rect t1;
    public boolean u0;
    public Runnable u1;
    public int v0;
    public Runnable v1;
    public boolean w0;
    public final mb w1;
    public final boolean x0;
    public AnimatorSet x1;
    public final p5 y0;
    public final e5 y1;
    public final bi.o3 z0;
    public x7 z1;

    /* JADX WARN: Removed duplicated region for block: B:40:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0608  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v5(Context context, boolean z10, File file, boolean z11, boolean z12, mb mbVar, Activity activity, final int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, x7 x7Var, int i11, int i12, we weVar, org.telegram.ui.Components.ba baVar, org.telegram.ui.ActionBar.i6 i6Var, e6 e6Var, f6 f6Var) {
        super(context, activity);
        int i13;
        sg.g1 g1Var;
        org.telegram.ui.Components.ba baVar2;
        int i14;
        this.I0 = 0;
        this.J0 = -1;
        final pa paVar = (pa) this;
        h6.o oVar = new h6.o(paVar, 3);
        this.O0 = oVar;
        Paint paint = new Paint(1);
        this.b1 = paint;
        Paint paint2 = new Paint(1);
        this.c1 = paint2;
        this.h1 = new Paint(1);
        this.i1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.j1 = paint3;
        sg.g1 g1Var2 = new sg.g1(1.0f, 0.016773745f, -1);
        this.k1 = g1Var2;
        this.o1 = new Paint(1);
        f5 f5Var = new f5(paVar);
        this.W1 = f5Var;
        this.X1 = new float[2];
        this.a2 = false;
        this.c2 = new int[2];
        new a8.sa(paVar, 28);
        setDelegate(this);
        this.O1 = baVar;
        this.P1 = e6Var;
        this.E1 = z10;
        this.F1 = file;
        this.G1 = z11;
        this.H1 = z12;
        this.w1 = mbVar;
        this.B1 = i11;
        this.C1 = i12;
        this.Q1 = f6Var;
        this.p1 = i7;
        if (z11 && !z12 && x7Var != null && x7Var.L != null && !x7Var.v()) {
            this.V1 = x7Var;
            File file2 = x7Var.L;
            a0 a0Var = (file2 != null && file2.exists() && DictationAsr.E(i7)) ? new a0(file2, f5Var) : null;
            this.U1 = a0Var;
            if (a0Var != null) {
                i13 = 0;
                a0Var.d = new m4(paVar, i13);
                n5 n5Var = new n5(i13, i6Var);
                this.q1 = n5Var;
                this.p0 = weVar;
                this.x0 = context instanceof BubbleActivity;
                sg.j0 e10 = sg.j0.e(i7);
                e10.i(i13, true);
                g1Var2.a = e10.c();
                g1Var2.c = e10.i;
                org.telegram.messenger.r5 r5Var = new org.telegram.messenger.r5("Paint", true);
                this.o0 = r5Var;
                this.m0 = bitmap;
                this.P0 = i10;
                sg.j1 j1Var = new sg.j1();
                this.n0 = j1Var;
                j1Var.a = new di.v6(paVar, 23);
                View view = new View(context);
                this.H0 = view;
                view.setVisibility(8);
                view.setBackgroundColor(1291845632);
                view.setAlpha(0.0f);
                sg.h0 h0Var = new sg.h0(getPaintingSize(), null, i10, baVar);
                if (x7Var == null && x7Var.u) {
                    g1Var = g1Var2;
                    baVar2 = null;
                } else {
                    g1Var = g1Var2;
                    baVar2 = baVar;
                }
                int i15 = 1;
                p5 p5Var = new p5(paVar, context, h0Var, bitmap, bitmap2, baVar2);
                this.y0 = p5Var;
                p5Var.setDelegate(new u0(paVar, i15));
                p5Var.setUndoStore(j1Var);
                p5Var.setQueue(r5Var);
                p5Var.setVisibility(4);
                bi.o3 o3Var = new bi.o3(2, context, paVar);
                this.z0 = o3Var;
                o3Var.setVisibility(4);
                q5 q5Var = new q5(paVar, context, new f5(paVar));
                this.B0 = q5Var;
                this.z1 = x7Var;
                this.A1 = arrayList;
                if (this.B1 > 0 && this.C1 > 0) {
                    H0();
                }
                q5Var.setVisibility(4);
                this.A0 = new c5(paVar, context, 1);
                FrameLayout frameLayout = new FrameLayout(context);
                this.C0 = frameLayout;
                frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                frameLayout.setBackground(new GradientDrawable(orientation, new int[]{TLObject.FLAG_30, 0}));
                addView(frameLayout, c8.na.e(-1, -2, 48));
                ImageView imageView = new ImageView(context);
                this.X0 = imageView;
                imageView.setImageResource(R.drawable.photo_undo2);
                imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
                final int i16 = 1;
                imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
                imageView.setOnClickListener(new View.OnClickListener() { // from class: hi.o4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i16) {
                            case 0:
                                pa paVar2 = paVar;
                                if (!paVar2.l1) {
                                    if (!paVar2.e2) {
                                        if (!paVar2.u0) {
                                            Runnable runnable = paVar2.v1;
                                            if (runnable != null) {
                                                runnable.run();
                                                break;
                                            }
                                        } else {
                                            paVar2.D0(null, true);
                                            break;
                                        }
                                    } else {
                                        paVar2.u0(true);
                                        break;
                                    }
                                } else {
                                    paVar2.I0(false);
                                    break;
                                }
                                break;
                            case 1:
                                pa paVar3 = paVar;
                                p5 p5Var2 = paVar3.y0;
                                if (p5Var2 != null && (p5Var2.getCurrentBrush() instanceof sg.g)) {
                                    p5Var2.b();
                                    paVar3.U0.setSelectedIndex(1);
                                    paVar3.w((sg.h) sg.h.a.get(0));
                                    break;
                                } else {
                                    paVar3.n0.c();
                                    break;
                                }
                                break;
                            case 2:
                                pa paVar4 = paVar;
                                p5 p5Var3 = paVar4.y0;
                                sg.j1 j1Var2 = paVar4.n0;
                                if (j1Var2.a()) {
                                    if (p5Var3 != null && (p5Var3.getCurrentBrush() instanceof sg.g)) {
                                        p5Var3.b();
                                        paVar4.U0.setSelectedIndex(1);
                                        paVar4.w((sg.h) sg.h.a.get(0));
                                    }
                                    if (p5Var3 != null) {
                                        p5Var3.a();
                                    }
                                    j1Var2.c.clear();
                                    j1Var2.b.clear();
                                    org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var2, 14));
                                    paVar4.B0.removeAllViews();
                                    break;
                                }
                                break;
                            case 3:
                                pa paVar5 = paVar;
                                tg.n nVar = paVar5.t0;
                                if (nVar instanceof tg.q2) {
                                    org.telegram.messenger.g0.v1(((tg.q2) nVar).getFocusedView());
                                }
                                if (paVar5.e2) {
                                    paVar5.u0(false);
                                }
                                paVar5.B0(paVar5.t0);
                                paVar5.D0(null, true);
                                break;
                            default:
                                paVar.D0(null, true);
                                break;
                        }
                    }
                });
                imageView.setAlpha(0.6f);
                imageView.setClickable(false);
                frameLayout.addView(imageView, c8.na.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
                linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                TextView textView = new TextView(context);
                textView.setTextColor(-1);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 16.0f);
                textView.setText(gd.N0(2131747073, null));
                linearLayout.addView(m10.e(context, R.drawable.photo_zoomout), c8.na.t(24, 24, 16, 0, 0, 8, 0));
                linearLayout.addView(textView, c8.na.r(-2, -2, 16));
                linearLayout.setAlpha(0.0f);
                linearLayout.setOnClickListener(new bi.o(8));
                frameLayout.addView(linearLayout, c8.na.e(-2, 32, 17));
                TextView textView2 = new TextView(context);
                this.Y0 = textView2;
                textView2.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
                textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                textView2.setText(gd.N0(2131747085, null));
                textView2.setGravity(16);
                textView2.setTextColor(-1);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                textView2.setTextSize(1, 16.0f);
                final int i17 = 2;
                textView2.setOnClickListener(new View.OnClickListener() { // from class: hi.o4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i17) {
                            case 0:
                                pa paVar2 = paVar;
                                if (!paVar2.l1) {
                                    if (!paVar2.e2) {
                                        if (!paVar2.u0) {
                                            Runnable runnable = paVar2.v1;
                                            if (runnable != null) {
                                                runnable.run();
                                                break;
                                            }
                                        } else {
                                            paVar2.D0(null, true);
                                            break;
                                        }
                                    } else {
                                        paVar2.u0(true);
                                        break;
                                    }
                                } else {
                                    paVar2.I0(false);
                                    break;
                                }
                                break;
                            case 1:
                                pa paVar3 = paVar;
                                p5 p5Var2 = paVar3.y0;
                                if (p5Var2 != null && (p5Var2.getCurrentBrush() instanceof sg.g)) {
                                    p5Var2.b();
                                    paVar3.U0.setSelectedIndex(1);
                                    paVar3.w((sg.h) sg.h.a.get(0));
                                    break;
                                } else {
                                    paVar3.n0.c();
                                    break;
                                }
                                break;
                            case 2:
                                pa paVar4 = paVar;
                                p5 p5Var3 = paVar4.y0;
                                sg.j1 j1Var2 = paVar4.n0;
                                if (j1Var2.a()) {
                                    if (p5Var3 != null && (p5Var3.getCurrentBrush() instanceof sg.g)) {
                                        p5Var3.b();
                                        paVar4.U0.setSelectedIndex(1);
                                        paVar4.w((sg.h) sg.h.a.get(0));
                                    }
                                    if (p5Var3 != null) {
                                        p5Var3.a();
                                    }
                                    j1Var2.c.clear();
                                    j1Var2.b.clear();
                                    org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var2, 14));
                                    paVar4.B0.removeAllViews();
                                    break;
                                }
                                break;
                            case 3:
                                pa paVar5 = paVar;
                                tg.n nVar = paVar5.t0;
                                if (nVar instanceof tg.q2) {
                                    org.telegram.messenger.g0.v1(((tg.q2) nVar).getFocusedView());
                                }
                                if (paVar5.e2) {
                                    paVar5.u0(false);
                                }
                                paVar5.B0(paVar5.t0);
                                paVar5.D0(null, true);
                                break;
                            default:
                                paVar.D0(null, true);
                                break;
                        }
                    }
                });
                textView2.setAlpha(0.6f);
                TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView2, c8.na.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
                this.Z0 = m10;
                m10.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
                m10.setText(gd.N0(2131752089, null));
                m10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                m10.setGravity(16);
                m10.setTextColor(-1);
                m10.setTypeface(org.telegram.messenger.g0.o());
                m10.setTextSize(1, 16.0f);
                final int i18 = 3;
                m10.setOnClickListener(new View.OnClickListener() { // from class: hi.o4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i18) {
                            case 0:
                                pa paVar2 = paVar;
                                if (!paVar2.l1) {
                                    if (!paVar2.e2) {
                                        if (!paVar2.u0) {
                                            Runnable runnable = paVar2.v1;
                                            if (runnable != null) {
                                                runnable.run();
                                                break;
                                            }
                                        } else {
                                            paVar2.D0(null, true);
                                            break;
                                        }
                                    } else {
                                        paVar2.u0(true);
                                        break;
                                    }
                                } else {
                                    paVar2.I0(false);
                                    break;
                                }
                                break;
                            case 1:
                                pa paVar3 = paVar;
                                p5 p5Var2 = paVar3.y0;
                                if (p5Var2 != null && (p5Var2.getCurrentBrush() instanceof sg.g)) {
                                    p5Var2.b();
                                    paVar3.U0.setSelectedIndex(1);
                                    paVar3.w((sg.h) sg.h.a.get(0));
                                    break;
                                } else {
                                    paVar3.n0.c();
                                    break;
                                }
                                break;
                            case 2:
                                pa paVar4 = paVar;
                                p5 p5Var3 = paVar4.y0;
                                sg.j1 j1Var2 = paVar4.n0;
                                if (j1Var2.a()) {
                                    if (p5Var3 != null && (p5Var3.getCurrentBrush() instanceof sg.g)) {
                                        p5Var3.b();
                                        paVar4.U0.setSelectedIndex(1);
                                        paVar4.w((sg.h) sg.h.a.get(0));
                                    }
                                    if (p5Var3 != null) {
                                        p5Var3.a();
                                    }
                                    j1Var2.c.clear();
                                    j1Var2.b.clear();
                                    org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var2, 14));
                                    paVar4.B0.removeAllViews();
                                    break;
                                }
                                break;
                            case 3:
                                pa paVar5 = paVar;
                                tg.n nVar = paVar5.t0;
                                if (nVar instanceof tg.q2) {
                                    org.telegram.messenger.g0.v1(((tg.q2) nVar).getFocusedView());
                                }
                                if (paVar5.e2) {
                                    paVar5.u0(false);
                                }
                                paVar5.B0(paVar5.t0);
                                paVar5.D0(null, true);
                                break;
                            default:
                                paVar.D0(null, true);
                                break;
                        }
                    }
                });
                m10.setAlpha(0.0f);
                m10.setVisibility(8);
                TextView m11 = org.telegram.ui.Cells.c0.m(frameLayout, m10, c8.na.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
                this.a1 = m11;
                m11.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
                m11.setText(gd.N0(2131751342, null));
                m11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                m11.setGravity(16);
                m11.setTextColor(-1);
                m11.setTypeface(org.telegram.messenger.g0.o());
                m11.setTextSize(1, 16.0f);
                final int i19 = 4;
                m11.setOnClickListener(new View.OnClickListener() { // from class: hi.o4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i19) {
                            case 0:
                                pa paVar2 = paVar;
                                if (!paVar2.l1) {
                                    if (!paVar2.e2) {
                                        if (!paVar2.u0) {
                                            Runnable runnable = paVar2.v1;
                                            if (runnable != null) {
                                                runnable.run();
                                                break;
                                            }
                                        } else {
                                            paVar2.D0(null, true);
                                            break;
                                        }
                                    } else {
                                        paVar2.u0(true);
                                        break;
                                    }
                                } else {
                                    paVar2.I0(false);
                                    break;
                                }
                                break;
                            case 1:
                                pa paVar3 = paVar;
                                p5 p5Var2 = paVar3.y0;
                                if (p5Var2 != null && (p5Var2.getCurrentBrush() instanceof sg.g)) {
                                    p5Var2.b();
                                    paVar3.U0.setSelectedIndex(1);
                                    paVar3.w((sg.h) sg.h.a.get(0));
                                    break;
                                } else {
                                    paVar3.n0.c();
                                    break;
                                }
                                break;
                            case 2:
                                pa paVar4 = paVar;
                                p5 p5Var3 = paVar4.y0;
                                sg.j1 j1Var2 = paVar4.n0;
                                if (j1Var2.a()) {
                                    if (p5Var3 != null && (p5Var3.getCurrentBrush() instanceof sg.g)) {
                                        p5Var3.b();
                                        paVar4.U0.setSelectedIndex(1);
                                        paVar4.w((sg.h) sg.h.a.get(0));
                                    }
                                    if (p5Var3 != null) {
                                        p5Var3.a();
                                    }
                                    j1Var2.c.clear();
                                    j1Var2.b.clear();
                                    org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var2, 14));
                                    paVar4.B0.removeAllViews();
                                    break;
                                }
                                break;
                            case 3:
                                pa paVar5 = paVar;
                                tg.n nVar = paVar5.t0;
                                if (nVar instanceof tg.q2) {
                                    org.telegram.messenger.g0.v1(((tg.q2) nVar).getFocusedView());
                                }
                                if (paVar5.e2) {
                                    paVar5.u0(false);
                                }
                                paVar5.B0(paVar5.t0);
                                paVar5.D0(null, true);
                                break;
                            default:
                                paVar.D0(null, true);
                                break;
                        }
                    }
                });
                m11.setAlpha(0.0f);
                m11.setVisibility(8);
                frameLayout.addView(m11, c8.na.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
                r5 r5Var2 = new r5(paVar, context, e10);
                this.D0 = r5Var2;
                r5Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
                r5Var2.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
                addView(r5Var2, c8.na.e(-1, ks.p1, 80));
                tg.m1 m1Var = new tg.m1(context, (x7Var != null || x7Var.v() || x7Var.u || baVar == null) ? false : true);
                this.U0 = m1Var;
                m1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                m1Var.setDelegate(this);
                m1Var.setSelectedIndex(1);
                r5Var2.addView(m1Var, c8.na.c(48.0f, -1));
                tg.j1 j1Var2 = new tg.j1(context);
                this.V0 = j1Var2;
                j1Var2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                j1Var2.setVisibility(8);
                j1Var2.setDelegate(this);
                final int i20 = 1;
                post(new Runnable() { // from class: hi.p4
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i20) {
                            case 0:
                                pa paVar2 = paVar;
                                sg.g1 g1Var3 = paVar2.k1;
                                paVar2.F0(g1Var3);
                                sg.j0.e(i7).j(g1Var3.c);
                                break;
                            default:
                                paVar.V0.setTypeface(sg.j0.e(i7).j);
                                break;
                        }
                    }
                });
                j1Var2.setAlignment(sg.j0.e(i7).g);
                r5Var2.addView(j1Var2, c8.na.c(48.0f, -1));
                c5 c5Var = new c5(paVar, context, 0);
                this.E0 = c5Var;
                addView(c5Var, c8.na.c(-1.0f, -1));
                tg.o1 o1Var = new tg.o1(context);
                this.W0 = o1Var;
                o1Var.setVisibility(8);
                o1Var.setOnItemClickListener(new bi.n8(paVar, 11));
                j1Var2.setTypefaceListView(o1Var);
                c5Var.addView(o1Var, c8.na.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(352321535);
                paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, n5Var));
                d5 d5Var = new d5(paVar, context);
                this.g1 = d5Var;
                d5Var.setVisibility(8);
                d5Var.setColorPalette(sg.j0.e(i7));
                d5Var.setColorListener(new bi.u8(paVar, 2));
                r5Var2.addView(d5Var, c8.na.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
                setupTabsLayout(context);
                tg.a1 a1Var = new tg.a1(context);
                this.k0 = a1Var;
                a1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                a1Var.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
                r5Var2.addView(a1Var, c8.na.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
                final int i21 = 0;
                a1Var.setOnClickListener(new View.OnClickListener() { // from class: hi.o4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i21) {
                            case 0:
                                pa paVar2 = paVar;
                                if (!paVar2.l1) {
                                    if (!paVar2.e2) {
                                        if (!paVar2.u0) {
                                            Runnable runnable = paVar2.v1;
                                            if (runnable != null) {
                                                runnable.run();
                                                break;
                                            }
                                        } else {
                                            paVar2.D0(null, true);
                                            break;
                                        }
                                    } else {
                                        paVar2.u0(true);
                                        break;
                                    }
                                } else {
                                    paVar2.I0(false);
                                    break;
                                }
                                break;
                            case 1:
                                pa paVar3 = paVar;
                                p5 p5Var2 = paVar3.y0;
                                if (p5Var2 != null && (p5Var2.getCurrentBrush() instanceof sg.g)) {
                                    p5Var2.b();
                                    paVar3.U0.setSelectedIndex(1);
                                    paVar3.w((sg.h) sg.h.a.get(0));
                                    break;
                                } else {
                                    paVar3.n0.c();
                                    break;
                                }
                                break;
                            case 2:
                                pa paVar4 = paVar;
                                p5 p5Var3 = paVar4.y0;
                                sg.j1 j1Var22 = paVar4.n0;
                                if (j1Var22.a()) {
                                    if (p5Var3 != null && (p5Var3.getCurrentBrush() instanceof sg.g)) {
                                        p5Var3.b();
                                        paVar4.U0.setSelectedIndex(1);
                                        paVar4.w((sg.h) sg.h.a.get(0));
                                    }
                                    if (p5Var3 != null) {
                                        p5Var3.a();
                                    }
                                    j1Var22.c.clear();
                                    j1Var22.b.clear();
                                    org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var22, 14));
                                    paVar4.B0.removeAllViews();
                                    break;
                                }
                                break;
                            case 3:
                                pa paVar5 = paVar;
                                tg.n nVar = paVar5.t0;
                                if (nVar instanceof tg.q2) {
                                    org.telegram.messenger.g0.v1(((tg.q2) nVar).getFocusedView());
                                }
                                if (paVar5.e2) {
                                    paVar5.u0(false);
                                }
                                paVar5.B0(paVar5.t0);
                                paVar5.D0(null, true);
                                break;
                            default:
                                paVar.D0(null, true);
                                break;
                        }
                    }
                });
                tg.e1 e1Var = new tg.e1(context);
                this.l0 = e1Var;
                e1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                e1Var.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
                e1Var.setOnClickListener(new ah.h(paVar, context, e10, 15));
                r5Var2.addView(e1Var, c8.na.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
                tg.r1 r1Var = new tg.r1(context);
                this.N0 = r1Var;
                sg.g1 g1Var3 = g1Var;
                r1Var.setColorSwatch(g1Var3);
                r1Var.setRenderView(p5Var);
                r1Var.setValueOverride(oVar);
                g1Var3.c = oVar.get();
                final int i22 = 0;
                r1Var.setOnUpdate(new Runnable() { // from class: hi.p4
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i22) {
                            case 0:
                                pa paVar2 = paVar;
                                sg.g1 g1Var32 = paVar2.k1;
                                paVar2.F0(g1Var32);
                                sg.j0.e(i7).j(g1Var32.c);
                                break;
                            default:
                                paVar.V0.setTypeface(sg.j0.e(i7).j);
                                break;
                        }
                    }
                });
                addView(r1Var, c8.na.c(-1.0f, -1));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.F0 = frameLayout2;
                addView(frameLayout2, c8.na.c(-1.0f, -1));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                E0(g1Var3, null, false);
                w((sg.h) sg.h.a.get(0));
                updateColors();
                if (Build.VERSION.SDK_INT < 29) {
                    Point point = org.telegram.messenger.g0.q;
                    i14 = 1;
                    setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
                } else {
                    i14 = 1;
                }
                this.y1 = new e5(paVar, mbVar, new ai.s1(17, paVar, mbVar));
                r2.D1 = i14;
            }
        }
        i13 = 0;
        n5 n5Var2 = new n5(i13, i6Var);
        this.q1 = n5Var2;
        this.p0 = weVar;
        this.x0 = context instanceof BubbleActivity;
        sg.j0 e102 = sg.j0.e(i7);
        e102.i(i13, true);
        g1Var2.a = e102.c();
        g1Var2.c = e102.i;
        org.telegram.messenger.r5 r5Var3 = new org.telegram.messenger.r5("Paint", true);
        this.o0 = r5Var3;
        this.m0 = bitmap;
        this.P0 = i10;
        sg.j1 j1Var3 = new sg.j1();
        this.n0 = j1Var3;
        j1Var3.a = new di.v6(paVar, 23);
        View view2 = new View(context);
        this.H0 = view2;
        view2.setVisibility(8);
        view2.setBackgroundColor(1291845632);
        view2.setAlpha(0.0f);
        sg.h0 h0Var2 = new sg.h0(getPaintingSize(), null, i10, baVar);
        if (x7Var == null) {
        }
        g1Var = g1Var2;
        baVar2 = baVar;
        int i152 = 1;
        p5 p5Var2 = new p5(paVar, context, h0Var2, bitmap, bitmap2, baVar2);
        this.y0 = p5Var2;
        p5Var2.setDelegate(new u0(paVar, i152));
        p5Var2.setUndoStore(j1Var3);
        p5Var2.setQueue(r5Var3);
        p5Var2.setVisibility(4);
        bi.o3 o3Var2 = new bi.o3(2, context, paVar);
        this.z0 = o3Var2;
        o3Var2.setVisibility(4);
        q5 q5Var2 = new q5(paVar, context, new f5(paVar));
        this.B0 = q5Var2;
        this.z1 = x7Var;
        this.A1 = arrayList;
        if (this.B1 > 0) {
            H0();
        }
        q5Var2.setVisibility(4);
        this.A0 = new c5(paVar, context, 1);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.C0 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation2 = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout3.setBackground(new GradientDrawable(orientation2, new int[]{TLObject.FLAG_30, 0}));
        addView(frameLayout3, c8.na.e(-1, -2, 48));
        ImageView imageView2 = new ImageView(context);
        this.X0 = imageView2;
        imageView2.setImageResource(R.drawable.photo_undo2);
        imageView2.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        final int i162 = 1;
        imageView2.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: hi.o4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i162) {
                    case 0:
                        pa paVar2 = paVar;
                        if (!paVar2.l1) {
                            if (!paVar2.e2) {
                                if (!paVar2.u0) {
                                    Runnable runnable = paVar2.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    paVar2.D0(null, true);
                                    break;
                                }
                            } else {
                                paVar2.u0(true);
                                break;
                            }
                        } else {
                            paVar2.I0(false);
                            break;
                        }
                        break;
                    case 1:
                        pa paVar3 = paVar;
                        p5 p5Var22 = paVar3.y0;
                        if (p5Var22 != null && (p5Var22.getCurrentBrush() instanceof sg.g)) {
                            p5Var22.b();
                            paVar3.U0.setSelectedIndex(1);
                            paVar3.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            paVar3.n0.c();
                            break;
                        }
                        break;
                    case 2:
                        pa paVar4 = paVar;
                        p5 p5Var3 = paVar4.y0;
                        sg.j1 j1Var22 = paVar4.n0;
                        if (j1Var22.a()) {
                            if (p5Var3 != null && (p5Var3.getCurrentBrush() instanceof sg.g)) {
                                p5Var3.b();
                                paVar4.U0.setSelectedIndex(1);
                                paVar4.w((sg.h) sg.h.a.get(0));
                            }
                            if (p5Var3 != null) {
                                p5Var3.a();
                            }
                            j1Var22.c.clear();
                            j1Var22.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var22, 14));
                            paVar4.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        pa paVar5 = paVar;
                        tg.n nVar = paVar5.t0;
                        if (nVar instanceof tg.q2) {
                            org.telegram.messenger.g0.v1(((tg.q2) nVar).getFocusedView());
                        }
                        if (paVar5.e2) {
                            paVar5.u0(false);
                        }
                        paVar5.B0(paVar5.t0);
                        paVar5.D0(null, true);
                        break;
                    default:
                        paVar.D0(null, true);
                        break;
                }
            }
        });
        imageView2.setAlpha(0.6f);
        imageView2.setClickable(false);
        frameLayout3.addView(imageView2, c8.na.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
        linearLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 16.0f);
        textView3.setText(gd.N0(2131747073, null));
        linearLayout2.addView(m10.e(context, R.drawable.photo_zoomout), c8.na.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout2.addView(textView3, c8.na.r(-2, -2, 16));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setOnClickListener(new bi.o(8));
        frameLayout3.addView(linearLayout2, c8.na.e(-2, 32, 17));
        TextView textView22 = new TextView(context);
        this.Y0 = textView22;
        textView22.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
        textView22.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView22.setText(gd.N0(2131747085, null));
        textView22.setGravity(16);
        textView22.setTextColor(-1);
        textView22.setTypeface(org.telegram.messenger.g0.o());
        textView22.setTextSize(1, 16.0f);
        final int i172 = 2;
        textView22.setOnClickListener(new View.OnClickListener() { // from class: hi.o4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i172) {
                    case 0:
                        pa paVar2 = paVar;
                        if (!paVar2.l1) {
                            if (!paVar2.e2) {
                                if (!paVar2.u0) {
                                    Runnable runnable = paVar2.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    paVar2.D0(null, true);
                                    break;
                                }
                            } else {
                                paVar2.u0(true);
                                break;
                            }
                        } else {
                            paVar2.I0(false);
                            break;
                        }
                        break;
                    case 1:
                        pa paVar3 = paVar;
                        p5 p5Var22 = paVar3.y0;
                        if (p5Var22 != null && (p5Var22.getCurrentBrush() instanceof sg.g)) {
                            p5Var22.b();
                            paVar3.U0.setSelectedIndex(1);
                            paVar3.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            paVar3.n0.c();
                            break;
                        }
                        break;
                    case 2:
                        pa paVar4 = paVar;
                        p5 p5Var3 = paVar4.y0;
                        sg.j1 j1Var22 = paVar4.n0;
                        if (j1Var22.a()) {
                            if (p5Var3 != null && (p5Var3.getCurrentBrush() instanceof sg.g)) {
                                p5Var3.b();
                                paVar4.U0.setSelectedIndex(1);
                                paVar4.w((sg.h) sg.h.a.get(0));
                            }
                            if (p5Var3 != null) {
                                p5Var3.a();
                            }
                            j1Var22.c.clear();
                            j1Var22.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var22, 14));
                            paVar4.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        pa paVar5 = paVar;
                        tg.n nVar = paVar5.t0;
                        if (nVar instanceof tg.q2) {
                            org.telegram.messenger.g0.v1(((tg.q2) nVar).getFocusedView());
                        }
                        if (paVar5.e2) {
                            paVar5.u0(false);
                        }
                        paVar5.B0(paVar5.t0);
                        paVar5.D0(null, true);
                        break;
                    default:
                        paVar.D0(null, true);
                        break;
                }
            }
        });
        textView22.setAlpha(0.6f);
        TextView m102 = org.telegram.ui.Cells.c0.m(frameLayout3, textView22, c8.na.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.Z0 = m102;
        m102.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
        m102.setText(gd.N0(2131752089, null));
        m102.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m102.setGravity(16);
        m102.setTextColor(-1);
        m102.setTypeface(org.telegram.messenger.g0.o());
        m102.setTextSize(1, 16.0f);
        final int i182 = 3;
        m102.setOnClickListener(new View.OnClickListener() { // from class: hi.o4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i182) {
                    case 0:
                        pa paVar2 = paVar;
                        if (!paVar2.l1) {
                            if (!paVar2.e2) {
                                if (!paVar2.u0) {
                                    Runnable runnable = paVar2.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    paVar2.D0(null, true);
                                    break;
                                }
                            } else {
                                paVar2.u0(true);
                                break;
                            }
                        } else {
                            paVar2.I0(false);
                            break;
                        }
                        break;
                    case 1:
                        pa paVar3 = paVar;
                        p5 p5Var22 = paVar3.y0;
                        if (p5Var22 != null && (p5Var22.getCurrentBrush() instanceof sg.g)) {
                            p5Var22.b();
                            paVar3.U0.setSelectedIndex(1);
                            paVar3.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            paVar3.n0.c();
                            break;
                        }
                        break;
                    case 2:
                        pa paVar4 = paVar;
                        p5 p5Var3 = paVar4.y0;
                        sg.j1 j1Var22 = paVar4.n0;
                        if (j1Var22.a()) {
                            if (p5Var3 != null && (p5Var3.getCurrentBrush() instanceof sg.g)) {
                                p5Var3.b();
                                paVar4.U0.setSelectedIndex(1);
                                paVar4.w((sg.h) sg.h.a.get(0));
                            }
                            if (p5Var3 != null) {
                                p5Var3.a();
                            }
                            j1Var22.c.clear();
                            j1Var22.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var22, 14));
                            paVar4.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        pa paVar5 = paVar;
                        tg.n nVar = paVar5.t0;
                        if (nVar instanceof tg.q2) {
                            org.telegram.messenger.g0.v1(((tg.q2) nVar).getFocusedView());
                        }
                        if (paVar5.e2) {
                            paVar5.u0(false);
                        }
                        paVar5.B0(paVar5.t0);
                        paVar5.D0(null, true);
                        break;
                    default:
                        paVar.D0(null, true);
                        break;
                }
            }
        });
        m102.setAlpha(0.0f);
        m102.setVisibility(8);
        TextView m112 = org.telegram.ui.Cells.c0.m(frameLayout3, m102, c8.na.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.a1 = m112;
        m112.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
        m112.setText(gd.N0(2131751342, null));
        m112.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m112.setGravity(16);
        m112.setTextColor(-1);
        m112.setTypeface(org.telegram.messenger.g0.o());
        m112.setTextSize(1, 16.0f);
        final int i192 = 4;
        m112.setOnClickListener(new View.OnClickListener() { // from class: hi.o4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i192) {
                    case 0:
                        pa paVar2 = paVar;
                        if (!paVar2.l1) {
                            if (!paVar2.e2) {
                                if (!paVar2.u0) {
                                    Runnable runnable = paVar2.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    paVar2.D0(null, true);
                                    break;
                                }
                            } else {
                                paVar2.u0(true);
                                break;
                            }
                        } else {
                            paVar2.I0(false);
                            break;
                        }
                        break;
                    case 1:
                        pa paVar3 = paVar;
                        p5 p5Var22 = paVar3.y0;
                        if (p5Var22 != null && (p5Var22.getCurrentBrush() instanceof sg.g)) {
                            p5Var22.b();
                            paVar3.U0.setSelectedIndex(1);
                            paVar3.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            paVar3.n0.c();
                            break;
                        }
                        break;
                    case 2:
                        pa paVar4 = paVar;
                        p5 p5Var3 = paVar4.y0;
                        sg.j1 j1Var22 = paVar4.n0;
                        if (j1Var22.a()) {
                            if (p5Var3 != null && (p5Var3.getCurrentBrush() instanceof sg.g)) {
                                p5Var3.b();
                                paVar4.U0.setSelectedIndex(1);
                                paVar4.w((sg.h) sg.h.a.get(0));
                            }
                            if (p5Var3 != null) {
                                p5Var3.a();
                            }
                            j1Var22.c.clear();
                            j1Var22.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var22, 14));
                            paVar4.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        pa paVar5 = paVar;
                        tg.n nVar = paVar5.t0;
                        if (nVar instanceof tg.q2) {
                            org.telegram.messenger.g0.v1(((tg.q2) nVar).getFocusedView());
                        }
                        if (paVar5.e2) {
                            paVar5.u0(false);
                        }
                        paVar5.B0(paVar5.t0);
                        paVar5.D0(null, true);
                        break;
                    default:
                        paVar.D0(null, true);
                        break;
                }
            }
        });
        m112.setAlpha(0.0f);
        m112.setVisibility(8);
        frameLayout3.addView(m112, c8.na.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        r5 r5Var22 = new r5(paVar, context, e102);
        this.D0 = r5Var22;
        r5Var22.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        r5Var22.setBackground(new GradientDrawable(orientation2, new int[]{0, TLObject.FLAG_31}));
        addView(r5Var22, c8.na.e(-1, ks.p1, 80));
        tg.m1 m1Var2 = new tg.m1(context, (x7Var != null || x7Var.v() || x7Var.u || baVar == null) ? false : true);
        this.U0 = m1Var2;
        m1Var2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        m1Var2.setDelegate(this);
        m1Var2.setSelectedIndex(1);
        r5Var22.addView(m1Var2, c8.na.c(48.0f, -1));
        tg.j1 j1Var22 = new tg.j1(context);
        this.V0 = j1Var22;
        j1Var22.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        j1Var22.setVisibility(8);
        j1Var22.setDelegate(this);
        final int i202 = 1;
        post(new Runnable() { // from class: hi.p4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i202) {
                    case 0:
                        pa paVar2 = paVar;
                        sg.g1 g1Var32 = paVar2.k1;
                        paVar2.F0(g1Var32);
                        sg.j0.e(i7).j(g1Var32.c);
                        break;
                    default:
                        paVar.V0.setTypeface(sg.j0.e(i7).j);
                        break;
                }
            }
        });
        j1Var22.setAlignment(sg.j0.e(i7).g);
        r5Var22.addView(j1Var22, c8.na.c(48.0f, -1));
        c5 c5Var2 = new c5(paVar, context, 0);
        this.E0 = c5Var2;
        addView(c5Var2, c8.na.c(-1.0f, -1));
        tg.o1 o1Var2 = new tg.o1(context);
        this.W0 = o1Var2;
        o1Var2.setVisibility(8);
        o1Var2.setOnItemClickListener(new bi.n8(paVar, 11));
        j1Var22.setTypefaceListView(o1Var2);
        c5Var2.addView(o1Var2, c8.na.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, n5Var2));
        d5 d5Var2 = new d5(paVar, context);
        this.g1 = d5Var2;
        d5Var2.setVisibility(8);
        d5Var2.setColorPalette(sg.j0.e(i7));
        d5Var2.setColorListener(new bi.u8(paVar, 2));
        r5Var22.addView(d5Var2, c8.na.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        tg.a1 a1Var2 = new tg.a1(context);
        this.k0 = a1Var2;
        a1Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        a1Var2.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        r5Var22.addView(a1Var2, c8.na.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        final int i212 = 0;
        a1Var2.setOnClickListener(new View.OnClickListener() { // from class: hi.o4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i212) {
                    case 0:
                        pa paVar2 = paVar;
                        if (!paVar2.l1) {
                            if (!paVar2.e2) {
                                if (!paVar2.u0) {
                                    Runnable runnable = paVar2.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    paVar2.D0(null, true);
                                    break;
                                }
                            } else {
                                paVar2.u0(true);
                                break;
                            }
                        } else {
                            paVar2.I0(false);
                            break;
                        }
                        break;
                    case 1:
                        pa paVar3 = paVar;
                        p5 p5Var22 = paVar3.y0;
                        if (p5Var22 != null && (p5Var22.getCurrentBrush() instanceof sg.g)) {
                            p5Var22.b();
                            paVar3.U0.setSelectedIndex(1);
                            paVar3.w((sg.h) sg.h.a.get(0));
                            break;
                        } else {
                            paVar3.n0.c();
                            break;
                        }
                        break;
                    case 2:
                        pa paVar4 = paVar;
                        p5 p5Var3 = paVar4.y0;
                        sg.j1 j1Var222 = paVar4.n0;
                        if (j1Var222.a()) {
                            if (p5Var3 != null && (p5Var3.getCurrentBrush() instanceof sg.g)) {
                                p5Var3.b();
                                paVar4.U0.setSelectedIndex(1);
                                paVar4.w((sg.h) sg.h.a.get(0));
                            }
                            if (p5Var3 != null) {
                                p5Var3.a();
                            }
                            j1Var222.c.clear();
                            j1Var222.b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var222, 14));
                            paVar4.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        pa paVar5 = paVar;
                        tg.n nVar = paVar5.t0;
                        if (nVar instanceof tg.q2) {
                            org.telegram.messenger.g0.v1(((tg.q2) nVar).getFocusedView());
                        }
                        if (paVar5.e2) {
                            paVar5.u0(false);
                        }
                        paVar5.B0(paVar5.t0);
                        paVar5.D0(null, true);
                        break;
                    default:
                        paVar.D0(null, true);
                        break;
                }
            }
        });
        tg.e1 e1Var2 = new tg.e1(context);
        this.l0 = e1Var2;
        e1Var2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        e1Var2.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        e1Var2.setOnClickListener(new ah.h(paVar, context, e102, 15));
        r5Var22.addView(e1Var2, c8.na.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        tg.r1 r1Var2 = new tg.r1(context);
        this.N0 = r1Var2;
        sg.g1 g1Var32 = g1Var;
        r1Var2.setColorSwatch(g1Var32);
        r1Var2.setRenderView(p5Var2);
        r1Var2.setValueOverride(oVar);
        g1Var32.c = oVar.get();
        final int i222 = 0;
        r1Var2.setOnUpdate(new Runnable() { // from class: hi.p4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i222) {
                    case 0:
                        pa paVar2 = paVar;
                        sg.g1 g1Var322 = paVar2.k1;
                        paVar2.F0(g1Var322);
                        sg.j0.e(i7).j(g1Var322.c);
                        break;
                    default:
                        paVar.V0.setTypeface(sg.j0.e(i7).j);
                        break;
                }
            }
        });
        addView(r1Var2, c8.na.c(-1.0f, -1));
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.F0 = frameLayout22;
        addView(frameLayout22, c8.na.c(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        E0(g1Var32, null, false);
        w((sg.h) sg.h.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT < 29) {
        }
        this.y1 = new e5(paVar, mbVar, new ai.s1(17, paVar, mbVar));
        r2.D1 = i14;
    }

    public static void G0(tg.q2 q2Var, int i7) {
        q2Var.setAlign(i7);
        int i10 = 2;
        q2Var.getEditText().setGravity(i7 != 1 ? i7 != 2 ? 19 : 21 : 17);
        if (i7 == 1) {
            i10 = 4;
        } else if (i7 == 2 ? !gd.a0 : gd.a0) {
            i10 = 3;
        }
        q2Var.getEditText().setTextAlignment(i10);
    }

    public static /* synthetic */ void X(pa paVar, Integer num) {
        paVar.setNewColor(num.intValue());
        paVar.I0(false);
    }

    public static void Y(pa paVar, sg.j0 j0Var, Integer num) {
        j0Var.h(num.intValue(), true);
        j0Var.g();
        paVar.setNewColor(num.intValue());
        paVar.g1.setSelectedColorIndex(j0Var.d());
        paVar.D1 = null;
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

    private xt0 getPaintingSize() {
        xt0 xt0Var = this.r0;
        if (xt0Var != null) {
            return xt0Var;
        }
        xt0 xt0Var2 = new xt0(1080.0f, 1920.0f);
        this.r0 = xt0Var2;
        return xt0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i7 = 0;
        while (true) {
            q5 q5Var = this.B0;
            if (i7 >= q5Var.getChildCount()) {
                return;
            }
            View childAt = q5Var.getChildAt(i7);
            if (childAt instanceof tg.j2) {
                ImageReceiver imageReceiver = ((tg.j2) childAt).z0;
                nh0 C = imageReceiver.C();
                org.telegram.ui.Components.b6 m10 = imageReceiver.m();
                boolean z11 = !z10;
                imageReceiver.v0 = z11;
                imageReceiver.u0 = z11;
                if (C != null) {
                    if (z10) {
                        C.stop();
                    } else {
                        C.start();
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
        sg.g1 g1Var = this.k1;
        int i10 = g1Var.a;
        g1Var.a = i7;
        E0(g1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new q4(this, i10, i7, 0));
        duration.start();
    }

    private void setTextType(int i7) {
        this.v0 = i7;
        tg.n nVar = this.t0;
        if (nVar instanceof tg.q2) {
            ((tg.q2) nVar).setType(i7);
        }
        sg.j0 e10 = sg.j0.e(this.p1);
        e10.h = i7;
        e10.a.edit().putInt("text_type", i7).apply();
        this.V0.e(i7, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextWeightRange(tg.n nVar) {
        boolean z10 = nVar instanceof tg.d;
        tg.r1 r1Var = this.N0;
        if (z10) {
            r1Var.b(0.3f, 1.1f);
        } else {
            r1Var.b(0.5f, 2.0f);
        }
    }

    private void setupTabsLayout(Context context) {
        i5 i5Var = new i5(this, context);
        this.G0 = i5Var;
        final int i7 = 0;
        i5Var.setClipToPadding(false);
        this.G0.setOrientation(0);
        this.D0.addView(this.G0, c8.na.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.R0 = textView;
        textView.setText(gd.N0(2131747083, null).toUpperCase());
        TextView textView2 = this.R0;
        int i10 = org.telegram.ui.ActionBar.n6.i6;
        n5 n5Var = this.q1;
        org.telegram.ui.ActionBar.u6.Q(textView2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, n5Var), 7, -1), null, org.telegram.ui.ActionBar.u6.M(i10), n5Var);
        this.R0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.R0.setTextColor(-1);
        final int i11 = 1;
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(org.telegram.messenger.g0.o());
        this.R0.setSingleLine();
        this.R0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.i4
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        v5 v5Var = this.b;
                        if (!v5Var.u0) {
                            v5Var.R0(0);
                            break;
                        } else {
                            v5Var.D0(null, true);
                            break;
                        }
                    case 1:
                        this.b.z0();
                        break;
                    default:
                        v5 v5Var2 = this.b;
                        v5Var2.R0(2);
                        if (!(v5Var2.t0 instanceof tg.q2)) {
                            v5Var2.Z1 = true;
                            v5Var2.n0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.G0.addView(this.R0, c8.na.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.S0 = textView3;
        textView3.setText(gd.N0(2131747082, null).toUpperCase());
        org.telegram.ui.ActionBar.u6.Q(this.S0, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, n5Var), 7, -1), null, org.telegram.ui.ActionBar.u6.M(i10), n5Var);
        this.S0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.i4
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        v5 v5Var = this.b;
                        if (!v5Var.u0) {
                            v5Var.R0(0);
                            break;
                        } else {
                            v5Var.D0(null, true);
                            break;
                        }
                    case 1:
                        this.b.z0();
                        break;
                    default:
                        v5 v5Var2 = this.b;
                        v5Var2.R0(2);
                        if (!(v5Var2.t0 instanceof tg.q2)) {
                            v5Var2.Z1 = true;
                            v5Var2.n0(true);
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
        this.G0.addView(this.S0, c8.na.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.T0 = textView4;
        textView4.setText(gd.N0(2131747081, null).toUpperCase());
        org.telegram.ui.ActionBar.u6.Q(this.T0, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, n5Var), 7, -1), null, org.telegram.ui.ActionBar.u6.M(i10), n5Var);
        this.T0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.T0.setTextColor(-1);
        this.T0.setTextSize(1, 14.0f);
        this.T0.setGravity(1);
        this.T0.setTypeface(org.telegram.messenger.g0.o());
        this.T0.setAlpha(0.6f);
        this.T0.setSingleLine();
        final int i12 = 2;
        this.T0.setOnClickListener(new View.OnClickListener(this) { // from class: hi.i4
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        v5 v5Var = this.b;
                        if (!v5Var.u0) {
                            v5Var.R0(0);
                            break;
                        } else {
                            v5Var.D0(null, true);
                            break;
                        }
                    case 1:
                        this.b.z0();
                        break;
                    default:
                        v5 v5Var2 = this.b;
                        v5Var2.R0(2);
                        if (!(v5Var2.t0 instanceof tg.q2)) {
                            v5Var2.Z1 = true;
                            v5Var2.n0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.G0.addView(this.T0, c8.na.l(1.0f, 0, -2));
    }

    public static boolean w0(TLRPC.Document document) {
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

    @Override // tg.l1
    public final void A() {
        N0(new s4(this, 4), this, 53, 0, getHeight(), false);
    }

    public final void A0(tg.n nVar) {
        this.n0.b(nVar.getUUID(), new r4(this, nVar, 0));
    }

    public final void B0(tg.n nVar) {
        tg.n nVar2 = this.t0;
        if (nVar == nVar2 && nVar2 != null) {
            nVar2.l(nVar2.o0, false);
            D0(null, true);
            if (nVar instanceof tg.q2) {
                ValueAnimator valueAnimator = this.L0;
                if (valueAnimator != null && this.J0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.B0.removeView(nVar);
        e0();
        if (nVar != null) {
            UUID uuid = nVar.getUUID();
            sg.j1 j1Var = this.n0;
            j1Var.b.remove(uuid);
            j1Var.c.remove(uuid);
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(j1Var, 14));
        }
        tg.r1 r1Var = this.N0;
        h6.o oVar = this.O0;
        r1Var.setValueOverride(oVar);
        r1Var.setShowPreview(true);
        float f10 = oVar.get();
        sg.g1 g1Var = this.k1;
        g1Var.c = f10;
        E0(g1Var, null, false);
        if (this.b2 || !(nVar instanceof tg.w1)) {
            return;
        }
        nb nbVar = ((pa) this).o2;
        bb bbVar = nbVar.Y0;
        if (bbVar != null) {
            bbVar.s(null, null, true);
        }
        pa paVar = nbVar.w1;
        if (paVar != null) {
            paVar.p0();
        }
        db dbVar = nbVar.d1;
        if (dbVar != null) {
            dbVar.setHasRoundVideo(false);
        }
        x7 x7Var = nbVar.L1;
        if (x7Var != null) {
            File file = x7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                nbVar.L1.o0 = null;
            }
            if (nbVar.L1.p0 != null) {
                try {
                    new File(nbVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                nbVar.L1.p0 = null;
            }
        }
    }

    public final void C0() {
        D0(null, true);
    }

    @Override // tg.h1
    public final void D() {
        P0(true);
    }

    public final boolean D0(tg.n nVar, boolean z10) {
        boolean z11;
        xb xbVar;
        xb xbVar2;
        xi0 xi0Var;
        int i7;
        boolean z12 = nVar instanceof tg.q2;
        int i10 = 2;
        if (z12 && (((i7 = this.J0) == -1 && this.I0 != 2) || (i7 != -1 && i7 != 2))) {
            ValueAnimator valueAnimator = this.L0;
            if (valueAnimator != null && i7 != 2) {
                valueAnimator.cancel();
            }
            if (this.l1) {
                I0(false);
            }
            R0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            tg.q2 q2Var = (tg.q2) nVar;
            int gravity = q2Var.getEditText().getGravity();
            if (gravity == 17) {
                i10 = 1;
            } else if (gravity != 21) {
                i10 = 0;
            }
            tg.j1 j1Var = this.V0;
            j1Var.setAlignment(i10);
            sg.a0 typeface = q2Var.getTypeface();
            if (typeface != null) {
                j1Var.setTypeface(typeface.a);
            }
            j1Var.e(q2Var.getType(), true);
            this.E0.invalidate();
        }
        tg.n nVar2 = this.t0;
        if (nVar2 == null) {
            z11 = false;
        } else {
            if (nVar2 == nVar) {
                if (!nVar.f0) {
                    if (nVar instanceof tg.s0) {
                        tg.s0 s0Var = (tg.s0) nVar;
                        s0Var.setType((s0Var.getType() + 1) % s0Var.getTypesCount());
                        return true;
                    }
                    if (nVar instanceof tg.r2) {
                        tg.r2 r2Var = (tg.r2) nVar;
                        r2Var.setType((r2Var.getType() + 1) % r2Var.getTypesCount());
                        return true;
                    }
                    if (nVar instanceof tg.p0) {
                        tg.p0 p0Var = (tg.p0) nVar;
                        tg.n0 n0Var = p0Var.s0;
                        if (n0Var.e()) {
                            n0Var.setPreviewType(n0Var.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        p0Var.setType(p0Var.getNextType());
                        return true;
                    }
                    if (!this.u0) {
                        if (nVar instanceof tg.q2) {
                            this.w0 = true;
                            q0();
                            return true;
                        }
                        if (!(nVar instanceof tg.v1)) {
                            M0(nVar2);
                            return true;
                        }
                        tg.v1 v1Var = (tg.v1) nVar;
                        if (this.M1 && this.K1 == nVar) {
                            v1Var.q(true);
                            return true;
                        }
                        tg.v1 v1Var2 = this.K1;
                        if (v1Var2 != null && v1Var2 != v1Var && (xi0Var = this.J1) != null) {
                            xi0Var.animate().alpha(0.0f).setListener(new ai.g0(xi0Var, 22));
                            this.J1 = null;
                            this.M1 = false;
                            this.L1 = 0.0f;
                        }
                        if (this.J1 == null) {
                            xi0 xi0Var2 = new xi0(2, this.p1, getContext(), LaunchActivity.Q(), new fi.g2(6, new fi.b()));
                            this.J1 = xi0Var2;
                            org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(this.O1, xi0Var2, 0, false);
                            this.J1.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                            this.w1.addView(this.J1, c8.na.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.a.o(-16777216, 120));
                            this.J1.setDelegate(new a8.r7(this, faVar, paint));
                            this.J1.p(null, null, true);
                        }
                        this.J1.setFragment(LaunchActivity.Q());
                        this.K1 = v1Var;
                        O0(true);
                        return true;
                    }
                    if (nVar2 instanceof tg.q2) {
                        org.telegram.messenger.g0.I3(((tg.q2) nVar2).getFocusedView());
                        u0(false);
                    }
                }
                return true;
            }
            nVar2.l(nVar2.o0, false);
            tg.n nVar3 = this.t0;
            if (nVar3 instanceof tg.q2) {
                ((tg.q2) nVar3).r();
                if (!z12) {
                    this.u0 = false;
                    org.telegram.messenger.g0.v1(((tg.q2) this.t0).getFocusedView());
                    u0(false);
                }
            } else if ((nVar3 instanceof tg.w1) && (xbVar2 = ((pa) this).o2.a1) != null) {
                xbVar2.l(false);
            }
            z11 = true;
        }
        tg.n nVar4 = this.t0;
        this.t0 = nVar;
        if ((nVar4 instanceof tg.q2) && TextUtils.isEmpty(((tg.q2) nVar4).getText()) && !(nVar4 instanceof tg.d)) {
            B0(nVar4);
        }
        tg.n nVar5 = this.t0;
        if (nVar4 != nVar5 && (nVar5 instanceof tg.w1) && (xbVar = ((pa) this).o2.a1) != null) {
            xbVar.l(true);
        }
        tg.n nVar6 = this.t0;
        h6.o oVar = this.O0;
        sg.g1 g1Var = this.k1;
        tg.r1 r1Var = this.N0;
        if (nVar6 != null) {
            c5 c5Var = this.A0;
            nVar6.o0 = c5Var;
            nVar6.l(c5Var, true);
            tg.n nVar7 = this.t0;
            if (nVar7 instanceof tg.q2) {
                tg.q2 q2Var2 = (tg.q2) nVar7;
                q2Var2.getSwatch().c = g1Var.c;
                q2Var2.B0 = false;
                F0(q2Var2.getSwatch());
                float f10 = (int) (this.r0.a / 9.0f);
                setTextWeightRange(q2Var2);
                r1Var.setValueOverride(new g5(q2Var2, f10, 0));
                r1Var.setShowPreview(false);
            } else {
                r1Var.setValueOverride(oVar);
                r1Var.setShowPreview(true);
                g1Var.c = oVar.get();
                E0(g1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.L0;
            if (valueAnimator2 != null && this.J0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.l1) {
                I0(false);
            }
            R0(0);
            r1Var.setValueOverride(oVar);
            r1Var.setShowPreview(true);
            g1Var.c = oVar.get();
            E0(g1Var, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    public final void E0(sg.g1 g1Var, Integer num, boolean z10) {
        sg.g1 g1Var2 = this.k1;
        if (g1Var2 != g1Var) {
            g1Var2.a = g1Var.a;
            g1Var2.b = g1Var.b;
            g1Var2.c = g1Var.c;
            int i7 = this.p1;
            sg.j0.e(i7).h(g1Var.a, true);
            sg.j0.e(i7).j(g1Var.c);
        }
        int i10 = g1Var.a;
        p5 p5Var = this.y0;
        p5Var.setColor(i10);
        p5Var.setBrushSize(g1Var.c);
        int i11 = g1Var2.a;
        int i12 = 0;
        if (num == null || num.intValue() == i11) {
            r5 r5Var = this.D0;
            if (r5Var != null) {
                r5Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new j4(this, num, i11, i12));
            duration.start();
        }
        tg.n nVar = this.t0;
        if (nVar instanceof tg.q2) {
            if (this.T1) {
                return;
            }
            ((tg.q2) nVar).setSwatch(new sg.g1(g1Var.b, g1Var.c, g1Var.a));
            return;
        }
        if (z10 && (nVar instanceof tg.s0)) {
            ((tg.s0) nVar).setColor(g1Var.a);
            ((tg.s0) this.t0).setType(3);
        } else if (z10 && (nVar instanceof tg.r2)) {
            ((tg.r2) nVar).setColor(g1Var.a);
            ((tg.r2) this.t0).setType(3);
        } else if (z10 && (nVar instanceof tg.p0)) {
            ((tg.p0) nVar).setColor(g1Var.a);
            ((tg.p0) this.t0).setType(0);
        }
    }

    public final void F0(sg.g1 g1Var) {
        E0(g1Var, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View, android.view.ViewGroup, hi.q5] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    public final void H0() {
        int i7;
        b20 b20Var;
        float f10;
        tg.n nVar;
        tg.n nVar2;
        org.telegram.messenger.g6[] g6VarArr;
        tg.n nVar3;
        ArrayList arrayList = this.A1;
        if (arrayList == null) {
            return;
        }
        x7 x7Var = this.z1;
        this.z1 = null;
        this.A1 = null;
        int size = arrayList.size();
        boolean z10 = false;
        tg.d dVar = null;
        int i10 = 0;
        while (true) {
            ?? r15 = this.B0;
            if (i10 >= size) {
                r15.setVisibility(z10 ? 1 : 0);
                return;
            }
            b20 b20Var2 = (b20) arrayList.get(i10);
            byte b10 = b20Var2.a;
            if (b10 == 11) {
                if (dVar != null) {
                    dVar.u(b20Var2.V, b20Var2.W, b20Var2.j, b20Var2.X);
                    i7 = i10;
                    i10 = i7 + 1;
                    z10 = false;
                } else {
                    tg.d g02 = g0();
                    g02.setType(b20Var2.b);
                    g02.setTypeface(b20Var2.n);
                    g02.setBaseFontSize(b20Var2.m);
                    G0(g02, b20Var2.p);
                    sg.g1 swatch = g02.getSwatch();
                    swatch.a = b20Var2.l;
                    g02.setSwatch(swatch);
                    g02.u(b20Var2.V, b20Var2.W, b20Var2.j, b20Var2.X);
                    f10 = 1.0f;
                    i7 = i10;
                    dVar = g02;
                    nVar3 = g02;
                    b20Var = b20Var2;
                    nVar = nVar3;
                }
            } else if (b10 == 0) {
                m5 m0 = m0(b20Var2.C, b20Var2.B);
                if ((b20Var2.b & 2) != 0) {
                    m0.r(z10);
                }
                ViewGroup.LayoutParams layoutParams = m0.getLayoutParams();
                layoutParams.width = b20Var2.q;
                layoutParams.height = b20Var2.r;
                f10 = 1.0f;
                i7 = i10;
                nVar3 = m0;
                b20Var = b20Var2;
                nVar = nVar3;
            } else {
                if (b10 == 1) {
                    tg.q2 n02 = n0(z10);
                    n02.setType(b20Var2.b);
                    n02.setTypeface(b20Var2.n);
                    n02.setBaseFontSize(b20Var2.m);
                    SpannableString spannableString = new SpannableString(b20Var2.j);
                    ArrayList arrayList2 = b20Var2.k;
                    int size2 = arrayList2.size();
                    ?? r32 = arrayList2;
                    for (?? r62 = z10; r62 < size2; r62++) {
                        a20 a20Var = (a20) r32.get(r62);
                        Object obj = r32;
                        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(a20Var.document_id, 1.0f, n02.getFontMetricsInt());
                        int i11 = a20Var.offset;
                        spannableString.setSpan(x5Var, i11, a20Var.length + i11, 33);
                        i10 = i10;
                        r32 = obj;
                    }
                    i7 = i10;
                    CharSequence m10 = org.telegram.messenger.j6.m(spannableString, n02.getFontMetricsInt(), false, null, 0);
                    if ((m10 instanceof Spanned) && (g6VarArr = (org.telegram.messenger.g6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.g6.class)) != null) {
                        for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                            g6Var.b = 0.85f;
                        }
                    }
                    n02.setText(m10);
                    G0(n02, b20Var2.p);
                    sg.g1 swatch2 = n02.getSwatch();
                    swatch2.a = b20Var2.l;
                    n02.setSwatch(swatch2);
                    nVar2 = n02;
                } else {
                    i7 = i10;
                    if (b10 == 2) {
                        tg.s1 j02 = j0(b20Var2.j, false);
                        j02.I0 = b20Var2.u;
                        j02.D0 = false;
                        if ((b20Var2.b & 2) != 0) {
                            j02.r(false);
                        }
                        if ((b20Var2.b & 16) != 0) {
                            j02.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = j02.getLayoutParams();
                        layoutParams2.width = b20Var2.q;
                        layoutParams2.height = b20Var2.r;
                        nVar2 = j02;
                    } else if (b10 == 6) {
                        ArrayList arrayList3 = x7Var.v;
                        boolean z11 = x7Var.K;
                        this.Z1 = true;
                        f10 = 1.0f;
                        b20Var = b20Var2;
                        tg.n l5Var = new l5(this, getContext(), d0(), arrayList3, this.O1, z11, this.P1);
                        l5Var.setDelegate(this);
                        r15.addView(l5Var);
                        e0();
                        if (b20Var.q > 0 && b20Var.r > 0) {
                            ViewGroup.LayoutParams layoutParams3 = l5Var.getLayoutParams();
                            layoutParams3.width = b20Var.q;
                            layoutParams3.height = b20Var.r;
                        }
                        nVar = l5Var;
                    } else {
                        b20Var = b20Var2;
                        f10 = 1.0f;
                        if (b10 == 3) {
                            tg.s0 i02 = i0(b20Var.O, b20Var.N);
                            int i12 = b20Var.l;
                            if (i12 != 0) {
                                i02.setColor(i12);
                            }
                            i02.setType(b20Var.b);
                            nVar = i02;
                        } else {
                            if (b10 == 8) {
                                kc kcVar = b20Var.P;
                                if (kcVar != null) {
                                    tg.r2 o02 = o0(kcVar);
                                    int i13 = b20Var.l;
                                    if (i13 != 0) {
                                        o02.setColor(i13);
                                    }
                                    o02.setType(b20Var.b);
                                    nVar = o02;
                                }
                            } else if (b10 == 7) {
                                tg.p0 h02 = h0(b20Var.a0);
                                tg.n0 n0Var = h02.s0;
                                int i14 = b20Var.l;
                                if (i14 != 0) {
                                    h02.setColor(i14);
                                }
                                boolean e10 = n0Var.e();
                                int i15 = n0Var.h;
                                int i16 = n0Var.f;
                                if (e10) {
                                    n0Var.setPreviewType(b20Var.b);
                                }
                                byte b11 = b20Var.b;
                                if (b11 == -1) {
                                    h02.setType(3);
                                    n0Var.d();
                                    b20Var.q = ((int) Math.ceil(n0Var.b0)) + i16 + i16;
                                    b20Var.r = ((int) Math.ceil(n0Var.c0)) + i15 + i15;
                                    PointF position = h02.getPosition();
                                    position.y = (this.C1 * 0.3f) + position.y;
                                    h02.setPosition(position);
                                } else {
                                    h02.setType(b11);
                                    nVar = h02;
                                }
                            } else if (b10 == 4) {
                                tg.v1 k02 = k0(false);
                                k02.s(ch.p0.d(b20Var.N.reaction), false);
                                if (b20Var.N.flipped) {
                                    k02.r(false);
                                }
                                nVar = k02;
                                if (b20Var.N.dark) {
                                    k02.q(false);
                                    nVar = k02;
                                }
                            } else if (b10 == 5 && x7Var.o0 != null) {
                                tg.w1 l02 = l0(x7Var.p0, false);
                                nb nbVar = ((pa) this).o2;
                                bb bbVar = nbVar.Y0;
                                if (bbVar != null) {
                                    bbVar.x = l02;
                                    h61 h61Var = bbVar.y;
                                    if (h61Var != null) {
                                        h61Var.A0(l02.w0);
                                    }
                                }
                                db dbVar = nbVar.d1;
                                if (dbVar != null) {
                                    dbVar.setHasRoundVideo(true);
                                }
                                nVar = l02;
                                if ((b20Var.b & 2) != 0) {
                                    boolean z12 = !l02.t0;
                                    l02.t0 = z12;
                                    l02.u0.f(z12, true);
                                    l02.invalidate();
                                    nVar = l02;
                                }
                            }
                            i10 = i7 + 1;
                            z10 = false;
                        }
                    }
                }
                b20Var = b20Var2;
                f10 = 1.0f;
                nVar = nVar2;
            }
            nVar.setX((b20Var.c * this.B1) - (((f10 - b20Var.v) * b20Var.q) / 2.0f));
            nVar.setY((b20Var.d * this.C1) - (((f10 - b20Var.v) * b20Var.r) / 2.0f));
            nVar.setPosition(new PointF((b20Var.q / 2.0f) + nVar.getX(), (b20Var.r / 2.0f) + nVar.getY()));
            nVar.setScale(b20Var.v);
            nVar.setRotation((float) (((-b20Var.e) / 3.141592653589793d) * 180.0d));
            i10 = i7 + 1;
            z10 = false;
        }
    }

    public final void I0(final boolean z10) {
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
            final boolean[] zArr = {this.y1.c() || this.h2 > 0};
            final float translationY = this.D0.getTranslationY();
            final float alpha = this.l0.getAlpha();
            final ViewGroup barView = getBarView();
            this.m1.b(new r1.d() { // from class: hi.k4
                @Override // r1.d
                public final void a(r1.g gVar3, float f10, float f11) {
                    v5 v5Var = v5.this;
                    r5 r5Var = v5Var.D0;
                    float f12 = f10 / 1000.0f;
                    v5Var.n1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(v5Var.n1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(v5Var.n1, 0.25f) / 0.25f));
                    d5 d5Var = v5Var.g1;
                    float f14 = v5Var.n1;
                    boolean z11 = z10;
                    d5Var.B1(z11, f14);
                    tg.e1 e1Var = v5Var.l0;
                    e1Var.setProgress(v5Var.n1);
                    tg.a1 a1Var = v5Var.k0;
                    a1Var.setProgress(v5Var.n1);
                    v5Var.G0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * v5Var.n1);
                    AnimatorSet animatorSet = v5Var.x1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f15 = v5Var.n1;
                        if (!z11) {
                            f15 = 1.0f - f15;
                        }
                        float f16 = z11 ? 1.0f : 0.0f;
                        float f17 = alpha;
                        e1Var.setAlpha(org.telegram.messenger.g0.T1(f17, f16, f15));
                        a1Var.setAlpha(org.telegram.messenger.g0.T1(f17, z11 ? 1.0f : 0.0f, f15));
                        r5Var.setTranslationY(translationY - ((org.telegram.messenger.g0.L(39.0f) * f15) * (z11 ? 1 : -1)));
                    }
                    r5Var.invalidate();
                    if (view == v5Var.V0) {
                        v5Var.E0.invalidate();
                    }
                }
            });
            this.m1.a(new l4(this, z10, i7));
            this.m1.h();
            if (z10) {
                d5 d5Var = this.g1;
                d5Var.setVisibility(0);
                d5Var.setSelectedColorIndex(sg.j0.e(this.p1).d());
            }
        }
    }

    public final void J0(int i7) {
        tg.j1 j1Var = this.V0;
        e5 e5Var = this.y1;
        int i10 = 1;
        if (i7 == 1) {
            qy qyVar = this.d2;
            boolean z10 = qyVar != null && qyVar.getVisibility() == 0;
            qy qyVar2 = this.d2;
            mb mbVar = this.w1;
            if (qyVar2 != null && qyVar2.d1 != i10.t0) {
                mbVar.removeView(qyVar2);
                this.d2 = null;
            }
            if (this.d2 == null) {
                qy qyVar3 = new qy(null, true, false, false, getContext(), false, null, null, true, this.q1, false, false);
                this.d2 = qyVar3;
                qyVar3.y2 = false;
                qyVar3.V0 = true;
                qyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.d2.setForseMultiwindowLayout(true);
                }
                this.d2.setDelegate(new o5(this));
                mbVar.addView(this.d2);
            }
            this.d2.setVisibility(0);
            this.e2 = true;
            qy qyVar4 = this.d2;
            if (this.j2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.j2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.j2 = mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.k2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.k2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.k2 = mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.q;
            int paddingUnderContainer = mbVar.getPaddingUnderContainer() + (point.x > point.y ? this.k2 : this.j2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            qyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                tg.n nVar = this.t0;
                if (nVar instanceof tg.q2) {
                    org.telegram.messenger.g0.v1(((tg.q2) nVar).getEditText());
                }
            }
            this.h2 = paddingUnderContainer;
            e5Var.a();
            requestLayout();
            zg emojiButton = j1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(xg.d, true);
            }
            if (!z10) {
                if (this.f2) {
                    this.i2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h2, 0.0f);
                    ofFloat.addUpdateListener(new n4(this, i10));
                    ofFloat.addListener(new h5(this, i10));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                    ofFloat.start();
                }
            }
        } else {
            zg emojiButton2 = j1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(xg.e, true);
            }
            qy qyVar5 = this.d2;
            if (qyVar5 != null) {
                this.e2 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    qyVar5.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.h2 = 0;
                e5Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(tg.p0 p0Var) {
        f8 f8Var = new f8(getContext(), this.q1, this.Q1, new ai.s1(19, this, p0Var));
        if (p0Var != null) {
            tg.m0 m0Var = p0Var.w0;
            f8Var.Y1 = true;
            org.telegram.ui.Cells.l3 l3Var = f8Var.V1;
            org.telegram.ui.Cells.l3 l3Var2 = f8Var.U1;
            if (m0Var != null) {
                f8Var.c2 = m0Var.d;
                f8Var.d2 = false;
                l3Var2.setText(m0Var.c);
                l3Var.setText(m0Var.b);
                f8Var.i2 = !TextUtils.isEmpty(m0Var.b);
                f8Var.j2 = m0Var.f;
                f8Var.k2 = m0Var.e;
            } else {
                l3Var2.setText("");
                l3Var.setText("");
                f8Var.j2 = true;
                f8Var.k2 = false;
            }
            String N0 = gd.N0(2131744397, null);
            e eVar = f8Var.X1;
            eVar.i(N0, false, true);
            di.f0 f0Var = f8Var.T1;
            if (f0Var != null) {
                f0Var.O(false);
            }
            eVar.setEnabled(f8Var.g1(l3Var2.getText().toString()));
            f8Var.Y1 = false;
        }
        f8Var.setOnDismissListener(new x4(this, 1));
        f8Var.show();
        y0(true);
    }

    @Override // org.telegram.ui.Components.bu0
    public final void L(int i7, boolean z10) {
        boolean z11;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f2 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.k2 = i7;
                mp.f1().edit().putInt("kbd_height_land3", this.k2).commit();
            } else {
                this.j2 = i7;
                mp.f1().edit().putInt("kbd_height", this.j2).commit();
            }
        }
        boolean z12 = this.e2;
        e5 e5Var = this.y1;
        if (z12) {
            int paddingUnderContainer = this.w1.getPaddingUnderContainer() + (z10 ? this.k2 : this.j2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d2.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = org.telegram.messenger.g0.q.x;
            if (i10 != i11 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i11;
                layoutParams.height = paddingUnderContainer;
                this.d2.setLayoutParams(layoutParams);
                this.h2 = layoutParams.height;
                e5Var.a();
                requestLayout();
            }
        }
        if (this.l2 == i7 && this.m2 == z10) {
            return;
        }
        this.l2 = i7;
        this.m2 = z10;
        boolean z13 = this.f2;
        tg.n nVar = this.t0;
        if (nVar instanceof tg.q2) {
            this.f2 = ((tg.q2) nVar).getEditText().isFocused() && e5Var.c();
        } else {
            this.f2 = false;
        }
        if (this.f2 && this.e2) {
            J0(0);
        }
        if (this.h2 != 0 && !(z11 = this.f2) && z11 != z13 && !this.e2) {
            this.h2 = 0;
            e5Var.a();
            requestLayout();
        }
        U0();
        if (z13 && !this.f2 && this.h2 > 0 && this.i2) {
            this.i2 = false;
        }
        S0();
    }

    public final void L0(tg.s0 s0Var, p10 p10Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ti tiVar = new ti(getContext(), new k5(this, p10Var), false, true, false, this.q1);
        tiVar.X3 = new w7.s(10);
        th thVar = tiVar.v3;
        if (s0Var != null && (messageMedia = s0Var.w0) != null && (geoPoint = messageMedia.geo) != null) {
            tiVar.y4 = new double[]{geoPoint.lat, geoPoint._long};
            tiVar.J1 = true;
            thVar.setVisibility(8);
        } else if (this.E1) {
            tiVar.w4 = this.G1;
            tiVar.x4 = this.F1;
            tiVar.J1 = true;
            thVar.setVisibility(8);
        } else {
            tiVar.J1 = true;
            thVar.setVisibility(8);
        }
        tiVar.setOnDismissListener(new x4(this, 0));
        tiVar.f1();
        tiVar.show();
    }

    public final void M0(tg.n nVar) {
        if (nVar instanceof tg.z0) {
            org.telegram.ui.ActionBar.g1 g1Var = this.r1;
            if (g1Var == null || !g1Var.isShowing()) {
                return;
            }
            this.r1.d(true);
            return;
        }
        int[] iArr = this.c2;
        nVar.getLocationInWindow(iArr);
        float scaleX = nVar.getScaleX() * nVar.getWidth();
        q5 q5Var = this.B0;
        float scaleX2 = q5Var.getScaleX() * scaleX;
        float scaleY = q5Var.getScaleY() * nVar.getScaleY() * nVar.getHeight();
        int i7 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i7;
        int i10 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i10;
        N0(new r4(this, nVar, 1), this, 51, i7, i10 - org.telegram.messenger.g0.L(32.0f), true);
    }

    public final void N0(Runnable runnable, v5 v5Var, int i7, int i10, int i11, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = this.r1;
        if (g1Var != null && g1Var.isShowing()) {
            this.r1.d(true);
            return;
        }
        int i12 = 0;
        if (this.s1 == null) {
            this.t1 = new Rect();
            t5 t5Var = new t5(this, getContext());
            this.s1 = t5Var;
            t5Var.setAnimationEnabled(true);
            this.s1.setOnTouchListener(new t4(0, this));
            this.s1.setDispatchKeyEventListener(new u4(this));
            this.s1.setShownFromBottom(true);
        }
        t5 t5Var2 = this.s1;
        t5Var2.a0 = z10;
        t5Var2.d();
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
            this.r1.setOnDismissListener(new v4(i12, this));
        }
        this.s1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), TLObject.FLAG_31));
        this.r1.setFocusable(true);
        int measuredWidth = i10 - (this.s1.getMeasuredWidth() / 2);
        int measuredHeight = i11 - this.s1.getMeasuredHeight();
        this.r1.showAtLocation(v5Var, i7, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.g1.i(this.s1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            t5 t5Var3 = this.s1;
            t5Var3.setBackgroundDrawable(new org.telegram.ui.Components.ea(new org.telegram.ui.Components.fa(this.O1, t5Var3, 5, false), measuredWidth, measuredHeight, mutate, org.telegram.messenger.g0.N(8.3f)));
        } else {
            this.s1.setBackgroundDrawable(mutate);
            this.s1.setBackgroundColor(-14145495);
        }
    }

    public final void O0(boolean z10) {
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
                    this.J1.animate().alpha(0.0f).setDuration(150L).setListener(new h5(this, i7)).start();
                    return;
                }
                this.N1 = true;
                this.w1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L1, z10 ? 1.0f : 0.0f);
                this.J1.setTransitionProgress(this.L1);
                ofFloat.addUpdateListener(new n4(this, 2));
                ofFloat.addListener(new bi.j7(12, this, z10));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(kr.g);
                ofFloat.start();
            }
        }
    }

    public final void P0(boolean z10) {
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
                tg.o1 o1Var = this.W0;
                o1Var.setAlpha(0.0f);
                o1Var.setVisibility(0);
            }
            int i7 = 1;
            this.f1.b(new fi.q7(i7, this));
            this.f1.a(new l4(this, z10, i7));
            this.f1.h();
        }
    }

    @Override // org.telegram.ui.Components.du0, org.telegram.ui.Components.cu0
    public final int Q() {
        return this.y1.l - this.w1.getBottomPadding2();
    }

    public final PointF Q0(tg.n nVar) {
        float f10;
        float f11;
        we weVar = this.p0;
        float f12 = weVar != null ? 200.0f / weVar.c : 200.0f;
        float f13 = 0.2f;
        if (nVar != null) {
            PointF position = nVar.getPosition();
            float min = Math.min(nVar.getHeight(), nVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f14 = weVar != null ? 100.0f / weVar.c : 100.0f;
        PointF d02 = d0();
        int i7 = 0;
        while (i7 < 10) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                q5 q5Var = this.B0;
                if (i10 >= q5Var.getChildCount()) {
                    break;
                }
                View childAt = q5Var.getChildAt(i10);
                if (!(childAt instanceof tg.n) || (childAt instanceof tg.z0)) {
                    f10 = f13;
                    f11 = f14;
                } else {
                    PointF position2 = ((tg.n) childAt).getPosition();
                    f10 = f13;
                    f11 = f14;
                    if (((float) Math.sqrt(Math.pow(position2.y - d02.y, 2.0d) + Math.pow(position2.x - d02.x, 2.0d))) < f11) {
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
            d02 = new PointF(d02.x + f12, d02.y + f12);
            f13 = f15;
            f14 = f16;
        }
        return d02;
    }

    public final void R0(int i7) {
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
        sg.j0 e10 = sg.j0.e(i11);
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
        int c10 = sg.j0.e(i11).c();
        sg.g1 g1Var = this.k1;
        g1Var.a = c10;
        this.T1 = i7 != 2;
        E0(g1Var, null, false);
        this.T1 = false;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.L0 = duration;
        duration.setInterpolator(kr.f);
        this.L0.addUpdateListener(new fi.z2(this, viewGroup3, viewGroup4, i12));
        this.L0.addListener(new bi.z0(this, viewGroup3, viewGroup4, i7, 1));
        this.L0.start();
    }

    public final void S0() {
        e5 e5Var = this.y1;
        tg.j1 j1Var = this.V0;
        if (j1Var != null) {
            if (e5Var.c()) {
                j1Var.a(R.drawable.input_smile);
            } else if (this.e2) {
                j1Var.a(R.drawable.input_keyboard);
            } else {
                j1Var.a(R.drawable.msg_add);
            }
        }
        boolean z10 = e5Var.c() || this.e2;
        boolean z11 = !z10;
        org.telegram.messenger.g0.S3(1.0f, this.Y0, z11, false);
        org.telegram.messenger.g0.S3(1.0f, this.X0, z11, false);
        org.telegram.messenger.g0.S3(1.0f, this.a1, z10, false);
        org.telegram.messenger.g0.S3(1.0f, this.Z0, z10, false);
    }

    public final void T0() {
        tg.n nVar;
        ObjectAnimator objectAnimator = this.S1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.y0.getParent();
        if (view == null) {
            return;
        }
        e5 e5Var = this.y1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!e5Var.c() || e5Var.d) && this.h2 <= 0) || (nVar = this.t0) == null) ? 0.0f : view.getScaleY() * (-(nVar.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.S1 = ofFloat;
        ofFloat.setDuration(350L);
        this.S1.setInterpolator(kr.h);
        this.S1.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0() {
        boolean z10;
        if (this.t0 instanceof tg.q2) {
            e5 e5Var = this.y1;
            if ((e5Var.c() || this.h2 > 0) && !e5Var.d) {
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

    @Override // tg.l1, tg.h1
    public final void a() {
        I0(true);
    }

    @Override // org.telegram.ui.Components.cu0, org.telegram.ui.ActionBar.c6
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

    @Override // tg.h1
    public final void b() {
        setTextType((this.v0 + 1) % 4);
    }

    @Override // tg.h1
    public final void c(int i7) {
        tg.n nVar = this.t0;
        if (nVar instanceof tg.q2) {
            G0((tg.q2) nVar, i7);
            sg.j0 e10 = sg.j0.e(this.p1);
            e10.g = i7;
            e10.a.edit().putInt("text_alignment", i7).apply();
        }
    }

    public final void c0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new c(5, this, view)).start();
    }

    public final PointF d0() {
        q5 q5Var = this.B0;
        int measuredWidth = q5Var.getMeasuredWidth();
        int measuredHeight = q5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.C1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a2) {
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

    public final void e0() {
        boolean z10 = this.G1;
        q5 q5Var = this.B0;
        boolean z11 = true;
        if (!z10 && !this.I1) {
            int i7 = 0;
            loop0: while (true) {
                if (i7 >= q5Var.getChildCount()) {
                    z11 = false;
                    break;
                }
                View childAt = q5Var.getChildAt(i7);
                boolean z12 = childAt instanceof tg.q2;
                int i10 = this.p1;
                if (z12) {
                    CharSequence text = ((tg.q2) childAt).getText();
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
                            if (x7.u(document, org.telegram.messenger.w7.J(document, null, true, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i7++;
                } else if (childAt instanceof tg.j2) {
                    TLRPC.Document sticker = ((tg.j2) childAt).getSticker();
                    org.telegram.messenger.w7.G(i10);
                    if (x7.u(sticker, org.telegram.messenger.w7.J(sticker, null, true, true).getAbsolutePath())) {
                        break;
                    } else {
                        i7++;
                    }
                } else if (childAt instanceof tg.w1) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        for (int i11 = 0; i11 < q5Var.getChildCount(); i11++) {
            View childAt2 = q5Var.getChildAt(i11);
            if (childAt2 instanceof tg.n) {
                ((tg.n) childAt2).setIsVideo(z11);
            }
        }
    }

    @Override // tg.l
    public final void f(tg.n nVar) {
        O0(false);
        M0(nVar);
    }

    public final TextView f0(int i7, String str) {
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

    public final tg.d g0() {
        xt0 paintingSize = getPaintingSize();
        PointF d02 = d0();
        d02.y *= 1.5f;
        tg.d dVar = new tg.d(getContext(), d02, (int) ((paintingSize.a / 9.0f) * 0.5f), new sg.g1(1.0f, this.k1.c, -1));
        float f10 = paintingSize.a / 9.0f;
        s4 s4Var = new s4(this, 2);
        dVar.y0 = (int) (0.5f * f10);
        dVar.z0 = (int) (f10 * 2.0f);
        dVar.A0 = s4Var;
        dVar.B0 = true;
        dVar.setStickyX(2);
        dVar.setDelegate(this);
        dVar.setMaxWidth(this.B1 - org.telegram.messenger.g0.L(32.0f));
        dVar.setTypeface(sg.j0.e(this.p1).j);
        dVar.setType(3);
        a0 a0Var = this.U1;
        if (a0Var != null) {
            a0Var.b(dVar);
        } else {
            f5 f5Var = this.W1;
            Objects.requireNonNull(f5Var);
            dVar.setPositionProvider(new x(f5Var, 2));
            dVar.setOnEditing(new y(f5Var, 1));
            dVar.setOnSeek(new y(f5Var, 2));
        }
        this.B0.addView(dVar, c8.na.c(-2.0f, -2));
        G0(dVar, 1);
        e0();
        we weVar = this.p0;
        if (weVar != null) {
            dVar.j(1.0f / weVar.c);
            dVar.f(-(weVar.k + weVar.d));
        }
        return dVar;
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
        q5 q5Var = this.B0;
        int childCount = q5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = q5Var.getChildAt(i7);
            if (childAt instanceof tg.j2) {
                TLRPC.Document sticker = ((tg.j2) childAt).getSticker();
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
            } else if (childAt instanceof tg.q2) {
                CharSequence text = ((tg.q2) childAt).getText();
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

    public sg.t0 getRenderView() {
        return this.y0;
    }

    public tg.n getSelectedEntity() {
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

    public final tg.p0 h0(tg.m0 m0Var) {
        int i7;
        this.Z1 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        q5 q5Var = this.B0;
        float measuredWidth = q5Var.getMeasuredWidth() <= 0 ? this.B1 : q5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.p0 p0Var = new tg.p0(getContext(), Q0, this.p1, m0Var, measuredWidth / 360.0f, L);
        if (Q0.x == q5Var.getMeasuredWidth() / 2.0f) {
            p0Var.setStickyX(2);
        }
        if (Q0.y == q5Var.getMeasuredHeight() / 2.0f) {
            p0Var.setStickyY(2);
        }
        sg.g1 g1Var = this.k1;
        if (g1Var != null && (i7 = g1Var.a) != -47814) {
            p0Var.setColor(i7);
        }
        p0Var.setDelegate(this);
        p0Var.setMaxWidth(L);
        q5Var.addView(p0Var, c8.na.c(-2.0f, -2));
        e0();
        we weVar = this.p0;
        if (weVar != null) {
            p0Var.j(1.0f / weVar.c);
            p0Var.f(-(weVar.k + weVar.d));
        }
        return p0Var;
    }

    @Override // hi.jb
    public final boolean i(MotionEvent motionEvent) {
        if (this.a2) {
            return false;
        }
        if (this.t0 != null) {
            D0(null, true);
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y10);
        this.y0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final tg.s0 i0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i7;
        this.Z1 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        q5 q5Var = this.B0;
        float measuredWidth = q5Var.getMeasuredWidth() <= 0 ? this.B1 : q5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.s0 s0Var = new tg.s0(getContext(), Q0, this.p1, messageMedia, mediaArea, measuredWidth / 240.0f, L);
        if (Q0.x == q5Var.getMeasuredWidth() / 2.0f) {
            s0Var.setStickyX(2);
        }
        if (Q0.y == q5Var.getMeasuredHeight() / 2.0f) {
            s0Var.setStickyY(2);
        }
        sg.g1 g1Var = this.k1;
        if (g1Var != null && (i7 = g1Var.a) != -47814) {
            s0Var.setColor(i7);
        }
        s0Var.setDelegate(this);
        s0Var.setMaxWidth(L);
        q5Var.addView(s0Var, c8.na.c(-2.0f, -2));
        e0();
        we weVar = this.p0;
        if (weVar != null) {
            s0Var.j(1.0f / weVar.c);
            s0Var.f(-(weVar.k + weVar.d));
        }
        return s0Var;
    }

    public final tg.s1 j0(String str, boolean z10) {
        float f10;
        xt0 xt0Var;
        this.Z1 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            f10 = 1.0f;
        }
        q5 q5Var = this.B0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.B1, q5Var.getMeasuredWidth()) * 0.5d);
            xt0Var = new xt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.C1, q5Var.getMeasuredHeight()) * 0.5d);
            xt0Var = new xt0(f10 * floor2, floor2);
        }
        xt0 xt0Var2 = xt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = xt0Var2.a;
            xt0Var2.a = xt0Var2.b;
            xt0Var2.b = f11;
        }
        Context context = getContext();
        PointF d02 = d0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        tg.s1 s1Var = new tg.s1(context, d02, xt0Var2, str, intValue);
        s1Var.setDelegate(this);
        q5Var.addView(s1Var);
        e0();
        return s1Var;
    }

    public final tg.v1 k0(boolean z10) {
        String str;
        xt0 xt0Var = new xt0(org.telegram.messenger.g0.L(106.0f), org.telegram.messenger.g0.L(106.0f));
        PointF d02 = d0();
        q5 q5Var = this.B0;
        if (q5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i7 = 0; i7 < q5Var.getChildCount(); i7++) {
                    View childAt = q5Var.getChildAt(i7);
                    if (a8.x9.a(d02.x, d02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < org.telegram.messenger.g0.L(6.0f)) {
                        break;
                    }
                }
                d02.x = (q5Var.getMeasuredWidth() * 0.05f) + d02.x;
                d02.y = (q5Var.getMeasuredHeight() * 0.05f) + d02.y;
                d02.x = Utilities.i(d02.x, q5Var.getMeasuredWidth(), 0.0f);
                d02.y = Utilities.i(d02.y, q5Var.getMeasuredHeight(), 0.0f);
            }
        }
        tg.v1 v1Var = new tg.v1(getContext(), d02);
        v1Var.t0 = new fi.l8(v1Var);
        v1Var.u0 = new fi.l8(v1Var);
        v1Var.v0 = new ch.g0(v1Var);
        v1Var.w0 = new ch.g0(v1Var);
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(v1Var);
        v1Var.y0 = c6Var;
        org.telegram.ui.Components.c6 c6Var2 = new org.telegram.ui.Components.c6(v1Var);
        v1Var.z0 = c6Var2;
        v1Var.B0 = 1.0f;
        v1Var.s0 = xt0Var;
        c6Var2.e(true, 1.0f);
        c6Var.e(true, 1.0f);
        ArrayList arrayList = ri.d0(i10.t0).h;
        ch.g0 g0Var = v1Var.v0;
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
        v1Var.x0 = b10;
        g0Var.e(b10);
        v1Var.k();
        v1Var.setDelegate(this);
        q5Var.addView(v1Var);
        e0();
        if (z10) {
            A0(v1Var);
            D0(v1Var, true);
        }
        return v1Var;
    }

    public final tg.w1 l0(String str, boolean z10) {
        this.Z1 = true;
        this.b2 = true;
        p0();
        q5 q5Var = this.B0;
        int measuredWidth = q5Var.getMeasuredWidth();
        q5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        xt0 xt0Var = new xt0(floor, floor);
        tg.w1 w1Var = new tg.w1(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - org.telegram.messenger.g0.L(16.0f), (xt0Var.b / 2.0f) + org.telegram.messenger.g0.L(72.0f)), xt0Var, str);
        w1Var.setDelegate(this);
        q5Var.addView(w1Var);
        e0();
        if (z10) {
            A0(w1Var);
            post(new h4(this, w1Var, 0));
        }
        this.b2 = false;
        return w1Var;
    }

    public final m5 m0(Object obj, TLRPC.Document document) {
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
        u5 u5Var = new u5(d0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        m5 m5Var = new m5(this, context, u5Var.a, u5Var.c, u5Var.b, new xt0(floor, floor), document, obj);
        boolean C4 = fj.C4(document);
        ImageReceiver imageReceiver = m5Var.z0;
        if (C4) {
            imageReceiver.p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.F0(12);
        m5Var.setDelegate(this);
        this.B0.addView(m5Var);
        e0();
        return m5Var;
    }

    @Override // tg.l
    public final int[] n(tg.n nVar) {
        int i7 = (int) nVar.getPosition().x;
        int[] iArr = this.c2;
        iArr[0] = i7;
        iArr[1] = (int) nVar.getPosition().y;
        return iArr;
    }

    public final tg.q2 n0(boolean z10) {
        xt0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        tg.q2 q2Var = new tg.q2(getContext(), Q0, (int) (paintingSize.a / 9.0f), "", this.k1, this.v0);
        float f10 = paintingSize.a / 9.0f;
        s4 s4Var = new s4(this, 0);
        q2Var.y0 = (int) (0.5f * f10);
        q2Var.z0 = (int) (f10 * 2.0f);
        q2Var.A0 = s4Var;
        float f11 = Q0.x;
        q5 q5Var = this.B0;
        if (f11 == q5Var.getMeasuredWidth() / 2.0f) {
            q2Var.setStickyX(2);
        }
        if (Q0.y == q5Var.getMeasuredHeight() / 2.0f) {
            q2Var.setStickyY(2);
        }
        q2Var.setDelegate(this);
        q2Var.setMaxWidth(this.B1 - org.telegram.messenger.g0.L(32.0f));
        int i7 = this.p1;
        q2Var.setTypeface(sg.j0.e(i7).j);
        q2Var.setType(sg.j0.e(i7).h);
        q5Var.addView(q2Var, c8.na.c(-2.0f, -2));
        e0();
        we weVar = this.p0;
        if (weVar != null) {
            q2Var.j(1.0f / weVar.c);
            q2Var.f(-(weVar.k + weVar.d));
        }
        if (z10) {
            A0(q2Var);
            q2Var.q();
            D0(q2Var, false);
            q2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.I3(q2Var.getFocusedView());
            this.u0 = true;
            int i10 = sg.j0.e(i7).g;
            tg.j1 j1Var = this.V0;
            j1Var.d(i10, true);
            j1Var.setOutlineType(sg.j0.e(i7).h);
        }
        return q2Var;
    }

    public final tg.r2 o0(kc kcVar) {
        int i7;
        this.Z1 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        q5 q5Var = this.B0;
        float measuredWidth = q5Var.getMeasuredWidth() <= 0 ? this.B1 : q5Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - org.telegram.messenger.g0.L(58.0f);
        tg.r2 r2Var = new tg.r2(getContext(), Q0, this.p1, kcVar, measuredWidth / 240.0f, L);
        if (Q0.x == q5Var.getMeasuredWidth() / 2.0f) {
            r2Var.setStickyX(2);
        }
        if (Q0.y == q5Var.getMeasuredHeight() / 2.0f) {
            r2Var.setStickyY(2);
        }
        sg.g1 g1Var = this.k1;
        if (g1Var != null && (i7 = g1Var.a) != -47814) {
            r2Var.setColor(i7);
        }
        r2Var.setDelegate(this);
        r2Var.setMaxWidth(L);
        q5Var.addView(r2Var, c8.na.c(-2.0f, -2));
        e0();
        we weVar = this.p0;
        if (weVar != null) {
            r2Var.j(1.0f / weVar.c);
            r2Var.f(-(weVar.k + weVar.d));
        }
        return r2Var;
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a0 a0Var = this.U1;
        if (a0Var != null) {
            a0Var.f(null);
            m.o3 o3Var = a0Var.c;
            if (o3Var != null) {
                o3Var.f = null;
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) o3Var.h;
                if (fcVar != null) {
                    fcVar.b();
                    o3Var.h = null;
                }
                a0Var.c = null;
            }
            a0Var.a.w(false);
        }
        this.W1.w(false);
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
        u uVar;
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
        tg.n nVar = this.t0;
        if (nVar != null) {
            nVar.m();
        }
        measureChild(this.D0, i7, i10);
        measureChild(this.N0, i7, i10);
        measureChild(this.F0, i7, i10);
        a0 a0Var = this.U1;
        if (a0Var != null && (uVar = a0Var.e) != null) {
            uVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        measureChild(this.E0, i7, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.h2 - this.w1.getPaddingUnderContainer(), Q()), TLObject.FLAG_30));
        FrameLayout frameLayout = this.C0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.q0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.e2 && !this.g2) {
            this.q0 = true;
            v0();
            this.q0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            return;
        }
        v0();
    }

    @Override // tg.l
    public final boolean p() {
        return !(this.t0 instanceof tg.z0);
    }

    public final void p0() {
        int i7 = 0;
        while (true) {
            q5 q5Var = this.B0;
            if (i7 >= q5Var.getChildCount()) {
                return;
            }
            View childAt = q5Var.getChildAt(i7);
            if (childAt instanceof tg.w1) {
                if (this.t0 == childAt) {
                    D0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(kr.h).withEndAction(new h4(this, (tg.w1) childAt, 1)).start();
            }
            i7++;
        }
    }

    @Override // tg.l
    public final boolean q() {
        return !this.u0;
    }

    public abstract void q0();

    public final tg.z0 r0() {
        int i7 = 0;
        while (true) {
            q5 q5Var = this.B0;
            if (i7 >= q5Var.getChildCount()) {
                return null;
            }
            View childAt = q5Var.getChildAt(i7);
            if (childAt instanceof tg.z0) {
                return (tg.z0) childAt;
            }
            i7++;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.q0) {
            return;
        }
        super.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap s0(ArrayList arrayList, boolean z10, boolean z11, boolean z12, boolean z13, x7 x7Var) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i7;
        int i10;
        q5 q5Var;
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
        tg.z0 z0Var;
        di.n4 n4Var;
        boolean z16;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z17;
        TLRPC.Message message;
        org.telegram.ui.Cells.v0 v0Var;
        di.h6 h6Var;
        ImageReceiver imageReceiver3;
        ImageReceiver imageReceiver4;
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        float scaleX;
        boolean z18;
        boolean z19;
        float radius;
        double d;
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        Spanned spanned;
        boolean z20;
        v5 v5Var = this;
        p5 p5Var = v5Var.y0;
        int i14 = 0;
        byte b11 = 1;
        q5 q5Var2 = v5Var.B0;
        if (z10) {
            createBitmap = p5Var.c(false, z13);
        } else if (z12) {
            createBitmap = Bitmap.createBitmap(Math.max(1, q5Var2.getMeasuredWidth()), Math.max(1, q5Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z11) {
                bitmap = null;
                v5Var.Q0 = BigInteger.ONE;
                i10 = 0;
                for (i7 = 0; i7 < q5Var2.getChildCount(); i7++) {
                    if (q5Var2.getChildAt(i7) instanceof tg.n) {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    int childCount = q5Var2.getChildCount();
                    int i15 = 0;
                    while (i15 < childCount) {
                        View childAt = q5Var2.getChildAt(i15);
                        if (childAt instanceof tg.n) {
                            tg.n nVar = (tg.n) childAt;
                            nVar.getPosition();
                            b20 b20Var = new b20();
                            if (!(nVar instanceof tg.d)) {
                                if (arrayList != null) {
                                    boolean z21 = nVar instanceof tg.q2;
                                    int i16 = v5Var.p1;
                                    if (z21) {
                                        b20Var.a = b11;
                                        tg.q2 q2Var = (tg.q2) nVar;
                                        CharSequence text = q2Var.getText();
                                        if (text instanceof Spanned) {
                                            Spanned spanned2 = (Spanned) text;
                                            q5Var = q5Var2;
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
                                                    a20 a20Var = new a20();
                                                    int i19 = childCount;
                                                    int i20 = i15;
                                                    a20Var.document_id = x5Var.getDocumentId();
                                                    a20Var.document = document;
                                                    a20Var.offset = spanned2.getSpanStart(x5Var);
                                                    a20Var.length = spanned2.getSpanEnd(x5Var) - a20Var.offset;
                                                    org.telegram.messenger.w7.G(i16);
                                                    a20Var.a = org.telegram.messenger.w7.J(document, null, true, true).getAbsolutePath();
                                                    int i21 = 0;
                                                    while (document != null) {
                                                        ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                        if (arrayList2 == null || arrayList2.isEmpty() || new File(a20Var.a).exists()) {
                                                            break;
                                                        }
                                                        org.telegram.messenger.w7.G(i16);
                                                        spanned = spanned2;
                                                        z20 = true;
                                                        a20Var.a = org.telegram.messenger.w7.J(document.thumbs.get(i21), null, true, true).getAbsolutePath();
                                                        i21++;
                                                        if (i21 >= document.thumbs.size()) {
                                                            break;
                                                        }
                                                        spanned2 = spanned;
                                                    }
                                                    spanned = spanned2;
                                                    z20 = true;
                                                    boolean K2 = fj.K2(a20Var.document, z20);
                                                    if (K2 || w0(a20Var.document)) {
                                                        a20Var.c = (byte) (a20Var.c | (K2 ? (byte) 1 : (byte) 4));
                                                    }
                                                    if (fj.C4(a20Var.document)) {
                                                        a20Var.c = (byte) (a20Var.c | 8);
                                                    }
                                                    b20Var.k.add(a20Var);
                                                    if (document != null) {
                                                        BigInteger valueOf = BigInteger.valueOf(5000L);
                                                        v5Var.Q0 = v5Var.Q0.multiply(valueOf).divide(v5Var.Q0.gcd(valueOf));
                                                    }
                                                    i17 = i18 + 1;
                                                    x5VarArr = x5VarArr2;
                                                    childCount = i19;
                                                    i15 = i20;
                                                    spanned2 = spanned;
                                                }
                                            }
                                        } else {
                                            q5Var = q5Var2;
                                        }
                                        i11 = childCount;
                                        i12 = i15;
                                        b20Var.j = text.toString();
                                        b20Var.b = (byte) q2Var.getType();
                                        b20Var.l = q2Var.getSwatch().a;
                                        b20Var.m = q2Var.getTextSize();
                                        b20Var.n = q2Var.getTypeface();
                                        b20Var.p = q2Var.getAlign();
                                    } else {
                                        q5Var = q5Var2;
                                        i11 = childCount;
                                        i12 = i15;
                                        if (nVar instanceof tg.j2) {
                                            b20Var.a = (byte) 0;
                                            tg.j2 j2Var = (tg.j2) nVar;
                                            xt0 baseSize = j2Var.getBaseSize();
                                            b20Var.f = baseSize.a;
                                            b20Var.g = baseSize.b;
                                            b20Var.B = j2Var.getSticker();
                                            b20Var.C = j2Var.getParentObject();
                                            TLRPC.Document sticker = j2Var.getSticker();
                                            org.telegram.messenger.w7.G(i10.t0);
                                            b20Var.j = org.telegram.messenger.w7.J(sticker, null, true, true).getAbsolutePath();
                                            if (fj.K2(sticker, true) || w0(sticker)) {
                                                boolean K22 = fj.K2(sticker, true);
                                                b20Var.b = (byte) (b20Var.b | (K22 ? (byte) 1 : (byte) 4));
                                                r21 = (K22 || w0(sticker)) ? j2Var.getDuration() : 5000L;
                                                if (r21 != 0) {
                                                    BigInteger valueOf2 = BigInteger.valueOf(r21);
                                                    v5Var.Q0 = v5Var.Q0.multiply(valueOf2).divide(v5Var.Q0.gcd(valueOf2));
                                                }
                                            }
                                            if (fj.C4(sticker)) {
                                                b20Var.l = -1;
                                                b20Var.b = (byte) (b20Var.b | 8);
                                            }
                                            if (j2Var.v0) {
                                                b20Var.b = (byte) (b20Var.b | 2);
                                            }
                                        } else if (nVar instanceof tg.s1) {
                                            tg.s1 s1Var = (tg.s1) nVar;
                                            b20Var.a = (byte) 2;
                                            xt0 baseSize2 = s1Var.getBaseSize();
                                            b20Var.f = baseSize2.a;
                                            b20Var.g = baseSize2.b;
                                            b20Var.j = s1Var.q(i16);
                                            b20Var.u = s1Var.I0;
                                            if (s1Var.v0) {
                                                b20Var.b = (byte) (b20Var.b | 2);
                                            }
                                        } else if (nVar instanceof tg.s0) {
                                            tg.s0 s0Var = (tg.s0) nVar;
                                            tg.r0 r0Var = s0Var.s0;
                                            b20Var.a = (byte) 3;
                                            b20Var.b = (byte) s0Var.getType();
                                            b20Var.f = r0Var.getWidth();
                                            b20Var.g = r0Var.getHeight();
                                            b20Var.j = r0Var.getText();
                                            b20Var.l = s0Var.t0 ? s0Var.getColor() : 0;
                                            b20Var.Q = r0Var.E;
                                            b20Var.O = s0Var.w0;
                                            TL_stories.MediaArea mediaArea2 = s0Var.x0;
                                            b20Var.N = mediaArea2;
                                            mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            TLRPC.Document codeEmojiDocument = r0Var.getCodeEmojiDocument();
                                            if (codeEmojiDocument != null) {
                                                a20 a20Var2 = new a20();
                                                a20Var2.document_id = codeEmojiDocument.id;
                                                a20Var2.document = codeEmojiDocument;
                                                org.telegram.messenger.w7.G(i16);
                                                a20Var2.a = org.telegram.messenger.w7.J(codeEmojiDocument, null, true, true).getAbsolutePath();
                                                boolean K23 = fj.K2(a20Var2.document, true);
                                                if (K23 || w0(a20Var2.document)) {
                                                    a20Var2.c = (byte) (a20Var2.c | (K23 ? (byte) 1 : (byte) 4));
                                                }
                                                b20Var.k.add(a20Var2);
                                            }
                                        } else if (nVar instanceof tg.r2) {
                                            tg.r2 r2Var = (tg.r2) nVar;
                                            tg.r0 r0Var2 = r2Var.s0;
                                            b20Var.a = (byte) 8;
                                            b20Var.b = (byte) r2Var.getType();
                                            b20Var.f = r0Var2.getWidth();
                                            b20Var.g = r0Var2.getHeight();
                                            b20Var.j = r0Var2.getText();
                                            b20Var.l = r2Var.t0 ? r2Var.getColor() : 0;
                                            b20Var.Q = r0Var2.E;
                                            b20Var.P = r2Var.w0;
                                            TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                            tL_mediaAreaWeather.emoji = r2Var.w0.c;
                                            tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                            tL_mediaAreaWeather.color = r0Var2.f.getColor();
                                            b20Var.N = tL_mediaAreaWeather;
                                            tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            TLRPC.Document codeEmojiDocument2 = r0Var2.getCodeEmojiDocument();
                                            if (codeEmojiDocument2 != null) {
                                                a20 a20Var3 = new a20();
                                                a20Var3.document_id = codeEmojiDocument2.id;
                                                a20Var3.document = codeEmojiDocument2;
                                                org.telegram.messenger.w7.G(i16);
                                                a20Var3.a = org.telegram.messenger.w7.J(codeEmojiDocument2, null, true, true).getAbsolutePath();
                                                boolean K24 = fj.K2(a20Var3.document, true);
                                                if (K24 || w0(a20Var3.document)) {
                                                    a20Var3.c = (byte) (a20Var3.c | (K24 ? (byte) 1 : (byte) 4));
                                                }
                                                b20Var.k.add(a20Var3);
                                            }
                                            view = childAt;
                                            z16 = false;
                                            z17 = false;
                                            imageReceiver = null;
                                            arrayList.add(b20Var);
                                            scaleX = view.getScaleX();
                                            float scaleY = view.getScaleY();
                                            float x10 = view.getX();
                                            float y10 = view.getY();
                                            b20Var.q = view.getWidth();
                                            b20Var.r = view.getHeight();
                                            b20Var.f = (view.getWidth() * scaleX) / q5Var.getMeasuredWidth();
                                            b20Var.g = (view.getHeight() * scaleY) / q5Var.getMeasuredHeight();
                                            b20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10) / q5Var.getMeasuredWidth();
                                            b20Var.d = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y10) / q5Var.getMeasuredHeight();
                                            b20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            b20Var.y = ((view.getWidth() / 2.0f) + x10) / q5Var.getMeasuredWidth();
                                            b20Var.z = ((view.getHeight() / 2.0f) + y10) / q5Var.getMeasuredHeight();
                                            b20Var.w = b20Var.q / q5Var.getMeasuredWidth();
                                            b20Var.x = b20Var.r / q5Var.getMeasuredHeight();
                                            b20Var.v = scaleX;
                                            if (nVar instanceof tg.z0) {
                                                z18 = z16;
                                                if (nVar instanceof tg.j2) {
                                                    float v = ((tg.j2) nVar).z0.v();
                                                    float f10 = (b20Var.f / 2.0f) + b20Var.c;
                                                    float f11 = (b20Var.g / 2.0f) + b20Var.d;
                                                    float measuredWidth = q5Var.getMeasuredWidth() / q5Var.getMeasuredHeight();
                                                    if (v > 1.0f) {
                                                        float f12 = (b20Var.f * measuredWidth) / v;
                                                        b20Var.g = f12;
                                                        b20Var.r = (int) (b20Var.q / v);
                                                        b20Var.d = f11 - (f12 / 2.0f);
                                                    } else if (v < 1.0f) {
                                                        float f13 = (b20Var.g / measuredWidth) * v;
                                                        b20Var.f = f13;
                                                        b20Var.q = (int) (b20Var.r * v);
                                                        b20Var.c = f10 - (f13 / 2.0f);
                                                    }
                                                } else {
                                                    TL_stories.MediaArea mediaArea3 = b20Var.N;
                                                    if (mediaArea3 != null && (((z19 = nVar instanceof tg.s0)) || (nVar instanceof tg.r2) || (nVar instanceof tg.p0) || (nVar instanceof tg.v1))) {
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                        float f14 = b20Var.c;
                                                        float f15 = b20Var.f;
                                                        mediaAreaCoordinates2.x = ((f15 / 2.0f) + f14) * 100.0f;
                                                        mediaAreaCoordinates2.y = ((b20Var.g / 2.0f) + b20Var.d) * 100.0f;
                                                        if (z19) {
                                                            tg.r0 r0Var3 = ((tg.s0) nVar).s0;
                                                            mediaAreaCoordinates2.w = m10.y(r0Var3.J * 2 * scaleX, q5Var.getMeasuredWidth(), f15, 100.0f);
                                                            b20Var.N.coordinates.h = m10.y(r0Var3.K * 2 * scaleY, q5Var.getMeasuredHeight(), b20Var.g, 100.0f);
                                                        } else if (nVar instanceof tg.r2) {
                                                            tg.r0 r0Var4 = ((tg.r2) nVar).s0;
                                                            mediaAreaCoordinates2.w = m10.y(r0Var4.J * 2 * scaleX, q5Var.getMeasuredWidth(), f15, 100.0f);
                                                            b20Var.N.coordinates.h = m10.y(r0Var4.K * 2 * scaleY, q5Var.getMeasuredHeight(), b20Var.g, 100.0f);
                                                        } else if (nVar instanceof tg.p0) {
                                                            tg.n0 n0Var = ((tg.p0) nVar).s0;
                                                            mediaAreaCoordinates2.w = m10.y(n0Var.f * 2 * scaleX, q5Var.getMeasuredWidth(), f15, 100.0f);
                                                            b20Var.N.coordinates.h = m10.y(n0Var.h * 2 * scaleY, q5Var.getMeasuredHeight(), b20Var.g, 100.0f);
                                                        } else if (nVar instanceof tg.v1) {
                                                            tg.v1 v1Var = (tg.v1) nVar;
                                                            float padding = ((v1Var.getPadding() * 2) * scaleX) / q5Var.getMeasuredWidth();
                                                            float padding2 = ((v1Var.getPadding() * 2) * scaleX) / q5Var.getMeasuredHeight();
                                                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = b20Var.N.coordinates;
                                                            mediaAreaCoordinates3.w = (b20Var.f - padding) * 100.0f;
                                                            mediaAreaCoordinates3.h = (b20Var.g - padding2) * 100.0f;
                                                        }
                                                        b20Var.N.coordinates.rotation = ((-b20Var.e) / 3.141592653589793d) * 180.0d;
                                                        if (z19) {
                                                            radius = ((tg.s0) nVar).s0.getRadius();
                                                        } else if (nVar instanceof tg.r2) {
                                                            radius = ((tg.r2) nVar).s0.getRadius();
                                                        } else if (nVar instanceof tg.p0) {
                                                            radius = ((tg.p0) nVar).s0.getRadius();
                                                        }
                                                        d = radius;
                                                    }
                                                }
                                                d = -1.0d;
                                            } else {
                                                tg.z0 z0Var2 = (tg.z0) nVar;
                                                tg.u0 u0Var = z0Var2.t0;
                                                di.n4 n4Var2 = z0Var2.s0;
                                                RectF rectF = org.telegram.messenger.g0.P;
                                                z18 = z16;
                                                double r10 = z0Var2.r(rectF);
                                                rectF.offset(n4Var2.getX(), n4Var2.getY());
                                                rectF.offset(u0Var.getX(), u0Var.getY());
                                                b20Var.N.coordinates.x = (((rectF.centerX() * scaleX) + m10.w(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x10)) / q5Var.getMeasuredWidth()) * 100.0f;
                                                b20Var.N.coordinates.y = (((rectF.centerY() * scaleY) + m10.w(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y10)) / q5Var.getMeasuredHeight()) * 100.0f;
                                                b20Var.N.coordinates.w = ((rectF.width() * scaleX) / q5Var.getMeasuredWidth()) * 100.0f;
                                                b20Var.N.coordinates.h = ((rectF.height() * scaleY) / q5Var.getMeasuredHeight()) * 100.0f;
                                                b20Var.N.coordinates.rotation = ((-b20Var.e) / 3.141592653589793d) * 180.0d;
                                                d = r10;
                                            }
                                            mediaArea = b20Var.N;
                                            if (mediaArea != null && (mediaAreaCoordinates = mediaArea.coordinates) != null && d > 0.0d) {
                                                mediaAreaCoordinates.flags |= 1;
                                                mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                            }
                                            z14 = z17;
                                            z15 = z18;
                                        } else {
                                            if (nVar instanceof tg.p0) {
                                                tg.p0 p0Var = (tg.p0) nVar;
                                                tg.n0 n0Var2 = p0Var.s0;
                                                b20Var.a = (byte) 7;
                                                if (n0Var2.e()) {
                                                    b20Var.b = (byte) n0Var2.getPreviewType();
                                                } else {
                                                    b20Var.b = (byte) p0Var.getType();
                                                }
                                                b20Var.f = n0Var2.getWidth();
                                                b20Var.g = n0Var2.getHeight();
                                                b20Var.l = p0Var.v0 ? p0Var.getColor() : 0;
                                                b20Var.Q = n0Var2.e;
                                                b20Var.a0 = p0Var.w0;
                                                if (n0Var2.S) {
                                                    ImageReceiver imageReceiver5 = n0Var2.U;
                                                    if (n0Var2.S && imageReceiver5.K() && imageReceiver5.n() != null) {
                                                        org.telegram.messenger.ec.D().O(new BitmapDrawable(imageReceiver5.n()), imageReceiver5.R, false);
                                                    }
                                                    tg.m0 m0Var = b20Var.a0;
                                                    m0Var.a |= 4;
                                                    m0Var.i = n0Var2.getPhotoSide();
                                                }
                                                TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                                b20Var.N = tL_mediaAreaUrl;
                                                tg.m0 m0Var2 = p0Var.w0;
                                                if (m0Var2 != null) {
                                                    TLRPC.WebPage webPage = m0Var2.d;
                                                    tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? p0Var.w0.c : p0Var.w0.d.url;
                                                    b20Var.N.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                            } else {
                                                if (nVar instanceof tg.v1) {
                                                    tg.v1 v1Var2 = (tg.v1) nVar;
                                                    b20Var.a = (byte) 4;
                                                    TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                    b20Var.N = tL_mediaAreaSuggestedReaction;
                                                    ch.p0 currentReaction = v1Var2.getCurrentReaction();
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
                                                    b20Var.N.dark = v1Var2.t0.a == 1;
                                                    b20Var.N.flipped = v1Var2.A0;
                                                    b20Var.N.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                } else if (nVar instanceof tg.w1) {
                                                    tg.w1 w1Var = (tg.w1) nVar;
                                                    xt0 baseSize3 = w1Var.getBaseSize();
                                                    b20Var.f = baseSize3.a;
                                                    b20Var.g = baseSize3.b;
                                                    b20Var.a = (byte) 5;
                                                    if (x7Var != null) {
                                                        b20Var.j = x7Var.o0.getAbsolutePath();
                                                        b20Var.R = x7Var.r0;
                                                        long j3 = x7Var.q0;
                                                        b20Var.U = j3;
                                                        float f16 = j3;
                                                        b20Var.S = (long) (x7Var.s0 * f16);
                                                        b20Var.T = (long) (x7Var.t0 * f16);
                                                    }
                                                    b20Var.b = (byte) 4;
                                                    if (w1Var.q()) {
                                                        b20Var.b = (byte) (b20Var.b | 2);
                                                    }
                                                } else if (nVar instanceof tg.z0) {
                                                    tg.z0 z0Var3 = (tg.z0) nVar;
                                                    di.n4 n4Var3 = z0Var3.s0;
                                                    ArrayList arrayList3 = z0Var3.u0;
                                                    tg.u0 u0Var2 = z0Var3.t0;
                                                    b20Var.a = (byte) 6;
                                                    int width = z0Var3.getWidth();
                                                    b20Var.q = width;
                                                    b20Var.f = width;
                                                    int height = z0Var3.getHeight();
                                                    b20Var.r = height;
                                                    b20Var.g = height;
                                                    fj fjVar = arrayList3.size() > 0 ? (fj) arrayList3.get(0) : null;
                                                    if (fjVar != null && (message = fjVar.k) != null) {
                                                        TLRPC.MessageAction messageAction = message.action;
                                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                            TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                            TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                            b20Var.N = tL_mediaAreaStarGift;
                                                            tL_mediaAreaStarGift.slug = starGift.slug;
                                                            tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                            int i22 = 0;
                                                            while (true) {
                                                                if (i22 >= u0Var2.getChildCount()) {
                                                                    v0Var = null;
                                                                    break;
                                                                }
                                                                View childAt2 = u0Var2.getChildAt(i22);
                                                                if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                                                                    v0Var = (org.telegram.ui.Cells.v0) childAt2;
                                                                    break;
                                                                }
                                                                i22++;
                                                            }
                                                            if (v0Var == null || (h6Var = v0Var.I0) == null || (imageReceiver3 = h6Var.d) == null) {
                                                                z0Var = z0Var3;
                                                                n4Var = n4Var3;
                                                                view = childAt;
                                                                imageReceiver = null;
                                                                if (z12) {
                                                                    if (x7Var != null) {
                                                                        Matrix matrix = x7Var.n0;
                                                                        if (x7Var.K) {
                                                                            matrix.reset();
                                                                            if (u0Var2.getChildCount() == 1) {
                                                                                view3 = u0Var2.getChildAt(0);
                                                                                if (view3 instanceof org.telegram.ui.Cells.r1) {
                                                                                    imageReceiver2 = ((org.telegram.ui.Cells.r1) view3).getPhotoImage();
                                                                                    if (imageReceiver2 != null) {
                                                                                        float max = Math.max(imageReceiver2.x() / Math.max(1, x7Var.k0), imageReceiver2.w() / Math.max(1, x7Var.l0));
                                                                                        matrix.postScale(max, max);
                                                                                        matrix.postTranslate(imageReceiver2.r() - ((x7Var.k0 * max) / 2.0f), imageReceiver2.s() - ((x7Var.l0 * max) / 2.0f));
                                                                                        matrix.postTranslate(n4Var.getX(), n4Var.getY());
                                                                                        matrix.postTranslate(u0Var2.getX(), u0Var2.getY());
                                                                                        matrix.postTranslate(view3.getX(), view3.getY());
                                                                                        matrix.postScale(z0Var.getScaleX(), z0Var.getScaleY(), z0Var.getPivotX(), z0Var.getPivotY());
                                                                                        matrix.postRotate(z0Var.getRotation(), z0Var.getPivotX(), z0Var.getPivotY());
                                                                                        matrix.postTranslate(z0Var.getX(), z0Var.getY());
                                                                                        matrix.postScale(1.0f / q5Var.getWidth(), 1.0f / q5Var.getHeight());
                                                                                        matrix.postScale(x7Var.i0, x7Var.j0);
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
                                                                arrayList.add(b20Var);
                                                                scaleX = view.getScaleX();
                                                                float scaleY2 = view.getScaleY();
                                                                float x102 = view.getX();
                                                                float y102 = view.getY();
                                                                b20Var.q = view.getWidth();
                                                                b20Var.r = view.getHeight();
                                                                b20Var.f = (view.getWidth() * scaleX) / q5Var.getMeasuredWidth();
                                                                b20Var.g = (view.getHeight() * scaleY2) / q5Var.getMeasuredHeight();
                                                                b20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102) / q5Var.getMeasuredWidth();
                                                                b20Var.d = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y102) / q5Var.getMeasuredHeight();
                                                                b20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                b20Var.y = ((view.getWidth() / 2.0f) + x102) / q5Var.getMeasuredWidth();
                                                                b20Var.z = ((view.getHeight() / 2.0f) + y102) / q5Var.getMeasuredHeight();
                                                                b20Var.w = b20Var.q / q5Var.getMeasuredWidth();
                                                                b20Var.x = b20Var.r / q5Var.getMeasuredHeight();
                                                                b20Var.v = scaleX;
                                                                if (nVar instanceof tg.z0) {
                                                                }
                                                                mediaArea = b20Var.N;
                                                                if (mediaArea != null) {
                                                                    mediaAreaCoordinates.flags |= 1;
                                                                    mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                                                }
                                                                z14 = z17;
                                                                z15 = z18;
                                                            } else {
                                                                imageReceiver3.P0(false, false);
                                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) di.y8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                                if (stargiftattributemodel != null) {
                                                                    float L = org.telegram.messenger.g0.L(110.0f);
                                                                    float r11 = imageReceiver3.r() + v0Var.getX() + u0Var2.getX() + v0Var.G0;
                                                                    float s5 = imageReceiver3.s() + v0Var.getY() + u0Var2.getY() + v0Var.H0;
                                                                    z0Var = z0Var3;
                                                                    b20 b20Var2 = new b20();
                                                                    b20Var2.a = (byte) 0;
                                                                    b20Var2.f = L;
                                                                    b20Var2.g = L;
                                                                    TLRPC.Document document2 = stargiftattributemodel.document;
                                                                    b20Var2.B = document2;
                                                                    b20Var2.C = starGift;
                                                                    org.telegram.messenger.w7.G(i10.t0);
                                                                    b20Var2.j = org.telegram.messenger.w7.K(document2, true).getAbsolutePath();
                                                                    if (fj.K2(document2, true) || w0(document2)) {
                                                                        boolean K25 = fj.K2(document2, true);
                                                                        b20Var2.b = (byte) (b20Var2.b | (K25 ? (byte) 1 : (byte) 4));
                                                                        nh0 C = imageReceiver3.C();
                                                                        if (C != null && (K25 || w0(document2))) {
                                                                            r21 = C.r();
                                                                        }
                                                                        if (r21 != 0) {
                                                                            BigInteger valueOf3 = BigInteger.valueOf(r21);
                                                                            v5Var.Q0 = v5Var.Q0.multiply(valueOf3).divide(v5Var.Q0.gcd(valueOf3));
                                                                        }
                                                                    }
                                                                    float scaleX2 = childAt.getScaleX();
                                                                    float scaleY3 = childAt.getScaleY();
                                                                    float x11 = childAt.getX();
                                                                    float y11 = childAt.getY();
                                                                    int i23 = (int) L;
                                                                    b20Var2.q = i23;
                                                                    b20Var2.r = i23;
                                                                    b20Var2.f = (L * scaleX2) / q5Var.getMeasuredWidth();
                                                                    b20Var2.g = (L * scaleY3) / q5Var.getMeasuredHeight();
                                                                    b20Var2.c = (childAt.getWidth() / 2.0f) + x11;
                                                                    b20Var2.d = (childAt.getHeight() / 2.0f) + y11;
                                                                    float w10 = m10.w(childAt.getWidth(), 2.0f, scaleX2, r11 * scaleX2);
                                                                    n4Var = n4Var3;
                                                                    imageReceiver4 = imageReceiver3;
                                                                    view = childAt;
                                                                    double d2 = w10;
                                                                    double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                    double w11 = m10.w(childAt.getHeight(), 2.0f, scaleY3, s5 * scaleY3);
                                                                    b20Var2.c = (float) (((Math.cos(rotation) * d2) - (Math.sin(rotation) * w11)) + b20Var2.c);
                                                                    float cos = (float) ((Math.cos(rotation) * w11) + (Math.sin(rotation) * d2) + b20Var2.d);
                                                                    float f17 = (-L) / 2.0f;
                                                                    float f18 = (f17 * scaleX2) + b20Var2.c;
                                                                    b20Var2.c = f18;
                                                                    b20Var2.d = (f17 * scaleY3) + cos;
                                                                    b20Var2.c = f18 / q5Var.getMeasuredWidth();
                                                                    b20Var2.d /= q5Var.getMeasuredHeight();
                                                                    b20Var2.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                    b20Var2.v = scaleX2;
                                                                    arrayList.add(b20Var2);
                                                                } else {
                                                                    z0Var = z0Var3;
                                                                    n4Var = n4Var3;
                                                                    imageReceiver4 = imageReceiver3;
                                                                    view = childAt;
                                                                }
                                                                imageReceiver = imageReceiver4;
                                                                if (z12) {
                                                                }
                                                                z17 = true;
                                                                arrayList.add(b20Var);
                                                                scaleX = view.getScaleX();
                                                                float scaleY22 = view.getScaleY();
                                                                float x1022 = view.getX();
                                                                float y1022 = view.getY();
                                                                b20Var.q = view.getWidth();
                                                                b20Var.r = view.getHeight();
                                                                b20Var.f = (view.getWidth() * scaleX) / q5Var.getMeasuredWidth();
                                                                b20Var.g = (view.getHeight() * scaleY22) / q5Var.getMeasuredHeight();
                                                                b20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022) / q5Var.getMeasuredWidth();
                                                                b20Var.d = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y1022) / q5Var.getMeasuredHeight();
                                                                b20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                b20Var.y = ((view.getWidth() / 2.0f) + x1022) / q5Var.getMeasuredWidth();
                                                                b20Var.z = ((view.getHeight() / 2.0f) + y1022) / q5Var.getMeasuredHeight();
                                                                b20Var.w = b20Var.q / q5Var.getMeasuredWidth();
                                                                b20Var.x = b20Var.r / q5Var.getMeasuredHeight();
                                                                b20Var.v = scaleX;
                                                                if (nVar instanceof tg.z0) {
                                                                }
                                                                mediaArea = b20Var.N;
                                                                if (mediaArea != null) {
                                                                }
                                                                z14 = z17;
                                                                z15 = z18;
                                                            }
                                                        }
                                                    }
                                                    z0Var = z0Var3;
                                                    n4Var = n4Var3;
                                                    view = childAt;
                                                    if (fjVar != null) {
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                        b20Var.N = tL_inputMediaAreaChannelPost;
                                                        tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        ((TL_stories.TL_inputMediaAreaChannelPost) b20Var.N).channel = mp.u1(i16).j1(-x7.p(fjVar));
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) b20Var.N;
                                                        Boolean D = x7.D(fjVar);
                                                        tL_inputMediaAreaChannelPost2.msg_id = D == null ? 0 : D.booleanValue() ? fjVar.k.fwd_from.channel_post : fjVar.e1();
                                                    } else {
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                        b20Var.N = tL_inputMediaAreaChannelPost3;
                                                        tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    }
                                                    imageReceiver = null;
                                                    if (z12) {
                                                    }
                                                    z17 = true;
                                                    arrayList.add(b20Var);
                                                    scaleX = view.getScaleX();
                                                    float scaleY222 = view.getScaleY();
                                                    float x10222 = view.getX();
                                                    float y10222 = view.getY();
                                                    b20Var.q = view.getWidth();
                                                    b20Var.r = view.getHeight();
                                                    b20Var.f = (view.getWidth() * scaleX) / q5Var.getMeasuredWidth();
                                                    b20Var.g = (view.getHeight() * scaleY222) / q5Var.getMeasuredHeight();
                                                    b20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10222) / q5Var.getMeasuredWidth();
                                                    b20Var.d = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y10222) / q5Var.getMeasuredHeight();
                                                    b20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                    b20Var.y = ((view.getWidth() / 2.0f) + x10222) / q5Var.getMeasuredWidth();
                                                    b20Var.z = ((view.getHeight() / 2.0f) + y10222) / q5Var.getMeasuredHeight();
                                                    b20Var.w = b20Var.q / q5Var.getMeasuredWidth();
                                                    b20Var.x = b20Var.r / q5Var.getMeasuredHeight();
                                                    b20Var.v = scaleX;
                                                    if (nVar instanceof tg.z0) {
                                                    }
                                                    mediaArea = b20Var.N;
                                                    if (mediaArea != null) {
                                                    }
                                                    z14 = z17;
                                                    z15 = z18;
                                                }
                                                view = childAt;
                                                z16 = true;
                                                z17 = true;
                                                imageReceiver = null;
                                                arrayList.add(b20Var);
                                                scaleX = view.getScaleX();
                                                float scaleY2222 = view.getScaleY();
                                                float x102222 = view.getX();
                                                float y102222 = view.getY();
                                                b20Var.q = view.getWidth();
                                                b20Var.r = view.getHeight();
                                                b20Var.f = (view.getWidth() * scaleX) / q5Var.getMeasuredWidth();
                                                b20Var.g = (view.getHeight() * scaleY2222) / q5Var.getMeasuredHeight();
                                                b20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102222) / q5Var.getMeasuredWidth();
                                                b20Var.d = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y102222) / q5Var.getMeasuredHeight();
                                                b20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                b20Var.y = ((view.getWidth() / 2.0f) + x102222) / q5Var.getMeasuredWidth();
                                                b20Var.z = ((view.getHeight() / 2.0f) + y102222) / q5Var.getMeasuredHeight();
                                                b20Var.w = b20Var.q / q5Var.getMeasuredWidth();
                                                b20Var.x = b20Var.r / q5Var.getMeasuredHeight();
                                                b20Var.v = scaleX;
                                                if (nVar instanceof tg.z0) {
                                                }
                                                mediaArea = b20Var.N;
                                                if (mediaArea != null) {
                                                }
                                                z14 = z17;
                                                z15 = z18;
                                            }
                                            b10 = 1;
                                            i13 = 0;
                                            i15 = i12 + 1;
                                            v5Var = this;
                                            b11 = b10;
                                            i14 = i13;
                                            q5Var2 = q5Var;
                                            childCount = i11;
                                        }
                                    }
                                    view = childAt;
                                    z16 = false;
                                    z17 = true;
                                    imageReceiver = null;
                                    arrayList.add(b20Var);
                                    scaleX = view.getScaleX();
                                    float scaleY22222 = view.getScaleY();
                                    float x1022222 = view.getX();
                                    float y1022222 = view.getY();
                                    b20Var.q = view.getWidth();
                                    b20Var.r = view.getHeight();
                                    b20Var.f = (view.getWidth() * scaleX) / q5Var.getMeasuredWidth();
                                    b20Var.g = (view.getHeight() * scaleY22222) / q5Var.getMeasuredHeight();
                                    b20Var.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022222) / q5Var.getMeasuredWidth();
                                    b20Var.d = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y1022222) / q5Var.getMeasuredHeight();
                                    b20Var.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                    b20Var.y = ((view.getWidth() / 2.0f) + x1022222) / q5Var.getMeasuredWidth();
                                    b20Var.z = ((view.getHeight() / 2.0f) + y1022222) / q5Var.getMeasuredHeight();
                                    b20Var.w = b20Var.q / q5Var.getMeasuredWidth();
                                    b20Var.x = b20Var.r / q5Var.getMeasuredHeight();
                                    b20Var.v = scaleX;
                                    if (nVar instanceof tg.z0) {
                                    }
                                    mediaArea = b20Var.N;
                                    if (mediaArea != null) {
                                    }
                                    z14 = z17;
                                    z15 = z18;
                                } else {
                                    q5Var = q5Var2;
                                    i11 = childCount;
                                    i12 = i15;
                                    view = childAt;
                                    z14 = true;
                                    z15 = false;
                                    imageReceiver = null;
                                }
                                if (z14 && ((z11 || (z12 && b20Var.a == 6)) && bitmap != null)) {
                                    Canvas canvas2 = new Canvas(bitmap);
                                    float width2 = bitmap.getWidth() / q5Var.getMeasuredWidth();
                                    int i24 = 0;
                                    while (i24 < 2) {
                                        Canvas canvas3 = i24 == 0 ? canvas2 : null;
                                        if (canvas3 == null || (i24 == 0 && z15)) {
                                            canvas = canvas2;
                                            view2 = view;
                                        } else {
                                            canvas3.save();
                                            canvas3.scale(width2, width2);
                                            canvas3.translate(b20Var.c * q5Var.getMeasuredWidth(), b20Var.d * q5Var.getMeasuredHeight());
                                            canvas3.scale(view.getScaleX(), view.getScaleY());
                                            canvas3.rotate(view.getRotation(), ((b20Var.f / 2.0f) / view.getScaleX()) * q5Var.getMeasuredWidth(), ((b20Var.g / 2.0f) / view.getScaleY()) * q5Var.getMeasuredHeight());
                                            view2 = view;
                                            if (!(view2 instanceof tg.q2) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                                canvas = canvas2;
                                                if (view2 instanceof tg.z0) {
                                                    tg.z0 z0Var4 = (tg.z0) view2;
                                                    tg.u0 u0Var3 = z0Var4.t0;
                                                    boolean z22 = true;
                                                    z0Var4.w0 = true;
                                                    int i25 = 0;
                                                    while (i25 < u0Var3.getChildCount()) {
                                                        View childAt3 = u0Var3.getChildAt(i25);
                                                        if (childAt3 instanceof org.telegram.ui.Cells.r1) {
                                                            ((org.telegram.ui.Cells.r1) childAt3).Hc = z22;
                                                        }
                                                        i25++;
                                                        z22 = true;
                                                    }
                                                    view2.draw(canvas3);
                                                    boolean z23 = false;
                                                    z0Var4.w0 = false;
                                                    int i26 = 0;
                                                    while (i26 < u0Var3.getChildCount()) {
                                                        View childAt4 = u0Var3.getChildAt(i26);
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
                                        imageReceiver.P0(true, false);
                                        i15 = i12 + 1;
                                        v5Var = this;
                                        b11 = b10;
                                        i14 = i13;
                                        q5Var2 = q5Var;
                                        childCount = i11;
                                    }
                                }
                                b10 = 1;
                                i13 = 0;
                                i15 = i12 + 1;
                                v5Var = this;
                                b11 = b10;
                                i14 = i13;
                                q5Var2 = q5Var;
                                childCount = i11;
                            } else if (arrayList != null) {
                                ((tg.d) nVar).y(q5Var2.getMeasuredWidth(), q5Var2.getMeasuredHeight(), arrayList);
                            }
                        }
                        i13 = i14;
                        q5Var = q5Var2;
                        i11 = childCount;
                        i12 = i15;
                        b10 = b11;
                        i15 = i12 + 1;
                        v5Var = this;
                        b11 = b10;
                        i14 = i13;
                        q5Var2 = q5Var;
                        childCount = i11;
                    }
                }
                return bitmap;
            }
            Bitmap c11 = p5Var.c(false, false);
            createBitmap = c11 != null ? Bitmap.createBitmap(c11.getWidth(), c11.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        v5Var.Q0 = BigInteger.ONE;
        i10 = 0;
        while (i7 < q5Var2.getChildCount()) {
        }
        if (i10 > 0) {
        }
        return bitmap;
    }

    public void setBlurManager(org.telegram.ui.Components.ba baVar) {
        this.O1 = baVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.a2 != z10) {
            this.a2 = z10;
            if (z10) {
                D0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j3) {
        int i7 = 0;
        while (true) {
            q5 q5Var = this.B0;
            if (i7 >= q5Var.getChildCount()) {
                return;
            }
            View childAt = q5Var.getChildAt(i7);
            if (childAt instanceof tg.j2) {
                ImageReceiver imageReceiver = ((tg.j2) childAt).z0;
                nh0 C = imageReceiver.C();
                imageReceiver.m();
                if (C != null) {
                    C.N(Math.round(((j3 % C.r()) / C.r()) * C.e[0]), true, false);
                }
            }
            i7++;
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.I1) {
            this.I1 = z10;
            e0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.v1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.u1 = runnable;
    }

    @Override // tg.h1
    public final void t() {
        if (!this.f2 && !this.e2) {
            this.Z1 = true;
            n0(true);
            return;
        }
        if (this.e2) {
            tg.n nVar = this.t0;
            if (nVar instanceof tg.q2) {
                this.y1.e = true;
                org.telegram.messenger.g0.I3(((tg.q2) nVar).getEditText());
            }
        }
        J0(!this.e2 ? 1 : 0);
    }

    public final boolean t0() {
        return this.n0.a() || this.Z1;
    }

    @Override // tg.l
    public final boolean u(tg.n nVar) {
        return D0(nVar, true);
    }

    public final void u0(boolean z10) {
        int i7 = 0;
        if (this.e2) {
            J0(0);
        }
        if (z10) {
            qy qyVar = this.d2;
            if (qyVar == null || qyVar.getVisibility() != 0) {
                v0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.d2.getMeasuredHeight());
            ofFloat.addUpdateListener(new n4(this, i7));
            this.g2 = true;
            ofFloat.addListener(new h5(this, 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.cu0, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        this.o1.setColor(-15132391);
    }

    @Override // tg.l
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

    public final void v0() {
        qy qyVar;
        if (!this.e2 && (qyVar = this.d2) != null && qyVar.getVisibility() != 8) {
            this.d2.setVisibility(8);
        }
        int i7 = this.h2;
        this.h2 = 0;
        if (i7 != 0) {
            this.y1.a();
        }
    }

    @Override // tg.l1
    public final void w(sg.h hVar) {
        boolean z10 = hVar instanceof sg.b;
        tg.r1 r1Var = this.N0;
        if (z10 || (hVar instanceof sg.d)) {
            r1Var.b(0.4f, 1.75f);
        } else {
            r1Var.b(0.05f, 1.0f);
        }
        r1Var.setDrawCenter(!(hVar instanceof sg.g));
        p5 p5Var = this.y0;
        if (p5Var.getCurrentBrush() instanceof sg.g) {
            this.M0 = true;
        }
        p5Var.setBrush(hVar);
        sg.g1 g1Var = this.k1;
        int i7 = g1Var.a;
        g1Var.a = sg.j0.e(this.p1).c();
        g1Var.c = this.O0.get();
        E0(g1Var, Integer.valueOf(i7), false);
        this.z0.invalidate();
    }

    @Override // tg.l1
    public final sg.j0 x() {
        return sg.j0.e(this.p1);
    }

    public final boolean x0() {
        if (this.M1) {
            if (this.J1.getReactionsWindow() == null || this.J1.getReactionsWindow().q) {
                O0(false);
                return true;
            }
            this.J1.e();
            return true;
        }
        if (this.l1) {
            I0(false);
            return true;
        }
        if (this.e2) {
            u0(true);
            return true;
        }
        if (!this.u0) {
            return false;
        }
        if (!this.w0) {
            D0(null, true);
            return true;
        }
        this.w0 = false;
        this.y1.b(true);
        return false;
    }

    public abstract void y0(boolean z10);

    public final void z0() {
        int i7 = this.I0;
        R0(1);
        postDelayed(new ai.k(this, 18), 350L);
        j5 j5Var = new j5(this, getContext(), this.q1, i7);
        this.Y1 = j5Var;
        mb mbVar = this.w1;
        Objects.requireNonNull(mbVar);
        j5Var.x1 = new bi.b(mbVar, 29);
        int i10 = 0;
        boolean[] zArr = {true};
        j5Var.setOnDismissListener(new a5(this, zArr, i7, i10));
        j5Var.z1 = new u4(this);
        j5Var.P0(new b5(this, zArr, j5Var, i10));
        j5Var.show();
        y0(true);
    }

    public View getView() {
        return this;
    }

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f10) {
    }
}

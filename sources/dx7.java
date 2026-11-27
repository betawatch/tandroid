// default package

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class dx7 extends xma implements qv7, f44, lv7, vma, nbb {
    public final ow7 A0;
    public ArrayList A1;
    public final zw7 B0;
    public int B1;
    public final FrameLayout C0;
    public int C1;
    public final ax7 D0;
    public sm2 D1;
    public final ow7 E0;
    public final boolean E1;
    public final FrameLayout F0;
    public final File F1;
    public g7 G0;
    public final boolean G1;
    public final View H0;
    public final boolean H1;
    public int I0;
    public boolean I1;
    public int J0;
    public i49 J1;
    public float K0;
    public s39 K1;
    public ValueAnimator L0;
    public float L1;
    public boolean M0;
    public boolean M1;
    public final gx7 N0;
    public boolean N1;
    public final xh4 O0;
    public tl0 O1;
    public final int P0;
    public final o00 P1;
    public BigInteger Q0;
    public final gbb Q1;
    public TextView R0;
    public boolean R1;
    public TextView S0;
    public ObjectAnimator S1;
    public TextView T0;
    public boolean T1;
    public final rv7 U0;
    public final gc1 U1;
    public final nv7 V0;
    public final c8b V1;
    public final zv7 W0;
    public final kj4 W1;
    public final ImageView X0;
    public final float[] X1;
    public final TextView Y0;
    public tw7 Y1;
    public final TextView Z0;
    public boolean Z1;
    public final TextView a1;
    public boolean a2;
    public final Paint b1;
    public boolean b2;
    public final Paint c1;
    public final int[] c2;
    public float d1;
    public o24 d2;
    public boolean e1;
    public boolean e2;
    public vpa f1;
    public boolean f2;
    public final pw7 g1;
    public boolean g2;
    public final Paint h1;
    public int h2;
    public final Paint i1;
    public boolean i2;
    public final Paint j1;
    public int j2;
    public final dv7 k0;
    public final igb k1;
    public int k2;
    public final iv7 l0;
    public boolean l1;
    public int l2;
    public final Bitmap m0;
    public vpa m1;
    public boolean m2;
    public final a9c n0;
    public float n1;
    public final uo3 o0;
    public final Paint o1;
    public final fo6 p0;
    public final int p1;
    public boolean q0;
    public final uk5 q1;
    public qma r0;
    public n8 r1;
    public boolean s0;
    public cx7 s1;
    public h44 t0;
    public Rect t1;
    public boolean u0;
    public Runnable u1;
    public int v0;
    public Runnable v1;
    public boolean w0;
    public final qbb w1;
    public final boolean x0;
    public AnimatorSet x1;
    public final yw7 y0;
    public final qw7 y1;
    public final tb z0;
    public c8b z1;

    public dx7(Context context, boolean z, File file, boolean z2, boolean z3, qbb qbbVar, Activity activity, final int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, c8b c8bVar, int i3, int i4, fo6 fo6Var, tl0 tl0Var, x53 x53Var, o00 o00Var, gbb gbbVar) {
        super(context, activity);
        nx7 nx7Var;
        tl0 tl0Var2;
        int i5;
        this.I0 = 0;
        this.J0 = -1;
        final vab vabVar = (vab) this;
        xh4 xh4Var = new xh4((Object) vabVar, (byte) 19);
        this.O0 = xh4Var;
        Paint paint = new Paint(1);
        this.b1 = paint;
        Paint paint2 = new Paint(1);
        this.c1 = paint2;
        this.h1 = new Paint(1);
        this.i1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.j1 = paint3;
        igb igbVar = new igb(1.0f, 0.016773745f, -1);
        this.k1 = igbVar;
        this.o1 = new Paint(1);
        kj4 kj4Var = new kj4((Object) vabVar, (byte) 22);
        this.W1 = kj4Var;
        this.X1 = new float[2];
        this.a2 = false;
        this.c2 = new int[2];
        new ki7(vabVar, (byte) 3);
        setDelegate(this);
        this.O1 = tl0Var;
        this.P1 = o00Var;
        this.E1 = z;
        this.F1 = file;
        this.G1 = z2;
        this.H1 = z3;
        this.w1 = qbbVar;
        this.B1 = i3;
        this.C1 = i4;
        this.Q1 = gbbVar;
        this.p1 = i;
        if (z2 && !z3 && c8bVar != null && c8bVar.L != null && !c8bVar.v()) {
            this.V1 = c8bVar;
            File file2 = c8bVar.L;
            gc1 gc1Var = (file2 != null && file2.exists() && DictationAsr.x(i) && qn3.h()) ? new gc1(file2, kj4Var) : null;
            this.U1 = gc1Var;
            if (gc1Var != null) {
                gc1Var.d = new ew7(vabVar, (byte) 0);
            }
        }
        uk5 uk5Var = new uk5(x53Var);
        this.q1 = uk5Var;
        this.p0 = fo6Var;
        this.x0 = context instanceof BubbleActivity;
        a78 e = a78.e(i);
        e.i(0, true);
        igbVar.a = e.c();
        igbVar.c = e.i;
        uo3 uo3Var = new uo3("Paint", true);
        this.o0 = uo3Var;
        this.m0 = bitmap;
        this.P0 = i2;
        a9c a9cVar = new a9c();
        this.n0 = a9cVar;
        a9cVar.a = new bm6(vabVar, (byte) 25);
        View view = new View(context);
        this.H0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        nx7 nx7Var2 = new nx7(getPaintingSize(), null, i2, tl0Var);
        if (c8bVar == null || !c8bVar.u) {
            nx7Var = nx7Var2;
            tl0Var2 = tl0Var;
        } else {
            nx7Var = nx7Var2;
            tl0Var2 = null;
        }
        yw7 yw7Var = new yw7(vabVar, context, nx7Var, bitmap, bitmap2, tl0Var2);
        this.y0 = yw7Var;
        byte b = 23;
        yw7Var.setDelegate(new aj3(vabVar, b));
        yw7Var.setUndoStore(a9cVar);
        yw7Var.setQueue(uo3Var);
        yw7Var.setVisibility(4);
        tb tbVar = new tb(b, context, vabVar);
        this.z0 = tbVar;
        tbVar.setVisibility(4);
        zw7 zw7Var = new zw7(vabVar, context, new v34(vabVar, (byte) 20));
        this.B0 = zw7Var;
        this.z1 = c8bVar;
        this.A1 = arrayList;
        if (this.B1 > 0 && this.C1 > 0) {
            G0();
        }
        zw7Var.setVisibility(4);
        this.A0 = new ow7(vabVar, context, (byte) 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.C0 = frameLayout;
        frameLayout.setPadding(hl.L(4.0f), hl.L(12.0f), hl.L(4.0f), hl.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{TLObject.FLAG_30, 0}));
        addView(frameLayout, tre.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(hl.L(3.0f), hl.L(3.0f), hl.L(3.0f), hl.L(3.0f));
        final byte b2 = 1;
        imageView.setBackground(aob.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: fw7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                vab vabVar2 = vabVar;
                switch (b3) {
                    case 0:
                        if (!vabVar2.l1) {
                            if (!vabVar2.e2) {
                                if (!vabVar2.u0) {
                                    Runnable runnable = vabVar2.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    vabVar2.C0(null, true);
                                    break;
                                }
                            } else {
                                vabVar2.s0(true);
                                break;
                            }
                        } else {
                            vabVar2.H0(false);
                            break;
                        }
                        break;
                    case 1:
                        yw7 yw7Var2 = vabVar2.y0;
                        if (yw7Var2 != null && (yw7Var2.getCurrentBrush() instanceof u01)) {
                            yw7Var2.b();
                            vabVar2.U0.setSelectedIndex(1);
                            vabVar2.s((v01) v01.a.get(0));
                            break;
                        } else {
                            vabVar2.n0.c();
                            break;
                        }
                        break;
                    case 2:
                        yw7 yw7Var3 = vabVar2.y0;
                        a9c a9cVar2 = vabVar2.n0;
                        if (a9cVar2.a()) {
                            if (yw7Var3 != null && (yw7Var3.getCurrentBrush() instanceof u01)) {
                                yw7Var3.b();
                                vabVar2.U0.setSelectedIndex(1);
                                vabVar2.s((v01) v01.a.get(0));
                            }
                            if (yw7Var3 != null) {
                                yw7Var3.a();
                            }
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            vabVar2.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        h44 h44Var = vabVar2.t0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (vabVar2.e2) {
                            vabVar2.s0(false);
                        }
                        vabVar2.B0(vabVar2.t0);
                        vabVar2.C0(null, true);
                        break;
                    default:
                        vabVar2.C0(null, true);
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, tre.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(aob.f0(822083583, 7, -1));
        linearLayout.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(ob6.M0(2131746994, null));
        linearLayout.addView(qd4.k(context, R.drawable.photo_zoomout), tre.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, tre.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new y00((byte) 12));
        frameLayout.addView(linearLayout, tre.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.Y0 = textView2;
        textView2.setBackground(aob.f0(822083583, 7, -1));
        textView2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        textView2.setText(ob6.M0(2131747006, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(hl.o());
        textView2.setTextSize(1, 16.0f);
        final byte b3 = 2;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: fw7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b3;
                vab vabVar2 = vabVar;
                switch (b32) {
                    case 0:
                        if (!vabVar2.l1) {
                            if (!vabVar2.e2) {
                                if (!vabVar2.u0) {
                                    Runnable runnable = vabVar2.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    vabVar2.C0(null, true);
                                    break;
                                }
                            } else {
                                vabVar2.s0(true);
                                break;
                            }
                        } else {
                            vabVar2.H0(false);
                            break;
                        }
                        break;
                    case 1:
                        yw7 yw7Var2 = vabVar2.y0;
                        if (yw7Var2 != null && (yw7Var2.getCurrentBrush() instanceof u01)) {
                            yw7Var2.b();
                            vabVar2.U0.setSelectedIndex(1);
                            vabVar2.s((v01) v01.a.get(0));
                            break;
                        } else {
                            vabVar2.n0.c();
                            break;
                        }
                        break;
                    case 2:
                        yw7 yw7Var3 = vabVar2.y0;
                        a9c a9cVar2 = vabVar2.n0;
                        if (a9cVar2.a()) {
                            if (yw7Var3 != null && (yw7Var3.getCurrentBrush() instanceof u01)) {
                                yw7Var3.b();
                                vabVar2.U0.setSelectedIndex(1);
                                vabVar2.s((v01) v01.a.get(0));
                            }
                            if (yw7Var3 != null) {
                                yw7Var3.a();
                            }
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            vabVar2.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        h44 h44Var = vabVar2.t0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (vabVar2.e2) {
                            vabVar2.s0(false);
                        }
                        vabVar2.B0(vabVar2.t0);
                        vabVar2.C0(null, true);
                        break;
                    default:
                        vabVar2.C0(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView l = ik8.l(frameLayout, textView2, tre.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.Z0 = l;
        l.setBackground(aob.f0(822083583, 7, -1));
        l.setText(ob6.M0(2131752066, null));
        l.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        l.setGravity(16);
        l.setTextColor(-1);
        l.setTypeface(hl.o());
        l.setTextSize(1, 16.0f);
        final byte b4 = 3;
        l.setOnClickListener(new View.OnClickListener() { // from class: fw7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b4;
                vab vabVar2 = vabVar;
                switch (b32) {
                    case 0:
                        if (!vabVar2.l1) {
                            if (!vabVar2.e2) {
                                if (!vabVar2.u0) {
                                    Runnable runnable = vabVar2.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    vabVar2.C0(null, true);
                                    break;
                                }
                            } else {
                                vabVar2.s0(true);
                                break;
                            }
                        } else {
                            vabVar2.H0(false);
                            break;
                        }
                        break;
                    case 1:
                        yw7 yw7Var2 = vabVar2.y0;
                        if (yw7Var2 != null && (yw7Var2.getCurrentBrush() instanceof u01)) {
                            yw7Var2.b();
                            vabVar2.U0.setSelectedIndex(1);
                            vabVar2.s((v01) v01.a.get(0));
                            break;
                        } else {
                            vabVar2.n0.c();
                            break;
                        }
                        break;
                    case 2:
                        yw7 yw7Var3 = vabVar2.y0;
                        a9c a9cVar2 = vabVar2.n0;
                        if (a9cVar2.a()) {
                            if (yw7Var3 != null && (yw7Var3.getCurrentBrush() instanceof u01)) {
                                yw7Var3.b();
                                vabVar2.U0.setSelectedIndex(1);
                                vabVar2.s((v01) v01.a.get(0));
                            }
                            if (yw7Var3 != null) {
                                yw7Var3.a();
                            }
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            vabVar2.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        h44 h44Var = vabVar2.t0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (vabVar2.e2) {
                            vabVar2.s0(false);
                        }
                        vabVar2.B0(vabVar2.t0);
                        vabVar2.C0(null, true);
                        break;
                    default:
                        vabVar2.C0(null, true);
                        break;
                }
            }
        });
        l.setAlpha(0.0f);
        l.setVisibility(8);
        TextView l2 = ik8.l(frameLayout, l, tre.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.a1 = l2;
        l2.setBackground(aob.f0(822083583, 7, -1));
        l2.setText(ob6.M0(2131751319, null));
        l2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        l2.setGravity(16);
        l2.setTextColor(-1);
        l2.setTypeface(hl.o());
        l2.setTextSize(1, 16.0f);
        final byte b5 = 4;
        l2.setOnClickListener(new View.OnClickListener() { // from class: fw7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b5;
                vab vabVar2 = vabVar;
                switch (b32) {
                    case 0:
                        if (!vabVar2.l1) {
                            if (!vabVar2.e2) {
                                if (!vabVar2.u0) {
                                    Runnable runnable = vabVar2.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    vabVar2.C0(null, true);
                                    break;
                                }
                            } else {
                                vabVar2.s0(true);
                                break;
                            }
                        } else {
                            vabVar2.H0(false);
                            break;
                        }
                        break;
                    case 1:
                        yw7 yw7Var2 = vabVar2.y0;
                        if (yw7Var2 != null && (yw7Var2.getCurrentBrush() instanceof u01)) {
                            yw7Var2.b();
                            vabVar2.U0.setSelectedIndex(1);
                            vabVar2.s((v01) v01.a.get(0));
                            break;
                        } else {
                            vabVar2.n0.c();
                            break;
                        }
                        break;
                    case 2:
                        yw7 yw7Var3 = vabVar2.y0;
                        a9c a9cVar2 = vabVar2.n0;
                        if (a9cVar2.a()) {
                            if (yw7Var3 != null && (yw7Var3.getCurrentBrush() instanceof u01)) {
                                yw7Var3.b();
                                vabVar2.U0.setSelectedIndex(1);
                                vabVar2.s((v01) v01.a.get(0));
                            }
                            if (yw7Var3 != null) {
                                yw7Var3.a();
                            }
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            vabVar2.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        h44 h44Var = vabVar2.t0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (vabVar2.e2) {
                            vabVar2.s0(false);
                        }
                        vabVar2.B0(vabVar2.t0);
                        vabVar2.C0(null, true);
                        break;
                    default:
                        vabVar2.C0(null, true);
                        break;
                }
            }
        });
        l2.setAlpha(0.0f);
        l2.setVisibility(8);
        frameLayout.addView(l2, tre.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ax7 ax7Var = new ax7(vabVar, context, e);
        this.D0 = ax7Var;
        ax7Var.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), 0);
        ax7Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(ax7Var, tre.e(-1, jn7.o1, 80));
        rv7 rv7Var = new rv7(context, (c8bVar == null || c8bVar.v() || c8bVar.u || tl0Var == null) ? false : true);
        this.U0 = rv7Var;
        rv7Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        rv7Var.setDelegate(this);
        rv7Var.setSelectedIndex(1);
        ax7Var.addView(rv7Var, tre.c(48.0f, -1));
        nv7 nv7Var = new nv7(context);
        this.V0 = nv7Var;
        nv7Var.setPadding(hl.L(16.0f), 0, hl.L(8.0f), 0);
        nv7Var.setVisibility(8);
        nv7Var.setDelegate(this);
        final byte b6 = 1;
        post(new Runnable() { // from class: gw7
            @Override // java.lang.Runnable
            public final void run() {
                byte b7 = b6;
                int i6 = i;
                vab vabVar2 = vabVar;
                switch (b7) {
                    case 0:
                        igb igbVar2 = vabVar2.k1;
                        vabVar2.E0(igbVar2);
                        a78.e(i6).j(igbVar2.c);
                        break;
                    default:
                        vabVar2.V0.setTypeface(a78.e(i6).j);
                        break;
                }
            }
        });
        nv7Var.setAlignment(a78.e(i).g);
        ax7Var.addView(nv7Var, tre.c(48.0f, -1));
        ow7 ow7Var = new ow7(vabVar, context, (byte) 0);
        this.E0 = ow7Var;
        addView(ow7Var, tre.c(-1.0f, -1));
        zv7 zv7Var = new zv7(context);
        this.W0 = zv7Var;
        zv7Var.setVisibility(8);
        byte b7 = 15;
        zv7Var.setOnItemClickListener(new zg4(vabVar, b7));
        nv7Var.setTypefaceListView(zv7Var);
        ow7Var.addView(zv7Var, tre.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(aob.v0(aob.G8, uk5Var));
        pw7 pw7Var = new pw7(vabVar, context);
        this.g1 = pw7Var;
        pw7Var.setVisibility(8);
        pw7Var.setColorPalette(a78.e(i));
        pw7Var.setColorListener(new hw(vabVar, (byte) 11));
        ax7Var.addView(pw7Var, tre.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        dv7 dv7Var = new dv7(context);
        this.k0 = dv7Var;
        dv7Var.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        dv7Var.setBackground(aob.f0(1090519039, 1, -1));
        ax7Var.addView(dv7Var, tre.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        final byte b8 = 0;
        dv7Var.setOnClickListener(new View.OnClickListener() { // from class: fw7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b8;
                vab vabVar2 = vabVar;
                switch (b32) {
                    case 0:
                        if (!vabVar2.l1) {
                            if (!vabVar2.e2) {
                                if (!vabVar2.u0) {
                                    Runnable runnable = vabVar2.v1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    vabVar2.C0(null, true);
                                    break;
                                }
                            } else {
                                vabVar2.s0(true);
                                break;
                            }
                        } else {
                            vabVar2.H0(false);
                            break;
                        }
                        break;
                    case 1:
                        yw7 yw7Var2 = vabVar2.y0;
                        if (yw7Var2 != null && (yw7Var2.getCurrentBrush() instanceof u01)) {
                            yw7Var2.b();
                            vabVar2.U0.setSelectedIndex(1);
                            vabVar2.s((v01) v01.a.get(0));
                            break;
                        } else {
                            vabVar2.n0.c();
                            break;
                        }
                        break;
                    case 2:
                        yw7 yw7Var3 = vabVar2.y0;
                        a9c a9cVar2 = vabVar2.n0;
                        if (a9cVar2.a()) {
                            if (yw7Var3 != null && (yw7Var3.getCurrentBrush() instanceof u01)) {
                                yw7Var3.b();
                                vabVar2.U0.setSelectedIndex(1);
                                vabVar2.s((v01) v01.a.get(0));
                            }
                            if (yw7Var3 != null) {
                                yw7Var3.a();
                            }
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            vabVar2.B0.removeAllViews();
                            break;
                        }
                        break;
                    case 3:
                        h44 h44Var = vabVar2.t0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (vabVar2.e2) {
                            vabVar2.s0(false);
                        }
                        vabVar2.B0(vabVar2.t0);
                        vabVar2.C0(null, true);
                        break;
                    default:
                        vabVar2.C0(null, true);
                        break;
                }
            }
        });
        iv7 iv7Var = new iv7(context);
        this.l0 = iv7Var;
        iv7Var.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        iv7Var.setBackground(aob.f0(1090519039, 1, -1));
        iv7Var.setOnClickListener(new lw4(vabVar, context, e, (byte) 12));
        ax7Var.addView(iv7Var, tre.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        gx7 gx7Var = new gx7(context);
        this.N0 = gx7Var;
        gx7Var.setColorSwatch(igbVar);
        gx7Var.setRenderView(yw7Var);
        gx7Var.setValueOverride(xh4Var);
        igbVar.c = xh4Var.get();
        final byte b9 = 0;
        gx7Var.setOnUpdate(new Runnable() { // from class: gw7
            @Override // java.lang.Runnable
            public final void run() {
                byte b72 = b9;
                int i6 = i;
                vab vabVar2 = vabVar;
                switch (b72) {
                    case 0:
                        igb igbVar2 = vabVar2.k1;
                        vabVar2.E0(igbVar2);
                        a78.e(i6).j(igbVar2.c);
                        break;
                    default:
                        vabVar2.V0.setTypeface(a78.e(i6).j);
                        break;
                }
            }
        });
        addView(gx7Var, tre.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.F0 = frameLayout2;
        addView(frameLayout2, tre.c(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(hl.L(2.0f));
        D0(igbVar, null, false);
        s((v01) v01.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = hl.q;
            i5 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), hl.L(100.0f), (int) (point.y * 0.65d))));
        } else {
            i5 = 1;
        }
        this.y1 = new qw7(vabVar, qbbVar, new v35(vabVar, qbbVar, b7));
        zw3.C1 = i5;
    }

    public static void F0(rlb rlbVar, int i) {
        rlbVar.setAlign(i);
        int i2 = 2;
        rlbVar.getEditText().setGravity(i != 1 ? i != 2 ? 19 : 21 : 17);
        if (i != 1) {
            boolean z = ob6.a0;
            if (i == 2 ? !z : z) {
                i2 = 3;
            }
        } else {
            i2 = 4;
        }
        rlbVar.getEditText().setTextAlignment(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.I0 == 2 ? this.V0 : this.U0;
    }

    private int getFrameRotation() {
        int i = this.P0;
        if (i == 90) {
            return 1;
        }
        if (i != 180) {
            return i != 270 ? 0 : 3;
        }
        return 2;
    }

    private qma getPaintingSize() {
        qma qmaVar = this.r0;
        if (qmaVar != null) {
            return qmaVar;
        }
        qma qmaVar2 = new qma(1080.0f, 1920.0f);
        this.r0 = qmaVar2;
        return qmaVar2;
    }

    private void setCoverPause(boolean z) {
        int i = 0;
        while (true) {
            zw7 zw7Var = this.B0;
            if (i >= zw7Var.getChildCount()) {
                return;
            }
            View childAt = zw7Var.getChildAt(i);
            if (childAt instanceof v3b) {
                ImageReceiver imageReceiver = ((v3b) childAt).z0;
                b29 y = imageReceiver.y();
                lm m = imageReceiver.m();
                boolean z2 = !z;
                imageReceiver.v0 = z2;
                imageReceiver.u0 = z2;
                if (y != null) {
                    if (z) {
                        y.stop();
                    } else {
                        y.start();
                    }
                } else if (m != null) {
                    m.E = z;
                    if (z) {
                        m.x(false);
                        m.stop();
                    } else {
                        m.start();
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i) {
        igb igbVar = this.k1;
        int i2 = igbVar.a;
        igbVar.a = i;
        D0(igbVar, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new cn(this, i2, i, (byte) 3));
        duration.start();
    }

    private void setTextType(int i) {
        this.v0 = i;
        h44 h44Var = this.t0;
        if (h44Var instanceof rlb) {
            ((rlb) h44Var).setType(i);
        }
        a78 e = a78.e(this.p1);
        e.h = i;
        e.a.edit().putInt("text_type", i).apply();
        this.V0.e(i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextWeightRange(h44 h44Var) {
        boolean z = h44Var instanceof kc1;
        gx7 gx7Var = this.N0;
        if (z) {
            gx7Var.b(0.3f, 1.1f);
        } else {
            gx7Var.b(0.5f, 2.0f);
        }
    }

    private void setupTabsLayout(Context context) {
        g7 g7Var = new g7(this, context);
        this.G0 = g7Var;
        final byte b = 0;
        g7Var.setClipToPadding(false);
        this.G0.setOrientation(0);
        this.D0.addView(this.G0, tre.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.R0 = textView;
        textView.setText(ob6.M0(2131747004, null).toUpperCase());
        TextView textView2 = this.R0;
        int i = aob.i6;
        uk5 uk5Var = this.q1;
        yob.R(textView2, aob.f0(aob.v0(i, uk5Var), 7, -1), null, yob.M(i), uk5Var);
        this.R0.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        this.R0.setTextColor(-1);
        final byte b2 = 1;
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(hl.o());
        this.R0.setSingleLine();
        final byte b3 = 2;
        this.R0.setOnClickListener(new View.OnClickListener(this) { // from class: bw7
            public final /* synthetic */ dx7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                dx7 dx7Var = this.b;
                switch (b4) {
                    case 0:
                        dx7Var.z0();
                        break;
                    case 1:
                        dx7Var.Q0(2);
                        if (!(dx7Var.t0 instanceof rlb)) {
                            dx7Var.Z1 = true;
                            dx7Var.l0(true);
                            break;
                        }
                        break;
                    default:
                        if (!dx7Var.u0) {
                            dx7Var.Q0(0);
                            break;
                        } else {
                            dx7Var.C0(null, true);
                            break;
                        }
                }
            }
        });
        this.G0.addView(this.R0, tre.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.S0 = textView3;
        textView3.setText(ob6.M0(2131747003, null).toUpperCase());
        yob.R(this.S0, aob.f0(aob.v0(i, uk5Var), 7, -1), null, yob.M(i), uk5Var);
        this.S0.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) { // from class: bw7
            public final /* synthetic */ dx7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b;
                dx7 dx7Var = this.b;
                switch (b4) {
                    case 0:
                        dx7Var.z0();
                        break;
                    case 1:
                        dx7Var.Q0(2);
                        if (!(dx7Var.t0 instanceof rlb)) {
                            dx7Var.Z1 = true;
                            dx7Var.l0(true);
                            break;
                        }
                        break;
                    default:
                        if (!dx7Var.u0) {
                            dx7Var.Q0(0);
                            break;
                        } else {
                            dx7Var.C0(null, true);
                            break;
                        }
                }
            }
        });
        this.S0.setTextColor(-1);
        this.S0.setTextSize(1, 14.0f);
        this.S0.setGravity(1);
        this.S0.setTypeface(hl.o());
        this.S0.setAlpha(0.6f);
        this.S0.setSingleLine();
        this.G0.addView(this.S0, tre.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.T0 = textView4;
        textView4.setText(ob6.M0(2131747002, null).toUpperCase());
        yob.R(this.T0, aob.f0(aob.v0(i, uk5Var), 7, -1), null, yob.M(i), uk5Var);
        this.T0.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        this.T0.setTextColor(-1);
        this.T0.setTextSize(1, 14.0f);
        this.T0.setGravity(1);
        this.T0.setTypeface(hl.o());
        this.T0.setAlpha(0.6f);
        this.T0.setSingleLine();
        this.T0.setOnClickListener(new View.OnClickListener(this) { // from class: bw7
            public final /* synthetic */ dx7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b2;
                dx7 dx7Var = this.b;
                switch (b4) {
                    case 0:
                        dx7Var.z0();
                        break;
                    case 1:
                        dx7Var.Q0(2);
                        if (!(dx7Var.t0 instanceof rlb)) {
                            dx7Var.Z1 = true;
                            dx7Var.l0(true);
                            break;
                        }
                        break;
                    default:
                        if (!dx7Var.u0) {
                            dx7Var.Q0(0);
                            break;
                        } else {
                            dx7Var.C0(null, true);
                            break;
                        }
                }
            }
        });
        this.G0.addView(this.T0, tre.l(1.0f, 0, -2));
    }

    public static boolean u0(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    @Override // f44
    public final void A(h44 h44Var) {
        N0(false);
        L0(h44Var);
    }

    public final void A0(h44 h44Var) {
        this.n0.b(h44Var.getUUID(), new hw7(this, h44Var, (byte) 0));
    }

    public final void B0(h44 h44Var) {
        h44 h44Var2 = this.t0;
        if (h44Var == h44Var2 && h44Var2 != null) {
            h44Var2.l(h44Var2.o0, false);
            C0(null, true);
            if (h44Var instanceof rlb) {
                ValueAnimator valueAnimator = this.L0;
                if (valueAnimator != null && this.J0 != 0) {
                    valueAnimator.cancel();
                }
                Q0(0);
            }
        }
        this.B0.removeView(h44Var);
        c0();
        if (h44Var != null) {
            UUID uuid = h44Var.getUUID();
            a9c a9cVar = this.n0;
            a9cVar.b.remove(uuid);
            a9cVar.c.remove(uuid);
            hl.c3(new azb(a9cVar, (byte) 7));
        }
        gx7 gx7Var = this.N0;
        xh4 xh4Var = this.O0;
        gx7Var.setValueOverride(xh4Var);
        gx7Var.setShowPreview(true);
        float f = xh4Var.get();
        igb igbVar = this.k1;
        igbVar.c = f;
        D0(igbVar, null, false);
        if (this.b2 || !(h44Var instanceof pp9)) {
            return;
        }
        rbb rbbVar = ((vab) this).o2;
        gbb gbbVar = rbbVar.Y0;
        if (gbbVar != null) {
            gbbVar.s(null, null, true);
        }
        vab vabVar = rbbVar.w1;
        if (vabVar != null) {
            vabVar.n0();
        }
        hbb hbbVar = rbbVar.d1;
        if (hbbVar != null) {
            hbbVar.setHasRoundVideo(false);
        }
        c8b c8bVar = rbbVar.L1;
        if (c8bVar != null) {
            File file = c8bVar.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                c8bVar = rbbVar.L1;
                c8bVar.o0 = null;
            }
            if (c8bVar.p0 != null) {
                try {
                    new File(rbbVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                rbbVar.L1.p0 = null;
            }
        }
    }

    public final boolean C0(h44 h44Var, boolean z) {
        boolean z2;
        ksb ksbVar;
        ksb ksbVar2;
        i49 i49Var;
        int i;
        boolean z3 = h44Var instanceof rlb;
        byte b = 2;
        if (z3 && ((i = this.J0) != -1 ? i != 2 : this.I0 != 2)) {
            ValueAnimator valueAnimator = this.L0;
            if (valueAnimator != null && i != 2) {
                valueAnimator.cancel();
            }
            if (this.l1) {
                H0(false);
            }
            Q0(2);
        }
        boolean z4 = true;
        if (z3 && z) {
            rlb rlbVar = (rlb) h44Var;
            int gravity = rlbVar.getEditText().getGravity();
            int i2 = gravity != 17 ? gravity != 21 ? 0 : 2 : 1;
            nv7 nv7Var = this.V0;
            nv7Var.setAlignment(i2);
            xv7 typeface = rlbVar.getTypeface();
            if (typeface != null) {
                nv7Var.setTypeface(typeface.a);
            }
            nv7Var.e(rlbVar.getType(), true);
            this.E0.invalidate();
        }
        h44 h44Var2 = this.t0;
        if (h44Var2 == null) {
            z2 = false;
        } else {
            if (h44Var2 == h44Var) {
                if (!h44Var.f0) {
                    if (h44Var instanceof sd6) {
                        sd6 sd6Var = (sd6) h44Var;
                        sd6Var.setType((sd6Var.getType() + 1) % sd6Var.getTypesCount());
                        return true;
                    }
                    if (h44Var instanceof xwc) {
                        xwc xwcVar = (xwc) h44Var;
                        xwcVar.setType((xwcVar.getType() + 1) % xwcVar.getTypesCount());
                        return true;
                    }
                    if (h44Var instanceof s66) {
                        s66 s66Var = (s66) h44Var;
                        h66 h66Var = s66Var.s0;
                        if (h66Var.e()) {
                            h66Var.setPreviewType(h66Var.getPreviewType() == 0 ? (byte) 1 : (byte) 0);
                            return true;
                        }
                        s66Var.setType(s66Var.getNextType());
                        return true;
                    }
                    if (!this.u0) {
                        if (h44Var instanceof rlb) {
                            this.w0 = true;
                            o0();
                            return true;
                        }
                        if (!(h44Var instanceof s39)) {
                            L0(h44Var2);
                            return true;
                        }
                        s39 s39Var = (s39) h44Var;
                        if (this.M1 && this.K1 == h44Var) {
                            s39Var.q(true);
                            return true;
                        }
                        s39 s39Var2 = this.K1;
                        if (s39Var2 != null && s39Var2 != s39Var && (i49Var = this.J1) != null) {
                            i49Var.animate().alpha(0.0f).setListener(new rw7(i49Var, r2));
                            this.J1 = null;
                            this.M1 = false;
                            this.L1 = 0.0f;
                        }
                        if (this.J1 == null) {
                            i49 i49Var2 = new i49(2, this.p1, new pu0(new x53(), b), getContext(), LaunchActivity.Q());
                            this.J1 = i49Var2;
                            xl0 xl0Var = new xl0(this.O1, i49Var2, 0, false);
                            this.J1.setPadding(0, hl.L(22.0f), 0, hl.L(22.0f));
                            this.w1.addView(this.J1, tre.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(vm2.o(-16777216, jn7.E1));
                            this.J1.setDelegate(new am2(this, xl0Var, paint));
                            this.J1.m(null, null, true);
                        }
                        this.J1.setFragment(LaunchActivity.Q());
                        this.K1 = s39Var;
                        N0(true);
                        return true;
                    }
                    if (h44Var2 instanceof rlb) {
                        hl.E3(((rlb) h44Var2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            h44Var2.l(h44Var2.o0, false);
            h44 h44Var3 = this.t0;
            if (h44Var3 instanceof rlb) {
                ((rlb) h44Var3).r();
                if (!z3) {
                    this.u0 = false;
                    hl.t1(((rlb) this.t0).getFocusedView());
                    s0(false);
                }
            } else if ((h44Var3 instanceof pp9) && (ksbVar2 = ((vab) this).o2.a1) != null) {
                ksbVar2.l(false);
            }
            z2 = true;
        }
        h44 h44Var4 = this.t0;
        this.t0 = h44Var;
        if ((h44Var4 instanceof rlb) && TextUtils.isEmpty(((rlb) h44Var4).getText()) && !(h44Var4 instanceof kc1)) {
            B0(h44Var4);
        }
        h44 h44Var5 = this.t0;
        if (h44Var4 != h44Var5 && (h44Var5 instanceof pp9) && (ksbVar = ((vab) this).o2.a1) != null) {
            ksbVar.l(true);
        }
        h44 h44Var6 = this.t0;
        xh4 xh4Var = this.O0;
        igb igbVar = this.k1;
        gx7 gx7Var = this.N0;
        if (h44Var6 != null) {
            ow7 ow7Var = this.A0;
            h44Var6.o0 = ow7Var;
            h44Var6.l(ow7Var, true);
            h44 h44Var7 = this.t0;
            if (h44Var7 instanceof rlb) {
                rlb rlbVar2 = (rlb) h44Var7;
                rlbVar2.getSwatch().c = igbVar.c;
                rlbVar2.B0 = false;
                E0(rlbVar2.getSwatch());
                float f = (int) (this.r0.a / 9.0f);
                setTextWeightRange(rlbVar2);
                gx7Var.setValueOverride(new ky5(rlbVar2, f, (byte) 1));
                gx7Var.setShowPreview(false);
            } else {
                gx7Var.setValueOverride(xh4Var);
                gx7Var.setShowPreview(true);
                igbVar.c = xh4Var.get();
                D0(igbVar, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.L0;
            if (valueAnimator2 != null && this.J0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.l1) {
                H0(false);
            }
            Q0(0);
            gx7Var.setValueOverride(xh4Var);
            gx7Var.setShowPreview(true);
            igbVar.c = xh4Var.get();
            D0(igbVar, null, false);
            z4 = z2;
        }
        T0();
        return z4;
    }

    @Override // lv7
    public final void D() {
        O0(true);
    }

    public final void D0(igb igbVar, Integer num, boolean z) {
        igb igbVar2 = this.k1;
        if (igbVar2 != igbVar) {
            igbVar2.a = igbVar.a;
            igbVar2.b = igbVar.b;
            igbVar2.c = igbVar.c;
            int i = this.p1;
            a78.e(i).h(igbVar.a, true);
            a78.e(i).j(igbVar.c);
        }
        int i2 = igbVar.a;
        yw7 yw7Var = this.y0;
        yw7Var.setColor(i2);
        yw7Var.setBrushSize(igbVar.c);
        int i3 = igbVar2.a;
        if (num == null || num.intValue() == i3) {
            ax7 ax7Var = this.D0;
            if (ax7Var != null) {
                ax7Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new e34(this, num, i3, (byte) 2));
            duration.start();
        }
        h44 h44Var = this.t0;
        if (h44Var instanceof rlb) {
            if (this.T1) {
                return;
            }
            ((rlb) h44Var).setSwatch(new igb(igbVar.b, igbVar.c, igbVar.a));
            return;
        }
        if (z) {
            if (h44Var instanceof sd6) {
                ((sd6) h44Var).setColor(igbVar.a);
                ((sd6) this.t0).setType(3);
            } else if (h44Var instanceof xwc) {
                ((xwc) h44Var).setColor(igbVar.a);
                ((xwc) this.t0).setType(3);
            } else if (h44Var instanceof s66) {
                ((s66) h44Var).setColor(igbVar.a);
                ((s66) this.t0).setType(0);
            }
        }
    }

    public final void E0(igb igbVar) {
        D0(igbVar, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View, android.view.ViewGroup, zw7] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    public final void G0() {
        int i;
        mec mecVar;
        float f;
        h44 h44Var;
        h44 h44Var2;
        mv3[] mv3VarArr;
        h44 h44Var3;
        ArrayList arrayList = this.A1;
        if (arrayList == null) {
            return;
        }
        c8b c8bVar = this.z1;
        this.z1 = null;
        this.A1 = null;
        int size = arrayList.size();
        boolean z = false;
        kc1 kc1Var = null;
        int i2 = 0;
        while (true) {
            ?? r15 = this.B0;
            if (i2 >= size) {
                r15.setVisibility(z ? 1 : 0);
                return;
            }
            mec mecVar2 = (mec) arrayList.get(i2);
            byte b = mecVar2.a;
            if (b == 11) {
                if (kc1Var != null) {
                    kc1Var.u(mecVar2.V, mecVar2.W, mecVar2.j, mecVar2.X);
                    i = i2;
                    i2 = i + 1;
                    z = false;
                } else {
                    kc1 e0 = e0();
                    e0.setType(mecVar2.b);
                    e0.setTypeface(mecVar2.n);
                    e0.setBaseFontSize(mecVar2.m);
                    F0(e0, mecVar2.p);
                    igb swatch = e0.getSwatch();
                    swatch.a = mecVar2.l;
                    e0.setSwatch(swatch);
                    e0.u(mecVar2.V, mecVar2.W, mecVar2.j, mecVar2.X);
                    f = 1.0f;
                    i = i2;
                    kc1Var = e0;
                    h44Var3 = e0;
                    mecVar = mecVar2;
                    h44Var = h44Var3;
                }
            } else if (b == 0) {
                ww7 k0 = k0(mecVar2.C, mecVar2.B);
                if ((mecVar2.b & 2) != 0) {
                    k0.r(z);
                }
                ViewGroup.LayoutParams layoutParams = k0.getLayoutParams();
                layoutParams.width = mecVar2.q;
                layoutParams.height = mecVar2.r;
                f = 1.0f;
                i = i2;
                h44Var3 = k0;
                mecVar = mecVar2;
                h44Var = h44Var3;
            } else {
                if (b == 1) {
                    rlb l0 = l0(z);
                    l0.setType(mecVar2.b);
                    l0.setTypeface(mecVar2.n);
                    l0.setBaseFontSize(mecVar2.m);
                    SpannableString spannableString = new SpannableString(mecVar2.j);
                    ArrayList arrayList2 = mecVar2.k;
                    int size2 = arrayList2.size();
                    ?? r3 = arrayList2;
                    for (?? r6 = z; r6 < size2; r6++) {
                        lec lecVar = (lec) r3.get(r6);
                        Object obj = r3;
                        hm hmVar = new hm(lecVar.document_id, 1.0f, l0.getFontMetricsInt());
                        int i3 = lecVar.offset;
                        spannableString.setSpan(hmVar, i3, lecVar.length + i3, 33);
                        i2 = i2;
                        r3 = obj;
                    }
                    i = i2;
                    CharSequence m = pv3.m(spannableString, l0.getFontMetricsInt(), false, null, 0);
                    if ((m instanceof Spanned) && (mv3VarArr = (mv3[]) ((Spanned) m).getSpans(0, m.length(), mv3.class)) != null) {
                        for (mv3 mv3Var : mv3VarArr) {
                            mv3Var.b = 0.85f;
                        }
                    }
                    l0.setText(m);
                    F0(l0, mecVar2.p);
                    igb swatch2 = l0.getSwatch();
                    swatch2.a = mecVar2.l;
                    l0.setSwatch(swatch2);
                    h44Var2 = l0;
                } else {
                    i = i2;
                    if (b == 2) {
                        v98 h0 = h0(mecVar2.j, false);
                        h0.I0 = mecVar2.u;
                        h0.D0 = false;
                        if ((mecVar2.b & 2) != 0) {
                            h0.r(false);
                        }
                        if ((mecVar2.b & 16) != 0) {
                            h0.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = h0.getLayoutParams();
                        layoutParams2.width = mecVar2.q;
                        layoutParams2.height = mecVar2.r;
                        h44Var2 = h0;
                    } else if (b == 6) {
                        ArrayList arrayList3 = c8bVar.v;
                        boolean z2 = c8bVar.K;
                        this.Z1 = true;
                        f = 1.0f;
                        mecVar = mecVar2;
                        h44 vw7Var = new vw7(this, getContext(), b0(), arrayList3, this.O1, z2, this.P1);
                        vw7Var.setDelegate(this);
                        r15.addView(vw7Var);
                        c0();
                        if (mecVar.q > 0 && mecVar.r > 0) {
                            ViewGroup.LayoutParams layoutParams3 = vw7Var.getLayoutParams();
                            layoutParams3.width = mecVar.q;
                            layoutParams3.height = mecVar.r;
                        }
                        h44Var = vw7Var;
                    } else {
                        mecVar = mecVar2;
                        f = 1.0f;
                        if (b == 3) {
                            sd6 g0 = g0(mecVar.O, mecVar.N);
                            int i4 = mecVar.l;
                            if (i4 != 0) {
                                g0.setColor(i4);
                            }
                            g0.setType(mecVar.b);
                            h44Var = g0;
                        } else {
                            if (b == 8) {
                                vwc vwcVar = mecVar.P;
                                if (vwcVar != null) {
                                    xwc m0 = m0(vwcVar);
                                    int i5 = mecVar.l;
                                    if (i5 != 0) {
                                        m0.setColor(i5);
                                    }
                                    m0.setType(mecVar.b);
                                    h44Var = m0;
                                }
                            } else if (b == 7) {
                                s66 f0 = f0(mecVar.a0);
                                h66 h66Var = f0.s0;
                                int i6 = mecVar.l;
                                if (i6 != 0) {
                                    f0.setColor(i6);
                                }
                                boolean e = h66Var.e();
                                int i7 = h66Var.h;
                                int i8 = h66Var.f;
                                if (e) {
                                    h66Var.setPreviewType(mecVar.b);
                                }
                                byte b2 = mecVar.b;
                                if (b2 == -1) {
                                    f0.setType(3);
                                    h66Var.d();
                                    mecVar.q = ((int) Math.ceil(h66Var.b0)) + i8 + i8;
                                    mecVar.r = ((int) Math.ceil(h66Var.c0)) + i7 + i7;
                                    PointF position = f0.getPosition();
                                    position.y = (this.C1 * 0.3f) + position.y;
                                    f0.setPosition(position);
                                } else {
                                    f0.setType(b2);
                                    h44Var = f0;
                                }
                            } else if (b == 4) {
                                s39 i0 = i0(false);
                                i0.s(w49.d(mecVar.N.reaction), false);
                                if (mecVar.N.flipped) {
                                    i0.r(false);
                                }
                                h44Var = i0;
                                if (mecVar.N.dark) {
                                    i0.q(false);
                                    h44Var = i0;
                                }
                            } else if (b == 5 && c8bVar.o0 != null) {
                                pp9 j0 = j0(c8bVar.p0, false);
                                rbb rbbVar = ((vab) this).o2;
                                gbb gbbVar = rbbVar.Y0;
                                if (gbbVar != null) {
                                    gbbVar.x = j0;
                                    kfc kfcVar = gbbVar.y;
                                    if (kfcVar != null) {
                                        kfcVar.z0(j0.w0);
                                    }
                                }
                                hbb hbbVar = rbbVar.d1;
                                if (hbbVar != null) {
                                    hbbVar.setHasRoundVideo(true);
                                }
                                h44Var = j0;
                                if ((mecVar.b & 2) != 0) {
                                    boolean z3 = !j0.t0;
                                    j0.t0 = z3;
                                    j0.u0.f(z3, true);
                                    j0.invalidate();
                                    h44Var = j0;
                                }
                            }
                            i2 = i + 1;
                            z = false;
                        }
                    }
                }
                mecVar = mecVar2;
                f = 1.0f;
                h44Var = h44Var2;
            }
            h44Var.setX((mecVar.c * this.B1) - (((f - mecVar.v) * mecVar.q) / 2.0f));
            h44Var.setY((mecVar.d * this.C1) - (((f - mecVar.v) * mecVar.r) / 2.0f));
            h44Var.setPosition(new PointF((mecVar.q / 2.0f) + h44Var.getX(), (mecVar.r / 2.0f) + h44Var.getY()));
            h44Var.setScale(mecVar.v);
            h44Var.setRotation((float) (((-mecVar.e) / 3.141592653589793d) * 180.0d));
            i2 = i + 1;
            z = false;
        }
    }

    public final void H0(final boolean z) {
        if (this.l1 != z) {
            this.l1 = z;
            vpa vpaVar = this.m1;
            if (vpaVar != null) {
                vpaVar.d();
            }
            vpa vpaVar2 = new vpa(new xk4(z ? 0.0f : 1000.0f));
            this.m1 = vpaVar2;
            wpa wpaVar = new wpa();
            wpaVar.i = z ? 1000.0f : 0.0f;
            wpaVar.b(1250.0f);
            wpaVar.a(1.0f);
            vpaVar2.m = wpaVar;
            byte b = 0;
            final boolean[] zArr = {this.y1.c() || this.h2 > 0};
            final float translationY = this.D0.getTranslationY();
            final float alpha = this.l0.getAlpha();
            final ViewGroup barView = getBarView();
            this.m1.b(new qs3() { // from class: cw7
                @Override // qs3
                public final void a(vpa vpaVar3, float f, float f2) {
                    float f3;
                    dx7 dx7Var = dx7.this;
                    ax7 ax7Var = dx7Var.D0;
                    float f4 = f / 1000.0f;
                    dx7Var.n1 = f4;
                    float f5 = ((1.0f - f4) * 0.4f) + 0.6f;
                    ViewGroup viewGroup = barView;
                    viewGroup.setScaleX(f5);
                    viewGroup.setScaleY(f5);
                    viewGroup.setTranslationY((Math.min(dx7Var.n1, 0.25f) * hl.L(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(dx7Var.n1, 0.25f) / 0.25f));
                    pw7 pw7Var = dx7Var.g1;
                    float f6 = dx7Var.n1;
                    boolean z2 = z;
                    pw7Var.C1(z2, f6);
                    iv7 iv7Var = dx7Var.l0;
                    iv7Var.setProgress(dx7Var.n1);
                    dv7 dv7Var = dx7Var.k0;
                    dv7Var.setProgress(dx7Var.n1);
                    dx7Var.G0.setTranslationY(hl.L(32.0f) * dx7Var.n1);
                    AnimatorSet animatorSet = dx7Var.x1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f7 = dx7Var.n1;
                        if (z2) {
                            f3 = 1.0f;
                        } else {
                            f7 = 1.0f - f7;
                            f3 = 0.0f;
                        }
                        float f8 = alpha;
                        iv7Var.setAlpha(hl.R1(f8, f3, f7));
                        dv7Var.setAlpha(hl.R1(f8, z2 ? 1.0f : 0.0f, f7));
                        ax7Var.setTranslationY(translationY - ((hl.L(39.0f) * f7) * (z2 ? 1 : -1)));
                    }
                    ax7Var.invalidate();
                    if (viewGroup == dx7Var.V0) {
                        dx7Var.E0.invalidate();
                    }
                }
            });
            this.m1.a(new dw7(this, z, b));
            this.m1.h();
            if (z) {
                pw7 pw7Var = this.g1;
                pw7Var.setVisibility(0);
                pw7Var.setSelectedColorIndex(a78.e(this.p1).d());
            }
        }
    }

    public final void I0(int i) {
        nv7 nv7Var = this.V0;
        qw7 qw7Var = this.y1;
        byte b = 1;
        if (i == 1) {
            o24 o24Var = this.d2;
            boolean z = o24Var != null && o24Var.getVisibility() == 0;
            o24 o24Var2 = this.d2;
            qbb qbbVar = this.w1;
            if (o24Var2 != null && o24Var2.d1 != yac.t0) {
                qbbVar.removeView(o24Var2);
                o24Var2 = null;
                this.d2 = null;
            }
            if (o24Var2 == null) {
                o24 o24Var3 = new o24(null, true, false, false, getContext(), false, null, null, true, this.q1, false, false);
                this.d2 = o24Var3;
                o24Var3.x2 = false;
                o24Var3.V0 = true;
                o24Var3.setVisibility(8);
                if (hl.O1()) {
                    this.d2.setForseMultiwindowLayout(true);
                }
                this.d2.setDelegate(new xw7(this));
                qbbVar.addView(this.d2);
            }
            this.d2.setVisibility(0);
            this.e2 = true;
            o24 o24Var4 = this.d2;
            if (this.j2 <= 0) {
                if (hl.O1()) {
                    this.j2 = hl.L(150.0f);
                } else {
                    this.j2 = uc7.d1().getInt("kbd_height", hl.L(200.0f));
                }
            }
            int i2 = this.k2;
            if (i2 <= 0) {
                if (hl.O1()) {
                    i2 = hl.L(150.0f);
                    this.k2 = i2;
                } else {
                    i2 = uc7.d1().getInt("kbd_height_land3", hl.L(200.0f));
                    this.k2 = i2;
                }
            }
            Point point = hl.q;
            if (point.x <= point.y) {
                i2 = this.j2;
            }
            int paddingUnderContainer = qbbVar.getPaddingUnderContainer() + i2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o24Var4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            o24Var4.setLayoutParams(layoutParams);
            if (!hl.E && !hl.O1()) {
                h44 h44Var = this.t0;
                if (h44Var instanceof rlb) {
                    hl.t1(((rlb) h44Var).getEditText());
                }
            }
            this.h2 = paddingUnderContainer;
            qw7Var.a();
            requestLayout();
            iz1 emojiButton = nv7Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(gz1.d, true);
            }
            if (!z) {
                if (this.f2) {
                    this.i2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h2, 0.0f);
                    ofFloat.addUpdateListener(new aw7(this, b));
                    ofFloat.addListener(new sw7(this, b));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(hb.w);
                    ofFloat.start();
                }
            }
        } else {
            iz1 emojiButton2 = nv7Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(gz1.e, true);
            }
            o24 o24Var5 = this.d2;
            if (o24Var5 != null) {
                this.e2 = false;
                if (hl.D || hl.E) {
                    o24Var5.setVisibility(8);
                }
            }
            if (i == 0) {
                this.h2 = 0;
                qw7Var.a();
            }
            requestLayout();
        }
        R0();
    }

    public final void J0(s66 s66Var) {
        r8b r8bVar = new r8b(getContext(), this.q1, this.Q1, new v35(this, s66Var, (byte) 17));
        if (s66Var != null) {
            g66 g66Var = s66Var.w0;
            r8bVar.X1 = true;
            zt3 zt3Var = r8bVar.U1;
            zt3 zt3Var2 = r8bVar.T1;
            if (g66Var != null) {
                r8bVar.b2 = g66Var.d;
                r8bVar.c2 = false;
                zt3Var2.setText(g66Var.c);
                zt3Var.setText(g66Var.b);
                r8bVar.h2 = !TextUtils.isEmpty(g66Var.b);
                r8bVar.i2 = g66Var.f;
                r8bVar.j2 = g66Var.e;
            } else {
                zt3Var2.setText("");
                zt3Var.setText("");
                r8bVar.i2 = true;
                r8bVar.j2 = false;
            }
            String M0 = ob6.M0(2131744295, null);
            c51 c51Var = r8bVar.W1;
            c51Var.i(M0, false, true);
            i74 i74Var = r8bVar.S1;
            if (i74Var != null) {
                i74Var.O(false);
            }
            c51Var.setEnabled(r8bVar.b1(zt3Var2.getText().toString()));
            r8bVar.X1 = false;
        }
        r8bVar.setOnDismissListener(new nw7(this, (byte) 1));
        r8bVar.show();
        y0(true);
    }

    public final void K0(sd6 sd6Var, icc iccVar) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        n12 n12Var = new n12(getContext(), new uw7(this, iccVar), false, true, false, this.q1);
        n12Var.W3 = new sjf((byte) 22);
        m02 m02Var = n12Var.u3;
        if (sd6Var != null && (messageMedia = sd6Var.w0) != null && (geoPoint = messageMedia.geo) != null) {
            n12Var.x4 = new double[]{geoPoint.lat, geoPoint._long};
            n12Var.I1 = true;
            m02Var.setVisibility(8);
        } else if (this.E1) {
            n12Var.v4 = this.G1;
            n12Var.w4 = this.F1;
            n12Var.I1 = true;
            m02Var.setVisibility(8);
        } else {
            n12Var.I1 = true;
            m02Var.setVisibility(8);
        }
        n12Var.setOnDismissListener(new nw7(this, (byte) 0));
        n12Var.a1();
        n12Var.show();
    }

    @Override // vma
    public final void L(int i, boolean z) {
        boolean z2;
        boolean z3;
        if (i > hl.L(50.0f) && this.f2 && !hl.E && !hl.O1()) {
            if (z) {
                this.k2 = i;
                uc7.d1().edit().putInt("kbd_height_land3", this.k2).commit();
            } else {
                this.j2 = i;
                uc7.d1().edit().putInt("kbd_height", this.j2).commit();
            }
        }
        boolean z4 = this.e2;
        qw7 qw7Var = this.y1;
        if (z4) {
            int paddingUnderContainer = this.w1.getPaddingUnderContainer() + (z ? this.k2 : this.j2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d2.getLayoutParams();
            int i2 = layoutParams.width;
            int i3 = hl.q.x;
            if (i2 != i3 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i3;
                layoutParams.height = paddingUnderContainer;
                this.d2.setLayoutParams(layoutParams);
                this.h2 = layoutParams.height;
                qw7Var.a();
                requestLayout();
            }
        }
        if (this.l2 == i && this.m2 == z) {
            return;
        }
        this.l2 = i;
        this.m2 = z;
        boolean z5 = this.f2;
        h44 h44Var = this.t0;
        if (h44Var instanceof rlb) {
            z2 = ((rlb) h44Var).getEditText().isFocused() && qw7Var.c();
            this.f2 = z2;
        } else {
            this.f2 = false;
            z2 = false;
        }
        if (z2 && this.e2) {
            I0(0);
        }
        if (this.h2 != 0 && !(z3 = this.f2) && z3 != z5 && !this.e2) {
            this.h2 = 0;
            qw7Var.a();
            requestLayout();
        }
        T0();
        if (z5 && !this.f2 && this.h2 > 0 && this.i2) {
            this.i2 = false;
        }
        R0();
    }

    public final void L0(h44 h44Var) {
        byte b = 1;
        if (h44Var instanceof b47) {
            n8 n8Var = this.r1;
            if (n8Var == null || !n8Var.isShowing()) {
                return;
            }
            this.r1.d(true);
            return;
        }
        int[] iArr = this.c2;
        h44Var.getLocationInWindow(iArr);
        float scaleX = h44Var.getScaleX() * h44Var.getWidth();
        zw7 zw7Var = this.B0;
        float scaleX2 = zw7Var.getScaleX() * scaleX;
        float scaleY = zw7Var.getScaleY() * h44Var.getScaleY() * h44Var.getHeight();
        int i = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i;
        int i2 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i2;
        M0(new hw7(this, h44Var, b), this, 51, i, i2 - hl.L(32.0f), true);
    }

    public final void M0(Runnable runnable, dx7 dx7Var, int i, int i2, int i3, boolean z) {
        n8 n8Var = this.r1;
        if (n8Var != null && n8Var.isShowing()) {
            this.r1.d(true);
            return;
        }
        if (this.s1 == null) {
            this.t1 = new Rect();
            cx7 cx7Var = new cx7(this, getContext());
            this.s1 = cx7Var;
            cx7Var.setAnimationEnabled(true);
            this.s1.setOnTouchListener(new b7(this, (byte) 12));
            this.s1.setDispatchKeyEventListener(new jw7(this));
            this.s1.setShownFromBottom(true);
        }
        cx7 cx7Var2 = this.s1;
        cx7Var2.a0 = z;
        cx7Var2.d();
        runnable.run();
        if (this.r1 == null) {
            n8 n8Var2 = new n8(this.s1, -2, -2);
            this.r1 = n8Var2;
            n8Var2.b = true;
            n8Var2.setAnimationStyle(R.style.PopupAnimation);
            this.r1.setOutsideTouchable(true);
            this.r1.setClippingEnabled(true);
            this.r1.setInputMethodMode(2);
            this.r1.setSoftInputMode(0);
            this.r1.getContentView().setFocusableInTouchMode(true);
            this.r1.setOnDismissListener(new y6(this, (byte) 6));
        }
        this.s1.measure(View.MeasureSpec.makeMeasureSpec(hl.L(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(10000.0f), TLObject.FLAG_31));
        this.r1.setFocusable(true);
        int measuredWidth = i2 - (this.s1.getMeasuredWidth() / 2);
        int measuredHeight = i3 - this.s1.getMeasuredHeight();
        this.r1.showAtLocation(dx7Var, i, measuredWidth, measuredHeight);
        n8.i(this.s1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        cx7 cx7Var3 = this.s1;
        if (z) {
            cx7Var3.setBackgroundDrawable(new wl0(new xl0(this.O1, cx7Var3, 5, false), measuredWidth, measuredHeight, mutate, hl.N(8.3f)));
        } else {
            cx7Var3.setBackgroundDrawable(mutate);
            this.s1.setBackgroundColor(-14145495);
        }
    }

    public final void N0(boolean z) {
        if (this.M1 != z) {
            if (z || this.J1 != null) {
                this.M1 = z;
                byte b = 0;
                if (!z) {
                    this.K1 = null;
                    if (this.J1.getReactionsWindow() != null) {
                        this.J1.getReactionsWindow().e();
                    }
                    this.J1.animate().alpha(0.0f).setDuration(150L).setListener(new sw7(this, b)).start();
                    return;
                }
                this.J1.k();
                this.J1.setVisibility(0);
                this.J1.setSelectedReaction(this.K1.getCurrentReaction());
                this.J1.getParent().bringChildToFront(this.J1);
                this.N1 = true;
                this.w1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L1, z ? 1.0f : 0.0f);
                this.J1.setTransitionProgress(this.L1);
                ofFloat.addUpdateListener(new aw7(this, (byte) 2));
                ofFloat.addListener(new gf4((byte) 17, this, z));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(k43.g);
                ofFloat.start();
            }
        }
    }

    public final void O0(boolean z) {
        if (this.e1 != z) {
            this.e1 = z;
            vpa vpaVar = this.f1;
            if (vpaVar != null) {
                vpaVar.d();
            }
            vpa vpaVar2 = new vpa(new xk4(z ? 0.0f : 1000.0f));
            this.f1 = vpaVar2;
            wpa wpaVar = new wpa();
            wpaVar.i = z ? 1000.0f : 0.0f;
            wpaVar.b(1250.0f);
            wpaVar.a(1.0f);
            vpaVar2.m = wpaVar;
            if (z) {
                zv7 zv7Var = this.W0;
                zv7Var.setAlpha(0.0f);
                zv7Var.setVisibility(0);
            }
            this.f1.b(new i10(this, (byte) 9));
            this.f1.a(new dw7(this, z, (byte) 1));
            this.f1.h();
        }
    }

    public final PointF P0(h44 h44Var) {
        float f;
        float f2;
        fo6 fo6Var = this.p0;
        float f3 = fo6Var != null ? 200.0f / fo6Var.c : 200.0f;
        float f4 = 0.2f;
        if (h44Var != null) {
            PointF position = h44Var.getPosition();
            float min = Math.min(h44Var.getHeight(), h44Var.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f5 = fo6Var != null ? 100.0f / fo6Var.c : 100.0f;
        PointF b0 = b0();
        int i = 0;
        while (i < 10) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                zw7 zw7Var = this.B0;
                if (i2 >= zw7Var.getChildCount()) {
                    break;
                }
                View childAt = zw7Var.getChildAt(i2);
                if (!(childAt instanceof h44) || (childAt instanceof b47)) {
                    f = f4;
                    f2 = f5;
                } else {
                    PointF position2 = ((h44) childAt).getPosition();
                    f = f4;
                    f2 = f5;
                    if (((float) Math.sqrt(Math.pow(position2.y - b0.y, 2.0d) + Math.pow(position2.x - b0.x, 2.0d))) < f2) {
                        f3 = Math.min(childAt.getHeight(), childAt.getWidth()) * f;
                        z = true;
                    }
                }
                i2++;
                f5 = f2;
                f4 = f;
            }
            float f6 = f4;
            float f7 = f5;
            if (!z) {
                break;
            }
            i++;
            b0 = new PointF(b0.x + f3, b0.y + f3);
            f4 = f6;
            f5 = f7;
        }
        return b0;
    }

    @Override // xma, wma
    public final int Q() {
        return this.y1.l - this.w1.getBottomPadding2();
    }

    public final void Q0(int i) {
        if (this.I0 == i || this.J0 == i) {
            return;
        }
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i2 = this.I0;
        ViewGroup viewGroup = this.V0;
        ViewGroup viewGroup2 = this.U0;
        ViewGroup viewGroup3 = i2 == 0 ? viewGroup2 : i2 == 2 ? viewGroup : null;
        this.J0 = i;
        ViewGroup viewGroup4 = i == 0 ? viewGroup2 : i == 2 ? viewGroup : null;
        int i3 = this.p1;
        a78 e = a78.e(i3);
        boolean z = i == 2;
        if (e.l != z) {
            e.l = z;
            if (z) {
                e.i(-1, false);
            } else {
                e.i(e.a.getInt("brush", 0), false);
            }
        }
        int c = a78.e(i3).c();
        igb igbVar = this.k1;
        igbVar.a = c;
        this.T1 = i != 2;
        D0(igbVar, null, false);
        this.T1 = false;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.L0 = duration;
        duration.setInterpolator(k43.f);
        this.L0.addUpdateListener(new nk(this, viewGroup3, viewGroup4, (byte) 3));
        this.L0.addListener(new eq1(this, viewGroup3, viewGroup4, i, (byte) 4));
        this.L0.start();
    }

    public final void R0() {
        qw7 qw7Var = this.y1;
        nv7 nv7Var = this.V0;
        if (nv7Var != null) {
            if (qw7Var.c()) {
                nv7Var.a(R.drawable.input_smile);
            } else if (this.e2) {
                nv7Var.a(R.drawable.input_keyboard);
            } else {
                nv7Var.a(R.drawable.msg_add);
            }
        }
        boolean z = qw7Var.c() || this.e2;
        boolean z2 = !z;
        hl.O3(1.0f, this.Y0, z2, false);
        hl.O3(1.0f, this.X0, z2, false);
        hl.O3(1.0f, this.a1, z, false);
        hl.O3(1.0f, this.Z0, z, false);
    }

    public final void S0() {
        h44 h44Var;
        ObjectAnimator objectAnimator = this.S1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.y0.getParent();
        if (view == null) {
            return;
        }
        qw7 qw7Var = this.y1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!qw7Var.c() || qw7Var.d) && this.h2 <= 0) || (h44Var = this.t0) == null) ? 0.0f : view.getScaleY() * (-(h44Var.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.S1 = ofFloat;
        ofFloat.setDuration(350L);
        this.S1.setInterpolator(k43.h);
        this.S1.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0() {
        boolean z;
        byte b = 1;
        if (this.t0 instanceof rlb) {
            qw7 qw7Var = this.y1;
            if ((qw7Var.c() || this.h2 > 0) && !qw7Var.d) {
                z = true;
                View view = this.H0;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(!z ? 1.0f : 0.0f).withEndAction(new y0d(b, this, z)).start();
            }
        }
        z = false;
        View view2 = this.H0;
        view2.animate().cancel();
        view2.setVisibility(0);
        view2.animate().alpha(!z ? 1.0f : 0.0f).withEndAction(new y0d(b, this, z)).start();
    }

    @Override // qv7, lv7
    public final void a() {
        H0(true);
    }

    public final void a0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new pl7(this, view, (byte) 12)).start();
    }

    @Override // wma, snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G8));
        hashSet.add(Integer.valueOf(aob.h5));
        hashSet.add(Integer.valueOf(aob.j5));
        hashSet.add(Integer.valueOf(aob.r5));
        hashSet.add(Integer.valueOf(aob.zf));
        hashSet.add(Integer.valueOf(aob.Cf));
        hashSet.add(Integer.valueOf(aob.Ff));
        hashSet.add(Integer.valueOf(aob.Jf));
        hashSet.add(Integer.valueOf(aob.Ef));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.Di));
        hashSet.add(Integer.valueOf(aob.wi));
        hashSet.add(Integer.valueOf(aob.vi));
        hashSet.add(Integer.valueOf(aob.xi));
        hashSet.add(Integer.valueOf(aob.yi));
        hashSet.add(Integer.valueOf(aob.Bf));
        hashSet.add(Integer.valueOf(aob.Af));
        hashSet.add(Integer.valueOf(aob.a7));
    }

    @Override // lv7
    public final void b() {
        setTextType((this.v0 + 1) % 4);
    }

    public final PointF b0() {
        zw7 zw7Var = this.B0;
        int measuredWidth = zw7Var.getMeasuredWidth();
        int measuredHeight = zw7Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.C1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override // lv7
    public final void c(int i) {
        h44 h44Var = this.t0;
        if (h44Var instanceof rlb) {
            F0((rlb) h44Var, i);
            a78 e = a78.e(this.p1);
            e.g = i;
            e.a.edit().putInt("text_alignment", i).apply();
        }
    }

    public final void c0() {
        boolean z = this.G1;
        zw7 zw7Var = this.B0;
        boolean z2 = true;
        if (!z && !this.I1) {
            int i = 0;
            loop0: while (true) {
                if (i >= zw7Var.getChildCount()) {
                    z2 = false;
                    break;
                }
                View childAt = zw7Var.getChildAt(i);
                boolean z3 = childAt instanceof rlb;
                int i2 = this.p1;
                if (z3) {
                    CharSequence text = ((rlb) childAt).getText();
                    if (text instanceof Spanned) {
                        for (hm hmVar : (hm[]) ((Spanned) text).getSpans(0, text.length(), hm.class)) {
                            TLRPC.Document document = hmVar.document;
                            if (document == null) {
                                document = wl.e(i2, hmVar.getDocumentId());
                            }
                            if (document != null) {
                                wl.g(i2).e(document);
                            }
                            xb4.G(i2);
                            if (c8b.u(document, xb4.J(document, null, true, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i++;
                } else if (childAt instanceof v3b) {
                    TLRPC.Document sticker = ((v3b) childAt).getSticker();
                    xb4.G(i2);
                    if (c8b.u(sticker, xb4.J(sticker, null, true, true).getAbsolutePath())) {
                        break;
                    } else {
                        i++;
                    }
                } else if (childAt instanceof pp9) {
                    break;
                } else {
                    i++;
                }
            }
        }
        for (int i3 = 0; i3 < zw7Var.getChildCount(); i3++) {
            View childAt2 = zw7Var.getChildAt(i3);
            if (childAt2 instanceof h44) {
                ((h44) childAt2).setIsVideo(z2);
            }
        }
    }

    public final TextView d0(int i, String str) {
        TextView textView = new TextView(getContext());
        yob.X(textView, aob.E8, this.q1);
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(hl.o());
        textView.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i));
        textView.setText(str);
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        fo6 fo6Var;
        if ((view == this.y0 || view == this.z0 || view == this.B0 || view == this.A0) && (fo6Var = this.p0) != null) {
            canvas.save();
            r1 = this.x0 ? 0 : hl.m;
            int currentActionBarHeight = a.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i = fo6Var.k;
            if (i == 90 || i == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * fo6Var.e)) / fo6Var.c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * fo6Var.f)) / fo6Var.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - hl.L(48.0f))) - scaleY) / 2.0f) + hl.L(8.0f) + r1 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            r1 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (r1 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final kc1 e0() {
        qma paintingSize = getPaintingSize();
        PointF b0 = b0();
        b0.y *= 1.5f;
        kc1 kc1Var = new kc1(getContext(), b0, (int) ((paintingSize.a / 9.0f) * 0.5f), new igb(1.0f, this.k1.c, -1));
        float f = paintingSize.a / 9.0f;
        iw7 iw7Var = new iw7(this, (byte) 2);
        kc1Var.y0 = (int) (0.5f * f);
        kc1Var.z0 = (int) (f * 2.0f);
        kc1Var.A0 = iw7Var;
        final byte b = 1;
        kc1Var.B0 = true;
        kc1Var.setStickyX(2);
        kc1Var.setDelegate(this);
        kc1Var.setMaxWidth(this.B1 - hl.L(32.0f));
        kc1Var.setTypeface(a78.e(this.p1).j);
        kc1Var.setType(3);
        gc1 gc1Var = this.U1;
        if (gc1Var != null) {
            gc1Var.b(kc1Var);
        } else {
            final kj4 kj4Var = this.W1;
            Objects.requireNonNull(kj4Var);
            kc1Var.setPositionProvider(new bm6(kj4Var, (byte) 26));
            final byte b2 = 0;
            kc1Var.setOnEditing(new pcc() { // from class: mw7
                @Override // pcc
                public final void a(Object obj) {
                    switch (b2) {
                        case 0:
                            kj4Var.i(((Boolean) obj).booleanValue());
                            break;
                        default:
                            kj4Var.M(((Long) obj).longValue());
                            break;
                    }
                }
            });
            kc1Var.setOnSeek(new pcc() { // from class: mw7
                @Override // pcc
                public final void a(Object obj) {
                    switch (b) {
                        case 0:
                            kj4Var.i(((Boolean) obj).booleanValue());
                            break;
                        default:
                            kj4Var.M(((Long) obj).longValue());
                            break;
                    }
                }
            });
        }
        this.B0.addView(kc1Var, tre.c(-2.0f, -2));
        F0(kc1Var, 1);
        c0();
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            kc1Var.j(1.0f / fo6Var.c);
            kc1Var.f(-(fo6Var.k + fo6Var.d));
        }
        return kc1Var;
    }

    public final s66 f0(g66 g66Var) {
        int i;
        this.Z1 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        zw7 zw7Var = this.B0;
        float measuredWidth = zw7Var.getMeasuredWidth() <= 0 ? this.B1 : zw7Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - hl.L(58.0f);
        s66 s66Var = new s66(getContext(), P0, this.p1, g66Var, measuredWidth / 360.0f, L);
        if (P0.x == zw7Var.getMeasuredWidth() / 2.0f) {
            s66Var.setStickyX(2);
        }
        if (P0.y == zw7Var.getMeasuredHeight() / 2.0f) {
            s66Var.setStickyY(2);
        }
        igb igbVar = this.k1;
        if (igbVar != null && (i = igbVar.a) != -47814) {
            s66Var.setColor(i);
        }
        s66Var.setDelegate(this);
        s66Var.setMaxWidth(L);
        zw7Var.addView(s66Var, tre.c(-2.0f, -2));
        c0();
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            s66Var.j(1.0f / fo6Var.c);
            s66Var.f(-(fo6Var.k + fo6Var.d));
        }
        return s66Var;
    }

    public final sd6 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i;
        this.Z1 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        zw7 zw7Var = this.B0;
        float measuredWidth = zw7Var.getMeasuredWidth() <= 0 ? this.B1 : zw7Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - hl.L(58.0f);
        sd6 sd6Var = new sd6(getContext(), P0, this.p1, messageMedia, mediaArea, measuredWidth / 240.0f, L);
        if (P0.x == zw7Var.getMeasuredWidth() / 2.0f) {
            sd6Var.setStickyX(2);
        }
        if (P0.y == zw7Var.getMeasuredHeight() / 2.0f) {
            sd6Var.setStickyY(2);
        }
        igb igbVar = this.k1;
        if (igbVar != null && (i = igbVar.a) != -47814) {
            sd6Var.setColor(i);
        }
        sd6Var.setDelegate(this);
        sd6Var.setMaxWidth(L);
        zw7Var.addView(sd6Var, tre.c(-2.0f, -2));
        c0();
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            sd6Var.j(1.0f / fo6Var.c);
            sd6Var.f(-(fo6Var.k + fo6Var.d));
        }
        return sd6Var;
    }

    public int getAdditionalBottom() {
        return hl.L(24.0f);
    }

    public int getAdditionalTop() {
        return hl.L(48.0f);
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
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            return fo6Var.d + fo6Var.k;
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
        hm[] hmVarArr;
        zw7 zw7Var = this.B0;
        int childCount = zw7Var.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = zw7Var.getChildAt(i);
            if (childAt instanceof v3b) {
                TLRPC.Document sticker = ((v3b) childAt).getSticker();
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
            } else if (childAt instanceof rlb) {
                CharSequence text = ((rlb) childAt).getText();
                if ((text instanceof Spanned) && (hmVarArr = (hm[]) ((Spanned) text).getSpans(0, text.length(), hm.class)) != null) {
                    for (hm hmVar : hmVarArr) {
                        if (hmVar != null) {
                            TLRPC.Document document = hmVar.document;
                            if (document == null) {
                                document = wl.e(this.p1, hmVar.getDocumentId());
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

    public pa9 getRenderView() {
        return this.y0;
    }

    public h44 getSelectedEntity() {
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

    @Override // nbb
    public final boolean h(MotionEvent motionEvent) {
        if (this.a2) {
            return false;
        }
        if (this.t0 != null) {
            C0(null, true);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x, y);
        this.y0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final v98 h0(String str, boolean z) {
        float f;
        qma qmaVar;
        this.Z1 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f = options.outWidth / options.outHeight;
        } catch (Exception e) {
            cc4.g(e, true);
            f = 1.0f;
        }
        zw7 zw7Var = this.B0;
        if (f > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.B1, zw7Var.getMeasuredWidth()) * 0.5d);
            qmaVar = new qma(floor, floor / f);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.C1, zw7Var.getMeasuredHeight()) * 0.5d);
            qmaVar = new qma(f * floor2, floor2);
        }
        qma qmaVar2 = qmaVar;
        Pair N0 = hl.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f2 = qmaVar2.a;
            qmaVar2.a = qmaVar2.b;
            qmaVar2.b = f2;
        }
        Context context = getContext();
        PointF b0 = b0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        v98 v98Var = new v98(context, b0, qmaVar2, str, intValue);
        v98Var.setDelegate(this);
        zw7Var.addView(v98Var);
        c0();
        return v98Var;
    }

    @Override // f44
    public final boolean i(h44 h44Var) {
        return C0(h44Var, true);
    }

    public final s39 i0(boolean z) {
        String str;
        qma qmaVar = new qma(hl.L(106.0f), hl.L(106.0f));
        PointF b0 = b0();
        zw7 zw7Var = this.B0;
        if (zw7Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i = 0; i < zw7Var.getChildCount(); i++) {
                    View childAt = zw7Var.getChildAt(i);
                    if (dte.a(b0.x, b0.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < hl.L(6.0f)) {
                        break;
                    }
                }
                b0.x = (zw7Var.getMeasuredWidth() * 0.05f) + b0.x;
                b0.y = (zw7Var.getMeasuredHeight() * 0.05f) + b0.y;
                b0.x = Utilities.i(b0.x, zw7Var.getMeasuredWidth(), 0.0f);
                b0.y = Utilities.i(b0.y, zw7Var.getMeasuredHeight(), 0.0f);
            }
        }
        s39 s39Var = new s39(getContext(), b0);
        s39Var.t0 = new z9b(s39Var);
        s39Var.u0 = new z9b(s39Var);
        s39Var.v0 = new p39(s39Var);
        s39Var.w0 = new p39(s39Var);
        mm mmVar = new mm(s39Var);
        s39Var.y0 = mmVar;
        mm mmVar2 = new mm(s39Var);
        s39Var.z0 = mmVar2;
        s39Var.B0 = 1.0f;
        s39Var.s0 = qmaVar;
        mmVar2.e(true, 1.0f);
        mmVar.e(true, 1.0f);
        ArrayList arrayList = ls6.d0(yac.t0).h;
        p39 p39Var = s39Var.v0;
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                str = ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
                break;
            }
            if (((TLRPC.TL_availableReaction) arrayList.get(i2)).title.equals("Red Heart")) {
                str = ((TLRPC.TL_availableReaction) arrayList.get(i2)).reaction;
                break;
            }
            i2++;
        }
        w49 b = w49.b(str);
        s39Var.x0 = b;
        p39Var.e(b);
        s39Var.k();
        s39Var.setDelegate(this);
        zw7Var.addView(s39Var);
        c0();
        if (z) {
            A0(s39Var);
            C0(s39Var, true);
        }
        return s39Var;
    }

    public final pp9 j0(String str, boolean z) {
        this.Z1 = true;
        this.b2 = true;
        n0();
        zw7 zw7Var = this.B0;
        int measuredWidth = zw7Var.getMeasuredWidth();
        zw7Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        qma qmaVar = new qma(floor, floor);
        pp9 pp9Var = new pp9(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - hl.L(16.0f), (qmaVar.b / 2.0f) + hl.L(72.0f)), qmaVar, str);
        pp9Var.setDelegate(this);
        zw7Var.addView(pp9Var);
        c0();
        byte b = 0;
        if (z) {
            A0(pp9Var);
            post(new kw7(this, pp9Var, b));
        }
        this.b2 = false;
        return pp9Var;
    }

    public final ww7 k0(Object obj, TLRPC.Document document) {
        float f;
        for (int i = 0; i < document.attributes.size() && !(document.attributes.get(i) instanceof TLRPC.TL_documentAttributeSticker); i++) {
        }
        float f2 = 0.75f;
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            f = -(fo6Var.k + fo6Var.d);
            f2 = 0.75f / fo6Var.c;
        } else {
            f = 0.0f;
        }
        vy5 vy5Var = new vy5(b0(), f2, f);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        ww7 ww7Var = new ww7(context, vy5Var.a, vy5Var.c, vy5Var.b, new qma(floor, floor), document, obj);
        boolean B4 = r47.B4(document);
        ImageReceiver imageReceiver = ww7Var.z0;
        if (B4) {
            imageReceiver.p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.m0(12);
        ww7Var.setDelegate(this);
        this.B0.addView(ww7Var);
        c0();
        return ww7Var;
    }

    public final rlb l0(boolean z) {
        qma paintingSize = getPaintingSize();
        PointF P0 = P0(null);
        rlb rlbVar = new rlb(getContext(), P0, (int) (paintingSize.a / 9.0f), "", this.k1, this.v0);
        float f = paintingSize.a / 9.0f;
        iw7 iw7Var = new iw7(this, (byte) 0);
        rlbVar.y0 = (int) (0.5f * f);
        rlbVar.z0 = (int) (f * 2.0f);
        rlbVar.A0 = iw7Var;
        float f2 = P0.x;
        zw7 zw7Var = this.B0;
        if (f2 == zw7Var.getMeasuredWidth() / 2.0f) {
            rlbVar.setStickyX(2);
        }
        if (P0.y == zw7Var.getMeasuredHeight() / 2.0f) {
            rlbVar.setStickyY(2);
        }
        rlbVar.setDelegate(this);
        rlbVar.setMaxWidth(this.B1 - hl.L(32.0f));
        int i = this.p1;
        rlbVar.setTypeface(a78.e(i).j);
        rlbVar.setType(a78.e(i).h);
        zw7Var.addView(rlbVar, tre.c(-2.0f, -2));
        c0();
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            rlbVar.j(1.0f / fo6Var.c);
            rlbVar.f(-(fo6Var.k + fo6Var.d));
        }
        if (z) {
            A0(rlbVar);
            rlbVar.q();
            C0(rlbVar, false);
            rlbVar.getFocusedView().requestFocus();
            hl.E3(rlbVar.getFocusedView());
            this.u0 = true;
            int i2 = a78.e(i).g;
            nv7 nv7Var = this.V0;
            nv7Var.d(i2, true);
            nv7Var.setOutlineType(a78.e(i).h);
        }
        return rlbVar;
    }

    public final xwc m0(vwc vwcVar) {
        int i;
        this.Z1 = true;
        getPaintingSize();
        PointF P0 = P0(null);
        zw7 zw7Var = this.B0;
        float measuredWidth = zw7Var.getMeasuredWidth() <= 0 ? this.B1 : zw7Var.getMeasuredWidth();
        int L = ((int) measuredWidth) - hl.L(58.0f);
        xwc xwcVar = new xwc(getContext(), P0, this.p1, vwcVar, measuredWidth / 240.0f, L);
        if (P0.x == zw7Var.getMeasuredWidth() / 2.0f) {
            xwcVar.setStickyX(2);
        }
        if (P0.y == zw7Var.getMeasuredHeight() / 2.0f) {
            xwcVar.setStickyY(2);
        }
        igb igbVar = this.k1;
        if (igbVar != null && (i = igbVar.a) != -47814) {
            xwcVar.setColor(i);
        }
        xwcVar.setDelegate(this);
        xwcVar.setMaxWidth(L);
        zw7Var.addView(xwcVar, tre.c(-2.0f, -2));
        c0();
        fo6 fo6Var = this.p0;
        if (fo6Var != null) {
            xwcVar.j(1.0f / fo6Var.c);
            xwcVar.f(-(fo6Var.k + fo6Var.d));
        }
        return xwcVar;
    }

    public final void n0() {
        int i = 0;
        while (true) {
            zw7 zw7Var = this.B0;
            if (i >= zw7Var.getChildCount()) {
                return;
            }
            View childAt = zw7Var.getChildAt(i);
            if (childAt instanceof pp9) {
                byte b = 1;
                if (this.t0 == childAt) {
                    C0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(k43.h).withEndAction(new kw7(this, (pp9) childAt, b)).start();
            }
            i++;
        }
    }

    @Override // f44
    public final boolean o() {
        return !(this.t0 instanceof b47);
    }

    public abstract void o0();

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        gc1 gc1Var = this.U1;
        if (gc1Var != null) {
            gc1Var.f(null);
            gd4 gd4Var = gc1Var.c;
            if (gd4Var != null) {
                gd4Var.f = null;
                v21 v21Var = (v21) gd4Var.g;
                if (v21Var != null) {
                    v21Var.b();
                    gd4Var.g = null;
                }
                gc1Var.c = null;
            }
            gc1Var.a.i(false);
        }
        this.W1.i(false);
        i49 i49Var = this.J1;
        if (i49Var != null) {
            hl.B2(i49Var);
            this.J1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        bc1 bc1Var;
        this.q0 = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int i3 = hl.q.y;
        a.getCurrentActionBarHeight();
        getAdditionalTop();
        getAdditionalBottom();
        Bitmap bitmap = this.m0;
        if (bitmap != null) {
            bitmap.getWidth();
            bitmap.getHeight();
        } else {
            a.getCurrentActionBarHeight();
        }
        float f = this.r0.a;
        h44 h44Var = this.t0;
        if (h44Var != null) {
            h44Var.m();
        }
        measureChild(this.D0, i, i2);
        measureChild(this.N0, i, i2);
        measureChild(this.F0, i, i2);
        gc1 gc1Var = this.U1;
        if (gc1Var != null && (bc1Var = gc1Var.e) != null) {
            bc1Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        measureChild(this.E0, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.h2 - this.w1.getPaddingUnderContainer(), Q()), TLObject.FLAG_30));
        FrameLayout frameLayout = this.C0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), hl.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i, i2);
        this.q0 = false;
        if (hl.L(20.0f) >= 0 && !this.e2 && !this.g2) {
            this.q0 = true;
            t0();
            this.q0 = false;
        }
        if (hl.L(20.0f) >= 0) {
            return;
        }
        t0();
    }

    @Override // f44
    public final boolean p() {
        return !this.u0;
    }

    public final b47 p0() {
        int i = 0;
        while (true) {
            zw7 zw7Var = this.B0;
            if (i >= zw7Var.getChildCount()) {
                return null;
            }
            View childAt = zw7Var.getChildAt(i);
            if (childAt instanceof b47) {
                return (b47) childAt;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap q0(ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, c8b c8bVar) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i;
        int i2;
        int i3;
        zw7 zw7Var;
        int i4;
        int i5;
        byte b;
        View view;
        boolean z5;
        boolean z6;
        ImageReceiver imageReceiver;
        Canvas canvas;
        View view2;
        b47 b47Var;
        jo0 jo0Var;
        boolean z7;
        ImageReceiver imageReceiver2;
        View view3;
        boolean z8;
        TLRPC.Message message;
        dl1 dl1Var;
        yua yuaVar;
        ImageReceiver imageReceiver3;
        ImageReceiver imageReceiver4;
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        float scaleX;
        boolean z9;
        boolean z10;
        float radius;
        double d;
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        Spanned spanned;
        boolean z11;
        dx7 dx7Var = this;
        yw7 yw7Var = dx7Var.y0;
        int i6 = 0;
        zw7 zw7Var2 = dx7Var.B0;
        byte b2 = 1;
        if (z) {
            createBitmap = yw7Var.c(false, z4);
        } else if (z3) {
            createBitmap = Bitmap.createBitmap(Math.max(1, zw7Var2.getMeasuredWidth()), Math.max(1, zw7Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z2) {
                bitmap = null;
                dx7Var.Q0 = BigInteger.ONE;
                i2 = 0;
                for (i = 0; i < zw7Var2.getChildCount(); i++) {
                    if (zw7Var2.getChildAt(i) instanceof h44) {
                        i2++;
                    }
                }
                if (i2 > 0) {
                    int childCount = zw7Var2.getChildCount();
                    int i7 = 0;
                    while (i7 < childCount) {
                        View childAt = zw7Var2.getChildAt(i7);
                        if (childAt instanceof h44) {
                            h44 h44Var = (h44) childAt;
                            h44Var.getPosition();
                            mec mecVar = new mec();
                            if (!(h44Var instanceof kc1)) {
                                if (arrayList != null) {
                                    boolean z12 = h44Var instanceof rlb;
                                    int i8 = dx7Var.p1;
                                    if (z12) {
                                        mecVar.a = b2;
                                        rlb rlbVar = (rlb) h44Var;
                                        CharSequence text = rlbVar.getText();
                                        if (text instanceof Spanned) {
                                            Spanned spanned2 = (Spanned) text;
                                            zw7Var = zw7Var2;
                                            hm[] hmVarArr = (hm[]) spanned2.getSpans(i6, text.length(), hm.class);
                                            if (hmVarArr != null) {
                                                int i9 = i6;
                                                while (i9 < hmVarArr.length) {
                                                    hm hmVar = hmVarArr[i9];
                                                    hm[] hmVarArr2 = hmVarArr;
                                                    TLRPC.Document document = hmVar.document;
                                                    int i10 = i9;
                                                    if (document == null) {
                                                        document = wl.e(i8, hmVar.getDocumentId());
                                                    }
                                                    if (document != null) {
                                                        wl.g(i8).e(document);
                                                    }
                                                    lec lecVar = new lec();
                                                    int i11 = childCount;
                                                    int i12 = i7;
                                                    lecVar.document_id = hmVar.getDocumentId();
                                                    lecVar.document = document;
                                                    lecVar.offset = spanned2.getSpanStart(hmVar);
                                                    lecVar.length = spanned2.getSpanEnd(hmVar) - lecVar.offset;
                                                    xb4.G(i8);
                                                    lecVar.a = xb4.J(document, null, true, true).getAbsolutePath();
                                                    int i13 = 0;
                                                    while (document != null) {
                                                        ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                        if (arrayList2 == null || arrayList2.isEmpty() || new File(lecVar.a).exists()) {
                                                            break;
                                                        }
                                                        xb4.G(i8);
                                                        spanned = spanned2;
                                                        z11 = true;
                                                        lecVar.a = xb4.J(document.thumbs.get(i13), null, true, true).getAbsolutePath();
                                                        i13++;
                                                        if (i13 >= document.thumbs.size()) {
                                                            break;
                                                        }
                                                        spanned2 = spanned;
                                                    }
                                                    spanned = spanned2;
                                                    z11 = true;
                                                    boolean K2 = r47.K2(lecVar.document, z11);
                                                    if (K2 || u0(lecVar.document)) {
                                                        lecVar.c = (byte) (lecVar.c | (K2 ? (byte) 1 : (byte) 4));
                                                    }
                                                    if (r47.B4(lecVar.document)) {
                                                        lecVar.c = (byte) (lecVar.c | 8);
                                                    }
                                                    mecVar.k.add(lecVar);
                                                    if (document != null) {
                                                        BigInteger valueOf = BigInteger.valueOf(5000L);
                                                        dx7Var.Q0 = dx7Var.Q0.multiply(valueOf).divide(dx7Var.Q0.gcd(valueOf));
                                                    }
                                                    i9 = i10 + 1;
                                                    hmVarArr = hmVarArr2;
                                                    childCount = i11;
                                                    i7 = i12;
                                                    spanned2 = spanned;
                                                }
                                            }
                                        } else {
                                            zw7Var = zw7Var2;
                                        }
                                        i4 = childCount;
                                        i5 = i7;
                                        mecVar.j = text.toString();
                                        mecVar.b = (byte) rlbVar.getType();
                                        mecVar.l = rlbVar.getSwatch().a;
                                        mecVar.m = rlbVar.getTextSize();
                                        mecVar.n = rlbVar.getTypeface();
                                        mecVar.p = rlbVar.getAlign();
                                    } else {
                                        zw7Var = zw7Var2;
                                        i4 = childCount;
                                        i5 = i7;
                                        if (h44Var instanceof v3b) {
                                            mecVar.a = (byte) 0;
                                            v3b v3bVar = (v3b) h44Var;
                                            qma baseSize = v3bVar.getBaseSize();
                                            mecVar.f = baseSize.a;
                                            mecVar.g = baseSize.b;
                                            mecVar.B = v3bVar.getSticker();
                                            mecVar.C = v3bVar.getParentObject();
                                            TLRPC.Document sticker = v3bVar.getSticker();
                                            xb4.G(yac.t0);
                                            mecVar.j = xb4.J(sticker, null, true, true).getAbsolutePath();
                                            if (r47.K2(sticker, true) || u0(sticker)) {
                                                boolean K22 = r47.K2(sticker, true);
                                                mecVar.b = (byte) (mecVar.b | (K22 ? (byte) 1 : (byte) 4));
                                                r21 = (K22 || u0(sticker)) ? v3bVar.getDuration() : 5000L;
                                                if (r21 != 0) {
                                                    BigInteger valueOf2 = BigInteger.valueOf(r21);
                                                    dx7Var.Q0 = dx7Var.Q0.multiply(valueOf2).divide(dx7Var.Q0.gcd(valueOf2));
                                                }
                                            }
                                            if (r47.B4(sticker)) {
                                                mecVar.l = -1;
                                                mecVar.b = (byte) (mecVar.b | 8);
                                            }
                                            if (v3bVar.v0) {
                                                mecVar.b = (byte) (mecVar.b | 2);
                                            }
                                        } else if (h44Var instanceof v98) {
                                            v98 v98Var = (v98) h44Var;
                                            mecVar.a = (byte) 2;
                                            qma baseSize2 = v98Var.getBaseSize();
                                            mecVar.f = baseSize2.a;
                                            mecVar.g = baseSize2.b;
                                            mecVar.j = v98Var.q(i8);
                                            mecVar.u = v98Var.I0;
                                            if (v98Var.v0) {
                                                mecVar.b = (byte) (mecVar.b | 2);
                                            }
                                        } else if (h44Var instanceof sd6) {
                                            sd6 sd6Var = (sd6) h44Var;
                                            ld6 ld6Var = sd6Var.s0;
                                            mecVar.a = (byte) 3;
                                            mecVar.b = (byte) sd6Var.getType();
                                            mecVar.f = ld6Var.getWidth();
                                            mecVar.g = ld6Var.getHeight();
                                            mecVar.j = ld6Var.getText();
                                            mecVar.l = sd6Var.t0 ? sd6Var.getColor() : 0;
                                            mecVar.Q = ld6Var.E;
                                            mecVar.O = sd6Var.w0;
                                            TL_stories.MediaArea mediaArea2 = sd6Var.x0;
                                            mecVar.N = mediaArea2;
                                            mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            TLRPC.Document codeEmojiDocument = ld6Var.getCodeEmojiDocument();
                                            if (codeEmojiDocument != null) {
                                                lec lecVar2 = new lec();
                                                lecVar2.document_id = codeEmojiDocument.id;
                                                lecVar2.document = codeEmojiDocument;
                                                xb4.G(i8);
                                                lecVar2.a = xb4.J(codeEmojiDocument, null, true, true).getAbsolutePath();
                                                boolean K23 = r47.K2(lecVar2.document, true);
                                                if (K23 || u0(lecVar2.document)) {
                                                    lecVar2.c = (byte) (lecVar2.c | (K23 ? (byte) 1 : (byte) 4));
                                                }
                                                mecVar.k.add(lecVar2);
                                            }
                                        } else if (h44Var instanceof xwc) {
                                            xwc xwcVar = (xwc) h44Var;
                                            ld6 ld6Var2 = xwcVar.s0;
                                            mecVar.a = (byte) 8;
                                            mecVar.b = (byte) xwcVar.getType();
                                            mecVar.f = ld6Var2.getWidth();
                                            mecVar.g = ld6Var2.getHeight();
                                            mecVar.j = ld6Var2.getText();
                                            mecVar.l = xwcVar.t0 ? xwcVar.getColor() : 0;
                                            mecVar.Q = ld6Var2.E;
                                            mecVar.P = xwcVar.w0;
                                            TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                            tL_mediaAreaWeather.emoji = xwcVar.w0.c;
                                            tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                            tL_mediaAreaWeather.color = ld6Var2.f.getColor();
                                            mecVar.N = tL_mediaAreaWeather;
                                            tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            TLRPC.Document codeEmojiDocument2 = ld6Var2.getCodeEmojiDocument();
                                            if (codeEmojiDocument2 != null) {
                                                lec lecVar3 = new lec();
                                                lecVar3.document_id = codeEmojiDocument2.id;
                                                lecVar3.document = codeEmojiDocument2;
                                                xb4.G(i8);
                                                lecVar3.a = xb4.J(codeEmojiDocument2, null, true, true).getAbsolutePath();
                                                boolean K24 = r47.K2(lecVar3.document, true);
                                                if (K24 || u0(lecVar3.document)) {
                                                    lecVar3.c = (byte) (lecVar3.c | (K24 ? (byte) 1 : (byte) 4));
                                                }
                                                mecVar.k.add(lecVar3);
                                            }
                                            view = childAt;
                                            z7 = false;
                                            z8 = false;
                                            imageReceiver = null;
                                            arrayList.add(mecVar);
                                            scaleX = view.getScaleX();
                                            float scaleY = view.getScaleY();
                                            float x = view.getX();
                                            float y = view.getY();
                                            mecVar.q = view.getWidth();
                                            mecVar.r = view.getHeight();
                                            mecVar.f = (view.getWidth() * scaleX) / zw7Var.getMeasuredWidth();
                                            mecVar.g = (view.getHeight() * scaleY) / zw7Var.getMeasuredHeight();
                                            mecVar.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x) / zw7Var.getMeasuredWidth();
                                            mecVar.d = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y) / zw7Var.getMeasuredHeight();
                                            mecVar.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            mecVar.y = ((view.getWidth() / 2.0f) + x) / zw7Var.getMeasuredWidth();
                                            mecVar.z = ((view.getHeight() / 2.0f) + y) / zw7Var.getMeasuredHeight();
                                            mecVar.w = mecVar.q / zw7Var.getMeasuredWidth();
                                            mecVar.x = mecVar.r / zw7Var.getMeasuredHeight();
                                            mecVar.v = scaleX;
                                            if (h44Var instanceof b47) {
                                                z9 = z7;
                                                if (h44Var instanceof v3b) {
                                                    float v = ((v3b) h44Var).z0.v();
                                                    float f = (mecVar.f / 2.0f) + mecVar.c;
                                                    float f2 = (mecVar.g / 2.0f) + mecVar.d;
                                                    float measuredWidth = zw7Var.getMeasuredWidth() / zw7Var.getMeasuredHeight();
                                                    if (v > 1.0f) {
                                                        float f3 = (mecVar.f * measuredWidth) / v;
                                                        mecVar.g = f3;
                                                        mecVar.r = (int) (mecVar.q / v);
                                                        mecVar.d = f2 - (f3 / 2.0f);
                                                    } else if (v < 1.0f) {
                                                        float f4 = (mecVar.g / measuredWidth) * v;
                                                        mecVar.f = f4;
                                                        mecVar.q = (int) (mecVar.r * v);
                                                        mecVar.c = f - (f4 / 2.0f);
                                                    }
                                                } else {
                                                    TL_stories.MediaArea mediaArea3 = mecVar.N;
                                                    if (mediaArea3 != null && (((z10 = h44Var instanceof sd6)) || (h44Var instanceof xwc) || (h44Var instanceof s66) || (h44Var instanceof s39))) {
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                        float f5 = mecVar.c;
                                                        float f6 = mecVar.f;
                                                        mediaAreaCoordinates2.x = ((f6 / 2.0f) + f5) * 100.0f;
                                                        mediaAreaCoordinates2.y = ((mecVar.g / 2.0f) + mecVar.d) * 100.0f;
                                                        if (z10) {
                                                            ld6 ld6Var3 = ((sd6) h44Var).s0;
                                                            mediaAreaCoordinates2.w = uh9.e((ld6Var3.J << 1) * scaleX, zw7Var.getMeasuredWidth(), f6, 100.0f);
                                                            mecVar.N.coordinates.h = uh9.e((ld6Var3.K << 1) * scaleY, zw7Var.getMeasuredHeight(), mecVar.g, 100.0f);
                                                        } else if (h44Var instanceof xwc) {
                                                            ld6 ld6Var4 = ((xwc) h44Var).s0;
                                                            mediaAreaCoordinates2.w = uh9.e((ld6Var4.J << 1) * scaleX, zw7Var.getMeasuredWidth(), f6, 100.0f);
                                                            mecVar.N.coordinates.h = uh9.e((ld6Var4.K << 1) * scaleY, zw7Var.getMeasuredHeight(), mecVar.g, 100.0f);
                                                        } else if (h44Var instanceof s66) {
                                                            h66 h66Var = ((s66) h44Var).s0;
                                                            mediaAreaCoordinates2.w = uh9.e((h66Var.f << 1) * scaleX, zw7Var.getMeasuredWidth(), f6, 100.0f);
                                                            mecVar.N.coordinates.h = uh9.e((h66Var.h << 1) * scaleY, zw7Var.getMeasuredHeight(), mecVar.g, 100.0f);
                                                        } else if (h44Var instanceof s39) {
                                                            s39 s39Var = (s39) h44Var;
                                                            float padding = ((s39Var.getPadding() << 1) * scaleX) / zw7Var.getMeasuredWidth();
                                                            float padding2 = ((s39Var.getPadding() << 1) * scaleX) / zw7Var.getMeasuredHeight();
                                                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = mecVar.N.coordinates;
                                                            mediaAreaCoordinates3.w = (mecVar.f - padding) * 100.0f;
                                                            mediaAreaCoordinates3.h = (mecVar.g - padding2) * 100.0f;
                                                        }
                                                        mecVar.N.coordinates.rotation = ((-mecVar.e) / 3.141592653589793d) * 180.0d;
                                                        if (z10) {
                                                            radius = ((sd6) h44Var).s0.getRadius();
                                                        } else if (h44Var instanceof xwc) {
                                                            radius = ((xwc) h44Var).s0.getRadius();
                                                        } else if (h44Var instanceof s66) {
                                                            radius = ((s66) h44Var).s0.getRadius();
                                                        }
                                                        d = radius;
                                                    }
                                                }
                                                d = -1.0d;
                                            } else {
                                                b47 b47Var2 = (b47) h44Var;
                                                v37 v37Var = b47Var2.t0;
                                                jo0 jo0Var2 = b47Var2.s0;
                                                RectF rectF = hl.P;
                                                z9 = z7;
                                                double r = b47Var2.r(rectF);
                                                rectF.offset(jo0Var2.getX(), jo0Var2.getY());
                                                rectF.offset(v37Var.getX(), v37Var.getY());
                                                mecVar.N.coordinates.x = (((rectF.centerX() * scaleX) + uh9.x(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x)) / zw7Var.getMeasuredWidth()) * 100.0f;
                                                mecVar.N.coordinates.y = (((rectF.centerY() * scaleY) + uh9.x(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y)) / zw7Var.getMeasuredHeight()) * 100.0f;
                                                mecVar.N.coordinates.w = ((rectF.width() * scaleX) / zw7Var.getMeasuredWidth()) * 100.0f;
                                                mecVar.N.coordinates.h = ((rectF.height() * scaleY) / zw7Var.getMeasuredHeight()) * 100.0f;
                                                mecVar.N.coordinates.rotation = ((-mecVar.e) / 3.141592653589793d) * 180.0d;
                                                d = r;
                                            }
                                            mediaArea = mecVar.N;
                                            if (mediaArea != null && (mediaAreaCoordinates = mediaArea.coordinates) != null && d > 0.0d) {
                                                mediaAreaCoordinates.flags |= 1;
                                                mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                            }
                                            z5 = z8;
                                            z6 = z9;
                                        } else {
                                            if (h44Var instanceof s66) {
                                                s66 s66Var = (s66) h44Var;
                                                h66 h66Var2 = s66Var.s0;
                                                mecVar.a = (byte) 7;
                                                if (h66Var2.e()) {
                                                    mecVar.b = (byte) h66Var2.getPreviewType();
                                                } else {
                                                    mecVar.b = (byte) s66Var.getType();
                                                }
                                                mecVar.f = h66Var2.getWidth();
                                                mecVar.g = h66Var2.getHeight();
                                                mecVar.l = s66Var.v0 ? s66Var.getColor() : 0;
                                                mecVar.Q = h66Var2.e;
                                                mecVar.a0 = s66Var.w0;
                                                boolean z13 = h66Var2.S;
                                                if (z13) {
                                                    ImageReceiver imageReceiver5 = h66Var2.U;
                                                    if (z13 && imageReceiver5.C() && imageReceiver5.n() != null) {
                                                        in5.z().K(new BitmapDrawable(imageReceiver5.n()), imageReceiver5.R, false);
                                                    }
                                                    g66 g66Var = mecVar.a0;
                                                    g66Var.a |= 4;
                                                    g66Var.i = h66Var2.getPhotoSide();
                                                }
                                                TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                                mecVar.N = tL_mediaAreaUrl;
                                                g66 g66Var2 = s66Var.w0;
                                                if (g66Var2 != null) {
                                                    TLRPC.WebPage webPage = g66Var2.d;
                                                    tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? s66Var.w0.c : s66Var.w0.d.url;
                                                    mecVar.N.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                            } else {
                                                if (h44Var instanceof s39) {
                                                    s39 s39Var2 = (s39) h44Var;
                                                    mecVar.a = (byte) 4;
                                                    TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                    mecVar.N = tL_mediaAreaSuggestedReaction;
                                                    w49 currentReaction = s39Var2.getCurrentReaction();
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
                                                    mecVar.N.dark = s39Var2.t0.a == 1;
                                                    TL_stories.MediaArea mediaArea4 = mecVar.N;
                                                    mediaArea4.flipped = s39Var2.A0;
                                                    mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                } else if (h44Var instanceof pp9) {
                                                    pp9 pp9Var = (pp9) h44Var;
                                                    qma baseSize3 = pp9Var.getBaseSize();
                                                    mecVar.f = baseSize3.a;
                                                    mecVar.g = baseSize3.b;
                                                    mecVar.a = (byte) 5;
                                                    if (c8bVar != null) {
                                                        mecVar.j = c8bVar.o0.getAbsolutePath();
                                                        mecVar.R = c8bVar.r0;
                                                        long j = c8bVar.q0;
                                                        mecVar.U = j;
                                                        float f7 = j;
                                                        mecVar.S = (long) (c8bVar.s0 * f7);
                                                        mecVar.T = (long) (c8bVar.t0 * f7);
                                                    }
                                                    mecVar.b = (byte) 4;
                                                    if (pp9Var.t0) {
                                                        mecVar.b = (byte) 6;
                                                    }
                                                } else if (h44Var instanceof b47) {
                                                    b47 b47Var3 = (b47) h44Var;
                                                    jo0 jo0Var3 = b47Var3.s0;
                                                    ArrayList arrayList3 = b47Var3.u0;
                                                    v37 v37Var2 = b47Var3.t0;
                                                    mecVar.a = (byte) 6;
                                                    int width = b47Var3.getWidth();
                                                    mecVar.q = width;
                                                    mecVar.f = width;
                                                    int height = b47Var3.getHeight();
                                                    mecVar.r = height;
                                                    mecVar.g = height;
                                                    r47 r47Var = arrayList3.size() > 0 ? (r47) arrayList3.get(0) : null;
                                                    if (r47Var != null && (message = r47Var.k) != null) {
                                                        TLRPC.MessageAction messageAction = message.action;
                                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                            TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                            TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                            mecVar.N = tL_mediaAreaStarGift;
                                                            tL_mediaAreaStarGift.slug = starGift.slug;
                                                            tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                            int i14 = 0;
                                                            while (true) {
                                                                if (i14 >= v37Var2.getChildCount()) {
                                                                    dl1Var = null;
                                                                    break;
                                                                }
                                                                View childAt2 = v37Var2.getChildAt(i14);
                                                                if (childAt2 instanceof dl1) {
                                                                    dl1Var = (dl1) childAt2;
                                                                    break;
                                                                }
                                                                i14++;
                                                            }
                                                            if (dl1Var == null || (yuaVar = dl1Var.I0) == null || (imageReceiver3 = yuaVar.d) == null) {
                                                                b47Var = b47Var3;
                                                                jo0Var = jo0Var3;
                                                                view = childAt;
                                                                imageReceiver = null;
                                                                if (z3) {
                                                                    if (c8bVar != null) {
                                                                        Matrix matrix = c8bVar.n0;
                                                                        if (c8bVar.K) {
                                                                            matrix.reset();
                                                                            if (v37Var2.getChildCount() == 1) {
                                                                                view3 = v37Var2.getChildAt(0);
                                                                                imageReceiver2 = view3 instanceof wb2 ? ((wb2) view3).getPhotoImage() : null;
                                                                            } else {
                                                                                imageReceiver2 = null;
                                                                                view3 = null;
                                                                            }
                                                                            if (imageReceiver2 != null) {
                                                                                float max = Math.max(imageReceiver2.N0 / Math.max(1, c8bVar.k0), imageReceiver2.O0 / Math.max(1, c8bVar.l0));
                                                                                matrix.postScale(max, max);
                                                                                matrix.postTranslate(imageReceiver2.r() - ((c8bVar.k0 * max) / 2.0f), imageReceiver2.s() - ((c8bVar.l0 * max) / 2.0f));
                                                                                matrix.postTranslate(jo0Var.getX(), jo0Var.getY());
                                                                                matrix.postTranslate(v37Var2.getX(), v37Var2.getY());
                                                                                matrix.postTranslate(view3.getX(), view3.getY());
                                                                                matrix.postScale(b47Var.getScaleX(), b47Var.getScaleY(), b47Var.getPivotX(), b47Var.getPivotY());
                                                                                matrix.postRotate(b47Var.getRotation(), b47Var.getPivotX(), b47Var.getPivotY());
                                                                                matrix.postTranslate(b47Var.getX(), b47Var.getY());
                                                                                matrix.postScale(1.0f / zw7Var.getWidth(), 1.0f / zw7Var.getHeight());
                                                                                matrix.postScale(c8bVar.i0, c8bVar.j0);
                                                                            }
                                                                        }
                                                                    }
                                                                    z7 = false;
                                                                } else {
                                                                    z7 = true;
                                                                }
                                                                z8 = true;
                                                                arrayList.add(mecVar);
                                                                scaleX = view.getScaleX();
                                                                float scaleY2 = view.getScaleY();
                                                                float x2 = view.getX();
                                                                float y2 = view.getY();
                                                                mecVar.q = view.getWidth();
                                                                mecVar.r = view.getHeight();
                                                                mecVar.f = (view.getWidth() * scaleX) / zw7Var.getMeasuredWidth();
                                                                mecVar.g = (view.getHeight() * scaleY2) / zw7Var.getMeasuredHeight();
                                                                mecVar.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x2) / zw7Var.getMeasuredWidth();
                                                                mecVar.d = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y2) / zw7Var.getMeasuredHeight();
                                                                mecVar.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                mecVar.y = ((view.getWidth() / 2.0f) + x2) / zw7Var.getMeasuredWidth();
                                                                mecVar.z = ((view.getHeight() / 2.0f) + y2) / zw7Var.getMeasuredHeight();
                                                                mecVar.w = mecVar.q / zw7Var.getMeasuredWidth();
                                                                mecVar.x = mecVar.r / zw7Var.getMeasuredHeight();
                                                                mecVar.v = scaleX;
                                                                if (h44Var instanceof b47) {
                                                                }
                                                                mediaArea = mecVar.N;
                                                                if (mediaArea != null) {
                                                                    mediaAreaCoordinates.flags |= 1;
                                                                    mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                                                }
                                                                z5 = z8;
                                                                z6 = z9;
                                                            } else {
                                                                imageReceiver3.v0(false, false);
                                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) jxa.i(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                                if (stargiftattributemodel != null) {
                                                                    float L = hl.L(110.0f);
                                                                    float r2 = imageReceiver3.r() + dl1Var.getX() + v37Var2.getX() + dl1Var.G0;
                                                                    float s = imageReceiver3.s() + dl1Var.getY() + v37Var2.getY() + dl1Var.H0;
                                                                    mec mecVar2 = new mec();
                                                                    imageReceiver4 = imageReceiver3;
                                                                    mecVar2.a = (byte) 0;
                                                                    mecVar2.f = L;
                                                                    mecVar2.g = L;
                                                                    TLRPC.Document document2 = stargiftattributemodel.document;
                                                                    mecVar2.B = document2;
                                                                    mecVar2.C = starGift;
                                                                    xb4.G(yac.t0);
                                                                    mecVar2.j = xb4.K(document2, true).getAbsolutePath();
                                                                    if (r47.K2(document2, true) || u0(document2)) {
                                                                        boolean K25 = r47.K2(document2, true);
                                                                        mecVar2.b = (byte) (mecVar2.b | (K25 ? (byte) 1 : (byte) 4));
                                                                        b29 y3 = imageReceiver4.y();
                                                                        if (y3 != null && (K25 || u0(document2))) {
                                                                            r21 = y3.m();
                                                                        }
                                                                        if (r21 != 0) {
                                                                            BigInteger valueOf3 = BigInteger.valueOf(r21);
                                                                            dx7Var.Q0 = dx7Var.Q0.multiply(valueOf3).divide(dx7Var.Q0.gcd(valueOf3));
                                                                        }
                                                                    }
                                                                    float scaleX2 = childAt.getScaleX();
                                                                    float scaleY3 = childAt.getScaleY();
                                                                    float x3 = childAt.getX();
                                                                    float y4 = childAt.getY();
                                                                    int i15 = (int) L;
                                                                    mecVar2.q = i15;
                                                                    mecVar2.r = i15;
                                                                    mecVar2.f = (L * scaleX2) / zw7Var.getMeasuredWidth();
                                                                    mecVar2.g = (L * scaleY3) / zw7Var.getMeasuredHeight();
                                                                    mecVar2.c = (childAt.getWidth() / 2.0f) + x3;
                                                                    mecVar2.d = (childAt.getHeight() / 2.0f) + y4;
                                                                    float x4 = uh9.x(childAt.getWidth(), 2.0f, scaleX2, r2 * scaleX2);
                                                                    b47Var = b47Var3;
                                                                    jo0Var = jo0Var3;
                                                                    view = childAt;
                                                                    double d2 = x4;
                                                                    double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                    double x5 = uh9.x(childAt.getHeight(), 2.0f, scaleY3, s * scaleY3);
                                                                    mecVar2.c = (float) (((Math.cos(rotation) * d2) - (Math.sin(rotation) * x5)) + mecVar2.c);
                                                                    float cos = (float) ((Math.cos(rotation) * x5) + (Math.sin(rotation) * d2) + mecVar2.d);
                                                                    float f8 = (-L) / 2.0f;
                                                                    float f9 = (f8 * scaleX2) + mecVar2.c;
                                                                    mecVar2.c = f9;
                                                                    mecVar2.d = (f8 * scaleY3) + cos;
                                                                    mecVar2.c = f9 / zw7Var.getMeasuredWidth();
                                                                    mecVar2.d /= zw7Var.getMeasuredHeight();
                                                                    mecVar2.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                    mecVar2.v = scaleX2;
                                                                    arrayList.add(mecVar2);
                                                                } else {
                                                                    imageReceiver4 = imageReceiver3;
                                                                    b47Var = b47Var3;
                                                                    jo0Var = jo0Var3;
                                                                    view = childAt;
                                                                }
                                                                imageReceiver = imageReceiver4;
                                                                if (z3) {
                                                                }
                                                                z8 = true;
                                                                arrayList.add(mecVar);
                                                                scaleX = view.getScaleX();
                                                                float scaleY22 = view.getScaleY();
                                                                float x22 = view.getX();
                                                                float y22 = view.getY();
                                                                mecVar.q = view.getWidth();
                                                                mecVar.r = view.getHeight();
                                                                mecVar.f = (view.getWidth() * scaleX) / zw7Var.getMeasuredWidth();
                                                                mecVar.g = (view.getHeight() * scaleY22) / zw7Var.getMeasuredHeight();
                                                                mecVar.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x22) / zw7Var.getMeasuredWidth();
                                                                mecVar.d = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y22) / zw7Var.getMeasuredHeight();
                                                                mecVar.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                mecVar.y = ((view.getWidth() / 2.0f) + x22) / zw7Var.getMeasuredWidth();
                                                                mecVar.z = ((view.getHeight() / 2.0f) + y22) / zw7Var.getMeasuredHeight();
                                                                mecVar.w = mecVar.q / zw7Var.getMeasuredWidth();
                                                                mecVar.x = mecVar.r / zw7Var.getMeasuredHeight();
                                                                mecVar.v = scaleX;
                                                                if (h44Var instanceof b47) {
                                                                }
                                                                mediaArea = mecVar.N;
                                                                if (mediaArea != null) {
                                                                }
                                                                z5 = z8;
                                                                z6 = z9;
                                                            }
                                                        }
                                                    }
                                                    b47Var = b47Var3;
                                                    jo0Var = jo0Var3;
                                                    view = childAt;
                                                    if (r47Var != null) {
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                        mecVar.N = tL_inputMediaAreaChannelPost;
                                                        tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        ((TL_stories.TL_inputMediaAreaChannelPost) mecVar.N).channel = uc7.s1(i8).h1(-c8b.p(r47Var));
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) mecVar.N;
                                                        Boolean C = c8b.C(r47Var);
                                                        tL_inputMediaAreaChannelPost2.msg_id = C == null ? 0 : C.booleanValue() ? r47Var.k.fwd_from.channel_post : r47Var.e1();
                                                    } else {
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                        mecVar.N = tL_inputMediaAreaChannelPost3;
                                                        tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    }
                                                    imageReceiver = null;
                                                    if (z3) {
                                                    }
                                                    z8 = true;
                                                    arrayList.add(mecVar);
                                                    scaleX = view.getScaleX();
                                                    float scaleY222 = view.getScaleY();
                                                    float x222 = view.getX();
                                                    float y222 = view.getY();
                                                    mecVar.q = view.getWidth();
                                                    mecVar.r = view.getHeight();
                                                    mecVar.f = (view.getWidth() * scaleX) / zw7Var.getMeasuredWidth();
                                                    mecVar.g = (view.getHeight() * scaleY222) / zw7Var.getMeasuredHeight();
                                                    mecVar.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x222) / zw7Var.getMeasuredWidth();
                                                    mecVar.d = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y222) / zw7Var.getMeasuredHeight();
                                                    mecVar.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                    mecVar.y = ((view.getWidth() / 2.0f) + x222) / zw7Var.getMeasuredWidth();
                                                    mecVar.z = ((view.getHeight() / 2.0f) + y222) / zw7Var.getMeasuredHeight();
                                                    mecVar.w = mecVar.q / zw7Var.getMeasuredWidth();
                                                    mecVar.x = mecVar.r / zw7Var.getMeasuredHeight();
                                                    mecVar.v = scaleX;
                                                    if (h44Var instanceof b47) {
                                                    }
                                                    mediaArea = mecVar.N;
                                                    if (mediaArea != null) {
                                                    }
                                                    z5 = z8;
                                                    z6 = z9;
                                                }
                                                view = childAt;
                                                z7 = true;
                                                z8 = true;
                                                imageReceiver = null;
                                                arrayList.add(mecVar);
                                                scaleX = view.getScaleX();
                                                float scaleY2222 = view.getScaleY();
                                                float x2222 = view.getX();
                                                float y2222 = view.getY();
                                                mecVar.q = view.getWidth();
                                                mecVar.r = view.getHeight();
                                                mecVar.f = (view.getWidth() * scaleX) / zw7Var.getMeasuredWidth();
                                                mecVar.g = (view.getHeight() * scaleY2222) / zw7Var.getMeasuredHeight();
                                                mecVar.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x2222) / zw7Var.getMeasuredWidth();
                                                mecVar.d = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y2222) / zw7Var.getMeasuredHeight();
                                                mecVar.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                mecVar.y = ((view.getWidth() / 2.0f) + x2222) / zw7Var.getMeasuredWidth();
                                                mecVar.z = ((view.getHeight() / 2.0f) + y2222) / zw7Var.getMeasuredHeight();
                                                mecVar.w = mecVar.q / zw7Var.getMeasuredWidth();
                                                mecVar.x = mecVar.r / zw7Var.getMeasuredHeight();
                                                mecVar.v = scaleX;
                                                if (h44Var instanceof b47) {
                                                }
                                                mediaArea = mecVar.N;
                                                if (mediaArea != null) {
                                                }
                                                z5 = z8;
                                                z6 = z9;
                                            }
                                            b = 1;
                                            i3 = 0;
                                            i7 = i5 + 1;
                                            dx7Var = this;
                                            b2 = b;
                                            i6 = i3;
                                            zw7Var2 = zw7Var;
                                            childCount = i4;
                                        }
                                    }
                                    view = childAt;
                                    z7 = false;
                                    z8 = true;
                                    imageReceiver = null;
                                    arrayList.add(mecVar);
                                    scaleX = view.getScaleX();
                                    float scaleY22222 = view.getScaleY();
                                    float x22222 = view.getX();
                                    float y22222 = view.getY();
                                    mecVar.q = view.getWidth();
                                    mecVar.r = view.getHeight();
                                    mecVar.f = (view.getWidth() * scaleX) / zw7Var.getMeasuredWidth();
                                    mecVar.g = (view.getHeight() * scaleY22222) / zw7Var.getMeasuredHeight();
                                    mecVar.c = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x22222) / zw7Var.getMeasuredWidth();
                                    mecVar.d = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y22222) / zw7Var.getMeasuredHeight();
                                    mecVar.e = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                    mecVar.y = ((view.getWidth() / 2.0f) + x22222) / zw7Var.getMeasuredWidth();
                                    mecVar.z = ((view.getHeight() / 2.0f) + y22222) / zw7Var.getMeasuredHeight();
                                    mecVar.w = mecVar.q / zw7Var.getMeasuredWidth();
                                    mecVar.x = mecVar.r / zw7Var.getMeasuredHeight();
                                    mecVar.v = scaleX;
                                    if (h44Var instanceof b47) {
                                    }
                                    mediaArea = mecVar.N;
                                    if (mediaArea != null) {
                                    }
                                    z5 = z8;
                                    z6 = z9;
                                } else {
                                    zw7Var = zw7Var2;
                                    i4 = childCount;
                                    i5 = i7;
                                    view = childAt;
                                    z5 = true;
                                    z6 = false;
                                    imageReceiver = null;
                                }
                                if (z5 && ((z2 || (z3 && mecVar.a == 6)) && bitmap != null)) {
                                    Canvas canvas2 = new Canvas(bitmap);
                                    float width2 = bitmap.getWidth() / zw7Var.getMeasuredWidth();
                                    int i16 = 0;
                                    while (i16 < 2) {
                                        Canvas canvas3 = i16 == 0 ? canvas2 : null;
                                        if (canvas3 == null || (i16 == 0 && z6)) {
                                            canvas = canvas2;
                                            view2 = view;
                                        } else {
                                            canvas3.save();
                                            canvas3.scale(width2, width2);
                                            canvas3.translate(mecVar.c * zw7Var.getMeasuredWidth(), mecVar.d * zw7Var.getMeasuredHeight());
                                            canvas3.scale(view.getScaleX(), view.getScaleY());
                                            canvas3.rotate(view.getRotation(), ((mecVar.f / 2.0f) / view.getScaleX()) * zw7Var.getMeasuredWidth(), ((mecVar.g / 2.0f) / view.getScaleY()) * zw7Var.getMeasuredHeight());
                                            view2 = view;
                                            if (!(view2 instanceof rlb) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                                canvas = canvas2;
                                                if (view2 instanceof b47) {
                                                    b47 b47Var4 = (b47) view2;
                                                    v37 v37Var3 = b47Var4.t0;
                                                    boolean z14 = true;
                                                    b47Var4.w0 = true;
                                                    int i17 = 0;
                                                    while (i17 < v37Var3.getChildCount()) {
                                                        View childAt3 = v37Var3.getChildAt(i17);
                                                        if (childAt3 instanceof wb2) {
                                                            ((wb2) childAt3).Tc = z14;
                                                        }
                                                        i17++;
                                                        z14 = true;
                                                    }
                                                    view2.draw(canvas3);
                                                    boolean z15 = false;
                                                    b47Var4.w0 = false;
                                                    int i18 = 0;
                                                    while (i18 < v37Var3.getChildCount()) {
                                                        View childAt4 = v37Var3.getChildAt(i18);
                                                        if (childAt4 instanceof wb2) {
                                                            ((wb2) childAt4).Tc = z15;
                                                        }
                                                        i18++;
                                                        z15 = false;
                                                    }
                                                } else {
                                                    view2.draw(canvas3);
                                                }
                                            } else {
                                                int scaleX3 = (int) (view2.getScaleX() * view2.getWidth());
                                                int scaleY4 = (int) (view2.getScaleY() * view2.getHeight());
                                                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                                Bitmap a = lc1.a(scaleX3, scaleY4);
                                                Canvas canvas4 = new Canvas(a);
                                                canvas = canvas2;
                                                canvas4.scale(view2.getScaleX(), view2.getScaleY());
                                                view2.draw(canvas4);
                                                canvas3.scale(1.0f / view2.getScaleX(), 1.0f / view2.getScaleY());
                                                canvas3.drawBitmap(a, (Rect) null, new Rect(0, 0, scaleX3, scaleY4), new Paint(3));
                                                try {
                                                    canvas4.setBitmap(null);
                                                } catch (Exception e) {
                                                    cc4.f(e);
                                                }
                                                a.recycle();
                                            }
                                            canvas3.restore();
                                        }
                                        i16++;
                                        canvas2 = canvas;
                                        view = view2;
                                    }
                                    if (imageReceiver != null) {
                                        b = 1;
                                        i3 = 0;
                                        imageReceiver.v0(true, false);
                                        i7 = i5 + 1;
                                        dx7Var = this;
                                        b2 = b;
                                        i6 = i3;
                                        zw7Var2 = zw7Var;
                                        childCount = i4;
                                    }
                                }
                                b = 1;
                                i3 = 0;
                                i7 = i5 + 1;
                                dx7Var = this;
                                b2 = b;
                                i6 = i3;
                                zw7Var2 = zw7Var;
                                childCount = i4;
                            } else if (arrayList != null) {
                                ((kc1) h44Var).y(zw7Var2.getMeasuredWidth(), zw7Var2.getMeasuredHeight(), arrayList);
                            }
                        }
                        i3 = i6;
                        zw7Var = zw7Var2;
                        i4 = childCount;
                        i5 = i7;
                        b = b2;
                        i7 = i5 + 1;
                        dx7Var = this;
                        b2 = b;
                        i6 = i3;
                        zw7Var2 = zw7Var;
                        childCount = i4;
                    }
                }
                return bitmap;
            }
            Bitmap c = yw7Var.c(false, false);
            createBitmap = c != null ? Bitmap.createBitmap(c.getWidth(), c.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        dx7Var.Q0 = BigInteger.ONE;
        i2 = 0;
        while (i < zw7Var2.getChildCount()) {
        }
        if (i2 > 0) {
        }
        return bitmap;
    }

    public final boolean r0() {
        return this.n0.a() || this.Z1;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.q0) {
            return;
        }
        super.requestLayout();
    }

    @Override // qv7
    public final void s(v01 v01Var) {
        boolean z = v01Var instanceof p01;
        gx7 gx7Var = this.N0;
        if (z || (v01Var instanceof r01)) {
            gx7Var.b(0.4f, 1.75f);
        } else {
            gx7Var.b(0.05f, 1.0f);
        }
        gx7Var.setDrawCenter(!(v01Var instanceof u01));
        yw7 yw7Var = this.y0;
        if (yw7Var.getCurrentBrush() instanceof u01) {
            this.M0 = true;
        }
        yw7Var.setBrush(v01Var);
        igb igbVar = this.k1;
        int i = igbVar.a;
        igbVar.a = a78.e(this.p1).c();
        igbVar.c = this.O0.get();
        D0(igbVar, Integer.valueOf(i), false);
        this.z0.invalidate();
    }

    public final void s0(boolean z) {
        byte b = 0;
        if (this.e2) {
            I0(0);
        }
        if (z) {
            o24 o24Var = this.d2;
            if (o24Var == null || o24Var.getVisibility() != 0) {
                t0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.d2.getMeasuredHeight());
            ofFloat.addUpdateListener(new aw7(this, b));
            this.g2 = true;
            ofFloat.addListener(new sw7(this, (byte) 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(hb.w);
            ofFloat.start();
        }
    }

    public void setBlurManager(tl0 tl0Var) {
        this.O1 = tl0Var;
    }

    public void setCoverPreview(boolean z) {
        if (this.a2 != z) {
            this.a2 = z;
            if (z) {
                C0(null, true);
            }
            setCoverPause(z);
        }
    }

    public void setCoverTime(long j) {
        int i = 0;
        while (true) {
            zw7 zw7Var = this.B0;
            if (i >= zw7Var.getChildCount()) {
                return;
            }
            View childAt = zw7Var.getChildAt(i);
            if (childAt instanceof v3b) {
                ImageReceiver imageReceiver = ((v3b) childAt).z0;
                b29 y = imageReceiver.y();
                imageReceiver.m();
                if (y != null) {
                    y.I(Math.round(((j % y.m()) / y.m()) * y.e[0]), true, false);
                }
            }
            i++;
        }
    }

    public void setHasAudio(boolean z) {
        if (z != this.I1) {
            this.I1 = z;
            c0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.v1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.u1 = runnable;
    }

    @Override // lv7
    public final void t() {
        if (!this.f2 && !this.e2) {
            this.Z1 = true;
            l0(true);
            return;
        }
        if (this.e2) {
            h44 h44Var = this.t0;
            if (h44Var instanceof rlb) {
                this.y1.e = true;
                hl.E3(((rlb) h44Var).getEditText());
            }
        }
        I0(!this.e2 ? 1 : 0);
    }

    public final void t0() {
        o24 o24Var;
        if (!this.e2 && (o24Var = this.d2) != null && o24Var.getVisibility() != 8) {
            this.d2.setVisibility(8);
        }
        int i = this.h2;
        this.h2 = 0;
        if (i != 0) {
            this.y1.a();
        }
    }

    @Override // f44
    public final void u(float f, float f2, float[] fArr) {
        View view;
        View view2 = (View) this.y0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x = (f - view2.getX()) - view.getLeft();
        float y = (f2 - view2.getY()) - view.getTop();
        float pivotX = ((x - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = ((y - view2.getPivotY()) / view2.getScaleY()) + view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = pivotY;
    }

    @Override // wma, snb
    public final void updateColors() {
        this.o1.setColor(-15132391);
    }

    @Override // f44
    public final int[] v(h44 h44Var) {
        int i = (int) h44Var.getPosition().x;
        int[] iArr = this.c2;
        iArr[0] = i;
        iArr[1] = (int) h44Var.getPosition().y;
        return iArr;
    }

    public final void v0(a78 a78Var, Integer num) {
        a78Var.h(num.intValue(), true);
        a78Var.g();
        setNewColor(num.intValue());
        this.g1.setSelectedColorIndex(a78Var.d());
        this.D1 = null;
    }

    @Override // qv7
    public final a78 w() {
        return a78.e(this.p1);
    }

    public final /* synthetic */ void w0(Integer num) {
        setNewColor(num.intValue());
        H0(false);
    }

    public final boolean x0() {
        if (this.M1) {
            if (this.J1.getReactionsWindow() == null || this.J1.getReactionsWindow().q) {
                N0(false);
                return true;
            }
            this.J1.b();
            return true;
        }
        if (this.l1) {
            H0(false);
            return true;
        }
        if (this.e2) {
            s0(true);
            return true;
        }
        if (!this.u0) {
            return false;
        }
        if (!this.w0) {
            C0(null, true);
            return true;
        }
        this.w0 = false;
        this.y1.b(true);
        return false;
    }

    public abstract void y0(boolean z);

    @Override // qv7
    public final void z() {
        M0(new iw7(this, (byte) 4), this, 53, 0, getHeight(), false);
    }

    public final void z0() {
        int i = this.I0;
        Q0(1);
        postDelayed(new pg6((Object) this, (byte) 13), 350L);
        tw7 tw7Var = new tw7(this, getContext(), this.q1, i);
        this.Y1 = tw7Var;
        qbb qbbVar = this.w1;
        Objects.requireNonNull(qbbVar);
        tw7Var.w1 = new yt4((Object) qbbVar, (byte) 26);
        boolean[] zArr = {true};
        tw7Var.setOnDismissListener(new gy5(this, zArr, i, (byte) 1));
        tw7Var.y1 = new jw7(this);
        tw7Var.K0(new r(this, zArr, tw7Var, (byte) 2));
        tw7Var.show();
        y0(true);
    }

    public View getView() {
        return this;
    }

    public void setOffsetTranslationX(float f) {
    }
}

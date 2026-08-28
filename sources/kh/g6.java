package kh;

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
import android.graphics.Path;
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
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wu0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class g6 extends yu0 implements yf.q1, yf.h, yf.m1, wu0, sb {
    public final DispatchQueue A0;
    public final Paint A1;
    public final MediaController.CropState B0;
    public final int B1;
    public boolean C0;
    public final u5 C1;
    public qu0 D0;
    public org.telegram.ui.ActionBar.o1 D1;
    public boolean E0;
    public e6 E1;
    public yf.j F0;
    public Rect F1;
    public boolean G0;
    public Runnable G1;
    public int H0;
    public Runnable H1;
    public boolean I0;
    public final vb I1;
    public final boolean J0;
    public AnimatorSet J1;
    public final w5 K0;
    public final j5 K1;
    public final y5 L0;
    public a8 L1;
    public final b6 M0;
    public ArrayList M1;
    public final a6 N0;
    public int N1;
    public final FrameLayout O0;
    public int O1;
    public final c6 P0;
    public xf.x P1;
    public final g5 Q0;
    public final boolean Q1;
    public final FrameLayout R0;
    public final File R1;
    public n5 S0;
    public final boolean S1;
    public final View T0;
    public final boolean T1;
    public int U0;
    public boolean U1;
    public int V0;
    public uj0 V1;
    public float W0;
    public yf.a2 W1;
    public ValueAnimator X0;
    public float X1;
    public boolean Y0;
    public boolean Y1;
    public final yf.w1 Z0;
    public boolean Z1;
    public final k5.i a1;
    public org.telegram.ui.Components.ba a2;
    public final int b1;
    public final q6 b2;
    public BigInteger c1;
    public final r6 c2;
    public TextView d1;
    public boolean d2;
    public TextView e1;
    public ObjectAnimator e2;
    public TextView f1;
    public final float[] f2;
    public final yf.r1 g1;
    public p5 g2;
    public final yf.o1 h1;
    public boolean h2;
    public final yf.t1 i1;
    public boolean i2;
    public final ImageView j1;
    public boolean j2;
    public final TextView k1;
    public final int[] k2;
    public final TextView l1;
    public wy l2;
    public final TextView m1;
    public boolean m2;
    public final Paint n1;
    public boolean n2;
    public final Paint o1;
    public boolean o2;
    public float p1;
    public int p2;
    public boolean q1;
    public boolean q2;
    public o1.j r1;
    public int r2;
    public final h5 s1;
    public int s2;
    public final Paint t1;
    public int t2;
    public final Paint u1;
    public boolean u2;
    public final Paint v1;
    public final yf.f1 w0;
    public final xf.q1 w1;
    public final yf.j1 x0;
    public boolean x1;
    public final Bitmap y0;
    public o1.j y1;
    public final xf.t1 z0;
    public float z1;

    public g6(Context context, boolean z10, File file, boolean z11, boolean z12, vb vbVar, Activity activity, final int i9, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, a8 a8Var, int i11, int i12, MediaController.CropState cropState, org.telegram.ui.Components.ba baVar, org.telegram.ui.ActionBar.b6 b6Var, q6 q6Var, r6 r6Var) {
        super(context, activity);
        xf.q1 q1Var;
        org.telegram.ui.Components.ba baVar2;
        this.U0 = 0;
        this.V0 = -1;
        final ya yaVar = (ya) this;
        k5.i iVar = new k5.i(yaVar, 23);
        this.a1 = iVar;
        Paint paint = new Paint(1);
        this.n1 = paint;
        Paint paint2 = new Paint(1);
        this.o1 = paint2;
        this.t1 = new Paint(1);
        this.u1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.v1 = paint3;
        xf.q1 q1Var2 = new xf.q1(1.0f, 0.016773745f, -1);
        this.w1 = q1Var2;
        this.A1 = new Paint(1);
        this.f2 = new float[2];
        this.i2 = false;
        this.k2 = new int[2];
        new androidx.activity.i(yaVar, 28);
        setDelegate(this);
        this.a2 = baVar;
        this.b2 = q6Var;
        this.Q1 = z10;
        this.R1 = file;
        this.S1 = z11;
        this.T1 = z12;
        this.I1 = vbVar;
        this.N1 = i11;
        this.O1 = i12;
        this.c2 = r6Var;
        this.B1 = i9;
        u5 u5Var = new u5(b6Var);
        this.C1 = u5Var;
        this.B0 = cropState;
        this.J0 = context instanceof BubbleActivity;
        xf.s0 e10 = xf.s0.e(i9);
        e10.i(0, true);
        q1Var2.a = e10.c();
        q1Var2.c = e10.i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.A0 = dispatchQueue;
        this.y0 = bitmap;
        this.b1 = i10;
        xf.t1 t1Var = new xf.t1();
        this.z0 = t1Var;
        t1Var.a = new p(yaVar, 4);
        View view = new View(context);
        this.T0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        xf.q0 q0Var = new xf.q0(getPaintingSize(), null, i10, baVar);
        if (a8Var == null || !a8Var.u) {
            q1Var = q1Var2;
            baVar2 = baVar;
        } else {
            q1Var = q1Var2;
            baVar2 = null;
        }
        w5 w5Var = new w5(yaVar, context, q0Var, bitmap, bitmap2, baVar2);
        this.K0 = w5Var;
        w5Var.setDelegate(new x5(yaVar));
        w5Var.setUndoStore(t1Var);
        w5Var.setQueue(dispatchQueue);
        w5Var.setVisibility(4);
        y5 y5Var = new y5(yaVar, context);
        this.L0 = y5Var;
        y5Var.setVisibility(4);
        a6 a6Var = new a6(yaVar, context, new z5(yaVar));
        this.N0 = a6Var;
        this.L1 = a8Var;
        this.M1 = arrayList;
        if (this.N1 > 0 && this.O1 > 0) {
            H0();
        }
        a6Var.setVisibility(4);
        this.M0 = new b6(yaVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{TLObject.FLAG_30, 0}));
        addView(frameLayout, g7.e6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.j1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, -1));
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: kh.u4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        ya yaVar2 = yaVar;
                        w5 w5Var2 = yaVar2.K0;
                        if (w5Var2 != null && (w5Var2.getCurrentBrush() instanceof xf.l)) {
                            w5Var2.b();
                            yaVar2.g1.setSelectedIndex(1);
                            yaVar2.n((xf.m) xf.m.a.get(0));
                            break;
                        } else {
                            yaVar2.z0.c();
                            break;
                        }
                        break;
                    case 1:
                        ya yaVar3 = yaVar;
                        w5 w5Var3 = yaVar3.K0;
                        xf.t1 t1Var2 = yaVar3.z0;
                        if (t1Var2.a()) {
                            if (w5Var3 != null && (w5Var3.getCurrentBrush() instanceof xf.l)) {
                                w5Var3.b();
                                yaVar3.g1.setSelectedIndex(1);
                                yaVar3.n((xf.m) xf.m.a.get(0));
                            }
                            if (w5Var3 != null) {
                                w5Var3.a();
                            }
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            yaVar3.N0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ya yaVar4 = yaVar;
                        yf.j jVar = yaVar4.F0;
                        if (jVar instanceof yf.v2) {
                            AndroidUtilities.hideKeyboard(((yf.v2) jVar).getFocusedView());
                        }
                        if (yaVar4.m2) {
                            yaVar4.v0(false);
                        }
                        yaVar4.C0(yaVar4.F0);
                        yaVar4.D0(null, true);
                        break;
                    case 3:
                        yaVar.D0(null, true);
                        break;
                    default:
                        ya yaVar5 = yaVar;
                        if (!yaVar5.x1) {
                            if (!yaVar5.m2) {
                                if (!yaVar5.G0) {
                                    Runnable runnable = yaVar5.H1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    yaVar5.D0(null, true);
                                    break;
                                }
                            } else {
                                yaVar5.v0(true);
                                break;
                            }
                        } else {
                            yaVar5.I0(false);
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, g7.e6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.f6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        ll.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, g7.e6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, g7.e6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new fh.n(7));
        frameLayout.addView(linearLayout, g7.e6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.k1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.f6.f0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        final int i14 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: kh.u4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        ya yaVar2 = yaVar;
                        w5 w5Var2 = yaVar2.K0;
                        if (w5Var2 != null && (w5Var2.getCurrentBrush() instanceof xf.l)) {
                            w5Var2.b();
                            yaVar2.g1.setSelectedIndex(1);
                            yaVar2.n((xf.m) xf.m.a.get(0));
                            break;
                        } else {
                            yaVar2.z0.c();
                            break;
                        }
                        break;
                    case 1:
                        ya yaVar3 = yaVar;
                        w5 w5Var3 = yaVar3.K0;
                        xf.t1 t1Var2 = yaVar3.z0;
                        if (t1Var2.a()) {
                            if (w5Var3 != null && (w5Var3.getCurrentBrush() instanceof xf.l)) {
                                w5Var3.b();
                                yaVar3.g1.setSelectedIndex(1);
                                yaVar3.n((xf.m) xf.m.a.get(0));
                            }
                            if (w5Var3 != null) {
                                w5Var3.a();
                            }
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            yaVar3.N0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ya yaVar4 = yaVar;
                        yf.j jVar = yaVar4.F0;
                        if (jVar instanceof yf.v2) {
                            AndroidUtilities.hideKeyboard(((yf.v2) jVar).getFocusedView());
                        }
                        if (yaVar4.m2) {
                            yaVar4.v0(false);
                        }
                        yaVar4.C0(yaVar4.F0);
                        yaVar4.D0(null, true);
                        break;
                    case 3:
                        yaVar.D0(null, true);
                        break;
                    default:
                        ya yaVar5 = yaVar;
                        if (!yaVar5.x1) {
                            if (!yaVar5.m2) {
                                if (!yaVar5.G0) {
                                    Runnable runnable = yaVar5.H1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    yaVar5.D0(null, true);
                                    break;
                                }
                            } else {
                                yaVar5.v0(true);
                                break;
                            }
                        } else {
                            yaVar5.I0(false);
                            break;
                        }
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView2, g7.e6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.l1 = g10;
        g10.setBackground(org.telegram.ui.ActionBar.f6.f0(822083583, 7, -1));
        g10.setPadding(org.telegram.ui.Cells.j2.c(8.0f, R.string.Clear, g10), 0, AndroidUtilities.dp(8.0f), 0);
        g10.setGravity(16);
        g10.setTextColor(-1);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextSize(1, 16.0f);
        final int i15 = 2;
        g10.setOnClickListener(new View.OnClickListener() { // from class: kh.u4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        ya yaVar2 = yaVar;
                        w5 w5Var2 = yaVar2.K0;
                        if (w5Var2 != null && (w5Var2.getCurrentBrush() instanceof xf.l)) {
                            w5Var2.b();
                            yaVar2.g1.setSelectedIndex(1);
                            yaVar2.n((xf.m) xf.m.a.get(0));
                            break;
                        } else {
                            yaVar2.z0.c();
                            break;
                        }
                        break;
                    case 1:
                        ya yaVar3 = yaVar;
                        w5 w5Var3 = yaVar3.K0;
                        xf.t1 t1Var2 = yaVar3.z0;
                        if (t1Var2.a()) {
                            if (w5Var3 != null && (w5Var3.getCurrentBrush() instanceof xf.l)) {
                                w5Var3.b();
                                yaVar3.g1.setSelectedIndex(1);
                                yaVar3.n((xf.m) xf.m.a.get(0));
                            }
                            if (w5Var3 != null) {
                                w5Var3.a();
                            }
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            yaVar3.N0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ya yaVar4 = yaVar;
                        yf.j jVar = yaVar4.F0;
                        if (jVar instanceof yf.v2) {
                            AndroidUtilities.hideKeyboard(((yf.v2) jVar).getFocusedView());
                        }
                        if (yaVar4.m2) {
                            yaVar4.v0(false);
                        }
                        yaVar4.C0(yaVar4.F0);
                        yaVar4.D0(null, true);
                        break;
                    case 3:
                        yaVar.D0(null, true);
                        break;
                    default:
                        ya yaVar5 = yaVar;
                        if (!yaVar5.x1) {
                            if (!yaVar5.m2) {
                                if (!yaVar5.G0) {
                                    Runnable runnable = yaVar5.H1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    yaVar5.D0(null, true);
                                    break;
                                }
                            } else {
                                yaVar5.v0(true);
                                break;
                            }
                        } else {
                            yaVar5.I0(false);
                            break;
                        }
                        break;
                }
            }
        });
        g10.setAlpha(0.0f);
        g10.setVisibility(8);
        TextView g11 = org.telegram.ui.Cells.j2.g(frameLayout, g10, g7.e6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.m1 = g11;
        g11.setBackground(org.telegram.ui.ActionBar.f6.f0(822083583, 7, -1));
        g11.setPadding(org.telegram.ui.Cells.j2.c(8.0f, R.string.Done, g11), 0, AndroidUtilities.dp(8.0f), 0);
        g11.setGravity(16);
        g11.setTextColor(-1);
        g11.setTypeface(AndroidUtilities.bold());
        g11.setTextSize(1, 16.0f);
        final int i16 = 3;
        g11.setOnClickListener(new View.OnClickListener() { // from class: kh.u4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        ya yaVar2 = yaVar;
                        w5 w5Var2 = yaVar2.K0;
                        if (w5Var2 != null && (w5Var2.getCurrentBrush() instanceof xf.l)) {
                            w5Var2.b();
                            yaVar2.g1.setSelectedIndex(1);
                            yaVar2.n((xf.m) xf.m.a.get(0));
                            break;
                        } else {
                            yaVar2.z0.c();
                            break;
                        }
                        break;
                    case 1:
                        ya yaVar3 = yaVar;
                        w5 w5Var3 = yaVar3.K0;
                        xf.t1 t1Var2 = yaVar3.z0;
                        if (t1Var2.a()) {
                            if (w5Var3 != null && (w5Var3.getCurrentBrush() instanceof xf.l)) {
                                w5Var3.b();
                                yaVar3.g1.setSelectedIndex(1);
                                yaVar3.n((xf.m) xf.m.a.get(0));
                            }
                            if (w5Var3 != null) {
                                w5Var3.a();
                            }
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            yaVar3.N0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ya yaVar4 = yaVar;
                        yf.j jVar = yaVar4.F0;
                        if (jVar instanceof yf.v2) {
                            AndroidUtilities.hideKeyboard(((yf.v2) jVar).getFocusedView());
                        }
                        if (yaVar4.m2) {
                            yaVar4.v0(false);
                        }
                        yaVar4.C0(yaVar4.F0);
                        yaVar4.D0(null, true);
                        break;
                    case 3:
                        yaVar.D0(null, true);
                        break;
                    default:
                        ya yaVar5 = yaVar;
                        if (!yaVar5.x1) {
                            if (!yaVar5.m2) {
                                if (!yaVar5.G0) {
                                    Runnable runnable = yaVar5.H1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    yaVar5.D0(null, true);
                                    break;
                                }
                            } else {
                                yaVar5.v0(true);
                                break;
                            }
                        } else {
                            yaVar5.I0(false);
                            break;
                        }
                        break;
                }
            }
        });
        g11.setAlpha(0.0f);
        g11.setVisibility(8);
        frameLayout.addView(g11, g7.e6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        c6 c6Var = new c6(yaVar, context, e10);
        this.P0 = c6Var;
        c6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        c6Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(c6Var, g7.e6.e(-1, 104, 80));
        yf.r1 r1Var = new yf.r1(context, (a8Var == null || a8Var.v() || a8Var.u || baVar == null) ? false : true);
        this.g1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        c6Var.addView(r1Var, g7.e6.c(48.0f, -1));
        yf.o1 o1Var = new yf.o1(context);
        this.h1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        final int i17 = 1;
        post(new Runnable() { // from class: kh.t4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        ya yaVar2 = yaVar;
                        xf.q1 q1Var3 = yaVar2.w1;
                        yaVar2.F0(q1Var3);
                        xf.s0.e(i9).j(q1Var3.c);
                        break;
                    default:
                        yaVar.h1.setTypeface(xf.s0.e(i9).j);
                        break;
                }
            }
        });
        o1Var.setAlignment(xf.s0.e(i9).g);
        c6Var.addView(o1Var, g7.e6.c(48.0f, -1));
        g5 g5Var = new g5(yaVar, context);
        this.Q0 = g5Var;
        addView(g5Var, g7.e6.c(-1.0f, -1));
        yf.t1 t1Var2 = new yf.t1(context);
        this.i1 = t1Var2;
        t1Var2.setVisibility(8);
        t1Var2.setOnItemClickListener(new eh.j(yaVar, 12));
        o1Var.setTypefaceListView(t1Var2);
        g5Var.addView(t1Var2, g7.e6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(u5Var.N0(org.telegram.ui.ActionBar.f6.G8));
        h5 h5Var = new h5(yaVar, context);
        this.s1 = h5Var;
        h5Var.setVisibility(8);
        h5Var.setColorPalette(xf.s0.e(i9));
        h5Var.setColorListener(new fh.k6(yaVar, 2));
        c6Var.addView(h5Var, g7.e6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        yf.f1 f1Var = new yf.f1(context);
        this.w0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, -1));
        c6Var.addView(f1Var, g7.e6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        final int i18 = 4;
        f1Var.setOnClickListener(new View.OnClickListener() { // from class: kh.u4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        ya yaVar2 = yaVar;
                        w5 w5Var2 = yaVar2.K0;
                        if (w5Var2 != null && (w5Var2.getCurrentBrush() instanceof xf.l)) {
                            w5Var2.b();
                            yaVar2.g1.setSelectedIndex(1);
                            yaVar2.n((xf.m) xf.m.a.get(0));
                            break;
                        } else {
                            yaVar2.z0.c();
                            break;
                        }
                        break;
                    case 1:
                        ya yaVar3 = yaVar;
                        w5 w5Var3 = yaVar3.K0;
                        xf.t1 t1Var22 = yaVar3.z0;
                        if (t1Var22.a()) {
                            if (w5Var3 != null && (w5Var3.getCurrentBrush() instanceof xf.l)) {
                                w5Var3.b();
                                yaVar3.g1.setSelectedIndex(1);
                                yaVar3.n((xf.m) xf.m.a.get(0));
                            }
                            if (w5Var3 != null) {
                                w5Var3.a();
                            }
                            t1Var22.c.clear();
                            t1Var22.b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var22, 14));
                            yaVar3.N0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ya yaVar4 = yaVar;
                        yf.j jVar = yaVar4.F0;
                        if (jVar instanceof yf.v2) {
                            AndroidUtilities.hideKeyboard(((yf.v2) jVar).getFocusedView());
                        }
                        if (yaVar4.m2) {
                            yaVar4.v0(false);
                        }
                        yaVar4.C0(yaVar4.F0);
                        yaVar4.D0(null, true);
                        break;
                    case 3:
                        yaVar.D0(null, true);
                        break;
                    default:
                        ya yaVar5 = yaVar;
                        if (!yaVar5.x1) {
                            if (!yaVar5.m2) {
                                if (!yaVar5.G0) {
                                    Runnable runnable = yaVar5.H1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    yaVar5.D0(null, true);
                                    break;
                                }
                            } else {
                                yaVar5.v0(true);
                                break;
                            }
                        } else {
                            yaVar5.I0(false);
                            break;
                        }
                        break;
                }
            }
        });
        yf.j1 j1Var = new yf.j1(context);
        this.x0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, -1));
        j1Var.setOnClickListener(new fg.f(yaVar, context, e10, 15));
        c6Var.addView(j1Var, g7.e6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        yf.w1 w1Var = new yf.w1(context);
        this.Z0 = w1Var;
        xf.q1 q1Var3 = q1Var;
        w1Var.setColorSwatch(q1Var3);
        w1Var.setRenderView(w5Var);
        w1Var.setValueOverride(iVar);
        q1Var3.c = iVar.get();
        final int i19 = 0;
        w1Var.setOnUpdate(new Runnable() { // from class: kh.t4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        ya yaVar2 = yaVar;
                        xf.q1 q1Var32 = yaVar2.w1;
                        yaVar2.F0(q1Var32);
                        xf.s0.e(i9).j(q1Var32.c);
                        break;
                    default:
                        yaVar.h1.setTypeface(xf.s0.e(i9).j);
                        break;
                }
            }
        });
        addView(w1Var, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R0 = frameLayout2;
        addView(frameLayout2, g7.e6.c(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        E0(q1Var3, null, false);
        n((xf.m) xf.m.a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
        this.K1 = new j5(yaVar, vbVar, new fh.f1(10, yaVar, vbVar));
        n2.C = 1;
    }

    public static void G0(yf.v2 v2Var, int i9) {
        v2Var.setAlign(i9);
        int i10 = 2;
        v2Var.getEditText().setGravity(i9 != 1 ? i9 != 2 ? 19 : 21 : 17);
        if (i9 == 1) {
            i10 = 4;
        } else if (i9 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        v2Var.getEditText().setTextAlignment(i10);
    }

    public static void Z(ya yaVar, xf.s0 s0Var, Integer num) {
        s0Var.h(num.intValue(), true);
        s0Var.g();
        yaVar.setNewColor(num.intValue());
        yaVar.s1.setSelectedColorIndex(s0Var.d());
        yaVar.P1 = null;
    }

    public static /* synthetic */ void a0(ya yaVar, Integer num) {
        yaVar.setNewColor(num.intValue());
        yaVar.I0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.U0 == 2 ? this.h1 : this.g1;
    }

    private int getFrameRotation() {
        int i9 = this.b1;
        if (i9 == 90) {
            return 1;
        }
        if (i9 != 180) {
            return i9 != 270 ? 0 : 3;
        }
        return 2;
    }

    private qu0 getPaintingSize() {
        qu0 qu0Var = this.D0;
        if (qu0Var != null) {
            return qu0Var;
        }
        qu0 qu0Var2 = new qu0(1080.0f, 1920.0f);
        this.D0 = qu0Var2;
        return qu0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i9 = 0;
        while (true) {
            a6 a6Var = this.N0;
            if (i9 >= a6Var.getChildCount()) {
                return;
            }
            View childAt = a6Var.getChildAt(i9);
            if (childAt instanceof yf.n2) {
                ImageReceiver imageReceiver = ((yf.n2) childAt).t0;
                mi0 lottieAnimation = imageReceiver.getLottieAnimation();
                org.telegram.ui.Components.x5 animation = imageReceiver.getAnimation();
                boolean z11 = !z10;
                imageReceiver.setAllowStartLottieAnimation(z11);
                imageReceiver.setAllowStartAnimation(z11);
                if (lottieAnimation != null) {
                    if (z10) {
                        lottieAnimation.stop();
                    } else {
                        lottieAnimation.start();
                    }
                } else if (animation != null) {
                    animation.y = z10;
                    if (z10) {
                        animation.x(false);
                    }
                    if (z10) {
                        animation.stop();
                    } else {
                        animation.start();
                    }
                }
            }
            i9++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i9) {
        xf.q1 q1Var = this.w1;
        int i10 = q1Var.a;
        q1Var.a = i9;
        E0(q1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new v4(this, i10, i9, 0));
        duration.start();
    }

    private void setTextType(int i9) {
        this.H0 = i9;
        yf.j jVar = this.F0;
        if (jVar instanceof yf.v2) {
            ((yf.v2) jVar).setType(i9);
        }
        xf.s0 e10 = xf.s0.e(this.B1);
        e10.h = i9;
        e10.a.edit().putInt("text_type", i9).apply();
        this.h1.e(i9, true);
    }

    private void setupTabsLayout(Context context) {
        n5 n5Var = new n5(this, context);
        this.S0 = n5Var;
        n5Var.setClipToPadding(false);
        this.S0.setOrientation(0);
        this.P0.addView(this.S0, g7.e6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.d1;
        int i9 = org.telegram.ui.ActionBar.f6.i6;
        u5 u5Var = this.C1;
        textView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i9, u5Var), 7, -1));
        this.d1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.d1.setTextColor(-1);
        this.d1.setTextSize(1, 14.0f);
        this.d1.setGravity(1);
        this.d1.setTypeface(AndroidUtilities.bold());
        this.d1.setSingleLine();
        final int i10 = 0;
        this.d1.setOnClickListener(new View.OnClickListener(this) { // from class: kh.o4
            public final /* synthetic */ g6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        g6 g6Var = this.b;
                        if (!g6Var.G0) {
                            g6Var.R0(0);
                            break;
                        } else {
                            g6Var.D0(null, true);
                            break;
                        }
                    case 1:
                        this.b.A0();
                        break;
                    default:
                        g6 g6Var2 = this.b;
                        g6Var2.R0(2);
                        if (!(g6Var2.F0 instanceof yf.v2)) {
                            g6Var2.h2 = true;
                            g6Var2.o0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.S0.addView(this.d1, g7.e6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.e1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.e1.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i9, u5Var), 7, -1));
        this.e1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        final int i11 = 1;
        this.e1.setOnClickListener(new View.OnClickListener(this) { // from class: kh.o4
            public final /* synthetic */ g6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        g6 g6Var = this.b;
                        if (!g6Var.G0) {
                            g6Var.R0(0);
                            break;
                        } else {
                            g6Var.D0(null, true);
                            break;
                        }
                    case 1:
                        this.b.A0();
                        break;
                    default:
                        g6 g6Var2 = this.b;
                        g6Var2.R0(2);
                        if (!(g6Var2.F0 instanceof yf.v2)) {
                            g6Var2.h2 = true;
                            g6Var2.o0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.e1.setTextColor(-1);
        this.e1.setTextSize(1, 14.0f);
        this.e1.setGravity(1);
        this.e1.setTypeface(AndroidUtilities.bold());
        this.e1.setAlpha(0.6f);
        this.e1.setSingleLine();
        this.S0.addView(this.e1, g7.e6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f1.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i9, u5Var), 7, -1));
        this.f1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f1.setTextColor(-1);
        this.f1.setTextSize(1, 14.0f);
        this.f1.setGravity(1);
        this.f1.setTypeface(AndroidUtilities.bold());
        this.f1.setAlpha(0.6f);
        this.f1.setSingleLine();
        final int i12 = 2;
        this.f1.setOnClickListener(new View.OnClickListener(this) { // from class: kh.o4
            public final /* synthetic */ g6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        g6 g6Var = this.b;
                        if (!g6Var.G0) {
                            g6Var.R0(0);
                            break;
                        } else {
                            g6Var.D0(null, true);
                            break;
                        }
                    case 1:
                        this.b.A0();
                        break;
                    default:
                        g6 g6Var2 = this.b;
                        g6Var2.R0(2);
                        if (!(g6Var2.F0 instanceof yf.v2)) {
                            g6Var2.h2 = true;
                            g6Var2.o0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.S0.addView(this.f1, g7.e6.l(1.0f, 0, -2));
    }

    public static boolean x0(TLRPC.Document document) {
        if (document != null) {
            for (int i9 = 0; i9 < document.attributes.size(); i9++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    @Override // yf.q1
    public final void A() {
        N0(new x4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void A0() {
        final int i9 = this.U0;
        R0(1);
        postDelayed(new bg.d2(this, 16), 350L);
        p5 p5Var = new p5(this, getContext(), this.C1, i9);
        this.g2 = p5Var;
        vb vbVar = this.I1;
        Objects.requireNonNull(vbVar);
        p5Var.w = new yf.w0(1, vbVar);
        final boolean[] zArr = {true};
        p5Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: kh.e5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                g6 g6Var = g6.this;
                g6Var.g2 = null;
                if (zArr[0]) {
                    g6Var.z0(false);
                }
                g6Var.R0(i9);
            }
        });
        p5Var.y = new z4(this);
        p5Var.p0(new f5(this, zArr, p5Var, 0));
        p5Var.show();
        z0(true);
    }

    public final void B0(yf.j jVar) {
        this.z0.b(jVar.getUUID(), new w4(this, jVar, 0));
    }

    public final void C0(yf.j jVar) {
        yf.j jVar2 = this.F0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.i0, false);
            D0(null, true);
            if (jVar instanceof yf.v2) {
                ValueAnimator valueAnimator = this.X0;
                if (valueAnimator != null && this.V0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.N0.removeView(jVar);
        g0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            xf.t1 t1Var = this.z0;
            t1Var.b.remove(uuid);
            t1Var.c.remove(uuid);
            AndroidUtilities.runOnUIThread(new pf.o1(t1Var, 14));
        }
        yf.w1 w1Var = this.Z0;
        k5.i iVar = this.a1;
        w1Var.setValueOverride(iVar);
        w1Var.setShowPreview(true);
        float f10 = iVar.get();
        xf.q1 q1Var = this.w1;
        q1Var.c = f10;
        E0(q1Var, null, false);
        if (this.j2 || !(jVar instanceof yf.b2)) {
            return;
        }
        wb wbVar = ((ya) this).w2;
        kb kbVar = wbVar.T0;
        if (kbVar != null) {
            kbVar.s(null, null, true);
        }
        ya yaVar = wbVar.r1;
        if (yaVar != null) {
            yaVar.q0();
        }
        mb mbVar = wbVar.Y0;
        if (mbVar != null) {
            mbVar.setHasRoundVideo(false);
        }
        a8 a8Var = wbVar.G1;
        if (a8Var != null) {
            File file = a8Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                wbVar.G1.o0 = null;
            }
            if (wbVar.G1.p0 != null) {
                try {
                    new File(wbVar.G1.p0).delete();
                } catch (Exception unused2) {
                }
                wbVar.G1.p0 = null;
            }
        }
    }

    @Override // yf.m1
    public final void D() {
        P0(true);
    }

    public final boolean D0(yf.j jVar, boolean z10) {
        boolean z11;
        gc gcVar;
        gc gcVar2;
        uj0 uj0Var;
        int i9;
        boolean z12 = jVar instanceof yf.v2;
        int i10 = 2;
        if (z12 && (((i9 = this.V0) == -1 && this.U0 != 2) || (i9 != -1 && i9 != 2))) {
            ValueAnimator valueAnimator = this.X0;
            if (valueAnimator != null && i9 != 2) {
                valueAnimator.cancel();
            }
            if (this.x1) {
                I0(false);
            }
            R0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            yf.v2 v2Var = (yf.v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity == 17) {
                i10 = 1;
            } else if (gravity != 21) {
                i10 = 0;
            }
            yf.o1 o1Var = this.h1;
            o1Var.setAlignment(i10);
            xf.i0 typeface = v2Var.getTypeface();
            if (typeface != null) {
                o1Var.setTypeface(typeface.a);
            }
            o1Var.e(v2Var.getType(), true);
            this.Q0.invalidate();
        }
        yf.j jVar2 = this.F0;
        if (jVar2 == null) {
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!jVar.W) {
                    if (jVar instanceof yf.s0) {
                        yf.s0 s0Var = (yf.s0) jVar;
                        s0Var.setType((s0Var.getType() + 1) % s0Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof yf.w2) {
                        yf.w2 w2Var = (yf.w2) jVar;
                        w2Var.setType((w2Var.getType() + 1) % w2Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof yf.p0) {
                        yf.p0 p0Var = (yf.p0) jVar;
                        yf.n0 n0Var = p0Var.m0;
                        if (n0Var.e()) {
                            n0Var.setPreviewType(n0Var.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        p0Var.setType(p0Var.getNextType());
                        return true;
                    }
                    if (!this.G0) {
                        if (jVar instanceof yf.v2) {
                            this.I0 = true;
                            r0();
                            return true;
                        }
                        if (!(jVar instanceof yf.a2)) {
                            M0(jVar2);
                            return true;
                        }
                        yf.a2 a2Var = (yf.a2) jVar;
                        if (this.Y1 && this.W1 == jVar) {
                            a2Var.q(true);
                            return true;
                        }
                        yf.a2 a2Var2 = this.W1;
                        if (a2Var2 != null && a2Var2 != a2Var && (uj0Var = this.V1) != null) {
                            uj0Var.animate().alpha(0.0f).setListener(new l5(uj0Var, 0));
                            this.V1 = null;
                            this.Y1 = false;
                            this.X1 = 0.0f;
                        }
                        if (this.V1 == null) {
                            uj0 uj0Var2 = new uj0(2, this.B1, getContext(), LaunchActivity.R(), new ih.n2(6, new ih.b()));
                            this.V1 = uj0Var2;
                            org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(this.a2, uj0Var2, 0, false);
                            this.V1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                            this.I1.addView(this.V1, g7.e6.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.a.k(-16777216, 120));
                            uj0 uj0Var3 = this.V1;
                            b3.b bVar = new b3.b();
                            bVar.e = this;
                            bVar.c = faVar;
                            bVar.d = paint;
                            bVar.b = new Path();
                            uj0Var3.setDelegate(bVar);
                            this.V1.p(null, null, true);
                        }
                        this.V1.setFragment(LaunchActivity.R());
                        this.W1 = a2Var;
                        O0(true);
                        return true;
                    }
                    if (jVar2 instanceof yf.v2) {
                        AndroidUtilities.showKeyboard(((yf.v2) jVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.i0, false);
            yf.j jVar3 = this.F0;
            if (jVar3 instanceof yf.v2) {
                yf.v2 v2Var2 = (yf.v2) jVar3;
                yf.u2 u2Var = v2Var2.m0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    this.G0 = false;
                    AndroidUtilities.hideKeyboard(((yf.v2) this.F0).getFocusedView());
                    v0(false);
                }
            } else if ((jVar3 instanceof yf.b2) && (gcVar2 = ((ya) this).w2.V0) != null) {
                gcVar2.l(false);
            }
            z11 = true;
        }
        yf.j jVar4 = this.F0;
        this.F0 = jVar;
        if ((jVar4 instanceof yf.v2) && TextUtils.isEmpty(((yf.v2) jVar4).getText())) {
            C0(jVar4);
        }
        yf.j jVar5 = this.F0;
        if (jVar4 != jVar5 && (jVar5 instanceof yf.b2) && (gcVar = ((ya) this).w2.V0) != null) {
            gcVar.l(true);
        }
        yf.j jVar6 = this.F0;
        k5.i iVar = this.a1;
        xf.q1 q1Var = this.w1;
        yf.w1 w1Var = this.Z0;
        if (jVar6 != null) {
            b6 b6Var = this.M0;
            jVar6.i0 = b6Var;
            jVar6.l(b6Var, true);
            yf.j jVar7 = this.F0;
            if (jVar7 instanceof yf.v2) {
                yf.v2 v2Var3 = (yf.v2) jVar7;
                v2Var3.getSwatch().c = q1Var.c;
                v2Var3.v0 = false;
                F0(v2Var3.getSwatch());
                w1Var.setValueOverride(new k5(v2Var3, (int) (this.D0.a / 9.0f), 0));
                w1Var.setShowPreview(false);
            } else {
                w1Var.setValueOverride(iVar);
                w1Var.setShowPreview(true);
                q1Var.c = iVar.get();
                E0(q1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.X0;
            if (valueAnimator2 != null && this.V0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.x1) {
                I0(false);
            }
            R0(0);
            w1Var.setValueOverride(iVar);
            w1Var.setShowPreview(true);
            q1Var.c = iVar.get();
            E0(q1Var, null, false);
            z13 = z11;
        }
        U0();
        return z13;
    }

    public final void E0(xf.q1 q1Var, Integer num, boolean z10) {
        xf.q1 q1Var2 = this.w1;
        if (q1Var2 != q1Var) {
            q1Var2.a = q1Var.a;
            q1Var2.b = q1Var.b;
            q1Var2.c = q1Var.c;
            int i9 = this.B1;
            xf.s0.e(i9).h(q1Var.a, true);
            xf.s0.e(i9).j(q1Var.c);
        }
        int i10 = q1Var.a;
        w5 w5Var = this.K0;
        w5Var.setColor(i10);
        w5Var.setBrushSize(q1Var.c);
        int i11 = q1Var2.a;
        int i12 = 0;
        if (num == null || num.intValue() == i11) {
            c6 c6Var = this.P0;
            if (c6Var != null) {
                c6Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new p4(this, num, i11, i12));
            duration.start();
        }
        yf.j jVar = this.F0;
        if (jVar instanceof yf.v2) {
            ((yf.v2) jVar).setSwatch(new xf.q1(q1Var.b, q1Var.c, q1Var.a));
            return;
        }
        if (z10 && (jVar instanceof yf.s0)) {
            ((yf.s0) jVar).setColor(q1Var.a);
            ((yf.s0) this.F0).setType(3);
        } else if (z10 && (jVar instanceof yf.w2)) {
            ((yf.w2) jVar).setColor(q1Var.a);
            ((yf.w2) this.F0).setType(3);
        } else if (z10 && (jVar instanceof yf.p0)) {
            ((yf.p0) jVar).setColor(q1Var.a);
            ((yf.p0) this.F0).setType(0);
        }
    }

    public final void F0(xf.q1 q1Var) {
        E0(q1Var, null, false);
    }

    @Override // org.telegram.ui.Components.wu0
    public final void G(int i9, boolean z10) {
        boolean z11;
        if (i9 > AndroidUtilities.dp(50.0f) && this.n2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.s2 = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.s2).commit();
            } else {
                this.r2 = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.r2).commit();
            }
        }
        boolean z12 = this.m2;
        j5 j5Var = this.K1;
        if (z12) {
            int paddingUnderContainer = this.I1.getPaddingUnderContainer() + (z10 ? this.s2 : this.r2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l2.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = AndroidUtilities.displaySize.x;
            if (i10 != i11 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i11;
                layoutParams.height = paddingUnderContainer;
                this.l2.setLayoutParams(layoutParams);
                this.p2 = layoutParams.height;
                j5Var.a();
                requestLayout();
            }
        }
        if (this.t2 == i9 && this.u2 == z10) {
            return;
        }
        this.t2 = i9;
        this.u2 = z10;
        boolean z13 = this.n2;
        yf.j jVar = this.F0;
        if (jVar instanceof yf.v2) {
            this.n2 = ((yf.v2) jVar).getEditText().isFocused() && j5Var.c();
        } else {
            this.n2 = false;
        }
        if (this.n2 && this.m2) {
            J0(0);
        }
        if (this.p2 != 0 && !(z11 = this.n2) && z11 != z13 && !this.m2) {
            this.p2 = 0;
            j5Var.a();
            requestLayout();
        }
        U0();
        if (z13 && !this.n2 && this.p2 > 0 && this.q2) {
            this.q2 = false;
        }
        S0();
    }

    public final void H0() {
        int i9;
        Emoji.EmojiSpan[] emojiSpanArr;
        yf.j jVar;
        ArrayList arrayList = this.M1;
        if (arrayList == null) {
            return;
        }
        a8 a8Var = this.L1;
        this.L1 = null;
        this.M1 = null;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            a6 a6Var = this.N0;
            if (i10 >= size) {
                a6Var.setVisibility(0);
                return;
            }
            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i10);
            byte b10 = mediaEntity.type;
            if (b10 == 0) {
                t5 n02 = n0(mediaEntity.parentObject, mediaEntity.document);
                if ((2 & mediaEntity.subType) != 0) {
                    n02.r(z10);
                }
                ViewGroup.LayoutParams layoutParams = n02.getLayoutParams();
                layoutParams.width = mediaEntity.viewWidth;
                layoutParams.height = mediaEntity.viewHeight;
                i9 = i10;
                jVar = n02;
            } else if (b10 == 1) {
                yf.v2 o02 = o0(z10);
                o02.setType(mediaEntity.subType);
                o02.setTypeface(mediaEntity.textTypeface);
                o02.setBaseFontSize(mediaEntity.fontSize);
                SpannableString spannableString = new SpannableString(mediaEntity.text);
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i11);
                    i11++;
                    VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                    org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(emojiEntity2.document_id, 1.0f, o02.getFontMetricsInt());
                    int i12 = emojiEntity2.offset;
                    spannableString.setSpan(t5Var, i12, emojiEntity2.length + i12, 33);
                    i10 = i10;
                }
                i9 = i10;
                CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, o02.getFontMetricsInt(), false);
                if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                o02.setText(replaceEmoji);
                G0(o02, mediaEntity.textAlign);
                xf.q1 swatch = o02.getSwatch();
                swatch.a = mediaEntity.color;
                o02.setSwatch(swatch);
                jVar = o02;
            } else {
                i9 = i10;
                if (b10 == 2) {
                    yf.x1 k02 = k0(mediaEntity.text, false);
                    k02.C0 = mediaEntity.crop;
                    k02.x0 = false;
                    if ((2 & mediaEntity.subType) != 0) {
                        k02.r(false);
                    }
                    if ((mediaEntity.subType & 16) != 0) {
                        k02.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = k02.getLayoutParams();
                    layoutParams2.width = mediaEntity.viewWidth;
                    layoutParams2.height = mediaEntity.viewHeight;
                    jVar = k02;
                } else if (b10 == 6) {
                    ArrayList arrayList3 = a8Var.v;
                    boolean z11 = a8Var.K;
                    this.h2 = true;
                    yf.j s5Var = new s5(this, getContext(), e0(), arrayList3, this.a2, z11, this.b2);
                    s5Var.setDelegate(this);
                    a6Var.addView(s5Var);
                    g0();
                    jVar = s5Var;
                    if (mediaEntity.viewWidth > 0) {
                        jVar = s5Var;
                        if (mediaEntity.viewHeight > 0) {
                            ViewGroup.LayoutParams layoutParams3 = s5Var.getLayoutParams();
                            layoutParams3.width = mediaEntity.viewWidth;
                            layoutParams3.height = mediaEntity.viewHeight;
                            jVar = s5Var;
                        }
                    }
                } else if (b10 == 3) {
                    yf.s0 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                    int i13 = mediaEntity.color;
                    if (i13 != 0) {
                        j02.setColor(i13);
                    }
                    j02.setType(mediaEntity.subType);
                    jVar = j02;
                } else if (b10 == 8) {
                    tc tcVar = mediaEntity.weather;
                    if (tcVar == null) {
                        i10 = i9 + 1;
                        z10 = false;
                    } else {
                        yf.w2 p02 = p0(tcVar);
                        int i14 = mediaEntity.color;
                        if (i14 != 0) {
                            p02.setColor(i14);
                        }
                        p02.setType(mediaEntity.subType);
                        jVar = p02;
                    }
                } else if (b10 == 7) {
                    yf.p0 i02 = i0(mediaEntity.linkSettings);
                    yf.n0 n0Var = i02.m0;
                    int i15 = mediaEntity.color;
                    if (i15 != 0) {
                        i02.setColor(i15);
                    }
                    boolean e10 = n0Var.e();
                    int i16 = n0Var.h;
                    int i17 = n0Var.f;
                    if (e10) {
                        n0Var.setPreviewType(mediaEntity.subType);
                    }
                    byte b11 = mediaEntity.subType;
                    if (b11 == -1) {
                        i02.setType(3);
                        n0Var.d();
                        mediaEntity.viewWidth = ((int) Math.ceil(n0Var.T)) + i17 + i17;
                        mediaEntity.viewHeight = ((int) Math.ceil(n0Var.U)) + i16 + i16;
                        PointF position = i02.getPosition();
                        position.y = (this.O1 * 0.3f) + position.y;
                        i02.setPosition(position);
                        i10 = i9 + 1;
                        z10 = false;
                    } else {
                        i02.setType(b11);
                        jVar = i02;
                    }
                } else if (b10 == 4) {
                    yf.a2 l02 = l0(false);
                    l02.s(hg.r0.d(mediaEntity.mediaArea.reaction), false);
                    if (mediaEntity.mediaArea.flipped) {
                        l02.r(false);
                    }
                    jVar = l02;
                    if (mediaEntity.mediaArea.dark) {
                        l02.q(false);
                        jVar = l02;
                    }
                } else {
                    if (b10 == 5 && a8Var.o0 != null) {
                        yf.b2 m0 = m0(a8Var.p0, false);
                        wb wbVar = ((ya) this).w2;
                        kb kbVar = wbVar.T0;
                        if (kbVar != null) {
                            kbVar.w = m0;
                            k61 k61Var = kbVar.x;
                            if (k61Var != null) {
                                k61Var.W(m0.q0);
                            }
                        }
                        mb mbVar = wbVar.Y0;
                        if (mbVar != null) {
                            mbVar.setHasRoundVideo(true);
                        }
                        jVar = m0;
                        if ((2 & mediaEntity.subType) != 0) {
                            boolean z12 = !m0.n0;
                            m0.n0 = z12;
                            m0.o0.f(z12, true);
                            m0.invalidate();
                            jVar = m0;
                        }
                    }
                    i10 = i9 + 1;
                    z10 = false;
                }
            }
            jVar.setX((mediaEntity.x * this.N1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
            jVar.setY((mediaEntity.y * this.O1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
            jVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + jVar.getX(), (mediaEntity.viewHeight / 2.0f) + jVar.getY()));
            jVar.setScale(mediaEntity.scale);
            jVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
            i10 = i9 + 1;
            z10 = false;
        }
    }

    public final void I0(final boolean z10) {
        if (this.x1 != z10) {
            this.x1 = z10;
            o1.j jVar = this.y1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new gb.a(z10 ? 0.0f : 1000.0f));
            this.y1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            int i9 = 0;
            final boolean[] zArr = {this.K1.c() || this.p2 > 0};
            final float translationY = this.P0.getTranslationY();
            final float alpha = this.x0.getAlpha();
            final ViewGroup barView = getBarView();
            this.y1.b(new o1.g() { // from class: kh.q4
                @Override // o1.g
                public final void a(o1.h hVar, float f10, float f11) {
                    g6 g6Var = g6.this;
                    c6 c6Var = g6Var.P0;
                    float f12 = f10 / 1000.0f;
                    g6Var.z1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(g6Var.z1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(g6Var.z1, 0.25f) / 0.25f));
                    h5 h5Var = g6Var.s1;
                    float f14 = g6Var.z1;
                    boolean z11 = z10;
                    h5Var.y1(f14, z11);
                    yf.j1 j1Var = g6Var.x0;
                    j1Var.setProgress(g6Var.z1);
                    yf.f1 f1Var = g6Var.w0;
                    f1Var.setProgress(g6Var.z1);
                    g6Var.S0.setTranslationY(AndroidUtilities.dp(32.0f) * g6Var.z1);
                    AnimatorSet animatorSet = g6Var.J1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f15 = g6Var.z1;
                        if (!z11) {
                            f15 = 1.0f - f15;
                        }
                        float f16 = z11 ? 1.0f : 0.0f;
                        float f17 = alpha;
                        j1Var.setAlpha(AndroidUtilities.lerp(f17, f16, f15));
                        f1Var.setAlpha(AndroidUtilities.lerp(f17, z11 ? 1.0f : 0.0f, f15));
                        c6Var.setTranslationY(translationY - ((AndroidUtilities.dp(39.0f) * f15) * (z11 ? 1 : -1)));
                    }
                    c6Var.invalidate();
                    if (view == g6Var.h1) {
                        g6Var.Q0.invalidate();
                    }
                }
            });
            this.y1.a(new r4(this, z10, i9));
            this.y1.f();
            if (z10) {
                h5 h5Var = this.s1;
                h5Var.setVisibility(0);
                h5Var.setSelectedColorIndex(xf.s0.e(this.B1).d());
            }
        }
    }

    public final void J0(int i9) {
        yf.o1 o1Var = this.h1;
        j5 j5Var = this.K1;
        int i10 = 1;
        if (i9 == 1) {
            wy wyVar = this.l2;
            boolean z10 = wyVar != null && wyVar.getVisibility() == 0;
            wy wyVar2 = this.l2;
            vb vbVar = this.I1;
            if (wyVar2 != null && wyVar2.Y0 != UserConfig.selectedAccount) {
                vbVar.removeView(wyVar2);
                this.l2 = null;
            }
            if (this.l2 == null) {
                wy wyVar3 = new wy(null, true, false, false, getContext(), false, null, null, true, this.C1, false, false);
                this.l2 = wyVar3;
                wyVar3.t2 = false;
                wyVar3.Q0 = true;
                wyVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.l2.setForseMultiwindowLayout(true);
                }
                this.l2.setDelegate(new v5(this));
                vbVar.addView(this.l2);
            }
            this.l2.setVisibility(0);
            this.m2 = true;
            wy wyVar4 = this.l2;
            if (this.r2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.r2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.r2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.s2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.s2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.s2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int paddingUnderContainer = vbVar.getPaddingUnderContainer() + (point.x > point.y ? this.s2 : this.r2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            wyVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                yf.j jVar = this.F0;
                if (jVar instanceof yf.v2) {
                    AndroidUtilities.hideKeyboard(((yf.v2) jVar).getEditText());
                }
            }
            this.p2 = paddingUnderContainer;
            j5Var.a();
            requestLayout();
            qg emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(og.d, true);
            }
            if (!z10) {
                if (this.n2) {
                    this.q2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p2, 0.0f);
                    ofFloat.addUpdateListener(new s4(this, i10));
                    ofFloat.addListener(new m5(this, i10));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                    ofFloat.start();
                }
            }
        } else {
            qg emojiButton2 = o1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(og.e, true);
            }
            wy wyVar5 = this.l2;
            if (wyVar5 != null) {
                this.m2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    wyVar5.setVisibility(8);
                }
            }
            if (i9 == 0) {
                this.p2 = 0;
                j5Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(yf.p0 p0Var) {
        k8 k8Var = new k8(getContext(), this.C1, this.c2, new fh.f1(12, this, p0Var));
        if (p0Var != null) {
            yf.m0 m0Var = p0Var.q0;
            k8Var.Y = true;
            org.telegram.ui.Cells.j3 j3Var = k8Var.V;
            org.telegram.ui.Cells.j3 j3Var2 = k8Var.U;
            if (m0Var != null) {
                k8Var.c0 = m0Var.d;
                k8Var.d0 = false;
                j3Var2.setText(m0Var.c);
                j3Var.setText(m0Var.b);
                k8Var.i0 = !TextUtils.isEmpty(m0Var.b);
                k8Var.j0 = m0Var.f;
                k8Var.k0 = m0Var.e;
            } else {
                j3Var2.setText("");
                j3Var.setText("");
                k8Var.j0 = true;
                k8Var.k0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = k8Var.X;
            dVar.g(string, false, true);
            g8 g8Var = k8Var.T;
            if (g8Var != null) {
                g8Var.N(false);
            }
            dVar.setEnabled(k8Var.U(j3Var2.getText().toString()));
            k8Var.Y = false;
        }
        k8Var.setOnDismissListener(new c5(this, 1));
        k8Var.show();
        z0(true);
    }

    public final void L0(yf.s0 s0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ki kiVar = new ki(getContext(), new q5(this, callback2), false, true, false, this.C1);
        kiVar.V1 = new r5();
        mh mhVar = kiVar.t1;
        if (s0Var != null && (messageMedia = s0Var.q0) != null && (geoPoint = messageMedia.geo) != null) {
            kiVar.t2 = new double[]{geoPoint.lat, geoPoint._long};
            kiVar.K = true;
            mhVar.setVisibility(8);
        } else if (this.Q1) {
            kiVar.r2 = this.S1;
            kiVar.s2 = this.R1;
            kiVar.K = true;
            mhVar.setVisibility(8);
        } else {
            kiVar.K = true;
            mhVar.setVisibility(8);
        }
        kiVar.setOnDismissListener(new c5(this, 0));
        kiVar.r1();
        kiVar.show();
    }

    public final void M0(yf.j jVar) {
        if (jVar instanceof yf.e1) {
            org.telegram.ui.ActionBar.o1 o1Var = this.D1;
            if (o1Var == null || !o1Var.isShowing()) {
                return;
            }
            this.D1.d(true);
            return;
        }
        int[] iArr = this.k2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        a6 a6Var = this.N0;
        float scaleX2 = a6Var.getScaleX() * scaleX;
        float scaleY = a6Var.getScaleY() * jVar.getScaleY() * jVar.getHeight();
        int i9 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i9;
        int i10 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i10;
        N0(new w4(this, jVar, 1), this, 51, i9, i10 - AndroidUtilities.dp(32.0f), true);
    }

    public final void N0(Runnable runnable, g6 g6Var, int i9, int i10, int i11, boolean z10) {
        org.telegram.ui.ActionBar.o1 o1Var = this.D1;
        if (o1Var != null && o1Var.isShowing()) {
            this.D1.d(true);
            return;
        }
        if (this.E1 == null) {
            this.F1 = new Rect();
            e6 e6Var = new e6(this, getContext());
            this.E1 = e6Var;
            e6Var.setAnimationEnabled(true);
            this.E1.setOnTouchListener(new y4(this, 0));
            this.E1.setDispatchKeyEventListener(new z4(this));
            this.E1.setShownFromBottom(true);
        }
        e6 e6Var2 = this.E1;
        e6Var2.S = z10;
        e6Var2.d();
        runnable.run();
        if (this.D1 == null) {
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(this.E1, -2, -2);
            this.D1 = o1Var2;
            o1Var2.b = true;
            o1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.D1.setOutsideTouchable(true);
            this.D1.setClippingEnabled(true);
            this.D1.setInputMethodMode(2);
            this.D1.setSoftInputMode(0);
            this.D1.getContentView().setFocusableInTouchMode(true);
            this.D1.setOnDismissListener(new a5(this, 0));
        }
        this.E1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31));
        this.D1.setFocusable(true);
        int measuredWidth = i10 - (this.E1.getMeasuredWidth() / 2);
        int measuredHeight = i11 - this.E1.getMeasuredHeight();
        this.D1.showAtLocation(g6Var, i9, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.o1.i(this.E1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            e6 e6Var3 = this.E1;
            e6Var3.setBackgroundDrawable(new org.telegram.ui.Components.ea(new org.telegram.ui.Components.fa(this.a2, e6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
        } else {
            this.E1.setBackgroundDrawable(mutate);
            this.E1.setBackgroundColor(-14145495);
        }
    }

    public final void O0(boolean z10) {
        if (this.Y1 != z10) {
            if (z10 || this.V1 != null) {
                this.Y1 = z10;
                int i9 = 0;
                if (z10) {
                    this.V1.n();
                    this.V1.setVisibility(0);
                    this.V1.setSelectedReaction(this.W1.getCurrentReaction());
                    this.V1.getParent().bringChildToFront(this.V1);
                } else {
                    this.W1 = null;
                }
                if (!z10) {
                    if (this.V1.getReactionsWindow() != null) {
                        this.V1.getReactionsWindow().e();
                    }
                    this.V1.animate().alpha(0.0f).setDuration(150L).setListener(new m5(this, i9)).start();
                    return;
                }
                this.Z1 = true;
                this.I1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X1, z10 ? 1.0f : 0.0f);
                this.V1.setTransitionProgress(this.X1);
                ofFloat.addUpdateListener(new s4(this, 2));
                ofFloat.addListener(new hg.b0(12, this, z10));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(gr.g);
                ofFloat.start();
            }
        }
    }

    public final void P0(boolean z10) {
        if (this.q1 != z10) {
            this.q1 = z10;
            o1.j jVar = this.r1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new gb.a(z10 ? 0.0f : 1000.0f));
            this.r1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            if (z10) {
                yf.t1 t1Var = this.i1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            int i9 = 1;
            this.r1.b(new ih.x7(i9, this));
            this.r1.a(new r4(this, z10, i9));
            this.r1.f();
        }
    }

    public final PointF Q0(yf.j jVar) {
        float f10;
        MediaController.CropState cropState = this.B0;
        float f11 = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f12 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF e02 = e0();
        int i9 = 0;
        while (i9 < 10) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                a6 a6Var = this.N0;
                if (i10 >= a6Var.getChildCount()) {
                    break;
                }
                View childAt = a6Var.getChildAt(i10);
                if (!(childAt instanceof yf.j) || (childAt instanceof yf.e1)) {
                    f10 = f12;
                } else {
                    PointF position2 = ((yf.j) childAt).getPosition();
                    f10 = f12;
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f10) {
                        f11 = Math.min(childAt.getHeight(), childAt.getWidth()) * 0.2f;
                        z10 = true;
                    }
                }
                i10++;
                f12 = f10;
            }
            float f13 = f12;
            if (!z10) {
                break;
            }
            i9++;
            e02 = new PointF(e02.x + f11, e02.y + f11);
            f12 = f13;
        }
        return e02;
    }

    @Override // org.telegram.ui.Components.yu0, org.telegram.ui.Components.xu0
    public final int R() {
        return this.K1.l - this.I1.getBottomPadding2();
    }

    public final void R0(int i9) {
        if (this.U0 == i9 || this.V0 == i9) {
            return;
        }
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = this.U0;
        ViewGroup viewGroup = this.h1;
        ViewGroup viewGroup2 = this.g1;
        ViewGroup viewGroup3 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        this.V0 = i9;
        ViewGroup viewGroup4 = i9 == 0 ? viewGroup2 : i9 == 2 ? viewGroup : null;
        int i11 = this.B1;
        xf.s0 e10 = xf.s0.e(i11);
        int i12 = 1;
        boolean z10 = i9 == 2;
        if (e10.l != z10) {
            e10.l = z10;
            if (z10) {
                e10.i(-1, false);
            } else {
                e10.i(e10.a.getInt("brush", 0), false);
            }
        }
        int c10 = xf.s0.e(i11).c();
        xf.q1 q1Var = this.w1;
        q1Var.a = c10;
        E0(q1Var, null, false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.X0 = duration;
        duration.setInterpolator(gr.f);
        this.X0.addUpdateListener(new ih.i3(this, viewGroup3, viewGroup4, i12));
        this.X0.addListener(new o5(this, viewGroup3, viewGroup4, i9, 0));
        this.X0.start();
    }

    public final void S0() {
        j5 j5Var = this.K1;
        yf.o1 o1Var = this.h1;
        if (o1Var != null) {
            if (j5Var.c()) {
                o1Var.a(R.drawable.input_smile);
            } else if (this.m2) {
                o1Var.a(R.drawable.input_keyboard);
            } else {
                o1Var.a(R.drawable.msg_add);
            }
        }
        boolean z10 = j5Var.c() || this.m2;
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.k1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.j1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.m1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.l1, z10, false, 1.0f, true, null);
    }

    public final void T0() {
        yf.j jVar;
        ObjectAnimator objectAnimator = this.e2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.K0.getParent();
        if (view == null) {
            return;
        }
        j5 j5Var = this.K1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!j5Var.c() || j5Var.d) && this.p2 <= 0) || (jVar = this.F0) == null) ? 0.0f : view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.e2 = ofFloat;
        ofFloat.setDuration(350L);
        this.e2.setInterpolator(gr.h);
        this.e2.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0() {
        boolean z10;
        if (this.F0 instanceof yf.v2) {
            j5 j5Var = this.K1;
            if ((j5Var.c() || this.p2 > 0) && !j5Var.d) {
                z10 = true;
                View view = this.T0;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new eh.f(9, this, z10)).start();
            }
        }
        z10 = false;
        View view2 = this.T0;
        view2.animate().cancel();
        view2.setVisibility(0);
        view2.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new eh.f(9, this, z10)).start();
    }

    @Override // yf.q1, yf.m1
    public final void a() {
        I0(true);
    }

    @Override // yf.h
    public final int[] b(yf.j jVar) {
        int i9 = (int) jVar.getPosition().x;
        int[] iArr = this.k2;
        iArr[0] = i9;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    @Override // org.telegram.ui.Components.xu0, org.telegram.ui.ActionBar.w5
    public final void d() {
        this.A1.setColor(-15132391);
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new ih.j7(15, this, view)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.i2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        if ((view == this.K0 || view == this.L0 || view == this.N0 || view == this.M0) && (cropState = this.B0) != null) {
            canvas.save();
            r1 = this.J0 ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i9 = cropState.transformRotation;
            if (i9 != 90 && i9 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * cropState.cropPh)) / cropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r1 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            r1 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (r1 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // yf.m1
    public final void e() {
        setTextType((this.H0 + 1) % 4);
    }

    public final PointF e0() {
        a6 a6Var = this.N0;
        int measuredWidth = a6Var.getMeasuredWidth();
        int measuredHeight = a6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.N1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.O1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override // yf.m1
    public final void f(int i9) {
        yf.j jVar = this.F0;
        if (jVar instanceof yf.v2) {
            G0((yf.v2) jVar, i9);
            xf.s0 e10 = xf.s0.e(this.B1);
            e10.g = i9;
            e10.a.edit().putInt("text_alignment", i9).apply();
        }
    }

    public abstract boolean f0(bg.c2 c2Var);

    public final void g0() {
        boolean z10 = this.S1;
        a6 a6Var = this.N0;
        boolean z11 = true;
        if (!z10 && !this.U1) {
            int i9 = 0;
            loop0: while (true) {
                if (i9 >= a6Var.getChildCount()) {
                    z11 = false;
                    break;
                }
                View childAt = a6Var.getChildAt(i9);
                boolean z12 = childAt instanceof yf.v2;
                int i10 = this.B1;
                if (z12) {
                    CharSequence text = ((yf.v2) childAt).getText();
                    if (text instanceof Spanned) {
                        for (org.telegram.ui.Components.t5 t5Var : (org.telegram.ui.Components.t5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.t5.class)) {
                            TLRPC.Document document = t5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.k5.f(i10, t5Var.getDocumentId());
                            }
                            if (document != null) {
                                org.telegram.ui.Components.k5.h(i10).e(document);
                            }
                            if (a8.u(document, FileLoader.getInstance(i10).getPathToAttach(document, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i9++;
                } else if (childAt instanceof yf.n2) {
                    TLRPC.Document sticker = ((yf.n2) childAt).getSticker();
                    if (a8.u(sticker, FileLoader.getInstance(i10).getPathToAttach(sticker, true).getAbsolutePath())) {
                        break;
                    } else {
                        i9++;
                    }
                } else if (childAt instanceof yf.b2) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        for (int i11 = 0; i11 < a6Var.getChildCount(); i11++) {
            View childAt2 = a6Var.getChildAt(i11);
            if (childAt2 instanceof yf.j) {
                ((yf.j) childAt2).setIsVideo(z11);
            }
        }
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.K0.c(true, false);
    }

    public View getBottomLayout() {
        return this.P0;
    }

    public View getCancelView() {
        return this.w0;
    }

    @Override // org.telegram.ui.Components.yu0, org.telegram.ui.Components.xu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.x0;
    }

    public View getEntitiesView() {
        return this.N0;
    }

    public long getLcm() {
        return this.c1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.t5[] t5VarArr;
        a6 a6Var = this.N0;
        int childCount = a6Var.getChildCount();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = a6Var.getChildAt(i9);
            if (childAt instanceof yf.n2) {
                TLRPC.Document sticker = ((yf.n2) childAt).getSticker();
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
            } else if (childAt instanceof yf.v2) {
                CharSequence text = ((yf.v2) childAt).getText();
                if ((text instanceof Spanned) && (t5VarArr = (org.telegram.ui.Components.t5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.t5.class)) != null) {
                    for (org.telegram.ui.Components.t5 t5Var : t5VarArr) {
                        if (t5Var != null) {
                            TLRPC.Document document = t5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.k5.f(this.B1, t5Var.getDocumentId());
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
        return Arrays.asList(this.K0, this.L0, this.N0, this.M0);
    }

    public View getRenderInputView() {
        return this.L0;
    }

    public xf.c1 getRenderView() {
        return this.K0;
    }

    public yf.j getSelectedEntity() {
        return this.F0;
    }

    public View getSelectionEntitiesView() {
        return this.M0;
    }

    public View getTextDimView() {
        return this.T0;
    }

    public View getTopLayout() {
        return this.O0;
    }

    public View getWeightChooserView() {
        return this.Z0;
    }

    public final TextView h0(int i9, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, this.C1));
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i9));
        textView.setText(str);
        return textView;
    }

    public final yf.p0 i0(yf.m0 m0Var) {
        int i9;
        this.h2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        a6 a6Var = this.N0;
        float measuredWidth = a6Var.getMeasuredWidth() <= 0 ? this.N1 : a6Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        yf.p0 p0Var = new yf.p0(getContext(), Q0, this.B1, m0Var, measuredWidth / 360.0f, dp);
        if (Q0.x == a6Var.getMeasuredWidth() / 2.0f) {
            p0Var.setStickyX(2);
        }
        if (Q0.y == a6Var.getMeasuredHeight() / 2.0f) {
            p0Var.setStickyY(2);
        }
        xf.q1 q1Var = this.w1;
        if (q1Var != null && (i9 = q1Var.a) != -47814) {
            p0Var.setColor(i9);
        }
        p0Var.setDelegate(this);
        p0Var.setMaxWidth(dp);
        a6Var.addView(p0Var, g7.e6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            p0Var.j(1.0f / cropState.cropScale);
            p0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return p0Var;
    }

    public final yf.s0 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i9;
        this.h2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        a6 a6Var = this.N0;
        float measuredWidth = a6Var.getMeasuredWidth() <= 0 ? this.N1 : a6Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        yf.s0 s0Var = new yf.s0(getContext(), Q0, this.B1, messageMedia, mediaArea, measuredWidth / 240.0f, dp);
        if (Q0.x == a6Var.getMeasuredWidth() / 2.0f) {
            s0Var.setStickyX(2);
        }
        if (Q0.y == a6Var.getMeasuredHeight() / 2.0f) {
            s0Var.setStickyY(2);
        }
        xf.q1 q1Var = this.w1;
        if (q1Var != null && (i9 = q1Var.a) != -47814) {
            s0Var.setColor(i9);
        }
        s0Var.setDelegate(this);
        s0Var.setMaxWidth(dp);
        a6Var.addView(s0Var, g7.e6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            s0Var.j(1.0f / cropState.cropScale);
            s0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return s0Var;
    }

    @Override // yf.h
    public final boolean k(yf.j jVar) {
        return D0(jVar, true);
    }

    public final yf.x1 k0(String str, boolean z10) {
        float f10;
        qu0 qu0Var;
        this.h2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            FileLog.e(e10);
            f10 = 1.0f;
        }
        a6 a6Var = this.N0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.N1, a6Var.getMeasuredWidth()) * 0.5d);
            qu0Var = new qu0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.O1, a6Var.getMeasuredHeight()) * 0.5d);
            qu0Var = new qu0(f10 * floor2, floor2);
        }
        qu0 qu0Var2 = qu0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = qu0Var2.a;
            qu0Var2.a = qu0Var2.b;
            qu0Var2.b = f11;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        yf.x1 x1Var = new yf.x1(context, e02, qu0Var2, str, intValue);
        x1Var.setDelegate(this);
        a6Var.addView(x1Var);
        g0();
        return x1Var;
    }

    public final yf.a2 l0(boolean z10) {
        String str;
        qu0 qu0Var = new qu0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        a6 a6Var = this.N0;
        if (a6Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i9 = 0; i9 < a6Var.getChildCount(); i9++) {
                    View childAt = a6Var.getChildAt(i9);
                    if (g7.w.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (a6Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (a6Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, a6Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, a6Var.getMeasuredHeight(), 0.0f);
            }
        }
        yf.a2 a2Var = new yf.a2(getContext(), e02);
        a2Var.n0 = new ih.s8(a2Var);
        a2Var.o0 = new ih.s8(a2Var);
        a2Var.p0 = new hg.i0(a2Var);
        a2Var.q0 = new hg.i0(a2Var);
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(a2Var);
        a2Var.s0 = y5Var;
        org.telegram.ui.Components.y5 y5Var2 = new org.telegram.ui.Components.y5(a2Var);
        a2Var.t0 = y5Var2;
        a2Var.v0 = 1.0f;
        a2Var.m0 = qu0Var;
        y5Var2.d(1.0f, true);
        y5Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        hg.i0 i0Var = a2Var.p0;
        int i10 = 0;
        while (true) {
            if (i10 >= reactionsList.size()) {
                str = reactionsList.get(0).reaction;
                break;
            }
            if (reactionsList.get(i10).title.equals("Red Heart")) {
                str = reactionsList.get(i10).reaction;
                break;
            }
            i10++;
        }
        hg.r0 b10 = hg.r0.b(str);
        a2Var.r0 = b10;
        i0Var.e(b10);
        a2Var.k();
        a2Var.setDelegate(this);
        a6Var.addView(a2Var);
        g0();
        if (z10) {
            B0(a2Var);
            D0(a2Var, true);
        }
        return a2Var;
    }

    @Override // kh.sb
    public final boolean m(MotionEvent motionEvent) {
        if (this.i2) {
            return false;
        }
        if (this.F0 != null) {
            D0(null, true);
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y10);
        this.K0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final yf.b2 m0(String str, boolean z10) {
        this.h2 = true;
        this.j2 = true;
        q0();
        a6 a6Var = this.N0;
        int measuredWidth = a6Var.getMeasuredWidth();
        a6Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.N1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        qu0 qu0Var = new qu0(floor, floor);
        yf.b2 b2Var = new yf.b2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (qu0Var.b / 2.0f) + AndroidUtilities.dp(72.0f)), qu0Var, str);
        b2Var.setDelegate(this);
        a6Var.addView(b2Var);
        g0();
        if (z10) {
            B0(b2Var);
            post(new n4(this, b2Var, 0));
        }
        this.j2 = false;
        return b2Var;
    }

    @Override // yf.q1
    public final void n(xf.m mVar) {
        boolean z10 = mVar instanceof xf.b;
        yf.w1 w1Var = this.Z0;
        if (z10 || (mVar instanceof xf.d)) {
            w1Var.b(0.4f, 1.75f);
        } else {
            w1Var.b(0.05f, 1.0f);
        }
        w1Var.setDrawCenter(!(mVar instanceof xf.l));
        w5 w5Var = this.K0;
        if (w5Var.getCurrentBrush() instanceof xf.l) {
            this.Y0 = true;
        }
        w5Var.setBrush(mVar);
        xf.q1 q1Var = this.w1;
        int i9 = q1Var.a;
        q1Var.a = xf.s0.e(this.B1).c();
        q1Var.c = this.a1.get();
        E0(q1Var, Integer.valueOf(i9), false);
        this.L0.invalidate();
    }

    public final t5 n0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i9 = 0; i9 < document.attributes.size() && !(document.attributes.get(i9) instanceof TLRPC.TL_documentAttributeSticker); i9++) {
        }
        float f11 = 0.75f;
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            f10 = -(cropState.transformRotation + cropState.cropRotate);
            f11 = 0.75f / cropState.cropScale;
        } else {
            f10 = 0.0f;
        }
        f6 f6Var = new f6(e0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        t5 t5Var = new t5(this, context, f6Var.a, f6Var.c, f6Var.b, new qu0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = t5Var.t0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        t5Var.setDelegate(this);
        this.N0.addView(t5Var);
        g0();
        return t5Var;
    }

    public final yf.v2 o0(boolean z10) {
        qu0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        yf.v2 v2Var = new yf.v2(getContext(), Q0, (int) (paintingSize.a / 9.0f), "", this.w1, this.H0);
        float f10 = paintingSize.a / 9.0f;
        x4 x4Var = new x4(this, 0);
        v2Var.s0 = (int) (0.5f * f10);
        v2Var.t0 = (int) (f10 * 2.0f);
        v2Var.u0 = x4Var;
        float f11 = Q0.x;
        a6 a6Var = this.N0;
        if (f11 == a6Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (Q0.y == a6Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth(this.N1 - AndroidUtilities.dp(32.0f));
        int i9 = this.B1;
        v2Var.setTypeface(xf.s0.e(i9).j);
        v2Var.setType(xf.s0.e(i9).h);
        a6Var.addView(v2Var, g7.e6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            v2Var.j(1.0f / cropState.cropScale);
            v2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            B0(v2Var);
            v2Var.q();
            D0(v2Var, false);
            v2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(v2Var.getFocusedView());
            this.G0 = true;
            int i10 = xf.s0.e(i9).g;
            yf.o1 o1Var = this.h1;
            o1Var.d(i10, true);
            o1Var.setOutlineType(xf.s0.e(i9).h);
        }
        return v2Var;
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        uj0 uj0Var = this.V1;
        if (uj0Var != null) {
            AndroidUtilities.removeFromParent(uj0Var);
            this.V1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        float currentActionBarHeight;
        float f10;
        this.C0 = true;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.y0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f10 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f10)) > currentActionBarHeight2) {
            Math.floor((r3 * f10) / currentActionBarHeight);
        }
        float f11 = this.D0.a;
        yf.j jVar = this.F0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.P0, i9, i10);
        measureChild(this.Z0, i9, i10);
        measureChild(this.R0, i9, i10);
        measureChild(this.Q0, i9, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.p2 - this.I1.getPaddingUnderContainer(), R()), TLObject.FLAG_30));
        FrameLayout frameLayout = this.O0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i9, i10);
        this.C0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.m2 && !this.o2) {
            this.C0 = true;
            w0();
            this.C0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    public final yf.w2 p0(tc tcVar) {
        int i9;
        this.h2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        a6 a6Var = this.N0;
        float measuredWidth = a6Var.getMeasuredWidth() <= 0 ? this.N1 : a6Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        yf.w2 w2Var = new yf.w2(getContext(), Q0, this.B1, tcVar, measuredWidth / 240.0f, dp);
        if (Q0.x == a6Var.getMeasuredWidth() / 2.0f) {
            w2Var.setStickyX(2);
        }
        if (Q0.y == a6Var.getMeasuredHeight() / 2.0f) {
            w2Var.setStickyY(2);
        }
        xf.q1 q1Var = this.w1;
        if (q1Var != null && (i9 = q1Var.a) != -47814) {
            w2Var.setColor(i9);
        }
        w2Var.setDelegate(this);
        w2Var.setMaxWidth(dp);
        a6Var.addView(w2Var, g7.e6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.B0;
        if (cropState != null) {
            w2Var.j(1.0f / cropState.cropScale);
            w2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return w2Var;
    }

    public final void q0() {
        int i9 = 0;
        while (true) {
            a6 a6Var = this.N0;
            if (i9 >= a6Var.getChildCount()) {
                return;
            }
            View childAt = a6Var.getChildAt(i9);
            if (childAt instanceof yf.b2) {
                if (this.F0 == childAt) {
                    D0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(gr.h).withEndAction(new n4(this, (yf.b2) childAt, 1)).start();
            }
            i9++;
        }
    }

    @Override // yf.h
    public final boolean r() {
        return !(this.F0 instanceof yf.e1);
    }

    public abstract void r0();

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.C0) {
            return;
        }
        super.requestLayout();
    }

    @Override // yf.h
    public final boolean s() {
        return !this.G0;
    }

    public final yf.e1 s0() {
        int i9 = 0;
        while (true) {
            a6 a6Var = this.N0;
            if (i9 >= a6Var.getChildCount()) {
                return null;
            }
            View childAt = a6Var.getChildAt(i9);
            if (childAt instanceof yf.e1) {
                return (yf.e1) childAt;
            }
            i9++;
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ba baVar) {
        this.a2 = baVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.i2 != z10) {
            this.i2 = z10;
            if (z10) {
                D0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j10) {
        int i9 = 0;
        while (true) {
            a6 a6Var = this.N0;
            if (i9 >= a6Var.getChildCount()) {
                return;
            }
            View childAt = a6Var.getChildAt(i9);
            if (childAt instanceof yf.n2) {
                ImageReceiver imageReceiver = ((yf.n2) childAt).t0;
                mi0 lottieAnimation = imageReceiver.getLottieAnimation();
                imageReceiver.getAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.L(Math.round(((j10 % lottieAnimation.p()) / lottieAnimation.p()) * lottieAnimation.e[0]), true, false);
                }
            }
            i9++;
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.U1) {
            this.U1 = z10;
            g0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.H1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.G1 = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0b8e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap t0(ArrayList arrayList, boolean z10, boolean z11, boolean z12, boolean z13, a8 a8Var) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i9;
        int i10;
        a6 a6Var;
        int i11;
        int i12;
        View view;
        boolean z14;
        boolean z15;
        ImageReceiver imageReceiver;
        Canvas canvas;
        View view2;
        int i13;
        yf.e1 e1Var;
        bh.g gVar;
        boolean z16;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z17;
        TLRPC.Message message;
        org.telegram.ui.Cells.w0 w0Var;
        gh.m5 m5Var;
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
        yf.v2 v2Var;
        boolean z20;
        g6 g6Var = this;
        w5 w5Var = g6Var.K0;
        int i14 = 0;
        byte b10 = 1;
        a6 a6Var2 = g6Var.N0;
        if (z10) {
            createBitmap = w5Var.c(false, z13);
        } else if (z12) {
            createBitmap = Bitmap.createBitmap(Math.max(1, a6Var2.getMeasuredWidth()), Math.max(1, a6Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z11) {
                bitmap = null;
                g6Var.c1 = BigInteger.ONE;
                i10 = 0;
                for (i9 = 0; i9 < a6Var2.getChildCount(); i9++) {
                    if (a6Var2.getChildAt(i9) instanceof yf.j) {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    int childCount = a6Var2.getChildCount();
                    int i15 = 0;
                    while (i15 < childCount) {
                        View childAt = a6Var2.getChildAt(i15);
                        if (childAt instanceof yf.j) {
                            yf.j jVar = (yf.j) childAt;
                            jVar.getPosition();
                            VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                            if (arrayList != null) {
                                boolean z21 = jVar instanceof yf.v2;
                                int i16 = g6Var.B1;
                                if (z21) {
                                    mediaEntity.type = b10;
                                    yf.v2 v2Var2 = (yf.v2) jVar;
                                    CharSequence text = v2Var2.getText();
                                    if (text instanceof Spanned) {
                                        Spanned spanned = (Spanned) text;
                                        v2Var = v2Var2;
                                        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(i14, text.length(), org.telegram.ui.Components.t5.class);
                                        if (t5VarArr != null) {
                                            int i17 = 0;
                                            while (i17 < t5VarArr.length) {
                                                org.telegram.ui.Components.t5 t5Var = t5VarArr[i17];
                                                org.telegram.ui.Components.t5[] t5VarArr2 = t5VarArr;
                                                TLRPC.Document document = t5Var.document;
                                                int i18 = i17;
                                                a6 a6Var3 = a6Var2;
                                                if (document == null) {
                                                    document = org.telegram.ui.Components.k5.f(i16, t5Var.getDocumentId());
                                                }
                                                if (document != null) {
                                                    org.telegram.ui.Components.k5.h(i16).e(document);
                                                }
                                                VideoEditedInfo.EmojiEntity emojiEntity = new VideoEditedInfo.EmojiEntity();
                                                int i19 = childCount;
                                                int i20 = i15;
                                                emojiEntity.document_id = t5Var.getDocumentId();
                                                emojiEntity.document = document;
                                                emojiEntity.offset = spanned.getSpanStart(t5Var);
                                                emojiEntity.length = spanned.getSpanEnd(t5Var) - emojiEntity.offset;
                                                emojiEntity.documentAbsolutePath = FileLoader.getInstance(i16).getPathToAttach(document, true).getAbsolutePath();
                                                int i21 = 0;
                                                while (document != null) {
                                                    ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                    if (arrayList2 == null || arrayList2.isEmpty() || new File(emojiEntity.documentAbsolutePath).exists()) {
                                                        break;
                                                    }
                                                    FileLoader fileLoader = FileLoader.getInstance(i16);
                                                    TLRPC.PhotoSize photoSize = document.thumbs.get(i21);
                                                    int i22 = i21;
                                                    z20 = true;
                                                    emojiEntity.documentAbsolutePath = fileLoader.getPathToAttach(photoSize, true).getAbsolutePath();
                                                    int i23 = i22 + 1;
                                                    if (i23 >= document.thumbs.size()) {
                                                        break;
                                                    }
                                                    i21 = i23;
                                                }
                                                z20 = true;
                                                boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, z20);
                                                if (isAnimatedStickerDocument || x0(emojiEntity.document)) {
                                                    emojiEntity.subType = (byte) (emojiEntity.subType | (isAnimatedStickerDocument ? (byte) 1 : (byte) 4));
                                                }
                                                if (MessageObject.isTextColorEmoji(emojiEntity.document)) {
                                                    emojiEntity.subType = (byte) (emojiEntity.subType | 8);
                                                }
                                                mediaEntity.entities.add(emojiEntity);
                                                if (document != null) {
                                                    BigInteger valueOf = BigInteger.valueOf(5000L);
                                                    g6Var.c1 = g6Var.c1.multiply(valueOf).divide(g6Var.c1.gcd(valueOf));
                                                }
                                                i17 = i18 + 1;
                                                childCount = i19;
                                                t5VarArr = t5VarArr2;
                                                a6Var2 = a6Var3;
                                                i15 = i20;
                                            }
                                        }
                                    } else {
                                        v2Var = v2Var2;
                                    }
                                    a6Var = a6Var2;
                                    i13 = childCount;
                                    i12 = i15;
                                    mediaEntity.text = text.toString();
                                    mediaEntity.subType = (byte) v2Var.getType();
                                    mediaEntity.color = v2Var.getSwatch().a;
                                    mediaEntity.fontSize = v2Var.getTextSize();
                                    mediaEntity.textTypeface = v2Var.getTypeface();
                                    mediaEntity.textAlign = v2Var.getAlign();
                                } else {
                                    a6Var = a6Var2;
                                    i13 = childCount;
                                    i12 = i15;
                                    if (jVar instanceof yf.n2) {
                                        mediaEntity.type = (byte) 0;
                                        yf.n2 n2Var = (yf.n2) jVar;
                                        qu0 baseSize = n2Var.getBaseSize();
                                        mediaEntity.width = baseSize.a;
                                        mediaEntity.height = baseSize.b;
                                        mediaEntity.document = n2Var.getSticker();
                                        mediaEntity.parentObject = n2Var.getParentObject();
                                        TLRPC.Document sticker = n2Var.getSticker();
                                        mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                        if (MessageObject.isAnimatedStickerDocument(sticker, true) || x0(sticker)) {
                                            boolean isAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                            mediaEntity.subType = (byte) (mediaEntity.subType | (isAnimatedStickerDocument2 ? (byte) 1 : (byte) 4));
                                            r20 = (isAnimatedStickerDocument2 || x0(sticker)) ? n2Var.getDuration() : 5000L;
                                            if (r20 != 0) {
                                                BigInteger valueOf2 = BigInteger.valueOf(r20);
                                                g6Var.c1 = g6Var.c1.multiply(valueOf2).divide(g6Var.c1.gcd(valueOf2));
                                            }
                                        }
                                        if (MessageObject.isTextColorEmoji(sticker)) {
                                            mediaEntity.color = -1;
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                        }
                                        if (n2Var.p0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (jVar instanceof yf.x1) {
                                        yf.x1 x1Var = (yf.x1) jVar;
                                        mediaEntity.type = (byte) 2;
                                        qu0 baseSize2 = x1Var.getBaseSize();
                                        mediaEntity.width = baseSize2.a;
                                        mediaEntity.height = baseSize2.b;
                                        mediaEntity.text = x1Var.q(i16);
                                        mediaEntity.crop = x1Var.C0;
                                        if (x1Var.p0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (jVar instanceof yf.s0) {
                                        yf.s0 s0Var = (yf.s0) jVar;
                                        yf.r0 r0Var = s0Var.m0;
                                        mediaEntity.type = (byte) 3;
                                        mediaEntity.subType = (byte) s0Var.getType();
                                        mediaEntity.width = r0Var.getWidth();
                                        mediaEntity.height = r0Var.getHeight();
                                        mediaEntity.text = r0Var.getText();
                                        mediaEntity.color = s0Var.n0 ? s0Var.getColor() : 0;
                                        mediaEntity.density = r0Var.y;
                                        mediaEntity.media = s0Var.q0;
                                        TL_stories.MediaArea mediaArea2 = s0Var.r0;
                                        mediaEntity.mediaArea = mediaArea2;
                                        mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument = r0Var.getCodeEmojiDocument();
                                        if (codeEmojiDocument != null) {
                                            VideoEditedInfo.EmojiEntity emojiEntity2 = new VideoEditedInfo.EmojiEntity();
                                            emojiEntity2.document_id = codeEmojiDocument.id;
                                            emojiEntity2.document = codeEmojiDocument;
                                            emojiEntity2.documentAbsolutePath = FileLoader.getInstance(i16).getPathToAttach(codeEmojiDocument, true).getAbsolutePath();
                                            boolean isAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                            if (isAnimatedStickerDocument3 || x0(emojiEntity2.document)) {
                                                emojiEntity2.subType = (byte) (emojiEntity2.subType | (isAnimatedStickerDocument3 ? (byte) 1 : (byte) 4));
                                            }
                                            mediaEntity.entities.add(emojiEntity2);
                                        }
                                    } else if (jVar instanceof yf.w2) {
                                        yf.w2 w2Var = (yf.w2) jVar;
                                        yf.r0 r0Var2 = w2Var.m0;
                                        mediaEntity.type = (byte) 8;
                                        mediaEntity.subType = (byte) w2Var.getType();
                                        mediaEntity.width = r0Var2.getWidth();
                                        mediaEntity.height = r0Var2.getHeight();
                                        mediaEntity.text = r0Var2.getText();
                                        mediaEntity.color = w2Var.n0 ? w2Var.getColor() : 0;
                                        mediaEntity.density = r0Var2.y;
                                        mediaEntity.weather = w2Var.q0;
                                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                        tL_mediaAreaWeather.emoji = w2Var.q0.c;
                                        tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                        tL_mediaAreaWeather.color = r0Var2.f.getColor();
                                        mediaEntity.mediaArea = tL_mediaAreaWeather;
                                        tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument2 = r0Var2.getCodeEmojiDocument();
                                        if (codeEmojiDocument2 != null) {
                                            VideoEditedInfo.EmojiEntity emojiEntity3 = new VideoEditedInfo.EmojiEntity();
                                            emojiEntity3.document_id = codeEmojiDocument2.id;
                                            emojiEntity3.document = codeEmojiDocument2;
                                            emojiEntity3.documentAbsolutePath = FileLoader.getInstance(i16).getPathToAttach(codeEmojiDocument2, true).getAbsolutePath();
                                            boolean isAnimatedStickerDocument4 = MessageObject.isAnimatedStickerDocument(emojiEntity3.document, true);
                                            if (isAnimatedStickerDocument4 || x0(emojiEntity3.document)) {
                                                emojiEntity3.subType = (byte) (emojiEntity3.subType | (isAnimatedStickerDocument4 ? (byte) 1 : (byte) 4));
                                            }
                                            mediaEntity.entities.add(emojiEntity3);
                                        }
                                        i11 = i13;
                                        view = childAt;
                                        z16 = false;
                                        z17 = false;
                                        imageReceiver = null;
                                        arrayList.add(mediaEntity);
                                        scaleX = view.getScaleX();
                                        float scaleY = view.getScaleY();
                                        float x10 = view.getX();
                                        float y10 = view.getY();
                                        mediaEntity.viewWidth = view.getWidth();
                                        mediaEntity.viewHeight = view.getHeight();
                                        mediaEntity.width = (view.getWidth() * scaleX) / a6Var.getMeasuredWidth();
                                        mediaEntity.height = (view.getHeight() * scaleY) / a6Var.getMeasuredHeight();
                                        mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10) / a6Var.getMeasuredWidth();
                                        mediaEntity.y = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y10) / a6Var.getMeasuredHeight();
                                        mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                        mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x10) / a6Var.getMeasuredWidth();
                                        mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y10) / a6Var.getMeasuredHeight();
                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / a6Var.getMeasuredWidth();
                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / a6Var.getMeasuredHeight();
                                        mediaEntity.scale = scaleX;
                                        if (jVar instanceof yf.e1) {
                                            z18 = z16;
                                            if (jVar instanceof yf.n2) {
                                                float imageAspectRatio = ((yf.n2) jVar).t0.getImageAspectRatio();
                                                float f10 = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                                float f11 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                                float measuredWidth = a6Var.getMeasuredWidth() / a6Var.getMeasuredHeight();
                                                if (imageAspectRatio > 1.0f) {
                                                    float f12 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                    mediaEntity.height = f12;
                                                    mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                    mediaEntity.y = f11 - (f12 / 2.0f);
                                                } else if (imageAspectRatio < 1.0f) {
                                                    float f13 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                    mediaEntity.width = f13;
                                                    mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                    mediaEntity.x = f10 - (f13 / 2.0f);
                                                }
                                            } else {
                                                TL_stories.MediaArea mediaArea3 = mediaEntity.mediaArea;
                                                if (mediaArea3 != null && (((z19 = jVar instanceof yf.s0)) || (jVar instanceof yf.w2) || (jVar instanceof yf.p0) || (jVar instanceof yf.a2))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                    float f14 = mediaEntity.x;
                                                    float f15 = mediaEntity.width;
                                                    mediaAreaCoordinates2.x = ((f15 / 2.0f) + f14) * 100.0f;
                                                    mediaAreaCoordinates2.y = ((mediaEntity.height / 2.0f) + mediaEntity.y) * 100.0f;
                                                    if (z19) {
                                                        yf.r0 r0Var3 = ((yf.s0) jVar).m0;
                                                        mediaAreaCoordinates2.w = ll.v(r0Var3.E * 2 * scaleX, a6Var.getMeasuredWidth(), f15, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = ll.v(r0Var3.F * 2 * scaleY, a6Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof yf.w2) {
                                                        yf.r0 r0Var4 = ((yf.w2) jVar).m0;
                                                        mediaAreaCoordinates2.w = ll.v(r0Var4.E * 2 * scaleX, a6Var.getMeasuredWidth(), f15, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = ll.v(r0Var4.F * 2 * scaleY, a6Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof yf.p0) {
                                                        yf.n0 n0Var = ((yf.p0) jVar).m0;
                                                        mediaAreaCoordinates2.w = ll.v(n0Var.f * 2 * scaleX, a6Var.getMeasuredWidth(), f15, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = ll.v(n0Var.h * 2 * scaleY, a6Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof yf.a2) {
                                                        yf.a2 a2Var = (yf.a2) jVar;
                                                        float padding = ((a2Var.getPadding() * 2) * scaleX) / a6Var.getMeasuredWidth();
                                                        float padding2 = ((a2Var.getPadding() * 2) * scaleX) / a6Var.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = mediaEntity.mediaArea.coordinates;
                                                        mediaAreaCoordinates3.w = (mediaEntity.width - padding) * 100.0f;
                                                        mediaAreaCoordinates3.h = (mediaEntity.height - padding2) * 100.0f;
                                                    }
                                                    mediaEntity.mediaArea.coordinates.rotation = ((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d;
                                                    if (z19) {
                                                        radius = ((yf.s0) jVar).m0.getRadius();
                                                    } else if (jVar instanceof yf.w2) {
                                                        radius = ((yf.w2) jVar).m0.getRadius();
                                                    } else if (jVar instanceof yf.p0) {
                                                        radius = ((yf.p0) jVar).m0.getRadius();
                                                    }
                                                    d = radius;
                                                }
                                            }
                                            d = -1.0d;
                                        } else {
                                            yf.e1 e1Var2 = (yf.e1) jVar;
                                            yf.x0 x0Var = e1Var2.n0;
                                            bh.g gVar2 = e1Var2.m0;
                                            RectF rectF = AndroidUtilities.rectTmp;
                                            z18 = z16;
                                            double r10 = e1Var2.r(rectF);
                                            rectF.offset(gVar2.getX(), gVar2.getY());
                                            rectF.offset(x0Var.getX(), x0Var.getY());
                                            mediaEntity.mediaArea.coordinates.x = (((rectF.centerX() * scaleX) + ll.c(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x10)) / a6Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.y = (((rectF.centerY() * scaleY) + ll.c(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y10)) / a6Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.w = ((rectF.width() * scaleX) / a6Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.h = ((rectF.height() * scaleY) / a6Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.rotation = ((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d;
                                            d = r10;
                                        }
                                        mediaArea = mediaEntity.mediaArea;
                                        if (mediaArea != null && (mediaAreaCoordinates = mediaArea.coordinates) != null && d > 0.0d) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                        }
                                        z14 = z17;
                                        z15 = z18;
                                    } else {
                                        if (jVar instanceof yf.p0) {
                                            yf.p0 p0Var = (yf.p0) jVar;
                                            yf.n0 n0Var2 = p0Var.m0;
                                            mediaEntity.type = (byte) 7;
                                            if (n0Var2.e()) {
                                                mediaEntity.subType = (byte) n0Var2.getPreviewType();
                                            } else {
                                                mediaEntity.subType = (byte) p0Var.getType();
                                            }
                                            mediaEntity.width = n0Var2.getWidth();
                                            mediaEntity.height = n0Var2.getHeight();
                                            mediaEntity.color = p0Var.p0 ? p0Var.getColor() : 0;
                                            mediaEntity.density = n0Var2.e;
                                            mediaEntity.linkSettings = p0Var.q0;
                                            boolean z22 = n0Var2.N;
                                            if (z22) {
                                                ImageReceiver imageReceiver5 = n0Var2.P;
                                                if (z22 && imageReceiver5.hasImageLoaded() && imageReceiver5.getBitmap() != null) {
                                                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(imageReceiver5.getBitmap()), imageReceiver5.getImageKey(), false);
                                                }
                                                yf.m0 m0Var = mediaEntity.linkSettings;
                                                m0Var.a |= 4;
                                                m0Var.i = n0Var2.getPhotoSide();
                                            }
                                            TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                            mediaEntity.mediaArea = tL_mediaAreaUrl;
                                            yf.m0 m0Var2 = p0Var.q0;
                                            if (m0Var2 != null) {
                                                TLRPC.WebPage webPage = m0Var2.d;
                                                tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? p0Var.q0.c : p0Var.q0.d.url;
                                                mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                        } else {
                                            if (jVar instanceof yf.a2) {
                                                yf.a2 a2Var2 = (yf.a2) jVar;
                                                mediaEntity.type = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction;
                                                hg.r0 currentReaction = a2Var2.getCurrentReaction();
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
                                                TL_stories.MediaArea mediaArea4 = mediaEntity.mediaArea;
                                                mediaArea4.dark = a2Var2.n0.a == 1;
                                                mediaArea4.flipped = a2Var2.u0;
                                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            } else if (jVar instanceof yf.b2) {
                                                yf.b2 b2Var = (yf.b2) jVar;
                                                qu0 baseSize3 = b2Var.getBaseSize();
                                                mediaEntity.width = baseSize3.a;
                                                mediaEntity.height = baseSize3.b;
                                                mediaEntity.type = (byte) 5;
                                                if (a8Var != null) {
                                                    mediaEntity.text = a8Var.o0.getAbsolutePath();
                                                    mediaEntity.roundOffset = a8Var.r0;
                                                    long j10 = a8Var.q0;
                                                    mediaEntity.roundDuration = j10;
                                                    float f16 = j10;
                                                    mediaEntity.roundLeft = (long) (a8Var.s0 * f16);
                                                    mediaEntity.roundRight = (long) (a8Var.t0 * f16);
                                                }
                                                mediaEntity.subType = (byte) 4;
                                                if (b2Var.n0) {
                                                    mediaEntity.subType = (byte) (4 | 2);
                                                }
                                            } else if (jVar instanceof yf.e1) {
                                                yf.e1 e1Var3 = (yf.e1) jVar;
                                                bh.g gVar3 = e1Var3.m0;
                                                ArrayList arrayList3 = e1Var3.o0;
                                                yf.x0 x0Var2 = e1Var3.n0;
                                                mediaEntity.type = (byte) 6;
                                                int width = e1Var3.getWidth();
                                                mediaEntity.viewWidth = width;
                                                mediaEntity.width = width;
                                                int height = e1Var3.getHeight();
                                                mediaEntity.viewHeight = height;
                                                mediaEntity.height = height;
                                                MessageObject messageObject = arrayList3.size() > 0 ? (MessageObject) arrayList3.get(0) : null;
                                                if (messageObject != null && (message = messageObject.messageOwner) != null) {
                                                    TLRPC.MessageAction messageAction = message.action;
                                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                        TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                        mediaEntity.mediaArea = tL_mediaAreaStarGift;
                                                        tL_mediaAreaStarGift.slug = starGift.slug;
                                                        tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        int i24 = 0;
                                                        while (true) {
                                                            if (i24 >= x0Var2.getChildCount()) {
                                                                w0Var = null;
                                                                break;
                                                            }
                                                            View childAt2 = x0Var2.getChildAt(i24);
                                                            if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                                                w0Var = (org.telegram.ui.Cells.w0) childAt2;
                                                                break;
                                                            }
                                                            i24++;
                                                        }
                                                        if (w0Var == null || (m5Var = w0Var.B0) == null || (imageReceiver3 = m5Var.d) == null) {
                                                            e1Var = e1Var3;
                                                            i11 = i13;
                                                            gVar = gVar3;
                                                            view = childAt;
                                                            imageReceiver = null;
                                                            if (z12) {
                                                                if (a8Var != null) {
                                                                    Matrix matrix = a8Var.n0;
                                                                    if (a8Var.K) {
                                                                        matrix.reset();
                                                                        if (x0Var2.getChildCount() == 1) {
                                                                            view3 = x0Var2.getChildAt(0);
                                                                            if (view3 instanceof org.telegram.ui.Cells.t1) {
                                                                                imageReceiver2 = ((org.telegram.ui.Cells.t1) view3).getPhotoImage();
                                                                                if (imageReceiver2 != null) {
                                                                                    float max = Math.max(imageReceiver2.getImageWidth() / Math.max(1, a8Var.k0), imageReceiver2.getImageHeight() / Math.max(1, a8Var.l0));
                                                                                    matrix.postScale(max, max);
                                                                                    matrix.postTranslate(imageReceiver2.getCenterX() - ((a8Var.k0 * max) / 2.0f), imageReceiver2.getCenterY() - ((a8Var.l0 * max) / 2.0f));
                                                                                    matrix.postTranslate(gVar.getX(), gVar.getY());
                                                                                    matrix.postTranslate(x0Var2.getX(), x0Var2.getY());
                                                                                    matrix.postTranslate(view3.getX(), view3.getY());
                                                                                    matrix.postScale(e1Var.getScaleX(), e1Var.getScaleY(), e1Var.getPivotX(), e1Var.getPivotY());
                                                                                    matrix.postRotate(e1Var.getRotation(), e1Var.getPivotX(), e1Var.getPivotY());
                                                                                    matrix.postTranslate(e1Var.getX(), e1Var.getY());
                                                                                    matrix.postScale(1.0f / a6Var.getWidth(), 1.0f / a6Var.getHeight());
                                                                                    matrix.postScale(a8Var.i0, a8Var.j0);
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
                                                            arrayList.add(mediaEntity);
                                                            scaleX = view.getScaleX();
                                                            float scaleY2 = view.getScaleY();
                                                            float x102 = view.getX();
                                                            float y102 = view.getY();
                                                            mediaEntity.viewWidth = view.getWidth();
                                                            mediaEntity.viewHeight = view.getHeight();
                                                            mediaEntity.width = (view.getWidth() * scaleX) / a6Var.getMeasuredWidth();
                                                            mediaEntity.height = (view.getHeight() * scaleY2) / a6Var.getMeasuredHeight();
                                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102) / a6Var.getMeasuredWidth();
                                                            mediaEntity.y = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y102) / a6Var.getMeasuredHeight();
                                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x102) / a6Var.getMeasuredWidth();
                                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y102) / a6Var.getMeasuredHeight();
                                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / a6Var.getMeasuredWidth();
                                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / a6Var.getMeasuredHeight();
                                                            mediaEntity.scale = scaleX;
                                                            if (jVar instanceof yf.e1) {
                                                            }
                                                            mediaArea = mediaEntity.mediaArea;
                                                            if (mediaArea != null) {
                                                                mediaAreaCoordinates.flags |= 1;
                                                                mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        } else {
                                                            imageReceiver3.setVisible(false, false);
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) gh.v7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                            if (stargiftattributemodel != null) {
                                                                float dp = AndroidUtilities.dp(110.0f);
                                                                e1Var = e1Var3;
                                                                float centerX = imageReceiver3.getCenterX() + w0Var.getX() + x0Var2.getX() + w0Var.z0;
                                                                float centerY = imageReceiver3.getCenterY() + w0Var.getY() + x0Var2.getY() + w0Var.A0;
                                                                VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                                                                imageReceiver4 = imageReceiver3;
                                                                mediaEntity2.type = (byte) 0;
                                                                mediaEntity2.width = dp;
                                                                mediaEntity2.height = dp;
                                                                TLRPC.Document document2 = stargiftattributemodel.document;
                                                                mediaEntity2.document = document2;
                                                                mediaEntity2.parentObject = starGift;
                                                                mediaEntity2.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true).getAbsolutePath();
                                                                if (MessageObject.isAnimatedStickerDocument(document2, true) || x0(document2)) {
                                                                    boolean isAnimatedStickerDocument5 = MessageObject.isAnimatedStickerDocument(document2, true);
                                                                    mediaEntity2.subType = (byte) (mediaEntity2.subType | (isAnimatedStickerDocument5 ? (byte) 1 : (byte) 4));
                                                                    mi0 lottieAnimation = imageReceiver4.getLottieAnimation();
                                                                    if (lottieAnimation != null && (isAnimatedStickerDocument5 || x0(document2))) {
                                                                        r20 = lottieAnimation.p();
                                                                    }
                                                                    if (r20 != 0) {
                                                                        BigInteger valueOf3 = BigInteger.valueOf(r20);
                                                                        g6Var.c1 = g6Var.c1.multiply(valueOf3).divide(g6Var.c1.gcd(valueOf3));
                                                                    }
                                                                }
                                                                float scaleX2 = childAt.getScaleX();
                                                                float scaleY3 = childAt.getScaleY();
                                                                float x11 = childAt.getX();
                                                                float y11 = childAt.getY();
                                                                int i25 = (int) dp;
                                                                mediaEntity2.viewWidth = i25;
                                                                mediaEntity2.viewHeight = i25;
                                                                mediaEntity2.width = (dp * scaleX2) / a6Var.getMeasuredWidth();
                                                                mediaEntity2.height = (dp * scaleY3) / a6Var.getMeasuredHeight();
                                                                mediaEntity2.x = (childAt.getWidth() / 2.0f) + x11;
                                                                mediaEntity2.y = (childAt.getHeight() / 2.0f) + y11;
                                                                i11 = i13;
                                                                float c10 = ll.c(childAt.getWidth(), 2.0f, scaleX2, centerX * scaleX2);
                                                                float c11 = ll.c(childAt.getHeight(), 2.0f, scaleY3, centerY * scaleY3);
                                                                gVar = gVar3;
                                                                view = childAt;
                                                                double d9 = mediaEntity2.x;
                                                                double d10 = c10;
                                                                double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                double cos = Math.cos(rotation) * d10;
                                                                double d11 = c11;
                                                                mediaEntity2.x = (float) ((cos - (Math.sin(rotation) * d11)) + d9);
                                                                float cos2 = (float) ((Math.cos(rotation) * d11) + (Math.sin(rotation) * d10) + mediaEntity2.y);
                                                                float f17 = (-dp) / 2.0f;
                                                                float f18 = (f17 * scaleX2) + mediaEntity2.x;
                                                                mediaEntity2.x = f18;
                                                                mediaEntity2.y = (f17 * scaleY3) + cos2;
                                                                mediaEntity2.x = f18 / a6Var.getMeasuredWidth();
                                                                mediaEntity2.y /= a6Var.getMeasuredHeight();
                                                                mediaEntity2.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                mediaEntity2.scale = scaleX2;
                                                                arrayList.add(mediaEntity2);
                                                            } else {
                                                                e1Var = e1Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                i11 = i13;
                                                                gVar = gVar3;
                                                                view = childAt;
                                                            }
                                                            imageReceiver = imageReceiver4;
                                                            if (z12) {
                                                            }
                                                            z17 = true;
                                                            arrayList.add(mediaEntity);
                                                            scaleX = view.getScaleX();
                                                            float scaleY22 = view.getScaleY();
                                                            float x1022 = view.getX();
                                                            float y1022 = view.getY();
                                                            mediaEntity.viewWidth = view.getWidth();
                                                            mediaEntity.viewHeight = view.getHeight();
                                                            mediaEntity.width = (view.getWidth() * scaleX) / a6Var.getMeasuredWidth();
                                                            mediaEntity.height = (view.getHeight() * scaleY22) / a6Var.getMeasuredHeight();
                                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022) / a6Var.getMeasuredWidth();
                                                            mediaEntity.y = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y1022) / a6Var.getMeasuredHeight();
                                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x1022) / a6Var.getMeasuredWidth();
                                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y1022) / a6Var.getMeasuredHeight();
                                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / a6Var.getMeasuredWidth();
                                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / a6Var.getMeasuredHeight();
                                                            mediaEntity.scale = scaleX;
                                                            if (jVar instanceof yf.e1) {
                                                            }
                                                            mediaArea = mediaEntity.mediaArea;
                                                            if (mediaArea != null) {
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        }
                                                    }
                                                }
                                                e1Var = e1Var3;
                                                i11 = i13;
                                                gVar = gVar3;
                                                view = childAt;
                                                if (messageObject != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost;
                                                    tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(i16).getInputChannel(-a8.p(messageObject));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                    Boolean D = a8.D(messageObject);
                                                    tL_inputMediaAreaChannelPost2.msg_id = D == null ? 0 : D.booleanValue() ? messageObject.messageOwner.fwd_from.channel_post : messageObject.getId();
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost3;
                                                    tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                                if (z12) {
                                                }
                                                z17 = true;
                                                arrayList.add(mediaEntity);
                                                scaleX = view.getScaleX();
                                                float scaleY222 = view.getScaleY();
                                                float x10222 = view.getX();
                                                float y10222 = view.getY();
                                                mediaEntity.viewWidth = view.getWidth();
                                                mediaEntity.viewHeight = view.getHeight();
                                                mediaEntity.width = (view.getWidth() * scaleX) / a6Var.getMeasuredWidth();
                                                mediaEntity.height = (view.getHeight() * scaleY222) / a6Var.getMeasuredHeight();
                                                mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10222) / a6Var.getMeasuredWidth();
                                                mediaEntity.y = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y10222) / a6Var.getMeasuredHeight();
                                                mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x10222) / a6Var.getMeasuredWidth();
                                                mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y10222) / a6Var.getMeasuredHeight();
                                                mediaEntity.textViewWidth = mediaEntity.viewWidth / a6Var.getMeasuredWidth();
                                                mediaEntity.textViewHeight = mediaEntity.viewHeight / a6Var.getMeasuredHeight();
                                                mediaEntity.scale = scaleX;
                                                if (jVar instanceof yf.e1) {
                                                }
                                                mediaArea = mediaEntity.mediaArea;
                                                if (mediaArea != null) {
                                                }
                                                z14 = z17;
                                                z15 = z18;
                                            }
                                            i11 = i13;
                                            view = childAt;
                                            z16 = true;
                                            z17 = true;
                                            imageReceiver = null;
                                            arrayList.add(mediaEntity);
                                            scaleX = view.getScaleX();
                                            float scaleY2222 = view.getScaleY();
                                            float x102222 = view.getX();
                                            float y102222 = view.getY();
                                            mediaEntity.viewWidth = view.getWidth();
                                            mediaEntity.viewHeight = view.getHeight();
                                            mediaEntity.width = (view.getWidth() * scaleX) / a6Var.getMeasuredWidth();
                                            mediaEntity.height = (view.getHeight() * scaleY2222) / a6Var.getMeasuredHeight();
                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102222) / a6Var.getMeasuredWidth();
                                            mediaEntity.y = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y102222) / a6Var.getMeasuredHeight();
                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x102222) / a6Var.getMeasuredWidth();
                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y102222) / a6Var.getMeasuredHeight();
                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / a6Var.getMeasuredWidth();
                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / a6Var.getMeasuredHeight();
                                            mediaEntity.scale = scaleX;
                                            if (jVar instanceof yf.e1) {
                                            }
                                            mediaArea = mediaEntity.mediaArea;
                                            if (mediaArea != null) {
                                            }
                                            z14 = z17;
                                            z15 = z18;
                                        }
                                        i11 = i13;
                                    }
                                }
                                i11 = i13;
                                view = childAt;
                                z16 = false;
                                z17 = true;
                                imageReceiver = null;
                                arrayList.add(mediaEntity);
                                scaleX = view.getScaleX();
                                float scaleY22222 = view.getScaleY();
                                float x1022222 = view.getX();
                                float y1022222 = view.getY();
                                mediaEntity.viewWidth = view.getWidth();
                                mediaEntity.viewHeight = view.getHeight();
                                mediaEntity.width = (view.getWidth() * scaleX) / a6Var.getMeasuredWidth();
                                mediaEntity.height = (view.getHeight() * scaleY22222) / a6Var.getMeasuredHeight();
                                mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022222) / a6Var.getMeasuredWidth();
                                mediaEntity.y = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y1022222) / a6Var.getMeasuredHeight();
                                mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x1022222) / a6Var.getMeasuredWidth();
                                mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y1022222) / a6Var.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / a6Var.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / a6Var.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (jVar instanceof yf.e1) {
                                }
                                mediaArea = mediaEntity.mediaArea;
                                if (mediaArea != null) {
                                }
                                z14 = z17;
                                z15 = z18;
                            } else {
                                a6Var = a6Var2;
                                i11 = childCount;
                                i12 = i15;
                                view = childAt;
                                z14 = true;
                                z15 = false;
                                imageReceiver = null;
                            }
                            if (z14 && ((z11 || (z12 && mediaEntity.type == 6)) && bitmap != null)) {
                                Canvas canvas2 = new Canvas(bitmap);
                                float width2 = bitmap.getWidth() / a6Var.getMeasuredWidth();
                                int i26 = 0;
                                while (i26 < 2) {
                                    Canvas canvas3 = i26 == 0 ? canvas2 : null;
                                    if (canvas3 == null || (i26 == 0 && z15)) {
                                        canvas = canvas2;
                                        view2 = view;
                                    } else {
                                        canvas3.save();
                                        canvas3.scale(width2, width2);
                                        canvas3.translate(mediaEntity.x * a6Var.getMeasuredWidth(), mediaEntity.y * a6Var.getMeasuredHeight());
                                        canvas3.scale(view.getScaleX(), view.getScaleY());
                                        canvas3.rotate(view.getRotation(), ((mediaEntity.width / 2.0f) / view.getScaleX()) * a6Var.getMeasuredWidth(), ((mediaEntity.height / 2.0f) / view.getScaleY()) * a6Var.getMeasuredHeight());
                                        view2 = view;
                                        if (!(view2 instanceof yf.v2) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                            canvas = canvas2;
                                            if (view2 instanceof yf.e1) {
                                                yf.e1 e1Var4 = (yf.e1) view2;
                                                yf.x0 x0Var3 = e1Var4.n0;
                                                boolean z23 = true;
                                                e1Var4.q0 = true;
                                                int i27 = 0;
                                                while (i27 < x0Var3.getChildCount()) {
                                                    View childAt3 = x0Var3.getChildAt(i27);
                                                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                                                        ((org.telegram.ui.Cells.t1) childAt3).ke = z23;
                                                    }
                                                    i27++;
                                                    z23 = true;
                                                }
                                                view2.draw(canvas3);
                                                boolean z24 = false;
                                                e1Var4.q0 = false;
                                                int i28 = 0;
                                                while (i28 < x0Var3.getChildCount()) {
                                                    View childAt4 = x0Var3.getChildAt(i28);
                                                    if (childAt4 instanceof org.telegram.ui.Cells.t1) {
                                                        ((org.telegram.ui.Cells.t1) childAt4).ke = z24;
                                                    }
                                                    i28++;
                                                    z24 = false;
                                                }
                                            } else {
                                                view2.draw(canvas3);
                                            }
                                        } else {
                                            int scaleX3 = (int) (view2.getScaleX() * view2.getWidth());
                                            int scaleY4 = (int) (view2.getScaleY() * view2.getHeight());
                                            Bitmap createBitmap2 = Bitmaps.createBitmap(scaleX3, scaleY4, Bitmap.Config.ARGB_8888);
                                            Canvas canvas4 = new Canvas(createBitmap2);
                                            canvas = canvas2;
                                            canvas4.scale(view2.getScaleX(), view2.getScaleY());
                                            view2.draw(canvas4);
                                            canvas3.scale(1.0f / view2.getScaleX(), 1.0f / view2.getScaleY());
                                            canvas3.drawBitmap(createBitmap2, (Rect) null, new Rect(0, 0, scaleX3, scaleY4), new Paint(3));
                                            try {
                                                canvas4.setBitmap(null);
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                            }
                                            createBitmap2.recycle();
                                        }
                                        canvas3.restore();
                                    }
                                    i26++;
                                    view = view2;
                                    canvas2 = canvas;
                                }
                                if (imageReceiver != null) {
                                    imageReceiver.setVisible(true, false);
                                    i15 = i12 + 1;
                                    g6Var = this;
                                    childCount = i11;
                                    a6Var2 = a6Var;
                                    i14 = 0;
                                    b10 = 1;
                                }
                            }
                        } else {
                            a6Var = a6Var2;
                            i11 = childCount;
                            i12 = i15;
                        }
                        i15 = i12 + 1;
                        g6Var = this;
                        childCount = i11;
                        a6Var2 = a6Var;
                        i14 = 0;
                        b10 = 1;
                    }
                }
                return bitmap;
            }
            Bitmap c12 = w5Var.c(false, false);
            createBitmap = c12 != null ? Bitmap.createBitmap(c12.getWidth(), c12.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        g6Var.c1 = BigInteger.ONE;
        i10 = 0;
        while (i9 < a6Var2.getChildCount()) {
        }
        if (i10 > 0) {
        }
        return bitmap;
    }

    @Override // yf.m1
    public final void u() {
        if (!this.n2 && !this.m2) {
            this.h2 = true;
            o0(true);
            return;
        }
        if (this.m2) {
            yf.j jVar = this.F0;
            if (jVar instanceof yf.v2) {
                this.K1.e = true;
                AndroidUtilities.showKeyboard(((yf.v2) jVar).getEditText());
            }
        }
        J0(!this.m2 ? 1 : 0);
    }

    public final boolean u0() {
        return this.z0.a() || this.h2;
    }

    @Override // yf.h
    public final void v(float f10, float f11, float[] fArr) {
        View view;
        View view2 = (View) this.K0.getParent();
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

    public final void v0(boolean z10) {
        int i9 = 0;
        if (this.m2) {
            J0(0);
        }
        if (z10) {
            wy wyVar = this.l2;
            if (wyVar == null || wyVar.getVisibility() != 0) {
                w0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.l2.getMeasuredHeight());
            ofFloat.addUpdateListener(new s4(this, i9));
            this.o2 = true;
            ofFloat.addListener(new m5(this, 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
            ofFloat.start();
        }
    }

    @Override // yf.h
    public final void w(yf.j jVar) {
        O0(false);
        M0(jVar);
    }

    public final void w0() {
        wy wyVar;
        if (!this.m2 && (wyVar = this.l2) != null && wyVar.getVisibility() != 8) {
            this.l2.setVisibility(8);
        }
        int i9 = this.p2;
        this.p2 = 0;
        if (i9 != 0) {
            this.K1.a();
        }
    }

    @Override // yf.q1
    public final xf.s0 x() {
        return xf.s0.e(this.B1);
    }

    public final boolean y0() {
        if (this.Y1) {
            if (this.V1.getReactionsWindow() == null || this.V1.getReactionsWindow().q) {
                O0(false);
                return true;
            }
            this.V1.e();
            return true;
        }
        if (this.x1) {
            I0(false);
            return true;
        }
        if (this.m2) {
            v0(true);
            return true;
        }
        if (!this.G0) {
            return false;
        }
        if (!this.I0) {
            D0(null, true);
            return true;
        }
        this.I0 = false;
        this.K1.b(true);
        return false;
    }

    public abstract void z0(boolean z10);

    public View getView() {
        return this;
    }

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f10) {
    }
}

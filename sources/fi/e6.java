package fi;

import a8.me;
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
import java.util.HashSet;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.yg;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class e6 extends ww0 implements sg.s1, sg.h, sg.o1, uw0, ob {
    public int A0;
    public Runnable A1;
    public boolean B0;
    public final rb B1;
    public final boolean C0;
    public AnimatorSet C1;
    public final u5 D0;
    public final h5 D1;
    public final w5 E0;
    public w7 E1;
    public final z5 F0;
    public ArrayList F1;
    public final y5 G0;
    public int G1;
    public final FrameLayout H0;
    public int H1;
    public final a6 I0;
    public rg.y I1;
    public final e5 J0;
    public final boolean J1;
    public final FrameLayout K0;
    public final File K1;
    public l5 L0;
    public final boolean L1;
    public final View M0;
    public final boolean M1;
    public int N0;
    public boolean N1;
    public int O0;
    public fl0 O1;
    public float P0;
    public sg.c2 P1;
    public ValueAnimator Q0;
    public float Q1;
    public boolean R0;
    public boolean R1;
    public final sg.y1 S0;
    public boolean S1;
    public final a4.l T0;
    public org.telegram.ui.Components.la T1;
    public final int U0;
    public final n6 U1;
    public BigInteger V0;
    public final o6 V1;
    public TextView W0;
    public boolean W1;
    public TextView X0;
    public ObjectAnimator X1;
    public TextView Y0;
    public final float[] Y1;
    public final sg.t1 Z0;
    public n5 Z1;
    public final sg.q1 a1;
    public boolean a2;
    public final sg.v1 b1;
    public boolean b2;
    public final ImageView c1;
    public boolean c2;
    public final TextView d1;
    public final int[] d2;
    public final TextView e1;
    public sz e2;
    public final TextView f1;
    public boolean f2;
    public final Paint g1;
    public boolean g2;
    public final Paint h1;
    public boolean h2;
    public float i1;
    public int i2;
    public boolean j1;
    public boolean j2;
    public o1.j k1;
    public int k2;
    public final f5 l1;
    public int l2;
    public final Paint m1;
    public int m2;
    public final Paint n1;
    public boolean n2;
    public final Paint o1;
    public final sg.h1 p0;
    public final rg.q1 p1;
    public final sg.l1 q0;
    public boolean q1;
    public final Bitmap r0;
    public o1.j r1;
    public final rg.t1 s0;
    public float s1;
    public final DispatchQueue t0;
    public final Paint t1;
    public final MediaController.CropState u0;
    public final int u1;
    public boolean v0;
    public final s5 v1;
    public qw0 w0;
    public org.telegram.ui.ActionBar.o1 w1;
    public boolean x0;
    public c6 x1;
    public sg.j y0;
    public Rect y1;
    public boolean z0;
    public Runnable z1;

    public e6(Context context, boolean z10, File file, boolean z11, boolean z12, rb rbVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, w7 w7Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.la laVar, org.telegram.ui.ActionBar.u6 u6Var, n6 n6Var, o6 o6Var) {
        super(context, activity);
        rg.q1 q1Var;
        org.telegram.ui.Components.la laVar2;
        int i14;
        this.N0 = 0;
        this.O0 = -1;
        final ta taVar = (ta) this;
        a4.l lVar = new a4.l(taVar, 19);
        this.T0 = lVar;
        Paint paint = new Paint(1);
        this.g1 = paint;
        Paint paint2 = new Paint(1);
        this.h1 = paint2;
        this.m1 = new Paint(1);
        this.n1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.o1 = paint3;
        rg.q1 q1Var2 = new rg.q1(1.0f, 0.016773745f, -1);
        this.p1 = q1Var2;
        this.t1 = new Paint(1);
        this.Y1 = new float[2];
        this.b2 = false;
        this.d2 = new int[2];
        new a5.d(taVar, 22);
        setDelegate(this);
        this.T1 = laVar;
        this.U1 = n6Var;
        this.J1 = z10;
        this.K1 = file;
        this.L1 = z11;
        this.M1 = z12;
        this.B1 = rbVar;
        this.G1 = i12;
        this.H1 = i13;
        this.V1 = o6Var;
        this.u1 = i10;
        s5 s5Var = new s5(u6Var);
        this.v1 = s5Var;
        this.u0 = cropState;
        this.C0 = context instanceof BubbleActivity;
        rg.s0 e = rg.s0.e(i10);
        e.i(0, true);
        q1Var2.a = e.c();
        q1Var2.c = e.i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.t0 = dispatchQueue;
        this.r0 = bitmap;
        this.U0 = i11;
        rg.t1 t1Var = new rg.t1();
        this.s0 = t1Var;
        t1Var.a = new e1.c(taVar, 9);
        View view = new View(context);
        this.M0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        rg.q0 q0Var = new rg.q0(getPaintingSize(), null, i11, laVar);
        if (w7Var == null || !w7Var.u) {
            q1Var = q1Var2;
            laVar2 = laVar;
        } else {
            q1Var = q1Var2;
            laVar2 = null;
        }
        u5 u5Var = new u5(taVar, context, q0Var, bitmap, bitmap2, laVar2);
        this.D0 = u5Var;
        u5Var.setDelegate(new v5(taVar));
        u5Var.setUndoStore(t1Var);
        u5Var.setQueue(dispatchQueue);
        u5Var.setVisibility(4);
        w5 w5Var = new w5(taVar, context);
        this.E0 = w5Var;
        w5Var.setVisibility(4);
        y5 y5Var = new y5(taVar, context, new x5(taVar));
        this.G0 = y5Var;
        this.E1 = w7Var;
        this.F1 = arrayList;
        if (this.G1 > 0 && this.H1 > 0) {
            E0();
        }
        y5Var.setVisibility(4);
        this.F0 = new z5(taVar, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.H0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{TLObject.FLAG_30, 0}));
        addView(frameLayout, gb1.i(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.c1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.y6.g0(1090519039, 1, -1));
        final int i15 = 0;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: fi.s4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        ta taVar2 = taVar;
                        u5 u5Var2 = taVar2.D0;
                        if (u5Var2 != null && (u5Var2.getCurrentBrush() instanceof rg.l)) {
                            u5Var2.b();
                            taVar2.Z0.setSelectedIndex(1);
                            taVar2.i((rg.m) rg.m.a.get(0));
                            break;
                        } else {
                            taVar2.s0.c();
                            break;
                        }
                        break;
                    case 1:
                        ta taVar3 = taVar;
                        u5 u5Var3 = taVar3.D0;
                        rg.t1 t1Var2 = taVar3.s0;
                        if (t1Var2.a()) {
                            if (u5Var3 != null && (u5Var3.getCurrentBrush() instanceof rg.l)) {
                                u5Var3.b();
                                taVar3.Z0.setSelectedIndex(1);
                                taVar3.i((rg.m) rg.m.a.get(0));
                            }
                            if (u5Var3 != null) {
                                u5Var3.a();
                            }
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            taVar3.G0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ta taVar4 = taVar;
                        sg.j jVar = taVar4.y0;
                        if (jVar instanceof sg.x2) {
                            AndroidUtilities.hideKeyboard(((sg.x2) jVar).getFocusedView());
                        }
                        if (taVar4.f2) {
                            taVar4.s0(false);
                        }
                        taVar4.z0(taVar4.y0);
                        taVar4.A0(null, true);
                        break;
                    case 3:
                        taVar.A0(null, true);
                        break;
                    default:
                        ta taVar5 = taVar;
                        if (!taVar5.q1) {
                            if (!taVar5.f2) {
                                if (!taVar5.z0) {
                                    Runnable runnable = taVar5.A1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    taVar5.A0(null, true);
                                    break;
                                }
                            } else {
                                taVar5.s0(true);
                                break;
                            }
                        } else {
                            taVar5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, gb1.h(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.y6.g0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        vh.j(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, gb1.x(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, gb1.u(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bh.f(4));
        frameLayout.addView(linearLayout, gb1.i(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.d1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.y6.g0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        final int i16 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: fi.s4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        ta taVar2 = taVar;
                        u5 u5Var2 = taVar2.D0;
                        if (u5Var2 != null && (u5Var2.getCurrentBrush() instanceof rg.l)) {
                            u5Var2.b();
                            taVar2.Z0.setSelectedIndex(1);
                            taVar2.i((rg.m) rg.m.a.get(0));
                            break;
                        } else {
                            taVar2.s0.c();
                            break;
                        }
                        break;
                    case 1:
                        ta taVar3 = taVar;
                        u5 u5Var3 = taVar3.D0;
                        rg.t1 t1Var2 = taVar3.s0;
                        if (t1Var2.a()) {
                            if (u5Var3 != null && (u5Var3.getCurrentBrush() instanceof rg.l)) {
                                u5Var3.b();
                                taVar3.Z0.setSelectedIndex(1);
                                taVar3.i((rg.m) rg.m.a.get(0));
                            }
                            if (u5Var3 != null) {
                                u5Var3.a();
                            }
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            taVar3.G0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ta taVar4 = taVar;
                        sg.j jVar = taVar4.y0;
                        if (jVar instanceof sg.x2) {
                            AndroidUtilities.hideKeyboard(((sg.x2) jVar).getFocusedView());
                        }
                        if (taVar4.f2) {
                            taVar4.s0(false);
                        }
                        taVar4.z0(taVar4.y0);
                        taVar4.A0(null, true);
                        break;
                    case 3:
                        taVar.A0(null, true);
                        break;
                    default:
                        ta taVar5 = taVar;
                        if (!taVar5.q1) {
                            if (!taVar5.f2) {
                                if (!taVar5.z0) {
                                    Runnable runnable = taVar5.A1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    taVar5.A0(null, true);
                                    break;
                                }
                            } else {
                                taVar5.s0(true);
                                break;
                            }
                        } else {
                            taVar5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView2, gb1.h(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.e1 = k10;
        k10.setBackground(org.telegram.ui.ActionBar.y6.g0(822083583, 7, -1));
        k10.setPadding(org.telegram.ui.d3.h(8.0f, R.string.Clear, k10), 0, AndroidUtilities.dp(8.0f), 0);
        k10.setGravity(16);
        k10.setTextColor(-1);
        k10.setTypeface(AndroidUtilities.bold());
        k10.setTextSize(1, 16.0f);
        final int i17 = 2;
        k10.setOnClickListener(new View.OnClickListener() { // from class: fi.s4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        ta taVar2 = taVar;
                        u5 u5Var2 = taVar2.D0;
                        if (u5Var2 != null && (u5Var2.getCurrentBrush() instanceof rg.l)) {
                            u5Var2.b();
                            taVar2.Z0.setSelectedIndex(1);
                            taVar2.i((rg.m) rg.m.a.get(0));
                            break;
                        } else {
                            taVar2.s0.c();
                            break;
                        }
                        break;
                    case 1:
                        ta taVar3 = taVar;
                        u5 u5Var3 = taVar3.D0;
                        rg.t1 t1Var2 = taVar3.s0;
                        if (t1Var2.a()) {
                            if (u5Var3 != null && (u5Var3.getCurrentBrush() instanceof rg.l)) {
                                u5Var3.b();
                                taVar3.Z0.setSelectedIndex(1);
                                taVar3.i((rg.m) rg.m.a.get(0));
                            }
                            if (u5Var3 != null) {
                                u5Var3.a();
                            }
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            taVar3.G0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ta taVar4 = taVar;
                        sg.j jVar = taVar4.y0;
                        if (jVar instanceof sg.x2) {
                            AndroidUtilities.hideKeyboard(((sg.x2) jVar).getFocusedView());
                        }
                        if (taVar4.f2) {
                            taVar4.s0(false);
                        }
                        taVar4.z0(taVar4.y0);
                        taVar4.A0(null, true);
                        break;
                    case 3:
                        taVar.A0(null, true);
                        break;
                    default:
                        ta taVar5 = taVar;
                        if (!taVar5.q1) {
                            if (!taVar5.f2) {
                                if (!taVar5.z0) {
                                    Runnable runnable = taVar5.A1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    taVar5.A0(null, true);
                                    break;
                                }
                            } else {
                                taVar5.s0(true);
                                break;
                            }
                        } else {
                            taVar5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        k10.setAlpha(0.0f);
        k10.setVisibility(8);
        TextView k11 = org.telegram.ui.d3.k(frameLayout, k10, gb1.h(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f1 = k11;
        k11.setBackground(org.telegram.ui.ActionBar.y6.g0(822083583, 7, -1));
        k11.setPadding(org.telegram.ui.d3.h(8.0f, R.string.Done, k11), 0, AndroidUtilities.dp(8.0f), 0);
        k11.setGravity(16);
        k11.setTextColor(-1);
        k11.setTypeface(AndroidUtilities.bold());
        k11.setTextSize(1, 16.0f);
        final int i18 = 3;
        k11.setOnClickListener(new View.OnClickListener() { // from class: fi.s4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        ta taVar2 = taVar;
                        u5 u5Var2 = taVar2.D0;
                        if (u5Var2 != null && (u5Var2.getCurrentBrush() instanceof rg.l)) {
                            u5Var2.b();
                            taVar2.Z0.setSelectedIndex(1);
                            taVar2.i((rg.m) rg.m.a.get(0));
                            break;
                        } else {
                            taVar2.s0.c();
                            break;
                        }
                        break;
                    case 1:
                        ta taVar3 = taVar;
                        u5 u5Var3 = taVar3.D0;
                        rg.t1 t1Var2 = taVar3.s0;
                        if (t1Var2.a()) {
                            if (u5Var3 != null && (u5Var3.getCurrentBrush() instanceof rg.l)) {
                                u5Var3.b();
                                taVar3.Z0.setSelectedIndex(1);
                                taVar3.i((rg.m) rg.m.a.get(0));
                            }
                            if (u5Var3 != null) {
                                u5Var3.a();
                            }
                            t1Var2.c.clear();
                            t1Var2.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            taVar3.G0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ta taVar4 = taVar;
                        sg.j jVar = taVar4.y0;
                        if (jVar instanceof sg.x2) {
                            AndroidUtilities.hideKeyboard(((sg.x2) jVar).getFocusedView());
                        }
                        if (taVar4.f2) {
                            taVar4.s0(false);
                        }
                        taVar4.z0(taVar4.y0);
                        taVar4.A0(null, true);
                        break;
                    case 3:
                        taVar.A0(null, true);
                        break;
                    default:
                        ta taVar5 = taVar;
                        if (!taVar5.q1) {
                            if (!taVar5.f2) {
                                if (!taVar5.z0) {
                                    Runnable runnable = taVar5.A1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    taVar5.A0(null, true);
                                    break;
                                }
                            } else {
                                taVar5.s0(true);
                                break;
                            }
                        } else {
                            taVar5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        k11.setAlpha(0.0f);
        k11.setVisibility(8);
        frameLayout.addView(k11, gb1.h(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        a6 a6Var = new a6(taVar, context, e);
        this.I0 = a6Var;
        a6Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        a6Var.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(a6Var, gb1.i(-1, 104, 80));
        sg.t1 t1Var2 = new sg.t1(context, (w7Var == null || w7Var.v() || w7Var.u || laVar == null) ? false : true);
        this.Z0 = t1Var2;
        t1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        t1Var2.setDelegate(this);
        t1Var2.setSelectedIndex(1);
        a6Var.addView(t1Var2, gb1.g(48.0f, -1));
        sg.q1 q1Var3 = new sg.q1(context);
        this.a1 = q1Var3;
        q1Var3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        q1Var3.setVisibility(8);
        q1Var3.setDelegate(this);
        final int i19 = 1;
        post(new Runnable() { // from class: fi.r4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        ta taVar2 = taVar;
                        rg.q1 q1Var4 = taVar2.p1;
                        taVar2.C0(q1Var4);
                        rg.s0.e(i10).j(q1Var4.c);
                        break;
                    default:
                        taVar.a1.setTypeface(rg.s0.e(i10).j);
                        break;
                }
            }
        });
        q1Var3.setAlignment(rg.s0.e(i10).g);
        a6Var.addView(q1Var3, gb1.g(48.0f, -1));
        e5 e5Var = new e5(taVar, context);
        this.J0 = e5Var;
        addView(e5Var, gb1.g(-1.0f, -1));
        sg.v1 v1Var = new sg.v1(context);
        this.b1 = v1Var;
        v1Var.setVisibility(8);
        v1Var.setOnItemClickListener(new ai.k(taVar, 10));
        q1Var3.setTypefaceListView(v1Var);
        e5Var.addView(v1Var, gb1.h(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(s5Var.g(org.telegram.ui.ActionBar.y6.G8));
        f5 f5Var = new f5(taVar, context);
        this.l1 = f5Var;
        f5Var.setVisibility(8);
        f5Var.setColorPalette(rg.s0.e(i10));
        f5Var.setColorListener(new bi.n7(taVar, 1));
        a6Var.addView(f5Var, gb1.h(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        sg.h1 h1Var = new sg.h1(context);
        this.p0 = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        h1Var.setBackground(org.telegram.ui.ActionBar.y6.g0(1090519039, 1, -1));
        a6Var.addView(h1Var, gb1.h(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        final int i20 = 4;
        h1Var.setOnClickListener(new View.OnClickListener() { // from class: fi.s4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i20) {
                    case 0:
                        ta taVar2 = taVar;
                        u5 u5Var2 = taVar2.D0;
                        if (u5Var2 != null && (u5Var2.getCurrentBrush() instanceof rg.l)) {
                            u5Var2.b();
                            taVar2.Z0.setSelectedIndex(1);
                            taVar2.i((rg.m) rg.m.a.get(0));
                            break;
                        } else {
                            taVar2.s0.c();
                            break;
                        }
                        break;
                    case 1:
                        ta taVar3 = taVar;
                        u5 u5Var3 = taVar3.D0;
                        rg.t1 t1Var22 = taVar3.s0;
                        if (t1Var22.a()) {
                            if (u5Var3 != null && (u5Var3.getCurrentBrush() instanceof rg.l)) {
                                u5Var3.b();
                                taVar3.Z0.setSelectedIndex(1);
                                taVar3.i((rg.m) rg.m.a.get(0));
                            }
                            if (u5Var3 != null) {
                                u5Var3.a();
                            }
                            t1Var22.c.clear();
                            t1Var22.b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var22, 12));
                            taVar3.G0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ta taVar4 = taVar;
                        sg.j jVar = taVar4.y0;
                        if (jVar instanceof sg.x2) {
                            AndroidUtilities.hideKeyboard(((sg.x2) jVar).getFocusedView());
                        }
                        if (taVar4.f2) {
                            taVar4.s0(false);
                        }
                        taVar4.z0(taVar4.y0);
                        taVar4.A0(null, true);
                        break;
                    case 3:
                        taVar.A0(null, true);
                        break;
                    default:
                        ta taVar5 = taVar;
                        if (!taVar5.q1) {
                            if (!taVar5.f2) {
                                if (!taVar5.z0) {
                                    Runnable runnable = taVar5.A1;
                                    if (runnable != null) {
                                        runnable.run();
                                        break;
                                    }
                                } else {
                                    taVar5.A0(null, true);
                                    break;
                                }
                            } else {
                                taVar5.s0(true);
                                break;
                            }
                        } else {
                            taVar5.F0(false);
                            break;
                        }
                        break;
                }
            }
        });
        sg.l1 l1Var = new sg.l1(context);
        this.q0 = l1Var;
        l1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        l1Var.setBackground(org.telegram.ui.ActionBar.y6.g0(1090519039, 1, -1));
        l1Var.setOnClickListener(new bi.w0(taVar, context, e, 9));
        a6Var.addView(l1Var, gb1.h(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        sg.y1 y1Var = new sg.y1(context);
        this.S0 = y1Var;
        rg.q1 q1Var4 = q1Var;
        y1Var.setColorSwatch(q1Var4);
        y1Var.setRenderView(u5Var);
        y1Var.setValueOverride(lVar);
        q1Var4.c = lVar.get();
        final int i21 = 0;
        y1Var.setOnUpdate(new Runnable() { // from class: fi.r4
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        ta taVar2 = taVar;
                        rg.q1 q1Var42 = taVar2.p1;
                        taVar2.C0(q1Var42);
                        rg.s0.e(i10).j(q1Var42.c);
                        break;
                    default:
                        taVar.a1.setTypeface(rg.s0.e(i10).j);
                        break;
                }
            }
        });
        addView(y1Var, gb1.g(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.K0 = frameLayout2;
        addView(frameLayout2, gb1.g(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        B0(q1Var4, null, false);
        i((rg.m) rg.m.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.D1 = new h5(taVar, rbVar, new ai.n1(9, taVar, rbVar));
        l2.H = i14;
    }

    public static void D0(sg.x2 x2Var, int i10) {
        x2Var.setAlign(i10);
        int i11 = 2;
        x2Var.getEditText().setGravity(i10 != 1 ? i10 != 2 ? 19 : 21 : 17);
        if (i10 == 1) {
            i11 = 4;
        } else if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i11 = 3;
        }
        x2Var.getEditText().setTextAlignment(i11);
    }

    public static void X(ta taVar, rg.s0 s0Var, Integer num) {
        s0Var.h(num.intValue(), true);
        s0Var.g();
        taVar.setNewColor(num.intValue());
        taVar.l1.setSelectedColorIndex(s0Var.d());
        taVar.I1 = null;
    }

    public static /* synthetic */ void Y(ta taVar, Integer num) {
        taVar.setNewColor(num.intValue());
        taVar.F0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.N0 == 2 ? this.a1 : this.Z0;
    }

    private int getFrameRotation() {
        int i10 = this.U0;
        if (i10 == 90) {
            return 1;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 3;
        }
        return 2;
    }

    private qw0 getPaintingSize() {
        qw0 qw0Var = this.w0;
        if (qw0Var != null) {
            return qw0Var;
        }
        qw0 qw0Var2 = new qw0(1080.0f, 1920.0f);
        this.w0 = qw0Var2;
        return qw0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i10 = 0;
        while (true) {
            y5 y5Var = this.G0;
            if (i10 >= y5Var.getChildCount()) {
                return;
            }
            View childAt = y5Var.getChildAt(i10);
            if (childAt instanceof sg.q2) {
                ImageReceiver imageReceiver = ((sg.q2) childAt).x0;
                xj0 lottieAnimation = imageReceiver.getLottieAnimation();
                org.telegram.ui.Components.g6 animation = imageReceiver.getAnimation();
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
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i10) {
        rg.q1 q1Var = this.p1;
        int i11 = q1Var.a;
        q1Var.a = i10;
        B0(q1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new t4(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.A0 = i10;
        sg.j jVar = this.y0;
        if (jVar instanceof sg.x2) {
            ((sg.x2) jVar).setType(i10);
        }
        rg.s0 e = rg.s0.e(this.u1);
        e.h = i10;
        e.a.edit().putInt("text_type", i10).apply();
        this.a1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        l5 l5Var = new l5(this, context);
        this.L0 = l5Var;
        l5Var.setClipToPadding(false);
        this.L0.setOrientation(0);
        this.I0.addView(this.L0, gb1.h(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.W0 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.W0;
        int i10 = org.telegram.ui.ActionBar.y6.i6;
        s5 s5Var = this.v1;
        org.telegram.ui.ActionBar.f7.R(textView2, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i10, s5Var), 7, -1), null, org.telegram.ui.ActionBar.f7.N(i10), s5Var);
        this.W0.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.W0.setTextColor(-1);
        this.W0.setTextSize(1, 14.0f);
        this.W0.setGravity(1);
        this.W0.setTypeface(AndroidUtilities.bold());
        this.W0.setSingleLine();
        final int i11 = 0;
        this.W0.setOnClickListener(new View.OnClickListener(this) { // from class: fi.m4
            public final /* synthetic */ e6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e6 e6Var = this.b;
                        if (!e6Var.z0) {
                            e6Var.O0(0);
                            break;
                        } else {
                            e6Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        e6 e6Var2 = this.b;
                        e6Var2.O0(2);
                        if (!(e6Var2.y0 instanceof sg.x2)) {
                            e6Var2.a2 = true;
                            e6Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.L0.addView(this.W0, gb1.p(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.X0 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        org.telegram.ui.ActionBar.f7.R(this.X0, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i10, s5Var), 7, -1), null, org.telegram.ui.ActionBar.f7.N(i10), s5Var);
        this.X0.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        final int i12 = 1;
        this.X0.setOnClickListener(new View.OnClickListener(this) { // from class: fi.m4
            public final /* synthetic */ e6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        e6 e6Var = this.b;
                        if (!e6Var.z0) {
                            e6Var.O0(0);
                            break;
                        } else {
                            e6Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        e6 e6Var2 = this.b;
                        e6Var2.O0(2);
                        if (!(e6Var2.y0 instanceof sg.x2)) {
                            e6Var2.a2 = true;
                            e6Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.X0.setTextColor(-1);
        this.X0.setTextSize(1, 14.0f);
        this.X0.setGravity(1);
        this.X0.setTypeface(AndroidUtilities.bold());
        this.X0.setAlpha(0.6f);
        this.X0.setSingleLine();
        this.L0.addView(this.X0, gb1.p(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.Y0 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        org.telegram.ui.ActionBar.f7.R(this.Y0, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i10, s5Var), 7, -1), null, org.telegram.ui.ActionBar.f7.N(i10), s5Var);
        this.Y0.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.Y0.setTextColor(-1);
        this.Y0.setTextSize(1, 14.0f);
        this.Y0.setGravity(1);
        this.Y0.setTypeface(AndroidUtilities.bold());
        this.Y0.setAlpha(0.6f);
        this.Y0.setSingleLine();
        final int i13 = 2;
        this.Y0.setOnClickListener(new View.OnClickListener(this) { // from class: fi.m4
            public final /* synthetic */ e6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        e6 e6Var = this.b;
                        if (!e6Var.z0) {
                            e6Var.O0(0);
                            break;
                        } else {
                            e6Var.A0(null, true);
                            break;
                        }
                    case 1:
                        this.b.x0();
                        break;
                    default:
                        e6 e6Var2 = this.b;
                        e6Var2.O0(2);
                        if (!(e6Var2.y0 instanceof sg.x2)) {
                            e6Var2.a2 = true;
                            e6Var2.l0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.L0.addView(this.Y0, gb1.p(1.0f, 0, -2));
    }

    public static boolean u0(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public final boolean A0(sg.j jVar, boolean z10) {
        boolean z11;
        cc ccVar;
        cc ccVar2;
        fl0 fl0Var;
        int i10;
        boolean z12 = jVar instanceof sg.x2;
        int i11 = 2;
        if (z12 && (((i10 = this.O0) == -1 && this.N0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.Q0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.q1) {
                F0(false);
            }
            O0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            sg.x2 x2Var = (sg.x2) jVar;
            int gravity = x2Var.getEditText().getGravity();
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            sg.q1 q1Var = this.a1;
            q1Var.setAlignment(i11);
            rg.j0 typeface = x2Var.getTypeface();
            if (typeface != null) {
                q1Var.setTypeface(typeface.a);
            }
            q1Var.e(x2Var.getType(), true);
            this.J0.invalidate();
        }
        sg.j jVar2 = this.y0;
        if (jVar2 == null) {
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!jVar.d0) {
                    if (jVar instanceof sg.u0) {
                        sg.u0 u0Var = (sg.u0) jVar;
                        u0Var.setType((u0Var.getType() + 1) % u0Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof sg.y2) {
                        sg.y2 y2Var = (sg.y2) jVar;
                        y2Var.setType((y2Var.getType() + 1) % y2Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof sg.r0) {
                        sg.r0 r0Var = (sg.r0) jVar;
                        sg.p0 p0Var = r0Var.q0;
                        if (p0Var.e()) {
                            p0Var.setPreviewType(p0Var.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        r0Var.setType(r0Var.getNextType());
                        return true;
                    }
                    if (!this.z0) {
                        if (jVar instanceof sg.x2) {
                            this.B0 = true;
                            o0();
                            return true;
                        }
                        if (!(jVar instanceof sg.c2)) {
                            J0(jVar2);
                            return true;
                        }
                        sg.c2 c2Var = (sg.c2) jVar;
                        if (this.R1 && this.P1 == jVar) {
                            c2Var.q(true);
                            return true;
                        }
                        sg.c2 c2Var2 = this.P1;
                        if (c2Var2 != null && c2Var2 != c2Var && (fl0Var = this.O1) != null) {
                            fl0Var.animate().alpha(0.0f).setListener(new j5(fl0Var, 0));
                            this.O1 = null;
                            this.R1 = false;
                            this.Q1 = 0.0f;
                        }
                        if (this.O1 == null) {
                            fl0 fl0Var2 = new fl0(2, this.u1, getContext(), LaunchActivity.R(), new di.s2(6, new di.b()));
                            this.O1 = fl0Var2;
                            org.telegram.ui.Components.pa paVar = new org.telegram.ui.Components.pa(this.T1, fl0Var2, 0, false);
                            this.O1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                            this.B1.addView(this.O1, gb1.h(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.a.o(-16777216, 120));
                            fl0 fl0Var3 = this.O1;
                            me meVar = new me();
                            meVar.e = this;
                            meVar.c = paVar;
                            meVar.d = paint;
                            meVar.b = new Path();
                            fl0Var3.setDelegate(meVar);
                            this.O1.p(null, null, true);
                        }
                        this.O1.setFragment(LaunchActivity.R());
                        this.P1 = c2Var;
                        L0(true);
                        return true;
                    }
                    if (jVar2 instanceof sg.x2) {
                        AndroidUtilities.showKeyboard(((sg.x2) jVar2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            sg.j jVar3 = this.y0;
            if (jVar3 instanceof sg.x2) {
                sg.x2 x2Var2 = (sg.x2) jVar3;
                sg.w2 w2Var = x2Var2.q0;
                w2Var.clearFocus();
                w2Var.setEnabled(false);
                w2Var.setClickable(false);
                x2Var2.m();
                if (!z12) {
                    this.z0 = false;
                    AndroidUtilities.hideKeyboard(((sg.x2) this.y0).getFocusedView());
                    s0(false);
                }
            } else if ((jVar3 instanceof sg.d2) && (ccVar2 = ((ta) this).p2.Z0) != null) {
                ccVar2.l(false);
            }
            z11 = true;
        }
        sg.j jVar4 = this.y0;
        this.y0 = jVar;
        if ((jVar4 instanceof sg.x2) && TextUtils.isEmpty(((sg.x2) jVar4).getText())) {
            z0(jVar4);
        }
        sg.j jVar5 = this.y0;
        if (jVar4 != jVar5 && (jVar5 instanceof sg.d2) && (ccVar = ((ta) this).p2.Z0) != null) {
            ccVar.l(true);
        }
        sg.j jVar6 = this.y0;
        a4.l lVar = this.T0;
        rg.q1 q1Var2 = this.p1;
        sg.y1 y1Var = this.S0;
        if (jVar6 != null) {
            z5 z5Var = this.F0;
            jVar6.m0 = z5Var;
            jVar6.l(z5Var, true);
            sg.j jVar7 = this.y0;
            if (jVar7 instanceof sg.x2) {
                sg.x2 x2Var3 = (sg.x2) jVar7;
                x2Var3.getSwatch().c = q1Var2.c;
                x2Var3.z0 = false;
                C0(x2Var3.getSwatch());
                y1Var.setValueOverride(new i5(x2Var3, (int) (this.w0.a / 9.0f), 0));
                y1Var.setShowPreview(false);
            } else {
                y1Var.setValueOverride(lVar);
                y1Var.setShowPreview(true);
                q1Var2.c = lVar.get();
                B0(q1Var2, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.Q0;
            if (valueAnimator2 != null && this.O0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.q1) {
                F0(false);
            }
            O0(0);
            y1Var.setValueOverride(lVar);
            y1Var.setShowPreview(true);
            q1Var2.c = lVar.get();
            B0(q1Var2, null, false);
            z13 = z11;
        }
        R0();
        return z13;
    }

    public final void B0(rg.q1 q1Var, Integer num, boolean z10) {
        rg.q1 q1Var2 = this.p1;
        if (q1Var2 != q1Var) {
            q1Var2.a = q1Var.a;
            q1Var2.b = q1Var.b;
            q1Var2.c = q1Var.c;
            int i10 = this.u1;
            rg.s0.e(i10).h(q1Var.a, true);
            rg.s0.e(i10).j(q1Var.c);
        }
        int i11 = q1Var.a;
        u5 u5Var = this.D0;
        u5Var.setColor(i11);
        u5Var.setBrushSize(q1Var.c);
        int i12 = q1Var2.a;
        int i13 = 0;
        if (num == null || num.intValue() == i12) {
            a6 a6Var = this.I0;
            if (a6Var != null) {
                a6Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new n4(this, num, i12, i13));
            duration.start();
        }
        sg.j jVar = this.y0;
        if (jVar instanceof sg.x2) {
            ((sg.x2) jVar).setSwatch(new rg.q1(q1Var.b, q1Var.c, q1Var.a));
            return;
        }
        if (z10 && (jVar instanceof sg.u0)) {
            ((sg.u0) jVar).setColor(q1Var.a);
            ((sg.u0) this.y0).setType(3);
        } else if (z10 && (jVar instanceof sg.y2)) {
            ((sg.y2) jVar).setColor(q1Var.a);
            ((sg.y2) this.y0).setType(3);
        } else if (z10 && (jVar instanceof sg.r0)) {
            ((sg.r0) jVar).setColor(q1Var.a);
            ((sg.r0) this.y0).setType(0);
        }
    }

    @Override // sg.o1
    public final void C() {
        M0(true);
    }

    public final void C0(rg.q1 q1Var) {
        B0(q1Var, null, false);
    }

    @Override // sg.h
    public final boolean D(sg.j jVar) {
        return A0(jVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View, android.view.ViewGroup, fi.y5] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    public final void E0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        sg.j jVar;
        ArrayList arrayList = this.F1;
        if (arrayList == null) {
            return;
        }
        w7 w7Var = this.E1;
        this.E1 = null;
        this.F1 = null;
        int size = arrayList.size();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ?? r13 = this.G0;
            if (i11 >= size) {
                r13.setVisibility(z10 ? 1 : 0);
                return;
            }
            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
            byte b10 = mediaEntity.type;
            if (b10 == 0) {
                r5 k02 = k0(mediaEntity.parentObject, mediaEntity.document);
                if ((2 & mediaEntity.subType) != 0) {
                    k02.r(z10);
                }
                ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                layoutParams.width = mediaEntity.viewWidth;
                layoutParams.height = mediaEntity.viewHeight;
                i10 = i11;
                jVar = k02;
            } else if (b10 == 1) {
                sg.x2 l02 = l0(z10);
                l02.setType(mediaEntity.subType);
                l02.setTypeface(mediaEntity.textTypeface);
                l02.setBaseFontSize(mediaEntity.fontSize);
                SpannableString spannableString = new SpannableString(mediaEntity.text);
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                int size2 = arrayList2.size();
                for (?? r52 = z10; r52 < size2; r52++) {
                    VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(r52);
                    org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(emojiEntity.document_id, 1.0f, l02.getFontMetricsInt());
                    int i12 = emojiEntity.offset;
                    spannableString.setSpan(c6Var, i12, emojiEntity.length + i12, 33);
                    i11 = i11;
                }
                i10 = i11;
                CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, l02.getFontMetricsInt(), false);
                if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                l02.setText(replaceEmoji);
                D0(l02, mediaEntity.textAlign);
                rg.q1 swatch = l02.getSwatch();
                swatch.a = mediaEntity.color;
                l02.setSwatch(swatch);
                jVar = l02;
            } else {
                i10 = i11;
                if (b10 == 2) {
                    sg.z1 h02 = h0(mediaEntity.text, false);
                    h02.G0 = mediaEntity.crop;
                    h02.B0 = false;
                    if ((2 & mediaEntity.subType) != 0) {
                        h02.r(false);
                    }
                    if ((mediaEntity.subType & 16) != 0) {
                        h02.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                    layoutParams2.width = mediaEntity.viewWidth;
                    layoutParams2.height = mediaEntity.viewHeight;
                    jVar = h02;
                } else if (b10 == 6) {
                    ArrayList arrayList3 = w7Var.v;
                    boolean z11 = w7Var.K;
                    this.a2 = true;
                    sg.j q5Var = new q5(this, getContext(), c0(), arrayList3, this.T1, z11, this.U1);
                    q5Var.setDelegate(this);
                    r13.addView(q5Var);
                    d0();
                    jVar = q5Var;
                    if (mediaEntity.viewWidth > 0) {
                        jVar = q5Var;
                        if (mediaEntity.viewHeight > 0) {
                            ViewGroup.LayoutParams layoutParams3 = q5Var.getLayoutParams();
                            layoutParams3.width = mediaEntity.viewWidth;
                            layoutParams3.height = mediaEntity.viewHeight;
                            jVar = q5Var;
                        }
                    }
                } else if (b10 == 3) {
                    sg.u0 g02 = g0(mediaEntity.media, mediaEntity.mediaArea);
                    int i13 = mediaEntity.color;
                    if (i13 != 0) {
                        g02.setColor(i13);
                    }
                    g02.setType(mediaEntity.subType);
                    jVar = g02;
                } else if (b10 == 8) {
                    pc pcVar = mediaEntity.weather;
                    if (pcVar == null) {
                        i11 = i10 + 1;
                        z10 = false;
                    } else {
                        sg.y2 m0 = m0(pcVar);
                        int i14 = mediaEntity.color;
                        if (i14 != 0) {
                            m0.setColor(i14);
                        }
                        m0.setType(mediaEntity.subType);
                        jVar = m0;
                    }
                } else if (b10 == 7) {
                    sg.r0 f02 = f0(mediaEntity.linkSettings);
                    sg.p0 p0Var = f02.q0;
                    int i15 = mediaEntity.color;
                    if (i15 != 0) {
                        f02.setColor(i15);
                    }
                    boolean e = p0Var.e();
                    int i16 = p0Var.h;
                    int i17 = p0Var.f;
                    if (e) {
                        p0Var.setPreviewType(mediaEntity.subType);
                    }
                    byte b11 = mediaEntity.subType;
                    if (b11 == -1) {
                        f02.setType(3);
                        p0Var.d();
                        mediaEntity.viewWidth = ((int) Math.ceil(p0Var.a0)) + i17 + i17;
                        mediaEntity.viewHeight = ((int) Math.ceil(p0Var.b0)) + i16 + i16;
                        PointF position = f02.getPosition();
                        position.y = (this.H1 * 0.3f) + position.y;
                        f02.setPosition(position);
                        i11 = i10 + 1;
                        z10 = false;
                    } else {
                        f02.setType(b11);
                        jVar = f02;
                    }
                } else if (b10 == 4) {
                    sg.c2 i02 = i0(false);
                    i02.s(bh.x0.d(mediaEntity.mediaArea.reaction), false);
                    if (mediaEntity.mediaArea.flipped) {
                        i02.r(false);
                    }
                    jVar = i02;
                    if (mediaEntity.mediaArea.dark) {
                        i02.q(false);
                        jVar = i02;
                    }
                } else {
                    if (b10 == 5 && w7Var.o0 != null) {
                        sg.d2 j02 = j0(w7Var.p0, false);
                        sb sbVar = ((ta) this).p2;
                        gb gbVar = sbVar.X0;
                        if (gbVar != null) {
                            gbVar.w = j02;
                            s81 s81Var = gbVar.x;
                            if (s81Var != null) {
                                s81Var.V(j02.u0);
                            }
                        }
                        ib ibVar = sbVar.c1;
                        if (ibVar != null) {
                            ibVar.setHasRoundVideo(true);
                        }
                        jVar = j02;
                        if ((2 & mediaEntity.subType) != 0) {
                            boolean z12 = !j02.r0;
                            j02.r0 = z12;
                            j02.s0.f(z12, true);
                            j02.invalidate();
                            jVar = j02;
                        }
                    }
                    i11 = i10 + 1;
                    z10 = false;
                }
            }
            jVar.setX((mediaEntity.x * this.G1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
            jVar.setY((mediaEntity.y * this.H1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
            jVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + jVar.getX(), (mediaEntity.viewHeight / 2.0f) + jVar.getY()));
            jVar.setScale(mediaEntity.scale);
            jVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
            i11 = i10 + 1;
            z10 = false;
        }
    }

    public final void F0(final boolean z10) {
        if (this.q1 != z10) {
            this.q1 = z10;
            o1.j jVar = this.r1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new ac.a(z10 ? 0.0f : 1000.0f));
            this.r1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            int i10 = 0;
            final boolean[] zArr = {this.D1.c() || this.i2 > 0};
            final float translationY = this.I0.getTranslationY();
            final float alpha = this.q0.getAlpha();
            final ViewGroup barView = getBarView();
            this.r1.b(new o1.g() { // from class: fi.o4
                @Override // o1.g
                public final void a(o1.h hVar, float f7, float f10) {
                    e6 e6Var = e6.this;
                    a6 a6Var = e6Var.I0;
                    float f11 = f7 / 1000.0f;
                    e6Var.s1 = f11;
                    float f12 = ((1.0f - f11) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f12);
                    view.setScaleY(f12);
                    view.setTranslationY((Math.min(e6Var.s1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(e6Var.s1, 0.25f) / 0.25f));
                    f5 f5Var = e6Var.l1;
                    float f13 = e6Var.s1;
                    boolean z11 = z10;
                    f5Var.E1(f13, z11);
                    sg.l1 l1Var = e6Var.q0;
                    l1Var.setProgress(e6Var.s1);
                    sg.h1 h1Var = e6Var.p0;
                    h1Var.setProgress(e6Var.s1);
                    e6Var.L0.setTranslationY(AndroidUtilities.dp(32.0f) * e6Var.s1);
                    AnimatorSet animatorSet = e6Var.C1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f14 = e6Var.s1;
                        if (!z11) {
                            f14 = 1.0f - f14;
                        }
                        float f15 = z11 ? 1.0f : 0.0f;
                        float f16 = alpha;
                        l1Var.setAlpha(AndroidUtilities.lerp(f16, f15, f14));
                        h1Var.setAlpha(AndroidUtilities.lerp(f16, z11 ? 1.0f : 0.0f, f14));
                        a6Var.setTranslationY(translationY - ((AndroidUtilities.dp(39.0f) * f14) * (z11 ? 1 : -1)));
                    }
                    a6Var.invalidate();
                    if (view == e6Var.a1) {
                        e6Var.J0.invalidate();
                    }
                }
            });
            this.r1.a(new p4(this, z10, i10));
            this.r1.h();
            if (z10) {
                f5 f5Var = this.l1;
                f5Var.setVisibility(0);
                f5Var.setSelectedColorIndex(rg.s0.e(this.u1).d());
            }
        }
    }

    public final void G0(int i10) {
        sg.q1 q1Var = this.a1;
        h5 h5Var = this.D1;
        int i11 = 1;
        if (i10 == 1) {
            sz szVar = this.e2;
            boolean z10 = szVar != null && szVar.getVisibility() == 0;
            sz szVar2 = this.e2;
            rb rbVar = this.B1;
            if (szVar2 != null && szVar2.c1 != UserConfig.selectedAccount) {
                rbVar.removeView(szVar2);
                this.e2 = null;
            }
            if (this.e2 == null) {
                sz szVar3 = new sz(null, true, false, false, getContext(), false, null, null, true, this.v1, false, false);
                this.e2 = szVar3;
                szVar3.x2 = false;
                szVar3.U0 = true;
                szVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.e2.setForseMultiwindowLayout(true);
                }
                this.e2.setDelegate(new t5(this));
                rbVar.addView(this.e2);
            }
            this.e2.setVisibility(0);
            this.f2 = true;
            sz szVar4 = this.e2;
            if (this.k2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.k2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.k2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.l2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.l2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.l2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int paddingUnderContainer = rbVar.getPaddingUnderContainer() + (point.x > point.y ? this.l2 : this.k2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) szVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            szVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                sg.j jVar = this.y0;
                if (jVar instanceof sg.x2) {
                    AndroidUtilities.hideKeyboard(((sg.x2) jVar).getEditText());
                }
            }
            this.i2 = paddingUnderContainer;
            h5Var.a();
            requestLayout();
            ah emojiButton = q1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            if (!z10) {
                if (this.g2) {
                    this.j2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i2, 0.0f);
                    ofFloat.addUpdateListener(new q4(this, i11));
                    ofFloat.addListener(new k5(this, i11));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                    ofFloat.start();
                }
            }
        } else {
            ah emojiButton2 = q1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(yg.e, true);
            }
            sz szVar5 = this.e2;
            if (szVar5 != null) {
                this.f2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    szVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.i2 = 0;
                h5Var.a();
            }
            requestLayout();
        }
        P0();
    }

    public final void H0(sg.r0 r0Var) {
        f8 f8Var = new f8(getContext(), this.v1, this.V1, new ai.n1(11, this, r0Var));
        if (r0Var != null) {
            sg.o0 o0Var = r0Var.u0;
            f8Var.c0 = true;
            org.telegram.ui.Cells.g3 g3Var = f8Var.Z;
            org.telegram.ui.Cells.g3 g3Var2 = f8Var.Y;
            if (o0Var != null) {
                f8Var.g0 = o0Var.d;
                f8Var.h0 = false;
                g3Var2.setText(o0Var.c);
                g3Var.setText(o0Var.b);
                f8Var.m0 = !TextUtils.isEmpty(o0Var.b);
                f8Var.n0 = o0Var.f;
                f8Var.o0 = o0Var.e;
            } else {
                g3Var2.setText("");
                g3Var.setText("");
                f8Var.n0 = true;
                f8Var.o0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = f8Var.b0;
            dVar.i(string, false, true);
            b8 b8Var = f8Var.X;
            if (b8Var != null) {
                b8Var.O(false);
            }
            dVar.setEnabled(f8Var.V(g3Var2.getText().toString()));
            f8Var.c0 = false;
        }
        f8Var.setOnDismissListener(new a5(this, 1));
        f8Var.show();
        w0(true);
    }

    @Override // org.telegram.ui.Components.uw0
    public final void I(int i10, boolean z10) {
        boolean z11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.g2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.l2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.l2).commit();
            } else {
                this.k2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.k2).commit();
            }
        }
        boolean z12 = this.f2;
        h5 h5Var = this.D1;
        if (z12) {
            int paddingUnderContainer = this.B1.getPaddingUnderContainer() + (z10 ? this.l2 : this.k2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = AndroidUtilities.displaySize.x;
            if (i11 != i12 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i12;
                layoutParams.height = paddingUnderContainer;
                this.e2.setLayoutParams(layoutParams);
                this.i2 = layoutParams.height;
                h5Var.a();
                requestLayout();
            }
        }
        if (this.m2 == i10 && this.n2 == z10) {
            return;
        }
        this.m2 = i10;
        this.n2 = z10;
        boolean z13 = this.g2;
        sg.j jVar = this.y0;
        if (jVar instanceof sg.x2) {
            this.g2 = ((sg.x2) jVar).getEditText().isFocused() && h5Var.c();
        } else {
            this.g2 = false;
        }
        if (this.g2 && this.f2) {
            G0(0);
        }
        if (this.i2 != 0 && !(z11 = this.g2) && z11 != z13 && !this.f2) {
            this.i2 = 0;
            h5Var.a();
            requestLayout();
        }
        R0();
        if (z13 && !this.g2 && this.i2 > 0 && this.j2) {
            this.j2 = false;
        }
        P0();
    }

    public final void I0(sg.u0 u0Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ti tiVar = new ti(getContext(), new o5(this, callback2), false, true, false, this.v1);
        tiVar.c2 = new p5();
        th thVar = tiVar.A1;
        if (u0Var != null && (messageMedia = u0Var.u0) != null && (geoPoint = messageMedia.geo) != null) {
            tiVar.D2 = new double[]{geoPoint.lat, geoPoint._long};
            tiVar.O = true;
            thVar.setVisibility(8);
        } else if (this.J1) {
            tiVar.B2 = this.L1;
            tiVar.C2 = this.K1;
            tiVar.O = true;
            thVar.setVisibility(8);
        } else {
            tiVar.O = true;
            thVar.setVisibility(8);
        }
        tiVar.setOnDismissListener(new a5(this, 0));
        tiVar.v1();
        tiVar.show();
    }

    public final void J0(sg.j jVar) {
        if (jVar instanceof sg.g1) {
            org.telegram.ui.ActionBar.o1 o1Var = this.w1;
            if (o1Var == null || !o1Var.isShowing()) {
                return;
            }
            this.w1.d(true);
            return;
        }
        int[] iArr = this.d2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        y5 y5Var = this.G0;
        float scaleX2 = y5Var.getScaleX() * scaleX;
        float scaleY = y5Var.getScaleY() * jVar.getScaleY() * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i11;
        K0(new u4(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void K0(Runnable runnable, e6 e6Var, int i10, int i11, int i12, boolean z10) {
        org.telegram.ui.ActionBar.o1 o1Var = this.w1;
        if (o1Var != null && o1Var.isShowing()) {
            this.w1.d(true);
            return;
        }
        if (this.x1 == null) {
            this.y1 = new Rect();
            c6 c6Var = new c6(this, getContext());
            this.x1 = c6Var;
            c6Var.setAnimationEnabled(true);
            this.x1.setOnTouchListener(new w4(this, 0));
            this.x1.setDispatchKeyEventListener(new x4(this));
            this.x1.setShownFromBottom(true);
        }
        c6 c6Var2 = this.x1;
        c6Var2.W = z10;
        c6Var2.d();
        runnable.run();
        if (this.w1 == null) {
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(this.x1, -2, -2);
            this.w1 = o1Var2;
            o1Var2.b = true;
            o1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.w1.setOutsideTouchable(true);
            this.w1.setClippingEnabled(true);
            this.w1.setInputMethodMode(2);
            this.w1.setSoftInputMode(0);
            this.w1.getContentView().setFocusableInTouchMode(true);
            this.w1.setOnDismissListener(new y4(this, 0));
        }
        this.x1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31));
        this.w1.setFocusable(true);
        int measuredWidth = i11 - (this.x1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.x1.getMeasuredHeight();
        this.w1.showAtLocation(e6Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.o1.i(this.x1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z10) {
            c6 c6Var3 = this.x1;
            c6Var3.setBackgroundDrawable(new org.telegram.ui.Components.oa(new org.telegram.ui.Components.pa(this.T1, c6Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
        } else {
            this.x1.setBackgroundDrawable(mutate);
            this.x1.setBackgroundColor(-14145495);
        }
    }

    public final void L0(boolean z10) {
        if (this.R1 != z10) {
            if (z10 || this.O1 != null) {
                this.R1 = z10;
                int i10 = 0;
                if (z10) {
                    this.O1.n();
                    this.O1.setVisibility(0);
                    this.O1.setSelectedReaction(this.P1.getCurrentReaction());
                    this.O1.getParent().bringChildToFront(this.O1);
                } else {
                    this.P1 = null;
                }
                if (!z10) {
                    if (this.O1.getReactionsWindow() != null) {
                        this.O1.getReactionsWindow().e();
                    }
                    this.O1.animate().alpha(0.0f).setDuration(150L).setListener(new k5(this, i10)).start();
                    return;
                }
                this.S1 = true;
                this.B1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, z10 ? 1.0f : 0.0f);
                this.O1.setTransitionProgress(this.Q1);
                ofFloat.addUpdateListener(new q4(this, 2));
                ofFloat.addListener(new bh.f0(12, this, z10));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(ds.g);
                ofFloat.start();
            }
        }
    }

    public final void M0(boolean z10) {
        if (this.j1 != z10) {
            this.j1 = z10;
            o1.j jVar = this.k1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new ac.a(z10 ? 0.0f : 1000.0f));
            this.k1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            if (z10) {
                sg.v1 v1Var = this.b1;
                v1Var.setAlpha(0.0f);
                v1Var.setVisibility(0);
            }
            int i10 = 1;
            this.k1.b(new di.i8(i10, this));
            this.k1.a(new p4(this, z10, i10));
            this.k1.h();
        }
    }

    public final PointF N0(sg.j jVar) {
        float f7;
        float f10;
        MediaController.CropState cropState = this.u0;
        float f11 = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        float f12 = 0.2f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f13 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF c02 = c0();
        int i10 = 0;
        while (i10 < 10) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                y5 y5Var = this.G0;
                if (i11 >= y5Var.getChildCount()) {
                    break;
                }
                View childAt = y5Var.getChildAt(i11);
                if (!(childAt instanceof sg.j) || (childAt instanceof sg.g1)) {
                    f7 = f12;
                    f10 = f13;
                } else {
                    PointF position2 = ((sg.j) childAt).getPosition();
                    f7 = f12;
                    f10 = f13;
                    if (((float) Math.sqrt(Math.pow(position2.y - c02.y, 2.0d) + Math.pow(position2.x - c02.x, 2.0d))) < f10) {
                        f11 = Math.min(childAt.getHeight(), childAt.getWidth()) * f7;
                        z10 = true;
                    }
                }
                i11++;
                f13 = f10;
                f12 = f7;
            }
            float f14 = f12;
            float f15 = f13;
            if (!z10) {
                break;
            }
            i10++;
            c02 = new PointF(c02.x + f11, c02.y + f11);
            f12 = f14;
            f13 = f15;
        }
        return c02;
    }

    public final void O0(int i10) {
        if (this.N0 == i10 || this.O0 == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = this.N0;
        ViewGroup viewGroup = this.a1;
        ViewGroup viewGroup2 = this.Z0;
        ViewGroup viewGroup3 = i11 == 0 ? viewGroup2 : i11 == 2 ? viewGroup : null;
        this.O0 = i10;
        ViewGroup viewGroup4 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        int i12 = this.u1;
        rg.s0 e = rg.s0.e(i12);
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
        int c10 = rg.s0.e(i12).c();
        rg.q1 q1Var = this.p1;
        q1Var.a = c10;
        B0(q1Var, null, false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.Q0 = duration;
        duration.setInterpolator(ds.f);
        this.Q0.addUpdateListener(new di.n3(this, viewGroup3, viewGroup4, i13));
        this.Q0.addListener(new m5(this, viewGroup3, viewGroup4, i10, 0));
        this.Q0.start();
    }

    public final void P0() {
        h5 h5Var = this.D1;
        sg.q1 q1Var = this.a1;
        if (q1Var != null) {
            if (h5Var.c()) {
                q1Var.a(R.drawable.input_smile);
            } else if (this.f2) {
                q1Var.a(R.drawable.input_keyboard);
            } else {
                q1Var.a(R.drawable.msg_add);
            }
        }
        boolean z10 = h5Var.c() || this.f2;
        boolean z11 = !z10;
        AndroidUtilities.updateViewShow(this.d1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.c1, z11, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.e1, z10, false, 1.0f, true, null);
    }

    @Override // org.telegram.ui.Components.ww0, org.telegram.ui.Components.vw0
    public final int Q() {
        return this.D1.l - this.B1.getBottomPadding2();
    }

    public final void Q0() {
        sg.j jVar;
        ObjectAnimator objectAnimator = this.X1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.D0.getParent();
        if (view == null) {
            return;
        }
        h5 h5Var = this.D1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!h5Var.c() || h5Var.d) && this.i2 <= 0) || (jVar = this.y0) == null) ? 0.0f : view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.X1 = ofFloat;
        ofFloat.setDuration(350L);
        this.X1.setInterpolator(ds.h);
        this.X1.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0() {
        boolean z10;
        if (this.y0 instanceof sg.x2) {
            h5 h5Var = this.D1;
            if ((h5Var.c() || this.i2 > 0) && !h5Var.d) {
                z10 = true;
                View view = this.M0;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new bh.n(7, this, z10)).start();
            }
        }
        z10 = false;
        View view2 = this.M0;
        view2.animate().cancel();
        view2.setVisibility(0);
        view2.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new bh.n(7, this, z10)).start();
    }

    @Override // sg.s1, sg.o1
    public final void a() {
        F0(true);
    }

    @Override // org.telegram.ui.Components.vw0, org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Mh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Eh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.a7));
    }

    @Override // sg.h
    public final int[] b(sg.j jVar) {
        int i10 = (int) jVar.getPosition().x;
        int[] iArr = this.d2;
        iArr[0] = i10;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final void b0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new e2.q0(7, this, view)).start();
    }

    @Override // sg.o1
    public final void c() {
        setTextType((this.A0 + 1) % 4);
    }

    public final PointF c0() {
        y5 y5Var = this.G0;
        int measuredWidth = y5Var.getMeasuredWidth();
        int measuredHeight = y5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.G1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.H1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override // sg.o1
    public final void d(int i10) {
        sg.j jVar = this.y0;
        if (jVar instanceof sg.x2) {
            D0((sg.x2) jVar, i10);
            rg.s0 e = rg.s0.e(this.u1);
            e.g = i10;
            e.a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void d0() {
        boolean z10 = this.L1;
        y5 y5Var = this.G0;
        boolean z11 = true;
        if (!z10 && !this.N1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 >= y5Var.getChildCount()) {
                    z11 = false;
                    break;
                }
                View childAt = y5Var.getChildAt(i10);
                boolean z12 = childAt instanceof sg.x2;
                int i11 = this.u1;
                if (z12) {
                    CharSequence text = ((sg.x2) childAt).getText();
                    if (text instanceof Spanned) {
                        for (org.telegram.ui.Components.c6 c6Var : (org.telegram.ui.Components.c6[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.c6.class)) {
                            TLRPC.Document document = c6Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.t5.f(i11, c6Var.getDocumentId());
                            }
                            if (document != null) {
                                org.telegram.ui.Components.t5.h(i11).e(document);
                            }
                            if (w7.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i10++;
                } else if (childAt instanceof sg.q2) {
                    TLRPC.Document sticker = ((sg.q2) childAt).getSticker();
                    if (w7.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                        break;
                    } else {
                        i10++;
                    }
                } else if (childAt instanceof sg.d2) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        for (int i12 = 0; i12 < y5Var.getChildCount(); i12++) {
            View childAt2 = y5Var.getChildAt(i12);
            if (childAt2 instanceof sg.j) {
                ((sg.j) childAt2).setIsVideo(z11);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.b2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        if ((view == this.D0 || view == this.E0 || view == this.G0 || view == this.F0) && (cropState = this.u0) != null) {
            canvas.save();
            r1 = this.C0 ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = cropState.transformRotation;
            if (i10 != 90 && i10 != 270) {
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

    public final TextView e0(int i10, String str) {
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.E8, this.v1);
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(str);
        return textView;
    }

    public final sg.r0 f0(sg.o0 o0Var) {
        int i10;
        this.a2 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        y5 y5Var = this.G0;
        float measuredWidth = y5Var.getMeasuredWidth() <= 0 ? this.G1 : y5Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        sg.r0 r0Var = new sg.r0(getContext(), N0, this.u1, o0Var, measuredWidth / 360.0f, dp);
        if (N0.x == y5Var.getMeasuredWidth() / 2.0f) {
            r0Var.setStickyX(2);
        }
        if (N0.y == y5Var.getMeasuredHeight() / 2.0f) {
            r0Var.setStickyY(2);
        }
        rg.q1 q1Var = this.p1;
        if (q1Var != null && (i10 = q1Var.a) != -47814) {
            r0Var.setColor(i10);
        }
        r0Var.setDelegate(this);
        r0Var.setMaxWidth(dp);
        y5Var.addView(r0Var, gb1.g(-2.0f, -2));
        d0();
        MediaController.CropState cropState = this.u0;
        if (cropState != null) {
            r0Var.j(1.0f / cropState.cropScale);
            r0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return r0Var;
    }

    public final sg.u0 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i10;
        this.a2 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        y5 y5Var = this.G0;
        float measuredWidth = y5Var.getMeasuredWidth() <= 0 ? this.G1 : y5Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        sg.u0 u0Var = new sg.u0(getContext(), N0, this.u1, messageMedia, mediaArea, measuredWidth / 240.0f, dp);
        if (N0.x == y5Var.getMeasuredWidth() / 2.0f) {
            u0Var.setStickyX(2);
        }
        if (N0.y == y5Var.getMeasuredHeight() / 2.0f) {
            u0Var.setStickyY(2);
        }
        rg.q1 q1Var = this.p1;
        if (q1Var != null && (i10 = q1Var.a) != -47814) {
            u0Var.setColor(i10);
        }
        u0Var.setDelegate(this);
        u0Var.setMaxWidth(dp);
        y5Var.addView(u0Var, gb1.g(-2.0f, -2));
        d0();
        MediaController.CropState cropState = this.u0;
        if (cropState != null) {
            u0Var.j(1.0f / cropState.cropScale);
            u0Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return u0Var;
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.D0.c(true, false);
    }

    public View getBottomLayout() {
        return this.I0;
    }

    public View getCancelView() {
        return this.p0;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.u0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.q0;
    }

    public View getEntitiesView() {
        return this.G0;
    }

    public long getLcm() {
        return this.V0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.c6[] c6VarArr;
        y5 y5Var = this.G0;
        int childCount = y5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = y5Var.getChildAt(i10);
            if (childAt instanceof sg.q2) {
                TLRPC.Document sticker = ((sg.q2) childAt).getSticker();
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
            } else if (childAt instanceof sg.x2) {
                CharSequence text = ((sg.x2) childAt).getText();
                if ((text instanceof Spanned) && (c6VarArr = (org.telegram.ui.Components.c6[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.c6.class)) != null) {
                    for (org.telegram.ui.Components.c6 c6Var : c6VarArr) {
                        if (c6Var != null) {
                            TLRPC.Document document = c6Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.t5.f(this.u1, c6Var.getDocumentId());
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
        return Arrays.asList(this.D0, this.E0, this.G0, this.F0);
    }

    public View getRenderInputView() {
        return this.E0;
    }

    public rg.c1 getRenderView() {
        return this.D0;
    }

    public sg.j getSelectedEntity() {
        return this.y0;
    }

    public View getSelectionEntitiesView() {
        return this.F0;
    }

    public View getTextDimView() {
        return this.M0;
    }

    public View getTopLayout() {
        return this.H0;
    }

    public View getWeightChooserView() {
        return this.S0;
    }

    public final sg.z1 h0(String str, boolean z10) {
        float f7;
        qw0 qw0Var;
        this.a2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f7 = 1.0f;
        }
        y5 y5Var = this.G0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.G1, y5Var.getMeasuredWidth()) * 0.5d);
            qw0Var = new qw0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.H1, y5Var.getMeasuredHeight()) * 0.5d);
            qw0Var = new qw0(f7 * floor2, floor2);
        }
        qw0 qw0Var2 = qw0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = qw0Var2.a;
            qw0Var2.a = qw0Var2.b;
            qw0Var2.b = f10;
        }
        Context context = getContext();
        PointF c02 = c0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        sg.z1 z1Var = new sg.z1(context, c02, qw0Var2, str, intValue);
        z1Var.setDelegate(this);
        y5Var.addView(z1Var);
        d0();
        return z1Var;
    }

    @Override // sg.s1
    public final void i(rg.m mVar) {
        boolean z10 = mVar instanceof rg.b;
        sg.y1 y1Var = this.S0;
        if (z10 || (mVar instanceof rg.d)) {
            y1Var.b(0.4f, 1.75f);
        } else {
            y1Var.b(0.05f, 1.0f);
        }
        y1Var.setDrawCenter(!(mVar instanceof rg.l));
        u5 u5Var = this.D0;
        if (u5Var.getCurrentBrush() instanceof rg.l) {
            this.R0 = true;
        }
        u5Var.setBrush(mVar);
        rg.q1 q1Var = this.p1;
        int i10 = q1Var.a;
        q1Var.a = rg.s0.e(this.u1).c();
        q1Var.c = this.T0.get();
        B0(q1Var, Integer.valueOf(i10), false);
        this.E0.invalidate();
    }

    public final sg.c2 i0(boolean z10) {
        String str;
        qw0 qw0Var = new qw0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF c02 = c0();
        y5 y5Var = this.G0;
        if (y5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < y5Var.getChildCount(); i10++) {
                    View childAt = y5Var.getChildAt(i10);
                    if (a8.ic.a(c02.x, c02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                c02.x = (y5Var.getMeasuredWidth() * 0.05f) + c02.x;
                c02.y = (y5Var.getMeasuredHeight() * 0.05f) + c02.y;
                c02.x = Utilities.clamp(c02.x, y5Var.getMeasuredWidth(), 0.0f);
                c02.y = Utilities.clamp(c02.y, y5Var.getMeasuredHeight(), 0.0f);
            }
        }
        sg.c2 c2Var = new sg.c2(getContext(), c02);
        c2Var.r0 = new di.e9(c2Var);
        c2Var.s0 = new di.e9(c2Var);
        c2Var.t0 = new bh.n0(c2Var);
        c2Var.u0 = new bh.n0(c2Var);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(c2Var);
        c2Var.w0 = h6Var;
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(c2Var);
        c2Var.x0 = h6Var2;
        c2Var.z0 = 1.0f;
        c2Var.q0 = qw0Var;
        h6Var2.d(1.0f, true);
        h6Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        bh.n0 n0Var = c2Var.t0;
        int i11 = 0;
        while (true) {
            if (i11 >= reactionsList.size()) {
                str = reactionsList.get(0).reaction;
                break;
            }
            if (reactionsList.get(i11).title.equals("Red Heart")) {
                str = reactionsList.get(i11).reaction;
                break;
            }
            i11++;
        }
        bh.x0 b10 = bh.x0.b(str);
        c2Var.v0 = b10;
        n0Var.e(b10);
        c2Var.k();
        c2Var.setDelegate(this);
        y5Var.addView(c2Var);
        d0();
        if (z10) {
            y0(c2Var);
            A0(c2Var, true);
        }
        return c2Var;
    }

    @Override // fi.ob
    public final boolean j(MotionEvent motionEvent) {
        if (this.b2) {
            return false;
        }
        if (this.y0 != null) {
            A0(null, true);
        }
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x9, y3);
        this.D0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final sg.d2 j0(String str, boolean z10) {
        this.a2 = true;
        this.c2 = true;
        n0();
        y5 y5Var = this.G0;
        int measuredWidth = y5Var.getMeasuredWidth();
        y5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.G1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        qw0 qw0Var = new qw0(floor, floor);
        sg.d2 d2Var = new sg.d2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (qw0Var.b / 2.0f) + AndroidUtilities.dp(72.0f)), qw0Var, str);
        d2Var.setDelegate(this);
        y5Var.addView(d2Var);
        d0();
        if (z10) {
            y0(d2Var);
            post(new l4(this, d2Var, 0));
        }
        this.c2 = false;
        return d2Var;
    }

    @Override // sg.h
    public final void k(sg.j jVar) {
        L0(false);
        J0(jVar);
    }

    public final r5 k0(Object obj, TLRPC.Document document) {
        float f7;
        for (int i10 = 0; i10 < document.attributes.size() && !(document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker); i10++) {
        }
        float f10 = 0.75f;
        MediaController.CropState cropState = this.u0;
        if (cropState != null) {
            f7 = -(cropState.transformRotation + cropState.cropRotate);
            f10 = 0.75f / cropState.cropScale;
        } else {
            f7 = 0.0f;
        }
        d6 d6Var = new d6(c0(), f10, f7);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        r5 r5Var = new r5(this, context, d6Var.a, d6Var.c, d6Var.b, new qw0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = r5Var.x0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        r5Var.setDelegate(this);
        this.G0.addView(r5Var);
        d0();
        return r5Var;
    }

    public final sg.x2 l0(boolean z10) {
        qw0 paintingSize = getPaintingSize();
        PointF N0 = N0(null);
        sg.x2 x2Var = new sg.x2(getContext(), N0, (int) (paintingSize.a / 9.0f), "", this.p1, this.A0);
        float f7 = paintingSize.a / 9.0f;
        v4 v4Var = new v4(this, 0);
        x2Var.w0 = (int) (0.5f * f7);
        x2Var.x0 = (int) (f7 * 2.0f);
        x2Var.y0 = v4Var;
        float f10 = N0.x;
        y5 y5Var = this.G0;
        if (f10 == y5Var.getMeasuredWidth() / 2.0f) {
            x2Var.setStickyX(2);
        }
        if (N0.y == y5Var.getMeasuredHeight() / 2.0f) {
            x2Var.setStickyY(2);
        }
        x2Var.setDelegate(this);
        x2Var.setMaxWidth(this.G1 - AndroidUtilities.dp(32.0f));
        int i10 = this.u1;
        x2Var.setTypeface(rg.s0.e(i10).j);
        x2Var.setType(rg.s0.e(i10).h);
        y5Var.addView(x2Var, gb1.g(-2.0f, -2));
        d0();
        MediaController.CropState cropState = this.u0;
        if (cropState != null) {
            x2Var.j(1.0f / cropState.cropScale);
            x2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            y0(x2Var);
            x2Var.q();
            A0(x2Var, false);
            x2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(x2Var.getFocusedView());
            this.z0 = true;
            int i11 = rg.s0.e(i10).g;
            sg.q1 q1Var = this.a1;
            q1Var.d(i11, true);
            q1Var.setOutlineType(rg.s0.e(i10).h);
        }
        return x2Var;
    }

    public final sg.y2 m0(pc pcVar) {
        int i10;
        this.a2 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        y5 y5Var = this.G0;
        float measuredWidth = y5Var.getMeasuredWidth() <= 0 ? this.G1 : y5Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        sg.y2 y2Var = new sg.y2(getContext(), N0, this.u1, pcVar, measuredWidth / 240.0f, dp);
        if (N0.x == y5Var.getMeasuredWidth() / 2.0f) {
            y2Var.setStickyX(2);
        }
        if (N0.y == y5Var.getMeasuredHeight() / 2.0f) {
            y2Var.setStickyY(2);
        }
        rg.q1 q1Var = this.p1;
        if (q1Var != null && (i10 = q1Var.a) != -47814) {
            y2Var.setColor(i10);
        }
        y2Var.setDelegate(this);
        y2Var.setMaxWidth(dp);
        y5Var.addView(y2Var, gb1.g(-2.0f, -2));
        d0();
        MediaController.CropState cropState = this.u0;
        if (cropState != null) {
            y2Var.j(1.0f / cropState.cropScale);
            y2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return y2Var;
    }

    public final void n0() {
        int i10 = 0;
        while (true) {
            y5 y5Var = this.G0;
            if (i10 >= y5Var.getChildCount()) {
                return;
            }
            View childAt = y5Var.getChildAt(i10);
            if (childAt instanceof sg.d2) {
                if (this.y0 == childAt) {
                    A0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(ds.h).withEndAction(new l4(this, (sg.d2) childAt, 1)).start();
            }
            i10++;
        }
    }

    public abstract void o0();

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        fl0 fl0Var = this.O1;
        if (fl0Var != null) {
            AndroidUtilities.removeFromParent(fl0Var);
            this.O1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        this.v0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.r0;
        if (bitmap != null) {
            f7 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f7 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f7)) > currentActionBarHeight2) {
            Math.floor((r3 * f7) / currentActionBarHeight);
        }
        float f10 = this.w0.a;
        sg.j jVar = this.y0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.I0, i10, i11);
        measureChild(this.S0, i10, i11);
        measureChild(this.K0, i10, i11);
        measureChild(this.J0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.i2 - this.B1.getPaddingUnderContainer(), Q()), TLObject.FLAG_30));
        FrameLayout frameLayout = this.H0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.v0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f2 && !this.h2) {
            this.v0 = true;
            t0();
            this.v0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        t0();
    }

    public final sg.g1 p0() {
        int i10 = 0;
        while (true) {
            y5 y5Var = this.G0;
            if (i10 >= y5Var.getChildCount()) {
                return null;
            }
            View childAt = y5Var.getChildAt(i10);
            if (childAt instanceof sg.g1) {
                return (sg.g1) childAt;
            }
            i10++;
        }
    }

    @Override // sg.h
    public final boolean q() {
        return !(this.y0 instanceof sg.g1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap q0(ArrayList arrayList, boolean z10, boolean z11, boolean z12, boolean z13, w7 w7Var) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i10;
        int i11;
        y5 y5Var;
        int i12;
        int i13;
        View view;
        boolean z14;
        boolean z15;
        ImageReceiver imageReceiver;
        byte b10;
        int i14;
        Canvas canvas;
        View view2;
        int i15;
        sg.g1 g1Var;
        bi.j5 j5Var;
        boolean z16;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z17;
        TLRPC.Message message;
        org.telegram.ui.Cells.v0 v0Var;
        bi.j7 j7Var;
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
        sg.x2 x2Var;
        boolean z20;
        e6 e6Var = this;
        u5 u5Var = e6Var.D0;
        int i16 = 0;
        byte b11 = 1;
        y5 y5Var2 = e6Var.G0;
        if (z10) {
            createBitmap = u5Var.c(false, z13);
        } else if (z12) {
            createBitmap = Bitmap.createBitmap(Math.max(1, y5Var2.getMeasuredWidth()), Math.max(1, y5Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z11) {
                bitmap = null;
                e6Var.V0 = BigInteger.ONE;
                i11 = 0;
                for (i10 = 0; i10 < y5Var2.getChildCount(); i10++) {
                    if (y5Var2.getChildAt(i10) instanceof sg.j) {
                        i11++;
                    }
                }
                if (i11 > 0) {
                    int childCount = y5Var2.getChildCount();
                    int i17 = 0;
                    while (i17 < childCount) {
                        View childAt = y5Var2.getChildAt(i17);
                        if (childAt instanceof sg.j) {
                            sg.j jVar = (sg.j) childAt;
                            jVar.getPosition();
                            VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                            if (arrayList != null) {
                                boolean z21 = jVar instanceof sg.x2;
                                int i18 = e6Var.u1;
                                if (z21) {
                                    mediaEntity.type = b11;
                                    sg.x2 x2Var2 = (sg.x2) jVar;
                                    CharSequence text = x2Var2.getText();
                                    if (text instanceof Spanned) {
                                        Spanned spanned = (Spanned) text;
                                        x2Var = x2Var2;
                                        org.telegram.ui.Components.c6[] c6VarArr = (org.telegram.ui.Components.c6[]) spanned.getSpans(i16, text.length(), org.telegram.ui.Components.c6.class);
                                        if (c6VarArr != null) {
                                            int i19 = i16;
                                            while (i19 < c6VarArr.length) {
                                                org.telegram.ui.Components.c6 c6Var = c6VarArr[i19];
                                                org.telegram.ui.Components.c6[] c6VarArr2 = c6VarArr;
                                                TLRPC.Document document = c6Var.document;
                                                int i20 = i19;
                                                y5 y5Var3 = y5Var2;
                                                if (document == null) {
                                                    document = org.telegram.ui.Components.t5.f(i18, c6Var.getDocumentId());
                                                }
                                                if (document != null) {
                                                    org.telegram.ui.Components.t5.h(i18).e(document);
                                                }
                                                VideoEditedInfo.EmojiEntity emojiEntity = new VideoEditedInfo.EmojiEntity();
                                                int i21 = childCount;
                                                int i22 = i17;
                                                emojiEntity.document_id = c6Var.getDocumentId();
                                                emojiEntity.document = document;
                                                emojiEntity.offset = spanned.getSpanStart(c6Var);
                                                emojiEntity.length = spanned.getSpanEnd(c6Var) - emojiEntity.offset;
                                                emojiEntity.documentAbsolutePath = FileLoader.getInstance(i18).getPathToAttach(document, true).getAbsolutePath();
                                                int i23 = 0;
                                                while (document != null) {
                                                    ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                    if (arrayList2 == null || arrayList2.isEmpty() || new File(emojiEntity.documentAbsolutePath).exists()) {
                                                        break;
                                                    }
                                                    FileLoader fileLoader = FileLoader.getInstance(i18);
                                                    TLRPC.PhotoSize photoSize = document.thumbs.get(i23);
                                                    int i24 = i23;
                                                    z20 = true;
                                                    emojiEntity.documentAbsolutePath = fileLoader.getPathToAttach(photoSize, true).getAbsolutePath();
                                                    int i25 = i24 + 1;
                                                    if (i25 >= document.thumbs.size()) {
                                                        break;
                                                    }
                                                    i23 = i25;
                                                }
                                                z20 = true;
                                                boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, z20);
                                                if (isAnimatedStickerDocument || u0(emojiEntity.document)) {
                                                    emojiEntity.subType = (byte) (emojiEntity.subType | (isAnimatedStickerDocument ? (byte) 1 : (byte) 4));
                                                }
                                                if (MessageObject.isTextColorEmoji(emojiEntity.document)) {
                                                    emojiEntity.subType = (byte) (emojiEntity.subType | 8);
                                                }
                                                mediaEntity.entities.add(emojiEntity);
                                                if (document != null) {
                                                    BigInteger valueOf = BigInteger.valueOf(5000L);
                                                    e6Var.V0 = e6Var.V0.multiply(valueOf).divide(e6Var.V0.gcd(valueOf));
                                                }
                                                i19 = i20 + 1;
                                                childCount = i21;
                                                c6VarArr = c6VarArr2;
                                                y5Var2 = y5Var3;
                                                i17 = i22;
                                            }
                                        }
                                    } else {
                                        x2Var = x2Var2;
                                    }
                                    y5Var = y5Var2;
                                    i15 = childCount;
                                    i13 = i17;
                                    mediaEntity.text = text.toString();
                                    mediaEntity.subType = (byte) x2Var.getType();
                                    mediaEntity.color = x2Var.getSwatch().a;
                                    mediaEntity.fontSize = x2Var.getTextSize();
                                    mediaEntity.textTypeface = x2Var.getTypeface();
                                    mediaEntity.textAlign = x2Var.getAlign();
                                } else {
                                    y5Var = y5Var2;
                                    i15 = childCount;
                                    i13 = i17;
                                    if (jVar instanceof sg.q2) {
                                        mediaEntity.type = (byte) 0;
                                        sg.q2 q2Var = (sg.q2) jVar;
                                        qw0 baseSize = q2Var.getBaseSize();
                                        mediaEntity.width = baseSize.a;
                                        mediaEntity.height = baseSize.b;
                                        mediaEntity.document = q2Var.getSticker();
                                        mediaEntity.parentObject = q2Var.getParentObject();
                                        TLRPC.Document sticker = q2Var.getSticker();
                                        mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                        if (MessageObject.isAnimatedStickerDocument(sticker, true) || u0(sticker)) {
                                            boolean isAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                            mediaEntity.subType = (byte) (mediaEntity.subType | (isAnimatedStickerDocument2 ? (byte) 1 : (byte) 4));
                                            r20 = (isAnimatedStickerDocument2 || u0(sticker)) ? q2Var.getDuration() : 5000L;
                                            if (r20 != 0) {
                                                BigInteger valueOf2 = BigInteger.valueOf(r20);
                                                e6Var.V0 = e6Var.V0.multiply(valueOf2).divide(e6Var.V0.gcd(valueOf2));
                                            }
                                        }
                                        if (MessageObject.isTextColorEmoji(sticker)) {
                                            mediaEntity.color = -1;
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                        }
                                        if (q2Var.t0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (jVar instanceof sg.z1) {
                                        sg.z1 z1Var = (sg.z1) jVar;
                                        mediaEntity.type = (byte) 2;
                                        qw0 baseSize2 = z1Var.getBaseSize();
                                        mediaEntity.width = baseSize2.a;
                                        mediaEntity.height = baseSize2.b;
                                        mediaEntity.text = z1Var.q(i18);
                                        mediaEntity.crop = z1Var.G0;
                                        if (z1Var.t0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (jVar instanceof sg.u0) {
                                        sg.u0 u0Var = (sg.u0) jVar;
                                        sg.t0 t0Var = u0Var.q0;
                                        mediaEntity.type = (byte) 3;
                                        mediaEntity.subType = (byte) u0Var.getType();
                                        mediaEntity.width = t0Var.getWidth();
                                        mediaEntity.height = t0Var.getHeight();
                                        mediaEntity.text = t0Var.getText();
                                        mediaEntity.color = u0Var.r0 ? u0Var.getColor() : 0;
                                        mediaEntity.density = t0Var.y;
                                        mediaEntity.media = u0Var.u0;
                                        TL_stories.MediaArea mediaArea2 = u0Var.v0;
                                        mediaEntity.mediaArea = mediaArea2;
                                        mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument = t0Var.getCodeEmojiDocument();
                                        if (codeEmojiDocument != null) {
                                            VideoEditedInfo.EmojiEntity emojiEntity2 = new VideoEditedInfo.EmojiEntity();
                                            emojiEntity2.document_id = codeEmojiDocument.id;
                                            emojiEntity2.document = codeEmojiDocument;
                                            emojiEntity2.documentAbsolutePath = FileLoader.getInstance(i18).getPathToAttach(codeEmojiDocument, true).getAbsolutePath();
                                            boolean isAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                            if (isAnimatedStickerDocument3 || u0(emojiEntity2.document)) {
                                                emojiEntity2.subType = (byte) (emojiEntity2.subType | (isAnimatedStickerDocument3 ? (byte) 1 : (byte) 4));
                                            }
                                            mediaEntity.entities.add(emojiEntity2);
                                        }
                                    } else if (jVar instanceof sg.y2) {
                                        sg.y2 y2Var = (sg.y2) jVar;
                                        sg.t0 t0Var2 = y2Var.q0;
                                        mediaEntity.type = (byte) 8;
                                        mediaEntity.subType = (byte) y2Var.getType();
                                        mediaEntity.width = t0Var2.getWidth();
                                        mediaEntity.height = t0Var2.getHeight();
                                        mediaEntity.text = t0Var2.getText();
                                        mediaEntity.color = y2Var.r0 ? y2Var.getColor() : 0;
                                        mediaEntity.density = t0Var2.y;
                                        mediaEntity.weather = y2Var.u0;
                                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                        tL_mediaAreaWeather.emoji = y2Var.u0.c;
                                        tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                        tL_mediaAreaWeather.color = t0Var2.f.getColor();
                                        mediaEntity.mediaArea = tL_mediaAreaWeather;
                                        tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument2 = t0Var2.getCodeEmojiDocument();
                                        if (codeEmojiDocument2 != null) {
                                            VideoEditedInfo.EmojiEntity emojiEntity3 = new VideoEditedInfo.EmojiEntity();
                                            emojiEntity3.document_id = codeEmojiDocument2.id;
                                            emojiEntity3.document = codeEmojiDocument2;
                                            emojiEntity3.documentAbsolutePath = FileLoader.getInstance(i18).getPathToAttach(codeEmojiDocument2, true).getAbsolutePath();
                                            boolean isAnimatedStickerDocument4 = MessageObject.isAnimatedStickerDocument(emojiEntity3.document, true);
                                            if (isAnimatedStickerDocument4 || u0(emojiEntity3.document)) {
                                                emojiEntity3.subType = (byte) (emojiEntity3.subType | (isAnimatedStickerDocument4 ? (byte) 1 : (byte) 4));
                                            }
                                            mediaEntity.entities.add(emojiEntity3);
                                        }
                                        i12 = i15;
                                        view = childAt;
                                        z16 = false;
                                        z17 = false;
                                        imageReceiver = null;
                                        arrayList.add(mediaEntity);
                                        scaleX = view.getScaleX();
                                        float scaleY = view.getScaleY();
                                        float x9 = view.getX();
                                        float y3 = view.getY();
                                        mediaEntity.viewWidth = view.getWidth();
                                        mediaEntity.viewHeight = view.getHeight();
                                        mediaEntity.width = (view.getWidth() * scaleX) / y5Var.getMeasuredWidth();
                                        mediaEntity.height = (view.getHeight() * scaleY) / y5Var.getMeasuredHeight();
                                        mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x9) / y5Var.getMeasuredWidth();
                                        mediaEntity.y = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y3) / y5Var.getMeasuredHeight();
                                        mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                        mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x9) / y5Var.getMeasuredWidth();
                                        mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y3) / y5Var.getMeasuredHeight();
                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / y5Var.getMeasuredWidth();
                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / y5Var.getMeasuredHeight();
                                        mediaEntity.scale = scaleX;
                                        if (jVar instanceof sg.g1) {
                                            z18 = z16;
                                            if (jVar instanceof sg.q2) {
                                                float imageAspectRatio = ((sg.q2) jVar).x0.getImageAspectRatio();
                                                float f7 = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                                float f10 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                                float measuredWidth = y5Var.getMeasuredWidth() / y5Var.getMeasuredHeight();
                                                if (imageAspectRatio > 1.0f) {
                                                    float f11 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                    mediaEntity.height = f11;
                                                    mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                    mediaEntity.y = f10 - (f11 / 2.0f);
                                                } else if (imageAspectRatio < 1.0f) {
                                                    float f12 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                    mediaEntity.width = f12;
                                                    mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                    mediaEntity.x = f7 - (f12 / 2.0f);
                                                }
                                            } else {
                                                TL_stories.MediaArea mediaArea3 = mediaEntity.mediaArea;
                                                if (mediaArea3 != null && (((z19 = jVar instanceof sg.u0)) || (jVar instanceof sg.y2) || (jVar instanceof sg.r0) || (jVar instanceof sg.c2))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                    float f13 = mediaEntity.x;
                                                    float f14 = mediaEntity.width;
                                                    mediaAreaCoordinates2.x = ((f14 / 2.0f) + f13) * 100.0f;
                                                    mediaAreaCoordinates2.y = ((mediaEntity.height / 2.0f) + mediaEntity.y) * 100.0f;
                                                    if (z19) {
                                                        sg.t0 t0Var3 = ((sg.u0) jVar).q0;
                                                        mediaAreaCoordinates2.w = vh.y(t0Var3.I * 2 * scaleX, y5Var.getMeasuredWidth(), f14, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = vh.y(t0Var3.J * 2 * scaleY, y5Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof sg.y2) {
                                                        sg.t0 t0Var4 = ((sg.y2) jVar).q0;
                                                        mediaAreaCoordinates2.w = vh.y(t0Var4.I * 2 * scaleX, y5Var.getMeasuredWidth(), f14, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = vh.y(t0Var4.J * 2 * scaleY, y5Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof sg.r0) {
                                                        sg.p0 p0Var = ((sg.r0) jVar).q0;
                                                        mediaAreaCoordinates2.w = vh.y(p0Var.f * 2 * scaleX, y5Var.getMeasuredWidth(), f14, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = vh.y(p0Var.h * 2 * scaleY, y5Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof sg.c2) {
                                                        sg.c2 c2Var = (sg.c2) jVar;
                                                        float padding = ((c2Var.getPadding() * 2) * scaleX) / y5Var.getMeasuredWidth();
                                                        float padding2 = ((c2Var.getPadding() * 2) * scaleX) / y5Var.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = mediaEntity.mediaArea.coordinates;
                                                        mediaAreaCoordinates3.w = (mediaEntity.width - padding) * 100.0f;
                                                        mediaAreaCoordinates3.h = (mediaEntity.height - padding2) * 100.0f;
                                                    }
                                                    mediaEntity.mediaArea.coordinates.rotation = ((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d;
                                                    if (z19) {
                                                        radius = ((sg.u0) jVar).q0.getRadius();
                                                    } else if (jVar instanceof sg.y2) {
                                                        radius = ((sg.y2) jVar).q0.getRadius();
                                                    } else if (jVar instanceof sg.r0) {
                                                        radius = ((sg.r0) jVar).q0.getRadius();
                                                    }
                                                    d = radius;
                                                }
                                            }
                                            d = -1.0d;
                                        } else {
                                            sg.g1 g1Var2 = (sg.g1) jVar;
                                            sg.y0 y0Var = g1Var2.r0;
                                            bi.j5 j5Var2 = g1Var2.q0;
                                            RectF rectF = AndroidUtilities.rectTmp;
                                            z18 = z16;
                                            double r6 = g1Var2.r(rectF);
                                            rectF.offset(j5Var2.getX(), j5Var2.getY());
                                            rectF.offset(y0Var.getX(), y0Var.getY());
                                            mediaEntity.mediaArea.coordinates.x = (((rectF.centerX() * scaleX) + vh.w(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x9)) / y5Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.y = (((rectF.centerY() * scaleY) + vh.w(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y3)) / y5Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.w = ((rectF.width() * scaleX) / y5Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.h = ((rectF.height() * scaleY) / y5Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.rotation = ((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d;
                                            d = r6;
                                        }
                                        mediaArea = mediaEntity.mediaArea;
                                        if (mediaArea != null && (mediaAreaCoordinates = mediaArea.coordinates) != null && d > 0.0d) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                        }
                                        z14 = z17;
                                        z15 = z18;
                                    } else {
                                        if (jVar instanceof sg.r0) {
                                            sg.r0 r0Var = (sg.r0) jVar;
                                            sg.p0 p0Var2 = r0Var.q0;
                                            mediaEntity.type = (byte) 7;
                                            if (p0Var2.e()) {
                                                mediaEntity.subType = (byte) p0Var2.getPreviewType();
                                            } else {
                                                mediaEntity.subType = (byte) r0Var.getType();
                                            }
                                            mediaEntity.width = p0Var2.getWidth();
                                            mediaEntity.height = p0Var2.getHeight();
                                            mediaEntity.color = r0Var.t0 ? r0Var.getColor() : 0;
                                            mediaEntity.density = p0Var2.e;
                                            mediaEntity.linkSettings = r0Var.u0;
                                            boolean z22 = p0Var2.R;
                                            if (z22) {
                                                ImageReceiver imageReceiver5 = p0Var2.T;
                                                if (z22 && imageReceiver5.hasImageLoaded() && imageReceiver5.getBitmap() != null) {
                                                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(imageReceiver5.getBitmap()), imageReceiver5.getImageKey(), false);
                                                }
                                                sg.o0 o0Var = mediaEntity.linkSettings;
                                                o0Var.a |= 4;
                                                o0Var.i = p0Var2.getPhotoSide();
                                            }
                                            TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                            mediaEntity.mediaArea = tL_mediaAreaUrl;
                                            sg.o0 o0Var2 = r0Var.u0;
                                            if (o0Var2 != null) {
                                                TLRPC.WebPage webPage = o0Var2.d;
                                                tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? r0Var.u0.c : r0Var.u0.d.url;
                                                mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                        } else {
                                            if (jVar instanceof sg.c2) {
                                                sg.c2 c2Var2 = (sg.c2) jVar;
                                                mediaEntity.type = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction;
                                                bh.x0 currentReaction = c2Var2.getCurrentReaction();
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
                                                mediaArea4.dark = c2Var2.r0.a == 1;
                                                mediaArea4.flipped = c2Var2.y0;
                                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            } else if (jVar instanceof sg.d2) {
                                                sg.d2 d2Var = (sg.d2) jVar;
                                                qw0 baseSize3 = d2Var.getBaseSize();
                                                mediaEntity.width = baseSize3.a;
                                                mediaEntity.height = baseSize3.b;
                                                mediaEntity.type = (byte) 5;
                                                if (w7Var != null) {
                                                    mediaEntity.text = w7Var.o0.getAbsolutePath();
                                                    mediaEntity.roundOffset = w7Var.r0;
                                                    long j10 = w7Var.q0;
                                                    mediaEntity.roundDuration = j10;
                                                    float f15 = j10;
                                                    mediaEntity.roundLeft = (long) (w7Var.s0 * f15);
                                                    mediaEntity.roundRight = (long) (w7Var.t0 * f15);
                                                }
                                                mediaEntity.subType = (byte) 4;
                                                if (d2Var.r0) {
                                                    mediaEntity.subType = (byte) (4 | 2);
                                                }
                                            } else if (jVar instanceof sg.g1) {
                                                sg.g1 g1Var3 = (sg.g1) jVar;
                                                bi.j5 j5Var3 = g1Var3.q0;
                                                ArrayList arrayList3 = g1Var3.s0;
                                                sg.y0 y0Var2 = g1Var3.r0;
                                                mediaEntity.type = (byte) 6;
                                                int width = g1Var3.getWidth();
                                                mediaEntity.viewWidth = width;
                                                mediaEntity.width = width;
                                                int height = g1Var3.getHeight();
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
                                                        int i26 = 0;
                                                        while (true) {
                                                            if (i26 >= y0Var2.getChildCount()) {
                                                                v0Var = null;
                                                                break;
                                                            }
                                                            View childAt2 = y0Var2.getChildAt(i26);
                                                            if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                                                                v0Var = (org.telegram.ui.Cells.v0) childAt2;
                                                                break;
                                                            }
                                                            i26++;
                                                        }
                                                        if (v0Var == null || (j7Var = v0Var.H0) == null || (imageReceiver3 = j7Var.d) == null) {
                                                            g1Var = g1Var3;
                                                            i12 = i15;
                                                            j5Var = j5Var3;
                                                            view = childAt;
                                                            imageReceiver = null;
                                                            if (z12) {
                                                                if (w7Var != null) {
                                                                    Matrix matrix = w7Var.n0;
                                                                    if (w7Var.K) {
                                                                        matrix.reset();
                                                                        if (y0Var2.getChildCount() == 1) {
                                                                            view3 = y0Var2.getChildAt(0);
                                                                            if (view3 instanceof org.telegram.ui.Cells.s1) {
                                                                                imageReceiver2 = ((org.telegram.ui.Cells.s1) view3).getPhotoImage();
                                                                                if (imageReceiver2 != null) {
                                                                                    float max = Math.max(imageReceiver2.getImageWidth() / Math.max(1, w7Var.k0), imageReceiver2.getImageHeight() / Math.max(1, w7Var.l0));
                                                                                    matrix.postScale(max, max);
                                                                                    matrix.postTranslate(imageReceiver2.getCenterX() - ((w7Var.k0 * max) / 2.0f), imageReceiver2.getCenterY() - ((w7Var.l0 * max) / 2.0f));
                                                                                    matrix.postTranslate(j5Var.getX(), j5Var.getY());
                                                                                    matrix.postTranslate(y0Var2.getX(), y0Var2.getY());
                                                                                    matrix.postTranslate(view3.getX(), view3.getY());
                                                                                    matrix.postScale(g1Var.getScaleX(), g1Var.getScaleY(), g1Var.getPivotX(), g1Var.getPivotY());
                                                                                    matrix.postRotate(g1Var.getRotation(), g1Var.getPivotX(), g1Var.getPivotY());
                                                                                    matrix.postTranslate(g1Var.getX(), g1Var.getY());
                                                                                    matrix.postScale(1.0f / y5Var.getWidth(), 1.0f / y5Var.getHeight());
                                                                                    matrix.postScale(w7Var.i0, w7Var.j0);
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
                                                            float x92 = view.getX();
                                                            float y32 = view.getY();
                                                            mediaEntity.viewWidth = view.getWidth();
                                                            mediaEntity.viewHeight = view.getHeight();
                                                            mediaEntity.width = (view.getWidth() * scaleX) / y5Var.getMeasuredWidth();
                                                            mediaEntity.height = (view.getHeight() * scaleY2) / y5Var.getMeasuredHeight();
                                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x92) / y5Var.getMeasuredWidth();
                                                            mediaEntity.y = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y32) / y5Var.getMeasuredHeight();
                                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x92) / y5Var.getMeasuredWidth();
                                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y32) / y5Var.getMeasuredHeight();
                                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / y5Var.getMeasuredWidth();
                                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / y5Var.getMeasuredHeight();
                                                            mediaEntity.scale = scaleX;
                                                            if (jVar instanceof sg.g1) {
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
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) bi.ca.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                            if (stargiftattributemodel != null) {
                                                                float dp = AndroidUtilities.dp(110.0f);
                                                                g1Var = g1Var3;
                                                                float centerX = imageReceiver3.getCenterX() + v0Var.getX() + y0Var2.getX() + v0Var.F0;
                                                                float centerY = imageReceiver3.getCenterY() + v0Var.getY() + y0Var2.getY() + v0Var.G0;
                                                                VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                                                                imageReceiver4 = imageReceiver3;
                                                                mediaEntity2.type = (byte) 0;
                                                                mediaEntity2.width = dp;
                                                                mediaEntity2.height = dp;
                                                                TLRPC.Document document2 = stargiftattributemodel.document;
                                                                mediaEntity2.document = document2;
                                                                mediaEntity2.parentObject = starGift;
                                                                mediaEntity2.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true).getAbsolutePath();
                                                                if (MessageObject.isAnimatedStickerDocument(document2, true) || u0(document2)) {
                                                                    boolean isAnimatedStickerDocument5 = MessageObject.isAnimatedStickerDocument(document2, true);
                                                                    mediaEntity2.subType = (byte) (mediaEntity2.subType | (isAnimatedStickerDocument5 ? (byte) 1 : (byte) 4));
                                                                    xj0 lottieAnimation = imageReceiver4.getLottieAnimation();
                                                                    if (lottieAnimation != null && (isAnimatedStickerDocument5 || u0(document2))) {
                                                                        r20 = lottieAnimation.r();
                                                                    }
                                                                    if (r20 != 0) {
                                                                        BigInteger valueOf3 = BigInteger.valueOf(r20);
                                                                        e6Var.V0 = e6Var.V0.multiply(valueOf3).divide(e6Var.V0.gcd(valueOf3));
                                                                    }
                                                                }
                                                                float scaleX2 = childAt.getScaleX();
                                                                float scaleY3 = childAt.getScaleY();
                                                                float x10 = childAt.getX();
                                                                float y10 = childAt.getY();
                                                                int i27 = (int) dp;
                                                                mediaEntity2.viewWidth = i27;
                                                                mediaEntity2.viewHeight = i27;
                                                                mediaEntity2.width = (dp * scaleX2) / y5Var.getMeasuredWidth();
                                                                mediaEntity2.height = (dp * scaleY3) / y5Var.getMeasuredHeight();
                                                                mediaEntity2.x = (childAt.getWidth() / 2.0f) + x10;
                                                                mediaEntity2.y = (childAt.getHeight() / 2.0f) + y10;
                                                                i12 = i15;
                                                                float w10 = vh.w(childAt.getWidth(), 2.0f, scaleX2, centerX * scaleX2);
                                                                float w11 = vh.w(childAt.getHeight(), 2.0f, scaleY3, centerY * scaleY3);
                                                                j5Var = j5Var3;
                                                                view = childAt;
                                                                double d10 = mediaEntity2.x;
                                                                double d11 = w10;
                                                                double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                double cos = Math.cos(rotation) * d11;
                                                                double d12 = w11;
                                                                mediaEntity2.x = (float) ((cos - (Math.sin(rotation) * d12)) + d10);
                                                                float cos2 = (float) ((Math.cos(rotation) * d12) + (Math.sin(rotation) * d11) + mediaEntity2.y);
                                                                float f16 = (-dp) / 2.0f;
                                                                float f17 = (f16 * scaleX2) + mediaEntity2.x;
                                                                mediaEntity2.x = f17;
                                                                mediaEntity2.y = (f16 * scaleY3) + cos2;
                                                                mediaEntity2.x = f17 / y5Var.getMeasuredWidth();
                                                                mediaEntity2.y /= y5Var.getMeasuredHeight();
                                                                mediaEntity2.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                mediaEntity2.scale = scaleX2;
                                                                arrayList.add(mediaEntity2);
                                                            } else {
                                                                g1Var = g1Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                i12 = i15;
                                                                j5Var = j5Var3;
                                                                view = childAt;
                                                            }
                                                            imageReceiver = imageReceiver4;
                                                            if (z12) {
                                                            }
                                                            z17 = true;
                                                            arrayList.add(mediaEntity);
                                                            scaleX = view.getScaleX();
                                                            float scaleY22 = view.getScaleY();
                                                            float x922 = view.getX();
                                                            float y322 = view.getY();
                                                            mediaEntity.viewWidth = view.getWidth();
                                                            mediaEntity.viewHeight = view.getHeight();
                                                            mediaEntity.width = (view.getWidth() * scaleX) / y5Var.getMeasuredWidth();
                                                            mediaEntity.height = (view.getHeight() * scaleY22) / y5Var.getMeasuredHeight();
                                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x922) / y5Var.getMeasuredWidth();
                                                            mediaEntity.y = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y322) / y5Var.getMeasuredHeight();
                                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x922) / y5Var.getMeasuredWidth();
                                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y322) / y5Var.getMeasuredHeight();
                                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / y5Var.getMeasuredWidth();
                                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / y5Var.getMeasuredHeight();
                                                            mediaEntity.scale = scaleX;
                                                            if (jVar instanceof sg.g1) {
                                                            }
                                                            mediaArea = mediaEntity.mediaArea;
                                                            if (mediaArea != null) {
                                                            }
                                                            z14 = z17;
                                                            z15 = z18;
                                                        }
                                                    }
                                                }
                                                g1Var = g1Var3;
                                                i12 = i15;
                                                j5Var = j5Var3;
                                                view = childAt;
                                                if (messageObject != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost;
                                                    tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(i18).getInputChannel(-w7.p(messageObject));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                    Boolean D = w7.D(messageObject);
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
                                                float x9222 = view.getX();
                                                float y3222 = view.getY();
                                                mediaEntity.viewWidth = view.getWidth();
                                                mediaEntity.viewHeight = view.getHeight();
                                                mediaEntity.width = (view.getWidth() * scaleX) / y5Var.getMeasuredWidth();
                                                mediaEntity.height = (view.getHeight() * scaleY222) / y5Var.getMeasuredHeight();
                                                mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x9222) / y5Var.getMeasuredWidth();
                                                mediaEntity.y = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y3222) / y5Var.getMeasuredHeight();
                                                mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x9222) / y5Var.getMeasuredWidth();
                                                mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y3222) / y5Var.getMeasuredHeight();
                                                mediaEntity.textViewWidth = mediaEntity.viewWidth / y5Var.getMeasuredWidth();
                                                mediaEntity.textViewHeight = mediaEntity.viewHeight / y5Var.getMeasuredHeight();
                                                mediaEntity.scale = scaleX;
                                                if (jVar instanceof sg.g1) {
                                                }
                                                mediaArea = mediaEntity.mediaArea;
                                                if (mediaArea != null) {
                                                }
                                                z14 = z17;
                                                z15 = z18;
                                            }
                                            i12 = i15;
                                            view = childAt;
                                            z16 = true;
                                            z17 = true;
                                            imageReceiver = null;
                                            arrayList.add(mediaEntity);
                                            scaleX = view.getScaleX();
                                            float scaleY2222 = view.getScaleY();
                                            float x92222 = view.getX();
                                            float y32222 = view.getY();
                                            mediaEntity.viewWidth = view.getWidth();
                                            mediaEntity.viewHeight = view.getHeight();
                                            mediaEntity.width = (view.getWidth() * scaleX) / y5Var.getMeasuredWidth();
                                            mediaEntity.height = (view.getHeight() * scaleY2222) / y5Var.getMeasuredHeight();
                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x92222) / y5Var.getMeasuredWidth();
                                            mediaEntity.y = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y32222) / y5Var.getMeasuredHeight();
                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x92222) / y5Var.getMeasuredWidth();
                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y32222) / y5Var.getMeasuredHeight();
                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / y5Var.getMeasuredWidth();
                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / y5Var.getMeasuredHeight();
                                            mediaEntity.scale = scaleX;
                                            if (jVar instanceof sg.g1) {
                                            }
                                            mediaArea = mediaEntity.mediaArea;
                                            if (mediaArea != null) {
                                            }
                                            z14 = z17;
                                            z15 = z18;
                                        }
                                        i12 = i15;
                                        b10 = 1;
                                        i14 = 0;
                                    }
                                }
                                i12 = i15;
                                view = childAt;
                                z16 = false;
                                z17 = true;
                                imageReceiver = null;
                                arrayList.add(mediaEntity);
                                scaleX = view.getScaleX();
                                float scaleY22222 = view.getScaleY();
                                float x922222 = view.getX();
                                float y322222 = view.getY();
                                mediaEntity.viewWidth = view.getWidth();
                                mediaEntity.viewHeight = view.getHeight();
                                mediaEntity.width = (view.getWidth() * scaleX) / y5Var.getMeasuredWidth();
                                mediaEntity.height = (view.getHeight() * scaleY22222) / y5Var.getMeasuredHeight();
                                mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x922222) / y5Var.getMeasuredWidth();
                                mediaEntity.y = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y322222) / y5Var.getMeasuredHeight();
                                mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x922222) / y5Var.getMeasuredWidth();
                                mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y322222) / y5Var.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / y5Var.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / y5Var.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (jVar instanceof sg.g1) {
                                }
                                mediaArea = mediaEntity.mediaArea;
                                if (mediaArea != null) {
                                }
                                z14 = z17;
                                z15 = z18;
                            } else {
                                y5Var = y5Var2;
                                i12 = childCount;
                                i13 = i17;
                                view = childAt;
                                z14 = true;
                                z15 = false;
                                imageReceiver = null;
                            }
                            if (z14 && ((z11 || (z12 && mediaEntity.type == 6)) && bitmap != null)) {
                                Canvas canvas2 = new Canvas(bitmap);
                                float width2 = bitmap.getWidth() / y5Var.getMeasuredWidth();
                                int i28 = 0;
                                while (i28 < 2) {
                                    Canvas canvas3 = i28 == 0 ? canvas2 : null;
                                    if (canvas3 == null || (i28 == 0 && z15)) {
                                        canvas = canvas2;
                                        view2 = view;
                                    } else {
                                        canvas3.save();
                                        canvas3.scale(width2, width2);
                                        canvas3.translate(mediaEntity.x * y5Var.getMeasuredWidth(), mediaEntity.y * y5Var.getMeasuredHeight());
                                        canvas3.scale(view.getScaleX(), view.getScaleY());
                                        canvas3.rotate(view.getRotation(), ((mediaEntity.width / 2.0f) / view.getScaleX()) * y5Var.getMeasuredWidth(), ((mediaEntity.height / 2.0f) / view.getScaleY()) * y5Var.getMeasuredHeight());
                                        view2 = view;
                                        if (!(view2 instanceof sg.x2) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                            canvas = canvas2;
                                            if (view2 instanceof sg.g1) {
                                                sg.g1 g1Var4 = (sg.g1) view2;
                                                sg.y0 y0Var3 = g1Var4.r0;
                                                boolean z23 = true;
                                                g1Var4.u0 = true;
                                                int i29 = 0;
                                                while (i29 < y0Var3.getChildCount()) {
                                                    View childAt3 = y0Var3.getChildAt(i29);
                                                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                                                        ((org.telegram.ui.Cells.s1) childAt3).qe = z23;
                                                    }
                                                    i29++;
                                                    z23 = true;
                                                }
                                                view2.draw(canvas3);
                                                boolean z24 = false;
                                                g1Var4.u0 = false;
                                                int i30 = 0;
                                                while (i30 < y0Var3.getChildCount()) {
                                                    View childAt4 = y0Var3.getChildAt(i30);
                                                    if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                                        ((org.telegram.ui.Cells.s1) childAt4).qe = z24;
                                                    }
                                                    i30++;
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
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            createBitmap2.recycle();
                                        }
                                        canvas3.restore();
                                    }
                                    i28++;
                                    view = view2;
                                    canvas2 = canvas;
                                }
                                if (imageReceiver != null) {
                                    b10 = 1;
                                    i14 = 0;
                                    imageReceiver.setVisible(true, false);
                                }
                            }
                            b10 = 1;
                            i14 = 0;
                        } else {
                            i14 = i16;
                            y5Var = y5Var2;
                            i12 = childCount;
                            i13 = i17;
                            b10 = b11;
                        }
                        i17 = i13 + 1;
                        e6Var = this;
                        b11 = b10;
                        i16 = i14;
                        childCount = i12;
                        y5Var2 = y5Var;
                    }
                }
                return bitmap;
            }
            Bitmap c10 = u5Var.c(false, false);
            createBitmap = c10 != null ? Bitmap.createBitmap(c10.getWidth(), c10.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        e6Var.V0 = BigInteger.ONE;
        i11 = 0;
        while (i10 < y5Var2.getChildCount()) {
        }
        if (i11 > 0) {
        }
        return bitmap;
    }

    @Override // sg.h
    public final boolean r() {
        return !this.z0;
    }

    public final boolean r0() {
        return this.s0.a() || this.a2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.v0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(boolean z10) {
        int i10 = 0;
        if (this.f2) {
            G0(0);
        }
        if (z10) {
            sz szVar = this.e2;
            if (szVar == null || szVar.getVisibility() != 0) {
                t0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.e2.getMeasuredHeight());
            ofFloat.addUpdateListener(new q4(this, i10));
            this.h2 = true;
            ofFloat.addListener(new k5(this, 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
            ofFloat.start();
        }
    }

    public void setBlurManager(org.telegram.ui.Components.la laVar) {
        this.T1 = laVar;
    }

    public void setCoverPreview(boolean z10) {
        if (this.b2 != z10) {
            this.b2 = z10;
            if (z10) {
                A0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j10) {
        int i10 = 0;
        while (true) {
            y5 y5Var = this.G0;
            if (i10 >= y5Var.getChildCount()) {
                return;
            }
            View childAt = y5Var.getChildAt(i10);
            if (childAt instanceof sg.q2) {
                ImageReceiver imageReceiver = ((sg.q2) childAt).x0;
                xj0 lottieAnimation = imageReceiver.getLottieAnimation();
                imageReceiver.getAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.N(Math.round(((j10 % lottieAnimation.r()) / lottieAnimation.r()) * lottieAnimation.e[0]), true, false);
                }
            }
            i10++;
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.N1) {
            this.N1 = z10;
            d0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.A1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.z1 = runnable;
    }

    public final void t0() {
        sz szVar;
        if (!this.f2 && (szVar = this.e2) != null && szVar.getVisibility() != 8) {
            this.e2.setVisibility(8);
        }
        int i10 = this.i2;
        this.i2 = 0;
        if (i10 != 0) {
            this.D1.a();
        }
    }

    @Override // sg.o1
    public final void u() {
        if (!this.g2 && !this.f2) {
            this.a2 = true;
            l0(true);
            return;
        }
        if (this.f2) {
            sg.j jVar = this.y0;
            if (jVar instanceof sg.x2) {
                this.D1.e = true;
                AndroidUtilities.showKeyboard(((sg.x2) jVar).getEditText());
            }
        }
        G0(!this.f2 ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.vw0, org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        this.t1.setColor(-15132391);
    }

    @Override // sg.h
    public final void v(float f7, float f10, float[] fArr) {
        View view;
        View view2 = (View) this.D0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x9 = (f7 - view2.getX()) - view.getLeft();
        float y3 = (f10 - view2.getY()) - view.getTop();
        float pivotX = ((x9 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = ((y3 - view2.getPivotY()) / view2.getScaleY()) + view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = pivotY;
    }

    public final boolean v0() {
        if (this.R1) {
            if (this.O1.getReactionsWindow() == null || this.O1.getReactionsWindow().q) {
                L0(false);
                return true;
            }
            this.O1.e();
            return true;
        }
        if (this.q1) {
            F0(false);
            return true;
        }
        if (this.f2) {
            s0(true);
            return true;
        }
        if (!this.z0) {
            return false;
        }
        if (!this.B0) {
            A0(null, true);
            return true;
        }
        this.B0 = false;
        this.D1.b(true);
        return false;
    }

    @Override // sg.s1
    public final rg.s0 w() {
        return rg.s0.e(this.u1);
    }

    public abstract void w0(boolean z10);

    public final void x0() {
        final int i10 = this.N0;
        O0(1);
        postDelayed(new ag.c(this, 15), 350L);
        n5 n5Var = new n5(this, getContext(), this.v1, i10);
        this.Z1 = n5Var;
        rb rbVar = this.B1;
        Objects.requireNonNull(rbVar);
        n5Var.x = new ai.e(rbVar, 20);
        final boolean[] zArr = {true};
        n5Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: fi.c5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                e6 e6Var = e6.this;
                e6Var.Z1 = null;
                if (zArr[0]) {
                    e6Var.w0(false);
                }
                e6Var.O0(i10);
            }
        });
        n5Var.E = new x4(this);
        n5Var.s0(new d5(this, zArr, n5Var, 0));
        n5Var.show();
        w0(true);
    }

    public final void y0(sg.j jVar) {
        this.s0.b(jVar.getUUID(), new u4(this, jVar, 0));
    }

    @Override // sg.s1
    public final void z() {
        K0(new v4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void z0(sg.j jVar) {
        sg.j jVar2 = this.y0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            A0(null, true);
            if (jVar instanceof sg.x2) {
                ValueAnimator valueAnimator = this.Q0;
                if (valueAnimator != null && this.O0 != 0) {
                    valueAnimator.cancel();
                }
                O0(0);
            }
        }
        this.G0.removeView(jVar);
        d0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            rg.t1 t1Var = this.s0;
            t1Var.b.remove(uuid);
            t1Var.c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var, 12));
        }
        sg.y1 y1Var = this.S0;
        a4.l lVar = this.T0;
        y1Var.setValueOverride(lVar);
        y1Var.setShowPreview(true);
        float f7 = lVar.get();
        rg.q1 q1Var = this.p1;
        q1Var.c = f7;
        B0(q1Var, null, false);
        if (this.c2 || !(jVar instanceof sg.d2)) {
            return;
        }
        sb sbVar = ((ta) this).p2;
        gb gbVar = sbVar.X0;
        if (gbVar != null) {
            gbVar.s(null, null, true);
        }
        ta taVar = sbVar.v1;
        if (taVar != null) {
            taVar.n0();
        }
        ib ibVar = sbVar.c1;
        if (ibVar != null) {
            ibVar.setHasRoundVideo(false);
        }
        w7 w7Var = sbVar.K1;
        if (w7Var != null) {
            File file = w7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                sbVar.K1.o0 = null;
            }
            if (sbVar.K1.p0 != null) {
                try {
                    new File(sbVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                sbVar.K1.p0 = null;
            }
        }
    }

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f7) {
    }

    public View getView() {
        return this;
    }
}

// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hh9 extends FrameLayout implements vlb {
    public final LinearLayout E;
    public final ImageView F;
    public final vi3 G;
    public final qmb H;
    public final FrameLayout I;
    public final s09 J;
    public final LinearLayout K;
    public int L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final LinearLayout O;
    public final ff9 P;
    public final ff9 Q;
    public final ff9 R;
    public final ff9 S;
    public final ff9 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public final l82 a;
    public boolean a0;
    public final ylb b;
    public int b0;
    public final View c;
    public int c0;
    public final View d;
    public boolean d0;
    public final FrameLayout e;
    public final GradientDrawable e0;
    public final ImageView f;
    public final GradientDrawable f0;
    public final ArrayList g0;
    public final LinearLayout h;
    public final ArrayList h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public int l0;
    public boolean m0;
    public final ImageView n;
    public int n0;
    public boolean o0;
    public final ImageView r;
    public final FrameLayout s;
    public final FrameLayout w;
    public final LinearLayout x;
    public final d02 y;

    public hh9(Context context, final l82 l82Var) {
        super(context);
        this.L = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.U = new ArrayList();
        this.V = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        this.b0 = -1;
        this.c0 = 0;
        this.g0 = new ArrayList();
        this.h0 = new ArrayList();
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.a = l82Var;
        ylb ylbVar = l82Var.a.a;
        this.b = ylbVar;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = cmb.c6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{cmb.v0(i, ylbVar), cmb.p1(0.0f, cmb.v0(i, ylbVar))});
        this.e0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, qoe.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{cmb.p1(0.0f, cmb.v0(i, ylbVar)), cmb.v0(i, ylbVar)});
        this.f0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, qoe.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, qoe.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i2 = cmb.Ol;
        int v0 = cmb.v0(i2, ylbVar);
        int v02 = cmb.v0(i2, ylbVar);
        int i3 = cmb.h6;
        Drawable Z = cmb.Z(v0, cmb.v(v02, cmb.v0(i3, ylbVar)), gm.L(22.0f), gm.L(22.0f));
        f(imageView, i2, Z);
        imageView.setBackground(new if9(Z));
        int i4 = cmb.F6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView, i4, ylbVar, mode);
        rve.a(imageView);
        imageView.setContentDescription(jb6.M0(2131754878, null));
        imageView.setOnClickListener(new x10(l82Var, (byte) 14));
        frameLayout.addView(imageView, qoe.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        Drawable b0 = cmb.b0(gm.L(22.0f), cmb.v0(i2, ylbVar));
        f(linearLayout, i2, b0);
        linearLayout.setBackground(new if9(b0));
        frameLayout.addView(linearLayout, qoe.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        fg0 f0 = cmb.f0(cmb.v0(i3, ylbVar), 1, -1);
        wmb M = anb.M(i3);
        imageView2.setBackground(f0);
        anb.j(imageView2, f0, null, M, ylbVar);
        anb.s(imageView2, i4, ylbVar, mode);
        rve.a(imageView2);
        imageView2.setContentDescription("Undo");
        final byte b = 7;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: dh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b2 = b;
                l82 l82Var2 = l82Var;
                switch (b2) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        break;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        break;
                    case 2:
                        l82Var2.a.r.a4();
                        break;
                    case 3:
                        l82Var2.a.r.X3();
                        break;
                    case 4:
                        l82Var2.a.r.b4();
                        break;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        break;
                    case 10:
                        l82Var2.a.Y();
                        break;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView2, qoe.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        fg0 f02 = cmb.f0(cmb.v0(i3, ylbVar), 1, -1);
        wmb M2 = anb.M(i3);
        imageView3.setBackground(f02);
        anb.j(imageView3, f02, null, M2, ylbVar);
        anb.s(imageView3, i4, ylbVar, mode);
        rve.a(imageView3);
        imageView3.setContentDescription("Redo");
        final byte b2 = 8;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: dh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b2;
                l82 l82Var2 = l82Var;
                switch (b22) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        break;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        break;
                    case 2:
                        l82Var2.a.r.a4();
                        break;
                    case 3:
                        l82Var2.a.r.X3();
                        break;
                    case 4:
                        l82Var2.a.r.b4();
                        break;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        break;
                    case 10:
                        l82Var2.a.Y();
                        break;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView3, qoe.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, qoe.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, qoe.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        frameLayout3.addView(linearLayout2, qoe.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new hd(context));
        imageView4.setScaleType(scaleType);
        anb.s(imageView4, i4, ylbVar, mode);
        Drawable Z2 = cmb.Z(cmb.v0(i2, ylbVar), cmb.v(cmb.v0(i2, ylbVar), cmb.v0(i3, ylbVar)), gm.L(22.0f), gm.L(22.0f));
        f(imageView4, i2, Z2);
        imageView4.setBackground(new if9(Z2));
        linearLayout2.addView(imageView4, qoe.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        rve.a(imageView4);
        imageView4.setContentDescription("AI");
        final byte b3 = 9;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: dh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b3;
                l82 l82Var2 = l82Var;
                switch (b22) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        break;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        break;
                    case 2:
                        l82Var2.a.r.a4();
                        break;
                    case 3:
                        l82Var2.a.r.X3();
                        break;
                    case 4:
                        l82Var2.a.r.b4();
                        break;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        break;
                    case 10:
                        l82Var2.a.Y();
                        break;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        break;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        Drawable b02 = cmb.b0(gm.L(22.0f), cmb.v0(i, ylbVar));
        f(frameLayout5, i, b02);
        frameLayout5.setBackground(new if9(b02));
        frameLayout4.addView(frameLayout5, qoe.e(-2, 44, 81));
        df9 df9Var = new df9(context, (byte) 1);
        df9Var.setClipToOutline(true);
        df9Var.setOutlineProvider(new xj((byte) 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        df9Var.addView(linearLayout3);
        frameLayout5.addView(df9Var, qoe.c(-1.0f, -1));
        d02 d02Var = new d02(context, 24);
        this.y = d02Var;
        d02Var.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
        anb.s(d02Var, i4, ylbVar, mode);
        fg0 Z3 = cmb.Z(cmb.v0(i, ylbVar), cmb.v0(i3, ylbVar), gm.L(20.0f), gm.L(20.0f));
        wmb M3 = anb.M(i);
        wmb M4 = anb.M(i3);
        d02Var.setBackground(Z3);
        anb.j(d02Var, Z3, M3, M4, ylbVar);
        d02Var.j(b02.e, false);
        linearLayout3.addView(d02Var, qoe.r(38, 38, 16));
        rve.a(d02Var);
        d02Var.setContentDescription("Emoji");
        final byte b4 = 10;
        d02Var.setOnClickListener(new View.OnClickListener() { // from class: dh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b4;
                l82 l82Var2 = l82Var;
                switch (b22) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        break;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        break;
                    case 2:
                        l82Var2.a.r.a4();
                        break;
                    case 3:
                        l82Var2.a.r.X3();
                        break;
                    case 4:
                        l82Var2.a.r.b4();
                        break;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        break;
                    case 10:
                        l82Var2.a.Y();
                        break;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        break;
                }
            }
        });
        a(R.drawable.iv_text, 1, false);
        a(R.drawable.iv_lists, 2, true);
        a(R.drawable.iv_table, 4, true);
        a(R.drawable.iv_math, 7, true);
        ImageView imageView5 = new ImageView(context);
        this.F = imageView5;
        imageView5.setImageResource(R.drawable.outline_poll_attach_24);
        imageView5.setScaleType(scaleType);
        anb.s(imageView5, i4, ylbVar, mode);
        fg0 Z4 = cmb.Z(cmb.v0(i, ylbVar), cmb.v0(i3, ylbVar), gm.L(20.0f), gm.L(20.0f));
        wmb M5 = anb.M(i);
        wmb M6 = anb.M(i3);
        imageView5.setBackground(Z4);
        anb.j(imageView5, Z4, M5, M6, ylbVar);
        linearLayout3.addView(imageView5, qoe.t(38, 38, 16, 2, 0, 0, 0));
        rve.a(imageView5);
        imageView5.setContentDescription("Attach");
        final byte b5 = 11;
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: dh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b5;
                l82 l82Var2 = l82Var;
                switch (b22) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        break;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        break;
                    case 2:
                        l82Var2.a.r.a4();
                        break;
                    case 3:
                        l82Var2.a.r.X3();
                        break;
                    case 4:
                        l82Var2.a.r.b4();
                        break;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        break;
                    case 10:
                        l82Var2.a.Y();
                        break;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout2.addView(frameLayout4, qoe.l(1.0f, 0, 44));
        qmb qmbVar = new qmb((byte) 14, context, this);
        this.H = qmbVar;
        qmbVar.setOrientation(0);
        qmbVar.setClipToPadding(false);
        qmbVar.setClipChildren(false);
        qmbVar.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        frameLayout2.addView(qmbVar, qoe.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.I = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        frameLayout2.addView(frameLayout6, qoe.e(80, 60, 81));
        s09 s09Var = new s09(context);
        this.J = s09Var;
        s09Var.f(R.raw.group_pip_delete_icon, gm.L(16.0f), gm.L(16.0f), null);
        p09 animatedDrawable = s09Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.F(0);
            animatedDrawable.K(0);
        }
        s09Var.setScaleType(scaleType);
        s09Var.setColorFilter(new PorterDuffColorFilter(cmb.v0(i4, ylbVar), mode));
        Drawable b03 = cmb.b0(gm.L(22.0f), cmb.v0(i2, ylbVar));
        f(s09Var, i2, b03);
        s09Var.setBackground(new if9(b03));
        frameLayout6.addView(s09Var, qoe.e(-1, -1, nm7.D1));
        FrameLayout frameLayout7 = new FrameLayout(context);
        Drawable b04 = cmb.b0(gm.L(22.0f), cmb.v0(i2, ylbVar));
        f(frameLayout7, i2, b04);
        frameLayout7.setBackground(new if9(b04));
        qmbVar.addView(frameLayout7, qoe.c(44.0f, -2));
        gh9 gh9Var = new gh9(this, context, (byte) 0);
        gh9Var.setHorizontalScrollBarEnabled(false);
        gh9Var.setClipToOutline(true);
        gh9Var.setOutlineProvider(new xj((byte) 17));
        frameLayout7.addView(gh9Var, qoe.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.K = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        gh9Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, TLObject.FLAG_14, true);
        b(R.drawable.iv_super, 32768, true);
        ff9 ff9Var = new ff9(R.drawable.iv_quote, ylbVar, context);
        this.T = ff9Var;
        ff9Var.c(i2);
        ff9Var.setContentDescription(jb6.M0(2131746173, null));
        final byte b6 = 0;
        ff9Var.setOnClickListener(new View.OnClickListener() { // from class: dh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b6;
                l82 l82Var2 = l82Var;
                switch (b22) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        break;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        break;
                    case 2:
                        l82Var2.a.r.a4();
                        break;
                    case 3:
                        l82Var2.a.r.X3();
                        break;
                    case 4:
                        l82Var2.a.r.b4();
                        break;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        break;
                    case 10:
                        l82Var2.a.Y();
                        break;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(ff9Var, qoe.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        ff9 ff9Var2 = new ff9(R.drawable.iv_button, ylbVar, context);
        this.Q = ff9Var2;
        ff9Var2.c(i2);
        ff9Var2.setContentDescription(jb6.M0(2131745744, null));
        final byte b7 = 1;
        ff9Var2.setOnClickListener(new View.OnClickListener() { // from class: dh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b7;
                l82 l82Var2 = l82Var;
                switch (b22) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        break;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        break;
                    case 2:
                        l82Var2.a.r.a4();
                        break;
                    case 3:
                        l82Var2.a.r.X3();
                        break;
                    case 4:
                        l82Var2.a.r.b4();
                        break;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        break;
                    case 10:
                        l82Var2.a.Y();
                        break;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(ff9Var2, qoe.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.N = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        Drawable b05 = cmb.b0(gm.L(22.0f), cmb.v0(i2, ylbVar));
        f(linearLayout5, i2, b05);
        linearLayout5.setBackground(new if9(b05));
        qmbVar.addView(linearLayout5, qoe.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ff9 ff9Var3 = new ff9(R.drawable.media_link_24, ylbVar, context);
        this.P = ff9Var3;
        ff9Var3.c(i2);
        ff9Var3.setContentDescription(jb6.M0(2131751681, null));
        final byte b8 = 2;
        ff9Var3.setOnClickListener(new View.OnClickListener() { // from class: dh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b8;
                l82 l82Var2 = l82Var;
                switch (b22) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        break;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        break;
                    case 2:
                        l82Var2.a.r.a4();
                        break;
                    case 3:
                        l82Var2.a.r.X3();
                        break;
                    case 4:
                        l82Var2.a.r.b4();
                        break;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        break;
                    case 10:
                        l82Var2.a.Y();
                        break;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(ff9Var3, qoe.r(38, 38, 16));
        ff9 ff9Var4 = new ff9(R.drawable.msg_calendar2, ylbVar, context);
        this.R = ff9Var4;
        ff9Var4.c(i2);
        ff9Var4.setContentDescription(jb6.M0(2131754861, null));
        final byte b9 = 3;
        ff9Var4.setOnClickListener(new View.OnClickListener() { // from class: dh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b9;
                l82 l82Var2 = l82Var;
                switch (b22) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        break;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        break;
                    case 2:
                        l82Var2.a.r.a4();
                        break;
                    case 3:
                        l82Var2.a.r.X3();
                        break;
                    case 4:
                        l82Var2.a.r.b4();
                        break;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        break;
                    case 10:
                        l82Var2.a.Y();
                        break;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(ff9Var4, qoe.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.O = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        Drawable b06 = cmb.b0(gm.L(22.0f), cmb.v0(i2, ylbVar));
        f(linearLayout6, i2, b06);
        linearLayout6.setBackground(new if9(b06));
        qmbVar.addView(linearLayout6, qoe.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        ff9 ff9Var5 = new ff9(R.drawable.iv_math, ylbVar, context);
        this.S = ff9Var5;
        ff9Var5.c(i2);
        ff9Var5.d();
        arrayList.add(ff9Var5);
        ff9Var5.setContentDescription(jb6.M0(2131754863, null));
        final byte b10 = 4;
        ff9Var5.setOnClickListener(new View.OnClickListener() { // from class: dh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b10;
                l82 l82Var2 = l82Var;
                switch (b22) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        break;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        break;
                    case 2:
                        l82Var2.a.r.a4();
                        break;
                    case 3:
                        l82Var2.a.r.X3();
                        break;
                    case 4:
                        l82Var2.a.r.b4();
                        break;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        break;
                    case 10:
                        l82Var2.a.Y();
                        break;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout6.addView(ff9Var5, qoe.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.M = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        Drawable b07 = cmb.b0(gm.L(22.0f), cmb.v0(i2, ylbVar));
        f(linearLayout7, i2, b07);
        linearLayout7.setBackground(new if9(b07));
        qmbVar.addView(linearLayout7, 0, qoe.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        ff9 ff9Var6 = new ff9(R.drawable.input_ai, ylbVar, context);
        ff9Var6.setImageDrawable(new hd(context));
        ff9Var6.c(i2);
        ff9Var6.setContentDescription(jb6.M0(2131755006, null));
        final byte b11 = 5;
        ff9Var6.setOnClickListener(new View.OnClickListener() { // from class: dh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b11;
                l82 l82Var2 = l82Var;
                switch (b22) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        break;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        break;
                    case 2:
                        l82Var2.a.r.a4();
                        break;
                    case 3:
                        l82Var2.a.r.X3();
                        break;
                    case 4:
                        l82Var2.a.r.b4();
                        break;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        break;
                    case 10:
                        l82Var2.a.Y();
                        break;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        break;
                }
            }
        });
        linearLayout7.addView(ff9Var6, qoe.r(38, 38, 16));
        vi3 vi3Var = new vi3(this, context, ylbVar);
        this.G = vi3Var;
        int i5 = cmb.Oe;
        Drawable b08 = cmb.b0(gm.L(22.0f), cmb.v0(i5, ylbVar));
        f(vi3Var, i5, b08);
        vi3Var.setBackground(new if9(b08));
        rve.a(vi3Var);
        linearLayout2.addView(vi3Var, qoe.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        vi3Var.setContentDescription("Send");
        final byte b12 = 6;
        vi3Var.setOnClickListener(new View.OnClickListener() { // from class: dh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b12;
                l82 l82Var2 = l82Var;
                switch (b22) {
                    case 0:
                        p82 p82Var = l82Var2.a;
                        p82Var.r.T4();
                        p82Var.b0();
                        break;
                    case 1:
                        l82Var2.a.r.Z3(view3);
                        break;
                    case 2:
                        l82Var2.a.r.a4();
                        break;
                    case 3:
                        l82Var2.a.r.X3();
                        break;
                    case 4:
                        l82Var2.a.r.b4();
                        break;
                    case 5:
                        p82 p82Var2 = l82Var2.a;
                        tg9 c2 = p82Var2.r.c2();
                        if (c2 != null) {
                            TL_iv.RichMessage a = c2.a();
                            if (!a.blocks.isEmpty()) {
                                a1 a1Var = new a1(p82Var2.getContext(), p82Var2.a);
                                a1Var.n1(a);
                                a1Var.f2 = new mf2(c2, (byte) 20);
                                a1Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        l82Var2.a.K(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        of9 of9Var = l82Var2.a.r.R3;
                        if (of9Var != null) {
                            of9Var.k();
                            break;
                        }
                        break;
                    case 8:
                        of9 of9Var2 = l82Var2.a.r.R3;
                        if (of9Var2 != null) {
                            of9Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p82 p82Var3 = l82Var2.a;
                        new gd9(p82Var3.n, p82Var3.a, new mf2(l82Var2, (byte) 21), p82Var3.getContext()).show();
                        break;
                    case 10:
                        l82Var2.a.Y();
                        break;
                    default:
                        p82 p82Var4 = l82Var2.a;
                        p82Var4.r.j4 = null;
                        p82Var4.S(90, 0);
                        break;
                }
            }
        });
        vi3Var.setOnLongClickListener(new au(l82Var, (byte) 14));
        g(0, false);
    }

    public final void a(int i, int i2, boolean z) {
        LinearLayout linearLayout = this.E;
        ff9 ff9Var = new ff9(i, this.b, linearLayout.getContext());
        ff9Var.c(cmb.c6);
        if (z) {
            ff9Var.d();
            this.W.add(ff9Var);
        }
        ff9Var.setTag(Integer.valueOf(i2));
        ff9Var.setContentDescription(jf9.d0(i2));
        ff9Var.setOnClickListener(new hb(this, i2, (byte) 6));
        this.U.add(ff9Var);
        linearLayout.addView(ff9Var, qoe.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void b(int i, final int i2, boolean z) {
        ff9 ff9Var = new ff9(i, this.b, getContext());
        ff9Var.c(cmb.Ol);
        if (z) {
            ff9Var.d();
            this.W.add(ff9Var);
        }
        ff9Var.setTag(Integer.valueOf(i2));
        ff9Var.setContentDescription(jf9.f0(i2));
        ff9Var.setOnClickListener(new View.OnClickListener() { // from class: fh9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hh9.this.a.a.r.Y3(i2);
            }
        });
        this.V.add(ff9Var);
        LinearLayout linearLayout = this.K;
        linearLayout.addView(ff9Var, qoe.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void c(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ff9 ff9Var = (ff9) obj;
            int intValue = ((Integer) ff9Var.getTag()).intValue();
            ff9Var.setSelected((i & intValue) != 0);
            if (intValue == 1 || intValue == 2) {
                ff9Var.setEnabled(z5);
            }
        }
        ff9 ff9Var2 = this.P;
        ff9Var2.setSelected(z);
        ff9 ff9Var3 = this.R;
        ff9Var3.setSelected(z2);
        ff9Var2.setEnabled(z3);
        this.Q.setEnabled(z4);
        ff9Var3.setEnabled(z3);
        this.S.setEnabled(z3);
    }

    public final void d(int i, int i2) {
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ff9 ff9Var = (ff9) obj;
            boolean z = i == ((Integer) ff9Var.getTag()).intValue();
            ff9Var.setSelected(z);
            if (!z || i2 == 0) {
                ff9Var.a();
            } else {
                ff9Var.e(i2);
            }
        }
    }

    public final void e(boolean z, boolean z2) {
        if (this.d0 == z && z2) {
            return;
        }
        this.d0 = z;
        float f = z ? 1.15f : 1.0f;
        s09 s09Var = this.J;
        if (z2) {
            s09Var.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(d53.h).start();
        } else {
            s09Var.animate().cancel();
            s09Var.setScaleX(f);
            s09Var.setScaleY(f);
        }
        s09Var.setColorFilter(new PorterDuffColorFilter(cmb.v0(z ? cmb.p7 : cmb.F6, this.b), PorterDuff.Mode.SRC_IN));
        p09 animatedDrawable = s09Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z) {
                if (animatedDrawable.b0 > 34) {
                    animatedDrawable.I(0, false, false);
                }
                animatedDrawable.K(33);
            } else {
                animatedDrawable.K(0);
            }
            animatedDrawable.start();
        }
    }

    public final void f(View view, int i, Drawable drawable) {
        this.g0.add(view);
        this.h0.add(drawable);
        this.i0.add(Integer.valueOf(i));
        ylb ylbVar = this.b;
        this.j0.add(Integer.valueOf(cmb.v0(i, ylbVar)));
        this.k0.add(Integer.valueOf(drawable instanceof RippleDrawable ? cmb.v(cmb.v0(i, ylbVar), cmb.v0(cmb.h6, ylbVar)) : 0));
    }

    public final void g(int i, boolean z) {
        if (this.b0 == i) {
            return;
        }
        this.b0 = i;
        FrameLayout frameLayout = this.I;
        LinearLayout linearLayout = this.x;
        final byte b = 2;
        qmb qmbVar = this.H;
        final byte b2 = 1;
        if (z) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator duration = linearLayout.animate().alpha(i == 0 ? 1.0f : 0.0f).scaleX(i == 0 ? 1.0f : 0.8f).scaleY(i == 0 ? 1.0f : 0.8f).translationY(i == 0 ? 0.0f : gm.L(30.0f)).setDuration(420L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).withEndAction(new Runnable(this) { // from class: eh9
                public final /* synthetic */ hh9 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = r2;
                    hh9 hh9Var = this.b;
                    switch (b3) {
                        case 0:
                            if (hh9Var.b0 != 0) {
                                hh9Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            if (hh9Var.b0 != 1) {
                                hh9Var.H.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (hh9Var.b0 != 2) {
                                hh9Var.I.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            qmbVar.setVisibility(0);
            qmbVar.animate().alpha(i == 1 ? 1.0f : 0.0f).scaleX(i == 1 ? 1.0f : 0.8f).scaleY(i == 1 ? 1.0f : 0.8f).translationY(i == 1 ? 0.0f : gm.L(30.0f)).setDuration(420L).setInterpolator(d53Var).withEndAction(new Runnable(this) { // from class: eh9
                public final /* synthetic */ hh9 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    hh9 hh9Var = this.b;
                    switch (b3) {
                        case 0:
                            if (hh9Var.b0 != 0) {
                                hh9Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            if (hh9Var.b0 != 1) {
                                hh9Var.H.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (hh9Var.b0 != 2) {
                                hh9Var.I.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(i == 2 ? 1.0f : 0.0f).scaleX(i == 2 ? 1.0f : 0.8f).scaleY(i == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(d53Var).withEndAction(new Runnable(this) { // from class: eh9
                public final /* synthetic */ hh9 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    hh9 hh9Var = this.b;
                    switch (b3) {
                        case 0:
                            if (hh9Var.b0 != 0) {
                                hh9Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            if (hh9Var.b0 != 1) {
                                hh9Var.H.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (hh9Var.b0 != 2) {
                                hh9Var.I.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        linearLayout.setVisibility(i == 0 ? 0 : 8);
        linearLayout.setAlpha(i == 0 ? 1.0f : 0.0f);
        linearLayout.setScaleX(i == 0 ? 1.0f : 0.8f);
        linearLayout.setScaleY(i == 0 ? 1.0f : 0.8f);
        linearLayout.setTranslationY(i == 0 ? 0.0f : gm.L(30.0f));
        qmbVar.setVisibility(i == 1 ? 0 : 8);
        qmbVar.setAlpha(i == 1 ? 1.0f : 0.0f);
        qmbVar.setScaleX(i == 1 ? 1.0f : 0.8f);
        qmbVar.setScaleY(i == 1 ? 1.0f : 0.8f);
        qmbVar.setTranslationY(i == 1 ? 0.0f : gm.L(30.0f));
        frameLayout.setVisibility(i != 2 ? (byte) 8 : (byte) 0);
        frameLayout.setAlpha(i == 2 ? 1.0f : 0.0f);
        frameLayout.setScaleX(i == 2 ? 1.0f : 0.8f);
        frameLayout.setScaleY(i == 2 ? 1.0f : 0.8f);
    }

    public ImageView getAddButton() {
        return this.F;
    }

    public FrameLayout getBottomContainer() {
        return this.s;
    }

    public FrameLayout getBottomInnerContainer() {
        return this.w;
    }

    public LinearLayout getBottomPanel() {
        return this.x;
    }

    public View getEmojiButton() {
        return this.y;
    }

    public xz1 getSendButton() {
        return this.G;
    }

    public void setBackVisible(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }

    public void setBottomGradientTranslationY(float f) {
        this.d.setTranslationY(f);
    }

    public void setEmojiOpened(boolean z) {
        b02 b02Var = z ? b02.d : b02.e;
        d02 d02Var = this.y;
        d02Var.j(b02Var, true);
        d02Var.setContentDescription(z ? "Keyboard" : "Emoji");
    }

    public void setPremiumLocked(boolean z) {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ff9) obj).setPremiumLocked(z);
        }
    }

    public void setQuoteState(boolean z) {
        this.T.setSelected(z);
    }

    public void setSelectedBlockType(int i) {
        d(i, 0);
    }

    public void setSendEditing(boolean z) {
        this.G.setResourceId(z ? R.drawable.input_done : R.drawable.send_plane_24);
    }

    public void setSendEnabled(boolean z) {
        vi3 vi3Var = this.G;
        if (vi3Var.isEnabled() == z) {
            return;
        }
        vi3Var.setEnabled(z);
        wi8.s(vi3Var.animate(), z ? 1.0f : 0.5f, 150L);
    }

    public void setSendLoading(boolean z) {
        if (this.a0 == z) {
            return;
        }
        this.a0 = z;
        this.G.invalidate();
    }

    public void setTopButtonsOffset(int i) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i) {
            layoutParams.topMargin = i;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i) {
            layoutParams2.topMargin = i;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public void setTopGradientVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTopPanelVisible(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
        this.c.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x0007, B:5:0x0011, B:8:0x003a, B:10:0x0040, B:13:0x005c, B:15:0x0072, B:16:0x0078, B:18:0x0084, B:20:0x00a1, B:22:0x00aa, B:24:0x00b4, B:30:0x008f, B:32:0x009b, B:37:0x00be, B:39:0x00c2, B:40:0x00c7, B:42:0x00cf, B:46:0x00d3, B:49:0x00c5, B:51:0x0015, B:53:0x001e, B:54:0x0029, B:56:0x002d), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // vlb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        boolean z;
        View view;
        ArrayList arrayList = this.k0;
        ArrayList arrayList2 = this.h0;
        ylb ylbVar = this.b;
        try {
            int v0 = cmb.v0(cmb.c6, ylbVar);
            if (!this.m0 || v0 != this.l0) {
                this.m0 = true;
                this.l0 = v0;
                GradientDrawable gradientDrawable = this.e0;
                if (gradientDrawable != null) {
                    gradientDrawable.setColors(new int[]{v0, cmb.p1(0.0f, v0)});
                }
                GradientDrawable gradientDrawable2 = this.f0;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setColors(new int[]{cmb.p1(0.0f, v0), v0});
                }
            }
            for (int i = 0; i < arrayList2.size(); i++) {
                Drawable drawable = (Drawable) arrayList2.get(i);
                int v02 = cmb.v0(((Integer) this.i0.get(i)).intValue(), ylbVar);
                boolean z2 = drawable instanceof RippleDrawable;
                ArrayList arrayList3 = this.j0;
                if (z2) {
                    int v = cmb.v(v02, cmb.v0(cmb.h6, ylbVar));
                    if (v02 != ((Integer) arrayList3.get(i)).intValue()) {
                        cmb.F1(drawable, v02, false);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (v != ((Integer) arrayList.get(i)).intValue()) {
                        arrayList.set(i, Integer.valueOf(v));
                        cmb.F1(drawable, v, true);
                        z = true;
                    }
                    arrayList3.set(i, Integer.valueOf(v02));
                    if (!z && (view = (View) this.g0.get(i)) != null) {
                        view.invalidate();
                    }
                } else if (v02 != ((Integer) arrayList3.get(i)).intValue()) {
                    cmb.A1(v02, drawable);
                    z = true;
                    arrayList3.set(i, Integer.valueOf(v02));
                    if (!z) {
                        view.invalidate();
                    }
                } else {
                    z = false;
                    arrayList3.set(i, Integer.valueOf(v02));
                    if (!z) {
                    }
                }
            }
            s09 s09Var = this.J;
            if (s09Var != null) {
                int v03 = cmb.v0(this.d0 ? cmb.p7 : cmb.F6, ylbVar);
                if (this.o0 && v03 == this.n0) {
                    return;
                }
                this.o0 = true;
                this.n0 = v03;
                s09Var.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}

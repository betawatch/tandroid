package oi;

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
import c8.ma;
import c8.ra;
import hi.t6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yg;
import org.telegram.ui.d61;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class x3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final LinearLayout E;
    public final ImageView F;
    public final u1 G;
    public final d61 H;
    public final FrameLayout I;
    public final ph0 J;
    public final LinearLayout K;
    public int L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final LinearLayout O;
    public final v1 P;
    public final v1 Q;
    public final v1 R;
    public final v1 S;
    public final v1 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public final k a;
    public boolean a0;
    public final i6 b;
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
    public final yg y;

    public x3(Context context, final k kVar) {
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
        this.a = kVar;
        i6 i6Var = kVar.a.a;
        this.b = i6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = n6.d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{n6.w0(i7, i6Var), n6.r1(0.0f, n6.w0(i7, i6Var))});
        this.e0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, ma.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{n6.r1(0.0f, n6.w0(i7, i6Var)), n6.w0(i7, i6Var)});
        this.f0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, ma.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, ma.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = n6.Pl;
        int w02 = n6.w0(i10, i6Var);
        int w03 = n6.w0(i10, i6Var);
        int i11 = n6.i6;
        Drawable b02 = n6.b0(w02, n6.w(w03, n6.w0(i11, i6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView, i10, b02);
        imageView.setBackground(new y1(b02));
        int i12 = n6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        u6.s(imageView, i12, i6Var, mode);
        ra.a(imageView);
        imageView.setContentDescription(gd.M0(2131754878, null));
        imageView.setOnClickListener(new bi.o(kVar, 11));
        frameLayout.addView(imageView, ma.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        Drawable d02 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i10, i6Var));
        f(linearLayout, i10, d02);
        linearLayout.setBackground(new y1(d02));
        frameLayout.addView(linearLayout, ma.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = n6.h0(n6.w0(i11, i6Var), 1, -1);
        q6 M = u6.M(i11);
        imageView2.setBackground(h02);
        u6.j(imageView2, h02, null, M, i6Var);
        u6.s(imageView2, i12, i6Var, mode);
        ra.a(imageView2);
        imageView2.setContentDescription("Undo");
        final int i13 = 7;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: oi.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        o oVar = kVar.a;
                        oVar.r.T4();
                        oVar.b0();
                        break;
                    case 1:
                        kVar.a.r.c4(view3);
                        break;
                    case 2:
                        kVar.a.r.d4();
                        break;
                    case 3:
                        kVar.a.r.a4();
                        break;
                    case 4:
                        kVar.a.r.e4();
                        break;
                    case 5:
                        o oVar2 = kVar.a;
                        j3 k22 = oVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.a);
                                m0Var.w1(a10);
                                m0Var.g2 = new t6(k22, 15);
                                m0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.M(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        e2 e2Var = kVar.a.r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        e2 e2Var2 = kVar.a.r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.n, context2, new t6(kVar2, 16), oVar3.a).show();
                        break;
                    case 10:
                        o.Q(kVar.a);
                        break;
                    default:
                        o oVar4 = kVar.a;
                        oVar4.r.j4 = null;
                        o.T(oVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView2, ma.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = n6.h0(n6.w0(i11, i6Var), 1, -1);
        q6 M2 = u6.M(i11);
        imageView3.setBackground(h03);
        u6.j(imageView3, h03, null, M2, i6Var);
        u6.s(imageView3, i12, i6Var, mode);
        ra.a(imageView3);
        imageView3.setContentDescription("Redo");
        final int i14 = 8;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: oi.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        o oVar = kVar.a;
                        oVar.r.T4();
                        oVar.b0();
                        break;
                    case 1:
                        kVar.a.r.c4(view3);
                        break;
                    case 2:
                        kVar.a.r.d4();
                        break;
                    case 3:
                        kVar.a.r.a4();
                        break;
                    case 4:
                        kVar.a.r.e4();
                        break;
                    case 5:
                        o oVar2 = kVar.a;
                        j3 k22 = oVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.a);
                                m0Var.w1(a10);
                                m0Var.g2 = new t6(k22, 15);
                                m0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.M(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        e2 e2Var = kVar.a.r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        e2 e2Var2 = kVar.a.r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.n, context2, new t6(kVar2, 16), oVar3.a).show();
                        break;
                    case 10:
                        o.Q(kVar.a);
                        break;
                    default:
                        o oVar4 = kVar.a;
                        oVar4.r.j4 = null;
                        o.T(oVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView3, ma.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, ma.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, ma.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout3.addView(linearLayout2, ma.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.ActionBar.w2(context));
        imageView4.setScaleType(scaleType);
        u6.s(imageView4, i12, i6Var, mode);
        Drawable b03 = n6.b0(n6.w0(i10, i6Var), n6.w(n6.w0(i10, i6Var), n6.w0(i11, i6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView4, i10, b03);
        imageView4.setBackground(new y1(b03));
        linearLayout2.addView(imageView4, ma.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ra.a(imageView4);
        imageView4.setContentDescription("AI");
        final int i15 = 9;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: oi.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        o oVar = kVar.a;
                        oVar.r.T4();
                        oVar.b0();
                        break;
                    case 1:
                        kVar.a.r.c4(view3);
                        break;
                    case 2:
                        kVar.a.r.d4();
                        break;
                    case 3:
                        kVar.a.r.a4();
                        break;
                    case 4:
                        kVar.a.r.e4();
                        break;
                    case 5:
                        o oVar2 = kVar.a;
                        j3 k22 = oVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.a);
                                m0Var.w1(a10);
                                m0Var.g2 = new t6(k22, 15);
                                m0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.M(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        e2 e2Var = kVar.a.r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        e2 e2Var2 = kVar.a.r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.n, context2, new t6(kVar2, 16), oVar3.a).show();
                        break;
                    case 10:
                        o.Q(kVar.a);
                        break;
                    default:
                        o oVar4 = kVar.a;
                        oVar4.r.j4 = null;
                        o.T(oVar4, 90, 0);
                        break;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        Drawable d03 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i7, i6Var));
        f(frameLayout5, i7, d03);
        frameLayout5.setBackground(new y1(d03));
        frameLayout4.addView(frameLayout5, ma.e(-2, 44, 81));
        s1 s1Var = new s1(context, 1);
        s1Var.setClipToOutline(true);
        s1Var.setOutlineProvider(new bg.q0(6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        s1Var.addView(linearLayout3);
        frameLayout5.addView(s1Var, ma.c(-1.0f, -1));
        yg ygVar = new yg(context, 24);
        this.y = ygVar;
        ygVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        u6.s(ygVar, i12, i6Var, mode);
        org.telegram.ui.Cells.y b04 = n6.b0(n6.w0(i7, i6Var), n6.w0(i11, i6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        q6 M3 = u6.M(i7);
        q6 M4 = u6.M(i11);
        ygVar.setBackground(b04);
        u6.j(ygVar, b04, M3, M4, i6Var);
        ygVar.j(wg.e, false);
        linearLayout3.addView(ygVar, ma.r(38, 38, 16));
        ra.a(ygVar);
        ygVar.setContentDescription("Emoji");
        final int i16 = 10;
        ygVar.setOnClickListener(new View.OnClickListener() { // from class: oi.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        o oVar = kVar.a;
                        oVar.r.T4();
                        oVar.b0();
                        break;
                    case 1:
                        kVar.a.r.c4(view3);
                        break;
                    case 2:
                        kVar.a.r.d4();
                        break;
                    case 3:
                        kVar.a.r.a4();
                        break;
                    case 4:
                        kVar.a.r.e4();
                        break;
                    case 5:
                        o oVar2 = kVar.a;
                        j3 k22 = oVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.a);
                                m0Var.w1(a10);
                                m0Var.g2 = new t6(k22, 15);
                                m0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.M(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        e2 e2Var = kVar.a.r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        e2 e2Var2 = kVar.a.r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.n, context2, new t6(kVar2, 16), oVar3.a).show();
                        break;
                    case 10:
                        o.Q(kVar.a);
                        break;
                    default:
                        o oVar4 = kVar.a;
                        oVar4.r.j4 = null;
                        o.T(oVar4, 90, 0);
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
        u6.s(imageView5, i12, i6Var, mode);
        org.telegram.ui.Cells.y b05 = n6.b0(n6.w0(i7, i6Var), n6.w0(i11, i6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        q6 M5 = u6.M(i7);
        q6 M6 = u6.M(i11);
        imageView5.setBackground(b05);
        u6.j(imageView5, b05, M5, M6, i6Var);
        linearLayout3.addView(imageView5, ma.t(38, 38, 16, 2, 0, 0, 0));
        ra.a(imageView5);
        imageView5.setContentDescription("Attach");
        final int i17 = 11;
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: oi.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        o oVar = kVar.a;
                        oVar.r.T4();
                        oVar.b0();
                        break;
                    case 1:
                        kVar.a.r.c4(view3);
                        break;
                    case 2:
                        kVar.a.r.d4();
                        break;
                    case 3:
                        kVar.a.r.a4();
                        break;
                    case 4:
                        kVar.a.r.e4();
                        break;
                    case 5:
                        o oVar2 = kVar.a;
                        j3 k22 = oVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.a);
                                m0Var.w1(a10);
                                m0Var.g2 = new t6(k22, 15);
                                m0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.M(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        e2 e2Var = kVar.a.r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        e2 e2Var2 = kVar.a.r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.n, context2, new t6(kVar2, 16), oVar3.a).show();
                        break;
                    case 10:
                        o.Q(kVar.a);
                        break;
                    default:
                        o oVar4 = kVar.a;
                        oVar4.r.j4 = null;
                        o.T(oVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout2.addView(frameLayout4, ma.l(1.0f, 0, 44));
        d61 d61Var = new d61(7, context, this);
        this.H = d61Var;
        d61Var.setOrientation(0);
        d61Var.setClipToPadding(false);
        d61Var.setClipChildren(false);
        d61Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(d61Var, ma.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.I = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(frameLayout6, ma.e(80, 60, 81));
        ph0 ph0Var = new ph0(context);
        this.J = ph0Var;
        ph0Var.f(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        mh0 animatedDrawable = ph0Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        ph0Var.setScaleType(scaleType);
        ph0Var.setColorFilter(new PorterDuffColorFilter(n6.w0(i12, i6Var), mode));
        Drawable d04 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i10, i6Var));
        f(ph0Var, i10, d04);
        ph0Var.setBackground(new y1(d04));
        frameLayout6.addView(ph0Var, ma.e(-1, -1, ks.E1));
        FrameLayout frameLayout7 = new FrameLayout(context);
        Drawable d05 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i10, i6Var));
        f(frameLayout7, i10, d05);
        frameLayout7.setBackground(new y1(d05));
        d61Var.addView(frameLayout7, ma.c(44.0f, -2));
        w3 w3Var = new w3(this, context, 0);
        w3Var.setHorizontalScrollBarEnabled(false);
        w3Var.setClipToOutline(true);
        w3Var.setOutlineProvider(new bg.q0(7));
        frameLayout7.addView(w3Var, ma.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.K = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        w3Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, TLObject.FLAG_14, true);
        b(R.drawable.iv_super, 32768, true);
        v1 v1Var = new v1(R.drawable.iv_quote, context, i6Var);
        this.T = v1Var;
        v1Var.c(i10);
        v1Var.setContentDescription(gd.M0(2131746245, null));
        final int i18 = 0;
        v1Var.setOnClickListener(new View.OnClickListener() { // from class: oi.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        o oVar = kVar.a;
                        oVar.r.T4();
                        oVar.b0();
                        break;
                    case 1:
                        kVar.a.r.c4(view3);
                        break;
                    case 2:
                        kVar.a.r.d4();
                        break;
                    case 3:
                        kVar.a.r.a4();
                        break;
                    case 4:
                        kVar.a.r.e4();
                        break;
                    case 5:
                        o oVar2 = kVar.a;
                        j3 k22 = oVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.a);
                                m0Var.w1(a10);
                                m0Var.g2 = new t6(k22, 15);
                                m0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.M(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        e2 e2Var = kVar.a.r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        e2 e2Var2 = kVar.a.r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.n, context2, new t6(kVar2, 16), oVar3.a).show();
                        break;
                    case 10:
                        o.Q(kVar.a);
                        break;
                    default:
                        o oVar4 = kVar.a;
                        oVar4.r.j4 = null;
                        o.T(oVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(v1Var, ma.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        v1 v1Var2 = new v1(R.drawable.iv_button, context, i6Var);
        this.Q = v1Var2;
        v1Var2.c(i10);
        v1Var2.setContentDescription(gd.M0(2131745816, null));
        final int i19 = 1;
        v1Var2.setOnClickListener(new View.OnClickListener() { // from class: oi.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i19) {
                    case 0:
                        o oVar = kVar.a;
                        oVar.r.T4();
                        oVar.b0();
                        break;
                    case 1:
                        kVar.a.r.c4(view3);
                        break;
                    case 2:
                        kVar.a.r.d4();
                        break;
                    case 3:
                        kVar.a.r.a4();
                        break;
                    case 4:
                        kVar.a.r.e4();
                        break;
                    case 5:
                        o oVar2 = kVar.a;
                        j3 k22 = oVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.a);
                                m0Var.w1(a10);
                                m0Var.g2 = new t6(k22, 15);
                                m0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.M(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        e2 e2Var = kVar.a.r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        e2 e2Var2 = kVar.a.r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.n, context2, new t6(kVar2, 16), oVar3.a).show();
                        break;
                    case 10:
                        o.Q(kVar.a);
                        break;
                    default:
                        o oVar4 = kVar.a;
                        oVar4.r.j4 = null;
                        o.T(oVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(v1Var2, ma.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.N = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        Drawable d06 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i10, i6Var));
        f(linearLayout5, i10, d06);
        linearLayout5.setBackground(new y1(d06));
        d61Var.addView(linearLayout5, ma.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        v1 v1Var3 = new v1(R.drawable.media_link_24, context, i6Var);
        this.P = v1Var3;
        v1Var3.c(i10);
        v1Var3.setContentDescription(gd.M0(2131751733, null));
        final int i20 = 2;
        v1Var3.setOnClickListener(new View.OnClickListener() { // from class: oi.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i20) {
                    case 0:
                        o oVar = kVar.a;
                        oVar.r.T4();
                        oVar.b0();
                        break;
                    case 1:
                        kVar.a.r.c4(view3);
                        break;
                    case 2:
                        kVar.a.r.d4();
                        break;
                    case 3:
                        kVar.a.r.a4();
                        break;
                    case 4:
                        kVar.a.r.e4();
                        break;
                    case 5:
                        o oVar2 = kVar.a;
                        j3 k22 = oVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.a);
                                m0Var.w1(a10);
                                m0Var.g2 = new t6(k22, 15);
                                m0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.M(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        e2 e2Var = kVar.a.r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        e2 e2Var2 = kVar.a.r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.n, context2, new t6(kVar2, 16), oVar3.a).show();
                        break;
                    case 10:
                        o.Q(kVar.a);
                        break;
                    default:
                        o oVar4 = kVar.a;
                        oVar4.r.j4 = null;
                        o.T(oVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(v1Var3, ma.r(38, 38, 16));
        v1 v1Var4 = new v1(R.drawable.msg_calendar2, context, i6Var);
        this.R = v1Var4;
        v1Var4.c(i10);
        v1Var4.setContentDescription(gd.M0(2131754862, null));
        final int i21 = 3;
        v1Var4.setOnClickListener(new View.OnClickListener() { // from class: oi.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i21) {
                    case 0:
                        o oVar = kVar.a;
                        oVar.r.T4();
                        oVar.b0();
                        break;
                    case 1:
                        kVar.a.r.c4(view3);
                        break;
                    case 2:
                        kVar.a.r.d4();
                        break;
                    case 3:
                        kVar.a.r.a4();
                        break;
                    case 4:
                        kVar.a.r.e4();
                        break;
                    case 5:
                        o oVar2 = kVar.a;
                        j3 k22 = oVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.a);
                                m0Var.w1(a10);
                                m0Var.g2 = new t6(k22, 15);
                                m0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.M(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        e2 e2Var = kVar.a.r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        e2 e2Var2 = kVar.a.r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.n, context2, new t6(kVar2, 16), oVar3.a).show();
                        break;
                    case 10:
                        o.Q(kVar.a);
                        break;
                    default:
                        o oVar4 = kVar.a;
                        oVar4.r.j4 = null;
                        o.T(oVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(v1Var4, ma.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.O = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        Drawable d07 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i10, i6Var));
        f(linearLayout6, i10, d07);
        linearLayout6.setBackground(new y1(d07));
        d61Var.addView(linearLayout6, ma.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        v1 v1Var5 = new v1(R.drawable.iv_math, context, i6Var);
        this.S = v1Var5;
        v1Var5.c(i10);
        v1Var5.d();
        arrayList.add(v1Var5);
        v1Var5.setContentDescription(gd.M0(2131754864, null));
        final int i22 = 4;
        v1Var5.setOnClickListener(new View.OnClickListener() { // from class: oi.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i22) {
                    case 0:
                        o oVar = kVar.a;
                        oVar.r.T4();
                        oVar.b0();
                        break;
                    case 1:
                        kVar.a.r.c4(view3);
                        break;
                    case 2:
                        kVar.a.r.d4();
                        break;
                    case 3:
                        kVar.a.r.a4();
                        break;
                    case 4:
                        kVar.a.r.e4();
                        break;
                    case 5:
                        o oVar2 = kVar.a;
                        j3 k22 = oVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.a);
                                m0Var.w1(a10);
                                m0Var.g2 = new t6(k22, 15);
                                m0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.M(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        e2 e2Var = kVar.a.r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        e2 e2Var2 = kVar.a.r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.n, context2, new t6(kVar2, 16), oVar3.a).show();
                        break;
                    case 10:
                        o.Q(kVar.a);
                        break;
                    default:
                        o oVar4 = kVar.a;
                        oVar4.r.j4 = null;
                        o.T(oVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout6.addView(v1Var5, ma.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.M = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        Drawable d08 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i10, i6Var));
        f(linearLayout7, i10, d08);
        linearLayout7.setBackground(new y1(d08));
        d61Var.addView(linearLayout7, 0, ma.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        v1 v1Var6 = new v1(R.drawable.input_ai, context, i6Var);
        v1Var6.setImageDrawable(new org.telegram.ui.ActionBar.w2(context));
        v1Var6.c(i10);
        v1Var6.setContentDescription(gd.M0(2131755006, null));
        final int i23 = 5;
        v1Var6.setOnClickListener(new View.OnClickListener() { // from class: oi.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i23) {
                    case 0:
                        o oVar = kVar.a;
                        oVar.r.T4();
                        oVar.b0();
                        break;
                    case 1:
                        kVar.a.r.c4(view3);
                        break;
                    case 2:
                        kVar.a.r.d4();
                        break;
                    case 3:
                        kVar.a.r.a4();
                        break;
                    case 4:
                        kVar.a.r.e4();
                        break;
                    case 5:
                        o oVar2 = kVar.a;
                        j3 k22 = oVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.a);
                                m0Var.w1(a10);
                                m0Var.g2 = new t6(k22, 15);
                                m0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.M(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        e2 e2Var = kVar.a.r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        e2 e2Var2 = kVar.a.r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.n, context2, new t6(kVar2, 16), oVar3.a).show();
                        break;
                    case 10:
                        o.Q(kVar.a);
                        break;
                    default:
                        o oVar4 = kVar.a;
                        oVar4.r.j4 = null;
                        o.T(oVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout7.addView(v1Var6, ma.r(38, 38, 16));
        u1 u1Var = new u1(this, context, i6Var);
        this.G = u1Var;
        int i24 = n6.Pe;
        Drawable d09 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.w0(i24, i6Var));
        f(u1Var, i24, d09);
        u1Var.setBackground(new y1(d09));
        ra.a(u1Var);
        linearLayout2.addView(u1Var, ma.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        u1Var.setContentDescription("Send");
        final int i25 = 6;
        u1Var.setOnClickListener(new View.OnClickListener() { // from class: oi.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i25) {
                    case 0:
                        o oVar = kVar.a;
                        oVar.r.T4();
                        oVar.b0();
                        break;
                    case 1:
                        kVar.a.r.c4(view3);
                        break;
                    case 2:
                        kVar.a.r.d4();
                        break;
                    case 3:
                        kVar.a.r.a4();
                        break;
                    case 4:
                        kVar.a.r.e4();
                        break;
                    case 5:
                        o oVar2 = kVar.a;
                        j3 k22 = oVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(oVar2.getContext(), oVar2.a);
                                m0Var.w1(a10);
                                m0Var.g2 = new t6(k22, 15);
                                m0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        kVar.a.M(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        e2 e2Var = kVar.a.r.R3;
                        if (e2Var != null) {
                            e2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        e2 e2Var2 = kVar.a.r.R3;
                        if (e2Var2 != null) {
                            e2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        k kVar2 = kVar;
                        o oVar3 = kVar2.a;
                        Context context2 = oVar3.getContext();
                        new u(oVar3.n, context2, new t6(kVar2, 16), oVar3.a).show();
                        break;
                    case 10:
                        o.Q(kVar.a);
                        break;
                    default:
                        o oVar4 = kVar.a;
                        oVar4.r.j4 = null;
                        o.T(oVar4, 90, 0);
                        break;
                }
            }
        });
        u1Var.setOnLongClickListener(new hi.o4(kVar, i23));
        g(0, false);
    }

    public final void a(int i7, int i10, boolean z10) {
        LinearLayout linearLayout = this.E;
        v1 v1Var = new v1(i7, linearLayout.getContext(), this.b);
        v1Var.c(n6.d6);
        if (z10) {
            v1Var.d();
            this.W.add(v1Var);
        }
        v1Var.setTag(Integer.valueOf(i10));
        v1Var.setContentDescription(z1.l0(i10));
        v1Var.setOnClickListener(new v3(this, i10, 1));
        this.U.add(v1Var);
        linearLayout.addView(v1Var, ma.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void b(int i7, int i10, boolean z10) {
        v1 v1Var = new v1(i7, getContext(), this.b);
        v1Var.c(n6.Pl);
        if (z10) {
            v1Var.d();
            this.W.add(v1Var);
        }
        v1Var.setTag(Integer.valueOf(i10));
        v1Var.setContentDescription(z1.n0(i10));
        v1Var.setOnClickListener(new v3(this, i10, 0));
        this.V.add(v1Var);
        LinearLayout linearLayout = this.K;
        linearLayout.addView(v1Var, ma.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void c(int i7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v1 v1Var = (v1) obj;
            int intValue = ((Integer) v1Var.getTag()).intValue();
            v1Var.setSelected((i7 & intValue) != 0);
            if (intValue == 1 || intValue == 2) {
                v1Var.setEnabled(z14);
            }
        }
        v1 v1Var2 = this.P;
        v1Var2.setSelected(z10);
        v1 v1Var3 = this.R;
        v1Var3.setSelected(z11);
        v1Var2.setEnabled(z12);
        this.Q.setEnabled(z13);
        v1Var3.setEnabled(z12);
        this.S.setEnabled(z12);
    }

    public final void d(int i7, int i10) {
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            v1 v1Var = (v1) obj;
            boolean z10 = i7 == ((Integer) v1Var.getTag()).intValue();
            v1Var.setSelected(z10);
            if (!z10 || i10 == 0) {
                v1Var.a();
            } else {
                v1Var.e(i10);
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (this.d0 == z10 && z11) {
            return;
        }
        this.d0 = z10;
        float f10 = z10 ? 1.15f : 1.0f;
        ph0 ph0Var = this.J;
        if (z11) {
            ph0Var.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(lr.h).start();
        } else {
            ph0Var.animate().cancel();
            ph0Var.setScaleX(f10);
            ph0Var.setScaleY(f10);
        }
        ph0Var.setColorFilter(new PorterDuffColorFilter(n6.w0(z10 ? n6.q7 : n6.G6, this.b), PorterDuff.Mode.SRC_IN));
        mh0 animatedDrawable = ph0Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z10) {
                if (animatedDrawable.b0 > 34) {
                    animatedDrawable.N(0, false, false);
                }
                animatedDrawable.P(33);
            } else {
                animatedDrawable.P(0);
            }
            animatedDrawable.start();
        }
    }

    public final void f(View view, int i7, Drawable drawable) {
        this.g0.add(view);
        this.h0.add(drawable);
        this.i0.add(Integer.valueOf(i7));
        i6 i6Var = this.b;
        this.j0.add(Integer.valueOf(n6.w0(i7, i6Var)));
        this.k0.add(Integer.valueOf(drawable instanceof RippleDrawable ? n6.w(n6.w0(i7, i6Var), n6.w0(n6.i6, i6Var)) : 0));
    }

    public final void g(int i7, boolean z10) {
        if (this.b0 == i7) {
            return;
        }
        this.b0 = i7;
        FrameLayout frameLayout = this.I;
        d61 d61Var = this.H;
        LinearLayout linearLayout = this.x;
        if (z10) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator duration = linearLayout.animate().alpha(i7 == 0 ? 1.0f : 0.0f).scaleX(i7 == 0 ? 1.0f : 0.8f).scaleY(i7 == 0 ? 1.0f : 0.8f).translationY(i7 == 0 ? 0.0f : org.telegram.messenger.g0.L(30.0f)).setDuration(420L);
            lr lrVar = lr.h;
            final int i10 = 0;
            duration.setInterpolator(lrVar).withEndAction(new Runnable(this) { // from class: oi.u3
                public final /* synthetic */ x3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            x3 x3Var = this.b;
                            if (x3Var.b0 != 0) {
                                x3Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            x3 x3Var2 = this.b;
                            if (x3Var2.b0 != 1) {
                                x3Var2.H.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            x3 x3Var3 = this.b;
                            if (x3Var3.b0 != 2) {
                                x3Var3.I.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            d61Var.setVisibility(0);
            final int i11 = 1;
            d61Var.animate().alpha(i7 == 1 ? 1.0f : 0.0f).scaleX(i7 == 1 ? 1.0f : 0.8f).scaleY(i7 == 1 ? 1.0f : 0.8f).translationY(i7 == 1 ? 0.0f : org.telegram.messenger.g0.L(30.0f)).setDuration(420L).setInterpolator(lrVar).withEndAction(new Runnable(this) { // from class: oi.u3
                public final /* synthetic */ x3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            x3 x3Var = this.b;
                            if (x3Var.b0 != 0) {
                                x3Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            x3 x3Var2 = this.b;
                            if (x3Var2.b0 != 1) {
                                x3Var2.H.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            x3 x3Var3 = this.b;
                            if (x3Var3.b0 != 2) {
                                x3Var3.I.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator scaleX = frameLayout.animate().alpha(i7 == 2 ? 1.0f : 0.0f).scaleX(i7 == 2 ? 1.0f : 0.8f);
            final int i12 = 2;
            scaleX.scaleY(i7 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(lrVar).withEndAction(new Runnable(this) { // from class: oi.u3
                public final /* synthetic */ x3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            x3 x3Var = this.b;
                            if (x3Var.b0 != 0) {
                                x3Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            x3 x3Var2 = this.b;
                            if (x3Var2.b0 != 1) {
                                x3Var2.H.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            x3 x3Var3 = this.b;
                            if (x3Var3.b0 != 2) {
                                x3Var3.I.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        linearLayout.setVisibility(i7 == 0 ? 0 : 8);
        linearLayout.setAlpha(i7 == 0 ? 1.0f : 0.0f);
        linearLayout.setScaleX(i7 == 0 ? 1.0f : 0.8f);
        linearLayout.setScaleY(i7 == 0 ? 1.0f : 0.8f);
        linearLayout.setTranslationY(i7 == 0 ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        d61Var.setVisibility(i7 == 1 ? 0 : 8);
        d61Var.setAlpha(i7 == 1 ? 1.0f : 0.0f);
        d61Var.setScaleX(i7 == 1 ? 1.0f : 0.8f);
        d61Var.setScaleY(i7 == 1 ? 1.0f : 0.8f);
        d61Var.setTranslationY(i7 == 1 ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        frameLayout.setVisibility(i7 != 2 ? 8 : 0);
        frameLayout.setAlpha(i7 == 2 ? 1.0f : 0.0f);
        frameLayout.setScaleX(i7 == 2 ? 1.0f : 0.8f);
        frameLayout.setScaleY(i7 == 2 ? 1.0f : 0.8f);
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

    public sg getSendButton() {
        return this.G;
    }

    public void setBackVisible(boolean z10) {
        this.f.setVisibility(z10 ? 0 : 8);
    }

    public void setBottomGradientTranslationY(float f10) {
        this.d.setTranslationY(f10);
    }

    public void setEmojiOpened(boolean z10) {
        wg wgVar = z10 ? wg.d : wg.e;
        yg ygVar = this.y;
        ygVar.j(wgVar, true);
        ygVar.setContentDescription(z10 ? "Keyboard" : "Emoji");
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((v1) obj).setPremiumLocked(z10);
        }
    }

    public void setQuoteState(boolean z10) {
        this.T.setSelected(z10);
    }

    public void setSelectedBlockType(int i7) {
        d(i7, 0);
    }

    public void setSendEditing(boolean z10) {
        this.G.setResourceId(z10 ? R.drawable.input_done : R.drawable.send_plane_24);
    }

    public void setSendEnabled(boolean z10) {
        u1 u1Var = this.G;
        if (u1Var.isEnabled() == z10) {
            return;
        }
        u1Var.setEnabled(z10);
        n10.n(u1Var.animate(), z10 ? 1.0f : 0.5f, 150L);
    }

    public void setSendLoading(boolean z10) {
        if (this.a0 == z10) {
            return;
        }
        this.a0 = z10;
        this.G.invalidate();
    }

    public void setTopButtonsOffset(int i7) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i7) {
            layoutParams.topMargin = i7;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i7) {
            layoutParams2.topMargin = i7;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public void setTopGradientVisible(boolean z10) {
        this.c.setVisibility(z10 ? 0 : 8);
    }

    public void setTopPanelVisible(boolean z10) {
        this.e.setVisibility(z10 ? 0 : 8);
        this.c.setVisibility(z10 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[Catch: Exception -> 0x0016, TRY_LEAVE, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0007, B:5:0x0011, B:9:0x003e, B:11:0x0044, B:14:0x0060, B:16:0x0076, B:17:0x007c, B:19:0x0088, B:21:0x00a5, B:26:0x00af, B:28:0x00b9, B:32:0x0093, B:34:0x009f, B:39:0x00c4, B:41:0x00c8, B:42:0x00cd, B:44:0x00d5, B:48:0x00d9, B:51:0x00cb, B:53:0x0019, B:55:0x0022, B:56:0x002d, B:58:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0007, B:5:0x0011, B:9:0x003e, B:11:0x0044, B:14:0x0060, B:16:0x0076, B:17:0x007c, B:19:0x0088, B:21:0x00a5, B:26:0x00af, B:28:0x00b9, B:32:0x0093, B:34:0x009f, B:39:0x00c4, B:41:0x00c8, B:42:0x00cd, B:44:0x00d5, B:48:0x00d9, B:51:0x00cb, B:53:0x0019, B:55:0x0022, B:56:0x002d, B:58:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[Catch: Exception -> 0x0016, TRY_ENTER, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0007, B:5:0x0011, B:9:0x003e, B:11:0x0044, B:14:0x0060, B:16:0x0076, B:17:0x007c, B:19:0x0088, B:21:0x00a5, B:26:0x00af, B:28:0x00b9, B:32:0x0093, B:34:0x009f, B:39:0x00c4, B:41:0x00c8, B:42:0x00cd, B:44:0x00d5, B:48:0x00d9, B:51:0x00cb, B:53:0x0019, B:55:0x0022, B:56:0x002d, B:58:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        int i7;
        ph0 ph0Var;
        boolean z10;
        View view;
        ArrayList arrayList = this.k0;
        ArrayList arrayList2 = this.h0;
        i6 i6Var = this.b;
        try {
            int w02 = n6.w0(n6.d6, i6Var);
            if (this.m0) {
                if (w02 != this.l0) {
                }
                for (i7 = 0; i7 < arrayList2.size(); i7++) {
                    Drawable drawable = (Drawable) arrayList2.get(i7);
                    int w03 = n6.w0(((Integer) this.i0.get(i7)).intValue(), i6Var);
                    boolean z11 = drawable instanceof RippleDrawable;
                    ArrayList arrayList3 = this.j0;
                    if (z11) {
                        int w10 = n6.w(w03, n6.w0(n6.i6, i6Var));
                        if (w03 != ((Integer) arrayList3.get(i7)).intValue()) {
                            n6.H1(drawable, w03, false);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (w10 != ((Integer) arrayList.get(i7)).intValue()) {
                            arrayList.set(i7, Integer.valueOf(w10));
                            n6.H1(drawable, w10, true);
                            z10 = true;
                        }
                        arrayList3.set(i7, Integer.valueOf(w03));
                        if (!z10 && (view = (View) this.g0.get(i7)) != null) {
                            view.invalidate();
                        }
                    } else if (w03 != ((Integer) arrayList3.get(i7)).intValue()) {
                        n6.C1(w03, drawable);
                        z10 = true;
                        arrayList3.set(i7, Integer.valueOf(w03));
                        if (!z10) {
                            view.invalidate();
                        }
                    } else {
                        z10 = false;
                        arrayList3.set(i7, Integer.valueOf(w03));
                        if (!z10) {
                        }
                    }
                }
                ph0Var = this.J;
                if (ph0Var == null) {
                    int w04 = n6.w0(this.d0 ? n6.q7 : n6.G6, i6Var);
                    if (this.o0 && w04 == this.n0) {
                        return;
                    }
                    this.o0 = true;
                    this.n0 = w04;
                    ph0Var.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.SRC_IN));
                    return;
                }
                return;
            }
            this.m0 = true;
            this.l0 = w02;
            GradientDrawable gradientDrawable = this.e0;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(new int[]{w02, n6.r1(0.0f, w02)});
            }
            GradientDrawable gradientDrawable2 = this.f0;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColors(new int[]{n6.r1(0.0f, w02), w02});
            }
            while (i7 < arrayList2.size()) {
            }
            ph0Var = this.J;
            if (ph0Var == null) {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

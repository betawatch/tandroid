package mi;

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
import b8.mf;
import b8.pf;
import gi.j8;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.xq;
import org.telegram.ui.s51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class y3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final LinearLayout E;
    public final ImageView F;
    public final x1 G;
    public final s51 H;
    public final FrameLayout I;
    public final fh0 J;
    public final LinearLayout K;
    public int L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final LinearLayout O;
    public final y1 P;
    public final y1 Q;
    public final y1 R;
    public final y1 S;
    public final y1 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public final l a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.e6 b;
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
    public final hg y;

    public y3(Context context, final l lVar) {
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
        this.a = lVar;
        org.telegram.ui.ActionBar.e6 e6Var = lVar.a.a;
        this.b = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i3 = k6.d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{k6.w0(i3, e6Var), k6.r1(0.0f, k6.w0(i3, e6Var))});
        this.e0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, mf.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{k6.r1(0.0f, k6.w0(i3, e6Var)), k6.w0(i3, e6Var)});
        this.f0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, mf.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, mf.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = k6.Ml;
        int w02 = k6.w0(i10, e6Var);
        int w03 = k6.w0(i10, e6Var);
        int i11 = k6.i6;
        Drawable b02 = k6.b0(w02, k6.w(w03, k6.w0(i11, e6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView, i10, b02);
        imageView.setBackground(new b2(b02));
        int i12 = k6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView, i12, e6Var, mode);
        pf.a(imageView);
        imageView.setContentDescription(bd.M0(2131754878, null));
        imageView.setOnClickListener(new ai.t(lVar, 10));
        frameLayout.addView(imageView, mf.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        Drawable d02 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i10, e6Var));
        f(linearLayout, i10, d02);
        linearLayout.setBackground(new b2(d02));
        frameLayout.addView(linearLayout, mf.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = k6.h0(k6.w0(i11, e6Var), 1, -1);
        n6 N = r6.N(i11);
        imageView2.setBackground(h02);
        r6.k(imageView2, h02, null, N, e6Var);
        r6.t(imageView2, i12, e6Var, mode);
        pf.a(imageView2);
        imageView2.setContentDescription("Undo");
        final int i13 = 7;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: mi.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        p pVar = lVar.a;
                        pVar.r.T4();
                        pVar.b0();
                        break;
                    case 1:
                        lVar.a.r.c4(view3);
                        break;
                    case 2:
                        lVar.a.r.d4();
                        break;
                    case 3:
                        lVar.a.r.a4();
                        break;
                    case 4:
                        lVar.a.r.e4();
                        break;
                    case 5:
                        p pVar2 = lVar.a;
                        k3 k22 = pVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.s1(a10);
                                e0Var.d2 = new j8(k22, 12);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        g2 g2Var = lVar.a.r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        g2 g2Var2 = lVar.a.r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new j8(lVar2, 13), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.j4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView2, mf.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = k6.h0(k6.w0(i11, e6Var), 1, -1);
        n6 N2 = r6.N(i11);
        imageView3.setBackground(h03);
        r6.k(imageView3, h03, null, N2, e6Var);
        r6.t(imageView3, i12, e6Var, mode);
        pf.a(imageView3);
        imageView3.setContentDescription("Redo");
        final int i14 = 8;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: mi.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        p pVar = lVar.a;
                        pVar.r.T4();
                        pVar.b0();
                        break;
                    case 1:
                        lVar.a.r.c4(view3);
                        break;
                    case 2:
                        lVar.a.r.d4();
                        break;
                    case 3:
                        lVar.a.r.a4();
                        break;
                    case 4:
                        lVar.a.r.e4();
                        break;
                    case 5:
                        p pVar2 = lVar.a;
                        k3 k22 = pVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.s1(a10);
                                e0Var.d2 = new j8(k22, 12);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        g2 g2Var = lVar.a.r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        g2 g2Var2 = lVar.a.r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new j8(lVar2, 13), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.j4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView3, mf.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, mf.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, mf.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout3.addView(linearLayout2, mf.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.ActionBar.s2(context));
        imageView4.setScaleType(scaleType);
        r6.t(imageView4, i12, e6Var, mode);
        Drawable b03 = k6.b0(k6.w0(i10, e6Var), k6.w(k6.w0(i10, e6Var), k6.w0(i11, e6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView4, i10, b03);
        imageView4.setBackground(new b2(b03));
        linearLayout2.addView(imageView4, mf.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        pf.a(imageView4);
        imageView4.setContentDescription("AI");
        final int i15 = 9;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: mi.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        p pVar = lVar.a;
                        pVar.r.T4();
                        pVar.b0();
                        break;
                    case 1:
                        lVar.a.r.c4(view3);
                        break;
                    case 2:
                        lVar.a.r.d4();
                        break;
                    case 3:
                        lVar.a.r.a4();
                        break;
                    case 4:
                        lVar.a.r.e4();
                        break;
                    case 5:
                        p pVar2 = lVar.a;
                        k3 k22 = pVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.s1(a10);
                                e0Var.d2 = new j8(k22, 12);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        g2 g2Var = lVar.a.r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        g2 g2Var2 = lVar.a.r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new j8(lVar2, 13), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.j4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        Drawable d03 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i3, e6Var));
        f(frameLayout5, i3, d03);
        frameLayout5.setBackground(new b2(d03));
        frameLayout4.addView(frameLayout5, mf.e(-2, 44, 81));
        v1 v1Var = new v1(context, 1);
        v1Var.setClipToOutline(true);
        v1Var.setOutlineProvider(new cg.p0(7));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        v1Var.addView(linearLayout3);
        frameLayout5.addView(v1Var, mf.c(-1.0f, -1));
        hg hgVar = new hg(context, 24);
        this.y = hgVar;
        hgVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        r6.t(hgVar, i12, e6Var, mode);
        org.telegram.ui.Cells.y b04 = k6.b0(k6.w0(i3, e6Var), k6.w0(i11, e6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        n6 N3 = r6.N(i3);
        n6 N4 = r6.N(i11);
        hgVar.setBackground(b04);
        r6.k(hgVar, b04, N3, N4, e6Var);
        hgVar.j(fg.e, false);
        linearLayout3.addView(hgVar, mf.r(38, 38, 16));
        pf.a(hgVar);
        hgVar.setContentDescription("Emoji");
        final int i16 = 10;
        hgVar.setOnClickListener(new View.OnClickListener() { // from class: mi.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        p pVar = lVar.a;
                        pVar.r.T4();
                        pVar.b0();
                        break;
                    case 1:
                        lVar.a.r.c4(view3);
                        break;
                    case 2:
                        lVar.a.r.d4();
                        break;
                    case 3:
                        lVar.a.r.a4();
                        break;
                    case 4:
                        lVar.a.r.e4();
                        break;
                    case 5:
                        p pVar2 = lVar.a;
                        k3 k22 = pVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.s1(a10);
                                e0Var.d2 = new j8(k22, 12);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        g2 g2Var = lVar.a.r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        g2 g2Var2 = lVar.a.r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new j8(lVar2, 13), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.j4 = null;
                        p.S(pVar4, 90, 0);
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
        r6.t(imageView5, i12, e6Var, mode);
        org.telegram.ui.Cells.y b05 = k6.b0(k6.w0(i3, e6Var), k6.w0(i11, e6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        n6 N5 = r6.N(i3);
        n6 N6 = r6.N(i11);
        imageView5.setBackground(b05);
        r6.k(imageView5, b05, N5, N6, e6Var);
        linearLayout3.addView(imageView5, mf.t(38, 38, 16, 2, 0, 0, 0));
        pf.a(imageView5);
        imageView5.setContentDescription("Attach");
        final int i17 = 11;
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: mi.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        p pVar = lVar.a;
                        pVar.r.T4();
                        pVar.b0();
                        break;
                    case 1:
                        lVar.a.r.c4(view3);
                        break;
                    case 2:
                        lVar.a.r.d4();
                        break;
                    case 3:
                        lVar.a.r.a4();
                        break;
                    case 4:
                        lVar.a.r.e4();
                        break;
                    case 5:
                        p pVar2 = lVar.a;
                        k3 k22 = pVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.s1(a10);
                                e0Var.d2 = new j8(k22, 12);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        g2 g2Var = lVar.a.r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        g2 g2Var2 = lVar.a.r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new j8(lVar2, 13), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.j4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout2.addView(frameLayout4, mf.l(1.0f, 0, 44));
        s51 s51Var = new s51(8, context, this);
        this.H = s51Var;
        s51Var.setOrientation(0);
        s51Var.setClipToPadding(false);
        s51Var.setClipChildren(false);
        s51Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(s51Var, mf.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.I = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(frameLayout6, mf.e(80, 60, 81));
        fh0 fh0Var = new fh0(context);
        this.J = fh0Var;
        fh0Var.f(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        fh0Var.setScaleType(scaleType);
        fh0Var.setColorFilter(new PorterDuffColorFilter(k6.w0(i12, e6Var), mode));
        Drawable d04 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i10, e6Var));
        f(fh0Var, i10, d04);
        fh0Var.setBackground(new b2(d04));
        frameLayout6.addView(fh0Var, mf.e(-1, -1, hs.E1));
        FrameLayout frameLayout7 = new FrameLayout(context);
        Drawable d05 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i10, e6Var));
        f(frameLayout7, i10, d05);
        frameLayout7.setBackground(new b2(d05));
        s51Var.addView(frameLayout7, mf.c(44.0f, -2));
        x3 x3Var = new x3(this, context, 0);
        x3Var.setHorizontalScrollBarEnabled(false);
        x3Var.setClipToOutline(true);
        x3Var.setOutlineProvider(new cg.p0(8));
        frameLayout7.addView(x3Var, mf.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.K = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        x3Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, TLObject.FLAG_14, true);
        b(R.drawable.iv_super, 32768, true);
        y1 y1Var = new y1(R.drawable.iv_quote, context, e6Var);
        this.T = y1Var;
        y1Var.c(i10);
        y1Var.setContentDescription(bd.M0(2131746448, null));
        final int i18 = 0;
        y1Var.setOnClickListener(new View.OnClickListener() { // from class: mi.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        p pVar = lVar.a;
                        pVar.r.T4();
                        pVar.b0();
                        break;
                    case 1:
                        lVar.a.r.c4(view3);
                        break;
                    case 2:
                        lVar.a.r.d4();
                        break;
                    case 3:
                        lVar.a.r.a4();
                        break;
                    case 4:
                        lVar.a.r.e4();
                        break;
                    case 5:
                        p pVar2 = lVar.a;
                        k3 k22 = pVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.s1(a10);
                                e0Var.d2 = new j8(k22, 12);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        g2 g2Var = lVar.a.r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        g2 g2Var2 = lVar.a.r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new j8(lVar2, 13), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.j4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(y1Var, mf.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        y1 y1Var2 = new y1(R.drawable.iv_button, context, e6Var);
        this.Q = y1Var2;
        y1Var2.c(i10);
        y1Var2.setContentDescription(bd.M0(2131746021, null));
        final int i19 = 1;
        y1Var2.setOnClickListener(new View.OnClickListener() { // from class: mi.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i19) {
                    case 0:
                        p pVar = lVar.a;
                        pVar.r.T4();
                        pVar.b0();
                        break;
                    case 1:
                        lVar.a.r.c4(view3);
                        break;
                    case 2:
                        lVar.a.r.d4();
                        break;
                    case 3:
                        lVar.a.r.a4();
                        break;
                    case 4:
                        lVar.a.r.e4();
                        break;
                    case 5:
                        p pVar2 = lVar.a;
                        k3 k22 = pVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.s1(a10);
                                e0Var.d2 = new j8(k22, 12);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        g2 g2Var = lVar.a.r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        g2 g2Var2 = lVar.a.r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new j8(lVar2, 13), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.j4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(y1Var2, mf.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.N = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        Drawable d06 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i10, e6Var));
        f(linearLayout5, i10, d06);
        linearLayout5.setBackground(new b2(d06));
        s51Var.addView(linearLayout5, mf.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var3 = new y1(R.drawable.media_link_24, context, e6Var);
        this.P = y1Var3;
        y1Var3.c(i10);
        y1Var3.setContentDescription(bd.M0(2131751745, null));
        final int i20 = 2;
        y1Var3.setOnClickListener(new View.OnClickListener() { // from class: mi.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i20) {
                    case 0:
                        p pVar = lVar.a;
                        pVar.r.T4();
                        pVar.b0();
                        break;
                    case 1:
                        lVar.a.r.c4(view3);
                        break;
                    case 2:
                        lVar.a.r.d4();
                        break;
                    case 3:
                        lVar.a.r.a4();
                        break;
                    case 4:
                        lVar.a.r.e4();
                        break;
                    case 5:
                        p pVar2 = lVar.a;
                        k3 k22 = pVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.s1(a10);
                                e0Var.d2 = new j8(k22, 12);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        g2 g2Var = lVar.a.r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        g2 g2Var2 = lVar.a.r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new j8(lVar2, 13), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.j4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(y1Var3, mf.r(38, 38, 16));
        y1 y1Var4 = new y1(R.drawable.msg_calendar2, context, e6Var);
        this.R = y1Var4;
        y1Var4.c(i10);
        y1Var4.setContentDescription(bd.M0(2131754862, null));
        final int i21 = 3;
        y1Var4.setOnClickListener(new View.OnClickListener() { // from class: mi.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i21) {
                    case 0:
                        p pVar = lVar.a;
                        pVar.r.T4();
                        pVar.b0();
                        break;
                    case 1:
                        lVar.a.r.c4(view3);
                        break;
                    case 2:
                        lVar.a.r.d4();
                        break;
                    case 3:
                        lVar.a.r.a4();
                        break;
                    case 4:
                        lVar.a.r.e4();
                        break;
                    case 5:
                        p pVar2 = lVar.a;
                        k3 k22 = pVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.s1(a10);
                                e0Var.d2 = new j8(k22, 12);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        g2 g2Var = lVar.a.r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        g2 g2Var2 = lVar.a.r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new j8(lVar2, 13), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.j4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(y1Var4, mf.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.O = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        Drawable d07 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i10, e6Var));
        f(linearLayout6, i10, d07);
        linearLayout6.setBackground(new b2(d07));
        s51Var.addView(linearLayout6, mf.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var5 = new y1(R.drawable.iv_math, context, e6Var);
        this.S = y1Var5;
        y1Var5.c(i10);
        y1Var5.d();
        arrayList.add(y1Var5);
        y1Var5.setContentDescription(bd.M0(2131754864, null));
        final int i22 = 4;
        y1Var5.setOnClickListener(new View.OnClickListener() { // from class: mi.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i22) {
                    case 0:
                        p pVar = lVar.a;
                        pVar.r.T4();
                        pVar.b0();
                        break;
                    case 1:
                        lVar.a.r.c4(view3);
                        break;
                    case 2:
                        lVar.a.r.d4();
                        break;
                    case 3:
                        lVar.a.r.a4();
                        break;
                    case 4:
                        lVar.a.r.e4();
                        break;
                    case 5:
                        p pVar2 = lVar.a;
                        k3 k22 = pVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.s1(a10);
                                e0Var.d2 = new j8(k22, 12);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        g2 g2Var = lVar.a.r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        g2 g2Var2 = lVar.a.r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new j8(lVar2, 13), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.j4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout6.addView(y1Var5, mf.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.M = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        Drawable d08 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i10, e6Var));
        f(linearLayout7, i10, d08);
        linearLayout7.setBackground(new b2(d08));
        s51Var.addView(linearLayout7, 0, mf.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        y1 y1Var6 = new y1(R.drawable.input_ai, context, e6Var);
        y1Var6.setImageDrawable(new org.telegram.ui.ActionBar.s2(context));
        y1Var6.c(i10);
        y1Var6.setContentDescription(bd.M0(2131755006, null));
        final int i23 = 5;
        y1Var6.setOnClickListener(new View.OnClickListener() { // from class: mi.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i23) {
                    case 0:
                        p pVar = lVar.a;
                        pVar.r.T4();
                        pVar.b0();
                        break;
                    case 1:
                        lVar.a.r.c4(view3);
                        break;
                    case 2:
                        lVar.a.r.d4();
                        break;
                    case 3:
                        lVar.a.r.a4();
                        break;
                    case 4:
                        lVar.a.r.e4();
                        break;
                    case 5:
                        p pVar2 = lVar.a;
                        k3 k22 = pVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.s1(a10);
                                e0Var.d2 = new j8(k22, 12);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        g2 g2Var = lVar.a.r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        g2 g2Var2 = lVar.a.r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new j8(lVar2, 13), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.j4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout7.addView(y1Var6, mf.r(38, 38, 16));
        x1 x1Var = new x1(this, context, e6Var);
        this.G = x1Var;
        int i24 = k6.Me;
        Drawable d09 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i24, e6Var));
        f(x1Var, i24, d09);
        x1Var.setBackground(new b2(d09));
        pf.a(x1Var);
        linearLayout2.addView(x1Var, mf.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        x1Var.setContentDescription("Send");
        final int i25 = 6;
        x1Var.setOnClickListener(new View.OnClickListener() { // from class: mi.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i25) {
                    case 0:
                        p pVar = lVar.a;
                        pVar.r.T4();
                        pVar.b0();
                        break;
                    case 1:
                        lVar.a.r.c4(view3);
                        break;
                    case 2:
                        lVar.a.r.d4();
                        break;
                    case 3:
                        lVar.a.r.a4();
                        break;
                    case 4:
                        lVar.a.r.e4();
                        break;
                    case 5:
                        p pVar2 = lVar.a;
                        k3 k22 = pVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a10 = k22.a();
                            if (!a10.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(pVar2.getContext(), pVar2.a);
                                e0Var.s1(a10);
                                e0Var.d2 = new j8(k22, 12);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        g2 g2Var = lVar.a.r.R3;
                        if (g2Var != null) {
                            g2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        g2 g2Var2 = lVar.a.r.R3;
                        if (g2Var2 != null) {
                            g2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new j8(lVar2, 13), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.j4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        x1Var.setOnLongClickListener(new gi.p4(lVar, 4));
        g(0, false);
    }

    public final void a(int i3, int i10, boolean z10) {
        LinearLayout linearLayout = this.E;
        y1 y1Var = new y1(i3, linearLayout.getContext(), this.b);
        y1Var.c(k6.d6);
        if (z10) {
            y1Var.d();
            this.W.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i10));
        y1Var.setContentDescription(c2.l0(i10));
        y1Var.setOnClickListener(new w3(this, i10, 1));
        this.U.add(y1Var);
        linearLayout.addView(y1Var, mf.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void b(int i3, int i10, boolean z10) {
        y1 y1Var = new y1(i3, getContext(), this.b);
        y1Var.c(k6.Ml);
        if (z10) {
            y1Var.d();
            this.W.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i10));
        y1Var.setContentDescription(c2.n0(i10));
        y1Var.setOnClickListener(new w3(this, i10, 0));
        this.V.add(y1Var);
        LinearLayout linearLayout = this.K;
        linearLayout.addView(y1Var, mf.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void c(int i3, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y1 y1Var = (y1) obj;
            int intValue = ((Integer) y1Var.getTag()).intValue();
            y1Var.setSelected((i3 & intValue) != 0);
            if (intValue == 1 || intValue == 2) {
                y1Var.setEnabled(z14);
            }
        }
        y1 y1Var2 = this.P;
        y1Var2.setSelected(z10);
        y1 y1Var3 = this.R;
        y1Var3.setSelected(z11);
        y1Var2.setEnabled(z12);
        this.Q.setEnabled(z13);
        y1Var3.setEnabled(z12);
        this.S.setEnabled(z12);
    }

    public final void d(int i3, int i10) {
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            y1 y1Var = (y1) obj;
            boolean z10 = i3 == ((Integer) y1Var.getTag()).intValue();
            y1Var.setSelected(z10);
            if (!z10 || i10 == 0) {
                y1Var.a();
            } else {
                y1Var.e(i10);
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (this.d0 == z10 && z11) {
            return;
        }
        this.d0 = z10;
        float f10 = z10 ? 1.15f : 1.0f;
        fh0 fh0Var = this.J;
        if (z11) {
            fh0Var.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(xq.h).start();
        } else {
            fh0Var.animate().cancel();
            fh0Var.setScaleX(f10);
            fh0Var.setScaleY(f10);
        }
        fh0Var.setColorFilter(new PorterDuffColorFilter(k6.w0(z10 ? k6.q7 : k6.G6, this.b), PorterDuff.Mode.SRC_IN));
        ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
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

    public final void f(View view, int i3, Drawable drawable) {
        this.g0.add(view);
        this.h0.add(drawable);
        this.i0.add(Integer.valueOf(i3));
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        this.j0.add(Integer.valueOf(k6.w0(i3, e6Var)));
        this.k0.add(Integer.valueOf(drawable instanceof RippleDrawable ? k6.w(k6.w0(i3, e6Var), k6.w0(k6.i6, e6Var)) : 0));
    }

    public final void g(int i3, boolean z10) {
        if (this.b0 == i3) {
            return;
        }
        this.b0 = i3;
        FrameLayout frameLayout = this.I;
        s51 s51Var = this.H;
        LinearLayout linearLayout = this.x;
        if (z10) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator duration = linearLayout.animate().alpha(i3 == 0 ? 1.0f : 0.0f).scaleX(i3 == 0 ? 1.0f : 0.8f).scaleY(i3 == 0 ? 1.0f : 0.8f).translationY(i3 == 0 ? 0.0f : org.telegram.messenger.g0.L(30.0f)).setDuration(420L);
            xq xqVar = xq.h;
            final int i10 = 0;
            duration.setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: mi.v3
                public final /* synthetic */ y3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            y3 y3Var = this.b;
                            if (y3Var.b0 != 0) {
                                y3Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            y3 y3Var2 = this.b;
                            if (y3Var2.b0 != 1) {
                                y3Var2.H.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            y3 y3Var3 = this.b;
                            if (y3Var3.b0 != 2) {
                                y3Var3.I.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            s51Var.setVisibility(0);
            final int i11 = 1;
            s51Var.animate().alpha(i3 == 1 ? 1.0f : 0.0f).scaleX(i3 == 1 ? 1.0f : 0.8f).scaleY(i3 == 1 ? 1.0f : 0.8f).translationY(i3 == 1 ? 0.0f : org.telegram.messenger.g0.L(30.0f)).setDuration(420L).setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: mi.v3
                public final /* synthetic */ y3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            y3 y3Var = this.b;
                            if (y3Var.b0 != 0) {
                                y3Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            y3 y3Var2 = this.b;
                            if (y3Var2.b0 != 1) {
                                y3Var2.H.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            y3 y3Var3 = this.b;
                            if (y3Var3.b0 != 2) {
                                y3Var3.I.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator scaleX = frameLayout.animate().alpha(i3 == 2 ? 1.0f : 0.0f).scaleX(i3 == 2 ? 1.0f : 0.8f);
            final int i12 = 2;
            scaleX.scaleY(i3 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: mi.v3
                public final /* synthetic */ y3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            y3 y3Var = this.b;
                            if (y3Var.b0 != 0) {
                                y3Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            y3 y3Var2 = this.b;
                            if (y3Var2.b0 != 1) {
                                y3Var2.H.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            y3 y3Var3 = this.b;
                            if (y3Var3.b0 != 2) {
                                y3Var3.I.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        linearLayout.setVisibility(i3 == 0 ? 0 : 8);
        linearLayout.setAlpha(i3 == 0 ? 1.0f : 0.0f);
        linearLayout.setScaleX(i3 == 0 ? 1.0f : 0.8f);
        linearLayout.setScaleY(i3 == 0 ? 1.0f : 0.8f);
        linearLayout.setTranslationY(i3 == 0 ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        s51Var.setVisibility(i3 == 1 ? 0 : 8);
        s51Var.setAlpha(i3 == 1 ? 1.0f : 0.0f);
        s51Var.setScaleX(i3 == 1 ? 1.0f : 0.8f);
        s51Var.setScaleY(i3 == 1 ? 1.0f : 0.8f);
        s51Var.setTranslationY(i3 == 1 ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        frameLayout.setVisibility(i3 != 2 ? 8 : 0);
        frameLayout.setAlpha(i3 == 2 ? 1.0f : 0.0f);
        frameLayout.setScaleX(i3 == 2 ? 1.0f : 0.8f);
        frameLayout.setScaleY(i3 == 2 ? 1.0f : 0.8f);
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

    public bg getSendButton() {
        return this.G;
    }

    public void setBackVisible(boolean z10) {
        this.f.setVisibility(z10 ? 0 : 8);
    }

    public void setBottomGradientTranslationY(float f10) {
        this.d.setTranslationY(f10);
    }

    public void setEmojiOpened(boolean z10) {
        fg fgVar = z10 ? fg.d : fg.e;
        hg hgVar = this.y;
        hgVar.j(fgVar, true);
        hgVar.setContentDescription(z10 ? "Keyboard" : "Emoji");
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((y1) obj).setPremiumLocked(z10);
        }
    }

    public void setQuoteState(boolean z10) {
        this.T.setSelected(z10);
    }

    public void setSelectedBlockType(int i3) {
        d(i3, 0);
    }

    public void setSendEditing(boolean z10) {
        this.G.setResourceId(z10 ? R.drawable.input_done : R.drawable.send_plane_24);
    }

    public void setSendEnabled(boolean z10) {
        x1 x1Var = this.G;
        if (x1Var.isEnabled() == z10) {
            return;
        }
        x1Var.setEnabled(z10);
        org.telegram.messenger.camera.q.k(x1Var.animate(), z10 ? 1.0f : 0.5f, 150L);
    }

    public void setSendLoading(boolean z10) {
        if (this.a0 == z10) {
            return;
        }
        this.a0 = z10;
        this.G.invalidate();
    }

    public void setTopButtonsOffset(int i3) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i3) {
            layoutParams.topMargin = i3;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i3) {
            layoutParams2.topMargin = i3;
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
    @Override // org.telegram.ui.ActionBar.z5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        int i3;
        fh0 fh0Var;
        boolean z10;
        View view;
        ArrayList arrayList = this.k0;
        ArrayList arrayList2 = this.h0;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        try {
            int w02 = k6.w0(k6.d6, e6Var);
            if (this.m0) {
                if (w02 != this.l0) {
                }
                for (i3 = 0; i3 < arrayList2.size(); i3++) {
                    Drawable drawable = (Drawable) arrayList2.get(i3);
                    int w03 = k6.w0(((Integer) this.i0.get(i3)).intValue(), e6Var);
                    boolean z11 = drawable instanceof RippleDrawable;
                    ArrayList arrayList3 = this.j0;
                    if (z11) {
                        int w10 = k6.w(w03, k6.w0(k6.i6, e6Var));
                        if (w03 != ((Integer) arrayList3.get(i3)).intValue()) {
                            k6.H1(drawable, w03, false);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (w10 != ((Integer) arrayList.get(i3)).intValue()) {
                            arrayList.set(i3, Integer.valueOf(w10));
                            k6.H1(drawable, w10, true);
                            z10 = true;
                        }
                        arrayList3.set(i3, Integer.valueOf(w03));
                        if (!z10 && (view = (View) this.g0.get(i3)) != null) {
                            view.invalidate();
                        }
                    } else if (w03 != ((Integer) arrayList3.get(i3)).intValue()) {
                        k6.C1(w03, drawable);
                        z10 = true;
                        arrayList3.set(i3, Integer.valueOf(w03));
                        if (!z10) {
                            view.invalidate();
                        }
                    } else {
                        z10 = false;
                        arrayList3.set(i3, Integer.valueOf(w03));
                        if (!z10) {
                        }
                    }
                }
                fh0Var = this.J;
                if (fh0Var == null) {
                    int w04 = k6.w0(this.d0 ? k6.q7 : k6.G6, e6Var);
                    if (this.o0 && w04 == this.n0) {
                        return;
                    }
                    this.o0 = true;
                    this.n0 = w04;
                    fh0Var.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.SRC_IN));
                    return;
                }
                return;
            }
            this.m0 = true;
            this.l0 = w02;
            GradientDrawable gradientDrawable = this.e0;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(new int[]{w02, k6.r1(0.0f, w02)});
            }
            GradientDrawable gradientDrawable2 = this.f0;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColors(new int[]{k6.r1(0.0f, w02), w02});
            }
            while (i3 < arrayList2.size()) {
            }
            fh0Var = this.J;
            if (fh0Var == null) {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

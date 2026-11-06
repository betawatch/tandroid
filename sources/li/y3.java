package li;

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
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.c61;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class y3 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final LinearLayout D;
    public final ImageView E;
    public final w1 F;
    public final c61 G;
    public final FrameLayout H;
    public final ch0 I;
    public final LinearLayout J;
    public int K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final x1 O;
    public final x1 P;
    public final x1 Q;
    public final x1 R;
    public final x1 S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final l a;
    public int a0;
    public final f6 b;
    public int b0;
    public final View c;
    public boolean c0;
    public final View d;
    public final GradientDrawable d0;
    public final FrameLayout e;
    public final GradientDrawable e0;
    public final ImageView f;
    public final ArrayList f0;
    public final ArrayList g0;
    public final LinearLayout h;
    public final ArrayList h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public int k0;
    public boolean l0;
    public int m0;
    public final ImageView n;
    public boolean n0;
    public final ImageView r;
    public final FrameLayout s;
    public final FrameLayout w;
    public final LinearLayout x;
    public final jg y;

    public y3(Context context, final l lVar) {
        super(context);
        this.K = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.T = new ArrayList();
        this.U = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        this.a0 = -1;
        this.b0 = 0;
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.h0 = new ArrayList();
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        this.a = lVar;
        f6 f6Var = lVar.a.a;
        this.b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i7 = k6.d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{k6.w0(i7, f6Var), k6.r1(0.0f, k6.w0(i7, f6Var))});
        this.d0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, ha.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{k6.r1(0.0f, k6.w0(i7, f6Var)), k6.w0(i7, f6Var)});
        this.e0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, ha.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, ha.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = k6.Ml;
        int w02 = k6.w0(i10, f6Var);
        int w03 = k6.w0(i10, f6Var);
        int i11 = k6.i6;
        Drawable b02 = k6.b0(w02, k6.w(w03, k6.w0(i11, f6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView, i10, b02);
        imageView.setBackground(new a2(b02));
        int i12 = k6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView, i12, f6Var, mode);
        ka.a(imageView);
        imageView.setContentDescription(hd.M0(2131754878, null));
        imageView.setOnClickListener(new bi.l1(lVar, 6));
        frameLayout.addView(imageView, ha.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        Drawable d02 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i10, f6Var));
        f(linearLayout, i10, d02);
        linearLayout.setBackground(new a2(d02));
        frameLayout.addView(linearLayout, ha.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = k6.h0(k6.w0(i11, f6Var), 1, -1);
        n6 N = r6.N(i11);
        imageView2.setBackground(h02);
        r6.k(imageView2, h02, null, N, f6Var);
        r6.t(imageView2, i12, f6Var, mode);
        ka.a(imageView2);
        imageView2.setContentDescription("Undo");
        final int i13 = 7;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: li.u3
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
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.s1(a10);
                                g0Var.c2 = new ii.c(k22, 9);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        f2 f2Var = lVar.a.r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        f2 f2Var2 = lVar.a.r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new ii.c(lVar2, 10), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.i4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView2, ha.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = k6.h0(k6.w0(i11, f6Var), 1, -1);
        n6 N2 = r6.N(i11);
        imageView3.setBackground(h03);
        r6.k(imageView3, h03, null, N2, f6Var);
        r6.t(imageView3, i12, f6Var, mode);
        ka.a(imageView3);
        imageView3.setContentDescription("Redo");
        final int i14 = 8;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: li.u3
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
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.s1(a10);
                                g0Var.c2 = new ii.c(k22, 9);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        f2 f2Var = lVar.a.r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        f2 f2Var2 = lVar.a.r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new ii.c(lVar2, 10), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.i4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView3, ha.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, ha.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, ha.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout3.addView(linearLayout2, ha.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.ActionBar.u2(context));
        imageView4.setScaleType(scaleType);
        r6.t(imageView4, i12, f6Var, mode);
        Drawable b03 = k6.b0(k6.w0(i10, f6Var), k6.w(k6.w0(i10, f6Var), k6.w0(i11, f6Var)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
        f(imageView4, i10, b03);
        imageView4.setBackground(new a2(b03));
        linearLayout2.addView(imageView4, ha.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ka.a(imageView4);
        imageView4.setContentDescription("AI");
        final int i15 = 9;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: li.u3
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
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.s1(a10);
                                g0Var.c2 = new ii.c(k22, 9);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        f2 f2Var = lVar.a.r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        f2 f2Var2 = lVar.a.r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new ii.c(lVar2, 10), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.i4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        Drawable d03 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i7, f6Var));
        f(frameLayout5, i7, d03);
        frameLayout5.setBackground(new a2(d03));
        frameLayout4.addView(frameLayout5, ha.e(-2, 44, 81));
        u1 u1Var = new u1(context, 1);
        u1Var.setClipToOutline(true);
        u1Var.setOutlineProvider(new bg.q0(6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.D = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        u1Var.addView(linearLayout3);
        frameLayout5.addView(u1Var, ha.c(-1.0f, -1));
        jg jgVar = new jg(context, 24);
        this.y = jgVar;
        jgVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        r6.t(jgVar, i12, f6Var, mode);
        org.telegram.ui.Cells.y b04 = k6.b0(k6.w0(i7, f6Var), k6.w0(i11, f6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        n6 N3 = r6.N(i7);
        n6 N4 = r6.N(i11);
        jgVar.setBackground(b04);
        r6.k(jgVar, b04, N3, N4, f6Var);
        jgVar.j(hg.e, false);
        linearLayout3.addView(jgVar, ha.r(38, 38, 16));
        ka.a(jgVar);
        jgVar.setContentDescription("Emoji");
        final int i16 = 10;
        jgVar.setOnClickListener(new View.OnClickListener() { // from class: li.u3
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
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.s1(a10);
                                g0Var.c2 = new ii.c(k22, 9);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        f2 f2Var = lVar.a.r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        f2 f2Var2 = lVar.a.r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new ii.c(lVar2, 10), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.i4 = null;
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
        this.E = imageView5;
        imageView5.setImageResource(R.drawable.outline_poll_attach_24);
        imageView5.setScaleType(scaleType);
        r6.t(imageView5, i12, f6Var, mode);
        org.telegram.ui.Cells.y b05 = k6.b0(k6.w0(i7, f6Var), k6.w0(i11, f6Var), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        n6 N5 = r6.N(i7);
        n6 N6 = r6.N(i11);
        imageView5.setBackground(b05);
        r6.k(imageView5, b05, N5, N6, f6Var);
        linearLayout3.addView(imageView5, ha.t(38, 38, 16, 2, 0, 0, 0));
        ka.a(imageView5);
        imageView5.setContentDescription("Attach");
        final int i17 = 11;
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: li.u3
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
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.s1(a10);
                                g0Var.c2 = new ii.c(k22, 9);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        f2 f2Var = lVar.a.r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        f2 f2Var2 = lVar.a.r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new ii.c(lVar2, 10), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.i4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout2.addView(frameLayout4, ha.l(1.0f, 0, 44));
        c61 c61Var = new c61(7, context, this);
        this.G = c61Var;
        c61Var.setOrientation(0);
        c61Var.setClipToPadding(false);
        c61Var.setClipChildren(false);
        c61Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(c61Var, ha.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.H = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(frameLayout6, ha.e(80, 60, 81));
        ch0 ch0Var = new ch0(context);
        this.I = ch0Var;
        ch0Var.f(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        zg0 animatedDrawable = ch0Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        ch0Var.setScaleType(scaleType);
        ch0Var.setColorFilter(new PorterDuffColorFilter(k6.w0(i12, f6Var), mode));
        Drawable d04 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i10, f6Var));
        f(ch0Var, i10, d04);
        ch0Var.setBackground(new a2(d04));
        frameLayout6.addView(ch0Var, ha.e(-1, -1, qs.E1));
        FrameLayout frameLayout7 = new FrameLayout(context);
        Drawable d05 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i10, f6Var));
        f(frameLayout7, i10, d05);
        frameLayout7.setBackground(new a2(d05));
        c61Var.addView(frameLayout7, ha.c(44.0f, -2));
        x3 x3Var = new x3(this, context, 0);
        x3Var.setHorizontalScrollBarEnabled(false);
        x3Var.setClipToOutline(true);
        x3Var.setOutlineProvider(new bg.q0(7));
        frameLayout7.addView(x3Var, ha.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.J = linearLayout4;
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
        x1 x1Var = new x1(R.drawable.iv_quote, context, f6Var);
        this.S = x1Var;
        x1Var.c(i10);
        x1Var.setContentDescription(hd.M0(2131746439, null));
        final int i18 = 0;
        x1Var.setOnClickListener(new View.OnClickListener() { // from class: li.u3
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
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.s1(a10);
                                g0Var.c2 = new ii.c(k22, 9);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        f2 f2Var = lVar.a.r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        f2 f2Var2 = lVar.a.r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new ii.c(lVar2, 10), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.i4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(x1Var, ha.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        x1 x1Var2 = new x1(R.drawable.iv_button, context, f6Var);
        this.P = x1Var2;
        x1Var2.c(i10);
        x1Var2.setContentDescription(hd.M0(2131746012, null));
        final int i19 = 1;
        x1Var2.setOnClickListener(new View.OnClickListener() { // from class: li.u3
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
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.s1(a10);
                                g0Var.c2 = new ii.c(k22, 9);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        f2 f2Var = lVar.a.r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        f2 f2Var2 = lVar.a.r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new ii.c(lVar2, 10), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.i4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(x1Var2, ha.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.M = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        Drawable d06 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i10, f6Var));
        f(linearLayout5, i10, d06);
        linearLayout5.setBackground(new a2(d06));
        c61Var.addView(linearLayout5, ha.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var3 = new x1(R.drawable.media_link_24, context, f6Var);
        this.O = x1Var3;
        x1Var3.c(i10);
        x1Var3.setContentDescription(hd.M0(2131751745, null));
        final int i20 = 2;
        x1Var3.setOnClickListener(new View.OnClickListener() { // from class: li.u3
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
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.s1(a10);
                                g0Var.c2 = new ii.c(k22, 9);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        f2 f2Var = lVar.a.r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        f2 f2Var2 = lVar.a.r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new ii.c(lVar2, 10), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.i4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(x1Var3, ha.r(38, 38, 16));
        x1 x1Var4 = new x1(R.drawable.msg_calendar2, context, f6Var);
        this.Q = x1Var4;
        x1Var4.c(i10);
        x1Var4.setContentDescription(hd.M0(2131754862, null));
        final int i21 = 3;
        x1Var4.setOnClickListener(new View.OnClickListener() { // from class: li.u3
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
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.s1(a10);
                                g0Var.c2 = new ii.c(k22, 9);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        f2 f2Var = lVar.a.r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        f2 f2Var2 = lVar.a.r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new ii.c(lVar2, 10), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.i4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(x1Var4, ha.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        Drawable d07 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i10, f6Var));
        f(linearLayout6, i10, d07);
        linearLayout6.setBackground(new a2(d07));
        c61Var.addView(linearLayout6, ha.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var5 = new x1(R.drawable.iv_math, context, f6Var);
        this.R = x1Var5;
        x1Var5.c(i10);
        x1Var5.d();
        arrayList.add(x1Var5);
        x1Var5.setContentDescription(hd.M0(2131754864, null));
        final int i22 = 4;
        x1Var5.setOnClickListener(new View.OnClickListener() { // from class: li.u3
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
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.s1(a10);
                                g0Var.c2 = new ii.c(k22, 9);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        f2 f2Var = lVar.a.r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        f2 f2Var2 = lVar.a.r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new ii.c(lVar2, 10), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.i4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout6.addView(x1Var5, ha.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.L = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        Drawable d08 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i10, f6Var));
        f(linearLayout7, i10, d08);
        linearLayout7.setBackground(new a2(d08));
        c61Var.addView(linearLayout7, 0, ha.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        x1 x1Var6 = new x1(R.drawable.input_ai, context, f6Var);
        x1Var6.setImageDrawable(new org.telegram.ui.ActionBar.u2(context));
        x1Var6.c(i10);
        x1Var6.setContentDescription(hd.M0(2131755006, null));
        final int i23 = 5;
        x1Var6.setOnClickListener(new View.OnClickListener() { // from class: li.u3
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
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.s1(a10);
                                g0Var.c2 = new ii.c(k22, 9);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        f2 f2Var = lVar.a.r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        f2 f2Var2 = lVar.a.r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new ii.c(lVar2, 10), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.i4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout7.addView(x1Var6, ha.r(38, 38, 16));
        w1 w1Var = new w1(this, context, f6Var);
        this.F = w1Var;
        int i24 = k6.Me;
        Drawable d09 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.w0(i24, f6Var));
        f(w1Var, i24, d09);
        w1Var.setBackground(new a2(d09));
        ka.a(w1Var);
        linearLayout2.addView(w1Var, ha.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        w1Var.setContentDescription("Send");
        final int i25 = 6;
        w1Var.setOnClickListener(new View.OnClickListener() { // from class: li.u3
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
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(pVar2.getContext(), pVar2.a);
                                g0Var.s1(a10);
                                g0Var.c2 = new ii.c(k22, 9);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.L(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        f2 f2Var = lVar.a.r.Q3;
                        if (f2Var != null) {
                            f2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        f2 f2Var2 = lVar.a.r.Q3;
                        if (f2Var2 != null) {
                            f2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        p pVar3 = lVar2.a;
                        Context context2 = pVar3.getContext();
                        new v(pVar3.n, context2, new ii.c(lVar2, 10), pVar3.a).show();
                        break;
                    case 10:
                        p.P(lVar.a);
                        break;
                    default:
                        p pVar4 = lVar.a;
                        pVar4.r.i4 = null;
                        p.S(pVar4, 90, 0);
                        break;
                }
            }
        });
        w1Var.setOnLongClickListener(new fi.s4(lVar, 4));
        g(0, false);
    }

    public final void a(int i7, int i10, boolean z9) {
        LinearLayout linearLayout = this.D;
        x1 x1Var = new x1(i7, linearLayout.getContext(), this.b);
        x1Var.c(k6.d6);
        if (z9) {
            x1Var.d();
            this.V.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i10));
        x1Var.setContentDescription(b2.l0(i10));
        x1Var.setOnClickListener(new w3(this, i10, 1));
        this.T.add(x1Var);
        linearLayout.addView(x1Var, ha.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void b(int i7, int i10, boolean z9) {
        x1 x1Var = new x1(i7, getContext(), this.b);
        x1Var.c(k6.Ml);
        if (z9) {
            x1Var.d();
            this.V.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i10));
        x1Var.setContentDescription(b2.n0(i10));
        x1Var.setOnClickListener(new w3(this, i10, 0));
        this.U.add(x1Var);
        LinearLayout linearLayout = this.J;
        linearLayout.addView(x1Var, ha.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void c(int i7, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x1 x1Var = (x1) obj;
            int intValue = ((Integer) x1Var.getTag()).intValue();
            x1Var.setSelected((i7 & intValue) != 0);
            if (intValue == 1 || intValue == 2) {
                x1Var.setEnabled(z13);
            }
        }
        x1 x1Var2 = this.O;
        x1Var2.setSelected(z9);
        x1 x1Var3 = this.Q;
        x1Var3.setSelected(z10);
        x1Var2.setEnabled(z11);
        this.P.setEnabled(z12);
        x1Var3.setEnabled(z11);
        this.R.setEnabled(z11);
    }

    public final void d(int i7, int i10) {
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            x1 x1Var = (x1) obj;
            boolean z9 = i7 == ((Integer) x1Var.getTag()).intValue();
            x1Var.setSelected(z9);
            if (!z9 || i10 == 0) {
                x1Var.a();
            } else {
                x1Var.e(i10);
            }
        }
    }

    public final void e(boolean z9, boolean z10) {
        if (this.c0 == z9 && z10) {
            return;
        }
        this.c0 = z9;
        float f10 = z9 ? 1.15f : 1.0f;
        ch0 ch0Var = this.I;
        if (z10) {
            ch0Var.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(xq.h).start();
        } else {
            ch0Var.animate().cancel();
            ch0Var.setScaleX(f10);
            ch0Var.setScaleY(f10);
        }
        ch0Var.setColorFilter(new PorterDuffColorFilter(k6.w0(z9 ? k6.q7 : k6.G6, this.b), PorterDuff.Mode.SRC_IN));
        zg0 animatedDrawable = ch0Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z9) {
                if (animatedDrawable.a0 > 34) {
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
        this.f0.add(view);
        this.g0.add(drawable);
        this.h0.add(Integer.valueOf(i7));
        f6 f6Var = this.b;
        this.i0.add(Integer.valueOf(k6.w0(i7, f6Var)));
        this.j0.add(Integer.valueOf(drawable instanceof RippleDrawable ? k6.w(k6.w0(i7, f6Var), k6.w0(k6.i6, f6Var)) : 0));
    }

    public final void g(int i7, boolean z9) {
        if (this.a0 == i7) {
            return;
        }
        this.a0 = i7;
        FrameLayout frameLayout = this.H;
        c61 c61Var = this.G;
        LinearLayout linearLayout = this.x;
        if (z9) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator duration = linearLayout.animate().alpha(i7 == 0 ? 1.0f : 0.0f).scaleX(i7 == 0 ? 1.0f : 0.8f).scaleY(i7 == 0 ? 1.0f : 0.8f).translationY(i7 == 0 ? 0.0f : org.telegram.messenger.g0.L(30.0f)).setDuration(420L);
            xq xqVar = xq.h;
            final int i10 = 0;
            duration.setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: li.v3
                public final /* synthetic */ y3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            y3 y3Var = this.b;
                            if (y3Var.a0 != 0) {
                                y3Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            y3 y3Var2 = this.b;
                            if (y3Var2.a0 != 1) {
                                y3Var2.G.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            y3 y3Var3 = this.b;
                            if (y3Var3.a0 != 2) {
                                y3Var3.H.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            c61Var.setVisibility(0);
            final int i11 = 1;
            c61Var.animate().alpha(i7 == 1 ? 1.0f : 0.0f).scaleX(i7 == 1 ? 1.0f : 0.8f).scaleY(i7 == 1 ? 1.0f : 0.8f).translationY(i7 == 1 ? 0.0f : org.telegram.messenger.g0.L(30.0f)).setDuration(420L).setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: li.v3
                public final /* synthetic */ y3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            y3 y3Var = this.b;
                            if (y3Var.a0 != 0) {
                                y3Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            y3 y3Var2 = this.b;
                            if (y3Var2.a0 != 1) {
                                y3Var2.G.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            y3 y3Var3 = this.b;
                            if (y3Var3.a0 != 2) {
                                y3Var3.H.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator scaleX = frameLayout.animate().alpha(i7 == 2 ? 1.0f : 0.0f).scaleX(i7 == 2 ? 1.0f : 0.8f);
            final int i12 = 2;
            scaleX.scaleY(i7 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(xqVar).withEndAction(new Runnable(this) { // from class: li.v3
                public final /* synthetic */ y3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            y3 y3Var = this.b;
                            if (y3Var.a0 != 0) {
                                y3Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            y3 y3Var2 = this.b;
                            if (y3Var2.a0 != 1) {
                                y3Var2.G.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            y3 y3Var3 = this.b;
                            if (y3Var3.a0 != 2) {
                                y3Var3.H.setVisibility(8);
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
        c61Var.setVisibility(i7 == 1 ? 0 : 8);
        c61Var.setAlpha(i7 == 1 ? 1.0f : 0.0f);
        c61Var.setScaleX(i7 == 1 ? 1.0f : 0.8f);
        c61Var.setScaleY(i7 == 1 ? 1.0f : 0.8f);
        c61Var.setTranslationY(i7 == 1 ? 0.0f : org.telegram.messenger.g0.L(30.0f));
        frameLayout.setVisibility(i7 != 2 ? 8 : 0);
        frameLayout.setAlpha(i7 == 2 ? 1.0f : 0.0f);
        frameLayout.setScaleX(i7 == 2 ? 1.0f : 0.8f);
        frameLayout.setScaleY(i7 == 2 ? 1.0f : 0.8f);
    }

    public ImageView getAddButton() {
        return this.E;
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

    public dg getSendButton() {
        return this.F;
    }

    public void setBackVisible(boolean z9) {
        this.f.setVisibility(z9 ? 0 : 8);
    }

    public void setBottomGradientTranslationY(float f10) {
        this.d.setTranslationY(f10);
    }

    public void setEmojiOpened(boolean z9) {
        hg hgVar = z9 ? hg.d : hg.e;
        jg jgVar = this.y;
        jgVar.j(hgVar, true);
        jgVar.setContentDescription(z9 ? "Keyboard" : "Emoji");
    }

    public void setPremiumLocked(boolean z9) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((x1) obj).setPremiumLocked(z9);
        }
    }

    public void setQuoteState(boolean z9) {
        this.S.setSelected(z9);
    }

    public void setSelectedBlockType(int i7) {
        d(i7, 0);
    }

    public void setSendEditing(boolean z9) {
        this.F.setResourceId(z9 ? R.drawable.input_done : R.drawable.send_plane_24);
    }

    public void setSendEnabled(boolean z9) {
        w1 w1Var = this.F;
        if (w1Var.isEnabled() == z9) {
            return;
        }
        w1Var.setEnabled(z9);
        org.telegram.messenger.camera.q.k(w1Var.animate(), z9 ? 1.0f : 0.5f, 150L);
    }

    public void setSendLoading(boolean z9) {
        if (this.W == z9) {
            return;
        }
        this.W = z9;
        this.F.invalidate();
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

    public void setTopGradientVisible(boolean z9) {
        this.c.setVisibility(z9 ? 0 : 8);
    }

    public void setTopPanelVisible(boolean z9) {
        this.e.setVisibility(z9 ? 0 : 8);
        this.c.setVisibility(z9 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[Catch: Exception -> 0x0016, TRY_LEAVE, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0007, B:5:0x0011, B:9:0x003e, B:11:0x0044, B:14:0x0060, B:16:0x0076, B:17:0x007c, B:19:0x0088, B:21:0x00a5, B:26:0x00af, B:28:0x00b9, B:32:0x0093, B:34:0x009f, B:39:0x00c4, B:41:0x00c8, B:42:0x00cd, B:44:0x00d5, B:48:0x00d9, B:51:0x00cb, B:53:0x0019, B:55:0x0022, B:56:0x002d, B:58:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0007, B:5:0x0011, B:9:0x003e, B:11:0x0044, B:14:0x0060, B:16:0x0076, B:17:0x007c, B:19:0x0088, B:21:0x00a5, B:26:0x00af, B:28:0x00b9, B:32:0x0093, B:34:0x009f, B:39:0x00c4, B:41:0x00c8, B:42:0x00cd, B:44:0x00d5, B:48:0x00d9, B:51:0x00cb, B:53:0x0019, B:55:0x0022, B:56:0x002d, B:58:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[Catch: Exception -> 0x0016, TRY_ENTER, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0007, B:5:0x0011, B:9:0x003e, B:11:0x0044, B:14:0x0060, B:16:0x0076, B:17:0x007c, B:19:0x0088, B:21:0x00a5, B:26:0x00af, B:28:0x00b9, B:32:0x0093, B:34:0x009f, B:39:0x00c4, B:41:0x00c8, B:42:0x00cd, B:44:0x00d5, B:48:0x00d9, B:51:0x00cb, B:53:0x0019, B:55:0x0022, B:56:0x002d, B:58:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.a6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        int i7;
        ch0 ch0Var;
        boolean z9;
        View view;
        ArrayList arrayList = this.j0;
        ArrayList arrayList2 = this.g0;
        f6 f6Var = this.b;
        try {
            int w02 = k6.w0(k6.d6, f6Var);
            if (this.l0) {
                if (w02 != this.k0) {
                }
                for (i7 = 0; i7 < arrayList2.size(); i7++) {
                    Drawable drawable = (Drawable) arrayList2.get(i7);
                    int w03 = k6.w0(((Integer) this.h0.get(i7)).intValue(), f6Var);
                    boolean z10 = drawable instanceof RippleDrawable;
                    ArrayList arrayList3 = this.i0;
                    if (z10) {
                        int w10 = k6.w(w03, k6.w0(k6.i6, f6Var));
                        if (w03 != ((Integer) arrayList3.get(i7)).intValue()) {
                            k6.H1(drawable, w03, false);
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (w10 != ((Integer) arrayList.get(i7)).intValue()) {
                            arrayList.set(i7, Integer.valueOf(w10));
                            k6.H1(drawable, w10, true);
                            z9 = true;
                        }
                        arrayList3.set(i7, Integer.valueOf(w03));
                        if (!z9 && (view = (View) this.f0.get(i7)) != null) {
                            view.invalidate();
                        }
                    } else if (w03 != ((Integer) arrayList3.get(i7)).intValue()) {
                        k6.C1(w03, drawable);
                        z9 = true;
                        arrayList3.set(i7, Integer.valueOf(w03));
                        if (!z9) {
                            view.invalidate();
                        }
                    } else {
                        z9 = false;
                        arrayList3.set(i7, Integer.valueOf(w03));
                        if (!z9) {
                        }
                    }
                }
                ch0Var = this.I;
                if (ch0Var == null) {
                    int w04 = k6.w0(this.c0 ? k6.q7 : k6.G6, f6Var);
                    if (this.n0 && w04 == this.m0) {
                        return;
                    }
                    this.n0 = true;
                    this.m0 = w04;
                    ch0Var.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.SRC_IN));
                    return;
                }
                return;
            }
            this.l0 = true;
            this.k0 = w02;
            GradientDrawable gradientDrawable = this.d0;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(new int[]{w02, k6.r1(0.0f, w02)});
            }
            GradientDrawable gradientDrawable2 = this.e0;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColors(new int[]{k6.r1(0.0f, w02), w02});
            }
            while (i7 < arrayList2.size()) {
            }
            ch0Var = this.I;
            if (ch0Var == null) {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

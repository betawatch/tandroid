package bi;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.zf;
import org.telegram.ui.u71;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class i4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final LinearLayout D;
    public final ImageView E;
    public final f2 F;
    public final u71 G;
    public final FrameLayout H;
    public final ei0 I;
    public final LinearLayout J;
    public int K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final g2 O;
    public final g2 P;
    public final g2 Q;
    public final g2 R;
    public final g2 S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final p a;
    public int a0;
    public final org.telegram.ui.ActionBar.p6 b;
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
    public final fg y;

    public i4(Context context, final p pVar) {
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
        this.a = pVar;
        org.telegram.ui.ActionBar.p6 p6Var = pVar.a.a;
        this.b = p6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.r1(0.0f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var))});
        this.d0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, w7.b6.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)), org.telegram.ui.ActionBar.t6.w0(i10, p6Var)});
        this.e0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, w7.b6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.b6.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i11 = org.telegram.ui.ActionBar.t6.Ml;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        Drawable b02 = org.telegram.ui.ActionBar.t6.b0(w02, org.telegram.ui.ActionBar.t6.w(w03, org.telegram.ui.ActionBar.t6.w0(i12, p6Var)), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f));
        f(imageView, i11, b02);
        imageView.setBackground(new j2(b02));
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a7.t(imageView, i13, p6Var, mode);
        w7.e6.a(imageView);
        imageView.setContentDescription(cd.L0(2131754878, null));
        imageView.setOnClickListener(new bh.c(pVar, 1));
        frameLayout.addView(imageView, w7.b6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        f(linearLayout, i11, d02);
        linearLayout.setBackground(new j2(d02));
        frameLayout.addView(linearLayout, w7.b6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N = a7.N(i12);
        imageView2.setBackground(h02);
        a7.k(imageView2, h02, null, N, p6Var);
        a7.t(imageView2, i13, p6Var, mode);
        w7.e6.a(imageView2);
        imageView2.setContentDescription("Undo");
        final int i14 = 7;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: bi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        t tVar = pVar.a;
                        tVar.r.T4();
                        tVar.Z();
                        break;
                    case 1:
                        pVar.a.r.c4(view3);
                        break;
                    case 2:
                        pVar.a.r.d4();
                        break;
                    case 3:
                        pVar.a.r.a4();
                        break;
                    case 4:
                        pVar.a.r.e4();
                        break;
                    case 5:
                        t tVar2 = pVar.a;
                        u3 k22 = tVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.a);
                                g0Var.s1(a2);
                                g0Var.c2 = new ag.l(k22, 6);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        pVar.a.J(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        o2 o2Var = pVar.a.r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        o2 o2Var2 = pVar.a.r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.n, context2, new ag.l(pVar2, 7), tVar3.a).show();
                        break;
                    case 10:
                        t.O(pVar.a);
                        break;
                    default:
                        t tVar4 = pVar.a;
                        tVar4.r.i4 = null;
                        t.R(tVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView2, w7.b6.r(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N2 = a7.N(i12);
        imageView3.setBackground(h03);
        a7.k(imageView3, h03, null, N2, p6Var);
        a7.t(imageView3, i13, p6Var, mode);
        w7.e6.a(imageView3);
        imageView3.setContentDescription("Redo");
        final int i15 = 8;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: bi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        t tVar = pVar.a;
                        tVar.r.T4();
                        tVar.Z();
                        break;
                    case 1:
                        pVar.a.r.c4(view3);
                        break;
                    case 2:
                        pVar.a.r.d4();
                        break;
                    case 3:
                        pVar.a.r.a4();
                        break;
                    case 4:
                        pVar.a.r.e4();
                        break;
                    case 5:
                        t tVar2 = pVar.a;
                        u3 k22 = tVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.a);
                                g0Var.s1(a2);
                                g0Var.c2 = new ag.l(k22, 6);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        pVar.a.J(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        o2 o2Var = pVar.a.r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        o2 o2Var2 = pVar.a.r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.n, context2, new ag.l(pVar2, 7), tVar3.a).show();
                        break;
                    case 10:
                        t.O(pVar.a);
                        break;
                    default:
                        t tVar4 = pVar.a;
                        tVar4.r.i4 = null;
                        t.R(tVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView3, w7.b6.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, w7.b6.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.w = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, w7.b6.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        frameLayout3.addView(linearLayout2, w7.b6.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.ActionBar.y2(context));
        imageView4.setScaleType(scaleType);
        a7.t(imageView4, i13, p6Var, mode);
        Drawable b03 = org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w0(i12, p6Var)), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f));
        f(imageView4, i11, b03);
        imageView4.setBackground(new j2(b03));
        linearLayout2.addView(imageView4, w7.b6.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.e6.a(imageView4);
        imageView4.setContentDescription("AI");
        final int i16 = 9;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: bi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        t tVar = pVar.a;
                        tVar.r.T4();
                        tVar.Z();
                        break;
                    case 1:
                        pVar.a.r.c4(view3);
                        break;
                    case 2:
                        pVar.a.r.d4();
                        break;
                    case 3:
                        pVar.a.r.a4();
                        break;
                    case 4:
                        pVar.a.r.e4();
                        break;
                    case 5:
                        t tVar2 = pVar.a;
                        u3 k22 = tVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.a);
                                g0Var.s1(a2);
                                g0Var.c2 = new ag.l(k22, 6);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        pVar.a.J(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        o2 o2Var = pVar.a.r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        o2 o2Var2 = pVar.a.r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.n, context2, new ag.l(pVar2, 7), tVar3.a).show();
                        break;
                    case 10:
                        t.O(pVar.a);
                        break;
                    default:
                        t tVar4 = pVar.a;
                        tVar4.r.i4 = null;
                        t.R(tVar4, 90, 0);
                        break;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        Drawable d03 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        f(frameLayout5, i10, d03);
        frameLayout5.setBackground(new j2(d03));
        frameLayout4.addView(frameLayout5, w7.b6.e(-2, 44, 81));
        c2 c2Var = new c2(context, 1);
        c2Var.setClipToOutline(true);
        c2Var.setOutlineProvider(new d2(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.D = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        linearLayout3.setOrientation(0);
        c2Var.addView(linearLayout3);
        frameLayout5.addView(c2Var, w7.b6.c(-1.0f, -1));
        fg fgVar = new fg(context, 24);
        this.y = fgVar;
        fgVar.setPadding(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        a7.t(fgVar, i13, p6Var, mode);
        org.telegram.ui.Cells.y b04 = org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(i12, p6Var), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.w6 N3 = a7.N(i10);
        org.telegram.ui.ActionBar.w6 N4 = a7.N(i12);
        fgVar.setBackground(b04);
        a7.k(fgVar, b04, N3, N4, p6Var);
        fgVar.j(dg.e, false);
        linearLayout3.addView(fgVar, w7.b6.r(38, 38, 16));
        w7.e6.a(fgVar);
        fgVar.setContentDescription("Emoji");
        final int i17 = 10;
        fgVar.setOnClickListener(new View.OnClickListener() { // from class: bi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        t tVar = pVar.a;
                        tVar.r.T4();
                        tVar.Z();
                        break;
                    case 1:
                        pVar.a.r.c4(view3);
                        break;
                    case 2:
                        pVar.a.r.d4();
                        break;
                    case 3:
                        pVar.a.r.a4();
                        break;
                    case 4:
                        pVar.a.r.e4();
                        break;
                    case 5:
                        t tVar2 = pVar.a;
                        u3 k22 = tVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.a);
                                g0Var.s1(a2);
                                g0Var.c2 = new ag.l(k22, 6);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        pVar.a.J(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        o2 o2Var = pVar.a.r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        o2 o2Var2 = pVar.a.r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.n, context2, new ag.l(pVar2, 7), tVar3.a).show();
                        break;
                    case 10:
                        t.O(pVar.a);
                        break;
                    default:
                        t tVar4 = pVar.a;
                        tVar4.r.i4 = null;
                        t.R(tVar4, 90, 0);
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
        a7.t(imageView5, i13, p6Var, mode);
        org.telegram.ui.Cells.y b05 = org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(i12, p6Var), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.w6 N5 = a7.N(i10);
        org.telegram.ui.ActionBar.w6 N6 = a7.N(i12);
        imageView5.setBackground(b05);
        a7.k(imageView5, b05, N5, N6, p6Var);
        linearLayout3.addView(imageView5, w7.b6.t(38, 38, 16, 2, 0, 0, 0));
        w7.e6.a(imageView5);
        imageView5.setContentDescription("Attach");
        final int i18 = 11;
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: bi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        t tVar = pVar.a;
                        tVar.r.T4();
                        tVar.Z();
                        break;
                    case 1:
                        pVar.a.r.c4(view3);
                        break;
                    case 2:
                        pVar.a.r.d4();
                        break;
                    case 3:
                        pVar.a.r.a4();
                        break;
                    case 4:
                        pVar.a.r.e4();
                        break;
                    case 5:
                        t tVar2 = pVar.a;
                        u3 k22 = tVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.a);
                                g0Var.s1(a2);
                                g0Var.c2 = new ag.l(k22, 6);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        pVar.a.J(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        o2 o2Var = pVar.a.r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        o2 o2Var2 = pVar.a.r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.n, context2, new ag.l(pVar2, 7), tVar3.a).show();
                        break;
                    case 10:
                        t.O(pVar.a);
                        break;
                    default:
                        t tVar4 = pVar.a;
                        tVar4.r.i4 = null;
                        t.R(tVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout2.addView(frameLayout4, w7.b6.l(1.0f, 0, 44));
        u71 u71Var = new u71(this, context, 2);
        this.G = u71Var;
        u71Var.setOrientation(0);
        u71Var.setClipToPadding(false);
        u71Var.setClipChildren(false);
        u71Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        frameLayout2.addView(u71Var, w7.b6.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.H = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        frameLayout2.addView(frameLayout6, w7.b6.e(80, 60, 81));
        ei0 ei0Var = new ei0(context);
        this.I = ei0Var;
        ei0Var.f(R.raw.group_pip_delete_icon, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), null);
        bi0 animatedDrawable = ei0Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        ei0Var.setScaleType(scaleType);
        ei0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), mode));
        Drawable d04 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        f(ei0Var, i11, d04);
        ei0Var.setBackground(new j2(d04));
        frameLayout6.addView(ei0Var, w7.b6.e(-1, -1, zs.E1));
        FrameLayout frameLayout7 = new FrameLayout(context);
        Drawable d05 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        f(frameLayout7, i11, d05);
        frameLayout7.setBackground(new j2(d05));
        u71Var.addView(frameLayout7, w7.b6.c(44.0f, -2));
        h4 h4Var = new h4(this, context, 0);
        h4Var.setHorizontalScrollBarEnabled(false);
        h4Var.setClipToOutline(true);
        final int i19 = 3;
        h4Var.setOutlineProvider(new d2(i19));
        frameLayout7.addView(h4Var, w7.b6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.J = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        h4Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, TLObject.FLAG_14, true);
        b(R.drawable.iv_super, 32768, true);
        g2 g2Var = new g2(R.drawable.iv_quote, context, p6Var);
        this.S = g2Var;
        g2Var.c(i11);
        g2Var.setContentDescription(cd.L0(2131746455, null));
        final int i20 = 0;
        g2Var.setOnClickListener(new View.OnClickListener() { // from class: bi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i20) {
                    case 0:
                        t tVar = pVar.a;
                        tVar.r.T4();
                        tVar.Z();
                        break;
                    case 1:
                        pVar.a.r.c4(view3);
                        break;
                    case 2:
                        pVar.a.r.d4();
                        break;
                    case 3:
                        pVar.a.r.a4();
                        break;
                    case 4:
                        pVar.a.r.e4();
                        break;
                    case 5:
                        t tVar2 = pVar.a;
                        u3 k22 = tVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.a);
                                g0Var.s1(a2);
                                g0Var.c2 = new ag.l(k22, 6);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        pVar.a.J(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        o2 o2Var = pVar.a.r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        o2 o2Var2 = pVar.a.r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.n, context2, new ag.l(pVar2, 7), tVar3.a).show();
                        break;
                    case 10:
                        t.O(pVar.a);
                        break;
                    default:
                        t tVar4 = pVar.a;
                        tVar4.r.i4 = null;
                        t.R(tVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(g2Var, w7.b6.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        g2 g2Var2 = new g2(R.drawable.iv_button, context, p6Var);
        this.P = g2Var2;
        g2Var2.c(i11);
        g2Var2.setContentDescription(cd.L0(2131746028, null));
        final int i21 = 1;
        g2Var2.setOnClickListener(new View.OnClickListener() { // from class: bi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i21) {
                    case 0:
                        t tVar = pVar.a;
                        tVar.r.T4();
                        tVar.Z();
                        break;
                    case 1:
                        pVar.a.r.c4(view3);
                        break;
                    case 2:
                        pVar.a.r.d4();
                        break;
                    case 3:
                        pVar.a.r.a4();
                        break;
                    case 4:
                        pVar.a.r.e4();
                        break;
                    case 5:
                        t tVar2 = pVar.a;
                        u3 k22 = tVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.a);
                                g0Var.s1(a2);
                                g0Var.c2 = new ag.l(k22, 6);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        pVar.a.J(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        o2 o2Var = pVar.a.r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        o2 o2Var2 = pVar.a.r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.n, context2, new ag.l(pVar2, 7), tVar3.a).show();
                        break;
                    case 10:
                        t.O(pVar.a);
                        break;
                    default:
                        t tVar4 = pVar.a;
                        tVar4.r.i4 = null;
                        t.R(tVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(g2Var2, w7.b6.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.M = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        Drawable d06 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        f(linearLayout5, i11, d06);
        linearLayout5.setBackground(new j2(d06));
        u71Var.addView(linearLayout5, w7.b6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        g2 g2Var3 = new g2(R.drawable.media_link_24, context, p6Var);
        this.O = g2Var3;
        g2Var3.c(i11);
        g2Var3.setContentDescription(cd.L0(2131751745, null));
        final int i22 = 2;
        g2Var3.setOnClickListener(new View.OnClickListener() { // from class: bi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i22) {
                    case 0:
                        t tVar = pVar.a;
                        tVar.r.T4();
                        tVar.Z();
                        break;
                    case 1:
                        pVar.a.r.c4(view3);
                        break;
                    case 2:
                        pVar.a.r.d4();
                        break;
                    case 3:
                        pVar.a.r.a4();
                        break;
                    case 4:
                        pVar.a.r.e4();
                        break;
                    case 5:
                        t tVar2 = pVar.a;
                        u3 k22 = tVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.a);
                                g0Var.s1(a2);
                                g0Var.c2 = new ag.l(k22, 6);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        pVar.a.J(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        o2 o2Var = pVar.a.r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        o2 o2Var2 = pVar.a.r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.n, context2, new ag.l(pVar2, 7), tVar3.a).show();
                        break;
                    case 10:
                        t.O(pVar.a);
                        break;
                    default:
                        t tVar4 = pVar.a;
                        tVar4.r.i4 = null;
                        t.R(tVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(g2Var3, w7.b6.r(38, 38, 16));
        g2 g2Var4 = new g2(R.drawable.msg_calendar2, context, p6Var);
        this.Q = g2Var4;
        g2Var4.c(i11);
        g2Var4.setContentDescription(cd.L0(2131754862, null));
        g2Var4.setOnClickListener(new View.OnClickListener() { // from class: bi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i19) {
                    case 0:
                        t tVar = pVar.a;
                        tVar.r.T4();
                        tVar.Z();
                        break;
                    case 1:
                        pVar.a.r.c4(view3);
                        break;
                    case 2:
                        pVar.a.r.d4();
                        break;
                    case 3:
                        pVar.a.r.a4();
                        break;
                    case 4:
                        pVar.a.r.e4();
                        break;
                    case 5:
                        t tVar2 = pVar.a;
                        u3 k22 = tVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.a);
                                g0Var.s1(a2);
                                g0Var.c2 = new ag.l(k22, 6);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        pVar.a.J(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        o2 o2Var = pVar.a.r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        o2 o2Var2 = pVar.a.r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.n, context2, new ag.l(pVar2, 7), tVar3.a).show();
                        break;
                    case 10:
                        t.O(pVar.a);
                        break;
                    default:
                        t tVar4 = pVar.a;
                        tVar4.r.i4 = null;
                        t.R(tVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(g2Var4, w7.b6.r(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        Drawable d07 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        f(linearLayout6, i11, d07);
        linearLayout6.setBackground(new j2(d07));
        u71Var.addView(linearLayout6, w7.b6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        g2 g2Var5 = new g2(R.drawable.iv_math, context, p6Var);
        this.R = g2Var5;
        g2Var5.c(i11);
        g2Var5.d();
        arrayList.add(g2Var5);
        g2Var5.setContentDescription(cd.L0(2131754864, null));
        final int i23 = 4;
        g2Var5.setOnClickListener(new View.OnClickListener() { // from class: bi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i23) {
                    case 0:
                        t tVar = pVar.a;
                        tVar.r.T4();
                        tVar.Z();
                        break;
                    case 1:
                        pVar.a.r.c4(view3);
                        break;
                    case 2:
                        pVar.a.r.d4();
                        break;
                    case 3:
                        pVar.a.r.a4();
                        break;
                    case 4:
                        pVar.a.r.e4();
                        break;
                    case 5:
                        t tVar2 = pVar.a;
                        u3 k22 = tVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.a);
                                g0Var.s1(a2);
                                g0Var.c2 = new ag.l(k22, 6);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        pVar.a.J(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        o2 o2Var = pVar.a.r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        o2 o2Var2 = pVar.a.r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.n, context2, new ag.l(pVar2, 7), tVar3.a).show();
                        break;
                    case 10:
                        t.O(pVar.a);
                        break;
                    default:
                        t tVar4 = pVar.a;
                        tVar4.r.i4 = null;
                        t.R(tVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout6.addView(g2Var5, w7.b6.r(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.L = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        Drawable d08 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        f(linearLayout7, i11, d08);
        linearLayout7.setBackground(new j2(d08));
        u71Var.addView(linearLayout7, 0, w7.b6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        g2 g2Var6 = new g2(R.drawable.input_ai, context, p6Var);
        g2Var6.setImageDrawable(new org.telegram.ui.ActionBar.y2(context));
        g2Var6.c(i11);
        g2Var6.setContentDescription(cd.L0(2131755006, null));
        final int i24 = 5;
        g2Var6.setOnClickListener(new View.OnClickListener() { // from class: bi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i24) {
                    case 0:
                        t tVar = pVar.a;
                        tVar.r.T4();
                        tVar.Z();
                        break;
                    case 1:
                        pVar.a.r.c4(view3);
                        break;
                    case 2:
                        pVar.a.r.d4();
                        break;
                    case 3:
                        pVar.a.r.a4();
                        break;
                    case 4:
                        pVar.a.r.e4();
                        break;
                    case 5:
                        t tVar2 = pVar.a;
                        u3 k22 = tVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.a);
                                g0Var.s1(a2);
                                g0Var.c2 = new ag.l(k22, 6);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        pVar.a.J(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        o2 o2Var = pVar.a.r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        o2 o2Var2 = pVar.a.r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.n, context2, new ag.l(pVar2, 7), tVar3.a).show();
                        break;
                    case 10:
                        t.O(pVar.a);
                        break;
                    default:
                        t tVar4 = pVar.a;
                        tVar4.r.i4 = null;
                        t.R(tVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout7.addView(g2Var6, w7.b6.r(38, 38, 16));
        f2 f2Var = new f2(this, context, p6Var);
        this.F = f2Var;
        int i25 = org.telegram.ui.ActionBar.t6.Me;
        Drawable d09 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i25, p6Var));
        f(f2Var, i25, d09);
        f2Var.setBackground(new j2(d09));
        w7.e6.a(f2Var);
        linearLayout2.addView(f2Var, w7.b6.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        f2Var.setContentDescription("Send");
        final int i26 = 6;
        f2Var.setOnClickListener(new View.OnClickListener() { // from class: bi.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i26) {
                    case 0:
                        t tVar = pVar.a;
                        tVar.r.T4();
                        tVar.Z();
                        break;
                    case 1:
                        pVar.a.r.c4(view3);
                        break;
                    case 2:
                        pVar.a.r.d4();
                        break;
                    case 3:
                        pVar.a.r.a4();
                        break;
                    case 4:
                        pVar.a.r.e4();
                        break;
                    case 5:
                        t tVar2 = pVar.a;
                        u3 k22 = tVar2.r.k2();
                        if (k22 != null) {
                            TL_iv.RichMessage a2 = k22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(tVar2.getContext(), tVar2.a);
                                g0Var.s1(a2);
                                g0Var.c2 = new ag.l(k22, 6);
                                g0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        pVar.a.J(true, 0, 0, 0L, false);
                        break;
                    case 7:
                        o2 o2Var = pVar.a.r.Q3;
                        if (o2Var != null) {
                            o2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        o2 o2Var2 = pVar.a.r.Q3;
                        if (o2Var2 != null) {
                            o2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        p pVar2 = pVar;
                        t tVar3 = pVar2.a;
                        Context context2 = tVar3.getContext();
                        new z(tVar3.n, context2, new ag.l(pVar2, 7), tVar3.a).show();
                        break;
                    case 10:
                        t.O(pVar.a);
                        break;
                    default:
                        t tVar4 = pVar.a;
                        tVar4.r.i4 = null;
                        t.R(tVar4, 90, 0);
                        break;
                }
            }
        });
        f2Var.setOnLongClickListener(new h1(pVar, 2));
        g(0, false);
    }

    public final void a(int i10, int i11, boolean z10) {
        LinearLayout linearLayout = this.D;
        g2 g2Var = new g2(i10, linearLayout.getContext(), this.b);
        g2Var.c(org.telegram.ui.ActionBar.t6.d6);
        if (z10) {
            g2Var.d();
            this.V.add(g2Var);
        }
        g2Var.setTag(Integer.valueOf(i11));
        g2Var.setContentDescription(k2.k0(i11));
        g2Var.setOnClickListener(new g4(this, i11, 1));
        this.T.add(g2Var);
        linearLayout.addView(g2Var, w7.b6.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void b(int i10, int i11, boolean z10) {
        g2 g2Var = new g2(i10, getContext(), this.b);
        g2Var.c(org.telegram.ui.ActionBar.t6.Ml);
        if (z10) {
            g2Var.d();
            this.V.add(g2Var);
        }
        g2Var.setTag(Integer.valueOf(i11));
        g2Var.setContentDescription(k2.m0(i11));
        g2Var.setOnClickListener(new g4(this, i11, 0));
        this.U.add(g2Var);
        LinearLayout linearLayout = this.J;
        linearLayout.addView(g2Var, w7.b6.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void c(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            g2 g2Var = (g2) obj;
            int intValue = ((Integer) g2Var.getTag()).intValue();
            g2Var.setSelected((i10 & intValue) != 0);
            if (intValue == 1 || intValue == 2) {
                g2Var.setEnabled(z14);
            }
        }
        g2 g2Var2 = this.O;
        g2Var2.setSelected(z10);
        g2 g2Var3 = this.Q;
        g2Var3.setSelected(z11);
        g2Var2.setEnabled(z12);
        this.P.setEnabled(z13);
        g2Var3.setEnabled(z12);
        this.R.setEnabled(z12);
    }

    public final void d(int i10, int i11) {
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            g2 g2Var = (g2) obj;
            boolean z10 = i10 == ((Integer) g2Var.getTag()).intValue();
            g2Var.setSelected(z10);
            if (!z10 || i11 == 0) {
                g2Var.a();
            } else {
                g2Var.e(i11);
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (this.c0 == z10 && z11) {
            return;
        }
        this.c0 = z10;
        float f7 = z10 ? 1.15f : 1.0f;
        ei0 ei0Var = this.I;
        if (z11) {
            ei0Var.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(gr.h).start();
        } else {
            ei0Var.animate().cancel();
            ei0Var.setScaleX(f7);
            ei0Var.setScaleY(f7);
        }
        ei0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(z10 ? org.telegram.ui.ActionBar.t6.q7 : org.telegram.ui.ActionBar.t6.G6, this.b), PorterDuff.Mode.SRC_IN));
        bi0 animatedDrawable = ei0Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z10) {
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

    public final void f(View view, int i10, Drawable drawable) {
        this.f0.add(view);
        this.g0.add(drawable);
        this.h0.add(Integer.valueOf(i10));
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        this.i0.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        this.j0.add(Integer.valueOf(drawable instanceof RippleDrawable ? org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var)) : 0));
    }

    public final void g(int i10, boolean z10) {
        if (this.a0 == i10) {
            return;
        }
        this.a0 = i10;
        FrameLayout frameLayout = this.H;
        u71 u71Var = this.G;
        LinearLayout linearLayout = this.x;
        if (z10) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator duration = linearLayout.animate().alpha(i10 == 0 ? 1.0f : 0.0f).scaleX(i10 == 0 ? 1.0f : 0.8f).scaleY(i10 == 0 ? 1.0f : 0.8f).translationY(i10 == 0 ? 0.0f : org.telegram.messenger.i0.L(30.0f)).setDuration(420L);
            gr grVar = gr.h;
            final int i11 = 0;
            duration.setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: bi.f4
                public final /* synthetic */ i4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            i4 i4Var = this.b;
                            if (i4Var.a0 != 0) {
                                i4Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            i4 i4Var2 = this.b;
                            if (i4Var2.a0 != 1) {
                                i4Var2.G.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            i4 i4Var3 = this.b;
                            if (i4Var3.a0 != 2) {
                                i4Var3.H.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            u71Var.setVisibility(0);
            final int i12 = 1;
            u71Var.animate().alpha(i10 == 1 ? 1.0f : 0.0f).scaleX(i10 == 1 ? 1.0f : 0.8f).scaleY(i10 == 1 ? 1.0f : 0.8f).translationY(i10 == 1 ? 0.0f : org.telegram.messenger.i0.L(30.0f)).setDuration(420L).setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: bi.f4
                public final /* synthetic */ i4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            i4 i4Var = this.b;
                            if (i4Var.a0 != 0) {
                                i4Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            i4 i4Var2 = this.b;
                            if (i4Var2.a0 != 1) {
                                i4Var2.G.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            i4 i4Var3 = this.b;
                            if (i4Var3.a0 != 2) {
                                i4Var3.H.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator scaleX = frameLayout.animate().alpha(i10 == 2 ? 1.0f : 0.0f).scaleX(i10 == 2 ? 1.0f : 0.8f);
            final int i13 = 2;
            scaleX.scaleY(i10 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: bi.f4
                public final /* synthetic */ i4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            i4 i4Var = this.b;
                            if (i4Var.a0 != 0) {
                                i4Var.x.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            i4 i4Var2 = this.b;
                            if (i4Var2.a0 != 1) {
                                i4Var2.G.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            i4 i4Var3 = this.b;
                            if (i4Var3.a0 != 2) {
                                i4Var3.H.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        linearLayout.setVisibility(i10 == 0 ? 0 : 8);
        linearLayout.setAlpha(i10 == 0 ? 1.0f : 0.0f);
        linearLayout.setScaleX(i10 == 0 ? 1.0f : 0.8f);
        linearLayout.setScaleY(i10 == 0 ? 1.0f : 0.8f);
        linearLayout.setTranslationY(i10 == 0 ? 0.0f : org.telegram.messenger.i0.L(30.0f));
        u71Var.setVisibility(i10 == 1 ? 0 : 8);
        u71Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
        u71Var.setScaleX(i10 == 1 ? 1.0f : 0.8f);
        u71Var.setScaleY(i10 == 1 ? 1.0f : 0.8f);
        u71Var.setTranslationY(i10 == 1 ? 0.0f : org.telegram.messenger.i0.L(30.0f));
        frameLayout.setVisibility(i10 != 2 ? 8 : 0);
        frameLayout.setAlpha(i10 == 2 ? 1.0f : 0.0f);
        frameLayout.setScaleX(i10 == 2 ? 1.0f : 0.8f);
        frameLayout.setScaleY(i10 == 2 ? 1.0f : 0.8f);
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

    public zf getSendButton() {
        return this.F;
    }

    public void setBackVisible(boolean z10) {
        this.f.setVisibility(z10 ? 0 : 8);
    }

    public void setBottomGradientTranslationY(float f7) {
        this.d.setTranslationY(f7);
    }

    public void setEmojiOpened(boolean z10) {
        dg dgVar = z10 ? dg.d : dg.e;
        fg fgVar = this.y;
        fgVar.j(dgVar, true);
        fgVar.setContentDescription(z10 ? "Keyboard" : "Emoji");
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g2) obj).setPremiumLocked(z10);
        }
    }

    public void setQuoteState(boolean z10) {
        this.S.setSelected(z10);
    }

    public void setSelectedBlockType(int i10) {
        d(i10, 0);
    }

    public void setSendEditing(boolean z10) {
        this.F.setResourceId(z10 ? R.drawable.input_done : R.drawable.send_plane_24);
    }

    public void setSendEnabled(boolean z10) {
        f2 f2Var = this.F;
        if (f2Var.isEnabled() == z10) {
            return;
        }
        f2Var.setEnabled(z10);
        z20.l(f2Var.animate(), z10 ? 1.0f : 0.5f, 150L);
    }

    public void setSendLoading(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        this.F.invalidate();
    }

    public void setTopButtonsOffset(int i10) {
        LinearLayout linearLayout = this.h;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.topMargin != i10) {
            layoutParams.topMargin = i10;
            linearLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = this.f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams2.topMargin != i10) {
            layoutParams2.topMargin = i10;
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
    @Override // org.telegram.ui.ActionBar.k6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        int i10;
        ei0 ei0Var;
        boolean z10;
        View view;
        ArrayList arrayList = this.j0;
        ArrayList arrayList2 = this.g0;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var);
            if (this.l0) {
                if (w02 != this.k0) {
                }
                for (i10 = 0; i10 < arrayList2.size(); i10++) {
                    Drawable drawable = (Drawable) arrayList2.get(i10);
                    int w03 = org.telegram.ui.ActionBar.t6.w0(((Integer) this.h0.get(i10)).intValue(), p6Var);
                    boolean z11 = drawable instanceof RippleDrawable;
                    ArrayList arrayList3 = this.i0;
                    if (z11) {
                        int w9 = org.telegram.ui.ActionBar.t6.w(w03, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var));
                        if (w03 != ((Integer) arrayList3.get(i10)).intValue()) {
                            org.telegram.ui.ActionBar.t6.H1(drawable, w03, false);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (w9 != ((Integer) arrayList.get(i10)).intValue()) {
                            arrayList.set(i10, Integer.valueOf(w9));
                            org.telegram.ui.ActionBar.t6.H1(drawable, w9, true);
                            z10 = true;
                        }
                        arrayList3.set(i10, Integer.valueOf(w03));
                        if (!z10 && (view = (View) this.f0.get(i10)) != null) {
                            view.invalidate();
                        }
                    } else if (w03 != ((Integer) arrayList3.get(i10)).intValue()) {
                        org.telegram.ui.ActionBar.t6.C1(w03, drawable);
                        z10 = true;
                        arrayList3.set(i10, Integer.valueOf(w03));
                        if (!z10) {
                            view.invalidate();
                        }
                    } else {
                        z10 = false;
                        arrayList3.set(i10, Integer.valueOf(w03));
                        if (!z10) {
                        }
                    }
                }
                ei0Var = this.I;
                if (ei0Var == null) {
                    int w04 = org.telegram.ui.ActionBar.t6.w0(this.c0 ? org.telegram.ui.ActionBar.t6.q7 : org.telegram.ui.ActionBar.t6.G6, p6Var);
                    if (this.n0 && w04 == this.m0) {
                        return;
                    }
                    this.n0 = true;
                    this.m0 = w04;
                    ei0Var.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.SRC_IN));
                    return;
                }
                return;
            }
            this.l0 = true;
            this.k0 = w02;
            GradientDrawable gradientDrawable = this.d0;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(new int[]{w02, org.telegram.ui.ActionBar.t6.r1(0.0f, w02)});
            }
            GradientDrawable gradientDrawable2 = this.e0;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColors(new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, w02), w02});
            }
            while (i10 < arrayList2.size()) {
            }
            ei0Var = this.I;
            if (ei0Var == null) {
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

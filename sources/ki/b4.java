package ki;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.va1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class b4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ImageView E;
    public final y1 F;
    public final va1 G;
    public final FrameLayout H;
    public final bk0 I;
    public final LinearLayout J;
    public int K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final z1 O;
    public final z1 P;
    public final z1 Q;
    public final z1 R;
    public final z1 S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final l a;
    public int a0;
    public final org.telegram.ui.ActionBar.g6 b;
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
    public final FrameLayout v;
    public final LinearLayout w;
    public final ah x;
    public final LinearLayout y;

    public b4(Context context, final l lVar) {
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
        org.telegram.ui.ActionBar.g6 g6Var = lVar.a.a;
        this.b = g6Var;
        setClipChildren(false);
        setClipToPadding(false);
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = k6.d6;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{k6.w0(i10, g6Var), k6.o1(0.0f, k6.w0(i10, g6Var))});
        this.d0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, w7.z5.e(-1, 68, 55));
        View view2 = new View(context);
        this.d = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{k6.o1(0.0f, k6.w0(i10, g6Var)), k6.w0(i10, g6Var)});
        this.e0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        addView(view2, w7.z5.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.z5.e(-1, -1, 55));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i11 = k6.Yk;
        int w02 = k6.w0(i11, g6Var);
        int w03 = k6.w0(i11, g6Var);
        int i12 = k6.i6;
        Drawable a02 = k6.a0(w02, k6.v(w03, k6.w0(i12, g6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        f(imageView, i11, a02);
        imageView.setBackground(new c2(a02));
        int i13 = k6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView, i13, g6Var, mode);
        w7.b6.a(imageView);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView.setOnClickListener(new ah.f(lVar, 7));
        frameLayout.addView(imageView, w7.z5.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        Drawable c02 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i11, g6Var));
        f(linearLayout, i11, c02);
        linearLayout.setBackground(new c2(c02));
        frameLayout.addView(linearLayout, w7.z5.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setImageResource(R.drawable.iv_undo);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y g02 = k6.g0(k6.w0(i12, g6Var), 1, -1);
        n6 O = r6.O(i12);
        imageView2.setBackground(g02);
        r6.k(imageView2, g02, null, O, g6Var);
        r6.t(imageView2, i13, g6Var, mode);
        w7.b6.a(imageView2);
        imageView2.setContentDescription("Undo");
        final int i14 = 7;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ki.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        q qVar = lVar.a;
                        qVar.r.W4();
                        qVar.Z();
                        break;
                    case 1:
                        lVar.a.r.f4(view3);
                        break;
                    case 2:
                        lVar.a.r.g4();
                        break;
                    case 3:
                        lVar.a.r.d4();
                        break;
                    case 4:
                        lVar.a.r.h4();
                        break;
                    case 5:
                        q qVar2 = lVar.a;
                        n3 n22 = qVar2.r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.a);
                                e0Var.n0(a2);
                                e0Var.k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.K(0, true, 0, false, 0L);
                        break;
                    case 7:
                        h2 h2Var = lVar.a.r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        h2 h2Var2 = lVar.a.r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.n, context2, new ig.k0(lVar2, 5), qVar3.a).show();
                        break;
                    case 10:
                        q.O(lVar.a);
                        break;
                    default:
                        q qVar4 = lVar.a;
                        qVar4.r.c4 = null;
                        q.R(qVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView2, w7.z5.q(41, 41, 16));
        ImageView imageView3 = new ImageView(context);
        this.r = imageView3;
        imageView3.setImageResource(R.drawable.iv_redo);
        imageView3.setScaleType(scaleType);
        org.telegram.ui.Cells.y g03 = k6.g0(k6.w0(i12, g6Var), 1, -1);
        n6 O2 = r6.O(i12);
        imageView3.setBackground(g03);
        r6.k(imageView3, g03, null, O2, g6Var);
        r6.t(imageView3, i13, g6Var, mode);
        w7.b6.a(imageView3);
        imageView3.setContentDescription("Redo");
        final int i15 = 8;
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: ki.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        q qVar = lVar.a;
                        qVar.r.W4();
                        qVar.Z();
                        break;
                    case 1:
                        lVar.a.r.f4(view3);
                        break;
                    case 2:
                        lVar.a.r.g4();
                        break;
                    case 3:
                        lVar.a.r.d4();
                        break;
                    case 4:
                        lVar.a.r.h4();
                        break;
                    case 5:
                        q qVar2 = lVar.a;
                        n3 n22 = qVar2.r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.a);
                                e0Var.n0(a2);
                                e0Var.k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.K(0, true, 0, false, 0L);
                        break;
                    case 7:
                        h2 h2Var = lVar.a.r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        h2 h2Var2 = lVar.a.r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.n, context2, new ig.k0(lVar2, 5), qVar3.a).show();
                        break;
                    case 10:
                        q.O(lVar.a);
                        break;
                    default:
                        q qVar4 = lVar.a;
                        qVar4.r.c4 = null;
                        q.R(qVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout.addView(imageView3, w7.z5.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        addView(frameLayout2, w7.z5.e(-1, -1, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout2.addView(frameLayout3, w7.z5.e(-1, 60, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.w = linearLayout2;
        linearLayout2.setClipToPadding(false);
        linearLayout2.setClipChildren(false);
        linearLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout3.addView(linearLayout2, w7.z5.e(-1, 60, 87));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageDrawable(new org.telegram.ui.Components.i0(context));
        imageView4.setScaleType(scaleType);
        r6.t(imageView4, i13, g6Var, mode);
        Drawable a03 = k6.a0(k6.w0(i11, g6Var), k6.v(k6.w0(i11, g6Var), k6.w0(i12, g6Var)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        f(imageView4, i11, a03);
        imageView4.setBackground(new c2(a03));
        linearLayout2.addView(imageView4, w7.z5.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.b6.a(imageView4);
        imageView4.setContentDescription("AI");
        final int i16 = 9;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: ki.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i16) {
                    case 0:
                        q qVar = lVar.a;
                        qVar.r.W4();
                        qVar.Z();
                        break;
                    case 1:
                        lVar.a.r.f4(view3);
                        break;
                    case 2:
                        lVar.a.r.g4();
                        break;
                    case 3:
                        lVar.a.r.d4();
                        break;
                    case 4:
                        lVar.a.r.h4();
                        break;
                    case 5:
                        q qVar2 = lVar.a;
                        n3 n22 = qVar2.r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.a);
                                e0Var.n0(a2);
                                e0Var.k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.K(0, true, 0, false, 0L);
                        break;
                    case 7:
                        h2 h2Var = lVar.a.r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        h2 h2Var2 = lVar.a.r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.n, context2, new ig.k0(lVar2, 5), qVar3.a).show();
                        break;
                    case 10:
                        q.O(lVar.a);
                        break;
                    default:
                        q qVar4 = lVar.a;
                        qVar4.r.c4 = null;
                        q.R(qVar4, 90, 0);
                        break;
                }
            }
        });
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        FrameLayout frameLayout5 = new FrameLayout(context);
        Drawable c03 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i10, g6Var));
        f(frameLayout5, i10, c03);
        frameLayout5.setBackground(new c2(c03));
        frameLayout4.addView(frameLayout5, w7.z5.e(-2, 44, 81));
        w1 w1Var = new w1(context, 1);
        w1Var.setClipToOutline(true);
        w1Var.setOutlineProvider(new ci.n1(5));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.y = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        linearLayout3.setOrientation(0);
        w1Var.addView(linearLayout3);
        frameLayout5.addView(w1Var, w7.z5.c(-1.0f, -1));
        ah ahVar = new ah(context, 24);
        this.x = ahVar;
        ahVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        r6.t(ahVar, i13, g6Var, mode);
        org.telegram.ui.Cells.y a04 = k6.a0(k6.w0(i10, g6Var), k6.w0(i12, g6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        n6 O3 = r6.O(i10);
        n6 O4 = r6.O(i12);
        ahVar.setBackground(a04);
        r6.k(ahVar, a04, O3, O4, g6Var);
        ahVar.j(yg.e, false);
        linearLayout3.addView(ahVar, w7.z5.q(38, 38, 16));
        w7.b6.a(ahVar);
        ahVar.setContentDescription("Emoji");
        final int i17 = 10;
        ahVar.setOnClickListener(new View.OnClickListener() { // from class: ki.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i17) {
                    case 0:
                        q qVar = lVar.a;
                        qVar.r.W4();
                        qVar.Z();
                        break;
                    case 1:
                        lVar.a.r.f4(view3);
                        break;
                    case 2:
                        lVar.a.r.g4();
                        break;
                    case 3:
                        lVar.a.r.d4();
                        break;
                    case 4:
                        lVar.a.r.h4();
                        break;
                    case 5:
                        q qVar2 = lVar.a;
                        n3 n22 = qVar2.r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.a);
                                e0Var.n0(a2);
                                e0Var.k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.K(0, true, 0, false, 0L);
                        break;
                    case 7:
                        h2 h2Var = lVar.a.r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        h2 h2Var2 = lVar.a.r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.n, context2, new ig.k0(lVar2, 5), qVar3.a).show();
                        break;
                    case 10:
                        q.O(lVar.a);
                        break;
                    default:
                        q qVar4 = lVar.a;
                        qVar4.r.c4 = null;
                        q.R(qVar4, 90, 0);
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
        r6.t(imageView5, i13, g6Var, mode);
        org.telegram.ui.Cells.y a05 = k6.a0(k6.w0(i10, g6Var), k6.w0(i12, g6Var), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        n6 O5 = r6.O(i10);
        n6 O6 = r6.O(i12);
        imageView5.setBackground(a05);
        r6.k(imageView5, a05, O5, O6, g6Var);
        linearLayout3.addView(imageView5, w7.z5.t(38, 38, 16, 2, 0, 0, 0));
        w7.b6.a(imageView5);
        imageView5.setContentDescription("Attach");
        final int i18 = 11;
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: ki.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i18) {
                    case 0:
                        q qVar = lVar.a;
                        qVar.r.W4();
                        qVar.Z();
                        break;
                    case 1:
                        lVar.a.r.f4(view3);
                        break;
                    case 2:
                        lVar.a.r.g4();
                        break;
                    case 3:
                        lVar.a.r.d4();
                        break;
                    case 4:
                        lVar.a.r.h4();
                        break;
                    case 5:
                        q qVar2 = lVar.a;
                        n3 n22 = qVar2.r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.a);
                                e0Var.n0(a2);
                                e0Var.k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.K(0, true, 0, false, 0L);
                        break;
                    case 7:
                        h2 h2Var = lVar.a.r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        h2 h2Var2 = lVar.a.r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.n, context2, new ig.k0(lVar2, 5), qVar3.a).show();
                        break;
                    case 10:
                        q.O(lVar.a);
                        break;
                    default:
                        q qVar4 = lVar.a;
                        qVar4.r.c4 = null;
                        q.R(qVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout2.addView(frameLayout4, w7.z5.l(1.0f, 0, 44));
        va1 va1Var = new va1(this, context, 5);
        this.G = va1Var;
        va1Var.setOrientation(0);
        va1Var.setClipToPadding(false);
        va1Var.setClipChildren(false);
        va1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(va1Var, w7.z5.e(-2, 60, 81));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.H = frameLayout6;
        frameLayout6.setClipChildren(false);
        frameLayout6.setClipToPadding(false);
        frameLayout6.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        frameLayout2.addView(frameLayout6, w7.z5.e(80, 60, 81));
        bk0 bk0Var = new bk0(context);
        this.I = bk0Var;
        bk0Var.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        yj0 animatedDrawable = bk0Var.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        bk0Var.setScaleType(scaleType);
        bk0Var.setColorFilter(new PorterDuffColorFilter(k6.w0(i13, g6Var), mode));
        Drawable c04 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i11, g6Var));
        f(bk0Var, i11, c04);
        bk0Var.setBackground(new c2(c04));
        frameLayout6.addView(bk0Var, w7.z5.e(-1, -1, 119));
        FrameLayout frameLayout7 = new FrameLayout(context);
        Drawable c05 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i11, g6Var));
        f(frameLayout7, i11, c05);
        frameLayout7.setBackground(new c2(c05));
        va1Var.addView(frameLayout7, w7.z5.c(44.0f, -2));
        a4 a4Var = new a4(this, context, 0);
        a4Var.setHorizontalScrollBarEnabled(false);
        a4Var.setClipToOutline(true);
        a4Var.setOutlineProvider(new ci.n1(6));
        frameLayout7.addView(a4Var, w7.z5.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.J = linearLayout4;
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        a4Var.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
        b(R.drawable.formatting_bold, 1, false);
        b(R.drawable.formatting_italic, 2, false);
        b(R.drawable.formatting_underline, 16, false);
        b(R.drawable.formatting_strikethrough, 8, false);
        b(R.drawable.formatting_spoiler, 256, false);
        b(R.drawable.iv_code, 4, false);
        b(R.drawable.iv_sub, 16384, true);
        b(R.drawable.iv_super, 32768, true);
        z1 z1Var = new z1(context, R.drawable.iv_quote, g6Var);
        this.S = z1Var;
        z1Var.c(i11);
        z1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        final int i19 = 0;
        z1Var.setOnClickListener(new View.OnClickListener() { // from class: ki.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i19) {
                    case 0:
                        q qVar = lVar.a;
                        qVar.r.W4();
                        qVar.Z();
                        break;
                    case 1:
                        lVar.a.r.f4(view3);
                        break;
                    case 2:
                        lVar.a.r.g4();
                        break;
                    case 3:
                        lVar.a.r.d4();
                        break;
                    case 4:
                        lVar.a.r.h4();
                        break;
                    case 5:
                        q qVar2 = lVar.a;
                        n3 n22 = qVar2.r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.a);
                                e0Var.n0(a2);
                                e0Var.k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.K(0, true, 0, false, 0L);
                        break;
                    case 7:
                        h2 h2Var = lVar.a.r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        h2 h2Var2 = lVar.a.r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.n, context2, new ig.k0(lVar2, 5), qVar3.a).show();
                        break;
                    case 10:
                        q.O(lVar.a);
                        break;
                    default:
                        q qVar4 = lVar.a;
                        qVar4.r.c4 = null;
                        q.R(qVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(z1Var, w7.z5.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        z1 z1Var2 = new z1(context, R.drawable.iv_button, g6Var);
        this.P = z1Var2;
        z1Var2.c(i11);
        z1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        final int i20 = 1;
        z1Var2.setOnClickListener(new View.OnClickListener() { // from class: ki.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i20) {
                    case 0:
                        q qVar = lVar.a;
                        qVar.r.W4();
                        qVar.Z();
                        break;
                    case 1:
                        lVar.a.r.f4(view3);
                        break;
                    case 2:
                        lVar.a.r.g4();
                        break;
                    case 3:
                        lVar.a.r.d4();
                        break;
                    case 4:
                        lVar.a.r.h4();
                        break;
                    case 5:
                        q qVar2 = lVar.a;
                        n3 n22 = qVar2.r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.a);
                                e0Var.n0(a2);
                                e0Var.k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.K(0, true, 0, false, 0L);
                        break;
                    case 7:
                        h2 h2Var = lVar.a.r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        h2 h2Var2 = lVar.a.r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.n, context2, new ig.k0(lVar2, 5), qVar3.a).show();
                        break;
                    case 10:
                        q.O(lVar.a);
                        break;
                    default:
                        q qVar4 = lVar.a;
                        qVar4.r.c4 = null;
                        q.R(qVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout4.addView(z1Var2, w7.z5.t(38, 38, 16, linearLayout4.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.M = linearLayout5;
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        Drawable c06 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i11, g6Var));
        f(linearLayout5, i11, c06);
        linearLayout5.setBackground(new c2(c06));
        va1Var.addView(linearLayout5, w7.z5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        z1 z1Var3 = new z1(context, R.drawable.media_link_24, g6Var);
        this.O = z1Var3;
        z1Var3.c(i11);
        z1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        final int i21 = 2;
        z1Var3.setOnClickListener(new View.OnClickListener() { // from class: ki.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i21) {
                    case 0:
                        q qVar = lVar.a;
                        qVar.r.W4();
                        qVar.Z();
                        break;
                    case 1:
                        lVar.a.r.f4(view3);
                        break;
                    case 2:
                        lVar.a.r.g4();
                        break;
                    case 3:
                        lVar.a.r.d4();
                        break;
                    case 4:
                        lVar.a.r.h4();
                        break;
                    case 5:
                        q qVar2 = lVar.a;
                        n3 n22 = qVar2.r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.a);
                                e0Var.n0(a2);
                                e0Var.k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.K(0, true, 0, false, 0L);
                        break;
                    case 7:
                        h2 h2Var = lVar.a.r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        h2 h2Var2 = lVar.a.r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.n, context2, new ig.k0(lVar2, 5), qVar3.a).show();
                        break;
                    case 10:
                        q.O(lVar.a);
                        break;
                    default:
                        q qVar4 = lVar.a;
                        qVar4.r.c4 = null;
                        q.R(qVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(z1Var3, w7.z5.q(38, 38, 16));
        z1 z1Var4 = new z1(context, R.drawable.msg_calendar2, g6Var);
        this.Q = z1Var4;
        z1Var4.c(i11);
        z1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        final int i22 = 3;
        z1Var4.setOnClickListener(new View.OnClickListener() { // from class: ki.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i22) {
                    case 0:
                        q qVar = lVar.a;
                        qVar.r.W4();
                        qVar.Z();
                        break;
                    case 1:
                        lVar.a.r.f4(view3);
                        break;
                    case 2:
                        lVar.a.r.g4();
                        break;
                    case 3:
                        lVar.a.r.d4();
                        break;
                    case 4:
                        lVar.a.r.h4();
                        break;
                    case 5:
                        q qVar2 = lVar.a;
                        n3 n22 = qVar2.r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.a);
                                e0Var.n0(a2);
                                e0Var.k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.K(0, true, 0, false, 0L);
                        break;
                    case 7:
                        h2 h2Var = lVar.a.r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        h2 h2Var2 = lVar.a.r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.n, context2, new ig.k0(lVar2, 5), qVar3.a).show();
                        break;
                    case 10:
                        q.O(lVar.a);
                        break;
                    default:
                        q qVar4 = lVar.a;
                        qVar4.r.c4 = null;
                        q.R(qVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout5.addView(z1Var4, w7.z5.q(38, 38, 16));
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(0);
        linearLayout6.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        Drawable c07 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i11, g6Var));
        f(linearLayout6, i11, c07);
        linearLayout6.setBackground(new c2(c07));
        va1Var.addView(linearLayout6, w7.z5.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        z1 z1Var5 = new z1(context, R.drawable.iv_math, g6Var);
        this.R = z1Var5;
        z1Var5.c(i11);
        z1Var5.d();
        arrayList.add(z1Var5);
        z1Var5.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        final int i23 = 4;
        z1Var5.setOnClickListener(new View.OnClickListener() { // from class: ki.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i23) {
                    case 0:
                        q qVar = lVar.a;
                        qVar.r.W4();
                        qVar.Z();
                        break;
                    case 1:
                        lVar.a.r.f4(view3);
                        break;
                    case 2:
                        lVar.a.r.g4();
                        break;
                    case 3:
                        lVar.a.r.d4();
                        break;
                    case 4:
                        lVar.a.r.h4();
                        break;
                    case 5:
                        q qVar2 = lVar.a;
                        n3 n22 = qVar2.r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.a);
                                e0Var.n0(a2);
                                e0Var.k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.K(0, true, 0, false, 0L);
                        break;
                    case 7:
                        h2 h2Var = lVar.a.r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        h2 h2Var2 = lVar.a.r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.n, context2, new ig.k0(lVar2, 5), qVar3.a).show();
                        break;
                    case 10:
                        q.O(lVar.a);
                        break;
                    default:
                        q qVar4 = lVar.a;
                        qVar4.r.c4 = null;
                        q.R(qVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout6.addView(z1Var5, w7.z5.q(38, 38, 16));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.L = linearLayout7;
        linearLayout7.setOrientation(0);
        linearLayout7.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        Drawable c08 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i11, g6Var));
        f(linearLayout7, i11, c08);
        linearLayout7.setBackground(new c2(c08));
        va1Var.addView(linearLayout7, 0, w7.z5.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        z1 z1Var6 = new z1(context, R.drawable.input_ai, g6Var);
        z1Var6.setImageDrawable(new org.telegram.ui.Components.i0(context));
        z1Var6.c(i11);
        z1Var6.setContentDescription(LocaleController.getString(R.string.AIEditor));
        final int i24 = 5;
        z1Var6.setOnClickListener(new View.OnClickListener() { // from class: ki.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i24) {
                    case 0:
                        q qVar = lVar.a;
                        qVar.r.W4();
                        qVar.Z();
                        break;
                    case 1:
                        lVar.a.r.f4(view3);
                        break;
                    case 2:
                        lVar.a.r.g4();
                        break;
                    case 3:
                        lVar.a.r.d4();
                        break;
                    case 4:
                        lVar.a.r.h4();
                        break;
                    case 5:
                        q qVar2 = lVar.a;
                        n3 n22 = qVar2.r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.a);
                                e0Var.n0(a2);
                                e0Var.k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.K(0, true, 0, false, 0L);
                        break;
                    case 7:
                        h2 h2Var = lVar.a.r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        h2 h2Var2 = lVar.a.r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.n, context2, new ig.k0(lVar2, 5), qVar3.a).show();
                        break;
                    case 10:
                        q.O(lVar.a);
                        break;
                    default:
                        q qVar4 = lVar.a;
                        qVar4.r.c4 = null;
                        q.R(qVar4, 90, 0);
                        break;
                }
            }
        });
        linearLayout7.addView(z1Var6, w7.z5.q(38, 38, 16));
        y1 y1Var = new y1(R.drawable.send_plane_24, 1, context, this, g6Var);
        this.F = y1Var;
        int i25 = k6.Yd;
        Drawable c09 = k6.c0(AndroidUtilities.dp(22.0f), k6.w0(i25, g6Var));
        f(y1Var, i25, c09);
        y1Var.setBackground(new c2(c09));
        w7.b6.a(y1Var);
        linearLayout2.addView(y1Var, w7.z5.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        y1Var.setContentDescription("Send");
        final int i26 = 6;
        y1Var.setOnClickListener(new View.OnClickListener() { // from class: ki.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i26) {
                    case 0:
                        q qVar = lVar.a;
                        qVar.r.W4();
                        qVar.Z();
                        break;
                    case 1:
                        lVar.a.r.f4(view3);
                        break;
                    case 2:
                        lVar.a.r.g4();
                        break;
                    case 3:
                        lVar.a.r.d4();
                        break;
                    case 4:
                        lVar.a.r.h4();
                        break;
                    case 5:
                        q qVar2 = lVar.a;
                        n3 n22 = qVar2.r.n2();
                        if (n22 != null) {
                            TL_iv.RichMessage a2 = n22.a();
                            if (!a2.blocks.isEmpty()) {
                                org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(qVar2.getContext(), qVar2.a);
                                e0Var.n0(a2);
                                e0Var.k0 = new ig.k0(n22, 4);
                                e0Var.show();
                                break;
                            }
                        }
                        break;
                    case 6:
                        lVar.a.K(0, true, 0, false, 0L);
                        break;
                    case 7:
                        h2 h2Var = lVar.a.r.K3;
                        if (h2Var != null) {
                            h2Var.k();
                            break;
                        }
                        break;
                    case 8:
                        h2 h2Var2 = lVar.a.r.K3;
                        if (h2Var2 != null) {
                            h2Var2.i();
                            break;
                        }
                        break;
                    case 9:
                        l lVar2 = lVar;
                        q qVar3 = lVar2.a;
                        Context context2 = qVar3.getContext();
                        new x(qVar3.n, context2, new ig.k0(lVar2, 5), qVar3.a).show();
                        break;
                    case 10:
                        q.O(lVar.a);
                        break;
                    default:
                        q qVar4 = lVar.a;
                        qVar4.r.c4 = null;
                        q.R(qVar4, 90, 0);
                        break;
                }
            }
        });
        y1Var.setOnLongClickListener(new ei.c5(lVar, 4));
        g(0, false);
    }

    public final void a(int i10, int i11, boolean z10) {
        LinearLayout linearLayout = this.y;
        z1 z1Var = new z1(linearLayout.getContext(), i10, this.b);
        z1Var.c(k6.d6);
        if (z10) {
            z1Var.d();
            this.V.add(z1Var);
        }
        z1Var.setTag(Integer.valueOf(i11));
        z1Var.setContentDescription(d2.g0(i11));
        z1Var.setOnClickListener(new z3(this, i11, 1));
        this.T.add(z1Var);
        linearLayout.addView(z1Var, w7.z5.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void b(int i10, int i11, boolean z10) {
        z1 z1Var = new z1(getContext(), i10, this.b);
        z1Var.c(k6.Yk);
        if (z10) {
            z1Var.d();
            this.V.add(z1Var);
        }
        z1Var.setTag(Integer.valueOf(i11));
        z1Var.setContentDescription(d2.i0(i11));
        z1Var.setOnClickListener(new z3(this, i11, 0));
        this.U.add(z1Var);
        LinearLayout linearLayout = this.J;
        linearLayout.addView(z1Var, w7.z5.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
    }

    public final void c(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z1 z1Var = (z1) obj;
            int intValue = ((Integer) z1Var.getTag()).intValue();
            z1Var.setSelected((i10 & intValue) != 0);
            if (intValue == 1 || intValue == 2) {
                z1Var.setEnabled(z14);
            }
        }
        z1 z1Var2 = this.O;
        z1Var2.setSelected(z10);
        z1 z1Var3 = this.Q;
        z1Var3.setSelected(z11);
        z1Var2.setEnabled(z12);
        this.P.setEnabled(z13);
        z1Var3.setEnabled(z12);
        this.R.setEnabled(z12);
    }

    public final void d(int i10, int i11) {
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            z1 z1Var = (z1) obj;
            boolean z10 = i10 == ((Integer) z1Var.getTag()).intValue();
            z1Var.setSelected(z10);
            if (!z10 || i11 == 0) {
                z1Var.a();
            } else {
                z1Var.e(i11);
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (this.c0 == z10 && z11) {
            return;
        }
        this.c0 = z10;
        float f7 = z10 ? 1.15f : 1.0f;
        bk0 bk0Var = this.I;
        if (z11) {
            bk0Var.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(bs.h).start();
        } else {
            bk0Var.animate().cancel();
            bk0Var.setScaleX(f7);
            bk0Var.setScaleY(f7);
        }
        bk0Var.setColorFilter(new PorterDuffColorFilter(k6.w0(z10 ? k6.q7 : k6.G6, this.b), PorterDuff.Mode.SRC_IN));
        yj0 animatedDrawable = bk0Var.getAnimatedDrawable();
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
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        this.i0.add(Integer.valueOf(k6.w0(i10, g6Var)));
        this.j0.add(Integer.valueOf(drawable instanceof RippleDrawable ? k6.v(k6.w0(i10, g6Var), k6.w0(k6.i6, g6Var)) : 0));
    }

    public final void g(int i10, boolean z10) {
        if (this.a0 == i10) {
            return;
        }
        this.a0 = i10;
        FrameLayout frameLayout = this.H;
        va1 va1Var = this.G;
        LinearLayout linearLayout = this.w;
        if (z10) {
            linearLayout.setVisibility(0);
            ViewPropertyAnimator duration = linearLayout.animate().alpha(i10 == 0 ? 1.0f : 0.0f).scaleX(i10 == 0 ? 1.0f : 0.8f).scaleY(i10 == 0 ? 1.0f : 0.8f).translationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L);
            bs bsVar = bs.h;
            final int i11 = 0;
            duration.setInterpolator(bsVar).withEndAction(new Runnable(this) { // from class: ki.y3
                public final /* synthetic */ b4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            b4 b4Var = this.b;
                            if (b4Var.a0 != 0) {
                                b4Var.w.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            b4 b4Var2 = this.b;
                            if (b4Var2.a0 != 1) {
                                b4Var2.G.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            b4 b4Var3 = this.b;
                            if (b4Var3.a0 != 2) {
                                b4Var3.H.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            va1Var.setVisibility(0);
            final int i12 = 1;
            va1Var.animate().alpha(i10 == 1 ? 1.0f : 0.0f).scaleX(i10 == 1 ? 1.0f : 0.8f).scaleY(i10 == 1 ? 1.0f : 0.8f).translationY(i10 == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(bsVar).withEndAction(new Runnable(this) { // from class: ki.y3
                public final /* synthetic */ b4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            b4 b4Var = this.b;
                            if (b4Var.a0 != 0) {
                                b4Var.w.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            b4 b4Var2 = this.b;
                            if (b4Var2.a0 != 1) {
                                b4Var2.G.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            b4 b4Var3 = this.b;
                            if (b4Var3.a0 != 2) {
                                b4Var3.H.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            frameLayout.setVisibility(0);
            ViewPropertyAnimator scaleX = frameLayout.animate().alpha(i10 == 2 ? 1.0f : 0.0f).scaleX(i10 == 2 ? 1.0f : 0.8f);
            final int i13 = 2;
            scaleX.scaleY(i10 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(bsVar).withEndAction(new Runnable(this) { // from class: ki.y3
                public final /* synthetic */ b4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            b4 b4Var = this.b;
                            if (b4Var.a0 != 0) {
                                b4Var.w.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            b4 b4Var2 = this.b;
                            if (b4Var2.a0 != 1) {
                                b4Var2.G.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            b4 b4Var3 = this.b;
                            if (b4Var3.a0 != 2) {
                                b4Var3.H.setVisibility(8);
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
        linearLayout.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(30.0f));
        va1Var.setVisibility(i10 == 1 ? 0 : 8);
        va1Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
        va1Var.setScaleX(i10 == 1 ? 1.0f : 0.8f);
        va1Var.setScaleY(i10 == 1 ? 1.0f : 0.8f);
        va1Var.setTranslationY(i10 == 1 ? 0.0f : AndroidUtilities.dp(30.0f));
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
        return this.v;
    }

    public LinearLayout getBottomPanel() {
        return this.w;
    }

    public View getEmojiButton() {
        return this.x;
    }

    public vg getSendButton() {
        return this.F;
    }

    public void setBackVisible(boolean z10) {
        this.f.setVisibility(z10 ? 0 : 8);
    }

    public void setBottomGradientTranslationY(float f7) {
        this.d.setTranslationY(f7);
    }

    public void setEmojiOpened(boolean z10) {
        yg ygVar = z10 ? yg.d : yg.e;
        ah ahVar = this.x;
        ahVar.j(ygVar, true);
        ahVar.setContentDescription(z10 ? "Keyboard" : "Emoji");
    }

    public void setPremiumLocked(boolean z10) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((z1) obj).setPremiumLocked(z10);
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
        y1 y1Var = this.F;
        if (y1Var.isEnabled() == z10) {
            return;
        }
        y1Var.setEnabled(z10);
        sl.s(y1Var.animate(), z10 ? 1.0f : 0.5f, 150L);
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[Catch: Exception -> 0x0016, TRY_LEAVE, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0006, B:5:0x0011, B:9:0x003e, B:11:0x0044, B:14:0x0060, B:16:0x0076, B:17:0x007c, B:19:0x0088, B:21:0x00a5, B:26:0x00af, B:28:0x00b9, B:32:0x0093, B:34:0x009f, B:39:0x00c4, B:41:0x00c8, B:42:0x00cd, B:44:0x00d5, B:48:0x00d9, B:51:0x00cb, B:53:0x0019, B:55:0x0022, B:56:0x002d, B:58:0x0031), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0006, B:5:0x0011, B:9:0x003e, B:11:0x0044, B:14:0x0060, B:16:0x0076, B:17:0x007c, B:19:0x0088, B:21:0x00a5, B:26:0x00af, B:28:0x00b9, B:32:0x0093, B:34:0x009f, B:39:0x00c4, B:41:0x00c8, B:42:0x00cd, B:44:0x00d5, B:48:0x00d9, B:51:0x00cb, B:53:0x0019, B:55:0x0022, B:56:0x002d, B:58:0x0031), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[Catch: Exception -> 0x0016, TRY_ENTER, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0006, B:5:0x0011, B:9:0x003e, B:11:0x0044, B:14:0x0060, B:16:0x0076, B:17:0x007c, B:19:0x0088, B:21:0x00a5, B:26:0x00af, B:28:0x00b9, B:32:0x0093, B:34:0x009f, B:39:0x00c4, B:41:0x00c8, B:42:0x00cd, B:44:0x00d5, B:48:0x00d9, B:51:0x00cb, B:53:0x0019, B:55:0x0022, B:56:0x002d, B:58:0x0031), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.b6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateColors() {
        int i10;
        bk0 bk0Var;
        boolean z10;
        View view;
        ArrayList arrayList = this.j0;
        ArrayList arrayList2 = this.g0;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        try {
            int w02 = k6.w0(k6.d6, g6Var);
            if (this.l0) {
                if (w02 != this.k0) {
                }
                for (i10 = 0; i10 < arrayList2.size(); i10++) {
                    Drawable drawable = (Drawable) arrayList2.get(i10);
                    int w03 = k6.w0(((Integer) this.h0.get(i10)).intValue(), g6Var);
                    boolean z11 = drawable instanceof RippleDrawable;
                    ArrayList arrayList3 = this.i0;
                    if (z11) {
                        int v = k6.v(w03, k6.w0(k6.i6, g6Var));
                        if (w03 != ((Integer) arrayList3.get(i10)).intValue()) {
                            k6.E1(drawable, w03, false);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (v != ((Integer) arrayList.get(i10)).intValue()) {
                            arrayList.set(i10, Integer.valueOf(v));
                            k6.E1(drawable, v, true);
                            z10 = true;
                        }
                        arrayList3.set(i10, Integer.valueOf(w03));
                        if (!z10 && (view = (View) this.f0.get(i10)) != null) {
                            view.invalidate();
                        }
                    } else if (w03 != ((Integer) arrayList3.get(i10)).intValue()) {
                        k6.z1(w03, drawable);
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
                bk0Var = this.I;
                if (bk0Var == null) {
                    int w04 = k6.w0(this.c0 ? k6.q7 : k6.G6, g6Var);
                    if (this.n0 && w04 == this.m0) {
                        return;
                    }
                    this.n0 = true;
                    this.m0 = w04;
                    bk0Var.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.SRC_IN));
                    return;
                }
                return;
            }
            this.l0 = true;
            this.k0 = w02;
            GradientDrawable gradientDrawable = this.d0;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(new int[]{w02, k6.o1(0.0f, w02)});
            }
            GradientDrawable gradientDrawable2 = this.e0;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColors(new int[]{k6.o1(0.0f, w02), w02});
            }
            while (i10 < arrayList2.size()) {
            }
            bk0Var = this.I;
            if (bk0Var == null) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

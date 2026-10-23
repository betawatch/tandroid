package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.ns;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class a2 extends org.telegram.ui.Components.bb {
    public static final /* synthetic */ int F0 = 0;
    public final PointF A0;
    public final ArrayList B0;
    public int C0;
    public int D0;
    public int E0;
    public final int X;
    public final LinearLayout Y;
    public final w1[] Z;
    public final ArrayList a0;
    public final ArrayList b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final a e0;
    public final a f0;
    public final a g0;
    public final wz h0;
    public final r1 i0;
    public final z1 j0;
    public t1 k0;
    public final FrameLayout l0;
    public final ImageView m0;
    public final ImageView n0;
    public final s1 o0;
    public final TextView p0;
    public final View q0;
    public final bh.l r0;
    public final bh.f s0;
    public final gh.d t0;
    public final gh.c u0;
    public final bh.b v0;
    public v1 w0;
    public final boolean x0;
    public boolean y0;
    public final RectF z0;

    /* JADX WARN: Type inference failed for: r4v18, types: [ai.p1] */
    public a2(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, g6Var);
        this.E0 = 1;
        RectF rectF = new RectF();
        this.z0 = rectF;
        this.A0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.B0 = arrayList2;
        arrayList2.add(rectF);
        this.X = i10;
        this.x0 = z10;
        mm0 mm0Var = this.d;
        org.telegram.ui.ActionBar.e3 e3Var = this.container;
        Objects.requireNonNull(mm0Var);
        this.r0 = new bh.l(mm0Var, e3Var, new ns(mm0Var, 0));
        ArrayList c10 = ag.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.a0 = c10;
        a aVar = new a(c10);
        this.e0 = aVar;
        aVar.a = false;
        ArrayList c11 = ag.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.b0 = c11;
        a aVar2 = new a(c11);
        this.f0 = aVar2;
        aVar2.a = false;
        this.c0 = ag.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.d0 = arrayList3;
        if (z10) {
            int i11 = 0;
            while (i11 < this.c0.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.c0.get(i11);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.d0.add(stargiftattributemodel);
                    this.c0.remove(i11);
                    i11--;
                }
                i11++;
            }
        } else {
            arrayList3.clear();
        }
        List.-EL.sort(this.a0, Comparator$-CC.comparingDouble(new o1(0)));
        List.-EL.sort(this.b0, Comparator$-CC.comparingDouble(new o1(1)));
        List.-EL.sort(this.c0, Comparator$-CC.comparingDouble(new o1(2)));
        List.-EL.sort(this.d0, Comparator$-CC.comparingDouble(new o1(2)));
        a aVar3 = new a(this.c0);
        this.g0 = aVar3;
        aVar3.a = false;
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
        this.L = false;
        this.K = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int P = P();
        this.D0 = P;
        setBackgroundColor(P);
        fixNavigationBar();
        gh.c cVar = new gh.c();
        this.u0 = cVar;
        cVar.a(P());
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.s0 = null;
            this.t0 = null;
            this.v0 = new bh.b(cVar);
        } else {
            this.s0 = new bh.f(false);
            gh.d dVar = new gh.d(cVar);
            this.t0 = dVar;
            final int i12 = 0;
            dVar.v = new Runnable(this) { // from class: ai.p1
                public final /* synthetic */ a2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                a2 a2Var = this.b;
                                if (a2Var.s0 != null) {
                                    a2Var.R(2);
                                    break;
                                }
                            }
                            break;
                        default:
                            this.b.onBackPressed();
                            break;
                    }
                }
            };
            bh.b bVar = new bh.b(dVar);
            this.v0 = bVar;
            bVar.i = LiteMode.isEnabled(262144);
        }
        ih.k kVar = new ih.k(this.container);
        bh.b bVar2 = this.v0;
        org.telegram.ui.ActionBar.e3 e3Var2 = this.container;
        bVar2.f = kVar;
        bVar2.g = e3Var2;
        wz wzVar = new wz(3, false);
        this.h0 = wzVar;
        wzVar.O = new q1(this, 0);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(wzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new ah.d0(this, 2));
        r1 r1Var = new r1();
        this.i0 = r1Var;
        r1Var.C = false;
        r1Var.m = false;
        r1Var.n(280L);
        r1Var.o(bs.h);
        r1Var.D = 30L;
        this.d.setItemAnimator(r1Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.l0 = frameLayout;
        frameLayout.setClipChildren(false);
        final int i13 = 1;
        s1 s1Var = new s1(this, context, g6Var, new Runnable(this) { // from class: ai.p1
            public final /* synthetic */ a2 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            a2 a2Var = this.b;
                            if (a2Var.s0 != null) {
                                a2Var.R(2);
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        }, new ah.f(i13), new ah.f(1), new ah.f(1), new ah.f(1), new ah.f(1), new ah.f(1));
        this.o0 = s1Var;
        s1Var.d(new h6(1, 1));
        s1Var.setPreviewingAttributes(arrayList);
        s1Var.removeView(s1Var.P);
        int i14 = -1;
        frameLayout.addView(s1Var, w7.z5.c(-1.0f, -1));
        int i15 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i15, 0, i15, 0);
        ImageView imageView = new ImageView(context);
        this.m0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.a0(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ah.g0(this, 4));
        w7.b6.a(imageView);
        frameLayout.addView(imageView, w7.z5.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.a0(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new p(3, this, arrayList));
        w7.b6.a(imageView2);
        frameLayout.addView(imageView2, w7.z5.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i16 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView j10 = org.telegram.ui.Cells.b1.j(frameLayout, textView, w7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.p0 = j10;
        float f7 = 13.0f;
        j10.setTextSize(1, 13.0f);
        j10.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        j10.setGravity(17);
        int i17 = -1879048193;
        j10.setTextColor(-1879048193);
        frameLayout.addView(j10, w7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new w1[3];
        this.j0 = new z1(context, g6Var, new r0(this, 1));
        int i18 = 0;
        while (true) {
            w1[] w1VarArr = this.Z;
            if (i18 >= w1VarArr.length) {
                this.l0.addView(this.Y, w7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.l0, w7.z5.e(-1, 315, 55));
                int P2 = P();
                View view = new View(context);
                this.q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(P2, 160), P2 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = w7.z5.e(-1, 0, 48);
                e.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e);
                this.j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                dh.d c12 = this.v0.c(this.j0, null, false);
                c12.p(AndroidUtilities.dp(4.0f));
                c12.q(AndroidUtilities.dp(28.0f));
                c12.o(new eh.b(org.telegram.ui.ActionBar.k6.d6, g6Var));
                this.j0.setBackground(c12);
                this.containerView.addView(this.j0, w7.z5.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.w0 = new v1((TL_stars.starGiftAttributeBackdrop) ag.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) ag.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) ag.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.k0.N(false);
                U(false);
                return;
            }
            w1 w1Var = new w1(context);
            float f10 = f7;
            w1Var.setClipChildren(false);
            org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, false, false);
            w1Var.c = q6Var;
            q6Var.setTypeface(AndroidUtilities.bold());
            q6Var.setTextSize(AndroidUtilities.dp(f10));
            q6Var.setTextColor(i14);
            q6Var.setGravity(i16);
            w1Var.addView(q6Var, w7.z5.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            w1Var.b = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i17);
            textView2.setGravity(i16);
            w1Var.addView(textView2, w7.z5.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, false, false, false);
            w1Var.d = q6Var2;
            q6Var2.setTypeface(AndroidUtilities.bold());
            q6Var2.setTextColor(i14);
            q6Var2.setGravity(5);
            q6Var2.getDrawable().T = true;
            q6Var2.setTextSize(AndroidUtilities.dp(11.0f));
            q6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
            q6Var2.setSizeableBackground(new u6(AndroidUtilities.dp(10.0f), 285212671));
            w1Var.addView(q6Var2, w7.z5.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
            w1VarArr[i18] = w1Var;
            if (i18 == 0) {
                ((TextView) this.Z[i18].b).setText(LocaleController.getString(R.string.GiftPreviewModel));
            } else if (i18 == 1) {
                ((TextView) this.Z[i18].b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
            } else if (i18 == 2) {
                ((TextView) this.Z[i18].b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
            }
            w7.b6.a(this.Z[i18]);
            this.Z[i18].setOnClickListener(new n1(this, i18, 0));
            this.Z[i18].setBackground(org.telegram.ui.ActionBar.k6.a0(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.Y;
            w1[] w1VarArr2 = this.Z;
            linearLayout2.addView(w1VarArr2[i18], w7.z5.p(0, 42, 1.0f, 7, 0, 0, i18 != w1VarArr2.length - 1 ? 11 : 0, 0));
            i18++;
            f7 = f10;
            i16 = 17;
            i14 = -1;
            i17 = -1879048193;
        }
    }

    public static double Q(TL_stars.StarGiftAttribute starGiftAttribute) {
        TL_stars.StarGiftAttributeRarity starGiftAttributeRarity = starGiftAttribute.rarity;
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            return ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            return 0.01d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            return 0.02d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            return 0.03d;
        }
        return starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon ? 0.04d : 0.0d;
    }

    public final int P() {
        return i0.a.f(0.1f, getThemedColor(org.telegram.ui.ActionBar.k6.i5), getThemedColor(org.telegram.ui.ActionBar.k6.h5));
    }

    public final void R(int i10) {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.s0) == null) {
            return;
        }
        if (w7.j6.a(i10, 2)) {
            org.telegram.ui.ActionBar.e3 e3Var = this.container;
            z1 z1Var = this.j0;
            PointF pointF = this.A0;
            ih.k.b(z1Var, e3Var, pointF);
            float f7 = pointF.x;
            RectF rectF = this.z0;
            rectF.left = f7;
            rectF.top = pointF.y;
            rectF.right = f7 + z1Var.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.top + z1Var.getMeasuredHeight(), this.container.getMeasuredHeight());
            if (rectF.isEmpty()) {
                return;
            }
            float f10 = -(LiteMode.isEnabled(262144) ? 0 : AndroidUtilities.dp(48.0f));
            rectF.inset(f10, f10);
            fVar.g(1, this.B0);
        }
        if (fVar.j == 0) {
            return;
        }
        fVar.e(this.r0, this.container.getWidth(), this.container.getHeight());
    }

    public final boolean S(v1 v1Var) {
        if (this.E0 == 1) {
            return false;
        }
        int i10 = this.j0.s;
        v1 v1Var2 = this.w0;
        if (v1Var2 == null) {
            return false;
        }
        if (i10 == 1) {
            if (v1Var.a != v1Var2.a) {
                return false;
            }
        } else if (i10 == 2) {
            if (v1Var.b != v1Var2.b) {
                return false;
            }
        } else if (i10 != 0 || v1Var.c != v1Var2.c) {
            return false;
        }
        return true;
    }

    public final void T(int i10) {
        if (this.E0 == i10) {
            return;
        }
        this.E0 = i10;
        this.n0.setImageResource(i10 == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.p0.setText(LocaleController.getString(i10 == 2 ? R.string.Gift2PreviewSelectedTraits : R.string.Gift2PreviewRandomTraits));
        V();
    }

    public final void U(boolean z10) {
        s1 s1Var = this.o0;
        if (s1Var.getUpgradeImageViewAttribute() == null || s1Var.getUpgradeBackdropAttribute() == null || s1Var.getUpgradePatternAttribute() == null) {
            return;
        }
        w1[] w1VarArr = this.Z;
        ((org.telegram.ui.Components.q6) w1VarArr[0].c).c(s1Var.getUpgradeImageViewAttribute().name, z10, true);
        ((org.telegram.ui.Components.q6) w1VarArr[0].d).setText(l7.d2(s1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((org.telegram.ui.Components.q6) w1VarArr[1].c).c(s1Var.getUpgradeBackdropAttribute().name, z10, true);
        ((org.telegram.ui.Components.q6) w1VarArr[1].d).c(gi.l.H0(s1Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
        ((org.telegram.ui.Components.q6) w1VarArr[2].c).c(s1Var.getUpgradePatternAttribute().name, z10, true);
        ((org.telegram.ui.Components.q6) w1VarArr[2].d).c(gi.l.H0(s1Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
    }

    public final void V() {
        y1 y1Var;
        v1 v1Var;
        mm0 mm0Var = this.d;
        int childCount = mm0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = mm0Var.getChildAt(i10);
            if ((childAt instanceof y1) && (v1Var = (y1Var = (y1) childAt).v) != null) {
                boolean S = S(v1Var);
                y1Var.c.f(S, true);
                y1Var.r.a(S, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.l0;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f10;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void mainContainerDispatchDraw(Canvas canvas) {
        bh.f fVar;
        gh.d dVar;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || (fVar = this.s0) == null || (dVar = this.t0) == null || dVar.n || !dVar.g(width, height)) {
            return;
        }
        RecordingCanvas a2 = dVar.a(width, height);
        a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.k6.i5));
        fVar.b(a2, LiteMode.isEnabled(262144) ? -2 : -3);
        dVar.c();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.C0 != systemBottomInset) {
            this.C0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            z1 z1Var = this.j0;
            ((ViewGroup.MarginLayoutParams) z1Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.C0;
            z1Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        R(2);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int P = P();
            if (P != this.D0) {
                this.D0 = P;
                setBackgroundColor(P);
                gh.c cVar = this.u0;
                if (cVar != null) {
                    cVar.a(P);
                }
                View view = this.q0;
                if (view != null && (view.getBackground() instanceof GradientDrawable)) {
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{i0.a.o(P, 160), P & 16777215});
                }
            }
            z1 z1Var = this.j0;
            if (z1Var != null) {
                int i10 = org.telegram.ui.ActionBar.k6.Wk;
                org.telegram.ui.ActionBar.g6 g6Var = z1Var.r;
                int o12 = org.telegram.ui.ActionBar.k6.o1(0.09411765f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
                org.telegram.ui.ActionBar.k6.o1(0.1254902f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
                z1Var.e.setColor(o12);
                z1Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        t1 t1Var = new t1(this, this.d, getContext(), this.X, new q(this, 3), this.resourcesProvider);
        this.k0 = t1Var;
        t1Var.r = false;
        return t1Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 x(Context context) {
        return new u1(this, context, this.resourcesProvider, 0);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return null;
    }
}

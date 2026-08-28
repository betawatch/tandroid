package gh;

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
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.zy;
import org.telegram.ui.ns;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l1 extends org.telegram.ui.Components.sa {
    public static final /* synthetic */ int z0 = 0;
    public final int T;
    public final LinearLayout U;
    public final h1[] V;
    public final ArrayList W;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final com.google.android.gms.common.api.internal.r a0;
    public final com.google.android.gms.common.api.internal.r b0;
    public final com.google.android.gms.common.api.internal.r c0;
    public final zy d0;
    public final c1 e0;
    public final k1 f0;
    public e1 g0;
    public final FrameLayout h0;
    public final ImageView i0;
    public final ImageView j0;
    public final d1 k0;
    public final TextView l0;
    public final View m0;
    public final ig.k n0;
    public final ig.e o0;
    public final ng.d p0;
    public final ig.a q0;
    public g1 r0;
    public final boolean s0;
    public boolean t0;
    public final RectF u0;
    public final PointF v0;
    public final ArrayList w0;
    public int x0;
    public int y0;

    /* JADX WARN: Type inference failed for: r4v18, types: [gh.b1] */
    public l1(Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, false, 1, b6Var);
        this.y0 = 1;
        RectF rectF = new RectF();
        this.u0 = rectF;
        this.v0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.w0 = arrayList2;
        arrayList2.add(rectF);
        this.T = i9;
        this.s0 = z10;
        wk0 wk0Var = this.d;
        org.telegram.ui.ActionBar.d3 d3Var = this.container;
        Objects.requireNonNull(wk0Var);
        this.n0 = new ig.k(wk0Var, d3Var, new ns(wk0Var, 0));
        ArrayList c10 = gf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.W = c10;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c10);
        this.a0 = rVar;
        rVar.b = false;
        ArrayList c11 = gf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.X = c11;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c11);
        this.b0 = rVar2;
        rVar2.b = false;
        this.Y = gf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.Z = arrayList3;
        if (z10) {
            int i10 = 0;
            while (i10 < this.Y.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.Y.get(i10);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.Z.add(stargiftattributemodel);
                    this.Y.remove(i10);
                    i10--;
                }
                i10++;
            }
        } else {
            arrayList3.clear();
        }
        List.-EL.sort(this.W, Comparator$-CC.comparingDouble(new a1(0)));
        List.-EL.sort(this.X, Comparator$-CC.comparingDouble(new a1(1)));
        List.-EL.sort(this.Y, Comparator$-CC.comparingDouble(new a1(2)));
        List.-EL.sort(this.Z, Comparator$-CC.comparingDouble(new a1(2)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.Y);
        this.c0 = rVar3;
        rVar3.b = false;
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
        this.H = false;
        this.G = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i11 = org.telegram.ui.ActionBar.f6.i5;
        int themedColor = getThemedColor(i11);
        int i12 = org.telegram.ui.ActionBar.f6.h5;
        setBackgroundColor(i0.a.d(0.1f, themedColor, getThemedColor(i12)));
        fixNavigationBar();
        ng.c cVar = new ng.c();
        cVar.a(i0.a.d(0.1f, getThemedColor(i11), getThemedColor(i12)));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.o0 = null;
            this.p0 = null;
            this.q0 = new ig.a(cVar);
        } else {
            this.o0 = new ig.e(false);
            ng.d dVar = new ng.d(cVar);
            this.p0 = dVar;
            final int i13 = 0;
            dVar.v = new Runnable(this) { // from class: gh.b1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                l1 l1Var = this.b;
                                if (l1Var.o0 != null) {
                                    l1Var.P(2);
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
            ig.a aVar = new ig.a(dVar);
            this.q0 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
        }
        pg.i iVar = new pg.i(this.container);
        ig.a aVar2 = this.q0;
        org.telegram.ui.ActionBar.d3 d3Var2 = this.container;
        aVar2.d = iVar;
        aVar2.e = d3Var2;
        zy zyVar = new zy(3, false);
        this.d0 = zyVar;
        zyVar.O = new fh.c6(this, 1);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(zyVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new bg.o2(this, 6));
        c1 c1Var = new c1();
        this.e0 = c1Var;
        c1Var.C = false;
        c1Var.m = false;
        c1Var.n(280L);
        c1Var.o(gr.h);
        c1Var.D = 30L;
        this.d.setItemAnimator(c1Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h0 = frameLayout;
        frameLayout.setClipChildren(false);
        final int i14 = 1;
        d1 d1Var = new d1(this, context, b6Var, new Runnable(this) { // from class: gh.b1
            public final /* synthetic */ l1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            l1 l1Var = this.b;
                            if (l1Var.o0 != null) {
                                l1Var.P(2);
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        }, new fh.n(3), new fh.n(3), new fh.n(3), new fh.n(3), new fh.n(3), new fh.n(3));
        this.k0 = d1Var;
        d1Var.d(new l4(1, 1));
        d1Var.setPreviewingAttributes(arrayList);
        d1Var.removeView(d1Var.K);
        int i15 = -1;
        frameLayout.addView(d1Var, g7.e6.c(-1.0f, -1));
        int i16 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i16, 0, i16, 0);
        ImageView imageView = new ImageView(context);
        this.i0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.f6.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 11));
        g7.g6.a(imageView);
        frameLayout.addView(imageView, g7.e6.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.j0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new bg.u1(15, this, arrayList));
        g7.g6.a(imageView2);
        frameLayout.addView(imageView2, g7.e6.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i17 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView, g7.e6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.l0 = g10;
        g10.setTextSize(1, 13.0f);
        g10.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        g10.setGravity(17);
        int i18 = -1879048193;
        g10.setTextColor(-1879048193);
        frameLayout.addView(g10, g7.e6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.V = new h1[3];
        this.f0 = new k1(context, b6Var, new bg.i(this, 12));
        int i19 = 0;
        while (true) {
            h1[] h1VarArr = this.V;
            if (i19 >= h1VarArr.length) {
                this.h0.addView(this.U, g7.e6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.h0, g7.e6.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.f6.i5), getThemedColor(org.telegram.ui.ActionBar.f6.h5));
                View view = new View(context);
                this.m0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e10 = g7.e6.e(-1, 0, 48);
                e10.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e10);
                this.f0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                kg.d c12 = this.q0.c(this.f0, null, false);
                c12.o(AndroidUtilities.dp(4.0f));
                c12.p(AndroidUtilities.dp(28.0f));
                c12.n(new lg.b(org.telegram.ui.ActionBar.f6.d6, b6Var));
                this.f0.setBackground(c12);
                this.containerView.addView(this.f0, g7.e6.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.r0 = new g1((TL_stars.starGiftAttributeBackdrop) gf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) gf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) gf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.g0.N(false);
                S(false);
                return;
            }
            h1 h1Var = new h1(context);
            h1Var.setClipChildren(false);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, false, false);
            h1Var.c = j6Var;
            j6Var.setTypeface(AndroidUtilities.bold());
            j6Var.setTextSize(AndroidUtilities.dp(13.0f));
            j6Var.setTextColor(i15);
            j6Var.setGravity(i17);
            h1Var.addView(j6Var, g7.e6.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            h1Var.b = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i18);
            textView2.setGravity(i17);
            h1Var.addView(textView2, g7.e6.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
            h1Var.d = j6Var2;
            j6Var2.setTypeface(AndroidUtilities.bold());
            j6Var2.setTextColor(i15);
            j6Var2.setGravity(5);
            j6Var2.getDrawable().N = true;
            j6Var2.setTextSize(AndroidUtilities.dp(11.0f));
            j6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
            j6Var2.setSizeableBackground(new w4(AndroidUtilities.dp(10.0f), 285212671));
            h1Var.addView(j6Var2, g7.e6.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
            h1VarArr[i19] = h1Var;
            if (i19 == 0) {
                ((TextView) this.V[i19].b).setText(LocaleController.getString(R.string.GiftPreviewModel));
            } else if (i19 == 1) {
                ((TextView) this.V[i19].b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
            } else if (i19 == 2) {
                ((TextView) this.V[i19].b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
            }
            g7.g6.a(this.V[i19]);
            this.V[i19].setOnClickListener(new z0(this, i19, 0));
            this.V[i19].setBackground(org.telegram.ui.ActionBar.f6.Z(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.U;
            h1[] h1VarArr2 = this.V;
            linearLayout2.addView(h1VarArr2[i19], g7.e6.p(0, 42, 1.0f, 7, 0, 0, i19 != h1VarArr2.length - 1 ? 11 : 0, 0));
            i19++;
            i17 = 17;
            i15 = -1;
            i18 = -1879048193;
        }
    }

    public static double O(TL_stars.StarGiftAttribute starGiftAttribute) {
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

    public final void P(int i9) {
        ig.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.o0) == null) {
            return;
        }
        if (g7.z7.a(i9, 2)) {
            org.telegram.ui.ActionBar.d3 d3Var = this.container;
            k1 k1Var = this.f0;
            PointF pointF = this.v0;
            pg.i.b(k1Var, d3Var, pointF);
            float f10 = pointF.x;
            RectF rectF = this.u0;
            rectF.left = f10;
            rectF.top = pointF.y;
            rectF.right = f10 + k1Var.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.top + k1Var.getMeasuredHeight(), this.container.getMeasuredHeight());
            if (rectF.isEmpty()) {
                return;
            }
            float f11 = -(LiteMode.isEnabled(262144) ? 0 : AndroidUtilities.dp(48.0f));
            rectF.inset(f11, f11);
            eVar.g(1, this.w0);
        }
        if (eVar.j == 0) {
            return;
        }
        eVar.e(this.n0, this.container.getWidth(), this.container.getHeight());
    }

    public final boolean Q(g1 g1Var) {
        if (this.y0 == 1) {
            return false;
        }
        int i9 = this.f0.r;
        g1 g1Var2 = this.r0;
        if (g1Var2 == null) {
            return false;
        }
        if (i9 == 1) {
            if (g1Var.a != g1Var2.a) {
                return false;
            }
        } else if (i9 == 2) {
            if (g1Var.b != g1Var2.b) {
                return false;
            }
        } else if (i9 != 0 || g1Var.c != g1Var2.c) {
            return false;
        }
        return true;
    }

    public final void R(int i9) {
        if (this.y0 == i9) {
            return;
        }
        this.y0 = i9;
        this.j0.setImageResource(i9 == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.l0.setText(LocaleController.getString(i9 == 2 ? R.string.Gift2PreviewSelectedTraits : R.string.Gift2PreviewRandomTraits));
        T();
    }

    public final void S(boolean z10) {
        d1 d1Var = this.k0;
        if (d1Var.getUpgradeImageViewAttribute() == null || d1Var.getUpgradeBackdropAttribute() == null || d1Var.getUpgradePatternAttribute() == null) {
            return;
        }
        h1[] h1VarArr = this.V;
        ((org.telegram.ui.Components.j6) h1VarArr[0].c).c(d1Var.getUpgradeImageViewAttribute().name, z10, true);
        ((org.telegram.ui.Components.j6) h1VarArr[0].d).setText(k5.J1(d1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((org.telegram.ui.Components.j6) h1VarArr[1].c).c(d1Var.getUpgradeBackdropAttribute().name, z10, true);
        ((org.telegram.ui.Components.j6) h1VarArr[1].d).c(mh.l.F0(d1Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
        ((org.telegram.ui.Components.j6) h1VarArr[2].c).c(d1Var.getUpgradePatternAttribute().name, z10, true);
        ((org.telegram.ui.Components.j6) h1VarArr[2].d).c(mh.l.F0(d1Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
    }

    public final void T() {
        j1 j1Var;
        g1 g1Var;
        wk0 wk0Var = this.d;
        int childCount = wk0Var.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = wk0Var.getChildAt(i9);
            if ((childAt instanceof j1) && (g1Var = (j1Var = (j1) childAt).v) != null) {
                boolean Q = Q(g1Var);
                j1Var.c.f(Q, true);
                j1Var.r.a(Q, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean isTouchOutside(float f10, float f11) {
        FrameLayout frameLayout = this.h0;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f11;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void mainContainerDispatchDraw(Canvas canvas) {
        ig.e eVar;
        ng.d dVar;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || (eVar = this.o0) == null || (dVar = this.p0) == null || dVar.n || !dVar.e(width, height)) {
            return;
        }
        RecordingCanvas a2 = dVar.a(width, height);
        a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.f6.i5));
        eVar.b(a2, LiteMode.isEnabled(262144) ? -2 : -3);
        dVar.b();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.x0 != systemBottomInset) {
            this.x0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            k1 k1Var = this.f0;
            ((ViewGroup.MarginLayoutParams) k1Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.x0;
            k1Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        P(2);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        e1 e1Var = new e1(this, this.d, getContext(), this.T, new bh.c(this, 16), this.resourcesProvider);
        this.g0 = e1Var;
        e1Var.r = false;
        return e1Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final wk0 w(Context context) {
        return new f1(this, context, this.resourcesProvider, 0);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return null;
    }
}

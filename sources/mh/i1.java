package mh;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.us;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class i1 extends org.telegram.ui.Components.sa {
    public static final /* synthetic */ int A0 = 0;
    public final int U;
    public final LinearLayout V;
    public final eg.t3[] W;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList a0;
    public final com.google.android.gms.common.api.internal.r b0;
    public final com.google.android.gms.common.api.internal.r c0;
    public final com.google.android.gms.common.api.internal.r d0;
    public final pz e0;
    public final a1 f0;
    public final h1 g0;
    public c1 h0;
    public final FrameLayout i0;
    public final ImageView j0;
    public final ImageView k0;
    public final b1 l0;
    public final TextView m0;
    public final View n0;
    public final og.k o0;
    public final og.e p0;
    public final tg.d q0;
    public final og.a r0;
    public e1 s0;
    public final boolean t0;
    public boolean u0;
    public final RectF v0;
    public final PointF w0;
    public final ArrayList x0;
    public int y0;
    public int z0;

    /* JADX WARN: Type inference failed for: r4v18, types: [mh.z0] */
    public i1(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, String str, ArrayList arrayList, boolean z4) {
        super(context, null, false, false, false, 1, g6Var);
        this.z0 = 1;
        RectF rectF = new RectF();
        this.v0 = rectF;
        this.w0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.x0 = arrayList2;
        arrayList2.add(rectF);
        this.U = i10;
        this.t0 = z4;
        sl0 sl0Var = this.d;
        org.telegram.ui.ActionBar.f3 f3Var = this.container;
        Objects.requireNonNull(sl0Var);
        this.o0 = new og.k(sl0Var, f3Var, new us(sl0Var, 0));
        ArrayList c3 = mf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.X = c3;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c3);
        this.b0 = rVar;
        rVar.b = false;
        ArrayList c10 = mf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.Y = c10;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c10);
        this.c0 = rVar2;
        rVar2.b = false;
        this.Z = mf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.a0 = arrayList3;
        if (z4) {
            int i11 = 0;
            while (i11 < this.Z.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.Z.get(i11);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.a0.add(stargiftattributemodel);
                    this.Z.remove(i11);
                    i11--;
                }
                i11++;
            }
        } else {
            arrayList3.clear();
        }
        List.-EL.sort(this.X, Comparator$-CC.comparingDouble(new y0(0)));
        List.-EL.sort(this.Y, Comparator$-CC.comparingDouble(new y0(1)));
        List.-EL.sort(this.Z, Comparator$-CC.comparingDouble(new y0(2)));
        List.-EL.sort(this.a0, Comparator$-CC.comparingDouble(new y0(2)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.Z);
        this.d0 = rVar3;
        rVar3.b = false;
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
        this.I = false;
        this.H = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i12 = org.telegram.ui.ActionBar.k6.i5;
        int themedColor = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.k6.h5;
        setBackgroundColor(i0.a.d(0.1f, themedColor, getThemedColor(i13)));
        fixNavigationBar();
        tg.c cVar = new tg.c();
        cVar.a(i0.a.d(0.1f, getThemedColor(i12), getThemedColor(i13)));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.p0 = null;
            this.q0 = null;
            this.r0 = new og.a(cVar);
        } else {
            this.p0 = new og.e(false);
            tg.d dVar = new tg.d(cVar);
            this.q0 = dVar;
            final int i14 = 0;
            dVar.v = new Runnable(this) { // from class: mh.z0
                public final /* synthetic */ i1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                i1 i1Var = this.b;
                                if (i1Var.p0 != null) {
                                    i1Var.Q(2);
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
            og.a aVar = new og.a(dVar);
            this.r0 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
        }
        vg.i iVar = new vg.i(this.container);
        og.a aVar2 = this.r0;
        org.telegram.ui.ActionBar.f3 f3Var2 = this.container;
        aVar2.d = iVar;
        aVar2.e = f3Var2;
        pz pzVar = new pz(3, false);
        this.e0 = pzVar;
        pzVar.O = new lh.n5(this, 1);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(pzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new fg.e2(this, 7));
        a1 a1Var = new a1();
        this.f0 = a1Var;
        a1Var.C = false;
        a1Var.m = false;
        a1Var.n(280L);
        a1Var.o(pr.h);
        a1Var.D = 30L;
        this.d.setItemAnimator(a1Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.i0 = frameLayout;
        frameLayout.setClipChildren(false);
        final int i15 = 1;
        b1 b1Var = new b1(this, context, g6Var, new Runnable(this) { // from class: mh.z0
            public final /* synthetic */ i1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            i1 i1Var = this.b;
                            if (i1Var.p0 != null) {
                                i1Var.Q(2);
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        }, new eg.m(5), new eg.m(5), new eg.m(5), new eg.m(5), new eg.m(5), new eg.m(5));
        this.l0 = b1Var;
        b1Var.d(new c5.d(1, 1));
        b1Var.setPreviewingAttributes(arrayList);
        b1Var.removeView(b1Var.L);
        int i16 = -1;
        frameLayout.addView(b1Var, k7.c6.c(-1.0f, -1));
        int i17 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i17, 0, i17, 0);
        ImageView imageView = new ImageView(context);
        this.j0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 17));
        k7.e6.a(imageView);
        frameLayout.addView(imageView, k7.c6.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.k0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new dg.n(19, this, arrayList));
        k7.e6.a(imageView2);
        frameLayout.addView(imageView2, k7.c6.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i18 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView h = yh.h(frameLayout, textView, k7.c6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.m0 = h;
        h.setTextSize(1, 13.0f);
        h.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        h.setGravity(17);
        int i19 = -1879048193;
        h.setTextColor(-1879048193);
        frameLayout.addView(h, k7.c6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.W = new eg.t3[3];
        this.g0 = new h1(context, g6Var, new dg.h0(this, 19));
        int i20 = 0;
        while (true) {
            eg.t3[] t3VarArr = this.W;
            if (i20 >= t3VarArr.length) {
                this.i0.addView(this.V, k7.c6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.i0, k7.c6.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.k6.i5), getThemedColor(org.telegram.ui.ActionBar.k6.h5));
                View view = new View(context);
                this.n0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e6 = k7.c6.e(-1, 0, 48);
                e6.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e6);
                this.g0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                qg.b c11 = this.r0.c(this.g0, null, false);
                c11.o(AndroidUtilities.dp(4.0f));
                c11.p(AndroidUtilities.dp(28.0f));
                c11.n(new rg.b(org.telegram.ui.ActionBar.k6.d6, g6Var));
                this.g0.setBackground(c11);
                this.containerView.addView(this.g0, k7.c6.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.s0 = new e1((TL_stars.starGiftAttributeBackdrop) mf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) mf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) mf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.h0.N(false);
                T(false);
                return;
            }
            eg.t3 t3Var = new eg.t3(context);
            t3Var.setClipChildren(false);
            org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, false, false);
            t3Var.d = k6Var;
            k6Var.setTypeface(AndroidUtilities.bold());
            k6Var.setTextSize(AndroidUtilities.dp(13.0f));
            k6Var.setTextColor(i16);
            k6Var.setGravity(i18);
            t3Var.addView(k6Var, k7.c6.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            t3Var.c = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor(i19);
            textView2.setGravity(i18);
            t3Var.addView(textView2, k7.c6.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, false, false);
            t3Var.b = k6Var2;
            k6Var2.setTypeface(AndroidUtilities.bold());
            k6Var2.setTextColor(i16);
            k6Var2.setGravity(5);
            k6Var2.getDrawable().N = true;
            k6Var2.setTextSize(AndroidUtilities.dp(11.0f));
            k6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
            k6Var2.setSizeableBackground(new s4(AndroidUtilities.dp(10.0f), 285212671));
            t3Var.addView(k6Var2, k7.c6.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
            t3VarArr[i20] = t3Var;
            if (i20 == 0) {
                ((TextView) this.W[i20].c).setText(LocaleController.getString(R.string.GiftPreviewModel));
            } else if (i20 == 1) {
                ((TextView) this.W[i20].c).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
            } else if (i20 == 2) {
                ((TextView) this.W[i20].c).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
            }
            k7.e6.a(this.W[i20]);
            this.W[i20].setOnClickListener(new x0(this, i20, 0));
            this.W[i20].setBackground(org.telegram.ui.ActionBar.k6.Z(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.V;
            eg.t3[] t3VarArr2 = this.W;
            linearLayout2.addView(t3VarArr2[i20], k7.c6.p(0, 42, 1.0f, 7, 0, 0, i20 != t3VarArr2.length - 1 ? 11 : 0, 0));
            i20++;
            i18 = 17;
            i16 = -1;
            i19 = -1879048193;
        }
    }

    public static double P(TL_stars.StarGiftAttribute starGiftAttribute) {
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

    public final void Q(int i10) {
        og.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.p0) == null) {
            return;
        }
        if (k7.x8.a(i10, 2)) {
            org.telegram.ui.ActionBar.f3 f3Var = this.container;
            h1 h1Var = this.g0;
            PointF pointF = this.w0;
            vg.i.b(h1Var, f3Var, pointF);
            float f10 = pointF.x;
            RectF rectF = this.v0;
            rectF.left = f10;
            rectF.top = pointF.y;
            rectF.right = f10 + h1Var.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.top + h1Var.getMeasuredHeight(), this.container.getMeasuredHeight());
            if (rectF.isEmpty()) {
                return;
            }
            float f11 = -(LiteMode.isEnabled(262144) ? 0 : AndroidUtilities.dp(48.0f));
            rectF.inset(f11, f11);
            eVar.g(1, this.x0);
        }
        if (eVar.j == 0) {
            return;
        }
        eVar.e(this.o0, this.container.getWidth(), this.container.getHeight());
    }

    public final boolean R(e1 e1Var) {
        if (this.z0 == 1) {
            return false;
        }
        int i10 = this.g0.r;
        e1 e1Var2 = this.s0;
        if (e1Var2 == null) {
            return false;
        }
        if (i10 == 1) {
            if (e1Var.a != e1Var2.a) {
                return false;
            }
        } else if (i10 == 2) {
            if (e1Var.b != e1Var2.b) {
                return false;
            }
        } else if (i10 != 0 || e1Var.c != e1Var2.c) {
            return false;
        }
        return true;
    }

    public final void S(int i10) {
        if (this.z0 == i10) {
            return;
        }
        this.z0 = i10;
        this.k0.setImageResource(i10 == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.m0.setText(LocaleController.getString(i10 == 2 ? R.string.Gift2PreviewSelectedTraits : R.string.Gift2PreviewRandomTraits));
        U();
    }

    public final void T(boolean z4) {
        b1 b1Var = this.l0;
        if (b1Var.getUpgradeImageViewAttribute() == null || b1Var.getUpgradeBackdropAttribute() == null || b1Var.getUpgradePatternAttribute() == null) {
            return;
        }
        eg.t3[] t3VarArr = this.W;
        ((org.telegram.ui.Components.k6) t3VarArr[0].d).c(b1Var.getUpgradeImageViewAttribute().name, z4, true);
        ((org.telegram.ui.Components.k6) t3VarArr[0].b).setText(g5.J1(b1Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((org.telegram.ui.Components.k6) t3VarArr[1].d).c(b1Var.getUpgradeBackdropAttribute().name, z4, true);
        ((org.telegram.ui.Components.k6) t3VarArr[1].b).c(sh.j.G0(b1Var.getUpgradeBackdropAttribute().getRarityPermille()), z4, true);
        ((org.telegram.ui.Components.k6) t3VarArr[2].d).c(b1Var.getUpgradePatternAttribute().name, z4, true);
        ((org.telegram.ui.Components.k6) t3VarArr[2].b).c(sh.j.G0(b1Var.getUpgradePatternAttribute().getRarityPermille()), z4, true);
    }

    public final void U() {
        g1 g1Var;
        e1 e1Var;
        sl0 sl0Var = this.d;
        int childCount = sl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = sl0Var.getChildAt(i10);
            if ((childAt instanceof g1) && (e1Var = (g1Var = (g1) childAt).v) != null) {
                boolean R = R(e1Var);
                g1Var.c.f(R, true);
                g1Var.r.a(R, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean isTouchOutside(float f10, float f11) {
        FrameLayout frameLayout = this.i0;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f11;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void mainContainerDispatchDraw(Canvas canvas) {
        og.e eVar;
        tg.d dVar;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || (eVar = this.p0) == null || (dVar = this.q0) == null || dVar.n || !dVar.f(width, height)) {
            return;
        }
        RecordingCanvas a2 = dVar.a(width, height);
        a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.k6.i5));
        eVar.b(a2, LiteMode.isEnabled(262144) ? -2 : -3);
        dVar.c();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.y0 != systemBottomInset) {
            this.y0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            h1 h1Var = this.g0;
            ((ViewGroup.MarginLayoutParams) h1Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.y0;
            h1Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        Q(2);
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        c1 c1Var = new c1(this, this.d, getContext(), this.U, new eg.p1(this, 17), this.resourcesProvider);
        this.h0 = c1Var;
        c1Var.r = false;
        return c1Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final sl0 w(Context context) {
        return new d1(this, context, this.resourcesProvider, 0);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return null;
    }
}

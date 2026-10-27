package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e51 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ok b;
    public final org.telegram.ui.za1 c;
    public final TextView d;
    public final c51 e;
    public final View f;
    public final View h;
    public final /* synthetic */ g51 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e51(g51 g51Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        org.telegram.ui.ActionBar.u6 u6Var5;
        org.telegram.ui.ActionBar.u6 u6Var6;
        org.telegram.ui.ActionBar.u6 u6Var7;
        org.telegram.ui.ActionBar.u6 u6Var8;
        this.n = g51Var;
        View view = new View(context);
        this.f = view;
        int i10 = org.telegram.ui.ActionBar.y6.h5;
        u6Var = ((org.telegram.ui.ActionBar.k3) g51Var).resourcesProvider;
        String str = g51Var.s;
        org.telegram.ui.ActionBar.f7.i(i10, view, u6Var);
        addView(view, kb1.h(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i11 = org.telegram.ui.ActionBar.y6.j5;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) g51Var).resourcesProvider;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var2, mode);
        int i12 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(g51Var.getThemedColor(i12), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        u6Var3 = ((org.telegram.ui.ActionBar.k3) g51Var).resourcesProvider;
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var3);
        imageView.setAlpha(0.0f);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a51
            public final /* synthetic */ e51 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.ui.ActionBar.u6 u6Var9;
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.u6 u6Var10;
                switch (i13) {
                    case 0:
                        this.b.n.dismiss();
                        break;
                    default:
                        e51 e51Var = this.b;
                        c51 c51Var = e51Var.e;
                        d51 d51Var = new d51(e51Var.getContext(), null);
                        Drawable mutate = e51Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i14 = org.telegram.ui.ActionBar.y6.G8;
                        g51 g51Var2 = e51Var.n;
                        u6Var9 = ((org.telegram.ui.ActionBar.k3) g51Var2).resourcesProvider;
                        org.telegram.ui.ActionBar.f7.y(e51Var, mutate, i14, u6Var9, PorterDuff.Mode.MULTIPLY);
                        d51Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        int i15 = 0;
                        while (i15 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i15);
                            if (!localeInfo.pluralLangCode.equals(g51Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(g51Var2.v, localeInfo.pluralLangCode);
                                Context context2 = e51Var.getContext();
                                boolean z11 = i15 == locales.size() - 1;
                                u6Var10 = ((org.telegram.ui.ActionBar.k3) g51Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, u6Var10, z10, z11);
                                g1Var.setText(g51.J(g51.N(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(g51Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new b51(e51Var, runnableArr, localeInfo, 0));
                                d51Var.addView(g1Var);
                                z10 = false;
                            }
                            i15++;
                        }
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(d51Var, -2, -2);
                        runnableArr[0] = new np0(o1Var, 28);
                        o1Var.e = true;
                        o1Var.c = 220;
                        o1Var.setOutsideTouchable(true);
                        o1Var.setClippingEnabled(true);
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        o1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        c51Var.getLocationInWindow(iArr);
                        d51Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = d51Var.getMeasuredHeight();
                        int i16 = iArr[1];
                        int dp = ((float) i16) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i16 - measuredHeight) : (c51Var.getMeasuredHeight() + i16) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.k3) g51Var2).containerView;
                        o1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        addView(imageView, kb1.h(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ok okVar = new org.telegram.ui.ok(this, context, 2);
        this.b = okVar;
        u6Var4 = ((org.telegram.ui.ActionBar.k3) g51Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.V(okVar, i11, u6Var4);
        okVar.setTextSize(1, 20.0f);
        okVar.setTypeface(AndroidUtilities.bold());
        okVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        okVar.setPivotX(0.0f);
        okVar.setPivotY(0.0f);
        addView(okVar, kb1.h(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.za1 za1Var = new org.telegram.ui.za1(this, context, 14);
        this.c = za1Var;
        if (LocaleController.isRTL) {
            za1Var.setGravity(5);
        }
        za1Var.setPivotX(0.0f);
        za1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !TranslateController.UNKNOWN_LANGUAGE.equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            int i14 = org.telegram.ui.ActionBar.y6.Pi;
            u6Var8 = ((org.telegram.ui.ActionBar.k3) g51Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.V(textView, i14, u6Var8);
            textView.setTextSize(1, 14.0f);
            textView.setText(g51.J(g51.N(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i15 = org.telegram.ui.ActionBar.y6.Pi;
        u6Var5 = ((org.telegram.ui.ActionBar.k3) g51Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.t(imageView2, i15, u6Var5, mode);
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        c51 c51Var = new c51(this, context);
        this.e = c51Var;
        if (LocaleController.isRTL) {
            c51Var.setGravity(5);
        }
        c51Var.b(0.25f, 350L, ds.h);
        u6Var6 = ((org.telegram.ui.ActionBar.k3) g51Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.Z(c51Var, i15, u6Var6);
        c51Var.setTextSize(AndroidUtilities.dp(14.0f));
        c51Var.setText(g51.J(g51.N(g51Var.v, null, null)));
        c51Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i16 = 1;
        c51Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a51
            public final /* synthetic */ e51 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.ui.ActionBar.u6 u6Var9;
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.u6 u6Var10;
                switch (i16) {
                    case 0:
                        this.b.n.dismiss();
                        break;
                    default:
                        e51 e51Var = this.b;
                        c51 c51Var2 = e51Var.e;
                        d51 d51Var = new d51(e51Var.getContext(), null);
                        Drawable mutate = e51Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i142 = org.telegram.ui.ActionBar.y6.G8;
                        g51 g51Var2 = e51Var.n;
                        u6Var9 = ((org.telegram.ui.ActionBar.k3) g51Var2).resourcesProvider;
                        org.telegram.ui.ActionBar.f7.y(e51Var, mutate, i142, u6Var9, PorterDuff.Mode.MULTIPLY);
                        d51Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        int i152 = 0;
                        while (i152 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i152);
                            if (!localeInfo.pluralLangCode.equals(g51Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(g51Var2.v, localeInfo.pluralLangCode);
                                Context context2 = e51Var.getContext();
                                boolean z11 = i152 == locales.size() - 1;
                                u6Var10 = ((org.telegram.ui.ActionBar.k3) g51Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, u6Var10, z10, z11);
                                g1Var.setText(g51.J(g51.N(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(g51Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new b51(e51Var, runnableArr, localeInfo, 0));
                                d51Var.addView(g1Var);
                                z10 = false;
                            }
                            i152++;
                        }
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(d51Var, -2, -2);
                        runnableArr[0] = new np0(o1Var, 28);
                        o1Var.e = true;
                        o1Var.c = 220;
                        o1Var.setOutsideTouchable(true);
                        o1Var.setClippingEnabled(true);
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        o1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        c51Var2.getLocationInWindow(iArr);
                        d51Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = d51Var.getMeasuredHeight();
                        int i162 = iArr[1];
                        int dp = ((float) i162) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i162 - measuredHeight) : (c51Var2.getMeasuredHeight() + i162) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.k3) g51Var2).containerView;
                        o1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            za1Var.addView(c51Var, kb1.x(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                za1Var.addView(imageView2, kb1.x(-2, -2, 16, 0, 1, 0, 0));
                za1Var.addView(this.d, kb1.x(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                za1Var.addView(textView2, kb1.x(-2, -2, 16, 0, 0, 4, 0));
                za1Var.addView(imageView2, kb1.x(-2, -2, 16, 0, 1, 0, 0));
            }
            za1Var.addView(c51Var, kb1.x(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(za1Var, kb1.h(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        int i17 = org.telegram.ui.ActionBar.y6.V5;
        u6Var7 = ((org.telegram.ui.ActionBar.k3) g51Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.i(i17, view2, u6Var7);
        view2.setAlpha(0.0f);
        addView(view2, kb1.h(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        float a2 = a8.ee.a((f7 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!g51.F(this.n)) {
            a2 = 1.0f;
        }
        float interpolation = ds.g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.ok okVar = this.b;
        okVar.setScaleX(lerp);
        okVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        okVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.za1 za1Var = this.c;
        if (!z10) {
            okVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            za1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        za1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}

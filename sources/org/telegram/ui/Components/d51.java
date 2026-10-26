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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d51 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.mk b;
    public final org.telegram.ui.xa1 c;
    public final TextView d;
    public final b51 e;
    public final View f;
    public final View h;
    public final /* synthetic */ f51 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d51(f51 f51Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        org.telegram.ui.ActionBar.u6 u6Var5;
        org.telegram.ui.ActionBar.u6 u6Var6;
        org.telegram.ui.ActionBar.u6 u6Var7;
        org.telegram.ui.ActionBar.u6 u6Var8;
        this.n = f51Var;
        View view = new View(context);
        this.f = view;
        int i10 = org.telegram.ui.ActionBar.y6.h5;
        u6Var = ((org.telegram.ui.ActionBar.k3) f51Var).resourcesProvider;
        String str = f51Var.s;
        org.telegram.ui.ActionBar.f7.i(i10, view, u6Var);
        addView(view, gb1.h(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i11 = org.telegram.ui.ActionBar.y6.j5;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) f51Var).resourcesProvider;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var2, mode);
        int i12 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(f51Var.getThemedColor(i12), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        u6Var3 = ((org.telegram.ui.ActionBar.k3) f51Var).resourcesProvider;
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var3);
        imageView.setAlpha(0.0f);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.z41
            public final /* synthetic */ d51 b;

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
                        d51 d51Var = this.b;
                        b51 b51Var = d51Var.e;
                        c51 c51Var = new c51(d51Var.getContext(), null);
                        Drawable mutate = d51Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i14 = org.telegram.ui.ActionBar.y6.G8;
                        f51 f51Var2 = d51Var.n;
                        u6Var9 = ((org.telegram.ui.ActionBar.k3) f51Var2).resourcesProvider;
                        org.telegram.ui.ActionBar.f7.y(d51Var, mutate, i14, u6Var9, PorterDuff.Mode.MULTIPLY);
                        c51Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        int i15 = 0;
                        while (i15 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i15);
                            if (!localeInfo.pluralLangCode.equals(f51Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(f51Var2.v, localeInfo.pluralLangCode);
                                Context context2 = d51Var.getContext();
                                boolean z11 = i15 == locales.size() - 1;
                                u6Var10 = ((org.telegram.ui.ActionBar.k3) f51Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, u6Var10, z10, z11);
                                g1Var.setText(f51.J(f51.N(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(f51Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new a51(d51Var, runnableArr, localeInfo, 0));
                                c51Var.addView(g1Var);
                                z10 = false;
                            }
                            i15++;
                        }
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(c51Var, -2, -2);
                        runnableArr[0] = new mp0(o1Var, 28);
                        o1Var.e = true;
                        o1Var.c = 220;
                        o1Var.setOutsideTouchable(true);
                        o1Var.setClippingEnabled(true);
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        o1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        b51Var.getLocationInWindow(iArr);
                        c51Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = c51Var.getMeasuredHeight();
                        int i16 = iArr[1];
                        int dp = ((float) i16) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i16 - measuredHeight) : (b51Var.getMeasuredHeight() + i16) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.k3) f51Var2).containerView;
                        o1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        addView(imageView, gb1.h(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.mk mkVar = new org.telegram.ui.mk(this, context, 2);
        this.b = mkVar;
        u6Var4 = ((org.telegram.ui.ActionBar.k3) f51Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.V(mkVar, i11, u6Var4);
        mkVar.setTextSize(1, 20.0f);
        mkVar.setTypeface(AndroidUtilities.bold());
        mkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        mkVar.setPivotX(0.0f);
        mkVar.setPivotY(0.0f);
        addView(mkVar, gb1.h(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.xa1 xa1Var = new org.telegram.ui.xa1(this, context, 14);
        this.c = xa1Var;
        if (LocaleController.isRTL) {
            xa1Var.setGravity(5);
        }
        xa1Var.setPivotX(0.0f);
        xa1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !TranslateController.UNKNOWN_LANGUAGE.equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            int i14 = org.telegram.ui.ActionBar.y6.Pi;
            u6Var8 = ((org.telegram.ui.ActionBar.k3) f51Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.V(textView, i14, u6Var8);
            textView.setTextSize(1, 14.0f);
            textView.setText(f51.J(f51.N(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i15 = org.telegram.ui.ActionBar.y6.Pi;
        u6Var5 = ((org.telegram.ui.ActionBar.k3) f51Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.t(imageView2, i15, u6Var5, mode);
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        b51 b51Var = new b51(this, context);
        this.e = b51Var;
        if (LocaleController.isRTL) {
            b51Var.setGravity(5);
        }
        b51Var.b(0.25f, 350L, ds.h);
        u6Var6 = ((org.telegram.ui.ActionBar.k3) f51Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.Z(b51Var, i15, u6Var6);
        b51Var.setTextSize(AndroidUtilities.dp(14.0f));
        b51Var.setText(f51.J(f51.N(f51Var.v, null, null)));
        b51Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i16 = 1;
        b51Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.z41
            public final /* synthetic */ d51 b;

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
                        d51 d51Var = this.b;
                        b51 b51Var2 = d51Var.e;
                        c51 c51Var = new c51(d51Var.getContext(), null);
                        Drawable mutate = d51Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i142 = org.telegram.ui.ActionBar.y6.G8;
                        f51 f51Var2 = d51Var.n;
                        u6Var9 = ((org.telegram.ui.ActionBar.k3) f51Var2).resourcesProvider;
                        org.telegram.ui.ActionBar.f7.y(d51Var, mutate, i142, u6Var9, PorterDuff.Mode.MULTIPLY);
                        c51Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        int i152 = 0;
                        while (i152 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i152);
                            if (!localeInfo.pluralLangCode.equals(f51Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(f51Var2.v, localeInfo.pluralLangCode);
                                Context context2 = d51Var.getContext();
                                boolean z11 = i152 == locales.size() - 1;
                                u6Var10 = ((org.telegram.ui.ActionBar.k3) f51Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, u6Var10, z10, z11);
                                g1Var.setText(f51.J(f51.N(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(f51Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new a51(d51Var, runnableArr, localeInfo, 0));
                                c51Var.addView(g1Var);
                                z10 = false;
                            }
                            i152++;
                        }
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(c51Var, -2, -2);
                        runnableArr[0] = new mp0(o1Var, 28);
                        o1Var.e = true;
                        o1Var.c = 220;
                        o1Var.setOutsideTouchable(true);
                        o1Var.setClippingEnabled(true);
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        o1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        b51Var2.getLocationInWindow(iArr);
                        c51Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = c51Var.getMeasuredHeight();
                        int i162 = iArr[1];
                        int dp = ((float) i162) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i162 - measuredHeight) : (b51Var2.getMeasuredHeight() + i162) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.k3) f51Var2).containerView;
                        o1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            xa1Var.addView(b51Var, gb1.x(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                xa1Var.addView(imageView2, gb1.x(-2, -2, 16, 0, 1, 0, 0));
                xa1Var.addView(this.d, gb1.x(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                xa1Var.addView(textView2, gb1.x(-2, -2, 16, 0, 0, 4, 0));
                xa1Var.addView(imageView2, gb1.x(-2, -2, 16, 0, 1, 0, 0));
            }
            xa1Var.addView(b51Var, gb1.x(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(xa1Var, gb1.h(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        int i17 = org.telegram.ui.ActionBar.y6.V5;
        u6Var7 = ((org.telegram.ui.ActionBar.k3) f51Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.i(i17, view2, u6Var7);
        view2.setAlpha(0.0f);
        addView(view2, gb1.h(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        float a2 = a8.ee.a((f7 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!f51.F(this.n)) {
            a2 = 1.0f;
        }
        float interpolation = ds.g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.mk mkVar = this.b;
        mkVar.setScaleX(lerp);
        mkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        mkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.xa1 xa1Var = this.c;
        if (!z10) {
            mkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            xa1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        xa1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
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

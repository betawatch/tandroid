package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.ui.ic1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class v41 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.xk b;
    public final ic1 c;
    public final TextView d;
    public final t41 e;
    public final View f;
    public final View h;
    public final /* synthetic */ x41 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(x41 x41Var, Context context) {
        super(context);
        this.n = x41Var;
        View view = new View(context);
        this.f = view;
        int themedColor = x41Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5);
        String str = x41Var.s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.a6.a(44.0f, 0.0f, 12.0f, 0.0f, 0.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        int themedColor2 = x41Var.getThemedColor(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(x41Var.getThemedColor(org.telegram.ui.ActionBar.g6.i6), 1, -1));
        imageView.setAlpha(0.0f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s41
            public final /* synthetic */ v41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.c6 c6Var;
                switch (i11) {
                    case 0:
                        this.b.n.dismiss();
                        break;
                    default:
                        v41 v41Var = this.b;
                        t41 t41Var = v41Var.e;
                        u41 u41Var = new u41(v41Var.getContext(), null);
                        Drawable mutate = v41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        x41 x41Var2 = v41Var.n;
                        mutate.setColorFilter(new PorterDuffColorFilter(x41Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                        u41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        int i12 = 0;
                        while (i12 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i12);
                            if (!localeInfo.pluralLangCode.equals(x41Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(x41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = v41Var.getContext();
                                boolean z11 = i12 == locales.size() - 1;
                                c6Var = ((org.telegram.ui.ActionBar.e3) x41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, c6Var, z10, z11);
                                e1Var.setText(x41.A(x41.F(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(x41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new bi.x(v41Var, runnableArr, localeInfo, 27));
                                u41Var.addView(e1Var);
                                z10 = false;
                            }
                            i12++;
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(u41Var, -2, -2);
                        runnableArr[0] = new lr0(m1Var, 23);
                        m1Var.e = true;
                        m1Var.c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        t41Var.getLocationInWindow(iArr);
                        u41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = u41Var.getMeasuredHeight();
                        int i13 = iArr[1];
                        int dp = ((float) i13) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i13 - measuredHeight) : (t41Var.getMeasuredHeight() + i13) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.e3) x41Var2).containerView;
                        m1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        addView(imageView, w7.a6.a(54.0f, 1.0f, 1.0f, 1.0f, 1.0f, 54, 48));
        org.telegram.ui.xk xkVar = new org.telegram.ui.xk(this, context, 2);
        this.b = xkVar;
        xkVar.setTextColor(x41Var.getThemedColor(i10));
        xkVar.setTextSize(1, 20.0f);
        xkVar.setTypeface(AndroidUtilities.bold());
        xkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        xkVar.setPivotX(0.0f);
        xkVar.setPivotY(0.0f);
        addView(xkVar, w7.a6.a(-2.0f, 22.0f, 20.0f, 22.0f, 0.0f, -1, 55));
        ic1 ic1Var = new ic1(this, context, 11);
        this.c = ic1Var;
        if (LocaleController.isRTL) {
            ic1Var.setGravity(5);
        }
        ic1Var.setPivotX(0.0f);
        ic1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !TranslateController.UNKNOWN_LANGUAGE.equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(x41Var.getThemedColor(org.telegram.ui.ActionBar.g6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(x41.A(x41.F(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i12 = org.telegram.ui.ActionBar.g6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(x41Var.getThemedColor(i12), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        t41 t41Var = new t41(this, context);
        this.e = t41Var;
        if (LocaleController.isRTL) {
            t41Var.setGravity(5);
        }
        t41Var.b(0.25f, 350L, es.h);
        t41Var.setTextColor(x41Var.getThemedColor(i12));
        t41Var.setTextSize(AndroidUtilities.dp(14.0f));
        t41Var.setText(x41.A(x41.F(x41Var.v, null, null)));
        t41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i13 = 1;
        t41Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s41
            public final /* synthetic */ v41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.c6 c6Var;
                switch (i13) {
                    case 0:
                        this.b.n.dismiss();
                        break;
                    default:
                        v41 v41Var = this.b;
                        t41 t41Var2 = v41Var.e;
                        u41 u41Var = new u41(v41Var.getContext(), null);
                        Drawable mutate = v41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        x41 x41Var2 = v41Var.n;
                        mutate.setColorFilter(new PorterDuffColorFilter(x41Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                        u41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        int i122 = 0;
                        while (i122 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i122);
                            if (!localeInfo.pluralLangCode.equals(x41Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(x41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = v41Var.getContext();
                                boolean z11 = i122 == locales.size() - 1;
                                c6Var = ((org.telegram.ui.ActionBar.e3) x41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, c6Var, z10, z11);
                                e1Var.setText(x41.A(x41.F(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(x41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new bi.x(v41Var, runnableArr, localeInfo, 27));
                                u41Var.addView(e1Var);
                                z10 = false;
                            }
                            i122++;
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(u41Var, -2, -2);
                        runnableArr[0] = new lr0(m1Var, 23);
                        m1Var.e = true;
                        m1Var.c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        t41Var2.getLocationInWindow(iArr);
                        u41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = u41Var.getMeasuredHeight();
                        int i132 = iArr[1];
                        int dp = ((float) i132) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i132 - measuredHeight) : (t41Var2.getMeasuredHeight() + i132) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.e3) x41Var2).containerView;
                        m1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            ic1Var.addView(t41Var, w7.a6.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                ic1Var.addView(imageView2, w7.a6.t(-2, -2, 16, 0, 1, 0, 0));
                ic1Var.addView(this.d, w7.a6.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                ic1Var.addView(textView2, w7.a6.t(-2, -2, 16, 0, 0, 4, 0));
                ic1Var.addView(imageView2, w7.a6.t(-2, -2, 16, 0, 1, 0, 0));
            }
            ic1Var.addView(t41Var, w7.a6.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(ic1Var, w7.a6.a(-2.0f, 22.0f, 43.0f, 22.0f, 0.0f, -1, 55));
        View view2 = new View(context);
        this.h = view2;
        view2.setBackgroundColor(x41Var.getThemedColor(org.telegram.ui.ActionBar.g6.V5));
        view2.setAlpha(0.0f);
        addView(view2, w7.a6.a(AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 0.0f, 56.0f, 0.0f, 0.0f, -1, 55));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        float a2 = w7.s.a((f7 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!x41.w(this.n)) {
            a2 = 1.0f;
        }
        float interpolation = es.g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.xk xkVar = this.b;
        xkVar.setScaleX(lerp);
        xkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        xkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        ic1 ic1Var = this.c;
        if (!z10) {
            xkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            ic1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        ic1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
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

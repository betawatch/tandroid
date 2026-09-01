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
import org.telegram.ui.ib1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u31 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.pk b;
    public final ib1 c;
    public final TextView d;
    public final s31 e;
    public final View f;
    public final /* synthetic */ w31 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u31(w31 w31Var, Context context) {
        super(context);
        this.h = w31Var;
        View view = new View(context);
        int themedColor = w31Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5);
        String str = w31Var.s;
        view.setBackgroundColor(themedColor);
        addView(view, k7.c6.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        int themedColor2 = w31Var.getThemedColor(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(w31Var.getThemedColor(org.telegram.ui.ActionBar.k6.i6), 1, -1));
        imageView.setAlpha(0.0f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q31
            public final /* synthetic */ u31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.g6 g6Var;
                switch (i11) {
                    case 0:
                        this.b.h.dismiss();
                        break;
                    default:
                        u31 u31Var = this.b;
                        s31 s31Var = u31Var.e;
                        t31 t31Var = new t31(u31Var.getContext(), null);
                        Drawable mutate = u31Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        w31 w31Var2 = u31Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(w31Var2.getThemedColor(org.telegram.ui.ActionBar.k6.G8), PorterDuff.Mode.MULTIPLY));
                        t31Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i12 = 0;
                        boolean z4 = true;
                        while (i12 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i12);
                            if (!localeInfo.pluralLangCode.equals(w31Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(w31Var2.v, localeInfo.pluralLangCode);
                                Context context2 = u31Var.getContext();
                                boolean z10 = i12 == locales.size() - 1;
                                g6Var = ((org.telegram.ui.ActionBar.h3) w31Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, g6Var, z4, z10);
                                g1Var.setText(w31.y(w31.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(w31Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new r31(u31Var, runnableArr, localeInfo, 0));
                                t31Var.addView(g1Var);
                                z4 = false;
                            }
                            i12++;
                        }
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(t31Var, -2, -2);
                        runnableArr[0] = new oq0(p1Var, 22);
                        p1Var.e = true;
                        p1Var.c = 220;
                        p1Var.setOutsideTouchable(true);
                        p1Var.setClippingEnabled(true);
                        p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        p1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        s31Var.getLocationInWindow(iArr);
                        t31Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = t31Var.getMeasuredHeight();
                        int i13 = iArr[1];
                        int dp = ((float) i13) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i13 - measuredHeight) : (s31Var.getMeasuredHeight() + i13) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.h3) w31Var2).containerView;
                        p1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        addView(imageView, k7.c6.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, context, 2);
        this.b = pkVar;
        pkVar.setTextColor(w31Var.getThemedColor(i10));
        pkVar.setTextSize(1, 20.0f);
        pkVar.setTypeface(AndroidUtilities.bold());
        pkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        pkVar.setPivotX(0.0f);
        pkVar.setPivotY(0.0f);
        addView(pkVar, k7.c6.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        ib1 ib1Var = new ib1(this, context, 12);
        this.c = ib1Var;
        if (LocaleController.isRTL) {
            ib1Var.setGravity(5);
        }
        ib1Var.setPivotX(0.0f);
        ib1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !TranslateController.UNKNOWN_LANGUAGE.equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(w31Var.getThemedColor(org.telegram.ui.ActionBar.k6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(w31.y(w31.D(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i12 = org.telegram.ui.ActionBar.k6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(w31Var.getThemedColor(i12), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        s31 s31Var = new s31(this, context);
        this.e = s31Var;
        if (LocaleController.isRTL) {
            s31Var.setGravity(5);
        }
        s31Var.b(0.25f, 350L, pr.h);
        s31Var.setTextColor(w31Var.getThemedColor(i12));
        s31Var.setTextSize(AndroidUtilities.dp(14.0f));
        s31Var.setText(w31.y(w31.D(w31Var.v, null, null)));
        s31Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i13 = 1;
        s31Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q31
            public final /* synthetic */ u31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.g6 g6Var;
                switch (i13) {
                    case 0:
                        this.b.h.dismiss();
                        break;
                    default:
                        u31 u31Var = this.b;
                        s31 s31Var2 = u31Var.e;
                        t31 t31Var = new t31(u31Var.getContext(), null);
                        Drawable mutate = u31Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        w31 w31Var2 = u31Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(w31Var2.getThemedColor(org.telegram.ui.ActionBar.k6.G8), PorterDuff.Mode.MULTIPLY));
                        t31Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i122 = 0;
                        boolean z4 = true;
                        while (i122 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i122);
                            if (!localeInfo.pluralLangCode.equals(w31Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(w31Var2.v, localeInfo.pluralLangCode);
                                Context context2 = u31Var.getContext();
                                boolean z10 = i122 == locales.size() - 1;
                                g6Var = ((org.telegram.ui.ActionBar.h3) w31Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, g6Var, z4, z10);
                                g1Var.setText(w31.y(w31.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(w31Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new r31(u31Var, runnableArr, localeInfo, 0));
                                t31Var.addView(g1Var);
                                z4 = false;
                            }
                            i122++;
                        }
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(t31Var, -2, -2);
                        runnableArr[0] = new oq0(p1Var, 22);
                        p1Var.e = true;
                        p1Var.c = 220;
                        p1Var.setOutsideTouchable(true);
                        p1Var.setClippingEnabled(true);
                        p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        p1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        s31Var2.getLocationInWindow(iArr);
                        t31Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = t31Var.getMeasuredHeight();
                        int i132 = iArr[1];
                        int dp = ((float) i132) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i132 - measuredHeight) : (s31Var2.getMeasuredHeight() + i132) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.h3) w31Var2).containerView;
                        p1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            ib1Var.addView(s31Var, k7.c6.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                ib1Var.addView(imageView2, k7.c6.t(-2, -2, 16, 0, 1, 0, 0));
                ib1Var.addView(this.d, k7.c6.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                ib1Var.addView(textView2, k7.c6.t(-2, -2, 16, 0, 0, 4, 0));
                ib1Var.addView(imageView2, k7.c6.t(-2, -2, 16, 0, 1, 0, 0));
            }
            ib1Var.addView(s31Var, k7.c6.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(ib1Var, k7.c6.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f = view2;
        view2.setBackgroundColor(w31Var.getThemedColor(org.telegram.ui.ActionBar.k6.V5));
        view2.setAlpha(0.0f);
        addView(view2, k7.c6.d(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float a2 = k7.o.a((f10 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!w31.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = pr.g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.pk pkVar = this.b;
        pkVar.setScaleX(lerp);
        pkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        pkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z4 = LocaleController.isRTL;
        ib1 ib1Var = this.c;
        if (!z4) {
            pkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            ib1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        ib1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.a;
        imageView.setTranslationX(lerp2);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.f;
        view.setTranslationY(lerp3);
        view.setAlpha(f11);
    }
}

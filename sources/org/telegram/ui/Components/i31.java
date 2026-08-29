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
import org.telegram.ui.ua1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i31 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.jk b;
    public final ua1 c;
    public final TextView d;
    public final g31 e;
    public final View f;
    public final /* synthetic */ k31 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i31(k31 k31Var, Context context) {
        super(context);
        this.h = k31Var;
        View view = new View(context);
        int themedColor = k31Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5);
        String str = k31Var.s;
        view.setBackgroundColor(themedColor);
        addView(view, i7.f6.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        int themedColor2 = k31Var.getThemedColor(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(k31Var.getThemedColor(org.telegram.ui.ActionBar.g6.i6), 1, -1));
        imageView.setAlpha(0.0f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f31
            public final /* synthetic */ i31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.c6 c6Var;
                switch (i11) {
                    case 0:
                        this.b.h.dismiss();
                        break;
                    default:
                        i31 i31Var = this.b;
                        g31 g31Var = i31Var.e;
                        h31 h31Var = new h31(i31Var.getContext(), null);
                        Drawable mutate = i31Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        k31 k31Var2 = i31Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(k31Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                        h31Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i12 = 0;
                        boolean z10 = true;
                        while (i12 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i12);
                            if (!localeInfo.pluralLangCode.equals(k31Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(k31Var2.v, localeInfo.pluralLangCode);
                                Context context2 = i31Var.getContext();
                                boolean z11 = i12 == locales.size() - 1;
                                c6Var = ((org.telegram.ui.ActionBar.f3) k31Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, c6Var, z10, z11);
                                g1Var.setText(k31.y(k31.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(k31Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new ya0(i31Var, runnableArr, localeInfo, 3));
                                h31Var.addView(g1Var);
                                z10 = false;
                            }
                            i12++;
                        }
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(h31Var, -2, -2);
                        runnableArr[0] = new fq0(o1Var, 22);
                        o1Var.e = true;
                        o1Var.c = 220;
                        o1Var.setOutsideTouchable(true);
                        o1Var.setClippingEnabled(true);
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        o1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        g31Var.getLocationInWindow(iArr);
                        h31Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = h31Var.getMeasuredHeight();
                        int i13 = iArr[1];
                        int dp = ((float) i13) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i13 - measuredHeight) : (g31Var.getMeasuredHeight() + i13) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.f3) k31Var2).containerView;
                        o1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        addView(imageView, i7.f6.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.jk jkVar = new org.telegram.ui.jk(this, context, 2);
        this.b = jkVar;
        jkVar.setTextColor(k31Var.getThemedColor(i10));
        jkVar.setTextSize(1, 20.0f);
        jkVar.setTypeface(AndroidUtilities.bold());
        jkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        jkVar.setPivotX(0.0f);
        jkVar.setPivotY(0.0f);
        addView(jkVar, i7.f6.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        ua1 ua1Var = new ua1(this, context, 13);
        this.c = ua1Var;
        if (LocaleController.isRTL) {
            ua1Var.setGravity(5);
        }
        ua1Var.setPivotX(0.0f);
        ua1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !TranslateController.UNKNOWN_LANGUAGE.equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(k31Var.getThemedColor(org.telegram.ui.ActionBar.g6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(k31.y(k31.D(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i12 = org.telegram.ui.ActionBar.g6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(k31Var.getThemedColor(i12), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        g31 g31Var = new g31(this, context);
        this.e = g31Var;
        if (LocaleController.isRTL) {
            g31Var.setGravity(5);
        }
        g31Var.b(0.25f, 350L, jr.h);
        g31Var.setTextColor(k31Var.getThemedColor(i12));
        g31Var.setTextSize(AndroidUtilities.dp(14.0f));
        g31Var.setText(k31.y(k31.D(k31Var.v, null, null)));
        g31Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i13 = 1;
        g31Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f31
            public final /* synthetic */ i31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.c6 c6Var;
                switch (i13) {
                    case 0:
                        this.b.h.dismiss();
                        break;
                    default:
                        i31 i31Var = this.b;
                        g31 g31Var2 = i31Var.e;
                        h31 h31Var = new h31(i31Var.getContext(), null);
                        Drawable mutate = i31Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        k31 k31Var2 = i31Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(k31Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                        h31Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i122 = 0;
                        boolean z10 = true;
                        while (i122 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i122);
                            if (!localeInfo.pluralLangCode.equals(k31Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(k31Var2.v, localeInfo.pluralLangCode);
                                Context context2 = i31Var.getContext();
                                boolean z11 = i122 == locales.size() - 1;
                                c6Var = ((org.telegram.ui.ActionBar.f3) k31Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, c6Var, z10, z11);
                                g1Var.setText(k31.y(k31.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(k31Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new ya0(i31Var, runnableArr, localeInfo, 3));
                                h31Var.addView(g1Var);
                                z10 = false;
                            }
                            i122++;
                        }
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(h31Var, -2, -2);
                        runnableArr[0] = new fq0(o1Var, 22);
                        o1Var.e = true;
                        o1Var.c = 220;
                        o1Var.setOutsideTouchable(true);
                        o1Var.setClippingEnabled(true);
                        o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        o1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        g31Var2.getLocationInWindow(iArr);
                        h31Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = h31Var.getMeasuredHeight();
                        int i132 = iArr[1];
                        int dp = ((float) i132) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i132 - measuredHeight) : (g31Var2.getMeasuredHeight() + i132) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.f3) k31Var2).containerView;
                        o1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            ua1Var.addView(g31Var, i7.f6.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                ua1Var.addView(imageView2, i7.f6.t(-2, -2, 16, 0, 1, 0, 0));
                ua1Var.addView(this.d, i7.f6.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                ua1Var.addView(textView2, i7.f6.t(-2, -2, 16, 0, 0, 4, 0));
                ua1Var.addView(imageView2, i7.f6.t(-2, -2, 16, 0, 1, 0, 0));
            }
            ua1Var.addView(g31Var, i7.f6.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(ua1Var, i7.f6.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f = view2;
        view2.setBackgroundColor(k31Var.getThemedColor(org.telegram.ui.ActionBar.g6.V5));
        view2.setAlpha(0.0f);
        addView(view2, i7.f6.d(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        float a2 = i7.w.a((f9 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!k31.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = jr.g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.jk jkVar = this.b;
        jkVar.setScaleX(lerp);
        jkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        jkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        ua1 ua1Var = this.c;
        if (!z10) {
            jkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            ua1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        ua1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
        float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(-25.0f), interpolation);
        ImageView imageView = this.a;
        imageView.setTranslationX(lerp2);
        float f10 = 1.0f - interpolation;
        imageView.setAlpha(f10);
        float lerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(22.0f), interpolation);
        View view = this.f;
        view.setTranslationY(lerp3);
        view.setAlpha(f10);
    }
}

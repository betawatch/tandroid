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
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class z41 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.tk b;
    public final dc1 c;
    public final TextView d;
    public final x41 e;
    public final View f;
    public final View h;
    public final /* synthetic */ b51 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z41(b51 b51Var, Context context) {
        super(context);
        this.n = b51Var;
        View view = new View(context);
        this.f = view;
        int themedColor = b51Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5);
        String str = b51Var.s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.x5.a(44.0f, 0.0f, 12.0f, 0.0f, 0.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.i6.j5;
        int themedColor2 = b51Var.getThemedColor(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(b51Var.getThemedColor(org.telegram.ui.ActionBar.i6.i6), 1, -1));
        imageView.setAlpha(0.0f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w41
            public final /* synthetic */ z41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.e6 e6Var;
                switch (i11) {
                    case 0:
                        this.b.n.dismiss();
                        break;
                    default:
                        z41 z41Var = this.b;
                        x41 x41Var = z41Var.e;
                        y41 y41Var = new y41(z41Var.getContext(), null);
                        Drawable mutate = z41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        b51 b51Var2 = z41Var.n;
                        mutate.setColorFilter(new PorterDuffColorFilter(b51Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
                        y41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        int i12 = 0;
                        while (i12 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i12);
                            if (!localeInfo.pluralLangCode.equals(b51Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(b51Var2.v, localeInfo.pluralLangCode);
                                Context context2 = z41Var.getContext();
                                boolean z11 = i12 == locales.size() - 1;
                                e6Var = ((org.telegram.ui.ActionBar.f3) b51Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, e6Var, z10, z11);
                                f1Var.setText(b51.B(b51.F(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(b51Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(z41Var, runnableArr, localeInfo, 27));
                                y41Var.addView(f1Var);
                                z10 = false;
                            }
                            i12++;
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(y41Var, -2, -2);
                        runnableArr[0] = new or0(n1Var, 22);
                        n1Var.e = true;
                        n1Var.c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        x41Var.getLocationInWindow(iArr);
                        y41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = y41Var.getMeasuredHeight();
                        int i13 = iArr[1];
                        int dp = ((float) i13) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i13 - measuredHeight) : (x41Var.getMeasuredHeight() + i13) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.f3) b51Var2).containerView;
                        n1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        addView(imageView, w7.x5.a(54.0f, 1.0f, 1.0f, 1.0f, 1.0f, 54, 48));
        org.telegram.ui.tk tkVar = new org.telegram.ui.tk(this, context, 2);
        this.b = tkVar;
        tkVar.setTextColor(b51Var.getThemedColor(i10));
        tkVar.setTextSize(1, 20.0f);
        tkVar.setTypeface(AndroidUtilities.bold());
        tkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        tkVar.setPivotX(0.0f);
        tkVar.setPivotY(0.0f);
        addView(tkVar, w7.x5.a(-2.0f, 22.0f, 20.0f, 22.0f, 0.0f, -1, 55));
        dc1 dc1Var = new dc1(this, context, 11);
        this.c = dc1Var;
        if (LocaleController.isRTL) {
            dc1Var.setGravity(5);
        }
        dc1Var.setPivotX(0.0f);
        dc1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !TranslateController.UNKNOWN_LANGUAGE.equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(b51Var.getThemedColor(org.telegram.ui.ActionBar.i6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(b51.B(b51.F(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i12 = org.telegram.ui.ActionBar.i6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(b51Var.getThemedColor(i12), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        x41 x41Var = new x41(this, context);
        this.e = x41Var;
        if (LocaleController.isRTL) {
            x41Var.setGravity(5);
        }
        x41Var.b(0.25f, 350L, hs.h);
        x41Var.setTextColor(b51Var.getThemedColor(i12));
        x41Var.setTextSize(AndroidUtilities.dp(14.0f));
        x41Var.setText(b51.B(b51.F(b51Var.v, null, null)));
        x41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i13 = 1;
        x41Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w41
            public final /* synthetic */ z41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.e6 e6Var;
                switch (i13) {
                    case 0:
                        this.b.n.dismiss();
                        break;
                    default:
                        z41 z41Var = this.b;
                        x41 x41Var2 = z41Var.e;
                        y41 y41Var = new y41(z41Var.getContext(), null);
                        Drawable mutate = z41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        b51 b51Var2 = z41Var.n;
                        mutate.setColorFilter(new PorterDuffColorFilter(b51Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G8), PorterDuff.Mode.MULTIPLY));
                        y41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        int i122 = 0;
                        while (i122 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i122);
                            if (!localeInfo.pluralLangCode.equals(b51Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(b51Var2.v, localeInfo.pluralLangCode);
                                Context context2 = z41Var.getContext();
                                boolean z11 = i122 == locales.size() - 1;
                                e6Var = ((org.telegram.ui.ActionBar.f3) b51Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, e6Var, z10, z11);
                                f1Var.setText(b51.B(b51.F(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(b51Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(z41Var, runnableArr, localeInfo, 27));
                                y41Var.addView(f1Var);
                                z10 = false;
                            }
                            i122++;
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(y41Var, -2, -2);
                        runnableArr[0] = new or0(n1Var, 22);
                        n1Var.e = true;
                        n1Var.c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        x41Var2.getLocationInWindow(iArr);
                        y41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = y41Var.getMeasuredHeight();
                        int i132 = iArr[1];
                        int dp = ((float) i132) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i132 - measuredHeight) : (x41Var2.getMeasuredHeight() + i132) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.f3) b51Var2).containerView;
                        n1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            dc1Var.addView(x41Var, w7.x5.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                dc1Var.addView(imageView2, w7.x5.t(-2, -2, 16, 0, 1, 0, 0));
                dc1Var.addView(this.d, w7.x5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                dc1Var.addView(textView2, w7.x5.t(-2, -2, 16, 0, 0, 4, 0));
                dc1Var.addView(imageView2, w7.x5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            dc1Var.addView(x41Var, w7.x5.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(dc1Var, w7.x5.a(-2.0f, 22.0f, 43.0f, 22.0f, 0.0f, -1, 55));
        View view2 = new View(context);
        this.h = view2;
        view2.setBackgroundColor(b51Var.getThemedColor(org.telegram.ui.ActionBar.i6.V5));
        view2.setAlpha(0.0f);
        addView(view2, w7.x5.a(AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 0.0f, 56.0f, 0.0f, 0.0f, -1, 55));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        float a2 = w7.o.a((f7 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!b51.w(this.n)) {
            a2 = 1.0f;
        }
        float interpolation = hs.g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.tk tkVar = this.b;
        tkVar.setScaleX(lerp);
        tkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        tkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        dc1 dc1Var = this.c;
        if (!z10) {
            tkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            dc1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        dc1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
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

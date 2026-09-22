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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class j41 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.sk b;
    public final dc1 c;
    public final TextView d;
    public final h41 e;
    public final View f;
    public final /* synthetic */ l41 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j41(l41 l41Var, Context context) {
        super(context);
        this.h = l41Var;
        View view = new View(context);
        int themedColor = l41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5);
        String str = l41Var.s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.y5.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        int themedColor2 = l41Var.getThemedColor(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(l41Var.getThemedColor(org.telegram.ui.ActionBar.j6.i6), 1, -1));
        imageView.setAlpha(0.0f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g41
            public final /* synthetic */ j41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.f6 f6Var;
                switch (i11) {
                    case 0:
                        this.b.h.dismiss();
                        break;
                    default:
                        j41 j41Var = this.b;
                        h41 h41Var = j41Var.e;
                        i41 i41Var = new i41(j41Var.getContext(), null);
                        Drawable mutate = j41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        l41 l41Var2 = j41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(l41Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                        i41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i12 = 0;
                        boolean z10 = true;
                        while (i12 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i12);
                            if (!localeInfo.pluralLangCode.equals(l41Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(l41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = j41Var.getContext();
                                boolean z11 = i12 == locales.size() - 1;
                                f6Var = ((org.telegram.ui.ActionBar.f3) l41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, f6Var, z10, z11);
                                f1Var.setText(l41.y(l41.D(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(l41Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(j41Var, runnableArr, localeInfo, 27));
                                i41Var.addView(f1Var);
                                z10 = false;
                            }
                            i12++;
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(i41Var, -2, -2);
                        runnableArr[0] = new yq0(n1Var, 23);
                        n1Var.e = true;
                        n1Var.c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        h41Var.getLocationInWindow(iArr);
                        i41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = i41Var.getMeasuredHeight();
                        int i13 = iArr[1];
                        int dp = ((float) i13) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i13 - measuredHeight) : (h41Var.getMeasuredHeight() + i13) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.f3) l41Var2).containerView;
                        n1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        addView(imageView, w7.y5.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.sk skVar = new org.telegram.ui.sk(this, context, 2);
        this.b = skVar;
        skVar.setTextColor(l41Var.getThemedColor(i10));
        skVar.setTextSize(1, 20.0f);
        skVar.setTypeface(AndroidUtilities.bold());
        skVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        skVar.setPivotX(0.0f);
        skVar.setPivotY(0.0f);
        addView(skVar, w7.y5.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
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
            textView.setTextColor(l41Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(l41.y(l41.D(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i12 = org.telegram.ui.ActionBar.j6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(l41Var.getThemedColor(i12), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        h41 h41Var = new h41(this, context);
        this.e = h41Var;
        if (LocaleController.isRTL) {
            h41Var.setGravity(5);
        }
        h41Var.b(0.25f, 350L, qr.h);
        h41Var.setTextColor(l41Var.getThemedColor(i12));
        h41Var.setTextSize(AndroidUtilities.dp(14.0f));
        h41Var.setText(l41.y(l41.D(l41Var.v, null, null)));
        h41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i13 = 1;
        h41Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g41
            public final /* synthetic */ j41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.f6 f6Var;
                switch (i13) {
                    case 0:
                        this.b.h.dismiss();
                        break;
                    default:
                        j41 j41Var = this.b;
                        h41 h41Var2 = j41Var.e;
                        i41 i41Var = new i41(j41Var.getContext(), null);
                        Drawable mutate = j41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        l41 l41Var2 = j41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(l41Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                        i41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i122 = 0;
                        boolean z10 = true;
                        while (i122 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i122);
                            if (!localeInfo.pluralLangCode.equals(l41Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(l41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = j41Var.getContext();
                                boolean z11 = i122 == locales.size() - 1;
                                f6Var = ((org.telegram.ui.ActionBar.f3) l41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, f6Var, z10, z11);
                                f1Var.setText(l41.y(l41.D(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(l41Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(j41Var, runnableArr, localeInfo, 27));
                                i41Var.addView(f1Var);
                                z10 = false;
                            }
                            i122++;
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(i41Var, -2, -2);
                        runnableArr[0] = new yq0(n1Var, 23);
                        n1Var.e = true;
                        n1Var.c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        h41Var2.getLocationInWindow(iArr);
                        i41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = i41Var.getMeasuredHeight();
                        int i132 = iArr[1];
                        int dp = ((float) i132) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i132 - measuredHeight) : (h41Var2.getMeasuredHeight() + i132) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.f3) l41Var2).containerView;
                        n1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            dc1Var.addView(h41Var, w7.y5.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                dc1Var.addView(imageView2, w7.y5.t(-2, -2, 16, 0, 1, 0, 0));
                dc1Var.addView(this.d, w7.y5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                dc1Var.addView(textView2, w7.y5.t(-2, -2, 16, 0, 0, 4, 0));
                dc1Var.addView(imageView2, w7.y5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            dc1Var.addView(h41Var, w7.y5.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(dc1Var, w7.y5.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f = view2;
        view2.setBackgroundColor(l41Var.getThemedColor(org.telegram.ui.ActionBar.j6.V5));
        view2.setAlpha(0.0f);
        addView(view2, w7.y5.d(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        float a2 = w7.q.a((f7 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!l41.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = qr.g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.sk skVar = this.b;
        skVar.setScaleX(lerp);
        skVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        skVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        dc1 dc1Var = this.c;
        if (!z10) {
            skVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            dc1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        dc1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
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

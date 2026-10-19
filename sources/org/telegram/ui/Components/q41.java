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
import org.telegram.ui.qa1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class q41 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.kk b;
    public final qa1 c;
    public final TextView d;
    public final o41 e;
    public final View f;
    public final View h;
    public final /* synthetic */ s41 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q41(s41 s41Var, Context context) {
        super(context);
        this.n = s41Var;
        View view = new View(context);
        this.f = view;
        int themedColor = s41Var.getThemedColor(org.telegram.ui.ActionBar.h6.h5);
        String str = s41Var.s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.z5.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.h6.j5;
        int themedColor2 = s41Var.getThemedColor(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(s41Var.getThemedColor(org.telegram.ui.ActionBar.h6.i6), 1, -1));
        imageView.setAlpha(0.0f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m41
            public final /* synthetic */ q41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.d6 d6Var;
                switch (i11) {
                    case 0:
                        this.b.n.dismiss();
                        break;
                    default:
                        q41 q41Var = this.b;
                        o41 o41Var = q41Var.e;
                        p41 p41Var = new p41(q41Var.getContext(), null);
                        Drawable mutate = q41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        s41 s41Var2 = q41Var.n;
                        mutate.setColorFilter(new PorterDuffColorFilter(s41Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
                        p41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        int i12 = 0;
                        while (i12 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i12);
                            if (!localeInfo.pluralLangCode.equals(s41Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(s41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = q41Var.getContext();
                                boolean z11 = i12 == locales.size() - 1;
                                d6Var = ((org.telegram.ui.ActionBar.f3) s41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, d6Var, z10, z11);
                                e1Var.setText(s41.A(s41.E(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(s41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new n41(q41Var, runnableArr, localeInfo, 0));
                                p41Var.addView(e1Var);
                                z10 = false;
                            }
                            i12++;
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(p41Var, -2, -2);
                        runnableArr[0] = new gr0(m1Var, 22);
                        m1Var.e = true;
                        m1Var.c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        o41Var.getLocationInWindow(iArr);
                        p41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = p41Var.getMeasuredHeight();
                        int i13 = iArr[1];
                        int dp = ((float) i13) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i13 - measuredHeight) : (o41Var.getMeasuredHeight() + i13) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.f3) s41Var2).containerView;
                        m1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        addView(imageView, w7.z5.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.kk kkVar = new org.telegram.ui.kk(this, context, 2);
        this.b = kkVar;
        kkVar.setTextColor(s41Var.getThemedColor(i10));
        kkVar.setTextSize(1, 20.0f);
        kkVar.setTypeface(AndroidUtilities.bold());
        kkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        kkVar.setPivotX(0.0f);
        kkVar.setPivotY(0.0f);
        addView(kkVar, w7.z5.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        qa1 qa1Var = new qa1(this, context, 13);
        this.c = qa1Var;
        if (LocaleController.isRTL) {
            qa1Var.setGravity(5);
        }
        qa1Var.setPivotX(0.0f);
        qa1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !TranslateController.UNKNOWN_LANGUAGE.equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(s41Var.getThemedColor(org.telegram.ui.ActionBar.h6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(s41.A(s41.E(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i12 = org.telegram.ui.ActionBar.h6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(s41Var.getThemedColor(i12), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        o41 o41Var = new o41(this, context);
        this.e = o41Var;
        if (LocaleController.isRTL) {
            o41Var.setGravity(5);
        }
        o41Var.b(0.25f, 350L, bs.h);
        o41Var.setTextColor(s41Var.getThemedColor(i12));
        o41Var.setTextSize(AndroidUtilities.dp(14.0f));
        o41Var.setText(s41.A(s41.E(s41Var.v, null, null)));
        o41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i13 = 1;
        o41Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m41
            public final /* synthetic */ q41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.d6 d6Var;
                switch (i13) {
                    case 0:
                        this.b.n.dismiss();
                        break;
                    default:
                        q41 q41Var = this.b;
                        o41 o41Var2 = q41Var.e;
                        p41 p41Var = new p41(q41Var.getContext(), null);
                        Drawable mutate = q41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        s41 s41Var2 = q41Var.n;
                        mutate.setColorFilter(new PorterDuffColorFilter(s41Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G8), PorterDuff.Mode.MULTIPLY));
                        p41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        int i122 = 0;
                        while (i122 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i122);
                            if (!localeInfo.pluralLangCode.equals(s41Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(s41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = q41Var.getContext();
                                boolean z11 = i122 == locales.size() - 1;
                                d6Var = ((org.telegram.ui.ActionBar.f3) s41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, d6Var, z10, z11);
                                e1Var.setText(s41.A(s41.E(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(s41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new n41(q41Var, runnableArr, localeInfo, 0));
                                p41Var.addView(e1Var);
                                z10 = false;
                            }
                            i122++;
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(p41Var, -2, -2);
                        runnableArr[0] = new gr0(m1Var, 22);
                        m1Var.e = true;
                        m1Var.c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        o41Var2.getLocationInWindow(iArr);
                        p41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = p41Var.getMeasuredHeight();
                        int i132 = iArr[1];
                        int dp = ((float) i132) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i132 - measuredHeight) : (o41Var2.getMeasuredHeight() + i132) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.f3) s41Var2).containerView;
                        m1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            qa1Var.addView(o41Var, w7.z5.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                qa1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
                qa1Var.addView(this.d, w7.z5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                qa1Var.addView(textView2, w7.z5.t(-2, -2, 16, 0, 0, 4, 0));
                qa1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            qa1Var.addView(o41Var, w7.z5.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(qa1Var, w7.z5.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        view2.setBackgroundColor(s41Var.getThemedColor(org.telegram.ui.ActionBar.h6.V5));
        view2.setAlpha(0.0f);
        addView(view2, w7.z5.d(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        float a2 = w7.r.a((f7 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!s41.w(this.n)) {
            a2 = 1.0f;
        }
        float interpolation = bs.g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.kk kkVar = this.b;
        kkVar.setScaleX(lerp);
        kkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        kkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        qa1 qa1Var = this.c;
        if (!z10) {
            kkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            qa1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        qa1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
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

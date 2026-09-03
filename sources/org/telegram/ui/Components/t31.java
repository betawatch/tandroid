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
import org.telegram.ui.ob1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t31 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.pk b;
    public final ob1 c;
    public final TextView d;
    public final r31 e;
    public final View f;
    public final /* synthetic */ v31 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t31(v31 v31Var, Context context) {
        super(context);
        this.h = v31Var;
        View view = new View(context);
        int themedColor = v31Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5);
        String str = v31Var.s;
        view.setBackgroundColor(themedColor);
        addView(view, k7.c6.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        int themedColor2 = v31Var.getThemedColor(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(v31Var.getThemedColor(org.telegram.ui.ActionBar.k6.i6), 1, -1));
        imageView.setAlpha(0.0f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p31
            public final /* synthetic */ t31 b;

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
                        t31 t31Var = this.b;
                        r31 r31Var = t31Var.e;
                        s31 s31Var = new s31(t31Var.getContext(), null);
                        Drawable mutate = t31Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        v31 v31Var2 = t31Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(v31Var2.getThemedColor(org.telegram.ui.ActionBar.k6.G8), PorterDuff.Mode.MULTIPLY));
                        s31Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i12 = 0;
                        boolean z4 = true;
                        while (i12 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i12);
                            if (!localeInfo.pluralLangCode.equals(v31Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(v31Var2.v, localeInfo.pluralLangCode);
                                Context context2 = t31Var.getContext();
                                boolean z10 = i12 == locales.size() - 1;
                                g6Var = ((org.telegram.ui.ActionBar.h3) v31Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, g6Var, z4, z10);
                                g1Var.setText(v31.y(v31.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(v31Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new q31(t31Var, runnableArr, localeInfo, 0));
                                s31Var.addView(g1Var);
                                z4 = false;
                            }
                            i12++;
                        }
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(s31Var, -2, -2);
                        runnableArr[0] = new nq0(p1Var, 22);
                        p1Var.e = true;
                        p1Var.c = 220;
                        p1Var.setOutsideTouchable(true);
                        p1Var.setClippingEnabled(true);
                        p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        p1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        r31Var.getLocationInWindow(iArr);
                        s31Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = s31Var.getMeasuredHeight();
                        int i13 = iArr[1];
                        int dp = ((float) i13) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i13 - measuredHeight) : (r31Var.getMeasuredHeight() + i13) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.h3) v31Var2).containerView;
                        p1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        addView(imageView, k7.c6.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, context, 2);
        this.b = pkVar;
        pkVar.setTextColor(v31Var.getThemedColor(i10));
        pkVar.setTextSize(1, 20.0f);
        pkVar.setTypeface(AndroidUtilities.bold());
        pkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        pkVar.setPivotX(0.0f);
        pkVar.setPivotY(0.0f);
        addView(pkVar, k7.c6.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        ob1 ob1Var = new ob1(this, context, 12);
        this.c = ob1Var;
        if (LocaleController.isRTL) {
            ob1Var.setGravity(5);
        }
        ob1Var.setPivotX(0.0f);
        ob1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !TranslateController.UNKNOWN_LANGUAGE.equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(v31Var.getThemedColor(org.telegram.ui.ActionBar.k6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(v31.y(v31.D(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i12 = org.telegram.ui.ActionBar.k6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(v31Var.getThemedColor(i12), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        r31 r31Var = new r31(this, context);
        this.e = r31Var;
        if (LocaleController.isRTL) {
            r31Var.setGravity(5);
        }
        r31Var.b(0.25f, 350L, pr.h);
        r31Var.setTextColor(v31Var.getThemedColor(i12));
        r31Var.setTextSize(AndroidUtilities.dp(14.0f));
        r31Var.setText(v31.y(v31.D(v31Var.v, null, null)));
        r31Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i13 = 1;
        r31Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p31
            public final /* synthetic */ t31 b;

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
                        t31 t31Var = this.b;
                        r31 r31Var2 = t31Var.e;
                        s31 s31Var = new s31(t31Var.getContext(), null);
                        Drawable mutate = t31Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        v31 v31Var2 = t31Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(v31Var2.getThemedColor(org.telegram.ui.ActionBar.k6.G8), PorterDuff.Mode.MULTIPLY));
                        s31Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i122 = 0;
                        boolean z4 = true;
                        while (i122 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i122);
                            if (!localeInfo.pluralLangCode.equals(v31Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(v31Var2.v, localeInfo.pluralLangCode);
                                Context context2 = t31Var.getContext();
                                boolean z10 = i122 == locales.size() - 1;
                                g6Var = ((org.telegram.ui.ActionBar.h3) v31Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, g6Var, z4, z10);
                                g1Var.setText(v31.y(v31.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(v31Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new q31(t31Var, runnableArr, localeInfo, 0));
                                s31Var.addView(g1Var);
                                z4 = false;
                            }
                            i122++;
                        }
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(s31Var, -2, -2);
                        runnableArr[0] = new nq0(p1Var, 22);
                        p1Var.e = true;
                        p1Var.c = 220;
                        p1Var.setOutsideTouchable(true);
                        p1Var.setClippingEnabled(true);
                        p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        p1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        r31Var2.getLocationInWindow(iArr);
                        s31Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = s31Var.getMeasuredHeight();
                        int i132 = iArr[1];
                        int dp = ((float) i132) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i132 - measuredHeight) : (r31Var2.getMeasuredHeight() + i132) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.h3) v31Var2).containerView;
                        p1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            ob1Var.addView(r31Var, k7.c6.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                ob1Var.addView(imageView2, k7.c6.t(-2, -2, 16, 0, 1, 0, 0));
                ob1Var.addView(this.d, k7.c6.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                ob1Var.addView(textView2, k7.c6.t(-2, -2, 16, 0, 0, 4, 0));
                ob1Var.addView(imageView2, k7.c6.t(-2, -2, 16, 0, 1, 0, 0));
            }
            ob1Var.addView(r31Var, k7.c6.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(ob1Var, k7.c6.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f = view2;
        view2.setBackgroundColor(v31Var.getThemedColor(org.telegram.ui.ActionBar.k6.V5));
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
        if (!v31.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = pr.g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.pk pkVar = this.b;
        pkVar.setScaleX(lerp);
        pkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        pkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z4 = LocaleController.isRTL;
        ob1 ob1Var = this.c;
        if (!z4) {
            pkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            ob1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        ob1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
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

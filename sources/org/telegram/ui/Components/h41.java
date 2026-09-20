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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class h41 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.rk b;
    public final dc1 c;
    public final TextView d;
    public final f41 e;
    public final View f;
    public final /* synthetic */ j41 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h41(j41 j41Var, Context context) {
        super(context);
        this.h = j41Var;
        View view = new View(context);
        int themedColor = j41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5);
        String str = j41Var.s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.y5.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        int themedColor2 = j41Var.getThemedColor(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(j41Var.getThemedColor(org.telegram.ui.ActionBar.j6.i6), 1, -1));
        imageView.setAlpha(0.0f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e41
            public final /* synthetic */ h41 b;

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
                        h41 h41Var = this.b;
                        f41 f41Var = h41Var.e;
                        g41 g41Var = new g41(h41Var.getContext(), null);
                        Drawable mutate = h41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        j41 j41Var2 = h41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(j41Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                        g41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i12 = 0;
                        boolean z10 = true;
                        while (i12 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i12);
                            if (!localeInfo.pluralLangCode.equals(j41Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(j41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = h41Var.getContext();
                                boolean z11 = i12 == locales.size() - 1;
                                f6Var = ((org.telegram.ui.ActionBar.f3) j41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, f6Var, z10, z11);
                                f1Var.setText(j41.y(j41.E(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(j41Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(h41Var, runnableArr, localeInfo, 27));
                                g41Var.addView(f1Var);
                                z10 = false;
                            }
                            i12++;
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(g41Var, -2, -2);
                        runnableArr[0] = new wq0(n1Var, 22);
                        n1Var.e = true;
                        n1Var.c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        f41Var.getLocationInWindow(iArr);
                        g41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = g41Var.getMeasuredHeight();
                        int i13 = iArr[1];
                        int dp = ((float) i13) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i13 - measuredHeight) : (f41Var.getMeasuredHeight() + i13) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.f3) j41Var2).containerView;
                        n1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        addView(imageView, w7.y5.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.rk rkVar = new org.telegram.ui.rk(this, context, 2);
        this.b = rkVar;
        rkVar.setTextColor(j41Var.getThemedColor(i10));
        rkVar.setTextSize(1, 20.0f);
        rkVar.setTypeface(AndroidUtilities.bold());
        rkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        rkVar.setPivotX(0.0f);
        rkVar.setPivotY(0.0f);
        addView(rkVar, w7.y5.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
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
            textView.setTextColor(j41Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(j41.y(j41.E(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i12 = org.telegram.ui.ActionBar.j6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(j41Var.getThemedColor(i12), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        f41 f41Var = new f41(this, context);
        this.e = f41Var;
        if (LocaleController.isRTL) {
            f41Var.setGravity(5);
        }
        f41Var.b(0.25f, 350L, qr.h);
        f41Var.setTextColor(j41Var.getThemedColor(i12));
        f41Var.setTextSize(AndroidUtilities.dp(14.0f));
        f41Var.setText(j41.y(j41.E(j41Var.v, null, null)));
        f41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i13 = 1;
        f41Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e41
            public final /* synthetic */ h41 b;

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
                        h41 h41Var = this.b;
                        f41 f41Var2 = h41Var.e;
                        g41 g41Var = new g41(h41Var.getContext(), null);
                        Drawable mutate = h41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        j41 j41Var2 = h41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(j41Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                        g41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i122 = 0;
                        boolean z10 = true;
                        while (i122 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i122);
                            if (!localeInfo.pluralLangCode.equals(j41Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(j41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = h41Var.getContext();
                                boolean z11 = i122 == locales.size() - 1;
                                f6Var = ((org.telegram.ui.ActionBar.f3) j41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, context2, f6Var, z10, z11);
                                f1Var.setText(j41.y(j41.E(localeInfo.pluralLangCode, null, null)));
                                f1Var.setChecked(TextUtils.equals(j41Var2.v, localeInfo.pluralLangCode));
                                f1Var.setOnClickListener(new ai.d0(h41Var, runnableArr, localeInfo, 27));
                                g41Var.addView(f1Var);
                                z10 = false;
                            }
                            i122++;
                        }
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(g41Var, -2, -2);
                        runnableArr[0] = new wq0(n1Var, 22);
                        n1Var.e = true;
                        n1Var.c = 220;
                        n1Var.setOutsideTouchable(true);
                        n1Var.setClippingEnabled(true);
                        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        n1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        f41Var2.getLocationInWindow(iArr);
                        g41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = g41Var.getMeasuredHeight();
                        int i132 = iArr[1];
                        int dp = ((float) i132) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i132 - measuredHeight) : (f41Var2.getMeasuredHeight() + i132) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.f3) j41Var2).containerView;
                        n1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            dc1Var.addView(f41Var, w7.y5.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
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
            dc1Var.addView(f41Var, w7.y5.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(dc1Var, w7.y5.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f = view2;
        view2.setBackgroundColor(j41Var.getThemedColor(org.telegram.ui.ActionBar.j6.V5));
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
        if (!j41.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = qr.g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.rk rkVar = this.b;
        rkVar.setScaleX(lerp);
        rkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        rkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        dc1 dc1Var = this.c;
        if (!z10) {
            rkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
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

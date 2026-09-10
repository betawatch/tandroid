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
import org.telegram.ui.gc1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g41 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.uk b;
    public final gc1 c;
    public final TextView d;
    public final e41 e;
    public final View f;
    public final /* synthetic */ i41 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g41(i41 i41Var, Context context) {
        super(context);
        this.h = i41Var;
        View view = new View(context);
        int themedColor = i41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5);
        String str = i41Var.s;
        view.setBackgroundColor(themedColor);
        addView(view, w7.a6.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        int themedColor2 = i41Var.getThemedColor(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(i41Var.getThemedColor(org.telegram.ui.ActionBar.j6.i6), 1, -1));
        imageView.setAlpha(0.0f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.d41
            public final /* synthetic */ g41 b;

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
                        g41 g41Var = this.b;
                        e41 e41Var = g41Var.e;
                        f41 f41Var = new f41(g41Var.getContext(), null);
                        Drawable mutate = g41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        i41 i41Var2 = g41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(i41Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                        f41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i12 = 0;
                        boolean z10 = true;
                        while (i12 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i12);
                            if (!localeInfo.pluralLangCode.equals(i41Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(i41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = g41Var.getContext();
                                boolean z11 = i12 == locales.size() - 1;
                                f6Var = ((org.telegram.ui.ActionBar.h3) i41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, f6Var, z10, z11);
                                g1Var.setText(i41.y(i41.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(i41Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new bi.q(g41Var, runnableArr, localeInfo, 23));
                                f41Var.addView(g1Var);
                                z10 = false;
                            }
                            i12++;
                        }
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(f41Var, -2, -2);
                        runnableArr[0] = new uq0(p1Var, 22);
                        p1Var.e = true;
                        p1Var.c = 220;
                        p1Var.setOutsideTouchable(true);
                        p1Var.setClippingEnabled(true);
                        p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        p1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        e41Var.getLocationInWindow(iArr);
                        f41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = f41Var.getMeasuredHeight();
                        int i13 = iArr[1];
                        int dp = ((float) i13) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i13 - measuredHeight) : (e41Var.getMeasuredHeight() + i13) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.h3) i41Var2).containerView;
                        p1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        addView(imageView, w7.a6.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.uk ukVar = new org.telegram.ui.uk(this, context, 2);
        this.b = ukVar;
        ukVar.setTextColor(i41Var.getThemedColor(i10));
        ukVar.setTextSize(1, 20.0f);
        ukVar.setTypeface(AndroidUtilities.bold());
        ukVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        ukVar.setPivotX(0.0f);
        ukVar.setPivotY(0.0f);
        addView(ukVar, w7.a6.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        gc1 gc1Var = new gc1(this, context, 11);
        this.c = gc1Var;
        if (LocaleController.isRTL) {
            gc1Var.setGravity(5);
        }
        gc1Var.setPivotX(0.0f);
        gc1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !TranslateController.UNKNOWN_LANGUAGE.equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            textView.setTextColor(i41Var.getThemedColor(org.telegram.ui.ActionBar.j6.Pi));
            textView.setTextSize(1, 14.0f);
            textView.setText(i41.y(i41.D(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i12 = org.telegram.ui.ActionBar.j6.Pi;
        imageView2.setColorFilter(new PorterDuffColorFilter(i41Var.getThemedColor(i12), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        e41 e41Var = new e41(this, context);
        this.e = e41Var;
        if (LocaleController.isRTL) {
            e41Var.setGravity(5);
        }
        e41Var.b(0.25f, 350L, wr.h);
        e41Var.setTextColor(i41Var.getThemedColor(i12));
        e41Var.setTextSize(AndroidUtilities.dp(14.0f));
        e41Var.setText(i41.y(i41.D(i41Var.v, null, null)));
        e41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i13 = 1;
        e41Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.d41
            public final /* synthetic */ g41 b;

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
                        g41 g41Var = this.b;
                        e41 e41Var2 = g41Var.e;
                        f41 f41Var = new f41(g41Var.getContext(), null);
                        Drawable mutate = g41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        i41 i41Var2 = g41Var.h;
                        mutate.setColorFilter(new PorterDuffColorFilter(i41Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G8), PorterDuff.Mode.MULTIPLY));
                        f41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        int i122 = 0;
                        boolean z10 = true;
                        while (i122 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i122);
                            if (!localeInfo.pluralLangCode.equals(i41Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(i41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = g41Var.getContext();
                                boolean z11 = i122 == locales.size() - 1;
                                f6Var = ((org.telegram.ui.ActionBar.h3) i41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, context2, f6Var, z10, z11);
                                g1Var.setText(i41.y(i41.D(localeInfo.pluralLangCode, null, null)));
                                g1Var.setChecked(TextUtils.equals(i41Var2.v, localeInfo.pluralLangCode));
                                g1Var.setOnClickListener(new bi.q(g41Var, runnableArr, localeInfo, 23));
                                f41Var.addView(g1Var);
                                z10 = false;
                            }
                            i122++;
                        }
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(f41Var, -2, -2);
                        runnableArr[0] = new uq0(p1Var, 22);
                        p1Var.e = true;
                        p1Var.c = 220;
                        p1Var.setOutsideTouchable(true);
                        p1Var.setClippingEnabled(true);
                        p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        p1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        e41Var2.getLocationInWindow(iArr);
                        f41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = f41Var.getMeasuredHeight();
                        int i132 = iArr[1];
                        int dp = ((float) i132) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i132 - measuredHeight) : (e41Var2.getMeasuredHeight() + i132) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.h3) i41Var2).containerView;
                        p1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            gc1Var.addView(e41Var, w7.a6.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                gc1Var.addView(imageView2, w7.a6.t(-2, -2, 16, 0, 1, 0, 0));
                gc1Var.addView(this.d, w7.a6.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                gc1Var.addView(textView2, w7.a6.t(-2, -2, 16, 0, 0, 4, 0));
                gc1Var.addView(imageView2, w7.a6.t(-2, -2, 16, 0, 1, 0, 0));
            }
            gc1Var.addView(e41Var, w7.a6.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(gc1Var, w7.a6.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.f = view2;
        view2.setBackgroundColor(i41Var.getThemedColor(org.telegram.ui.ActionBar.j6.V5));
        view2.setAlpha(0.0f);
        addView(view2, w7.a6.d(-1, AndroidUtilities.getShadowHeight() / AndroidUtilities.dpf2(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        float a2 = w7.q.a((f7 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(64.0f), 0.0f, 1.0f);
        if (!i41.u(this.h)) {
            a2 = 1.0f;
        }
        float interpolation = wr.g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.uk ukVar = this.b;
        ukVar.setScaleX(lerp);
        ukVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        ukVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        gc1 gc1Var = this.c;
        if (!z10) {
            ukVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            gc1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        gc1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
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

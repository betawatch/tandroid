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
import org.telegram.ui.va1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class w41 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.lk b;
    public final va1 c;
    public final TextView d;
    public final u41 e;
    public final View f;
    public final View h;
    public final /* synthetic */ y41 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(y41 y41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.ActionBar.g6 g6Var5;
        org.telegram.ui.ActionBar.g6 g6Var6;
        org.telegram.ui.ActionBar.g6 g6Var7;
        org.telegram.ui.ActionBar.g6 g6Var8;
        this.n = y41Var;
        View view = new View(context);
        this.f = view;
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        g6Var = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        String str = y41Var.s;
        org.telegram.ui.ActionBar.r6.i(i10, view, g6Var);
        addView(view, w7.z5.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var2, mode);
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(y41Var.getThemedColor(i12), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        g6Var3 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, g6Var3);
        imageView.setAlpha(0.0f);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s41
            public final /* synthetic */ w41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.ui.ActionBar.g6 g6Var9;
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.g6 g6Var10;
                switch (i13) {
                    case 0:
                        this.b.n.dismiss();
                        break;
                    default:
                        w41 w41Var = this.b;
                        u41 u41Var = w41Var.e;
                        v41 v41Var = new v41(w41Var.getContext(), null);
                        Drawable mutate = w41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i14 = org.telegram.ui.ActionBar.k6.G8;
                        y41 y41Var2 = w41Var.n;
                        g6Var9 = ((org.telegram.ui.ActionBar.h3) y41Var2).resourcesProvider;
                        org.telegram.ui.ActionBar.r6.z(w41Var, mutate, i14, g6Var9, PorterDuff.Mode.MULTIPLY);
                        v41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        int i15 = 0;
                        while (i15 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i15);
                            if (!localeInfo.pluralLangCode.equals(y41Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(y41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = w41Var.getContext();
                                boolean z11 = i15 == locales.size() - 1;
                                g6Var10 = ((org.telegram.ui.ActionBar.h3) y41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, g6Var10, z10, z11);
                                e1Var.setText(y41.J(y41.N(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(y41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new t41(w41Var, runnableArr, localeInfo, 0));
                                v41Var.addView(e1Var);
                                z10 = false;
                            }
                            i15++;
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(v41Var, -2, -2);
                        runnableArr[0] = new kr0(m1Var, 23);
                        m1Var.e = true;
                        m1Var.c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        u41Var.getLocationInWindow(iArr);
                        v41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = v41Var.getMeasuredHeight();
                        int i16 = iArr[1];
                        int dp = ((float) i16) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i16 - measuredHeight) : (u41Var.getMeasuredHeight() + i16) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.h3) y41Var2).containerView;
                        m1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        addView(imageView, w7.z5.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.lk lkVar = new org.telegram.ui.lk(this, context, 2);
        this.b = lkVar;
        g6Var4 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.W(lkVar, i11, g6Var4);
        lkVar.setTextSize(1, 20.0f);
        lkVar.setTypeface(AndroidUtilities.bold());
        lkVar.setText(LocaleController.getString(R.string.AutomaticTranslation));
        lkVar.setPivotX(0.0f);
        lkVar.setPivotY(0.0f);
        addView(lkVar, w7.z5.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        va1 va1Var = new va1(this, context, 13);
        this.c = va1Var;
        if (LocaleController.isRTL) {
            va1Var.setGravity(5);
        }
        va1Var.setPivotX(0.0f);
        va1Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !TranslateController.UNKNOWN_LANGUAGE.equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            int i14 = org.telegram.ui.ActionBar.k6.Pi;
            g6Var8 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView, i14, g6Var8);
            textView.setTextSize(1, 14.0f);
            textView.setText(y41.J(y41.N(str, null, null)));
            textView.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f));
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.search_arrow);
        int i15 = org.telegram.ui.ActionBar.k6.Pi;
        g6Var5 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.t(imageView2, i15, g6Var5, mode);
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        u41 u41Var = new u41(this, context);
        this.e = u41Var;
        if (LocaleController.isRTL) {
            u41Var.setGravity(5);
        }
        u41Var.b(0.25f, 350L, bs.h);
        g6Var6 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.a0(u41Var, i15, g6Var6);
        u41Var.setTextSize(AndroidUtilities.dp(14.0f));
        u41Var.setText(y41.J(y41.N(y41Var.v, null, null)));
        u41Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        final int i16 = 1;
        u41Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s41
            public final /* synthetic */ w41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.ui.ActionBar.g6 g6Var9;
                ViewGroup viewGroup;
                org.telegram.ui.ActionBar.g6 g6Var10;
                switch (i16) {
                    case 0:
                        this.b.n.dismiss();
                        break;
                    default:
                        w41 w41Var = this.b;
                        u41 u41Var2 = w41Var.e;
                        v41 v41Var = new v41(w41Var.getContext(), null);
                        Drawable mutate = w41Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i142 = org.telegram.ui.ActionBar.k6.G8;
                        y41 y41Var2 = w41Var.n;
                        g6Var9 = ((org.telegram.ui.ActionBar.h3) y41Var2).resourcesProvider;
                        org.telegram.ui.ActionBar.r6.z(w41Var, mutate, i142, g6Var9, PorterDuff.Mode.MULTIPLY);
                        v41Var.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        ArrayList<LocaleController.LocaleInfo> locales = TranslateController.getLocales();
                        boolean z10 = true;
                        int i152 = 0;
                        while (i152 < locales.size()) {
                            LocaleController.LocaleInfo localeInfo = locales.get(i152);
                            if (!localeInfo.pluralLangCode.equals(y41Var2.s) && "remote".equals(localeInfo.pathToFile)) {
                                TextUtils.equals(y41Var2.v, localeInfo.pluralLangCode);
                                Context context2 = w41Var.getContext();
                                boolean z11 = i152 == locales.size() - 1;
                                g6Var10 = ((org.telegram.ui.ActionBar.h3) y41Var2).resourcesProvider;
                                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, context2, g6Var10, z10, z11);
                                e1Var.setText(y41.J(y41.N(localeInfo.pluralLangCode, null, null)));
                                e1Var.setChecked(TextUtils.equals(y41Var2.v, localeInfo.pluralLangCode));
                                e1Var.setOnClickListener(new t41(w41Var, runnableArr, localeInfo, 0));
                                v41Var.addView(e1Var);
                                z10 = false;
                            }
                            i152++;
                        }
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(v41Var, -2, -2);
                        runnableArr[0] = new kr0(m1Var, 23);
                        m1Var.e = true;
                        m1Var.c = 220;
                        m1Var.setOutsideTouchable(true);
                        m1Var.setClippingEnabled(true);
                        m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        u41Var2.getLocationInWindow(iArr);
                        v41Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                        int measuredHeight = v41Var.getMeasuredHeight();
                        int i162 = iArr[1];
                        int dp = ((float) i162) > (((float) AndroidUtilities.displaySize.y) * 0.9f) - ((float) measuredHeight) ? AndroidUtilities.dp(8.0f) + (i162 - measuredHeight) : (u41Var2.getMeasuredHeight() + i162) - AndroidUtilities.dp(8.0f);
                        viewGroup = ((org.telegram.ui.ActionBar.h3) y41Var2).containerView;
                        m1Var.showAtLocation(viewGroup, 51, iArr[0] - AndroidUtilities.dp(8.0f), dp);
                        break;
                }
            }
        });
        if (LocaleController.isRTL) {
            va1Var.addView(u41Var, w7.z5.t(-2, -2, 16, 0, 0, this.d != null ? 3 : 0, 0));
            if (this.d != null) {
                va1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
                va1Var.addView(this.d, w7.z5.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                va1Var.addView(textView2, w7.z5.t(-2, -2, 16, 0, 0, 4, 0));
                va1Var.addView(imageView2, w7.z5.t(-2, -2, 16, 0, 1, 0, 0));
            }
            va1Var.addView(u41Var, w7.z5.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(va1Var, w7.z5.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        int i17 = org.telegram.ui.ActionBar.k6.V5;
        g6Var7 = ((org.telegram.ui.ActionBar.h3) y41Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.i(i17, view2, g6Var7);
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
        if (!y41.E(this.n)) {
            a2 = 1.0f;
        }
        float interpolation = bs.g.getInterpolation(a2);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, interpolation);
        org.telegram.ui.lk lkVar = this.b;
        lkVar.setScaleX(lerp);
        lkVar.setScaleY(AndroidUtilities.lerp(0.85f, 1.0f, interpolation));
        lkVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-12.0f), 0.0f, interpolation));
        boolean z10 = LocaleController.isRTL;
        va1 va1Var = this.c;
        if (!z10) {
            lkVar.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
            va1Var.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dpf2(50.0f), 0.0f, interpolation));
        }
        va1Var.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dpf2(-22.0f), 0.0f, interpolation));
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

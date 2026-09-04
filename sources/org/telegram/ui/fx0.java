package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class fx0 extends tg.e {
    public final /* synthetic */ Context b0;
    public final /* synthetic */ jx0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx0(jx0 jx0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.c0 = jx0Var;
        this.b0 = context2;
    }

    @Override // tg.e
    public final void g() {
        jx0 jx0Var = this.c0;
        PremiumPreviewFragment premiumPreviewFragment = jx0Var.n;
        if (premiumPreviewFragment.r0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.b0;
            premiumPreviewFragment.r0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            tg.a aVar = jx0Var.d.b;
            yd ydVar = new yd(context, 5);
            int i10 = 1;
            ydVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i11 = org.telegram.ui.ActionBar.j6.n5;
            int i12 = 0;
            org.telegram.messenger.wl.r(textView, org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            ydVar.addView(textView, w7.x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.fo0 fo0Var = new org.telegram.ui.Components.fo0(context);
            fo0Var.setDelegate(new j20(aVar, 0));
            tg.f fVar = aVar.c;
            fo0Var.setProgress(fVar == null ? 0.0f : fVar.v / 2.0f);
            fo0Var.setReportChanges(true);
            ydVar.addView(fo0Var, w7.x5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.messenger.wl.r(textView2, org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, 16.0f, 1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            ydVar.addView(textView2, w7.x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.fo0 fo0Var2 = new org.telegram.ui.Components.fo0(context);
            fo0Var2.setDelegate(new j20(aVar, 1));
            tg.f fVar2 = aVar.c;
            fo0Var2.setProgress(fVar2 == null ? 0.0f : fVar2.w / 2.0f);
            fo0Var2.setReportChanges(true);
            ydVar.addView(fo0Var2, w7.x5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i13 = org.telegram.ui.ActionBar.j6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            int i14 = org.telegram.ui.ActionBar.j6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.w0(null, i14, false)));
            textView3.setOnClickListener(new k20(context, aVar, i12));
            ydVar.addView(textView3, w7.x5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.messenger.wl.r(textView4, org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, 16.0f, 1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            ydVar.addView(textView4, w7.x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.fo0 fo0Var3 = new org.telegram.ui.Components.fo0(context);
            fo0Var3.setDelegate(new j20(aVar, 2));
            tg.f fVar3 = aVar.c;
            fo0Var3.setProgress(fVar3 == null ? 0.0f : fVar3.x);
            fo0Var3.setReportChanges(true);
            ydVar.addView(fo0Var3, w7.x5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.messenger.wl.r(textView5, org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, 16.0f, 1);
            textView5.setMaxLines(1);
            textView5.setSingleLine(true);
            textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            ydVar.addView(textView5, w7.x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.fo0 fo0Var4 = new org.telegram.ui.Components.fo0(context);
            fo0Var4.setDelegate(new j20(aVar, 3));
            tg.f fVar4 = aVar.c;
            fo0Var4.setProgress(fVar4 == null ? 0.0f : fVar4.A / 2.0f);
            fo0Var4.setReportChanges(true);
            ydVar.addView(fo0Var4, w7.x5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            textView6.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.w0(null, i14, false)));
            textView6.setOnClickListener(new k20(context, aVar, i10));
            ydVar.addView(textView6, w7.x5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.messenger.wl.r(textView7, org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
            textView7.setSingleLine(true);
            textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            ydVar.addView(textView7, w7.x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.fo0 fo0Var5 = new org.telegram.ui.Components.fo0(context);
            fo0Var5.setDelegate(new na.d());
            fo0Var5.setProgress(yd.b / 2.0f);
            fo0Var5.setReportChanges(true);
            ydVar.addView(fo0Var5, w7.x5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(ydVar);
            premiumPreviewFragment.r0.addView(scrollView);
            premiumPreviewFragment.r0.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
            premiumPreviewFragment.d0.addView(premiumPreviewFragment.r0, w7.x5.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.r0.getLayoutParams()).topMargin = premiumPreviewFragment.c0;
            premiumPreviewFragment.r0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.r0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}

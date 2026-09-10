package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hx0 extends rg.f {
    public final /* synthetic */ Context b0;
    public final /* synthetic */ lx0 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx0(lx0 lx0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.c0 = lx0Var;
        this.b0 = context2;
    }

    @Override // rg.f
    public final void g() {
        lx0 lx0Var = this.c0;
        PremiumPreviewFragment premiumPreviewFragment = lx0Var.n;
        if (premiumPreviewFragment.r0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.b0;
            premiumPreviewFragment.r0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            rg.a aVar = lx0Var.d.b;
            zd zdVar = new zd(context, 5);
            int i10 = 1;
            zdVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i11 = org.telegram.ui.ActionBar.j6.n5;
            int i12 = 0;
            org.telegram.messenger.em.r(textView, org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            zdVar.addView(textView, w7.a6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.oo0 oo0Var = new org.telegram.ui.Components.oo0(context);
            oo0Var.setDelegate(new k20(aVar, 0));
            rg.g gVar = aVar.c;
            oo0Var.setProgress(gVar == null ? 0.0f : gVar.v / 2.0f);
            oo0Var.setReportChanges(true);
            zdVar.addView(oo0Var, w7.a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.messenger.em.r(textView2, org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, 16.0f, 1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            zdVar.addView(textView2, w7.a6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.oo0 oo0Var2 = new org.telegram.ui.Components.oo0(context);
            oo0Var2.setDelegate(new k20(aVar, 1));
            rg.g gVar2 = aVar.c;
            oo0Var2.setProgress(gVar2 == null ? 0.0f : gVar2.w / 2.0f);
            oo0Var2.setReportChanges(true);
            zdVar.addView(oo0Var2, w7.a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
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
            textView3.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.w0(null, i14, false)));
            textView3.setOnClickListener(new l20(context, aVar, i12));
            zdVar.addView(textView3, w7.a6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.messenger.em.r(textView4, org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, 16.0f, 1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            zdVar.addView(textView4, w7.a6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.oo0 oo0Var3 = new org.telegram.ui.Components.oo0(context);
            oo0Var3.setDelegate(new k20(aVar, 2));
            rg.g gVar3 = aVar.c;
            oo0Var3.setProgress(gVar3 == null ? 0.0f : gVar3.x);
            oo0Var3.setReportChanges(true);
            zdVar.addView(oo0Var3, w7.a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.messenger.em.r(textView5, org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, 16.0f, 1);
            textView5.setMaxLines(1);
            textView5.setSingleLine(true);
            textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            zdVar.addView(textView5, w7.a6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.oo0 oo0Var4 = new org.telegram.ui.Components.oo0(context);
            oo0Var4.setDelegate(new k20(aVar, 3));
            rg.g gVar4 = aVar.c;
            oo0Var4.setProgress(gVar4 == null ? 0.0f : gVar4.A / 2.0f);
            oo0Var4.setReportChanges(true);
            zdVar.addView(oo0Var4, w7.a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            textView6.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.w0(null, i14, false)));
            textView6.setOnClickListener(new l20(context, aVar, i10));
            zdVar.addView(textView6, w7.a6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.messenger.em.r(textView7, org.telegram.ui.ActionBar.j6.w0(null, i11, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
            textView7.setSingleLine(true);
            textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            zdVar.addView(textView7, w7.a6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.oo0 oo0Var5 = new org.telegram.ui.Components.oo0(context);
            oo0Var5.setDelegate(new t7.u());
            oo0Var5.setProgress(zd.b / 2.0f);
            oo0Var5.setReportChanges(true);
            zdVar.addView(oo0Var5, w7.a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(zdVar);
            premiumPreviewFragment.r0.addView(scrollView);
            premiumPreviewFragment.r0.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
            premiumPreviewFragment.d0.addView(premiumPreviewFragment.r0, w7.a6.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.r0.getLayoutParams()).topMargin = premiumPreviewFragment.c0;
            premiumPreviewFragment.r0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.r0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}

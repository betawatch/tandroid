package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bw0 extends ag.j {
    public final /* synthetic */ Context U;
    public final /* synthetic */ fw0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw0(fw0 fw0Var, Context context, int i9, int i10, Context context2) {
        super(context, i9, i10);
        this.V = fw0Var;
        this.U = context2;
    }

    @Override // ag.j
    public final void g() {
        fw0 fw0Var = this.V;
        PremiumPreviewFragment premiumPreviewFragment = fw0Var.n;
        if (premiumPreviewFragment.n0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.U;
            premiumPreviewFragment.n0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            ag.a aVar = fw0Var.d.b;
            gh.m mVar = new gh.m(context, 7);
            int i9 = 1;
            mVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i10 = org.telegram.ui.ActionBar.f6.n5;
            int i11 = 0;
            org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, i10, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            mVar.addView(textView, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.pn0 pn0Var = new org.telegram.ui.Components.pn0(context);
            pn0Var.setDelegate(new q10(aVar, 0));
            ag.k kVar = aVar.c;
            pn0Var.setProgress(kVar == null ? 0.0f : kVar.v / 2.0f);
            pn0Var.setReportChanges(true);
            mVar.addView(pn0Var, g7.e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.messenger.ll.s(textView2, org.telegram.ui.ActionBar.f6.w0(null, i10, false), 1, 16.0f, 1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            mVar.addView(textView2, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.pn0 pn0Var2 = new org.telegram.ui.Components.pn0(context);
            pn0Var2.setDelegate(new q10(aVar, 1));
            ag.k kVar2 = aVar.c;
            pn0Var2.setProgress(kVar2 == null ? 0.0f : kVar2.w / 2.0f);
            pn0Var2.setReportChanges(true);
            mVar.addView(pn0Var2, g7.e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i12 = org.telegram.ui.ActionBar.f6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            int i13 = org.telegram.ui.ActionBar.f6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.w0(null, i13, false)));
            textView3.setOnClickListener(new r10(context, aVar, i11));
            mVar.addView(textView3, g7.e6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.messenger.ll.s(textView4, org.telegram.ui.ActionBar.f6.w0(null, i10, false), 1, 16.0f, 1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            mVar.addView(textView4, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.pn0 pn0Var3 = new org.telegram.ui.Components.pn0(context);
            pn0Var3.setDelegate(new q10(aVar, 2));
            ag.k kVar3 = aVar.c;
            pn0Var3.setProgress(kVar3 == null ? 0.0f : kVar3.x);
            pn0Var3.setReportChanges(true);
            mVar.addView(pn0Var3, g7.e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.messenger.ll.s(textView5, org.telegram.ui.ActionBar.f6.w0(null, i10, false), 1, 16.0f, 1);
            textView5.setMaxLines(1);
            textView5.setSingleLine(true);
            textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            mVar.addView(textView5, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.pn0 pn0Var4 = new org.telegram.ui.Components.pn0(context);
            pn0Var4.setDelegate(new q10(aVar, 3));
            ag.k kVar4 = aVar.c;
            pn0Var4.setProgress(kVar4 == null ? 0.0f : kVar4.A / 2.0f);
            pn0Var4.setReportChanges(true);
            mVar.addView(pn0Var4, g7.e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            textView6.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.w0(null, i13, false)));
            textView6.setOnClickListener(new r10(context, aVar, i9));
            mVar.addView(textView6, g7.e6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.messenger.ll.s(textView7, org.telegram.ui.ActionBar.f6.w0(null, i10, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
            textView7.setSingleLine(true);
            textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            mVar.addView(textView7, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.pn0 pn0Var5 = new org.telegram.ui.Components.pn0(context);
            pn0Var5.setDelegate(new ya.b(18));
            pn0Var5.setProgress(gh.m.b / 2.0f);
            pn0Var5.setReportChanges(true);
            mVar.addView(pn0Var5, g7.e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(mVar);
            premiumPreviewFragment.n0.addView(scrollView);
            premiumPreviewFragment.n0.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
            premiumPreviewFragment.Z.addView(premiumPreviewFragment.n0, g7.e6.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.n0.getLayoutParams()).topMargin = premiumPreviewFragment.Y;
            premiumPreviewFragment.n0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.n0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}

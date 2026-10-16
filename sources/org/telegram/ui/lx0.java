package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class lx0 extends tg.n {
    public final /* synthetic */ Context f0;
    public final /* synthetic */ px0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx0(px0 px0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.g0 = px0Var;
        this.f0 = context2;
    }

    @Override // tg.n
    public final void h() {
        px0 px0Var = this.g0;
        PremiumPreviewFragment premiumPreviewFragment = px0Var.n;
        if (premiumPreviewFragment.r0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.f0;
            premiumPreviewFragment.r0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            tg.g gVar = px0Var.d.b;
            ee eeVar = new ee(context, 5);
            int i10 = 1;
            eeVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i11 = org.telegram.ui.ActionBar.g6.n5;
            int i12 = 0;
            org.telegram.messenger.sk.u(textView, org.telegram.ui.ActionBar.g6.x0(null, i11, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            eeVar.addView(textView, w7.z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
            org.telegram.ui.Components.gp0 gp0Var = new org.telegram.ui.Components.gp0(context);
            gp0Var.setDelegate(new n20(gVar, 0));
            tg.o oVar = gVar.c;
            gp0Var.setProgress(oVar == null ? 0.0f : oVar.B / 2.0f);
            gp0Var.setReportChanges(true);
            eeVar.addView(gp0Var, w7.z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.messenger.sk.u(textView2, org.telegram.ui.ActionBar.g6.x0(null, i11, false), 1, 16.0f, 1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            eeVar.addView(textView2, w7.z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
            org.telegram.ui.Components.gp0 gp0Var2 = new org.telegram.ui.Components.gp0(context);
            gp0Var2.setDelegate(new n20(gVar, 1));
            tg.o oVar2 = gVar.c;
            gp0Var2.setProgress(oVar2 == null ? 0.0f : oVar2.C / 2.0f);
            gp0Var2.setReportChanges(true);
            eeVar.addView(gp0Var2, w7.z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i13 = org.telegram.ui.ActionBar.g6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
            int i14 = org.telegram.ui.ActionBar.g6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.x0(null, i14, false)));
            textView3.setOnClickListener(new o20(context, gVar, i12));
            eeVar.addView(textView3, w7.z5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.messenger.sk.u(textView4, org.telegram.ui.ActionBar.g6.x0(null, i11, false), 1, 16.0f, 1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            eeVar.addView(textView4, w7.z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
            org.telegram.ui.Components.gp0 gp0Var3 = new org.telegram.ui.Components.gp0(context);
            gp0Var3.setDelegate(new n20(gVar, 2));
            tg.o oVar3 = gVar.c;
            gp0Var3.setProgress(oVar3 == null ? 0.0f : oVar3.D);
            gp0Var3.setReportChanges(true);
            eeVar.addView(gp0Var3, w7.z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.messenger.sk.u(textView5, org.telegram.ui.ActionBar.g6.x0(null, i11, false), 1, 16.0f, 1);
            textView5.setMaxLines(1);
            textView5.setSingleLine(true);
            textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            eeVar.addView(textView5, w7.z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
            org.telegram.ui.Components.gp0 gp0Var4 = new org.telegram.ui.Components.gp0(context);
            gp0Var4.setDelegate(new n20(gVar, 3));
            tg.o oVar4 = gVar.c;
            gp0Var4.setProgress(oVar4 != null ? oVar4.G / 2.0f : 0.0f);
            gp0Var4.setReportChanges(true);
            eeVar.addView(gp0Var4, w7.z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
            textView6.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.x0(null, i14, false)));
            textView6.setOnClickListener(new o20(context, gVar, i10));
            eeVar.addView(textView6, w7.z5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.messenger.sk.u(textView7, org.telegram.ui.ActionBar.g6.x0(null, i11, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
            textView7.setSingleLine(true);
            textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            eeVar.addView(textView7, w7.z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
            org.telegram.ui.Components.gp0 gp0Var5 = new org.telegram.ui.Components.gp0(context);
            gp0Var5.setDelegate(new pb.a(17));
            gp0Var5.setProgress(ee.b / 2.0f);
            gp0Var5.setReportChanges(true);
            eeVar.addView(gp0Var5, w7.z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            scrollView.addView(eeVar);
            premiumPreviewFragment.r0.addView(scrollView);
            premiumPreviewFragment.r0.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false));
            premiumPreviewFragment.d0.addView(premiumPreviewFragment.r0, w7.z5.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.r0.getLayoutParams()).topMargin = premiumPreviewFragment.c0;
            premiumPreviewFragment.r0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.r0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}

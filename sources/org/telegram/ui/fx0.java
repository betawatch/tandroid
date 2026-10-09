package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fx0 extends sg.n {
    public final /* synthetic */ Context f0;
    public final /* synthetic */ jx0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx0(jx0 jx0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.g0 = jx0Var;
        this.f0 = context2;
    }

    @Override // sg.n
    public final void h() {
        jx0 jx0Var = this.g0;
        PremiumPreviewFragment premiumPreviewFragment = jx0Var.n;
        if (premiumPreviewFragment.r0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.f0;
            premiumPreviewFragment.r0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            sg.g gVar = jx0Var.d.b;
            yd ydVar = new yd(context, 5);
            int i10 = 1;
            ydVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i11 = org.telegram.ui.ActionBar.i6.n5;
            int i12 = 0;
            org.telegram.messenger.bi.u(textView, org.telegram.ui.ActionBar.i6.x0(null, i11, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            ydVar.addView(textView, w7.x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
            org.telegram.ui.Components.kp0 kp0Var = new org.telegram.ui.Components.kp0(context);
            kp0Var.setDelegate(new h20(gVar, 0));
            sg.o oVar = gVar.c;
            kp0Var.setProgress(oVar == null ? 0.0f : oVar.B / 2.0f);
            kp0Var.setReportChanges(true);
            ydVar.addView(kp0Var, w7.x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.messenger.bi.u(textView2, org.telegram.ui.ActionBar.i6.x0(null, i11, false), 1, 16.0f, 1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            ydVar.addView(textView2, w7.x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
            org.telegram.ui.Components.kp0 kp0Var2 = new org.telegram.ui.Components.kp0(context);
            kp0Var2.setDelegate(new h20(gVar, 1));
            sg.o oVar2 = gVar.c;
            kp0Var2.setProgress(oVar2 == null ? 0.0f : oVar2.C / 2.0f);
            kp0Var2.setReportChanges(true);
            ydVar.addView(kp0Var2, w7.x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i13 = org.telegram.ui.ActionBar.i6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
            int i14 = org.telegram.ui.ActionBar.i6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.x0(null, i14, false)));
            textView3.setOnClickListener(new i20(context, gVar, i12));
            ydVar.addView(textView3, w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.messenger.bi.u(textView4, org.telegram.ui.ActionBar.i6.x0(null, i11, false), 1, 16.0f, 1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            ydVar.addView(textView4, w7.x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
            org.telegram.ui.Components.kp0 kp0Var3 = new org.telegram.ui.Components.kp0(context);
            kp0Var3.setDelegate(new h20(gVar, 2));
            sg.o oVar3 = gVar.c;
            kp0Var3.setProgress(oVar3 == null ? 0.0f : oVar3.D);
            kp0Var3.setReportChanges(true);
            ydVar.addView(kp0Var3, w7.x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.messenger.bi.u(textView5, org.telegram.ui.ActionBar.i6.x0(null, i11, false), 1, 16.0f, 1);
            textView5.setMaxLines(1);
            textView5.setSingleLine(true);
            textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            ydVar.addView(textView5, w7.x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
            org.telegram.ui.Components.kp0 kp0Var4 = new org.telegram.ui.Components.kp0(context);
            kp0Var4.setDelegate(new h20(gVar, 3));
            sg.o oVar4 = gVar.c;
            kp0Var4.setProgress(oVar4 != null ? oVar4.G / 2.0f : 0.0f);
            kp0Var4.setReportChanges(true);
            ydVar.addView(kp0Var4, w7.x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
            textView6.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.x0(null, i14, false)));
            textView6.setOnClickListener(new i20(context, gVar, i10));
            ydVar.addView(textView6, w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.messenger.bi.u(textView7, org.telegram.ui.ActionBar.i6.x0(null, i11, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
            textView7.setSingleLine(true);
            textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            ydVar.addView(textView7, w7.x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
            org.telegram.ui.Components.kp0 kp0Var5 = new org.telegram.ui.Components.kp0(context);
            kp0Var5.setDelegate(new t7.t());
            kp0Var5.setProgress(yd.b / 2.0f);
            kp0Var5.setReportChanges(true);
            ydVar.addView(kp0Var5, w7.x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            scrollView.addView(ydVar);
            premiumPreviewFragment.r0.addView(scrollView);
            premiumPreviewFragment.r0.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.h5, false));
            premiumPreviewFragment.d0.addView(premiumPreviewFragment.r0, w7.x5.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.r0.getLayoutParams()).topMargin = premiumPreviewFragment.c0;
            premiumPreviewFragment.r0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.r0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}

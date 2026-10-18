package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class lw0 extends tg.n {
    public final /* synthetic */ Context i0;
    public final /* synthetic */ pw0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw0(pw0 pw0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.j0 = pw0Var;
        this.i0 = context2;
    }

    @Override // tg.n
    public final void h() {
        pw0 pw0Var = this.j0;
        PremiumPreviewFragment premiumPreviewFragment = pw0Var.n;
        if (premiumPreviewFragment.r0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.i0;
            premiumPreviewFragment.r0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            tg.g gVar = pw0Var.d.b;
            ai.r rVar = new ai.r(context, 7);
            int i10 = 1;
            rVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i11 = org.telegram.ui.ActionBar.h6.n5;
            int i12 = 0;
            org.telegram.messenger.lk.u(textView, org.telegram.ui.ActionBar.h6.x0(null, i11, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.cp0 cp0Var = new org.telegram.ui.Components.cp0(context);
            cp0Var.setDelegate(new s10(gVar, 0));
            tg.o oVar = gVar.c;
            cp0Var.setProgress(oVar == null ? 0.0f : oVar.B / 2.0f);
            cp0Var.setReportChanges(true);
            rVar.addView(cp0Var, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.messenger.lk.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, i11, false), 1, 16.0f, 1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView2, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.cp0 cp0Var2 = new org.telegram.ui.Components.cp0(context);
            cp0Var2.setDelegate(new s10(gVar, 1));
            tg.o oVar2 = gVar.c;
            cp0Var2.setProgress(oVar2 == null ? 0.0f : oVar2.C / 2.0f);
            cp0Var2.setReportChanges(true);
            rVar.addView(cp0Var2, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i13 = org.telegram.ui.ActionBar.h6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            int i14 = org.telegram.ui.ActionBar.h6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.x0(null, i14, false)));
            textView3.setOnClickListener(new t10(context, gVar, i12));
            rVar.addView(textView3, w7.z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.messenger.lk.u(textView4, org.telegram.ui.ActionBar.h6.x0(null, i11, false), 1, 16.0f, 1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView4, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.cp0 cp0Var3 = new org.telegram.ui.Components.cp0(context);
            cp0Var3.setDelegate(new s10(gVar, 2));
            tg.o oVar3 = gVar.c;
            cp0Var3.setProgress(oVar3 == null ? 0.0f : oVar3.D);
            cp0Var3.setReportChanges(true);
            rVar.addView(cp0Var3, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.messenger.lk.u(textView5, org.telegram.ui.ActionBar.h6.x0(null, i11, false), 1, 16.0f, 1);
            textView5.setMaxLines(1);
            textView5.setSingleLine(true);
            textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView5, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.cp0 cp0Var4 = new org.telegram.ui.Components.cp0(context);
            cp0Var4.setDelegate(new s10(gVar, 3));
            tg.o oVar4 = gVar.c;
            cp0Var4.setProgress(oVar4 != null ? oVar4.G / 2.0f : 0.0f);
            cp0Var4.setReportChanges(true);
            rVar.addView(cp0Var4, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            textView6.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.x0(null, i14, false)));
            textView6.setOnClickListener(new t10(context, gVar, i10));
            rVar.addView(textView6, w7.z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.messenger.lk.u(textView7, org.telegram.ui.ActionBar.h6.x0(null, i11, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
            textView7.setSingleLine(true);
            textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView7, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.cp0 cp0Var5 = new org.telegram.ui.Components.cp0(context);
            cp0Var5.setDelegate(new pb.a(17));
            cp0Var5.setProgress(ai.r.b / 2.0f);
            cp0Var5.setReportChanges(true);
            rVar.addView(cp0Var5, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(rVar);
            premiumPreviewFragment.r0.addView(scrollView);
            premiumPreviewFragment.r0.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false));
            premiumPreviewFragment.d0.addView(premiumPreviewFragment.r0, w7.z5.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.r0.getLayoutParams()).topMargin = premiumPreviewFragment.c0;
            premiumPreviewFragment.r0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.r0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}

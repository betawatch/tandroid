package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class nw0 extends tg.n {
    public final /* synthetic */ Context i0;
    public final /* synthetic */ rw0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(rw0 rw0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.j0 = rw0Var;
        this.i0 = context2;
    }

    @Override // tg.n
    public final void h() {
        rw0 rw0Var = this.j0;
        PremiumPreviewFragment premiumPreviewFragment = rw0Var.n;
        if (premiumPreviewFragment.t0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.i0;
            premiumPreviewFragment.t0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            tg.g gVar = rw0Var.d.b;
            ai.r rVar = new ai.r(context, 7);
            rVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i10 = org.telegram.ui.ActionBar.k6.n5;
            org.telegram.ui.ActionBar.r6.W(textView, i10, null);
            org.telegram.messenger.sl.u(textView, 1, 16.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.hp0 hp0Var = new org.telegram.ui.Components.hp0(context);
            int i11 = 0;
            hp0Var.setDelegate(new u10(gVar, 0));
            tg.o oVar = gVar.c;
            hp0Var.setProgress(oVar == null ? 0.0f : oVar.B / 2.0f);
            hp0Var.setReportChanges(true);
            rVar.addView(hp0Var, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.ui.ActionBar.r6.W(textView2, i10, null);
            org.telegram.messenger.sl.u(textView2, 1, 16.0f, 1, 1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView2, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.hp0 hp0Var2 = new org.telegram.ui.Components.hp0(context);
            hp0Var2.setDelegate(new u10(gVar, 1));
            tg.o oVar2 = gVar.c;
            hp0Var2.setProgress(oVar2 == null ? 0.0f : oVar2.C / 2.0f);
            hp0Var2.setReportChanges(true);
            rVar.addView(hp0Var2, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i12 = org.telegram.ui.ActionBar.k6.Sh;
            org.telegram.ui.ActionBar.r6.W(textView3, i12, null);
            int i13 = org.telegram.ui.ActionBar.k6.Oh;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.x0(null, i13, false));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
            org.telegram.ui.ActionBar.n6 f7 = org.telegram.ui.ActionBar.r6.f(i13);
            textView3.setBackground(e);
            org.telegram.ui.ActionBar.r6.k(textView3, e, O, f7, null);
            textView3.setOnClickListener(new v10(context, gVar, i11));
            rVar.addView(textView3, w7.z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.ui.ActionBar.r6.W(textView4, i10, null);
            org.telegram.messenger.sl.u(textView4, 1, 16.0f, 1, 1);
            textView4.setSingleLine(true);
            textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView4, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.hp0 hp0Var3 = new org.telegram.ui.Components.hp0(context);
            hp0Var3.setDelegate(new u10(gVar, 2));
            tg.o oVar3 = gVar.c;
            hp0Var3.setProgress(oVar3 == null ? 0.0f : oVar3.D);
            hp0Var3.setReportChanges(true);
            rVar.addView(hp0Var3, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.ui.ActionBar.r6.W(textView5, i10, null);
            org.telegram.messenger.sl.u(textView5, 1, 16.0f, 1, 1);
            textView5.setSingleLine(true);
            textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView5, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.hp0 hp0Var4 = new org.telegram.ui.Components.hp0(context);
            hp0Var4.setDelegate(new u10(gVar, 3));
            tg.o oVar4 = gVar.c;
            hp0Var4.setProgress(oVar4 != null ? oVar4.G / 2.0f : 0.0f);
            hp0Var4.setReportChanges(true);
            rVar.addView(hp0Var4, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            org.telegram.ui.ActionBar.r6.W(textView6, i12, null);
            org.telegram.ui.Cells.y e7 = org.telegram.ui.ActionBar.a6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.x0(null, i13, false));
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
            org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i13);
            textView6.setBackground(e7);
            org.telegram.ui.ActionBar.r6.k(textView6, e7, O2, f10, null);
            textView6.setOnClickListener(new v10(context, gVar, 1));
            rVar.addView(textView6, w7.z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.ui.ActionBar.r6.W(textView7, i10, null);
            org.telegram.messenger.sl.u(textView7, 1, 16.0f, 1, 1);
            textView7.setSingleLine(true);
            textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            rVar.addView(textView7, w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.hp0 hp0Var5 = new org.telegram.ui.Components.hp0(context);
            hp0Var5.setDelegate(new pb.a(17));
            hp0Var5.setProgress(ai.r.b / 2.0f);
            hp0Var5.setReportChanges(true);
            rVar.addView(hp0Var5, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(rVar);
            premiumPreviewFragment.t0.addView(scrollView);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, premiumPreviewFragment.t0, null);
            premiumPreviewFragment.d0.addView(premiumPreviewFragment.t0, w7.z5.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.t0.getLayoutParams()).topMargin = premiumPreviewFragment.c0;
            premiumPreviewFragment.t0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.t0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class aw0 extends dg.i {
    public final /* synthetic */ Context U;
    public final /* synthetic */ ew0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw0(ew0 ew0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.V = ew0Var;
        this.U = context2;
    }

    @Override // dg.i
    public final void g() {
        ew0 ew0Var = this.V;
        PremiumPreviewFragment premiumPreviewFragment = ew0Var.n;
        if (premiumPreviewFragment.n0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.U;
            premiumPreviewFragment.n0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            dg.a aVar = ew0Var.d.b;
            bg.y3 y3Var = new bg.y3(context, 8);
            int i10 = 1;
            y3Var.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i11 = org.telegram.ui.ActionBar.g6.n5;
            int i12 = 0;
            b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            y3Var.addView(textView, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ao0 ao0Var = new org.telegram.ui.Components.ao0(context);
            ao0Var.setDelegate(new s10(aVar, 0));
            dg.j jVar = aVar.c;
            ao0Var.setProgress(jVar == null ? 0.0f : jVar.v / 2.0f);
            ao0Var.setReportChanges(true);
            y3Var.addView(ao0Var, i7.f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            b.r(textView2, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 16.0f, 1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            y3Var.addView(textView2, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ao0 ao0Var2 = new org.telegram.ui.Components.ao0(context);
            ao0Var2.setDelegate(new s10(aVar, 1));
            dg.j jVar2 = aVar.c;
            ao0Var2.setProgress(jVar2 == null ? 0.0f : jVar2.w / 2.0f);
            ao0Var2.setReportChanges(true);
            y3Var.addView(ao0Var2, i7.f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i13 = org.telegram.ui.ActionBar.g6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            int i14 = org.telegram.ui.ActionBar.g6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.w0(null, i14, false)));
            textView3.setOnClickListener(new t10(context, aVar, i12));
            y3Var.addView(textView3, i7.f6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            b.r(textView4, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 16.0f, 1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            y3Var.addView(textView4, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ao0 ao0Var3 = new org.telegram.ui.Components.ao0(context);
            ao0Var3.setDelegate(new s10(aVar, 2));
            dg.j jVar3 = aVar.c;
            ao0Var3.setProgress(jVar3 == null ? 0.0f : jVar3.x);
            ao0Var3.setReportChanges(true);
            y3Var.addView(ao0Var3, i7.f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            b.r(textView5, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 16.0f, 1);
            textView5.setMaxLines(1);
            textView5.setSingleLine(true);
            textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            y3Var.addView(textView5, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ao0 ao0Var4 = new org.telegram.ui.Components.ao0(context);
            ao0Var4.setDelegate(new s10(aVar, 3));
            dg.j jVar4 = aVar.c;
            ao0Var4.setProgress(jVar4 == null ? 0.0f : jVar4.A / 2.0f);
            ao0Var4.setReportChanges(true);
            y3Var.addView(ao0Var4, i7.f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            textView6.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.w0(null, i14, false)));
            textView6.setOnClickListener(new t10(context, aVar, i10));
            y3Var.addView(textView6, i7.f6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            b.r(textView7, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
            textView7.setSingleLine(true);
            textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            y3Var.addView(textView7, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ao0 ao0Var5 = new org.telegram.ui.Components.ao0(context);
            ao0Var5.setDelegate(new f7.v(17));
            ao0Var5.setProgress(bg.y3.b / 2.0f);
            ao0Var5.setReportChanges(true);
            y3Var.addView(ao0Var5, i7.f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(y3Var);
            premiumPreviewFragment.n0.addView(scrollView);
            premiumPreviewFragment.n0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
            premiumPreviewFragment.Z.addView(premiumPreviewFragment.n0, i7.f6.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.n0.getLayoutParams()).topMargin = premiumPreviewFragment.Y;
            premiumPreviewFragment.n0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.n0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}

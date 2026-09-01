package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class o6 extends FrameLayout {
    public final l0 a;
    public final org.telegram.ui.Components.j6 b;
    public final org.telegram.ui.Components.j6 c;

    public o6(Context context) {
        super(context);
        l0 l0Var = new l0(this, context, 3);
        this.a = l0Var;
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        l0Var.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{24.0f}, i10));
        l0Var.setImportantForAccessibility(1);
        k7.e6.b(l0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
            l0Var.addView(textView, k7.c6.e(-2, -1, 17));
        }
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, true, false);
        this.b = j6Var;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        j6Var.k(0.25f, 300L, prVar);
        j6Var.setCallback(l0Var);
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.q(LocaleController.getString(R.string.ClearCache), true, true);
        j6Var.b = 5;
        j6Var.u(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.k6.Sh;
        j6Var.r(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(true, true, true, false);
        this.c = j6Var2;
        j6Var2.k(0.25f, 300L, prVar);
        j6Var2.setCallback(l0Var);
        j6Var2.t(AndroidUtilities.dp(14.0f));
        j6Var2.u(AndroidUtilities.bold());
        j6Var2.r(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(null, i10, false), org.telegram.ui.ActionBar.k6.l1(0.7f, org.telegram.ui.ActionBar.k6.w0(null, i11, false))));
        j6Var2.q("", true, true);
        l0Var.setContentDescription(TextUtils.concat(j6Var.g, "\t", j6Var2.g));
        addView(l0Var, k7.c6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j10, boolean z4) {
        String string = z4 ? LocaleController.getString(R.string.ClearCache) : LocaleController.getString(R.string.ClearSelectedCache);
        org.telegram.ui.Components.j6 j6Var = this.b;
        j6Var.q(string, true, true);
        String formatFileSize = j10 <= 0 ? "" : AndroidUtilities.formatFileSize(j10);
        org.telegram.ui.Components.j6 j6Var2 = this.c;
        j6Var2.q(formatFileSize, true, true);
        setDisabled(j10 <= 0);
        l0 l0Var = this.a;
        l0Var.invalidate();
        l0Var.setContentDescription(TextUtils.concat(j6Var.g, "\t", j6Var2.g));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setDisabled(boolean z4) {
        l0 l0Var = this.a;
        l0Var.animate().cancel();
        l0Var.animate().alpha(z4 ? 0.65f : 1.0f).start();
        l0Var.setClickable(!z4);
    }
}

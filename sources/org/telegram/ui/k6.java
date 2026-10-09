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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class k6 extends FrameLayout {
    public final k0 a;
    public final org.telegram.ui.Components.q6 b;
    public final org.telegram.ui.Components.q6 c;

    public k6(Context context) {
        super(context);
        k0 k0Var = new k0(this, context, 3);
        this.a = k0Var;
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        k0Var.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{24.0f}, i10));
        k0Var.setImportantForAccessibility(1);
        w7.z5.b(k0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
            k0Var.addView(textView, w7.x5.e(-2, -1, 17));
        }
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(true, true, true);
        this.b = q6Var;
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
        q6Var.n(0.25f, 300L, hsVar);
        q6Var.setCallback(k0Var);
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.t(LocaleController.getString(R.string.ClearCache), true, true);
        q6Var.b = 5;
        q6Var.x(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.i6.Sh;
        q6Var.u(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(true, true, true);
        this.c = q6Var2;
        q6Var2.n(0.25f, 300L, hsVar);
        q6Var2.setCallback(k0Var);
        q6Var2.w(AndroidUtilities.dp(14.0f));
        q6Var2.x(AndroidUtilities.bold());
        q6Var2.u(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.x0(null, i10, false), org.telegram.ui.ActionBar.i6.m1(0.7f, org.telegram.ui.ActionBar.i6.x0(null, i11, false))));
        q6Var2.t("", true, true);
        k0Var.setContentDescription(TextUtils.concat(q6Var.i, "\t", q6Var2.i));
        addView(k0Var, w7.x5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 119));
    }

    public final void a(long j3, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.ClearCache) : LocaleController.getString(R.string.ClearSelectedCache);
        org.telegram.ui.Components.q6 q6Var = this.b;
        q6Var.t(string, true, true);
        String formatFileSize = j3 <= 0 ? "" : AndroidUtilities.formatFileSize(j3);
        org.telegram.ui.Components.q6 q6Var2 = this.c;
        q6Var2.t(formatFileSize, true, true);
        setDisabled(j3 <= 0);
        k0 k0Var = this.a;
        k0Var.invalidate();
        k0Var.setContentDescription(TextUtils.concat(q6Var.i, "\t", q6Var2.i));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setDisabled(boolean z10) {
        k0 k0Var = this.a;
        k0Var.animate().cancel();
        k0Var.animate().alpha(z10 ? 0.65f : 1.0f).start();
        k0Var.setClickable(!z10);
    }
}

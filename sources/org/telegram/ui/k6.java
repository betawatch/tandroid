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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public class k6 extends FrameLayout {
    public final k0 a;
    public final org.telegram.ui.Components.o6 b;
    public final org.telegram.ui.Components.o6 c;

    public k6(Context context) {
        super(context);
        k0 k0Var = new k0(this, context, 3);
        this.a = k0Var;
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        k0Var.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{24.0f}, i10));
        k0Var.setImportantForAccessibility(1);
        w7.a6.b(k0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            k0Var.addView(textView, w7.y5.e(-2, -1, 17));
        }
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(true, true, true, false);
        this.b = o6Var;
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        o6Var.k(0.25f, 300L, rrVar);
        o6Var.setCallback(k0Var);
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.q(LocaleController.getString(R.string.ClearCache), true, true);
        o6Var.b = 5;
        o6Var.u(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.Sh;
        o6Var.r(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(true, true, true, false);
        this.c = o6Var2;
        o6Var2.k(0.25f, 300L, rrVar);
        o6Var2.setCallback(k0Var);
        o6Var2.t(AndroidUtilities.dp(14.0f));
        o6Var2.u(AndroidUtilities.bold());
        o6Var2.r(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(null, i10, false), org.telegram.ui.ActionBar.h6.l1(0.7f, org.telegram.ui.ActionBar.h6.w0(null, i11, false))));
        o6Var2.q("", true, true);
        k0Var.setContentDescription(TextUtils.concat(o6Var.g, "\t", o6Var2.g));
        addView(k0Var, w7.y5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j3, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.ClearCache) : LocaleController.getString(R.string.ClearSelectedCache);
        org.telegram.ui.Components.o6 o6Var = this.b;
        o6Var.q(string, true, true);
        String formatFileSize = j3 <= 0 ? "" : AndroidUtilities.formatFileSize(j3);
        org.telegram.ui.Components.o6 o6Var2 = this.c;
        o6Var2.q(formatFileSize, true, true);
        setDisabled(j3 <= 0);
        k0 k0Var = this.a;
        k0Var.invalidate();
        k0Var.setContentDescription(TextUtils.concat(o6Var.g, "\t", o6Var2.g));
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

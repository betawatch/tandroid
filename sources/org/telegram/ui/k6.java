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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class k6 extends FrameLayout {
    public final n0 a;
    public final org.telegram.ui.Components.n6 b;
    public final org.telegram.ui.Components.n6 c;

    public k6(Context context) {
        super(context);
        n0 n0Var = new n0(this, context, 3);
        this.a = n0Var;
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        n0Var.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{24.0f}, i10));
        n0Var.setImportantForAccessibility(1);
        i7.h6.b(n0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            n0Var.addView(textView, i7.f6.e(-2, -1, 17));
        }
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, true, false);
        this.b = n6Var;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        n6Var.k(0.25f, 300L, jrVar);
        n6Var.setCallback(n0Var);
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.q(LocaleController.getString(R.string.ClearCache), true, true);
        n6Var.b = 5;
        n6Var.u(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.Sh;
        n6Var.r(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(true, true, true, false);
        this.c = n6Var2;
        n6Var2.k(0.25f, 300L, jrVar);
        n6Var2.setCallback(n0Var);
        n6Var2.t(AndroidUtilities.dp(14.0f));
        n6Var2.u(AndroidUtilities.bold());
        n6Var2.r(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.l1(0.7f, org.telegram.ui.ActionBar.g6.w0(null, i11, false))));
        n6Var2.q("", true, true);
        n0Var.setContentDescription(TextUtils.concat(n6Var.g, "\t", n6Var2.g));
        addView(n0Var, i7.f6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j10, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.ClearCache) : LocaleController.getString(R.string.ClearSelectedCache);
        org.telegram.ui.Components.n6 n6Var = this.b;
        n6Var.q(string, true, true);
        String formatFileSize = j10 <= 0 ? "" : AndroidUtilities.formatFileSize(j10);
        org.telegram.ui.Components.n6 n6Var2 = this.c;
        n6Var2.q(formatFileSize, true, true);
        setDisabled(j10 <= 0);
        n0 n0Var = this.a;
        n0Var.invalidate();
        n0Var.setContentDescription(TextUtils.concat(n6Var.g, "\t", n6Var2.g));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setDisabled(boolean z10) {
        n0 n0Var = this.a;
        n0Var.animate().cancel();
        n0Var.animate().alpha(z10 ? 0.65f : 1.0f).start();
        n0Var.setClickable(!z10);
    }
}

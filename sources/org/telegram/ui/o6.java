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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public class o6 extends FrameLayout {
    public final m0 a;
    public final org.telegram.ui.Components.p6 b;
    public final org.telegram.ui.Components.p6 c;

    public o6(Context context) {
        super(context);
        m0 m0Var = new m0(this, context, 3);
        this.a = m0Var;
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        m0Var.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{24.0f}, i10));
        m0Var.setImportantForAccessibility(1);
        w7.b6.b(m0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            m0Var.addView(textView, w7.z5.e(-2, -1, 17));
        }
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, true);
        this.b = p6Var;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        p6Var.n(0.25f, 300L, bsVar);
        p6Var.setCallback(m0Var);
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.t(LocaleController.getString(R.string.ClearCache), true, true);
        p6Var.b = 5;
        p6Var.x(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.Sh;
        p6Var.u(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(true, true, true);
        this.c = p6Var2;
        p6Var2.n(0.25f, 300L, bsVar);
        p6Var2.setCallback(m0Var);
        p6Var2.w(AndroidUtilities.dp(14.0f));
        p6Var2.x(AndroidUtilities.bold());
        p6Var2.u(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.x0(null, i10, false), org.telegram.ui.ActionBar.h6.m1(0.7f, org.telegram.ui.ActionBar.h6.x0(null, i11, false))));
        p6Var2.t("", true, true);
        m0Var.setContentDescription(TextUtils.concat(p6Var.i, "\t", p6Var2.i));
        addView(m0Var, w7.z5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j10, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.ClearCache) : LocaleController.getString(R.string.ClearSelectedCache);
        org.telegram.ui.Components.p6 p6Var = this.b;
        p6Var.t(string, true, true);
        String formatFileSize = j10 <= 0 ? "" : AndroidUtilities.formatFileSize(j10);
        org.telegram.ui.Components.p6 p6Var2 = this.c;
        p6Var2.t(formatFileSize, true, true);
        setDisabled(j10 <= 0);
        m0 m0Var = this.a;
        m0Var.invalidate();
        m0Var.setContentDescription(TextUtils.concat(p6Var.i, "\t", p6Var2.i));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setDisabled(boolean z10) {
        m0 m0Var = this.a;
        m0Var.animate().cancel();
        m0Var.animate().alpha(z10 ? 0.65f : 1.0f).start();
        m0Var.setClickable(!z10);
    }
}

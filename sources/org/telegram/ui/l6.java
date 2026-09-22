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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class l6 extends FrameLayout {
    public final j0 a;
    public final org.telegram.ui.Components.m6 b;
    public final org.telegram.ui.Components.m6 c;

    public l6(Context context) {
        super(context);
        j0 j0Var = new j0(this, context, 3);
        this.a = j0Var;
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        j0Var.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{24.0f}, i10));
        j0Var.setImportantForAccessibility(1);
        w7.z5.b(j0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
            j0Var.addView(textView, w7.x5.e(-2, -1, 17));
        }
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, true, true, false);
        this.b = m6Var;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        m6Var.k(0.25f, 300L, qrVar);
        m6Var.setCallback(j0Var);
        m6Var.t(AndroidUtilities.dp(14.0f));
        m6Var.q(LocaleController.getString(R.string.ClearCache), true, true);
        m6Var.b = 5;
        m6Var.u(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.i6.Sh;
        m6Var.r(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(true, true, true, false);
        this.c = m6Var2;
        m6Var2.k(0.25f, 300L, qrVar);
        m6Var2.setCallback(j0Var);
        m6Var2.t(AndroidUtilities.dp(14.0f));
        m6Var2.u(AndroidUtilities.bold());
        m6Var2.r(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(null, i10, false), org.telegram.ui.ActionBar.i6.l1(0.7f, org.telegram.ui.ActionBar.i6.w0(null, i11, false))));
        m6Var2.q("", true, true);
        j0Var.setContentDescription(TextUtils.concat(m6Var.g, "\t", m6Var2.g));
        addView(j0Var, w7.x5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j3, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.ClearCache) : LocaleController.getString(R.string.ClearSelectedCache);
        org.telegram.ui.Components.m6 m6Var = this.b;
        m6Var.q(string, true, true);
        String formatFileSize = j3 <= 0 ? "" : AndroidUtilities.formatFileSize(j3);
        org.telegram.ui.Components.m6 m6Var2 = this.c;
        m6Var2.q(formatFileSize, true, true);
        setDisabled(j3 <= 0);
        j0 j0Var = this.a;
        j0Var.invalidate();
        j0Var.setContentDescription(TextUtils.concat(m6Var.g, "\t", m6Var2.g));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setDisabled(boolean z10) {
        j0 j0Var = this.a;
        j0Var.animate().cancel();
        j0Var.animate().alpha(z10 ? 0.65f : 1.0f).start();
        j0Var.setClickable(!z10);
    }
}

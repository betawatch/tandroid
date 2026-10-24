package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class o6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final l0 a;
    public final org.telegram.ui.Components.p6 b;
    public final org.telegram.ui.Components.p6 c;

    public o6(Context context) {
        super(context);
        l0 l0Var = new l0(this, context, 3);
        this.a = l0Var;
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        l0Var.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{24.0f}, i10));
        l0Var.setImportantForAccessibility(1);
        w7.b6.b(l0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Sh, null);
            l0Var.addView(textView, w7.z5.e(-2, -1, 17));
        }
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, true);
        this.b = p6Var;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        p6Var.n(0.25f, 300L, bsVar);
        p6Var.setCallback(l0Var);
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.t(LocaleController.getString(R.string.ClearCache), true, true);
        p6Var.b = 5;
        p6Var.x(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.k6.Sh;
        p6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(true, true, true);
        this.c = p6Var2;
        p6Var2.n(0.25f, 300L, bsVar);
        p6Var2.setCallback(l0Var);
        p6Var2.w(AndroidUtilities.dp(14.0f));
        p6Var2.x(AndroidUtilities.bold());
        p6Var2.u(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.o1(0.7f, org.telegram.ui.ActionBar.k6.x0(null, i11, false))));
        p6Var2.t("", true, true);
        l0Var.setContentDescription(TextUtils.concat(p6Var.i, "\t", p6Var2.i));
        addView(l0Var, w7.z5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j10, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.ClearCache) : LocaleController.getString(R.string.ClearSelectedCache);
        org.telegram.ui.Components.p6 p6Var = this.b;
        p6Var.t(string, true, true);
        String formatFileSize = j10 <= 0 ? "" : AndroidUtilities.formatFileSize(j10);
        org.telegram.ui.Components.p6 p6Var2 = this.c;
        p6Var2.t(formatFileSize, true, true);
        setDisabled(j10 <= 0);
        l0 l0Var = this.a;
        l0Var.invalidate();
        l0Var.setContentDescription(TextUtils.concat(p6Var.i, "\t", p6Var2.i));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setDisabled(boolean z10) {
        l0 l0Var = this.a;
        l0Var.animate().cancel();
        l0Var.animate().alpha(z10 ? 0.65f : 1.0f).start();
        l0Var.setClickable(!z10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            org.telegram.ui.Components.p6 p6Var = this.b;
            if (p6Var != null) {
                p6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false));
            }
            org.telegram.ui.Components.p6 p6Var2 = this.c;
            if (p6Var2 != null) {
                p6Var2.u(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false), org.telegram.ui.ActionBar.k6.o1(0.7f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false))));
            }
            l0 l0Var = this.a;
            if (l0Var != null) {
                l0Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}

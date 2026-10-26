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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class p6 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final k0 a;
    public final org.telegram.ui.Components.r6 b;
    public final org.telegram.ui.Components.r6 c;

    public p6(Context context) {
        super(context);
        k0 k0Var = new k0(this, context, 3);
        this.a = k0Var;
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        k0Var.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{24.0f}, i10));
        k0Var.setImportantForAccessibility(1);
        org.telegram.ui.Components.gb1.c(k0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
            k0Var.addView(textView, org.telegram.ui.Components.gb1.i(-2, -1, 17));
        }
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, true, true);
        this.b = r6Var;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        r6Var.n(0.25f, 300L, dsVar);
        r6Var.setCallback(k0Var);
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.t(LocaleController.getString(R.string.ClearCache), true, true);
        r6Var.b = 5;
        r6Var.x(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.y6.Sh;
        r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(true, true, true);
        this.c = r6Var2;
        r6Var2.n(0.25f, 300L, dsVar);
        r6Var2.setCallback(k0Var);
        r6Var2.w(AndroidUtilities.dp(14.0f));
        r6Var2.x(AndroidUtilities.bold());
        r6Var2.u(org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.x0(null, i10, false), org.telegram.ui.ActionBar.y6.o1(0.7f, org.telegram.ui.ActionBar.y6.x0(null, i11, false))));
        r6Var2.t("", true, true);
        k0Var.setContentDescription(TextUtils.concat(r6Var.i, "\t", r6Var2.i));
        addView(k0Var, org.telegram.ui.Components.gb1.h(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j10, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.ClearCache) : LocaleController.getString(R.string.ClearSelectedCache);
        org.telegram.ui.Components.r6 r6Var = this.b;
        r6Var.t(string, true, true);
        String formatFileSize = j10 <= 0 ? "" : AndroidUtilities.formatFileSize(j10);
        org.telegram.ui.Components.r6 r6Var2 = this.c;
        r6Var2.t(formatFileSize, true, true);
        setDisabled(j10 <= 0);
        k0 k0Var = this.a;
        k0Var.invalidate();
        k0Var.setContentDescription(TextUtils.concat(r6Var.i, "\t", r6Var2.i));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            org.telegram.ui.Components.r6 r6Var = this.b;
            if (r6Var != null) {
                r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false));
            }
            org.telegram.ui.Components.r6 r6Var2 = this.c;
            if (r6Var2 != null) {
                r6Var2.u(org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false), org.telegram.ui.ActionBar.y6.o1(0.7f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false))));
            }
            k0 k0Var = this.a;
            if (k0Var != null) {
                k0Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}

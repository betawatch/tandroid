package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ie extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 a;
    public final org.telegram.ui.Components.w5 b;
    public final TextView c;
    public final TextView d;
    public final DecimalFormat e;
    public boolean f;

    public ie(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = e6Var;
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        addView(f7, w7.x5.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(f7, textView, w7.x5.n(-1, -2), context);
        this.d = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.y6, e6Var));
        f7.addView(h, w7.x5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(context);
        this.b = w5Var;
        w5Var.setTypeface(AndroidUtilities.bold());
        w5Var.setTextSize(1, 13.0f);
        addView(w5Var, w7.x5.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.e = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f) {
            org.telegram.ui.ActionBar.e6 e6Var = this.a;
            Paint G = e6Var != null ? e6Var.G("paintDivider") : org.telegram.ui.ActionBar.i6.k0;
            if (G != null) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(17.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : 0), getMeasuredHeight() - 1, G);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}

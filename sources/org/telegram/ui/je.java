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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class je extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 a;
    public final org.telegram.ui.Components.t5 b;
    public final TextView c;
    public final TextView d;
    public final DecimalFormat e;
    public boolean f;

    public je(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = g6Var;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        addView(f10, k7.c6.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        TextView i10 = yh.i(f10, textView, k7.c6.n(-1, -2), context);
        this.d = i10;
        i10.setTextSize(1, 13.0f);
        i10.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.y6, g6Var));
        f10.addView(i10, k7.c6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        this.b = t5Var;
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setTextSize(1, 13.0f);
        addView(t5Var, k7.c6.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
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
            org.telegram.ui.ActionBar.g6 g6Var = this.a;
            Paint F = g6Var != null ? g6Var.F("paintDivider") : org.telegram.ui.ActionBar.k6.k0;
            if (F != null) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(17.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : 0), getMeasuredHeight() - 1, F);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}

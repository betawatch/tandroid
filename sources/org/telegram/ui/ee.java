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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ee extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 a;
    public final org.telegram.ui.Components.s5 b;
    public final TextView c;
    public final TextView d;
    public final DecimalFormat e;
    public boolean f;

    public ee(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = b6Var;
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        addView(f10, g7.e6.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        TextView h = j3.r0.h(f10, textView, g7.e6.n(-1, -2), context);
        this.d = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var));
        f10.addView(h, g7.e6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.b = s5Var;
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setTextSize(1, 13.0f);
        addView(s5Var, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
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
            org.telegram.ui.ActionBar.b6 b6Var = this.a;
            Paint O = b6Var != null ? b6Var.O("paintDivider") : org.telegram.ui.ActionBar.f6.k0;
            if (O != null) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(17.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : 0), getMeasuredHeight() - 1, O);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
    }
}

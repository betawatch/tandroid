package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ge extends LinearLayout {
    public final LinearLayout a;
    public final LinearLayout[] b;
    public final org.telegram.ui.Components.z5[] c;
    public final TextView[] d;
    public final TextView e;
    public final DecimalFormat f;

    public ge(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.b = new LinearLayout[2];
        this.c = new org.telegram.ui.Components.z5[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i10 = 0; i10 < 2; i10++) {
            this.b[i10] = new LinearLayout(context);
            this.b[i10].setOrientation(0);
            this.a.addView(this.b[i10], w7.z5.o(-1, -2, 1.0f, 119));
            this.c[i10] = new org.telegram.ui.Components.z5(context);
            this.c[i10].setTypeface(AndroidUtilities.bold());
            this.c[i10].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.W(this.c[i10], org.telegram.ui.ActionBar.k6.G6, g6Var);
            this.b[i10].addView(this.c[i10], w7.z5.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i10] = new org.telegram.ui.Components.z5(context);
            this.d[i10].setTextSize(1, 11.5f);
            org.telegram.ui.ActionBar.r6.W(this.d[i10], org.telegram.ui.ActionBar.k6.y6, g6Var);
            this.b[i10].addView(this.d[i10], w7.z5.q(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.y6, g6Var);
        addView(textView, w7.z5.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.CharSequence] */
    public void set(fe feVar) {
        int i10;
        SpannableStringBuilder spannableStringBuilder;
        int indexOf;
        this.e.setText(feVar.c);
        int i11 = 0;
        while (i11 < 2) {
            String str = i11 == 0 ? feVar.b : feVar.h;
            long j10 = i11 == 0 ? feVar.e : feVar.j;
            LinearLayout[] linearLayoutArr = this.b;
            if (i11 == 0 && !feVar.a) {
                linearLayoutArr[i11].setVisibility(8);
            } else if (i11 != 1 || feVar.g) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(si.o0.u(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.c;
                if (equalsIgnoreCase) {
                    String format = this.f.format(feVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber((long) Math.floor(feVar.d / 1.0E9d), ' '));
                        spannableStringBuilder2.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) format);
                    }
                    spannableStringBuilder = ie.e0(spannableStringBuilder2, textViewArr[i10].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i10 = i11;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i10 == 0) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(feVar.d, ' '));
                        } else {
                            spannableStringBuilder2.append((CharSequence) ai.nd.K0(feVar.i, 0.8f, ' '));
                        }
                        spannableStringBuilder = ai.nd.Y0(false, spannableStringBuilder2, 0.7f, null);
                    } else {
                        spannableStringBuilder2.append((CharSequence) Long.toString(feVar.d));
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                }
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                if ("TON".equalsIgnoreCase(str) && (indexOf = TextUtils.indexOf(spannableStringBuilder3, ".")) >= 0) {
                    spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.8125f), indexOf, spannableStringBuilder3.length(), 33);
                }
                linearLayoutArr[i10].setVisibility(0);
                textViewArr[i10].setText(spannableStringBuilder3);
                this.d[i10].setText("≈" + BillingController.getInstance().formatCurrency(j10, feVar.f));
                i11 = i10 + 1;
            } else {
                linearLayoutArr[i11].setVisibility(8);
            }
            i10 = i11;
            i11 = i10 + 1;
        }
    }
}

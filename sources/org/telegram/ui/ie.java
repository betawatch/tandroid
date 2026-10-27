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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ie extends LinearLayout {
    public final LinearLayout a;
    public final LinearLayout[] b;
    public final org.telegram.ui.Components.b6[] c;
    public final TextView[] d;
    public final TextView e;
    public final DecimalFormat f;

    public ie(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.b = new LinearLayout[2];
        this.c = new org.telegram.ui.Components.b6[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, org.telegram.ui.Components.kb1.o(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i10 = 0; i10 < 2; i10++) {
            this.b[i10] = new LinearLayout(context);
            this.b[i10].setOrientation(0);
            this.a.addView(this.b[i10], org.telegram.ui.Components.kb1.s(-1, -2, 1.0f, 119));
            this.c[i10] = new org.telegram.ui.Components.b6(context);
            this.c[i10].setTypeface(AndroidUtilities.bold());
            this.c[i10].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.f7.V(this.c[i10], org.telegram.ui.ActionBar.y6.G6, u6Var);
            this.b[i10].addView(this.c[i10], org.telegram.ui.Components.kb1.x(-2, -2, 80, 0, 0, 5, 0));
            this.d[i10] = new org.telegram.ui.Components.b6(context);
            this.d[i10].setTextSize(1, 11.5f);
            org.telegram.ui.ActionBar.f7.V(this.d[i10], org.telegram.ui.ActionBar.y6.y6, u6Var);
            this.b[i10].addView(this.d[i10], org.telegram.ui.Components.kb1.u(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.y6, u6Var);
        addView(textView, org.telegram.ui.Components.kb1.x(-1, -2, 55, 22, 5, 22, 9));
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
    public void set(he heVar) {
        int i10;
        SpannableStringBuilder spannableStringBuilder;
        int indexOf;
        this.e.setText(heVar.c);
        int i11 = 0;
        while (i11 < 2) {
            String str = i11 == 0 ? heVar.b : heVar.h;
            long j10 = i11 == 0 ? heVar.e : heVar.j;
            LinearLayout[] linearLayoutArr = this.b;
            if (i11 == 0 && !heVar.a) {
                linearLayoutArr[i11].setVisibility(8);
            } else if (i11 != 1 || heVar.g) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.ui.Components.b10.u(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.c;
                if (equalsIgnoreCase) {
                    String format = this.f.format(heVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber((long) Math.floor(heVar.d / 1.0E9d), ' '));
                        spannableStringBuilder2.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) format);
                    }
                    spannableStringBuilder = ke.K(spannableStringBuilder2, textViewArr[i10].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i10 = i11;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i10 == 0) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(heVar.d, ' '));
                        } else {
                            spannableStringBuilder2.append((CharSequence) bi.dd.I0(heVar.i, 0.8f, ' '));
                        }
                        spannableStringBuilder = bi.dd.W0(false, spannableStringBuilder2, 0.7f, null);
                    } else {
                        spannableStringBuilder2.append((CharSequence) Long.toString(heVar.d));
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                }
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                if ("TON".equalsIgnoreCase(str) && (indexOf = TextUtils.indexOf(spannableStringBuilder3, ".")) >= 0) {
                    spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.8125f), indexOf, spannableStringBuilder3.length(), 33);
                }
                linearLayoutArr[i10].setVisibility(0);
                textViewArr[i10].setText(spannableStringBuilder3);
                this.d[i10].setText("≈" + BillingController.getInstance().formatCurrency(j10, heVar.f));
                i11 = i10 + 1;
            } else {
                linearLayoutArr[i11].setVisibility(8);
            }
            i10 = i11;
            i11 = i10 + 1;
        }
    }
}

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class de extends LinearLayout {
    public final LinearLayout a;
    public final LinearLayout[] b;
    public final org.telegram.ui.Components.s5[] c;
    public final TextView[] d;
    public final TextView e;
    public final DecimalFormat f;

    public de(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.b = new LinearLayout[2];
        this.c = new org.telegram.ui.Components.s5[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i9 = 0; i9 < 2; i9++) {
            this.b[i9] = new LinearLayout(context);
            this.b[i9].setOrientation(0);
            this.a.addView(this.b[i9], g7.e6.o(-1, -2, 1.0f, 119));
            this.c[i9] = new org.telegram.ui.Components.s5(context);
            this.c[i9].setTypeface(AndroidUtilities.bold());
            this.c[i9].setTextSize(1, 16.0f);
            this.c[i9].setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
            this.b[i9].addView(this.c[i9], g7.e6.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i9] = new org.telegram.ui.Components.s5(context);
            this.d[i9].setTextSize(1, 11.5f);
            this.d[i9].setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var));
            this.b[i9].addView(this.d[i9], g7.e6.q(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var));
        addView(textView, g7.e6.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.CharSequence] */
    public void set(ce ceVar) {
        int i9;
        SpannableStringBuilder spannableStringBuilder;
        int indexOf;
        this.e.setText(ceVar.c);
        int i10 = 0;
        while (i10 < 2) {
            String str = i10 == 0 ? ceVar.b : ceVar.h;
            long j10 = i10 == 0 ? ceVar.e : ceVar.j;
            LinearLayout[] linearLayoutArr = this.b;
            if (i10 == 0 && !ceVar.a) {
                linearLayoutArr[i10].setVisibility(8);
            } else if (i10 != 1 || ceVar.g) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ta.b.j(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.c;
                if (equalsIgnoreCase) {
                    String format = this.f.format(ceVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i9 = i10;
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber((long) Math.floor(ceVar.d / 1.0E9d), ' '));
                        spannableStringBuilder2.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i9 = i10;
                        spannableStringBuilder2.append((CharSequence) format);
                    }
                    spannableStringBuilder = fe.f0(spannableStringBuilder2, textViewArr[i9].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i9 = i10;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i9 == 0) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(ceVar.d, ' '));
                        } else {
                            spannableStringBuilder2.append((CharSequence) gh.oa.I0(ceVar.i, 0.8f, ' '));
                        }
                        spannableStringBuilder = gh.oa.X0(false, spannableStringBuilder2, 0.7f, null);
                    } else {
                        spannableStringBuilder2.append((CharSequence) Long.toString(ceVar.d));
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                }
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                if ("TON".equalsIgnoreCase(str) && (indexOf = TextUtils.indexOf(spannableStringBuilder3, ".")) >= 0) {
                    spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.8125f), indexOf, spannableStringBuilder3.length(), 33);
                }
                linearLayoutArr[i9].setVisibility(0);
                textViewArr[i9].setText(spannableStringBuilder3);
                this.d[i9].setText("≈" + BillingController.getInstance().formatCurrency(j10, ceVar.f));
                i10 = i9 + 1;
            } else {
                linearLayoutArr[i10].setVisibility(8);
            }
            i9 = i10;
            i10 = i9 + 1;
        }
    }
}

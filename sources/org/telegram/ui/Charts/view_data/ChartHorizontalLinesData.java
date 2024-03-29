package org.telegram.ui.Charts.view_data;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.ui.ChannelMonetizationLayout;
/* loaded from: classes4.dex */
public class ChartHorizontalLinesData {
    public int alpha;
    public int fixedAlpha = 255;
    private DecimalFormat formatterTON;
    private StaticLayout[] layouts;
    private StaticLayout[] layouts2;
    public long[] values;
    public CharSequence[] valuesStr;
    public CharSequence[] valuesStr2;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChartHorizontalLinesData(long j, long j2, boolean z, float f, int i, TextPaint textPaint, TextPaint textPaint2) {
        long j3;
        float f2;
        int i2;
        long max;
        int i3;
        float f3;
        int i4;
        int i5;
        int i6;
        if (!z) {
            long round = j > 100 ? round(j) : j;
            double d = round;
            Double.isNaN(d);
            int max2 = Math.max(1, (int) Math.ceil(d / 5.0d));
            if (round < 6) {
                i5 = (int) Math.max(2L, round + 1);
            } else {
                long j4 = round / 2;
                if (j4 < 6) {
                    i5 = (int) (j4 + 1);
                    if (round % 2 != 0) {
                        i5++;
                    }
                } else {
                    i4 = 6;
                    this.values = new long[i4];
                    this.valuesStr = new CharSequence[i4];
                    this.layouts = new StaticLayout[i4];
                    if (f > 0.0f) {
                        this.valuesStr2 = new CharSequence[i4];
                        this.layouts2 = new StaticLayout[i4];
                    }
                    boolean z2 = ((float) max2) / f >= 1.0f;
                    i6 = 1;
                    while (i6 < i4) {
                        long[] jArr = this.values;
                        jArr[i6] = i6 * max2;
                        int i7 = max2;
                        this.valuesStr[i6] = format(0, textPaint, jArr[i6], i);
                        if (f > 0.0f) {
                            float f4 = ((float) this.values[i6]) / f;
                            if (!z2) {
                                this.valuesStr2[i6] = format(1, textPaint2, f4, i);
                            } else if (f4 - ((int) f4) < 0.01f || i == 1) {
                                this.valuesStr2[i6] = format(1, textPaint2, f4, i);
                            } else {
                                this.valuesStr2[i6] = "";
                            }
                        }
                        i6++;
                        max2 = i7;
                    }
                    return;
                }
            }
            i4 = i5;
            this.values = new long[i4];
            this.valuesStr = new CharSequence[i4];
            this.layouts = new StaticLayout[i4];
            if (f > 0.0f) {
            }
            if (((float) max2) / f >= 1.0f) {
            }
            i6 = 1;
            while (i6 < i4) {
            }
            return;
        }
        long j5 = j - j2;
        if (j5 == 0) {
            j3 = j2 - 1;
            i2 = 3;
        } else {
            if (j5 < 6) {
                max = Math.max(2L, j5 + 1);
            } else {
                long j6 = j5 / 2;
                if (j6 < 6) {
                    int i8 = (int) (j6 + (j5 % 2) + 1);
                    j3 = j2;
                    i2 = i8;
                    f2 = 2.0f;
                } else {
                    float f5 = ((float) j5) / 5.0f;
                    if (f5 <= 0.0f) {
                        max = Math.max(2L, j5 + 1);
                    } else {
                        j3 = j2;
                        f2 = f5;
                        i2 = 6;
                    }
                }
                this.values = new long[i2];
                this.valuesStr = new CharSequence[i2];
                this.layouts = new StaticLayout[i2];
                if (f > 0.0f) {
                    this.valuesStr2 = new CharSequence[i2];
                    this.layouts2 = new StaticLayout[i2];
                }
                boolean z3 = f2 / f >= 1.0f;
                for (i3 = 0; i3 < i2; i3++) {
                    this.values[i3] = ((int) f3) + j3;
                    this.valuesStr[i3] = format(0, textPaint, j3 + (i3 * f2), i);
                    if (f > 0.0f) {
                        float f6 = ((float) this.values[i3]) / f;
                        if (!z3) {
                            this.valuesStr2[i3] = format(1, textPaint2, f6, i);
                        } else if (f6 - ((int) f6) < 0.01f || i == 1) {
                            this.valuesStr2[i3] = format(1, textPaint2, f6, i);
                        } else {
                            this.valuesStr2[i3] = "";
                        }
                    }
                }
            }
            j3 = j2;
            i2 = (int) max;
        }
        f2 = 1.0f;
        this.values = new long[i2];
        this.valuesStr = new CharSequence[i2];
        this.layouts = new StaticLayout[i2];
        if (f > 0.0f) {
        }
        if (f2 / f >= 1.0f) {
        }
        while (i3 < i2) {
        }
    }

    public CharSequence format(int i, TextPaint textPaint, long j, int i2) {
        if (i2 == 1) {
            if (i == 1) {
                return "~" + BillingController.getInstance().formatCurrency(j, "USD");
            }
            if (this.formatterTON == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                this.formatterTON = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                this.formatterTON.setMaximumFractionDigits(6);
                this.formatterTON.setGroupingUsed(false);
            }
            this.formatterTON.setMaximumFractionDigits(j > 1000000000 ? 2 : 6);
            StringBuilder sb = new StringBuilder();
            sb.append("TON ");
            DecimalFormat decimalFormat2 = this.formatterTON;
            double d = j;
            Double.isNaN(d);
            sb.append(decimalFormat2.format(d / 1.0E9d));
            return ChannelMonetizationLayout.replaceTON(sb.toString(), textPaint, 0.8f, -AndroidUtilities.dp(0.66f), false);
        }
        return AndroidUtilities.formatWholeNumber((int) j, 0);
    }

    public static int lookupHeight(long j) {
        if (j > 100) {
            j = round(j);
        }
        return ((int) Math.ceil(((float) j) / 5.0f)) * 5;
    }

    private static long round(long j) {
        return ((float) (j / 5)) % 10.0f == 0.0f ? j : ((j / 10) + 1) * 10;
    }

    public void drawText(Canvas canvas, int i, int i2, float f, float f2, TextPaint textPaint) {
        StaticLayout staticLayout = (i == 0 ? this.layouts : this.layouts2)[i2];
        if (staticLayout == null) {
            CharSequence charSequence = (i == 0 ? this.valuesStr : this.valuesStr2)[i2];
            StaticLayout[] staticLayoutArr = i == 0 ? this.layouts : this.layouts2;
            staticLayout = new StaticLayout(charSequence, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr[i2] = staticLayout;
        }
        canvas.save();
        canvas.translate(f, f2 + textPaint.ascent());
        staticLayout.draw(canvas);
        canvas.restore();
    }
}

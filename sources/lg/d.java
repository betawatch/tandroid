package lg;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.ui.ke;
import zh.v7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class d {
    public final long[] a;
    public final CharSequence[] b;
    public final CharSequence[] c;
    public final StaticLayout[] d;
    public final StaticLayout[] e;
    public int f;
    public int g;
    public DecimalFormat h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lg.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(long j3, long j10, boolean z10, float f7, int i10, TextPaint textPaint, TextPaint textPaint2) {
        long j11;
        float f10;
        int i11;
        long max;
        int i12;
        long j12;
        long j13;
        long max2;
        int i13;
        int i14;
        int i15;
        ?? obj = new Object();
        obj.g = 255;
        if (z10) {
            long j14 = j3 - j10;
            if (j14 == 0) {
                j11 = j10 - 1;
                i11 = 3;
            } else {
                if (j14 >= 6) {
                    long j15 = j14 / 2;
                    if (j15 < 6) {
                        j11 = j10;
                        i11 = (int) ((j14 % 2) + j15 + 1);
                        f10 = 2.0f;
                    } else {
                        float f11 = j14 / 5.0f;
                        if (f11 <= 0.0f) {
                            max = Math.max(2L, j14 + 1);
                        } else {
                            j11 = j10;
                            f10 = f11;
                            i11 = 6;
                        }
                    }
                    obj.a = new long[i11];
                    obj.b = new CharSequence[i11];
                    obj.d = new StaticLayout[i11];
                    if (f7 > 0.0f) {
                        obj.c = new CharSequence[i11];
                        obj.e = new StaticLayout[i11];
                    }
                    boolean z11 = f10 / f7 >= 1.0f;
                    i12 = 0;
                    d dVar = obj;
                    while (i12 < i11) {
                        long j16 = ((long) (i12 * f10)) + j11;
                        dVar.a[i12] = j16;
                        dVar.b[i12] = dVar.b(0, textPaint, j16, i10);
                        if (f7 > 0.0f) {
                            float f12 = dVar.a[i12] / f7;
                            if (z11) {
                                long j17 = (long) f12;
                                if (f12 - j17 < 0.01f || i10 == 1 || i10 == 2) {
                                    dVar.c[i12] = dVar.b(1, textPaint2, j17, i10);
                                } else {
                                    dVar.c[i12] = "";
                                }
                            } else {
                                dVar.c[i12] = dVar.b(1, textPaint2, (long) f12, i10);
                            }
                        }
                        i12++;
                        dVar = this;
                    }
                    return;
                }
                max = Math.max(2L, j14 + 1);
                j11 = j10;
                i11 = (int) max;
            }
            f10 = 1.0f;
            obj.a = new long[i11];
            obj.b = new CharSequence[i11];
            obj.d = new StaticLayout[i11];
            if (f7 > 0.0f) {
            }
            if (f10 / f7 >= 1.0f) {
            }
            i12 = 0;
            d dVar2 = obj;
            while (i12 < i11) {
            }
            return;
        }
        if (j3 > 100) {
            j12 = 0;
            if ((j3 / 5) % 10.0f != 0.0f) {
                j13 = 10 * ((j3 / 10) + 1);
                max2 = Math.max(1L, (long) Math.ceil(j13 / 5.0d));
                if (j13 < 6) {
                    long j18 = j13 / 2;
                    if (j18 < 6) {
                        i13 = (int) (j18 + 1);
                        i15 = j13 % 2 != j12 ? i13 + 1 : i15;
                    } else {
                        i13 = 6;
                    }
                    obj.a = new long[i13];
                    obj.b = new CharSequence[i13];
                    obj.d = new StaticLayout[i13];
                    if (f7 > 0.0f) {
                        obj.c = new CharSequence[i13];
                        obj.e = new StaticLayout[i13];
                    }
                    boolean z12 = ((float) max2) / f7 < 1.0f;
                    i14 = 1;
                    while (i14 < i13) {
                        long j19 = i14 * max2;
                        obj.a[i14] = j19;
                        long j20 = max2;
                        obj.b[i14] = obj.b(0, textPaint, j19, i10);
                        if (f7 > 0.0f) {
                            float f13 = obj.a[i14] / f7;
                            if (z12) {
                                long j21 = (long) f13;
                                if (f13 - j21 < 0.01f || i10 == 1 || i10 == 2) {
                                    obj.c[i14] = obj.b(1, textPaint2, j21, i10);
                                } else {
                                    obj.c[i14] = "";
                                }
                            } else {
                                obj.c[i14] = obj.b(1, textPaint2, (long) f13, i10);
                            }
                        }
                        i14++;
                        max2 = j20;
                    }
                }
                i15 = (int) Math.max(2L, j13 + 1);
                i13 = i15;
                obj.a = new long[i13];
                obj.b = new CharSequence[i13];
                obj.d = new StaticLayout[i13];
                if (f7 > 0.0f) {
                }
                if (((float) max2) / f7 < 1.0f) {
                }
                i14 = 1;
                while (i14 < i13) {
                }
            }
        } else {
            j12 = 0;
        }
        j13 = j3;
        max2 = Math.max(1L, (long) Math.ceil(j13 / 5.0d));
        if (j13 < 6) {
        }
        i13 = i15;
        obj.a = new long[i13];
        obj.b = new CharSequence[i13];
        obj.d = new StaticLayout[i13];
        if (f7 > 0.0f) {
        }
        if (((float) max2) / f7 < 1.0f) {
        }
        i14 = 1;
        while (i14 < i13) {
        }
    }

    public final void a(Canvas canvas, int i10, int i11, float f7, float f10, TextPaint textPaint) {
        StaticLayout[] staticLayoutArr = this.e;
        StaticLayout[] staticLayoutArr2 = this.d;
        StaticLayout staticLayout = (i10 == 0 ? staticLayoutArr2 : staticLayoutArr)[i11];
        if (staticLayout == null) {
            CharSequence charSequence = (i10 == 0 ? this.b : this.c)[i11];
            if (i10 == 0) {
                staticLayoutArr = staticLayoutArr2;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr[i11] = staticLayout2;
            staticLayout = staticLayout2;
        }
        canvas.save();
        canvas.translate(f7, textPaint.ascent() + f10);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final CharSequence b(int i10, TextPaint textPaint, long j3, int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return AndroidUtilities.formatWholeNumber((int) j3, 0);
            }
            if (i10 != 1) {
                return v7.X0(false, i2.g.k(j3, ' ', new StringBuilder("XTR ")), 0.65f, null);
            }
            return "≈" + BillingController.getInstance().formatCurrency(j3, "USD");
        }
        if (i10 == 1) {
            return "≈" + BillingController.getInstance().formatCurrency(j3, "USD");
        }
        if (this.h == null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setDecimalSeparator('.');
            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
            this.h = decimalFormat;
            decimalFormat.setMinimumFractionDigits(2);
            this.h.setMaximumFractionDigits(6);
            this.h.setGroupingUsed(false);
        }
        this.h.setMaximumFractionDigits(j3 <= 1000000000 ? 6 : 2);
        return ke.f0("TON " + this.h.format(j3 / 1.0E9d), textPaint, 0.8f, -AndroidUtilities.dp(0.66f), false);
    }
}

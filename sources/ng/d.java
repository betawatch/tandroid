package ng;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import bi.dd;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import org.telegram.messenger.r1;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0143  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ng.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(long j3, long j10, boolean z9, float f10, int i7, TextPaint textPaint, TextPaint textPaint2) {
        long j11;
        float f11;
        int i10;
        long max;
        int i11;
        long j12;
        long j13;
        long max2;
        int i12;
        int i13;
        int i14;
        ?? obj = new Object();
        obj.g = qs.e4;
        if (z9) {
            long j14 = j3 - j10;
            if (j14 == 0) {
                j11 = j10 - 1;
                i10 = 3;
            } else {
                if (j14 >= 6) {
                    long j15 = j14 / 2;
                    if (j15 < 6) {
                        j11 = j10;
                        i10 = (int) ((j14 % 2) + j15 + 1);
                        f11 = 2.0f;
                    } else {
                        float f12 = j14 / 5.0f;
                        if (f12 <= 0.0f) {
                            max = Math.max(2L, j14 + 1);
                        } else {
                            j11 = j10;
                            f11 = f12;
                            i10 = 6;
                        }
                    }
                    obj.a = new long[i10];
                    obj.b = new CharSequence[i10];
                    obj.d = new StaticLayout[i10];
                    if (f10 > 0.0f) {
                        obj.c = new CharSequence[i10];
                        obj.e = new StaticLayout[i10];
                    }
                    boolean z10 = f11 / f10 >= 1.0f;
                    i11 = 0;
                    d dVar = obj;
                    while (i11 < i10) {
                        long j16 = ((long) (i11 * f11)) + j11;
                        dVar.a[i11] = j16;
                        dVar.b[i11] = dVar.b(0, textPaint, j16, i7);
                        if (f10 > 0.0f) {
                            float f13 = dVar.a[i11] / f10;
                            if (z10) {
                                long j17 = (long) f13;
                                if (f13 - j17 < 0.01f || i7 == 1 || i7 == 2) {
                                    dVar.c[i11] = dVar.b(1, textPaint2, j17, i7);
                                } else {
                                    dVar.c[i11] = "";
                                }
                            } else {
                                dVar.c[i11] = dVar.b(1, textPaint2, (long) f13, i7);
                            }
                        }
                        i11++;
                        dVar = this;
                    }
                    return;
                }
                max = Math.max(2L, j14 + 1);
                j11 = j10;
                i10 = (int) max;
            }
            f11 = 1.0f;
            obj.a = new long[i10];
            obj.b = new CharSequence[i10];
            obj.d = new StaticLayout[i10];
            if (f10 > 0.0f) {
            }
            if (f11 / f10 >= 1.0f) {
            }
            i11 = 0;
            d dVar2 = obj;
            while (i11 < i10) {
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
                        i12 = (int) (j18 + 1);
                        i14 = j13 % 2 != j12 ? i12 + 1 : i14;
                    } else {
                        i12 = 6;
                    }
                    obj.a = new long[i12];
                    obj.b = new CharSequence[i12];
                    obj.d = new StaticLayout[i12];
                    if (f10 > 0.0f) {
                        obj.c = new CharSequence[i12];
                        obj.e = new StaticLayout[i12];
                    }
                    boolean z11 = ((float) max2) / f10 < 1.0f;
                    i13 = 1;
                    while (i13 < i12) {
                        long j19 = i13 * max2;
                        obj.a[i13] = j19;
                        long j20 = max2;
                        obj.b[i13] = obj.b(0, textPaint, j19, i7);
                        if (f10 > 0.0f) {
                            float f14 = obj.a[i13] / f10;
                            if (z11) {
                                long j21 = (long) f14;
                                if (f14 - j21 < 0.01f || i7 == 1 || i7 == 2) {
                                    obj.c[i13] = obj.b(1, textPaint2, j21, i7);
                                } else {
                                    obj.c[i13] = "";
                                }
                            } else {
                                obj.c[i13] = obj.b(1, textPaint2, (long) f14, i7);
                            }
                        }
                        i13++;
                        max2 = j20;
                    }
                }
                i14 = (int) Math.max(2L, j13 + 1);
                i12 = i14;
                obj.a = new long[i12];
                obj.b = new CharSequence[i12];
                obj.d = new StaticLayout[i12];
                if (f10 > 0.0f) {
                }
                if (((float) max2) / f10 < 1.0f) {
                }
                i13 = 1;
                while (i13 < i12) {
                }
            }
        } else {
            j12 = 0;
        }
        j13 = j3;
        max2 = Math.max(1L, (long) Math.ceil(j13 / 5.0d));
        if (j13 < 6) {
        }
        i12 = i14;
        obj.a = new long[i12];
        obj.b = new CharSequence[i12];
        obj.d = new StaticLayout[i12];
        if (f10 > 0.0f) {
        }
        if (((float) max2) / f10 < 1.0f) {
        }
        i13 = 1;
        while (i13 < i12) {
        }
    }

    public final void a(Canvas canvas, int i7, int i10, float f10, float f11, TextPaint textPaint) {
        StaticLayout[] staticLayoutArr = this.e;
        StaticLayout[] staticLayoutArr2 = this.d;
        StaticLayout staticLayout = (i7 == 0 ? staticLayoutArr2 : staticLayoutArr)[i10];
        if (staticLayout == null) {
            CharSequence charSequence = (i7 == 0 ? this.b : this.c)[i10];
            if (i7 == 0) {
                staticLayoutArr = staticLayoutArr2;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, g0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr[i10] = staticLayout2;
            staticLayout = staticLayout2;
        }
        canvas.save();
        canvas.translate(f10, textPaint.ascent() + f11);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final CharSequence b(int i7, TextPaint textPaint, long j3, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return g0.o0((int) j3, 0);
            }
            if (i7 != 1) {
                return dd.a1(false, jg.g.m(j3, ' ', new StringBuilder("XTR ")), 0.65f, null);
            }
            return "≈" + r1.i().f(j3, "USD");
        }
        if (i7 == 1) {
            return "≈" + r1.i().f(j3, "USD");
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
        return zd.K("TON " + this.h.format(j3 / 1.0E9d), textPaint, 0.8f, -g0.L(0.66f), false);
    }
}

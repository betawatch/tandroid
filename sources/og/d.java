package og;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import ci.wb;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import k2.p1;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.r1;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, og.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(long j10, long j11, boolean z10, float f10, int i3, TextPaint textPaint, TextPaint textPaint2) {
        long j12;
        float f11;
        int i10;
        long max;
        int i11;
        long j13;
        long j14;
        long max2;
        int i12;
        int i13;
        int i14;
        ?? obj = new Object();
        obj.g = hs.e4;
        if (z10) {
            long j15 = j10 - j11;
            if (j15 == 0) {
                j12 = j11 - 1;
                i10 = 3;
            } else {
                if (j15 >= 6) {
                    long j16 = j15 / 2;
                    if (j16 < 6) {
                        j12 = j11;
                        i10 = (int) ((j15 % 2) + j16 + 1);
                        f11 = 2.0f;
                    } else {
                        float f12 = j15 / 5.0f;
                        if (f12 <= 0.0f) {
                            max = Math.max(2L, j15 + 1);
                        } else {
                            j12 = j11;
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
                    boolean z11 = f11 / f10 >= 1.0f;
                    i11 = 0;
                    d dVar = obj;
                    while (i11 < i10) {
                        long j17 = ((long) (i11 * f11)) + j12;
                        dVar.a[i11] = j17;
                        dVar.b[i11] = dVar.b(0, textPaint, j17, i3);
                        if (f10 > 0.0f) {
                            float f13 = dVar.a[i11] / f10;
                            if (z11) {
                                long j18 = (long) f13;
                                if (f13 - j18 < 0.01f || i3 == 1 || i3 == 2) {
                                    dVar.c[i11] = dVar.b(1, textPaint2, j18, i3);
                                } else {
                                    dVar.c[i11] = "";
                                }
                            } else {
                                dVar.c[i11] = dVar.b(1, textPaint2, (long) f13, i3);
                            }
                        }
                        i11++;
                        dVar = this;
                    }
                    return;
                }
                max = Math.max(2L, j15 + 1);
                j12 = j11;
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
        if (j10 > 100) {
            j13 = 0;
            if ((j10 / 5) % 10.0f != 0.0f) {
                j14 = 10 * ((j10 / 10) + 1);
                max2 = Math.max(1L, (long) Math.ceil(j14 / 5.0d));
                if (j14 < 6) {
                    long j19 = j14 / 2;
                    if (j19 < 6) {
                        i12 = (int) (j19 + 1);
                        i14 = j14 % 2 != j13 ? i12 + 1 : i14;
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
                    boolean z12 = ((float) max2) / f10 < 1.0f;
                    i13 = 1;
                    while (i13 < i12) {
                        long j20 = i13 * max2;
                        obj.a[i13] = j20;
                        long j21 = max2;
                        obj.b[i13] = obj.b(0, textPaint, j20, i3);
                        if (f10 > 0.0f) {
                            float f14 = obj.a[i13] / f10;
                            if (z12) {
                                long j22 = (long) f14;
                                if (f14 - j22 < 0.01f || i3 == 1 || i3 == 2) {
                                    obj.c[i13] = obj.b(1, textPaint2, j22, i3);
                                } else {
                                    obj.c[i13] = "";
                                }
                            } else {
                                obj.c[i13] = obj.b(1, textPaint2, (long) f14, i3);
                            }
                        }
                        i13++;
                        max2 = j21;
                    }
                }
                i14 = (int) Math.max(2L, j14 + 1);
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
            j13 = 0;
        }
        j14 = j10;
        max2 = Math.max(1L, (long) Math.ceil(j14 / 5.0d));
        if (j14 < 6) {
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

    public final void a(Canvas canvas, int i3, int i10, float f10, float f11, TextPaint textPaint) {
        StaticLayout[] staticLayoutArr = this.e;
        StaticLayout[] staticLayoutArr2 = this.d;
        StaticLayout staticLayout = (i3 == 0 ? staticLayoutArr2 : staticLayoutArr)[i10];
        if (staticLayout == null) {
            CharSequence charSequence = (i3 == 0 ? this.b : this.c)[i10];
            if (i3 == 0) {
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

    public final CharSequence b(int i3, TextPaint textPaint, long j10, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return g0.o0((int) j10, 0);
            }
            if (i3 != 1) {
                return wb.a1(false, p1.l(j10, ' ', new StringBuilder("XTR ")), 0.65f, null);
            }
            return "≈" + r1.i().f(j10, "USD");
        }
        if (i3 == 1) {
            return "≈" + r1.i().f(j10, "USD");
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
        this.h.setMaximumFractionDigits(j10 <= 1000000000 ? 6 : 2);
        return xd.K("TON " + this.h.format(j10 / 1.0E9d), textPaint, 0.8f, -g0.L(0.66f), false);
    }
}

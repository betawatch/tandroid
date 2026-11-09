package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class w8 extends Drawable {
    public static final int[][] L = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public Drawable K;
    public final TextPaint a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public f10 f;
    public boolean g;
    public StaticLayout h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public boolean m;
    public int n;
    public float o;
    public float p;
    public final StringBuilder q;
    public int r;
    public int s;
    public int t;
    public int u;
    public LinearGradient v;
    public boolean w;
    public boolean x;
    public int y;
    public final org.telegram.ui.ActionBar.g6 z;

    public w8() {
        this((org.telegram.ui.ActionBar.g6) null);
    }

    public static void a(String str, String str2, String str3, StringBuilder sb2) {
        sb2.setLength(0);
        if (str3 != null) {
            sb2.append(str3);
            return;
        }
        if (str != null && str.length() > 0) {
            sb2.append(v(str));
        }
        if (str2 != null && str2.length() > 0) {
            int lastIndexOf = str2.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str2 = str2.substring(lastIndexOf + 1);
            }
            sb2.append("\u200c");
            sb2.append(v(str2));
            return;
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) == ' ' && length != str.length() - 1 && str.charAt(length + 1) != ' ') {
                int length2 = sb2.length();
                sb2.append("\u200c");
                sb2.append(v(str.substring(length2)));
                return;
            }
        }
    }

    public static int d(long j3) {
        return org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.p8[e(j3)], false);
    }

    public static int e(long j3) {
        return (int) Math.abs(j3 % org.telegram.ui.ActionBar.l6.p8.length);
    }

    public static int f(int i7) {
        float[] P0 = org.telegram.ui.ActionBar.l6.P0(5);
        Color.colorToHSV(i7, P0);
        int i10 = (int) P0[0];
        if (i10 >= 345 || i10 < 29) {
            return 0;
        }
        if (i10 < 67) {
            return 1;
        }
        if (i10 < 140) {
            return 3;
        }
        if (i10 < 199) {
            return 4;
        }
        if (i10 < 234) {
            return 5;
        }
        return i10 < 301 ? 2 : 6;
    }

    public static String v(String str) {
        ArrayList j3 = org.telegram.messenger.i6.j(str, null);
        return (j3.isEmpty() || ((org.telegram.messenger.g6) j3.get(0)).a != 0) ? str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1))) : str.substring(0, ((org.telegram.messenger.g6) j3.get(0)).b);
    }

    public final int b() {
        if (!this.g) {
            return this.d;
        }
        int i7 = this.d;
        org.telegram.ui.ActionBar.i6 k10 = org.telegram.ui.ActionBar.l6.I.k(false);
        return org.telegram.ui.ActionBar.l6.C(org.telegram.ui.ActionBar.l6.I, k10 != null ? k10.c : 0, i7);
    }

    public final int c() {
        if (!this.g) {
            return this.e;
        }
        int i7 = this.e;
        org.telegram.ui.ActionBar.i6 k10 = org.telegram.ui.ActionBar.l6.I.k(false);
        return org.telegram.ui.ActionBar.l6.C(org.telegram.ui.ActionBar.l6.I, k10 != null ? k10.c : 0, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021f  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        char c10;
        int i7;
        Drawable[] drawableArr;
        Drawable drawable;
        f10 f10Var;
        int i10;
        int w02;
        int w03;
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        int width = bounds.width();
        boolean z9 = this.G;
        org.telegram.ui.ActionBar.g6 g6Var = this.z;
        if (z9) {
            int i11 = this.J;
            int i12 = org.telegram.ui.ActionBar.s6.b;
            if (i11 != i12) {
                this.J = i12;
                try {
                    if (this.d == this.H && this.e == this.I) {
                        int i13 = this.n;
                        if (i13 == 13) {
                            w02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.P9, false);
                        } else if (i13 == 2) {
                            w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.N7, g6Var);
                        } else {
                            if (i13 != 27 && i13 != 12 && i13 != 1 && i13 != 14) {
                                if (i13 == 20) {
                                    w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Vk, g6Var);
                                    w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Wk, g6Var);
                                    this.H = w02;
                                    this.d = w02;
                                    this.I = w03;
                                    this.e = w03;
                                } else {
                                    this.G = false;
                                }
                            }
                            w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.K7, g6Var);
                            w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.L7, g6Var);
                            this.H = w02;
                            this.d = w02;
                            this.I = w03;
                            this.e = w03;
                        }
                        w03 = w02;
                        this.H = w02;
                        this.d = w02;
                        this.I = w03;
                        this.e = w03;
                    }
                    this.G = false;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        if (this.B) {
            int i14 = this.F;
            int i15 = org.telegram.ui.ActionBar.s6.b;
            if (i14 != i15) {
                this.F = i15;
                if (this.n == 0 && this.d == this.D && this.e == this.E && (i10 = this.C) >= 0) {
                    int[] iArr = org.telegram.ui.ActionBar.l6.p8;
                    c10 = '\r';
                    if (i10 < iArr.length) {
                        int w04 = org.telegram.ui.ActionBar.l6.w0(iArr[i10], g6Var);
                        this.D = w04;
                        this.d = w04;
                        int w05 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[this.C], g6Var);
                        this.E = w05;
                        this.e = w05;
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.J7, g6Var), this.y);
                        TextPaint textPaint = this.a;
                        textPaint.setColor(o4);
                        Paint paint = org.telegram.ui.ActionBar.l6.q0;
                        if (!this.c && (f10Var = this.f) != null) {
                            f10Var.b(bounds.left, bounds.top, r0 + width, r7 + width);
                            paint = this.f.c;
                        } else if (this.b) {
                            int o10 = i0.a.o(b(), this.y);
                            int o11 = i0.a.o(c(), this.y);
                            if (this.v == null || this.s != bounds.height() || this.t != o10 || this.u != o11) {
                                int height = bounds.height();
                                this.s = height;
                                this.t = o10;
                                this.u = o11;
                                this.v = new LinearGradient(0.0f, 0.0f, 0.0f, height, o10, o11, Shader.TileMode.CLAMP);
                            }
                            paint.setShader(this.v);
                            paint.setAlpha(this.y);
                        } else {
                            paint.setShader(null);
                            paint.setColor(i0.a.o(b(), this.y));
                        }
                        canvas.save();
                        canvas.translate(bounds.left, bounds.top);
                        if (this.w) {
                            if (this.x) {
                                canvas.save();
                                float f10 = width / 2.0f;
                                canvas.rotate(-45.0f, f10, f10);
                            }
                            if (this.r > 0) {
                                RectF rectF = org.telegram.messenger.g0.P;
                                float f11 = width;
                                rectF.set(0.0f, 0.0f, f11, f11);
                                float f12 = this.r;
                                canvas.drawRoundRect(rectF, f12, f12, paint);
                            } else {
                                float f13 = width / 2.0f;
                                canvas.drawCircle(f13, f13, f13, paint);
                            }
                            if (this.x) {
                                canvas.restore();
                            }
                        }
                        i7 = this.n;
                        if (i7 == 2) {
                            if (this.o != 0.0f) {
                                int i16 = org.telegram.ui.ActionBar.l6.M7;
                                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.l6.w0(i16, g6Var), this.y));
                                float f14 = width / 2.0f;
                                canvas.drawCircle(f14, f14, this.o * f14, paint);
                                if (org.telegram.ui.ActionBar.l6.C1) {
                                    ah0 ah0Var = org.telegram.ui.ActionBar.l6.u1;
                                    ah0Var.Z = true;
                                    ah0Var.Q(org.telegram.ui.ActionBar.l6.x0(null, i16, true), "Arrow1");
                                    org.telegram.ui.ActionBar.l6.u1.Q(org.telegram.ui.ActionBar.l6.x0(null, i16, true), "Arrow2");
                                    org.telegram.ui.ActionBar.l6.u1.o();
                                    org.telegram.ui.ActionBar.l6.C1 = false;
                                }
                            } else if (!org.telegram.ui.ActionBar.l6.C1) {
                                ah0 ah0Var2 = org.telegram.ui.ActionBar.l6.u1;
                                ah0Var2.Z = true;
                                ah0Var2.Q(this.d, "Arrow1");
                                org.telegram.ui.ActionBar.l6.u1.Q(this.d, "Arrow2");
                                org.telegram.ui.ActionBar.l6.u1.o();
                                org.telegram.ui.ActionBar.l6.C1 = true;
                            }
                            ah0 ah0Var3 = org.telegram.ui.ActionBar.l6.u1;
                            int i17 = ah0Var3.b;
                            int i18 = ah0Var3.c;
                            int i19 = (width - i17) / 2;
                            int i20 = (width - i18) / 2;
                            canvas.save();
                            org.telegram.ui.ActionBar.l6.u1.setBounds(i19, i20, i17 + i19, i18 + i20);
                            org.telegram.ui.ActionBar.l6.u1.draw(canvas);
                            canvas.restore();
                        } else if (i7 != 0 || this.K != null) {
                            Drawable drawable2 = this.K;
                            if (drawable2 == null) {
                                drawable2 = i7 == 1 ? org.telegram.ui.ActionBar.l6.r0[0] : i7 == 4 ? org.telegram.ui.ActionBar.l6.r0[2] : i7 == 5 ? org.telegram.ui.ActionBar.l6.r0[3] : i7 == 6 ? org.telegram.ui.ActionBar.l6.r0[4] : i7 == 7 ? org.telegram.ui.ActionBar.l6.r0[5] : i7 == 8 ? org.telegram.ui.ActionBar.l6.r0[6] : i7 == 9 ? org.telegram.ui.ActionBar.l6.r0[7] : i7 == 10 ? org.telegram.ui.ActionBar.l6.r0[8] : i7 == 3 ? org.telegram.ui.ActionBar.l6.r0[10] : i7 == 12 ? org.telegram.ui.ActionBar.l6.r0[11] : i7 == 14 ? org.telegram.ui.ActionBar.l6.r0[12] : i7 == 15 ? org.telegram.ui.ActionBar.l6.r0[c10] : i7 == 16 ? org.telegram.ui.ActionBar.l6.r0[14] : i7 == 19 ? org.telegram.ui.ActionBar.l6.r0[15] : i7 == 18 ? org.telegram.ui.ActionBar.l6.r0[16] : i7 == 20 ? org.telegram.ui.ActionBar.l6.r0[17] : i7 == 21 ? org.telegram.ui.ActionBar.l6.r0[18] : i7 == 22 ? org.telegram.ui.ActionBar.l6.r0[19] : i7 == 23 ? org.telegram.ui.ActionBar.l6.r0[21] : i7 == 24 ? org.telegram.ui.ActionBar.l6.r0[20] : i7 == 25 ? org.telegram.ui.ActionBar.l6.r0[22] : i7 == 26 ? org.telegram.ui.ActionBar.l6.r0[23] : i7 == 27 ? org.telegram.ui.ActionBar.l6.r0[24] : org.telegram.ui.ActionBar.l6.r0[9];
                            }
                            if (drawable2 != null) {
                                int intrinsicWidth = (int) (drawable2.getIntrinsicWidth() * this.p);
                                int intrinsicHeight = (int) (drawable2.getIntrinsicHeight() * this.p);
                                int i21 = (width - intrinsicWidth) / 2;
                                int i22 = (width - intrinsicHeight) / 2;
                                drawable2.setBounds(i21, i22, intrinsicWidth + i21, intrinsicHeight + i22);
                                int i23 = this.y;
                                if (i23 != 255) {
                                    drawable2.setAlpha(i23);
                                    drawable2.draw(canvas);
                                    drawable2.setAlpha(org.telegram.messenger.qs.e4);
                                } else {
                                    drawable2.draw(canvas);
                                }
                            }
                        } else if (!this.m || (drawable = (drawableArr = org.telegram.ui.ActionBar.l6.r0)[1]) == null) {
                            if (this.A) {
                                this.A = false;
                                StringBuilder sb2 = this.q;
                                if (sb2.length() > 0) {
                                    CharSequence m10 = org.telegram.messenger.i6.m(sb2.toString().toUpperCase(), textPaint.getFontMetricsInt(), true, null, 0);
                                    StaticLayout staticLayout = this.h;
                                    if (staticLayout == null || !TextUtils.equals(m10, staticLayout.getText())) {
                                        try {
                                            StaticLayout staticLayout2 = new StaticLayout(m10, textPaint, org.telegram.messenger.g0.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                            this.h = staticLayout2;
                                            if (staticLayout2.getLineCount() > 0) {
                                                this.k = this.h.getLineLeft(0);
                                                this.i = this.h.getLineWidth(0);
                                                this.j = this.h.getLineBottom(0);
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                        }
                                    }
                                } else {
                                    this.h = null;
                                }
                            }
                            if (this.h != null) {
                                float f15 = width;
                                float L2 = f15 / org.telegram.messenger.g0.L(50.0f);
                                float f16 = f15 / 2.0f;
                                canvas.scale(L2, L2, f16, f16);
                                canvas.translate(((f15 - this.i) / 2.0f) - this.k, (f15 - this.j) / 2.0f);
                                this.h.draw(canvas);
                            }
                        } else {
                            int intrinsicWidth2 = drawable.getIntrinsicWidth();
                            int intrinsicHeight2 = drawableArr[1].getIntrinsicHeight();
                            if (this.l) {
                                float f17 = intrinsicWidth2;
                                float f18 = this.p;
                                intrinsicHeight2 = (int) (intrinsicHeight2 * f18);
                                intrinsicWidth2 = (int) (f17 * f18);
                            } else if (intrinsicWidth2 > width - org.telegram.messenger.g0.L(6.0f) || intrinsicHeight2 > width - org.telegram.messenger.g0.L(6.0f)) {
                                float L3 = width / org.telegram.messenger.g0.L(50.0f);
                                intrinsicWidth2 = (int) (intrinsicWidth2 * L3);
                                intrinsicHeight2 = (int) (intrinsicHeight2 * L3);
                            }
                            int i24 = (width - intrinsicWidth2) / 2;
                            int i25 = (width - intrinsicHeight2) / 2;
                            drawableArr[1].setBounds(i24, i25, intrinsicWidth2 + i24, intrinsicHeight2 + i25);
                            drawableArr[1].draw(canvas);
                        }
                        canvas.restore();
                    }
                } else {
                    c10 = '\r';
                }
                this.B = false;
                int o42 = i0.a.o(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.J7, g6Var), this.y);
                TextPaint textPaint2 = this.a;
                textPaint2.setColor(o42);
                Paint paint2 = org.telegram.ui.ActionBar.l6.q0;
                if (!this.c) {
                }
                if (this.b) {
                }
                canvas.save();
                canvas.translate(bounds.left, bounds.top);
                if (this.w) {
                }
                i7 = this.n;
                if (i7 == 2) {
                }
                canvas.restore();
            }
        }
        c10 = '\r';
        int o422 = i0.a.o(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.J7, g6Var), this.y);
        TextPaint textPaint22 = this.a;
        textPaint22.setColor(o422);
        Paint paint22 = org.telegram.ui.ActionBar.l6.q0;
        if (!this.c) {
        }
        if (this.b) {
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.w) {
        }
        i7 = this.n;
        if (i7 == 2) {
        }
        canvas.restore();
    }

    public final void g(int i7) {
        this.n = i7;
        this.x = false;
        this.c = false;
        this.b = false;
        if (i7 == 13) {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.P9, false);
            this.e = x02;
            this.d = x02;
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.z;
            if (i7 == 2) {
                int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.N7, g6Var);
                this.e = w02;
                this.d = w02;
            } else if (i7 == 27 || i7 == 12 || i7 == 1 || i7 == 14) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.K7, g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.L7, g6Var);
            } else if (i7 == 20) {
                this.x = true;
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Vk, g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Wk, g6Var);
            } else if (i7 == 3) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(5L)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(5L)], g6Var);
            } else if (i7 == 25) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(2L)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(2L)], g6Var);
            } else if (i7 == 26) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(1L)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(1L)], g6Var);
            } else if (i7 == 4) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(5L)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(5L)], g6Var);
            } else if (i7 == 5) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(4L)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(4L)], g6Var);
            } else if (i7 == 6 || i7 == 23) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(3L)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(3L)], g6Var);
            } else if (i7 == 7 || i7 == 24) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(1L)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(1L)], g6Var);
            } else if (i7 == 8) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(0L)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(0L)], g6Var);
            } else if (i7 == 9) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(6L)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(6L)], g6Var);
            } else if (i7 == 10) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(5L)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(5L)], g6Var);
            } else if (i7 == 17) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(5L)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(5L)], g6Var);
            } else if (i7 == 21) {
                this.c = true;
                if (this.f == null) {
                    this.f = new f10();
                }
                this.f.d(-8160001, -5217281, -36183, -1938945);
            } else if (i7 == 22) {
                this.c = true;
                if (this.f == null) {
                    this.f = new f10();
                }
                this.f.d(-11694593, -13910017, -14622003, -15801871);
            } else {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(4L)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(4L)], g6Var);
            }
        }
        int i10 = this.n;
        this.g = (i10 == 2 || i10 == 1 || i10 == 20 || i10 == 21 || i10 == 27 || i10 == 12 || i10 == 14) ? false : true;
        this.G = i10 == 13 || i10 == 2 || i10 == 27 || i10 == 12 || i10 == 1 || i10 == 14 || i10 == 20;
        this.H = this.d;
        this.I = this.e;
        this.J = org.telegram.ui.ActionBar.s6.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i7) {
        this.b = false;
        this.c = false;
        this.e = i7;
        this.d = i7;
        this.g = false;
    }

    public final void i(int i7, int i10) {
        this.b = true;
        this.c = false;
        this.d = i7;
        this.e = i10;
        this.g = false;
    }

    public final void j(long j3, String str, String str2) {
        k(j3, str, str2, null);
    }

    public final void k(long j3, String str, String str2, Integer num) {
        this.A = true;
        this.b = true;
        this.c = false;
        if (num != null) {
            s(num.intValue());
        } else {
            int i7 = org.telegram.ui.ActionBar.l6.p8[e(j3)];
            org.telegram.ui.ActionBar.g6 g6Var = this.z;
            this.d = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
            this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(j3)], g6Var);
            this.C = e(j3);
            this.D = this.d;
            this.E = this.e;
            this.B = true;
            this.F = org.telegram.ui.ActionBar.s6.b;
        }
        this.g = j3 == 5;
        this.n = 0;
        this.m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.q);
    }

    public final void l(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            r((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            q((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            n((TLRPC.ChatInvite) tLObject);
        }
    }

    public final void m(TLRPC.Chat chat) {
        q(chat);
    }

    public final void n(TLRPC.ChatInvite chatInvite) {
        if (chatInvite != null) {
            String str = chatInvite.title;
            TLRPC.Chat chat = chatInvite.chat;
            k(0L, str, null, (chat == null || chat.color == null) ? null : Integer.valueOf(org.telegram.messenger.t3.F(chat)));
        }
    }

    public final void o(TLRPC.User user) {
        r(user);
    }

    public final void p(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            r((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            q((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            n((TLRPC.ChatInvite) tLObject);
        }
    }

    public final void q(TLRPC.Chat chat) {
        if (chat != null) {
            k(chat.id, chat.title, null, chat.color != null ? Integer.valueOf(org.telegram.messenger.t3.F(chat)) : null);
        }
    }

    public final void r(TLRPC.User user) {
        if (user != null) {
            k(user.id, user.first_name, user.last_name, user.color != null ? Integer.valueOf(org.telegram.messenger.t10.e(user)) : null);
            this.m = org.telegram.messenger.t10.x(user);
        }
    }

    public final void s(int i7) {
        f10 f10Var = this.f;
        if (f10Var != null) {
            this.b = false;
            this.c = true;
        } else {
            this.b = true;
            this.c = false;
        }
        int[][] iArr = L;
        org.telegram.ui.ActionBar.g6 g6Var = this.z;
        if (i7 < 14) {
            if (f10Var != null) {
                int[] iArr2 = iArr[e(i7)];
                this.f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                return;
            } else {
                long j3 = i7;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(j3)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(j3)], g6Var);
                return;
            }
        }
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0);
        org.telegram.messenger.gp gpVar = s12.q4;
        if (gpVar == null || gpVar.d(i7) == null) {
            if (this.f != null) {
                int[] iArr3 = iArr[e(i7)];
                this.f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                return;
            } else {
                long j10 = i7;
                this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[e(j10)], g6Var);
                this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[e(j10)], g6Var);
                return;
            }
        }
        int f10 = s12.q4.d(i7).f();
        if (this.f != null) {
            int[] iArr4 = iArr[f(f10)];
            this.f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            this.d = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.p8[f(f10)], g6Var);
            this.e = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q8[f(f10)], g6Var);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.y = i7;
    }

    public final void t() {
        this.l = true;
    }

    public final void u(int i7) {
        this.a.setTextSize(i7);
    }

    public w8(int i7, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.g6) null);
        this.l = false;
        if (user != null) {
            k(user.id, user.first_name, user.last_name, null);
            this.m = org.telegram.messenger.t10.x(user);
        }
    }

    public w8(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.g6) null);
        this.l = false;
        q(chat);
    }

    public w8(org.telegram.ui.ActionBar.g6 g6Var) {
        this.p = 1.0f;
        this.q = new StringBuilder(5);
        this.r = -1;
        this.w = true;
        this.x = false;
        this.y = org.telegram.messenger.qs.e4;
        this.z = g6Var;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

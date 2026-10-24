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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class h9 extends Drawable {
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
    public x20 f;
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

    public h9() {
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

    public static int d(long j10) {
        return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p8[e(j10)], false);
    }

    public static int e(long j10) {
        return (int) Math.abs(j10 % org.telegram.ui.ActionBar.k6.p8.length);
    }

    public static int f(int i10) {
        float[] O0 = org.telegram.ui.ActionBar.k6.O0(5);
        Color.colorToHSV(i10, O0);
        int i11 = (int) O0[0];
        if (i11 >= 345 || i11 < 29) {
            return 0;
        }
        if (i11 < 67) {
            return 1;
        }
        if (i11 < 140) {
            return 3;
        }
        if (i11 < 199) {
            return 4;
        }
        if (i11 < 234) {
            return 5;
        }
        return i11 < 301 ? 2 : 6;
    }

    public static String v(String str) {
        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str);
        return (parseEmojis == null || parseEmojis.isEmpty() || parseEmojis.get(0).start != 0) ? str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1))) : str.substring(0, parseEmojis.get(0).end);
    }

    public final int b() {
        if (!this.g) {
            return this.d;
        }
        int i10 = this.d;
        org.telegram.ui.ActionBar.i6 k10 = org.telegram.ui.ActionBar.k6.I.k(false);
        return org.telegram.ui.ActionBar.k6.B(org.telegram.ui.ActionBar.k6.I, k10 != null ? k10.c : 0, i10);
    }

    public final int c() {
        if (!this.g) {
            return this.e;
        }
        int i10 = this.e;
        org.telegram.ui.ActionBar.i6 k10 = org.telegram.ui.ActionBar.k6.I.k(false);
        return org.telegram.ui.ActionBar.k6.B(org.telegram.ui.ActionBar.k6.I, k10 != null ? k10.c : 0, i10);
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
        int i10;
        Drawable[] drawableArr;
        Drawable drawable;
        x20 x20Var;
        int i11;
        int w02;
        int w03;
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        int width = bounds.width();
        boolean z10 = this.G;
        org.telegram.ui.ActionBar.g6 g6Var = this.z;
        if (z10) {
            int i12 = this.J;
            int i13 = org.telegram.ui.ActionBar.r6.b;
            if (i12 != i13) {
                this.J = i13;
                try {
                    if (this.d == this.H && this.e == this.I) {
                        int i14 = this.n;
                        if (i14 == 13) {
                            w02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false);
                        } else if (i14 == 2) {
                            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N7, g6Var);
                        } else {
                            if (i14 != 27 && i14 != 12 && i14 != 1 && i14 != 14) {
                                if (i14 == 20) {
                                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hk, g6Var);
                                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, g6Var);
                                    this.H = w02;
                                    this.d = w02;
                                    this.I = w03;
                                    this.e = w03;
                                } else {
                                    this.G = false;
                                }
                            }
                            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.K7, g6Var);
                            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L7, g6Var);
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        if (this.B) {
            int i15 = this.F;
            int i16 = org.telegram.ui.ActionBar.r6.b;
            if (i15 != i16) {
                this.F = i16;
                if (this.n == 0 && this.d == this.D && this.e == this.E && (i11 = this.C) >= 0) {
                    int[] iArr = org.telegram.ui.ActionBar.k6.p8;
                    c10 = '\r';
                    if (i11 < iArr.length) {
                        int w04 = org.telegram.ui.ActionBar.k6.w0(iArr[i11], g6Var);
                        this.D = w04;
                        this.d = w04;
                        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[this.C], g6Var);
                        this.E = w05;
                        this.e = w05;
                        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J7, g6Var), this.y);
                        TextPaint textPaint = this.a;
                        textPaint.setColor(o10);
                        Paint paint = org.telegram.ui.ActionBar.k6.q0;
                        if (!this.c && (x20Var = this.f) != null) {
                            x20Var.b(bounds.left, bounds.top, r0 + width, r7 + width);
                            paint = this.f.c;
                        } else if (this.b) {
                            int o11 = i0.a.o(b(), this.y);
                            int o12 = i0.a.o(c(), this.y);
                            if (this.v == null || this.s != bounds.height() || this.t != o11 || this.u != o12) {
                                int height = bounds.height();
                                this.s = height;
                                this.t = o11;
                                this.u = o12;
                                this.v = new LinearGradient(0.0f, 0.0f, 0.0f, height, o11, o12, Shader.TileMode.CLAMP);
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
                                float f7 = width / 2.0f;
                                canvas.rotate(-45.0f, f7, f7);
                            }
                            if (this.r > 0) {
                                RectF rectF = AndroidUtilities.rectTmp;
                                float f10 = width;
                                rectF.set(0.0f, 0.0f, f10, f10);
                                float f11 = this.r;
                                canvas.drawRoundRect(rectF, f11, f11, paint);
                            } else {
                                float f12 = width / 2.0f;
                                canvas.drawCircle(f12, f12, f12, paint);
                            }
                            if (this.x) {
                                canvas.restore();
                            }
                        }
                        i10 = this.n;
                        if (i10 == 2) {
                            if (this.o != 0.0f) {
                                int i17 = org.telegram.ui.ActionBar.k6.M7;
                                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i17, g6Var), this.y));
                                float f13 = width / 2.0f;
                                canvas.drawCircle(f13, f13, this.o * f13, paint);
                                if (org.telegram.ui.ActionBar.k6.C1) {
                                    yj0 yj0Var = org.telegram.ui.ActionBar.k6.u1;
                                    yj0Var.Z = true;
                                    yj0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, i17, true), "Arrow1");
                                    org.telegram.ui.ActionBar.k6.u1.Q(org.telegram.ui.ActionBar.k6.x0(null, i17, true), "Arrow2");
                                    org.telegram.ui.ActionBar.k6.u1.o();
                                    org.telegram.ui.ActionBar.k6.C1 = false;
                                }
                            } else if (!org.telegram.ui.ActionBar.k6.C1) {
                                yj0 yj0Var2 = org.telegram.ui.ActionBar.k6.u1;
                                yj0Var2.Z = true;
                                yj0Var2.Q(this.d, "Arrow1");
                                org.telegram.ui.ActionBar.k6.u1.Q(this.d, "Arrow2");
                                org.telegram.ui.ActionBar.k6.u1.o();
                                org.telegram.ui.ActionBar.k6.C1 = true;
                            }
                            yj0 yj0Var3 = org.telegram.ui.ActionBar.k6.u1;
                            int i18 = yj0Var3.b;
                            int i19 = yj0Var3.c;
                            int i20 = (width - i18) / 2;
                            int i21 = (width - i19) / 2;
                            canvas.save();
                            org.telegram.ui.ActionBar.k6.u1.setBounds(i20, i21, i18 + i20, i19 + i21);
                            org.telegram.ui.ActionBar.k6.u1.draw(canvas);
                            canvas.restore();
                        } else if (i10 != 0 || this.K != null) {
                            Drawable drawable2 = this.K;
                            if (drawable2 == null) {
                                drawable2 = i10 == 1 ? org.telegram.ui.ActionBar.k6.r0[0] : i10 == 4 ? org.telegram.ui.ActionBar.k6.r0[2] : i10 == 5 ? org.telegram.ui.ActionBar.k6.r0[3] : i10 == 6 ? org.telegram.ui.ActionBar.k6.r0[4] : i10 == 7 ? org.telegram.ui.ActionBar.k6.r0[5] : i10 == 8 ? org.telegram.ui.ActionBar.k6.r0[6] : i10 == 9 ? org.telegram.ui.ActionBar.k6.r0[7] : i10 == 10 ? org.telegram.ui.ActionBar.k6.r0[8] : i10 == 3 ? org.telegram.ui.ActionBar.k6.r0[10] : i10 == 12 ? org.telegram.ui.ActionBar.k6.r0[11] : i10 == 14 ? org.telegram.ui.ActionBar.k6.r0[12] : i10 == 15 ? org.telegram.ui.ActionBar.k6.r0[c10] : i10 == 16 ? org.telegram.ui.ActionBar.k6.r0[14] : i10 == 19 ? org.telegram.ui.ActionBar.k6.r0[15] : i10 == 18 ? org.telegram.ui.ActionBar.k6.r0[16] : i10 == 20 ? org.telegram.ui.ActionBar.k6.r0[17] : i10 == 21 ? org.telegram.ui.ActionBar.k6.r0[18] : i10 == 22 ? org.telegram.ui.ActionBar.k6.r0[19] : i10 == 23 ? org.telegram.ui.ActionBar.k6.r0[21] : i10 == 24 ? org.telegram.ui.ActionBar.k6.r0[20] : i10 == 25 ? org.telegram.ui.ActionBar.k6.r0[22] : i10 == 26 ? org.telegram.ui.ActionBar.k6.r0[23] : i10 == 27 ? org.telegram.ui.ActionBar.k6.r0[24] : org.telegram.ui.ActionBar.k6.r0[9];
                            }
                            if (drawable2 != null) {
                                int intrinsicWidth = (int) (drawable2.getIntrinsicWidth() * this.p);
                                int intrinsicHeight = (int) (drawable2.getIntrinsicHeight() * this.p);
                                int i22 = (width - intrinsicWidth) / 2;
                                int i23 = (width - intrinsicHeight) / 2;
                                drawable2.setBounds(i22, i23, intrinsicWidth + i22, intrinsicHeight + i23);
                                int i24 = this.y;
                                if (i24 != 255) {
                                    drawable2.setAlpha(i24);
                                    drawable2.draw(canvas);
                                    drawable2.setAlpha(255);
                                } else {
                                    drawable2.draw(canvas);
                                }
                            }
                        } else if (!this.m || (drawable = (drawableArr = org.telegram.ui.ActionBar.k6.r0)[1]) == null) {
                            if (this.A) {
                                this.A = false;
                                StringBuilder sb2 = this.q;
                                if (sb2.length() > 0) {
                                    CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString().toUpperCase(), textPaint.getFontMetricsInt(), true);
                                    StaticLayout staticLayout = this.h;
                                    if (staticLayout == null || !TextUtils.equals(replaceEmoji, staticLayout.getText())) {
                                        try {
                                            StaticLayout staticLayout2 = new StaticLayout(replaceEmoji, textPaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                            this.h = staticLayout2;
                                            if (staticLayout2.getLineCount() > 0) {
                                                this.k = this.h.getLineLeft(0);
                                                this.i = this.h.getLineWidth(0);
                                                this.j = this.h.getLineBottom(0);
                                            }
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                    }
                                } else {
                                    this.h = null;
                                }
                            }
                            if (this.h != null) {
                                float f14 = width;
                                float dp = f14 / AndroidUtilities.dp(50.0f);
                                float f15 = f14 / 2.0f;
                                canvas.scale(dp, dp, f15, f15);
                                canvas.translate(((f14 - this.i) / 2.0f) - this.k, (f14 - this.j) / 2.0f);
                                this.h.draw(canvas);
                            }
                        } else {
                            int intrinsicWidth2 = drawable.getIntrinsicWidth();
                            int intrinsicHeight2 = drawableArr[1].getIntrinsicHeight();
                            if (this.l) {
                                float f16 = intrinsicWidth2;
                                float f17 = this.p;
                                intrinsicHeight2 = (int) (intrinsicHeight2 * f17);
                                intrinsicWidth2 = (int) (f16 * f17);
                            } else if (intrinsicWidth2 > width - AndroidUtilities.dp(6.0f) || intrinsicHeight2 > width - AndroidUtilities.dp(6.0f)) {
                                float dp2 = width / AndroidUtilities.dp(50.0f);
                                intrinsicWidth2 = (int) (intrinsicWidth2 * dp2);
                                intrinsicHeight2 = (int) (intrinsicHeight2 * dp2);
                            }
                            int i25 = (width - intrinsicWidth2) / 2;
                            int i26 = (width - intrinsicHeight2) / 2;
                            drawableArr[1].setBounds(i25, i26, intrinsicWidth2 + i25, intrinsicHeight2 + i26);
                            drawableArr[1].draw(canvas);
                        }
                        canvas.restore();
                    }
                } else {
                    c10 = '\r';
                }
                this.B = false;
                int o102 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J7, g6Var), this.y);
                TextPaint textPaint2 = this.a;
                textPaint2.setColor(o102);
                Paint paint2 = org.telegram.ui.ActionBar.k6.q0;
                if (!this.c) {
                }
                if (this.b) {
                }
                canvas.save();
                canvas.translate(bounds.left, bounds.top);
                if (this.w) {
                }
                i10 = this.n;
                if (i10 == 2) {
                }
                canvas.restore();
            }
        }
        c10 = '\r';
        int o1022 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J7, g6Var), this.y);
        TextPaint textPaint22 = this.a;
        textPaint22.setColor(o1022);
        Paint paint22 = org.telegram.ui.ActionBar.k6.q0;
        if (!this.c) {
        }
        if (this.b) {
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.w) {
        }
        i10 = this.n;
        if (i10 == 2) {
        }
        canvas.restore();
    }

    public final void g(int i10) {
        this.n = i10;
        this.x = false;
        this.c = false;
        this.b = false;
        if (i10 == 13) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false);
            this.e = x02;
            this.d = x02;
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.z;
            if (i10 == 2) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N7, g6Var);
                this.e = w02;
                this.d = w02;
            } else if (i10 == 27 || i10 == 12 || i10 == 1 || i10 == 14) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.K7, g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L7, g6Var);
            } else if (i10 == 20) {
                this.x = true;
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hk, g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, g6Var);
            } else if (i10 == 3) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(5L)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(5L)], g6Var);
            } else if (i10 == 25) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(2L)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(2L)], g6Var);
            } else if (i10 == 26) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(1L)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(1L)], g6Var);
            } else if (i10 == 4) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(5L)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(5L)], g6Var);
            } else if (i10 == 5) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(4L)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(4L)], g6Var);
            } else if (i10 == 6 || i10 == 23) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(3L)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(3L)], g6Var);
            } else if (i10 == 7 || i10 == 24) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(1L)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(1L)], g6Var);
            } else if (i10 == 8) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(0L)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(0L)], g6Var);
            } else if (i10 == 9) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(6L)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(6L)], g6Var);
            } else if (i10 == 10) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(5L)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(5L)], g6Var);
            } else if (i10 == 17) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(5L)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(5L)], g6Var);
            } else if (i10 == 21) {
                this.c = true;
                if (this.f == null) {
                    this.f = new x20();
                }
                this.f.d(-8160001, -5217281, -36183, -1938945);
            } else if (i10 == 22) {
                this.c = true;
                if (this.f == null) {
                    this.f = new x20();
                }
                this.f.d(-11694593, -13910017, -14622003, -15801871);
            } else {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(4L)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(4L)], g6Var);
            }
        }
        int i11 = this.n;
        this.g = (i11 == 2 || i11 == 1 || i11 == 20 || i11 == 21 || i11 == 27 || i11 == 12 || i11 == 14) ? false : true;
        this.G = i11 == 13 || i11 == 2 || i11 == 27 || i11 == 12 || i11 == 1 || i11 == 14 || i11 == 20;
        this.H = this.d;
        this.I = this.e;
        this.J = org.telegram.ui.ActionBar.r6.b;
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

    public final void h(int i10) {
        this.b = false;
        this.c = false;
        this.e = i10;
        this.d = i10;
        this.g = false;
    }

    public final void i(int i10, int i11) {
        this.b = true;
        this.c = false;
        this.d = i10;
        this.e = i11;
        this.g = false;
    }

    public final void j(int i10, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            m(i10, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            k(i10, (TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            l(i10, (TLRPC.ChatInvite) tLObject);
        }
    }

    public final void k(int i10, TLRPC.Chat chat) {
        if (chat != null) {
            o(chat.id, chat.title, null, chat.color != null ? Integer.valueOf(ChatObject.getColorId(chat)) : null, ChatObject.getPeerColorForAvatar(i10, chat));
        }
    }

    public final void l(int i10, TLRPC.ChatInvite chatInvite) {
        if (chatInvite != null) {
            String str = chatInvite.title;
            TLRPC.Chat chat = chatInvite.chat;
            o(0L, str, null, (chat == null || chat.color == null) ? null : Integer.valueOf(ChatObject.getColorId(chat)), ChatObject.getPeerColorForAvatar(i10, chatInvite.chat));
        }
    }

    public final void m(int i10, TLRPC.User user) {
        if (user != null) {
            o(user.id, user.first_name, user.last_name, user.color != null ? Integer.valueOf(UserObject.getColorId(user)) : null, UserObject.getPeerColorForAvatar(i10, user));
            this.m = UserObject.isDeleted(user);
        }
    }

    public final void n(long j10, String str, String str2) {
        o(j10, str, str2, null, null);
    }

    public final void o(long j10, String str, String str2, Integer num, MessagesController.PeerColor peerColor) {
        this.A = true;
        this.b = true;
        this.c = false;
        if (peerColor != null) {
            this.d = peerColor.getAvatarColor1();
            this.e = peerColor.getAvatarColor2();
        } else if (num != null) {
            s(num.intValue());
        } else {
            int i10 = org.telegram.ui.ActionBar.k6.p8[e(j10)];
            org.telegram.ui.ActionBar.g6 g6Var = this.z;
            this.d = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
            this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(j10)], g6Var);
            this.C = e(j10);
            this.D = this.d;
            this.E = this.e;
            this.B = true;
            this.F = org.telegram.ui.ActionBar.r6.b;
        }
        this.g = j10 == 5;
        this.n = 0;
        this.m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.q);
    }

    public final void p(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            r((TLRPC.User) tLObject);
            return;
        }
        if (tLObject instanceof TLRPC.Chat) {
            q((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            l(UserConfig.selectedAccount, (TLRPC.ChatInvite) tLObject);
        }
    }

    public final void q(TLRPC.Chat chat) {
        k(UserConfig.selectedAccount, chat);
    }

    public final void r(TLRPC.User user) {
        m(UserConfig.selectedAccount, user);
    }

    public final void s(int i10) {
        MessagesController.PeerColors peerColors;
        x20 x20Var = this.f;
        if (x20Var != null) {
            this.b = false;
            this.c = true;
        } else {
            this.b = true;
            this.c = false;
        }
        int[][] iArr = L;
        org.telegram.ui.ActionBar.g6 g6Var = this.z;
        if (i10 < 14) {
            if (x20Var != null) {
                int[] iArr2 = iArr[e(i10)];
                this.f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                return;
            } else {
                long j10 = i10;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(j10)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(j10)], g6Var);
                return;
            }
        }
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        if (messagesController == null || (peerColors = messagesController.peerColors) == null || peerColors.getColor(i10) == null) {
            if (this.f != null) {
                int[] iArr3 = iArr[e(i10)];
                this.f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                return;
            } else {
                long j11 = i10;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[e(j11)], g6Var);
                this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[e(j11)], g6Var);
                return;
            }
        }
        int color1 = messagesController.peerColors.getColor(i10).getColor1();
        if (this.f != null) {
            int[] iArr4 = iArr[f(color1)];
            this.f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p8[f(color1)], g6Var);
            this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[f(color1)], g6Var);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.y = i10;
    }

    public final void t() {
        this.l = true;
    }

    public final void u(int i10) {
        this.a.setTextSize(i10);
    }

    public h9(int i10, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.g6) null);
        this.l = false;
        if (user != null) {
            o(user.id, user.first_name, user.last_name, null, null);
            this.m = UserObject.isDeleted(user);
        }
    }

    public h9(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.g6) null);
        this.l = false;
        q(chat);
    }

    public h9(org.telegram.ui.ActionBar.g6 g6Var) {
        this.p = 1.0f;
        this.q = new StringBuilder(5);
        this.r = -1;
        this.w = true;
        this.x = false;
        this.y = 255;
        this.z = g6Var;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

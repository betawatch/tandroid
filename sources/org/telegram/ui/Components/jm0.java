package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class jm0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float a;
    public int f;
    public int g;
    public im0 h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean p;
    public float q;
    public float r;
    public View s;
    public ArrayList u;
    public CharSequence v;
    public long w;
    public StaticLayout[] z;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF n = new RectF();
    public final int o = org.telegram.messenger.g0.L(2.0f);
    public float t = 1.0f;
    public float x = 0.0f;
    public int y = -1;
    public float B = 1.0f;

    public jm0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.u = null;
        this.y = -1;
        this.x = 0.0f;
        StaticLayout[] staticLayoutArr = this.z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.w = -1L;
    }

    public final void b(Canvas canvas) {
        Canvas canvas2;
        float f10 = this.t;
        if (f10 <= 0.0f) {
            return;
        }
        if (f10 < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, this.f, this.g, (int) (f10 * 255.0f), 31);
        } else {
            canvas2 = canvas;
        }
        int i7 = E / 2;
        int i10 = this.g / 2;
        int i11 = this.o / 2;
        RectF rectF = this.n;
        rectF.set(i7, i10 - i11, this.f - i7, i10 + i11);
        D.setColor(this.p ? this.m : this.i);
        c(canvas2, rectF, D);
        if (this.q > 0.0f) {
            D.setColor(this.p ? this.m : this.j);
            float f11 = E / 2;
            int i12 = this.g / 2;
            rectF.set(f11, i12 - i11, (this.q * (this.f - r12)) + f11, i12 + i11);
            c(canvas2, rectF, D);
        }
        float f12 = E / 2;
        int i13 = this.g / 2;
        rectF.set(f12, i13 - i11, r12 + (this.e ? this.c : this.b), i11 + i13);
        D.setColor(this.l);
        c(canvas2, rectF, D);
        D.setColor(this.k);
        float L = org.telegram.messenger.g0.L(this.e ? 8.0f : 6.0f);
        if (this.r != L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime > 18) {
                elapsedRealtime = 16;
            }
            float f13 = this.r;
            if (f13 < L) {
                float c10 = com.google.android.recaptcha.internal.a.c(elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f13);
                this.r = c10;
                if (c10 > L) {
                    this.r = L;
                }
            } else {
                float v = org.telegram.messenger.camera.q.v(elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f13);
                this.r = v;
                if (v < L) {
                    this.r = L;
                }
            }
            View view = this.s;
            if (view != null) {
                view.invalidate();
            }
        }
        canvas2.drawCircle((E / 2) + (this.e ? this.c : this.b), this.g / 2, this.r, D);
        if (this.t < 1.0f) {
            canvas2.restore();
        }
        ArrayList arrayList = this.u;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float f14 = (this.e ? this.c : this.b) / (this.f - E);
        int size = this.u.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((Float) ((Pair) this.u.get(size)).first).floatValue() - 0.001f <= f14) {
                break;
            } else {
                size--;
            }
        }
        if (this.z == null) {
            this.z = new StaticLayout[2];
        }
        float f15 = E / 2.0f;
        Math.abs(f15 - (this.f - f15));
        org.telegram.messenger.g0.L(66.0f);
        if (size != this.y) {
            if (this.e) {
                org.telegram.messenger.g0.c4(this.s);
            }
            this.y = size;
            if (size >= 0 && size < this.u.size()) {
                d((b41) ((Pair) this.u.get(this.y)).second);
            }
        }
        if (this.B < 1.0f) {
            this.B = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C)) / (this.u.size() > 8 ? 160.0f : 220.0f)) + this.B, 1.0f);
            View view2 = this.s;
            if (view2 != null) {
                view2.invalidate();
            }
            this.C = SystemClock.elapsedRealtime();
        }
        if (this.x < 1.0f) {
            this.x = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C)) / 200.0f) + this.x, 1.0f);
            View view3 = this.s;
            if (view3 != null) {
                view3.invalidate();
            }
            SystemClock.elapsedRealtime();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        if (r14.left >= r27.left) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01db A[EDGE_INSN: B:70:0x01db->B:71:0x01db BREAK  A[LOOP:2: B:27:0x00a5->B:75:0x01d1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, RectF rectF, Paint paint) {
        int i7;
        char c10;
        float floatValue;
        ?? r17;
        char c11;
        jm0 jm0Var = this;
        float f10 = E / 2.0f;
        ArrayList arrayList = jm0Var.u;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        float f11 = rectF.bottom;
        int i10 = E;
        float f12 = i10 / 2.0f;
        float f13 = jm0Var.f - (i10 / 2.0f);
        org.telegram.messenger.g0.P.set(rectF);
        float L = org.telegram.messenger.g0.L(jm0Var.x * 1.0f) / 2.0f;
        if (G == null) {
            G = new Path();
        }
        G.reset();
        float L2 = org.telegram.messenger.g0.L(4.0f) / (f13 - f12);
        int i11 = 0;
        while (true) {
            i7 = -1;
            if (i11 >= jm0Var.u.size()) {
                i11 = -1;
                break;
            } else if (((Float) ((Pair) jm0Var.u.get(i11)).first).floatValue() >= L2) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            i11 = 0;
        }
        boolean z9 = true;
        int size = jm0Var.u.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) jm0Var.u.get(size)).first).floatValue() >= L2) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        if (i7 < 0) {
            i7 = jm0Var.u.size();
        }
        int i12 = i11;
        while (i12 <= i7) {
            if (i12 == i11) {
                floatValue = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                floatValue = ((Float) ((Pair) jm0Var.u.get(i12 - 1)).first).floatValue();
            }
            float floatValue2 = i12 == i7 ? 1.0f : ((Float) ((Pair) jm0Var.u.get(i12)).first).floatValue();
            while (i12 != i7 && i12 != 0) {
                r17 = z9;
                if (i12 >= jm0Var.u.size() - 1 || ((Float) ((Pair) jm0Var.u.get(i12)).first).floatValue() - floatValue > L2) {
                    break;
                }
                i12++;
                floatValue2 = ((Float) ((Pair) jm0Var.u.get(i12)).first).floatValue();
                z9 = r17 == true ? 1 : 0;
            }
            r17 = z9;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.left = org.telegram.messenger.g0.T1(f12, f13, floatValue) + (i12 > 0 ? L : 0.0f);
            float T1 = org.telegram.messenger.g0.T1(f12, f13, floatValue2) - (i12 < i7 ? L : 0.0f);
            rectF2.right = T1;
            float f14 = rectF.right;
            char c12 = T1 > f14 ? r17 : c10;
            if (c12 != 0) {
                rectF2.right = f14;
            }
            float f15 = rectF2.right;
            float f16 = rectF.left;
            if (f15 >= f16) {
                if (rectF2.left < f16) {
                    rectF2.left = f16;
                }
                if (F == null) {
                    F = new float[8];
                }
                if (i12 != i11) {
                    if (c12 != 0) {
                        c11 = 4;
                    } else {
                        c11 = 4;
                    }
                    if (i12 >= i7) {
                        float[] fArr = F;
                        float f17 = 0.7f * f10 * jm0Var.x;
                        fArr[7] = f17;
                        fArr[6] = f17;
                        fArr[r17] = f17;
                        fArr[c10] = f17;
                        fArr[5] = f10;
                        fArr[c11] = f10;
                        fArr[3] = f10;
                        fArr[2] = f10;
                    } else {
                        float[] fArr2 = F;
                        float f18 = 0.7f * f10 * jm0Var.x;
                        fArr2[5] = f18;
                        fArr2[c11] = f18;
                        fArr2[3] = f18;
                        fArr2[2] = f18;
                        fArr2[7] = f18;
                        fArr2[6] = f18;
                        fArr2[r17] = f18;
                        fArr2[c10] = f18;
                    }
                    G.addRoundRect(rectF2, F, Path.Direction.CW);
                    if (c12 == 0) {
                        break;
                    }
                } else {
                    c11 = 4;
                }
                float[] fArr3 = F;
                fArr3[7] = f10;
                fArr3[6] = f10;
                fArr3[r17] = f10;
                fArr3[c10] = f10;
                float f19 = 0.7f * f10 * jm0Var.x;
                fArr3[5] = f19;
                fArr3[c11] = f19;
                fArr3[3] = f19;
                fArr3[2] = f19;
                G.addRoundRect(rectF2, F, Path.Direction.CW);
                if (c12 == 0) {
                }
            }
            i12++;
            jm0Var = this;
            z9 = r17;
        }
        canvas.drawPath(G, paint);
    }

    public final boolean e(float f10, float f11, int i7) {
        im0 im0Var;
        if (i7 == 0) {
            int i10 = this.g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.b = i15;
                        if (i15 < 0) {
                            this.b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.b = i16;
                            }
                        }
                    }
                    this.e = true;
                    int i17 = this.b;
                    this.c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i7 == 1 || i7 == 3) {
            if (this.e) {
                int i18 = this.c;
                this.b = i18;
                if (i7 == 1 && (im0Var = this.h) != null) {
                    im0Var.a(i18 / (this.f - E));
                }
                this.e = false;
                return true;
            }
        } else if (i7 == 2 && this.e) {
            int i19 = (int) (f10 - this.d);
            this.c = i19;
            if (i19 < 0) {
                this.c = 0;
            } else {
                int i20 = this.f - E;
                if (i19 > i20) {
                    this.c = i20;
                }
            }
            im0 im0Var2 = this.h;
            if (im0Var2 != null) {
                im0Var2.d(this.c / (this.f - E));
            }
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.t = f10;
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.i = i7;
        this.j = i10;
        this.k = i12;
        this.l = i11;
        this.m = i13;
    }

    public final void h(float f10) {
        this.a = f10;
        int ceil = (int) Math.ceil((this.f - E) * f10);
        this.b = ceil;
        if (ceil < 0) {
            this.b = 0;
            return;
        }
        int i7 = this.f;
        int i10 = E;
        if (ceil > i7 - i10) {
            this.b = i7 - i10;
        }
    }

    public final void i(int i7, int i10) {
        if (this.f == i7 && this.g == i10) {
            return;
        }
        this.f = i7;
        this.g = i10;
        h(this.a);
    }

    public final void j(org.telegram.messenger.ij ijVar) {
        String str;
        if (ijVar == null) {
            a();
            return;
        }
        Long valueOf = Long.valueOf(((long) ijVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            a();
            return;
        }
        CharSequence charSequence = ijVar.z;
        if (ijVar.f5()) {
            if (ijVar.B == null && (str = ijVar.k.media.webpage.description) != null) {
                ijVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.ij.h(ijVar.O3(), ijVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = ijVar.B;
        }
        if (charSequence == this.v && this.w == valueOf.longValue()) {
            return;
        }
        this.v = charSequence;
        this.w = valueOf.longValue();
        if (!(charSequence instanceof Spanned)) {
            this.u = null;
            this.y = -1;
            this.x = 0.0f;
            StaticLayout[] staticLayoutArr = this.z;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
                return;
            }
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        try {
            b41[] b41VarArr = (b41[]) spanned.getSpans(0, spanned.length(), b41.class);
            this.u = new ArrayList();
            this.x = 0.0f;
            if (this.A == null) {
                TextPaint textPaint = new TextPaint(1);
                this.A = textPaint;
                textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                this.A.setColor(-1);
            }
            for (b41 b41Var : b41VarArr) {
                try {
                    if (b41Var != null && b41Var.getURL() != null && b41Var.d != null && b41Var.getURL().startsWith("audio?")) {
                        if (Utilities.z(b41Var.getURL().substring(6)).intValue() >= 0) {
                            org.telegram.messenger.i6.l(new SpannableStringBuilder(b41Var.d), this.A.getFontMetricsInt(), false);
                            this.u.add(new Pair(Float.valueOf((r5.intValue() * 1000) / valueOf.longValue()), b41Var));
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            Collections.sort(this.u, new org.telegram.ui.oe(14));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
            this.u = null;
            this.y = -1;
            this.x = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.z;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
        }
    }

    public void d(b41 b41Var) {
    }
}

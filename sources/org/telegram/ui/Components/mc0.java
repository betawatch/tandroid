package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mc0 {
    public Path a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public ArrayList g;

    public final void a(String str, float f10) {
        float f11 = this.e;
        float f12 = this.d;
        float f13 = this.c;
        try {
            jc0 jc0Var = new jc0();
            jc0Var.a = new ArrayList();
            jc0Var.b = f10 * this.f;
            String[] split = str.split(" ");
            int i7 = 0;
            while (i7 < split.length) {
                char charAt = split[i7].charAt(0);
                if (charAt == 'C') {
                    ic0 ic0Var = new ic0();
                    ic0Var.c = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    ic0Var.d = (Float.parseFloat(split[i7 + 2]) + f11) * f13;
                    ic0Var.e = (Float.parseFloat(split[i7 + 3]) + f12) * f13;
                    ic0Var.f = (Float.parseFloat(split[i7 + 4]) + f11) * f13;
                    ic0Var.a = (Float.parseFloat(split[i7 + 5]) + f12) * f13;
                    i7 += 6;
                    ic0Var.b = (Float.parseFloat(split[i7]) + f11) * f13;
                    jc0Var.a.add(ic0Var);
                } else if (charAt == 'L') {
                    kc0 kc0Var = new kc0();
                    kc0Var.a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    i7 += 2;
                    kc0Var.b = (Float.parseFloat(split[i7]) + f11) * f13;
                    jc0Var.a.add(kc0Var);
                } else if (charAt == 'M') {
                    lc0 lc0Var = new lc0();
                    lc0Var.a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    i7 += 2;
                    lc0Var.b = (Float.parseFloat(split[i7]) + f11) * f13;
                    jc0Var.a.add(lc0Var);
                }
                i7++;
            }
            this.g.add(jc0Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        jc0 jc0Var;
        jc0 jc0Var2;
        float f11;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f10) {
            this.b = f10;
            int size = arrayList.size();
            jc0 jc0Var3 = null;
            jc0 jc0Var4 = null;
            for (int i7 = 0; i7 < size; i7++) {
                jc0 jc0Var5 = (jc0) arrayList.get(i7);
                if ((jc0Var4 == null || jc0Var4.b < jc0Var5.b) && jc0Var5.b <= f10) {
                    jc0Var4 = jc0Var5;
                }
                if ((jc0Var3 == null || jc0Var3.b > jc0Var5.b) && jc0Var5.b >= f10) {
                    jc0Var3 = jc0Var5;
                }
            }
            if (jc0Var3 == jc0Var4) {
                jc0Var4 = null;
            }
            if (jc0Var4 == null || jc0Var3 != null) {
                jc0Var = jc0Var3;
                jc0Var2 = jc0Var4;
            } else {
                jc0Var = jc0Var4;
                jc0Var2 = null;
            }
            if (jc0Var == null) {
                return;
            }
            ArrayList arrayList2 = jc0Var.a;
            if (jc0Var2 != null && jc0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Object obj = jc0Var2 != null ? jc0Var2.a.get(i10) : null;
                Object obj2 = arrayList2.get(i10);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (jc0Var2 != null) {
                    float f12 = jc0Var2.b;
                    f11 = (f10 - f12) / (jc0Var.b - f12);
                } else {
                    f11 = 1.0f;
                }
                if (obj2 instanceof lc0) {
                    lc0 lc0Var = (lc0) obj2;
                    lc0 lc0Var2 = (lc0) obj;
                    if (lc0Var2 != null) {
                        float f13 = lc0Var2.a;
                        float N = org.telegram.messenger.g0.N(((lc0Var.a - f13) * f11) + f13);
                        float f14 = lc0Var2.b;
                        path.moveTo(N, org.telegram.messenger.g0.N(((lc0Var.b - f14) * f11) + f14));
                    } else {
                        path.moveTo(org.telegram.messenger.g0.N(lc0Var.a), org.telegram.messenger.g0.N(lc0Var.b));
                    }
                } else if (obj2 instanceof kc0) {
                    kc0 kc0Var = (kc0) obj2;
                    kc0 kc0Var2 = (kc0) obj;
                    if (kc0Var2 != null) {
                        float f15 = kc0Var2.a;
                        float N2 = org.telegram.messenger.g0.N(((kc0Var.a - f15) * f11) + f15);
                        float f16 = kc0Var2.b;
                        path.lineTo(N2, org.telegram.messenger.g0.N(((kc0Var.b - f16) * f11) + f16));
                    } else {
                        path.lineTo(org.telegram.messenger.g0.N(kc0Var.a), org.telegram.messenger.g0.N(kc0Var.b));
                    }
                } else if (obj2 instanceof ic0) {
                    ic0 ic0Var = (ic0) obj2;
                    ic0 ic0Var2 = (ic0) obj;
                    if (ic0Var2 != null) {
                        float f17 = ic0Var2.c;
                        float N3 = org.telegram.messenger.g0.N(((ic0Var.c - f17) * f11) + f17);
                        float f18 = ic0Var2.d;
                        float N4 = org.telegram.messenger.g0.N(((ic0Var.d - f18) * f11) + f18);
                        float f19 = ic0Var2.e;
                        float N5 = org.telegram.messenger.g0.N(((ic0Var.e - f19) * f11) + f19);
                        float f20 = ic0Var2.f;
                        float N6 = org.telegram.messenger.g0.N(((ic0Var.f - f20) * f11) + f20);
                        float f21 = ic0Var2.a;
                        float N7 = org.telegram.messenger.g0.N(((ic0Var.a - f21) * f11) + f21);
                        float f22 = ic0Var2.b;
                        path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.g0.N(((ic0Var.b - f22) * f11) + f22));
                    } else {
                        path.cubicTo(org.telegram.messenger.g0.N(ic0Var.c), org.telegram.messenger.g0.N(ic0Var.d), org.telegram.messenger.g0.N(ic0Var.e), org.telegram.messenger.g0.N(ic0Var.f), org.telegram.messenger.g0.N(ic0Var.a), org.telegram.messenger.g0.N(ic0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}

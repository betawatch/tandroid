package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class xc0 {
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
            uc0 uc0Var = new uc0();
            uc0Var.a = new ArrayList();
            uc0Var.b = f10 * this.f;
            String[] split = str.split(" ");
            int i7 = 0;
            while (i7 < split.length) {
                char charAt = split[i7].charAt(0);
                if (charAt == 'C') {
                    tc0 tc0Var = new tc0();
                    tc0Var.c = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    tc0Var.d = (Float.parseFloat(split[i7 + 2]) + f11) * f13;
                    tc0Var.e = (Float.parseFloat(split[i7 + 3]) + f12) * f13;
                    tc0Var.f = (Float.parseFloat(split[i7 + 4]) + f11) * f13;
                    tc0Var.a = (Float.parseFloat(split[i7 + 5]) + f12) * f13;
                    i7 += 6;
                    tc0Var.b = (Float.parseFloat(split[i7]) + f11) * f13;
                    uc0Var.a.add(tc0Var);
                } else if (charAt == 'L') {
                    vc0 vc0Var = new vc0();
                    vc0Var.a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    i7 += 2;
                    vc0Var.b = (Float.parseFloat(split[i7]) + f11) * f13;
                    uc0Var.a.add(vc0Var);
                } else if (charAt == 'M') {
                    wc0 wc0Var = new wc0();
                    wc0Var.a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    i7 += 2;
                    wc0Var.b = (Float.parseFloat(split[i7]) + f11) * f13;
                    uc0Var.a.add(wc0Var);
                }
                i7++;
            }
            this.g.add(uc0Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        uc0 uc0Var;
        uc0 uc0Var2;
        float f11;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f10) {
            this.b = f10;
            int size = arrayList.size();
            uc0 uc0Var3 = null;
            uc0 uc0Var4 = null;
            for (int i7 = 0; i7 < size; i7++) {
                uc0 uc0Var5 = (uc0) arrayList.get(i7);
                if ((uc0Var4 == null || uc0Var4.b < uc0Var5.b) && uc0Var5.b <= f10) {
                    uc0Var4 = uc0Var5;
                }
                if ((uc0Var3 == null || uc0Var3.b > uc0Var5.b) && uc0Var5.b >= f10) {
                    uc0Var3 = uc0Var5;
                }
            }
            if (uc0Var3 == uc0Var4) {
                uc0Var4 = null;
            }
            if (uc0Var4 == null || uc0Var3 != null) {
                uc0Var = uc0Var3;
                uc0Var2 = uc0Var4;
            } else {
                uc0Var = uc0Var4;
                uc0Var2 = null;
            }
            if (uc0Var == null) {
                return;
            }
            ArrayList arrayList2 = uc0Var.a;
            if (uc0Var2 != null && uc0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Object obj = uc0Var2 != null ? uc0Var2.a.get(i10) : null;
                Object obj2 = arrayList2.get(i10);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (uc0Var2 != null) {
                    float f12 = uc0Var2.b;
                    f11 = (f10 - f12) / (uc0Var.b - f12);
                } else {
                    f11 = 1.0f;
                }
                if (obj2 instanceof wc0) {
                    wc0 wc0Var = (wc0) obj2;
                    wc0 wc0Var2 = (wc0) obj;
                    if (wc0Var2 != null) {
                        float f13 = wc0Var2.a;
                        float N = org.telegram.messenger.g0.N(((wc0Var.a - f13) * f11) + f13);
                        float f14 = wc0Var2.b;
                        path.moveTo(N, org.telegram.messenger.g0.N(((wc0Var.b - f14) * f11) + f14));
                    } else {
                        path.moveTo(org.telegram.messenger.g0.N(wc0Var.a), org.telegram.messenger.g0.N(wc0Var.b));
                    }
                } else if (obj2 instanceof vc0) {
                    vc0 vc0Var = (vc0) obj2;
                    vc0 vc0Var2 = (vc0) obj;
                    if (vc0Var2 != null) {
                        float f15 = vc0Var2.a;
                        float N2 = org.telegram.messenger.g0.N(((vc0Var.a - f15) * f11) + f15);
                        float f16 = vc0Var2.b;
                        path.lineTo(N2, org.telegram.messenger.g0.N(((vc0Var.b - f16) * f11) + f16));
                    } else {
                        path.lineTo(org.telegram.messenger.g0.N(vc0Var.a), org.telegram.messenger.g0.N(vc0Var.b));
                    }
                } else if (obj2 instanceof tc0) {
                    tc0 tc0Var = (tc0) obj2;
                    tc0 tc0Var2 = (tc0) obj;
                    if (tc0Var2 != null) {
                        float f17 = tc0Var2.c;
                        float N3 = org.telegram.messenger.g0.N(((tc0Var.c - f17) * f11) + f17);
                        float f18 = tc0Var2.d;
                        float N4 = org.telegram.messenger.g0.N(((tc0Var.d - f18) * f11) + f18);
                        float f19 = tc0Var2.e;
                        float N5 = org.telegram.messenger.g0.N(((tc0Var.e - f19) * f11) + f19);
                        float f20 = tc0Var2.f;
                        float N6 = org.telegram.messenger.g0.N(((tc0Var.f - f20) * f11) + f20);
                        float f21 = tc0Var2.a;
                        float N7 = org.telegram.messenger.g0.N(((tc0Var.a - f21) * f11) + f21);
                        float f22 = tc0Var2.b;
                        path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.g0.N(((tc0Var.b - f22) * f11) + f22));
                    } else {
                        path.cubicTo(org.telegram.messenger.g0.N(tc0Var.c), org.telegram.messenger.g0.N(tc0Var.d), org.telegram.messenger.g0.N(tc0Var.e), org.telegram.messenger.g0.N(tc0Var.f), org.telegram.messenger.g0.N(tc0Var.a), org.telegram.messenger.g0.N(tc0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}

package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gc0 {
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
            dc0 dc0Var = new dc0();
            dc0Var.a = new ArrayList();
            dc0Var.b = f10 * this.f;
            String[] split = str.split(" ");
            int i3 = 0;
            while (i3 < split.length) {
                char charAt = split[i3].charAt(0);
                if (charAt == 'C') {
                    cc0 cc0Var = new cc0();
                    cc0Var.c = (Float.parseFloat(split[i3 + 1]) + f12) * f13;
                    cc0Var.d = (Float.parseFloat(split[i3 + 2]) + f11) * f13;
                    cc0Var.e = (Float.parseFloat(split[i3 + 3]) + f12) * f13;
                    cc0Var.f = (Float.parseFloat(split[i3 + 4]) + f11) * f13;
                    cc0Var.a = (Float.parseFloat(split[i3 + 5]) + f12) * f13;
                    i3 += 6;
                    cc0Var.b = (Float.parseFloat(split[i3]) + f11) * f13;
                    dc0Var.a.add(cc0Var);
                } else if (charAt == 'L') {
                    ec0 ec0Var = new ec0();
                    ec0Var.a = (Float.parseFloat(split[i3 + 1]) + f12) * f13;
                    i3 += 2;
                    ec0Var.b = (Float.parseFloat(split[i3]) + f11) * f13;
                    dc0Var.a.add(ec0Var);
                } else if (charAt == 'M') {
                    fc0 fc0Var = new fc0();
                    fc0Var.a = (Float.parseFloat(split[i3 + 1]) + f12) * f13;
                    i3 += 2;
                    fc0Var.b = (Float.parseFloat(split[i3]) + f11) * f13;
                    dc0Var.a.add(fc0Var);
                }
                i3++;
            }
            this.g.add(dc0Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        dc0 dc0Var;
        dc0 dc0Var2;
        float f11;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f10) {
            this.b = f10;
            int size = arrayList.size();
            dc0 dc0Var3 = null;
            dc0 dc0Var4 = null;
            for (int i3 = 0; i3 < size; i3++) {
                dc0 dc0Var5 = (dc0) arrayList.get(i3);
                if ((dc0Var4 == null || dc0Var4.b < dc0Var5.b) && dc0Var5.b <= f10) {
                    dc0Var4 = dc0Var5;
                }
                if ((dc0Var3 == null || dc0Var3.b > dc0Var5.b) && dc0Var5.b >= f10) {
                    dc0Var3 = dc0Var5;
                }
            }
            if (dc0Var3 == dc0Var4) {
                dc0Var4 = null;
            }
            if (dc0Var4 == null || dc0Var3 != null) {
                dc0Var = dc0Var3;
                dc0Var2 = dc0Var4;
            } else {
                dc0Var = dc0Var4;
                dc0Var2 = null;
            }
            if (dc0Var == null) {
                return;
            }
            ArrayList arrayList2 = dc0Var.a;
            if (dc0Var2 != null && dc0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Object obj = dc0Var2 != null ? dc0Var2.a.get(i10) : null;
                Object obj2 = arrayList2.get(i10);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (dc0Var2 != null) {
                    float f12 = dc0Var2.b;
                    f11 = (f10 - f12) / (dc0Var.b - f12);
                } else {
                    f11 = 1.0f;
                }
                if (obj2 instanceof fc0) {
                    fc0 fc0Var = (fc0) obj2;
                    fc0 fc0Var2 = (fc0) obj;
                    if (fc0Var2 != null) {
                        float f13 = fc0Var2.a;
                        float N = org.telegram.messenger.g0.N(((fc0Var.a - f13) * f11) + f13);
                        float f14 = fc0Var2.b;
                        path.moveTo(N, org.telegram.messenger.g0.N(((fc0Var.b - f14) * f11) + f14));
                    } else {
                        path.moveTo(org.telegram.messenger.g0.N(fc0Var.a), org.telegram.messenger.g0.N(fc0Var.b));
                    }
                } else if (obj2 instanceof ec0) {
                    ec0 ec0Var = (ec0) obj2;
                    ec0 ec0Var2 = (ec0) obj;
                    if (ec0Var2 != null) {
                        float f15 = ec0Var2.a;
                        float N2 = org.telegram.messenger.g0.N(((ec0Var.a - f15) * f11) + f15);
                        float f16 = ec0Var2.b;
                        path.lineTo(N2, org.telegram.messenger.g0.N(((ec0Var.b - f16) * f11) + f16));
                    } else {
                        path.lineTo(org.telegram.messenger.g0.N(ec0Var.a), org.telegram.messenger.g0.N(ec0Var.b));
                    }
                } else if (obj2 instanceof cc0) {
                    cc0 cc0Var = (cc0) obj2;
                    cc0 cc0Var2 = (cc0) obj;
                    if (cc0Var2 != null) {
                        float f17 = cc0Var2.c;
                        float N3 = org.telegram.messenger.g0.N(((cc0Var.c - f17) * f11) + f17);
                        float f18 = cc0Var2.d;
                        float N4 = org.telegram.messenger.g0.N(((cc0Var.d - f18) * f11) + f18);
                        float f19 = cc0Var2.e;
                        float N5 = org.telegram.messenger.g0.N(((cc0Var.e - f19) * f11) + f19);
                        float f20 = cc0Var2.f;
                        float N6 = org.telegram.messenger.g0.N(((cc0Var.f - f20) * f11) + f20);
                        float f21 = cc0Var2.a;
                        float N7 = org.telegram.messenger.g0.N(((cc0Var.a - f21) * f11) + f21);
                        float f22 = cc0Var2.b;
                        path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.g0.N(((cc0Var.b - f22) * f11) + f22));
                    } else {
                        path.cubicTo(org.telegram.messenger.g0.N(cc0Var.c), org.telegram.messenger.g0.N(cc0Var.d), org.telegram.messenger.g0.N(cc0Var.e), org.telegram.messenger.g0.N(cc0Var.f), org.telegram.messenger.g0.N(cc0Var.a), org.telegram.messenger.g0.N(cc0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}

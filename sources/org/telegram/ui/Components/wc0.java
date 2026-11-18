package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class wc0 {
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
            tc0 tc0Var = new tc0();
            tc0Var.a = new ArrayList();
            tc0Var.b = f10 * this.f;
            String[] split = str.split(" ");
            int i7 = 0;
            while (i7 < split.length) {
                char charAt = split[i7].charAt(0);
                if (charAt == 'C') {
                    sc0 sc0Var = new sc0();
                    sc0Var.c = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    sc0Var.d = (Float.parseFloat(split[i7 + 2]) + f11) * f13;
                    sc0Var.e = (Float.parseFloat(split[i7 + 3]) + f12) * f13;
                    sc0Var.f = (Float.parseFloat(split[i7 + 4]) + f11) * f13;
                    sc0Var.a = (Float.parseFloat(split[i7 + 5]) + f12) * f13;
                    i7 += 6;
                    sc0Var.b = (Float.parseFloat(split[i7]) + f11) * f13;
                    tc0Var.a.add(sc0Var);
                } else if (charAt == 'L') {
                    uc0 uc0Var = new uc0();
                    uc0Var.a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    i7 += 2;
                    uc0Var.b = (Float.parseFloat(split[i7]) + f11) * f13;
                    tc0Var.a.add(uc0Var);
                } else if (charAt == 'M') {
                    vc0 vc0Var = new vc0();
                    vc0Var.a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    i7 += 2;
                    vc0Var.b = (Float.parseFloat(split[i7]) + f11) * f13;
                    tc0Var.a.add(vc0Var);
                }
                i7++;
            }
            this.g.add(tc0Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        tc0 tc0Var;
        tc0 tc0Var2;
        float f11;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f10) {
            this.b = f10;
            int size = arrayList.size();
            tc0 tc0Var3 = null;
            tc0 tc0Var4 = null;
            for (int i7 = 0; i7 < size; i7++) {
                tc0 tc0Var5 = (tc0) arrayList.get(i7);
                if ((tc0Var4 == null || tc0Var4.b < tc0Var5.b) && tc0Var5.b <= f10) {
                    tc0Var4 = tc0Var5;
                }
                if ((tc0Var3 == null || tc0Var3.b > tc0Var5.b) && tc0Var5.b >= f10) {
                    tc0Var3 = tc0Var5;
                }
            }
            if (tc0Var3 == tc0Var4) {
                tc0Var4 = null;
            }
            if (tc0Var4 == null || tc0Var3 != null) {
                tc0Var = tc0Var3;
                tc0Var2 = tc0Var4;
            } else {
                tc0Var = tc0Var4;
                tc0Var2 = null;
            }
            if (tc0Var == null) {
                return;
            }
            ArrayList arrayList2 = tc0Var.a;
            if (tc0Var2 != null && tc0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Object obj = tc0Var2 != null ? tc0Var2.a.get(i10) : null;
                Object obj2 = arrayList2.get(i10);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (tc0Var2 != null) {
                    float f12 = tc0Var2.b;
                    f11 = (f10 - f12) / (tc0Var.b - f12);
                } else {
                    f11 = 1.0f;
                }
                if (obj2 instanceof vc0) {
                    vc0 vc0Var = (vc0) obj2;
                    vc0 vc0Var2 = (vc0) obj;
                    if (vc0Var2 != null) {
                        float f13 = vc0Var2.a;
                        float N = org.telegram.messenger.g0.N(((vc0Var.a - f13) * f11) + f13);
                        float f14 = vc0Var2.b;
                        path.moveTo(N, org.telegram.messenger.g0.N(((vc0Var.b - f14) * f11) + f14));
                    } else {
                        path.moveTo(org.telegram.messenger.g0.N(vc0Var.a), org.telegram.messenger.g0.N(vc0Var.b));
                    }
                } else if (obj2 instanceof uc0) {
                    uc0 uc0Var = (uc0) obj2;
                    uc0 uc0Var2 = (uc0) obj;
                    if (uc0Var2 != null) {
                        float f15 = uc0Var2.a;
                        float N2 = org.telegram.messenger.g0.N(((uc0Var.a - f15) * f11) + f15);
                        float f16 = uc0Var2.b;
                        path.lineTo(N2, org.telegram.messenger.g0.N(((uc0Var.b - f16) * f11) + f16));
                    } else {
                        path.lineTo(org.telegram.messenger.g0.N(uc0Var.a), org.telegram.messenger.g0.N(uc0Var.b));
                    }
                } else if (obj2 instanceof sc0) {
                    sc0 sc0Var = (sc0) obj2;
                    sc0 sc0Var2 = (sc0) obj;
                    if (sc0Var2 != null) {
                        float f17 = sc0Var2.c;
                        float N3 = org.telegram.messenger.g0.N(((sc0Var.c - f17) * f11) + f17);
                        float f18 = sc0Var2.d;
                        float N4 = org.telegram.messenger.g0.N(((sc0Var.d - f18) * f11) + f18);
                        float f19 = sc0Var2.e;
                        float N5 = org.telegram.messenger.g0.N(((sc0Var.e - f19) * f11) + f19);
                        float f20 = sc0Var2.f;
                        float N6 = org.telegram.messenger.g0.N(((sc0Var.f - f20) * f11) + f20);
                        float f21 = sc0Var2.a;
                        float N7 = org.telegram.messenger.g0.N(((sc0Var.a - f21) * f11) + f21);
                        float f22 = sc0Var2.b;
                        path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.g0.N(((sc0Var.b - f22) * f11) + f22));
                    } else {
                        path.cubicTo(org.telegram.messenger.g0.N(sc0Var.c), org.telegram.messenger.g0.N(sc0Var.d), org.telegram.messenger.g0.N(sc0Var.e), org.telegram.messenger.g0.N(sc0Var.f), org.telegram.messenger.g0.N(sc0Var.a), org.telegram.messenger.g0.N(sc0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}

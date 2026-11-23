package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vc0 {
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
            sc0 sc0Var = new sc0();
            sc0Var.a = new ArrayList();
            sc0Var.b = f10 * this.f;
            String[] split = str.split(" ");
            int i7 = 0;
            while (i7 < split.length) {
                char charAt = split[i7].charAt(0);
                if (charAt == 'C') {
                    rc0 rc0Var = new rc0();
                    rc0Var.c = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    rc0Var.d = (Float.parseFloat(split[i7 + 2]) + f11) * f13;
                    rc0Var.e = (Float.parseFloat(split[i7 + 3]) + f12) * f13;
                    rc0Var.f = (Float.parseFloat(split[i7 + 4]) + f11) * f13;
                    rc0Var.a = (Float.parseFloat(split[i7 + 5]) + f12) * f13;
                    i7 += 6;
                    rc0Var.b = (Float.parseFloat(split[i7]) + f11) * f13;
                    sc0Var.a.add(rc0Var);
                } else if (charAt == 'L') {
                    tc0 tc0Var = new tc0();
                    tc0Var.a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    i7 += 2;
                    tc0Var.b = (Float.parseFloat(split[i7]) + f11) * f13;
                    sc0Var.a.add(tc0Var);
                } else if (charAt == 'M') {
                    uc0 uc0Var = new uc0();
                    uc0Var.a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    i7 += 2;
                    uc0Var.b = (Float.parseFloat(split[i7]) + f11) * f13;
                    sc0Var.a.add(uc0Var);
                }
                i7++;
            }
            this.g.add(sc0Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        sc0 sc0Var;
        sc0 sc0Var2;
        float f11;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f10) {
            this.b = f10;
            int size = arrayList.size();
            sc0 sc0Var3 = null;
            sc0 sc0Var4 = null;
            for (int i7 = 0; i7 < size; i7++) {
                sc0 sc0Var5 = (sc0) arrayList.get(i7);
                if ((sc0Var4 == null || sc0Var4.b < sc0Var5.b) && sc0Var5.b <= f10) {
                    sc0Var4 = sc0Var5;
                }
                if ((sc0Var3 == null || sc0Var3.b > sc0Var5.b) && sc0Var5.b >= f10) {
                    sc0Var3 = sc0Var5;
                }
            }
            if (sc0Var3 == sc0Var4) {
                sc0Var4 = null;
            }
            if (sc0Var4 == null || sc0Var3 != null) {
                sc0Var = sc0Var3;
                sc0Var2 = sc0Var4;
            } else {
                sc0Var = sc0Var4;
                sc0Var2 = null;
            }
            if (sc0Var == null) {
                return;
            }
            ArrayList arrayList2 = sc0Var.a;
            if (sc0Var2 != null && sc0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Object obj = sc0Var2 != null ? sc0Var2.a.get(i10) : null;
                Object obj2 = arrayList2.get(i10);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (sc0Var2 != null) {
                    float f12 = sc0Var2.b;
                    f11 = (f10 - f12) / (sc0Var.b - f12);
                } else {
                    f11 = 1.0f;
                }
                if (obj2 instanceof uc0) {
                    uc0 uc0Var = (uc0) obj2;
                    uc0 uc0Var2 = (uc0) obj;
                    if (uc0Var2 != null) {
                        float f13 = uc0Var2.a;
                        float N = org.telegram.messenger.g0.N(((uc0Var.a - f13) * f11) + f13);
                        float f14 = uc0Var2.b;
                        path.moveTo(N, org.telegram.messenger.g0.N(((uc0Var.b - f14) * f11) + f14));
                    } else {
                        path.moveTo(org.telegram.messenger.g0.N(uc0Var.a), org.telegram.messenger.g0.N(uc0Var.b));
                    }
                } else if (obj2 instanceof tc0) {
                    tc0 tc0Var = (tc0) obj2;
                    tc0 tc0Var2 = (tc0) obj;
                    if (tc0Var2 != null) {
                        float f15 = tc0Var2.a;
                        float N2 = org.telegram.messenger.g0.N(((tc0Var.a - f15) * f11) + f15);
                        float f16 = tc0Var2.b;
                        path.lineTo(N2, org.telegram.messenger.g0.N(((tc0Var.b - f16) * f11) + f16));
                    } else {
                        path.lineTo(org.telegram.messenger.g0.N(tc0Var.a), org.telegram.messenger.g0.N(tc0Var.b));
                    }
                } else if (obj2 instanceof rc0) {
                    rc0 rc0Var = (rc0) obj2;
                    rc0 rc0Var2 = (rc0) obj;
                    if (rc0Var2 != null) {
                        float f17 = rc0Var2.c;
                        float N3 = org.telegram.messenger.g0.N(((rc0Var.c - f17) * f11) + f17);
                        float f18 = rc0Var2.d;
                        float N4 = org.telegram.messenger.g0.N(((rc0Var.d - f18) * f11) + f18);
                        float f19 = rc0Var2.e;
                        float N5 = org.telegram.messenger.g0.N(((rc0Var.e - f19) * f11) + f19);
                        float f20 = rc0Var2.f;
                        float N6 = org.telegram.messenger.g0.N(((rc0Var.f - f20) * f11) + f20);
                        float f21 = rc0Var2.a;
                        float N7 = org.telegram.messenger.g0.N(((rc0Var.a - f21) * f11) + f21);
                        float f22 = rc0Var2.b;
                        path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.g0.N(((rc0Var.b - f22) * f11) + f22));
                    } else {
                        path.cubicTo(org.telegram.messenger.g0.N(rc0Var.c), org.telegram.messenger.g0.N(rc0Var.d), org.telegram.messenger.g0.N(rc0Var.e), org.telegram.messenger.g0.N(rc0Var.f), org.telegram.messenger.g0.N(rc0Var.a), org.telegram.messenger.g0.N(rc0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}

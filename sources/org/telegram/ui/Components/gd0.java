package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gd0 {
    public Path a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public ArrayList g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.c;
        try {
            dd0 dd0Var = new dd0();
            dd0Var.a = new ArrayList();
            dd0Var.b = f7 * this.f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt == 'C') {
                    cd0 cd0Var = new cd0();
                    cd0Var.c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    cd0Var.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    cd0Var.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    cd0Var.f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    cd0Var.a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    cd0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    dd0Var.a.add(cd0Var);
                } else if (charAt == 'L') {
                    ed0 ed0Var = new ed0();
                    ed0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    ed0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    dd0Var.a.add(ed0Var);
                } else if (charAt == 'M') {
                    fd0 fd0Var = new fd0();
                    fd0Var.a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    i10 += 2;
                    fd0Var.b = (Float.parseFloat(split[i10]) + f10) * f12;
                    dd0Var.a.add(fd0Var);
                }
                i10++;
            }
            this.g.add(dd0Var);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        dd0 dd0Var;
        dd0 dd0Var2;
        float f10;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f7) {
            this.b = f7;
            int size = arrayList.size();
            dd0 dd0Var3 = null;
            dd0 dd0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                dd0 dd0Var5 = (dd0) arrayList.get(i10);
                if ((dd0Var4 == null || dd0Var4.b < dd0Var5.b) && dd0Var5.b <= f7) {
                    dd0Var4 = dd0Var5;
                }
                if ((dd0Var3 == null || dd0Var3.b > dd0Var5.b) && dd0Var5.b >= f7) {
                    dd0Var3 = dd0Var5;
                }
            }
            if (dd0Var3 == dd0Var4) {
                dd0Var4 = null;
            }
            if (dd0Var4 == null || dd0Var3 != null) {
                dd0Var = dd0Var3;
                dd0Var2 = dd0Var4;
            } else {
                dd0Var = dd0Var4;
                dd0Var2 = null;
            }
            if (dd0Var == null) {
                return;
            }
            ArrayList arrayList2 = dd0Var.a;
            if (dd0Var2 != null && dd0Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = dd0Var2 != null ? dd0Var2.a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (dd0Var2 != null) {
                    float f11 = dd0Var2.b;
                    f10 = (f7 - f11) / (dd0Var.b - f11);
                } else {
                    f10 = 1.0f;
                }
                if (obj2 instanceof fd0) {
                    fd0 fd0Var = (fd0) obj2;
                    fd0 fd0Var2 = (fd0) obj;
                    if (fd0Var2 != null) {
                        float f12 = fd0Var2.a;
                        float N = org.telegram.messenger.i0.N(((fd0Var.a - f12) * f10) + f12);
                        float f13 = fd0Var2.b;
                        path.moveTo(N, org.telegram.messenger.i0.N(((fd0Var.b - f13) * f10) + f13));
                    } else {
                        path.moveTo(org.telegram.messenger.i0.N(fd0Var.a), org.telegram.messenger.i0.N(fd0Var.b));
                    }
                } else if (obj2 instanceof ed0) {
                    ed0 ed0Var = (ed0) obj2;
                    ed0 ed0Var2 = (ed0) obj;
                    if (ed0Var2 != null) {
                        float f14 = ed0Var2.a;
                        float N2 = org.telegram.messenger.i0.N(((ed0Var.a - f14) * f10) + f14);
                        float f15 = ed0Var2.b;
                        path.lineTo(N2, org.telegram.messenger.i0.N(((ed0Var.b - f15) * f10) + f15));
                    } else {
                        path.lineTo(org.telegram.messenger.i0.N(ed0Var.a), org.telegram.messenger.i0.N(ed0Var.b));
                    }
                } else if (obj2 instanceof cd0) {
                    cd0 cd0Var = (cd0) obj2;
                    cd0 cd0Var2 = (cd0) obj;
                    if (cd0Var2 != null) {
                        float f16 = cd0Var2.c;
                        float N3 = org.telegram.messenger.i0.N(((cd0Var.c - f16) * f10) + f16);
                        float f17 = cd0Var2.d;
                        float N4 = org.telegram.messenger.i0.N(((cd0Var.d - f17) * f10) + f17);
                        float f18 = cd0Var2.e;
                        float N5 = org.telegram.messenger.i0.N(((cd0Var.e - f18) * f10) + f18);
                        float f19 = cd0Var2.f;
                        float N6 = org.telegram.messenger.i0.N(((cd0Var.f - f19) * f10) + f19);
                        float f20 = cd0Var2.a;
                        float N7 = org.telegram.messenger.i0.N(((cd0Var.a - f20) * f10) + f20);
                        float f21 = cd0Var2.b;
                        path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.i0.N(((cd0Var.b - f21) * f10) + f21));
                    } else {
                        path.cubicTo(org.telegram.messenger.i0.N(cd0Var.c), org.telegram.messenger.i0.N(cd0Var.d), org.telegram.messenger.i0.N(cd0Var.e), org.telegram.messenger.i0.N(cd0Var.f), org.telegram.messenger.i0.N(cd0Var.a), org.telegram.messenger.i0.N(cd0Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}

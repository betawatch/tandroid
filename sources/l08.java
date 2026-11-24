// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l08 {
    public Path a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public ArrayList g;

    public final void a(String str, float f) {
        float f2 = this.e;
        float f3 = this.d;
        float f4 = this.c;
        try {
            i08 i08Var = new i08();
            i08Var.a = new ArrayList();
            i08Var.b = f * this.f;
            String[] split = str.split(" ");
            int i = 0;
            while (i < split.length) {
                char charAt = split[i].charAt(0);
                if (charAt == 'C') {
                    h08 h08Var = new h08();
                    h08Var.c = (Float.parseFloat(split[i + 1]) + f3) * f4;
                    h08Var.d = (Float.parseFloat(split[i + 2]) + f2) * f4;
                    h08Var.e = (Float.parseFloat(split[i + 3]) + f3) * f4;
                    h08Var.f = (Float.parseFloat(split[i + 4]) + f2) * f4;
                    h08Var.a = (Float.parseFloat(split[i + 5]) + f3) * f4;
                    i += 6;
                    h08Var.b = (Float.parseFloat(split[i]) + f2) * f4;
                    i08Var.a.add(h08Var);
                } else if (charAt == 'L') {
                    j08 j08Var = new j08();
                    j08Var.a = (Float.parseFloat(split[i + 1]) + f3) * f4;
                    i += 2;
                    j08Var.b = (Float.parseFloat(split[i]) + f2) * f4;
                    i08Var.a.add(j08Var);
                } else if (charAt == 'M') {
                    k08 k08Var = new k08();
                    k08Var.a = (Float.parseFloat(split[i + 1]) + f3) * f4;
                    i += 2;
                    k08Var.b = (Float.parseFloat(split[i]) + f2) * f4;
                    i08Var.a.add(k08Var);
                }
                i++;
            }
            this.g.add(i08Var);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r9 < r11) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, Paint paint, float f) {
        i08 i08Var;
        i08 i08Var2;
        float f2;
        float f3;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f) {
            this.b = f;
            int size = arrayList.size();
            i08 i08Var3 = null;
            i08 i08Var4 = null;
            for (int i = 0; i < size; i++) {
                i08 i08Var5 = (i08) arrayList.get(i);
                if (i08Var4 != null) {
                    float f4 = i08Var4.b;
                    f3 = i08Var5.b;
                }
                f3 = i08Var5.b;
                if (f3 <= f) {
                    i08Var4 = i08Var5;
                }
                if ((i08Var3 == null || i08Var3.b > f3) && f3 >= f) {
                    i08Var3 = i08Var5;
                }
            }
            if (i08Var3 == i08Var4) {
                i08Var4 = null;
            }
            if (i08Var4 == null || i08Var3 != null) {
                i08Var = i08Var3;
                i08Var2 = i08Var4;
            } else {
                i08Var = i08Var4;
                i08Var2 = null;
            }
            if (i08Var == null) {
                return;
            }
            ArrayList arrayList2 = i08Var.a;
            if (i08Var2 != null && i08Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj = i08Var2 != null ? i08Var2.a.get(i2) : null;
                Object obj2 = arrayList2.get(i2);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (i08Var2 != null) {
                    float f5 = i08Var2.b;
                    f2 = (f - f5) / (i08Var.b - f5);
                } else {
                    f2 = 1.0f;
                }
                if (obj2 instanceof k08) {
                    k08 k08Var = (k08) obj2;
                    k08 k08Var2 = (k08) obj;
                    if (k08Var2 != null) {
                        float f6 = k08Var2.a;
                        float N = gm.N(((k08Var.a - f6) * f2) + f6);
                        float f7 = k08Var2.b;
                        path.moveTo(N, gm.N(((k08Var.b - f7) * f2) + f7));
                    } else {
                        path.moveTo(gm.N(k08Var.a), gm.N(k08Var.b));
                    }
                } else if (obj2 instanceof j08) {
                    j08 j08Var = (j08) obj2;
                    j08 j08Var2 = (j08) obj;
                    if (j08Var2 != null) {
                        float f8 = j08Var2.a;
                        float N2 = gm.N(((j08Var.a - f8) * f2) + f8);
                        float f9 = j08Var2.b;
                        path.lineTo(N2, gm.N(((j08Var.b - f9) * f2) + f9));
                    } else {
                        path.lineTo(gm.N(j08Var.a), gm.N(j08Var.b));
                    }
                } else if (obj2 instanceof h08) {
                    h08 h08Var = (h08) obj2;
                    h08 h08Var2 = (h08) obj;
                    if (h08Var2 != null) {
                        float f10 = h08Var2.c;
                        float N3 = gm.N(((h08Var.c - f10) * f2) + f10);
                        float f11 = h08Var2.d;
                        float N4 = gm.N(((h08Var.d - f11) * f2) + f11);
                        float f12 = h08Var2.e;
                        float N5 = gm.N(((h08Var.e - f12) * f2) + f12);
                        float f13 = h08Var2.f;
                        float N6 = gm.N(((h08Var.f - f13) * f2) + f13);
                        float f14 = h08Var2.a;
                        float N7 = gm.N(((h08Var.a - f14) * f2) + f14);
                        float f15 = h08Var2.b;
                        path.cubicTo(N3, N4, N5, N6, N7, gm.N(((h08Var.b - f15) * f2) + f15));
                    } else {
                        path.cubicTo(gm.N(h08Var.c), gm.N(h08Var.d), gm.N(h08Var.e), gm.N(h08Var.f), gm.N(h08Var.a), gm.N(h08Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}

// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jy7 {
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
            gy7 gy7Var = new gy7();
            gy7Var.a = new ArrayList();
            gy7Var.b = f * this.f;
            String[] split = str.split(" ");
            int i = 0;
            while (i < split.length) {
                char charAt = split[i].charAt(0);
                if (charAt == 'C') {
                    fy7 fy7Var = new fy7();
                    fy7Var.c = (Float.parseFloat(split[i + 1]) + f3) * f4;
                    fy7Var.d = (Float.parseFloat(split[i + 2]) + f2) * f4;
                    fy7Var.e = (Float.parseFloat(split[i + 3]) + f3) * f4;
                    fy7Var.f = (Float.parseFloat(split[i + 4]) + f2) * f4;
                    fy7Var.a = (Float.parseFloat(split[i + 5]) + f3) * f4;
                    i += 6;
                    fy7Var.b = (Float.parseFloat(split[i]) + f2) * f4;
                    gy7Var.a.add(fy7Var);
                } else if (charAt == 'L') {
                    hy7 hy7Var = new hy7();
                    hy7Var.a = (Float.parseFloat(split[i + 1]) + f3) * f4;
                    i += 2;
                    hy7Var.b = (Float.parseFloat(split[i]) + f2) * f4;
                    gy7Var.a.add(hy7Var);
                } else if (charAt == 'M') {
                    iy7 iy7Var = new iy7();
                    iy7Var.a = (Float.parseFloat(split[i + 1]) + f3) * f4;
                    i += 2;
                    iy7Var.b = (Float.parseFloat(split[i]) + f2) * f4;
                    gy7Var.a.add(iy7Var);
                }
                i++;
            }
            this.g.add(gy7Var);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r9 < r11) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, Paint paint, float f) {
        gy7 gy7Var;
        gy7 gy7Var2;
        float f2;
        float f3;
        ArrayList arrayList = this.g;
        Path path = this.a;
        if (this.b != f) {
            this.b = f;
            int size = arrayList.size();
            gy7 gy7Var3 = null;
            gy7 gy7Var4 = null;
            for (int i = 0; i < size; i++) {
                gy7 gy7Var5 = (gy7) arrayList.get(i);
                if (gy7Var4 != null) {
                    float f4 = gy7Var4.b;
                    f3 = gy7Var5.b;
                }
                f3 = gy7Var5.b;
                if (f3 <= f) {
                    gy7Var4 = gy7Var5;
                }
                if ((gy7Var3 == null || gy7Var3.b > f3) && f3 >= f) {
                    gy7Var3 = gy7Var5;
                }
            }
            if (gy7Var3 == gy7Var4) {
                gy7Var4 = null;
            }
            if (gy7Var4 == null || gy7Var3 != null) {
                gy7Var = gy7Var3;
                gy7Var2 = gy7Var4;
            } else {
                gy7Var = gy7Var4;
                gy7Var2 = null;
            }
            if (gy7Var == null) {
                return;
            }
            ArrayList arrayList2 = gy7Var.a;
            if (gy7Var2 != null && gy7Var2.a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj = gy7Var2 != null ? gy7Var2.a.get(i2) : null;
                Object obj2 = arrayList2.get(i2);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (gy7Var2 != null) {
                    float f5 = gy7Var2.b;
                    f2 = (f - f5) / (gy7Var.b - f5);
                } else {
                    f2 = 1.0f;
                }
                if (obj2 instanceof iy7) {
                    iy7 iy7Var = (iy7) obj2;
                    iy7 iy7Var2 = (iy7) obj;
                    if (iy7Var2 != null) {
                        float f6 = iy7Var2.a;
                        float N = gl.N(((iy7Var.a - f6) * f2) + f6);
                        float f7 = iy7Var2.b;
                        path.moveTo(N, gl.N(((iy7Var.b - f7) * f2) + f7));
                    } else {
                        path.moveTo(gl.N(iy7Var.a), gl.N(iy7Var.b));
                    }
                } else if (obj2 instanceof hy7) {
                    hy7 hy7Var = (hy7) obj2;
                    hy7 hy7Var2 = (hy7) obj;
                    if (hy7Var2 != null) {
                        float f8 = hy7Var2.a;
                        float N2 = gl.N(((hy7Var.a - f8) * f2) + f8);
                        float f9 = hy7Var2.b;
                        path.lineTo(N2, gl.N(((hy7Var.b - f9) * f2) + f9));
                    } else {
                        path.lineTo(gl.N(hy7Var.a), gl.N(hy7Var.b));
                    }
                } else if (obj2 instanceof fy7) {
                    fy7 fy7Var = (fy7) obj2;
                    fy7 fy7Var2 = (fy7) obj;
                    if (fy7Var2 != null) {
                        float f10 = fy7Var2.c;
                        float N3 = gl.N(((fy7Var.c - f10) * f2) + f10);
                        float f11 = fy7Var2.d;
                        float N4 = gl.N(((fy7Var.d - f11) * f2) + f11);
                        float f12 = fy7Var2.e;
                        float N5 = gl.N(((fy7Var.e - f12) * f2) + f12);
                        float f13 = fy7Var2.f;
                        float N6 = gl.N(((fy7Var.f - f13) * f2) + f13);
                        float f14 = fy7Var2.a;
                        float N7 = gl.N(((fy7Var.a - f14) * f2) + f14);
                        float f15 = fy7Var2.b;
                        path.cubicTo(N3, N4, N5, N6, N7, gl.N(((fy7Var.b - f15) * f2) + f15));
                    } else {
                        path.cubicTo(gl.N(fy7Var.c), gl.N(fy7Var.d), gl.N(fy7Var.e), gl.N(fy7Var.f), gl.N(fy7Var.a), gl.N(fy7Var.b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}

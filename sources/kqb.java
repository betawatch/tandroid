// default package

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class kqb extends Path {
    public final int a = gm.L(10.0f);
    public final float[] b;
    public ArrayList c;
    public ArrayList d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;

    public kqb() {
        this.b = new float[]{r2, r2, r2, r2, 0.0f, 0.0f, 0.0f, 0.0f};
        float L = gm.L(2.0f);
    }

    public static int c(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                i += ((eqb) arrayList.get(i2)).e;
            }
        }
        return i;
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6, ArrayList arrayList) {
        float f7;
        float f8 = f;
        float f9 = f3;
        if (arrayList == null || arrayList.isEmpty()) {
            rewind();
            return;
        }
        float f10 = 0.0f;
        if (Math.abs(this.e - f4) <= 1.0f && Math.abs(this.f - f5) <= 0.01f && Math.abs(this.g - 0.0f) <= 0.1f && Math.abs(this.h - f6) <= 1.0f && Math.abs(this.i - f8) <= 1.0f && Math.abs(this.j - f2) <= 1.0f && Math.abs(this.k - f9) <= 1.0f) {
            ArrayList arrayList2 = this.c;
            if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (((Integer) arrayList2.get(i)).intValue() == (arrayList.get(i) == null ? 0 : ((eqb) arrayList.get(i)).b)) {
                    }
                }
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 == null || arrayList3.size() != arrayList.size()) {
                return;
            }
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                if (((Float) arrayList3.get(i2)).floatValue() != (arrayList.get(i2) == null ? 0.0f : ((eqb) arrayList.get(i2)).a.e(false, ((eqb) arrayList.get(i2)).c))) {
                    return;
                }
            }
        }
        ArrayList arrayList4 = this.c;
        if (arrayList4 == null) {
            this.c = new ArrayList();
        } else {
            arrayList4.clear();
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            i3 = td4.g(arrayList.get(i3) == null ? 0 : ((eqb) arrayList.get(i3)).b, i3, 1, this.c);
        }
        ArrayList arrayList5 = this.d;
        if (arrayList5 == null) {
            this.d = new ArrayList();
        } else {
            arrayList5.clear();
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.d.add(Float.valueOf(arrayList.get(i4) == null ? 0.0f : ((eqb) arrayList.get(i4)).a.e(false, ((eqb) arrayList.get(i4)).c)));
        }
        this.i = f8;
        this.j = f2;
        this.k = f9;
        this.g = 0.0f;
        this.f = f5;
        this.e = f4;
        this.h = f6;
        ArrayList arrayList6 = this.d;
        rewind();
        float round = Math.round(gm.N(3.3333f));
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            if (arrayList.get(i6) != null) {
                i5 = Math.max(i5, ((eqb) arrayList.get(i6)).b);
            }
        }
        int max = Math.max(0, (int) (((f2 - this.a) - f8) / round));
        int min = Math.min(i5 - 1, (int) Math.ceil(((f9 + r13) - f8) / round));
        while (max <= min) {
            float f11 = max;
            float L = (f11 * round) + f8 + gm.L(2.0f);
            float f12 = f10;
            int i7 = 0;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                short s = (arrayList.get(i8) == null || max >= ((eqb) arrayList.get(i8)).b) ? (short) 0 : ((eqb) arrayList.get(i8)).d[max];
                if (f11 < ((Float) arrayList6.get(i8)).floatValue() && max + 1 > ((Float) arrayList6.get(i8)).floatValue()) {
                    s = (short) ((((Float) arrayList6.get(i8)).floatValue() - f11) * s);
                } else if (f11 > ((Float) arrayList6.get(i8)).floatValue()) {
                    s = 0;
                }
                i7 += s;
            }
            float f13 = f5 <= f12 ? f12 : (i7 / f5) * f4 * 0.6f;
            if (L < f2 || L > f9) {
                f13 *= f12;
                if (f13 <= f12) {
                    f7 = f12;
                    max++;
                    f8 = f;
                    f9 = f3;
                    f10 = f7;
                }
            }
            f7 = f12;
            float max2 = Math.max(f13, gm.R1(gm.N(0.66f), gm.N(1.5f), f7));
            RectF rectF = gm.P;
            rectF.set(L, gm.R1(f6 - max2, f6 - ((f4 + max2) / 2.0f), f7), gm.N(1.66f) + L, gm.R1(f6, td4.y(f4, max2, 2.0f, f6), f7));
            addRoundRect(rectF, this.b, Path.Direction.CW);
            max++;
            f8 = f;
            f9 = f3;
            f10 = f7;
        }
    }

    public final void b(float f, float f2, float f3, float f4, long j, float f5, float f6, float f7, eqb eqbVar) {
        ArrayList arrayList;
        float f8 = f;
        float f9 = f2;
        float f10 = f3;
        if (eqbVar == null) {
            rewind();
            return;
        }
        int i = eqbVar.b;
        ln lnVar = eqbVar.a;
        float e = lnVar.e(false, eqbVar.c);
        if (0 == j && Math.abs(this.e - f5) <= 1.0f && Math.abs(this.f - f6) <= 0.01f && Math.abs(this.g - f4) <= 0.1f && Math.abs(this.h - f7) <= 1.0f && Math.abs(this.i - f8) <= 1.0f && Math.abs(this.j - f9) <= 1.0f && Math.abs(this.k - f10) <= 1.0f && (arrayList = this.c) != null && arrayList.size() == 1) {
            ArrayList arrayList2 = this.d;
            if (Math.abs(((arrayList2 == null || arrayList2.isEmpty()) ? 0.0f : ((Float) this.d.get(0)).floatValue()) - e) <= 0.01f) {
                return;
            }
        }
        ArrayList arrayList3 = this.c;
        if (arrayList3 == null) {
            this.c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.c.add(Integer.valueOf(i));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(e));
        this.i = f8;
        this.j = f9;
        this.k = f10;
        this.g = f4;
        this.f = f6;
        this.e = f5;
        this.h = f7;
        float e2 = lnVar.e(false, eqbVar.c);
        rewind();
        float round = Math.round(gm.N(3.3333f));
        int max = Math.max(0, (int) (((f9 - this.a) - f8) / round));
        int min = Math.min(i - 1, (int) Math.ceil(((r13 + f10) - f8) / round));
        while (max <= min) {
            float f11 = max;
            float L = (f11 * round) + f8 + gm.L(2.0f);
            float f12 = f6 <= 0.0f ? 0.0f : (eqbVar.d[max] / f6) * f5 * 0.6f;
            if (f11 < e2 && max + 1 > e2) {
                f12 *= e2 - f11;
            } else if (f11 > e2) {
                f12 = 0.0f;
            }
            if (L < f9 || L > f10) {
                f12 *= f4;
                if (f12 <= 0.0f) {
                    max++;
                    f8 = f;
                    f9 = f2;
                    f10 = f3;
                }
            }
            float max2 = Math.max(f12, gm.R1(gm.N(0.66f), gm.N(1.5f), f4));
            RectF rectF = gm.P;
            rectF.set(L, gm.R1(f7 - max2, f7 - ((f5 + max2) / 2.0f), f4), gm.N(1.66f) + L, gm.R1(f7, td4.y(f5, max2, 2.0f, f7), f4));
            addRoundRect(rectF, this.b, Path.Direction.CW);
            max++;
            f8 = f;
            f9 = f2;
            f10 = f3;
        }
    }
}

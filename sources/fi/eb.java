package fi;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class eb extends Path {
    public final int a = org.telegram.messenger.g0.L(10.0f);
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

    public eb() {
        this.b = new float[]{r1, r1, r1, r1, 0.0f, 0.0f, 0.0f, 0.0f};
        float L = org.telegram.messenger.g0.L(2.0f);
    }

    public static int c(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null) {
                i7 += ((ya) arrayList.get(i10)).e;
            }
        }
        return i7;
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, ArrayList arrayList) {
        float f16;
        float f17 = f10;
        float f18 = f12;
        if (arrayList == null || arrayList.isEmpty()) {
            rewind();
            return;
        }
        float f19 = 0.0f;
        if (Math.abs(this.e - f13) <= 1.0f && Math.abs(this.f - f14) <= 0.01f && Math.abs(this.g - 0.0f) <= 0.1f && Math.abs(this.h - f15) <= 1.0f && Math.abs(this.i - f17) <= 1.0f && Math.abs(this.j - f11) <= 1.0f && Math.abs(this.k - f18) <= 1.0f) {
            ArrayList arrayList2 = this.c;
            if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    if (((Integer) arrayList2.get(i7)).intValue() == (arrayList.get(i7) == null ? 0 : ((ya) arrayList.get(i7)).b)) {
                    }
                }
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 == null || arrayList3.size() != arrayList.size()) {
                return;
            }
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (((Float) arrayList3.get(i10)).floatValue() != (arrayList.get(i10) == null ? 0.0f : ((ya) arrayList.get(i10)).a.e(false, ((ya) arrayList.get(i10)).c))) {
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
        int i11 = 0;
        while (i11 < arrayList.size()) {
            i11 = com.google.android.recaptcha.internal.a.f(arrayList.get(i11) == null ? 0 : ((ya) arrayList.get(i11)).b, i11, 1, this.c);
        }
        ArrayList arrayList5 = this.d;
        if (arrayList5 == null) {
            this.d = new ArrayList();
        } else {
            arrayList5.clear();
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.d.add(Float.valueOf(arrayList.get(i12) == null ? 0.0f : ((ya) arrayList.get(i12)).a.e(false, ((ya) arrayList.get(i12)).c)));
        }
        this.i = f17;
        this.j = f11;
        this.k = f18;
        this.g = 0.0f;
        this.f = f14;
        this.e = f13;
        this.h = f15;
        ArrayList arrayList6 = this.d;
        rewind();
        float round = Math.round(org.telegram.messenger.g0.N(3.3333f));
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            if (arrayList.get(i14) != null) {
                i13 = Math.max(i13, ((ya) arrayList.get(i14)).b);
            }
        }
        int max = Math.max(0, (int) (((f11 - this.a) - f17) / round));
        int min = Math.min(i13 - 1, (int) Math.ceil(((f18 + r13) - f17) / round));
        while (max <= min) {
            float f20 = max;
            float L = (f20 * round) + f17 + org.telegram.messenger.g0.L(2.0f);
            float f21 = f19;
            int i15 = 0;
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                short s5 = (arrayList.get(i16) == null || max >= ((ya) arrayList.get(i16)).b) ? (short) 0 : ((ya) arrayList.get(i16)).d[max];
                if (f20 < ((Float) arrayList6.get(i16)).floatValue() && max + 1 > ((Float) arrayList6.get(i16)).floatValue()) {
                    s5 = (short) ((((Float) arrayList6.get(i16)).floatValue() - f20) * s5);
                } else if (f20 > ((Float) arrayList6.get(i16)).floatValue()) {
                    s5 = 0;
                }
                i15 += s5;
            }
            float f22 = f14 <= f21 ? f21 : (i15 / f14) * f13 * 0.6f;
            if (L < f11 || L > f18) {
                f22 *= f21;
                if (f22 <= f21) {
                    f16 = f21;
                    max++;
                    f17 = f10;
                    f18 = f12;
                    f19 = f16;
                }
            }
            f16 = f21;
            float max2 = Math.max(f22, org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(0.66f), org.telegram.messenger.g0.N(1.5f), f16));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(L, org.telegram.messenger.g0.T1(f15 - max2, f15 - ((f13 + max2) / 2.0f), f16), org.telegram.messenger.g0.N(1.66f) + L, org.telegram.messenger.g0.T1(f15, org.telegram.messenger.k5.y(f13, max2, 2.0f, f15), f16));
            addRoundRect(rectF, this.b, Path.Direction.CW);
            max++;
            f17 = f10;
            f18 = f12;
            f19 = f16;
        }
    }

    public final void b(float f10, float f11, float f12, float f13, long j3, float f14, float f15, float f16, ya yaVar) {
        ArrayList arrayList;
        float f17 = f10;
        float f18 = f11;
        float f19 = f12;
        if (yaVar == null) {
            rewind();
            return;
        }
        int i7 = yaVar.b;
        org.telegram.ui.Components.w5 w5Var = yaVar.a;
        float e10 = w5Var.e(false, yaVar.c);
        if (0 == j3 && Math.abs(this.e - f14) <= 1.0f && Math.abs(this.f - f15) <= 0.01f && Math.abs(this.g - f13) <= 0.1f && Math.abs(this.h - f16) <= 1.0f && Math.abs(this.i - f17) <= 1.0f && Math.abs(this.j - f18) <= 1.0f && Math.abs(this.k - f19) <= 1.0f && (arrayList = this.c) != null && arrayList.size() == 1) {
            ArrayList arrayList2 = this.d;
            if (Math.abs(((arrayList2 == null || arrayList2.isEmpty()) ? 0.0f : ((Float) this.d.get(0)).floatValue()) - e10) <= 0.01f) {
                return;
            }
        }
        ArrayList arrayList3 = this.c;
        if (arrayList3 == null) {
            this.c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.c.add(Integer.valueOf(i7));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(e10));
        this.i = f17;
        this.j = f18;
        this.k = f19;
        this.g = f13;
        this.f = f15;
        this.e = f14;
        this.h = f16;
        float e11 = w5Var.e(false, yaVar.c);
        rewind();
        float round = Math.round(org.telegram.messenger.g0.N(3.3333f));
        int max = Math.max(0, (int) (((f18 - this.a) - f17) / round));
        int min = Math.min(i7 - 1, (int) Math.ceil(((r13 + f19) - f17) / round));
        while (max <= min) {
            float f20 = max;
            float L = (f20 * round) + f17 + org.telegram.messenger.g0.L(2.0f);
            float f21 = f15 <= 0.0f ? 0.0f : (yaVar.d[max] / f15) * f14 * 0.6f;
            if (f20 < e11 && max + 1 > e11) {
                f21 *= e11 - f20;
            } else if (f20 > e11) {
                f21 = 0.0f;
            }
            if (L < f18 || L > f19) {
                f21 *= f13;
                if (f21 <= 0.0f) {
                    max++;
                    f17 = f10;
                    f18 = f11;
                    f19 = f12;
                }
            }
            float max2 = Math.max(f21, org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(0.66f), org.telegram.messenger.g0.N(1.5f), f13));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(L, org.telegram.messenger.g0.T1(f16 - max2, f16 - ((f14 + max2) / 2.0f), f13), org.telegram.messenger.g0.N(1.66f) + L, org.telegram.messenger.g0.T1(f16, org.telegram.messenger.k5.y(f14, max2, 2.0f, f16), f13));
            addRoundRect(rectF, this.b, Path.Direction.CW);
            max++;
            f17 = f10;
            f18 = f11;
            f19 = f12;
        }
    }
}

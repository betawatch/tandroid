package di;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class yc extends Path {
    public final int a = AndroidUtilities.dp(10.0f);
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

    public yc() {
        this.b = new float[]{r1, r1, r1, r1, 0.0f, 0.0f, 0.0f, 0.0f};
        float dp = AndroidUtilities.dp(2.0f);
    }

    public static int c(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) != null) {
                i10 += ((sc) arrayList.get(i11)).e;
            }
        }
        return i10;
    }

    public final void a(float f7, float f10, float f11, float f12, float f13, float f14, ArrayList arrayList) {
        float f15 = f7;
        float f16 = f11;
        if (arrayList == null || arrayList.isEmpty()) {
            rewind();
            return;
        }
        if (Math.abs(this.e - f12) <= 1.0f && Math.abs(this.f - f13) <= 0.01f && Math.abs(this.g - 0.0f) <= 0.1f && Math.abs(this.h - f14) <= 1.0f && Math.abs(this.i - f15) <= 1.0f && Math.abs(this.j - f10) <= 1.0f && Math.abs(this.k - f16) <= 1.0f) {
            ArrayList arrayList2 = this.c;
            if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (((Integer) arrayList2.get(i10)).intValue() == (arrayList.get(i10) == null ? 0 : ((sc) arrayList.get(i10)).b)) {
                    }
                }
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 == null || arrayList3.size() != arrayList.size()) {
                return;
            }
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (((Float) arrayList3.get(i11)).floatValue() != (arrayList.get(i11) == null ? 0.0f : ((sc) arrayList.get(i11)).a.d(((sc) arrayList.get(i11)).c, false))) {
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
        int i12 = 0;
        while (i12 < arrayList.size()) {
            i12 = com.google.android.gms.internal.vision.e2.e(arrayList.get(i12) == null ? 0 : ((sc) arrayList.get(i12)).b, i12, 1, this.c);
        }
        ArrayList arrayList5 = this.d;
        if (arrayList5 == null) {
            this.d = new ArrayList();
        } else {
            arrayList5.clear();
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.d.add(Float.valueOf(arrayList.get(i13) == null ? 0.0f : ((sc) arrayList.get(i13)).a.d(((sc) arrayList.get(i13)).c, false)));
        }
        this.i = f15;
        this.j = f10;
        this.k = f16;
        this.g = 0.0f;
        this.f = f13;
        this.e = f12;
        this.h = f14;
        ArrayList arrayList6 = this.d;
        rewind();
        float round = Math.round(AndroidUtilities.dpf2(3.3333f));
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            if (arrayList.get(i15) != null) {
                i14 = Math.max(i14, ((sc) arrayList.get(i15)).b);
            }
        }
        int max = Math.max(0, (int) (((f10 - this.a) - f15) / round));
        int min = Math.min(i14 - 1, (int) Math.ceil(((f16 + r13) - f15) / round));
        while (max <= min) {
            float f17 = max;
            float dp = (f17 * round) + f15 + AndroidUtilities.dp(2.0f);
            int i16 = 0;
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                short s10 = (arrayList.get(i17) == null || max >= ((sc) arrayList.get(i17)).b) ? (short) 0 : ((sc) arrayList.get(i17)).d[max];
                if (f17 < ((Float) arrayList6.get(i17)).floatValue() && max + 1 > ((Float) arrayList6.get(i17)).floatValue()) {
                    s10 = (short) ((((Float) arrayList6.get(i17)).floatValue() - f17) * s10);
                } else if (f17 > ((Float) arrayList6.get(i17)).floatValue()) {
                    s10 = 0;
                }
                i16 += s10;
            }
            float f18 = f13 <= 0.0f ? 0.0f : (i16 / f13) * f12 * 0.6f;
            if (dp < f10 || dp > f16) {
                f18 *= 0.0f;
                if (f18 <= 0.0f) {
                    max++;
                    f15 = f7;
                    f16 = f11;
                }
            }
            float max2 = Math.max(f18, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), 0.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(dp, AndroidUtilities.lerp(f14 - max2, f14 - ((f12 + max2) / 2.0f), 0.0f), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f14, org.telegram.messenger.w1.y(f12, max2, 2.0f, f14), 0.0f));
            addRoundRect(rectF, this.b, Path.Direction.CW);
            max++;
            f15 = f7;
            f16 = f11;
        }
    }

    public final void b(float f7, float f10, float f11, float f12, long j3, float f13, float f14, float f15, sc scVar) {
        ArrayList arrayList;
        float f16 = f7;
        float f17 = f10;
        float f18 = f11;
        if (scVar == null) {
            rewind();
            return;
        }
        int i10 = scVar.b;
        org.telegram.ui.Components.e6 e6Var = scVar.a;
        float d = e6Var.d(scVar.c, false);
        if (0 == j3 && Math.abs(this.e - f13) <= 1.0f && Math.abs(this.f - f14) <= 0.01f && Math.abs(this.g - f12) <= 0.1f && Math.abs(this.h - f15) <= 1.0f && Math.abs(this.i - f16) <= 1.0f && Math.abs(this.j - f17) <= 1.0f && Math.abs(this.k - f18) <= 1.0f && (arrayList = this.c) != null && arrayList.size() == 1) {
            ArrayList arrayList2 = this.d;
            if (Math.abs(((arrayList2 == null || arrayList2.isEmpty()) ? 0.0f : ((Float) this.d.get(0)).floatValue()) - d) <= 0.01f) {
                return;
            }
        }
        ArrayList arrayList3 = this.c;
        if (arrayList3 == null) {
            this.c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.c.add(Integer.valueOf(i10));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(d));
        this.i = f16;
        this.j = f17;
        this.k = f18;
        this.g = f12;
        this.f = f14;
        this.e = f13;
        this.h = f15;
        float d10 = e6Var.d(scVar.c, false);
        rewind();
        float round = Math.round(AndroidUtilities.dpf2(3.3333f));
        int max = Math.max(0, (int) (((f17 - this.a) - f16) / round));
        int min = Math.min(i10 - 1, (int) Math.ceil(((r13 + f18) - f16) / round));
        while (max <= min) {
            float f19 = max;
            float dp = (f19 * round) + f16 + AndroidUtilities.dp(2.0f);
            float f20 = f14 <= 0.0f ? 0.0f : (scVar.d[max] / f14) * f13 * 0.6f;
            if (f19 < d10 && max + 1 > d10) {
                f20 *= d10 - f19;
            } else if (f19 > d10) {
                f20 = 0.0f;
            }
            if (dp < f17 || dp > f18) {
                f20 *= f12;
                if (f20 <= 0.0f) {
                    max++;
                    f16 = f7;
                    f17 = f10;
                    f18 = f11;
                }
            }
            float max2 = Math.max(f20, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f12));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(dp, AndroidUtilities.lerp(f15 - max2, f15 - ((f13 + max2) / 2.0f), f12), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f15, org.telegram.messenger.w1.y(f13, max2, 2.0f, f15), f12));
            addRoundRect(rectF, this.b, Path.Direction.CW);
            max++;
            f16 = f7;
            f17 = f10;
            f18 = f11;
        }
    }
}

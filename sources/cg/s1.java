package cg;

import android.graphics.RectF;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s1 {
    public final l a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public boolean l;

    public s1(l lVar) {
        this.a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.a;
        if (lVar.o() == 4) {
            float f10 = this.b;
            float f11 = this.k;
            float f12 = this.c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.e);
            rectF.union(this.i, this.j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f13 = this.b;
            float f14 = max * 1.42f;
            float f15 = this.c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (lVar.o() == 3) {
                rectF.union(this.i, this.j);
            }
        }
        float f16 = (-this.f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
